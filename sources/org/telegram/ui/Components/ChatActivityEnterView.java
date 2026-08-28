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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class ChatActivityEnterView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, wu0, zw0, sx0, td.b, org.telegram.ui.ActionBar.w5 {
    public static final /* synthetic */ int i5 = 0;
    public float A;
    public ff A0;
    public oe A1;
    public boolean A2;
    public AnimatedArrowDrawable A3;
    public final hd A4;
    public float B;
    public final mg B0;
    public View B1;
    public int B2;
    public boolean B3;
    public org.telegram.ui.ActionBar.g1 B4;
    public float C;
    public int C0;
    public rf C1;
    public boolean C2;
    public final re C3;
    public ArrayList C4;
    public float D;
    public hd D0;
    public final ImageView D1;
    public boolean D2;
    public boolean D3;
    public boolean D4;
    public float E;
    public final gh.j5 E0;
    public qe E1;
    public boolean E2;
    public boolean E3;
    public View E4;
    public boolean F;
    public final oe F0;
    public se F1;
    public boolean F2;
    public final zf F3;
    public boolean F4;
    public TLRPC.UserFull G;
    public int G0;
    public boolean G1;
    public int G2;
    public final AnimationNotificationsLocker G3;
    public boolean G4;
    public kh.x3 H;
    public cf H0;
    public AnimatorSet H1;
    public boolean H2;
    public final Paint H3;
    public boolean H4;
    public kh.x3 I;
    public long I0;
    public RecordCircle I1;
    public final int[] I2;
    public Drawable I3;
    public hd I4;
    public kh.x3 J;
    public bf J0;
    public ig J1;
    public final Activity J2;
    public Drawable J3;
    public final eq[] J4;
    public boolean K;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K0;
    public final ne K1;
    public final org.telegram.ui.qn K2;
    public Drawable K3;
    public int K4;
    public boolean L;
    public final ImageView L0;
    public final Paint L1;
    public long L2;
    public Drawable L3;
    public int L4;
    public int M;
    public final de M0;
    public int M1;
    public boolean M2;
    public Drawable M3;
    public boolean M4;
    public AccountInstance N;
    public final ImageView N0;
    public hd N1;
    public int N2;
    public final RectF N3;
    public long N4;
    public boolean O;
    public se O0;
    public int O1;
    public MessageObject O2;
    public final Rect O3;
    public BotForumHelper.SteamingSendButtonState O4;
    public int P;
    public boolean P0;
    public bl0 P1;
    public MessageObject P2;
    public final Rect P3;
    public fh.s P4;
    public org.telegram.ui.ActionBar.q1 Q;
    public uf Q0;
    public Editable Q1;
    public org.telegram.ui.gn Q2;
    public Drawable Q3;
    public int Q4;
    public hd R;
    public AnimatorSet R0;
    public boolean R1;
    public MessageObject R2;
    public final org.telegram.ui.ActionBar.b6 R3;
    public int R4;
    public org.telegram.ui.wq S;
    public boolean S0;
    public boolean S1;
    public TLRPC.WebPage S2;
    public final boolean S3;
    public a0.h S4;
    public boolean T;
    public boolean T0;
    public boolean T1;
    public boolean T2;
    public final re T3;
    public final Paint T4;
    public NumberTextView U;
    public ng U0;
    public MessageObject U1;
    public eg U2;
    public final zd U3;
    public final LinearGradient U4;
    public int V;
    public final le V0;
    public boolean V1;
    public wf V2;
    public final zd V3;
    public final Matrix V4;
    public int W;
    public boolean W0;
    public TL_account.TL_businessChatLink W1;
    public TLRPC.TL_document W2;
    public final zd W3;
    public final y5 W4;
    public final me X0;
    public ag X1;
    public String X2;
    public final zd X3;
    public final y5 X4;
    public boolean Y0;
    public TLRPC.ChatFull Y1;
    public MessageObject Y2;
    public final zd Y3;
    public xg.f Y4;
    public dh.g Z0;
    public boolean Z1;
    public VideoEditedInfo Z2;
    public boolean Z3;
    public rg.g Z4;
    public int a;
    public dr a0;
    public ae a1;
    public int a2;
    public boolean a3;
    public long a4;
    public final td.c a5;
    public boolean b;
    public Runnable b0;
    public z61 b1;
    public boolean b2;
    public boolean b3;
    public float b4;
    public final td.a b5;
    public org.telegram.ui.ActionBar.g1 c;
    public boolean c0;
    public pi0 c1;
    public boolean c2;
    public boolean c3;
    public float c4;
    public final td.a c5;
    public LinearLayout d;
    public boolean d0;
    public vj0 d1;
    public boolean d2;
    public MessageObject d3;
    public float d4;
    public final td.a d5;
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
    public mh.v3 g0;
    public kg g1;
    public boolean g2;
    public boolean g3;
    public float g4;
    public boolean g5;
    public float h;
    public mh.c0 h0;
    public final xu0 h1;
    public MessageObject h2;
    public boolean h3;
    public float h4;
    public int h5;
    public df i0;
    public ViewGroup i1;
    public TLRPC.TL_replyKeyboardMarkup i2;
    public boolean i3;
    public float i4;
    public mh.b0 j0;
    public int j1;
    public int j2;
    public int j3;
    public float j4;
    public boolean k0;
    public final gh.m k1;
    public boolean k2;
    public boolean k3;
    public float k4;
    public fo0 l0;
    public ViewPropertyAnimator l1;
    public PowerManager.WakeLock l2;
    public boolean l3;
    public float l4;
    public ve m0;
    public final ge m1;
    public AnimatorSet m2;
    public final re m3;
    public boolean m4;
    public float n;
    public yd n0;
    public final i0 n1;
    public AnimatorSet n2;
    public final ye n3;
    public boolean n4;
    public int o0;
    public final ImageView o1;
    public AnimatorSet o2;
    public final org.telegram.ui.Cells.c1 o3;
    public int o4;
    public int p0;
    public final ImageView p1;
    public AnimatorSet p2;
    public final kf p3;
    public long p4;
    public yd q0;
    public float q1;
    public int q2;
    public final nf q3;
    public boolean q4;
    public float r;
    public ValueAnimator r0;
    public ImageView r1;
    public int r2;
    public final Paint r3;
    public ValueAnimator r4;
    public float s;
    public float s0;
    public se s1;
    public int s2;
    public boolean s3;
    public boolean s4;
    public boolean t0;
    public final ce t1;
    public int t2;
    public boolean t3;
    public boolean t4;
    public boolean u0;
    public final ae u1;
    public boolean u2;
    public boolean u3;
    public boolean u4;
    public boolean v;
    public boolean v0;
    public final ae v1;
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

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        public final t9 h;
        public final t9 n;
        public final float r;
        public final float s;
        public final RectF v;
        public boolean w;
        public final jg x;
        public int y;

        public RecordCircle(Context context) {
            super(context);
            t9 t9Var = new t9(11, LiteMode.FLAGS_CHAT);
            this.h = t9Var;
            t9 t9Var2 = new t9(12, LiteMode.FLAGS_CHAT);
            this.n = t9Var2;
            this.r = AndroidUtilities.dpf2(41.0f);
            this.s = AndroidUtilities.dp(30.0f);
            this.v = new RectF();
            this.D = 0.0f;
            this.E = true;
            jg jgVar = new jg(this, this);
            this.x = jgVar;
            r0.j0.k(this, jgVar);
            t9Var.a = AndroidUtilities.dp(47.0f);
            t9Var.b = AndroidUtilities.dp(55.0f);
            t9Var.b();
            t9Var2.a = AndroidUtilities.dp(47.0f);
            t9Var2.b = AndroidUtilities.dp(55.0f);
            t9Var2.b();
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
            int i9 = org.telegram.ui.ActionBar.f6.bf;
            int h02 = chatActivityEnterView.h0(i9);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(h02, mode));
            chatActivityEnterView.L3 = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            chatActivityEnterView.L3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.h0(i9), mode));
            chatActivityEnterView.M3 = getResources().getDrawable(R.drawable.attach_send).mutate();
            chatActivityEnterView.M3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.h0(i9), mode));
            chatActivityEnterView.I3 = getResources().getDrawable(R.drawable.input_mic).mutate();
            Drawable drawable2 = chatActivityEnterView.I3;
            int i10 = org.telegram.ui.ActionBar.f6.Wk;
            drawable2.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.h0(i10), mode));
            chatActivityEnterView.J3 = getResources().getDrawable(R.drawable.input_video).mutate();
            chatActivityEnterView.J3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.h0(i10), mode));
        }

        public final void b(Canvas canvas, Drawable drawable, Drawable drawable2, float f10, int i9) {
            a();
            if (f10 != 0.0f && f10 != 1.0f && drawable2 != null) {
                canvas.save();
                canvas.scale(f10, f10, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                float f11 = i9;
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
                drawable.setAlpha(i9);
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
            chatActivityEnterView.w0();
            chatActivityEnterView.h4 = 0.0f;
            chatActivityEnterView.c4 = 0.0f;
            chatActivityEnterView.b4 = 0.0f;
            chatActivityEnterView.Z3 = false;
            this.f = 0.0f;
            chatActivityEnterView.m4 = false;
            ig igVar = chatActivityEnterView.J1;
            if (igVar != null) {
                igVar.invalidate();
            }
        }

        public final void d() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.n4 = false;
            invalidate();
            ig igVar = chatActivityEnterView.J1;
            if (igVar != null) {
                igVar.invalidate();
            }
        }

        @Override // android.view.View
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            return super.dispatchHoverEvent(motionEvent) || this.x.f(motionEvent);
        }

        public final void e() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.H3;
            int i9 = org.telegram.ui.ActionBar.f6.cf;
            paint.setColor(chatActivityEnterView.h0(i9));
            this.h.d.setColor(i0.a.k(chatActivityEnterView.h0(i9), 38));
            this.n.d.setColor(i0.a.k(chatActivityEnterView.h0(i9), 76));
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
            ig igVar = ChatActivityEnterView.this.J1;
            if (igVar != null) {
                igVar.invalidate();
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
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            Paint paint;
            float f20;
            float f21;
            Drawable drawable;
            Drawable drawable2;
            boolean isEnabled;
            int i9;
            Drawable drawable3;
            Paint paint2;
            float f22;
            Drawable drawable4;
            Drawable drawable5;
            vj0 vj0Var;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Rect rect = chatActivityEnterView.O3;
            Paint paint3 = chatActivityEnterView.H3;
            if (this.J) {
                return;
            }
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp2(26.0f);
            int dp = (int) (AndroidUtilities.dp(170.0f) + 0.0f);
            this.F = chatActivityEnterView.o4 + measuredWidth;
            float f23 = dp;
            this.G = f23;
            float f24 = chatActivityEnterView.c4;
            float f25 = f24 <= 0.5f ? f24 / 0.5f : f24 <= 0.75f ? 1.0f - (((f24 - 0.5f) / 0.25f) * 0.1f) : (((f24 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
            long currentTimeMillis = System.currentTimeMillis() - this.d;
            float f26 = this.b;
            float f27 = this.a;
            if (f26 != f27) {
                f10 = 0.25f;
                float f28 = this.c;
                f11 = 1.0f;
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
                f10 = 0.25f;
                f11 = 1.0f;
            }
            float interpolation = ((this.s * this.a) + this.r) * f25 * (chatActivityEnterView.m4 ? gr.g.getInterpolation(f11 - chatActivityEnterView.e4) * 0.7f : (chatActivityEnterView.e4 * 0.3f) + 0.7f);
            this.e = 0.0f;
            float f30 = chatActivityEnterView.k4;
            if (f30 == 0.0f || chatActivityEnterView.d1 == null) {
                float f31 = chatActivityEnterView.h4;
                if (f31 != 0.0f) {
                    float f32 = f31 > 0.6f ? 1.0f : f31 / 0.6f;
                    if (!chatActivityEnterView.c0) {
                        f31 = Math.max(0.0f, (f31 - 0.6f) / 0.4f);
                    }
                    gr grVar = gr.j;
                    float interpolation2 = grVar.getInterpolation(f32);
                    float interpolation3 = grVar.getInterpolation(f31);
                    interpolation = (1.0f - interpolation3) * ((AndroidUtilities.dp(16.0f) * interpolation2) + interpolation);
                    if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                        float f33 = chatActivityEnterView.h4;
                        if (f33 > 0.6f) {
                            f15 = interpolation2;
                            f14 = Math.max(0.0f, 1.0f - ((f33 - 0.6f) / 0.4f));
                            f13 = interpolation3;
                            f12 = 0.0f;
                        }
                    }
                    f13 = interpolation3;
                    f15 = interpolation2;
                    f12 = 0.0f;
                } else {
                    f12 = 0.0f;
                    f13 = 0.0f;
                    f14 = 1.0f;
                    f15 = 0.0f;
                }
                if (chatActivityEnterView.m4) {
                    float f34 = chatActivityEnterView.e4;
                    if (f34 > 0.7f) {
                        f14 *= 1.0f - ((f34 - 0.7f) / 0.3f);
                    }
                }
                if (this.e <= 0.0f) {
                    f16 = 0.7f;
                    f17 = 0.0f;
                    paint3.setColor(i0.a.d(this.e, chatActivityEnterView.h0(org.telegram.ui.ActionBar.f6.cf), chatActivityEnterView.h0(org.telegram.ui.ActionBar.f6.kf)));
                } else {
                    f16 = 0.7f;
                    f17 = 0.0f;
                    paint3.setColor(chatActivityEnterView.h0(org.telegram.ui.ActionBar.f6.cf));
                }
                a();
                Drawable drawable6 = null;
                if (chatActivityEnterView.n4) {
                    f18 = interpolation;
                    f19 = f12;
                    paint = paint3;
                    f20 = f13;
                    f21 = 12.0f;
                    drawable = chatActivityEnterView.Y0 ? chatActivityEnterView.L3 : chatActivityEnterView.K3;
                    rect.set(measuredWidth - AndroidUtilities.dp(12.0f), dp - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + measuredWidth, AndroidUtilities.dp(12.0f) + dp);
                    drawable2 = null;
                } else {
                    float f35 = this.f;
                    if (f35 != 1.0f) {
                        f21 = 12.0f;
                        float f36 = (currentTimeMillis / 150.0f) + f35;
                        this.f = f36;
                        if (f36 > 1.0f) {
                            this.f = 1.0f;
                        }
                        drawable6 = chatActivityEnterView.Y0 ? chatActivityEnterView.L3 : chatActivityEnterView.K3;
                    } else {
                        f21 = 12.0f;
                    }
                    Drawable drawable7 = drawable6;
                    drawable = chatActivityEnterView.M3;
                    f20 = f13;
                    f19 = f12;
                    paint = paint3;
                    f18 = interpolation;
                    rect.set(org.telegram.messenger.ll.x(2, measuredWidth, drawable), org.telegram.messenger.ll.e(2, dp, drawable), org.telegram.messenger.ll.B(2, measuredWidth, drawable), org.telegram.messenger.ll.z(2, dp, drawable));
                    if (drawable7 != null) {
                        drawable7.setBounds(org.telegram.messenger.ll.x(2, measuredWidth, drawable7), org.telegram.messenger.ll.e(2, dp, drawable7), org.telegram.messenger.ll.B(2, measuredWidth, drawable7), org.telegram.messenger.ll.z(2, dp, drawable7));
                    }
                    drawable2 = drawable7;
                }
                drawable.setBounds(rect);
                if (this.w) {
                    float f37 = chatActivityEnterView.j4 - 0.01f;
                    chatActivityEnterView.j4 = f37;
                    if (f37 < f17) {
                        this.w = true;
                        chatActivityEnterView.j4 = 0.0f;
                    }
                } else {
                    float f38 = chatActivityEnterView.j4 + 0.01f;
                    chatActivityEnterView.j4 = f38;
                    if (f38 > 1.0f) {
                        this.w = false;
                        chatActivityEnterView.j4 = 1.0f;
                    }
                }
                isEnabled = LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                t9 t9Var = this.n;
                t9 t9Var2 = this.h;
                if (isEnabled) {
                    t9Var2.a = AndroidUtilities.dp(47.0f);
                    t9Var2.b = (AndroidUtilities.dp(15.0f) * 0.6f) + AndroidUtilities.dp(47.0f);
                    t9Var.a = AndroidUtilities.dp(50.0f);
                    t9Var.b = (AndroidUtilities.dp(f21) * 0.6f) + AndroidUtilities.dp(50.0f);
                    t9Var.f(currentTimeMillis);
                    t9Var.e(t9Var.t, 1.01f);
                    t9Var2.f(currentTimeMillis);
                    t9Var2.e(t9Var2.t, 1.02f);
                }
                this.d = System.currentTimeMillis();
                float f39 = chatActivityEnterView.e4;
                float f40 = f39 <= f16 ? 1.0f : f39 / f16;
                if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT) && f19 != 1.0f && f20 < 0.4f && f40 > 0.0f && !chatActivityEnterView.m4) {
                    if (this.E) {
                        float f41 = this.D;
                        if (f41 != 1.0f) {
                            float f42 = f41 + 0.04f;
                            this.D = f42;
                            if (f42 > 1.0f) {
                                this.D = 1.0f;
                            }
                        }
                    }
                    if (!this.I) {
                        float interpolation4 = gr.g.getInterpolation(this.D);
                        canvas.save();
                        float f43 = 1.0f - f15;
                        float B = e2.c.B(t9Var.t, 1.4f, 0.878f, e2.c.C(chatActivityEnterView.c4, f43, f40, interpolation4));
                        canvas.scale(B, B, chatActivityEnterView.o4 + measuredWidth, f23);
                        t9Var.a(chatActivityEnterView.o4 + measuredWidth, f23, canvas, t9Var.d);
                        canvas.restore();
                        float C = ((t9Var2.t * 1.4f) + 0.926f) * e2.c.C(chatActivityEnterView.c4, f43, f40, interpolation4);
                        canvas.save();
                        canvas.scale(C, C, chatActivityEnterView.o4 + measuredWidth, f23);
                        t9Var2.a(chatActivityEnterView.o4 + measuredWidth, f23, canvas, t9Var2.d);
                        canvas.restore();
                    }
                }
                float max = (chatActivityEnterView.m4 || chatActivityEnterView.e4 >= 1.0f) ? f18 : Math.max(f18, AndroidUtilities.dp(19.0f));
                if (this.I) {
                    paint2 = paint;
                    paint2.setAlpha((int) (this.y * f14));
                    if (chatActivityEnterView.c4 == 1.0f) {
                        if (chatActivityEnterView.k4 == 0.0f) {
                            drawable4 = drawable2;
                            i9 = measuredWidth;
                            drawable5 = drawable;
                            f22 = 1.0f;
                            canvas.drawCircle(i9 + chatActivityEnterView.o4, f23, max, paint2);
                        } else if (chatActivityEnterView.Y0 || this.e <= 0.0f || (vj0Var = chatActivityEnterView.d1) == null) {
                            drawable4 = drawable2;
                            i9 = measuredWidth;
                            drawable5 = drawable;
                            f22 = 1.0f;
                            canvas.drawCircle(i9 + chatActivityEnterView.o4, f23, (1.0f - this.e) * max, paint2);
                        } else {
                            float f44 = f23 + max;
                            float f45 = f23 - max;
                            float f46 = chatActivityEnterView.o4 + measuredWidth;
                            float f47 = f46 + max;
                            float f48 = f46 - max;
                            drawable4 = drawable2;
                            int i10 = 0;
                            int i11 = 0;
                            for (View view = (View) vj0Var.getParent(); view != getParent(); view = (View) view.getParent()) {
                                i11 = (int) (view.getY() + i11);
                                i10 = (int) (view.getX() + i10);
                            }
                            float f49 = i11;
                            float y10 = (vj0Var.getY() + f49) - getY();
                            float y11 = ((vj0Var.getY() + vj0Var.getMeasuredHeight()) + f49) - getY();
                            float f50 = i10;
                            float x10 = (((vj0Var.getX() + vj0Var.getMeasuredWidth()) + f50) - getX()) - chatActivityEnterView.E;
                            float x11 = ((vj0Var.getX() + f50) - getX()) + chatActivityEnterView.E;
                            i9 = measuredWidth;
                            float measuredHeight = chatActivityEnterView.Y0 ? 0.0f : vj0Var.getMeasuredHeight() / 2.0f;
                            drawable5 = drawable;
                            float lerp = AndroidUtilities.lerp(f45, y10, this.e);
                            float lerp2 = AndroidUtilities.lerp(f44, y11, this.e);
                            float lerp3 = AndroidUtilities.lerp(f48, x11, this.e);
                            float lerp4 = AndroidUtilities.lerp(f47, x10, this.e);
                            AndroidUtilities.lerp(max, measuredHeight, this.e);
                            RectF rectF = this.v;
                            rectF.set(lerp3, lerp, lerp4, lerp2);
                            chatActivityEnterView.d1.a(canvas, rectF);
                            f22 = 1.0f;
                        }
                        canvas.save();
                        canvas.translate(chatActivityEnterView.o4, 0.0f);
                        drawable3 = drawable5;
                        drawable2 = drawable4;
                        b(canvas, drawable3, drawable2, this.f, (int) org.telegram.messenger.l0.y(f22, f19, f22 - f20, 255.0f));
                        canvas.restore();
                        if (chatActivityEnterView.c4 != f22) {
                            canvas.drawCircle(i9 + chatActivityEnterView.o4, f23, max, paint2);
                            float f51 = chatActivityEnterView.m4 ? f22 - chatActivityEnterView.e4 : 1.0f;
                            canvas.save();
                            canvas.translate(chatActivityEnterView.o4, 0.0f);
                            b(canvas, drawable3, drawable2, this.f, (int) (f51 * 255.0f));
                            canvas.restore();
                        }
                        this.H = max;
                    }
                    i9 = measuredWidth;
                    drawable3 = drawable;
                } else {
                    i9 = measuredWidth;
                    drawable3 = drawable;
                    paint2 = paint;
                }
                f22 = 1.0f;
                if (chatActivityEnterView.c4 != f22) {
                }
                this.H = max;
            }
            float f52 = f30 > 0.38f ? 1.0f : f30 / 0.38f;
            float max2 = f30 > 0.63f ? 1.0f : Math.max(0.0f, (f30 - 0.38f) / f10);
            this.e = Math.max(0.0f, ((chatActivityEnterView.k4 - 0.38f) - f10) / 0.37f);
            gr grVar2 = gr.j;
            float interpolation5 = grVar2.getInterpolation(f52);
            f12 = grVar2.getInterpolation(max2);
            this.e = grVar2.getInterpolation(this.e);
            float dp2 = (AndroidUtilities.dp(16.0f) * interpolation5) + interpolation;
            float dp3 = AndroidUtilities.dp(8.0f);
            interpolation = e2.c.z(1.0f, f12, dp2 - dp3, dp3);
            f15 = interpolation5;
            f13 = 0.0f;
            f14 = 1.0f;
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
            t9 t9Var3 = this.n;
            t9 t9Var22 = this.h;
            if (isEnabled) {
            }
            this.d = System.currentTimeMillis();
            float f392 = chatActivityEnterView.e4;
            if (f392 <= f16) {
            }
            if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                if (this.E) {
                }
                if (!this.I) {
                }
            }
            float max3 = (chatActivityEnterView.m4 || chatActivityEnterView.e4 >= 1.0f) ? f18 : Math.max(f18, AndroidUtilities.dp(19.0f));
            if (this.I) {
            }
            f22 = 1.0f;
            if (chatActivityEnterView.c4 != f22) {
            }
            this.H = max3;
        }

        @Override // android.view.View
        public final void onMeasure(int i9, int i10) {
            View.MeasureSpec.getSize(i9);
            super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(194.0f), TLObject.FLAG_30));
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

        public void setControlsScale(float f10) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.d4 = f10;
            ig igVar = chatActivityEnterView.J1;
            if (igVar != null) {
                igVar.invalidate();
            }
        }

        public void setScale(float f10) {
            ChatActivityEnterView.this.c4 = f10;
            invalidate();
        }

        public void setTransformToSeekbar(float f10) {
            ChatActivityEnterView.this.k4 = f10;
            invalidate();
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
            int i9 = org.telegram.ui.ActionBar.f6.Wk;
            int i10 = ChatActivityEnterView.i5;
            paint.setColor(ChatActivityEnterView.this.h0(i9));
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
            int i9 = org.telegram.ui.ActionBar.f6.nf;
            int i10 = ChatActivityEnterView.i5;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int h02 = chatActivityEnterView.h0(i9);
            this.a.setColor(h02);
            int i11 = org.telegram.ui.ActionBar.f6.mf;
            int h03 = chatActivityEnterView.h0(i11);
            this.b.setColor(h03);
            this.s = r2.getAlpha();
            this.v = r4.getAlpha();
            org.telegram.ui.Cells.z h04 = org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(60.0f), 0, i0.a.k(chatActivityEnterView.h0(i11), 26));
            this.G = h04;
            h04.setCallback(this);
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
            float f10;
            float f11;
            float f12;
            float f13;
            if (this.C == null || (staticLayout = this.D) == null) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.I1 == null) {
                return;
            }
            int dp = AndroidUtilities.dp(16.0f) + staticLayout.getWidth();
            int h02 = chatActivityEnterView.h0(org.telegram.ui.ActionBar.f6.nf);
            TextPaint textPaint = this.a;
            textPaint.setColor(h02);
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
            int i9 = this.A;
            boolean z11 = i9 >= 0;
            int dp4 = AndroidUtilities.dp(5.0f) + ((int) ((getMeasuredWidth() - this.f) / 2.0f));
            int measuredWidth = (int) ((getMeasuredWidth() - this.h) / 2.0f);
            float primaryHorizontal = z11 ? this.C.getPrimaryHorizontal(i9) : 0.0f;
            if (z11) {
                f10 = 16.0f;
                f11 = (dp4 + primaryHorizontal) - measuredWidth;
            } else {
                f10 = 16.0f;
                f11 = 0.0f;
            }
            float f14 = dp4;
            float f15 = this.w;
            float f16 = this.n;
            float dp5 = (((((1.0f - f16) * f15) * this.r) + f14) - (f11 * f16)) + AndroidUtilities.dp(f10);
            float dp6 = z11 ? 0.0f : this.n * AndroidUtilities.dp(12.0f);
            if (this.n != 1.0f) {
                f12 = 12.0f;
                int translationX = (int) ((chatActivityEnterView.I1.getTranslationX() * 0.3f) + ((1.0f - this.r) * ((-getMeasuredWidth()) / 4)));
                canvas.save();
                ng ngVar = chatActivityEnterView.U0;
                f13 = 2.0f;
                canvas.clipRect((ngVar == null ? 0.0f : ngVar.getLeftProperty()) + AndroidUtilities.dp(4.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.save();
                int i10 = (int) dp5;
                canvas.translate((i10 - AndroidUtilities.dp(z10 ? 7.0f : 10.0f)) + translationX, dp6);
                canvas.drawPath(this.B, paint);
                canvas.restore();
                canvas.save();
                canvas.translate(i10 + translationX, ((getMeasuredHeight() - this.C.getHeight()) / 2.0f) + dp6);
                this.C.draw(canvas);
                canvas.restore();
                canvas.restore();
            } else {
                f12 = 12.0f;
                f13 = 2.0f;
            }
            float measuredHeight = (getMeasuredHeight() - this.D.getHeight()) / f13;
            if (!z11) {
                measuredHeight -= AndroidUtilities.dp(f12) - dp6;
            }
            float f17 = z11 ? dp5 + primaryHorizontal : measuredWidth;
            Rect rect = this.F;
            rect.set((int) f17, (int) measuredHeight, (int) (this.D.getWidth() + f17), (int) (this.D.getHeight() + measuredHeight));
            rect.inset(-AndroidUtilities.dp(f10), -AndroidUtilities.dp(f10));
            if (this.n > 0.0f) {
                this.G.setBounds((getMeasuredWidth() / 2) - dp, (getMeasuredHeight() / 2) - dp, (getMeasuredWidth() / 2) + dp, (getMeasuredHeight() / 2) + dp);
                this.G.draw(canvas);
                canvas.save();
                canvas.translate(f17, measuredHeight);
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
        public final void onMeasure(int i9, int i10) {
            super.onMeasure(i9, i10);
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
                    float f10 = measuredHeight2;
                    path.setLastPoint(AndroidUtilities.dpf2(2.5f), f10 - AndroidUtilities.dpf2(3.12f));
                    path.lineTo(0.0f, f10);
                    path.lineTo(AndroidUtilities.dpf2(2.5f), AndroidUtilities.dpf2(3.12f) + f10);
                } else {
                    float f11 = measuredHeight2;
                    path.setLastPoint(AndroidUtilities.dpf2(4.0f), f11 - AndroidUtilities.dpf2(5.0f));
                    path.lineTo(0.0f, f11);
                    path.lineTo(AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(5.0f) + f11);
                }
                int i11 = (int) this.f;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.C = new StaticLayout(this.d, textPaint, i11, alignment, 1.0f, 0.0f, false);
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
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            Rect rect = this.F;
            if (action == 0) {
                boolean contains = rect.contains(x10, y10);
                this.E = contains;
                if (contains) {
                    this.G.setHotspot(x10, y10);
                    setPressed(true);
                }
                return this.E;
            }
            boolean z10 = this.E;
            if (!z10) {
                return z10;
            }
            if (motionEvent.getAction() == 2 && !rect.contains(x10, y10)) {
                setPressed(false);
                return false;
            }
            if (motionEvent.getAction() == 1 && rect.contains(x10, y10)) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                long j10 = 0;
                if (chatActivityEnterView.Z1 && chatActivityEnterView.Y0) {
                    CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.C3);
                    chatActivityEnterView.U2.U1(5, 0, chatActivityEnterView.K ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.N4, 0L, true);
                    oe oeVar = chatActivityEnterView.F0;
                    chatActivityEnterView.N4 = 0L;
                    oeVar.setEffect(0L);
                } else {
                    chatActivityEnterView.U2.L0(0);
                    MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.K, 0L);
                }
                chatActivityEnterView.W2 = null;
                chatActivityEnterView.Y2 = null;
                chatActivityEnterView.Z2 = null;
                chatActivityEnterView.e1 = 0L;
                chatActivityEnterView.A2 = false;
                MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.M);
                long j11 = chatActivityEnterView.L2;
                org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
                if (qnVar != null && qnVar.d4) {
                    j10 = qnVar.b();
                }
                mediaDataController.pushDraftVoiceMessage(j11, j10, null);
                chatActivityEnterView.L1(2, true);
                chatActivityEnterView.J(true);
            }
            return true;
        }

        public void setCancelToProgress(float f10) {
            this.n = f10;
        }

        @Override // android.view.View
        public final boolean verifyDrawable(Drawable drawable) {
            return this.G == drawable || super.verifyDrawable(drawable);
        }
    }

    public ChatActivityEnterView(Activity activity, xu0 xu0Var, org.telegram.ui.qn qnVar, boolean z10, final org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity);
        int i9;
        String str;
        eg egVar;
        this.h = 1.0f;
        this.n = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.E = 0.0f;
        final int i10 = 1;
        this.F = true;
        int i11 = UserConfig.selectedAccount;
        this.M = i11;
        this.N = AccountInstance.getInstance(i11);
        this.P = 1;
        this.V = -1;
        this.h5 = 1;
        this.t0 = true;
        this.u0 = true;
        this.v0 = true;
        this.x0 = new HashMap();
        new fe(0);
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
        this.m3 = new re(this, 0);
        this.n3 = new ye(this);
        this.o3 = new org.telegram.ui.Cells.c1(Integer.class, "translationY", 1);
        this.p3 = new kf(Float.class, "scale");
        this.q3 = new nf(Float.class, "controlsScale");
        this.r3 = new Paint(1);
        this.C3 = new re(this, i10);
        this.F3 = new zf(this);
        this.G3 = new AnimationNotificationsLocker();
        this.H3 = new Paint(1);
        this.N3 = new RectF();
        this.O3 = new Rect();
        this.P3 = new Rect();
        this.T3 = new re(this, 2);
        this.U3 = new zd(this, 0);
        this.V3 = new zd(this, 1);
        this.W3 = new zd(this, 2);
        this.X3 = new zd(this, 3);
        this.Y3 = new zd(this, 4);
        this.s4 = true;
        this.t4 = true;
        this.w4 = new Paint();
        this.x4 = 1.0f;
        this.y4 = new Rect();
        this.A4 = new hd(this, 7);
        this.D4 = true;
        this.J4 = new eq[1];
        this.O4 = BotForumHelper.SteamingSendButtonState.NO_STREAMING;
        this.Q4 = -1;
        Paint paint = new Paint(1);
        this.T4 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.U4 = linearGradient;
        this.V4 = new Matrix();
        gr grVar = gr.h;
        final int i12 = 0;
        this.W4 = new y5(this, 0L, 280L, grVar);
        this.X4 = new y5(this, 0L, 280L, grVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        gr grVar2 = rh.m.V;
        this.a5 = new td.c(0, this, grVar2, 250L);
        this.b5 = new td.a(1, this, grVar2, 250L, false);
        this.c5 = new td.a(2, this, grVar, 320L, false);
        this.d5 = new td.a(3, this, grVar, 320L, false);
        this.R3 = b6Var;
        this.S3 = z10;
        this.d2 = z10 && !AndroidUtilities.isInMultiwindow && (qnVar == null || !qnVar.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.L1 = paint2;
        paint2.setColor(h0(org.telegram.ui.ActionBar.f6.af));
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
        this.K2 = qnVar;
        if (qnVar != null) {
            this.B2 = qnVar.getClassGuid();
        }
        this.h1 = xu0Var;
        this.i1 = xu0Var;
        xu0Var.setDelegate(this);
        this.w2 = MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false);
        ae aeVar = new ae(this, activity, i12);
        this.u1 = aeVar;
        aeVar.setClipChildren(false);
        aeVar.setClipToPadding(false);
        aeVar.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
        addView(aeVar, g7.e6.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        ce ceVar = new ce(this, activity);
        this.t1 = ceVar;
        ceVar.setClipChildren(false);
        aeVar.addView(ceVar, g7.e6.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        de deVar = new de(this, activity);
        this.M0 = deVar;
        deVar.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        deVar.setFocusable(true);
        int dp = AndroidUtilities.dp(7.5f);
        deVar.setPadding(dp, dp, dp, dp);
        int i13 = org.telegram.ui.ActionBar.f6.Wk;
        int h02 = h0(i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        deVar.setColorFilter(new PorterDuffColorFilter(h02, mode));
        int i14 = org.telegram.ui.ActionBar.f6.i6;
        int h03 = h0(i14);
        float dp2 = AndroidUtilities.dp(19.0f);
        int dp3 = AndroidUtilities.dp(1.0f);
        int dp4 = AndroidUtilities.dp(3.0f);
        deVar.setBackground(org.telegram.ui.ActionBar.f6.W(dp2, h03, dp3, dp4, dp3, dp4));
        deVar.setOnClickListener(new jd(this, 14));
        ceVar.addView(deVar, g7.e6.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        d1(false, false);
        ImageView imageView = new ImageView(activity);
        this.N0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(h0(i13), mode));
        int h04 = h0(i14);
        float dp5 = AndroidUtilities.dp(19.0f);
        int dp6 = AndroidUtilities.dp(1.0f);
        int dp7 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.W(dp5, h04, dp6, dp7, dp6, dp7));
        imageView.setVisibility(8);
        imageView.setContentDescription(LocaleController.getString(R.string.ArticleDeleteDraft));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ud
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        int i15 = ChatActivityEnterView.i5;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, b6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string;
                        c2Var.P = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new pd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    default:
                        int i16 = ChatActivityEnterView.i5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        org.telegram.ui.qn qnVar2 = chatActivityEnterView2.K2;
                        long a2 = qnVar2 != null ? qnVar2.a() : chatActivityEnterView2.L2;
                        boolean z11 = chatActivityEnterView2.y1;
                        org.telegram.ui.ActionBar.b6 b6Var2 = b6Var;
                        if (!z11) {
                            if (chatActivityEnterView2.A0 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), b6Var2);
                                e0Var.l0(chatActivityEnterView2.A0.getText());
                                e0Var.f0 = new sd(chatActivityEnterView2, 1);
                                boolean z12 = chatActivityEnterView2.U1 != null;
                                td tdVar = new td(chatActivityEnterView2, a2, b6Var2, 1);
                                e0Var.h0 = a2;
                                e0Var.i0 = z12;
                                e0Var.j0 = tdVar;
                                e0Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.z1 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), b6Var2);
                            e0Var2.m0(chatActivityEnterView2.z1);
                            e0Var2.g0 = new sd(chatActivityEnterView2, 0);
                            td tdVar2 = new td(chatActivityEnterView2, a2, b6Var2, 0);
                            e0Var2.h0 = a2;
                            e0Var2.k0 = tdVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                }
            }
        });
        ceVar.addView(imageView, g7.e6.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            int i15 = qnVar != null ? qnVar.N3 : -1;
            gh.m mVar = new gh.m(activity, 4);
            this.k1 = mVar;
            mVar.setOrientation(0);
            mVar.setEnabled(false);
            mVar.setClipChildren(false);
            ceVar.addView(mVar, g7.e6.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i15 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.D1 = imageView2;
                dr drVar = new dr(activity, R.drawable.input_notify_on, i13);
                this.a0 = drVar;
                imageView2.setImageDrawable(drVar);
                this.a0.a(this.b2, false);
                if (this.b2) {
                    i9 = R.string.AccDescrChanSilentOn;
                    str = "AccDescrChanSilentOn";
                } else {
                    i9 = R.string.AccDescrChanSilentOff;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(LocaleController.getString(str, i9));
                imageView2.setColorFilter(new PorterDuffColorFilter(h0(i13), PorterDuff.Mode.MULTIPLY));
                imageView2.setScaleType(scaleType);
                imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(h0(i14), 1, -1));
                imageView2.setVisibility((!this.c2 || ((egVar = this.U2) != null && egVar.n0())) ? 8 : 0);
                mVar.addView(imageView2, g7.e6.n(44, 44));
                imageView2.setOnClickListener(new ee(this, qnVar, activity));
            }
            ge geVar = new ge(activity, 0);
            this.m1 = geVar;
            geVar.setScaleType(scaleType);
            geVar.setColorFilter(new PorterDuffColorFilter(h0(i13), PorterDuff.Mode.MULTIPLY));
            geVar.setImageResource(R.drawable.msg_input_attach2);
            geVar.setBackground(org.telegram.ui.ActionBar.f6.f0(h0(i14), 1, -1));
            ceVar.addView(geVar, g7.e6.e(44, 44, 85));
            geVar.setOnClickListener(new jd(this, 18));
            geVar.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
            H1(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.o1 = imageView3;
        i0 i0Var = new i0(activity);
        this.n1 = i0Var;
        imageView3.setImageDrawable(i0Var);
        imageView3.setScaleType(scaleType);
        int h05 = h0(i13);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(h05, mode2));
        imageView3.setBackground(org.telegram.ui.ActionBar.f6.f0(h0(i14), 1, AndroidUtilities.dp(16.0f)));
        aeVar.addView(imageView3, g7.e6.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        g7.g6.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ud
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        int i152 = ChatActivityEnterView.i5;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, b6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string;
                        c2Var.P = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new pd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    default:
                        int i16 = ChatActivityEnterView.i5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        org.telegram.ui.qn qnVar2 = chatActivityEnterView2.K2;
                        long a2 = qnVar2 != null ? qnVar2.a() : chatActivityEnterView2.L2;
                        boolean z11 = chatActivityEnterView2.y1;
                        org.telegram.ui.ActionBar.b6 b6Var2 = b6Var;
                        if (!z11) {
                            if (chatActivityEnterView2.A0 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), b6Var2);
                                e0Var.l0(chatActivityEnterView2.A0.getText());
                                e0Var.f0 = new sd(chatActivityEnterView2, 1);
                                boolean z12 = chatActivityEnterView2.U1 != null;
                                td tdVar = new td(chatActivityEnterView2, a2, b6Var2, 1);
                                e0Var.h0 = a2;
                                e0Var.i0 = z12;
                                e0Var.j0 = tdVar;
                                e0Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.z1 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), b6Var2);
                            e0Var2.m0(chatActivityEnterView2.z1);
                            e0Var2.g0 = new sd(chatActivityEnterView2, 0);
                            td tdVar2 = new td(chatActivityEnterView2, a2, b6Var2, 0);
                            e0Var2.h0 = a2;
                            e0Var2.k0 = tdVar2;
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
        this.p1 = imageView4;
        imageView4.setImageResource(R.drawable.iv_fullscreen);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(h0(i13), mode2));
        imageView4.setBackground(org.telegram.ui.ActionBar.f6.f0(h0(i14), 1, AndroidUtilities.dp(16.0f)));
        aeVar.addView(imageView4, g7.e6.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.ArticleEditor));
        g7.g6.a(imageView4);
        imageView4.setOnClickListener(new jd(this, 20));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.W2 != null) {
            W();
        }
        ImageView imageView5 = new ImageView(activity);
        this.w1 = imageView5;
        imageView5.setImageResource(R.drawable.send_outline);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        imageView5.setColorFilter(h0(org.telegram.ui.ActionBar.f6.hl), mode);
        aeVar.addView(imageView5, g7.e6.e(44, 44, 85));
        ae aeVar2 = new ae(this, activity, i10);
        this.v1 = aeVar2;
        aeVar2.setClipChildren(false);
        aeVar2.setClipToPadding(false);
        aeVar.addView(aeVar2, g7.e6.e(100, 44, 85));
        le leVar = new le(this, activity, b6Var);
        this.V0 = leVar;
        leVar.setSoundEffectsEnabled(false);
        aeVar2.addView(leVar, g7.e6.e(44, 44, 85));
        leVar.setFocusable(true);
        leVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.I3 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(h0(i13), mode2));
        Drawable mutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.J3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(h0(i13), mode2));
        me meVar = new me(this, activity);
        this.X0 = meVar;
        meVar.setImportantForAccessibility(2);
        int dp8 = AndroidUtilities.dp(10.0f);
        meVar.setPadding(dp8, dp8, dp8, dp8);
        leVar.addView(meVar, g7.e6.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.L0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ne neVar = new ne();
        this.K1 = neVar;
        imageView6.setImageDrawable(neVar);
        imageView6.setContentDescription(LocaleController.getString("Cancel", R.string.Cancel));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        imageView6.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(h0(i14), 1, -1));
        aeVar2.addView(imageView6, g7.e6.e(44, 44, 85));
        imageView6.setOnClickListener(new jd(this, 0));
        oe oeVar = new oe(this, activity, c() ? R.drawable.input_schedule : R.drawable.send_plane_24, b6Var, 0);
        this.F0 = oeVar;
        oeVar.setVisibility(4);
        oeVar.setContentDescription(LocaleController.getString(R.string.Send));
        int i16 = 0;
        oeVar.setSoundEffectsEnabled(false);
        oeVar.setScaleX(0.1f);
        oeVar.setScaleY(0.1f);
        oeVar.setAlpha(0.0f);
        aeVar2.addView(oeVar, g7.e6.e(100, 44, 85));
        oeVar.setOnClickListener(new jd(this, i10));
        oeVar.setOnLongClickListener(new md(this, i16));
        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            aeVar2.setOnLongClickListener(new md(this, i16));
        }
        gh.j5 j5Var = new gh.j5(activity, b6Var);
        this.E0 = j5Var;
        j5Var.setVisibility(4);
        j5Var.setOnClickListener(new jd(this, 4));
        aeVar2.addView(j5Var, g7.e6.e(44, 44, 85));
        mg mgVar = new mg(activity);
        this.B0 = mgVar;
        org.telegram.ui.ActionBar.h5 h5Var = mgVar.a;
        h5Var.setTextSize(16);
        mgVar.invalidate();
        mgVar.setVisibility(4);
        mgVar.setSoundEffectsEnabled(false);
        mgVar.setScaleX(0.1f);
        mgVar.setScaleY(0.1f);
        mgVar.setAlpha(0.0f);
        mgVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        h5Var.setGravity(21);
        mgVar.invalidate();
        h5Var.setTextColor(h0(i13));
        mgVar.invalidate();
        aeVar2.addView(mgVar, g7.e6.e(74, 44, 85));
        mgVar.setOnClickListener(new jd(this, 8));
        mgVar.setOnLongClickListener(new md(this, i10));
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        this.s2 = globalEmojiSettings.getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.t2 = globalEmojiSettings.getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        k1(false, false);
        J(false);
        E();
        V();
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0132, code lost:
    
        if (r4 != null) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean H(int i9, long j10, org.telegram.ui.ActionBar.o2 o2Var, CharSequence charSequence) {
        t5[] t5VarArr;
        int i10;
        int i11;
        boolean z10;
        TLRPC.ChatFull chatFull;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        ArrayList<TLRPC.StickerSetCovered> arrayList;
        int i12;
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList4;
        ArrayList<TLRPC.Document> arrayList5;
        if (charSequence != null && o2Var != null && !UserConfig.getInstance(i9).isPremium() && UserConfig.getInstance(i9).getClientUserId() != j10 && (charSequence instanceof Spanned) && (t5VarArr = (t5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), t5.class)) != null) {
            int i13 = 0;
            while (i13 < t5VarArr.length) {
                t5 t5Var = t5VarArr[i13];
                if (t5Var != null) {
                    TLRPC.Document document = t5Var.document;
                    if (document == null) {
                        i11 = i9;
                        document = k5.f(i11, t5Var.getDocumentId());
                    } else {
                        i11 = i9;
                    }
                    long documentId = t5VarArr[i13].getDocumentId();
                    if (document == null) {
                        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(5);
                        int size = stickerSets.size();
                        int i14 = 0;
                        while (i14 < size) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i14);
                            i14++;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                            if (tL_messages_stickerSet2 != null && (arrayList5 = tL_messages_stickerSet2.documents) != null && !arrayList5.isEmpty()) {
                                ArrayList<TLRPC.Document> arrayList6 = tL_messages_stickerSet2.documents;
                                int size2 = arrayList6.size();
                                int i15 = 0;
                                while (i15 < size2) {
                                    TLRPC.Document document2 = arrayList6.get(i15);
                                    i15++;
                                    z10 = false;
                                    TLRPC.Document document3 = document2;
                                    i10 = i13;
                                    arrayList4 = stickerSets;
                                    if (document3.id == documentId) {
                                        document = document3;
                                        break;
                                    }
                                    stickerSets = arrayList4;
                                    i13 = i10;
                                }
                            }
                            i10 = i13;
                            arrayList4 = stickerSets;
                            z10 = false;
                            if (document != null) {
                                break;
                            }
                            stickerSets = arrayList4;
                            i13 = i10;
                        }
                    }
                    i10 = i13;
                    z10 = false;
                    if (document == null) {
                        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i11).getFeaturedEmojiSets();
                        int size3 = featuredEmojiSets.size();
                        int i16 = 0;
                        while (i16 < size3) {
                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                            i16++;
                            TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                            if (stickerSetCovered2 != null && (arrayList3 = stickerSetCovered2.covers) != null && !arrayList3.isEmpty()) {
                                ArrayList<TLRPC.Document> arrayList7 = stickerSetCovered2.covers;
                                int size4 = arrayList7.size();
                                int i17 = 0;
                                while (i17 < size4) {
                                    TLRPC.Document document4 = arrayList7.get(i17);
                                    i17++;
                                    TLRPC.Document document5 = document4;
                                    arrayList = featuredEmojiSets;
                                    i12 = size3;
                                    if (document5.id == documentId) {
                                        document = document5;
                                        break;
                                    }
                                    featuredEmojiSets = arrayList;
                                    size3 = i12;
                                }
                            }
                            arrayList = featuredEmojiSets;
                            i12 = size3;
                            if (document != null) {
                                break;
                            }
                            if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetFullCovered) {
                                arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered2).documents;
                            } else {
                                if ((stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) && stickerSetCovered2.set != null) {
                                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                    tL_inputStickerSetID.id = stickerSetCovered2.set.id;
                                    TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i11).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, true);
                                    if (stickerSet != null) {
                                        arrayList2 = stickerSet.documents;
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
                            featuredEmojiSets = arrayList;
                            size3 = i12;
                        }
                    }
                    if (document != null && (chatFull = MessagesController.getInstance(i11).getChatFull(-j10)) != null && chatFull.emojiset != null && (groupStickerSetById = MediaDataController.getInstance(i11).getGroupStickerSetById(chatFull.emojiset)) != null) {
                        ArrayList<TLRPC.Document> arrayList8 = groupStickerSetById.documents;
                        int size6 = arrayList8.size();
                        int i19 = 0;
                        while (i19 < size6) {
                            TLRPC.Document document8 = arrayList8.get(i19);
                            i19++;
                            if (document8.id == documentId) {
                                return z10;
                            }
                        }
                    }
                    if (document == null || !MessageObject.isFreeEmoji(document)) {
                        oc.a0(o2Var).q(document, AndroidUtilities.replaceTags(LocaleController.getString("UnlockPremiumEmojiHint", R.string.UnlockPremiumEmojiHint)), LocaleController.getString("PremiumMore", R.string.PremiumMore), new id(0, o2Var)).j();
                        return true;
                    }
                } else {
                    i10 = i13;
                }
                i13 = i10 + 1;
            }
        }
        return false;
    }

    public static void f(final ChatActivityEnterView chatActivityEnterView, final mu0 mu0Var, int[] iArr, do0 do0Var) {
        o1.j jVar;
        Dialog dialog;
        o1.j jVar2;
        int[] iArr2 = chatActivityEnterView.I2;
        if (chatActivityEnterView.m0 == null) {
            return;
        }
        Dialog dialog2 = new Dialog(chatActivityEnterView.getContext(), R.style.TransparentDialogNoAnimation);
        FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
        frameLayout.addView(mu0Var, g7.e6.e(40, 40, 3));
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
        AndroidUtilities.setLightStatusBar(dialog2, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.s8, true) == -1);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            AndroidUtilities.setLightNavigationBar(dialog2, AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, true)) >= 0.721f);
        }
        if (i9 >= 23) {
            chatActivityEnterView.o0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.o0;
        }
        chatActivityEnterView.l0.getLocationInWindow(iArr2);
        final float f10 = iArr2[0];
        final float f11 = iArr2[1];
        float dp = AndroidUtilities.dp(5.0f);
        float dp2 = iArr[0] + chatActivityEnterView.o0 + dp + AndroidUtilities.dp(4.0f) + 0.0f;
        float f12 = iArr[1] + chatActivityEnterView.p0 + dp + 0.0f;
        mu0Var.setTranslationX(dp2);
        mu0Var.setTranslationY(f12);
        float scaleX = (chatActivityEnterView.l0.getLayoutParams().width * (chatActivityEnterView.g5 ? chatActivityEnterView.l0.getScaleX() : 1.0f)) / AndroidUtilities.dp(40.0f);
        mu0Var.setPivotX(0.0f);
        mu0Var.setPivotY(0.0f);
        mu0Var.setScaleX(0.75f);
        mu0Var.setScaleY(0.75f);
        mu0Var.getViewTreeObserver().addOnDrawListener(new we(mu0Var, do0Var));
        dialog2.show();
        if (!chatActivityEnterView.g5) {
            chatActivityEnterView.l0.setScaleX(1.0f);
            chatActivityEnterView.l0.setScaleY(1.0f);
        }
        chatActivityEnterView.l0.setAlpha(1.0f);
        ve veVar = chatActivityEnterView.m0;
        boolean z10 = chatActivityEnterView.g5;
        o1.c cVar = o1.h.o;
        if (z10) {
            jVar = null;
        } else {
            o1.j jVar3 = new o1.j(chatActivityEnterView.l0, cVar);
            jVar3.u = org.telegram.ui.Cells.j2.i(0.5f, 750.0f, 1.0f);
            jVar = jVar3;
        }
        boolean z11 = chatActivityEnterView.g5;
        o1.c cVar2 = o1.h.p;
        if (z11) {
            dialog = dialog2;
            jVar2 = null;
        } else {
            dialog = dialog2;
            o1.j jVar4 = new o1.j(chatActivityEnterView.l0, cVar2);
            jVar4.u = org.telegram.ui.Cells.j2.i(0.5f, 750.0f, 1.0f);
            jVar2 = jVar4;
        }
        o1.j jVar5 = new o1.j(chatActivityEnterView.l0, o1.h.t);
        jVar5.u = org.telegram.ui.Cells.j2.i(0.0f, 750.0f, 1.0f);
        final int i10 = 0;
        final Dialog dialog3 = dialog;
        jVar5.a(new o1.f(chatActivityEnterView) { // from class: org.telegram.ui.Components.ld
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = chatActivityEnterView;
            }

            @Override // o1.f
            public final void a(o1.h hVar, boolean z12, float f13, float f14) {
                int i11 = i10;
                float f15 = f11;
                float f16 = f10;
                mu0 mu0Var2 = mu0Var;
                Dialog dialog4 = dialog3;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                int i12 = 0;
                switch (i11) {
                    case 0:
                        int i13 = ChatActivityEnterView.i5;
                        if (dialog4.isShowing()) {
                            mu0Var2.setTranslationX(f16);
                            mu0Var2.setTranslationY(f15);
                            fo0 fo0Var = chatActivityEnterView2.l0;
                            fo0Var.getClass();
                            fo0Var.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.g5) {
                                chatActivityEnterView2.l0.setScaleX(1.0f);
                                chatActivityEnterView2.l0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.l0.setAlpha(1.0f);
                            chatActivityEnterView2.l0.getViewTreeObserver().addOnPreDrawListener(new xe(chatActivityEnterView2, dialog4, i12));
                            break;
                        }
                        break;
                    default:
                        int i14 = ChatActivityEnterView.i5;
                        if (dialog4.isShowing()) {
                            mu0Var2.setTranslationX(f16);
                            mu0Var2.setTranslationY(f15);
                            fo0 fo0Var2 = chatActivityEnterView2.l0;
                            fo0Var2.getClass();
                            fo0Var2.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.g5) {
                                chatActivityEnterView2.l0.setScaleX(1.0f);
                                chatActivityEnterView2.l0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.l0.setAlpha(1.0f);
                            chatActivityEnterView2.l0.getViewTreeObserver().addOnPreDrawListener(new xe(chatActivityEnterView2, dialog4, 1));
                            break;
                        }
                        break;
                }
            }
        });
        o1.j jVar6 = new o1.j(mu0Var, o1.h.m);
        jVar6.b = g7.n.a(dp2, f10 - AndroidUtilities.dp(6.0f), dp2);
        jVar6.c = true;
        jVar6.u = org.telegram.ui.Cells.j2.i(f10, 700.0f, 0.75f);
        jVar6.h = f10 - AndroidUtilities.dp(6.0f);
        o1.j jVar7 = new o1.j(mu0Var, o1.h.n);
        jVar7.b = g7.n.a(f12, f12, AndroidUtilities.dp(6.0f) + f11);
        jVar7.c = true;
        jVar7.u = org.telegram.ui.Cells.j2.i(f11, 700.0f, 0.75f);
        jVar7.g = AndroidUtilities.dp(6.0f) + f11;
        jVar7.b(new ze(f11, mu0Var));
        final int i11 = 1;
        jVar7.a(new o1.f(chatActivityEnterView) { // from class: org.telegram.ui.Components.ld
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = chatActivityEnterView;
            }

            @Override // o1.f
            public final void a(o1.h hVar, boolean z12, float f13, float f14) {
                int i112 = i11;
                float f15 = f11;
                float f16 = f10;
                mu0 mu0Var2 = mu0Var;
                Dialog dialog4 = dialog3;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                int i12 = 0;
                switch (i112) {
                    case 0:
                        int i13 = ChatActivityEnterView.i5;
                        if (dialog4.isShowing()) {
                            mu0Var2.setTranslationX(f16);
                            mu0Var2.setTranslationY(f15);
                            fo0 fo0Var = chatActivityEnterView2.l0;
                            fo0Var.getClass();
                            fo0Var.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.g5) {
                                chatActivityEnterView2.l0.setScaleX(1.0f);
                                chatActivityEnterView2.l0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.l0.setAlpha(1.0f);
                            chatActivityEnterView2.l0.getViewTreeObserver().addOnPreDrawListener(new xe(chatActivityEnterView2, dialog4, i12));
                            break;
                        }
                        break;
                    default:
                        int i14 = ChatActivityEnterView.i5;
                        if (dialog4.isShowing()) {
                            mu0Var2.setTranslationX(f16);
                            mu0Var2.setTranslationY(f15);
                            fo0 fo0Var2 = chatActivityEnterView2.l0;
                            fo0Var2.getClass();
                            fo0Var2.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.g5) {
                                chatActivityEnterView2.l0.setScaleX(1.0f);
                                chatActivityEnterView2.l0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.l0.setAlpha(1.0f);
                            chatActivityEnterView2.l0.getViewTreeObserver().addOnPreDrawListener(new xe(chatActivityEnterView2, dialog4, 1));
                            break;
                        }
                        break;
                }
            }
        });
        o1.j jVar8 = new o1.j(mu0Var, cVar);
        jVar8.u = org.telegram.ui.Cells.j2.i(scaleX, 1000.0f, 1.0f);
        o1.j jVar9 = new o1.j(mu0Var, cVar2);
        jVar9.u = org.telegram.ui.Cells.j2.i(scaleX, 1000.0f, 1.0f);
        veVar.l(jVar, jVar2, jVar5, jVar6, jVar7, jVar8, jVar9);
    }

    public static void g(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i9, int i10, Object obj, Long l10, boolean z11) {
        if (chatActivityEnterView.C0 > 0 && !chatActivityEnterView.c()) {
            eg egVar = chatActivityEnterView.U2;
            if (egVar != null) {
                mg mgVar = chatActivityEnterView.B0;
                egVar.k1(mgVar, mgVar.a.getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.M1 != 0) {
            chatActivityEnterView.m1(0, true);
            chatActivityEnterView.Q0.t(true);
            chatActivityEnterView.Q0.A();
        }
        chatActivityEnterView.n1(false, true, false, true);
        eg egVar2 = chatActivityEnterView.U2;
        TL_stories.StoryItem P0 = egVar2 != null ? egVar2.P0() : null;
        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.M);
        long j10 = chatActivityEnterView.L2;
        MessageObject messageObject = chatActivityEnterView.O2;
        MessageObject threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.gn gnVar = chatActivityEnterView.Q2;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
        sendMessagesHelper.sendSticker(document, str, j10, messageObject, threadMessage, P0, gnVar, sendAnimationData, z10, i9, i10, z12, obj, qnVar != null ? qnVar.C8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        eg egVar3 = chatActivityEnterView.U2;
        if (egVar3 != null) {
            egVar3.y(null, true, i9, 0, 0L);
        }
        if (z11) {
            chatActivityEnterView.setFieldText("");
        }
        MediaDataController.getInstance(chatActivityEnterView.M).addRecentSticker(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MessageObject getThreadMessage() {
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar != null) {
            return qnVar.T3;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getThreadMessageId() {
        MessageObject messageObject;
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar == null || (messageObject = qnVar.T3) == null) {
            return 0;
        }
        return messageObject.getId();
    }

    private String getTopicKeyString() {
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar == null || !qnVar.d4) {
            return "" + this.L2;
        }
        return this.L2 + "_" + qnVar.b();
    }

    public static void h(ChatActivityEnterView chatActivityEnterView, TL_keyboard.KeyboardButton keyboardButton) {
        org.telegram.ui.qn qnVar;
        boolean z10 = chatActivityEnterView.O2 != null && (qnVar = chatActivityEnterView.K2) != null && qnVar.d4 && qnVar.b() == ((long) chatActivityEnterView.O2.getId());
        MessageObject messageObject = ((chatActivityEnterView.O2 == null || z10) && !BotForumHelper.isBotForum(chatActivityEnterView.M, chatActivityEnterView.L2)) ? DialogObject.isChatDialog(chatActivityEnterView.L2) ? chatActivityEnterView.h2 : null : chatActivityEnterView.O2;
        MessageObject messageObject2 = chatActivityEnterView.O2;
        if (messageObject2 == null || z10) {
            messageObject2 = chatActivityEnterView.h2;
        }
        boolean b02 = chatActivityEnterView.b0(keyboardButton, messageObject, messageObject2, null);
        if (chatActivityEnterView.O2 == null || z10) {
            MessageObject messageObject3 = chatActivityEnterView.h2;
            if (messageObject3 != null && messageObject3.messageOwner.reply_markup.single_use) {
                if (b02) {
                    chatActivityEnterView.H0();
                } else {
                    chatActivityEnterView.t1(0, 0, true, true);
                }
                MessagesController.getMainSettings(chatActivityEnterView.M).edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.h2.getId()).commit();
            }
        } else {
            chatActivityEnterView.H0();
            chatActivityEnterView.Z0(chatActivityEnterView.R2, true, false);
        }
        eg egVar = chatActivityEnterView.U2;
        if (egVar != null) {
            egVar.y(null, true, 0, 0, 0L);
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
        ofFloat2.setInterpolator(gr.h);
        ofFloat2.setDuration(250L);
        SharedConfig.removeLockRecordAudioVideoHint();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(chatActivityEnterView, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(chatActivityEnterView.f1, "cancelToProgress", 1.0f));
        animatorSet.start();
    }

    public static CharSequence r(ArrayList arrayList, CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        MediaDataController.sortEntities(arrayList);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(s00.a(charSequence, false));
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        if (spans != null && spans.length > 0) {
            for (Object obj : spans) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
        if (arrayList != null) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                try {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i9);
                    if (messageEntity.offset + messageEntity.length <= spannableStringBuilder.length()) {
                        if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            s41 s41Var = new s41("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i10 = messageEntity.offset;
                            spannableStringBuilder.setSpan(s41Var, i10, messageEntity.length + i10, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            s41 s41Var2 = new s41("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i11 = messageEntity.offset;
                            spannableStringBuilder.setSpan(s41Var2, i11, messageEntity.length + i11, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            vz0 vz0Var = new vz0();
                            vz0Var.a |= 4;
                            wz0 wz0Var = new wz0(vz0Var, 0);
                            int i12 = messageEntity.offset;
                            MediaDataController.addStyleToText(wz0Var, i12, messageEntity.length + i12, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                vz0 vz0Var2 = new vz0();
                                vz0Var2.a |= 1;
                                wz0 wz0Var2 = new wz0(vz0Var2, 0);
                                int i13 = messageEntity.offset;
                                MediaDataController.addStyleToText(wz0Var2, i13, messageEntity.length + i13, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                vz0 vz0Var3 = new vz0();
                                vz0Var3.a |= 2;
                                wz0 wz0Var3 = new wz0(vz0Var3, 0);
                                int i14 = messageEntity.offset;
                                MediaDataController.addStyleToText(wz0Var3, i14, messageEntity.length + i14, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                vz0 vz0Var4 = new vz0();
                                vz0Var4.a |= 8;
                                wz0 wz0Var4 = new wz0(vz0Var4, 0);
                                int i15 = messageEntity.offset;
                                MediaDataController.addStyleToText(wz0Var4, i15, messageEntity.length + i15, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                vz0 vz0Var5 = new vz0();
                                vz0Var5.a |= 16;
                                wz0 wz0Var5 = new wz0(vz0Var5, 0);
                                int i16 = messageEntity.offset;
                                MediaDataController.addStyleToText(wz0Var5, i16, messageEntity.length + i16, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                r41 r41Var = new r41(messageEntity.url, null);
                                int i17 = messageEntity.offset;
                                spannableStringBuilder.setSpan(r41Var, i17, messageEntity.length + i17, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                vz0 vz0Var6 = new vz0();
                                vz0Var6.a |= 128;
                                int i18 = messageEntity.offset;
                                vz0Var6.b = i18;
                                vz0Var6.c = i18 + messageEntity.length;
                                vz0Var6.d = messageEntity;
                                int i19 = messageEntity.offset;
                                s00 s00Var = new s00(spannableStringBuilder.subSequence(i19, messageEntity.length + i19).toString(), vz0Var6, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i20 = messageEntity.offset;
                                spannableStringBuilder.setSpan(s00Var, i20, messageEntity.length + i20, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                vz0 vz0Var7 = new vz0();
                                vz0Var7.a |= 256;
                                wz0 wz0Var6 = new wz0(vz0Var7, 0);
                                int i21 = messageEntity.offset;
                                MediaDataController.addStyleToText(wz0Var6, i21, messageEntity.length + i21, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                t5 t5Var = tL_messageEntityCustomEmoji.document != null ? new t5(tL_messageEntityCustomEmoji.document, fontMetricsInt) : new t5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                int i22 = messageEntity.offset;
                                spannableStringBuilder.setSpan(t5Var, i22, messageEntity.length + i22, 33);
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
            boolean z10 = false;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if (i26 != intValue) {
                    int i28 = intValue - 1;
                    int i29 = (i28 < 0 || i28 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(i28) != '\n') ? intValue : intValue - 1;
                    if (i27 > 0) {
                        fi0.c(spannableStringBuilder, i26, i29, z10);
                    }
                    i26 = intValue + 1;
                    if (i26 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(intValue) != '\n') {
                        i26 = intValue;
                    }
                }
                if ((intValue2 & 2) != 0) {
                    i27--;
                }
                if ((intValue2 & 1) != 0 || (intValue2 & 16) != 0) {
                    i27++;
                    z10 = (intValue2 & 16) != 0;
                }
            }
            if (i26 < spannableStringBuilder.length() && i27 > 0) {
                fi0.c(spannableStringBuilder, i26, spannableStringBuilder.length(), z10);
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
                FileLog.e(e11);
            }
        }
        return replaceEmoji;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlowModeButtonVisible(boolean z10) {
        int i9;
        int i10 = z10 ? 0 : 8;
        mg mgVar = this.B0;
        mgVar.setVisibility(i10);
        if (z10) {
            i9 = AndroidUtilities.dp(mgVar.e ? 26.0f : 16.0f);
        } else {
            i9 = 0;
        }
        ff ffVar = this.A0;
        if (ffVar == null || ffVar.getPaddingRight() == i9) {
            return;
        }
        this.A0.setPadding(0, AndroidUtilities.dp(9.0f), i9, AndroidUtilities.dp(10.0f));
    }

    public final void A() {
        if (this.Z1 && this.Y0) {
            CameraController.getInstance().cancelOnInitRunnable(this.C3);
            this.U2.U1(5, 0, this.K ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, this.N4, 0L, true);
            this.N4 = 0L;
            this.F0.setEffect(0L);
        } else {
            this.U2.L0(0);
            MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
        }
        this.A2 = false;
        L1(2, true);
    }

    public final void A0() {
        vj0 vj0Var = this.d1;
        if (vj0Var != null) {
            vj0Var.M = true;
            k61 k61Var = vj0Var.n;
            if (k61Var != null) {
                k61Var.Q(false);
                vj0Var.n.I();
                vj0Var.n = null;
            }
        }
        if (this.d1 != null && this.W2 != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.M);
            long j10 = this.L2;
            org.telegram.ui.qn qnVar = this.K2;
            long b10 = (qnVar == null || !qnVar.d4) ? 0L : qnVar.b();
            vj0 vj0Var2 = this.d1;
            float audioLeft = vj0Var2 == null ? 0.0f : vj0Var2.getAudioLeft();
            vj0 vj0Var3 = this.d1;
            mediaDataController.setDraftVoiceRegion(j10, b10, audioLeft, vj0Var3 == null ? 1.0f : vj0Var3.getAudioRight());
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
        uf ufVar = this.Q0;
        if (ufVar != null) {
            ufVar.D();
        }
        hd hdVar = this.D0;
        if (hdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(hdVar);
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
        xu0 xu0Var = this.h1;
        if (xu0Var != null) {
            xu0Var.setDelegate(null);
        }
        ve veVar = this.m0;
        if (veVar != null) {
            veVar.e = false;
            veVar.dismiss();
        }
    }

    public final void A1() {
        z1();
        gh.m mVar = this.k1;
        if (mVar != null) {
            mVar.setTranslationX(this.y + this.x);
            mVar.setAlpha(this.A * this.B);
            mVar.setVisibility(mVar.getAlpha() > 0.0f ? 0 : 8);
            ge geVar = this.m1;
            if (geVar != null && this.v4) {
                geVar.setAlpha(this.q1 * this.B);
            }
        }
        qe qeVar = this.E1;
        if (qeVar != null) {
            qeVar.setTranslationX(qeVar.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b3, code lost:
    
        if (android.text.TextUtils.isEmpty(r15 == null ? "" : org.telegram.messenger.AndroidUtilities.getTrimmedString(r15.getTextToUse())) != false) goto L124;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B1(boolean z10) {
        se seVar;
        if (this.S3) {
            org.telegram.ui.qn qnVar = this.K2;
            if (qnVar != null && !qnVar.J5) {
                z10 = false;
            }
            boolean i02 = i0();
            boolean z11 = this.h5 != 1 && this.L2 > 0;
            se seVar2 = this.s1;
            boolean z12 = seVar2 != null && seVar2.getVisibility() == 0;
            if (!i02 && !this.k2 && this.i2 == null) {
                se seVar3 = this.s1;
                if (seVar3 != null) {
                    seVar3.setVisibility(8);
                }
            } else if (this.i2 != null) {
                if (s0() && this.a2 == 1 && this.i2.is_persistent) {
                    se seVar4 = this.s1;
                    if (seVar4 != null && seVar4.getVisibility() != 8) {
                        this.s1.setVisibility(8);
                    }
                } else {
                    P();
                    if (this.s1.getVisibility() != 0) {
                        this.s1.setVisibility(0);
                    }
                    this.P1.a(R.drawable.input_bot2, true);
                    this.s1.setContentDescription(LocaleController.getString("AccDescrBotKeyboard", R.string.AccDescrBotKeyboard));
                }
            } else if (z11) {
                se seVar5 = this.s1;
                if (seVar5 != null) {
                    seVar5.setVisibility(8);
                }
            } else {
                P();
                this.P1.a(R.drawable.input_bot1, true);
                this.s1.setContentDescription(LocaleController.getString("AccDescrBotCommands", R.string.AccDescrBotCommands));
                this.s1.setVisibility(0);
            }
            if (z11) {
                Q();
            }
            se seVar6 = this.s1;
            boolean z13 = (seVar6 != null && seVar6.getVisibility() == 0) != z12;
            mh.c0 c0Var = this.h0;
            int i9 = 2;
            if (c0Var != null) {
                boolean z14 = c0Var.w;
                c0Var.setWebView(this.h5 == 3);
                mh.c0 c0Var2 = this.h0;
                String string = this.h5 == 2 ? LocaleController.getString(R.string.BotsMenuTitle) : this.e0;
                if (string == null) {
                    c0Var2.getClass();
                    string = LocaleController.getString(R.string.BotsMenuTitle);
                }
                String str = c0Var2.n;
                boolean z15 = str == null || !str.equals(string);
                c0Var2.n = string;
                c0Var2.r = null;
                c0Var2.requestLayout();
                AndroidUtilities.updateViewVisibilityAnimated(this.h0, z11, 0.5f, z10);
                z13 = z13 || z15 || z14 != this.h0.w;
            }
            if (z13 && z10) {
                de deVar = this.M0;
                Float valueOf = Float.valueOf(deVar.getX());
                HashMap hashMap = this.x0;
                hashMap.put(deVar, valueOf);
                ff ffVar = this.A0;
                if (ffVar != null) {
                    hashMap.put(ffVar, Float.valueOf(ffVar.getX()));
                }
                se seVar7 = this.s1;
                boolean z16 = seVar7 != null && seVar7.getVisibility() == 0;
                if (z16 != z12 && (seVar = this.s1) != null) {
                    seVar.setVisibility(0);
                    if (z16) {
                        this.s1.setAlpha(0.0f);
                        this.s1.setScaleX(0.1f);
                        this.s1.setScaleY(0.1f);
                    } else if (!z16) {
                        this.s1.setAlpha(1.0f);
                        this.s1.setScaleX(1.0f);
                        this.s1.setScaleY(1.0f);
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(this.s1, z16, 0.1f, true, 1.0f, true, new fd(this, 1));
                }
            }
            se seVar8 = this.s1;
            if (seVar8 != null && seVar8.getVisibility() == 0) {
                ff ffVar2 = this.A0;
            }
            i9 = this.K4;
            H1(i9);
        }
    }

    public final void C() {
        se seVar;
        org.telegram.ui.qn qnVar;
        if (this.H != null || (seVar = this.F1) == null || seVar.getRight() == 0 || (qnVar = this.K2) == null || !BirthdayController.isToday(qnVar.W7)) {
            return;
        }
        if (MessagesController.getInstance(this.M).getMainSettings().getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + qnVar.a(), true)) {
            MessagesController.getInstance(this.M).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + qnVar.a(), false).apply();
            kh.x3 x3Var = new kh.x3(getContext(), 3);
            this.H = x3Var;
            x3Var.r(13.0f);
            this.H.q(true);
            W0();
            this.H.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            this.H.n(1.0f, -((getWidth() - AndroidUtilities.dp(12.0f)) - ((this.F1.getMeasuredWidth() / 2.0f) + (this.F1.getX() + (this.k1.getX() + this.t1.getX())))));
            addView(this.H, g7.e6.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
            kh.x3 x3Var2 = this.H;
            x3Var2.h0 = new hd(this, 12);
            x3Var2.d = 8000L;
            x3Var2.v();
        }
    }

    public final void C0() {
        this.e2 = true;
        ve veVar = this.m0;
        if (veVar != null) {
            veVar.e = false;
            veVar.dismiss();
        }
        if (this.u2) {
            this.g2 = true;
        }
        hd hdVar = new hd(this, 8);
        this.I4 = hdVar;
        AndroidUtilities.runOnUIThread(hdVar, 500L);
    }

    public final void C1() {
        int b10;
        f2.m0 m0Var;
        int L0;
        View m10;
        df dfVar = this.i0;
        if (dfVar == null) {
            return;
        }
        int childCount = dfVar.c.getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.i0.c.getChildAt(i10);
            if (i10 < 4) {
                i9 += childAt.getMeasuredHeight();
            }
        }
        xu0 xu0Var = this.h1;
        if (i9 > 0) {
            b10 = org.telegram.messenger.l0.b(childCount > 4 ? 12.0f : 0.0f, (xu0Var.getMeasuredHeight() - i9) - AndroidUtilities.dp(8.0f), 0);
        } else {
            b10 = this.j0.c.size() > 4 ? org.telegram.messenger.l0.b(162.8f, xu0Var.getMeasuredHeight(), 0) : org.telegram.messenger.l0.b((Math.max(1, Math.min(4, this.j0.c.size())) * 36) + 8, xu0Var.getMeasuredHeight(), 0);
        }
        if (this.i0.c.getPaddingTop() != b10) {
            this.i0.c.setTopGlowOffset(b10);
            if (this.Q4 == -1 && this.i0.getVisibility() == 0 && this.i0.c.getLayoutManager() != null && (L0 = (m0Var = (f2.m0) this.i0.c.getLayoutManager()).L0()) >= 0 && (m10 = m0Var.m(L0)) != null) {
                this.Q4 = L0;
                this.R4 = m10.getTop() - this.i0.c.getPaddingTop();
            }
            this.i0.c.setPadding(0, b10, 0, AndroidUtilities.dp(8.0f));
        }
    }

    public final void D() {
        ff ffVar = this.A0;
        boolean z10 = ((ffVar != null && !TextUtils.isEmpty(ffVar.getText())) || this.u2 || this.f3 || s0()) ? false : true;
        if (z10) {
            Q();
        }
        mh.c0 c0Var = this.h0;
        if (c0Var != null) {
            boolean z11 = c0Var.f;
            if (z11 != z10) {
                c0Var.f = z10;
                c0Var.requestLayout();
                c0Var.invalidate();
            }
            if (z11 != this.h0.f) {
                de deVar = this.M0;
                Float valueOf = Float.valueOf(deVar.getX());
                HashMap hashMap = this.x0;
                hashMap.put(deVar, valueOf);
                ff ffVar2 = this.A0;
                if (ffVar2 != null) {
                    hashMap.put(ffVar2, Float.valueOf(ffVar2.getX()));
                }
            }
        }
    }

    public final void D0() {
        ff ffVar;
        this.e2 = false;
        hd hdVar = this.I4;
        if (hdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(hdVar);
            this.I4 = null;
        }
        if (i0() && v()) {
            return;
        }
        getVisibility();
        if (!this.g2 || org.telegram.ui.ActionBar.o2.hasSheets(this.K2)) {
            return;
        }
        this.g2 = false;
        eg egVar = this.U2;
        if (egVar != null) {
            egVar.i1();
        }
        if (this.M1 == 0 && (ffVar = this.A0) != null) {
            ffVar.requestFocus();
        }
        AndroidUtilities.showKeyboard(this.A0);
        if (AndroidUtilities.usingHardwareInput || this.u2 || AndroidUtilities.isInMultiwindow) {
            return;
        }
        this.f3 = true;
        re reVar = this.m3;
        AndroidUtilities.cancelRunOnUIThread(reVar);
        AndroidUtilities.runOnUIThread(reVar, 100L);
    }

    public final void D1(boolean z10) {
        if (this.h5 != 1 && this.L2 > 0) {
            Q();
        }
        mh.c0 c0Var = this.h0;
        if (c0Var != null) {
            c0Var.setWebView(i0());
        }
        B1(z10);
    }

    public final void E() {
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar == null) {
            return;
        }
        K1(qnVar.e, qnVar.W7);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:164|(1:248)(1:168)|169|(8:171|(1:246)(1:175)|(1:245)(1:181)|182|(4:184|(1:186)(1:243)|187|(1:191))(1:244)|(1:193)(1:242)|194|(1:196))(1:247)|197|(3:199|(1:201)(1:203)|202)|204|(3:(1:207)(1:223)|(2:211|(1:221))|222)|224|(4:226|(1:240)(1:230)|231|(5:233|234|235|236|237))|241|234|235|236|237) */
    /* JADX WARN: Can't wrap try/catch for region: R(29:15|(1:17)|18|(1:154)(1:24)|25|(3:27|(1:31)|32)(2:107|(3:109|(1:113)|114)(2:115|(9:117|(1:119)(1:144)|120|(3:124|(1:126)|127)|128|(3:130|(1:136)|137)|138|(1:142)|143)(1:(20:150|(1:152)|153|34|(1:38)|39|(1:106)|42|(1:103)(1:46)|(1:102)(1:50)|(1:101)|(4:57|(1:59)(1:65)|60|(1:64))|(1:71)|(1:73)|74|(3:(1:77)(1:93)|(2:81|(1:91))|92)|94|95|96|97))))|33|34|(2:36|38)|39|(0)|104|106|42|(1:44)|103|(1:48)|102|(2:52|54)|101|(0)|(3:67|69|71)|(0)|74|(0)|94|95|96|97) */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x033d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E0(View view) {
        org.telegram.ui.qn qnVar;
        TLRPC.User user;
        int measuredHeight;
        float f10;
        ff ffVar;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        ArrayList<MessageObject> arrayList;
        long j10;
        oe oeVar;
        org.telegram.ui.uk ukVar;
        boolean z10;
        MessagePreviewParams messagePreviewParams2;
        int i9;
        x60 F;
        boolean z11;
        boolean z12;
        ff ffVar2;
        int i10 = 0;
        if (c() || (((qnVar = this.K2) != null && qnVar.N3 == 5) || this.d5.f)) {
            return false;
        }
        boolean z13 = this.v4;
        int i11 = 3;
        oe oeVar2 = this.F0;
        org.telegram.ui.ActionBar.b6 b6Var = this.R3;
        int i12 = 2;
        boolean z14 = true;
        if (z13 || !(((ffVar = this.A0) != null && !TextUtils.isEmpty(ffVar.getText())) || qnVar == null || (messagePreviewParams = qnVar.b5) == null || (messages = messagePreviewParams.forwardMessages) == null || (arrayList = messages.messages) == null || arrayList.isEmpty())) {
            boolean z15 = qnVar != null && UserObject.isUserSelf(qnVar.i());
            if (this.K0 == null) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(this.J2, b6Var);
                this.K0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                this.K0.setOnTouchListener(new af(this));
                this.K0.setDispatchKeyEventListener(new pd(this));
                this.K0.setShownFromBottom(false);
                boolean z16 = qnVar != null && qnVar.D6();
                boolean z17 = !z15 && (this.C0 <= 0 || c());
                if (z16) {
                    boolean z18 = !z17;
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, getContext(), this.R3, true, z18);
                    this.B4 = g1Var;
                    if (z15) {
                        f10 = 196.0f;
                        g1Var.g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                    } else {
                        f10 = 196.0f;
                        g1Var.g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                    }
                    this.B4.setMinimumWidth(AndroidUtilities.dp(f10));
                    this.B4.setOnClickListener(new jd(this, 11));
                    this.K0.a(this.B4, g7.e6.n(-1, 44));
                    SharedConfig.removeScheduledHint();
                    if (!z15 && this.L2 > 0) {
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, getContext(), this.R3, true, z18);
                        this.c = g1Var2;
                        g1Var2.g(LocaleController.getString(R.string.SendWhenOnline), R.drawable.msg_online, null);
                        this.c.setMinimumWidth(AndroidUtilities.dp(f10));
                        this.c.setOnClickListener(new jd(this, 12));
                        this.K0.a(this.c, g7.e6.n(-1, 44));
                    }
                } else {
                    f10 = 196.0f;
                }
                if (z17) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, getContext(), this.R3, !z16, true);
                    user = null;
                    g1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                    g1Var3.setMinimumWidth(AndroidUtilities.dp(f10));
                    g1Var3.setOnClickListener(new jd(this, 13));
                    this.K0.a(g1Var3, g7.e6.n(-1, 44));
                } else {
                    user = null;
                }
                this.K0.setupRadialSelectors(h0(org.telegram.ui.ActionBar.f6.I5));
                bf bfVar = new bf(this, this.K0);
                this.J0 = bfVar;
                bfVar.b = false;
                bfVar.setAnimationStyle(R.style.PopupContextAnimation2);
                this.J0.setOutsideTouchable(true);
                this.J0.setClippingEnabled(true);
                this.J0.setInputMethodMode(2);
                this.J0.setSoftInputMode(0);
                this.J0.getContentView().setFocusableInTouchMode(true);
                SharedConfig.removeScheduledOrNoSoundHint();
                eg egVar = this.U2;
                if (egVar != null) {
                    egVar.X1();
                }
            } else {
                user = null;
            }
            org.telegram.ui.ActionBar.g1 g1Var4 = this.B4;
            if (g1Var4 != null) {
                g1Var4.setVisibility(this.K ? 8 : 0);
            }
            if (this.c != null) {
                TLRPC.User i13 = qnVar == null ? user : qnVar.i();
                if (i13 != null && !i13.bot) {
                    TLRPC.UserStatus userStatus = i13.status;
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
                    oeVar2.invalidate();
                    view.performHapticFeedback(3, 2);
                    return true;
                }
            }
            measuredHeight = (iArr[1] - this.K0.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            this.J0.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.K0.getMeasuredWidth()), measuredHeight);
            this.J0.b();
            oeVar2.invalidate();
            view.performHapticFeedback(3, 2);
            return true;
        }
        cf cfVar = this.H0;
        if (cfVar != null) {
            cfVar.h(false);
        }
        AndroidUtilities.cancelRunOnUIThread(this.A4);
        cf cfVar2 = new cf(this, getContext(), b6Var, i10);
        this.H0 = cfVar2;
        cfVar2.setOnDismissListener(new a1(this, i11));
        boolean z19 = (this.Y2 == null && ((ffVar2 = this.A0) == null || TextUtils.isEmpty(ffVar2.getText()))) ? false : true;
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
            oeVar = oeVar2;
        } else {
            j10 = 0;
            if (this.W2 != null) {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.id = 0;
                tL_message2.out = true;
                oeVar = oeVar2;
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
                oeVar = oeVar2;
                if (z19) {
                    TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                    tL_message3.id = 0;
                    tL_message3.out = true;
                    tL_message3.peer_id = MessagesController.getInstance(this.M).getPeer(this.L2);
                    tL_message3.from_id = MessagesController.getInstance(this.M).getPeer(UserConfig.getInstance(this.M).getClientUserId());
                    ff ffVar3 = this.A0;
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(ffVar3 == null ? "" : ffVar3.getTextToUse())};
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
                        if (qnVar != null && (messagePreviewParams2 = qnVar.b5) != null && messagePreviewParams2.hasMedia) {
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
                } else if (qnVar != null && (ukVar = qnVar.X2) != null && ukVar.getTextureView() != null) {
                    cf cfVar3 = this.H0;
                    TextureView textureView = qnVar.X2.getTextureView();
                    cfVar3.getClass();
                    if (textureView != null) {
                        cfVar3.h0 = new RectF();
                        int[] iArr2 = new int[2];
                        textureView.getLocationOnScreen(iArr2);
                        cfVar3.h0.set(iArr2[0], iArr2[1], textureView.getWidth() + r9, textureView.getHeight() + iArr2[1]);
                    }
                    z10 = true;
                    this.H0.q(arrayList2);
                    i9 = 4;
                    if (z19 && this.W2 == null) {
                        cf cfVar4 = this.H0;
                        ff ffVar4 = this.A0;
                        d dVar = new d(this, i9);
                        sd sdVar = new sd(this, i12);
                        cfVar4.O = ffVar4;
                        cfVar4.Q = dVar;
                        cfVar4.R = sdVar;
                    }
                    this.H0.r(oeVar, true, new ih.b2(i9, this, z19));
                    if ((!z19 || z10) && this.L2 >= j10) {
                        this.H0.d(qnVar);
                        this.H0.o(this.N4);
                    }
                    F = x60.F(this, b6Var, oeVar);
                    z11 = qnVar == null && UserObject.isUserSelf(qnVar.i());
                    z12 = qnVar == null && qnVar.D6();
                    if (!z11 || (this.C0 > 0 && !c())) {
                        z14 = false;
                    }
                    if (z12) {
                        F.c(R.drawable.msg_calendar2, LocaleController.getString(z11 ? R.string.SetReminder : R.string.ScheduleMessage), new hd(this, 18), false);
                        if (!z11 && this.L2 > j10) {
                            F.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new hd(this, 19), false);
                            this.c = F.y();
                        }
                    }
                    if (qnVar != null && this.U2 != null && ChatObject.isMonoForum(qnVar.e)) {
                        F.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new hd(this, 17), false);
                    }
                    if (z14) {
                        F.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new od(this, z19, i12), false);
                    }
                    F.Y();
                    if (this.c != null) {
                        TLRPC.User i14 = qnVar == null ? null : qnVar.i();
                        if (i14 != null && !i14.bot) {
                            TLRPC.UserStatus userStatus2 = i14.status;
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
        i9 = 4;
        if (z19) {
            cf cfVar42 = this.H0;
            ff ffVar42 = this.A0;
            d dVar2 = new d(this, i9);
            sd sdVar2 = new sd(this, i12);
            cfVar42.O = ffVar42;
            cfVar42.Q = dVar2;
            cfVar42.R = sdVar2;
        }
        this.H0.r(oeVar, true, new ih.b2(i9, this, z19));
        if (!z19) {
        }
        this.H0.d(qnVar);
        this.H0.o(this.N4);
        F = x60.F(this, b6Var, oeVar);
        if (qnVar == null) {
        }
        if (qnVar == null) {
        }
        if (!z11) {
        }
        z14 = false;
        if (z12) {
        }
        if (qnVar != null) {
            F.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new hd(this, 17), false);
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

    public final void E1() {
        ff ffVar = this.A0;
        boolean z10 = false;
        p1((ffVar == null || ffVar.getLineCount() <= 2 || this.A0.getText() == null || TextUtils.isEmpty(this.A0.getText().toString().trim())) ? false : true);
        ff ffVar2 = this.A0;
        if (ffVar2 != null && ffVar2.getLineCount() > 2 && this.A0.getText() != null && !TextUtils.isEmpty(this.A0.getText().toString().trim())) {
            z10 = true;
        }
        v1(z10);
    }

    public final void F(boolean z10) {
        MessageObject messageObject;
        boolean z11 = this.L2 < 0 && this.S3 && this.U1 == null && (ff.x.g(this.M).e(getEditText() != null ? getEditText().toString() : null, this.S4) > 0 || ((messageObject = this.O2) != null && messageObject.isEphemeral()));
        td.a aVar = this.d5;
        boolean z12 = aVar.f != z11;
        aVar.a(z11, z10);
        oe oeVar = this.F0;
        if (oeVar != null) {
            oeVar.v = z11;
            oeVar.invalidate();
        }
        if (z12) {
            J(z10);
        }
    }

    public final void F0() {
        int height = this.h1.getHeight();
        if (!this.u2) {
            height -= this.v2;
        }
        eg egVar = this.U2;
        if (egVar != null) {
            egVar.K1(height);
        }
        if (this.B1 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
            td.a aVar = this.b5;
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

    public final void F1() {
        float f10 = this.r * this.h;
        de deVar = this.M0;
        deVar.setScaleX(f10);
        deVar.setScaleY(this.r * this.h);
        deVar.setAlpha(this.s * this.n);
    }

    @Override // org.telegram.ui.Components.wu0
    public final void G(int i9, boolean z10) {
        MessageObject messageObject;
        ff ffVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z11;
        int i10;
        int i11;
        xg.f fVar;
        if (this.M1 != 0) {
            this.G2 = i9;
            this.H2 = z10;
            this.u2 = i9 > 0;
            D();
            return;
        }
        if (i9 > AndroidUtilities.dp(50.0f) && this.u2 && !AndroidUtilities.isInMultiwindow) {
            if (z10) {
                this.t2 = i9;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.t2).commit();
            } else {
                this.s2 = i9;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.s2).commit();
            }
        }
        if (this.u2 && this.S0 && this.Q0 == null) {
            this.S0 = false;
        }
        boolean s02 = s0();
        xu0 xu0Var = this.h1;
        org.telegram.ui.qn qnVar = this.K2;
        if (s02) {
            int i12 = z10 ? this.t2 : this.s2;
            if (qnVar != null && qnVar.getParentLayout() != null) {
                i12 -= ((ActionBarLayout) qnVar.getParentLayout()).v(false);
            }
            if (this.a2 == 1) {
                rf rfVar = this.C1;
                if (!rfVar.f) {
                    i12 = Math.min(rfVar.getKeyboardHeight(), i12);
                }
            }
            int i13 = this.a2;
            ViewGroup viewGroup = i13 == 0 ? this.Q0 : i13 == 1 ? this.C1 : null;
            rf rfVar2 = this.C1;
            if (rfVar2 != null) {
                rfVar2.setPanelHeight(i12);
                xg.f fVar2 = this.Y4;
                if (fVar2 != null && i12 > 0 && this.a2 == 1) {
                    ((xg.i) fVar2).g(i12);
                }
            }
            if (viewGroup != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                if (!this.v3 && !this.u3 && (((i10 = layoutParams.width) != (i11 = AndroidUtilities.displaySize.x) || layoutParams.height != i12) && ((fVar = this.Y4) == null || i10 != -1 || layoutParams.height != -1))) {
                    if (fVar == null) {
                        layoutParams.width = i11;
                        layoutParams.height = i12;
                        viewGroup.setLayoutParams(layoutParams);
                    }
                    if (xu0Var != null) {
                        int i14 = this.v2;
                        this.v2 = layoutParams.height;
                        xu0Var.requestLayout();
                        F0();
                        if (this.d2 && !this.u2 && i14 != this.v2 && N0()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.R0 = animatorSet;
                            if (this.Y4 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.v2 - i14, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, this.v2 - i14, 0.0f));
                            }
                            this.R0.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                            this.R0.setDuration(250L);
                            this.R0.addListener(new pe(this, 10));
                            AndroidUtilities.runOnUIThread(this.T3, 50L);
                            this.G3.lock();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.G2 == i9 && this.H2 == z10) {
            F0();
            return;
        }
        this.G2 = i9;
        this.H2 = z10;
        boolean z12 = this.u2;
        this.u2 = i9 > 0;
        D();
        if (this.u2 && s0() && this.w3 == null) {
            t1(0, this.a2, true, true);
        } else if (!this.u2 && !s0() && (messageObject = this.h2) != null && this.O2 != messageObject && !i0() && !v() && !org.telegram.ui.ActionBar.o2.hasSheets(qnVar) && (((ffVar = this.A0) == null || TextUtils.isEmpty(ffVar.getText())) && (tL_replyKeyboardMarkup = this.i2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.q1 q1Var = xu0Var.D;
            if (q1Var.f) {
                q1Var.j();
            } else {
                q1Var.v = true;
            }
            t1(1, 1, false, true);
        }
        if (this.v2 != 0 && !(z11 = this.u2) && z11 != z12 && !s0()) {
            this.v2 = 0;
            xu0Var.requestLayout();
        }
        if (this.u2 && this.f3) {
            this.f3 = false;
            if (this.k3) {
                this.k3 = false;
                this.C1.setButtons(this.i2);
            }
            AndroidUtilities.cancelRunOnUIThread(this.m3);
        }
        F0();
    }

    public void G0() {
        if ((i0() && v()) || org.telegram.ui.ActionBar.o2.hasSheets(this.K2)) {
            return;
        }
        eg egVar = this.U2;
        if (egVar != null) {
            egVar.i1();
        }
        ff ffVar = this.A0;
        if (ffVar == null || AndroidUtilities.showKeyboard(ffVar)) {
            return;
        }
        this.A0.clearFocus();
        this.A0.requestFocus();
    }

    public final void G1(boolean z10) {
        boolean z11;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        MessageObject messageObject;
        TLRPC.ReplyMarkup replyMarkup;
        TLRPC.ReplyMarkup replyMarkup2;
        ff ffVar = this.A0;
        if (ffVar == null) {
            return;
        }
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            ffVar.setHintText(charSequence, z10);
            this.A0.setHintText2(this.f, z10);
            return;
        }
        boolean z12 = false;
        if (!this.v0 && !q0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d " + LocaleController.getString("PlainTextRestrictedHint", R.string.PlainTextRestrictedHint));
            spannableStringBuilder.setSpan(new eq(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
            this.A0.setHintText(spannableStringBuilder, z10);
            this.A0.setText((CharSequence) null);
            this.A0.setEnabled(false);
            this.A0.setInputType(1);
            return;
        }
        this.A0.setEnabled(true);
        int inputType = this.A0.getInputType();
        int i9 = this.a;
        if (inputType != i9) {
            this.A0.setInputType(i9);
        }
        R1();
        org.telegram.ui.qn qnVar = this.K2;
        boolean z13 = qnVar != null && qnVar.N3 == 8 && qnVar.P3;
        long sendPaidMessagesStars = qnVar != null ? qnVar.getMessagesController().getSendPaidMessagesStars(qnVar.a()) : 0L;
        if (sendPaidMessagesStars > 0) {
            sendPaidMessagesStars *= getMessagesCount();
        }
        int i10 = qnVar != null ? qnVar.N3 : -1;
        if (i10 == 9) {
            this.A0.setHintText(LocaleController.getString(R.string.WelcomeMessageEnter));
            return;
        }
        if (i10 == 5) {
            if ("hello".equalsIgnoreCase(qnVar.M3)) {
                this.A0.setHintText(LocaleController.getString(R.string.BusinessGreetingEnter));
                return;
            } else if ("away".equalsIgnoreCase(qnVar.M3)) {
                this.A0.setHintText(LocaleController.getString(R.string.BusinessAwayEnter));
                return;
            } else {
                this.A0.setHintText(LocaleController.getString(R.string.BusinessRepliesEnter));
                return;
            }
        }
        eq[] eqVarArr = this.J4;
        if (z13) {
            this.A0.setHintText(sendPaidMessagesStars > 0 ? gh.oa.Q0(LocaleController.formatString(R.string.SuggestPostForStars, LocaleController.formatNumber((int) sendPaidMessagesStars, ','), eqVarArr)) : LocaleController.formatString(R.string.SuggestPostForFree, new Object[0]));
            eq eqVar = eqVarArr[0];
            if (eqVar != null) {
                eqVar.spaceScaleX = 0.9f;
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
            this.A0.setHintText(gh.oa.V0(false, LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber((int) sendPaidMessagesStars, ',')), eqVarArr));
            eq eqVar2 = eqVarArr[0];
            if (eqVar2 != null) {
                eqVar2.spaceScaleX = 0.9f;
                return;
            }
            return;
        }
        if (this.T0 && (messageObject = this.h2) != null && (replyMarkup = messageObject.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
            this.A0.setHintText(this.h2.messageOwner.reply_markup.placeholder, z10);
            return;
        }
        if (qnVar != null && qnVar.v9()) {
            MessageObject messageObject3 = this.P2;
            if (messageObject3 != null && (tL_forumTopic = messageObject3.replyToForumTopic) != null && (str2 = tL_forumTopic.title) != null) {
                this.A0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str2), z10);
                return;
            }
            TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.M).getTopicsController().findTopic(qnVar.e.id, 1L);
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
        if (user != null && user.bot_forum_view && !user.bot_forum_can_manage_topics && qnVar != null && !qnVar.d4) {
            this.A0.setHintText(LocaleController.getString(R.string.SendBotNoThread));
            return;
        }
        if (qnVar != null && qnVar.F9() && !qnVar.d4) {
            if (qnVar.T3 == null || !qnVar.c4) {
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

    public final void H0() {
        if (i0() && v()) {
            return;
        }
        org.telegram.ui.qn qnVar = this.K2;
        if (org.telegram.ui.ActionBar.o2.hasSheets(qnVar)) {
            return;
        }
        t1((AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || (qnVar != null && qnVar.isInBubbleMode()) || this.e2) ? 0 : 2, 0, true, true);
        eg egVar = this.U2;
        if (egVar != null) {
            egVar.i1();
        }
        ff ffVar = this.A0;
        if (ffVar != null) {
            ffVar.requestFocus();
        }
        AndroidUtilities.showKeyboard(this.A0);
        if (this.e2) {
            this.g2 = true;
            return;
        }
        if (AndroidUtilities.usingHardwareInput || this.u2 || AndroidUtilities.isInMultiwindow) {
            return;
        }
        if (qnVar == null || !qnVar.isInBubbleMode()) {
            this.f3 = true;
            uf ufVar = this.Q0;
            if (ufVar != null) {
                ufVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
            }
            re reVar = this.m3;
            AndroidUtilities.cancelRunOnUIThread(reVar);
            AndroidUtilities.runOnUIThread(reVar, 100L);
        }
    }

    public final void H1(int i9) {
        ImageView imageView;
        qe qeVar;
        qe qeVar2;
        ge geVar;
        this.K4 = i9;
        if (this.A0 != null) {
            MessageObject messageObject = this.U1;
            if (messageObject == null || messageObject.needResendWhenEdit()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A0.getLayoutParams();
                int i10 = layoutParams.rightMargin;
                boolean z10 = this.v4;
                oe oeVar = this.F0;
                if (z10 && this.g5) {
                    layoutParams.rightMargin = Math.max(0, oeVar.l() - AndroidUtilities.dp(44.0f)) + AndroidUtilities.dp(this.q4 ? 50.0f : 2.0f);
                } else if (i9 == 1 || i9 == 2) {
                    se seVar = this.s1;
                    if (seVar == null || seVar.getVisibility() != 0 || (qeVar2 = this.E1) == null || qeVar2.getVisibility() != 0 || (geVar = this.m1) == null || geVar.getVisibility() != 0) {
                        se seVar2 = this.s1;
                        if ((seVar2 == null || seVar2.getVisibility() != 0) && (((imageView = this.D1) == null || imageView.getVisibility() != 0) && ((qeVar = this.E1) == null || qeVar.getTag() == null))) {
                            layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                        } else {
                            layoutParams.rightMargin = AndroidUtilities.dp(98.0f);
                        }
                    } else {
                        layoutParams.rightMargin = AndroidUtilities.dp(146.0f);
                    }
                } else {
                    qe qeVar3 = this.E1;
                    if (qeVar3 == null || qeVar3.getTag() == null) {
                        layoutParams.rightMargin = AndroidUtilities.dp(2.0f);
                    } else {
                        layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                    }
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, oeVar.l() - AndroidUtilities.dp(44.0f)));
                oe oeVar2 = this.A1;
                if (oeVar2 != null && oeVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.A1.l() - AndroidUtilities.dp(44.0f)));
                }
                if (i10 != layoutParams.rightMargin) {
                    this.A0.setLayoutParams(layoutParams);
                }
                ae aeVar = this.a1;
                if (aeVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) aeVar.getLayoutParams();
                    layoutParams2.rightMargin = this.U1 == null ? org.telegram.messenger.l0.b(44.0f, oeVar.l(), 0) : 0;
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I0() {
        org.telegram.ui.qn qnVar;
        Editable editable;
        qh.x1 x1Var;
        CharSequence[] charSequenceArr;
        ArrayList<TLRPC.MessageEntity> entities;
        if (this.A0 == null || (qnVar = this.K2) == null || !MessagesController.getInstance(this.M).richEditorAvailable()) {
            return;
        }
        TL_iv.RichMessage richMessage = this.z1;
        if (richMessage != null) {
            x1Var = new qh.x1(richMessage);
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
                    qh.x1 x1Var2 = new qh.x1(editable);
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
                    x1Var2.H = new hd(this, 15);
                    x1Var = x1Var2;
                }
            }
            editable = text;
            qh.x1 x1Var22 = new qh.x1(editable);
            if (editable == text) {
            }
            x1Var22.H = new hd(this, 15);
            x1Var = x1Var22;
        }
        x1Var.setResourceProvider(this.R3);
        x1Var.F = qnVar;
        x1Var.s = qnVar.O;
        x1Var.v = qnVar.U;
        x1Var.G = new hd(this, 16);
        qnVar.presentFragment(x1Var);
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
        kh.x3 x3Var;
        TLRPC.UserFull userFull = getParentFragment() == null ? null : getParentFragment().W7;
        TLRPC.UserFull userFull2 = MessagesController.getInstance(this.M).getUserFull(UserConfig.getInstance(this.M).getClientUserId());
        TLRPC.User i9 = getParentFragment() != null ? getParentFragment().i() : null;
        boolean premiumPurchaseBlocked = MessagesController.getInstance(this.M).premiumPurchaseBlocked();
        org.telegram.ui.qn qnVar = this.K2;
        if (!premiumPurchaseBlocked && getParentFragment() != null && i9 != null && !BuildVars.IS_BILLING_UNAVAILABLE && ((!UserObject.isUserSelf(i9) || (userFull2 != null && userFull2.display_gifts_button)) && !UserObject.isBot(i9) && !MessagesController.isSupportUser(i9) && userFull != null)) {
            if (!i9.premium && MessagesController.getInstance(this.M).giftAttachMenuIcon && MessagesController.getInstance(this.M).giftTextFieldIcon) {
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
            if (qnVar != null && qnVar.N3 == 0) {
                z11 = true;
                if (!z11 && (x3Var = this.H) != null) {
                    x3Var.e(true);
                }
                if (z11 && this.F1 == null) {
                    return;
                }
                if (this.F1 == null && qnVar != null) {
                    se seVar = new se(this, getContext(), 0);
                    this.F1 = seVar;
                    seVar.setImageResource(R.drawable.msg_input_gift);
                    this.F1.setColorFilter(new PorterDuffColorFilter(h0(org.telegram.ui.ActionBar.f6.Wk), PorterDuff.Mode.MULTIPLY));
                    this.F1.setVisibility(8);
                    this.F1.setContentDescription(LocaleController.getString(R.string.GiftPremium));
                    this.F1.setScaleType(ImageView.ScaleType.CENTER);
                    this.F1.setBackground(org.telegram.ui.ActionBar.f6.f0(h0(org.telegram.ui.ActionBar.f6.i6), 1, -1));
                    this.k1.addView(this.F1, 0, g7.e6.e(44, 44, 21));
                    this.F1.setOnClickListener(new jd(this, 9));
                }
                AndroidUtilities.updateViewVisibilityAnimated(this.F1, z11, 1.0f, true, 1.0f, z10, new fd(this, 0));
                if (z11) {
                    return;
                }
                C();
                return;
            }
        }
        z11 = false;
        if (!z11) {
            x3Var.e(true);
        }
        if (z11) {
        }
        if (this.F1 == null) {
            se seVar2 = new se(this, getContext(), 0);
            this.F1 = seVar2;
            seVar2.setImageResource(R.drawable.msg_input_gift);
            this.F1.setColorFilter(new PorterDuffColorFilter(h0(org.telegram.ui.ActionBar.f6.Wk), PorterDuff.Mode.MULTIPLY));
            this.F1.setVisibility(8);
            this.F1.setContentDescription(LocaleController.getString(R.string.GiftPremium));
            this.F1.setScaleType(ImageView.ScaleType.CENTER);
            this.F1.setBackground(org.telegram.ui.ActionBar.f6.f0(h0(org.telegram.ui.ActionBar.f6.i6), 1, -1));
            this.k1.addView(this.F1, 0, g7.e6.e(44, 44, 21));
            this.F1.setOnClickListener(new jd(this, 9));
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.F1, z11, 1.0f, true, 1.0f, z10, new fd(this, 0));
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
        oe oeVar;
        ImageView imageView;
        String str;
        le leVar;
        int i9;
        AnimatorSet animatorSet;
        ?? r14;
        ImageView imageView2;
        boolean z11;
        se seVar;
        se seVar2;
        AnimatorSet animatorSet2;
        int i10;
        float f10;
        se seVar3;
        AnimatorSet animatorSet3;
        ImageView imageView3;
        int i11;
        boolean z12;
        ?? r52;
        ?? r142;
        if (this.U1 != null || this.A2) {
            return;
        }
        boolean z13 = this.e2 ? false : z10;
        R1();
        ff ffVar = this.A0;
        CharSequence trimmedString = ffVar == null ? "" : AndroidUtilities.getTrimmedString(ffVar.getTextToUse());
        int i12 = this.C0;
        oe oeVar2 = this.F0;
        td.a aVar = this.d5;
        zd zdVar = this.V3;
        le leVar2 = this.V0;
        Property property = View.SCALE_X;
        Property property2 = View.SCALE_Y;
        Property property3 = View.ALPHA;
        gh.m mVar = this.k1;
        me meVar = this.X0;
        mg mgVar = this.B0;
        ge geVar = this.m1;
        boolean z14 = z13;
        ImageView imageView4 = this.L0;
        CharSequence charSequence = trimmedString;
        if (i12 <= 0 || i12 == Integer.MAX_VALUE || c() || aVar.f) {
            int length = charSequence.length();
            td.a aVar2 = this.c5;
            if (length > 0 || this.C2 || this.y1 || this.W2 != null || this.Z2 != null) {
                oeVar = oeVar2;
            } else {
                oeVar = oeVar2;
                if ((this.C0 != Integer.MAX_VALUE || c() || aVar.f) && ((!this.g5 || getStarsPrice() <= 0) && !aVar2.f)) {
                    if (this.Q0 == null || !this.S0 || (!(this.s3 || (this.t3 && this.M1 == 2)) || AndroidUtilities.isInMultiwindow || this.g5)) {
                        if (getSendButtonInternal().getVisibility() == 0 || imageView4.getVisibility() == 0 || (((seVar3 = this.O0) != null && seVar3.getVisibility() == 0) || mgVar.getVisibility() == 0)) {
                            if (!z14) {
                                mgVar.setScaleX(0.1f);
                                mgVar.setScaleY(0.1f);
                                mgVar.setAlpha(0.0f);
                                setSlowModeButtonVisible(false);
                                getSendButtonInternal().setScaleX(0.1f);
                                getSendButtonInternal().setScaleY(0.1f);
                                getSendButtonInternal().setAlpha(0.0f);
                                getSendButtonInternal().setVisibility(8);
                                imageView4.setScaleX(0.1f);
                                imageView4.setScaleY(0.1f);
                                imageView4.setAlpha(0.0f);
                                imageView4.setVisibility(8);
                                se seVar4 = this.O0;
                                if (seVar4 != null) {
                                    seVar4.setScaleX(0.1f);
                                    this.O0.setScaleY(0.1f);
                                    this.O0.setAlpha(0.0f);
                                    this.O0.setVisibility(8);
                                }
                                meVar.setScaleX(1.0f);
                                meVar.setScaleY(1.0f);
                                meVar.setAlpha(1.0f);
                                leVar2.setVisibility(0);
                                if (mVar != null) {
                                    if (getVisibility() == 0) {
                                        this.U2.c2();
                                    }
                                    this.A = 1.0f;
                                    A1();
                                    mVar.setScaleX(1.0f);
                                    mVar.setVisibility(0);
                                    H1(1);
                                }
                                if (geVar != null) {
                                    ViewPropertyAnimator viewPropertyAnimator = this.l1;
                                    if (viewPropertyAnimator != null) {
                                        viewPropertyAnimator.cancel();
                                        this.l1 = null;
                                    }
                                    this.q1 = 1.0f;
                                    geVar.setAlpha(1.0f);
                                    geVar.setScaleX(1.0f);
                                    geVar.setScaleY(1.0f);
                                }
                                this.G1 = false;
                                eg egVar = this.U2;
                                if (egVar != null && egVar.n0()) {
                                    Z();
                                }
                                if (this.E1 != null) {
                                    eg egVar2 = this.U2;
                                    if (egVar2 != null && egVar2.n0()) {
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
                                if (mVar != null) {
                                    if (mVar.getVisibility() != 0) {
                                        mVar.setVisibility(0);
                                        this.A = 0.0f;
                                        A1();
                                        mVar.setScaleX(0.0f);
                                    }
                                    this.n2 = new AnimatorSet();
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(ObjectAnimator.ofFloat(mVar, zdVar, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(mVar, (Property<gh.m, Float>) property, 1.0f));
                                    rg.g gVar = this.Z4;
                                    if (gVar != null) {
                                        gVar.e(0, false, true);
                                    }
                                    if (geVar != null) {
                                        ViewPropertyAnimator viewPropertyAnimator2 = this.l1;
                                        if (viewPropertyAnimator2 != null) {
                                            viewPropertyAnimator2.cancel();
                                            this.l1 = null;
                                        }
                                        this.q1 = 1.0f;
                                        arrayList.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property3, 1.0f));
                                        arrayList.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property, 1.0f));
                                        arrayList.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property2, 1.0f));
                                    }
                                    eg egVar3 = this.U2;
                                    boolean z15 = egVar3 != null && egVar3.n0();
                                    this.G1 = false;
                                    if (z15) {
                                        Z();
                                    }
                                    qe qeVar = this.E1;
                                    if (qeVar != null) {
                                        if (z15) {
                                            qeVar.setVisibility(0);
                                            this.E1.setTag(1);
                                            this.E1.setPivotX(AndroidUtilities.dp(44.0f));
                                            arrayList.add(ObjectAnimator.ofFloat(this.E1, (Property<qe, Float>) property3, 1.0f));
                                            arrayList.add(ObjectAnimator.ofFloat(this.E1, (Property<qe, Float>) property, 1.0f));
                                            arrayList.add(p(0.0f));
                                            ImageView imageView5 = this.D1;
                                            if (imageView5 != null && imageView5.getVisibility() == 0) {
                                                imageView5.setVisibility(8);
                                            }
                                        } else {
                                            qeVar.setAlpha(1.0f);
                                            this.E1.setScaleX(1.0f);
                                            this.E1.setScaleY(1.0f);
                                            this.E1.setTranslationX(0.0f);
                                        }
                                    }
                                    this.n2.playTogether(arrayList);
                                    this.n2.setDuration(100L);
                                    this.n2.addListener(new pe(this, 6));
                                    this.n2.start();
                                    H1(1);
                                    if (getVisibility() == 0) {
                                        this.U2.c2();
                                    }
                                }
                                leVar2.setVisibility(0);
                                this.m2 = new AnimatorSet();
                                this.q2 = 2;
                                ArrayList arrayList2 = new ArrayList();
                                org.telegram.ui.qn qnVar = this.K2;
                                TLRPC.Chat g10 = qnVar == null ? null : qnVar.g();
                                TLRPC.UserFull w8 = qnVar == null ? this.G : qnVar.w8();
                                if (g10 != null) {
                                    if (!ChatObject.canSendVoice(g10)) {
                                    }
                                    f10 = 1.0f;
                                } else if (w8 == null) {
                                    i10 = 1;
                                    f10 = 1.0f;
                                    float[] fArr = new float[i10];
                                    fArr[0] = 1.0f;
                                    arrayList2.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property, fArr));
                                    float[] fArr2 = new float[i10];
                                    fArr2[0] = 1.0f;
                                    arrayList2.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property2, fArr2));
                                    float[] fArr3 = new float[i10];
                                    fArr3[0] = f10;
                                    arrayList2.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property3, fArr3));
                                    if (imageView4.getVisibility() != 0) {
                                        float[] fArr4 = new float[i10];
                                        fArr4[0] = 0.1f;
                                        arrayList2.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property, fArr4));
                                        float[] fArr5 = new float[i10];
                                        fArr5[0] = 0.1f;
                                        arrayList2.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property2, fArr5));
                                        float[] fArr6 = new float[i10];
                                        fArr6[0] = 0.0f;
                                        arrayList2.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property3, fArr6));
                                    } else {
                                        se seVar5 = this.O0;
                                        if (seVar5 != null && seVar5.getVisibility() == 0) {
                                            se seVar6 = this.O0;
                                            float[] fArr7 = new float[i10];
                                            fArr7[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(seVar6, (Property<se, Float>) property, fArr7));
                                            se seVar7 = this.O0;
                                            float[] fArr8 = new float[i10];
                                            fArr8[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(seVar7, (Property<se, Float>) property2, fArr8));
                                            se seVar8 = this.O0;
                                            float[] fArr9 = new float[i10];
                                            fArr9[0] = 0.0f;
                                            arrayList2.add(ObjectAnimator.ofFloat(seVar8, (Property<se, Float>) property3, fArr9));
                                        } else if (mgVar.getVisibility() == 0) {
                                            float[] fArr10 = new float[i10];
                                            fArr10[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(mgVar, (Property<mg, Float>) property, fArr10));
                                            float[] fArr11 = new float[i10];
                                            fArr11[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(mgVar, (Property<mg, Float>) property2, fArr11));
                                            float[] fArr12 = new float[i10];
                                            fArr12[0] = 0.0f;
                                            arrayList2.add(ObjectAnimator.ofFloat(mgVar, (Property<mg, Float>) property3, fArr12));
                                        } else {
                                            View sendButtonInternal = getSendButtonInternal();
                                            float[] fArr13 = new float[i10];
                                            fArr13[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(sendButtonInternal, (Property<View, Float>) property, fArr13));
                                            View sendButtonInternal2 = getSendButtonInternal();
                                            float[] fArr14 = new float[i10];
                                            fArr14[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(sendButtonInternal2, (Property<View, Float>) property2, fArr14));
                                            View sendButtonInternal3 = getSendButtonInternal();
                                            float[] fArr15 = new float[i10];
                                            fArr15[0] = 0.0f;
                                            arrayList2.add(ObjectAnimator.ofFloat(sendButtonInternal3, (Property<View, Float>) property3, fArr15));
                                        }
                                    }
                                    this.m2.playTogether(arrayList2);
                                    this.m2.setDuration(150L);
                                    this.m2.addListener(new pe(this, 7));
                                    this.m2.start();
                                }
                                i10 = 1;
                                float[] fArr16 = new float[i10];
                                fArr16[0] = 1.0f;
                                arrayList2.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property, fArr16));
                                float[] fArr22 = new float[i10];
                                fArr22[0] = 1.0f;
                                arrayList2.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property2, fArr22));
                                float[] fArr32 = new float[i10];
                                fArr32[0] = f10;
                                arrayList2.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property3, fArr32));
                                if (imageView4.getVisibility() != 0) {
                                }
                                this.m2.playTogether(arrayList2);
                                this.m2.setDuration(150L);
                                this.m2.addListener(new pe(this, 7));
                                this.m2.start();
                            }
                        }
                    } else if (!z14) {
                        mgVar.setScaleX(0.1f);
                        mgVar.setScaleY(0.1f);
                        mgVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        getSendButtonInternal().setVisibility(8);
                        imageView4.setScaleX(0.1f);
                        imageView4.setScaleY(0.1f);
                        imageView4.setAlpha(0.0f);
                        imageView4.setVisibility(8);
                        meVar.setScaleX(0.1f);
                        meVar.setScaleY(0.1f);
                        meVar.setAlpha(0.0f);
                        leVar2.setVisibility(8);
                        U();
                        this.O0.setScaleX(1.0f);
                        this.O0.setScaleY(1.0f);
                        this.O0.setAlpha(1.0f);
                        this.O0.setVisibility(0);
                        if (mVar != null) {
                            if (getVisibility() == 0) {
                                this.U2.c2();
                            }
                            mVar.setVisibility(0);
                            H1(1);
                        }
                        this.G1 = false;
                        eg egVar4 = this.U2;
                        boolean z16 = egVar4 != null && egVar4.n0();
                        if (z16) {
                            Z();
                        }
                        qe qeVar2 = this.E1;
                        if (qeVar2 != null) {
                            if (z16) {
                                qeVar2.setVisibility(0);
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
                        if (mVar != null && this.r2 == 0) {
                            mVar.setVisibility(0);
                            this.n2 = new AnimatorSet();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(ObjectAnimator.ofFloat(mVar, zdVar, 1.0f));
                            arrayList3.add(ObjectAnimator.ofFloat(mVar, (Property<gh.m, Float>) property, 1.0f));
                            rg.g gVar2 = this.Z4;
                            if (gVar2 != null) {
                                gVar2.e(0, false, true);
                            }
                            if (geVar != null) {
                                ViewPropertyAnimator viewPropertyAnimator3 = this.l1;
                                if (viewPropertyAnimator3 != null) {
                                    viewPropertyAnimator3.cancel();
                                    this.l1 = null;
                                }
                                this.q1 = 1.0f;
                                arrayList3.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property3, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property2, 1.0f));
                            }
                            eg egVar5 = this.U2;
                            boolean z17 = egVar5 != null && egVar5.n0();
                            this.G1 = false;
                            if (z17) {
                                Z();
                            }
                            qe qeVar3 = this.E1;
                            if (qeVar3 != null) {
                                qeVar3.setScaleY(1.0f);
                                if (z17) {
                                    this.E1.setVisibility(0);
                                    this.E1.setTag(1);
                                    this.E1.setPivotX(AndroidUtilities.dp(44.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.E1, (Property<qe, Float>) property3, 1.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.E1, (Property<qe, Float>) property, 1.0f));
                                    arrayList3.add(p(0.0f));
                                } else {
                                    this.E1.setAlpha(1.0f);
                                    this.E1.setScaleX(1.0f);
                                    this.E1.setTranslationX(0.0f);
                                }
                            }
                            this.n2.playTogether(arrayList3);
                            this.n2.setDuration(100L);
                            this.n2.addListener(new pe(this, 4));
                            this.n2.start();
                            H1(1);
                            if (getVisibility() == 0) {
                                this.U2.c2();
                            }
                        }
                        U();
                        this.O0.setVisibility(0);
                        this.m2 = new AnimatorSet();
                        this.q2 = 4;
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(ObjectAnimator.ofFloat(this.O0, (Property<se, Float>) property, 1.0f));
                        arrayList4.add(ObjectAnimator.ofFloat(this.O0, (Property<se, Float>) property2, 1.0f));
                        arrayList4.add(ObjectAnimator.ofFloat(this.O0, (Property<se, Float>) property3, 1.0f));
                        if (imageView4.getVisibility() == 0) {
                            arrayList4.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property2, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property3, 0.0f));
                        } else if (leVar2.getVisibility() == 0) {
                            arrayList4.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property2, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property3, 0.0f));
                        } else if (mgVar.getVisibility() == 0) {
                            arrayList4.add(ObjectAnimator.ofFloat(mgVar, (Property<mg, Float>) property, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(mgVar, (Property<mg, Float>) property2, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(mgVar, (Property<mg, Float>) property3, 0.0f));
                        } else {
                            arrayList4.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property2, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property3, 0.0f));
                        }
                        this.m2.playTogether(arrayList4);
                        this.m2.setDuration(250L);
                        this.m2.addListener(new pe(this, 5));
                        this.m2.start();
                    }
                }
            }
            ff ffVar2 = this.A0;
            String caption = ffVar2 == null ? null : ffVar2.getCaption();
            boolean z18 = caption != null && (getSendButtonInternal().getVisibility() == 0 || ((seVar2 = this.O0) != null && seVar2.getVisibility() == 0));
            boolean z19 = caption == null && (imageView4.getVisibility() == 0 || ((seVar = this.O0) != null && seVar.getVisibility() == 0));
            int h02 = (this.C0 != Integer.MAX_VALUE || c() || aVar.f) ? h0(org.telegram.ui.ActionBar.f6.Yd) : h0(org.telegram.ui.ActionBar.f6.Wk);
            ff ffVar3 = this.A0;
            boolean z20 = (ffVar3 != null && (!TextUtils.isEmpty(ffVar3.getCaption()) || this.A0.isNearRightCaption(AndroidUtilities.dp(44.0f)))) || LocaleController.isRTL;
            if (h02 != this.G0) {
                this.G0 = h02;
                Drawable background = oeVar.getBackground();
                int i13 = h02;
                int red = Color.red(i13);
                leVar = leVar2;
                int green = Color.green(i13);
                str = caption;
                int blue = Color.blue(i13);
                imageView = imageView4;
                org.telegram.ui.ActionBar.f6.B1(background, Color.argb(24, red, green, blue), true);
            } else {
                imageView = imageView4;
                str = caption;
                leVar = leVar2;
            }
            if (leVar.getVisibility() != 0 && mgVar.getVisibility() != 0 && !z18 && !z19 && !aVar2.f) {
                rg.g gVar3 = this.Z4;
                if (gVar3 != null) {
                    gVar3.e(0, z20, true);
                    if (geVar != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.l1;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.l1 = null;
                        }
                        ViewPropertyAnimator animate = geVar.animate();
                        float f11 = z20 ? 0.0f : 1.0f;
                        this.q1 = f11;
                        ViewPropertyAnimator duration = animate.alpha(f11).scaleX(z20 ? 0.5f : 1.0f).scaleY(z20 ? 0.5f : 1.0f).setInterpolator(gr.h).setDuration(320L);
                        this.l1 = duration;
                        duration.start();
                    }
                }
            } else {
                if (!z14) {
                    String str2 = str;
                    ImageView imageView6 = imageView;
                    meVar.setScaleX(0.1f);
                    meVar.setScaleY(0.1f);
                    meVar.setAlpha(0.0f);
                    leVar.setVisibility(8);
                    if (mgVar.getVisibility() == 0) {
                        mgVar.setScaleX(0.1f);
                        mgVar.setScaleY(0.1f);
                        mgVar.setAlpha(0.0f);
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
                    se seVar9 = this.O0;
                    if (seVar9 == null || seVar9.getVisibility() != 0) {
                        i9 = 8;
                    } else {
                        this.O0.setScaleX(0.1f);
                        this.O0.setScaleY(0.1f);
                        this.O0.setAlpha(0.0f);
                        i9 = 8;
                        this.O0.setVisibility(8);
                    }
                    if (mVar != null) {
                        mVar.setVisibility(i9);
                        if (this.U2 != null && getVisibility() == 0) {
                            this.U2.h0();
                        }
                        H1(0);
                        rg.g gVar4 = this.Z4;
                        if (gVar4 != null) {
                            gVar4.e(0, z20, true);
                            if (geVar != null) {
                                float f12 = z20 ? 0.0f : 1.0f;
                                this.q1 = f12;
                                geVar.setAlpha(f12);
                                geVar.setScaleX(z20 ? 0.5f : 1.0f);
                                geVar.setScaleY(z20 ? 0.5f : 1.0f);
                            }
                        } else if (geVar != null) {
                            this.q1 = 0.0f;
                            geVar.setAlpha(0.0f);
                            geVar.setScaleX(0.5f);
                            geVar.setScaleY(0.5f);
                        }
                    }
                    this.G1 = true;
                    if (this.E1 != null) {
                        eg egVar6 = this.U2;
                        if (egVar6 != null && egVar6.n0()) {
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
                        imageView3.animate().translationX(z11 ? -org.telegram.messenger.l0.b(64.0f, oeVar.l(), 0) : AndroidUtilities.dp(42.0f)).setDuration(320L).setInterpolator(gr.h).start();
                        return;
                    } else {
                        imageView3.setTranslationX(z11 ? -org.telegram.messenger.l0.b(64.0f, oeVar.l(), 0) : AndroidUtilities.dp(42.0f));
                        return;
                    }
                }
                int i14 = this.q2;
                if (i14 == 1 && str == null) {
                    return;
                }
                if (i14 == 3 && str != null) {
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
                if (mVar != null) {
                    this.n2 = new AnimatorSet();
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(ObjectAnimator.ofFloat(mVar, zdVar, 0.0f));
                    arrayList5.add(ObjectAnimator.ofFloat(mVar, (Property<gh.m, Float>) property, 0.5f));
                    ViewPropertyAnimator viewPropertyAnimator5 = this.l1;
                    if (viewPropertyAnimator5 != null) {
                        viewPropertyAnimator5.cancel();
                        this.l1 = null;
                    }
                    rg.g gVar5 = this.Z4;
                    if (gVar5 != null) {
                        gVar5.e(0, z20, true);
                        if (geVar != null) {
                            float f13 = z20 ? 0.0f : 1.0f;
                            this.q1 = f13;
                            arrayList5.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property3, f13));
                            arrayList5.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property, z20 ? 0.5f : 1.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property2, z20 ? 0.5f : 1.0f));
                        }
                    } else if (geVar != null) {
                        this.q1 = 0.0f;
                        arrayList5.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property3, 0.0f));
                        arrayList5.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property, 0.5f));
                        arrayList5.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property2, 0.5f));
                    }
                    eg egVar7 = this.U2;
                    boolean z21 = egVar7 != null && egVar7.n0();
                    this.G1 = true;
                    qe qeVar4 = this.E1;
                    if (qeVar4 != null) {
                        qeVar4.setScaleY(1.0f);
                        if (z21) {
                            this.E1.setTag(null);
                            arrayList5.add(ObjectAnimator.ofFloat(this.E1, (Property<qe, Float>) property3, 0.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(this.E1, (Property<qe, Float>) property, 0.0f));
                            arrayList5.add(p(0.0f));
                        } else {
                            this.E1.setAlpha(0.0f);
                            this.E1.setScaleX(0.0f);
                            this.E1.setTranslationX(0.0f);
                        }
                    }
                    this.n2.playTogether(arrayList5);
                    this.n2.setDuration(100L);
                    this.n2.addListener(new te(this, z21, 1));
                    this.n2.start();
                    H1(0);
                    if (this.U2 != null && getVisibility() == 0) {
                        this.U2.h0();
                    }
                }
                this.m2 = new AnimatorSet();
                ArrayList arrayList6 = new ArrayList();
                if (leVar.getVisibility() == 0) {
                    r14 = 0;
                    arrayList6.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property3, 0.0f));
                } else {
                    r14 = 0;
                }
                se seVar10 = this.O0;
                if (seVar10 != null && seVar10.getVisibility() == 0) {
                    se seVar11 = this.O0;
                    float[] fArr17 = new float[1];
                    fArr17[r14] = 0.1f;
                    arrayList6.add(ObjectAnimator.ofFloat(seVar11, (Property<se, Float>) property, fArr17));
                    se seVar12 = this.O0;
                    float[] fArr18 = new float[1];
                    fArr18[r14] = 0.1f;
                    arrayList6.add(ObjectAnimator.ofFloat(seVar12, (Property<se, Float>) property2, fArr18));
                    se seVar13 = this.O0;
                    float[] fArr19 = new float[1];
                    fArr19[r14] = 0.0f;
                    arrayList6.add(ObjectAnimator.ofFloat(seVar13, (Property<se, Float>) property3, fArr19));
                }
                if (mgVar.getVisibility() == 0) {
                    float[] fArr20 = new float[1];
                    fArr20[r14] = 0.1f;
                    arrayList6.add(ObjectAnimator.ofFloat(mgVar, (Property<mg, Float>) property, fArr20));
                    float[] fArr21 = new float[1];
                    fArr21[r14] = 0.1f;
                    arrayList6.add(ObjectAnimator.ofFloat(mgVar, (Property<mg, Float>) property2, fArr21));
                    float[] fArr23 = new float[1];
                    fArr23[r14] = 0.0f;
                    arrayList6.add(ObjectAnimator.ofFloat(mgVar, (Property<mg, Float>) property3, fArr23));
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
                    this.m2.setInterpolator(gr.h);
                    this.m2.addListener(new fg.j(16, this, str));
                    this.m2.start();
                }
                imageView2 = imageView;
                if (str == null) {
                }
                this.m2.playTogether(arrayList6);
                this.m2.setDuration(220L);
                this.m2.setInterpolator(gr.h);
                this.m2.addListener(new fg.j(16, this, str));
                this.m2.start();
            }
            z11 = true;
            if (this.v4) {
                return;
            } else {
                return;
            }
        }
        if (mgVar.getVisibility() != 0) {
            if (!z14) {
                mgVar.setScaleX(1.0f);
                mgVar.setScaleY(1.0f);
                mgVar.setAlpha(1.0f);
                setSlowModeButtonVisible(true);
                meVar.setScaleX(0.1f);
                meVar.setScaleY(0.1f);
                meVar.setAlpha(0.0f);
                leVar2.setVisibility(8);
                getSendButtonInternal().setScaleX(0.1f);
                getSendButtonInternal().setScaleY(0.1f);
                getSendButtonInternal().setAlpha(0.0f);
                getSendButtonInternal().setVisibility(8);
                imageView4.setScaleX(0.1f);
                imageView4.setScaleY(0.1f);
                imageView4.setAlpha(0.0f);
                imageView4.setVisibility(8);
                se seVar14 = this.O0;
                if (seVar14 == null || seVar14.getVisibility() != 0) {
                    i11 = 8;
                } else {
                    this.O0.setScaleX(0.1f);
                    this.O0.setScaleY(0.1f);
                    this.O0.setAlpha(0.0f);
                    i11 = 8;
                    this.O0.setVisibility(8);
                }
                if (mVar != null) {
                    mVar.setVisibility(i11);
                    if (this.U2 != null && getVisibility() == 0) {
                        this.U2.h0();
                    }
                    z12 = false;
                    H1(0);
                    rg.g gVar6 = this.Z4;
                    if (gVar6 != null) {
                        gVar6.e(0, false, false);
                    }
                    if (geVar != null) {
                        this.q1 = 0.0f;
                        geVar.setAlpha(0.0f);
                        geVar.setScaleX(0.5f);
                        geVar.setScaleY(0.5f);
                    }
                } else {
                    z12 = false;
                }
                this.G1 = z12;
                eg egVar8 = this.U2;
                boolean z22 = egVar8 != null && egVar8.n0();
                if (z22) {
                    Z();
                }
                qe qeVar5 = this.E1;
                if (qeVar5 != null) {
                    if (z22) {
                        qeVar5.setVisibility(0);
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
                if (mVar != null) {
                    this.n2 = new AnimatorSet();
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(ObjectAnimator.ofFloat(mVar, zdVar, 0.0f));
                    arrayList7.add(ObjectAnimator.ofFloat(mVar, (Property<gh.m, Float>) property, 0.5f));
                    this.G1 = false;
                    eg egVar9 = this.U2;
                    boolean z23 = egVar9 != null && egVar9.n0();
                    if (z23) {
                        Z();
                    }
                    rg.g gVar7 = this.Z4;
                    if (gVar7 != null) {
                        gVar7.e(0, false, true);
                    }
                    if (geVar != null) {
                        this.q1 = 0.0f;
                        arrayList7.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property3, 0.0f));
                        arrayList7.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property, 0.5f));
                        arrayList7.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property2, 0.5f));
                    }
                    qe qeVar6 = this.E1;
                    if (qeVar6 != null) {
                        qeVar6.setScaleY(1.0f);
                        if (z23) {
                            this.E1.setVisibility(0);
                            this.E1.setTag(1);
                            this.E1.setPivotX(AndroidUtilities.dp(44.0f));
                            arrayList7.add(p(0.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.E1, (Property<qe, Float>) property3, 1.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.E1, (Property<qe, Float>) property, 1.0f));
                        } else {
                            this.E1.setTranslationX(0.0f);
                            this.E1.setAlpha(1.0f);
                            this.E1.setScaleX(1.0f);
                        }
                    }
                    this.n2.playTogether(arrayList7);
                    this.n2.setDuration(100L);
                    this.n2.addListener(new pe(this, 2));
                    this.n2.start();
                    H1(0);
                    if (this.U2 != null && getVisibility() == 0) {
                        this.U2.h0();
                    }
                }
                this.q2 = 5;
                this.m2 = new AnimatorSet();
                ArrayList arrayList8 = new ArrayList();
                if (leVar2.getVisibility() == 0) {
                    r142 = 0;
                    arrayList8.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property2, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property3, 0.0f));
                } else {
                    r142 = 0;
                }
                se seVar15 = this.O0;
                if (seVar15 != null && seVar15.getVisibility() == 0) {
                    se seVar16 = this.O0;
                    float[] fArr30 = new float[1];
                    fArr30[r142] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(seVar16, (Property<se, Float>) property, fArr30));
                    se seVar17 = this.O0;
                    float[] fArr31 = new float[1];
                    fArr31[r142] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(seVar17, (Property<se, Float>) property2, fArr31));
                    se seVar18 = this.O0;
                    float[] fArr33 = new float[1];
                    fArr33[r142] = 0.0f;
                    arrayList8.add(ObjectAnimator.ofFloat(seVar18, (Property<se, Float>) property3, fArr33));
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
                arrayList8.add(ObjectAnimator.ofFloat(mgVar, (Property<mg, Float>) property, fArr37));
                float[] fArr38 = new float[1];
                fArr38[r142] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(mgVar, (Property<mg, Float>) property2, fArr38));
                float[] fArr39 = new float[1];
                fArr39[r142] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(mgVar, (Property<mg, Float>) property3, fArr39));
                setSlowModeButtonVisible(true);
                this.m2.playTogether(arrayList8);
                this.m2.setDuration(220L);
                this.m2.setInterpolator(gr.h);
                this.m2.addListener(new pe(this, 3));
                this.m2.start();
            }
        }
        oeVar = oeVar2;
        z11 = false;
        if (this.v4) {
        }
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 0) {
            L();
            M();
        } else if (i9 == 1) {
            L();
            M();
        } else {
            if (i9 == 2) {
                gh.j5 j5Var = this.E0;
                j5Var.setAlpha(f10);
                j5Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, f10));
                j5Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, f10));
                j5Var.setVisibility(f10 <= 0.0f ? 4 : 0);
            } else if (i9 == 3) {
                float lerp = AndroidUtilities.lerp(1.0f, 0.79f, f10);
                ae aeVar = this.v1;
                aeVar.setScaleX(lerp);
                aeVar.setScaleY(AndroidUtilities.lerp(1.0f, 0.79f, f10));
                float lerp2 = AndroidUtilities.lerp(0.79f, 1.0f, f10);
                ImageView imageView = this.w1;
                imageView.setScaleX(lerp2);
                imageView.setScaleY(AndroidUtilities.lerp(0.79f, 1.0f, f10));
                imageView.setVisibility(f10 <= 0.0f ? 8 : 0);
                imageView.setAlpha(f10);
                oe oeVar = this.F0;
                if (oeVar != null) {
                    oeVar.setSameWidthFactor(f10);
                }
            }
        }
        invalidate();
    }

    public final void J1() {
        ff ffVar = this.A0;
        if (ffVar != null) {
            ffVar.setTranslationX(this.D + this.C);
        }
    }

    public final void K() {
        if (this.Q0 == null) {
            return;
        }
        Point point = AndroidUtilities.displaySize;
        int i9 = point.x > point.y ? this.t2 : this.s2;
        int dp = ((((this.j1 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
        int i10 = 2;
        if (this.M1 == 2) {
            dp = Math.min(dp, AndroidUtilities.dp(175.0f) + i9);
        }
        int i11 = this.Q0.getLayoutParams().height;
        if (i11 == dp) {
            return;
        }
        AnimatorSet animatorSet = this.w3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.w3 = null;
        }
        this.y3 = dp;
        org.telegram.ui.Cells.c1 c1Var = this.o3;
        if (i11 > dp) {
            hd hdVar = new hd(this, 6);
            this.Q0.setLayerType(2, null);
            if (this.v) {
                this.w = hdVar;
            } else {
                AnimatorSet animatorSet2 = new AnimatorSet();
                if (this.Y4 != null) {
                    animatorSet2.playTogether(ValueAnimator.ofInt(-(this.y3 - i9)), ValueAnimator.ofInt(-(this.y3 - i9)));
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofInt(this, c1Var, -(this.y3 - i9)), ObjectAnimator.ofInt(this.Q0, c1Var, -(this.y3 - i9)));
                    ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new fd(this, i10));
                }
                animatorSet2.setDuration(300L);
                animatorSet2.setInterpolator(gr.f);
                animatorSet2.addListener(new fg.j(19, this, hdVar));
                this.w3 = animatorSet2;
                animatorSet2.start();
            }
        } else {
            if (this.Y4 == null) {
                this.Q0.getLayoutParams().height = this.y3;
            }
            this.h1.requestLayout();
            ff ffVar = this.A0;
            if (ffVar != null) {
                int selectionStart = ffVar.getSelectionStart();
                int selectionEnd = this.A0.getSelectionEnd();
                ff ffVar2 = this.A0;
                ffVar2.setText(ffVar2.getText());
                this.A0.setSelection(selectionStart, selectionEnd);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            if (this.Y4 != null) {
                animatorSet3.playTogether(ValueAnimator.ofInt(-(this.y3 - i9)), ValueAnimator.ofInt(-(this.y3 - i9)));
            } else {
                animatorSet3.playTogether(ObjectAnimator.ofInt(this, c1Var, -(this.y3 - i9)), ObjectAnimator.ofInt(this.Q0, c1Var, -(this.y3 - i9)));
                ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new fd(this, 3));
            }
            animatorSet3.setDuration(300L);
            animatorSet3.setInterpolator(gr.f);
            animatorSet3.addListener(new pe(this, 11));
            this.w3 = animatorSet3;
            this.Q0.setLayerType(2, null);
            animatorSet3.start();
        }
        xg.f fVar = this.Y4;
        if (fVar != null) {
            ((xg.i) fVar).g(dp);
        }
    }

    public final void K0(CharSequence charSequence, String str, CharSequence charSequence2) {
        org.telegram.ui.qn qnVar;
        if (this.A0 == null || (qnVar = this.K2) == null || !MessagesController.getInstance(this.M).richEditorAvailable()) {
            return;
        }
        qh.x1 x1Var = new qh.x1(str);
        x1Var.h = charSequence;
        x1Var.n = charSequence2;
        x1Var.setResourceProvider(this.R3);
        x1Var.F = qnVar;
        x1Var.s = qnVar.O;
        x1Var.v = qnVar.U;
        x1Var.H = new yd(this, 1);
        x1Var.G = new yd(this, 2);
        qnVar.presentFragment(x1Var);
    }

    public final void K1(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        uf ufVar;
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
            if (!this.w0 && (ufVar = this.Q0) != null) {
                ufVar.L(-this.L2, !this.v0, !this.b);
            }
            this.t0 = ChatObject.canSendRoundVideo(chat);
            this.u0 = ChatObject.canSendVoice(chat);
        } else if (userFull != null) {
            this.W0 = userFull.voice_messages_forbidden;
            this.G = userFull;
        }
        float f10 = this.W0 ? 0.5f : 1.0f;
        le leVar = this.V0;
        leVar.setAlpha(f10);
        leVar.invalidate();
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.W0 ? h0(org.telegram.ui.ActionBar.f6.Wk) : -1, PorterDuff.Mode.SRC_IN);
        me meVar = this.X0;
        meVar.setColorFilter(porterDuffColorFilter);
        meVar.invalidate();
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
        float y10 = y(false);
        if (this.e5 != y10) {
            this.e5 = y10;
            z0(y10);
        }
    }

    public final void L0() {
        hd hdVar = new hd(this, 28);
        if (SharedPrefsHelper.isWebViewConfirmShown(this.M, this.L2) || MessagesController.getInstance(this.M).whitelistedBots.contains(Long.valueOf(this.L2))) {
            hdVar.run();
            return;
        }
        y4.o(this.K2, MessagesController.getInstance(this.M).getUser(Long.valueOf(this.L2)), new org.telegram.ui.wq(10, this, hdVar), new hd(this, 29));
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
    public void L1(int i9, boolean z10) {
        boolean z11;
        int i10;
        char c10;
        float f10;
        int i11;
        ?? r10;
        boolean z12;
        int i12;
        long j10;
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
        og ogVar = og.a;
        og ogVar2 = og.b;
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
                this.L4 = i9;
                return;
            }
            boolean z15 = this.L4 == 3;
            if (z15) {
                property = property3;
            } else {
                this.K = false;
                ig igVar = this.J1;
                if (igVar != null) {
                    igVar.y.d(1, false, false);
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.M);
                long j11 = this.L2;
                org.telegram.ui.qn qnVar = this.K2;
                property = property3;
                mediaDataController.toggleDraftVoiceOnce(j11, (qnVar == null || !qnVar.d4) ? 0L : qnVar.b(), this.K);
                this.e1 = 0L;
            }
            W();
            this.r2 = 1;
            uf ufVar = this.Q0;
            if (ufVar != null) {
                ufVar.setEnabled(false);
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
            eg egVar = this.U2;
            if (egVar != null) {
                egVar.L0(0);
            }
            AnimatorSet animatorSet = this.o2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.p2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            Y();
            dh.g gVar = this.Z0;
            if (gVar != null) {
                gVar.setVisibility(0);
            }
            X();
            RecordCircle recordCircle2 = this.I1;
            if (recordCircle2 != null) {
                recordCircle2.I = false;
                recordCircle2.setVisibility(0);
                this.I1.setAmplitude(0.0d);
            }
            ig igVar2 = this.J1;
            if (igVar2 != null) {
                igVar2.setVisibility(0);
            }
            kg kgVar = this.g1;
            if (kgVar != null) {
                kgVar.a = 1.0f;
                kgVar.b = System.currentTimeMillis();
                kgVar.c = false;
                kgVar.e = false;
                kgVar.f.stop();
                kgVar.invalidate();
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
            w0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            Property property6 = property;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.M0, this.U3, 0.0f), ObjectAnimator.ofFloat(this.M0, this.W3, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<kg, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.g1, (Property<kg, Float>) property6, 1.0f), ObjectAnimator.ofFloat(this.U0, (Property<ng, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.U0, (Property<ng, Float>) property5, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f1, (Property<SlideTextView, Float>) property2, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f1, (Property<SlideTextView, Float>) property5, 1.0f));
            ig igVar3 = this.J1;
            if (igVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(igVar3, (Property<ig, Float>) property5, 1.0f));
            }
            if (this.X0 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.V0, (Property<le, Float>) property5, 0.0f));
            }
            mh.c0 c0Var = this.h0;
            if (c0Var != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(c0Var, (Property<mh.c0, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.h0, (Property<mh.c0, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.h0, (Property<mh.c0, Float>) property5, 0.0f));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.A0, this.Y3, AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.A0, (Property<ff, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.a1, (Property<ae, Float>) property5, 1.0f));
            if (z15) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.d1, (Property<vj0, Float>) property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.c1, (Property<pi0, Float>) property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.c1, (Property<pi0, Float>) property6, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.c1, (Property<pi0, Float>) property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.b1, (Property<z61, Float>) property5, 0.0f));
            }
            if (this.E1 != null) {
                animatorSet4.playTogether(p(AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.E1, (Property<qe, Float>) property5, 0.0f));
            }
            gh.m mVar = this.k1;
            if (mVar != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(mVar, this.X3, AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.k1, this.V3, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.l1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.l1 = null;
                }
                ge geVar = this.m1;
                this.q1 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.m1, (Property<ge, Float>) property6, 0.5f), ObjectAnimator.ofFloat(this.m1, (Property<ge, Float>) property4, 0.5f));
            }
            rg.g gVar2 = this.Z4;
            if (gVar2 != null) {
                gVar2.e(0, false, true);
            }
            this.o2.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.I1, this.p3, 1.0f).setDuration(300L));
            if (!z15) {
                this.o2.playTogether(ObjectAnimator.ofFloat(this.I1, this.q3, 1.0f).setDuration(300L));
            }
            this.o2.addListener(new lf(this, z15));
            this.o2.setInterpolator(new DecelerateInterpolator());
            this.o2.start();
            this.U0.a(this.e1);
        } else {
            if (this.f2 && i9 == 3) {
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
                this.L4 = i9;
                return;
            }
            this.N.getMessagesController().sendTyping(this.L2, getThreadMessageId(), 2, 0);
            this.r2 = 0;
            uf ufVar2 = this.Q0;
            if (ufVar2 != null) {
                ufVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.o2;
            if (animatorSet5 != null) {
                z11 = animatorSet5.isRunning();
                me meVar = this.X0;
                if (meVar != null) {
                    meVar.setScaleX(1.0f);
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
            ff ffVar = this.A0;
            if (ffVar != null) {
                ffVar.setVisibility(0);
            }
            this.o2 = new AnimatorSet();
            if (z11 || i9 == 4) {
                me meVar2 = this.X0;
                if (meVar2 != null) {
                    meVar2.setVisibility(0);
                }
                this.o2.playTogether(ObjectAnimator.ofFloat(this.M0, this.U3, 1.0f), ObjectAnimator.ofFloat(this.M0, this.W3, this.w0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.g1, (Property<kg, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<kg, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.I1, this.p3, 0.0f), ObjectAnimator.ofFloat(this.I1, this.q3, 0.0f), ObjectAnimator.ofFloat(this.V0, (Property<le, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.U0, (Property<ng, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.V0, (Property<le, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.A0, (Property<ff, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.A0, this.Y3, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                ig igVar4 = this.J1;
                if (igVar4 != null) {
                    i10 = 1;
                    c10 = 0;
                    this.o2.playTogether(ObjectAnimator.ofFloat(igVar4, (Property<ig, Float>) property5, 0.0f));
                    this.J1.a();
                } else {
                    i10 = 1;
                    c10 = 0;
                }
                mh.c0 c0Var2 = this.h0;
                if (c0Var2 != null) {
                    AnimatorSet animatorSet7 = this.o2;
                    float[] fArr = new float[i10];
                    f10 = 1.0f;
                    fArr[c10] = 1.0f;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0Var2, (Property<mh.c0, Float>) property4, fArr);
                    mh.c0 c0Var3 = this.h0;
                    float[] fArr2 = new float[i10];
                    fArr2[c10] = 1.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0Var3, (Property<mh.c0, Float>) property3, fArr2);
                    mh.c0 c0Var4 = this.h0;
                    float[] fArr3 = new float[i10];
                    fArr3[c10] = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c0Var4, (Property<mh.c0, Float>) property5, fArr3);
                    Animator[] animatorArr = new Animator[3];
                    animatorArr[c10] = ofFloat;
                    animatorArr[i10] = ofFloat2;
                    animatorArr[2] = ofFloat3;
                    animatorSet7.playTogether(animatorArr);
                } else {
                    f10 = 1.0f;
                }
                me meVar3 = this.X0;
                if (meVar3 != null) {
                    meVar3.setScaleX(f10);
                    this.X0.setScaleY(f10);
                    i11 = 1;
                    this.o2.playTogether(ObjectAnimator.ofFloat(this.V0, (Property<le, Float>) property5, f10));
                    this.X0.j(r0() ? ogVar2 : ogVar, true);
                } else {
                    i11 = 1;
                }
                if (this.E1 != null) {
                    AnimatorSet animatorSet8 = this.o2;
                    ValueAnimator p6 = p(0.0f);
                    qe qeVar = this.E1;
                    float[] fArr4 = new float[i11];
                    fArr4[0] = 1.0f;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(qeVar, (Property<qe, Float>) property5, fArr4);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = p6;
                    animatorArr2[i11] = ofFloat4;
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
                    ge geVar2 = this.m1;
                    this.q1 = 1.0f;
                    animatorSet9.playTogether(ObjectAnimator.ofFloat(geVar2, (Property<ge, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.m1, (Property<ge, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m1, (Property<ge, Float>) property4, 1.0f));
                } else {
                    r10 = 0;
                    z12 = true;
                }
                rg.g gVar3 = this.Z4;
                if (gVar3 != 0) {
                    gVar3.e(r10, r10, z12);
                }
                this.f2 = z12;
                w0();
                this.o2.setDuration(150L);
            } else if (i9 == 3) {
                W();
                X();
                SlideTextView slideTextView2 = this.f1;
                if (slideTextView2 != null) {
                    slideTextView2.setEnabled(false);
                }
                if (this.Y0) {
                    vj0 vj0Var = this.d1;
                    if (vj0Var != null) {
                        vj0Var.setVisibility(8);
                    }
                    ae aeVar = this.a1;
                    if (aeVar != null) {
                        aeVar.setAlpha(1.0f);
                        this.a1.setVisibility(0);
                    }
                    pi0 pi0Var = this.c1;
                    if (pi0Var != null) {
                        pi0Var.setProgress(0.0f);
                        this.c1.i();
                    }
                    z13 = true;
                    f12 = 1.0f;
                } else {
                    z61 z61Var = this.b1;
                    if (z61Var != null) {
                        z61Var.setVisibility(8);
                        w0();
                    }
                    ae aeVar2 = this.a1;
                    if (aeVar2 != null) {
                        aeVar2.setVisibility(0);
                        f12 = 1.0f;
                        this.a1.setAlpha(1.0f);
                    } else {
                        f12 = 1.0f;
                    }
                    vj0 vj0Var2 = this.d1;
                    if (vj0Var2 != null) {
                        vj0Var2.setVisibility(0);
                        this.d1.setAlpha(0.0f);
                    }
                    z13 = true;
                }
                this.n4 = z13;
                this.i4 = f12;
                this.g4 = this.f4;
                this.e4 = f12;
                SlideTextView slideTextView3 = this.f1;
                if (slideTextView3 != null) {
                    slideTextView3.setCancelToProgress(f12);
                }
                ig igVar5 = this.J1;
                if (igVar5 != null) {
                    igVar5.invalidate();
                }
                pi0 pi0Var2 = this.c1;
                if (pi0Var2 != null) {
                    pi0Var2.setAlpha(0.0f);
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
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.U1 == null ? org.telegram.messenger.l0.b(44.0f, this.F0.l(), 0) : 0), AndroidUtilities.dp(44.0f));
                    layoutParams2.gravity = 80;
                    layoutParams2.leftMargin = AndroidUtilities.dp(7.0f);
                    layoutParams2.rightMargin = AndroidUtilities.dp(7.0f);
                    this.h1.addView(this.a1, layoutParams2);
                    this.b1.setVisibility(8);
                }
                w0();
                AnimatorSet animatorSet10 = new AnimatorSet();
                if (z10) {
                    this.d1.setAllowDraw(false);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat5.addUpdateListener(new fd(this, 6));
                    ofFloat5.addListener(new mf(this));
                    ofFloat5.setDuration(r0() ? 490L : 580L);
                    AnimatorSet animatorSet11 = new AnimatorSet();
                    animatorSet11.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<kg, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<kg, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.U0, (Property<ng, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.U0, (Property<ng, Float>) property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f1, (Property<SlideTextView, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.c1, (Property<pi0, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.c1, (Property<pi0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.c1, (Property<pi0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.M0, this.U3, 0.0f), ObjectAnimator.ofFloat(this.M0, this.W3, 0.0f), ObjectAnimator.ofFloat(this.A0, (Property<ff, Float>) property5, 0.0f));
                    pi0 pi0Var3 = this.c1;
                    if (pi0Var3 != null) {
                        pi0Var3.setAlpha(0.0f);
                        this.c1.setScaleX(0.0f);
                        this.c1.setScaleY(0.0f);
                    }
                    if (this.X0 != null) {
                        i15 = 1;
                        animatorSet11.playTogether(ObjectAnimator.ofFloat(this.V0, (Property<le, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.V0, (Property<le, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.V0, (Property<le, Float>) property4, 1.0f));
                        this.X0.j(r0() ? ogVar2 : ogVar, true);
                    } else {
                        i15 = 1;
                    }
                    mh.c0 c0Var5 = this.h0;
                    if (c0Var5 != null) {
                        float[] fArr5 = new float[i15];
                        fArr5[0] = 0.0f;
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(c0Var5, (Property<mh.c0, Float>) property5, fArr5);
                        mh.c0 c0Var6 = this.h0;
                        float[] fArr6 = new float[i15];
                        fArr6[0] = 0.0f;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(c0Var6, (Property<mh.c0, Float>) property3, fArr6);
                        mh.c0 c0Var7 = this.h0;
                        float[] fArr7 = new float[i15];
                        fArr7[0] = 0.0f;
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(c0Var7, (Property<mh.c0, Float>) property4, fArr7);
                        Animator[] animatorArr3 = new Animator[3];
                        animatorArr3[0] = ofFloat6;
                        animatorArr3[i15] = ofFloat7;
                        animatorArr3[2] = ofFloat8;
                        animatorSet11.playTogether(animatorArr3);
                    }
                    animatorSet11.addListener(new pe(this, 8));
                    animatorSet11.setDuration(150L);
                    animatorSet11.setStartDelay(150L);
                    if (r0()) {
                        this.b1.setAlpha(0.0f);
                        c11 = 1;
                        c12 = 0;
                        animatorSet10.playTogether(ObjectAnimator.ofFloat(this.b1, (Property<z61, Float>) property5, 1.0f));
                        animatorSet10.setDuration(150L);
                        animatorSet10.setStartDelay(430L);
                    } else {
                        c11 = 1;
                        c12 = 0;
                    }
                    AnimatorSet animatorSet12 = this.o2;
                    Animator[] animatorArr4 = new Animator[3];
                    animatorArr4[c12] = animatorSet11;
                    animatorArr4[c11] = ofFloat5;
                    animatorArr4[2] = animatorSet10;
                    animatorSet12.playTogether(animatorArr4);
                    this.o2.addListener(new ih.j3(this, viewGroup, layoutParams, 2));
                } else {
                    Y();
                    this.p3.set(this.I1, Float.valueOf(1.0f));
                    this.I1.setTransformToSeekbar(1.0f);
                    if (!this.Y0) {
                        float f13 = this.k4;
                        if (f13 != 0.0f && this.d1 != null) {
                            this.d1.setAlpha(gr.j.getInterpolation(Math.max(0.0f, ((f13 - 0.38f) - 0.25f) / 0.37f)));
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
                    me meVar4 = this.X0;
                    if (meVar4 != null) {
                        if (r0()) {
                            ogVar = ogVar2;
                        }
                        meVar4.j(ogVar, z10);
                        this.V0.setAlpha(1.0f);
                        this.V0.setScaleX(1.0f);
                        this.V0.setScaleY(1.0f);
                    }
                    mh.c0 c0Var8 = this.h0;
                    if (c0Var8 != null) {
                        c0Var8.setAlpha(0.0f);
                        this.h0.setScaleX(0.0f);
                        this.h0.setScaleY(0.0f);
                    }
                    if (r0()) {
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
                    w0();
                }
            } else if (i9 == 2 || i9 == 5) {
                me meVar5 = this.X0;
                if (meVar5 != null) {
                    meVar5.setVisibility(0);
                }
                this.f2 = true;
                w0();
                AnimatorSet animatorSet13 = new AnimatorSet();
                animatorSet13.playTogether(ObjectAnimator.ofFloat(this.M0, this.U3, 1.0f), ObjectAnimator.ofFloat(this.M0, this.W3, this.w0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.g1, (Property<kg, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<kg, Float>) property3, 0.0f));
                ig igVar6 = this.J1;
                if (igVar6 != null) {
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(igVar6, (Property<ig, Float>) property5, 0.0f));
                    this.J1.a();
                }
                mh.c0 c0Var9 = this.h0;
                if (c0Var9 != null) {
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(c0Var9, (Property<mh.c0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.h0, (Property<mh.c0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.h0, (Property<mh.c0, Float>) property5, 1.0f));
                }
                AnimatorSet animatorSet14 = new AnimatorSet();
                animatorSet14.playTogether(ObjectAnimator.ofFloat(this.U0, (Property<ng, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.U0, (Property<ng, Float>) property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f1, (Property<SlideTextView, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.f1, (Property<SlideTextView, Float>) property2, -AndroidUtilities.dp(20.0f)));
                if (i9 != 5) {
                    this.V0.setScaleX(0.0f);
                    this.V0.setScaleY(0.0f);
                    ge geVar3 = this.m1;
                    if (geVar3 != null && geVar3.getVisibility() == 0) {
                        this.m1.setScaleX(0.5f);
                        this.m1.setScaleY(0.5f);
                    }
                    se seVar = this.s1;
                    if (seVar != null && seVar.getVisibility() == 0) {
                        this.s1.setScaleX(0.0f);
                        this.s1.setScaleY(0.0f);
                    }
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.V0, (Property<le, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.V0, (Property<le, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.V0, (Property<le, Float>) property5, 1.0f));
                    if (this.k1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator3 = this.l1;
                        if (viewPropertyAnimator3 != null) {
                            viewPropertyAnimator3.cancel();
                            this.l1 = null;
                        }
                        i13 = 1;
                        r102 = 0;
                        animatorSet13.playTogether(ObjectAnimator.ofFloat(this.k1, this.V3, 1.0f), ObjectAnimator.ofFloat(this.k1, this.X3, 0.0f));
                        ge geVar4 = this.m1;
                        this.q1 = 1.0f;
                        animatorSet13.playTogether(ObjectAnimator.ofFloat(geVar4, (Property<ge, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.m1, (Property<ge, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m1, (Property<ge, Float>) property4, 1.0f));
                    } else {
                        r102 = 0;
                        i13 = 1;
                    }
                    rg.g gVar4 = this.Z4;
                    if (gVar4 != 0) {
                        gVar4.e(r102, r102, i13);
                    }
                    se seVar2 = this.s1;
                    if (seVar2 != null) {
                        float[] fArr8 = new float[i13];
                        fArr8[r102] = 1.0f;
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(seVar2, (Property<se, Float>) property3, fArr8);
                        se seVar3 = this.s1;
                        float[] fArr9 = new float[i13];
                        fArr9[r102] = 1.0f;
                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(seVar3, (Property<se, Float>) property4, fArr9);
                        Animator[] animatorArr5 = new Animator[2];
                        animatorArr5[r102] = ofFloat9;
                        animatorArr5[i13] = ofFloat10;
                        animatorSet13.playTogether(animatorArr5);
                    }
                    if (this.X0 != null) {
                        le leVar = this.V0;
                        float[] fArr10 = new float[i13];
                        fArr10[r102] = 1.0f;
                        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(leVar, (Property<le, Float>) property5, fArr10);
                        Animator[] animatorArr6 = new Animator[i13];
                        animatorArr6[r102] = ofFloat11;
                        animatorSet13.playTogether(animatorArr6);
                        le leVar2 = this.V0;
                        float[] fArr11 = new float[i13];
                        fArr11[r102] = 1.0f;
                        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(leVar2, (Property<le, Float>) property3, fArr11);
                        Animator[] animatorArr7 = new Animator[i13];
                        animatorArr7[r102] = ofFloat12;
                        animatorSet13.playTogether(animatorArr7);
                        le leVar3 = this.V0;
                        float[] fArr12 = new float[i13];
                        fArr12[r102] = 1.0f;
                        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(leVar3, (Property<le, Float>) property4, fArr12);
                        Animator[] animatorArr8 = new Animator[i13];
                        animatorArr8[r102] = ofFloat13;
                        animatorSet13.playTogether(animatorArr8);
                        this.X0.j(r0() ? ogVar2 : ogVar, i13);
                    }
                    qe qeVar2 = this.E1;
                    if (qeVar2 != null) {
                        float[] fArr13 = new float[i13];
                        fArr13[0] = 1.0f;
                        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(qeVar2, (Property<qe, Float>) property5, fArr13);
                        ValueAnimator p9 = p(0.0f);
                        Animator[] animatorArr9 = new Animator[2];
                        animatorArr9[0] = ofFloat14;
                        animatorArr9[i13] = p9;
                        animatorSet13.playTogether(animatorArr9);
                    }
                    j10 = 150;
                } else {
                    AnimatorSet animatorSet15 = new AnimatorSet();
                    animatorSet15.playTogether(ObjectAnimator.ofFloat(this.V0, (Property<le, Float>) property5, 1.0f));
                    if (this.k1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.l1;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.l1 = null;
                        }
                        i12 = 1;
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(this.k1, this.X3, 0.0f), ObjectAnimator.ofFloat(this.k1, this.V3, 1.0f));
                        ge geVar5 = this.m1;
                        this.q1 = 1.0f;
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(geVar5, (Property<ge, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.m1, (Property<ge, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m1, (Property<ge, Float>) property4, 1.0f));
                    } else {
                        i12 = 1;
                    }
                    rg.g gVar5 = this.Z4;
                    if (gVar5 != null) {
                        gVar5.e(0, false, i12);
                    }
                    qe qeVar3 = this.E1;
                    if (qeVar3 != null) {
                        float[] fArr14 = new float[i12];
                        fArr14[0] = 1.0f;
                        ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(qeVar3, (Property<qe, Float>) property5, fArr14);
                        ValueAnimator p10 = p(0.0f);
                        Animator[] animatorArr10 = new Animator[2];
                        animatorArr10[0] = ofFloat15;
                        animatorArr10[i12] = p10;
                        animatorSet15.playTogether(animatorArr10);
                    }
                    j10 = 150;
                    animatorSet15.setDuration(150L);
                    animatorSet15.setStartDelay(110L);
                    animatorSet15.addListener(new pe(this, 9));
                    AnimatorSet animatorSet16 = this.o2;
                    Animator[] animatorArr11 = new Animator[i12];
                    animatorArr11[0] = animatorSet15;
                    animatorSet16.playTogether(animatorArr11);
                }
                animatorSet13.setDuration(j10);
                animatorSet13.setStartDelay(700L);
                animatorSet14.setDuration(200L);
                animatorSet14.setStartDelay(200L);
                this.C = 0.0f;
                J1();
                ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(this.A0, (Property<ff, Float>) property5, 1.0f);
                ofFloat16.setStartDelay(this.s == 1.0f ? 300L : 700L);
                ofFloat16.setDuration(200L);
                this.o2.playTogether(animatorSet13, animatorSet14, ofFloat16, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.f4).setDuration(200L));
                if (i9 == 5) {
                    ChatActivityEnterView.this.m4 = true;
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                    duration.setInterpolator(gr.j);
                    this.o2.playTogether(duration);
                } else {
                    ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                    ofFloat17.setDuration(360L);
                    ofFloat17.setStartDelay(490L);
                    this.o2.playTogether(ofFloat17);
                }
                kg kgVar2 = this.g1;
                if (kgVar2 != null) {
                    kgVar2.e = true;
                    mi0 mi0Var = kgVar2.f;
                    mi0Var.Q(0.0f, true);
                    if (kgVar2.d) {
                        mi0Var.start();
                    }
                }
            } else {
                me meVar6 = this.X0;
                if (meVar6 != null) {
                    meVar6.setVisibility(0);
                }
                AnimatorSet animatorSet17 = new AnimatorSet();
                animatorSet17.playTogether(ObjectAnimator.ofFloat(this.M0, this.U3, 1.0f), ObjectAnimator.ofFloat(this.M0, this.W3, this.w0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.g1, (Property<kg, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<kg, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.V0, (Property<le, Float>) property5, 1.0f));
                ig igVar7 = this.J1;
                if (igVar7 != null) {
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(igVar7, (Property<ig, Float>) property5, 0.0f));
                    this.J1.a();
                }
                mh.c0 c0Var10 = this.h0;
                if (c0Var10 != null) {
                    f11 = 1.0f;
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(c0Var10, (Property<mh.c0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.h0, (Property<mh.c0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.h0, (Property<mh.c0, Float>) property5, 1.0f));
                } else {
                    f11 = 1.0f;
                }
                me meVar7 = this.X0;
                if (meVar7 != null) {
                    meVar7.setScaleX(f11);
                    this.X0.setScaleY(f11);
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(this.V0, (Property<le, Float>) property5, f11));
                    this.X0.j(r0() ? ogVar2 : ogVar, true);
                }
                if (this.k1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator5 = this.l1;
                    if (viewPropertyAnimator5 != null) {
                        viewPropertyAnimator5.cancel();
                        this.l1 = null;
                    }
                    this.x = 0.0f;
                    A1();
                    i14 = 1;
                    r103 = 0;
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(this.k1, this.V3, 1.0f));
                    ge geVar6 = this.m1;
                    this.q1 = 1.0f;
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(geVar6, (Property<ge, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.m1, (Property<ge, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m1, (Property<ge, Float>) property4, 1.0f));
                } else {
                    r103 = 0;
                    i14 = 1;
                }
                rg.g gVar6 = this.Z4;
                if (gVar6 != 0) {
                    gVar6.e(r103, r103, i14);
                }
                qe qeVar4 = this.E1;
                if (qeVar4 != null) {
                    float[] fArr15 = new float[i14];
                    fArr15[r103] = 1.0f;
                    ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(qeVar4, (Property<qe, Float>) property5, fArr15);
                    ValueAnimator p11 = p(0.0f);
                    Animator[] animatorArr12 = new Animator[2];
                    animatorArr12[r103] = ofFloat18;
                    animatorArr12[i14] = p11;
                    animatorSet17.playTogether(animatorArr12);
                }
                animatorSet17.setDuration(150L);
                animatorSet17.setStartDelay(200L);
                AnimatorSet animatorSet18 = new AnimatorSet();
                ng ngVar = this.U0;
                float[] fArr16 = new float[i14];
                fArr16[r103] = 0.0f;
                ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(ngVar, (Property<ng, Float>) property5, fArr16);
                ng ngVar2 = this.U0;
                float[] fArr17 = new float[i14];
                fArr17[r103] = AndroidUtilities.dp(40.0f);
                ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(ngVar2, (Property<ng, Float>) property2, fArr17);
                SlideTextView slideTextView4 = this.f1;
                float[] fArr18 = new float[i14];
                fArr18[r103] = 0.0f;
                ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(slideTextView4, (Property<SlideTextView, Float>) property5, fArr18);
                SlideTextView slideTextView5 = this.f1;
                float[] fArr19 = new float[i14];
                fArr19[r103] = AndroidUtilities.dp(40.0f);
                ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(slideTextView5, (Property<SlideTextView, Float>) property2, fArr19);
                Animator[] animatorArr13 = new Animator[4];
                animatorArr13[r103] = ofFloat19;
                animatorArr13[i14] = ofFloat20;
                animatorArr13[2] = ofFloat21;
                animatorArr13[3] = ofFloat22;
                animatorSet18.playTogether(animatorArr13);
                animatorSet18.setDuration(150L);
                float[] fArr20 = new float[i14];
                fArr20[r103] = 1.0f;
                ObjectAnimator ofFloat23 = ObjectAnimator.ofFloat(this, "exitTransition", fArr20);
                ofFloat23.setDuration(this.c0 ? 220L : 360L);
                this.C = 0.0f;
                J1();
                ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(this.A0, (Property<ff, Float>) property5, 1.0f);
                ofFloat24.setStartDelay(this.s == 1.0f ? 150L : 450L);
                ofFloat24.setDuration(200L);
                this.o2.playTogether(animatorSet17, animatorSet18, ofFloat24, ofFloat23);
            }
            this.o2.addListener(new of(this, i9));
            this.o2.start();
            ng ngVar3 = this.U0;
            if (ngVar3 != null) {
                ngVar3.b();
            }
        }
        this.U2.c();
        P1(true);
        this.L4 = i9;
    }

    public final void M() {
        float f10 = this.b5.e;
        if (this.B1 != null) {
            float measuredHeight = getMeasuredHeight() - this.a5.e;
            this.B1.setTranslationY(measuredHeight - (r4.getMeasuredHeight() * f10));
            this.B1.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        boolean z10 = f10 > 0.0f;
        if (this.H4 == z10) {
            return;
        }
        ae aeVar = this.u1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aeVar.getLayoutParams();
        int i9 = z10 ? this.B1.getLayoutParams().height : 0;
        layoutParams.topMargin = i9;
        layoutParams.topMargin = AndroidUtilities.dp(9.0f) + i9;
        aeVar.setLayoutParams(layoutParams);
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
        int h02 = h0(org.telegram.ui.ActionBar.f6.jf);
        int h03 = h0(org.telegram.ui.ActionBar.f6.Sd);
        int h04 = h0(org.telegram.ui.ActionBar.f6.df);
        pi0 pi0Var = this.c1;
        if (pi0Var != null) {
            pi0Var.h(h02, "Cup Red");
            this.c1.h(h02, "Box Red");
            this.c1.h(h04, "Cup Grey");
            this.c1.h(h04, "Box Grey");
            this.c1.h(h03, "Line 1");
            this.c1.h(h03, "Line 2");
            this.c1.h(h03, "Line 3");
        }
    }

    public final void N() {
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar != null) {
            MediaDataController.getInstance(this.M).saveDraft(qnVar.a(), qnVar.B7(qnVar.j5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
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
        oe oeVar = this.F0;
        ImageView imageView = this.N0;
        de deVar = this.M0;
        if (z11) {
            previewView.setResourcesProvider(this.R3);
            this.x1.set(this.z1);
            this.x1.setVisibility(0);
            ff ffVar = this.A0;
            if (ffVar != null) {
                ffVar.setVisibility(8);
            }
            deVar.setVisibility(8);
            imageView.setVisibility(0);
            oeVar.setLocked(!UserConfig.getInstance(this.M).isPremium());
        } else {
            previewView.setVisibility(8);
            ff ffVar2 = this.A0;
            if (ffVar2 != null) {
                ffVar2.setVisibility(0);
            }
            deVar.setVisibility(0);
            imageView.setVisibility(8);
            oeVar.setLocked(false);
        }
        E1();
        if (z10 != this.y1) {
            J(true);
        }
    }

    public final void O() {
        AndroidUtilities.hideKeyboard(this.A0);
    }

    public final void O0(int i9, int i10, CharSequence charSequence, boolean z10) {
        if (this.A0 == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A0.getText());
            spannableStringBuilder.replace(i9, i10 + i9, charSequence);
            if (z10) {
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
            }
            this.A0.setText(spannableStringBuilder);
            this.A0.setSelection(i9 + charSequence.length());
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
                    this.a0 = new dr(getContext(), R.drawable.input_notify_on, org.telegram.ui.ActionBar.f6.Wk);
                }
                this.a0.a(this.b2, false);
                imageView.setImageDrawable(this.a0);
            } else {
                z11 = false;
            }
            gh.m mVar = this.k1;
            if (mVar != null) {
                H1(mVar.getVisibility() == 0 ? 1 : 0);
            }
        } else {
            z11 = false;
        }
        boolean z12 = (this.U2 == null || c() || !this.U2.n0()) ? false : true;
        boolean z13 = (!z12 || this.G1 || this.A2) ? false : true;
        if (z13) {
            Z();
        }
        qe qeVar = this.E1;
        if (qeVar != null) {
            if ((qeVar.getTag() != null && z13) || (this.E1.getTag() == null && !z13)) {
                if (imageView != null) {
                    int i9 = (z12 || !z11 || this.E1.getVisibility() == 0) ? 8 : 0;
                    if (i9 != imageView.getVisibility()) {
                        imageView.setVisibility(i9);
                        return;
                    }
                    return;
                }
                return;
            }
            this.E1.setTag(z13 ? 1 : null);
        } else if (imageView != null) {
            int i10 = (z12 || !z11) ? 8 : 0;
            if (i10 != imageView.getVisibility()) {
                imageView.setVisibility(i10);
            }
        }
        AnimatorSet animatorSet = this.H1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.H1 = null;
        }
        if (z10 && !z11) {
            qe qeVar2 = this.E1;
            if (qeVar2 != null) {
                if (z13) {
                    qeVar2.setVisibility(0);
                }
                this.E1.setPivotX(AndroidUtilities.dp(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.H1 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.E1, (Property<qe, Float>) View.ALPHA, z13 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.E1, (Property<qe, Float>) View.SCALE_X, z13 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.E1, (Property<qe, Float>) View.SCALE_Y, z13 ? 1.0f : 0.1f));
                this.H1.setDuration(180L);
                this.H1.addListener(new te(this, z13, 2));
                this.H1.start();
                return;
            }
            return;
        }
        qe qeVar3 = this.E1;
        if (qeVar3 == null) {
            if (imageView != null) {
                imageView.setVisibility(z11 ? 0 : 8);
                return;
            }
            return;
        }
        qeVar3.setVisibility(z13 ? 0 : 8);
        this.E1.setAlpha(z13 ? 1.0f : 0.0f);
        this.E1.setScaleX(z13 ? 1.0f : 0.1f);
        this.E1.setScaleY(z13 ? 1.0f : 0.1f);
        if (imageView != null) {
            imageView.setVisibility((!z11 || this.E1.getVisibility() == 0) ? 8 : 0);
        }
        this.E1.setTranslationX(0.0f);
    }

    public final void P() {
        if (this.s1 != null) {
            return;
        }
        se seVar = new se(this, getContext(), 1);
        this.s1 = seVar;
        bl0 bl0Var = new bl0(getContext());
        this.P1 = bl0Var;
        seVar.setImageDrawable(bl0Var);
        this.P1.setColorFilter(new PorterDuffColorFilter(h0(org.telegram.ui.ActionBar.f6.Wk), PorterDuff.Mode.MULTIPLY));
        this.P1.a(R.drawable.input_bot2, false);
        this.s1.setScaleType(ImageView.ScaleType.CENTER);
        this.s1.setBackground(org.telegram.ui.ActionBar.f6.f0(h0(org.telegram.ui.ActionBar.f6.i6), 1, -1));
        this.s1.setVisibility(8);
        AndroidUtilities.updateViewVisibilityAnimated(this.s1, false, 0.1f, false);
        this.k1.addView(this.s1, 0, g7.e6.n(44, 44));
        this.s1.setOnClickListener(new jd(this, 15));
    }

    public final void P0() {
        n1(false, true, false, true);
        t1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.A2 = false;
        me meVar = this.X0;
        if (meVar != null) {
            meVar.setVisibility(0);
        }
        this.f2 = true;
        w0();
        z();
        o0();
        ig igVar = this.J1;
        if (igVar != null) {
            igVar.setVisibility(8);
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
        if (this.h0 != null) {
            return;
        }
        mh.c0 c0Var = new mh.c0(getContext());
        this.h0 = c0Var;
        c0Var.setOnClickListener(new jd(this, 7));
        this.t1.addView(this.h0, g7.e6.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
        AndroidUtilities.updateViewVisibilityAnimated(this.h0, false, 1.0f, false);
        mh.c0 c0Var2 = this.h0;
        if (!c0Var2.f) {
            c0Var2.f = true;
            c0Var2.h = 1.0f;
            c0Var2.requestLayout();
            c0Var2.invalidate();
        }
    }

    public final void Q0(TL_iv.RichMessage richMessage) {
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar != null) {
            MediaDataController.getInstance(this.M).saveDraft(qnVar.a(), qnVar.B7(qnVar.j5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void Q1(boolean z10, boolean z11) {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        float f10;
        float f11;
        fo0 fo0Var;
        fo0 fo0Var2;
        ae aeVar;
        if (this.U2 == null) {
            return;
        }
        V();
        if (this.g5) {
            peer = this.U2.k();
            chat = null;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.M).getChat(Long.valueOf(-this.L2));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.M).getChatFull(-this.L2);
            TLRPC.Peer peer2 = chatFull != null ? chatFull.default_send_as : null;
            chat = chat2;
            peer = peer2;
        }
        if (peer == null && this.U2.A() != null && !this.U2.A().peers.isEmpty()) {
            peer = this.U2.A().peers.get(0).peer;
        }
        org.telegram.ui.qn qnVar = this.K2;
        boolean z12 = (z10 || peer == null || (this.U2.A() != null && this.U2.A().peers.size() <= 1) || q0() || v0() || (((aeVar = this.a1) != null && aeVar.getVisibility() == 0) || ((!this.g5 && ((ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.canSendAsPeers(chat)) || ChatObject.isMonoForum(chat))) || (qnVar != null && qnVar.N3 == 9)))) ? false : true;
        if (z12) {
            a0();
        }
        if (peer != null) {
            if (peer.channel_id != 0) {
                TLRPC.Chat chat3 = MessagesController.getInstance(this.M).getChat(Long.valueOf(peer.channel_id));
                if (chat3 != null && (fo0Var2 = this.l0) != null) {
                    fo0Var2.setAvatar(chat3);
                    this.l0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, chat3.title));
                }
            } else {
                TLRPC.User user = MessagesController.getInstance(this.M).getUser(Long.valueOf(peer.user_id));
                if (user != null && (fo0Var = this.l0) != null) {
                    fo0Var.setAvatar(user);
                    this.l0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, ContactsController.formatName(user.first_name, user.last_name)));
                }
            }
        }
        fo0 fo0Var3 = this.l0;
        boolean z13 = fo0Var3 != null && fo0Var3.getVisibility() == 0;
        int dp = AndroidUtilities.dp(2.0f);
        float f12 = z12 ? 0.0f : 1.0f;
        float f13 = z12 ? 1.0f : 0.0f;
        fo0 fo0Var4 = this.l0;
        if (fo0Var4 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fo0Var4.getLayoutParams();
            f11 = z12 ? ((-this.l0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp : 0.0f;
            f10 = z12 ? 0.0f : ((-this.l0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        if (z13 == z12) {
            return;
        }
        fo0 fo0Var5 = this.l0;
        ValueAnimator valueAnimator = fo0Var5 == null ? null : (ValueAnimator) fo0Var5.getTag();
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.l0.setTag(null);
        }
        if ((this.g5 || (qnVar != null && qnVar.F8() == 0 && qnVar.K5)) && z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            fo0 fo0Var6 = this.l0;
            if (fo0Var6 != null) {
                fo0Var6.setTranslationX(f11);
            }
            this.C = f11;
            J1();
            float f14 = f10;
            float f15 = f13;
            float f16 = f11;
            duration.addUpdateListener(new m5(this, f16, f14, f12, f15, 1));
            duration.addListener(new qf(this, z12, f12, f16, f15, f14));
            duration.start();
            fo0 fo0Var7 = this.l0;
            if (fo0Var7 != null) {
                fo0Var7.setTag(duration);
                return;
            }
            return;
        }
        float f17 = f10;
        float f18 = f13;
        boolean z14 = z12;
        if (z14) {
            a0();
        }
        fo0 fo0Var8 = this.l0;
        if (fo0Var8 != null) {
            fo0Var8.setVisibility(z14 ? 0 : 8);
            this.l0.setTranslationX(f17);
        }
        float f19 = z14 ? f17 : 0.0f;
        this.M0.setTranslationX(f19);
        this.C = f19;
        J1();
        fo0 fo0Var9 = this.l0;
        if (fo0Var9 != null) {
            fo0Var9.setAlpha(f18);
            this.l0.setTag(null);
        }
    }

    public final void R() {
        if (this.U != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.U = numberTextView;
        numberTextView.setVisibility(8);
        this.U.setTextSize(15);
        this.U.setTextColor(h0(org.telegram.ui.ActionBar.f6.y6));
        this.U.setTypeface(AndroidUtilities.bold());
        this.U.setCenterAlign(true);
        addView(this.U, Math.min(2, getChildCount()), g7.e6.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public final void R0(SpannableStringBuilder spannableStringBuilder, boolean z10, int i9, int i10) {
        if (this.A0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
        t5[] t5VarArr = (t5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), t5.class);
        if (t5VarArr != null) {
            for (t5 t5Var : t5VarArr) {
                t5Var.applyFontMetrics(this.A0.getPaint().getFontMetricsInt(), k5.g());
            }
        }
        fi0.a(spannableStringBuilder2);
        N();
        setFieldText(spannableStringBuilder2);
        T0(i9, z10, i10, true, 0L);
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
            R();
            if (t()) {
                int[] iArr = MessagesController.getInstance(this.M).starsGroupcallMessageLimits;
                b10 = (iArr == null || iArr.length <= 2) ? 400 : iArr[2];
            } else {
                b10 = ih.u.b(this.M, (int) starsPrice, 1);
            }
            if (this.V != b10) {
                this.V = b10;
                if (b10 > 0) {
                    int i9 = b10 - this.W;
                    if (i9 <= (this.g5 ? 5 : 100)) {
                        if (i9 < -9999) {
                            i9 = -9999;
                        }
                        R();
                        NumberTextView numberTextView = this.U;
                        numberTextView.a(i9, numberTextView.getVisibility() == 0);
                        if (this.U.getVisibility() != 0) {
                            this.U.setVisibility(0);
                            this.U.setAlpha(0.0f);
                            this.U.setScaleX(0.5f);
                            this.U.setScaleY(0.5f);
                        }
                        this.U.animate().setListener(null).cancel();
                        this.U.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        this.U.setTextColor(h0(i9 < 0 ? org.telegram.ui.ActionBar.f6.p7 : org.telegram.ui.ActionBar.f6.y6));
                        return;
                    }
                }
                NumberTextView numberTextView2 = this.U;
                if (numberTextView2 != null) {
                    numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new pe(this, 0));
                }
            }
        }
    }

    public final void S(boolean z10) {
        if (this.A1 != null) {
            return;
        }
        oe oeVar = new oe(this, getContext(), R.drawable.input_done, this.R3, 1);
        this.A1 = oeVar;
        oeVar.setContentDescription(LocaleController.getString(R.string.EditMessage));
        if (z10) {
            g7.g6.a(this.A1);
        }
        this.u1.addView(this.A1, g7.e6.e(44, 44, 85));
    }

    public boolean S0() {
        boolean z10 = this.y1;
        org.telegram.ui.ActionBar.b6 b6Var = this.R3;
        if (z10 && !UserConfig.getInstance(this.M).isPremium()) {
            qh.x1.o0(getContext(), new hd(this, 20), new hd(this, 21), b6Var);
            return true;
        }
        if (!c()) {
            return T0(0, true, 0, true, 0L);
        }
        y4.M(this.J2, this.K2.a(), new ue(this), b6Var);
        return true;
    }

    public final void S1() {
        int i9;
        boolean isUploadingMessageIdDialog;
        int currentTime = ConnectionsManager.getInstance(this.M).getCurrentTime();
        AndroidUtilities.cancelRunOnUIThread(this.D0);
        this.D0 = null;
        TLRPC.ChatFull chatFull = this.Y1;
        if (chatFull == null || chatFull.slowmode_seconds == 0 || chatFull.slowmode_next_send_date > currentTime || !((isUploadingMessageIdDialog = SendMessagesHelper.getInstance(this.M).isUploadingMessageIdDialog(this.L2)) || SendMessagesHelper.getInstance(this.M).isSendingMessageIdDialog(this.L2))) {
            int i10 = this.C0;
            if (i10 >= 2147483646) {
                if (this.Y1 != null) {
                    this.N.getMessagesController().loadFullChat(this.Y1.id, 0, true);
                }
                i9 = 0;
            } else {
                i9 = i10 - currentTime;
            }
        } else {
            if (!ChatObject.hasAdminRights(this.N.getMessagesController().getChat(Long.valueOf(this.Y1.id))) && !ChatObject.isIgnoredChatRestrictionsForBoosters(this.Y1)) {
                i9 = this.Y1.slowmode_seconds;
                this.C0 = isUploadingMessageIdDialog ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2147483646;
            }
            i9 = 0;
        }
        if (this.C0 == 0 || i9 <= 0) {
            this.C0 = 0;
        } else {
            String formatDurationNoHours = AndroidUtilities.formatDurationNoHours(Math.max(1, i9), false);
            mg mgVar = this.B0;
            mgVar.a.l(formatDurationNoHours, false);
            mgVar.invalidate();
            eg egVar = this.U2;
            if (egVar != null) {
                egVar.k1(mgVar, mgVar.a.getText(), false);
            }
            hd hdVar = new hd(this, 9);
            this.D0 = hdVar;
            AndroidUtilities.runOnUIThread(hdVar, 100L);
        }
        if (c()) {
            return;
        }
        J(true);
    }

    public final void T() {
        uf ufVar = this.Q0;
        if (ufVar != null && ufVar.Y0 != UserConfig.selectedAccount) {
            this.i1.removeView(ufVar);
            this.Q0 = null;
        }
        if (this.Q0 != null) {
            return;
        }
        uf ufVar2 = new uf(this, this.K2, this.D2, getContext(), this.Y1, this.h1, this.t4, this.R3, this.P0, this.Y4 != null);
        this.Q0 = ufVar2;
        ufVar2.r0 = true;
        if (!this.t4) {
            ufVar2.T();
        }
        this.Q0.J(true, this.E2, this.F2, true);
        this.Q0.setVisibility(8);
        this.Q0.setShowing(false);
        if (this.Y4 != null) {
            uf ufVar3 = this.Q0;
            ufVar3.s0 = false;
            ufVar3.setShouldDrawBackground(false);
            this.Q0.R0 = true;
        }
        this.Q0.setDelegate(new xf(this));
        this.Q0.setDragListener(new m.a(this));
        uf ufVar4 = this.Q0;
        if (ufVar4 != null) {
            ufVar4.L(-this.L2, !this.v0, !this.b);
        }
        u();
        E();
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
    public boolean T0(final int i9, final boolean z10, final int i10, boolean z11, long j10) {
        ChatActivityEnterView chatActivityEnterView;
        ChatActivityEnterView chatActivityEnterView2;
        int i11;
        int i12;
        int i13;
        int i14;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i15;
        CharSequence charSequence3;
        MessageObject.SendAnimationData sendAnimationData;
        MessageObject threadMessage;
        String str;
        int i16;
        CharSequence charSequence4;
        CharSequence charSequence5;
        org.telegram.ui.qn qnVar;
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
        eg egVar;
        TLRPC.Chat chat2;
        TL_iv.RichMessage richMessage;
        ChatActivityEnterView chatActivityEnterView4;
        uf ufVar;
        boolean z14 = z11 && !this.d5.f;
        if (z14) {
            boolean b02 = y4.b0(this.M, this.L2, getMessagesCount(), new Utilities.Callback() { // from class: org.telegram.ui.Components.wd
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    int i17 = ChatActivityEnterView.i5;
                    ChatActivityEnterView chatActivityEnterView5 = ChatActivityEnterView.this;
                    chatActivityEnterView5.getClass();
                    chatActivityEnterView5.T0(i9, z10, i10, false, ((Long) obj).longValue());
                }
            }, j10);
            if (b02 && this.n4) {
                if (this.Y0) {
                    if (!this.U2.X0()) {
                        SlideTextView slideTextView = this.f1;
                        if (slideTextView != null) {
                            slideTextView.setEnabled(false);
                        }
                        this.U2.c1();
                        return b02;
                    }
                } else if (!MediaController.getInstance().isRecordingPaused()) {
                    if (this.n4) {
                        this.E3 = true;
                    }
                    MediaController.getInstance().toggleRecordingPause(this.K);
                    this.U2.L0(0);
                    SlideTextView slideTextView2 = this.f1;
                    if (slideTextView2 != null) {
                        slideTextView2.setEnabled(false);
                    }
                }
            }
            return b02;
        }
        if (this.C0 != Integer.MAX_VALUE || c()) {
            org.telegram.ui.qn qnVar2 = this.K2;
            if (qnVar2 != null) {
                TLRPC.Chat chat3 = qnVar2.e;
                if (qnVar2.i() != null || ((ChatObject.isChannel(chat3) && chat3.megagroup) || !ChatObject.isChannel(chat3))) {
                    MessagesController.getNotificationsSettings(this.M).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + this.L2, !z10).commit();
                }
            }
            if (this.u3) {
                n1(false, true, false, true);
                if (this.M1 != 0 && (ufVar = this.Q0) != null) {
                    ufVar.t(false);
                    this.Q0.A();
                }
            }
            if (z14) {
                chatActivityEnterView = this;
                if (chatActivityEnterView.r1(new org.telegram.messenger.wd(this, z10, i9, i10, j10))) {
                    chatActivityEnterView2 = chatActivityEnterView;
                }
            } else {
                chatActivityEnterView = this;
            }
            chatActivityEnterView.z4 = true;
            VideoEditedInfo videoEditedInfo = chatActivityEnterView.Z2;
            oe oeVar = chatActivityEnterView.F0;
            if (videoEditedInfo != null) {
                chatActivityEnterView.U2.U1(4, i9, chatActivityEnterView.K ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.N4, j10, z10);
                chatActivityEnterView.N4 = 0L;
                oeVar.setEffect(0L);
                chatActivityEnterView.n0(true);
                chatActivityEnterView.J(true);
                AndroidUtilities.runOnUIThread(new hd(chatActivityEnterView, 2), 100L);
                chatActivityEnterView.e1 = 0L;
            } else if (chatActivityEnterView.W2 != null) {
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.Y2) {
                    MediaController.getInstance().cleanupPlayer(true, true);
                }
                MediaController.getInstance().cleanRecording(false);
                MediaDataController.getInstance(chatActivityEnterView.M).pushDraftVoiceMessage(chatActivityEnterView.L2, (qnVar2 == null || !qnVar2.d4) ? 0L : qnVar2.b(), null);
                vj0 vj0Var = chatActivityEnterView.d1;
                if (vj0Var != null && (vj0Var.s > 0.0f || vj0Var.v < 1.0f)) {
                    vj0Var.setPlaying(false);
                    String r10 = aa.d.r(new StringBuilder(), chatActivityEnterView.X2, ".ogg");
                    if (MediaController.cropOpusFile(chatActivityEnterView.X2, r10, chatActivityEnterView.d1.getAudioLeftMs(), chatActivityEnterView.d1.getAudioRightMs())) {
                        try {
                            new File(chatActivityEnterView.X2).delete();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        try {
                            new File(r10).renameTo(new File(chatActivityEnterView.X2));
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                        int i17 = 0;
                        while (true) {
                            if (i17 >= chatActivityEnterView.W2.attributes.size()) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = chatActivityEnterView.W2.attributes.get(i17);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                documentAttribute.waveform = MediaController.getWaveform(chatActivityEnterView.X2);
                                documentAttribute.duration = chatActivityEnterView.d1.getNewDuration();
                                break;
                            }
                            i17++;
                        }
                    }
                }
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(chatActivityEnterView.W2, null, chatActivityEnterView.X2, chatActivityEnterView.L2, chatActivityEnterView.O2, chatActivityEnterView.getThreadMessage(), null, null, null, null, z10, i9, 0, chatActivityEnterView.K ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, null, null, false);
                of2.sendMessageChatArguments = qnVar2 != null ? qnVar2.C8() : null;
                of2.effect_id = this.N4;
                of2.payStars = j10;
                of2.monoForumPeer = getSendMonoForumPeerId();
                of2.suggestionParams = getSendMessageSuggestionParams();
                this.N4 = 0L;
                oeVar.setEffect(0L);
                if (!this.U2.n1()) {
                    MessageObject.SendAnimationData sendAnimationData2 = new MessageObject.SendAnimationData();
                    sendAnimationData2.fromPreview = System.currentTimeMillis() - this.I0 < 200;
                    of2.sendAnimationData = sendAnimationData2;
                }
                s(of2);
                SendMessagesHelper.getInstance(this.M).sendMessage(of2);
                eg egVar2 = this.U2;
                if (egVar2 != null) {
                    chatActivityEnterView4 = this;
                    egVar2.y(null, z10, i9, i10, j10);
                } else {
                    chatActivityEnterView4 = this;
                }
                chatActivityEnterView4.n0(true);
                chatActivityEnterView4.J(true);
                AndroidUtilities.runOnUIThread(new hd(chatActivityEnterView4, 3), 100L);
                chatActivityEnterView4.e1 = 0L;
            } else {
                ChatActivityEnterView chatActivityEnterView5 = chatActivityEnterView;
                long j11 = 200;
                String str2 = "";
                if (!chatActivityEnterView5.y1 || (richMessage = chatActivityEnterView5.z1) == null) {
                    org.telegram.ui.qn qnVar3 = qnVar2;
                    oe oeVar2 = oeVar;
                    chatActivityEnterView2 = chatActivityEnterView5;
                    int i18 = 1;
                    ff ffVar = chatActivityEnterView2.A0;
                    CharSequence textToUse = ffVar == null ? "" : ffVar.getTextToUse();
                    if (qnVar3 != null && (chat2 = qnVar3.e) != null && chat2.slowmode_enabled && !ChatObject.hasAdminRights(chat2)) {
                        int length = textToUse.length();
                        int maxMessageLength = chatActivityEnterView2.N.getMessagesController().getMaxMessageLength();
                        org.telegram.ui.ActionBar.b6 b6Var = chatActivityEnterView2.R3;
                        if (length > maxMessageLength) {
                            y4.u0(qnVar3, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSendErrorTooLong", R.string.SlowmodeSendErrorTooLong), b6Var);
                        } else if (chatActivityEnterView2.C2 && textToUse.length() > 0) {
                            y4.u0(qnVar3, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSendError", R.string.SlowmodeSendError), b6Var);
                        }
                    }
                    if (!H(chatActivityEnterView2.M, chatActivityEnterView2.L2, qnVar3, textToUse)) {
                        org.telegram.ui.gn gnVar = chatActivityEnterView2.Q2;
                        if (gnVar == null || qnVar3 == null || !gnVar.f) {
                            int[] iArr = new int[1];
                            Emoji.parseEmojis(textToUse, iArr);
                            char c10 = 0;
                            boolean z15 = iArr[0] > 0;
                            CharSequence trimmedString = !z15 ? AndroidUtilities.getTrimmedString(textToUse) : textToUse;
                            boolean y12 = chatActivityEnterView2.y1();
                            int maxMessageLength2 = chatActivityEnterView2.N.getMessagesController().getMaxMessageLength();
                            if (trimmedString.length() != 0) {
                                if (chatActivityEnterView2.U2 != null && qnVar3 != null) {
                                    if ((i9 != 0) == qnVar3.c()) {
                                        chatActivityEnterView2.U2.t0();
                                    }
                                }
                                int i19 = 0;
                                while (true) {
                                    int i20 = i19 + maxMessageLength2;
                                    if (trimmedString.length() > i20) {
                                        int i21 = i20 - 1;
                                        i12 = -1;
                                        i13 = -1;
                                        i14 = -1;
                                        for (int i22 = 0; i21 > i19 && i22 < 300; i22++) {
                                            char charAt = trimmedString.charAt(i21);
                                            char charAt2 = i21 > 0 ? trimmedString.charAt(i21 - 1) : ' ';
                                            if (charAt == '\n' && charAt2 == '\n') {
                                                i11 = i21;
                                                break;
                                            }
                                            if (charAt == '\n') {
                                                i14 = i21;
                                            } else if (i12 < 0 && Character.isWhitespace(charAt) && charAt2 == '.') {
                                                i12 = i21;
                                            } else if (i13 < 0 && Character.isWhitespace(charAt)) {
                                                i13 = i21;
                                            }
                                            i21--;
                                        }
                                        i11 = -1;
                                    } else {
                                        i11 = -1;
                                        i12 = -1;
                                        i13 = -1;
                                        i14 = -1;
                                    }
                                    int min = Math.min(i20, trimmedString.length());
                                    if (i11 > 0) {
                                        min = i11;
                                    } else if (i14 > 0) {
                                        min = i14;
                                    } else if (i12 > 0) {
                                        min = i12;
                                    } else if (i13 > 0) {
                                        min = i13;
                                    }
                                    CharSequence subSequence = trimmedString.subSequence(i19, min);
                                    if (!z15) {
                                        subSequence = AndroidUtilities.getTrimmedString(subSequence);
                                    }
                                    CharSequence[] charSequenceArr = new CharSequence[i18];
                                    charSequenceArr[c10] = subSequence;
                                    ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(chatActivityEnterView2.M).getEntities(charSequenceArr, y12);
                                    if (chatActivityEnterView2.U2.n1()) {
                                        charSequence = trimmedString;
                                        if (chatActivityEnterView2.H0 != null) {
                                            sendAnimationData = new MessageObject.SendAnimationData();
                                            charSequence2 = textToUse;
                                            i15 = min;
                                            sendAnimationData.fromPreview = System.currentTimeMillis() - chatActivityEnterView2.I0 < j11;
                                        } else {
                                            charSequence2 = textToUse;
                                            i15 = min;
                                            charSequence3 = charSequence;
                                            sendAnimationData = null;
                                            boolean checkUpdateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(charSequence3);
                                            threadMessage = chatActivityEnterView2.getThreadMessage();
                                            if (threadMessage == null && (messageObject = chatActivityEnterView2.P2) != null) {
                                                threadMessage = messageObject;
                                            }
                                            str = str2;
                                            oe oeVar3 = oeVar2;
                                            i16 = i15;
                                            charSequence4 = charSequence2;
                                            boolean z16 = y12;
                                            charSequence5 = charSequence3;
                                            qnVar = qnVar3;
                                            SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(charSequenceArr[c10].toString(), chatActivityEnterView2.L2, chatActivityEnterView2.O2, threadMessage, chatActivityEnterView2.S2, chatActivityEnterView2.T2, entities, null, null, z10, i9, i10, sendAnimationData, checkUpdateStickersOrder);
                                            of3.sendMessageChatArguments = qnVar == null ? qnVar.C8() : null;
                                            of3.effect_id = this.N4;
                                            of3.payStars = j10;
                                            of3.monoForumPeer = getSendMonoForumPeerId();
                                            of3.suggestionParams = getSendMessageSuggestionParams();
                                            this.N4 = 0L;
                                            oeVar3.setEffect(0L);
                                            s(of3);
                                            of3.invert_media = qnVar == null && (messagePreviewParams3 = qnVar.b5) != null && messagePreviewParams3.webpageTop;
                                            if (qnVar != null || (chat = qnVar.e) == null || ChatObject.canSendEmbed(chat)) {
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
                                                        tL_messageMediaWebPage.force_large_media = (qnVar == null || (messagePreviewParams2 = qnVar.b5) == null || messagePreviewParams2.webpageSmall) ? false : true;
                                                        tL_messageMediaWebPage.force_small_media = (qnVar == null || (messagePreviewParams = qnVar.b5) == null || !messagePreviewParams.webpageSmall) ? false : true;
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
                                            if (qnVar != null) {
                                                qnVar.l5 = r32;
                                                qnVar.C5 = r32;
                                                MessagePreviewParams messagePreviewParams4 = qnVar.b5;
                                                if (messagePreviewParams4 != null) {
                                                    messagePreviewParams4.updateLink(this.M, null, "", null, null, null);
                                                }
                                                this.S2 = r32;
                                                this.T2 = z13;
                                                qnVar.j8();
                                            }
                                            SendMessagesHelper.getInstance(this.M).sendMessage(of3);
                                            i19 = i16 + 1;
                                            if (i16 != charSequence5.length()) {
                                                break;
                                            }
                                            chatActivityEnterView2 = this;
                                            oeVar2 = oeVar3;
                                            qnVar3 = qnVar;
                                            textToUse = charSequence4;
                                            y12 = z16;
                                            trimmedString = charSequence5;
                                            str2 = str;
                                            i18 = 1;
                                            j11 = 200;
                                            c10 = 0;
                                        }
                                    } else {
                                        MessageObject.SendAnimationData sendAnimationData3 = new MessageObject.SendAnimationData();
                                        charSequence = trimmedString;
                                        sendAnimationData3.fromPreview = System.currentTimeMillis() - chatActivityEnterView2.I0 < j11;
                                        float dp = AndroidUtilities.dp(22.0f);
                                        sendAnimationData3.height = dp;
                                        sendAnimationData3.width = dp;
                                        ff ffVar2 = chatActivityEnterView2.A0;
                                        if (ffVar2 != null) {
                                            ffVar2.getLocationInWindow(chatActivityEnterView2.I2);
                                            sendAnimationData3.x = AndroidUtilities.dp(11.0f) + r12[c10];
                                            sendAnimationData3.y = AndroidUtilities.dp(19.0f) + r12[1];
                                        } else {
                                            sendAnimationData3.x = AndroidUtilities.dp(55.0f);
                                            sendAnimationData3.y = AndroidUtilities.displaySize.y - AndroidUtilities.dp(19.0f);
                                        }
                                        charSequence2 = textToUse;
                                        i15 = min;
                                        sendAnimationData = sendAnimationData3;
                                    }
                                    charSequence3 = charSequence;
                                    boolean checkUpdateStickersOrder2 = SendMessagesHelper.checkUpdateStickersOrder(charSequence3);
                                    threadMessage = chatActivityEnterView2.getThreadMessage();
                                    if (threadMessage == null) {
                                        threadMessage = messageObject;
                                    }
                                    str = str2;
                                    oe oeVar32 = oeVar2;
                                    i16 = i15;
                                    charSequence4 = charSequence2;
                                    boolean z162 = y12;
                                    charSequence5 = charSequence3;
                                    qnVar = qnVar3;
                                    SendMessagesHelper.SendMessageParams of32 = SendMessagesHelper.SendMessageParams.of(charSequenceArr[c10].toString(), chatActivityEnterView2.L2, chatActivityEnterView2.O2, threadMessage, chatActivityEnterView2.S2, chatActivityEnterView2.T2, entities, null, null, z10, i9, i10, sendAnimationData, checkUpdateStickersOrder2);
                                    of32.sendMessageChatArguments = qnVar == null ? qnVar.C8() : null;
                                    of32.effect_id = this.N4;
                                    of32.payStars = j10;
                                    of32.monoForumPeer = getSendMonoForumPeerId();
                                    of32.suggestionParams = getSendMessageSuggestionParams();
                                    this.N4 = 0L;
                                    oeVar32.setEffect(0L);
                                    s(of32);
                                    of32.invert_media = qnVar == null && (messagePreviewParams3 = qnVar.b5) != null && messagePreviewParams3.webpageTop;
                                    if (qnVar != null) {
                                    }
                                    r32 = 0;
                                    r32 = 0;
                                    r32 = 0;
                                    z12 = false;
                                    webPage = this.S2;
                                    if (webPage instanceof TLRPC.TL_webPagePending) {
                                    }
                                    if (qnVar != null) {
                                    }
                                    SendMessagesHelper.getInstance(this.M).sendMessage(of32);
                                    i19 = i16 + 1;
                                    if (i16 != charSequence5.length()) {
                                    }
                                }
                                if (this.U2.n1() || (!(i9 == 0 || c()) || c())) {
                                    chatActivityEnterView3 = this;
                                    ff ffVar3 = chatActivityEnterView3.A0;
                                    if (ffVar3 != null) {
                                        ffVar3.setText(str);
                                    }
                                    eg egVar3 = chatActivityEnterView3.U2;
                                    if (egVar3 != null) {
                                        egVar3.y(charSequence4, z10, i9, i10, j10);
                                    }
                                } else {
                                    this.c0 = z12;
                                    org.telegram.messenger.lf lfVar = new org.telegram.messenger.lf(this, charSequence4, z10, i9, i10, j10);
                                    chatActivityEnterView3 = this;
                                    chatActivityEnterView3.b0 = lfVar;
                                    AndroidUtilities.runOnUIThread(lfVar, 200L);
                                }
                                chatActivityEnterView3.x2 = 0L;
                                chatActivityEnterView3.R1();
                                return z12;
                            }
                        } else {
                            qnVar3.Rb();
                        }
                        chatActivityEnterView3 = chatActivityEnterView2;
                        z12 = false;
                        if (chatActivityEnterView3.C2 && (egVar = chatActivityEnterView3.U2) != null) {
                            egVar.y(null, z10, i9, i10, j10);
                        }
                        chatActivityEnterView3.R1();
                        return z12;
                    }
                } else {
                    SendMessagesHelper.prepareSendingArticle(chatActivityEnterView5.N, richMessage.blocks, richMessage.photos, richMessage.documents, null, false, chatActivityEnterView5.L2, chatActivityEnterView5.O2, chatActivityEnterView5.getThreadMessage(), z10, i9, i10, qnVar2 != null ? qnVar2.C8() : null, chatActivityEnterView5.N4, chatActivityEnterView5.getSendMonoForumPeerId(), j10);
                    chatActivityEnterView2 = this;
                    chatActivityEnterView2.N4 = 0L;
                    oeVar.setEffect(0L);
                    chatActivityEnterView2.A0.setText("");
                    chatActivityEnterView2.N();
                    eg egVar4 = chatActivityEnterView2.U2;
                    if (egVar4 != null) {
                        egVar4.y(null, z10, i9, i10, j10);
                    }
                    chatActivityEnterView2.J(true);
                }
            }
        } else {
            eg egVar5 = this.U2;
            if (egVar5 != null) {
                egVar5.J0();
            } else {
                chatActivityEnterView2 = this;
            }
        }
        return false;
    }

    public final void U() {
        if (this.O0 != null) {
            return;
        }
        se seVar = new se(this, getContext(), 2);
        this.O0 = seVar;
        seVar.setScaleType(ImageView.ScaleType.CENTER);
        se seVar2 = this.O0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(h0(org.telegram.ui.ActionBar.f6.Wk), false);
        this.A3 = animatedArrowDrawable;
        seVar2.setImageDrawable(animatedArrowDrawable);
        this.O0.setVisibility(8);
        this.O0.setScaleX(0.1f);
        this.O0.setScaleY(0.1f);
        this.O0.setAlpha(0.0f);
        this.O0.setBackground(org.telegram.ui.ActionBar.f6.f0(h0(org.telegram.ui.ActionBar.f6.i6), 1, -1));
        this.v1.addView(this.O0, g7.e6.e(44, 44, 85));
        this.O0.setOnClickListener(new jd(this, 5));
        this.O0.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
    }

    public final void U0(boolean z10, boolean z11) {
        V0(z10, z11, false);
    }

    public final void V() {
        if (this.A0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.b6 b6Var = this.R3;
        ff ffVar = new ff(this, context, b6Var);
        this.A0 = ffVar;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 28) {
            ffVar.setFallbackLineSpacing(false);
        }
        if (i9 >= 35) {
            this.A0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.A0.setDelegate(new pd(this));
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar == null || qnVar.getParentLayout() == null || !((ActionBarLayout) qnVar.getParentLayout()).b) {
            this.A0.setWindowView(this.J2.getWindow().getDecorView());
        } else {
            this.A0.setWindowView(qnVar.getParentLayout().getWindow().getDecorView());
        }
        TLRPC.EncryptedChat encryptedChat = qnVar != null ? qnVar.h : null;
        this.A0.setAllowTextEntitiesIntersection(y1());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        int i10 = ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) ? 285212672 : TLObject.FLAG_28;
        this.A0.setIncludeFontPadding(false);
        this.A0.setImeOptions(i10);
        ff ffVar2 = this.A0;
        int inputType = ffVar2.getInputType() | 147456;
        this.a = inputType;
        ffVar2.setInputType(inputType);
        G1(false);
        this.A0.setSingleLine(false);
        this.A0.setMaxLines(6);
        this.A0.setTextSize(1, 18.0f);
        this.A0.setGravity(80);
        this.A0.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(10.0f));
        this.A0.setBackgroundDrawable(null);
        this.A0.setTextColor(h0(org.telegram.ui.ActionBar.f6.Ud));
        this.A0.setLinkTextColor(h0(org.telegram.ui.ActionBar.f6.hc));
        this.A0.setHighlightColor(h0(org.telegram.ui.ActionBar.f6.uf));
        ff ffVar3 = this.A0;
        int i11 = org.telegram.ui.ActionBar.f6.Vd;
        ffVar3.setHintColor(h0(i11));
        this.A0.setHintTextColor(h0(i11));
        this.A0.setCursorColor(h0(org.telegram.ui.ActionBar.f6.Wd));
        this.A0.setHandlesColor(h0(org.telegram.ui.ActionBar.f6.vf));
        ff ffVar4 = this.A0;
        boolean z10 = this.S3;
        FrameLayout.LayoutParams d = g7.e6.d(-1, -2.0f, 80, 52.0f, 0.0f, z10 ? 50.0f : 2.0f, 1.5f);
        ce ceVar = this.t1;
        ceVar.addView(ffVar4, 1, d);
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(getContext(), this.M, b6Var);
        this.x1 = previewView;
        previewView.setAllowActions(false);
        this.x1.setMaxHeight(AndroidUtilities.dp(150.0f));
        this.x1.setMinHeight(AndroidUtilities.dp(88.0f));
        this.x1.setVisibility(8);
        this.x1.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
        this.x1.setOnClickListener(new jd(this, 10));
        ceVar.addView(this.x1, 2, g7.e6.d(-1, -2.0f, 80, 44.0f, 0.0f, (z10 ? 50 : 2) - 8, 1.5f));
        this.A0.setOnKeyListener(new gf(this));
        this.A0.setOnEditorActionListener(new m.u2(this, 3));
        this.A0.addTextChangedListener(new hf(this));
        this.A0.addTextChangedListener(new org.telegram.ui.Cells.i3());
        this.A0.setEnabled(this.D4);
        ArrayList arrayList = this.C4;
        if (arrayList != null) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                this.A0.addTextChangedListener((TextWatcher) obj);
            }
            this.C4.clear();
        }
        G1(false);
        P1(qnVar != null && qnVar.getFragmentBeginToShow());
        if (qnVar != null) {
            qnVar.A6(false, false);
        }
        H1(this.K4);
    }

    public final void V0(boolean z10, boolean z11, boolean z12) {
        if ((this.E2 != z10 || this.F2 != z11) && this.Q0 != null) {
            if (this.S0 && !z12) {
                this.B3 = true;
                l0(false);
            } else if (z12) {
                H0();
            }
        }
        this.D2 = true;
        this.E2 = z10;
        this.F2 = z11;
        uf ufVar = this.Q0;
        if (ufVar != null) {
            ufVar.J(true, z10, z11, true);
        }
        d1(false, !this.e2);
    }

    public final void W() {
        if (this.a1 != null) {
            return;
        }
        ae aeVar = new ae(this, getContext(), 2);
        this.a1 = aeVar;
        aeVar.setVisibility(this.W2 == null ? 8 : 0);
        this.a1.setFocusable(true);
        this.a1.setFocusableInTouchMode(true);
        this.a1.setClickable(true);
        this.t1.addView(this.a1, g7.e6.e(-1, 44, 80));
        pi0 pi0Var = new pi0(getContext());
        this.c1 = pi0Var;
        pi0Var.setScaleType(ImageView.ScaleType.CENTER);
        this.c1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.c1.getAnimatedDrawable().l0 = true;
        M1();
        this.c1.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        this.c1.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(h0(org.telegram.ui.ActionBar.f6.i6), 1, -1));
        this.a1.addView(this.c1, g7.e6.c(44.0f, 44));
        this.c1.setOnClickListener(new jd(this, 6));
        z61 z61Var = new z61(getContext());
        this.b1 = z61Var;
        z61Var.setVisibility(4);
        z61 z61Var2 = this.b1;
        z61Var2.O = !this.t4;
        z61Var2.setRoundFrames(true);
        this.b1.setDelegate(new ue(this));
        this.a1.addView(this.b1, g7.e6.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        x61 x61Var = new x61(context);
        TextPaint textPaint = new TextPaint(1);
        x61Var.d = textPaint;
        x61Var.e = -1L;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        x61Var.b = context.getDrawable(R.drawable.tooltip_arrow);
        x61Var.a = org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.qf, false));
        x61Var.b();
        x61Var.setTime(0);
        this.b1.setTimeHintView(x61Var);
        this.h1.addView(x61Var, g7.e6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        vj0 vj0Var = new vj0(getContext(), this.R3);
        this.d1 = vj0Var;
        this.a1.addView(vj0Var, g7.e6.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        H1(this.K4);
    }

    public final void W0() {
        kh.x3 x3Var = this.H;
        if (x3Var == null) {
            return;
        }
        x3Var.t(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBirthdayHint, UserObject.getFirstName(this.K2.i()))), this.H.getTextPaint().getFontMetricsInt(), new hd(this, 26)));
        kh.x3 x3Var2 = this.H;
        x3Var2.h = kh.x3.a(x3Var2.getText(), this.H.getTextPaint());
    }

    public final void X() {
        ig igVar = this.J1;
        xu0 xu0Var = this.h1;
        if (igVar == null) {
            ig igVar2 = new ig(this, getContext());
            this.J1 = igVar2;
            igVar2.setVisibility(8);
            xu0Var.addView(this.J1, g7.e6.e(-1, -2, 80));
        }
        if (this.I1 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.I1 = recordCircle;
        recordCircle.setVisibility(8);
        xu0Var.addView(this.I1, g7.e6.e(-1, -2, 80));
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
        mh.b0 b0Var = this.j0;
        if (b0Var != null) {
            b0Var.E(hVar);
        }
        B1(z10);
        F(z10);
    }

    public final void Y() {
        if (this.Z0 != null || getContext() == null) {
            return;
        }
        dh.g gVar = new dh.g(getContext(), 13);
        this.Z0 = gVar;
        gVar.setClipChildren(false);
        this.Z0.setVisibility(8);
        this.t1.addView(this.Z0, g7.e6.c(44.0f, -1));
        this.Z0.setOnTouchListener(new jh.d(12));
        dh.g gVar2 = this.Z0;
        SlideTextView slideTextView = new SlideTextView(getContext());
        this.f1 = slideTextView;
        gVar2.addView(slideTextView, g7.e6.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        this.d.setPadding(AndroidUtilities.dp(13.0f), 0, 0, 0);
        this.d.setFocusable(false);
        LinearLayout linearLayout2 = this.d;
        kg kgVar = new kg(this, getContext());
        this.g1 = kgVar;
        linearLayout2.addView(kgVar, g7.e6.t(28, 28, 16, 0, 0, 0, 0));
        LinearLayout linearLayout3 = this.d;
        ng ngVar = new ng(this, getContext());
        this.U0 = ngVar;
        linearLayout3.addView(ngVar, g7.e6.t(-1, -1, 16, 6, 0, 0, 0));
        this.Z0.addView(this.d, g7.e6.e(-1, -1, 16));
    }

    public final void Y0(int i9, boolean z10, boolean z11) {
        this.j2 = i9;
        if (this.k2 == z10) {
            return;
        }
        this.k2 = z10;
        B1(z11);
    }

    public final void Z() {
        if (this.E1 != null || this.K2 == null) {
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
        int h02 = h0(org.telegram.ui.ActionBar.f6.Wk);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(h02, mode));
        mutate2.setColorFilter(new PorterDuffColorFilter(h0(org.telegram.ui.ActionBar.f6.jf), mode));
        fq fqVar = new fq(mutate, mutate2);
        qe qeVar = new qe(this, getContext());
        this.E1 = qeVar;
        qeVar.setImageDrawable(fqVar);
        this.E1.setVisibility(8);
        this.E1.setContentDescription(LocaleController.getString(R.string.ScheduledMessages));
        this.E1.setScaleType(ImageView.ScaleType.CENTER);
        this.E1.setBackground(org.telegram.ui.ActionBar.f6.f0(h0(org.telegram.ui.ActionBar.f6.i6), 1, -1));
        this.t1.addView(this.E1, 2, g7.e6.e(44, 44, 85));
        this.E1.setOnClickListener(new jd(this, 2));
        this.E1.setTranslationX(0.0f);
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
        ff ffVar;
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
                rf rfVar = new rf(this, this.J2, this.R3);
                this.C1 = rfVar;
                rfVar.setVisibility(8);
                this.T0 = false;
                this.C1.setDelegate(new pd(this));
                this.i1.addView(this.C1);
            }
            this.h2 = messageObject;
            if (messageObject != null) {
                TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyKeyboardMarkup) {
                    tL_replyKeyboardMarkup = (TLRPC.TL_replyKeyboardMarkup) replyMarkup;
                    this.i2 = tL_replyKeyboardMarkup;
                    rf rfVar2 = this.C1;
                    Point point = AndroidUtilities.displaySize;
                    rfVar2.setPanelHeight(point.x <= point.y ? this.t2 : this.s2);
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
                        if (z13 && (((ffVar = this.A0) == null || ffVar.length() == 0) && !s0())) {
                            t1(1, 1, true, true);
                        }
                    } else if (s0() && this.a2 == 1) {
                        if (z11) {
                            this.k3 = true;
                            H0();
                        } else {
                            t1(0, 1, true, true);
                        }
                    }
                    B1(true);
                }
            }
            tL_replyKeyboardMarkup = null;
            this.i2 = tL_replyKeyboardMarkup;
            rf rfVar22 = this.C1;
            Point point2 = AndroidUtilities.displaySize;
            rfVar22.setPanelHeight(point2.x <= point2.y ? this.t2 : this.s2);
            if (this.i2 == null) {
            }
            B1(true);
        }
    }

    @Override // org.telegram.ui.Components.zw0
    public final void a(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i9, int i10) {
        if (this.g5) {
            return;
        }
        org.telegram.ui.gn gnVar = this.Q2;
        org.telegram.ui.qn qnVar = this.K2;
        if (gnVar != null && qnVar != null && gnVar.f) {
            qnVar.Rb();
            return;
        }
        if (!c() || i9 != 0) {
            y4.a0(this.M, 1, this.L2, new vd(this, document, str, sendAnimationData, z11, i9, i10, obj, z10));
            return;
        }
        y4.M(this.J2, qnVar.a(), new org.telegram.messenger.cj(this, document, str, obj, sendAnimationData, z10), this.R3);
    }

    public final void a0() {
        if (this.l0 != null || getContext() == null) {
            return;
        }
        fo0 fo0Var = new fo0(getContext());
        ImageReceiver imageReceiver = new ImageReceiver(fo0Var);
        fo0Var.a = imageReceiver;
        fo0Var.b = new z8((org.telegram.ui.ActionBar.b6) null);
        Paint paint = new Paint(1);
        fo0Var.d = paint;
        Paint paint2 = new Paint(1);
        fo0Var.e = paint2;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.cf, false));
        paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.bf, false));
        int dp = AndroidUtilities.dp(18.0f);
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.2f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, 0, l1, l1);
        fo0Var.c = i02;
        i02.setCallback(fo0Var);
        fo0Var.setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, ""));
        this.l0 = fo0Var;
        fo0Var.setOnClickListener(new jd(this, 16));
        this.l0.setVisibility(8);
        this.t1.addView(this.l0, g7.e6.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
    }

    public final void a1(MessageObject messageObject, String str, boolean z10, boolean z11) {
        ff ffVar;
        SendMessagesHelper.SendMessageParams of2;
        String sb2;
        if (str == null || getVisibility() != 0 || (ffVar = this.A0) == null) {
            return;
        }
        r16 = null;
        TLRPC.User user = null;
        if (!z10) {
            if (this.C0 > 0 && !c()) {
                eg egVar = this.U2;
                if (egVar != null) {
                    mg mgVar = this.B0;
                    egVar.k1(mgVar, mgVar.a.getText(), true);
                    return;
                }
                return;
            }
            TLRPC.User user2 = (messageObject == null || !DialogObject.isChatDialog(this.L2)) ? null : this.N.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
            if ((this.j2 != 1 || z11) && user2 != null && user2.bot && !str.contains("@")) {
                Locale locale = Locale.US;
                of2 = SendMessagesHelper.SendMessageParams.of(aa.d.z(str, "@", UserObject.getPublicUsername(user2)), this.L2, this.O2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            } else {
                of2 = SendMessagesHelper.SendMessageParams.of(str, this.L2, this.O2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            }
            org.telegram.ui.qn qnVar = this.K2;
            of2.sendMessageChatArguments = qnVar != null ? qnVar.C8() : null;
            of2.effect_id = this.N4;
            this.N4 = 0L;
            this.F0.setEffect(0L);
            s(of2);
            SendMessagesHelper.getInstance(this.M).sendMessage(of2);
            return;
        }
        String obj = ffVar.getText().toString();
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
            StringBuilder e10 = ta.b.e(str, " ");
            e10.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            sb2 = e10.toString();
        }
        this.M2 = true;
        this.A0.setText(sb2);
        ff ffVar2 = this.A0;
        ffVar2.setSelection(ffVar2.getText().length());
        this.M2 = false;
        eg egVar2 = this.U2;
        if (egVar2 != null) {
            egVar2.b1(this.A0.getText(), true, false);
        }
        if (this.u2 || this.a2 != -1) {
            return;
        }
        G0();
    }

    @Override // org.telegram.ui.Components.zw0
    public final boolean b() {
        org.telegram.ui.qn qnVar = this.K2;
        return qnVar != null && qnVar.D6();
    }

    public final boolean b0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject, MessageObject messageObject2, org.telegram.ui.ni niVar) {
        org.telegram.ui.qn qnVar;
        int i9;
        int i10 = 0;
        if (keyboardButtonProto != null && messageObject2 != null && ((qnVar = this.K2) == null || qnVar.N3 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) gf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) gf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) gf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) gf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) gf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                AndroidUtilities.addToClipboard(tL_inlineButtonTypeCopy.copy_text);
                oc.a0(qnVar).i(LocaleController.formatString(R.string.ExactTextCopied, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_keyboardButton.text, this.L2, messageObject, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = qnVar != null ? qnVar.C8() : null;
                    of2.effect_id = this.N4;
                    this.N4 = 0L;
                    this.F0.setEffect(0L);
                    SendMessagesHelper.getInstance(this.M).sendMessage(of2);
                    return true;
                }
            }
            Activity activity = this.J2;
            if (tL_inlineButtonTypeUrl != null) {
                if (ve.e.y(tL_inlineButtonTypeUrl.url)) {
                    ve.e.q(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, niVar);
                    return true;
                }
                y4.r0(this.K2, tL_inlineButtonTypeUrl.url, false, true, true, false, niVar, null, this.R3);
                return true;
            }
            if (gf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                qnVar.rb(messageObject2, 2);
                return true;
            }
            if (!gf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                if (gf.c.b(keyboardButtonProto)) {
                    TLRPC.Message message = messageObject2.messageOwner;
                    long j10 = message.via_bot_id;
                    if (j10 == 0) {
                        j10 = message.from_id.user_id;
                    }
                    sf sfVar = new sf(this, messageObject2, j10, keyboardButtonProto, messageObject, MessagesController.getInstance(this.M).getUser(Long.valueOf(j10)));
                    if (SharedPrefsHelper.isWebViewConfirmShown(this.M, j10) || MessagesController.getInstance(this.M).whitelistedBots.contains(Long.valueOf(j10))) {
                        sfVar.run();
                        return true;
                    }
                    y4.o(qnVar, MessagesController.getInstance(this.M).getUser(Long.valueOf(this.L2)), new e5.w(this, sfVar, j10, 21), null);
                    return true;
                }
                if (gf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String string = LocaleController.getString("ShareYouLocationTitle", R.string.ShareYouLocationTitle);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.N = string;
                    c2Var.P = LocaleController.getString("ShareYouLocationInfo", R.string.ShareYouLocationInfo);
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new androidx.car.app.utils.a(this, messageObject2, keyboardButtonProto, 19));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    qnVar.showDialog(c2Var);
                    return true;
                }
                if (gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                    SendMessagesHelper.getInstance(this.M).sendCallback(true, messageObject2, keyboardButtonProto, qnVar);
                    return true;
                }
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!qnVar.Ca(tL_inlineButtonTypeSwitchInline)) {
                        if (!tL_inlineButtonTypeSwitchInline.same_peer) {
                            Bundle e10 = org.telegram.messenger.l0.e(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                e10.putBoolean("allowGroups", false);
                                e10.putBoolean("allowMegagroups", false);
                                e10.putBoolean("allowLegacyGroups", false);
                                e10.putBoolean("allowUsers", false);
                                e10.putBoolean("allowChannels", false);
                                e10.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i10 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i10);
                                    i10++;
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
                            org.telegram.ui.dy dyVar = new org.telegram.ui.dy(e10);
                            dyVar.y2 = new androidx.car.app.utils.a(this, messageObject2, tL_inlineButtonTypeSwitchInline, 20);
                            qnVar.presentFragment(dyVar);
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
                        qnVar.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType == null || messageObject2.messageOwner == null) {
                        FileLog.e("button.peer_type is null");
                    } else {
                        if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot)) {
                            if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i9 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                                TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                                Boolean bool = tL_requestPeerTypeUser.bot;
                                Boolean bool2 = tL_requestPeerTypeUser.premium;
                                xd xdVar = new xd(this, messageObject2, tL_buttonTypeRequestPeer);
                                org.telegram.ui.bj0 bj0Var = org.telegram.ui.bj0.q0;
                                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                                if (R == null || org.telegram.ui.bj0.q0 != null) {
                                    return false;
                                }
                                org.telegram.ui.bj0 bj0Var2 = new org.telegram.ui.bj0(R, i9, bool, bool2, xdVar);
                                bj0Var2.show();
                                org.telegram.ui.bj0.q0 = bj0Var2;
                                return false;
                            }
                            Bundle e11 = org.telegram.messenger.l0.e(15, "onlySelect", "dialogsType", true);
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
                            org.telegram.ui.dy dyVar2 = new org.telegram.ui.dy(e11);
                            dyVar2.y2 = new xd(this, messageObject2, tL_buttonTypeRequestPeer);
                            qnVar.presentFragment(dyVar2);
                            return false;
                        }
                        TLRPC.User i11 = getParentFragment() != null ? getParentFragment().i() : MessagesController.getInstance(this.M).getUser(Long.valueOf(this.L2));
                        if (i11 != null) {
                            sq.a(getContext(), this.M, i11, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new bg.j1(this, messageObject2, tL_buttonTypeRequestPeer, i11, 6), this.R3, null);
                            return false;
                        }
                    }
                }
                return true;
            }
            TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) gf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
            Boolean valueOf = (tL_buttonTypeRequestPoll.flags & 1) != 0 ? Boolean.valueOf(tL_buttonTypeRequestPoll.quiz) : null;
            qnVar.X9();
            ih.u2 u2Var = qnVar.F1;
            if (u2Var != null) {
                u2Var.O0 = false;
                u2Var.t1.setVisibility(8);
                u2Var.S1(false, valueOf);
                return false;
            }
        }
        return false;
    }

    public final void b1(int i9, long j10) {
        this.L2 = j10;
        if (this.M != i9) {
            this.G3.unlock();
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.M);
            int i10 = NotificationCenter.recordStarted;
            notificationCenter.removeObserver(this, i10);
            NotificationCenter notificationCenter2 = NotificationCenter.getInstance(this.M);
            int i11 = NotificationCenter.recordPaused;
            notificationCenter2.removeObserver(this, i11);
            NotificationCenter notificationCenter3 = NotificationCenter.getInstance(this.M);
            int i12 = NotificationCenter.recordResumed;
            notificationCenter3.removeObserver(this, i12);
            NotificationCenter notificationCenter4 = NotificationCenter.getInstance(this.M);
            int i13 = NotificationCenter.recordStartError;
            notificationCenter4.removeObserver(this, i13);
            NotificationCenter notificationCenter5 = NotificationCenter.getInstance(this.M);
            int i14 = NotificationCenter.recordStopped;
            notificationCenter5.removeObserver(this, i14);
            NotificationCenter notificationCenter6 = NotificationCenter.getInstance(this.M);
            int i15 = NotificationCenter.recordProgressChanged;
            notificationCenter6.removeObserver(this, i15);
            NotificationCenter notificationCenter7 = NotificationCenter.getInstance(this.M);
            int i16 = NotificationCenter.closeChats;
            notificationCenter7.removeObserver(this, i16);
            NotificationCenter notificationCenter8 = NotificationCenter.getInstance(this.M);
            int i17 = NotificationCenter.audioDidSent;
            notificationCenter8.removeObserver(this, i17);
            NotificationCenter notificationCenter9 = NotificationCenter.getInstance(this.M);
            int i18 = NotificationCenter.audioRouteChanged;
            notificationCenter9.removeObserver(this, i18);
            NotificationCenter notificationCenter10 = NotificationCenter.getInstance(this.M);
            int i19 = NotificationCenter.messagePlayingProgressDidChanged;
            notificationCenter10.removeObserver(this, i19);
            NotificationCenter notificationCenter11 = NotificationCenter.getInstance(this.M);
            int i20 = NotificationCenter.featuredStickersDidLoad;
            notificationCenter11.removeObserver(this, i20);
            NotificationCenter notificationCenter12 = NotificationCenter.getInstance(this.M);
            int i21 = NotificationCenter.messageReceivedByServer2;
            notificationCenter12.removeObserver(this, i21);
            NotificationCenter notificationCenter13 = NotificationCenter.getInstance(this.M);
            int i22 = NotificationCenter.sendingMessagesChanged;
            notificationCenter13.removeObserver(this, i22);
            this.M = i9;
            this.N = AccountInstance.getInstance(i9);
            NotificationCenter.getInstance(this.M).addObserver(this, i10);
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
            org.telegram.ui.qn qnVar = this.K2;
            P1(qnVar != null && qnVar.getFragmentBeginToShow());
        }
    }

    @Override // org.telegram.ui.Components.zw0
    public final boolean c() {
        org.telegram.ui.qn qnVar = this.K2;
        return qnVar != null && qnVar.c();
    }

    public final void c0() {
        MessagePreviewParams messagePreviewParams;
        MessageSuggestionParams of2;
        TLRPC.Chat chat;
        int i9;
        MessageSuggestionParams of3;
        MessageObject messageObject = this.U1;
        if (messageObject == null) {
            return;
        }
        boolean needResendWhenEdit = messageObject.needResendWhenEdit();
        org.telegram.ui.qn qnVar = this.K2;
        if (needResendWhenEdit && !ChatObject.canManageMonoForum(this.M, this.U1.getDialogId())) {
            if (qnVar == null || (of3 = qnVar.c5) == null) {
                of3 = MessageSuggestionParams.of(this.U1.messageOwner.suggested_post);
            }
            if (!gh.v7.U(this.M, of3.amount)) {
                if (qnVar != null) {
                    qnVar.Tb(of3);
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
                AndroidUtilities.runOnUIThread(new hd(this, 27), 200L);
            }
        }
        ff ffVar = this.A0;
        CharSequence textToUse = ffVar == null ? "" : ffVar.getTextToUse();
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
            if (qnVar != null && (chat = qnVar.e) != null && (((i9 = messageObject3.type) == 0 || i9 == 19) && !ChatObject.canSendEmbed(chat))) {
                MessageObject messageObject4 = this.U1;
                messageObject4.editingMessageSearchWebPage = false;
                TLRPC.Message message = messageObject4.messageOwner;
                message.flags &= -513;
                message.media = null;
            } else if (qnVar == null || (messagePreviewParams = qnVar.b5) == null) {
                MessageObject messageObject5 = this.U1;
                messageObject5.editingMessageSearchWebPage = false;
                int i10 = messageObject5.type;
                if (i10 == 0 || i10 == 19) {
                    TLRPC.Message message2 = messageObject5.messageOwner;
                    message2.flags |= 512;
                    message2.media = new TLRPC.TL_messageMediaEmpty();
                }
            } else {
                if (qnVar.C5 instanceof TLRPC.TL_webPagePending) {
                    MessageObject messageObject6 = this.U1;
                    messageObject6.editingMessageSearchWebPage = false;
                    int i11 = messageObject6.type;
                    if (i11 == 0 || i11 == 19) {
                        messageObject6.messageOwner.media = new TLRPC.TL_messageMediaEmpty();
                        this.U1.messageOwner.flags |= 512;
                    }
                } else if (messagePreviewParams.webpage != null) {
                    MessageObject messageObject7 = this.U1;
                    messageObject7.editingMessageSearchWebPage = false;
                    TLRPC.Message message3 = messageObject7.messageOwner;
                    message3.flags |= 512;
                    message3.media = new TLRPC.TL_messageMediaWebPage();
                    this.U1.messageOwner.media.webpage = qnVar.b5.webpage;
                } else {
                    MessageObject messageObject8 = this.U1;
                    messageObject8.editingMessageSearchWebPage = false;
                    int i12 = messageObject8.type;
                    if (i12 == 0 || i12 == 19) {
                        TLRPC.Message message4 = messageObject8.messageOwner;
                        message4.flags |= 512;
                        message4.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                TLRPC.Message message5 = this.U1.messageOwner;
                MessagePreviewParams messagePreviewParams2 = qnVar.b5;
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
                if (qnVar == null || (of2 = qnVar.c5) == null) {
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10) {
        float f10;
        float f11;
        int i9;
        ae aeVar;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i10;
        ff ffVar;
        ff ffVar2;
        ae aeVar2;
        boolean z11;
        qe qeVar;
        if (this.W2 == null && this.Z2 == null && this.U1 != messageObject) {
            V();
            boolean z12 = this.U1 != null;
            this.U1 = messageObject;
            this.V1 = z10;
            ae aeVar3 = this.v1;
            gh.m mVar = this.k1;
            ImageView imageView = this.L0;
            ge geVar = this.m1;
            le leVar = this.V0;
            if (messageObject != null) {
                this.M4 = groupedMessages != null ? groupedMessages.captionAbove : messageObject.messageOwner.invert_media;
                S(false);
                this.A1.setOnClickListener(new jd(this, 17));
                if (this.U1.needResendWhenEdit()) {
                    long j10 = this.p4;
                    if (j10 > 0) {
                        this.A1.i(1, j10, true);
                        this.A1.setLayoutParams(g7.e6.e(44, 44, 85));
                        this.A1.requestLayout();
                        aeVar = aeVar3;
                        this.A1.setOnLongClickListener(new i(this, messageObject, groupedMessages, 1));
                        this.A1.setVisibility(0);
                        this.A1.setScaleX(0.1f);
                        this.A1.setScaleY(0.1f);
                        this.A1.setAlpha(0.0f);
                        this.A1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(gr.f).start();
                        if (z10) {
                            this.V = this.N.getMessagesController().getMaxMessageLength();
                            charSequence = this.U1.messageText;
                        } else {
                            this.V = this.N.getMessagesController().maxCaptionLength;
                            charSequence = this.U1.caption;
                        }
                        if (charSequence == null) {
                            ff ffVar3 = this.A0;
                            TextPaint paint = ffVar3 != null ? ffVar3.getPaint() : null;
                            if (paint == null) {
                                paint = new TextPaint();
                                paint.setTextSize(AndroidUtilities.dp(18.0f));
                            }
                            charSequence2 = r(this.U1.messageOwner.entities, charSequence, paint.getFontMetricsInt());
                        } else {
                            charSequence2 = "";
                        }
                        if (this.Q1 == null && !z12) {
                            ff ffVar4 = this.A0;
                            this.Q1 = (ffVar4 != null || ffVar4.length() <= 0) ? null : this.A0.getText();
                            this.R1 = this.T2;
                        }
                        MessageObject messageObject2 = this.U1;
                        TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                        this.T2 = ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia.manual) && ((i10 = messageObject2.type) == 0 || i10 == 19);
                        if (this.u2) {
                            org.telegram.ui.wq wqVar = new org.telegram.ui.wq(9, this, charSequence2);
                            this.S = wqVar;
                            AndroidUtilities.runOnUIThread(wqVar, 200L);
                        } else {
                            org.telegram.ui.wq wqVar2 = this.S;
                            if (wqVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(wqVar2);
                                this.S = null;
                            }
                            setFieldText(charSequence2);
                        }
                        ffVar = this.A0;
                        if (ffVar != null) {
                            ffVar.requestFocus();
                        }
                        G0();
                        ffVar2 = this.A0;
                        if (ffVar2 != null) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ffVar2.getLayoutParams();
                            layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                            this.A0.setLayoutParams(layoutParams);
                        }
                        aeVar2 = this.a1;
                        if (aeVar2 == null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) aeVar2.getLayoutParams();
                            z11 = false;
                            layoutParams2.rightMargin = 0;
                            this.a1.setLayoutParams(layoutParams2);
                        } else {
                            z11 = false;
                        }
                        getSendButtonInternal().setVisibility(8);
                        setSlowModeButtonVisible(z11);
                        imageView.setVisibility(8);
                        leVar.setVisibility(8);
                        mVar.setVisibility(8);
                        if (geVar != null) {
                            this.q1 = 0.0f;
                            geVar.setAlpha(0.0f);
                            geVar.setScaleX(0.5f);
                            geVar.setScaleY(0.5f);
                        }
                        aeVar.setVisibility(8);
                        qeVar = this.E1;
                        if (qeVar != null) {
                            qeVar.setVisibility(8);
                        }
                    }
                }
                aeVar = aeVar3;
                this.A1.i(1, 0L, true);
                this.A1.setLayoutParams(g7.e6.e(44, 44, 85));
                this.A1.requestLayout();
                this.A1.setOnLongClickListener(new i(this, messageObject, groupedMessages, 1));
                this.A1.setVisibility(0);
                this.A1.setScaleX(0.1f);
                this.A1.setScaleY(0.1f);
                this.A1.setAlpha(0.0f);
                this.A1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(gr.f).start();
                if (z10) {
                }
                if (charSequence == null) {
                }
                if (this.Q1 == null) {
                    ff ffVar42 = this.A0;
                    this.Q1 = (ffVar42 != null || ffVar42.length() <= 0) ? null : this.A0.getText();
                    this.R1 = this.T2;
                }
                MessageObject messageObject22 = this.U1;
                TLRPC.MessageMedia messageMedia2 = messageObject22.messageOwner.media;
                this.T2 = ((messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia2.manual) && ((i10 = messageObject22.type) == 0 || i10 == 19);
                if (this.u2) {
                }
                ffVar = this.A0;
                if (ffVar != null) {
                }
                G0();
                ffVar2 = this.A0;
                if (ffVar2 != null) {
                }
                aeVar2 = this.a1;
                if (aeVar2 == null) {
                }
                getSendButtonInternal().setVisibility(8);
                setSlowModeButtonVisible(z11);
                imageView.setVisibility(8);
                leVar.setVisibility(8);
                mVar.setVisibility(8);
                if (geVar != null) {
                }
                aeVar.setVisibility(8);
                qeVar = this.E1;
                if (qeVar != null) {
                }
            } else {
                org.telegram.ui.wq wqVar3 = this.S;
                if (wqVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(wqVar3);
                    this.S = null;
                }
                oe oeVar = this.A1;
                if (oeVar != null) {
                    oeVar.setVisibility(8);
                }
                this.V = -1;
                this.U2.n();
                aeVar3.setVisibility(0);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                imageView.setAlpha(0.0f);
                imageView.setVisibility(8);
                int i11 = this.C0;
                mg mgVar = this.B0;
                if (i11 <= 0 || c()) {
                    getSendButtonInternal().setScaleX(0.1f);
                    getSendButtonInternal().setScaleY(0.1f);
                    getSendButtonInternal().setAlpha(0.0f);
                    getSendButtonInternal().setVisibility(8);
                    mgVar.setScaleX(0.1f);
                    mgVar.setScaleY(0.1f);
                    mgVar.setAlpha(0.0f);
                    setSlowModeButtonVisible(false);
                    f10 = 1.0f;
                    mVar.setScaleX(1.0f);
                    this.A = 1.0f;
                    A1();
                    mVar.setVisibility(0);
                    if (geVar != null) {
                        this.q1 = 1.0f;
                        geVar.setAlpha(1.0f);
                        geVar.setScaleX(1.0f);
                        geVar.setScaleY(1.0f);
                    }
                    leVar.setScaleX(1.0f);
                    leVar.setScaleY(1.0f);
                    leVar.setAlpha(1.0f);
                    leVar.setVisibility(0);
                } else {
                    if (this.C0 == Integer.MAX_VALUE) {
                        getSendButtonInternal().setScaleX(1.0f);
                        getSendButtonInternal().setScaleY(1.0f);
                        getSendButtonInternal().setAlpha(1.0f);
                        getSendButtonInternal().setVisibility(0);
                        mgVar.setScaleX(0.1f);
                        mgVar.setScaleY(0.1f);
                        f11 = 0.0f;
                        mgVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        i9 = 8;
                    } else {
                        f11 = 0.0f;
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        i9 = 8;
                        getSendButtonInternal().setVisibility(8);
                        mgVar.setScaleX(1.0f);
                        mgVar.setScaleY(1.0f);
                        mgVar.setAlpha(1.0f);
                        setSlowModeButtonVisible(true);
                    }
                    mVar.setScaleX(0.01f);
                    this.A = f11;
                    A1();
                    mVar.setVisibility(i9);
                    if (geVar != null) {
                        this.q1 = f11;
                        geVar.setAlpha(f11);
                        geVar.setScaleX(0.5f);
                        geVar.setScaleY(0.5f);
                    }
                    leVar.setScaleX(0.1f);
                    leVar.setScaleY(0.1f);
                    leVar.setAlpha(f11);
                    leVar.setVisibility(i9);
                    f10 = 1.0f;
                }
                Z();
                qe qeVar2 = this.E1;
                if (qeVar2 != null && qeVar2.getTag() != null) {
                    this.E1.setScaleX(f10);
                    this.E1.setScaleY(f10);
                    this.E1.setAlpha(f10);
                    this.E1.setVisibility(0);
                }
                org.telegram.ui.qn qnVar = this.K2;
                if (qnVar != null) {
                    qnVar.l5 = null;
                    qnVar.C5 = null;
                    MessagePreviewParams messagePreviewParams = qnVar.b5;
                    if (messagePreviewParams != null) {
                        messagePreviewParams.updateLink(this.M, null, "", null, null, null);
                    }
                    this.S2 = null;
                    this.T2 = true;
                    qnVar.j8();
                }
                V();
                ff ffVar5 = this.A0;
                if (ffVar5 != null) {
                    ffVar5.setText(this.Q1);
                    ff ffVar6 = this.A0;
                    ffVar6.setSelection(ffVar6.length());
                }
                this.Q1 = null;
                this.T2 = this.R1;
                if (getVisibility() == 0) {
                    this.U2.c2();
                }
                H1(1);
            }
            G1(true);
            P1(true);
            E1();
            N1();
        }
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        TextPaint textPaint;
        M1();
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.e();
        }
        kg kgVar = this.g1;
        if (kgVar != null) {
            kgVar.a();
        }
        SlideTextView slideTextView = this.f1;
        if (slideTextView != null) {
            slideTextView.a();
        }
        ng ngVar = this.U0;
        if (ngVar != null && (textPaint = ngVar.x) != null) {
            textPaint.setColor(ngVar.B.h0(org.telegram.ui.ActionBar.f6.nf));
        }
        z61 z61Var = this.b1;
        if (z61Var != null) {
            z61Var.e.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
            z61Var.H = 0;
            x61 x61Var = z61Var.L;
            if (x61Var != null) {
                x61Var.b();
            }
        }
        NumberTextView numberTextView = this.U;
        if (numberTextView != null && this.A0 != null) {
            if (this.W - this.V < 0) {
                numberTextView.setTextColor(h0(org.telegram.ui.ActionBar.f6.p7));
            } else {
                numberTextView.setTextColor(h0(org.telegram.ui.ActionBar.f6.y6));
            }
        }
        Color.alpha(h0(org.telegram.ui.ActionBar.f6.bf));
        df dfVar = this.i0;
        if (dfVar != null) {
            dfVar.d.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ii, false));
            kg.d dVar = dfVar.r;
            if (dVar != null) {
                dVar.u();
            }
            dfVar.invalidate();
        }
        rf rfVar = this.C1;
        if (rfVar != null) {
            rfVar.e();
        }
        int h02 = this.W0 ? h0(org.telegram.ui.ActionBar.f6.Wk) : -1;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.X0.setColorFilter(new PorterDuffColorFilter(h02, mode));
        int i9 = org.telegram.ui.ActionBar.f6.Wk;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(h0(i9), mode);
        de deVar = this.M0;
        deVar.setColorFilter(porterDuffColorFilter);
        int i10 = org.telegram.ui.ActionBar.f6.i6;
        deVar.setBackground(org.telegram.ui.ActionBar.f6.f0(h0(i10), 1, -1));
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(h0(i9), mode);
        ImageView imageView = this.N0;
        imageView.setColorFilter(porterDuffColorFilter2);
        int h03 = h0(i10);
        float dp = AndroidUtilities.dp(19.0f);
        int dp2 = AndroidUtilities.dp(1.0f);
        int dp3 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.W(dp, h03, dp2, dp3, dp2, dp3));
        this.w1.setColorFilter(h0(org.telegram.ui.ActionBar.f6.hl), mode);
    }

    public final void d0(Canvas canvas, boolean z10) {
        if (this.t4) {
            int z11 = (int) e2.c.z(1.0f, this.x4, org.telegram.ui.ActionBar.f6.i3.getIntrinsicHeight(), this.O1);
            View view = this.B1;
            if (view != null && view.getVisibility() == 0) {
                z11 = (int) (((1.0f - getTopViewEnterProgress()) * this.B1.getLayoutParams().height) + z11);
            }
            int intrinsicHeight = org.telegram.ui.ActionBar.f6.i3.getIntrinsicHeight() + z11;
            if (z10) {
                org.telegram.ui.ActionBar.f6.i3.setAlpha((int) (this.x4 * 255.0f));
                org.telegram.ui.ActionBar.f6.i3.setBounds(0, z11, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.f6.i3.draw(canvas);
            }
            if (!this.s4) {
                float f10 = intrinsicHeight;
                float width = getWidth();
                float height = getHeight();
                org.telegram.ui.ActionBar.b6 b6Var = this.R3;
                Paint O = b6Var != null ? b6Var.O("paintChatComposeBackground") : null;
                if (O == null) {
                    O = org.telegram.ui.ActionBar.f6.S0("paintChatComposeBackground");
                }
                canvas.drawRect(0.0f, f10, width, height, O);
                return;
            }
            int h02 = h0(org.telegram.ui.ActionBar.f6.Sd);
            Paint paint = this.w4;
            paint.setColor(h02);
            if (!SharedConfig.chatBlurEnabled() || this.h1 == null) {
                canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint);
            } else {
                this.y4.set(0, intrinsicHeight, getWidth(), getHeight());
                this.h1.J(canvas, getTop(), this.y4, paint, false);
            }
        }
    }

    public final void d1(boolean z10, boolean z11) {
        og ogVar;
        ff ffVar;
        ae aeVar;
        de deVar = this.M0;
        if (deVar == null) {
            return;
        }
        if (this.r2 == 1 || ((aeVar = this.a1) != null && aeVar.getVisibility() == 0)) {
            this.h = 0.0f;
            this.n = 0.0f;
            F1();
            z11 = false;
        }
        og ogVar2 = og.f;
        og ogVar3 = og.e;
        if (!z10 || this.a2 != 0) {
            uf ufVar = this.Q0;
            int i9 = ufVar == null ? MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0) : ufVar.getCurrentPage();
            ogVar = (i9 == 0 || !((this.E2 || this.F2) && ((ffVar = this.A0) == null || TextUtils.isEmpty(ffVar.getText())))) ? ogVar3 : i9 == 1 ? og.c : ogVar2;
        } else if (!this.v0) {
            return;
        } else {
            ogVar = og.d;
        }
        if (!this.v0 && ogVar == ogVar3) {
            ogVar3 = ogVar2;
        } else if (this.b || ogVar == ogVar3) {
            ogVar3 = ogVar;
        }
        deVar.j(ogVar3, z11);
        if (ogVar3 == ogVar2 && this.Q0 == null) {
            MediaDataController.getInstance(this.M).loadRecents(0, true, true, false);
            ArrayList<String> arrayList = MessagesController.getInstance(this.M).gifSearchEmojies;
            int min = Math.min(10, arrayList.size());
            for (int i10 = 0; i10 < min; i10++) {
                Emoji.preloadEmoji(arrayList.get(i10));
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        oe oeVar;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat;
        double d;
        ge geVar;
        if (i9 == NotificationCenter.emojiLoaded) {
            uf ufVar = this.Q0;
            if (ufVar != null) {
                ufVar.L.f1();
            }
            rf rfVar = this.C1;
            if (rfVar != null) {
                ArrayList arrayList = rfVar.n;
                while (r4 < arrayList.size()) {
                    ((mh.m0) arrayList.get(r4)).invalidate();
                    r4++;
                }
            }
            ff ffVar = this.A0;
            if (ffVar != null) {
                ffVar.postInvalidate();
                this.A0.invalidateForce();
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.recordProgressChanged) {
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
        if (i9 == NotificationCenter.closeChats) {
            ff ffVar2 = this.A0;
            if (ffVar2 == null || !ffVar2.isFocused()) {
                return;
            }
            AndroidUtilities.hideKeyboard(this.A0);
            return;
        }
        int i11 = 5;
        if (i9 == NotificationCenter.recordStartError || i9 == NotificationCenter.recordStopped) {
            if (((Integer) objArr[0]).intValue() == this.B2 && this.A2) {
                this.A2 = false;
                if (i9 != NotificationCenter.recordStopped) {
                    L1(2, true);
                    return;
                }
                Integer num = (Integer) objArr[1];
                if (num.intValue() == 4) {
                    i11 = 4;
                } else if (this.Y0 && num.intValue() == 5) {
                    i11 = 1;
                } else if (num.intValue() != 0) {
                    i11 = num.intValue() == 6 ? 2 : 3;
                }
                if (i11 != 3) {
                    L1(i11, true);
                    return;
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.recordStarted) {
            if (((Integer) objArr[0]).intValue() != this.B2) {
                return;
            }
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            this.Y0 = !booleanValue;
            me meVar = this.X0;
            if (meVar != null) {
                meVar.j(booleanValue ? og.a : og.b, true);
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
            ng ngVar = this.U0;
            if (ngVar != null) {
                ngVar.a(this.e1);
            }
            kg kgVar = this.g1;
            if (kgVar != null) {
                kgVar.h = false;
                return;
            }
            return;
        }
        byte[] bArr = null;
        if (i9 == NotificationCenter.recordPaused) {
            this.A2 = false;
            this.W2 = null;
            this.Z2 = null;
            return;
        }
        if (i9 == NotificationCenter.recordResumed) {
            this.W2 = null;
            this.Z2 = null;
            ng ngVar2 = this.U0;
            if (ngVar2 != null) {
                ngVar2.a(this.e1);
            }
            J(true);
            this.A2 = true;
            L1(0, true);
            return;
        }
        if (i9 != NotificationCenter.audioDidSent) {
            if (i9 == NotificationCenter.audioRouteChanged) {
                Activity activity = this.J2;
                if (activity != null) {
                    activity.setVolumeControlStream(((Boolean) objArr[0]).booleanValue() ? 0 : TLObject.FLAG_31);
                    return;
                }
                return;
            }
            if (i9 == NotificationCenter.messagePlayingProgressDidChanged) {
                if (this.Y2 == null || !MediaController.getInstance().isPlayingMessage(this.Y2)) {
                    return;
                }
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                MessageObject messageObject = this.Y2;
                messageObject.audioProgress = playingMessageObject.audioProgress;
                messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                return;
            }
            if (i9 == NotificationCenter.featuredStickersDidLoad) {
                de deVar = this.M0;
                if (deVar != null) {
                    deVar.invalidate();
                    return;
                }
                return;
            }
            if (i9 == NotificationCenter.messageReceivedByServer2) {
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
            if (i9 == NotificationCenter.sendingMessagesChanged) {
                if (this.Y1 != null) {
                    S1();
                    return;
                }
                return;
            }
            if (i9 == NotificationCenter.audioRecordTooShort) {
                this.W2 = null;
                this.Z2 = null;
                L1(4, true);
                return;
            }
            if (i9 != NotificationCenter.updateBotMenuButton) {
                if (i9 == NotificationCenter.didUpdatePremiumGiftFieldIcon) {
                    I1(true);
                    return;
                } else {
                    if (i9 == NotificationCenter.currentUserPremiumStatusChanged && this.y1 && (oeVar = this.F0) != null) {
                        oeVar.setLocked(!UserConfig.getInstance(this.M).isPremium());
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
            z61 z61Var = this.b1;
            if (z61Var != null) {
                z61Var.setVideoPath(str);
                this.b1.setKeyframes(arrayList2);
                this.b1.setVisibility(0);
                this.b1.setMinProgressDiff(1000.0f / this.Z2.estimatedDuration);
                w0();
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
            eg egVar = this.U2;
            if (egVar != null) {
                egVar.y(null, true, 0, 0, 0L);
                return;
            }
            return;
        }
        W();
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
        int i12 = 0;
        while (true) {
            if (i12 >= this.W2.attributes.size()) {
                d = 0.0d;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = this.W2.attributes.get(i12);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                d = documentAttribute.duration;
                break;
            }
            i12++;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= this.W2.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute2 = this.W2.attributes.get(i13);
            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                byte[] bArr2 = documentAttribute2.waveform;
                if (bArr2 == null || bArr2.length == 0) {
                    documentAttribute2.waveform = MediaController.getWaveform(this.X2);
                }
                bArr = documentAttribute2.waveform;
            } else {
                i13++;
            }
        }
        if (z10 && (geVar = this.m1) != null) {
            this.q1 = 0.0f;
            geVar.setAlpha(0.0f);
            geVar.setScaleX(0.0f);
            geVar.setScaleY(0.0f);
        }
        this.e1 = (long) (1000.0d * d);
        vj0 vj0Var = this.d1;
        String str2 = this.X2;
        if (!vj0Var.M) {
            vj0Var.r = (float) d;
            vj0Var.s = floatValue;
            vj0Var.v = floatValue2;
            vj0Var.w = false;
            vj0Var.h.q(AndroidUtilities.formatDuration((int) Math.round(Math.max(1.0d, d)), false), false, true);
            vj0Var.f.a(false, false);
            if (vj0Var.n == null) {
                k61 k61Var = new k61();
                vj0Var.n = k61Var;
                k61Var.F = new n5.a0(vj0Var, 9);
            }
            vj0Var.n.E(Uri.fromFile(new File(str2)), "other");
            vj0Var.G = 0;
            vj0Var.H = bArr;
            vj0Var.invalidate();
        }
        J(false);
        if (z10) {
            X();
            Y();
            W();
            this.r2 = 1;
            this.I1.c(false);
            this.q3.set(this.I1, Float.valueOf(1.0f));
            ig igVar = this.J1;
            if (igVar != null) {
                igVar.setVisibility(0);
                this.J1.setAlpha(1.0f);
            }
        }
        L1(3, !z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        uf ufVar = this.Q0;
        if (ufVar == null || ufVar.getVisibility() != 0 || this.Q0.getStickersExpandOffset() == 0.0f) {
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
        ae aeVar = this.u1;
        boolean z10 = view == view2 || view == aeVar;
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.a5.e;
            canvas.save();
            if (view == aeVar) {
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

    @Override // org.telegram.ui.Components.sx0
    public final void e(bh.f fVar) {
        ff ffVar = this.A0;
        if (ffVar != null) {
            ffVar.addTextChangedListener(fVar);
            return;
        }
        if (this.C4 == null) {
            this.C4 = new ArrayList();
        }
        this.C4.add(fVar);
    }

    public final boolean e0(Canvas canvas, Utilities.Callback0Return callback0Return) {
        float f10;
        float f11;
        float f12;
        float f13;
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
            f10 = 255.0f;
            f11 = 16.0f;
            f12 = 0.0f;
            f13 = 5.0f;
            rectF.set(this.A0.getX() - AndroidUtilities.dp(5.0f), (this.A0.getY() + this.O1) - 1.0f, this.A0.getX() + this.A0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.A0.getY() + this.O1 + AndroidUtilities.dp(13.0f));
            matrix.reset();
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (e10 * 255.0f));
            canvas.drawRect(rectF, paint);
        } else {
            f10 = 255.0f;
            f11 = 16.0f;
            f12 = 0.0f;
            f13 = 5.0f;
        }
        if (e11 > f12) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(this.A0.getX() - AndroidUtilities.dp(f13), (this.A0.getY() + this.A0.getMeasuredHeight()) - AndroidUtilities.dp(15.0f), this.A0.getX() + this.A0.getMeasuredWidth() + AndroidUtilities.dp(f13), this.A0.getY() + this.A0.getMeasuredHeight() + AndroidUtilities.dp(2.0f) + 1.0f);
            matrix.reset();
            matrix.postScale(1.0f, rectF2.height() / f11);
            matrix.postRotate(180.0f);
            matrix.postTranslate(rectF2.left, rectF2.bottom);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (e11 * f10));
            canvas.drawRect(rectF2, paint);
        }
        canvas.restore();
        canvas.restore();
        return booleanValue;
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

    public final pf f0(MessageObject messageObject, boolean z10) {
        pf pfVar = new pf(messageObject.currentAccount, messageObject.messageOwner, true, true);
        if (z10) {
            ff ffVar = this.A0;
            CharSequence[] charSequenceArr = {ffVar == null ? "" : ffVar.getTextToUse()};
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.M).getEntities(charSequenceArr, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            MessageObject.addEntitiesToText(spannableStringBuilder, entities, true, true, false, true);
            pfVar.caption = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, org.telegram.ui.ActionBar.f6.o2.getFontMetricsInt(), false, (int[]) null), entities, org.telegram.ui.ActionBar.f6.o2.getFontMetricsInt());
        }
        return pfVar;
    }

    public final void f1(CharSequence charSequence, boolean z10) {
        ff ffVar = this.A0;
        if (ffVar == null) {
            return;
        }
        this.M2 = true;
        ffVar.setText(charSequence);
        this.A0.invalidateQuotes(true);
        ff ffVar2 = this.A0;
        ffVar2.setSelection(ffVar2.getText().length());
        this.M2 = false;
        eg egVar = this.U2;
        if (egVar != null) {
            egVar.b1(this.A0.getText(), true, z10);
        }
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

    public mh.v3 getBotWebViewButton() {
        if (this.g0 == null) {
            Context context = getContext();
            mh.v3 v3Var = new mh.v3(context);
            v3Var.a = new Path();
            v3Var.c = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            v3Var.addView(textView, g7.e6.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(AndroidUtilities.dp(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            v3Var.addView(radialProgressView, g7.e6.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false), 2, -1));
            v3Var.addView(view, g7.e6.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            v3Var.setWillNotDraw(false);
            this.g0 = v3Var;
            v3Var.setVisibility(8);
            Q();
            this.g0.setBotMenuButton(this.h0);
            this.t1.addView(this.g0, g7.e6.e(-1, -1, 80));
        }
        return this.g0;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public int getCursorPosition() {
        ff ffVar = this.A0;
        if (ffVar == null) {
            return 0;
        }
        return ffVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.U1 != null) {
            if (TextUtils.isEmpty(this.Q1)) {
                return null;
            }
            return this.Q1;
        }
        if (this.A0 == null || !j0()) {
            return null;
        }
        return this.A0.getText();
    }

    @Override // org.telegram.ui.Components.sx0
    public Editable getEditText() {
        ff ffVar = this.A0;
        if (ffVar == null) {
            return null;
        }
        return ffVar.getText();
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

    public wy getEmojiView() {
        return this.Q0;
    }

    public float getExitTransition() {
        return this.h4;
    }

    @Override // org.telegram.ui.Components.sx0
    public CharSequence getFieldText() {
        if (this.A0 == null || !j0()) {
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
        org.telegram.ui.qn qnVar = this.K2;
        int forwardedMessagesCount = (qnVar == null || (messagePreviewParams = qnVar.b5) == null) ? 0 : messagePreviewParams.getForwardedMessagesCount();
        ff ffVar = this.A0;
        if (ffVar == null || TextUtils.isEmpty(ffVar.getText())) {
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
        ff ffVar = this.A0;
        if (ffVar == null) {
            return 0;
        }
        try {
            return ffVar.getSelectionEnd() - this.A0.getSelectionStart();
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
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar != null) {
            return qnVar.c5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar != null) {
            return qnVar.N8();
        }
        return 0L;
    }

    public fo0 getSenderSelectView() {
        return this.l0;
    }

    public xu0 getSizeNotifierLayout() {
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
        org.telegram.ui.qn qnVar = this.K2;
        return qnVar != null ? qnVar.getMessagesController().getSendPaidMessagesStars(qnVar.a()) : MessagesController.getInstance(this.M).getSendPaidMessagesStars(this.L2);
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

    public t31 getTrendingStickersAlert() {
        return this.V2;
    }

    public int getVisibleEmojiPadding() {
        if (this.S0) {
            return this.v2;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f10 = this.O1;
        View view = this.B1;
        if (view != null && view.getVisibility() == 0) {
            f10 += (1.0f - getTopViewEnterProgress()) * this.B1.getLayoutParams().height;
        }
        return getMeasuredHeight() - f10;
    }

    public final int h0(int i9) {
        org.telegram.ui.ActionBar.b6 b6Var = this.R3;
        return b6Var != null ? b6Var.N0(i9) : org.telegram.ui.ActionBar.f6.w0(null, i9, false);
    }

    public void h1(float f10, float f11, float f12, boolean z10) {
        int dp;
        float f13 = 1.0f - f12;
        float f14 = f10 * f13;
        float f15 = f11 * f13;
        this.r = (f12 * 0.5f) + 0.5f;
        this.s = f12;
        F1();
        float f16 = -f14;
        this.M0.setTranslationX(f16);
        if (this.A0 == null) {
            dp = 0;
        } else {
            int dp2 = AndroidUtilities.dp(40.0f);
            fo0 fo0Var = this.l0;
            dp = dp2 + ((fo0Var == null || fo0Var.getVisibility() != 0) ? 0 : AndroidUtilities.dp(18.0f));
        }
        this.D = f16 - (dp * f13);
        pi0 pi0Var = this.c1;
        if (pi0Var != null) {
            pi0Var.setTranslationX(f16);
        }
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f15);
        }
        ig igVar = this.J1;
        if (igVar != null) {
            igVar.setTranslationX(f15);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f16);
        }
        ae aeVar = this.v1;
        aeVar.setTranslationX(f15);
        aeVar.setAlpha(f12);
        ImageView imageView = this.r1;
        if (imageView != null) {
            imageView.setAlpha(imageView.getScaleX() > 0.7f ? f12 : 0.0f);
        }
        boolean z11 = true;
        if (z10 && f12 != 1.0f) {
            z11 = false;
        }
        this.F = z11;
        this.y = f15;
        this.B = f12;
        A1();
        J1();
        float f17 = f14 * f13;
        if (this.E != f17) {
            this.E = f17;
            vj0 vj0Var = this.d1;
            if (vj0Var != null) {
                vj0Var.setTranslationX(f17);
                this.d1.invalidate();
            }
        }
        if (this.A0 != null) {
            float lerp = AndroidUtilities.lerp(0.88f, 1.0f, f12);
            this.A0.setPivotX(0.0f);
            this.A0.setPivotY(r9.getMeasuredHeight() / 2.0f);
            this.A0.setScaleX(lerp);
            this.A0.setScaleY(lerp);
            this.A0.setHintRightOffset(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f12));
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i0() {
        return this.h5 == 3;
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
        ff ffVar = this.A0;
        return ffVar != null && ffVar.length() > 0;
    }

    public final void j1(CharSequence charSequence, boolean z10) {
        this.e = charSequence;
        this.f = null;
        G1(z10);
    }

    public final void k0() {
        kh.x3 x3Var = this.J;
        if (x3Var != null) {
            x3Var.e(true);
        }
        kh.x3 x3Var2 = this.H;
        if (x3Var2 != null) {
            x3Var2.e(true);
        }
    }

    public final void k1(boolean z10, boolean z11) {
        me meVar = this.X0;
        if (meVar == null) {
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
        meVar.j(this.Y0 ? og.b : og.a, z11);
        meVar.setContentDescription(LocaleController.getString(this.Y0 ? R.string.AccDescrVideoMessage : R.string.AccDescrVoiceMessage));
        this.V0.setContentDescription(LocaleController.getString(this.Y0 ? R.string.AccDescrVideoMessage : R.string.AccDescrVoiceMessage));
        meVar.sendAccessibilityEvent(8);
    }

    public final void l0(boolean z10) {
        m0(z10, false, true);
    }

    public final void l1(MessageObject messageObject, org.telegram.ui.gn gnVar, MessageObject messageObject2) {
        MessageObject messageObject3;
        org.telegram.ui.qn qnVar = this.K2;
        boolean z10 = (qnVar == null || !qnVar.v9() || this.P2 == messageObject2) ? false : true;
        if (messageObject != null) {
            if (this.R2 == null && (messageObject3 = this.h2) != this.O2) {
                this.R2 = messageObject3;
            }
            this.O2 = messageObject;
            this.Q2 = gnVar;
            this.P2 = messageObject2;
            if (qnVar == null || !qnVar.d4 || qnVar.T3 != messageObject) {
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
        eg egVar = this.U2;
        MediaController.getInstance().setReplyingMessage(messageObject, getThreadMessage(), egVar != null ? egVar.P0() : null);
        G1(z10);
    }

    public final boolean m0(boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (s0()) {
            if (this.a2 == 1 && (tL_replyKeyboardMarkup = this.i2) != null && z10 && this.h2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    MessagesController.getMainSettings(this.M).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.h2.getId()).apply();
                }
            }
            if ((z10 && this.M1 != 0) || z11) {
                m1(0, true);
                uf ufVar = this.Q0;
                if (ufVar != null) {
                    ufVar.t(true);
                }
                ff ffVar = this.A0;
                if (ffVar != null) {
                    ffVar.requestFocus();
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
                ff ffVar2 = this.A0;
                if (ffVar2 != null) {
                    ffVar2.requestFocus();
                }
            }
            return true;
        }
        return false;
    }

    public final void m1(int i9, boolean z10) {
        boolean z11 = i9 != 0;
        if (z11 != (this.M1 != 0)) {
            ValueAnimator valueAnimator = this.r0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.r0.cancel();
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s0, z11 ? 1.0f : 0.0f);
                this.r0 = ofFloat;
                ofFloat.addUpdateListener(new fd(this, 4));
                this.r0.addListener(new te(this, z11, 3));
                this.r0.setDuration(220L);
                this.r0.setInterpolator(gr.f);
                this.r0.start();
            } else {
                this.s0 = z11 ? 1.0f : 0.0f;
                uf ufVar = this.Q0;
                if (ufVar != null) {
                    ufVar.Z();
                }
            }
        }
        this.M1 = i9;
    }

    public final void n(TLRPC.Document document) {
        MediaDataController.getInstance(this.M).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
        uf ufVar = this.Q0;
        if (ufVar == null || document == null) {
            return;
        }
        boolean isEmpty = ufVar.e1.isEmpty();
        ufVar.X();
        if (isEmpty) {
            ufVar.Y(false);
        }
    }

    public final void n0(boolean z10) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.p2;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.X2 = null;
            this.W2 = null;
            this.Y2 = null;
            this.Z2 = null;
            z61 z61Var = this.b1;
            int i9 = 1;
            if (z61Var != null) {
                z61Var.a(true);
            }
            me meVar = this.X0;
            if (meVar != null) {
                meVar.setVisibility(0);
            }
            zd zdVar = this.Y3;
            zd zdVar2 = this.U3;
            zd zdVar3 = this.W3;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            de deVar = this.M0;
            Property property3 = View.ALPHA;
            ge geVar = this.m1;
            if (z10) {
                if (geVar != null) {
                    this.q1 = 0.0f;
                    geVar.setAlpha(0.0f);
                    geVar.setScaleX(0.0f);
                    geVar.setScaleY(0.0f);
                }
                this.n = 0.0f;
                this.h = 0.0f;
                F1();
                this.p2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(deVar, zdVar3, this.w0 ? 0.5f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(deVar, zdVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.c1, (Property<pi0, Float>) property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.c1, (Property<pi0, Float>) property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.c1, (Property<pi0, Float>) property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.a1, (Property<ae, Float>) property3, 0.0f));
                if (geVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.l1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.l1 = null;
                    }
                    this.q1 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.A0, (Property<ff, Float>) property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.A0, zdVar, 0.0f));
                ig igVar = this.J1;
                if (igVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(igVar, (Property<ig, Float>) property3, 0.0f));
                    this.J1.a();
                }
                this.p2.playTogether(arrayList);
                mh.c0 c0Var = this.h0;
                if (c0Var != null) {
                    c0Var.setAlpha(0.0f);
                    this.h0.setScaleY(0.0f);
                    this.h0.setScaleX(0.0f);
                    this.p2.playTogether(ObjectAnimator.ofFloat(this.h0, (Property<mh.c0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.h0, (Property<mh.c0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.h0, (Property<mh.c0, Float>) property, 1.0f));
                }
                this.p2.setDuration(150L);
                this.p2.addListener(new pe(this, i9));
            } else {
                pi0 pi0Var = this.c1;
                if (pi0Var != null) {
                    pi0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = this.Y0;
                Property property4 = View.TRANSLATION_X;
                if (z11) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.b1, (Property<z61, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.b1, (Property<z61, Float>) property4, -AndroidUtilities.dp(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.A0, zdVar, 0.0f));
                    ig igVar2 = this.J1;
                    if (igVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(igVar2, (Property<ig, Float>) property3, 0.0f));
                        this.J1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.A0, (Property<ff, Float>) property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A0, (Property<ff, Float>) property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    ff ffVar = this.A0;
                    if (ffVar == null || this.s != 1.0f) {
                        this.C = 0.0f;
                        J1();
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.A0, (Property<ff, Float>) property3, 1.0f);
                        ofFloat2.setStartDelay(750L);
                        ofFloat2.setDuration(200L);
                        animatorSet3.playTogether(ofFloat2);
                    } else {
                        ffVar.setAlpha(1.0f);
                        this.C = 0.0f;
                        J1();
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(this.d1, (Property<vj0, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.d1, (Property<vj0, Float>) property4, -AndroidUtilities.dp(20.0f)));
                    ig igVar3 = this.J1;
                    if (igVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(igVar3, (Property<ig, Float>) property3, 0.0f));
                        this.J1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (geVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.l1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.l1 = null;
                    }
                    this.q1 = 0.0f;
                    geVar.setAlpha(0.0f);
                    geVar.setScaleX(0.0f);
                    geVar.setScaleY(0.0f);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.q1 = 1.0f;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property3, 1.0f), ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property2, 1.0f), ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property, 1.0f));
                    animatorSet4.setDuration(150L);
                    animatorSet = animatorSet4;
                } else {
                    animatorSet = null;
                }
                this.h = 0.0f;
                this.n = 0.0f;
                F1();
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playTogether(ObjectAnimator.ofFloat(this.c1, (Property<pi0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.c1, (Property<pi0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.c1, (Property<pi0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.c1, (Property<pi0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(deVar, zdVar3, this.w0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(deVar, zdVar2, 1.0f));
                mh.c0 c0Var2 = this.h0;
                if (c0Var2 != null) {
                    c0Var2.setAlpha(0.0f);
                    this.h0.setScaleY(0.0f);
                    this.h0.setScaleX(0.0f);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.h0, (Property<mh.c0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.h0, (Property<mh.c0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.h0, (Property<mh.c0, Float>) property, 1.0f));
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
                this.p2.addListener(new jf(this));
            }
            AnimatorSet animatorSet7 = this.p2;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            ig igVar4 = this.J1;
            if (igVar4 != null) {
                igVar4.invalidate();
            }
        }
    }

    public final void n1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i9 = 1;
        org.telegram.ui.ActionBar.q1 q1Var = this.Q;
        if ((q1Var != null && q1Var.f) || this.g3 || this.Q0 == null) {
            return;
        }
        if (z12 || this.u3 != z10) {
            this.u3 = z10;
            eg egVar = this.U2;
            if (egVar != null) {
                egVar.j1();
            }
            Point point = AndroidUtilities.displaySize;
            final int i10 = point.x > point.y ? this.t2 : this.s2;
            AnimatorSet animatorSet = this.w3;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.w3 = null;
            }
            boolean z14 = this.u3;
            AnimationNotificationsLocker animationNotificationsLocker = this.G3;
            org.telegram.ui.Cells.c1 c1Var = this.o3;
            final int i11 = 0;
            xu0 xu0Var = this.h1;
            if (z14) {
                if (z13) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
                }
                int height = xu0Var.getHeight();
                this.j1 = height;
                int dp = ((((height - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
                this.y3 = dp;
                if (this.M1 == 2) {
                    this.y3 = Math.min(dp, AndroidUtilities.dp(175.0f) + i10);
                }
                if (this.Y4 == null) {
                    this.Q0.getLayoutParams().height = this.y3;
                }
                xu0Var.requestLayout();
                if (this.t4) {
                    xu0Var.setForeground(new vc(this));
                }
                ff ffVar = this.A0;
                if (ffVar != null) {
                    int selectionStart = ffVar.getSelectionStart();
                    int selectionEnd = this.A0.getSelectionEnd();
                    ff ffVar2 = this.A0;
                    ffVar2.setText(ffVar2.getText());
                    this.A0.setSelection(selectionStart, selectionEnd);
                }
                if (z11) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    if (this.Y4 != null) {
                        animatorSet2.playTogether(ValueAnimator.ofInt(-(this.y3 - i10)), ValueAnimator.ofInt(-(this.y3 - i10)), ObjectAnimator.ofFloat(this.A3, "animationProgress", 1.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofInt(this, c1Var, -(this.y3 - i10)), ObjectAnimator.ofInt(this.Q0, c1Var, -(this.y3 - i10)), ObjectAnimator.ofFloat(this.A3, "animationProgress", 1.0f));
                    }
                    animatorSet2.setDuration(300L);
                    animatorSet2.setInterpolator(gr.f);
                    if (this.Y4 == null) {
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
                                        int i14 = ChatActivityEnterView.i5;
                                        chatActivityEnterView.x3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.y3 - i13)));
                                        chatActivityEnterView.h1.invalidate();
                                        break;
                                    default:
                                        int i15 = ChatActivityEnterView.i5;
                                        chatActivityEnterView.x3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.y3 - i13));
                                        chatActivityEnterView.h1.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet2.addListener(new pe(this, 12));
                    this.w3 = animatorSet2;
                    this.Q0.setLayerType(2, null);
                    animationNotificationsLocker.lock();
                    this.x3 = 0.0f;
                    xu0Var.invalidate();
                    animatorSet2.start();
                } else {
                    this.x3 = 1.0f;
                    if (this.Y4 == null) {
                        setTranslationY(-(this.y3 - i10));
                        this.Q0.setTranslationY(-(this.y3 - i10));
                    }
                    AnimatedArrowDrawable animatedArrowDrawable = this.A3;
                    if (animatedArrowDrawable != null) {
                        animatedArrowDrawable.setAnimationProgress(1.0f);
                    }
                }
                xg.f fVar = this.Y4;
                if (fVar != null) {
                    ((xg.i) fVar).g(this.y3);
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
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, c1Var, 0), ObjectAnimator.ofInt(this.Q0, c1Var, 0), ObjectAnimator.ofFloat(this.A3, "animationProgress", 0.0f));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(gr.f);
                    if (this.Y4 == null) {
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.nd
                            public final /* synthetic */ ChatActivityEnterView b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i12 = i9;
                                int i13 = i10;
                                ChatActivityEnterView chatActivityEnterView = this.b;
                                switch (i12) {
                                    case 0:
                                        int i14 = ChatActivityEnterView.i5;
                                        chatActivityEnterView.x3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.y3 - i13)));
                                        chatActivityEnterView.h1.invalidate();
                                        break;
                                    default:
                                        int i15 = ChatActivityEnterView.i5;
                                        chatActivityEnterView.x3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.y3 - i13));
                                        chatActivityEnterView.h1.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet3.addListener(new yf(this, i10, i9));
                    this.x3 = 1.0f;
                    xu0Var.invalidate();
                    this.w3 = animatorSet3;
                    this.Q0.setLayerType(2, null);
                    animationNotificationsLocker.lock();
                    animatorSet3.start();
                } else {
                    this.x3 = 0.0f;
                    if (this.Y4 == null) {
                        setTranslationY(0.0f);
                        this.Q0.setTranslationY(0.0f);
                        this.Q0.getLayoutParams().height = i10;
                    }
                    xu0Var.requestLayout();
                    xu0Var.setForeground(null);
                    xu0Var.setWillNotDraw(false);
                    AnimatedArrowDrawable animatedArrowDrawable2 = this.A3;
                    if (animatedArrowDrawable2 != null) {
                        animatedArrowDrawable2.setAnimationProgress(0.0f);
                    }
                }
                xg.f fVar2 = this.Y4;
                if (fVar2 != null) {
                    ((xg.i) fVar2).g(i10);
                }
            }
            se seVar = this.O0;
            if (seVar != null) {
                if (this.u3) {
                    seVar.setContentDescription(LocaleController.getString("AccDescrCollapsePanel", R.string.AccDescrCollapsePanel));
                } else {
                    seVar.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
                }
            }
        }
    }

    public final void o(TLRPC.Document document) {
        T();
        uf ufVar = this.Q0;
        int i9 = ufVar.Y0;
        MediaDataController.getInstance(i9).addRecentSticker(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = ufVar.f1.isEmpty();
        ufVar.f1 = MediaDataController.getInstance(i9).getRecentStickers(0, true);
        ny nyVar = ufVar.u0;
        if (nyVar != null) {
            nyVar.l();
        }
        if (isEmpty) {
            ufVar.Y(false);
        }
    }

    public final void o0() {
        this.X2 = null;
        this.W2 = null;
        this.Y2 = null;
        this.Z2 = null;
        z61 z61Var = this.b1;
        if (z61Var != null) {
            z61Var.a(true);
        }
        vj0 vj0Var = this.d1;
        if (vj0Var != null) {
            vj0Var.setAlpha(1.0f);
            this.d1.setTranslationX(0.0f);
        }
        z61 z61Var2 = this.b1;
        if (z61Var2 != null) {
            z61Var2.setAlpha(1.0f);
            this.b1.setTranslationX(0.0f);
        }
        ff ffVar = this.A0;
        if (ffVar != null) {
            ffVar.setAlpha(1.0f);
            this.C = 0.0f;
            J1();
            this.A0.requestFocus();
        }
        ae aeVar = this.a1;
        if (aeVar != null) {
            aeVar.setVisibility(8);
        }
        w0();
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
                this.r1.setColorFilter(new PorterDuffColorFilter(h0(org.telegram.ui.ActionBar.f6.Wk), PorterDuff.Mode.MULTIPLY));
                this.r1.setImageResource(R.drawable.input_suggest_paid_24);
                this.r1.setBackground(org.telegram.ui.ActionBar.f6.f0(h0(org.telegram.ui.ActionBar.f6.i6), 1, -1));
                if (this.g5) {
                    this.r1.setTranslationX(AndroidUtilities.dp(42.0f));
                    this.u1.addView(this.r1, g7.e6.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                } else {
                    this.k1.addView(this.r1, 0, g7.e6.n(44, 44));
                }
                this.r1.setOnClickListener(new jd(this, 19));
                this.r1.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
            }
        }
        boolean z12 = this.q4 != z10;
        this.q4 = z10;
        float f10 = z10 ? 1.0f : 0.6f;
        float f11 = z10 ? 1.0f : 0.0f;
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
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r1.getAlpha(), f11);
            this.r4 = ofFloat;
            ofFloat.addUpdateListener(new fd(this, 7));
            this.r4.addListener(new te(this, z10, r2));
            this.r4.setDuration(220L);
            this.r4.setInterpolator(gr.h);
            this.r4.start();
        } else {
            this.r1.setScaleX(f10);
            this.r1.setScaleY(f10);
            this.r1.setAlpha(f11);
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
        ve veVar = this.m0;
        if (veVar != null) {
            veVar.e = false;
            veVar.dismiss();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        d0(canvas, true);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View findChildViewUnder;
        if (this.A2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (findChildViewUnder = AndroidUtilities.findChildViewUnder(this, motionEvent.getX(), motionEvent.getY())) != this.H && findChildViewUnder != this.I) {
            k0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        df dfVar;
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.Q4 == -1 || (dfVar = this.i0) == null) {
            return;
        }
        f2.m0 m0Var = (f2.m0) dfVar.c.getLayoutManager();
        if (m0Var != null) {
            m0Var.h1(this.Q4, this.R4);
        }
        this.Q4 = -1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        ae aeVar = this.u1;
        int measuredHeight = aeVar.getMeasuredHeight();
        mh.c0 c0Var = this.h0;
        ImageView imageView = this.N0;
        de deVar = this.M0;
        int i11 = 0;
        if (c0Var == null || c0Var.getTag() == null) {
            fo0 fo0Var = this.l0;
            if (fo0Var == null || fo0Var.getVisibility() != 0) {
                ((ViewGroup.MarginLayoutParams) deVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                }
                ff ffVar = this.A0;
                if (ffVar != null) {
                    ((ViewGroup.MarginLayoutParams) ffVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
                RichMessageLayout.PreviewView previewView = this.x1;
                if (previewView != null) {
                    ((ViewGroup.MarginLayoutParams) previewView.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
            } else {
                int i12 = this.l0.getLayoutParams().width;
                this.l0.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.l0.getLayoutParams().height, TLObject.FLAG_30));
                ((ViewGroup.MarginLayoutParams) deVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i12;
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i12;
                }
                ff ffVar2 = this.A0;
                if (ffVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) ffVar2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i12;
                }
                RichMessageLayout.PreviewView previewView2 = this.x1;
                if (previewView2 != null) {
                    ((ViewGroup.MarginLayoutParams) previewView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i12;
                }
            }
        } else {
            this.h0.measure(i9, i10);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) deVar.getLayoutParams();
            int dp = AndroidUtilities.dp(10.0f);
            mh.c0 c0Var2 = this.h0;
            marginLayoutParams.leftMargin = dp + (c0Var2 == null ? 0 : c0Var2.getMeasuredWidth());
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int dp2 = AndroidUtilities.dp(10.0f);
                mh.c0 c0Var3 = this.h0;
                marginLayoutParams2.leftMargin = dp2 + (c0Var3 == null ? 0 : c0Var3.getMeasuredWidth());
            }
            ff ffVar3 = this.A0;
            if (ffVar3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) ffVar3.getLayoutParams();
                int dp3 = AndroidUtilities.dp(57.0f);
                mh.c0 c0Var4 = this.h0;
                marginLayoutParams3.leftMargin = dp3 + (c0Var4 == null ? 0 : c0Var4.getMeasuredWidth());
            }
            RichMessageLayout.PreviewView previewView3 = this.x1;
            if (previewView3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) previewView3.getLayoutParams();
                int dp4 = AndroidUtilities.dp(57.0f);
                mh.c0 c0Var5 = this.h0;
                marginLayoutParams4.leftMargin = dp4 + (c0Var5 == null ? 0 : c0Var5.getMeasuredWidth());
            }
        }
        C1();
        super.onMeasure(i9, i10);
        mh.v3 v3Var = this.g0;
        if (v3Var != null) {
            mh.c0 c0Var6 = this.h0;
            if (c0Var6 != null) {
                v3Var.setMeasuredButtonWidth(c0Var6.getMeasuredWidth());
            }
            this.g0.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(2.0f);
            measureChild(this.g0, i9, i10);
        }
        L();
        M();
        if (measuredHeight <= 0 || aeVar.getMeasuredHeight() == measuredHeight) {
            return;
        }
        while (i11 < 2) {
            ImageView imageView2 = i11 == 0 ? this.o1 : this.p1;
            imageView2.setTranslationY((imageView2.getTranslationY() + aeVar.getMeasuredHeight()) - measuredHeight);
            imageView2.animate().translationY(0.0f).setInterpolator(gr.h).setDuration(420L).start();
            i11++;
        }
        kh.x3 x3Var = this.I;
        if (x3Var != null) {
            x3Var.setTranslationY((x3Var.getTranslationY() + aeVar.getMeasuredHeight()) - measuredHeight);
            org.telegram.messenger.ll.r(this.I.animate().translationY(0.0f), gr.h, 420L);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (i9 != i11 && this.u3) {
            m1(0, false);
            this.Q0.t(false);
            n1(false, false, false, true);
        }
        z61 z61Var = this.b1;
        if (z61Var != null) {
            ArrayList arrayList = z61Var.v;
            if (z61Var.J.isEmpty()) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i13);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            w61 w61Var = z61Var.w;
            if (w61Var != null) {
                w61Var.cancel(true);
                z61Var.w = null;
            }
            z61Var.invalidate();
        }
    }

    public final ValueAnimator p(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E1.a, f10);
        ofFloat.addUpdateListener(new fd(this, 5));
        return ofFloat;
    }

    public void p0(boolean z10) {
        if (this.B1 == null || !this.a3) {
            return;
        }
        hd hdVar = this.R;
        if (hdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(hdVar);
        }
        this.a3 = false;
        this.b3 = false;
        if (this.c3) {
            this.b5.a(false, z10);
        }
    }

    public final void p1(boolean z10) {
        org.telegram.ui.qn qnVar;
        boolean z11 = ((!z10 && !this.y1) || (qnVar = this.K2) == null || qnVar.w()) ? false : true;
        if (this.F4 == z11) {
            return;
        }
        if (z11) {
            MessagesController.getInstance(this.M).getTonesController().load();
        }
        this.F4 = z11;
        ImageView imageView = this.o1;
        imageView.setVisibility(0);
        imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(gr.h).setDuration(420L).withEndAction(new od(this, z11, 0)).start();
        if (!z11) {
            kh.x3 x3Var = this.I;
            if (x3Var != null) {
                x3Var.e(true);
                this.I = null;
                return;
            }
            return;
        }
        i0 i0Var = this.n1;
        Objects.requireNonNull(i0Var);
        imageView.postDelayed(new h0(i0Var, 1), 220L);
        kh.x3 x3Var2 = this.I;
        if (x3Var2 != null) {
            x3Var2.e(true);
            this.I = null;
        }
        if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
            kh.x3 x3Var3 = new kh.x3(getContext(), 3);
            this.I = x3Var3;
            x3Var3.q(true);
            this.I.t(LocaleController.getString(R.string.AIEditorHint));
            this.I.n(0.0f, (imageView.getWidth() / 2.0f) + AndroidUtilities.dp(4.0f));
            addView(this.I, g7.e6.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
            kh.x3 x3Var4 = this.I;
            x3Var4.h0 = new org.telegram.ui.wq(8, this, x3Var3);
            x3Var4.d = 4000L;
            x3Var4.v();
            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
        }
    }

    public final ValueAnimator q(boolean z10) {
        final float alpha = getSendButtonInternal().getAlpha();
        final float f10 = z10 ? 1.0f : 0.0f;
        final float scaleX = getSendButtonInternal().getScaleX();
        final float f11 = z10 ? 1.0f : 0.1f;
        final float scaleY = getSendButtonInternal().getScaleY();
        final float f12 = z10 ? 1.0f : 0.1f;
        if (z10 && alpha < 0.25f && (getSendButtonInternal() instanceof lg)) {
            lg lgVar = (lg) getSendButtonInternal();
            lgVar.a0.d(0.0f, true);
            lgVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.rd
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i9 = ChatActivityEnterView.i5;
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.getSendButtonInternal().setAlpha(AndroidUtilities.lerp(alpha, f10, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleX(AndroidUtilities.lerp(scaleX, f11, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleY(AndroidUtilities.lerp(scaleY, f12, floatValue));
            }
        });
        return ofFloat;
    }

    public final boolean q0() {
        return this.U1 != null;
    }

    public final void q1() {
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar == null || !ChatObject.isChannelAndNotMegaGroup(qnVar.e)) {
            return;
        }
        oc.a0(qnVar).f(MessagesController.getInstance(this.M).captionLengthLimitPremium, new hd(this, 0)).j();
    }

    public final boolean r0() {
        return this.Y0;
    }

    public boolean r1(Runnable runnable) {
        return false;
    }

    public final void s(SendMessagesHelper.SendMessageParams sendMessageParams) {
        eg egVar = this.U2;
        if (egVar != null) {
            sendMessageParams.replyToStoryItem = egVar.P0();
            sendMessageParams.replyQuote = this.U2.T();
        }
    }

    public final boolean s0() {
        return this.S0 || this.T0;
    }

    public final void s1() {
        t1(1, 0, true, true);
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.q1 q1Var) {
        this.Q = q1Var;
    }

    public void setAnimatedTop(int i9) {
        this.O1 = i9;
    }

    public void setBotInfo(a0.h hVar) {
        X0(hVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f10) {
        this.M0.setTranslationX(f10);
        if (this.A0 != null) {
            this.C = f10;
            J1();
        }
        this.m1.setTranslationX(this.y + this.x + f10);
        this.X0.setTranslationX(f10);
        se seVar = this.s1;
        if (seVar != null) {
            seVar.setTranslationX(f10);
        }
    }

    public void setButtons(MessageObject messageObject) {
        Z0(messageObject, true, true);
    }

    public void setCaption(String str) {
        ff ffVar = this.A0;
        if (ffVar != null) {
            ffVar.setCaption(str);
            J(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.Y1 = chatFull;
        uf ufVar = this.Q0;
        if (ufVar != null) {
            ufVar.setChatInfo(chatFull);
        }
        mg mgVar = this.B0;
        if (mgVar != null) {
            mgVar.e = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chatFull);
            mgVar.invalidate();
        }
        if (ChatObject.isIgnoredChatRestrictionsForBoosters(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f10) {
        this.x4 = f10;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.E4 = view;
        this.A0.setWindowView(view);
    }

    public void setDelegate(eg egVar) {
        this.U2 = egVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.W1 = tL_businessChatLink;
        G1(false);
        if (this.W1 != null) {
            S(true);
            this.A1.setOnClickListener(new jd(this, 3));
            this.A1.setContentDescription(LocaleController.getString(R.string.Done));
            this.A1.setVisibility(0);
            this.A1.setScaleX(0.1f);
            this.A1.setScaleY(0.1f);
            this.A1.setAlpha(0.0f);
            this.A1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(gr.f).start();
            this.V = this.N.getMessagesController().getMaxMessageLength();
            ff ffVar = this.A0;
            TextPaint paint = ffVar != null ? ffVar.getPaint() : null;
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
            gh.m mVar = this.k1;
            if (mVar != null) {
                mVar.setVisibility(8);
            }
            ge geVar = this.m1;
            if (geVar != null) {
                this.q1 = 0.0f;
                geVar.setAlpha(0.0f);
                geVar.setScaleX(0.5f);
                geVar.setScaleY(0.5f);
            }
            this.v1.setVisibility(8);
            qe qeVar = this.E1;
            if (qeVar != null) {
                qeVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j10) {
        this.N4 = j10;
        oe oeVar = this.F0;
        if (oeVar != null) {
            oeVar.setEffect(j10);
        }
    }

    public void setExitTransition(float f10) {
        this.h4 = f10;
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
            hd hdVar = new hd(this, 5);
            this.N1 = hdVar;
            AndroidUtilities.runOnUIThread(hdVar, 600L);
            return;
        }
        ff ffVar = this.A0;
        if (ffVar == null || !ffVar.isFocused()) {
            return;
        }
        if (!this.u2 || this.e2) {
            this.A0.clearFocus();
        }
    }

    @Override // org.telegram.ui.Components.sx0
    public void setFieldText(CharSequence charSequence) {
        f1(charSequence, false);
    }

    public void setInAppInsetsController(xg.f fVar) {
        this.Y4 = fVar;
    }

    public void setLockAnimatedTranslation(float f10) {
        this.g4 = f10;
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new md(this, 0);
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

    public void setSelection(int i9) {
        ff ffVar = this.A0;
        if (ffVar == null) {
            return;
        }
        ffVar.setSelection(i9, ffVar.length());
    }

    public void setSideButtonsForAttach(rg.g gVar) {
        this.Z4 = gVar;
    }

    public void setSlideToCancelProgress(float f10) {
        this.e4 = f10;
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

    public void setSlowModeTimer(int i9) {
        this.C0 = i9;
        S1();
    }

    public void setSnapAnimationProgress(float f10) {
        this.i4 = f10;
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
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        boolean z10 = i9 == 0;
        this.D4 = z10;
        ff ffVar = this.A0;
        if (ffVar != null) {
            ffVar.setEnabled(z10);
        }
    }

    public void setVoiceDraft(MediaDataController.DraftVoice draftVoice) {
        if (draftVoice == null) {
            return;
        }
        boolean z10 = draftVoice.once;
        this.K = z10;
        ig igVar = this.J1;
        if (igVar != null) {
            igVar.y.d(1, z10, true);
        }
        eg egVar = this.U2;
        TL_stories.StoryItem P0 = egVar != null ? egVar.P0() : null;
        MediaController mediaController = MediaController.getInstance();
        int i9 = this.M;
        long j10 = this.L2;
        MessageObject messageObject = this.O2;
        MessageObject threadMessage = getThreadMessage();
        SendMessageChatArguments sendMessageChatArguments = null;
        int i10 = this.B2;
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar != null) {
            sendMessageChatArguments = qnVar.C8();
        }
        mediaController.prepareResumedRecording(i9, draftVoice, j10, messageObject, threadMessage, P0, i10, sendMessageChatArguments, getSendMonoForumPeerId(), getSendMessageSuggestionParams());
    }

    public boolean t() {
        return false;
    }

    public final boolean t0(View view) {
        return view == this.C1 || view == this.Q0;
    }

    public final void t1(int i9, int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12;
        int i12;
        ViewGroup viewGroup;
        int i13;
        float f10;
        if (i9 == 2) {
            return;
        }
        AnimationNotificationsLocker animationNotificationsLocker = this.G3;
        re reVar = this.T3;
        Property property = View.TRANSLATION_Y;
        boolean z13 = false;
        boolean z14 = false;
        if (i9 == 1) {
            if (i10 == 0) {
                if (this.J2 == null && this.Q0 == null) {
                    return;
                } else {
                    T();
                }
            }
            if (i10 == 0) {
                u();
                if (this.S0) {
                    this.Q0.getVisibility();
                }
                this.Q0.setVisibility(0);
                this.S0 = true;
                rf rfVar = this.C1;
                if (rfVar == null || rfVar.getVisibility() == 8) {
                    i12 = 0;
                } else {
                    this.C1.setVisibility(8);
                    this.T0 = false;
                    i12 = this.C1.getMeasuredHeight();
                }
                this.Q0.setShowing(true);
                uf ufVar = this.Q0;
                this.j3 = 0;
                viewGroup = ufVar;
            } else if (i10 == 1) {
                if (this.T0) {
                    this.C1.getVisibility();
                }
                this.T0 = true;
                uf ufVar2 = this.Q0;
                if (ufVar2 == null || ufVar2.getVisibility() == 8) {
                    i13 = 0;
                } else {
                    this.i1.removeView(this.Q0);
                    this.Q0.setVisibility(8);
                    this.Q0.setShowing(false);
                    this.S0 = false;
                    i13 = this.Q0.getMeasuredHeight();
                }
                this.C1.setVisibility(0);
                rf rfVar2 = this.C1;
                this.j3 = 1;
                MessagesController.getMainSettings(this.M).edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                i12 = i13;
                viewGroup = rfVar2;
            } else {
                i12 = 0;
                viewGroup = null;
            }
            this.a2 = i10;
            if (this.s2 <= 0) {
                f10 = 200.0f;
                this.s2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            } else {
                f10 = 200.0f;
            }
            if (this.t2 <= 0) {
                this.t2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(f10));
            }
            Point point = AndroidUtilities.displaySize;
            int i14 = point.x > point.y ? this.t2 : this.s2;
            org.telegram.ui.qn qnVar = this.K2;
            if (qnVar != null && qnVar.getParentLayout() != null) {
                i14 -= ((ActionBarLayout) qnVar.getParentLayout()).v(false);
            }
            if (i10 == 1) {
                i14 = Math.min(this.C1.getKeyboardHeight(), i14);
            }
            rf rfVar3 = this.C1;
            if (rfVar3 != null) {
                rfVar3.setPanelHeight(i14);
            }
            if (viewGroup != null && this.Y4 == null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                layoutParams.height = i14;
                viewGroup.setLayoutParams(layoutParams);
            }
            if (!AndroidUtilities.isInMultiwindow) {
                AndroidUtilities.hideKeyboard(this.A0);
            }
            xu0 xu0Var = this.h1;
            if (xu0Var != null) {
                this.v2 = i14;
                xu0Var.requestLayout();
                d1(true, true);
                B1(true);
                F0();
                if (this.d2 && !this.u2 && i14 != i12 && z10) {
                    hd hdVar = new hd(this, 10);
                    if (this.v) {
                        this.w = hdVar;
                    } else {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.R0 = animatorSet;
                        if (this.Y4 != null) {
                            animatorSet.playTogether(ValueAnimator.ofFloat(i14 - i12, 0.0f));
                        } else {
                            float f11 = i14 - i12;
                            viewGroup.setTranslationY(f11);
                            this.R0.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) property, f11, 0.0f));
                        }
                        this.R0.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                        this.R0.setDuration(250L);
                        this.R0.addListener(new fg.j(17, this, hdVar));
                        AndroidUtilities.runOnUIThread(reVar, 50L);
                        animationNotificationsLocker.lock();
                    }
                    requestLayout();
                }
            }
            xg.f fVar = this.Y4;
            if (fVar != null) {
                ((xg.i) fVar).g(i14);
            }
        } else {
            if (this.M0 != null) {
                d1(false, true);
            }
            this.a2 = -1;
            uf ufVar3 = this.Q0;
            if (ufVar3 != null) {
                if (i9 == 2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    this.B3 = false;
                    eg egVar = this.U2;
                    if (egVar != null) {
                        egVar.o(0.0f);
                    }
                    this.i1.removeView(this.Q0);
                    this.Q0 = null;
                } else if (!this.d2 || this.u2 || this.u3) {
                    eg egVar2 = this.U2;
                    if (egVar2 != null) {
                        egVar2.o(0.0f);
                    }
                    z13 = false;
                    this.v2 = 0;
                    this.i1.removeView(this.Q0);
                    this.Q0.setVisibility(8);
                    this.Q0.setShowing(false);
                } else {
                    this.S0 = true;
                    this.j3 = 0;
                    ufVar3.setShowing(false);
                    qd qdVar = new qd(this, i9, z14 ? 1 : 0);
                    if (this.v) {
                        this.w = qdVar;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.R0 = animatorSet2;
                        if (this.Y4 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofFloat(this.Q0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.Q0, (Property<uf, Float>) property, r5.getMeasuredHeight()));
                        }
                        this.R0.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                        this.R0.setDuration(250L);
                        animationNotificationsLocker.lock();
                        this.R0.addListener(new fg.j(18, this, qdVar));
                    }
                    AndroidUtilities.runOnUIThread(reVar, 50L);
                    requestLayout();
                    z13 = false;
                }
                this.S0 = z13;
            }
            rf rfVar4 = this.C1;
            if (rfVar4 != null && rfVar4.getVisibility() == 0) {
                if (i9 != 2 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    if (this.d2 && !this.u2) {
                        if (this.T0) {
                            this.j3 = 1;
                        }
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        this.R0 = animatorSet3;
                        if (this.Y4 != null) {
                            i11 = 0;
                            animatorSet3.playTogether(ValueAnimator.ofFloat(this.C1.getMeasuredHeight()));
                        } else {
                            i11 = 0;
                            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.C1, (Property<rf, Float>) property, r5.getMeasuredHeight()));
                        }
                        this.R0.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                        this.R0.setDuration(250L);
                        this.R0.addListener(new yf(this, i9, i11));
                        animationNotificationsLocker.lock();
                        AndroidUtilities.runOnUIThread(reVar, 50L);
                        requestLayout();
                    } else if (!this.f3) {
                        this.C1.setVisibility(8);
                    }
                }
                this.T0 = false;
            }
            if (i10 == 1 && this.h2 != null) {
                MessagesController.getMainSettings(this.M).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.h2.getId()).apply();
            }
            B1(true);
            xg.f fVar2 = this.Y4;
            if (fVar2 != null) {
                ((xg.i) fVar2).h(z11);
            }
        }
        if (this.s3 || this.t3) {
            J(true);
        }
        if (!this.u3 || i9 == 1) {
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
                this.i1.addView(this.Q0, g7.e6.c(-1.0f, -1));
            }
        }
    }

    public final boolean u0() {
        return this.A2 && ChatActivityEnterView.this.n4;
    }

    public final void u1() {
        eg egVar = this.U2;
        if ((egVar == null || !egVar.g()) && DialogObject.isChatDialog(this.L2)) {
            oc.a0(this.K2).G(R.raw.passcode_lock_close, 3, LocaleController.formatString("SendPlainTextRestrictionHint", R.string.SendPlainTextRestrictionHint, ChatObject.getAllowedSendString(this.N.getMessagesController().getChat(Long.valueOf(-this.L2))))).j();
        }
    }

    public final boolean v() {
        mh.c0 c0Var = this.h0;
        return c0Var != null && c0Var.v;
    }

    public final boolean v0() {
        if (this.A2) {
            return true;
        }
        AnimatorSet animatorSet = this.o2;
        return (animatorSet == null || !animatorSet.isRunning() || this.f2) ? false : true;
    }

    public final void v1(boolean z10) {
        org.telegram.ui.qn qnVar;
        boolean z11 = (this.y1 || z10) && (qnVar = this.K2) != null && !qnVar.w() && this.U1 == null && MessagesController.getInstance(this.M).richEditorAvailable();
        if (this.G4 == z11) {
            return;
        }
        this.G4 = z11;
        ImageView imageView = this.p1;
        imageView.setVisibility(0);
        imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(gr.h).setDuration(420L).withEndAction(new od(this, z11, 1)).start();
    }

    public final boolean w() {
        ag x10 = x();
        return (TextUtils.equals(x10.a, this.X1.a) && MediaDataController.entitiesEqual((ArrayList<TLRPC.MessageEntity>) this.X1.b, (ArrayList<TLRPC.MessageEntity>) x10.b)) ? false : true;
    }

    public final void w1() {
        x1(true, false);
    }

    public final ag x() {
        ff ffVar = this.A0;
        CharSequence[] charSequenceArr = {AndroidUtilities.getTrimmedString(ffVar == null ? "" : ffVar.getTextToUse())};
        ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.M).getEntities(charSequenceArr, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = entities.size();
        for (int i9 = 0; i9 < size; i9++) {
            TLRPC.MessageEntity messageEntity = entities.get(i9);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        ag agVar = new ag();
        agVar.a = charSequence.toString();
        agVar.b = entities;
        return agVar;
    }

    public final boolean x0() {
        return this.u3;
    }

    public final void x1(boolean z10, boolean z11) {
        if (this.B1 == null || this.a3 || getVisibility() != 0) {
            ae aeVar = this.a1;
            if ((aeVar == null || aeVar.getVisibility() != 0) && !this.C2 && this.Q2 == null && this.O2 == null) {
                G0();
                return;
            }
            return;
        }
        ae aeVar2 = this.a1;
        boolean z12 = (aeVar2 == null || aeVar2.getVisibility() != 0) && !this.C2 && this.Q2 == null && (this.i2 == null || this.U1 != null);
        if (!z11 && z10 && z12 && !this.u2 && !s0()) {
            G0();
            hd hdVar = this.R;
            if (hdVar != null) {
                AndroidUtilities.cancelRunOnUIThread(hdVar);
            }
            hd hdVar2 = new hd(this, 23);
            this.R = hdVar2;
            AndroidUtilities.runOnUIThread(hdVar2, 200L);
            return;
        }
        this.b3 = true;
        this.a3 = true;
        if (this.c3) {
            this.b5.a(true, z10);
            if (z12) {
                ff ffVar = this.A0;
                if (ffVar != null) {
                    ffVar.requestFocus();
                }
                G0();
            }
        }
    }

    public final float y(boolean z10) {
        td.c cVar = this.a5;
        float f10 = z10 ? cVar.g ? cVar.f : cVar.e : cVar.e;
        td.a aVar = this.b5;
        return ((this.B1 != null ? r1.getMeasuredHeight() : 0) * (z10 ? aVar.f ? 1.0f : 0.0f : aVar.e)) + f10;
    }

    public final boolean y0() {
        View view = this.B1;
        return view != null && view.getVisibility() == 0;
    }

    public final boolean y1() {
        org.telegram.ui.qn qnVar = this.K2;
        TLRPC.EncryptedChat encryptedChat = qnVar != null ? qnVar.h : null;
        return encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101;
    }

    public final void z() {
        dh.g gVar = this.Z0;
        if (gVar != null) {
            gVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.o2 = null;
        w0();
        if (this.k1 != null) {
            this.x = 0.0f;
            A1();
        }
        SlideTextView slideTextView = this.f1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.U2.c();
        P1(true);
    }

    public final void z1() {
        float f10;
        ge geVar = this.m1;
        if (geVar == null) {
            return;
        }
        float f11 = this.y + this.x;
        oe oeVar = this.F0;
        if (oeVar != null) {
            f10 = oeVar.getAlpha() * (-org.telegram.messenger.l0.b(56.0f, oeVar.l(), 0));
        } else {
            f10 = 0.0f;
        }
        geVar.setTranslationX(f11 + f10);
    }

    @Override // org.telegram.ui.Components.sx0
    public mt getEditField() {
        return this.A0;
    }

    @Override // org.telegram.ui.Components.sx0
    public org.telegram.ui.qn getParentFragment() {
        return this.K2;
    }

    public void g0(Menu menu) {
    }

    public void w0() {
    }

    public void z0(float f10) {
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }

    public void B0(int i9, int i10) {
    }
}
