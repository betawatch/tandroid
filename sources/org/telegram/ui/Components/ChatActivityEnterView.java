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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class ChatActivityEnterView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, gv0, kx0, dy0, vd.b, org.telegram.ui.ActionBar.x5 {
    public static final /* synthetic */ int i5 = 0;
    public float A;
    public jf A0;
    public re A1;
    public boolean A2;
    public AnimatedArrowDrawable A3;
    public final ld A4;
    public float B;
    public final pg B0;
    public View B1;
    public int B2;
    public boolean B3;
    public org.telegram.ui.ActionBar.g1 B4;
    public float C;
    public int C0;
    public uf C1;
    public boolean C2;
    public final ue C3;
    public ArrayList C4;
    public float D;
    public ld D0;
    public final ImageView D1;
    public boolean D2;
    public boolean D3;
    public boolean D4;
    public float E;
    public final jh.g5 E0;
    public te E1;
    public boolean E2;
    public boolean E3;
    public View E4;
    public boolean F;
    public final re F0;
    public ve F1;
    public boolean F2;
    public final cg F3;
    public boolean F4;
    public TLRPC.UserFull G;
    public int G0;
    public boolean G1;
    public int G2;
    public final AnimationNotificationsLocker G3;
    public boolean G4;
    public nh.t3 H;
    public ff H0;
    public AnimatorSet H1;
    public boolean H2;
    public final Paint H3;
    public boolean H4;
    public nh.t3 I;
    public long I0;
    public RecordCircle I1;
    public final int[] I2;
    public Drawable I3;
    public ld I4;
    public nh.t3 J;
    public ef J0;
    public lg J1;
    public final Activity J2;
    public Drawable J3;
    public final iq[] J4;
    public boolean K;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K0;
    public final qe K1;
    public final org.telegram.ui.tn K2;
    public Drawable K3;
    public int K4;
    public boolean L;
    public final ImageView L0;
    public final Paint L1;
    public long L2;
    public Drawable L3;
    public int L4;
    public int M;
    public final ge M0;
    public int M1;
    public boolean M2;
    public Drawable M3;
    public boolean M4;
    public AccountInstance N;
    public final ImageView N0;
    public ld N1;
    public int N2;
    public final RectF N3;
    public long N4;
    public boolean O;
    public ve O0;
    public int O1;
    public MessageObject O2;
    public final Rect O3;
    public BotForumHelper.SteamingSendButtonState O4;
    public int P;
    public boolean P0;
    public ol0 P1;
    public MessageObject P2;
    public final Rect P3;
    public bh.b P4;
    public org.telegram.ui.ActionBar.q1 Q;
    public xf Q0;
    public Editable Q1;
    public org.telegram.ui.jn Q2;
    public Drawable Q3;
    public int Q4;
    public ld R;
    public AnimatorSet R0;
    public boolean R1;
    public MessageObject R2;
    public final org.telegram.ui.ActionBar.c6 R3;
    public int R4;
    public z2 S;
    public boolean S0;
    public boolean S1;
    public TLRPC.WebPage S2;
    public final boolean S3;
    public a0.h S4;
    public boolean T;
    public boolean T0;
    public boolean T1;
    public boolean T2;
    public final ue T3;
    public final Paint T4;
    public NumberTextView U;
    public qg U0;
    public MessageObject U1;
    public hg U2;
    public final ce U3;
    public final LinearGradient U4;
    public int V;
    public final oe V0;
    public boolean V1;
    public zf V2;
    public final ce V3;
    public final Matrix V4;
    public int W;
    public boolean W0;
    public TL_account.TL_businessChatLink W1;
    public TLRPC.TL_document W2;
    public final ce W3;
    public final d6 W4;
    public final pe X0;
    public dg X1;
    public String X2;
    public final ce X3;
    public final d6 X4;
    public boolean Y0;
    public TLRPC.ChatFull Y1;
    public MessageObject Y2;
    public final ce Y3;
    public ah.f Y4;
    public bh.d Z0;
    public boolean Z1;
    public VideoEditedInfo Z2;
    public boolean Z3;
    public ug.g Z4;
    public int a;
    public gr a0;
    public de a1;
    public int a2;
    public boolean a3;
    public long a4;
    public final vd.c a5;
    public boolean b;
    public Runnable b0;
    public l71 b1;
    public boolean b2;
    public boolean b3;
    public float b4;
    public final vd.a b5;
    public org.telegram.ui.ActionBar.g1 c;
    public boolean c0;
    public aj0 c1;
    public boolean c2;
    public boolean c3;
    public float c4;
    public final vd.a c5;
    public LinearLayout d;
    public boolean d0;
    public gk0 d1;
    public boolean d2;
    public MessageObject d3;
    public float d4;
    public final vd.a d5;
    public CharSequence e;
    public String e0;
    public long e1;
    public boolean e2;
    public TL_keyboard.KeyboardButtonProto e3;
    public float e4;
    public float e5;
    public String f;
    public String f0;
    public SlideTextView f1;
    public boolean f2;
    public boolean f3;
    public float f4;
    public float f5;
    public ph.e3 g0;
    public ng g1;
    public boolean g2;
    public boolean g3;
    public float g4;
    public boolean g5;
    public float h;
    public ph.z h0;
    public final hv0 h1;
    public MessageObject h2;
    public boolean h3;
    public float h4;
    public int h5;
    public gf i0;
    public ViewGroup i1;
    public TLRPC.TL_replyKeyboardMarkup i2;
    public boolean i3;
    public float i4;
    public ph.y j0;
    public int j1;
    public int j2;
    public int j3;
    public float j4;
    public boolean k0;
    public final bg.y3 k1;
    public boolean k2;
    public boolean k3;
    public float k4;
    public qo0 l0;
    public ViewPropertyAnimator l1;
    public PowerManager.WakeLock l2;
    public boolean l3;
    public float l4;
    public ye m0;
    public final je m1;
    public AnimatorSet m2;
    public final ue m3;
    public boolean m4;
    public float n;
    public be n0;
    public final k0 n1;
    public AnimatorSet n2;
    public final bf n3;
    public boolean n4;
    public int o0;
    public final ImageView o1;
    public AnimatorSet o2;
    public final org.telegram.ui.Cells.b1 o3;
    public int o4;
    public int p0;
    public final ImageView p1;
    public AnimatorSet p2;
    public final nf p3;
    public long p4;
    public be q0;
    public float q1;
    public int q2;
    public final qf q3;
    public boolean q4;
    public float r;
    public ValueAnimator r0;
    public ImageView r1;
    public int r2;
    public final Paint r3;
    public ValueAnimator r4;
    public float s;
    public float s0;
    public ve s1;
    public int s2;
    public boolean s3;
    public boolean s4;
    public boolean t0;
    public final fe t1;
    public int t2;
    public boolean t3;
    public boolean t4;
    public boolean u0;
    public final de u1;
    public boolean u2;
    public boolean u3;
    public boolean u4;
    public boolean v;
    public boolean v0;
    public final de v1;
    public int v2;
    public boolean v3;
    public boolean v4;
    public Runnable w;
    public boolean w0;
    public final ImageView w1;
    public final boolean w2;
    public AnimatorSet w3;
    public final Paint w4;
    public float x;
    public final HashMap x0;
    public RichMessageLayout.PreviewView x1;
    public long x2;
    public float x3;
    public float x4;
    public float y;
    public boolean y0;
    public boolean y1;
    public float y2;
    public int y3;
    public final Rect y4;
    public boolean z0;
    public TL_iv.RichMessage z1;
    public float z2;
    public boolean z3;
    public boolean z4;

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public class RecordCircle extends View {
        public final float A;
        public float B;
        public float C;
        public float D;
        public boolean E;
        public float F;
        public float G;
        public float H;
        public boolean I;
        public boolean J;
        public float a;
        public float b;
        public float c;
        public long d;
        public float e;
        public float f;
        public final y9 h;
        public final y9 n;
        public final float r;
        public final float s;
        public final RectF v;
        public boolean w;
        public final mg x;
        public int y;

        public RecordCircle(Context context) {
            super(context);
            y9 y9Var = new y9(11, LiteMode.FLAGS_CHAT);
            this.h = y9Var;
            y9 y9Var2 = new y9(12, LiteMode.FLAGS_CHAT);
            this.n = y9Var2;
            this.r = AndroidUtilities.dpf2(41.0f);
            this.s = AndroidUtilities.dp(30.0f);
            this.v = new RectF();
            this.D = 0.0f;
            this.E = true;
            mg mgVar = new mg(this, this);
            this.x = mgVar;
            r0.j0.k(this, mgVar);
            y9Var.a = AndroidUtilities.dp(47.0f);
            y9Var.b = AndroidUtilities.dp(55.0f);
            y9Var.b();
            y9Var2.a = AndroidUtilities.dp(47.0f);
            y9Var2.b = AndroidUtilities.dp(55.0f);
            y9Var2.b();
            float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.A = scaledTouchSlop * scaledTouchSlop;
            e();
        }

        public final void a() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.K3 != null) {
                return;
            }
            chatActivityEnterView.K3 = getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            Drawable drawable = chatActivityEnterView.K3;
            int i10 = org.telegram.ui.ActionBar.g6.bf;
            int i02 = chatActivityEnterView.i0(i10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(i02, mode));
            chatActivityEnterView.L3 = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            chatActivityEnterView.L3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i10), mode));
            chatActivityEnterView.M3 = getResources().getDrawable(R.drawable.attach_send).mutate();
            chatActivityEnterView.M3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i10), mode));
            chatActivityEnterView.I3 = getResources().getDrawable(R.drawable.input_mic).mutate();
            Drawable drawable2 = chatActivityEnterView.I3;
            int i11 = org.telegram.ui.ActionBar.g6.Wk;
            drawable2.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i11), mode));
            chatActivityEnterView.J3 = getResources().getDrawable(R.drawable.input_video).mutate();
            chatActivityEnterView.J3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i11), mode));
        }

        public final void b(Canvas canvas, Drawable drawable, Drawable drawable2, float f9, int i10) {
            a();
            if (f9 != 0.0f && f9 != 1.0f && drawable2 != null) {
                canvas.save();
                canvas.scale(f9, f9, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                float f10 = i10;
                drawable.setAlpha((int) (f10 * f9));
                drawable.draw(canvas);
                canvas.restore();
                canvas.save();
                float f11 = 1.0f - f9;
                canvas.scale(f11, f11, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                drawable2.setAlpha((int) (f10 * f11));
                drawable2.draw(canvas);
                canvas.restore();
                return;
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            boolean z10 = chatActivityEnterView.m4;
            if (z10 && chatActivityEnterView.e4 == 1.0f) {
                chatActivityEnterView.X0.setAlpha(1.0f);
                setVisibility(8);
            } else if (z10 && chatActivityEnterView.e4 < 1.0f) {
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
                chatActivityEnterView.n4 = false;
                chatActivityEnterView.g4 = -1.0f;
                chatActivityEnterView.f4 = -1.0f;
                chatActivityEnterView.e4 = 1.0f;
                chatActivityEnterView.l4 = 1.0f;
                chatActivityEnterView.i4 = 0.0f;
                chatActivityEnterView.d4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.k4 = 0.0f;
            chatActivityEnterView.x0();
            chatActivityEnterView.h4 = 0.0f;
            chatActivityEnterView.c4 = 0.0f;
            chatActivityEnterView.b4 = 0.0f;
            chatActivityEnterView.Z3 = false;
            this.f = 0.0f;
            chatActivityEnterView.m4 = false;
            lg lgVar = chatActivityEnterView.J1;
            if (lgVar != null) {
                lgVar.invalidate();
            }
        }

        public final void d() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.n4 = false;
            invalidate();
            lg lgVar = chatActivityEnterView.J1;
            if (lgVar != null) {
                lgVar.invalidate();
            }
        }

        @Override // android.view.View
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            return super.dispatchHoverEvent(motionEvent) || this.x.f(motionEvent);
        }

        public final void e() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.H3;
            int i10 = org.telegram.ui.ActionBar.g6.cf;
            paint.setColor(chatActivityEnterView.i0(i10));
            this.h.d.setColor(i0.a.k(chatActivityEnterView.i0(i10), 38));
            this.n.d.setColor(i0.a.k(chatActivityEnterView.i0(i10), 76));
            this.y = chatActivityEnterView.H3.getAlpha();
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.d4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.c4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.e;
        }

        @Override // android.view.View
        public final void invalidate() {
            super.invalidate();
            lg lgVar = ChatActivityEnterView.this.J1;
            if (lgVar != null) {
                lgVar.invalidate();
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
            float f9;
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
            gk0 gk0Var;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Rect rect = chatActivityEnterView.O3;
            Paint paint3 = chatActivityEnterView.H3;
            if (this.J) {
                return;
            }
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp2(26.0f);
            int dp = (int) (AndroidUtilities.dp(170.0f) + 0.0f);
            this.F = chatActivityEnterView.o4 + measuredWidth;
            float f22 = dp;
            this.G = f22;
            float f23 = chatActivityEnterView.c4;
            float f24 = f23 <= 0.5f ? f23 / 0.5f : f23 <= 0.75f ? 1.0f - (((f23 - 0.5f) / 0.25f) * 0.1f) : (((f23 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
            long currentTimeMillis = System.currentTimeMillis() - this.d;
            float f25 = this.b;
            float f26 = this.a;
            if (f25 != f26) {
                f9 = 0.25f;
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
                f9 = 0.25f;
                f10 = 1.0f;
            }
            float interpolation = ((this.s * this.a) + this.r) * f24 * (chatActivityEnterView.m4 ? jr.g.getInterpolation(f10 - chatActivityEnterView.e4) * 0.7f : (chatActivityEnterView.e4 * 0.3f) + 0.7f);
            this.e = 0.0f;
            float f29 = chatActivityEnterView.k4;
            if (f29 == 0.0f || chatActivityEnterView.d1 == null) {
                float f30 = chatActivityEnterView.h4;
                if (f30 != 0.0f) {
                    float f31 = f30 > 0.6f ? 1.0f : f30 / 0.6f;
                    if (!chatActivityEnterView.c0) {
                        f30 = Math.max(0.0f, (f30 - 0.6f) / 0.4f);
                    }
                    jr jrVar = jr.j;
                    float interpolation2 = jrVar.getInterpolation(f31);
                    float interpolation3 = jrVar.getInterpolation(f30);
                    interpolation = (1.0f - interpolation3) * ((AndroidUtilities.dp(16.0f) * interpolation2) + interpolation);
                    if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                        float f32 = chatActivityEnterView.h4;
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
                if (chatActivityEnterView.m4) {
                    float f33 = chatActivityEnterView.e4;
                    if (f33 > 0.7f) {
                        f13 *= 1.0f - ((f33 - 0.7f) / 0.3f);
                    }
                }
                if (this.e <= 0.0f) {
                    f15 = 0.7f;
                    f16 = 0.0f;
                    paint3.setColor(i0.a.d(this.e, chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.cf), chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.kf)));
                } else {
                    f15 = 0.7f;
                    f16 = 0.0f;
                    paint3.setColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.cf));
                }
                a();
                Drawable drawable6 = null;
                if (chatActivityEnterView.n4) {
                    f17 = interpolation;
                    f18 = f11;
                    paint = paint3;
                    f19 = f12;
                    f20 = 12.0f;
                    drawable = chatActivityEnterView.Y0 ? chatActivityEnterView.L3 : chatActivityEnterView.K3;
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
                        drawable6 = chatActivityEnterView.Y0 ? chatActivityEnterView.L3 : chatActivityEnterView.K3;
                    } else {
                        f20 = 12.0f;
                    }
                    Drawable drawable7 = drawable6;
                    drawable = chatActivityEnterView.M3;
                    f19 = f12;
                    f18 = f11;
                    paint = paint3;
                    f17 = interpolation;
                    rect.set(org.telegram.ui.b.v(2, measuredWidth, drawable), org.telegram.ui.b.f(2, dp, drawable), org.telegram.ui.b.A(2, measuredWidth, drawable), org.telegram.ui.b.y(2, dp, drawable));
                    if (drawable7 != null) {
                        drawable7.setBounds(org.telegram.ui.b.v(2, measuredWidth, drawable7), org.telegram.ui.b.f(2, dp, drawable7), org.telegram.ui.b.A(2, measuredWidth, drawable7), org.telegram.ui.b.y(2, dp, drawable7));
                    }
                    drawable2 = drawable7;
                }
                drawable.setBounds(rect);
                if (this.w) {
                    float f36 = chatActivityEnterView.j4 - 0.01f;
                    chatActivityEnterView.j4 = f36;
                    if (f36 < f16) {
                        this.w = true;
                        chatActivityEnterView.j4 = 0.0f;
                    }
                } else {
                    float f37 = chatActivityEnterView.j4 + 0.01f;
                    chatActivityEnterView.j4 = f37;
                    if (f37 > 1.0f) {
                        this.w = false;
                        chatActivityEnterView.j4 = 1.0f;
                    }
                }
                isEnabled = LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                y9 y9Var = this.n;
                y9 y9Var2 = this.h;
                if (isEnabled) {
                    y9Var2.a = AndroidUtilities.dp(47.0f);
                    y9Var2.b = (AndroidUtilities.dp(15.0f) * 0.6f) + AndroidUtilities.dp(47.0f);
                    y9Var.a = AndroidUtilities.dp(50.0f);
                    y9Var.b = (AndroidUtilities.dp(f20) * 0.6f) + AndroidUtilities.dp(50.0f);
                    y9Var.f(currentTimeMillis);
                    y9Var.e(y9Var.t, 1.01f);
                    y9Var2.f(currentTimeMillis);
                    y9Var2.e(y9Var2.t, 1.02f);
                }
                this.d = System.currentTimeMillis();
                float f38 = chatActivityEnterView.e4;
                float f39 = f38 <= f15 ? 1.0f : f38 / f15;
                if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT) && f18 != 1.0f && f19 < 0.4f && f39 > 0.0f && !chatActivityEnterView.m4) {
                    if (this.E) {
                        float f40 = this.D;
                        if (f40 != 1.0f) {
                            float f41 = f40 + 0.04f;
                            this.D = f41;
                            if (f41 > 1.0f) {
                                this.D = 1.0f;
                            }
                        }
                    }
                    if (!this.I) {
                        float interpolation4 = jr.g.getInterpolation(this.D);
                        canvas.save();
                        float f42 = 1.0f - f14;
                        float B = com.google.android.recaptcha.internal.a.B(y9Var.t, 1.4f, 0.878f, com.google.android.recaptcha.internal.a.C(chatActivityEnterView.c4, f42, f39, interpolation4));
                        canvas.scale(B, B, chatActivityEnterView.o4 + measuredWidth, f22);
                        y9Var.a(chatActivityEnterView.o4 + measuredWidth, f22, canvas, y9Var.d);
                        canvas.restore();
                        float C = ((y9Var2.t * 1.4f) + 0.926f) * com.google.android.recaptcha.internal.a.C(chatActivityEnterView.c4, f42, f39, interpolation4);
                        canvas.save();
                        canvas.scale(C, C, chatActivityEnterView.o4 + measuredWidth, f22);
                        y9Var2.a(chatActivityEnterView.o4 + measuredWidth, f22, canvas, y9Var2.d);
                        canvas.restore();
                    }
                }
                float max = (chatActivityEnterView.m4 || chatActivityEnterView.e4 >= 1.0f) ? f17 : Math.max(f17, AndroidUtilities.dp(19.0f));
                if (this.I) {
                    paint2 = paint;
                    paint2.setAlpha((int) (this.y * f13));
                    if (chatActivityEnterView.c4 == 1.0f) {
                        if (chatActivityEnterView.k4 == 0.0f) {
                            drawable4 = drawable2;
                            i10 = measuredWidth;
                            drawable5 = drawable;
                            f21 = 1.0f;
                            canvas.drawCircle(i10 + chatActivityEnterView.o4, f22, max, paint2);
                        } else if (chatActivityEnterView.Y0 || this.e <= 0.0f || (gk0Var = chatActivityEnterView.d1) == null) {
                            drawable4 = drawable2;
                            i10 = measuredWidth;
                            drawable5 = drawable;
                            f21 = 1.0f;
                            canvas.drawCircle(i10 + chatActivityEnterView.o4, f22, (1.0f - this.e) * max, paint2);
                        } else {
                            float f43 = f22 + max;
                            float f44 = f22 - max;
                            float f45 = chatActivityEnterView.o4 + measuredWidth;
                            float f46 = f45 + max;
                            float f47 = f45 - max;
                            drawable4 = drawable2;
                            int i11 = 0;
                            int i12 = 0;
                            for (View view = (View) gk0Var.getParent(); view != getParent(); view = (View) view.getParent()) {
                                i12 = (int) (view.getY() + i12);
                                i11 = (int) (view.getX() + i11);
                            }
                            float f48 = i12;
                            float y8 = (gk0Var.getY() + f48) - getY();
                            float y10 = ((gk0Var.getY() + gk0Var.getMeasuredHeight()) + f48) - getY();
                            float f49 = i11;
                            float x4 = (((gk0Var.getX() + gk0Var.getMeasuredWidth()) + f49) - getX()) - chatActivityEnterView.E;
                            float x10 = ((gk0Var.getX() + f49) - getX()) + chatActivityEnterView.E;
                            i10 = measuredWidth;
                            float measuredHeight = chatActivityEnterView.Y0 ? 0.0f : gk0Var.getMeasuredHeight() / 2.0f;
                            drawable5 = drawable;
                            float lerp = AndroidUtilities.lerp(f44, y8, this.e);
                            float lerp2 = AndroidUtilities.lerp(f43, y10, this.e);
                            float lerp3 = AndroidUtilities.lerp(f47, x10, this.e);
                            float lerp4 = AndroidUtilities.lerp(f46, x4, this.e);
                            AndroidUtilities.lerp(max, measuredHeight, this.e);
                            RectF rectF = this.v;
                            rectF.set(lerp3, lerp, lerp4, lerp2);
                            chatActivityEnterView.d1.a(canvas, rectF);
                            f21 = 1.0f;
                        }
                        canvas.save();
                        canvas.translate(chatActivityEnterView.o4, 0.0f);
                        drawable3 = drawable5;
                        drawable2 = drawable4;
                        b(canvas, drawable3, drawable2, this.f, (int) org.telegram.messenger.x3.y(f21, f18, f21 - f19, 255.0f));
                        canvas.restore();
                        if (chatActivityEnterView.c4 != f21) {
                            canvas.drawCircle(i10 + chatActivityEnterView.o4, f22, max, paint2);
                            float f50 = chatActivityEnterView.m4 ? f21 - chatActivityEnterView.e4 : 1.0f;
                            canvas.save();
                            canvas.translate(chatActivityEnterView.o4, 0.0f);
                            b(canvas, drawable3, drawable2, this.f, (int) (f50 * 255.0f));
                            canvas.restore();
                        }
                        this.H = max;
                    }
                    i10 = measuredWidth;
                    drawable3 = drawable;
                } else {
                    i10 = measuredWidth;
                    drawable3 = drawable;
                    paint2 = paint;
                }
                f21 = 1.0f;
                if (chatActivityEnterView.c4 != f21) {
                }
                this.H = max;
            }
            float f51 = f29 > 0.38f ? 1.0f : f29 / 0.38f;
            float max2 = f29 > 0.63f ? 1.0f : Math.max(0.0f, (f29 - 0.38f) / f9);
            this.e = Math.max(0.0f, ((chatActivityEnterView.k4 - 0.38f) - f9) / 0.37f);
            jr jrVar2 = jr.j;
            float interpolation5 = jrVar2.getInterpolation(f51);
            f11 = jrVar2.getInterpolation(max2);
            this.e = jrVar2.getInterpolation(this.e);
            float dp2 = (AndroidUtilities.dp(16.0f) * interpolation5) + interpolation;
            float dp3 = AndroidUtilities.dp(8.0f);
            interpolation = com.google.android.recaptcha.internal.a.z(1.0f, f11, dp2 - dp3, dp3);
            f14 = interpolation5;
            f12 = 0.0f;
            f13 = 1.0f;
            if (chatActivityEnterView.m4) {
            }
            if (this.e <= 0.0f) {
            }
            a();
            Drawable drawable62 = null;
            if (chatActivityEnterView.n4) {
            }
            drawable.setBounds(rect);
            if (this.w) {
            }
            isEnabled = LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
            y9 y9Var3 = this.n;
            y9 y9Var22 = this.h;
            if (isEnabled) {
            }
            this.d = System.currentTimeMillis();
            float f382 = chatActivityEnterView.e4;
            if (f382 <= f15) {
            }
            if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                if (this.E) {
                }
                if (!this.I) {
                }
            }
            float max3 = (chatActivityEnterView.m4 || chatActivityEnterView.e4 >= 1.0f) ? f17 : Math.max(f17, AndroidUtilities.dp(19.0f));
            if (this.I) {
            }
            f21 = 1.0f;
            if (chatActivityEnterView.c4 != f21) {
            }
            this.H = max3;
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
            chatActivityEnterView.o4 = (int) ((1.0f - chatActivityEnterView.e4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.n.d((float) (Math.min(1800.0d, d) / 1800.0d), true);
            this.h.d((float) (Math.min(1800.0d, d) / 1800.0d), false);
            float min = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.b = min;
            this.c = (min - this.a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f9) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.d4 = f9;
            lg lgVar = chatActivityEnterView.J1;
            if (lgVar != null) {
                lgVar.invalidate();
            }
        }

        public void setScale(float f9) {
            ChatActivityEnterView.this.c4 = f9;
            invalidate();
        }

        public void setTransformToSeekbar(float f9) {
            ChatActivityEnterView.this.k4 = f9;
            invalidate();
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public class SlideTextView extends View {
        public final int A;
        public final Path B;
        public StaticLayout C;
        public StaticLayout D;
        public boolean E;
        public final Rect F;
        public org.telegram.ui.Cells.z G;
        public int H;
        public final boolean I;
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
            this.B = new Path();
            this.F = new Rect();
            boolean z10 = AndroidUtilities.displaySize.x <= AndroidUtilities.dp(320.0f);
            this.I = z10;
            TextPaint textPaint = new TextPaint(1);
            this.a = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(z10 ? 13.0f : 15.0f));
            TextPaint textPaint2 = new TextPaint(1);
            this.b = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint2.setTypeface(AndroidUtilities.bold());
            int i10 = org.telegram.ui.ActionBar.g6.Wk;
            int i11 = ChatActivityEnterView.i5;
            paint.setColor(ChatActivityEnterView.this.i0(i10));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dpf2(z10 ? 1.0f : 1.6f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String string = LocaleController.getString(R.string.SlideToCancel2);
            this.d = string;
            String upperCase = LocaleController.getString("Cancel", R.string.Cancel).toUpperCase();
            this.e = upperCase;
            this.A = string.indexOf(upperCase);
            a();
        }

        public final void a() {
            int i10 = org.telegram.ui.ActionBar.g6.nf;
            int i11 = ChatActivityEnterView.i5;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int i02 = chatActivityEnterView.i0(i10);
            this.a.setColor(i02);
            int i12 = org.telegram.ui.ActionBar.g6.mf;
            int i03 = chatActivityEnterView.i0(i12);
            this.b.setColor(i03);
            this.s = r2.getAlpha();
            this.v = r4.getAlpha();
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(60.0f), 0, i0.a.k(chatActivityEnterView.i0(i12), 26));
            this.G = h02;
            h02.setCallback(this);
        }

        @Override // android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.G.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f;
        }

        @Override // android.view.View
        public final void jumpDrawablesToCurrentState() {
            super.jumpDrawablesToCurrentState();
            org.telegram.ui.Cells.z zVar = this.G;
            if (zVar != null) {
                zVar.jumpToCurrentState();
            }
        }

        @Override // android.view.View
        public final void onDraw(Canvas canvas) {
            StaticLayout staticLayout;
            float f9;
            float f10;
            float f11;
            float f12;
            if (this.C == null || (staticLayout = this.D) == null) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.I1 == null) {
                return;
            }
            int dp = AndroidUtilities.dp(16.0f) + staticLayout.getWidth();
            int i02 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.nf);
            TextPaint textPaint = this.a;
            textPaint.setColor(i02);
            textPaint.setAlpha((int) ((1.0f - this.n) * this.s * this.r));
            this.b.setAlpha((int) (this.v * this.n));
            int color = textPaint.getColor();
            Paint paint = this.c;
            paint.setColor(color);
            boolean z10 = this.I;
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
            int i10 = this.A;
            boolean z11 = i10 >= 0;
            int dp4 = AndroidUtilities.dp(5.0f) + ((int) ((getMeasuredWidth() - this.f) / 2.0f));
            int measuredWidth = (int) ((getMeasuredWidth() - this.h) / 2.0f);
            float primaryHorizontal = z11 ? this.C.getPrimaryHorizontal(i10) : 0.0f;
            if (z11) {
                f9 = 16.0f;
                f10 = (dp4 + primaryHorizontal) - measuredWidth;
            } else {
                f9 = 16.0f;
                f10 = 0.0f;
            }
            float f13 = dp4;
            float f14 = this.w;
            float f15 = this.n;
            float dp5 = (((((1.0f - f15) * f14) * this.r) + f13) - (f10 * f15)) + AndroidUtilities.dp(f9);
            float dp6 = z11 ? 0.0f : this.n * AndroidUtilities.dp(12.0f);
            if (this.n != 1.0f) {
                f11 = 12.0f;
                int translationX = (int) ((chatActivityEnterView.I1.getTranslationX() * 0.3f) + ((1.0f - this.r) * ((-getMeasuredWidth()) / 4)));
                canvas.save();
                qg qgVar = chatActivityEnterView.U0;
                f12 = 2.0f;
                canvas.clipRect((qgVar == null ? 0.0f : qgVar.getLeftProperty()) + AndroidUtilities.dp(4.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.save();
                int i11 = (int) dp5;
                canvas.translate((i11 - AndroidUtilities.dp(z10 ? 7.0f : 10.0f)) + translationX, dp6);
                canvas.drawPath(this.B, paint);
                canvas.restore();
                canvas.save();
                canvas.translate(i11 + translationX, ((getMeasuredHeight() - this.C.getHeight()) / 2.0f) + dp6);
                this.C.draw(canvas);
                canvas.restore();
                canvas.restore();
            } else {
                f11 = 12.0f;
                f12 = 2.0f;
            }
            float measuredHeight = (getMeasuredHeight() - this.D.getHeight()) / f12;
            if (!z11) {
                measuredHeight -= AndroidUtilities.dp(f11) - dp6;
            }
            float f16 = z11 ? dp5 + primaryHorizontal : measuredWidth;
            Rect rect = this.F;
            rect.set((int) f16, (int) measuredHeight, (int) (this.D.getWidth() + f16), (int) (this.D.getHeight() + measuredHeight));
            rect.inset(-AndroidUtilities.dp(f9), -AndroidUtilities.dp(f9));
            if (this.n > 0.0f) {
                this.G.setBounds((getMeasuredWidth() / 2) - dp, (getMeasuredHeight() / 2) - dp, (getMeasuredWidth() / 2) + dp, (getMeasuredHeight() / 2) + dp);
                this.G.draw(canvas);
                canvas.save();
                canvas.translate(f16, measuredHeight);
                this.D.draw(canvas);
                canvas.restore();
            } else {
                setPressed(false);
            }
            if (this.n != 1.0f) {
                invalidate();
            }
        }

        @Override // android.view.View
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
            if (this.H != measuredHeight) {
                this.H = measuredHeight;
                String str = this.d;
                TextPaint textPaint = this.a;
                this.f = textPaint.measureText(str);
                String str2 = this.e;
                TextPaint textPaint2 = this.b;
                this.h = textPaint2.measureText(str2);
                this.y = System.currentTimeMillis();
                int measuredHeight2 = getMeasuredHeight() >> 1;
                Path path = this.B;
                path.reset();
                if (this.I) {
                    float f9 = measuredHeight2;
                    path.setLastPoint(AndroidUtilities.dpf2(2.5f), f9 - AndroidUtilities.dpf2(3.12f));
                    path.lineTo(0.0f, f9);
                    path.lineTo(AndroidUtilities.dpf2(2.5f), AndroidUtilities.dpf2(3.12f) + f9);
                } else {
                    float f10 = measuredHeight2;
                    path.setLastPoint(AndroidUtilities.dpf2(4.0f), f10 - AndroidUtilities.dpf2(5.0f));
                    path.lineTo(0.0f, f10);
                    path.lineTo(AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(5.0f) + f10);
                }
                int i12 = (int) this.f;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.C = new StaticLayout(this.d, textPaint, i12, alignment, 1.0f, 0.0f, false);
                this.D = new StaticLayout(this.e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
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
            int x4 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            Rect rect = this.F;
            if (action == 0) {
                boolean contains = rect.contains(x4, y8);
                this.E = contains;
                if (contains) {
                    this.G.setHotspot(x4, y8);
                    setPressed(true);
                }
                return this.E;
            }
            boolean z10 = this.E;
            if (!z10) {
                return z10;
            }
            if (motionEvent.getAction() == 2 && !rect.contains(x4, y8)) {
                setPressed(false);
                return false;
            }
            if (motionEvent.getAction() == 1 && rect.contains(x4, y8)) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                long j10 = 0;
                if (chatActivityEnterView.Z1 && chatActivityEnterView.Y0) {
                    CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.C3);
                    chatActivityEnterView.U2.l2(5, 0, chatActivityEnterView.K ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.N4, 0L, true);
                    re reVar = chatActivityEnterView.F0;
                    chatActivityEnterView.N4 = 0L;
                    reVar.setEffect(0L);
                } else {
                    chatActivityEnterView.U2.a1(0);
                    MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.K, 0L);
                }
                chatActivityEnterView.W2 = null;
                chatActivityEnterView.Y2 = null;
                chatActivityEnterView.Z2 = null;
                chatActivityEnterView.e1 = 0L;
                chatActivityEnterView.A2 = false;
                MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.M);
                long j11 = chatActivityEnterView.L2;
                org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
                if (tnVar != null && tnVar.d4) {
                    j10 = tnVar.b();
                }
                mediaDataController.pushDraftVoiceMessage(j11, j10, null);
                chatActivityEnterView.L1(2, true);
                chatActivityEnterView.J(true);
            }
            return true;
        }

        public void setCancelToProgress(float f9) {
            this.n = f9;
        }

        @Override // android.view.View
        public final boolean verifyDrawable(Drawable drawable) {
            return this.G == drawable || super.verifyDrawable(drawable);
        }
    }

    public ChatActivityEnterView(Activity activity, hv0 hv0Var, org.telegram.ui.tn tnVar, boolean z10, final org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        int i10;
        String str;
        hg hgVar;
        this.h = 1.0f;
        this.n = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.E = 0.0f;
        final int i11 = 1;
        this.F = true;
        int i12 = UserConfig.selectedAccount;
        this.M = i12;
        this.N = AccountInstance.getInstance(i12);
        this.P = 1;
        this.V = -1;
        this.h5 = 1;
        this.t0 = true;
        this.u0 = true;
        this.v0 = true;
        this.x0 = new HashMap();
        new ie(0);
        this.y0 = false;
        this.z0 = false;
        this.q1 = 1.0f;
        this.a2 = -1;
        this.e2 = true;
        this.y2 = -1.0f;
        this.z2 = AndroidUtilities.dp(80.0f);
        this.I2 = new int[2];
        this.T2 = true;
        this.j3 = -1;
        this.l3 = true;
        this.m3 = new ue(this, 0);
        this.n3 = new bf(this);
        this.o3 = new org.telegram.ui.Cells.b1(Integer.class, "translationY", 1);
        this.p3 = new nf(Float.class, "scale");
        this.q3 = new qf(Float.class, "controlsScale");
        this.r3 = new Paint(1);
        this.C3 = new ue(this, i11);
        this.F3 = new cg(this);
        this.G3 = new AnimationNotificationsLocker();
        this.H3 = new Paint(1);
        this.N3 = new RectF();
        this.O3 = new Rect();
        this.P3 = new Rect();
        this.T3 = new ue(this, 2);
        this.U3 = new ce(this, 0);
        this.V3 = new ce(this, 1);
        this.W3 = new ce(this, 2);
        this.X3 = new ce(this, 3);
        this.Y3 = new ce(this, 4);
        this.s4 = true;
        this.t4 = true;
        this.w4 = new Paint();
        this.x4 = 1.0f;
        this.y4 = new Rect();
        this.A4 = new ld(this, 7);
        this.D4 = true;
        this.J4 = new iq[1];
        this.O4 = BotForumHelper.SteamingSendButtonState.NO_STREAMING;
        this.Q4 = -1;
        Paint paint = new Paint(1);
        this.T4 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.U4 = linearGradient;
        this.V4 = new Matrix();
        jr jrVar = jr.h;
        final int i13 = 0;
        this.W4 = new d6(this, 0L, 280L, jrVar);
        this.X4 = new d6(this, 0L, 280L, jrVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        jr jrVar2 = uh.m.V;
        this.a5 = new vd.c(0, this, jrVar2, 250L);
        this.b5 = new vd.a(1, this, jrVar2, 250L, false);
        this.c5 = new vd.a(2, this, jrVar, 320L, false);
        this.d5 = new vd.a(3, this, jrVar, 320L, false);
        this.R3 = c6Var;
        this.S3 = z10;
        this.d2 = z10 && !AndroidUtilities.isInMultiwindow && (tnVar == null || !tnVar.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.L1 = paint2;
        paint2.setColor(i0(org.telegram.ui.ActionBar.g6.af));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.recordStarted);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.recordPaused);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.recordResumed);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.recordStartError);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.recordStopped);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.recordProgressChanged);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.audioDidSent);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.audioRouteChanged);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.messageReceivedByServer2);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.sendingMessagesChanged);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.audioRecordTooShort);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.updateBotMenuButton);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.didUpdatePremiumGiftFieldIcon);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.J2 = activity;
        this.K2 = tnVar;
        if (tnVar != null) {
            this.B2 = tnVar.getClassGuid();
        }
        this.h1 = hv0Var;
        this.i1 = hv0Var;
        hv0Var.setDelegate(this);
        this.w2 = MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false);
        de deVar = new de(this, activity, i13);
        this.u1 = deVar;
        deVar.setClipChildren(false);
        deVar.setClipToPadding(false);
        deVar.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
        addView(deVar, i7.f6.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        fe feVar = new fe(this, activity);
        this.t1 = feVar;
        feVar.setClipChildren(false);
        deVar.addView(feVar, i7.f6.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        ge geVar = new ge(this, activity);
        this.M0 = geVar;
        geVar.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        geVar.setFocusable(true);
        int dp = AndroidUtilities.dp(7.5f);
        geVar.setPadding(dp, dp, dp, dp);
        int i14 = org.telegram.ui.ActionBar.g6.Wk;
        int i02 = i0(i14);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        geVar.setColorFilter(new PorterDuffColorFilter(i02, mode));
        int i15 = org.telegram.ui.ActionBar.g6.i6;
        int i03 = i0(i15);
        float dp2 = AndroidUtilities.dp(19.0f);
        int dp3 = AndroidUtilities.dp(1.0f);
        int dp4 = AndroidUtilities.dp(3.0f);
        geVar.setBackground(org.telegram.ui.ActionBar.g6.W(dp2, i03, dp3, dp4, dp3, dp4));
        geVar.setOnClickListener(new nd(this, 14));
        feVar.addView(geVar, i7.f6.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        d1(false, false);
        ImageView imageView = new ImageView(activity);
        this.N0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(i0(i14), mode));
        int i04 = i0(i15);
        float dp5 = AndroidUtilities.dp(19.0f);
        int dp6 = AndroidUtilities.dp(1.0f);
        int dp7 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.W(dp5, i04, dp6, dp7, dp6, dp7));
        imageView.setVisibility(8);
        imageView.setContentDescription(LocaleController.getString(R.string.ArticleDeleteDraft));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xd
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        int i16 = ChatActivityEnterView.i5;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, c6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string;
                        c2Var.P = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new td(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    default:
                        int i17 = ChatActivityEnterView.i5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        org.telegram.ui.tn tnVar2 = chatActivityEnterView2.K2;
                        long a2 = tnVar2 != null ? tnVar2.a() : chatActivityEnterView2.L2;
                        boolean z11 = chatActivityEnterView2.y1;
                        org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                        if (!z11) {
                            if (chatActivityEnterView2.A0 != null) {
                                g0 g0Var = new g0(chatActivityEnterView2.getContext(), c6Var2);
                                g0Var.m0(chatActivityEnterView2.A0.getText());
                                g0Var.f0 = new vd(chatActivityEnterView2, 1);
                                boolean z12 = chatActivityEnterView2.U1 != null;
                                wd wdVar = new wd(chatActivityEnterView2, a2, c6Var2, 1);
                                g0Var.h0 = a2;
                                g0Var.i0 = z12;
                                g0Var.j0 = wdVar;
                                g0Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.z1 != null) {
                            g0 g0Var2 = new g0(chatActivityEnterView2.getContext(), c6Var2);
                            g0Var2.n0(chatActivityEnterView2.z1);
                            g0Var2.g0 = new vd(chatActivityEnterView2, 0);
                            wd wdVar2 = new wd(chatActivityEnterView2, a2, c6Var2, 0);
                            g0Var2.h0 = a2;
                            g0Var2.k0 = wdVar2;
                            g0Var2.show();
                            break;
                        }
                        break;
                }
            }
        });
        feVar.addView(imageView, i7.f6.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            int i16 = tnVar != null ? tnVar.N3 : -1;
            bg.y3 y3Var = new bg.y3(activity, 5);
            this.k1 = y3Var;
            y3Var.setOrientation(0);
            y3Var.setEnabled(false);
            y3Var.setClipChildren(false);
            feVar.addView(y3Var, i7.f6.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i16 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.D1 = imageView2;
                gr grVar = new gr(activity, R.drawable.input_notify_on, i14);
                this.a0 = grVar;
                imageView2.setImageDrawable(grVar);
                this.a0.a(this.b2, false);
                if (this.b2) {
                    i10 = R.string.AccDescrChanSilentOn;
                    str = "AccDescrChanSilentOn";
                } else {
                    i10 = R.string.AccDescrChanSilentOff;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(LocaleController.getString(str, i10));
                imageView2.setColorFilter(new PorterDuffColorFilter(i0(i14), PorterDuff.Mode.MULTIPLY));
                imageView2.setScaleType(scaleType);
                imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(i0(i15), 1, -1));
                imageView2.setVisibility((!this.c2 || ((hgVar = this.U2) != null && hgVar.C0())) ? 8 : 0);
                y3Var.addView(imageView2, i7.f6.n(44, 44));
                imageView2.setOnClickListener(new he(this, tnVar, activity));
            }
            je jeVar = new je(activity, 0);
            this.m1 = jeVar;
            jeVar.setScaleType(scaleType);
            jeVar.setColorFilter(new PorterDuffColorFilter(i0(i14), PorterDuff.Mode.MULTIPLY));
            jeVar.setImageResource(R.drawable.msg_input_attach2);
            jeVar.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(i15), 1, -1));
            feVar.addView(jeVar, i7.f6.e(44, 44, 85));
            jeVar.setOnClickListener(new nd(this, 18));
            jeVar.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
            H1(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.o1 = imageView3;
        k0 k0Var = new k0(activity);
        this.n1 = k0Var;
        imageView3.setImageDrawable(k0Var);
        imageView3.setScaleType(scaleType);
        int i05 = i0(i14);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(i05, mode2));
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(i15), 1, AndroidUtilities.dp(16.0f)));
        deVar.addView(imageView3, i7.f6.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        i7.h6.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xd
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        int i162 = ChatActivityEnterView.i5;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, c6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string;
                        c2Var.P = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new td(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    default:
                        int i17 = ChatActivityEnterView.i5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        org.telegram.ui.tn tnVar2 = chatActivityEnterView2.K2;
                        long a2 = tnVar2 != null ? tnVar2.a() : chatActivityEnterView2.L2;
                        boolean z11 = chatActivityEnterView2.y1;
                        org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                        if (!z11) {
                            if (chatActivityEnterView2.A0 != null) {
                                g0 g0Var = new g0(chatActivityEnterView2.getContext(), c6Var2);
                                g0Var.m0(chatActivityEnterView2.A0.getText());
                                g0Var.f0 = new vd(chatActivityEnterView2, 1);
                                boolean z12 = chatActivityEnterView2.U1 != null;
                                wd wdVar = new wd(chatActivityEnterView2, a2, c6Var2, 1);
                                g0Var.h0 = a2;
                                g0Var.i0 = z12;
                                g0Var.j0 = wdVar;
                                g0Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.z1 != null) {
                            g0 g0Var2 = new g0(chatActivityEnterView2.getContext(), c6Var2);
                            g0Var2.n0(chatActivityEnterView2.z1);
                            g0Var2.g0 = new vd(chatActivityEnterView2, 0);
                            wd wdVar2 = new wd(chatActivityEnterView2, a2, c6Var2, 0);
                            g0Var2.h0 = a2;
                            g0Var2.k0 = wdVar2;
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
        this.p1 = imageView4;
        imageView4.setImageResource(R.drawable.iv_fullscreen);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(i0(i14), mode2));
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(i15), 1, AndroidUtilities.dp(16.0f)));
        deVar.addView(imageView4, i7.f6.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.ArticleEditor));
        i7.h6.a(imageView4);
        imageView4.setOnClickListener(new nd(this, 20));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.W2 != null) {
            X();
        }
        ImageView imageView5 = new ImageView(activity);
        this.w1 = imageView5;
        imageView5.setImageResource(R.drawable.send_outline);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        imageView5.setColorFilter(i0(org.telegram.ui.ActionBar.g6.hl), mode);
        deVar.addView(imageView5, i7.f6.e(44, 44, 85));
        de deVar2 = new de(this, activity, i11);
        this.v1 = deVar2;
        deVar2.setClipChildren(false);
        deVar2.setClipToPadding(false);
        deVar.addView(deVar2, i7.f6.e(100, 44, 85));
        oe oeVar = new oe(this, activity, c6Var);
        this.V0 = oeVar;
        oeVar.setSoundEffectsEnabled(false);
        deVar2.addView(oeVar, i7.f6.e(44, 44, 85));
        oeVar.setFocusable(true);
        oeVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.I3 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(i0(i14), mode2));
        Drawable mutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.J3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i0(i14), mode2));
        pe peVar = new pe(this, activity);
        this.X0 = peVar;
        peVar.setImportantForAccessibility(2);
        int dp8 = AndroidUtilities.dp(10.0f);
        peVar.setPadding(dp8, dp8, dp8, dp8);
        oeVar.addView(peVar, i7.f6.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.L0 = imageView6;
        int i17 = 4;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        qe qeVar = new qe();
        this.K1 = qeVar;
        imageView6.setImageDrawable(qeVar);
        imageView6.setContentDescription(LocaleController.getString("Cancel", R.string.Cancel));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        imageView6.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(i0(i15), 1, -1));
        deVar2.addView(imageView6, i7.f6.e(44, 44, 85));
        imageView6.setOnClickListener(new nd(this, 0));
        re reVar = new re(this, activity, c() ? R.drawable.input_schedule : R.drawable.send_plane_24, c6Var, 0);
        this.F0 = reVar;
        reVar.setVisibility(4);
        reVar.setContentDescription(LocaleController.getString(R.string.Send));
        int i18 = 0;
        reVar.setSoundEffectsEnabled(false);
        reVar.setScaleX(0.1f);
        reVar.setScaleY(0.1f);
        reVar.setAlpha(0.0f);
        deVar2.addView(reVar, i7.f6.e(100, 44, 85));
        reVar.setOnClickListener(new nd(this, i11));
        reVar.setOnLongClickListener(new qd(this, i18));
        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            deVar2.setOnLongClickListener(new qd(this, i18));
        }
        jh.g5 g5Var = new jh.g5(activity, c6Var);
        this.E0 = g5Var;
        g5Var.setVisibility(4);
        g5Var.setOnClickListener(new nd(this, i17));
        deVar2.addView(g5Var, i7.f6.e(44, 44, 85));
        pg pgVar = new pg(activity);
        this.B0 = pgVar;
        org.telegram.ui.ActionBar.h5 h5Var = pgVar.a;
        h5Var.setTextSize(16);
        pgVar.invalidate();
        pgVar.setVisibility(4);
        pgVar.setSoundEffectsEnabled(false);
        pgVar.setScaleX(0.1f);
        pgVar.setScaleY(0.1f);
        pgVar.setAlpha(0.0f);
        pgVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        h5Var.setGravity(21);
        pgVar.invalidate();
        h5Var.setTextColor(i0(i14));
        pgVar.invalidate();
        deVar2.addView(pgVar, i7.f6.e(74, 44, 85));
        pgVar.setOnClickListener(new nd(this, 8));
        pgVar.setOnLongClickListener(new qd(this, i11));
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        this.s2 = globalEmojiSettings.getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.t2 = globalEmojiSettings.getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        k1(false, false);
        J(false);
        E();
        W();
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0132, code lost:
    
        if (r4 != null) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean H(int i10, long j10, org.telegram.ui.ActionBar.o2 o2Var, CharSequence charSequence) {
        y5[] y5VarArr;
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
        if (charSequence != null && o2Var != null && !UserConfig.getInstance(i10).isPremium() && UserConfig.getInstance(i10).getClientUserId() != j10 && (charSequence instanceof Spanned) && (y5VarArr = (y5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), y5.class)) != null) {
            int i14 = 0;
            while (i14 < y5VarArr.length) {
                y5 y5Var = y5VarArr[i14];
                if (y5Var != null) {
                    TLRPC.Document document = y5Var.document;
                    if (document == null) {
                        i12 = i10;
                        document = p5.f(i12, y5Var.getDocumentId());
                    } else {
                        i12 = i10;
                    }
                    long documentId = y5VarArr[i14].getDocumentId();
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
                    if (document != null && (chatFull = MessagesController.getInstance(i12).getChatFull(-j10)) != null && chatFull.emojiset != null && (groupStickerSetById = MediaDataController.getInstance(i12).getGroupStickerSetById(chatFull.emojiset)) != null) {
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
                        tc.a0(o2Var).q(document, AndroidUtilities.replaceTags(LocaleController.getString("UnlockPremiumEmojiHint", R.string.UnlockPremiumEmojiHint)), LocaleController.getString("PremiumMore", R.string.PremiumMore), new md(0, o2Var)).j();
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

    public static void f(final ChatActivityEnterView chatActivityEnterView, final xu0 xu0Var, int[] iArr, oo0 oo0Var) {
        o1.k kVar;
        Dialog dialog;
        o1.k kVar2;
        int[] iArr2 = chatActivityEnterView.I2;
        if (chatActivityEnterView.m0 == null) {
            return;
        }
        Dialog dialog2 = new Dialog(chatActivityEnterView.getContext(), R.style.TransparentDialogNoAnimation);
        FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
        frameLayout.addView(xu0Var, i7.f6.e(40, 40, 3));
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
        AndroidUtilities.setLightStatusBar(dialog2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.s8, true) == -1);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            AndroidUtilities.setLightNavigationBar(dialog2, AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, true)) >= 0.721f);
        }
        if (i10 >= 23) {
            chatActivityEnterView.o0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.o0;
        }
        chatActivityEnterView.l0.getLocationInWindow(iArr2);
        final float f9 = iArr2[0];
        final float f10 = iArr2[1];
        float dp = AndroidUtilities.dp(5.0f);
        float dp2 = iArr[0] + chatActivityEnterView.o0 + dp + AndroidUtilities.dp(4.0f) + 0.0f;
        float f11 = iArr[1] + chatActivityEnterView.p0 + dp + 0.0f;
        xu0Var.setTranslationX(dp2);
        xu0Var.setTranslationY(f11);
        float scaleX = (chatActivityEnterView.l0.getLayoutParams().width * (chatActivityEnterView.g5 ? chatActivityEnterView.l0.getScaleX() : 1.0f)) / AndroidUtilities.dp(40.0f);
        xu0Var.setPivotX(0.0f);
        xu0Var.setPivotY(0.0f);
        xu0Var.setScaleX(0.75f);
        xu0Var.setScaleY(0.75f);
        xu0Var.getViewTreeObserver().addOnDrawListener(new ze(xu0Var, oo0Var));
        dialog2.show();
        if (!chatActivityEnterView.g5) {
            chatActivityEnterView.l0.setScaleX(1.0f);
            chatActivityEnterView.l0.setScaleY(1.0f);
        }
        chatActivityEnterView.l0.setAlpha(1.0f);
        ye yeVar = chatActivityEnterView.m0;
        boolean z10 = chatActivityEnterView.g5;
        o1.d dVar = o1.i.o;
        if (z10) {
            kVar = null;
        } else {
            o1.k kVar3 = new o1.k(chatActivityEnterView.l0, dVar);
            kVar3.u = org.telegram.ui.th.l(0.5f, 750.0f, 1.0f);
            kVar = kVar3;
        }
        boolean z11 = chatActivityEnterView.g5;
        o1.d dVar2 = o1.i.p;
        if (z11) {
            dialog = dialog2;
            kVar2 = null;
        } else {
            dialog = dialog2;
            o1.k kVar4 = new o1.k(chatActivityEnterView.l0, dVar2);
            kVar4.u = org.telegram.ui.th.l(0.5f, 750.0f, 1.0f);
            kVar2 = kVar4;
        }
        o1.k kVar5 = new o1.k(chatActivityEnterView.l0, o1.i.t);
        kVar5.u = org.telegram.ui.th.l(0.0f, 750.0f, 1.0f);
        final int i11 = 0;
        final Dialog dialog3 = dialog;
        kVar5.a(new o1.g(chatActivityEnterView) { // from class: org.telegram.ui.Components.pd
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = chatActivityEnterView;
            }

            @Override // o1.g
            public final void a(o1.i iVar, boolean z12, float f12, float f13) {
                int i12 = i11;
                float f14 = f10;
                float f15 = f9;
                xu0 xu0Var2 = xu0Var;
                Dialog dialog4 = dialog3;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                int i13 = 0;
                switch (i12) {
                    case 0:
                        int i14 = ChatActivityEnterView.i5;
                        if (dialog4.isShowing()) {
                            xu0Var2.setTranslationX(f15);
                            xu0Var2.setTranslationY(f14);
                            qo0 qo0Var = chatActivityEnterView2.l0;
                            qo0Var.getClass();
                            qo0Var.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.g5) {
                                chatActivityEnterView2.l0.setScaleX(1.0f);
                                chatActivityEnterView2.l0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.l0.setAlpha(1.0f);
                            chatActivityEnterView2.l0.getViewTreeObserver().addOnPreDrawListener(new af(chatActivityEnterView2, dialog4, i13));
                            break;
                        }
                        break;
                    default:
                        int i15 = ChatActivityEnterView.i5;
                        if (dialog4.isShowing()) {
                            xu0Var2.setTranslationX(f15);
                            xu0Var2.setTranslationY(f14);
                            qo0 qo0Var2 = chatActivityEnterView2.l0;
                            qo0Var2.getClass();
                            qo0Var2.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.g5) {
                                chatActivityEnterView2.l0.setScaleX(1.0f);
                                chatActivityEnterView2.l0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.l0.setAlpha(1.0f);
                            chatActivityEnterView2.l0.getViewTreeObserver().addOnPreDrawListener(new af(chatActivityEnterView2, dialog4, 1));
                            break;
                        }
                        break;
                }
            }
        });
        o1.k kVar6 = new o1.k(xu0Var, o1.i.m);
        kVar6.b = i7.w.a(dp2, f9 - AndroidUtilities.dp(6.0f), dp2);
        kVar6.c = true;
        kVar6.u = org.telegram.ui.th.l(f9, 700.0f, 0.75f);
        kVar6.h = f9 - AndroidUtilities.dp(6.0f);
        o1.k kVar7 = new o1.k(xu0Var, o1.i.n);
        kVar7.b = i7.w.a(f11, f11, AndroidUtilities.dp(6.0f) + f10);
        kVar7.c = true;
        kVar7.u = org.telegram.ui.th.l(f10, 700.0f, 0.75f);
        kVar7.g = AndroidUtilities.dp(6.0f) + f10;
        kVar7.b(new cf(f10, xu0Var));
        final int i12 = 1;
        kVar7.a(new o1.g(chatActivityEnterView) { // from class: org.telegram.ui.Components.pd
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = chatActivityEnterView;
            }

            @Override // o1.g
            public final void a(o1.i iVar, boolean z12, float f12, float f13) {
                int i122 = i12;
                float f14 = f10;
                float f15 = f9;
                xu0 xu0Var2 = xu0Var;
                Dialog dialog4 = dialog3;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                int i13 = 0;
                switch (i122) {
                    case 0:
                        int i14 = ChatActivityEnterView.i5;
                        if (dialog4.isShowing()) {
                            xu0Var2.setTranslationX(f15);
                            xu0Var2.setTranslationY(f14);
                            qo0 qo0Var = chatActivityEnterView2.l0;
                            qo0Var.getClass();
                            qo0Var.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.g5) {
                                chatActivityEnterView2.l0.setScaleX(1.0f);
                                chatActivityEnterView2.l0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.l0.setAlpha(1.0f);
                            chatActivityEnterView2.l0.getViewTreeObserver().addOnPreDrawListener(new af(chatActivityEnterView2, dialog4, i13));
                            break;
                        }
                        break;
                    default:
                        int i15 = ChatActivityEnterView.i5;
                        if (dialog4.isShowing()) {
                            xu0Var2.setTranslationX(f15);
                            xu0Var2.setTranslationY(f14);
                            qo0 qo0Var2 = chatActivityEnterView2.l0;
                            qo0Var2.getClass();
                            qo0Var2.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.g5) {
                                chatActivityEnterView2.l0.setScaleX(1.0f);
                                chatActivityEnterView2.l0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.l0.setAlpha(1.0f);
                            chatActivityEnterView2.l0.getViewTreeObserver().addOnPreDrawListener(new af(chatActivityEnterView2, dialog4, 1));
                            break;
                        }
                        break;
                }
            }
        });
        o1.k kVar8 = new o1.k(xu0Var, dVar);
        kVar8.u = org.telegram.ui.th.l(scaleX, 1000.0f, 1.0f);
        o1.k kVar9 = new o1.k(xu0Var, dVar2);
        kVar9.u = org.telegram.ui.th.l(scaleX, 1000.0f, 1.0f);
        yeVar.l(kVar, kVar2, kVar5, kVar6, kVar7, kVar8, kVar9);
    }

    public static void g(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, Long l10, boolean z11) {
        if (chatActivityEnterView.C0 > 0 && !chatActivityEnterView.c()) {
            hg hgVar = chatActivityEnterView.U2;
            if (hgVar != null) {
                pg pgVar = chatActivityEnterView.B0;
                hgVar.t1(pgVar, pgVar.a.getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.M1 != 0) {
            chatActivityEnterView.m1(0, true);
            chatActivityEnterView.Q0.t(true);
            chatActivityEnterView.Q0.B();
        }
        chatActivityEnterView.n1(false, true, false, true);
        hg hgVar2 = chatActivityEnterView.U2;
        TL_stories.StoryItem d12 = hgVar2 != null ? hgVar2.d1() : null;
        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.M);
        long j10 = chatActivityEnterView.L2;
        MessageObject messageObject = chatActivityEnterView.O2;
        MessageObject threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.jn jnVar = chatActivityEnterView.Q2;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
        sendMessagesHelper.sendSticker(document, str, j10, messageObject, threadMessage, d12, jnVar, sendAnimationData, z10, i10, i11, z12, obj, tnVar != null ? tnVar.C8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        hg hgVar3 = chatActivityEnterView.U2;
        if (hgVar3 != null) {
            hgVar3.D(null, true, i10, 0, 0L);
        }
        if (z11) {
            chatActivityEnterView.setFieldText("");
        }
        MediaDataController.getInstance(chatActivityEnterView.M).addRecentSticker(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MessageObject getThreadMessage() {
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar != null) {
            return tnVar.T3;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getThreadMessageId() {
        MessageObject messageObject;
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar == null || (messageObject = tnVar.T3) == null) {
            return 0;
        }
        return messageObject.getId();
    }

    private String getTopicKeyString() {
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar == null || !tnVar.d4) {
            return "" + this.L2;
        }
        return this.L2 + "_" + tnVar.b();
    }

    public static void h(ChatActivityEnterView chatActivityEnterView, TL_keyboard.KeyboardButton keyboardButton) {
        org.telegram.ui.tn tnVar;
        boolean z10 = chatActivityEnterView.O2 != null && (tnVar = chatActivityEnterView.K2) != null && tnVar.d4 && tnVar.b() == ((long) chatActivityEnterView.O2.getId());
        MessageObject messageObject = ((chatActivityEnterView.O2 == null || z10) && !BotForumHelper.isBotForum(chatActivityEnterView.M, chatActivityEnterView.L2)) ? DialogObject.isChatDialog(chatActivityEnterView.L2) ? chatActivityEnterView.h2 : null : chatActivityEnterView.O2;
        MessageObject messageObject2 = chatActivityEnterView.O2;
        if (messageObject2 == null || z10) {
            messageObject2 = chatActivityEnterView.h2;
        }
        boolean c02 = chatActivityEnterView.c0(keyboardButton, messageObject, messageObject2, null);
        if (chatActivityEnterView.O2 == null || z10) {
            MessageObject messageObject3 = chatActivityEnterView.h2;
            if (messageObject3 != null && messageObject3.messageOwner.reply_markup.single_use) {
                if (c02) {
                    chatActivityEnterView.I0();
                } else {
                    chatActivityEnterView.t1(0, 0, true, true);
                }
                MessagesController.getMainSettings(chatActivityEnterView.M).edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.h2.getId()).commit();
            }
        } else {
            chatActivityEnterView.I0();
            chatActivityEnterView.Z0(chatActivityEnterView.R2, true, false);
        }
        hg hgVar = chatActivityEnterView.U2;
        if (hgVar != null) {
            hgVar.D(null, true, 0, 0, 0L);
        }
    }

    public static /* synthetic */ void i(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        Activity activity = chatActivityEnterView.J2;
        if (Build.VERSION.SDK_INT < 23 || activity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
            SendMessagesHelper.getInstance(chatActivityEnterView.M).sendCurrentLocation(messageObject, keyboardButtonProto);
            return;
        }
        activity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
        chatActivityEnterView.d3 = messageObject;
        chatActivityEnterView.e3 = keyboardButtonProto;
    }

    public static void m(ChatActivityEnterView chatActivityEnterView) {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            chatActivityEnterView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(chatActivityEnterView, "lockAnimatedTranslation", chatActivityEnterView.f4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(chatActivityEnterView, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(jr.h);
        ofFloat2.setDuration(250L);
        SharedConfig.removeLockRecordAudioVideoHint();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(chatActivityEnterView, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(chatActivityEnterView.f1, "cancelToProgress", 1.0f));
        animatorSet.start();
    }

    public static CharSequence r(ArrayList arrayList, CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        MediaDataController.sortEntities(arrayList);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(d10.a(charSequence, false));
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
                            d51 d51Var = new d51("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i11 = messageEntity.offset;
                            spannableStringBuilder.setSpan(d51Var, i11, messageEntity.length + i11, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            d51 d51Var2 = new d51("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i12 = messageEntity.offset;
                            spannableStringBuilder.setSpan(d51Var2, i12, messageEntity.length + i12, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            h01 h01Var = new h01();
                            h01Var.a |= 4;
                            i01 i01Var = new i01(h01Var, 0);
                            int i13 = messageEntity.offset;
                            MediaDataController.addStyleToText(i01Var, i13, messageEntity.length + i13, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                h01 h01Var2 = new h01();
                                h01Var2.a |= 1;
                                i01 i01Var2 = new i01(h01Var2, 0);
                                int i14 = messageEntity.offset;
                                MediaDataController.addStyleToText(i01Var2, i14, messageEntity.length + i14, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                h01 h01Var3 = new h01();
                                h01Var3.a |= 2;
                                i01 i01Var3 = new i01(h01Var3, 0);
                                int i15 = messageEntity.offset;
                                MediaDataController.addStyleToText(i01Var3, i15, messageEntity.length + i15, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                h01 h01Var4 = new h01();
                                h01Var4.a |= 8;
                                i01 i01Var4 = new i01(h01Var4, 0);
                                int i16 = messageEntity.offset;
                                MediaDataController.addStyleToText(i01Var4, i16, messageEntity.length + i16, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                h01 h01Var5 = new h01();
                                h01Var5.a |= 16;
                                i01 i01Var5 = new i01(h01Var5, 0);
                                int i17 = messageEntity.offset;
                                MediaDataController.addStyleToText(i01Var5, i17, messageEntity.length + i17, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                c51 c51Var = new c51(messageEntity.url, null);
                                int i18 = messageEntity.offset;
                                spannableStringBuilder.setSpan(c51Var, i18, messageEntity.length + i18, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                h01 h01Var6 = new h01();
                                h01Var6.a |= 128;
                                int i19 = messageEntity.offset;
                                h01Var6.b = i19;
                                h01Var6.c = i19 + messageEntity.length;
                                h01Var6.d = messageEntity;
                                int i20 = messageEntity.offset;
                                d10 d10Var = new d10(spannableStringBuilder.subSequence(i20, messageEntity.length + i20).toString(), h01Var6, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i21 = messageEntity.offset;
                                spannableStringBuilder.setSpan(d10Var, i21, messageEntity.length + i21, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                h01 h01Var7 = new h01();
                                h01Var7.a |= 256;
                                i01 i01Var6 = new i01(h01Var7, 0);
                                int i22 = messageEntity.offset;
                                MediaDataController.addStyleToText(i01Var6, i22, messageEntity.length + i22, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                y5 y5Var = tL_messageEntityCustomEmoji.document != null ? new y5(tL_messageEntityCustomEmoji.document, fontMetricsInt) : new y5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                int i23 = messageEntity.offset;
                                spannableStringBuilder.setSpan(y5Var, i23, messageEntity.length + i23, 33);
                            }
                        }
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
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
                        qi0.c(spannableStringBuilder, i27, i30, z10);
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
                qi0.c(spannableStringBuilder, i27, spannableStringBuilder.length(), z10);
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
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        return replaceEmoji;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlowModeButtonVisible(boolean z10) {
        int i10;
        int i11 = z10 ? 0 : 8;
        pg pgVar = this.B0;
        pgVar.setVisibility(i11);
        if (z10) {
            i10 = AndroidUtilities.dp(pgVar.e ? 26.0f : 16.0f);
        } else {
            i10 = 0;
        }
        jf jfVar = this.A0;
        if (jfVar == null || jfVar.getPaddingRight() == i10) {
            return;
        }
        this.A0.setPadding(0, AndroidUtilities.dp(9.0f), i10, AndroidUtilities.dp(10.0f));
    }

    public final void A() {
        bh.d dVar = this.Z0;
        if (dVar != null) {
            dVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.o2 = null;
        x0();
        if (this.k1 != null) {
            this.x = 0.0f;
            A1();
        }
        SlideTextView slideTextView = this.f1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.U2.e();
        P1(true);
    }

    public final void A1() {
        z1();
        bg.y3 y3Var = this.k1;
        if (y3Var != null) {
            y3Var.setTranslationX(this.y + this.x);
            y3Var.setAlpha(this.A * this.B);
            y3Var.setVisibility(y3Var.getAlpha() > 0.0f ? 0 : 8);
            je jeVar = this.m1;
            if (jeVar != null && this.v4) {
                jeVar.setAlpha(this.q1 * this.B);
            }
        }
        te teVar = this.E1;
        if (teVar != null) {
            teVar.setTranslationX(teVar.a);
        }
    }

    public final void B() {
        if (this.Z1 && this.Y0) {
            CameraController.getInstance().cancelOnInitRunnable(this.C3);
            this.U2.l2(5, 0, this.K ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, this.N4, 0L, true);
            this.N4 = 0L;
            this.F0.setEffect(0L);
        } else {
            this.U2.a1(0);
            MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
        }
        this.A2 = false;
        L1(2, true);
    }

    public final void B0() {
        gk0 gk0Var = this.d1;
        if (gk0Var != null) {
            gk0Var.M = true;
            x61 x61Var = gk0Var.n;
            if (x61Var != null) {
                x61Var.Q(false);
                gk0Var.n.I();
                gk0Var.n = null;
            }
        }
        if (this.d1 != null && this.W2 != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.M);
            long j10 = this.L2;
            org.telegram.ui.tn tnVar = this.K2;
            long b10 = (tnVar == null || !tnVar.d4) ? 0L : tnVar.b();
            gk0 gk0Var2 = this.d1;
            float audioLeft = gk0Var2 == null ? 0.0f : gk0Var2.getAudioLeft();
            gk0 gk0Var3 = this.d1;
            mediaDataController.setDraftVoiceRegion(j10, b10, audioLeft, gk0Var3 == null ? 1.0f : gk0Var3.getAudioRight());
        }
        this.T1 = true;
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.recordStarted);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.recordPaused);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.recordResumed);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.recordStartError);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.recordStopped);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.recordProgressChanged);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.audioDidSent);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.audioRouteChanged);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.messageReceivedByServer2);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.sendingMessagesChanged);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.audioRecordTooShort);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.updateBotMenuButton);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.didUpdatePremiumGiftFieldIcon);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        xf xfVar = this.Q0;
        if (xfVar != null) {
            xfVar.D();
        }
        ld ldVar = this.D0;
        if (ldVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ldVar);
            this.D0 = null;
        }
        PowerManager.WakeLock wakeLock = this.l2;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.l2 = null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        hv0 hv0Var = this.h1;
        if (hv0Var != null) {
            hv0Var.setDelegate(null);
        }
        ye yeVar = this.m0;
        if (yeVar != null) {
            yeVar.e = false;
            yeVar.dismiss();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b3, code lost:
    
        if (android.text.TextUtils.isEmpty(r15 == null ? "" : org.telegram.messenger.AndroidUtilities.getTrimmedString(r15.getTextToUse())) != false) goto L124;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B1(boolean z10) {
        ve veVar;
        if (this.S3) {
            org.telegram.ui.tn tnVar = this.K2;
            if (tnVar != null && !tnVar.J5) {
                z10 = false;
            }
            boolean j02 = j0();
            boolean z11 = this.h5 != 1 && this.L2 > 0;
            ve veVar2 = this.s1;
            boolean z12 = veVar2 != null && veVar2.getVisibility() == 0;
            if (!j02 && !this.k2 && this.i2 == null) {
                ve veVar3 = this.s1;
                if (veVar3 != null) {
                    veVar3.setVisibility(8);
                }
            } else if (this.i2 != null) {
                if (t0() && this.a2 == 1 && this.i2.is_persistent) {
                    ve veVar4 = this.s1;
                    if (veVar4 != null && veVar4.getVisibility() != 8) {
                        this.s1.setVisibility(8);
                    }
                } else {
                    Q();
                    if (this.s1.getVisibility() != 0) {
                        this.s1.setVisibility(0);
                    }
                    this.P1.a(R.drawable.input_bot2, true);
                    this.s1.setContentDescription(LocaleController.getString("AccDescrBotKeyboard", R.string.AccDescrBotKeyboard));
                }
            } else if (z11) {
                ve veVar5 = this.s1;
                if (veVar5 != null) {
                    veVar5.setVisibility(8);
                }
            } else {
                Q();
                this.P1.a(R.drawable.input_bot1, true);
                this.s1.setContentDescription(LocaleController.getString("AccDescrBotCommands", R.string.AccDescrBotCommands));
                this.s1.setVisibility(0);
            }
            if (z11) {
                R();
            }
            ve veVar6 = this.s1;
            boolean z13 = (veVar6 != null && veVar6.getVisibility() == 0) != z12;
            ph.z zVar = this.h0;
            int i10 = 2;
            if (zVar != null) {
                boolean z14 = zVar.w;
                zVar.setWebView(this.h5 == 3);
                ph.z zVar2 = this.h0;
                String string = this.h5 == 2 ? LocaleController.getString(R.string.BotsMenuTitle) : this.e0;
                if (string == null) {
                    zVar2.getClass();
                    string = LocaleController.getString(R.string.BotsMenuTitle);
                }
                String str = zVar2.n;
                boolean z15 = str == null || !str.equals(string);
                zVar2.n = string;
                zVar2.r = null;
                zVar2.requestLayout();
                AndroidUtilities.updateViewVisibilityAnimated(this.h0, z11, 0.5f, z10);
                z13 = z13 || z15 || z14 != this.h0.w;
            }
            if (z13 && z10) {
                ge geVar = this.M0;
                Float valueOf = Float.valueOf(geVar.getX());
                HashMap hashMap = this.x0;
                hashMap.put(geVar, valueOf);
                jf jfVar = this.A0;
                if (jfVar != null) {
                    hashMap.put(jfVar, Float.valueOf(jfVar.getX()));
                }
                ve veVar7 = this.s1;
                boolean z16 = veVar7 != null && veVar7.getVisibility() == 0;
                if (z16 != z12 && (veVar = this.s1) != null) {
                    veVar.setVisibility(0);
                    if (z16) {
                        this.s1.setAlpha(0.0f);
                        this.s1.setScaleX(0.1f);
                        this.s1.setScaleY(0.1f);
                    } else if (!z16) {
                        this.s1.setAlpha(1.0f);
                        this.s1.setScaleX(1.0f);
                        this.s1.setScaleY(1.0f);
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(this.s1, z16, 0.1f, true, 1.0f, true, new jd(this, 1));
                }
            }
            ve veVar8 = this.s1;
            if (veVar8 != null && veVar8.getVisibility() == 0) {
                jf jfVar2 = this.A0;
            }
            i10 = this.K4;
            H1(i10);
        }
    }

    public final void C() {
        ve veVar;
        org.telegram.ui.tn tnVar;
        if (this.H != null || (veVar = this.F1) == null || veVar.getRight() == 0 || (tnVar = this.K2) == null || !BirthdayController.isToday(tnVar.W7)) {
            return;
        }
        if (MessagesController.getInstance(this.M).getMainSettings().getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + tnVar.a(), true)) {
            MessagesController.getInstance(this.M).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + tnVar.a(), false).apply();
            nh.t3 t3Var = new nh.t3(getContext(), 3);
            this.H = t3Var;
            t3Var.r(13.0f);
            this.H.q(true);
            W0();
            this.H.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            this.H.n(1.0f, -((getWidth() - AndroidUtilities.dp(12.0f)) - ((this.F1.getMeasuredWidth() / 2.0f) + (this.F1.getX() + (this.k1.getX() + this.t1.getX())))));
            addView(this.H, i7.f6.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
            nh.t3 t3Var2 = this.H;
            t3Var2.h0 = new ld(this, 12);
            t3Var2.d = 8000L;
            t3Var2.v();
        }
    }

    public final void C1() {
        int d;
        f2.j0 j0Var;
        int L0;
        View m10;
        gf gfVar = this.i0;
        if (gfVar == null) {
            return;
        }
        int childCount = gfVar.c.getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = this.i0.c.getChildAt(i11);
            if (i11 < 4) {
                i10 += childAt.getMeasuredHeight();
            }
        }
        hv0 hv0Var = this.h1;
        if (i10 > 0) {
            d = j7.l1.d(childCount > 4 ? 12.0f : 0.0f, (hv0Var.getMeasuredHeight() - i10) - AndroidUtilities.dp(8.0f), 0);
        } else {
            d = this.j0.c.size() > 4 ? j7.l1.d(162.8f, hv0Var.getMeasuredHeight(), 0) : j7.l1.d((Math.max(1, Math.min(4, this.j0.c.size())) * 36) + 8, hv0Var.getMeasuredHeight(), 0);
        }
        if (this.i0.c.getPaddingTop() != d) {
            this.i0.c.setTopGlowOffset(d);
            if (this.Q4 == -1 && this.i0.getVisibility() == 0 && this.i0.c.getLayoutManager() != null && (L0 = (j0Var = (f2.j0) this.i0.c.getLayoutManager()).L0()) >= 0 && (m10 = j0Var.m(L0)) != null) {
                this.Q4 = L0;
                this.R4 = m10.getTop() - this.i0.c.getPaddingTop();
            }
            this.i0.c.setPadding(0, d, 0, AndroidUtilities.dp(8.0f));
        }
    }

    public final void D() {
        jf jfVar = this.A0;
        boolean z10 = ((jfVar != null && !TextUtils.isEmpty(jfVar.getText())) || this.u2 || this.f3 || t0()) ? false : true;
        if (z10) {
            R();
        }
        ph.z zVar = this.h0;
        if (zVar != null) {
            boolean z11 = zVar.f;
            if (z11 != z10) {
                zVar.f = z10;
                zVar.requestLayout();
                zVar.invalidate();
            }
            if (z11 != this.h0.f) {
                ge geVar = this.M0;
                Float valueOf = Float.valueOf(geVar.getX());
                HashMap hashMap = this.x0;
                hashMap.put(geVar, valueOf);
                jf jfVar2 = this.A0;
                if (jfVar2 != null) {
                    hashMap.put(jfVar2, Float.valueOf(jfVar2.getX()));
                }
            }
        }
    }

    public final void D0() {
        this.e2 = true;
        ye yeVar = this.m0;
        if (yeVar != null) {
            yeVar.e = false;
            yeVar.dismiss();
        }
        if (this.u2) {
            this.g2 = true;
        }
        ld ldVar = new ld(this, 8);
        this.I4 = ldVar;
        AndroidUtilities.runOnUIThread(ldVar, 500L);
    }

    public final void D1(boolean z10) {
        if (this.h5 != 1 && this.L2 > 0) {
            R();
        }
        ph.z zVar = this.h0;
        if (zVar != null) {
            zVar.setWebView(j0());
        }
        B1(z10);
    }

    public final void E() {
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar == null) {
            return;
        }
        K1(tnVar.e, tnVar.W7);
    }

    public final void E0() {
        jf jfVar;
        this.e2 = false;
        ld ldVar = this.I4;
        if (ldVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ldVar);
            this.I4 = null;
        }
        if (j0() && v()) {
            return;
        }
        getVisibility();
        if (!this.g2 || org.telegram.ui.ActionBar.o2.hasSheets(this.K2)) {
            return;
        }
        this.g2 = false;
        hg hgVar = this.U2;
        if (hgVar != null) {
            hgVar.r1();
        }
        if (this.M1 == 0 && (jfVar = this.A0) != null) {
            jfVar.requestFocus();
        }
        AndroidUtilities.showKeyboard(this.A0);
        if (AndroidUtilities.usingHardwareInput || this.u2 || AndroidUtilities.isInMultiwindow) {
            return;
        }
        this.f3 = true;
        ue ueVar = this.m3;
        AndroidUtilities.cancelRunOnUIThread(ueVar);
        AndroidUtilities.runOnUIThread(ueVar, 100L);
    }

    public final void E1() {
        jf jfVar = this.A0;
        boolean z10 = false;
        p1((jfVar == null || jfVar.getLineCount() <= 2 || this.A0.getText() == null || TextUtils.isEmpty(this.A0.getText().toString().trim())) ? false : true);
        jf jfVar2 = this.A0;
        if (jfVar2 != null && jfVar2.getLineCount() > 2 && this.A0.getText() != null && !TextUtils.isEmpty(this.A0.getText().toString().trim())) {
            z10 = true;
        }
        v1(z10);
    }

    public final void F(boolean z10) {
        MessageObject messageObject;
        boolean z11 = this.L2 < 0 && this.S3 && this.U1 == null && (jf.w.g(this.M).e(getEditText() != null ? getEditText().toString() : null, this.S4) > 0 || ((messageObject = this.O2) != null && messageObject.isEphemeral()));
        vd.a aVar = this.d5;
        boolean z12 = aVar.f != z11;
        aVar.a(z11, z10);
        re reVar = this.F0;
        if (reVar != null) {
            reVar.v = z11;
            reVar.invalidate();
        }
        if (z12) {
            J(z10);
        }
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
        org.telegram.ui.tn tnVar;
        TLRPC.User user;
        int measuredHeight;
        float f9;
        jf jfVar;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        ArrayList<MessageObject> arrayList;
        long j10;
        re reVar;
        org.telegram.ui.xk xkVar;
        boolean z10;
        MessagePreviewParams messagePreviewParams2;
        int i10;
        j70 F;
        boolean z11;
        boolean z12;
        jf jfVar2;
        int i11 = 0;
        if (c() || (((tnVar = this.K2) != null && tnVar.N3 == 5) || this.d5.f)) {
            return false;
        }
        boolean z13 = this.v4;
        int i12 = 3;
        re reVar2 = this.F0;
        org.telegram.ui.ActionBar.c6 c6Var = this.R3;
        int i13 = 2;
        boolean z14 = true;
        if (z13 || !(((jfVar = this.A0) != null && !TextUtils.isEmpty(jfVar.getText())) || tnVar == null || (messagePreviewParams = tnVar.b5) == null || (messages = messagePreviewParams.forwardMessages) == null || (arrayList = messages.messages) == null || arrayList.isEmpty())) {
            boolean z15 = tnVar != null && UserObject.isUserSelf(tnVar.i());
            if (this.K0 == null) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(this.J2, c6Var);
                this.K0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                this.K0.setOnTouchListener(new df(this));
                this.K0.setDispatchKeyEventListener(new td(this));
                this.K0.setShownFromBottom(false);
                boolean z16 = tnVar != null && tnVar.D6();
                boolean z17 = !z15 && (this.C0 <= 0 || c());
                if (z16) {
                    boolean z18 = !z17;
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, getContext(), this.R3, true, z18);
                    this.B4 = g1Var;
                    if (z15) {
                        f9 = 196.0f;
                        g1Var.g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                    } else {
                        f9 = 196.0f;
                        g1Var.g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                    }
                    this.B4.setMinimumWidth(AndroidUtilities.dp(f9));
                    this.B4.setOnClickListener(new nd(this, 11));
                    this.K0.a(this.B4, i7.f6.n(-1, 44));
                    SharedConfig.removeScheduledHint();
                    if (!z15 && this.L2 > 0) {
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, getContext(), this.R3, true, z18);
                        this.c = g1Var2;
                        g1Var2.g(LocaleController.getString(R.string.SendWhenOnline), R.drawable.msg_online, null);
                        this.c.setMinimumWidth(AndroidUtilities.dp(f9));
                        this.c.setOnClickListener(new nd(this, 12));
                        this.K0.a(this.c, i7.f6.n(-1, 44));
                    }
                } else {
                    f9 = 196.0f;
                }
                if (z17) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, getContext(), this.R3, !z16, true);
                    user = null;
                    g1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                    g1Var3.setMinimumWidth(AndroidUtilities.dp(f9));
                    g1Var3.setOnClickListener(new nd(this, 13));
                    this.K0.a(g1Var3, i7.f6.n(-1, 44));
                } else {
                    user = null;
                }
                this.K0.setupRadialSelectors(i0(org.telegram.ui.ActionBar.g6.I5));
                ef efVar = new ef(this, this.K0);
                this.J0 = efVar;
                efVar.b = false;
                efVar.setAnimationStyle(R.style.PopupContextAnimation2);
                this.J0.setOutsideTouchable(true);
                this.J0.setClippingEnabled(true);
                this.J0.setInputMethodMode(2);
                this.J0.setSoftInputMode(0);
                this.J0.getContentView().setFocusableInTouchMode(true);
                SharedConfig.removeScheduledOrNoSoundHint();
                hg hgVar = this.U2;
                if (hgVar != null) {
                    hgVar.o2();
                }
            } else {
                user = null;
            }
            org.telegram.ui.ActionBar.g1 g1Var4 = this.B4;
            if (g1Var4 != null) {
                g1Var4.setVisibility(this.K ? 8 : 0);
            }
            if (this.c != null) {
                TLRPC.User i14 = tnVar == null ? user : tnVar.i();
                if (i14 != null && !i14.bot) {
                    TLRPC.UserStatus userStatus = i14.status;
                    if (!(userStatus instanceof TLRPC.TL_userStatusEmpty) && !(userStatus instanceof TLRPC.TL_userStatusOnline) && !(userStatus instanceof TLRPC.TL_userStatusRecently) && !(userStatus instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus instanceof TLRPC.TL_userStatusLastWeek)) {
                        this.c.setVisibility(0);
                    }
                }
                this.c.setVisibility(8);
            }
            this.K0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            this.J0.setFocusable(true);
            int[] iArr = this.I2;
            view.getLocationInWindow(iArr);
            if (this.u2) {
                int measuredHeight2 = getMeasuredHeight();
                View view2 = this.B1;
                if (measuredHeight2 > AndroidUtilities.dp((view2 == null || view2.getVisibility() != 0) ? 58.0f : 102.0f)) {
                    measuredHeight = view.getMeasuredHeight() + iArr[1];
                    this.J0.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.K0.getMeasuredWidth()), measuredHeight);
                    this.J0.b();
                    reVar2.invalidate();
                    view.performHapticFeedback(3, 2);
                    return true;
                }
            }
            measuredHeight = (iArr[1] - this.K0.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            this.J0.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.K0.getMeasuredWidth()), measuredHeight);
            this.J0.b();
            reVar2.invalidate();
            view.performHapticFeedback(3, 2);
            return true;
        }
        ff ffVar = this.H0;
        if (ffVar != null) {
            ffVar.h(false);
        }
        AndroidUtilities.cancelRunOnUIThread(this.A4);
        ff ffVar2 = new ff(this, getContext(), c6Var, i11);
        this.H0 = ffVar2;
        ffVar2.setOnDismissListener(new d1(this, i12));
        boolean z19 = (this.Y2 == null && ((jfVar2 = this.A0) == null || TextUtils.isEmpty(jfVar2.getText()))) ? false : true;
        ArrayList arrayList2 = new ArrayList();
        if (this.z1 != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.out = true;
            j10 = 0;
            tL_message.peer_id = MessagesController.getInstance(this.M).getPeer(this.L2);
            tL_message.from_id = MessagesController.getInstance(this.M).getPeer(UserConfig.getInstance(this.M).getClientUserId());
            tL_message.rich_message = this.z1;
            MessageObject messageObject = new MessageObject(this.M, tL_message, false, true);
            MessageObject messageObject2 = this.O2;
            if (messageObject2 != null && !messageObject2.isTopicMainMessage) {
                messageObject.replyMessageObject = messageObject2;
            }
            messageObject.isOutOwnerCached = Boolean.TRUE;
            messageObject.generateLayout(null);
            messageObject.notime = true;
            messageObject.sendPreview = true;
            arrayList2.add(messageObject);
            reVar = reVar2;
        } else {
            j10 = 0;
            if (this.W2 != null) {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.id = 0;
                tL_message2.out = true;
                reVar = reVar2;
                tL_message2.peer_id = MessagesController.getInstance(this.M).getPeer(this.L2);
                tL_message2.from_id = MessagesController.getInstance(this.M).getPeer(UserConfig.getInstance(this.M).getClientUserId());
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message2.media = tL_messageMediaDocument;
                tL_messageMediaDocument.voice = true;
                tL_messageMediaDocument.document = this.W2;
                tL_message2.send_state = 1;
                tL_message2.attachPath = this.X2;
                MessageObject messageObject3 = new MessageObject(this.M, tL_message2, false, true);
                MessageObject messageObject4 = this.O2;
                if (messageObject4 != null && !messageObject4.isTopicMainMessage) {
                    messageObject3.replyMessageObject = messageObject4;
                }
                messageObject3.isOutOwnerCached = Boolean.TRUE;
                messageObject3.generateLayout(null);
                messageObject3.notime = true;
                messageObject3.sendPreview = true;
                arrayList2.add(messageObject3);
            } else {
                reVar = reVar2;
                if (z19) {
                    TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                    tL_message3.id = 0;
                    tL_message3.out = true;
                    tL_message3.peer_id = MessagesController.getInstance(this.M).getPeer(this.L2);
                    tL_message3.from_id = MessagesController.getInstance(this.M).getPeer(UserConfig.getInstance(this.M).getClientUserId());
                    jf jfVar3 = this.A0;
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(jfVar3 == null ? "" : jfVar3.getTextToUse())};
                    MessageObject.addLinks(true, charSequenceArr[0]);
                    tL_message3.entities.addAll(MediaDataController.getInstance(this.M).getEntities(charSequenceArr, true));
                    tL_message3.message = charSequenceArr[0].toString();
                    MessageObject messageObject5 = this.O2;
                    if (messageObject5 != null && !messageObject5.isTopicMainMessage) {
                        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                        MessageObject messageObject6 = this.P2;
                        if (messageObject6 != null) {
                            tL_messageReplyHeader.flags |= 2;
                            tL_messageReplyHeader.reply_to_top_id = messageObject6.getId();
                        }
                        tL_messageReplyHeader.flags |= 16;
                        tL_messageReplyHeader.reply_to_msg_id = this.O2.getId();
                        tL_message3.reply_to = tL_messageReplyHeader;
                    }
                    if (this.S2 != null) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                        tL_messageMediaWebPage.webpage = this.S2;
                        if (tnVar != null && (messagePreviewParams2 = tnVar.b5) != null && messagePreviewParams2.hasMedia) {
                            boolean z20 = messagePreviewParams2.webpageSmall;
                            tL_messageMediaWebPage.force_small_media = z20;
                            tL_messageMediaWebPage.force_large_media = !z20;
                            tL_message3.invert_media = messagePreviewParams2.webpageTop;
                        }
                        tL_message3.media = tL_messageMediaWebPage;
                    }
                    MessageObject messageObject7 = new MessageObject(this.M, tL_message3, false, false);
                    MessageObject messageObject8 = this.O2;
                    if (messageObject8 != null && !messageObject8.isTopicMainMessage) {
                        messageObject7.replyMessageObject = messageObject8;
                    }
                    messageObject7.sendPreview = true;
                    messageObject7.isOutOwnerCached = Boolean.TRUE;
                    messageObject7.type = 0;
                    messageObject7.generateLayout(null);
                    messageObject7.notime = true;
                    arrayList2.add(messageObject7);
                } else if (tnVar != null && (xkVar = tnVar.X2) != null && xkVar.getTextureView() != null) {
                    ff ffVar3 = this.H0;
                    TextureView textureView = tnVar.X2.getTextureView();
                    ffVar3.getClass();
                    if (textureView != null) {
                        ffVar3.h0 = new RectF();
                        int[] iArr2 = new int[2];
                        textureView.getLocationOnScreen(iArr2);
                        ffVar3.h0.set(iArr2[0], iArr2[1], textureView.getWidth() + r9, textureView.getHeight() + iArr2[1]);
                    }
                    z10 = true;
                    this.H0.q(arrayList2);
                    i10 = 4;
                    if (z19 && this.W2 == null) {
                        ff ffVar4 = this.H0;
                        jf jfVar4 = this.A0;
                        d dVar = new d(this, i10);
                        vd vdVar = new vd(this, i13);
                        ffVar4.O = jfVar4;
                        ffVar4.Q = dVar;
                        ffVar4.R = vdVar;
                    }
                    this.H0.r(reVar, true, new lh.z1(i10, this, z19));
                    if ((!z19 || z10) && this.L2 >= j10) {
                        this.H0.d(tnVar);
                        this.H0.o(this.N4);
                    }
                    F = j70.F(this, c6Var, reVar);
                    z11 = tnVar == null && UserObject.isUserSelf(tnVar.i());
                    z12 = tnVar == null && tnVar.D6();
                    if (!z11 || (this.C0 > 0 && !c())) {
                        z14 = false;
                    }
                    if (z12) {
                        F.c(R.drawable.msg_calendar2, LocaleController.getString(z11 ? R.string.SetReminder : R.string.ScheduleMessage), new ld(this, 18), false);
                        if (!z11 && this.L2 > j10) {
                            F.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new ld(this, 19), false);
                            this.c = F.y();
                        }
                    }
                    if (tnVar != null && this.U2 != null && ChatObject.isMonoForum(tnVar.e)) {
                        F.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new ld(this, 17), false);
                    }
                    if (z14) {
                        F.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new sd(this, z19, i13), false);
                    }
                    F.Y();
                    if (this.c != null) {
                        TLRPC.User i15 = tnVar == null ? null : tnVar.i();
                        if (i15 != null && !i15.bot) {
                            TLRPC.UserStatus userStatus2 = i15.status;
                            if (!(userStatus2 instanceof TLRPC.TL_userStatusEmpty) && !(userStatus2 instanceof TLRPC.TL_userStatusOnline) && !(userStatus2 instanceof TLRPC.TL_userStatusRecently) && !(userStatus2 instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus2 instanceof TLRPC.TL_userStatusLastWeek)) {
                                this.c.setVisibility(0);
                            }
                        }
                        this.c.setVisibility(8);
                    }
                    this.H0.p(F);
                    this.H0.show();
                    view.performHapticFeedback(3, 2);
                    return false;
                }
            }
        }
        z10 = false;
        this.H0.q(arrayList2);
        i10 = 4;
        if (z19) {
            ff ffVar42 = this.H0;
            jf jfVar42 = this.A0;
            d dVar2 = new d(this, i10);
            vd vdVar2 = new vd(this, i13);
            ffVar42.O = jfVar42;
            ffVar42.Q = dVar2;
            ffVar42.R = vdVar2;
        }
        this.H0.r(reVar, true, new lh.z1(i10, this, z19));
        if (!z19) {
        }
        this.H0.d(tnVar);
        this.H0.o(this.N4);
        F = j70.F(this, c6Var, reVar);
        if (tnVar == null) {
        }
        if (tnVar == null) {
        }
        if (!z11) {
        }
        z14 = false;
        if (z12) {
        }
        if (tnVar != null) {
            F.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new ld(this, 17), false);
        }
        if (z14) {
        }
        F.Y();
        if (this.c != null) {
        }
        this.H0.p(F);
        this.H0.show();
        view.performHapticFeedback(3, 2);
        return false;
    }

    public final void F1() {
        float f9 = this.r * this.h;
        ge geVar = this.M0;
        geVar.setScaleX(f9);
        geVar.setScaleY(this.r * this.h);
        geVar.setAlpha(this.s * this.n);
    }

    @Override // org.telegram.ui.Components.gv0
    public final void G(int i10, boolean z10) {
        MessageObject messageObject;
        jf jfVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z11;
        int i11;
        int i12;
        ah.f fVar;
        if (this.M1 != 0) {
            this.G2 = i10;
            this.H2 = z10;
            this.u2 = i10 > 0;
            D();
            return;
        }
        if (i10 > AndroidUtilities.dp(50.0f) && this.u2 && !AndroidUtilities.isInMultiwindow) {
            if (z10) {
                this.t2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.t2).commit();
            } else {
                this.s2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.s2).commit();
            }
        }
        if (this.u2 && this.S0 && this.Q0 == null) {
            this.S0 = false;
        }
        boolean t02 = t0();
        hv0 hv0Var = this.h1;
        org.telegram.ui.tn tnVar = this.K2;
        if (t02) {
            int i13 = z10 ? this.t2 : this.s2;
            if (tnVar != null && tnVar.getParentLayout() != null) {
                i13 -= ((ActionBarLayout) tnVar.getParentLayout()).v(false);
            }
            if (this.a2 == 1) {
                uf ufVar = this.C1;
                if (!ufVar.f) {
                    i13 = Math.min(ufVar.getKeyboardHeight(), i13);
                }
            }
            int i14 = this.a2;
            ViewGroup viewGroup = i14 == 0 ? this.Q0 : i14 == 1 ? this.C1 : null;
            uf ufVar2 = this.C1;
            if (ufVar2 != null) {
                ufVar2.setPanelHeight(i13);
                ah.f fVar2 = this.Y4;
                if (fVar2 != null && i13 > 0 && this.a2 == 1) {
                    ((ah.i) fVar2).g(i13);
                }
            }
            if (viewGroup != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                if (!this.v3 && !this.u3 && (((i11 = layoutParams.width) != (i12 = AndroidUtilities.displaySize.x) || layoutParams.height != i13) && ((fVar = this.Y4) == null || i11 != -1 || layoutParams.height != -1))) {
                    if (fVar == null) {
                        layoutParams.width = i12;
                        layoutParams.height = i13;
                        viewGroup.setLayoutParams(layoutParams);
                    }
                    if (hv0Var != null) {
                        int i15 = this.v2;
                        this.v2 = layoutParams.height;
                        hv0Var.requestLayout();
                        G0();
                        if (this.d2 && !this.u2 && i15 != this.v2 && N0()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.R0 = animatorSet;
                            if (this.Y4 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.v2 - i15, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, this.v2 - i15, 0.0f));
                            }
                            this.R0.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                            this.R0.setDuration(250L);
                            this.R0.addListener(new se(this, 10));
                            AndroidUtilities.runOnUIThread(this.T3, 50L);
                            this.G3.lock();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.G2 == i10 && this.H2 == z10) {
            G0();
            return;
        }
        this.G2 = i10;
        this.H2 = z10;
        boolean z12 = this.u2;
        this.u2 = i10 > 0;
        D();
        if (this.u2 && t0() && this.w3 == null) {
            t1(0, this.a2, true, true);
        } else if (!this.u2 && !t0() && (messageObject = this.h2) != null && this.O2 != messageObject && !j0() && !v() && !org.telegram.ui.ActionBar.o2.hasSheets(tnVar) && (((jfVar = this.A0) == null || TextUtils.isEmpty(jfVar.getText())) && (tL_replyKeyboardMarkup = this.i2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.q1 q1Var = hv0Var.D;
            if (q1Var.f) {
                q1Var.j();
            } else {
                q1Var.v = true;
            }
            t1(1, 1, false, true);
        }
        if (this.v2 != 0 && !(z11 = this.u2) && z11 != z12 && !t0()) {
            this.v2 = 0;
            hv0Var.requestLayout();
        }
        if (this.u2 && this.f3) {
            this.f3 = false;
            if (this.k3) {
                this.k3 = false;
                this.C1.setButtons(this.i2);
            }
            AndroidUtilities.cancelRunOnUIThread(this.m3);
        }
        G0();
    }

    public final void G0() {
        int height = this.h1.getHeight();
        if (!this.u2) {
            height -= this.v2;
        }
        hg hgVar = this.U2;
        if (hgVar != null) {
            hgVar.f2(height);
        }
        if (this.B1 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
            vd.a aVar = this.b5;
            if (height < currentActionBarHeight) {
                if (this.c3) {
                    this.c3 = false;
                    if (this.b3) {
                        aVar.a(false, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.c3) {
                return;
            }
            this.c3 = true;
            if (this.b3) {
                aVar.a(true, false);
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
        jf jfVar = this.A0;
        if (jfVar == null) {
            return;
        }
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            jfVar.setHintText(charSequence, z10);
            this.A0.setHintText2(this.f, z10);
            return;
        }
        boolean z12 = false;
        if (!this.v0 && !r0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d " + LocaleController.getString("PlainTextRestrictedHint", R.string.PlainTextRestrictedHint));
            spannableStringBuilder.setSpan(new iq(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
            this.A0.setHintText(spannableStringBuilder, z10);
            this.A0.setText((CharSequence) null);
            this.A0.setEnabled(false);
            this.A0.setInputType(1);
            return;
        }
        this.A0.setEnabled(true);
        int inputType = this.A0.getInputType();
        int i10 = this.a;
        if (inputType != i10) {
            this.A0.setInputType(i10);
        }
        R1();
        org.telegram.ui.tn tnVar = this.K2;
        boolean z13 = tnVar != null && tnVar.N3 == 8 && tnVar.P3;
        long sendPaidMessagesStars = tnVar != null ? tnVar.getMessagesController().getSendPaidMessagesStars(tnVar.a()) : 0L;
        if (sendPaidMessagesStars > 0) {
            sendPaidMessagesStars *= getMessagesCount();
        }
        int i11 = tnVar != null ? tnVar.N3 : -1;
        if (i11 == 9) {
            this.A0.setHintText(LocaleController.getString(R.string.WelcomeMessageEnter));
            return;
        }
        if (i11 == 5) {
            if ("hello".equalsIgnoreCase(tnVar.M3)) {
                this.A0.setHintText(LocaleController.getString(R.string.BusinessGreetingEnter));
                return;
            } else if ("away".equalsIgnoreCase(tnVar.M3)) {
                this.A0.setHintText(LocaleController.getString(R.string.BusinessAwayEnter));
                return;
            } else {
                this.A0.setHintText(LocaleController.getString(R.string.BusinessRepliesEnter));
                return;
            }
        }
        iq[] iqVarArr = this.J4;
        if (z13) {
            this.A0.setHintText(sendPaidMessagesStars > 0 ? jh.ia.Q0(LocaleController.formatString(R.string.SuggestPostForStars, LocaleController.formatNumber((int) sendPaidMessagesStars, ','), iqVarArr)) : LocaleController.formatString(R.string.SuggestPostForFree, new Object[0]));
            iq iqVar = iqVarArr[0];
            if (iqVar != null) {
                iqVar.spaceScaleX = 0.9f;
                return;
            }
            return;
        }
        if (this.W1 != null) {
            this.A0.setHintText(LocaleController.getString(R.string.BusinessLinksEnter));
            return;
        }
        MessageObject messageObject2 = this.O2;
        if (messageObject2 != null && (replyMarkup2 = messageObject2.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
            this.A0.setHintText(this.O2.messageOwner.reply_markup.placeholder, z10);
            return;
        }
        if (this.U1 != null) {
            this.A0.setHintText(LocaleController.getString(this.V1 ? R.string.Caption : R.string.TypeMessage));
            return;
        }
        if (sendPaidMessagesStars > 0) {
            this.A0.setHintText(jh.ia.V0(false, LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber((int) sendPaidMessagesStars, ',')), iqVarArr));
            iq iqVar2 = iqVarArr[0];
            if (iqVar2 != null) {
                iqVar2.spaceScaleX = 0.9f;
                return;
            }
            return;
        }
        if (this.T0 && (messageObject = this.h2) != null && (replyMarkup = messageObject.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
            this.A0.setHintText(this.h2.messageOwner.reply_markup.placeholder, z10);
            return;
        }
        if (tnVar != null && tnVar.v9()) {
            MessageObject messageObject3 = this.P2;
            if (messageObject3 != null && (tL_forumTopic = messageObject3.replyToForumTopic) != null && (str2 = tL_forumTopic.title) != null) {
                this.A0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str2), z10);
                return;
            }
            TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.M).getTopicsController().findTopic(tnVar.e.id, 1L);
            if (findTopic == null || (str = findTopic.title) == null) {
                this.A0.setHintText(LocaleController.getString(R.string.TypeMessage), z10);
                return;
            } else {
                this.A0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str), z10);
                return;
            }
        }
        if (DialogObject.isChatDialog(this.L2)) {
            TLRPC.Chat chat = this.N.getMessagesController().getChat(Long.valueOf(-this.L2));
            TLRPC.ChatFull chatFull = this.N.getMessagesController().getChatFull(-this.L2);
            z11 = ChatObject.isChannelAndNotMegaGroup(chat);
            z12 = !z11 && ChatObject.getSendAsPeerId(chat, chatFull) == (-this.L2);
        } else {
            z11 = false;
        }
        if (z12) {
            this.A0.setHintText(LocaleController.getString("SendAnonymously", R.string.SendAnonymously));
            return;
        }
        TLRPC.User user = this.N.getMessagesController().getUser(Long.valueOf(this.L2));
        if (user != null && user.bot_forum_view && !user.bot_forum_can_manage_topics && tnVar != null && !tnVar.d4) {
            this.A0.setHintText(LocaleController.getString(R.string.SendBotNoThread));
            return;
        }
        if (tnVar != null && tnVar.F9() && !tnVar.d4) {
            if (tnVar.T3 == null || !tnVar.c4) {
                this.A0.setHintText(LocaleController.getString("Reply", R.string.Reply));
                return;
            } else {
                this.A0.setHintText(LocaleController.getString(R.string.Comment));
                return;
            }
        }
        if (!z11) {
            this.A0.setHintText(LocaleController.getString(R.string.TypeMessage));
        } else if (this.b2) {
            this.A0.setHintText(LocaleController.getString("ChannelSilentBroadcast", R.string.ChannelSilentBroadcast), z10);
        } else {
            this.A0.setHintText(LocaleController.getString("ChannelBroadcast", R.string.ChannelBroadcast), z10);
        }
    }

    public void H0() {
        if ((j0() && v()) || org.telegram.ui.ActionBar.o2.hasSheets(this.K2)) {
            return;
        }
        hg hgVar = this.U2;
        if (hgVar != null) {
            hgVar.r1();
        }
        jf jfVar = this.A0;
        if (jfVar == null || AndroidUtilities.showKeyboard(jfVar)) {
            return;
        }
        this.A0.clearFocus();
        this.A0.requestFocus();
    }

    public final void H1(int i10) {
        ImageView imageView;
        te teVar;
        te teVar2;
        je jeVar;
        this.K4 = i10;
        if (this.A0 != null) {
            MessageObject messageObject = this.U1;
            if (messageObject == null || messageObject.needResendWhenEdit()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A0.getLayoutParams();
                int i11 = layoutParams.rightMargin;
                boolean z10 = this.v4;
                re reVar = this.F0;
                if (z10 && this.g5) {
                    layoutParams.rightMargin = Math.max(0, reVar.l() - AndroidUtilities.dp(44.0f)) + AndroidUtilities.dp(this.q4 ? 50.0f : 2.0f);
                } else if (i10 == 1 || i10 == 2) {
                    ve veVar = this.s1;
                    if (veVar == null || veVar.getVisibility() != 0 || (teVar2 = this.E1) == null || teVar2.getVisibility() != 0 || (jeVar = this.m1) == null || jeVar.getVisibility() != 0) {
                        ve veVar2 = this.s1;
                        if ((veVar2 == null || veVar2.getVisibility() != 0) && (((imageView = this.D1) == null || imageView.getVisibility() != 0) && ((teVar = this.E1) == null || teVar.getTag() == null))) {
                            layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                        } else {
                            layoutParams.rightMargin = AndroidUtilities.dp(98.0f);
                        }
                    } else {
                        layoutParams.rightMargin = AndroidUtilities.dp(146.0f);
                    }
                } else {
                    te teVar3 = this.E1;
                    if (teVar3 == null || teVar3.getTag() == null) {
                        layoutParams.rightMargin = AndroidUtilities.dp(2.0f);
                    } else {
                        layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                    }
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, reVar.l() - AndroidUtilities.dp(44.0f)));
                re reVar2 = this.A1;
                if (reVar2 != null && reVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.A1.l() - AndroidUtilities.dp(44.0f)));
                }
                if (i11 != layoutParams.rightMargin) {
                    this.A0.setLayoutParams(layoutParams);
                }
                de deVar = this.a1;
                if (deVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) deVar.getLayoutParams();
                    layoutParams2.rightMargin = this.U1 == null ? j7.l1.d(44.0f, reVar.l(), 0) : 0;
                    this.a1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final void I() {
        boolean z10;
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.Z1) {
            return;
        }
        if (this.k1 == null) {
            this.Z1 = false;
            k1(false, false);
            return;
        }
        boolean z12 = true;
        this.Z1 = true;
        this.t0 = true;
        this.u0 = true;
        if (DialogObject.isChatDialog(this.L2)) {
            TLRPC.Chat chat = this.N.getMessagesController().getChat(Long.valueOf(-this.L2));
            z10 = ChatObject.isChannel(chat) && !chat.megagroup;
            if (z10 && !chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.Z1 = false;
            }
            this.t0 = ChatObject.canSendRoundVideo(chat);
            this.u0 = ChatObject.canSendVoice(chat);
        } else {
            z10 = false;
        }
        if (!SharedConfig.inappCamera) {
            this.Z1 = false;
        }
        if (this.Z1) {
            if (SharedConfig.hasCameraCache) {
                CameraController.getInstance().initCamera(null);
            }
            z11 = MessagesController.getGlobalMainSettings().getBoolean(z10 ? "currentModeVideoChannel" : "currentModeVideo", z10);
        } else {
            z11 = false;
        }
        if (!this.t0 && z11) {
            z11 = false;
        }
        if (this.u0 || z11) {
            z12 = z11;
        } else if (!this.Z1) {
            z12 = false;
        }
        k1(z12, false);
    }

    public final void I0() {
        if (j0() && v()) {
            return;
        }
        org.telegram.ui.tn tnVar = this.K2;
        if (org.telegram.ui.ActionBar.o2.hasSheets(tnVar)) {
            return;
        }
        t1((AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || (tnVar != null && tnVar.isInBubbleMode()) || this.e2) ? 0 : 2, 0, true, true);
        hg hgVar = this.U2;
        if (hgVar != null) {
            hgVar.r1();
        }
        jf jfVar = this.A0;
        if (jfVar != null) {
            jfVar.requestFocus();
        }
        AndroidUtilities.showKeyboard(this.A0);
        if (this.e2) {
            this.g2 = true;
            return;
        }
        if (AndroidUtilities.usingHardwareInput || this.u2 || AndroidUtilities.isInMultiwindow) {
            return;
        }
        if (tnVar == null || !tnVar.isInBubbleMode()) {
            this.f3 = true;
            xf xfVar = this.Q0;
            if (xfVar != null) {
                xfVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
            }
            ue ueVar = this.m3;
            AndroidUtilities.cancelRunOnUIThread(ueVar);
            AndroidUtilities.runOnUIThread(ueVar, 100L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r14.M).getMainSettings().getBoolean("show_gift_for_" + r5.a(), true) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d6, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r14.M).getMainSettings().getBoolean(java.util.Calendar.getInstance().get(1) + "show_gift_for_" + r5.a(), true) == false) goto L39;
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
        nh.t3 t3Var;
        TLRPC.UserFull userFull = getParentFragment() == null ? null : getParentFragment().W7;
        TLRPC.UserFull userFull2 = MessagesController.getInstance(this.M).getUserFull(UserConfig.getInstance(this.M).getClientUserId());
        TLRPC.User i10 = getParentFragment() != null ? getParentFragment().i() : null;
        boolean premiumPurchaseBlocked = MessagesController.getInstance(this.M).premiumPurchaseBlocked();
        org.telegram.ui.tn tnVar = this.K2;
        if (!premiumPurchaseBlocked && getParentFragment() != null && i10 != null && !BuildVars.IS_BILLING_UNAVAILABLE && ((!UserObject.isUserSelf(i10) || (userFull2 != null && userFull2.display_gifts_button)) && !UserObject.isBot(i10) && !MessagesController.isSupportUser(i10) && userFull != null)) {
            if (!i10.premium && MessagesController.getInstance(this.M).giftAttachMenuIcon && MessagesController.getInstance(this.M).giftTextFieldIcon) {
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
            if (tnVar != null && tnVar.N3 == 0) {
                z11 = true;
                if (!z11 && (t3Var = this.H) != null) {
                    t3Var.e(true);
                }
                if (z11 && this.F1 == null) {
                    return;
                }
                if (this.F1 == null && tnVar != null) {
                    ve veVar = new ve(this, getContext(), 0);
                    this.F1 = veVar;
                    veVar.setImageResource(R.drawable.msg_input_gift);
                    this.F1.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.g6.Wk), PorterDuff.Mode.MULTIPLY));
                    this.F1.setVisibility(8);
                    this.F1.setContentDescription(LocaleController.getString(R.string.GiftPremium));
                    this.F1.setScaleType(ImageView.ScaleType.CENTER);
                    this.F1.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(org.telegram.ui.ActionBar.g6.i6), 1, -1));
                    this.k1.addView(this.F1, 0, i7.f6.e(44, 44, 21));
                    this.F1.setOnClickListener(new nd(this, 9));
                }
                AndroidUtilities.updateViewVisibilityAnimated(this.F1, z11, 1.0f, true, 1.0f, z10, new jd(this, 0));
                if (z11) {
                    return;
                }
                C();
                return;
            }
        }
        z11 = false;
        if (!z11) {
            t3Var.e(true);
        }
        if (z11) {
        }
        if (this.F1 == null) {
            ve veVar2 = new ve(this, getContext(), 0);
            this.F1 = veVar2;
            veVar2.setImageResource(R.drawable.msg_input_gift);
            this.F1.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.g6.Wk), PorterDuff.Mode.MULTIPLY));
            this.F1.setVisibility(8);
            this.F1.setContentDescription(LocaleController.getString(R.string.GiftPremium));
            this.F1.setScaleType(ImageView.ScaleType.CENTER);
            this.F1.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(org.telegram.ui.ActionBar.g6.i6), 1, -1));
            this.k1.addView(this.F1, 0, i7.f6.e(44, 44, 21));
            this.F1.setOnClickListener(new nd(this, 9));
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.F1, z11, 1.0f, true, 1.0f, z10, new jd(this, 0));
        if (z11) {
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
    public final void J(boolean z10) {
        re reVar;
        ImageView imageView;
        String str;
        oe oeVar;
        int i10;
        AnimatorSet animatorSet;
        ?? r14;
        ImageView imageView2;
        boolean z11;
        ve veVar;
        ve veVar2;
        AnimatorSet animatorSet2;
        int i11;
        float f9;
        ve veVar3;
        AnimatorSet animatorSet3;
        ImageView imageView3;
        int i12;
        boolean z12;
        ?? r52;
        ?? r142;
        if (this.U1 != null || this.A2) {
            return;
        }
        boolean z13 = this.e2 ? false : z10;
        R1();
        jf jfVar = this.A0;
        CharSequence trimmedString = jfVar == null ? "" : AndroidUtilities.getTrimmedString(jfVar.getTextToUse());
        int i13 = this.C0;
        re reVar2 = this.F0;
        vd.a aVar = this.d5;
        ce ceVar = this.V3;
        oe oeVar2 = this.V0;
        Property property = View.SCALE_X;
        Property property2 = View.SCALE_Y;
        Property property3 = View.ALPHA;
        bg.y3 y3Var = this.k1;
        pe peVar = this.X0;
        pg pgVar = this.B0;
        je jeVar = this.m1;
        boolean z14 = z13;
        ImageView imageView4 = this.L0;
        CharSequence charSequence = trimmedString;
        if (i13 <= 0 || i13 == Integer.MAX_VALUE || c() || aVar.f) {
            int length = charSequence.length();
            vd.a aVar2 = this.c5;
            if (length > 0 || this.C2 || this.y1 || this.W2 != null || this.Z2 != null) {
                reVar = reVar2;
            } else {
                reVar = reVar2;
                if ((this.C0 != Integer.MAX_VALUE || c() || aVar.f) && ((!this.g5 || getStarsPrice() <= 0) && !aVar2.f)) {
                    if (this.Q0 == null || !this.S0 || (!(this.s3 || (this.t3 && this.M1 == 2)) || AndroidUtilities.isInMultiwindow || this.g5)) {
                        if (getSendButtonInternal().getVisibility() == 0 || imageView4.getVisibility() == 0 || (((veVar3 = this.O0) != null && veVar3.getVisibility() == 0) || pgVar.getVisibility() == 0)) {
                            if (!z14) {
                                pgVar.setScaleX(0.1f);
                                pgVar.setScaleY(0.1f);
                                pgVar.setAlpha(0.0f);
                                setSlowModeButtonVisible(false);
                                getSendButtonInternal().setScaleX(0.1f);
                                getSendButtonInternal().setScaleY(0.1f);
                                getSendButtonInternal().setAlpha(0.0f);
                                getSendButtonInternal().setVisibility(8);
                                imageView4.setScaleX(0.1f);
                                imageView4.setScaleY(0.1f);
                                imageView4.setAlpha(0.0f);
                                imageView4.setVisibility(8);
                                ve veVar4 = this.O0;
                                if (veVar4 != null) {
                                    veVar4.setScaleX(0.1f);
                                    this.O0.setScaleY(0.1f);
                                    this.O0.setAlpha(0.0f);
                                    this.O0.setVisibility(8);
                                }
                                peVar.setScaleX(1.0f);
                                peVar.setScaleY(1.0f);
                                peVar.setAlpha(1.0f);
                                oeVar2.setVisibility(0);
                                if (y3Var != null) {
                                    if (getVisibility() == 0) {
                                        this.U2.v2();
                                    }
                                    this.A = 1.0f;
                                    A1();
                                    y3Var.setScaleX(1.0f);
                                    y3Var.setVisibility(0);
                                    H1(1);
                                }
                                if (jeVar != null) {
                                    ViewPropertyAnimator viewPropertyAnimator = this.l1;
                                    if (viewPropertyAnimator != null) {
                                        viewPropertyAnimator.cancel();
                                        this.l1 = null;
                                    }
                                    this.q1 = 1.0f;
                                    jeVar.setAlpha(1.0f);
                                    jeVar.setScaleX(1.0f);
                                    jeVar.setScaleY(1.0f);
                                }
                                this.G1 = false;
                                hg hgVar = this.U2;
                                if (hgVar != null && hgVar.C0()) {
                                    a0();
                                }
                                if (this.E1 != null) {
                                    hg hgVar2 = this.U2;
                                    if (hgVar2 != null && hgVar2.C0()) {
                                        this.E1.setVisibility(0);
                                        this.E1.setTag(1);
                                    }
                                    this.E1.setAlpha(1.0f);
                                    this.E1.setScaleX(1.0f);
                                    this.E1.setScaleY(1.0f);
                                    this.E1.setTranslationX(0.0f);
                                }
                            } else {
                                if (this.q2 == 2) {
                                    return;
                                }
                                AnimatorSet animatorSet4 = this.m2;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                    animatorSet2 = null;
                                    this.m2 = null;
                                } else {
                                    animatorSet2 = null;
                                }
                                AnimatorSet animatorSet5 = this.n2;
                                if (animatorSet5 != null) {
                                    animatorSet5.cancel();
                                    this.n2 = animatorSet2;
                                }
                                if (y3Var != null) {
                                    if (y3Var.getVisibility() != 0) {
                                        y3Var.setVisibility(0);
                                        this.A = 0.0f;
                                        A1();
                                        y3Var.setScaleX(0.0f);
                                    }
                                    this.n2 = new AnimatorSet();
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(ObjectAnimator.ofFloat(y3Var, ceVar, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(y3Var, (Property<bg.y3, Float>) property, 1.0f));
                                    ug.g gVar = this.Z4;
                                    if (gVar != null) {
                                        gVar.e(0, false, true);
                                    }
                                    if (jeVar != null) {
                                        ViewPropertyAnimator viewPropertyAnimator2 = this.l1;
                                        if (viewPropertyAnimator2 != null) {
                                            viewPropertyAnimator2.cancel();
                                            this.l1 = null;
                                        }
                                        this.q1 = 1.0f;
                                        arrayList.add(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property3, 1.0f));
                                        arrayList.add(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property, 1.0f));
                                        arrayList.add(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property2, 1.0f));
                                    }
                                    hg hgVar3 = this.U2;
                                    boolean z15 = hgVar3 != null && hgVar3.C0();
                                    this.G1 = false;
                                    if (z15) {
                                        a0();
                                    }
                                    te teVar = this.E1;
                                    if (teVar != null) {
                                        if (z15) {
                                            teVar.setVisibility(0);
                                            this.E1.setTag(1);
                                            this.E1.setPivotX(AndroidUtilities.dp(44.0f));
                                            arrayList.add(ObjectAnimator.ofFloat(this.E1, (Property<te, Float>) property3, 1.0f));
                                            arrayList.add(ObjectAnimator.ofFloat(this.E1, (Property<te, Float>) property, 1.0f));
                                            arrayList.add(p(0.0f));
                                            ImageView imageView5 = this.D1;
                                            if (imageView5 != null && imageView5.getVisibility() == 0) {
                                                imageView5.setVisibility(8);
                                            }
                                        } else {
                                            teVar.setAlpha(1.0f);
                                            this.E1.setScaleX(1.0f);
                                            this.E1.setScaleY(1.0f);
                                            this.E1.setTranslationX(0.0f);
                                        }
                                    }
                                    this.n2.playTogether(arrayList);
                                    this.n2.setDuration(100L);
                                    this.n2.addListener(new se(this, 6));
                                    this.n2.start();
                                    H1(1);
                                    if (getVisibility() == 0) {
                                        this.U2.v2();
                                    }
                                }
                                oeVar2.setVisibility(0);
                                this.m2 = new AnimatorSet();
                                this.q2 = 2;
                                ArrayList arrayList2 = new ArrayList();
                                org.telegram.ui.tn tnVar = this.K2;
                                TLRPC.Chat g10 = tnVar == null ? null : tnVar.g();
                                TLRPC.UserFull w82 = tnVar == null ? this.G : tnVar.w8();
                                if (g10 != null) {
                                    if (!ChatObject.canSendVoice(g10)) {
                                    }
                                    f9 = 1.0f;
                                } else if (w82 == null) {
                                    i11 = 1;
                                    f9 = 1.0f;
                                    float[] fArr = new float[i11];
                                    fArr[0] = 1.0f;
                                    arrayList2.add(ObjectAnimator.ofFloat(peVar, (Property<pe, Float>) property, fArr));
                                    float[] fArr2 = new float[i11];
                                    fArr2[0] = 1.0f;
                                    arrayList2.add(ObjectAnimator.ofFloat(peVar, (Property<pe, Float>) property2, fArr2));
                                    float[] fArr3 = new float[i11];
                                    fArr3[0] = f9;
                                    arrayList2.add(ObjectAnimator.ofFloat(peVar, (Property<pe, Float>) property3, fArr3));
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
                                        ve veVar5 = this.O0;
                                        if (veVar5 != null && veVar5.getVisibility() == 0) {
                                            ve veVar6 = this.O0;
                                            float[] fArr7 = new float[i11];
                                            fArr7[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(veVar6, (Property<ve, Float>) property, fArr7));
                                            ve veVar7 = this.O0;
                                            float[] fArr8 = new float[i11];
                                            fArr8[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(veVar7, (Property<ve, Float>) property2, fArr8));
                                            ve veVar8 = this.O0;
                                            float[] fArr9 = new float[i11];
                                            fArr9[0] = 0.0f;
                                            arrayList2.add(ObjectAnimator.ofFloat(veVar8, (Property<ve, Float>) property3, fArr9));
                                        } else if (pgVar.getVisibility() == 0) {
                                            float[] fArr10 = new float[i11];
                                            fArr10[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(pgVar, (Property<pg, Float>) property, fArr10));
                                            float[] fArr11 = new float[i11];
                                            fArr11[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(pgVar, (Property<pg, Float>) property2, fArr11));
                                            float[] fArr12 = new float[i11];
                                            fArr12[0] = 0.0f;
                                            arrayList2.add(ObjectAnimator.ofFloat(pgVar, (Property<pg, Float>) property3, fArr12));
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
                                    this.m2.playTogether(arrayList2);
                                    this.m2.setDuration(150L);
                                    this.m2.addListener(new se(this, 7));
                                    this.m2.start();
                                }
                                i11 = 1;
                                float[] fArr16 = new float[i11];
                                fArr16[0] = 1.0f;
                                arrayList2.add(ObjectAnimator.ofFloat(peVar, (Property<pe, Float>) property, fArr16));
                                float[] fArr22 = new float[i11];
                                fArr22[0] = 1.0f;
                                arrayList2.add(ObjectAnimator.ofFloat(peVar, (Property<pe, Float>) property2, fArr22));
                                float[] fArr32 = new float[i11];
                                fArr32[0] = f9;
                                arrayList2.add(ObjectAnimator.ofFloat(peVar, (Property<pe, Float>) property3, fArr32));
                                if (imageView4.getVisibility() != 0) {
                                }
                                this.m2.playTogether(arrayList2);
                                this.m2.setDuration(150L);
                                this.m2.addListener(new se(this, 7));
                                this.m2.start();
                            }
                        }
                    } else if (!z14) {
                        pgVar.setScaleX(0.1f);
                        pgVar.setScaleY(0.1f);
                        pgVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        getSendButtonInternal().setVisibility(8);
                        imageView4.setScaleX(0.1f);
                        imageView4.setScaleY(0.1f);
                        imageView4.setAlpha(0.0f);
                        imageView4.setVisibility(8);
                        peVar.setScaleX(0.1f);
                        peVar.setScaleY(0.1f);
                        peVar.setAlpha(0.0f);
                        oeVar2.setVisibility(8);
                        V();
                        this.O0.setScaleX(1.0f);
                        this.O0.setScaleY(1.0f);
                        this.O0.setAlpha(1.0f);
                        this.O0.setVisibility(0);
                        if (y3Var != null) {
                            if (getVisibility() == 0) {
                                this.U2.v2();
                            }
                            y3Var.setVisibility(0);
                            H1(1);
                        }
                        this.G1 = false;
                        hg hgVar4 = this.U2;
                        boolean z16 = hgVar4 != null && hgVar4.C0();
                        if (z16) {
                            a0();
                        }
                        te teVar2 = this.E1;
                        if (teVar2 != null) {
                            if (z16) {
                                teVar2.setVisibility(0);
                                this.E1.setTag(1);
                            }
                            this.E1.setAlpha(1.0f);
                            this.E1.setScaleX(1.0f);
                            this.E1.setScaleY(1.0f);
                            this.E1.setTranslationX(0.0f);
                        }
                    } else {
                        if (this.q2 == 4) {
                            return;
                        }
                        AnimatorSet animatorSet6 = this.m2;
                        if (animatorSet6 != null) {
                            animatorSet6.cancel();
                            animatorSet3 = null;
                            this.m2 = null;
                        } else {
                            animatorSet3 = null;
                        }
                        AnimatorSet animatorSet7 = this.n2;
                        if (animatorSet7 != null) {
                            animatorSet7.cancel();
                            this.n2 = animatorSet3;
                        }
                        if (y3Var != null && this.r2 == 0) {
                            y3Var.setVisibility(0);
                            this.n2 = new AnimatorSet();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(ObjectAnimator.ofFloat(y3Var, ceVar, 1.0f));
                            arrayList3.add(ObjectAnimator.ofFloat(y3Var, (Property<bg.y3, Float>) property, 1.0f));
                            ug.g gVar2 = this.Z4;
                            if (gVar2 != null) {
                                gVar2.e(0, false, true);
                            }
                            if (jeVar != null) {
                                ViewPropertyAnimator viewPropertyAnimator3 = this.l1;
                                if (viewPropertyAnimator3 != null) {
                                    viewPropertyAnimator3.cancel();
                                    this.l1 = null;
                                }
                                this.q1 = 1.0f;
                                arrayList3.add(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property3, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property2, 1.0f));
                            }
                            hg hgVar5 = this.U2;
                            boolean z17 = hgVar5 != null && hgVar5.C0();
                            this.G1 = false;
                            if (z17) {
                                a0();
                            }
                            te teVar3 = this.E1;
                            if (teVar3 != null) {
                                teVar3.setScaleY(1.0f);
                                if (z17) {
                                    this.E1.setVisibility(0);
                                    this.E1.setTag(1);
                                    this.E1.setPivotX(AndroidUtilities.dp(44.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.E1, (Property<te, Float>) property3, 1.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.E1, (Property<te, Float>) property, 1.0f));
                                    arrayList3.add(p(0.0f));
                                } else {
                                    this.E1.setAlpha(1.0f);
                                    this.E1.setScaleX(1.0f);
                                    this.E1.setTranslationX(0.0f);
                                }
                            }
                            this.n2.playTogether(arrayList3);
                            this.n2.setDuration(100L);
                            this.n2.addListener(new se(this, 4));
                            this.n2.start();
                            H1(1);
                            if (getVisibility() == 0) {
                                this.U2.v2();
                            }
                        }
                        V();
                        this.O0.setVisibility(0);
                        this.m2 = new AnimatorSet();
                        this.q2 = 4;
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(ObjectAnimator.ofFloat(this.O0, (Property<ve, Float>) property, 1.0f));
                        arrayList4.add(ObjectAnimator.ofFloat(this.O0, (Property<ve, Float>) property2, 1.0f));
                        arrayList4.add(ObjectAnimator.ofFloat(this.O0, (Property<ve, Float>) property3, 1.0f));
                        if (imageView4.getVisibility() == 0) {
                            arrayList4.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property2, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property3, 0.0f));
                        } else if (oeVar2.getVisibility() == 0) {
                            arrayList4.add(ObjectAnimator.ofFloat(peVar, (Property<pe, Float>) property, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(peVar, (Property<pe, Float>) property2, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(peVar, (Property<pe, Float>) property3, 0.0f));
                        } else if (pgVar.getVisibility() == 0) {
                            arrayList4.add(ObjectAnimator.ofFloat(pgVar, (Property<pg, Float>) property, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(pgVar, (Property<pg, Float>) property2, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(pgVar, (Property<pg, Float>) property3, 0.0f));
                        } else {
                            arrayList4.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property2, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property3, 0.0f));
                        }
                        this.m2.playTogether(arrayList4);
                        this.m2.setDuration(250L);
                        this.m2.addListener(new se(this, 5));
                        this.m2.start();
                    }
                }
            }
            jf jfVar2 = this.A0;
            String caption = jfVar2 == null ? null : jfVar2.getCaption();
            boolean z18 = caption != null && (getSendButtonInternal().getVisibility() == 0 || ((veVar2 = this.O0) != null && veVar2.getVisibility() == 0));
            boolean z19 = caption == null && (imageView4.getVisibility() == 0 || ((veVar = this.O0) != null && veVar.getVisibility() == 0));
            int i02 = (this.C0 != Integer.MAX_VALUE || c() || aVar.f) ? i0(org.telegram.ui.ActionBar.g6.Yd) : i0(org.telegram.ui.ActionBar.g6.Wk);
            jf jfVar3 = this.A0;
            boolean z20 = (jfVar3 != null && (!TextUtils.isEmpty(jfVar3.getCaption()) || this.A0.isNearRightCaption(AndroidUtilities.dp(44.0f)))) || LocaleController.isRTL;
            if (i02 != this.G0) {
                this.G0 = i02;
                Drawable background = reVar.getBackground();
                int i14 = i02;
                int red = Color.red(i14);
                oeVar = oeVar2;
                int green = Color.green(i14);
                str = caption;
                int blue = Color.blue(i14);
                imageView = imageView4;
                org.telegram.ui.ActionBar.g6.B1(background, Color.argb(24, red, green, blue), true);
            } else {
                imageView = imageView4;
                str = caption;
                oeVar = oeVar2;
            }
            if (oeVar.getVisibility() != 0 && pgVar.getVisibility() != 0 && !z18 && !z19 && !aVar2.f) {
                ug.g gVar3 = this.Z4;
                if (gVar3 != null) {
                    gVar3.e(0, z20, true);
                    if (jeVar != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.l1;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.l1 = null;
                        }
                        ViewPropertyAnimator animate = jeVar.animate();
                        float f10 = z20 ? 0.0f : 1.0f;
                        this.q1 = f10;
                        ViewPropertyAnimator duration = animate.alpha(f10).scaleX(z20 ? 0.5f : 1.0f).scaleY(z20 ? 0.5f : 1.0f).setInterpolator(jr.h).setDuration(320L);
                        this.l1 = duration;
                        duration.start();
                    }
                }
            } else {
                if (!z14) {
                    String str2 = str;
                    ImageView imageView6 = imageView;
                    peVar.setScaleX(0.1f);
                    peVar.setScaleY(0.1f);
                    peVar.setAlpha(0.0f);
                    oeVar.setVisibility(8);
                    if (pgVar.getVisibility() == 0) {
                        pgVar.setScaleX(0.1f);
                        pgVar.setScaleY(0.1f);
                        pgVar.setAlpha(0.0f);
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
                    ve veVar9 = this.O0;
                    if (veVar9 == null || veVar9.getVisibility() != 0) {
                        i10 = 8;
                    } else {
                        this.O0.setScaleX(0.1f);
                        this.O0.setScaleY(0.1f);
                        this.O0.setAlpha(0.0f);
                        i10 = 8;
                        this.O0.setVisibility(8);
                    }
                    if (y3Var != null) {
                        y3Var.setVisibility(i10);
                        if (this.U2 != null && getVisibility() == 0) {
                            this.U2.s0();
                        }
                        H1(0);
                        ug.g gVar4 = this.Z4;
                        if (gVar4 != null) {
                            gVar4.e(0, z20, true);
                            if (jeVar != null) {
                                float f11 = z20 ? 0.0f : 1.0f;
                                this.q1 = f11;
                                jeVar.setAlpha(f11);
                                jeVar.setScaleX(z20 ? 0.5f : 1.0f);
                                jeVar.setScaleY(z20 ? 0.5f : 1.0f);
                            }
                        } else if (jeVar != null) {
                            this.q1 = 0.0f;
                            jeVar.setAlpha(0.0f);
                            jeVar.setScaleX(0.5f);
                            jeVar.setScaleY(0.5f);
                        }
                    }
                    this.G1 = true;
                    if (this.E1 != null) {
                        hg hgVar6 = this.U2;
                        if (hgVar6 != null && hgVar6.C0()) {
                            this.E1.setVisibility(8);
                            this.E1.setTag(null);
                        }
                        this.E1.setAlpha(0.0f);
                        this.E1.setScaleX(0.0f);
                        this.E1.setScaleY(1.0f);
                        this.E1.setTranslationX(0.0f);
                    }
                    z11 = true;
                    if (!this.v4 || (imageView3 = this.r1) == null) {
                        return;
                    }
                    if (z14) {
                        imageView3.animate().translationX(z11 ? -j7.l1.d(64.0f, reVar.l(), 0) : AndroidUtilities.dp(42.0f)).setDuration(320L).setInterpolator(jr.h).start();
                        return;
                    } else {
                        imageView3.setTranslationX(z11 ? -j7.l1.d(64.0f, reVar.l(), 0) : AndroidUtilities.dp(42.0f));
                        return;
                    }
                }
                int i15 = this.q2;
                if (i15 == 1 && str == null) {
                    return;
                }
                if (i15 == 3 && str != null) {
                    return;
                }
                AnimatorSet animatorSet8 = this.m2;
                if (animatorSet8 != null) {
                    animatorSet8.cancel();
                    animatorSet = null;
                    this.m2 = null;
                } else {
                    animatorSet = null;
                }
                AnimatorSet animatorSet9 = this.n2;
                if (animatorSet9 != null) {
                    animatorSet9.cancel();
                    this.n2 = animatorSet;
                }
                if (y3Var != null) {
                    this.n2 = new AnimatorSet();
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(ObjectAnimator.ofFloat(y3Var, ceVar, 0.0f));
                    arrayList5.add(ObjectAnimator.ofFloat(y3Var, (Property<bg.y3, Float>) property, 0.5f));
                    ViewPropertyAnimator viewPropertyAnimator5 = this.l1;
                    if (viewPropertyAnimator5 != null) {
                        viewPropertyAnimator5.cancel();
                        this.l1 = null;
                    }
                    ug.g gVar5 = this.Z4;
                    if (gVar5 != null) {
                        gVar5.e(0, z20, true);
                        if (jeVar != null) {
                            float f12 = z20 ? 0.0f : 1.0f;
                            this.q1 = f12;
                            arrayList5.add(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property3, f12));
                            arrayList5.add(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property, z20 ? 0.5f : 1.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property2, z20 ? 0.5f : 1.0f));
                        }
                    } else if (jeVar != null) {
                        this.q1 = 0.0f;
                        arrayList5.add(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property3, 0.0f));
                        arrayList5.add(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property, 0.5f));
                        arrayList5.add(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property2, 0.5f));
                    }
                    hg hgVar7 = this.U2;
                    boolean z21 = hgVar7 != null && hgVar7.C0();
                    this.G1 = true;
                    te teVar4 = this.E1;
                    if (teVar4 != null) {
                        teVar4.setScaleY(1.0f);
                        if (z21) {
                            this.E1.setTag(null);
                            arrayList5.add(ObjectAnimator.ofFloat(this.E1, (Property<te, Float>) property3, 0.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(this.E1, (Property<te, Float>) property, 0.0f));
                            arrayList5.add(p(0.0f));
                        } else {
                            this.E1.setAlpha(0.0f);
                            this.E1.setScaleX(0.0f);
                            this.E1.setTranslationX(0.0f);
                        }
                    }
                    this.n2.playTogether(arrayList5);
                    this.n2.setDuration(100L);
                    this.n2.addListener(new we(this, z21, 1));
                    this.n2.start();
                    H1(0);
                    if (this.U2 != null && getVisibility() == 0) {
                        this.U2.s0();
                    }
                }
                this.m2 = new AnimatorSet();
                ArrayList arrayList6 = new ArrayList();
                if (oeVar.getVisibility() == 0) {
                    r14 = 0;
                    arrayList6.add(ObjectAnimator.ofFloat(peVar, (Property<pe, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(peVar, (Property<pe, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(peVar, (Property<pe, Float>) property3, 0.0f));
                } else {
                    r14 = 0;
                }
                ve veVar10 = this.O0;
                if (veVar10 != null && veVar10.getVisibility() == 0) {
                    ve veVar11 = this.O0;
                    float[] fArr17 = new float[1];
                    fArr17[r14] = 0.1f;
                    arrayList6.add(ObjectAnimator.ofFloat(veVar11, (Property<ve, Float>) property, fArr17));
                    ve veVar12 = this.O0;
                    float[] fArr18 = new float[1];
                    fArr18[r14] = 0.1f;
                    arrayList6.add(ObjectAnimator.ofFloat(veVar12, (Property<ve, Float>) property2, fArr18));
                    ve veVar13 = this.O0;
                    float[] fArr19 = new float[1];
                    fArr19[r14] = 0.0f;
                    arrayList6.add(ObjectAnimator.ofFloat(veVar13, (Property<ve, Float>) property3, fArr19));
                }
                if (pgVar.getVisibility() == 0) {
                    float[] fArr20 = new float[1];
                    fArr20[r14] = 0.1f;
                    arrayList6.add(ObjectAnimator.ofFloat(pgVar, (Property<pg, Float>) property, fArr20));
                    float[] fArr21 = new float[1];
                    fArr21[r14] = 0.1f;
                    arrayList6.add(ObjectAnimator.ofFloat(pgVar, (Property<pg, Float>) property2, fArr21));
                    float[] fArr23 = new float[1];
                    fArr23[r14] = 0.0f;
                    arrayList6.add(ObjectAnimator.ofFloat(pgVar, (Property<pg, Float>) property3, fArr23));
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
                        this.q2 = 3;
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
                        this.q2 = 1;
                        arrayList6.add(q(true));
                        getSendButtonInternal().setVisibility(r14);
                    }
                    this.m2.playTogether(arrayList6);
                    this.m2.setDuration(220L);
                    this.m2.setInterpolator(jr.h);
                    this.m2.addListener(new bg.c3(19, this, str));
                    this.m2.start();
                }
                imageView2 = imageView;
                if (str == null) {
                }
                this.m2.playTogether(arrayList6);
                this.m2.setDuration(220L);
                this.m2.setInterpolator(jr.h);
                this.m2.addListener(new bg.c3(19, this, str));
                this.m2.start();
            }
            z11 = true;
            if (this.v4) {
                return;
            } else {
                return;
            }
        }
        if (pgVar.getVisibility() != 0) {
            if (!z14) {
                pgVar.setScaleX(1.0f);
                pgVar.setScaleY(1.0f);
                pgVar.setAlpha(1.0f);
                setSlowModeButtonVisible(true);
                peVar.setScaleX(0.1f);
                peVar.setScaleY(0.1f);
                peVar.setAlpha(0.0f);
                oeVar2.setVisibility(8);
                getSendButtonInternal().setScaleX(0.1f);
                getSendButtonInternal().setScaleY(0.1f);
                getSendButtonInternal().setAlpha(0.0f);
                getSendButtonInternal().setVisibility(8);
                imageView4.setScaleX(0.1f);
                imageView4.setScaleY(0.1f);
                imageView4.setAlpha(0.0f);
                imageView4.setVisibility(8);
                ve veVar14 = this.O0;
                if (veVar14 == null || veVar14.getVisibility() != 0) {
                    i12 = 8;
                } else {
                    this.O0.setScaleX(0.1f);
                    this.O0.setScaleY(0.1f);
                    this.O0.setAlpha(0.0f);
                    i12 = 8;
                    this.O0.setVisibility(8);
                }
                if (y3Var != null) {
                    y3Var.setVisibility(i12);
                    if (this.U2 != null && getVisibility() == 0) {
                        this.U2.s0();
                    }
                    z12 = false;
                    H1(0);
                    ug.g gVar6 = this.Z4;
                    if (gVar6 != null) {
                        gVar6.e(0, false, false);
                    }
                    if (jeVar != null) {
                        this.q1 = 0.0f;
                        jeVar.setAlpha(0.0f);
                        jeVar.setScaleX(0.5f);
                        jeVar.setScaleY(0.5f);
                    }
                } else {
                    z12 = false;
                }
                this.G1 = z12;
                hg hgVar8 = this.U2;
                boolean z22 = hgVar8 != null && hgVar8.C0();
                if (z22) {
                    a0();
                }
                te teVar5 = this.E1;
                if (teVar5 != null) {
                    if (z22) {
                        teVar5.setVisibility(0);
                        this.E1.setTag(1);
                    }
                    this.E1.setTranslationX(0.0f);
                    this.E1.setAlpha(1.0f);
                    this.E1.setScaleX(1.0f);
                    this.E1.setScaleY(1.0f);
                }
            } else {
                if (this.q2 == 5) {
                    return;
                }
                AnimatorSet animatorSet10 = this.m2;
                if (animatorSet10 != null) {
                    animatorSet10.cancel();
                    r52 = 0;
                    this.m2 = null;
                } else {
                    r52 = 0;
                }
                AnimatorSet animatorSet11 = this.n2;
                if (animatorSet11 != null) {
                    animatorSet11.cancel();
                    this.n2 = r52;
                }
                ViewPropertyAnimator viewPropertyAnimator6 = this.l1;
                if (viewPropertyAnimator6 != null) {
                    viewPropertyAnimator6.cancel();
                    this.l1 = r52;
                }
                if (y3Var != null) {
                    this.n2 = new AnimatorSet();
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(ObjectAnimator.ofFloat(y3Var, ceVar, 0.0f));
                    arrayList7.add(ObjectAnimator.ofFloat(y3Var, (Property<bg.y3, Float>) property, 0.5f));
                    this.G1 = false;
                    hg hgVar9 = this.U2;
                    boolean z23 = hgVar9 != null && hgVar9.C0();
                    if (z23) {
                        a0();
                    }
                    ug.g gVar7 = this.Z4;
                    if (gVar7 != null) {
                        gVar7.e(0, false, true);
                    }
                    if (jeVar != null) {
                        this.q1 = 0.0f;
                        arrayList7.add(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property3, 0.0f));
                        arrayList7.add(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property, 0.5f));
                        arrayList7.add(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property2, 0.5f));
                    }
                    te teVar6 = this.E1;
                    if (teVar6 != null) {
                        teVar6.setScaleY(1.0f);
                        if (z23) {
                            this.E1.setVisibility(0);
                            this.E1.setTag(1);
                            this.E1.setPivotX(AndroidUtilities.dp(44.0f));
                            arrayList7.add(p(0.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.E1, (Property<te, Float>) property3, 1.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.E1, (Property<te, Float>) property, 1.0f));
                        } else {
                            this.E1.setTranslationX(0.0f);
                            this.E1.setAlpha(1.0f);
                            this.E1.setScaleX(1.0f);
                        }
                    }
                    this.n2.playTogether(arrayList7);
                    this.n2.setDuration(100L);
                    this.n2.addListener(new se(this, 2));
                    this.n2.start();
                    H1(0);
                    if (this.U2 != null && getVisibility() == 0) {
                        this.U2.s0();
                    }
                }
                this.q2 = 5;
                this.m2 = new AnimatorSet();
                ArrayList arrayList8 = new ArrayList();
                if (oeVar2.getVisibility() == 0) {
                    r142 = 0;
                    arrayList8.add(ObjectAnimator.ofFloat(peVar, (Property<pe, Float>) property, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(peVar, (Property<pe, Float>) property2, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(peVar, (Property<pe, Float>) property3, 0.0f));
                } else {
                    r142 = 0;
                }
                ve veVar15 = this.O0;
                if (veVar15 != null && veVar15.getVisibility() == 0) {
                    ve veVar16 = this.O0;
                    float[] fArr30 = new float[1];
                    fArr30[r142] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(veVar16, (Property<ve, Float>) property, fArr30));
                    ve veVar17 = this.O0;
                    float[] fArr31 = new float[1];
                    fArr31[r142] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(veVar17, (Property<ve, Float>) property2, fArr31));
                    ve veVar18 = this.O0;
                    float[] fArr33 = new float[1];
                    fArr33[r142] = 0.0f;
                    arrayList8.add(ObjectAnimator.ofFloat(veVar18, (Property<ve, Float>) property3, fArr33));
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
                arrayList8.add(ObjectAnimator.ofFloat(pgVar, (Property<pg, Float>) property, fArr37));
                float[] fArr38 = new float[1];
                fArr38[r142] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(pgVar, (Property<pg, Float>) property2, fArr38));
                float[] fArr39 = new float[1];
                fArr39[r142] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(pgVar, (Property<pg, Float>) property3, fArr39));
                setSlowModeButtonVisible(true);
                this.m2.playTogether(arrayList8);
                this.m2.setDuration(220L);
                this.m2.setInterpolator(jr.h);
                this.m2.addListener(new se(this, 3));
                this.m2.start();
            }
        }
        reVar = reVar2;
        z11 = false;
        if (this.v4) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0() {
        org.telegram.ui.tn tnVar;
        Editable editable;
        th.x1 x1Var;
        CharSequence[] charSequenceArr;
        ArrayList<TLRPC.MessageEntity> entities;
        if (this.A0 == null || (tnVar = this.K2) == null || !MessagesController.getInstance(this.M).richEditorAvailable()) {
            return;
        }
        TL_iv.RichMessage richMessage = this.z1;
        if (richMessage != null) {
            x1Var = new th.x1(richMessage);
        } else {
            Editable text = this.A0.getText();
            if (!TextUtils.isEmpty(text) && TextUtils.indexOf((CharSequence) text, '`') >= 0) {
                try {
                    charSequenceArr = new CharSequence[]{new SpannableStringBuilder(text)};
                    entities = MediaDataController.getInstance(this.M).getEntities(charSequenceArr, true);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (entities != null && !entities.isEmpty()) {
                    editable = new SpannableStringBuilder(charSequenceArr[0]);
                    MessageObject.addEntitiesToText(editable, entities, false, false, false, false);
                    th.x1 x1Var2 = new th.x1(editable);
                    if (editable == text) {
                        int selectionStart = this.A0.getSelectionStart();
                        int selectionEnd = this.A0.getSelectionEnd();
                        if (selectionStart < 0) {
                            selectionStart = this.A0.length();
                        }
                        if (selectionEnd < 0) {
                            selectionEnd = selectionStart;
                        }
                        x1Var2.c = selectionStart;
                        x1Var2.d = selectionEnd;
                    }
                    x1Var2.H = new ld(this, 15);
                    x1Var = x1Var2;
                }
            }
            editable = text;
            th.x1 x1Var22 = new th.x1(editable);
            if (editable == text) {
            }
            x1Var22.H = new ld(this, 15);
            x1Var = x1Var22;
        }
        x1Var.setResourceProvider(this.R3);
        x1Var.F = tnVar;
        x1Var.s = tnVar.O;
        x1Var.v = tnVar.U;
        x1Var.G = new ld(this, 16);
        tnVar.presentFragment(x1Var);
    }

    public final void J1() {
        jf jfVar = this.A0;
        if (jfVar != null) {
            jfVar.setTranslationX(this.D + this.C);
        }
    }

    public final void K() {
        if (this.Q0 == null) {
            return;
        }
        Point point = AndroidUtilities.displaySize;
        int i10 = point.x > point.y ? this.t2 : this.s2;
        int dp = ((((this.j1 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - getHeight();
        int i11 = 2;
        if (this.M1 == 2) {
            dp = Math.min(dp, AndroidUtilities.dp(175.0f) + i10);
        }
        int i12 = this.Q0.getLayoutParams().height;
        if (i12 == dp) {
            return;
        }
        AnimatorSet animatorSet = this.w3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.w3 = null;
        }
        this.y3 = dp;
        org.telegram.ui.Cells.b1 b1Var = this.o3;
        if (i12 > dp) {
            ld ldVar = new ld(this, 6);
            this.Q0.setLayerType(2, null);
            if (this.v) {
                this.w = ldVar;
            } else {
                AnimatorSet animatorSet2 = new AnimatorSet();
                if (this.Y4 != null) {
                    animatorSet2.playTogether(ValueAnimator.ofInt(-(this.y3 - i10)), ValueAnimator.ofInt(-(this.y3 - i10)));
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofInt(this, b1Var, -(this.y3 - i10)), ObjectAnimator.ofInt(this.Q0, b1Var, -(this.y3 - i10)));
                    ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new jd(this, i11));
                }
                animatorSet2.setDuration(300L);
                animatorSet2.setInterpolator(jr.f);
                animatorSet2.addListener(new bg.c3(22, this, ldVar));
                this.w3 = animatorSet2;
                animatorSet2.start();
            }
        } else {
            if (this.Y4 == null) {
                this.Q0.getLayoutParams().height = this.y3;
            }
            this.h1.requestLayout();
            jf jfVar = this.A0;
            if (jfVar != null) {
                int selectionStart = jfVar.getSelectionStart();
                int selectionEnd = this.A0.getSelectionEnd();
                jf jfVar2 = this.A0;
                jfVar2.setText(jfVar2.getText());
                this.A0.setSelection(selectionStart, selectionEnd);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            if (this.Y4 != null) {
                animatorSet3.playTogether(ValueAnimator.ofInt(-(this.y3 - i10)), ValueAnimator.ofInt(-(this.y3 - i10)));
            } else {
                animatorSet3.playTogether(ObjectAnimator.ofInt(this, b1Var, -(this.y3 - i10)), ObjectAnimator.ofInt(this.Q0, b1Var, -(this.y3 - i10)));
                ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new jd(this, 3));
            }
            animatorSet3.setDuration(300L);
            animatorSet3.setInterpolator(jr.f);
            animatorSet3.addListener(new se(this, 11));
            this.w3 = animatorSet3;
            this.Q0.setLayerType(2, null);
            animatorSet3.start();
        }
        ah.f fVar = this.Y4;
        if (fVar != null) {
            ((ah.i) fVar).g(dp);
        }
    }

    public final void K0(CharSequence charSequence, String str, CharSequence charSequence2) {
        org.telegram.ui.tn tnVar;
        if (this.A0 == null || (tnVar = this.K2) == null || !MessagesController.getInstance(this.M).richEditorAvailable()) {
            return;
        }
        th.x1 x1Var = new th.x1(str);
        x1Var.h = charSequence;
        x1Var.n = charSequence2;
        x1Var.setResourceProvider(this.R3);
        x1Var.F = tnVar;
        x1Var.s = tnVar.O;
        x1Var.v = tnVar.U;
        x1Var.H = new be(this, 1);
        x1Var.G = new be(this, 2);
        tnVar.presentFragment(x1Var);
    }

    public final void K1(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        xf xfVar;
        this.w0 = false;
        boolean z10 = true;
        this.b = true;
        this.v0 = true;
        this.t0 = true;
        this.u0 = true;
        if (chat != null) {
            this.W0 = (ChatObject.canSendVoice(chat) || (ChatObject.canSendRoundVideo(chat) && this.Z1)) ? false : true;
            this.b = ChatObject.canSendStickers(chat);
            boolean canSendPlain = ChatObject.canSendPlain(chat);
            this.v0 = canSendPlain;
            boolean z11 = (this.b || canSendPlain) ? false : true;
            this.w0 = z11;
            this.n = z11 ? 0.5f : 1.0f;
            F1();
            if (!this.w0 && (xfVar = this.Q0) != null) {
                xfVar.L(-this.L2, !this.v0, !this.b);
            }
            this.t0 = ChatObject.canSendRoundVideo(chat);
            this.u0 = ChatObject.canSendVoice(chat);
        } else if (userFull != null) {
            this.W0 = userFull.voice_messages_forbidden;
            this.G = userFull;
        }
        float f9 = this.W0 ? 0.5f : 1.0f;
        oe oeVar = this.V0;
        oeVar.setAlpha(f9);
        oeVar.invalidate();
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.W0 ? i0(org.telegram.ui.ActionBar.g6.Wk) : -1, PorterDuff.Mode.SRC_IN);
        pe peVar = this.X0;
        peVar.setColorFilter(porterDuffColorFilter);
        peVar.invalidate();
        G1(false);
        boolean z12 = this.Y0;
        if (!this.t0 && z12) {
            z12 = false;
        }
        if (this.u0 || z12) {
            z10 = z12;
        } else if (!this.Z1) {
            z10 = false;
        }
        k1(z10, false);
    }

    public final void L() {
        this.f5 = y(true);
        float y8 = y(false);
        if (this.e5 != y8) {
            this.e5 = y8;
            A0(y8);
        }
    }

    public final void L0() {
        ld ldVar = new ld(this, 28);
        if (SharedPrefsHelper.isWebViewConfirmShown(this.M, this.L2) || MessagesController.getInstance(this.M).whitelistedBots.contains(Long.valueOf(this.L2))) {
            ldVar.run();
            return;
        }
        c5.o(this.K2, MessagesController.getInstance(this.M).getUser(Long.valueOf(this.L2)), new z2(7, this, ldVar), new ld(this, 29));
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
        char c3;
        float f9;
        int i12;
        ?? r10;
        boolean z12;
        int i13;
        long j10;
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
        char c6;
        char c10;
        Property property;
        rg rgVar = rg.a;
        rg rgVar2 = rg.b;
        Float valueOf = Float.valueOf(0.0f);
        Runnable runnable = this.b0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.b0 = null;
        }
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.I = false;
        }
        boolean z14 = this.A2;
        Property property2 = View.TRANSLATION_X;
        Property property3 = View.SCALE_X;
        Property property4 = View.SCALE_Y;
        Property property5 = View.ALPHA;
        if (z14) {
            if (this.r2 == 1) {
                this.L4 = i10;
                return;
            }
            boolean z15 = this.L4 == 3;
            if (z15) {
                property = property3;
            } else {
                this.K = false;
                lg lgVar = this.J1;
                if (lgVar != null) {
                    lgVar.y.d(1, false, false);
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.M);
                long j11 = this.L2;
                org.telegram.ui.tn tnVar = this.K2;
                property = property3;
                mediaDataController.toggleDraftVoiceOnce(j11, (tnVar == null || !tnVar.d4) ? 0L : tnVar.b(), this.K);
                this.e1 = 0L;
            }
            X();
            this.r2 = 1;
            xf xfVar = this.Q0;
            if (xfVar != null) {
                xfVar.setEnabled(false);
            }
            try {
                if (this.l2 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.l2 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            AndroidUtilities.lockOrientation(this.J2);
            hg hgVar = this.U2;
            if (hgVar != null) {
                hgVar.a1(0);
            }
            AnimatorSet animatorSet = this.o2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.p2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            Z();
            bh.d dVar = this.Z0;
            if (dVar != null) {
                dVar.setVisibility(0);
            }
            Y();
            RecordCircle recordCircle2 = this.I1;
            if (recordCircle2 != null) {
                recordCircle2.I = false;
                recordCircle2.setVisibility(0);
                this.I1.setAmplitude(0.0d);
            }
            lg lgVar2 = this.J1;
            if (lgVar2 != null) {
                lgVar2.setVisibility(0);
            }
            ng ngVar = this.g1;
            if (ngVar != null) {
                ngVar.a = 1.0f;
                ngVar.b = System.currentTimeMillis();
                ngVar.c = false;
                ngVar.e = false;
                ngVar.f.stop();
                ngVar.invalidate();
                this.g1.setScaleX(0.0f);
                this.g1.setScaleY(0.0f);
                this.g1.h = true;
            }
            this.o2 = new AnimatorSet();
            this.U0.setTranslationX(AndroidUtilities.dp(20.0f));
            this.U0.setAlpha(0.0f);
            if (this.L4 != 3) {
                this.f1.setTranslationX(AndroidUtilities.dp(20.0f));
                this.f1.setAlpha(0.0f);
                this.f1.setCancelToProgress(0.0f);
                SlideTextView slideTextView = this.f1;
                slideTextView.r = 1.0f;
                slideTextView.setEnabled(true);
            } else {
                this.f1.setTranslationX(0.0f);
                this.f1.setAlpha(0.0f);
                this.f1.setCancelToProgress(1.0f);
                this.f1.setEnabled(true);
            }
            this.I1.c(this.L4 == 3);
            this.f2 = false;
            x0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            Property property6 = property;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.M0, this.U3, 0.0f), ObjectAnimator.ofFloat(this.M0, this.W3, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<ng, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.g1, (Property<ng, Float>) property6, 1.0f), ObjectAnimator.ofFloat(this.U0, (Property<qg, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.U0, (Property<qg, Float>) property5, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f1, (Property<SlideTextView, Float>) property2, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f1, (Property<SlideTextView, Float>) property5, 1.0f));
            lg lgVar3 = this.J1;
            if (lgVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(lgVar3, (Property<lg, Float>) property5, 1.0f));
            }
            if (this.X0 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.V0, (Property<oe, Float>) property5, 0.0f));
            }
            ph.z zVar = this.h0;
            if (zVar != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(zVar, (Property<ph.z, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.h0, (Property<ph.z, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.h0, (Property<ph.z, Float>) property5, 0.0f));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.A0, this.Y3, AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.A0, (Property<jf, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.a1, (Property<de, Float>) property5, 1.0f));
            if (z15) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.d1, (Property<gk0, Float>) property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.c1, (Property<aj0, Float>) property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.c1, (Property<aj0, Float>) property6, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.c1, (Property<aj0, Float>) property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.b1, (Property<l71, Float>) property5, 0.0f));
            }
            if (this.E1 != null) {
                animatorSet4.playTogether(p(AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.E1, (Property<te, Float>) property5, 0.0f));
            }
            bg.y3 y3Var = this.k1;
            if (y3Var != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(y3Var, this.X3, AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.k1, this.V3, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.l1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.l1 = null;
                }
                je jeVar = this.m1;
                this.q1 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.m1, (Property<je, Float>) property6, 0.5f), ObjectAnimator.ofFloat(this.m1, (Property<je, Float>) property4, 0.5f));
            }
            ug.g gVar = this.Z4;
            if (gVar != null) {
                gVar.e(0, false, true);
            }
            this.o2.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.I1, this.p3, 1.0f).setDuration(300L));
            if (!z15) {
                this.o2.playTogether(ObjectAnimator.ofFloat(this.I1, this.q3, 1.0f).setDuration(300L));
            }
            this.o2.addListener(new of(this, z15));
            this.o2.setInterpolator(new DecelerateInterpolator());
            this.o2.start();
            this.U0.a(this.e1);
        } else {
            if (this.f2 && i10 == 3) {
                return;
            }
            PowerManager.WakeLock wakeLock = this.l2;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.l2 = null;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            AndroidUtilities.unlockOrientation(this.J2);
            this.h3 = false;
            if (this.r2 == 0) {
                this.L4 = i10;
                return;
            }
            this.N.getMessagesController().sendTyping(this.L2, getThreadMessageId(), 2, 0);
            this.r2 = 0;
            xf xfVar2 = this.Q0;
            if (xfVar2 != null) {
                xfVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.o2;
            if (animatorSet5 != null) {
                z11 = animatorSet5.isRunning();
                pe peVar = this.X0;
                if (peVar != null) {
                    peVar.setScaleX(1.0f);
                    this.X0.setScaleY(1.0f);
                }
                this.o2.removeAllListeners();
                this.o2.cancel();
            } else {
                z11 = false;
            }
            AnimatorSet animatorSet6 = this.p2;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            jf jfVar = this.A0;
            if (jfVar != null) {
                jfVar.setVisibility(0);
            }
            this.o2 = new AnimatorSet();
            if (z11 || i10 == 4) {
                pe peVar2 = this.X0;
                if (peVar2 != null) {
                    peVar2.setVisibility(0);
                }
                this.o2.playTogether(ObjectAnimator.ofFloat(this.M0, this.U3, 1.0f), ObjectAnimator.ofFloat(this.M0, this.W3, this.w0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.g1, (Property<ng, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<ng, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.I1, this.p3, 0.0f), ObjectAnimator.ofFloat(this.I1, this.q3, 0.0f), ObjectAnimator.ofFloat(this.V0, (Property<oe, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.U0, (Property<qg, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.V0, (Property<oe, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.A0, (Property<jf, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.A0, this.Y3, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                lg lgVar4 = this.J1;
                if (lgVar4 != null) {
                    i11 = 1;
                    c3 = 0;
                    this.o2.playTogether(ObjectAnimator.ofFloat(lgVar4, (Property<lg, Float>) property5, 0.0f));
                    this.J1.a();
                } else {
                    i11 = 1;
                    c3 = 0;
                }
                ph.z zVar2 = this.h0;
                if (zVar2 != null) {
                    AnimatorSet animatorSet7 = this.o2;
                    float[] fArr = new float[i11];
                    f9 = 1.0f;
                    fArr[c3] = 1.0f;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zVar2, (Property<ph.z, Float>) property4, fArr);
                    ph.z zVar3 = this.h0;
                    float[] fArr2 = new float[i11];
                    fArr2[c3] = 1.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(zVar3, (Property<ph.z, Float>) property3, fArr2);
                    ph.z zVar4 = this.h0;
                    float[] fArr3 = new float[i11];
                    fArr3[c3] = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(zVar4, (Property<ph.z, Float>) property5, fArr3);
                    Animator[] animatorArr = new Animator[3];
                    animatorArr[c3] = ofFloat;
                    animatorArr[i11] = ofFloat2;
                    animatorArr[2] = ofFloat3;
                    animatorSet7.playTogether(animatorArr);
                } else {
                    f9 = 1.0f;
                }
                pe peVar3 = this.X0;
                if (peVar3 != null) {
                    peVar3.setScaleX(f9);
                    this.X0.setScaleY(f9);
                    i12 = 1;
                    this.o2.playTogether(ObjectAnimator.ofFloat(this.V0, (Property<oe, Float>) property5, f9));
                    this.X0.j(s0() ? rgVar2 : rgVar, true);
                } else {
                    i12 = 1;
                }
                if (this.E1 != null) {
                    AnimatorSet animatorSet8 = this.o2;
                    ValueAnimator p10 = p(0.0f);
                    te teVar = this.E1;
                    float[] fArr4 = new float[i12];
                    fArr4[0] = 1.0f;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(teVar, (Property<te, Float>) property5, fArr4);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = p10;
                    animatorArr2[i12] = ofFloat4;
                    animatorSet8.playTogether(animatorArr2);
                }
                if (this.k1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.l1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.l1 = null;
                    }
                    z12 = true;
                    r10 = 0;
                    this.o2.playTogether(ObjectAnimator.ofFloat(this.k1, this.X3, 0.0f), ObjectAnimator.ofFloat(this.k1, this.V3, 1.0f));
                    AnimatorSet animatorSet9 = this.o2;
                    je jeVar2 = this.m1;
                    this.q1 = 1.0f;
                    animatorSet9.playTogether(ObjectAnimator.ofFloat(jeVar2, (Property<je, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.m1, (Property<je, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m1, (Property<je, Float>) property4, 1.0f));
                } else {
                    r10 = 0;
                    z12 = true;
                }
                ug.g gVar2 = this.Z4;
                if (gVar2 != 0) {
                    gVar2.e(r10, r10, z12);
                }
                this.f2 = z12;
                x0();
                this.o2.setDuration(150L);
            } else if (i10 == 3) {
                X();
                Y();
                SlideTextView slideTextView2 = this.f1;
                if (slideTextView2 != null) {
                    slideTextView2.setEnabled(false);
                }
                if (this.Y0) {
                    gk0 gk0Var = this.d1;
                    if (gk0Var != null) {
                        gk0Var.setVisibility(8);
                    }
                    de deVar = this.a1;
                    if (deVar != null) {
                        deVar.setAlpha(1.0f);
                        this.a1.setVisibility(0);
                    }
                    aj0 aj0Var = this.c1;
                    if (aj0Var != null) {
                        aj0Var.setProgress(0.0f);
                        this.c1.i();
                    }
                    z13 = true;
                    f11 = 1.0f;
                } else {
                    l71 l71Var = this.b1;
                    if (l71Var != null) {
                        l71Var.setVisibility(8);
                        x0();
                    }
                    de deVar2 = this.a1;
                    if (deVar2 != null) {
                        deVar2.setVisibility(0);
                        f11 = 1.0f;
                        this.a1.setAlpha(1.0f);
                    } else {
                        f11 = 1.0f;
                    }
                    gk0 gk0Var2 = this.d1;
                    if (gk0Var2 != null) {
                        gk0Var2.setVisibility(0);
                        this.d1.setAlpha(0.0f);
                    }
                    z13 = true;
                }
                this.n4 = z13;
                this.i4 = f11;
                this.g4 = this.f4;
                this.e4 = f11;
                SlideTextView slideTextView3 = this.f1;
                if (slideTextView3 != null) {
                    slideTextView3.setCancelToProgress(f11);
                }
                lg lgVar5 = this.J1;
                if (lgVar5 != null) {
                    lgVar5.invalidate();
                }
                aj0 aj0Var2 = this.c1;
                if (aj0Var2 != null) {
                    aj0Var2.setAlpha(0.0f);
                    this.c1.setScaleX(0.0f);
                    this.c1.setScaleY(0.0f);
                    this.c1.setProgress(0.0f);
                    this.c1.i();
                }
                if (this.Y0 || this.u4) {
                    this.b1.setVisibility(0);
                    viewGroup = null;
                    layoutParams = null;
                } else {
                    viewGroup = (ViewGroup) this.a1.getParent();
                    layoutParams = this.a1.getLayoutParams();
                    viewGroup.removeView(this.a1);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.U1 == null ? j7.l1.d(44.0f, this.F0.l(), 0) : 0), AndroidUtilities.dp(44.0f));
                    layoutParams2.gravity = 80;
                    layoutParams2.leftMargin = AndroidUtilities.dp(7.0f);
                    layoutParams2.rightMargin = AndroidUtilities.dp(7.0f);
                    this.h1.addView(this.a1, layoutParams2);
                    this.b1.setVisibility(8);
                }
                x0();
                AnimatorSet animatorSet10 = new AnimatorSet();
                if (z10) {
                    this.d1.setAllowDraw(false);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat5.addUpdateListener(new jd(this, 6));
                    ofFloat5.addListener(new pf(this));
                    ofFloat5.setDuration(s0() ? 490L : 580L);
                    AnimatorSet animatorSet11 = new AnimatorSet();
                    animatorSet11.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<ng, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<ng, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.U0, (Property<qg, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.U0, (Property<qg, Float>) property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f1, (Property<SlideTextView, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.c1, (Property<aj0, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.c1, (Property<aj0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.c1, (Property<aj0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.M0, this.U3, 0.0f), ObjectAnimator.ofFloat(this.M0, this.W3, 0.0f), ObjectAnimator.ofFloat(this.A0, (Property<jf, Float>) property5, 0.0f));
                    aj0 aj0Var3 = this.c1;
                    if (aj0Var3 != null) {
                        aj0Var3.setAlpha(0.0f);
                        this.c1.setScaleX(0.0f);
                        this.c1.setScaleY(0.0f);
                    }
                    if (this.X0 != null) {
                        i16 = 1;
                        animatorSet11.playTogether(ObjectAnimator.ofFloat(this.V0, (Property<oe, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.V0, (Property<oe, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.V0, (Property<oe, Float>) property4, 1.0f));
                        this.X0.j(s0() ? rgVar2 : rgVar, true);
                    } else {
                        i16 = 1;
                    }
                    ph.z zVar5 = this.h0;
                    if (zVar5 != null) {
                        float[] fArr5 = new float[i16];
                        fArr5[0] = 0.0f;
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(zVar5, (Property<ph.z, Float>) property5, fArr5);
                        ph.z zVar6 = this.h0;
                        float[] fArr6 = new float[i16];
                        fArr6[0] = 0.0f;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(zVar6, (Property<ph.z, Float>) property3, fArr6);
                        ph.z zVar7 = this.h0;
                        float[] fArr7 = new float[i16];
                        fArr7[0] = 0.0f;
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(zVar7, (Property<ph.z, Float>) property4, fArr7);
                        Animator[] animatorArr3 = new Animator[3];
                        animatorArr3[0] = ofFloat6;
                        animatorArr3[i16] = ofFloat7;
                        animatorArr3[2] = ofFloat8;
                        animatorSet11.playTogether(animatorArr3);
                    }
                    animatorSet11.addListener(new se(this, 8));
                    animatorSet11.setDuration(150L);
                    animatorSet11.setStartDelay(150L);
                    if (s0()) {
                        this.b1.setAlpha(0.0f);
                        c6 = 1;
                        c10 = 0;
                        animatorSet10.playTogether(ObjectAnimator.ofFloat(this.b1, (Property<l71, Float>) property5, 1.0f));
                        animatorSet10.setDuration(150L);
                        animatorSet10.setStartDelay(430L);
                    } else {
                        c6 = 1;
                        c10 = 0;
                    }
                    AnimatorSet animatorSet12 = this.o2;
                    Animator[] animatorArr4 = new Animator[3];
                    animatorArr4[c10] = animatorSet11;
                    animatorArr4[c6] = ofFloat5;
                    animatorArr4[2] = animatorSet10;
                    animatorSet12.playTogether(animatorArr4);
                    this.o2.addListener(new lh.f3(this, viewGroup, layoutParams, 2));
                } else {
                    Z();
                    this.p3.set(this.I1, Float.valueOf(1.0f));
                    this.I1.setTransformToSeekbar(1.0f);
                    if (!this.Y0) {
                        float f12 = this.k4;
                        if (f12 != 0.0f && this.d1 != null) {
                            this.d1.setAlpha(jr.j.getInterpolation(Math.max(0.0f, ((f12 - 0.38f) - 0.25f) / 0.37f)));
                            this.d1.invalidate();
                        }
                    }
                    this.g1.setScaleY(0.0f);
                    this.g1.setScaleX(0.0f);
                    this.U0.setAlpha(0.0f);
                    this.U0.setTranslationX(-AndroidUtilities.dp(20.0f));
                    this.f1.setAlpha(0.0f);
                    this.c1.setAlpha(1.0f);
                    this.c1.setScaleY(1.0f);
                    this.c1.setScaleX(1.0f);
                    this.U3.set(this.M0, valueOf);
                    this.W3.set(this.M0, valueOf);
                    this.A0.setAlpha(0.0f);
                    pe peVar4 = this.X0;
                    if (peVar4 != null) {
                        if (s0()) {
                            rgVar = rgVar2;
                        }
                        peVar4.j(rgVar, z10);
                        this.V0.setAlpha(1.0f);
                        this.V0.setScaleX(1.0f);
                        this.V0.setScaleY(1.0f);
                    }
                    ph.z zVar8 = this.h0;
                    if (zVar8 != null) {
                        zVar8.setAlpha(0.0f);
                        this.h0.setScaleX(0.0f);
                        this.h0.setScaleY(0.0f);
                    }
                    if (s0()) {
                        this.b1.setAlpha(1.0f);
                    }
                    if (viewGroup != null) {
                        this.h1.removeView(this.a1);
                        viewGroup.addView(this.a1, layoutParams);
                    }
                    this.a1.setAlpha(1.0f);
                    this.d1.setAlpha(1.0f);
                    this.h = 0.0f;
                    this.n = 0.0f;
                    F1();
                    x0();
                }
            } else if (i10 == 2 || i10 == 5) {
                pe peVar5 = this.X0;
                if (peVar5 != null) {
                    peVar5.setVisibility(0);
                }
                this.f2 = true;
                x0();
                AnimatorSet animatorSet13 = new AnimatorSet();
                animatorSet13.playTogether(ObjectAnimator.ofFloat(this.M0, this.U3, 1.0f), ObjectAnimator.ofFloat(this.M0, this.W3, this.w0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.g1, (Property<ng, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<ng, Float>) property3, 0.0f));
                lg lgVar6 = this.J1;
                if (lgVar6 != null) {
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(lgVar6, (Property<lg, Float>) property5, 0.0f));
                    this.J1.a();
                }
                ph.z zVar9 = this.h0;
                if (zVar9 != null) {
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(zVar9, (Property<ph.z, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.h0, (Property<ph.z, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.h0, (Property<ph.z, Float>) property5, 1.0f));
                }
                AnimatorSet animatorSet14 = new AnimatorSet();
                animatorSet14.playTogether(ObjectAnimator.ofFloat(this.U0, (Property<qg, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.U0, (Property<qg, Float>) property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f1, (Property<SlideTextView, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.f1, (Property<SlideTextView, Float>) property2, -AndroidUtilities.dp(20.0f)));
                if (i10 != 5) {
                    this.V0.setScaleX(0.0f);
                    this.V0.setScaleY(0.0f);
                    je jeVar3 = this.m1;
                    if (jeVar3 != null && jeVar3.getVisibility() == 0) {
                        this.m1.setScaleX(0.5f);
                        this.m1.setScaleY(0.5f);
                    }
                    ve veVar = this.s1;
                    if (veVar != null && veVar.getVisibility() == 0) {
                        this.s1.setScaleX(0.0f);
                        this.s1.setScaleY(0.0f);
                    }
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.V0, (Property<oe, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.V0, (Property<oe, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.V0, (Property<oe, Float>) property5, 1.0f));
                    if (this.k1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator3 = this.l1;
                        if (viewPropertyAnimator3 != null) {
                            viewPropertyAnimator3.cancel();
                            this.l1 = null;
                        }
                        i14 = 1;
                        r102 = 0;
                        animatorSet13.playTogether(ObjectAnimator.ofFloat(this.k1, this.V3, 1.0f), ObjectAnimator.ofFloat(this.k1, this.X3, 0.0f));
                        je jeVar4 = this.m1;
                        this.q1 = 1.0f;
                        animatorSet13.playTogether(ObjectAnimator.ofFloat(jeVar4, (Property<je, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.m1, (Property<je, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m1, (Property<je, Float>) property4, 1.0f));
                    } else {
                        r102 = 0;
                        i14 = 1;
                    }
                    ug.g gVar3 = this.Z4;
                    if (gVar3 != 0) {
                        gVar3.e(r102, r102, i14);
                    }
                    ve veVar2 = this.s1;
                    if (veVar2 != null) {
                        float[] fArr8 = new float[i14];
                        fArr8[r102] = 1.0f;
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(veVar2, (Property<ve, Float>) property3, fArr8);
                        ve veVar3 = this.s1;
                        float[] fArr9 = new float[i14];
                        fArr9[r102] = 1.0f;
                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(veVar3, (Property<ve, Float>) property4, fArr9);
                        Animator[] animatorArr5 = new Animator[2];
                        animatorArr5[r102] = ofFloat9;
                        animatorArr5[i14] = ofFloat10;
                        animatorSet13.playTogether(animatorArr5);
                    }
                    if (this.X0 != null) {
                        oe oeVar = this.V0;
                        float[] fArr10 = new float[i14];
                        fArr10[r102] = 1.0f;
                        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(oeVar, (Property<oe, Float>) property5, fArr10);
                        Animator[] animatorArr6 = new Animator[i14];
                        animatorArr6[r102] = ofFloat11;
                        animatorSet13.playTogether(animatorArr6);
                        oe oeVar2 = this.V0;
                        float[] fArr11 = new float[i14];
                        fArr11[r102] = 1.0f;
                        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(oeVar2, (Property<oe, Float>) property3, fArr11);
                        Animator[] animatorArr7 = new Animator[i14];
                        animatorArr7[r102] = ofFloat12;
                        animatorSet13.playTogether(animatorArr7);
                        oe oeVar3 = this.V0;
                        float[] fArr12 = new float[i14];
                        fArr12[r102] = 1.0f;
                        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(oeVar3, (Property<oe, Float>) property4, fArr12);
                        Animator[] animatorArr8 = new Animator[i14];
                        animatorArr8[r102] = ofFloat13;
                        animatorSet13.playTogether(animatorArr8);
                        this.X0.j(s0() ? rgVar2 : rgVar, i14);
                    }
                    te teVar2 = this.E1;
                    if (teVar2 != null) {
                        float[] fArr13 = new float[i14];
                        fArr13[0] = 1.0f;
                        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(teVar2, (Property<te, Float>) property5, fArr13);
                        ValueAnimator p11 = p(0.0f);
                        Animator[] animatorArr9 = new Animator[2];
                        animatorArr9[0] = ofFloat14;
                        animatorArr9[i14] = p11;
                        animatorSet13.playTogether(animatorArr9);
                    }
                    j10 = 150;
                } else {
                    AnimatorSet animatorSet15 = new AnimatorSet();
                    animatorSet15.playTogether(ObjectAnimator.ofFloat(this.V0, (Property<oe, Float>) property5, 1.0f));
                    if (this.k1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.l1;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.l1 = null;
                        }
                        i13 = 1;
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(this.k1, this.X3, 0.0f), ObjectAnimator.ofFloat(this.k1, this.V3, 1.0f));
                        je jeVar5 = this.m1;
                        this.q1 = 1.0f;
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(jeVar5, (Property<je, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.m1, (Property<je, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m1, (Property<je, Float>) property4, 1.0f));
                    } else {
                        i13 = 1;
                    }
                    ug.g gVar4 = this.Z4;
                    if (gVar4 != null) {
                        gVar4.e(0, false, i13);
                    }
                    te teVar3 = this.E1;
                    if (teVar3 != null) {
                        float[] fArr14 = new float[i13];
                        fArr14[0] = 1.0f;
                        ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(teVar3, (Property<te, Float>) property5, fArr14);
                        ValueAnimator p12 = p(0.0f);
                        Animator[] animatorArr10 = new Animator[2];
                        animatorArr10[0] = ofFloat15;
                        animatorArr10[i13] = p12;
                        animatorSet15.playTogether(animatorArr10);
                    }
                    j10 = 150;
                    animatorSet15.setDuration(150L);
                    animatorSet15.setStartDelay(110L);
                    animatorSet15.addListener(new se(this, 9));
                    AnimatorSet animatorSet16 = this.o2;
                    Animator[] animatorArr11 = new Animator[i13];
                    animatorArr11[0] = animatorSet15;
                    animatorSet16.playTogether(animatorArr11);
                }
                animatorSet13.setDuration(j10);
                animatorSet13.setStartDelay(700L);
                animatorSet14.setDuration(200L);
                animatorSet14.setStartDelay(200L);
                this.C = 0.0f;
                J1();
                ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(this.A0, (Property<jf, Float>) property5, 1.0f);
                ofFloat16.setStartDelay(this.s == 1.0f ? 300L : 700L);
                ofFloat16.setDuration(200L);
                this.o2.playTogether(animatorSet13, animatorSet14, ofFloat16, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.f4).setDuration(200L));
                if (i10 == 5) {
                    ChatActivityEnterView.this.m4 = true;
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                    duration.setInterpolator(jr.j);
                    this.o2.playTogether(duration);
                } else {
                    ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                    ofFloat17.setDuration(360L);
                    ofFloat17.setStartDelay(490L);
                    this.o2.playTogether(ofFloat17);
                }
                ng ngVar2 = this.g1;
                if (ngVar2 != null) {
                    ngVar2.e = true;
                    xi0 xi0Var = ngVar2.f;
                    xi0Var.Q(0.0f, true);
                    if (ngVar2.d) {
                        xi0Var.start();
                    }
                }
            } else {
                pe peVar6 = this.X0;
                if (peVar6 != null) {
                    peVar6.setVisibility(0);
                }
                AnimatorSet animatorSet17 = new AnimatorSet();
                animatorSet17.playTogether(ObjectAnimator.ofFloat(this.M0, this.U3, 1.0f), ObjectAnimator.ofFloat(this.M0, this.W3, this.w0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.g1, (Property<ng, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<ng, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.V0, (Property<oe, Float>) property5, 1.0f));
                lg lgVar7 = this.J1;
                if (lgVar7 != null) {
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(lgVar7, (Property<lg, Float>) property5, 0.0f));
                    this.J1.a();
                }
                ph.z zVar10 = this.h0;
                if (zVar10 != null) {
                    f10 = 1.0f;
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(zVar10, (Property<ph.z, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.h0, (Property<ph.z, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.h0, (Property<ph.z, Float>) property5, 1.0f));
                } else {
                    f10 = 1.0f;
                }
                pe peVar7 = this.X0;
                if (peVar7 != null) {
                    peVar7.setScaleX(f10);
                    this.X0.setScaleY(f10);
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(this.V0, (Property<oe, Float>) property5, f10));
                    this.X0.j(s0() ? rgVar2 : rgVar, true);
                }
                if (this.k1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator5 = this.l1;
                    if (viewPropertyAnimator5 != null) {
                        viewPropertyAnimator5.cancel();
                        this.l1 = null;
                    }
                    this.x = 0.0f;
                    A1();
                    i15 = 1;
                    r103 = 0;
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(this.k1, this.V3, 1.0f));
                    je jeVar6 = this.m1;
                    this.q1 = 1.0f;
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(jeVar6, (Property<je, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.m1, (Property<je, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m1, (Property<je, Float>) property4, 1.0f));
                } else {
                    r103 = 0;
                    i15 = 1;
                }
                ug.g gVar5 = this.Z4;
                if (gVar5 != 0) {
                    gVar5.e(r103, r103, i15);
                }
                te teVar4 = this.E1;
                if (teVar4 != null) {
                    float[] fArr15 = new float[i15];
                    fArr15[r103] = 1.0f;
                    ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(teVar4, (Property<te, Float>) property5, fArr15);
                    ValueAnimator p13 = p(0.0f);
                    Animator[] animatorArr12 = new Animator[2];
                    animatorArr12[r103] = ofFloat18;
                    animatorArr12[i15] = p13;
                    animatorSet17.playTogether(animatorArr12);
                }
                animatorSet17.setDuration(150L);
                animatorSet17.setStartDelay(200L);
                AnimatorSet animatorSet18 = new AnimatorSet();
                qg qgVar = this.U0;
                float[] fArr16 = new float[i15];
                fArr16[r103] = 0.0f;
                ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(qgVar, (Property<qg, Float>) property5, fArr16);
                qg qgVar2 = this.U0;
                float[] fArr17 = new float[i15];
                fArr17[r103] = AndroidUtilities.dp(40.0f);
                ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(qgVar2, (Property<qg, Float>) property2, fArr17);
                SlideTextView slideTextView4 = this.f1;
                float[] fArr18 = new float[i15];
                fArr18[r103] = 0.0f;
                ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(slideTextView4, (Property<SlideTextView, Float>) property5, fArr18);
                SlideTextView slideTextView5 = this.f1;
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
                ofFloat23.setDuration(this.c0 ? 220L : 360L);
                this.C = 0.0f;
                J1();
                ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(this.A0, (Property<jf, Float>) property5, 1.0f);
                ofFloat24.setStartDelay(this.s == 1.0f ? 150L : 450L);
                ofFloat24.setDuration(200L);
                this.o2.playTogether(animatorSet17, animatorSet18, ofFloat24, ofFloat23);
            }
            this.o2.addListener(new rf(this, i10));
            this.o2.start();
            qg qgVar3 = this.U0;
            if (qgVar3 != null) {
                qgVar3.b();
            }
        }
        this.U2.e();
        P1(true);
        this.L4 = i10;
    }

    public final void M() {
        float f9 = this.b5.e;
        if (this.B1 != null) {
            float measuredHeight = getMeasuredHeight() - this.a5.e;
            this.B1.setTranslationY(measuredHeight - (r4.getMeasuredHeight() * f9));
            this.B1.setVisibility(f9 > 0.0f ? 0 : 8);
        }
        boolean z10 = f9 > 0.0f;
        if (this.H4 == z10) {
            return;
        }
        de deVar = this.u1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) deVar.getLayoutParams();
        int i10 = z10 ? this.B1.getLayoutParams().height : 0;
        layoutParams.topMargin = i10;
        layoutParams.topMargin = AndroidUtilities.dp(9.0f) + i10;
        deVar.setLayoutParams(layoutParams);
        this.H4 = z10;
        setMinimumHeight(AndroidUtilities.dp(44.0f) + (z10 ? this.B1.getLayoutParams().height : 0));
        if (this.u3) {
            if (this.M1 == 0) {
                n1(false, true, false, true);
            } else {
                K();
            }
        }
    }

    public final boolean M0() {
        return this.R0 != null;
    }

    public final void M1() {
        int i02 = i0(org.telegram.ui.ActionBar.g6.jf);
        int i03 = i0(org.telegram.ui.ActionBar.g6.Sd);
        int i04 = i0(org.telegram.ui.ActionBar.g6.df);
        aj0 aj0Var = this.c1;
        if (aj0Var != null) {
            aj0Var.h(i02, "Cup Red");
            this.c1.h(i02, "Box Red");
            this.c1.h(i04, "Cup Grey");
            this.c1.h(i04, "Box Grey");
            this.c1.h(i03, "Line 1");
            this.c1.h(i03, "Line 2");
            this.c1.h(i03, "Line 3");
        }
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 0) {
            L();
            M();
        } else if (i10 == 1) {
            L();
            M();
        } else {
            if (i10 == 2) {
                jh.g5 g5Var = this.E0;
                g5Var.setAlpha(f9);
                g5Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, f9));
                g5Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, f9));
                g5Var.setVisibility(f9 <= 0.0f ? 4 : 0);
            } else if (i10 == 3) {
                float lerp = AndroidUtilities.lerp(1.0f, 0.79f, f9);
                de deVar = this.v1;
                deVar.setScaleX(lerp);
                deVar.setScaleY(AndroidUtilities.lerp(1.0f, 0.79f, f9));
                float lerp2 = AndroidUtilities.lerp(0.79f, 1.0f, f9);
                ImageView imageView = this.w1;
                imageView.setScaleX(lerp2);
                imageView.setScaleY(AndroidUtilities.lerp(0.79f, 1.0f, f9));
                imageView.setVisibility(f9 <= 0.0f ? 8 : 0);
                imageView.setAlpha(f9);
                re reVar = this.F0;
                if (reVar != null) {
                    reVar.setSameWidthFactor(f9);
                }
            }
        }
        invalidate();
    }

    public boolean N0() {
        return true;
    }

    public final void N1() {
        RichMessageLayout.PreviewView previewView = this.x1;
        if (previewView == null) {
            return;
        }
        boolean z10 = this.y1;
        boolean z11 = this.z1 != null && this.U1 == null;
        this.y1 = z11;
        re reVar = this.F0;
        ImageView imageView = this.N0;
        ge geVar = this.M0;
        if (z11) {
            previewView.setResourcesProvider(this.R3);
            this.x1.set(this.z1);
            this.x1.setVisibility(0);
            jf jfVar = this.A0;
            if (jfVar != null) {
                jfVar.setVisibility(8);
            }
            geVar.setVisibility(8);
            imageView.setVisibility(0);
            reVar.setLocked(!UserConfig.getInstance(this.M).isPremium());
        } else {
            previewView.setVisibility(8);
            jf jfVar2 = this.A0;
            if (jfVar2 != null) {
                jfVar2.setVisibility(0);
            }
            geVar.setVisibility(0);
            imageView.setVisibility(8);
            reVar.setLocked(false);
        }
        E1();
        if (z10 != this.y1) {
            J(true);
        }
    }

    public final void O() {
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar != null) {
            MediaDataController.getInstance(this.M).saveDraft(tnVar.a(), tnVar.B7(tnVar.j5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final void O0(int i10, int i11, CharSequence charSequence, boolean z10) {
        if (this.A0 == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A0.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
            }
            this.A0.setText(spannableStringBuilder);
            this.A0.setSelection(i10 + charSequence.length());
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void O1(boolean z10) {
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean isChatDialog = DialogObject.isChatDialog(this.L2);
        ImageView imageView = this.D1;
        if (isChatDialog) {
            TLRPC.Chat chat = this.N.getMessagesController().getChat(Long.valueOf(-this.L2));
            this.b2 = MessagesController.getNotificationsSettings(this.M).getBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + this.L2, false);
            z11 = ChatObject.isChannel(chat) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages)) && !chat.megagroup;
            this.c2 = z11;
            if (imageView != null) {
                if (this.a0 == null) {
                    this.a0 = new gr(getContext(), R.drawable.input_notify_on, org.telegram.ui.ActionBar.g6.Wk);
                }
                this.a0.a(this.b2, false);
                imageView.setImageDrawable(this.a0);
            } else {
                z11 = false;
            }
            bg.y3 y3Var = this.k1;
            if (y3Var != null) {
                H1(y3Var.getVisibility() == 0 ? 1 : 0);
            }
        } else {
            z11 = false;
        }
        boolean z12 = (this.U2 == null || c() || !this.U2.C0()) ? false : true;
        boolean z13 = (!z12 || this.G1 || this.A2) ? false : true;
        if (z13) {
            a0();
        }
        te teVar = this.E1;
        if (teVar != null) {
            if ((teVar.getTag() != null && z13) || (this.E1.getTag() == null && !z13)) {
                if (imageView != null) {
                    int i10 = (z12 || !z11 || this.E1.getVisibility() == 0) ? 8 : 0;
                    if (i10 != imageView.getVisibility()) {
                        imageView.setVisibility(i10);
                        return;
                    }
                    return;
                }
                return;
            }
            this.E1.setTag(z13 ? 1 : null);
        } else if (imageView != null) {
            int i11 = (z12 || !z11) ? 8 : 0;
            if (i11 != imageView.getVisibility()) {
                imageView.setVisibility(i11);
            }
        }
        AnimatorSet animatorSet = this.H1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.H1 = null;
        }
        if (z10 && !z11) {
            te teVar2 = this.E1;
            if (teVar2 != null) {
                if (z13) {
                    teVar2.setVisibility(0);
                }
                this.E1.setPivotX(AndroidUtilities.dp(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.H1 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.E1, (Property<te, Float>) View.ALPHA, z13 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.E1, (Property<te, Float>) View.SCALE_X, z13 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.E1, (Property<te, Float>) View.SCALE_Y, z13 ? 1.0f : 0.1f));
                this.H1.setDuration(180L);
                this.H1.addListener(new we(this, z13, 2));
                this.H1.start();
                return;
            }
            return;
        }
        te teVar3 = this.E1;
        if (teVar3 == null) {
            if (imageView != null) {
                imageView.setVisibility(z11 ? 0 : 8);
                return;
            }
            return;
        }
        teVar3.setVisibility(z13 ? 0 : 8);
        this.E1.setAlpha(z13 ? 1.0f : 0.0f);
        this.E1.setScaleX(z13 ? 1.0f : 0.1f);
        this.E1.setScaleY(z13 ? 1.0f : 0.1f);
        if (imageView != null) {
            imageView.setVisibility((!z11 || this.E1.getVisibility() == 0) ? 8 : 0);
        }
        this.E1.setTranslationX(0.0f);
    }

    public final void P() {
        AndroidUtilities.hideKeyboard(this.A0);
    }

    public final void P0() {
        n1(false, true, false, true);
        t1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.A2 = false;
        pe peVar = this.X0;
        if (peVar != null) {
            peVar.setVisibility(0);
        }
        this.f2 = true;
        x0();
        A();
        p0();
        lg lgVar = this.J1;
        if (lgVar != null) {
            lgVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }

    public void P1(boolean z10) {
        Q1(false, z10);
    }

    public final void Q() {
        if (this.s1 != null) {
            return;
        }
        ve veVar = new ve(this, getContext(), 1);
        this.s1 = veVar;
        ol0 ol0Var = new ol0(getContext());
        this.P1 = ol0Var;
        veVar.setImageDrawable(ol0Var);
        this.P1.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.g6.Wk), PorterDuff.Mode.MULTIPLY));
        this.P1.a(R.drawable.input_bot2, false);
        this.s1.setScaleType(ImageView.ScaleType.CENTER);
        this.s1.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(org.telegram.ui.ActionBar.g6.i6), 1, -1));
        this.s1.setVisibility(8);
        AndroidUtilities.updateViewVisibilityAnimated(this.s1, false, 0.1f, false);
        this.k1.addView(this.s1, 0, i7.f6.n(44, 44));
        this.s1.setOnClickListener(new nd(this, 15));
    }

    public final void Q0(TL_iv.RichMessage richMessage) {
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar != null) {
            MediaDataController.getInstance(this.M).saveDraft(tnVar.a(), tnVar.B7(tnVar.j5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void Q1(boolean z10, boolean z11) {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        float f9;
        float f10;
        qo0 qo0Var;
        qo0 qo0Var2;
        de deVar;
        if (this.U2 == null) {
            return;
        }
        W();
        if (this.g5) {
            peer = this.U2.q();
            chat = null;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.M).getChat(Long.valueOf(-this.L2));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.M).getChatFull(-this.L2);
            TLRPC.Peer peer2 = chatFull != null ? chatFull.default_send_as : null;
            chat = chat2;
            peer = peer2;
        }
        if (peer == null && this.U2.G() != null && !this.U2.G().peers.isEmpty()) {
            peer = this.U2.G().peers.get(0).peer;
        }
        org.telegram.ui.tn tnVar = this.K2;
        boolean z12 = (z10 || peer == null || (this.U2.G() != null && this.U2.G().peers.size() <= 1) || r0() || w0() || (((deVar = this.a1) != null && deVar.getVisibility() == 0) || ((!this.g5 && ((ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.canSendAsPeers(chat)) || ChatObject.isMonoForum(chat))) || (tnVar != null && tnVar.N3 == 9)))) ? false : true;
        if (z12) {
            b0();
        }
        if (peer != null) {
            if (peer.channel_id != 0) {
                TLRPC.Chat chat3 = MessagesController.getInstance(this.M).getChat(Long.valueOf(peer.channel_id));
                if (chat3 != null && (qo0Var2 = this.l0) != null) {
                    qo0Var2.setAvatar(chat3);
                    this.l0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, chat3.title));
                }
            } else {
                TLRPC.User user = MessagesController.getInstance(this.M).getUser(Long.valueOf(peer.user_id));
                if (user != null && (qo0Var = this.l0) != null) {
                    qo0Var.setAvatar(user);
                    this.l0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, ContactsController.formatName(user.first_name, user.last_name)));
                }
            }
        }
        qo0 qo0Var3 = this.l0;
        boolean z13 = qo0Var3 != null && qo0Var3.getVisibility() == 0;
        int dp = AndroidUtilities.dp(2.0f);
        float f11 = z12 ? 0.0f : 1.0f;
        float f12 = z12 ? 1.0f : 0.0f;
        qo0 qo0Var4 = this.l0;
        if (qo0Var4 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qo0Var4.getLayoutParams();
            f10 = z12 ? ((-this.l0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp : 0.0f;
            f9 = z12 ? 0.0f : ((-this.l0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
        } else {
            f9 = 0.0f;
            f10 = 0.0f;
        }
        if (z13 == z12) {
            return;
        }
        qo0 qo0Var5 = this.l0;
        ValueAnimator valueAnimator = qo0Var5 == null ? null : (ValueAnimator) qo0Var5.getTag();
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.l0.setTag(null);
        }
        if ((this.g5 || (tnVar != null && tnVar.F8() == 0 && tnVar.K5)) && z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            qo0 qo0Var6 = this.l0;
            if (qo0Var6 != null) {
                qo0Var6.setTranslationX(f10);
            }
            this.C = f10;
            J1();
            float f13 = f9;
            float f14 = f12;
            float f15 = f10;
            duration.addUpdateListener(new r5(this, f15, f13, f11, f14, 1));
            duration.addListener(new tf(this, z12, f11, f15, f14, f13));
            duration.start();
            qo0 qo0Var7 = this.l0;
            if (qo0Var7 != null) {
                qo0Var7.setTag(duration);
                return;
            }
            return;
        }
        float f16 = f9;
        float f17 = f12;
        boolean z14 = z12;
        if (z14) {
            b0();
        }
        qo0 qo0Var8 = this.l0;
        if (qo0Var8 != null) {
            qo0Var8.setVisibility(z14 ? 0 : 8);
            this.l0.setTranslationX(f16);
        }
        float f18 = z14 ? f16 : 0.0f;
        this.M0.setTranslationX(f18);
        this.C = f18;
        J1();
        qo0 qo0Var9 = this.l0;
        if (qo0Var9 != null) {
            qo0Var9.setAlpha(f17);
            this.l0.setTag(null);
        }
    }

    public final void R() {
        if (this.h0 != null) {
            return;
        }
        ph.z zVar = new ph.z(getContext());
        this.h0 = zVar;
        zVar.setOnClickListener(new nd(this, 7));
        this.t1.addView(this.h0, i7.f6.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
        AndroidUtilities.updateViewVisibilityAnimated(this.h0, false, 1.0f, false);
        ph.z zVar2 = this.h0;
        if (!zVar2.f) {
            zVar2.f = true;
            zVar2.h = 1.0f;
            zVar2.requestLayout();
            zVar2.invalidate();
        }
    }

    public final void R0(SpannableStringBuilder spannableStringBuilder, boolean z10, int i10, int i11) {
        if (this.A0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
        y5[] y5VarArr = (y5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), y5.class);
        if (y5VarArr != null) {
            for (y5 y5Var : y5VarArr) {
                y5Var.applyFontMetrics(this.A0.getPaint().getFontMetricsInt(), p5.g());
            }
        }
        qi0.a(spannableStringBuilder2);
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
        if (this.p4 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.p4 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            if (starsPrice > 0 || this.g5) {
                this.F0.i(1, starsPrice, true);
            }
            H1(this.K4);
        }
        if (this.g5) {
            S();
            if (t()) {
                int[] iArr = MessagesController.getInstance(this.M).starsGroupcallMessageLimits;
                b10 = (iArr == null || iArr.length <= 2) ? 400 : iArr[2];
            } else {
                b10 = lh.s.b(this.M, (int) starsPrice, 1);
            }
            if (this.V != b10) {
                this.V = b10;
                if (b10 > 0) {
                    int i10 = b10 - this.W;
                    if (i10 <= (this.g5 ? 5 : 100)) {
                        if (i10 < -9999) {
                            i10 = -9999;
                        }
                        S();
                        NumberTextView numberTextView = this.U;
                        numberTextView.a(i10, numberTextView.getVisibility() == 0);
                        if (this.U.getVisibility() != 0) {
                            this.U.setVisibility(0);
                            this.U.setAlpha(0.0f);
                            this.U.setScaleX(0.5f);
                            this.U.setScaleY(0.5f);
                        }
                        this.U.animate().setListener(null).cancel();
                        this.U.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        this.U.setTextColor(i0(i10 < 0 ? org.telegram.ui.ActionBar.g6.p7 : org.telegram.ui.ActionBar.g6.y6));
                        return;
                    }
                }
                NumberTextView numberTextView2 = this.U;
                if (numberTextView2 != null) {
                    numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new se(this, 0));
                }
            }
        }
    }

    public final void S() {
        if (this.U != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.U = numberTextView;
        numberTextView.setVisibility(8);
        this.U.setTextSize(15);
        this.U.setTextColor(i0(org.telegram.ui.ActionBar.g6.y6));
        this.U.setTypeface(AndroidUtilities.bold());
        this.U.setCenterAlign(true);
        addView(this.U, Math.min(2, getChildCount()), i7.f6.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public boolean S0() {
        boolean z10 = this.y1;
        org.telegram.ui.ActionBar.c6 c6Var = this.R3;
        if (z10 && !UserConfig.getInstance(this.M).isPremium()) {
            th.x1.p0(getContext(), new ld(this, 20), new ld(this, 21), c6Var);
            return true;
        }
        if (!c()) {
            return T0(0, true, 0, true, 0L);
        }
        c5.M(this.J2, this.K2.a(), new xe(this), c6Var);
        return true;
    }

    public final void S1() {
        int i10;
        boolean isUploadingMessageIdDialog;
        int currentTime = ConnectionsManager.getInstance(this.M).getCurrentTime();
        AndroidUtilities.cancelRunOnUIThread(this.D0);
        this.D0 = null;
        TLRPC.ChatFull chatFull = this.Y1;
        if (chatFull == null || chatFull.slowmode_seconds == 0 || chatFull.slowmode_next_send_date > currentTime || !((isUploadingMessageIdDialog = SendMessagesHelper.getInstance(this.M).isUploadingMessageIdDialog(this.L2)) || SendMessagesHelper.getInstance(this.M).isSendingMessageIdDialog(this.L2))) {
            int i11 = this.C0;
            if (i11 >= 2147483646) {
                if (this.Y1 != null) {
                    this.N.getMessagesController().loadFullChat(this.Y1.id, 0, true);
                }
                i10 = 0;
            } else {
                i10 = i11 - currentTime;
            }
        } else {
            if (!ChatObject.hasAdminRights(this.N.getMessagesController().getChat(Long.valueOf(this.Y1.id))) && !ChatObject.isIgnoredChatRestrictionsForBoosters(this.Y1)) {
                i10 = this.Y1.slowmode_seconds;
                this.C0 = isUploadingMessageIdDialog ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2147483646;
            }
            i10 = 0;
        }
        if (this.C0 == 0 || i10 <= 0) {
            this.C0 = 0;
        } else {
            String formatDurationNoHours = AndroidUtilities.formatDurationNoHours(Math.max(1, i10), false);
            pg pgVar = this.B0;
            pgVar.a.l(formatDurationNoHours, false);
            pgVar.invalidate();
            hg hgVar = this.U2;
            if (hgVar != null) {
                hgVar.t1(pgVar, pgVar.a.getText(), false);
            }
            ld ldVar = new ld(this, 9);
            this.D0 = ldVar;
            AndroidUtilities.runOnUIThread(ldVar, 100L);
        }
        if (c()) {
            return;
        }
        J(true);
    }

    public final void T(boolean z10) {
        if (this.A1 != null) {
            return;
        }
        re reVar = new re(this, getContext(), R.drawable.input_done, this.R3, 1);
        this.A1 = reVar;
        reVar.setContentDescription(LocaleController.getString(R.string.EditMessage));
        if (z10) {
            i7.h6.a(this.A1);
        }
        this.u1.addView(this.A1, i7.f6.e(44, 44, 85));
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
    public boolean T0(final int i10, final boolean z10, final int i11, boolean z11, long j10) {
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
        org.telegram.ui.tn tnVar;
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
        hg hgVar;
        TLRPC.Chat chat2;
        TL_iv.RichMessage richMessage;
        ChatActivityEnterView chatActivityEnterView4;
        xf xfVar;
        boolean z14 = z11 && !this.d5.f;
        if (z14) {
            boolean b02 = c5.b0(this.M, this.L2, getMessagesCount(), new Utilities.Callback() { // from class: org.telegram.ui.Components.zd
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    int i18 = ChatActivityEnterView.i5;
                    ChatActivityEnterView chatActivityEnterView5 = ChatActivityEnterView.this;
                    chatActivityEnterView5.getClass();
                    chatActivityEnterView5.T0(i10, z10, i11, false, ((Long) obj).longValue());
                }
            }, j10);
            if (b02 && this.n4) {
                if (this.Y0) {
                    if (!this.U2.i1()) {
                        SlideTextView slideTextView = this.f1;
                        if (slideTextView != null) {
                            slideTextView.setEnabled(false);
                        }
                        this.U2.n1();
                        return b02;
                    }
                } else if (!MediaController.getInstance().isRecordingPaused()) {
                    if (this.n4) {
                        this.E3 = true;
                    }
                    MediaController.getInstance().toggleRecordingPause(this.K);
                    this.U2.a1(0);
                    SlideTextView slideTextView2 = this.f1;
                    if (slideTextView2 != null) {
                        slideTextView2.setEnabled(false);
                    }
                }
            }
            return b02;
        }
        if (this.C0 != Integer.MAX_VALUE || c()) {
            org.telegram.ui.tn tnVar2 = this.K2;
            if (tnVar2 != null) {
                TLRPC.Chat chat3 = tnVar2.e;
                if (tnVar2.i() != null || ((ChatObject.isChannel(chat3) && chat3.megagroup) || !ChatObject.isChannel(chat3))) {
                    MessagesController.getNotificationsSettings(this.M).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + this.L2, !z10).commit();
                }
            }
            if (this.u3) {
                n1(false, true, false, true);
                if (this.M1 != 0 && (xfVar = this.Q0) != null) {
                    xfVar.t(false);
                    this.Q0.B();
                }
            }
            if (z14) {
                chatActivityEnterView = this;
                if (chatActivityEnterView.r1(new org.telegram.messenger.de(this, z10, i10, i11, j10))) {
                    chatActivityEnterView2 = chatActivityEnterView;
                }
            } else {
                chatActivityEnterView = this;
            }
            chatActivityEnterView.z4 = true;
            VideoEditedInfo videoEditedInfo = chatActivityEnterView.Z2;
            re reVar = chatActivityEnterView.F0;
            if (videoEditedInfo != null) {
                chatActivityEnterView.U2.l2(4, i10, chatActivityEnterView.K ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.N4, j10, z10);
                chatActivityEnterView.N4 = 0L;
                reVar.setEffect(0L);
                chatActivityEnterView.o0(true);
                chatActivityEnterView.J(true);
                AndroidUtilities.runOnUIThread(new ld(chatActivityEnterView, 2), 100L);
                chatActivityEnterView.e1 = 0L;
            } else if (chatActivityEnterView.W2 != null) {
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.Y2) {
                    MediaController.getInstance().cleanupPlayer(true, true);
                }
                MediaController.getInstance().cleanRecording(false);
                MediaDataController.getInstance(chatActivityEnterView.M).pushDraftVoiceMessage(chatActivityEnterView.L2, (tnVar2 == null || !tnVar2.d4) ? 0L : tnVar2.b(), null);
                gk0 gk0Var = chatActivityEnterView.d1;
                if (gk0Var != null && (gk0Var.s > 0.0f || gk0Var.v < 1.0f)) {
                    gk0Var.setPlaying(false);
                    String q6 = a4.w.q(new StringBuilder(), chatActivityEnterView.X2, ".ogg");
                    if (MediaController.cropOpusFile(chatActivityEnterView.X2, q6, chatActivityEnterView.d1.getAudioLeftMs(), chatActivityEnterView.d1.getAudioRightMs())) {
                        try {
                            new File(chatActivityEnterView.X2).delete();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        try {
                            new File(q6).renameTo(new File(chatActivityEnterView.X2));
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                        int i18 = 0;
                        while (true) {
                            if (i18 >= chatActivityEnterView.W2.attributes.size()) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = chatActivityEnterView.W2.attributes.get(i18);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                documentAttribute.waveform = MediaController.getWaveform(chatActivityEnterView.X2);
                                documentAttribute.duration = chatActivityEnterView.d1.getNewDuration();
                                break;
                            }
                            i18++;
                        }
                    }
                }
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(chatActivityEnterView.W2, null, chatActivityEnterView.X2, chatActivityEnterView.L2, chatActivityEnterView.O2, chatActivityEnterView.getThreadMessage(), null, null, null, null, z10, i10, 0, chatActivityEnterView.K ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, null, null, false);
                of2.sendMessageChatArguments = tnVar2 != null ? tnVar2.C8() : null;
                of2.effect_id = this.N4;
                of2.payStars = j10;
                of2.monoForumPeer = getSendMonoForumPeerId();
                of2.suggestionParams = getSendMessageSuggestionParams();
                this.N4 = 0L;
                reVar.setEffect(0L);
                if (!this.U2.w1()) {
                    MessageObject.SendAnimationData sendAnimationData2 = new MessageObject.SendAnimationData();
                    sendAnimationData2.fromPreview = System.currentTimeMillis() - this.I0 < 200;
                    of2.sendAnimationData = sendAnimationData2;
                }
                s(of2);
                SendMessagesHelper.getInstance(this.M).sendMessage(of2);
                hg hgVar2 = this.U2;
                if (hgVar2 != null) {
                    chatActivityEnterView4 = this;
                    hgVar2.D(null, z10, i10, i11, j10);
                } else {
                    chatActivityEnterView4 = this;
                }
                chatActivityEnterView4.o0(true);
                chatActivityEnterView4.J(true);
                AndroidUtilities.runOnUIThread(new ld(chatActivityEnterView4, 3), 100L);
                chatActivityEnterView4.e1 = 0L;
            } else {
                ChatActivityEnterView chatActivityEnterView5 = chatActivityEnterView;
                long j11 = 200;
                String str2 = "";
                if (!chatActivityEnterView5.y1 || (richMessage = chatActivityEnterView5.z1) == null) {
                    org.telegram.ui.tn tnVar3 = tnVar2;
                    re reVar2 = reVar;
                    chatActivityEnterView2 = chatActivityEnterView5;
                    int i19 = 1;
                    jf jfVar = chatActivityEnterView2.A0;
                    CharSequence textToUse = jfVar == null ? "" : jfVar.getTextToUse();
                    if (tnVar3 != null && (chat2 = tnVar3.e) != null && chat2.slowmode_enabled && !ChatObject.hasAdminRights(chat2)) {
                        int length = textToUse.length();
                        int maxMessageLength = chatActivityEnterView2.N.getMessagesController().getMaxMessageLength();
                        org.telegram.ui.ActionBar.c6 c6Var = chatActivityEnterView2.R3;
                        if (length > maxMessageLength) {
                            c5.u0(tnVar3, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSendErrorTooLong", R.string.SlowmodeSendErrorTooLong), c6Var);
                        } else if (chatActivityEnterView2.C2 && textToUse.length() > 0) {
                            c5.u0(tnVar3, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSendError", R.string.SlowmodeSendError), c6Var);
                        }
                    }
                    if (!H(chatActivityEnterView2.M, chatActivityEnterView2.L2, tnVar3, textToUse)) {
                        org.telegram.ui.jn jnVar = chatActivityEnterView2.Q2;
                        if (jnVar == null || tnVar3 == null || !jnVar.f) {
                            int[] iArr = new int[1];
                            Emoji.parseEmojis(textToUse, iArr);
                            char c3 = 0;
                            boolean z15 = iArr[0] > 0;
                            CharSequence trimmedString = !z15 ? AndroidUtilities.getTrimmedString(textToUse) : textToUse;
                            boolean y12 = chatActivityEnterView2.y1();
                            int maxMessageLength2 = chatActivityEnterView2.N.getMessagesController().getMaxMessageLength();
                            if (trimmedString.length() != 0) {
                                if (chatActivityEnterView2.U2 != null && tnVar3 != null) {
                                    if ((i10 != 0) == tnVar3.c()) {
                                        chatActivityEnterView2.U2.G0();
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
                                    charSequenceArr[c3] = subSequence;
                                    ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(chatActivityEnterView2.M).getEntities(charSequenceArr, y12);
                                    if (chatActivityEnterView2.U2.w1()) {
                                        charSequence = trimmedString;
                                        if (chatActivityEnterView2.H0 != null) {
                                            sendAnimationData = new MessageObject.SendAnimationData();
                                            charSequence2 = textToUse;
                                            i16 = min;
                                            sendAnimationData.fromPreview = System.currentTimeMillis() - chatActivityEnterView2.I0 < j11;
                                        } else {
                                            charSequence2 = textToUse;
                                            i16 = min;
                                            charSequence3 = charSequence;
                                            sendAnimationData = null;
                                            boolean checkUpdateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(charSequence3);
                                            threadMessage = chatActivityEnterView2.getThreadMessage();
                                            if (threadMessage == null && (messageObject = chatActivityEnterView2.P2) != null) {
                                                threadMessage = messageObject;
                                            }
                                            str = str2;
                                            re reVar3 = reVar2;
                                            i17 = i16;
                                            charSequence4 = charSequence2;
                                            boolean z16 = y12;
                                            charSequence5 = charSequence3;
                                            tnVar = tnVar3;
                                            SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(charSequenceArr[c3].toString(), chatActivityEnterView2.L2, chatActivityEnterView2.O2, threadMessage, chatActivityEnterView2.S2, chatActivityEnterView2.T2, entities, null, null, z10, i10, i11, sendAnimationData, checkUpdateStickersOrder);
                                            of3.sendMessageChatArguments = tnVar == null ? tnVar.C8() : null;
                                            of3.effect_id = this.N4;
                                            of3.payStars = j10;
                                            of3.monoForumPeer = getSendMonoForumPeerId();
                                            of3.suggestionParams = getSendMessageSuggestionParams();
                                            this.N4 = 0L;
                                            reVar3.setEffect(0L);
                                            s(of3);
                                            of3.invert_media = tnVar == null && (messagePreviewParams3 = tnVar.b5) != null && messagePreviewParams3.webpageTop;
                                            if (tnVar != null || (chat = tnVar.e) == null || ChatObject.canSendEmbed(chat)) {
                                                r32 = 0;
                                                r32 = 0;
                                                r32 = 0;
                                                z12 = false;
                                                webPage = this.S2;
                                                if (webPage instanceof TLRPC.TL_webPagePending) {
                                                    z13 = true;
                                                    if (webPage != null) {
                                                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                                                        of3.mediaWebPage = tL_messageMediaWebPage;
                                                        tL_messageMediaWebPage.webpage = this.S2;
                                                        tL_messageMediaWebPage.force_large_media = (tnVar == null || (messagePreviewParams2 = tnVar.b5) == null || messagePreviewParams2.webpageSmall) ? false : true;
                                                        tL_messageMediaWebPage.force_small_media = (tnVar == null || (messagePreviewParams = tnVar.b5) == null || !messagePreviewParams.webpageSmall) ? false : true;
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
                                            if (tnVar != null) {
                                                tnVar.l5 = r32;
                                                tnVar.C5 = r32;
                                                MessagePreviewParams messagePreviewParams4 = tnVar.b5;
                                                if (messagePreviewParams4 != null) {
                                                    messagePreviewParams4.updateLink(this.M, null, "", null, null, null);
                                                }
                                                this.S2 = r32;
                                                this.T2 = z13;
                                                tnVar.j8();
                                            }
                                            SendMessagesHelper.getInstance(this.M).sendMessage(of3);
                                            i20 = i17 + 1;
                                            if (i17 != charSequence5.length()) {
                                                break;
                                            }
                                            chatActivityEnterView2 = this;
                                            reVar2 = reVar3;
                                            tnVar3 = tnVar;
                                            textToUse = charSequence4;
                                            y12 = z16;
                                            trimmedString = charSequence5;
                                            str2 = str;
                                            i19 = 1;
                                            j11 = 200;
                                            c3 = 0;
                                        }
                                    } else {
                                        MessageObject.SendAnimationData sendAnimationData3 = new MessageObject.SendAnimationData();
                                        charSequence = trimmedString;
                                        sendAnimationData3.fromPreview = System.currentTimeMillis() - chatActivityEnterView2.I0 < j11;
                                        float dp = AndroidUtilities.dp(22.0f);
                                        sendAnimationData3.height = dp;
                                        sendAnimationData3.width = dp;
                                        jf jfVar2 = chatActivityEnterView2.A0;
                                        if (jfVar2 != null) {
                                            jfVar2.getLocationInWindow(chatActivityEnterView2.I2);
                                            sendAnimationData3.x = AndroidUtilities.dp(11.0f) + r12[c3];
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
                                    re reVar32 = reVar2;
                                    i17 = i16;
                                    charSequence4 = charSequence2;
                                    boolean z162 = y12;
                                    charSequence5 = charSequence3;
                                    tnVar = tnVar3;
                                    SendMessagesHelper.SendMessageParams of32 = SendMessagesHelper.SendMessageParams.of(charSequenceArr[c3].toString(), chatActivityEnterView2.L2, chatActivityEnterView2.O2, threadMessage, chatActivityEnterView2.S2, chatActivityEnterView2.T2, entities, null, null, z10, i10, i11, sendAnimationData, checkUpdateStickersOrder2);
                                    of32.sendMessageChatArguments = tnVar == null ? tnVar.C8() : null;
                                    of32.effect_id = this.N4;
                                    of32.payStars = j10;
                                    of32.monoForumPeer = getSendMonoForumPeerId();
                                    of32.suggestionParams = getSendMessageSuggestionParams();
                                    this.N4 = 0L;
                                    reVar32.setEffect(0L);
                                    s(of32);
                                    of32.invert_media = tnVar == null && (messagePreviewParams3 = tnVar.b5) != null && messagePreviewParams3.webpageTop;
                                    if (tnVar != null) {
                                    }
                                    r32 = 0;
                                    r32 = 0;
                                    r32 = 0;
                                    z12 = false;
                                    webPage = this.S2;
                                    if (webPage instanceof TLRPC.TL_webPagePending) {
                                    }
                                    if (tnVar != null) {
                                    }
                                    SendMessagesHelper.getInstance(this.M).sendMessage(of32);
                                    i20 = i17 + 1;
                                    if (i17 != charSequence5.length()) {
                                    }
                                }
                                if (this.U2.w1() || (!(i10 == 0 || c()) || c())) {
                                    chatActivityEnterView3 = this;
                                    jf jfVar3 = chatActivityEnterView3.A0;
                                    if (jfVar3 != null) {
                                        jfVar3.setText(str);
                                    }
                                    hg hgVar3 = chatActivityEnterView3.U2;
                                    if (hgVar3 != null) {
                                        hgVar3.D(charSequence4, z10, i10, i11, j10);
                                    }
                                } else {
                                    this.c0 = z12;
                                    org.telegram.messenger.sf sfVar = new org.telegram.messenger.sf(this, charSequence4, z10, i10, i11, j10);
                                    chatActivityEnterView3 = this;
                                    chatActivityEnterView3.b0 = sfVar;
                                    AndroidUtilities.runOnUIThread(sfVar, 200L);
                                }
                                chatActivityEnterView3.x2 = 0L;
                                chatActivityEnterView3.R1();
                                return z12;
                            }
                        } else {
                            tnVar3.Rb();
                        }
                        chatActivityEnterView3 = chatActivityEnterView2;
                        z12 = false;
                        if (chatActivityEnterView3.C2 && (hgVar = chatActivityEnterView3.U2) != null) {
                            hgVar.D(null, z10, i10, i11, j10);
                        }
                        chatActivityEnterView3.R1();
                        return z12;
                    }
                } else {
                    SendMessagesHelper.prepareSendingArticle(chatActivityEnterView5.N, richMessage.blocks, richMessage.photos, richMessage.documents, null, false, chatActivityEnterView5.L2, chatActivityEnterView5.O2, chatActivityEnterView5.getThreadMessage(), z10, i10, i11, tnVar2 != null ? tnVar2.C8() : null, chatActivityEnterView5.N4, chatActivityEnterView5.getSendMonoForumPeerId(), j10);
                    chatActivityEnterView2 = this;
                    chatActivityEnterView2.N4 = 0L;
                    reVar.setEffect(0L);
                    chatActivityEnterView2.A0.setText("");
                    chatActivityEnterView2.O();
                    hg hgVar4 = chatActivityEnterView2.U2;
                    if (hgVar4 != null) {
                        hgVar4.D(null, z10, i10, i11, j10);
                    }
                    chatActivityEnterView2.J(true);
                }
            }
        } else {
            hg hgVar5 = this.U2;
            if (hgVar5 != null) {
                hgVar5.T0();
            } else {
                chatActivityEnterView2 = this;
            }
        }
        return false;
    }

    public final void U() {
        xf xfVar = this.Q0;
        if (xfVar != null && xfVar.Y0 != UserConfig.selectedAccount) {
            this.i1.removeView(xfVar);
            this.Q0 = null;
        }
        if (this.Q0 != null) {
            return;
        }
        xf xfVar2 = new xf(this, this.K2, this.D2, getContext(), this.Y1, this.h1, this.t4, this.R3, this.P0, this.Y4 != null);
        this.Q0 = xfVar2;
        xfVar2.r0 = true;
        if (!this.t4) {
            xfVar2.U();
        }
        this.Q0.J(true, this.E2, this.F2, true);
        this.Q0.setVisibility(8);
        this.Q0.setShowing(false);
        if (this.Y4 != null) {
            xf xfVar3 = this.Q0;
            xfVar3.s0 = false;
            xfVar3.setShouldDrawBackground(false);
            this.Q0.R0 = true;
        }
        this.Q0.setDelegate(new ag(this));
        this.Q0.setDragListener(new m.a(this));
        xf xfVar4 = this.Q0;
        if (xfVar4 != null) {
            xfVar4.L(-this.L2, !this.v0, !this.b);
        }
        u();
        E();
    }

    public final void U0(boolean z10, boolean z11) {
        V0(z10, z11, false);
    }

    public final void V() {
        if (this.O0 != null) {
            return;
        }
        ve veVar = new ve(this, getContext(), 2);
        this.O0 = veVar;
        veVar.setScaleType(ImageView.ScaleType.CENTER);
        ve veVar2 = this.O0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(i0(org.telegram.ui.ActionBar.g6.Wk), false);
        this.A3 = animatedArrowDrawable;
        veVar2.setImageDrawable(animatedArrowDrawable);
        this.O0.setVisibility(8);
        this.O0.setScaleX(0.1f);
        this.O0.setScaleY(0.1f);
        this.O0.setAlpha(0.0f);
        this.O0.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(org.telegram.ui.ActionBar.g6.i6), 1, -1));
        this.v1.addView(this.O0, i7.f6.e(44, 44, 85));
        this.O0.setOnClickListener(new nd(this, 5));
        this.O0.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
    }

    public final void V0(boolean z10, boolean z11, boolean z12) {
        if ((this.E2 != z10 || this.F2 != z11) && this.Q0 != null) {
            if (this.S0 && !z12) {
                this.B3 = true;
                m0(false);
            } else if (z12) {
                I0();
            }
        }
        this.D2 = true;
        this.E2 = z10;
        this.F2 = z11;
        xf xfVar = this.Q0;
        if (xfVar != null) {
            xfVar.J(true, z10, z11, true);
        }
        d1(false, !this.e2);
    }

    public final void W() {
        if (this.A0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.c6 c6Var = this.R3;
        jf jfVar = new jf(this, context, c6Var);
        this.A0 = jfVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            jfVar.setFallbackLineSpacing(false);
        }
        if (i10 >= 35) {
            this.A0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.A0.setDelegate(new td(this));
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar == null || tnVar.getParentLayout() == null || !((ActionBarLayout) tnVar.getParentLayout()).b) {
            this.A0.setWindowView(this.J2.getWindow().getDecorView());
        } else {
            this.A0.setWindowView(tnVar.getParentLayout().getWindow().getDecorView());
        }
        TLRPC.EncryptedChat encryptedChat = tnVar != null ? tnVar.h : null;
        this.A0.setAllowTextEntitiesIntersection(y1());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        int i11 = ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) ? 285212672 : TLObject.FLAG_28;
        this.A0.setIncludeFontPadding(false);
        this.A0.setImeOptions(i11);
        jf jfVar2 = this.A0;
        int inputType = jfVar2.getInputType() | 147456;
        this.a = inputType;
        jfVar2.setInputType(inputType);
        G1(false);
        this.A0.setSingleLine(false);
        this.A0.setMaxLines(6);
        this.A0.setTextSize(1, 18.0f);
        this.A0.setGravity(80);
        this.A0.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(10.0f));
        this.A0.setBackgroundDrawable(null);
        this.A0.setTextColor(i0(org.telegram.ui.ActionBar.g6.Ud));
        this.A0.setLinkTextColor(i0(org.telegram.ui.ActionBar.g6.hc));
        this.A0.setHighlightColor(i0(org.telegram.ui.ActionBar.g6.uf));
        jf jfVar3 = this.A0;
        int i12 = org.telegram.ui.ActionBar.g6.Vd;
        jfVar3.setHintColor(i0(i12));
        this.A0.setHintTextColor(i0(i12));
        this.A0.setCursorColor(i0(org.telegram.ui.ActionBar.g6.Wd));
        this.A0.setHandlesColor(i0(org.telegram.ui.ActionBar.g6.vf));
        jf jfVar4 = this.A0;
        boolean z10 = this.S3;
        FrameLayout.LayoutParams d = i7.f6.d(-1, -2.0f, 80, 52.0f, 0.0f, z10 ? 50.0f : 2.0f, 1.5f);
        fe feVar = this.t1;
        feVar.addView(jfVar4, 1, d);
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(getContext(), this.M, c6Var);
        this.x1 = previewView;
        previewView.setAllowActions(false);
        this.x1.setMaxHeight(AndroidUtilities.dp(150.0f));
        this.x1.setMinHeight(AndroidUtilities.dp(88.0f));
        this.x1.setVisibility(8);
        this.x1.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
        this.x1.setOnClickListener(new nd(this, 10));
        feVar.addView(this.x1, 2, i7.f6.d(-1, -2.0f, 80, 44.0f, 0.0f, (z10 ? 50 : 2) - 8, 1.5f));
        this.A0.setOnKeyListener(new kf(this));
        this.A0.setOnEditorActionListener(new m.u2(this, 3));
        this.A0.addTextChangedListener(new lf(this));
        this.A0.addTextChangedListener(new org.telegram.ui.Cells.f3());
        this.A0.setEnabled(this.D4);
        ArrayList arrayList = this.C4;
        if (arrayList != null) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                this.A0.addTextChangedListener((TextWatcher) obj);
            }
            this.C4.clear();
        }
        G1(false);
        P1(tnVar != null && tnVar.getFragmentBeginToShow());
        if (tnVar != null) {
            tnVar.A6(false, false);
        }
        H1(this.K4);
    }

    public final void W0() {
        nh.t3 t3Var = this.H;
        if (t3Var == null) {
            return;
        }
        t3Var.t(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBirthdayHint, UserObject.getFirstName(this.K2.i()))), this.H.getTextPaint().getFontMetricsInt(), new ld(this, 26)));
        nh.t3 t3Var2 = this.H;
        t3Var2.h = nh.t3.a(t3Var2.getText(), this.H.getTextPaint());
    }

    public final void X() {
        if (this.a1 != null) {
            return;
        }
        de deVar = new de(this, getContext(), 2);
        this.a1 = deVar;
        deVar.setVisibility(this.W2 == null ? 8 : 0);
        this.a1.setFocusable(true);
        this.a1.setFocusableInTouchMode(true);
        this.a1.setClickable(true);
        this.t1.addView(this.a1, i7.f6.e(-1, 44, 80));
        aj0 aj0Var = new aj0(getContext());
        this.c1 = aj0Var;
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        this.c1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.c1.getAnimatedDrawable().l0 = true;
        M1();
        this.c1.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        this.c1.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(i0(org.telegram.ui.ActionBar.g6.i6), 1, -1));
        this.a1.addView(this.c1, i7.f6.c(44.0f, 44));
        this.c1.setOnClickListener(new nd(this, 6));
        l71 l71Var = new l71(getContext());
        this.b1 = l71Var;
        l71Var.setVisibility(4);
        l71 l71Var2 = this.b1;
        l71Var2.O = !this.t4;
        l71Var2.setRoundFrames(true);
        this.b1.setDelegate(new xe(this));
        this.a1.addView(this.b1, i7.f6.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        j71 j71Var = new j71(context);
        TextPaint textPaint = new TextPaint(1);
        j71Var.d = textPaint;
        j71Var.e = -1L;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        j71Var.b = context.getDrawable(R.drawable.tooltip_arrow);
        j71Var.a = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.qf, false));
        j71Var.b();
        j71Var.setTime(0);
        this.b1.setTimeHintView(j71Var);
        this.h1.addView(j71Var, i7.f6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        gk0 gk0Var = new gk0(getContext(), this.R3);
        this.d1 = gk0Var;
        this.a1.addView(gk0Var, i7.f6.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        H1(this.K4);
    }

    public final void X0(a0.h hVar, boolean z10) {
        this.S4 = hVar;
        if (hVar.m() == 1 && ((TL_bots.BotInfo) hVar.n(0)).user_id == this.L2) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.e0 = tL_botMenuButton.text;
                this.f0 = tL_botMenuButton.url;
                this.h5 = 3;
            } else if (botInfo.commands.isEmpty()) {
                this.h5 = 1;
            } else {
                this.h5 = 2;
            }
        } else {
            this.h5 = 1;
        }
        ph.y yVar = this.j0;
        if (yVar != null) {
            yVar.E(hVar);
        }
        B1(z10);
        F(z10);
    }

    public final void Y() {
        lg lgVar = this.J1;
        hv0 hv0Var = this.h1;
        if (lgVar == null) {
            lg lgVar2 = new lg(this, getContext());
            this.J1 = lgVar2;
            lgVar2.setVisibility(8);
            hv0Var.addView(this.J1, i7.f6.e(-1, -2, 80));
        }
        if (this.I1 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.I1 = recordCircle;
        recordCircle.setVisibility(8);
        hv0Var.addView(this.I1, i7.f6.e(-1, -2, 80));
    }

    public final void Y0(int i10, boolean z10, boolean z11) {
        this.j2 = i10;
        if (this.k2 == z10) {
            return;
        }
        this.k2 = z10;
        B1(z11);
    }

    public final void Z() {
        if (this.Z0 != null || getContext() == null) {
            return;
        }
        bh.d dVar = new bh.d(getContext(), 15);
        this.Z0 = dVar;
        dVar.setClipChildren(false);
        this.Z0.setVisibility(8);
        this.t1.addView(this.Z0, i7.f6.c(44.0f, -1));
        this.Z0.setOnTouchListener(new mh.d(12));
        bh.d dVar2 = this.Z0;
        SlideTextView slideTextView = new SlideTextView(getContext());
        this.f1 = slideTextView;
        dVar2.addView(slideTextView, i7.f6.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        this.d.setPadding(AndroidUtilities.dp(13.0f), 0, 0, 0);
        this.d.setFocusable(false);
        LinearLayout linearLayout2 = this.d;
        ng ngVar = new ng(this, getContext());
        this.g1 = ngVar;
        linearLayout2.addView(ngVar, i7.f6.t(28, 28, 16, 0, 0, 0, 0));
        LinearLayout linearLayout3 = this.d;
        qg qgVar = new qg(this, getContext());
        this.U0 = qgVar;
        linearLayout3.addView(qgVar, i7.f6.t(-1, -1, 16, 6, 0, 0, 0));
        this.Z0.addView(this.d, i7.f6.e(-1, -1, 16));
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
        jf jfVar;
        MessageObject messageObject2 = this.O2;
        if (messageObject2 != null && messageObject2 == this.h2 && messageObject2 != messageObject) {
            this.R2 = messageObject;
            return;
        }
        MessageObject messageObject3 = this.h2;
        if (messageObject3 == null || messageObject3 != messageObject) {
            if (messageObject3 == null && messageObject == null) {
                return;
            }
            if (this.C1 == null) {
                uf ufVar = new uf(this, this.J2, this.R3);
                this.C1 = ufVar;
                ufVar.setVisibility(8);
                this.T0 = false;
                this.C1.setDelegate(new td(this));
                this.i1.addView(this.C1);
            }
            this.h2 = messageObject;
            if (messageObject != null) {
                TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyKeyboardMarkup) {
                    tL_replyKeyboardMarkup = (TLRPC.TL_replyKeyboardMarkup) replyMarkup;
                    this.i2 = tL_replyKeyboardMarkup;
                    uf ufVar2 = this.C1;
                    Point point = AndroidUtilities.displaySize;
                    ufVar2.setPanelHeight(point.x <= point.y ? this.t2 : this.s2);
                    if (this.i2 == null) {
                        SharedPreferences mainSettings = MessagesController.getMainSettings(this.M);
                        if (this.h2 != this.O2 && messageObject != null) {
                            if (this.i2.single_use) {
                            }
                            if (!this.i2.is_persistent) {
                            }
                        }
                        boolean z12 = true;
                        boolean z13 = z10 ? z12 : false;
                        this.C1.setButtons(this.i2);
                        if (z13 && (((jfVar = this.A0) == null || jfVar.length() == 0) && !t0())) {
                            t1(1, 1, true, true);
                        }
                    } else if (t0() && this.a2 == 1) {
                        if (z11) {
                            this.k3 = true;
                            I0();
                        } else {
                            t1(0, 1, true, true);
                        }
                    }
                    B1(true);
                }
            }
            tL_replyKeyboardMarkup = null;
            this.i2 = tL_replyKeyboardMarkup;
            uf ufVar22 = this.C1;
            Point point2 = AndroidUtilities.displaySize;
            ufVar22.setPanelHeight(point2.x <= point2.y ? this.t2 : this.s2);
            if (this.i2 == null) {
            }
            B1(true);
        }
    }

    @Override // org.telegram.ui.Components.kx0
    public final void a(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        if (this.g5) {
            return;
        }
        org.telegram.ui.jn jnVar = this.Q2;
        org.telegram.ui.tn tnVar = this.K2;
        if (jnVar != null && tnVar != null && jnVar.f) {
            tnVar.Rb();
            return;
        }
        if (!c() || i10 != 0) {
            c5.a0(this.M, 1, this.L2, new yd(this, document, str, sendAnimationData, z11, i10, i11, obj, z10));
            return;
        }
        c5.M(this.J2, tnVar.a(), new org.telegram.messenger.jj(this, document, str, obj, sendAnimationData, z10), this.R3);
    }

    public final void a0() {
        if (this.E1 != null || this.K2 == null) {
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
        int i02 = i0(org.telegram.ui.ActionBar.g6.Wk);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i02, mode));
        mutate2.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.g6.jf), mode));
        jq jqVar = new jq(mutate, mutate2);
        te teVar = new te(this, getContext());
        this.E1 = teVar;
        teVar.setImageDrawable(jqVar);
        this.E1.setVisibility(8);
        this.E1.setContentDescription(LocaleController.getString(R.string.ScheduledMessages));
        this.E1.setScaleType(ImageView.ScaleType.CENTER);
        this.E1.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(org.telegram.ui.ActionBar.g6.i6), 1, -1));
        this.t1.addView(this.E1, 2, i7.f6.e(44, 44, 85));
        this.E1.setOnClickListener(new nd(this, 2));
        this.E1.setTranslationX(0.0f);
    }

    public final void a1(MessageObject messageObject, String str, boolean z10, boolean z11) {
        jf jfVar;
        SendMessagesHelper.SendMessageParams of2;
        String sb2;
        if (str == null || getVisibility() != 0 || (jfVar = this.A0) == null) {
            return;
        }
        r16 = null;
        TLRPC.User user = null;
        if (!z10) {
            if (this.C0 > 0 && !c()) {
                hg hgVar = this.U2;
                if (hgVar != null) {
                    pg pgVar = this.B0;
                    hgVar.t1(pgVar, pgVar.a.getText(), true);
                    return;
                }
                return;
            }
            TLRPC.User user2 = (messageObject == null || !DialogObject.isChatDialog(this.L2)) ? null : this.N.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
            if ((this.j2 != 1 || z11) && user2 != null && user2.bot && !str.contains("@")) {
                Locale locale = Locale.US;
                of2 = SendMessagesHelper.SendMessageParams.of(a4.w.y(str, "@", UserObject.getPublicUsername(user2)), this.L2, this.O2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            } else {
                of2 = SendMessagesHelper.SendMessageParams.of(str, this.L2, this.O2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            }
            org.telegram.ui.tn tnVar = this.K2;
            of2.sendMessageChatArguments = tnVar != null ? tnVar.C8() : null;
            of2.effect_id = this.N4;
            this.N4 = 0L;
            this.F0.setEffect(0L);
            s(of2);
            SendMessagesHelper.getInstance(this.M).sendMessage(of2);
            return;
        }
        String obj = jfVar.getText().toString();
        if (messageObject != null && DialogObject.isChatDialog(this.L2)) {
            user = this.N.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
        }
        TLRPC.User user3 = user;
        if ((this.j2 != 1 || z11) && user3 != null && user3.bot && !str.contains("@")) {
            StringBuilder sb3 = new StringBuilder();
            Locale locale2 = Locale.US;
            sb3.append(str + "@" + UserObject.getPublicUsername(user3));
            sb3.append(" ");
            sb3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            sb2 = sb3.toString();
        } else {
            StringBuilder f9 = u3.c.f(str, " ");
            f9.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            sb2 = f9.toString();
        }
        this.M2 = true;
        this.A0.setText(sb2);
        jf jfVar2 = this.A0;
        jfVar2.setSelection(jfVar2.getText().length());
        this.M2 = false;
        hg hgVar2 = this.U2;
        if (hgVar2 != null) {
            hgVar2.l1(this.A0.getText(), true, false);
        }
        if (this.u2 || this.a2 != -1) {
            return;
        }
        H0();
    }

    @Override // org.telegram.ui.Components.kx0
    public final boolean b() {
        org.telegram.ui.tn tnVar = this.K2;
        return tnVar != null && tnVar.D6();
    }

    public final void b0() {
        if (this.l0 != null || getContext() == null) {
            return;
        }
        qo0 qo0Var = new qo0(getContext());
        ImageReceiver imageReceiver = new ImageReceiver(qo0Var);
        qo0Var.a = imageReceiver;
        qo0Var.b = new e9((org.telegram.ui.ActionBar.c6) null);
        Paint paint = new Paint(1);
        qo0Var.d = paint;
        Paint paint2 = new Paint(1);
        qo0Var.e = paint2;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.cf, false));
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.bf, false));
        int dp = AndroidUtilities.dp(18.0f);
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.2f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, 0, l1, l1);
        qo0Var.c = i02;
        i02.setCallback(qo0Var);
        qo0Var.setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, ""));
        this.l0 = qo0Var;
        qo0Var.setOnClickListener(new nd(this, 16));
        this.l0.setVisibility(8);
        this.t1.addView(this.l0, i7.f6.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
    }

    public final void b1(int i10, long j10) {
        this.L2 = j10;
        if (this.M != i10) {
            this.G3.unlock();
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.M);
            int i11 = NotificationCenter.recordStarted;
            notificationCenter.removeObserver(this, i11);
            NotificationCenter notificationCenter2 = NotificationCenter.getInstance(this.M);
            int i12 = NotificationCenter.recordPaused;
            notificationCenter2.removeObserver(this, i12);
            NotificationCenter notificationCenter3 = NotificationCenter.getInstance(this.M);
            int i13 = NotificationCenter.recordResumed;
            notificationCenter3.removeObserver(this, i13);
            NotificationCenter notificationCenter4 = NotificationCenter.getInstance(this.M);
            int i14 = NotificationCenter.recordStartError;
            notificationCenter4.removeObserver(this, i14);
            NotificationCenter notificationCenter5 = NotificationCenter.getInstance(this.M);
            int i15 = NotificationCenter.recordStopped;
            notificationCenter5.removeObserver(this, i15);
            NotificationCenter notificationCenter6 = NotificationCenter.getInstance(this.M);
            int i16 = NotificationCenter.recordProgressChanged;
            notificationCenter6.removeObserver(this, i16);
            NotificationCenter notificationCenter7 = NotificationCenter.getInstance(this.M);
            int i17 = NotificationCenter.closeChats;
            notificationCenter7.removeObserver(this, i17);
            NotificationCenter notificationCenter8 = NotificationCenter.getInstance(this.M);
            int i18 = NotificationCenter.audioDidSent;
            notificationCenter8.removeObserver(this, i18);
            NotificationCenter notificationCenter9 = NotificationCenter.getInstance(this.M);
            int i19 = NotificationCenter.audioRouteChanged;
            notificationCenter9.removeObserver(this, i19);
            NotificationCenter notificationCenter10 = NotificationCenter.getInstance(this.M);
            int i20 = NotificationCenter.messagePlayingProgressDidChanged;
            notificationCenter10.removeObserver(this, i20);
            NotificationCenter notificationCenter11 = NotificationCenter.getInstance(this.M);
            int i21 = NotificationCenter.featuredStickersDidLoad;
            notificationCenter11.removeObserver(this, i21);
            NotificationCenter notificationCenter12 = NotificationCenter.getInstance(this.M);
            int i22 = NotificationCenter.messageReceivedByServer2;
            notificationCenter12.removeObserver(this, i22);
            NotificationCenter notificationCenter13 = NotificationCenter.getInstance(this.M);
            int i23 = NotificationCenter.sendingMessagesChanged;
            notificationCenter13.removeObserver(this, i23);
            this.M = i10;
            this.N = AccountInstance.getInstance(i10);
            NotificationCenter.getInstance(this.M).addObserver(this, i11);
            NotificationCenter.getInstance(this.M).addObserver(this, i12);
            NotificationCenter.getInstance(this.M).addObserver(this, i13);
            NotificationCenter.getInstance(this.M).addObserver(this, i14);
            NotificationCenter.getInstance(this.M).addObserver(this, i15);
            NotificationCenter.getInstance(this.M).addObserver(this, i16);
            NotificationCenter.getInstance(this.M).addObserver(this, i17);
            NotificationCenter.getInstance(this.M).addObserver(this, i18);
            NotificationCenter.getInstance(this.M).addObserver(this, i19);
            NotificationCenter.getInstance(this.M).addObserver(this, i20);
            NotificationCenter.getInstance(this.M).addObserver(this, i21);
            NotificationCenter.getInstance(this.M).addObserver(this, i22);
            NotificationCenter.getInstance(this.M).addObserver(this, i23);
        }
        this.v0 = true;
        if (DialogObject.isChatDialog(this.L2)) {
            this.v0 = ChatObject.canSendPlain(this.N.getMessagesController().getChat(Long.valueOf(-this.L2)));
        }
        O1(false);
        I1(false);
        I();
        E();
        G1(false);
        if (this.A0 != null) {
            org.telegram.ui.tn tnVar = this.K2;
            P1(tnVar != null && tnVar.getFragmentBeginToShow());
        }
    }

    @Override // org.telegram.ui.Components.kx0
    public final boolean c() {
        org.telegram.ui.tn tnVar = this.K2;
        return tnVar != null && tnVar.c();
    }

    public final boolean c0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject, MessageObject messageObject2, org.telegram.ui.qi qiVar) {
        org.telegram.ui.tn tnVar;
        int i10;
        int i11 = 0;
        if (keyboardButtonProto != null && messageObject2 != null && ((tnVar = this.K2) == null || tnVar.N3 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) kf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) kf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) kf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) kf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) kf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                AndroidUtilities.addToClipboard(tL_inlineButtonTypeCopy.copy_text);
                tc.a0(tnVar).i(LocaleController.formatString(R.string.ExactTextCopied, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_keyboardButton.text, this.L2, messageObject, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = tnVar != null ? tnVar.C8() : null;
                    of2.effect_id = this.N4;
                    this.N4 = 0L;
                    this.F0.setEffect(0L);
                    SendMessagesHelper.getInstance(this.M).sendMessage(of2);
                    return true;
                }
            }
            Activity activity = this.J2;
            if (tL_inlineButtonTypeUrl != null) {
                if (ye.d.y(tL_inlineButtonTypeUrl.url)) {
                    ye.d.q(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, qiVar);
                    return true;
                }
                c5.r0(this.K2, tL_inlineButtonTypeUrl.url, false, true, true, false, qiVar, null, this.R3);
                return true;
            }
            if (kf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                tnVar.rb(messageObject2, 2);
                return true;
            }
            if (!kf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                if (kf.c.b(keyboardButtonProto)) {
                    TLRPC.Message message = messageObject2.messageOwner;
                    long j10 = message.via_bot_id;
                    if (j10 == 0) {
                        j10 = message.from_id.user_id;
                    }
                    vf vfVar = new vf(this, messageObject2, j10, keyboardButtonProto, messageObject, MessagesController.getInstance(this.M).getUser(Long.valueOf(j10)));
                    if (SharedPrefsHelper.isWebViewConfirmShown(this.M, j10) || MessagesController.getInstance(this.M).whitelistedBots.contains(Long.valueOf(j10))) {
                        vfVar.run();
                        return true;
                    }
                    c5.o(tnVar, MessagesController.getInstance(this.M).getUser(Long.valueOf(this.L2)), new g5.v(this, vfVar, j10, 20), null);
                    return true;
                }
                if (kf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String string = LocaleController.getString("ShareYouLocationTitle", R.string.ShareYouLocationTitle);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.N = string;
                    c2Var.P = LocaleController.getString("ShareYouLocationInfo", R.string.ShareYouLocationInfo);
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new androidx.car.app.utils.a(this, messageObject2, keyboardButtonProto, 17));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    tnVar.showDialog(c2Var);
                    return true;
                }
                if (kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                    SendMessagesHelper.getInstance(this.M).sendCallback(true, messageObject2, keyboardButtonProto, tnVar);
                    return true;
                }
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!tnVar.Ca(tL_inlineButtonTypeSwitchInline)) {
                        if (!tL_inlineButtonTypeSwitchInline.same_peer) {
                            Bundle e10 = org.telegram.messenger.x3.e(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                e10.putBoolean("allowGroups", false);
                                e10.putBoolean("allowMegagroups", false);
                                e10.putBoolean("allowLegacyGroups", false);
                                e10.putBoolean("allowUsers", false);
                                e10.putBoolean("allowChannels", false);
                                e10.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i11 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i11);
                                    i11++;
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                                    if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                        e10.putBoolean("allowUsers", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                        e10.putBoolean("allowBots", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                        e10.putBoolean("allowChannels", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                        e10.putBoolean("allowLegacyGroups", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                        e10.putBoolean("allowMegagroups", true);
                                    }
                                }
                            }
                            org.telegram.ui.fy fyVar = new org.telegram.ui.fy(e10);
                            fyVar.y2 = new androidx.car.app.utils.a(this, messageObject2, tL_inlineButtonTypeSwitchInline, 18);
                            tnVar.presentFragment(fyVar);
                            return true;
                        }
                        TLRPC.Message message2 = messageObject2.messageOwner;
                        long j11 = message2.from_id.user_id;
                        long j12 = message2.via_bot_id;
                        if (j12 != 0) {
                            j11 = j12;
                        }
                        TLRPC.User user = this.N.getMessagesController().getUser(Long.valueOf(j11));
                        if (user != null) {
                            setFieldText("@" + UserObject.getPublicUsername(user) + " " + tL_inlineButtonTypeSwitchInline.query);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (MessagesController.getInstance(this.M).getUser(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        tnVar.presentFragment(new ProfileActivity(bundle, null));
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
                                ae aeVar = new ae(this, messageObject2, tL_buttonTypeRequestPeer);
                                org.telegram.ui.zi0 zi0Var = org.telegram.ui.zi0.q0;
                                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                                if (R == null || org.telegram.ui.zi0.q0 != null) {
                                    return false;
                                }
                                org.telegram.ui.zi0 zi0Var2 = new org.telegram.ui.zi0(R, i10, bool, bool2, aeVar);
                                zi0Var2.show();
                                org.telegram.ui.zi0.q0 = zi0Var2;
                                return false;
                            }
                            Bundle e11 = org.telegram.messenger.x3.e(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = messageObject2.messageOwner;
                            if (message3 != null) {
                                TLRPC.Peer peer = message3.from_id;
                                if (peer instanceof TLRPC.TL_peerUser) {
                                    e11.putLong("requestPeerBotId", peer.user_id);
                                }
                            }
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                e11.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            org.telegram.ui.fy fyVar2 = new org.telegram.ui.fy(e11);
                            fyVar2.y2 = new ae(this, messageObject2, tL_buttonTypeRequestPeer);
                            tnVar.presentFragment(fyVar2);
                            return false;
                        }
                        TLRPC.User i12 = getParentFragment() != null ? getParentFragment().i() : MessagesController.getInstance(this.M).getUser(Long.valueOf(this.L2));
                        if (i12 != null) {
                            wq.a(getContext(), this.M, i12, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new eg.d1(this, messageObject2, tL_buttonTypeRequestPeer, i12, 6), this.R3, null);
                            return false;
                        }
                    }
                }
                return true;
            }
            TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) kf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
            Boolean valueOf = (tL_buttonTypeRequestPoll.flags & 1) != 0 ? Boolean.valueOf(tL_buttonTypeRequestPoll.quiz) : null;
            tnVar.X9();
            lh.s2 s2Var = tnVar.F1;
            if (s2Var != null) {
                s2Var.O0 = false;
                s2Var.t1.setVisibility(8);
                s2Var.S1(false, valueOf);
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
        float f9;
        float f10;
        int i10;
        de deVar;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i11;
        jf jfVar;
        jf jfVar2;
        de deVar2;
        boolean z11;
        te teVar;
        if (this.W2 == null && this.Z2 == null && this.U1 != messageObject) {
            W();
            boolean z12 = this.U1 != null;
            this.U1 = messageObject;
            this.V1 = z10;
            de deVar3 = this.v1;
            bg.y3 y3Var = this.k1;
            ImageView imageView = this.L0;
            je jeVar = this.m1;
            oe oeVar = this.V0;
            if (messageObject != null) {
                this.M4 = groupedMessages != null ? groupedMessages.captionAbove : messageObject.messageOwner.invert_media;
                T(false);
                this.A1.setOnClickListener(new nd(this, 17));
                if (this.U1.needResendWhenEdit()) {
                    long j10 = this.p4;
                    if (j10 > 0) {
                        this.A1.i(1, j10, true);
                        this.A1.setLayoutParams(i7.f6.e(44, 44, 85));
                        this.A1.requestLayout();
                        deVar = deVar3;
                        this.A1.setOnLongClickListener(new j(this, messageObject, groupedMessages, 1));
                        this.A1.setVisibility(0);
                        this.A1.setScaleX(0.1f);
                        this.A1.setScaleY(0.1f);
                        this.A1.setAlpha(0.0f);
                        this.A1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(jr.f).start();
                        if (z10) {
                            this.V = this.N.getMessagesController().getMaxMessageLength();
                            charSequence = this.U1.messageText;
                        } else {
                            this.V = this.N.getMessagesController().maxCaptionLength;
                            charSequence = this.U1.caption;
                        }
                        if (charSequence == null) {
                            jf jfVar3 = this.A0;
                            TextPaint paint = jfVar3 != null ? jfVar3.getPaint() : null;
                            if (paint == null) {
                                paint = new TextPaint();
                                paint.setTextSize(AndroidUtilities.dp(18.0f));
                            }
                            charSequence2 = r(this.U1.messageOwner.entities, charSequence, paint.getFontMetricsInt());
                        } else {
                            charSequence2 = "";
                        }
                        if (this.Q1 == null && !z12) {
                            jf jfVar4 = this.A0;
                            this.Q1 = (jfVar4 != null || jfVar4.length() <= 0) ? null : this.A0.getText();
                            this.R1 = this.T2;
                        }
                        MessageObject messageObject2 = this.U1;
                        TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                        this.T2 = ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia.manual) && ((i11 = messageObject2.type) == 0 || i11 == 19);
                        if (this.u2) {
                            z2 z2Var = new z2(6, this, charSequence2);
                            this.S = z2Var;
                            AndroidUtilities.runOnUIThread(z2Var, 200L);
                        } else {
                            z2 z2Var2 = this.S;
                            if (z2Var2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(z2Var2);
                                this.S = null;
                            }
                            setFieldText(charSequence2);
                        }
                        jfVar = this.A0;
                        if (jfVar != null) {
                            jfVar.requestFocus();
                        }
                        H0();
                        jfVar2 = this.A0;
                        if (jfVar2 != null) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jfVar2.getLayoutParams();
                            layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                            this.A0.setLayoutParams(layoutParams);
                        }
                        deVar2 = this.a1;
                        if (deVar2 == null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) deVar2.getLayoutParams();
                            z11 = false;
                            layoutParams2.rightMargin = 0;
                            this.a1.setLayoutParams(layoutParams2);
                        } else {
                            z11 = false;
                        }
                        getSendButtonInternal().setVisibility(8);
                        setSlowModeButtonVisible(z11);
                        imageView.setVisibility(8);
                        oeVar.setVisibility(8);
                        y3Var.setVisibility(8);
                        if (jeVar != null) {
                            this.q1 = 0.0f;
                            jeVar.setAlpha(0.0f);
                            jeVar.setScaleX(0.5f);
                            jeVar.setScaleY(0.5f);
                        }
                        deVar.setVisibility(8);
                        teVar = this.E1;
                        if (teVar != null) {
                            teVar.setVisibility(8);
                        }
                    }
                }
                deVar = deVar3;
                this.A1.i(1, 0L, true);
                this.A1.setLayoutParams(i7.f6.e(44, 44, 85));
                this.A1.requestLayout();
                this.A1.setOnLongClickListener(new j(this, messageObject, groupedMessages, 1));
                this.A1.setVisibility(0);
                this.A1.setScaleX(0.1f);
                this.A1.setScaleY(0.1f);
                this.A1.setAlpha(0.0f);
                this.A1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(jr.f).start();
                if (z10) {
                }
                if (charSequence == null) {
                }
                if (this.Q1 == null) {
                    jf jfVar42 = this.A0;
                    this.Q1 = (jfVar42 != null || jfVar42.length() <= 0) ? null : this.A0.getText();
                    this.R1 = this.T2;
                }
                MessageObject messageObject22 = this.U1;
                TLRPC.MessageMedia messageMedia2 = messageObject22.messageOwner.media;
                this.T2 = ((messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia2.manual) && ((i11 = messageObject22.type) == 0 || i11 == 19);
                if (this.u2) {
                }
                jfVar = this.A0;
                if (jfVar != null) {
                }
                H0();
                jfVar2 = this.A0;
                if (jfVar2 != null) {
                }
                deVar2 = this.a1;
                if (deVar2 == null) {
                }
                getSendButtonInternal().setVisibility(8);
                setSlowModeButtonVisible(z11);
                imageView.setVisibility(8);
                oeVar.setVisibility(8);
                y3Var.setVisibility(8);
                if (jeVar != null) {
                }
                deVar.setVisibility(8);
                teVar = this.E1;
                if (teVar != null) {
                }
            } else {
                z2 z2Var3 = this.S;
                if (z2Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(z2Var3);
                    this.S = null;
                }
                re reVar = this.A1;
                if (reVar != null) {
                    reVar.setVisibility(8);
                }
                this.V = -1;
                this.U2.r();
                deVar3.setVisibility(0);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                imageView.setAlpha(0.0f);
                imageView.setVisibility(8);
                int i12 = this.C0;
                pg pgVar = this.B0;
                if (i12 <= 0 || c()) {
                    getSendButtonInternal().setScaleX(0.1f);
                    getSendButtonInternal().setScaleY(0.1f);
                    getSendButtonInternal().setAlpha(0.0f);
                    getSendButtonInternal().setVisibility(8);
                    pgVar.setScaleX(0.1f);
                    pgVar.setScaleY(0.1f);
                    pgVar.setAlpha(0.0f);
                    setSlowModeButtonVisible(false);
                    f9 = 1.0f;
                    y3Var.setScaleX(1.0f);
                    this.A = 1.0f;
                    A1();
                    y3Var.setVisibility(0);
                    if (jeVar != null) {
                        this.q1 = 1.0f;
                        jeVar.setAlpha(1.0f);
                        jeVar.setScaleX(1.0f);
                        jeVar.setScaleY(1.0f);
                    }
                    oeVar.setScaleX(1.0f);
                    oeVar.setScaleY(1.0f);
                    oeVar.setAlpha(1.0f);
                    oeVar.setVisibility(0);
                } else {
                    if (this.C0 == Integer.MAX_VALUE) {
                        getSendButtonInternal().setScaleX(1.0f);
                        getSendButtonInternal().setScaleY(1.0f);
                        getSendButtonInternal().setAlpha(1.0f);
                        getSendButtonInternal().setVisibility(0);
                        pgVar.setScaleX(0.1f);
                        pgVar.setScaleY(0.1f);
                        f10 = 0.0f;
                        pgVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        i10 = 8;
                    } else {
                        f10 = 0.0f;
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        i10 = 8;
                        getSendButtonInternal().setVisibility(8);
                        pgVar.setScaleX(1.0f);
                        pgVar.setScaleY(1.0f);
                        pgVar.setAlpha(1.0f);
                        setSlowModeButtonVisible(true);
                    }
                    y3Var.setScaleX(0.01f);
                    this.A = f10;
                    A1();
                    y3Var.setVisibility(i10);
                    if (jeVar != null) {
                        this.q1 = f10;
                        jeVar.setAlpha(f10);
                        jeVar.setScaleX(0.5f);
                        jeVar.setScaleY(0.5f);
                    }
                    oeVar.setScaleX(0.1f);
                    oeVar.setScaleY(0.1f);
                    oeVar.setAlpha(f10);
                    oeVar.setVisibility(i10);
                    f9 = 1.0f;
                }
                a0();
                te teVar2 = this.E1;
                if (teVar2 != null && teVar2.getTag() != null) {
                    this.E1.setScaleX(f9);
                    this.E1.setScaleY(f9);
                    this.E1.setAlpha(f9);
                    this.E1.setVisibility(0);
                }
                org.telegram.ui.tn tnVar = this.K2;
                if (tnVar != null) {
                    tnVar.l5 = null;
                    tnVar.C5 = null;
                    MessagePreviewParams messagePreviewParams = tnVar.b5;
                    if (messagePreviewParams != null) {
                        messagePreviewParams.updateLink(this.M, null, "", null, null, null);
                    }
                    this.S2 = null;
                    this.T2 = true;
                    tnVar.j8();
                }
                W();
                jf jfVar5 = this.A0;
                if (jfVar5 != null) {
                    jfVar5.setText(this.Q1);
                    jf jfVar6 = this.A0;
                    jfVar6.setSelection(jfVar6.length());
                }
                this.Q1 = null;
                this.T2 = this.R1;
                if (getVisibility() == 0) {
                    this.U2.v2();
                }
                H1(1);
            }
            G1(true);
            P1(true);
            E1();
            N1();
        }
    }

    @Override // org.telegram.ui.Components.dy0
    public final void d(bh.c cVar) {
        jf jfVar = this.A0;
        if (jfVar != null) {
            jfVar.addTextChangedListener(cVar);
            return;
        }
        if (this.C4 == null) {
            this.C4 = new ArrayList();
        }
        this.C4.add(cVar);
    }

    public final void d0() {
        MessagePreviewParams messagePreviewParams;
        MessageSuggestionParams of2;
        TLRPC.Chat chat;
        int i10;
        MessageSuggestionParams of3;
        MessageObject messageObject = this.U1;
        if (messageObject == null) {
            return;
        }
        boolean needResendWhenEdit = messageObject.needResendWhenEdit();
        org.telegram.ui.tn tnVar = this.K2;
        if (needResendWhenEdit && !ChatObject.canManageMonoForum(this.M, this.U1.getDialogId())) {
            if (tnVar == null || (of3 = tnVar.c5) == null) {
                of3 = MessageSuggestionParams.of(this.U1.messageOwner.suggested_post);
            }
            if (!jh.s7.U(this.M, of3.amount)) {
                if (tnVar != null) {
                    tnVar.Tb(of3);
                    return;
                }
                return;
            }
        }
        if (this.V - this.W < 0) {
            NumberTextView numberTextView = this.U;
            if (numberTextView != null) {
                AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                try {
                    this.U.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            if (MessagesController.getInstance(this.M).premiumFeaturesBlocked() || MessagesController.getInstance(this.M).captionLengthLimitPremium <= this.W) {
                return;
            }
            q1();
            return;
        }
        if (this.M1 != 0) {
            m1(0, true);
            this.Q0.t(false);
            if (this.u3) {
                n1(false, true, false, true);
                this.g3 = true;
                AndroidUtilities.runOnUIThread(new ld(this, 27), 200L);
            }
        }
        jf jfVar = this.A0;
        CharSequence textToUse = jfVar == null ? "" : jfVar.getTextToUse();
        MessageObject messageObject2 = this.U1;
        if (messageObject2 == null || messageObject2.type != 19) {
            textToUse = AndroidUtilities.getTrimmedString(textToUse);
        }
        CharSequence[] charSequenceArr = {textToUse};
        if (TextUtils.isEmpty(charSequenceArr[0])) {
            TLRPC.MessageMedia messageMedia = this.U1.messageOwner.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                AndroidUtilities.shakeViewSpring(this.A0, -3.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
        }
        ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.M).getEntities(charSequenceArr, y1());
        if (!TextUtils.equals(charSequenceArr[0], this.U1.messageText) || ((entities != null && !entities.isEmpty()) || !this.U1.messageOwner.entities.isEmpty() || (this.U1.messageOwner.media instanceof TLRPC.TL_messageMediaWebPage))) {
            MessageObject messageObject3 = this.U1;
            messageObject3.editingMessage = charSequenceArr[0];
            messageObject3.editingMessageEntities = entities;
            messageObject3.editingMessageSearchWebPage = this.T2;
            if (tnVar != null && (chat = tnVar.e) != null && (((i10 = messageObject3.type) == 0 || i10 == 19) && !ChatObject.canSendEmbed(chat))) {
                MessageObject messageObject4 = this.U1;
                messageObject4.editingMessageSearchWebPage = false;
                TLRPC.Message message = messageObject4.messageOwner;
                message.flags &= -513;
                message.media = null;
            } else if (tnVar == null || (messagePreviewParams = tnVar.b5) == null) {
                MessageObject messageObject5 = this.U1;
                messageObject5.editingMessageSearchWebPage = false;
                int i11 = messageObject5.type;
                if (i11 == 0 || i11 == 19) {
                    TLRPC.Message message2 = messageObject5.messageOwner;
                    message2.flags |= 512;
                    message2.media = new TLRPC.TL_messageMediaEmpty();
                }
            } else {
                if (tnVar.C5 instanceof TLRPC.TL_webPagePending) {
                    MessageObject messageObject6 = this.U1;
                    messageObject6.editingMessageSearchWebPage = false;
                    int i12 = messageObject6.type;
                    if (i12 == 0 || i12 == 19) {
                        messageObject6.messageOwner.media = new TLRPC.TL_messageMediaEmpty();
                        this.U1.messageOwner.flags |= 512;
                    }
                } else if (messagePreviewParams.webpage != null) {
                    MessageObject messageObject7 = this.U1;
                    messageObject7.editingMessageSearchWebPage = false;
                    TLRPC.Message message3 = messageObject7.messageOwner;
                    message3.flags |= 512;
                    message3.media = new TLRPC.TL_messageMediaWebPage();
                    this.U1.messageOwner.media.webpage = tnVar.b5.webpage;
                } else {
                    MessageObject messageObject8 = this.U1;
                    messageObject8.editingMessageSearchWebPage = false;
                    int i13 = messageObject8.type;
                    if (i13 == 0 || i13 == 19) {
                        TLRPC.Message message4 = messageObject8.messageOwner;
                        message4.flags |= 512;
                        message4.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                TLRPC.Message message5 = this.U1.messageOwner;
                MessagePreviewParams messagePreviewParams2 = tnVar.b5;
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
            if (this.U1.needResendWhenEdit()) {
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(this.U1.editingMessage.toString(), this.U1.getDialogId());
                if (tnVar == null || (of2 = tnVar.c5) == null) {
                    of2 = MessageSuggestionParams.of(this.U1.messageOwner.suggested_post);
                }
                of4.suggestionParams = of2;
                of4.monoForumPeer = DialogObject.getPeerDialogId(this.U1.messageOwner.saved_peer_id);
                of4.hasMediaSpoilers = this.U1.hasMediaSpoilers();
                MessageObject messageObject9 = this.U1;
                of4.replyToMsg = messageObject9;
                of4.parentObject = messageObject9;
                if (messageObject9.getDocument() instanceof TLRPC.TL_document) {
                    of4.document = (TLRPC.TL_document) this.U1.getDocument();
                    of4.caption = of4.message;
                    of4.message = null;
                } else {
                    TLRPC.MessageMedia messageMedia3 = this.U1.messageOwner.media;
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
                SendMessagesHelper.getInstance(this.M).sendMessage(of4);
            } else {
                SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(this.M);
                MessageObject messageObject10 = this.U1;
                sendMessagesHelper.editMessage(messageObject10, null, null, null, null, null, null, false, messageObject10.hasMediaSpoilers(), null);
            }
        }
        c1(null, null, false);
    }

    public final void d1(boolean z10, boolean z11) {
        rg rgVar;
        jf jfVar;
        de deVar;
        ge geVar = this.M0;
        if (geVar == null) {
            return;
        }
        if (this.r2 == 1 || ((deVar = this.a1) != null && deVar.getVisibility() == 0)) {
            this.h = 0.0f;
            this.n = 0.0f;
            F1();
            z11 = false;
        }
        rg rgVar2 = rg.f;
        rg rgVar3 = rg.e;
        if (!z10 || this.a2 != 0) {
            xf xfVar = this.Q0;
            int i10 = xfVar == null ? MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0) : xfVar.getCurrentPage();
            rgVar = (i10 == 0 || !((this.E2 || this.F2) && ((jfVar = this.A0) == null || TextUtils.isEmpty(jfVar.getText())))) ? rgVar3 : i10 == 1 ? rg.c : rgVar2;
        } else if (!this.v0) {
            return;
        } else {
            rgVar = rg.d;
        }
        if (!this.v0 && rgVar == rgVar3) {
            rgVar3 = rgVar2;
        } else if (this.b || rgVar == rgVar3) {
            rgVar3 = rgVar;
        }
        geVar.j(rgVar3, z11);
        if (rgVar3 == rgVar2 && this.Q0 == null) {
            MediaDataController.getInstance(this.M).loadRecents(0, true, true, false);
            ArrayList<String> arrayList = MessagesController.getInstance(this.M).gifSearchEmojies;
            int min = Math.min(10, arrayList.size());
            for (int i11 = 0; i11 < min; i11++) {
                Emoji.preloadEmoji(arrayList.get(i11));
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        re reVar;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat;
        double d;
        je jeVar;
        if (i10 == NotificationCenter.emojiLoaded) {
            xf xfVar = this.Q0;
            if (xfVar != null) {
                xfVar.L.f1();
            }
            uf ufVar = this.C1;
            if (ufVar != null) {
                ArrayList arrayList = ufVar.n;
                while (r4 < arrayList.size()) {
                    ((ph.j0) arrayList.get(r4)).invalidate();
                    r4++;
                }
            }
            jf jfVar = this.A0;
            if (jfVar != null) {
                jfVar.postInvalidate();
                this.A0.invalidateForce();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.recordProgressChanged) {
            if (((Integer) objArr[0]).intValue() != this.B2) {
                return;
            }
            if (this.r2 != 0 && !this.h3 && !c()) {
                this.h3 = true;
                this.N.getMessagesController().sendTyping(this.L2, getThreadMessageId(), this.Y0 ? 7 : 1, 0);
            }
            RecordCircle recordCircle = this.I1;
            if (recordCircle != null) {
                recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.closeChats) {
            jf jfVar2 = this.A0;
            if (jfVar2 == null || !jfVar2.isFocused()) {
                return;
            }
            AndroidUtilities.hideKeyboard(this.A0);
            return;
        }
        int i12 = 5;
        if (i10 == NotificationCenter.recordStartError || i10 == NotificationCenter.recordStopped) {
            if (((Integer) objArr[0]).intValue() == this.B2 && this.A2) {
                this.A2 = false;
                if (i10 != NotificationCenter.recordStopped) {
                    L1(2, true);
                    return;
                }
                Integer num = (Integer) objArr[1];
                if (num.intValue() == 4) {
                    i12 = 4;
                } else if (this.Y0 && num.intValue() == 5) {
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
            if (((Integer) objArr[0]).intValue() != this.B2) {
                return;
            }
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            this.Y0 = !booleanValue;
            pe peVar = this.X0;
            if (peVar != null) {
                peVar.j(booleanValue ? rg.a : rg.b, true);
            }
            if (this.A2) {
                RecordCircle recordCircle2 = this.I1;
                if (recordCircle2 != null) {
                    recordCircle2.E = true;
                }
            } else {
                this.A2 = true;
                L1(0, true);
            }
            qg qgVar = this.U0;
            if (qgVar != null) {
                qgVar.a(this.e1);
            }
            ng ngVar = this.g1;
            if (ngVar != null) {
                ngVar.h = false;
                return;
            }
            return;
        }
        byte[] bArr = null;
        if (i10 == NotificationCenter.recordPaused) {
            this.A2 = false;
            this.W2 = null;
            this.Z2 = null;
            return;
        }
        if (i10 == NotificationCenter.recordResumed) {
            this.W2 = null;
            this.Z2 = null;
            qg qgVar2 = this.U0;
            if (qgVar2 != null) {
                qgVar2.a(this.e1);
            }
            J(true);
            this.A2 = true;
            L1(0, true);
            return;
        }
        if (i10 != NotificationCenter.audioDidSent) {
            if (i10 == NotificationCenter.audioRouteChanged) {
                Activity activity = this.J2;
                if (activity != null) {
                    activity.setVolumeControlStream(((Boolean) objArr[0]).booleanValue() ? 0 : TLObject.FLAG_31);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
                if (this.Y2 == null || !MediaController.getInstance().isPlayingMessage(this.Y2)) {
                    return;
                }
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                MessageObject messageObject = this.Y2;
                messageObject.audioProgress = playingMessageObject.audioProgress;
                messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                return;
            }
            if (i10 == NotificationCenter.featuredStickersDidLoad) {
                ge geVar = this.M0;
                if (geVar != null) {
                    geVar.invalidate();
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
                if (longValue != this.L2 || (chatFull = this.Y1) == null || chatFull.slowmode_seconds == 0 || MessageObject.isEphemeralMessageId(num2.intValue()) || (chat = this.N.getMessagesController().getChat(Long.valueOf(this.Y1.id))) == null || ChatObject.hasAdminRights(chat) || ChatObject.isIgnoredChatRestrictionsForBoosters(chat)) {
                    return;
                }
                TLRPC.ChatFull chatFull2 = this.Y1;
                int currentTime = ConnectionsManager.getInstance(this.M).getCurrentTime();
                TLRPC.ChatFull chatFull3 = this.Y1;
                chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                chatFull3.flags |= 262144;
                setSlowModeTimer(chatFull3.slowmode_next_send_date);
                return;
            }
            if (i10 == NotificationCenter.sendingMessagesChanged) {
                if (this.Y1 != null) {
                    S1();
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.audioRecordTooShort) {
                this.W2 = null;
                this.Z2 = null;
                L1(4, true);
                return;
            }
            if (i10 != NotificationCenter.updateBotMenuButton) {
                if (i10 == NotificationCenter.didUpdatePremiumGiftFieldIcon) {
                    I1(true);
                    return;
                } else {
                    if (i10 == NotificationCenter.currentUserPremiumStatusChanged && this.y1 && (reVar = this.F0) != null) {
                        reVar.setLocked(!UserConfig.getInstance(this.M).isPremium());
                        return;
                    }
                    return;
                }
            }
            long longValue2 = ((Long) objArr[0]).longValue();
            TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
            if (longValue2 == this.L2) {
                if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                    TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                    this.e0 = tL_botMenuButton.text;
                    this.f0 = tL_botMenuButton.url;
                    this.h5 = 3;
                } else if (this.k2) {
                    this.h5 = 2;
                } else {
                    this.h5 = 1;
                }
                B1(false);
                return;
            }
            return;
        }
        if (((Integer) objArr[0]).intValue() != this.B2) {
            return;
        }
        this.e1 = 0L;
        Object obj = objArr[1];
        if (obj instanceof VideoEditedInfo) {
            VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
            this.Z2 = videoEditedInfo;
            String str = (String) objArr[2];
            this.X2 = str;
            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
            this.e1 = videoEditedInfo.estimatedDuration;
            l71 l71Var = this.b1;
            if (l71Var != null) {
                l71Var.setVideoPath(str);
                this.b1.setKeyframes(arrayList2);
                this.b1.setVisibility(0);
                this.b1.setMinProgressDiff(1000.0f / this.Z2.estimatedDuration);
                x0();
            }
            L1(3, true);
            J(false);
            return;
        }
        this.W2 = (TLRPC.TL_document) obj;
        this.X2 = (String) objArr[2];
        boolean z10 = objArr.length >= 4 && ((Boolean) objArr[3]).booleanValue();
        float floatValue = objArr.length >= 5 ? ((Float) objArr[4]).floatValue() : 0.0f;
        float floatValue2 = objArr.length >= 6 ? ((Float) objArr[5]).floatValue() : 1.0f;
        if (this.W2 == null) {
            hg hgVar = this.U2;
            if (hgVar != null) {
                hgVar.D(null, true, 0, 0, 0L);
                return;
            }
            return;
        }
        X();
        if (this.a1 == null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = true;
        tL_message.id = 0;
        tL_message.peer_id = new TLRPC.TL_peerUser();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser;
        TLRPC.Peer peer = tL_message.peer_id;
        long clientUserId = UserConfig.getInstance(this.M).getClientUserId();
        tL_peerUser.user_id = clientUserId;
        peer.user_id = clientUserId;
        tL_message.date = (int) (System.currentTimeMillis() / 1000);
        tL_message.message = "";
        tL_message.attachPath = this.X2;
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.flags |= 3;
        tL_messageMediaDocument.document = this.W2;
        tL_message.flags |= 768;
        this.Y2 = new MessageObject(UserConfig.selectedAccount, tL_message, false, true);
        this.a1.setAlpha(1.0f);
        this.a1.setVisibility(0);
        this.c1.setVisibility(0);
        this.c1.setAlpha(0.0f);
        this.c1.setScaleY(0.0f);
        this.c1.setScaleX(0.0f);
        int i13 = 0;
        while (true) {
            if (i13 >= this.W2.attributes.size()) {
                d = 0.0d;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = this.W2.attributes.get(i13);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                d = documentAttribute.duration;
                break;
            }
            i13++;
        }
        int i14 = 0;
        while (true) {
            if (i14 >= this.W2.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute2 = this.W2.attributes.get(i14);
            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                byte[] bArr2 = documentAttribute2.waveform;
                if (bArr2 == null || bArr2.length == 0) {
                    documentAttribute2.waveform = MediaController.getWaveform(this.X2);
                }
                bArr = documentAttribute2.waveform;
            } else {
                i14++;
            }
        }
        if (z10 && (jeVar = this.m1) != null) {
            this.q1 = 0.0f;
            jeVar.setAlpha(0.0f);
            jeVar.setScaleX(0.0f);
            jeVar.setScaleY(0.0f);
        }
        this.e1 = (long) (1000.0d * d);
        gk0 gk0Var = this.d1;
        String str2 = this.X2;
        if (!gk0Var.M) {
            gk0Var.r = (float) d;
            gk0Var.s = floatValue;
            gk0Var.v = floatValue2;
            gk0Var.w = false;
            gk0Var.h.q(AndroidUtilities.formatDuration((int) Math.round(Math.max(1.0d, d)), false), false, true);
            gk0Var.f.a(false, false);
            if (gk0Var.n == null) {
                x61 x61Var = new x61();
                gk0Var.n = x61Var;
                x61Var.F = new nh.d6(gk0Var, 9);
            }
            gk0Var.n.E(Uri.fromFile(new File(str2)), "other");
            gk0Var.G = 0;
            gk0Var.H = bArr;
            gk0Var.invalidate();
        }
        J(false);
        if (z10) {
            Y();
            Z();
            X();
            this.r2 = 1;
            this.I1.c(false);
            this.q3.set(this.I1, Float.valueOf(1.0f));
            lg lgVar = this.J1;
            if (lgVar != null) {
                lgVar.setVisibility(0);
                this.J1.setAlpha(1.0f);
            }
        }
        L1(3, !z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        xf xfVar = this.Q0;
        if (xfVar == null || xfVar.getVisibility() != 0 || this.Q0.getStickersExpandOffset() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipRect(0, AndroidUtilities.dp(2.0f), getMeasuredWidth(), getMeasuredHeight());
        canvas.translate(0.0f, -this.Q0.getStickersExpandOffset());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        View view2 = this.B1;
        de deVar = this.u1;
        boolean z10 = view == view2 || view == deVar;
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.a5.e;
            canvas.save();
            if (view == deVar) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.B1) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        TextPaint textPaint;
        M1();
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.e();
        }
        ng ngVar = this.g1;
        if (ngVar != null) {
            ngVar.a();
        }
        SlideTextView slideTextView = this.f1;
        if (slideTextView != null) {
            slideTextView.a();
        }
        qg qgVar = this.U0;
        if (qgVar != null && (textPaint = qgVar.x) != null) {
            textPaint.setColor(qgVar.B.i0(org.telegram.ui.ActionBar.g6.nf));
        }
        l71 l71Var = this.b1;
        if (l71Var != null) {
            l71Var.e.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
            l71Var.H = 0;
            j71 j71Var = l71Var.L;
            if (j71Var != null) {
                j71Var.b();
            }
        }
        NumberTextView numberTextView = this.U;
        if (numberTextView != null && this.A0 != null) {
            if (this.W - this.V < 0) {
                numberTextView.setTextColor(i0(org.telegram.ui.ActionBar.g6.p7));
            } else {
                numberTextView.setTextColor(i0(org.telegram.ui.ActionBar.g6.y6));
            }
        }
        Color.alpha(i0(org.telegram.ui.ActionBar.g6.bf));
        gf gfVar = this.i0;
        if (gfVar != null) {
            gfVar.d.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ii, false));
            ng.d dVar = gfVar.r;
            if (dVar != null) {
                dVar.u();
            }
            gfVar.invalidate();
        }
        uf ufVar = this.C1;
        if (ufVar != null) {
            ufVar.e();
        }
        int i02 = this.W0 ? i0(org.telegram.ui.ActionBar.g6.Wk) : -1;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.X0.setColorFilter(new PorterDuffColorFilter(i02, mode));
        int i10 = org.telegram.ui.ActionBar.g6.Wk;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0(i10), mode);
        ge geVar = this.M0;
        geVar.setColorFilter(porterDuffColorFilter);
        int i11 = org.telegram.ui.ActionBar.g6.i6;
        geVar.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(i11), 1, -1));
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i0(i10), mode);
        ImageView imageView = this.N0;
        imageView.setColorFilter(porterDuffColorFilter2);
        int i03 = i0(i11);
        float dp = AndroidUtilities.dp(19.0f);
        int dp2 = AndroidUtilities.dp(1.0f);
        int dp3 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.W(dp, i03, dp2, dp3, dp2, dp3));
        this.w1.setColorFilter(i0(org.telegram.ui.ActionBar.g6.hl), mode);
    }

    public final void e0(Canvas canvas, boolean z10) {
        if (this.t4) {
            int z11 = (int) com.google.android.recaptcha.internal.a.z(1.0f, this.x4, org.telegram.ui.ActionBar.g6.i3.getIntrinsicHeight(), this.O1);
            View view = this.B1;
            if (view != null && view.getVisibility() == 0) {
                z11 = (int) (((1.0f - getTopViewEnterProgress()) * this.B1.getLayoutParams().height) + z11);
            }
            int intrinsicHeight = org.telegram.ui.ActionBar.g6.i3.getIntrinsicHeight() + z11;
            if (z10) {
                org.telegram.ui.ActionBar.g6.i3.setAlpha((int) (this.x4 * 255.0f));
                org.telegram.ui.ActionBar.g6.i3.setBounds(0, z11, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.g6.i3.draw(canvas);
            }
            if (!this.s4) {
                float f9 = intrinsicHeight;
                float width = getWidth();
                float height = getHeight();
                org.telegram.ui.ActionBar.c6 c6Var = this.R3;
                Paint G = c6Var != null ? c6Var.G("paintChatComposeBackground") : null;
                if (G == null) {
                    G = org.telegram.ui.ActionBar.g6.S0("paintChatComposeBackground");
                }
                canvas.drawRect(0.0f, f9, width, height, G);
                return;
            }
            int i02 = i0(org.telegram.ui.ActionBar.g6.Sd);
            Paint paint = this.w4;
            paint.setColor(i02);
            if (!SharedConfig.chatBlurEnabled() || this.h1 == null) {
                canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint);
            } else {
                this.y4.set(0, intrinsicHeight, getWidth(), getHeight());
                this.h1.J(canvas, getTop(), this.y4, paint, false);
            }
        }
    }

    public final void e1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.J2.getSystemService("accessibility");
        if (this.A0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        try {
            this.A0.requestFocus();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final boolean f0(Canvas canvas, Utilities.Callback0Return callback0Return) {
        float f9;
        float f10;
        float f11;
        float f12;
        float e10 = this.W4.e(this.A0.canScrollVertically(-1));
        float e11 = this.X4.e(this.A0.canScrollVertically(1));
        if (e10 <= 0.0f && e11 <= 0.0f) {
            return ((Boolean) callback0Return.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.A0.getX() + this.A0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.A0.getY() + this.A0.getMeasuredHeight() + AndroidUtilities.dp(2.0f), 255, 31);
        boolean booleanValue = ((Boolean) callback0Return.run()).booleanValue();
        canvas.save();
        LinearGradient linearGradient = this.U4;
        Paint paint = this.T4;
        Matrix matrix = this.V4;
        if (e10 > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            f9 = 255.0f;
            f10 = 16.0f;
            f11 = 0.0f;
            f12 = 5.0f;
            rectF.set(this.A0.getX() - AndroidUtilities.dp(5.0f), (this.A0.getY() + this.O1) - 1.0f, this.A0.getX() + this.A0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.A0.getY() + this.O1 + AndroidUtilities.dp(13.0f));
            matrix.reset();
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (e10 * 255.0f));
            canvas.drawRect(rectF, paint);
        } else {
            f9 = 255.0f;
            f10 = 16.0f;
            f11 = 0.0f;
            f12 = 5.0f;
        }
        if (e11 > f11) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(this.A0.getX() - AndroidUtilities.dp(f12), (this.A0.getY() + this.A0.getMeasuredHeight()) - AndroidUtilities.dp(15.0f), this.A0.getX() + this.A0.getMeasuredWidth() + AndroidUtilities.dp(f12), this.A0.getY() + this.A0.getMeasuredHeight() + AndroidUtilities.dp(2.0f) + 1.0f);
            matrix.reset();
            matrix.postScale(1.0f, rectF2.height() / f10);
            matrix.postRotate(180.0f);
            matrix.postTranslate(rectF2.left, rectF2.bottom);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (e11 * f9));
            canvas.drawRect(rectF2, paint);
        }
        canvas.restore();
        canvas.restore();
        return booleanValue;
    }

    public final void f1(CharSequence charSequence, boolean z10) {
        jf jfVar = this.A0;
        if (jfVar == null) {
            return;
        }
        this.M2 = true;
        jfVar.setText(charSequence);
        this.A0.invalidateQuotes(true);
        jf jfVar2 = this.A0;
        jfVar2.setSelection(jfVar2.getText().length());
        this.M2 = false;
        hg hgVar = this.U2;
        if (hgVar != null) {
            hgVar.l1(this.A0.getText(), true, z10);
        }
    }

    public final sf g0(MessageObject messageObject, boolean z10) {
        sf sfVar = new sf(messageObject.currentAccount, messageObject.messageOwner, true, true);
        if (z10) {
            jf jfVar = this.A0;
            CharSequence[] charSequenceArr = {jfVar == null ? "" : jfVar.getTextToUse()};
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.M).getEntities(charSequenceArr, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            MessageObject.addEntitiesToText(spannableStringBuilder, entities, true, true, false, true);
            sfVar.caption = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, org.telegram.ui.ActionBar.g6.o2.getFontMetricsInt(), false, (int[]) null), entities, org.telegram.ui.ActionBar.g6.o2.getFontMetricsInt());
        }
        return sfVar;
    }

    public final void g1(boolean z10, boolean z11) {
        this.C2 = z10;
        J(z11);
    }

    public org.telegram.ui.ActionBar.q1 getAdjustPanLayoutHelper() {
        return this.Q;
    }

    public int getAnimatedTop() {
        return this.O1;
    }

    public ImageView getAttachButton() {
        return this.m1;
    }

    public View getAudioVideoButtonContainer() {
        return this.V0;
    }

    public int getBackgroundTop() {
        int top = getTop();
        View view = this.B1;
        return (view == null || view.getVisibility() != 0) ? top : top + this.B1.getLayoutParams().height;
    }

    public ph.e3 getBotWebViewButton() {
        if (this.g0 == null) {
            Context context = getContext();
            ph.e3 e3Var = new ph.e3(context);
            e3Var.a = new Path();
            e3Var.c = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            e3Var.addView(textView, i7.f6.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(AndroidUtilities.dp(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            e3Var.addView(radialProgressView, i7.f6.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false), 2, -1));
            e3Var.addView(view, i7.f6.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            e3Var.setWillNotDraw(false);
            this.g0 = e3Var;
            e3Var.setVisibility(8);
            R();
            this.g0.setBotMenuButton(this.h0);
            this.t1.addView(this.g0, i7.f6.e(-1, -1, 80));
        }
        return this.g0;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public int getCursorPosition() {
        jf jfVar = this.A0;
        if (jfVar == null) {
            return 0;
        }
        return jfVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.U1 != null) {
            if (TextUtils.isEmpty(this.Q1)) {
                return null;
            }
            return this.Q1;
        }
        if (this.A0 == null || !k0()) {
            return null;
        }
        return this.A0.getText();
    }

    @Override // org.telegram.ui.Components.dy0
    public Editable getEditText() {
        jf jfVar = this.A0;
        if (jfVar == null) {
            return null;
        }
        return jfVar.getText();
    }

    public MessageObject getEditingMessageObject() {
        return this.U1;
    }

    public long getEffectId() {
        return this.N4;
    }

    public View getEmojiButton() {
        return this.M0;
    }

    public int getEmojiPadding() {
        return this.v2;
    }

    public fz getEmojiView() {
        return this.Q0;
    }

    public float getExitTransition() {
        return this.h4;
    }

    @Override // org.telegram.ui.Components.dy0
    public CharSequence getFieldText() {
        if (this.A0 == null || !k0()) {
            return null;
        }
        return this.A0.getText();
    }

    public int getHeightWithTopView() {
        int measuredHeight = getMeasuredHeight();
        View view = this.B1;
        return (view == null || view.getVisibility() != 0) ? measuredHeight : (int) (measuredHeight - ((1.0f - getTopViewEnterProgress()) * this.B1.getLayoutParams().height));
    }

    public float getLockAnimatedTranslation() {
        return this.g4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r4.Z2 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getMessagesCount() {
        MessagePreviewParams messagePreviewParams;
        org.telegram.ui.tn tnVar = this.K2;
        int forwardedMessagesCount = (tnVar == null || (messagePreviewParams = tnVar.b5) == null) ? 0 : messagePreviewParams.getForwardedMessagesCount();
        jf jfVar = this.A0;
        if (jfVar == null || TextUtils.isEmpty(jfVar.getText())) {
            if (this.Y2 == null) {
            }
            forwardedMessagesCount++;
        } else {
            String trimmedString = SendMessagesHelper.getTrimmedString(this.A0.getText().toString());
            int maxMessageLength = this.N.getMessagesController().getMaxMessageLength();
            if (trimmedString.length() != 0) {
                forwardedMessagesCount += (int) Math.ceil(trimmedString.length() / maxMessageLength);
            }
            forwardedMessagesCount++;
        }
        return Math.max(1, forwardedMessagesCount);
    }

    public RecordCircle getRecordCircle() {
        return this.I1;
    }

    public MessageObject getReplyingMessageObject() {
        return this.O2;
    }

    public int getSelectionLength() {
        jf jfVar = this.A0;
        if (jfVar == null) {
            return 0;
        }
        try {
            return jfVar.getSelectionEnd() - this.A0.getSelectionStart();
        } catch (Exception e10) {
            FileLog.e(e10);
            return 0;
        }
    }

    public View getSendButton() {
        return getSendButtonInternal().getVisibility() == 0 ? getSendButtonInternal() : this.V0;
    }

    public View getSendButtonInternal() {
        return this.F0;
    }

    public MessageSuggestionParams getSendMessageSuggestionParams() {
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar != null) {
            return tnVar.c5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar != null) {
            return tnVar.N8();
        }
        return 0L;
    }

    public qo0 getSenderSelectView() {
        return this.l0;
    }

    public hv0 getSizeNotifierLayout() {
        return this.h1;
    }

    public float getSlideToCancelProgress() {
        return this.e4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.C0 > 0) {
            return this.B0.a.getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.tn tnVar = this.K2;
        return tnVar != null ? tnVar.getMessagesController().getSendPaidMessagesStars(tnVar.a()) : MessagesController.getInstance(this.M).getSendPaidMessagesStars(this.L2);
    }

    public Drawable getStickersArrowDrawable() {
        return this.A3;
    }

    public int getStickersExpandedHeight() {
        return this.y3;
    }

    public ImageView getSuggestButton() {
        return this.r1;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.b5.e;
    }

    public float getTopViewHeight() {
        View view = this.B1;
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return this.B1.getLayoutParams().height;
    }

    public float getTopViewTranslation() {
        View view = this.B1;
        if (view == null || view.getVisibility() == 8) {
            return 0.0f;
        }
        return this.B1.getTranslationY();
    }

    public e41 getTrendingStickersAlert() {
        return this.V2;
    }

    public int getVisibleEmojiPadding() {
        if (this.S0) {
            return this.v2;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f9 = this.O1;
        View view = this.B1;
        if (view != null && view.getVisibility() == 0) {
            f9 += (1.0f - getTopViewEnterProgress()) * this.B1.getLayoutParams().height;
        }
        return getMeasuredHeight() - f9;
    }

    public void h1(float f9, float f10, float f11, boolean z10) {
        int dp;
        float f12 = 1.0f - f11;
        float f13 = f9 * f12;
        float f14 = f10 * f12;
        this.r = (f11 * 0.5f) + 0.5f;
        this.s = f11;
        F1();
        float f15 = -f13;
        this.M0.setTranslationX(f15);
        if (this.A0 == null) {
            dp = 0;
        } else {
            int dp2 = AndroidUtilities.dp(40.0f);
            qo0 qo0Var = this.l0;
            dp = dp2 + ((qo0Var == null || qo0Var.getVisibility() != 0) ? 0 : AndroidUtilities.dp(18.0f));
        }
        this.D = f15 - (dp * f12);
        aj0 aj0Var = this.c1;
        if (aj0Var != null) {
            aj0Var.setTranslationX(f15);
        }
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f14);
        }
        lg lgVar = this.J1;
        if (lgVar != null) {
            lgVar.setTranslationX(f14);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f15);
        }
        de deVar = this.v1;
        deVar.setTranslationX(f14);
        deVar.setAlpha(f11);
        ImageView imageView = this.r1;
        if (imageView != null) {
            imageView.setAlpha(imageView.getScaleX() > 0.7f ? f11 : 0.0f);
        }
        boolean z11 = true;
        if (z10 && f11 != 1.0f) {
            z11 = false;
        }
        this.F = z11;
        this.y = f14;
        this.B = f11;
        A1();
        J1();
        float f16 = f13 * f12;
        if (this.E != f16) {
            this.E = f16;
            gk0 gk0Var = this.d1;
            if (gk0Var != null) {
                gk0Var.setTranslationX(f16);
                this.d1.invalidate();
            }
        }
        if (this.A0 != null) {
            float lerp = AndroidUtilities.lerp(0.88f, 1.0f, f11);
            this.A0.setPivotX(0.0f);
            this.A0.setPivotY(r9.getMeasuredHeight() / 2.0f);
            this.A0.setScaleX(lerp);
            this.A0.setScaleY(lerp);
            this.A0.setHintRightOffset(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f11));
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final int i0(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.R3;
        return c6Var != null ? c6Var.C0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    public final void i1(boolean z10) {
        if (this.g5 == z10) {
            return;
        }
        this.g5 = z10;
        this.m1.setVisibility(z10 ? 8 : 0);
        if (z10) {
            AndroidUtilities.removeFromParent(this.D1);
        }
        if (z10) {
            this.X0.setVisibility(8);
        } else {
            P0();
        }
        if (!z10) {
            this.V = -1;
            NumberTextView numberTextView = this.U;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        H1(this.K4);
        J(false);
    }

    public final boolean j0() {
        return this.h5 == 3;
    }

    public final void j1(CharSequence charSequence, boolean z10) {
        this.e = charSequence;
        this.f = null;
        G1(z10);
    }

    public final boolean k0() {
        jf jfVar = this.A0;
        return jfVar != null && jfVar.length() > 0;
    }

    public final void k1(boolean z10, boolean z11) {
        pe peVar = this.X0;
        if (peVar == null) {
            return;
        }
        this.Y0 = z10;
        if (z11) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z12 = false;
            if (DialogObject.isChatDialog(this.L2)) {
                TLRPC.Chat chat = this.N.getMessagesController().getChat(Long.valueOf(-this.L2));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    z12 = true;
                }
            }
            globalMainSettings.edit().putBoolean(z12 ? "currentModeVideoChannel" : "currentModeVideo", z10).apply();
        }
        peVar.j(this.Y0 ? rg.b : rg.a, z11);
        peVar.setContentDescription(LocaleController.getString(this.Y0 ? R.string.AccDescrVideoMessage : R.string.AccDescrVoiceMessage));
        this.V0.setContentDescription(LocaleController.getString(this.Y0 ? R.string.AccDescrVideoMessage : R.string.AccDescrVoiceMessage));
        peVar.sendAccessibilityEvent(8);
    }

    public final void l0() {
        nh.t3 t3Var = this.J;
        if (t3Var != null) {
            t3Var.e(true);
        }
        nh.t3 t3Var2 = this.H;
        if (t3Var2 != null) {
            t3Var2.e(true);
        }
    }

    public final void l1(MessageObject messageObject, org.telegram.ui.jn jnVar, MessageObject messageObject2) {
        MessageObject messageObject3;
        org.telegram.ui.tn tnVar = this.K2;
        boolean z10 = (tnVar == null || !tnVar.v9() || this.P2 == messageObject2) ? false : true;
        if (messageObject != null) {
            if (this.R2 == null && (messageObject3 = this.h2) != this.O2) {
                this.R2 = messageObject3;
            }
            this.O2 = messageObject;
            this.Q2 = jnVar;
            this.P2 = messageObject2;
            if (tnVar == null || !tnVar.d4 || tnVar.T3 != messageObject) {
                Z0(messageObject, true, true);
            }
        } else if (this.O2 == this.h2) {
            this.O2 = null;
            this.P2 = null;
            this.Q2 = null;
            Z0(this.R2, true, false);
            this.R2 = null;
        } else {
            this.O2 = null;
            this.Q2 = null;
            this.P2 = null;
        }
        F(true);
        hg hgVar = this.U2;
        MediaController.getInstance().setReplyingMessage(messageObject, getThreadMessage(), hgVar != null ? hgVar.d1() : null);
        G1(z10);
    }

    public final void m0(boolean z10) {
        n0(z10, false, true);
    }

    public final void m1(int i10, boolean z10) {
        boolean z11 = i10 != 0;
        if (z11 != (this.M1 != 0)) {
            ValueAnimator valueAnimator = this.r0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.r0.cancel();
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s0, z11 ? 1.0f : 0.0f);
                this.r0 = ofFloat;
                ofFloat.addUpdateListener(new jd(this, 4));
                this.r0.addListener(new we(this, z11, 3));
                this.r0.setDuration(220L);
                this.r0.setInterpolator(jr.f);
                this.r0.start();
            } else {
                this.s0 = z11 ? 1.0f : 0.0f;
                xf xfVar = this.Q0;
                if (xfVar != null) {
                    xfVar.a0();
                }
            }
        }
        this.M1 = i10;
    }

    public final void n(TLRPC.Document document) {
        MediaDataController.getInstance(this.M).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
        xf xfVar = this.Q0;
        if (xfVar == null || document == null) {
            return;
        }
        boolean isEmpty = xfVar.e1.isEmpty();
        xfVar.Y();
        if (isEmpty) {
            xfVar.Z(false);
        }
    }

    public final boolean n0(boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (t0()) {
            if (this.a2 == 1 && (tL_replyKeyboardMarkup = this.i2) != null && z10 && this.h2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    MessagesController.getMainSettings(this.M).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.h2.getId()).apply();
                }
            }
            if ((z10 && this.M1 != 0) || z11) {
                m1(0, true);
                xf xfVar = this.Q0;
                if (xfVar != null) {
                    xfVar.t(true);
                }
                jf jfVar = this.A0;
                if (jfVar != null) {
                    jfVar.requestFocus();
                }
                n1(false, true, false, true);
                if (this.t3) {
                    J(true);
                    return true;
                }
            } else {
                if (this.M1 == 0) {
                    if (this.u3) {
                        n1(false, true, false, true);
                        return true;
                    }
                    t1(0, 0, true, z12 && !z10);
                    return true;
                }
                m1(0, false);
                this.Q0.t(false);
                jf jfVar2 = this.A0;
                if (jfVar2 != null) {
                    jfVar2.requestFocus();
                }
            }
            return true;
        }
        return false;
    }

    public final void n1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i10 = 1;
        org.telegram.ui.ActionBar.q1 q1Var = this.Q;
        if ((q1Var != null && q1Var.f) || this.g3 || this.Q0 == null) {
            return;
        }
        if (z12 || this.u3 != z10) {
            this.u3 = z10;
            hg hgVar = this.U2;
            if (hgVar != null) {
                hgVar.s1();
            }
            Point point = AndroidUtilities.displaySize;
            final int i11 = point.x > point.y ? this.t2 : this.s2;
            AnimatorSet animatorSet = this.w3;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.w3 = null;
            }
            boolean z14 = this.u3;
            AnimationNotificationsLocker animationNotificationsLocker = this.G3;
            org.telegram.ui.Cells.b1 b1Var = this.o3;
            final int i12 = 0;
            hv0 hv0Var = this.h1;
            if (z14) {
                if (z13) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
                }
                int height = hv0Var.getHeight();
                this.j1 = height;
                int dp = ((((height - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - getHeight();
                this.y3 = dp;
                if (this.M1 == 2) {
                    this.y3 = Math.min(dp, AndroidUtilities.dp(175.0f) + i11);
                }
                if (this.Y4 == null) {
                    this.Q0.getLayoutParams().height = this.y3;
                }
                hv0Var.requestLayout();
                if (this.t4) {
                    hv0Var.setForeground(new cf.f(this));
                }
                jf jfVar = this.A0;
                if (jfVar != null) {
                    int selectionStart = jfVar.getSelectionStart();
                    int selectionEnd = this.A0.getSelectionEnd();
                    jf jfVar2 = this.A0;
                    jfVar2.setText(jfVar2.getText());
                    this.A0.setSelection(selectionStart, selectionEnd);
                }
                if (z11) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    if (this.Y4 != null) {
                        animatorSet2.playTogether(ValueAnimator.ofInt(-(this.y3 - i11)), ValueAnimator.ofInt(-(this.y3 - i11)), ObjectAnimator.ofFloat(this.A3, "animationProgress", 1.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofInt(this, b1Var, -(this.y3 - i11)), ObjectAnimator.ofInt(this.Q0, b1Var, -(this.y3 - i11)), ObjectAnimator.ofFloat(this.A3, "animationProgress", 1.0f));
                    }
                    animatorSet2.setDuration(300L);
                    animatorSet2.setInterpolator(jr.f);
                    if (this.Y4 == null) {
                        ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.rd
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
                                        int i15 = ChatActivityEnterView.i5;
                                        chatActivityEnterView.x3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.y3 - i14)));
                                        chatActivityEnterView.h1.invalidate();
                                        break;
                                    default:
                                        int i16 = ChatActivityEnterView.i5;
                                        chatActivityEnterView.x3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.y3 - i14));
                                        chatActivityEnterView.h1.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet2.addListener(new se(this, 12));
                    this.w3 = animatorSet2;
                    this.Q0.setLayerType(2, null);
                    animationNotificationsLocker.lock();
                    this.x3 = 0.0f;
                    hv0Var.invalidate();
                    animatorSet2.start();
                } else {
                    this.x3 = 1.0f;
                    if (this.Y4 == null) {
                        setTranslationY(-(this.y3 - i11));
                        this.Q0.setTranslationY(-(this.y3 - i11));
                    }
                    AnimatedArrowDrawable animatedArrowDrawable = this.A3;
                    if (animatedArrowDrawable != null) {
                        animatedArrowDrawable.setAnimationProgress(1.0f);
                    }
                }
                ah.f fVar = this.Y4;
                if (fVar != null) {
                    ((ah.i) fVar).g(this.y3);
                }
            } else {
                if (z13) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 1);
                }
                if (z11) {
                    this.v3 = true;
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.Y4 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.A3, "animationProgress", 0.0f));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, b1Var, 0), ObjectAnimator.ofInt(this.Q0, b1Var, 0), ObjectAnimator.ofFloat(this.A3, "animationProgress", 0.0f));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(jr.f);
                    if (this.Y4 == null) {
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.rd
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
                                        int i15 = ChatActivityEnterView.i5;
                                        chatActivityEnterView.x3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.y3 - i14)));
                                        chatActivityEnterView.h1.invalidate();
                                        break;
                                    default:
                                        int i16 = ChatActivityEnterView.i5;
                                        chatActivityEnterView.x3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.y3 - i14));
                                        chatActivityEnterView.h1.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet3.addListener(new bg(this, i11, i10));
                    this.x3 = 1.0f;
                    hv0Var.invalidate();
                    this.w3 = animatorSet3;
                    this.Q0.setLayerType(2, null);
                    animationNotificationsLocker.lock();
                    animatorSet3.start();
                } else {
                    this.x3 = 0.0f;
                    if (this.Y4 == null) {
                        setTranslationY(0.0f);
                        this.Q0.setTranslationY(0.0f);
                        this.Q0.getLayoutParams().height = i11;
                    }
                    hv0Var.requestLayout();
                    hv0Var.setForeground(null);
                    hv0Var.setWillNotDraw(false);
                    AnimatedArrowDrawable animatedArrowDrawable2 = this.A3;
                    if (animatedArrowDrawable2 != null) {
                        animatedArrowDrawable2.setAnimationProgress(0.0f);
                    }
                }
                ah.f fVar2 = this.Y4;
                if (fVar2 != null) {
                    ((ah.i) fVar2).g(i11);
                }
            }
            ve veVar = this.O0;
            if (veVar != null) {
                if (this.u3) {
                    veVar.setContentDescription(LocaleController.getString("AccDescrCollapsePanel", R.string.AccDescrCollapsePanel));
                } else {
                    veVar.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
                }
            }
        }
    }

    public final void o(TLRPC.Document document) {
        U();
        xf xfVar = this.Q0;
        int i10 = xfVar.Y0;
        MediaDataController.getInstance(i10).addRecentSticker(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = xfVar.f1.isEmpty();
        xfVar.f1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        wy wyVar = xfVar.u0;
        if (wyVar != null) {
            wyVar.l();
        }
        if (isEmpty) {
            xfVar.Z(false);
        }
    }

    public final void o0(boolean z10) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.p2;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.X2 = null;
            this.W2 = null;
            this.Y2 = null;
            this.Z2 = null;
            l71 l71Var = this.b1;
            int i10 = 1;
            if (l71Var != null) {
                l71Var.a(true);
            }
            pe peVar = this.X0;
            if (peVar != null) {
                peVar.setVisibility(0);
            }
            ce ceVar = this.Y3;
            ce ceVar2 = this.U3;
            ce ceVar3 = this.W3;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            ge geVar = this.M0;
            Property property3 = View.ALPHA;
            je jeVar = this.m1;
            if (z10) {
                if (jeVar != null) {
                    this.q1 = 0.0f;
                    jeVar.setAlpha(0.0f);
                    jeVar.setScaleX(0.0f);
                    jeVar.setScaleY(0.0f);
                }
                this.n = 0.0f;
                this.h = 0.0f;
                F1();
                this.p2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(geVar, ceVar3, this.w0 ? 0.5f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(geVar, ceVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.c1, (Property<aj0, Float>) property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.c1, (Property<aj0, Float>) property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.c1, (Property<aj0, Float>) property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.a1, (Property<de, Float>) property3, 0.0f));
                if (jeVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.l1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.l1 = null;
                    }
                    this.q1 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.A0, (Property<jf, Float>) property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.A0, ceVar, 0.0f));
                lg lgVar = this.J1;
                if (lgVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(lgVar, (Property<lg, Float>) property3, 0.0f));
                    this.J1.a();
                }
                this.p2.playTogether(arrayList);
                ph.z zVar = this.h0;
                if (zVar != null) {
                    zVar.setAlpha(0.0f);
                    this.h0.setScaleY(0.0f);
                    this.h0.setScaleX(0.0f);
                    this.p2.playTogether(ObjectAnimator.ofFloat(this.h0, (Property<ph.z, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.h0, (Property<ph.z, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.h0, (Property<ph.z, Float>) property, 1.0f));
                }
                this.p2.setDuration(150L);
                this.p2.addListener(new se(this, i10));
            } else {
                aj0 aj0Var = this.c1;
                if (aj0Var != null) {
                    aj0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = this.Y0;
                Property property4 = View.TRANSLATION_X;
                if (z11) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.b1, (Property<l71, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.b1, (Property<l71, Float>) property4, -AndroidUtilities.dp(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.A0, ceVar, 0.0f));
                    lg lgVar2 = this.J1;
                    if (lgVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(lgVar2, (Property<lg, Float>) property3, 0.0f));
                        this.J1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.A0, (Property<jf, Float>) property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A0, (Property<jf, Float>) property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    jf jfVar = this.A0;
                    if (jfVar == null || this.s != 1.0f) {
                        this.C = 0.0f;
                        J1();
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.A0, (Property<jf, Float>) property3, 1.0f);
                        ofFloat2.setStartDelay(750L);
                        ofFloat2.setDuration(200L);
                        animatorSet3.playTogether(ofFloat2);
                    } else {
                        jfVar.setAlpha(1.0f);
                        this.C = 0.0f;
                        J1();
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(this.d1, (Property<gk0, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.d1, (Property<gk0, Float>) property4, -AndroidUtilities.dp(20.0f)));
                    lg lgVar3 = this.J1;
                    if (lgVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(lgVar3, (Property<lg, Float>) property3, 0.0f));
                        this.J1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (jeVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.l1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.l1 = null;
                    }
                    this.q1 = 0.0f;
                    jeVar.setAlpha(0.0f);
                    jeVar.setScaleX(0.0f);
                    jeVar.setScaleY(0.0f);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.q1 = 1.0f;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property3, 1.0f), ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property2, 1.0f), ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property, 1.0f));
                    animatorSet4.setDuration(150L);
                    animatorSet = animatorSet4;
                } else {
                    animatorSet = null;
                }
                this.h = 0.0f;
                this.n = 0.0f;
                F1();
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playTogether(ObjectAnimator.ofFloat(this.c1, (Property<aj0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.c1, (Property<aj0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.c1, (Property<aj0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.c1, (Property<aj0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(geVar, ceVar3, this.w0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(geVar, ceVar2, 1.0f));
                ph.z zVar2 = this.h0;
                if (zVar2 != null) {
                    zVar2.setAlpha(0.0f);
                    this.h0.setScaleY(0.0f);
                    this.h0.setScaleX(0.0f);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.h0, (Property<ph.z, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.h0, (Property<ph.z, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.h0, (Property<ph.z, Float>) property, 1.0f));
                }
                animatorSet5.setDuration(150L);
                animatorSet5.setStartDelay(600L);
                AnimatorSet animatorSet6 = new AnimatorSet();
                this.p2 = animatorSet6;
                if (animatorSet != null) {
                    animatorSet6.playTogether(animatorSet3, animatorSet, animatorSet5);
                } else {
                    animatorSet6.playTogether(animatorSet3, animatorSet5);
                }
                this.p2.addListener(new mf(this));
            }
            AnimatorSet animatorSet7 = this.p2;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            lg lgVar4 = this.J1;
            if (lgVar4 != null) {
                lgVar4.invalidate();
            }
        }
    }

    public final void o1(boolean z10, boolean z11) {
        if (this.q4 == z10 && z11) {
            return;
        }
        ImageView imageView = this.r1;
        if (imageView == null) {
            if (!z10 && !this.g5) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = new ImageView(getContext());
                this.r1 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                this.r1.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.g6.Wk), PorterDuff.Mode.MULTIPLY));
                this.r1.setImageResource(R.drawable.input_suggest_paid_24);
                this.r1.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(org.telegram.ui.ActionBar.g6.i6), 1, -1));
                if (this.g5) {
                    this.r1.setTranslationX(AndroidUtilities.dp(42.0f));
                    this.u1.addView(this.r1, i7.f6.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                } else {
                    this.k1.addView(this.r1, 0, i7.f6.n(44, 44));
                }
                this.r1.setOnClickListener(new nd(this, 19));
                this.r1.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
            }
        }
        boolean z12 = this.q4 != z10;
        this.q4 = z10;
        float f9 = z10 ? 1.0f : 0.6f;
        float f10 = z10 ? 1.0f : 0.0f;
        this.r1.setEnabled(z10);
        this.r1.setClickable(z10);
        ValueAnimator valueAnimator = this.r4;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.r4 = null;
        }
        if (z11) {
            if (this.g5) {
                this.r1.setVisibility(0);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r1.getAlpha(), f10);
            this.r4 = ofFloat;
            ofFloat.addUpdateListener(new jd(this, 7));
            this.r4.addListener(new we(this, z10, r2));
            this.r4.setDuration(220L);
            this.r4.setInterpolator(jr.h);
            this.r4.start();
        } else {
            this.r1.setScaleX(f9);
            this.r1.setScaleY(f9);
            this.r1.setAlpha(f10);
            if (this.g5) {
                this.r1.setVisibility(z10 ? 0 : 8);
            }
        }
        H1(this.K4);
        if (z12) {
            J(true);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ye yeVar = this.m0;
        if (yeVar != null) {
            yeVar.e = false;
            yeVar.dismiss();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        e0(canvas, true);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View findChildViewUnder;
        if (this.A2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (findChildViewUnder = AndroidUtilities.findChildViewUnder(this, motionEvent.getX(), motionEvent.getY())) != this.H && findChildViewUnder != this.I) {
            l0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        gf gfVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Q4 == -1 || (gfVar = this.i0) == null) {
            return;
        }
        f2.j0 j0Var = (f2.j0) gfVar.c.getLayoutManager();
        if (j0Var != null) {
            j0Var.h1(this.Q4, this.R4);
        }
        this.Q4 = -1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        de deVar = this.u1;
        int measuredHeight = deVar.getMeasuredHeight();
        ph.z zVar = this.h0;
        ImageView imageView = this.N0;
        ge geVar = this.M0;
        int i12 = 0;
        if (zVar == null || zVar.getTag() == null) {
            qo0 qo0Var = this.l0;
            if (qo0Var == null || qo0Var.getVisibility() != 0) {
                ((ViewGroup.MarginLayoutParams) geVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                }
                jf jfVar = this.A0;
                if (jfVar != null) {
                    ((ViewGroup.MarginLayoutParams) jfVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
                RichMessageLayout.PreviewView previewView = this.x1;
                if (previewView != null) {
                    ((ViewGroup.MarginLayoutParams) previewView.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
            } else {
                int i13 = this.l0.getLayoutParams().width;
                this.l0.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.l0.getLayoutParams().height, TLObject.FLAG_30));
                ((ViewGroup.MarginLayoutParams) geVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i13;
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i13;
                }
                jf jfVar2 = this.A0;
                if (jfVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) jfVar2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i13;
                }
                RichMessageLayout.PreviewView previewView2 = this.x1;
                if (previewView2 != null) {
                    ((ViewGroup.MarginLayoutParams) previewView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i13;
                }
            }
        } else {
            this.h0.measure(i10, i11);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) geVar.getLayoutParams();
            int dp = AndroidUtilities.dp(10.0f);
            ph.z zVar2 = this.h0;
            marginLayoutParams.leftMargin = dp + (zVar2 == null ? 0 : zVar2.getMeasuredWidth());
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int dp2 = AndroidUtilities.dp(10.0f);
                ph.z zVar3 = this.h0;
                marginLayoutParams2.leftMargin = dp2 + (zVar3 == null ? 0 : zVar3.getMeasuredWidth());
            }
            jf jfVar3 = this.A0;
            if (jfVar3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) jfVar3.getLayoutParams();
                int dp3 = AndroidUtilities.dp(57.0f);
                ph.z zVar4 = this.h0;
                marginLayoutParams3.leftMargin = dp3 + (zVar4 == null ? 0 : zVar4.getMeasuredWidth());
            }
            RichMessageLayout.PreviewView previewView3 = this.x1;
            if (previewView3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) previewView3.getLayoutParams();
                int dp4 = AndroidUtilities.dp(57.0f);
                ph.z zVar5 = this.h0;
                marginLayoutParams4.leftMargin = dp4 + (zVar5 == null ? 0 : zVar5.getMeasuredWidth());
            }
        }
        C1();
        super.onMeasure(i10, i11);
        ph.e3 e3Var = this.g0;
        if (e3Var != null) {
            ph.z zVar6 = this.h0;
            if (zVar6 != null) {
                e3Var.setMeasuredButtonWidth(zVar6.getMeasuredWidth());
            }
            this.g0.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(2.0f);
            measureChild(this.g0, i10, i11);
        }
        L();
        M();
        if (measuredHeight <= 0 || deVar.getMeasuredHeight() == measuredHeight) {
            return;
        }
        while (i12 < 2) {
            ImageView imageView2 = i12 == 0 ? this.o1 : this.p1;
            imageView2.setTranslationY((imageView2.getTranslationY() + deVar.getMeasuredHeight()) - measuredHeight);
            imageView2.animate().translationY(0.0f).setInterpolator(jr.h).setDuration(420L).start();
            i12++;
        }
        nh.t3 t3Var = this.I;
        if (t3Var != null) {
            t3Var.setTranslationY((t3Var.getTranslationY() + deVar.getMeasuredHeight()) - measuredHeight);
            org.telegram.ui.b.q(this.I.animate().translationY(0.0f), jr.h, 420L);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 && this.u3) {
            m1(0, false);
            this.Q0.t(false);
            n1(false, false, false, true);
        }
        l71 l71Var = this.b1;
        if (l71Var != null) {
            ArrayList arrayList = l71Var.v;
            if (l71Var.J.isEmpty()) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i14);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            i71 i71Var = l71Var.w;
            if (i71Var != null) {
                i71Var.cancel(true);
                l71Var.w = null;
            }
            l71Var.invalidate();
        }
    }

    public final ValueAnimator p(float f9) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E1.a, f9);
        ofFloat.addUpdateListener(new jd(this, 5));
        return ofFloat;
    }

    public final void p0() {
        this.X2 = null;
        this.W2 = null;
        this.Y2 = null;
        this.Z2 = null;
        l71 l71Var = this.b1;
        if (l71Var != null) {
            l71Var.a(true);
        }
        gk0 gk0Var = this.d1;
        if (gk0Var != null) {
            gk0Var.setAlpha(1.0f);
            this.d1.setTranslationX(0.0f);
        }
        l71 l71Var2 = this.b1;
        if (l71Var2 != null) {
            l71Var2.setAlpha(1.0f);
            this.b1.setTranslationX(0.0f);
        }
        jf jfVar = this.A0;
        if (jfVar != null) {
            jfVar.setAlpha(1.0f);
            this.C = 0.0f;
            J1();
            this.A0.requestFocus();
        }
        de deVar = this.a1;
        if (deVar != null) {
            deVar.setVisibility(8);
        }
        x0();
    }

    public final void p1(boolean z10) {
        org.telegram.ui.tn tnVar;
        boolean z11 = ((!z10 && !this.y1) || (tnVar = this.K2) == null || tnVar.w()) ? false : true;
        if (this.F4 == z11) {
            return;
        }
        if (z11) {
            MessagesController.getInstance(this.M).getTonesController().load();
        }
        this.F4 = z11;
        ImageView imageView = this.o1;
        imageView.setVisibility(0);
        imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(jr.h).setDuration(420L).withEndAction(new sd(this, z11, 0)).start();
        if (!z11) {
            nh.t3 t3Var = this.I;
            if (t3Var != null) {
                t3Var.e(true);
                this.I = null;
                return;
            }
            return;
        }
        k0 k0Var = this.n1;
        Objects.requireNonNull(k0Var);
        imageView.postDelayed(new j0(k0Var, 1), 220L);
        nh.t3 t3Var2 = this.I;
        if (t3Var2 != null) {
            t3Var2.e(true);
            this.I = null;
        }
        if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
            nh.t3 t3Var3 = new nh.t3(getContext(), 3);
            this.I = t3Var3;
            t3Var3.q(true);
            this.I.t(LocaleController.getString(R.string.AIEditorHint));
            this.I.n(0.0f, (imageView.getWidth() / 2.0f) + AndroidUtilities.dp(4.0f));
            addView(this.I, i7.f6.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
            nh.t3 t3Var4 = this.I;
            t3Var4.h0 = new z2(5, this, t3Var3);
            t3Var4.d = 4000L;
            t3Var4.v();
            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
        }
    }

    public final ValueAnimator q(boolean z10) {
        final float alpha = getSendButtonInternal().getAlpha();
        final float f9 = z10 ? 1.0f : 0.0f;
        final float scaleX = getSendButtonInternal().getScaleX();
        final float f10 = z10 ? 1.0f : 0.1f;
        final float scaleY = getSendButtonInternal().getScaleY();
        final float f11 = z10 ? 1.0f : 0.1f;
        if (z10 && alpha < 0.25f && (getSendButtonInternal() instanceof og)) {
            og ogVar = (og) getSendButtonInternal();
            ogVar.a0.d(0.0f, true);
            ogVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ud
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i10 = ChatActivityEnterView.i5;
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.getSendButtonInternal().setAlpha(AndroidUtilities.lerp(alpha, f9, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleX(AndroidUtilities.lerp(scaleX, f10, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleY(AndroidUtilities.lerp(scaleY, f11, floatValue));
            }
        });
        return ofFloat;
    }

    public void q0(boolean z10) {
        if (this.B1 == null || !this.a3) {
            return;
        }
        ld ldVar = this.R;
        if (ldVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ldVar);
        }
        this.a3 = false;
        this.b3 = false;
        if (this.c3) {
            this.b5.a(false, z10);
        }
    }

    public final void q1() {
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar == null || !ChatObject.isChannelAndNotMegaGroup(tnVar.e)) {
            return;
        }
        tc.a0(tnVar).f(MessagesController.getInstance(this.M).captionLengthLimitPremium, new ld(this, 0)).j();
    }

    public final boolean r0() {
        return this.U1 != null;
    }

    public boolean r1(Runnable runnable) {
        return false;
    }

    public final void s(SendMessagesHelper.SendMessageParams sendMessageParams) {
        hg hgVar = this.U2;
        if (hgVar != null) {
            sendMessageParams.replyToStoryItem = hgVar.d1();
            sendMessageParams.replyQuote = this.U2.o0();
        }
    }

    public final boolean s0() {
        return this.Y0;
    }

    public final void s1() {
        t1(1, 0, true, true);
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.q1 q1Var) {
        this.Q = q1Var;
    }

    public void setAnimatedTop(int i10) {
        this.O1 = i10;
    }

    public void setBotInfo(a0.h hVar) {
        X0(hVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f9) {
        this.M0.setTranslationX(f9);
        if (this.A0 != null) {
            this.C = f9;
            J1();
        }
        this.m1.setTranslationX(this.y + this.x + f9);
        this.X0.setTranslationX(f9);
        ve veVar = this.s1;
        if (veVar != null) {
            veVar.setTranslationX(f9);
        }
    }

    public void setButtons(MessageObject messageObject) {
        Z0(messageObject, true, true);
    }

    public void setCaption(String str) {
        jf jfVar = this.A0;
        if (jfVar != null) {
            jfVar.setCaption(str);
            J(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.Y1 = chatFull;
        xf xfVar = this.Q0;
        if (xfVar != null) {
            xfVar.setChatInfo(chatFull);
        }
        pg pgVar = this.B0;
        if (pgVar != null) {
            pgVar.e = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chatFull);
            pgVar.invalidate();
        }
        if (ChatObject.isIgnoredChatRestrictionsForBoosters(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f9) {
        this.x4 = f9;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.E4 = view;
        this.A0.setWindowView(view);
    }

    public void setDelegate(hg hgVar) {
        this.U2 = hgVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.W1 = tL_businessChatLink;
        G1(false);
        if (this.W1 != null) {
            T(true);
            this.A1.setOnClickListener(new nd(this, 3));
            this.A1.setContentDescription(LocaleController.getString(R.string.Done));
            this.A1.setVisibility(0);
            this.A1.setScaleX(0.1f);
            this.A1.setScaleY(0.1f);
            this.A1.setAlpha(0.0f);
            this.A1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(jr.f).start();
            this.V = this.N.getMessagesController().getMaxMessageLength();
            jf jfVar = this.A0;
            TextPaint paint = jfVar != null ? jfVar.getPaint() : null;
            if (paint == null) {
                paint = new TextPaint();
                paint.setTextSize(AndroidUtilities.dp(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.W1.entities;
            if (arrayList == null || (str = tL_businessChatLink.message) == null) {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            } else {
                setFieldText(r(arrayList, str, fontMetricsInt));
            }
            this.X1 = x();
            V0(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.L0.setVisibility(8);
            this.V0.setVisibility(8);
            bg.y3 y3Var = this.k1;
            if (y3Var != null) {
                y3Var.setVisibility(8);
            }
            je jeVar = this.m1;
            if (jeVar != null) {
                this.q1 = 0.0f;
                jeVar.setAlpha(0.0f);
                jeVar.setScaleX(0.5f);
                jeVar.setScaleY(0.5f);
            }
            this.v1.setVisibility(8);
            te teVar = this.E1;
            if (teVar != null) {
                teVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j10) {
        this.N4 = j10;
        re reVar = this.F0;
        if (reVar != null) {
            reVar.setEffect(j10);
        }
    }

    public void setExitTransition(float f9) {
        this.h4 = f9;
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.J2.getSystemService("accessibility");
        if (this.A0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        if (z10 && org.telegram.ui.ActionBar.o2.hasSheets(this.K2)) {
            z10 = false;
        }
        if (z10) {
            if (this.M1 != 0 || this.A0.isFocused()) {
                return;
            }
            ld ldVar = new ld(this, 5);
            this.N1 = ldVar;
            AndroidUtilities.runOnUIThread(ldVar, 600L);
            return;
        }
        jf jfVar = this.A0;
        if (jfVar == null || !jfVar.isFocused()) {
            return;
        }
        if (!this.u2 || this.e2) {
            this.A0.clearFocus();
        }
    }

    @Override // org.telegram.ui.Components.dy0
    public void setFieldText(CharSequence charSequence) {
        f1(charSequence, false);
    }

    public void setInAppInsetsController(ah.f fVar) {
        this.Y4 = fVar;
    }

    public void setLockAnimatedTranslation(float f9) {
        this.g4 = f9;
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new qd(this, 0);
        }
        this.F0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        j1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z10) {
        this.v = z10;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.x1 == null) {
            return;
        }
        if (!MessagesController.getInstance(this.M).richEditorAvailable()) {
            richMessage = null;
        }
        this.z1 = richMessage;
        N1();
    }

    public void setSelection(int i10) {
        jf jfVar = this.A0;
        if (jfVar == null) {
            return;
        }
        jfVar.setSelection(i10, jfVar.length());
    }

    public void setSideButtonsForAttach(ug.g gVar) {
        this.Z4 = gVar;
    }

    public void setSlideToCancelProgress(float f9) {
        this.e4 = f9;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > AndroidUtilities.dp(140.0f)) {
            measuredWidth = AndroidUtilities.dp(140.0f);
        }
        this.o4 = (int) ((1.0f - this.e4) * (-measuredWidth));
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i10) {
        this.C0 = i10;
        S1();
    }

    public void setSnapAnimationProgress(float f9) {
        this.i4 = f9;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z10) {
        this.d0 = z10;
        this.v1.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.i1 = viewGroup;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        this.D4 = z10;
        jf jfVar = this.A0;
        if (jfVar != null) {
            jfVar.setEnabled(z10);
        }
    }

    public void setVoiceDraft(MediaDataController.DraftVoice draftVoice) {
        if (draftVoice == null) {
            return;
        }
        boolean z10 = draftVoice.once;
        this.K = z10;
        lg lgVar = this.J1;
        if (lgVar != null) {
            lgVar.y.d(1, z10, true);
        }
        hg hgVar = this.U2;
        TL_stories.StoryItem d12 = hgVar != null ? hgVar.d1() : null;
        MediaController mediaController = MediaController.getInstance();
        int i10 = this.M;
        long j10 = this.L2;
        MessageObject messageObject = this.O2;
        MessageObject threadMessage = getThreadMessage();
        SendMessageChatArguments sendMessageChatArguments = null;
        int i11 = this.B2;
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar != null) {
            sendMessageChatArguments = tnVar.C8();
        }
        mediaController.prepareResumedRecording(i10, draftVoice, j10, messageObject, threadMessage, d12, i11, sendMessageChatArguments, getSendMonoForumPeerId(), getSendMessageSuggestionParams());
    }

    public boolean t() {
        return false;
    }

    public final boolean t0() {
        return this.S0 || this.T0;
    }

    public final void t1(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        boolean z12;
        int i13;
        ViewGroup viewGroup;
        int i14;
        float f9;
        int i15 = 2;
        if (i10 == 2) {
            return;
        }
        AnimationNotificationsLocker animationNotificationsLocker = this.G3;
        ue ueVar = this.T3;
        Property property = View.TRANSLATION_Y;
        boolean z13 = false;
        if (i10 == 1) {
            if (i11 == 0) {
                if (this.J2 == null && this.Q0 == null) {
                    return;
                } else {
                    U();
                }
            }
            if (i11 == 0) {
                u();
                if (this.S0) {
                    this.Q0.getVisibility();
                }
                this.Q0.setVisibility(0);
                this.S0 = true;
                uf ufVar = this.C1;
                if (ufVar == null || ufVar.getVisibility() == 8) {
                    i13 = 0;
                } else {
                    this.C1.setVisibility(8);
                    this.T0 = false;
                    i13 = this.C1.getMeasuredHeight();
                }
                this.Q0.setShowing(true);
                viewGroup = this.Q0;
                this.j3 = 0;
            } else if (i11 == 1) {
                if (this.T0) {
                    this.C1.getVisibility();
                }
                this.T0 = true;
                xf xfVar = this.Q0;
                if (xfVar == null || xfVar.getVisibility() == 8) {
                    i14 = 0;
                } else {
                    this.i1.removeView(this.Q0);
                    this.Q0.setVisibility(8);
                    this.Q0.setShowing(false);
                    this.S0 = false;
                    i14 = this.Q0.getMeasuredHeight();
                }
                this.C1.setVisibility(0);
                ViewGroup viewGroup2 = this.C1;
                this.j3 = 1;
                MessagesController.getMainSettings(this.M).edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                i13 = i14;
                viewGroup = viewGroup2;
            } else {
                i13 = 0;
                viewGroup = null;
            }
            this.a2 = i11;
            if (this.s2 <= 0) {
                f9 = 200.0f;
                this.s2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            } else {
                f9 = 200.0f;
            }
            if (this.t2 <= 0) {
                this.t2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(f9));
            }
            Point point = AndroidUtilities.displaySize;
            int i16 = point.x > point.y ? this.t2 : this.s2;
            org.telegram.ui.tn tnVar = this.K2;
            if (tnVar != null && tnVar.getParentLayout() != null) {
                i16 -= ((ActionBarLayout) tnVar.getParentLayout()).v(false);
            }
            if (i11 == 1) {
                i16 = Math.min(this.C1.getKeyboardHeight(), i16);
            }
            uf ufVar2 = this.C1;
            if (ufVar2 != null) {
                ufVar2.setPanelHeight(i16);
            }
            if (viewGroup != null && this.Y4 == null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                layoutParams.height = i16;
                viewGroup.setLayoutParams(layoutParams);
            }
            if (!AndroidUtilities.isInMultiwindow) {
                AndroidUtilities.hideKeyboard(this.A0);
            }
            hv0 hv0Var = this.h1;
            if (hv0Var != null) {
                this.v2 = i16;
                hv0Var.requestLayout();
                d1(true, true);
                B1(true);
                G0();
                if (this.d2 && !this.u2 && i16 != i13 && z10) {
                    ld ldVar = new ld(this, 10);
                    if (this.v) {
                        this.w = ldVar;
                    } else {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.R0 = animatorSet;
                        if (this.Y4 != null) {
                            animatorSet.playTogether(ValueAnimator.ofFloat(i16 - i13, 0.0f));
                        } else {
                            float f10 = i16 - i13;
                            viewGroup.setTranslationY(f10);
                            this.R0.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) property, f10, 0.0f));
                        }
                        this.R0.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                        this.R0.setDuration(250L);
                        this.R0.addListener(new bg.c3(20, this, ldVar));
                        AndroidUtilities.runOnUIThread(ueVar, 50L);
                        animationNotificationsLocker.lock();
                    }
                    requestLayout();
                }
            }
            ah.f fVar = this.Y4;
            if (fVar != null) {
                ((ah.i) fVar).g(i16);
            }
        } else {
            if (this.M0 != null) {
                d1(false, true);
            }
            this.a2 = -1;
            xf xfVar2 = this.Q0;
            if (xfVar2 != null) {
                if (i10 == 2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    this.B3 = false;
                    hg hgVar = this.U2;
                    if (hgVar != null) {
                        hgVar.v(0.0f);
                    }
                    this.i1.removeView(this.Q0);
                    this.Q0 = null;
                } else if (!this.d2 || this.u2 || this.u3) {
                    hg hgVar2 = this.U2;
                    if (hgVar2 != null) {
                        hgVar2.v(0.0f);
                    }
                    z13 = false;
                    this.v2 = 0;
                    this.i1.removeView(this.Q0);
                    this.Q0.setVisibility(8);
                    this.Q0.setShowing(false);
                } else {
                    this.S0 = true;
                    this.j3 = 0;
                    xfVar2.setShowing(false);
                    i8 i8Var = new i8(this, i10, i15);
                    if (this.v) {
                        this.w = i8Var;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.R0 = animatorSet2;
                        if (this.Y4 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofFloat(this.Q0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.Q0, (Property<xf, Float>) property, r5.getMeasuredHeight()));
                        }
                        this.R0.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                        this.R0.setDuration(250L);
                        animationNotificationsLocker.lock();
                        this.R0.addListener(new bg.c3(21, this, i8Var));
                    }
                    AndroidUtilities.runOnUIThread(ueVar, 50L);
                    requestLayout();
                    z13 = false;
                }
                this.S0 = z13;
            }
            uf ufVar3 = this.C1;
            if (ufVar3 != null && ufVar3.getVisibility() == 0) {
                if (i10 != 2 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    if (this.d2 && !this.u2) {
                        if (this.T0) {
                            this.j3 = 1;
                        }
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        this.R0 = animatorSet3;
                        if (this.Y4 != null) {
                            i12 = 0;
                            animatorSet3.playTogether(ValueAnimator.ofFloat(this.C1.getMeasuredHeight()));
                        } else {
                            i12 = 0;
                            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.C1, (Property<uf, Float>) property, r5.getMeasuredHeight()));
                        }
                        this.R0.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                        this.R0.setDuration(250L);
                        this.R0.addListener(new bg(this, i10, i12));
                        animationNotificationsLocker.lock();
                        AndroidUtilities.runOnUIThread(ueVar, 50L);
                        requestLayout();
                    } else if (!this.f3) {
                        this.C1.setVisibility(8);
                    }
                }
                this.T0 = false;
            }
            if (i11 == 1 && this.h2 != null) {
                MessagesController.getMainSettings(this.M).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.h2.getId()).apply();
            }
            B1(true);
            ah.f fVar2 = this.Y4;
            if (fVar2 != null) {
                ((ah.i) fVar2).h(z11);
            }
        }
        if (this.s3 || this.t3) {
            J(true);
        }
        if (!this.u3 || i10 == 1) {
            z12 = false;
        } else {
            z12 = false;
            n1(false, false, false, true);
        }
        G1(z12);
        D();
    }

    public final void u() {
        if (this.Q0.getParent() == null) {
            if (this.Y4 == null) {
                this.i1.addView(this.Q0);
            } else {
                this.i1.addView(this.Q0, i7.f6.c(-1.0f, -1));
            }
        }
    }

    public final boolean u0(View view) {
        return view == this.C1 || view == this.Q0;
    }

    public final void u1() {
        hg hgVar = this.U2;
        if ((hgVar == null || !hgVar.l()) && DialogObject.isChatDialog(this.L2)) {
            tc.a0(this.K2).G(R.raw.passcode_lock_close, 3, LocaleController.formatString("SendPlainTextRestrictionHint", R.string.SendPlainTextRestrictionHint, ChatObject.getAllowedSendString(this.N.getMessagesController().getChat(Long.valueOf(-this.L2))))).j();
        }
    }

    public final boolean v() {
        ph.z zVar = this.h0;
        return zVar != null && zVar.v;
    }

    public final boolean v0() {
        return this.A2 && ChatActivityEnterView.this.n4;
    }

    public final void v1(boolean z10) {
        org.telegram.ui.tn tnVar;
        boolean z11 = (this.y1 || z10) && (tnVar = this.K2) != null && !tnVar.w() && this.U1 == null && MessagesController.getInstance(this.M).richEditorAvailable();
        if (this.G4 == z11) {
            return;
        }
        this.G4 = z11;
        ImageView imageView = this.p1;
        imageView.setVisibility(0);
        imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(jr.h).setDuration(420L).withEndAction(new sd(this, z11, 1)).start();
    }

    public final boolean w() {
        dg x4 = x();
        return (TextUtils.equals(x4.a, this.X1.a) && MediaDataController.entitiesEqual((ArrayList<TLRPC.MessageEntity>) this.X1.b, (ArrayList<TLRPC.MessageEntity>) x4.b)) ? false : true;
    }

    public final boolean w0() {
        if (this.A2) {
            return true;
        }
        AnimatorSet animatorSet = this.o2;
        return (animatorSet == null || !animatorSet.isRunning() || this.f2) ? false : true;
    }

    public final void w1() {
        x1(true, false);
    }

    public final dg x() {
        jf jfVar = this.A0;
        CharSequence[] charSequenceArr = {AndroidUtilities.getTrimmedString(jfVar == null ? "" : jfVar.getTextToUse())};
        ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.M).getEntities(charSequenceArr, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = entities.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.MessageEntity messageEntity = entities.get(i10);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        dg dgVar = new dg();
        dgVar.a = charSequence.toString();
        dgVar.b = entities;
        return dgVar;
    }

    public final void x1(boolean z10, boolean z11) {
        if (this.B1 == null || this.a3 || getVisibility() != 0) {
            de deVar = this.a1;
            if ((deVar == null || deVar.getVisibility() != 0) && !this.C2 && this.Q2 == null && this.O2 == null) {
                H0();
                return;
            }
            return;
        }
        de deVar2 = this.a1;
        boolean z12 = (deVar2 == null || deVar2.getVisibility() != 0) && !this.C2 && this.Q2 == null && (this.i2 == null || this.U1 != null);
        if (!z11 && z10 && z12 && !this.u2 && !t0()) {
            H0();
            ld ldVar = this.R;
            if (ldVar != null) {
                AndroidUtilities.cancelRunOnUIThread(ldVar);
            }
            ld ldVar2 = new ld(this, 23);
            this.R = ldVar2;
            AndroidUtilities.runOnUIThread(ldVar2, 200L);
            return;
        }
        this.b3 = true;
        this.a3 = true;
        if (this.c3) {
            this.b5.a(true, z10);
            if (z12) {
                jf jfVar = this.A0;
                if (jfVar != null) {
                    jfVar.requestFocus();
                }
                H0();
            }
        }
    }

    public final float y(boolean z10) {
        vd.c cVar = this.a5;
        float f9 = z10 ? cVar.g ? cVar.f : cVar.e : cVar.e;
        vd.a aVar = this.b5;
        return ((this.B1 != null ? r1.getMeasuredHeight() : 0) * (z10 ? aVar.f ? 1.0f : 0.0f : aVar.e)) + f9;
    }

    public final boolean y0() {
        return this.u3;
    }

    public final boolean y1() {
        org.telegram.ui.tn tnVar = this.K2;
        TLRPC.EncryptedChat encryptedChat = tnVar != null ? tnVar.h : null;
        return encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101;
    }

    public final boolean z0() {
        View view = this.B1;
        return view != null && view.getVisibility() == 0;
    }

    public final void z1() {
        float f9;
        je jeVar = this.m1;
        if (jeVar == null) {
            return;
        }
        float f10 = this.y + this.x;
        re reVar = this.F0;
        if (reVar != null) {
            f9 = reVar.getAlpha() * (-j7.l1.d(56.0f, reVar.l(), 0));
        } else {
            f9 = 0.0f;
        }
        jeVar.setTranslationX(f10 + f9);
    }

    @Override // org.telegram.ui.Components.dy0
    public st getEditField() {
        return this.A0;
    }

    @Override // org.telegram.ui.Components.dy0
    public org.telegram.ui.tn getParentFragment() {
        return this.K2;
    }

    public void A0(float f9) {
    }

    public void h0(Menu menu) {
    }

    public void x0() {
    }

    public void C0(int i10, int i11) {
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }
}
