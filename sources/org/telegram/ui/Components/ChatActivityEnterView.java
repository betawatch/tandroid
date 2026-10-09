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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class ChatActivityEnterView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, rw0, uy0, mz0, me.d, org.telegram.ui.ActionBar.z5 {
    public static final /* synthetic */ int n5 = 0;
    public boolean A0;
    public final ne A1;
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
    public sf E0;
    public TL_iv.RichMessage E1;
    public float E2;
    public boolean E3;
    public boolean E4;
    public float F;
    public final yg F0;
    public af F1;
    public boolean F2;
    public AnimatedArrowDrawable F3;
    public final vd F4;
    public float G;
    public int G0;
    public View G1;
    public int G2;
    public boolean G3;
    public org.telegram.ui.ActionBar.f1 G4;
    public float H;
    public vd H0;
    public dg H1;
    public boolean H2;
    public final df H3;
    public ArrayList H4;
    public float I;
    public final gi.a I0;
    public final ImageView I1;
    public boolean I2;
    public boolean I3;
    public boolean I4;
    public boolean J;
    public final af J0;
    public cf J1;
    public boolean J2;
    public boolean J3;
    public View J4;
    public TLRPC.UserFull K;
    public int K0;
    public ef K1;
    public boolean K2;
    public final lg K3;
    public boolean K4;
    public ci.d4 L;
    public pf L0;
    public boolean L1;
    public int L2;
    public final AnimationNotificationsLocker L3;
    public boolean L4;
    public ci.d4 M;
    public long M0;
    public AnimatorSet M1;
    public boolean M2;
    public final Paint M3;
    public boolean M4;
    public ci.d4 N;
    public of N0;
    public RecordCircle N1;
    public final int[] N2;
    public Drawable N3;
    public vd N4;
    public boolean O;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout O0;
    public ug O1;
    public final Activity O2;
    public Drawable O3;
    public final er[] O4;
    public boolean P;
    public final ImageView P0;
    public final ze P1;
    public final org.telegram.ui.zn P2;
    public Drawable P3;
    public int P4;
    public int Q;
    public final qe Q0;
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
    public ef S0;
    public vd S1;
    public int S2;
    public final RectF S3;
    public long S4;
    public int T;
    public boolean T0;
    public int T1;
    public MessageObject T2;
    public final Rect T3;
    public BotForumHelper.SteamingSendButtonState T4;
    public org.telegram.ui.ActionBar.p1 U;
    public gg U0;
    public vm0 U1;
    public MessageObject U2;
    public final Rect U3;
    public org.telegram.ui.Cells.c6 U4;
    public vd V;
    public AnimatorSet V0;
    public Editable V1;
    public org.telegram.ui.pn V2;
    public Drawable V3;
    public int V4;
    public ea W;
    public boolean W0;
    public boolean W1;
    public MessageObject W2;
    public final org.telegram.ui.ActionBar.e6 W3;
    public int W4;
    public boolean X0;
    public boolean X1;
    public TLRPC.WebPage X2;
    public final boolean X3;
    public a0.i X4;
    public zg Y0;
    public boolean Y1;
    public boolean Y2;
    public final df Y3;
    public final Paint Y4;
    public final xe Z0;
    public MessageObject Z1;
    public qg Z2;
    public final me Z3;
    public final LinearGradient Z4;
    public int a;
    public boolean a0;
    public boolean a1;
    public boolean a2;
    public ig a3;
    public final me a4;
    public final Matrix a5;
    public boolean b;
    public NumberTextView b0;
    public final ye b1;
    public TL_account.TL_businessChatLink b2;
    public TLRPC.TL_document b3;
    public final me b4;
    public final g6 b5;
    public org.telegram.ui.ActionBar.f1 c;
    public int c0;
    public boolean c1;
    public mg c2;
    public String c3;
    public final me c4;
    public final g6 c5;
    public LinearLayout d;
    public int d0;
    public ai.x5 d1;
    public TLRPC.ChatFull d2;
    public MessageObject d3;
    public final me d4;
    public ph.f d5;
    public CharSequence e;
    public es e0;
    public ne e1;
    public boolean e2;
    public VideoEditedInfo e3;
    public boolean e4;
    public jh.h e5;
    public String f;
    public Runnable f0;
    public a91 f1;
    public int f2;
    public boolean f3;
    public long f4;
    public final me.e f5;
    public boolean g0;
    public fk0 g1;
    public boolean g2;
    public boolean g3;
    public float g4;
    public final me.b g5;
    public float h;
    public boolean h0;
    public ll0 h1;
    public boolean h2;
    public boolean h3;
    public float h4;
    public final me.b h5;
    public String i0;
    public long i1;
    public boolean i2;
    public MessageObject i3;
    public float i4;
    public final me.b i5;
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
    public wg l1;
    public boolean l2;
    public boolean l3;
    public float l4;
    public boolean l5;
    public qf m0;
    public final sw0 m1;
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
    public bq0 p0;
    public final org.telegram.ui.yd p1;
    public boolean p2;
    public boolean p3;
    public float p4;
    public hf q0;
    public ViewPropertyAnimator q1;
    public PowerManager.WakeLock q2;
    public boolean q3;
    public float q4;
    public float r;
    public le r0;
    public final hg.l r1;
    public AnimatorSet r2;
    public final df r3;
    public boolean r4;
    public float s;
    public int s0;
    public final i0 s1;
    public AnimatorSet s2;
    public final lf s3;
    public boolean s4;
    public int t0;
    public final ImageView t1;
    public AnimatorSet t2;
    public final org.telegram.ui.Cells.d1 t3;
    public int t4;
    public le u0;
    public final ImageView u1;
    public AnimatorSet u2;
    public final wf u3;
    public long u4;
    public boolean v;
    public ValueAnimator v0;
    public float v1;
    public int v2;
    public final zf v3;
    public boolean v4;
    public Runnable w;
    public float w0;
    public ImageView w1;
    public int w2;
    public final Paint w3;
    public ValueAnimator w4;
    public float x;
    public boolean x0;
    public ef x1;
    public int x2;
    public boolean x3;
    public boolean x4;
    public float y;
    public boolean y0;
    public final pe y1;
    public int y2;
    public boolean y3;
    public boolean y4;
    public boolean z0;
    public final ne z1;
    public boolean z2;
    public boolean z3;
    public boolean z4;

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        public final da h;
        public final da n;
        public final float r;
        public final float s;
        public final RectF v;
        public boolean w;
        public final vg x;
        public int y;

        public RecordCircle(Context context) {
            super(context);
            da daVar = new da(11, LiteMode.FLAGS_CHAT);
            this.h = daVar;
            da daVar2 = new da(12, LiteMode.FLAGS_CHAT);
            this.n = daVar2;
            this.r = AndroidUtilities.dpf2(41.0f);
            this.s = AndroidUtilities.dp(30.0f);
            this.v = new RectF();
            this.H = 0.0f;
            this.I = true;
            vg vgVar = new vg(this, this);
            this.x = vgVar;
            r0.i0.j(this, vgVar);
            daVar.a = AndroidUtilities.dp(47.0f);
            daVar.b = AndroidUtilities.dp(55.0f);
            daVar.b();
            daVar2.a = AndroidUtilities.dp(47.0f);
            daVar2.b = AndroidUtilities.dp(55.0f);
            daVar2.b();
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
            int i10 = org.telegram.ui.ActionBar.i6.bf;
            int g02 = chatActivityEnterView.g0(i10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(g02, mode));
            chatActivityEnterView.Q3 = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            chatActivityEnterView.Q3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.g0(i10), mode));
            chatActivityEnterView.R3 = getResources().getDrawable(R.drawable.attach_send).mutate();
            chatActivityEnterView.R3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.g0(i10), mode));
            chatActivityEnterView.N3 = getResources().getDrawable(R.drawable.input_mic).mutate();
            Drawable drawable2 = chatActivityEnterView.N3;
            int i11 = org.telegram.ui.ActionBar.i6.Wk;
            drawable2.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.g0(i11), mode));
            chatActivityEnterView.O3 = getResources().getDrawable(R.drawable.input_video).mutate();
            chatActivityEnterView.O3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.g0(i11), mode));
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
            chatActivityEnterView.v0();
            chatActivityEnterView.m4 = 0.0f;
            chatActivityEnterView.h4 = 0.0f;
            chatActivityEnterView.g4 = 0.0f;
            chatActivityEnterView.e4 = false;
            this.f = 0.0f;
            chatActivityEnterView.r4 = false;
            ug ugVar = chatActivityEnterView.O1;
            if (ugVar != null) {
                ugVar.invalidate();
            }
        }

        public final void d() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.s4 = false;
            invalidate();
            ug ugVar = chatActivityEnterView.O1;
            if (ugVar != null) {
                ugVar.invalidate();
            }
        }

        @Override // android.view.View
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            return super.dispatchHoverEvent(motionEvent) || this.x.f(motionEvent);
        }

        public final void e() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.M3;
            int i10 = org.telegram.ui.ActionBar.i6.cf;
            paint.setColor(chatActivityEnterView.g0(i10));
            this.h.d.setColor(i0.a.k(chatActivityEnterView.g0(i10), 38));
            this.n.d.setColor(i0.a.k(chatActivityEnterView.g0(i10), 76));
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
            ug ugVar = ChatActivityEnterView.this.O1;
            if (ugVar != null) {
                ugVar.invalidate();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:119:0x04d5  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x04c9  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x02e7  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x0276  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x022b  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x01b6  */
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
            boolean isEnabled;
            int i10;
            Drawable drawable3;
            Paint paint2;
            float f20;
            Drawable drawable4;
            Drawable drawable5;
            ll0 ll0Var;
            float f21;
            float f22;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Rect rect = chatActivityEnterView.T3;
            Paint paint3 = chatActivityEnterView.M3;
            if (this.N) {
                return;
            }
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp2(26.0f);
            int dp = (int) (AndroidUtilities.dp(170.0f) + 0.0f);
            this.J = chatActivityEnterView.t4 + measuredWidth;
            float f23 = dp;
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
            float interpolation2 = ((this.s * this.a) + this.r) * f25 * (chatActivityEnterView.r4 ? hs.g.getInterpolation(f10 - chatActivityEnterView.j4) * 0.7f : (chatActivityEnterView.j4 * 0.3f) + 0.7f);
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
                    Drawable drawable6 = null;
                    if (chatActivityEnterView.s4) {
                    }
                    drawable.setBounds(rect);
                    if (this.w) {
                    }
                    isEnabled = LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                    da daVar = this.n;
                    da daVar2 = this.h;
                    if (isEnabled) {
                    }
                    this.d = System.currentTimeMillis();
                    float f32 = chatActivityEnterView.j4;
                    if (f32 > f15) {
                    }
                    if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                        if (this.I) {
                        }
                        if (!this.M) {
                        }
                    }
                    float max2 = (chatActivityEnterView.r4 || chatActivityEnterView.j4 >= 1.0f) ? f16 : Math.max(f16, AndroidUtilities.dp(19.0f));
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
                hs hsVar = hs.j;
                interpolation = hsVar.getInterpolation(f33);
                float interpolation3 = hsVar.getInterpolation(f31);
                interpolation2 = (1.0f - interpolation3) * ((AndroidUtilities.dp(16.0f) * interpolation) + interpolation2);
                if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
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
                            paint3.setColor(i0.a.d(this.e, chatActivityEnterView.g0(org.telegram.ui.ActionBar.i6.cf), chatActivityEnterView.g0(org.telegram.ui.ActionBar.i6.kf)));
                        } else {
                            f14 = 0.0f;
                            f15 = 0.7f;
                            paint3.setColor(chatActivityEnterView.g0(org.telegram.ui.ActionBar.i6.cf));
                        }
                        a();
                        Drawable drawable62 = null;
                        if (chatActivityEnterView.s4) {
                            float f36 = this.f;
                            if (f36 != 1.0f) {
                                f19 = 12.0f;
                                float f37 = (currentTimeMillis / 150.0f) + f36;
                                this.f = f37;
                                if (f37 > 1.0f) {
                                    this.f = 1.0f;
                                }
                                drawable62 = chatActivityEnterView.c1 ? chatActivityEnterView.Q3 : chatActivityEnterView.P3;
                            } else {
                                f19 = 12.0f;
                            }
                            Drawable drawable7 = drawable62;
                            drawable = chatActivityEnterView.R3;
                            f18 = f12;
                            f17 = f11;
                            paint = paint3;
                            f16 = interpolation2;
                            rect.set(org.telegram.ui.Cells.c1.s(2, measuredWidth, drawable), org.telegram.ui.Cells.c1.c(2, dp, drawable), org.telegram.ui.Cells.c1.w(2, measuredWidth, drawable), org.telegram.ui.Cells.c1.v(2, dp, drawable));
                            if (drawable7 != null) {
                                drawable7.setBounds(org.telegram.ui.Cells.c1.s(2, measuredWidth, drawable7), org.telegram.ui.Cells.c1.c(2, dp, drawable7), org.telegram.ui.Cells.c1.w(2, measuredWidth, drawable7), org.telegram.ui.Cells.c1.v(2, dp, drawable7));
                            }
                            drawable2 = drawable7;
                        } else {
                            f16 = interpolation2;
                            f17 = f11;
                            paint = paint3;
                            f18 = f12;
                            f19 = 12.0f;
                            drawable = chatActivityEnterView.c1 ? chatActivityEnterView.Q3 : chatActivityEnterView.P3;
                            rect.set(measuredWidth - AndroidUtilities.dp(12.0f), dp - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + measuredWidth, AndroidUtilities.dp(12.0f) + dp);
                            drawable2 = null;
                        }
                        drawable.setBounds(rect);
                        if (this.w) {
                            float f38 = chatActivityEnterView.o4 + 0.01f;
                            chatActivityEnterView.o4 = f38;
                            if (f38 > 1.0f) {
                                this.w = false;
                                chatActivityEnterView.o4 = 1.0f;
                            }
                        } else {
                            float f39 = chatActivityEnterView.o4 - 0.01f;
                            chatActivityEnterView.o4 = f39;
                            if (f39 < f14) {
                                this.w = true;
                                chatActivityEnterView.o4 = f14;
                            }
                        }
                        isEnabled = LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                        da daVar3 = this.n;
                        da daVar22 = this.h;
                        if (isEnabled) {
                            daVar22.a = AndroidUtilities.dp(47.0f);
                            daVar22.b = (AndroidUtilities.dp(15.0f) * 0.6f) + AndroidUtilities.dp(47.0f);
                            daVar3.a = AndroidUtilities.dp(50.0f);
                            daVar3.b = (AndroidUtilities.dp(f19) * 0.6f) + AndroidUtilities.dp(50.0f);
                            daVar3.f(currentTimeMillis);
                            daVar3.e(daVar3.t, 1.01f);
                            daVar22.f(currentTimeMillis);
                            daVar22.e(daVar22.t, 1.02f);
                        }
                        this.d = System.currentTimeMillis();
                        float f322 = chatActivityEnterView.j4;
                        float f40 = f322 > f15 ? 1.0f : f322 / f15;
                        if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT) && f17 != 1.0f && f18 < 0.4f && f40 > 0.0f && !chatActivityEnterView.r4) {
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
                                float interpolation4 = hs.g.getInterpolation(this.H);
                                canvas.save();
                                float f43 = 1.0f - f13;
                                float A = com.google.android.gms.internal.vision.e2.A(daVar3.t, 1.4f, 0.878f, com.google.android.gms.internal.vision.e2.C(chatActivityEnterView.h4, f43, f40, interpolation4));
                                canvas.scale(A, A, chatActivityEnterView.t4 + measuredWidth, f23);
                                daVar3.a(chatActivityEnterView.t4 + measuredWidth, f23, canvas, daVar3.d);
                                canvas.restore();
                                float C = ((daVar22.t * 1.4f) + 0.926f) * com.google.android.gms.internal.vision.e2.C(chatActivityEnterView.h4, f43, f40, interpolation4);
                                canvas.save();
                                canvas.scale(C, C, chatActivityEnterView.t4 + measuredWidth, f23);
                                daVar22.a(chatActivityEnterView.t4 + measuredWidth, f23, canvas, daVar22.d);
                                canvas.restore();
                            }
                        }
                        float max22 = (chatActivityEnterView.r4 || chatActivityEnterView.j4 >= 1.0f) ? f16 : Math.max(f16, AndroidUtilities.dp(19.0f));
                        if (this.M) {
                            i10 = measuredWidth;
                            drawable3 = drawable;
                            paint2 = paint;
                        } else {
                            paint2 = paint;
                            paint2.setAlpha((int) (this.y * max));
                            if (chatActivityEnterView.h4 == 1.0f) {
                                if (chatActivityEnterView.p4 == 0.0f) {
                                    drawable4 = drawable2;
                                    i10 = measuredWidth;
                                    drawable5 = drawable;
                                    f20 = 1.0f;
                                    canvas.drawCircle(i10 + chatActivityEnterView.t4, f23, max22, paint2);
                                } else if (chatActivityEnterView.c1 || this.e <= 0.0f || (ll0Var = chatActivityEnterView.h1) == null) {
                                    drawable4 = drawable2;
                                    i10 = measuredWidth;
                                    drawable5 = drawable;
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
                                    for (View view = (View) ll0Var.getParent(); view != getParent(); view = (View) view.getParent()) {
                                        i12 = (int) (view.getY() + i12);
                                        i11 = (int) (view.getX() + i11);
                                    }
                                    float f49 = i12;
                                    float y3 = (ll0Var.getY() + f49) - getY();
                                    float y10 = ((ll0Var.getY() + ll0Var.getMeasuredHeight()) + f49) - getY();
                                    float f50 = i11;
                                    float x10 = (((ll0Var.getX() + ll0Var.getMeasuredWidth()) + f50) - getX()) - chatActivityEnterView.I;
                                    float x11 = ((ll0Var.getX() + f50) - getX()) + chatActivityEnterView.I;
                                    i10 = measuredWidth;
                                    float measuredHeight = chatActivityEnterView.c1 ? 0.0f : ll0Var.getMeasuredHeight() / 2.0f;
                                    drawable5 = drawable;
                                    float lerp = AndroidUtilities.lerp(f45, y3, this.e);
                                    float lerp2 = AndroidUtilities.lerp(f44, y10, this.e);
                                    float lerp3 = AndroidUtilities.lerp(f48, x11, this.e);
                                    float lerp4 = AndroidUtilities.lerp(f47, x10, this.e);
                                    AndroidUtilities.lerp(max22, measuredHeight, this.e);
                                    RectF rectF = this.v;
                                    rectF.set(lerp3, lerp, lerp4, lerp2);
                                    chatActivityEnterView.h1.a(canvas, rectF);
                                    f20 = 1.0f;
                                }
                                canvas.save();
                                canvas.translate(chatActivityEnterView.t4, 0.0f);
                                drawable3 = drawable5;
                                drawable2 = drawable4;
                                b(canvas, drawable3, drawable2, this.f, (int) org.telegram.messenger.q.z(f20, f17, f20 - f18, 255.0f));
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
                hs hsVar2 = hs.j;
                interpolation = hsVar2.getInterpolation(f22);
                f11 = hsVar2.getInterpolation(max3);
                this.e = hsVar2.getInterpolation(this.e);
                float dp2 = (AndroidUtilities.dp(16.0f) * interpolation) + interpolation2;
                float dp3 = AndroidUtilities.dp(8.0f);
                interpolation2 = com.google.android.gms.internal.vision.e2.y(f10, f11, dp2 - dp3, dp3);
                f12 = 0.0f;
            }
            f13 = interpolation;
            max = 1.0f;
            if (chatActivityEnterView.r4) {
            }
            if (this.e > 0.0f) {
            }
            a();
            Drawable drawable622 = null;
            if (chatActivityEnterView.s4) {
            }
            drawable.setBounds(rect);
            if (this.w) {
            }
            isEnabled = LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
            da daVar32 = this.n;
            da daVar222 = this.h;
            if (isEnabled) {
            }
            this.d = System.currentTimeMillis();
            float f3222 = chatActivityEnterView.j4;
            if (f3222 > f15) {
            }
            if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
            }
            float max222 = (chatActivityEnterView.r4 || chatActivityEnterView.j4 >= 1.0f) ? f16 : Math.max(f16, AndroidUtilities.dp(19.0f));
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
            ug ugVar = chatActivityEnterView.O1;
            if (ugVar != null) {
                ugVar.invalidate();
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

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
            int i10 = org.telegram.ui.ActionBar.i6.Wk;
            int i11 = ChatActivityEnterView.n5;
            paint.setColor(ChatActivityEnterView.this.g0(i10));
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
            int i10 = org.telegram.ui.ActionBar.i6.nf;
            int i11 = ChatActivityEnterView.n5;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int g02 = chatActivityEnterView.g0(i10);
            this.a.setColor(g02);
            int i12 = org.telegram.ui.ActionBar.i6.mf;
            int g03 = chatActivityEnterView.g0(i12);
            this.b.setColor(g03);
            this.s = r2.getAlpha();
            this.v = r4.getAlpha();
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.i6.i0(AndroidUtilities.dp(60.0f), 0, i0.a.k(chatActivityEnterView.g0(i12), 26));
            this.L = i02;
            i02.setCallback(this);
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
            int g02 = chatActivityEnterView.g0(org.telegram.ui.ActionBar.i6.nf);
            TextPaint textPaint = this.a;
            textPaint.setColor(g02);
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
                zg zgVar = chatActivityEnterView.Y0;
                f12 = 2.0f;
                canvas.clipRect((zgVar == null ? 0.0f : zgVar.getLeftProperty()) + AndroidUtilities.dp(4.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
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
                    chatActivityEnterView.Z2.q2(5, 0, chatActivityEnterView.O ? Integer.MAX_VALUE : 0, chatActivityEnterView.S4, 0L, true);
                    af afVar = chatActivityEnterView.J0;
                    chatActivityEnterView.S4 = 0L;
                    afVar.setEffect(0L);
                } else {
                    chatActivityEnterView.Z2.g1(0);
                    MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                }
                chatActivityEnterView.b3 = null;
                chatActivityEnterView.d3 = null;
                chatActivityEnterView.e3 = null;
                chatActivityEnterView.i1 = 0L;
                chatActivityEnterView.F2 = false;
                MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                long j10 = chatActivityEnterView.Q2;
                org.telegram.ui.zn znVar = chatActivityEnterView.P2;
                if (znVar != null && znVar.h4) {
                    j3 = znVar.d();
                }
                mediaDataController.pushDraftVoiceMessage(j10, j3, null);
                chatActivityEnterView.J1(2, true);
                chatActivityEnterView.I(true);
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

    public ChatActivityEnterView(Activity activity, sw0 sw0Var, org.telegram.ui.zn znVar, boolean z10, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        int i10;
        String str;
        qg qgVar;
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
        final int i13 = 0;
        new se(0);
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
        this.r3 = new df(this, i13);
        this.s3 = new lf(this);
        this.t3 = new org.telegram.ui.Cells.d1(Integer.class, "translationY", 1);
        this.u3 = new wf(Float.class, "scale");
        this.v3 = new zf(Float.class, "controlsScale");
        this.w3 = new Paint(1);
        this.H3 = new df(this, i11);
        this.K3 = new lg(this);
        this.L3 = new AnimationNotificationsLocker();
        this.M3 = new Paint(1);
        this.S3 = new RectF();
        this.T3 = new Rect();
        this.U3 = new Rect();
        this.Y3 = new df(this, 2);
        this.Z3 = new me(this, 0);
        this.a4 = new me(this, 1);
        this.b4 = new me(this, 2);
        this.c4 = new me(this, 3);
        this.d4 = new me(this, 4);
        this.x4 = true;
        this.y4 = true;
        this.B4 = new Paint();
        this.C4 = 1.0f;
        this.D4 = new Rect();
        this.F4 = new vd(this, 7);
        this.I4 = true;
        this.O4 = new er[1];
        this.T4 = BotForumHelper.SteamingSendButtonState.NO_STREAMING;
        this.V4 = -1;
        Paint paint = new Paint(1);
        this.Y4 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.Z4 = linearGradient;
        this.a5 = new Matrix();
        hs hsVar = hs.h;
        this.b5 = new g6(this, 0L, 280L, hsVar);
        this.c5 = new g6(this, 0L, 280L, hsVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        hs hsVar2 = ji.n.V;
        this.f5 = new me.e(0, this, hsVar2, 250L);
        this.g5 = new me.b(1, this, hsVar2, 250L, false);
        this.h5 = new me.b(2, this, hsVar, 320L, false);
        this.i5 = new me.b(3, this, hsVar, 320L, false);
        this.W3 = e6Var;
        this.X3 = z10;
        this.i2 = z10 && !AndroidUtilities.isInMultiwindow && (znVar == null || !znVar.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.Q1 = paint2;
        paint2.setColor(g0(org.telegram.ui.ActionBar.i6.af));
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
        this.P2 = znVar;
        if (znVar != null) {
            this.G2 = znVar.getClassGuid();
        }
        this.m1 = sw0Var;
        this.n1 = sw0Var;
        sw0Var.setDelegate(this);
        this.B2 = MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false);
        ne neVar = new ne(this, activity, i13);
        this.z1 = neVar;
        neVar.setClipChildren(false);
        neVar.setClipToPadding(false);
        neVar.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
        addView(neVar, w7.x5.a(-2.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1, 83));
        pe peVar = new pe(this, activity);
        this.y1 = peVar;
        peVar.setClipChildren(false);
        neVar.addView(peVar, w7.x5.a(-2.0f, 0.0f, 0.0f, 44.0f, 0.0f, -1, 80));
        qe qeVar = new qe(this, activity);
        this.Q0 = qeVar;
        qeVar.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        qeVar.setFocusable(true);
        int dp = AndroidUtilities.dp(7.5f);
        qeVar.setPadding(dp, dp, dp, dp);
        int i14 = org.telegram.ui.ActionBar.i6.Wk;
        int g02 = g0(i14);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        qeVar.setColorFilter(new PorterDuffColorFilter(g02, mode));
        int i15 = org.telegram.ui.ActionBar.i6.i6;
        int g03 = g0(i15);
        float dp2 = AndroidUtilities.dp(19.0f);
        int dp3 = AndroidUtilities.dp(1.0f);
        int dp4 = AndroidUtilities.dp(3.0f);
        qeVar.setBackground(org.telegram.ui.ActionBar.i6.X(dp2, g03, dp3, dp4, dp3, dp4));
        qeVar.setOnClickListener(new xd(this, 14));
        peVar.addView(qeVar, w7.x5.a(44.0f, 2.0f, 0.0f, 0.0f, 0.0f, 44, 83));
        b1(false, false);
        ImageView imageView = new ImageView(activity);
        this.R0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(g0(i14), mode));
        int g04 = g0(i15);
        float dp5 = AndroidUtilities.dp(19.0f);
        int dp6 = AndroidUtilities.dp(1.0f);
        int dp7 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.X(dp5, g04, dp6, dp7, dp6, dp7));
        imageView.setVisibility(8);
        imageView.setContentDescription(LocaleController.getString(R.string.ArticleDeleteDraft));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.he
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
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, e6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new de(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    default:
                        int i17 = ChatActivityEnterView.n5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        org.telegram.ui.zn znVar2 = chatActivityEnterView2.P2;
                        long a2 = znVar2 != null ? znVar2.a() : chatActivityEnterView2.Q2;
                        boolean z11 = chatActivityEnterView2.D1;
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        if (!z11) {
                            if (chatActivityEnterView2.E0 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), e6Var2);
                                e0Var.n0(chatActivityEnterView2.E0.getText());
                                e0Var.j0 = new fe(chatActivityEnterView2, 1);
                                boolean z12 = chatActivityEnterView2.Z1 != null;
                                ge geVar = new ge(chatActivityEnterView2, a2, e6Var2, 1);
                                e0Var.l0 = a2;
                                e0Var.m0 = z12;
                                e0Var.n0 = geVar;
                                e0Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.E1 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), e6Var2);
                            e0Var2.o0(chatActivityEnterView2.E1);
                            e0Var2.k0 = new fe(chatActivityEnterView2, 0);
                            ge geVar2 = new ge(chatActivityEnterView2, a2, e6Var2, 0);
                            e0Var2.l0 = a2;
                            e0Var2.o0 = geVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                }
            }
        });
        peVar.addView(imageView, w7.x5.a(44.0f, 2.0f, 0.0f, 0.0f, 0.0f, 44, 83));
        if (z10) {
            int i16 = znVar != null ? znVar.R3 : -1;
            org.telegram.ui.yd ydVar = new org.telegram.ui.yd(activity, 2);
            this.p1 = ydVar;
            ydVar.setOrientation(0);
            ydVar.setEnabled(false);
            ydVar.setClipChildren(false);
            peVar.addView(ydVar, w7.x5.a(44.0f, 0.0f, 0.0f, 44.0f, 0.0f, -2, 85));
            if (i16 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.I1 = imageView2;
                es esVar = new es(activity, R.drawable.input_notify_on, i14);
                this.e0 = esVar;
                imageView2.setImageDrawable(esVar);
                this.e0.a(this.g2, false);
                if (this.g2) {
                    i10 = R.string.AccDescrChanSilentOn;
                    str = "AccDescrChanSilentOn";
                } else {
                    i10 = R.string.AccDescrChanSilentOff;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(LocaleController.getString(str, i10));
                imageView2.setColorFilter(new PorterDuffColorFilter(g0(i14), PorterDuff.Mode.MULTIPLY));
                imageView2.setScaleType(scaleType);
                imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(g0(i15), 1, -1));
                imageView2.setVisibility((!this.h2 || ((qgVar = this.Z2) != null && qgVar.I0())) ? 8 : 0);
                ydVar.addView(imageView2, w7.x5.n(44, 44));
                imageView2.setOnClickListener(new re(this, znVar, activity));
            }
            hg.l lVar = new hg.l(activity, i11);
            this.r1 = lVar;
            lVar.setScaleType(scaleType);
            lVar.setColorFilter(new PorterDuffColorFilter(g0(i14), PorterDuff.Mode.MULTIPLY));
            lVar.setImageResource(R.drawable.msg_input_attach2);
            lVar.setBackground(org.telegram.ui.ActionBar.i6.g0(g0(i15), 1, -1));
            peVar.addView(lVar, w7.x5.e(44, 44, 85));
            lVar.setOnClickListener(new xd(this, 18));
            lVar.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
            F1(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.t1 = imageView3;
        i0 i0Var = new i0(activity);
        this.s1 = i0Var;
        imageView3.setImageDrawable(i0Var);
        imageView3.setScaleType(scaleType);
        int g05 = g0(i14);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(g05, mode2));
        imageView3.setBackground(org.telegram.ui.ActionBar.i6.g0(g0(i15), 1, AndroidUtilities.dp(16.0f)));
        neVar.addView(imageView3, w7.x5.a(44.0f, 0.0f, 1.0f, 0.0f, 0.0f, 44, 51));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.z5.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.he
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
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, e6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new de(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    default:
                        int i17 = ChatActivityEnterView.n5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        org.telegram.ui.zn znVar2 = chatActivityEnterView2.P2;
                        long a2 = znVar2 != null ? znVar2.a() : chatActivityEnterView2.Q2;
                        boolean z11 = chatActivityEnterView2.D1;
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        if (!z11) {
                            if (chatActivityEnterView2.E0 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), e6Var2);
                                e0Var.n0(chatActivityEnterView2.E0.getText());
                                e0Var.j0 = new fe(chatActivityEnterView2, 1);
                                boolean z12 = chatActivityEnterView2.Z1 != null;
                                ge geVar = new ge(chatActivityEnterView2, a2, e6Var2, 1);
                                e0Var.l0 = a2;
                                e0Var.m0 = z12;
                                e0Var.n0 = geVar;
                                e0Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.E1 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), e6Var2);
                            e0Var2.o0(chatActivityEnterView2.E1);
                            e0Var2.k0 = new fe(chatActivityEnterView2, 0);
                            ge geVar2 = new ge(chatActivityEnterView2, a2, e6Var2, 0);
                            e0Var2.l0 = a2;
                            e0Var2.o0 = geVar2;
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
        imageView4.setColorFilter(new PorterDuffColorFilter(g0(i14), mode2));
        imageView4.setBackground(org.telegram.ui.ActionBar.i6.g0(g0(i15), 1, AndroidUtilities.dp(16.0f)));
        neVar.addView(imageView4, w7.x5.a(44.0f, 0.0f, 1.0f, 0.0f, 0.0f, 44, 53));
        imageView4.setContentDescription(LocaleController.getString(R.string.ArticleEditor));
        w7.z5.a(imageView4);
        imageView4.setOnClickListener(new xd(this, 20));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.b3 != null) {
            V();
        }
        ImageView imageView5 = new ImageView(activity);
        this.B1 = imageView5;
        imageView5.setImageResource(R.drawable.send_outline);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        imageView5.setColorFilter(g0(org.telegram.ui.ActionBar.i6.hl), mode);
        neVar.addView(imageView5, w7.x5.e(44, 44, 85));
        ne neVar2 = new ne(this, activity, i11);
        this.A1 = neVar2;
        neVar2.setClipChildren(false);
        neVar2.setClipToPadding(false);
        neVar.addView(neVar2, w7.x5.e(100, 44, 85));
        xe xeVar = new xe(this, activity, e6Var);
        this.Z0 = xeVar;
        xeVar.setSoundEffectsEnabled(false);
        neVar2.addView(xeVar, w7.x5.e(44, 44, 85));
        xeVar.setFocusable(true);
        xeVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.N3 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(g0(i14), mode2));
        Drawable mutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.O3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(g0(i14), mode2));
        ye yeVar = new ye(this, activity);
        this.b1 = yeVar;
        yeVar.setImportantForAccessibility(2);
        int dp8 = AndroidUtilities.dp(10.0f);
        yeVar.setPadding(dp8, dp8, dp8, dp8);
        xeVar.addView(yeVar, w7.x5.d(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.P0 = imageView6;
        int i17 = 4;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ze zeVar = new ze();
        this.P1 = zeVar;
        imageView6.setImageDrawable(zeVar);
        imageView6.setContentDescription(LocaleController.getString("Cancel", R.string.Cancel));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        imageView6.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(g0(i15), 1, -1));
        neVar2.addView(imageView6, w7.x5.e(44, 44, 85));
        imageView6.setOnClickListener(new xd(this, 0));
        af afVar = new af(this, activity, c() ? R.drawable.input_schedule : R.drawable.send_plane_24, e6Var, 0);
        this.J0 = afVar;
        afVar.setVisibility(4);
        afVar.setContentDescription(LocaleController.getString(R.string.Send));
        int i18 = 0;
        afVar.setSoundEffectsEnabled(false);
        afVar.setScaleX(0.1f);
        afVar.setScaleY(0.1f);
        afVar.setAlpha(0.0f);
        neVar2.addView(afVar, w7.x5.e(100, 44, 85));
        afVar.setOnClickListener(new xd(this, i11));
        afVar.setOnLongClickListener(new ae(this, i18));
        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            neVar2.setOnLongClickListener(new ae(this, i18));
        }
        gi.a aVar = new gi.a(activity, e6Var);
        this.I0 = aVar;
        aVar.setVisibility(4);
        aVar.setOnClickListener(new xd(this, i17));
        neVar2.addView(aVar, w7.x5.e(44, 44, 85));
        yg ygVar = new yg(activity);
        this.F0 = ygVar;
        org.telegram.ui.ActionBar.j5 j5Var = ygVar.a;
        j5Var.setTextSize(16);
        ygVar.invalidate();
        ygVar.setVisibility(4);
        ygVar.setSoundEffectsEnabled(false);
        ygVar.setScaleX(0.1f);
        ygVar.setScaleY(0.1f);
        ygVar.setAlpha(0.0f);
        ygVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        j5Var.setGravity(21);
        ygVar.invalidate();
        j5Var.setTextColor(g0(i14));
        ygVar.invalidate();
        neVar2.addView(ygVar, w7.x5.e(74, 44, 85));
        ygVar.setOnClickListener(new xd(this, 8));
        ygVar.setOnLongClickListener(new ae(this, i11));
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        this.x2 = globalEmojiSettings.getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.y2 = globalEmojiSettings.getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        i1(false, false);
        I(false);
        D();
        U();
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0136, code lost:
    
        if (r4 != null) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [int] */
    /* JADX WARN: Type inference failed for: r6v15, types: [int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean F(int i10, long j3, org.telegram.ui.ActionBar.n2 n2Var, CharSequence charSequence) {
        b6[] b6VarArr;
        boolean z10;
        int i11;
        int i12;
        TLRPC.ChatFull chatFull;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        ArrayList<TLRPC.StickerSetCovered> arrayList;
        int i13;
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList4;
        ArrayList<TLRPC.Document> arrayList5;
        boolean z11 = false;
        if (charSequence != null && n2Var != null && !UserConfig.getInstance(i10).isPremium() && UserConfig.getInstance(i10).getClientUserId() != j3 && (charSequence instanceof Spanned) && (b6VarArr = (b6[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), b6.class)) != null) {
            int i14 = 0;
            while (i14 < b6VarArr.length) {
                b6 b6Var = b6VarArr[i14];
                if (b6Var != null) {
                    TLRPC.Document document = b6Var.document;
                    if (document == null) {
                        i12 = i10;
                        document = s5.f(i12, b6Var.getDocumentId());
                    } else {
                        i12 = i10;
                    }
                    long documentId = b6VarArr[i14].getDocumentId();
                    if (document == null) {
                        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                        int size = stickerSets.size();
                        ?? r12 = z11;
                        while (r12 < size) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(r12);
                            int i15 = r12 + 1;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                            if (tL_messages_stickerSet2 != null && (arrayList5 = tL_messages_stickerSet2.documents) != null && !arrayList5.isEmpty()) {
                                ArrayList<TLRPC.Document> arrayList6 = tL_messages_stickerSet2.documents;
                                int size2 = arrayList6.size();
                                ?? r15 = z11;
                                while (r15 < size2) {
                                    TLRPC.Document document2 = arrayList6.get(r15);
                                    int i16 = r15 + 1;
                                    z10 = z11;
                                    TLRPC.Document document3 = document2;
                                    i11 = i14;
                                    arrayList4 = stickerSets;
                                    if (document3.id == documentId) {
                                        document = document3;
                                        break;
                                    }
                                    stickerSets = arrayList4;
                                    i14 = i11;
                                    z11 = z10;
                                    r15 = i16;
                                }
                            }
                            z10 = z11;
                            i11 = i14;
                            arrayList4 = stickerSets;
                            if (document != null) {
                                break;
                            }
                            stickerSets = arrayList4;
                            i14 = i11;
                            z11 = z10;
                            r12 = i15;
                        }
                    }
                    z10 = z11;
                    i11 = i14;
                    if (document == null) {
                        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                        int size3 = featuredEmojiSets.size();
                        ?? r11 = z10;
                        while (r11 < size3) {
                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(r11);
                            int i17 = r11 + 1;
                            TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                            if (stickerSetCovered2 != null && (arrayList3 = stickerSetCovered2.covers) != null && !arrayList3.isEmpty()) {
                                ArrayList<TLRPC.Document> arrayList7 = stickerSetCovered2.covers;
                                int size4 = arrayList7.size();
                                ?? r152 = z10;
                                while (r152 < size4) {
                                    TLRPC.Document document4 = arrayList7.get(r152);
                                    int i18 = r152 + 1;
                                    TLRPC.Document document5 = document4;
                                    arrayList = featuredEmojiSets;
                                    i13 = size3;
                                    if (document5.id == documentId) {
                                        document = document5;
                                        break;
                                    }
                                    featuredEmojiSets = arrayList;
                                    size3 = i13;
                                    r152 = i18;
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
                                ?? r62 = z10;
                                while (true) {
                                    if (r62 >= size5) {
                                        break;
                                    }
                                    TLRPC.Document document6 = arrayList2.get(r62);
                                    r62++;
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
                            r11 = i17;
                        }
                    }
                    if (document != null && (chatFull = MessagesController.getInstance(i12).getChatFull(-j3)) != null && chatFull.emojiset != null && (groupStickerSetById = MediaDataController.getInstance(i12).getGroupStickerSetById(chatFull.emojiset)) != null) {
                        ArrayList<TLRPC.Document> arrayList8 = groupStickerSetById.documents;
                        int size6 = arrayList8.size();
                        ?? r63 = z10;
                        while (r63 < size6) {
                            TLRPC.Document document8 = arrayList8.get(r63);
                            r63++;
                            if (document8.id == documentId) {
                                return z10;
                            }
                        }
                    }
                    if (document == null || !MessageObject.isFreeEmoji(document)) {
                        ad.a0(n2Var).q(document, AndroidUtilities.replaceTags(LocaleController.getString("UnlockPremiumEmojiHint", R.string.UnlockPremiumEmojiHint)), LocaleController.getString("PremiumMore", R.string.PremiumMore), new wd(0, n2Var)).j();
                        return true;
                    }
                } else {
                    z10 = z11;
                    i11 = i14;
                }
                i14 = i11 + 1;
                z11 = z10;
            }
        }
        return z11;
    }

    public static void f(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, Long l4, boolean z11) {
        if (chatActivityEnterView.G0 > 0 && !chatActivityEnterView.c()) {
            qg qgVar = chatActivityEnterView.Z2;
            if (qgVar != null) {
                yg ygVar = chatActivityEnterView.F0;
                qgVar.z1(ygVar, ygVar.a.getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.R1 != 0) {
            chatActivityEnterView.k1(0, true);
            chatActivityEnterView.U0.u(true);
            chatActivityEnterView.U0.C();
        }
        chatActivityEnterView.l1(false, true, false, true);
        qg qgVar2 = chatActivityEnterView.Z2;
        TL_stories.StoryItem j12 = qgVar2 != null ? qgVar2.j1() : null;
        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.Q);
        long j3 = chatActivityEnterView.Q2;
        MessageObject messageObject = chatActivityEnterView.T2;
        MessageObject threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.pn pnVar = chatActivityEnterView.V2;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.zn znVar = chatActivityEnterView.P2;
        sendMessagesHelper.sendSticker(document, str, j3, messageObject, threadMessage, j12, pnVar, sendAnimationData, z10, i10, i11, z12, obj, znVar != null ? znVar.H8() : null, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        qg qgVar3 = chatActivityEnterView.Z2;
        if (qgVar3 != null) {
            qgVar3.K(null, true, i10, 0, 0L);
        }
        if (z11) {
            chatActivityEnterView.setFieldText("");
        }
        MediaDataController.getInstance(chatActivityEnterView.Q).addRecentSticker(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public static void g(ChatActivityEnterView chatActivityEnterView, TL_keyboard.KeyboardButton keyboardButton) {
        org.telegram.ui.zn znVar;
        boolean z10 = chatActivityEnterView.T2 != null && (znVar = chatActivityEnterView.P2) != null && znVar.h4 && znVar.d() == ((long) chatActivityEnterView.T2.getId());
        MessageObject messageObject = ((chatActivityEnterView.T2 == null || z10) && !BotForumHelper.isBotForum(chatActivityEnterView.Q, chatActivityEnterView.Q2)) ? DialogObject.isChatDialog(chatActivityEnterView.Q2) ? chatActivityEnterView.m2 : null : chatActivityEnterView.T2;
        MessageObject messageObject2 = chatActivityEnterView.T2;
        if (messageObject2 == null || z10) {
            messageObject2 = chatActivityEnterView.m2;
        }
        boolean a02 = chatActivityEnterView.a0(keyboardButton, messageObject, messageObject2, null);
        if (chatActivityEnterView.T2 == null || z10) {
            MessageObject messageObject3 = chatActivityEnterView.m2;
            if (messageObject3 != null && messageObject3.messageOwner.reply_markup.single_use) {
                if (a02) {
                    chatActivityEnterView.G0();
                } else {
                    chatActivityEnterView.r1(0, 0, true, true);
                }
                MessagesController.getMainSettings(chatActivityEnterView.Q).edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.m2.getId()).commit();
            }
        } else {
            chatActivityEnterView.G0();
            chatActivityEnterView.X0(chatActivityEnterView.W2, true, false);
        }
        qg qgVar = chatActivityEnterView.Z2;
        if (qgVar != null) {
            qgVar.K(null, true, 0, 0, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MessageObject getThreadMessage() {
        org.telegram.ui.zn znVar = this.P2;
        if (znVar != null) {
            return znVar.X3;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getThreadMessageId() {
        MessageObject messageObject;
        org.telegram.ui.zn znVar = this.P2;
        if (znVar == null || (messageObject = znVar.X3) == null) {
            return 0;
        }
        return messageObject.getId();
    }

    private String getTopicKeyString() {
        org.telegram.ui.zn znVar = this.P2;
        if (znVar == null || !znVar.h4) {
            return "" + this.Q2;
        }
        return this.Q2 + "_" + znVar.d();
    }

    public static void k(ChatActivityEnterView chatActivityEnterView) {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            chatActivityEnterView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(chatActivityEnterView, "lockAnimatedTranslation", chatActivityEnterView.k4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(chatActivityEnterView, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(hs.h);
        ofFloat2.setDuration(250L);
        SharedConfig.removeLockRecordAudioVideoHint();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(chatActivityEnterView, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(chatActivityEnterView.k1, "cancelToProgress", 1.0f));
        animatorSet.start();
    }

    public static CharSequence q(ArrayList arrayList, CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        boolean z10;
        MediaDataController.sortEntities(arrayList);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(x10.a(charSequence, false));
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        if (spans != null && spans.length > 0) {
            for (Object obj : spans) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
        boolean z11 = true;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                try {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i10);
                    if (messageEntity.offset + messageEntity.length <= spannableStringBuilder.length()) {
                        if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            w61 w61Var = new w61("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i11 = messageEntity.offset;
                            spannableStringBuilder.setSpan(w61Var, i11, messageEntity.length + i11, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            w61 w61Var2 = new w61("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i12 = messageEntity.offset;
                            spannableStringBuilder.setSpan(w61Var2, i12, messageEntity.length + i12, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            t11 t11Var = new t11();
                            t11Var.a |= 4;
                            u11 u11Var = new u11(t11Var, 0);
                            int i13 = messageEntity.offset;
                            MediaDataController.addStyleToText(u11Var, i13, messageEntity.length + i13, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                t11 t11Var2 = new t11();
                                t11Var2.a |= 1;
                                u11 u11Var2 = new u11(t11Var2, 0);
                                int i14 = messageEntity.offset;
                                MediaDataController.addStyleToText(u11Var2, i14, messageEntity.length + i14, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                t11 t11Var3 = new t11();
                                t11Var3.a |= 2;
                                u11 u11Var3 = new u11(t11Var3, 0);
                                int i15 = messageEntity.offset;
                                MediaDataController.addStyleToText(u11Var3, i15, messageEntity.length + i15, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                t11 t11Var4 = new t11();
                                t11Var4.a |= 8;
                                u11 u11Var4 = new u11(t11Var4, 0);
                                int i16 = messageEntity.offset;
                                MediaDataController.addStyleToText(u11Var4, i16, messageEntity.length + i16, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                t11 t11Var5 = new t11();
                                t11Var5.a |= 16;
                                u11 u11Var5 = new u11(t11Var5, 0);
                                int i17 = messageEntity.offset;
                                MediaDataController.addStyleToText(u11Var5, i17, messageEntity.length + i17, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                v61 v61Var = new v61(messageEntity.url, null);
                                int i18 = messageEntity.offset;
                                spannableStringBuilder.setSpan(v61Var, i18, messageEntity.length + i18, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                t11 t11Var6 = new t11();
                                t11Var6.a |= 128;
                                int i19 = messageEntity.offset;
                                t11Var6.b = i19;
                                t11Var6.c = i19 + messageEntity.length;
                                t11Var6.d = messageEntity;
                                int i20 = messageEntity.offset;
                                x10 x10Var = new x10(spannableStringBuilder.subSequence(i20, messageEntity.length + i20).toString(), t11Var6, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i21 = messageEntity.offset;
                                spannableStringBuilder.setSpan(x10Var, i21, messageEntity.length + i21, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                t11 t11Var7 = new t11();
                                t11Var7.a |= 256;
                                u11 u11Var6 = new u11(t11Var7, 0);
                                int i22 = messageEntity.offset;
                                MediaDataController.addStyleToText(u11Var6, i22, messageEntity.length + i22, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                b6 b6Var = tL_messageEntityCustomEmoji.document != null ? new b6(tL_messageEntityCustomEmoji.document, fontMetricsInt) : new b6(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                int i23 = messageEntity.offset;
                                spannableStringBuilder.setSpan(b6Var, i23, messageEntity.length + i23, 33);
                            }
                        }
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
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
            boolean z12 = false;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if (i27 != intValue) {
                    int i29 = intValue - 1;
                    z10 = z11;
                    int i30 = (i29 < 0 || i29 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(i29) != '\n') ? intValue : intValue - 1;
                    if (i28 > 0) {
                        xj0.c(spannableStringBuilder, i27, i30, z12);
                    }
                    i27 = intValue + 1;
                    if (i27 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(intValue) != '\n') {
                        i27 = intValue;
                    }
                } else {
                    z10 = z11;
                }
                if ((intValue2 & 2) != 0) {
                    i28--;
                }
                if ((intValue2 & 1) != 0 || (intValue2 & 16) != 0) {
                    i28++;
                    z12 = (intValue2 & 16) != 0 ? z10 : false;
                }
                z11 = z10;
            }
            if (i27 < spannableStringBuilder.length() && i28 > 0) {
                xj0.c(spannableStringBuilder, i27, spannableStringBuilder.length(), z12);
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
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return replaceEmoji;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlowModeButtonVisible(boolean z10) {
        int i10;
        int i11 = z10 ? 0 : 8;
        yg ygVar = this.F0;
        ygVar.setVisibility(i11);
        if (z10) {
            i10 = AndroidUtilities.dp(ygVar.e ? 26.0f : 16.0f);
        } else {
            i10 = 0;
        }
        sf sfVar = this.E0;
        if (sfVar == null || sfVar.getPaddingRight() == i10) {
            return;
        }
        this.E0.setPadding(0, AndroidUtilities.dp(9.0f), i10, AndroidUtilities.dp(10.0f));
    }

    public final void A1() {
        int b10;
        s4.d0 d0Var;
        int L0;
        View m10;
        qf qfVar = this.m0;
        if (qfVar == null) {
            return;
        }
        int childCount = qfVar.c.getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = this.m0.c.getChildAt(i11);
            if (i11 < 4) {
                i10 += childAt.getMeasuredHeight();
            }
        }
        sw0 sw0Var = this.m1;
        if (i10 > 0) {
            b10 = org.telegram.messenger.q.b(childCount > 4 ? 12.0f : 0.0f, (sw0Var.getMeasuredHeight() - i10) - AndroidUtilities.dp(8.0f), 0);
        } else {
            b10 = this.n0.c.size() > 4 ? org.telegram.messenger.q.b(162.8f, sw0Var.getMeasuredHeight(), 0) : org.telegram.messenger.q.b((Math.max(1, Math.min(4, this.n0.c.size())) * 36) + 8, sw0Var.getMeasuredHeight(), 0);
        }
        if (this.m0.c.getPaddingTop() != b10) {
            this.m0.c.setTopGlowOffset(b10);
            if (this.V4 == -1 && this.m0.getVisibility() == 0 && this.m0.c.getLayoutManager() != null && (L0 = (d0Var = (s4.d0) this.m0.c.getLayoutManager()).L0()) >= 0 && (m10 = d0Var.m(L0)) != null) {
                this.V4 = L0;
                this.W4 = m10.getTop() - this.m0.c.getPaddingTop();
            }
            this.m0.c.setPadding(0, b10, 0, AndroidUtilities.dp(8.0f));
        }
    }

    public final void B() {
        ef efVar;
        org.telegram.ui.zn znVar;
        if (this.L != null || (efVar = this.K1) == null || efVar.getRight() == 0 || (znVar = this.P2) == null || !BirthdayController.isToday(znVar.a8)) {
            return;
        }
        if (MessagesController.getInstance(this.Q).getMainSettings().getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + znVar.a(), true)) {
            MessagesController.getInstance(this.Q).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + znVar.a(), false).apply();
            ci.d4 d4Var = new ci.d4(getContext(), 3);
            this.L = d4Var;
            d4Var.q(13.0f);
            this.L.p(true);
            U0();
            this.L.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            this.L.m(1.0f, -((getWidth() - AndroidUtilities.dp(12.0f)) - ((this.K1.getMeasuredWidth() / 2.0f) + (this.K1.getX() + (this.p1.getX() + this.y1.getX())))));
            addView(this.L, w7.x5.a(200.0f, 0.0f, -192.0f, 0.0f, 0.0f, -1, 48));
            ci.d4 d4Var2 = this.L;
            d4Var2.l0 = new vd(this, 12);
            d4Var2.d = 8000L;
            d4Var2.u();
        }
    }

    public final void B0() {
        this.j2 = true;
        hf hfVar = this.q0;
        if (hfVar != null) {
            hfVar.e = false;
            hfVar.dismiss();
        }
        if (this.z2) {
            this.l2 = true;
        }
        vd vdVar = new vd(this, 8);
        this.N4 = vdVar;
        AndroidUtilities.runOnUIThread(vdVar, 500L);
    }

    public final void B1(boolean z10) {
        if (this.m5 != 1 && this.Q2 > 0) {
            P();
        }
        ei.c0 c0Var = this.l0;
        if (c0Var != null) {
            c0Var.setWebView(h0());
        }
        z1(z10);
    }

    public final void C() {
        sf sfVar = this.E0;
        boolean z10 = ((sfVar != null && !TextUtils.isEmpty(sfVar.getText())) || this.z2 || this.k3 || r0()) ? false : true;
        if (z10) {
            P();
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
                qe qeVar = this.Q0;
                Float valueOf = Float.valueOf(qeVar.getX());
                HashMap hashMap = this.B0;
                hashMap.put(qeVar, valueOf);
                sf sfVar2 = this.E0;
                if (sfVar2 != null) {
                    hashMap.put(sfVar2, Float.valueOf(sfVar2.getX()));
                }
            }
        }
    }

    public final void C0() {
        sf sfVar;
        this.j2 = false;
        vd vdVar = this.N4;
        if (vdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(vdVar);
            this.N4 = null;
        }
        if (h0() && u()) {
            return;
        }
        getVisibility();
        if (!this.l2 || org.telegram.ui.ActionBar.n2.hasSheets(this.P2)) {
            return;
        }
        this.l2 = false;
        qg qgVar = this.Z2;
        if (qgVar != null) {
            qgVar.x1();
        }
        if (this.R1 == 0 && (sfVar = this.E0) != null) {
            sfVar.requestFocus();
        }
        AndroidUtilities.showKeyboard(this.E0);
        if (AndroidUtilities.usingHardwareInput || this.z2 || AndroidUtilities.isInMultiwindow) {
            return;
        }
        this.k3 = true;
        df dfVar = this.r3;
        AndroidUtilities.cancelRunOnUIThread(dfVar);
        AndroidUtilities.runOnUIThread(dfVar, 100L);
    }

    public final void C1() {
        sf sfVar = this.E0;
        boolean z10 = false;
        n1((sfVar == null || sfVar.getLineCount() <= 2 || this.E0.getText() == null || TextUtils.isEmpty(this.E0.getText().toString().trim())) ? false : true);
        sf sfVar2 = this.E0;
        if (sfVar2 != null && sfVar2.getLineCount() > 2 && this.E0.getText() != null && !TextUtils.isEmpty(this.E0.getText().toString().trim())) {
            z10 = true;
        }
        t1(z10);
    }

    public final void D() {
        org.telegram.ui.zn znVar = this.P2;
        if (znVar == null) {
            return;
        }
        I1(znVar.e, znVar.a8);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:164|(1:248)(1:168)|169|(8:171|(1:246)(1:175)|(1:245)(1:181)|182|(4:184|(1:186)(1:243)|187|(1:191))(1:244)|(1:193)(1:242)|194|(1:196))(1:247)|197|(3:199|(1:201)(1:203)|202)|204|(3:(1:207)(1:223)|(2:211|(1:221))|222)|224|(4:226|(1:240)(1:230)|231|(5:233|234|235|236|237))|241|234|235|236|237) */
    /* JADX WARN: Can't wrap try/catch for region: R(29:15|(1:17)|18|(1:154)(1:24)|25|(3:27|(1:31)|32)(2:107|(3:109|(1:113)|114)(2:115|(9:117|(1:119)(1:144)|120|(3:124|(1:126)|127)|128|(3:130|(1:136)|137)|138|(1:142)|143)(1:(20:150|(1:152)|153|34|(1:38)|39|(1:106)|42|(1:103)(1:46)|(1:102)(1:50)|(1:101)|(4:57|(1:59)(1:65)|60|(1:64))|(1:71)|(1:73)|74|(3:(1:77)(1:93)|(2:81|(1:91))|92)|94|95|96|97))))|33|34|(2:36|38)|39|(0)|104|106|42|(1:44)|103|(1:48)|102|(2:52|54)|101|(0)|(3:67|69|71)|(0)|74|(0)|94|95|96|97) */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x033d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D0(View view) {
        org.telegram.ui.zn znVar;
        TLRPC.User user;
        int measuredHeight;
        float f7;
        sf sfVar;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        ArrayList<MessageObject> arrayList;
        long j3;
        af afVar;
        y60 y60Var;
        boolean z10;
        MessagePreviewParams messagePreviewParams2;
        int i10;
        p80 F;
        boolean z11;
        boolean z12;
        sf sfVar2;
        int i11 = 0;
        if (c() || (((znVar = this.P2) != null && znVar.R3 == 5) || this.i5.f)) {
            return false;
        }
        boolean z13 = this.A4;
        int i12 = 3;
        af afVar2 = this.J0;
        org.telegram.ui.ActionBar.e6 e6Var = this.W3;
        int i13 = 2;
        boolean z14 = true;
        if (z13 || !(((sfVar = this.E0) != null && !TextUtils.isEmpty(sfVar.getText())) || znVar == null || (messagePreviewParams = znVar.f5) == null || (messages = messagePreviewParams.forwardMessages) == null || (arrayList = messages.messages) == null || arrayList.isEmpty())) {
            boolean z15 = znVar != null && UserObject.isUserSelf(znVar.i());
            if (this.O0 == null) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(this.O2, e6Var);
                this.O0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                this.O0.setOnTouchListener(new nf(this));
                this.O0.setDispatchKeyEventListener(new de(this));
                this.O0.setShownFromBottom(false);
                boolean z16 = znVar != null && znVar.G6();
                boolean z17 = !z15 && (this.G0 <= 0 || c());
                if (z16) {
                    boolean z18 = !z17;
                    org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, getContext(), this.W3, true, z18);
                    this.G4 = f1Var;
                    if (z15) {
                        f7 = 196.0f;
                        f1Var.g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                    } else {
                        f7 = 196.0f;
                        f1Var.g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                    }
                    this.G4.setMinimumWidth(AndroidUtilities.dp(f7));
                    this.G4.setOnClickListener(new xd(this, 11));
                    this.O0.a(this.G4, w7.x5.n(-1, 44));
                    SharedConfig.removeScheduledHint();
                    if (!z15 && this.Q2 > 0) {
                        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(0, getContext(), this.W3, true, z18);
                        this.c = f1Var2;
                        f1Var2.g(LocaleController.getString(R.string.SendWhenOnline), R.drawable.msg_online, null);
                        this.c.setMinimumWidth(AndroidUtilities.dp(f7));
                        this.c.setOnClickListener(new xd(this, 12));
                        this.O0.a(this.c, w7.x5.n(-1, 44));
                    }
                } else {
                    f7 = 196.0f;
                }
                if (z17) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, getContext(), this.W3, !z16, true);
                    user = null;
                    f1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                    f1Var3.setMinimumWidth(AndroidUtilities.dp(f7));
                    f1Var3.setOnClickListener(new xd(this, 13));
                    this.O0.a(f1Var3, w7.x5.n(-1, 44));
                } else {
                    user = null;
                }
                this.O0.setupRadialSelectors(g0(org.telegram.ui.ActionBar.i6.I5));
                of ofVar = new of(this, this.O0);
                this.N0 = ofVar;
                ofVar.b = false;
                ofVar.setAnimationStyle(R.style.PopupContextAnimation2);
                this.N0.setOutsideTouchable(true);
                this.N0.setClippingEnabled(true);
                this.N0.setInputMethodMode(2);
                this.N0.setSoftInputMode(0);
                this.N0.getContentView().setFocusableInTouchMode(true);
                SharedConfig.removeScheduledOrNoSoundHint();
                qg qgVar = this.Z2;
                if (qgVar != null) {
                    qgVar.u2();
                }
            } else {
                user = null;
            }
            org.telegram.ui.ActionBar.f1 f1Var4 = this.G4;
            if (f1Var4 != null) {
                f1Var4.setVisibility(this.O ? 8 : 0);
            }
            if (this.c != null) {
                TLRPC.User i14 = znVar == null ? user : znVar.i();
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
                    afVar2.invalidate();
                    view.performHapticFeedback(3, 2);
                    return true;
                }
            }
            measuredHeight = (iArr[1] - this.O0.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            this.N0.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.O0.getMeasuredWidth()), measuredHeight);
            this.N0.b();
            afVar2.invalidate();
            view.performHapticFeedback(3, 2);
            return true;
        }
        pf pfVar = this.L0;
        if (pfVar != null) {
            pfVar.h(false);
        }
        AndroidUtilities.cancelRunOnUIThread(this.F4);
        pf pfVar2 = new pf(this, getContext(), e6Var, i11);
        this.L0 = pfVar2;
        pfVar2.setOnDismissListener(new b1(this, i12));
        boolean z19 = (this.d3 == null && ((sfVar2 = this.E0) == null || TextUtils.isEmpty(sfVar2.getText()))) ? false : true;
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
            afVar = afVar2;
        } else {
            j3 = 0;
            if (this.b3 != null) {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.id = 0;
                tL_message2.out = true;
                afVar = afVar2;
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
                afVar = afVar2;
                if (z19) {
                    TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                    tL_message3.id = 0;
                    tL_message3.out = true;
                    tL_message3.peer_id = MessagesController.getInstance(this.Q).getPeer(this.Q2);
                    tL_message3.from_id = MessagesController.getInstance(this.Q).getPeer(UserConfig.getInstance(this.Q).getClientUserId());
                    sf sfVar3 = this.E0;
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(sfVar3 == null ? "" : sfVar3.getTextToUse())};
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
                        if (znVar != null && (messagePreviewParams2 = znVar.f5) != null && messagePreviewParams2.hasMedia) {
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
                } else if (znVar != null && (y60Var = znVar.b3) != null && y60Var.getTextureView() != null) {
                    pf pfVar3 = this.L0;
                    TextureView textureView = znVar.b3.getTextureView();
                    pfVar3.getClass();
                    if (textureView != null) {
                        pfVar3.l0 = new RectF();
                        int[] iArr2 = new int[2];
                        textureView.getLocationOnScreen(iArr2);
                        pfVar3.l0.set(iArr2[0], iArr2[1], textureView.getWidth() + r9, textureView.getHeight() + iArr2[1]);
                    }
                    z10 = true;
                    this.L0.q(arrayList2);
                    i10 = 4;
                    if (z19 && this.b3 == null) {
                        pf pfVar4 = this.L0;
                        sf sfVar4 = this.E0;
                        d dVar = new d(this, i10);
                        fe feVar = new fe(this, i13);
                        pfVar4.S = sfVar4;
                        pfVar4.U = dVar;
                        pfVar4.V = feVar;
                    }
                    this.L0.r(afVar, true, new ai.k3(i10, this, z19));
                    if ((!z19 || z10) && this.Q2 >= j3) {
                        this.L0.d(znVar);
                        this.L0.o(this.S4);
                    }
                    F = p80.F(this, e6Var, afVar);
                    z11 = znVar == null && UserObject.isUserSelf(znVar.i());
                    z12 = znVar == null && znVar.G6();
                    if (!z11 || (this.G0 > 0 && !c())) {
                        z14 = false;
                    }
                    if (z12) {
                        F.c(R.drawable.msg_calendar2, LocaleController.getString(z11 ? R.string.SetReminder : R.string.ScheduleMessage), new vd(this, 18), false);
                        if (!z11 && this.Q2 > j3) {
                            F.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new vd(this, 19), false);
                            this.c = F.y();
                        }
                    }
                    if (znVar != null && this.Z2 != null && ChatObject.isMonoForum(znVar.e)) {
                        F.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new vd(this, 17), false);
                    }
                    if (z14) {
                        F.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ce(this, z19, i13), false);
                    }
                    F.Y();
                    if (this.c != null) {
                        TLRPC.User i15 = znVar == null ? null : znVar.i();
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
            pf pfVar42 = this.L0;
            sf sfVar42 = this.E0;
            d dVar2 = new d(this, i10);
            fe feVar2 = new fe(this, i13);
            pfVar42.S = sfVar42;
            pfVar42.U = dVar2;
            pfVar42.V = feVar2;
        }
        this.L0.r(afVar, true, new ai.k3(i10, this, z19));
        if (!z19) {
        }
        this.L0.d(znVar);
        this.L0.o(this.S4);
        F = p80.F(this, e6Var, afVar);
        if (znVar == null) {
        }
        if (znVar == null) {
        }
        if (!z11) {
        }
        z14 = false;
        if (z12) {
        }
        if (znVar != null) {
            F.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new vd(this, 17), false);
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

    public final void D1() {
        float f7 = this.r * this.h;
        qe qeVar = this.Q0;
        qeVar.setScaleX(f7);
        qeVar.setScaleY(this.r * this.h);
        qeVar.setAlpha(this.s * this.n);
    }

    public final void E(boolean z10) {
        MessageObject messageObject;
        boolean z11 = this.Q2 < 0 && this.X3 && this.Z1 == null && (yf.u.g(this.Q).e(getEditText() != null ? getEditText().toString() : null, this.X4) > 0 || ((messageObject = this.T2) != null && messageObject.isEphemeral()));
        me.b bVar = this.i5;
        boolean z12 = bVar.f != z11;
        bVar.a(z11, z10);
        af afVar = this.J0;
        if (afVar != null) {
            afVar.v = z11;
            afVar.invalidate();
        }
        if (z12) {
            I(z10);
        }
    }

    public final void E0() {
        int height = this.m1.getHeight();
        if (!this.z2) {
            height -= this.A2;
        }
        qg qgVar = this.Z2;
        if (qgVar != null) {
            qgVar.l2(height);
        }
        if (this.G1 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
            me.b bVar = this.g5;
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

    public final void E1(boolean z10) {
        boolean z11;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        MessageObject messageObject;
        TLRPC.ReplyMarkup replyMarkup;
        TLRPC.ReplyMarkup replyMarkup2;
        sf sfVar = this.E0;
        if (sfVar == null) {
            return;
        }
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            sfVar.setHintText(charSequence, z10);
            this.E0.setHintText2(this.f, z10);
            return;
        }
        boolean z12 = false;
        if (!this.z0 && !p0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d " + LocaleController.getString("PlainTextRestrictedHint", R.string.PlainTextRestrictedHint));
            spannableStringBuilder.setSpan(new er(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
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
        Q1();
        org.telegram.ui.zn znVar = this.P2;
        boolean z13 = znVar != null && znVar.R3 == 8 && znVar.T3;
        long sendPaidMessagesStars = znVar != null ? znVar.getMessagesController().getSendPaidMessagesStars(znVar.a()) : 0L;
        if (sendPaidMessagesStars > 0) {
            sendPaidMessagesStars *= getMessagesCount();
        }
        int i11 = znVar != null ? znVar.R3 : -1;
        if (i11 == 9) {
            this.E0.setHintText(LocaleController.getString(R.string.WelcomeMessageEnter));
            return;
        }
        if (i11 == 5) {
            if ("hello".equalsIgnoreCase(znVar.Q3)) {
                this.E0.setHintText(LocaleController.getString(R.string.BusinessGreetingEnter));
                return;
            } else if ("away".equalsIgnoreCase(znVar.Q3)) {
                this.E0.setHintText(LocaleController.getString(R.string.BusinessAwayEnter));
                return;
            } else {
                this.E0.setHintText(LocaleController.getString(R.string.BusinessRepliesEnter));
                return;
            }
        }
        er[] erVarArr = this.O4;
        if (z13) {
            this.E0.setHintText(sendPaidMessagesStars > 0 ? yh.p7.R0(LocaleController.formatString(R.string.SuggestPostForStars, LocaleController.formatNumber((int) sendPaidMessagesStars, ','), erVarArr)) : LocaleController.formatString(R.string.SuggestPostForFree, new Object[0]));
            er erVar = erVarArr[0];
            if (erVar != null) {
                erVar.spaceScaleX = 0.9f;
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
            this.E0.setHintText(yh.p7.W0(false, LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber((int) sendPaidMessagesStars, ',')), erVarArr));
            er erVar2 = erVarArr[0];
            if (erVar2 != null) {
                erVar2.spaceScaleX = 0.9f;
                return;
            }
            return;
        }
        if (this.X0 && (messageObject = this.m2) != null && (replyMarkup = messageObject.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
            this.E0.setHintText(this.m2.messageOwner.reply_markup.placeholder, z10);
            return;
        }
        if (znVar != null && znVar.A9()) {
            MessageObject messageObject3 = this.U2;
            if (messageObject3 != null && (tL_forumTopic = messageObject3.replyToForumTopic) != null && (str2 = tL_forumTopic.title) != null) {
                this.E0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str2), z10);
                return;
            }
            TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.Q).getTopicsController().findTopic(znVar.e.id, 1L);
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
        if (user != null && user.bot_forum_view && !user.bot_forum_can_manage_topics && znVar != null && !znVar.h4) {
            this.E0.setHintText(LocaleController.getString(R.string.SendBotNoThread));
            return;
        }
        if (znVar != null && znVar.K9() && !znVar.h4) {
            if (znVar.X3 == null || !znVar.g4) {
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

    public void F0() {
        if ((h0() && u()) || org.telegram.ui.ActionBar.n2.hasSheets(this.P2)) {
            return;
        }
        qg qgVar = this.Z2;
        if (qgVar != null) {
            qgVar.x1();
        }
        sf sfVar = this.E0;
        if (sfVar == null || AndroidUtilities.showKeyboard(sfVar)) {
            return;
        }
        this.E0.clearFocus();
        this.E0.requestFocus();
    }

    public final void F1(int i10) {
        ImageView imageView;
        cf cfVar;
        cf cfVar2;
        hg.l lVar;
        this.P4 = i10;
        if (this.E0 != null) {
            MessageObject messageObject = this.Z1;
            if (messageObject == null || messageObject.needResendWhenEdit()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E0.getLayoutParams();
                int i11 = layoutParams.rightMargin;
                boolean z10 = this.A4;
                af afVar = this.J0;
                if (z10 && this.l5) {
                    layoutParams.rightMargin = Math.max(0, afVar.l() - AndroidUtilities.dp(44.0f)) + AndroidUtilities.dp(this.v4 ? 50.0f : 2.0f);
                } else if (i10 == 1 || i10 == 2) {
                    ef efVar = this.x1;
                    if (efVar == null || efVar.getVisibility() != 0 || (cfVar2 = this.J1) == null || cfVar2.getVisibility() != 0 || (lVar = this.r1) == null || lVar.getVisibility() != 0) {
                        ef efVar2 = this.x1;
                        if ((efVar2 == null || efVar2.getVisibility() != 0) && (((imageView = this.I1) == null || imageView.getVisibility() != 0) && ((cfVar = this.J1) == null || cfVar.getTag() == null))) {
                            layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                        } else {
                            layoutParams.rightMargin = AndroidUtilities.dp(98.0f);
                        }
                    } else {
                        layoutParams.rightMargin = AndroidUtilities.dp(146.0f);
                    }
                } else {
                    cf cfVar3 = this.J1;
                    if (cfVar3 == null || cfVar3.getTag() == null) {
                        layoutParams.rightMargin = AndroidUtilities.dp(2.0f);
                    } else {
                        layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                    }
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, afVar.l() - AndroidUtilities.dp(44.0f)));
                af afVar2 = this.F1;
                if (afVar2 != null && afVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.F1.l() - AndroidUtilities.dp(44.0f)));
                }
                if (i11 != layoutParams.rightMargin) {
                    this.E0.setLayoutParams(layoutParams);
                }
                ne neVar = this.e1;
                if (neVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) neVar.getLayoutParams();
                    layoutParams2.rightMargin = this.Z1 == null ? org.telegram.messenger.q.b(44.0f, afVar.l(), 0) : 0;
                    this.e1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final void G() {
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
        i1(z12, false);
    }

    public final void G0() {
        if (h0() && u()) {
            return;
        }
        org.telegram.ui.zn znVar = this.P2;
        if (org.telegram.ui.ActionBar.n2.hasSheets(znVar)) {
            return;
        }
        r1((AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || (znVar != null && znVar.isInBubbleMode()) || this.j2) ? 0 : 2, 0, true, true);
        qg qgVar = this.Z2;
        if (qgVar != null) {
            qgVar.x1();
        }
        sf sfVar = this.E0;
        if (sfVar != null) {
            sfVar.requestFocus();
        }
        AndroidUtilities.showKeyboard(this.E0);
        if (this.j2) {
            this.l2 = true;
            return;
        }
        if (AndroidUtilities.usingHardwareInput || this.z2 || AndroidUtilities.isInMultiwindow) {
            return;
        }
        if (znVar == null || !znVar.isInBubbleMode()) {
            this.k3 = true;
            gg ggVar = this.U0;
            if (ggVar != null) {
                ggVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
            }
            df dfVar = this.r3;
            AndroidUtilities.cancelRunOnUIThread(dfVar);
            AndroidUtilities.runOnUIThread(dfVar, 100L);
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
    public final void G1(boolean z10) {
        boolean z11;
        ci.d4 d4Var;
        TLRPC.UserFull userFull = getParentFragment() == null ? null : getParentFragment().a8;
        TLRPC.UserFull userFull2 = MessagesController.getInstance(this.Q).getUserFull(UserConfig.getInstance(this.Q).getClientUserId());
        TLRPC.User i10 = getParentFragment() != null ? getParentFragment().i() : null;
        boolean premiumPurchaseBlocked = MessagesController.getInstance(this.Q).premiumPurchaseBlocked();
        org.telegram.ui.zn znVar = this.P2;
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
            if (znVar != null && znVar.R3 == 0) {
                z11 = true;
                if (!z11 && (d4Var = this.L) != null) {
                    d4Var.e(true);
                }
                if (z11 && this.K1 == null) {
                    return;
                }
                if (this.K1 == null && znVar != null) {
                    ef efVar = new ef(this, getContext(), 0);
                    this.K1 = efVar;
                    efVar.setImageResource(R.drawable.msg_input_gift);
                    this.K1.setColorFilter(new PorterDuffColorFilter(g0(org.telegram.ui.ActionBar.i6.Wk), PorterDuff.Mode.MULTIPLY));
                    this.K1.setVisibility(8);
                    this.K1.setContentDescription(LocaleController.getString(R.string.GiftPremium));
                    this.K1.setScaleType(ImageView.ScaleType.CENTER);
                    this.K1.setBackground(org.telegram.ui.ActionBar.i6.g0(g0(org.telegram.ui.ActionBar.i6.i6), 1, -1));
                    this.p1.addView(this.K1, 0, w7.x5.e(44, 44, 21));
                    this.K1.setOnClickListener(new xd(this, 9));
                }
                AndroidUtilities.updateViewVisibilityAnimated(this.K1, z11, 1.0f, true, 1.0f, z10, new td(this, 0));
                if (z11) {
                    return;
                }
                B();
                return;
            }
        }
        z11 = false;
        if (!z11) {
            d4Var.e(true);
        }
        if (z11) {
        }
        if (this.K1 == null) {
            ef efVar2 = new ef(this, getContext(), 0);
            this.K1 = efVar2;
            efVar2.setImageResource(R.drawable.msg_input_gift);
            this.K1.setColorFilter(new PorterDuffColorFilter(g0(org.telegram.ui.ActionBar.i6.Wk), PorterDuff.Mode.MULTIPLY));
            this.K1.setVisibility(8);
            this.K1.setContentDescription(LocaleController.getString(R.string.GiftPremium));
            this.K1.setScaleType(ImageView.ScaleType.CENTER);
            this.K1.setBackground(org.telegram.ui.ActionBar.i6.g0(g0(org.telegram.ui.ActionBar.i6.i6), 1, -1));
            this.p1.addView(this.K1, 0, w7.x5.e(44, 44, 21));
            this.K1.setOnClickListener(new xd(this, 9));
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.K1, z11, 1.0f, true, 1.0f, z10, new td(this, 0));
        if (z11) {
        }
    }

    @Override // org.telegram.ui.Components.rw0
    public final void H(int i10, boolean z10) {
        MessageObject messageObject;
        sf sfVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z11;
        int i11;
        int i12;
        ph.f fVar;
        if (this.R1 != 0) {
            this.L2 = i10;
            this.M2 = z10;
            this.z2 = i10 > 0;
            C();
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
        boolean r02 = r0();
        sw0 sw0Var = this.m1;
        org.telegram.ui.zn znVar = this.P2;
        if (r02) {
            int i13 = z10 ? this.y2 : this.x2;
            if (znVar != null && znVar.getParentLayout() != null) {
                i13 -= ((ActionBarLayout) znVar.getParentLayout()).v(false);
            }
            if (this.f2 == 1) {
                dg dgVar = this.H1;
                if (!dgVar.f) {
                    i13 = Math.min(dgVar.getKeyboardHeight(), i13);
                }
            }
            int i14 = this.f2;
            ViewGroup viewGroup = i14 == 0 ? this.U0 : i14 == 1 ? this.H1 : null;
            dg dgVar2 = this.H1;
            if (dgVar2 != null) {
                dgVar2.setPanelHeight(i13);
                ph.f fVar2 = this.d5;
                if (fVar2 != null && i13 > 0 && this.f2 == 1) {
                    ((ph.i) fVar2).h(i13);
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
                    if (sw0Var != null) {
                        int i15 = this.A2;
                        this.A2 = layoutParams.height;
                        sw0Var.requestLayout();
                        E0();
                        if (this.i2 && !this.z2 && i15 != this.A2 && L0()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.V0 = animatorSet;
                            if (this.d5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.A2 - i15, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, this.A2 - i15, 0.0f));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new bf(this, 10));
                            AndroidUtilities.runOnUIThread(this.Y3, 50L);
                            this.L3.lock();
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
        C();
        if (this.z2 && r0() && this.B3 == null) {
            r1(0, this.f2, true, true);
        } else if (!this.z2 && !r0() && (messageObject = this.m2) != null && this.T2 != messageObject && !h0() && !u() && !org.telegram.ui.ActionBar.n2.hasSheets(znVar) && (((sfVar = this.E0) == null || TextUtils.isEmpty(sfVar.getText())) && (tL_replyKeyboardMarkup = this.n2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.p1 p1Var = sw0Var.H;
            if (p1Var.f) {
                p1Var.j();
            } else {
                p1Var.v = true;
            }
            r1(1, 1, false, true);
        }
        if (this.A2 != 0 && !(z11 = this.z2) && z11 != z12 && !r0()) {
            this.A2 = 0;
            sw0Var.requestLayout();
        }
        if (this.z2 && this.k3) {
            this.k3 = false;
            if (this.p3) {
                this.p3 = false;
                this.H1.setButtons(this.n2);
            }
            AndroidUtilities.cancelRunOnUIThread(this.r3);
        }
        E0();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H0() {
        org.telegram.ui.zn znVar;
        Editable editable;
        ii.e2 e2Var;
        CharSequence[] charSequenceArr;
        ArrayList<TLRPC.MessageEntity> entities;
        if (this.E0 == null || (znVar = this.P2) == null || !MessagesController.getInstance(this.Q).richEditorAvailable()) {
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
                } catch (Exception e7) {
                    FileLog.e(e7);
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
                    e2Var2.L = new vd(this, 15);
                    e2Var = e2Var2;
                }
            }
            editable = text;
            ii.e2 e2Var22 = new ii.e2(editable);
            if (editable == text) {
            }
            e2Var22.L = new vd(this, 15);
            e2Var = e2Var22;
        }
        e2Var.setResourceProvider(this.W3);
        e2Var.J = znVar;
        e2Var.s = znVar.S;
        e2Var.v = znVar.Y;
        e2Var.K = new vd(this, 16);
        znVar.presentFragment(e2Var);
    }

    public final void H1() {
        sf sfVar = this.E0;
        if (sfVar != null) {
            sfVar.setTranslationX(this.H + this.G);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:498:0x0820, code lost:
    
        if (org.telegram.messenger.ChatObject.canSendRoundVideo(r5) == false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0823, code lost:
    
        r17 = 0.5f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x082e, code lost:
    
        if (r2.voice_messages_forbidden != false) goto L289;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0ee4  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0d46  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0d70  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0887  */
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
    public final void I(boolean z10) {
        af afVar;
        ImageView imageView;
        String str;
        xe xeVar;
        int i10;
        boolean z11;
        AnimatorSet animatorSet;
        ?? r14;
        ImageView imageView2;
        boolean z12;
        ef efVar;
        ef efVar2;
        AnimatorSet animatorSet2;
        int i11;
        float f7;
        ef efVar3;
        AnimatorSet animatorSet3;
        ImageView imageView3;
        int i12;
        boolean z13;
        ?? r52;
        ?? r142;
        if (this.Z1 != null || this.F2) {
            return;
        }
        boolean z14 = this.j2 ? false : z10;
        Q1();
        sf sfVar = this.E0;
        CharSequence trimmedString = sfVar == null ? "" : AndroidUtilities.getTrimmedString(sfVar.getTextToUse());
        int i13 = this.G0;
        af afVar2 = this.J0;
        me.b bVar = this.i5;
        me meVar = this.a4;
        xe xeVar2 = this.Z0;
        Property property = View.SCALE_X;
        Property property2 = View.SCALE_Y;
        Property property3 = View.ALPHA;
        org.telegram.ui.yd ydVar = this.p1;
        ye yeVar = this.b1;
        yg ygVar = this.F0;
        hg.l lVar = this.r1;
        boolean z15 = z14;
        ImageView imageView4 = this.P0;
        CharSequence charSequence = trimmedString;
        if (i13 <= 0 || i13 == Integer.MAX_VALUE || c() || bVar.f) {
            int length = charSequence.length();
            me.b bVar2 = this.h5;
            if (length > 0 || this.H2 || this.D1 || this.b3 != null || this.e3 != null) {
                afVar = afVar2;
            } else {
                afVar = afVar2;
                if ((this.G0 != Integer.MAX_VALUE || c() || bVar.f) && ((!this.l5 || getStarsPrice() <= 0) && !bVar2.f)) {
                    if (this.U0 == null || !this.W0 || (!(this.x3 || (this.y3 && this.R1 == 2)) || AndroidUtilities.isInMultiwindow || this.l5)) {
                        if (getSendButtonInternal().getVisibility() == 0 || imageView4.getVisibility() == 0 || (((efVar3 = this.S0) != null && efVar3.getVisibility() == 0) || ygVar.getVisibility() == 0)) {
                            if (!z15) {
                                ygVar.setScaleX(0.1f);
                                ygVar.setScaleY(0.1f);
                                ygVar.setAlpha(0.0f);
                                setSlowModeButtonVisible(false);
                                getSendButtonInternal().setScaleX(0.1f);
                                getSendButtonInternal().setScaleY(0.1f);
                                getSendButtonInternal().setAlpha(0.0f);
                                getSendButtonInternal().setVisibility(8);
                                imageView4.setScaleX(0.1f);
                                imageView4.setScaleY(0.1f);
                                imageView4.setAlpha(0.0f);
                                imageView4.setVisibility(8);
                                ef efVar4 = this.S0;
                                if (efVar4 != null) {
                                    efVar4.setScaleX(0.1f);
                                    this.S0.setScaleY(0.1f);
                                    this.S0.setAlpha(0.0f);
                                    this.S0.setVisibility(8);
                                }
                                yeVar.setScaleX(1.0f);
                                yeVar.setScaleY(1.0f);
                                yeVar.setAlpha(1.0f);
                                xeVar2.setVisibility(0);
                                if (ydVar != null) {
                                    if (getVisibility() == 0) {
                                        this.Z2.B2();
                                    }
                                    this.E = 1.0f;
                                    y1();
                                    ydVar.setScaleX(1.0f);
                                    ydVar.setVisibility(0);
                                    F1(1);
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
                                qg qgVar = this.Z2;
                                if (qgVar != null && qgVar.I0()) {
                                    Y();
                                }
                                if (this.J1 != null) {
                                    qg qgVar2 = this.Z2;
                                    if (qgVar2 != null && qgVar2.I0()) {
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
                                if (ydVar != null) {
                                    if (ydVar.getVisibility() != 0) {
                                        ydVar.setVisibility(0);
                                        this.E = 0.0f;
                                        y1();
                                        ydVar.setScaleX(0.0f);
                                    }
                                    this.s2 = new AnimatorSet();
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(ObjectAnimator.ofFloat(ydVar, meVar, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(ydVar, (Property<org.telegram.ui.yd, Float>) property, 1.0f));
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
                                    qg qgVar3 = this.Z2;
                                    boolean z16 = qgVar3 != null && qgVar3.I0();
                                    this.L1 = false;
                                    if (z16) {
                                        Y();
                                    }
                                    cf cfVar = this.J1;
                                    if (cfVar != null) {
                                        if (z16) {
                                            cfVar.setVisibility(0);
                                            this.J1.setTag(1);
                                            this.J1.setPivotX(AndroidUtilities.dp(44.0f));
                                            arrayList.add(ObjectAnimator.ofFloat(this.J1, (Property<cf, Float>) property3, 1.0f));
                                            arrayList.add(ObjectAnimator.ofFloat(this.J1, (Property<cf, Float>) property, 1.0f));
                                            arrayList.add(o(0.0f));
                                            ImageView imageView5 = this.I1;
                                            if (imageView5 != null && imageView5.getVisibility() == 0) {
                                                imageView5.setVisibility(8);
                                            }
                                        } else {
                                            cfVar.setAlpha(1.0f);
                                            this.J1.setScaleX(1.0f);
                                            this.J1.setScaleY(1.0f);
                                            this.J1.setTranslationX(0.0f);
                                        }
                                    }
                                    this.s2.playTogether(arrayList);
                                    this.s2.setDuration(100L);
                                    this.s2.addListener(new bf(this, 6));
                                    this.s2.start();
                                    F1(1);
                                    if (getVisibility() == 0) {
                                        this.Z2.B2();
                                    }
                                }
                                xeVar2.setVisibility(0);
                                this.r2 = new AnimatorSet();
                                this.v2 = 2;
                                ArrayList arrayList2 = new ArrayList();
                                org.telegram.ui.zn znVar = this.P2;
                                TLRPC.Chat g10 = znVar == null ? null : znVar.g();
                                TLRPC.UserFull B8 = znVar == null ? this.K : znVar.B8();
                                if (g10 != null) {
                                    if (!ChatObject.canSendVoice(g10)) {
                                    }
                                    f7 = 1.0f;
                                } else if (B8 == null) {
                                    i11 = 1;
                                    f7 = 1.0f;
                                    float[] fArr = new float[i11];
                                    fArr[0] = 1.0f;
                                    arrayList2.add(ObjectAnimator.ofFloat(yeVar, (Property<ye, Float>) property, fArr));
                                    float[] fArr2 = new float[i11];
                                    fArr2[0] = 1.0f;
                                    arrayList2.add(ObjectAnimator.ofFloat(yeVar, (Property<ye, Float>) property2, fArr2));
                                    float[] fArr3 = new float[i11];
                                    fArr3[0] = f7;
                                    arrayList2.add(ObjectAnimator.ofFloat(yeVar, (Property<ye, Float>) property3, fArr3));
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
                                        ef efVar5 = this.S0;
                                        if (efVar5 != null && efVar5.getVisibility() == 0) {
                                            ef efVar6 = this.S0;
                                            float[] fArr7 = new float[i11];
                                            fArr7[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(efVar6, (Property<ef, Float>) property, fArr7));
                                            ef efVar7 = this.S0;
                                            float[] fArr8 = new float[i11];
                                            fArr8[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(efVar7, (Property<ef, Float>) property2, fArr8));
                                            ef efVar8 = this.S0;
                                            float[] fArr9 = new float[i11];
                                            fArr9[0] = 0.0f;
                                            arrayList2.add(ObjectAnimator.ofFloat(efVar8, (Property<ef, Float>) property3, fArr9));
                                        } else if (ygVar.getVisibility() == 0) {
                                            float[] fArr10 = new float[i11];
                                            fArr10[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(ygVar, (Property<yg, Float>) property, fArr10));
                                            float[] fArr11 = new float[i11];
                                            fArr11[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(ygVar, (Property<yg, Float>) property2, fArr11));
                                            float[] fArr12 = new float[i11];
                                            fArr12[0] = 0.0f;
                                            arrayList2.add(ObjectAnimator.ofFloat(ygVar, (Property<yg, Float>) property3, fArr12));
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
                                    this.r2.addListener(new bf(this, 7));
                                    this.r2.start();
                                }
                                i11 = 1;
                                float[] fArr16 = new float[i11];
                                fArr16[0] = 1.0f;
                                arrayList2.add(ObjectAnimator.ofFloat(yeVar, (Property<ye, Float>) property, fArr16));
                                float[] fArr22 = new float[i11];
                                fArr22[0] = 1.0f;
                                arrayList2.add(ObjectAnimator.ofFloat(yeVar, (Property<ye, Float>) property2, fArr22));
                                float[] fArr32 = new float[i11];
                                fArr32[0] = f7;
                                arrayList2.add(ObjectAnimator.ofFloat(yeVar, (Property<ye, Float>) property3, fArr32));
                                if (imageView4.getVisibility() != 0) {
                                }
                                this.r2.playTogether(arrayList2);
                                this.r2.setDuration(150L);
                                this.r2.addListener(new bf(this, 7));
                                this.r2.start();
                            }
                        }
                    } else if (!z15) {
                        ygVar.setScaleX(0.1f);
                        ygVar.setScaleY(0.1f);
                        ygVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        getSendButtonInternal().setVisibility(8);
                        imageView4.setScaleX(0.1f);
                        imageView4.setScaleY(0.1f);
                        imageView4.setAlpha(0.0f);
                        imageView4.setVisibility(8);
                        yeVar.setScaleX(0.1f);
                        yeVar.setScaleY(0.1f);
                        yeVar.setAlpha(0.0f);
                        xeVar2.setVisibility(8);
                        T();
                        this.S0.setScaleX(1.0f);
                        this.S0.setScaleY(1.0f);
                        this.S0.setAlpha(1.0f);
                        this.S0.setVisibility(0);
                        if (ydVar != null) {
                            if (getVisibility() == 0) {
                                this.Z2.B2();
                            }
                            ydVar.setVisibility(0);
                            F1(1);
                        }
                        this.L1 = false;
                        qg qgVar4 = this.Z2;
                        boolean z17 = qgVar4 != null && qgVar4.I0();
                        if (z17) {
                            Y();
                        }
                        cf cfVar2 = this.J1;
                        if (cfVar2 != null) {
                            if (z17) {
                                cfVar2.setVisibility(0);
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
                        if (ydVar != null && this.w2 == 0) {
                            ydVar.setVisibility(0);
                            this.s2 = new AnimatorSet();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(ObjectAnimator.ofFloat(ydVar, meVar, 1.0f));
                            arrayList3.add(ObjectAnimator.ofFloat(ydVar, (Property<org.telegram.ui.yd, Float>) property, 1.0f));
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
                            qg qgVar5 = this.Z2;
                            boolean z18 = qgVar5 != null && qgVar5.I0();
                            this.L1 = false;
                            if (z18) {
                                Y();
                            }
                            cf cfVar3 = this.J1;
                            if (cfVar3 != null) {
                                cfVar3.setScaleY(1.0f);
                                if (z18) {
                                    this.J1.setVisibility(0);
                                    this.J1.setTag(1);
                                    this.J1.setPivotX(AndroidUtilities.dp(44.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.J1, (Property<cf, Float>) property3, 1.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.J1, (Property<cf, Float>) property, 1.0f));
                                    arrayList3.add(o(0.0f));
                                } else {
                                    this.J1.setAlpha(1.0f);
                                    this.J1.setScaleX(1.0f);
                                    this.J1.setTranslationX(0.0f);
                                }
                            }
                            this.s2.playTogether(arrayList3);
                            this.s2.setDuration(100L);
                            this.s2.addListener(new bf(this, 4));
                            this.s2.start();
                            F1(1);
                            if (getVisibility() == 0) {
                                this.Z2.B2();
                            }
                        }
                        T();
                        this.S0.setVisibility(0);
                        this.r2 = new AnimatorSet();
                        this.v2 = 4;
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(ObjectAnimator.ofFloat(this.S0, (Property<ef, Float>) property, 1.0f));
                        arrayList4.add(ObjectAnimator.ofFloat(this.S0, (Property<ef, Float>) property2, 1.0f));
                        arrayList4.add(ObjectAnimator.ofFloat(this.S0, (Property<ef, Float>) property3, 1.0f));
                        if (imageView4.getVisibility() == 0) {
                            arrayList4.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property2, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property3, 0.0f));
                        } else if (xeVar2.getVisibility() == 0) {
                            arrayList4.add(ObjectAnimator.ofFloat(yeVar, (Property<ye, Float>) property, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(yeVar, (Property<ye, Float>) property2, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(yeVar, (Property<ye, Float>) property3, 0.0f));
                        } else if (ygVar.getVisibility() == 0) {
                            arrayList4.add(ObjectAnimator.ofFloat(ygVar, (Property<yg, Float>) property, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(ygVar, (Property<yg, Float>) property2, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(ygVar, (Property<yg, Float>) property3, 0.0f));
                        } else {
                            arrayList4.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property2, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property3, 0.0f));
                        }
                        this.r2.playTogether(arrayList4);
                        this.r2.setDuration(250L);
                        this.r2.addListener(new bf(this, 5));
                        this.r2.start();
                    }
                }
            }
            sf sfVar2 = this.E0;
            String caption = sfVar2 == null ? null : sfVar2.getCaption();
            boolean z19 = caption != null && (getSendButtonInternal().getVisibility() == 0 || ((efVar2 = this.S0) != null && efVar2.getVisibility() == 0));
            boolean z20 = caption == null && (imageView4.getVisibility() == 0 || ((efVar = this.S0) != null && efVar.getVisibility() == 0));
            int g02 = (this.G0 != Integer.MAX_VALUE || c() || bVar.f) ? g0(org.telegram.ui.ActionBar.i6.Yd) : g0(org.telegram.ui.ActionBar.i6.Wk);
            sf sfVar3 = this.E0;
            boolean z21 = (sfVar3 != null && (!TextUtils.isEmpty(sfVar3.getCaption()) || this.E0.isNearRightCaption(AndroidUtilities.dp(44.0f)))) || LocaleController.isRTL;
            if (g02 != this.K0) {
                this.K0 = g02;
                Drawable background = afVar.getBackground();
                int i14 = g02;
                int red = Color.red(i14);
                xeVar = xeVar2;
                int green = Color.green(i14);
                str = caption;
                int blue = Color.blue(i14);
                imageView = imageView4;
                org.telegram.ui.ActionBar.i6.C1(background, Color.argb(24, red, green, blue), true);
            } else {
                imageView = imageView4;
                str = caption;
                xeVar = xeVar2;
            }
            if (xeVar.getVisibility() != 0 && ygVar.getVisibility() != 0 && !z19 && !z20 && !bVar2.f) {
                jh.h hVar3 = this.e5;
                if (hVar3 != null) {
                    hVar3.e(0, z21, true);
                    if (lVar != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.q1;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.q1 = null;
                        }
                        ViewPropertyAnimator animate = lVar.animate();
                        float f10 = z21 ? 0.0f : 1.0f;
                        this.v1 = f10;
                        ViewPropertyAnimator duration = animate.alpha(f10).scaleX(z21 ? 0.5f : 1.0f).scaleY(z21 ? 0.5f : 1.0f).setInterpolator(hs.h).setDuration(320L);
                        this.q1 = duration;
                        duration.start();
                    }
                }
            } else {
                if (!z15) {
                    String str2 = str;
                    ImageView imageView6 = imageView;
                    yeVar.setScaleX(0.1f);
                    yeVar.setScaleY(0.1f);
                    yeVar.setAlpha(0.0f);
                    xeVar.setVisibility(8);
                    if (ygVar.getVisibility() == 0) {
                        ygVar.setScaleX(0.1f);
                        ygVar.setScaleY(0.1f);
                        ygVar.setAlpha(0.0f);
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
                    ef efVar9 = this.S0;
                    if (efVar9 == null || efVar9.getVisibility() != 0) {
                        i10 = 8;
                    } else {
                        this.S0.setScaleX(0.1f);
                        this.S0.setScaleY(0.1f);
                        this.S0.setAlpha(0.0f);
                        i10 = 8;
                        this.S0.setVisibility(8);
                    }
                    if (ydVar != null) {
                        ydVar.setVisibility(i10);
                        if (this.Z2 != null && getVisibility() == 0) {
                            this.Z2.z0();
                        }
                        F1(0);
                        jh.h hVar4 = this.e5;
                        if (hVar4 != null) {
                            hVar4.e(0, z21, true);
                            if (lVar != null) {
                                float f11 = z21 ? 0.0f : 1.0f;
                                this.v1 = f11;
                                lVar.setAlpha(f11);
                                lVar.setScaleX(z21 ? 0.5f : 1.0f);
                                lVar.setScaleY(z21 ? 0.5f : 1.0f);
                            }
                        } else if (lVar != null) {
                            this.v1 = 0.0f;
                            lVar.setAlpha(0.0f);
                            lVar.setScaleX(0.5f);
                            lVar.setScaleY(0.5f);
                        }
                    }
                    z11 = true;
                    this.L1 = true;
                    if (this.J1 != null) {
                        qg qgVar6 = this.Z2;
                        if (qgVar6 != null && qgVar6.I0()) {
                            this.J1.setVisibility(8);
                            this.J1.setTag(null);
                        }
                        this.J1.setAlpha(0.0f);
                        this.J1.setScaleX(0.0f);
                        this.J1.setScaleY(1.0f);
                        this.J1.setTranslationX(0.0f);
                    }
                    z12 = z11;
                    if (!this.A4 || (imageView3 = this.w1) == null) {
                        return;
                    }
                    if (z15) {
                        imageView3.animate().translationX(z12 ? -org.telegram.messenger.q.b(64.0f, afVar.l(), 0) : AndroidUtilities.dp(42.0f)).setDuration(320L).setInterpolator(hs.h).start();
                        return;
                    } else {
                        imageView3.setTranslationX(z12 ? -org.telegram.messenger.q.b(64.0f, afVar.l(), 0) : AndroidUtilities.dp(42.0f));
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
                if (ydVar != null) {
                    this.s2 = new AnimatorSet();
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(ObjectAnimator.ofFloat(ydVar, meVar, 0.0f));
                    arrayList5.add(ObjectAnimator.ofFloat(ydVar, (Property<org.telegram.ui.yd, Float>) property, 0.5f));
                    ViewPropertyAnimator viewPropertyAnimator5 = this.q1;
                    if (viewPropertyAnimator5 != null) {
                        viewPropertyAnimator5.cancel();
                        this.q1 = null;
                    }
                    jh.h hVar5 = this.e5;
                    if (hVar5 != null) {
                        hVar5.e(0, z21, true);
                        if (lVar != null) {
                            float f12 = z21 ? 0.0f : 1.0f;
                            this.v1 = f12;
                            arrayList5.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property3, f12));
                            arrayList5.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property, z21 ? 0.5f : 1.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property2, z21 ? 0.5f : 1.0f));
                        }
                    } else if (lVar != null) {
                        this.v1 = 0.0f;
                        arrayList5.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property3, 0.0f));
                        arrayList5.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property, 0.5f));
                        arrayList5.add(ObjectAnimator.ofFloat(lVar, (Property<hg.l, Float>) property2, 0.5f));
                    }
                    qg qgVar7 = this.Z2;
                    boolean z22 = qgVar7 != null && qgVar7.I0();
                    this.L1 = true;
                    cf cfVar4 = this.J1;
                    if (cfVar4 != null) {
                        cfVar4.setScaleY(1.0f);
                        if (z22) {
                            this.J1.setTag(null);
                            arrayList5.add(ObjectAnimator.ofFloat(this.J1, (Property<cf, Float>) property3, 0.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(this.J1, (Property<cf, Float>) property, 0.0f));
                            arrayList5.add(o(0.0f));
                        } else {
                            this.J1.setAlpha(0.0f);
                            this.J1.setScaleX(0.0f);
                            this.J1.setTranslationX(0.0f);
                        }
                    }
                    this.s2.playTogether(arrayList5);
                    this.s2.setDuration(100L);
                    this.s2.addListener(new ff(this, z22, 1));
                    this.s2.start();
                    F1(0);
                    if (this.Z2 != null && getVisibility() == 0) {
                        this.Z2.z0();
                    }
                }
                this.r2 = new AnimatorSet();
                ArrayList arrayList6 = new ArrayList();
                if (xeVar.getVisibility() == 0) {
                    r14 = 0;
                    arrayList6.add(ObjectAnimator.ofFloat(yeVar, (Property<ye, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(yeVar, (Property<ye, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(yeVar, (Property<ye, Float>) property3, 0.0f));
                } else {
                    r14 = 0;
                }
                ef efVar10 = this.S0;
                if (efVar10 != null && efVar10.getVisibility() == 0) {
                    ef efVar11 = this.S0;
                    float[] fArr17 = new float[1];
                    fArr17[r14] = 0.1f;
                    arrayList6.add(ObjectAnimator.ofFloat(efVar11, (Property<ef, Float>) property, fArr17));
                    ef efVar12 = this.S0;
                    float[] fArr18 = new float[1];
                    fArr18[r14] = 0.1f;
                    arrayList6.add(ObjectAnimator.ofFloat(efVar12, (Property<ef, Float>) property2, fArr18));
                    ef efVar13 = this.S0;
                    float[] fArr19 = new float[1];
                    fArr19[r14] = 0.0f;
                    arrayList6.add(ObjectAnimator.ofFloat(efVar13, (Property<ef, Float>) property3, fArr19));
                }
                if (ygVar.getVisibility() == 0) {
                    float[] fArr20 = new float[1];
                    fArr20[r14] = 0.1f;
                    arrayList6.add(ObjectAnimator.ofFloat(ygVar, (Property<yg, Float>) property, fArr20));
                    float[] fArr21 = new float[1];
                    fArr21[r14] = 0.1f;
                    arrayList6.add(ObjectAnimator.ofFloat(ygVar, (Property<yg, Float>) property2, fArr21));
                    float[] fArr23 = new float[1];
                    fArr23[r14] = 0.0f;
                    arrayList6.add(ObjectAnimator.ofFloat(ygVar, (Property<yg, Float>) property3, fArr23));
                }
                if (z19) {
                    arrayList6.add(p(r14));
                } else if (z20) {
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
                        arrayList6.add(p(true));
                        getSendButtonInternal().setVisibility(r14);
                    }
                    this.r2.playTogether(arrayList6);
                    this.r2.setDuration(220L);
                    this.r2.setInterpolator(hs.h);
                    this.r2.addListener(new ai.z(18, this, str));
                    this.r2.start();
                }
                imageView2 = imageView;
                if (str == null) {
                }
                this.r2.playTogether(arrayList6);
                this.r2.setDuration(220L);
                this.r2.setInterpolator(hs.h);
                this.r2.addListener(new ai.z(18, this, str));
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
        if (ygVar.getVisibility() != 0) {
            if (!z15) {
                ygVar.setScaleX(1.0f);
                ygVar.setScaleY(1.0f);
                ygVar.setAlpha(1.0f);
                setSlowModeButtonVisible(true);
                yeVar.setScaleX(0.1f);
                yeVar.setScaleY(0.1f);
                yeVar.setAlpha(0.0f);
                xeVar2.setVisibility(8);
                getSendButtonInternal().setScaleX(0.1f);
                getSendButtonInternal().setScaleY(0.1f);
                getSendButtonInternal().setAlpha(0.0f);
                getSendButtonInternal().setVisibility(8);
                imageView4.setScaleX(0.1f);
                imageView4.setScaleY(0.1f);
                imageView4.setAlpha(0.0f);
                imageView4.setVisibility(8);
                ef efVar14 = this.S0;
                if (efVar14 == null || efVar14.getVisibility() != 0) {
                    i12 = 8;
                } else {
                    this.S0.setScaleX(0.1f);
                    this.S0.setScaleY(0.1f);
                    this.S0.setAlpha(0.0f);
                    i12 = 8;
                    this.S0.setVisibility(8);
                }
                if (ydVar != null) {
                    ydVar.setVisibility(i12);
                    if (this.Z2 != null && getVisibility() == 0) {
                        this.Z2.z0();
                    }
                    z13 = false;
                    F1(0);
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
                    z13 = false;
                }
                this.L1 = z13;
                qg qgVar8 = this.Z2;
                boolean z23 = qgVar8 != null && qgVar8.I0();
                if (z23) {
                    Y();
                }
                cf cfVar5 = this.J1;
                if (cfVar5 != null) {
                    if (z23) {
                        cfVar5.setVisibility(0);
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
                if (ydVar != null) {
                    this.s2 = new AnimatorSet();
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(ObjectAnimator.ofFloat(ydVar, meVar, 0.0f));
                    arrayList7.add(ObjectAnimator.ofFloat(ydVar, (Property<org.telegram.ui.yd, Float>) property, 0.5f));
                    this.L1 = false;
                    qg qgVar9 = this.Z2;
                    boolean z24 = qgVar9 != null && qgVar9.I0();
                    if (z24) {
                        Y();
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
                    cf cfVar6 = this.J1;
                    if (cfVar6 != null) {
                        cfVar6.setScaleY(1.0f);
                        if (z24) {
                            this.J1.setVisibility(0);
                            this.J1.setTag(1);
                            this.J1.setPivotX(AndroidUtilities.dp(44.0f));
                            arrayList7.add(o(0.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.J1, (Property<cf, Float>) property3, 1.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.J1, (Property<cf, Float>) property, 1.0f));
                        } else {
                            this.J1.setTranslationX(0.0f);
                            this.J1.setAlpha(1.0f);
                            this.J1.setScaleX(1.0f);
                        }
                    }
                    this.s2.playTogether(arrayList7);
                    this.s2.setDuration(100L);
                    this.s2.addListener(new bf(this, 2));
                    this.s2.start();
                    F1(0);
                    if (this.Z2 != null && getVisibility() == 0) {
                        this.Z2.z0();
                    }
                }
                this.v2 = 5;
                this.r2 = new AnimatorSet();
                ArrayList arrayList8 = new ArrayList();
                if (xeVar2.getVisibility() == 0) {
                    r142 = 0;
                    arrayList8.add(ObjectAnimator.ofFloat(yeVar, (Property<ye, Float>) property, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(yeVar, (Property<ye, Float>) property2, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(yeVar, (Property<ye, Float>) property3, 0.0f));
                } else {
                    r142 = 0;
                }
                ef efVar15 = this.S0;
                if (efVar15 != null && efVar15.getVisibility() == 0) {
                    ef efVar16 = this.S0;
                    float[] fArr30 = new float[1];
                    fArr30[r142] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(efVar16, (Property<ef, Float>) property, fArr30));
                    ef efVar17 = this.S0;
                    float[] fArr31 = new float[1];
                    fArr31[r142] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(efVar17, (Property<ef, Float>) property2, fArr31));
                    ef efVar18 = this.S0;
                    float[] fArr33 = new float[1];
                    fArr33[r142] = 0.0f;
                    arrayList8.add(ObjectAnimator.ofFloat(efVar18, (Property<ef, Float>) property3, fArr33));
                }
                if (getSendButtonInternal().getVisibility() == 0) {
                    arrayList8.add(p(r142));
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
                arrayList8.add(ObjectAnimator.ofFloat(ygVar, (Property<yg, Float>) property, fArr37));
                float[] fArr38 = new float[1];
                fArr38[r142] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(ygVar, (Property<yg, Float>) property2, fArr38));
                float[] fArr39 = new float[1];
                fArr39[r142] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(ygVar, (Property<yg, Float>) property3, fArr39));
                setSlowModeButtonVisible(true);
                this.r2.playTogether(arrayList8);
                this.r2.setDuration(220L);
                this.r2.setInterpolator(hs.h);
                this.r2.addListener(new bf(this, 3));
                this.r2.start();
            }
        }
        afVar = afVar2;
        z12 = false;
        if (this.A4) {
        }
    }

    public final void I0(CharSequence charSequence, String str, CharSequence charSequence2) {
        org.telegram.ui.zn znVar;
        if (this.E0 == null || (znVar = this.P2) == null || !MessagesController.getInstance(this.Q).richEditorAvailable()) {
            return;
        }
        ii.e2 e2Var = new ii.e2(str);
        e2Var.h = charSequence;
        e2Var.n = charSequence2;
        e2Var.setResourceProvider(this.W3);
        e2Var.J = znVar;
        e2Var.s = znVar.S;
        e2Var.v = znVar.Y;
        e2Var.L = new le(this, 1);
        e2Var.K = new le(this, 2);
        znVar.presentFragment(e2Var);
    }

    public final void I1(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        gg ggVar;
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
            D1();
            if (!this.A0 && (ggVar = this.U0) != null) {
                ggVar.K(-this.Q2, !this.z0, !this.b);
            }
            this.x0 = ChatObject.canSendRoundVideo(chat);
            this.y0 = ChatObject.canSendVoice(chat);
        } else if (userFull != null) {
            this.a1 = userFull.voice_messages_forbidden;
            this.K = userFull;
        }
        float f7 = this.a1 ? 0.5f : 1.0f;
        xe xeVar = this.Z0;
        xeVar.setAlpha(f7);
        xeVar.invalidate();
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.a1 ? g0(org.telegram.ui.ActionBar.i6.Wk) : -1, PorterDuff.Mode.SRC_IN);
        ye yeVar = this.b1;
        yeVar.setColorFilter(porterDuffColorFilter);
        yeVar.invalidate();
        E1(false);
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

    public final void J() {
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
            vd vdVar = new vd(this, 6);
            this.U0.setLayerType(2, null);
            if (this.v) {
                this.w = vdVar;
            } else {
                AnimatorSet animatorSet2 = new AnimatorSet();
                if (this.d5 != null) {
                    animatorSet2.playTogether(ValueAnimator.ofInt(-(this.D3 - i10)), ValueAnimator.ofInt(-(this.D3 - i10)));
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofInt(this, d1Var, -(this.D3 - i10)), ObjectAnimator.ofInt(this.U0, d1Var, -(this.D3 - i10)));
                    ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new td(this, i11));
                }
                animatorSet2.setDuration(300L);
                animatorSet2.setInterpolator(hs.f);
                animatorSet2.addListener(new ai.z(21, this, vdVar));
                this.B3 = animatorSet2;
                animatorSet2.start();
            }
        } else {
            if (this.d5 == null) {
                this.U0.getLayoutParams().height = this.D3;
            }
            this.m1.requestLayout();
            sf sfVar = this.E0;
            if (sfVar != null) {
                int selectionStart = sfVar.getSelectionStart();
                int selectionEnd = this.E0.getSelectionEnd();
                sf sfVar2 = this.E0;
                sfVar2.setText(sfVar2.getText());
                this.E0.setSelection(selectionStart, selectionEnd);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            if (this.d5 != null) {
                animatorSet3.playTogether(ValueAnimator.ofInt(-(this.D3 - i10)), ValueAnimator.ofInt(-(this.D3 - i10)));
            } else {
                animatorSet3.playTogether(ObjectAnimator.ofInt(this, d1Var, -(this.D3 - i10)), ObjectAnimator.ofInt(this.U0, d1Var, -(this.D3 - i10)));
                ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new td(this, 3));
            }
            animatorSet3.setDuration(300L);
            animatorSet3.setInterpolator(hs.f);
            animatorSet3.addListener(new bf(this, 11));
            this.B3 = animatorSet3;
            this.U0.setLayerType(2, null);
            animatorSet3.start();
        }
        ph.f fVar = this.d5;
        if (fVar != null) {
            ((ph.i) fVar).h(dp);
        }
    }

    public final void J0() {
        vd vdVar = new vd(this, 28);
        if (SharedPrefsHelper.isWebViewConfirmShown(this.Q, this.Q2) || MessagesController.getInstance(this.Q).whitelistedBots.contains(Long.valueOf(this.Q2))) {
            vdVar.run();
            return;
        }
        g5.n(this.P2, MessagesController.getInstance(this.Q).getUser(Long.valueOf(this.Q2)), new ea(6, this, vdVar), new vd(this, 29));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v17 */
    public void J1(int i10, boolean z10) {
        boolean z11;
        int i11;
        char c10;
        float f7;
        int i12;
        ?? r12;
        boolean z12;
        int i13;
        int i14;
        boolean z13;
        long j3;
        int i15;
        boolean z14;
        char c11;
        float f10;
        ?? r92;
        int i16;
        float f11;
        int i17;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        bh bhVar;
        bh bhVar2;
        long j10;
        int i18;
        char c12;
        char c13;
        Property property;
        bh bhVar3 = bh.a;
        bh bhVar4 = bh.b;
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
                ug ugVar = this.O1;
                if (ugVar != null) {
                    ugVar.y.d(1, false, false);
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.Q);
                long j11 = this.Q2;
                org.telegram.ui.zn znVar = this.P2;
                property = property3;
                mediaDataController.toggleDraftVoiceOnce(j11, (znVar == null || !znVar.h4) ? 0L : znVar.d(), this.O);
                this.i1 = 0L;
            }
            V();
            this.w2 = 1;
            gg ggVar = this.U0;
            if (ggVar != null) {
                ggVar.setEnabled(false);
            }
            try {
                if (this.q2 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.q2 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            AndroidUtilities.lockOrientation(this.O2);
            qg qgVar = this.Z2;
            if (qgVar != null) {
                qgVar.g1(0);
            }
            AnimatorSet animatorSet = this.t2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.u2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            X();
            ai.x5 x5Var = this.d1;
            if (x5Var != null) {
                x5Var.setVisibility(0);
            }
            W();
            RecordCircle recordCircle2 = this.N1;
            if (recordCircle2 != null) {
                recordCircle2.M = false;
                recordCircle2.setVisibility(0);
                this.N1.setAmplitude(0.0d);
            }
            ug ugVar2 = this.O1;
            if (ugVar2 != null) {
                ugVar2.setVisibility(0);
            }
            wg wgVar = this.l1;
            if (wgVar != null) {
                wgVar.a = 1.0f;
                wgVar.b = System.currentTimeMillis();
                wgVar.r = -1L;
                wgVar.c = false;
                wgVar.e = false;
                wgVar.f.stop();
                wgVar.invalidate();
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
            v0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            Property property6 = property;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Z3, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.b4, 0.0f), ObjectAnimator.ofFloat(this.l1, (Property<wg, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.l1, (Property<wg, Float>) property6, 1.0f), ObjectAnimator.ofFloat(this.Y0, (Property<zg, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.Y0, (Property<zg, Float>) property5, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.k1, (Property<SlideTextView, Float>) property2, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.k1, (Property<SlideTextView, Float>) property5, 1.0f));
            ug ugVar3 = this.O1;
            if (ugVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ugVar3, (Property<ug, Float>) property5, 1.0f));
            }
            if (this.b1 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Z0, (Property<xe, Float>) property5, 0.0f));
            }
            ei.c0 c0Var = this.l0;
            if (c0Var != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(c0Var, (Property<ei.c0, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.l0, (Property<ei.c0, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.l0, (Property<ei.c0, Float>) property5, 0.0f));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.E0, this.d4, AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.E0, (Property<sf, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.e1, (Property<ne, Float>) property5, 1.0f));
            if (z16) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<ll0, Float>) property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<fk0, Float>) property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<fk0, Float>) property6, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<fk0, Float>) property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f1, (Property<a91, Float>) property5, 0.0f));
            }
            if (this.J1 != null) {
                animatorSet4.playTogether(o(AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.J1, (Property<cf, Float>) property5, 0.0f));
            }
            org.telegram.ui.yd ydVar = this.p1;
            if (ydVar != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(ydVar, this.c4, AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.p1, this.a4, 0.0f));
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
            if (!z16) {
                this.t2.playTogether(ObjectAnimator.ofFloat(this.N1, this.v3, 1.0f).setDuration(300L));
            }
            this.t2.addListener(new xf(this, z16));
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
                } catch (Exception e10) {
                    FileLog.e(e10);
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
            gg ggVar2 = this.U0;
            if (ggVar2 != null) {
                ggVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.t2;
            if (animatorSet5 != null) {
                z11 = animatorSet5.isRunning();
                ye yeVar = this.b1;
                if (yeVar != null) {
                    yeVar.setScaleX(1.0f);
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
            sf sfVar = this.E0;
            if (sfVar != null) {
                sfVar.setVisibility(0);
            }
            this.t2 = new AnimatorSet();
            if (z11 || i10 == 4) {
                float f12 = 0.5f;
                ye yeVar2 = this.b1;
                if (yeVar2 != null) {
                    yeVar2.setVisibility(0);
                }
                AnimatorSet animatorSet7 = this.t2;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f);
                qe qeVar = this.Q0;
                me meVar = this.b4;
                if (!this.A0) {
                    f12 = 1.0f;
                }
                animatorSet7.playTogether(ofFloat, ObjectAnimator.ofFloat(qeVar, meVar, f12), ObjectAnimator.ofFloat(this.l1, (Property<wg, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.l1, (Property<wg, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.N1, this.u3, 0.0f), ObjectAnimator.ofFloat(this.N1, this.v3, 0.0f), ObjectAnimator.ofFloat(this.Z0, (Property<xe, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.Y0, (Property<zg, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.Z0, (Property<xe, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.E0, (Property<sf, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.E0, this.d4, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                ug ugVar4 = this.O1;
                if (ugVar4 != null) {
                    i11 = 1;
                    c10 = 0;
                    this.t2.playTogether(ObjectAnimator.ofFloat(ugVar4, (Property<ug, Float>) property5, 0.0f));
                    this.O1.a();
                } else {
                    i11 = 1;
                    c10 = 0;
                }
                ei.c0 c0Var2 = this.l0;
                if (c0Var2 != null) {
                    AnimatorSet animatorSet8 = this.t2;
                    float[] fArr = new float[i11];
                    f7 = 1.0f;
                    fArr[c10] = 1.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0Var2, (Property<ei.c0, Float>) property4, fArr);
                    ei.c0 c0Var3 = this.l0;
                    float[] fArr2 = new float[i11];
                    fArr2[c10] = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c0Var3, (Property<ei.c0, Float>) property3, fArr2);
                    ei.c0 c0Var4 = this.l0;
                    float[] fArr3 = new float[i11];
                    fArr3[c10] = 1.0f;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(c0Var4, (Property<ei.c0, Float>) property5, fArr3);
                    Animator[] animatorArr = new Animator[3];
                    animatorArr[c10] = ofFloat2;
                    animatorArr[i11] = ofFloat3;
                    animatorArr[2] = ofFloat4;
                    animatorSet8.playTogether(animatorArr);
                } else {
                    f7 = 1.0f;
                }
                ye yeVar3 = this.b1;
                if (yeVar3 != null) {
                    yeVar3.setScaleX(f7);
                    this.b1.setScaleY(f7);
                    i12 = 1;
                    this.t2.playTogether(ObjectAnimator.ofFloat(this.Z0, (Property<xe, Float>) property5, f7));
                    this.b1.j(q0() ? bhVar4 : bhVar3, true);
                } else {
                    i12 = 1;
                }
                if (this.J1 != null) {
                    AnimatorSet animatorSet9 = this.t2;
                    ValueAnimator o9 = o(0.0f);
                    cf cfVar = this.J1;
                    float[] fArr4 = new float[i12];
                    fArr4[0] = 1.0f;
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(cfVar, (Property<cf, Float>) property5, fArr4);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = o9;
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
                    r12 = 0;
                    this.t2.playTogether(ObjectAnimator.ofFloat(this.p1, this.c4, 0.0f), ObjectAnimator.ofFloat(this.p1, this.a4, 1.0f));
                    AnimatorSet animatorSet10 = this.t2;
                    hg.l lVar2 = this.r1;
                    this.v1 = 1.0f;
                    animatorSet10.playTogether(ObjectAnimator.ofFloat(lVar2, (Property<hg.l, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<hg.l, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<hg.l, Float>) property4, 1.0f));
                } else {
                    r12 = 0;
                    z12 = true;
                }
                jh.h hVar2 = this.e5;
                if (hVar2 != 0) {
                    hVar2.e(r12, r12, z12);
                }
                this.k2 = z12;
                v0();
                this.t2.setDuration(150L);
            } else {
                int i19 = 9;
                if (i10 == 3) {
                    V();
                    W();
                    SlideTextView slideTextView2 = this.k1;
                    if (slideTextView2 != null) {
                        slideTextView2.setEnabled(false);
                    }
                    if (this.c1) {
                        ll0 ll0Var = this.h1;
                        if (ll0Var != null) {
                            ll0Var.setVisibility(8);
                        }
                        ne neVar = this.e1;
                        if (neVar != null) {
                            neVar.setAlpha(1.0f);
                            this.e1.setVisibility(0);
                        }
                        fk0 fk0Var = this.g1;
                        if (fk0Var != null) {
                            fk0Var.setProgress(0.0f);
                            this.g1.i();
                        }
                        f11 = 1.0f;
                    } else {
                        a91 a91Var = this.f1;
                        if (a91Var != null) {
                            a91Var.setVisibility(8);
                            v0();
                        }
                        ne neVar2 = this.e1;
                        if (neVar2 != null) {
                            i17 = 0;
                            neVar2.setVisibility(0);
                            f11 = 1.0f;
                            this.e1.setAlpha(1.0f);
                        } else {
                            f11 = 1.0f;
                            i17 = 0;
                        }
                        ll0 ll0Var2 = this.h1;
                        if (ll0Var2 != null) {
                            ll0Var2.setVisibility(i17);
                            this.h1.setAlpha(0.0f);
                        }
                    }
                    this.s4 = true;
                    this.n4 = f11;
                    this.l4 = this.k4;
                    this.j4 = f11;
                    SlideTextView slideTextView3 = this.k1;
                    if (slideTextView3 != null) {
                        slideTextView3.setCancelToProgress(f11);
                    }
                    ug ugVar5 = this.O1;
                    if (ugVar5 != null) {
                        ugVar5.invalidate();
                    }
                    fk0 fk0Var2 = this.g1;
                    if (fk0Var2 != null) {
                        fk0Var2.setAlpha(0.0f);
                        this.g1.setScaleX(0.0f);
                        this.g1.setScaleY(0.0f);
                        this.g1.setProgress(0.0f);
                        this.g1.i();
                    }
                    if (q0() || this.z4) {
                        this.f1.setVisibility(0);
                        viewGroup = null;
                        layoutParams = null;
                    } else {
                        viewGroup = (ViewGroup) this.e1.getParent();
                        layoutParams = this.e1.getLayoutParams();
                        viewGroup.removeView(this.e1);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.Z1 == null ? org.telegram.messenger.q.b(44.0f, this.J0.l(), 0) : 0), AndroidUtilities.dp(44.0f));
                        layoutParams2.gravity = 80;
                        layoutParams2.leftMargin = AndroidUtilities.dp(7.0f);
                        layoutParams2.rightMargin = AndroidUtilities.dp(7.0f);
                        this.m1.addView(this.e1, layoutParams2);
                        this.f1.setVisibility(8);
                    }
                    v0();
                    AnimatorSet animatorSet11 = new AnimatorSet();
                    if (z10) {
                        this.h1.setAllowDraw(false);
                        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat6.addUpdateListener(new td(this, 6));
                        ofFloat6.addListener(new yf(this));
                        if (q0()) {
                            bhVar = bhVar3;
                            bhVar2 = bhVar4;
                            j10 = 490;
                        } else {
                            bhVar = bhVar3;
                            bhVar2 = bhVar4;
                            j10 = 580;
                        }
                        ofFloat6.setDuration(j10);
                        AnimatorSet animatorSet12 = new AnimatorSet();
                        animatorSet12.playTogether(ObjectAnimator.ofFloat(this.l1, (Property<wg, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.l1, (Property<wg, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.Y0, (Property<zg, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.Y0, (Property<zg, Float>) property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.k1, (Property<SlideTextView, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<fk0, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.g1, (Property<fk0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.g1, (Property<fk0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.Z3, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.b4, 0.0f), ObjectAnimator.ofFloat(this.E0, (Property<sf, Float>) property5, 0.0f));
                        fk0 fk0Var3 = this.g1;
                        if (fk0Var3 != null) {
                            fk0Var3.setAlpha(0.0f);
                            this.g1.setScaleX(0.0f);
                            this.g1.setScaleY(0.0f);
                        }
                        if (this.b1 != null) {
                            animatorSet12.playTogether(ObjectAnimator.ofFloat(this.Z0, (Property<xe, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<xe, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<xe, Float>) property4, 1.0f));
                            ye yeVar4 = this.b1;
                            if (q0()) {
                                bhVar = bhVar2;
                            }
                            i18 = 1;
                            yeVar4.j(bhVar, true);
                        } else {
                            i18 = 1;
                        }
                        ei.c0 c0Var5 = this.l0;
                        if (c0Var5 != null) {
                            float[] fArr5 = new float[i18];
                            fArr5[0] = 0.0f;
                            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(c0Var5, (Property<ei.c0, Float>) property5, fArr5);
                            ei.c0 c0Var6 = this.l0;
                            float[] fArr6 = new float[i18];
                            fArr6[0] = 0.0f;
                            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(c0Var6, (Property<ei.c0, Float>) property3, fArr6);
                            ei.c0 c0Var7 = this.l0;
                            float[] fArr7 = new float[i18];
                            fArr7[0] = 0.0f;
                            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(c0Var7, (Property<ei.c0, Float>) property4, fArr7);
                            Animator[] animatorArr3 = new Animator[3];
                            animatorArr3[0] = ofFloat7;
                            animatorArr3[i18] = ofFloat8;
                            animatorArr3[2] = ofFloat9;
                            animatorSet12.playTogether(animatorArr3);
                        }
                        animatorSet12.addListener(new bf(this, 8));
                        animatorSet12.setDuration(150L);
                        animatorSet12.setStartDelay(150L);
                        if (q0()) {
                            this.f1.setAlpha(0.0f);
                            c12 = 1;
                            c13 = 0;
                            animatorSet11.playTogether(ObjectAnimator.ofFloat(this.f1, (Property<a91, Float>) property5, 1.0f));
                            animatorSet11.setDuration(150L);
                            animatorSet11.setStartDelay(430L);
                        } else {
                            c12 = 1;
                            c13 = 0;
                        }
                        AnimatorSet animatorSet13 = this.t2;
                        Animator[] animatorArr4 = new Animator[3];
                        animatorArr4[c13] = animatorSet12;
                        animatorArr4[c12] = ofFloat6;
                        animatorArr4[2] = animatorSet11;
                        animatorSet13.playTogether(animatorArr4);
                        this.t2.addListener(new ai.z4(this, viewGroup, layoutParams, 2));
                    } else {
                        X();
                        this.u3.set(this.N1, Float.valueOf(1.0f));
                        this.N1.setTransformToSeekbar(1.0f);
                        if (!q0()) {
                            float f13 = this.p4;
                            if (f13 != 0.0f && this.h1 != null) {
                                this.h1.setAlpha(hs.j.getInterpolation(Math.max(0.0f, ((f13 - 0.38f) - 0.25f) / 0.37f)));
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
                        ye yeVar5 = this.b1;
                        if (yeVar5 != null) {
                            if (q0()) {
                                bhVar3 = bhVar4;
                            }
                            yeVar5.j(bhVar3, z10);
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
                        if (q0()) {
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
                        D1();
                        v0();
                    }
                } else {
                    bh bhVar5 = bhVar3;
                    bh bhVar6 = bhVar4;
                    if (i10 == 2 || i10 == 5) {
                        ye yeVar6 = this.b1;
                        if (yeVar6 != null) {
                            yeVar6.setVisibility(0);
                        }
                        this.k2 = true;
                        v0();
                        AnimatorSet animatorSet14 = new AnimatorSet();
                        animatorSet14.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.b4, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.l1, (Property<wg, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.l1, (Property<wg, Float>) property3, 0.0f));
                        ug ugVar6 = this.O1;
                        if (ugVar6 != null) {
                            animatorSet14.playTogether(ObjectAnimator.ofFloat(ugVar6, (Property<ug, Float>) property5, 0.0f));
                            this.O1.a();
                        }
                        ei.c0 c0Var9 = this.l0;
                        if (c0Var9 != null) {
                            i13 = 1;
                            animatorSet14.playTogether(ObjectAnimator.ofFloat(c0Var9, (Property<ei.c0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<ei.c0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<ei.c0, Float>) property5, 1.0f));
                        } else {
                            i13 = 1;
                        }
                        AnimatorSet animatorSet15 = new AnimatorSet();
                        zg zgVar = this.Y0;
                        int i20 = i13;
                        float[] fArr8 = new float[i20];
                        fArr8[0] = 0.0f;
                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(zgVar, (Property<zg, Float>) property5, fArr8);
                        zg zgVar2 = this.Y0;
                        float[] fArr9 = new float[i20];
                        fArr9[0] = -AndroidUtilities.dp(20.0f);
                        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(zgVar2, (Property<zg, Float>) property2, fArr9);
                        SlideTextView slideTextView4 = this.k1;
                        float[] fArr10 = new float[i20];
                        fArr10[0] = 0.0f;
                        animatorSet15.playTogether(ofFloat10, ofFloat11, ObjectAnimator.ofFloat(slideTextView4, (Property<SlideTextView, Float>) property5, fArr10), ObjectAnimator.ofFloat(this.k1, (Property<SlideTextView, Float>) property2, -AndroidUtilities.dp(20.0f)));
                        if (i10 != 5) {
                            this.Z0.setScaleX(0.0f);
                            this.Z0.setScaleY(0.0f);
                            hg.l lVar3 = this.r1;
                            if (lVar3 != null && lVar3.getVisibility() == 0) {
                                this.r1.setScaleX(0.5f);
                                this.r1.setScaleY(0.5f);
                            }
                            ef efVar = this.x1;
                            if (efVar != null && efVar.getVisibility() == 0) {
                                this.x1.setScaleX(0.0f);
                                this.x1.setScaleY(0.0f);
                            }
                            animatorSet14.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<xe, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<xe, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<xe, Float>) property5, 1.0f));
                            if (this.p1 != null) {
                                ViewPropertyAnimator viewPropertyAnimator3 = this.q1;
                                if (viewPropertyAnimator3 != null) {
                                    viewPropertyAnimator3.cancel();
                                    this.q1 = null;
                                }
                                i15 = 1;
                                animatorSet14.playTogether(ObjectAnimator.ofFloat(this.p1, this.a4, 1.0f), ObjectAnimator.ofFloat(this.p1, this.c4, 0.0f));
                                hg.l lVar4 = this.r1;
                                this.v1 = 1.0f;
                                z14 = false;
                                animatorSet14.playTogether(ObjectAnimator.ofFloat(lVar4, (Property<hg.l, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<hg.l, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<hg.l, Float>) property4, 1.0f));
                            } else {
                                i15 = 1;
                                z14 = false;
                            }
                            jh.h hVar3 = this.e5;
                            boolean z17 = z14;
                            if (hVar3 != null) {
                                hVar3.e(z17 ? 1 : 0, z17, i15);
                            }
                            ef efVar2 = this.x1;
                            if (efVar2 != null) {
                                float[] fArr11 = new float[i15];
                                fArr11[z17 ? 1 : 0] = 1.0f;
                                ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(efVar2, (Property<ef, Float>) property3, fArr11);
                                ef efVar3 = this.x1;
                                float[] fArr12 = new float[i15];
                                fArr12[z17 ? 1 : 0] = 1.0f;
                                ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(efVar3, (Property<ef, Float>) property4, fArr12);
                                Animator[] animatorArr5 = new Animator[2];
                                animatorArr5[z17 ? 1 : 0] = ofFloat12;
                                animatorArr5[i15] = ofFloat13;
                                animatorSet14.playTogether(animatorArr5);
                            }
                            if (this.b1 != null) {
                                xe xeVar = this.Z0;
                                float[] fArr13 = new float[i15];
                                fArr13[z17 ? 1 : 0] = 1.0f;
                                ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(xeVar, (Property<xe, Float>) property5, fArr13);
                                Animator[] animatorArr6 = new Animator[i15];
                                animatorArr6[z17 ? 1 : 0] = ofFloat14;
                                animatorSet14.playTogether(animatorArr6);
                                xe xeVar2 = this.Z0;
                                float[] fArr14 = new float[i15];
                                fArr14[z17 ? 1 : 0] = 1.0f;
                                ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(xeVar2, (Property<xe, Float>) property3, fArr14);
                                Animator[] animatorArr7 = new Animator[i15];
                                animatorArr7[z17 ? 1 : 0] = ofFloat15;
                                animatorSet14.playTogether(animatorArr7);
                                xe xeVar3 = this.Z0;
                                float[] fArr15 = new float[i15];
                                fArr15[z17 ? 1 : 0] = 1.0f;
                                ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(xeVar3, (Property<xe, Float>) property4, fArr15);
                                Animator[] animatorArr8 = new Animator[i15];
                                animatorArr8[z17 ? 1 : 0] = ofFloat16;
                                animatorSet14.playTogether(animatorArr8);
                                ye yeVar7 = this.b1;
                                if (!q0()) {
                                    bhVar6 = bhVar5;
                                }
                                yeVar7.j(bhVar6, i15);
                            }
                            cf cfVar2 = this.J1;
                            if (cfVar2 != null) {
                                float[] fArr16 = new float[i15];
                                fArr16[0] = 1.0f;
                                ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(cfVar2, (Property<cf, Float>) property5, fArr16);
                                ValueAnimator o10 = o(0.0f);
                                Animator[] animatorArr9 = new Animator[2];
                                animatorArr9[0] = ofFloat17;
                                animatorArr9[i15] = o10;
                                animatorSet14.playTogether(animatorArr9);
                            }
                            j3 = 150;
                        } else {
                            AnimatorSet animatorSet16 = new AnimatorSet();
                            animatorSet16.playTogether(ObjectAnimator.ofFloat(this.Z0, (Property<xe, Float>) property5, 1.0f));
                            if (this.p1 != null) {
                                ViewPropertyAnimator viewPropertyAnimator4 = this.q1;
                                if (viewPropertyAnimator4 != null) {
                                    viewPropertyAnimator4.cancel();
                                    this.q1 = null;
                                }
                                i14 = 1;
                                z13 = false;
                                animatorSet16.playTogether(ObjectAnimator.ofFloat(this.p1, this.c4, 0.0f), ObjectAnimator.ofFloat(this.p1, this.a4, 1.0f));
                                hg.l lVar5 = this.r1;
                                this.v1 = 1.0f;
                                animatorSet16.playTogether(ObjectAnimator.ofFloat(lVar5, (Property<hg.l, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<hg.l, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<hg.l, Float>) property4, 1.0f));
                            } else {
                                i14 = 1;
                                z13 = false;
                            }
                            jh.h hVar4 = this.e5;
                            boolean z18 = z13;
                            if (hVar4 != null) {
                                hVar4.e(z18 ? 1 : 0, z18, i14);
                            }
                            cf cfVar3 = this.J1;
                            if (cfVar3 != null) {
                                float[] fArr17 = new float[i14];
                                fArr17[z18 ? 1 : 0] = 1.0f;
                                ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(cfVar3, (Property<cf, Float>) property5, fArr17);
                                ValueAnimator o11 = o(0.0f);
                                Animator[] animatorArr10 = new Animator[2];
                                animatorArr10[z18 ? 1 : 0] = ofFloat18;
                                animatorArr10[i14] = o11;
                                animatorSet16.playTogether(animatorArr10);
                            }
                            j3 = 150;
                            animatorSet16.setDuration(150L);
                            animatorSet16.setStartDelay(110L);
                            animatorSet16.addListener(new bf(this, i19));
                            AnimatorSet animatorSet17 = this.t2;
                            Animator[] animatorArr11 = new Animator[i14];
                            animatorArr11[0] = animatorSet16;
                            animatorSet17.playTogether(animatorArr11);
                        }
                        animatorSet14.setDuration(j3);
                        animatorSet14.setStartDelay(700L);
                        animatorSet15.setDuration(200L);
                        animatorSet15.setStartDelay(200L);
                        this.G = 0.0f;
                        H1();
                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(this.E0, (Property<sf, Float>) property5, 1.0f);
                        ofFloat19.setStartDelay(this.s == 1.0f ? 300L : 700L);
                        ofFloat19.setDuration(200L);
                        this.t2.playTogether(animatorSet14, animatorSet15, ofFloat19, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.k4).setDuration(200L));
                        if (i10 == 5) {
                            ChatActivityEnterView.this.r4 = true;
                            ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                            duration.setInterpolator(hs.j);
                            this.t2.playTogether(duration);
                        } else {
                            ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                            ofFloat20.setDuration(360L);
                            ofFloat20.setStartDelay(490L);
                            this.t2.playTogether(ofFloat20);
                        }
                        wg wgVar2 = this.l1;
                        if (wgVar2 != null) {
                            wgVar2.e = true;
                            ck0 ck0Var = wgVar2.f;
                            ck0Var.T(0.0f, true);
                            if (wgVar2.d) {
                                ck0Var.start();
                            }
                        }
                    } else {
                        ye yeVar8 = this.b1;
                        if (yeVar8 != null) {
                            yeVar8.setVisibility(0);
                        }
                        AnimatorSet animatorSet18 = new AnimatorSet();
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.b4, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.l1, (Property<wg, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.l1, (Property<wg, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.Z0, (Property<xe, Float>) property5, 1.0f));
                        ug ugVar7 = this.O1;
                        if (ugVar7 != null) {
                            animatorSet18.playTogether(ObjectAnimator.ofFloat(ugVar7, (Property<ug, Float>) property5, 0.0f));
                            this.O1.a();
                        }
                        ei.c0 c0Var10 = this.l0;
                        if (c0Var10 != null) {
                            f10 = 1.0f;
                            c11 = true;
                            animatorSet18.playTogether(ObjectAnimator.ofFloat(c0Var10, (Property<ei.c0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<ei.c0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<ei.c0, Float>) property5, 1.0f));
                        } else {
                            c11 = true;
                            f10 = 1.0f;
                        }
                        ye yeVar9 = this.b1;
                        if (yeVar9 != null) {
                            yeVar9.setScaleX(f10);
                            this.b1.setScaleY(f10);
                            xe xeVar4 = this.Z0;
                            int i21 = c11;
                            float[] fArr18 = new float[i21];
                            fArr18[0] = f10;
                            ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(xeVar4, (Property<xe, Float>) property5, fArr18);
                            Animator[] animatorArr12 = new Animator[i21];
                            animatorArr12[0] = ofFloat21;
                            animatorSet18.playTogether(animatorArr12);
                            ye yeVar10 = this.b1;
                            if (q0()) {
                                bhVar5 = bhVar6;
                            }
                            yeVar10.j(bhVar5, i21);
                        }
                        if (this.p1 != null) {
                            ViewPropertyAnimator viewPropertyAnimator5 = this.q1;
                            if (viewPropertyAnimator5 != null) {
                                viewPropertyAnimator5.cancel();
                                this.q1 = null;
                            }
                            this.x = 0.0f;
                            y1();
                            i16 = 1;
                            r92 = 0;
                            animatorSet18.playTogether(ObjectAnimator.ofFloat(this.p1, this.a4, 1.0f));
                            hg.l lVar6 = this.r1;
                            this.v1 = 1.0f;
                            animatorSet18.playTogether(ObjectAnimator.ofFloat(lVar6, (Property<hg.l, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<hg.l, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<hg.l, Float>) property4, 1.0f));
                        } else {
                            r92 = 0;
                            i16 = 1;
                        }
                        jh.h hVar5 = this.e5;
                        if (hVar5 != 0) {
                            hVar5.e(r92, r92, i16);
                        }
                        cf cfVar4 = this.J1;
                        if (cfVar4 != null) {
                            float[] fArr19 = new float[i16];
                            fArr19[r92] = 1.0f;
                            ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(cfVar4, (Property<cf, Float>) property5, fArr19);
                            ValueAnimator o12 = o(0.0f);
                            Animator[] animatorArr13 = new Animator[2];
                            animatorArr13[r92] = ofFloat22;
                            animatorArr13[i16] = o12;
                            animatorSet18.playTogether(animatorArr13);
                        }
                        animatorSet18.setDuration(150L);
                        animatorSet18.setStartDelay(200L);
                        AnimatorSet animatorSet19 = new AnimatorSet();
                        zg zgVar3 = this.Y0;
                        float[] fArr20 = new float[i16];
                        fArr20[r92] = 0.0f;
                        ObjectAnimator ofFloat23 = ObjectAnimator.ofFloat(zgVar3, (Property<zg, Float>) property5, fArr20);
                        zg zgVar4 = this.Y0;
                        float[] fArr21 = new float[i16];
                        fArr21[r92] = AndroidUtilities.dp(40.0f);
                        ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(zgVar4, (Property<zg, Float>) property2, fArr21);
                        SlideTextView slideTextView5 = this.k1;
                        float[] fArr22 = new float[i16];
                        fArr22[r92] = 0.0f;
                        ObjectAnimator ofFloat25 = ObjectAnimator.ofFloat(slideTextView5, (Property<SlideTextView, Float>) property5, fArr22);
                        SlideTextView slideTextView6 = this.k1;
                        float[] fArr23 = new float[i16];
                        fArr23[r92] = AndroidUtilities.dp(40.0f);
                        ObjectAnimator ofFloat26 = ObjectAnimator.ofFloat(slideTextView6, (Property<SlideTextView, Float>) property2, fArr23);
                        Animator[] animatorArr14 = new Animator[4];
                        animatorArr14[r92] = ofFloat23;
                        animatorArr14[i16] = ofFloat24;
                        animatorArr14[2] = ofFloat25;
                        animatorArr14[3] = ofFloat26;
                        animatorSet19.playTogether(animatorArr14);
                        animatorSet19.setDuration(150L);
                        float[] fArr24 = new float[i16];
                        fArr24[r92] = 1.0f;
                        ObjectAnimator ofFloat27 = ObjectAnimator.ofFloat(this, "exitTransition", fArr24);
                        ofFloat27.setDuration(this.g0 ? 220L : 360L);
                        this.G = 0.0f;
                        H1();
                        ObjectAnimator ofFloat28 = ObjectAnimator.ofFloat(this.E0, (Property<sf, Float>) property5, 1.0f);
                        ofFloat28.setStartDelay(this.s == 1.0f ? 150L : 450L);
                        ofFloat28.setDuration(200L);
                        this.t2.playTogether(animatorSet18, animatorSet19, ofFloat28, ofFloat27);
                    }
                }
            }
            this.t2.addListener(new ag(this, i10));
            this.t2.start();
            zg zgVar5 = this.Y0;
            if (zgVar5 != null) {
                zgVar5.b();
            }
        }
        this.Z2.h();
        N1();
        this.Q4 = i10;
    }

    public final void K() {
        this.k5 = x(true);
        float x10 = x(false);
        if (this.j5 != x10) {
            this.j5 = x10;
            y0(x10);
        }
    }

    public final boolean K0() {
        return this.V0 != null;
    }

    public final void K1() {
        int g02 = g0(org.telegram.ui.ActionBar.i6.jf);
        int g03 = g0(org.telegram.ui.ActionBar.i6.Sd);
        int g04 = g0(org.telegram.ui.ActionBar.i6.df);
        fk0 fk0Var = this.g1;
        if (fk0Var != null) {
            fk0Var.h(g02, "Cup Red");
            this.g1.h(g02, "Box Red");
            this.g1.h(g04, "Cup Grey");
            this.g1.h(g04, "Box Grey");
            this.g1.h(g04, "Box_Grey 2");
            this.g1.h(g04, "Line 1");
            this.g1.h(g04, "Line 2");
            this.g1.h(g04, "Line 3");
            this.g1.h(g03, "Line 1 Dup");
            this.g1.h(g03, "Line 2 Dup");
            this.g1.h(g03, "Line 3 Dup");
        }
    }

    public final void L() {
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
        ne neVar = this.z1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) neVar.getLayoutParams();
        int i10 = z10 ? this.G1.getLayoutParams().height : 0;
        layoutParams.topMargin = i10;
        layoutParams.topMargin = AndroidUtilities.dp(9.0f) + i10;
        neVar.setLayoutParams(layoutParams);
        this.M4 = z10;
        setMinimumHeight(AndroidUtilities.dp(44.0f) + (z10 ? this.G1.getLayoutParams().height : 0));
        if (this.z3) {
            if (this.R1 == 0) {
                l1(false, true, false, true);
            } else {
                J();
            }
        }
    }

    public boolean L0() {
        return true;
    }

    public final void L1() {
        RichMessageLayout.PreviewView previewView = this.C1;
        if (previewView == null) {
            return;
        }
        boolean z10 = this.D1;
        boolean z11 = this.E1 != null && this.Z1 == null;
        this.D1 = z11;
        af afVar = this.J0;
        ImageView imageView = this.R0;
        qe qeVar = this.Q0;
        if (z11) {
            previewView.setResourcesProvider(this.W3);
            this.C1.set(this.E1);
            this.C1.setVisibility(0);
            sf sfVar = this.E0;
            if (sfVar != null) {
                sfVar.setVisibility(8);
            }
            qeVar.setVisibility(8);
            imageView.setVisibility(0);
            afVar.setLocked(!UserConfig.getInstance(this.Q).isPremium());
        } else {
            previewView.setVisibility(8);
            sf sfVar2 = this.E0;
            if (sfVar2 != null) {
                sfVar2.setVisibility(0);
            }
            qeVar.setVisibility(0);
            imageView.setVisibility(8);
            afVar.setLocked(false);
        }
        C1();
        if (z10 != this.D1) {
            I(true);
        }
    }

    public final void M() {
        org.telegram.ui.zn znVar = this.P2;
        if (znVar != null) {
            MediaDataController.getInstance(this.Q).saveDraft(znVar.a(), znVar.E7(znVar.n5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final void M0(int i10, int i11, CharSequence charSequence, boolean z10) {
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void M1(boolean z10) {
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
                    this.e0 = new es(getContext(), R.drawable.input_notify_on, org.telegram.ui.ActionBar.i6.Wk);
                }
                this.e0.a(this.g2, false);
                imageView.setImageDrawable(this.e0);
            } else {
                z11 = false;
            }
            org.telegram.ui.yd ydVar = this.p1;
            if (ydVar != null) {
                F1(ydVar.getVisibility() == 0 ? 1 : 0);
            }
        } else {
            z11 = false;
        }
        boolean z12 = (this.Z2 == null || c() || !this.Z2.I0()) ? false : true;
        boolean z13 = (!z12 || this.L1 || this.F2) ? false : true;
        if (z13) {
            Y();
        }
        cf cfVar = this.J1;
        if (cfVar != null) {
            if ((cfVar.getTag() != null && z13) || (this.J1.getTag() == null && !z13)) {
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
            cf cfVar2 = this.J1;
            if (cfVar2 != null) {
                if (z13) {
                    cfVar2.setVisibility(0);
                }
                this.J1.setPivotX(AndroidUtilities.dp(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.M1 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.J1, (Property<cf, Float>) View.ALPHA, z13 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.J1, (Property<cf, Float>) View.SCALE_X, z13 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.J1, (Property<cf, Float>) View.SCALE_Y, z13 ? 1.0f : 0.1f));
                this.M1.setDuration(180L);
                this.M1.addListener(new ff(this, z13, 2));
                this.M1.start();
                return;
            }
            return;
        }
        cf cfVar3 = this.J1;
        if (cfVar3 == null) {
            if (imageView != null) {
                imageView.setVisibility(z11 ? 0 : 8);
                return;
            }
            return;
        }
        cfVar3.setVisibility(z13 ? 0 : 8);
        this.J1.setAlpha(z13 ? 1.0f : 0.0f);
        this.J1.setScaleX(z13 ? 1.0f : 0.1f);
        this.J1.setScaleY(z13 ? 1.0f : 0.1f);
        if (imageView != null) {
            imageView.setVisibility((!z11 || this.J1.getVisibility() == 0) ? 8 : 0);
        }
        this.J1.setTranslationX(0.0f);
    }

    public final void N() {
        AndroidUtilities.hideKeyboard(this.E0);
    }

    public final void N0() {
        l1(false, true, false, true);
        r1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.F2 = false;
        ye yeVar = this.b1;
        if (yeVar != null) {
            yeVar.setVisibility(0);
        }
        this.k2 = true;
        v0();
        y();
        n0();
        ug ugVar = this.O1;
        if (ugVar != null) {
            ugVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }

    public final void N1() {
        O1(true);
    }

    public final void O() {
        if (this.x1 != null) {
            return;
        }
        ef efVar = new ef(this, getContext(), 1);
        this.x1 = efVar;
        vm0 vm0Var = new vm0(getContext());
        this.U1 = vm0Var;
        efVar.setImageDrawable(vm0Var);
        this.U1.setColorFilter(new PorterDuffColorFilter(g0(org.telegram.ui.ActionBar.i6.Wk), PorterDuff.Mode.MULTIPLY));
        this.U1.a(R.drawable.input_bot2, false);
        this.x1.setScaleType(ImageView.ScaleType.CENTER);
        this.x1.setBackground(org.telegram.ui.ActionBar.i6.g0(g0(org.telegram.ui.ActionBar.i6.i6), 1, -1));
        this.x1.setVisibility(8);
        AndroidUtilities.updateViewVisibilityAnimated(this.x1, false, 0.1f, false);
        this.p1.addView(this.x1, 0, w7.x5.n(44, 44));
        this.x1.setOnClickListener(new xd(this, 15));
    }

    public final void O0(TL_iv.RichMessage richMessage) {
        org.telegram.ui.zn znVar = this.P2;
        if (znVar != null) {
            MediaDataController.getInstance(this.Q).saveDraft(znVar.a(), znVar.E7(znVar.n5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public void O1(boolean z10) {
        P1(false, z10);
    }

    public final void P() {
        if (this.l0 != null) {
            return;
        }
        ei.c0 c0Var = new ei.c0(getContext());
        this.l0 = c0Var;
        c0Var.setOnClickListener(new xd(this, 7));
        this.y1.addView(this.l0, w7.x5.a(32.0f, 8.0f, 6.0f, 8.0f, 6.0f, -2, 83));
        AndroidUtilities.updateViewVisibilityAnimated(this.l0, false, 1.0f, false);
        ei.c0 c0Var2 = this.l0;
        if (!c0Var2.f) {
            c0Var2.f = true;
            c0Var2.h = 1.0f;
            c0Var2.requestLayout();
            c0Var2.invalidate();
        }
    }

    public final void P0(SpannableStringBuilder spannableStringBuilder, boolean z10, int i10, int i11) {
        if (this.E0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
        b6[] b6VarArr = (b6[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), b6.class);
        if (b6VarArr != null) {
            for (b6 b6Var : b6VarArr) {
                b6Var.applyFontMetrics(this.E0.getPaint().getFontMetricsInt(), s5.g());
            }
        }
        xj0.a(spannableStringBuilder2);
        M();
        setFieldText(spannableStringBuilder2);
        R0(i10, z10, i11, true, 0L);
    }

    public final void P1(boolean z10, boolean z11) {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        float f7;
        float f10;
        bq0 bq0Var;
        bq0 bq0Var2;
        ne neVar;
        if (this.Z2 == null) {
            return;
        }
        U();
        if (this.l5) {
            peer = this.Z2.x();
            chat = null;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.Q).getChat(Long.valueOf(-this.Q2));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.Q).getChatFull(-this.Q2);
            TLRPC.Peer peer2 = chatFull != null ? chatFull.default_send_as : null;
            chat = chat2;
            peer = peer2;
        }
        if (peer == null && this.Z2.P() != null && !this.Z2.P().peers.isEmpty()) {
            peer = this.Z2.P().peers.get(0).peer;
        }
        org.telegram.ui.zn znVar = this.P2;
        boolean z12 = (z10 || peer == null || (this.Z2.P() != null && this.Z2.P().peers.size() <= 1) || p0() || u0() || (((neVar = this.e1) != null && neVar.getVisibility() == 0) || ((!this.l5 && ((ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.canSendAsPeers(chat)) || ChatObject.isMonoForum(chat))) || (znVar != null && znVar.R3 == 9)))) ? false : true;
        if (z12) {
            Z();
        }
        if (peer != null) {
            if (peer.channel_id != 0) {
                TLRPC.Chat chat3 = MessagesController.getInstance(this.Q).getChat(Long.valueOf(peer.channel_id));
                if (chat3 != null && (bq0Var2 = this.p0) != null) {
                    bq0Var2.setAvatar(chat3);
                    this.p0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, chat3.title));
                }
            } else {
                TLRPC.User user = MessagesController.getInstance(this.Q).getUser(Long.valueOf(peer.user_id));
                if (user != null && (bq0Var = this.p0) != null) {
                    bq0Var.setAvatar(user);
                    this.p0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, ContactsController.formatName(user.first_name, user.last_name)));
                }
            }
        }
        bq0 bq0Var3 = this.p0;
        boolean z13 = bq0Var3 != null && bq0Var3.getVisibility() == 0;
        int dp = AndroidUtilities.dp(2.0f);
        float f11 = z12 ? 0.0f : 1.0f;
        float f12 = z12 ? 1.0f : 0.0f;
        bq0 bq0Var4 = this.p0;
        if (bq0Var4 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bq0Var4.getLayoutParams();
            f10 = z12 ? ((-this.p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp : 0.0f;
            f7 = z12 ? 0.0f : ((-this.p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        if (z13 == z12) {
            return;
        }
        bq0 bq0Var5 = this.p0;
        ValueAnimator valueAnimator = bq0Var5 == null ? null : (ValueAnimator) bq0Var5.getTag();
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.p0.setTag(null);
        }
        if ((this.l5 || (znVar != null && znVar.K8() == 0 && znVar.O5)) && z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            bq0 bq0Var6 = this.p0;
            if (bq0Var6 != null) {
                bq0Var6.setTranslationX(f10);
            }
            this.G = f10;
            H1();
            float f13 = f7;
            float f14 = f12;
            float f15 = f10;
            duration.addUpdateListener(new u5(this, f15, f13, f11, f14, 1));
            duration.addListener(new cg(this, z12, f11, f15, f14, f13));
            duration.start();
            bq0 bq0Var7 = this.p0;
            if (bq0Var7 != null) {
                bq0Var7.setTag(duration);
                return;
            }
            return;
        }
        float f16 = f7;
        float f17 = f12;
        boolean z14 = z12;
        if (z14) {
            Z();
        }
        bq0 bq0Var8 = this.p0;
        if (bq0Var8 != null) {
            bq0Var8.setVisibility(z14 ? 0 : 8);
            this.p0.setTranslationX(f16);
        }
        float f18 = z14 ? f16 : 0.0f;
        this.Q0.setTranslationX(f18);
        this.G = f18;
        H1();
        bq0 bq0Var9 = this.p0;
        if (bq0Var9 != null) {
            bq0Var9.setAlpha(f17);
            this.p0.setTag(null);
        }
    }

    public final void Q() {
        if (this.b0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.b0 = numberTextView;
        numberTextView.setVisibility(8);
        this.b0.setTextSize(15);
        this.b0.setTextColor(g0(org.telegram.ui.ActionBar.i6.y6));
        this.b0.setTypeface(AndroidUtilities.bold());
        this.b0.setCenterAlign(true);
        addView(this.b0, Math.min(2, getChildCount()), w7.x5.a(20.0f, 3.0f, 0.0f, 0.0f, 44.0f, 44, 85));
    }

    public boolean Q0() {
        boolean z10 = this.D1;
        org.telegram.ui.ActionBar.e6 e6Var = this.W3;
        if (z10 && !UserConfig.getInstance(this.Q).isPremium()) {
            ii.e2.p0(getContext(), new vd(this, 20), new vd(this, 21), e6Var);
            return true;
        }
        if (!c()) {
            return R0(0, true, 0, true, 0L);
        }
        g5.L(this.O2, this.P2.a(), new gf(this), e6Var);
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
            if (starsPrice > 0 || this.l5) {
                this.J0.i(1, starsPrice, true);
            }
            F1(this.P4);
        }
        if (this.l5) {
            Q();
            if (s()) {
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
                        Q();
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
                        this.b0.setTextColor(g0(i10 < 0 ? org.telegram.ui.ActionBar.i6.p7 : org.telegram.ui.ActionBar.i6.y6));
                        return;
                    }
                }
                NumberTextView numberTextView2 = this.b0;
                if (numberTextView2 != null) {
                    numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new bf(this, 0));
                }
            }
        }
    }

    public final void R(boolean z10) {
        if (this.F1 != null) {
            return;
        }
        af afVar = new af(this, getContext(), R.drawable.input_done, this.W3, 1);
        this.F1 = afVar;
        afVar.setContentDescription(LocaleController.getString(R.string.EditMessage));
        if (z10) {
            w7.z5.a(this.F1);
        }
        this.z1.addView(this.F1, w7.x5.e(44, 44, 85));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x066d A[LOOP:1: B:196:0x03fd->B:255:0x066d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x061d A[EDGE_INSN: B:256:0x061d->B:257:0x061d BREAK  A[LOOP:1: B:196:0x03fd->B:255:0x066d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0564  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$WebPage] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean R0(final int i10, final boolean z10, final int i11, boolean z11, long j3) {
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
        MessageObject.SendAnimationData sendAnimationData;
        MessageObject threadMessage;
        String str;
        int i17;
        CharSequence charSequence4;
        CharSequence charSequence5;
        org.telegram.ui.zn znVar;
        ?? r32;
        TLRPC.WebPage webPage;
        ?? r72;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams messagePreviewParams2;
        ChatActivityEnterView chatActivityEnterView3;
        TLRPC.Chat chat;
        MessagePreviewParams messagePreviewParams3;
        MessageObject messageObject;
        qg qgVar;
        TLRPC.Chat chat2;
        TL_iv.RichMessage richMessage;
        ChatActivityEnterView chatActivityEnterView4;
        gg ggVar;
        ?? r02 = z11 && !this.i5.f;
        if (r02 == true) {
            boolean a02 = g5.a0(this.Q, this.Q2, getMessagesCount(), new Utilities.Callback() { // from class: org.telegram.ui.Components.je
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    int i18 = ChatActivityEnterView.n5;
                    ChatActivityEnterView chatActivityEnterView5 = ChatActivityEnterView.this;
                    chatActivityEnterView5.getClass();
                    chatActivityEnterView5.R0(i10, z10, i11, false, ((Long) obj).longValue());
                }
            }, j3);
            if (a02 && this.s4) {
                if (this.c1) {
                    if (!this.Z2.o1()) {
                        SlideTextView slideTextView = this.k1;
                        if (slideTextView != null) {
                            slideTextView.setEnabled(false);
                        }
                        this.Z2.t1();
                        return a02;
                    }
                } else if (!MediaController.getInstance().isRecordingPaused()) {
                    if (this.s4) {
                        this.J3 = true;
                    }
                    MediaController.getInstance().toggleRecordingPause(this.O);
                    this.Z2.g1(0);
                    SlideTextView slideTextView2 = this.k1;
                    if (slideTextView2 != null) {
                        slideTextView2.setEnabled(false);
                    }
                }
            }
            return a02;
        }
        if (this.G0 != Integer.MAX_VALUE || c()) {
            org.telegram.ui.zn znVar2 = this.P2;
            if (znVar2 != null) {
                TLRPC.Chat chat3 = znVar2.e;
                if (znVar2.i() != null || ((ChatObject.isChannel(chat3) && chat3.megagroup) || !ChatObject.isChannel(chat3))) {
                    MessagesController.getNotificationsSettings(this.Q).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + this.Q2, !z10).commit();
                }
            }
            if (this.z3) {
                l1(false, true, false, true);
                if (this.R1 != 0 && (ggVar = this.U0) != null) {
                    ggVar.u(false);
                    this.U0.C();
                }
            }
            if (r02 == true) {
                chatActivityEnterView = this;
                if (chatActivityEnterView.p1(new org.telegram.messenger.ua(this, z10, i10, i11, j3))) {
                    chatActivityEnterView2 = chatActivityEnterView;
                }
            } else {
                chatActivityEnterView = this;
            }
            chatActivityEnterView.E4 = true;
            VideoEditedInfo videoEditedInfo = chatActivityEnterView.e3;
            af afVar = chatActivityEnterView.J0;
            if (videoEditedInfo != null) {
                chatActivityEnterView.Z2.q2(4, i10, chatActivityEnterView.O ? Integer.MAX_VALUE : 0, chatActivityEnterView.S4, j3, z10);
                chatActivityEnterView.S4 = 0L;
                afVar.setEffect(0L);
                chatActivityEnterView.m0(true);
                chatActivityEnterView.I(true);
                AndroidUtilities.runOnUIThread(new vd(chatActivityEnterView, 2), 100L);
                chatActivityEnterView.i1 = 0L;
                return false;
            }
            if (chatActivityEnterView.b3 != null) {
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.d3) {
                    MediaController.getInstance().cleanupPlayer(true, true);
                }
                MediaController.getInstance().cleanRecording(false);
                MediaDataController.getInstance(chatActivityEnterView.Q).pushDraftVoiceMessage(chatActivityEnterView.Q2, (znVar2 == null || !znVar2.h4) ? 0L : znVar2.d(), null);
                ll0 ll0Var = chatActivityEnterView.h1;
                if (ll0Var != null && (ll0Var.s > 0.0f || ll0Var.v < 1.0f)) {
                    ll0Var.setPlaying(false);
                    String t10 = a1.g.t(new StringBuilder(), chatActivityEnterView.c3, ".ogg");
                    if (MediaController.cropOpusFile(chatActivityEnterView.c3, t10, chatActivityEnterView.h1.getAudioLeftMs(), chatActivityEnterView.h1.getAudioRightMs())) {
                        try {
                            new File(chatActivityEnterView.c3).delete();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        try {
                            new File(t10).renameTo(new File(chatActivityEnterView.c3));
                        } catch (Exception e10) {
                            FileLog.e(e10);
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
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(chatActivityEnterView.b3, null, chatActivityEnterView.c3, chatActivityEnterView.Q2, chatActivityEnterView.T2, chatActivityEnterView.getThreadMessage(), null, null, null, null, z10, i10, 0, chatActivityEnterView.O ? Integer.MAX_VALUE : 0, null, null, false);
                of2.sendMessageChatArguments = znVar2 != null ? znVar2.H8() : null;
                of2.effect_id = this.S4;
                of2.payStars = j3;
                of2.monoForumPeer = getSendMonoForumPeerId();
                of2.suggestionParams = getSendMessageSuggestionParams();
                this.S4 = 0L;
                afVar.setEffect(0L);
                if (!this.Z2.C1()) {
                    MessageObject.SendAnimationData sendAnimationData2 = new MessageObject.SendAnimationData();
                    sendAnimationData2.fromPreview = System.currentTimeMillis() - this.M0 < 200;
                    of2.sendAnimationData = sendAnimationData2;
                }
                r(of2);
                SendMessagesHelper.getInstance(this.Q).sendMessage(of2);
                qg qgVar2 = this.Z2;
                if (qgVar2 != null) {
                    chatActivityEnterView4 = this;
                    qgVar2.K(null, z10, i10, i11, j3);
                } else {
                    chatActivityEnterView4 = this;
                }
                chatActivityEnterView4.m0(true);
                chatActivityEnterView4.I(true);
                AndroidUtilities.runOnUIThread(new vd(chatActivityEnterView4, 3), 100L);
                chatActivityEnterView4.i1 = 0L;
            } else {
                ChatActivityEnterView chatActivityEnterView5 = chatActivityEnterView;
                long j10 = 200;
                String str2 = "";
                if (!chatActivityEnterView5.D1 || (richMessage = chatActivityEnterView5.E1) == null) {
                    org.telegram.ui.zn znVar3 = znVar2;
                    int i19 = 1;
                    af afVar2 = afVar;
                    chatActivityEnterView2 = chatActivityEnterView5;
                    sf sfVar = chatActivityEnterView2.E0;
                    CharSequence textToUse = sfVar == null ? "" : sfVar.getTextToUse();
                    if (znVar3 != null && (chat2 = znVar3.e) != null && chat2.slowmode_enabled && !ChatObject.hasAdminRights(chat2)) {
                        int length = textToUse.length();
                        int maxMessageLength = chatActivityEnterView2.R.getMessagesController().getMaxMessageLength();
                        org.telegram.ui.ActionBar.e6 e6Var = chatActivityEnterView2.W3;
                        if (length > maxMessageLength) {
                            g5.t0(znVar3, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSendErrorTooLong", R.string.SlowmodeSendErrorTooLong), e6Var);
                        } else if (chatActivityEnterView2.H2 && textToUse.length() > 0) {
                            g5.t0(znVar3, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSendError", R.string.SlowmodeSendError), e6Var);
                        }
                    }
                    if (!F(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, znVar3, textToUse)) {
                        org.telegram.ui.pn pnVar = chatActivityEnterView2.V2;
                        if (pnVar == null || znVar3 == null || !pnVar.f) {
                            int[] iArr = new int[1];
                            Emoji.parseEmojis(textToUse, iArr);
                            ?? r28 = 0;
                            ?? r17 = iArr[0] > 0;
                            CharSequence trimmedString = r17 == false ? AndroidUtilities.getTrimmedString(textToUse) : textToUse;
                            boolean w12 = chatActivityEnterView2.w1();
                            int maxMessageLength2 = chatActivityEnterView2.R.getMessagesController().getMaxMessageLength();
                            if (trimmedString.length() != 0) {
                                if (chatActivityEnterView2.Z2 != null && znVar3 != null) {
                                    if ((i10 != 0) == znVar3.c()) {
                                        chatActivityEnterView2.Z2.M0();
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
                                        for (int i23 = r28; i22 > i20 && i23 < 300; i23++) {
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
                                    if (r17 == false) {
                                        subSequence = AndroidUtilities.getTrimmedString(subSequence);
                                    }
                                    CharSequence[] charSequenceArr = new CharSequence[i19];
                                    charSequenceArr[r28] = subSequence;
                                    ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(chatActivityEnterView2.Q).getEntities(charSequenceArr, w12);
                                    if (chatActivityEnterView2.Z2.C1()) {
                                        int i24 = i19;
                                        charSequence = trimmedString;
                                        if (chatActivityEnterView2.L0 != null) {
                                            sendAnimationData = new MessageObject.SendAnimationData();
                                            charSequence2 = textToUse;
                                            i16 = min;
                                            sendAnimationData.fromPreview = System.currentTimeMillis() - chatActivityEnterView2.M0 < j10 ? i24 : r28;
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
                                            af afVar3 = afVar2;
                                            i17 = i16;
                                            charSequence4 = charSequence2;
                                            boolean z13 = w12;
                                            charSequence5 = charSequence3;
                                            znVar = znVar3;
                                            SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(charSequenceArr[r28].toString(), chatActivityEnterView2.Q2, chatActivityEnterView2.T2, threadMessage, chatActivityEnterView2.X2, chatActivityEnterView2.Y2, entities, null, null, z10, i10, i11, sendAnimationData, checkUpdateStickersOrder);
                                            of3.sendMessageChatArguments = znVar == null ? znVar.H8() : null;
                                            of3.effect_id = this.S4;
                                            of3.payStars = j3;
                                            of3.monoForumPeer = getSendMonoForumPeerId();
                                            of3.suggestionParams = getSendMessageSuggestionParams();
                                            this.S4 = 0L;
                                            afVar3.setEffect(0L);
                                            r(of3);
                                            of3.invert_media = znVar == null && (messagePreviewParams3 = znVar.f5) != null && messagePreviewParams3.webpageTop;
                                            if (znVar != null || (chat = znVar.e) == null || ChatObject.canSendEmbed(chat)) {
                                                r32 = 0;
                                                r32 = 0;
                                                r32 = 0;
                                                z12 = false;
                                                webPage = this.X2;
                                                if (webPage instanceof TLRPC.TL_webPagePending) {
                                                    r72 = 1;
                                                    r72 = 1;
                                                    if (webPage != null) {
                                                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                                                        of3.mediaWebPage = tL_messageMediaWebPage;
                                                        tL_messageMediaWebPage.webpage = this.X2;
                                                        tL_messageMediaWebPage.force_large_media = (znVar == null || (messagePreviewParams2 = znVar.f5) == null || messagePreviewParams2.webpageSmall) ? false : true;
                                                        tL_messageMediaWebPage.force_small_media = (znVar == null || (messagePreviewParams = znVar.f5) == null || !messagePreviewParams.webpageSmall) ? false : true;
                                                    }
                                                } else {
                                                    r72 = 1;
                                                    of3.searchLinks = true;
                                                    of3.mediaWebPage = null;
                                                }
                                            } else {
                                                z12 = false;
                                                of3.searchLinks = false;
                                                r32 = 0;
                                                of3.mediaWebPage = null;
                                                r72 = 1;
                                            }
                                            if (znVar != null) {
                                                znVar.p5 = r32;
                                                znVar.G5 = r32;
                                                MessagePreviewParams messagePreviewParams4 = znVar.f5;
                                                if (messagePreviewParams4 != null) {
                                                    messagePreviewParams4.updateLink(this.Q, null, "", null, null, null);
                                                }
                                                this.X2 = r32;
                                                this.Y2 = r72;
                                                znVar.m8();
                                            }
                                            SendMessagesHelper.getInstance(this.Q).sendMessage(of3);
                                            i20 = i17 + 1;
                                            if (i17 != charSequence5.length()) {
                                                break;
                                            }
                                            afVar2 = afVar3;
                                            i19 = r72;
                                            r28 = z12;
                                            znVar3 = znVar;
                                            textToUse = charSequence4;
                                            w12 = z13;
                                            trimmedString = charSequence5;
                                            str2 = str;
                                            j10 = 200;
                                            chatActivityEnterView2 = this;
                                        }
                                    } else {
                                        MessageObject.SendAnimationData sendAnimationData3 = new MessageObject.SendAnimationData();
                                        charSequence = trimmedString;
                                        sendAnimationData3.fromPreview = System.currentTimeMillis() - chatActivityEnterView2.M0 < j10 ? i19 : r28;
                                        float dp = AndroidUtilities.dp(22.0f);
                                        sendAnimationData3.height = dp;
                                        sendAnimationData3.width = dp;
                                        sf sfVar2 = chatActivityEnterView2.E0;
                                        if (sfVar2 != null) {
                                            sfVar2.getLocationInWindow(chatActivityEnterView2.N2);
                                            sendAnimationData3.x = AndroidUtilities.dp(11.0f) + r12[r28];
                                            sendAnimationData3.y = AndroidUtilities.dp(19.0f) + r12[r27];
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
                                    af afVar32 = afVar2;
                                    i17 = i16;
                                    charSequence4 = charSequence2;
                                    boolean z132 = w12;
                                    charSequence5 = charSequence3;
                                    znVar = znVar3;
                                    SendMessagesHelper.SendMessageParams of32 = SendMessagesHelper.SendMessageParams.of(charSequenceArr[r28].toString(), chatActivityEnterView2.Q2, chatActivityEnterView2.T2, threadMessage, chatActivityEnterView2.X2, chatActivityEnterView2.Y2, entities, null, null, z10, i10, i11, sendAnimationData, checkUpdateStickersOrder2);
                                    of32.sendMessageChatArguments = znVar == null ? znVar.H8() : null;
                                    of32.effect_id = this.S4;
                                    of32.payStars = j3;
                                    of32.monoForumPeer = getSendMonoForumPeerId();
                                    of32.suggestionParams = getSendMessageSuggestionParams();
                                    this.S4 = 0L;
                                    afVar32.setEffect(0L);
                                    r(of32);
                                    of32.invert_media = znVar == null && (messagePreviewParams3 = znVar.f5) != null && messagePreviewParams3.webpageTop;
                                    if (znVar != null) {
                                    }
                                    r32 = 0;
                                    r32 = 0;
                                    r32 = 0;
                                    z12 = false;
                                    webPage = this.X2;
                                    if (webPage instanceof TLRPC.TL_webPagePending) {
                                    }
                                    if (znVar != null) {
                                    }
                                    SendMessagesHelper.getInstance(this.Q).sendMessage(of32);
                                    i20 = i17 + 1;
                                    if (i17 != charSequence5.length()) {
                                    }
                                }
                                if (this.Z2.C1() || (!(i10 == 0 || c()) || c())) {
                                    chatActivityEnterView3 = this;
                                    sf sfVar3 = chatActivityEnterView3.E0;
                                    if (sfVar3 != null) {
                                        sfVar3.setText(str);
                                    }
                                    qg qgVar3 = chatActivityEnterView3.Z2;
                                    if (qgVar3 != null) {
                                        qgVar3.K(charSequence4, z10, i10, i11, j3);
                                    }
                                } else {
                                    this.g0 = z12;
                                    org.telegram.messenger.qf qfVar = new org.telegram.messenger.qf(this, charSequence4, z10, i10, i11, j3);
                                    chatActivityEnterView3 = this;
                                    chatActivityEnterView3.f0 = qfVar;
                                    AndroidUtilities.runOnUIThread(qfVar, 200L);
                                }
                                chatActivityEnterView3.C2 = 0L;
                                chatActivityEnterView3.Q1();
                                return z12;
                            }
                            z12 = false;
                        } else {
                            znVar3.Vb();
                            z12 = false;
                        }
                        chatActivityEnterView3 = chatActivityEnterView2;
                        if (chatActivityEnterView3.H2 && (qgVar = chatActivityEnterView3.Z2) != null) {
                            qgVar.K(null, z10, i10, i11, j3);
                        }
                        chatActivityEnterView3.Q1();
                        return z12;
                    }
                } else {
                    SendMessagesHelper.prepareSendingArticle(chatActivityEnterView5.R, richMessage.blocks, richMessage.photos, richMessage.documents, null, false, chatActivityEnterView5.Q2, chatActivityEnterView5.T2, chatActivityEnterView5.getThreadMessage(), z10, i10, i11, znVar2 != null ? znVar2.H8() : null, chatActivityEnterView5.S4, chatActivityEnterView5.getSendMonoForumPeerId(), j3);
                    chatActivityEnterView2 = this;
                    chatActivityEnterView2.S4 = 0L;
                    afVar.setEffect(0L);
                    chatActivityEnterView2.E0.setText("");
                    chatActivityEnterView2.M();
                    qg qgVar4 = chatActivityEnterView2.Z2;
                    if (qgVar4 != null) {
                        qgVar4.K(null, z10, i10, i11, j3);
                    }
                    chatActivityEnterView2.I(true);
                }
            }
        } else {
            qg qgVar5 = this.Z2;
            if (qgVar5 != null) {
                qgVar5.Z0();
                return false;
            }
            chatActivityEnterView2 = this;
        }
        return false;
    }

    public final void R1() {
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
            yg ygVar = this.F0;
            ygVar.a.l(formatDurationNoHours, false);
            ygVar.invalidate();
            qg qgVar = this.Z2;
            if (qgVar != null) {
                qgVar.z1(ygVar, ygVar.a.getText(), false);
            }
            vd vdVar = new vd(this, 9);
            this.H0 = vdVar;
            AndroidUtilities.runOnUIThread(vdVar, 100L);
        }
        if (c()) {
            return;
        }
        I(true);
    }

    public final void S() {
        gg ggVar = this.U0;
        if (ggVar != null && ggVar.c1 != UserConfig.selectedAccount) {
            this.n1.removeView(ggVar);
            this.U0 = null;
        }
        if (this.U0 != null) {
            return;
        }
        gg ggVar2 = new gg(this, this.P2, this.I2, getContext(), this.d2, this.m1, this.y4, this.W3, this.T0, this.d5 != null);
        this.U0 = ggVar2;
        ggVar2.v0 = true;
        if (!this.y4) {
            ggVar2.S();
        }
        this.U0.I(true, this.J2, this.K2, true);
        this.U0.setVisibility(8);
        this.U0.setShowing(false);
        if (this.d5 != null) {
            gg ggVar3 = this.U0;
            ggVar3.w0 = false;
            ggVar3.setShouldDrawBackground(false);
            this.U0.V0 = true;
        }
        this.U0.setDelegate(new jg(this));
        this.U0.setDragListener(new c2.a(this));
        gg ggVar4 = this.U0;
        if (ggVar4 != null) {
            ggVar4.K(-this.Q2, !this.z0, !this.b);
        }
        t();
        D();
    }

    public final void S0(boolean z10, boolean z11) {
        T0(z10, z11, false);
    }

    public final void T() {
        if (this.S0 != null) {
            return;
        }
        ef efVar = new ef(this, getContext(), 2);
        this.S0 = efVar;
        efVar.setScaleType(ImageView.ScaleType.CENTER);
        ef efVar2 = this.S0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(g0(org.telegram.ui.ActionBar.i6.Wk), false);
        this.F3 = animatedArrowDrawable;
        efVar2.setImageDrawable(animatedArrowDrawable);
        this.S0.setVisibility(8);
        this.S0.setScaleX(0.1f);
        this.S0.setScaleY(0.1f);
        this.S0.setAlpha(0.0f);
        this.S0.setBackground(org.telegram.ui.ActionBar.i6.g0(g0(org.telegram.ui.ActionBar.i6.i6), 1, -1));
        this.A1.addView(this.S0, w7.x5.e(44, 44, 85));
        this.S0.setOnClickListener(new xd(this, 5));
        this.S0.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
    }

    public final void T0(boolean z10, boolean z11, boolean z12) {
        if ((this.J2 != z10 || this.K2 != z11) && this.U0 != null) {
            if (this.W0 && !z12) {
                this.G3 = true;
                k0(false);
            } else if (z12) {
                G0();
            }
        }
        this.I2 = true;
        this.J2 = z10;
        this.K2 = z11;
        gg ggVar = this.U0;
        if (ggVar != null) {
            ggVar.I(true, z10, z11, true);
        }
        b1(false, !this.j2);
    }

    public final void U() {
        if (this.E0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.W3;
        sf sfVar = new sf(this, context, e6Var);
        this.E0 = sfVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            sfVar.setFallbackLineSpacing(false);
        }
        if (i10 >= 35) {
            this.E0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.E0.setDelegate(new de(this));
        org.telegram.ui.zn znVar = this.P2;
        if (znVar == null || znVar.getParentLayout() == null || !((ActionBarLayout) znVar.getParentLayout()).b) {
            this.E0.setWindowView(this.O2.getWindow().getDecorView());
        } else {
            this.E0.setWindowView(znVar.getParentLayout().getWindow().getDecorView());
        }
        TLRPC.EncryptedChat encryptedChat = znVar != null ? znVar.h : null;
        this.E0.setAllowTextEntitiesIntersection(w1());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        int i11 = ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) ? 285212672 : TLObject.FLAG_28;
        this.E0.setIncludeFontPadding(false);
        this.E0.setImeOptions(i11);
        sf sfVar2 = this.E0;
        int inputType = sfVar2.getInputType() | 147456;
        this.a = inputType;
        sfVar2.setInputType(inputType);
        E1(false);
        this.E0.setSingleLine(false);
        this.E0.setMaxLines(6);
        this.E0.setTextSize(1, 18.0f);
        this.E0.setGravity(80);
        this.E0.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(10.0f));
        this.E0.setBackgroundDrawable(null);
        this.E0.setTextColor(g0(org.telegram.ui.ActionBar.i6.Ud));
        this.E0.setLinkTextColor(g0(org.telegram.ui.ActionBar.i6.hc));
        this.E0.setHighlightColor(g0(org.telegram.ui.ActionBar.i6.uf));
        sf sfVar3 = this.E0;
        int i12 = org.telegram.ui.ActionBar.i6.Vd;
        sfVar3.setHintColor(g0(i12));
        this.E0.setHintTextColor(g0(i12));
        this.E0.setCursorColor(g0(org.telegram.ui.ActionBar.i6.Wd));
        this.E0.setHandlesColor(g0(org.telegram.ui.ActionBar.i6.vf));
        sf sfVar4 = this.E0;
        boolean z10 = this.X3;
        FrameLayout.LayoutParams a2 = w7.x5.a(-2.0f, 52.0f, 0.0f, z10 ? 50.0f : 2.0f, 1.5f, -1, 80);
        pe peVar = this.y1;
        peVar.addView(sfVar4, 1, a2);
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(getContext(), this.Q, e6Var);
        this.C1 = previewView;
        previewView.setAllowActions(false);
        this.C1.setMaxHeight(AndroidUtilities.dp(150.0f));
        this.C1.setMinHeight(AndroidUtilities.dp(88.0f));
        this.C1.setVisibility(8);
        this.C1.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
        this.C1.setOnClickListener(new xd(this, 10));
        peVar.addView(this.C1, 2, w7.x5.a(-2.0f, 44.0f, 0.0f, (z10 ? 50 : 2) - 8, 1.5f, -1, 80));
        this.E0.setOnKeyListener(new tf(this));
        this.E0.setOnEditorActionListener(new m.s2(this, 3));
        this.E0.addTextChangedListener(new uf(this));
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
        E1(false);
        O1(znVar != null && znVar.getFragmentBeginToShow());
        if (znVar != null) {
            znVar.D6(false, false);
        }
        F1(this.P4);
    }

    public final void U0() {
        ci.d4 d4Var = this.L;
        if (d4Var == null) {
            return;
        }
        d4Var.s(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBirthdayHint, UserObject.getFirstName(this.P2.i()))), this.L.getTextPaint().getFontMetricsInt(), new vd(this, 26)));
        ci.d4 d4Var2 = this.L;
        d4Var2.h = ci.d4.a(d4Var2.getText(), this.L.getTextPaint());
    }

    public final void V() {
        if (this.e1 != null) {
            return;
        }
        ne neVar = new ne(this, getContext(), 2);
        this.e1 = neVar;
        neVar.setVisibility(this.b3 == null ? 8 : 0);
        this.e1.setFocusable(true);
        this.e1.setFocusableInTouchMode(true);
        this.e1.setClickable(true);
        this.y1.addView(this.e1, w7.x5.e(-1, 44, 80));
        fk0 fk0Var = new fk0(getContext());
        this.g1 = fk0Var;
        fk0Var.setScaleType(ImageView.ScaleType.CENTER);
        this.g1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.g1.getAnimatedDrawable().o0 = true;
        K1();
        this.g1.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        this.g1.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(g0(org.telegram.ui.ActionBar.i6.i6), 1, -1));
        this.e1.addView(this.g1, w7.x5.d(44.0f, 44));
        this.g1.setOnClickListener(new xd(this, 6));
        a91 a91Var = new a91(getContext());
        this.f1 = a91Var;
        a91Var.setVisibility(4);
        a91 a91Var2 = this.f1;
        a91Var2.S = !this.y4;
        a91Var2.setRoundFrames(true);
        this.f1.setDelegate(new gf(this));
        this.e1.addView(this.f1, w7.x5.a(-1.0f, 56.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        Context context = getContext();
        y81 y81Var = new y81(context);
        TextPaint textPaint = new TextPaint(1);
        y81Var.d = textPaint;
        y81Var.e = -1L;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        y81Var.b = context.getDrawable(R.drawable.tooltip_arrow);
        y81Var.a = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.qf, false));
        y81Var.b();
        y81Var.setTime(0);
        this.f1.setTimeHintView(y81Var);
        this.m1.addView(y81Var, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 52.0f, -1, 80));
        ll0 ll0Var = new ll0(getContext(), this.W3);
        this.h1 = ll0Var;
        this.e1.addView(ll0Var, w7.x5.a(32.0f, 44.0f, 0.0f, 4.0f, 0.0f, -1, 19));
        F1(this.P4);
    }

    public final void V0(a0.i iVar, boolean z10) {
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
        z1(z10);
        E(z10);
    }

    public final void W() {
        ug ugVar = this.O1;
        sw0 sw0Var = this.m1;
        if (ugVar == null) {
            ug ugVar2 = new ug(this, getContext());
            this.O1 = ugVar2;
            ugVar2.setVisibility(8);
            sw0Var.addView(this.O1, w7.x5.e(-1, -2, 80));
        }
        if (this.N1 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.N1 = recordCircle;
        recordCircle.setVisibility(8);
        sw0Var.addView(this.N1, w7.x5.e(-1, -2, 80));
    }

    public final void W0(int i10, boolean z10, boolean z11) {
        this.o2 = i10;
        if (this.p2 == z10) {
            return;
        }
        this.p2 = z10;
        z1(z11);
    }

    public final void X() {
        if (this.d1 != null || getContext() == null) {
            return;
        }
        ai.x5 x5Var = new ai.x5(getContext(), 14);
        this.d1 = x5Var;
        x5Var.setClipChildren(false);
        this.d1.setVisibility(8);
        this.y1.addView(this.d1, w7.x5.d(44.0f, -1));
        this.d1.setOnTouchListener(new bi.d(12));
        ai.x5 x5Var2 = this.d1;
        SlideTextView slideTextView = new SlideTextView(getContext());
        this.k1 = slideTextView;
        x5Var2.addView(slideTextView, w7.x5.a(-1.0f, 45.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        this.d.setPadding(AndroidUtilities.dp(13.0f), 0, 0, 0);
        this.d.setFocusable(false);
        LinearLayout linearLayout2 = this.d;
        wg wgVar = new wg(this, getContext());
        this.l1 = wgVar;
        linearLayout2.addView(wgVar, w7.x5.t(28, 28, 16, 0, 0, 0, 0));
        LinearLayout linearLayout3 = this.d;
        zg zgVar = new zg(this, getContext());
        this.Y0 = zgVar;
        linearLayout3.addView(zgVar, w7.x5.t(-1, -1, 16, 6, 0, 0, 0));
        this.d1.addView(this.d, w7.x5.e(-1, -1, 16));
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
    public final void X0(MessageObject messageObject, boolean z10, boolean z11) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        sf sfVar;
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
                dg dgVar = new dg(this, this.O2, this.W3);
                this.H1 = dgVar;
                dgVar.setVisibility(8);
                this.X0 = false;
                this.H1.setDelegate(new de(this));
                this.n1.addView(this.H1);
            }
            this.m2 = messageObject;
            if (messageObject != null) {
                TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyKeyboardMarkup) {
                    tL_replyKeyboardMarkup = (TLRPC.TL_replyKeyboardMarkup) replyMarkup;
                    this.n2 = tL_replyKeyboardMarkup;
                    dg dgVar2 = this.H1;
                    Point point = AndroidUtilities.displaySize;
                    dgVar2.setPanelHeight(point.x <= point.y ? this.y2 : this.x2);
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
                        if (z13 && (((sfVar = this.E0) == null || sfVar.length() == 0) && !r0())) {
                            r1(1, 1, true, true);
                        }
                    } else if (r0() && this.f2 == 1) {
                        if (z11) {
                            this.p3 = true;
                            G0();
                        } else {
                            r1(0, 1, true, true);
                        }
                    }
                    z1(true);
                }
            }
            tL_replyKeyboardMarkup = null;
            this.n2 = tL_replyKeyboardMarkup;
            dg dgVar22 = this.H1;
            Point point2 = AndroidUtilities.displaySize;
            dgVar22.setPanelHeight(point2.x <= point2.y ? this.y2 : this.x2);
            if (this.n2 == null) {
            }
            z1(true);
        }
    }

    public final void Y() {
        if (this.J1 != null || this.P2 == null) {
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
        int g02 = g0(org.telegram.ui.ActionBar.i6.Wk);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(g02, mode));
        mutate2.setColorFilter(new PorterDuffColorFilter(g0(org.telegram.ui.ActionBar.i6.jf), mode));
        fr frVar = new fr(mutate, mutate2);
        cf cfVar = new cf(this, getContext());
        this.J1 = cfVar;
        cfVar.setImageDrawable(frVar);
        this.J1.setVisibility(8);
        this.J1.setContentDescription(LocaleController.getString(R.string.ScheduledMessages));
        this.J1.setScaleType(ImageView.ScaleType.CENTER);
        this.J1.setBackground(org.telegram.ui.ActionBar.i6.g0(g0(org.telegram.ui.ActionBar.i6.i6), 1, -1));
        this.y1.addView(this.J1, 2, w7.x5.e(44, 44, 85));
        this.J1.setOnClickListener(new xd(this, 2));
        this.J1.setTranslationX(0.0f);
    }

    public final void Y0(MessageObject messageObject, String str, boolean z10, boolean z11) {
        sf sfVar;
        SendMessagesHelper.SendMessageParams of2;
        String sb2;
        if (str == null || getVisibility() != 0 || (sfVar = this.E0) == null) {
            return;
        }
        r16 = null;
        TLRPC.User user = null;
        if (!z10) {
            if (this.G0 > 0 && !c()) {
                qg qgVar = this.Z2;
                if (qgVar != null) {
                    yg ygVar = this.F0;
                    qgVar.z1(ygVar, ygVar.a.getText(), true);
                    return;
                }
                return;
            }
            TLRPC.User user2 = (messageObject == null || !DialogObject.isChatDialog(this.Q2)) ? null : this.R.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
            if ((this.o2 != 1 || z11) && user2 != null && user2.bot && !str.contains("@")) {
                Locale locale = Locale.US;
                of2 = SendMessagesHelper.SendMessageParams.of(a1.g.D(str, "@", UserObject.getPublicUsername(user2)), this.Q2, this.T2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            } else {
                of2 = SendMessagesHelper.SendMessageParams.of(str, this.Q2, this.T2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            }
            org.telegram.ui.zn znVar = this.P2;
            of2.sendMessageChatArguments = znVar != null ? znVar.H8() : null;
            of2.effect_id = this.S4;
            this.S4 = 0L;
            this.J0.setEffect(0L);
            r(of2);
            SendMessagesHelper.getInstance(this.Q).sendMessage(of2);
            return;
        }
        String obj = sfVar.getText().toString();
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
            StringBuilder j3 = sc.v.j(str, " ");
            j3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            sb2 = j3.toString();
        }
        this.R2 = true;
        this.E0.setText(sb2);
        sf sfVar2 = this.E0;
        sfVar2.setSelection(sfVar2.getText().length());
        this.R2 = false;
        qg qgVar2 = this.Z2;
        if (qgVar2 != null) {
            qgVar2.r1(this.E0.getText(), true, false);
        }
        if (this.z2 || this.f2 != -1) {
            return;
        }
        F0();
    }

    public final void Z() {
        if (this.p0 != null || getContext() == null) {
            return;
        }
        bq0 bq0Var = new bq0(getContext());
        ImageReceiver imageReceiver = new ImageReceiver(bq0Var);
        bq0Var.a = imageReceiver;
        bq0Var.b = new j9((org.telegram.ui.ActionBar.e6) null);
        Paint paint = new Paint(1);
        bq0Var.d = paint;
        Paint paint2 = new Paint(1);
        bq0Var.e = paint2;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.cf, false));
        paint2.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.bf, false));
        int dp = AndroidUtilities.dp(18.0f);
        int m12 = org.telegram.ui.ActionBar.i6.m1(0.2f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
        org.telegram.ui.Cells.z j02 = org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, 0, m12, m12);
        bq0Var.c = j02;
        j02.setCallback(bq0Var);
        bq0Var.setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, ""));
        this.p0 = bq0Var;
        bq0Var.setOnClickListener(new xd(this, 16));
        this.p0.setVisibility(8);
        this.y1.addView(this.p0, w7.x5.a(36.0f, 4.66f, 4.0f, 4.66f, 4.0f, 36, 83));
    }

    public final void Z0(int i10, long j3) {
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
        M1(false);
        G1(false);
        G();
        D();
        E1(false);
        if (this.E0 != null) {
            org.telegram.ui.zn znVar = this.P2;
            O1(znVar != null && znVar.getFragmentBeginToShow());
        }
    }

    @Override // org.telegram.ui.Components.mz0
    public final void a(ci.h2 h2Var) {
        sf sfVar = this.E0;
        if (sfVar != null) {
            sfVar.addTextChangedListener(h2Var);
            return;
        }
        if (this.H4 == null) {
            this.H4 = new ArrayList();
        }
        this.H4.add(h2Var);
    }

    public final boolean a0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject, MessageObject messageObject2, org.telegram.ui.zi ziVar) {
        org.telegram.ui.zn znVar;
        int i10;
        int i11 = 0;
        if (keyboardButtonProto != null && messageObject2 != null && ((znVar = this.P2) == null || znVar.R3 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) zf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                AndroidUtilities.addToClipboard(tL_inlineButtonTypeCopy.copy_text);
                ad.a0(znVar).i(LocaleController.formatString(R.string.ExactTextCopied, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_keyboardButton.text, this.Q2, messageObject, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = znVar != null ? znVar.H8() : null;
                    of2.effect_id = this.S4;
                    this.S4 = 0L;
                    this.J0.setEffect(0L);
                    SendMessagesHelper.getInstance(this.Q).sendMessage(of2);
                    return true;
                }
            }
            Activity activity = this.O2;
            if (tL_inlineButtonTypeUrl != null) {
                if (of.f.y(tL_inlineButtonTypeUrl.url)) {
                    of.f.q(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, ziVar);
                    return true;
                }
                g5.q0(this.P2, tL_inlineButtonTypeUrl.url, false, true, true, false, ziVar, null, this.W3);
                return true;
            }
            if (zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                znVar.vb(messageObject2, 2);
                return true;
            }
            if (!zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                if (zf.c.b(keyboardButtonProto)) {
                    TLRPC.Message message = messageObject2.messageOwner;
                    long j3 = message.via_bot_id;
                    if (j3 == 0) {
                        j3 = message.from_id.user_id;
                    }
                    eg egVar = new eg(this, messageObject2, j3, keyboardButtonProto, messageObject, MessagesController.getInstance(this.Q).getUser(Long.valueOf(j3)));
                    if (SharedPrefsHelper.isWebViewConfirmShown(this.Q, j3) || MessagesController.getInstance(this.Q).whitelistedBots.contains(Long.valueOf(j3))) {
                        egVar.run();
                        return true;
                    }
                    g5.n(znVar, MessagesController.getInstance(this.Q).getUser(Long.valueOf(this.Q2)), new a3.h0(this, egVar, j3, 18), null);
                    return true;
                }
                if (zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String string = LocaleController.getString("ShareYouLocationTitle", R.string.ShareYouLocationTitle);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.getString("ShareYouLocationInfo", R.string.ShareYouLocationInfo);
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new ai.r5(this, messageObject2, keyboardButtonProto, 20));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    znVar.showDialog(b2Var);
                    return true;
                }
                if (zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                    SendMessagesHelper.getInstance(this.Q).sendCallback(true, messageObject2, keyboardButtonProto, znVar);
                    return true;
                }
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!znVar.Ga(tL_inlineButtonTypeSwitchInline)) {
                        if (!tL_inlineButtonTypeSwitchInline.same_peer) {
                            Bundle d = org.telegram.messenger.bi.d(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                d.putBoolean("allowGroups", false);
                                d.putBoolean("allowMegagroups", false);
                                d.putBoolean("allowLegacyGroups", false);
                                d.putBoolean("allowUsers", false);
                                d.putBoolean("allowChannels", false);
                                d.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i11 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i11);
                                    i11++;
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                                    if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                        d.putBoolean("allowUsers", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                        d.putBoolean("allowBots", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                        d.putBoolean("allowChannels", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                        d.putBoolean("allowLegacyGroups", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                        d.putBoolean("allowMegagroups", true);
                                    }
                                }
                            }
                            org.telegram.ui.ty tyVar = new org.telegram.ui.ty(d);
                            tyVar.C2 = new ai.r5(this, messageObject2, tL_inlineButtonTypeSwitchInline, 21);
                            znVar.presentFragment(tyVar);
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
                        znVar.presentFragment(new ProfileActivity(bundle, null));
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
                                ke keVar = new ke(this, messageObject2, tL_buttonTypeRequestPeer);
                                org.telegram.ui.sj0 sj0Var = org.telegram.ui.sj0.u0;
                                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                                if (R == null || org.telegram.ui.sj0.u0 != null) {
                                    return false;
                                }
                                org.telegram.ui.sj0 sj0Var2 = new org.telegram.ui.sj0(R, i10, bool, bool2, keVar);
                                sj0Var2.show();
                                org.telegram.ui.sj0.u0 = sj0Var2;
                                return false;
                            }
                            Bundle d10 = org.telegram.messenger.bi.d(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = messageObject2.messageOwner;
                            if (message3 != null) {
                                TLRPC.Peer peer = message3.from_id;
                                if (peer instanceof TLRPC.TL_peerUser) {
                                    d10.putLong("requestPeerBotId", peer.user_id);
                                }
                            }
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                d10.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            org.telegram.ui.ty tyVar2 = new org.telegram.ui.ty(d10);
                            tyVar2.C2 = new ke(this, messageObject2, tL_buttonTypeRequestPeer);
                            znVar.presentFragment(tyVar2);
                            return false;
                        }
                        TLRPC.User i12 = getParentFragment() != null ? getParentFragment().i() : MessagesController.getInstance(this.Q).getUser(Long.valueOf(this.Q2));
                        if (i12 != null) {
                            sr.a(getContext(), this.Q, i12, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new ai.f4(this, messageObject2, tL_buttonTypeRequestPeer, i12, 5), this.W3, null);
                            return false;
                        }
                    }
                }
                return true;
            }
            TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) zf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
            Boolean valueOf = (tL_buttonTypeRequestPoll.flags & 1) != 0 ? Boolean.valueOf(tL_buttonTypeRequestPoll.quiz) : null;
            znVar.ca();
            ai.h4 h4Var = znVar.J1;
            if (h4Var != null) {
                h4Var.V0 = false;
                h4Var.A1.setVisibility(8);
                h4Var.W1(false, valueOf);
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
    public final void a1(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10) {
        float f7;
        float f10;
        int i10;
        ne neVar;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i11;
        sf sfVar;
        sf sfVar2;
        ne neVar2;
        boolean z11;
        cf cfVar;
        if (this.b3 == null && this.e3 == null && this.Z1 != messageObject) {
            U();
            boolean z12 = this.Z1 != null;
            this.Z1 = messageObject;
            this.a2 = z10;
            ne neVar3 = this.A1;
            org.telegram.ui.yd ydVar = this.p1;
            ImageView imageView = this.P0;
            hg.l lVar = this.r1;
            xe xeVar = this.Z0;
            if (messageObject != null) {
                this.R4 = groupedMessages != null ? groupedMessages.captionAbove : messageObject.messageOwner.invert_media;
                R(false);
                this.F1.setOnClickListener(new xd(this, 17));
                if (this.Z1.needResendWhenEdit()) {
                    long j3 = this.u4;
                    if (j3 > 0) {
                        this.F1.i(1, j3, true);
                        this.F1.setLayoutParams(w7.x5.e(44, 44, 85));
                        this.F1.requestLayout();
                        neVar = neVar3;
                        this.F1.setOnLongClickListener(new i(this, messageObject, groupedMessages, 1));
                        this.F1.setVisibility(0);
                        this.F1.setScaleX(0.1f);
                        this.F1.setScaleY(0.1f);
                        this.F1.setAlpha(0.0f);
                        this.F1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(hs.f).start();
                        if (z10) {
                            this.c0 = this.R.getMessagesController().getMaxMessageLength();
                            charSequence = this.Z1.messageText;
                        } else {
                            this.c0 = this.R.getMessagesController().maxCaptionLength;
                            charSequence = this.Z1.caption;
                        }
                        if (charSequence == null) {
                            sf sfVar3 = this.E0;
                            TextPaint paint = sfVar3 != null ? sfVar3.getPaint() : null;
                            if (paint == null) {
                                paint = new TextPaint();
                                paint.setTextSize(AndroidUtilities.dp(18.0f));
                            }
                            charSequence2 = q(this.Z1.messageOwner.entities, charSequence, paint.getFontMetricsInt());
                        } else {
                            charSequence2 = "";
                        }
                        if (this.V1 == null && !z12) {
                            sf sfVar4 = this.E0;
                            this.V1 = (sfVar4 != null || sfVar4.length() <= 0) ? null : this.E0.getText();
                            this.W1 = this.Y2;
                        }
                        MessageObject messageObject2 = this.Z1;
                        TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                        this.Y2 = ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia.manual) && ((i11 = messageObject2.type) == 0 || i11 == 19);
                        if (this.z2) {
                            ea eaVar = new ea(5, this, charSequence2);
                            this.W = eaVar;
                            AndroidUtilities.runOnUIThread(eaVar, 200L);
                        } else {
                            ea eaVar2 = this.W;
                            if (eaVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(eaVar2);
                                this.W = null;
                            }
                            setFieldText(charSequence2);
                        }
                        sfVar = this.E0;
                        if (sfVar != null) {
                            sfVar.requestFocus();
                        }
                        F0();
                        sfVar2 = this.E0;
                        if (sfVar2 != null) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sfVar2.getLayoutParams();
                            layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                            this.E0.setLayoutParams(layoutParams);
                        }
                        neVar2 = this.e1;
                        if (neVar2 == null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) neVar2.getLayoutParams();
                            z11 = false;
                            layoutParams2.rightMargin = 0;
                            this.e1.setLayoutParams(layoutParams2);
                        } else {
                            z11 = false;
                        }
                        getSendButtonInternal().setVisibility(8);
                        setSlowModeButtonVisible(z11);
                        imageView.setVisibility(8);
                        xeVar.setVisibility(8);
                        ydVar.setVisibility(8);
                        if (lVar != null) {
                            this.v1 = 0.0f;
                            lVar.setAlpha(0.0f);
                            lVar.setScaleX(0.5f);
                            lVar.setScaleY(0.5f);
                        }
                        neVar.setVisibility(8);
                        cfVar = this.J1;
                        if (cfVar != null) {
                            cfVar.setVisibility(8);
                        }
                    }
                }
                neVar = neVar3;
                this.F1.i(1, 0L, true);
                this.F1.setLayoutParams(w7.x5.e(44, 44, 85));
                this.F1.requestLayout();
                this.F1.setOnLongClickListener(new i(this, messageObject, groupedMessages, 1));
                this.F1.setVisibility(0);
                this.F1.setScaleX(0.1f);
                this.F1.setScaleY(0.1f);
                this.F1.setAlpha(0.0f);
                this.F1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(hs.f).start();
                if (z10) {
                }
                if (charSequence == null) {
                }
                if (this.V1 == null) {
                    sf sfVar42 = this.E0;
                    this.V1 = (sfVar42 != null || sfVar42.length() <= 0) ? null : this.E0.getText();
                    this.W1 = this.Y2;
                }
                MessageObject messageObject22 = this.Z1;
                TLRPC.MessageMedia messageMedia2 = messageObject22.messageOwner.media;
                this.Y2 = ((messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia2.manual) && ((i11 = messageObject22.type) == 0 || i11 == 19);
                if (this.z2) {
                }
                sfVar = this.E0;
                if (sfVar != null) {
                }
                F0();
                sfVar2 = this.E0;
                if (sfVar2 != null) {
                }
                neVar2 = this.e1;
                if (neVar2 == null) {
                }
                getSendButtonInternal().setVisibility(8);
                setSlowModeButtonVisible(z11);
                imageView.setVisibility(8);
                xeVar.setVisibility(8);
                ydVar.setVisibility(8);
                if (lVar != null) {
                }
                neVar.setVisibility(8);
                cfVar = this.J1;
                if (cfVar != null) {
                }
            } else {
                ea eaVar3 = this.W;
                if (eaVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(eaVar3);
                    this.W = null;
                }
                af afVar = this.F1;
                if (afVar != null) {
                    afVar.setVisibility(8);
                }
                this.c0 = -1;
                this.Z2.y();
                neVar3.setVisibility(0);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                imageView.setAlpha(0.0f);
                imageView.setVisibility(8);
                int i12 = this.G0;
                yg ygVar = this.F0;
                if (i12 <= 0 || c()) {
                    getSendButtonInternal().setScaleX(0.1f);
                    getSendButtonInternal().setScaleY(0.1f);
                    getSendButtonInternal().setAlpha(0.0f);
                    getSendButtonInternal().setVisibility(8);
                    ygVar.setScaleX(0.1f);
                    ygVar.setScaleY(0.1f);
                    ygVar.setAlpha(0.0f);
                    setSlowModeButtonVisible(false);
                    f7 = 1.0f;
                    ydVar.setScaleX(1.0f);
                    this.E = 1.0f;
                    y1();
                    ydVar.setVisibility(0);
                    if (lVar != null) {
                        this.v1 = 1.0f;
                        lVar.setAlpha(1.0f);
                        lVar.setScaleX(1.0f);
                        lVar.setScaleY(1.0f);
                    }
                    xeVar.setScaleX(1.0f);
                    xeVar.setScaleY(1.0f);
                    xeVar.setAlpha(1.0f);
                    xeVar.setVisibility(0);
                } else {
                    if (this.G0 == Integer.MAX_VALUE) {
                        getSendButtonInternal().setScaleX(1.0f);
                        getSendButtonInternal().setScaleY(1.0f);
                        getSendButtonInternal().setAlpha(1.0f);
                        getSendButtonInternal().setVisibility(0);
                        ygVar.setScaleX(0.1f);
                        ygVar.setScaleY(0.1f);
                        f10 = 0.0f;
                        ygVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        i10 = 8;
                    } else {
                        f10 = 0.0f;
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        i10 = 8;
                        getSendButtonInternal().setVisibility(8);
                        ygVar.setScaleX(1.0f);
                        ygVar.setScaleY(1.0f);
                        ygVar.setAlpha(1.0f);
                        setSlowModeButtonVisible(true);
                    }
                    ydVar.setScaleX(0.01f);
                    this.E = f10;
                    y1();
                    ydVar.setVisibility(i10);
                    if (lVar != null) {
                        this.v1 = f10;
                        lVar.setAlpha(f10);
                        lVar.setScaleX(0.5f);
                        lVar.setScaleY(0.5f);
                    }
                    xeVar.setScaleX(0.1f);
                    xeVar.setScaleY(0.1f);
                    xeVar.setAlpha(f10);
                    xeVar.setVisibility(i10);
                    f7 = 1.0f;
                }
                Y();
                cf cfVar2 = this.J1;
                if (cfVar2 != null && cfVar2.getTag() != null) {
                    this.J1.setScaleX(f7);
                    this.J1.setScaleY(f7);
                    this.J1.setAlpha(f7);
                    this.J1.setVisibility(0);
                }
                org.telegram.ui.zn znVar = this.P2;
                if (znVar != null) {
                    znVar.p5 = null;
                    znVar.G5 = null;
                    MessagePreviewParams messagePreviewParams = znVar.f5;
                    if (messagePreviewParams != null) {
                        messagePreviewParams.updateLink(this.Q, null, "", null, null, null);
                    }
                    this.X2 = null;
                    this.Y2 = true;
                    znVar.m8();
                }
                U();
                sf sfVar5 = this.E0;
                if (sfVar5 != null) {
                    sfVar5.setText(this.V1);
                    sf sfVar6 = this.E0;
                    sfVar6.setSelection(sfVar6.length());
                }
                this.V1 = null;
                this.Y2 = this.W1;
                if (getVisibility() == 0) {
                    this.Z2.B2();
                }
                F1(1);
            }
            E1(true);
            O1(true);
            C1();
            L1();
        }
    }

    @Override // org.telegram.ui.Components.uy0
    public final boolean b() {
        org.telegram.ui.zn znVar = this.P2;
        return znVar != null && znVar.G6();
    }

    public final void b0() {
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
        org.telegram.ui.zn znVar = this.P2;
        if (needResendWhenEdit && !ChatObject.canManageMonoForum(this.Q, this.Z1.getDialogId())) {
            if (znVar == null || (of3 = znVar.g5) == null) {
                of3 = MessageSuggestionParams.of(this.Z1.messageOwner.suggested_post);
            }
            if (!yh.m5.U(this.Q, of3.amount)) {
                if (znVar != null) {
                    znVar.Xb(of3);
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
            o1();
            return;
        }
        if (this.R1 != 0) {
            k1(0, true);
            this.U0.u(false);
            if (this.z3) {
                l1(false, true, false, true);
                this.l3 = true;
                AndroidUtilities.runOnUIThread(new vd(this, 27), 200L);
            }
        }
        sf sfVar = this.E0;
        CharSequence textToUse = sfVar == null ? "" : sfVar.getTextToUse();
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
        ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.Q).getEntities(charSequenceArr, w1());
        if (!TextUtils.equals(charSequenceArr[0], this.Z1.messageText) || ((entities != null && !entities.isEmpty()) || !this.Z1.messageOwner.entities.isEmpty() || (this.Z1.messageOwner.media instanceof TLRPC.TL_messageMediaWebPage))) {
            MessageObject messageObject3 = this.Z1;
            messageObject3.editingMessage = charSequenceArr[0];
            messageObject3.editingMessageEntities = entities;
            messageObject3.editingMessageSearchWebPage = this.Y2;
            if (znVar != null && (chat = znVar.e) != null && (((i10 = messageObject3.type) == 0 || i10 == 19) && !ChatObject.canSendEmbed(chat))) {
                MessageObject messageObject4 = this.Z1;
                messageObject4.editingMessageSearchWebPage = false;
                TLRPC.Message message = messageObject4.messageOwner;
                message.flags &= -513;
                message.media = null;
            } else if (znVar == null || (messagePreviewParams = znVar.f5) == null) {
                MessageObject messageObject5 = this.Z1;
                messageObject5.editingMessageSearchWebPage = false;
                int i11 = messageObject5.type;
                if (i11 == 0 || i11 == 19) {
                    TLRPC.Message message2 = messageObject5.messageOwner;
                    message2.flags |= 512;
                    message2.media = new TLRPC.TL_messageMediaEmpty();
                }
            } else {
                if (znVar.G5 instanceof TLRPC.TL_webPagePending) {
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
                    this.Z1.messageOwner.media.webpage = znVar.f5.webpage;
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
                MessagePreviewParams messagePreviewParams2 = znVar.f5;
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
                if (znVar == null || (of2 = znVar.g5) == null) {
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
        a1(null, null, false);
    }

    public final void b1(boolean z10, boolean z11) {
        bh bhVar;
        sf sfVar;
        ne neVar;
        qe qeVar = this.Q0;
        if (qeVar == null) {
            return;
        }
        if (this.w2 == 1 || ((neVar = this.e1) != null && neVar.getVisibility() == 0)) {
            this.h = 0.0f;
            this.n = 0.0f;
            D1();
            z11 = false;
        }
        bh bhVar2 = bh.f;
        bh bhVar3 = bh.e;
        if (!z10 || this.f2 != 0) {
            gg ggVar = this.U0;
            int i10 = ggVar == null ? MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0) : ggVar.getCurrentPage();
            bhVar = (i10 == 0 || !((this.J2 || this.K2) && ((sfVar = this.E0) == null || TextUtils.isEmpty(sfVar.getText())))) ? bhVar3 : i10 == 1 ? bh.c : bhVar2;
        } else if (!this.z0) {
            return;
        } else {
            bhVar = bh.d;
        }
        if (!this.z0 && bhVar == bhVar3) {
            bhVar3 = bhVar2;
        } else if (this.b || bhVar == bhVar3) {
            bhVar3 = bhVar;
        }
        qeVar.j(bhVar3, z11);
        if (bhVar3 == bhVar2 && this.U0 == null) {
            MediaDataController.getInstance(this.Q).loadRecents(0, true, true, false);
            ArrayList<String> arrayList = MessagesController.getInstance(this.Q).gifSearchEmojies;
            int min = Math.min(10, arrayList.size());
            for (int i11 = 0; i11 < min; i11++) {
                Emoji.preloadEmoji(arrayList.get(i11));
            }
        }
    }

    @Override // org.telegram.ui.Components.uy0
    public final boolean c() {
        org.telegram.ui.zn znVar = this.P2;
        return znVar != null && znVar.c();
    }

    public final void c0(Canvas canvas, boolean z10) {
        if (this.y4) {
            int y3 = (int) com.google.android.gms.internal.vision.e2.y(1.0f, this.C4, org.telegram.ui.ActionBar.i6.i3.getIntrinsicHeight(), this.T1);
            View view = this.G1;
            if (view != null && view.getVisibility() == 0) {
                y3 = (int) (((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + y3);
            }
            int intrinsicHeight = org.telegram.ui.ActionBar.i6.i3.getIntrinsicHeight() + y3;
            if (z10) {
                org.telegram.ui.ActionBar.i6.i3.setAlpha((int) (this.C4 * 255.0f));
                org.telegram.ui.ActionBar.i6.i3.setBounds(0, y3, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.i6.i3.draw(canvas);
            }
            if (!this.x4) {
                float f7 = intrinsicHeight;
                float width = getWidth();
                float height = getHeight();
                org.telegram.ui.ActionBar.e6 e6Var = this.W3;
                Paint F = e6Var != null ? e6Var.F("paintChatComposeBackground") : null;
                if (F == null) {
                    F = org.telegram.ui.ActionBar.i6.T0("paintChatComposeBackground");
                }
                canvas.drawRect(0.0f, f7, width, height, F);
                return;
            }
            int g02 = g0(org.telegram.ui.ActionBar.i6.Sd);
            Paint paint = this.B4;
            paint.setColor(g02);
            if (!SharedConfig.chatBlurEnabled() || this.m1 == null) {
                canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint);
            } else {
                this.D4.set(0, intrinsicHeight, getWidth(), getHeight());
                this.m1.J(canvas, getTop(), this.D4, paint, false);
            }
        }
    }

    public final void c1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.O2.getSystemService("accessibility");
        if (this.E0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        try {
            this.E0.requestFocus();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.uy0
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        if (this.l5) {
            return;
        }
        org.telegram.ui.pn pnVar = this.V2;
        org.telegram.ui.zn znVar = this.P2;
        if (pnVar != null && znVar != null && pnVar.f) {
            znVar.Vb();
            return;
        }
        if (!c() || i10 != 0) {
            g5.Z(this.Q, 1, this.Q2, new ie(this, document, str, sendAnimationData, z11, i10, i11, obj, z10));
            return;
        }
        g5.L(this.O2, znVar.a(), new org.telegram.messenger.hk(this, document, str, obj, sendAnimationData, z10), this.W3);
    }

    public final boolean d0(Canvas canvas, Utilities.Callback0Return callback0Return) {
        float f7;
        float f10;
        float f11;
        float f12;
        float e7 = this.b5.e(this.E0.canScrollVertically(-1));
        float e10 = this.c5.e(this.E0.canScrollVertically(1));
        if (e7 <= 0.0f && e10 <= 0.0f) {
            return ((Boolean) callback0Return.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.E0.getX() + this.E0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.E0.getY() + this.E0.getMeasuredHeight() + AndroidUtilities.dp(2.0f), 255, 31);
        boolean booleanValue = ((Boolean) callback0Return.run()).booleanValue();
        canvas.save();
        LinearGradient linearGradient = this.Z4;
        Paint paint = this.Y4;
        Matrix matrix = this.a5;
        if (e7 > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            f11 = 255.0f;
            f12 = 16.0f;
            f7 = 0.0f;
            f10 = 5.0f;
            rectF.set(this.E0.getX() - AndroidUtilities.dp(5.0f), (this.E0.getY() + this.T1) - 1.0f, this.E0.getX() + this.E0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.E0.getY() + this.T1 + AndroidUtilities.dp(13.0f));
            matrix.reset();
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (e7 * 255.0f));
            canvas.drawRect(rectF, paint);
        } else {
            f7 = 0.0f;
            f10 = 5.0f;
            f11 = 255.0f;
            f12 = 16.0f;
        }
        if (e10 > f7) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(this.E0.getX() - AndroidUtilities.dp(f10), (this.E0.getY() + this.E0.getMeasuredHeight()) - AndroidUtilities.dp(15.0f), this.E0.getX() + this.E0.getMeasuredWidth() + AndroidUtilities.dp(f10), this.E0.getY() + this.E0.getMeasuredHeight() + AndroidUtilities.dp(2.0f) + 1.0f);
            matrix.reset();
            matrix.postScale(1.0f, rectF2.height() / f12);
            matrix.postRotate(180.0f);
            matrix.postTranslate(rectF2.left, rectF2.bottom);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (e10 * f11));
            canvas.drawRect(rectF2, paint);
        }
        canvas.restore();
        canvas.restore();
        return booleanValue;
    }

    public final void d1(CharSequence charSequence, boolean z10) {
        sf sfVar = this.E0;
        if (sfVar == null) {
            return;
        }
        this.R2 = true;
        sfVar.setText(charSequence);
        this.E0.invalidateQuotes(true);
        sf sfVar2 = this.E0;
        sfVar2.setSelection(sfVar2.getText().length());
        this.R2 = false;
        qg qgVar = this.Z2;
        if (qgVar != null) {
            qgVar.r1(this.E0.getText(), true, z10);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        af afVar;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat;
        double d;
        hg.l lVar;
        if (i10 == NotificationCenter.emojiLoaded) {
            gg ggVar = this.U0;
            if (ggVar != null) {
                ggVar.P.f1();
            }
            dg dgVar = this.H1;
            if (dgVar != null) {
                ArrayList arrayList = dgVar.n;
                while (r4 < arrayList.size()) {
                    ((ei.n0) arrayList.get(r4)).invalidate();
                    r4++;
                }
            }
            sf sfVar = this.E0;
            if (sfVar != null) {
                sfVar.postInvalidate();
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
            sf sfVar2 = this.E0;
            if (sfVar2 == null || !sfVar2.isFocused()) {
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
                    J1(2, true);
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
                    J1(i12, true);
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
            ye yeVar = this.b1;
            if (yeVar != null) {
                yeVar.j(booleanValue ? bh.a : bh.b, true);
            }
            if (this.F2) {
                RecordCircle recordCircle2 = this.N1;
                if (recordCircle2 != null) {
                    recordCircle2.I = true;
                }
            } else {
                this.F2 = true;
                J1(0, true);
            }
            zg zgVar = this.Y0;
            if (zgVar != null) {
                zgVar.a(this.i1);
            }
            wg wgVar = this.l1;
            if (wgVar != null) {
                wgVar.h = false;
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
            zg zgVar2 = this.Y0;
            if (zgVar2 != null) {
                zgVar2.a(this.i1);
            }
            I(true);
            this.F2 = true;
            J1(0, true);
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
                qe qeVar = this.Q0;
                if (qeVar != null) {
                    qeVar.invalidate();
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
                    R1();
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.audioRecordTooShort) {
                this.b3 = null;
                this.e3 = null;
                J1(4, true);
                return;
            }
            if (i10 != NotificationCenter.updateBotMenuButton) {
                if (i10 == NotificationCenter.didUpdatePremiumGiftFieldIcon) {
                    G1(true);
                    return;
                } else {
                    if (i10 == NotificationCenter.currentUserPremiumStatusChanged && this.D1 && (afVar = this.J0) != null) {
                        afVar.setLocked(!UserConfig.getInstance(this.Q).isPremium());
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
                z1(false);
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
            a91 a91Var = this.f1;
            if (a91Var != null) {
                a91Var.setVideoPath(str);
                this.f1.setKeyframes(arrayList2);
                this.f1.setVisibility(0);
                this.f1.setMinProgressDiff(1000.0f / this.e3.estimatedDuration);
                v0();
            }
            J1(3, true);
            I(false);
            return;
        }
        this.b3 = (TLRPC.TL_document) obj;
        this.c3 = (String) objArr[2];
        boolean z10 = objArr.length >= 4 && ((Boolean) objArr[3]).booleanValue();
        float floatValue = objArr.length >= 5 ? ((Float) objArr[4]).floatValue() : 0.0f;
        float floatValue2 = objArr.length >= 6 ? ((Float) objArr[5]).floatValue() : 1.0f;
        if (this.b3 == null) {
            qg qgVar = this.Z2;
            if (qgVar != null) {
                qgVar.K(null, true, 0, 0, 0L);
                return;
            }
            return;
        }
        V();
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
        ll0 ll0Var = this.h1;
        String str2 = this.c3;
        if (!ll0Var.Q) {
            ll0Var.r = (float) d;
            ll0Var.s = floatValue;
            ll0Var.v = floatValue2;
            ll0Var.w = false;
            ll0Var.h.t(AndroidUtilities.formatDuration((int) Math.round(Math.max(1.0d, d)), false), false, true);
            ll0Var.f.a(false, false);
            if (ll0Var.n == null) {
                k81 k81Var = new k81();
                ll0Var.n = k81Var;
                k81Var.J = new k2.g0(ll0Var, 14);
            }
            ll0Var.n.D(Uri.fromFile(new File(str2)), "other");
            ll0Var.K = 0;
            ll0Var.L = bArr;
            ll0Var.invalidate();
        }
        I(false);
        if (z10) {
            W();
            X();
            V();
            this.w2 = 1;
            this.N1.c(false);
            this.v3.set(this.N1, Float.valueOf(1.0f));
            ug ugVar = this.O1;
            if (ugVar != null) {
                ugVar.setVisibility(0);
                this.O1.setAlpha(1.0f);
            }
        }
        J1(3, !z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        gg ggVar = this.U0;
        if (ggVar == null || ggVar.getVisibility() != 0 || this.U0.getStickersExpandOffset() == 0.0f) {
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
        ne neVar = this.z1;
        boolean z10 = view == view2 || view == neVar;
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.f5.e;
            canvas.save();
            if (view == neVar) {
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
        TextPaint textPaint;
        K1();
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.e();
        }
        wg wgVar = this.l1;
        if (wgVar != null) {
            wgVar.a();
        }
        SlideTextView slideTextView = this.k1;
        if (slideTextView != null) {
            slideTextView.a();
        }
        zg zgVar = this.Y0;
        if (zgVar != null && (textPaint = zgVar.F) != null) {
            textPaint.setColor(zgVar.I.g0(org.telegram.ui.ActionBar.i6.nf));
        }
        a91 a91Var = this.f1;
        if (a91Var != null) {
            a91Var.e.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.a7, false));
            a91Var.L = 0;
            y81 y81Var = a91Var.P;
            if (y81Var != null) {
                y81Var.b();
            }
        }
        NumberTextView numberTextView = this.b0;
        if (numberTextView != null && this.E0 != null) {
            if (this.d0 - this.c0 < 0) {
                numberTextView.setTextColor(g0(org.telegram.ui.ActionBar.i6.p7));
            } else {
                numberTextView.setTextColor(g0(org.telegram.ui.ActionBar.i6.y6));
            }
        }
        Color.alpha(g0(org.telegram.ui.ActionBar.i6.bf));
        qf qfVar = this.m0;
        if (qfVar != null) {
            qfVar.d.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ii, false));
            ch.d dVar = qfVar.r;
            if (dVar != null) {
                dVar.v();
            }
            qfVar.invalidate();
        }
        dg dgVar = this.H1;
        if (dgVar != null) {
            dgVar.e();
        }
        int g02 = this.a1 ? g0(org.telegram.ui.ActionBar.i6.Wk) : -1;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.b1.setColorFilter(new PorterDuffColorFilter(g02, mode));
        int i10 = org.telegram.ui.ActionBar.i6.Wk;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(g0(i10), mode);
        qe qeVar = this.Q0;
        qeVar.setColorFilter(porterDuffColorFilter);
        int i11 = org.telegram.ui.ActionBar.i6.i6;
        qeVar.setBackground(org.telegram.ui.ActionBar.i6.g0(g0(i11), 1, -1));
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(g0(i10), mode);
        ImageView imageView = this.R0;
        imageView.setColorFilter(porterDuffColorFilter2);
        int g03 = g0(i11);
        float dp = AndroidUtilities.dp(19.0f);
        int dp2 = AndroidUtilities.dp(1.0f);
        int dp3 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.X(dp, g03, dp2, dp3, dp2, dp3));
        this.B1.setColorFilter(g0(org.telegram.ui.ActionBar.i6.hl), mode);
    }

    public final bg e0(MessageObject messageObject, boolean z10) {
        bg bgVar = new bg(messageObject.currentAccount, messageObject.messageOwner, true, true);
        if (z10) {
            sf sfVar = this.E0;
            CharSequence[] charSequenceArr = {sfVar == null ? "" : sfVar.getTextToUse()};
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.Q).getEntities(charSequenceArr, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            MessageObject.addEntitiesToText(spannableStringBuilder, entities, true, true, false, true);
            bgVar.caption = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, org.telegram.ui.ActionBar.i6.o2.getFontMetricsInt(), false, (int[]) null), entities, org.telegram.ui.ActionBar.i6.o2.getFontMetricsInt());
        }
        return bgVar;
    }

    public final void e1(boolean z10, boolean z11) {
        this.H2 = z10;
        I(z11);
    }

    public void f1(float f7, float f10, float f11, boolean z10) {
        int dp;
        float f12 = 1.0f - f11;
        float f13 = f7 * f12;
        float f14 = f10 * f12;
        this.r = (f11 * 0.5f) + 0.5f;
        this.s = f11;
        D1();
        float f15 = -f13;
        this.Q0.setTranslationX(f15);
        if (this.E0 == null) {
            dp = 0;
        } else {
            int dp2 = AndroidUtilities.dp(40.0f);
            bq0 bq0Var = this.p0;
            dp = dp2 + ((bq0Var == null || bq0Var.getVisibility() != 0) ? 0 : AndroidUtilities.dp(18.0f));
        }
        this.H = f15 - (dp * f12);
        fk0 fk0Var = this.g1;
        if (fk0Var != null) {
            fk0Var.setTranslationX(f15);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f14);
        }
        ug ugVar = this.O1;
        if (ugVar != null) {
            ugVar.setTranslationX(f14);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f15);
        }
        ne neVar = this.A1;
        neVar.setTranslationX(f14);
        neVar.setAlpha(f11);
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
        y1();
        H1();
        float f16 = f13 * f12;
        if (this.I != f16) {
            this.I = f16;
            ll0 ll0Var = this.h1;
            if (ll0Var != null) {
                ll0Var.setTranslationX(f16);
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

    public final int g0(int i10) {
        org.telegram.ui.ActionBar.e6 e6Var = this.W3;
        return e6Var != null ? e6Var.x0(i10) : org.telegram.ui.ActionBar.i6.x0(null, i10, false);
    }

    public final void g1(boolean z10) {
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
            N0();
        }
        if (!z10) {
            this.c0 = -1;
            NumberTextView numberTextView = this.b0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        F1(this.P4);
        I(false);
    }

    public org.telegram.ui.ActionBar.p1 getAdjustPanLayoutHelper() {
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
            f4Var.c = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            f4Var.addView(textView, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 3));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(AndroidUtilities.dp(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            f4Var.addView(radialProgressView, w7.x5.a(28.0f, 0.0f, 0.0f, 12.0f, 0.0f, 28, 21));
            View view = new View(context);
            f4Var.f = view;
            view.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false), 2, -1));
            f4Var.addView(view, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 3));
            f4Var.setWillNotDraw(false);
            this.k0 = f4Var;
            f4Var.setVisibility(8);
            P();
            this.k0.setBotMenuButton(this.l0);
            this.y1.addView(this.k0, w7.x5.e(-1, -1, 80));
        }
        return this.k0;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public int getCursorPosition() {
        sf sfVar = this.E0;
        if (sfVar == null) {
            return 0;
        }
        return sfVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.Z1 != null) {
            if (TextUtils.isEmpty(this.V1)) {
                return null;
            }
            return this.V1;
        }
        if (this.E0 == null || !i0()) {
            return null;
        }
        return this.E0.getText();
    }

    @Override // org.telegram.ui.Components.mz0
    public Editable getEditText() {
        sf sfVar = this.E0;
        if (sfVar == null) {
            return null;
        }
        return sfVar.getText();
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

    public a00 getEmojiView() {
        return this.U0;
    }

    public float getExitTransition() {
        return this.m4;
    }

    @Override // org.telegram.ui.Components.mz0
    public CharSequence getFieldText() {
        if (this.E0 == null || !i0()) {
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
        org.telegram.ui.zn znVar = this.P2;
        int forwardedMessagesCount = (znVar == null || (messagePreviewParams = znVar.f5) == null) ? 0 : messagePreviewParams.getForwardedMessagesCount();
        sf sfVar = this.E0;
        if (sfVar == null || TextUtils.isEmpty(sfVar.getText())) {
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
        sf sfVar = this.E0;
        if (sfVar == null) {
            return 0;
        }
        try {
            return sfVar.getSelectionEnd() - this.E0.getSelectionStart();
        } catch (Exception e7) {
            FileLog.e(e7);
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
        org.telegram.ui.zn znVar = this.P2;
        if (znVar != null) {
            return znVar.g5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.zn znVar = this.P2;
        if (znVar != null) {
            return znVar.S8();
        }
        return 0L;
    }

    public bq0 getSenderSelectView() {
        return this.p0;
    }

    public sw0 getSizeNotifierLayout() {
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
        org.telegram.ui.zn znVar = this.P2;
        return znVar != null ? znVar.getMessagesController().getSendPaidMessagesStars(znVar.a()) : MessagesController.getInstance(this.Q).getSendPaidMessagesStars(this.Q2);
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

    public x51 getTrendingStickersAlert() {
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

    public final boolean h0() {
        return this.m5 == 3;
    }

    public final void h1(CharSequence charSequence, boolean z10) {
        this.e = charSequence;
        this.f = null;
        E1(z10);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i0() {
        sf sfVar = this.E0;
        return sfVar != null && sfVar.length() > 0;
    }

    public final void i1(boolean z10, boolean z11) {
        ye yeVar = this.b1;
        if (yeVar == null) {
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
        yeVar.j(this.c1 ? bh.b : bh.a, z11);
        yeVar.setContentDescription(LocaleController.getString(this.c1 ? R.string.AccDescrVideoMessage : R.string.AccDescrVoiceMessage));
        this.Z0.setContentDescription(LocaleController.getString(this.c1 ? R.string.AccDescrVideoMessage : R.string.AccDescrVoiceMessage));
        yeVar.sendAccessibilityEvent(8);
    }

    public final void j0() {
        ci.d4 d4Var = this.N;
        if (d4Var != null) {
            d4Var.e(true);
        }
        ci.d4 d4Var2 = this.L;
        if (d4Var2 != null) {
            d4Var2.e(true);
        }
    }

    public final void j1(MessageObject messageObject, org.telegram.ui.pn pnVar, MessageObject messageObject2) {
        MessageObject messageObject3;
        org.telegram.ui.zn znVar = this.P2;
        boolean z10 = (znVar == null || !znVar.A9() || this.U2 == messageObject2) ? false : true;
        if (messageObject != null) {
            if (this.W2 == null && (messageObject3 = this.m2) != this.T2) {
                this.W2 = messageObject3;
            }
            this.T2 = messageObject;
            this.V2 = pnVar;
            this.U2 = messageObject2;
            if (znVar == null || !znVar.h4 || znVar.X3 != messageObject) {
                X0(messageObject, true, true);
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
        E(true);
        qg qgVar = this.Z2;
        MediaController.getInstance().setReplyingMessage(messageObject, getThreadMessage(), qgVar != null ? qgVar.j1() : null);
        E1(z10);
    }

    public final void k0(boolean z10) {
        l0(z10, false, true);
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
                ofFloat.addUpdateListener(new td(this, 4));
                this.v0.addListener(new ff(this, z11, 3));
                this.v0.setDuration(220L);
                this.v0.setInterpolator(hs.f);
                this.v0.start();
            } else {
                this.w0 = z11 ? 1.0f : 0.0f;
                gg ggVar = this.U0;
                if (ggVar != null) {
                    ggVar.Y();
                }
            }
        }
        this.R1 = i10;
    }

    public final void l(TLRPC.Document document) {
        MediaDataController.getInstance(this.Q).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
        gg ggVar = this.U0;
        if (ggVar == null || document == null) {
            return;
        }
        boolean isEmpty = ggVar.i1.isEmpty();
        ggVar.W();
        if (isEmpty) {
            ggVar.X(false);
        }
    }

    public final boolean l0(boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (r0()) {
            if (this.f2 == 1 && (tL_replyKeyboardMarkup = this.n2) != null && z10 && this.m2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    MessagesController.getMainSettings(this.Q).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.m2.getId()).apply();
                }
            }
            if ((z10 && this.R1 != 0) || z11) {
                k1(0, true);
                gg ggVar = this.U0;
                if (ggVar != null) {
                    ggVar.u(true);
                }
                sf sfVar = this.E0;
                if (sfVar != null) {
                    sfVar.requestFocus();
                }
                l1(false, true, false, true);
                if (this.y3) {
                    I(true);
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
                this.U0.u(false);
                sf sfVar2 = this.E0;
                if (sfVar2 != null) {
                    sfVar2.requestFocus();
                }
            }
            return true;
        }
        return false;
    }

    public final void l1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i10 = 1;
        org.telegram.ui.ActionBar.p1 p1Var = this.U;
        if ((p1Var != null && p1Var.f) || this.l3 || this.U0 == null) {
            return;
        }
        if (z12 || this.z3 != z10) {
            this.z3 = z10;
            qg qgVar = this.Z2;
            if (qgVar != null) {
                qgVar.y1();
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
            sw0 sw0Var = this.m1;
            if (z14) {
                if (z13) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
                }
                int height = sw0Var.getHeight();
                this.o1 = height;
                int dp = ((((height - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
                this.D3 = dp;
                if (this.R1 == 2) {
                    this.D3 = Math.min(dp, AndroidUtilities.dp(175.0f) + i11);
                }
                if (this.d5 == null) {
                    this.U0.getLayoutParams().height = this.D3;
                }
                sw0Var.requestLayout();
                if (this.y4) {
                    sw0Var.setForeground(new hd(this));
                }
                sf sfVar = this.E0;
                if (sfVar != null) {
                    int selectionStart = sfVar.getSelectionStart();
                    int selectionEnd = this.E0.getSelectionEnd();
                    sf sfVar2 = this.E0;
                    sfVar2.setText(sfVar2.getText());
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
                    animatorSet2.setInterpolator(hs.f);
                    if (this.d5 == null) {
                        ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.be
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
                    animatorSet2.addListener(new bf(this, 12));
                    this.B3 = animatorSet2;
                    this.U0.setLayerType(2, null);
                    animationNotificationsLocker.lock();
                    this.C3 = 0.0f;
                    sw0Var.invalidate();
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
                    ((ph.i) fVar).h(this.D3);
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
                    animatorSet3.setInterpolator(hs.f);
                    if (this.d5 == null) {
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.be
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
                    animatorSet3.addListener(new kg(this, i11, i10));
                    this.C3 = 1.0f;
                    sw0Var.invalidate();
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
                    sw0Var.requestLayout();
                    sw0Var.setForeground(null);
                    sw0Var.setWillNotDraw(false);
                    AnimatedArrowDrawable animatedArrowDrawable2 = this.F3;
                    if (animatedArrowDrawable2 != null) {
                        animatedArrowDrawable2.setAnimationProgress(0.0f);
                    }
                }
                ph.f fVar2 = this.d5;
                if (fVar2 != null) {
                    ((ph.i) fVar2).h(i11);
                }
            }
            ef efVar = this.S0;
            if (efVar != null) {
                if (this.z3) {
                    efVar.setContentDescription(LocaleController.getString("AccDescrCollapsePanel", R.string.AccDescrCollapsePanel));
                } else {
                    efVar.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
                }
            }
        }
    }

    public final void m(TLRPC.Document document) {
        S();
        gg ggVar = this.U0;
        int i10 = ggVar.c1;
        MediaDataController.getInstance(i10).addRecentSticker(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = ggVar.j1.isEmpty();
        ggVar.j1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        qz qzVar = ggVar.y0;
        if (qzVar != null) {
            qzVar.l();
        }
        if (isEmpty) {
            ggVar.X(false);
        }
    }

    public final void m0(boolean z10) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.u2;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.c3 = null;
            this.b3 = null;
            this.d3 = null;
            this.e3 = null;
            a91 a91Var = this.f1;
            int i10 = 1;
            if (a91Var != null) {
                a91Var.a(true);
            }
            ye yeVar = this.b1;
            if (yeVar != null) {
                yeVar.setVisibility(0);
            }
            me meVar = this.d4;
            me meVar2 = this.Z3;
            me meVar3 = this.b4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            qe qeVar = this.Q0;
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
                D1();
                this.u2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(qeVar, meVar3, this.A0 ? 0.5f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(qeVar, meVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.g1, (Property<fk0, Float>) property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.g1, (Property<fk0, Float>) property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.g1, (Property<fk0, Float>) property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.e1, (Property<ne, Float>) property3, 0.0f));
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
                arrayList.add(ObjectAnimator.ofFloat(this.E0, (Property<sf, Float>) property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.E0, meVar, 0.0f));
                ug ugVar = this.O1;
                if (ugVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(ugVar, (Property<ug, Float>) property3, 0.0f));
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
                this.u2.addListener(new bf(this, i10));
            } else {
                fk0 fk0Var = this.g1;
                if (fk0Var != null) {
                    fk0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = this.c1;
                Property property4 = View.TRANSLATION_X;
                if (z11) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.f1, (Property<a91, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f1, (Property<a91, Float>) property4, -AndroidUtilities.dp(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.E0, meVar, 0.0f));
                    ug ugVar2 = this.O1;
                    if (ugVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(ugVar2, (Property<ug, Float>) property3, 0.0f));
                        this.O1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.E0, (Property<sf, Float>) property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.E0, (Property<sf, Float>) property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    sf sfVar = this.E0;
                    if (sfVar == null || this.s != 1.0f) {
                        this.G = 0.0f;
                        H1();
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.E0, (Property<sf, Float>) property3, 1.0f);
                        ofFloat2.setStartDelay(750L);
                        ofFloat2.setDuration(200L);
                        animatorSet3.playTogether(ofFloat2);
                    } else {
                        sfVar.setAlpha(1.0f);
                        this.G = 0.0f;
                        H1();
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(this.h1, (Property<ll0, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.h1, (Property<ll0, Float>) property4, -AndroidUtilities.dp(20.0f)));
                    ug ugVar3 = this.O1;
                    if (ugVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(ugVar3, (Property<ug, Float>) property3, 0.0f));
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
                D1();
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<fk0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<fk0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<fk0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<fk0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(qeVar, meVar3, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(qeVar, meVar2, 1.0f));
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
                this.u2.addListener(new vf(this));
            }
            AnimatorSet animatorSet7 = this.u2;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            ug ugVar4 = this.O1;
            if (ugVar4 != null) {
                ugVar4.invalidate();
            }
        }
    }

    public final void m1(boolean z10, boolean z11) {
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
                this.w1.setColorFilter(new PorterDuffColorFilter(g0(org.telegram.ui.ActionBar.i6.Wk), PorterDuff.Mode.MULTIPLY));
                this.w1.setImageResource(R.drawable.input_suggest_paid_24);
                this.w1.setBackground(org.telegram.ui.ActionBar.i6.g0(g0(org.telegram.ui.ActionBar.i6.i6), 1, -1));
                if (this.l5) {
                    this.w1.setTranslationX(AndroidUtilities.dp(42.0f));
                    this.z1.addView(this.w1, w7.x5.a(44.0f, 0.0f, 0.0f, 50.0f, 0.0f, 44, 85));
                } else {
                    this.p1.addView(this.w1, 0, w7.x5.n(44, 44));
                }
                this.w1.setOnClickListener(new xd(this, 19));
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
            ofFloat.addUpdateListener(new td(this, 7));
            this.w4.addListener(new ff(this, z10, r2));
            this.w4.setDuration(220L);
            this.w4.setInterpolator(hs.h);
            this.w4.start();
        } else {
            this.w1.setScaleX(f7);
            this.w1.setScaleY(f7);
            this.w1.setAlpha(f10);
            if (this.l5) {
                this.w1.setVisibility(z10 ? 0 : 8);
            }
        }
        F1(this.P4);
        if (z12) {
            I(true);
        }
    }

    @Override // me.d
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 0) {
            K();
            L();
        } else if (i10 == 1) {
            K();
            L();
        } else {
            if (i10 == 2) {
                gi.a aVar = this.I0;
                aVar.setAlpha(f7);
                aVar.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, f7));
                aVar.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, f7));
                aVar.setVisibility(f7 <= 0.0f ? 4 : 0);
            } else if (i10 == 3) {
                float lerp = AndroidUtilities.lerp(1.0f, 0.79f, f7);
                ne neVar = this.A1;
                neVar.setScaleX(lerp);
                neVar.setScaleY(AndroidUtilities.lerp(1.0f, 0.79f, f7));
                float lerp2 = AndroidUtilities.lerp(0.79f, 1.0f, f7);
                ImageView imageView = this.B1;
                imageView.setScaleX(lerp2);
                imageView.setScaleY(AndroidUtilities.lerp(0.79f, 1.0f, f7));
                imageView.setVisibility(f7 <= 0.0f ? 8 : 0);
                imageView.setAlpha(f7);
                af afVar = this.J0;
                if (afVar != null) {
                    afVar.setSameWidthFactor(f7);
                }
            }
        }
        invalidate();
    }

    public final void n0() {
        this.c3 = null;
        this.b3 = null;
        this.d3 = null;
        this.e3 = null;
        a91 a91Var = this.f1;
        if (a91Var != null) {
            a91Var.a(true);
        }
        ll0 ll0Var = this.h1;
        if (ll0Var != null) {
            ll0Var.setAlpha(1.0f);
            this.h1.setTranslationX(0.0f);
        }
        a91 a91Var2 = this.f1;
        if (a91Var2 != null) {
            a91Var2.setAlpha(1.0f);
            this.f1.setTranslationX(0.0f);
        }
        sf sfVar = this.E0;
        if (sfVar != null) {
            sfVar.setAlpha(1.0f);
            this.G = 0.0f;
            H1();
            this.E0.requestFocus();
        }
        ne neVar = this.e1;
        if (neVar != null) {
            neVar.setVisibility(8);
        }
        v0();
    }

    public final void n1(boolean z10) {
        org.telegram.ui.zn znVar;
        boolean z11 = ((!z10 && !this.D1) || (znVar = this.P2) == null || znVar.v()) ? false : true;
        if (this.K4 == z11) {
            return;
        }
        if (z11) {
            MessagesController.getInstance(this.Q).getTonesController().load();
        }
        this.K4 = z11;
        ImageView imageView = this.t1;
        imageView.setVisibility(0);
        imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(hs.h).setDuration(420L).withEndAction(new ce(this, z11, 0)).start();
        if (!z11) {
            ci.d4 d4Var = this.M;
            if (d4Var != null) {
                d4Var.e(true);
                this.M = null;
                return;
            }
            return;
        }
        i0 i0Var = this.s1;
        Objects.requireNonNull(i0Var);
        imageView.postDelayed(new h0(i0Var, 1), 220L);
        ci.d4 d4Var2 = this.M;
        if (d4Var2 != null) {
            d4Var2.e(true);
            this.M = null;
        }
        if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
            ci.d4 d4Var3 = new ci.d4(getContext(), 3);
            this.M = d4Var3;
            d4Var3.p(true);
            this.M.s(LocaleController.getString(R.string.AIEditorHint));
            this.M.m(0.0f, (imageView.getWidth() / 2.0f) + AndroidUtilities.dp(4.0f));
            addView(this.M, w7.x5.a(200.0f, 0.0f, -196.0f, 0.0f, 0.0f, -1, 48));
            ci.d4 d4Var4 = this.M;
            d4Var4.l0 = new ea(4, this, d4Var3);
            d4Var4.d = 4000L;
            d4Var4.u();
            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
        }
    }

    public final ValueAnimator o(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J1.a, f7);
        ofFloat.addUpdateListener(new td(this, 5));
        return ofFloat;
    }

    public void o0(boolean z10) {
        if (this.G1 == null || !this.f3) {
            return;
        }
        vd vdVar = this.V;
        if (vdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(vdVar);
        }
        this.f3 = false;
        this.g3 = false;
        if (this.h3) {
            this.g5.a(false, z10);
        }
    }

    public final void o1() {
        org.telegram.ui.zn znVar = this.P2;
        if (znVar == null || !ChatObject.isChannelAndNotMegaGroup(znVar.e)) {
            return;
        }
        ad.a0(znVar).f(MessagesController.getInstance(this.Q).captionLengthLimitPremium, new vd(this, 0)).j();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        hf hfVar = this.q0;
        if (hfVar != null) {
            hfVar.e = false;
            hfVar.dismiss();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        c0(canvas, true);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View findChildViewUnder;
        if (this.F2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (findChildViewUnder = AndroidUtilities.findChildViewUnder(this, motionEvent.getX(), motionEvent.getY())) != this.L && findChildViewUnder != this.M) {
            j0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        qf qfVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.V4 == -1 || (qfVar = this.m0) == null) {
            return;
        }
        s4.d0 d0Var = (s4.d0) qfVar.c.getLayoutManager();
        if (d0Var != null) {
            d0Var.h1(this.V4, this.W4);
        }
        this.V4 = -1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ne neVar = this.z1;
        int measuredHeight = neVar.getMeasuredHeight();
        ei.c0 c0Var = this.l0;
        ImageView imageView = this.R0;
        qe qeVar = this.Q0;
        int i12 = 0;
        if (c0Var == null || c0Var.getTag() == null) {
            bq0 bq0Var = this.p0;
            if (bq0Var == null || bq0Var.getVisibility() != 0) {
                ((ViewGroup.MarginLayoutParams) qeVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                }
                sf sfVar = this.E0;
                if (sfVar != null) {
                    ((ViewGroup.MarginLayoutParams) sfVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
                RichMessageLayout.PreviewView previewView = this.C1;
                if (previewView != null) {
                    ((ViewGroup.MarginLayoutParams) previewView.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
            } else {
                int i13 = this.p0.getLayoutParams().width;
                this.p0.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.p0.getLayoutParams().height, TLObject.FLAG_30));
                ((ViewGroup.MarginLayoutParams) qeVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i13;
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i13;
                }
                sf sfVar2 = this.E0;
                if (sfVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) sfVar2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i13;
                }
                RichMessageLayout.PreviewView previewView2 = this.C1;
                if (previewView2 != null) {
                    ((ViewGroup.MarginLayoutParams) previewView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i13;
                }
            }
        } else {
            this.l0.measure(i10, i11);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qeVar.getLayoutParams();
            int dp = AndroidUtilities.dp(10.0f);
            ei.c0 c0Var2 = this.l0;
            marginLayoutParams.leftMargin = dp + (c0Var2 == null ? 0 : c0Var2.getMeasuredWidth());
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int dp2 = AndroidUtilities.dp(10.0f);
                ei.c0 c0Var3 = this.l0;
                marginLayoutParams2.leftMargin = dp2 + (c0Var3 == null ? 0 : c0Var3.getMeasuredWidth());
            }
            sf sfVar3 = this.E0;
            if (sfVar3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) sfVar3.getLayoutParams();
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
        A1();
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
        K();
        L();
        if (measuredHeight <= 0 || neVar.getMeasuredHeight() == measuredHeight) {
            return;
        }
        while (i12 < 2) {
            ImageView imageView2 = i12 == 0 ? this.t1 : this.u1;
            imageView2.setTranslationY((imageView2.getTranslationY() + neVar.getMeasuredHeight()) - measuredHeight);
            imageView2.animate().translationY(0.0f).setInterpolator(hs.h).setDuration(420L).start();
            i12++;
        }
        ci.d4 d4Var = this.M;
        if (d4Var != null) {
            d4Var.setTranslationY((d4Var.getTranslationY() + neVar.getMeasuredHeight()) - measuredHeight);
            org.telegram.messenger.bi.t(this.M.animate().translationY(0.0f), hs.h, 420L);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 && this.z3) {
            k1(0, false);
            this.U0.u(false);
            l1(false, false, false, true);
        }
        a91 a91Var = this.f1;
        if (a91Var != null) {
            ArrayList arrayList = a91Var.v;
            if (a91Var.N.isEmpty()) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i14);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            x81 x81Var = a91Var.w;
            if (x81Var != null) {
                x81Var.cancel(true);
                a91Var.w = null;
            }
            a91Var.invalidate();
        }
    }

    public final ValueAnimator p(boolean z10) {
        final float alpha = getSendButtonInternal().getAlpha();
        final float f7 = z10 ? 1.0f : 0.0f;
        final float scaleX = getSendButtonInternal().getScaleX();
        final float f10 = z10 ? 1.0f : 0.1f;
        final float scaleY = getSendButtonInternal().getScaleY();
        final float f11 = z10 ? 1.0f : 0.1f;
        if (z10 && alpha < 0.25f && (getSendButtonInternal() instanceof xg)) {
            xg xgVar = (xg) getSendButtonInternal();
            xgVar.e0.d(0.0f, true);
            xgVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ee
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

    public final boolean p0() {
        return this.Z1 != null;
    }

    public boolean p1(Runnable runnable) {
        return false;
    }

    public final boolean q0() {
        return this.c1;
    }

    public final void q1() {
        r1(1, 0, true, true);
    }

    public final void r(SendMessagesHelper.SendMessageParams sendMessageParams) {
        qg qgVar = this.Z2;
        if (qgVar != null) {
            sendMessageParams.replyToStoryItem = qgVar.j1();
            sendMessageParams.replyQuote = this.Z2.u0();
        }
    }

    public final boolean r0() {
        return this.W0 || this.X0;
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
        AnimationNotificationsLocker animationNotificationsLocker = this.L3;
        df dfVar = this.Y3;
        Property property = View.TRANSLATION_Y;
        int i15 = 1;
        boolean z14 = false;
        if (i10 == 1) {
            if (i11 == 0) {
                if (this.O2 == null && this.U0 == null) {
                    return;
                } else {
                    S();
                }
            }
            if (i11 == 0) {
                t();
                if (this.W0) {
                    this.U0.getVisibility();
                }
                this.U0.setVisibility(0);
                this.W0 = true;
                dg dgVar = this.H1;
                if (dgVar == null || dgVar.getVisibility() == 8) {
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
                gg ggVar = this.U0;
                if (ggVar == null || ggVar.getVisibility() == 8) {
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
            org.telegram.ui.zn znVar = this.P2;
            if (znVar != null && znVar.getParentLayout() != null) {
                i16 -= ((ActionBarLayout) znVar.getParentLayout()).v(false);
            }
            if (i11 == 1) {
                i16 = Math.min(this.H1.getKeyboardHeight(), i16);
            }
            dg dgVar2 = this.H1;
            if (dgVar2 != null) {
                dgVar2.setPanelHeight(i16);
            }
            if (viewGroup != null && this.d5 == null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                layoutParams.height = i16;
                viewGroup.setLayoutParams(layoutParams);
            }
            if (!AndroidUtilities.isInMultiwindow) {
                AndroidUtilities.hideKeyboard(this.E0);
            }
            sw0 sw0Var = this.m1;
            if (sw0Var != null) {
                this.A2 = i16;
                sw0Var.requestLayout();
                b1(true, true);
                z1(true);
                E0();
                if (this.i2 && !this.z2 && i16 != i13 && z10) {
                    vd vdVar = new vd(this, 10);
                    if (this.v) {
                        this.w = vdVar;
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
                        this.V0.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                        this.V0.setDuration(250L);
                        this.V0.addListener(new ai.z(19, this, vdVar));
                        AndroidUtilities.runOnUIThread(dfVar, 50L);
                        animationNotificationsLocker.lock();
                    }
                    requestLayout();
                }
            }
            ph.f fVar = this.d5;
            if (fVar != null) {
                ((ph.i) fVar).h(i16);
            }
        } else {
            if (this.Q0 != null) {
                b1(false, true);
            }
            this.f2 = -1;
            gg ggVar2 = this.U0;
            if (ggVar2 != null) {
                if (i10 == 2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    this.G3 = false;
                    qg qgVar = this.Z2;
                    if (qgVar != null) {
                        qgVar.z(0.0f);
                    }
                    this.n1.removeView(this.U0);
                    this.U0 = null;
                } else if (!this.i2 || this.z2 || this.z3) {
                    qg qgVar2 = this.Z2;
                    if (qgVar2 != null) {
                        qgVar2.z(0.0f);
                    }
                    z14 = false;
                    this.A2 = 0;
                    this.n1.removeView(this.U0);
                    this.U0.setVisibility(8);
                    this.U0.setShowing(false);
                } else {
                    this.W0 = true;
                    this.o3 = 0;
                    ggVar2.setShowing(false);
                    nd ndVar = new nd(this, i10, i15);
                    if (this.v) {
                        z12 = false;
                        this.w = ndVar;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.V0 = animatorSet2;
                        if (this.d5 != null) {
                            z12 = false;
                            animatorSet2.playTogether(ValueAnimator.ofFloat(this.U0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                        } else {
                            z12 = false;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.U0, (Property<gg, Float>) property, r5.getMeasuredHeight()));
                        }
                        this.V0.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                        this.V0.setDuration(250L);
                        animationNotificationsLocker.lock();
                        this.V0.addListener(new ai.z(20, this, ndVar));
                    }
                    AndroidUtilities.runOnUIThread(dfVar, 50L);
                    requestLayout();
                    z14 = z12;
                }
                this.W0 = z14;
            }
            dg dgVar3 = this.H1;
            if (dgVar3 != null && dgVar3.getVisibility() == 0) {
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
                            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.H1, (Property<dg, Float>) property, r5.getMeasuredHeight()));
                        }
                        this.V0.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                        this.V0.setDuration(250L);
                        this.V0.addListener(new kg(this, i10, i12));
                        animationNotificationsLocker.lock();
                        AndroidUtilities.runOnUIThread(dfVar, 50L);
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
            z1(true);
            ph.f fVar2 = this.d5;
            if (fVar2 != null) {
                ((ph.i) fVar2).i(z11);
            }
        }
        if (this.x3 || this.y3) {
            I(true);
        }
        if (!this.z3 || i10 == 1) {
            z13 = false;
        } else {
            z13 = false;
            l1(false, false, false, true);
        }
        E1(z13);
        C();
    }

    public boolean s() {
        return false;
    }

    public final boolean s0(View view) {
        return view == this.H1 || view == this.U0;
    }

    public final void s1() {
        qg qgVar = this.Z2;
        if ((qgVar == null || !qgVar.m()) && DialogObject.isChatDialog(this.Q2)) {
            ad.a0(this.P2).G(R.raw.passcode_lock_close, 3, LocaleController.formatString("SendPlainTextRestrictionHint", R.string.SendPlainTextRestrictionHint, ChatObject.getAllowedSendString(this.R.getMessagesController().getChat(Long.valueOf(-this.Q2))))).j();
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.p1 p1Var) {
        this.U = p1Var;
    }

    public void setAnimatedTop(int i10) {
        this.T1 = i10;
    }

    public void setBotInfo(a0.i iVar) {
        V0(iVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f7) {
        this.Q0.setTranslationX(f7);
        if (this.E0 != null) {
            this.G = f7;
            H1();
        }
        this.r1.setTranslationX(this.y + this.x + f7);
        this.b1.setTranslationX(f7);
        ef efVar = this.x1;
        if (efVar != null) {
            efVar.setTranslationX(f7);
        }
    }

    public void setButtons(MessageObject messageObject) {
        X0(messageObject, true, true);
    }

    public void setCaption(String str) {
        sf sfVar = this.E0;
        if (sfVar != null) {
            sfVar.setCaption(str);
            I(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.d2 = chatFull;
        gg ggVar = this.U0;
        if (ggVar != null) {
            ggVar.setChatInfo(chatFull);
        }
        yg ygVar = this.F0;
        if (ygVar != null) {
            ygVar.e = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chatFull);
            ygVar.invalidate();
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

    public void setDelegate(qg qgVar) {
        this.Z2 = qgVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.b2 = tL_businessChatLink;
        E1(false);
        if (this.b2 != null) {
            R(true);
            this.F1.setOnClickListener(new xd(this, 3));
            this.F1.setContentDescription(LocaleController.getString(R.string.Done));
            this.F1.setVisibility(0);
            this.F1.setScaleX(0.1f);
            this.F1.setScaleY(0.1f);
            this.F1.setAlpha(0.0f);
            this.F1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(hs.f).start();
            this.c0 = this.R.getMessagesController().getMaxMessageLength();
            sf sfVar = this.E0;
            TextPaint paint = sfVar != null ? sfVar.getPaint() : null;
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
                setFieldText(q(arrayList, str, fontMetricsInt));
            }
            this.c2 = w();
            T0(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.P0.setVisibility(8);
            this.Z0.setVisibility(8);
            org.telegram.ui.yd ydVar = this.p1;
            if (ydVar != null) {
                ydVar.setVisibility(8);
            }
            hg.l lVar = this.r1;
            if (lVar != null) {
                this.v1 = 0.0f;
                lVar.setAlpha(0.0f);
                lVar.setScaleX(0.5f);
                lVar.setScaleY(0.5f);
            }
            this.A1.setVisibility(8);
            cf cfVar = this.J1;
            if (cfVar != null) {
                cfVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j3) {
        this.S4 = j3;
        af afVar = this.J0;
        if (afVar != null) {
            afVar.setEffect(j3);
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
        if (z10 && org.telegram.ui.ActionBar.n2.hasSheets(this.P2)) {
            z10 = false;
        }
        if (z10) {
            if (this.R1 != 0 || this.E0.isFocused()) {
                return;
            }
            vd vdVar = new vd(this, 5);
            this.S1 = vdVar;
            AndroidUtilities.runOnUIThread(vdVar, 600L);
            return;
        }
        sf sfVar = this.E0;
        if (sfVar == null || !sfVar.isFocused()) {
            return;
        }
        if (!this.z2 || this.j2) {
            this.E0.clearFocus();
        }
    }

    @Override // org.telegram.ui.Components.mz0
    public void setFieldText(CharSequence charSequence) {
        d1(charSequence, false);
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
            onLongClickListener = new ae(this, 0);
        }
        this.J0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        h1(charSequence, false);
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
        L1();
    }

    public void setRoundVideoUiFrameClockActive(boolean z10) {
        if (this.j1 == z10) {
            return;
        }
        this.j1 = z10;
        zg zgVar = this.Y0;
        if (zgVar != null) {
            zgVar.setExternalFrameClock(z10);
        }
        wg wgVar = this.l1;
        if (wgVar != null) {
            wgVar.n = z10;
            wgVar.b = System.currentTimeMillis();
            wgVar.r = -1L;
            wgVar.invalidate();
        }
        SlideTextView slideTextView = this.k1;
        if (slideTextView != null) {
            slideTextView.J = z10;
            slideTextView.y = System.currentTimeMillis();
            slideTextView.invalidate();
        }
    }

    public void setSelection(int i10) {
        sf sfVar = this.E0;
        if (sfVar == null) {
            return;
        }
        sfVar.setSelection(i10, sfVar.length());
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
        sf sfVar = this.E0;
        if (sfVar != null) {
            sfVar.setEnabled(z10);
        }
    }

    public void setVoiceDraft(MediaDataController.DraftVoice draftVoice) {
        if (draftVoice == null) {
            return;
        }
        boolean z10 = draftVoice.once;
        this.O = z10;
        ug ugVar = this.O1;
        if (ugVar != null) {
            ugVar.y.d(1, z10, true);
        }
        qg qgVar = this.Z2;
        TL_stories.StoryItem j12 = qgVar != null ? qgVar.j1() : null;
        MediaController mediaController = MediaController.getInstance();
        int i10 = this.Q;
        long j3 = this.Q2;
        MessageObject messageObject = this.T2;
        MessageObject threadMessage = getThreadMessage();
        SendMessageChatArguments sendMessageChatArguments = null;
        int i11 = this.G2;
        org.telegram.ui.zn znVar = this.P2;
        if (znVar != null) {
            sendMessageChatArguments = znVar.H8();
        }
        mediaController.prepareResumedRecording(i10, draftVoice, j3, messageObject, threadMessage, j12, i11, sendMessageChatArguments, getSendMonoForumPeerId(), getSendMessageSuggestionParams());
    }

    public final void t() {
        if (this.U0.getParent() == null) {
            if (this.d5 == null) {
                this.n1.addView(this.U0);
            } else {
                this.n1.addView(this.U0, w7.x5.d(-1.0f, -1));
            }
        }
    }

    public final boolean t0() {
        return this.F2 && ChatActivityEnterView.this.s4;
    }

    public final void t1(boolean z10) {
        org.telegram.ui.zn znVar;
        boolean z11 = (this.D1 || z10) && (znVar = this.P2) != null && !znVar.v() && this.Z1 == null && MessagesController.getInstance(this.Q).richEditorAvailable();
        if (this.L4 == z11) {
            return;
        }
        this.L4 = z11;
        ImageView imageView = this.u1;
        imageView.setVisibility(0);
        imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(hs.h).setDuration(420L).withEndAction(new ce(this, z11, 1)).start();
    }

    public final boolean u() {
        ei.c0 c0Var = this.l0;
        return c0Var != null && c0Var.v;
    }

    public final boolean u0() {
        if (this.F2) {
            return true;
        }
        AnimatorSet animatorSet = this.t2;
        return (animatorSet == null || !animatorSet.isRunning() || this.k2) ? false : true;
    }

    public final void u1() {
        v1(true, false);
    }

    public final boolean v() {
        mg w10 = w();
        return (TextUtils.equals(w10.a, this.c2.a) && MediaDataController.entitiesEqual((ArrayList<TLRPC.MessageEntity>) this.c2.b, (ArrayList<TLRPC.MessageEntity>) w10.b)) ? false : true;
    }

    public final void v1(boolean z10, boolean z11) {
        if (this.G1 == null || this.f3 || getVisibility() != 0) {
            ne neVar = this.e1;
            if ((neVar == null || neVar.getVisibility() != 0) && !this.H2 && this.V2 == null && this.T2 == null) {
                F0();
                return;
            }
            return;
        }
        ne neVar2 = this.e1;
        boolean z12 = (neVar2 == null || neVar2.getVisibility() != 0) && !this.H2 && this.V2 == null && (this.n2 == null || this.Z1 != null);
        if (!z11 && z10 && z12 && !this.z2 && !r0()) {
            F0();
            vd vdVar = this.V;
            if (vdVar != null) {
                AndroidUtilities.cancelRunOnUIThread(vdVar);
            }
            vd vdVar2 = new vd(this, 23);
            this.V = vdVar2;
            AndroidUtilities.runOnUIThread(vdVar2, 200L);
            return;
        }
        this.g3 = true;
        this.f3 = true;
        if (this.h3) {
            this.g5.a(true, z10);
            if (z12) {
                sf sfVar = this.E0;
                if (sfVar != null) {
                    sfVar.requestFocus();
                }
                F0();
            }
        }
    }

    public final mg w() {
        sf sfVar = this.E0;
        CharSequence[] charSequenceArr = {AndroidUtilities.getTrimmedString(sfVar == null ? "" : sfVar.getTextToUse())};
        ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.Q).getEntities(charSequenceArr, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = entities.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.MessageEntity messageEntity = entities.get(i10);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        mg mgVar = new mg();
        mgVar.a = charSequence.toString();
        mgVar.b = entities;
        return mgVar;
    }

    public final boolean w0() {
        return this.z3;
    }

    public final boolean w1() {
        org.telegram.ui.zn znVar = this.P2;
        TLRPC.EncryptedChat encryptedChat = znVar != null ? znVar.h : null;
        return encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101;
    }

    public final float x(boolean z10) {
        me.e eVar = this.f5;
        float f7 = z10 ? eVar.g ? eVar.f : eVar.e : eVar.e;
        me.b bVar = this.g5;
        return ((this.G1 != null ? r1.getMeasuredHeight() : 0) * (z10 ? bVar.f ? 1.0f : 0.0f : bVar.e)) + f7;
    }

    public final boolean x0() {
        View view = this.G1;
        return view != null && view.getVisibility() == 0;
    }

    public final void x1() {
        float f7;
        hg.l lVar = this.r1;
        if (lVar == null) {
            return;
        }
        float f10 = this.y + this.x;
        af afVar = this.J0;
        if (afVar != null) {
            f7 = afVar.getAlpha() * (-org.telegram.messenger.q.b(56.0f, afVar.l(), 0));
        } else {
            f7 = 0.0f;
        }
        lVar.setTranslationX(f10 + f7);
    }

    public final void y() {
        ai.x5 x5Var = this.d1;
        if (x5Var != null) {
            x5Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.t2 = null;
        v0();
        if (this.p1 != null) {
            this.x = 0.0f;
            y1();
        }
        SlideTextView slideTextView = this.k1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.Z2.h();
        O1(true);
    }

    public final void y1() {
        x1();
        org.telegram.ui.yd ydVar = this.p1;
        if (ydVar != null) {
            ydVar.setTranslationX(this.y + this.x);
            ydVar.setAlpha(this.E * this.F);
            ydVar.setVisibility(ydVar.getAlpha() > 0.0f ? 0 : 8);
            hg.l lVar = this.r1;
            if (lVar != null && this.A4) {
                lVar.setAlpha(this.v1 * this.F);
            }
        }
        cf cfVar = this.J1;
        if (cfVar != null) {
            cfVar.setTranslationX(cfVar.a);
        }
    }

    public final void z() {
        if (this.e2 && this.c1) {
            CameraController.getInstance().cancelOnInitRunnable(this.H3);
            this.Z2.q2(5, 0, this.O ? Integer.MAX_VALUE : 0, this.S4, 0L, true);
            this.S4 = 0L;
            this.J0.setEffect(0L);
        } else {
            this.Z2.g1(0);
            MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
        }
        this.F2 = false;
        J1(2, true);
    }

    public final void z0() {
        NotificationCenter.ObserversGroup observersGroup;
        ll0 ll0Var = this.h1;
        if (ll0Var != null) {
            ll0Var.Q = true;
            k81 k81Var = ll0Var.n;
            if (k81Var != null) {
                k81Var.P(false);
                ll0Var.n.H();
                ll0Var.n = null;
            }
        }
        if (this.h1 != null && this.b3 != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.Q);
            long j3 = this.Q2;
            org.telegram.ui.zn znVar = this.P2;
            long d = (znVar == null || !znVar.h4) ? 0L : znVar.d();
            ll0 ll0Var2 = this.h1;
            float audioLeft = ll0Var2 == null ? 0.0f : ll0Var2.getAudioLeft();
            ll0 ll0Var3 = this.h1;
            mediaDataController.setDraftVoiceRegion(j3, d, audioLeft, ll0Var3 == null ? 1.0f : ll0Var3.getAudioRight());
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
        gg ggVar = this.U0;
        if (ggVar != null && (observersGroup = ggVar.I2) != null) {
            observersGroup.removeAllObservers();
            ggVar.I2 = null;
        }
        vd vdVar = this.H0;
        if (vdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(vdVar);
            this.H0 = null;
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
        sw0 sw0Var = this.m1;
        if (sw0Var != null) {
            sw0Var.setDelegate(null);
        }
        hf hfVar = this.q0;
        if (hfVar != null) {
            hfVar.e = false;
            hfVar.dismiss();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b3, code lost:
    
        if (android.text.TextUtils.isEmpty(r15 == null ? "" : org.telegram.messenger.AndroidUtilities.getTrimmedString(r15.getTextToUse())) != false) goto L124;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z1(boolean z10) {
        ef efVar;
        if (this.X3) {
            org.telegram.ui.zn znVar = this.P2;
            if (znVar != null && !znVar.N5) {
                z10 = false;
            }
            boolean h02 = h0();
            boolean z11 = this.m5 != 1 && this.Q2 > 0;
            ef efVar2 = this.x1;
            boolean z12 = efVar2 != null && efVar2.getVisibility() == 0;
            if (!h02 && !this.p2 && this.n2 == null) {
                ef efVar3 = this.x1;
                if (efVar3 != null) {
                    efVar3.setVisibility(8);
                }
            } else if (this.n2 != null) {
                if (r0() && this.f2 == 1 && this.n2.is_persistent) {
                    ef efVar4 = this.x1;
                    if (efVar4 != null && efVar4.getVisibility() != 8) {
                        this.x1.setVisibility(8);
                    }
                } else {
                    O();
                    if (this.x1.getVisibility() != 0) {
                        this.x1.setVisibility(0);
                    }
                    this.U1.a(R.drawable.input_bot2, true);
                    this.x1.setContentDescription(LocaleController.getString("AccDescrBotKeyboard", R.string.AccDescrBotKeyboard));
                }
            } else if (z11) {
                ef efVar5 = this.x1;
                if (efVar5 != null) {
                    efVar5.setVisibility(8);
                }
            } else {
                O();
                this.U1.a(R.drawable.input_bot1, true);
                this.x1.setContentDescription(LocaleController.getString("AccDescrBotCommands", R.string.AccDescrBotCommands));
                this.x1.setVisibility(0);
            }
            if (z11) {
                P();
            }
            ef efVar6 = this.x1;
            boolean z13 = (efVar6 != null && efVar6.getVisibility() == 0) != z12;
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
                qe qeVar = this.Q0;
                Float valueOf = Float.valueOf(qeVar.getX());
                HashMap hashMap = this.B0;
                hashMap.put(qeVar, valueOf);
                sf sfVar = this.E0;
                if (sfVar != null) {
                    hashMap.put(sfVar, Float.valueOf(sfVar.getX()));
                }
                ef efVar7 = this.x1;
                boolean z16 = efVar7 != null && efVar7.getVisibility() == 0;
                if (z16 != z12 && (efVar = this.x1) != null) {
                    efVar.setVisibility(0);
                    if (z16) {
                        this.x1.setAlpha(0.0f);
                        this.x1.setScaleX(0.1f);
                        this.x1.setScaleY(0.1f);
                    } else if (!z16) {
                        this.x1.setAlpha(1.0f);
                        this.x1.setScaleX(1.0f);
                        this.x1.setScaleY(1.0f);
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(this.x1, z16, 0.1f, true, 1.0f, true, new td(this, 1));
                }
            }
            ef efVar8 = this.x1;
            if (efVar8 != null && efVar8.getVisibility() == 0) {
                sf sfVar2 = this.E0;
            }
            i10 = this.P4;
            F1(i10);
        }
    }

    @Override // org.telegram.ui.Components.mz0
    public ru getEditField() {
        return this.E0;
    }

    @Override // org.telegram.ui.Components.mz0
    public org.telegram.ui.zn getParentFragment() {
        return this.P2;
    }

    public void f0(Menu menu) {
    }

    public void v0() {
    }

    public void y0(float f7) {
    }

    @Override // me.d
    public final /* synthetic */ void A(float f7, int i10) {
    }

    public void A0(int i10, int i11) {
    }
}
