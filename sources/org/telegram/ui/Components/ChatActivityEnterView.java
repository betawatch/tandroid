package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public class ChatActivityEnterView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, zv0, cy0, vy0, le.e, org.telegram.ui.ActionBar.x5 {
    public static final /* synthetic */ int n5 = 0;
    public boolean A0;
    public final le A1;
    public int A2;
    public boolean A3;
    public boolean A4;
    public final HashMap B0;
    public final ImageView B1;
    public final boolean B2;
    public AnimatorSet B3;
    public final Paint B4;
    public boolean C0;
    public RichMessageLayout.PreviewView C1;
    public long C2;
    public float C3;
    public float C4;
    public boolean D0;
    public boolean D1;
    public float D2;
    public int D3;
    public final Rect D4;
    public float E;
    public qf E0;
    public TL_iv.RichMessage E1;
    public float E2;
    public boolean E3;
    public boolean E4;
    public float F;
    public final wg F0;
    public ye F1;
    public boolean F2;
    public AnimatedArrowDrawable F3;
    public final td F4;
    public float G;
    public int G0;
    public View G1;
    public int G2;
    public boolean G3;
    public org.telegram.ui.ActionBar.e1 G4;
    public float H;
    public td H0;
    public bg H1;
    public boolean H2;
    public final bf H3;
    public ArrayList H4;
    public float I;
    public final gi.a I0;
    public final ImageView I1;
    public boolean I2;
    public boolean I3;
    public boolean I4;
    public boolean J;
    public final ye J0;
    public af J1;
    public boolean J2;
    public boolean J3;
    public View J4;
    public TLRPC.UserFull K;
    public int K0;
    public cf K1;
    public boolean K2;
    public final jg K3;
    public boolean K4;
    public ci.e4 L;
    public nf L0;
    public boolean L1;
    public int L2;
    public final AnimationNotificationsLocker L3;
    public boolean L4;
    public ci.e4 M;
    public long M0;
    public AnimatorSet M1;
    public boolean M2;
    public final Paint M3;
    public boolean M4;
    public ci.e4 N;
    public mf N0;
    public RecordCircle N1;
    public final int[] N2;
    public Drawable N3;
    public td N4;
    public boolean O;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout O0;
    public sg O1;
    public final Activity O2;
    public Drawable O3;
    public final pq[] O4;
    public boolean P;
    public final ImageView P0;
    public final xe P1;
    public final org.telegram.ui.wn P2;
    public Drawable P3;
    public int P4;
    public int Q;
    public final oe Q0;
    public final Paint Q1;
    public long Q2;
    public Drawable Q3;
    public int Q4;
    public AccountInstance R;
    public final ImageView R0;
    public int R1;
    public boolean R2;
    public Drawable R3;
    public boolean R4;
    public boolean S;
    public cf S0;
    public td S1;
    public int S2;
    public final RectF S3;
    public long S4;
    public int T;
    public boolean T0;
    public int T1;
    public MessageObject T2;
    public final Rect T3;
    public BotForumHelper.SteamingSendButtonState T4;
    public org.telegram.ui.ActionBar.o1 U;
    public eg U0;
    public bm0 U1;
    public MessageObject U2;
    public final Rect U3;
    public org.telegram.ui.Cells.c6 U4;
    public td V;
    public AnimatorSet V0;
    public Editable V1;
    public org.telegram.ui.mn V2;
    public Drawable V3;
    public int V4;
    public kd W;
    public boolean W0;
    public boolean W1;
    public MessageObject W2;
    public final org.telegram.ui.ActionBar.d6 W3;
    public int W4;
    public boolean X0;
    public boolean X1;
    public TLRPC.WebPage X2;
    public final boolean X3;
    public a0.i X4;
    public xg Y0;
    public boolean Y1;
    public boolean Y2;
    public final bf Y3;
    public final Paint Y4;
    public final ve Z0;
    public MessageObject Z1;
    public og Z2;
    public final ke Z3;
    public final LinearGradient Z4;
    public int a;
    public boolean a0;
    public boolean a1;
    public boolean a2;
    public gg a3;
    public final ke a4;
    public final Matrix a5;
    public boolean b;
    public NumberTextView b0;
    public final we b1;
    public TL_account.TL_businessChatLink b2;
    public TLRPC.TL_document b3;
    public final ke b4;
    public final e6 b5;
    public org.telegram.ui.ActionBar.e1 c;
    public int c0;
    public boolean c1;
    public kg c2;
    public String c3;
    public final ke c4;
    public final e6 c5;
    public LinearLayout d;
    public int d0;
    public ai.w5 d1;
    public TLRPC.ChatFull d2;
    public MessageObject d3;
    public final ke d4;
    public ph.f d5;
    public CharSequence e;
    public or e0;
    public le e1;
    public boolean e2;
    public VideoEditedInfo e3;
    public boolean e4;
    public jh.h e5;
    public String f;
    public Runnable f0;
    public i81 f1;
    public int f2;
    public boolean f3;
    public long f4;
    public final le.f f5;
    public boolean g0;
    public lj0 g1;
    public boolean g2;
    public boolean g3;
    public float g4;
    public final le.c g5;
    public float h;
    public boolean h0;
    public rk0 h1;
    public boolean h2;
    public boolean h3;
    public float h4;
    public final le.c h5;
    public String i0;
    public long i1;
    public boolean i2;
    public MessageObject i3;
    public float i4;
    public final le.c i5;
    public String j0;
    public boolean j1;
    public boolean j2;
    public TL_keyboard.KeyboardButtonProto j3;
    public float j4;
    public float j5;
    public ei.f4 k0;
    public SlideTextView k1;
    public boolean k2;
    public boolean k3;
    public float k4;
    public float k5;
    public ei.c0 l0;
    public ug l1;
    public boolean l2;
    public boolean l3;
    public float l4;
    public boolean l5;
    public of m0;
    public final aw0 m1;
    public MessageObject m2;
    public boolean m3;
    public float m4;
    public int m5;
    public float n;
    public ei.b0 n0;
    public ViewGroup n1;
    public TLRPC.TL_replyKeyboardMarkup n2;
    public boolean n3;
    public float n4;
    public boolean o0;
    public int o1;
    public int o2;
    public int o3;
    public float o4;
    public jp0 p0;
    public final org.telegram.ui.xd p1;
    public boolean p2;
    public boolean p3;
    public float p4;
    public ff q0;
    public ViewPropertyAnimator q1;
    public PowerManager.WakeLock q2;
    public boolean q3;
    public float q4;
    public float r;
    public je r0;
    public final hg.l r1;
    public AnimatorSet r2;
    public final bf r3;
    public boolean r4;
    public float s;
    public int s0;
    public final i0 s1;
    public AnimatorSet s2;
    public final jf s3;
    public boolean s4;
    public int t0;
    public final ImageView t1;
    public AnimatorSet t2;
    public final org.telegram.ui.Cells.d1 t3;
    public int t4;
    public je u0;
    public final ImageView u1;
    public AnimatorSet u2;
    public final uf u3;
    public long u4;
    public boolean v;
    public ValueAnimator v0;
    public float v1;
    public int v2;
    public final xf v3;
    public boolean v4;
    public Runnable w;
    public float w0;
    public ImageView w1;
    public int w2;
    public final Paint w3;
    public ValueAnimator w4;
    public float x;
    public boolean x0;
    public cf x1;
    public int x2;
    public boolean x3;
    public boolean x4;
    public float y;
    public boolean y0;
    public final ne y1;
    public int y2;
    public boolean y3;
    public boolean y4;
    public boolean z0;
    public final le z1;
    public boolean z2;
    public boolean z3;
    public boolean z4;

    /* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
    public class RecordCircle extends View {
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
        public final ba h;
        public final ba n;
        public final float r;
        public final float s;
        public final RectF v;
        public boolean w;
        public final tg x;
        public int y;

        public RecordCircle(Context context) {
            super(context);
            ba baVar = new ba(11, LiteMode.FLAGS_CHAT);
            this.h = baVar;
            ba baVar2 = new ba(12, LiteMode.FLAGS_CHAT);
            this.n = baVar2;
            this.r = AndroidUtilities.dpf2(41.0f);
            this.s = AndroidUtilities.dp(30.0f);
            this.v = new RectF();
            this.H = 0.0f;
            this.I = true;
            tg tgVar = new tg(this, this);
            this.x = tgVar;
            r0.i0.k(this, tgVar);
            baVar.a = AndroidUtilities.dp(47.0f);
            baVar.b = AndroidUtilities.dp(55.0f);
            baVar.b();
            baVar2.a = AndroidUtilities.dp(47.0f);
            baVar2.b = AndroidUtilities.dp(55.0f);
            baVar2.b();
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
            int i10 = org.telegram.ui.ActionBar.h6.bf;
            int i02 = chatActivityEnterView.i0(i10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(i02, mode));
            chatActivityEnterView.Q3 = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            chatActivityEnterView.Q3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i10), mode));
            chatActivityEnterView.R3 = getResources().getDrawable(R.drawable.attach_send).mutate();
            chatActivityEnterView.R3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i10), mode));
            chatActivityEnterView.N3 = getResources().getDrawable(R.drawable.input_mic).mutate();
            Drawable drawable2 = chatActivityEnterView.N3;
            int i11 = org.telegram.ui.ActionBar.h6.Wk;
            drawable2.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i11), mode));
            chatActivityEnterView.O3 = getResources().getDrawable(R.drawable.input_video).mutate();
            chatActivityEnterView.O3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i11), mode));
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
                drawable.setAlpha(255);
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
            chatActivityEnterView.x0();
            chatActivityEnterView.m4 = 0.0f;
            chatActivityEnterView.h4 = 0.0f;
            chatActivityEnterView.g4 = 0.0f;
            chatActivityEnterView.e4 = false;
            this.f = 0.0f;
            chatActivityEnterView.r4 = false;
            sg sgVar = chatActivityEnterView.O1;
            if (sgVar != null) {
                sgVar.invalidate();
            }
        }

        public final void d() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.s4 = false;
            invalidate();
            sg sgVar = chatActivityEnterView.O1;
            if (sgVar != null) {
                sgVar.invalidate();
            }
        }

        @Override // android.view.View
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            return super.dispatchHoverEvent(motionEvent) || this.x.f(motionEvent);
        }

        public final void e() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.M3;
            int i10 = org.telegram.ui.ActionBar.h6.cf;
            paint.setColor(chatActivityEnterView.i0(i10));
            this.h.d.setColor(i0.a.k(chatActivityEnterView.i0(i10), 38));
            this.n.d.setColor(i0.a.k(chatActivityEnterView.i0(i10), 76));
            this.y = chatActivityEnterView.M3.getAlpha();
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
            sg sgVar = ChatActivityEnterView.this.O1;
            if (sgVar != null) {
                sgVar.invalidate();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:119:0x04e7  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x04db  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x02f6  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x0286  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x023b  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x01dc  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0276  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x029f  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x02f3  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0316  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x032c  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x03a8  */
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
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            Paint paint;
            float f19;
            float f20;
            Drawable drawable;
            Drawable drawable2;
            boolean isEnabled;
            int i10;
            Drawable drawable3;
            Paint paint2;
            float f21;
            Drawable drawable4;
            Drawable drawable5;
            rk0 rk0Var;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Rect rect = chatActivityEnterView.T3;
            Paint paint3 = chatActivityEnterView.M3;
            if (this.N) {
                return;
            }
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp2(26.0f);
            int dp = (int) (AndroidUtilities.dp(170.0f) + 0.0f);
            this.J = chatActivityEnterView.t4 + measuredWidth;
            float f22 = dp;
            this.K = f22;
            float f23 = chatActivityEnterView.h4;
            float f24 = f23 <= 0.5f ? f23 / 0.5f : f23 <= 0.75f ? 1.0f - (((f23 - 0.5f) / 0.25f) * 0.1f) : (((f23 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
            long currentTimeMillis = System.currentTimeMillis() - this.d;
            float f25 = this.b;
            float f26 = this.a;
            if (f25 != f26) {
                f7 = 0.25f;
                float f27 = this.c;
                f10 = 1.0f;
                float f28 = (currentTimeMillis * f27) + f26;
                this.a = f28;
                if (f27 > 0.0f) {
                    if (f28 > f25) {
                        this.a = f25;
                    }
                } else if (f28 < f25) {
                    this.a = f25;
                }
                invalidate();
            } else {
                f7 = 0.25f;
                f10 = 1.0f;
            }
            float interpolation = ((this.s * this.a) + this.r) * f24 * (chatActivityEnterView.r4 ? rr.g.getInterpolation(f10 - chatActivityEnterView.j4) * 0.7f : (chatActivityEnterView.j4 * 0.3f) + 0.7f);
            this.e = 0.0f;
            float f29 = chatActivityEnterView.p4;
            if (f29 == 0.0f || chatActivityEnterView.h1 == null) {
                float f30 = chatActivityEnterView.m4;
                if (f30 != 0.0f) {
                    float f31 = f30 > 0.6f ? 1.0f : f30 / 0.6f;
                    if (!chatActivityEnterView.g0) {
                        f30 = Math.max(0.0f, (f30 - 0.6f) / 0.4f);
                    }
                    rr rrVar = rr.j;
                    float interpolation2 = rrVar.getInterpolation(f31);
                    float interpolation3 = rrVar.getInterpolation(f30);
                    interpolation = (1.0f - interpolation3) * ((AndroidUtilities.dp(16.0f) * interpolation2) + interpolation);
                    if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                        float f32 = chatActivityEnterView.m4;
                        if (f32 > 0.6f) {
                            f14 = interpolation2;
                            f13 = Math.max(0.0f, 1.0f - ((f32 - 0.6f) / 0.4f));
                            f12 = interpolation3;
                            f11 = 0.0f;
                        }
                    }
                    f12 = interpolation3;
                    f14 = interpolation2;
                    f11 = 0.0f;
                } else {
                    f11 = 0.0f;
                    f12 = 0.0f;
                    f13 = 1.0f;
                    f14 = 0.0f;
                }
                if (chatActivityEnterView.r4) {
                    float f33 = chatActivityEnterView.j4;
                    if (f33 > 0.7f) {
                        f13 *= 1.0f - ((f33 - 0.7f) / 0.3f);
                    }
                }
                if (this.e <= 0.0f) {
                    f15 = 0.7f;
                    f16 = 0.0f;
                    paint3.setColor(i0.a.d(this.e, chatActivityEnterView.i0(org.telegram.ui.ActionBar.h6.cf), chatActivityEnterView.i0(org.telegram.ui.ActionBar.h6.kf)));
                } else {
                    f15 = 0.7f;
                    f16 = 0.0f;
                    paint3.setColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.h6.cf));
                }
                a();
                Drawable drawable6 = null;
                if (chatActivityEnterView.s4) {
                    f17 = interpolation;
                    f18 = f11;
                    paint = paint3;
                    f19 = f12;
                    f20 = 12.0f;
                    drawable = chatActivityEnterView.c1 ? chatActivityEnterView.Q3 : chatActivityEnterView.P3;
                    rect.set(measuredWidth - AndroidUtilities.dp(12.0f), dp - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + measuredWidth, AndroidUtilities.dp(12.0f) + dp);
                    drawable2 = null;
                } else {
                    float f34 = this.f;
                    if (f34 != 1.0f) {
                        f20 = 12.0f;
                        float f35 = (currentTimeMillis / 150.0f) + f34;
                        this.f = f35;
                        if (f35 > 1.0f) {
                            this.f = 1.0f;
                        }
                        drawable6 = chatActivityEnterView.c1 ? chatActivityEnterView.Q3 : chatActivityEnterView.P3;
                    } else {
                        f20 = 12.0f;
                    }
                    Drawable drawable7 = drawable6;
                    drawable = chatActivityEnterView.R3;
                    f19 = f12;
                    f18 = f11;
                    paint = paint3;
                    f17 = interpolation;
                    rect.set(org.telegram.messenger.ok.z(2, measuredWidth, drawable), org.telegram.messenger.ok.d(2, dp, drawable), org.telegram.ui.Cells.c1.t(2, measuredWidth, drawable), org.telegram.ui.Cells.c1.d(2, dp, drawable));
                    if (drawable7 != null) {
                        drawable7.setBounds(org.telegram.messenger.ok.z(2, measuredWidth, drawable7), org.telegram.messenger.ok.d(2, dp, drawable7), org.telegram.ui.Cells.c1.t(2, measuredWidth, drawable7), org.telegram.ui.Cells.c1.d(2, dp, drawable7));
                    }
                    drawable2 = drawable7;
                }
                drawable.setBounds(rect);
                if (this.w) {
                    float f36 = chatActivityEnterView.o4 - 0.01f;
                    chatActivityEnterView.o4 = f36;
                    if (f36 < f16) {
                        this.w = true;
                        chatActivityEnterView.o4 = 0.0f;
                    }
                } else {
                    float f37 = chatActivityEnterView.o4 + 0.01f;
                    chatActivityEnterView.o4 = f37;
                    if (f37 > 1.0f) {
                        this.w = false;
                        chatActivityEnterView.o4 = 1.0f;
                    }
                }
                isEnabled = LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                ba baVar = this.n;
                ba baVar2 = this.h;
                if (isEnabled) {
                    baVar2.a = AndroidUtilities.dp(47.0f);
                    baVar2.b = (AndroidUtilities.dp(15.0f) * 0.6f) + AndroidUtilities.dp(47.0f);
                    baVar.a = AndroidUtilities.dp(50.0f);
                    baVar.b = (AndroidUtilities.dp(f20) * 0.6f) + AndroidUtilities.dp(50.0f);
                    baVar.f(currentTimeMillis);
                    baVar.e(baVar.t, 1.01f);
                    baVar2.f(currentTimeMillis);
                    baVar2.e(baVar2.t, 1.02f);
                }
                this.d = System.currentTimeMillis();
                float f38 = chatActivityEnterView.j4;
                float f39 = f38 <= f15 ? 1.0f : f38 / f15;
                if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT) && f18 != 1.0f && f19 < 0.4f && f39 > 0.0f && !chatActivityEnterView.r4) {
                    if (this.I) {
                        float f40 = this.H;
                        if (f40 != 1.0f) {
                            float f41 = f40 + 0.04f;
                            this.H = f41;
                            if (f41 > 1.0f) {
                                this.H = 1.0f;
                            }
                        }
                    }
                    if (!this.M) {
                        float interpolation4 = rr.g.getInterpolation(this.H);
                        canvas.save();
                        float f42 = 1.0f - f14;
                        float B = com.google.android.gms.internal.vision.e2.B(baVar.t, 1.4f, 0.878f, com.google.android.gms.internal.vision.e2.C(chatActivityEnterView.h4, f42, f39, interpolation4));
                        canvas.scale(B, B, chatActivityEnterView.t4 + measuredWidth, f22);
                        baVar.a(chatActivityEnterView.t4 + measuredWidth, f22, canvas, baVar.d);
                        canvas.restore();
                        float C = ((baVar2.t * 1.4f) + 0.926f) * com.google.android.gms.internal.vision.e2.C(chatActivityEnterView.h4, f42, f39, interpolation4);
                        canvas.save();
                        canvas.scale(C, C, chatActivityEnterView.t4 + measuredWidth, f22);
                        baVar2.a(chatActivityEnterView.t4 + measuredWidth, f22, canvas, baVar2.d);
                        canvas.restore();
                    }
                }
                float max = (chatActivityEnterView.r4 || chatActivityEnterView.j4 >= 1.0f) ? f17 : Math.max(f17, AndroidUtilities.dp(19.0f));
                if (this.M) {
                    paint2 = paint;
                    paint2.setAlpha((int) (this.y * f13));
                    if (chatActivityEnterView.h4 == 1.0f) {
                        if (chatActivityEnterView.p4 == 0.0f) {
                            drawable4 = drawable2;
                            i10 = measuredWidth;
                            drawable5 = drawable;
                            f21 = 1.0f;
                            canvas.drawCircle(i10 + chatActivityEnterView.t4, f22, max, paint2);
                        } else if (chatActivityEnterView.c1 || this.e <= 0.0f || (rk0Var = chatActivityEnterView.h1) == null) {
                            drawable4 = drawable2;
                            i10 = measuredWidth;
                            drawable5 = drawable;
                            f21 = 1.0f;
                            canvas.drawCircle(i10 + chatActivityEnterView.t4, f22, (1.0f - this.e) * max, paint2);
                        } else {
                            float f43 = f22 + max;
                            float f44 = f22 - max;
                            float f45 = chatActivityEnterView.t4 + measuredWidth;
                            float f46 = f45 + max;
                            float f47 = f45 - max;
                            drawable4 = drawable2;
                            int i11 = 0;
                            int i12 = 0;
                            for (View view = (View) rk0Var.getParent(); view != getParent(); view = (View) view.getParent()) {
                                i12 = (int) (view.getY() + i12);
                                i11 = (int) (view.getX() + i11);
                            }
                            float f48 = i12;
                            float y3 = (rk0Var.getY() + f48) - getY();
                            float y10 = ((rk0Var.getY() + rk0Var.getMeasuredHeight()) + f48) - getY();
                            float f49 = i11;
                            float x10 = (((rk0Var.getX() + rk0Var.getMeasuredWidth()) + f49) - getX()) - chatActivityEnterView.I;
                            float x11 = ((rk0Var.getX() + f49) - getX()) + chatActivityEnterView.I;
                            i10 = measuredWidth;
                            float measuredHeight = chatActivityEnterView.c1 ? 0.0f : rk0Var.getMeasuredHeight() / 2.0f;
                            drawable5 = drawable;
                            float lerp = AndroidUtilities.lerp(f44, y3, this.e);
                            float lerp2 = AndroidUtilities.lerp(f43, y10, this.e);
                            float lerp3 = AndroidUtilities.lerp(f47, x11, this.e);
                            float lerp4 = AndroidUtilities.lerp(f46, x10, this.e);
                            AndroidUtilities.lerp(max, measuredHeight, this.e);
                            RectF rectF = this.v;
                            rectF.set(lerp3, lerp, lerp4, lerp2);
                            chatActivityEnterView.h1.a(canvas, rectF);
                            f21 = 1.0f;
                        }
                        canvas.save();
                        canvas.translate(chatActivityEnterView.t4, 0.0f);
                        drawable3 = drawable5;
                        drawable2 = drawable4;
                        b(canvas, drawable3, drawable2, this.f, (int) org.telegram.messenger.f0.z(f21, f18, f21 - f19, 255.0f));
                        canvas.restore();
                        if (chatActivityEnterView.h4 != f21) {
                            canvas.drawCircle(i10 + chatActivityEnterView.t4, f22, max, paint2);
                            float f50 = chatActivityEnterView.r4 ? f21 - chatActivityEnterView.j4 : 1.0f;
                            canvas.save();
                            canvas.translate(chatActivityEnterView.t4, 0.0f);
                            b(canvas, drawable3, drawable2, this.f, (int) (f50 * 255.0f));
                            canvas.restore();
                        }
                        this.L = max;
                    }
                    i10 = measuredWidth;
                    drawable3 = drawable;
                } else {
                    i10 = measuredWidth;
                    drawable3 = drawable;
                    paint2 = paint;
                }
                f21 = 1.0f;
                if (chatActivityEnterView.h4 != f21) {
                }
                this.L = max;
            }
            float f51 = f29 > 0.38f ? 1.0f : f29 / 0.38f;
            float max2 = f29 > 0.63f ? 1.0f : Math.max(0.0f, (f29 - 0.38f) / f7);
            this.e = Math.max(0.0f, ((chatActivityEnterView.p4 - 0.38f) - f7) / 0.37f);
            rr rrVar2 = rr.j;
            float interpolation5 = rrVar2.getInterpolation(f51);
            f11 = rrVar2.getInterpolation(max2);
            this.e = rrVar2.getInterpolation(this.e);
            float dp2 = (AndroidUtilities.dp(16.0f) * interpolation5) + interpolation;
            float dp3 = AndroidUtilities.dp(8.0f);
            interpolation = com.google.android.gms.internal.vision.e2.z(1.0f, f11, dp2 - dp3, dp3);
            f14 = interpolation5;
            f12 = 0.0f;
            f13 = 1.0f;
            if (chatActivityEnterView.r4) {
            }
            if (this.e <= 0.0f) {
            }
            a();
            Drawable drawable62 = null;
            if (chatActivityEnterView.s4) {
            }
            drawable.setBounds(rect);
            if (this.w) {
            }
            isEnabled = LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
            ba baVar3 = this.n;
            ba baVar22 = this.h;
            if (isEnabled) {
            }
            this.d = System.currentTimeMillis();
            float f382 = chatActivityEnterView.j4;
            if (f382 <= f15) {
            }
            if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                if (this.I) {
                }
                if (!this.M) {
                }
            }
            float max3 = (chatActivityEnterView.r4 || chatActivityEnterView.j4 >= 1.0f) ? f17 : Math.max(f17, AndroidUtilities.dp(19.0f));
            if (this.M) {
            }
            f21 = 1.0f;
            if (chatActivityEnterView.h4 != f21) {
            }
            this.L = max3;
        }

        @Override // android.view.View
        public final void onMeasure(int i10, int i11) {
            View.MeasureSpec.getSize(i10);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(194.0f), TLObject.FLAG_30));
            float measuredWidth = getMeasuredWidth() * 0.35f;
            if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                measuredWidth = AndroidUtilities.dp(140.0f);
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.t4 = (int) ((1.0f - chatActivityEnterView.j4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.n.d((float) (Math.min(1800.0d, d) / 1800.0d), true);
            this.h.d((float) (Math.min(1800.0d, d) / 1800.0d), false);
            float min = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.b = min;
            this.c = (min - this.a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f7) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.i4 = f7;
            sg sgVar = chatActivityEnterView.O1;
            if (sgVar != null) {
                sgVar.invalidate();
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

    /* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
    public class SlideTextView extends View {
        public final int E;
        public final Path F;
        public StaticLayout G;
        public StaticLayout H;
        public boolean I;
        public boolean J;
        public final Rect K;
        public org.telegram.ui.Cells.z L;
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
        public float v;
        public float w;
        public boolean x;
        public long y;

        public SlideTextView(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.c = paint;
            this.w = 0.0f;
            this.F = new Path();
            this.K = new Rect();
            boolean z10 = AndroidUtilities.displaySize.x <= AndroidUtilities.dp(320.0f);
            this.N = z10;
            TextPaint textPaint = new TextPaint(1);
            this.a = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(z10 ? 13.0f : 15.0f));
            TextPaint textPaint2 = new TextPaint(1);
            this.b = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint2.setTypeface(AndroidUtilities.bold());
            int i10 = org.telegram.ui.ActionBar.h6.Wk;
            int i11 = ChatActivityEnterView.n5;
            paint.setColor(ChatActivityEnterView.this.i0(i10));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dpf2(z10 ? 1.0f : 1.6f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String string = LocaleController.getString(R.string.SlideToCancel2);
            this.d = string;
            String upperCase = LocaleController.getString("Cancel", R.string.Cancel).toUpperCase();
            this.e = upperCase;
            this.E = string.indexOf(upperCase);
            a();
        }

        public final void a() {
            int i10 = org.telegram.ui.ActionBar.h6.nf;
            int i11 = ChatActivityEnterView.n5;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int i02 = chatActivityEnterView.i0(i10);
            this.a.setColor(i02);
            int i12 = org.telegram.ui.ActionBar.h6.mf;
            int i03 = chatActivityEnterView.i0(i12);
            this.b.setColor(i03);
            this.s = r2.getAlpha();
            this.v = r4.getAlpha();
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.h6.h0(AndroidUtilities.dp(60.0f), 0, i0.a.k(chatActivityEnterView.i0(i12), 26));
            this.L = h02;
            h02.setCallback(this);
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
            org.telegram.ui.Cells.z zVar = this.L;
            if (zVar != null) {
                zVar.jumpToCurrentState();
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
            int dp = AndroidUtilities.dp(16.0f) + staticLayout.getWidth();
            int i02 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.h6.nf);
            TextPaint textPaint = this.a;
            textPaint.setColor(i02);
            textPaint.setAlpha((int) ((1.0f - this.n) * this.s * this.r));
            this.b.setAlpha((int) (this.v * this.n));
            int color = textPaint.getColor();
            Paint paint = this.c;
            paint.setColor(color);
            boolean z10 = this.N;
            if (z10) {
                this.w = AndroidUtilities.dp(16.0f);
            } else {
                long currentTimeMillis = System.currentTimeMillis() - this.y;
                this.y = System.currentTimeMillis();
                if (this.n == 0.0f && this.r > 0.8f) {
                    if (this.x) {
                        float dp2 = ((AndroidUtilities.dp(3.0f) / 250.0f) * currentTimeMillis) + this.w;
                        this.w = dp2;
                        if (dp2 > AndroidUtilities.dp(6.0f)) {
                            this.w = AndroidUtilities.dp(6.0f);
                            this.x = false;
                        }
                    } else {
                        float dp3 = this.w - ((AndroidUtilities.dp(3.0f) / 250.0f) * currentTimeMillis);
                        this.w = dp3;
                        if (dp3 < (-AndroidUtilities.dp(6.0f))) {
                            this.w = -AndroidUtilities.dp(6.0f);
                            this.x = true;
                        }
                    }
                }
            }
            int i10 = this.E;
            boolean z11 = i10 >= 0;
            int dp4 = AndroidUtilities.dp(5.0f) + ((int) ((getMeasuredWidth() - this.f) / 2.0f));
            int measuredWidth = (int) ((getMeasuredWidth() - this.h) / 2.0f);
            float primaryHorizontal = z11 ? this.G.getPrimaryHorizontal(i10) : 0.0f;
            if (z11) {
                f7 = 16.0f;
                f10 = (dp4 + primaryHorizontal) - measuredWidth;
            } else {
                f7 = 16.0f;
                f10 = 0.0f;
            }
            float f13 = dp4;
            float f14 = this.w;
            float f15 = this.n;
            float dp5 = (((((1.0f - f15) * f14) * this.r) + f13) - (f10 * f15)) + AndroidUtilities.dp(f7);
            float dp6 = z11 ? 0.0f : this.n * AndroidUtilities.dp(12.0f);
            if (this.n != 1.0f) {
                f11 = 12.0f;
                int translationX = (int) ((chatActivityEnterView.N1.getTranslationX() * 0.3f) + ((1.0f - this.r) * ((-getMeasuredWidth()) / 4)));
                canvas.save();
                xg xgVar = chatActivityEnterView.Y0;
                f12 = 2.0f;
                canvas.clipRect((xgVar == null ? 0.0f : xgVar.getLeftProperty()) + AndroidUtilities.dp(4.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.save();
                int i11 = (int) dp5;
                canvas.translate((i11 - AndroidUtilities.dp(z10 ? 7.0f : 10.0f)) + translationX, dp6);
                canvas.drawPath(this.F, paint);
                canvas.restore();
                canvas.save();
                canvas.translate(i11 + translationX, ((getMeasuredHeight() - this.G.getHeight()) / 2.0f) + dp6);
                this.G.draw(canvas);
                canvas.restore();
                canvas.restore();
            } else {
                f11 = 12.0f;
                f12 = 2.0f;
            }
            float measuredHeight = (getMeasuredHeight() - this.H.getHeight()) / f12;
            if (!z11) {
                measuredHeight -= AndroidUtilities.dp(f11) - dp6;
            }
            float f16 = z11 ? dp5 + primaryHorizontal : measuredWidth;
            Rect rect = this.K;
            rect.set((int) f16, (int) measuredHeight, (int) (this.H.getWidth() + f16), (int) (this.H.getHeight() + measuredHeight));
            rect.inset(-AndroidUtilities.dp(f7), -AndroidUtilities.dp(f7));
            if (this.n > 0.0f) {
                this.L.setBounds((getMeasuredWidth() / 2) - dp, (getMeasuredHeight() / 2) - dp, (getMeasuredWidth() / 2) + dp, (getMeasuredHeight() / 2) + dp);
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
                this.y = System.currentTimeMillis();
                int measuredHeight2 = getMeasuredHeight() >> 1;
                Path path = this.F;
                path.reset();
                if (this.N) {
                    float f7 = measuredHeight2;
                    path.setLastPoint(AndroidUtilities.dpf2(2.5f), f7 - AndroidUtilities.dpf2(3.12f));
                    path.lineTo(0.0f, f7);
                    path.lineTo(AndroidUtilities.dpf2(2.5f), AndroidUtilities.dpf2(3.12f) + f7);
                } else {
                    float f10 = measuredHeight2;
                    path.setLastPoint(AndroidUtilities.dpf2(4.0f), f10 - AndroidUtilities.dpf2(5.0f));
                    path.lineTo(0.0f, f10);
                    path.lineTo(AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(5.0f) + f10);
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
                long j3 = 0;
                if (chatActivityEnterView.e2 && chatActivityEnterView.c1) {
                    CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                    chatActivityEnterView.Z2.k2(5, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.S4, 0L, true);
                    ye yeVar = chatActivityEnterView.J0;
                    chatActivityEnterView.S4 = 0L;
                    yeVar.setEffect(0L);
                } else {
                    chatActivityEnterView.Z2.a1(0);
                    MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                }
                chatActivityEnterView.b3 = null;
                chatActivityEnterView.d3 = null;
                chatActivityEnterView.e3 = null;
                chatActivityEnterView.i1 = 0L;
                chatActivityEnterView.F2 = false;
                MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                long j10 = chatActivityEnterView.Q2;
                org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
                if (wnVar != null && wnVar.h4) {
                    j3 = wnVar.d();
                }
                mediaDataController.pushDraftVoiceMessage(j10, j3, null);
                chatActivityEnterView.L1(2, true);
                chatActivityEnterView.K(true);
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

    public ChatActivityEnterView(Activity activity, aw0 aw0Var, org.telegram.ui.wn wnVar, boolean z10, final org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        int i10;
        String str;
        og ogVar;
        this.h = 1.0f;
        this.n = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        this.E = 1.0f;
        this.F = 1.0f;
        this.I = 0.0f;
        final int i11 = 1;
        this.J = true;
        int i12 = UserConfig.selectedAccount;
        this.Q = i12;
        this.R = AccountInstance.getInstance(i12);
        this.T = 1;
        this.c0 = -1;
        this.m5 = 1;
        this.x0 = true;
        this.y0 = true;
        this.z0 = true;
        this.B0 = new HashMap();
        new qe(0);
        this.C0 = false;
        this.D0 = false;
        this.v1 = 1.0f;
        this.f2 = -1;
        this.j2 = true;
        this.D2 = -1.0f;
        this.E2 = AndroidUtilities.dp(80.0f);
        this.N2 = new int[2];
        this.Y2 = true;
        this.o3 = -1;
        this.q3 = true;
        this.r3 = new bf(this, 0);
        this.s3 = new jf(this);
        this.t3 = new org.telegram.ui.Cells.d1(Integer.class, "translationY", 1);
        this.u3 = new uf(Float.class, "scale");
        this.v3 = new xf(Float.class, "controlsScale");
        this.w3 = new Paint(1);
        this.H3 = new bf(this, i11);
        this.K3 = new jg(this);
        this.L3 = new AnimationNotificationsLocker();
        this.M3 = new Paint(1);
        this.S3 = new RectF();
        this.T3 = new Rect();
        this.U3 = new Rect();
        this.Y3 = new bf(this, 2);
        this.Z3 = new ke(this, 0);
        this.a4 = new ke(this, 1);
        this.b4 = new ke(this, 2);
        this.c4 = new ke(this, 3);
        this.d4 = new ke(this, 4);
        this.x4 = true;
        this.y4 = true;
        this.B4 = new Paint();
        this.C4 = 1.0f;
        this.D4 = new Rect();
        this.F4 = new td(this, 7);
        this.I4 = true;
        this.O4 = new pq[1];
        this.T4 = BotForumHelper.SteamingSendButtonState.NO_STREAMING;
        this.V4 = -1;
        Paint paint = new Paint(1);
        this.Y4 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.Z4 = linearGradient;
        this.a5 = new Matrix();
        rr rrVar = rr.h;
        final int i13 = 0;
        this.b5 = new e6(this, 0L, 280L, rrVar);
        this.c5 = new e6(this, 0L, 280L, rrVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        rr rrVar2 = ji.n.V;
        this.f5 = new le.f(0, this, rrVar2, 250L);
        this.g5 = new le.c(1, this, rrVar2, 250L, false);
        this.h5 = new le.c(2, this, rrVar, 320L, false);
        this.i5 = new le.c(3, this, rrVar, 320L, false);
        this.W3 = d6Var;
        this.X3 = z10;
        this.i2 = z10 && !AndroidUtilities.isInMultiwindow && (wnVar == null || !wnVar.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.Q1 = paint2;
        paint2.setColor(i0(org.telegram.ui.ActionBar.h6.af));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.recordStarted);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.recordPaused);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.recordResumed);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.recordStartError);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.recordStopped);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.recordProgressChanged);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.audioDidSent);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.audioRouteChanged);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.messageReceivedByServer2);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.sendingMessagesChanged);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.audioRecordTooShort);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.updateBotMenuButton);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.didUpdatePremiumGiftFieldIcon);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.O2 = activity;
        this.P2 = wnVar;
        if (wnVar != null) {
            this.G2 = wnVar.getClassGuid();
        }
        this.m1 = aw0Var;
        this.n1 = aw0Var;
        aw0Var.setDelegate(this);
        this.B2 = MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false);
        le leVar = new le(this, activity, i13);
        this.z1 = leVar;
        leVar.setClipChildren(false);
        leVar.setClipToPadding(false);
        leVar.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
        addView(leVar, w7.y5.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        ne neVar = new ne(this, activity);
        this.y1 = neVar;
        neVar.setClipChildren(false);
        leVar.addView(neVar, w7.y5.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        oe oeVar = new oe(this, activity);
        this.Q0 = oeVar;
        oeVar.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        oeVar.setFocusable(true);
        int dp = AndroidUtilities.dp(7.5f);
        oeVar.setPadding(dp, dp, dp, dp);
        int i14 = org.telegram.ui.ActionBar.h6.Wk;
        int i02 = i0(i14);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        oeVar.setColorFilter(new PorterDuffColorFilter(i02, mode));
        int i15 = org.telegram.ui.ActionBar.h6.i6;
        int i03 = i0(i15);
        float dp2 = AndroidUtilities.dp(19.0f);
        int dp3 = AndroidUtilities.dp(1.0f);
        int dp4 = AndroidUtilities.dp(3.0f);
        oeVar.setBackground(org.telegram.ui.ActionBar.h6.W(dp2, i03, dp3, dp4, dp3, dp4));
        oeVar.setOnClickListener(new vd(this, 14));
        neVar.addView(oeVar, w7.y5.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        d1(false, false);
        ImageView imageView = new ImageView(activity);
        this.R0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(i0(i14), mode));
        int i04 = i0(i15);
        float dp5 = AndroidUtilities.dp(19.0f);
        int dp6 = AndroidUtilities.dp(1.0f);
        int dp7 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.W(dp5, i04, dp6, dp7, dp6, dp7));
        imageView.setVisibility(8);
        imageView.setContentDescription(LocaleController.getString(R.string.ArticleDeleteDraft));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fe
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        int i16 = ChatActivityEnterView.n5;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, d6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                        a2Var.R = string;
                        a2Var.T = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new be(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    default:
                        int i17 = ChatActivityEnterView.n5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        org.telegram.ui.wn wnVar2 = chatActivityEnterView2.P2;
                        long a2 = wnVar2 != null ? wnVar2.a() : chatActivityEnterView2.Q2;
                        boolean z11 = chatActivityEnterView2.D1;
                        org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                        if (!z11) {
                            if (chatActivityEnterView2.E0 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), d6Var2);
                                e0Var.m0(chatActivityEnterView2.E0.getText());
                                e0Var.j0 = new de(chatActivityEnterView2, 1);
                                boolean z12 = chatActivityEnterView2.Z1 != null;
                                ee eeVar = new ee(chatActivityEnterView2, a2, d6Var2, 1);
                                e0Var.l0 = a2;
                                e0Var.m0 = z12;
                                e0Var.n0 = eeVar;
                                e0Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.E1 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), d6Var2);
                            e0Var2.n0(chatActivityEnterView2.E1);
                            e0Var2.k0 = new de(chatActivityEnterView2, 0);
                            ee eeVar2 = new ee(chatActivityEnterView2, a2, d6Var2, 0);
                            e0Var2.l0 = a2;
                            e0Var2.o0 = eeVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                }
            }
        });
        neVar.addView(imageView, w7.y5.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            int i16 = wnVar != null ? wnVar.R3 : -1;
            org.telegram.ui.xd xdVar = new org.telegram.ui.xd(activity, 2);
            this.p1 = xdVar;
            xdVar.setOrientation(0);
            xdVar.setEnabled(false);
            xdVar.setClipChildren(false);
            neVar.addView(xdVar, w7.y5.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i16 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.I1 = imageView2;
                or orVar = new or(activity, R.drawable.input_notify_on, i14);
                this.e0 = orVar;
                imageView2.setImageDrawable(orVar);
                this.e0.a(this.g2, false);
                if (this.g2) {
                    i10 = R.string.AccDescrChanSilentOn;
                    str = "AccDescrChanSilentOn";
                } else {
                    i10 = R.string.AccDescrChanSilentOff;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(LocaleController.getString(str, i10));
                imageView2.setColorFilter(new PorterDuffColorFilter(i0(i14), PorterDuff.Mode.MULTIPLY));
                imageView2.setScaleType(scaleType);
                imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(i0(i15), 1, -1));
                imageView2.setVisibility((!this.h2 || ((ogVar = this.Z2) != null && ogVar.C0())) ? 8 : 0);
                xdVar.addView(imageView2, w7.y5.n(44, 44));
                imageView2.setOnClickListener(new pe(this, wnVar, activity));
            }
            hg.l lVar = new hg.l(activity, i11);
            this.r1 = lVar;
            lVar.setScaleType(scaleType);
            lVar.setColorFilter(new PorterDuffColorFilter(i0(i14), PorterDuff.Mode.MULTIPLY));
            lVar.setImageResource(R.drawable.msg_input_attach2);
            lVar.setBackground(org.telegram.ui.ActionBar.h6.f0(i0(i15), 1, -1));
            neVar.addView(lVar, w7.y5.e(44, 44, 85));
            lVar.setOnClickListener(new vd(this, 18));
            lVar.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
            H1(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.t1 = imageView3;
        i0 i0Var = new i0(activity);
        this.s1 = i0Var;
        imageView3.setImageDrawable(i0Var);
        imageView3.setScaleType(scaleType);
        int i05 = i0(i14);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(i05, mode2));
        imageView3.setBackground(org.telegram.ui.ActionBar.h6.f0(i0(i15), 1, AndroidUtilities.dp(16.0f)));
        leVar.addView(imageView3, w7.y5.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.a6.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fe
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        int i162 = ChatActivityEnterView.n5;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, d6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                        a2Var.R = string;
                        a2Var.T = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new be(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    default:
                        int i17 = ChatActivityEnterView.n5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        org.telegram.ui.wn wnVar2 = chatActivityEnterView2.P2;
                        long a2 = wnVar2 != null ? wnVar2.a() : chatActivityEnterView2.Q2;
                        boolean z11 = chatActivityEnterView2.D1;
                        org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                        if (!z11) {
                            if (chatActivityEnterView2.E0 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), d6Var2);
                                e0Var.m0(chatActivityEnterView2.E0.getText());
                                e0Var.j0 = new de(chatActivityEnterView2, 1);
                                boolean z12 = chatActivityEnterView2.Z1 != null;
                                ee eeVar = new ee(chatActivityEnterView2, a2, d6Var2, 1);
                                e0Var.l0 = a2;
                                e0Var.m0 = z12;
                                e0Var.n0 = eeVar;
                                e0Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.E1 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), d6Var2);
                            e0Var2.n0(chatActivityEnterView2.E1);
                            e0Var2.k0 = new de(chatActivityEnterView2, 0);
                            ee eeVar2 = new ee(chatActivityEnterView2, a2, d6Var2, 0);
                            e0Var2.l0 = a2;
                            e0Var2.o0 = eeVar2;
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
        this.u1 = imageView4;
        imageView4.setImageResource(R.drawable.iv_fullscreen);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(i0(i14), mode2));
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.f0(i0(i15), 1, AndroidUtilities.dp(16.0f)));
        leVar.addView(imageView4, w7.y5.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.ArticleEditor));
        w7.a6.a(imageView4);
        imageView4.setOnClickListener(new vd(this, 20));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.b3 != null) {
            X();
        }
        ImageView imageView5 = new ImageView(activity);
        this.B1 = imageView5;
        imageView5.setImageResource(R.drawable.send_outline);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        imageView5.setColorFilter(i0(org.telegram.ui.ActionBar.h6.hl), mode);
        leVar.addView(imageView5, w7.y5.e(44, 44, 85));
        le leVar2 = new le(this, activity, i11);
        this.A1 = leVar2;
        leVar2.setClipChildren(false);
        leVar2.setClipToPadding(false);
        leVar.addView(leVar2, w7.y5.e(100, 44, 85));
        ve veVar = new ve(this, activity, d6Var);
        this.Z0 = veVar;
        veVar.setSoundEffectsEnabled(false);
        leVar2.addView(veVar, w7.y5.e(44, 44, 85));
        veVar.setFocusable(true);
        veVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.N3 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(i0(i14), mode2));
        Drawable mutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.O3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i0(i14), mode2));
        we weVar = new we(this, activity);
        this.b1 = weVar;
        weVar.setImportantForAccessibility(2);
        int dp8 = AndroidUtilities.dp(10.0f);
        weVar.setPadding(dp8, dp8, dp8, dp8);
        veVar.addView(weVar, w7.y5.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.P0 = imageView6;
        int i17 = 4;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        xe xeVar = new xe();
        this.P1 = xeVar;
        imageView6.setImageDrawable(xeVar);
        imageView6.setContentDescription(LocaleController.getString("Cancel", R.string.Cancel));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        imageView6.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(i0(i15), 1, -1));
        leVar2.addView(imageView6, w7.y5.e(44, 44, 85));
        imageView6.setOnClickListener(new vd(this, 0));
        ye yeVar = new ye(this, activity, c() ? R.drawable.input_schedule : R.drawable.send_plane_24, d6Var, 0);
        this.J0 = yeVar;
        yeVar.setVisibility(4);
        yeVar.setContentDescription(LocaleController.getString(R.string.Send));
        int i18 = 0;
        yeVar.setSoundEffectsEnabled(false);
        yeVar.setScaleX(0.1f);
        yeVar.setScaleY(0.1f);
        yeVar.setAlpha(0.0f);
        leVar2.addView(yeVar, w7.y5.e(100, 44, 85));
        yeVar.setOnClickListener(new vd(this, i11));
        yeVar.setOnLongClickListener(new yd(this, i18));
        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            leVar2.setOnLongClickListener(new yd(this, i18));
        }
        gi.a aVar = new gi.a(activity, d6Var);
        this.I0 = aVar;
        aVar.setVisibility(4);
        aVar.setOnClickListener(new vd(this, i17));
        leVar2.addView(aVar, w7.y5.e(44, 44, 85));
        wg wgVar = new wg(activity);
        this.F0 = wgVar;
        org.telegram.ui.ActionBar.h5 h5Var = wgVar.a;
        h5Var.setTextSize(16);
        wgVar.invalidate();
        wgVar.setVisibility(4);
        wgVar.setSoundEffectsEnabled(false);
        wgVar.setScaleX(0.1f);
        wgVar.setScaleY(0.1f);
        wgVar.setAlpha(0.0f);
        wgVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        h5Var.setGravity(21);
        wgVar.invalidate();
        h5Var.setTextColor(i0(i14));
        wgVar.invalidate();
        leVar2.addView(wgVar, w7.y5.e(74, 44, 85));
        wgVar.setOnClickListener(new vd(this, 8));
        wgVar.setOnLongClickListener(new yd(this, i11));
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        this.x2 = globalEmojiSettings.getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.y2 = globalEmojiSettings.getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        k1(false, false);
        K(false);
        F();
        W();
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0132, code lost:
    
        if (r4 != null) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean I(int i10, long j3, org.telegram.ui.ActionBar.m2 m2Var, CharSequence charSequence) {
        z5[] z5VarArr;
        int i11;
        int i12;
        boolean z10;
        TLRPC.ChatFull chatFull;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        ArrayList<TLRPC.StickerSetCovered> arrayList;
        int i13;
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList4;
        ArrayList<TLRPC.Document> arrayList5;
        if (charSequence != null && m2Var != null && !UserConfig.getInstance(i10).isPremium() && UserConfig.getInstance(i10).getClientUserId() != j3 && (charSequence instanceof Spanned) && (z5VarArr = (z5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), z5.class)) != null) {
            int i14 = 0;
            while (i14 < z5VarArr.length) {
                z5 z5Var = z5VarArr[i14];
                if (z5Var != null) {
                    TLRPC.Document document = z5Var.document;
                    if (document == null) {
                        i12 = i10;
                        document = q5.f(i12, z5Var.getDocumentId());
                    } else {
                        i12 = i10;
                    }
                    long documentId = z5VarArr[i14].getDocumentId();
                    if (document == null) {
                        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                        int size = stickerSets.size();
                        int i15 = 0;
                        while (i15 < size) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i15);
                            i15++;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                            if (tL_messages_stickerSet2 != null && (arrayList5 = tL_messages_stickerSet2.documents) != null && !arrayList5.isEmpty()) {
                                ArrayList<TLRPC.Document> arrayList6 = tL_messages_stickerSet2.documents;
                                int size2 = arrayList6.size();
                                int i16 = 0;
                                while (i16 < size2) {
                                    TLRPC.Document document2 = arrayList6.get(i16);
                                    i16++;
                                    z10 = false;
                                    TLRPC.Document document3 = document2;
                                    i11 = i14;
                                    arrayList4 = stickerSets;
                                    if (document3.id == documentId) {
                                        document = document3;
                                        break;
                                    }
                                    stickerSets = arrayList4;
                                    i14 = i11;
                                }
                            }
                            i11 = i14;
                            arrayList4 = stickerSets;
                            z10 = false;
                            if (document != null) {
                                break;
                            }
                            stickerSets = arrayList4;
                            i14 = i11;
                        }
                    }
                    i11 = i14;
                    z10 = false;
                    if (document == null) {
                        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                        int size3 = featuredEmojiSets.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i17);
                            i17++;
                            TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                            if (stickerSetCovered2 != null && (arrayList3 = stickerSetCovered2.covers) != null && !arrayList3.isEmpty()) {
                                ArrayList<TLRPC.Document> arrayList7 = stickerSetCovered2.covers;
                                int size4 = arrayList7.size();
                                int i18 = 0;
                                while (i18 < size4) {
                                    TLRPC.Document document4 = arrayList7.get(i18);
                                    i18++;
                                    TLRPC.Document document5 = document4;
                                    arrayList = featuredEmojiSets;
                                    i13 = size3;
                                    if (document5.id == documentId) {
                                        document = document5;
                                        break;
                                    }
                                    featuredEmojiSets = arrayList;
                                    size3 = i13;
                                }
                            }
                            arrayList = featuredEmojiSets;
                            i13 = size3;
                            if (document != null) {
                                break;
                            }
                            if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetFullCovered) {
                                arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered2).documents;
                            } else {
                                if ((stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) && stickerSetCovered2.set != null) {
                                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                    tL_inputStickerSetID.id = stickerSetCovered2.set.id;
                                    TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, true);
                                    if (stickerSet != null) {
                                        arrayList2 = stickerSet.documents;
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
                            featuredEmojiSets = arrayList;
                            size3 = i13;
                        }
                    }
                    if (document != null && (chatFull = MessagesController.getInstance(i12).getChatFull(-j3)) != null && chatFull.emojiset != null && (groupStickerSetById = MediaDataController.getInstance(i12).getGroupStickerSetById(chatFull.emojiset)) != null) {
                        ArrayList<TLRPC.Document> arrayList8 = groupStickerSetById.documents;
                        int size6 = arrayList8.size();
                        int i20 = 0;
                        while (i20 < size6) {
                            TLRPC.Document document8 = arrayList8.get(i20);
                            i20++;
                            if (document8.id == documentId) {
                                return z10;
                            }
                        }
                    }
                    if (document == null || !MessageObject.isFreeEmoji(document)) {
                        xc.a0(m2Var).q(document, AndroidUtilities.replaceTags(LocaleController.getString("UnlockPremiumEmojiHint", R.string.UnlockPremiumEmojiHint)), LocaleController.getString("PremiumMore", R.string.PremiumMore), new ud(0, m2Var)).j();
                        return true;
                    }
                } else {
                    i11 = i14;
                }
                i14 = i11 + 1;
            }
        }
        return false;
    }

    public static void f(final ChatActivityEnterView chatActivityEnterView, final qv0 qv0Var, int[] iArr, hp0 hp0Var) {
        o1.k kVar;
        Dialog dialog;
        o1.k kVar2;
        int[] iArr2 = chatActivityEnterView.N2;
        if (chatActivityEnterView.q0 == null) {
            return;
        }
        Dialog dialog2 = new Dialog(chatActivityEnterView.getContext(), R.style.TransparentDialogNoAnimation);
        FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
        frameLayout.addView(qv0Var, w7.y5.e(40, 40, 3));
        dialog2.setContentView(frameLayout);
        dialog2.getWindow().setLayout(-1, -1);
        dialog2.getWindow().clearFlags(1024);
        dialog2.getWindow().clearFlags(67108864);
        dialog2.getWindow().clearFlags(TLObject.FLAG_27);
        dialog2.getWindow().addFlags(TLObject.FLAG_31);
        dialog2.getWindow().addFlags(512);
        dialog2.getWindow().addFlags(131072);
        dialog2.getWindow().getAttributes().windowAnimations = 0;
        dialog2.getWindow().getDecorView().setSystemUiVisibility(1792);
        dialog2.getWindow().setStatusBarColor(0);
        dialog2.getWindow().setNavigationBarColor(0);
        AndroidUtilities.setLightStatusBar(dialog2, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.s8, true) == -1);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            AndroidUtilities.setLightNavigationBar(dialog2, AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.a7, true)) >= 0.721f);
        }
        if (i10 >= 23) {
            chatActivityEnterView.s0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.s0;
        }
        chatActivityEnterView.p0.getLocationInWindow(iArr2);
        final float f7 = iArr2[0];
        final float f10 = iArr2[1];
        float dp = AndroidUtilities.dp(5.0f);
        float dp2 = iArr[0] + chatActivityEnterView.s0 + dp + AndroidUtilities.dp(4.0f) + 0.0f;
        float f11 = iArr[1] + chatActivityEnterView.t0 + dp + 0.0f;
        qv0Var.setTranslationX(dp2);
        qv0Var.setTranslationY(f11);
        float scaleX = (chatActivityEnterView.p0.getLayoutParams().width * (chatActivityEnterView.l5 ? chatActivityEnterView.p0.getScaleX() : 1.0f)) / AndroidUtilities.dp(40.0f);
        qv0Var.setPivotX(0.0f);
        qv0Var.setPivotY(0.0f);
        qv0Var.setScaleX(0.75f);
        qv0Var.setScaleY(0.75f);
        qv0Var.getViewTreeObserver().addOnDrawListener(new gf(qv0Var, hp0Var));
        dialog2.show();
        if (!chatActivityEnterView.l5) {
            chatActivityEnterView.p0.setScaleX(1.0f);
            chatActivityEnterView.p0.setScaleY(1.0f);
        }
        chatActivityEnterView.p0.setAlpha(1.0f);
        ff ffVar = chatActivityEnterView.q0;
        boolean z10 = chatActivityEnterView.l5;
        o1.c cVar = o1.h.o;
        if (z10) {
            kVar = null;
        } else {
            o1.k kVar3 = new o1.k(chatActivityEnterView.p0, cVar);
            kVar3.u = org.telegram.ui.Cells.c1.l(0.5f, 750.0f, 1.0f);
            kVar = kVar3;
        }
        boolean z11 = chatActivityEnterView.l5;
        o1.c cVar2 = o1.h.p;
        if (z11) {
            dialog = dialog2;
            kVar2 = null;
        } else {
            dialog = dialog2;
            o1.k kVar4 = new o1.k(chatActivityEnterView.p0, cVar2);
            kVar4.u = org.telegram.ui.Cells.c1.l(0.5f, 750.0f, 1.0f);
            kVar2 = kVar4;
        }
        o1.k kVar5 = new o1.k(chatActivityEnterView.p0, o1.h.t);
        kVar5.u = org.telegram.ui.Cells.c1.l(0.0f, 750.0f, 1.0f);
        final int i11 = 0;
        final Dialog dialog3 = dialog;
        kVar5.a(new o1.f(chatActivityEnterView) { // from class: org.telegram.ui.Components.xd
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = chatActivityEnterView;
            }

            @Override // o1.f
            public final void a(o1.h hVar, boolean z12, float f12, float f13) {
                int i12 = i11;
                float f14 = f10;
                float f15 = f7;
                qv0 qv0Var2 = qv0Var;
                Dialog dialog4 = dialog3;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                int i13 = 0;
                switch (i12) {
                    case 0:
                        int i14 = ChatActivityEnterView.n5;
                        if (dialog4.isShowing()) {
                            qv0Var2.setTranslationX(f15);
                            qv0Var2.setTranslationY(f14);
                            jp0 jp0Var = chatActivityEnterView2.p0;
                            jp0Var.getClass();
                            jp0Var.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.l5) {
                                chatActivityEnterView2.p0.setScaleX(1.0f);
                                chatActivityEnterView2.p0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.p0.setAlpha(1.0f);
                            chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new hf(chatActivityEnterView2, dialog4, i13));
                            break;
                        }
                        break;
                    default:
                        int i15 = ChatActivityEnterView.n5;
                        if (dialog4.isShowing()) {
                            qv0Var2.setTranslationX(f15);
                            qv0Var2.setTranslationY(f14);
                            jp0 jp0Var2 = chatActivityEnterView2.p0;
                            jp0Var2.getClass();
                            jp0Var2.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.l5) {
                                chatActivityEnterView2.p0.setScaleX(1.0f);
                                chatActivityEnterView2.p0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.p0.setAlpha(1.0f);
                            chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new hf(chatActivityEnterView2, dialog4, 1));
                            break;
                        }
                        break;
                }
            }
        });
        o1.k kVar6 = new o1.k(qv0Var, o1.h.m);
        kVar6.b = w7.q.a(dp2, f7 - AndroidUtilities.dp(6.0f), dp2);
        kVar6.c = true;
        kVar6.u = org.telegram.ui.Cells.c1.l(f7, 700.0f, 0.75f);
        kVar6.h = f7 - AndroidUtilities.dp(6.0f);
        o1.k kVar7 = new o1.k(qv0Var, o1.h.n);
        kVar7.b = w7.q.a(f11, f11, AndroidUtilities.dp(6.0f) + f10);
        kVar7.c = true;
        kVar7.u = org.telegram.ui.Cells.c1.l(f10, 700.0f, 0.75f);
        kVar7.g = AndroidUtilities.dp(6.0f) + f10;
        kVar7.b(new kf(f10, qv0Var));
        final int i12 = 1;
        kVar7.a(new o1.f(chatActivityEnterView) { // from class: org.telegram.ui.Components.xd
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = chatActivityEnterView;
            }

            @Override // o1.f
            public final void a(o1.h hVar, boolean z12, float f12, float f13) {
                int i122 = i12;
                float f14 = f10;
                float f15 = f7;
                qv0 qv0Var2 = qv0Var;
                Dialog dialog4 = dialog3;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                int i13 = 0;
                switch (i122) {
                    case 0:
                        int i14 = ChatActivityEnterView.n5;
                        if (dialog4.isShowing()) {
                            qv0Var2.setTranslationX(f15);
                            qv0Var2.setTranslationY(f14);
                            jp0 jp0Var = chatActivityEnterView2.p0;
                            jp0Var.getClass();
                            jp0Var.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.l5) {
                                chatActivityEnterView2.p0.setScaleX(1.0f);
                                chatActivityEnterView2.p0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.p0.setAlpha(1.0f);
                            chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new hf(chatActivityEnterView2, dialog4, i13));
                            break;
                        }
                        break;
                    default:
                        int i15 = ChatActivityEnterView.n5;
                        if (dialog4.isShowing()) {
                            qv0Var2.setTranslationX(f15);
                            qv0Var2.setTranslationY(f14);
                            jp0 jp0Var2 = chatActivityEnterView2.p0;
                            jp0Var2.getClass();
                            jp0Var2.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.l5) {
                                chatActivityEnterView2.p0.setScaleX(1.0f);
                                chatActivityEnterView2.p0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.p0.setAlpha(1.0f);
                            chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new hf(chatActivityEnterView2, dialog4, 1));
                            break;
                        }
                        break;
                }
            }
        });
        o1.k kVar8 = new o1.k(qv0Var, cVar);
        kVar8.u = org.telegram.ui.Cells.c1.l(scaleX, 1000.0f, 1.0f);
        o1.k kVar9 = new o1.k(qv0Var, cVar2);
        kVar9.u = org.telegram.ui.Cells.c1.l(scaleX, 1000.0f, 1.0f);
        ffVar.l(kVar, kVar2, kVar5, kVar6, kVar7, kVar8, kVar9);
    }

    public static void g(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, Long l4, boolean z11) {
        if (chatActivityEnterView.G0 > 0 && !chatActivityEnterView.c()) {
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar != null) {
                wg wgVar = chatActivityEnterView.F0;
                ogVar.t1(wgVar, wgVar.a.getText(), true);
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
        og ogVar2 = chatActivityEnterView.Z2;
        TL_stories.StoryItem d12 = ogVar2 != null ? ogVar2.d1() : null;
        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.Q);
        long j3 = chatActivityEnterView.Q2;
        MessageObject messageObject = chatActivityEnterView.T2;
        MessageObject threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.mn mnVar = chatActivityEnterView.V2;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
        sendMessagesHelper.sendSticker(document, str, j3, messageObject, threadMessage, d12, mnVar, sendAnimationData, z10, i10, i11, z12, obj, wnVar != null ? wnVar.C8() : null, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        og ogVar3 = chatActivityEnterView.Z2;
        if (ogVar3 != null) {
            ogVar3.H(null, true, i10, 0, 0L);
        }
        if (z11) {
            chatActivityEnterView.setFieldText("");
        }
        MediaDataController.getInstance(chatActivityEnterView.Q).addRecentSticker(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MessageObject getThreadMessage() {
        org.telegram.ui.wn wnVar = this.P2;
        if (wnVar != null) {
            return wnVar.X3;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getThreadMessageId() {
        MessageObject messageObject;
        org.telegram.ui.wn wnVar = this.P2;
        if (wnVar == null || (messageObject = wnVar.X3) == null) {
            return 0;
        }
        return messageObject.getId();
    }

    private String getTopicKeyString() {
        org.telegram.ui.wn wnVar = this.P2;
        if (wnVar == null || !wnVar.h4) {
            return "" + this.Q2;
        }
        return this.Q2 + "_" + wnVar.d();
    }

    public static void h(ChatActivityEnterView chatActivityEnterView, TL_keyboard.KeyboardButton keyboardButton) {
        org.telegram.ui.wn wnVar;
        boolean z10 = chatActivityEnterView.T2 != null && (wnVar = chatActivityEnterView.P2) != null && wnVar.h4 && wnVar.d() == ((long) chatActivityEnterView.T2.getId());
        MessageObject messageObject = ((chatActivityEnterView.T2 == null || z10) && !BotForumHelper.isBotForum(chatActivityEnterView.Q, chatActivityEnterView.Q2)) ? DialogObject.isChatDialog(chatActivityEnterView.Q2) ? chatActivityEnterView.m2 : null : chatActivityEnterView.T2;
        MessageObject messageObject2 = chatActivityEnterView.T2;
        if (messageObject2 == null || z10) {
            messageObject2 = chatActivityEnterView.m2;
        }
        boolean c02 = chatActivityEnterView.c0(keyboardButton, messageObject, messageObject2, null);
        if (chatActivityEnterView.T2 == null || z10) {
            MessageObject messageObject3 = chatActivityEnterView.m2;
            if (messageObject3 != null && messageObject3.messageOwner.reply_markup.single_use) {
                if (c02) {
                    chatActivityEnterView.I0();
                } else {
                    chatActivityEnterView.t1(0, 0, true, true);
                }
                MessagesController.getMainSettings(chatActivityEnterView.Q).edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.m2.getId()).commit();
            }
        } else {
            chatActivityEnterView.I0();
            chatActivityEnterView.Z0(chatActivityEnterView.W2, true, false);
        }
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.H(null, true, 0, 0, 0L);
        }
    }

    public static /* synthetic */ void i(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        Activity activity = chatActivityEnterView.O2;
        if (Build.VERSION.SDK_INT < 23 || activity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
            SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendCurrentLocation(messageObject, keyboardButtonProto);
            return;
        }
        activity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
        chatActivityEnterView.i3 = messageObject;
        chatActivityEnterView.j3 = keyboardButtonProto;
    }

    public static void m(ChatActivityEnterView chatActivityEnterView) {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            chatActivityEnterView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(chatActivityEnterView, "lockAnimatedTranslation", chatActivityEnterView.k4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(chatActivityEnterView, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(rr.h);
        ofFloat2.setDuration(250L);
        SharedConfig.removeLockRecordAudioVideoHint();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(chatActivityEnterView, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(chatActivityEnterView.k1, "cancelToProgress", 1.0f));
        animatorSet.start();
    }

    public static CharSequence r(ArrayList arrayList, CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        MediaDataController.sortEntities(arrayList);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i10.a(charSequence, false));
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        if (spans != null && spans.length > 0) {
            for (Object obj : spans) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                try {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i10);
                    if (messageEntity.offset + messageEntity.length <= spannableStringBuilder.length()) {
                        if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            c61 c61Var = new c61("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i11 = messageEntity.offset;
                            spannableStringBuilder.setSpan(c61Var, i11, messageEntity.length + i11, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            c61 c61Var2 = new c61("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i12 = messageEntity.offset;
                            spannableStringBuilder.setSpan(c61Var2, i12, messageEntity.length + i12, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            b11 b11Var = new b11();
                            b11Var.a |= 4;
                            c11 c11Var = new c11(b11Var, 0);
                            int i13 = messageEntity.offset;
                            MediaDataController.addStyleToText(c11Var, i13, messageEntity.length + i13, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                b11 b11Var2 = new b11();
                                b11Var2.a |= 1;
                                c11 c11Var2 = new c11(b11Var2, 0);
                                int i14 = messageEntity.offset;
                                MediaDataController.addStyleToText(c11Var2, i14, messageEntity.length + i14, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                b11 b11Var3 = new b11();
                                b11Var3.a |= 2;
                                c11 c11Var3 = new c11(b11Var3, 0);
                                int i15 = messageEntity.offset;
                                MediaDataController.addStyleToText(c11Var3, i15, messageEntity.length + i15, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                b11 b11Var4 = new b11();
                                b11Var4.a |= 8;
                                c11 c11Var4 = new c11(b11Var4, 0);
                                int i16 = messageEntity.offset;
                                MediaDataController.addStyleToText(c11Var4, i16, messageEntity.length + i16, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                b11 b11Var5 = new b11();
                                b11Var5.a |= 16;
                                c11 c11Var5 = new c11(b11Var5, 0);
                                int i17 = messageEntity.offset;
                                MediaDataController.addStyleToText(c11Var5, i17, messageEntity.length + i17, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                b61 b61Var = new b61(messageEntity.url, null);
                                int i18 = messageEntity.offset;
                                spannableStringBuilder.setSpan(b61Var, i18, messageEntity.length + i18, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                b11 b11Var6 = new b11();
                                b11Var6.a |= 128;
                                int i19 = messageEntity.offset;
                                b11Var6.b = i19;
                                b11Var6.c = i19 + messageEntity.length;
                                b11Var6.d = messageEntity;
                                int i20 = messageEntity.offset;
                                i10 i10Var = new i10(spannableStringBuilder.subSequence(i20, messageEntity.length + i20).toString(), b11Var6, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i21 = messageEntity.offset;
                                spannableStringBuilder.setSpan(i10Var, i21, messageEntity.length + i21, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                b11 b11Var7 = new b11();
                                b11Var7.a |= 256;
                                c11 c11Var6 = new c11(b11Var7, 0);
                                int i22 = messageEntity.offset;
                                MediaDataController.addStyleToText(c11Var6, i22, messageEntity.length + i22, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                z5 z5Var = tL_messageEntityCustomEmoji.document != null ? new z5(tL_messageEntityCustomEmoji.document, fontMetricsInt) : new z5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                int i23 = messageEntity.offset;
                                spannableStringBuilder.setSpan(z5Var, i23, messageEntity.length + i23, 33);
                            }
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
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
            boolean z10 = false;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if (i27 != intValue) {
                    int i29 = intValue - 1;
                    int i30 = (i29 < 0 || i29 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(i29) != '\n') ? intValue : intValue - 1;
                    if (i28 > 0) {
                        dj0.c(spannableStringBuilder, i27, i30, z10);
                    }
                    i27 = intValue + 1;
                    if (i27 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(intValue) != '\n') {
                        i27 = intValue;
                    }
                }
                if ((intValue2 & 2) != 0) {
                    i28--;
                }
                if ((intValue2 & 1) != 0 || (intValue2 & 16) != 0) {
                    i28++;
                    z10 = (intValue2 & 16) != 0;
                }
            }
            if (i27 < spannableStringBuilder.length() && i28 > 0) {
                dj0.c(spannableStringBuilder, i27, spannableStringBuilder.length(), z10);
            }
        }
        CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(spannableStringBuilder), fontMetricsInt, false, (int[]) null);
        if (arrayList != null) {
            try {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    TLRPC.MessageEntity messageEntity3 = (TLRPC.MessageEntity) arrayList.get(size);
                    if ((messageEntity3 instanceof TLRPC.TL_messageEntityPre) && messageEntity3.offset + messageEntity3.length <= replaceEmoji.length()) {
                        if (!(replaceEmoji instanceof Spannable)) {
                            replaceEmoji = new SpannableStringBuilder(replaceEmoji);
                        }
                        ((SpannableStringBuilder) replaceEmoji).insert(messageEntity3.offset + messageEntity3.length, (CharSequence) "```\n");
                        SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) replaceEmoji;
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
                FileLog.e(e7);
            }
        }
        return replaceEmoji;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlowModeButtonVisible(boolean z10) {
        int i10;
        int i11 = z10 ? 0 : 8;
        wg wgVar = this.F0;
        wgVar.setVisibility(i11);
        if (z10) {
            i10 = AndroidUtilities.dp(wgVar.e ? 26.0f : 16.0f);
        } else {
            i10 = 0;
        }
        qf qfVar = this.E0;
        if (qfVar == null || qfVar.getPaddingRight() == i10) {
            return;
        }
        this.E0.setPadding(0, AndroidUtilities.dp(9.0f), i10, AndroidUtilities.dp(10.0f));
    }

    public final void A() {
        if (this.e2 && this.c1) {
            CameraController.getInstance().cancelOnInitRunnable(this.H3);
            this.Z2.k2(5, 0, this.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, this.S4, 0L, true);
            this.S4 = 0L;
            this.J0.setEffect(0L);
        } else {
            this.Z2.a1(0);
            MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
        }
        this.F2 = false;
        L1(2, true);
    }

    public final void A1() {
        z1();
        org.telegram.ui.xd xdVar = this.p1;
        if (xdVar != null) {
            xdVar.setTranslationX(this.y + this.x);
            xdVar.setAlpha(this.E * this.F);
            xdVar.setVisibility(xdVar.getAlpha() > 0.0f ? 0 : 8);
            hg.l lVar = this.r1;
            if (lVar != null && this.A4) {
                lVar.setAlpha(this.v1 * this.F);
            }
        }
        af afVar = this.J1;
        if (afVar != null) {
            afVar.setTranslationX(afVar.a);
        }
    }

    public final void B() {
        cf cfVar;
        org.telegram.ui.wn wnVar;
        if (this.L != null || (cfVar = this.K1) == null || cfVar.getRight() == 0 || (wnVar = this.P2) == null || !BirthdayController.isToday(wnVar.a8)) {
            return;
        }
        if (MessagesController.getInstance(this.Q).getMainSettings().getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + wnVar.a(), true)) {
            MessagesController.getInstance(this.Q).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + wnVar.a(), false).apply();
            ci.e4 e4Var = new ci.e4(getContext(), 3);
            this.L = e4Var;
            e4Var.q(13.0f);
            this.L.p(true);
            W0();
            this.L.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            this.L.m(1.0f, -((getWidth() - AndroidUtilities.dp(12.0f)) - ((this.K1.getMeasuredWidth() / 2.0f) + (this.K1.getX() + (this.p1.getX() + this.y1.getX())))));
            addView(this.L, w7.y5.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
            ci.e4 e4Var2 = this.L;
            e4Var2.l0 = new td(this, 12);
            e4Var2.d = 8000L;
            e4Var2.u();
        }
    }

    public final void B0() {
        NotificationCenter.ObserversGroup observersGroup;
        rk0 rk0Var = this.h1;
        if (rk0Var != null) {
            rk0Var.Q = true;
            s71 s71Var = rk0Var.n;
            if (s71Var != null) {
                s71Var.P(false);
                rk0Var.n.H();
                rk0Var.n = null;
            }
        }
        if (this.h1 != null && this.b3 != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.Q);
            long j3 = this.Q2;
            org.telegram.ui.wn wnVar = this.P2;
            long d = (wnVar == null || !wnVar.h4) ? 0L : wnVar.d();
            rk0 rk0Var2 = this.h1;
            float audioLeft = rk0Var2 == null ? 0.0f : rk0Var2.getAudioLeft();
            rk0 rk0Var3 = this.h1;
            mediaDataController.setDraftVoiceRegion(j3, d, audioLeft, rk0Var3 == null ? 1.0f : rk0Var3.getAudioRight());
        }
        this.Y1 = true;
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.recordStarted);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.recordPaused);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.recordResumed);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.recordStartError);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.recordStopped);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.recordProgressChanged);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.audioDidSent);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.audioRouteChanged);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.messageReceivedByServer2);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.sendingMessagesChanged);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.audioRecordTooShort);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.updateBotMenuButton);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.didUpdatePremiumGiftFieldIcon);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        eg egVar = this.U0;
        if (egVar != null && (observersGroup = egVar.I2) != null) {
            observersGroup.removeAllObservers();
            egVar.I2 = null;
        }
        td tdVar = this.H0;
        if (tdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(tdVar);
            this.H0 = null;
        }
        PowerManager.WakeLock wakeLock = this.q2;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.q2 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        aw0 aw0Var = this.m1;
        if (aw0Var != null) {
            aw0Var.setDelegate(null);
        }
        ff ffVar = this.q0;
        if (ffVar != null) {
            ffVar.e = false;
            ffVar.dismiss();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b3, code lost:
    
        if (android.text.TextUtils.isEmpty(r15 == null ? "" : org.telegram.messenger.AndroidUtilities.getTrimmedString(r15.getTextToUse())) != false) goto L124;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B1(boolean z10) {
        cf cfVar;
        if (this.X3) {
            org.telegram.ui.wn wnVar = this.P2;
            if (wnVar != null && !wnVar.N5) {
                z10 = false;
            }
            boolean j02 = j0();
            boolean z11 = this.m5 != 1 && this.Q2 > 0;
            cf cfVar2 = this.x1;
            boolean z12 = cfVar2 != null && cfVar2.getVisibility() == 0;
            if (!j02 && !this.p2 && this.n2 == null) {
                cf cfVar3 = this.x1;
                if (cfVar3 != null) {
                    cfVar3.setVisibility(8);
                }
            } else if (this.n2 != null) {
                if (t0() && this.f2 == 1 && this.n2.is_persistent) {
                    cf cfVar4 = this.x1;
                    if (cfVar4 != null && cfVar4.getVisibility() != 8) {
                        this.x1.setVisibility(8);
                    }
                } else {
                    Q();
                    if (this.x1.getVisibility() != 0) {
                        this.x1.setVisibility(0);
                    }
                    this.U1.a(R.drawable.input_bot2, true);
                    this.x1.setContentDescription(LocaleController.getString("AccDescrBotKeyboard", R.string.AccDescrBotKeyboard));
                }
            } else if (z11) {
                cf cfVar5 = this.x1;
                if (cfVar5 != null) {
                    cfVar5.setVisibility(8);
                }
            } else {
                Q();
                this.U1.a(R.drawable.input_bot1, true);
                this.x1.setContentDescription(LocaleController.getString("AccDescrBotCommands", R.string.AccDescrBotCommands));
                this.x1.setVisibility(0);
            }
            if (z11) {
                R();
            }
            cf cfVar6 = this.x1;
            boolean z13 = (cfVar6 != null && cfVar6.getVisibility() == 0) != z12;
            ei.c0 c0Var = this.l0;
            int i10 = 2;
            if (c0Var != null) {
                boolean z14 = c0Var.w;
                c0Var.setWebView(this.m5 == 3);
                ei.c0 c0Var2 = this.l0;
                String string = this.m5 == 2 ? LocaleController.getString(R.string.BotsMenuTitle) : this.i0;
                if (string == null) {
                    c0Var2.getClass();
                    string = LocaleController.getString(R.string.BotsMenuTitle);
                }
                String str = c0Var2.n;
                boolean z15 = str == null || !str.equals(string);
                c0Var2.n = string;
                c0Var2.r = null;
                c0Var2.requestLayout();
                AndroidUtilities.updateViewVisibilityAnimated(this.l0, z11, 0.5f, z10);
                z13 = z13 || z15 || z14 != this.l0.w;
            }
            if (z13 && z10) {
                oe oeVar = this.Q0;
                Float valueOf = Float.valueOf(oeVar.getX());
                HashMap hashMap = this.B0;
                hashMap.put(oeVar, valueOf);
                qf qfVar = this.E0;
                if (qfVar != null) {
                    hashMap.put(qfVar, Float.valueOf(qfVar.getX()));
                }
                cf cfVar7 = this.x1;
                boolean z16 = cfVar7 != null && cfVar7.getVisibility() == 0;
                if (z16 != z12 && (cfVar = this.x1) != null) {
                    cfVar.setVisibility(0);
                    if (z16) {
                        this.x1.setAlpha(0.0f);
                        this.x1.setScaleX(0.1f);
                        this.x1.setScaleY(0.1f);
                    } else if (!z16) {
                        this.x1.setAlpha(1.0f);
                        this.x1.setScaleX(1.0f);
                        this.x1.setScaleY(1.0f);
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(this.x1, z16, 0.1f, true, 1.0f, true, new rd(this, 1));
                }
            }
            cf cfVar8 = this.x1;
            if (cfVar8 != null && cfVar8.getVisibility() == 0) {
                qf qfVar2 = this.E0;
            }
            i10 = this.P4;
            H1(i10);
        }
    }

    public final void C1() {
        int b10;
        s4.c0 c0Var;
        int L0;
        View m10;
        of ofVar = this.m0;
        if (ofVar == null) {
            return;
        }
        int childCount = ofVar.c.getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = this.m0.c.getChildAt(i11);
            if (i11 < 4) {
                i10 += childAt.getMeasuredHeight();
            }
        }
        aw0 aw0Var = this.m1;
        if (i10 > 0) {
            b10 = org.telegram.messenger.f0.b(childCount > 4 ? 12.0f : 0.0f, (aw0Var.getMeasuredHeight() - i10) - AndroidUtilities.dp(8.0f), 0);
        } else {
            b10 = this.n0.c.size() > 4 ? org.telegram.messenger.f0.b(162.8f, aw0Var.getMeasuredHeight(), 0) : org.telegram.messenger.f0.b((Math.max(1, Math.min(4, this.n0.c.size())) * 36) + 8, aw0Var.getMeasuredHeight(), 0);
        }
        if (this.m0.c.getPaddingTop() != b10) {
            this.m0.c.setTopGlowOffset(b10);
            if (this.V4 == -1 && this.m0.getVisibility() == 0 && this.m0.c.getLayoutManager() != null && (L0 = (c0Var = (s4.c0) this.m0.c.getLayoutManager()).L0()) >= 0 && (m10 = c0Var.m(L0)) != null) {
                this.V4 = L0;
                this.W4 = m10.getTop() - this.m0.c.getPaddingTop();
            }
            this.m0.c.setPadding(0, b10, 0, AndroidUtilities.dp(8.0f));
        }
    }

    @Override // le.e
    public final void D(int i10, float f7, float f10, le.f fVar) {
        if (i10 == 0) {
            M();
            N();
        } else if (i10 == 1) {
            M();
            N();
        } else {
            if (i10 == 2) {
                gi.a aVar = this.I0;
                aVar.setAlpha(f7);
                aVar.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, f7));
                aVar.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, f7));
                aVar.setVisibility(f7 <= 0.0f ? 4 : 0);
            } else if (i10 == 3) {
                float lerp = AndroidUtilities.lerp(1.0f, 0.79f, f7);
                le leVar = this.A1;
                leVar.setScaleX(lerp);
                leVar.setScaleY(AndroidUtilities.lerp(1.0f, 0.79f, f7));
                float lerp2 = AndroidUtilities.lerp(0.79f, 1.0f, f7);
                ImageView imageView = this.B1;
                imageView.setScaleX(lerp2);
                imageView.setScaleY(AndroidUtilities.lerp(0.79f, 1.0f, f7));
                imageView.setVisibility(f7 <= 0.0f ? 8 : 0);
                imageView.setAlpha(f7);
                ye yeVar = this.J0;
                if (yeVar != null) {
                    yeVar.setSameWidthFactor(f7);
                }
            }
        }
        invalidate();
    }

    public final void D0() {
        this.j2 = true;
        ff ffVar = this.q0;
        if (ffVar != null) {
            ffVar.e = false;
            ffVar.dismiss();
        }
        if (this.z2) {
            this.l2 = true;
        }
        td tdVar = new td(this, 8);
        this.N4 = tdVar;
        AndroidUtilities.runOnUIThread(tdVar, 500L);
    }

    public final void D1(boolean z10) {
        if (this.m5 != 1 && this.Q2 > 0) {
            R();
        }
        ei.c0 c0Var = this.l0;
        if (c0Var != null) {
            c0Var.setWebView(j0());
        }
        B1(z10);
    }

    public final void E() {
        qf qfVar = this.E0;
        boolean z10 = ((qfVar != null && !TextUtils.isEmpty(qfVar.getText())) || this.z2 || this.k3 || t0()) ? false : true;
        if (z10) {
            R();
        }
        ei.c0 c0Var = this.l0;
        if (c0Var != null) {
            boolean z11 = c0Var.f;
            if (z11 != z10) {
                c0Var.f = z10;
                c0Var.requestLayout();
                c0Var.invalidate();
            }
            if (z11 != this.l0.f) {
                oe oeVar = this.Q0;
                Float valueOf = Float.valueOf(oeVar.getX());
                HashMap hashMap = this.B0;
                hashMap.put(oeVar, valueOf);
                qf qfVar2 = this.E0;
                if (qfVar2 != null) {
                    hashMap.put(qfVar2, Float.valueOf(qfVar2.getX()));
                }
            }
        }
    }

    public final void E0() {
        qf qfVar;
        this.j2 = false;
        td tdVar = this.N4;
        if (tdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(tdVar);
            this.N4 = null;
        }
        if (j0() && v()) {
            return;
        }
        getVisibility();
        if (!this.l2 || org.telegram.ui.ActionBar.m2.hasSheets(this.P2)) {
            return;
        }
        this.l2 = false;
        og ogVar = this.Z2;
        if (ogVar != null) {
            ogVar.r1();
        }
        if (this.R1 == 0 && (qfVar = this.E0) != null) {
            qfVar.requestFocus();
        }
        AndroidUtilities.showKeyboard(this.E0);
        if (AndroidUtilities.usingHardwareInput || this.z2 || AndroidUtilities.isInMultiwindow) {
            return;
        }
        this.k3 = true;
        bf bfVar = this.r3;
        AndroidUtilities.cancelRunOnUIThread(bfVar);
        AndroidUtilities.runOnUIThread(bfVar, 100L);
    }

    public final void E1() {
        qf qfVar = this.E0;
        boolean z10 = false;
        p1((qfVar == null || qfVar.getLineCount() <= 2 || this.E0.getText() == null || TextUtils.isEmpty(this.E0.getText().toString().trim())) ? false : true);
        qf qfVar2 = this.E0;
        if (qfVar2 != null && qfVar2.getLineCount() > 2 && this.E0.getText() != null && !TextUtils.isEmpty(this.E0.getText().toString().trim())) {
            z10 = true;
        }
        v1(z10);
    }

    public final void F() {
        org.telegram.ui.wn wnVar = this.P2;
        if (wnVar == null) {
            return;
        }
        K1(wnVar.e, wnVar.a8);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:164|(1:248)(1:168)|169|(8:171|(1:246)(1:175)|(1:245)(1:181)|182|(4:184|(1:186)(1:243)|187|(1:191))(1:244)|(1:193)(1:242)|194|(1:196))(1:247)|197|(3:199|(1:201)(1:203)|202)|204|(3:(1:207)(1:223)|(2:211|(1:221))|222)|224|(4:226|(1:240)(1:230)|231|(5:233|234|235|236|237))|241|234|235|236|237) */
    /* JADX WARN: Can't wrap try/catch for region: R(29:15|(1:17)|18|(1:154)(1:24)|25|(3:27|(1:31)|32)(2:107|(3:109|(1:113)|114)(2:115|(9:117|(1:119)(1:144)|120|(3:124|(1:126)|127)|128|(3:130|(1:136)|137)|138|(1:142)|143)(1:(20:150|(1:152)|153|34|(1:38)|39|(1:106)|42|(1:103)(1:46)|(1:102)(1:50)|(1:101)|(4:57|(1:59)(1:65)|60|(1:64))|(1:71)|(1:73)|74|(3:(1:77)(1:93)|(2:81|(1:91))|92)|94|95|96|97))))|33|34|(2:36|38)|39|(0)|104|106|42|(1:44)|103|(1:48)|102|(2:52|54)|101|(0)|(3:67|69|71)|(0)|74|(0)|94|95|96|97) */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x033d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F0(View view) {
        org.telegram.ui.wn wnVar;
        TLRPC.User user;
        int measuredHeight;
        float f7;
        qf qfVar;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        ArrayList<MessageObject> arrayList;
        long j3;
        ye yeVar;
        h60 h60Var;
        boolean z10;
        MessagePreviewParams messagePreviewParams2;
        int i10;
        y70 F;
        boolean z11;
        boolean z12;
        qf qfVar2;
        int i11 = 0;
        if (c() || (((wnVar = this.P2) != null && wnVar.R3 == 5) || this.i5.f)) {
            return false;
        }
        boolean z13 = this.A4;
        int i12 = 3;
        ye yeVar2 = this.J0;
        org.telegram.ui.ActionBar.d6 d6Var = this.W3;
        int i13 = 2;
        boolean z14 = true;
        if (z13 || !(((qfVar = this.E0) != null && !TextUtils.isEmpty(qfVar.getText())) || wnVar == null || (messagePreviewParams = wnVar.f5) == null || (messages = messagePreviewParams.forwardMessages) == null || (arrayList = messages.messages) == null || arrayList.isEmpty())) {
            boolean z15 = wnVar != null && UserObject.isUserSelf(wnVar.i());
            if (this.O0 == null) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(this.O2, d6Var);
                this.O0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                this.O0.setOnTouchListener(new lf(this));
                this.O0.setDispatchKeyEventListener(new be(this));
                this.O0.setShownFromBottom(false);
                boolean z16 = wnVar != null && wnVar.D6();
                boolean z17 = !z15 && (this.G0 <= 0 || c());
                if (z16) {
                    boolean z18 = !z17;
                    org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, getContext(), this.W3, true, z18);
                    this.G4 = e1Var;
                    if (z15) {
                        f7 = 196.0f;
                        e1Var.g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                    } else {
                        f7 = 196.0f;
                        e1Var.g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                    }
                    this.G4.setMinimumWidth(AndroidUtilities.dp(f7));
                    this.G4.setOnClickListener(new vd(this, 11));
                    this.O0.a(this.G4, w7.y5.n(-1, 44));
                    SharedConfig.removeScheduledHint();
                    if (!z15 && this.Q2 > 0) {
                        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(0, getContext(), this.W3, true, z18);
                        this.c = e1Var2;
                        e1Var2.g(LocaleController.getString(R.string.SendWhenOnline), R.drawable.msg_online, null);
                        this.c.setMinimumWidth(AndroidUtilities.dp(f7));
                        this.c.setOnClickListener(new vd(this, 12));
                        this.O0.a(this.c, w7.y5.n(-1, 44));
                    }
                } else {
                    f7 = 196.0f;
                }
                if (z17) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, getContext(), this.W3, !z16, true);
                    user = null;
                    e1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                    e1Var3.setMinimumWidth(AndroidUtilities.dp(f7));
                    e1Var3.setOnClickListener(new vd(this, 13));
                    this.O0.a(e1Var3, w7.y5.n(-1, 44));
                } else {
                    user = null;
                }
                this.O0.setupRadialSelectors(i0(org.telegram.ui.ActionBar.h6.I5));
                mf mfVar = new mf(this, this.O0);
                this.N0 = mfVar;
                mfVar.b = false;
                mfVar.setAnimationStyle(R.style.PopupContextAnimation2);
                this.N0.setOutsideTouchable(true);
                this.N0.setClippingEnabled(true);
                this.N0.setInputMethodMode(2);
                this.N0.setSoftInputMode(0);
                this.N0.getContentView().setFocusableInTouchMode(true);
                SharedConfig.removeScheduledOrNoSoundHint();
                og ogVar = this.Z2;
                if (ogVar != null) {
                    ogVar.o2();
                }
            } else {
                user = null;
            }
            org.telegram.ui.ActionBar.e1 e1Var4 = this.G4;
            if (e1Var4 != null) {
                e1Var4.setVisibility(this.O ? 8 : 0);
            }
            if (this.c != null) {
                TLRPC.User i14 = wnVar == null ? user : wnVar.i();
                if (i14 != null && !i14.bot) {
                    TLRPC.UserStatus userStatus = i14.status;
                    if (!(userStatus instanceof TLRPC.TL_userStatusEmpty) && !(userStatus instanceof TLRPC.TL_userStatusOnline) && !(userStatus instanceof TLRPC.TL_userStatusRecently) && !(userStatus instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus instanceof TLRPC.TL_userStatusLastWeek)) {
                        this.c.setVisibility(0);
                    }
                }
                this.c.setVisibility(8);
            }
            this.O0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            this.N0.setFocusable(true);
            int[] iArr = this.N2;
            view.getLocationInWindow(iArr);
            if (this.z2) {
                int measuredHeight2 = getMeasuredHeight();
                View view2 = this.G1;
                if (measuredHeight2 > AndroidUtilities.dp((view2 == null || view2.getVisibility() != 0) ? 58.0f : 102.0f)) {
                    measuredHeight = view.getMeasuredHeight() + iArr[1];
                    this.N0.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.O0.getMeasuredWidth()), measuredHeight);
                    this.N0.b();
                    yeVar2.invalidate();
                    view.performHapticFeedback(3, 2);
                    return true;
                }
            }
            measuredHeight = (iArr[1] - this.O0.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            this.N0.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.O0.getMeasuredWidth()), measuredHeight);
            this.N0.b();
            yeVar2.invalidate();
            view.performHapticFeedback(3, 2);
            return true;
        }
        nf nfVar = this.L0;
        if (nfVar != null) {
            nfVar.h(false);
        }
        AndroidUtilities.cancelRunOnUIThread(this.F4);
        nf nfVar2 = new nf(this, getContext(), d6Var, i11);
        this.L0 = nfVar2;
        nfVar2.setOnDismissListener(new b1(this, i12));
        boolean z19 = (this.d3 == null && ((qfVar2 = this.E0) == null || TextUtils.isEmpty(qfVar2.getText()))) ? false : true;
        ArrayList arrayList2 = new ArrayList();
        if (this.E1 != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.out = true;
            j3 = 0;
            tL_message.peer_id = MessagesController.getInstance(this.Q).getPeer(this.Q2);
            tL_message.from_id = MessagesController.getInstance(this.Q).getPeer(UserConfig.getInstance(this.Q).getClientUserId());
            tL_message.rich_message = this.E1;
            MessageObject messageObject = new MessageObject(this.Q, tL_message, false, true);
            MessageObject messageObject2 = this.T2;
            if (messageObject2 != null && !messageObject2.isTopicMainMessage) {
                messageObject.replyMessageObject = messageObject2;
            }
            messageObject.isOutOwnerCached = Boolean.TRUE;
            messageObject.generateLayout(null);
            messageObject.notime = true;
            messageObject.sendPreview = true;
            arrayList2.add(messageObject);
            yeVar = yeVar2;
        } else {
            j3 = 0;
            if (this.b3 != null) {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.id = 0;
                tL_message2.out = true;
                yeVar = yeVar2;
                tL_message2.peer_id = MessagesController.getInstance(this.Q).getPeer(this.Q2);
                tL_message2.from_id = MessagesController.getInstance(this.Q).getPeer(UserConfig.getInstance(this.Q).getClientUserId());
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message2.media = tL_messageMediaDocument;
                tL_messageMediaDocument.voice = true;
                tL_messageMediaDocument.document = this.b3;
                tL_message2.send_state = 1;
                tL_message2.attachPath = this.c3;
                MessageObject messageObject3 = new MessageObject(this.Q, tL_message2, false, true);
                MessageObject messageObject4 = this.T2;
                if (messageObject4 != null && !messageObject4.isTopicMainMessage) {
                    messageObject3.replyMessageObject = messageObject4;
                }
                messageObject3.isOutOwnerCached = Boolean.TRUE;
                messageObject3.generateLayout(null);
                messageObject3.notime = true;
                messageObject3.sendPreview = true;
                arrayList2.add(messageObject3);
            } else {
                yeVar = yeVar2;
                if (z19) {
                    TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                    tL_message3.id = 0;
                    tL_message3.out = true;
                    tL_message3.peer_id = MessagesController.getInstance(this.Q).getPeer(this.Q2);
                    tL_message3.from_id = MessagesController.getInstance(this.Q).getPeer(UserConfig.getInstance(this.Q).getClientUserId());
                    qf qfVar3 = this.E0;
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(qfVar3 == null ? "" : qfVar3.getTextToUse())};
                    MessageObject.addLinks(true, charSequenceArr[0]);
                    tL_message3.entities.addAll(MediaDataController.getInstance(this.Q).getEntities(charSequenceArr, true));
                    tL_message3.message = charSequenceArr[0].toString();
                    MessageObject messageObject5 = this.T2;
                    if (messageObject5 != null && !messageObject5.isTopicMainMessage) {
                        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                        MessageObject messageObject6 = this.U2;
                        if (messageObject6 != null) {
                            tL_messageReplyHeader.flags |= 2;
                            tL_messageReplyHeader.reply_to_top_id = messageObject6.getId();
                        }
                        tL_messageReplyHeader.flags |= 16;
                        tL_messageReplyHeader.reply_to_msg_id = this.T2.getId();
                        tL_message3.reply_to = tL_messageReplyHeader;
                    }
                    if (this.X2 != null) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                        tL_messageMediaWebPage.webpage = this.X2;
                        if (wnVar != null && (messagePreviewParams2 = wnVar.f5) != null && messagePreviewParams2.hasMedia) {
                            boolean z20 = messagePreviewParams2.webpageSmall;
                            tL_messageMediaWebPage.force_small_media = z20;
                            tL_messageMediaWebPage.force_large_media = !z20;
                            tL_message3.invert_media = messagePreviewParams2.webpageTop;
                        }
                        tL_message3.media = tL_messageMediaWebPage;
                    }
                    MessageObject messageObject7 = new MessageObject(this.Q, tL_message3, false, false);
                    MessageObject messageObject8 = this.T2;
                    if (messageObject8 != null && !messageObject8.isTopicMainMessage) {
                        messageObject7.replyMessageObject = messageObject8;
                    }
                    messageObject7.sendPreview = true;
                    messageObject7.isOutOwnerCached = Boolean.TRUE;
                    messageObject7.type = 0;
                    messageObject7.generateLayout(null);
                    messageObject7.notime = true;
                    arrayList2.add(messageObject7);
                } else if (wnVar != null && (h60Var = wnVar.b3) != null && h60Var.getTextureView() != null) {
                    nf nfVar3 = this.L0;
                    TextureView textureView = wnVar.b3.getTextureView();
                    nfVar3.getClass();
                    if (textureView != null) {
                        nfVar3.l0 = new RectF();
                        int[] iArr2 = new int[2];
                        textureView.getLocationOnScreen(iArr2);
                        nfVar3.l0.set(iArr2[0], iArr2[1], textureView.getWidth() + r9, textureView.getHeight() + iArr2[1]);
                    }
                    z10 = true;
                    this.L0.q(arrayList2);
                    i10 = 4;
                    if (z19 && this.b3 == null) {
                        nf nfVar4 = this.L0;
                        qf qfVar4 = this.E0;
                        d dVar = new d(this, i10);
                        de deVar = new de(this, i13);
                        nfVar4.S = qfVar4;
                        nfVar4.U = dVar;
                        nfVar4.V = deVar;
                    }
                    this.L0.r(yeVar, true, new ai.j3(i10, this, z19));
                    if ((!z19 || z10) && this.Q2 >= j3) {
                        this.L0.d(wnVar);
                        this.L0.o(this.S4);
                    }
                    F = y70.F(this, d6Var, yeVar);
                    z11 = wnVar == null && UserObject.isUserSelf(wnVar.i());
                    z12 = wnVar == null && wnVar.D6();
                    if (!z11 || (this.G0 > 0 && !c())) {
                        z14 = false;
                    }
                    if (z12) {
                        F.c(R.drawable.msg_calendar2, LocaleController.getString(z11 ? R.string.SetReminder : R.string.ScheduleMessage), new td(this, 18), false);
                        if (!z11 && this.Q2 > j3) {
                            F.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new td(this, 19), false);
                            this.c = F.y();
                        }
                    }
                    if (wnVar != null && this.Z2 != null && ChatObject.isMonoForum(wnVar.e)) {
                        F.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new td(this, 17), false);
                    }
                    if (z14) {
                        F.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ae(this, z19, i13), false);
                    }
                    F.Y();
                    if (this.c != null) {
                        TLRPC.User i15 = wnVar == null ? null : wnVar.i();
                        if (i15 != null && !i15.bot) {
                            TLRPC.UserStatus userStatus2 = i15.status;
                            if (!(userStatus2 instanceof TLRPC.TL_userStatusEmpty) && !(userStatus2 instanceof TLRPC.TL_userStatusOnline) && !(userStatus2 instanceof TLRPC.TL_userStatusRecently) && !(userStatus2 instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus2 instanceof TLRPC.TL_userStatusLastWeek)) {
                                this.c.setVisibility(0);
                            }
                        }
                        this.c.setVisibility(8);
                    }
                    this.L0.p(F);
                    this.L0.show();
                    view.performHapticFeedback(3, 2);
                    return false;
                }
            }
        }
        z10 = false;
        this.L0.q(arrayList2);
        i10 = 4;
        if (z19) {
            nf nfVar42 = this.L0;
            qf qfVar42 = this.E0;
            d dVar2 = new d(this, i10);
            de deVar2 = new de(this, i13);
            nfVar42.S = qfVar42;
            nfVar42.U = dVar2;
            nfVar42.V = deVar2;
        }
        this.L0.r(yeVar, true, new ai.j3(i10, this, z19));
        if (!z19) {
        }
        this.L0.d(wnVar);
        this.L0.o(this.S4);
        F = y70.F(this, d6Var, yeVar);
        if (wnVar == null) {
        }
        if (wnVar == null) {
        }
        if (!z11) {
        }
        z14 = false;
        if (z12) {
        }
        if (wnVar != null) {
            F.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new td(this, 17), false);
        }
        if (z14) {
        }
        F.Y();
        if (this.c != null) {
        }
        this.L0.p(F);
        this.L0.show();
        view.performHapticFeedback(3, 2);
        return false;
    }

    public final void F1() {
        float f7 = this.r * this.h;
        oe oeVar = this.Q0;
        oeVar.setScaleX(f7);
        oeVar.setScaleY(this.r * this.h);
        oeVar.setAlpha(this.s * this.n);
    }

    public final void G(boolean z10) {
        MessageObject messageObject;
        boolean z11 = this.Q2 < 0 && this.X3 && this.Z1 == null && (yf.u.g(this.Q).e(getEditText() != null ? getEditText().toString() : null, this.X4) > 0 || ((messageObject = this.T2) != null && messageObject.isEphemeral()));
        le.c cVar = this.i5;
        boolean z12 = cVar.f != z11;
        cVar.a(z11, z10);
        ye yeVar = this.J0;
        if (yeVar != null) {
            yeVar.v = z11;
            yeVar.invalidate();
        }
        if (z12) {
            K(z10);
        }
    }

    public final void G0() {
        int height = this.m1.getHeight();
        if (!this.z2) {
            height -= this.A2;
        }
        og ogVar = this.Z2;
        if (ogVar != null) {
            ogVar.f2(height);
        }
        if (this.G1 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
            le.c cVar = this.g5;
            if (height < currentActionBarHeight) {
                if (this.h3) {
                    this.h3 = false;
                    if (this.g3) {
                        cVar.a(false, false);
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
                cVar.a(true, false);
            }
        }
    }

    public final void G1(boolean z10) {
        boolean z11;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        MessageObject messageObject;
        TLRPC.ReplyMarkup replyMarkup;
        TLRPC.ReplyMarkup replyMarkup2;
        qf qfVar = this.E0;
        if (qfVar == null) {
            return;
        }
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            qfVar.setHintText(charSequence, z10);
            this.E0.setHintText2(this.f, z10);
            return;
        }
        boolean z12 = false;
        if (!this.z0 && !r0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d " + LocaleController.getString("PlainTextRestrictedHint", R.string.PlainTextRestrictedHint));
            spannableStringBuilder.setSpan(new pq(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
            this.E0.setHintText(spannableStringBuilder, z10);
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
        R1();
        org.telegram.ui.wn wnVar = this.P2;
        boolean z13 = wnVar != null && wnVar.R3 == 8 && wnVar.T3;
        long sendPaidMessagesStars = wnVar != null ? wnVar.getMessagesController().getSendPaidMessagesStars(wnVar.a()) : 0L;
        if (sendPaidMessagesStars > 0) {
            sendPaidMessagesStars *= getMessagesCount();
        }
        int i11 = wnVar != null ? wnVar.R3 : -1;
        if (i11 == 9) {
            this.E0.setHintText(LocaleController.getString(R.string.WelcomeMessageEnter));
            return;
        }
        if (i11 == 5) {
            if ("hello".equalsIgnoreCase(wnVar.Q3)) {
                this.E0.setHintText(LocaleController.getString(R.string.BusinessGreetingEnter));
                return;
            } else if ("away".equalsIgnoreCase(wnVar.Q3)) {
                this.E0.setHintText(LocaleController.getString(R.string.BusinessAwayEnter));
                return;
            } else {
                this.E0.setHintText(LocaleController.getString(R.string.BusinessRepliesEnter));
                return;
            }
        }
        pq[] pqVarArr = this.O4;
        if (z13) {
            this.E0.setHintText(sendPaidMessagesStars > 0 ? yh.w7.Q0(LocaleController.formatString(R.string.SuggestPostForStars, LocaleController.formatNumber((int) sendPaidMessagesStars, ','), pqVarArr)) : LocaleController.formatString(R.string.SuggestPostForFree, new Object[0]));
            pq pqVar = pqVarArr[0];
            if (pqVar != null) {
                pqVar.spaceScaleX = 0.9f;
                return;
            }
            return;
        }
        if (this.b2 != null) {
            this.E0.setHintText(LocaleController.getString(R.string.BusinessLinksEnter));
            return;
        }
        MessageObject messageObject2 = this.T2;
        if (messageObject2 != null && (replyMarkup2 = messageObject2.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
            this.E0.setHintText(this.T2.messageOwner.reply_markup.placeholder, z10);
            return;
        }
        if (this.Z1 != null) {
            this.E0.setHintText(LocaleController.getString(this.a2 ? R.string.Caption : R.string.TypeMessage));
            return;
        }
        if (sendPaidMessagesStars > 0) {
            this.E0.setHintText(yh.w7.V0(false, LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber((int) sendPaidMessagesStars, ',')), pqVarArr));
            pq pqVar2 = pqVarArr[0];
            if (pqVar2 != null) {
                pqVar2.spaceScaleX = 0.9f;
                return;
            }
            return;
        }
        if (this.X0 && (messageObject = this.m2) != null && (replyMarkup = messageObject.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
            this.E0.setHintText(this.m2.messageOwner.reply_markup.placeholder, z10);
            return;
        }
        if (wnVar != null && wnVar.v9()) {
            MessageObject messageObject3 = this.U2;
            if (messageObject3 != null && (tL_forumTopic = messageObject3.replyToForumTopic) != null && (str2 = tL_forumTopic.title) != null) {
                this.E0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str2), z10);
                return;
            }
            TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.Q).getTopicsController().findTopic(wnVar.e.id, 1L);
            if (findTopic == null || (str = findTopic.title) == null) {
                this.E0.setHintText(LocaleController.getString(R.string.TypeMessage), z10);
                return;
            } else {
                this.E0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str), z10);
                return;
            }
        }
        if (DialogObject.isChatDialog(this.Q2)) {
            TLRPC.Chat chat = this.R.getMessagesController().getChat(Long.valueOf(-this.Q2));
            TLRPC.ChatFull chatFull = this.R.getMessagesController().getChatFull(-this.Q2);
            z11 = ChatObject.isChannelAndNotMegaGroup(chat);
            z12 = !z11 && ChatObject.getSendAsPeerId(chat, chatFull) == (-this.Q2);
        } else {
            z11 = false;
        }
        if (z12) {
            this.E0.setHintText(LocaleController.getString("SendAnonymously", R.string.SendAnonymously));
            return;
        }
        TLRPC.User user = this.R.getMessagesController().getUser(Long.valueOf(this.Q2));
        if (user != null && user.bot_forum_view && !user.bot_forum_can_manage_topics && wnVar != null && !wnVar.h4) {
            this.E0.setHintText(LocaleController.getString(R.string.SendBotNoThread));
            return;
        }
        if (wnVar != null && wnVar.F9() && !wnVar.h4) {
            if (wnVar.X3 == null || !wnVar.g4) {
                this.E0.setHintText(LocaleController.getString("Reply", R.string.Reply));
                return;
            } else {
                this.E0.setHintText(LocaleController.getString(R.string.Comment));
                return;
            }
        }
        if (!z11) {
            this.E0.setHintText(LocaleController.getString(R.string.TypeMessage));
        } else if (this.g2) {
            this.E0.setHintText(LocaleController.getString("ChannelSilentBroadcast", R.string.ChannelSilentBroadcast), z10);
        } else {
            this.E0.setHintText(LocaleController.getString("ChannelBroadcast", R.string.ChannelBroadcast), z10);
        }
    }

    @Override // org.telegram.ui.Components.zv0
    public final void H(int i10, boolean z10) {
        MessageObject messageObject;
        qf qfVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z11;
        int i11;
        int i12;
        ph.f fVar;
        if (this.R1 != 0) {
            this.L2 = i10;
            this.M2 = z10;
            this.z2 = i10 > 0;
            E();
            return;
        }
        if (i10 > AndroidUtilities.dp(50.0f) && this.z2 && !AndroidUtilities.isInMultiwindow) {
            if (z10) {
                this.y2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.y2).commit();
            } else {
                this.x2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.x2).commit();
            }
        }
        if (this.z2 && this.W0 && this.U0 == null) {
            this.W0 = false;
        }
        boolean t02 = t0();
        aw0 aw0Var = this.m1;
        org.telegram.ui.wn wnVar = this.P2;
        if (t02) {
            int i13 = z10 ? this.y2 : this.x2;
            if (wnVar != null && wnVar.getParentLayout() != null) {
                i13 -= ((ActionBarLayout) wnVar.getParentLayout()).v(false);
            }
            if (this.f2 == 1) {
                bg bgVar = this.H1;
                if (!bgVar.f) {
                    i13 = Math.min(bgVar.getKeyboardHeight(), i13);
                }
            }
            int i14 = this.f2;
            ViewGroup viewGroup = i14 == 0 ? this.U0 : i14 == 1 ? this.H1 : null;
            bg bgVar2 = this.H1;
            if (bgVar2 != null) {
                bgVar2.setPanelHeight(i13);
                ph.f fVar2 = this.d5;
                if (fVar2 != null && i13 > 0 && this.f2 == 1) {
                    ((ph.i) fVar2).g(i13);
                }
            }
            if (viewGroup != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                if (!this.A3 && !this.z3 && (((i11 = layoutParams.width) != (i12 = AndroidUtilities.displaySize.x) || layoutParams.height != i13) && ((fVar = this.d5) == null || i11 != -1 || layoutParams.height != -1))) {
                    if (fVar == null) {
                        layoutParams.width = i12;
                        layoutParams.height = i13;
                        viewGroup.setLayoutParams(layoutParams);
                    }
                    if (aw0Var != null) {
                        int i15 = this.A2;
                        this.A2 = layoutParams.height;
                        aw0Var.requestLayout();
                        G0();
                        if (this.i2 && !this.z2 && i15 != this.A2 && N0()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.V0 = animatorSet;
                            if (this.d5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.A2 - i15, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, this.A2 - i15, 0.0f));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.o1.w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new ze(this, 10));
                            AndroidUtilities.runOnUIThread(this.Y3, 50L);
                            this.L3.lock();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.L2 == i10 && this.M2 == z10) {
            G0();
            return;
        }
        this.L2 = i10;
        this.M2 = z10;
        boolean z12 = this.z2;
        this.z2 = i10 > 0;
        E();
        if (this.z2 && t0() && this.B3 == null) {
            t1(0, this.f2, true, true);
        } else if (!this.z2 && !t0() && (messageObject = this.m2) != null && this.T2 != messageObject && !j0() && !v() && !org.telegram.ui.ActionBar.m2.hasSheets(wnVar) && (((qfVar = this.E0) == null || TextUtils.isEmpty(qfVar.getText())) && (tL_replyKeyboardMarkup = this.n2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.o1 o1Var = aw0Var.H;
            if (o1Var.f) {
                o1Var.j();
            } else {
                o1Var.v = true;
            }
            t1(1, 1, false, true);
        }
        if (this.A2 != 0 && !(z11 = this.z2) && z11 != z12 && !t0()) {
            this.A2 = 0;
            aw0Var.requestLayout();
        }
        if (this.z2 && this.k3) {
            this.k3 = false;
            if (this.p3) {
                this.p3 = false;
                this.H1.setButtons(this.n2);
            }
            AndroidUtilities.cancelRunOnUIThread(this.r3);
        }
        G0();
    }

    public void H0() {
        if ((j0() && v()) || org.telegram.ui.ActionBar.m2.hasSheets(this.P2)) {
            return;
        }
        og ogVar = this.Z2;
        if (ogVar != null) {
            ogVar.r1();
        }
        qf qfVar = this.E0;
        if (qfVar == null || AndroidUtilities.showKeyboard(qfVar)) {
            return;
        }
        this.E0.clearFocus();
        this.E0.requestFocus();
    }

    public final void H1(int i10) {
        ImageView imageView;
        af afVar;
        af afVar2;
        hg.l lVar;
        this.P4 = i10;
        if (this.E0 != null) {
            MessageObject messageObject = this.Z1;
            if (messageObject == null || messageObject.needResendWhenEdit()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E0.getLayoutParams();
                int i11 = layoutParams.rightMargin;
                boolean z10 = this.A4;
                ye yeVar = this.J0;
                if (z10 && this.l5) {
                    layoutParams.rightMargin = Math.max(0, yeVar.l() - AndroidUtilities.dp(44.0f)) + AndroidUtilities.dp(this.v4 ? 50.0f : 2.0f);
                } else if (i10 == 1 || i10 == 2) {
                    cf cfVar = this.x1;
                    if (cfVar == null || cfVar.getVisibility() != 0 || (afVar2 = this.J1) == null || afVar2.getVisibility() != 0 || (lVar = this.r1) == null || lVar.getVisibility() != 0) {
                        cf cfVar2 = this.x1;
                        if ((cfVar2 == null || cfVar2.getVisibility() != 0) && (((imageView = this.I1) == null || imageView.getVisibility() != 0) && ((afVar = this.J1) == null || afVar.getTag() == null))) {
                            layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                        } else {
                            layoutParams.rightMargin = AndroidUtilities.dp(98.0f);
                        }
                    } else {
                        layoutParams.rightMargin = AndroidUtilities.dp(146.0f);
                    }
                } else {
                    af afVar3 = this.J1;
                    if (afVar3 == null || afVar3.getTag() == null) {
                        layoutParams.rightMargin = AndroidUtilities.dp(2.0f);
                    } else {
                        layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                    }
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, yeVar.l() - AndroidUtilities.dp(44.0f)));
                ye yeVar2 = this.F1;
                if (yeVar2 != null && yeVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.F1.l() - AndroidUtilities.dp(44.0f)));
                }
                if (i11 != layoutParams.rightMargin) {
                    this.E0.setLayoutParams(layoutParams);
                }
                le leVar = this.e1;
                if (leVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) leVar.getLayoutParams();
                    layoutParams2.rightMargin = this.Z1 == null ? org.telegram.messenger.f0.b(44.0f, yeVar.l(), 0) : 0;
                    this.e1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final void I0() {
        if (j0() && v()) {
            return;
        }
        org.telegram.ui.wn wnVar = this.P2;
        if (org.telegram.ui.ActionBar.m2.hasSheets(wnVar)) {
            return;
        }
        t1((AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || (wnVar != null && wnVar.isInBubbleMode()) || this.j2) ? 0 : 2, 0, true, true);
        og ogVar = this.Z2;
        if (ogVar != null) {
            ogVar.r1();
        }
        qf qfVar = this.E0;
        if (qfVar != null) {
            qfVar.requestFocus();
        }
        AndroidUtilities.showKeyboard(this.E0);
        if (this.j2) {
            this.l2 = true;
            return;
        }
        if (AndroidUtilities.usingHardwareInput || this.z2 || AndroidUtilities.isInMultiwindow) {
            return;
        }
        if (wnVar == null || !wnVar.isInBubbleMode()) {
            this.k3 = true;
            eg egVar = this.U0;
            if (egVar != null) {
                egVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
            }
            bf bfVar = this.r3;
            AndroidUtilities.cancelRunOnUIThread(bfVar);
            AndroidUtilities.runOnUIThread(bfVar, 100L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r14.Q).getMainSettings().getBoolean("show_gift_for_" + r5.a(), true) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d6, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r14.Q).getMainSettings().getBoolean(java.util.Calendar.getInstance().get(1) + "show_gift_for_" + r5.a(), true) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        if (r2.display_gifts_button == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f4, code lost:
    
        if (r0.disallow_unique_stargifts != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I1(boolean z10) {
        boolean z11;
        ci.e4 e4Var;
        TLRPC.UserFull userFull = getParentFragment() == null ? null : getParentFragment().a8;
        TLRPC.UserFull userFull2 = MessagesController.getInstance(this.Q).getUserFull(UserConfig.getInstance(this.Q).getClientUserId());
        TLRPC.User i10 = getParentFragment() != null ? getParentFragment().i() : null;
        boolean premiumPurchaseBlocked = MessagesController.getInstance(this.Q).premiumPurchaseBlocked();
        org.telegram.ui.wn wnVar = this.P2;
        if (!premiumPurchaseBlocked && getParentFragment() != null && i10 != null && !BuildVars.IS_BILLING_UNAVAILABLE && ((!UserObject.isUserSelf(i10) || (userFull2 != null && userFull2.display_gifts_button)) && !UserObject.isBot(i10) && !MessagesController.isSupportUser(i10) && userFull != null)) {
            if (!i10.premium && MessagesController.getInstance(this.Q).giftAttachMenuIcon && MessagesController.getInstance(this.Q).giftTextFieldIcon) {
            }
            if (BirthdayController.isToday(userFull.birthday)) {
            }
            if (!userFull.display_gifts_button) {
                if (userFull2 != null) {
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
            if (wnVar != null && wnVar.R3 == 0) {
                z11 = true;
                if (!z11 && (e4Var = this.L) != null) {
                    e4Var.e(true);
                }
                if (z11 && this.K1 == null) {
                    return;
                }
                if (this.K1 == null && wnVar != null) {
                    cf cfVar = new cf(this, getContext(), 0);
                    this.K1 = cfVar;
                    cfVar.setImageResource(R.drawable.msg_input_gift);
                    this.K1.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.h6.Wk), PorterDuff.Mode.MULTIPLY));
                    this.K1.setVisibility(8);
                    this.K1.setContentDescription(LocaleController.getString(R.string.GiftPremium));
                    this.K1.setScaleType(ImageView.ScaleType.CENTER);
                    this.K1.setBackground(org.telegram.ui.ActionBar.h6.f0(i0(org.telegram.ui.ActionBar.h6.i6), 1, -1));
                    this.p1.addView(this.K1, 0, w7.y5.e(44, 44, 21));
                    this.K1.setOnClickListener(new vd(this, 9));
                }
                AndroidUtilities.updateViewVisibilityAnimated(this.K1, z11, 1.0f, true, 1.0f, z10, new rd(this, 0));
                if (z11) {
                    return;
                }
                B();
                return;
            }
        }
        z11 = false;
        if (!z11) {
            e4Var.e(true);
        }
        if (z11) {
        }
        if (this.K1 == null) {
            cf cfVar2 = new cf(this, getContext(), 0);
            this.K1 = cfVar2;
            cfVar2.setImageResource(R.drawable.msg_input_gift);
            this.K1.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.h6.Wk), PorterDuff.Mode.MULTIPLY));
            this.K1.setVisibility(8);
            this.K1.setContentDescription(LocaleController.getString(R.string.GiftPremium));
            this.K1.setScaleType(ImageView.ScaleType.CENTER);
            this.K1.setBackground(org.telegram.ui.ActionBar.h6.f0(i0(org.telegram.ui.ActionBar.h6.i6), 1, -1));
            this.p1.addView(this.K1, 0, w7.y5.e(44, 44, 21));
            this.K1.setOnClickListener(new vd(this, 9));
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.K1, z11, 1.0f, true, 1.0f, z10, new rd(this, 0));
        if (z11) {
        }
    }

    public final void J() {
        boolean z10;
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.e2) {
            return;
        }
        if (this.p1 == null) {
            this.e2 = false;
            k1(false, false);
            return;
        }
        boolean z12 = true;
        this.e2 = true;
        this.x0 = true;
        this.y0 = true;
        if (DialogObject.isChatDialog(this.Q2)) {
            TLRPC.Chat chat = this.R.getMessagesController().getChat(Long.valueOf(-this.Q2));
            z10 = ChatObject.isChannel(chat) && !chat.megagroup;
            if (z10 && !chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.e2 = false;
            }
            this.x0 = ChatObject.canSendRoundVideo(chat);
            this.y0 = ChatObject.canSendVoice(chat);
        } else {
            z10 = false;
        }
        if (!SharedConfig.inappCamera) {
            this.e2 = false;
        }
        if (this.e2) {
            if (SharedConfig.hasCameraCache) {
                CameraController.getInstance().initCamera(null);
            }
            z11 = MessagesController.getGlobalMainSettings().getBoolean(z10 ? "currentModeVideoChannel" : "currentModeVideo", z10);
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
        k1(z12, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0() {
        org.telegram.ui.wn wnVar;
        Editable editable;
        ii.e2 e2Var;
        CharSequence[] charSequenceArr;
        ArrayList<TLRPC.MessageEntity> entities;
        if (this.E0 == null || (wnVar = this.P2) == null || !MessagesController.getInstance(this.Q).richEditorAvailable()) {
            return;
        }
        TL_iv.RichMessage richMessage = this.E1;
        if (richMessage != null) {
            e2Var = new ii.e2(richMessage);
        } else {
            Editable text = this.E0.getText();
            if (!TextUtils.isEmpty(text) && TextUtils.indexOf((CharSequence) text, '`') >= 0) {
                try {
                    charSequenceArr = new CharSequence[]{new SpannableStringBuilder(text)};
                    entities = MediaDataController.getInstance(this.Q).getEntities(charSequenceArr, true);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (entities != null && !entities.isEmpty()) {
                    editable = new SpannableStringBuilder(charSequenceArr[0]);
                    MessageObject.addEntitiesToText(editable, entities, false, false, false, false);
                    ii.e2 e2Var2 = new ii.e2(editable);
                    if (editable == text) {
                        int selectionStart = this.E0.getSelectionStart();
                        int selectionEnd = this.E0.getSelectionEnd();
                        if (selectionStart < 0) {
                            selectionStart = this.E0.length();
                        }
                        if (selectionEnd < 0) {
                            selectionEnd = selectionStart;
                        }
                        e2Var2.c = selectionStart;
                        e2Var2.d = selectionEnd;
                    }
                    e2Var2.L = new td(this, 15);
                    e2Var = e2Var2;
                }
            }
            editable = text;
            ii.e2 e2Var22 = new ii.e2(editable);
            if (editable == text) {
            }
            e2Var22.L = new td(this, 15);
            e2Var = e2Var22;
        }
        e2Var.setResourceProvider(this.W3);
        e2Var.J = wnVar;
        e2Var.s = wnVar.S;
        e2Var.v = wnVar.Y;
        e2Var.K = new td(this, 16);
        wnVar.presentFragment(e2Var);
    }

    public final void J1() {
        qf qfVar = this.E0;
        if (qfVar != null) {
            qfVar.setTranslationX(this.H + this.G);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:498:0x0821, code lost:
    
        if (org.telegram.messenger.ChatObject.canSendRoundVideo(r5) == false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0824, code lost:
    
        r17 = 0.5f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x082f, code lost:
    
        if (r2.voice_messages_forbidden != false) goto L289;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0ee5  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0d47  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0d71  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0888  */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r5v100, types: [android.animation.AnimatorSet, android.view.ViewPropertyAnimator] */
    /* JADX WARN: Type inference failed for: r5v108 */
    /* JADX WARN: Type inference failed for: r5v99 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(boolean z10) {
        ye yeVar;
        ImageView imageView;
        String str;
        ve veVar;
        int i10;
        AnimatorSet animatorSet;
        ?? r14;
        ImageView imageView2;
        boolean z11;
        cf cfVar;
        cf cfVar2;
        AnimatorSet animatorSet2;
        int i11;
        float f7;
        cf cfVar3;
        AnimatorSet animatorSet3;
        ImageView imageView3;
        int i12;
        boolean z12;
        ?? r52;
        ?? r142;
        if (this.Z1 != null || this.F2) {
            return;
        }
        boolean z13 = this.j2 ? false : z10;
        R1();
        qf qfVar = this.E0;
        CharSequence trimmedString = qfVar == null ? "" : AndroidUtilities.getTrimmedString(qfVar.getTextToUse());
        int i13 = this.G0;
        ye yeVar2 = this.J0;
        le.c cVar = this.i5;
        ke keVar = this.a4;
        ve veVar2 = this.Z0;
        Property property = View.SCALE_X;
        Property property2 = View.SCALE_Y;
        Property property3 = View.ALPHA;
        org.telegram.ui.xd xdVar = this.p1;
        we weVar = this.b1;
        wg wgVar = this.F0;
        hg.l lVar = this.r1;
        boolean z14 = z13;
        ImageView imageView4 = this.P0;
        CharSequence charSequence = trimmedString;
        if (i13 <= 0 || i13 == Integer.MAX_VALUE || c() || cVar.f) {
            int length = charSequence.length();
            le.c cVar2 = this.h5;
            if (length > 0 || this.H2 || this.D1 || this.b3 != null || this.e3 != null) {
                yeVar = yeVar2;
            } else {
                yeVar = yeVar2;
                if ((this.G0 != Integer.MAX_VALUE || c() || cVar.f) && ((!this.l5 || getStarsPrice() <= 0) && !cVar2.f)) {
                    if (this.U0 == null || !this.W0 || (!(this.x3 || (this.y3 && this.R1 == 2)) || AndroidUtilities.isInMultiwindow || this.l5)) {
                        if (getSendButtonInternal().getVisibility() == 0 || imageView4.getVisibility() == 0 || (((cfVar3 = this.S0) != null && cfVar3.getVisibility() == 0) || wgVar.getVisibility() == 0)) {
                            if (!z14) {
                                wgVar.setScaleX(0.1f);
                                wgVar.setScaleY(0.1f);
                                wgVar.setAlpha(0.0f);
                                setSlowModeButtonVisible(false);
                                getSendButtonInternal().setScaleX(0.1f);
                                getSendButtonInternal().setScaleY(0.1f);
                                getSendButtonInternal().setAlpha(0.0f);
                                getSendButtonInternal().setVisibility(8);
                                imageView4.setScaleX(0.1f);
                                imageView4.setScaleY(0.1f);
                                imageView4.setAlpha(0.0f);
                                imageView4.setVisibility(8);
                                cf cfVar4 = this.S0;
                                if (cfVar4 != null) {
                                    cfVar4.setScaleX(0.1f);
                                    this.S0.setScaleY(0.1f);
                                    this.S0.setAlpha(0.0f);
                                    this.S0.setVisibility(8);
                                }
                                weVar.setScaleX(1.0f);
                                weVar.setScaleY(1.0f);
                                weVar.setAlpha(1.0f);
                                veVar2.setVisibility(0);
                                if (xdVar != null) {
                                    if (getVisibility() == 0) {
                                        this.Z2.w2();
                                    }
                                    this.E = 1.0f;
                                    A1();
                                    xdVar.setScaleX(1.0f);
                                    xdVar.setVisibility(0);
                                    H1(1);
                                }
                                if (lVar != null) {
                                    ViewPropertyAnimator viewPropertyAnimator = this.q1;
                                    if (viewPropertyAnimator != null) {
                                        viewPropertyAnimator.cancel();
                                        this.q1 = null;
                                    }
                                    this.v1 = 1.0f;
                                    lVar.setAlpha(1.0f);
                                    lVar.setScaleX(1.0f);
                                    lVar.setScaleY(1.0f);
                                }
                                this.L1 = false;
                                og ogVar = this.Z2;
                                if (ogVar != null && ogVar.C0()) {
                                    a0();
                                }
                                if (this.J1 != null) {
                                    og ogVar2 = this.Z2;
                                    if (ogVar2 != null && ogVar2.C0()) {
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
                                AnimatorSet animatorSet4 = this.r2;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                    animatorSet2 = null;
                                    this.r2 = null;
                                } else {
                                    animatorSet2 = null;
                                }
                                AnimatorSet animatorSet5 = this.s2;
                                if (animatorSet5 != null) {
                                    animatorSet5.cancel();
                                    this.s2 = animatorSet2;
                                }
                                if (xdVar != null) {
                                    if (xdVar.getVisibility() != 0) {
                                        xdVar.setVisibility(0);
                                        this.E = 0.0f;
                                        A1();
                                        xdVar.setScaleX(0.0f);
                                    }
                                    this.s2 = new AnimatorSet();
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(ObjectAnimator.ofFloat(xdVar, keVar, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(xdVar, (Property<org.telegram.ui.xd, Float>) property, 1.0f));
                                    jh.h hVar = this.e5;
                                    if (hVar != null) {
                                        hVar.e(0, false, true);
                                    }
                                    if (lVar != null) {
                                        ViewPropertyAnimator viewPropertyAnimator2 = this.q1;
                                        if (viewPropertyAnimator2 != null) {
                                            viewPropertyAnimator2.cancel();
                                            this.q1 = null;
                                        }
                                        this.v1 = 1.0f;
                                        arrayList.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property3, 1.0f));
                                        arrayList.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property, 1.0f));
                                        arrayList.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property2, 1.0f));
                                    }
                                    og ogVar3 = this.Z2;
                                    boolean z15 = ogVar3 != null && ogVar3.C0();
                                    this.L1 = false;
                                    if (z15) {
                                        a0();
                                    }
                                    af afVar = this.J1;
                                    if (afVar != null) {
                                        if (z15) {
                                            afVar.setVisibility(0);
                                            this.J1.setTag(1);
                                            this.J1.setPivotX(AndroidUtilities.dp(44.0f));
                                            arrayList.add(ObjectAnimator.ofFloat(this.J1, (Property<af, Float>) property3, 1.0f));
                                            arrayList.add(ObjectAnimator.ofFloat(this.J1, (Property<af, Float>) property, 1.0f));
                                            arrayList.add(p(0.0f));
                                            ImageView imageView5 = this.I1;
                                            if (imageView5 != null && imageView5.getVisibility() == 0) {
                                                imageView5.setVisibility(8);
                                            }
                                        } else {
                                            afVar.setAlpha(1.0f);
                                            this.J1.setScaleX(1.0f);
                                            this.J1.setScaleY(1.0f);
                                            this.J1.setTranslationX(0.0f);
                                        }
                                    }
                                    this.s2.playTogether(arrayList);
                                    this.s2.setDuration(100L);
                                    this.s2.addListener(new ze(this, 6));
                                    this.s2.start();
                                    H1(1);
                                    if (getVisibility() == 0) {
                                        this.Z2.w2();
                                    }
                                }
                                veVar2.setVisibility(0);
                                this.r2 = new AnimatorSet();
                                this.v2 = 2;
                                ArrayList arrayList2 = new ArrayList();
                                org.telegram.ui.wn wnVar = this.P2;
                                TLRPC.Chat g10 = wnVar == null ? null : wnVar.g();
                                TLRPC.UserFull w82 = wnVar == null ? this.K : wnVar.w8();
                                if (g10 != null) {
                                    if (!ChatObject.canSendVoice(g10)) {
                                    }
                                    f7 = 1.0f;
                                } else if (w82 == null) {
                                    i11 = 1;
                                    f7 = 1.0f;
                                    float[] fArr = new float[i11];
                                    fArr[0] = 1.0f;
                                    arrayList2.add(ObjectAnimator.ofFloat(weVar, (Property<we, Float>) property, fArr));
                                    float[] fArr2 = new float[i11];
                                    fArr2[0] = 1.0f;
                                    arrayList2.add(ObjectAnimator.ofFloat(weVar, (Property<we, Float>) property2, fArr2));
                                    float[] fArr3 = new float[i11];
                                    fArr3[0] = f7;
                                    arrayList2.add(ObjectAnimator.ofFloat(weVar, (Property<we, Float>) property3, fArr3));
                                    if (imageView4.getVisibility() != 0) {
                                        float[] fArr4 = new float[i11];
                                        fArr4[0] = 0.1f;
                                        arrayList2.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property, fArr4));
                                        float[] fArr5 = new float[i11];
                                        fArr5[0] = 0.1f;
                                        arrayList2.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property2, fArr5));
                                        float[] fArr6 = new float[i11];
                                        fArr6[0] = 0.0f;
                                        arrayList2.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property3, fArr6));
                                    } else {
                                        cf cfVar5 = this.S0;
                                        if (cfVar5 != null && cfVar5.getVisibility() == 0) {
                                            cf cfVar6 = this.S0;
                                            float[] fArr7 = new float[i11];
                                            fArr7[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(cfVar6, (Property<cf, Float>) property, fArr7));
                                            cf cfVar7 = this.S0;
                                            float[] fArr8 = new float[i11];
                                            fArr8[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(cfVar7, (Property<cf, Float>) property2, fArr8));
                                            cf cfVar8 = this.S0;
                                            float[] fArr9 = new float[i11];
                                            fArr9[0] = 0.0f;
                                            arrayList2.add(ObjectAnimator.ofFloat(cfVar8, (Property<cf, Float>) property3, fArr9));
                                        } else if (wgVar.getVisibility() == 0) {
                                            float[] fArr10 = new float[i11];
                                            fArr10[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(wgVar, (Property<wg, Float>) property, fArr10));
                                            float[] fArr11 = new float[i11];
                                            fArr11[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(wgVar, (Property<wg, Float>) property2, fArr11));
                                            float[] fArr12 = new float[i11];
                                            fArr12[0] = 0.0f;
                                            arrayList2.add(ObjectAnimator.ofFloat(wgVar, (Property<wg, Float>) property3, fArr12));
                                        } else {
                                            View sendButtonInternal = getSendButtonInternal();
                                            float[] fArr13 = new float[i11];
                                            fArr13[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(sendButtonInternal, (Property<View, Float>) property, fArr13));
                                            View sendButtonInternal2 = getSendButtonInternal();
                                            float[] fArr14 = new float[i11];
                                            fArr14[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(sendButtonInternal2, (Property<View, Float>) property2, fArr14));
                                            View sendButtonInternal3 = getSendButtonInternal();
                                            float[] fArr15 = new float[i11];
                                            fArr15[0] = 0.0f;
                                            arrayList2.add(ObjectAnimator.ofFloat(sendButtonInternal3, (Property<View, Float>) property3, fArr15));
                                        }
                                    }
                                    this.r2.playTogether(arrayList2);
                                    this.r2.setDuration(150L);
                                    this.r2.addListener(new ze(this, 7));
                                    this.r2.start();
                                }
                                i11 = 1;
                                float[] fArr16 = new float[i11];
                                fArr16[0] = 1.0f;
                                arrayList2.add(ObjectAnimator.ofFloat(weVar, (Property<we, Float>) property, fArr16));
                                float[] fArr22 = new float[i11];
                                fArr22[0] = 1.0f;
                                arrayList2.add(ObjectAnimator.ofFloat(weVar, (Property<we, Float>) property2, fArr22));
                                float[] fArr32 = new float[i11];
                                fArr32[0] = f7;
                                arrayList2.add(ObjectAnimator.ofFloat(weVar, (Property<we, Float>) property3, fArr32));
                                if (imageView4.getVisibility() != 0) {
                                }
                                this.r2.playTogether(arrayList2);
                                this.r2.setDuration(150L);
                                this.r2.addListener(new ze(this, 7));
                                this.r2.start();
                            }
                        }
                    } else if (!z14) {
                        wgVar.setScaleX(0.1f);
                        wgVar.setScaleY(0.1f);
                        wgVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        getSendButtonInternal().setVisibility(8);
                        imageView4.setScaleX(0.1f);
                        imageView4.setScaleY(0.1f);
                        imageView4.setAlpha(0.0f);
                        imageView4.setVisibility(8);
                        weVar.setScaleX(0.1f);
                        weVar.setScaleY(0.1f);
                        weVar.setAlpha(0.0f);
                        veVar2.setVisibility(8);
                        V();
                        this.S0.setScaleX(1.0f);
                        this.S0.setScaleY(1.0f);
                        this.S0.setAlpha(1.0f);
                        this.S0.setVisibility(0);
                        if (xdVar != null) {
                            if (getVisibility() == 0) {
                                this.Z2.w2();
                            }
                            xdVar.setVisibility(0);
                            H1(1);
                        }
                        this.L1 = false;
                        og ogVar4 = this.Z2;
                        boolean z16 = ogVar4 != null && ogVar4.C0();
                        if (z16) {
                            a0();
                        }
                        af afVar2 = this.J1;
                        if (afVar2 != null) {
                            if (z16) {
                                afVar2.setVisibility(0);
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
                        AnimatorSet animatorSet6 = this.r2;
                        if (animatorSet6 != null) {
                            animatorSet6.cancel();
                            animatorSet3 = null;
                            this.r2 = null;
                        } else {
                            animatorSet3 = null;
                        }
                        AnimatorSet animatorSet7 = this.s2;
                        if (animatorSet7 != null) {
                            animatorSet7.cancel();
                            this.s2 = animatorSet3;
                        }
                        if (xdVar != null && this.w2 == 0) {
                            xdVar.setVisibility(0);
                            this.s2 = new AnimatorSet();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(ObjectAnimator.ofFloat(xdVar, keVar, 1.0f));
                            arrayList3.add(ObjectAnimator.ofFloat(xdVar, (Property<org.telegram.ui.xd, Float>) property, 1.0f));
                            jh.h hVar2 = this.e5;
                            if (hVar2 != null) {
                                hVar2.e(0, false, true);
                            }
                            if (lVar != null) {
                                ViewPropertyAnimator viewPropertyAnimator3 = this.q1;
                                if (viewPropertyAnimator3 != null) {
                                    viewPropertyAnimator3.cancel();
                                    this.q1 = null;
                                }
                                this.v1 = 1.0f;
                                arrayList3.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property3, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property2, 1.0f));
                            }
                            og ogVar5 = this.Z2;
                            boolean z17 = ogVar5 != null && ogVar5.C0();
                            this.L1 = false;
                            if (z17) {
                                a0();
                            }
                            af afVar3 = this.J1;
                            if (afVar3 != null) {
                                afVar3.setScaleY(1.0f);
                                if (z17) {
                                    this.J1.setVisibility(0);
                                    this.J1.setTag(1);
                                    this.J1.setPivotX(AndroidUtilities.dp(44.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.J1, (Property<af, Float>) property3, 1.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.J1, (Property<af, Float>) property, 1.0f));
                                    arrayList3.add(p(0.0f));
                                } else {
                                    this.J1.setAlpha(1.0f);
                                    this.J1.setScaleX(1.0f);
                                    this.J1.setTranslationX(0.0f);
                                }
                            }
                            this.s2.playTogether(arrayList3);
                            this.s2.setDuration(100L);
                            this.s2.addListener(new ze(this, 4));
                            this.s2.start();
                            H1(1);
                            if (getVisibility() == 0) {
                                this.Z2.w2();
                            }
                        }
                        V();
                        this.S0.setVisibility(0);
                        this.r2 = new AnimatorSet();
                        this.v2 = 4;
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(ObjectAnimator.ofFloat(this.S0, (Property<cf, Float>) property, 1.0f));
                        arrayList4.add(ObjectAnimator.ofFloat(this.S0, (Property<cf, Float>) property2, 1.0f));
                        arrayList4.add(ObjectAnimator.ofFloat(this.S0, (Property<cf, Float>) property3, 1.0f));
                        if (imageView4.getVisibility() == 0) {
                            arrayList4.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property2, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property3, 0.0f));
                        } else if (veVar2.getVisibility() == 0) {
                            arrayList4.add(ObjectAnimator.ofFloat(weVar, (Property<we, Float>) property, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(weVar, (Property<we, Float>) property2, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(weVar, (Property<we, Float>) property3, 0.0f));
                        } else if (wgVar.getVisibility() == 0) {
                            arrayList4.add(ObjectAnimator.ofFloat(wgVar, (Property<wg, Float>) property, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(wgVar, (Property<wg, Float>) property2, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(wgVar, (Property<wg, Float>) property3, 0.0f));
                        } else {
                            arrayList4.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property2, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property3, 0.0f));
                        }
                        this.r2.playTogether(arrayList4);
                        this.r2.setDuration(250L);
                        this.r2.addListener(new ze(this, 5));
                        this.r2.start();
                    }
                }
            }
            qf qfVar2 = this.E0;
            String caption = qfVar2 == null ? null : qfVar2.getCaption();
            boolean z18 = caption != null && (getSendButtonInternal().getVisibility() == 0 || ((cfVar2 = this.S0) != null && cfVar2.getVisibility() == 0));
            boolean z19 = caption == null && (imageView4.getVisibility() == 0 || ((cfVar = this.S0) != null && cfVar.getVisibility() == 0));
            int i02 = (this.G0 != Integer.MAX_VALUE || c() || cVar.f) ? i0(org.telegram.ui.ActionBar.h6.Yd) : i0(org.telegram.ui.ActionBar.h6.Wk);
            qf qfVar3 = this.E0;
            boolean z20 = (qfVar3 != null && (!TextUtils.isEmpty(qfVar3.getCaption()) || this.E0.isNearRightCaption(AndroidUtilities.dp(44.0f)))) || LocaleController.isRTL;
            if (i02 != this.K0) {
                this.K0 = i02;
                Drawable background = yeVar.getBackground();
                int i14 = i02;
                int red = Color.red(i14);
                veVar = veVar2;
                int green = Color.green(i14);
                str = caption;
                int blue = Color.blue(i14);
                imageView = imageView4;
                org.telegram.ui.ActionBar.h6.B1(background, Color.argb(24, red, green, blue), true);
            } else {
                imageView = imageView4;
                str = caption;
                veVar = veVar2;
            }
            if (veVar.getVisibility() != 0 && wgVar.getVisibility() != 0 && !z18 && !z19 && !cVar2.f) {
                jh.h hVar3 = this.e5;
                if (hVar3 != null) {
                    hVar3.e(0, z20, true);
                    if (lVar != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.q1;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.q1 = null;
                        }
                        ViewPropertyAnimator animate = lVar.animate();
                        float f10 = z20 ? 0.0f : 1.0f;
                        this.v1 = f10;
                        ViewPropertyAnimator duration = animate.alpha(f10).scaleX(z20 ? 0.5f : 1.0f).scaleY(z20 ? 0.5f : 1.0f).setInterpolator(rr.h).setDuration(320L);
                        this.q1 = duration;
                        duration.start();
                    }
                }
            } else {
                if (!z14) {
                    String str2 = str;
                    ImageView imageView6 = imageView;
                    weVar.setScaleX(0.1f);
                    weVar.setScaleY(0.1f);
                    weVar.setAlpha(0.0f);
                    veVar.setVisibility(8);
                    if (wgVar.getVisibility() == 0) {
                        wgVar.setScaleX(0.1f);
                        wgVar.setScaleY(0.1f);
                        wgVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                    }
                    if (str2 != null) {
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        getSendButtonInternal().setVisibility(8);
                        imageView6.setScaleX(1.0f);
                        imageView6.setScaleY(1.0f);
                        imageView6.setAlpha(1.0f);
                        imageView6.setVisibility(0);
                    } else {
                        imageView6.setScaleX(0.1f);
                        imageView6.setScaleY(0.1f);
                        imageView6.setAlpha(0.0f);
                        getSendButtonInternal().setVisibility(0);
                        getSendButtonInternal().setScaleX(1.0f);
                        getSendButtonInternal().setScaleY(1.0f);
                        getSendButtonInternal().setAlpha(1.0f);
                        imageView6.setVisibility(8);
                    }
                    cf cfVar9 = this.S0;
                    if (cfVar9 == null || cfVar9.getVisibility() != 0) {
                        i10 = 8;
                    } else {
                        this.S0.setScaleX(0.1f);
                        this.S0.setScaleY(0.1f);
                        this.S0.setAlpha(0.0f);
                        i10 = 8;
                        this.S0.setVisibility(8);
                    }
                    if (xdVar != null) {
                        xdVar.setVisibility(i10);
                        if (this.Z2 != null && getVisibility() == 0) {
                            this.Z2.s0();
                        }
                        H1(0);
                        jh.h hVar4 = this.e5;
                        if (hVar4 != null) {
                            hVar4.e(0, z20, true);
                            if (lVar != null) {
                                float f11 = z20 ? 0.0f : 1.0f;
                                this.v1 = f11;
                                lVar.setAlpha(f11);
                                lVar.setScaleX(z20 ? 0.5f : 1.0f);
                                lVar.setScaleY(z20 ? 0.5f : 1.0f);
                            }
                        } else if (lVar != null) {
                            this.v1 = 0.0f;
                            lVar.setAlpha(0.0f);
                            lVar.setScaleX(0.5f);
                            lVar.setScaleY(0.5f);
                        }
                    }
                    this.L1 = true;
                    if (this.J1 != null) {
                        og ogVar6 = this.Z2;
                        if (ogVar6 != null && ogVar6.C0()) {
                            this.J1.setVisibility(8);
                            this.J1.setTag(null);
                        }
                        this.J1.setAlpha(0.0f);
                        this.J1.setScaleX(0.0f);
                        this.J1.setScaleY(1.0f);
                        this.J1.setTranslationX(0.0f);
                    }
                    z11 = true;
                    if (!this.A4 || (imageView3 = this.w1) == null) {
                        return;
                    }
                    if (z14) {
                        imageView3.animate().translationX(z11 ? -org.telegram.messenger.f0.b(64.0f, yeVar.l(), 0) : AndroidUtilities.dp(42.0f)).setDuration(320L).setInterpolator(rr.h).start();
                        return;
                    } else {
                        imageView3.setTranslationX(z11 ? -org.telegram.messenger.f0.b(64.0f, yeVar.l(), 0) : AndroidUtilities.dp(42.0f));
                        return;
                    }
                }
                int i15 = this.v2;
                if (i15 == 1 && str == null) {
                    return;
                }
                if (i15 == 3 && str != null) {
                    return;
                }
                AnimatorSet animatorSet8 = this.r2;
                if (animatorSet8 != null) {
                    animatorSet8.cancel();
                    animatorSet = null;
                    this.r2 = null;
                } else {
                    animatorSet = null;
                }
                AnimatorSet animatorSet9 = this.s2;
                if (animatorSet9 != null) {
                    animatorSet9.cancel();
                    this.s2 = animatorSet;
                }
                if (xdVar != null) {
                    this.s2 = new AnimatorSet();
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(ObjectAnimator.ofFloat(xdVar, keVar, 0.0f));
                    arrayList5.add(ObjectAnimator.ofFloat(xdVar, (Property<org.telegram.ui.xd, Float>) property, 0.5f));
                    ViewPropertyAnimator viewPropertyAnimator5 = this.q1;
                    if (viewPropertyAnimator5 != null) {
                        viewPropertyAnimator5.cancel();
                        this.q1 = null;
                    }
                    jh.h hVar5 = this.e5;
                    if (hVar5 != null) {
                        hVar5.e(0, z20, true);
                        if (lVar != null) {
                            float f12 = z20 ? 0.0f : 1.0f;
                            this.v1 = f12;
                            arrayList5.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property3, f12));
                            arrayList5.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property, z20 ? 0.5f : 1.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property2, z20 ? 0.5f : 1.0f));
                        }
                    } else if (lVar != null) {
                        this.v1 = 0.0f;
                        arrayList5.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property3, 0.0f));
                        arrayList5.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property, 0.5f));
                        arrayList5.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property2, 0.5f));
                    }
                    og ogVar7 = this.Z2;
                    boolean z21 = ogVar7 != null && ogVar7.C0();
                    this.L1 = true;
                    af afVar4 = this.J1;
                    if (afVar4 != null) {
                        afVar4.setScaleY(1.0f);
                        if (z21) {
                            this.J1.setTag(null);
                            arrayList5.add(ObjectAnimator.ofFloat(this.J1, (Property<af, Float>) property3, 0.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(this.J1, (Property<af, Float>) property, 0.0f));
                            arrayList5.add(p(0.0f));
                        } else {
                            this.J1.setAlpha(0.0f);
                            this.J1.setScaleX(0.0f);
                            this.J1.setTranslationX(0.0f);
                        }
                    }
                    this.s2.playTogether(arrayList5);
                    this.s2.setDuration(100L);
                    this.s2.addListener(new df(this, z21, 1));
                    this.s2.start();
                    H1(0);
                    if (this.Z2 != null && getVisibility() == 0) {
                        this.Z2.s0();
                    }
                }
                this.r2 = new AnimatorSet();
                ArrayList arrayList6 = new ArrayList();
                if (veVar.getVisibility() == 0) {
                    r14 = 0;
                    arrayList6.add(ObjectAnimator.ofFloat(weVar, (Property<we, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(weVar, (Property<we, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(weVar, (Property<we, Float>) property3, 0.0f));
                } else {
                    r14 = 0;
                }
                cf cfVar10 = this.S0;
                if (cfVar10 != null && cfVar10.getVisibility() == 0) {
                    cf cfVar11 = this.S0;
                    float[] fArr17 = new float[1];
                    fArr17[r14] = 0.1f;
                    arrayList6.add(ObjectAnimator.ofFloat(cfVar11, (Property<cf, Float>) property, fArr17));
                    cf cfVar12 = this.S0;
                    float[] fArr18 = new float[1];
                    fArr18[r14] = 0.1f;
                    arrayList6.add(ObjectAnimator.ofFloat(cfVar12, (Property<cf, Float>) property2, fArr18));
                    cf cfVar13 = this.S0;
                    float[] fArr19 = new float[1];
                    fArr19[r14] = 0.0f;
                    arrayList6.add(ObjectAnimator.ofFloat(cfVar13, (Property<cf, Float>) property3, fArr19));
                }
                if (wgVar.getVisibility() == 0) {
                    float[] fArr20 = new float[1];
                    fArr20[r14] = 0.1f;
                    arrayList6.add(ObjectAnimator.ofFloat(wgVar, (Property<wg, Float>) property, fArr20));
                    float[] fArr21 = new float[1];
                    fArr21[r14] = 0.1f;
                    arrayList6.add(ObjectAnimator.ofFloat(wgVar, (Property<wg, Float>) property2, fArr21));
                    float[] fArr23 = new float[1];
                    fArr23[r14] = 0.0f;
                    arrayList6.add(ObjectAnimator.ofFloat(wgVar, (Property<wg, Float>) property3, fArr23));
                }
                if (z18) {
                    arrayList6.add(q(r14));
                } else if (z19) {
                    float[] fArr24 = new float[1];
                    fArr24[r14] = 0.1f;
                    ImageView imageView7 = imageView;
                    arrayList6.add(ObjectAnimator.ofFloat(imageView7, (Property<ImageView, Float>) property, fArr24));
                    float[] fArr25 = new float[1];
                    fArr25[r14] = 0.1f;
                    arrayList6.add(ObjectAnimator.ofFloat(imageView7, (Property<ImageView, Float>) property2, fArr25));
                    float[] fArr26 = new float[1];
                    fArr26[r14] = 0.0f;
                    arrayList6.add(ObjectAnimator.ofFloat(imageView7, (Property<ImageView, Float>) property3, fArr26));
                    imageView2 = imageView7;
                    if (str == null) {
                        this.v2 = 3;
                        float[] fArr27 = new float[1];
                        fArr27[r14] = 1.0f;
                        arrayList6.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, fArr27));
                        float[] fArr28 = new float[1];
                        fArr28[r14] = 1.0f;
                        arrayList6.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, fArr28));
                        float[] fArr29 = new float[1];
                        fArr29[r14] = 1.0f;
                        arrayList6.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, fArr29));
                        imageView2.setVisibility(r14);
                    } else {
                        this.v2 = 1;
                        arrayList6.add(q(true));
                        getSendButtonInternal().setVisibility(r14);
                    }
                    this.r2.playTogether(arrayList6);
                    this.r2.setDuration(220L);
                    this.r2.setInterpolator(rr.h);
                    this.r2.addListener(new ai.z(18, this, str));
                    this.r2.start();
                }
                imageView2 = imageView;
                if (str == null) {
                }
                this.r2.playTogether(arrayList6);
                this.r2.setDuration(220L);
                this.r2.setInterpolator(rr.h);
                this.r2.addListener(new ai.z(18, this, str));
                this.r2.start();
            }
            z11 = true;
            if (this.A4) {
                return;
            } else {
                return;
            }
        }
        if (wgVar.getVisibility() != 0) {
            if (!z14) {
                wgVar.setScaleX(1.0f);
                wgVar.setScaleY(1.0f);
                wgVar.setAlpha(1.0f);
                setSlowModeButtonVisible(true);
                weVar.setScaleX(0.1f);
                weVar.setScaleY(0.1f);
                weVar.setAlpha(0.0f);
                veVar2.setVisibility(8);
                getSendButtonInternal().setScaleX(0.1f);
                getSendButtonInternal().setScaleY(0.1f);
                getSendButtonInternal().setAlpha(0.0f);
                getSendButtonInternal().setVisibility(8);
                imageView4.setScaleX(0.1f);
                imageView4.setScaleY(0.1f);
                imageView4.setAlpha(0.0f);
                imageView4.setVisibility(8);
                cf cfVar14 = this.S0;
                if (cfVar14 == null || cfVar14.getVisibility() != 0) {
                    i12 = 8;
                } else {
                    this.S0.setScaleX(0.1f);
                    this.S0.setScaleY(0.1f);
                    this.S0.setAlpha(0.0f);
                    i12 = 8;
                    this.S0.setVisibility(8);
                }
                if (xdVar != null) {
                    xdVar.setVisibility(i12);
                    if (this.Z2 != null && getVisibility() == 0) {
                        this.Z2.s0();
                    }
                    z12 = false;
                    H1(0);
                    jh.h hVar6 = this.e5;
                    if (hVar6 != null) {
                        hVar6.e(0, false, false);
                    }
                    if (lVar != null) {
                        this.v1 = 0.0f;
                        lVar.setAlpha(0.0f);
                        lVar.setScaleX(0.5f);
                        lVar.setScaleY(0.5f);
                    }
                } else {
                    z12 = false;
                }
                this.L1 = z12;
                og ogVar8 = this.Z2;
                boolean z22 = ogVar8 != null && ogVar8.C0();
                if (z22) {
                    a0();
                }
                af afVar5 = this.J1;
                if (afVar5 != null) {
                    if (z22) {
                        afVar5.setVisibility(0);
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
                    r52 = 0;
                    this.r2 = null;
                } else {
                    r52 = 0;
                }
                AnimatorSet animatorSet11 = this.s2;
                if (animatorSet11 != null) {
                    animatorSet11.cancel();
                    this.s2 = r52;
                }
                ViewPropertyAnimator viewPropertyAnimator6 = this.q1;
                if (viewPropertyAnimator6 != null) {
                    viewPropertyAnimator6.cancel();
                    this.q1 = r52;
                }
                if (xdVar != null) {
                    this.s2 = new AnimatorSet();
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(ObjectAnimator.ofFloat(xdVar, keVar, 0.0f));
                    arrayList7.add(ObjectAnimator.ofFloat(xdVar, (Property<org.telegram.ui.xd, Float>) property, 0.5f));
                    this.L1 = false;
                    og ogVar9 = this.Z2;
                    boolean z23 = ogVar9 != null && ogVar9.C0();
                    if (z23) {
                        a0();
                    }
                    jh.h hVar7 = this.e5;
                    if (hVar7 != null) {
                        hVar7.e(0, false, true);
                    }
                    if (lVar != null) {
                        this.v1 = 0.0f;
                        arrayList7.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property3, 0.0f));
                        arrayList7.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property, 0.5f));
                        arrayList7.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property2, 0.5f));
                    }
                    af afVar6 = this.J1;
                    if (afVar6 != null) {
                        afVar6.setScaleY(1.0f);
                        if (z23) {
                            this.J1.setVisibility(0);
                            this.J1.setTag(1);
                            this.J1.setPivotX(AndroidUtilities.dp(44.0f));
                            arrayList7.add(p(0.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.J1, (Property<af, Float>) property3, 1.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.J1, (Property<af, Float>) property, 1.0f));
                        } else {
                            this.J1.setTranslationX(0.0f);
                            this.J1.setAlpha(1.0f);
                            this.J1.setScaleX(1.0f);
                        }
                    }
                    this.s2.playTogether(arrayList7);
                    this.s2.setDuration(100L);
                    this.s2.addListener(new ze(this, 2));
                    this.s2.start();
                    H1(0);
                    if (this.Z2 != null && getVisibility() == 0) {
                        this.Z2.s0();
                    }
                }
                this.v2 = 5;
                this.r2 = new AnimatorSet();
                ArrayList arrayList8 = new ArrayList();
                if (veVar2.getVisibility() == 0) {
                    r142 = 0;
                    arrayList8.add(ObjectAnimator.ofFloat(weVar, (Property<we, Float>) property, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(weVar, (Property<we, Float>) property2, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(weVar, (Property<we, Float>) property3, 0.0f));
                } else {
                    r142 = 0;
                }
                cf cfVar15 = this.S0;
                if (cfVar15 != null && cfVar15.getVisibility() == 0) {
                    cf cfVar16 = this.S0;
                    float[] fArr30 = new float[1];
                    fArr30[r142] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(cfVar16, (Property<cf, Float>) property, fArr30));
                    cf cfVar17 = this.S0;
                    float[] fArr31 = new float[1];
                    fArr31[r142] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(cfVar17, (Property<cf, Float>) property2, fArr31));
                    cf cfVar18 = this.S0;
                    float[] fArr33 = new float[1];
                    fArr33[r142] = 0.0f;
                    arrayList8.add(ObjectAnimator.ofFloat(cfVar18, (Property<cf, Float>) property3, fArr33));
                }
                if (getSendButtonInternal().getVisibility() == 0) {
                    arrayList8.add(q(r142));
                }
                if (imageView4.getVisibility() == 0) {
                    float[] fArr34 = new float[1];
                    fArr34[r142] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property, fArr34));
                    float[] fArr35 = new float[1];
                    fArr35[r142] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property2, fArr35));
                    float[] fArr36 = new float[1];
                    fArr36[r142] = 0.0f;
                    arrayList8.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property3, fArr36));
                }
                float[] fArr37 = new float[1];
                fArr37[r142] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(wgVar, (Property<wg, Float>) property, fArr37));
                float[] fArr38 = new float[1];
                fArr38[r142] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(wgVar, (Property<wg, Float>) property2, fArr38));
                float[] fArr39 = new float[1];
                fArr39[r142] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(wgVar, (Property<wg, Float>) property3, fArr39));
                setSlowModeButtonVisible(true);
                this.r2.playTogether(arrayList8);
                this.r2.setDuration(220L);
                this.r2.setInterpolator(rr.h);
                this.r2.addListener(new ze(this, 3));
                this.r2.start();
            }
        }
        yeVar = yeVar2;
        z11 = false;
        if (this.A4) {
        }
    }

    public final void K0(CharSequence charSequence, String str, CharSequence charSequence2) {
        org.telegram.ui.wn wnVar;
        if (this.E0 == null || (wnVar = this.P2) == null || !MessagesController.getInstance(this.Q).richEditorAvailable()) {
            return;
        }
        ii.e2 e2Var = new ii.e2(str);
        e2Var.h = charSequence;
        e2Var.n = charSequence2;
        e2Var.setResourceProvider(this.W3);
        e2Var.J = wnVar;
        e2Var.s = wnVar.S;
        e2Var.v = wnVar.Y;
        e2Var.L = new je(this, 1);
        e2Var.K = new je(this, 2);
        wnVar.presentFragment(e2Var);
    }

    public final void K1(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        eg egVar;
        this.A0 = false;
        boolean z10 = true;
        this.b = true;
        this.z0 = true;
        this.x0 = true;
        this.y0 = true;
        if (chat != null) {
            this.a1 = (ChatObject.canSendVoice(chat) || (ChatObject.canSendRoundVideo(chat) && this.e2)) ? false : true;
            this.b = ChatObject.canSendStickers(chat);
            boolean canSendPlain = ChatObject.canSendPlain(chat);
            this.z0 = canSendPlain;
            boolean z11 = (this.b || canSendPlain) ? false : true;
            this.A0 = z11;
            this.n = z11 ? 0.5f : 1.0f;
            F1();
            if (!this.A0 && (egVar = this.U0) != null) {
                egVar.K(-this.Q2, !this.z0, !this.b);
            }
            this.x0 = ChatObject.canSendRoundVideo(chat);
            this.y0 = ChatObject.canSendVoice(chat);
        } else if (userFull != null) {
            this.a1 = userFull.voice_messages_forbidden;
            this.K = userFull;
        }
        float f7 = this.a1 ? 0.5f : 1.0f;
        ve veVar = this.Z0;
        veVar.setAlpha(f7);
        veVar.invalidate();
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.a1 ? i0(org.telegram.ui.ActionBar.h6.Wk) : -1, PorterDuff.Mode.SRC_IN);
        we weVar = this.b1;
        weVar.setColorFilter(porterDuffColorFilter);
        weVar.invalidate();
        G1(false);
        boolean z12 = this.c1;
        if (!this.x0 && z12) {
            z12 = false;
        }
        if (this.y0 || z12) {
            z10 = z12;
        } else if (!this.e2) {
            z10 = false;
        }
        k1(z10, false);
    }

    public final void L() {
        if (this.U0 == null) {
            return;
        }
        Point point = AndroidUtilities.displaySize;
        int i10 = point.x > point.y ? this.y2 : this.x2;
        int dp = ((((this.o1 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
        int i11 = 2;
        if (this.R1 == 2) {
            dp = Math.min(dp, AndroidUtilities.dp(175.0f) + i10);
        }
        int i12 = this.U0.getLayoutParams().height;
        if (i12 == dp) {
            return;
        }
        AnimatorSet animatorSet = this.B3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.B3 = null;
        }
        this.D3 = dp;
        org.telegram.ui.Cells.d1 d1Var = this.t3;
        if (i12 > dp) {
            td tdVar = new td(this, 6);
            this.U0.setLayerType(2, null);
            if (this.v) {
                this.w = tdVar;
            } else {
                AnimatorSet animatorSet2 = new AnimatorSet();
                if (this.d5 != null) {
                    animatorSet2.playTogether(ValueAnimator.ofInt(-(this.D3 - i10)), ValueAnimator.ofInt(-(this.D3 - i10)));
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofInt(this, d1Var, -(this.D3 - i10)), ObjectAnimator.ofInt(this.U0, d1Var, -(this.D3 - i10)));
                    ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new rd(this, i11));
                }
                animatorSet2.setDuration(300L);
                animatorSet2.setInterpolator(rr.f);
                animatorSet2.addListener(new ai.z(21, this, tdVar));
                this.B3 = animatorSet2;
                animatorSet2.start();
            }
        } else {
            if (this.d5 == null) {
                this.U0.getLayoutParams().height = this.D3;
            }
            this.m1.requestLayout();
            qf qfVar = this.E0;
            if (qfVar != null) {
                int selectionStart = qfVar.getSelectionStart();
                int selectionEnd = this.E0.getSelectionEnd();
                qf qfVar2 = this.E0;
                qfVar2.setText(qfVar2.getText());
                this.E0.setSelection(selectionStart, selectionEnd);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            if (this.d5 != null) {
                animatorSet3.playTogether(ValueAnimator.ofInt(-(this.D3 - i10)), ValueAnimator.ofInt(-(this.D3 - i10)));
            } else {
                animatorSet3.playTogether(ObjectAnimator.ofInt(this, d1Var, -(this.D3 - i10)), ObjectAnimator.ofInt(this.U0, d1Var, -(this.D3 - i10)));
                ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new rd(this, 3));
            }
            animatorSet3.setDuration(300L);
            animatorSet3.setInterpolator(rr.f);
            animatorSet3.addListener(new ze(this, 11));
            this.B3 = animatorSet3;
            this.U0.setLayerType(2, null);
            animatorSet3.start();
        }
        ph.f fVar = this.d5;
        if (fVar != null) {
            ((ph.i) fVar).g(dp);
        }
    }

    public final void L0() {
        td tdVar = new td(this, 28);
        if (SharedPrefsHelper.isWebViewConfirmShown(this.Q, this.Q2) || MessagesController.getInstance(this.Q).whitelistedBots.contains(Long.valueOf(this.Q2))) {
            tdVar.run();
            return;
        }
        e5.o(this.P2, MessagesController.getInstance(this.Q).getUser(Long.valueOf(this.Q2)), new kd(3, this, tdVar), new td(this, 29));
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
    public void L1(int i10, boolean z10) {
        boolean z11;
        int i11;
        char c10;
        float f7;
        int i12;
        ?? r10;
        boolean z12;
        int i13;
        long j3;
        ?? r102;
        int i14;
        float f10;
        ?? r103;
        int i15;
        float f11;
        boolean z13;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        int i16;
        char c11;
        char c12;
        Property property;
        zg zgVar = zg.a;
        zg zgVar2 = zg.b;
        Float valueOf = Float.valueOf(0.0f);
        Runnable runnable = this.f0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
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
                this.Q4 = i10;
                return;
            }
            boolean z15 = this.Q4 == 3;
            if (z15) {
                property = property3;
            } else {
                this.O = false;
                sg sgVar = this.O1;
                if (sgVar != null) {
                    sgVar.y.d(1, false, false);
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.Q);
                long j10 = this.Q2;
                org.telegram.ui.wn wnVar = this.P2;
                property = property3;
                mediaDataController.toggleDraftVoiceOnce(j10, (wnVar == null || !wnVar.h4) ? 0L : wnVar.d(), this.O);
                this.i1 = 0L;
            }
            X();
            this.w2 = 1;
            eg egVar = this.U0;
            if (egVar != null) {
                egVar.setEnabled(false);
            }
            try {
                if (this.q2 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.q2 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            AndroidUtilities.lockOrientation(this.O2);
            og ogVar = this.Z2;
            if (ogVar != null) {
                ogVar.a1(0);
            }
            AnimatorSet animatorSet = this.t2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.u2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            Z();
            ai.w5 w5Var = this.d1;
            if (w5Var != null) {
                w5Var.setVisibility(0);
            }
            Y();
            RecordCircle recordCircle2 = this.N1;
            if (recordCircle2 != null) {
                recordCircle2.M = false;
                recordCircle2.setVisibility(0);
                this.N1.setAmplitude(0.0d);
            }
            sg sgVar2 = this.O1;
            if (sgVar2 != null) {
                sgVar2.setVisibility(0);
            }
            ug ugVar = this.l1;
            if (ugVar != null) {
                ugVar.a = 1.0f;
                ugVar.b = System.currentTimeMillis();
                ugVar.r = -1L;
                ugVar.c = false;
                ugVar.e = false;
                ugVar.f.stop();
                ugVar.invalidate();
                this.l1.setScaleX(0.0f);
                this.l1.setScaleY(0.0f);
                this.l1.h = true;
            }
            this.t2 = new AnimatorSet();
            this.Y0.setTranslationX(AndroidUtilities.dp(20.0f));
            this.Y0.setAlpha(0.0f);
            if (this.Q4 != 3) {
                this.k1.setTranslationX(AndroidUtilities.dp(20.0f));
                this.k1.setAlpha(0.0f);
                this.k1.setCancelToProgress(0.0f);
                SlideTextView slideTextView = this.k1;
                slideTextView.r = 1.0f;
                slideTextView.setEnabled(true);
            } else {
                this.k1.setTranslationX(0.0f);
                this.k1.setAlpha(0.0f);
                this.k1.setCancelToProgress(1.0f);
                this.k1.setEnabled(true);
            }
            this.N1.c(this.Q4 == 3);
            this.k2 = false;
            x0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            Property property6 = property;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Z3, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.b4, 0.0f), ObjectAnimator.ofFloat(this.l1, (Property<ug, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.l1, (Property<ug, Float>) property6, 1.0f), ObjectAnimator.ofFloat(this.Y0, (Property<xg, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.Y0, (Property<xg, Float>) property5, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.k1, (Property<SlideTextView, Float>) property2, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.k1, (Property<SlideTextView, Float>) property5, 1.0f));
            sg sgVar3 = this.O1;
            if (sgVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(sgVar3, (Property<sg, Float>) property5, 1.0f));
            }
            if (this.b1 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Z0, (Property<ve, Float>) property5, 0.0f));
            }
            ei.c0 c0Var = this.l0;
            if (c0Var != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(c0Var, (Property<ei.c0, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.l0, (Property<ei.c0, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.l0, (Property<ei.c0, Float>) property5, 0.0f));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.E0, this.d4, AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.E0, (Property<qf, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.e1, (Property<le, Float>) property5, 1.0f));
            if (z15) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<rk0, Float>) property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<lj0, Float>) property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<lj0, Float>) property6, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<lj0, Float>) property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f1, (Property<i81, Float>) property5, 0.0f));
            }
            if (this.J1 != null) {
                animatorSet4.playTogether(p(AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.J1, (Property<af, Float>) property5, 0.0f));
            }
            org.telegram.ui.xd xdVar = this.p1;
            if (xdVar != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(xdVar, this.c4, AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.p1, this.a4, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.q1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.q1 = null;
                }
                hg.l lVar = this.r1;
                this.v1 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.r1, (Property<hg.l, Float>) property6, 0.5f), ObjectAnimator.ofFloat(this.r1, (Property<hg.l, Float>) property4, 0.5f));
            }
            jh.h hVar = this.e5;
            if (hVar != null) {
                hVar.e(0, false, true);
            }
            this.t2.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.N1, this.u3, 1.0f).setDuration(300L));
            if (!z15) {
                this.t2.playTogether(ObjectAnimator.ofFloat(this.N1, this.v3, 1.0f).setDuration(300L));
            }
            this.t2.addListener(new vf(this, z15));
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
                    FileLog.e(e7);
                }
            }
            AndroidUtilities.unlockOrientation(this.O2);
            this.m3 = false;
            if (this.w2 == 0) {
                this.Q4 = i10;
                return;
            }
            this.R.getMessagesController().sendTyping(this.Q2, getThreadMessageId(), 2, 0);
            this.w2 = 0;
            eg egVar2 = this.U0;
            if (egVar2 != null) {
                egVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.t2;
            if (animatorSet5 != null) {
                z11 = animatorSet5.isRunning();
                we weVar = this.b1;
                if (weVar != null) {
                    weVar.setScaleX(1.0f);
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
            qf qfVar = this.E0;
            if (qfVar != null) {
                qfVar.setVisibility(0);
            }
            this.t2 = new AnimatorSet();
            if (z11 || i10 == 4) {
                we weVar2 = this.b1;
                if (weVar2 != null) {
                    weVar2.setVisibility(0);
                }
                this.t2.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.b4, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.l1, (Property<ug, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.l1, (Property<ug, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.N1, this.u3, 0.0f), ObjectAnimator.ofFloat(this.N1, this.v3, 0.0f), ObjectAnimator.ofFloat(this.Z0, (Property<ve, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.Y0, (Property<xg, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.Z0, (Property<ve, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.E0, (Property<qf, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.E0, this.d4, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                sg sgVar4 = this.O1;
                if (sgVar4 != null) {
                    i11 = 1;
                    c10 = 0;
                    this.t2.playTogether(ObjectAnimator.ofFloat(sgVar4, (Property<sg, Float>) property5, 0.0f));
                    this.O1.a();
                } else {
                    i11 = 1;
                    c10 = 0;
                }
                ei.c0 c0Var2 = this.l0;
                if (c0Var2 != null) {
                    AnimatorSet animatorSet7 = this.t2;
                    float[] fArr = new float[i11];
                    f7 = 1.0f;
                    fArr[c10] = 1.0f;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0Var2, (Property<ei.c0, Float>) property4, fArr);
                    ei.c0 c0Var3 = this.l0;
                    float[] fArr2 = new float[i11];
                    fArr2[c10] = 1.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0Var3, (Property<ei.c0, Float>) property3, fArr2);
                    ei.c0 c0Var4 = this.l0;
                    float[] fArr3 = new float[i11];
                    fArr3[c10] = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c0Var4, (Property<ei.c0, Float>) property5, fArr3);
                    Animator[] animatorArr = new Animator[3];
                    animatorArr[c10] = ofFloat;
                    animatorArr[i11] = ofFloat2;
                    animatorArr[2] = ofFloat3;
                    animatorSet7.playTogether(animatorArr);
                } else {
                    f7 = 1.0f;
                }
                we weVar3 = this.b1;
                if (weVar3 != null) {
                    weVar3.setScaleX(f7);
                    this.b1.setScaleY(f7);
                    i12 = 1;
                    this.t2.playTogether(ObjectAnimator.ofFloat(this.Z0, (Property<ve, Float>) property5, f7));
                    this.b1.j(s0() ? zgVar2 : zgVar, true);
                } else {
                    i12 = 1;
                }
                if (this.J1 != null) {
                    AnimatorSet animatorSet8 = this.t2;
                    ValueAnimator p5 = p(0.0f);
                    af afVar = this.J1;
                    float[] fArr4 = new float[i12];
                    fArr4[0] = 1.0f;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(afVar, (Property<af, Float>) property5, fArr4);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = p5;
                    animatorArr2[i12] = ofFloat4;
                    animatorSet8.playTogether(animatorArr2);
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
                    AnimatorSet animatorSet9 = this.t2;
                    hg.l lVar2 = this.r1;
                    this.v1 = 1.0f;
                    animatorSet9.playTogether(ObjectAnimator.ofFloat(lVar2, (Property<hg.l, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<hg.l, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<hg.l, Float>) property4, 1.0f));
                } else {
                    r10 = 0;
                    z12 = true;
                }
                jh.h hVar2 = this.e5;
                if (hVar2 != 0) {
                    hVar2.e(r10, r10, z12);
                }
                this.k2 = z12;
                x0();
                this.t2.setDuration(150L);
            } else if (i10 == 3) {
                X();
                Y();
                SlideTextView slideTextView2 = this.k1;
                if (slideTextView2 != null) {
                    slideTextView2.setEnabled(false);
                }
                if (this.c1) {
                    rk0 rk0Var = this.h1;
                    if (rk0Var != null) {
                        rk0Var.setVisibility(8);
                    }
                    le leVar = this.e1;
                    if (leVar != null) {
                        leVar.setAlpha(1.0f);
                        this.e1.setVisibility(0);
                    }
                    lj0 lj0Var = this.g1;
                    if (lj0Var != null) {
                        lj0Var.setProgress(0.0f);
                        this.g1.i();
                    }
                    z13 = true;
                    f11 = 1.0f;
                } else {
                    i81 i81Var = this.f1;
                    if (i81Var != null) {
                        i81Var.setVisibility(8);
                        x0();
                    }
                    le leVar2 = this.e1;
                    if (leVar2 != null) {
                        leVar2.setVisibility(0);
                        f11 = 1.0f;
                        this.e1.setAlpha(1.0f);
                    } else {
                        f11 = 1.0f;
                    }
                    rk0 rk0Var2 = this.h1;
                    if (rk0Var2 != null) {
                        rk0Var2.setVisibility(0);
                        this.h1.setAlpha(0.0f);
                    }
                    z13 = true;
                }
                this.s4 = z13;
                this.n4 = f11;
                this.l4 = this.k4;
                this.j4 = f11;
                SlideTextView slideTextView3 = this.k1;
                if (slideTextView3 != null) {
                    slideTextView3.setCancelToProgress(f11);
                }
                sg sgVar5 = this.O1;
                if (sgVar5 != null) {
                    sgVar5.invalidate();
                }
                lj0 lj0Var2 = this.g1;
                if (lj0Var2 != null) {
                    lj0Var2.setAlpha(0.0f);
                    this.g1.setScaleX(0.0f);
                    this.g1.setScaleY(0.0f);
                    this.g1.setProgress(0.0f);
                    this.g1.i();
                }
                if (s0() || this.z4) {
                    this.f1.setVisibility(0);
                    viewGroup = null;
                    layoutParams = null;
                } else {
                    viewGroup = (ViewGroup) this.e1.getParent();
                    layoutParams = this.e1.getLayoutParams();
                    viewGroup.removeView(this.e1);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.Z1 == null ? org.telegram.messenger.f0.b(44.0f, this.J0.l(), 0) : 0), AndroidUtilities.dp(44.0f));
                    layoutParams2.gravity = 80;
                    layoutParams2.leftMargin = AndroidUtilities.dp(7.0f);
                    layoutParams2.rightMargin = AndroidUtilities.dp(7.0f);
                    this.m1.addView(this.e1, layoutParams2);
                    this.f1.setVisibility(8);
                }
                x0();
                AnimatorSet animatorSet10 = new AnimatorSet();
                if (z10) {
                    this.h1.setAllowDraw(false);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat5.addUpdateListener(new rd(this, 6));
                    ofFloat5.addListener(new wf(this));
                    ofFloat5.setDuration(s0() ? 490L : 580L);
                    AnimatorSet animatorSet11 = new AnimatorSet();
                    animatorSet11.playTogether(ObjectAnimator.ofFloat(this.l1, (Property<ug, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.l1, (Property<ug, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.Y0, (Property<xg, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.Y0, (Property<xg, Float>) property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.k1, (Property<SlideTextView, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<lj0, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.g1, (Property<lj0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.g1, (Property<lj0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.Z3, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.b4, 0.0f), ObjectAnimator.ofFloat(this.E0, (Property<qf, Float>) property5, 0.0f));
                    lj0 lj0Var3 = this.g1;
                    if (lj0Var3 != null) {
                        lj0Var3.setAlpha(0.0f);
                        this.g1.setScaleX(0.0f);
                        this.g1.setScaleY(0.0f);
                    }
                    if (this.b1 != null) {
                        i16 = 1;
                        animatorSet11.playTogether(ObjectAnimator.ofFloat(this.Z0, (Property<ve, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<ve, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<ve, Float>) property4, 1.0f));
                        this.b1.j(s0() ? zgVar2 : zgVar, true);
                    } else {
                        i16 = 1;
                    }
                    ei.c0 c0Var5 = this.l0;
                    if (c0Var5 != null) {
                        float[] fArr5 = new float[i16];
                        fArr5[0] = 0.0f;
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(c0Var5, (Property<ei.c0, Float>) property5, fArr5);
                        ei.c0 c0Var6 = this.l0;
                        float[] fArr6 = new float[i16];
                        fArr6[0] = 0.0f;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(c0Var6, (Property<ei.c0, Float>) property3, fArr6);
                        ei.c0 c0Var7 = this.l0;
                        float[] fArr7 = new float[i16];
                        fArr7[0] = 0.0f;
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(c0Var7, (Property<ei.c0, Float>) property4, fArr7);
                        Animator[] animatorArr3 = new Animator[3];
                        animatorArr3[0] = ofFloat6;
                        animatorArr3[i16] = ofFloat7;
                        animatorArr3[2] = ofFloat8;
                        animatorSet11.playTogether(animatorArr3);
                    }
                    animatorSet11.addListener(new ze(this, 8));
                    animatorSet11.setDuration(150L);
                    animatorSet11.setStartDelay(150L);
                    if (s0()) {
                        this.f1.setAlpha(0.0f);
                        c11 = 1;
                        c12 = 0;
                        animatorSet10.playTogether(ObjectAnimator.ofFloat(this.f1, (Property<i81, Float>) property5, 1.0f));
                        animatorSet10.setDuration(150L);
                        animatorSet10.setStartDelay(430L);
                    } else {
                        c11 = 1;
                        c12 = 0;
                    }
                    AnimatorSet animatorSet12 = this.t2;
                    Animator[] animatorArr4 = new Animator[3];
                    animatorArr4[c12] = animatorSet11;
                    animatorArr4[c11] = ofFloat5;
                    animatorArr4[2] = animatorSet10;
                    animatorSet12.playTogether(animatorArr4);
                    this.t2.addListener(new ai.y4(this, viewGroup, layoutParams, 2));
                } else {
                    Z();
                    this.u3.set(this.N1, Float.valueOf(1.0f));
                    this.N1.setTransformToSeekbar(1.0f);
                    if (!s0()) {
                        float f12 = this.p4;
                        if (f12 != 0.0f && this.h1 != null) {
                            this.h1.setAlpha(rr.j.getInterpolation(Math.max(0.0f, ((f12 - 0.38f) - 0.25f) / 0.37f)));
                            this.h1.invalidate();
                        }
                    }
                    this.l1.setScaleY(0.0f);
                    this.l1.setScaleX(0.0f);
                    this.Y0.setAlpha(0.0f);
                    this.Y0.setTranslationX(-AndroidUtilities.dp(20.0f));
                    this.k1.setAlpha(0.0f);
                    this.g1.setAlpha(1.0f);
                    this.g1.setScaleY(1.0f);
                    this.g1.setScaleX(1.0f);
                    this.Z3.set(this.Q0, valueOf);
                    this.b4.set(this.Q0, valueOf);
                    this.E0.setAlpha(0.0f);
                    we weVar4 = this.b1;
                    if (weVar4 != null) {
                        if (s0()) {
                            zgVar = zgVar2;
                        }
                        weVar4.j(zgVar, z10);
                        this.Z0.setAlpha(1.0f);
                        this.Z0.setScaleX(1.0f);
                        this.Z0.setScaleY(1.0f);
                    }
                    ei.c0 c0Var8 = this.l0;
                    if (c0Var8 != null) {
                        c0Var8.setAlpha(0.0f);
                        this.l0.setScaleX(0.0f);
                        this.l0.setScaleY(0.0f);
                    }
                    if (s0()) {
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
                    F1();
                    x0();
                }
            } else if (i10 == 2 || i10 == 5) {
                we weVar5 = this.b1;
                if (weVar5 != null) {
                    weVar5.setVisibility(0);
                }
                this.k2 = true;
                x0();
                AnimatorSet animatorSet13 = new AnimatorSet();
                animatorSet13.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.b4, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.l1, (Property<ug, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.l1, (Property<ug, Float>) property3, 0.0f));
                sg sgVar6 = this.O1;
                if (sgVar6 != null) {
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(sgVar6, (Property<sg, Float>) property5, 0.0f));
                    this.O1.a();
                }
                ei.c0 c0Var9 = this.l0;
                if (c0Var9 != null) {
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(c0Var9, (Property<ei.c0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<ei.c0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<ei.c0, Float>) property5, 1.0f));
                }
                AnimatorSet animatorSet14 = new AnimatorSet();
                animatorSet14.playTogether(ObjectAnimator.ofFloat(this.Y0, (Property<xg, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.Y0, (Property<xg, Float>) property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.k1, (Property<SlideTextView, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.k1, (Property<SlideTextView, Float>) property2, -AndroidUtilities.dp(20.0f)));
                if (i10 != 5) {
                    this.Z0.setScaleX(0.0f);
                    this.Z0.setScaleY(0.0f);
                    hg.l lVar3 = this.r1;
                    if (lVar3 != null && lVar3.getVisibility() == 0) {
                        this.r1.setScaleX(0.5f);
                        this.r1.setScaleY(0.5f);
                    }
                    cf cfVar = this.x1;
                    if (cfVar != null && cfVar.getVisibility() == 0) {
                        this.x1.setScaleX(0.0f);
                        this.x1.setScaleY(0.0f);
                    }
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<ve, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<ve, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<ve, Float>) property5, 1.0f));
                    if (this.p1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator3 = this.q1;
                        if (viewPropertyAnimator3 != null) {
                            viewPropertyAnimator3.cancel();
                            this.q1 = null;
                        }
                        i14 = 1;
                        r102 = 0;
                        animatorSet13.playTogether(ObjectAnimator.ofFloat(this.p1, this.a4, 1.0f), ObjectAnimator.ofFloat(this.p1, this.c4, 0.0f));
                        hg.l lVar4 = this.r1;
                        this.v1 = 1.0f;
                        animatorSet13.playTogether(ObjectAnimator.ofFloat(lVar4, (Property<hg.l, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<hg.l, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<hg.l, Float>) property4, 1.0f));
                    } else {
                        r102 = 0;
                        i14 = 1;
                    }
                    jh.h hVar3 = this.e5;
                    if (hVar3 != 0) {
                        hVar3.e(r102, r102, i14);
                    }
                    cf cfVar2 = this.x1;
                    if (cfVar2 != null) {
                        float[] fArr8 = new float[i14];
                        fArr8[r102] = 1.0f;
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(cfVar2, (Property<cf, Float>) property3, fArr8);
                        cf cfVar3 = this.x1;
                        float[] fArr9 = new float[i14];
                        fArr9[r102] = 1.0f;
                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(cfVar3, (Property<cf, Float>) property4, fArr9);
                        Animator[] animatorArr5 = new Animator[2];
                        animatorArr5[r102] = ofFloat9;
                        animatorArr5[i14] = ofFloat10;
                        animatorSet13.playTogether(animatorArr5);
                    }
                    if (this.b1 != null) {
                        ve veVar = this.Z0;
                        float[] fArr10 = new float[i14];
                        fArr10[r102] = 1.0f;
                        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(veVar, (Property<ve, Float>) property5, fArr10);
                        Animator[] animatorArr6 = new Animator[i14];
                        animatorArr6[r102] = ofFloat11;
                        animatorSet13.playTogether(animatorArr6);
                        ve veVar2 = this.Z0;
                        float[] fArr11 = new float[i14];
                        fArr11[r102] = 1.0f;
                        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(veVar2, (Property<ve, Float>) property3, fArr11);
                        Animator[] animatorArr7 = new Animator[i14];
                        animatorArr7[r102] = ofFloat12;
                        animatorSet13.playTogether(animatorArr7);
                        ve veVar3 = this.Z0;
                        float[] fArr12 = new float[i14];
                        fArr12[r102] = 1.0f;
                        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(veVar3, (Property<ve, Float>) property4, fArr12);
                        Animator[] animatorArr8 = new Animator[i14];
                        animatorArr8[r102] = ofFloat13;
                        animatorSet13.playTogether(animatorArr8);
                        this.b1.j(s0() ? zgVar2 : zgVar, i14);
                    }
                    af afVar2 = this.J1;
                    if (afVar2 != null) {
                        float[] fArr13 = new float[i14];
                        fArr13[0] = 1.0f;
                        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(afVar2, (Property<af, Float>) property5, fArr13);
                        ValueAnimator p10 = p(0.0f);
                        Animator[] animatorArr9 = new Animator[2];
                        animatorArr9[0] = ofFloat14;
                        animatorArr9[i14] = p10;
                        animatorSet13.playTogether(animatorArr9);
                    }
                    j3 = 150;
                } else {
                    AnimatorSet animatorSet15 = new AnimatorSet();
                    animatorSet15.playTogether(ObjectAnimator.ofFloat(this.Z0, (Property<ve, Float>) property5, 1.0f));
                    if (this.p1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.q1;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.q1 = null;
                        }
                        i13 = 1;
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(this.p1, this.c4, 0.0f), ObjectAnimator.ofFloat(this.p1, this.a4, 1.0f));
                        hg.l lVar5 = this.r1;
                        this.v1 = 1.0f;
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(lVar5, (Property<hg.l, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<hg.l, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<hg.l, Float>) property4, 1.0f));
                    } else {
                        i13 = 1;
                    }
                    jh.h hVar4 = this.e5;
                    if (hVar4 != null) {
                        hVar4.e(0, false, i13);
                    }
                    af afVar3 = this.J1;
                    if (afVar3 != null) {
                        float[] fArr14 = new float[i13];
                        fArr14[0] = 1.0f;
                        ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(afVar3, (Property<af, Float>) property5, fArr14);
                        ValueAnimator p11 = p(0.0f);
                        Animator[] animatorArr10 = new Animator[2];
                        animatorArr10[0] = ofFloat15;
                        animatorArr10[i13] = p11;
                        animatorSet15.playTogether(animatorArr10);
                    }
                    j3 = 150;
                    animatorSet15.setDuration(150L);
                    animatorSet15.setStartDelay(110L);
                    animatorSet15.addListener(new ze(this, 9));
                    AnimatorSet animatorSet16 = this.t2;
                    Animator[] animatorArr11 = new Animator[i13];
                    animatorArr11[0] = animatorSet15;
                    animatorSet16.playTogether(animatorArr11);
                }
                animatorSet13.setDuration(j3);
                animatorSet13.setStartDelay(700L);
                animatorSet14.setDuration(200L);
                animatorSet14.setStartDelay(200L);
                this.G = 0.0f;
                J1();
                ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(this.E0, (Property<qf, Float>) property5, 1.0f);
                ofFloat16.setStartDelay(this.s == 1.0f ? 300L : 700L);
                ofFloat16.setDuration(200L);
                this.t2.playTogether(animatorSet13, animatorSet14, ofFloat16, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.k4).setDuration(200L));
                if (i10 == 5) {
                    ChatActivityEnterView.this.r4 = true;
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                    duration.setInterpolator(rr.j);
                    this.t2.playTogether(duration);
                } else {
                    ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                    ofFloat17.setDuration(360L);
                    ofFloat17.setStartDelay(490L);
                    this.t2.playTogether(ofFloat17);
                }
                ug ugVar2 = this.l1;
                if (ugVar2 != null) {
                    ugVar2.e = true;
                    ij0 ij0Var = ugVar2.f;
                    ij0Var.T(0.0f, true);
                    if (ugVar2.d) {
                        ij0Var.start();
                    }
                }
            } else {
                we weVar6 = this.b1;
                if (weVar6 != null) {
                    weVar6.setVisibility(0);
                }
                AnimatorSet animatorSet17 = new AnimatorSet();
                animatorSet17.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.b4, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.l1, (Property<ug, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.l1, (Property<ug, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.Z0, (Property<ve, Float>) property5, 1.0f));
                sg sgVar7 = this.O1;
                if (sgVar7 != null) {
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(sgVar7, (Property<sg, Float>) property5, 0.0f));
                    this.O1.a();
                }
                ei.c0 c0Var10 = this.l0;
                if (c0Var10 != null) {
                    f10 = 1.0f;
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(c0Var10, (Property<ei.c0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<ei.c0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<ei.c0, Float>) property5, 1.0f));
                } else {
                    f10 = 1.0f;
                }
                we weVar7 = this.b1;
                if (weVar7 != null) {
                    weVar7.setScaleX(f10);
                    this.b1.setScaleY(f10);
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(this.Z0, (Property<ve, Float>) property5, f10));
                    this.b1.j(s0() ? zgVar2 : zgVar, true);
                }
                if (this.p1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator5 = this.q1;
                    if (viewPropertyAnimator5 != null) {
                        viewPropertyAnimator5.cancel();
                        this.q1 = null;
                    }
                    this.x = 0.0f;
                    A1();
                    i15 = 1;
                    r103 = 0;
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(this.p1, this.a4, 1.0f));
                    hg.l lVar6 = this.r1;
                    this.v1 = 1.0f;
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(lVar6, (Property<hg.l, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<hg.l, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<hg.l, Float>) property4, 1.0f));
                } else {
                    r103 = 0;
                    i15 = 1;
                }
                jh.h hVar5 = this.e5;
                if (hVar5 != 0) {
                    hVar5.e(r103, r103, i15);
                }
                af afVar4 = this.J1;
                if (afVar4 != null) {
                    float[] fArr15 = new float[i15];
                    fArr15[r103] = 1.0f;
                    ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(afVar4, (Property<af, Float>) property5, fArr15);
                    ValueAnimator p12 = p(0.0f);
                    Animator[] animatorArr12 = new Animator[2];
                    animatorArr12[r103] = ofFloat18;
                    animatorArr12[i15] = p12;
                    animatorSet17.playTogether(animatorArr12);
                }
                animatorSet17.setDuration(150L);
                animatorSet17.setStartDelay(200L);
                AnimatorSet animatorSet18 = new AnimatorSet();
                xg xgVar = this.Y0;
                float[] fArr16 = new float[i15];
                fArr16[r103] = 0.0f;
                ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(xgVar, (Property<xg, Float>) property5, fArr16);
                xg xgVar2 = this.Y0;
                float[] fArr17 = new float[i15];
                fArr17[r103] = AndroidUtilities.dp(40.0f);
                ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(xgVar2, (Property<xg, Float>) property2, fArr17);
                SlideTextView slideTextView4 = this.k1;
                float[] fArr18 = new float[i15];
                fArr18[r103] = 0.0f;
                ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(slideTextView4, (Property<SlideTextView, Float>) property5, fArr18);
                SlideTextView slideTextView5 = this.k1;
                float[] fArr19 = new float[i15];
                fArr19[r103] = AndroidUtilities.dp(40.0f);
                ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(slideTextView5, (Property<SlideTextView, Float>) property2, fArr19);
                Animator[] animatorArr13 = new Animator[4];
                animatorArr13[r103] = ofFloat19;
                animatorArr13[i15] = ofFloat20;
                animatorArr13[2] = ofFloat21;
                animatorArr13[3] = ofFloat22;
                animatorSet18.playTogether(animatorArr13);
                animatorSet18.setDuration(150L);
                float[] fArr20 = new float[i15];
                fArr20[r103] = 1.0f;
                ObjectAnimator ofFloat23 = ObjectAnimator.ofFloat(this, "exitTransition", fArr20);
                ofFloat23.setDuration(this.g0 ? 220L : 360L);
                this.G = 0.0f;
                J1();
                ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(this.E0, (Property<qf, Float>) property5, 1.0f);
                ofFloat24.setStartDelay(this.s == 1.0f ? 150L : 450L);
                ofFloat24.setDuration(200L);
                this.t2.playTogether(animatorSet17, animatorSet18, ofFloat24, ofFloat23);
            }
            this.t2.addListener(new yf(this, i10));
            this.t2.start();
            xg xgVar3 = this.Y0;
            if (xgVar3 != null) {
                xgVar3.b();
            }
        }
        this.Z2.g();
        P1(true);
        this.Q4 = i10;
    }

    public final void M() {
        this.k5 = y(true);
        float y3 = y(false);
        if (this.j5 != y3) {
            this.j5 = y3;
            A0(y3);
        }
    }

    public final boolean M0() {
        return this.V0 != null;
    }

    public final void M1() {
        int i02 = i0(org.telegram.ui.ActionBar.h6.jf);
        int i03 = i0(org.telegram.ui.ActionBar.h6.Sd);
        int i04 = i0(org.telegram.ui.ActionBar.h6.df);
        lj0 lj0Var = this.g1;
        if (lj0Var != null) {
            lj0Var.h(i02, "Cup Red");
            this.g1.h(i02, "Box Red");
            this.g1.h(i04, "Cup Grey");
            this.g1.h(i04, "Box Grey");
            this.g1.h(i04, "Box_Grey 2");
            this.g1.h(i04, "Line 1");
            this.g1.h(i04, "Line 2");
            this.g1.h(i04, "Line 3");
            this.g1.h(i03, "Line 1 Dup");
            this.g1.h(i03, "Line 2 Dup");
            this.g1.h(i03, "Line 3 Dup");
        }
    }

    public final void N() {
        float f7 = this.g5.e;
        if (this.G1 != null) {
            float measuredHeight = getMeasuredHeight() - this.f5.e;
            this.G1.setTranslationY(measuredHeight - (r4.getMeasuredHeight() * f7));
            this.G1.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        boolean z10 = f7 > 0.0f;
        if (this.M4 == z10) {
            return;
        }
        le leVar = this.z1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) leVar.getLayoutParams();
        int i10 = z10 ? this.G1.getLayoutParams().height : 0;
        layoutParams.topMargin = i10;
        layoutParams.topMargin = AndroidUtilities.dp(9.0f) + i10;
        leVar.setLayoutParams(layoutParams);
        this.M4 = z10;
        setMinimumHeight(AndroidUtilities.dp(44.0f) + (z10 ? this.G1.getLayoutParams().height : 0));
        if (this.z3) {
            if (this.R1 == 0) {
                n1(false, true, false, true);
            } else {
                L();
            }
        }
    }

    public boolean N0() {
        return true;
    }

    public final void N1() {
        RichMessageLayout.PreviewView previewView = this.C1;
        if (previewView == null) {
            return;
        }
        boolean z10 = this.D1;
        boolean z11 = this.E1 != null && this.Z1 == null;
        this.D1 = z11;
        ye yeVar = this.J0;
        ImageView imageView = this.R0;
        oe oeVar = this.Q0;
        if (z11) {
            previewView.setResourcesProvider(this.W3);
            this.C1.set(this.E1);
            this.C1.setVisibility(0);
            qf qfVar = this.E0;
            if (qfVar != null) {
                qfVar.setVisibility(8);
            }
            oeVar.setVisibility(8);
            imageView.setVisibility(0);
            yeVar.setLocked(!UserConfig.getInstance(this.Q).isPremium());
        } else {
            previewView.setVisibility(8);
            qf qfVar2 = this.E0;
            if (qfVar2 != null) {
                qfVar2.setVisibility(0);
            }
            oeVar.setVisibility(0);
            imageView.setVisibility(8);
            yeVar.setLocked(false);
        }
        E1();
        if (z10 != this.D1) {
            K(true);
        }
    }

    public final void O() {
        org.telegram.ui.wn wnVar = this.P2;
        if (wnVar != null) {
            MediaDataController.getInstance(this.Q).saveDraft(wnVar.a(), wnVar.B7(wnVar.n5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final void O0(int i10, int i11, CharSequence charSequence, boolean z10) {
        if (this.E0 == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.E0.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
            }
            this.E0.setText(spannableStringBuilder);
            this.E0.setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void O1(boolean z10) {
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean isChatDialog = DialogObject.isChatDialog(this.Q2);
        ImageView imageView = this.I1;
        if (isChatDialog) {
            TLRPC.Chat chat = this.R.getMessagesController().getChat(Long.valueOf(-this.Q2));
            this.g2 = MessagesController.getNotificationsSettings(this.Q).getBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + this.Q2, false);
            z11 = ChatObject.isChannel(chat) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages)) && !chat.megagroup;
            this.h2 = z11;
            if (imageView != null) {
                if (this.e0 == null) {
                    this.e0 = new or(getContext(), R.drawable.input_notify_on, org.telegram.ui.ActionBar.h6.Wk);
                }
                this.e0.a(this.g2, false);
                imageView.setImageDrawable(this.e0);
            } else {
                z11 = false;
            }
            org.telegram.ui.xd xdVar = this.p1;
            if (xdVar != null) {
                H1(xdVar.getVisibility() == 0 ? 1 : 0);
            }
        } else {
            z11 = false;
        }
        boolean z12 = (this.Z2 == null || c() || !this.Z2.C0()) ? false : true;
        boolean z13 = (!z12 || this.L1 || this.F2) ? false : true;
        if (z13) {
            a0();
        }
        af afVar = this.J1;
        if (afVar != null) {
            if ((afVar.getTag() != null && z13) || (this.J1.getTag() == null && !z13)) {
                if (imageView != null) {
                    int i10 = (z12 || !z11 || this.J1.getVisibility() == 0) ? 8 : 0;
                    if (i10 != imageView.getVisibility()) {
                        imageView.setVisibility(i10);
                        return;
                    }
                    return;
                }
                return;
            }
            this.J1.setTag(z13 ? 1 : null);
        } else if (imageView != null) {
            int i11 = (z12 || !z11) ? 8 : 0;
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
            af afVar2 = this.J1;
            if (afVar2 != null) {
                if (z13) {
                    afVar2.setVisibility(0);
                }
                this.J1.setPivotX(AndroidUtilities.dp(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.M1 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.J1, (Property<af, Float>) View.ALPHA, z13 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.J1, (Property<af, Float>) View.SCALE_X, z13 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.J1, (Property<af, Float>) View.SCALE_Y, z13 ? 1.0f : 0.1f));
                this.M1.setDuration(180L);
                this.M1.addListener(new df(this, z13, 2));
                this.M1.start();
                return;
            }
            return;
        }
        af afVar3 = this.J1;
        if (afVar3 == null) {
            if (imageView != null) {
                imageView.setVisibility(z11 ? 0 : 8);
                return;
            }
            return;
        }
        afVar3.setVisibility(z13 ? 0 : 8);
        this.J1.setAlpha(z13 ? 1.0f : 0.0f);
        this.J1.setScaleX(z13 ? 1.0f : 0.1f);
        this.J1.setScaleY(z13 ? 1.0f : 0.1f);
        if (imageView != null) {
            imageView.setVisibility((!z11 || this.J1.getVisibility() == 0) ? 8 : 0);
        }
        this.J1.setTranslationX(0.0f);
    }

    public final void P() {
        AndroidUtilities.hideKeyboard(this.E0);
    }

    public final void P0() {
        n1(false, true, false, true);
        t1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.F2 = false;
        we weVar = this.b1;
        if (weVar != null) {
            weVar.setVisibility(0);
        }
        this.k2 = true;
        x0();
        z();
        p0();
        sg sgVar = this.O1;
        if (sgVar != null) {
            sgVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }

    public void P1(boolean z10) {
        Q1(false, z10);
    }

    public final void Q() {
        if (this.x1 != null) {
            return;
        }
        cf cfVar = new cf(this, getContext(), 1);
        this.x1 = cfVar;
        bm0 bm0Var = new bm0(getContext());
        this.U1 = bm0Var;
        cfVar.setImageDrawable(bm0Var);
        this.U1.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.h6.Wk), PorterDuff.Mode.MULTIPLY));
        this.U1.a(R.drawable.input_bot2, false);
        this.x1.setScaleType(ImageView.ScaleType.CENTER);
        this.x1.setBackground(org.telegram.ui.ActionBar.h6.f0(i0(org.telegram.ui.ActionBar.h6.i6), 1, -1));
        this.x1.setVisibility(8);
        AndroidUtilities.updateViewVisibilityAnimated(this.x1, false, 0.1f, false);
        this.p1.addView(this.x1, 0, w7.y5.n(44, 44));
        this.x1.setOnClickListener(new vd(this, 15));
    }

    public final void Q0(TL_iv.RichMessage richMessage) {
        org.telegram.ui.wn wnVar = this.P2;
        if (wnVar != null) {
            MediaDataController.getInstance(this.Q).saveDraft(wnVar.a(), wnVar.B7(wnVar.n5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void Q1(boolean z10, boolean z11) {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        float f7;
        float f10;
        jp0 jp0Var;
        jp0 jp0Var2;
        le leVar;
        if (this.Z2 == null) {
            return;
        }
        W();
        if (this.l5) {
            peer = this.Z2.v();
            chat = null;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.Q).getChat(Long.valueOf(-this.Q2));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.Q).getChatFull(-this.Q2);
            TLRPC.Peer peer2 = chatFull != null ? chatFull.default_send_as : null;
            chat = chat2;
            peer = peer2;
        }
        if (peer == null && this.Z2.J() != null && !this.Z2.J().peers.isEmpty()) {
            peer = this.Z2.J().peers.get(0).peer;
        }
        org.telegram.ui.wn wnVar = this.P2;
        boolean z12 = (z10 || peer == null || (this.Z2.J() != null && this.Z2.J().peers.size() <= 1) || r0() || w0() || (((leVar = this.e1) != null && leVar.getVisibility() == 0) || ((!this.l5 && ((ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.canSendAsPeers(chat)) || ChatObject.isMonoForum(chat))) || (wnVar != null && wnVar.R3 == 9)))) ? false : true;
        if (z12) {
            b0();
        }
        if (peer != null) {
            if (peer.channel_id != 0) {
                TLRPC.Chat chat3 = MessagesController.getInstance(this.Q).getChat(Long.valueOf(peer.channel_id));
                if (chat3 != null && (jp0Var2 = this.p0) != null) {
                    jp0Var2.setAvatar(chat3);
                    this.p0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, chat3.title));
                }
            } else {
                TLRPC.User user = MessagesController.getInstance(this.Q).getUser(Long.valueOf(peer.user_id));
                if (user != null && (jp0Var = this.p0) != null) {
                    jp0Var.setAvatar(user);
                    this.p0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, ContactsController.formatName(user.first_name, user.last_name)));
                }
            }
        }
        jp0 jp0Var3 = this.p0;
        boolean z13 = jp0Var3 != null && jp0Var3.getVisibility() == 0;
        int dp = AndroidUtilities.dp(2.0f);
        float f11 = z12 ? 0.0f : 1.0f;
        float f12 = z12 ? 1.0f : 0.0f;
        jp0 jp0Var4 = this.p0;
        if (jp0Var4 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jp0Var4.getLayoutParams();
            f10 = z12 ? ((-this.p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp : 0.0f;
            f7 = z12 ? 0.0f : ((-this.p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        if (z13 == z12) {
            return;
        }
        jp0 jp0Var5 = this.p0;
        ValueAnimator valueAnimator = jp0Var5 == null ? null : (ValueAnimator) jp0Var5.getTag();
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.p0.setTag(null);
        }
        if ((this.l5 || (wnVar != null && wnVar.F8() == 0 && wnVar.O5)) && z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            jp0 jp0Var6 = this.p0;
            if (jp0Var6 != null) {
                jp0Var6.setTranslationX(f10);
            }
            this.G = f10;
            J1();
            float f13 = f7;
            float f14 = f12;
            float f15 = f10;
            duration.addUpdateListener(new s5(this, f15, f13, f11, f14, 1));
            duration.addListener(new ag(this, z12, f11, f15, f14, f13));
            duration.start();
            jp0 jp0Var7 = this.p0;
            if (jp0Var7 != null) {
                jp0Var7.setTag(duration);
                return;
            }
            return;
        }
        float f16 = f7;
        float f17 = f12;
        boolean z14 = z12;
        if (z14) {
            b0();
        }
        jp0 jp0Var8 = this.p0;
        if (jp0Var8 != null) {
            jp0Var8.setVisibility(z14 ? 0 : 8);
            this.p0.setTranslationX(f16);
        }
        float f18 = z14 ? f16 : 0.0f;
        this.Q0.setTranslationX(f18);
        this.G = f18;
        J1();
        jp0 jp0Var9 = this.p0;
        if (jp0Var9 != null) {
            jp0Var9.setAlpha(f17);
            this.p0.setTag(null);
        }
    }

    public final void R() {
        if (this.l0 != null) {
            return;
        }
        ei.c0 c0Var = new ei.c0(getContext());
        this.l0 = c0Var;
        c0Var.setOnClickListener(new vd(this, 7));
        this.y1.addView(this.l0, w7.y5.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
        AndroidUtilities.updateViewVisibilityAnimated(this.l0, false, 1.0f, false);
        ei.c0 c0Var2 = this.l0;
        if (!c0Var2.f) {
            c0Var2.f = true;
            c0Var2.h = 1.0f;
            c0Var2.requestLayout();
            c0Var2.invalidate();
        }
    }

    public final void R0(SpannableStringBuilder spannableStringBuilder, boolean z10, int i10, int i11) {
        if (this.E0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
        z5[] z5VarArr = (z5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), z5.class);
        if (z5VarArr != null) {
            for (z5 z5Var : z5VarArr) {
                z5Var.applyFontMetrics(this.E0.getPaint().getFontMetricsInt(), q5.g());
            }
        }
        dj0.a(spannableStringBuilder2);
        O();
        setFieldText(spannableStringBuilder2);
        T0(i10, z10, i11, true, 0L);
    }

    public final void R1() {
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
            if (starsPrice > 0 || this.l5) {
                this.J0.i(1, starsPrice, true);
            }
            H1(this.P4);
        }
        if (this.l5) {
            S();
            if (t()) {
                int[] iArr = MessagesController.getInstance(this.Q).starsGroupcallMessageLimits;
                b10 = (iArr == null || iArr.length <= 2) ? 400 : iArr[2];
            } else {
                b10 = ai.g0.b(this.Q, (int) starsPrice, 1);
            }
            if (this.c0 != b10) {
                this.c0 = b10;
                if (b10 > 0) {
                    int i10 = b10 - this.d0;
                    if (i10 <= (this.l5 ? 5 : 100)) {
                        if (i10 < -9999) {
                            i10 = -9999;
                        }
                        S();
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
                        this.b0.setTextColor(i0(i10 < 0 ? org.telegram.ui.ActionBar.h6.p7 : org.telegram.ui.ActionBar.h6.y6));
                        return;
                    }
                }
                NumberTextView numberTextView2 = this.b0;
                if (numberTextView2 != null) {
                    numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ze(this, 0));
                }
            }
        }
    }

    public final void S() {
        if (this.b0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.b0 = numberTextView;
        numberTextView.setVisibility(8);
        this.b0.setTextSize(15);
        this.b0.setTextColor(i0(org.telegram.ui.ActionBar.h6.y6));
        this.b0.setTypeface(AndroidUtilities.bold());
        this.b0.setCenterAlign(true);
        addView(this.b0, Math.min(2, getChildCount()), w7.y5.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public boolean S0() {
        boolean z10 = this.D1;
        org.telegram.ui.ActionBar.d6 d6Var = this.W3;
        if (z10 && !UserConfig.getInstance(this.Q).isPremium()) {
            ii.e2.p0(getContext(), new td(this, 20), new td(this, 21), d6Var);
            return true;
        }
        if (!c()) {
            return T0(0, true, 0, true, 0L);
        }
        e5.M(this.O2, this.P2.a(), new ef(this), d6Var);
        return true;
    }

    public final void S1() {
        int i10;
        boolean isUploadingMessageIdDialog;
        int currentTime = ConnectionsManager.getInstance(this.Q).getCurrentTime();
        AndroidUtilities.cancelRunOnUIThread(this.H0);
        this.H0 = null;
        TLRPC.ChatFull chatFull = this.d2;
        if (chatFull == null || chatFull.slowmode_seconds == 0 || chatFull.slowmode_next_send_date > currentTime || !((isUploadingMessageIdDialog = SendMessagesHelper.getInstance(this.Q).isUploadingMessageIdDialog(this.Q2)) || SendMessagesHelper.getInstance(this.Q).isSendingMessageIdDialog(this.Q2))) {
            int i11 = this.G0;
            if (i11 >= 2147483646) {
                if (this.d2 != null) {
                    this.R.getMessagesController().loadFullChat(this.d2.id, 0, true);
                }
                i10 = 0;
            } else {
                i10 = i11 - currentTime;
            }
        } else {
            if (!ChatObject.hasAdminRights(this.R.getMessagesController().getChat(Long.valueOf(this.d2.id))) && !ChatObject.isIgnoredChatRestrictionsForBoosters(this.d2)) {
                i10 = this.d2.slowmode_seconds;
                this.G0 = isUploadingMessageIdDialog ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2147483646;
            }
            i10 = 0;
        }
        if (this.G0 == 0 || i10 <= 0) {
            this.G0 = 0;
        } else {
            String formatDurationNoHours = AndroidUtilities.formatDurationNoHours(Math.max(1, i10), false);
            wg wgVar = this.F0;
            wgVar.a.l(formatDurationNoHours, false);
            wgVar.invalidate();
            og ogVar = this.Z2;
            if (ogVar != null) {
                ogVar.t1(wgVar, wgVar.a.getText(), false);
            }
            td tdVar = new td(this, 9);
            this.H0 = tdVar;
            AndroidUtilities.runOnUIThread(tdVar, 100L);
        }
        if (c()) {
            return;
        }
        K(true);
    }

    public final void T(boolean z10) {
        if (this.F1 != null) {
            return;
        }
        ye yeVar = new ye(this, getContext(), R.drawable.input_done, this.W3, 1);
        this.F1 = yeVar;
        yeVar.setContentDescription(LocaleController.getString(R.string.EditMessage));
        if (z10) {
            w7.a6.a(this.F1);
        }
        this.z1.addView(this.F1, w7.y5.e(44, 44, 85));
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x066b A[LOOP:1: B:194:0x0400->B:253:0x066b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x061b A[EDGE_INSN: B:254:0x061b->B:255:0x061b BREAK  A[LOOP:1: B:194:0x0400->B:253:0x066b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0562  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$WebPage] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean T0(final int i10, final boolean z10, final int i11, boolean z11, long j3) {
        ChatActivityEnterView chatActivityEnterView;
        ChatActivityEnterView chatActivityEnterView2;
        int i12;
        int i13;
        int i14;
        int i15;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i16;
        CharSequence charSequence3;
        MessageObject.SendAnimationData sendAnimationData;
        MessageObject threadMessage;
        String str;
        int i17;
        CharSequence charSequence4;
        CharSequence charSequence5;
        org.telegram.ui.wn wnVar;
        ?? r32;
        boolean z12;
        TLRPC.WebPage webPage;
        boolean z13;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams messagePreviewParams2;
        ChatActivityEnterView chatActivityEnterView3;
        TLRPC.Chat chat;
        MessagePreviewParams messagePreviewParams3;
        MessageObject messageObject;
        og ogVar;
        TLRPC.Chat chat2;
        TL_iv.RichMessage richMessage;
        ChatActivityEnterView chatActivityEnterView4;
        eg egVar;
        boolean z14 = z11 && !this.i5.f;
        if (z14) {
            boolean b02 = e5.b0(this.Q, this.Q2, getMessagesCount(), new Utilities.Callback() { // from class: org.telegram.ui.Components.he
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    int i18 = ChatActivityEnterView.n5;
                    ChatActivityEnterView chatActivityEnterView5 = ChatActivityEnterView.this;
                    chatActivityEnterView5.getClass();
                    chatActivityEnterView5.T0(i10, z10, i11, false, ((Long) obj).longValue());
                }
            }, j3);
            if (b02 && this.s4) {
                if (this.c1) {
                    if (!this.Z2.i1()) {
                        SlideTextView slideTextView = this.k1;
                        if (slideTextView != null) {
                            slideTextView.setEnabled(false);
                        }
                        this.Z2.n1();
                        return b02;
                    }
                } else if (!MediaController.getInstance().isRecordingPaused()) {
                    if (this.s4) {
                        this.J3 = true;
                    }
                    MediaController.getInstance().toggleRecordingPause(this.O);
                    this.Z2.a1(0);
                    SlideTextView slideTextView2 = this.k1;
                    if (slideTextView2 != null) {
                        slideTextView2.setEnabled(false);
                    }
                }
            }
            return b02;
        }
        if (this.G0 != Integer.MAX_VALUE || c()) {
            org.telegram.ui.wn wnVar2 = this.P2;
            if (wnVar2 != null) {
                TLRPC.Chat chat3 = wnVar2.e;
                if (wnVar2.i() != null || ((ChatObject.isChannel(chat3) && chat3.megagroup) || !ChatObject.isChannel(chat3))) {
                    MessagesController.getNotificationsSettings(this.Q).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + this.Q2, !z10).commit();
                }
            }
            if (this.z3) {
                n1(false, true, false, true);
                if (this.R1 != 0 && (egVar = this.U0) != null) {
                    egVar.t(false);
                    this.U0.A();
                }
            }
            if (z14) {
                chatActivityEnterView = this;
                if (chatActivityEnterView.r1(new org.telegram.messenger.ae(this, z10, i10, i11, j3))) {
                    chatActivityEnterView2 = chatActivityEnterView;
                }
            } else {
                chatActivityEnterView = this;
            }
            chatActivityEnterView.E4 = true;
            VideoEditedInfo videoEditedInfo = chatActivityEnterView.e3;
            ye yeVar = chatActivityEnterView.J0;
            if (videoEditedInfo != null) {
                chatActivityEnterView.Z2.k2(4, i10, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.S4, j3, z10);
                chatActivityEnterView.S4 = 0L;
                yeVar.setEffect(0L);
                chatActivityEnterView.o0(true);
                chatActivityEnterView.K(true);
                AndroidUtilities.runOnUIThread(new td(chatActivityEnterView, 2), 100L);
                chatActivityEnterView.i1 = 0L;
            } else if (chatActivityEnterView.b3 != null) {
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.d3) {
                    MediaController.getInstance().cleanupPlayer(true, true);
                }
                MediaController.getInstance().cleanRecording(false);
                MediaDataController.getInstance(chatActivityEnterView.Q).pushDraftVoiceMessage(chatActivityEnterView.Q2, (wnVar2 == null || !wnVar2.h4) ? 0L : wnVar2.d(), null);
                rk0 rk0Var = chatActivityEnterView.h1;
                if (rk0Var != null && (rk0Var.s > 0.0f || rk0Var.v < 1.0f)) {
                    rk0Var.setPlaying(false);
                    String t10 = a4.a.t(new StringBuilder(), chatActivityEnterView.c3, ".ogg");
                    if (MediaController.cropOpusFile(chatActivityEnterView.c3, t10, chatActivityEnterView.h1.getAudioLeftMs(), chatActivityEnterView.h1.getAudioRightMs())) {
                        try {
                            new File(chatActivityEnterView.c3).delete();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        try {
                            new File(t10).renameTo(new File(chatActivityEnterView.c3));
                        } catch (Exception e7) {
                            FileLog.e(e7);
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
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(chatActivityEnterView.b3, null, chatActivityEnterView.c3, chatActivityEnterView.Q2, chatActivityEnterView.T2, chatActivityEnterView.getThreadMessage(), null, null, null, null, z10, i10, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, null, null, false);
                of2.sendMessageChatArguments = wnVar2 != null ? wnVar2.C8() : null;
                of2.effect_id = this.S4;
                of2.payStars = j3;
                of2.monoForumPeer = getSendMonoForumPeerId();
                of2.suggestionParams = getSendMessageSuggestionParams();
                this.S4 = 0L;
                yeVar.setEffect(0L);
                if (!this.Z2.w1()) {
                    MessageObject.SendAnimationData sendAnimationData2 = new MessageObject.SendAnimationData();
                    sendAnimationData2.fromPreview = System.currentTimeMillis() - this.M0 < 200;
                    of2.sendAnimationData = sendAnimationData2;
                }
                s(of2);
                SendMessagesHelper.getInstance(this.Q).sendMessage(of2);
                og ogVar2 = this.Z2;
                if (ogVar2 != null) {
                    chatActivityEnterView4 = this;
                    ogVar2.H(null, z10, i10, i11, j3);
                } else {
                    chatActivityEnterView4 = this;
                }
                chatActivityEnterView4.o0(true);
                chatActivityEnterView4.K(true);
                AndroidUtilities.runOnUIThread(new td(chatActivityEnterView4, 3), 100L);
                chatActivityEnterView4.i1 = 0L;
            } else {
                ChatActivityEnterView chatActivityEnterView5 = chatActivityEnterView;
                long j10 = 200;
                String str2 = "";
                if (!chatActivityEnterView5.D1 || (richMessage = chatActivityEnterView5.E1) == null) {
                    org.telegram.ui.wn wnVar3 = wnVar2;
                    ye yeVar2 = yeVar;
                    chatActivityEnterView2 = chatActivityEnterView5;
                    int i19 = 1;
                    qf qfVar = chatActivityEnterView2.E0;
                    CharSequence textToUse = qfVar == null ? "" : qfVar.getTextToUse();
                    if (wnVar3 != null && (chat2 = wnVar3.e) != null && chat2.slowmode_enabled && !ChatObject.hasAdminRights(chat2)) {
                        int length = textToUse.length();
                        int maxMessageLength = chatActivityEnterView2.R.getMessagesController().getMaxMessageLength();
                        org.telegram.ui.ActionBar.d6 d6Var = chatActivityEnterView2.W3;
                        if (length > maxMessageLength) {
                            e5.u0(wnVar3, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSendErrorTooLong", R.string.SlowmodeSendErrorTooLong), d6Var);
                        } else if (chatActivityEnterView2.H2 && textToUse.length() > 0) {
                            e5.u0(wnVar3, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSendError", R.string.SlowmodeSendError), d6Var);
                        }
                    }
                    if (!I(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, wnVar3, textToUse)) {
                        org.telegram.ui.mn mnVar = chatActivityEnterView2.V2;
                        if (mnVar == null || wnVar3 == null || !mnVar.f) {
                            int[] iArr = new int[1];
                            Emoji.parseEmojis(textToUse, iArr);
                            char c10 = 0;
                            boolean z15 = iArr[0] > 0;
                            CharSequence trimmedString = !z15 ? AndroidUtilities.getTrimmedString(textToUse) : textToUse;
                            boolean y12 = chatActivityEnterView2.y1();
                            int maxMessageLength2 = chatActivityEnterView2.R.getMessagesController().getMaxMessageLength();
                            if (trimmedString.length() != 0) {
                                if (chatActivityEnterView2.Z2 != null && wnVar3 != null) {
                                    if ((i10 != 0) == wnVar3.c()) {
                                        chatActivityEnterView2.Z2.G0();
                                    }
                                }
                                int i20 = 0;
                                while (true) {
                                    int i21 = i20 + maxMessageLength2;
                                    if (trimmedString.length() > i21) {
                                        int i22 = i21 - 1;
                                        i13 = -1;
                                        i14 = -1;
                                        i15 = -1;
                                        for (int i23 = 0; i22 > i20 && i23 < 300; i23++) {
                                            char charAt = trimmedString.charAt(i22);
                                            char charAt2 = i22 > 0 ? trimmedString.charAt(i22 - 1) : ' ';
                                            if (charAt == '\n' && charAt2 == '\n') {
                                                i12 = i22;
                                                break;
                                            }
                                            if (charAt == '\n') {
                                                i15 = i22;
                                            } else if (i13 < 0 && Character.isWhitespace(charAt) && charAt2 == '.') {
                                                i13 = i22;
                                            } else if (i14 < 0 && Character.isWhitespace(charAt)) {
                                                i14 = i22;
                                            }
                                            i22--;
                                        }
                                        i12 = -1;
                                    } else {
                                        i12 = -1;
                                        i13 = -1;
                                        i14 = -1;
                                        i15 = -1;
                                    }
                                    int min = Math.min(i21, trimmedString.length());
                                    if (i12 > 0) {
                                        min = i12;
                                    } else if (i15 > 0) {
                                        min = i15;
                                    } else if (i13 > 0) {
                                        min = i13;
                                    } else if (i14 > 0) {
                                        min = i14;
                                    }
                                    CharSequence subSequence = trimmedString.subSequence(i20, min);
                                    if (!z15) {
                                        subSequence = AndroidUtilities.getTrimmedString(subSequence);
                                    }
                                    CharSequence[] charSequenceArr = new CharSequence[i19];
                                    charSequenceArr[c10] = subSequence;
                                    ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(chatActivityEnterView2.Q).getEntities(charSequenceArr, y12);
                                    if (chatActivityEnterView2.Z2.w1()) {
                                        charSequence = trimmedString;
                                        if (chatActivityEnterView2.L0 != null) {
                                            sendAnimationData = new MessageObject.SendAnimationData();
                                            charSequence2 = textToUse;
                                            i16 = min;
                                            sendAnimationData.fromPreview = System.currentTimeMillis() - chatActivityEnterView2.M0 < j10;
                                        } else {
                                            charSequence2 = textToUse;
                                            i16 = min;
                                            charSequence3 = charSequence;
                                            sendAnimationData = null;
                                            boolean checkUpdateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(charSequence3);
                                            threadMessage = chatActivityEnterView2.getThreadMessage();
                                            if (threadMessage == null && (messageObject = chatActivityEnterView2.U2) != null) {
                                                threadMessage = messageObject;
                                            }
                                            str = str2;
                                            ye yeVar3 = yeVar2;
                                            i17 = i16;
                                            charSequence4 = charSequence2;
                                            boolean z16 = y12;
                                            charSequence5 = charSequence3;
                                            wnVar = wnVar3;
                                            SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(charSequenceArr[c10].toString(), chatActivityEnterView2.Q2, chatActivityEnterView2.T2, threadMessage, chatActivityEnterView2.X2, chatActivityEnterView2.Y2, entities, null, null, z10, i10, i11, sendAnimationData, checkUpdateStickersOrder);
                                            of3.sendMessageChatArguments = wnVar == null ? wnVar.C8() : null;
                                            of3.effect_id = this.S4;
                                            of3.payStars = j3;
                                            of3.monoForumPeer = getSendMonoForumPeerId();
                                            of3.suggestionParams = getSendMessageSuggestionParams();
                                            this.S4 = 0L;
                                            yeVar3.setEffect(0L);
                                            s(of3);
                                            of3.invert_media = wnVar == null && (messagePreviewParams3 = wnVar.f5) != null && messagePreviewParams3.webpageTop;
                                            if (wnVar != null || (chat = wnVar.e) == null || ChatObject.canSendEmbed(chat)) {
                                                r32 = 0;
                                                r32 = 0;
                                                r32 = 0;
                                                z12 = false;
                                                webPage = this.X2;
                                                if (webPage instanceof TLRPC.TL_webPagePending) {
                                                    z13 = true;
                                                    if (webPage != null) {
                                                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                                                        of3.mediaWebPage = tL_messageMediaWebPage;
                                                        tL_messageMediaWebPage.webpage = this.X2;
                                                        tL_messageMediaWebPage.force_large_media = (wnVar == null || (messagePreviewParams2 = wnVar.f5) == null || messagePreviewParams2.webpageSmall) ? false : true;
                                                        tL_messageMediaWebPage.force_small_media = (wnVar == null || (messagePreviewParams = wnVar.f5) == null || !messagePreviewParams.webpageSmall) ? false : true;
                                                    }
                                                } else {
                                                    z13 = true;
                                                    of3.searchLinks = true;
                                                    of3.mediaWebPage = null;
                                                }
                                            } else {
                                                z12 = false;
                                                of3.searchLinks = false;
                                                r32 = 0;
                                                of3.mediaWebPage = null;
                                                z13 = true;
                                            }
                                            if (wnVar != null) {
                                                wnVar.p5 = r32;
                                                wnVar.G5 = r32;
                                                MessagePreviewParams messagePreviewParams4 = wnVar.f5;
                                                if (messagePreviewParams4 != null) {
                                                    messagePreviewParams4.updateLink(this.Q, null, "", null, null, null);
                                                }
                                                this.X2 = r32;
                                                this.Y2 = z13;
                                                wnVar.j8();
                                            }
                                            SendMessagesHelper.getInstance(this.Q).sendMessage(of3);
                                            i20 = i17 + 1;
                                            if (i17 != charSequence5.length()) {
                                                break;
                                            }
                                            chatActivityEnterView2 = this;
                                            yeVar2 = yeVar3;
                                            wnVar3 = wnVar;
                                            textToUse = charSequence4;
                                            y12 = z16;
                                            trimmedString = charSequence5;
                                            str2 = str;
                                            i19 = 1;
                                            j10 = 200;
                                            c10 = 0;
                                        }
                                    } else {
                                        MessageObject.SendAnimationData sendAnimationData3 = new MessageObject.SendAnimationData();
                                        charSequence = trimmedString;
                                        sendAnimationData3.fromPreview = System.currentTimeMillis() - chatActivityEnterView2.M0 < j10;
                                        float dp = AndroidUtilities.dp(22.0f);
                                        sendAnimationData3.height = dp;
                                        sendAnimationData3.width = dp;
                                        qf qfVar2 = chatActivityEnterView2.E0;
                                        if (qfVar2 != null) {
                                            qfVar2.getLocationInWindow(chatActivityEnterView2.N2);
                                            sendAnimationData3.x = AndroidUtilities.dp(11.0f) + r12[c10];
                                            sendAnimationData3.y = AndroidUtilities.dp(19.0f) + r12[1];
                                        } else {
                                            sendAnimationData3.x = AndroidUtilities.dp(55.0f);
                                            sendAnimationData3.y = AndroidUtilities.displaySize.y - AndroidUtilities.dp(19.0f);
                                        }
                                        charSequence2 = textToUse;
                                        i16 = min;
                                        sendAnimationData = sendAnimationData3;
                                    }
                                    charSequence3 = charSequence;
                                    boolean checkUpdateStickersOrder2 = SendMessagesHelper.checkUpdateStickersOrder(charSequence3);
                                    threadMessage = chatActivityEnterView2.getThreadMessage();
                                    if (threadMessage == null) {
                                        threadMessage = messageObject;
                                    }
                                    str = str2;
                                    ye yeVar32 = yeVar2;
                                    i17 = i16;
                                    charSequence4 = charSequence2;
                                    boolean z162 = y12;
                                    charSequence5 = charSequence3;
                                    wnVar = wnVar3;
                                    SendMessagesHelper.SendMessageParams of32 = SendMessagesHelper.SendMessageParams.of(charSequenceArr[c10].toString(), chatActivityEnterView2.Q2, chatActivityEnterView2.T2, threadMessage, chatActivityEnterView2.X2, chatActivityEnterView2.Y2, entities, null, null, z10, i10, i11, sendAnimationData, checkUpdateStickersOrder2);
                                    of32.sendMessageChatArguments = wnVar == null ? wnVar.C8() : null;
                                    of32.effect_id = this.S4;
                                    of32.payStars = j3;
                                    of32.monoForumPeer = getSendMonoForumPeerId();
                                    of32.suggestionParams = getSendMessageSuggestionParams();
                                    this.S4 = 0L;
                                    yeVar32.setEffect(0L);
                                    s(of32);
                                    of32.invert_media = wnVar == null && (messagePreviewParams3 = wnVar.f5) != null && messagePreviewParams3.webpageTop;
                                    if (wnVar != null) {
                                    }
                                    r32 = 0;
                                    r32 = 0;
                                    r32 = 0;
                                    z12 = false;
                                    webPage = this.X2;
                                    if (webPage instanceof TLRPC.TL_webPagePending) {
                                    }
                                    if (wnVar != null) {
                                    }
                                    SendMessagesHelper.getInstance(this.Q).sendMessage(of32);
                                    i20 = i17 + 1;
                                    if (i17 != charSequence5.length()) {
                                    }
                                }
                                if (this.Z2.w1() || (!(i10 == 0 || c()) || c())) {
                                    chatActivityEnterView3 = this;
                                    qf qfVar3 = chatActivityEnterView3.E0;
                                    if (qfVar3 != null) {
                                        qfVar3.setText(str);
                                    }
                                    og ogVar3 = chatActivityEnterView3.Z2;
                                    if (ogVar3 != null) {
                                        ogVar3.H(charSequence4, z10, i10, i11, j3);
                                    }
                                } else {
                                    this.g0 = z12;
                                    org.telegram.messenger.qf qfVar4 = new org.telegram.messenger.qf(this, charSequence4, z10, i10, i11, j3);
                                    chatActivityEnterView3 = this;
                                    chatActivityEnterView3.f0 = qfVar4;
                                    AndroidUtilities.runOnUIThread(qfVar4, 200L);
                                }
                                chatActivityEnterView3.C2 = 0L;
                                chatActivityEnterView3.R1();
                                return z12;
                            }
                        } else {
                            wnVar3.Rb();
                        }
                        chatActivityEnterView3 = chatActivityEnterView2;
                        z12 = false;
                        if (chatActivityEnterView3.H2 && (ogVar = chatActivityEnterView3.Z2) != null) {
                            ogVar.H(null, z10, i10, i11, j3);
                        }
                        chatActivityEnterView3.R1();
                        return z12;
                    }
                } else {
                    SendMessagesHelper.prepareSendingArticle(chatActivityEnterView5.R, richMessage.blocks, richMessage.photos, richMessage.documents, null, false, chatActivityEnterView5.Q2, chatActivityEnterView5.T2, chatActivityEnterView5.getThreadMessage(), z10, i10, i11, wnVar2 != null ? wnVar2.C8() : null, chatActivityEnterView5.S4, chatActivityEnterView5.getSendMonoForumPeerId(), j3);
                    chatActivityEnterView2 = this;
                    chatActivityEnterView2.S4 = 0L;
                    yeVar.setEffect(0L);
                    chatActivityEnterView2.E0.setText("");
                    chatActivityEnterView2.O();
                    og ogVar4 = chatActivityEnterView2.Z2;
                    if (ogVar4 != null) {
                        ogVar4.H(null, z10, i10, i11, j3);
                    }
                    chatActivityEnterView2.K(true);
                }
            }
        } else {
            og ogVar5 = this.Z2;
            if (ogVar5 != null) {
                ogVar5.T0();
            } else {
                chatActivityEnterView2 = this;
            }
        }
        return false;
    }

    public final void U() {
        eg egVar = this.U0;
        if (egVar != null && egVar.c1 != UserConfig.selectedAccount) {
            this.n1.removeView(egVar);
            this.U0 = null;
        }
        if (this.U0 != null) {
            return;
        }
        eg egVar2 = new eg(this, this.P2, this.I2, getContext(), this.d2, this.m1, this.y4, this.W3, this.T0, this.d5 != null);
        this.U0 = egVar2;
        egVar2.v0 = true;
        if (!this.y4) {
            egVar2.S();
        }
        this.U0.I(true, this.J2, this.K2, true);
        this.U0.setVisibility(8);
        this.U0.setShowing(false);
        if (this.d5 != null) {
            eg egVar3 = this.U0;
            egVar3.w0 = false;
            egVar3.setShouldDrawBackground(false);
            this.U0.V0 = true;
        }
        this.U0.setDelegate(new hg(this));
        this.U0.setDragListener(new c2.a(this));
        eg egVar4 = this.U0;
        if (egVar4 != null) {
            egVar4.K(-this.Q2, !this.z0, !this.b);
        }
        u();
        F();
    }

    public final void U0(boolean z10, boolean z11) {
        V0(z10, z11, false);
    }

    public final void V() {
        if (this.S0 != null) {
            return;
        }
        cf cfVar = new cf(this, getContext(), 2);
        this.S0 = cfVar;
        cfVar.setScaleType(ImageView.ScaleType.CENTER);
        cf cfVar2 = this.S0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(i0(org.telegram.ui.ActionBar.h6.Wk), false);
        this.F3 = animatedArrowDrawable;
        cfVar2.setImageDrawable(animatedArrowDrawable);
        this.S0.setVisibility(8);
        this.S0.setScaleX(0.1f);
        this.S0.setScaleY(0.1f);
        this.S0.setAlpha(0.0f);
        this.S0.setBackground(org.telegram.ui.ActionBar.h6.f0(i0(org.telegram.ui.ActionBar.h6.i6), 1, -1));
        this.A1.addView(this.S0, w7.y5.e(44, 44, 85));
        this.S0.setOnClickListener(new vd(this, 5));
        this.S0.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
    }

    public final void V0(boolean z10, boolean z11, boolean z12) {
        if ((this.J2 != z10 || this.K2 != z11) && this.U0 != null) {
            if (this.W0 && !z12) {
                this.G3 = true;
                m0(false);
            } else if (z12) {
                I0();
            }
        }
        this.I2 = true;
        this.J2 = z10;
        this.K2 = z11;
        eg egVar = this.U0;
        if (egVar != null) {
            egVar.I(true, z10, z11, true);
        }
        d1(false, !this.j2);
    }

    public final void W() {
        if (this.E0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.d6 d6Var = this.W3;
        qf qfVar = new qf(this, context, d6Var);
        this.E0 = qfVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            qfVar.setFallbackLineSpacing(false);
        }
        if (i10 >= 35) {
            this.E0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.E0.setDelegate(new be(this));
        org.telegram.ui.wn wnVar = this.P2;
        if (wnVar == null || wnVar.getParentLayout() == null || !((ActionBarLayout) wnVar.getParentLayout()).b) {
            this.E0.setWindowView(this.O2.getWindow().getDecorView());
        } else {
            this.E0.setWindowView(wnVar.getParentLayout().getWindow().getDecorView());
        }
        TLRPC.EncryptedChat encryptedChat = wnVar != null ? wnVar.h : null;
        this.E0.setAllowTextEntitiesIntersection(y1());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        int i11 = ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) ? 285212672 : TLObject.FLAG_28;
        this.E0.setIncludeFontPadding(false);
        this.E0.setImeOptions(i11);
        qf qfVar2 = this.E0;
        int inputType = qfVar2.getInputType() | 147456;
        this.a = inputType;
        qfVar2.setInputType(inputType);
        G1(false);
        this.E0.setSingleLine(false);
        this.E0.setMaxLines(6);
        this.E0.setTextSize(1, 18.0f);
        this.E0.setGravity(80);
        this.E0.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(10.0f));
        this.E0.setBackgroundDrawable(null);
        this.E0.setTextColor(i0(org.telegram.ui.ActionBar.h6.Ud));
        this.E0.setLinkTextColor(i0(org.telegram.ui.ActionBar.h6.hc));
        this.E0.setHighlightColor(i0(org.telegram.ui.ActionBar.h6.uf));
        qf qfVar3 = this.E0;
        int i12 = org.telegram.ui.ActionBar.h6.Vd;
        qfVar3.setHintColor(i0(i12));
        this.E0.setHintTextColor(i0(i12));
        this.E0.setCursorColor(i0(org.telegram.ui.ActionBar.h6.Wd));
        this.E0.setHandlesColor(i0(org.telegram.ui.ActionBar.h6.vf));
        qf qfVar4 = this.E0;
        boolean z10 = this.X3;
        FrameLayout.LayoutParams d = w7.y5.d(-1, -2.0f, 80, 52.0f, 0.0f, z10 ? 50.0f : 2.0f, 1.5f);
        ne neVar = this.y1;
        neVar.addView(qfVar4, 1, d);
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(getContext(), this.Q, d6Var);
        this.C1 = previewView;
        previewView.setAllowActions(false);
        this.C1.setMaxHeight(AndroidUtilities.dp(150.0f));
        this.C1.setMinHeight(AndroidUtilities.dp(88.0f));
        this.C1.setVisibility(8);
        this.C1.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
        this.C1.setOnClickListener(new vd(this, 10));
        neVar.addView(this.C1, 2, w7.y5.d(-1, -2.0f, 80, 44.0f, 0.0f, (z10 ? 50 : 2) - 8, 1.5f));
        this.E0.setOnKeyListener(new rf(this));
        this.E0.setOnEditorActionListener(new m.s2(this, 3));
        this.E0.addTextChangedListener(new sf(this));
        this.E0.addTextChangedListener(new org.telegram.ui.Cells.i3());
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
        G1(false);
        P1(wnVar != null && wnVar.getFragmentBeginToShow());
        if (wnVar != null) {
            wnVar.A6(false, false);
        }
        H1(this.P4);
    }

    public final void W0() {
        ci.e4 e4Var = this.L;
        if (e4Var == null) {
            return;
        }
        e4Var.s(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBirthdayHint, UserObject.getFirstName(this.P2.i()))), this.L.getTextPaint().getFontMetricsInt(), new td(this, 26)));
        ci.e4 e4Var2 = this.L;
        e4Var2.h = ci.e4.a(e4Var2.getText(), this.L.getTextPaint());
    }

    public final void X() {
        if (this.e1 != null) {
            return;
        }
        le leVar = new le(this, getContext(), 2);
        this.e1 = leVar;
        leVar.setVisibility(this.b3 == null ? 8 : 0);
        this.e1.setFocusable(true);
        this.e1.setFocusableInTouchMode(true);
        this.e1.setClickable(true);
        this.y1.addView(this.e1, w7.y5.e(-1, 44, 80));
        lj0 lj0Var = new lj0(getContext());
        this.g1 = lj0Var;
        lj0Var.setScaleType(ImageView.ScaleType.CENTER);
        this.g1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.g1.getAnimatedDrawable().o0 = true;
        M1();
        this.g1.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        this.g1.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(i0(org.telegram.ui.ActionBar.h6.i6), 1, -1));
        this.e1.addView(this.g1, w7.y5.c(44.0f, 44));
        this.g1.setOnClickListener(new vd(this, 6));
        i81 i81Var = new i81(getContext());
        this.f1 = i81Var;
        i81Var.setVisibility(4);
        i81 i81Var2 = this.f1;
        i81Var2.S = !this.y4;
        i81Var2.setRoundFrames(true);
        this.f1.setDelegate(new ef(this));
        this.e1.addView(this.f1, w7.y5.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        g81 g81Var = new g81(context);
        TextPaint textPaint = new TextPaint(1);
        g81Var.d = textPaint;
        g81Var.e = -1L;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        g81Var.b = context.getDrawable(R.drawable.tooltip_arrow);
        g81Var.a = org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.qf, false));
        g81Var.b();
        g81Var.setTime(0);
        this.f1.setTimeHintView(g81Var);
        this.m1.addView(g81Var, w7.y5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        rk0 rk0Var = new rk0(getContext(), this.W3);
        this.h1 = rk0Var;
        this.e1.addView(rk0Var, w7.y5.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        H1(this.P4);
    }

    public final void X0(a0.i iVar, boolean z10) {
        this.X4 = iVar;
        if (iVar.m() == 1 && ((TL_bots.BotInfo) iVar.n(0)).user_id == this.Q2) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) iVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.i0 = tL_botMenuButton.text;
                this.j0 = tL_botMenuButton.url;
                this.m5 = 3;
            } else if (botInfo.commands.isEmpty()) {
                this.m5 = 1;
            } else {
                this.m5 = 2;
            }
        } else {
            this.m5 = 1;
        }
        ei.b0 b0Var = this.n0;
        if (b0Var != null) {
            b0Var.E(iVar);
        }
        B1(z10);
        G(z10);
    }

    public final void Y() {
        sg sgVar = this.O1;
        aw0 aw0Var = this.m1;
        if (sgVar == null) {
            sg sgVar2 = new sg(this, getContext());
            this.O1 = sgVar2;
            sgVar2.setVisibility(8);
            aw0Var.addView(this.O1, w7.y5.e(-1, -2, 80));
        }
        if (this.N1 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.N1 = recordCircle;
        recordCircle.setVisibility(8);
        aw0Var.addView(this.N1, w7.y5.e(-1, -2, 80));
    }

    public final void Y0(int i10, boolean z10, boolean z11) {
        this.o2 = i10;
        if (this.p2 == z10) {
            return;
        }
        this.p2 = z10;
        B1(z11);
    }

    public final void Z() {
        if (this.d1 != null || getContext() == null) {
            return;
        }
        ai.w5 w5Var = new ai.w5(getContext(), 14);
        this.d1 = w5Var;
        w5Var.setClipChildren(false);
        this.d1.setVisibility(8);
        this.y1.addView(this.d1, w7.y5.c(44.0f, -1));
        this.d1.setOnTouchListener(new bi.d(12));
        ai.w5 w5Var2 = this.d1;
        SlideTextView slideTextView = new SlideTextView(getContext());
        this.k1 = slideTextView;
        w5Var2.addView(slideTextView, w7.y5.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        this.d.setPadding(AndroidUtilities.dp(13.0f), 0, 0, 0);
        this.d.setFocusable(false);
        LinearLayout linearLayout2 = this.d;
        ug ugVar = new ug(this, getContext());
        this.l1 = ugVar;
        linearLayout2.addView(ugVar, w7.y5.t(28, 28, 16, 0, 0, 0, 0));
        LinearLayout linearLayout3 = this.d;
        xg xgVar = new xg(this, getContext());
        this.Y0 = xgVar;
        linearLayout3.addView(xgVar, w7.y5.t(-1, -1, 16, 6, 0, 0, 0));
        this.d1.addView(this.d, w7.y5.e(-1, -1, 16));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
    
        if (r7.getInt("answered_" + getTopicKeyString(), 0) != r5.getId()) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bb, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
    
        if (r7.getInt("closed_botkeyboard_" + getTopicKeyString(), 0) == r5.getId()) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0(MessageObject messageObject, boolean z10, boolean z11) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        qf qfVar;
        MessageObject messageObject2 = this.T2;
        if (messageObject2 != null && messageObject2 == this.m2 && messageObject2 != messageObject) {
            this.W2 = messageObject;
            return;
        }
        MessageObject messageObject3 = this.m2;
        if (messageObject3 == null || messageObject3 != messageObject) {
            if (messageObject3 == null && messageObject == null) {
                return;
            }
            if (this.H1 == null) {
                bg bgVar = new bg(this, this.O2, this.W3);
                this.H1 = bgVar;
                bgVar.setVisibility(8);
                this.X0 = false;
                this.H1.setDelegate(new be(this));
                this.n1.addView(this.H1);
            }
            this.m2 = messageObject;
            if (messageObject != null) {
                TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyKeyboardMarkup) {
                    tL_replyKeyboardMarkup = (TLRPC.TL_replyKeyboardMarkup) replyMarkup;
                    this.n2 = tL_replyKeyboardMarkup;
                    bg bgVar2 = this.H1;
                    Point point = AndroidUtilities.displaySize;
                    bgVar2.setPanelHeight(point.x <= point.y ? this.y2 : this.x2);
                    if (this.n2 == null) {
                        SharedPreferences mainSettings = MessagesController.getMainSettings(this.Q);
                        if (this.m2 != this.T2 && messageObject != null) {
                            if (this.n2.single_use) {
                            }
                            if (!this.n2.is_persistent) {
                            }
                        }
                        boolean z12 = true;
                        boolean z13 = z10 ? z12 : false;
                        this.H1.setButtons(this.n2);
                        if (z13 && (((qfVar = this.E0) == null || qfVar.length() == 0) && !t0())) {
                            t1(1, 1, true, true);
                        }
                    } else if (t0() && this.f2 == 1) {
                        if (z11) {
                            this.p3 = true;
                            I0();
                        } else {
                            t1(0, 1, true, true);
                        }
                    }
                    B1(true);
                }
            }
            tL_replyKeyboardMarkup = null;
            this.n2 = tL_replyKeyboardMarkup;
            bg bgVar22 = this.H1;
            Point point2 = AndroidUtilities.displaySize;
            bgVar22.setPanelHeight(point2.x <= point2.y ? this.y2 : this.x2);
            if (this.n2 == null) {
            }
            B1(true);
        }
    }

    @Override // org.telegram.ui.Components.vy0
    public final void a(ci.i2 i2Var) {
        qf qfVar = this.E0;
        if (qfVar != null) {
            qfVar.addTextChangedListener(i2Var);
            return;
        }
        if (this.H4 == null) {
            this.H4 = new ArrayList();
        }
        this.H4.add(i2Var);
    }

    public final void a0() {
        if (this.J1 != null || this.P2 == null) {
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
        int i02 = i0(org.telegram.ui.ActionBar.h6.Wk);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i02, mode));
        mutate2.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.h6.jf), mode));
        qq qqVar = new qq(mutate, mutate2);
        af afVar = new af(this, getContext());
        this.J1 = afVar;
        afVar.setImageDrawable(qqVar);
        this.J1.setVisibility(8);
        this.J1.setContentDescription(LocaleController.getString(R.string.ScheduledMessages));
        this.J1.setScaleType(ImageView.ScaleType.CENTER);
        this.J1.setBackground(org.telegram.ui.ActionBar.h6.f0(i0(org.telegram.ui.ActionBar.h6.i6), 1, -1));
        this.y1.addView(this.J1, 2, w7.y5.e(44, 44, 85));
        this.J1.setOnClickListener(new vd(this, 2));
        this.J1.setTranslationX(0.0f);
    }

    public final void a1(MessageObject messageObject, String str, boolean z10, boolean z11) {
        qf qfVar;
        SendMessagesHelper.SendMessageParams of2;
        String sb2;
        if (str == null || getVisibility() != 0 || (qfVar = this.E0) == null) {
            return;
        }
        r16 = null;
        TLRPC.User user = null;
        if (!z10) {
            if (this.G0 > 0 && !c()) {
                og ogVar = this.Z2;
                if (ogVar != null) {
                    wg wgVar = this.F0;
                    ogVar.t1(wgVar, wgVar.a.getText(), true);
                    return;
                }
                return;
            }
            TLRPC.User user2 = (messageObject == null || !DialogObject.isChatDialog(this.Q2)) ? null : this.R.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
            if ((this.o2 != 1 || z11) && user2 != null && user2.bot && !str.contains("@")) {
                Locale locale = Locale.US;
                of2 = SendMessagesHelper.SendMessageParams.of(a4.a.D(str, "@", UserObject.getPublicUsername(user2)), this.Q2, this.T2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            } else {
                of2 = SendMessagesHelper.SendMessageParams.of(str, this.Q2, this.T2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            }
            org.telegram.ui.wn wnVar = this.P2;
            of2.sendMessageChatArguments = wnVar != null ? wnVar.C8() : null;
            of2.effect_id = this.S4;
            this.S4 = 0L;
            this.J0.setEffect(0L);
            s(of2);
            SendMessagesHelper.getInstance(this.Q).sendMessage(of2);
            return;
        }
        String obj = qfVar.getText().toString();
        if (messageObject != null && DialogObject.isChatDialog(this.Q2)) {
            user = this.R.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
        }
        TLRPC.User user3 = user;
        if ((this.o2 != 1 || z11) && user3 != null && user3.bot && !str.contains("@")) {
            StringBuilder sb3 = new StringBuilder();
            Locale locale2 = Locale.US;
            sb3.append(str + "@" + UserObject.getPublicUsername(user3));
            sb3.append(" ");
            sb3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            sb2 = sb3.toString();
        } else {
            StringBuilder h = v7.j.h(str, " ");
            h.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            sb2 = h.toString();
        }
        this.R2 = true;
        this.E0.setText(sb2);
        qf qfVar2 = this.E0;
        qfVar2.setSelection(qfVar2.getText().length());
        this.R2 = false;
        og ogVar2 = this.Z2;
        if (ogVar2 != null) {
            ogVar2.l1(this.E0.getText(), true, false);
        }
        if (this.z2 || this.f2 != -1) {
            return;
        }
        H0();
    }

    @Override // org.telegram.ui.Components.cy0
    public final boolean b() {
        org.telegram.ui.wn wnVar = this.P2;
        return wnVar != null && wnVar.D6();
    }

    public final void b0() {
        if (this.p0 != null || getContext() == null) {
            return;
        }
        jp0 jp0Var = new jp0(getContext());
        ImageReceiver imageReceiver = new ImageReceiver(jp0Var);
        jp0Var.a = imageReceiver;
        jp0Var.b = new h9((org.telegram.ui.ActionBar.d6) null);
        Paint paint = new Paint(1);
        jp0Var.d = paint;
        Paint paint2 = new Paint(1);
        jp0Var.e = paint2;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.cf, false));
        paint2.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.bf, false));
        int dp = AndroidUtilities.dp(18.0f);
        int l1 = org.telegram.ui.ActionBar.h6.l1(0.2f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, 0, l1, l1);
        jp0Var.c = i02;
        i02.setCallback(jp0Var);
        jp0Var.setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, ""));
        this.p0 = jp0Var;
        jp0Var.setOnClickListener(new vd(this, 16));
        this.p0.setVisibility(8);
        this.y1.addView(this.p0, w7.y5.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
    }

    public final void b1(int i10, long j3) {
        this.Q2 = j3;
        if (this.Q != i10) {
            this.L3.unlock();
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.Q);
            int i11 = NotificationCenter.recordStarted;
            notificationCenter.removeObserver(this, i11);
            NotificationCenter notificationCenter2 = NotificationCenter.getInstance(this.Q);
            int i12 = NotificationCenter.recordPaused;
            notificationCenter2.removeObserver(this, i12);
            NotificationCenter notificationCenter3 = NotificationCenter.getInstance(this.Q);
            int i13 = NotificationCenter.recordResumed;
            notificationCenter3.removeObserver(this, i13);
            NotificationCenter notificationCenter4 = NotificationCenter.getInstance(this.Q);
            int i14 = NotificationCenter.recordStartError;
            notificationCenter4.removeObserver(this, i14);
            NotificationCenter notificationCenter5 = NotificationCenter.getInstance(this.Q);
            int i15 = NotificationCenter.recordStopped;
            notificationCenter5.removeObserver(this, i15);
            NotificationCenter notificationCenter6 = NotificationCenter.getInstance(this.Q);
            int i16 = NotificationCenter.recordProgressChanged;
            notificationCenter6.removeObserver(this, i16);
            NotificationCenter notificationCenter7 = NotificationCenter.getInstance(this.Q);
            int i17 = NotificationCenter.closeChats;
            notificationCenter7.removeObserver(this, i17);
            NotificationCenter notificationCenter8 = NotificationCenter.getInstance(this.Q);
            int i18 = NotificationCenter.audioDidSent;
            notificationCenter8.removeObserver(this, i18);
            NotificationCenter notificationCenter9 = NotificationCenter.getInstance(this.Q);
            int i19 = NotificationCenter.audioRouteChanged;
            notificationCenter9.removeObserver(this, i19);
            NotificationCenter notificationCenter10 = NotificationCenter.getInstance(this.Q);
            int i20 = NotificationCenter.messagePlayingProgressDidChanged;
            notificationCenter10.removeObserver(this, i20);
            NotificationCenter notificationCenter11 = NotificationCenter.getInstance(this.Q);
            int i21 = NotificationCenter.featuredStickersDidLoad;
            notificationCenter11.removeObserver(this, i21);
            NotificationCenter notificationCenter12 = NotificationCenter.getInstance(this.Q);
            int i22 = NotificationCenter.messageReceivedByServer2;
            notificationCenter12.removeObserver(this, i22);
            NotificationCenter notificationCenter13 = NotificationCenter.getInstance(this.Q);
            int i23 = NotificationCenter.sendingMessagesChanged;
            notificationCenter13.removeObserver(this, i23);
            this.Q = i10;
            this.R = AccountInstance.getInstance(i10);
            NotificationCenter.getInstance(this.Q).addObserver(this, i11);
            NotificationCenter.getInstance(this.Q).addObserver(this, i12);
            NotificationCenter.getInstance(this.Q).addObserver(this, i13);
            NotificationCenter.getInstance(this.Q).addObserver(this, i14);
            NotificationCenter.getInstance(this.Q).addObserver(this, i15);
            NotificationCenter.getInstance(this.Q).addObserver(this, i16);
            NotificationCenter.getInstance(this.Q).addObserver(this, i17);
            NotificationCenter.getInstance(this.Q).addObserver(this, i18);
            NotificationCenter.getInstance(this.Q).addObserver(this, i19);
            NotificationCenter.getInstance(this.Q).addObserver(this, i20);
            NotificationCenter.getInstance(this.Q).addObserver(this, i21);
            NotificationCenter.getInstance(this.Q).addObserver(this, i22);
            NotificationCenter.getInstance(this.Q).addObserver(this, i23);
        }
        this.z0 = true;
        if (DialogObject.isChatDialog(this.Q2)) {
            this.z0 = ChatObject.canSendPlain(this.R.getMessagesController().getChat(Long.valueOf(-this.Q2)));
        }
        O1(false);
        I1(false);
        J();
        F();
        G1(false);
        if (this.E0 != null) {
            org.telegram.ui.wn wnVar = this.P2;
            P1(wnVar != null && wnVar.getFragmentBeginToShow());
        }
    }

    @Override // org.telegram.ui.Components.cy0
    public final boolean c() {
        org.telegram.ui.wn wnVar = this.P2;
        return wnVar != null && wnVar.c();
    }

    public final boolean c0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject, MessageObject messageObject2, org.telegram.ui.wi wiVar) {
        org.telegram.ui.wn wnVar;
        int i10;
        int i11 = 0;
        if (keyboardButtonProto != null && messageObject2 != null && ((wnVar = this.P2) == null || wnVar.R3 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) zf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                AndroidUtilities.addToClipboard(tL_inlineButtonTypeCopy.copy_text);
                xc.a0(wnVar).i(LocaleController.formatString(R.string.ExactTextCopied, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_keyboardButton.text, this.Q2, messageObject, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = wnVar != null ? wnVar.C8() : null;
                    of2.effect_id = this.S4;
                    this.S4 = 0L;
                    this.J0.setEffect(0L);
                    SendMessagesHelper.getInstance(this.Q).sendMessage(of2);
                    return true;
                }
            }
            Activity activity = this.O2;
            if (tL_inlineButtonTypeUrl != null) {
                if (nf.f.y(tL_inlineButtonTypeUrl.url)) {
                    nf.f.q(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, wiVar);
                    return true;
                }
                e5.r0(this.P2, tL_inlineButtonTypeUrl.url, false, true, true, false, wiVar, null, this.W3);
                return true;
            }
            if (zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                wnVar.rb(messageObject2, 2);
                return true;
            }
            if (!zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                if (zf.c.b(keyboardButtonProto)) {
                    TLRPC.Message message = messageObject2.messageOwner;
                    long j3 = message.via_bot_id;
                    if (j3 == 0) {
                        j3 = message.from_id.user_id;
                    }
                    cg cgVar = new cg(this, messageObject2, j3, keyboardButtonProto, messageObject, MessagesController.getInstance(this.Q).getUser(Long.valueOf(j3)));
                    if (SharedPrefsHelper.isWebViewConfirmShown(this.Q, j3) || MessagesController.getInstance(this.Q).whitelistedBots.contains(Long.valueOf(j3))) {
                        cgVar.run();
                        return true;
                    }
                    e5.o(wnVar, MessagesController.getInstance(this.Q).getUser(Long.valueOf(this.Q2)), new a3.h0(this, cgVar, j3, 18), null);
                    return true;
                }
                if (zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String string = LocaleController.getString("ShareYouLocationTitle", R.string.ShareYouLocationTitle);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                    a2Var.R = string;
                    a2Var.T = LocaleController.getString("ShareYouLocationInfo", R.string.ShareYouLocationInfo);
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new ai.q5(this, messageObject2, keyboardButtonProto, 20));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    wnVar.showDialog(a2Var);
                    return true;
                }
                if (zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                    SendMessagesHelper.getInstance(this.Q).sendCallback(true, messageObject2, keyboardButtonProto, wnVar);
                    return true;
                }
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!wnVar.Ca(tL_inlineButtonTypeSwitchInline)) {
                        if (!tL_inlineButtonTypeSwitchInline.same_peer) {
                            Bundle e = org.telegram.messenger.ok.e(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                e.putBoolean("allowGroups", false);
                                e.putBoolean("allowMegagroups", false);
                                e.putBoolean("allowLegacyGroups", false);
                                e.putBoolean("allowUsers", false);
                                e.putBoolean("allowChannels", false);
                                e.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i11 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i11);
                                    i11++;
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                                    if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                        e.putBoolean("allowUsers", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                        e.putBoolean("allowBots", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                        e.putBoolean("allowChannels", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                        e.putBoolean("allowLegacyGroups", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                        e.putBoolean("allowMegagroups", true);
                                    }
                                }
                            }
                            org.telegram.ui.qy qyVar = new org.telegram.ui.qy(e);
                            qyVar.C2 = new ai.q5(this, messageObject2, tL_inlineButtonTypeSwitchInline, 21);
                            wnVar.presentFragment(qyVar);
                            return true;
                        }
                        TLRPC.Message message2 = messageObject2.messageOwner;
                        long j10 = message2.from_id.user_id;
                        long j11 = message2.via_bot_id;
                        if (j11 != 0) {
                            j10 = j11;
                        }
                        TLRPC.User user = this.R.getMessagesController().getUser(Long.valueOf(j10));
                        if (user != null) {
                            setFieldText("@" + UserObject.getPublicUsername(user) + " " + tL_inlineButtonTypeSwitchInline.query);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (MessagesController.getInstance(this.Q).getUser(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        wnVar.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType == null || messageObject2.messageOwner == null) {
                        FileLog.e("button.peer_type is null");
                    } else {
                        if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot)) {
                            if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                                TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                                Boolean bool = tL_requestPeerTypeUser.bot;
                                Boolean bool2 = tL_requestPeerTypeUser.premium;
                                ie ieVar = new ie(this, messageObject2, tL_buttonTypeRequestPeer);
                                org.telegram.ui.kj0 kj0Var = org.telegram.ui.kj0.u0;
                                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                                if (R == null || org.telegram.ui.kj0.u0 != null) {
                                    return false;
                                }
                                org.telegram.ui.kj0 kj0Var2 = new org.telegram.ui.kj0(R, i10, bool, bool2, ieVar);
                                kj0Var2.show();
                                org.telegram.ui.kj0.u0 = kj0Var2;
                                return false;
                            }
                            Bundle e7 = org.telegram.messenger.ok.e(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = messageObject2.messageOwner;
                            if (message3 != null) {
                                TLRPC.Peer peer = message3.from_id;
                                if (peer instanceof TLRPC.TL_peerUser) {
                                    e7.putLong("requestPeerBotId", peer.user_id);
                                }
                            }
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                e7.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            org.telegram.ui.qy qyVar2 = new org.telegram.ui.qy(e7);
                            qyVar2.C2 = new ie(this, messageObject2, tL_buttonTypeRequestPeer);
                            wnVar.presentFragment(qyVar2);
                            return false;
                        }
                        TLRPC.User i12 = getParentFragment() != null ? getParentFragment().i() : MessagesController.getInstance(this.Q).getUser(Long.valueOf(this.Q2));
                        if (i12 != null) {
                            dr.a(getContext(), this.Q, i12, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new ai.e4(this, messageObject2, tL_buttonTypeRequestPeer, i12, 5), this.W3, null);
                            return false;
                        }
                    }
                }
                return true;
            }
            TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) zf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
            Boolean valueOf = (tL_buttonTypeRequestPoll.flags & 1) != 0 ? Boolean.valueOf(tL_buttonTypeRequestPoll.quiz) : null;
            wnVar.X9();
            ai.g4 g4Var = wnVar.J1;
            if (g4Var != null) {
                g4Var.S0 = false;
                g4Var.x1.setVisibility(8);
                g4Var.S1(false, valueOf);
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10) {
        float f7;
        float f10;
        int i10;
        le leVar;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i11;
        qf qfVar;
        qf qfVar2;
        le leVar2;
        boolean z11;
        af afVar;
        if (this.b3 == null && this.e3 == null && this.Z1 != messageObject) {
            W();
            boolean z12 = this.Z1 != null;
            this.Z1 = messageObject;
            this.a2 = z10;
            le leVar3 = this.A1;
            org.telegram.ui.xd xdVar = this.p1;
            ImageView imageView = this.P0;
            hg.l lVar = this.r1;
            ve veVar = this.Z0;
            if (messageObject != null) {
                this.R4 = groupedMessages != null ? groupedMessages.captionAbove : messageObject.messageOwner.invert_media;
                T(false);
                this.F1.setOnClickListener(new vd(this, 17));
                if (this.Z1.needResendWhenEdit()) {
                    long j3 = this.u4;
                    if (j3 > 0) {
                        this.F1.i(1, j3, true);
                        this.F1.setLayoutParams(w7.y5.e(44, 44, 85));
                        this.F1.requestLayout();
                        leVar = leVar3;
                        this.F1.setOnLongClickListener(new i(this, messageObject, groupedMessages, 1));
                        this.F1.setVisibility(0);
                        this.F1.setScaleX(0.1f);
                        this.F1.setScaleY(0.1f);
                        this.F1.setAlpha(0.0f);
                        this.F1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(rr.f).start();
                        if (z10) {
                            this.c0 = this.R.getMessagesController().getMaxMessageLength();
                            charSequence = this.Z1.messageText;
                        } else {
                            this.c0 = this.R.getMessagesController().maxCaptionLength;
                            charSequence = this.Z1.caption;
                        }
                        if (charSequence == null) {
                            qf qfVar3 = this.E0;
                            TextPaint paint = qfVar3 != null ? qfVar3.getPaint() : null;
                            if (paint == null) {
                                paint = new TextPaint();
                                paint.setTextSize(AndroidUtilities.dp(18.0f));
                            }
                            charSequence2 = r(this.Z1.messageOwner.entities, charSequence, paint.getFontMetricsInt());
                        } else {
                            charSequence2 = "";
                        }
                        if (this.V1 == null && !z12) {
                            qf qfVar4 = this.E0;
                            this.V1 = (qfVar4 != null || qfVar4.length() <= 0) ? null : this.E0.getText();
                            this.W1 = this.Y2;
                        }
                        MessageObject messageObject2 = this.Z1;
                        TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                        this.Y2 = ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia.manual) && ((i11 = messageObject2.type) == 0 || i11 == 19);
                        if (this.z2) {
                            kd kdVar = new kd(2, this, charSequence2);
                            this.W = kdVar;
                            AndroidUtilities.runOnUIThread(kdVar, 200L);
                        } else {
                            kd kdVar2 = this.W;
                            if (kdVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(kdVar2);
                                this.W = null;
                            }
                            setFieldText(charSequence2);
                        }
                        qfVar = this.E0;
                        if (qfVar != null) {
                            qfVar.requestFocus();
                        }
                        H0();
                        qfVar2 = this.E0;
                        if (qfVar2 != null) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qfVar2.getLayoutParams();
                            layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                            this.E0.setLayoutParams(layoutParams);
                        }
                        leVar2 = this.e1;
                        if (leVar2 == null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) leVar2.getLayoutParams();
                            z11 = false;
                            layoutParams2.rightMargin = 0;
                            this.e1.setLayoutParams(layoutParams2);
                        } else {
                            z11 = false;
                        }
                        getSendButtonInternal().setVisibility(8);
                        setSlowModeButtonVisible(z11);
                        imageView.setVisibility(8);
                        veVar.setVisibility(8);
                        xdVar.setVisibility(8);
                        if (lVar != null) {
                            this.v1 = 0.0f;
                            lVar.setAlpha(0.0f);
                            lVar.setScaleX(0.5f);
                            lVar.setScaleY(0.5f);
                        }
                        leVar.setVisibility(8);
                        afVar = this.J1;
                        if (afVar != null) {
                            afVar.setVisibility(8);
                        }
                    }
                }
                leVar = leVar3;
                this.F1.i(1, 0L, true);
                this.F1.setLayoutParams(w7.y5.e(44, 44, 85));
                this.F1.requestLayout();
                this.F1.setOnLongClickListener(new i(this, messageObject, groupedMessages, 1));
                this.F1.setVisibility(0);
                this.F1.setScaleX(0.1f);
                this.F1.setScaleY(0.1f);
                this.F1.setAlpha(0.0f);
                this.F1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(rr.f).start();
                if (z10) {
                }
                if (charSequence == null) {
                }
                if (this.V1 == null) {
                    qf qfVar42 = this.E0;
                    this.V1 = (qfVar42 != null || qfVar42.length() <= 0) ? null : this.E0.getText();
                    this.W1 = this.Y2;
                }
                MessageObject messageObject22 = this.Z1;
                TLRPC.MessageMedia messageMedia2 = messageObject22.messageOwner.media;
                this.Y2 = ((messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia2.manual) && ((i11 = messageObject22.type) == 0 || i11 == 19);
                if (this.z2) {
                }
                qfVar = this.E0;
                if (qfVar != null) {
                }
                H0();
                qfVar2 = this.E0;
                if (qfVar2 != null) {
                }
                leVar2 = this.e1;
                if (leVar2 == null) {
                }
                getSendButtonInternal().setVisibility(8);
                setSlowModeButtonVisible(z11);
                imageView.setVisibility(8);
                veVar.setVisibility(8);
                xdVar.setVisibility(8);
                if (lVar != null) {
                }
                leVar.setVisibility(8);
                afVar = this.J1;
                if (afVar != null) {
                }
            } else {
                kd kdVar3 = this.W;
                if (kdVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(kdVar3);
                    this.W = null;
                }
                ye yeVar = this.F1;
                if (yeVar != null) {
                    yeVar.setVisibility(8);
                }
                this.c0 = -1;
                this.Z2.x();
                leVar3.setVisibility(0);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                imageView.setAlpha(0.0f);
                imageView.setVisibility(8);
                int i12 = this.G0;
                wg wgVar = this.F0;
                if (i12 <= 0 || c()) {
                    getSendButtonInternal().setScaleX(0.1f);
                    getSendButtonInternal().setScaleY(0.1f);
                    getSendButtonInternal().setAlpha(0.0f);
                    getSendButtonInternal().setVisibility(8);
                    wgVar.setScaleX(0.1f);
                    wgVar.setScaleY(0.1f);
                    wgVar.setAlpha(0.0f);
                    setSlowModeButtonVisible(false);
                    f7 = 1.0f;
                    xdVar.setScaleX(1.0f);
                    this.E = 1.0f;
                    A1();
                    xdVar.setVisibility(0);
                    if (lVar != null) {
                        this.v1 = 1.0f;
                        lVar.setAlpha(1.0f);
                        lVar.setScaleX(1.0f);
                        lVar.setScaleY(1.0f);
                    }
                    veVar.setScaleX(1.0f);
                    veVar.setScaleY(1.0f);
                    veVar.setAlpha(1.0f);
                    veVar.setVisibility(0);
                } else {
                    if (this.G0 == Integer.MAX_VALUE) {
                        getSendButtonInternal().setScaleX(1.0f);
                        getSendButtonInternal().setScaleY(1.0f);
                        getSendButtonInternal().setAlpha(1.0f);
                        getSendButtonInternal().setVisibility(0);
                        wgVar.setScaleX(0.1f);
                        wgVar.setScaleY(0.1f);
                        f10 = 0.0f;
                        wgVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        i10 = 8;
                    } else {
                        f10 = 0.0f;
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        i10 = 8;
                        getSendButtonInternal().setVisibility(8);
                        wgVar.setScaleX(1.0f);
                        wgVar.setScaleY(1.0f);
                        wgVar.setAlpha(1.0f);
                        setSlowModeButtonVisible(true);
                    }
                    xdVar.setScaleX(0.01f);
                    this.E = f10;
                    A1();
                    xdVar.setVisibility(i10);
                    if (lVar != null) {
                        this.v1 = f10;
                        lVar.setAlpha(f10);
                        lVar.setScaleX(0.5f);
                        lVar.setScaleY(0.5f);
                    }
                    veVar.setScaleX(0.1f);
                    veVar.setScaleY(0.1f);
                    veVar.setAlpha(f10);
                    veVar.setVisibility(i10);
                    f7 = 1.0f;
                }
                a0();
                af afVar2 = this.J1;
                if (afVar2 != null && afVar2.getTag() != null) {
                    this.J1.setScaleX(f7);
                    this.J1.setScaleY(f7);
                    this.J1.setAlpha(f7);
                    this.J1.setVisibility(0);
                }
                org.telegram.ui.wn wnVar = this.P2;
                if (wnVar != null) {
                    wnVar.p5 = null;
                    wnVar.G5 = null;
                    MessagePreviewParams messagePreviewParams = wnVar.f5;
                    if (messagePreviewParams != null) {
                        messagePreviewParams.updateLink(this.Q, null, "", null, null, null);
                    }
                    this.X2 = null;
                    this.Y2 = true;
                    wnVar.j8();
                }
                W();
                qf qfVar5 = this.E0;
                if (qfVar5 != null) {
                    qfVar5.setText(this.V1);
                    qf qfVar6 = this.E0;
                    qfVar6.setSelection(qfVar6.length());
                }
                this.V1 = null;
                this.Y2 = this.W1;
                if (getVisibility() == 0) {
                    this.Z2.w2();
                }
                H1(1);
            }
            G1(true);
            P1(true);
            E1();
            N1();
        }
    }

    @Override // org.telegram.ui.Components.cy0
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        if (this.l5) {
            return;
        }
        org.telegram.ui.mn mnVar = this.V2;
        org.telegram.ui.wn wnVar = this.P2;
        if (mnVar != null && wnVar != null && mnVar.f) {
            wnVar.Rb();
            return;
        }
        if (!c() || i10 != 0) {
            e5.a0(this.Q, 1, this.Q2, new ge(this, document, str, sendAnimationData, z11, i10, i11, obj, z10));
            return;
        }
        e5.M(this.O2, wnVar.a(), new org.telegram.messenger.jj(this, document, str, obj, sendAnimationData, z10), this.W3);
    }

    public final void d0() {
        MessagePreviewParams messagePreviewParams;
        MessageSuggestionParams of2;
        TLRPC.Chat chat;
        int i10;
        MessageSuggestionParams of3;
        MessageObject messageObject = this.Z1;
        if (messageObject == null) {
            return;
        }
        boolean needResendWhenEdit = messageObject.needResendWhenEdit();
        org.telegram.ui.wn wnVar = this.P2;
        if (needResendWhenEdit && !ChatObject.canManageMonoForum(this.Q, this.Z1.getDialogId())) {
            if (wnVar == null || (of3 = wnVar.g5) == null) {
                of3 = MessageSuggestionParams.of(this.Z1.messageOwner.suggested_post);
            }
            if (!yh.s5.U(this.Q, of3.amount)) {
                if (wnVar != null) {
                    wnVar.Tb(of3);
                    return;
                }
                return;
            }
        }
        if (this.c0 - this.d0 < 0) {
            NumberTextView numberTextView = this.b0;
            if (numberTextView != null) {
                AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                try {
                    this.b0.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            if (MessagesController.getInstance(this.Q).premiumFeaturesBlocked() || MessagesController.getInstance(this.Q).captionLengthLimitPremium <= this.d0) {
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
                AndroidUtilities.runOnUIThread(new td(this, 27), 200L);
            }
        }
        qf qfVar = this.E0;
        CharSequence textToUse = qfVar == null ? "" : qfVar.getTextToUse();
        MessageObject messageObject2 = this.Z1;
        if (messageObject2 == null || messageObject2.type != 19) {
            textToUse = AndroidUtilities.getTrimmedString(textToUse);
        }
        CharSequence[] charSequenceArr = {textToUse};
        if (TextUtils.isEmpty(charSequenceArr[0])) {
            TLRPC.MessageMedia messageMedia = this.Z1.messageOwner.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                AndroidUtilities.shakeViewSpring(this.E0, -3.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
        }
        ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.Q).getEntities(charSequenceArr, y1());
        if (!TextUtils.equals(charSequenceArr[0], this.Z1.messageText) || ((entities != null && !entities.isEmpty()) || !this.Z1.messageOwner.entities.isEmpty() || (this.Z1.messageOwner.media instanceof TLRPC.TL_messageMediaWebPage))) {
            MessageObject messageObject3 = this.Z1;
            messageObject3.editingMessage = charSequenceArr[0];
            messageObject3.editingMessageEntities = entities;
            messageObject3.editingMessageSearchWebPage = this.Y2;
            if (wnVar != null && (chat = wnVar.e) != null && (((i10 = messageObject3.type) == 0 || i10 == 19) && !ChatObject.canSendEmbed(chat))) {
                MessageObject messageObject4 = this.Z1;
                messageObject4.editingMessageSearchWebPage = false;
                TLRPC.Message message = messageObject4.messageOwner;
                message.flags &= -513;
                message.media = null;
            } else if (wnVar == null || (messagePreviewParams = wnVar.f5) == null) {
                MessageObject messageObject5 = this.Z1;
                messageObject5.editingMessageSearchWebPage = false;
                int i11 = messageObject5.type;
                if (i11 == 0 || i11 == 19) {
                    TLRPC.Message message2 = messageObject5.messageOwner;
                    message2.flags |= 512;
                    message2.media = new TLRPC.TL_messageMediaEmpty();
                }
            } else {
                if (wnVar.G5 instanceof TLRPC.TL_webPagePending) {
                    MessageObject messageObject6 = this.Z1;
                    messageObject6.editingMessageSearchWebPage = false;
                    int i12 = messageObject6.type;
                    if (i12 == 0 || i12 == 19) {
                        messageObject6.messageOwner.media = new TLRPC.TL_messageMediaEmpty();
                        this.Z1.messageOwner.flags |= 512;
                    }
                } else if (messagePreviewParams.webpage != null) {
                    MessageObject messageObject7 = this.Z1;
                    messageObject7.editingMessageSearchWebPage = false;
                    TLRPC.Message message3 = messageObject7.messageOwner;
                    message3.flags |= 512;
                    message3.media = new TLRPC.TL_messageMediaWebPage();
                    this.Z1.messageOwner.media.webpage = wnVar.f5.webpage;
                } else {
                    MessageObject messageObject8 = this.Z1;
                    messageObject8.editingMessageSearchWebPage = false;
                    int i13 = messageObject8.type;
                    if (i13 == 0 || i13 == 19) {
                        TLRPC.Message message4 = messageObject8.messageOwner;
                        message4.flags |= 512;
                        message4.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                TLRPC.Message message5 = this.Z1.messageOwner;
                MessagePreviewParams messagePreviewParams2 = wnVar.f5;
                message5.invert_media = messagePreviewParams2.webpageTop;
                if (messagePreviewParams2.hasMedia) {
                    TLRPC.MessageMedia messageMedia2 = message5.media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                        boolean z10 = messagePreviewParams2.webpageSmall;
                        messageMedia2.force_small_media = z10;
                        messageMedia2.force_large_media = true ^ z10;
                    }
                }
            }
            if (this.Z1.needResendWhenEdit()) {
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(this.Z1.editingMessage.toString(), this.Z1.getDialogId());
                if (wnVar == null || (of2 = wnVar.g5) == null) {
                    of2 = MessageSuggestionParams.of(this.Z1.messageOwner.suggested_post);
                }
                of4.suggestionParams = of2;
                of4.monoForumPeer = DialogObject.getPeerDialogId(this.Z1.messageOwner.saved_peer_id);
                of4.hasMediaSpoilers = this.Z1.hasMediaSpoilers();
                MessageObject messageObject9 = this.Z1;
                of4.replyToMsg = messageObject9;
                of4.parentObject = messageObject9;
                if (messageObject9.getDocument() instanceof TLRPC.TL_document) {
                    of4.document = (TLRPC.TL_document) this.Z1.getDocument();
                    of4.caption = of4.message;
                    of4.message = null;
                } else {
                    TLRPC.MessageMedia messageMedia3 = this.Z1.messageOwner.media;
                    if (messageMedia3 != null && !(messageMedia3 instanceof TLRPC.TL_messageMediaEmpty)) {
                        TLRPC.Photo photo = messageMedia3.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            of4.photo = (TLRPC.TL_photo) photo;
                        } else {
                            of4.location = messageMedia3;
                        }
                        of4.caption = of4.message;
                        of4.message = null;
                    }
                }
                SendMessagesHelper.getInstance(this.Q).sendMessage(of4);
            } else {
                SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(this.Q);
                MessageObject messageObject10 = this.Z1;
                sendMessagesHelper.editMessage(messageObject10, null, null, null, null, null, null, false, messageObject10.hasMediaSpoilers(), null);
            }
        }
        c1(null, null, false);
    }

    public final void d1(boolean z10, boolean z11) {
        zg zgVar;
        qf qfVar;
        le leVar;
        oe oeVar = this.Q0;
        if (oeVar == null) {
            return;
        }
        if (this.w2 == 1 || ((leVar = this.e1) != null && leVar.getVisibility() == 0)) {
            this.h = 0.0f;
            this.n = 0.0f;
            F1();
            z11 = false;
        }
        zg zgVar2 = zg.f;
        zg zgVar3 = zg.e;
        if (!z10 || this.f2 != 0) {
            eg egVar = this.U0;
            int i10 = egVar == null ? MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0) : egVar.getCurrentPage();
            zgVar = (i10 == 0 || !((this.J2 || this.K2) && ((qfVar = this.E0) == null || TextUtils.isEmpty(qfVar.getText())))) ? zgVar3 : i10 == 1 ? zg.c : zgVar2;
        } else if (!this.z0) {
            return;
        } else {
            zgVar = zg.d;
        }
        if (!this.z0 && zgVar == zgVar3) {
            zgVar3 = zgVar2;
        } else if (this.b || zgVar == zgVar3) {
            zgVar3 = zgVar;
        }
        oeVar.j(zgVar3, z11);
        if (zgVar3 == zgVar2 && this.U0 == null) {
            MediaDataController.getInstance(this.Q).loadRecents(0, true, true, false);
            ArrayList<String> arrayList = MessagesController.getInstance(this.Q).gifSearchEmojies;
            int min = Math.min(10, arrayList.size());
            for (int i11 = 0; i11 < min; i11++) {
                Emoji.preloadEmoji(arrayList.get(i11));
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ye yeVar;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat;
        double d;
        hg.l lVar;
        if (i10 == NotificationCenter.emojiLoaded) {
            eg egVar = this.U0;
            if (egVar != null) {
                egVar.P.f1();
            }
            bg bgVar = this.H1;
            if (bgVar != null) {
                ArrayList arrayList = bgVar.n;
                while (r4 < arrayList.size()) {
                    ((ei.n0) arrayList.get(r4)).invalidate();
                    r4++;
                }
            }
            qf qfVar = this.E0;
            if (qfVar != null) {
                qfVar.postInvalidate();
                this.E0.invalidateForce();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.recordProgressChanged) {
            if (((Integer) objArr[0]).intValue() != this.G2) {
                return;
            }
            if (this.w2 != 0 && !this.m3 && !c()) {
                this.m3 = true;
                this.R.getMessagesController().sendTyping(this.Q2, getThreadMessageId(), this.c1 ? 7 : 1, 0);
            }
            RecordCircle recordCircle = this.N1;
            if (recordCircle != null) {
                recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.closeChats) {
            qf qfVar2 = this.E0;
            if (qfVar2 == null || !qfVar2.isFocused()) {
                return;
            }
            AndroidUtilities.hideKeyboard(this.E0);
            return;
        }
        int i12 = 5;
        if (i10 == NotificationCenter.recordStartError || i10 == NotificationCenter.recordStopped) {
            if (((Integer) objArr[0]).intValue() == this.G2 && this.F2) {
                this.F2 = false;
                if (i10 != NotificationCenter.recordStopped) {
                    L1(2, true);
                    return;
                }
                Integer num = (Integer) objArr[1];
                if (num.intValue() == 4) {
                    i12 = 4;
                } else if (this.c1 && num.intValue() == 5) {
                    i12 = 1;
                } else if (num.intValue() != 0) {
                    i12 = num.intValue() == 6 ? 2 : 3;
                }
                if (i12 != 3) {
                    L1(i12, true);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.recordStarted) {
            if (((Integer) objArr[0]).intValue() != this.G2) {
                return;
            }
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            this.c1 = !booleanValue;
            we weVar = this.b1;
            if (weVar != null) {
                weVar.j(booleanValue ? zg.a : zg.b, true);
            }
            if (this.F2) {
                RecordCircle recordCircle2 = this.N1;
                if (recordCircle2 != null) {
                    recordCircle2.I = true;
                }
            } else {
                this.F2 = true;
                L1(0, true);
            }
            xg xgVar = this.Y0;
            if (xgVar != null) {
                xgVar.a(this.i1);
            }
            ug ugVar = this.l1;
            if (ugVar != null) {
                ugVar.h = false;
                return;
            }
            return;
        }
        byte[] bArr = null;
        if (i10 == NotificationCenter.recordPaused) {
            this.F2 = false;
            this.b3 = null;
            this.e3 = null;
            return;
        }
        if (i10 == NotificationCenter.recordResumed) {
            this.b3 = null;
            this.e3 = null;
            xg xgVar2 = this.Y0;
            if (xgVar2 != null) {
                xgVar2.a(this.i1);
            }
            K(true);
            this.F2 = true;
            L1(0, true);
            return;
        }
        if (i10 != NotificationCenter.audioDidSent) {
            if (i10 == NotificationCenter.audioRouteChanged) {
                Activity activity = this.O2;
                if (activity != null) {
                    activity.setVolumeControlStream(((Boolean) objArr[0]).booleanValue() ? 0 : TLObject.FLAG_31);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
                if (this.d3 == null || !MediaController.getInstance().isPlayingMessage(this.d3)) {
                    return;
                }
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                MessageObject messageObject = this.d3;
                messageObject.audioProgress = playingMessageObject.audioProgress;
                messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                return;
            }
            if (i10 == NotificationCenter.featuredStickersDidLoad) {
                oe oeVar = this.Q0;
                if (oeVar != null) {
                    oeVar.invalidate();
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.messageReceivedByServer2) {
                if (((Boolean) objArr[6]).booleanValue()) {
                    return;
                }
                long longValue = ((Long) objArr[3]).longValue();
                Integer num2 = (Integer) objArr[1];
                if (longValue != this.Q2 || (chatFull = this.d2) == null || chatFull.slowmode_seconds == 0 || MessageObject.isEphemeralMessageId(num2.intValue()) || (chat = this.R.getMessagesController().getChat(Long.valueOf(this.d2.id))) == null || ChatObject.hasAdminRights(chat) || ChatObject.isIgnoredChatRestrictionsForBoosters(chat)) {
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
            if (i10 == NotificationCenter.sendingMessagesChanged) {
                if (this.d2 != null) {
                    S1();
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.audioRecordTooShort) {
                this.b3 = null;
                this.e3 = null;
                L1(4, true);
                return;
            }
            if (i10 != NotificationCenter.updateBotMenuButton) {
                if (i10 == NotificationCenter.didUpdatePremiumGiftFieldIcon) {
                    I1(true);
                    return;
                } else {
                    if (i10 == NotificationCenter.currentUserPremiumStatusChanged && this.D1 && (yeVar = this.J0) != null) {
                        yeVar.setLocked(!UserConfig.getInstance(this.Q).isPremium());
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
                    this.m5 = 3;
                } else if (this.p2) {
                    this.m5 = 2;
                } else {
                    this.m5 = 1;
                }
                B1(false);
                return;
            }
            return;
        }
        if (((Integer) objArr[0]).intValue() != this.G2) {
            return;
        }
        this.i1 = 0L;
        Object obj = objArr[1];
        if (obj instanceof VideoEditedInfo) {
            VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
            this.e3 = videoEditedInfo;
            String str = (String) objArr[2];
            this.c3 = str;
            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
            this.i1 = videoEditedInfo.estimatedDuration;
            i81 i81Var = this.f1;
            if (i81Var != null) {
                i81Var.setVideoPath(str);
                this.f1.setKeyframes(arrayList2);
                this.f1.setVisibility(0);
                this.f1.setMinProgressDiff(1000.0f / this.e3.estimatedDuration);
                x0();
            }
            L1(3, true);
            K(false);
            return;
        }
        this.b3 = (TLRPC.TL_document) obj;
        this.c3 = (String) objArr[2];
        boolean z10 = objArr.length >= 4 && ((Boolean) objArr[3]).booleanValue();
        float floatValue = objArr.length >= 5 ? ((Float) objArr[4]).floatValue() : 0.0f;
        float floatValue2 = objArr.length >= 6 ? ((Float) objArr[5]).floatValue() : 1.0f;
        if (this.b3 == null) {
            og ogVar = this.Z2;
            if (ogVar != null) {
                ogVar.H(null, true, 0, 0, 0L);
                return;
            }
            return;
        }
        X();
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
        long clientUserId = UserConfig.getInstance(this.Q).getClientUserId();
        tL_peerUser.user_id = clientUserId;
        peer.user_id = clientUserId;
        tL_message.date = (int) (System.currentTimeMillis() / 1000);
        tL_message.message = "";
        tL_message.attachPath = this.c3;
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.flags |= 3;
        tL_messageMediaDocument.document = this.b3;
        tL_message.flags |= 768;
        this.d3 = new MessageObject(UserConfig.selectedAccount, tL_message, false, true);
        this.e1.setAlpha(1.0f);
        this.e1.setVisibility(0);
        this.g1.setVisibility(0);
        this.g1.setAlpha(0.0f);
        this.g1.setScaleY(0.0f);
        this.g1.setScaleX(0.0f);
        int i13 = 0;
        while (true) {
            if (i13 >= this.b3.attributes.size()) {
                d = 0.0d;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = this.b3.attributes.get(i13);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                d = documentAttribute.duration;
                break;
            }
            i13++;
        }
        int i14 = 0;
        while (true) {
            if (i14 >= this.b3.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute2 = this.b3.attributes.get(i14);
            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                byte[] bArr2 = documentAttribute2.waveform;
                if (bArr2 == null || bArr2.length == 0) {
                    documentAttribute2.waveform = MediaController.getWaveform(this.c3);
                }
                bArr = documentAttribute2.waveform;
            } else {
                i14++;
            }
        }
        if (z10 && (lVar = this.r1) != null) {
            this.v1 = 0.0f;
            lVar.setAlpha(0.0f);
            lVar.setScaleX(0.0f);
            lVar.setScaleY(0.0f);
        }
        this.i1 = (long) (1000.0d * d);
        rk0 rk0Var = this.h1;
        String str2 = this.c3;
        if (!rk0Var.Q) {
            rk0Var.r = (float) d;
            rk0Var.s = floatValue;
            rk0Var.v = floatValue2;
            rk0Var.w = false;
            rk0Var.h.q(AndroidUtilities.formatDuration((int) Math.round(Math.max(1.0d, d)), false), false, true);
            rk0Var.f.a(false, false);
            if (rk0Var.n == null) {
                s71 s71Var = new s71();
                rk0Var.n = s71Var;
                s71Var.J = new n2.e(rk0Var, 9);
            }
            rk0Var.n.D(Uri.fromFile(new File(str2)), "other");
            rk0Var.K = 0;
            rk0Var.L = bArr;
            rk0Var.invalidate();
        }
        K(false);
        if (z10) {
            Y();
            Z();
            X();
            this.w2 = 1;
            this.N1.c(false);
            this.v3.set(this.N1, Float.valueOf(1.0f));
            sg sgVar = this.O1;
            if (sgVar != null) {
                sgVar.setVisibility(0);
                this.O1.setAlpha(1.0f);
            }
        }
        L1(3, !z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        eg egVar = this.U0;
        if (egVar == null || egVar.getVisibility() != 0 || this.U0.getStickersExpandOffset() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipRect(0, AndroidUtilities.dp(2.0f), getMeasuredWidth(), getMeasuredHeight());
        canvas.translate(0.0f, -this.U0.getStickersExpandOffset());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        View view2 = this.G1;
        le leVar = this.z1;
        boolean z10 = view == view2 || view == leVar;
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.f5.e;
            canvas.save();
            if (view == leVar) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.G1) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        TextPaint textPaint;
        M1();
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.e();
        }
        ug ugVar = this.l1;
        if (ugVar != null) {
            ugVar.a();
        }
        SlideTextView slideTextView = this.k1;
        if (slideTextView != null) {
            slideTextView.a();
        }
        xg xgVar = this.Y0;
        if (xgVar != null && (textPaint = xgVar.F) != null) {
            textPaint.setColor(xgVar.I.i0(org.telegram.ui.ActionBar.h6.nf));
        }
        i81 i81Var = this.f1;
        if (i81Var != null) {
            i81Var.e.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.a7, false));
            i81Var.L = 0;
            g81 g81Var = i81Var.P;
            if (g81Var != null) {
                g81Var.b();
            }
        }
        NumberTextView numberTextView = this.b0;
        if (numberTextView != null && this.E0 != null) {
            if (this.d0 - this.c0 < 0) {
                numberTextView.setTextColor(i0(org.telegram.ui.ActionBar.h6.p7));
            } else {
                numberTextView.setTextColor(i0(org.telegram.ui.ActionBar.h6.y6));
            }
        }
        Color.alpha(i0(org.telegram.ui.ActionBar.h6.bf));
        of ofVar = this.m0;
        if (ofVar != null) {
            ofVar.d.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ii, false));
            ch.d dVar = ofVar.r;
            if (dVar != null) {
                dVar.v();
            }
            ofVar.invalidate();
        }
        bg bgVar = this.H1;
        if (bgVar != null) {
            bgVar.e();
        }
        int i02 = this.a1 ? i0(org.telegram.ui.ActionBar.h6.Wk) : -1;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.b1.setColorFilter(new PorterDuffColorFilter(i02, mode));
        int i10 = org.telegram.ui.ActionBar.h6.Wk;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0(i10), mode);
        oe oeVar = this.Q0;
        oeVar.setColorFilter(porterDuffColorFilter);
        int i11 = org.telegram.ui.ActionBar.h6.i6;
        oeVar.setBackground(org.telegram.ui.ActionBar.h6.f0(i0(i11), 1, -1));
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i0(i10), mode);
        ImageView imageView = this.R0;
        imageView.setColorFilter(porterDuffColorFilter2);
        int i03 = i0(i11);
        float dp = AndroidUtilities.dp(19.0f);
        int dp2 = AndroidUtilities.dp(1.0f);
        int dp3 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.W(dp, i03, dp2, dp3, dp2, dp3));
        this.B1.setColorFilter(i0(org.telegram.ui.ActionBar.h6.hl), mode);
    }

    public final void e0(Canvas canvas, boolean z10) {
        if (this.y4) {
            int z11 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, this.C4, org.telegram.ui.ActionBar.h6.i3.getIntrinsicHeight(), this.T1);
            View view = this.G1;
            if (view != null && view.getVisibility() == 0) {
                z11 = (int) (((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + z11);
            }
            int intrinsicHeight = org.telegram.ui.ActionBar.h6.i3.getIntrinsicHeight() + z11;
            if (z10) {
                org.telegram.ui.ActionBar.h6.i3.setAlpha((int) (this.C4 * 255.0f));
                org.telegram.ui.ActionBar.h6.i3.setBounds(0, z11, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.h6.i3.draw(canvas);
            }
            if (!this.x4) {
                float f7 = intrinsicHeight;
                float width = getWidth();
                float height = getHeight();
                org.telegram.ui.ActionBar.d6 d6Var = this.W3;
                Paint G = d6Var != null ? d6Var.G("paintChatComposeBackground") : null;
                if (G == null) {
                    G = org.telegram.ui.ActionBar.h6.S0("paintChatComposeBackground");
                }
                canvas.drawRect(0.0f, f7, width, height, G);
                return;
            }
            int i02 = i0(org.telegram.ui.ActionBar.h6.Sd);
            Paint paint = this.B4;
            paint.setColor(i02);
            if (!SharedConfig.chatBlurEnabled() || this.m1 == null) {
                canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint);
            } else {
                this.D4.set(0, intrinsicHeight, getWidth(), getHeight());
                this.m1.J(canvas, getTop(), this.D4, paint, false);
            }
        }
    }

    public final void e1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.O2.getSystemService("accessibility");
        if (this.E0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        try {
            this.E0.requestFocus();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final boolean f0(Canvas canvas, Utilities.Callback0Return callback0Return) {
        float f7;
        float f10;
        float f11;
        float f12;
        float e = this.b5.e(this.E0.canScrollVertically(-1));
        float e7 = this.c5.e(this.E0.canScrollVertically(1));
        if (e <= 0.0f && e7 <= 0.0f) {
            return ((Boolean) callback0Return.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.E0.getX() + this.E0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.E0.getY() + this.E0.getMeasuredHeight() + AndroidUtilities.dp(2.0f), 255, 31);
        boolean booleanValue = ((Boolean) callback0Return.run()).booleanValue();
        canvas.save();
        LinearGradient linearGradient = this.Z4;
        Paint paint = this.Y4;
        Matrix matrix = this.a5;
        if (e > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            f7 = 255.0f;
            f10 = 16.0f;
            f11 = 0.0f;
            f12 = 5.0f;
            rectF.set(this.E0.getX() - AndroidUtilities.dp(5.0f), (this.E0.getY() + this.T1) - 1.0f, this.E0.getX() + this.E0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.E0.getY() + this.T1 + AndroidUtilities.dp(13.0f));
            matrix.reset();
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (e * 255.0f));
            canvas.drawRect(rectF, paint);
        } else {
            f7 = 255.0f;
            f10 = 16.0f;
            f11 = 0.0f;
            f12 = 5.0f;
        }
        if (e7 > f11) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(this.E0.getX() - AndroidUtilities.dp(f12), (this.E0.getY() + this.E0.getMeasuredHeight()) - AndroidUtilities.dp(15.0f), this.E0.getX() + this.E0.getMeasuredWidth() + AndroidUtilities.dp(f12), this.E0.getY() + this.E0.getMeasuredHeight() + AndroidUtilities.dp(2.0f) + 1.0f);
            matrix.reset();
            matrix.postScale(1.0f, rectF2.height() / f10);
            matrix.postRotate(180.0f);
            matrix.postTranslate(rectF2.left, rectF2.bottom);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (e7 * f7));
            canvas.drawRect(rectF2, paint);
        }
        canvas.restore();
        canvas.restore();
        return booleanValue;
    }

    public final void f1(CharSequence charSequence, boolean z10) {
        qf qfVar = this.E0;
        if (qfVar == null) {
            return;
        }
        this.R2 = true;
        qfVar.setText(charSequence);
        this.E0.invalidateQuotes(true);
        qf qfVar2 = this.E0;
        qfVar2.setSelection(qfVar2.getText().length());
        this.R2 = false;
        og ogVar = this.Z2;
        if (ogVar != null) {
            ogVar.l1(this.E0.getText(), true, z10);
        }
    }

    public final zf g0(MessageObject messageObject, boolean z10) {
        zf zfVar = new zf(messageObject.currentAccount, messageObject.messageOwner, true, true);
        if (z10) {
            qf qfVar = this.E0;
            CharSequence[] charSequenceArr = {qfVar == null ? "" : qfVar.getTextToUse()};
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.Q).getEntities(charSequenceArr, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            MessageObject.addEntitiesToText(spannableStringBuilder, entities, true, true, false, true);
            zfVar.caption = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, org.telegram.ui.ActionBar.h6.o2.getFontMetricsInt(), false, (int[]) null), entities, org.telegram.ui.ActionBar.h6.o2.getFontMetricsInt());
        }
        return zfVar;
    }

    public final void g1(boolean z10, boolean z11) {
        this.H2 = z10;
        K(z11);
    }

    public org.telegram.ui.ActionBar.o1 getAdjustPanLayoutHelper() {
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

    public ei.f4 getBotWebViewButton() {
        if (this.k0 == null) {
            Context context = getContext();
            ei.f4 f4Var = new ei.f4(context);
            f4Var.a = new Path();
            f4Var.c = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            f4Var.addView(textView, w7.y5.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(AndroidUtilities.dp(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            f4Var.addView(radialProgressView, w7.y5.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Qh, false), 2, -1));
            f4Var.addView(view, w7.y5.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            f4Var.setWillNotDraw(false);
            this.k0 = f4Var;
            f4Var.setVisibility(8);
            R();
            this.k0.setBotMenuButton(this.l0);
            this.y1.addView(this.k0, w7.y5.e(-1, -1, 80));
        }
        return this.k0;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public int getCursorPosition() {
        qf qfVar = this.E0;
        if (qfVar == null) {
            return 0;
        }
        return qfVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.Z1 != null) {
            if (TextUtils.isEmpty(this.V1)) {
                return null;
            }
            return this.V1;
        }
        if (this.E0 == null || !k0()) {
            return null;
        }
        return this.E0.getText();
    }

    @Override // org.telegram.ui.Components.vy0
    public Editable getEditText() {
        qf qfVar = this.E0;
        if (qfVar == null) {
            return null;
        }
        return qfVar.getText();
    }

    public MessageObject getEditingMessageObject() {
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

    public lz getEmojiView() {
        return this.U0;
    }

    public float getExitTransition() {
        return this.m4;
    }

    @Override // org.telegram.ui.Components.vy0
    public CharSequence getFieldText() {
        if (this.E0 == null || !k0()) {
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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r4.e3 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getMessagesCount() {
        MessagePreviewParams messagePreviewParams;
        org.telegram.ui.wn wnVar = this.P2;
        int forwardedMessagesCount = (wnVar == null || (messagePreviewParams = wnVar.f5) == null) ? 0 : messagePreviewParams.getForwardedMessagesCount();
        qf qfVar = this.E0;
        if (qfVar == null || TextUtils.isEmpty(qfVar.getText())) {
            if (this.d3 == null) {
            }
            forwardedMessagesCount++;
        } else {
            String trimmedString = SendMessagesHelper.getTrimmedString(this.E0.getText().toString());
            int maxMessageLength = this.R.getMessagesController().getMaxMessageLength();
            if (trimmedString.length() != 0) {
                forwardedMessagesCount += (int) Math.ceil(trimmedString.length() / maxMessageLength);
            }
            forwardedMessagesCount++;
        }
        return Math.max(1, forwardedMessagesCount);
    }

    public RecordCircle getRecordCircle() {
        return this.N1;
    }

    public MessageObject getReplyingMessageObject() {
        return this.T2;
    }

    public int getSelectionLength() {
        qf qfVar = this.E0;
        if (qfVar == null) {
            return 0;
        }
        try {
            return qfVar.getSelectionEnd() - this.E0.getSelectionStart();
        } catch (Exception e) {
            FileLog.e(e);
            return 0;
        }
    }

    public View getSendButton() {
        return getSendButtonInternal().getVisibility() == 0 ? getSendButtonInternal() : this.Z0;
    }

    public View getSendButtonInternal() {
        return this.J0;
    }

    public MessageSuggestionParams getSendMessageSuggestionParams() {
        org.telegram.ui.wn wnVar = this.P2;
        if (wnVar != null) {
            return wnVar.g5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.wn wnVar = this.P2;
        if (wnVar != null) {
            return wnVar.N8();
        }
        return 0L;
    }

    public jp0 getSenderSelectView() {
        return this.p0;
    }

    public aw0 getSizeNotifierLayout() {
        return this.m1;
    }

    public float getSlideToCancelProgress() {
        return this.j4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.G0 > 0) {
            return this.F0.a.getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.wn wnVar = this.P2;
        return wnVar != null ? wnVar.getMessagesController().getSendPaidMessagesStars(wnVar.a()) : MessagesController.getInstance(this.Q).getSendPaidMessagesStars(this.Q2);
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
        tL_textWithEntities.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.g5.e;
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

    public d51 getTrendingStickersAlert() {
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

    public void h1(float f7, float f10, float f11, boolean z10) {
        int dp;
        float f12 = 1.0f - f11;
        float f13 = f7 * f12;
        float f14 = f10 * f12;
        this.r = (f11 * 0.5f) + 0.5f;
        this.s = f11;
        F1();
        float f15 = -f13;
        this.Q0.setTranslationX(f15);
        if (this.E0 == null) {
            dp = 0;
        } else {
            int dp2 = AndroidUtilities.dp(40.0f);
            jp0 jp0Var = this.p0;
            dp = dp2 + ((jp0Var == null || jp0Var.getVisibility() != 0) ? 0 : AndroidUtilities.dp(18.0f));
        }
        this.H = f15 - (dp * f12);
        lj0 lj0Var = this.g1;
        if (lj0Var != null) {
            lj0Var.setTranslationX(f15);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f14);
        }
        sg sgVar = this.O1;
        if (sgVar != null) {
            sgVar.setTranslationX(f14);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f15);
        }
        le leVar = this.A1;
        leVar.setTranslationX(f14);
        leVar.setAlpha(f11);
        ImageView imageView = this.w1;
        if (imageView != null) {
            imageView.setAlpha(imageView.getScaleX() > 0.7f ? f11 : 0.0f);
        }
        boolean z11 = true;
        if (z10 && f11 != 1.0f) {
            z11 = false;
        }
        this.J = z11;
        this.y = f14;
        this.F = f11;
        A1();
        J1();
        float f16 = f13 * f12;
        if (this.I != f16) {
            this.I = f16;
            rk0 rk0Var = this.h1;
            if (rk0Var != null) {
                rk0Var.setTranslationX(f16);
                this.h1.invalidate();
            }
        }
        if (this.E0 != null) {
            float lerp = AndroidUtilities.lerp(0.88f, 1.0f, f11);
            this.E0.setPivotX(0.0f);
            this.E0.setPivotY(r9.getMeasuredHeight() / 2.0f);
            this.E0.setScaleX(lerp);
            this.E0.setScaleY(lerp);
            this.E0.setHintRightOffset(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f11));
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final int i0(int i10) {
        org.telegram.ui.ActionBar.d6 d6Var = this.W3;
        return d6Var != null ? d6Var.G0(i10) : org.telegram.ui.ActionBar.h6.w0(null, i10, false);
    }

    public final void i1(boolean z10) {
        if (this.l5 == z10) {
            return;
        }
        this.l5 = z10;
        this.r1.setVisibility(z10 ? 8 : 0);
        if (z10) {
            AndroidUtilities.removeFromParent(this.I1);
        }
        if (z10) {
            this.b1.setVisibility(8);
        } else {
            P0();
        }
        if (!z10) {
            this.c0 = -1;
            NumberTextView numberTextView = this.b0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        H1(this.P4);
        K(false);
    }

    public final boolean j0() {
        return this.m5 == 3;
    }

    public final void j1(CharSequence charSequence, boolean z10) {
        this.e = charSequence;
        this.f = null;
        G1(z10);
    }

    public final boolean k0() {
        qf qfVar = this.E0;
        return qfVar != null && qfVar.length() > 0;
    }

    public final void k1(boolean z10, boolean z11) {
        we weVar = this.b1;
        if (weVar == null) {
            return;
        }
        this.c1 = z10;
        if (z11) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z12 = false;
            if (DialogObject.isChatDialog(this.Q2)) {
                TLRPC.Chat chat = this.R.getMessagesController().getChat(Long.valueOf(-this.Q2));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    z12 = true;
                }
            }
            globalMainSettings.edit().putBoolean(z12 ? "currentModeVideoChannel" : "currentModeVideo", z10).apply();
        }
        weVar.j(this.c1 ? zg.b : zg.a, z11);
        weVar.setContentDescription(LocaleController.getString(this.c1 ? R.string.AccDescrVideoMessage : R.string.AccDescrVoiceMessage));
        this.Z0.setContentDescription(LocaleController.getString(this.c1 ? R.string.AccDescrVideoMessage : R.string.AccDescrVoiceMessage));
        weVar.sendAccessibilityEvent(8);
    }

    public final void l0() {
        ci.e4 e4Var = this.N;
        if (e4Var != null) {
            e4Var.e(true);
        }
        ci.e4 e4Var2 = this.L;
        if (e4Var2 != null) {
            e4Var2.e(true);
        }
    }

    public final void l1(MessageObject messageObject, org.telegram.ui.mn mnVar, MessageObject messageObject2) {
        MessageObject messageObject3;
        org.telegram.ui.wn wnVar = this.P2;
        boolean z10 = (wnVar == null || !wnVar.v9() || this.U2 == messageObject2) ? false : true;
        if (messageObject != null) {
            if (this.W2 == null && (messageObject3 = this.m2) != this.T2) {
                this.W2 = messageObject3;
            }
            this.T2 = messageObject;
            this.V2 = mnVar;
            this.U2 = messageObject2;
            if (wnVar == null || !wnVar.h4 || wnVar.X3 != messageObject) {
                Z0(messageObject, true, true);
            }
        } else if (this.T2 == this.m2) {
            this.T2 = null;
            this.U2 = null;
            this.V2 = null;
            Z0(this.W2, true, false);
            this.W2 = null;
        } else {
            this.T2 = null;
            this.V2 = null;
            this.U2 = null;
        }
        G(true);
        og ogVar = this.Z2;
        MediaController.getInstance().setReplyingMessage(messageObject, getThreadMessage(), ogVar != null ? ogVar.d1() : null);
        G1(z10);
    }

    public final void m0(boolean z10) {
        n0(z10, false, true);
    }

    public final void m1(int i10, boolean z10) {
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
                ofFloat.addUpdateListener(new rd(this, 4));
                this.v0.addListener(new df(this, z11, 3));
                this.v0.setDuration(220L);
                this.v0.setInterpolator(rr.f);
                this.v0.start();
            } else {
                this.w0 = z11 ? 1.0f : 0.0f;
                eg egVar = this.U0;
                if (egVar != null) {
                    egVar.Y();
                }
            }
        }
        this.R1 = i10;
    }

    public final void n(TLRPC.Document document) {
        MediaDataController.getInstance(this.Q).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
        eg egVar = this.U0;
        if (egVar == null || document == null) {
            return;
        }
        boolean isEmpty = egVar.i1.isEmpty();
        egVar.W();
        if (isEmpty) {
            egVar.X(false);
        }
    }

    public final boolean n0(boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (t0()) {
            if (this.f2 == 1 && (tL_replyKeyboardMarkup = this.n2) != null && z10 && this.m2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    MessagesController.getMainSettings(this.Q).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.m2.getId()).apply();
                }
            }
            if ((z10 && this.R1 != 0) || z11) {
                m1(0, true);
                eg egVar = this.U0;
                if (egVar != null) {
                    egVar.t(true);
                }
                qf qfVar = this.E0;
                if (qfVar != null) {
                    qfVar.requestFocus();
                }
                n1(false, true, false, true);
                if (this.y3) {
                    K(true);
                    return true;
                }
            } else {
                if (this.R1 == 0) {
                    if (this.z3) {
                        n1(false, true, false, true);
                        return true;
                    }
                    t1(0, 0, true, z12 && !z10);
                    return true;
                }
                m1(0, false);
                this.U0.t(false);
                qf qfVar2 = this.E0;
                if (qfVar2 != null) {
                    qfVar2.requestFocus();
                }
            }
            return true;
        }
        return false;
    }

    public final void n1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i10 = 1;
        org.telegram.ui.ActionBar.o1 o1Var = this.U;
        if ((o1Var != null && o1Var.f) || this.l3 || this.U0 == null) {
            return;
        }
        if (z12 || this.z3 != z10) {
            this.z3 = z10;
            og ogVar = this.Z2;
            if (ogVar != null) {
                ogVar.s1();
            }
            Point point = AndroidUtilities.displaySize;
            final int i11 = point.x > point.y ? this.y2 : this.x2;
            AnimatorSet animatorSet = this.B3;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.B3 = null;
            }
            boolean z14 = this.z3;
            AnimationNotificationsLocker animationNotificationsLocker = this.L3;
            org.telegram.ui.Cells.d1 d1Var = this.t3;
            final int i12 = 0;
            aw0 aw0Var = this.m1;
            if (z14) {
                if (z13) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
                }
                int height = aw0Var.getHeight();
                this.o1 = height;
                int dp = ((((height - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
                this.D3 = dp;
                if (this.R1 == 2) {
                    this.D3 = Math.min(dp, AndroidUtilities.dp(175.0f) + i11);
                }
                if (this.d5 == null) {
                    this.U0.getLayoutParams().height = this.D3;
                }
                aw0Var.requestLayout();
                if (this.y4) {
                    aw0Var.setForeground(new ed(this));
                }
                qf qfVar = this.E0;
                if (qfVar != null) {
                    int selectionStart = qfVar.getSelectionStart();
                    int selectionEnd = this.E0.getSelectionEnd();
                    qf qfVar2 = this.E0;
                    qfVar2.setText(qfVar2.getText());
                    this.E0.setSelection(selectionStart, selectionEnd);
                }
                if (z11) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    if (this.d5 != null) {
                        animatorSet2.playTogether(ValueAnimator.ofInt(-(this.D3 - i11)), ValueAnimator.ofInt(-(this.D3 - i11)), ObjectAnimator.ofFloat(this.F3, "animationProgress", 1.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofInt(this, d1Var, -(this.D3 - i11)), ObjectAnimator.ofInt(this.U0, d1Var, -(this.D3 - i11)), ObjectAnimator.ofFloat(this.F3, "animationProgress", 1.0f));
                    }
                    animatorSet2.setDuration(300L);
                    animatorSet2.setInterpolator(rr.f);
                    if (this.d5 == null) {
                        ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.zd
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
                                        int i15 = ChatActivityEnterView.n5;
                                        chatActivityEnterView.C3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i14)));
                                        chatActivityEnterView.m1.invalidate();
                                        break;
                                    default:
                                        int i16 = ChatActivityEnterView.n5;
                                        chatActivityEnterView.C3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i14));
                                        chatActivityEnterView.m1.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet2.addListener(new ze(this, 12));
                    this.B3 = animatorSet2;
                    this.U0.setLayerType(2, null);
                    animationNotificationsLocker.lock();
                    this.C3 = 0.0f;
                    aw0Var.invalidate();
                    animatorSet2.start();
                } else {
                    this.C3 = 1.0f;
                    if (this.d5 == null) {
                        setTranslationY(-(this.D3 - i11));
                        this.U0.setTranslationY(-(this.D3 - i11));
                    }
                    AnimatedArrowDrawable animatedArrowDrawable = this.F3;
                    if (animatedArrowDrawable != null) {
                        animatedArrowDrawable.setAnimationProgress(1.0f);
                    }
                }
                ph.f fVar = this.d5;
                if (fVar != null) {
                    ((ph.i) fVar).g(this.D3);
                }
            } else {
                if (z13) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 1);
                }
                if (z11) {
                    this.A3 = true;
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.d5 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.F3, "animationProgress", 0.0f));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, d1Var, 0), ObjectAnimator.ofInt(this.U0, d1Var, 0), ObjectAnimator.ofFloat(this.F3, "animationProgress", 0.0f));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(rr.f);
                    if (this.d5 == null) {
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.zd
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
                                        int i15 = ChatActivityEnterView.n5;
                                        chatActivityEnterView.C3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i14)));
                                        chatActivityEnterView.m1.invalidate();
                                        break;
                                    default:
                                        int i16 = ChatActivityEnterView.n5;
                                        chatActivityEnterView.C3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i14));
                                        chatActivityEnterView.m1.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet3.addListener(new ig(this, i11, i10));
                    this.C3 = 1.0f;
                    aw0Var.invalidate();
                    this.B3 = animatorSet3;
                    this.U0.setLayerType(2, null);
                    animationNotificationsLocker.lock();
                    animatorSet3.start();
                } else {
                    this.C3 = 0.0f;
                    if (this.d5 == null) {
                        setTranslationY(0.0f);
                        this.U0.setTranslationY(0.0f);
                        this.U0.getLayoutParams().height = i11;
                    }
                    aw0Var.requestLayout();
                    aw0Var.setForeground(null);
                    aw0Var.setWillNotDraw(false);
                    AnimatedArrowDrawable animatedArrowDrawable2 = this.F3;
                    if (animatedArrowDrawable2 != null) {
                        animatedArrowDrawable2.setAnimationProgress(0.0f);
                    }
                }
                ph.f fVar2 = this.d5;
                if (fVar2 != null) {
                    ((ph.i) fVar2).g(i11);
                }
            }
            cf cfVar = this.S0;
            if (cfVar != null) {
                if (this.z3) {
                    cfVar.setContentDescription(LocaleController.getString("AccDescrCollapsePanel", R.string.AccDescrCollapsePanel));
                } else {
                    cfVar.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
                }
            }
        }
    }

    public final void o(TLRPC.Document document) {
        U();
        eg egVar = this.U0;
        int i10 = egVar.c1;
        MediaDataController.getInstance(i10).addRecentSticker(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = egVar.j1.isEmpty();
        egVar.j1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        cz czVar = egVar.y0;
        if (czVar != null) {
            czVar.l();
        }
        if (isEmpty) {
            egVar.X(false);
        }
    }

    public final void o0(boolean z10) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.u2;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.c3 = null;
            this.b3 = null;
            this.d3 = null;
            this.e3 = null;
            i81 i81Var = this.f1;
            int i10 = 1;
            if (i81Var != null) {
                i81Var.a(true);
            }
            we weVar = this.b1;
            if (weVar != null) {
                weVar.setVisibility(0);
            }
            ke keVar = this.d4;
            ke keVar2 = this.Z3;
            ke keVar3 = this.b4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            oe oeVar = this.Q0;
            Property property3 = View.ALPHA;
            hg.l lVar = this.r1;
            if (z10) {
                if (lVar != null) {
                    this.v1 = 0.0f;
                    lVar.setAlpha(0.0f);
                    lVar.setScaleX(0.0f);
                    lVar.setScaleY(0.0f);
                }
                this.n = 0.0f;
                this.h = 0.0f;
                F1();
                this.u2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(oeVar, keVar3, this.A0 ? 0.5f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(oeVar, keVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.g1, (Property<lj0, Float>) property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.g1, (Property<lj0, Float>) property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.g1, (Property<lj0, Float>) property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.e1, (Property<le, Float>) property3, 0.0f));
                if (lVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.q1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.q1 = null;
                    }
                    this.v1 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.E0, (Property<qf, Float>) property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.E0, keVar, 0.0f));
                sg sgVar = this.O1;
                if (sgVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(sgVar, (Property<sg, Float>) property3, 0.0f));
                    this.O1.a();
                }
                this.u2.playTogether(arrayList);
                ei.c0 c0Var = this.l0;
                if (c0Var != null) {
                    c0Var.setAlpha(0.0f);
                    this.l0.setScaleY(0.0f);
                    this.l0.setScaleX(0.0f);
                    this.u2.playTogether(ObjectAnimator.ofFloat(this.l0, (Property<ei.c0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<ei.c0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<ei.c0, Float>) property, 1.0f));
                }
                this.u2.setDuration(150L);
                this.u2.addListener(new ze(this, i10));
            } else {
                lj0 lj0Var = this.g1;
                if (lj0Var != null) {
                    lj0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = this.c1;
                Property property4 = View.TRANSLATION_X;
                if (z11) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.f1, (Property<i81, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f1, (Property<i81, Float>) property4, -AndroidUtilities.dp(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.E0, keVar, 0.0f));
                    sg sgVar2 = this.O1;
                    if (sgVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(sgVar2, (Property<sg, Float>) property3, 0.0f));
                        this.O1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.E0, (Property<qf, Float>) property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.E0, (Property<qf, Float>) property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    qf qfVar = this.E0;
                    if (qfVar == null || this.s != 1.0f) {
                        this.G = 0.0f;
                        J1();
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.E0, (Property<qf, Float>) property3, 1.0f);
                        ofFloat2.setStartDelay(750L);
                        ofFloat2.setDuration(200L);
                        animatorSet3.playTogether(ofFloat2);
                    } else {
                        qfVar.setAlpha(1.0f);
                        this.G = 0.0f;
                        J1();
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(this.h1, (Property<rk0, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.h1, (Property<rk0, Float>) property4, -AndroidUtilities.dp(20.0f)));
                    sg sgVar3 = this.O1;
                    if (sgVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(sgVar3, (Property<sg, Float>) property3, 0.0f));
                        this.O1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (lVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.q1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.q1 = null;
                    }
                    this.v1 = 0.0f;
                    lVar.setAlpha(0.0f);
                    lVar.setScaleX(0.0f);
                    lVar.setScaleY(0.0f);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.v1 = 1.0f;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property3, 1.0f), ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property2, 1.0f), ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property, 1.0f));
                    animatorSet4.setDuration(150L);
                    animatorSet = animatorSet4;
                } else {
                    animatorSet = null;
                }
                this.h = 0.0f;
                this.n = 0.0f;
                F1();
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<lj0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<lj0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<lj0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<lj0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(oeVar, keVar3, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(oeVar, keVar2, 1.0f));
                ei.c0 c0Var2 = this.l0;
                if (c0Var2 != null) {
                    c0Var2.setAlpha(0.0f);
                    this.l0.setScaleY(0.0f);
                    this.l0.setScaleX(0.0f);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.l0, (Property<ei.c0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<ei.c0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<ei.c0, Float>) property, 1.0f));
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
                this.u2.addListener(new tf(this));
            }
            AnimatorSet animatorSet7 = this.u2;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            sg sgVar4 = this.O1;
            if (sgVar4 != null) {
                sgVar4.invalidate();
            }
        }
    }

    public final void o1(boolean z10, boolean z11) {
        if (this.v4 == z10 && z11) {
            return;
        }
        ImageView imageView = this.w1;
        if (imageView == null) {
            if (!z10 && !this.l5) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = new ImageView(getContext());
                this.w1 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                this.w1.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.h6.Wk), PorterDuff.Mode.MULTIPLY));
                this.w1.setImageResource(R.drawable.input_suggest_paid_24);
                this.w1.setBackground(org.telegram.ui.ActionBar.h6.f0(i0(org.telegram.ui.ActionBar.h6.i6), 1, -1));
                if (this.l5) {
                    this.w1.setTranslationX(AndroidUtilities.dp(42.0f));
                    this.z1.addView(this.w1, w7.y5.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                } else {
                    this.p1.addView(this.w1, 0, w7.y5.n(44, 44));
                }
                this.w1.setOnClickListener(new vd(this, 19));
                this.w1.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
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
            if (this.l5) {
                this.w1.setVisibility(0);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w1.getAlpha(), f10);
            this.w4 = ofFloat;
            ofFloat.addUpdateListener(new rd(this, 7));
            this.w4.addListener(new df(this, z10, r2));
            this.w4.setDuration(220L);
            this.w4.setInterpolator(rr.h);
            this.w4.start();
        } else {
            this.w1.setScaleX(f7);
            this.w1.setScaleY(f7);
            this.w1.setAlpha(f10);
            if (this.l5) {
                this.w1.setVisibility(z10 ? 0 : 8);
            }
        }
        H1(this.P4);
        if (z12) {
            K(true);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ff ffVar = this.q0;
        if (ffVar != null) {
            ffVar.e = false;
            ffVar.dismiss();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        e0(canvas, true);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View findChildViewUnder;
        if (this.F2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (findChildViewUnder = AndroidUtilities.findChildViewUnder(this, motionEvent.getX(), motionEvent.getY())) != this.L && findChildViewUnder != this.M) {
            l0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        of ofVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.V4 == -1 || (ofVar = this.m0) == null) {
            return;
        }
        s4.c0 c0Var = (s4.c0) ofVar.c.getLayoutManager();
        if (c0Var != null) {
            c0Var.h1(this.V4, this.W4);
        }
        this.V4 = -1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        le leVar = this.z1;
        int measuredHeight = leVar.getMeasuredHeight();
        ei.c0 c0Var = this.l0;
        ImageView imageView = this.R0;
        oe oeVar = this.Q0;
        int i12 = 0;
        if (c0Var == null || c0Var.getTag() == null) {
            jp0 jp0Var = this.p0;
            if (jp0Var == null || jp0Var.getVisibility() != 0) {
                ((ViewGroup.MarginLayoutParams) oeVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                }
                qf qfVar = this.E0;
                if (qfVar != null) {
                    ((ViewGroup.MarginLayoutParams) qfVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
                RichMessageLayout.PreviewView previewView = this.C1;
                if (previewView != null) {
                    ((ViewGroup.MarginLayoutParams) previewView.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
            } else {
                int i13 = this.p0.getLayoutParams().width;
                this.p0.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.p0.getLayoutParams().height, TLObject.FLAG_30));
                ((ViewGroup.MarginLayoutParams) oeVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i13;
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i13;
                }
                qf qfVar2 = this.E0;
                if (qfVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) qfVar2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i13;
                }
                RichMessageLayout.PreviewView previewView2 = this.C1;
                if (previewView2 != null) {
                    ((ViewGroup.MarginLayoutParams) previewView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i13;
                }
            }
        } else {
            this.l0.measure(i10, i11);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) oeVar.getLayoutParams();
            int dp = AndroidUtilities.dp(10.0f);
            ei.c0 c0Var2 = this.l0;
            marginLayoutParams.leftMargin = dp + (c0Var2 == null ? 0 : c0Var2.getMeasuredWidth());
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int dp2 = AndroidUtilities.dp(10.0f);
                ei.c0 c0Var3 = this.l0;
                marginLayoutParams2.leftMargin = dp2 + (c0Var3 == null ? 0 : c0Var3.getMeasuredWidth());
            }
            qf qfVar3 = this.E0;
            if (qfVar3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) qfVar3.getLayoutParams();
                int dp3 = AndroidUtilities.dp(57.0f);
                ei.c0 c0Var4 = this.l0;
                marginLayoutParams3.leftMargin = dp3 + (c0Var4 == null ? 0 : c0Var4.getMeasuredWidth());
            }
            RichMessageLayout.PreviewView previewView3 = this.C1;
            if (previewView3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) previewView3.getLayoutParams();
                int dp4 = AndroidUtilities.dp(57.0f);
                ei.c0 c0Var5 = this.l0;
                marginLayoutParams4.leftMargin = dp4 + (c0Var5 == null ? 0 : c0Var5.getMeasuredWidth());
            }
        }
        C1();
        super.onMeasure(i10, i11);
        ei.f4 f4Var = this.k0;
        if (f4Var != null) {
            ei.c0 c0Var6 = this.l0;
            if (c0Var6 != null) {
                f4Var.setMeasuredButtonWidth(c0Var6.getMeasuredWidth());
            }
            this.k0.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(2.0f);
            measureChild(this.k0, i10, i11);
        }
        M();
        N();
        if (measuredHeight <= 0 || leVar.getMeasuredHeight() == measuredHeight) {
            return;
        }
        while (i12 < 2) {
            ImageView imageView2 = i12 == 0 ? this.t1 : this.u1;
            imageView2.setTranslationY((imageView2.getTranslationY() + leVar.getMeasuredHeight()) - measuredHeight);
            imageView2.animate().translationY(0.0f).setInterpolator(rr.h).setDuration(420L).start();
            i12++;
        }
        ci.e4 e4Var = this.M;
        if (e4Var != null) {
            e4Var.setTranslationY((e4Var.getTranslationY() + leVar.getMeasuredHeight()) - measuredHeight);
            org.telegram.messenger.ok.s(this.M.animate().translationY(0.0f), rr.h, 420L);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 && this.z3) {
            m1(0, false);
            this.U0.t(false);
            n1(false, false, false, true);
        }
        i81 i81Var = this.f1;
        if (i81Var != null) {
            ArrayList arrayList = i81Var.v;
            if (i81Var.N.isEmpty()) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i14);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            f81 f81Var = i81Var.w;
            if (f81Var != null) {
                f81Var.cancel(true);
                i81Var.w = null;
            }
            i81Var.invalidate();
        }
    }

    public final ValueAnimator p(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J1.a, f7);
        ofFloat.addUpdateListener(new rd(this, 5));
        return ofFloat;
    }

    public final void p0() {
        this.c3 = null;
        this.b3 = null;
        this.d3 = null;
        this.e3 = null;
        i81 i81Var = this.f1;
        if (i81Var != null) {
            i81Var.a(true);
        }
        rk0 rk0Var = this.h1;
        if (rk0Var != null) {
            rk0Var.setAlpha(1.0f);
            this.h1.setTranslationX(0.0f);
        }
        i81 i81Var2 = this.f1;
        if (i81Var2 != null) {
            i81Var2.setAlpha(1.0f);
            this.f1.setTranslationX(0.0f);
        }
        qf qfVar = this.E0;
        if (qfVar != null) {
            qfVar.setAlpha(1.0f);
            this.G = 0.0f;
            J1();
            this.E0.requestFocus();
        }
        le leVar = this.e1;
        if (leVar != null) {
            leVar.setVisibility(8);
        }
        x0();
    }

    public final void p1(boolean z10) {
        org.telegram.ui.wn wnVar;
        boolean z11 = ((!z10 && !this.D1) || (wnVar = this.P2) == null || wnVar.v()) ? false : true;
        if (this.K4 == z11) {
            return;
        }
        if (z11) {
            MessagesController.getInstance(this.Q).getTonesController().load();
        }
        this.K4 = z11;
        ImageView imageView = this.t1;
        imageView.setVisibility(0);
        imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(rr.h).setDuration(420L).withEndAction(new ae(this, z11, 0)).start();
        if (!z11) {
            ci.e4 e4Var = this.M;
            if (e4Var != null) {
                e4Var.e(true);
                this.M = null;
                return;
            }
            return;
        }
        i0 i0Var = this.s1;
        Objects.requireNonNull(i0Var);
        imageView.postDelayed(new h0(i0Var, 1), 220L);
        ci.e4 e4Var2 = this.M;
        if (e4Var2 != null) {
            e4Var2.e(true);
            this.M = null;
        }
        if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
            ci.e4 e4Var3 = new ci.e4(getContext(), 3);
            this.M = e4Var3;
            e4Var3.p(true);
            this.M.s(LocaleController.getString(R.string.AIEditorHint));
            this.M.m(0.0f, (imageView.getWidth() / 2.0f) + AndroidUtilities.dp(4.0f));
            addView(this.M, w7.y5.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
            ci.e4 e4Var4 = this.M;
            e4Var4.l0 = new kd(1, this, e4Var3);
            e4Var4.d = 4000L;
            e4Var4.u();
            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
        }
    }

    public final ValueAnimator q(boolean z10) {
        final float alpha = getSendButtonInternal().getAlpha();
        final float f7 = z10 ? 1.0f : 0.0f;
        final float scaleX = getSendButtonInternal().getScaleX();
        final float f10 = z10 ? 1.0f : 0.1f;
        final float scaleY = getSendButtonInternal().getScaleY();
        final float f11 = z10 ? 1.0f : 0.1f;
        if (z10 && alpha < 0.25f && (getSendButtonInternal() instanceof vg)) {
            vg vgVar = (vg) getSendButtonInternal();
            vgVar.e0.d(0.0f, true);
            vgVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ce
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i10 = ChatActivityEnterView.n5;
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.getSendButtonInternal().setAlpha(AndroidUtilities.lerp(alpha, f7, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleX(AndroidUtilities.lerp(scaleX, f10, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleY(AndroidUtilities.lerp(scaleY, f11, floatValue));
            }
        });
        return ofFloat;
    }

    public void q0(boolean z10) {
        if (this.G1 == null || !this.f3) {
            return;
        }
        td tdVar = this.V;
        if (tdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(tdVar);
        }
        this.f3 = false;
        this.g3 = false;
        if (this.h3) {
            this.g5.a(false, z10);
        }
    }

    public final void q1() {
        org.telegram.ui.wn wnVar = this.P2;
        if (wnVar == null || !ChatObject.isChannelAndNotMegaGroup(wnVar.e)) {
            return;
        }
        xc.a0(wnVar).f(MessagesController.getInstance(this.Q).captionLengthLimitPremium, new td(this, 0)).j();
    }

    public final boolean r0() {
        return this.Z1 != null;
    }

    public boolean r1(Runnable runnable) {
        return false;
    }

    public final void s(SendMessagesHelper.SendMessageParams sendMessageParams) {
        og ogVar = this.Z2;
        if (ogVar != null) {
            sendMessageParams.replyToStoryItem = ogVar.d1();
            sendMessageParams.replyQuote = this.Z2.p0();
        }
    }

    public final boolean s0() {
        return this.c1;
    }

    public final void s1() {
        t1(1, 0, true, true);
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.o1 o1Var) {
        this.U = o1Var;
    }

    public void setAnimatedTop(int i10) {
        this.T1 = i10;
    }

    public void setBotInfo(a0.i iVar) {
        X0(iVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f7) {
        this.Q0.setTranslationX(f7);
        if (this.E0 != null) {
            this.G = f7;
            J1();
        }
        this.r1.setTranslationX(this.y + this.x + f7);
        this.b1.setTranslationX(f7);
        cf cfVar = this.x1;
        if (cfVar != null) {
            cfVar.setTranslationX(f7);
        }
    }

    public void setButtons(MessageObject messageObject) {
        Z0(messageObject, true, true);
    }

    public void setCaption(String str) {
        qf qfVar = this.E0;
        if (qfVar != null) {
            qfVar.setCaption(str);
            K(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.d2 = chatFull;
        eg egVar = this.U0;
        if (egVar != null) {
            egVar.setChatInfo(chatFull);
        }
        wg wgVar = this.F0;
        if (wgVar != null) {
            wgVar.e = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chatFull);
            wgVar.invalidate();
        }
        if (ChatObject.isIgnoredChatRestrictionsForBoosters(chatFull)) {
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

    public void setDelegate(og ogVar) {
        this.Z2 = ogVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.b2 = tL_businessChatLink;
        G1(false);
        if (this.b2 != null) {
            T(true);
            this.F1.setOnClickListener(new vd(this, 3));
            this.F1.setContentDescription(LocaleController.getString(R.string.Done));
            this.F1.setVisibility(0);
            this.F1.setScaleX(0.1f);
            this.F1.setScaleY(0.1f);
            this.F1.setAlpha(0.0f);
            this.F1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(rr.f).start();
            this.c0 = this.R.getMessagesController().getMaxMessageLength();
            qf qfVar = this.E0;
            TextPaint paint = qfVar != null ? qfVar.getPaint() : null;
            if (paint == null) {
                paint = new TextPaint();
                paint.setTextSize(AndroidUtilities.dp(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.b2.entities;
            if (arrayList == null || (str = tL_businessChatLink.message) == null) {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            } else {
                setFieldText(r(arrayList, str, fontMetricsInt));
            }
            this.c2 = x();
            V0(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.P0.setVisibility(8);
            this.Z0.setVisibility(8);
            org.telegram.ui.xd xdVar = this.p1;
            if (xdVar != null) {
                xdVar.setVisibility(8);
            }
            hg.l lVar = this.r1;
            if (lVar != null) {
                this.v1 = 0.0f;
                lVar.setAlpha(0.0f);
                lVar.setScaleX(0.5f);
                lVar.setScaleY(0.5f);
            }
            this.A1.setVisibility(8);
            af afVar = this.J1;
            if (afVar != null) {
                afVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j3) {
        this.S4 = j3;
        ye yeVar = this.J0;
        if (yeVar != null) {
            yeVar.setEffect(j3);
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
        if (z10 && org.telegram.ui.ActionBar.m2.hasSheets(this.P2)) {
            z10 = false;
        }
        if (z10) {
            if (this.R1 != 0 || this.E0.isFocused()) {
                return;
            }
            td tdVar = new td(this, 5);
            this.S1 = tdVar;
            AndroidUtilities.runOnUIThread(tdVar, 600L);
            return;
        }
        qf qfVar = this.E0;
        if (qfVar == null || !qfVar.isFocused()) {
            return;
        }
        if (!this.z2 || this.j2) {
            this.E0.clearFocus();
        }
    }

    @Override // org.telegram.ui.Components.vy0
    public void setFieldText(CharSequence charSequence) {
        f1(charSequence, false);
    }

    public void setInAppInsetsController(ph.f fVar) {
        this.d5 = fVar;
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
            onLongClickListener = new yd(this, 0);
        }
        this.J0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        j1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z10) {
        this.v = z10;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.C1 == null) {
            return;
        }
        if (!MessagesController.getInstance(this.Q).richEditorAvailable()) {
            richMessage = null;
        }
        this.E1 = richMessage;
        N1();
    }

    public void setRoundVideoUiFrameClockActive(boolean z10) {
        if (this.j1 == z10) {
            return;
        }
        this.j1 = z10;
        xg xgVar = this.Y0;
        if (xgVar != null) {
            xgVar.setExternalFrameClock(z10);
        }
        ug ugVar = this.l1;
        if (ugVar != null) {
            ugVar.n = z10;
            ugVar.b = System.currentTimeMillis();
            ugVar.r = -1L;
            ugVar.invalidate();
        }
        SlideTextView slideTextView = this.k1;
        if (slideTextView != null) {
            slideTextView.J = z10;
            slideTextView.y = System.currentTimeMillis();
            slideTextView.invalidate();
        }
    }

    public void setSelection(int i10) {
        qf qfVar = this.E0;
        if (qfVar == null) {
            return;
        }
        qfVar.setSelection(i10, qfVar.length());
    }

    public void setSideButtonsForAttach(jh.h hVar) {
        this.e5 = hVar;
    }

    public void setSlideToCancelProgress(float f7) {
        this.j4 = f7;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > AndroidUtilities.dp(140.0f)) {
            measuredWidth = AndroidUtilities.dp(140.0f);
        }
        this.t4 = (int) ((1.0f - this.j4) * (-measuredWidth));
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i10) {
        this.G0 = i10;
        S1();
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
        qf qfVar = this.E0;
        if (qfVar != null) {
            qfVar.setEnabled(z10);
        }
    }

    public void setVoiceDraft(MediaDataController.DraftVoice draftVoice) {
        if (draftVoice == null) {
            return;
        }
        boolean z10 = draftVoice.once;
        this.O = z10;
        sg sgVar = this.O1;
        if (sgVar != null) {
            sgVar.y.d(1, z10, true);
        }
        og ogVar = this.Z2;
        TL_stories.StoryItem d12 = ogVar != null ? ogVar.d1() : null;
        MediaController mediaController = MediaController.getInstance();
        int i10 = this.Q;
        long j3 = this.Q2;
        MessageObject messageObject = this.T2;
        MessageObject threadMessage = getThreadMessage();
        SendMessageChatArguments sendMessageChatArguments = null;
        int i11 = this.G2;
        org.telegram.ui.wn wnVar = this.P2;
        if (wnVar != null) {
            sendMessageChatArguments = wnVar.C8();
        }
        mediaController.prepareResumedRecording(i10, draftVoice, j3, messageObject, threadMessage, d12, i11, sendMessageChatArguments, getSendMonoForumPeerId(), getSendMessageSuggestionParams());
    }

    public boolean t() {
        return false;
    }

    public final boolean t0() {
        return this.W0 || this.X0;
    }

    public final void t1(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        boolean z12;
        int i13;
        ViewGroup viewGroup;
        int i14;
        float f7;
        if (i10 == 2) {
            return;
        }
        AnimationNotificationsLocker animationNotificationsLocker = this.L3;
        bf bfVar = this.Y3;
        Property property = View.TRANSLATION_Y;
        int i15 = 1;
        boolean z13 = false;
        if (i10 == 1) {
            if (i11 == 0) {
                if (this.O2 == null && this.U0 == null) {
                    return;
                } else {
                    U();
                }
            }
            if (i11 == 0) {
                u();
                if (this.W0) {
                    this.U0.getVisibility();
                }
                this.U0.setVisibility(0);
                this.W0 = true;
                bg bgVar = this.H1;
                if (bgVar == null || bgVar.getVisibility() == 8) {
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
                eg egVar = this.U0;
                if (egVar == null || egVar.getVisibility() == 8) {
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
                MessagesController.getMainSettings(this.Q).edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                i13 = i14;
                viewGroup = viewGroup2;
            } else {
                i13 = 0;
                viewGroup = null;
            }
            this.f2 = i11;
            if (this.x2 <= 0) {
                f7 = 200.0f;
                this.x2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            } else {
                f7 = 200.0f;
            }
            if (this.y2 <= 0) {
                this.y2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(f7));
            }
            Point point = AndroidUtilities.displaySize;
            int i16 = point.x > point.y ? this.y2 : this.x2;
            org.telegram.ui.wn wnVar = this.P2;
            if (wnVar != null && wnVar.getParentLayout() != null) {
                i16 -= ((ActionBarLayout) wnVar.getParentLayout()).v(false);
            }
            if (i11 == 1) {
                i16 = Math.min(this.H1.getKeyboardHeight(), i16);
            }
            bg bgVar2 = this.H1;
            if (bgVar2 != null) {
                bgVar2.setPanelHeight(i16);
            }
            if (viewGroup != null && this.d5 == null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                layoutParams.height = i16;
                viewGroup.setLayoutParams(layoutParams);
            }
            if (!AndroidUtilities.isInMultiwindow) {
                AndroidUtilities.hideKeyboard(this.E0);
            }
            aw0 aw0Var = this.m1;
            if (aw0Var != null) {
                this.A2 = i16;
                aw0Var.requestLayout();
                d1(true, true);
                B1(true);
                G0();
                if (this.i2 && !this.z2 && i16 != i13 && z10) {
                    td tdVar = new td(this, 10);
                    if (this.v) {
                        this.w = tdVar;
                    } else {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.V0 = animatorSet;
                        if (this.d5 != null) {
                            animatorSet.playTogether(ValueAnimator.ofFloat(i16 - i13, 0.0f));
                        } else {
                            float f10 = i16 - i13;
                            viewGroup.setTranslationY(f10);
                            this.V0.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) property, f10, 0.0f));
                        }
                        this.V0.setInterpolator(org.telegram.ui.ActionBar.o1.w);
                        this.V0.setDuration(250L);
                        this.V0.addListener(new ai.z(19, this, tdVar));
                        AndroidUtilities.runOnUIThread(bfVar, 50L);
                        animationNotificationsLocker.lock();
                    }
                    requestLayout();
                }
            }
            ph.f fVar = this.d5;
            if (fVar != null) {
                ((ph.i) fVar).g(i16);
            }
        } else {
            if (this.Q0 != null) {
                d1(false, true);
            }
            this.f2 = -1;
            eg egVar2 = this.U0;
            if (egVar2 != null) {
                if (i10 == 2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    this.G3 = false;
                    og ogVar = this.Z2;
                    if (ogVar != null) {
                        ogVar.y(0.0f);
                    }
                    this.n1.removeView(this.U0);
                    this.U0 = null;
                } else if (!this.i2 || this.z2 || this.z3) {
                    og ogVar2 = this.Z2;
                    if (ogVar2 != null) {
                        ogVar2.y(0.0f);
                    }
                    z13 = false;
                    this.A2 = 0;
                    this.n1.removeView(this.U0);
                    this.U0.setVisibility(8);
                    this.U0.setShowing(false);
                } else {
                    this.W0 = true;
                    this.o3 = 0;
                    egVar2.setShowing(false);
                    ld ldVar = new ld(this, i10, i15);
                    if (this.v) {
                        this.w = ldVar;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.V0 = animatorSet2;
                        if (this.d5 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofFloat(this.U0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.U0, (Property<eg, Float>) property, r5.getMeasuredHeight()));
                        }
                        this.V0.setInterpolator(org.telegram.ui.ActionBar.o1.w);
                        this.V0.setDuration(250L);
                        animationNotificationsLocker.lock();
                        this.V0.addListener(new ai.z(20, this, ldVar));
                    }
                    AndroidUtilities.runOnUIThread(bfVar, 50L);
                    requestLayout();
                    z13 = false;
                }
                this.W0 = z13;
            }
            bg bgVar3 = this.H1;
            if (bgVar3 != null && bgVar3.getVisibility() == 0) {
                if (i10 != 2 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    if (this.i2 && !this.z2) {
                        if (this.X0) {
                            this.o3 = 1;
                        }
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        this.V0 = animatorSet3;
                        if (this.d5 != null) {
                            i12 = 0;
                            animatorSet3.playTogether(ValueAnimator.ofFloat(this.H1.getMeasuredHeight()));
                        } else {
                            i12 = 0;
                            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.H1, (Property<bg, Float>) property, r5.getMeasuredHeight()));
                        }
                        this.V0.setInterpolator(org.telegram.ui.ActionBar.o1.w);
                        this.V0.setDuration(250L);
                        this.V0.addListener(new ig(this, i10, i12));
                        animationNotificationsLocker.lock();
                        AndroidUtilities.runOnUIThread(bfVar, 50L);
                        requestLayout();
                    } else if (!this.k3) {
                        this.H1.setVisibility(8);
                    }
                }
                this.X0 = false;
            }
            if (i11 == 1 && this.m2 != null) {
                MessagesController.getMainSettings(this.Q).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.m2.getId()).apply();
            }
            B1(true);
            ph.f fVar2 = this.d5;
            if (fVar2 != null) {
                ((ph.i) fVar2).h(z11);
            }
        }
        if (this.x3 || this.y3) {
            K(true);
        }
        if (!this.z3 || i10 == 1) {
            z12 = false;
        } else {
            z12 = false;
            n1(false, false, false, true);
        }
        G1(z12);
        E();
    }

    public final void u() {
        if (this.U0.getParent() == null) {
            if (this.d5 == null) {
                this.n1.addView(this.U0);
            } else {
                this.n1.addView(this.U0, w7.y5.c(-1.0f, -1));
            }
        }
    }

    public final boolean u0(View view) {
        return view == this.H1 || view == this.U0;
    }

    public final void u1() {
        og ogVar = this.Z2;
        if ((ogVar == null || !ogVar.m()) && DialogObject.isChatDialog(this.Q2)) {
            xc.a0(this.P2).G(R.raw.passcode_lock_close, 3, LocaleController.formatString("SendPlainTextRestrictionHint", R.string.SendPlainTextRestrictionHint, ChatObject.getAllowedSendString(this.R.getMessagesController().getChat(Long.valueOf(-this.Q2))))).j();
        }
    }

    public final boolean v() {
        ei.c0 c0Var = this.l0;
        return c0Var != null && c0Var.v;
    }

    public final boolean v0() {
        return this.F2 && ChatActivityEnterView.this.s4;
    }

    public final void v1(boolean z10) {
        org.telegram.ui.wn wnVar;
        boolean z11 = (this.D1 || z10) && (wnVar = this.P2) != null && !wnVar.v() && this.Z1 == null && MessagesController.getInstance(this.Q).richEditorAvailable();
        if (this.L4 == z11) {
            return;
        }
        this.L4 = z11;
        ImageView imageView = this.u1;
        imageView.setVisibility(0);
        imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(rr.h).setDuration(420L).withEndAction(new ae(this, z11, 1)).start();
    }

    public final boolean w() {
        kg x10 = x();
        return (TextUtils.equals(x10.a, this.c2.a) && MediaDataController.entitiesEqual((ArrayList<TLRPC.MessageEntity>) this.c2.b, (ArrayList<TLRPC.MessageEntity>) x10.b)) ? false : true;
    }

    public final boolean w0() {
        if (this.F2) {
            return true;
        }
        AnimatorSet animatorSet = this.t2;
        return (animatorSet == null || !animatorSet.isRunning() || this.k2) ? false : true;
    }

    public final void w1() {
        x1(true, false);
    }

    public final kg x() {
        qf qfVar = this.E0;
        CharSequence[] charSequenceArr = {AndroidUtilities.getTrimmedString(qfVar == null ? "" : qfVar.getTextToUse())};
        ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.Q).getEntities(charSequenceArr, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = entities.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.MessageEntity messageEntity = entities.get(i10);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        kg kgVar = new kg();
        kgVar.a = charSequence.toString();
        kgVar.b = entities;
        return kgVar;
    }

    public final void x1(boolean z10, boolean z11) {
        if (this.G1 == null || this.f3 || getVisibility() != 0) {
            le leVar = this.e1;
            if ((leVar == null || leVar.getVisibility() != 0) && !this.H2 && this.V2 == null && this.T2 == null) {
                H0();
                return;
            }
            return;
        }
        le leVar2 = this.e1;
        boolean z12 = (leVar2 == null || leVar2.getVisibility() != 0) && !this.H2 && this.V2 == null && (this.n2 == null || this.Z1 != null);
        if (!z11 && z10 && z12 && !this.z2 && !t0()) {
            H0();
            td tdVar = this.V;
            if (tdVar != null) {
                AndroidUtilities.cancelRunOnUIThread(tdVar);
            }
            td tdVar2 = new td(this, 23);
            this.V = tdVar2;
            AndroidUtilities.runOnUIThread(tdVar2, 200L);
            return;
        }
        this.g3 = true;
        this.f3 = true;
        if (this.h3) {
            this.g5.a(true, z10);
            if (z12) {
                qf qfVar = this.E0;
                if (qfVar != null) {
                    qfVar.requestFocus();
                }
                H0();
            }
        }
    }

    public final float y(boolean z10) {
        le.f fVar = this.f5;
        float f7 = z10 ? fVar.g ? fVar.f : fVar.e : fVar.e;
        le.c cVar = this.g5;
        return ((this.G1 != null ? r1.getMeasuredHeight() : 0) * (z10 ? cVar.f ? 1.0f : 0.0f : cVar.e)) + f7;
    }

    public final boolean y0() {
        return this.z3;
    }

    public final boolean y1() {
        org.telegram.ui.wn wnVar = this.P2;
        TLRPC.EncryptedChat encryptedChat = wnVar != null ? wnVar.h : null;
        return encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101;
    }

    public final void z() {
        ai.w5 w5Var = this.d1;
        if (w5Var != null) {
            w5Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.t2 = null;
        x0();
        if (this.p1 != null) {
            this.x = 0.0f;
            A1();
        }
        SlideTextView slideTextView = this.k1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.Z2.g();
        P1(true);
    }

    public final boolean z0() {
        View view = this.G1;
        return view != null && view.getVisibility() == 0;
    }

    public final void z1() {
        float f7;
        hg.l lVar = this.r1;
        if (lVar == null) {
            return;
        }
        float f10 = this.y + this.x;
        ye yeVar = this.J0;
        if (yeVar != null) {
            f7 = yeVar.getAlpha() * (-org.telegram.messenger.f0.b(56.0f, yeVar.l(), 0));
        } else {
            f7 = 0.0f;
        }
        lVar.setTranslationX(f10 + f7);
    }

    @Override // org.telegram.ui.Components.vy0
    public cu getEditField() {
        return this.E0;
    }

    @Override // org.telegram.ui.Components.vy0
    public org.telegram.ui.wn getParentFragment() {
        return this.P2;
    }

    public void A0(float f7) {
    }

    public void h0(Menu menu) {
    }

    public void x0() {
    }

    @Override // le.e
    public final /* synthetic */ void C(float f7, int i10) {
    }

    public void C0(int i10, int i11) {
    }
}
