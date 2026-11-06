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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class ChatActivityEnterView extends FrameLayout implements org.telegram.messenger.ls, qt0, vv0, mw0, te.b, org.telegram.ui.ActionBar.a6 {
    public static final /* synthetic */ int s5 = 0;
    public boolean A0;
    public final ud A1;
    public int A2;
    public boolean A3;
    public boolean A4;
    public final HashMap B0;
    public final ImageView B1;
    public final boolean B2;
    public AnimatorSet B3;
    public final Paint B4;
    public boolean C0;
    public org.telegram.messenger.au C1;
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
    public xe E0;
    public TL_iv.RichMessage E1;
    public float E2;
    public boolean E3;
    public boolean E4;
    public float F;
    public final eg F0;
    public ge F1;
    public boolean F2;
    public AnimatedArrowDrawable F3;
    public final ad F4;
    public float G;
    public int G0;
    public View G1;
    public int G2;
    public boolean G3;
    public org.telegram.ui.ActionBar.z0 G4;
    public float H;
    public ad H0;
    public jf H1;
    public boolean H2;
    public final je H3;
    public ArrayList H4;
    public float I;
    public final jh.h I0;
    public final ImageView I1;
    public boolean I2;
    public boolean I3;
    public boolean I4;
    public boolean J;
    public final ge J0;
    public ie J1;
    public boolean J2;
    public boolean J3;
    public View J4;
    public TLRPC.UserFull K;
    public int K0;
    public ke K1;
    public boolean K2;
    public final rf K3;
    public boolean K4;
    public fi.m3 L;
    public ue L0;
    public boolean L1;
    public int L2;
    public final h2.f L3;
    public boolean L4;
    public fi.m3 M;
    public long M0;
    public AnimatorSet M1;
    public boolean M2;
    public final Paint M3;
    public boolean M4;
    public fi.m3 N;
    public te N0;
    public RecordCircle N1;
    public final int[] N2;
    public Drawable N3;
    public ad N4;
    public boolean O;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout O0;
    public ag O1;
    public final Activity O2;
    public Drawable O3;
    public final wp[] O4;
    public boolean P;
    public final ImageView P0;
    public final fe P1;
    public final org.telegram.ui.an P2;
    public Drawable P3;
    public int P4;
    public int Q;
    public final wd Q0;
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
    public ke S0;
    public ad S1;
    public int S2;
    public final RectF S3;
    public long S4;
    public int T;
    public boolean T0;
    public int T1;
    public org.telegram.messenger.ij T2;
    public final Rect T3;
    public int T4;
    public org.telegram.ui.ActionBar.i1 U;
    public mf U0;
    public xj0 U1;
    public org.telegram.messenger.ij U2;
    public final Rect U3;
    public int U4;
    public ad V;
    public AnimatorSet V0;
    public Editable V1;
    public org.telegram.ui.qm V2;
    public Drawable V3;
    public boolean V4;
    public f W;
    public boolean W0;
    public boolean W1;
    public org.telegram.messenger.ij W2;
    public final org.telegram.ui.ActionBar.f6 W3;
    public boolean W4;
    public boolean X0;
    public boolean X1;
    public TLRPC.WebPage X2;
    public final boolean X3;
    public org.telegram.ui.Cells.z5 X4;
    public fg Y0;
    public boolean Y1;
    public boolean Y2;
    public final je Y3;
    public k60 Y4;
    public final de Z0;
    public org.telegram.messenger.ij Z1;
    public wf Z2;
    public final td Z3;
    public int Z4;
    public int a;
    public boolean a0;
    public boolean a1;
    public boolean a2;
    public of a3;
    public final td a4;
    public int a5;
    public boolean b;
    public NumberTextView b0;
    public final ee b1;
    public TL_account.TL_businessChatLink b2;
    public TLRPC.TL_document b3;
    public final td b4;
    public a0.h b5;
    public org.telegram.ui.ActionBar.z0 c;
    public int c0;
    public boolean c1;
    public sf c2;
    public String c3;
    public final td c4;
    public final Paint c5;
    public LinearLayout d;
    public int d0;
    public di.a4 d1;
    public TLRPC.ChatFull d2;
    public org.telegram.messenger.ij d3;
    public final td d4;
    public final LinearGradient d5;
    public CharSequence e;
    public uq e0;
    public ud e1;
    public boolean e2;
    public org.telegram.messenger.j20 e3;
    public boolean e4;
    public final Matrix e5;
    public String f;
    public Runnable f0;
    public h61 f1;
    public int f2;
    public boolean f3;
    public long f4;
    public final w5 f5;
    public boolean g0;
    public ch0 g1;
    public boolean g2;
    public boolean g3;
    public float g4;
    public final w5 g5;
    public float h;
    public boolean h0;
    public ji0 h1;
    public boolean h2;
    public boolean h3;
    public float h4;
    public rh.e h5;
    public String i0;
    public long i1;
    public boolean i2;
    public org.telegram.messenger.ij i3;
    public float i4;
    public lh.h i5;
    public String j0;
    public boolean j1;
    public boolean j2;
    public TL_keyboard.KeyboardButtonProto j3;
    public float j4;
    public final te.c j5;
    public hi.r3 k0;
    public SlideTextView k1;
    public boolean k2;
    public boolean k3;
    public float k4;
    public final te.a k5;
    public hi.y l0;
    public cg l1;
    public boolean l2;
    public boolean l3;
    public float l4;
    public final te.a l5;
    public ve m0;
    public final rt0 m1;
    public org.telegram.messenger.ij m2;
    public boolean m3;
    public float m4;
    public final te.a m5;
    public float n;
    public hi.x n0;
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
    public cn0 p0;
    public final bi.t p1;
    public boolean p2;
    public boolean p3;
    public float p4;
    public boolean p5;
    public ne q0;
    public ViewPropertyAnimator q1;
    public PowerManager.WakeLock q2;
    public boolean q3;
    public float q4;
    public int q5;
    public float r;
    public rd r0;
    public final kg.k r1;
    public AnimatorSet r2;
    public final je r3;
    public boolean r4;
    public int r5;
    public float s;
    public int s0;
    public final org.telegram.ui.ActionBar.u2 s1;
    public AnimatorSet s2;
    public final qe s3;
    public boolean s4;
    public int t0;
    public final ImageView t1;
    public AnimatorSet t2;
    public final org.telegram.ui.Cells.g1 t3;
    public int t4;
    public ad u0;
    public final ImageView u1;
    public AnimatorSet u2;
    public final bf u3;
    public long u4;
    public ValueAnimator v0;
    public float v1;
    public int v2;
    public final ef v3;
    public boolean v4;
    public boolean w;
    public float w0;
    public ImageView w1;
    public int w2;
    public final Paint w3;
    public ValueAnimator w4;
    public Runnable x;
    public boolean x0;
    public ke x1;
    public int x2;
    public boolean x3;
    public boolean x4;
    public float y;
    public boolean y0;
    public final ud y1;
    public int y2;
    public boolean y3;
    public boolean y4;
    public boolean z0;
    public final ud z1;
    public boolean z2;
    public boolean z3;
    public boolean z4;

    /* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
        public final r9 h;
        public final r9 n;
        public final float r;
        public final float s;
        public final RectF w;
        public boolean x;
        public final bg y;

        public RecordCircle(Context context) {
            super(context);
            r9 r9Var = new r9(11, 360928);
            this.h = r9Var;
            r9 r9Var2 = new r9(12, 360928);
            this.n = r9Var2;
            this.r = org.telegram.messenger.g0.N(41.0f);
            this.s = org.telegram.messenger.g0.L(30.0f);
            this.w = new RectF();
            this.H = 0.0f;
            this.I = true;
            bg bgVar = new bg(this, this);
            this.y = bgVar;
            r0.i0.j(this, bgVar);
            r9Var.a = org.telegram.messenger.g0.L(47.0f);
            r9Var.b = org.telegram.messenger.g0.L(55.0f);
            r9Var.b();
            r9Var2.a = org.telegram.messenger.g0.L(47.0f);
            r9Var2.b = org.telegram.messenger.g0.L(55.0f);
            r9Var2.b();
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
            int i7 = org.telegram.ui.ActionBar.k6.Qf;
            org.telegram.ui.ActionBar.f6 f6Var = chatActivityEnterView.W3;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.y(this, drawable, i7, f6Var, mode);
            chatActivityEnterView.Q3 = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            org.telegram.ui.ActionBar.r6.y(this, chatActivityEnterView.Q3, i7, chatActivityEnterView.W3, mode);
            chatActivityEnterView.R3 = getResources().getDrawable(R.drawable.attach_send).mutate();
            org.telegram.ui.ActionBar.r6.y(this, chatActivityEnterView.R3, i7, chatActivityEnterView.W3, mode);
            chatActivityEnterView.N3 = getResources().getDrawable(R.drawable.input_mic).mutate();
            Drawable drawable2 = chatActivityEnterView.N3;
            int i10 = org.telegram.ui.ActionBar.k6.Kl;
            org.telegram.ui.ActionBar.r6.y(this, drawable2, i10, chatActivityEnterView.W3, mode);
            chatActivityEnterView.O3 = getResources().getDrawable(R.drawable.input_video).mutate();
            org.telegram.ui.ActionBar.r6.y(this, chatActivityEnterView.O3, i10, chatActivityEnterView.W3, mode);
        }

        public final void b(Canvas canvas, Drawable drawable, Drawable drawable2, float f10, int i7) {
            a();
            if (f10 != 0.0f && f10 != 1.0f && drawable2 != null) {
                canvas.save();
                canvas.scale(f10, f10, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                float f11 = i7;
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
            boolean z9 = chatActivityEnterView.r4;
            if (z9 && chatActivityEnterView.j4 == 1.0f) {
                chatActivityEnterView.b1.setAlpha(1.0f);
                setVisibility(8);
            } else if (z9 && chatActivityEnterView.j4 < 1.0f) {
                drawable.setAlpha(org.telegram.messenger.qs.e4);
                drawable.draw(canvas);
            } else {
                if (z9) {
                    return;
                }
                drawable.setAlpha(i7);
                drawable.draw(canvas);
            }
        }

        public final void c(boolean z9) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!z9) {
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
            chatActivityEnterView.w0();
            chatActivityEnterView.m4 = 0.0f;
            chatActivityEnterView.h4 = 0.0f;
            chatActivityEnterView.g4 = 0.0f;
            chatActivityEnterView.e4 = false;
            this.f = 0.0f;
            chatActivityEnterView.r4 = false;
            ag agVar = chatActivityEnterView.O1;
            if (agVar != null) {
                agVar.invalidate();
            }
        }

        public final void d() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.s4 = false;
            invalidate();
            ag agVar = chatActivityEnterView.O1;
            if (agVar != null) {
                agVar.invalidate();
            }
        }

        @Override // android.view.View
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            return super.dispatchHoverEvent(motionEvent) || this.y.f(motionEvent);
        }

        public final void e() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.M3;
            int i7 = org.telegram.ui.ActionBar.k6.Rf;
            paint.setColor(chatActivityEnterView.f0(i7));
            this.h.d.setColor(i0.a.o(chatActivityEnterView.f0(i7), 38));
            this.n.d.setColor(i0.a.o(chatActivityEnterView.f0(i7), 76));
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
            ag agVar = ChatActivityEnterView.this.O1;
            if (agVar != null) {
                agVar.invalidate();
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
            int i7;
            Drawable drawable3;
            Paint paint2;
            float f21;
            Drawable drawable4;
            ji0 ji0Var;
            float f22;
            float f23;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Rect rect = chatActivityEnterView.T3;
            Paint paint3 = chatActivityEnterView.M3;
            if (this.N) {
                return;
            }
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.M(26.0f);
            int L = (int) (org.telegram.messenger.g0.L(170.0f) + 0.0f);
            this.J = chatActivityEnterView.t4 + measuredWidth;
            float f24 = L;
            this.K = f24;
            float f25 = chatActivityEnterView.h4;
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
            float interpolation2 = ((this.s * this.a) + this.r) * f26 * (chatActivityEnterView.r4 ? xq.g.getInterpolation(f11 - chatActivityEnterView.j4) * 0.7f : (chatActivityEnterView.j4 * 0.3f) + 0.7f);
            this.e = 0.0f;
            float f31 = chatActivityEnterView.p4;
            if (f31 == 0.0f || chatActivityEnterView.h1 == null) {
                float f32 = chatActivityEnterView.m4;
                if (f32 == 0.0f) {
                    f12 = 0.0f;
                    f13 = 0.0f;
                    f14 = 0.0f;
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
                    e10 = org.telegram.messenger.rc.e(360928);
                    r9 r9Var = this.n;
                    r9 r9Var2 = this.h;
                    if (e10) {
                    }
                    this.d = System.currentTimeMillis();
                    float f33 = chatActivityEnterView.j4;
                    if (f33 > f16) {
                    }
                    if (org.telegram.messenger.rc.e(360928)) {
                        if (this.I) {
                        }
                        if (!this.M) {
                        }
                    }
                    float max2 = (chatActivityEnterView.r4 || chatActivityEnterView.j4 >= 1.0f) ? f17 : Math.max(f17, org.telegram.messenger.g0.L(19.0f));
                    if (this.M) {
                    }
                    f21 = 1.0f;
                    if (chatActivityEnterView.h4 != f21) {
                    }
                    this.L = max2;
                }
                float f34 = f32 > 0.6f ? 1.0f : f32 / 0.6f;
                if (!chatActivityEnterView.g0) {
                    f32 = Math.max(0.0f, (f32 - 0.6f) / 0.4f);
                }
                xq xqVar = xq.j;
                interpolation = xqVar.getInterpolation(f34);
                float interpolation3 = xqVar.getInterpolation(f32);
                interpolation2 = (1.0f - interpolation3) * ((org.telegram.messenger.g0.L(16.0f) * interpolation) + interpolation2);
                if (org.telegram.messenger.rc.e(360928)) {
                    float f35 = chatActivityEnterView.m4;
                    if (f35 > 0.6f) {
                        f14 = interpolation;
                        max = Math.max(0.0f, 1.0f - ((f35 - 0.6f) / 0.4f));
                        f13 = interpolation3;
                        f12 = 0.0f;
                        if (chatActivityEnterView.r4) {
                            float f36 = chatActivityEnterView.j4;
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
                        if (chatActivityEnterView.s4) {
                            float f37 = this.f;
                            if (f37 != 1.0f) {
                                f20 = 12.0f;
                                float f38 = (currentTimeMillis / 150.0f) + f37;
                                this.f = f38;
                                if (f38 > 1.0f) {
                                    this.f = 1.0f;
                                }
                                drawable52 = chatActivityEnterView.c1 ? chatActivityEnterView.Q3 : chatActivityEnterView.P3;
                            } else {
                                f20 = 12.0f;
                            }
                            Drawable drawable6 = drawable52;
                            drawable = chatActivityEnterView.R3;
                            f19 = f13;
                            f18 = f12;
                            paint = paint3;
                            f17 = interpolation2;
                            rect.set(org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.y(2, L, drawable), org.telegram.ui.Cells.f1.w(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.f(2, L, drawable));
                            if (drawable6 != null) {
                                drawable6.setBounds(org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable6), org.telegram.ui.Cells.f1.y(2, L, drawable6), org.telegram.ui.Cells.f1.w(2, measuredWidth, drawable6), org.telegram.ui.Cells.f1.f(2, L, drawable6));
                            }
                            drawable2 = drawable6;
                        } else {
                            f17 = interpolation2;
                            f18 = f12;
                            paint = paint3;
                            f19 = f13;
                            f20 = 12.0f;
                            drawable = chatActivityEnterView.c1 ? chatActivityEnterView.Q3 : chatActivityEnterView.P3;
                            rect.set(measuredWidth - org.telegram.messenger.g0.L(12.0f), L - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + measuredWidth, org.telegram.messenger.g0.L(12.0f) + L);
                            drawable2 = null;
                        }
                        drawable.setBounds(rect);
                        if (this.x) {
                            float f39 = chatActivityEnterView.o4 + 0.01f;
                            chatActivityEnterView.o4 = f39;
                            if (f39 > 1.0f) {
                                this.x = false;
                                chatActivityEnterView.o4 = 1.0f;
                            }
                        } else {
                            float f40 = chatActivityEnterView.o4 - 0.01f;
                            chatActivityEnterView.o4 = f40;
                            if (f40 < f15) {
                                this.x = true;
                                chatActivityEnterView.o4 = f15;
                            }
                        }
                        e10 = org.telegram.messenger.rc.e(360928);
                        r9 r9Var3 = this.n;
                        r9 r9Var22 = this.h;
                        if (e10) {
                            r9Var22.a = org.telegram.messenger.g0.L(47.0f);
                            r9Var22.b = (org.telegram.messenger.g0.L(15.0f) * 0.6f) + org.telegram.messenger.g0.L(47.0f);
                            r9Var3.a = org.telegram.messenger.g0.L(50.0f);
                            r9Var3.b = (org.telegram.messenger.g0.L(f20) * 0.6f) + org.telegram.messenger.g0.L(50.0f);
                            r9Var3.f(currentTimeMillis);
                            r9Var3.e(r9Var3.t, 1.01f);
                            r9Var22.f(currentTimeMillis);
                            r9Var22.e(r9Var22.t, 1.02f);
                        }
                        this.d = System.currentTimeMillis();
                        float f332 = chatActivityEnterView.j4;
                        float f41 = f332 > f16 ? 1.0f : f332 / f16;
                        if (org.telegram.messenger.rc.e(360928) && f18 != 1.0f && f19 < 0.4f && f41 > 0.0f && !chatActivityEnterView.r4) {
                            if (this.I) {
                                float f42 = this.H;
                                if (f42 != 1.0f) {
                                    float f43 = f42 + 0.04f;
                                    this.H = f43;
                                    if (f43 > 1.0f) {
                                        this.H = 1.0f;
                                    }
                                }
                            }
                            if (!this.M) {
                                float interpolation4 = xq.g.getInterpolation(this.H);
                                canvas.save();
                                float f44 = 1.0f - f14;
                                float B = com.google.android.recaptcha.internal.a.B(r9Var3.t, 1.4f, 0.878f, com.google.android.recaptcha.internal.a.D(chatActivityEnterView.h4, f44, f41, interpolation4));
                                canvas.scale(B, B, chatActivityEnterView.t4 + measuredWidth, f24);
                                r9Var3.a(chatActivityEnterView.t4 + measuredWidth, f24, canvas, r9Var3.d);
                                canvas.restore();
                                float D = ((r9Var22.t * 1.4f) + 0.926f) * com.google.android.recaptcha.internal.a.D(chatActivityEnterView.h4, f44, f41, interpolation4);
                                canvas.save();
                                canvas.scale(D, D, chatActivityEnterView.t4 + measuredWidth, f24);
                                r9Var22.a(chatActivityEnterView.t4 + measuredWidth, f24, canvas, r9Var22.d);
                                canvas.restore();
                            }
                        }
                        float max22 = (chatActivityEnterView.r4 || chatActivityEnterView.j4 >= 1.0f) ? f17 : Math.max(f17, org.telegram.messenger.g0.L(19.0f));
                        if (this.M) {
                            i7 = measuredWidth;
                            drawable3 = drawable;
                            paint2 = paint;
                        } else {
                            paint2 = paint;
                            paint2.setAlpha((int) (this.D * max));
                            if (chatActivityEnterView.h4 == 1.0f) {
                                if (chatActivityEnterView.p4 == 0.0f) {
                                    drawable4 = drawable2;
                                    i7 = measuredWidth;
                                    f21 = 1.0f;
                                    canvas.drawCircle(i7 + chatActivityEnterView.t4, f24, max22, paint2);
                                } else if (chatActivityEnterView.c1 || this.e <= 0.0f || (ji0Var = chatActivityEnterView.h1) == null) {
                                    drawable4 = drawable2;
                                    i7 = measuredWidth;
                                    f21 = 1.0f;
                                    canvas.drawCircle(i7 + chatActivityEnterView.t4, f24, (1.0f - this.e) * max22, paint2);
                                } else {
                                    float f45 = f24 + max22;
                                    float f46 = f24 - max22;
                                    float f47 = chatActivityEnterView.t4 + measuredWidth;
                                    float f48 = f47 + max22;
                                    float f49 = f47 - max22;
                                    drawable4 = drawable2;
                                    int i10 = 0;
                                    int i11 = 0;
                                    for (View view = (View) ji0Var.getParent(); view != getParent(); view = (View) view.getParent()) {
                                        i11 = (int) (view.getY() + i11);
                                        i10 = (int) (view.getX() + i10);
                                    }
                                    float f50 = i11;
                                    float y10 = (ji0Var.getY() + f50) - getY();
                                    float y11 = ((ji0Var.getY() + ji0Var.getMeasuredHeight()) + f50) - getY();
                                    float f51 = i10;
                                    float x10 = (((ji0Var.getX() + ji0Var.getMeasuredWidth()) + f51) - getX()) - chatActivityEnterView.I;
                                    float x11 = ((ji0Var.getX() + f51) - getX()) + chatActivityEnterView.I;
                                    i7 = measuredWidth;
                                    if (!chatActivityEnterView.c1) {
                                        ji0Var.getMeasuredHeight();
                                    }
                                    float T1 = org.telegram.messenger.g0.T1(f46, y10, this.e);
                                    float T12 = org.telegram.messenger.g0.T1(f45, y11, this.e);
                                    float T13 = org.telegram.messenger.g0.T1(f49, x11, this.e);
                                    float T14 = org.telegram.messenger.g0.T1(f48, x10, this.e);
                                    RectF rectF = this.w;
                                    rectF.set(T13, T1, T14, T12);
                                    chatActivityEnterView.h1.a(canvas, rectF);
                                    f21 = 1.0f;
                                }
                                canvas.save();
                                canvas.translate(chatActivityEnterView.t4, 0.0f);
                                drawable3 = drawable;
                                drawable2 = drawable4;
                                b(canvas, drawable3, drawable2, this.f, (int) org.telegram.messenger.k5.A(f21, f18, f21 - f19, 255.0f));
                                canvas.restore();
                                if (chatActivityEnterView.h4 != f21) {
                                    canvas.drawCircle(i7 + chatActivityEnterView.t4, f24, max22, paint2);
                                    float f52 = chatActivityEnterView.r4 ? f21 - chatActivityEnterView.j4 : f21;
                                    canvas.save();
                                    canvas.translate(chatActivityEnterView.t4, 0.0f);
                                    b(canvas, drawable3, drawable2, this.f, (int) (f52 * 255.0f));
                                    canvas.restore();
                                }
                                this.L = max22;
                            }
                            i7 = measuredWidth;
                            drawable3 = drawable;
                        }
                        f21 = 1.0f;
                        if (chatActivityEnterView.h4 != f21) {
                        }
                        this.L = max22;
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
                this.e = Math.max(0.0f, ((chatActivityEnterView.p4 - f22) - f10) / 0.37f);
                xq xqVar2 = xq.j;
                interpolation = xqVar2.getInterpolation(f23);
                f12 = xqVar2.getInterpolation(max3);
                this.e = xqVar2.getInterpolation(this.e);
                float L2 = (org.telegram.messenger.g0.L(16.0f) * interpolation) + interpolation2;
                float L3 = org.telegram.messenger.g0.L(8.0f);
                interpolation2 = com.google.android.recaptcha.internal.a.z(f11, f12, L2 - L3, L3);
                f13 = 0.0f;
            }
            f14 = interpolation;
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
            e10 = org.telegram.messenger.rc.e(360928);
            r9 r9Var32 = this.n;
            r9 r9Var222 = this.h;
            if (e10) {
            }
            this.d = System.currentTimeMillis();
            float f3322 = chatActivityEnterView.j4;
            if (f3322 > f16) {
            }
            if (org.telegram.messenger.rc.e(360928)) {
            }
            float max222 = (chatActivityEnterView.r4 || chatActivityEnterView.j4 >= 1.0f) ? f17 : Math.max(f17, org.telegram.messenger.g0.L(19.0f));
            if (this.M) {
            }
            f21 = 1.0f;
            if (chatActivityEnterView.h4 != f21) {
            }
            this.L = max222;
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

        public void setControlsScale(float f10) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.i4 = f10;
            ag agVar = chatActivityEnterView.O1;
            if (agVar != null) {
                agVar.invalidate();
            }
        }

        public void setScale(float f10) {
            ChatActivityEnterView.this.h4 = f10;
            invalidate();
        }

        public void setTransformToSeekbar(float f10) {
            ChatActivityEnterView.this.p4 = f10;
            invalidate();
        }
    }

    /* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
            boolean z9 = org.telegram.messenger.g0.q.x <= org.telegram.messenger.g0.L(320.0f);
            this.N = z9;
            TextPaint textPaint = new TextPaint(1);
            this.a = textPaint;
            textPaint.setTextSize(org.telegram.messenger.g0.L(z9 ? 13.0f : 15.0f));
            TextPaint textPaint2 = new TextPaint(1);
            this.b = textPaint2;
            textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
            textPaint2.setTypeface(org.telegram.messenger.g0.o());
            int i7 = org.telegram.ui.ActionBar.k6.Kl;
            int i10 = ChatActivityEnterView.s5;
            paint.setColor(ChatActivityEnterView.this.f0(i7));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.N(z9 ? 1.0f : 1.6f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String M0 = org.telegram.messenger.hd.M0(2131745314, null);
            this.d = M0;
            String upperCase = org.telegram.messenger.hd.M0(2131752589, "Cancel").toUpperCase();
            this.e = upperCase;
            this.E = M0.indexOf(upperCase);
            a();
        }

        public final void a() {
            int i7 = org.telegram.ui.ActionBar.k6.bg;
            int i10 = ChatActivityEnterView.s5;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int f02 = chatActivityEnterView.f0(i7);
            this.a.setColor(f02);
            int i11 = org.telegram.ui.ActionBar.k6.ag;
            int f03 = chatActivityEnterView.f0(i11);
            this.b.setColor(f03);
            this.s = r2.getAlpha();
            this.w = r4.getAlpha();
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(60.0f), 0, i0.a.o(chatActivityEnterView.f0(i11), 26));
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
            float f10;
            float f11;
            float f12;
            float f13;
            if (this.G == null || (staticLayout = this.H) == null) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.N1 == null) {
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
            boolean z9 = this.N;
            if (z9) {
                this.x = org.telegram.messenger.g0.L(16.0f);
            } else {
                long currentTimeMillis = System.currentTimeMillis() - this.D;
                this.D = System.currentTimeMillis();
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
            int i7 = this.E;
            boolean z10 = i7 >= 0;
            int L4 = org.telegram.messenger.g0.L(5.0f) + ((int) ((getMeasuredWidth() - this.f) / 2.0f));
            int measuredWidth = (int) ((getMeasuredWidth() - this.h) / 2.0f);
            float primaryHorizontal = z10 ? this.G.getPrimaryHorizontal(i7) : 0.0f;
            if (z10) {
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
            float L6 = z10 ? 0.0f : this.n * org.telegram.messenger.g0.L(12.0f);
            if (this.n != 1.0f) {
                f12 = 12.0f;
                int translationX = (int) ((chatActivityEnterView.N1.getTranslationX() * 0.3f) + ((1.0f - this.r) * ((-getMeasuredWidth()) / 4)));
                canvas.save();
                fg fgVar = chatActivityEnterView.Y0;
                f13 = 2.0f;
                canvas.clipRect((fgVar == null ? 0.0f : fgVar.getLeftProperty()) + org.telegram.messenger.g0.L(4.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.save();
                int i10 = (int) L5;
                canvas.translate((i10 - org.telegram.messenger.g0.L(z9 ? 7.0f : 10.0f)) + translationX, L6);
                canvas.drawPath(this.F, paint);
                canvas.restore();
                canvas.save();
                canvas.translate(i10 + translationX, ((getMeasuredHeight() - this.G.getHeight()) / 2.0f) + L6);
                this.G.draw(canvas);
                canvas.restore();
                canvas.restore();
            } else {
                f12 = 12.0f;
                f13 = 2.0f;
            }
            float measuredHeight = (getMeasuredHeight() - this.H.getHeight()) / f13;
            if (!z10) {
                measuredHeight -= org.telegram.messenger.g0.L(f12) - L6;
            }
            float f17 = z10 ? L5 + primaryHorizontal : measuredWidth;
            Rect rect = this.K;
            rect.set((int) f17, (int) measuredHeight, (int) (this.H.getWidth() + f17), (int) (this.H.getHeight() + measuredHeight));
            rect.inset(-org.telegram.messenger.g0.L(f10), -org.telegram.messenger.g0.L(f10));
            if (this.n > 0.0f) {
                this.L.setBounds((getMeasuredWidth() / 2) - L, (getMeasuredHeight() / 2) - L, (getMeasuredWidth() / 2) + L, (getMeasuredHeight() / 2) + L);
                this.L.draw(canvas);
                canvas.save();
                canvas.translate(f17, measuredHeight);
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
        public final void onMeasure(int i7, int i10) {
            super.onMeasure(i7, i10);
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
                this.G = new StaticLayout(this.d, textPaint, i11, alignment, 1.0f, 0.0f, false);
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
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            Rect rect = this.K;
            if (action == 0) {
                boolean contains = rect.contains(x10, y10);
                this.I = contains;
                if (contains) {
                    this.L.setHotspot(x10, y10);
                    setPressed(true);
                }
                return this.I;
            }
            boolean z9 = this.I;
            if (!z9) {
                return z9;
            }
            if (motionEvent.getAction() == 2 && !rect.contains(x10, y10)) {
                setPressed(false);
                return false;
            }
            if (motionEvent.getAction() == 1 && rect.contains(x10, y10)) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                long j3 = 0;
                if (chatActivityEnterView.e2 && chatActivityEnterView.c1) {
                    CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                    chatActivityEnterView.Z2.Z1(5, 0, chatActivityEnterView.O ? Integer.MAX_VALUE : 0, chatActivityEnterView.S4, 0L, true);
                    ge geVar = chatActivityEnterView.J0;
                    chatActivityEnterView.S4 = 0L;
                    geVar.setEffect(0L);
                } else {
                    chatActivityEnterView.Z2.R0(0);
                    MediaController.B().B0(0, 0, false, chatActivityEnterView.O);
                }
                chatActivityEnterView.b3 = null;
                chatActivityEnterView.d3 = null;
                chatActivityEnterView.e3 = null;
                chatActivityEnterView.i1 = 0L;
                chatActivityEnterView.F2 = false;
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(chatActivityEnterView.Q);
                long j10 = chatActivityEnterView.Q2;
                org.telegram.ui.an anVar = chatActivityEnterView.P2;
                if (anVar != null && anVar.v4) {
                    j3 = anVar.b();
                }
                b02.B1(j10, j3, null);
                chatActivityEnterView.N1(2, true);
                chatActivityEnterView.E(true);
            }
            return true;
        }

        public void setCancelToProgress(float f10) {
            this.n = f10;
        }

        @Override // android.view.View
        public final boolean verifyDrawable(Drawable drawable) {
            return this.L == drawable || super.verifyDrawable(drawable);
        }
    }

    public ChatActivityEnterView(Activity activity, rt0 rt0Var, org.telegram.ui.an anVar, boolean z9, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        int i7;
        String str;
        wf wfVar;
        this.h = 1.0f;
        this.n = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        this.E = 1.0f;
        this.F = 1.0f;
        this.I = 0.0f;
        int i10 = 1;
        this.J = true;
        int i11 = org.telegram.messenger.p10.s0;
        this.Q = i11;
        this.R = org.telegram.messenger.c.a(i11);
        this.T = 1;
        this.c0 = -1;
        this.q5 = 1;
        this.x0 = true;
        this.y0 = true;
        this.z0 = true;
        this.B0 = new HashMap();
        new yd(0);
        this.C0 = false;
        this.D0 = false;
        this.v1 = 1.0f;
        this.f2 = -1;
        this.j2 = true;
        this.D2 = -1.0f;
        this.E2 = org.telegram.messenger.g0.L(80.0f);
        this.N2 = new int[2];
        this.Y2 = true;
        this.o3 = -1;
        this.q3 = true;
        this.r3 = new je(this, 0);
        this.s3 = new qe(this);
        this.t3 = new org.telegram.ui.Cells.g1(Integer.class, "translationY", i10);
        this.u3 = new bf(Float.class, "scale");
        this.v3 = new ef(Float.class, "controlsScale");
        this.w3 = new Paint(1);
        this.H3 = new je(this, i10);
        this.K3 = new rf(this);
        this.L3 = new h2.f((int[]) null);
        this.M3 = new Paint(1);
        this.S3 = new RectF();
        this.T3 = new Rect();
        this.U3 = new Rect();
        this.Y3 = new je(this, 2);
        this.Z3 = new td(this, 0);
        this.a4 = new td(this, 1);
        this.b4 = new td(this, 2);
        this.c4 = new td(this, 3);
        this.d4 = new td(this, 4);
        this.x4 = true;
        this.y4 = true;
        this.B4 = new Paint();
        this.C4 = 1.0f;
        this.D4 = new Rect();
        this.F4 = new ad(this, 8);
        this.I4 = true;
        this.O4 = new wp[1];
        this.r5 = 1;
        this.Z4 = -1;
        Paint paint = new Paint(1);
        this.c5 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d5 = linearGradient;
        this.e5 = new Matrix();
        xq xqVar = xq.h;
        final int i12 = 0;
        this.f5 = new w5(this, 0L, 280L, xqVar);
        this.g5 = new w5(this, 0L, 280L, xqVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        xq xqVar2 = mi.l.V;
        this.j5 = new te.c(0, this, xqVar2, 250L);
        this.k5 = new te.a(1, this, xqVar2, 250L, false);
        this.l5 = new te.a(2, this, xqVar, 320L, false);
        this.m5 = new te.a(3, this, xqVar, 320L, false);
        this.W3 = f6Var;
        this.X3 = z9;
        this.i2 = z9 && !org.telegram.messenger.g0.E && (anVar == null || !anVar.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.Q1 = paint2;
        paint2.setColor(f0(org.telegram.ui.ActionBar.k6.Pf));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.l2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.o2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.p2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.m2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.n2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.k2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.t);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.s2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.u2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.e2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.z0);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.L);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.n1);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.t2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.R2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.Y2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.f5);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
        this.O2 = activity;
        this.P2 = anVar;
        if (anVar != null) {
            this.G2 = anVar.getClassGuid();
        }
        this.m1 = rt0Var;
        this.n1 = rt0Var;
        rt0Var.setDelegate(this);
        this.B2 = org.telegram.messenger.qp.e1().getBoolean("send_by_enter", false);
        ud udVar = new ud(this, activity, i12);
        this.z1 = udVar;
        udVar.setClipChildren(false);
        udVar.setClipToPadding(false);
        udVar.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, 0);
        addView(udVar, c8.ha.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        ud udVar2 = new ud(this, activity, i10);
        this.y1 = udVar2;
        udVar2.setClipChildren(false);
        udVar.addView(udVar2, c8.ha.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        wd wdVar = new wd(this, activity);
        this.Q0 = wdVar;
        wdVar.setContentDescription(org.telegram.messenger.hd.M0(2131754884, null));
        wdVar.setFocusable(true);
        int L = org.telegram.messenger.g0.L(7.5f);
        wdVar.setPadding(L, L, L, L);
        int i13 = org.telegram.ui.ActionBar.k6.Kl;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(wdVar, i13, f6Var, mode);
        int i14 = org.telegram.ui.ActionBar.k6.i6;
        int f02 = f0(i14);
        float L2 = org.telegram.messenger.g0.L(19.0f);
        int L3 = org.telegram.messenger.g0.L(1.0f);
        int L4 = org.telegram.messenger.g0.L(3.0f);
        wdVar.setBackground(org.telegram.ui.ActionBar.k6.Y(L2, f02, L3, L4, L3, L4));
        wdVar.setOnClickListener(new cd(this, 14));
        udVar2.addView(wdVar, c8.ha.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        c1(false, false);
        ImageView imageView = new ImageView(activity);
        this.R0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        org.telegram.ui.ActionBar.r6.t(imageView, i13, f6Var, mode);
        int f03 = f0(i14);
        float L5 = org.telegram.messenger.g0.L(19.0f);
        int L6 = org.telegram.messenger.g0.L(1.0f);
        int L7 = org.telegram.messenger.g0.L(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.Y(L5, f03, L6, L7, L6, L7));
        imageView.setVisibility(8);
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754038, null));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nd
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        int i15 = ChatActivityEnterView.s5;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.getContext(), f6Var);
                        String M0 = org.telegram.messenger.hd.M0(2131754036, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.hd.M0(2131754037, null);
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new jd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        break;
                    default:
                        int i16 = ChatActivityEnterView.s5;
                        org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        org.telegram.ui.an anVar2 = chatActivityEnterView2.P2;
                        long a10 = anVar2 != null ? anVar2.a() : chatActivityEnterView2.Q2;
                        boolean z10 = chatActivityEnterView2.D1;
                        org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                        if (!z10) {
                            if (chatActivityEnterView2.E0 != null) {
                                g0 g0Var = new g0(chatActivityEnterView2.getContext(), f6Var2);
                                g0Var.r1(chatActivityEnterView2.E0.getText());
                                g0Var.b2 = new ld(chatActivityEnterView2, 1);
                                boolean z11 = chatActivityEnterView2.Z1 != null;
                                md mdVar = new md(chatActivityEnterView2, a10, f6Var2, 1);
                                g0Var.d2 = a10;
                                g0Var.e2 = z11;
                                g0Var.f2 = mdVar;
                                g0Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.E1 != null) {
                            g0 g0Var2 = new g0(chatActivityEnterView2.getContext(), f6Var2);
                            g0Var2.s1(chatActivityEnterView2.E1);
                            g0Var2.c2 = new ld(chatActivityEnterView2, 0);
                            md mdVar2 = new md(chatActivityEnterView2, a10, f6Var2, 0);
                            g0Var2.d2 = a10;
                            g0Var2.g2 = mdVar2;
                            g0Var2.show();
                            break;
                        }
                        break;
                }
            }
        });
        udVar2.addView(imageView, c8.ha.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z9) {
            int i15 = anVar != null ? anVar.f4 : -1;
            bi.t tVar = new bi.t(activity, 5);
            this.p1 = tVar;
            tVar.setOrientation(0);
            tVar.setEnabled(false);
            tVar.setClipChildren(false);
            udVar2.addView(tVar, c8.ha.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i15 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.I1 = imageView2;
                uq uqVar = new uq(activity, R.drawable.input_notify_on, i13);
                this.e0 = uqVar;
                imageView2.setImageDrawable(uqVar);
                this.e0.a(this.g2, false);
                if (this.g2) {
                    i7 = 2131754906;
                    str = "AccDescrChanSilentOn";
                } else {
                    i7 = 2131754907;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(org.telegram.messenger.hd.M0(i7, str));
                org.telegram.ui.ActionBar.r6.t(imageView2, i13, f6Var, PorterDuff.Mode.MULTIPLY);
                imageView2.setScaleType(scaleType);
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(f0(i14), 1, -1);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
                imageView2.setBackground(h02);
                org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N, f6Var);
                imageView2.setVisibility((!this.h2 || ((wfVar = this.Z2) != null && wfVar.v0())) ? 8 : 0);
                tVar.addView(imageView2, c8.ha.o(44, 44));
                imageView2.setOnClickListener(new xd(i12, this, anVar, activity));
            }
            kg.k kVar = new kg.k(activity, 1);
            this.r1 = kVar;
            kVar.setScaleType(scaleType);
            org.telegram.ui.ActionBar.r6.t(kVar, i13, f6Var, PorterDuff.Mode.MULTIPLY);
            kVar.setImageResource(R.drawable.msg_input_attach2);
            org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(f0(i14), 1, -1);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
            kVar.setBackground(h03);
            org.telegram.ui.ActionBar.r6.k(kVar, h03, null, N2, f6Var);
            udVar2.addView(kVar, c8.ha.e(44, 44, 85));
            kVar.setOnClickListener(new cd(this, 18));
            kVar.setContentDescription(org.telegram.messenger.hd.M0(2131754921, null));
            J1(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.t1 = imageView3;
        org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(activity);
        this.s1 = u2Var;
        imageView3.setImageDrawable(u2Var);
        imageView3.setScaleType(scaleType);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView3, i13, f6Var, mode2);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(f0(i14), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i14);
        imageView3.setBackground(h04);
        org.telegram.ui.ActionBar.r6.k(imageView3, h04, null, N3, f6Var);
        udVar.addView(imageView3, c8.ha.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(org.telegram.messenger.hd.M0(2131755006, null));
        c8.ka.a(imageView3);
        final int i16 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nd
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        int i152 = ChatActivityEnterView.s5;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.getContext(), f6Var);
                        String M0 = org.telegram.messenger.hd.M0(2131754036, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.hd.M0(2131754037, null);
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new jd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        break;
                    default:
                        int i162 = ChatActivityEnterView.s5;
                        org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        org.telegram.ui.an anVar2 = chatActivityEnterView2.P2;
                        long a10 = anVar2 != null ? anVar2.a() : chatActivityEnterView2.Q2;
                        boolean z10 = chatActivityEnterView2.D1;
                        org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                        if (!z10) {
                            if (chatActivityEnterView2.E0 != null) {
                                g0 g0Var = new g0(chatActivityEnterView2.getContext(), f6Var2);
                                g0Var.r1(chatActivityEnterView2.E0.getText());
                                g0Var.b2 = new ld(chatActivityEnterView2, 1);
                                boolean z11 = chatActivityEnterView2.Z1 != null;
                                md mdVar = new md(chatActivityEnterView2, a10, f6Var2, 1);
                                g0Var.d2 = a10;
                                g0Var.e2 = z11;
                                g0Var.f2 = mdVar;
                                g0Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.E1 != null) {
                            g0 g0Var2 = new g0(chatActivityEnterView2.getContext(), f6Var2);
                            g0Var2.s1(chatActivityEnterView2.E1);
                            g0Var2.c2 = new ld(chatActivityEnterView2, 0);
                            md mdVar2 = new md(chatActivityEnterView2, a10, f6Var2, 0);
                            g0Var2.d2 = a10;
                            g0Var2.g2 = mdVar2;
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
        org.telegram.ui.ActionBar.r6.t(imageView4, i13, f6Var, mode2);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.k6.h0(f0(i14), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i14);
        imageView4.setBackground(h05);
        org.telegram.ui.ActionBar.r6.k(imageView4, h05, null, N4, f6Var);
        udVar.addView(imageView4, c8.ha.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.hd.M0(2131754033, null));
        c8.ka.a(imageView4);
        imageView4.setOnClickListener(new cd(this, 20));
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
        org.telegram.ui.ActionBar.r6.t(imageView5, org.telegram.ui.ActionBar.k6.Vl, f6Var, mode);
        udVar.addView(imageView5, c8.ha.e(44, 44, 85));
        ud udVar3 = new ud(this, activity, 2);
        this.A1 = udVar3;
        udVar3.setClipChildren(false);
        udVar3.setClipToPadding(false);
        udVar.addView(udVar3, c8.ha.e(100, 44, 85));
        de deVar = new de(this, activity, f6Var);
        this.Z0 = deVar;
        deVar.setSoundEffectsEnabled(false);
        udVar3.addView(deVar, c8.ha.e(44, 44, 85));
        deVar.setFocusable(true);
        deVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.N3 = mutate;
        org.telegram.ui.ActionBar.r6.y(this, mutate, i13, f6Var, mode2);
        Drawable mutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.O3 = mutate2;
        org.telegram.ui.ActionBar.r6.y(this, mutate2, i13, f6Var, mode2);
        ee eeVar = new ee(this, activity);
        this.b1 = eeVar;
        eeVar.setImportantForAccessibility(2);
        int L8 = org.telegram.messenger.g0.L(10.0f);
        eeVar.setPadding(L8, L8, L8, L8);
        deVar.addView(eeVar, c8.ha.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.P0 = imageView6;
        int i17 = 4;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        fe feVar = new fe();
        this.P1 = feVar;
        imageView6.setImageDrawable(feVar);
        imageView6.setContentDescription(org.telegram.messenger.hd.M0(2131752589, "Cancel"));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.k6.h0(f0(i14), 1, -1);
        org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i14);
        imageView6.setBackground(h06);
        org.telegram.ui.ActionBar.r6.k(imageView6, h06, null, N5, f6Var);
        udVar3.addView(imageView6, c8.ha.e(44, 44, 85));
        imageView6.setOnClickListener(new cd(this, i12));
        ge geVar = new ge(this, activity, c() ? R.drawable.input_schedule : R.drawable.send_plane_24, f6Var);
        this.J0 = geVar;
        geVar.setVisibility(4);
        geVar.setContentDescription(org.telegram.messenger.hd.M0(2131745641, null));
        geVar.setSoundEffectsEnabled(false);
        geVar.setScaleX(0.1f);
        geVar.setScaleY(0.1f);
        geVar.setAlpha(0.0f);
        udVar3.addView(geVar, c8.ha.e(100, 44, 85));
        geVar.setOnClickListener(new cd(this, 1));
        geVar.setOnLongClickListener(new gd(this, i12));
        if (org.telegram.messenger.g0.C1()) {
            udVar3.setOnLongClickListener(new gd(this, i12));
        }
        jh.h hVar = new jh.h(activity, f6Var);
        this.I0 = hVar;
        hVar.setVisibility(4);
        hVar.setOnClickListener(new cd(this, i17));
        udVar3.addView(hVar, c8.ha.e(44, 44, 85));
        eg egVar = new eg(activity);
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) egVar.c;
        this.F0 = egVar;
        k5Var.setTextSize(16);
        egVar.invalidate();
        egVar.setVisibility(4);
        egVar.setSoundEffectsEnabled(false);
        egVar.setScaleX(0.1f);
        egVar.setScaleY(0.1f);
        egVar.setAlpha(0.0f);
        egVar.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        k5Var.setGravity(21);
        egVar.invalidate();
        k5Var.setTextColor(f0(i13));
        egVar.invalidate();
        udVar3.addView(egVar, c8.ha.e(74, 44, 85));
        egVar.setOnClickListener(new cd(this, 8));
        egVar.setOnLongClickListener(new gd(this, 1));
        SharedPreferences d12 = org.telegram.messenger.qp.d1();
        this.x2 = d12.getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        this.y2 = d12.getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
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
    public static boolean C(int i7, long j3, org.telegram.ui.ActionBar.f2 f2Var, CharSequence charSequence) {
        r5[] r5VarArr;
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
        boolean z9 = false;
        if (charSequence != null && f2Var != null && !org.telegram.messenger.p10.i(i7).q() && org.telegram.messenger.p10.i(i7).e() != j3 && (charSequence instanceof Spanned) && (r5VarArr = (r5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), r5.class)) != null) {
            int i13 = 0;
            while (i13 < r5VarArr.length) {
                r5 r5Var = r5VarArr[i13];
                if (r5Var != null) {
                    TLRPC.Document document = r5Var.document;
                    if (document == null) {
                        i11 = i7;
                        document = i5.e(i11, r5Var.getDocumentId());
                    } else {
                        i11 = i7;
                    }
                    long documentId = r5VarArr[i13].getDocumentId();
                    if (document == null) {
                        ArrayList s02 = org.telegram.messenger.ui.b0(i11).s0(5);
                        int size = s02.size();
                        ?? r12 = z9;
                        ?? r62 = s02;
                        while (r12 < size) {
                            Object obj2 = r62.get(r12);
                            int i14 = r12 + 1;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                            if (tL_messages_stickerSet != null && (arrayList4 = tL_messages_stickerSet.documents) != null && !arrayList4.isEmpty()) {
                                ArrayList<TLRPC.Document> arrayList5 = tL_messages_stickerSet.documents;
                                int size2 = arrayList5.size();
                                ?? r15 = z9;
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
                            z9 = false;
                            r12 = i14;
                        }
                    }
                    i10 = i13;
                    if (document == null) {
                        ArrayList arrayList6 = org.telegram.messenger.ui.b0(i11).s0[1];
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
                                    TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(i11).m0(tL_inputStickerSetID, true);
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
                    if (document != null && (N0 = org.telegram.messenger.qp.s1(i11).N0(-j3)) != null && N0.emojiset != null && (Y = org.telegram.messenger.ui.b0(i11).Y(N0.emojiset)) != null) {
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
                    if (document == null || !org.telegram.messenger.ij.n3(document)) {
                        hc.a0(f2Var).r(document, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131743865, "UnlockPremiumEmojiHint")), org.telegram.messenger.hd.M0(2131747032, "PremiumMore"), new dd(0, f2Var)).j();
                        return true;
                    }
                } else {
                    i10 = i13;
                }
                i13 = i10 + 1;
                z9 = false;
            }
        }
        return z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(ChatActivityEnterView chatActivityEnterView, TL_keyboard.KeyboardButton keyboardButton) {
        boolean z9;
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.ij ijVar2;
        boolean Z;
        org.telegram.messenger.ij ijVar3;
        wf wfVar;
        org.telegram.ui.an anVar;
        boolean z10 = chatActivityEnterView.T2 != null && (anVar = chatActivityEnterView.P2) != null && anVar.v4 && anVar.b() == ((long) chatActivityEnterView.T2.f1());
        if (chatActivityEnterView.T2 == null || z10) {
            int i7 = chatActivityEnterView.Q;
            long j3 = chatActivityEnterView.Q2;
            if (j3 > 0) {
                z9 = org.telegram.messenger.t10.u(org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(j3)));
            } else {
                org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
                z9 = false;
            }
            if (!z9) {
                ijVar = org.telegram.messenger.m5.z(chatActivityEnterView.Q2) ? chatActivityEnterView.m2 : null;
                ijVar2 = chatActivityEnterView.T2;
                if (ijVar2 != null || z10) {
                    ijVar2 = chatActivityEnterView.m2;
                }
                Z = chatActivityEnterView.Z(keyboardButton, ijVar, ijVar2, null);
                if (chatActivityEnterView.T2 != null || z10) {
                    ijVar3 = chatActivityEnterView.m2;
                    if (ijVar3 != null && ijVar3.k.reply_markup.single_use) {
                        if (Z) {
                            chatActivityEnterView.t1(0, 0, true, true);
                        } else {
                            chatActivityEnterView.I0();
                        }
                        org.telegram.messenger.qp.s1(chatActivityEnterView.Q).e7.edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.m2.f1()).commit();
                    }
                } else {
                    chatActivityEnterView.I0();
                    chatActivityEnterView.Y0(chatActivityEnterView.W2, true, false);
                }
                wfVar = chatActivityEnterView.Z2;
                if (wfVar == null) {
                    wfVar.F(null, true, 0, 0, 0L);
                    return;
                }
                return;
            }
        }
        ijVar = chatActivityEnterView.T2;
        ijVar2 = chatActivityEnterView.T2;
        if (ijVar2 != null) {
        }
        ijVar2 = chatActivityEnterView.m2;
        Z = chatActivityEnterView.Z(keyboardButton, ijVar, ijVar2, null);
        if (chatActivityEnterView.T2 != null) {
        }
        ijVar3 = chatActivityEnterView.m2;
        if (ijVar3 != null) {
            if (Z) {
            }
            org.telegram.messenger.qp.s1(chatActivityEnterView.Q).e7.edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.m2.f1()).commit();
        }
        wfVar = chatActivityEnterView.Z2;
        if (wfVar == null) {
        }
    }

    public static void f(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.ej ejVar, boolean z9, int i7, int i10, Object obj, Long l10, boolean z10) {
        if (chatActivityEnterView.G0 > 0 && !chatActivityEnterView.c()) {
            wf wfVar = chatActivityEnterView.Z2;
            if (wfVar != null) {
                eg egVar = chatActivityEnterView.F0;
                wfVar.i1(egVar, ((org.telegram.ui.ActionBar.k5) egVar.c).getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.R1 != 0) {
            chatActivityEnterView.m1(0, true);
            chatActivityEnterView.U0.t(true);
            chatActivityEnterView.U0.A();
        }
        chatActivityEnterView.n1(false, true, false, true);
        wf wfVar2 = chatActivityEnterView.Z2;
        TL_stories.StoryItem T0 = wfVar2 != null ? wfVar2.T0() : null;
        org.telegram.messenger.gz C = org.telegram.messenger.gz.C(chatActivityEnterView.Q);
        long j3 = chatActivityEnterView.Q2;
        org.telegram.messenger.ij ijVar = chatActivityEnterView.T2;
        org.telegram.messenger.ij threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.qm qmVar = chatActivityEnterView.V2;
        boolean z11 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.an anVar = chatActivityEnterView.P2;
        C.v0(document, str, j3, ijVar, threadMessage, T0, qmVar, ejVar, z9, i7, i10, z11, obj, anVar != null ? anVar.W8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        wf wfVar3 = chatActivityEnterView.Z2;
        if (wfVar3 != null) {
            wfVar3.F(null, true, i7, 0, 0L);
        }
        if (z10) {
            chatActivityEnterView.setFieldText("");
        }
        org.telegram.messenger.ui.b0(chatActivityEnterView.Q).d(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.messenger.ij getThreadMessage() {
        org.telegram.ui.an anVar = this.P2;
        if (anVar != null) {
            return anVar.l4;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getThreadMessageId() {
        org.telegram.messenger.ij ijVar;
        org.telegram.ui.an anVar = this.P2;
        if (anVar == null || (ijVar = anVar.l4) == null) {
            return 0;
        }
        return ijVar.f1();
    }

    private String getTopicKeyString() {
        org.telegram.ui.an anVar = this.P2;
        if (anVar == null || !anVar.v4) {
            return "" + this.Q2;
        }
        return this.Q2 + "_" + anVar.b();
    }

    public static CharSequence o(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        boolean z9;
        boolean z10;
        Collections.sort(arrayList, org.telegram.messenger.ui.d2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zz.a(charSequence, false));
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        if (spans != null && spans.length > 0) {
            for (Object obj : spans) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
        boolean z11 = true;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                try {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i7);
                    if (messageEntity.offset + messageEntity.length <= spannableStringBuilder.length()) {
                        if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            e41 e41Var = new e41("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i10 = messageEntity.offset;
                            spannableStringBuilder.setSpan(e41Var, i10, messageEntity.length + i10, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            e41 e41Var2 = new e41("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i11 = messageEntity.offset;
                            spannableStringBuilder.setSpan(e41Var2, i11, messageEntity.length + i11, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            uy0 uy0Var = new uy0();
                            uy0Var.a |= 4;
                            vy0 vy0Var = new vy0(uy0Var, 0);
                            int i12 = messageEntity.offset;
                            org.telegram.messenger.ui.f(vy0Var, i12, messageEntity.length + i12, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                uy0 uy0Var2 = new uy0();
                                uy0Var2.a |= 1;
                                vy0 vy0Var2 = new vy0(uy0Var2, 0);
                                int i13 = messageEntity.offset;
                                org.telegram.messenger.ui.f(vy0Var2, i13, messageEntity.length + i13, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                uy0 uy0Var3 = new uy0();
                                uy0Var3.a |= 2;
                                vy0 vy0Var3 = new vy0(uy0Var3, 0);
                                int i14 = messageEntity.offset;
                                org.telegram.messenger.ui.f(vy0Var3, i14, messageEntity.length + i14, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                uy0 uy0Var4 = new uy0();
                                uy0Var4.a |= 8;
                                vy0 vy0Var4 = new vy0(uy0Var4, 0);
                                int i15 = messageEntity.offset;
                                org.telegram.messenger.ui.f(vy0Var4, i15, messageEntity.length + i15, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                uy0 uy0Var5 = new uy0();
                                uy0Var5.a |= 16;
                                vy0 vy0Var5 = new vy0(uy0Var5, 0);
                                int i16 = messageEntity.offset;
                                org.telegram.messenger.ui.f(vy0Var5, i16, messageEntity.length + i16, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                d41 d41Var = new d41(messageEntity.url, null);
                                int i17 = messageEntity.offset;
                                spannableStringBuilder.setSpan(d41Var, i17, messageEntity.length + i17, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                uy0 uy0Var6 = new uy0();
                                uy0Var6.a |= 128;
                                int i18 = messageEntity.offset;
                                uy0Var6.b = i18;
                                uy0Var6.c = i18 + messageEntity.length;
                                uy0Var6.d = messageEntity;
                                int i19 = messageEntity.offset;
                                zz zzVar = new zz(spannableStringBuilder.subSequence(i19, messageEntity.length + i19).toString(), uy0Var6, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i20 = messageEntity.offset;
                                spannableStringBuilder.setSpan(zzVar, i20, messageEntity.length + i20, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                uy0 uy0Var7 = new uy0();
                                uy0Var7.a |= 256;
                                vy0 vy0Var6 = new vy0(uy0Var7, 0);
                                int i21 = messageEntity.offset;
                                org.telegram.messenger.ui.f(vy0Var6, i21, messageEntity.length + i21, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                r5 r5Var = tL_messageEntityCustomEmoji.document != null ? new r5(tL_messageEntityCustomEmoji.document, fontMetricsInt) : new r5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                int i22 = messageEntity.offset;
                                spannableStringBuilder.setSpan(r5Var, i22, messageEntity.length + i22, 33);
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
            boolean z12 = false;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if (i26 != intValue) {
                    int i28 = intValue - 1;
                    z10 = z11;
                    int i29 = (i28 < 0 || i28 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(i28) != '\n') ? intValue : intValue - 1;
                    if (i27 > 0) {
                        ug0.c(spannableStringBuilder, i26, i29, z12);
                    }
                    i26 = intValue + 1;
                    if (i26 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(intValue) != '\n') {
                        i26 = intValue;
                    }
                } else {
                    z10 = z11;
                }
                if ((intValue2 & 2) != 0) {
                    i27--;
                }
                if ((intValue2 & 1) != 0 || (intValue2 & 16) != 0) {
                    i27++;
                    z12 = (intValue2 & 16) != 0 ? z10 : false;
                }
                z11 = z10;
            }
            z9 = z11;
            if (i26 < spannableStringBuilder.length() && i27 > 0) {
                ug0.c(spannableStringBuilder, i26, spannableStringBuilder.length(), z12);
            }
        } else {
            z9 = true;
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
                org.telegram.messenger.a8.g(e11, z9);
            }
        }
        return m10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHintGlass(fi.m3 m3Var) {
        org.telegram.ui.an anVar = this.P2;
        if (anVar != null) {
            m3Var.l(anVar.K);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlowModeButtonVisible(boolean z9) {
        int i7;
        int i10 = z9 ? 0 : 8;
        eg egVar = this.F0;
        egVar.setVisibility(i10);
        if (z9) {
            i7 = org.telegram.messenger.g0.L(egVar.b ? 26.0f : 16.0f);
        } else {
            i7 = 0;
        }
        xe xeVar = this.E0;
        if (xeVar == null || xeVar.getPaddingRight() == i7) {
            return;
        }
        this.E0.setPadding(0, org.telegram.messenger.g0.L(9.0f), i7, org.telegram.messenger.g0.L(10.0f));
    }

    public final void A() {
        org.telegram.ui.an anVar = this.P2;
        if (anVar == null) {
            return;
        }
        M1(anVar.e, anVar.q8);
    }

    public final boolean A1() {
        org.telegram.ui.an anVar = this.P2;
        TLRPC.EncryptedChat encryptedChat = anVar != null ? anVar.h : null;
        return encryptedChat == null || org.telegram.messenger.g0.X0(encryptedChat.layer) >= 101;
    }

    public final void B(boolean z9) {
        org.telegram.messenger.ij ijVar;
        boolean z10 = this.Q2 < 0 && this.X3 && this.Z1 == null && (bg.w.g(this.Q).e(getEditText() != null ? getEditText().toString() : null, this.b5) > 0 || ((ijVar = this.T2) != null && org.telegram.messenger.ij.d3(ijVar.k)));
        te.a aVar = this.m5;
        boolean z11 = aVar.f != z10;
        aVar.a(z10, z9);
        ge geVar = this.J0;
        if (geVar != null) {
            geVar.w = z10;
            geVar.invalidate();
        }
        if (z11) {
            E(z9);
        }
    }

    public final void B0() {
        ji0 ji0Var = this.h1;
        if (ji0Var != null) {
            ji0Var.Q = true;
            t51 t51Var = ji0Var.n;
            if (t51Var != null) {
                t51Var.u0(false);
                ji0Var.n.m0();
                ji0Var.n = null;
            }
        }
        if (this.h1 != null && this.b3 != null) {
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.Q);
            long j3 = this.Q2;
            org.telegram.ui.an anVar = this.P2;
            long b10 = (anVar == null || !anVar.v4) ? 0L : anVar.b();
            ji0 ji0Var2 = this.h1;
            float audioLeft = ji0Var2 == null ? 0.0f : ji0Var2.getAudioLeft();
            ji0 ji0Var3 = this.h1;
            b02.b2(j3, b10, audioLeft, ji0Var3 == null ? 1.0f : ji0Var3.getAudioRight());
        }
        this.Y1 = true;
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.l2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.o2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.p2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.m2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.n2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.k2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.t);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.s2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.u2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.e2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.z0);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.L);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.n1);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.t2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.R2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.Y2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.f5);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
        mf mfVar = this.U0;
        if (mfVar != null) {
            mfVar.B();
        }
        ad adVar = this.H0;
        if (adVar != null) {
            org.telegram.messenger.g0.r(adVar);
            this.H0 = null;
        }
        PowerManager.WakeLock wakeLock = this.q2;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.q2 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (this.w2 != 0 && !this.c1) {
            org.telegram.messenger.g0.h3(new xf(this.O2, 18));
        }
        rt0 rt0Var = this.m1;
        if (rt0Var != null) {
            rt0Var.setDelegate(null);
        }
        ne neVar = this.q0;
        if (neVar != null) {
            neVar.e = false;
            neVar.dismiss();
        }
    }

    public final void B1() {
        float f10;
        kg.k kVar = this.r1;
        if (kVar == null) {
            return;
        }
        float f11 = this.D + this.y;
        ge geVar = this.J0;
        if (geVar != null) {
            f10 = geVar.getAlpha() * (-jg.g.e(56.0f, geVar.l(), 0));
        } else {
            f10 = 0.0f;
        }
        kVar.setTranslationX(f11 + f10);
    }

    public final void C1() {
        B1();
        bi.t tVar = this.p1;
        if (tVar != null) {
            tVar.setTranslationX(this.D + this.y);
            tVar.setAlpha(this.E * this.F);
            tVar.setVisibility(tVar.getAlpha() > 0.0f ? 0 : 8);
            kg.k kVar = this.r1;
            if (kVar != null && this.A4) {
                kVar.setAlpha(this.v1 * this.F);
            }
        }
        ie ieVar = this.J1;
        if (ieVar != null) {
            ieVar.setTranslationX(ieVar.a);
        }
    }

    public final void D() {
        boolean z9;
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.e2) {
            return;
        }
        if (this.p1 == null) {
            this.e2 = false;
            j1(false, false);
            return;
        }
        boolean z11 = true;
        this.e2 = true;
        this.x0 = true;
        this.y0 = true;
        if (org.telegram.messenger.m5.z(this.Q2)) {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.R.a).M0(Long.valueOf(-this.Q2));
            z9 = org.telegram.messenger.t3.T(M0) && !M0.megagroup;
            if (z9 && !M0.creator && ((tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.e2 = false;
            }
            this.x0 = org.telegram.messenger.t3.s(M0);
            this.y0 = org.telegram.messenger.t3.v(M0);
        } else {
            z9 = false;
        }
        if (!org.telegram.messenger.iz.y0) {
            this.e2 = false;
        }
        if (this.e2) {
            if (org.telegram.messenger.iz.P0) {
                CameraController.getInstance().initCamera(null);
            }
            z10 = org.telegram.messenger.qp.e1().getBoolean(z9 ? "currentModeVideoChannel" : "currentModeVideo", z9);
        } else {
            z10 = false;
        }
        if (!this.x0 && z10) {
            z10 = false;
        }
        if (this.y0 || z10) {
            z11 = z10;
        } else if (!this.e2) {
            z11 = false;
        }
        j1(z11, false);
    }

    public final void D0() {
        this.j2 = true;
        ne neVar = this.q0;
        if (neVar != null) {
            neVar.e = false;
            neVar.dismiss();
        }
        if (this.z2) {
            this.l2 = true;
        }
        ad adVar = new ad(this, 9);
        this.N4 = adVar;
        org.telegram.messenger.g0.i3(adVar, 500L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b5, code lost:
    
        if (android.text.TextUtils.isEmpty(r15 == null ? "" : org.telegram.messenger.g0.n1(r15.getTextToUse())) != false) goto L124;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D1(boolean z9) {
        ke keVar;
        if (this.X3) {
            org.telegram.ui.an anVar = this.P2;
            if (anVar != null && !anVar.d6) {
                z9 = false;
            }
            boolean g02 = g0();
            int i7 = 1;
            boolean z10 = this.q5 != 1 && this.Q2 > 0;
            ke keVar2 = this.x1;
            boolean z11 = keVar2 != null && keVar2.getVisibility() == 0;
            if (!g02 && !this.p2 && this.n2 == null) {
                ke keVar3 = this.x1;
                if (keVar3 != null) {
                    keVar3.setVisibility(8);
                }
            } else if (this.n2 != null) {
                if (s0() && this.f2 == 1 && this.n2.is_persistent) {
                    ke keVar4 = this.x1;
                    if (keVar4 != null && keVar4.getVisibility() != 8) {
                        this.x1.setVisibility(8);
                    }
                } else {
                    M();
                    if (this.x1.getVisibility() != 0) {
                        this.x1.setVisibility(0);
                    }
                    this.U1.a(R.drawable.input_bot2, true);
                    this.x1.setContentDescription(org.telegram.messenger.hd.M0(2131754918, "AccDescrBotKeyboard"));
                }
            } else if (z10) {
                ke keVar5 = this.x1;
                if (keVar5 != null) {
                    keVar5.setVisibility(8);
                }
            } else {
                M();
                this.U1.a(R.drawable.input_bot1, true);
                this.x1.setContentDescription(org.telegram.messenger.hd.M0(2131754919, "AccDescrBotCommands"));
                this.x1.setVisibility(0);
            }
            if (z10) {
                N();
            }
            ke keVar6 = this.x1;
            boolean z12 = (keVar6 != null && keVar6.getVisibility() == 0) != z11;
            hi.y yVar = this.l0;
            int i10 = 2;
            if (yVar != null) {
                boolean z13 = yVar.x;
                yVar.setWebView(this.q5 == 3);
                hi.y yVar2 = this.l0;
                String M0 = this.q5 == 2 ? org.telegram.messenger.hd.M0(2131752891, null) : this.i0;
                if (M0 == null) {
                    yVar2.getClass();
                    M0 = org.telegram.messenger.hd.M0(2131752891, null);
                }
                String str = yVar2.n;
                boolean z14 = str == null || !str.equals(M0);
                yVar2.n = M0;
                yVar2.r = null;
                yVar2.requestLayout();
                org.telegram.messenger.g0.Z3(this.l0, z10, 0.5f, true, z9);
                z12 = z12 || z14 || z13 != this.l0.x;
            }
            if (z12 && z9) {
                wd wdVar = this.Q0;
                Float valueOf = Float.valueOf(wdVar.getX());
                HashMap hashMap = this.B0;
                hashMap.put(wdVar, valueOf);
                xe xeVar = this.E0;
                if (xeVar != null) {
                    hashMap.put(xeVar, Float.valueOf(xeVar.getX()));
                }
                ke keVar7 = this.x1;
                boolean z15 = keVar7 != null && keVar7.getVisibility() == 0;
                if (z15 != z11 && (keVar = this.x1) != null) {
                    keVar.setVisibility(0);
                    if (z15) {
                        this.x1.setAlpha(0.0f);
                        this.x1.setScaleX(0.1f);
                        this.x1.setScaleY(0.1f);
                    } else if (!z15) {
                        this.x1.setAlpha(1.0f);
                        this.x1.setScaleX(1.0f);
                        this.x1.setScaleY(1.0f);
                    }
                    org.telegram.messenger.g0.Y3(this.x1, z15, 0.1f, true, 1.0f, true, new zc(this, i7));
                }
            }
            ke keVar8 = this.x1;
            if (keVar8 != null && keVar8.getVisibility() == 0) {
                xe xeVar2 = this.E0;
            }
            i10 = this.P4;
            J1(i10);
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
    public final void E(boolean z9) {
        String str;
        de deVar;
        ge geVar;
        int i7;
        boolean z10;
        AnimatorSet animatorSet;
        ?? r42;
        int i10;
        boolean z11;
        ke keVar;
        ke keVar2;
        AnimatorSet animatorSet2;
        int i11;
        float f10;
        ke keVar3;
        AnimatorSet animatorSet3;
        ImageView imageView;
        int i12;
        boolean z12;
        ?? r32;
        ?? r43;
        int i13;
        if (this.Z1 != null || this.F2) {
            return;
        }
        boolean z13 = this.j2 ? false : z9;
        T1();
        xe xeVar = this.E0;
        CharSequence n1 = xeVar == null ? "" : org.telegram.messenger.g0.n1(xeVar.getTextToUse());
        int i14 = this.G0;
        ge geVar2 = this.J0;
        td tdVar = this.a4;
        de deVar2 = this.Z0;
        Property property = View.SCALE_X;
        Property property2 = View.SCALE_Y;
        Property property3 = View.ALPHA;
        bi.t tVar = this.p1;
        ee eeVar = this.b1;
        eg egVar = this.F0;
        kg.k kVar = this.r1;
        ImageView imageView2 = this.P0;
        boolean z14 = z13;
        if (i14 <= 0 || i14 == Integer.MAX_VALUE || x0()) {
            int length = n1.length();
            te.a aVar = this.l5;
            if (length > 0 || this.H2 || this.D1 || this.b3 != null || this.e3 != null || ((this.G0 == Integer.MAX_VALUE && !x0()) || ((this.p5 && getStarsPrice() > 0) || aVar.f))) {
                xe xeVar2 = this.E0;
                String caption = xeVar2 == null ? null : xeVar2.getCaption();
                boolean z15 = caption != null && (getSendButtonInternal().getVisibility() == 0 || ((keVar2 = this.S0) != null && keVar2.getVisibility() == 0));
                boolean z16 = caption == null && (imageView2.getVisibility() == 0 || ((keVar = this.S0) != null && keVar.getVisibility() == 0));
                int f02 = (this.G0 != Integer.MAX_VALUE || x0()) ? f0(org.telegram.ui.ActionBar.k6.Me) : f0(org.telegram.ui.ActionBar.k6.Kl);
                boolean p02 = p0();
                boolean z17 = (this.w2 == 0 && this.b3 == null && this.e3 == null) ? false : true;
                boolean z18 = (p02 || z17) ? false : true;
                boolean z19 = z17;
                if (f02 != this.K0) {
                    this.K0 = f02;
                    Drawable background = geVar2.getBackground();
                    int i15 = f02;
                    int red = Color.red(i15);
                    geVar = geVar2;
                    int green = Color.green(i15);
                    deVar = deVar2;
                    int blue = Color.blue(i15);
                    str = caption;
                    org.telegram.ui.ActionBar.k6.H1(background, Color.argb(24, red, green, blue), true);
                } else {
                    str = caption;
                    deVar = deVar2;
                    geVar = geVar2;
                }
                if (deVar.getVisibility() != 0 && egVar.getVisibility() != 0 && !z15 && !z16 && !aVar.f) {
                    lh.h hVar = this.i5;
                    if (hVar != null) {
                        hVar.e(0, p02 && !z19, true);
                        if (kVar != null) {
                            ViewPropertyAnimator viewPropertyAnimator = this.q1;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.cancel();
                                this.q1 = null;
                            }
                            ViewPropertyAnimator animate = kVar.animate();
                            float f11 = z18 ? 1.0f : 0.0f;
                            this.v1 = f11;
                            ViewPropertyAnimator duration = animate.alpha(f11).scaleX(z18 ? 1.0f : 0.5f).scaleY(z18 ? 1.0f : 0.5f).setInterpolator(xq.h).setDuration(320L);
                            this.q1 = duration;
                            duration.start();
                        }
                    }
                } else {
                    if (!z14) {
                        String str2 = str;
                        eeVar.setScaleX(0.1f);
                        eeVar.setScaleY(0.1f);
                        eeVar.setAlpha(0.0f);
                        deVar.setVisibility(8);
                        if (egVar.getVisibility() == 0) {
                            egVar.setScaleX(0.1f);
                            egVar.setScaleY(0.1f);
                            egVar.setAlpha(0.0f);
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
                        ke keVar4 = this.S0;
                        if (keVar4 == null || keVar4.getVisibility() != 0) {
                            i7 = 8;
                        } else {
                            this.S0.setScaleX(0.1f);
                            this.S0.setScaleY(0.1f);
                            this.S0.setAlpha(0.0f);
                            i7 = 8;
                            this.S0.setVisibility(8);
                        }
                        if (tVar != null) {
                            tVar.setVisibility(i7);
                            if (this.Z2 != null && getVisibility() == 0) {
                                this.Z2.r0();
                            }
                            J1(0);
                            lh.h hVar2 = this.i5;
                            if (hVar2 != null) {
                                hVar2.e(0, p02 && !z19, true);
                                if (kVar != null) {
                                    float f12 = z18 ? 1.0f : 0.0f;
                                    this.v1 = f12;
                                    kVar.setAlpha(f12);
                                    kVar.setScaleX(z18 ? 1.0f : 0.5f);
                                    kVar.setScaleY(z18 ? 1.0f : 0.5f);
                                }
                            } else if (kVar != null) {
                                this.v1 = 0.0f;
                                kVar.setAlpha(0.0f);
                                kVar.setScaleX(0.5f);
                                kVar.setScaleY(0.5f);
                            }
                        }
                        z10 = true;
                        this.L1 = true;
                        if (this.J1 != null) {
                            wf wfVar = this.Z2;
                            if (wfVar != null && wfVar.v0()) {
                                this.J1.setVisibility(8);
                                this.J1.setTag(null);
                            }
                            this.J1.setAlpha(0.0f);
                            this.J1.setScaleX(0.0f);
                            this.J1.setScaleY(1.0f);
                            this.J1.setTranslationX(0.0f);
                        }
                        z11 = z10;
                        if (!this.A4 || (imageView = this.w1) == null) {
                            return;
                        }
                        if (z14) {
                            imageView.animate().translationX(z11 ? -jg.g.e(64.0f, geVar.l(), 0) : org.telegram.messenger.g0.L(42.0f)).setDuration(320L).setInterpolator(xq.h).start();
                            return;
                        } else {
                            imageView.setTranslationX(z11 ? -jg.g.e(64.0f, geVar.l(), 0) : org.telegram.messenger.g0.L(42.0f));
                            return;
                        }
                    }
                    int i16 = this.v2;
                    if (i16 == 1 && str == null) {
                        return;
                    }
                    if (i16 == 3 && str != null) {
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
                    if (tVar != null) {
                        this.s2 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(ObjectAnimator.ofFloat(tVar, tdVar, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(tVar, (Property<bi.t, Float>) property, 0.5f));
                        ViewPropertyAnimator viewPropertyAnimator2 = this.q1;
                        if (viewPropertyAnimator2 != null) {
                            viewPropertyAnimator2.cancel();
                            this.q1 = null;
                        }
                        lh.h hVar3 = this.i5;
                        if (hVar3 != null) {
                            hVar3.e(0, p02 && !z19, true);
                            if (kVar != null) {
                                float f13 = z18 ? 1.0f : 0.0f;
                                this.v1 = f13;
                                arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<kg.k, Float>) property3, f13));
                                arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<kg.k, Float>) property, z18 ? 1.0f : 0.5f));
                                arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<kg.k, Float>) property2, z18 ? 1.0f : 0.5f));
                            }
                        } else if (kVar != null) {
                            this.v1 = 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<kg.k, Float>) property3, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<kg.k, Float>) property, 0.5f));
                            arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<kg.k, Float>) property2, 0.5f));
                        }
                        wf wfVar2 = this.Z2;
                        boolean z20 = wfVar2 != null && wfVar2.v0();
                        this.L1 = true;
                        ie ieVar = this.J1;
                        if (ieVar != null) {
                            ieVar.setScaleY(1.0f);
                            if (z20) {
                                this.J1.setTag(null);
                                arrayList.add(ObjectAnimator.ofFloat(this.J1, (Property<ie, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.J1, (Property<ie, Float>) property, 0.0f));
                                arrayList.add(m(0.0f));
                            } else {
                                this.J1.setAlpha(0.0f);
                                this.J1.setScaleX(0.0f);
                                this.J1.setTranslationX(0.0f);
                            }
                        }
                        this.s2.playTogether(arrayList);
                        this.s2.setDuration(100L);
                        this.s2.addListener(new le(this, z20, 1));
                        this.s2.start();
                        J1(0);
                        if (this.Z2 != null && getVisibility() == 0) {
                            this.Z2.r0();
                        }
                    }
                    this.r2 = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    if (deVar.getVisibility() == 0) {
                        i10 = 1;
                        r42 = 0;
                        arrayList2.add(ObjectAnimator.ofFloat(eeVar, (Property<ee, Float>) property, 0.1f));
                        arrayList2.add(ObjectAnimator.ofFloat(eeVar, (Property<ee, Float>) property2, 0.1f));
                        arrayList2.add(ObjectAnimator.ofFloat(eeVar, (Property<ee, Float>) property3, 0.0f));
                    } else {
                        r42 = 0;
                        i10 = 1;
                    }
                    ke keVar5 = this.S0;
                    if (keVar5 != null && keVar5.getVisibility() == 0) {
                        ke keVar6 = this.S0;
                        float[] fArr = new float[i10];
                        fArr[r42] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(keVar6, (Property<ke, Float>) property, fArr));
                        ke keVar7 = this.S0;
                        float[] fArr2 = new float[i10];
                        fArr2[r42] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(keVar7, (Property<ke, Float>) property2, fArr2));
                        ke keVar8 = this.S0;
                        float[] fArr3 = new float[i10];
                        fArr3[r42] = 0.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(keVar8, (Property<ke, Float>) property3, fArr3));
                    }
                    if (egVar.getVisibility() == 0) {
                        float[] fArr4 = new float[i10];
                        fArr4[r42] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(egVar, (Property<eg, Float>) property, fArr4));
                        float[] fArr5 = new float[i10];
                        fArr5[r42] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(egVar, (Property<eg, Float>) property2, fArr5));
                        float[] fArr6 = new float[i10];
                        fArr6[r42] = 0.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(egVar, (Property<eg, Float>) property3, fArr6));
                    }
                    if (z15) {
                        arrayList2.add(n(r42));
                    } else if (z16) {
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
                        this.v2 = 3;
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
                        this.v2 = i10;
                        arrayList2.add(n(i10));
                        getSendButtonInternal().setVisibility(r42);
                    }
                    this.r2.playTogether(arrayList2);
                    this.r2.setDuration(220L);
                    this.r2.setInterpolator(xq.h);
                    this.r2.addListener(new ah.l(21, this, str));
                    this.r2.start();
                }
                z10 = true;
                z11 = z10;
                if (this.A4) {
                    return;
                } else {
                    return;
                }
            }
            if (this.U0 == null || !this.W0 || (!(this.x3 || (this.y3 && this.R1 == 2)) || org.telegram.messenger.g0.E || this.p5)) {
                if (getSendButtonInternal().getVisibility() == 0 || imageView2.getVisibility() == 0 || (((keVar3 = this.S0) != null && keVar3.getVisibility() == 0) || egVar.getVisibility() == 0)) {
                    if (!z14) {
                        egVar.setScaleX(0.1f);
                        egVar.setScaleY(0.1f);
                        egVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        getSendButtonInternal().setVisibility(8);
                        imageView2.setScaleX(0.1f);
                        imageView2.setScaleY(0.1f);
                        imageView2.setAlpha(0.0f);
                        imageView2.setVisibility(8);
                        ke keVar9 = this.S0;
                        if (keVar9 != null) {
                            keVar9.setScaleX(0.1f);
                            this.S0.setScaleY(0.1f);
                            this.S0.setAlpha(0.0f);
                            this.S0.setVisibility(8);
                        }
                        eeVar.setScaleX(1.0f);
                        eeVar.setScaleY(1.0f);
                        eeVar.setAlpha(1.0f);
                        deVar2.setVisibility(0);
                        if (tVar != null) {
                            if (getVisibility() == 0) {
                                this.Z2.h2();
                            }
                            this.E = 1.0f;
                            C1();
                            tVar.setScaleX(1.0f);
                            tVar.setVisibility(0);
                            J1(1);
                        }
                        if (kVar != null) {
                            ViewPropertyAnimator viewPropertyAnimator3 = this.q1;
                            if (viewPropertyAnimator3 != null) {
                                viewPropertyAnimator3.cancel();
                                this.q1 = null;
                            }
                            this.v1 = 1.0f;
                            kVar.setAlpha(1.0f);
                            kVar.setScaleX(1.0f);
                            kVar.setScaleY(1.0f);
                        }
                        this.L1 = false;
                        wf wfVar3 = this.Z2;
                        if (wfVar3 != null && wfVar3.v0()) {
                            W();
                        }
                        if (this.J1 != null) {
                            wf wfVar4 = this.Z2;
                            if (wfVar4 != null && wfVar4.v0()) {
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
                        if (tVar != null) {
                            if (tVar.getVisibility() != 0) {
                                tVar.setVisibility(0);
                                this.E = 0.0f;
                                C1();
                                tVar.setScaleX(0.0f);
                            }
                            this.s2 = new AnimatorSet();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(ObjectAnimator.ofFloat(tVar, tdVar, 1.0f));
                            arrayList3.add(ObjectAnimator.ofFloat(tVar, (Property<bi.t, Float>) property, 1.0f));
                            lh.h hVar4 = this.i5;
                            if (hVar4 != null) {
                                hVar4.e(0, false, true);
                            }
                            if (kVar != null) {
                                ViewPropertyAnimator viewPropertyAnimator4 = this.q1;
                                if (viewPropertyAnimator4 != null) {
                                    viewPropertyAnimator4.cancel();
                                    this.q1 = null;
                                }
                                this.v1 = 1.0f;
                                arrayList3.add(ObjectAnimator.ofFloat(kVar, (Property<kg.k, Float>) property3, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(kVar, (Property<kg.k, Float>) property, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(kVar, (Property<kg.k, Float>) property2, 1.0f));
                            }
                            wf wfVar5 = this.Z2;
                            boolean z21 = wfVar5 != null && wfVar5.v0();
                            this.L1 = false;
                            if (z21) {
                                W();
                            }
                            ie ieVar2 = this.J1;
                            if (ieVar2 != null) {
                                if (z21) {
                                    ieVar2.setVisibility(0);
                                    this.J1.setTag(1);
                                    this.J1.setPivotX(org.telegram.messenger.g0.L(44.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.J1, (Property<ie, Float>) property3, 1.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.J1, (Property<ie, Float>) property, 1.0f));
                                    arrayList3.add(m(0.0f));
                                    ImageView imageView3 = this.I1;
                                    if (imageView3 != null && imageView3.getVisibility() == 0) {
                                        imageView3.setVisibility(8);
                                    }
                                } else {
                                    ieVar2.setAlpha(1.0f);
                                    this.J1.setScaleX(1.0f);
                                    this.J1.setScaleY(1.0f);
                                    this.J1.setTranslationX(0.0f);
                                }
                            }
                            this.s2.playTogether(arrayList3);
                            this.s2.setDuration(100L);
                            this.s2.addListener(new he(this, 6));
                            this.s2.start();
                            J1(1);
                            if (getVisibility() == 0) {
                                this.Z2.h2();
                            }
                        }
                        deVar2.setVisibility(0);
                        this.r2 = new AnimatorSet();
                        this.v2 = 2;
                        ArrayList arrayList4 = new ArrayList();
                        org.telegram.ui.an anVar = this.P2;
                        TLRPC.Chat g10 = anVar == null ? null : anVar.g();
                        TLRPC.UserFull P8 = anVar == null ? this.K : anVar.P8();
                        if (g10 != null) {
                            if (!org.telegram.messenger.t3.v(g10)) {
                            }
                            f10 = 1.0f;
                        } else if (P8 == null) {
                            i11 = 1;
                            f10 = 1.0f;
                            float[] fArr13 = new float[i11];
                            fArr13[0] = 1.0f;
                            arrayList4.add(ObjectAnimator.ofFloat(eeVar, (Property<ee, Float>) property, fArr13));
                            float[] fArr14 = new float[i11];
                            fArr14[0] = 1.0f;
                            arrayList4.add(ObjectAnimator.ofFloat(eeVar, (Property<ee, Float>) property2, fArr14));
                            float[] fArr15 = new float[i11];
                            fArr15[0] = f10;
                            arrayList4.add(ObjectAnimator.ofFloat(eeVar, (Property<ee, Float>) property3, fArr15));
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
                                ke keVar10 = this.S0;
                                if (keVar10 != null && keVar10.getVisibility() == 0) {
                                    ke keVar11 = this.S0;
                                    float[] fArr19 = new float[i11];
                                    fArr19[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(keVar11, (Property<ke, Float>) property, fArr19));
                                    ke keVar12 = this.S0;
                                    float[] fArr20 = new float[i11];
                                    fArr20[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(keVar12, (Property<ke, Float>) property2, fArr20));
                                    ke keVar13 = this.S0;
                                    float[] fArr21 = new float[i11];
                                    fArr21[0] = 0.0f;
                                    arrayList4.add(ObjectAnimator.ofFloat(keVar13, (Property<ke, Float>) property3, fArr21));
                                } else if (egVar.getVisibility() == 0) {
                                    float[] fArr22 = new float[i11];
                                    fArr22[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(egVar, (Property<eg, Float>) property, fArr22));
                                    float[] fArr23 = new float[i11];
                                    fArr23[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(egVar, (Property<eg, Float>) property2, fArr23));
                                    float[] fArr24 = new float[i11];
                                    fArr24[0] = 0.0f;
                                    arrayList4.add(ObjectAnimator.ofFloat(egVar, (Property<eg, Float>) property3, fArr24));
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
                            this.r2.playTogether(arrayList4);
                            this.r2.setDuration(150L);
                            this.r2.addListener(new he(this, 7));
                            this.r2.start();
                        }
                        i11 = 1;
                        float[] fArr132 = new float[i11];
                        fArr132[0] = 1.0f;
                        arrayList4.add(ObjectAnimator.ofFloat(eeVar, (Property<ee, Float>) property, fArr132));
                        float[] fArr142 = new float[i11];
                        fArr142[0] = 1.0f;
                        arrayList4.add(ObjectAnimator.ofFloat(eeVar, (Property<ee, Float>) property2, fArr142));
                        float[] fArr152 = new float[i11];
                        fArr152[0] = f10;
                        arrayList4.add(ObjectAnimator.ofFloat(eeVar, (Property<ee, Float>) property3, fArr152));
                        if (imageView2.getVisibility() != 0) {
                        }
                        this.r2.playTogether(arrayList4);
                        this.r2.setDuration(150L);
                        this.r2.addListener(new he(this, 7));
                        this.r2.start();
                    }
                }
            } else if (!z14) {
                egVar.setScaleX(0.1f);
                egVar.setScaleY(0.1f);
                egVar.setAlpha(0.0f);
                setSlowModeButtonVisible(false);
                getSendButtonInternal().setScaleX(0.1f);
                getSendButtonInternal().setScaleY(0.1f);
                getSendButtonInternal().setAlpha(0.0f);
                getSendButtonInternal().setVisibility(8);
                imageView2.setScaleX(0.1f);
                imageView2.setScaleY(0.1f);
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                eeVar.setScaleX(0.1f);
                eeVar.setScaleY(0.1f);
                eeVar.setAlpha(0.0f);
                deVar2.setVisibility(8);
                R();
                this.S0.setScaleX(1.0f);
                this.S0.setScaleY(1.0f);
                this.S0.setAlpha(1.0f);
                this.S0.setVisibility(0);
                if (tVar != null) {
                    if (getVisibility() == 0) {
                        this.Z2.h2();
                    }
                    tVar.setVisibility(0);
                    J1(1);
                }
                this.L1 = false;
                wf wfVar6 = this.Z2;
                boolean z22 = wfVar6 != null && wfVar6.v0();
                if (z22) {
                    W();
                }
                ie ieVar3 = this.J1;
                if (ieVar3 != null) {
                    if (z22) {
                        ieVar3.setVisibility(0);
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
                if (tVar != null && this.w2 == 0) {
                    tVar.setVisibility(0);
                    this.s2 = new AnimatorSet();
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(ObjectAnimator.ofFloat(tVar, tdVar, 1.0f));
                    arrayList5.add(ObjectAnimator.ofFloat(tVar, (Property<bi.t, Float>) property, 1.0f));
                    lh.h hVar5 = this.i5;
                    if (hVar5 != null) {
                        hVar5.e(0, false, true);
                    }
                    if (kVar != null) {
                        ViewPropertyAnimator viewPropertyAnimator5 = this.q1;
                        if (viewPropertyAnimator5 != null) {
                            viewPropertyAnimator5.cancel();
                            this.q1 = null;
                        }
                        this.v1 = 1.0f;
                        arrayList5.add(ObjectAnimator.ofFloat(kVar, (Property<kg.k, Float>) property3, 1.0f));
                        arrayList5.add(ObjectAnimator.ofFloat(kVar, (Property<kg.k, Float>) property, 1.0f));
                        arrayList5.add(ObjectAnimator.ofFloat(kVar, (Property<kg.k, Float>) property2, 1.0f));
                    }
                    wf wfVar7 = this.Z2;
                    boolean z23 = wfVar7 != null && wfVar7.v0();
                    this.L1 = false;
                    if (z23) {
                        W();
                    }
                    ie ieVar4 = this.J1;
                    if (ieVar4 != null) {
                        ieVar4.setScaleY(1.0f);
                        if (z23) {
                            this.J1.setVisibility(0);
                            this.J1.setTag(1);
                            this.J1.setPivotX(org.telegram.messenger.g0.L(44.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(this.J1, (Property<ie, Float>) property3, 1.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(this.J1, (Property<ie, Float>) property, 1.0f));
                            arrayList5.add(m(0.0f));
                        } else {
                            this.J1.setAlpha(1.0f);
                            this.J1.setScaleX(1.0f);
                            this.J1.setTranslationX(0.0f);
                        }
                    }
                    this.s2.playTogether(arrayList5);
                    this.s2.setDuration(100L);
                    this.s2.addListener(new he(this, 4));
                    this.s2.start();
                    J1(1);
                    if (getVisibility() == 0) {
                        this.Z2.h2();
                    }
                }
                R();
                this.S0.setVisibility(0);
                this.r2 = new AnimatorSet();
                this.v2 = 4;
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(ObjectAnimator.ofFloat(this.S0, (Property<ke, Float>) property, 1.0f));
                arrayList6.add(ObjectAnimator.ofFloat(this.S0, (Property<ke, Float>) property2, 1.0f));
                arrayList6.add(ObjectAnimator.ofFloat(this.S0, (Property<ke, Float>) property3, 1.0f));
                if (imageView2.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                } else if (deVar2.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(eeVar, (Property<ee, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(eeVar, (Property<ee, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(eeVar, (Property<ee, Float>) property3, 0.0f));
                } else if (egVar.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(egVar, (Property<eg, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(egVar, (Property<eg, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(egVar, (Property<eg, Float>) property3, 0.0f));
                } else {
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property3, 0.0f));
                }
                this.r2.playTogether(arrayList6);
                this.r2.setDuration(250L);
                this.r2.addListener(new he(this, 5));
                this.r2.start();
            }
        } else if (egVar.getVisibility() != 0) {
            if (!z14) {
                egVar.setScaleX(1.0f);
                egVar.setScaleY(1.0f);
                egVar.setAlpha(1.0f);
                setSlowModeButtonVisible(true);
                eeVar.setScaleX(0.1f);
                eeVar.setScaleY(0.1f);
                eeVar.setAlpha(0.0f);
                deVar2.setVisibility(8);
                getSendButtonInternal().setScaleX(0.1f);
                getSendButtonInternal().setScaleY(0.1f);
                getSendButtonInternal().setAlpha(0.0f);
                getSendButtonInternal().setVisibility(8);
                imageView2.setScaleX(0.1f);
                imageView2.setScaleY(0.1f);
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                ke keVar14 = this.S0;
                if (keVar14 == null || keVar14.getVisibility() != 0) {
                    i12 = 8;
                } else {
                    this.S0.setScaleX(0.1f);
                    this.S0.setScaleY(0.1f);
                    this.S0.setAlpha(0.0f);
                    i12 = 8;
                    this.S0.setVisibility(8);
                }
                if (tVar != null) {
                    tVar.setVisibility(i12);
                    if (this.Z2 != null && getVisibility() == 0) {
                        this.Z2.r0();
                    }
                    z12 = false;
                    J1(0);
                    lh.h hVar6 = this.i5;
                    if (hVar6 != null) {
                        hVar6.e(0, false, false);
                    }
                    if (kVar != null) {
                        this.v1 = 0.0f;
                        kVar.setAlpha(0.0f);
                        kVar.setScaleX(0.5f);
                        kVar.setScaleY(0.5f);
                    }
                } else {
                    z12 = false;
                }
                this.L1 = z12;
                wf wfVar8 = this.Z2;
                boolean z24 = wfVar8 != null && wfVar8.v0();
                if (z24) {
                    W();
                }
                ie ieVar5 = this.J1;
                if (ieVar5 != null) {
                    if (z24) {
                        ieVar5.setVisibility(0);
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
                if (tVar != null) {
                    this.s2 = new AnimatorSet();
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(ObjectAnimator.ofFloat(tVar, tdVar, 0.0f));
                    arrayList7.add(ObjectAnimator.ofFloat(tVar, (Property<bi.t, Float>) property, 0.5f));
                    this.L1 = false;
                    wf wfVar9 = this.Z2;
                    boolean z25 = wfVar9 != null && wfVar9.v0();
                    if (z25) {
                        W();
                    }
                    lh.h hVar7 = this.i5;
                    if (hVar7 != null) {
                        hVar7.e(0, false, true);
                    }
                    if (kVar != null) {
                        this.v1 = 0.0f;
                        arrayList7.add(ObjectAnimator.ofFloat(kVar, (Property<kg.k, Float>) property3, 0.0f));
                        arrayList7.add(ObjectAnimator.ofFloat(kVar, (Property<kg.k, Float>) property, 0.5f));
                        arrayList7.add(ObjectAnimator.ofFloat(kVar, (Property<kg.k, Float>) property2, 0.5f));
                    }
                    ie ieVar6 = this.J1;
                    if (ieVar6 != null) {
                        ieVar6.setScaleY(1.0f);
                        if (z25) {
                            this.J1.setVisibility(0);
                            this.J1.setTag(1);
                            this.J1.setPivotX(org.telegram.messenger.g0.L(44.0f));
                            arrayList7.add(m(0.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.J1, (Property<ie, Float>) property3, 1.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.J1, (Property<ie, Float>) property, 1.0f));
                        } else {
                            this.J1.setTranslationX(0.0f);
                            this.J1.setAlpha(1.0f);
                            this.J1.setScaleX(1.0f);
                        }
                    }
                    this.s2.playTogether(arrayList7);
                    this.s2.setDuration(100L);
                    this.s2.addListener(new he(this, 2));
                    this.s2.start();
                    J1(0);
                    if (this.Z2 != null && getVisibility() == 0) {
                        this.Z2.r0();
                    }
                }
                this.v2 = 5;
                this.r2 = new AnimatorSet();
                ArrayList arrayList8 = new ArrayList();
                if (deVar2.getVisibility() == 0) {
                    i13 = 1;
                    r43 = 0;
                    arrayList8.add(ObjectAnimator.ofFloat(eeVar, (Property<ee, Float>) property, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(eeVar, (Property<ee, Float>) property2, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(eeVar, (Property<ee, Float>) property3, 0.0f));
                } else {
                    r43 = 0;
                    i13 = 1;
                }
                ke keVar15 = this.S0;
                if (keVar15 != null && keVar15.getVisibility() == 0) {
                    ke keVar16 = this.S0;
                    float[] fArr28 = new float[i13];
                    fArr28[r43] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(keVar16, (Property<ke, Float>) property, fArr28));
                    ke keVar17 = this.S0;
                    float[] fArr29 = new float[i13];
                    fArr29[r43] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(keVar17, (Property<ke, Float>) property2, fArr29));
                    ke keVar18 = this.S0;
                    float[] fArr30 = new float[i13];
                    fArr30[r43] = 0.0f;
                    arrayList8.add(ObjectAnimator.ofFloat(keVar18, (Property<ke, Float>) property3, fArr30));
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
                arrayList8.add(ObjectAnimator.ofFloat(egVar, (Property<eg, Float>) property, fArr34));
                float[] fArr35 = new float[1];
                fArr35[r43] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(egVar, (Property<eg, Float>) property2, fArr35));
                float[] fArr36 = new float[1];
                fArr36[r43] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(egVar, (Property<eg, Float>) property3, fArr36));
                setSlowModeButtonVisible(true);
                this.r2.playTogether(arrayList8);
                this.r2.setDuration(220L);
                this.r2.setInterpolator(xq.h);
                this.r2.addListener(new he(this, 3));
                this.r2.start();
            }
        }
        geVar = geVar2;
        z11 = false;
        if (this.A4) {
        }
    }

    public final void E0() {
        xe xeVar;
        this.j2 = false;
        ad adVar = this.N4;
        if (adVar != null) {
            org.telegram.messenger.g0.r(adVar);
            this.N4 = null;
        }
        if (g0() && s()) {
            return;
        }
        getVisibility();
        if (!this.l2 || org.telegram.ui.ActionBar.f2.hasSheets(this.P2)) {
            return;
        }
        this.l2 = false;
        wf wfVar = this.Z2;
        if (wfVar != null) {
            wfVar.f1();
        }
        if (this.R1 == 0 && (xeVar = this.E0) != null) {
            xeVar.requestFocus();
        }
        org.telegram.messenger.g0.K3(this.E0);
        if (org.telegram.messenger.g0.D || this.z2 || org.telegram.messenger.g0.E) {
            return;
        }
        this.k3 = true;
        je jeVar = this.r3;
        org.telegram.messenger.g0.r(jeVar);
        org.telegram.messenger.g0.i3(jeVar, 100L);
    }

    public final void E1() {
        int e10;
        v4.b0 b0Var;
        int L0;
        View m10;
        ve veVar = this.m0;
        if (veVar == null) {
            return;
        }
        int childCount = veVar.c.getChildCount();
        int i7 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.m0.c.getChildAt(i10);
            if (i10 < 4) {
                i7 += childAt.getMeasuredHeight();
            }
        }
        rt0 rt0Var = this.m1;
        if (i7 > 0) {
            e10 = jg.g.e(childCount > 4 ? 12.0f : 0.0f, (rt0Var.getMeasuredHeight() - i7) - org.telegram.messenger.g0.L(8.0f), 0);
        } else {
            e10 = this.n0.c.size() > 4 ? jg.g.e(162.8f, rt0Var.getMeasuredHeight(), 0) : jg.g.e((Math.max(1, Math.min(4, this.n0.c.size())) * 36) + 8, rt0Var.getMeasuredHeight(), 0);
        }
        if (this.m0.c.getPaddingTop() != e10) {
            this.m0.c.setTopGlowOffset(e10);
            if (this.Z4 == -1 && this.m0.getVisibility() == 0 && this.m0.c.getLayoutManager() != null && (L0 = (b0Var = (v4.b0) this.m0.c.getLayoutManager()).L0()) >= 0 && (m10 = b0Var.m(L0)) != null) {
                this.Z4 = L0;
                this.a5 = m10.getTop() - this.m0.c.getPaddingTop();
            }
            this.m0.c.setPadding(0, e10, 0, org.telegram.messenger.g0.L(8.0f));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:163|(1:243)(1:167)|168|(8:170|(1:198)(1:174)|(1:197)(1:180)|181|(4:183|(1:185)(1:191)|186|(1:190))|(1:193)|194|(1:196))|199|(3:201|(1:203)(1:205)|204)|206|(3:(1:209)|(2:213|(1:223))|224)|225|(4:227|(1:241)(1:231)|232|(5:234|235|236|237|238))|242|235|236|237|238) */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x034a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F0(View view) {
        org.telegram.ui.an anVar;
        int measuredHeight;
        TLRPC.User j3;
        xe xeVar;
        org.telegram.messenger.mj mjVar;
        org.telegram.messenger.kj kjVar;
        ArrayList arrayList;
        ge geVar;
        t40 t40Var;
        boolean z9;
        org.telegram.messenger.mj mjVar2;
        int i7;
        boolean z10;
        boolean z11;
        boolean z12;
        xe xeVar2;
        int i10 = 0;
        if (c() || (((anVar = this.P2) != null && anVar.f4 == 5) || this.m5.f)) {
            return false;
        }
        boolean z13 = this.A4;
        int i11 = 3;
        ge geVar2 = this.J0;
        org.telegram.ui.ActionBar.f6 f6Var = this.W3;
        int i12 = 2;
        boolean z14 = true;
        if (z13 || !(((xeVar = this.E0) != null && !TextUtils.isEmpty(xeVar.getText())) || anVar == null || (mjVar = anVar.v5) == null || (kjVar = mjVar.b) == null || (arrayList = kjVar.e) == null || arrayList.isEmpty())) {
            boolean z15 = anVar != null && org.telegram.messenger.t10.B(anVar.j());
            if (this.O0 == null) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(this.O2, f6Var);
                this.O0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                this.O0.setOnTouchListener(new se(this));
                this.O0.setDispatchKeyEventListener(new jd(this));
                this.O0.setShownFromBottom(false);
                boolean z16 = anVar != null && anVar.R6();
                boolean z17 = !z15 && (this.G0 <= 0 || c());
                if (z16) {
                    boolean z18 = !z17;
                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, getContext(), this.W3, true, z18);
                    this.G4 = z0Var;
                    if (z15) {
                        z0Var.j(org.telegram.messenger.hd.M0(2131745515, null), R.drawable.msg_calendar2, null);
                    } else {
                        z0Var.j(org.telegram.messenger.hd.M0(2131745860, null), R.drawable.msg_calendar2, null);
                    }
                    this.G4.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    this.G4.setOnClickListener(new cd(this, 11));
                    this.O0.a(this.G4, c8.ha.o(-1, 44));
                    int i13 = org.telegram.messenger.iz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    edit.putInt("scheduledHintShows", 3);
                    edit.apply();
                    if (!z15 && this.Q2 > 0) {
                        org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(0, getContext(), this.W3, true, z18);
                        this.c = z0Var2;
                        z0Var2.j(org.telegram.messenger.hd.M0(2131745587, null), R.drawable.msg_online, null);
                        this.c.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                        this.c.setOnClickListener(new cd(this, 12));
                        this.O0.a(this.c, c8.ha.o(-1, 44));
                    }
                }
                if (z17) {
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(0, getContext(), this.W3, !z16, true);
                    z0Var3.j(org.telegram.messenger.hd.M0(2131745584, null), R.drawable.input_notify_off, null);
                    z0Var3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    z0Var3.setOnClickListener(new cd(this, 13));
                    this.O0.a(z0Var3, c8.ha.o(-1, 44));
                }
                te teVar = new te(this, this.O0);
                this.N0 = teVar;
                teVar.b = false;
                teVar.setAnimationStyle(R.style.PopupContextAnimation2);
                this.N0.setOutsideTouchable(true);
                this.N0.setClippingEnabled(true);
                this.N0.setInputMethodMode(2);
                this.N0.setSoftInputMode(0);
                this.N0.getContentView().setFocusableInTouchMode(true);
                int i14 = org.telegram.messenger.iz.a;
                SharedPreferences.Editor edit2 = org.telegram.messenger.qp.e1().edit();
                edit2.putInt("scheduledOrNoSoundHintShows", 3);
                edit2.apply();
                wf wfVar = this.Z2;
                if (wfVar != null) {
                    wfVar.d2();
                }
            }
            org.telegram.ui.ActionBar.z0 z0Var4 = this.G4;
            if (z0Var4 != null) {
                z0Var4.setVisibility(this.O ? 8 : 0);
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
            this.O0.setupRadialSelectors(f0(org.telegram.ui.ActionBar.k6.I5));
            this.O0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
            this.N0.setFocusable(true);
            int[] iArr = this.N2;
            view.getLocationInWindow(iArr);
            if (this.z2) {
                int measuredHeight2 = getMeasuredHeight();
                View view2 = this.G1;
                if (measuredHeight2 > org.telegram.messenger.g0.L((view2 == null || view2.getVisibility() != 0) ? 58.0f : 102.0f)) {
                    measuredHeight = view.getMeasuredHeight() + iArr[1];
                    this.N0.showAtLocation(view, 51, org.telegram.messenger.g0.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.O0.getMeasuredWidth()), measuredHeight);
                    this.N0.b();
                    geVar2.invalidate();
                    view.performHapticFeedback(3, 2);
                    return true;
                }
            }
            measuredHeight = (iArr[1] - this.O0.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f);
            this.N0.showAtLocation(view, 51, org.telegram.messenger.g0.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.O0.getMeasuredWidth()), measuredHeight);
            this.N0.b();
            geVar2.invalidate();
            view.performHapticFeedback(3, 2);
            return true;
        }
        ue ueVar = this.L0;
        if (ueVar != null) {
            ueVar.g(false);
        }
        org.telegram.messenger.g0.r(this.F4);
        ue ueVar2 = new ue(this, getContext(), f6Var, i10);
        this.L0 = ueVar2;
        ueVar2.setOnDismissListener(new p0(this, i11));
        boolean z19 = (this.d3 == null && ((xeVar2 = this.E0) == null || TextUtils.isEmpty(xeVar2.getText()))) ? false : true;
        ArrayList arrayList2 = new ArrayList();
        try {
            if (this.E1 != null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.out = true;
                tL_message.peer_id = org.telegram.messenger.qp.s1(this.Q).z1(this.Q2);
                tL_message.from_id = org.telegram.messenger.qp.s1(this.Q).z1(org.telegram.messenger.p10.i(this.Q).e());
                tL_message.rich_message = this.E1;
                org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(this.Q, tL_message, false, true);
                org.telegram.messenger.ij ijVar2 = this.T2;
                if (ijVar2 != null && !ijVar2.p) {
                    ijVar.C = ijVar2;
                }
                ijVar.U2 = Boolean.TRUE;
                ijVar.n0(null);
                ijVar.u1 = true;
                ijVar.z0 = true;
                arrayList2.add(ijVar);
                geVar = geVar2;
            } else if (this.b3 != null) {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.id = 0;
                tL_message2.out = true;
                geVar = geVar2;
                tL_message2.peer_id = org.telegram.messenger.qp.s1(this.Q).z1(this.Q2);
                tL_message2.from_id = org.telegram.messenger.qp.s1(this.Q).z1(org.telegram.messenger.p10.i(this.Q).e());
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message2.media = tL_messageMediaDocument;
                tL_messageMediaDocument.voice = true;
                tL_messageMediaDocument.document = this.b3;
                tL_message2.send_state = 1;
                tL_message2.attachPath = this.c3;
                org.telegram.messenger.ij ijVar3 = new org.telegram.messenger.ij(this.Q, tL_message2, false, true);
                org.telegram.messenger.ij ijVar4 = this.T2;
                if (ijVar4 != null && !ijVar4.p) {
                    ijVar3.C = ijVar4;
                }
                ijVar3.U2 = Boolean.TRUE;
                ijVar3.n0(null);
                ijVar3.u1 = true;
                ijVar3.z0 = true;
                arrayList2.add(ijVar3);
            } else {
                geVar = geVar2;
                if (z19) {
                    TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                    tL_message3.id = 0;
                    tL_message3.out = true;
                    tL_message3.peer_id = org.telegram.messenger.qp.s1(this.Q).z1(this.Q2);
                    tL_message3.from_id = org.telegram.messenger.qp.s1(this.Q).z1(org.telegram.messenger.p10.i(this.Q).e());
                    xe xeVar3 = this.E0;
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(xeVar3 == null ? "" : xeVar3.getTextToUse())};
                    org.telegram.messenger.ij.d(charSequenceArr[0], true);
                    tL_message3.entities.addAll(org.telegram.messenger.ui.b0(this.Q).W(charSequenceArr, true, true));
                    tL_message3.message = charSequenceArr[0].toString();
                    org.telegram.messenger.ij ijVar5 = this.T2;
                    if (ijVar5 != null && !ijVar5.p) {
                        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                        org.telegram.messenger.ij ijVar6 = this.U2;
                        if (ijVar6 != null) {
                            tL_messageReplyHeader.flags |= 2;
                            tL_messageReplyHeader.reply_to_top_id = ijVar6.f1();
                        }
                        tL_messageReplyHeader.flags |= 16;
                        tL_messageReplyHeader.reply_to_msg_id = this.T2.f1();
                        tL_message3.reply_to = tL_messageReplyHeader;
                    }
                    if (this.X2 != null) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                        tL_messageMediaWebPage.webpage = this.X2;
                        if (anVar != null && (mjVar2 = anVar.v5) != null && mjVar2.o) {
                            boolean z20 = mjVar2.q;
                            tL_messageMediaWebPage.force_small_media = z20;
                            tL_messageMediaWebPage.force_large_media = !z20;
                            tL_message3.invert_media = mjVar2.r;
                        }
                        tL_message3.media = tL_messageMediaWebPage;
                    }
                    org.telegram.messenger.ij ijVar7 = new org.telegram.messenger.ij(this.Q, tL_message3, false, false);
                    org.telegram.messenger.ij ijVar8 = this.T2;
                    if (ijVar8 != null && !ijVar8.p) {
                        ijVar7.C = ijVar8;
                    }
                    ijVar7.z0 = true;
                    ijVar7.U2 = Boolean.TRUE;
                    ijVar7.D = 0;
                    ijVar7.n0(null);
                    ijVar7.u1 = true;
                    arrayList2.add(ijVar7);
                } else if (anVar != null && (t40Var = anVar.p3) != null && t40Var.getTextureView() != null) {
                    ue ueVar3 = this.L0;
                    TextureView textureView = anVar.p3.getTextureView();
                    ueVar3.getClass();
                    if (textureView != null) {
                        ueVar3.k0 = new RectF();
                        int[] iArr2 = new int[2];
                        textureView.getLocationOnScreen(iArr2);
                        ueVar3.k0.set(iArr2[0], iArr2[1], textureView.getWidth() + r14, textureView.getHeight() + iArr2[1]);
                    }
                    z9 = true;
                    this.L0.p(arrayList2);
                    i7 = 4;
                    if (z19 && this.b3 == null) {
                        ue ueVar4 = this.L0;
                        xe xeVar4 = this.E0;
                        d dVar = new d(this, i7);
                        ld ldVar = new ld(this, i12);
                        ueVar4.R = xeVar4;
                        ueVar4.T = dVar;
                        ueVar4.U = ldVar;
                    }
                    this.L0.q(geVar, true, new di.a2(i7, this, z19));
                    if ((!z19 || z9) && this.Q2 >= 0) {
                        this.L0.c(anVar);
                        this.L0.n(this.S4);
                    }
                    k60 F = k60.F(this, f6Var, geVar);
                    z10 = anVar == null && org.telegram.messenger.t10.B(anVar.j());
                    z11 = anVar == null && anVar.R6();
                    if (!z10 || (this.G0 > 0 && !c())) {
                        z14 = false;
                    }
                    if (z11) {
                        F.c(R.drawable.msg_calendar2, org.telegram.messenger.hd.M0(z10 ? 2131745515 : 2131745860, null), new ad(this, 19), false);
                        if (!z10 && this.Q2 > 0) {
                            F.c(R.drawable.msg_online, org.telegram.messenger.hd.M0(2131745587, null), new ad(this, 20), false);
                            this.c = F.y();
                        }
                    }
                    if (anVar == null && this.Z2 != null && org.telegram.messenger.t3.p0(anVar.e)) {
                        z12 = false;
                        F.c(R.drawable.input_suggest_paid_24, org.telegram.messenger.hd.M0(2131747068, null), new ad(this, 18), false);
                    } else {
                        z12 = false;
                    }
                    if (z14) {
                        F.c(R.drawable.input_notify_off, org.telegram.messenger.hd.M0(2131745584, null), new id(this, z19, i12), z12);
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
        z9 = false;
        this.L0.p(arrayList2);
        i7 = 4;
        if (z19) {
            ue ueVar42 = this.L0;
            xe xeVar42 = this.E0;
            d dVar2 = new d(this, i7);
            ld ldVar2 = new ld(this, i12);
            ueVar42.R = xeVar42;
            ueVar42.T = dVar2;
            ueVar42.U = ldVar2;
        }
        this.L0.q(geVar, true, new di.a2(i7, this, z19));
        if (!z19) {
        }
        this.L0.c(anVar);
        this.L0.n(this.S4);
        k60 F2 = k60.F(this, f6Var, geVar);
        if (anVar == null) {
        }
        if (anVar == null) {
        }
        if (!z10) {
        }
        z14 = false;
        if (z11) {
        }
        if (anVar == null) {
        }
        z12 = false;
        if (z14) {
        }
        F2.Y();
        if (this.c != null) {
        }
        this.L0.o(F2);
        this.L0.show();
    }

    public final void F1(boolean z9) {
        if (this.q5 != 1 && this.Q2 > 0) {
            N();
        }
        hi.y yVar = this.l0;
        if (yVar != null) {
            yVar.setWebView(g0());
        }
        D1(z9);
    }

    public final void G() {
        if (this.U0 == null) {
            return;
        }
        Point point = org.telegram.messenger.g0.q;
        int i7 = point.x > point.y ? this.y2 : this.x2;
        int L = ((((this.o1 - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
        int i10 = 2;
        if (this.R1 == 2) {
            L = Math.min(L, org.telegram.messenger.g0.L(175.0f) + i7);
        }
        int i11 = this.U0.getLayoutParams().height;
        if (i11 == L) {
            return;
        }
        AnimatorSet animatorSet = this.B3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.B3 = null;
        }
        this.D3 = L;
        org.telegram.ui.Cells.g1 g1Var = this.t3;
        if (i11 > L) {
            ad adVar = new ad(this, 7);
            this.U0.setLayerType(2, null);
            if (this.w) {
                this.x = adVar;
            } else {
                AnimatorSet animatorSet2 = new AnimatorSet();
                if (this.h5 != null) {
                    animatorSet2.playTogether(ValueAnimator.ofInt(-(this.D3 - i7)), ValueAnimator.ofInt(-(this.D3 - i7)));
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.D3 - i7)), ObjectAnimator.ofInt(this.U0, g1Var, -(this.D3 - i7)));
                    ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new zc(this, i10));
                }
                animatorSet2.setDuration(300L);
                animatorSet2.setInterpolator(xq.f);
                animatorSet2.addListener(new ah.l(24, this, adVar));
                this.B3 = animatorSet2;
                animatorSet2.start();
            }
        } else {
            if (this.h5 == null) {
                this.U0.getLayoutParams().height = this.D3;
            }
            this.m1.requestLayout();
            xe xeVar = this.E0;
            if (xeVar != null) {
                int selectionStart = xeVar.getSelectionStart();
                int selectionEnd = this.E0.getSelectionEnd();
                xe xeVar2 = this.E0;
                xeVar2.setText(xeVar2.getText());
                this.E0.setSelection(selectionStart, selectionEnd);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            if (this.h5 != null) {
                animatorSet3.playTogether(ValueAnimator.ofInt(-(this.D3 - i7)), ValueAnimator.ofInt(-(this.D3 - i7)));
            } else {
                animatorSet3.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.D3 - i7)), ObjectAnimator.ofInt(this.U0, g1Var, -(this.D3 - i7)));
                ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new zc(this, 3));
            }
            animatorSet3.setDuration(300L);
            animatorSet3.setInterpolator(xq.f);
            animatorSet3.addListener(new he(this, 11));
            this.B3 = animatorSet3;
            this.U0.setLayerType(2, null);
            animatorSet3.start();
        }
        rh.e eVar = this.h5;
        if (eVar != null) {
            ((rh.h) eVar).h(L);
        }
    }

    public final void G0() {
        int height = this.m1.getHeight();
        if (!this.z2) {
            height -= this.A2;
        }
        wf wfVar = this.Z2;
        if (wfVar != null) {
            wfVar.V1(height);
        }
        if (this.G1 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(72.0f);
            te.a aVar = this.k5;
            if (height < currentActionBarHeight) {
                if (this.h3) {
                    this.h3 = false;
                    if (this.g3) {
                        aVar.a(false, false);
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
                aVar.a(true, false);
            }
        }
    }

    public final void G1() {
        xe xeVar = this.E0;
        boolean z9 = false;
        p1((xeVar == null || xeVar.getLineCount() <= 2 || this.E0.getText() == null || TextUtils.isEmpty(this.E0.getText().toString().trim())) ? false : true);
        xe xeVar2 = this.E0;
        if (xeVar2 != null && xeVar2.getLineCount() > 2 && this.E0.getText() != null && !TextUtils.isEmpty(this.E0.getText().toString().trim())) {
            z9 = true;
        }
        v1(z9);
    }

    public final void H() {
        this.o5 = v(true);
        float v = v(false);
        if (this.n5 != v) {
            this.n5 = v;
            A0(v);
        }
    }

    public void H0() {
        if ((g0() && s()) || org.telegram.ui.ActionBar.f2.hasSheets(this.P2)) {
            return;
        }
        wf wfVar = this.Z2;
        if (wfVar != null) {
            wfVar.f1();
        }
        xe xeVar = this.E0;
        if (xeVar == null || org.telegram.messenger.g0.K3(xeVar)) {
            return;
        }
        this.E0.clearFocus();
        this.E0.requestFocus();
    }

    public final void H1() {
        float f10 = this.r * this.h;
        wd wdVar = this.Q0;
        wdVar.setScaleX(f10);
        wdVar.setScaleY(this.r * this.h);
        wdVar.setAlpha(this.s * this.n);
    }

    public final void I() {
        float f10 = this.k5.e;
        if (this.G1 != null) {
            float measuredHeight = getMeasuredHeight() - this.j5.f;
            this.G1.setTranslationY(measuredHeight - (r4.getMeasuredHeight() * f10));
            this.G1.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        boolean z9 = f10 > 0.0f;
        if (this.M4 == z9) {
            return;
        }
        ud udVar = this.z1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) udVar.getLayoutParams();
        int i7 = z9 ? this.G1.getLayoutParams().height : 0;
        layoutParams.topMargin = i7;
        layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f) + i7;
        udVar.setLayoutParams(layoutParams);
        this.M4 = z9;
        setMinimumHeight(org.telegram.messenger.g0.L(44.0f) + (z9 ? this.G1.getLayoutParams().height : 0));
        if (this.z3) {
            if (this.R1 == 0) {
                n1(false, true, false, true);
            } else {
                G();
            }
        }
    }

    public final void I0() {
        if (g0() && s()) {
            return;
        }
        org.telegram.ui.an anVar = this.P2;
        if (org.telegram.ui.ActionBar.f2.hasSheets(anVar)) {
            return;
        }
        t1((org.telegram.messenger.g0.D || org.telegram.messenger.g0.E || (anVar != null && anVar.isInBubbleMode()) || this.j2) ? 0 : 2, 0, true, true);
        wf wfVar = this.Z2;
        if (wfVar != null) {
            wfVar.f1();
        }
        xe xeVar = this.E0;
        if (xeVar != null) {
            xeVar.requestFocus();
        }
        org.telegram.messenger.g0.K3(this.E0);
        if (this.j2) {
            this.l2 = true;
            return;
        }
        if (org.telegram.messenger.g0.D || this.z2 || org.telegram.messenger.g0.E) {
            return;
        }
        if (anVar == null || !anVar.isInBubbleMode()) {
            this.k3 = true;
            mf mfVar = this.U0;
            if (mfVar != null) {
                mfVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
            }
            je jeVar = this.r3;
            org.telegram.messenger.g0.r(jeVar);
            org.telegram.messenger.g0.i3(jeVar, 100L);
        }
    }

    public final void I1(boolean z9) {
        boolean z10;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        org.telegram.messenger.ij ijVar;
        TLRPC.ReplyMarkup replyMarkup;
        TLRPC.ReplyMarkup replyMarkup2;
        xe xeVar = this.E0;
        if (xeVar == null) {
            return;
        }
        CharSequence charSequence = this.e;
        boolean z11 = false;
        if (charSequence != null) {
            xeVar.r(charSequence, z9);
            xe xeVar2 = this.E0;
            String str3 = this.f;
            rs rsVar = xeVar2.u0;
            if (rsVar != null) {
                if (!org.telegram.messenger.hd.a0 && z9) {
                    z11 = true;
                }
                rsVar.t(str3, z11, true);
                return;
            }
            return;
        }
        if (!this.z0 && !q0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jg.g.l(2131747220, "PlainTextRestrictedHint", new StringBuilder(" d ")));
            spannableStringBuilder.setSpan(new wp(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
            this.E0.r(spannableStringBuilder, z9);
            this.E0.setText((CharSequence) null);
            this.E0.setEnabled(false);
            this.E0.setInputType(1);
            return;
        }
        this.E0.setEnabled(true);
        int inputType = this.E0.getInputType();
        int i7 = this.a;
        if (inputType != i7) {
            this.E0.setInputType(i7);
        }
        T1();
        org.telegram.ui.an anVar = this.P2;
        boolean z12 = anVar != null && anVar.f4 == 8 && anVar.h4;
        long N1 = anVar != null ? anVar.getMessagesController().N1(anVar.a()) : 0L;
        if (N1 > 0) {
            N1 *= getMessagesCount();
        }
        int i10 = anVar != null ? anVar.f4 : -1;
        if (i10 == 9) {
            this.E0.setHintText(org.telegram.messenger.hd.M0(2131742896, null));
            return;
        }
        if (i10 == 5) {
            if ("hello".equalsIgnoreCase(anVar.e4)) {
                this.E0.setHintText(org.telegram.messenger.hd.M0(2131752767, null));
                return;
            } else if ("away".equalsIgnoreCase(anVar.e4)) {
                this.E0.setHintText(org.telegram.messenger.hd.M0(2131752836, null));
                return;
            } else {
                this.E0.setHintText(org.telegram.messenger.hd.M0(2131752672, null));
                return;
            }
        }
        wp[] wpVarArr = this.O4;
        if (z12) {
            this.E0.setHintText(N1 > 0 ? bi.dd.T0(org.telegram.messenger.hd.a0(null, null, 2131744404, org.telegram.messenger.hd.E((int) N1, ','), wpVarArr)) : org.telegram.messenger.hd.a0(null, null, 2131744405, new Object[0]));
            wp wpVar = wpVarArr[0];
            if (wpVar != null) {
                wpVar.G = 0.9f;
                return;
            }
            return;
        }
        if (this.b2 != null) {
            this.E0.setHintText(org.telegram.messenger.hd.M0(2131752706, null));
            return;
        }
        org.telegram.messenger.ij ijVar2 = this.T2;
        if (ijVar2 != null && (replyMarkup2 = ijVar2.k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
            this.E0.r(this.T2.k.reply_markup.placeholder, z9);
            return;
        }
        if (this.Z1 != null) {
            this.E0.setHintText(this.a2 ? org.telegram.messenger.hd.M0(2131752561, null) : org.telegram.messenger.hd.M0(2131743929, null));
            return;
        }
        if (N1 > 0) {
            this.E0.setHintText(bi.dd.Y0(false, org.telegram.messenger.hd.a0(null, null, 2131743927, org.telegram.messenger.hd.E((int) N1, ',')), wpVarArr));
            wp wpVar2 = wpVarArr[0];
            if (wpVar2 != null) {
                wpVar2.G = 0.9f;
                return;
            }
            return;
        }
        if (this.X0 && (ijVar = this.m2) != null && (replyMarkup = ijVar.k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
            this.E0.r(this.m2.k.reply_markup.placeholder, z9);
            return;
        }
        if (anVar != null && anVar.R9()) {
            org.telegram.messenger.ij ijVar3 = this.U2;
            if (ijVar3 != null && (tL_forumTopic = ijVar3.h1) != null && (str2 = tL_forumTopic.title) != null) {
                this.E0.r(org.telegram.messenger.hd.a0(null, null, 2131743926, str2), z9);
                return;
            }
            TLRPC.TL_forumTopic f10 = org.telegram.messenger.qp.s1(this.Q).q7.f(anVar.e.id, 1L);
            if (f10 == null || (str = f10.title) == null) {
                this.E0.r(org.telegram.messenger.hd.M0(2131743929, null), z9);
                return;
            } else {
                this.E0.r(org.telegram.messenger.hd.a0(null, null, 2131743926, str), z9);
                return;
            }
        }
        if (org.telegram.messenger.m5.z(this.Q2)) {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.R.a).M0(Long.valueOf(-this.Q2));
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(this.R.a).N0(-this.Q2);
            z10 = org.telegram.messenger.t3.V(M0);
            z11 = !z10 && org.telegram.messenger.t3.M(M0, N0, false) == (-this.Q2);
        } else {
            z10 = false;
        }
        if (z11) {
            this.E0.setHintText(org.telegram.messenger.hd.M0(2131745639, "SendAnonymously"));
            return;
        }
        TLRPC.User a22 = org.telegram.messenger.qp.s1(this.R.a).a2(Long.valueOf(this.Q2));
        if (a22 != null && a22.bot_forum_view && !a22.bot_forum_can_manage_topics && anVar != null && !anVar.v4) {
            this.E0.setHintText(org.telegram.messenger.hd.M0(2131745634, null));
            return;
        }
        if (anVar != null && anVar.da() && !anVar.v4) {
            if (anVar.l4 == null || !anVar.u4) {
                this.E0.setHintText(org.telegram.messenger.hd.M0(2131746262, "Reply"));
                return;
            } else {
                this.E0.setHintText(org.telegram.messenger.hd.M0(2131752005, null));
                return;
            }
        }
        if (!z10) {
            this.E0.setHintText(org.telegram.messenger.hd.M0(2131743929, null));
        } else if (this.g2) {
            this.E0.r(org.telegram.messenger.hd.M0(2131752291, "ChannelSilentBroadcast"), z9);
        } else {
            this.E0.r(org.telegram.messenger.hd.M0(2131752447, "ChannelBroadcast"), z9);
        }
    }

    public final void J() {
        org.telegram.ui.an anVar = this.P2;
        if (anVar != null) {
            org.telegram.messenger.ui.b0(this.Q).Q1(anVar.a(), anVar.P7(anVar.D5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0() {
        org.telegram.ui.an anVar;
        Editable editable;
        li.b2 b2Var;
        CharSequence[] charSequenceArr;
        ArrayList W;
        if (this.E0 == null || (anVar = this.P2) == null) {
            return;
        }
        org.telegram.messenger.qp.s1(this.Q);
        boolean z9 = org.telegram.messenger.r2.a;
        TL_iv.RichMessage richMessage = this.E1;
        if (richMessage != null) {
            b2Var = new li.b2(richMessage);
        } else {
            Editable text = this.E0.getText();
            if (!TextUtils.isEmpty(text) && TextUtils.indexOf((CharSequence) text, '`') >= 0) {
                try {
                    charSequenceArr = new CharSequence[]{new SpannableStringBuilder(text)};
                    W = org.telegram.messenger.ui.b0(this.Q).W(charSequenceArr, true, true);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (W != null && !W.isEmpty()) {
                    editable = new SpannableStringBuilder(charSequenceArr[0]);
                    org.telegram.messenger.ij.b(editable, W, false, false, false, false, 0);
                    li.b2 b2Var2 = new li.b2(editable);
                    if (editable == text) {
                        int selectionStart = this.E0.getSelectionStart();
                        int selectionEnd = this.E0.getSelectionEnd();
                        if (selectionStart < 0) {
                            selectionStart = this.E0.length();
                        }
                        if (selectionEnd < 0) {
                            selectionEnd = selectionStart;
                        }
                        b2Var2.c = selectionStart;
                        b2Var2.d = selectionEnd;
                    }
                    b2Var2.L = new ad(this, 16);
                    b2Var = b2Var2;
                }
            }
            editable = text;
            li.b2 b2Var22 = new li.b2(editable);
            if (editable == text) {
            }
            b2Var22.L = new ad(this, 16);
            b2Var = b2Var22;
        }
        b2Var.setResourceProvider(this.W3);
        b2Var.J = anVar;
        b2Var.s = anVar.T;
        b2Var.w = anVar.Z;
        b2Var.K = new ad(this, 17);
        anVar.presentFragment(b2Var);
    }

    public final void J1(int i7) {
        ImageView imageView;
        ie ieVar;
        ie ieVar2;
        kg.k kVar;
        this.P4 = i7;
        if (this.E0 != null) {
            org.telegram.messenger.ij ijVar = this.Z1;
            if (ijVar == null || ijVar.q5()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E0.getLayoutParams();
                int i10 = layoutParams.rightMargin;
                boolean z9 = this.A4;
                ge geVar = this.J0;
                if (z9 && this.p5) {
                    layoutParams.rightMargin = Math.max(0, geVar.l() - org.telegram.messenger.g0.L(44.0f)) + org.telegram.messenger.g0.L(this.v4 ? 50.0f : 2.0f);
                } else if (i7 == 1 || i7 == 2) {
                    ke keVar = this.x1;
                    if (keVar == null || keVar.getVisibility() != 0 || (ieVar2 = this.J1) == null || ieVar2.getVisibility() != 0 || (kVar = this.r1) == null || kVar.getVisibility() != 0) {
                        ke keVar2 = this.x1;
                        if ((keVar2 == null || keVar2.getVisibility() != 0) && (((imageView = this.I1) == null || imageView.getVisibility() != 0) && ((ieVar = this.J1) == null || ieVar.getTag() == null))) {
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(50.0f);
                        } else {
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(98.0f);
                        }
                    } else {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(146.0f);
                    }
                } else {
                    ie ieVar3 = this.J1;
                    if (ieVar3 == null || ieVar3.getTag() == null) {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(2.0f);
                    } else {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(50.0f);
                    }
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, geVar.l() - org.telegram.messenger.g0.L(44.0f)));
                ge geVar2 = this.F1;
                if (geVar2 != null && geVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.F1.l() - org.telegram.messenger.g0.L(44.0f)));
                }
                if (i10 != layoutParams.rightMargin) {
                    this.E0.setLayoutParams(layoutParams);
                }
                ud udVar = this.e1;
                if (udVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) udVar.getLayoutParams();
                    layoutParams2.rightMargin = this.Z1 == null ? jg.g.e(44.0f, geVar.l(), 0) : 0;
                    this.e1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.qt0
    public final void K(int i7, boolean z9) {
        org.telegram.messenger.ij ijVar;
        xe xeVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z10;
        int i10;
        int i11;
        rh.e eVar;
        if (this.R1 != 0) {
            this.L2 = i7;
            this.M2 = z9;
            this.z2 = i7 > 0;
            z();
            return;
        }
        if (i7 > org.telegram.messenger.g0.L(50.0f) && this.z2 && !org.telegram.messenger.g0.E) {
            if (z9) {
                this.y2 = i7;
                org.telegram.messenger.qp.d1().edit().putInt("kbd_height_land3", this.y2).commit();
            } else {
                this.x2 = i7;
                org.telegram.messenger.qp.d1().edit().putInt("kbd_height", this.x2).commit();
            }
        }
        if (this.z2 && this.W0 && this.U0 == null) {
            this.W0 = false;
        }
        boolean s02 = s0();
        rt0 rt0Var = this.m1;
        org.telegram.ui.an anVar = this.P2;
        if (s02) {
            int i12 = z9 ? this.y2 : this.x2;
            if (anVar != null && anVar.getParentLayout() != null) {
                i12 -= ((ActionBarLayout) anVar.getParentLayout()).w(false);
            }
            if (this.f2 == 1) {
                jf jfVar = this.H1;
                if (!jfVar.f) {
                    i12 = Math.min(jfVar.getKeyboardHeight(), i12);
                }
            }
            int i13 = this.f2;
            ViewGroup viewGroup = i13 == 0 ? this.U0 : i13 == 1 ? this.H1 : null;
            jf jfVar2 = this.H1;
            if (jfVar2 != null) {
                jfVar2.setPanelHeight(i12);
                rh.e eVar2 = this.h5;
                if (eVar2 != null && i12 > 0 && this.f2 == 1) {
                    ((rh.h) eVar2).h(i12);
                }
            }
            if (viewGroup != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                if (!this.A3 && !this.z3 && (((i10 = layoutParams.width) != (i11 = org.telegram.messenger.g0.q.x) || layoutParams.height != i12) && ((eVar = this.h5) == null || i10 != -1 || layoutParams.height != -1))) {
                    if (eVar == null) {
                        layoutParams.width = i11;
                        layoutParams.height = i12;
                        viewGroup.setLayoutParams(layoutParams);
                    }
                    if (rt0Var != null) {
                        int i14 = this.A2;
                        this.A2 = layoutParams.height;
                        rt0Var.requestLayout();
                        G0();
                        if (this.i2 && !this.z2 && i14 != this.A2 && N0()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.V0 = animatorSet;
                            if (this.h5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.A2 - i14, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, this.A2 - i14, 0.0f));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new he(this, 10));
                            org.telegram.messenger.g0.i3(this.Y3, 50L);
                            this.L3.d();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.L2 == i7 && this.M2 == z9) {
            G0();
            return;
        }
        this.L2 = i7;
        this.M2 = z9;
        boolean z11 = this.z2;
        this.z2 = i7 > 0;
        z();
        if (this.z2 && s0() && this.B3 == null) {
            t1(0, this.f2, true, true);
        } else if (!this.z2 && !s0() && (ijVar = this.m2) != null && this.T2 != ijVar && !g0() && !s() && !org.telegram.ui.ActionBar.f2.hasSheets(anVar) && (((xeVar = this.E0) == null || TextUtils.isEmpty(xeVar.getText())) && (tL_replyKeyboardMarkup = this.n2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.i1 i1Var = rt0Var.H;
            if (i1Var.f) {
                i1Var.j();
            } else {
                i1Var.v = true;
            }
            t1(1, 1, false, true);
        }
        if (this.A2 != 0 && !(z10 = this.z2) && z10 != z11 && !s0()) {
            this.A2 = 0;
            rt0Var.requestLayout();
        }
        if (this.z2 && this.k3) {
            this.k3 = false;
            if (this.p3) {
                this.p3 = false;
                this.H1.setButtons(this.n2);
            }
            org.telegram.messenger.g0.r(this.r3);
        }
        G0();
    }

    public final void K0(CharSequence charSequence, CharSequence charSequence2, String str) {
        org.telegram.ui.an anVar;
        if (this.E0 == null || (anVar = this.P2) == null) {
            return;
        }
        org.telegram.messenger.qp.s1(this.Q);
        boolean z9 = org.telegram.messenger.r2.a;
        li.b2 b2Var = new li.b2(str);
        b2Var.h = charSequence;
        b2Var.n = charSequence2;
        b2Var.setResourceProvider(this.W3);
        b2Var.J = anVar;
        b2Var.s = anVar.T;
        b2Var.w = anVar.Z;
        b2Var.L = new rd(this, 2);
        b2Var.K = new rd(this, 3);
        anVar.presentFragment(b2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        if (org.telegram.messenger.qp.s1(r16.Q).e7.getBoolean("show_gift_for_" + r7.a(), true) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d1, code lost:
    
        if (org.telegram.messenger.qp.s1(r16.Q).e7.getBoolean(java.util.Calendar.getInstance().get(1) + "show_gift_for_" + r7.a(), true) == false) goto L37;
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
    public final void K1(boolean z9) {
        boolean z10;
        fi.m3 m3Var;
        TLRPC.UserFull userFull = getParentFragment() == null ? null : getParentFragment().q8;
        TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(this.Q).b2(org.telegram.messenger.p10.i(this.Q).e());
        TLRPC.User j3 = getParentFragment() == null ? null : getParentFragment().j();
        boolean z11 = org.telegram.messenger.qp.s1(this.Q).h7;
        int i7 = 0;
        org.telegram.ui.an anVar = this.P2;
        if (!z11 && getParentFragment() != null && j3 != null) {
            boolean z12 = org.telegram.messenger.r2.a;
            if ((!org.telegram.messenger.t10.B(j3) || (b22 != null && b22.display_gifts_button)) && !org.telegram.messenger.t10.t(j3) && !org.telegram.messenger.qp.F2(j3) && userFull != null) {
                if (!j3.premium && org.telegram.messenger.qp.s1(this.Q).v7 && org.telegram.messenger.qp.s1(this.Q).w7) {
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
                if (anVar != null && anVar.f4 == 0) {
                    z10 = true;
                    if (!z10 && (m3Var = this.L) != null) {
                        m3Var.f(true);
                    }
                    if (z10 && this.K1 == null) {
                        return;
                    }
                    if (this.K1 == null && anVar != null) {
                        ke keVar = new ke(this, getContext(), i7);
                        this.K1 = keVar;
                        keVar.setImageResource(R.drawable.msg_input_gift);
                        ke keVar2 = this.K1;
                        int i10 = org.telegram.ui.ActionBar.k6.Kl;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.f6 f6Var = this.W3;
                        org.telegram.ui.ActionBar.r6.t(keVar2, i10, f6Var, mode);
                        this.K1.setVisibility(8);
                        this.K1.setContentDescription(org.telegram.messenger.hd.M0(2131749679, null));
                        this.K1.setScaleType(ImageView.ScaleType.CENTER);
                        ke keVar3 = this.K1;
                        int i11 = org.telegram.ui.ActionBar.k6.i6;
                        org.telegram.ui.ActionBar.r6.R(keVar3, org.telegram.ui.ActionBar.k6.h0(f0(i11), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i11), f6Var);
                        this.p1.addView(this.K1, 0, c8.ha.e(44, 44, 21));
                        this.K1.setOnClickListener(new cd(this, 9));
                    }
                    org.telegram.messenger.g0.Y3(this.K1, z10, 1.0f, true, 1.0f, z9, new zc(this, i7));
                    if (z10) {
                        return;
                    }
                    y();
                    return;
                }
            }
        }
        z10 = false;
        if (!z10) {
            m3Var.f(true);
        }
        if (z10) {
        }
        if (this.K1 == null) {
            ke keVar4 = new ke(this, getContext(), i7);
            this.K1 = keVar4;
            keVar4.setImageResource(R.drawable.msg_input_gift);
            ke keVar22 = this.K1;
            int i102 = org.telegram.ui.ActionBar.k6.Kl;
            PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.f6 f6Var2 = this.W3;
            org.telegram.ui.ActionBar.r6.t(keVar22, i102, f6Var2, mode2);
            this.K1.setVisibility(8);
            this.K1.setContentDescription(org.telegram.messenger.hd.M0(2131749679, null));
            this.K1.setScaleType(ImageView.ScaleType.CENTER);
            ke keVar32 = this.K1;
            int i112 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.r6.R(keVar32, org.telegram.ui.ActionBar.k6.h0(f0(i112), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i112), f6Var2);
            this.p1.addView(this.K1, 0, c8.ha.e(44, 44, 21));
            this.K1.setOnClickListener(new cd(this, 9));
        }
        org.telegram.messenger.g0.Y3(this.K1, z10, 1.0f, true, 1.0f, z9, new zc(this, i7));
        if (z10) {
        }
    }

    public final void L() {
        org.telegram.messenger.g0.v1(this.E0);
    }

    public final void L0() {
        ad adVar = new ad(this, 29);
        if (org.telegram.messenger.b6.h(this.Q, this.Q2) || org.telegram.messenger.qp.s1(this.Q).W6.contains(Long.valueOf(this.Q2))) {
            adVar.run();
            return;
        }
        v4.n(this.P2, org.telegram.messenger.qp.s1(this.Q).a2(Long.valueOf(this.Q2)), new f(9, this, adVar), new rd(this, 0));
    }

    public final void L1() {
        xe xeVar = this.E0;
        if (xeVar != null) {
            xeVar.setTranslationX(this.H + this.G);
        }
    }

    public final void M() {
        if (this.x1 != null) {
            return;
        }
        ke keVar = new ke(this, getContext(), 1);
        this.x1 = keVar;
        xj0 xj0Var = new xj0(getContext());
        this.U1 = xj0Var;
        keVar.setImageDrawable(xj0Var);
        xj0 xj0Var2 = this.U1;
        int i7 = org.telegram.ui.ActionBar.k6.Kl;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f6 f6Var = this.W3;
        org.telegram.ui.ActionBar.r6.y(this, xj0Var2, i7, f6Var, mode);
        this.U1.a(R.drawable.input_bot2, false);
        this.x1.setScaleType(ImageView.ScaleType.CENTER);
        ke keVar2 = this.x1;
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.r6.R(keVar2, org.telegram.ui.ActionBar.k6.h0(f0(i10), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i10), f6Var);
        this.x1.setVisibility(8);
        org.telegram.messenger.g0.Z3(this.x1, false, 0.1f, true, false);
        this.p1.addView(this.x1, 0, c8.ha.o(44, 44));
        this.x1.setOnClickListener(new cd(this, 15));
    }

    public final boolean M0() {
        return this.V0 != null;
    }

    public final void M1(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        mf mfVar;
        this.A0 = false;
        boolean z9 = true;
        this.b = true;
        this.z0 = true;
        this.x0 = true;
        this.y0 = true;
        if (chat != null) {
            this.a1 = (org.telegram.messenger.t3.v(chat) || (org.telegram.messenger.t3.s(chat) && this.e2)) ? false : true;
            this.b = org.telegram.messenger.t3.t(chat);
            boolean q10 = org.telegram.messenger.t3.q(chat);
            this.z0 = q10;
            boolean z10 = (this.b || q10) ? false : true;
            this.A0 = z10;
            this.n = z10 ? 0.5f : 1.0f;
            H1();
            if (!this.A0 && (mfVar = this.U0) != null) {
                mfVar.K(-this.Q2, !this.z0, !this.b);
            }
            this.x0 = org.telegram.messenger.t3.s(chat);
            this.y0 = org.telegram.messenger.t3.v(chat);
        } else if (userFull != null) {
            this.a1 = userFull.voice_messages_forbidden;
            this.K = userFull;
        }
        float f10 = this.a1 ? 0.5f : 1.0f;
        de deVar = this.Z0;
        deVar.setAlpha(f10);
        deVar.invalidate();
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.a1 ? f0(org.telegram.ui.ActionBar.k6.Kl) : -1, PorterDuff.Mode.SRC_IN);
        ee eeVar = this.b1;
        eeVar.setColorFilter(porterDuffColorFilter);
        eeVar.invalidate();
        I1(false);
        boolean z11 = this.c1;
        if (!this.x0 && z11) {
            z11 = false;
        }
        if (this.y0 || z11) {
            z9 = z11;
        } else if (!this.e2) {
            z9 = false;
        }
        j1(z9, false);
    }

    public final void N() {
        if (this.l0 != null) {
            return;
        }
        hi.y yVar = new hi.y(getContext());
        this.l0 = yVar;
        yVar.setOnClickListener(new cd(this, 7));
        this.y1.addView(this.l0, c8.ha.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
        org.telegram.messenger.g0.Z3(this.l0, false, 1.0f, true, false);
        hi.y yVar2 = this.l0;
        if (!yVar2.f) {
            yVar2.f = true;
            yVar2.h = 1.0f;
            yVar2.requestLayout();
            yVar2.invalidate();
        }
    }

    public boolean N0() {
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
    public void N1(int i7, boolean z9) {
        boolean z10;
        int i10;
        char c10;
        float f10;
        int i11;
        ?? r10;
        boolean z11;
        int i12;
        boolean z12;
        long j3;
        ?? r102;
        int i13;
        float f11;
        ?? r103;
        int i14;
        float f12;
        boolean z13;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        int i15;
        char c11;
        char c12;
        Property property;
        hg hgVar = hg.a;
        hg hgVar2 = hg.b;
        Float valueOf = Float.valueOf(0.0f);
        Runnable runnable = this.f0;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.f0 = null;
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.M = false;
        }
        boolean z14 = this.F2;
        Property property2 = View.TRANSLATION_X;
        Property property3 = View.SCALE_X;
        Property property4 = View.SCALE_Y;
        Property property5 = View.ALPHA;
        if (z14) {
            if (this.w2 == 1) {
                this.Q4 = i7;
                return;
            }
            boolean z15 = this.Q4 == 3;
            if (z15) {
                property = property3;
            } else {
                this.O = false;
                ag agVar = this.O1;
                if (agVar != null) {
                    agVar.D.d(1, false, false);
                }
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.Q);
                long j10 = this.Q2;
                org.telegram.ui.an anVar = this.P2;
                property = property3;
                b02.e2(j10, (anVar == null || !anVar.v4) ? 0L : anVar.b(), this.O);
                this.i1 = 0L;
            }
            T();
            this.w2 = 1;
            mf mfVar = this.U0;
            if (mfVar != null) {
                mfVar.setEnabled(false);
            }
            try {
                if (this.q2 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) org.telegram.messenger.t0.b.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.q2 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.g0.f2(this.O2);
            wf wfVar = this.Z2;
            if (wfVar != null) {
                wfVar.R0(0);
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
            di.a4 a4Var = this.d1;
            if (a4Var != null) {
                a4Var.setVisibility(0);
            }
            U();
            RecordCircle recordCircle2 = this.N1;
            if (recordCircle2 != null) {
                recordCircle2.M = false;
                recordCircle2.setVisibility(0);
                this.N1.setAmplitude(0.0d);
            }
            ag agVar2 = this.O1;
            if (agVar2 != null) {
                agVar2.setVisibility(0);
            }
            cg cgVar = this.l1;
            if (cgVar != null) {
                cgVar.a = 1.0f;
                cgVar.b = System.currentTimeMillis();
                cgVar.r = -1L;
                cgVar.c = false;
                cgVar.e = false;
                cgVar.f.stop();
                cgVar.invalidate();
                this.l1.setScaleX(0.0f);
                this.l1.setScaleY(0.0f);
                this.l1.h = true;
            }
            this.t2 = new AnimatorSet();
            this.Y0.setTranslationX(org.telegram.messenger.g0.L(20.0f));
            this.Y0.setAlpha(0.0f);
            if (this.Q4 != 3) {
                this.k1.setTranslationX(org.telegram.messenger.g0.L(20.0f));
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
            w0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            Property property6 = property;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Z3, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.b4, 0.0f), ObjectAnimator.ofFloat(this.l1, (Property<cg, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.l1, (Property<cg, Float>) property6, 1.0f), ObjectAnimator.ofFloat(this.Y0, (Property<fg, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.Y0, (Property<fg, Float>) property5, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.k1, (Property<SlideTextView, Float>) property2, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.k1, (Property<SlideTextView, Float>) property5, 1.0f));
            ag agVar3 = this.O1;
            if (agVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(agVar3, (Property<ag, Float>) property5, 1.0f));
            }
            if (this.b1 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Z0, (Property<de, Float>) property5, 0.0f));
            }
            hi.y yVar = this.l0;
            if (yVar != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(yVar, (Property<hi.y, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.l0, (Property<hi.y, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.l0, (Property<hi.y, Float>) property5, 0.0f));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.E0, this.d4, org.telegram.messenger.g0.L(20.0f)), ObjectAnimator.ofFloat(this.E0, (Property<xe, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.e1, (Property<ud, Float>) property5, 1.0f));
            if (z15) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<ji0, Float>) property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<ch0, Float>) property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<ch0, Float>) property6, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<ch0, Float>) property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f1, (Property<h61, Float>) property5, 0.0f));
            }
            if (this.J1 != null) {
                animatorSet4.playTogether(m(org.telegram.messenger.g0.L(30.0f)), ObjectAnimator.ofFloat(this.J1, (Property<ie, Float>) property5, 0.0f));
            }
            bi.t tVar = this.p1;
            if (tVar != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(tVar, this.c4, org.telegram.messenger.g0.L(30.0f)), ObjectAnimator.ofFloat(this.p1, this.a4, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.q1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.q1 = null;
                }
                kg.k kVar = this.r1;
                this.v1 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(kVar, (Property<kg.k, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.r1, (Property<kg.k, Float>) property6, 0.5f), ObjectAnimator.ofFloat(this.r1, (Property<kg.k, Float>) property4, 0.5f));
            }
            lh.h hVar = this.i5;
            if (hVar != null) {
                hVar.e(0, false, true);
            }
            this.t2.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.N1, this.u3, 1.0f).setDuration(300L));
            if (!z15) {
                this.t2.playTogether(ObjectAnimator.ofFloat(this.N1, this.v3, 1.0f).setDuration(300L));
            }
            this.t2.addListener(new cf(this, z15));
            this.t2.setInterpolator(new DecelerateInterpolator());
            this.t2.start();
            this.Y0.a(this.i1);
        } else {
            if (this.k2 && i7 == 3) {
                return;
            }
            PowerManager.WakeLock wakeLock = this.q2;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.q2 = null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.f(e11);
                }
            }
            org.telegram.messenger.g0.Q3(this.O2);
            this.m3 = false;
            if (this.w2 == 0) {
                this.Q4 = i7;
                return;
            }
            org.telegram.messenger.qp.s1(this.R.a).C4(2, 0, this.Q2, getThreadMessageId(), null);
            this.w2 = 0;
            mf mfVar2 = this.U0;
            if (mfVar2 != null) {
                mfVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.t2;
            if (animatorSet5 != null) {
                z10 = animatorSet5.isRunning();
                ee eeVar = this.b1;
                if (eeVar != null) {
                    eeVar.setScaleX(1.0f);
                    this.b1.setScaleY(1.0f);
                }
                this.t2.removeAllListeners();
                this.t2.cancel();
            } else {
                z10 = false;
            }
            AnimatorSet animatorSet6 = this.u2;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            xe xeVar = this.E0;
            if (xeVar != null) {
                xeVar.setVisibility(0);
            }
            this.t2 = new AnimatorSet();
            if (z10 || i7 == 4) {
                float f13 = 0.5f;
                ee eeVar2 = this.b1;
                if (eeVar2 != null) {
                    eeVar2.setVisibility(0);
                }
                AnimatorSet animatorSet7 = this.t2;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f);
                wd wdVar = this.Q0;
                td tdVar = this.b4;
                if (!this.A0) {
                    f13 = 1.0f;
                }
                animatorSet7.playTogether(ofFloat, ObjectAnimator.ofFloat(wdVar, tdVar, f13), ObjectAnimator.ofFloat(this.l1, (Property<cg, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.l1, (Property<cg, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.N1, this.u3, 0.0f), ObjectAnimator.ofFloat(this.N1, this.v3, 0.0f), ObjectAnimator.ofFloat(this.Z0, (Property<de, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.Y0, (Property<fg, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.Z0, (Property<de, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.E0, (Property<xe, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.E0, this.d4, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                ag agVar4 = this.O1;
                if (agVar4 != null) {
                    i10 = 1;
                    c10 = 0;
                    this.t2.playTogether(ObjectAnimator.ofFloat(agVar4, (Property<ag, Float>) property5, 0.0f));
                    this.O1.a();
                } else {
                    i10 = 1;
                    c10 = 0;
                }
                hi.y yVar2 = this.l0;
                if (yVar2 != null) {
                    AnimatorSet animatorSet8 = this.t2;
                    float[] fArr = new float[i10];
                    f10 = 1.0f;
                    fArr[c10] = 1.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(yVar2, (Property<hi.y, Float>) property4, fArr);
                    hi.y yVar3 = this.l0;
                    float[] fArr2 = new float[i10];
                    fArr2[c10] = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(yVar3, (Property<hi.y, Float>) property3, fArr2);
                    hi.y yVar4 = this.l0;
                    float[] fArr3 = new float[i10];
                    fArr3[c10] = 1.0f;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(yVar4, (Property<hi.y, Float>) property5, fArr3);
                    Animator[] animatorArr = new Animator[3];
                    animatorArr[c10] = ofFloat2;
                    animatorArr[i10] = ofFloat3;
                    animatorArr[2] = ofFloat4;
                    animatorSet8.playTogether(animatorArr);
                } else {
                    f10 = 1.0f;
                }
                ee eeVar3 = this.b1;
                if (eeVar3 != null) {
                    eeVar3.setScaleX(f10);
                    this.b1.setScaleY(f10);
                    i11 = 1;
                    this.t2.playTogether(ObjectAnimator.ofFloat(this.Z0, (Property<de, Float>) property5, f10));
                    this.b1.j(r0() ? hgVar2 : hgVar, true);
                } else {
                    i11 = 1;
                }
                if (this.J1 != null) {
                    AnimatorSet animatorSet9 = this.t2;
                    ValueAnimator m10 = m(0.0f);
                    ie ieVar = this.J1;
                    float[] fArr4 = new float[i11];
                    fArr4[0] = 1.0f;
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(ieVar, (Property<ie, Float>) property5, fArr4);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = m10;
                    animatorArr2[i11] = ofFloat5;
                    animatorSet9.playTogether(animatorArr2);
                }
                if (this.p1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.q1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.q1 = null;
                    }
                    z11 = true;
                    r10 = 0;
                    this.t2.playTogether(ObjectAnimator.ofFloat(this.p1, this.c4, 0.0f), ObjectAnimator.ofFloat(this.p1, this.a4, 1.0f));
                    AnimatorSet animatorSet10 = this.t2;
                    kg.k kVar2 = this.r1;
                    this.v1 = 1.0f;
                    animatorSet10.playTogether(ObjectAnimator.ofFloat(kVar2, (Property<kg.k, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<kg.k, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<kg.k, Float>) property4, 1.0f));
                } else {
                    r10 = 0;
                    z11 = true;
                }
                lh.h hVar2 = this.i5;
                if (hVar2 != 0) {
                    hVar2.e(r10, r10, z11);
                }
                this.k2 = z11;
                w0();
                this.t2.setDuration(150L);
            } else {
                int i16 = 9;
                if (i7 == 3) {
                    T();
                    U();
                    SlideTextView slideTextView = this.k1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    if (this.c1) {
                        ji0 ji0Var = this.h1;
                        if (ji0Var != null) {
                            ji0Var.setVisibility(8);
                        }
                        ud udVar = this.e1;
                        if (udVar != null) {
                            udVar.setAlpha(1.0f);
                            this.e1.setVisibility(0);
                        }
                        ch0 ch0Var = this.g1;
                        if (ch0Var != null) {
                            ch0Var.setProgress(0.0f);
                            this.g1.i();
                        }
                        z13 = true;
                        f12 = 1.0f;
                    } else {
                        h61 h61Var = this.f1;
                        if (h61Var != null) {
                            h61Var.setVisibility(8);
                            w0();
                        }
                        ud udVar2 = this.e1;
                        if (udVar2 != null) {
                            udVar2.setVisibility(0);
                            f12 = 1.0f;
                            this.e1.setAlpha(1.0f);
                        } else {
                            f12 = 1.0f;
                        }
                        ji0 ji0Var2 = this.h1;
                        if (ji0Var2 != null) {
                            ji0Var2.setVisibility(0);
                            this.h1.setAlpha(0.0f);
                        }
                        z13 = true;
                    }
                    this.s4 = z13;
                    this.n4 = f12;
                    this.l4 = this.k4;
                    this.j4 = f12;
                    SlideTextView slideTextView2 = this.k1;
                    if (slideTextView2 != null) {
                        slideTextView2.setCancelToProgress(f12);
                    }
                    ag agVar5 = this.O1;
                    if (agVar5 != null) {
                        agVar5.invalidate();
                    }
                    ch0 ch0Var2 = this.g1;
                    if (ch0Var2 != null) {
                        ch0Var2.setAlpha(0.0f);
                        this.g1.setScaleX(0.0f);
                        this.g1.setScaleY(0.0f);
                        this.g1.setProgress(0.0f);
                        this.g1.i();
                    }
                    if (r0() || this.z4) {
                        this.f1.setVisibility(0);
                        viewGroup = null;
                        layoutParams = null;
                    } else {
                        viewGroup = (ViewGroup) this.e1.getParent();
                        layoutParams = this.e1.getLayoutParams();
                        viewGroup.removeView(this.e1);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.Z1 == null ? jg.g.e(44.0f, this.J0.l(), 0) : 0), org.telegram.messenger.g0.L(44.0f));
                        layoutParams2.gravity = 80;
                        layoutParams2.leftMargin = org.telegram.messenger.g0.L(7.0f);
                        layoutParams2.rightMargin = org.telegram.messenger.g0.L(7.0f);
                        this.m1.addView(this.e1, layoutParams2);
                        this.f1.setVisibility(8);
                    }
                    w0();
                    AnimatorSet animatorSet11 = new AnimatorSet();
                    if (z9) {
                        this.h1.setAllowDraw(false);
                        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat6.addUpdateListener(new zc(this, 6));
                        ofFloat6.addListener(new df(this));
                        ofFloat6.setDuration(r0() ? 490L : 580L);
                        AnimatorSet animatorSet12 = new AnimatorSet();
                        animatorSet12.playTogether(ObjectAnimator.ofFloat(this.l1, (Property<cg, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.l1, (Property<cg, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.Y0, (Property<fg, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.Y0, (Property<fg, Float>) property2, -org.telegram.messenger.g0.L(20.0f)), ObjectAnimator.ofFloat(this.k1, (Property<SlideTextView, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<ch0, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.g1, (Property<ch0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.g1, (Property<ch0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.Z3, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.b4, 0.0f), ObjectAnimator.ofFloat(this.E0, (Property<xe, Float>) property5, 0.0f));
                        ch0 ch0Var3 = this.g1;
                        if (ch0Var3 != null) {
                            ch0Var3.setAlpha(0.0f);
                            this.g1.setScaleX(0.0f);
                            this.g1.setScaleY(0.0f);
                        }
                        if (this.b1 != null) {
                            i15 = 1;
                            animatorSet12.playTogether(ObjectAnimator.ofFloat(this.Z0, (Property<de, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<de, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<de, Float>) property4, 1.0f));
                            this.b1.j(r0() ? hgVar2 : hgVar, true);
                        } else {
                            i15 = 1;
                        }
                        hi.y yVar5 = this.l0;
                        if (yVar5 != null) {
                            float[] fArr5 = new float[i15];
                            fArr5[0] = 0.0f;
                            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(yVar5, (Property<hi.y, Float>) property5, fArr5);
                            hi.y yVar6 = this.l0;
                            float[] fArr6 = new float[i15];
                            fArr6[0] = 0.0f;
                            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(yVar6, (Property<hi.y, Float>) property3, fArr6);
                            hi.y yVar7 = this.l0;
                            float[] fArr7 = new float[i15];
                            fArr7[0] = 0.0f;
                            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(yVar7, (Property<hi.y, Float>) property4, fArr7);
                            Animator[] animatorArr3 = new Animator[3];
                            animatorArr3[0] = ofFloat7;
                            animatorArr3[i15] = ofFloat8;
                            animatorArr3[2] = ofFloat9;
                            animatorSet12.playTogether(animatorArr3);
                        }
                        animatorSet12.addListener(new he(this, 8));
                        animatorSet12.setDuration(150L);
                        animatorSet12.setStartDelay(150L);
                        if (r0()) {
                            this.f1.setAlpha(0.0f);
                            c11 = 1;
                            c12 = 0;
                            animatorSet11.playTogether(ObjectAnimator.ofFloat(this.f1, (Property<h61, Float>) property5, 1.0f));
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
                        this.t2.addListener(new di.h3(this, viewGroup, layoutParams, 3));
                    } else {
                        V();
                        this.u3.set(this.N1, Float.valueOf(1.0f));
                        this.N1.setTransformToSeekbar(1.0f);
                        if (!r0()) {
                            float f14 = this.p4;
                            if (f14 != 0.0f && this.h1 != null) {
                                this.h1.setAlpha(xq.j.getInterpolation(Math.max(0.0f, ((f14 - 0.38f) - 0.25f) / 0.37f)));
                                this.h1.invalidate();
                            }
                        }
                        this.l1.setScaleY(0.0f);
                        this.l1.setScaleX(0.0f);
                        this.Y0.setAlpha(0.0f);
                        this.Y0.setTranslationX(-org.telegram.messenger.g0.L(20.0f));
                        this.k1.setAlpha(0.0f);
                        this.g1.setAlpha(1.0f);
                        this.g1.setScaleY(1.0f);
                        this.g1.setScaleX(1.0f);
                        this.Z3.set(this.Q0, valueOf);
                        this.b4.set(this.Q0, valueOf);
                        this.E0.setAlpha(0.0f);
                        ee eeVar4 = this.b1;
                        if (eeVar4 != null) {
                            if (r0()) {
                                hgVar = hgVar2;
                            }
                            eeVar4.j(hgVar, z9);
                            this.Z0.setAlpha(1.0f);
                            this.Z0.setScaleX(1.0f);
                            this.Z0.setScaleY(1.0f);
                        }
                        hi.y yVar8 = this.l0;
                        if (yVar8 != null) {
                            yVar8.setAlpha(0.0f);
                            this.l0.setScaleX(0.0f);
                            this.l0.setScaleY(0.0f);
                        }
                        if (r0()) {
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
                        H1();
                        w0();
                    }
                } else if (i7 == 2 || i7 == 5) {
                    ee eeVar5 = this.b1;
                    if (eeVar5 != null) {
                        eeVar5.setVisibility(0);
                    }
                    this.k2 = true;
                    w0();
                    AnimatorSet animatorSet14 = new AnimatorSet();
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.b4, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.l1, (Property<cg, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.l1, (Property<cg, Float>) property3, 0.0f));
                    ag agVar6 = this.O1;
                    if (agVar6 != null) {
                        animatorSet14.playTogether(ObjectAnimator.ofFloat(agVar6, (Property<ag, Float>) property5, 0.0f));
                        this.O1.a();
                    }
                    hi.y yVar9 = this.l0;
                    if (yVar9 != null) {
                        animatorSet14.playTogether(ObjectAnimator.ofFloat(yVar9, (Property<hi.y, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<hi.y, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<hi.y, Float>) property5, 1.0f));
                    }
                    AnimatorSet animatorSet15 = new AnimatorSet();
                    animatorSet15.playTogether(ObjectAnimator.ofFloat(this.Y0, (Property<fg, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.Y0, (Property<fg, Float>) property2, -org.telegram.messenger.g0.L(20.0f)), ObjectAnimator.ofFloat(this.k1, (Property<SlideTextView, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.k1, (Property<SlideTextView, Float>) property2, -org.telegram.messenger.g0.L(20.0f)));
                    if (i7 != 5) {
                        this.Z0.setScaleX(0.0f);
                        this.Z0.setScaleY(0.0f);
                        kg.k kVar3 = this.r1;
                        if (kVar3 != null && kVar3.getVisibility() == 0) {
                            this.r1.setScaleX(0.5f);
                            this.r1.setScaleY(0.5f);
                        }
                        ke keVar = this.x1;
                        if (keVar != null && keVar.getVisibility() == 0) {
                            this.x1.setScaleX(0.0f);
                            this.x1.setScaleY(0.0f);
                        }
                        animatorSet14.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<de, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<de, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<de, Float>) property5, 1.0f));
                        if (this.p1 != null) {
                            ViewPropertyAnimator viewPropertyAnimator3 = this.q1;
                            if (viewPropertyAnimator3 != null) {
                                viewPropertyAnimator3.cancel();
                                this.q1 = null;
                            }
                            i13 = 1;
                            r102 = 0;
                            animatorSet14.playTogether(ObjectAnimator.ofFloat(this.p1, this.a4, 1.0f), ObjectAnimator.ofFloat(this.p1, this.c4, 0.0f));
                            kg.k kVar4 = this.r1;
                            this.v1 = 1.0f;
                            animatorSet14.playTogether(ObjectAnimator.ofFloat(kVar4, (Property<kg.k, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<kg.k, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<kg.k, Float>) property4, 1.0f));
                        } else {
                            r102 = 0;
                            i13 = 1;
                        }
                        lh.h hVar3 = this.i5;
                        if (hVar3 != 0) {
                            hVar3.e(r102, r102, i13);
                        }
                        ke keVar2 = this.x1;
                        if (keVar2 != null) {
                            float[] fArr8 = new float[i13];
                            fArr8[r102] = 1.0f;
                            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(keVar2, (Property<ke, Float>) property3, fArr8);
                            ke keVar3 = this.x1;
                            float[] fArr9 = new float[i13];
                            fArr9[r102] = 1.0f;
                            ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(keVar3, (Property<ke, Float>) property4, fArr9);
                            Animator[] animatorArr5 = new Animator[2];
                            animatorArr5[r102] = ofFloat10;
                            animatorArr5[i13] = ofFloat11;
                            animatorSet14.playTogether(animatorArr5);
                        }
                        if (this.b1 != null) {
                            de deVar = this.Z0;
                            float[] fArr10 = new float[i13];
                            fArr10[r102] = 1.0f;
                            ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(deVar, (Property<de, Float>) property5, fArr10);
                            Animator[] animatorArr6 = new Animator[i13];
                            animatorArr6[r102] = ofFloat12;
                            animatorSet14.playTogether(animatorArr6);
                            de deVar2 = this.Z0;
                            float[] fArr11 = new float[i13];
                            fArr11[r102] = 1.0f;
                            ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(deVar2, (Property<de, Float>) property3, fArr11);
                            Animator[] animatorArr7 = new Animator[i13];
                            animatorArr7[r102] = ofFloat13;
                            animatorSet14.playTogether(animatorArr7);
                            de deVar3 = this.Z0;
                            float[] fArr12 = new float[i13];
                            fArr12[r102] = 1.0f;
                            ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(deVar3, (Property<de, Float>) property4, fArr12);
                            Animator[] animatorArr8 = new Animator[i13];
                            animatorArr8[r102] = ofFloat14;
                            animatorSet14.playTogether(animatorArr8);
                            this.b1.j(r0() ? hgVar2 : hgVar, i13);
                        }
                        ie ieVar2 = this.J1;
                        if (ieVar2 != null) {
                            float[] fArr13 = new float[i13];
                            fArr13[0] = 1.0f;
                            ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(ieVar2, (Property<ie, Float>) property5, fArr13);
                            ValueAnimator m11 = m(0.0f);
                            Animator[] animatorArr9 = new Animator[2];
                            animatorArr9[0] = ofFloat15;
                            animatorArr9[i13] = m11;
                            animatorSet14.playTogether(animatorArr9);
                        }
                        j3 = 150;
                    } else {
                        AnimatorSet animatorSet16 = new AnimatorSet();
                        animatorSet16.playTogether(ObjectAnimator.ofFloat(this.Z0, (Property<de, Float>) property5, 1.0f));
                        if (this.p1 != null) {
                            ViewPropertyAnimator viewPropertyAnimator4 = this.q1;
                            if (viewPropertyAnimator4 != null) {
                                viewPropertyAnimator4.cancel();
                                this.q1 = null;
                            }
                            i12 = 1;
                            z12 = false;
                            animatorSet16.playTogether(ObjectAnimator.ofFloat(this.p1, this.c4, 0.0f), ObjectAnimator.ofFloat(this.p1, this.a4, 1.0f));
                            kg.k kVar5 = this.r1;
                            this.v1 = 1.0f;
                            animatorSet16.playTogether(ObjectAnimator.ofFloat(kVar5, (Property<kg.k, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<kg.k, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<kg.k, Float>) property4, 1.0f));
                        } else {
                            i12 = 1;
                            z12 = false;
                        }
                        lh.h hVar4 = this.i5;
                        boolean z16 = z12;
                        if (hVar4 != null) {
                            hVar4.e(z16 ? 1 : 0, z16, i12);
                        }
                        ie ieVar3 = this.J1;
                        if (ieVar3 != null) {
                            float[] fArr14 = new float[i12];
                            fArr14[z16 ? 1 : 0] = 1.0f;
                            ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(ieVar3, (Property<ie, Float>) property5, fArr14);
                            ValueAnimator m12 = m(0.0f);
                            Animator[] animatorArr10 = new Animator[2];
                            animatorArr10[z16 ? 1 : 0] = ofFloat16;
                            animatorArr10[i12] = m12;
                            animatorSet16.playTogether(animatorArr10);
                        }
                        j3 = 150;
                        animatorSet16.setDuration(150L);
                        animatorSet16.setStartDelay(110L);
                        animatorSet16.addListener(new he(this, i16));
                        AnimatorSet animatorSet17 = this.t2;
                        Animator[] animatorArr11 = new Animator[i12];
                        animatorArr11[0] = animatorSet16;
                        animatorSet17.playTogether(animatorArr11);
                    }
                    animatorSet14.setDuration(j3);
                    animatorSet14.setStartDelay(700L);
                    animatorSet15.setDuration(200L);
                    animatorSet15.setStartDelay(200L);
                    this.G = 0.0f;
                    L1();
                    ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(this.E0, (Property<xe, Float>) property5, 1.0f);
                    ofFloat17.setStartDelay(this.s == 1.0f ? 300L : 700L);
                    ofFloat17.setDuration(200L);
                    this.t2.playTogether(animatorSet14, animatorSet15, ofFloat17, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.k4).setDuration(200L));
                    if (i7 == 5) {
                        ChatActivityEnterView.this.r4 = true;
                        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                        duration.setInterpolator(xq.j);
                        this.t2.playTogether(duration);
                    } else {
                        ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                        ofFloat18.setDuration(360L);
                        ofFloat18.setStartDelay(490L);
                        this.t2.playTogether(ofFloat18);
                    }
                    cg cgVar2 = this.l1;
                    if (cgVar2 != null) {
                        cgVar2.a();
                    }
                } else {
                    ee eeVar6 = this.b1;
                    if (eeVar6 != null) {
                        eeVar6.setVisibility(0);
                    }
                    AnimatorSet animatorSet18 = new AnimatorSet();
                    animatorSet18.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.b4, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.l1, (Property<cg, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.l1, (Property<cg, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.Z0, (Property<de, Float>) property5, 1.0f));
                    ag agVar7 = this.O1;
                    if (agVar7 != null) {
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(agVar7, (Property<ag, Float>) property5, 0.0f));
                        this.O1.a();
                    }
                    hi.y yVar10 = this.l0;
                    if (yVar10 != null) {
                        f11 = 1.0f;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(yVar10, (Property<hi.y, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<hi.y, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<hi.y, Float>) property5, 1.0f));
                    } else {
                        f11 = 1.0f;
                    }
                    ee eeVar7 = this.b1;
                    if (eeVar7 != null) {
                        eeVar7.setScaleX(f11);
                        this.b1.setScaleY(f11);
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(this.Z0, (Property<de, Float>) property5, f11));
                        this.b1.j(r0() ? hgVar2 : hgVar, true);
                    }
                    if (this.p1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator5 = this.q1;
                        if (viewPropertyAnimator5 != null) {
                            viewPropertyAnimator5.cancel();
                            this.q1 = null;
                        }
                        this.y = 0.0f;
                        C1();
                        i14 = 1;
                        r103 = 0;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(this.p1, this.a4, 1.0f));
                        kg.k kVar6 = this.r1;
                        this.v1 = 1.0f;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(kVar6, (Property<kg.k, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<kg.k, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<kg.k, Float>) property4, 1.0f));
                    } else {
                        r103 = 0;
                        i14 = 1;
                    }
                    lh.h hVar5 = this.i5;
                    if (hVar5 != 0) {
                        hVar5.e(r103, r103, i14);
                    }
                    ie ieVar4 = this.J1;
                    if (ieVar4 != null) {
                        float[] fArr15 = new float[i14];
                        fArr15[r103] = 1.0f;
                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(ieVar4, (Property<ie, Float>) property5, fArr15);
                        ValueAnimator m13 = m(0.0f);
                        Animator[] animatorArr12 = new Animator[2];
                        animatorArr12[r103] = ofFloat19;
                        animatorArr12[i14] = m13;
                        animatorSet18.playTogether(animatorArr12);
                    }
                    animatorSet18.setDuration(150L);
                    animatorSet18.setStartDelay(200L);
                    AnimatorSet animatorSet19 = new AnimatorSet();
                    fg fgVar = this.Y0;
                    float[] fArr16 = new float[i14];
                    fArr16[r103] = 0.0f;
                    ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(fgVar, (Property<fg, Float>) property5, fArr16);
                    fg fgVar2 = this.Y0;
                    float[] fArr17 = new float[i14];
                    fArr17[r103] = org.telegram.messenger.g0.L(40.0f);
                    ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(fgVar2, (Property<fg, Float>) property2, fArr17);
                    SlideTextView slideTextView3 = this.k1;
                    float[] fArr18 = new float[i14];
                    fArr18[r103] = 0.0f;
                    ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(slideTextView3, (Property<SlideTextView, Float>) property5, fArr18);
                    SlideTextView slideTextView4 = this.k1;
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
                    ofFloat24.setDuration(this.g0 ? 220L : 360L);
                    this.G = 0.0f;
                    L1();
                    ObjectAnimator ofFloat25 = ObjectAnimator.ofFloat(this.E0, (Property<xe, Float>) property5, 1.0f);
                    ofFloat25.setStartDelay(this.s == 1.0f ? 150L : 450L);
                    ofFloat25.setDuration(200L);
                    this.t2.playTogether(animatorSet18, animatorSet19, ofFloat25, ofFloat24);
                }
            }
            this.t2.addListener(new ff(this, i7));
            this.t2.start();
            fg fgVar3 = this.Y0;
            if (fgVar3 != null) {
                fgVar3.b();
            }
        }
        this.Z2.a();
        R1(true);
        this.Q4 = i7;
    }

    public final void O() {
        if (this.b0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.b0 = numberTextView;
        numberTextView.setVisibility(8);
        this.b0.setTextSize(15);
        this.b0.setTextColor(f0(org.telegram.ui.ActionBar.k6.y6));
        this.b0.setTypeface(org.telegram.messenger.g0.o());
        this.b0.setCenterAlign(true);
        addView(this.b0, Math.min(2, getChildCount()), c8.ha.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public final void O0(int i7, int i10, CharSequence charSequence, boolean z9) {
        if (this.E0 == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.E0.getText());
            spannableStringBuilder.replace(i7, i10 + i7, charSequence);
            if (z9) {
                org.telegram.messenger.i6.m(spannableStringBuilder, this.E0.getPaint().getFontMetricsInt(), false, null, 0);
            }
            this.E0.setText(spannableStringBuilder);
            this.E0.setSelection(i7 + charSequence.length());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void O1() {
        int f02 = f0(org.telegram.ui.ActionBar.k6.Xf);
        int f03 = f0(org.telegram.ui.ActionBar.k6.Ge);
        int f04 = f0(org.telegram.ui.ActionBar.k6.Sf);
        ch0 ch0Var = this.g1;
        if (ch0Var != null) {
            ch0Var.h(f02, "Cup Red");
            this.g1.h(f02, "Box Red");
            this.g1.h(f04, "Cup Grey");
            this.g1.h(f04, "Box Grey");
            this.g1.h(f04, "Box_Grey 2");
            this.g1.h(f04, "Line 1");
            this.g1.h(f04, "Line 2");
            this.g1.h(f04, "Line 3");
            this.g1.h(f03, "Line 1 Dup");
            this.g1.h(f03, "Line 2 Dup");
            this.g1.h(f03, "Line 3 Dup");
        }
    }

    public final void P(boolean z9) {
        if (this.F1 != null) {
            return;
        }
        ge geVar = new ge(this, getContext(), this.W3);
        this.F1 = geVar;
        geVar.setContentDescription(org.telegram.messenger.hd.M0(2131751275, null));
        if (z9) {
            c8.ka.a(this.F1);
        }
        this.z1.addView(this.F1, c8.ha.e(44, 44, 85));
    }

    public final void P0() {
        n1(false, true, false, true);
        t1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.F2 = false;
        ee eeVar = this.b1;
        if (eeVar != null) {
            eeVar.setVisibility(0);
        }
        this.k2 = true;
        w0();
        w();
        n0();
        ag agVar = this.O1;
        if (agVar != null) {
            agVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }

    public final void P1() {
        org.telegram.messenger.au auVar = this.C1;
        if (auVar == null) {
            return;
        }
        boolean z9 = this.D1;
        boolean z10 = this.E1 != null && this.Z1 == null;
        this.D1 = z10;
        ge geVar = this.J0;
        ImageView imageView = this.R0;
        wd wdVar = this.Q0;
        if (z10) {
            auVar.setResourcesProvider(this.W3);
            this.C1.set(this.E1);
            this.C1.setVisibility(0);
            xe xeVar = this.E0;
            if (xeVar != null) {
                xeVar.setVisibility(8);
            }
            wdVar.setVisibility(8);
            imageView.setVisibility(0);
            geVar.setLocked(!org.telegram.messenger.p10.i(this.Q).q());
        } else {
            auVar.setVisibility(8);
            xe xeVar2 = this.E0;
            if (xeVar2 != null) {
                xeVar2.setVisibility(0);
            }
            wdVar.setVisibility(0);
            imageView.setVisibility(8);
            geVar.setLocked(false);
        }
        G1();
        if (z9 != this.D1) {
            E(true);
        }
    }

    public final void Q() {
        mf mfVar = this.U0;
        if (mfVar != null && mfVar.c1 != org.telegram.messenger.p10.s0) {
            this.n1.removeView(mfVar);
            this.U0 = null;
        }
        if (this.U0 != null) {
            return;
        }
        mf mfVar2 = new mf(this, this.P2, this.I2, getContext(), this.d2, this.m1, this.y4, this.W3, this.T0, this.h5 != null);
        this.U0 = mfVar2;
        mfVar2.v0 = true;
        if (!this.y4) {
            mfVar2.updateColors();
        }
        this.U0.I(true, this.J2, this.K2, true);
        this.U0.setVisibility(8);
        this.U0.setShowing(false);
        if (this.h5 != null) {
            mf mfVar3 = this.U0;
            mfVar3.w0 = false;
            mfVar3.setShouldDrawBackground(false);
            this.U0.V0 = true;
        }
        this.U0.setDelegate(new pf(this));
        this.U0.setDragListener(new bg.w0(this));
        mf mfVar4 = this.U0;
        if (mfVar4 != null) {
            mfVar4.K(-this.Q2, !this.z0, !this.b);
        }
        r();
        A();
    }

    public final void Q0(TL_iv.RichMessage richMessage) {
        org.telegram.ui.an anVar = this.P2;
        if (anVar != null) {
            org.telegram.messenger.ui.b0(this.Q).Q1(anVar.a(), anVar.P7(anVar.D5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void Q1(boolean z9) {
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z11 = org.telegram.messenger.m5.z(this.Q2);
        ImageView imageView = this.I1;
        if (z11) {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.R.a).M0(Long.valueOf(-this.Q2));
            this.g2 = org.telegram.messenger.qp.s1(this.Q).d7.getBoolean("silent_" + this.Q2, false);
            z10 = org.telegram.messenger.t3.T(M0) && (M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_messages)) && !M0.megagroup;
            this.h2 = z10;
            if (imageView != null) {
                if (this.e0 == null) {
                    this.e0 = new uq(getContext(), R.drawable.input_notify_on, org.telegram.ui.ActionBar.k6.Kl);
                }
                this.e0.a(this.g2, false);
                imageView.setImageDrawable(this.e0);
            } else {
                z10 = false;
            }
            bi.t tVar = this.p1;
            if (tVar != null) {
                J1(tVar.getVisibility() == 0 ? 1 : 0);
            }
        } else {
            z10 = false;
        }
        boolean z12 = (this.Z2 == null || c() || !this.Z2.v0()) ? false : true;
        boolean z13 = (!z12 || this.L1 || this.F2) ? false : true;
        if (z13) {
            W();
        }
        ie ieVar = this.J1;
        if (ieVar != null) {
            if ((ieVar.getTag() != null && z13) || (this.J1.getTag() == null && !z13)) {
                if (imageView != null) {
                    int i7 = (z12 || !z10 || this.J1.getVisibility() == 0) ? 8 : 0;
                    if (i7 != imageView.getVisibility()) {
                        imageView.setVisibility(i7);
                        return;
                    }
                    return;
                }
                return;
            }
            this.J1.setTag(z13 ? 1 : null);
        } else if (imageView != null) {
            int i10 = (z12 || !z10) ? 8 : 0;
            if (i10 != imageView.getVisibility()) {
                imageView.setVisibility(i10);
            }
        }
        AnimatorSet animatorSet = this.M1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M1 = null;
        }
        if (z9 && !z10) {
            ie ieVar2 = this.J1;
            if (ieVar2 != null) {
                if (z13) {
                    ieVar2.setVisibility(0);
                }
                this.J1.setPivotX(org.telegram.messenger.g0.L(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.M1 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.J1, (Property<ie, Float>) View.ALPHA, z13 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.J1, (Property<ie, Float>) View.SCALE_X, z13 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.J1, (Property<ie, Float>) View.SCALE_Y, z13 ? 1.0f : 0.1f));
                this.M1.setDuration(180L);
                this.M1.addListener(new le(this, z13, 2));
                this.M1.start();
                return;
            }
            return;
        }
        ie ieVar3 = this.J1;
        if (ieVar3 == null) {
            if (imageView != null) {
                imageView.setVisibility(z10 ? 0 : 8);
                return;
            }
            return;
        }
        ieVar3.setVisibility(z13 ? 0 : 8);
        this.J1.setAlpha(z13 ? 1.0f : 0.0f);
        this.J1.setScaleX(z13 ? 1.0f : 0.1f);
        this.J1.setScaleY(z13 ? 1.0f : 0.1f);
        if (imageView != null) {
            imageView.setVisibility((!z10 || this.J1.getVisibility() == 0) ? 8 : 0);
        }
        this.J1.setTranslationX(0.0f);
    }

    public final void R() {
        if (this.S0 != null) {
            return;
        }
        ke keVar = new ke(this, getContext(), 2);
        this.S0 = keVar;
        keVar.setScaleType(ImageView.ScaleType.CENTER);
        ke keVar2 = this.S0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(f0(org.telegram.ui.ActionBar.k6.Kl), false);
        this.F3 = animatedArrowDrawable;
        keVar2.setImageDrawable(animatedArrowDrawable);
        this.S0.setVisibility(8);
        this.S0.setScaleX(0.1f);
        this.S0.setScaleY(0.1f);
        this.S0.setAlpha(0.0f);
        ke keVar3 = this.S0;
        int i7 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.r6.R(keVar3, org.telegram.ui.ActionBar.k6.h0(f0(i7), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i7), this.W3);
        this.A1.addView(this.S0, c8.ha.e(44, 44, 85));
        this.S0.setOnClickListener(new cd(this, 5));
        this.S0.setContentDescription(org.telegram.messenger.hd.M0(2131754883, "AccDescrExpandPanel"));
    }

    public final void R0(SpannableStringBuilder spannableStringBuilder, boolean z9, int i7, int i10) {
        if (this.E0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        org.telegram.messenger.i6.m(spannableStringBuilder2, this.E0.getPaint().getFontMetricsInt(), false, null, 0);
        r5[] r5VarArr = (r5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), r5.class);
        if (r5VarArr != null) {
            for (r5 r5Var : r5VarArr) {
                r5Var.applyFontMetrics(this.E0.getPaint().getFontMetricsInt(), i5.f());
            }
        }
        ug0.a(spannableStringBuilder2);
        J();
        setFieldText(spannableStringBuilder2);
        T0(z9, i7, i10, 0L, true);
    }

    public void R1(boolean z9) {
        S1(false, z9);
    }

    public final void S() {
        if (this.E0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.W3;
        xe xeVar = new xe(this, context, f6Var);
        this.E0 = xeVar;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            xeVar.setFallbackLineSpacing(false);
        }
        if (i7 >= 35) {
            this.E0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.E0.setDelegate(new jd(this));
        org.telegram.ui.an anVar = this.P2;
        if (anVar == null || anVar.getParentLayout() == null || !((ActionBarLayout) anVar.getParentLayout()).b) {
            this.E0.setWindowView(this.O2.getWindow().getDecorView());
        } else {
            this.E0.setWindowView(anVar.getParentLayout().getWindow().getDecorView());
        }
        TLRPC.EncryptedChat encryptedChat = anVar != null ? anVar.h : null;
        this.E0.setAllowTextEntitiesIntersection(A1());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        int i10 = ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) ? 285212672 : TLObject.FLAG_28;
        this.E0.setIncludeFontPadding(false);
        this.E0.setImeOptions(i10);
        xe xeVar2 = this.E0;
        int inputType = xeVar2.getInputType() | 147456;
        this.a = inputType;
        xeVar2.setInputType(inputType);
        I1(false);
        this.E0.setSingleLine(false);
        this.E0.setMaxLines(6);
        this.E0.setTextSize(1, 18.0f);
        this.E0.setGravity(80);
        this.E0.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(10.0f));
        this.E0.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.r6.V(this.E0, org.telegram.ui.ActionBar.k6.Ie, f6Var);
        org.telegram.ui.ActionBar.r6.H(this.E0, org.telegram.ui.ActionBar.k6.Vc, f6Var);
        org.telegram.ui.ActionBar.r6.D(this.E0, org.telegram.ui.ActionBar.k6.ig, f6Var);
        xe xeVar3 = this.E0;
        int i11 = org.telegram.ui.ActionBar.k6.Je;
        org.telegram.ui.ActionBar.r6.B(xeVar3, i11, f6Var);
        org.telegram.ui.ActionBar.r6.E(this.E0, i11, f6Var);
        org.telegram.ui.ActionBar.r6.w(this.E0, org.telegram.ui.ActionBar.k6.Ke, f6Var);
        org.telegram.ui.ActionBar.r6.z(this.E0, org.telegram.ui.ActionBar.k6.jg, f6Var);
        xe xeVar4 = this.E0;
        boolean z9 = this.X3;
        FrameLayout.LayoutParams d = c8.ha.d(-1, -2.0f, 80, 52.0f, 0.0f, z9 ? 50.0f : 2.0f, 1.5f);
        ud udVar = this.y1;
        udVar.addView(xeVar4, 1, d);
        org.telegram.messenger.au auVar = new org.telegram.messenger.au(this.Q, getContext(), f6Var);
        this.C1 = auVar;
        auVar.setAllowActions(false);
        this.C1.setMaxHeight(org.telegram.messenger.g0.L(150.0f));
        this.C1.setMinHeight(org.telegram.messenger.g0.L(88.0f));
        this.C1.setVisibility(8);
        this.C1.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f));
        this.C1.setOnClickListener(new cd(this, 10));
        udVar.addView(this.C1, 2, c8.ha.d(-1, -2.0f, 80, 44.0f, 0.0f, (z9 ? 50 : 2) - 8, 1.5f));
        this.E0.setOnKeyListener(new ye(this));
        this.E0.setOnEditorActionListener(new m.s2(this, 3));
        this.E0.addTextChangedListener(new ze(this));
        this.E0.addTextChangedListener(new org.telegram.ui.Cells.j3());
        this.E0.setEnabled(this.I4);
        ArrayList arrayList = this.H4;
        if (arrayList != null) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                this.E0.addTextChangedListener((TextWatcher) obj);
            }
            this.H4.clear();
        }
        I1(false);
        R1(anVar != null && anVar.getFragmentBeginToShow());
        if (anVar != null) {
            anVar.M6(false, false);
        }
        J1(this.P4);
    }

    public boolean S0() {
        boolean z9 = this.D1;
        org.telegram.ui.ActionBar.f6 f6Var = this.W3;
        if (z9 && !org.telegram.messenger.p10.i(this.Q).q()) {
            li.b2.u0(getContext(), new ad(this, 21), new ad(this, 22), f6Var);
            return true;
        }
        if (!c()) {
            return T0(true, 0, 0, 0L, true);
        }
        v4.J(this.O2, this.P2.a(), new zd(this, 2), f6Var);
        return true;
    }

    public final void S1(boolean z9, boolean z10) {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        float f10;
        float f11;
        cn0 cn0Var;
        cn0 cn0Var2;
        ud udVar;
        if (this.Z2 == null) {
            return;
        }
        S();
        if (this.p5) {
            peer = this.Z2.s();
            chat = null;
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.Q).M0(Long.valueOf(-this.Q2));
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(this.Q).N0(-this.Q2);
            TLRPC.Peer peer2 = N0 != null ? N0.default_send_as : null;
            chat = M0;
            peer = peer2;
        }
        if (peer == null && this.Z2.I() != null && !this.Z2.I().peers.isEmpty()) {
            peer = this.Z2.I().peers.get(0).peer;
        }
        org.telegram.ui.an anVar = this.P2;
        boolean z11 = (z9 || peer == null || (this.Z2.I() != null && this.Z2.I().peers.size() <= 1) || q0() || v0() || (((udVar = this.e1) != null && udVar.getVisibility() == 0) || ((!this.p5 && ((org.telegram.messenger.t3.V(chat) && !org.telegram.messenger.t3.k(chat)) || org.telegram.messenger.t3.p0(chat))) || (anVar != null && anVar.f4 == 9)))) ? false : true;
        if (z11) {
            X();
        }
        if (peer != null) {
            if (peer.channel_id != 0) {
                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(this.Q).M0(Long.valueOf(peer.channel_id));
                if (M02 != null && (cn0Var2 = this.p0) != null) {
                    cn0Var2.setAvatar(M02);
                    this.p0.setContentDescription(org.telegram.messenger.hd.a0(null, null, 2131754776, M02.title));
                }
            } else {
                TLRPC.User a22 = org.telegram.messenger.qp.s1(this.Q).a2(Long.valueOf(peer.user_id));
                if (a22 != null && (cn0Var = this.p0) != null) {
                    cn0Var.setAvatar(a22);
                    this.p0.setContentDescription(org.telegram.messenger.hd.a0(null, null, 2131754776, org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name)));
                }
            }
        }
        cn0 cn0Var3 = this.p0;
        boolean z12 = cn0Var3 != null && cn0Var3.getVisibility() == 0;
        int L = org.telegram.messenger.g0.L(2.0f);
        float f12 = z11 ? 0.0f : 1.0f;
        float f13 = z11 ? 1.0f : 0.0f;
        cn0 cn0Var4 = this.p0;
        if (cn0Var4 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cn0Var4.getLayoutParams();
            f11 = z11 ? ((-this.p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - L : 0.0f;
            f10 = z11 ? 0.0f : ((-this.p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        if (z12 == z11) {
            return;
        }
        cn0 cn0Var5 = this.p0;
        ValueAnimator valueAnimator = cn0Var5 == null ? null : (ValueAnimator) cn0Var5.getTag();
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.p0.setTag(null);
        }
        if ((this.p5 || (anVar != null && anVar.Z8() == 0 && anVar.e6)) && z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            cn0 cn0Var6 = this.p0;
            if (cn0Var6 != null) {
                cn0Var6.setTranslationX(f11);
            }
            this.G = f11;
            L1();
            float f14 = f10;
            float f15 = f13;
            float f16 = f11;
            duration.addUpdateListener(new k5(this, f16, f14, f12, f15, 1));
            duration.addListener(new hf(this, z11, f12, f16, f15, f14));
            duration.start();
            cn0 cn0Var7 = this.p0;
            if (cn0Var7 != null) {
                cn0Var7.setTag(duration);
                return;
            }
            return;
        }
        float f17 = f10;
        float f18 = f13;
        boolean z13 = z11;
        if (z13) {
            X();
        }
        cn0 cn0Var8 = this.p0;
        if (cn0Var8 != null) {
            cn0Var8.setVisibility(z13 ? 0 : 8);
            this.p0.setTranslationX(f17);
        }
        float f19 = z13 ? f17 : 0.0f;
        this.Q0.setTranslationX(f19);
        this.G = f19;
        L1();
        cn0 cn0Var9 = this.p0;
        if (cn0Var9 != null) {
            cn0Var9.setAlpha(f18);
            this.p0.setTag(null);
        }
    }

    public final void T() {
        if (this.e1 != null) {
            return;
        }
        ud udVar = new ud(this, getContext(), 3);
        this.e1 = udVar;
        udVar.setVisibility(this.b3 == null ? 8 : 0);
        this.e1.setFocusable(true);
        this.e1.setFocusableInTouchMode(true);
        this.e1.setClickable(true);
        this.y1.addView(this.e1, c8.ha.e(-1, 44, 80));
        ch0 ch0Var = new ch0(getContext());
        this.g1 = ch0Var;
        ch0Var.setScaleType(ImageView.ScaleType.CENTER);
        this.g1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.g1.getAnimatedDrawable().o0 = true;
        O1();
        this.g1.setContentDescription(org.telegram.messenger.hd.M0(2131751599, "Delete"));
        ch0 ch0Var2 = this.g1;
        int i7 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(f0(i7), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        org.telegram.ui.ActionBar.f6 f6Var = this.W3;
        org.telegram.ui.ActionBar.r6.R(ch0Var2, h02, null, N, f6Var);
        this.e1.addView(this.g1, c8.ha.c(44.0f, 44));
        this.g1.setOnClickListener(new cd(this, 6));
        h61 h61Var = new h61(getContext());
        this.f1 = h61Var;
        h61Var.setVisibility(4);
        h61 h61Var2 = this.f1;
        h61Var2.S = !this.y4;
        h61Var2.setRoundFrames(true);
        this.f1.setDelegate(new me(this));
        this.e1.addView(this.f1, c8.ha.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        f61 f61Var = new f61(context);
        TextPaint textPaint = new TextPaint(1);
        f61Var.d = textPaint;
        f61Var.e = -1L;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        f61Var.b = context.getDrawable(R.drawable.tooltip_arrow);
        f61Var.a = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(5.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.eg, false));
        f61Var.b();
        f61Var.setTime(0);
        this.f1.setTimeHintView(f61Var);
        this.m1.addView(f61Var, c8.ha.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        ji0 ji0Var = new ji0(getContext(), f6Var);
        this.h1 = ji0Var;
        this.e1.addView(ji0Var, c8.ha.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        J1(this.P4);
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
    /* JADX WARN: Type inference failed for: r3v6, types: [org.telegram.messenger.ij, org.telegram.tgnet.TLRPC$WebPage] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean T0(final boolean z9, final int i7, final int i10, long j3, boolean z10) {
        ChatActivityEnterView chatActivityEnterView;
        ChatActivityEnterView chatActivityEnterView2;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i15;
        CharSequence charSequence3;
        org.telegram.messenger.ej ejVar;
        org.telegram.messenger.ij threadMessage;
        String str;
        int i16;
        CharSequence charSequence4;
        CharSequence charSequence5;
        org.telegram.ui.an anVar;
        ?? r32;
        TLRPC.WebPage webPage;
        boolean z12;
        org.telegram.messenger.mj mjVar;
        org.telegram.messenger.mj mjVar2;
        ChatActivityEnterView chatActivityEnterView3;
        TLRPC.Chat chat;
        org.telegram.messenger.mj mjVar3;
        org.telegram.messenger.ij ijVar;
        wf wfVar;
        TLRPC.Chat chat2;
        TL_iv.RichMessage richMessage;
        ChatActivityEnterView chatActivityEnterView4;
        mf mfVar;
        int i17 = 1;
        ?? r02 = z10 && !this.m5.f;
        if (r02 == true) {
            boolean Y = v4.Y(this.Q, this.Q2, getMessagesCount(), new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.qd
                @Override // org.telegram.messenger.c20
                public final void a(Object obj) {
                    int i18 = ChatActivityEnterView.s5;
                    ChatActivityEnterView chatActivityEnterView5 = ChatActivityEnterView.this;
                    chatActivityEnterView5.getClass();
                    chatActivityEnterView5.T0(z9, i7, i10, ((Long) obj).longValue(), false);
                }
            }, j3);
            if (Y && this.s4) {
                if (this.c1) {
                    if (!this.Z2.X0()) {
                        SlideTextView slideTextView = this.k1;
                        if (slideTextView != null) {
                            slideTextView.setEnabled(false);
                        }
                        this.Z2.c1();
                        return Y;
                    }
                } else if (!MediaController.B().K()) {
                    if (this.s4) {
                        this.J3 = true;
                    }
                    MediaController.B().D0(this.O);
                    this.Z2.R0(0);
                    SlideTextView slideTextView2 = this.k1;
                    if (slideTextView2 != null) {
                        slideTextView2.setEnabled(false);
                    }
                }
            }
            return Y;
        }
        if (this.G0 != Integer.MAX_VALUE || c()) {
            org.telegram.ui.an anVar2 = this.P2;
            if (anVar2 != null) {
                TLRPC.Chat chat3 = anVar2.e;
                if (anVar2.j() != null || ((org.telegram.messenger.t3.T(chat3) && chat3.megagroup) || !org.telegram.messenger.t3.T(chat3))) {
                    org.telegram.messenger.qp.s1(this.Q).d7.edit().putBoolean("silent_" + this.Q2, !z9).commit();
                }
            }
            if (this.z3) {
                n1(false, true, false, true);
                if (this.R1 != 0 && (mfVar = this.U0) != null) {
                    mfVar.t(false);
                    this.U0.A();
                }
            }
            if (r02 == true) {
                chatActivityEnterView = this;
                if (chatActivityEnterView.r1(new org.telegram.messenger.il(this, z9, i7, i10, j3))) {
                    chatActivityEnterView2 = chatActivityEnterView;
                }
            } else {
                chatActivityEnterView = this;
            }
            chatActivityEnterView.E4 = true;
            org.telegram.messenger.j20 j20Var = chatActivityEnterView.e3;
            ge geVar = chatActivityEnterView.J0;
            if (j20Var != null) {
                chatActivityEnterView.Z2.Z1(4, i7, chatActivityEnterView.O ? Integer.MAX_VALUE : 0, chatActivityEnterView.S4, j3, z9);
                chatActivityEnterView.S4 = 0L;
                geVar.setEffect(0L);
                chatActivityEnterView.m0(true);
                chatActivityEnterView.E(true);
                org.telegram.messenger.g0.i3(new ad(chatActivityEnterView, i17), 100L);
                chatActivityEnterView.i1 = 0L;
                return false;
            }
            if (chatActivityEnterView.b3 != null) {
                org.telegram.messenger.ij ijVar2 = MediaController.B().u0;
                if (ijVar2 != null && ijVar2 == chatActivityEnterView.d3) {
                    MediaController.B().q(true, true, false, false);
                }
                MediaController.B().n(false);
                org.telegram.messenger.ui.b0(chatActivityEnterView.Q).B1(chatActivityEnterView.Q2, (anVar2 == null || !anVar2.v4) ? 0L : anVar2.b(), null);
                ji0 ji0Var = chatActivityEnterView.h1;
                if (ji0Var != null && (ji0Var.s > 0.0f || ji0Var.w < 1.0f)) {
                    ji0Var.setPlaying(false);
                    String s9 = a8.p0.s(new StringBuilder(), chatActivityEnterView.c3, ".ogg");
                    if (MediaController.cropOpusFile(chatActivityEnterView.c3, s9, chatActivityEnterView.h1.getAudioLeftMs(), chatActivityEnterView.h1.getAudioRightMs())) {
                        try {
                            new File(chatActivityEnterView.c3).delete();
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        try {
                            new File(s9).renameTo(new File(chatActivityEnterView.c3));
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        int i18 = 0;
                        while (true) {
                            if (i18 >= chatActivityEnterView.b3.attributes.size()) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = chatActivityEnterView.b3.attributes.get(i18);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                documentAttribute.waveform = MediaController.getWaveform(chatActivityEnterView.c3);
                                documentAttribute.duration = chatActivityEnterView.h1.getNewDuration();
                                break;
                            }
                            i18++;
                        }
                    }
                }
                org.telegram.messenger.ez f10 = org.telegram.messenger.ez.f(chatActivityEnterView.b3, null, chatActivityEnterView.c3, chatActivityEnterView.Q2, chatActivityEnterView.T2, chatActivityEnterView.getThreadMessage(), null, null, null, null, z9, i7, 0, chatActivityEnterView.O ? Integer.MAX_VALUE : 0, null, null, false);
                f10.K = anVar2 != null ? anVar2.W8() : null;
                f10.O = this.S4;
                f10.Q = j3;
                f10.R = getSendMonoForumPeerId();
                f10.T = getSendMessageSuggestionParams();
                this.S4 = 0L;
                geVar.setEffect(0L);
                if (!this.Z2.l1()) {
                    org.telegram.messenger.ej ejVar2 = new org.telegram.messenger.ej();
                    ejVar2.h = System.currentTimeMillis() - this.M0 < 200;
                    f10.E = ejVar2;
                }
                p(f10);
                org.telegram.messenger.gz.C(this.Q).r0(f10);
                wf wfVar2 = this.Z2;
                if (wfVar2 != null) {
                    chatActivityEnterView4 = this;
                    wfVar2.F(null, z9, i7, i10, j3);
                } else {
                    chatActivityEnterView4 = this;
                }
                chatActivityEnterView4.m0(true);
                chatActivityEnterView4.E(true);
                org.telegram.messenger.g0.i3(new ad(chatActivityEnterView4, 2), 100L);
                chatActivityEnterView4.i1 = 0L;
            } else {
                ChatActivityEnterView chatActivityEnterView5 = chatActivityEnterView;
                long j10 = 200;
                String str2 = "";
                if (!chatActivityEnterView5.D1 || (richMessage = chatActivityEnterView5.E1) == null) {
                    org.telegram.ui.an anVar3 = anVar2;
                    int i19 = 1;
                    ge geVar2 = geVar;
                    chatActivityEnterView2 = chatActivityEnterView5;
                    xe xeVar = chatActivityEnterView2.E0;
                    CharSequence textToUse = xeVar == null ? "" : xeVar.getTextToUse();
                    if (anVar3 != null && (chat2 = anVar3.e) != null && chat2.slowmode_enabled && !org.telegram.messenger.t3.N(chat2)) {
                        int length = textToUse.length();
                        int u12 = org.telegram.messenger.qp.s1(chatActivityEnterView2.R.a).u1();
                        org.telegram.ui.ActionBar.f6 f6Var = chatActivityEnterView2.W3;
                        if (length > u12) {
                            v4.r0(anVar3, org.telegram.messenger.hd.M0(2131745311, "Slowmode"), org.telegram.messenger.hd.M0(2131745302, "SlowmodeSendErrorTooLong"), f6Var);
                        } else if (chatActivityEnterView2.H2 && textToUse.length() > 0) {
                            v4.r0(anVar3, org.telegram.messenger.hd.M0(2131745311, "Slowmode"), org.telegram.messenger.hd.M0(2131745303, "SlowmodeSendError"), f6Var);
                        }
                    }
                    if (!C(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, anVar3, textToUse)) {
                        org.telegram.ui.qm qmVar = chatActivityEnterView2.V2;
                        if (qmVar == null || anVar3 == null || !qmVar.f) {
                            int[] iArr = new int[1];
                            org.telegram.messenger.i6.j(textToUse, iArr);
                            ?? r28 = 0;
                            ?? r17 = iArr[0] > 0;
                            CharSequence n1 = r17 == false ? org.telegram.messenger.g0.n1(textToUse) : textToUse;
                            boolean A1 = chatActivityEnterView2.A1();
                            int u13 = org.telegram.messenger.qp.s1(chatActivityEnterView2.R.a).u1();
                            if (n1.length() != 0) {
                                if (chatActivityEnterView2.Z2 != null && anVar3 != null) {
                                    if ((i7 != 0) == anVar3.c()) {
                                        chatActivityEnterView2.Z2.w0();
                                    }
                                }
                                int i20 = 0;
                                while (true) {
                                    int i21 = i20 + u13;
                                    if (n1.length() > i21) {
                                        int i22 = i21 - 1;
                                        i12 = -1;
                                        i13 = -1;
                                        i14 = -1;
                                        for (int i23 = r28; i22 > i20 && i23 < 300; i23++) {
                                            char charAt = n1.charAt(i22);
                                            char charAt2 = i22 > 0 ? n1.charAt(i22 - 1) : ' ';
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
                                    int min = Math.min(i21, n1.length());
                                    if (i11 > 0) {
                                        min = i11;
                                    } else if (i14 > 0) {
                                        min = i14;
                                    } else if (i12 > 0) {
                                        min = i12;
                                    } else if (i13 > 0) {
                                        min = i13;
                                    }
                                    CharSequence subSequence = n1.subSequence(i20, min);
                                    if (r17 == false) {
                                        subSequence = org.telegram.messenger.g0.n1(subSequence);
                                    }
                                    CharSequence[] charSequenceArr = new CharSequence[i19];
                                    charSequenceArr[r28] = subSequence;
                                    ArrayList W = org.telegram.messenger.ui.b0(chatActivityEnterView2.Q).W(charSequenceArr, A1, i19);
                                    if (chatActivityEnterView2.Z2.l1()) {
                                        boolean z13 = i19;
                                        charSequence = n1;
                                        if (chatActivityEnterView2.L0 != null) {
                                            ejVar = new org.telegram.messenger.ej();
                                            charSequence2 = textToUse;
                                            i15 = min;
                                            ejVar.h = System.currentTimeMillis() - chatActivityEnterView2.M0 < j10 ? z13 : r28;
                                        } else {
                                            charSequence2 = textToUse;
                                            i15 = min;
                                            charSequence3 = charSequence;
                                            ejVar = null;
                                            boolean h = org.telegram.messenger.gz.h(charSequence3);
                                            threadMessage = chatActivityEnterView2.getThreadMessage();
                                            if (threadMessage == null && (ijVar = chatActivityEnterView2.U2) != null) {
                                                threadMessage = ijVar;
                                            }
                                            str = str2;
                                            ge geVar3 = geVar2;
                                            i16 = i15;
                                            charSequence4 = charSequence2;
                                            boolean z14 = A1;
                                            charSequence5 = charSequence3;
                                            anVar = anVar3;
                                            org.telegram.messenger.ez b10 = org.telegram.messenger.ez.b(charSequenceArr[r28].toString(), chatActivityEnterView2.Q2, chatActivityEnterView2.T2, threadMessage, chatActivityEnterView2.X2, chatActivityEnterView2.Y2, W, null, null, z9, i7, i10, ejVar, h);
                                            b10.K = anVar == null ? anVar.W8() : null;
                                            b10.O = this.S4;
                                            b10.Q = j3;
                                            b10.R = getSendMonoForumPeerId();
                                            b10.T = getSendMessageSuggestionParams();
                                            this.S4 = 0L;
                                            geVar3.setEffect(0L);
                                            p(b10);
                                            b10.L = anVar == null && (mjVar3 = anVar.v5) != null && mjVar3.r;
                                            if (anVar != null || (chat = anVar.e) == null || org.telegram.messenger.t3.m(chat)) {
                                                r32 = 0;
                                                r32 = 0;
                                                r32 = 0;
                                                z11 = false;
                                                webPage = this.X2;
                                                if (webPage instanceof TLRPC.TL_webPagePending) {
                                                    z12 = true;
                                                    if (webPage != null) {
                                                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                                                        b10.n = tL_messageMediaWebPage;
                                                        tL_messageMediaWebPage.webpage = this.X2;
                                                        tL_messageMediaWebPage.force_large_media = (anVar == null || (mjVar2 = anVar.v5) == null || mjVar2.q) ? false : true;
                                                        tL_messageMediaWebPage.force_small_media = (anVar == null || (mjVar = anVar.v5) == null || !mjVar.q) ? false : true;
                                                    }
                                                } else {
                                                    z12 = true;
                                                    b10.u = true;
                                                    b10.n = null;
                                                }
                                            } else {
                                                z11 = false;
                                                b10.u = false;
                                                r32 = 0;
                                                b10.n = null;
                                                z12 = true;
                                            }
                                            if (anVar != null) {
                                                anVar.F5 = r32;
                                                anVar.W5 = r32;
                                                org.telegram.messenger.mj mjVar4 = anVar.v5;
                                                if (mjVar4 != null) {
                                                    mjVar4.e(this.Q, null, "", null, null, null);
                                                }
                                                this.X2 = r32;
                                                this.Y2 = z12;
                                                anVar.z8();
                                            }
                                            org.telegram.messenger.gz.C(this.Q).r0(b10);
                                            i20 = i16 + 1;
                                            if (i16 != charSequence5.length()) {
                                                break;
                                            }
                                            geVar2 = geVar3;
                                            i19 = z12;
                                            r28 = z11;
                                            anVar3 = anVar;
                                            textToUse = charSequence4;
                                            A1 = z14;
                                            n1 = charSequence5;
                                            str2 = str;
                                            j10 = 200;
                                            chatActivityEnterView2 = this;
                                        }
                                    } else {
                                        org.telegram.messenger.ej ejVar3 = new org.telegram.messenger.ej();
                                        ?? r27 = i19;
                                        charSequence = n1;
                                        ejVar3.h = System.currentTimeMillis() - chatActivityEnterView2.M0 < j10 ? r27 == true ? 1 : 0 : r28;
                                        ejVar3.c = org.telegram.messenger.g0.L(22.0f);
                                        xe xeVar2 = chatActivityEnterView2.E0;
                                        if (xeVar2 != null) {
                                            xeVar2.getLocationInWindow(chatActivityEnterView2.N2);
                                            ejVar3.a = org.telegram.messenger.g0.L(11.0f) + r12[r28];
                                            ejVar3.b = org.telegram.messenger.g0.L(19.0f) + r12[r27 == true ? 1 : 0];
                                        } else {
                                            ejVar3.a = org.telegram.messenger.g0.L(55.0f);
                                            ejVar3.b = org.telegram.messenger.g0.q.y - org.telegram.messenger.g0.L(19.0f);
                                        }
                                        charSequence2 = textToUse;
                                        i15 = min;
                                        ejVar = ejVar3;
                                    }
                                    charSequence3 = charSequence;
                                    boolean h7 = org.telegram.messenger.gz.h(charSequence3);
                                    threadMessage = chatActivityEnterView2.getThreadMessage();
                                    if (threadMessage == null) {
                                        threadMessage = ijVar;
                                    }
                                    str = str2;
                                    ge geVar32 = geVar2;
                                    i16 = i15;
                                    charSequence4 = charSequence2;
                                    boolean z142 = A1;
                                    charSequence5 = charSequence3;
                                    anVar = anVar3;
                                    org.telegram.messenger.ez b102 = org.telegram.messenger.ez.b(charSequenceArr[r28].toString(), chatActivityEnterView2.Q2, chatActivityEnterView2.T2, threadMessage, chatActivityEnterView2.X2, chatActivityEnterView2.Y2, W, null, null, z9, i7, i10, ejVar, h7);
                                    b102.K = anVar == null ? anVar.W8() : null;
                                    b102.O = this.S4;
                                    b102.Q = j3;
                                    b102.R = getSendMonoForumPeerId();
                                    b102.T = getSendMessageSuggestionParams();
                                    this.S4 = 0L;
                                    geVar32.setEffect(0L);
                                    p(b102);
                                    b102.L = anVar == null && (mjVar3 = anVar.v5) != null && mjVar3.r;
                                    if (anVar != null) {
                                    }
                                    r32 = 0;
                                    r32 = 0;
                                    r32 = 0;
                                    z11 = false;
                                    webPage = this.X2;
                                    if (webPage instanceof TLRPC.TL_webPagePending) {
                                    }
                                    if (anVar != null) {
                                    }
                                    org.telegram.messenger.gz.C(this.Q).r0(b102);
                                    i20 = i16 + 1;
                                    if (i16 != charSequence5.length()) {
                                    }
                                }
                                if (this.Z2.l1() || (!(i7 == 0 || c()) || c())) {
                                    chatActivityEnterView3 = this;
                                    xe xeVar3 = chatActivityEnterView3.E0;
                                    if (xeVar3 != null) {
                                        xeVar3.setText(str);
                                    }
                                    wf wfVar3 = chatActivityEnterView3.Z2;
                                    if (wfVar3 != null) {
                                        wfVar3.F(charSequence4, z9, i7, i10, j3);
                                    }
                                } else {
                                    this.g0 = z11;
                                    org.telegram.messenger.rp rpVar = new org.telegram.messenger.rp(this, charSequence4, z9, i7, i10, j3);
                                    chatActivityEnterView3 = this;
                                    chatActivityEnterView3.f0 = rpVar;
                                    org.telegram.messenger.g0.i3(rpVar, 200L);
                                }
                                chatActivityEnterView3.C2 = 0L;
                                chatActivityEnterView3.T1();
                                return z11;
                            }
                            z11 = false;
                        } else {
                            anVar3.uc();
                            z11 = false;
                        }
                        chatActivityEnterView3 = chatActivityEnterView2;
                        if (chatActivityEnterView3.H2 && (wfVar = chatActivityEnterView3.Z2) != null) {
                            wfVar.F(null, z9, i7, i10, j3);
                        }
                        chatActivityEnterView3.T1();
                        return z11;
                    }
                } else {
                    org.telegram.messenger.gz.R(chatActivityEnterView5.R, richMessage.blocks, richMessage.photos, richMessage.documents, null, chatActivityEnterView5.Q2, chatActivityEnterView5.T2, chatActivityEnterView5.getThreadMessage(), chatActivityEnterView5.V2, z9, i7, i10, anVar2 != null ? anVar2.W8() : null, chatActivityEnterView5.S4, chatActivityEnterView5.getSendMonoForumPeerId(), j3);
                    chatActivityEnterView2 = this;
                    chatActivityEnterView2.S4 = 0L;
                    geVar.setEffect(0L);
                    chatActivityEnterView2.E0.setText("");
                    chatActivityEnterView2.J();
                    wf wfVar4 = chatActivityEnterView2.Z2;
                    if (wfVar4 != null) {
                        wfVar4.F(null, z9, i7, i10, j3);
                    }
                    chatActivityEnterView2.E(true);
                }
            }
        } else {
            wf wfVar5 = this.Z2;
            if (wfVar5 != null) {
                wfVar5.I0();
                return false;
            }
            chatActivityEnterView2 = this;
        }
        return false;
    }

    public final void T1() {
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
            J1(this.P4);
        }
        if (this.p5) {
            O();
            if (q()) {
                int[] iArr = org.telegram.messenger.qp.s1(this.Q).X6;
                b10 = (iArr == null || iArr.length <= 2) ? 400 : iArr[2];
            } else {
                b10 = di.t.b(this.Q, (int) starsPrice, 1);
            }
            if (this.c0 != b10) {
                this.c0 = b10;
                if (b10 > 0) {
                    int i7 = b10 - this.d0;
                    if (i7 <= (this.p5 ? 5 : 100)) {
                        if (i7 < -9999) {
                            i7 = -9999;
                        }
                        O();
                        NumberTextView numberTextView = this.b0;
                        numberTextView.a(i7, numberTextView.getVisibility() == 0);
                        if (this.b0.getVisibility() != 0) {
                            this.b0.setVisibility(0);
                            this.b0.setAlpha(0.0f);
                            this.b0.setScaleX(0.5f);
                            this.b0.setScaleY(0.5f);
                        }
                        this.b0.animate().setListener(null).cancel();
                        this.b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        this.b0.setTextColor(f0(i7 < 0 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.y6));
                        return;
                    }
                }
                NumberTextView numberTextView2 = this.b0;
                if (numberTextView2 != null) {
                    numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new he(this, 0));
                }
            }
        }
    }

    public final void U() {
        ag agVar = this.O1;
        rt0 rt0Var = this.m1;
        if (agVar == null) {
            ag agVar2 = new ag(this, getContext());
            this.O1 = agVar2;
            agVar2.setVisibility(8);
            rt0Var.addView(this.O1, c8.ha.e(-1, -2, 80));
        }
        if (this.N1 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.N1 = recordCircle;
        recordCircle.setVisibility(8);
        rt0Var.addView(this.N1, c8.ha.e(-1, -2, 80));
    }

    public final void U0(boolean z9, boolean z10, boolean z11) {
        if ((this.J2 != z9 || this.K2 != z10) && this.U0 != null) {
            if (this.W0 && !z11) {
                this.G3 = true;
                k0(false);
            } else if (z11) {
                I0();
            }
        }
        this.I2 = true;
        this.J2 = z9;
        this.K2 = z10;
        mf mfVar = this.U0;
        if (mfVar != null) {
            mfVar.I(true, z9, z10, true);
        }
        c1(false, !this.j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (((java.lang.Integer) org.telegram.messenger.gz.C(r9.Q).f.g(0, r9.Q2)).intValue() > 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U1() {
        int i7;
        int currentTime = ConnectionsManager.getInstance(this.Q).getCurrentTime();
        org.telegram.messenger.g0.r(this.H0);
        this.H0 = null;
        TLRPC.ChatFull chatFull = this.d2;
        if (chatFull != null && chatFull.slowmode_seconds != 0 && chatFull.slowmode_next_send_date <= currentTime) {
            boolean z9 = ((Integer) org.telegram.messenger.gz.C(this.Q).h.g(0, this.Q2)).intValue() > 0;
            if (!z9) {
            }
            if (!org.telegram.messenger.t3.N(org.telegram.messenger.qp.s1(this.R.a).M0(Long.valueOf(this.d2.id))) && !org.telegram.messenger.t3.i0(this.d2)) {
                i7 = this.d2.slowmode_seconds;
                this.G0 = z9 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2147483646;
                if (this.G0 != 0 || i7 <= 0) {
                    this.G0 = 0;
                } else {
                    String h02 = org.telegram.messenger.g0.h0(Math.max(1, i7), false);
                    eg egVar = this.F0;
                    ((org.telegram.ui.ActionBar.k5) egVar.c).l(h02, false);
                    egVar.invalidate();
                    wf wfVar = this.Z2;
                    if (wfVar != null) {
                        wfVar.i1(egVar, ((org.telegram.ui.ActionBar.k5) egVar.c).getText(), false);
                    }
                    ad adVar = new ad(this, 10);
                    this.H0 = adVar;
                    org.telegram.messenger.g0.i3(adVar, 100L);
                }
                if (c()) {
                    E(true);
                    return;
                }
                return;
            }
            i7 = 0;
            if (this.G0 != 0) {
            }
            this.G0 = 0;
            if (c()) {
            }
        }
        int i10 = this.G0;
        if (i10 >= 2147483646) {
            if (this.d2 != null) {
                org.telegram.messenger.qp.s1(this.R.a).V2(0, this.d2.id, true);
            }
            i7 = 0;
            if (this.G0 != 0) {
            }
            this.G0 = 0;
            if (c()) {
            }
        } else {
            i7 = i10 - currentTime;
            if (this.G0 != 0) {
            }
            this.G0 = 0;
            if (c()) {
            }
        }
    }

    public final void V() {
        if (this.d1 != null || getContext() == null) {
            return;
        }
        di.a4 a4Var = new di.a4(getContext(), 13);
        this.d1 = a4Var;
        a4Var.setClipChildren(false);
        this.d1.setVisibility(8);
        this.y1.addView(this.d1, c8.ha.c(44.0f, -1));
        this.d1.setOnTouchListener(new ei.b(12));
        di.a4 a4Var2 = this.d1;
        SlideTextView slideTextView = new SlideTextView(getContext());
        this.k1 = slideTextView;
        a4Var2.addView(slideTextView, c8.ha.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        this.d.setPadding(org.telegram.messenger.g0.L(13.0f), 0, 0, 0);
        this.d.setFocusable(false);
        LinearLayout linearLayout2 = this.d;
        cg cgVar = new cg(this, getContext());
        this.l1 = cgVar;
        linearLayout2.addView(cgVar, c8.ha.t(28, 28, 16, 0, 0, 0, 0));
        LinearLayout linearLayout3 = this.d;
        fg fgVar = new fg(this, getContext());
        this.Y0 = fgVar;
        linearLayout3.addView(fgVar, c8.ha.t(-1, -1, 16, 6, 0, 0, 0));
        this.d1.addView(this.d, c8.ha.e(-1, -1, 16));
    }

    public final void V0() {
        fi.m3 m3Var = this.L;
        if (m3Var == null) {
            return;
        }
        m3Var.u(org.telegram.messenger.i6.o(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131743763, org.telegram.messenger.t10.j(this.P2.j(), true))), this.L.getTextPaint().getFontMetricsInt(), 20, new ad(this, 27)));
        fi.m3 m3Var2 = this.L;
        m3Var2.h = fi.m3.a(m3Var2.getText(), this.L.getTextPaint());
    }

    public final void W() {
        if (this.J1 != null || this.P2 == null) {
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
        int i7 = org.telegram.ui.ActionBar.k6.Kl;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f6 f6Var = this.W3;
        org.telegram.ui.ActionBar.r6.y(this, mutate, i7, f6Var, mode);
        org.telegram.ui.ActionBar.r6.y(this, mutate2, org.telegram.ui.ActionBar.k6.Xf, f6Var, mode);
        xp xpVar = new xp(mutate, mutate2);
        ie ieVar = new ie(this, getContext());
        this.J1 = ieVar;
        ieVar.setImageDrawable(xpVar);
        this.J1.setVisibility(8);
        this.J1.setContentDescription(org.telegram.messenger.hd.M0(2131745849, null));
        this.J1.setScaleType(ImageView.ScaleType.CENTER);
        ie ieVar2 = this.J1;
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.r6.R(ieVar2, org.telegram.ui.ActionBar.k6.h0(f0(i10), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i10), f6Var);
        this.y1.addView(this.J1, 2, c8.ha.e(44, 44, 85));
        this.J1.setOnClickListener(new cd(this, 2));
        this.J1.setTranslationX(0.0f);
    }

    public final void W0(a0.h hVar, boolean z9) {
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
        hi.x xVar = this.n0;
        if (xVar != null) {
            xVar.E(hVar);
        }
        D1(z9);
        B(z9);
    }

    public final void X() {
        if (this.p0 != null || getContext() == null) {
            return;
        }
        cn0 cn0Var = new cn0(getContext());
        ImageReceiver imageReceiver = new ImageReceiver(cn0Var);
        cn0Var.a = imageReceiver;
        cn0Var.b = new w8((org.telegram.ui.ActionBar.f6) null);
        cn0Var.d = new Paint(1);
        Paint paint = new Paint(1);
        cn0Var.e = paint;
        imageReceiver.J0(org.telegram.messenger.g0.L(28.0f));
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        cn0Var.updateColors();
        cn0Var.setContentDescription(org.telegram.messenger.hd.a0("AccDescrSendAsPeer", null, 2131754775, ""));
        this.p0 = cn0Var;
        cn0Var.setOnClickListener(new cd(this, 16));
        this.p0.setVisibility(8);
        this.y1.addView(this.p0, c8.ha.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
    }

    public final void X0(int i7, boolean z9, boolean z10) {
        this.o2 = i7;
        if (this.p2 == z9) {
            return;
        }
        this.p2 = z9;
        D1(z10);
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            H();
            I();
        } else if (i7 == 1) {
            H();
            I();
        } else {
            if (i7 == 2) {
                jh.h hVar = this.I0;
                hVar.setAlpha(f10);
                hVar.setScaleX(org.telegram.messenger.g0.T1(0.5f, 1.0f, f10));
                hVar.setScaleY(org.telegram.messenger.g0.T1(0.5f, 1.0f, f10));
                hVar.setVisibility(f10 <= 0.0f ? 4 : 0);
            } else if (i7 == 3) {
                float T1 = org.telegram.messenger.g0.T1(1.0f, 0.79f, f10);
                ud udVar = this.A1;
                udVar.setScaleX(T1);
                udVar.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.79f, f10));
                float T12 = org.telegram.messenger.g0.T1(0.79f, 1.0f, f10);
                ImageView imageView = this.B1;
                imageView.setScaleX(T12);
                imageView.setScaleY(org.telegram.messenger.g0.T1(0.79f, 1.0f, f10));
                imageView.setVisibility(f10 <= 0.0f ? 8 : 0);
                imageView.setAlpha(f10);
                ge geVar = this.J0;
                if (geVar != null) {
                    geVar.setSameWidthFactor(f10);
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
    public final void Y0(org.telegram.messenger.ij ijVar, boolean z9, boolean z10) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        xe xeVar;
        org.telegram.messenger.ij ijVar2 = this.T2;
        if (ijVar2 != null && ijVar2 == this.m2 && ijVar2 != ijVar) {
            this.W2 = ijVar;
            return;
        }
        org.telegram.messenger.ij ijVar3 = this.m2;
        if (ijVar3 == null || ijVar3 != ijVar) {
            if (ijVar3 == null && ijVar == null) {
                return;
            }
            if (this.H1 == null) {
                jf jfVar = new jf(this, this.O2, this.W3);
                this.H1 = jfVar;
                jfVar.setVisibility(8);
                this.X0 = false;
                this.H1.setDelegate(new jd(this));
                this.n1.addView(this.H1);
            }
            this.m2 = ijVar;
            if (ijVar != null) {
                TLRPC.ReplyMarkup replyMarkup = ijVar.k.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyKeyboardMarkup) {
                    tL_replyKeyboardMarkup = (TLRPC.TL_replyKeyboardMarkup) replyMarkup;
                    this.n2 = tL_replyKeyboardMarkup;
                    jf jfVar2 = this.H1;
                    Point point = org.telegram.messenger.g0.q;
                    jfVar2.setPanelHeight(point.x <= point.y ? this.y2 : this.x2);
                    if (this.n2 == null) {
                        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(this.Q).e7;
                        if (this.m2 != this.T2 && ijVar != null) {
                            if (this.n2.single_use) {
                            }
                            if (!this.n2.is_persistent) {
                            }
                        }
                        boolean z11 = true;
                        boolean z12 = z9 ? z11 : false;
                        this.H1.setButtons(this.n2);
                        if (z12 && (((xeVar = this.E0) == null || xeVar.length() == 0) && !s0())) {
                            t1(1, 1, true, true);
                        }
                    } else if (s0() && this.f2 == 1) {
                        if (z10) {
                            this.p3 = true;
                            I0();
                        } else {
                            t1(0, 1, true, true);
                        }
                    }
                    D1(true);
                }
            }
            tL_replyKeyboardMarkup = null;
            this.n2 = tL_replyKeyboardMarkup;
            jf jfVar22 = this.H1;
            Point point2 = org.telegram.messenger.g0.q;
            jfVar22.setPanelHeight(point2.x <= point2.y ? this.y2 : this.x2);
            if (this.n2 == null) {
            }
            D1(true);
        }
    }

    public final boolean Z(TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.ij ijVar, org.telegram.messenger.ij ijVar2, org.telegram.ui.gi giVar) {
        org.telegram.ui.an anVar;
        int i7;
        int i10 = 0;
        if (keyboardButtonProto != null && ijVar2 != null && ((anVar = this.P2) == null || anVar.f4 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) cg.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                org.telegram.messenger.g0.g(tL_inlineButtonTypeCopy.copy_text);
                hc.a0(anVar).i(org.telegram.messenger.hd.a0(null, null, 2131750885, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    org.telegram.messenger.ez b10 = org.telegram.messenger.ez.b(tL_keyboardButton.text, this.Q2, ijVar, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = anVar != null ? anVar.W8() : null;
                    b10.O = this.S4;
                    this.S4 = 0L;
                    this.J0.setEffect(0L);
                    org.telegram.messenger.gz.C(this.Q).r0(b10);
                    return true;
                }
            }
            Activity activity = this.O2;
            if (tL_inlineButtonTypeUrl != null) {
                if (vf.c.z(tL_inlineButtonTypeUrl.url)) {
                    vf.c.r(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, giVar);
                    return true;
                }
                v4.o0(this.P2, tL_inlineButtonTypeUrl.url, false, true, true, false, giVar, null, this.W3);
                return true;
            }
            if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                anVar.Ub(2, ijVar2);
                return true;
            }
            if (!cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                if (cg.c.b(keyboardButtonProto)) {
                    TLRPC.Message message = ijVar2.k;
                    long j3 = message.via_bot_id;
                    if (j3 == 0) {
                        j3 = message.from_id.user_id;
                    }
                    long j10 = j3;
                    kf kfVar = new kf(this, ijVar2, j10, keyboardButtonProto, ijVar, org.telegram.messenger.qp.s1(this.Q).a2(Long.valueOf(j3)));
                    if (org.telegram.messenger.b6.h(this.Q, j10) || org.telegram.messenger.qp.s1(this.Q).W6.contains(Long.valueOf(j10))) {
                        kfVar.run();
                        return true;
                    }
                    v4.n(anVar, org.telegram.messenger.qp.s1(this.Q).a2(Long.valueOf(this.Q2)), new bi.d3(this, kfVar, j10, 20), null);
                    return true;
                }
                if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String M0 = org.telegram.messenger.hd.M0(2131745424, "ShareYouLocationTitle");
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.hd.M0(2131745426, "ShareYouLocationInfo");
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, "OK"), new a3.h(this, ijVar2, keyboardButtonProto, 22));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                    anVar.showDialog(u1Var);
                    return true;
                }
                if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                    org.telegram.messenger.gz.C(this.Q).n0(true, ijVar2, keyboardButtonProto, null, null, anVar);
                    return true;
                }
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!anVar.bb(tL_inlineButtonTypeSwitchInline)) {
                        if (!tL_inlineButtonTypeSwitchInline.same_peer) {
                            Bundle h = org.telegram.ui.Cells.f1.h(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                h.putBoolean("allowGroups", false);
                                h.putBoolean("allowMegagroups", false);
                                h.putBoolean("allowLegacyGroups", false);
                                h.putBoolean("allowUsers", false);
                                h.putBoolean("allowChannels", false);
                                h.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i10 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i10);
                                    i10++;
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                                    if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                        h.putBoolean("allowUsers", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                        h.putBoolean("allowBots", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                        h.putBoolean("allowChannels", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                        h.putBoolean("allowLegacyGroups", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                        h.putBoolean("allowMegagroups", true);
                                    }
                                }
                            }
                            org.telegram.ui.ww wwVar = new org.telegram.ui.ww(h);
                            wwVar.C2 = new a3.h(this, ijVar2, tL_inlineButtonTypeSwitchInline, 23);
                            anVar.presentFragment(wwVar);
                            return true;
                        }
                        TLRPC.Message message2 = ijVar2.k;
                        long j11 = message2.from_id.user_id;
                        long j12 = message2.via_bot_id;
                        if (j12 != 0) {
                            j11 = j12;
                        }
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(this.R.a).a2(Long.valueOf(j11));
                        if (a22 != null) {
                            setFieldText("@" + org.telegram.messenger.t10.n(a22) + " " + tL_inlineButtonTypeSwitchInline.query);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (org.telegram.messenger.qp.s1(this.Q).a2(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        anVar.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType == null || ijVar2.k == null) {
                        org.telegram.messenger.a8.d("button.peer_type is null");
                        return true;
                    }
                    if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot)) {
                        if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i7 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool = tL_requestPeerTypeUser.bot;
                            Boolean bool2 = tL_requestPeerTypeUser.premium;
                            sd sdVar = new sd(this, ijVar2, tL_buttonTypeRequestPeer);
                            org.telegram.ui.qg0 qg0Var = org.telegram.ui.qg0.m2;
                            org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                            if (Q == null || org.telegram.ui.qg0.m2 != null) {
                                return false;
                            }
                            org.telegram.ui.qg0 qg0Var2 = new org.telegram.ui.qg0(Q, i7, bool, bool2, sdVar);
                            qg0Var2.show();
                            org.telegram.ui.qg0.m2 = qg0Var2;
                            return false;
                        }
                        Bundle h7 = org.telegram.ui.Cells.f1.h(15, "onlySelect", "dialogsType", true);
                        TLRPC.Message message3 = ijVar2.k;
                        if (message3 != null) {
                            TLRPC.Peer peer = message3.from_id;
                            if (peer instanceof TLRPC.TL_peerUser) {
                                h7.putLong("requestPeerBotId", peer.user_id);
                            }
                        }
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            h7.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        org.telegram.ui.ww wwVar2 = new org.telegram.ui.ww(h7);
                        wwVar2.C2 = new sd(this, ijVar2, tL_buttonTypeRequestPeer);
                        anVar.presentFragment(wwVar2);
                        return false;
                    }
                    TLRPC.User j13 = getParentFragment() != null ? getParentFragment().j() : org.telegram.messenger.qp.s1(this.Q).a2(Long.valueOf(this.Q2));
                    if (j13 != null) {
                        lq.e(getContext(), this.Q, j13, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new di.s2(this, ijVar2, tL_buttonTypeRequestPeer, j13, 5), this.W3, null);
                        return false;
                    }
                }
                return true;
            }
            TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) cg.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
            Boolean valueOf = (tL_buttonTypeRequestPoll.flags & 1) != 0 ? Boolean.valueOf(tL_buttonTypeRequestPoll.quiz) : null;
            anVar.xa();
            di.u2 u2Var = anVar.X1;
            if (u2Var != null) {
                u2Var.M2 = false;
                u2Var.r3.setVisibility(8);
                u2Var.H1(false, valueOf);
                return false;
            }
        }
        return false;
    }

    public final void Z0(org.telegram.messenger.ij ijVar, String str, boolean z9, boolean z10) {
        xe xeVar;
        org.telegram.messenger.ez b10;
        String sb2;
        if (str == null || getVisibility() != 0 || (xeVar = this.E0) == null) {
            return;
        }
        r16 = null;
        TLRPC.User user = null;
        if (!z9) {
            if (this.G0 > 0 && !c()) {
                wf wfVar = this.Z2;
                if (wfVar != null) {
                    eg egVar = this.F0;
                    wfVar.i1(egVar, ((org.telegram.ui.ActionBar.k5) egVar.c).getText(), true);
                    return;
                }
                return;
            }
            TLRPC.User a22 = (ijVar == null || !org.telegram.messenger.m5.z(this.Q2)) ? null : org.telegram.messenger.qp.s1(this.R.a).a2(Long.valueOf(ijVar.k.from_id.user_id));
            if ((this.o2 != 1 || z10) && a22 != null && a22.bot && !str.contains("@")) {
                Locale locale = Locale.US;
                b10 = org.telegram.messenger.ez.b(a8.p0.D(str, "@", org.telegram.messenger.t10.n(a22)), this.Q2, this.T2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            } else {
                b10 = org.telegram.messenger.ez.b(str, this.Q2, this.T2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            }
            org.telegram.ui.an anVar = this.P2;
            b10.K = anVar != null ? anVar.W8() : null;
            b10.O = this.S4;
            this.S4 = 0L;
            this.J0.setEffect(0L);
            p(b10);
            org.telegram.messenger.gz.C(this.Q).r0(b10);
            return;
        }
        String obj = xeVar.getText().toString();
        if (ijVar != null && org.telegram.messenger.m5.z(this.Q2)) {
            user = org.telegram.messenger.qp.s1(this.R.a).a2(Long.valueOf(ijVar.k.from_id.user_id));
        }
        TLRPC.User user2 = user;
        if ((this.o2 != 1 || z10) && user2 != null && user2.bot && !str.contains("@")) {
            StringBuilder sb3 = new StringBuilder();
            Locale locale2 = Locale.US;
            sb3.append(str + "@" + org.telegram.messenger.t10.n(user2));
            sb3.append(" ");
            sb3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            sb2 = sb3.toString();
        } else {
            StringBuilder j3 = rf.b.j(str, " ");
            j3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            sb2 = j3.toString();
        }
        this.R2 = true;
        this.E0.setText(sb2);
        xe xeVar2 = this.E0;
        xeVar2.setSelection(xeVar2.getText().length());
        this.R2 = false;
        wf wfVar2 = this.Z2;
        if (wfVar2 != null) {
            wfVar2.a1(this.E0.getText(), true, false);
        }
        if (this.z2 || this.f2 != -1) {
            return;
        }
        H0();
    }

    @Override // org.telegram.ui.Components.vv0
    public final void a(TLRPC.Document document, String str, Object obj, org.telegram.messenger.ej ejVar, boolean z9, boolean z10, int i7, int i10) {
        if (this.p5) {
            return;
        }
        org.telegram.ui.qm qmVar = this.V2;
        org.telegram.ui.an anVar = this.P2;
        if (qmVar != null && anVar != null && qmVar.f) {
            anVar.uc();
            return;
        }
        if (!c() || i7 != 0) {
            v4.X(this.Q, 1, this.Q2, new pd(this, document, str, ejVar, z10, i7, i10, obj, z9));
            return;
        }
        v4.J(this.O2, anVar.a(), new od(this, document, str, obj, ejVar, z9), this.W3);
    }

    public final void a0() {
        org.telegram.messenger.mj mjVar;
        org.telegram.messenger.nj b10;
        TLRPC.Chat chat;
        int i7;
        org.telegram.messenger.nj b11;
        org.telegram.messenger.ij ijVar = this.Z1;
        if (ijVar == null) {
            return;
        }
        boolean q52 = ijVar.q5();
        org.telegram.ui.an anVar = this.P2;
        if (q52 && !org.telegram.messenger.t3.z(this.Q, 24, org.telegram.messenger.ij.B0(this.Z1.k))) {
            if (anVar == null || (b11 = anVar.w5) == null) {
                b11 = org.telegram.messenger.nj.b(this.Z1.k.suggested_post);
            }
            if (!bi.ea.T(this.Q, b11.a)) {
                if (anVar != null) {
                    anVar.wc(b11);
                    return;
                }
                return;
            }
        }
        if (this.c0 - this.d0 < 0) {
            NumberTextView numberTextView = this.b0;
            if (numberTextView != null) {
                org.telegram.messenger.g0.G3(3.5f, numberTextView, null);
                try {
                    this.b0.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            if (org.telegram.messenger.qp.s1(this.Q).D3() || org.telegram.messenger.qp.s1(this.Q).U4 <= this.d0) {
                return;
            }
            q1();
            return;
        }
        if (this.R1 != 0) {
            m1(0, true);
            this.U0.t(false);
            if (this.z3) {
                n1(false, true, false, true);
                this.l3 = true;
                org.telegram.messenger.g0.i3(new ad(this, 28), 200L);
            }
        }
        xe xeVar = this.E0;
        CharSequence textToUse = xeVar == null ? "" : xeVar.getTextToUse();
        org.telegram.messenger.ij ijVar2 = this.Z1;
        if (ijVar2 == null || ijVar2.D != 19) {
            textToUse = org.telegram.messenger.g0.n1(textToUse);
        }
        CharSequence[] charSequenceArr = {textToUse};
        if (TextUtils.isEmpty(charSequenceArr[0])) {
            TLRPC.MessageMedia messageMedia = this.Z1.k.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                org.telegram.messenger.g0.G3(-3.0f, this.E0, null);
                org.telegram.messenger.p2.D.a();
                return;
            }
        }
        ArrayList W = org.telegram.messenger.ui.b0(this.Q).W(charSequenceArr, A1(), true);
        if (!TextUtils.equals(charSequenceArr[0], this.Z1.v) || ((W != null && !W.isEmpty()) || !this.Z1.k.entities.isEmpty() || (this.Z1.k.media instanceof TLRPC.TL_messageMediaWebPage))) {
            org.telegram.messenger.ij ijVar3 = this.Z1;
            ijVar3.w1 = charSequenceArr[0];
            ijVar3.x1 = W;
            ijVar3.y1 = this.Y2;
            if (anVar != null && (chat = anVar.e) != null && (((i7 = ijVar3.D) == 0 || i7 == 19) && !org.telegram.messenger.t3.m(chat))) {
                org.telegram.messenger.ij ijVar4 = this.Z1;
                ijVar4.y1 = false;
                TLRPC.Message message = ijVar4.k;
                message.flags &= -513;
                message.media = null;
            } else if (anVar == null || (mjVar = anVar.v5) == null) {
                org.telegram.messenger.ij ijVar5 = this.Z1;
                ijVar5.y1 = false;
                int i10 = ijVar5.D;
                if (i10 == 0 || i10 == 19) {
                    TLRPC.Message message2 = ijVar5.k;
                    message2.flags |= 512;
                    message2.media = new TLRPC.TL_messageMediaEmpty();
                }
            } else {
                if (anVar.W5 instanceof TLRPC.TL_webPagePending) {
                    org.telegram.messenger.ij ijVar6 = this.Z1;
                    ijVar6.y1 = false;
                    int i11 = ijVar6.D;
                    if (i11 == 0 || i11 == 19) {
                        ijVar6.k.media = new TLRPC.TL_messageMediaEmpty();
                        this.Z1.k.flags |= 512;
                    }
                } else if (mjVar.v != null) {
                    org.telegram.messenger.ij ijVar7 = this.Z1;
                    ijVar7.y1 = false;
                    TLRPC.Message message3 = ijVar7.k;
                    message3.flags |= 512;
                    message3.media = new TLRPC.TL_messageMediaWebPage();
                    this.Z1.k.media.webpage = anVar.v5.v;
                } else {
                    org.telegram.messenger.ij ijVar8 = this.Z1;
                    ijVar8.y1 = false;
                    int i12 = ijVar8.D;
                    if (i12 == 0 || i12 == 19) {
                        TLRPC.Message message4 = ijVar8.k;
                        message4.flags |= 512;
                        message4.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                TLRPC.Message message5 = this.Z1.k;
                org.telegram.messenger.mj mjVar2 = anVar.v5;
                message5.invert_media = mjVar2.r;
                if (mjVar2.o) {
                    TLRPC.MessageMedia messageMedia2 = message5.media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                        boolean z9 = mjVar2.q;
                        messageMedia2.force_small_media = z9;
                        messageMedia2.force_large_media = true ^ z9;
                    }
                }
            }
            if (this.Z1.q5()) {
                org.telegram.messenger.ez a10 = org.telegram.messenger.ez.a(org.telegram.messenger.ij.B0(this.Z1.k), this.Z1.w1.toString());
                if (anVar == null || (b10 = anVar.w5) == null) {
                    b10 = org.telegram.messenger.nj.b(this.Z1.k.suggested_post);
                }
                a10.T = b10;
                a10.R = org.telegram.messenger.m5.o(this.Z1.k.saved_peer_id);
                a10.G = this.Z1.u2();
                org.telegram.messenger.ij ijVar9 = this.Z1;
                a10.r = ijVar9;
                a10.D = ijVar9;
                if (ijVar9.F0() instanceof TLRPC.TL_document) {
                    a10.g = (TLRPC.TL_document) this.Z1.F0();
                    a10.b = a10.a;
                    a10.a = null;
                } else {
                    TLRPC.MessageMedia messageMedia3 = this.Z1.k.media;
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
                org.telegram.messenger.gz.C(this.Q).r0(a10);
            } else {
                org.telegram.messenger.gz C = org.telegram.messenger.gz.C(this.Q);
                org.telegram.messenger.ij ijVar10 = this.Z1;
                C.t(ijVar10, null, null, null, null, null, null, null, false, ijVar10.u2(), null);
            }
        }
        b1(null, null, false);
    }

    public final void a1(int i7, long j3) {
        this.Q2 = j3;
        if (this.Q != i7) {
            this.L3.e();
            org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(this.Q);
            int i10 = org.telegram.messenger.qs.l2;
            f10.n(this, i10);
            org.telegram.messenger.qs f11 = org.telegram.messenger.qs.f(this.Q);
            int i11 = org.telegram.messenger.qs.o2;
            f11.n(this, i11);
            org.telegram.messenger.qs f12 = org.telegram.messenger.qs.f(this.Q);
            int i12 = org.telegram.messenger.qs.p2;
            f12.n(this, i12);
            org.telegram.messenger.qs f13 = org.telegram.messenger.qs.f(this.Q);
            int i13 = org.telegram.messenger.qs.m2;
            f13.n(this, i13);
            org.telegram.messenger.qs f14 = org.telegram.messenger.qs.f(this.Q);
            int i14 = org.telegram.messenger.qs.n2;
            f14.n(this, i14);
            org.telegram.messenger.qs f15 = org.telegram.messenger.qs.f(this.Q);
            int i15 = org.telegram.messenger.qs.k2;
            f15.n(this, i15);
            org.telegram.messenger.qs f16 = org.telegram.messenger.qs.f(this.Q);
            int i16 = org.telegram.messenger.qs.t;
            f16.n(this, i16);
            org.telegram.messenger.qs f17 = org.telegram.messenger.qs.f(this.Q);
            int i17 = org.telegram.messenger.qs.s2;
            f17.n(this, i17);
            org.telegram.messenger.qs f18 = org.telegram.messenger.qs.f(this.Q);
            int i18 = org.telegram.messenger.qs.u2;
            f18.n(this, i18);
            org.telegram.messenger.qs f19 = org.telegram.messenger.qs.f(this.Q);
            int i19 = org.telegram.messenger.qs.e2;
            f19.n(this, i19);
            org.telegram.messenger.qs f20 = org.telegram.messenger.qs.f(this.Q);
            int i20 = org.telegram.messenger.qs.z0;
            f20.n(this, i20);
            org.telegram.messenger.qs f21 = org.telegram.messenger.qs.f(this.Q);
            int i21 = org.telegram.messenger.qs.L;
            f21.n(this, i21);
            org.telegram.messenger.qs f22 = org.telegram.messenger.qs.f(this.Q);
            int i22 = org.telegram.messenger.qs.n1;
            f22.n(this, i22);
            org.telegram.messenger.qs f23 = org.telegram.messenger.qs.f(this.Q);
            int i23 = org.telegram.messenger.qs.t2;
            f23.n(this, i23);
            org.telegram.messenger.qs f24 = org.telegram.messenger.qs.f(this.Q);
            int i24 = org.telegram.messenger.qs.R2;
            f24.n(this, i24);
            org.telegram.messenger.qs f25 = org.telegram.messenger.qs.f(this.Q);
            int i25 = org.telegram.messenger.qs.Y2;
            f25.n(this, i25);
            org.telegram.messenger.qs f26 = org.telegram.messenger.qs.f(this.Q);
            int i26 = org.telegram.messenger.qs.f5;
            f26.n(this, i26);
            this.Q = i7;
            this.R = org.telegram.messenger.c.a(i7);
            org.telegram.messenger.qs.f(this.Q).c(this, i10);
            org.telegram.messenger.qs.f(this.Q).c(this, i11);
            org.telegram.messenger.qs.f(this.Q).c(this, i12);
            org.telegram.messenger.qs.f(this.Q).c(this, i13);
            org.telegram.messenger.qs.f(this.Q).c(this, i14);
            org.telegram.messenger.qs.f(this.Q).c(this, i15);
            org.telegram.messenger.qs.f(this.Q).c(this, i16);
            org.telegram.messenger.qs.f(this.Q).c(this, i17);
            org.telegram.messenger.qs.f(this.Q).c(this, i18);
            org.telegram.messenger.qs.f(this.Q).c(this, i19);
            org.telegram.messenger.qs.f(this.Q).c(this, i20);
            org.telegram.messenger.qs.f(this.Q).c(this, i21);
            org.telegram.messenger.qs.f(this.Q).c(this, i22);
            org.telegram.messenger.qs.f(this.Q).c(this, i23);
            org.telegram.messenger.qs.f(this.Q).c(this, i24);
            org.telegram.messenger.qs.f(this.Q).c(this, i25);
            org.telegram.messenger.qs.f(this.Q).c(this, i26);
        }
        this.z0 = true;
        if (org.telegram.messenger.m5.z(this.Q2)) {
            this.z0 = org.telegram.messenger.t3.q(org.telegram.messenger.qp.s1(this.R.a).M0(Long.valueOf(-this.Q2)));
        }
        Q1(false);
        K1(false);
        D();
        A();
        I1(false);
        if (this.E0 != null) {
            org.telegram.ui.an anVar = this.P2;
            R1(anVar != null && anVar.getFragmentBeginToShow());
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Me));
    }

    @Override // org.telegram.ui.Components.vv0
    public final boolean b() {
        org.telegram.ui.an anVar = this.P2;
        return anVar != null && anVar.R6();
    }

    public final void b0(Canvas canvas, boolean z9) {
        if (this.y4) {
            int z10 = (int) com.google.android.recaptcha.internal.a.z(1.0f, this.C4, org.telegram.ui.ActionBar.k6.i3.getIntrinsicHeight(), this.T1);
            View view = this.G1;
            if (view != null && view.getVisibility() == 0) {
                z10 = (int) (((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + z10);
            }
            int intrinsicHeight = org.telegram.ui.ActionBar.k6.i3.getIntrinsicHeight() + z10;
            if (z9) {
                org.telegram.ui.ActionBar.k6.i3.setAlpha((int) (this.C4 * 255.0f));
                org.telegram.ui.ActionBar.k6.i3.setBounds(0, z10, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.k6.i3.draw(canvas);
            }
            if (!this.x4) {
                float f10 = intrinsicHeight;
                float width = getWidth();
                float height = getHeight();
                org.telegram.ui.ActionBar.f6 f6Var = this.W3;
                Paint d = f6Var != null ? f6Var.d("paintChatComposeBackground") : null;
                if (d == null) {
                    d = org.telegram.ui.ActionBar.k6.V0("paintChatComposeBackground");
                }
                canvas.drawRect(0.0f, f10, width, height, d);
                return;
            }
            int f02 = f0(org.telegram.ui.ActionBar.k6.Ge);
            Paint paint = this.B4;
            paint.setColor(f02);
            if (!org.telegram.messenger.iz.f() || this.m1 == null) {
                canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint);
            } else {
                this.D4.set(0, intrinsicHeight, getWidth(), getHeight());
                this.m1.H(canvas, getTop(), this.D4, paint, false);
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
    public final void b1(org.telegram.messenger.ij ijVar, org.telegram.messenger.dj djVar, boolean z9) {
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
        boolean z10;
        ie ieVar;
        if (this.b3 == null && this.e3 == null && this.Z1 != ijVar) {
            S();
            boolean z11 = this.Z1 != null;
            this.Z1 = ijVar;
            this.a2 = z9;
            ud udVar3 = this.A1;
            bi.t tVar = this.p1;
            ImageView imageView = this.P0;
            kg.k kVar = this.r1;
            de deVar = this.Z0;
            if (ijVar != null) {
                this.R4 = djVar != null ? djVar.j : ijVar.k.invert_media;
                P(false);
                this.F1.setOnClickListener(new cd(this, 17));
                if (this.Z1.q5()) {
                    long j3 = this.u4;
                    if (j3 > 0) {
                        this.F1.i(1, j3, true);
                        this.F1.setLayoutParams(c8.ha.e(44, 44, 85));
                        this.F1.requestLayout();
                        udVar = udVar3;
                        this.F1.setOnLongClickListener(new j(this, ijVar, djVar, 1));
                        this.F1.setVisibility(0);
                        this.F1.setScaleX(0.1f);
                        this.F1.setScaleY(0.1f);
                        this.F1.setAlpha(0.0f);
                        this.F1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(xq.f).start();
                        if (z9) {
                            this.c0 = org.telegram.messenger.qp.s1(this.R.a).u1();
                            charSequence = this.Z1.v;
                        } else {
                            this.c0 = org.telegram.messenger.qp.s1(this.R.a).H0();
                            charSequence = this.Z1.z;
                        }
                        if (charSequence == null) {
                            xe xeVar3 = this.E0;
                            TextPaint paint = xeVar3 != null ? xeVar3.getPaint() : null;
                            if (paint == null) {
                                paint = new TextPaint();
                                paint.setTextSize(org.telegram.messenger.g0.L(18.0f));
                            }
                            charSequence2 = o(paint.getFontMetricsInt(), charSequence, this.Z1.k.entities);
                        } else {
                            charSequence2 = "";
                        }
                        if (this.V1 == null && !z11) {
                            xe xeVar4 = this.E0;
                            this.V1 = (xeVar4 != null || xeVar4.length() <= 0) ? null : this.E0.getText();
                            this.W1 = this.Y2;
                        }
                        org.telegram.messenger.ij ijVar2 = this.Z1;
                        TLRPC.MessageMedia messageMedia = ijVar2.k.media;
                        this.Y2 = ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia.manual) && ((i10 = ijVar2.D) == 0 || i10 == 19);
                        if (this.z2) {
                            f fVar = new f(8, this, charSequence2);
                            this.W = fVar;
                            org.telegram.messenger.g0.i3(fVar, 200L);
                        } else {
                            f fVar2 = this.W;
                            if (fVar2 != null) {
                                org.telegram.messenger.g0.r(fVar2);
                                this.W = null;
                            }
                            setFieldText(charSequence2);
                        }
                        xeVar = this.E0;
                        if (xeVar != null) {
                            xeVar.requestFocus();
                        }
                        H0();
                        xeVar2 = this.E0;
                        if (xeVar2 != null) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xeVar2.getLayoutParams();
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(4.0f);
                            this.E0.setLayoutParams(layoutParams);
                        }
                        udVar2 = this.e1;
                        if (udVar2 == null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) udVar2.getLayoutParams();
                            z10 = false;
                            layoutParams2.rightMargin = 0;
                            this.e1.setLayoutParams(layoutParams2);
                        } else {
                            z10 = false;
                        }
                        getSendButtonInternal().setVisibility(8);
                        setSlowModeButtonVisible(z10);
                        imageView.setVisibility(8);
                        deVar.setVisibility(8);
                        tVar.setVisibility(8);
                        if (kVar != null) {
                            this.v1 = 0.0f;
                            kVar.setAlpha(0.0f);
                            kVar.setScaleX(0.5f);
                            kVar.setScaleY(0.5f);
                        }
                        udVar.setVisibility(8);
                        ieVar = this.J1;
                        if (ieVar != null) {
                            ieVar.setVisibility(8);
                        }
                    }
                }
                udVar = udVar3;
                this.F1.i(1, 0L, true);
                this.F1.setLayoutParams(c8.ha.e(44, 44, 85));
                this.F1.requestLayout();
                this.F1.setOnLongClickListener(new j(this, ijVar, djVar, 1));
                this.F1.setVisibility(0);
                this.F1.setScaleX(0.1f);
                this.F1.setScaleY(0.1f);
                this.F1.setAlpha(0.0f);
                this.F1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(xq.f).start();
                if (z9) {
                }
                if (charSequence == null) {
                }
                if (this.V1 == null) {
                    xe xeVar42 = this.E0;
                    this.V1 = (xeVar42 != null || xeVar42.length() <= 0) ? null : this.E0.getText();
                    this.W1 = this.Y2;
                }
                org.telegram.messenger.ij ijVar22 = this.Z1;
                TLRPC.MessageMedia messageMedia2 = ijVar22.k.media;
                this.Y2 = ((messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia2.manual) && ((i10 = ijVar22.D) == 0 || i10 == 19);
                if (this.z2) {
                }
                xeVar = this.E0;
                if (xeVar != null) {
                }
                H0();
                xeVar2 = this.E0;
                if (xeVar2 != null) {
                }
                udVar2 = this.e1;
                if (udVar2 == null) {
                }
                getSendButtonInternal().setVisibility(8);
                setSlowModeButtonVisible(z10);
                imageView.setVisibility(8);
                deVar.setVisibility(8);
                tVar.setVisibility(8);
                if (kVar != null) {
                }
                udVar.setVisibility(8);
                ieVar = this.J1;
                if (ieVar != null) {
                }
            } else {
                f fVar3 = this.W;
                if (fVar3 != null) {
                    org.telegram.messenger.g0.r(fVar3);
                    this.W = null;
                }
                ge geVar = this.F1;
                if (geVar != null) {
                    geVar.setVisibility(8);
                }
                this.c0 = -1;
                this.Z2.t();
                udVar3.setVisibility(0);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                imageView.setAlpha(0.0f);
                imageView.setVisibility(8);
                int i11 = this.G0;
                eg egVar = this.F0;
                if (i11 <= 0 || c()) {
                    getSendButtonInternal().setScaleX(0.1f);
                    getSendButtonInternal().setScaleY(0.1f);
                    getSendButtonInternal().setAlpha(0.0f);
                    getSendButtonInternal().setVisibility(8);
                    egVar.setScaleX(0.1f);
                    egVar.setScaleY(0.1f);
                    egVar.setAlpha(0.0f);
                    setSlowModeButtonVisible(false);
                    f10 = 1.0f;
                    tVar.setScaleX(1.0f);
                    this.E = 1.0f;
                    C1();
                    tVar.setVisibility(0);
                    if (kVar != null) {
                        this.v1 = 1.0f;
                        kVar.setAlpha(1.0f);
                        kVar.setScaleX(1.0f);
                        kVar.setScaleY(1.0f);
                    }
                    deVar.setScaleX(1.0f);
                    deVar.setScaleY(1.0f);
                    deVar.setAlpha(1.0f);
                    deVar.setVisibility(0);
                } else {
                    if (this.G0 == Integer.MAX_VALUE) {
                        getSendButtonInternal().setScaleX(1.0f);
                        getSendButtonInternal().setScaleY(1.0f);
                        getSendButtonInternal().setAlpha(1.0f);
                        getSendButtonInternal().setVisibility(0);
                        egVar.setScaleX(0.1f);
                        egVar.setScaleY(0.1f);
                        f11 = 0.0f;
                        egVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        i7 = 8;
                    } else {
                        f11 = 0.0f;
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        i7 = 8;
                        getSendButtonInternal().setVisibility(8);
                        egVar.setScaleX(1.0f);
                        egVar.setScaleY(1.0f);
                        egVar.setAlpha(1.0f);
                        setSlowModeButtonVisible(true);
                    }
                    tVar.setScaleX(0.01f);
                    this.E = f11;
                    C1();
                    tVar.setVisibility(i7);
                    if (kVar != null) {
                        this.v1 = f11;
                        kVar.setAlpha(f11);
                        kVar.setScaleX(0.5f);
                        kVar.setScaleY(0.5f);
                    }
                    deVar.setScaleX(0.1f);
                    deVar.setScaleY(0.1f);
                    deVar.setAlpha(f11);
                    deVar.setVisibility(i7);
                    f10 = 1.0f;
                }
                W();
                ie ieVar2 = this.J1;
                if (ieVar2 != null && ieVar2.getTag() != null) {
                    this.J1.setScaleX(f10);
                    this.J1.setScaleY(f10);
                    this.J1.setAlpha(f10);
                    this.J1.setVisibility(0);
                }
                org.telegram.ui.an anVar = this.P2;
                if (anVar != null) {
                    anVar.F5 = null;
                    anVar.W5 = null;
                    org.telegram.messenger.mj mjVar = anVar.v5;
                    if (mjVar != null) {
                        mjVar.e(this.Q, null, "", null, null, null);
                    }
                    this.X2 = null;
                    this.Y2 = true;
                    anVar.z8();
                }
                S();
                xe xeVar5 = this.E0;
                if (xeVar5 != null) {
                    xeVar5.setText(this.V1);
                    xe xeVar6 = this.E0;
                    xeVar6.setSelection(xeVar6.length());
                }
                this.V1 = null;
                this.Y2 = this.W1;
                if (getVisibility() == 0) {
                    this.Z2.h2();
                }
                J1(1);
            }
            I1(true);
            R1(true);
            G1();
            P1();
        }
    }

    @Override // org.telegram.ui.Components.vv0
    public final boolean c() {
        org.telegram.ui.an anVar = this.P2;
        return anVar != null && anVar.c();
    }

    public final boolean c0(Canvas canvas, org.telegram.messenger.u10 u10Var) {
        float f10;
        float f11;
        float f12;
        float f13;
        float d = this.f5.d(this.E0.canScrollVertically(-1));
        float d2 = this.g5.d(this.E0.canScrollVertically(1));
        if (d <= 0.0f && d2 <= 0.0f) {
            return ((Boolean) u10Var.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.E0.getX() + this.E0.getMeasuredWidth() + org.telegram.messenger.g0.L(5.0f), this.E0.getY() + this.E0.getMeasuredHeight() + org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.qs.e4, 31);
        boolean booleanValue = ((Boolean) u10Var.run()).booleanValue();
        canvas.save();
        LinearGradient linearGradient = this.d5;
        Paint paint = this.c5;
        Matrix matrix = this.e5;
        if (d > 0.0f) {
            RectF rectF = org.telegram.messenger.g0.P;
            f12 = 255.0f;
            f13 = 16.0f;
            f10 = 0.0f;
            f11 = 5.0f;
            rectF.set(this.E0.getX() - org.telegram.messenger.g0.L(5.0f), (this.E0.getY() + this.T1) - 1.0f, this.E0.getX() + this.E0.getMeasuredWidth() + org.telegram.messenger.g0.L(5.0f), this.E0.getY() + this.T1 + org.telegram.messenger.g0.L(13.0f));
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
            rectF2.set(this.E0.getX() - org.telegram.messenger.g0.L(f11), (this.E0.getY() + this.E0.getMeasuredHeight()) - org.telegram.messenger.g0.L(15.0f), this.E0.getX() + this.E0.getMeasuredWidth() + org.telegram.messenger.g0.L(f11), this.E0.getY() + this.E0.getMeasuredHeight() + org.telegram.messenger.g0.L(2.0f) + 1.0f);
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

    public final void c1(boolean z9, boolean z10) {
        hg hgVar;
        xe xeVar;
        ud udVar;
        wd wdVar = this.Q0;
        if (wdVar == null) {
            return;
        }
        if (this.w2 == 1 || ((udVar = this.e1) != null && udVar.getVisibility() == 0)) {
            this.h = 0.0f;
            this.n = 0.0f;
            H1();
            z10 = false;
        }
        hg hgVar2 = hg.f;
        hg hgVar3 = hg.e;
        if (!z9 || this.f2 != 0) {
            mf mfVar = this.U0;
            int i7 = mfVar == null ? org.telegram.messenger.qp.d1().getInt("selected_page", 0) : mfVar.getCurrentPage();
            hgVar = (i7 == 0 || !((this.J2 || this.K2) && ((xeVar = this.E0) == null || TextUtils.isEmpty(xeVar.getText())))) ? hgVar3 : i7 == 1 ? hg.c : hgVar2;
        } else if (!this.z0) {
            return;
        } else {
            hgVar = hg.d;
        }
        if (!this.z0 && hgVar == hgVar3) {
            hgVar3 = hgVar2;
        } else if (this.b || hgVar == hgVar3) {
            hgVar3 = hgVar;
        }
        wdVar.j(hgVar3, z10);
        if (hgVar3 == hgVar2 && this.U0 == null) {
            org.telegram.messenger.ui.b0(this.Q).V0(0, true, true, false);
            ArrayList arrayList = org.telegram.messenger.qp.s1(this.Q).b4;
            int min = Math.min(10, arrayList.size());
            for (int i10 = 0; i10 < min; i10++) {
                org.telegram.messenger.i6.k((CharSequence) arrayList.get(i10));
            }
        }
    }

    @Override // org.telegram.ui.Components.mw0
    public final void d(TextWatcher textWatcher) {
        xe xeVar = this.E0;
        if (xeVar != null) {
            xeVar.addTextChangedListener(textWatcher);
            return;
        }
        if (this.H4 == null) {
            this.H4 = new ArrayList();
        }
        this.H4.add(textWatcher);
    }

    public final gf d0(org.telegram.messenger.ij ijVar, boolean z9) {
        gf gfVar = new gf(ijVar.I1, ijVar.k, true, true);
        if (z9) {
            xe xeVar = this.E0;
            CharSequence[] charSequenceArr = {xeVar == null ? "" : xeVar.getTextToUse()};
            ArrayList W = org.telegram.messenger.ui.b0(this.Q).W(charSequenceArr, true, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            org.telegram.messenger.ij.b(spannableStringBuilder, W, true, true, false, true, 0);
            gfVar.z = org.telegram.messenger.ij.C5(org.telegram.messenger.i6.m(spannableStringBuilder, org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), false, null, 0), W, org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), false);
        }
        return gfVar;
    }

    public final void d1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.O2.getSystemService("accessibility");
        if (this.E0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        try {
            this.E0.requestFocus();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ge geVar;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat M0;
        double d;
        kg.k kVar;
        if (i7 == org.telegram.messenger.qs.i4) {
            mf mfVar = this.U0;
            if (mfVar != null) {
                mfVar.P.g1();
            }
            jf jfVar = this.H1;
            if (jfVar != null) {
                ArrayList arrayList = jfVar.n;
                while (r4 < arrayList.size()) {
                    ((hi.i0) arrayList.get(r4)).invalidate();
                    r4++;
                }
            }
            xe xeVar = this.E0;
            if (xeVar != null) {
                xeVar.postInvalidate();
                this.E0.q();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.k2) {
            if (((Integer) objArr[0]).intValue() != this.G2) {
                return;
            }
            if (this.w2 != 0 && !this.m3 && !c()) {
                this.m3 = true;
                org.telegram.messenger.qp.s1(this.R.a).C4(this.c1 ? 7 : 1, 0, this.Q2, getThreadMessageId(), null);
            }
            RecordCircle recordCircle = this.N1;
            if (recordCircle != null) {
                recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.t) {
            xe xeVar2 = this.E0;
            if (xeVar2 == null || !xeVar2.isFocused()) {
                return;
            }
            org.telegram.messenger.g0.v1(this.E0);
            return;
        }
        int i11 = org.telegram.messenger.qs.m2;
        int i12 = org.telegram.messenger.qs.n2;
        int i13 = 5;
        if (i7 == i11 || i7 == i12) {
            if (((Integer) objArr[0]).intValue() == this.G2 && this.F2) {
                this.F2 = false;
                if (i7 != i12) {
                    N1(2, true);
                    return;
                }
                Integer num = (Integer) objArr[1];
                if (num.intValue() == 4) {
                    i13 = 4;
                } else if (this.c1 && num.intValue() == 5) {
                    i13 = 1;
                } else if (num.intValue() != 0) {
                    i13 = num.intValue() == 6 ? 2 : 3;
                }
                if (i13 != 3) {
                    N1(i13, true);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.l2) {
            if (((Integer) objArr[0]).intValue() != this.G2) {
                return;
            }
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            this.c1 = !booleanValue;
            ee eeVar = this.b1;
            if (eeVar != null) {
                eeVar.j(booleanValue ? hg.a : hg.b, true);
            }
            if (this.F2) {
                RecordCircle recordCircle2 = this.N1;
                if (recordCircle2 != null) {
                    recordCircle2.I = true;
                }
            } else {
                this.F2 = true;
                N1(0, true);
            }
            fg fgVar = this.Y0;
            if (fgVar != null) {
                fgVar.a(this.i1);
            }
            cg cgVar = this.l1;
            if (cgVar != null) {
                cgVar.h = false;
                return;
            }
            return;
        }
        byte[] bArr = null;
        if (i7 == org.telegram.messenger.qs.o2) {
            this.F2 = false;
            this.b3 = null;
            this.e3 = null;
            return;
        }
        if (i7 == org.telegram.messenger.qs.p2) {
            this.b3 = null;
            this.e3 = null;
            fg fgVar2 = this.Y0;
            if (fgVar2 != null) {
                fgVar2.a(this.i1);
            }
            E(true);
            this.F2 = true;
            N1(0, true);
            return;
        }
        if (i7 != org.telegram.messenger.qs.s2) {
            if (i7 == org.telegram.messenger.qs.u2) {
                Activity activity = this.O2;
                if (activity != null) {
                    activity.setVolumeControlStream(((Boolean) objArr[0]).booleanValue() ? 0 : TLObject.FLAG_31);
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.qs.e2) {
                if (this.d3 == null || !MediaController.B().I(this.d3)) {
                    return;
                }
                org.telegram.messenger.ij ijVar = MediaController.B().u0;
                org.telegram.messenger.ij ijVar2 = this.d3;
                ijVar2.b0 = ijVar.b0;
                ijVar2.g0 = ijVar.g0;
                return;
            }
            if (i7 == org.telegram.messenger.qs.z0) {
                wd wdVar = this.Q0;
                if (wdVar != null) {
                    wdVar.invalidate();
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.qs.L) {
                if (((Boolean) objArr[6]).booleanValue()) {
                    return;
                }
                long longValue = ((Long) objArr[3]).longValue();
                Integer num2 = (Integer) objArr[1];
                if (longValue != this.Q2 || (chatFull = this.d2) == null || chatFull.slowmode_seconds == 0 || org.telegram.messenger.ij.g3(num2.intValue()) || (M0 = org.telegram.messenger.qp.s1(this.R.a).M0(Long.valueOf(this.d2.id))) == null || org.telegram.messenger.t3.N(M0) || org.telegram.messenger.t3.h0(M0)) {
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
            if (i7 == org.telegram.messenger.qs.n1) {
                if (this.d2 != null) {
                    U1();
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.qs.t2) {
                this.b3 = null;
                this.e3 = null;
                N1(4, true);
                return;
            }
            if (i7 != org.telegram.messenger.qs.R2) {
                if (i7 == org.telegram.messenger.qs.Y2) {
                    K1(true);
                    return;
                } else {
                    if (i7 == org.telegram.messenger.qs.f5 && this.D1 && (geVar = this.J0) != null) {
                        geVar.setLocked(!org.telegram.messenger.p10.i(this.Q).q());
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
                D1(false);
                return;
            }
            return;
        }
        if (((Integer) objArr[0]).intValue() != this.G2) {
            return;
        }
        this.i1 = 0L;
        Object obj = objArr[1];
        if (obj instanceof org.telegram.messenger.j20) {
            org.telegram.messenger.j20 j20Var = (org.telegram.messenger.j20) obj;
            this.e3 = j20Var;
            String str = (String) objArr[2];
            this.c3 = str;
            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
            this.i1 = j20Var.r;
            h61 h61Var = this.f1;
            if (h61Var != null) {
                h61Var.setVideoPath(str);
                this.f1.setKeyframes(arrayList2);
                this.f1.setVisibility(0);
                this.f1.setMinProgressDiff(1000.0f / this.e3.r);
                w0();
            }
            N1(3, true);
            E(false);
            return;
        }
        this.b3 = (TLRPC.TL_document) obj;
        this.c3 = (String) objArr[2];
        boolean z9 = objArr.length >= 4 && ((Boolean) objArr[3]).booleanValue();
        float floatValue = objArr.length >= 5 ? ((Float) objArr[4]).floatValue() : 0.0f;
        float floatValue2 = objArr.length >= 6 ? ((Float) objArr[5]).floatValue() : 1.0f;
        if (this.b3 == null) {
            wf wfVar = this.Z2;
            if (wfVar != null) {
                wfVar.F(null, true, 0, 0, 0L);
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
        long e10 = org.telegram.messenger.p10.i(this.Q).e();
        tL_peerUser.user_id = e10;
        peer.user_id = e10;
        tL_message.date = (int) (System.currentTimeMillis() / 1000);
        tL_message.message = "";
        tL_message.attachPath = this.c3;
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.flags |= 3;
        tL_messageMediaDocument.document = this.b3;
        tL_message.flags |= 768;
        this.d3 = new org.telegram.messenger.ij(org.telegram.messenger.p10.s0, tL_message, false, true);
        this.e1.setAlpha(1.0f);
        this.e1.setVisibility(0);
        this.g1.setVisibility(0);
        this.g1.setAlpha(0.0f);
        this.g1.setScaleY(0.0f);
        this.g1.setScaleX(0.0f);
        int i14 = 0;
        while (true) {
            if (i14 >= this.b3.attributes.size()) {
                d = 0.0d;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = this.b3.attributes.get(i14);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                d = documentAttribute.duration;
                break;
            }
            i14++;
        }
        int i15 = 0;
        while (true) {
            if (i15 >= this.b3.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute2 = this.b3.attributes.get(i15);
            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                byte[] bArr2 = documentAttribute2.waveform;
                if (bArr2 == null || bArr2.length == 0) {
                    documentAttribute2.waveform = MediaController.getWaveform(this.c3);
                }
                bArr = documentAttribute2.waveform;
            } else {
                i15++;
            }
        }
        if (z9 && (kVar = this.r1) != null) {
            this.v1 = 0.0f;
            kVar.setAlpha(0.0f);
            kVar.setScaleX(0.0f);
            kVar.setScaleY(0.0f);
        }
        this.i1 = (long) (1000.0d * d);
        ji0 ji0Var = this.h1;
        String str2 = this.c3;
        if (!ji0Var.Q) {
            ji0Var.r = (float) d;
            ji0Var.s = floatValue;
            ji0Var.w = floatValue2;
            ji0Var.x = false;
            ji0Var.h.t(org.telegram.messenger.g0.g0((int) Math.round(Math.max(1.0d, d)), false, false), false, true);
            ji0Var.f.a(false, false);
            if (ji0Var.n == null) {
                t51 t51Var = new t51();
                ji0Var.n = t51Var;
                t51Var.J = new uy(ji0Var, 3);
            }
            ji0Var.n.j0(Uri.fromFile(new File(str2)), "other");
            ji0Var.K = 0;
            ji0Var.L = bArr;
            ji0Var.invalidate();
        }
        E(false);
        if (z9) {
            U();
            V();
            T();
            this.w2 = 1;
            this.N1.c(false);
            this.v3.set(this.N1, Float.valueOf(1.0f));
            ag agVar = this.O1;
            if (agVar != null) {
                agVar.setVisibility(0);
                this.O1.setAlpha(1.0f);
            }
        }
        N1(3, !z9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        mf mfVar = this.U0;
        if (mfVar == null || mfVar.getVisibility() != 0 || this.U0.getStickersExpandOffset() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipRect(0, org.telegram.messenger.g0.L(2.0f), getMeasuredWidth(), getMeasuredHeight());
        canvas.translate(0.0f, -this.U0.getStickersExpandOffset());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        View view2 = this.G1;
        ud udVar = this.z1;
        boolean z9 = view == view2 || view == udVar;
        if (z9) {
            float measuredHeight = getMeasuredHeight() - this.j5.f;
            canvas.save();
            if (view == udVar) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.G1) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z9) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e1(CharSequence charSequence, boolean z9) {
        xe xeVar = this.E0;
        if (xeVar == null) {
            return;
        }
        this.R2 = true;
        xeVar.setText(charSequence);
        this.E0.g(true);
        xe xeVar2 = this.E0;
        xeVar2.setSelection(xeVar2.getText().length());
        this.R2 = false;
        wf wfVar = this.Z2;
        if (wfVar != null) {
            wfVar.a1(this.E0.getText(), true, z9);
        }
    }

    public final int f0(int i7) {
        org.telegram.ui.ActionBar.f6 f6Var = this.W3;
        return f6Var != null ? f6Var.h(i7) : org.telegram.ui.ActionBar.k6.x0(null, i7, false);
    }

    public final void f1(boolean z9, boolean z10) {
        this.H2 = z9;
        E(z10);
    }

    public final boolean g0() {
        return this.q5 == 3;
    }

    public void g1(float f10, float f11, float f12, boolean z9) {
        int L;
        float f13 = 1.0f - f12;
        float f14 = f10 * f13;
        float f15 = f11 * f13;
        this.r = (f12 * 0.5f) + 0.5f;
        this.s = f12;
        H1();
        float f16 = -f14;
        this.Q0.setTranslationX(f16);
        if (this.E0 == null) {
            L = 0;
        } else {
            int L2 = org.telegram.messenger.g0.L(40.0f);
            cn0 cn0Var = this.p0;
            L = L2 + ((cn0Var == null || cn0Var.getVisibility() != 0) ? 0 : org.telegram.messenger.g0.L(18.0f));
        }
        this.H = f16 - (L * f13);
        ch0 ch0Var = this.g1;
        if (ch0Var != null) {
            ch0Var.setTranslationX(f16);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f15);
        }
        ag agVar = this.O1;
        if (agVar != null) {
            agVar.setTranslationX(f15);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f16);
        }
        ud udVar = this.A1;
        udVar.setTranslationX(f15);
        udVar.setAlpha(f12);
        ImageView imageView = this.w1;
        if (imageView != null) {
            imageView.setAlpha(imageView.getScaleX() > 0.7f ? f12 : 0.0f);
        }
        boolean z10 = true;
        if (z9 && f12 != 1.0f) {
            z10 = false;
        }
        this.J = z10;
        this.D = f15;
        this.F = f12;
        C1();
        L1();
        float f17 = f14 * f13;
        if (this.I != f17) {
            this.I = f17;
            ji0 ji0Var = this.h1;
            if (ji0Var != null) {
                ji0Var.setTranslationX(f17);
                this.h1.invalidate();
            }
        }
        if (this.E0 != null) {
            float T1 = org.telegram.messenger.g0.T1(0.88f, 1.0f, f12);
            this.E0.setPivotX(0.0f);
            this.E0.setPivotY(r9.getMeasuredHeight() / 2.0f);
            this.E0.setScaleX(T1);
            this.E0.setScaleY(T1);
            this.E0.setHintRightOffset(org.telegram.messenger.g0.W1(f12, org.telegram.messenger.g0.L(60.0f), 0));
        }
    }

    public org.telegram.ui.ActionBar.i1 getAdjustPanLayoutHelper() {
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

    public hi.r3 getBotWebViewButton() {
        if (this.k0 == null) {
            Context context = getContext();
            hi.r3 r3Var = new hi.r3(context);
            r3Var.a = new Path();
            r3Var.c = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
            r3Var.d = true;
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            r3Var.addView(textView, c8.ha.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            r3Var.addView(radialProgressView, c8.ha.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            r3Var.h = view;
            int i7 = org.telegram.ui.ActionBar.k6.Ei;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i7, false), 2, -1);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
            view.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(view, h02, null, N, null);
            r3Var.addView(view, c8.ha.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            r3Var.setWillNotDraw(false);
            this.k0 = r3Var;
            r3Var.setVisibility(8);
            N();
            this.k0.setBotMenuButton(this.l0);
            this.y1.addView(this.k0, c8.ha.e(-1, -1, 80));
        }
        return this.k0;
    }

    public int getCursorPosition() {
        xe xeVar = this.E0;
        if (xeVar == null) {
            return 0;
        }
        return xeVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.Z1 != null) {
            if (TextUtils.isEmpty(this.V1)) {
                return null;
            }
            return this.V1;
        }
        if (this.E0 == null || !h0()) {
            return null;
        }
        return this.E0.getText();
    }

    @Override // org.telegram.ui.Components.mw0
    public Editable getEditText() {
        xe xeVar = this.E0;
        if (xeVar == null) {
            return null;
        }
        return xeVar.getText();
    }

    public org.telegram.messenger.ij getEditingMessageObject() {
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

    public gy getEmojiView() {
        return this.U0;
    }

    public float getExitTransition() {
        return this.m4;
    }

    @Override // org.telegram.ui.Components.mw0
    public CharSequence getFieldText() {
        if (this.E0 == null || !h0()) {
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
        org.telegram.messenger.mj mjVar;
        org.telegram.messenger.kj kjVar;
        org.telegram.ui.an anVar = this.P2;
        int size = (anVar == null || (mjVar = anVar.v5) == null || (kjVar = mjVar.b) == null) ? 0 : kjVar.g.size();
        xe xeVar = this.E0;
        if (xeVar == null || TextUtils.isEmpty(xeVar.getText())) {
            if (this.d3 == null) {
            }
            size++;
        } else {
            String obj = this.E0.getText().toString();
            org.telegram.messenger.p5 p5Var = org.telegram.messenger.gz.I;
            String trim = obj.trim();
            if (trim.length() != 0) {
                while (obj.startsWith("\n")) {
                    obj = obj.substring(1);
                }
                while (obj.endsWith("\n")) {
                    obj = com.google.android.recaptcha.internal.a.k(obj, 1, 0);
                }
                trim = obj;
            }
            int u12 = org.telegram.messenger.qp.s1(this.R.a).u1();
            if (trim.length() != 0) {
                size += (int) Math.ceil(trim.length() / u12);
            }
            size++;
        }
        return Math.max(1, size);
    }

    public RecordCircle getRecordCircle() {
        return this.N1;
    }

    public long getRecordTimerStartTime() {
        fg fgVar = this.Y0;
        if (fgVar == null || !fgVar.a) {
            return 0L;
        }
        return fgVar.d;
    }

    public org.telegram.messenger.ij getReplyingMessageObject() {
        return this.T2;
    }

    public int getSelectionLength() {
        xe xeVar = this.E0;
        if (xeVar == null) {
            return 0;
        }
        try {
            return xeVar.getSelectionEnd() - this.E0.getSelectionStart();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return 0;
        }
    }

    public View getSendButton() {
        return getSendButtonInternal().getVisibility() == 0 ? getSendButtonInternal() : this.Z0;
    }

    public View getSendButtonInternal() {
        return this.J0;
    }

    public org.telegram.messenger.nj getSendMessageSuggestionParams() {
        org.telegram.ui.an anVar = this.P2;
        if (anVar != null) {
            return anVar.w5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.an anVar = this.P2;
        if (anVar != null) {
            return anVar.h9();
        }
        return 0L;
    }

    public cn0 getSenderSelectView() {
        return this.p0;
    }

    public rt0 getSizeNotifierLayout() {
        return this.m1;
    }

    public float getSlideToCancelProgress() {
        return this.j4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.G0 > 0) {
            return ((org.telegram.ui.ActionBar.k5) this.F0.c).getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.an anVar = this.P2;
        return anVar != null ? anVar.getMessagesController().N1(anVar.a()) : org.telegram.messenger.qp.s1(this.Q).N1(this.Q2);
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
        tL_textWithEntities.entities = org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).W(charSequenceArr, true, true);
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

    public e31 getTrendingStickersAlert() {
        return this.a3;
    }

    public int getVisibleEmojiPadding() {
        if (this.W0) {
            return this.A2;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f10 = this.T1;
        View view = this.G1;
        if (view != null && view.getVisibility() == 0) {
            f10 += (1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height;
        }
        return getMeasuredHeight() - f10;
    }

    public final boolean h0() {
        xe xeVar = this.E0;
        return xeVar != null && xeVar.length() > 0;
    }

    public final void h1(boolean z9) {
        if (this.p5 == z9) {
            return;
        }
        this.p5 = z9;
        this.r1.setVisibility(z9 ? 8 : 0);
        if (z9) {
            org.telegram.messenger.g0.E2(this.I1);
        }
        if (z9) {
            this.b1.setVisibility(8);
        } else {
            P0();
        }
        if (!z9) {
            this.c0 = -1;
            NumberTextView numberTextView = this.b0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        J1(this.P4);
        E(false);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i0() {
        fi.m3 m3Var = this.N;
        if (m3Var != null) {
            m3Var.f(true);
        }
        fi.m3 m3Var2 = this.L;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
    }

    public final void i1(CharSequence charSequence, boolean z9) {
        this.e = charSequence;
        this.f = null;
        I1(z9);
    }

    public final void j0() {
        l0(true, false, true);
    }

    public final void j1(boolean z9, boolean z10) {
        ee eeVar = this.b1;
        if (eeVar == null) {
            return;
        }
        this.c1 = z9;
        if (z10) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            boolean z11 = false;
            if (org.telegram.messenger.m5.z(this.Q2)) {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.R.a).M0(Long.valueOf(-this.Q2));
                if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                    z11 = true;
                }
            }
            e12.edit().putBoolean(z11 ? "currentModeVideoChannel" : "currentModeVideo", z9).apply();
        }
        eeVar.j(this.c1 ? hg.b : hg.a, z10);
        eeVar.setContentDescription(org.telegram.messenger.hd.M0(this.c1 ? 2131754736 : 2131754734, null));
        this.Z0.setContentDescription(org.telegram.messenger.hd.M0(this.c1 ? 2131754736 : 2131754734, null));
        eeVar.sendAccessibilityEvent(8);
    }

    public final void k(TLRPC.Document document) {
        org.telegram.messenger.ui.b0(this.Q).c(document, (int) (System.currentTimeMillis() / 1000), true);
        mf mfVar = this.U0;
        if (mfVar == null || document == null) {
            return;
        }
        boolean isEmpty = mfVar.i1.isEmpty();
        mfVar.W();
        if (isEmpty) {
            mfVar.X(false);
        }
    }

    public final void k0(boolean z9) {
        l0(z9, false, true);
    }

    public final void k1(org.telegram.messenger.ij ijVar, org.telegram.ui.qm qmVar) {
        l1(ijVar, qmVar, null);
    }

    public final void l(TLRPC.Document document) {
        Q();
        mf mfVar = this.U0;
        int i7 = mfVar.c1;
        org.telegram.messenger.ui.b0(i7).d(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = mfVar.j1.isEmpty();
        mfVar.j1 = org.telegram.messenger.ui.b0(i7).i0(0, true);
        xx xxVar = mfVar.y0;
        if (xxVar != null) {
            xxVar.f();
        }
        if (isEmpty) {
            mfVar.X(false);
        }
    }

    public final boolean l0(boolean z9, boolean z10, boolean z11) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (s0()) {
            if (this.f2 == 1 && (tL_replyKeyboardMarkup = this.n2) != null && z9 && this.m2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    org.telegram.messenger.qp.s1(this.Q).e7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.m2.f1()).apply();
                }
            }
            if ((z9 && this.R1 != 0) || z10) {
                m1(0, true);
                mf mfVar = this.U0;
                if (mfVar != null) {
                    mfVar.t(true);
                }
                xe xeVar = this.E0;
                if (xeVar != null) {
                    xeVar.requestFocus();
                }
                n1(false, true, false, true);
                if (this.y3) {
                    E(true);
                    return true;
                }
            } else {
                if (this.R1 == 0) {
                    if (this.z3) {
                        n1(false, true, false, true);
                        return true;
                    }
                    t1(0, 0, true, z11 && !z9);
                    return true;
                }
                m1(0, false);
                this.U0.t(false);
                xe xeVar2 = this.E0;
                if (xeVar2 != null) {
                    xeVar2.requestFocus();
                }
            }
            return true;
        }
        return false;
    }

    public final void l1(org.telegram.messenger.ij ijVar, org.telegram.ui.qm qmVar, org.telegram.messenger.ij ijVar2) {
        org.telegram.messenger.ij ijVar3;
        org.telegram.ui.an anVar = this.P2;
        boolean z9 = (anVar == null || !anVar.R9() || this.U2 == ijVar2) ? false : true;
        if (ijVar != null) {
            if (this.W2 == null && (ijVar3 = this.m2) != this.T2) {
                this.W2 = ijVar3;
            }
            this.T2 = ijVar;
            this.V2 = qmVar;
            this.U2 = ijVar2;
            if (anVar == null || !anVar.v4 || anVar.l4 != ijVar) {
                Y0(ijVar, true, true);
            }
        } else if (this.T2 == this.m2) {
            this.T2 = null;
            this.U2 = null;
            this.V2 = null;
            Y0(this.W2, true, false);
            this.W2 = null;
        } else {
            this.T2 = null;
            this.V2 = null;
            this.U2 = null;
        }
        B(true);
        wf wfVar = this.Z2;
        TL_stories.StoryItem T0 = wfVar != null ? wfVar.T0() : null;
        MediaController B = MediaController.B();
        org.telegram.messenger.ij threadMessage = getThreadMessage();
        B.q1 = ijVar;
        B.r1 = threadMessage;
        B.s1 = T0;
        I1(z9);
    }

    public final ValueAnimator m(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J1.a, f10);
        ofFloat.addUpdateListener(new zc(this, 5));
        return ofFloat;
    }

    public final void m0(boolean z9) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.u2;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.c3 = null;
            this.b3 = null;
            this.d3 = null;
            this.e3 = null;
            h61 h61Var = this.f1;
            int i7 = 1;
            if (h61Var != null) {
                h61Var.a(true);
            }
            ee eeVar = this.b1;
            if (eeVar != null) {
                eeVar.setVisibility(0);
            }
            td tdVar = this.d4;
            td tdVar2 = this.Z3;
            td tdVar3 = this.b4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            wd wdVar = this.Q0;
            Property property3 = View.ALPHA;
            kg.k kVar = this.r1;
            if (z9) {
                if (kVar != null) {
                    this.v1 = 0.0f;
                    kVar.setAlpha(0.0f);
                    kVar.setScaleX(0.0f);
                    kVar.setScaleY(0.0f);
                }
                this.n = 0.0f;
                this.h = 0.0f;
                H1();
                this.u2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(wdVar, tdVar3, this.A0 ? 0.5f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(wdVar, tdVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.g1, (Property<ch0, Float>) property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.g1, (Property<ch0, Float>) property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.g1, (Property<ch0, Float>) property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.e1, (Property<ud, Float>) property3, 0.0f));
                if (kVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.q1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.q1 = null;
                    }
                    this.v1 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<kg.k, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<kg.k, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<kg.k, Float>) property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.E0, (Property<xe, Float>) property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.E0, tdVar, 0.0f));
                ag agVar = this.O1;
                if (agVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(agVar, (Property<ag, Float>) property3, 0.0f));
                    this.O1.a();
                }
                this.u2.playTogether(arrayList);
                hi.y yVar = this.l0;
                if (yVar != null) {
                    yVar.setAlpha(0.0f);
                    this.l0.setScaleY(0.0f);
                    this.l0.setScaleX(0.0f);
                    this.u2.playTogether(ObjectAnimator.ofFloat(this.l0, (Property<hi.y, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<hi.y, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<hi.y, Float>) property, 1.0f));
                }
                this.u2.setDuration(150L);
                this.u2.addListener(new he(this, i7));
            } else {
                ch0 ch0Var = this.g1;
                if (ch0Var != null) {
                    ch0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z10 = this.c1;
                Property property4 = View.TRANSLATION_X;
                if (z10) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.f1, (Property<h61, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f1, (Property<h61, Float>) property4, -org.telegram.messenger.g0.L(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.E0, tdVar, 0.0f));
                    ag agVar2 = this.O1;
                    if (agVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(agVar2, (Property<ag, Float>) property3, 0.0f));
                        this.O1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.E0, (Property<xe, Float>) property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.E0, (Property<xe, Float>) property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    xe xeVar = this.E0;
                    if (xeVar == null || this.s != 1.0f) {
                        this.G = 0.0f;
                        L1();
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.E0, (Property<xe, Float>) property3, 1.0f);
                        ofFloat2.setStartDelay(750L);
                        ofFloat2.setDuration(200L);
                        animatorSet3.playTogether(ofFloat2);
                    } else {
                        xeVar.setAlpha(1.0f);
                        this.G = 0.0f;
                        L1();
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(this.h1, (Property<ji0, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.h1, (Property<ji0, Float>) property4, -org.telegram.messenger.g0.L(20.0f)));
                    ag agVar3 = this.O1;
                    if (agVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(agVar3, (Property<ag, Float>) property3, 0.0f));
                        this.O1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (kVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.q1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.q1 = null;
                    }
                    this.v1 = 0.0f;
                    kVar.setAlpha(0.0f);
                    kVar.setScaleX(0.0f);
                    kVar.setScaleY(0.0f);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.v1 = 1.0f;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(kVar, (Property<kg.k, Float>) property3, 1.0f), ObjectAnimator.ofFloat(kVar, (Property<kg.k, Float>) property2, 1.0f), ObjectAnimator.ofFloat(kVar, (Property<kg.k, Float>) property, 1.0f));
                    animatorSet4.setDuration(150L);
                    animatorSet = animatorSet4;
                } else {
                    animatorSet = null;
                }
                this.h = 0.0f;
                this.n = 0.0f;
                H1();
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<ch0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<ch0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<ch0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<ch0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(wdVar, tdVar3, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(wdVar, tdVar2, 1.0f));
                hi.y yVar2 = this.l0;
                if (yVar2 != null) {
                    yVar2.setAlpha(0.0f);
                    this.l0.setScaleY(0.0f);
                    this.l0.setScaleX(0.0f);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.l0, (Property<hi.y, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<hi.y, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<hi.y, Float>) property, 1.0f));
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
                this.u2.addListener(new af(this));
            }
            AnimatorSet animatorSet7 = this.u2;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            ag agVar4 = this.O1;
            if (agVar4 != null) {
                agVar4.invalidate();
            }
        }
    }

    public final void m1(int i7, boolean z9) {
        boolean z10 = i7 != 0;
        if (z10 != (this.R1 != 0)) {
            ValueAnimator valueAnimator = this.v0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.v0.cancel();
            }
            if (z9) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w0, z10 ? 1.0f : 0.0f);
                this.v0 = ofFloat;
                ofFloat.addUpdateListener(new zc(this, 4));
                this.v0.addListener(new le(this, z10, 3));
                this.v0.setDuration(220L);
                this.v0.setInterpolator(xq.f);
                this.v0.start();
            } else {
                this.w0 = z10 ? 1.0f : 0.0f;
                mf mfVar = this.U0;
                if (mfVar != null) {
                    mfVar.Z();
                }
            }
        }
        this.R1 = i7;
    }

    public final ValueAnimator n(boolean z9) {
        final float alpha = getSendButtonInternal().getAlpha();
        final float f10 = z9 ? 1.0f : 0.0f;
        final float scaleX = getSendButtonInternal().getScaleX();
        final float f11 = z9 ? 1.0f : 0.1f;
        final float scaleY = getSendButtonInternal().getScaleY();
        final float f12 = z9 ? 1.0f : 0.1f;
        if (z9 && alpha < 0.25f && (getSendButtonInternal() instanceof dg)) {
            dg dgVar = (dg) getSendButtonInternal();
            dgVar.e0.e(true, 0.0f);
            dgVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.kd
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i7 = ChatActivityEnterView.s5;
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

    public final void n0() {
        this.c3 = null;
        this.b3 = null;
        this.d3 = null;
        this.e3 = null;
        h61 h61Var = this.f1;
        if (h61Var != null) {
            h61Var.a(true);
        }
        ji0 ji0Var = this.h1;
        if (ji0Var != null) {
            ji0Var.setAlpha(1.0f);
            this.h1.setTranslationX(0.0f);
        }
        h61 h61Var2 = this.f1;
        if (h61Var2 != null) {
            h61Var2.setAlpha(1.0f);
            this.f1.setTranslationX(0.0f);
        }
        xe xeVar = this.E0;
        if (xeVar != null) {
            xeVar.setAlpha(1.0f);
            this.G = 0.0f;
            L1();
            this.E0.requestFocus();
        }
        ud udVar = this.e1;
        if (udVar != null) {
            udVar.setVisibility(8);
        }
        w0();
    }

    public final void n1(boolean z9, boolean z10, boolean z11, boolean z12) {
        final int i7 = 1;
        org.telegram.ui.ActionBar.i1 i1Var = this.U;
        if ((i1Var != null && i1Var.f) || this.l3 || this.U0 == null) {
            return;
        }
        if (z11 || this.z3 != z9) {
            this.z3 = z9;
            wf wfVar = this.Z2;
            if (wfVar != null) {
                wfVar.h1();
            }
            Point point = org.telegram.messenger.g0.q;
            final int i10 = point.x > point.y ? this.y2 : this.x2;
            AnimatorSet animatorSet = this.B3;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.B3 = null;
            }
            boolean z13 = this.z3;
            h2.f fVar = this.L3;
            org.telegram.ui.Cells.g1 g1Var = this.t3;
            final int i11 = 0;
            rt0 rt0Var = this.m1;
            if (z13) {
                if (z12) {
                    org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.j1, 1);
                }
                int height = rt0Var.getHeight();
                this.o1 = height;
                int L = ((((height - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
                this.D3 = L;
                if (this.R1 == 2) {
                    this.D3 = Math.min(L, org.telegram.messenger.g0.L(175.0f) + i10);
                }
                if (this.h5 == null) {
                    this.U0.getLayoutParams().height = this.D3;
                }
                rt0Var.requestLayout();
                if (this.y4) {
                    rt0Var.setForeground(new oc(this));
                }
                xe xeVar = this.E0;
                if (xeVar != null) {
                    int selectionStart = xeVar.getSelectionStart();
                    int selectionEnd = this.E0.getSelectionEnd();
                    xe xeVar2 = this.E0;
                    xeVar2.setText(xeVar2.getText());
                    this.E0.setSelection(selectionStart, selectionEnd);
                }
                if (z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    if (this.h5 != null) {
                        animatorSet2.playTogether(ValueAnimator.ofInt(-(this.D3 - i10)), ValueAnimator.ofInt(-(this.D3 - i10)), ObjectAnimator.ofFloat(this.F3, "animationProgress", 1.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.D3 - i10)), ObjectAnimator.ofInt(this.U0, g1Var, -(this.D3 - i10)), ObjectAnimator.ofFloat(this.F3, "animationProgress", 1.0f));
                    }
                    animatorSet2.setDuration(300L);
                    animatorSet2.setInterpolator(xq.f);
                    if (this.h5 == null) {
                        ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.hd
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
                                        int i14 = ChatActivityEnterView.s5;
                                        chatActivityEnterView.C3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i13)));
                                        chatActivityEnterView.m1.invalidate();
                                        break;
                                    default:
                                        int i15 = ChatActivityEnterView.s5;
                                        chatActivityEnterView.C3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i13));
                                        chatActivityEnterView.m1.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet2.addListener(new he(this, 12));
                    this.B3 = animatorSet2;
                    this.U0.setLayerType(2, null);
                    fVar.d();
                    this.C3 = 0.0f;
                    rt0Var.invalidate();
                    animatorSet2.start();
                } else {
                    this.C3 = 1.0f;
                    if (this.h5 == null) {
                        setTranslationY(-(this.D3 - i10));
                        this.U0.setTranslationY(-(this.D3 - i10));
                    }
                    AnimatedArrowDrawable animatedArrowDrawable = this.F3;
                    if (animatedArrowDrawable != null) {
                        animatedArrowDrawable.setAnimationProgress(1.0f);
                    }
                }
                rh.e eVar = this.h5;
                if (eVar != null) {
                    ((rh.h) eVar).h(this.D3);
                }
            } else {
                if (z12) {
                    org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.k1, 1);
                }
                if (z10) {
                    this.A3 = true;
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.h5 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.F3, "animationProgress", 0.0f));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, g1Var, 0), ObjectAnimator.ofInt(this.U0, g1Var, 0), ObjectAnimator.ofFloat(this.F3, "animationProgress", 0.0f));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(xq.f);
                    if (this.h5 == null) {
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.hd
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
                                        int i14 = ChatActivityEnterView.s5;
                                        chatActivityEnterView.C3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i13)));
                                        chatActivityEnterView.m1.invalidate();
                                        break;
                                    default:
                                        int i15 = ChatActivityEnterView.s5;
                                        chatActivityEnterView.C3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i13));
                                        chatActivityEnterView.m1.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet3.addListener(new qf(this, i10, i7));
                    this.C3 = 1.0f;
                    rt0Var.invalidate();
                    this.B3 = animatorSet3;
                    this.U0.setLayerType(2, null);
                    fVar.d();
                    animatorSet3.start();
                } else {
                    this.C3 = 0.0f;
                    if (this.h5 == null) {
                        setTranslationY(0.0f);
                        this.U0.setTranslationY(0.0f);
                        this.U0.getLayoutParams().height = i10;
                    }
                    rt0Var.requestLayout();
                    rt0Var.setForeground(null);
                    rt0Var.setWillNotDraw(false);
                    AnimatedArrowDrawable animatedArrowDrawable2 = this.F3;
                    if (animatedArrowDrawable2 != null) {
                        animatedArrowDrawable2.setAnimationProgress(0.0f);
                    }
                }
                rh.e eVar2 = this.h5;
                if (eVar2 != null) {
                    ((rh.h) eVar2).h(i10);
                }
            }
            ke keVar = this.S0;
            if (keVar != null) {
                if (this.z3) {
                    keVar.setContentDescription(org.telegram.messenger.hd.M0(2131754893, "AccDescrCollapsePanel"));
                } else {
                    keVar.setContentDescription(org.telegram.messenger.hd.M0(2131754883, "AccDescrExpandPanel"));
                }
            }
        }
    }

    public void o0(boolean z9) {
        if (this.G1 == null || !this.f3) {
            return;
        }
        ad adVar = this.V;
        if (adVar != null) {
            org.telegram.messenger.g0.r(adVar);
        }
        this.f3 = false;
        this.g3 = false;
        if (this.h3) {
            this.k5.a(false, z9);
        }
    }

    public final void o1(boolean z9, boolean z10) {
        if (this.v4 == z9 && z10) {
            return;
        }
        ImageView imageView = this.w1;
        if (imageView == null) {
            if (!z9 && !this.p5) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = new ImageView(getContext());
                this.w1 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                ImageView imageView3 = this.w1;
                int i7 = org.telegram.ui.ActionBar.k6.Kl;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.f6 f6Var = this.W3;
                org.telegram.ui.ActionBar.r6.t(imageView3, i7, f6Var, mode);
                this.w1.setImageResource(R.drawable.input_suggest_paid_24);
                ImageView imageView4 = this.w1;
                int i10 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.ActionBar.r6.R(imageView4, org.telegram.ui.ActionBar.k6.h0(f0(i10), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i10), f6Var);
                if (this.p5) {
                    this.w1.setTranslationX(org.telegram.messenger.g0.L(42.0f));
                    this.z1.addView(this.w1, c8.ha.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                } else {
                    this.p1.addView(this.w1, 0, c8.ha.o(44, 44));
                }
                this.w1.setOnClickListener(new cd(this, 19));
                this.w1.setContentDescription(org.telegram.messenger.hd.M0(2131754921, null));
            }
        }
        boolean z11 = this.v4 != z9;
        this.v4 = z9;
        float f10 = z9 ? 1.0f : 0.6f;
        float f11 = z9 ? 1.0f : 0.0f;
        this.w1.setEnabled(z9);
        this.w1.setClickable(z9);
        ValueAnimator valueAnimator = this.w4;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.w4 = null;
        }
        if (z10) {
            if (this.p5) {
                this.w1.setVisibility(0);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w1.getAlpha(), f11);
            this.w4 = ofFloat;
            ofFloat.addUpdateListener(new zc(this, 7));
            this.w4.addListener(new le(this, z9, r3));
            this.w4.setDuration(220L);
            this.w4.setInterpolator(xq.h);
            this.w4.start();
        } else {
            this.w1.setScaleX(f10);
            this.w1.setScaleY(f10);
            this.w1.setAlpha(f11);
            if (this.p5) {
                this.w1.setVisibility(z9 ? 0 : 8);
            }
        }
        J1(this.P4);
        if (z11) {
            E(true);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ne neVar = this.q0;
        if (neVar != null) {
            neVar.e = false;
            neVar.dismiss();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        b0(canvas, true);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View X;
        if (this.F2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (X = org.telegram.messenger.g0.X(this, motionEvent.getX(), motionEvent.getY())) != this.L && X != this.M) {
            i0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        ve veVar;
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.Z4 == -1 || (veVar = this.m0) == null) {
            return;
        }
        v4.b0 b0Var = (v4.b0) veVar.c.getLayoutManager();
        if (b0Var != null) {
            b0Var.h1(this.Z4, this.a5);
        }
        this.Z4 = -1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        ud udVar = this.z1;
        int measuredHeight = udVar.getMeasuredHeight();
        hi.y yVar = this.l0;
        ImageView imageView = this.R0;
        wd wdVar = this.Q0;
        int i11 = 0;
        if (yVar == null || yVar.getTag() == null) {
            cn0 cn0Var = this.p0;
            if (cn0Var == null || cn0Var.getVisibility() != 0) {
                ((ViewGroup.MarginLayoutParams) wdVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                }
                xe xeVar = this.E0;
                if (xeVar != null) {
                    ((ViewGroup.MarginLayoutParams) xeVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(50.0f);
                }
                org.telegram.messenger.au auVar = this.C1;
                if (auVar != null) {
                    ((ViewGroup.MarginLayoutParams) auVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(50.0f);
                }
            } else {
                int i12 = this.p0.getLayoutParams().width;
                this.p0.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.p0.getLayoutParams().height, TLObject.FLAG_30));
                ((ViewGroup.MarginLayoutParams) wdVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(7.0f) + i12;
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(7.0f) + i12;
                }
                xe xeVar2 = this.E0;
                if (xeVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) xeVar2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(54.0f) + i12;
                }
                org.telegram.messenger.au auVar2 = this.C1;
                if (auVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) auVar2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(54.0f) + i12;
                }
            }
        } else {
            this.l0.measure(i7, i10);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wdVar.getLayoutParams();
            int L = org.telegram.messenger.g0.L(10.0f);
            hi.y yVar2 = this.l0;
            marginLayoutParams.leftMargin = L + (yVar2 == null ? 0 : yVar2.getMeasuredWidth());
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int L2 = org.telegram.messenger.g0.L(10.0f);
                hi.y yVar3 = this.l0;
                marginLayoutParams2.leftMargin = L2 + (yVar3 == null ? 0 : yVar3.getMeasuredWidth());
            }
            xe xeVar3 = this.E0;
            if (xeVar3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) xeVar3.getLayoutParams();
                int L3 = org.telegram.messenger.g0.L(57.0f);
                hi.y yVar4 = this.l0;
                marginLayoutParams3.leftMargin = L3 + (yVar4 == null ? 0 : yVar4.getMeasuredWidth());
            }
            org.telegram.messenger.au auVar3 = this.C1;
            if (auVar3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) auVar3.getLayoutParams();
                int L4 = org.telegram.messenger.g0.L(57.0f);
                hi.y yVar5 = this.l0;
                marginLayoutParams4.leftMargin = L4 + (yVar5 == null ? 0 : yVar5.getMeasuredWidth());
            }
        }
        E1();
        super.onMeasure(i7, i10);
        hi.r3 r3Var = this.k0;
        if (r3Var != null) {
            hi.y yVar6 = this.l0;
            if (yVar6 != null) {
                r3Var.setMeasuredButtonWidth(yVar6.getMeasuredWidth());
            }
            this.k0.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f);
            measureChild(this.k0, i7, i10);
        }
        H();
        I();
        if (measuredHeight <= 0 || udVar.getMeasuredHeight() == measuredHeight) {
            return;
        }
        while (i11 < 2) {
            ImageView imageView2 = i11 == 0 ? this.t1 : this.u1;
            imageView2.setTranslationY((imageView2.getTranslationY() + udVar.getMeasuredHeight()) - measuredHeight);
            imageView2.animate().translationY(0.0f).setInterpolator(xq.h).setDuration(420L).start();
            i11++;
        }
        fi.m3 m3Var = this.M;
        if (m3Var != null) {
            m3Var.setTranslationY((m3Var.getTranslationY() + udVar.getMeasuredHeight()) - measuredHeight);
            org.telegram.messenger.camera.q.l(this.M.animate().translationY(0.0f), xq.h, 420L);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 != i11 && this.z3) {
            m1(0, false);
            this.U0.t(false);
            n1(false, false, false, true);
        }
        h61 h61Var = this.f1;
        if (h61Var != null) {
            ArrayList arrayList = h61Var.w;
            if (h61Var.N.isEmpty()) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i13);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            e61 e61Var = h61Var.x;
            if (e61Var != null) {
                e61Var.cancel(true);
                h61Var.x = null;
            }
            h61Var.invalidate();
        }
    }

    public final void p(org.telegram.messenger.ez ezVar) {
        wf wfVar = this.Z2;
        if (wfVar != null) {
            ezVar.H = wfVar.T0();
            ezVar.J = this.Z2.o0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if ((r4.getLineRight(0) + r3) >= ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight())) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p0() {
        xe xeVar = this.E0;
        if (xeVar != null) {
            if (TextUtils.isEmpty(xeVar.getCaption())) {
                xe xeVar2 = this.E0;
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

    public final void p1(boolean z9) {
        org.telegram.ui.an anVar;
        int i7 = 0;
        int i10 = 1;
        boolean z10 = ((!z9 && !this.D1) || (anVar = this.P2) == null || anVar.z()) ? false : true;
        if (this.K4 == z10) {
            return;
        }
        if (z10) {
            org.telegram.messenger.qp.s1(this.Q).R1().b();
        }
        this.K4 = z10;
        ImageView imageView = this.t1;
        imageView.setVisibility(0);
        imageView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setInterpolator(xq.h).setDuration(420L).withEndAction(new id(this, z10, i7)).start();
        if (!z10) {
            fi.m3 m3Var = this.M;
            if (m3Var != null) {
                m3Var.f(true);
                this.M = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.u2 u2Var = this.s1;
        Objects.requireNonNull(u2Var);
        imageView.postDelayed(new j0(u2Var, i10), 220L);
        fi.m3 m3Var2 = this.M;
        if (m3Var2 != null) {
            m3Var2.f(true);
            this.M = null;
        }
        if (org.telegram.messenger.qp.e1().getInt("aihintshown", 0) < 3) {
            fi.m3 m3Var3 = new fi.m3(getContext(), 3);
            this.M = m3Var3;
            m3Var3.r(true);
            this.M.u(org.telegram.messenger.hd.M0(2131754992, null));
            setHintGlass(this.M);
            this.M.p(0.0f, (imageView.getWidth() / 2.0f) + org.telegram.messenger.g0.L(4.0f));
            addView(this.M, c8.ha.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
            fi.m3 m3Var4 = this.M;
            m3Var4.q0 = new f(6, this, m3Var3);
            m3Var4.d = 4000L;
            m3Var4.w();
            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", org.telegram.messenger.qp.e1().getInt("aihintshown", 0) + 1).apply();
        }
    }

    public boolean q() {
        return false;
    }

    public final boolean q0() {
        return this.Z1 != null;
    }

    public final void q1() {
        org.telegram.ui.an anVar = this.P2;
        if (anVar == null || !org.telegram.messenger.t3.V(anVar.e)) {
            return;
        }
        hc.a0(anVar).f(org.telegram.messenger.qp.s1(this.Q).U4, new ad(this, 3)).j();
    }

    public final void r() {
        if (this.U0.getParent() == null) {
            if (this.h5 == null) {
                this.n1.addView(this.U0);
            } else {
                this.n1.addView(this.U0, c8.ha.c(-1.0f, -1));
            }
        }
    }

    public final boolean r0() {
        return this.c1;
    }

    public boolean r1(Runnable runnable) {
        return false;
    }

    public final boolean s() {
        hi.y yVar = this.l0;
        return yVar != null && yVar.w;
    }

    public final boolean s0() {
        return this.W0 || this.X0;
    }

    public final void s1() {
        t1(1, 0, true, true);
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.i1 i1Var) {
        this.U = i1Var;
    }

    public void setAnimatedTop(int i7) {
        this.T1 = i7;
    }

    public void setBotInfo(a0.h hVar) {
        W0(hVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f10) {
        this.Q0.setTranslationX(f10);
        if (this.E0 != null) {
            this.G = f10;
            L1();
        }
        this.r1.setTranslationX(this.D + this.y + f10);
        this.b1.setTranslationX(f10);
        ke keVar = this.x1;
        if (keVar != null) {
            keVar.setTranslationX(f10);
        }
    }

    public void setButtons(org.telegram.messenger.ij ijVar) {
        Y0(ijVar, true, true);
    }

    public void setCaption(String str) {
        xe xeVar = this.E0;
        if (xeVar != null) {
            xeVar.setCaption(str);
            E(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.d2 = chatFull;
        mf mfVar = this.U0;
        if (mfVar != null) {
            mfVar.setChatInfo(chatFull);
        }
        eg egVar = this.F0;
        if (egVar != null) {
            egVar.b = chatFull != null && chatFull.boosts_unrestrict > 0;
            egVar.invalidate();
        }
        if (org.telegram.messenger.t3.i0(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f10) {
        this.C4 = f10;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.J4 = view;
        this.E0.setWindowView(view);
    }

    public void setDelegate(wf wfVar) {
        this.Z2 = wfVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.b2 = tL_businessChatLink;
        I1(false);
        if (this.b2 != null) {
            P(true);
            this.F1.setOnClickListener(new cd(this, 3));
            this.F1.setContentDescription(org.telegram.messenger.hd.M0(2131751355, null));
            this.F1.setVisibility(0);
            this.F1.setScaleX(0.1f);
            this.F1.setScaleY(0.1f);
            this.F1.setAlpha(0.0f);
            this.F1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(xq.f).start();
            this.c0 = org.telegram.messenger.qp.s1(this.R.a).u1();
            xe xeVar = this.E0;
            TextPaint paint = xeVar != null ? xeVar.getPaint() : null;
            if (paint == null) {
                paint = new TextPaint();
                paint.setTextSize(org.telegram.messenger.g0.L(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.b2.entities;
            if (arrayList == null || (str = tL_businessChatLink.message) == null) {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            } else {
                setFieldText(o(fontMetricsInt, str, arrayList));
            }
            this.c2 = u();
            U0(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.P0.setVisibility(8);
            this.Z0.setVisibility(8);
            bi.t tVar = this.p1;
            if (tVar != null) {
                tVar.setVisibility(8);
            }
            kg.k kVar = this.r1;
            if (kVar != null) {
                this.v1 = 0.0f;
                kVar.setAlpha(0.0f);
                kVar.setScaleX(0.5f);
                kVar.setScaleY(0.5f);
            }
            this.A1.setVisibility(8);
            ie ieVar = this.J1;
            if (ieVar != null) {
                ieVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j3) {
        this.S4 = j3;
        ge geVar = this.J0;
        if (geVar != null) {
            geVar.setEffect(j3);
        }
    }

    public void setExitTransition(float f10) {
        this.m4 = f10;
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z9) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.O2.getSystemService("accessibility");
        if (this.E0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        if (z9 && org.telegram.ui.ActionBar.f2.hasSheets(this.P2)) {
            z9 = false;
        }
        if (z9) {
            if (this.R1 != 0 || this.E0.isFocused()) {
                return;
            }
            ad adVar = new ad(this, 6);
            this.S1 = adVar;
            org.telegram.messenger.g0.i3(adVar, 600L);
            return;
        }
        xe xeVar = this.E0;
        if (xeVar == null || !xeVar.isFocused()) {
            return;
        }
        if (!this.z2 || this.j2) {
            this.E0.clearFocus();
        }
    }

    @Override // org.telegram.ui.Components.mw0
    public void setFieldText(CharSequence charSequence) {
        e1(charSequence, false);
    }

    public void setInAppInsetsController(rh.e eVar) {
        this.h5 = eVar;
    }

    public void setLockAnimatedTranslation(float f10) {
        this.l4 = f10;
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new gd(this, 0);
        }
        this.J0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        i1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z9) {
        this.w = z9;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.C1 == null) {
            return;
        }
        org.telegram.messenger.qp.s1(this.Q);
        boolean z9 = org.telegram.messenger.r2.a;
        this.E1 = richMessage;
        P1();
    }

    public void setRoundVideoUiFrameClockActive(boolean z9) {
        if (this.j1 == z9) {
            return;
        }
        this.j1 = z9;
        fg fgVar = this.Y0;
        if (fgVar != null) {
            fgVar.setExternalFrameClock(z9);
        }
        cg cgVar = this.l1;
        if (cgVar != null) {
            cgVar.n = z9;
            cgVar.b = System.currentTimeMillis();
            cgVar.r = -1L;
            cgVar.invalidate();
        }
        SlideTextView slideTextView = this.k1;
        if (slideTextView != null) {
            slideTextView.J = z9;
            slideTextView.D = System.currentTimeMillis();
            slideTextView.invalidate();
        }
    }

    public void setSelection(int i7) {
        xe xeVar = this.E0;
        if (xeVar == null) {
            return;
        }
        xeVar.setSelection(i7, xeVar.length());
    }

    public void setSideButtonsForAttach(lh.h hVar) {
        bi.t tVar;
        lh.h hVar2 = this.i5;
        if (hVar2 == hVar) {
            return;
        }
        if (hVar2 != null) {
            hVar2.e(0, false, true);
        }
        this.i5 = hVar;
        kg.k kVar = this.r1;
        if (kVar == null || (tVar = this.p1) == null || tVar.getVisibility() == 0) {
            return;
        }
        boolean z9 = hVar != null && p0();
        boolean z10 = (hVar == null || z9) ? false : true;
        if (hVar != null) {
            hVar.e(0, z9, true);
        }
        ViewPropertyAnimator viewPropertyAnimator = this.q1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator animate = kVar.animate();
        float f10 = z10 ? 1.0f : 0.0f;
        this.v1 = f10;
        ViewPropertyAnimator duration = animate.alpha(f10).scaleX(z10 ? 1.0f : 0.5f).scaleY(z10 ? 1.0f : 0.5f).setInterpolator(xq.h).setDuration(320L);
        this.q1 = duration;
        duration.start();
    }

    public void setSlideToCancelProgress(float f10) {
        this.j4 = f10;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > org.telegram.messenger.g0.L(140.0f)) {
            measuredWidth = org.telegram.messenger.g0.L(140.0f);
        }
        this.t4 = (int) ((1.0f - this.j4) * (-measuredWidth));
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i7) {
        this.G0 = i7;
        U1();
    }

    public void setSnapAnimationProgress(float f10) {
        this.n4 = f10;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z9) {
        this.h0 = z9;
        this.A1.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.n1 = viewGroup;
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z9 = i7 == 0;
        this.I4 = z9;
        xe xeVar = this.E0;
        if (xeVar != null) {
            xeVar.setEnabled(z9);
        }
    }

    public void setVoiceDraft(org.telegram.messenger.pi piVar) {
        org.telegram.messenger.hw hwVar;
        TL_stories.StoryItem storyItem;
        File file;
        String str;
        if (piVar == null) {
            return;
        }
        boolean z9 = piVar.g;
        this.O = z9;
        ag agVar = this.O1;
        if (agVar != null) {
            agVar.D.d(1, z9, true);
        }
        wf wfVar = this.Z2;
        if (wfVar != null) {
            storyItem = wfVar.T0();
            hwVar = null;
        } else {
            hwVar = null;
            storyItem = null;
        }
        MediaController B = MediaController.B();
        int i7 = this.Q;
        long j3 = this.Q2;
        org.telegram.messenger.ij ijVar = this.T2;
        org.telegram.messenger.ij threadMessage = getThreadMessage();
        int i10 = this.G2;
        org.telegram.ui.an anVar = this.P2;
        if (anVar != null) {
            hwVar = anVar.W8();
        }
        long sendMonoForumPeerId = getSendMonoForumPeerId();
        org.telegram.messenger.nj sendMessageSuggestionParams = getSendMessageSuggestionParams();
        org.telegram.messenger.p5 p5Var = B.M1;
        if (B.H1) {
            e0.g gVar = B.F1;
            if (gVar != null && gVar.e() && B.f1 != null && (file = B.j1) != null && (str = piVar.a) != null && str.equals(file.getAbsolutePath())) {
                B.g1 = i10;
                B.q1 = ijVar;
                B.r1 = threadMessage;
                B.s1 = storyItem;
                B.t1 = hwVar;
                B.o1 = sendMonoForumPeerId;
                B.p1 = sendMessageSuggestionParams;
                org.telegram.messenger.qs.f(B.h1).k(org.telegram.messenger.qs.o2, new Object[0]);
                org.telegram.messenger.qs.f(B.h1).k(org.telegram.messenger.qs.s2, Integer.valueOf(B.g1), B.f1, B.j1.getAbsolutePath(), Boolean.TRUE, Float.valueOf(piVar.h), Float.valueOf(piVar.i));
                return;
            }
            if (!B.X()) {
                return;
            }
        }
        B.x0 = false;
        B.Y(true);
        p5Var.a(B.L1);
        p5Var.c(new org.telegram.messenger.wd(B, i10, piVar, i7, j3, sendMonoForumPeerId, sendMessageSuggestionParams, threadMessage, ijVar, storyItem));
    }

    public final boolean t() {
        sf u10 = u();
        return (TextUtils.equals(u10.a, this.c2.a) && org.telegram.messenger.ui.K(this.c2.b, u10.b)) ? false : true;
    }

    public final boolean t0(View view) {
        return view == this.H1 || view == this.U0;
    }

    public final void t1(int i7, int i10, boolean z9, boolean z10) {
        int i11;
        boolean z11;
        boolean z12;
        int i12;
        ViewGroup viewGroup;
        int i13;
        float f10;
        if (i7 == 2) {
            return;
        }
        h2.f fVar = this.L3;
        je jeVar = this.Y3;
        Property property = View.TRANSLATION_Y;
        boolean z13 = false;
        if (i7 == 1) {
            if (i10 == 0) {
                if (this.O2 == null && this.U0 == null) {
                    return;
                } else {
                    Q();
                }
            }
            if (i10 == 0) {
                r();
                if (this.W0) {
                    this.U0.getVisibility();
                }
                this.U0.setVisibility(0);
                this.W0 = true;
                jf jfVar = this.H1;
                if (jfVar == null || jfVar.getVisibility() == 8) {
                    i12 = 0;
                } else {
                    this.H1.setVisibility(8);
                    this.X0 = false;
                    i12 = this.H1.getMeasuredHeight();
                }
                this.U0.setShowing(true);
                viewGroup = this.U0;
                this.o3 = 0;
            } else if (i10 == 1) {
                if (this.X0) {
                    this.H1.getVisibility();
                }
                this.X0 = true;
                mf mfVar = this.U0;
                if (mfVar == null || mfVar.getVisibility() == 8) {
                    i13 = 0;
                } else {
                    this.n1.removeView(this.U0);
                    this.U0.setVisibility(8);
                    this.U0.setShowing(false);
                    this.W0 = false;
                    i13 = this.U0.getMeasuredHeight();
                }
                this.H1.setVisibility(0);
                ViewGroup viewGroup2 = this.H1;
                this.o3 = 1;
                org.telegram.messenger.qp.s1(this.Q).e7.edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                i12 = i13;
                viewGroup = viewGroup2;
            } else {
                i12 = 0;
                viewGroup = null;
            }
            this.f2 = i10;
            if (this.x2 <= 0) {
                f10 = 200.0f;
                this.x2 = org.telegram.messenger.qp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
            } else {
                f10 = 200.0f;
            }
            if (this.y2 <= 0) {
                this.y2 = org.telegram.messenger.qp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(f10));
            }
            Point point = org.telegram.messenger.g0.q;
            int i14 = point.x > point.y ? this.y2 : this.x2;
            org.telegram.ui.an anVar = this.P2;
            if (anVar != null && anVar.getParentLayout() != null) {
                i14 -= ((ActionBarLayout) anVar.getParentLayout()).w(false);
            }
            if (i10 == 1) {
                i14 = Math.min(this.H1.getKeyboardHeight(), i14);
            }
            jf jfVar2 = this.H1;
            if (jfVar2 != null) {
                jfVar2.setPanelHeight(i14);
            }
            if (viewGroup != null && this.h5 == null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                layoutParams.height = i14;
                viewGroup.setLayoutParams(layoutParams);
            }
            if (!org.telegram.messenger.g0.E) {
                org.telegram.messenger.g0.v1(this.E0);
            }
            rt0 rt0Var = this.m1;
            if (rt0Var != null) {
                this.A2 = i14;
                rt0Var.requestLayout();
                c1(true, true);
                D1(true);
                G0();
                if (this.i2 && !this.z2 && i14 != i12 && z9) {
                    ad adVar = new ad(this, 11);
                    if (this.w) {
                        this.x = adVar;
                    } else {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.V0 = animatorSet;
                        if (this.h5 != null) {
                            animatorSet.playTogether(ValueAnimator.ofFloat(i14 - i12, 0.0f));
                        } else {
                            float f11 = i14 - i12;
                            viewGroup.setTranslationY(f11);
                            this.V0.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) property, f11, 0.0f));
                        }
                        this.V0.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                        this.V0.setDuration(250L);
                        this.V0.addListener(new ah.l(22, this, adVar));
                        org.telegram.messenger.g0.i3(jeVar, 50L);
                        fVar.d();
                    }
                    requestLayout();
                }
            }
            rh.e eVar = this.h5;
            if (eVar != null) {
                ((rh.h) eVar).h(i14);
            }
        } else {
            if (this.Q0 != null) {
                c1(false, true);
            }
            this.f2 = -1;
            mf mfVar2 = this.U0;
            if (mfVar2 != null) {
                if (i7 == 2 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E) {
                    this.G3 = false;
                    wf wfVar = this.Z2;
                    if (wfVar != null) {
                        wfVar.w(0.0f);
                    }
                    this.n1.removeView(this.U0);
                    this.U0 = null;
                } else if (!this.i2 || this.z2 || this.z3) {
                    wf wfVar2 = this.Z2;
                    if (wfVar2 != null) {
                        wfVar2.w(0.0f);
                    }
                    z13 = false;
                    this.A2 = 0;
                    this.n1.removeView(this.U0);
                    this.U0.setVisibility(8);
                    this.U0.setShowing(false);
                } else {
                    this.W0 = true;
                    this.o3 = 0;
                    mfVar2.setShowing(false);
                    r2 r2Var = new r2(this, i7, 3);
                    if (this.w) {
                        z11 = false;
                        this.x = r2Var;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.V0 = animatorSet2;
                        if (this.h5 != null) {
                            z11 = false;
                            animatorSet2.playTogether(ValueAnimator.ofFloat(this.U0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                        } else {
                            z11 = false;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.U0, (Property<mf, Float>) property, r5.getMeasuredHeight()));
                        }
                        this.V0.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                        this.V0.setDuration(250L);
                        fVar.d();
                        this.V0.addListener(new ah.l(23, this, r2Var));
                    }
                    org.telegram.messenger.g0.i3(jeVar, 50L);
                    requestLayout();
                    z13 = z11;
                }
                this.W0 = z13;
            }
            jf jfVar3 = this.H1;
            if (jfVar3 != null && jfVar3.getVisibility() == 0) {
                if (i7 != 2 || org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    if (this.i2 && !this.z2) {
                        if (this.X0) {
                            this.o3 = 1;
                        }
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        this.V0 = animatorSet3;
                        if (this.h5 != null) {
                            i11 = 0;
                            animatorSet3.playTogether(ValueAnimator.ofFloat(this.H1.getMeasuredHeight()));
                        } else {
                            i11 = 0;
                            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.H1, (Property<jf, Float>) property, r5.getMeasuredHeight()));
                        }
                        this.V0.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                        this.V0.setDuration(250L);
                        this.V0.addListener(new qf(this, i7, i11));
                        fVar.d();
                        org.telegram.messenger.g0.i3(jeVar, 50L);
                        requestLayout();
                    } else if (!this.k3) {
                        this.H1.setVisibility(8);
                    }
                }
                this.X0 = false;
            }
            if (i10 == 1 && this.m2 != null) {
                org.telegram.messenger.qp.s1(this.Q).e7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.m2.f1()).apply();
            }
            D1(true);
            rh.e eVar2 = this.h5;
            if (eVar2 != null) {
                ((rh.h) eVar2).i(z10);
            }
        }
        if (this.x3 || this.y3) {
            E(true);
        }
        if (!this.z3 || i7 == 1) {
            z12 = false;
        } else {
            z12 = false;
            n1(false, false, false, true);
        }
        I1(z12);
        z();
    }

    public final sf u() {
        xe xeVar = this.E0;
        CharSequence[] charSequenceArr = {org.telegram.messenger.g0.n1(xeVar == null ? "" : xeVar.getTextToUse())};
        ArrayList W = org.telegram.messenger.ui.b0(this.Q).W(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = W.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) W.get(i7);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        sf sfVar = new sf();
        sfVar.a = charSequence.toString();
        sfVar.b = W;
        return sfVar;
    }

    public final boolean u0() {
        return this.F2 && ChatActivityEnterView.this.s4;
    }

    public final void u1() {
        wf wfVar = this.Z2;
        if ((wfVar == null || !wfVar.c()) && org.telegram.messenger.m5.z(this.Q2)) {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.R.a).M0(Long.valueOf(-this.Q2));
            hc a02 = hc.a0(this.P2);
            StringBuilder sb2 = new StringBuilder();
            if (org.telegram.messenger.t3.p(M0)) {
                sb2.append(org.telegram.messenger.hd.M0(2131745608, null));
            }
            if (org.telegram.messenger.t3.u(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.M0(2131745605, null));
            }
            if (org.telegram.messenger.t3.t(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.M0(2131745606, null));
            }
            if (org.telegram.messenger.t3.o(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.M0(2131745609, null));
            }
            if (org.telegram.messenger.t3.l(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.M0(2131745610, null));
            }
            if (org.telegram.messenger.t3.v(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.M0(2131745604, null));
            }
            if (org.telegram.messenger.t3.s(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.M0(2131745607, null));
            }
            if (org.telegram.messenger.t3.m(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.M0(2131745611, null));
            }
            a02.G(R.raw.passcode_lock_close, 3, org.telegram.messenger.hd.a0("SendPlainTextRestrictionHint", null, 2131745593, sb2.toString())).j();
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        TextPaint textPaint;
        org.telegram.ui.ActionBar.f6 f6Var = this.W3;
        try {
            xe xeVar = this.E0;
            if (xeVar != null) {
                org.telegram.ui.ActionBar.r6.m(xeVar, 34, org.telegram.ui.ActionBar.k6.Je, f6Var);
                org.telegram.ui.ActionBar.r6.w(this.E0, org.telegram.ui.ActionBar.k6.Ke, f6Var);
                org.telegram.ui.ActionBar.r6.z(this.E0, org.telegram.ui.ActionBar.k6.jg, f6Var);
            }
            Paint paint = this.Q1;
            if (paint != null) {
                paint.setColor(f0(org.telegram.ui.ActionBar.k6.Pf));
            }
            eg egVar = this.F0;
            if (egVar != null) {
                ((org.telegram.ui.ActionBar.k5) egVar.c).setTextColor(f0(org.telegram.ui.ActionBar.k6.Kl));
                egVar.invalidate();
            }
            AnimatedArrowDrawable animatedArrowDrawable = this.F3;
            if (animatedArrowDrawable != null) {
                animatedArrowDrawable.a.setColor(f0(org.telegram.ui.ActionBar.k6.Kl));
                animatedArrowDrawable.invalidateSelf();
            }
            ge geVar = this.J0;
            if (geVar != null && this.K0 != 0 && geVar.getBackground() != null) {
                int f02 = f0((this.G0 != Integer.MAX_VALUE || x0()) ? org.telegram.ui.ActionBar.k6.Me : org.telegram.ui.ActionBar.k6.Kl);
                if (f02 != this.K0) {
                    this.K0 = f02;
                    org.telegram.ui.ActionBar.k6.H1(geVar.getBackground(), Color.argb(24, Color.red(f02), Color.green(f02), Color.blue(f02)), true);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        O1();
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.e();
        }
        cg cgVar = this.l1;
        if (cgVar != null) {
            cgVar.b();
        }
        SlideTextView slideTextView = this.k1;
        if (slideTextView != null) {
            slideTextView.a();
        }
        fg fgVar = this.Y0;
        if (fgVar != null && (textPaint = fgVar.F) != null) {
            textPaint.setColor(fgVar.I.f0(org.telegram.ui.ActionBar.k6.bg));
        }
        h61 h61Var = this.f1;
        if (h61Var != null) {
            h61Var.e.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false));
            h61Var.L = 0;
            f61 f61Var = h61Var.P;
            if (f61Var != null) {
                f61Var.b();
            }
        }
        NumberTextView numberTextView = this.b0;
        if (numberTextView != null && this.E0 != null) {
            if (this.d0 - this.c0 < 0) {
                numberTextView.setTextColor(f0(org.telegram.ui.ActionBar.k6.p7));
            } else {
                numberTextView.setTextColor(f0(org.telegram.ui.ActionBar.k6.y6));
            }
        }
        Color.alpha(f0(org.telegram.ui.ActionBar.k6.Qf));
        ve veVar = this.m0;
        if (veVar != null) {
            veVar.d.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.wj, false));
            fh.g gVar = veVar.r;
            if (gVar != null) {
                gVar.updateColors();
            }
            veVar.invalidate();
        }
        jf jfVar = this.H1;
        if (jfVar != null) {
            jfVar.d();
        }
        int f03 = this.a1 ? f0(org.telegram.ui.ActionBar.k6.Kl) : -1;
        ee eeVar = this.b1;
        if (eeVar != null && (!this.V4 || f03 != this.T4)) {
            this.V4 = true;
            this.T4 = f03;
            eeVar.setColorFilter(new PorterDuffColorFilter(f03, PorterDuff.Mode.SRC_IN));
        }
        int f04 = f0(org.telegram.ui.ActionBar.k6.i6);
        if (this.W4 && f04 == this.U4) {
            return;
        }
        this.W4 = true;
        this.U4 = f04;
        wd wdVar = this.Q0;
        if (wdVar != null) {
            wdVar.setBackground(org.telegram.ui.ActionBar.k6.h0(f04, 1, -1));
        }
        ImageView imageView = this.R0;
        if (imageView != null) {
            float L = org.telegram.messenger.g0.L(19.0f);
            int L2 = org.telegram.messenger.g0.L(1.0f);
            int L3 = org.telegram.messenger.g0.L(3.0f);
            imageView.setBackground(org.telegram.ui.ActionBar.k6.Y(L, f04, L2, L3, L2, L3));
        }
    }

    public final float v(boolean z9) {
        te.c cVar = this.j5;
        float f10 = z9 ? cVar.h ? cVar.g : cVar.f : cVar.f;
        te.a aVar = this.k5;
        return ((this.G1 != null ? r1.getMeasuredHeight() : 0) * (z9 ? aVar.f ? 1.0f : 0.0f : aVar.e)) + f10;
    }

    public final boolean v0() {
        if (this.F2) {
            return true;
        }
        AnimatorSet animatorSet = this.t2;
        return (animatorSet == null || !animatorSet.isRunning() || this.k2) ? false : true;
    }

    public final void v1(boolean z9) {
        org.telegram.ui.an anVar;
        boolean z10;
        int i7 = 1;
        if ((this.D1 || z9) && (anVar = this.P2) != null && !anVar.z() && this.Z1 == null) {
            org.telegram.messenger.qp.s1(this.Q);
            boolean z11 = org.telegram.messenger.r2.a;
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.L4 == z10) {
            return;
        }
        this.L4 = z10;
        ImageView imageView = this.u1;
        imageView.setVisibility(0);
        imageView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setInterpolator(xq.h).setDuration(420L).withEndAction(new id(this, z10, i7)).start();
    }

    public final void w() {
        di.a4 a4Var = this.d1;
        if (a4Var != null) {
            a4Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.t2 = null;
        w0();
        if (this.p1 != null) {
            this.y = 0.0f;
            C1();
        }
        SlideTextView slideTextView = this.k1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.Z2.a();
        R1(true);
    }

    public final boolean w1() {
        ImageView imageView;
        if (this.N != null || (imageView = this.w1) == null || imageView.getVisibility() != 0 || org.telegram.messenger.qp.e1().getInt("channelsuggesthint2", 0) >= 2) {
            return false;
        }
        fi.m3 m3Var = new fi.m3(getContext(), 3);
        this.N = m3Var;
        m3Var.s(13.0f);
        setHintGlass(this.N);
        this.N.r(true);
        this.N.u(org.telegram.messenger.hd.a0(null, null, 2131744423, qg.d.h(this.Q, this.Q2)));
        this.N.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.N.p(1.0f, -((getWidth() - org.telegram.messenger.g0.L(12.0f)) - ((this.w1.getMeasuredWidth() / 2.0f) + (this.w1.getX() + (this.p1.getX() + this.y1.getX())))));
        addView(this.N, c8.ha.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
        fi.m3 m3Var2 = this.N;
        m3Var2.q0 = new ad(this, 12);
        m3Var2.d = 8000L;
        m3Var2.w();
        org.telegram.messenger.qp.e1().edit().putInt("channelsuggesthint2", org.telegram.messenger.qp.e1().getInt("channelsuggesthint2", 0) + 1).apply();
        return true;
    }

    public final void x() {
        if (this.e2 && this.c1) {
            CameraController.getInstance().cancelOnInitRunnable(this.H3);
            this.Z2.Z1(5, 0, this.O ? Integer.MAX_VALUE : 0, this.S4, 0L, true);
            this.S4 = 0L;
            this.J0.setEffect(0L);
        } else {
            this.Z2.R0(0);
            MediaController.B().B0(0, 0, false, false);
        }
        this.F2 = false;
        N1(2, true);
    }

    public final boolean x0() {
        return c() || this.m5.f;
    }

    public final void x1() {
        y1(true, false);
    }

    public final void y() {
        ke keVar;
        org.telegram.ui.an anVar;
        if (this.L != null || (keVar = this.K1) == null || keVar.getRight() == 0 || (anVar = this.P2) == null || !org.telegram.messenger.v1.d(anVar.q8)) {
            return;
        }
        if (org.telegram.messenger.qp.s1(this.Q).e7.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + anVar.a(), true)) {
            org.telegram.messenger.qp.s1(this.Q).e7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + anVar.a(), false).apply();
            fi.m3 m3Var = new fi.m3(getContext(), 3);
            this.L = m3Var;
            m3Var.s(13.0f);
            setHintGlass(this.L);
            this.L.r(true);
            V0();
            this.L.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            this.L.p(1.0f, -((getWidth() - org.telegram.messenger.g0.L(12.0f)) - ((this.K1.getMeasuredWidth() / 2.0f) + (this.K1.getX() + (this.p1.getX() + this.y1.getX())))));
            addView(this.L, c8.ha.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
            fi.m3 m3Var2 = this.L;
            m3Var2.q0 = new ad(this, 13);
            m3Var2.d = 8000L;
            m3Var2.w();
        }
    }

    public final boolean y0() {
        return this.z3;
    }

    public final void y1(boolean z9, boolean z10) {
        if (this.G1 == null || this.f3 || getVisibility() != 0) {
            ud udVar = this.e1;
            if ((udVar == null || udVar.getVisibility() != 0) && !this.H2 && this.V2 == null && this.T2 == null) {
                H0();
                return;
            }
            return;
        }
        ud udVar2 = this.e1;
        boolean z11 = (udVar2 == null || udVar2.getVisibility() != 0) && !this.H2 && this.V2 == null && (this.n2 == null || this.Z1 != null);
        if (!z10 && z9 && z11 && !this.z2 && !s0()) {
            H0();
            ad adVar = this.V;
            if (adVar != null) {
                org.telegram.messenger.g0.r(adVar);
            }
            ad adVar2 = new ad(this, 24);
            this.V = adVar2;
            org.telegram.messenger.g0.i3(adVar2, 200L);
            return;
        }
        this.g3 = true;
        this.f3 = true;
        if (this.h3) {
            this.k5.a(true, z9);
            if (z11) {
                xe xeVar = this.E0;
                if (xeVar != null) {
                    xeVar.requestFocus();
                }
                H0();
            }
        }
    }

    public final void z() {
        xe xeVar = this.E0;
        boolean z9 = ((xeVar != null && !TextUtils.isEmpty(xeVar.getText())) || this.z2 || this.k3 || s0()) ? false : true;
        if (z9) {
            N();
        }
        hi.y yVar = this.l0;
        if (yVar != null) {
            boolean z10 = yVar.f;
            if (z10 != z9) {
                yVar.f = z9;
                yVar.requestLayout();
                yVar.invalidate();
            }
            if (z10 != this.l0.f) {
                wd wdVar = this.Q0;
                Float valueOf = Float.valueOf(wdVar.getX());
                HashMap hashMap = this.B0;
                hashMap.put(wdVar, valueOf);
                xe xeVar2 = this.E0;
                if (xeVar2 != null) {
                    hashMap.put(xeVar2, Float.valueOf(xeVar2.getX()));
                }
            }
        }
    }

    public final boolean z0() {
        View view = this.G1;
        return view != null && view.getVisibility() == 0;
    }

    public final void z1() {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.k4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(xq.h);
        ofFloat2.setDuration(250L);
        int i7 = org.telegram.messenger.iz.a;
        SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
        edit.putInt("lockRecordAudioVideoHint", 3);
        edit.apply();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(this.k1, "cancelToProgress", 1.0f));
        animatorSet.start();
    }

    @Override // org.telegram.ui.Components.mw0
    public ys getEditField() {
        return this.E0;
    }

    @Override // org.telegram.ui.Components.mw0
    public org.telegram.ui.an getParentFragment() {
        return this.P2;
    }

    public void A0(float f10) {
    }

    public void e0(Menu menu) {
    }

    public void w0() {
    }

    public void C0(int i7, int i10) {
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
