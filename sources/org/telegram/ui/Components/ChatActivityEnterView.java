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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class ChatActivityEnterView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, pv0, ux0, oy0, xd.b, org.telegram.ui.ActionBar.a6 {
    public static final /* synthetic */ int j5 = 0;
    public boolean A0;
    public TL_iv.RichMessage A1;
    public float A2;
    public boolean A3;
    public boolean A4;
    public float B;
    public ff B0;
    public oe B1;
    public boolean B2;
    public AnimatedArrowDrawable B3;
    public final id B4;
    public float C;
    public final mg C0;
    public View C1;
    public int C2;
    public boolean C3;
    public org.telegram.ui.ActionBar.g1 C4;
    public float D;
    public int D0;
    public rf D1;
    public boolean D2;
    public final re D3;
    public ArrayList D4;
    public float E;
    public id E0;
    public final ImageView E1;
    public boolean E2;
    public boolean E3;
    public boolean E4;
    public float F;
    public final lh.f5 F0;
    public qe F1;
    public boolean F2;
    public boolean F3;
    public View F4;
    public boolean G;
    public final oe G0;
    public se G1;
    public boolean G2;
    public final zf G3;
    public boolean G4;
    public TLRPC.UserFull H;
    public int H0;
    public boolean H1;
    public int H2;
    public final AnimationNotificationsLocker H3;
    public boolean H4;
    public ph.f3 I;
    public cf I0;
    public AnimatorSet I1;
    public boolean I2;
    public final Paint I3;
    public boolean I4;
    public ph.f3 J;
    public long J0;
    public RecordCircle J1;
    public final int[] J2;
    public Drawable J3;
    public id J4;
    public ph.f3 K;
    public bf K0;
    public ig K1;
    public final Activity K2;
    public Drawable K3;
    public final lq[] K4;
    public boolean L;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout L0;
    public final ne L1;
    public final org.telegram.ui.zn L2;
    public Drawable L3;
    public int L4;
    public boolean M;
    public final ImageView M0;
    public final Paint M1;
    public long M2;
    public Drawable M3;
    public int M4;
    public int N;
    public final de N0;
    public int N1;
    public boolean N2;
    public Drawable N3;
    public boolean N4;
    public AccountInstance O;
    public final ImageView O0;
    public id O1;
    public int O2;
    public final RectF O3;
    public long O4;
    public boolean P;
    public se P0;
    public int P1;
    public MessageObject P2;
    public final Rect P3;
    public BotForumHelper.SteamingSendButtonState P4;
    public int Q;
    public boolean Q0;
    public xl0 Q1;
    public MessageObject Q2;
    public final Rect Q3;
    public dh.b Q4;
    public org.telegram.ui.ActionBar.r1 R;
    public uf R0;
    public Editable R1;
    public org.telegram.ui.pn R2;
    public Drawable R3;
    public int R4;
    public id S;
    public AnimatorSet S0;
    public boolean S1;
    public MessageObject S2;
    public final org.telegram.ui.ActionBar.f6 S3;
    public int S4;
    public org.telegram.ui.np T;
    public boolean T0;
    public boolean T1;
    public TLRPC.WebPage T2;
    public final boolean T3;
    public a0.h T4;
    public boolean U;
    public boolean U0;
    public boolean U1;
    public boolean U2;
    public final re U3;
    public final Paint U4;
    public NumberTextView V;
    public ng V0;
    public MessageObject V1;
    public eg V2;
    public final zd V3;
    public final LinearGradient V4;
    public int W;
    public final le W0;
    public boolean W1;
    public wf W2;
    public final zd W3;
    public final Matrix W4;
    public boolean X0;
    public TL_account.TL_businessChatLink X1;
    public TLRPC.TL_document X2;
    public final zd X3;
    public final z5 X4;
    public final me Y0;
    public ag Y1;
    public String Y2;
    public final zd Y3;
    public final z5 Y4;
    public boolean Z0;
    public TLRPC.ChatFull Z1;
    public MessageObject Z2;
    public final zd Z3;
    public ch.f Z4;
    public int a;
    public int a0;
    public dh.d a1;
    public boolean a2;
    public VideoEditedInfo a3;
    public boolean a4;
    public wg.g a5;
    public boolean b;
    public jr b0;
    public ae b1;
    public int b2;
    public boolean b3;
    public long b4;
    public final xd.c b5;
    public org.telegram.ui.ActionBar.g1 c;
    public Runnable c0;
    public x71 c1;
    public boolean c2;
    public boolean c3;
    public float c4;
    public final xd.a c5;
    public LinearLayout d;
    public boolean d0;
    public jj0 d1;
    public boolean d2;
    public boolean d3;
    public float d4;
    public final xd.a d5;
    public CharSequence e;
    public boolean e0;
    public qk0 e1;
    public boolean e2;
    public MessageObject e3;
    public float e4;
    public final xd.a e5;
    public String f;
    public String f0;
    public long f1;
    public boolean f2;
    public TL_keyboard.KeyboardButtonProto f3;
    public float f4;
    public float f5;
    public String g0;
    public SlideTextView g1;
    public boolean g2;
    public boolean g3;
    public float g4;
    public float g5;
    public float h;
    public rh.e3 h0;
    public kg h1;
    public boolean h2;
    public boolean h3;
    public float h4;
    public boolean h5;
    public rh.z i0;
    public final qv0 i1;
    public MessageObject i2;
    public boolean i3;
    public float i4;
    public int i5;
    public df j0;
    public ViewGroup j1;
    public TLRPC.TL_replyKeyboardMarkup j2;
    public boolean j3;
    public float j4;
    public rh.y k0;
    public int k1;
    public int k2;
    public int k3;
    public float k4;
    public boolean l0;
    public final dg.u3 l1;
    public boolean l2;
    public boolean l3;
    public float l4;
    public zo0 m0;
    public ViewPropertyAnimator m1;
    public PowerManager.WakeLock m2;
    public boolean m3;
    public float m4;
    public float n;
    public ve n0;
    public final ge n1;
    public AnimatorSet n2;
    public final re n3;
    public boolean n4;
    public yd o0;
    public final j0 o1;
    public AnimatorSet o2;
    public final ye o3;
    public boolean o4;
    public int p0;
    public final ImageView p1;
    public AnimatorSet p2;
    public final org.telegram.ui.Cells.b1 p3;
    public int p4;
    public int q0;
    public final ImageView q1;
    public AnimatorSet q2;
    public final kf q3;
    public long q4;
    public float r;
    public yd r0;
    public float r1;
    public int r2;
    public final nf r3;
    public boolean r4;
    public float s;
    public ValueAnimator s0;
    public ImageView s1;
    public int s2;
    public final Paint s3;
    public ValueAnimator s4;
    public float t0;
    public se t1;
    public int t2;
    public boolean t3;
    public boolean t4;
    public boolean u0;
    public final ce u1;
    public int u2;
    public boolean u3;
    public boolean u4;
    public boolean v;
    public boolean v0;
    public final ae v1;
    public boolean v2;
    public boolean v3;
    public boolean v4;
    public Runnable w;
    public boolean w0;
    public final ae w1;
    public int w2;
    public boolean w3;
    public boolean w4;
    public float x;
    public boolean x0;
    public final ImageView x1;
    public final boolean x2;
    public AnimatorSet x3;
    public final Paint x4;
    public float y;
    public final HashMap y0;
    public RichMessageLayout.PreviewView y1;
    public long y2;
    public float y3;
    public float y4;
    public boolean z0;
    public boolean z1;
    public float z2;
    public int z3;
    public final Rect z4;

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public class RecordCircle extends View {
        public final float B;
        public float C;
        public float D;
        public float E;
        public boolean F;
        public float G;
        public float H;
        public float I;
        public boolean J;
        public boolean K;
        public float a;
        public float b;
        public float c;
        public long d;
        public float e;
        public float f;
        public final u9 h;
        public final u9 n;
        public final float r;
        public final float s;
        public final RectF v;
        public boolean w;
        public final jg x;
        public int y;

        public RecordCircle(Context context) {
            super(context);
            u9 u9Var = new u9(11, LiteMode.FLAGS_CHAT);
            this.h = u9Var;
            u9 u9Var2 = new u9(12, LiteMode.FLAGS_CHAT);
            this.n = u9Var2;
            this.r = AndroidUtilities.dpf2(41.0f);
            this.s = AndroidUtilities.dp(30.0f);
            this.v = new RectF();
            this.E = 0.0f;
            this.F = true;
            jg jgVar = new jg(this, this);
            this.x = jgVar;
            r0.j0.k(this, jgVar);
            u9Var.a = AndroidUtilities.dp(47.0f);
            u9Var.b = AndroidUtilities.dp(55.0f);
            u9Var.b();
            u9Var2.a = AndroidUtilities.dp(47.0f);
            u9Var2.b = AndroidUtilities.dp(55.0f);
            u9Var2.b();
            float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.B = scaledTouchSlop * scaledTouchSlop;
            e();
        }

        public final void a() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.L3 != null) {
                return;
            }
            chatActivityEnterView.L3 = getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            Drawable drawable = chatActivityEnterView.L3;
            int i10 = org.telegram.ui.ActionBar.j6.bf;
            int i02 = chatActivityEnterView.i0(i10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(i02, mode));
            chatActivityEnterView.M3 = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            chatActivityEnterView.M3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i10), mode));
            chatActivityEnterView.N3 = getResources().getDrawable(R.drawable.attach_send).mutate();
            chatActivityEnterView.N3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i10), mode));
            chatActivityEnterView.J3 = getResources().getDrawable(R.drawable.input_mic).mutate();
            Drawable drawable2 = chatActivityEnterView.J3;
            int i11 = org.telegram.ui.ActionBar.j6.Wk;
            drawable2.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i11), mode));
            chatActivityEnterView.K3 = getResources().getDrawable(R.drawable.input_video).mutate();
            chatActivityEnterView.K3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i11), mode));
        }

        public final void b(Canvas canvas, Drawable drawable, Drawable drawable2, float f10, int i10) {
            a();
            if (f10 != 0.0f && f10 != 1.0f && drawable2 != null) {
                canvas.save();
                canvas.scale(f10, f10, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                float f11 = i10;
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
            boolean z4 = chatActivityEnterView.n4;
            if (z4 && chatActivityEnterView.f4 == 1.0f) {
                chatActivityEnterView.Y0.setAlpha(1.0f);
                setVisibility(8);
            } else if (z4 && chatActivityEnterView.f4 < 1.0f) {
                drawable.setAlpha(255);
                drawable.draw(canvas);
            } else {
                if (z4) {
                    return;
                }
                drawable.setAlpha(i10);
                drawable.draw(canvas);
            }
        }

        public final void c(boolean z4) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!z4) {
                chatActivityEnterView.o4 = false;
                chatActivityEnterView.h4 = -1.0f;
                chatActivityEnterView.g4 = -1.0f;
                chatActivityEnterView.f4 = 1.0f;
                chatActivityEnterView.m4 = 1.0f;
                chatActivityEnterView.j4 = 0.0f;
                chatActivityEnterView.e4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.l4 = 0.0f;
            chatActivityEnterView.x0();
            chatActivityEnterView.i4 = 0.0f;
            chatActivityEnterView.d4 = 0.0f;
            chatActivityEnterView.c4 = 0.0f;
            chatActivityEnterView.a4 = false;
            this.f = 0.0f;
            chatActivityEnterView.n4 = false;
            ig igVar = chatActivityEnterView.K1;
            if (igVar != null) {
                igVar.invalidate();
            }
        }

        public final void d() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.o4 = false;
            invalidate();
            ig igVar = chatActivityEnterView.K1;
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
            Paint paint = chatActivityEnterView.I3;
            int i10 = org.telegram.ui.ActionBar.j6.cf;
            paint.setColor(chatActivityEnterView.i0(i10));
            this.h.d.setColor(i0.a.k(chatActivityEnterView.i0(i10), 38));
            this.n.d.setColor(i0.a.k(chatActivityEnterView.i0(i10), 76));
            this.y = chatActivityEnterView.I3.getAlpha();
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.e4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.d4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.e;
        }

        @Override // android.view.View
        public final void invalidate() {
            super.invalidate();
            ig igVar = ChatActivityEnterView.this.K1;
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
            int i10;
            Drawable drawable3;
            Paint paint2;
            float f22;
            Drawable drawable4;
            Drawable drawable5;
            qk0 qk0Var;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Rect rect = chatActivityEnterView.P3;
            Paint paint3 = chatActivityEnterView.I3;
            if (this.K) {
                return;
            }
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp2(26.0f);
            int dp = (int) (AndroidUtilities.dp(170.0f) + 0.0f);
            this.G = chatActivityEnterView.p4 + measuredWidth;
            float f23 = dp;
            this.H = f23;
            float f24 = chatActivityEnterView.d4;
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
            float interpolation = ((this.s * this.a) + this.r) * f25 * (chatActivityEnterView.n4 ? mr.g.getInterpolation(f11 - chatActivityEnterView.f4) * 0.7f : (chatActivityEnterView.f4 * 0.3f) + 0.7f);
            this.e = 0.0f;
            float f30 = chatActivityEnterView.l4;
            if (f30 == 0.0f || chatActivityEnterView.e1 == null) {
                float f31 = chatActivityEnterView.i4;
                if (f31 != 0.0f) {
                    float f32 = f31 > 0.6f ? 1.0f : f31 / 0.6f;
                    if (!chatActivityEnterView.d0) {
                        f31 = Math.max(0.0f, (f31 - 0.6f) / 0.4f);
                    }
                    mr mrVar = mr.j;
                    float interpolation2 = mrVar.getInterpolation(f32);
                    float interpolation3 = mrVar.getInterpolation(f31);
                    interpolation = (1.0f - interpolation3) * ((AndroidUtilities.dp(16.0f) * interpolation2) + interpolation);
                    if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                        float f33 = chatActivityEnterView.i4;
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
                if (chatActivityEnterView.n4) {
                    float f34 = chatActivityEnterView.f4;
                    if (f34 > 0.7f) {
                        f14 *= 1.0f - ((f34 - 0.7f) / 0.3f);
                    }
                }
                if (this.e <= 0.0f) {
                    f16 = 0.7f;
                    f17 = 0.0f;
                    paint3.setColor(i0.a.d(this.e, chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.cf), chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.kf)));
                } else {
                    f16 = 0.7f;
                    f17 = 0.0f;
                    paint3.setColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.cf));
                }
                a();
                Drawable drawable6 = null;
                if (chatActivityEnterView.o4) {
                    f18 = interpolation;
                    f19 = f12;
                    paint = paint3;
                    f20 = f13;
                    f21 = 12.0f;
                    drawable = chatActivityEnterView.Z0 ? chatActivityEnterView.M3 : chatActivityEnterView.L3;
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
                        drawable6 = chatActivityEnterView.Z0 ? chatActivityEnterView.M3 : chatActivityEnterView.L3;
                    } else {
                        f21 = 12.0f;
                    }
                    Drawable drawable7 = drawable6;
                    drawable = chatActivityEnterView.N3;
                    f20 = f13;
                    f19 = f12;
                    paint = paint3;
                    f18 = interpolation;
                    rect.set(org.telegram.ui.b.u(2, measuredWidth, drawable), org.telegram.ui.b.f(2, dp, drawable), org.telegram.ui.b.A(2, measuredWidth, drawable), org.telegram.ui.b.y(2, dp, drawable));
                    if (drawable7 != null) {
                        drawable7.setBounds(org.telegram.ui.b.u(2, measuredWidth, drawable7), org.telegram.ui.b.f(2, dp, drawable7), org.telegram.ui.b.A(2, measuredWidth, drawable7), org.telegram.ui.b.y(2, dp, drawable7));
                    }
                    drawable2 = drawable7;
                }
                drawable.setBounds(rect);
                if (this.w) {
                    float f37 = chatActivityEnterView.k4 - 0.01f;
                    chatActivityEnterView.k4 = f37;
                    if (f37 < f17) {
                        this.w = true;
                        chatActivityEnterView.k4 = 0.0f;
                    }
                } else {
                    float f38 = chatActivityEnterView.k4 + 0.01f;
                    chatActivityEnterView.k4 = f38;
                    if (f38 > 1.0f) {
                        this.w = false;
                        chatActivityEnterView.k4 = 1.0f;
                    }
                }
                isEnabled = LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                u9 u9Var = this.n;
                u9 u9Var2 = this.h;
                if (isEnabled) {
                    u9Var2.a = AndroidUtilities.dp(47.0f);
                    u9Var2.b = (AndroidUtilities.dp(15.0f) * 0.6f) + AndroidUtilities.dp(47.0f);
                    u9Var.a = AndroidUtilities.dp(50.0f);
                    u9Var.b = (AndroidUtilities.dp(f21) * 0.6f) + AndroidUtilities.dp(50.0f);
                    u9Var.f(currentTimeMillis);
                    u9Var.e(u9Var.t, 1.01f);
                    u9Var2.f(currentTimeMillis);
                    u9Var2.e(u9Var2.t, 1.02f);
                }
                this.d = System.currentTimeMillis();
                float f39 = chatActivityEnterView.f4;
                float f40 = f39 <= f16 ? 1.0f : f39 / f16;
                if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT) && f19 != 1.0f && f20 < 0.4f && f40 > 0.0f && !chatActivityEnterView.n4) {
                    if (this.F) {
                        float f41 = this.E;
                        if (f41 != 1.0f) {
                            float f42 = f41 + 0.04f;
                            this.E = f42;
                            if (f42 > 1.0f) {
                                this.E = 1.0f;
                            }
                        }
                    }
                    if (!this.J) {
                        float interpolation4 = mr.g.getInterpolation(this.E);
                        canvas.save();
                        float f43 = 1.0f - f15;
                        float y10 = e2.c.y(u9Var.t, 1.4f, 0.878f, e2.c.z(chatActivityEnterView.d4, f43, f40, interpolation4));
                        canvas.scale(y10, y10, chatActivityEnterView.p4 + measuredWidth, f23);
                        u9Var.a(chatActivityEnterView.p4 + measuredWidth, f23, canvas, u9Var.d);
                        canvas.restore();
                        float z4 = ((u9Var2.t * 1.4f) + 0.926f) * e2.c.z(chatActivityEnterView.d4, f43, f40, interpolation4);
                        canvas.save();
                        canvas.scale(z4, z4, chatActivityEnterView.p4 + measuredWidth, f23);
                        u9Var2.a(chatActivityEnterView.p4 + measuredWidth, f23, canvas, u9Var2.d);
                        canvas.restore();
                    }
                }
                float max = (chatActivityEnterView.n4 || chatActivityEnterView.f4 >= 1.0f) ? f18 : Math.max(f18, AndroidUtilities.dp(19.0f));
                if (this.J) {
                    paint2 = paint;
                    paint2.setAlpha((int) (this.y * f14));
                    if (chatActivityEnterView.d4 == 1.0f) {
                        if (chatActivityEnterView.l4 == 0.0f) {
                            drawable4 = drawable2;
                            i10 = measuredWidth;
                            drawable5 = drawable;
                            f22 = 1.0f;
                            canvas.drawCircle(i10 + chatActivityEnterView.p4, f23, max, paint2);
                        } else if (chatActivityEnterView.Z0 || this.e <= 0.0f || (qk0Var = chatActivityEnterView.e1) == null) {
                            drawable4 = drawable2;
                            i10 = measuredWidth;
                            drawable5 = drawable;
                            f22 = 1.0f;
                            canvas.drawCircle(i10 + chatActivityEnterView.p4, f23, (1.0f - this.e) * max, paint2);
                        } else {
                            float f44 = f23 + max;
                            float f45 = f23 - max;
                            float f46 = chatActivityEnterView.p4 + measuredWidth;
                            float f47 = f46 + max;
                            float f48 = f46 - max;
                            drawable4 = drawable2;
                            int i11 = 0;
                            int i12 = 0;
                            for (View view = (View) qk0Var.getParent(); view != getParent(); view = (View) view.getParent()) {
                                i12 = (int) (view.getY() + i12);
                                i11 = (int) (view.getX() + i11);
                            }
                            float f49 = i12;
                            float y11 = (qk0Var.getY() + f49) - getY();
                            float y12 = ((qk0Var.getY() + qk0Var.getMeasuredHeight()) + f49) - getY();
                            float f50 = i11;
                            float x10 = (((qk0Var.getX() + qk0Var.getMeasuredWidth()) + f50) - getX()) - chatActivityEnterView.F;
                            float x11 = ((qk0Var.getX() + f50) - getX()) + chatActivityEnterView.F;
                            i10 = measuredWidth;
                            float measuredHeight = chatActivityEnterView.Z0 ? 0.0f : qk0Var.getMeasuredHeight() / 2.0f;
                            drawable5 = drawable;
                            float lerp = AndroidUtilities.lerp(f45, y11, this.e);
                            float lerp2 = AndroidUtilities.lerp(f44, y12, this.e);
                            float lerp3 = AndroidUtilities.lerp(f48, x11, this.e);
                            float lerp4 = AndroidUtilities.lerp(f47, x10, this.e);
                            AndroidUtilities.lerp(max, measuredHeight, this.e);
                            RectF rectF = this.v;
                            rectF.set(lerp3, lerp, lerp4, lerp2);
                            chatActivityEnterView.e1.a(canvas, rectF);
                            f22 = 1.0f;
                        }
                        canvas.save();
                        canvas.translate(chatActivityEnterView.p4, 0.0f);
                        drawable3 = drawable5;
                        drawable2 = drawable4;
                        b(canvas, drawable3, drawable2, this.f, (int) org.telegram.messenger.y3.y(f22, f19, f22 - f20, 255.0f));
                        canvas.restore();
                        if (chatActivityEnterView.d4 != f22) {
                            canvas.drawCircle(i10 + chatActivityEnterView.p4, f23, max, paint2);
                            float f51 = chatActivityEnterView.n4 ? f22 - chatActivityEnterView.f4 : 1.0f;
                            canvas.save();
                            canvas.translate(chatActivityEnterView.p4, 0.0f);
                            b(canvas, drawable3, drawable2, this.f, (int) (f51 * 255.0f));
                            canvas.restore();
                        }
                        this.I = max;
                    }
                    i10 = measuredWidth;
                    drawable3 = drawable;
                } else {
                    i10 = measuredWidth;
                    drawable3 = drawable;
                    paint2 = paint;
                }
                f22 = 1.0f;
                if (chatActivityEnterView.d4 != f22) {
                }
                this.I = max;
            }
            float f52 = f30 > 0.38f ? 1.0f : f30 / 0.38f;
            float max2 = f30 > 0.63f ? 1.0f : Math.max(0.0f, (f30 - 0.38f) / f10);
            this.e = Math.max(0.0f, ((chatActivityEnterView.l4 - 0.38f) - f10) / 0.37f);
            mr mrVar2 = mr.j;
            float interpolation5 = mrVar2.getInterpolation(f52);
            f12 = mrVar2.getInterpolation(max2);
            this.e = mrVar2.getInterpolation(this.e);
            float dp2 = (AndroidUtilities.dp(16.0f) * interpolation5) + interpolation;
            float dp3 = AndroidUtilities.dp(8.0f);
            interpolation = e2.c.w(1.0f, f12, dp2 - dp3, dp3);
            f15 = interpolation5;
            f13 = 0.0f;
            f14 = 1.0f;
            if (chatActivityEnterView.n4) {
            }
            if (this.e <= 0.0f) {
            }
            a();
            Drawable drawable62 = null;
            if (chatActivityEnterView.o4) {
            }
            drawable.setBounds(rect);
            if (this.w) {
            }
            isEnabled = LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
            u9 u9Var3 = this.n;
            u9 u9Var22 = this.h;
            if (isEnabled) {
            }
            this.d = System.currentTimeMillis();
            float f392 = chatActivityEnterView.f4;
            if (f392 <= f16) {
            }
            if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                if (this.F) {
                }
                if (!this.J) {
                }
            }
            float max3 = (chatActivityEnterView.n4 || chatActivityEnterView.f4 >= 1.0f) ? f18 : Math.max(f18, AndroidUtilities.dp(19.0f));
            if (this.J) {
            }
            f22 = 1.0f;
            if (chatActivityEnterView.d4 != f22) {
            }
            this.I = max3;
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
            chatActivityEnterView.p4 = (int) ((1.0f - chatActivityEnterView.f4) * (-measuredWidth));
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
            chatActivityEnterView.e4 = f10;
            ig igVar = chatActivityEnterView.K1;
            if (igVar != null) {
                igVar.invalidate();
            }
        }

        public void setScale(float f10) {
            ChatActivityEnterView.this.d4 = f10;
            invalidate();
        }

        public void setTransformToSeekbar(float f10) {
            ChatActivityEnterView.this.l4 = f10;
            invalidate();
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public class SlideTextView extends View {
        public final int B;
        public final Path C;
        public StaticLayout D;
        public StaticLayout E;
        public boolean F;
        public final Rect G;
        public org.telegram.ui.Cells.z H;
        public int I;
        public final boolean J;
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
            this.C = new Path();
            this.G = new Rect();
            boolean z4 = AndroidUtilities.displaySize.x <= AndroidUtilities.dp(320.0f);
            this.J = z4;
            TextPaint textPaint = new TextPaint(1);
            this.a = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(z4 ? 13.0f : 15.0f));
            TextPaint textPaint2 = new TextPaint(1);
            this.b = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint2.setTypeface(AndroidUtilities.bold());
            int i10 = org.telegram.ui.ActionBar.j6.Wk;
            int i11 = ChatActivityEnterView.j5;
            paint.setColor(ChatActivityEnterView.this.i0(i10));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dpf2(z4 ? 1.0f : 1.6f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String string = LocaleController.getString(R.string.SlideToCancel2);
            this.d = string;
            String upperCase = LocaleController.getString("Cancel", R.string.Cancel).toUpperCase();
            this.e = upperCase;
            this.B = string.indexOf(upperCase);
            a();
        }

        public final void a() {
            int i10 = org.telegram.ui.ActionBar.j6.nf;
            int i11 = ChatActivityEnterView.j5;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int i02 = chatActivityEnterView.i0(i10);
            this.a.setColor(i02);
            int i12 = org.telegram.ui.ActionBar.j6.mf;
            int i03 = chatActivityEnterView.i0(i12);
            this.b.setColor(i03);
            this.s = r2.getAlpha();
            this.v = r4.getAlpha();
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(60.0f), 0, i0.a.k(chatActivityEnterView.i0(i12), 26));
            this.H = h02;
            h02.setCallback(this);
        }

        @Override // android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.H.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f;
        }

        @Override // android.view.View
        public final void jumpDrawablesToCurrentState() {
            super.jumpDrawablesToCurrentState();
            org.telegram.ui.Cells.z zVar = this.H;
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
            if (this.D == null || (staticLayout = this.E) == null) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.J1 == null) {
                return;
            }
            int dp = AndroidUtilities.dp(16.0f) + staticLayout.getWidth();
            int i02 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.nf);
            TextPaint textPaint = this.a;
            textPaint.setColor(i02);
            textPaint.setAlpha((int) ((1.0f - this.n) * this.s * this.r));
            this.b.setAlpha((int) (this.v * this.n));
            int color = textPaint.getColor();
            Paint paint = this.c;
            paint.setColor(color);
            boolean z4 = this.J;
            if (z4) {
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
            int i10 = this.B;
            boolean z10 = i10 >= 0;
            int dp4 = AndroidUtilities.dp(5.0f) + ((int) ((getMeasuredWidth() - this.f) / 2.0f));
            int measuredWidth = (int) ((getMeasuredWidth() - this.h) / 2.0f);
            float primaryHorizontal = z10 ? this.D.getPrimaryHorizontal(i10) : 0.0f;
            if (z10) {
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
            float dp6 = z10 ? 0.0f : this.n * AndroidUtilities.dp(12.0f);
            if (this.n != 1.0f) {
                f12 = 12.0f;
                int translationX = (int) ((chatActivityEnterView.J1.getTranslationX() * 0.3f) + ((1.0f - this.r) * ((-getMeasuredWidth()) / 4)));
                canvas.save();
                ng ngVar = chatActivityEnterView.V0;
                f13 = 2.0f;
                canvas.clipRect((ngVar == null ? 0.0f : ngVar.getLeftProperty()) + AndroidUtilities.dp(4.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.save();
                int i11 = (int) dp5;
                canvas.translate((i11 - AndroidUtilities.dp(z4 ? 7.0f : 10.0f)) + translationX, dp6);
                canvas.drawPath(this.C, paint);
                canvas.restore();
                canvas.save();
                canvas.translate(i11 + translationX, ((getMeasuredHeight() - this.D.getHeight()) / 2.0f) + dp6);
                this.D.draw(canvas);
                canvas.restore();
                canvas.restore();
            } else {
                f12 = 12.0f;
                f13 = 2.0f;
            }
            float measuredHeight = (getMeasuredHeight() - this.E.getHeight()) / f13;
            if (!z10) {
                measuredHeight -= AndroidUtilities.dp(f12) - dp6;
            }
            float f17 = z10 ? dp5 + primaryHorizontal : measuredWidth;
            Rect rect = this.G;
            rect.set((int) f17, (int) measuredHeight, (int) (this.E.getWidth() + f17), (int) (this.E.getHeight() + measuredHeight));
            rect.inset(-AndroidUtilities.dp(f10), -AndroidUtilities.dp(f10));
            if (this.n > 0.0f) {
                this.H.setBounds((getMeasuredWidth() / 2) - dp, (getMeasuredHeight() / 2) - dp, (getMeasuredWidth() / 2) + dp, (getMeasuredHeight() / 2) + dp);
                this.H.draw(canvas);
                canvas.save();
                canvas.translate(f17, measuredHeight);
                this.E.draw(canvas);
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
            if (this.I != measuredHeight) {
                this.I = measuredHeight;
                String str = this.d;
                TextPaint textPaint = this.a;
                this.f = textPaint.measureText(str);
                String str2 = this.e;
                TextPaint textPaint2 = this.b;
                this.h = textPaint2.measureText(str2);
                this.y = System.currentTimeMillis();
                int measuredHeight2 = getMeasuredHeight() >> 1;
                Path path = this.C;
                path.reset();
                if (this.J) {
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
                int i12 = (int) this.f;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.D = new StaticLayout(this.d, textPaint, i12, alignment, 1.0f, 0.0f, false);
                this.E = new StaticLayout(this.e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
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
            Rect rect = this.G;
            if (action == 0) {
                boolean contains = rect.contains(x10, y10);
                this.F = contains;
                if (contains) {
                    this.H.setHotspot(x10, y10);
                    setPressed(true);
                }
                return this.F;
            }
            boolean z4 = this.F;
            if (!z4) {
                return z4;
            }
            if (motionEvent.getAction() == 2 && !rect.contains(x10, y10)) {
                setPressed(false);
                return false;
            }
            if (motionEvent.getAction() == 1 && rect.contains(x10, y10)) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                long j10 = 0;
                if (chatActivityEnterView.a2 && chatActivityEnterView.Z0) {
                    CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.D3);
                    chatActivityEnterView.V2.p2(5, 0, chatActivityEnterView.L ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.O4, 0L, true);
                    oe oeVar = chatActivityEnterView.G0;
                    chatActivityEnterView.O4 = 0L;
                    oeVar.setEffect(0L);
                } else {
                    chatActivityEnterView.V2.f1(0);
                    MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.L, 0L);
                }
                chatActivityEnterView.X2 = null;
                chatActivityEnterView.Z2 = null;
                chatActivityEnterView.a3 = null;
                chatActivityEnterView.f1 = 0L;
                chatActivityEnterView.B2 = false;
                MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.N);
                long j11 = chatActivityEnterView.M2;
                org.telegram.ui.zn znVar = chatActivityEnterView.L2;
                if (znVar != null && znVar.e4) {
                    j10 = znVar.d();
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
            return this.H == drawable || super.verifyDrawable(drawable);
        }
    }

    public ChatActivityEnterView(Activity activity, qv0 qv0Var, org.telegram.ui.zn znVar, boolean z4, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        int i10;
        String str;
        eg egVar;
        this.h = 1.0f;
        this.n = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        this.B = 1.0f;
        this.C = 1.0f;
        this.F = 0.0f;
        final int i11 = 1;
        this.G = true;
        int i12 = UserConfig.selectedAccount;
        this.N = i12;
        this.O = AccountInstance.getInstance(i12);
        this.Q = 1;
        this.W = -1;
        this.i5 = 1;
        this.u0 = true;
        this.v0 = true;
        this.w0 = true;
        this.y0 = new HashMap();
        new fe(0);
        this.z0 = false;
        this.A0 = false;
        this.r1 = 1.0f;
        this.b2 = -1;
        this.f2 = true;
        this.z2 = -1.0f;
        this.A2 = AndroidUtilities.dp(80.0f);
        this.J2 = new int[2];
        this.U2 = true;
        this.k3 = -1;
        this.m3 = true;
        this.n3 = new re(this, 0);
        this.o3 = new ye(this);
        this.p3 = new org.telegram.ui.Cells.b1(Integer.class, "translationY", 1);
        this.q3 = new kf(Float.class, "scale");
        this.r3 = new nf(Float.class, "controlsScale");
        this.s3 = new Paint(1);
        this.D3 = new re(this, i11);
        this.G3 = new zf(this);
        this.H3 = new AnimationNotificationsLocker();
        this.I3 = new Paint(1);
        this.O3 = new RectF();
        this.P3 = new Rect();
        this.Q3 = new Rect();
        this.U3 = new re(this, 2);
        this.V3 = new zd(this, 0);
        this.W3 = new zd(this, 1);
        this.X3 = new zd(this, 2);
        this.Y3 = new zd(this, 3);
        this.Z3 = new zd(this, 4);
        this.t4 = true;
        this.u4 = true;
        this.x4 = new Paint();
        this.y4 = 1.0f;
        this.z4 = new Rect();
        this.B4 = new id(this, 7);
        this.E4 = true;
        this.K4 = new lq[1];
        this.P4 = BotForumHelper.SteamingSendButtonState.NO_STREAMING;
        this.R4 = -1;
        Paint paint = new Paint(1);
        this.U4 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.V4 = linearGradient;
        this.W4 = new Matrix();
        mr mrVar = mr.h;
        final int i13 = 0;
        this.X4 = new z5(this, 0L, 280L, mrVar);
        this.Y4 = new z5(this, 0L, 280L, mrVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        mr mrVar2 = wh.n.V;
        this.b5 = new xd.c(0, this, mrVar2, 250L);
        this.c5 = new xd.a(1, this, mrVar2, 250L, false);
        this.d5 = new xd.a(2, this, mrVar, 320L, false);
        this.e5 = new xd.a(3, this, mrVar, 320L, false);
        this.S3 = f6Var;
        this.T3 = z4;
        this.e2 = z4 && !AndroidUtilities.isInMultiwindow && (znVar == null || !znVar.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.M1 = paint2;
        paint2.setColor(i0(org.telegram.ui.ActionBar.j6.af));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.recordStarted);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.recordPaused);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.recordResumed);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.recordStartError);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.recordStopped);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.recordProgressChanged);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.audioDidSent);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.audioRouteChanged);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.messageReceivedByServer2);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.sendingMessagesChanged);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.audioRecordTooShort);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.updateBotMenuButton);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.didUpdatePremiumGiftFieldIcon);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.K2 = activity;
        this.L2 = znVar;
        if (znVar != null) {
            this.C2 = znVar.getClassGuid();
        }
        this.i1 = qv0Var;
        this.j1 = qv0Var;
        qv0Var.setDelegate(this);
        this.x2 = MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false);
        ae aeVar = new ae(this, activity, i13);
        this.v1 = aeVar;
        aeVar.setClipChildren(false);
        aeVar.setClipToPadding(false);
        aeVar.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
        addView(aeVar, k7.b6.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        ce ceVar = new ce(this, activity);
        this.u1 = ceVar;
        ceVar.setClipChildren(false);
        aeVar.addView(ceVar, k7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        de deVar = new de(this, activity);
        this.N0 = deVar;
        deVar.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        deVar.setFocusable(true);
        int dp = AndroidUtilities.dp(7.5f);
        deVar.setPadding(dp, dp, dp, dp);
        int i14 = org.telegram.ui.ActionBar.j6.Wk;
        int i02 = i0(i14);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        deVar.setColorFilter(new PorterDuffColorFilter(i02, mode));
        int i15 = org.telegram.ui.ActionBar.j6.i6;
        int i03 = i0(i15);
        float dp2 = AndroidUtilities.dp(19.0f);
        int dp3 = AndroidUtilities.dp(1.0f);
        int dp4 = AndroidUtilities.dp(3.0f);
        deVar.setBackground(org.telegram.ui.ActionBar.j6.W(dp2, i03, dp3, dp4, dp3, dp4));
        deVar.setOnClickListener(new kd(this, 14));
        ceVar.addView(deVar, k7.b6.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        d1(false, false);
        ImageView imageView = new ImageView(activity);
        this.O0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(i0(i14), mode));
        int i04 = i0(i15);
        float dp5 = AndroidUtilities.dp(19.0f);
        int dp6 = AndroidUtilities.dp(1.0f);
        int dp7 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.W(dp5, i04, dp6, dp7, dp6, dp7));
        imageView.setVisibility(8);
        imageView.setContentDescription(LocaleController.getString(R.string.ArticleDeleteDraft));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ud
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        int i16 = ChatActivityEnterView.j5;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, f6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.O = string;
                        d2Var.Q = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    default:
                        int i17 = ChatActivityEnterView.j5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        org.telegram.ui.zn znVar2 = chatActivityEnterView2.L2;
                        long a2 = znVar2 != null ? znVar2.a() : chatActivityEnterView2.M2;
                        boolean z10 = chatActivityEnterView2.z1;
                        org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                        if (!z10) {
                            if (chatActivityEnterView2.B0 != null) {
                                f0 f0Var = new f0(chatActivityEnterView2.getContext(), f6Var2);
                                f0Var.m0(chatActivityEnterView2.B0.getText());
                                f0Var.g0 = new sd(chatActivityEnterView2, 1);
                                boolean z11 = chatActivityEnterView2.V1 != null;
                                td tdVar = new td(chatActivityEnterView2, a2, f6Var2, 1);
                                f0Var.i0 = a2;
                                f0Var.j0 = z11;
                                f0Var.k0 = tdVar;
                                f0Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.A1 != null) {
                            f0 f0Var2 = new f0(chatActivityEnterView2.getContext(), f6Var2);
                            f0Var2.n0(chatActivityEnterView2.A1);
                            f0Var2.h0 = new sd(chatActivityEnterView2, 0);
                            td tdVar2 = new td(chatActivityEnterView2, a2, f6Var2, 0);
                            f0Var2.i0 = a2;
                            f0Var2.l0 = tdVar2;
                            f0Var2.show();
                            break;
                        }
                        break;
                }
            }
        });
        ceVar.addView(imageView, k7.b6.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z4) {
            int i16 = znVar != null ? znVar.O3 : -1;
            dg.u3 u3Var = new dg.u3(activity, 5);
            this.l1 = u3Var;
            u3Var.setOrientation(0);
            u3Var.setEnabled(false);
            u3Var.setClipChildren(false);
            ceVar.addView(u3Var, k7.b6.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i16 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.E1 = imageView2;
                jr jrVar = new jr(activity, R.drawable.input_notify_on, i14);
                this.b0 = jrVar;
                imageView2.setImageDrawable(jrVar);
                this.b0.a(this.c2, false);
                if (this.c2) {
                    i10 = R.string.AccDescrChanSilentOn;
                    str = "AccDescrChanSilentOn";
                } else {
                    i10 = R.string.AccDescrChanSilentOff;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(LocaleController.getString(str, i10));
                imageView2.setColorFilter(new PorterDuffColorFilter(i0(i14), PorterDuff.Mode.MULTIPLY));
                imageView2.setScaleType(scaleType);
                imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(i0(i15), 1, -1));
                imageView2.setVisibility((!this.d2 || ((egVar = this.V2) != null && egVar.H0())) ? 8 : 0);
                u3Var.addView(imageView2, k7.b6.n(44, 44));
                imageView2.setOnClickListener(new ee(this, znVar, activity));
            }
            ge geVar = new ge(activity, 0);
            this.n1 = geVar;
            geVar.setScaleType(scaleType);
            geVar.setColorFilter(new PorterDuffColorFilter(i0(i14), PorterDuff.Mode.MULTIPLY));
            geVar.setImageResource(R.drawable.msg_input_attach2);
            geVar.setBackground(org.telegram.ui.ActionBar.j6.f0(i0(i15), 1, -1));
            ceVar.addView(geVar, k7.b6.e(44, 44, 85));
            geVar.setOnClickListener(new kd(this, 18));
            geVar.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
            H1(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.p1 = imageView3;
        j0 j0Var = new j0(activity);
        this.o1 = j0Var;
        imageView3.setImageDrawable(j0Var);
        imageView3.setScaleType(scaleType);
        int i05 = i0(i14);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(i05, mode2));
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.f0(i0(i15), 1, AndroidUtilities.dp(16.0f)));
        aeVar.addView(imageView3, k7.b6.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        k7.d6.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ud
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        int i162 = ChatActivityEnterView.j5;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, f6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.O = string;
                        d2Var.Q = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    default:
                        int i17 = ChatActivityEnterView.j5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        org.telegram.ui.zn znVar2 = chatActivityEnterView2.L2;
                        long a2 = znVar2 != null ? znVar2.a() : chatActivityEnterView2.M2;
                        boolean z10 = chatActivityEnterView2.z1;
                        org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                        if (!z10) {
                            if (chatActivityEnterView2.B0 != null) {
                                f0 f0Var = new f0(chatActivityEnterView2.getContext(), f6Var2);
                                f0Var.m0(chatActivityEnterView2.B0.getText());
                                f0Var.g0 = new sd(chatActivityEnterView2, 1);
                                boolean z11 = chatActivityEnterView2.V1 != null;
                                td tdVar = new td(chatActivityEnterView2, a2, f6Var2, 1);
                                f0Var.i0 = a2;
                                f0Var.j0 = z11;
                                f0Var.k0 = tdVar;
                                f0Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.A1 != null) {
                            f0 f0Var2 = new f0(chatActivityEnterView2.getContext(), f6Var2);
                            f0Var2.n0(chatActivityEnterView2.A1);
                            f0Var2.h0 = new sd(chatActivityEnterView2, 0);
                            td tdVar2 = new td(chatActivityEnterView2, a2, f6Var2, 0);
                            f0Var2.i0 = a2;
                            f0Var2.l0 = tdVar2;
                            f0Var2.show();
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
        this.q1 = imageView4;
        imageView4.setImageResource(R.drawable.iv_fullscreen);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(i0(i14), mode2));
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(i0(i15), 1, AndroidUtilities.dp(16.0f)));
        aeVar.addView(imageView4, k7.b6.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.ArticleEditor));
        k7.d6.a(imageView4);
        imageView4.setOnClickListener(new kd(this, 20));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.X2 != null) {
            X();
        }
        ImageView imageView5 = new ImageView(activity);
        this.x1 = imageView5;
        imageView5.setImageResource(R.drawable.send_outline);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        imageView5.setColorFilter(i0(org.telegram.ui.ActionBar.j6.hl), mode);
        aeVar.addView(imageView5, k7.b6.e(44, 44, 85));
        ae aeVar2 = new ae(this, activity, i11);
        this.w1 = aeVar2;
        aeVar2.setClipChildren(false);
        aeVar2.setClipToPadding(false);
        aeVar.addView(aeVar2, k7.b6.e(100, 44, 85));
        le leVar = new le(this, activity, f6Var);
        this.W0 = leVar;
        leVar.setSoundEffectsEnabled(false);
        aeVar2.addView(leVar, k7.b6.e(44, 44, 85));
        leVar.setFocusable(true);
        leVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.J3 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(i0(i14), mode2));
        Drawable mutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.K3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i0(i14), mode2));
        me meVar = new me(this, activity);
        this.Y0 = meVar;
        meVar.setImportantForAccessibility(2);
        int dp8 = AndroidUtilities.dp(10.0f);
        meVar.setPadding(dp8, dp8, dp8, dp8);
        leVar.addView(meVar, k7.b6.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.M0 = imageView6;
        int i17 = 4;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ne neVar = new ne();
        this.L1 = neVar;
        imageView6.setImageDrawable(neVar);
        imageView6.setContentDescription(LocaleController.getString("Cancel", R.string.Cancel));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        imageView6.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(i0(i15), 1, -1));
        aeVar2.addView(imageView6, k7.b6.e(44, 44, 85));
        imageView6.setOnClickListener(new kd(this, 0));
        oe oeVar = new oe(this, activity, c() ? R.drawable.input_schedule : R.drawable.send_plane_24, f6Var, 0);
        this.G0 = oeVar;
        oeVar.setVisibility(4);
        oeVar.setContentDescription(LocaleController.getString(R.string.Send));
        int i18 = 0;
        oeVar.setSoundEffectsEnabled(false);
        oeVar.setScaleX(0.1f);
        oeVar.setScaleY(0.1f);
        oeVar.setAlpha(0.0f);
        aeVar2.addView(oeVar, k7.b6.e(100, 44, 85));
        oeVar.setOnClickListener(new kd(this, i11));
        oeVar.setOnLongClickListener(new nd(this, i18));
        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            aeVar2.setOnLongClickListener(new nd(this, i18));
        }
        lh.f5 f5Var = new lh.f5(activity, f6Var);
        this.F0 = f5Var;
        f5Var.setVisibility(4);
        f5Var.setOnClickListener(new kd(this, i17));
        aeVar2.addView(f5Var, k7.b6.e(44, 44, 85));
        mg mgVar = new mg(activity);
        this.C0 = mgVar;
        org.telegram.ui.ActionBar.k5 k5Var = mgVar.a;
        k5Var.setTextSize(16);
        mgVar.invalidate();
        mgVar.setVisibility(4);
        mgVar.setSoundEffectsEnabled(false);
        mgVar.setScaleX(0.1f);
        mgVar.setScaleY(0.1f);
        mgVar.setAlpha(0.0f);
        mgVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        k5Var.setGravity(21);
        mgVar.invalidate();
        k5Var.setTextColor(i0(i14));
        mgVar.invalidate();
        aeVar2.addView(mgVar, k7.b6.e(74, 44, 85));
        mgVar.setOnClickListener(new kd(this, 8));
        mgVar.setOnLongClickListener(new nd(this, i11));
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        this.t2 = globalEmojiSettings.getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.u2 = globalEmojiSettings.getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
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
    public static boolean H(int i10, long j10, org.telegram.ui.ActionBar.p2 p2Var, CharSequence charSequence) {
        u5[] u5VarArr;
        int i11;
        int i12;
        boolean z4;
        TLRPC.ChatFull chatFull;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        ArrayList<TLRPC.StickerSetCovered> arrayList;
        int i13;
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList4;
        ArrayList<TLRPC.Document> arrayList5;
        if (charSequence != null && p2Var != null && !UserConfig.getInstance(i10).isPremium() && UserConfig.getInstance(i10).getClientUserId() != j10 && (charSequence instanceof Spanned) && (u5VarArr = (u5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), u5.class)) != null) {
            int i14 = 0;
            while (i14 < u5VarArr.length) {
                u5 u5Var = u5VarArr[i14];
                if (u5Var != null) {
                    TLRPC.Document document = u5Var.document;
                    if (document == null) {
                        i12 = i10;
                        document = l5.f(i12, u5Var.getDocumentId());
                    } else {
                        i12 = i10;
                    }
                    long documentId = u5VarArr[i14].getDocumentId();
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
                                    z4 = false;
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
                            z4 = false;
                            if (document != null) {
                                break;
                            }
                            stickerSets = arrayList4;
                            i14 = i11;
                        }
                    }
                    i11 = i14;
                    z4 = false;
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
                                return z4;
                            }
                        }
                    }
                    if (document == null || !MessageObject.isFreeEmoji(document)) {
                        qc.a0(p2Var).q(document, AndroidUtilities.replaceTags(LocaleController.getString("UnlockPremiumEmojiHint", R.string.UnlockPremiumEmojiHint)), LocaleController.getString("PremiumMore", R.string.PremiumMore), new jd(0, p2Var)).j();
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

    public static void f(final ChatActivityEnterView chatActivityEnterView, final fv0 fv0Var, int[] iArr, xo0 xo0Var) {
        o1.j jVar;
        Dialog dialog;
        o1.j jVar2;
        int[] iArr2 = chatActivityEnterView.J2;
        if (chatActivityEnterView.n0 == null) {
            return;
        }
        Dialog dialog2 = new Dialog(chatActivityEnterView.getContext(), R.style.TransparentDialogNoAnimation);
        FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
        frameLayout.addView(fv0Var, k7.b6.e(40, 40, 3));
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
        AndroidUtilities.setLightStatusBar(dialog2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.s8, true) == -1);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            AndroidUtilities.setLightNavigationBar(dialog2, AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, true)) >= 0.721f);
        }
        if (i10 >= 23) {
            chatActivityEnterView.p0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.p0;
        }
        chatActivityEnterView.m0.getLocationInWindow(iArr2);
        final float f10 = iArr2[0];
        final float f11 = iArr2[1];
        float dp = AndroidUtilities.dp(5.0f);
        float dp2 = iArr[0] + chatActivityEnterView.p0 + dp + AndroidUtilities.dp(4.0f) + 0.0f;
        float f12 = iArr[1] + chatActivityEnterView.q0 + dp + 0.0f;
        fv0Var.setTranslationX(dp2);
        fv0Var.setTranslationY(f12);
        float scaleX = (chatActivityEnterView.m0.getLayoutParams().width * (chatActivityEnterView.h5 ? chatActivityEnterView.m0.getScaleX() : 1.0f)) / AndroidUtilities.dp(40.0f);
        fv0Var.setPivotX(0.0f);
        fv0Var.setPivotY(0.0f);
        fv0Var.setScaleX(0.75f);
        fv0Var.setScaleY(0.75f);
        fv0Var.getViewTreeObserver().addOnDrawListener(new we(fv0Var, xo0Var));
        dialog2.show();
        if (!chatActivityEnterView.h5) {
            chatActivityEnterView.m0.setScaleX(1.0f);
            chatActivityEnterView.m0.setScaleY(1.0f);
        }
        chatActivityEnterView.m0.setAlpha(1.0f);
        ve veVar = chatActivityEnterView.n0;
        boolean z4 = chatActivityEnterView.h5;
        o1.c cVar = o1.h.o;
        if (z4) {
            jVar = null;
        } else {
            o1.j jVar3 = new o1.j(chatActivityEnterView.m0, cVar);
            jVar3.u = org.telegram.ui.ai.m(0.5f, 750.0f, 1.0f);
            jVar = jVar3;
        }
        boolean z10 = chatActivityEnterView.h5;
        o1.c cVar2 = o1.h.p;
        if (z10) {
            dialog = dialog2;
            jVar2 = null;
        } else {
            dialog = dialog2;
            o1.j jVar4 = new o1.j(chatActivityEnterView.m0, cVar2);
            jVar4.u = org.telegram.ui.ai.m(0.5f, 750.0f, 1.0f);
            jVar2 = jVar4;
        }
        o1.j jVar5 = new o1.j(chatActivityEnterView.m0, o1.h.t);
        jVar5.u = org.telegram.ui.ai.m(0.0f, 750.0f, 1.0f);
        final int i11 = 0;
        final Dialog dialog3 = dialog;
        jVar5.a(new o1.f(chatActivityEnterView) { // from class: org.telegram.ui.Components.md
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = chatActivityEnterView;
            }

            @Override // o1.f
            public final void a(o1.h hVar, boolean z11, float f13, float f14) {
                int i12 = i11;
                float f15 = f11;
                float f16 = f10;
                fv0 fv0Var2 = fv0Var;
                Dialog dialog4 = dialog3;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                int i13 = 0;
                switch (i12) {
                    case 0:
                        int i14 = ChatActivityEnterView.j5;
                        if (dialog4.isShowing()) {
                            fv0Var2.setTranslationX(f16);
                            fv0Var2.setTranslationY(f15);
                            zo0 zo0Var = chatActivityEnterView2.m0;
                            zo0Var.getClass();
                            zo0Var.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.h5) {
                                chatActivityEnterView2.m0.setScaleX(1.0f);
                                chatActivityEnterView2.m0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.m0.setAlpha(1.0f);
                            chatActivityEnterView2.m0.getViewTreeObserver().addOnPreDrawListener(new xe(chatActivityEnterView2, dialog4, i13));
                            break;
                        }
                        break;
                    default:
                        int i15 = ChatActivityEnterView.j5;
                        if (dialog4.isShowing()) {
                            fv0Var2.setTranslationX(f16);
                            fv0Var2.setTranslationY(f15);
                            zo0 zo0Var2 = chatActivityEnterView2.m0;
                            zo0Var2.getClass();
                            zo0Var2.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.h5) {
                                chatActivityEnterView2.m0.setScaleX(1.0f);
                                chatActivityEnterView2.m0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.m0.setAlpha(1.0f);
                            chatActivityEnterView2.m0.getViewTreeObserver().addOnPreDrawListener(new xe(chatActivityEnterView2, dialog4, 1));
                            break;
                        }
                        break;
                }
            }
        });
        o1.j jVar6 = new o1.j(fv0Var, o1.h.m);
        jVar6.b = k7.n.a(dp2, f10 - AndroidUtilities.dp(6.0f), dp2);
        jVar6.c = true;
        jVar6.u = org.telegram.ui.ai.m(f10, 700.0f, 0.75f);
        jVar6.h = f10 - AndroidUtilities.dp(6.0f);
        o1.j jVar7 = new o1.j(fv0Var, o1.h.n);
        jVar7.b = k7.n.a(f12, f12, AndroidUtilities.dp(6.0f) + f11);
        jVar7.c = true;
        jVar7.u = org.telegram.ui.ai.m(f11, 700.0f, 0.75f);
        jVar7.g = AndroidUtilities.dp(6.0f) + f11;
        jVar7.b(new ze(f11, fv0Var));
        final int i12 = 1;
        jVar7.a(new o1.f(chatActivityEnterView) { // from class: org.telegram.ui.Components.md
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = chatActivityEnterView;
            }

            @Override // o1.f
            public final void a(o1.h hVar, boolean z11, float f13, float f14) {
                int i122 = i12;
                float f15 = f11;
                float f16 = f10;
                fv0 fv0Var2 = fv0Var;
                Dialog dialog4 = dialog3;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                int i13 = 0;
                switch (i122) {
                    case 0:
                        int i14 = ChatActivityEnterView.j5;
                        if (dialog4.isShowing()) {
                            fv0Var2.setTranslationX(f16);
                            fv0Var2.setTranslationY(f15);
                            zo0 zo0Var = chatActivityEnterView2.m0;
                            zo0Var.getClass();
                            zo0Var.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.h5) {
                                chatActivityEnterView2.m0.setScaleX(1.0f);
                                chatActivityEnterView2.m0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.m0.setAlpha(1.0f);
                            chatActivityEnterView2.m0.getViewTreeObserver().addOnPreDrawListener(new xe(chatActivityEnterView2, dialog4, i13));
                            break;
                        }
                        break;
                    default:
                        int i15 = ChatActivityEnterView.j5;
                        if (dialog4.isShowing()) {
                            fv0Var2.setTranslationX(f16);
                            fv0Var2.setTranslationY(f15);
                            zo0 zo0Var2 = chatActivityEnterView2.m0;
                            zo0Var2.getClass();
                            zo0Var2.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.h5) {
                                chatActivityEnterView2.m0.setScaleX(1.0f);
                                chatActivityEnterView2.m0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.m0.setAlpha(1.0f);
                            chatActivityEnterView2.m0.getViewTreeObserver().addOnPreDrawListener(new xe(chatActivityEnterView2, dialog4, 1));
                            break;
                        }
                        break;
                }
            }
        });
        o1.j jVar8 = new o1.j(fv0Var, cVar);
        jVar8.u = org.telegram.ui.ai.m(scaleX, 1000.0f, 1.0f);
        o1.j jVar9 = new o1.j(fv0Var, cVar2);
        jVar9.u = org.telegram.ui.ai.m(scaleX, 1000.0f, 1.0f);
        veVar.l(jVar, jVar2, jVar5, jVar6, jVar7, jVar8, jVar9);
    }

    public static void g(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z4, int i10, int i11, Object obj, Long l10, boolean z10) {
        if (chatActivityEnterView.D0 > 0 && !chatActivityEnterView.c()) {
            eg egVar = chatActivityEnterView.V2;
            if (egVar != null) {
                mg mgVar = chatActivityEnterView.C0;
                egVar.y1(mgVar, mgVar.a.getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.N1 != 0) {
            chatActivityEnterView.m1(0, true);
            chatActivityEnterView.R0.t(true);
            chatActivityEnterView.R0.B();
        }
        chatActivityEnterView.n1(false, true, false, true);
        eg egVar2 = chatActivityEnterView.V2;
        TL_stories.StoryItem i12 = egVar2 != null ? egVar2.i1() : null;
        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.N);
        long j10 = chatActivityEnterView.M2;
        MessageObject messageObject = chatActivityEnterView.P2;
        MessageObject threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.pn pnVar = chatActivityEnterView.R2;
        boolean z11 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.zn znVar = chatActivityEnterView.L2;
        sendMessagesHelper.sendSticker(document, str, j10, messageObject, threadMessage, i12, pnVar, sendAnimationData, z4, i10, i11, z11, obj, znVar != null ? znVar.C8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        eg egVar3 = chatActivityEnterView.V2;
        if (egVar3 != null) {
            egVar3.G(null, true, i10, 0, 0L);
        }
        if (z10) {
            chatActivityEnterView.setFieldText("");
        }
        MediaDataController.getInstance(chatActivityEnterView.N).addRecentSticker(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MessageObject getThreadMessage() {
        org.telegram.ui.zn znVar = this.L2;
        if (znVar != null) {
            return znVar.U3;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getThreadMessageId() {
        MessageObject messageObject;
        org.telegram.ui.zn znVar = this.L2;
        if (znVar == null || (messageObject = znVar.U3) == null) {
            return 0;
        }
        return messageObject.getId();
    }

    private String getTopicKeyString() {
        org.telegram.ui.zn znVar = this.L2;
        if (znVar == null || !znVar.e4) {
            return "" + this.M2;
        }
        return this.M2 + "_" + znVar.d();
    }

    public static void h(ChatActivityEnterView chatActivityEnterView, TL_keyboard.KeyboardButton keyboardButton) {
        org.telegram.ui.zn znVar;
        boolean z4 = chatActivityEnterView.P2 != null && (znVar = chatActivityEnterView.L2) != null && znVar.e4 && znVar.d() == ((long) chatActivityEnterView.P2.getId());
        MessageObject messageObject = ((chatActivityEnterView.P2 == null || z4) && !BotForumHelper.isBotForum(chatActivityEnterView.N, chatActivityEnterView.M2)) ? DialogObject.isChatDialog(chatActivityEnterView.M2) ? chatActivityEnterView.i2 : null : chatActivityEnterView.P2;
        MessageObject messageObject2 = chatActivityEnterView.P2;
        if (messageObject2 == null || z4) {
            messageObject2 = chatActivityEnterView.i2;
        }
        boolean c02 = chatActivityEnterView.c0(keyboardButton, messageObject, messageObject2, null);
        if (chatActivityEnterView.P2 == null || z4) {
            MessageObject messageObject3 = chatActivityEnterView.i2;
            if (messageObject3 != null && messageObject3.messageOwner.reply_markup.single_use) {
                if (c02) {
                    chatActivityEnterView.I0();
                } else {
                    chatActivityEnterView.t1(0, 0, true, true);
                }
                MessagesController.getMainSettings(chatActivityEnterView.N).edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.i2.getId()).commit();
            }
        } else {
            chatActivityEnterView.I0();
            chatActivityEnterView.Z0(chatActivityEnterView.S2, true, false);
        }
        eg egVar = chatActivityEnterView.V2;
        if (egVar != null) {
            egVar.G(null, true, 0, 0, 0L);
        }
    }

    public static /* synthetic */ void i(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        Activity activity = chatActivityEnterView.K2;
        if (Build.VERSION.SDK_INT < 23 || activity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
            SendMessagesHelper.getInstance(chatActivityEnterView.N).sendCurrentLocation(messageObject, keyboardButtonProto);
            return;
        }
        activity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
        chatActivityEnterView.e3 = messageObject;
        chatActivityEnterView.f3 = keyboardButtonProto;
    }

    public static void m(ChatActivityEnterView chatActivityEnterView) {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            chatActivityEnterView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(chatActivityEnterView, "lockAnimatedTranslation", chatActivityEnterView.g4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(chatActivityEnterView, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(mr.h);
        ofFloat2.setDuration(250L);
        SharedConfig.removeLockRecordAudioVideoHint();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(chatActivityEnterView, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(chatActivityEnterView.g1, "cancelToProgress", 1.0f));
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
                            p51 p51Var = new p51("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i11 = messageEntity.offset;
                            spannableStringBuilder.setSpan(p51Var, i11, messageEntity.length + i11, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            p51 p51Var2 = new p51("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i12 = messageEntity.offset;
                            spannableStringBuilder.setSpan(p51Var2, i12, messageEntity.length + i12, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            s01 s01Var = new s01();
                            s01Var.a |= 4;
                            t01 t01Var = new t01(s01Var, 0);
                            int i13 = messageEntity.offset;
                            MediaDataController.addStyleToText(t01Var, i13, messageEntity.length + i13, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                s01 s01Var2 = new s01();
                                s01Var2.a |= 1;
                                t01 t01Var2 = new t01(s01Var2, 0);
                                int i14 = messageEntity.offset;
                                MediaDataController.addStyleToText(t01Var2, i14, messageEntity.length + i14, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                s01 s01Var3 = new s01();
                                s01Var3.a |= 2;
                                t01 t01Var3 = new t01(s01Var3, 0);
                                int i15 = messageEntity.offset;
                                MediaDataController.addStyleToText(t01Var3, i15, messageEntity.length + i15, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                s01 s01Var4 = new s01();
                                s01Var4.a |= 8;
                                t01 t01Var4 = new t01(s01Var4, 0);
                                int i16 = messageEntity.offset;
                                MediaDataController.addStyleToText(t01Var4, i16, messageEntity.length + i16, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                s01 s01Var5 = new s01();
                                s01Var5.a |= 16;
                                t01 t01Var5 = new t01(s01Var5, 0);
                                int i17 = messageEntity.offset;
                                MediaDataController.addStyleToText(t01Var5, i17, messageEntity.length + i17, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                o51 o51Var = new o51(messageEntity.url, null);
                                int i18 = messageEntity.offset;
                                spannableStringBuilder.setSpan(o51Var, i18, messageEntity.length + i18, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                s01 s01Var6 = new s01();
                                s01Var6.a |= 128;
                                int i19 = messageEntity.offset;
                                s01Var6.b = i19;
                                s01Var6.c = i19 + messageEntity.length;
                                s01Var6.d = messageEntity;
                                int i20 = messageEntity.offset;
                                i10 i10Var = new i10(spannableStringBuilder.subSequence(i20, messageEntity.length + i20).toString(), s01Var6, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i21 = messageEntity.offset;
                                spannableStringBuilder.setSpan(i10Var, i21, messageEntity.length + i21, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                s01 s01Var7 = new s01();
                                s01Var7.a |= 256;
                                t01 t01Var6 = new t01(s01Var7, 0);
                                int i22 = messageEntity.offset;
                                MediaDataController.addStyleToText(t01Var6, i22, messageEntity.length + i22, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                u5 u5Var = tL_messageEntityCustomEmoji.document != null ? new u5(tL_messageEntityCustomEmoji.document, fontMetricsInt) : new u5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                int i23 = messageEntity.offset;
                                spannableStringBuilder.setSpan(u5Var, i23, messageEntity.length + i23, 33);
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
            boolean z4 = false;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if (i27 != intValue) {
                    int i29 = intValue - 1;
                    int i30 = (i29 < 0 || i29 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(i29) != '\n') ? intValue : intValue - 1;
                    if (i28 > 0) {
                        aj0.c(spannableStringBuilder, i27, i30, z4);
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
                    z4 = (intValue2 & 16) != 0;
                }
            }
            if (i27 < spannableStringBuilder.length() && i28 > 0) {
                aj0.c(spannableStringBuilder, i27, spannableStringBuilder.length(), z4);
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
                        StringBuilder sb = new StringBuilder();
                        sb.append("```");
                        String str = messageEntity3.language;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        sb.append("\n");
                        spannableStringBuilder2.insert(i31, (CharSequence) sb.toString());
                    }
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        return replaceEmoji;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlowModeButtonVisible(boolean z4) {
        int i10;
        int i11 = z4 ? 0 : 8;
        mg mgVar = this.C0;
        mgVar.setVisibility(i11);
        if (z4) {
            i10 = AndroidUtilities.dp(mgVar.e ? 26.0f : 16.0f);
        } else {
            i10 = 0;
        }
        ff ffVar = this.B0;
        if (ffVar == null || ffVar.getPaddingRight() == i10) {
            return;
        }
        this.B0.setPadding(0, AndroidUtilities.dp(9.0f), i10, AndroidUtilities.dp(10.0f));
    }

    public final void A() {
        dh.d dVar = this.a1;
        if (dVar != null) {
            dVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.J1;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.p2 = null;
        x0();
        if (this.l1 != null) {
            this.x = 0.0f;
            A1();
        }
        SlideTextView slideTextView = this.g1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.V2.c();
        P1(true);
    }

    public final void A1() {
        z1();
        dg.u3 u3Var = this.l1;
        if (u3Var != null) {
            u3Var.setTranslationX(this.y + this.x);
            u3Var.setAlpha(this.B * this.C);
            u3Var.setVisibility(u3Var.getAlpha() > 0.0f ? 0 : 8);
            ge geVar = this.n1;
            if (geVar != null && this.w4) {
                geVar.setAlpha(this.r1 * this.C);
            }
        }
        qe qeVar = this.F1;
        if (qeVar != null) {
            qeVar.setTranslationX(qeVar.a);
        }
    }

    public final void B() {
        if (this.a2 && this.Z0) {
            CameraController.getInstance().cancelOnInitRunnable(this.D3);
            this.V2.p2(5, 0, this.L ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, this.O4, 0L, true);
            this.O4 = 0L;
            this.G0.setEffect(0L);
        } else {
            this.V2.f1(0);
            MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
        }
        this.B2 = false;
        L1(2, true);
    }

    public final void B0() {
        qk0 qk0Var = this.e1;
        if (qk0Var != null) {
            qk0Var.N = true;
            i71 i71Var = qk0Var.n;
            if (i71Var != null) {
                i71Var.P(false);
                qk0Var.n.H();
                qk0Var.n = null;
            }
        }
        if (this.e1 != null && this.X2 != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.N);
            long j10 = this.M2;
            org.telegram.ui.zn znVar = this.L2;
            long d = (znVar == null || !znVar.e4) ? 0L : znVar.d();
            qk0 qk0Var2 = this.e1;
            float audioLeft = qk0Var2 == null ? 0.0f : qk0Var2.getAudioLeft();
            qk0 qk0Var3 = this.e1;
            mediaDataController.setDraftVoiceRegion(j10, d, audioLeft, qk0Var3 == null ? 1.0f : qk0Var3.getAudioRight());
        }
        this.U1 = true;
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.recordStarted);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.recordPaused);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.recordResumed);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.recordStartError);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.recordStopped);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.recordProgressChanged);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.audioDidSent);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.audioRouteChanged);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.messageReceivedByServer2);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.sendingMessagesChanged);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.audioRecordTooShort);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.updateBotMenuButton);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.didUpdatePremiumGiftFieldIcon);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        uf ufVar = this.R0;
        if (ufVar != null) {
            ufVar.D();
        }
        id idVar = this.E0;
        if (idVar != null) {
            AndroidUtilities.cancelRunOnUIThread(idVar);
            this.E0 = null;
        }
        PowerManager.WakeLock wakeLock = this.m2;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.m2 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        qv0 qv0Var = this.i1;
        if (qv0Var != null) {
            qv0Var.setDelegate(null);
        }
        ve veVar = this.n0;
        if (veVar != null) {
            veVar.e = false;
            veVar.dismiss();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b3, code lost:
    
        if (android.text.TextUtils.isEmpty(r15 == null ? "" : org.telegram.messenger.AndroidUtilities.getTrimmedString(r15.getTextToUse())) != false) goto L124;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B1(boolean z4) {
        se seVar;
        if (this.T3) {
            org.telegram.ui.zn znVar = this.L2;
            if (znVar != null && !znVar.K5) {
                z4 = false;
            }
            boolean j02 = j0();
            boolean z10 = this.i5 != 1 && this.M2 > 0;
            se seVar2 = this.t1;
            boolean z11 = seVar2 != null && seVar2.getVisibility() == 0;
            if (!j02 && !this.l2 && this.j2 == null) {
                se seVar3 = this.t1;
                if (seVar3 != null) {
                    seVar3.setVisibility(8);
                }
            } else if (this.j2 != null) {
                if (t0() && this.b2 == 1 && this.j2.is_persistent) {
                    se seVar4 = this.t1;
                    if (seVar4 != null && seVar4.getVisibility() != 8) {
                        this.t1.setVisibility(8);
                    }
                } else {
                    Q();
                    if (this.t1.getVisibility() != 0) {
                        this.t1.setVisibility(0);
                    }
                    this.Q1.a(R.drawable.input_bot2, true);
                    this.t1.setContentDescription(LocaleController.getString("AccDescrBotKeyboard", R.string.AccDescrBotKeyboard));
                }
            } else if (z10) {
                se seVar5 = this.t1;
                if (seVar5 != null) {
                    seVar5.setVisibility(8);
                }
            } else {
                Q();
                this.Q1.a(R.drawable.input_bot1, true);
                this.t1.setContentDescription(LocaleController.getString("AccDescrBotCommands", R.string.AccDescrBotCommands));
                this.t1.setVisibility(0);
            }
            if (z10) {
                R();
            }
            se seVar6 = this.t1;
            boolean z12 = (seVar6 != null && seVar6.getVisibility() == 0) != z11;
            rh.z zVar = this.i0;
            int i10 = 2;
            if (zVar != null) {
                boolean z13 = zVar.w;
                zVar.setWebView(this.i5 == 3);
                rh.z zVar2 = this.i0;
                String string = this.i5 == 2 ? LocaleController.getString(R.string.BotsMenuTitle) : this.f0;
                if (string == null) {
                    zVar2.getClass();
                    string = LocaleController.getString(R.string.BotsMenuTitle);
                }
                String str = zVar2.n;
                boolean z14 = str == null || !str.equals(string);
                zVar2.n = string;
                zVar2.r = null;
                zVar2.requestLayout();
                AndroidUtilities.updateViewVisibilityAnimated(this.i0, z10, 0.5f, z4);
                z12 = z12 || z14 || z13 != this.i0.w;
            }
            if (z12 && z4) {
                de deVar = this.N0;
                Float valueOf = Float.valueOf(deVar.getX());
                HashMap hashMap = this.y0;
                hashMap.put(deVar, valueOf);
                ff ffVar = this.B0;
                if (ffVar != null) {
                    hashMap.put(ffVar, Float.valueOf(ffVar.getX()));
                }
                se seVar7 = this.t1;
                boolean z15 = seVar7 != null && seVar7.getVisibility() == 0;
                if (z15 != z11 && (seVar = this.t1) != null) {
                    seVar.setVisibility(0);
                    if (z15) {
                        this.t1.setAlpha(0.0f);
                        this.t1.setScaleX(0.1f);
                        this.t1.setScaleY(0.1f);
                    } else if (!z15) {
                        this.t1.setAlpha(1.0f);
                        this.t1.setScaleX(1.0f);
                        this.t1.setScaleY(1.0f);
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(this.t1, z15, 0.1f, true, 1.0f, true, new gd(this, 1));
                }
            }
            se seVar8 = this.t1;
            if (seVar8 != null && seVar8.getVisibility() == 0) {
                ff ffVar2 = this.B0;
            }
            i10 = this.L4;
            H1(i10);
        }
    }

    public final void C() {
        se seVar;
        org.telegram.ui.zn znVar;
        if (this.I != null || (seVar = this.G1) == null || seVar.getRight() == 0 || (znVar = this.L2) == null || !BirthdayController.isToday(znVar.X7)) {
            return;
        }
        if (MessagesController.getInstance(this.N).getMainSettings().getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + znVar.a(), true)) {
            MessagesController.getInstance(this.N).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + znVar.a(), false).apply();
            ph.f3 f3Var = new ph.f3(getContext(), 3);
            this.I = f3Var;
            f3Var.q(13.0f);
            this.I.p(true);
            W0();
            this.I.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            this.I.m(1.0f, -((getWidth() - AndroidUtilities.dp(12.0f)) - ((this.G1.getMeasuredWidth() / 2.0f) + (this.G1.getX() + (this.l1.getX() + this.u1.getX())))));
            addView(this.I, k7.b6.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
            ph.f3 f3Var2 = this.I;
            f3Var2.i0 = new id(this, 12);
            f3Var2.d = 8000L;
            f3Var2.u();
        }
    }

    public final void C1() {
        int c3;
        f2.i0 i0Var;
        int L0;
        View m9;
        df dfVar = this.j0;
        if (dfVar == null) {
            return;
        }
        int childCount = dfVar.c.getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = this.j0.c.getChildAt(i11);
            if (i11 < 4) {
                i10 += childAt.getMeasuredHeight();
            }
        }
        qv0 qv0Var = this.i1;
        if (i10 > 0) {
            c3 = kf.k0.c(childCount > 4 ? 12.0f : 0.0f, (qv0Var.getMeasuredHeight() - i10) - AndroidUtilities.dp(8.0f), 0);
        } else {
            c3 = this.k0.c.size() > 4 ? kf.k0.c(162.8f, qv0Var.getMeasuredHeight(), 0) : kf.k0.c((Math.max(1, Math.min(4, this.k0.c.size())) * 36) + 8, qv0Var.getMeasuredHeight(), 0);
        }
        if (this.j0.c.getPaddingTop() != c3) {
            this.j0.c.setTopGlowOffset(c3);
            if (this.R4 == -1 && this.j0.getVisibility() == 0 && this.j0.c.getLayoutManager() != null && (L0 = (i0Var = (f2.i0) this.j0.c.getLayoutManager()).L0()) >= 0 && (m9 = i0Var.m(L0)) != null) {
                this.R4 = L0;
                this.S4 = m9.getTop() - this.j0.c.getPaddingTop();
            }
            this.j0.c.setPadding(0, c3, 0, AndroidUtilities.dp(8.0f));
        }
    }

    public final void D() {
        ff ffVar = this.B0;
        boolean z4 = ((ffVar != null && !TextUtils.isEmpty(ffVar.getText())) || this.v2 || this.g3 || t0()) ? false : true;
        if (z4) {
            R();
        }
        rh.z zVar = this.i0;
        if (zVar != null) {
            boolean z10 = zVar.f;
            if (z10 != z4) {
                zVar.f = z4;
                zVar.requestLayout();
                zVar.invalidate();
            }
            if (z10 != this.i0.f) {
                de deVar = this.N0;
                Float valueOf = Float.valueOf(deVar.getX());
                HashMap hashMap = this.y0;
                hashMap.put(deVar, valueOf);
                ff ffVar2 = this.B0;
                if (ffVar2 != null) {
                    hashMap.put(ffVar2, Float.valueOf(ffVar2.getX()));
                }
            }
        }
    }

    public final void D0() {
        this.f2 = true;
        ve veVar = this.n0;
        if (veVar != null) {
            veVar.e = false;
            veVar.dismiss();
        }
        if (this.v2) {
            this.h2 = true;
        }
        id idVar = new id(this, 8);
        this.J4 = idVar;
        AndroidUtilities.runOnUIThread(idVar, 500L);
    }

    public final void D1(boolean z4) {
        if (this.i5 != 1 && this.M2 > 0) {
            R();
        }
        rh.z zVar = this.i0;
        if (zVar != null) {
            zVar.setWebView(j0());
        }
        B1(z4);
    }

    public final void E() {
        org.telegram.ui.zn znVar = this.L2;
        if (znVar == null) {
            return;
        }
        K1(znVar.e, znVar.X7);
    }

    public final void E0() {
        ff ffVar;
        this.f2 = false;
        id idVar = this.J4;
        if (idVar != null) {
            AndroidUtilities.cancelRunOnUIThread(idVar);
            this.J4 = null;
        }
        if (j0() && v()) {
            return;
        }
        getVisibility();
        if (!this.h2 || org.telegram.ui.ActionBar.p2.hasSheets(this.L2)) {
            return;
        }
        this.h2 = false;
        eg egVar = this.V2;
        if (egVar != null) {
            egVar.w1();
        }
        if (this.N1 == 0 && (ffVar = this.B0) != null) {
            ffVar.requestFocus();
        }
        AndroidUtilities.showKeyboard(this.B0);
        if (AndroidUtilities.usingHardwareInput || this.v2 || AndroidUtilities.isInMultiwindow) {
            return;
        }
        this.g3 = true;
        re reVar = this.n3;
        AndroidUtilities.cancelRunOnUIThread(reVar);
        AndroidUtilities.runOnUIThread(reVar, 100L);
    }

    public final void E1() {
        ff ffVar = this.B0;
        boolean z4 = false;
        p1((ffVar == null || ffVar.getLineCount() <= 2 || this.B0.getText() == null || TextUtils.isEmpty(this.B0.getText().toString().trim())) ? false : true);
        ff ffVar2 = this.B0;
        if (ffVar2 != null && ffVar2.getLineCount() > 2 && this.B0.getText() != null && !TextUtils.isEmpty(this.B0.getText().toString().trim())) {
            z4 = true;
        }
        v1(z4);
    }

    public final void F(boolean z4) {
        MessageObject messageObject;
        boolean z10 = this.M2 < 0 && this.T3 && this.V1 == null && (kf.w.g(this.N).e(getEditText() != null ? getEditText().toString() : null, this.T4) > 0 || ((messageObject = this.P2) != null && messageObject.isEphemeral()));
        xd.a aVar = this.e5;
        boolean z11 = aVar.f != z10;
        aVar.a(z10, z4);
        oe oeVar = this.G0;
        if (oeVar != null) {
            oeVar.v = z10;
            oeVar.invalidate();
        }
        if (z11) {
            J(z4);
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
        org.telegram.ui.zn znVar;
        TLRPC.User user;
        int measuredHeight;
        float f10;
        ff ffVar;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        ArrayList<MessageObject> arrayList;
        long j10;
        oe oeVar;
        org.telegram.ui.fl flVar;
        boolean z4;
        MessagePreviewParams messagePreviewParams2;
        int i10;
        p70 F;
        boolean z10;
        boolean z11;
        ff ffVar2;
        int i11 = 0;
        if (c() || (((znVar = this.L2) != null && znVar.O3 == 5) || this.e5.f)) {
            return false;
        }
        boolean z12 = this.w4;
        int i12 = 3;
        oe oeVar2 = this.G0;
        org.telegram.ui.ActionBar.f6 f6Var = this.S3;
        int i13 = 2;
        boolean z13 = true;
        if (z12 || !(((ffVar = this.B0) != null && !TextUtils.isEmpty(ffVar.getText())) || znVar == null || (messagePreviewParams = znVar.c5) == null || (messages = messagePreviewParams.forwardMessages) == null || (arrayList = messages.messages) == null || arrayList.isEmpty())) {
            boolean z14 = znVar != null && UserObject.isUserSelf(znVar.i());
            if (this.L0 == null) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(this.K2, f6Var);
                this.L0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                this.L0.setOnTouchListener(new af(this));
                this.L0.setDispatchKeyEventListener(new qd(this));
                this.L0.setShownFromBottom(false);
                boolean z15 = znVar != null && znVar.D6();
                boolean z16 = !z14 && (this.D0 <= 0 || c());
                if (z15) {
                    boolean z17 = !z16;
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, getContext(), this.S3, true, z17);
                    this.C4 = g1Var;
                    if (z14) {
                        f10 = 196.0f;
                        g1Var.g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                    } else {
                        f10 = 196.0f;
                        g1Var.g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                    }
                    this.C4.setMinimumWidth(AndroidUtilities.dp(f10));
                    this.C4.setOnClickListener(new kd(this, 11));
                    this.L0.a(this.C4, k7.b6.n(-1, 44));
                    SharedConfig.removeScheduledHint();
                    if (!z14 && this.M2 > 0) {
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, getContext(), this.S3, true, z17);
                        this.c = g1Var2;
                        g1Var2.g(LocaleController.getString(R.string.SendWhenOnline), R.drawable.msg_online, null);
                        this.c.setMinimumWidth(AndroidUtilities.dp(f10));
                        this.c.setOnClickListener(new kd(this, 12));
                        this.L0.a(this.c, k7.b6.n(-1, 44));
                    }
                } else {
                    f10 = 196.0f;
                }
                if (z16) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, getContext(), this.S3, !z15, true);
                    user = null;
                    g1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                    g1Var3.setMinimumWidth(AndroidUtilities.dp(f10));
                    g1Var3.setOnClickListener(new kd(this, 13));
                    this.L0.a(g1Var3, k7.b6.n(-1, 44));
                } else {
                    user = null;
                }
                this.L0.setupRadialSelectors(i0(org.telegram.ui.ActionBar.j6.I5));
                bf bfVar = new bf(this, this.L0);
                this.K0 = bfVar;
                bfVar.b = false;
                bfVar.setAnimationStyle(R.style.PopupContextAnimation2);
                this.K0.setOutsideTouchable(true);
                this.K0.setClippingEnabled(true);
                this.K0.setInputMethodMode(2);
                this.K0.setSoftInputMode(0);
                this.K0.getContentView().setFocusableInTouchMode(true);
                SharedConfig.removeScheduledOrNoSoundHint();
                eg egVar = this.V2;
                if (egVar != null) {
                    egVar.t2();
                }
            } else {
                user = null;
            }
            org.telegram.ui.ActionBar.g1 g1Var4 = this.C4;
            if (g1Var4 != null) {
                g1Var4.setVisibility(this.L ? 8 : 0);
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
            this.L0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            this.K0.setFocusable(true);
            int[] iArr = this.J2;
            view.getLocationInWindow(iArr);
            if (this.v2) {
                int measuredHeight2 = getMeasuredHeight();
                View view2 = this.C1;
                if (measuredHeight2 > AndroidUtilities.dp((view2 == null || view2.getVisibility() != 0) ? 58.0f : 102.0f)) {
                    measuredHeight = view.getMeasuredHeight() + iArr[1];
                    this.K0.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.L0.getMeasuredWidth()), measuredHeight);
                    this.K0.b();
                    oeVar2.invalidate();
                    view.performHapticFeedback(3, 2);
                    return true;
                }
            }
            measuredHeight = (iArr[1] - this.L0.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            this.K0.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.L0.getMeasuredWidth()), measuredHeight);
            this.K0.b();
            oeVar2.invalidate();
            view.performHapticFeedback(3, 2);
            return true;
        }
        cf cfVar = this.I0;
        if (cfVar != null) {
            cfVar.h(false);
        }
        AndroidUtilities.cancelRunOnUIThread(this.B4);
        cf cfVar2 = new cf(this, getContext(), f6Var, i11);
        this.I0 = cfVar2;
        cfVar2.setOnDismissListener(new b1(this, i12));
        boolean z18 = (this.Z2 == null && ((ffVar2 = this.B0) == null || TextUtils.isEmpty(ffVar2.getText()))) ? false : true;
        ArrayList arrayList2 = new ArrayList();
        if (this.A1 != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.out = true;
            j10 = 0;
            tL_message.peer_id = MessagesController.getInstance(this.N).getPeer(this.M2);
            tL_message.from_id = MessagesController.getInstance(this.N).getPeer(UserConfig.getInstance(this.N).getClientUserId());
            tL_message.rich_message = this.A1;
            MessageObject messageObject = new MessageObject(this.N, tL_message, false, true);
            MessageObject messageObject2 = this.P2;
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
            if (this.X2 != null) {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.id = 0;
                tL_message2.out = true;
                oeVar = oeVar2;
                tL_message2.peer_id = MessagesController.getInstance(this.N).getPeer(this.M2);
                tL_message2.from_id = MessagesController.getInstance(this.N).getPeer(UserConfig.getInstance(this.N).getClientUserId());
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message2.media = tL_messageMediaDocument;
                tL_messageMediaDocument.voice = true;
                tL_messageMediaDocument.document = this.X2;
                tL_message2.send_state = 1;
                tL_message2.attachPath = this.Y2;
                MessageObject messageObject3 = new MessageObject(this.N, tL_message2, false, true);
                MessageObject messageObject4 = this.P2;
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
                if (z18) {
                    TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                    tL_message3.id = 0;
                    tL_message3.out = true;
                    tL_message3.peer_id = MessagesController.getInstance(this.N).getPeer(this.M2);
                    tL_message3.from_id = MessagesController.getInstance(this.N).getPeer(UserConfig.getInstance(this.N).getClientUserId());
                    ff ffVar3 = this.B0;
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(ffVar3 == null ? "" : ffVar3.getTextToUse())};
                    MessageObject.addLinks(true, charSequenceArr[0]);
                    tL_message3.entities.addAll(MediaDataController.getInstance(this.N).getEntities(charSequenceArr, true));
                    tL_message3.message = charSequenceArr[0].toString();
                    MessageObject messageObject5 = this.P2;
                    if (messageObject5 != null && !messageObject5.isTopicMainMessage) {
                        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                        MessageObject messageObject6 = this.Q2;
                        if (messageObject6 != null) {
                            tL_messageReplyHeader.flags |= 2;
                            tL_messageReplyHeader.reply_to_top_id = messageObject6.getId();
                        }
                        tL_messageReplyHeader.flags |= 16;
                        tL_messageReplyHeader.reply_to_msg_id = this.P2.getId();
                        tL_message3.reply_to = tL_messageReplyHeader;
                    }
                    if (this.T2 != null) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                        tL_messageMediaWebPage.webpage = this.T2;
                        if (znVar != null && (messagePreviewParams2 = znVar.c5) != null && messagePreviewParams2.hasMedia) {
                            boolean z19 = messagePreviewParams2.webpageSmall;
                            tL_messageMediaWebPage.force_small_media = z19;
                            tL_messageMediaWebPage.force_large_media = !z19;
                            tL_message3.invert_media = messagePreviewParams2.webpageTop;
                        }
                        tL_message3.media = tL_messageMediaWebPage;
                    }
                    MessageObject messageObject7 = new MessageObject(this.N, tL_message3, false, false);
                    MessageObject messageObject8 = this.P2;
                    if (messageObject8 != null && !messageObject8.isTopicMainMessage) {
                        messageObject7.replyMessageObject = messageObject8;
                    }
                    messageObject7.sendPreview = true;
                    messageObject7.isOutOwnerCached = Boolean.TRUE;
                    messageObject7.type = 0;
                    messageObject7.generateLayout(null);
                    messageObject7.notime = true;
                    arrayList2.add(messageObject7);
                } else if (znVar != null && (flVar = znVar.Y2) != null && flVar.getTextureView() != null) {
                    cf cfVar3 = this.I0;
                    TextureView textureView = znVar.Y2.getTextureView();
                    cfVar3.getClass();
                    if (textureView != null) {
                        cfVar3.i0 = new RectF();
                        int[] iArr2 = new int[2];
                        textureView.getLocationOnScreen(iArr2);
                        cfVar3.i0.set(iArr2[0], iArr2[1], textureView.getWidth() + r9, textureView.getHeight() + iArr2[1]);
                    }
                    z4 = true;
                    this.I0.q(arrayList2);
                    i10 = 4;
                    if (z18 && this.X2 == null) {
                        cf cfVar4 = this.I0;
                        ff ffVar4 = this.B0;
                        d dVar = new d(this, i10);
                        sd sdVar = new sd(this, i13);
                        cfVar4.P = ffVar4;
                        cfVar4.R = dVar;
                        cfVar4.S = sdVar;
                    }
                    this.I0.r(oeVar, true, new nh.a2(i10, this, z18));
                    if ((!z18 || z4) && this.M2 >= j10) {
                        this.I0.d(znVar);
                        this.I0.o(this.O4);
                    }
                    F = p70.F(this, f6Var, oeVar);
                    z10 = znVar == null && UserObject.isUserSelf(znVar.i());
                    z11 = znVar == null && znVar.D6();
                    if (!z10 || (this.D0 > 0 && !c())) {
                        z13 = false;
                    }
                    if (z11) {
                        F.c(R.drawable.msg_calendar2, LocaleController.getString(z10 ? R.string.SetReminder : R.string.ScheduleMessage), new id(this, 18), false);
                        if (!z10 && this.M2 > j10) {
                            F.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new id(this, 19), false);
                            this.c = F.y();
                        }
                    }
                    if (znVar != null && this.V2 != null && ChatObject.isMonoForum(znVar.e)) {
                        F.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new id(this, 17), false);
                    }
                    if (z13) {
                        F.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new pd(this, z18, i13), false);
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
                    this.I0.p(F);
                    this.I0.show();
                    view.performHapticFeedback(3, 2);
                    return false;
                }
            }
        }
        z4 = false;
        this.I0.q(arrayList2);
        i10 = 4;
        if (z18) {
            cf cfVar42 = this.I0;
            ff ffVar42 = this.B0;
            d dVar2 = new d(this, i10);
            sd sdVar2 = new sd(this, i13);
            cfVar42.P = ffVar42;
            cfVar42.R = dVar2;
            cfVar42.S = sdVar2;
        }
        this.I0.r(oeVar, true, new nh.a2(i10, this, z18));
        if (!z18) {
        }
        this.I0.d(znVar);
        this.I0.o(this.O4);
        F = p70.F(this, f6Var, oeVar);
        if (znVar == null) {
        }
        if (znVar == null) {
        }
        if (!z10) {
        }
        z13 = false;
        if (z11) {
        }
        if (znVar != null) {
            F.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new id(this, 17), false);
        }
        if (z13) {
        }
        F.Y();
        if (this.c != null) {
        }
        this.I0.p(F);
        this.I0.show();
        view.performHapticFeedback(3, 2);
        return false;
    }

    public final void F1() {
        float f10 = this.r * this.h;
        de deVar = this.N0;
        deVar.setScaleX(f10);
        deVar.setScaleY(this.r * this.h);
        deVar.setAlpha(this.s * this.n);
    }

    @Override // org.telegram.ui.Components.pv0
    public final void G(int i10, boolean z4) {
        MessageObject messageObject;
        ff ffVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z10;
        int i11;
        int i12;
        ch.f fVar;
        if (this.N1 != 0) {
            this.H2 = i10;
            this.I2 = z4;
            this.v2 = i10 > 0;
            D();
            return;
        }
        if (i10 > AndroidUtilities.dp(50.0f) && this.v2 && !AndroidUtilities.isInMultiwindow) {
            if (z4) {
                this.u2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.u2).commit();
            } else {
                this.t2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.t2).commit();
            }
        }
        if (this.v2 && this.T0 && this.R0 == null) {
            this.T0 = false;
        }
        boolean t02 = t0();
        qv0 qv0Var = this.i1;
        org.telegram.ui.zn znVar = this.L2;
        if (t02) {
            int i13 = z4 ? this.u2 : this.t2;
            if (znVar != null && znVar.getParentLayout() != null) {
                i13 -= ((ActionBarLayout) znVar.getParentLayout()).v(false);
            }
            if (this.b2 == 1) {
                rf rfVar = this.D1;
                if (!rfVar.f) {
                    i13 = Math.min(rfVar.getKeyboardHeight(), i13);
                }
            }
            int i14 = this.b2;
            ViewGroup viewGroup = i14 == 0 ? this.R0 : i14 == 1 ? this.D1 : null;
            rf rfVar2 = this.D1;
            if (rfVar2 != null) {
                rfVar2.setPanelHeight(i13);
                ch.f fVar2 = this.Z4;
                if (fVar2 != null && i13 > 0 && this.b2 == 1) {
                    ((ch.i) fVar2).g(i13);
                }
            }
            if (viewGroup != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                if (!this.w3 && !this.v3 && (((i11 = layoutParams.width) != (i12 = AndroidUtilities.displaySize.x) || layoutParams.height != i13) && ((fVar = this.Z4) == null || i11 != -1 || layoutParams.height != -1))) {
                    if (fVar == null) {
                        layoutParams.width = i12;
                        layoutParams.height = i13;
                        viewGroup.setLayoutParams(layoutParams);
                    }
                    if (qv0Var != null) {
                        int i15 = this.w2;
                        this.w2 = layoutParams.height;
                        qv0Var.requestLayout();
                        G0();
                        if (this.e2 && !this.v2 && i15 != this.w2 && N0()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.S0 = animatorSet;
                            if (this.Z4 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.w2 - i15, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, this.w2 - i15, 0.0f));
                            }
                            this.S0.setInterpolator(org.telegram.ui.ActionBar.r1.w);
                            this.S0.setDuration(250L);
                            this.S0.addListener(new pe(this, 10));
                            AndroidUtilities.runOnUIThread(this.U3, 50L);
                            this.H3.lock();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.H2 == i10 && this.I2 == z4) {
            G0();
            return;
        }
        this.H2 = i10;
        this.I2 = z4;
        boolean z11 = this.v2;
        this.v2 = i10 > 0;
        D();
        if (this.v2 && t0() && this.x3 == null) {
            t1(0, this.b2, true, true);
        } else if (!this.v2 && !t0() && (messageObject = this.i2) != null && this.P2 != messageObject && !j0() && !v() && !org.telegram.ui.ActionBar.p2.hasSheets(znVar) && (((ffVar = this.B0) == null || TextUtils.isEmpty(ffVar.getText())) && (tL_replyKeyboardMarkup = this.j2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.r1 r1Var = qv0Var.E;
            if (r1Var.f) {
                r1Var.j();
            } else {
                r1Var.v = true;
            }
            t1(1, 1, false, true);
        }
        if (this.w2 != 0 && !(z10 = this.v2) && z10 != z11 && !t0()) {
            this.w2 = 0;
            qv0Var.requestLayout();
        }
        if (this.v2 && this.g3) {
            this.g3 = false;
            if (this.l3) {
                this.l3 = false;
                this.D1.setButtons(this.j2);
            }
            AndroidUtilities.cancelRunOnUIThread(this.n3);
        }
        G0();
    }

    public final void G0() {
        int height = this.i1.getHeight();
        if (!this.v2) {
            height -= this.w2;
        }
        eg egVar = this.V2;
        if (egVar != null) {
            egVar.k2(height);
        }
        if (this.C1 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
            xd.a aVar = this.c5;
            if (height < currentActionBarHeight) {
                if (this.d3) {
                    this.d3 = false;
                    if (this.c3) {
                        aVar.a(false, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.d3) {
                return;
            }
            this.d3 = true;
            if (this.c3) {
                aVar.a(true, false);
            }
        }
    }

    public final void G1(boolean z4) {
        boolean z10;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        MessageObject messageObject;
        TLRPC.ReplyMarkup replyMarkup;
        TLRPC.ReplyMarkup replyMarkup2;
        ff ffVar = this.B0;
        if (ffVar == null) {
            return;
        }
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            ffVar.setHintText(charSequence, z4);
            this.B0.setHintText2(this.f, z4);
            return;
        }
        boolean z11 = false;
        if (!this.w0 && !r0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d " + LocaleController.getString("PlainTextRestrictedHint", R.string.PlainTextRestrictedHint));
            spannableStringBuilder.setSpan(new lq(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
            this.B0.setHintText(spannableStringBuilder, z4);
            this.B0.setText((CharSequence) null);
            this.B0.setEnabled(false);
            this.B0.setInputType(1);
            return;
        }
        this.B0.setEnabled(true);
        int inputType = this.B0.getInputType();
        int i10 = this.a;
        if (inputType != i10) {
            this.B0.setInputType(i10);
        }
        R1();
        org.telegram.ui.zn znVar = this.L2;
        boolean z12 = znVar != null && znVar.O3 == 8 && znVar.Q3;
        long sendPaidMessagesStars = znVar != null ? znVar.getMessagesController().getSendPaidMessagesStars(znVar.a()) : 0L;
        if (sendPaidMessagesStars > 0) {
            sendPaidMessagesStars *= getMessagesCount();
        }
        int i11 = znVar != null ? znVar.O3 : -1;
        if (i11 == 9) {
            this.B0.setHintText(LocaleController.getString(R.string.WelcomeMessageEnter));
            return;
        }
        if (i11 == 5) {
            if ("hello".equalsIgnoreCase(znVar.N3)) {
                this.B0.setHintText(LocaleController.getString(R.string.BusinessGreetingEnter));
                return;
            } else if ("away".equalsIgnoreCase(znVar.N3)) {
                this.B0.setHintText(LocaleController.getString(R.string.BusinessAwayEnter));
                return;
            } else {
                this.B0.setHintText(LocaleController.getString(R.string.BusinessRepliesEnter));
                return;
            }
        }
        lq[] lqVarArr = this.K4;
        if (z12) {
            this.B0.setHintText(sendPaidMessagesStars > 0 ? lh.ja.Q0(LocaleController.formatString(R.string.SuggestPostForStars, LocaleController.formatNumber((int) sendPaidMessagesStars, ','), lqVarArr)) : LocaleController.formatString(R.string.SuggestPostForFree, new Object[0]));
            lq lqVar = lqVarArr[0];
            if (lqVar != null) {
                lqVar.spaceScaleX = 0.9f;
                return;
            }
            return;
        }
        if (this.X1 != null) {
            this.B0.setHintText(LocaleController.getString(R.string.BusinessLinksEnter));
            return;
        }
        MessageObject messageObject2 = this.P2;
        if (messageObject2 != null && (replyMarkup2 = messageObject2.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
            this.B0.setHintText(this.P2.messageOwner.reply_markup.placeholder, z4);
            return;
        }
        if (this.V1 != null) {
            this.B0.setHintText(LocaleController.getString(this.W1 ? R.string.Caption : R.string.TypeMessage));
            return;
        }
        if (sendPaidMessagesStars > 0) {
            this.B0.setHintText(lh.ja.V0(false, LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber((int) sendPaidMessagesStars, ',')), lqVarArr));
            lq lqVar2 = lqVarArr[0];
            if (lqVar2 != null) {
                lqVar2.spaceScaleX = 0.9f;
                return;
            }
            return;
        }
        if (this.U0 && (messageObject = this.i2) != null && (replyMarkup = messageObject.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
            this.B0.setHintText(this.i2.messageOwner.reply_markup.placeholder, z4);
            return;
        }
        if (znVar != null && znVar.v9()) {
            MessageObject messageObject3 = this.Q2;
            if (messageObject3 != null && (tL_forumTopic = messageObject3.replyToForumTopic) != null && (str2 = tL_forumTopic.title) != null) {
                this.B0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str2), z4);
                return;
            }
            TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.N).getTopicsController().findTopic(znVar.e.id, 1L);
            if (findTopic == null || (str = findTopic.title) == null) {
                this.B0.setHintText(LocaleController.getString(R.string.TypeMessage), z4);
                return;
            } else {
                this.B0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str), z4);
                return;
            }
        }
        if (DialogObject.isChatDialog(this.M2)) {
            TLRPC.Chat chat = this.O.getMessagesController().getChat(Long.valueOf(-this.M2));
            TLRPC.ChatFull chatFull = this.O.getMessagesController().getChatFull(-this.M2);
            z10 = ChatObject.isChannelAndNotMegaGroup(chat);
            z11 = !z10 && ChatObject.getSendAsPeerId(chat, chatFull) == (-this.M2);
        } else {
            z10 = false;
        }
        if (z11) {
            this.B0.setHintText(LocaleController.getString("SendAnonymously", R.string.SendAnonymously));
            return;
        }
        TLRPC.User user = this.O.getMessagesController().getUser(Long.valueOf(this.M2));
        if (user != null && user.bot_forum_view && !user.bot_forum_can_manage_topics && znVar != null && !znVar.e4) {
            this.B0.setHintText(LocaleController.getString(R.string.SendBotNoThread));
            return;
        }
        if (znVar != null && znVar.F9() && !znVar.e4) {
            if (znVar.U3 == null || !znVar.d4) {
                this.B0.setHintText(LocaleController.getString("Reply", R.string.Reply));
                return;
            } else {
                this.B0.setHintText(LocaleController.getString(R.string.Comment));
                return;
            }
        }
        if (!z10) {
            this.B0.setHintText(LocaleController.getString(R.string.TypeMessage));
        } else if (this.c2) {
            this.B0.setHintText(LocaleController.getString("ChannelSilentBroadcast", R.string.ChannelSilentBroadcast), z4);
        } else {
            this.B0.setHintText(LocaleController.getString("ChannelBroadcast", R.string.ChannelBroadcast), z4);
        }
    }

    public void H0() {
        if ((j0() && v()) || org.telegram.ui.ActionBar.p2.hasSheets(this.L2)) {
            return;
        }
        eg egVar = this.V2;
        if (egVar != null) {
            egVar.w1();
        }
        ff ffVar = this.B0;
        if (ffVar == null || AndroidUtilities.showKeyboard(ffVar)) {
            return;
        }
        this.B0.clearFocus();
        this.B0.requestFocus();
    }

    public final void H1(int i10) {
        ImageView imageView;
        qe qeVar;
        qe qeVar2;
        ge geVar;
        this.L4 = i10;
        if (this.B0 != null) {
            MessageObject messageObject = this.V1;
            if (messageObject == null || messageObject.needResendWhenEdit()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.B0.getLayoutParams();
                int i11 = layoutParams.rightMargin;
                boolean z4 = this.w4;
                oe oeVar = this.G0;
                if (z4 && this.h5) {
                    layoutParams.rightMargin = Math.max(0, oeVar.l() - AndroidUtilities.dp(44.0f)) + AndroidUtilities.dp(this.r4 ? 50.0f : 2.0f);
                } else if (i10 == 1 || i10 == 2) {
                    se seVar = this.t1;
                    if (seVar == null || seVar.getVisibility() != 0 || (qeVar2 = this.F1) == null || qeVar2.getVisibility() != 0 || (geVar = this.n1) == null || geVar.getVisibility() != 0) {
                        se seVar2 = this.t1;
                        if ((seVar2 == null || seVar2.getVisibility() != 0) && (((imageView = this.E1) == null || imageView.getVisibility() != 0) && ((qeVar = this.F1) == null || qeVar.getTag() == null))) {
                            layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                        } else {
                            layoutParams.rightMargin = AndroidUtilities.dp(98.0f);
                        }
                    } else {
                        layoutParams.rightMargin = AndroidUtilities.dp(146.0f);
                    }
                } else {
                    qe qeVar3 = this.F1;
                    if (qeVar3 == null || qeVar3.getTag() == null) {
                        layoutParams.rightMargin = AndroidUtilities.dp(2.0f);
                    } else {
                        layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                    }
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, oeVar.l() - AndroidUtilities.dp(44.0f)));
                oe oeVar2 = this.B1;
                if (oeVar2 != null && oeVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.B1.l() - AndroidUtilities.dp(44.0f)));
                }
                if (i11 != layoutParams.rightMargin) {
                    this.B0.setLayoutParams(layoutParams);
                }
                ae aeVar = this.b1;
                if (aeVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) aeVar.getLayoutParams();
                    layoutParams2.rightMargin = this.V1 == null ? kf.k0.c(44.0f, oeVar.l(), 0) : 0;
                    this.b1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final void I() {
        boolean z4;
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.a2) {
            return;
        }
        if (this.l1 == null) {
            this.a2 = false;
            k1(false, false);
            return;
        }
        boolean z11 = true;
        this.a2 = true;
        this.u0 = true;
        this.v0 = true;
        if (DialogObject.isChatDialog(this.M2)) {
            TLRPC.Chat chat = this.O.getMessagesController().getChat(Long.valueOf(-this.M2));
            z4 = ChatObject.isChannel(chat) && !chat.megagroup;
            if (z4 && !chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.a2 = false;
            }
            this.u0 = ChatObject.canSendRoundVideo(chat);
            this.v0 = ChatObject.canSendVoice(chat);
        } else {
            z4 = false;
        }
        if (!SharedConfig.inappCamera) {
            this.a2 = false;
        }
        if (this.a2) {
            if (SharedConfig.hasCameraCache) {
                CameraController.getInstance().initCamera(null);
            }
            z10 = MessagesController.getGlobalMainSettings().getBoolean(z4 ? "currentModeVideoChannel" : "currentModeVideo", z4);
        } else {
            z10 = false;
        }
        if (!this.u0 && z10) {
            z10 = false;
        }
        if (this.v0 || z10) {
            z11 = z10;
        } else if (!this.a2) {
            z11 = false;
        }
        k1(z11, false);
    }

    public final void I0() {
        if (j0() && v()) {
            return;
        }
        org.telegram.ui.zn znVar = this.L2;
        if (org.telegram.ui.ActionBar.p2.hasSheets(znVar)) {
            return;
        }
        t1((AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || (znVar != null && znVar.isInBubbleMode()) || this.f2) ? 0 : 2, 0, true, true);
        eg egVar = this.V2;
        if (egVar != null) {
            egVar.w1();
        }
        ff ffVar = this.B0;
        if (ffVar != null) {
            ffVar.requestFocus();
        }
        AndroidUtilities.showKeyboard(this.B0);
        if (this.f2) {
            this.h2 = true;
            return;
        }
        if (AndroidUtilities.usingHardwareInput || this.v2 || AndroidUtilities.isInMultiwindow) {
            return;
        }
        if (znVar == null || !znVar.isInBubbleMode()) {
            this.g3 = true;
            uf ufVar = this.R0;
            if (ufVar != null) {
                ufVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
            }
            re reVar = this.n3;
            AndroidUtilities.cancelRunOnUIThread(reVar);
            AndroidUtilities.runOnUIThread(reVar, 100L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r14.N).getMainSettings().getBoolean("show_gift_for_" + r5.a(), true) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d6, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r14.N).getMainSettings().getBoolean(java.util.Calendar.getInstance().get(1) + "show_gift_for_" + r5.a(), true) == false) goto L39;
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
    public final void I1(boolean z4) {
        boolean z10;
        ph.f3 f3Var;
        TLRPC.UserFull userFull = getParentFragment() == null ? null : getParentFragment().X7;
        TLRPC.UserFull userFull2 = MessagesController.getInstance(this.N).getUserFull(UserConfig.getInstance(this.N).getClientUserId());
        TLRPC.User i10 = getParentFragment() != null ? getParentFragment().i() : null;
        boolean premiumPurchaseBlocked = MessagesController.getInstance(this.N).premiumPurchaseBlocked();
        org.telegram.ui.zn znVar = this.L2;
        if (!premiumPurchaseBlocked && getParentFragment() != null && i10 != null && !BuildVars.IS_BILLING_UNAVAILABLE && ((!UserObject.isUserSelf(i10) || (userFull2 != null && userFull2.display_gifts_button)) && !UserObject.isBot(i10) && !MessagesController.isSupportUser(i10) && userFull != null)) {
            if (!i10.premium && MessagesController.getInstance(this.N).giftAttachMenuIcon && MessagesController.getInstance(this.N).giftTextFieldIcon) {
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
            if (znVar != null && znVar.O3 == 0) {
                z10 = true;
                if (!z10 && (f3Var = this.I) != null) {
                    f3Var.e(true);
                }
                if (z10 && this.G1 == null) {
                    return;
                }
                if (this.G1 == null && znVar != null) {
                    se seVar = new se(this, getContext(), 0);
                    this.G1 = seVar;
                    seVar.setImageResource(R.drawable.msg_input_gift);
                    this.G1.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.j6.Wk), PorterDuff.Mode.MULTIPLY));
                    this.G1.setVisibility(8);
                    this.G1.setContentDescription(LocaleController.getString(R.string.GiftPremium));
                    this.G1.setScaleType(ImageView.ScaleType.CENTER);
                    this.G1.setBackground(org.telegram.ui.ActionBar.j6.f0(i0(org.telegram.ui.ActionBar.j6.i6), 1, -1));
                    this.l1.addView(this.G1, 0, k7.b6.e(44, 44, 21));
                    this.G1.setOnClickListener(new kd(this, 9));
                }
                AndroidUtilities.updateViewVisibilityAnimated(this.G1, z10, 1.0f, true, 1.0f, z4, new gd(this, 0));
                if (z10) {
                    return;
                }
                C();
                return;
            }
        }
        z10 = false;
        if (!z10) {
            f3Var.e(true);
        }
        if (z10) {
        }
        if (this.G1 == null) {
            se seVar2 = new se(this, getContext(), 0);
            this.G1 = seVar2;
            seVar2.setImageResource(R.drawable.msg_input_gift);
            this.G1.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.j6.Wk), PorterDuff.Mode.MULTIPLY));
            this.G1.setVisibility(8);
            this.G1.setContentDescription(LocaleController.getString(R.string.GiftPremium));
            this.G1.setScaleType(ImageView.ScaleType.CENTER);
            this.G1.setBackground(org.telegram.ui.ActionBar.j6.f0(i0(org.telegram.ui.ActionBar.j6.i6), 1, -1));
            this.l1.addView(this.G1, 0, k7.b6.e(44, 44, 21));
            this.G1.setOnClickListener(new kd(this, 9));
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.G1, z10, 1.0f, true, 1.0f, z4, new gd(this, 0));
        if (z10) {
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
    public final void J(boolean z4) {
        oe oeVar;
        ImageView imageView;
        String str;
        le leVar;
        int i10;
        AnimatorSet animatorSet;
        ?? r14;
        ImageView imageView2;
        boolean z10;
        se seVar;
        se seVar2;
        AnimatorSet animatorSet2;
        int i11;
        float f10;
        se seVar3;
        AnimatorSet animatorSet3;
        ImageView imageView3;
        int i12;
        boolean z11;
        ?? r52;
        ?? r142;
        if (this.V1 != null || this.B2) {
            return;
        }
        boolean z12 = this.f2 ? false : z4;
        R1();
        ff ffVar = this.B0;
        CharSequence trimmedString = ffVar == null ? "" : AndroidUtilities.getTrimmedString(ffVar.getTextToUse());
        int i13 = this.D0;
        oe oeVar2 = this.G0;
        xd.a aVar = this.e5;
        zd zdVar = this.W3;
        le leVar2 = this.W0;
        Property property = View.SCALE_X;
        Property property2 = View.SCALE_Y;
        Property property3 = View.ALPHA;
        dg.u3 u3Var = this.l1;
        me meVar = this.Y0;
        mg mgVar = this.C0;
        ge geVar = this.n1;
        boolean z13 = z12;
        ImageView imageView4 = this.M0;
        CharSequence charSequence = trimmedString;
        if (i13 <= 0 || i13 == Integer.MAX_VALUE || c() || aVar.f) {
            int length = charSequence.length();
            xd.a aVar2 = this.d5;
            if (length > 0 || this.D2 || this.z1 || this.X2 != null || this.a3 != null) {
                oeVar = oeVar2;
            } else {
                oeVar = oeVar2;
                if ((this.D0 != Integer.MAX_VALUE || c() || aVar.f) && ((!this.h5 || getStarsPrice() <= 0) && !aVar2.f)) {
                    if (this.R0 == null || !this.T0 || (!(this.t3 || (this.u3 && this.N1 == 2)) || AndroidUtilities.isInMultiwindow || this.h5)) {
                        if (getSendButtonInternal().getVisibility() == 0 || imageView4.getVisibility() == 0 || (((seVar3 = this.P0) != null && seVar3.getVisibility() == 0) || mgVar.getVisibility() == 0)) {
                            if (!z13) {
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
                                se seVar4 = this.P0;
                                if (seVar4 != null) {
                                    seVar4.setScaleX(0.1f);
                                    this.P0.setScaleY(0.1f);
                                    this.P0.setAlpha(0.0f);
                                    this.P0.setVisibility(8);
                                }
                                meVar.setScaleX(1.0f);
                                meVar.setScaleY(1.0f);
                                meVar.setAlpha(1.0f);
                                leVar2.setVisibility(0);
                                if (u3Var != null) {
                                    if (getVisibility() == 0) {
                                        this.V2.A2();
                                    }
                                    this.B = 1.0f;
                                    A1();
                                    u3Var.setScaleX(1.0f);
                                    u3Var.setVisibility(0);
                                    H1(1);
                                }
                                if (geVar != null) {
                                    ViewPropertyAnimator viewPropertyAnimator = this.m1;
                                    if (viewPropertyAnimator != null) {
                                        viewPropertyAnimator.cancel();
                                        this.m1 = null;
                                    }
                                    this.r1 = 1.0f;
                                    geVar.setAlpha(1.0f);
                                    geVar.setScaleX(1.0f);
                                    geVar.setScaleY(1.0f);
                                }
                                this.H1 = false;
                                eg egVar = this.V2;
                                if (egVar != null && egVar.H0()) {
                                    a0();
                                }
                                if (this.F1 != null) {
                                    eg egVar2 = this.V2;
                                    if (egVar2 != null && egVar2.H0()) {
                                        this.F1.setVisibility(0);
                                        this.F1.setTag(1);
                                    }
                                    this.F1.setAlpha(1.0f);
                                    this.F1.setScaleX(1.0f);
                                    this.F1.setScaleY(1.0f);
                                    this.F1.setTranslationX(0.0f);
                                }
                            } else {
                                if (this.r2 == 2) {
                                    return;
                                }
                                AnimatorSet animatorSet4 = this.n2;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                    animatorSet2 = null;
                                    this.n2 = null;
                                } else {
                                    animatorSet2 = null;
                                }
                                AnimatorSet animatorSet5 = this.o2;
                                if (animatorSet5 != null) {
                                    animatorSet5.cancel();
                                    this.o2 = animatorSet2;
                                }
                                if (u3Var != null) {
                                    if (u3Var.getVisibility() != 0) {
                                        u3Var.setVisibility(0);
                                        this.B = 0.0f;
                                        A1();
                                        u3Var.setScaleX(0.0f);
                                    }
                                    this.o2 = new AnimatorSet();
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(ObjectAnimator.ofFloat(u3Var, zdVar, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(u3Var, (Property<dg.u3, Float>) property, 1.0f));
                                    wg.g gVar = this.a5;
                                    if (gVar != null) {
                                        gVar.e(0, false, true);
                                    }
                                    if (geVar != null) {
                                        ViewPropertyAnimator viewPropertyAnimator2 = this.m1;
                                        if (viewPropertyAnimator2 != null) {
                                            viewPropertyAnimator2.cancel();
                                            this.m1 = null;
                                        }
                                        this.r1 = 1.0f;
                                        arrayList.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property3, 1.0f));
                                        arrayList.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property, 1.0f));
                                        arrayList.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property2, 1.0f));
                                    }
                                    eg egVar3 = this.V2;
                                    boolean z14 = egVar3 != null && egVar3.H0();
                                    this.H1 = false;
                                    if (z14) {
                                        a0();
                                    }
                                    qe qeVar = this.F1;
                                    if (qeVar != null) {
                                        if (z14) {
                                            qeVar.setVisibility(0);
                                            this.F1.setTag(1);
                                            this.F1.setPivotX(AndroidUtilities.dp(44.0f));
                                            arrayList.add(ObjectAnimator.ofFloat(this.F1, (Property<qe, Float>) property3, 1.0f));
                                            arrayList.add(ObjectAnimator.ofFloat(this.F1, (Property<qe, Float>) property, 1.0f));
                                            arrayList.add(p(0.0f));
                                            ImageView imageView5 = this.E1;
                                            if (imageView5 != null && imageView5.getVisibility() == 0) {
                                                imageView5.setVisibility(8);
                                            }
                                        } else {
                                            qeVar.setAlpha(1.0f);
                                            this.F1.setScaleX(1.0f);
                                            this.F1.setScaleY(1.0f);
                                            this.F1.setTranslationX(0.0f);
                                        }
                                    }
                                    this.o2.playTogether(arrayList);
                                    this.o2.setDuration(100L);
                                    this.o2.addListener(new pe(this, 6));
                                    this.o2.start();
                                    H1(1);
                                    if (getVisibility() == 0) {
                                        this.V2.A2();
                                    }
                                }
                                leVar2.setVisibility(0);
                                this.n2 = new AnimatorSet();
                                this.r2 = 2;
                                ArrayList arrayList2 = new ArrayList();
                                org.telegram.ui.zn znVar = this.L2;
                                TLRPC.Chat g10 = znVar == null ? null : znVar.g();
                                TLRPC.UserFull w82 = znVar == null ? this.H : znVar.w8();
                                if (g10 != null) {
                                    if (!ChatObject.canSendVoice(g10)) {
                                    }
                                    f10 = 1.0f;
                                } else if (w82 == null) {
                                    i11 = 1;
                                    f10 = 1.0f;
                                    float[] fArr = new float[i11];
                                    fArr[0] = 1.0f;
                                    arrayList2.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property, fArr));
                                    float[] fArr2 = new float[i11];
                                    fArr2[0] = 1.0f;
                                    arrayList2.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property2, fArr2));
                                    float[] fArr3 = new float[i11];
                                    fArr3[0] = f10;
                                    arrayList2.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property3, fArr3));
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
                                        se seVar5 = this.P0;
                                        if (seVar5 != null && seVar5.getVisibility() == 0) {
                                            se seVar6 = this.P0;
                                            float[] fArr7 = new float[i11];
                                            fArr7[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(seVar6, (Property<se, Float>) property, fArr7));
                                            se seVar7 = this.P0;
                                            float[] fArr8 = new float[i11];
                                            fArr8[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(seVar7, (Property<se, Float>) property2, fArr8));
                                            se seVar8 = this.P0;
                                            float[] fArr9 = new float[i11];
                                            fArr9[0] = 0.0f;
                                            arrayList2.add(ObjectAnimator.ofFloat(seVar8, (Property<se, Float>) property3, fArr9));
                                        } else if (mgVar.getVisibility() == 0) {
                                            float[] fArr10 = new float[i11];
                                            fArr10[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(mgVar, (Property<mg, Float>) property, fArr10));
                                            float[] fArr11 = new float[i11];
                                            fArr11[0] = 0.1f;
                                            arrayList2.add(ObjectAnimator.ofFloat(mgVar, (Property<mg, Float>) property2, fArr11));
                                            float[] fArr12 = new float[i11];
                                            fArr12[0] = 0.0f;
                                            arrayList2.add(ObjectAnimator.ofFloat(mgVar, (Property<mg, Float>) property3, fArr12));
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
                                    this.n2.playTogether(arrayList2);
                                    this.n2.setDuration(150L);
                                    this.n2.addListener(new pe(this, 7));
                                    this.n2.start();
                                }
                                i11 = 1;
                                float[] fArr16 = new float[i11];
                                fArr16[0] = 1.0f;
                                arrayList2.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property, fArr16));
                                float[] fArr22 = new float[i11];
                                fArr22[0] = 1.0f;
                                arrayList2.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property2, fArr22));
                                float[] fArr32 = new float[i11];
                                fArr32[0] = f10;
                                arrayList2.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property3, fArr32));
                                if (imageView4.getVisibility() != 0) {
                                }
                                this.n2.playTogether(arrayList2);
                                this.n2.setDuration(150L);
                                this.n2.addListener(new pe(this, 7));
                                this.n2.start();
                            }
                        }
                    } else if (!z13) {
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
                        V();
                        this.P0.setScaleX(1.0f);
                        this.P0.setScaleY(1.0f);
                        this.P0.setAlpha(1.0f);
                        this.P0.setVisibility(0);
                        if (u3Var != null) {
                            if (getVisibility() == 0) {
                                this.V2.A2();
                            }
                            u3Var.setVisibility(0);
                            H1(1);
                        }
                        this.H1 = false;
                        eg egVar4 = this.V2;
                        boolean z15 = egVar4 != null && egVar4.H0();
                        if (z15) {
                            a0();
                        }
                        qe qeVar2 = this.F1;
                        if (qeVar2 != null) {
                            if (z15) {
                                qeVar2.setVisibility(0);
                                this.F1.setTag(1);
                            }
                            this.F1.setAlpha(1.0f);
                            this.F1.setScaleX(1.0f);
                            this.F1.setScaleY(1.0f);
                            this.F1.setTranslationX(0.0f);
                        }
                    } else {
                        if (this.r2 == 4) {
                            return;
                        }
                        AnimatorSet animatorSet6 = this.n2;
                        if (animatorSet6 != null) {
                            animatorSet6.cancel();
                            animatorSet3 = null;
                            this.n2 = null;
                        } else {
                            animatorSet3 = null;
                        }
                        AnimatorSet animatorSet7 = this.o2;
                        if (animatorSet7 != null) {
                            animatorSet7.cancel();
                            this.o2 = animatorSet3;
                        }
                        if (u3Var != null && this.s2 == 0) {
                            u3Var.setVisibility(0);
                            this.o2 = new AnimatorSet();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(ObjectAnimator.ofFloat(u3Var, zdVar, 1.0f));
                            arrayList3.add(ObjectAnimator.ofFloat(u3Var, (Property<dg.u3, Float>) property, 1.0f));
                            wg.g gVar2 = this.a5;
                            if (gVar2 != null) {
                                gVar2.e(0, false, true);
                            }
                            if (geVar != null) {
                                ViewPropertyAnimator viewPropertyAnimator3 = this.m1;
                                if (viewPropertyAnimator3 != null) {
                                    viewPropertyAnimator3.cancel();
                                    this.m1 = null;
                                }
                                this.r1 = 1.0f;
                                arrayList3.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property3, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property2, 1.0f));
                            }
                            eg egVar5 = this.V2;
                            boolean z16 = egVar5 != null && egVar5.H0();
                            this.H1 = false;
                            if (z16) {
                                a0();
                            }
                            qe qeVar3 = this.F1;
                            if (qeVar3 != null) {
                                qeVar3.setScaleY(1.0f);
                                if (z16) {
                                    this.F1.setVisibility(0);
                                    this.F1.setTag(1);
                                    this.F1.setPivotX(AndroidUtilities.dp(44.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.F1, (Property<qe, Float>) property3, 1.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.F1, (Property<qe, Float>) property, 1.0f));
                                    arrayList3.add(p(0.0f));
                                } else {
                                    this.F1.setAlpha(1.0f);
                                    this.F1.setScaleX(1.0f);
                                    this.F1.setTranslationX(0.0f);
                                }
                            }
                            this.o2.playTogether(arrayList3);
                            this.o2.setDuration(100L);
                            this.o2.addListener(new pe(this, 4));
                            this.o2.start();
                            H1(1);
                            if (getVisibility() == 0) {
                                this.V2.A2();
                            }
                        }
                        V();
                        this.P0.setVisibility(0);
                        this.n2 = new AnimatorSet();
                        this.r2 = 4;
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(ObjectAnimator.ofFloat(this.P0, (Property<se, Float>) property, 1.0f));
                        arrayList4.add(ObjectAnimator.ofFloat(this.P0, (Property<se, Float>) property2, 1.0f));
                        arrayList4.add(ObjectAnimator.ofFloat(this.P0, (Property<se, Float>) property3, 1.0f));
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
                        this.n2.playTogether(arrayList4);
                        this.n2.setDuration(250L);
                        this.n2.addListener(new pe(this, 5));
                        this.n2.start();
                    }
                }
            }
            ff ffVar2 = this.B0;
            String caption = ffVar2 == null ? null : ffVar2.getCaption();
            boolean z17 = caption != null && (getSendButtonInternal().getVisibility() == 0 || ((seVar2 = this.P0) != null && seVar2.getVisibility() == 0));
            boolean z18 = caption == null && (imageView4.getVisibility() == 0 || ((seVar = this.P0) != null && seVar.getVisibility() == 0));
            int i02 = (this.D0 != Integer.MAX_VALUE || c() || aVar.f) ? i0(org.telegram.ui.ActionBar.j6.Yd) : i0(org.telegram.ui.ActionBar.j6.Wk);
            ff ffVar3 = this.B0;
            boolean z19 = (ffVar3 != null && (!TextUtils.isEmpty(ffVar3.getCaption()) || this.B0.isNearRightCaption(AndroidUtilities.dp(44.0f)))) || LocaleController.isRTL;
            if (i02 != this.H0) {
                this.H0 = i02;
                Drawable background = oeVar.getBackground();
                int i14 = i02;
                int red = Color.red(i14);
                leVar = leVar2;
                int green = Color.green(i14);
                str = caption;
                int blue = Color.blue(i14);
                imageView = imageView4;
                org.telegram.ui.ActionBar.j6.B1(background, Color.argb(24, red, green, blue), true);
            } else {
                imageView = imageView4;
                str = caption;
                leVar = leVar2;
            }
            if (leVar.getVisibility() != 0 && mgVar.getVisibility() != 0 && !z17 && !z18 && !aVar2.f) {
                wg.g gVar3 = this.a5;
                if (gVar3 != null) {
                    gVar3.e(0, z19, true);
                    if (geVar != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.m1;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.m1 = null;
                        }
                        ViewPropertyAnimator animate = geVar.animate();
                        float f11 = z19 ? 0.0f : 1.0f;
                        this.r1 = f11;
                        ViewPropertyAnimator duration = animate.alpha(f11).scaleX(z19 ? 0.5f : 1.0f).scaleY(z19 ? 0.5f : 1.0f).setInterpolator(mr.h).setDuration(320L);
                        this.m1 = duration;
                        duration.start();
                    }
                }
            } else {
                if (!z13) {
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
                    se seVar9 = this.P0;
                    if (seVar9 == null || seVar9.getVisibility() != 0) {
                        i10 = 8;
                    } else {
                        this.P0.setScaleX(0.1f);
                        this.P0.setScaleY(0.1f);
                        this.P0.setAlpha(0.0f);
                        i10 = 8;
                        this.P0.setVisibility(8);
                    }
                    if (u3Var != null) {
                        u3Var.setVisibility(i10);
                        if (this.V2 != null && getVisibility() == 0) {
                            this.V2.x0();
                        }
                        H1(0);
                        wg.g gVar4 = this.a5;
                        if (gVar4 != null) {
                            gVar4.e(0, z19, true);
                            if (geVar != null) {
                                float f12 = z19 ? 0.0f : 1.0f;
                                this.r1 = f12;
                                geVar.setAlpha(f12);
                                geVar.setScaleX(z19 ? 0.5f : 1.0f);
                                geVar.setScaleY(z19 ? 0.5f : 1.0f);
                            }
                        } else if (geVar != null) {
                            this.r1 = 0.0f;
                            geVar.setAlpha(0.0f);
                            geVar.setScaleX(0.5f);
                            geVar.setScaleY(0.5f);
                        }
                    }
                    this.H1 = true;
                    if (this.F1 != null) {
                        eg egVar6 = this.V2;
                        if (egVar6 != null && egVar6.H0()) {
                            this.F1.setVisibility(8);
                            this.F1.setTag(null);
                        }
                        this.F1.setAlpha(0.0f);
                        this.F1.setScaleX(0.0f);
                        this.F1.setScaleY(1.0f);
                        this.F1.setTranslationX(0.0f);
                    }
                    z10 = true;
                    if (!this.w4 || (imageView3 = this.s1) == null) {
                        return;
                    }
                    if (z13) {
                        imageView3.animate().translationX(z10 ? -kf.k0.c(64.0f, oeVar.l(), 0) : AndroidUtilities.dp(42.0f)).setDuration(320L).setInterpolator(mr.h).start();
                        return;
                    } else {
                        imageView3.setTranslationX(z10 ? -kf.k0.c(64.0f, oeVar.l(), 0) : AndroidUtilities.dp(42.0f));
                        return;
                    }
                }
                int i15 = this.r2;
                if (i15 == 1 && str == null) {
                    return;
                }
                if (i15 == 3 && str != null) {
                    return;
                }
                AnimatorSet animatorSet8 = this.n2;
                if (animatorSet8 != null) {
                    animatorSet8.cancel();
                    animatorSet = null;
                    this.n2 = null;
                } else {
                    animatorSet = null;
                }
                AnimatorSet animatorSet9 = this.o2;
                if (animatorSet9 != null) {
                    animatorSet9.cancel();
                    this.o2 = animatorSet;
                }
                if (u3Var != null) {
                    this.o2 = new AnimatorSet();
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(ObjectAnimator.ofFloat(u3Var, zdVar, 0.0f));
                    arrayList5.add(ObjectAnimator.ofFloat(u3Var, (Property<dg.u3, Float>) property, 0.5f));
                    ViewPropertyAnimator viewPropertyAnimator5 = this.m1;
                    if (viewPropertyAnimator5 != null) {
                        viewPropertyAnimator5.cancel();
                        this.m1 = null;
                    }
                    wg.g gVar5 = this.a5;
                    if (gVar5 != null) {
                        gVar5.e(0, z19, true);
                        if (geVar != null) {
                            float f13 = z19 ? 0.0f : 1.0f;
                            this.r1 = f13;
                            arrayList5.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property3, f13));
                            arrayList5.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property, z19 ? 0.5f : 1.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property2, z19 ? 0.5f : 1.0f));
                        }
                    } else if (geVar != null) {
                        this.r1 = 0.0f;
                        arrayList5.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property3, 0.0f));
                        arrayList5.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property, 0.5f));
                        arrayList5.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property2, 0.5f));
                    }
                    eg egVar7 = this.V2;
                    boolean z20 = egVar7 != null && egVar7.H0();
                    this.H1 = true;
                    qe qeVar4 = this.F1;
                    if (qeVar4 != null) {
                        qeVar4.setScaleY(1.0f);
                        if (z20) {
                            this.F1.setTag(null);
                            arrayList5.add(ObjectAnimator.ofFloat(this.F1, (Property<qe, Float>) property3, 0.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(this.F1, (Property<qe, Float>) property, 0.0f));
                            arrayList5.add(p(0.0f));
                        } else {
                            this.F1.setAlpha(0.0f);
                            this.F1.setScaleX(0.0f);
                            this.F1.setTranslationX(0.0f);
                        }
                    }
                    this.o2.playTogether(arrayList5);
                    this.o2.setDuration(100L);
                    this.o2.addListener(new te(this, z20, 1));
                    this.o2.start();
                    H1(0);
                    if (this.V2 != null && getVisibility() == 0) {
                        this.V2.x0();
                    }
                }
                this.n2 = new AnimatorSet();
                ArrayList arrayList6 = new ArrayList();
                if (leVar.getVisibility() == 0) {
                    r14 = 0;
                    arrayList6.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property3, 0.0f));
                } else {
                    r14 = 0;
                }
                se seVar10 = this.P0;
                if (seVar10 != null && seVar10.getVisibility() == 0) {
                    se seVar11 = this.P0;
                    float[] fArr17 = new float[1];
                    fArr17[r14] = 0.1f;
                    arrayList6.add(ObjectAnimator.ofFloat(seVar11, (Property<se, Float>) property, fArr17));
                    se seVar12 = this.P0;
                    float[] fArr18 = new float[1];
                    fArr18[r14] = 0.1f;
                    arrayList6.add(ObjectAnimator.ofFloat(seVar12, (Property<se, Float>) property2, fArr18));
                    se seVar13 = this.P0;
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
                if (z17) {
                    arrayList6.add(q(r14));
                } else if (z18) {
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
                        this.r2 = 3;
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
                        this.r2 = 1;
                        arrayList6.add(q(true));
                        getSendButtonInternal().setVisibility(r14);
                    }
                    this.n2.playTogether(arrayList6);
                    this.n2.setDuration(220L);
                    this.n2.setInterpolator(mr.h);
                    this.n2.addListener(new dg.y2(15, this, str));
                    this.n2.start();
                }
                imageView2 = imageView;
                if (str == null) {
                }
                this.n2.playTogether(arrayList6);
                this.n2.setDuration(220L);
                this.n2.setInterpolator(mr.h);
                this.n2.addListener(new dg.y2(15, this, str));
                this.n2.start();
            }
            z10 = true;
            if (this.w4) {
                return;
            } else {
                return;
            }
        }
        if (mgVar.getVisibility() != 0) {
            if (!z13) {
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
                se seVar14 = this.P0;
                if (seVar14 == null || seVar14.getVisibility() != 0) {
                    i12 = 8;
                } else {
                    this.P0.setScaleX(0.1f);
                    this.P0.setScaleY(0.1f);
                    this.P0.setAlpha(0.0f);
                    i12 = 8;
                    this.P0.setVisibility(8);
                }
                if (u3Var != null) {
                    u3Var.setVisibility(i12);
                    if (this.V2 != null && getVisibility() == 0) {
                        this.V2.x0();
                    }
                    z11 = false;
                    H1(0);
                    wg.g gVar6 = this.a5;
                    if (gVar6 != null) {
                        gVar6.e(0, false, false);
                    }
                    if (geVar != null) {
                        this.r1 = 0.0f;
                        geVar.setAlpha(0.0f);
                        geVar.setScaleX(0.5f);
                        geVar.setScaleY(0.5f);
                    }
                } else {
                    z11 = false;
                }
                this.H1 = z11;
                eg egVar8 = this.V2;
                boolean z21 = egVar8 != null && egVar8.H0();
                if (z21) {
                    a0();
                }
                qe qeVar5 = this.F1;
                if (qeVar5 != null) {
                    if (z21) {
                        qeVar5.setVisibility(0);
                        this.F1.setTag(1);
                    }
                    this.F1.setTranslationX(0.0f);
                    this.F1.setAlpha(1.0f);
                    this.F1.setScaleX(1.0f);
                    this.F1.setScaleY(1.0f);
                }
            } else {
                if (this.r2 == 5) {
                    return;
                }
                AnimatorSet animatorSet10 = this.n2;
                if (animatorSet10 != null) {
                    animatorSet10.cancel();
                    r52 = 0;
                    this.n2 = null;
                } else {
                    r52 = 0;
                }
                AnimatorSet animatorSet11 = this.o2;
                if (animatorSet11 != null) {
                    animatorSet11.cancel();
                    this.o2 = r52;
                }
                ViewPropertyAnimator viewPropertyAnimator6 = this.m1;
                if (viewPropertyAnimator6 != null) {
                    viewPropertyAnimator6.cancel();
                    this.m1 = r52;
                }
                if (u3Var != null) {
                    this.o2 = new AnimatorSet();
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(ObjectAnimator.ofFloat(u3Var, zdVar, 0.0f));
                    arrayList7.add(ObjectAnimator.ofFloat(u3Var, (Property<dg.u3, Float>) property, 0.5f));
                    this.H1 = false;
                    eg egVar9 = this.V2;
                    boolean z22 = egVar9 != null && egVar9.H0();
                    if (z22) {
                        a0();
                    }
                    wg.g gVar7 = this.a5;
                    if (gVar7 != null) {
                        gVar7.e(0, false, true);
                    }
                    if (geVar != null) {
                        this.r1 = 0.0f;
                        arrayList7.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property3, 0.0f));
                        arrayList7.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property, 0.5f));
                        arrayList7.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property2, 0.5f));
                    }
                    qe qeVar6 = this.F1;
                    if (qeVar6 != null) {
                        qeVar6.setScaleY(1.0f);
                        if (z22) {
                            this.F1.setVisibility(0);
                            this.F1.setTag(1);
                            this.F1.setPivotX(AndroidUtilities.dp(44.0f));
                            arrayList7.add(p(0.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.F1, (Property<qe, Float>) property3, 1.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.F1, (Property<qe, Float>) property, 1.0f));
                        } else {
                            this.F1.setTranslationX(0.0f);
                            this.F1.setAlpha(1.0f);
                            this.F1.setScaleX(1.0f);
                        }
                    }
                    this.o2.playTogether(arrayList7);
                    this.o2.setDuration(100L);
                    this.o2.addListener(new pe(this, 2));
                    this.o2.start();
                    H1(0);
                    if (this.V2 != null && getVisibility() == 0) {
                        this.V2.x0();
                    }
                }
                this.r2 = 5;
                this.n2 = new AnimatorSet();
                ArrayList arrayList8 = new ArrayList();
                if (leVar2.getVisibility() == 0) {
                    r142 = 0;
                    arrayList8.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property2, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property3, 0.0f));
                } else {
                    r142 = 0;
                }
                se seVar15 = this.P0;
                if (seVar15 != null && seVar15.getVisibility() == 0) {
                    se seVar16 = this.P0;
                    float[] fArr30 = new float[1];
                    fArr30[r142] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(seVar16, (Property<se, Float>) property, fArr30));
                    se seVar17 = this.P0;
                    float[] fArr31 = new float[1];
                    fArr31[r142] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(seVar17, (Property<se, Float>) property2, fArr31));
                    se seVar18 = this.P0;
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
                this.n2.playTogether(arrayList8);
                this.n2.setDuration(220L);
                this.n2.setInterpolator(mr.h);
                this.n2.addListener(new pe(this, 3));
                this.n2.start();
            }
        }
        oeVar = oeVar2;
        z10 = false;
        if (this.w4) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0() {
        org.telegram.ui.zn znVar;
        Editable editable;
        vh.y1 y1Var;
        CharSequence[] charSequenceArr;
        ArrayList<TLRPC.MessageEntity> entities;
        if (this.B0 == null || (znVar = this.L2) == null || !MessagesController.getInstance(this.N).richEditorAvailable()) {
            return;
        }
        TL_iv.RichMessage richMessage = this.A1;
        if (richMessage != null) {
            y1Var = new vh.y1(richMessage);
        } else {
            Editable text = this.B0.getText();
            if (!TextUtils.isEmpty(text) && TextUtils.indexOf((CharSequence) text, '`') >= 0) {
                try {
                    charSequenceArr = new CharSequence[]{new SpannableStringBuilder(text)};
                    entities = MediaDataController.getInstance(this.N).getEntities(charSequenceArr, true);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (entities != null && !entities.isEmpty()) {
                    editable = new SpannableStringBuilder(charSequenceArr[0]);
                    MessageObject.addEntitiesToText(editable, entities, false, false, false, false);
                    vh.y1 y1Var2 = new vh.y1(editable);
                    if (editable == text) {
                        int selectionStart = this.B0.getSelectionStart();
                        int selectionEnd = this.B0.getSelectionEnd();
                        if (selectionStart < 0) {
                            selectionStart = this.B0.length();
                        }
                        if (selectionEnd < 0) {
                            selectionEnd = selectionStart;
                        }
                        y1Var2.c = selectionStart;
                        y1Var2.d = selectionEnd;
                    }
                    y1Var2.I = new id(this, 15);
                    y1Var = y1Var2;
                }
            }
            editable = text;
            vh.y1 y1Var22 = new vh.y1(editable);
            if (editable == text) {
            }
            y1Var22.I = new id(this, 15);
            y1Var = y1Var22;
        }
        y1Var.setResourceProvider(this.S3);
        y1Var.G = znVar;
        y1Var.s = znVar.P;
        y1Var.v = znVar.V;
        y1Var.H = new id(this, 16);
        znVar.presentFragment(y1Var);
    }

    public final void J1() {
        ff ffVar = this.B0;
        if (ffVar != null) {
            ffVar.setTranslationX(this.E + this.D);
        }
    }

    public final void K() {
        if (this.R0 == null) {
            return;
        }
        Point point = AndroidUtilities.displaySize;
        int i10 = point.x > point.y ? this.u2 : this.t2;
        int dp = ((((this.k1 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
        int i11 = 2;
        if (this.N1 == 2) {
            dp = Math.min(dp, AndroidUtilities.dp(175.0f) + i10);
        }
        int i12 = this.R0.getLayoutParams().height;
        if (i12 == dp) {
            return;
        }
        AnimatorSet animatorSet = this.x3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.x3 = null;
        }
        this.z3 = dp;
        org.telegram.ui.Cells.b1 b1Var = this.p3;
        if (i12 > dp) {
            id idVar = new id(this, 6);
            this.R0.setLayerType(2, null);
            if (this.v) {
                this.w = idVar;
            } else {
                AnimatorSet animatorSet2 = new AnimatorSet();
                if (this.Z4 != null) {
                    animatorSet2.playTogether(ValueAnimator.ofInt(-(this.z3 - i10)), ValueAnimator.ofInt(-(this.z3 - i10)));
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofInt(this, b1Var, -(this.z3 - i10)), ObjectAnimator.ofInt(this.R0, b1Var, -(this.z3 - i10)));
                    ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new gd(this, i11));
                }
                animatorSet2.setDuration(300L);
                animatorSet2.setInterpolator(mr.f);
                animatorSet2.addListener(new dg.y2(18, this, idVar));
                this.x3 = animatorSet2;
                animatorSet2.start();
            }
        } else {
            if (this.Z4 == null) {
                this.R0.getLayoutParams().height = this.z3;
            }
            this.i1.requestLayout();
            ff ffVar = this.B0;
            if (ffVar != null) {
                int selectionStart = ffVar.getSelectionStart();
                int selectionEnd = this.B0.getSelectionEnd();
                ff ffVar2 = this.B0;
                ffVar2.setText(ffVar2.getText());
                this.B0.setSelection(selectionStart, selectionEnd);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            if (this.Z4 != null) {
                animatorSet3.playTogether(ValueAnimator.ofInt(-(this.z3 - i10)), ValueAnimator.ofInt(-(this.z3 - i10)));
            } else {
                animatorSet3.playTogether(ObjectAnimator.ofInt(this, b1Var, -(this.z3 - i10)), ObjectAnimator.ofInt(this.R0, b1Var, -(this.z3 - i10)));
                ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new gd(this, 3));
            }
            animatorSet3.setDuration(300L);
            animatorSet3.setInterpolator(mr.f);
            animatorSet3.addListener(new pe(this, 11));
            this.x3 = animatorSet3;
            this.R0.setLayerType(2, null);
            animatorSet3.start();
        }
        ch.f fVar = this.Z4;
        if (fVar != null) {
            ((ch.i) fVar).g(dp);
        }
    }

    public final void K0(CharSequence charSequence, String str, CharSequence charSequence2) {
        org.telegram.ui.zn znVar;
        if (this.B0 == null || (znVar = this.L2) == null || !MessagesController.getInstance(this.N).richEditorAvailable()) {
            return;
        }
        vh.y1 y1Var = new vh.y1(str);
        y1Var.h = charSequence;
        y1Var.n = charSequence2;
        y1Var.setResourceProvider(this.S3);
        y1Var.G = znVar;
        y1Var.s = znVar.P;
        y1Var.v = znVar.V;
        y1Var.I = new yd(this, 1);
        y1Var.H = new yd(this, 2);
        znVar.presentFragment(y1Var);
    }

    public final void K1(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        uf ufVar;
        this.x0 = false;
        boolean z4 = true;
        this.b = true;
        this.w0 = true;
        this.u0 = true;
        this.v0 = true;
        if (chat != null) {
            this.X0 = (ChatObject.canSendVoice(chat) || (ChatObject.canSendRoundVideo(chat) && this.a2)) ? false : true;
            this.b = ChatObject.canSendStickers(chat);
            boolean canSendPlain = ChatObject.canSendPlain(chat);
            this.w0 = canSendPlain;
            boolean z10 = (this.b || canSendPlain) ? false : true;
            this.x0 = z10;
            this.n = z10 ? 0.5f : 1.0f;
            F1();
            if (!this.x0 && (ufVar = this.R0) != null) {
                ufVar.M(-this.M2, !this.w0, !this.b);
            }
            this.u0 = ChatObject.canSendRoundVideo(chat);
            this.v0 = ChatObject.canSendVoice(chat);
        } else if (userFull != null) {
            this.X0 = userFull.voice_messages_forbidden;
            this.H = userFull;
        }
        float f10 = this.X0 ? 0.5f : 1.0f;
        le leVar = this.W0;
        leVar.setAlpha(f10);
        leVar.invalidate();
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.X0 ? i0(org.telegram.ui.ActionBar.j6.Wk) : -1, PorterDuff.Mode.SRC_IN);
        me meVar = this.Y0;
        meVar.setColorFilter(porterDuffColorFilter);
        meVar.invalidate();
        G1(false);
        boolean z11 = this.Z0;
        if (!this.u0 && z11) {
            z11 = false;
        }
        if (this.v0 || z11) {
            z4 = z11;
        } else if (!this.a2) {
            z4 = false;
        }
        k1(z4, false);
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            M();
            N();
        } else if (i10 == 1) {
            M();
            N();
        } else {
            if (i10 == 2) {
                lh.f5 f5Var = this.F0;
                f5Var.setAlpha(f10);
                f5Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, f10));
                f5Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, f10));
                f5Var.setVisibility(f10 <= 0.0f ? 4 : 0);
            } else if (i10 == 3) {
                float lerp = AndroidUtilities.lerp(1.0f, 0.79f, f10);
                ae aeVar = this.w1;
                aeVar.setScaleX(lerp);
                aeVar.setScaleY(AndroidUtilities.lerp(1.0f, 0.79f, f10));
                float lerp2 = AndroidUtilities.lerp(0.79f, 1.0f, f10);
                ImageView imageView = this.x1;
                imageView.setScaleX(lerp2);
                imageView.setScaleY(AndroidUtilities.lerp(0.79f, 1.0f, f10));
                imageView.setVisibility(f10 <= 0.0f ? 8 : 0);
                imageView.setAlpha(f10);
                oe oeVar = this.G0;
                if (oeVar != null) {
                    oeVar.setSameWidthFactor(f10);
                }
            }
        }
        invalidate();
    }

    public final void L0() {
        id idVar = new id(this, 28);
        if (SharedPrefsHelper.isWebViewConfirmShown(this.N, this.M2) || MessagesController.getInstance(this.N).whitelistedBots.contains(Long.valueOf(this.M2))) {
            idVar.run();
            return;
        }
        z4.o(this.L2, MessagesController.getInstance(this.N).getUser(Long.valueOf(this.M2)), new org.telegram.ui.np(15, this, idVar), new id(this, 29));
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
    public void L1(int i10, boolean z4) {
        boolean z10;
        int i11;
        char c3;
        float f10;
        int i12;
        ?? r10;
        boolean z11;
        int i13;
        long j10;
        ?? r102;
        int i14;
        float f11;
        ?? r103;
        int i15;
        float f12;
        boolean z12;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        int i16;
        char c10;
        char c11;
        Property property;
        og ogVar = og.a;
        og ogVar2 = og.b;
        Float valueOf = Float.valueOf(0.0f);
        Runnable runnable = this.c0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.c0 = null;
        }
        RecordCircle recordCircle = this.J1;
        if (recordCircle != null) {
            recordCircle.J = false;
        }
        boolean z13 = this.B2;
        Property property2 = View.TRANSLATION_X;
        Property property3 = View.SCALE_X;
        Property property4 = View.SCALE_Y;
        Property property5 = View.ALPHA;
        if (z13) {
            if (this.s2 == 1) {
                this.M4 = i10;
                return;
            }
            boolean z14 = this.M4 == 3;
            if (z14) {
                property = property3;
            } else {
                this.L = false;
                ig igVar = this.K1;
                if (igVar != null) {
                    igVar.y.d(1, false, false);
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.N);
                long j11 = this.M2;
                org.telegram.ui.zn znVar = this.L2;
                property = property3;
                mediaDataController.toggleDraftVoiceOnce(j11, (znVar == null || !znVar.e4) ? 0L : znVar.d(), this.L);
                this.f1 = 0L;
            }
            X();
            this.s2 = 1;
            uf ufVar = this.R0;
            if (ufVar != null) {
                ufVar.setEnabled(false);
            }
            try {
                if (this.m2 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.m2 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            AndroidUtilities.lockOrientation(this.K2);
            eg egVar = this.V2;
            if (egVar != null) {
                egVar.f1(0);
            }
            AnimatorSet animatorSet = this.p2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.q2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            Z();
            dh.d dVar = this.a1;
            if (dVar != null) {
                dVar.setVisibility(0);
            }
            Y();
            RecordCircle recordCircle2 = this.J1;
            if (recordCircle2 != null) {
                recordCircle2.J = false;
                recordCircle2.setVisibility(0);
                this.J1.setAmplitude(0.0d);
            }
            ig igVar2 = this.K1;
            if (igVar2 != null) {
                igVar2.setVisibility(0);
            }
            kg kgVar = this.h1;
            if (kgVar != null) {
                kgVar.a = 1.0f;
                kgVar.b = System.currentTimeMillis();
                kgVar.c = false;
                kgVar.e = false;
                kgVar.f.stop();
                kgVar.invalidate();
                this.h1.setScaleX(0.0f);
                this.h1.setScaleY(0.0f);
                this.h1.h = true;
            }
            this.p2 = new AnimatorSet();
            this.V0.setTranslationX(AndroidUtilities.dp(20.0f));
            this.V0.setAlpha(0.0f);
            if (this.M4 != 3) {
                this.g1.setTranslationX(AndroidUtilities.dp(20.0f));
                this.g1.setAlpha(0.0f);
                this.g1.setCancelToProgress(0.0f);
                SlideTextView slideTextView = this.g1;
                slideTextView.r = 1.0f;
                slideTextView.setEnabled(true);
            } else {
                this.g1.setTranslationX(0.0f);
                this.g1.setAlpha(0.0f);
                this.g1.setCancelToProgress(1.0f);
                this.g1.setEnabled(true);
            }
            this.J1.c(this.M4 == 3);
            this.g2 = false;
            x0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            Property property6 = property;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.N0, this.V3, 0.0f), ObjectAnimator.ofFloat(this.N0, this.X3, 0.0f), ObjectAnimator.ofFloat(this.h1, (Property<kg, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.h1, (Property<kg, Float>) property6, 1.0f), ObjectAnimator.ofFloat(this.V0, (Property<ng, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.V0, (Property<ng, Float>) property5, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<SlideTextView, Float>) property2, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<SlideTextView, Float>) property5, 1.0f));
            ig igVar3 = this.K1;
            if (igVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(igVar3, (Property<ig, Float>) property5, 1.0f));
            }
            if (this.Y0 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.W0, (Property<le, Float>) property5, 0.0f));
            }
            rh.z zVar = this.i0;
            if (zVar != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(zVar, (Property<rh.z, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.i0, (Property<rh.z, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.i0, (Property<rh.z, Float>) property5, 0.0f));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.B0, this.Z3, AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.B0, (Property<ff, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.b1, (Property<ae, Float>) property5, 1.0f));
            if (z14) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.e1, (Property<qk0, Float>) property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.d1, (Property<jj0, Float>) property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.d1, (Property<jj0, Float>) property6, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.d1, (Property<jj0, Float>) property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.c1, (Property<x71, Float>) property5, 0.0f));
            }
            if (this.F1 != null) {
                animatorSet4.playTogether(p(AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.F1, (Property<qe, Float>) property5, 0.0f));
            }
            dg.u3 u3Var = this.l1;
            if (u3Var != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(u3Var, this.Y3, AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.l1, this.W3, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.m1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.m1 = null;
                }
                ge geVar = this.n1;
                this.r1 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.n1, (Property<ge, Float>) property6, 0.5f), ObjectAnimator.ofFloat(this.n1, (Property<ge, Float>) property4, 0.5f));
            }
            wg.g gVar = this.a5;
            if (gVar != null) {
                gVar.e(0, false, true);
            }
            this.p2.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.J1, this.q3, 1.0f).setDuration(300L));
            if (!z14) {
                this.p2.playTogether(ObjectAnimator.ofFloat(this.J1, this.r3, 1.0f).setDuration(300L));
            }
            this.p2.addListener(new lf(this, z14));
            this.p2.setInterpolator(new DecelerateInterpolator());
            this.p2.start();
            this.V0.a(this.f1);
        } else {
            if (this.g2 && i10 == 3) {
                return;
            }
            PowerManager.WakeLock wakeLock = this.m2;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.m2 = null;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
            AndroidUtilities.unlockOrientation(this.K2);
            this.i3 = false;
            if (this.s2 == 0) {
                this.M4 = i10;
                return;
            }
            this.O.getMessagesController().sendTyping(this.M2, getThreadMessageId(), 2, 0);
            this.s2 = 0;
            uf ufVar2 = this.R0;
            if (ufVar2 != null) {
                ufVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.p2;
            if (animatorSet5 != null) {
                z10 = animatorSet5.isRunning();
                me meVar = this.Y0;
                if (meVar != null) {
                    meVar.setScaleX(1.0f);
                    this.Y0.setScaleY(1.0f);
                }
                this.p2.removeAllListeners();
                this.p2.cancel();
            } else {
                z10 = false;
            }
            AnimatorSet animatorSet6 = this.q2;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            ff ffVar = this.B0;
            if (ffVar != null) {
                ffVar.setVisibility(0);
            }
            this.p2 = new AnimatorSet();
            if (z10 || i10 == 4) {
                me meVar2 = this.Y0;
                if (meVar2 != null) {
                    meVar2.setVisibility(0);
                }
                this.p2.playTogether(ObjectAnimator.ofFloat(this.N0, this.V3, 1.0f), ObjectAnimator.ofFloat(this.N0, this.X3, this.x0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.h1, (Property<kg, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.h1, (Property<kg, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.J1, this.q3, 0.0f), ObjectAnimator.ofFloat(this.J1, this.r3, 0.0f), ObjectAnimator.ofFloat(this.W0, (Property<le, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.V0, (Property<ng, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.W0, (Property<le, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.B0, (Property<ff, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.B0, this.Z3, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                ig igVar4 = this.K1;
                if (igVar4 != null) {
                    i11 = 1;
                    c3 = 0;
                    this.p2.playTogether(ObjectAnimator.ofFloat(igVar4, (Property<ig, Float>) property5, 0.0f));
                    this.K1.a();
                } else {
                    i11 = 1;
                    c3 = 0;
                }
                rh.z zVar2 = this.i0;
                if (zVar2 != null) {
                    AnimatorSet animatorSet7 = this.p2;
                    float[] fArr = new float[i11];
                    f10 = 1.0f;
                    fArr[c3] = 1.0f;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zVar2, (Property<rh.z, Float>) property4, fArr);
                    rh.z zVar3 = this.i0;
                    float[] fArr2 = new float[i11];
                    fArr2[c3] = 1.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(zVar3, (Property<rh.z, Float>) property3, fArr2);
                    rh.z zVar4 = this.i0;
                    float[] fArr3 = new float[i11];
                    fArr3[c3] = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(zVar4, (Property<rh.z, Float>) property5, fArr3);
                    Animator[] animatorArr = new Animator[3];
                    animatorArr[c3] = ofFloat;
                    animatorArr[i11] = ofFloat2;
                    animatorArr[2] = ofFloat3;
                    animatorSet7.playTogether(animatorArr);
                } else {
                    f10 = 1.0f;
                }
                me meVar3 = this.Y0;
                if (meVar3 != null) {
                    meVar3.setScaleX(f10);
                    this.Y0.setScaleY(f10);
                    i12 = 1;
                    this.p2.playTogether(ObjectAnimator.ofFloat(this.W0, (Property<le, Float>) property5, f10));
                    this.Y0.j(s0() ? ogVar2 : ogVar, true);
                } else {
                    i12 = 1;
                }
                if (this.F1 != null) {
                    AnimatorSet animatorSet8 = this.p2;
                    ValueAnimator p10 = p(0.0f);
                    qe qeVar = this.F1;
                    float[] fArr4 = new float[i12];
                    fArr4[0] = 1.0f;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(qeVar, (Property<qe, Float>) property5, fArr4);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = p10;
                    animatorArr2[i12] = ofFloat4;
                    animatorSet8.playTogether(animatorArr2);
                }
                if (this.l1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.m1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.m1 = null;
                    }
                    z11 = true;
                    r10 = 0;
                    this.p2.playTogether(ObjectAnimator.ofFloat(this.l1, this.Y3, 0.0f), ObjectAnimator.ofFloat(this.l1, this.W3, 1.0f));
                    AnimatorSet animatorSet9 = this.p2;
                    ge geVar2 = this.n1;
                    this.r1 = 1.0f;
                    animatorSet9.playTogether(ObjectAnimator.ofFloat(geVar2, (Property<ge, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.n1, (Property<ge, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.n1, (Property<ge, Float>) property4, 1.0f));
                } else {
                    r10 = 0;
                    z11 = true;
                }
                wg.g gVar2 = this.a5;
                if (gVar2 != 0) {
                    gVar2.e(r10, r10, z11);
                }
                this.g2 = z11;
                x0();
                this.p2.setDuration(150L);
            } else if (i10 == 3) {
                X();
                Y();
                SlideTextView slideTextView2 = this.g1;
                if (slideTextView2 != null) {
                    slideTextView2.setEnabled(false);
                }
                if (this.Z0) {
                    qk0 qk0Var = this.e1;
                    if (qk0Var != null) {
                        qk0Var.setVisibility(8);
                    }
                    ae aeVar = this.b1;
                    if (aeVar != null) {
                        aeVar.setAlpha(1.0f);
                        this.b1.setVisibility(0);
                    }
                    jj0 jj0Var = this.d1;
                    if (jj0Var != null) {
                        jj0Var.setProgress(0.0f);
                        this.d1.i();
                    }
                    z12 = true;
                    f12 = 1.0f;
                } else {
                    x71 x71Var = this.c1;
                    if (x71Var != null) {
                        x71Var.setVisibility(8);
                        x0();
                    }
                    ae aeVar2 = this.b1;
                    if (aeVar2 != null) {
                        aeVar2.setVisibility(0);
                        f12 = 1.0f;
                        this.b1.setAlpha(1.0f);
                    } else {
                        f12 = 1.0f;
                    }
                    qk0 qk0Var2 = this.e1;
                    if (qk0Var2 != null) {
                        qk0Var2.setVisibility(0);
                        this.e1.setAlpha(0.0f);
                    }
                    z12 = true;
                }
                this.o4 = z12;
                this.j4 = f12;
                this.h4 = this.g4;
                this.f4 = f12;
                SlideTextView slideTextView3 = this.g1;
                if (slideTextView3 != null) {
                    slideTextView3.setCancelToProgress(f12);
                }
                ig igVar5 = this.K1;
                if (igVar5 != null) {
                    igVar5.invalidate();
                }
                jj0 jj0Var2 = this.d1;
                if (jj0Var2 != null) {
                    jj0Var2.setAlpha(0.0f);
                    this.d1.setScaleX(0.0f);
                    this.d1.setScaleY(0.0f);
                    this.d1.setProgress(0.0f);
                    this.d1.i();
                }
                if (this.Z0 || this.v4) {
                    this.c1.setVisibility(0);
                    viewGroup = null;
                    layoutParams = null;
                } else {
                    viewGroup = (ViewGroup) this.b1.getParent();
                    layoutParams = this.b1.getLayoutParams();
                    viewGroup.removeView(this.b1);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.V1 == null ? kf.k0.c(44.0f, this.G0.l(), 0) : 0), AndroidUtilities.dp(44.0f));
                    layoutParams2.gravity = 80;
                    layoutParams2.leftMargin = AndroidUtilities.dp(7.0f);
                    layoutParams2.rightMargin = AndroidUtilities.dp(7.0f);
                    this.i1.addView(this.b1, layoutParams2);
                    this.c1.setVisibility(8);
                }
                x0();
                AnimatorSet animatorSet10 = new AnimatorSet();
                if (z4) {
                    this.e1.setAllowDraw(false);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat5.addUpdateListener(new gd(this, 6));
                    ofFloat5.addListener(new mf(this));
                    ofFloat5.setDuration(s0() ? 490L : 580L);
                    AnimatorSet animatorSet11 = new AnimatorSet();
                    animatorSet11.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<kg, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.h1, (Property<kg, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.V0, (Property<ng, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.V0, (Property<ng, Float>) property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.g1, (Property<SlideTextView, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.d1, (Property<jj0, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.d1, (Property<jj0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.d1, (Property<jj0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.N0, this.V3, 0.0f), ObjectAnimator.ofFloat(this.N0, this.X3, 0.0f), ObjectAnimator.ofFloat(this.B0, (Property<ff, Float>) property5, 0.0f));
                    jj0 jj0Var3 = this.d1;
                    if (jj0Var3 != null) {
                        jj0Var3.setAlpha(0.0f);
                        this.d1.setScaleX(0.0f);
                        this.d1.setScaleY(0.0f);
                    }
                    if (this.Y0 != null) {
                        i16 = 1;
                        animatorSet11.playTogether(ObjectAnimator.ofFloat(this.W0, (Property<le, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.W0, (Property<le, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.W0, (Property<le, Float>) property4, 1.0f));
                        this.Y0.j(s0() ? ogVar2 : ogVar, true);
                    } else {
                        i16 = 1;
                    }
                    rh.z zVar5 = this.i0;
                    if (zVar5 != null) {
                        float[] fArr5 = new float[i16];
                        fArr5[0] = 0.0f;
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(zVar5, (Property<rh.z, Float>) property5, fArr5);
                        rh.z zVar6 = this.i0;
                        float[] fArr6 = new float[i16];
                        fArr6[0] = 0.0f;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(zVar6, (Property<rh.z, Float>) property3, fArr6);
                        rh.z zVar7 = this.i0;
                        float[] fArr7 = new float[i16];
                        fArr7[0] = 0.0f;
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(zVar7, (Property<rh.z, Float>) property4, fArr7);
                        Animator[] animatorArr3 = new Animator[3];
                        animatorArr3[0] = ofFloat6;
                        animatorArr3[i16] = ofFloat7;
                        animatorArr3[2] = ofFloat8;
                        animatorSet11.playTogether(animatorArr3);
                    }
                    animatorSet11.addListener(new pe(this, 8));
                    animatorSet11.setDuration(150L);
                    animatorSet11.setStartDelay(150L);
                    if (s0()) {
                        this.c1.setAlpha(0.0f);
                        c10 = 1;
                        c11 = 0;
                        animatorSet10.playTogether(ObjectAnimator.ofFloat(this.c1, (Property<x71, Float>) property5, 1.0f));
                        animatorSet10.setDuration(150L);
                        animatorSet10.setStartDelay(430L);
                    } else {
                        c10 = 1;
                        c11 = 0;
                    }
                    AnimatorSet animatorSet12 = this.p2;
                    Animator[] animatorArr4 = new Animator[3];
                    animatorArr4[c11] = animatorSet11;
                    animatorArr4[c10] = ofFloat5;
                    animatorArr4[2] = animatorSet10;
                    animatorSet12.playTogether(animatorArr4);
                    this.p2.addListener(new nh.g3(this, viewGroup, layoutParams, 2));
                } else {
                    Z();
                    this.q3.set(this.J1, Float.valueOf(1.0f));
                    this.J1.setTransformToSeekbar(1.0f);
                    if (!this.Z0) {
                        float f13 = this.l4;
                        if (f13 != 0.0f && this.e1 != null) {
                            this.e1.setAlpha(mr.j.getInterpolation(Math.max(0.0f, ((f13 - 0.38f) - 0.25f) / 0.37f)));
                            this.e1.invalidate();
                        }
                    }
                    this.h1.setScaleY(0.0f);
                    this.h1.setScaleX(0.0f);
                    this.V0.setAlpha(0.0f);
                    this.V0.setTranslationX(-AndroidUtilities.dp(20.0f));
                    this.g1.setAlpha(0.0f);
                    this.d1.setAlpha(1.0f);
                    this.d1.setScaleY(1.0f);
                    this.d1.setScaleX(1.0f);
                    this.V3.set(this.N0, valueOf);
                    this.X3.set(this.N0, valueOf);
                    this.B0.setAlpha(0.0f);
                    me meVar4 = this.Y0;
                    if (meVar4 != null) {
                        if (s0()) {
                            ogVar = ogVar2;
                        }
                        meVar4.j(ogVar, z4);
                        this.W0.setAlpha(1.0f);
                        this.W0.setScaleX(1.0f);
                        this.W0.setScaleY(1.0f);
                    }
                    rh.z zVar8 = this.i0;
                    if (zVar8 != null) {
                        zVar8.setAlpha(0.0f);
                        this.i0.setScaleX(0.0f);
                        this.i0.setScaleY(0.0f);
                    }
                    if (s0()) {
                        this.c1.setAlpha(1.0f);
                    }
                    if (viewGroup != null) {
                        this.i1.removeView(this.b1);
                        viewGroup.addView(this.b1, layoutParams);
                    }
                    this.b1.setAlpha(1.0f);
                    this.e1.setAlpha(1.0f);
                    this.h = 0.0f;
                    this.n = 0.0f;
                    F1();
                    x0();
                }
            } else if (i10 == 2 || i10 == 5) {
                me meVar5 = this.Y0;
                if (meVar5 != null) {
                    meVar5.setVisibility(0);
                }
                this.g2 = true;
                x0();
                AnimatorSet animatorSet13 = new AnimatorSet();
                animatorSet13.playTogether(ObjectAnimator.ofFloat(this.N0, this.V3, 1.0f), ObjectAnimator.ofFloat(this.N0, this.X3, this.x0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.h1, (Property<kg, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.h1, (Property<kg, Float>) property3, 0.0f));
                ig igVar6 = this.K1;
                if (igVar6 != null) {
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(igVar6, (Property<ig, Float>) property5, 0.0f));
                    this.K1.a();
                }
                rh.z zVar9 = this.i0;
                if (zVar9 != null) {
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(zVar9, (Property<rh.z, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.i0, (Property<rh.z, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.i0, (Property<rh.z, Float>) property5, 1.0f));
                }
                AnimatorSet animatorSet14 = new AnimatorSet();
                animatorSet14.playTogether(ObjectAnimator.ofFloat(this.V0, (Property<ng, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.V0, (Property<ng, Float>) property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.g1, (Property<SlideTextView, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<SlideTextView, Float>) property2, -AndroidUtilities.dp(20.0f)));
                if (i10 != 5) {
                    this.W0.setScaleX(0.0f);
                    this.W0.setScaleY(0.0f);
                    ge geVar3 = this.n1;
                    if (geVar3 != null && geVar3.getVisibility() == 0) {
                        this.n1.setScaleX(0.5f);
                        this.n1.setScaleY(0.5f);
                    }
                    se seVar = this.t1;
                    if (seVar != null && seVar.getVisibility() == 0) {
                        this.t1.setScaleX(0.0f);
                        this.t1.setScaleY(0.0f);
                    }
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.W0, (Property<le, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.W0, (Property<le, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.W0, (Property<le, Float>) property5, 1.0f));
                    if (this.l1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator3 = this.m1;
                        if (viewPropertyAnimator3 != null) {
                            viewPropertyAnimator3.cancel();
                            this.m1 = null;
                        }
                        i14 = 1;
                        r102 = 0;
                        animatorSet13.playTogether(ObjectAnimator.ofFloat(this.l1, this.W3, 1.0f), ObjectAnimator.ofFloat(this.l1, this.Y3, 0.0f));
                        ge geVar4 = this.n1;
                        this.r1 = 1.0f;
                        animatorSet13.playTogether(ObjectAnimator.ofFloat(geVar4, (Property<ge, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.n1, (Property<ge, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.n1, (Property<ge, Float>) property4, 1.0f));
                    } else {
                        r102 = 0;
                        i14 = 1;
                    }
                    wg.g gVar3 = this.a5;
                    if (gVar3 != 0) {
                        gVar3.e(r102, r102, i14);
                    }
                    se seVar2 = this.t1;
                    if (seVar2 != null) {
                        float[] fArr8 = new float[i14];
                        fArr8[r102] = 1.0f;
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(seVar2, (Property<se, Float>) property3, fArr8);
                        se seVar3 = this.t1;
                        float[] fArr9 = new float[i14];
                        fArr9[r102] = 1.0f;
                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(seVar3, (Property<se, Float>) property4, fArr9);
                        Animator[] animatorArr5 = new Animator[2];
                        animatorArr5[r102] = ofFloat9;
                        animatorArr5[i14] = ofFloat10;
                        animatorSet13.playTogether(animatorArr5);
                    }
                    if (this.Y0 != null) {
                        le leVar = this.W0;
                        float[] fArr10 = new float[i14];
                        fArr10[r102] = 1.0f;
                        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(leVar, (Property<le, Float>) property5, fArr10);
                        Animator[] animatorArr6 = new Animator[i14];
                        animatorArr6[r102] = ofFloat11;
                        animatorSet13.playTogether(animatorArr6);
                        le leVar2 = this.W0;
                        float[] fArr11 = new float[i14];
                        fArr11[r102] = 1.0f;
                        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(leVar2, (Property<le, Float>) property3, fArr11);
                        Animator[] animatorArr7 = new Animator[i14];
                        animatorArr7[r102] = ofFloat12;
                        animatorSet13.playTogether(animatorArr7);
                        le leVar3 = this.W0;
                        float[] fArr12 = new float[i14];
                        fArr12[r102] = 1.0f;
                        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(leVar3, (Property<le, Float>) property4, fArr12);
                        Animator[] animatorArr8 = new Animator[i14];
                        animatorArr8[r102] = ofFloat13;
                        animatorSet13.playTogether(animatorArr8);
                        this.Y0.j(s0() ? ogVar2 : ogVar, i14);
                    }
                    qe qeVar2 = this.F1;
                    if (qeVar2 != null) {
                        float[] fArr13 = new float[i14];
                        fArr13[0] = 1.0f;
                        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(qeVar2, (Property<qe, Float>) property5, fArr13);
                        ValueAnimator p11 = p(0.0f);
                        Animator[] animatorArr9 = new Animator[2];
                        animatorArr9[0] = ofFloat14;
                        animatorArr9[i14] = p11;
                        animatorSet13.playTogether(animatorArr9);
                    }
                    j10 = 150;
                } else {
                    AnimatorSet animatorSet15 = new AnimatorSet();
                    animatorSet15.playTogether(ObjectAnimator.ofFloat(this.W0, (Property<le, Float>) property5, 1.0f));
                    if (this.l1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.m1;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.m1 = null;
                        }
                        i13 = 1;
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(this.l1, this.Y3, 0.0f), ObjectAnimator.ofFloat(this.l1, this.W3, 1.0f));
                        ge geVar5 = this.n1;
                        this.r1 = 1.0f;
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(geVar5, (Property<ge, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.n1, (Property<ge, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.n1, (Property<ge, Float>) property4, 1.0f));
                    } else {
                        i13 = 1;
                    }
                    wg.g gVar4 = this.a5;
                    if (gVar4 != null) {
                        gVar4.e(0, false, i13);
                    }
                    qe qeVar3 = this.F1;
                    if (qeVar3 != null) {
                        float[] fArr14 = new float[i13];
                        fArr14[0] = 1.0f;
                        ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(qeVar3, (Property<qe, Float>) property5, fArr14);
                        ValueAnimator p12 = p(0.0f);
                        Animator[] animatorArr10 = new Animator[2];
                        animatorArr10[0] = ofFloat15;
                        animatorArr10[i13] = p12;
                        animatorSet15.playTogether(animatorArr10);
                    }
                    j10 = 150;
                    animatorSet15.setDuration(150L);
                    animatorSet15.setStartDelay(110L);
                    animatorSet15.addListener(new pe(this, 9));
                    AnimatorSet animatorSet16 = this.p2;
                    Animator[] animatorArr11 = new Animator[i13];
                    animatorArr11[0] = animatorSet15;
                    animatorSet16.playTogether(animatorArr11);
                }
                animatorSet13.setDuration(j10);
                animatorSet13.setStartDelay(700L);
                animatorSet14.setDuration(200L);
                animatorSet14.setStartDelay(200L);
                this.D = 0.0f;
                J1();
                ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(this.B0, (Property<ff, Float>) property5, 1.0f);
                ofFloat16.setStartDelay(this.s == 1.0f ? 300L : 700L);
                ofFloat16.setDuration(200L);
                this.p2.playTogether(animatorSet13, animatorSet14, ofFloat16, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.g4).setDuration(200L));
                if (i10 == 5) {
                    ChatActivityEnterView.this.n4 = true;
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                    duration.setInterpolator(mr.j);
                    this.p2.playTogether(duration);
                } else {
                    ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                    ofFloat17.setDuration(360L);
                    ofFloat17.setStartDelay(490L);
                    this.p2.playTogether(ofFloat17);
                }
                kg kgVar2 = this.h1;
                if (kgVar2 != null) {
                    kgVar2.e = true;
                    gj0 gj0Var = kgVar2.f;
                    gj0Var.Q(0.0f, true);
                    if (kgVar2.d) {
                        gj0Var.start();
                    }
                }
            } else {
                me meVar6 = this.Y0;
                if (meVar6 != null) {
                    meVar6.setVisibility(0);
                }
                AnimatorSet animatorSet17 = new AnimatorSet();
                animatorSet17.playTogether(ObjectAnimator.ofFloat(this.N0, this.V3, 1.0f), ObjectAnimator.ofFloat(this.N0, this.X3, this.x0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.h1, (Property<kg, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.h1, (Property<kg, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.W0, (Property<le, Float>) property5, 1.0f));
                ig igVar7 = this.K1;
                if (igVar7 != null) {
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(igVar7, (Property<ig, Float>) property5, 0.0f));
                    this.K1.a();
                }
                rh.z zVar10 = this.i0;
                if (zVar10 != null) {
                    f11 = 1.0f;
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(zVar10, (Property<rh.z, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.i0, (Property<rh.z, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.i0, (Property<rh.z, Float>) property5, 1.0f));
                } else {
                    f11 = 1.0f;
                }
                me meVar7 = this.Y0;
                if (meVar7 != null) {
                    meVar7.setScaleX(f11);
                    this.Y0.setScaleY(f11);
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(this.W0, (Property<le, Float>) property5, f11));
                    this.Y0.j(s0() ? ogVar2 : ogVar, true);
                }
                if (this.l1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator5 = this.m1;
                    if (viewPropertyAnimator5 != null) {
                        viewPropertyAnimator5.cancel();
                        this.m1 = null;
                    }
                    this.x = 0.0f;
                    A1();
                    i15 = 1;
                    r103 = 0;
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(this.l1, this.W3, 1.0f));
                    ge geVar6 = this.n1;
                    this.r1 = 1.0f;
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(geVar6, (Property<ge, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.n1, (Property<ge, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.n1, (Property<ge, Float>) property4, 1.0f));
                } else {
                    r103 = 0;
                    i15 = 1;
                }
                wg.g gVar5 = this.a5;
                if (gVar5 != 0) {
                    gVar5.e(r103, r103, i15);
                }
                qe qeVar4 = this.F1;
                if (qeVar4 != null) {
                    float[] fArr15 = new float[i15];
                    fArr15[r103] = 1.0f;
                    ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(qeVar4, (Property<qe, Float>) property5, fArr15);
                    ValueAnimator p13 = p(0.0f);
                    Animator[] animatorArr12 = new Animator[2];
                    animatorArr12[r103] = ofFloat18;
                    animatorArr12[i15] = p13;
                    animatorSet17.playTogether(animatorArr12);
                }
                animatorSet17.setDuration(150L);
                animatorSet17.setStartDelay(200L);
                AnimatorSet animatorSet18 = new AnimatorSet();
                ng ngVar = this.V0;
                float[] fArr16 = new float[i15];
                fArr16[r103] = 0.0f;
                ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(ngVar, (Property<ng, Float>) property5, fArr16);
                ng ngVar2 = this.V0;
                float[] fArr17 = new float[i15];
                fArr17[r103] = AndroidUtilities.dp(40.0f);
                ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(ngVar2, (Property<ng, Float>) property2, fArr17);
                SlideTextView slideTextView4 = this.g1;
                float[] fArr18 = new float[i15];
                fArr18[r103] = 0.0f;
                ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(slideTextView4, (Property<SlideTextView, Float>) property5, fArr18);
                SlideTextView slideTextView5 = this.g1;
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
                ofFloat23.setDuration(this.d0 ? 220L : 360L);
                this.D = 0.0f;
                J1();
                ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(this.B0, (Property<ff, Float>) property5, 1.0f);
                ofFloat24.setStartDelay(this.s == 1.0f ? 150L : 450L);
                ofFloat24.setDuration(200L);
                this.p2.playTogether(animatorSet17, animatorSet18, ofFloat24, ofFloat23);
            }
            this.p2.addListener(new of(this, i10));
            this.p2.start();
            ng ngVar3 = this.V0;
            if (ngVar3 != null) {
                ngVar3.b();
            }
        }
        this.V2.c();
        P1(true);
        this.M4 = i10;
    }

    public final void M() {
        this.g5 = y(true);
        float y10 = y(false);
        if (this.f5 != y10) {
            this.f5 = y10;
            A0(y10);
        }
    }

    public final boolean M0() {
        return this.S0 != null;
    }

    public final void M1() {
        int i02 = i0(org.telegram.ui.ActionBar.j6.jf);
        int i03 = i0(org.telegram.ui.ActionBar.j6.Sd);
        int i04 = i0(org.telegram.ui.ActionBar.j6.df);
        jj0 jj0Var = this.d1;
        if (jj0Var != null) {
            jj0Var.h(i02, "Cup Red");
            this.d1.h(i02, "Box Red");
            this.d1.h(i04, "Cup Grey");
            this.d1.h(i04, "Box Grey");
            this.d1.h(i03, "Line 1");
            this.d1.h(i03, "Line 2");
            this.d1.h(i03, "Line 3");
        }
    }

    public final void N() {
        float f10 = this.c5.e;
        if (this.C1 != null) {
            float measuredHeight = getMeasuredHeight() - this.b5.e;
            this.C1.setTranslationY(measuredHeight - (r4.getMeasuredHeight() * f10));
            this.C1.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        boolean z4 = f10 > 0.0f;
        if (this.I4 == z4) {
            return;
        }
        ae aeVar = this.v1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aeVar.getLayoutParams();
        int i10 = z4 ? this.C1.getLayoutParams().height : 0;
        layoutParams.topMargin = i10;
        layoutParams.topMargin = AndroidUtilities.dp(9.0f) + i10;
        aeVar.setLayoutParams(layoutParams);
        this.I4 = z4;
        setMinimumHeight(AndroidUtilities.dp(44.0f) + (z4 ? this.C1.getLayoutParams().height : 0));
        if (this.v3) {
            if (this.N1 == 0) {
                n1(false, true, false, true);
            } else {
                K();
            }
        }
    }

    public boolean N0() {
        return true;
    }

    public final void N1() {
        RichMessageLayout.PreviewView previewView = this.y1;
        if (previewView == null) {
            return;
        }
        boolean z4 = this.z1;
        boolean z10 = this.A1 != null && this.V1 == null;
        this.z1 = z10;
        oe oeVar = this.G0;
        ImageView imageView = this.O0;
        de deVar = this.N0;
        if (z10) {
            previewView.setResourcesProvider(this.S3);
            this.y1.set(this.A1);
            this.y1.setVisibility(0);
            ff ffVar = this.B0;
            if (ffVar != null) {
                ffVar.setVisibility(8);
            }
            deVar.setVisibility(8);
            imageView.setVisibility(0);
            oeVar.setLocked(!UserConfig.getInstance(this.N).isPremium());
        } else {
            previewView.setVisibility(8);
            ff ffVar2 = this.B0;
            if (ffVar2 != null) {
                ffVar2.setVisibility(0);
            }
            deVar.setVisibility(0);
            imageView.setVisibility(8);
            oeVar.setLocked(false);
        }
        E1();
        if (z4 != this.z1) {
            J(true);
        }
    }

    public final void O() {
        org.telegram.ui.zn znVar = this.L2;
        if (znVar != null) {
            MediaDataController.getInstance(this.N).saveDraft(znVar.a(), znVar.B7(znVar.k5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final void O0(int i10, int i11, CharSequence charSequence, boolean z4) {
        if (this.B0 == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.B0.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z4) {
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.B0.getPaint().getFontMetricsInt(), false, (int[]) null);
            }
            this.B0.setText(spannableStringBuilder);
            this.B0.setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void O1(boolean z4) {
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean isChatDialog = DialogObject.isChatDialog(this.M2);
        ImageView imageView = this.E1;
        if (isChatDialog) {
            TLRPC.Chat chat = this.O.getMessagesController().getChat(Long.valueOf(-this.M2));
            this.c2 = MessagesController.getNotificationsSettings(this.N).getBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + this.M2, false);
            z10 = ChatObject.isChannel(chat) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages)) && !chat.megagroup;
            this.d2 = z10;
            if (imageView != null) {
                if (this.b0 == null) {
                    this.b0 = new jr(getContext(), R.drawable.input_notify_on, org.telegram.ui.ActionBar.j6.Wk);
                }
                this.b0.a(this.c2, false);
                imageView.setImageDrawable(this.b0);
            } else {
                z10 = false;
            }
            dg.u3 u3Var = this.l1;
            if (u3Var != null) {
                H1(u3Var.getVisibility() == 0 ? 1 : 0);
            }
        } else {
            z10 = false;
        }
        boolean z11 = (this.V2 == null || c() || !this.V2.H0()) ? false : true;
        boolean z12 = (!z11 || this.H1 || this.B2) ? false : true;
        if (z12) {
            a0();
        }
        qe qeVar = this.F1;
        if (qeVar != null) {
            if ((qeVar.getTag() != null && z12) || (this.F1.getTag() == null && !z12)) {
                if (imageView != null) {
                    int i10 = (z11 || !z10 || this.F1.getVisibility() == 0) ? 8 : 0;
                    if (i10 != imageView.getVisibility()) {
                        imageView.setVisibility(i10);
                        return;
                    }
                    return;
                }
                return;
            }
            this.F1.setTag(z12 ? 1 : null);
        } else if (imageView != null) {
            int i11 = (z11 || !z10) ? 8 : 0;
            if (i11 != imageView.getVisibility()) {
                imageView.setVisibility(i11);
            }
        }
        AnimatorSet animatorSet = this.I1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.I1 = null;
        }
        if (z4 && !z10) {
            qe qeVar2 = this.F1;
            if (qeVar2 != null) {
                if (z12) {
                    qeVar2.setVisibility(0);
                }
                this.F1.setPivotX(AndroidUtilities.dp(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.I1 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.F1, (Property<qe, Float>) View.ALPHA, z12 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.F1, (Property<qe, Float>) View.SCALE_X, z12 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.F1, (Property<qe, Float>) View.SCALE_Y, z12 ? 1.0f : 0.1f));
                this.I1.setDuration(180L);
                this.I1.addListener(new te(this, z12, 2));
                this.I1.start();
                return;
            }
            return;
        }
        qe qeVar3 = this.F1;
        if (qeVar3 == null) {
            if (imageView != null) {
                imageView.setVisibility(z10 ? 0 : 8);
                return;
            }
            return;
        }
        qeVar3.setVisibility(z12 ? 0 : 8);
        this.F1.setAlpha(z12 ? 1.0f : 0.0f);
        this.F1.setScaleX(z12 ? 1.0f : 0.1f);
        this.F1.setScaleY(z12 ? 1.0f : 0.1f);
        if (imageView != null) {
            imageView.setVisibility((!z10 || this.F1.getVisibility() == 0) ? 8 : 0);
        }
        this.F1.setTranslationX(0.0f);
    }

    public final void P() {
        AndroidUtilities.hideKeyboard(this.B0);
    }

    public final void P0() {
        n1(false, true, false, true);
        t1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.B2 = false;
        me meVar = this.Y0;
        if (meVar != null) {
            meVar.setVisibility(0);
        }
        this.g2 = true;
        x0();
        A();
        p0();
        ig igVar = this.K1;
        if (igVar != null) {
            igVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.J1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }

    public void P1(boolean z4) {
        Q1(false, z4);
    }

    public final void Q() {
        if (this.t1 != null) {
            return;
        }
        se seVar = new se(this, getContext(), 1);
        this.t1 = seVar;
        xl0 xl0Var = new xl0(getContext());
        this.Q1 = xl0Var;
        seVar.setImageDrawable(xl0Var);
        this.Q1.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.j6.Wk), PorterDuff.Mode.MULTIPLY));
        this.Q1.a(R.drawable.input_bot2, false);
        this.t1.setScaleType(ImageView.ScaleType.CENTER);
        this.t1.setBackground(org.telegram.ui.ActionBar.j6.f0(i0(org.telegram.ui.ActionBar.j6.i6), 1, -1));
        this.t1.setVisibility(8);
        AndroidUtilities.updateViewVisibilityAnimated(this.t1, false, 0.1f, false);
        this.l1.addView(this.t1, 0, k7.b6.n(44, 44));
        this.t1.setOnClickListener(new kd(this, 15));
    }

    public final void Q0(TL_iv.RichMessage richMessage) {
        org.telegram.ui.zn znVar = this.L2;
        if (znVar != null) {
            MediaDataController.getInstance(this.N).saveDraft(znVar.a(), znVar.B7(znVar.k5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void Q1(boolean z4, boolean z10) {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        float f10;
        float f11;
        zo0 zo0Var;
        zo0 zo0Var2;
        ae aeVar;
        if (this.V2 == null) {
            return;
        }
        W();
        if (this.h5) {
            peer = this.V2.r();
            chat = null;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.N).getChat(Long.valueOf(-this.M2));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.N).getChatFull(-this.M2);
            TLRPC.Peer peer2 = chatFull != null ? chatFull.default_send_as : null;
            chat = chat2;
            peer = peer2;
        }
        if (peer == null && this.V2.H() != null && !this.V2.H().peers.isEmpty()) {
            peer = this.V2.H().peers.get(0).peer;
        }
        org.telegram.ui.zn znVar = this.L2;
        boolean z11 = (z4 || peer == null || (this.V2.H() != null && this.V2.H().peers.size() <= 1) || r0() || w0() || (((aeVar = this.b1) != null && aeVar.getVisibility() == 0) || ((!this.h5 && ((ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.canSendAsPeers(chat)) || ChatObject.isMonoForum(chat))) || (znVar != null && znVar.O3 == 9)))) ? false : true;
        if (z11) {
            b0();
        }
        if (peer != null) {
            if (peer.channel_id != 0) {
                TLRPC.Chat chat3 = MessagesController.getInstance(this.N).getChat(Long.valueOf(peer.channel_id));
                if (chat3 != null && (zo0Var2 = this.m0) != null) {
                    zo0Var2.setAvatar(chat3);
                    this.m0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, chat3.title));
                }
            } else {
                TLRPC.User user = MessagesController.getInstance(this.N).getUser(Long.valueOf(peer.user_id));
                if (user != null && (zo0Var = this.m0) != null) {
                    zo0Var.setAvatar(user);
                    this.m0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, ContactsController.formatName(user.first_name, user.last_name)));
                }
            }
        }
        zo0 zo0Var3 = this.m0;
        boolean z12 = zo0Var3 != null && zo0Var3.getVisibility() == 0;
        int dp = AndroidUtilities.dp(2.0f);
        float f12 = z11 ? 0.0f : 1.0f;
        float f13 = z11 ? 1.0f : 0.0f;
        zo0 zo0Var4 = this.m0;
        if (zo0Var4 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zo0Var4.getLayoutParams();
            f11 = z11 ? ((-this.m0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp : 0.0f;
            f10 = z11 ? 0.0f : ((-this.m0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        if (z12 == z11) {
            return;
        }
        zo0 zo0Var5 = this.m0;
        ValueAnimator valueAnimator = zo0Var5 == null ? null : (ValueAnimator) zo0Var5.getTag();
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.m0.setTag(null);
        }
        if ((this.h5 || (znVar != null && znVar.F8() == 0 && znVar.L5)) && z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            zo0 zo0Var6 = this.m0;
            if (zo0Var6 != null) {
                zo0Var6.setTranslationX(f11);
            }
            this.D = f11;
            J1();
            float f14 = f10;
            float f15 = f13;
            float f16 = f11;
            duration.addUpdateListener(new n5(this, f16, f14, f12, f15, 1));
            duration.addListener(new qf(this, z11, f12, f16, f15, f14));
            duration.start();
            zo0 zo0Var7 = this.m0;
            if (zo0Var7 != null) {
                zo0Var7.setTag(duration);
                return;
            }
            return;
        }
        float f17 = f10;
        float f18 = f13;
        boolean z13 = z11;
        if (z13) {
            b0();
        }
        zo0 zo0Var8 = this.m0;
        if (zo0Var8 != null) {
            zo0Var8.setVisibility(z13 ? 0 : 8);
            this.m0.setTranslationX(f17);
        }
        float f19 = z13 ? f17 : 0.0f;
        this.N0.setTranslationX(f19);
        this.D = f19;
        J1();
        zo0 zo0Var9 = this.m0;
        if (zo0Var9 != null) {
            zo0Var9.setAlpha(f18);
            this.m0.setTag(null);
        }
    }

    public final void R() {
        if (this.i0 != null) {
            return;
        }
        rh.z zVar = new rh.z(getContext());
        this.i0 = zVar;
        zVar.setOnClickListener(new kd(this, 7));
        this.u1.addView(this.i0, k7.b6.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
        AndroidUtilities.updateViewVisibilityAnimated(this.i0, false, 1.0f, false);
        rh.z zVar2 = this.i0;
        if (!zVar2.f) {
            zVar2.f = true;
            zVar2.h = 1.0f;
            zVar2.requestLayout();
            zVar2.invalidate();
        }
    }

    public final void R0(SpannableStringBuilder spannableStringBuilder, boolean z4, int i10, int i11) {
        if (this.B0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.B0.getPaint().getFontMetricsInt(), false, (int[]) null);
        u5[] u5VarArr = (u5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), u5.class);
        if (u5VarArr != null) {
            for (u5 u5Var : u5VarArr) {
                u5Var.applyFontMetrics(this.B0.getPaint().getFontMetricsInt(), l5.g());
            }
        }
        aj0.a(spannableStringBuilder2);
        O();
        setFieldText(spannableStringBuilder2);
        T0(i10, z4, i11, true, 0L);
    }

    public final void R1() {
        int b10;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= getMessagesCount();
        }
        if (this.q4 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.q4 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            if (starsPrice > 0 || this.h5) {
                this.G0.i(1, starsPrice, true);
            }
            H1(this.L4);
        }
        if (this.h5) {
            S();
            if (t()) {
                int[] iArr = MessagesController.getInstance(this.N).starsGroupcallMessageLimits;
                b10 = (iArr == null || iArr.length <= 2) ? 400 : iArr[2];
            } else {
                b10 = nh.t.b(this.N, (int) starsPrice, 1);
            }
            if (this.W != b10) {
                this.W = b10;
                if (b10 > 0) {
                    int i10 = b10 - this.a0;
                    if (i10 <= (this.h5 ? 5 : 100)) {
                        if (i10 < -9999) {
                            i10 = -9999;
                        }
                        S();
                        NumberTextView numberTextView = this.V;
                        numberTextView.a(i10, numberTextView.getVisibility() == 0);
                        if (this.V.getVisibility() != 0) {
                            this.V.setVisibility(0);
                            this.V.setAlpha(0.0f);
                            this.V.setScaleX(0.5f);
                            this.V.setScaleY(0.5f);
                        }
                        this.V.animate().setListener(null).cancel();
                        this.V.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        this.V.setTextColor(i0(i10 < 0 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.y6));
                        return;
                    }
                }
                NumberTextView numberTextView2 = this.V;
                if (numberTextView2 != null) {
                    numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new pe(this, 0));
                }
            }
        }
    }

    public final void S() {
        if (this.V != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.V = numberTextView;
        numberTextView.setVisibility(8);
        this.V.setTextSize(15);
        this.V.setTextColor(i0(org.telegram.ui.ActionBar.j6.y6));
        this.V.setTypeface(AndroidUtilities.bold());
        this.V.setCenterAlign(true);
        addView(this.V, Math.min(2, getChildCount()), k7.b6.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public boolean S0() {
        boolean z4 = this.z1;
        org.telegram.ui.ActionBar.f6 f6Var = this.S3;
        if (z4 && !UserConfig.getInstance(this.N).isPremium()) {
            vh.y1.p0(getContext(), new id(this, 20), new id(this, 21), f6Var);
            return true;
        }
        if (!c()) {
            return T0(0, true, 0, true, 0L);
        }
        z4.M(this.K2, this.L2.a(), new ue(this), f6Var);
        return true;
    }

    public final void S1() {
        int i10;
        boolean isUploadingMessageIdDialog;
        int currentTime = ConnectionsManager.getInstance(this.N).getCurrentTime();
        AndroidUtilities.cancelRunOnUIThread(this.E0);
        this.E0 = null;
        TLRPC.ChatFull chatFull = this.Z1;
        if (chatFull == null || chatFull.slowmode_seconds == 0 || chatFull.slowmode_next_send_date > currentTime || !((isUploadingMessageIdDialog = SendMessagesHelper.getInstance(this.N).isUploadingMessageIdDialog(this.M2)) || SendMessagesHelper.getInstance(this.N).isSendingMessageIdDialog(this.M2))) {
            int i11 = this.D0;
            if (i11 >= 2147483646) {
                if (this.Z1 != null) {
                    this.O.getMessagesController().loadFullChat(this.Z1.id, 0, true);
                }
                i10 = 0;
            } else {
                i10 = i11 - currentTime;
            }
        } else {
            if (!ChatObject.hasAdminRights(this.O.getMessagesController().getChat(Long.valueOf(this.Z1.id))) && !ChatObject.isIgnoredChatRestrictionsForBoosters(this.Z1)) {
                i10 = this.Z1.slowmode_seconds;
                this.D0 = isUploadingMessageIdDialog ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2147483646;
            }
            i10 = 0;
        }
        if (this.D0 == 0 || i10 <= 0) {
            this.D0 = 0;
        } else {
            String formatDurationNoHours = AndroidUtilities.formatDurationNoHours(Math.max(1, i10), false);
            mg mgVar = this.C0;
            mgVar.a.l(formatDurationNoHours, false);
            mgVar.invalidate();
            eg egVar = this.V2;
            if (egVar != null) {
                egVar.y1(mgVar, mgVar.a.getText(), false);
            }
            id idVar = new id(this, 9);
            this.E0 = idVar;
            AndroidUtilities.runOnUIThread(idVar, 100L);
        }
        if (c()) {
            return;
        }
        J(true);
    }

    public final void T(boolean z4) {
        if (this.B1 != null) {
            return;
        }
        oe oeVar = new oe(this, getContext(), R.drawable.input_done, this.S3, 1);
        this.B1 = oeVar;
        oeVar.setContentDescription(LocaleController.getString(R.string.EditMessage));
        if (z4) {
            k7.d6.a(this.B1);
        }
        this.v1.addView(this.B1, k7.b6.e(44, 44, 85));
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
    public boolean T0(final int i10, final boolean z4, final int i11, boolean z10, long j10) {
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
        org.telegram.ui.zn znVar;
        ?? r32;
        boolean z11;
        TLRPC.WebPage webPage;
        boolean z12;
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
        boolean z13 = z10 && !this.e5.f;
        if (z13) {
            boolean b02 = z4.b0(this.N, this.M2, getMessagesCount(), new Utilities.Callback() { // from class: org.telegram.ui.Components.wd
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    int i18 = ChatActivityEnterView.j5;
                    ChatActivityEnterView chatActivityEnterView5 = ChatActivityEnterView.this;
                    chatActivityEnterView5.getClass();
                    chatActivityEnterView5.T0(i10, z4, i11, false, ((Long) obj).longValue());
                }
            }, j10);
            if (b02 && this.o4) {
                if (this.Z0) {
                    if (!this.V2.n1()) {
                        SlideTextView slideTextView = this.g1;
                        if (slideTextView != null) {
                            slideTextView.setEnabled(false);
                        }
                        this.V2.s1();
                        return b02;
                    }
                } else if (!MediaController.getInstance().isRecordingPaused()) {
                    if (this.o4) {
                        this.F3 = true;
                    }
                    MediaController.getInstance().toggleRecordingPause(this.L);
                    this.V2.f1(0);
                    SlideTextView slideTextView2 = this.g1;
                    if (slideTextView2 != null) {
                        slideTextView2.setEnabled(false);
                    }
                }
            }
            return b02;
        }
        if (this.D0 != Integer.MAX_VALUE || c()) {
            org.telegram.ui.zn znVar2 = this.L2;
            if (znVar2 != null) {
                TLRPC.Chat chat3 = znVar2.e;
                if (znVar2.i() != null || ((ChatObject.isChannel(chat3) && chat3.megagroup) || !ChatObject.isChannel(chat3))) {
                    MessagesController.getNotificationsSettings(this.N).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + this.M2, !z4).commit();
                }
            }
            if (this.v3) {
                n1(false, true, false, true);
                if (this.N1 != 0 && (ufVar = this.R0) != null) {
                    ufVar.t(false);
                    this.R0.B();
                }
            }
            if (z13) {
                chatActivityEnterView = this;
                if (chatActivityEnterView.r1(new org.telegram.messenger.fe(this, z4, i10, i11, j10))) {
                    chatActivityEnterView2 = chatActivityEnterView;
                }
            } else {
                chatActivityEnterView = this;
            }
            chatActivityEnterView.A4 = true;
            VideoEditedInfo videoEditedInfo = chatActivityEnterView.a3;
            oe oeVar = chatActivityEnterView.G0;
            if (videoEditedInfo != null) {
                chatActivityEnterView.V2.p2(4, i10, chatActivityEnterView.L ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.O4, j10, z4);
                chatActivityEnterView.O4 = 0L;
                oeVar.setEffect(0L);
                chatActivityEnterView.o0(true);
                chatActivityEnterView.J(true);
                AndroidUtilities.runOnUIThread(new id(chatActivityEnterView, 2), 100L);
                chatActivityEnterView.f1 = 0L;
            } else if (chatActivityEnterView.X2 != null) {
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.Z2) {
                    MediaController.getInstance().cleanupPlayer(true, true);
                }
                MediaController.getInstance().cleanRecording(false);
                MediaDataController.getInstance(chatActivityEnterView.N).pushDraftVoiceMessage(chatActivityEnterView.M2, (znVar2 == null || !znVar2.e4) ? 0L : znVar2.d(), null);
                qk0 qk0Var = chatActivityEnterView.e1;
                if (qk0Var != null && (qk0Var.s > 0.0f || qk0Var.v < 1.0f)) {
                    qk0Var.setPlaying(false);
                    String r10 = android.support.v4.media.a.r(new StringBuilder(), chatActivityEnterView.Y2, ".ogg");
                    if (MediaController.cropOpusFile(chatActivityEnterView.Y2, r10, chatActivityEnterView.e1.getAudioLeftMs(), chatActivityEnterView.e1.getAudioRightMs())) {
                        try {
                            new File(chatActivityEnterView.Y2).delete();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        try {
                            new File(r10).renameTo(new File(chatActivityEnterView.Y2));
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        int i18 = 0;
                        while (true) {
                            if (i18 >= chatActivityEnterView.X2.attributes.size()) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = chatActivityEnterView.X2.attributes.get(i18);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                documentAttribute.waveform = MediaController.getWaveform(chatActivityEnterView.Y2);
                                documentAttribute.duration = chatActivityEnterView.e1.getNewDuration();
                                break;
                            }
                            i18++;
                        }
                    }
                }
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(chatActivityEnterView.X2, null, chatActivityEnterView.Y2, chatActivityEnterView.M2, chatActivityEnterView.P2, chatActivityEnterView.getThreadMessage(), null, null, null, null, z4, i10, 0, chatActivityEnterView.L ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, null, null, false);
                of2.sendMessageChatArguments = znVar2 != null ? znVar2.C8() : null;
                of2.effect_id = this.O4;
                of2.payStars = j10;
                of2.monoForumPeer = getSendMonoForumPeerId();
                of2.suggestionParams = getSendMessageSuggestionParams();
                this.O4 = 0L;
                oeVar.setEffect(0L);
                if (!this.V2.B1()) {
                    MessageObject.SendAnimationData sendAnimationData2 = new MessageObject.SendAnimationData();
                    sendAnimationData2.fromPreview = System.currentTimeMillis() - this.J0 < 200;
                    of2.sendAnimationData = sendAnimationData2;
                }
                s(of2);
                SendMessagesHelper.getInstance(this.N).sendMessage(of2);
                eg egVar2 = this.V2;
                if (egVar2 != null) {
                    chatActivityEnterView4 = this;
                    egVar2.G(null, z4, i10, i11, j10);
                } else {
                    chatActivityEnterView4 = this;
                }
                chatActivityEnterView4.o0(true);
                chatActivityEnterView4.J(true);
                AndroidUtilities.runOnUIThread(new id(chatActivityEnterView4, 3), 100L);
                chatActivityEnterView4.f1 = 0L;
            } else {
                ChatActivityEnterView chatActivityEnterView5 = chatActivityEnterView;
                long j11 = 200;
                String str2 = "";
                if (!chatActivityEnterView5.z1 || (richMessage = chatActivityEnterView5.A1) == null) {
                    org.telegram.ui.zn znVar3 = znVar2;
                    oe oeVar2 = oeVar;
                    chatActivityEnterView2 = chatActivityEnterView5;
                    int i19 = 1;
                    ff ffVar = chatActivityEnterView2.B0;
                    CharSequence textToUse = ffVar == null ? "" : ffVar.getTextToUse();
                    if (znVar3 != null && (chat2 = znVar3.e) != null && chat2.slowmode_enabled && !ChatObject.hasAdminRights(chat2)) {
                        int length = textToUse.length();
                        int maxMessageLength = chatActivityEnterView2.O.getMessagesController().getMaxMessageLength();
                        org.telegram.ui.ActionBar.f6 f6Var = chatActivityEnterView2.S3;
                        if (length > maxMessageLength) {
                            z4.u0(znVar3, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSendErrorTooLong", R.string.SlowmodeSendErrorTooLong), f6Var);
                        } else if (chatActivityEnterView2.D2 && textToUse.length() > 0) {
                            z4.u0(znVar3, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSendError", R.string.SlowmodeSendError), f6Var);
                        }
                    }
                    if (!H(chatActivityEnterView2.N, chatActivityEnterView2.M2, znVar3, textToUse)) {
                        org.telegram.ui.pn pnVar = chatActivityEnterView2.R2;
                        if (pnVar == null || znVar3 == null || !pnVar.f) {
                            int[] iArr = new int[1];
                            Emoji.parseEmojis(textToUse, iArr);
                            char c3 = 0;
                            boolean z14 = iArr[0] > 0;
                            CharSequence trimmedString = !z14 ? AndroidUtilities.getTrimmedString(textToUse) : textToUse;
                            boolean y12 = chatActivityEnterView2.y1();
                            int maxMessageLength2 = chatActivityEnterView2.O.getMessagesController().getMaxMessageLength();
                            if (trimmedString.length() != 0) {
                                if (chatActivityEnterView2.V2 != null && znVar3 != null) {
                                    if ((i10 != 0) == znVar3.c()) {
                                        chatActivityEnterView2.V2.L0();
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
                                    if (!z14) {
                                        subSequence = AndroidUtilities.getTrimmedString(subSequence);
                                    }
                                    CharSequence[] charSequenceArr = new CharSequence[i19];
                                    charSequenceArr[c3] = subSequence;
                                    ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(chatActivityEnterView2.N).getEntities(charSequenceArr, y12);
                                    if (chatActivityEnterView2.V2.B1()) {
                                        charSequence = trimmedString;
                                        if (chatActivityEnterView2.I0 != null) {
                                            sendAnimationData = new MessageObject.SendAnimationData();
                                            charSequence2 = textToUse;
                                            i16 = min;
                                            sendAnimationData.fromPreview = System.currentTimeMillis() - chatActivityEnterView2.J0 < j11;
                                        } else {
                                            charSequence2 = textToUse;
                                            i16 = min;
                                            charSequence3 = charSequence;
                                            sendAnimationData = null;
                                            boolean checkUpdateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(charSequence3);
                                            threadMessage = chatActivityEnterView2.getThreadMessage();
                                            if (threadMessage == null && (messageObject = chatActivityEnterView2.Q2) != null) {
                                                threadMessage = messageObject;
                                            }
                                            str = str2;
                                            oe oeVar3 = oeVar2;
                                            i17 = i16;
                                            charSequence4 = charSequence2;
                                            boolean z15 = y12;
                                            charSequence5 = charSequence3;
                                            znVar = znVar3;
                                            SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(charSequenceArr[c3].toString(), chatActivityEnterView2.M2, chatActivityEnterView2.P2, threadMessage, chatActivityEnterView2.T2, chatActivityEnterView2.U2, entities, null, null, z4, i10, i11, sendAnimationData, checkUpdateStickersOrder);
                                            of3.sendMessageChatArguments = znVar == null ? znVar.C8() : null;
                                            of3.effect_id = this.O4;
                                            of3.payStars = j10;
                                            of3.monoForumPeer = getSendMonoForumPeerId();
                                            of3.suggestionParams = getSendMessageSuggestionParams();
                                            this.O4 = 0L;
                                            oeVar3.setEffect(0L);
                                            s(of3);
                                            of3.invert_media = znVar == null && (messagePreviewParams3 = znVar.c5) != null && messagePreviewParams3.webpageTop;
                                            if (znVar != null || (chat = znVar.e) == null || ChatObject.canSendEmbed(chat)) {
                                                r32 = 0;
                                                r32 = 0;
                                                r32 = 0;
                                                z11 = false;
                                                webPage = this.T2;
                                                if (webPage instanceof TLRPC.TL_webPagePending) {
                                                    z12 = true;
                                                    if (webPage != null) {
                                                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                                                        of3.mediaWebPage = tL_messageMediaWebPage;
                                                        tL_messageMediaWebPage.webpage = this.T2;
                                                        tL_messageMediaWebPage.force_large_media = (znVar == null || (messagePreviewParams2 = znVar.c5) == null || messagePreviewParams2.webpageSmall) ? false : true;
                                                        tL_messageMediaWebPage.force_small_media = (znVar == null || (messagePreviewParams = znVar.c5) == null || !messagePreviewParams.webpageSmall) ? false : true;
                                                    }
                                                } else {
                                                    z12 = true;
                                                    of3.searchLinks = true;
                                                    of3.mediaWebPage = null;
                                                }
                                            } else {
                                                z11 = false;
                                                of3.searchLinks = false;
                                                r32 = 0;
                                                of3.mediaWebPage = null;
                                                z12 = true;
                                            }
                                            if (znVar != null) {
                                                znVar.m5 = r32;
                                                znVar.D5 = r32;
                                                MessagePreviewParams messagePreviewParams4 = znVar.c5;
                                                if (messagePreviewParams4 != null) {
                                                    messagePreviewParams4.updateLink(this.N, null, "", null, null, null);
                                                }
                                                this.T2 = r32;
                                                this.U2 = z12;
                                                znVar.j8();
                                            }
                                            SendMessagesHelper.getInstance(this.N).sendMessage(of3);
                                            i20 = i17 + 1;
                                            if (i17 != charSequence5.length()) {
                                                break;
                                            }
                                            chatActivityEnterView2 = this;
                                            oeVar2 = oeVar3;
                                            znVar3 = znVar;
                                            textToUse = charSequence4;
                                            y12 = z15;
                                            trimmedString = charSequence5;
                                            str2 = str;
                                            i19 = 1;
                                            j11 = 200;
                                            c3 = 0;
                                        }
                                    } else {
                                        MessageObject.SendAnimationData sendAnimationData3 = new MessageObject.SendAnimationData();
                                        charSequence = trimmedString;
                                        sendAnimationData3.fromPreview = System.currentTimeMillis() - chatActivityEnterView2.J0 < j11;
                                        float dp = AndroidUtilities.dp(22.0f);
                                        sendAnimationData3.height = dp;
                                        sendAnimationData3.width = dp;
                                        ff ffVar2 = chatActivityEnterView2.B0;
                                        if (ffVar2 != null) {
                                            ffVar2.getLocationInWindow(chatActivityEnterView2.J2);
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
                                    oe oeVar32 = oeVar2;
                                    i17 = i16;
                                    charSequence4 = charSequence2;
                                    boolean z152 = y12;
                                    charSequence5 = charSequence3;
                                    znVar = znVar3;
                                    SendMessagesHelper.SendMessageParams of32 = SendMessagesHelper.SendMessageParams.of(charSequenceArr[c3].toString(), chatActivityEnterView2.M2, chatActivityEnterView2.P2, threadMessage, chatActivityEnterView2.T2, chatActivityEnterView2.U2, entities, null, null, z4, i10, i11, sendAnimationData, checkUpdateStickersOrder2);
                                    of32.sendMessageChatArguments = znVar == null ? znVar.C8() : null;
                                    of32.effect_id = this.O4;
                                    of32.payStars = j10;
                                    of32.monoForumPeer = getSendMonoForumPeerId();
                                    of32.suggestionParams = getSendMessageSuggestionParams();
                                    this.O4 = 0L;
                                    oeVar32.setEffect(0L);
                                    s(of32);
                                    of32.invert_media = znVar == null && (messagePreviewParams3 = znVar.c5) != null && messagePreviewParams3.webpageTop;
                                    if (znVar != null) {
                                    }
                                    r32 = 0;
                                    r32 = 0;
                                    r32 = 0;
                                    z11 = false;
                                    webPage = this.T2;
                                    if (webPage instanceof TLRPC.TL_webPagePending) {
                                    }
                                    if (znVar != null) {
                                    }
                                    SendMessagesHelper.getInstance(this.N).sendMessage(of32);
                                    i20 = i17 + 1;
                                    if (i17 != charSequence5.length()) {
                                    }
                                }
                                if (this.V2.B1() || (!(i10 == 0 || c()) || c())) {
                                    chatActivityEnterView3 = this;
                                    ff ffVar3 = chatActivityEnterView3.B0;
                                    if (ffVar3 != null) {
                                        ffVar3.setText(str);
                                    }
                                    eg egVar3 = chatActivityEnterView3.V2;
                                    if (egVar3 != null) {
                                        egVar3.G(charSequence4, z4, i10, i11, j10);
                                    }
                                } else {
                                    this.d0 = z11;
                                    org.telegram.messenger.uf ufVar2 = new org.telegram.messenger.uf(this, charSequence4, z4, i10, i11, j10);
                                    chatActivityEnterView3 = this;
                                    chatActivityEnterView3.c0 = ufVar2;
                                    AndroidUtilities.runOnUIThread(ufVar2, 200L);
                                }
                                chatActivityEnterView3.y2 = 0L;
                                chatActivityEnterView3.R1();
                                return z11;
                            }
                        } else {
                            znVar3.Rb();
                        }
                        chatActivityEnterView3 = chatActivityEnterView2;
                        z11 = false;
                        if (chatActivityEnterView3.D2 && (egVar = chatActivityEnterView3.V2) != null) {
                            egVar.G(null, z4, i10, i11, j10);
                        }
                        chatActivityEnterView3.R1();
                        return z11;
                    }
                } else {
                    SendMessagesHelper.prepareSendingArticle(chatActivityEnterView5.O, richMessage.blocks, richMessage.photos, richMessage.documents, null, false, chatActivityEnterView5.M2, chatActivityEnterView5.P2, chatActivityEnterView5.getThreadMessage(), z4, i10, i11, znVar2 != null ? znVar2.C8() : null, chatActivityEnterView5.O4, chatActivityEnterView5.getSendMonoForumPeerId(), j10);
                    chatActivityEnterView2 = this;
                    chatActivityEnterView2.O4 = 0L;
                    oeVar.setEffect(0L);
                    chatActivityEnterView2.B0.setText("");
                    chatActivityEnterView2.O();
                    eg egVar4 = chatActivityEnterView2.V2;
                    if (egVar4 != null) {
                        egVar4.G(null, z4, i10, i11, j10);
                    }
                    chatActivityEnterView2.J(true);
                }
            }
        } else {
            eg egVar5 = this.V2;
            if (egVar5 != null) {
                egVar5.Y0();
            } else {
                chatActivityEnterView2 = this;
            }
        }
        return false;
    }

    public final void U() {
        uf ufVar = this.R0;
        if (ufVar != null && ufVar.Z0 != UserConfig.selectedAccount) {
            this.j1.removeView(ufVar);
            this.R0 = null;
        }
        if (this.R0 != null) {
            return;
        }
        uf ufVar2 = new uf(this, this.L2, this.E2, getContext(), this.Z1, this.i1, this.u4, this.S3, this.Q0, this.Z4 != null);
        this.R0 = ufVar2;
        ufVar2.s0 = true;
        if (!this.u4) {
            ufVar2.U();
        }
        this.R0.J(true, this.F2, this.G2, true);
        this.R0.setVisibility(8);
        this.R0.setShowing(false);
        if (this.Z4 != null) {
            uf ufVar3 = this.R0;
            ufVar3.t0 = false;
            ufVar3.setShouldDrawBackground(false);
            this.R0.S0 = true;
        }
        this.R0.setDelegate(new xf(this));
        this.R0.setDragListener(new b7.l0(this));
        uf ufVar4 = this.R0;
        if (ufVar4 != null) {
            ufVar4.M(-this.M2, !this.w0, !this.b);
        }
        u();
        E();
    }

    public final void U0(boolean z4, boolean z10) {
        V0(z4, z10, false);
    }

    public final void V() {
        if (this.P0 != null) {
            return;
        }
        se seVar = new se(this, getContext(), 2);
        this.P0 = seVar;
        seVar.setScaleType(ImageView.ScaleType.CENTER);
        se seVar2 = this.P0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(i0(org.telegram.ui.ActionBar.j6.Wk), false);
        this.B3 = animatedArrowDrawable;
        seVar2.setImageDrawable(animatedArrowDrawable);
        this.P0.setVisibility(8);
        this.P0.setScaleX(0.1f);
        this.P0.setScaleY(0.1f);
        this.P0.setAlpha(0.0f);
        this.P0.setBackground(org.telegram.ui.ActionBar.j6.f0(i0(org.telegram.ui.ActionBar.j6.i6), 1, -1));
        this.w1.addView(this.P0, k7.b6.e(44, 44, 85));
        this.P0.setOnClickListener(new kd(this, 5));
        this.P0.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
    }

    public final void V0(boolean z4, boolean z10, boolean z11) {
        if ((this.F2 != z4 || this.G2 != z10) && this.R0 != null) {
            if (this.T0 && !z11) {
                this.C3 = true;
                m0(false);
            } else if (z11) {
                I0();
            }
        }
        this.E2 = true;
        this.F2 = z4;
        this.G2 = z10;
        uf ufVar = this.R0;
        if (ufVar != null) {
            ufVar.J(true, z4, z10, true);
        }
        d1(false, !this.f2);
    }

    public final void W() {
        if (this.B0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.S3;
        ff ffVar = new ff(this, context, f6Var);
        this.B0 = ffVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            ffVar.setFallbackLineSpacing(false);
        }
        if (i10 >= 35) {
            this.B0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.B0.setDelegate(new qd(this));
        org.telegram.ui.zn znVar = this.L2;
        if (znVar == null || znVar.getParentLayout() == null || !((ActionBarLayout) znVar.getParentLayout()).b) {
            this.B0.setWindowView(this.K2.getWindow().getDecorView());
        } else {
            this.B0.setWindowView(znVar.getParentLayout().getWindow().getDecorView());
        }
        TLRPC.EncryptedChat encryptedChat = znVar != null ? znVar.h : null;
        this.B0.setAllowTextEntitiesIntersection(y1());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        int i11 = ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) ? 285212672 : TLObject.FLAG_28;
        this.B0.setIncludeFontPadding(false);
        this.B0.setImeOptions(i11);
        ff ffVar2 = this.B0;
        int inputType = ffVar2.getInputType() | 147456;
        this.a = inputType;
        ffVar2.setInputType(inputType);
        G1(false);
        this.B0.setSingleLine(false);
        this.B0.setMaxLines(6);
        this.B0.setTextSize(1, 18.0f);
        this.B0.setGravity(80);
        this.B0.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(10.0f));
        this.B0.setBackgroundDrawable(null);
        this.B0.setTextColor(i0(org.telegram.ui.ActionBar.j6.Ud));
        this.B0.setLinkTextColor(i0(org.telegram.ui.ActionBar.j6.hc));
        this.B0.setHighlightColor(i0(org.telegram.ui.ActionBar.j6.uf));
        ff ffVar3 = this.B0;
        int i12 = org.telegram.ui.ActionBar.j6.Vd;
        ffVar3.setHintColor(i0(i12));
        this.B0.setHintTextColor(i0(i12));
        this.B0.setCursorColor(i0(org.telegram.ui.ActionBar.j6.Wd));
        this.B0.setHandlesColor(i0(org.telegram.ui.ActionBar.j6.vf));
        ff ffVar4 = this.B0;
        boolean z4 = this.T3;
        FrameLayout.LayoutParams d = k7.b6.d(-1, -2.0f, 80, 52.0f, 0.0f, z4 ? 50.0f : 2.0f, 1.5f);
        ce ceVar = this.u1;
        ceVar.addView(ffVar4, 1, d);
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(getContext(), this.N, f6Var);
        this.y1 = previewView;
        previewView.setAllowActions(false);
        this.y1.setMaxHeight(AndroidUtilities.dp(150.0f));
        this.y1.setMinHeight(AndroidUtilities.dp(88.0f));
        this.y1.setVisibility(8);
        this.y1.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
        this.y1.setOnClickListener(new kd(this, 10));
        ceVar.addView(this.y1, 2, k7.b6.d(-1, -2.0f, 80, 44.0f, 0.0f, (z4 ? 50 : 2) - 8, 1.5f));
        this.B0.setOnKeyListener(new gf(this));
        this.B0.setOnEditorActionListener(new m.u2(this, 3));
        this.B0.addTextChangedListener(new hf(this));
        this.B0.addTextChangedListener(new org.telegram.ui.Cells.g3());
        this.B0.setEnabled(this.E4);
        ArrayList arrayList = this.D4;
        if (arrayList != null) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                this.B0.addTextChangedListener((TextWatcher) obj);
            }
            this.D4.clear();
        }
        G1(false);
        P1(znVar != null && znVar.getFragmentBeginToShow());
        if (znVar != null) {
            znVar.A6(false, false);
        }
        H1(this.L4);
    }

    public final void W0() {
        ph.f3 f3Var = this.I;
        if (f3Var == null) {
            return;
        }
        f3Var.s(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBirthdayHint, UserObject.getFirstName(this.L2.i()))), this.I.getTextPaint().getFontMetricsInt(), new id(this, 26)));
        ph.f3 f3Var2 = this.I;
        f3Var2.h = ph.f3.a(f3Var2.getText(), this.I.getTextPaint());
    }

    public final void X() {
        if (this.b1 != null) {
            return;
        }
        ae aeVar = new ae(this, getContext(), 2);
        this.b1 = aeVar;
        aeVar.setVisibility(this.X2 == null ? 8 : 0);
        this.b1.setFocusable(true);
        this.b1.setFocusableInTouchMode(true);
        this.b1.setClickable(true);
        this.u1.addView(this.b1, k7.b6.e(-1, 44, 80));
        jj0 jj0Var = new jj0(getContext());
        this.d1 = jj0Var;
        jj0Var.setScaleType(ImageView.ScaleType.CENTER);
        this.d1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.d1.getAnimatedDrawable().m0 = true;
        M1();
        this.d1.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        this.d1.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(i0(org.telegram.ui.ActionBar.j6.i6), 1, -1));
        this.b1.addView(this.d1, k7.b6.c(44.0f, 44));
        this.d1.setOnClickListener(new kd(this, 6));
        x71 x71Var = new x71(getContext());
        this.c1 = x71Var;
        x71Var.setVisibility(4);
        x71 x71Var2 = this.c1;
        x71Var2.P = !this.u4;
        x71Var2.setRoundFrames(true);
        this.c1.setDelegate(new ue(this));
        this.b1.addView(this.c1, k7.b6.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        v71 v71Var = new v71(context);
        TextPaint textPaint = new TextPaint(1);
        v71Var.d = textPaint;
        v71Var.e = -1L;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        v71Var.b = context.getDrawable(R.drawable.tooltip_arrow);
        v71Var.a = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.qf, false));
        v71Var.b();
        v71Var.setTime(0);
        this.c1.setTimeHintView(v71Var);
        this.i1.addView(v71Var, k7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        qk0 qk0Var = new qk0(getContext(), this.S3);
        this.e1 = qk0Var;
        this.b1.addView(qk0Var, k7.b6.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        H1(this.L4);
    }

    public final void X0(a0.h hVar, boolean z4) {
        this.T4 = hVar;
        if (hVar.m() == 1 && ((TL_bots.BotInfo) hVar.n(0)).user_id == this.M2) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.f0 = tL_botMenuButton.text;
                this.g0 = tL_botMenuButton.url;
                this.i5 = 3;
            } else if (botInfo.commands.isEmpty()) {
                this.i5 = 1;
            } else {
                this.i5 = 2;
            }
        } else {
            this.i5 = 1;
        }
        rh.y yVar = this.k0;
        if (yVar != null) {
            yVar.E(hVar);
        }
        B1(z4);
        F(z4);
    }

    public final void Y() {
        ig igVar = this.K1;
        qv0 qv0Var = this.i1;
        if (igVar == null) {
            ig igVar2 = new ig(this, getContext());
            this.K1 = igVar2;
            igVar2.setVisibility(8);
            qv0Var.addView(this.K1, k7.b6.e(-1, -2, 80));
        }
        if (this.J1 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.J1 = recordCircle;
        recordCircle.setVisibility(8);
        qv0Var.addView(this.J1, k7.b6.e(-1, -2, 80));
    }

    public final void Y0(int i10, boolean z4, boolean z10) {
        this.k2 = i10;
        if (this.l2 == z4) {
            return;
        }
        this.l2 = z4;
        B1(z10);
    }

    public final void Z() {
        if (this.a1 != null || getContext() == null) {
            return;
        }
        dh.d dVar = new dh.d(getContext(), 14);
        this.a1 = dVar;
        dVar.setClipChildren(false);
        this.a1.setVisibility(8);
        this.u1.addView(this.a1, k7.b6.c(44.0f, -1));
        this.a1.setOnTouchListener(new oh.d(12));
        dh.d dVar2 = this.a1;
        SlideTextView slideTextView = new SlideTextView(getContext());
        this.g1 = slideTextView;
        dVar2.addView(slideTextView, k7.b6.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        this.d.setPadding(AndroidUtilities.dp(13.0f), 0, 0, 0);
        this.d.setFocusable(false);
        LinearLayout linearLayout2 = this.d;
        kg kgVar = new kg(this, getContext());
        this.h1 = kgVar;
        linearLayout2.addView(kgVar, k7.b6.t(28, 28, 16, 0, 0, 0, 0));
        LinearLayout linearLayout3 = this.d;
        ng ngVar = new ng(this, getContext());
        this.V0 = ngVar;
        linearLayout3.addView(ngVar, k7.b6.t(-1, -1, 16, 6, 0, 0, 0));
        this.a1.addView(this.d, k7.b6.e(-1, -1, 16));
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
    public final void Z0(MessageObject messageObject, boolean z4, boolean z10) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        ff ffVar;
        MessageObject messageObject2 = this.P2;
        if (messageObject2 != null && messageObject2 == this.i2 && messageObject2 != messageObject) {
            this.S2 = messageObject;
            return;
        }
        MessageObject messageObject3 = this.i2;
        if (messageObject3 == null || messageObject3 != messageObject) {
            if (messageObject3 == null && messageObject == null) {
                return;
            }
            if (this.D1 == null) {
                rf rfVar = new rf(this, this.K2, this.S3);
                this.D1 = rfVar;
                rfVar.setVisibility(8);
                this.U0 = false;
                this.D1.setDelegate(new qd(this));
                this.j1.addView(this.D1);
            }
            this.i2 = messageObject;
            if (messageObject != null) {
                TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyKeyboardMarkup) {
                    tL_replyKeyboardMarkup = (TLRPC.TL_replyKeyboardMarkup) replyMarkup;
                    this.j2 = tL_replyKeyboardMarkup;
                    rf rfVar2 = this.D1;
                    Point point = AndroidUtilities.displaySize;
                    rfVar2.setPanelHeight(point.x <= point.y ? this.u2 : this.t2);
                    if (this.j2 == null) {
                        SharedPreferences mainSettings = MessagesController.getMainSettings(this.N);
                        if (this.i2 != this.P2 && messageObject != null) {
                            if (this.j2.single_use) {
                            }
                            if (!this.j2.is_persistent) {
                            }
                        }
                        boolean z11 = true;
                        boolean z12 = z4 ? z11 : false;
                        this.D1.setButtons(this.j2);
                        if (z12 && (((ffVar = this.B0) == null || ffVar.length() == 0) && !t0())) {
                            t1(1, 1, true, true);
                        }
                    } else if (t0() && this.b2 == 1) {
                        if (z10) {
                            this.l3 = true;
                            I0();
                        } else {
                            t1(0, 1, true, true);
                        }
                    }
                    B1(true);
                }
            }
            tL_replyKeyboardMarkup = null;
            this.j2 = tL_replyKeyboardMarkup;
            rf rfVar22 = this.D1;
            Point point2 = AndroidUtilities.displaySize;
            rfVar22.setPanelHeight(point2.x <= point2.y ? this.u2 : this.t2);
            if (this.j2 == null) {
            }
            B1(true);
        }
    }

    @Override // org.telegram.ui.Components.oy0
    public final void a(dh.c cVar) {
        ff ffVar = this.B0;
        if (ffVar != null) {
            ffVar.addTextChangedListener(cVar);
            return;
        }
        if (this.D4 == null) {
            this.D4 = new ArrayList();
        }
        this.D4.add(cVar);
    }

    public final void a0() {
        if (this.F1 != null || this.L2 == null) {
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
        int i02 = i0(org.telegram.ui.ActionBar.j6.Wk);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i02, mode));
        mutate2.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.j6.jf), mode));
        mq mqVar = new mq(mutate, mutate2);
        qe qeVar = new qe(this, getContext());
        this.F1 = qeVar;
        qeVar.setImageDrawable(mqVar);
        this.F1.setVisibility(8);
        this.F1.setContentDescription(LocaleController.getString(R.string.ScheduledMessages));
        this.F1.setScaleType(ImageView.ScaleType.CENTER);
        this.F1.setBackground(org.telegram.ui.ActionBar.j6.f0(i0(org.telegram.ui.ActionBar.j6.i6), 1, -1));
        this.u1.addView(this.F1, 2, k7.b6.e(44, 44, 85));
        this.F1.setOnClickListener(new kd(this, 2));
        this.F1.setTranslationX(0.0f);
    }

    public final void a1(MessageObject messageObject, String str, boolean z4, boolean z10) {
        ff ffVar;
        SendMessagesHelper.SendMessageParams of2;
        String sb;
        if (str == null || getVisibility() != 0 || (ffVar = this.B0) == null) {
            return;
        }
        r16 = null;
        TLRPC.User user = null;
        if (!z4) {
            if (this.D0 > 0 && !c()) {
                eg egVar = this.V2;
                if (egVar != null) {
                    mg mgVar = this.C0;
                    egVar.y1(mgVar, mgVar.a.getText(), true);
                    return;
                }
                return;
            }
            TLRPC.User user2 = (messageObject == null || !DialogObject.isChatDialog(this.M2)) ? null : this.O.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
            if ((this.k2 != 1 || z10) && user2 != null && user2.bot && !str.contains("@")) {
                Locale locale = Locale.US;
                of2 = SendMessagesHelper.SendMessageParams.of(android.support.v4.media.a.z(str, "@", UserObject.getPublicUsername(user2)), this.M2, this.P2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            } else {
                of2 = SendMessagesHelper.SendMessageParams.of(str, this.M2, this.P2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            }
            org.telegram.ui.zn znVar = this.L2;
            of2.sendMessageChatArguments = znVar != null ? znVar.C8() : null;
            of2.effect_id = this.O4;
            this.O4 = 0L;
            this.G0.setEffect(0L);
            s(of2);
            SendMessagesHelper.getInstance(this.N).sendMessage(of2);
            return;
        }
        String obj = ffVar.getText().toString();
        if (messageObject != null && DialogObject.isChatDialog(this.M2)) {
            user = this.O.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
        }
        TLRPC.User user3 = user;
        if ((this.k2 != 1 || z10) && user3 != null && user3.bot && !str.contains("@")) {
            StringBuilder sb2 = new StringBuilder();
            Locale locale2 = Locale.US;
            sb2.append(str + "@" + UserObject.getPublicUsername(user3));
            sb2.append(" ");
            sb2.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            sb = sb2.toString();
        } else {
            StringBuilder f10 = vh.w2.f(str, " ");
            f10.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            sb = f10.toString();
        }
        this.N2 = true;
        this.B0.setText(sb);
        ff ffVar2 = this.B0;
        ffVar2.setSelection(ffVar2.getText().length());
        this.N2 = false;
        eg egVar2 = this.V2;
        if (egVar2 != null) {
            egVar2.q1(this.B0.getText(), true, false);
        }
        if (this.v2 || this.b2 != -1) {
            return;
        }
        H0();
    }

    @Override // org.telegram.ui.Components.ux0
    public final boolean b() {
        org.telegram.ui.zn znVar = this.L2;
        return znVar != null && znVar.D6();
    }

    public final void b0() {
        if (this.m0 != null || getContext() == null) {
            return;
        }
        zo0 zo0Var = new zo0(getContext());
        ImageReceiver imageReceiver = new ImageReceiver(zo0Var);
        zo0Var.a = imageReceiver;
        zo0Var.b = new z8((org.telegram.ui.ActionBar.f6) null);
        Paint paint = new Paint(1);
        zo0Var.d = paint;
        Paint paint2 = new Paint(1);
        zo0Var.e = paint2;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.cf, false));
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.bf, false));
        int dp = AndroidUtilities.dp(18.0f);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.2f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, l1, l1);
        zo0Var.c = i02;
        i02.setCallback(zo0Var);
        zo0Var.setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, ""));
        this.m0 = zo0Var;
        zo0Var.setOnClickListener(new kd(this, 16));
        this.m0.setVisibility(8);
        this.u1.addView(this.m0, k7.b6.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
    }

    public final void b1(int i10, long j10) {
        this.M2 = j10;
        if (this.N != i10) {
            this.H3.unlock();
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.N);
            int i11 = NotificationCenter.recordStarted;
            notificationCenter.removeObserver(this, i11);
            NotificationCenter notificationCenter2 = NotificationCenter.getInstance(this.N);
            int i12 = NotificationCenter.recordPaused;
            notificationCenter2.removeObserver(this, i12);
            NotificationCenter notificationCenter3 = NotificationCenter.getInstance(this.N);
            int i13 = NotificationCenter.recordResumed;
            notificationCenter3.removeObserver(this, i13);
            NotificationCenter notificationCenter4 = NotificationCenter.getInstance(this.N);
            int i14 = NotificationCenter.recordStartError;
            notificationCenter4.removeObserver(this, i14);
            NotificationCenter notificationCenter5 = NotificationCenter.getInstance(this.N);
            int i15 = NotificationCenter.recordStopped;
            notificationCenter5.removeObserver(this, i15);
            NotificationCenter notificationCenter6 = NotificationCenter.getInstance(this.N);
            int i16 = NotificationCenter.recordProgressChanged;
            notificationCenter6.removeObserver(this, i16);
            NotificationCenter notificationCenter7 = NotificationCenter.getInstance(this.N);
            int i17 = NotificationCenter.closeChats;
            notificationCenter7.removeObserver(this, i17);
            NotificationCenter notificationCenter8 = NotificationCenter.getInstance(this.N);
            int i18 = NotificationCenter.audioDidSent;
            notificationCenter8.removeObserver(this, i18);
            NotificationCenter notificationCenter9 = NotificationCenter.getInstance(this.N);
            int i19 = NotificationCenter.audioRouteChanged;
            notificationCenter9.removeObserver(this, i19);
            NotificationCenter notificationCenter10 = NotificationCenter.getInstance(this.N);
            int i20 = NotificationCenter.messagePlayingProgressDidChanged;
            notificationCenter10.removeObserver(this, i20);
            NotificationCenter notificationCenter11 = NotificationCenter.getInstance(this.N);
            int i21 = NotificationCenter.featuredStickersDidLoad;
            notificationCenter11.removeObserver(this, i21);
            NotificationCenter notificationCenter12 = NotificationCenter.getInstance(this.N);
            int i22 = NotificationCenter.messageReceivedByServer2;
            notificationCenter12.removeObserver(this, i22);
            NotificationCenter notificationCenter13 = NotificationCenter.getInstance(this.N);
            int i23 = NotificationCenter.sendingMessagesChanged;
            notificationCenter13.removeObserver(this, i23);
            this.N = i10;
            this.O = AccountInstance.getInstance(i10);
            NotificationCenter.getInstance(this.N).addObserver(this, i11);
            NotificationCenter.getInstance(this.N).addObserver(this, i12);
            NotificationCenter.getInstance(this.N).addObserver(this, i13);
            NotificationCenter.getInstance(this.N).addObserver(this, i14);
            NotificationCenter.getInstance(this.N).addObserver(this, i15);
            NotificationCenter.getInstance(this.N).addObserver(this, i16);
            NotificationCenter.getInstance(this.N).addObserver(this, i17);
            NotificationCenter.getInstance(this.N).addObserver(this, i18);
            NotificationCenter.getInstance(this.N).addObserver(this, i19);
            NotificationCenter.getInstance(this.N).addObserver(this, i20);
            NotificationCenter.getInstance(this.N).addObserver(this, i21);
            NotificationCenter.getInstance(this.N).addObserver(this, i22);
            NotificationCenter.getInstance(this.N).addObserver(this, i23);
        }
        this.w0 = true;
        if (DialogObject.isChatDialog(this.M2)) {
            this.w0 = ChatObject.canSendPlain(this.O.getMessagesController().getChat(Long.valueOf(-this.M2)));
        }
        O1(false);
        I1(false);
        I();
        E();
        G1(false);
        if (this.B0 != null) {
            org.telegram.ui.zn znVar = this.L2;
            P1(znVar != null && znVar.getFragmentBeginToShow());
        }
    }

    @Override // org.telegram.ui.Components.ux0
    public final boolean c() {
        org.telegram.ui.zn znVar = this.L2;
        return znVar != null && znVar.c();
    }

    public final boolean c0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject, MessageObject messageObject2, org.telegram.ui.xi xiVar) {
        org.telegram.ui.zn znVar;
        int i10;
        int i11 = 0;
        if (keyboardButtonProto != null && messageObject2 != null && ((znVar = this.L2) == null || znVar.O3 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) lf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) lf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) lf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) lf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) lf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                AndroidUtilities.addToClipboard(tL_inlineButtonTypeCopy.copy_text);
                qc.a0(znVar).i(LocaleController.formatString(R.string.ExactTextCopied, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_keyboardButton.text, this.M2, messageObject, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = znVar != null ? znVar.C8() : null;
                    of2.effect_id = this.O4;
                    this.O4 = 0L;
                    this.G0.setEffect(0L);
                    SendMessagesHelper.getInstance(this.N).sendMessage(of2);
                    return true;
                }
            }
            Activity activity = this.K2;
            if (tL_inlineButtonTypeUrl != null) {
                if (ze.d.y(tL_inlineButtonTypeUrl.url)) {
                    ze.d.q(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, xiVar);
                    return true;
                }
                z4.r0(this.L2, tL_inlineButtonTypeUrl.url, false, true, true, false, xiVar, null, this.S3);
                return true;
            }
            if (lf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                znVar.rb(messageObject2, 2);
                return true;
            }
            if (!lf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                if (lf.c.b(keyboardButtonProto)) {
                    TLRPC.Message message = messageObject2.messageOwner;
                    long j10 = message.via_bot_id;
                    if (j10 == 0) {
                        j10 = message.from_id.user_id;
                    }
                    sf sfVar = new sf(this, messageObject2, j10, keyboardButtonProto, messageObject, MessagesController.getInstance(this.N).getUser(Long.valueOf(j10)));
                    if (SharedPrefsHelper.isWebViewConfirmShown(this.N, j10) || MessagesController.getInstance(this.N).whitelistedBots.contains(Long.valueOf(j10))) {
                        sfVar.run();
                        return true;
                    }
                    z4.o(znVar, MessagesController.getInstance(this.N).getUser(Long.valueOf(this.M2)), new i5.v(this, sfVar, j10, 19), null);
                    return true;
                }
                int i12 = 15;
                if (lf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String string = LocaleController.getString("ShareYouLocationTitle", R.string.ShareYouLocationTitle);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    d2Var.O = string;
                    d2Var.Q = LocaleController.getString("ShareYouLocationInfo", R.string.ShareYouLocationInfo);
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new androidx.car.app.utils.a(this, messageObject2, keyboardButtonProto, i12));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    znVar.showDialog(d2Var);
                    return true;
                }
                if (lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || lf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                    SendMessagesHelper.getInstance(this.N).sendCallback(true, messageObject2, keyboardButtonProto, znVar);
                    return true;
                }
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!znVar.Ca(tL_inlineButtonTypeSwitchInline)) {
                        if (!tL_inlineButtonTypeSwitchInline.same_peer) {
                            Bundle e = org.telegram.messenger.y3.e(1, "onlySelect", "dialogsType", true);
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
                            qyVar.z2 = new androidx.car.app.utils.a(this, messageObject2, tL_inlineButtonTypeSwitchInline, 16);
                            znVar.presentFragment(qyVar);
                            return true;
                        }
                        TLRPC.Message message2 = messageObject2.messageOwner;
                        long j11 = message2.from_id.user_id;
                        long j12 = message2.via_bot_id;
                        if (j12 != 0) {
                            j11 = j12;
                        }
                        TLRPC.User user = this.O.getMessagesController().getUser(Long.valueOf(j11));
                        if (user != null) {
                            setFieldText("@" + UserObject.getPublicUsername(user) + " " + tL_inlineButtonTypeSwitchInline.query);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (MessagesController.getInstance(this.N).getUser(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
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
                                xd xdVar = new xd(this, messageObject2, tL_buttonTypeRequestPeer);
                                org.telegram.ui.jj0 jj0Var = org.telegram.ui.jj0.r0;
                                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                                if (R == null || org.telegram.ui.jj0.r0 != null) {
                                    return false;
                                }
                                org.telegram.ui.jj0 jj0Var2 = new org.telegram.ui.jj0(R, i10, bool, bool2, xdVar);
                                jj0Var2.show();
                                org.telegram.ui.jj0.r0 = jj0Var2;
                                return false;
                            }
                            Bundle e6 = org.telegram.messenger.y3.e(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = messageObject2.messageOwner;
                            if (message3 != null) {
                                TLRPC.Peer peer = message3.from_id;
                                if (peer instanceof TLRPC.TL_peerUser) {
                                    e6.putLong("requestPeerBotId", peer.user_id);
                                }
                            }
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                e6.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            org.telegram.ui.qy qyVar2 = new org.telegram.ui.qy(e6);
                            qyVar2.z2 = new xd(this, messageObject2, tL_buttonTypeRequestPeer);
                            znVar.presentFragment(qyVar2);
                            return false;
                        }
                        TLRPC.User i13 = getParentFragment() != null ? getParentFragment().i() : MessagesController.getInstance(this.N).getUser(Long.valueOf(this.M2));
                        if (i13 != null) {
                            zq.a(getContext(), this.N, i13, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new gg.c1(this, messageObject2, tL_buttonTypeRequestPeer, i13, 6), this.S3, null);
                            return false;
                        }
                    }
                }
                return true;
            }
            TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) lf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
            Boolean valueOf = (tL_buttonTypeRequestPoll.flags & 1) != 0 ? Boolean.valueOf(tL_buttonTypeRequestPoll.quiz) : null;
            znVar.X9();
            nh.t2 t2Var = znVar.G1;
            if (t2Var != null) {
                t2Var.P0 = false;
                t2Var.u1.setVisibility(8);
                t2Var.S1(false, valueOf);
                return false;
            }
        }
        return false;
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
    public final void c1(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z4) {
        float f10;
        float f11;
        int i10;
        ae aeVar;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i11;
        ff ffVar;
        ff ffVar2;
        ae aeVar2;
        boolean z10;
        qe qeVar;
        if (this.X2 == null && this.a3 == null && this.V1 != messageObject) {
            W();
            boolean z11 = this.V1 != null;
            this.V1 = messageObject;
            this.W1 = z4;
            ae aeVar3 = this.w1;
            dg.u3 u3Var = this.l1;
            ImageView imageView = this.M0;
            ge geVar = this.n1;
            le leVar = this.W0;
            if (messageObject != null) {
                this.N4 = groupedMessages != null ? groupedMessages.captionAbove : messageObject.messageOwner.invert_media;
                T(false);
                this.B1.setOnClickListener(new kd(this, 17));
                if (this.V1.needResendWhenEdit()) {
                    long j10 = this.q4;
                    if (j10 > 0) {
                        this.B1.i(1, j10, true);
                        this.B1.setLayoutParams(k7.b6.e(44, 44, 85));
                        this.B1.requestLayout();
                        aeVar = aeVar3;
                        this.B1.setOnLongClickListener(new j(this, messageObject, groupedMessages, 1));
                        this.B1.setVisibility(0);
                        this.B1.setScaleX(0.1f);
                        this.B1.setScaleY(0.1f);
                        this.B1.setAlpha(0.0f);
                        this.B1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(mr.f).start();
                        if (z4) {
                            this.W = this.O.getMessagesController().getMaxMessageLength();
                            charSequence = this.V1.messageText;
                        } else {
                            this.W = this.O.getMessagesController().maxCaptionLength;
                            charSequence = this.V1.caption;
                        }
                        if (charSequence == null) {
                            ff ffVar3 = this.B0;
                            TextPaint paint = ffVar3 != null ? ffVar3.getPaint() : null;
                            if (paint == null) {
                                paint = new TextPaint();
                                paint.setTextSize(AndroidUtilities.dp(18.0f));
                            }
                            charSequence2 = r(this.V1.messageOwner.entities, charSequence, paint.getFontMetricsInt());
                        } else {
                            charSequence2 = "";
                        }
                        if (this.R1 == null && !z11) {
                            ff ffVar4 = this.B0;
                            this.R1 = (ffVar4 != null || ffVar4.length() <= 0) ? null : this.B0.getText();
                            this.S1 = this.U2;
                        }
                        MessageObject messageObject2 = this.V1;
                        TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                        this.U2 = ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia.manual) && ((i11 = messageObject2.type) == 0 || i11 == 19);
                        if (this.v2) {
                            org.telegram.ui.np npVar = new org.telegram.ui.np(14, this, charSequence2);
                            this.T = npVar;
                            AndroidUtilities.runOnUIThread(npVar, 200L);
                        } else {
                            org.telegram.ui.np npVar2 = this.T;
                            if (npVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(npVar2);
                                this.T = null;
                            }
                            setFieldText(charSequence2);
                        }
                        ffVar = this.B0;
                        if (ffVar != null) {
                            ffVar.requestFocus();
                        }
                        H0();
                        ffVar2 = this.B0;
                        if (ffVar2 != null) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ffVar2.getLayoutParams();
                            layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                            this.B0.setLayoutParams(layoutParams);
                        }
                        aeVar2 = this.b1;
                        if (aeVar2 == null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) aeVar2.getLayoutParams();
                            z10 = false;
                            layoutParams2.rightMargin = 0;
                            this.b1.setLayoutParams(layoutParams2);
                        } else {
                            z10 = false;
                        }
                        getSendButtonInternal().setVisibility(8);
                        setSlowModeButtonVisible(z10);
                        imageView.setVisibility(8);
                        leVar.setVisibility(8);
                        u3Var.setVisibility(8);
                        if (geVar != null) {
                            this.r1 = 0.0f;
                            geVar.setAlpha(0.0f);
                            geVar.setScaleX(0.5f);
                            geVar.setScaleY(0.5f);
                        }
                        aeVar.setVisibility(8);
                        qeVar = this.F1;
                        if (qeVar != null) {
                            qeVar.setVisibility(8);
                        }
                    }
                }
                aeVar = aeVar3;
                this.B1.i(1, 0L, true);
                this.B1.setLayoutParams(k7.b6.e(44, 44, 85));
                this.B1.requestLayout();
                this.B1.setOnLongClickListener(new j(this, messageObject, groupedMessages, 1));
                this.B1.setVisibility(0);
                this.B1.setScaleX(0.1f);
                this.B1.setScaleY(0.1f);
                this.B1.setAlpha(0.0f);
                this.B1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(mr.f).start();
                if (z4) {
                }
                if (charSequence == null) {
                }
                if (this.R1 == null) {
                    ff ffVar42 = this.B0;
                    this.R1 = (ffVar42 != null || ffVar42.length() <= 0) ? null : this.B0.getText();
                    this.S1 = this.U2;
                }
                MessageObject messageObject22 = this.V1;
                TLRPC.MessageMedia messageMedia2 = messageObject22.messageOwner.media;
                this.U2 = ((messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia2.manual) && ((i11 = messageObject22.type) == 0 || i11 == 19);
                if (this.v2) {
                }
                ffVar = this.B0;
                if (ffVar != null) {
                }
                H0();
                ffVar2 = this.B0;
                if (ffVar2 != null) {
                }
                aeVar2 = this.b1;
                if (aeVar2 == null) {
                }
                getSendButtonInternal().setVisibility(8);
                setSlowModeButtonVisible(z10);
                imageView.setVisibility(8);
                leVar.setVisibility(8);
                u3Var.setVisibility(8);
                if (geVar != null) {
                }
                aeVar.setVisibility(8);
                qeVar = this.F1;
                if (qeVar != null) {
                }
            } else {
                org.telegram.ui.np npVar3 = this.T;
                if (npVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(npVar3);
                    this.T = null;
                }
                oe oeVar = this.B1;
                if (oeVar != null) {
                    oeVar.setVisibility(8);
                }
                this.W = -1;
                this.V2.v();
                aeVar3.setVisibility(0);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                imageView.setAlpha(0.0f);
                imageView.setVisibility(8);
                int i12 = this.D0;
                mg mgVar = this.C0;
                if (i12 <= 0 || c()) {
                    getSendButtonInternal().setScaleX(0.1f);
                    getSendButtonInternal().setScaleY(0.1f);
                    getSendButtonInternal().setAlpha(0.0f);
                    getSendButtonInternal().setVisibility(8);
                    mgVar.setScaleX(0.1f);
                    mgVar.setScaleY(0.1f);
                    mgVar.setAlpha(0.0f);
                    setSlowModeButtonVisible(false);
                    f10 = 1.0f;
                    u3Var.setScaleX(1.0f);
                    this.B = 1.0f;
                    A1();
                    u3Var.setVisibility(0);
                    if (geVar != null) {
                        this.r1 = 1.0f;
                        geVar.setAlpha(1.0f);
                        geVar.setScaleX(1.0f);
                        geVar.setScaleY(1.0f);
                    }
                    leVar.setScaleX(1.0f);
                    leVar.setScaleY(1.0f);
                    leVar.setAlpha(1.0f);
                    leVar.setVisibility(0);
                } else {
                    if (this.D0 == Integer.MAX_VALUE) {
                        getSendButtonInternal().setScaleX(1.0f);
                        getSendButtonInternal().setScaleY(1.0f);
                        getSendButtonInternal().setAlpha(1.0f);
                        getSendButtonInternal().setVisibility(0);
                        mgVar.setScaleX(0.1f);
                        mgVar.setScaleY(0.1f);
                        f11 = 0.0f;
                        mgVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        i10 = 8;
                    } else {
                        f11 = 0.0f;
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        i10 = 8;
                        getSendButtonInternal().setVisibility(8);
                        mgVar.setScaleX(1.0f);
                        mgVar.setScaleY(1.0f);
                        mgVar.setAlpha(1.0f);
                        setSlowModeButtonVisible(true);
                    }
                    u3Var.setScaleX(0.01f);
                    this.B = f11;
                    A1();
                    u3Var.setVisibility(i10);
                    if (geVar != null) {
                        this.r1 = f11;
                        geVar.setAlpha(f11);
                        geVar.setScaleX(0.5f);
                        geVar.setScaleY(0.5f);
                    }
                    leVar.setScaleX(0.1f);
                    leVar.setScaleY(0.1f);
                    leVar.setAlpha(f11);
                    leVar.setVisibility(i10);
                    f10 = 1.0f;
                }
                a0();
                qe qeVar2 = this.F1;
                if (qeVar2 != null && qeVar2.getTag() != null) {
                    this.F1.setScaleX(f10);
                    this.F1.setScaleY(f10);
                    this.F1.setAlpha(f10);
                    this.F1.setVisibility(0);
                }
                org.telegram.ui.zn znVar = this.L2;
                if (znVar != null) {
                    znVar.m5 = null;
                    znVar.D5 = null;
                    MessagePreviewParams messagePreviewParams = znVar.c5;
                    if (messagePreviewParams != null) {
                        messagePreviewParams.updateLink(this.N, null, "", null, null, null);
                    }
                    this.T2 = null;
                    this.U2 = true;
                    znVar.j8();
                }
                W();
                ff ffVar5 = this.B0;
                if (ffVar5 != null) {
                    ffVar5.setText(this.R1);
                    ff ffVar6 = this.B0;
                    ffVar6.setSelection(ffVar6.length());
                }
                this.R1 = null;
                this.U2 = this.S1;
                if (getVisibility() == 0) {
                    this.V2.A2();
                }
                H1(1);
            }
            G1(true);
            P1(true);
            E1();
            N1();
        }
    }

    @Override // org.telegram.ui.Components.ux0
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z4, boolean z10, int i10, int i11) {
        if (this.h5) {
            return;
        }
        org.telegram.ui.pn pnVar = this.R2;
        org.telegram.ui.zn znVar = this.L2;
        if (pnVar != null && znVar != null && pnVar.f) {
            znVar.Rb();
            return;
        }
        if (!c() || i10 != 0) {
            z4.a0(this.N, 1, this.M2, new vd(this, document, str, sendAnimationData, z10, i10, i11, obj, z4));
            return;
        }
        z4.M(this.K2, znVar.a(), new org.telegram.messenger.nj(this, document, str, obj, sendAnimationData, z4), this.S3);
    }

    public final void d0() {
        MessagePreviewParams messagePreviewParams;
        MessageSuggestionParams of2;
        TLRPC.Chat chat;
        int i10;
        MessageSuggestionParams of3;
        MessageObject messageObject = this.V1;
        if (messageObject == null) {
            return;
        }
        boolean needResendWhenEdit = messageObject.needResendWhenEdit();
        org.telegram.ui.zn znVar = this.L2;
        if (needResendWhenEdit && !ChatObject.canManageMonoForum(this.N, this.V1.getDialogId())) {
            if (znVar == null || (of3 = znVar.d5) == null) {
                of3 = MessageSuggestionParams.of(this.V1.messageOwner.suggested_post);
            }
            if (!lh.t7.U(this.N, of3.amount)) {
                if (znVar != null) {
                    znVar.Tb(of3);
                    return;
                }
                return;
            }
        }
        if (this.W - this.a0 < 0) {
            NumberTextView numberTextView = this.V;
            if (numberTextView != null) {
                AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                try {
                    this.V.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            if (MessagesController.getInstance(this.N).premiumFeaturesBlocked() || MessagesController.getInstance(this.N).captionLengthLimitPremium <= this.a0) {
                return;
            }
            q1();
            return;
        }
        if (this.N1 != 0) {
            m1(0, true);
            this.R0.t(false);
            if (this.v3) {
                n1(false, true, false, true);
                this.h3 = true;
                AndroidUtilities.runOnUIThread(new id(this, 27), 200L);
            }
        }
        ff ffVar = this.B0;
        CharSequence textToUse = ffVar == null ? "" : ffVar.getTextToUse();
        MessageObject messageObject2 = this.V1;
        if (messageObject2 == null || messageObject2.type != 19) {
            textToUse = AndroidUtilities.getTrimmedString(textToUse);
        }
        CharSequence[] charSequenceArr = {textToUse};
        if (TextUtils.isEmpty(charSequenceArr[0])) {
            TLRPC.MessageMedia messageMedia = this.V1.messageOwner.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                AndroidUtilities.shakeViewSpring(this.B0, -3.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
        }
        ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.N).getEntities(charSequenceArr, y1());
        if (!TextUtils.equals(charSequenceArr[0], this.V1.messageText) || ((entities != null && !entities.isEmpty()) || !this.V1.messageOwner.entities.isEmpty() || (this.V1.messageOwner.media instanceof TLRPC.TL_messageMediaWebPage))) {
            MessageObject messageObject3 = this.V1;
            messageObject3.editingMessage = charSequenceArr[0];
            messageObject3.editingMessageEntities = entities;
            messageObject3.editingMessageSearchWebPage = this.U2;
            if (znVar != null && (chat = znVar.e) != null && (((i10 = messageObject3.type) == 0 || i10 == 19) && !ChatObject.canSendEmbed(chat))) {
                MessageObject messageObject4 = this.V1;
                messageObject4.editingMessageSearchWebPage = false;
                TLRPC.Message message = messageObject4.messageOwner;
                message.flags &= -513;
                message.media = null;
            } else if (znVar == null || (messagePreviewParams = znVar.c5) == null) {
                MessageObject messageObject5 = this.V1;
                messageObject5.editingMessageSearchWebPage = false;
                int i11 = messageObject5.type;
                if (i11 == 0 || i11 == 19) {
                    TLRPC.Message message2 = messageObject5.messageOwner;
                    message2.flags |= 512;
                    message2.media = new TLRPC.TL_messageMediaEmpty();
                }
            } else {
                if (znVar.D5 instanceof TLRPC.TL_webPagePending) {
                    MessageObject messageObject6 = this.V1;
                    messageObject6.editingMessageSearchWebPage = false;
                    int i12 = messageObject6.type;
                    if (i12 == 0 || i12 == 19) {
                        messageObject6.messageOwner.media = new TLRPC.TL_messageMediaEmpty();
                        this.V1.messageOwner.flags |= 512;
                    }
                } else if (messagePreviewParams.webpage != null) {
                    MessageObject messageObject7 = this.V1;
                    messageObject7.editingMessageSearchWebPage = false;
                    TLRPC.Message message3 = messageObject7.messageOwner;
                    message3.flags |= 512;
                    message3.media = new TLRPC.TL_messageMediaWebPage();
                    this.V1.messageOwner.media.webpage = znVar.c5.webpage;
                } else {
                    MessageObject messageObject8 = this.V1;
                    messageObject8.editingMessageSearchWebPage = false;
                    int i13 = messageObject8.type;
                    if (i13 == 0 || i13 == 19) {
                        TLRPC.Message message4 = messageObject8.messageOwner;
                        message4.flags |= 512;
                        message4.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                TLRPC.Message message5 = this.V1.messageOwner;
                MessagePreviewParams messagePreviewParams2 = znVar.c5;
                message5.invert_media = messagePreviewParams2.webpageTop;
                if (messagePreviewParams2.hasMedia) {
                    TLRPC.MessageMedia messageMedia2 = message5.media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                        boolean z4 = messagePreviewParams2.webpageSmall;
                        messageMedia2.force_small_media = z4;
                        messageMedia2.force_large_media = true ^ z4;
                    }
                }
            }
            if (this.V1.needResendWhenEdit()) {
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(this.V1.editingMessage.toString(), this.V1.getDialogId());
                if (znVar == null || (of2 = znVar.d5) == null) {
                    of2 = MessageSuggestionParams.of(this.V1.messageOwner.suggested_post);
                }
                of4.suggestionParams = of2;
                of4.monoForumPeer = DialogObject.getPeerDialogId(this.V1.messageOwner.saved_peer_id);
                of4.hasMediaSpoilers = this.V1.hasMediaSpoilers();
                MessageObject messageObject9 = this.V1;
                of4.replyToMsg = messageObject9;
                of4.parentObject = messageObject9;
                if (messageObject9.getDocument() instanceof TLRPC.TL_document) {
                    of4.document = (TLRPC.TL_document) this.V1.getDocument();
                    of4.caption = of4.message;
                    of4.message = null;
                } else {
                    TLRPC.MessageMedia messageMedia3 = this.V1.messageOwner.media;
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
                SendMessagesHelper.getInstance(this.N).sendMessage(of4);
            } else {
                SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(this.N);
                MessageObject messageObject10 = this.V1;
                sendMessagesHelper.editMessage(messageObject10, null, null, null, null, null, null, false, messageObject10.hasMediaSpoilers(), null);
            }
        }
        c1(null, null, false);
    }

    public final void d1(boolean z4, boolean z10) {
        og ogVar;
        ff ffVar;
        ae aeVar;
        de deVar = this.N0;
        if (deVar == null) {
            return;
        }
        if (this.s2 == 1 || ((aeVar = this.b1) != null && aeVar.getVisibility() == 0)) {
            this.h = 0.0f;
            this.n = 0.0f;
            F1();
            z10 = false;
        }
        og ogVar2 = og.f;
        og ogVar3 = og.e;
        if (!z4 || this.b2 != 0) {
            uf ufVar = this.R0;
            int i10 = ufVar == null ? MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0) : ufVar.getCurrentPage();
            ogVar = (i10 == 0 || !((this.F2 || this.G2) && ((ffVar = this.B0) == null || TextUtils.isEmpty(ffVar.getText())))) ? ogVar3 : i10 == 1 ? og.c : ogVar2;
        } else if (!this.w0) {
            return;
        } else {
            ogVar = og.d;
        }
        if (!this.w0 && ogVar == ogVar3) {
            ogVar3 = ogVar2;
        } else if (this.b || ogVar == ogVar3) {
            ogVar3 = ogVar;
        }
        deVar.j(ogVar3, z10);
        if (ogVar3 == ogVar2 && this.R0 == null) {
            MediaDataController.getInstance(this.N).loadRecents(0, true, true, false);
            ArrayList<String> arrayList = MessagesController.getInstance(this.N).gifSearchEmojies;
            int min = Math.min(10, arrayList.size());
            for (int i11 = 0; i11 < min; i11++) {
                Emoji.preloadEmoji(arrayList.get(i11));
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        oe oeVar;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat;
        double d;
        ge geVar;
        if (i10 == NotificationCenter.emojiLoaded) {
            uf ufVar = this.R0;
            if (ufVar != null) {
                ufVar.M.e1();
            }
            rf rfVar = this.D1;
            if (rfVar != null) {
                ArrayList arrayList = rfVar.n;
                while (r4 < arrayList.size()) {
                    ((rh.j0) arrayList.get(r4)).invalidate();
                    r4++;
                }
            }
            ff ffVar = this.B0;
            if (ffVar != null) {
                ffVar.postInvalidate();
                this.B0.invalidateForce();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.recordProgressChanged) {
            if (((Integer) objArr[0]).intValue() != this.C2) {
                return;
            }
            if (this.s2 != 0 && !this.i3 && !c()) {
                this.i3 = true;
                this.O.getMessagesController().sendTyping(this.M2, getThreadMessageId(), this.Z0 ? 7 : 1, 0);
            }
            RecordCircle recordCircle = this.J1;
            if (recordCircle != null) {
                recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.closeChats) {
            ff ffVar2 = this.B0;
            if (ffVar2 == null || !ffVar2.isFocused()) {
                return;
            }
            AndroidUtilities.hideKeyboard(this.B0);
            return;
        }
        int i12 = 5;
        if (i10 == NotificationCenter.recordStartError || i10 == NotificationCenter.recordStopped) {
            if (((Integer) objArr[0]).intValue() == this.C2 && this.B2) {
                this.B2 = false;
                if (i10 != NotificationCenter.recordStopped) {
                    L1(2, true);
                    return;
                }
                Integer num = (Integer) objArr[1];
                if (num.intValue() == 4) {
                    i12 = 4;
                } else if (this.Z0 && num.intValue() == 5) {
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
            if (((Integer) objArr[0]).intValue() != this.C2) {
                return;
            }
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            this.Z0 = !booleanValue;
            me meVar = this.Y0;
            if (meVar != null) {
                meVar.j(booleanValue ? og.a : og.b, true);
            }
            if (this.B2) {
                RecordCircle recordCircle2 = this.J1;
                if (recordCircle2 != null) {
                    recordCircle2.F = true;
                }
            } else {
                this.B2 = true;
                L1(0, true);
            }
            ng ngVar = this.V0;
            if (ngVar != null) {
                ngVar.a(this.f1);
            }
            kg kgVar = this.h1;
            if (kgVar != null) {
                kgVar.h = false;
                return;
            }
            return;
        }
        byte[] bArr = null;
        if (i10 == NotificationCenter.recordPaused) {
            this.B2 = false;
            this.X2 = null;
            this.a3 = null;
            return;
        }
        if (i10 == NotificationCenter.recordResumed) {
            this.X2 = null;
            this.a3 = null;
            ng ngVar2 = this.V0;
            if (ngVar2 != null) {
                ngVar2.a(this.f1);
            }
            J(true);
            this.B2 = true;
            L1(0, true);
            return;
        }
        if (i10 != NotificationCenter.audioDidSent) {
            if (i10 == NotificationCenter.audioRouteChanged) {
                Activity activity = this.K2;
                if (activity != null) {
                    activity.setVolumeControlStream(((Boolean) objArr[0]).booleanValue() ? 0 : TLObject.FLAG_31);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
                if (this.Z2 == null || !MediaController.getInstance().isPlayingMessage(this.Z2)) {
                    return;
                }
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                MessageObject messageObject = this.Z2;
                messageObject.audioProgress = playingMessageObject.audioProgress;
                messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                return;
            }
            if (i10 == NotificationCenter.featuredStickersDidLoad) {
                de deVar = this.N0;
                if (deVar != null) {
                    deVar.invalidate();
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
                if (longValue != this.M2 || (chatFull = this.Z1) == null || chatFull.slowmode_seconds == 0 || MessageObject.isEphemeralMessageId(num2.intValue()) || (chat = this.O.getMessagesController().getChat(Long.valueOf(this.Z1.id))) == null || ChatObject.hasAdminRights(chat) || ChatObject.isIgnoredChatRestrictionsForBoosters(chat)) {
                    return;
                }
                TLRPC.ChatFull chatFull2 = this.Z1;
                int currentTime = ConnectionsManager.getInstance(this.N).getCurrentTime();
                TLRPC.ChatFull chatFull3 = this.Z1;
                chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                chatFull3.flags |= 262144;
                setSlowModeTimer(chatFull3.slowmode_next_send_date);
                return;
            }
            if (i10 == NotificationCenter.sendingMessagesChanged) {
                if (this.Z1 != null) {
                    S1();
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.audioRecordTooShort) {
                this.X2 = null;
                this.a3 = null;
                L1(4, true);
                return;
            }
            if (i10 != NotificationCenter.updateBotMenuButton) {
                if (i10 == NotificationCenter.didUpdatePremiumGiftFieldIcon) {
                    I1(true);
                    return;
                } else {
                    if (i10 == NotificationCenter.currentUserPremiumStatusChanged && this.z1 && (oeVar = this.G0) != null) {
                        oeVar.setLocked(!UserConfig.getInstance(this.N).isPremium());
                        return;
                    }
                    return;
                }
            }
            long longValue2 = ((Long) objArr[0]).longValue();
            TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
            if (longValue2 == this.M2) {
                if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                    TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                    this.f0 = tL_botMenuButton.text;
                    this.g0 = tL_botMenuButton.url;
                    this.i5 = 3;
                } else if (this.l2) {
                    this.i5 = 2;
                } else {
                    this.i5 = 1;
                }
                B1(false);
                return;
            }
            return;
        }
        if (((Integer) objArr[0]).intValue() != this.C2) {
            return;
        }
        this.f1 = 0L;
        Object obj = objArr[1];
        if (obj instanceof VideoEditedInfo) {
            VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
            this.a3 = videoEditedInfo;
            String str = (String) objArr[2];
            this.Y2 = str;
            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
            this.f1 = videoEditedInfo.estimatedDuration;
            x71 x71Var = this.c1;
            if (x71Var != null) {
                x71Var.setVideoPath(str);
                this.c1.setKeyframes(arrayList2);
                this.c1.setVisibility(0);
                this.c1.setMinProgressDiff(1000.0f / this.a3.estimatedDuration);
                x0();
            }
            L1(3, true);
            J(false);
            return;
        }
        this.X2 = (TLRPC.TL_document) obj;
        this.Y2 = (String) objArr[2];
        boolean z4 = objArr.length >= 4 && ((Boolean) objArr[3]).booleanValue();
        float floatValue = objArr.length >= 5 ? ((Float) objArr[4]).floatValue() : 0.0f;
        float floatValue2 = objArr.length >= 6 ? ((Float) objArr[5]).floatValue() : 1.0f;
        if (this.X2 == null) {
            eg egVar = this.V2;
            if (egVar != null) {
                egVar.G(null, true, 0, 0, 0L);
                return;
            }
            return;
        }
        X();
        if (this.b1 == null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = true;
        tL_message.id = 0;
        tL_message.peer_id = new TLRPC.TL_peerUser();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser;
        TLRPC.Peer peer = tL_message.peer_id;
        long clientUserId = UserConfig.getInstance(this.N).getClientUserId();
        tL_peerUser.user_id = clientUserId;
        peer.user_id = clientUserId;
        tL_message.date = (int) (System.currentTimeMillis() / 1000);
        tL_message.message = "";
        tL_message.attachPath = this.Y2;
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.flags |= 3;
        tL_messageMediaDocument.document = this.X2;
        tL_message.flags |= 768;
        this.Z2 = new MessageObject(UserConfig.selectedAccount, tL_message, false, true);
        this.b1.setAlpha(1.0f);
        this.b1.setVisibility(0);
        this.d1.setVisibility(0);
        this.d1.setAlpha(0.0f);
        this.d1.setScaleY(0.0f);
        this.d1.setScaleX(0.0f);
        int i13 = 0;
        while (true) {
            if (i13 >= this.X2.attributes.size()) {
                d = 0.0d;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = this.X2.attributes.get(i13);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                d = documentAttribute.duration;
                break;
            }
            i13++;
        }
        int i14 = 0;
        while (true) {
            if (i14 >= this.X2.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute2 = this.X2.attributes.get(i14);
            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                byte[] bArr2 = documentAttribute2.waveform;
                if (bArr2 == null || bArr2.length == 0) {
                    documentAttribute2.waveform = MediaController.getWaveform(this.Y2);
                }
                bArr = documentAttribute2.waveform;
            } else {
                i14++;
            }
        }
        if (z4 && (geVar = this.n1) != null) {
            this.r1 = 0.0f;
            geVar.setAlpha(0.0f);
            geVar.setScaleX(0.0f);
            geVar.setScaleY(0.0f);
        }
        this.f1 = (long) (1000.0d * d);
        qk0 qk0Var = this.e1;
        String str2 = this.Y2;
        if (!qk0Var.N) {
            qk0Var.r = (float) d;
            qk0Var.s = floatValue;
            qk0Var.v = floatValue2;
            qk0Var.w = false;
            qk0Var.h.q(AndroidUtilities.formatDuration((int) Math.round(Math.max(1.0d, d)), false), false, true);
            qk0Var.f.a(false, false);
            if (qk0Var.n == null) {
                i71 i71Var = new i71();
                qk0Var.n = i71Var;
                i71Var.G = new o3.c(qk0Var, 6);
            }
            qk0Var.n.D(Uri.fromFile(new File(str2)), "other");
            qk0Var.H = 0;
            qk0Var.I = bArr;
            qk0Var.invalidate();
        }
        J(false);
        if (z4) {
            Y();
            Z();
            X();
            this.s2 = 1;
            this.J1.c(false);
            this.r3.set(this.J1, Float.valueOf(1.0f));
            ig igVar = this.K1;
            if (igVar != null) {
                igVar.setVisibility(0);
                this.K1.setAlpha(1.0f);
            }
        }
        L1(3, !z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        uf ufVar = this.R0;
        if (ufVar == null || ufVar.getVisibility() != 0 || this.R0.getStickersExpandOffset() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipRect(0, AndroidUtilities.dp(2.0f), getMeasuredWidth(), getMeasuredHeight());
        canvas.translate(0.0f, -this.R0.getStickersExpandOffset());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        View view2 = this.C1;
        ae aeVar = this.v1;
        boolean z4 = view == view2 || view == aeVar;
        if (z4) {
            float measuredHeight = getMeasuredHeight() - this.b5.e;
            canvas.save();
            if (view == aeVar) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.C1) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z4) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        TextPaint textPaint;
        M1();
        RecordCircle recordCircle = this.J1;
        if (recordCircle != null) {
            recordCircle.e();
        }
        kg kgVar = this.h1;
        if (kgVar != null) {
            kgVar.a();
        }
        SlideTextView slideTextView = this.g1;
        if (slideTextView != null) {
            slideTextView.a();
        }
        ng ngVar = this.V0;
        if (ngVar != null && (textPaint = ngVar.x) != null) {
            textPaint.setColor(ngVar.C.i0(org.telegram.ui.ActionBar.j6.nf));
        }
        x71 x71Var = this.c1;
        if (x71Var != null) {
            x71Var.e.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
            x71Var.I = 0;
            v71 v71Var = x71Var.M;
            if (v71Var != null) {
                v71Var.b();
            }
        }
        NumberTextView numberTextView = this.V;
        if (numberTextView != null && this.B0 != null) {
            if (this.a0 - this.W < 0) {
                numberTextView.setTextColor(i0(org.telegram.ui.ActionBar.j6.p7));
            } else {
                numberTextView.setTextColor(i0(org.telegram.ui.ActionBar.j6.y6));
            }
        }
        Color.alpha(i0(org.telegram.ui.ActionBar.j6.bf));
        df dfVar = this.j0;
        if (dfVar != null) {
            dfVar.d.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ii, false));
            pg.b bVar = dfVar.r;
            if (bVar != null) {
                bVar.u();
            }
            dfVar.invalidate();
        }
        rf rfVar = this.D1;
        if (rfVar != null) {
            rfVar.d();
        }
        int i02 = this.X0 ? i0(org.telegram.ui.ActionBar.j6.Wk) : -1;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.Y0.setColorFilter(new PorterDuffColorFilter(i02, mode));
        int i10 = org.telegram.ui.ActionBar.j6.Wk;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0(i10), mode);
        de deVar = this.N0;
        deVar.setColorFilter(porterDuffColorFilter);
        int i11 = org.telegram.ui.ActionBar.j6.i6;
        deVar.setBackground(org.telegram.ui.ActionBar.j6.f0(i0(i11), 1, -1));
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i0(i10), mode);
        ImageView imageView = this.O0;
        imageView.setColorFilter(porterDuffColorFilter2);
        int i03 = i0(i11);
        float dp = AndroidUtilities.dp(19.0f);
        int dp2 = AndroidUtilities.dp(1.0f);
        int dp3 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.W(dp, i03, dp2, dp3, dp2, dp3));
        this.x1.setColorFilter(i0(org.telegram.ui.ActionBar.j6.hl), mode);
    }

    public final void e0(Canvas canvas, boolean z4) {
        if (this.u4) {
            int w10 = (int) e2.c.w(1.0f, this.y4, org.telegram.ui.ActionBar.j6.i3.getIntrinsicHeight(), this.P1);
            View view = this.C1;
            if (view != null && view.getVisibility() == 0) {
                w10 = (int) (((1.0f - getTopViewEnterProgress()) * this.C1.getLayoutParams().height) + w10);
            }
            int intrinsicHeight = org.telegram.ui.ActionBar.j6.i3.getIntrinsicHeight() + w10;
            if (z4) {
                org.telegram.ui.ActionBar.j6.i3.setAlpha((int) (this.y4 * 255.0f));
                org.telegram.ui.ActionBar.j6.i3.setBounds(0, w10, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.j6.i3.draw(canvas);
            }
            if (!this.t4) {
                float f10 = intrinsicHeight;
                float width = getWidth();
                float height = getHeight();
                org.telegram.ui.ActionBar.f6 f6Var = this.S3;
                Paint G = f6Var != null ? f6Var.G("paintChatComposeBackground") : null;
                if (G == null) {
                    G = org.telegram.ui.ActionBar.j6.S0("paintChatComposeBackground");
                }
                canvas.drawRect(0.0f, f10, width, height, G);
                return;
            }
            int i02 = i0(org.telegram.ui.ActionBar.j6.Sd);
            Paint paint = this.x4;
            paint.setColor(i02);
            if (!SharedConfig.chatBlurEnabled() || this.i1 == null) {
                canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint);
            } else {
                this.z4.set(0, intrinsicHeight, getWidth(), getHeight());
                this.i1.J(canvas, getTop(), this.z4, paint, false);
            }
        }
    }

    public final void e1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.K2.getSystemService("accessibility");
        if (this.B0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        try {
            this.B0.requestFocus();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final boolean f0(Canvas canvas, Utilities.Callback0Return callback0Return) {
        float f10;
        float f11;
        float f12;
        float f13;
        float e = this.X4.e(this.B0.canScrollVertically(-1));
        float e6 = this.Y4.e(this.B0.canScrollVertically(1));
        if (e <= 0.0f && e6 <= 0.0f) {
            return ((Boolean) callback0Return.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.B0.getX() + this.B0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.B0.getY() + this.B0.getMeasuredHeight() + AndroidUtilities.dp(2.0f), 255, 31);
        boolean booleanValue = ((Boolean) callback0Return.run()).booleanValue();
        canvas.save();
        LinearGradient linearGradient = this.V4;
        Paint paint = this.U4;
        Matrix matrix = this.W4;
        if (e > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            f10 = 255.0f;
            f11 = 16.0f;
            f12 = 0.0f;
            f13 = 5.0f;
            rectF.set(this.B0.getX() - AndroidUtilities.dp(5.0f), (this.B0.getY() + this.P1) - 1.0f, this.B0.getX() + this.B0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.B0.getY() + this.P1 + AndroidUtilities.dp(13.0f));
            matrix.reset();
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (e * 255.0f));
            canvas.drawRect(rectF, paint);
        } else {
            f10 = 255.0f;
            f11 = 16.0f;
            f12 = 0.0f;
            f13 = 5.0f;
        }
        if (e6 > f12) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(this.B0.getX() - AndroidUtilities.dp(f13), (this.B0.getY() + this.B0.getMeasuredHeight()) - AndroidUtilities.dp(15.0f), this.B0.getX() + this.B0.getMeasuredWidth() + AndroidUtilities.dp(f13), this.B0.getY() + this.B0.getMeasuredHeight() + AndroidUtilities.dp(2.0f) + 1.0f);
            matrix.reset();
            matrix.postScale(1.0f, rectF2.height() / f11);
            matrix.postRotate(180.0f);
            matrix.postTranslate(rectF2.left, rectF2.bottom);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (e6 * f10));
            canvas.drawRect(rectF2, paint);
        }
        canvas.restore();
        canvas.restore();
        return booleanValue;
    }

    public final void f1(CharSequence charSequence, boolean z4) {
        ff ffVar = this.B0;
        if (ffVar == null) {
            return;
        }
        this.N2 = true;
        ffVar.setText(charSequence);
        this.B0.invalidateQuotes(true);
        ff ffVar2 = this.B0;
        ffVar2.setSelection(ffVar2.getText().length());
        this.N2 = false;
        eg egVar = this.V2;
        if (egVar != null) {
            egVar.q1(this.B0.getText(), true, z4);
        }
    }

    public final pf g0(MessageObject messageObject, boolean z4) {
        pf pfVar = new pf(messageObject.currentAccount, messageObject.messageOwner, true, true);
        if (z4) {
            ff ffVar = this.B0;
            CharSequence[] charSequenceArr = {ffVar == null ? "" : ffVar.getTextToUse()};
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.N).getEntities(charSequenceArr, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            MessageObject.addEntitiesToText(spannableStringBuilder, entities, true, true, false, true);
            pfVar.caption = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, org.telegram.ui.ActionBar.j6.o2.getFontMetricsInt(), false, (int[]) null), entities, org.telegram.ui.ActionBar.j6.o2.getFontMetricsInt());
        }
        return pfVar;
    }

    public final void g1(boolean z4, boolean z10) {
        this.D2 = z4;
        J(z10);
    }

    public org.telegram.ui.ActionBar.r1 getAdjustPanLayoutHelper() {
        return this.R;
    }

    public int getAnimatedTop() {
        return this.P1;
    }

    public ImageView getAttachButton() {
        return this.n1;
    }

    public View getAudioVideoButtonContainer() {
        return this.W0;
    }

    public int getBackgroundTop() {
        int top = getTop();
        View view = this.C1;
        return (view == null || view.getVisibility() != 0) ? top : top + this.C1.getLayoutParams().height;
    }

    public rh.e3 getBotWebViewButton() {
        if (this.h0 == null) {
            Context context = getContext();
            rh.e3 e3Var = new rh.e3(context);
            e3Var.a = new Path();
            e3Var.c = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            e3Var.addView(textView, k7.b6.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(AndroidUtilities.dp(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            e3Var.addView(radialProgressView, k7.b6.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false), 2, -1));
            e3Var.addView(view, k7.b6.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            e3Var.setWillNotDraw(false);
            this.h0 = e3Var;
            e3Var.setVisibility(8);
            R();
            this.h0.setBotMenuButton(this.i0);
            this.u1.addView(this.h0, k7.b6.e(-1, -1, 80));
        }
        return this.h0;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public int getCursorPosition() {
        ff ffVar = this.B0;
        if (ffVar == null) {
            return 0;
        }
        return ffVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.V1 != null) {
            if (TextUtils.isEmpty(this.R1)) {
                return null;
            }
            return this.R1;
        }
        if (this.B0 == null || !k0()) {
            return null;
        }
        return this.B0.getText();
    }

    @Override // org.telegram.ui.Components.oy0
    public Editable getEditText() {
        ff ffVar = this.B0;
        if (ffVar == null) {
            return null;
        }
        return ffVar.getText();
    }

    public MessageObject getEditingMessageObject() {
        return this.V1;
    }

    public long getEffectId() {
        return this.O4;
    }

    public View getEmojiButton() {
        return this.N0;
    }

    public int getEmojiPadding() {
        return this.w2;
    }

    public kz getEmojiView() {
        return this.R0;
    }

    public float getExitTransition() {
        return this.i4;
    }

    @Override // org.telegram.ui.Components.oy0
    public CharSequence getFieldText() {
        if (this.B0 == null || !k0()) {
            return null;
        }
        return this.B0.getText();
    }

    public int getHeightWithTopView() {
        int measuredHeight = getMeasuredHeight();
        View view = this.C1;
        return (view == null || view.getVisibility() != 0) ? measuredHeight : (int) (measuredHeight - ((1.0f - getTopViewEnterProgress()) * this.C1.getLayoutParams().height));
    }

    public float getLockAnimatedTranslation() {
        return this.h4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r4.a3 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getMessagesCount() {
        MessagePreviewParams messagePreviewParams;
        org.telegram.ui.zn znVar = this.L2;
        int forwardedMessagesCount = (znVar == null || (messagePreviewParams = znVar.c5) == null) ? 0 : messagePreviewParams.getForwardedMessagesCount();
        ff ffVar = this.B0;
        if (ffVar == null || TextUtils.isEmpty(ffVar.getText())) {
            if (this.Z2 == null) {
            }
            forwardedMessagesCount++;
        } else {
            String trimmedString = SendMessagesHelper.getTrimmedString(this.B0.getText().toString());
            int maxMessageLength = this.O.getMessagesController().getMaxMessageLength();
            if (trimmedString.length() != 0) {
                forwardedMessagesCount += (int) Math.ceil(trimmedString.length() / maxMessageLength);
            }
            forwardedMessagesCount++;
        }
        return Math.max(1, forwardedMessagesCount);
    }

    public RecordCircle getRecordCircle() {
        return this.J1;
    }

    public MessageObject getReplyingMessageObject() {
        return this.P2;
    }

    public int getSelectionLength() {
        ff ffVar = this.B0;
        if (ffVar == null) {
            return 0;
        }
        try {
            return ffVar.getSelectionEnd() - this.B0.getSelectionStart();
        } catch (Exception e) {
            FileLog.e(e);
            return 0;
        }
    }

    public View getSendButton() {
        return getSendButtonInternal().getVisibility() == 0 ? getSendButtonInternal() : this.W0;
    }

    public View getSendButtonInternal() {
        return this.G0;
    }

    public MessageSuggestionParams getSendMessageSuggestionParams() {
        org.telegram.ui.zn znVar = this.L2;
        if (znVar != null) {
            return znVar.d5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.zn znVar = this.L2;
        if (znVar != null) {
            return znVar.N8();
        }
        return 0L;
    }

    public zo0 getSenderSelectView() {
        return this.m0;
    }

    public qv0 getSizeNotifierLayout() {
        return this.i1;
    }

    public float getSlideToCancelProgress() {
        return this.f4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.D0 > 0) {
            return this.C0.a.getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.zn znVar = this.L2;
        return znVar != null ? znVar.getMessagesController().getSendPaidMessagesStars(znVar.a()) : MessagesController.getInstance(this.N).getSendPaidMessagesStars(this.M2);
    }

    public Drawable getStickersArrowDrawable() {
        return this.B3;
    }

    public int getStickersExpandedHeight() {
        return this.z3;
    }

    public ImageView getSuggestButton() {
        return this.s1;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.c5.e;
    }

    public float getTopViewHeight() {
        View view = this.C1;
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return this.C1.getLayoutParams().height;
    }

    public float getTopViewTranslation() {
        View view = this.C1;
        if (view == null || view.getVisibility() == 8) {
            return 0.0f;
        }
        return this.C1.getTranslationY();
    }

    public q41 getTrendingStickersAlert() {
        return this.W2;
    }

    public int getVisibleEmojiPadding() {
        if (this.T0) {
            return this.w2;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f10 = this.P1;
        View view = this.C1;
        if (view != null && view.getVisibility() == 0) {
            f10 += (1.0f - getTopViewEnterProgress()) * this.C1.getLayoutParams().height;
        }
        return getMeasuredHeight() - f10;
    }

    public void h1(float f10, float f11, float f12, boolean z4) {
        int dp;
        float f13 = 1.0f - f12;
        float f14 = f10 * f13;
        float f15 = f11 * f13;
        this.r = (f12 * 0.5f) + 0.5f;
        this.s = f12;
        F1();
        float f16 = -f14;
        this.N0.setTranslationX(f16);
        if (this.B0 == null) {
            dp = 0;
        } else {
            int dp2 = AndroidUtilities.dp(40.0f);
            zo0 zo0Var = this.m0;
            dp = dp2 + ((zo0Var == null || zo0Var.getVisibility() != 0) ? 0 : AndroidUtilities.dp(18.0f));
        }
        this.E = f16 - (dp * f13);
        jj0 jj0Var = this.d1;
        if (jj0Var != null) {
            jj0Var.setTranslationX(f16);
        }
        RecordCircle recordCircle = this.J1;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f15);
        }
        ig igVar = this.K1;
        if (igVar != null) {
            igVar.setTranslationX(f15);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f16);
        }
        ae aeVar = this.w1;
        aeVar.setTranslationX(f15);
        aeVar.setAlpha(f12);
        ImageView imageView = this.s1;
        if (imageView != null) {
            imageView.setAlpha(imageView.getScaleX() > 0.7f ? f12 : 0.0f);
        }
        boolean z10 = true;
        if (z4 && f12 != 1.0f) {
            z10 = false;
        }
        this.G = z10;
        this.y = f15;
        this.C = f12;
        A1();
        J1();
        float f17 = f14 * f13;
        if (this.F != f17) {
            this.F = f17;
            qk0 qk0Var = this.e1;
            if (qk0Var != null) {
                qk0Var.setTranslationX(f17);
                this.e1.invalidate();
            }
        }
        if (this.B0 != null) {
            float lerp = AndroidUtilities.lerp(0.88f, 1.0f, f12);
            this.B0.setPivotX(0.0f);
            this.B0.setPivotY(r9.getMeasuredHeight() / 2.0f);
            this.B0.setScaleX(lerp);
            this.B0.setScaleY(lerp);
            this.B0.setHintRightOffset(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f12));
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final int i0(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var = this.S3;
        return f6Var != null ? f6Var.x0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public final void i1(boolean z4) {
        if (this.h5 == z4) {
            return;
        }
        this.h5 = z4;
        this.n1.setVisibility(z4 ? 8 : 0);
        if (z4) {
            AndroidUtilities.removeFromParent(this.E1);
        }
        if (z4) {
            this.Y0.setVisibility(8);
        } else {
            P0();
        }
        if (!z4) {
            this.W = -1;
            NumberTextView numberTextView = this.V;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        H1(this.L4);
        J(false);
    }

    public final boolean j0() {
        return this.i5 == 3;
    }

    public final void j1(CharSequence charSequence, boolean z4) {
        this.e = charSequence;
        this.f = null;
        G1(z4);
    }

    public final boolean k0() {
        ff ffVar = this.B0;
        return ffVar != null && ffVar.length() > 0;
    }

    public final void k1(boolean z4, boolean z10) {
        me meVar = this.Y0;
        if (meVar == null) {
            return;
        }
        this.Z0 = z4;
        if (z10) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z11 = false;
            if (DialogObject.isChatDialog(this.M2)) {
                TLRPC.Chat chat = this.O.getMessagesController().getChat(Long.valueOf(-this.M2));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    z11 = true;
                }
            }
            globalMainSettings.edit().putBoolean(z11 ? "currentModeVideoChannel" : "currentModeVideo", z4).apply();
        }
        meVar.j(this.Z0 ? og.b : og.a, z10);
        meVar.setContentDescription(LocaleController.getString(this.Z0 ? R.string.AccDescrVideoMessage : R.string.AccDescrVoiceMessage));
        this.W0.setContentDescription(LocaleController.getString(this.Z0 ? R.string.AccDescrVideoMessage : R.string.AccDescrVoiceMessage));
        meVar.sendAccessibilityEvent(8);
    }

    public final void l0() {
        ph.f3 f3Var = this.K;
        if (f3Var != null) {
            f3Var.e(true);
        }
        ph.f3 f3Var2 = this.I;
        if (f3Var2 != null) {
            f3Var2.e(true);
        }
    }

    public final void l1(MessageObject messageObject, org.telegram.ui.pn pnVar, MessageObject messageObject2) {
        MessageObject messageObject3;
        org.telegram.ui.zn znVar = this.L2;
        boolean z4 = (znVar == null || !znVar.v9() || this.Q2 == messageObject2) ? false : true;
        if (messageObject != null) {
            if (this.S2 == null && (messageObject3 = this.i2) != this.P2) {
                this.S2 = messageObject3;
            }
            this.P2 = messageObject;
            this.R2 = pnVar;
            this.Q2 = messageObject2;
            if (znVar == null || !znVar.e4 || znVar.U3 != messageObject) {
                Z0(messageObject, true, true);
            }
        } else if (this.P2 == this.i2) {
            this.P2 = null;
            this.Q2 = null;
            this.R2 = null;
            Z0(this.S2, true, false);
            this.S2 = null;
        } else {
            this.P2 = null;
            this.R2 = null;
            this.Q2 = null;
        }
        F(true);
        eg egVar = this.V2;
        MediaController.getInstance().setReplyingMessage(messageObject, getThreadMessage(), egVar != null ? egVar.i1() : null);
        G1(z4);
    }

    public final void m0(boolean z4) {
        n0(z4, false, true);
    }

    public final void m1(int i10, boolean z4) {
        boolean z10 = i10 != 0;
        if (z10 != (this.N1 != 0)) {
            ValueAnimator valueAnimator = this.s0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.s0.cancel();
            }
            if (z4) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.t0, z10 ? 1.0f : 0.0f);
                this.s0 = ofFloat;
                ofFloat.addUpdateListener(new gd(this, 4));
                this.s0.addListener(new te(this, z10, 3));
                this.s0.setDuration(220L);
                this.s0.setInterpolator(mr.f);
                this.s0.start();
            } else {
                this.t0 = z10 ? 1.0f : 0.0f;
                uf ufVar = this.R0;
                if (ufVar != null) {
                    ufVar.a0();
                }
            }
        }
        this.N1 = i10;
    }

    public final void n(TLRPC.Document document) {
        MediaDataController.getInstance(this.N).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
        uf ufVar = this.R0;
        if (ufVar == null || document == null) {
            return;
        }
        boolean isEmpty = ufVar.f1.isEmpty();
        ufVar.Y();
        if (isEmpty) {
            ufVar.Z(false);
        }
    }

    public final boolean n0(boolean z4, boolean z10, boolean z11) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (t0()) {
            if (this.b2 == 1 && (tL_replyKeyboardMarkup = this.j2) != null && z4 && this.i2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    MessagesController.getMainSettings(this.N).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.i2.getId()).apply();
                }
            }
            if ((z4 && this.N1 != 0) || z10) {
                m1(0, true);
                uf ufVar = this.R0;
                if (ufVar != null) {
                    ufVar.t(true);
                }
                ff ffVar = this.B0;
                if (ffVar != null) {
                    ffVar.requestFocus();
                }
                n1(false, true, false, true);
                if (this.u3) {
                    J(true);
                    return true;
                }
            } else {
                if (this.N1 == 0) {
                    if (this.v3) {
                        n1(false, true, false, true);
                        return true;
                    }
                    t1(0, 0, true, z11 && !z4);
                    return true;
                }
                m1(0, false);
                this.R0.t(false);
                ff ffVar2 = this.B0;
                if (ffVar2 != null) {
                    ffVar2.requestFocus();
                }
            }
            return true;
        }
        return false;
    }

    public final void n1(boolean z4, boolean z10, boolean z11, boolean z12) {
        final int i10 = 1;
        org.telegram.ui.ActionBar.r1 r1Var = this.R;
        if ((r1Var != null && r1Var.f) || this.h3 || this.R0 == null) {
            return;
        }
        if (z11 || this.v3 != z4) {
            this.v3 = z4;
            eg egVar = this.V2;
            if (egVar != null) {
                egVar.x1();
            }
            Point point = AndroidUtilities.displaySize;
            final int i11 = point.x > point.y ? this.u2 : this.t2;
            AnimatorSet animatorSet = this.x3;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.x3 = null;
            }
            boolean z13 = this.v3;
            AnimationNotificationsLocker animationNotificationsLocker = this.H3;
            org.telegram.ui.Cells.b1 b1Var = this.p3;
            final int i12 = 0;
            qv0 qv0Var = this.i1;
            if (z13) {
                if (z12) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
                }
                int height = qv0Var.getHeight();
                this.k1 = height;
                int dp = ((((height - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
                this.z3 = dp;
                if (this.N1 == 2) {
                    this.z3 = Math.min(dp, AndroidUtilities.dp(175.0f) + i11);
                }
                if (this.Z4 == null) {
                    this.R0.getLayoutParams().height = this.z3;
                }
                qv0Var.requestLayout();
                if (this.u4) {
                    qv0Var.setForeground(new df.f(this));
                }
                ff ffVar = this.B0;
                if (ffVar != null) {
                    int selectionStart = ffVar.getSelectionStart();
                    int selectionEnd = this.B0.getSelectionEnd();
                    ff ffVar2 = this.B0;
                    ffVar2.setText(ffVar2.getText());
                    this.B0.setSelection(selectionStart, selectionEnd);
                }
                if (z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    if (this.Z4 != null) {
                        animatorSet2.playTogether(ValueAnimator.ofInt(-(this.z3 - i11)), ValueAnimator.ofInt(-(this.z3 - i11)), ObjectAnimator.ofFloat(this.B3, "animationProgress", 1.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofInt(this, b1Var, -(this.z3 - i11)), ObjectAnimator.ofInt(this.R0, b1Var, -(this.z3 - i11)), ObjectAnimator.ofFloat(this.B3, "animationProgress", 1.0f));
                    }
                    animatorSet2.setDuration(300L);
                    animatorSet2.setInterpolator(mr.f);
                    if (this.Z4 == null) {
                        ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.od
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
                                        int i15 = ChatActivityEnterView.j5;
                                        chatActivityEnterView.y3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.z3 - i14)));
                                        chatActivityEnterView.i1.invalidate();
                                        break;
                                    default:
                                        int i16 = ChatActivityEnterView.j5;
                                        chatActivityEnterView.y3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.z3 - i14));
                                        chatActivityEnterView.i1.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet2.addListener(new pe(this, 12));
                    this.x3 = animatorSet2;
                    this.R0.setLayerType(2, null);
                    animationNotificationsLocker.lock();
                    this.y3 = 0.0f;
                    qv0Var.invalidate();
                    animatorSet2.start();
                } else {
                    this.y3 = 1.0f;
                    if (this.Z4 == null) {
                        setTranslationY(-(this.z3 - i11));
                        this.R0.setTranslationY(-(this.z3 - i11));
                    }
                    AnimatedArrowDrawable animatedArrowDrawable = this.B3;
                    if (animatedArrowDrawable != null) {
                        animatedArrowDrawable.setAnimationProgress(1.0f);
                    }
                }
                ch.f fVar = this.Z4;
                if (fVar != null) {
                    ((ch.i) fVar).g(this.z3);
                }
            } else {
                if (z12) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 1);
                }
                if (z10) {
                    this.w3 = true;
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.Z4 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.B3, "animationProgress", 0.0f));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, b1Var, 0), ObjectAnimator.ofInt(this.R0, b1Var, 0), ObjectAnimator.ofFloat(this.B3, "animationProgress", 0.0f));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(mr.f);
                    if (this.Z4 == null) {
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.od
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
                                        int i15 = ChatActivityEnterView.j5;
                                        chatActivityEnterView.y3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.z3 - i14)));
                                        chatActivityEnterView.i1.invalidate();
                                        break;
                                    default:
                                        int i16 = ChatActivityEnterView.j5;
                                        chatActivityEnterView.y3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.z3 - i14));
                                        chatActivityEnterView.i1.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet3.addListener(new yf(this, i11, i10));
                    this.y3 = 1.0f;
                    qv0Var.invalidate();
                    this.x3 = animatorSet3;
                    this.R0.setLayerType(2, null);
                    animationNotificationsLocker.lock();
                    animatorSet3.start();
                } else {
                    this.y3 = 0.0f;
                    if (this.Z4 == null) {
                        setTranslationY(0.0f);
                        this.R0.setTranslationY(0.0f);
                        this.R0.getLayoutParams().height = i11;
                    }
                    qv0Var.requestLayout();
                    qv0Var.setForeground(null);
                    qv0Var.setWillNotDraw(false);
                    AnimatedArrowDrawable animatedArrowDrawable2 = this.B3;
                    if (animatedArrowDrawable2 != null) {
                        animatedArrowDrawable2.setAnimationProgress(0.0f);
                    }
                }
                ch.f fVar2 = this.Z4;
                if (fVar2 != null) {
                    ((ch.i) fVar2).g(i11);
                }
            }
            se seVar = this.P0;
            if (seVar != null) {
                if (this.v3) {
                    seVar.setContentDescription(LocaleController.getString("AccDescrCollapsePanel", R.string.AccDescrCollapsePanel));
                } else {
                    seVar.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
                }
            }
        }
    }

    public final void o(TLRPC.Document document) {
        U();
        uf ufVar = this.R0;
        int i10 = ufVar.Z0;
        MediaDataController.getInstance(i10).addRecentSticker(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = ufVar.g1.isEmpty();
        ufVar.g1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        bz bzVar = ufVar.v0;
        if (bzVar != null) {
            bzVar.l();
        }
        if (isEmpty) {
            ufVar.Z(false);
        }
    }

    public final void o0(boolean z4) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.q2;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.Y2 = null;
            this.X2 = null;
            this.Z2 = null;
            this.a3 = null;
            x71 x71Var = this.c1;
            int i10 = 1;
            if (x71Var != null) {
                x71Var.a(true);
            }
            me meVar = this.Y0;
            if (meVar != null) {
                meVar.setVisibility(0);
            }
            zd zdVar = this.Z3;
            zd zdVar2 = this.V3;
            zd zdVar3 = this.X3;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            de deVar = this.N0;
            Property property3 = View.ALPHA;
            ge geVar = this.n1;
            if (z4) {
                if (geVar != null) {
                    this.r1 = 0.0f;
                    geVar.setAlpha(0.0f);
                    geVar.setScaleX(0.0f);
                    geVar.setScaleY(0.0f);
                }
                this.n = 0.0f;
                this.h = 0.0f;
                F1();
                this.q2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(deVar, zdVar3, this.x0 ? 0.5f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(deVar, zdVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.d1, (Property<jj0, Float>) property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.d1, (Property<jj0, Float>) property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.d1, (Property<jj0, Float>) property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.b1, (Property<ae, Float>) property3, 0.0f));
                if (geVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.m1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.m1 = null;
                    }
                    this.r1 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.B0, (Property<ff, Float>) property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.B0, zdVar, 0.0f));
                ig igVar = this.K1;
                if (igVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(igVar, (Property<ig, Float>) property3, 0.0f));
                    this.K1.a();
                }
                this.q2.playTogether(arrayList);
                rh.z zVar = this.i0;
                if (zVar != null) {
                    zVar.setAlpha(0.0f);
                    this.i0.setScaleY(0.0f);
                    this.i0.setScaleX(0.0f);
                    this.q2.playTogether(ObjectAnimator.ofFloat(this.i0, (Property<rh.z, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.i0, (Property<rh.z, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.i0, (Property<rh.z, Float>) property, 1.0f));
                }
                this.q2.setDuration(150L);
                this.q2.addListener(new pe(this, i10));
            } else {
                jj0 jj0Var = this.d1;
                if (jj0Var != null) {
                    jj0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z10 = this.Z0;
                Property property4 = View.TRANSLATION_X;
                if (z10) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.c1, (Property<x71, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.c1, (Property<x71, Float>) property4, -AndroidUtilities.dp(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.B0, zdVar, 0.0f));
                    ig igVar2 = this.K1;
                    if (igVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(igVar2, (Property<ig, Float>) property3, 0.0f));
                        this.K1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.B0, (Property<ff, Float>) property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.B0, (Property<ff, Float>) property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    ff ffVar = this.B0;
                    if (ffVar == null || this.s != 1.0f) {
                        this.D = 0.0f;
                        J1();
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.B0, (Property<ff, Float>) property3, 1.0f);
                        ofFloat2.setStartDelay(750L);
                        ofFloat2.setDuration(200L);
                        animatorSet3.playTogether(ofFloat2);
                    } else {
                        ffVar.setAlpha(1.0f);
                        this.D = 0.0f;
                        J1();
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(this.e1, (Property<qk0, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.e1, (Property<qk0, Float>) property4, -AndroidUtilities.dp(20.0f)));
                    ig igVar3 = this.K1;
                    if (igVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(igVar3, (Property<ig, Float>) property3, 0.0f));
                        this.K1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (geVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.m1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.m1 = null;
                    }
                    this.r1 = 0.0f;
                    geVar.setAlpha(0.0f);
                    geVar.setScaleX(0.0f);
                    geVar.setScaleY(0.0f);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.r1 = 1.0f;
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
                animatorSet5.playTogether(ObjectAnimator.ofFloat(this.d1, (Property<jj0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.d1, (Property<jj0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.d1, (Property<jj0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.d1, (Property<jj0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(deVar, zdVar3, this.x0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(deVar, zdVar2, 1.0f));
                rh.z zVar2 = this.i0;
                if (zVar2 != null) {
                    zVar2.setAlpha(0.0f);
                    this.i0.setScaleY(0.0f);
                    this.i0.setScaleX(0.0f);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.i0, (Property<rh.z, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.i0, (Property<rh.z, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.i0, (Property<rh.z, Float>) property, 1.0f));
                }
                animatorSet5.setDuration(150L);
                animatorSet5.setStartDelay(600L);
                AnimatorSet animatorSet6 = new AnimatorSet();
                this.q2 = animatorSet6;
                if (animatorSet != null) {
                    animatorSet6.playTogether(animatorSet3, animatorSet, animatorSet5);
                } else {
                    animatorSet6.playTogether(animatorSet3, animatorSet5);
                }
                this.q2.addListener(new jf(this));
            }
            AnimatorSet animatorSet7 = this.q2;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            ig igVar4 = this.K1;
            if (igVar4 != null) {
                igVar4.invalidate();
            }
        }
    }

    public final void o1(boolean z4, boolean z10) {
        if (this.r4 == z4 && z10) {
            return;
        }
        ImageView imageView = this.s1;
        if (imageView == null) {
            if (!z4 && !this.h5) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = new ImageView(getContext());
                this.s1 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                this.s1.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.j6.Wk), PorterDuff.Mode.MULTIPLY));
                this.s1.setImageResource(R.drawable.input_suggest_paid_24);
                this.s1.setBackground(org.telegram.ui.ActionBar.j6.f0(i0(org.telegram.ui.ActionBar.j6.i6), 1, -1));
                if (this.h5) {
                    this.s1.setTranslationX(AndroidUtilities.dp(42.0f));
                    this.v1.addView(this.s1, k7.b6.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                } else {
                    this.l1.addView(this.s1, 0, k7.b6.n(44, 44));
                }
                this.s1.setOnClickListener(new kd(this, 19));
                this.s1.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
            }
        }
        boolean z11 = this.r4 != z4;
        this.r4 = z4;
        float f10 = z4 ? 1.0f : 0.6f;
        float f11 = z4 ? 1.0f : 0.0f;
        this.s1.setEnabled(z4);
        this.s1.setClickable(z4);
        ValueAnimator valueAnimator = this.s4;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.s4 = null;
        }
        if (z10) {
            if (this.h5) {
                this.s1.setVisibility(0);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s1.getAlpha(), f11);
            this.s4 = ofFloat;
            ofFloat.addUpdateListener(new gd(this, 7));
            this.s4.addListener(new te(this, z4, r2));
            this.s4.setDuration(220L);
            this.s4.setInterpolator(mr.h);
            this.s4.start();
        } else {
            this.s1.setScaleX(f10);
            this.s1.setScaleY(f10);
            this.s1.setAlpha(f11);
            if (this.h5) {
                this.s1.setVisibility(z4 ? 0 : 8);
            }
        }
        H1(this.L4);
        if (z11) {
            J(true);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ve veVar = this.n0;
        if (veVar != null) {
            veVar.e = false;
            veVar.dismiss();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        e0(canvas, true);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View findChildViewUnder;
        if (this.B2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (findChildViewUnder = AndroidUtilities.findChildViewUnder(this, motionEvent.getX(), motionEvent.getY())) != this.I && findChildViewUnder != this.J) {
            l0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        df dfVar;
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.R4 == -1 || (dfVar = this.j0) == null) {
            return;
        }
        f2.i0 i0Var = (f2.i0) dfVar.c.getLayoutManager();
        if (i0Var != null) {
            i0Var.h1(this.R4, this.S4);
        }
        this.R4 = -1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ae aeVar = this.v1;
        int measuredHeight = aeVar.getMeasuredHeight();
        rh.z zVar = this.i0;
        ImageView imageView = this.O0;
        de deVar = this.N0;
        int i12 = 0;
        if (zVar == null || zVar.getTag() == null) {
            zo0 zo0Var = this.m0;
            if (zo0Var == null || zo0Var.getVisibility() != 0) {
                ((ViewGroup.MarginLayoutParams) deVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                }
                ff ffVar = this.B0;
                if (ffVar != null) {
                    ((ViewGroup.MarginLayoutParams) ffVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
                RichMessageLayout.PreviewView previewView = this.y1;
                if (previewView != null) {
                    ((ViewGroup.MarginLayoutParams) previewView.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
            } else {
                int i13 = this.m0.getLayoutParams().width;
                this.m0.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.m0.getLayoutParams().height, TLObject.FLAG_30));
                ((ViewGroup.MarginLayoutParams) deVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i13;
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i13;
                }
                ff ffVar2 = this.B0;
                if (ffVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) ffVar2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i13;
                }
                RichMessageLayout.PreviewView previewView2 = this.y1;
                if (previewView2 != null) {
                    ((ViewGroup.MarginLayoutParams) previewView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i13;
                }
            }
        } else {
            this.i0.measure(i10, i11);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) deVar.getLayoutParams();
            int dp = AndroidUtilities.dp(10.0f);
            rh.z zVar2 = this.i0;
            marginLayoutParams.leftMargin = dp + (zVar2 == null ? 0 : zVar2.getMeasuredWidth());
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int dp2 = AndroidUtilities.dp(10.0f);
                rh.z zVar3 = this.i0;
                marginLayoutParams2.leftMargin = dp2 + (zVar3 == null ? 0 : zVar3.getMeasuredWidth());
            }
            ff ffVar3 = this.B0;
            if (ffVar3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) ffVar3.getLayoutParams();
                int dp3 = AndroidUtilities.dp(57.0f);
                rh.z zVar4 = this.i0;
                marginLayoutParams3.leftMargin = dp3 + (zVar4 == null ? 0 : zVar4.getMeasuredWidth());
            }
            RichMessageLayout.PreviewView previewView3 = this.y1;
            if (previewView3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) previewView3.getLayoutParams();
                int dp4 = AndroidUtilities.dp(57.0f);
                rh.z zVar5 = this.i0;
                marginLayoutParams4.leftMargin = dp4 + (zVar5 == null ? 0 : zVar5.getMeasuredWidth());
            }
        }
        C1();
        super.onMeasure(i10, i11);
        rh.e3 e3Var = this.h0;
        if (e3Var != null) {
            rh.z zVar6 = this.i0;
            if (zVar6 != null) {
                e3Var.setMeasuredButtonWidth(zVar6.getMeasuredWidth());
            }
            this.h0.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(2.0f);
            measureChild(this.h0, i10, i11);
        }
        M();
        N();
        if (measuredHeight <= 0 || aeVar.getMeasuredHeight() == measuredHeight) {
            return;
        }
        while (i12 < 2) {
            ImageView imageView2 = i12 == 0 ? this.p1 : this.q1;
            imageView2.setTranslationY((imageView2.getTranslationY() + aeVar.getMeasuredHeight()) - measuredHeight);
            imageView2.animate().translationY(0.0f).setInterpolator(mr.h).setDuration(420L).start();
            i12++;
        }
        ph.f3 f3Var = this.J;
        if (f3Var != null) {
            f3Var.setTranslationY((f3Var.getTranslationY() + aeVar.getMeasuredHeight()) - measuredHeight);
            org.telegram.ui.b.p(this.J.animate().translationY(0.0f), mr.h, 420L);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 && this.v3) {
            m1(0, false);
            this.R0.t(false);
            n1(false, false, false, true);
        }
        x71 x71Var = this.c1;
        if (x71Var != null) {
            ArrayList arrayList = x71Var.v;
            if (x71Var.K.isEmpty()) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i14);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            u71 u71Var = x71Var.w;
            if (u71Var != null) {
                u71Var.cancel(true);
                x71Var.w = null;
            }
            x71Var.invalidate();
        }
    }

    public final ValueAnimator p(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F1.a, f10);
        ofFloat.addUpdateListener(new gd(this, 5));
        return ofFloat;
    }

    public final void p0() {
        this.Y2 = null;
        this.X2 = null;
        this.Z2 = null;
        this.a3 = null;
        x71 x71Var = this.c1;
        if (x71Var != null) {
            x71Var.a(true);
        }
        qk0 qk0Var = this.e1;
        if (qk0Var != null) {
            qk0Var.setAlpha(1.0f);
            this.e1.setTranslationX(0.0f);
        }
        x71 x71Var2 = this.c1;
        if (x71Var2 != null) {
            x71Var2.setAlpha(1.0f);
            this.c1.setTranslationX(0.0f);
        }
        ff ffVar = this.B0;
        if (ffVar != null) {
            ffVar.setAlpha(1.0f);
            this.D = 0.0f;
            J1();
            this.B0.requestFocus();
        }
        ae aeVar = this.b1;
        if (aeVar != null) {
            aeVar.setVisibility(8);
        }
        x0();
    }

    public final void p1(boolean z4) {
        org.telegram.ui.zn znVar;
        boolean z10 = ((!z4 && !this.z1) || (znVar = this.L2) == null || znVar.v()) ? false : true;
        if (this.G4 == z10) {
            return;
        }
        if (z10) {
            MessagesController.getInstance(this.N).getTonesController().load();
        }
        this.G4 = z10;
        ImageView imageView = this.p1;
        imageView.setVisibility(0);
        imageView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setInterpolator(mr.h).setDuration(420L).withEndAction(new pd(this, z10, 0)).start();
        if (!z10) {
            ph.f3 f3Var = this.J;
            if (f3Var != null) {
                f3Var.e(true);
                this.J = null;
                return;
            }
            return;
        }
        j0 j0Var = this.o1;
        Objects.requireNonNull(j0Var);
        imageView.postDelayed(new i0(j0Var, 1), 220L);
        ph.f3 f3Var2 = this.J;
        if (f3Var2 != null) {
            f3Var2.e(true);
            this.J = null;
        }
        if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
            ph.f3 f3Var3 = new ph.f3(getContext(), 3);
            this.J = f3Var3;
            f3Var3.p(true);
            this.J.s(LocaleController.getString(R.string.AIEditorHint));
            this.J.m(0.0f, (imageView.getWidth() / 2.0f) + AndroidUtilities.dp(4.0f));
            addView(this.J, k7.b6.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
            ph.f3 f3Var4 = this.J;
            f3Var4.i0 = new org.telegram.ui.np(13, this, f3Var3);
            f3Var4.d = 4000L;
            f3Var4.u();
            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
        }
    }

    public final ValueAnimator q(boolean z4) {
        final float alpha = getSendButtonInternal().getAlpha();
        final float f10 = z4 ? 1.0f : 0.0f;
        final float scaleX = getSendButtonInternal().getScaleX();
        final float f11 = z4 ? 1.0f : 0.1f;
        final float scaleY = getSendButtonInternal().getScaleY();
        final float f12 = z4 ? 1.0f : 0.1f;
        if (z4 && alpha < 0.25f && (getSendButtonInternal() instanceof lg)) {
            lg lgVar = (lg) getSendButtonInternal();
            lgVar.b0.d(0.0f, true);
            lgVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.rd
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i10 = ChatActivityEnterView.j5;
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

    public void q0(boolean z4) {
        if (this.C1 == null || !this.b3) {
            return;
        }
        id idVar = this.S;
        if (idVar != null) {
            AndroidUtilities.cancelRunOnUIThread(idVar);
        }
        this.b3 = false;
        this.c3 = false;
        if (this.d3) {
            this.c5.a(false, z4);
        }
    }

    public final void q1() {
        org.telegram.ui.zn znVar = this.L2;
        if (znVar == null || !ChatObject.isChannelAndNotMegaGroup(znVar.e)) {
            return;
        }
        qc.a0(znVar).f(MessagesController.getInstance(this.N).captionLengthLimitPremium, new id(this, 0)).j();
    }

    public final boolean r0() {
        return this.V1 != null;
    }

    public boolean r1(Runnable runnable) {
        return false;
    }

    public final void s(SendMessagesHelper.SendMessageParams sendMessageParams) {
        eg egVar = this.V2;
        if (egVar != null) {
            sendMessageParams.replyToStoryItem = egVar.i1();
            sendMessageParams.replyQuote = this.V2.u0();
        }
    }

    public final boolean s0() {
        return this.Z0;
    }

    public final void s1() {
        t1(1, 0, true, true);
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.r1 r1Var) {
        this.R = r1Var;
    }

    public void setAnimatedTop(int i10) {
        this.P1 = i10;
    }

    public void setBotInfo(a0.h hVar) {
        X0(hVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f10) {
        this.N0.setTranslationX(f10);
        if (this.B0 != null) {
            this.D = f10;
            J1();
        }
        this.n1.setTranslationX(this.y + this.x + f10);
        this.Y0.setTranslationX(f10);
        se seVar = this.t1;
        if (seVar != null) {
            seVar.setTranslationX(f10);
        }
    }

    public void setButtons(MessageObject messageObject) {
        Z0(messageObject, true, true);
    }

    public void setCaption(String str) {
        ff ffVar = this.B0;
        if (ffVar != null) {
            ffVar.setCaption(str);
            J(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.Z1 = chatFull;
        uf ufVar = this.R0;
        if (ufVar != null) {
            ufVar.setChatInfo(chatFull);
        }
        mg mgVar = this.C0;
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
        this.y4 = f10;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.F4 = view;
        this.B0.setWindowView(view);
    }

    public void setDelegate(eg egVar) {
        this.V2 = egVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.X1 = tL_businessChatLink;
        G1(false);
        if (this.X1 != null) {
            T(true);
            this.B1.setOnClickListener(new kd(this, 3));
            this.B1.setContentDescription(LocaleController.getString(R.string.Done));
            this.B1.setVisibility(0);
            this.B1.setScaleX(0.1f);
            this.B1.setScaleY(0.1f);
            this.B1.setAlpha(0.0f);
            this.B1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(mr.f).start();
            this.W = this.O.getMessagesController().getMaxMessageLength();
            ff ffVar = this.B0;
            TextPaint paint = ffVar != null ? ffVar.getPaint() : null;
            if (paint == null) {
                paint = new TextPaint();
                paint.setTextSize(AndroidUtilities.dp(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.X1.entities;
            if (arrayList == null || (str = tL_businessChatLink.message) == null) {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            } else {
                setFieldText(r(arrayList, str, fontMetricsInt));
            }
            this.Y1 = x();
            V0(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.M0.setVisibility(8);
            this.W0.setVisibility(8);
            dg.u3 u3Var = this.l1;
            if (u3Var != null) {
                u3Var.setVisibility(8);
            }
            ge geVar = this.n1;
            if (geVar != null) {
                this.r1 = 0.0f;
                geVar.setAlpha(0.0f);
                geVar.setScaleX(0.5f);
                geVar.setScaleY(0.5f);
            }
            this.w1.setVisibility(8);
            qe qeVar = this.F1;
            if (qeVar != null) {
                qeVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j10) {
        this.O4 = j10;
        oe oeVar = this.G0;
        if (oeVar != null) {
            oeVar.setEffect(j10);
        }
    }

    public void setExitTransition(float f10) {
        this.i4 = f10;
        RecordCircle recordCircle = this.J1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z4) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.K2.getSystemService("accessibility");
        if (this.B0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        if (z4 && org.telegram.ui.ActionBar.p2.hasSheets(this.L2)) {
            z4 = false;
        }
        if (z4) {
            if (this.N1 != 0 || this.B0.isFocused()) {
                return;
            }
            id idVar = new id(this, 5);
            this.O1 = idVar;
            AndroidUtilities.runOnUIThread(idVar, 600L);
            return;
        }
        ff ffVar = this.B0;
        if (ffVar == null || !ffVar.isFocused()) {
            return;
        }
        if (!this.v2 || this.f2) {
            this.B0.clearFocus();
        }
    }

    @Override // org.telegram.ui.Components.oy0
    public void setFieldText(CharSequence charSequence) {
        f1(charSequence, false);
    }

    public void setInAppInsetsController(ch.f fVar) {
        this.Z4 = fVar;
    }

    public void setLockAnimatedTranslation(float f10) {
        this.h4 = f10;
        RecordCircle recordCircle = this.J1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new nd(this, 0);
        }
        this.G0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        j1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z4) {
        this.v = z4;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.y1 == null) {
            return;
        }
        if (!MessagesController.getInstance(this.N).richEditorAvailable()) {
            richMessage = null;
        }
        this.A1 = richMessage;
        N1();
    }

    public void setSelection(int i10) {
        ff ffVar = this.B0;
        if (ffVar == null) {
            return;
        }
        ffVar.setSelection(i10, ffVar.length());
    }

    public void setSideButtonsForAttach(wg.g gVar) {
        this.a5 = gVar;
    }

    public void setSlideToCancelProgress(float f10) {
        this.f4 = f10;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > AndroidUtilities.dp(140.0f)) {
            measuredWidth = AndroidUtilities.dp(140.0f);
        }
        this.p4 = (int) ((1.0f - this.f4) * (-measuredWidth));
        RecordCircle recordCircle = this.J1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i10) {
        this.D0 = i10;
        S1();
    }

    public void setSnapAnimationProgress(float f10) {
        this.j4 = f10;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z4) {
        this.e0 = z4;
        this.w1.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.j1 = viewGroup;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z4 = i10 == 0;
        this.E4 = z4;
        ff ffVar = this.B0;
        if (ffVar != null) {
            ffVar.setEnabled(z4);
        }
    }

    public void setVoiceDraft(MediaDataController.DraftVoice draftVoice) {
        if (draftVoice == null) {
            return;
        }
        boolean z4 = draftVoice.once;
        this.L = z4;
        ig igVar = this.K1;
        if (igVar != null) {
            igVar.y.d(1, z4, true);
        }
        eg egVar = this.V2;
        TL_stories.StoryItem i12 = egVar != null ? egVar.i1() : null;
        MediaController mediaController = MediaController.getInstance();
        int i10 = this.N;
        long j10 = this.M2;
        MessageObject messageObject = this.P2;
        MessageObject threadMessage = getThreadMessage();
        SendMessageChatArguments sendMessageChatArguments = null;
        int i11 = this.C2;
        org.telegram.ui.zn znVar = this.L2;
        if (znVar != null) {
            sendMessageChatArguments = znVar.C8();
        }
        mediaController.prepareResumedRecording(i10, draftVoice, j10, messageObject, threadMessage, i12, i11, sendMessageChatArguments, getSendMonoForumPeerId(), getSendMessageSuggestionParams());
    }

    public boolean t() {
        return false;
    }

    public final boolean t0() {
        return this.T0 || this.U0;
    }

    public final void t1(int i10, int i11, boolean z4, boolean z10) {
        int i12;
        boolean z11;
        int i13;
        ViewGroup viewGroup;
        int i14;
        float f10;
        if (i10 == 2) {
            return;
        }
        AnimationNotificationsLocker animationNotificationsLocker = this.H3;
        re reVar = this.U3;
        Property property = View.TRANSLATION_Y;
        boolean z12 = false;
        if (i10 == 1) {
            if (i11 == 0) {
                if (this.K2 == null && this.R0 == null) {
                    return;
                } else {
                    U();
                }
            }
            if (i11 == 0) {
                u();
                if (this.T0) {
                    this.R0.getVisibility();
                }
                this.R0.setVisibility(0);
                this.T0 = true;
                rf rfVar = this.D1;
                if (rfVar == null || rfVar.getVisibility() == 8) {
                    i13 = 0;
                } else {
                    this.D1.setVisibility(8);
                    this.U0 = false;
                    i13 = this.D1.getMeasuredHeight();
                }
                this.R0.setShowing(true);
                viewGroup = this.R0;
                this.k3 = 0;
            } else if (i11 == 1) {
                if (this.U0) {
                    this.D1.getVisibility();
                }
                this.U0 = true;
                uf ufVar = this.R0;
                if (ufVar == null || ufVar.getVisibility() == 8) {
                    i14 = 0;
                } else {
                    this.j1.removeView(this.R0);
                    this.R0.setVisibility(8);
                    this.R0.setShowing(false);
                    this.T0 = false;
                    i14 = this.R0.getMeasuredHeight();
                }
                this.D1.setVisibility(0);
                ViewGroup viewGroup2 = this.D1;
                this.k3 = 1;
                MessagesController.getMainSettings(this.N).edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                i13 = i14;
                viewGroup = viewGroup2;
            } else {
                i13 = 0;
                viewGroup = null;
            }
            this.b2 = i11;
            if (this.t2 <= 0) {
                f10 = 200.0f;
                this.t2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            } else {
                f10 = 200.0f;
            }
            if (this.u2 <= 0) {
                this.u2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(f10));
            }
            Point point = AndroidUtilities.displaySize;
            int i15 = point.x > point.y ? this.u2 : this.t2;
            org.telegram.ui.zn znVar = this.L2;
            if (znVar != null && znVar.getParentLayout() != null) {
                i15 -= ((ActionBarLayout) znVar.getParentLayout()).v(false);
            }
            if (i11 == 1) {
                i15 = Math.min(this.D1.getKeyboardHeight(), i15);
            }
            rf rfVar2 = this.D1;
            if (rfVar2 != null) {
                rfVar2.setPanelHeight(i15);
            }
            if (viewGroup != null && this.Z4 == null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                layoutParams.height = i15;
                viewGroup.setLayoutParams(layoutParams);
            }
            if (!AndroidUtilities.isInMultiwindow) {
                AndroidUtilities.hideKeyboard(this.B0);
            }
            qv0 qv0Var = this.i1;
            if (qv0Var != null) {
                this.w2 = i15;
                qv0Var.requestLayout();
                d1(true, true);
                B1(true);
                G0();
                if (this.e2 && !this.v2 && i15 != i13 && z4) {
                    id idVar = new id(this, 10);
                    if (this.v) {
                        this.w = idVar;
                    } else {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.S0 = animatorSet;
                        if (this.Z4 != null) {
                            animatorSet.playTogether(ValueAnimator.ofFloat(i15 - i13, 0.0f));
                        } else {
                            float f11 = i15 - i13;
                            viewGroup.setTranslationY(f11);
                            this.S0.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) property, f11, 0.0f));
                        }
                        this.S0.setInterpolator(org.telegram.ui.ActionBar.r1.w);
                        this.S0.setDuration(250L);
                        this.S0.addListener(new dg.y2(16, this, idVar));
                        AndroidUtilities.runOnUIThread(reVar, 50L);
                        animationNotificationsLocker.lock();
                    }
                    requestLayout();
                }
            }
            ch.f fVar = this.Z4;
            if (fVar != null) {
                ((ch.i) fVar).g(i15);
            }
        } else {
            if (this.N0 != null) {
                d1(false, true);
            }
            this.b2 = -1;
            uf ufVar2 = this.R0;
            if (ufVar2 != null) {
                if (i10 == 2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    this.C3 = false;
                    eg egVar = this.V2;
                    if (egVar != null) {
                        egVar.x(0.0f);
                    }
                    this.j1.removeView(this.R0);
                    this.R0 = null;
                } else if (!this.e2 || this.v2 || this.v3) {
                    eg egVar2 = this.V2;
                    if (egVar2 != null) {
                        egVar2.x(0.0f);
                    }
                    z12 = false;
                    this.w2 = 0;
                    this.j1.removeView(this.R0);
                    this.R0.setVisibility(8);
                    this.R0.setShowing(false);
                } else {
                    this.T0 = true;
                    this.k3 = 0;
                    ufVar2.setShowing(false);
                    ah.b bVar = new ah.b(this, i10, 28);
                    if (this.v) {
                        this.w = bVar;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.S0 = animatorSet2;
                        if (this.Z4 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofFloat(this.R0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.R0, (Property<uf, Float>) property, r5.getMeasuredHeight()));
                        }
                        this.S0.setInterpolator(org.telegram.ui.ActionBar.r1.w);
                        this.S0.setDuration(250L);
                        animationNotificationsLocker.lock();
                        this.S0.addListener(new dg.y2(17, this, bVar));
                    }
                    AndroidUtilities.runOnUIThread(reVar, 50L);
                    requestLayout();
                    z12 = false;
                }
                this.T0 = z12;
            }
            rf rfVar3 = this.D1;
            if (rfVar3 != null && rfVar3.getVisibility() == 0) {
                if (i10 != 2 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    if (this.e2 && !this.v2) {
                        if (this.U0) {
                            this.k3 = 1;
                        }
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        this.S0 = animatorSet3;
                        if (this.Z4 != null) {
                            i12 = 0;
                            animatorSet3.playTogether(ValueAnimator.ofFloat(this.D1.getMeasuredHeight()));
                        } else {
                            i12 = 0;
                            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.D1, (Property<rf, Float>) property, r5.getMeasuredHeight()));
                        }
                        this.S0.setInterpolator(org.telegram.ui.ActionBar.r1.w);
                        this.S0.setDuration(250L);
                        this.S0.addListener(new yf(this, i10, i12));
                        animationNotificationsLocker.lock();
                        AndroidUtilities.runOnUIThread(reVar, 50L);
                        requestLayout();
                    } else if (!this.g3) {
                        this.D1.setVisibility(8);
                    }
                }
                this.U0 = false;
            }
            if (i11 == 1 && this.i2 != null) {
                MessagesController.getMainSettings(this.N).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.i2.getId()).apply();
            }
            B1(true);
            ch.f fVar2 = this.Z4;
            if (fVar2 != null) {
                ((ch.i) fVar2).h(z10);
            }
        }
        if (this.t3 || this.u3) {
            J(true);
        }
        if (!this.v3 || i10 == 1) {
            z11 = false;
        } else {
            z11 = false;
            n1(false, false, false, true);
        }
        G1(z11);
        D();
    }

    public final void u() {
        if (this.R0.getParent() == null) {
            if (this.Z4 == null) {
                this.j1.addView(this.R0);
            } else {
                this.j1.addView(this.R0, k7.b6.c(-1.0f, -1));
            }
        }
    }

    public final boolean u0(View view) {
        return view == this.D1 || view == this.R0;
    }

    public final void u1() {
        eg egVar = this.V2;
        if ((egVar == null || !egVar.l()) && DialogObject.isChatDialog(this.M2)) {
            qc.a0(this.L2).G(R.raw.passcode_lock_close, 3, LocaleController.formatString("SendPlainTextRestrictionHint", R.string.SendPlainTextRestrictionHint, ChatObject.getAllowedSendString(this.O.getMessagesController().getChat(Long.valueOf(-this.M2))))).j();
        }
    }

    public final boolean v() {
        rh.z zVar = this.i0;
        return zVar != null && zVar.v;
    }

    public final boolean v0() {
        return this.B2 && ChatActivityEnterView.this.o4;
    }

    public final void v1(boolean z4) {
        org.telegram.ui.zn znVar;
        boolean z10 = (this.z1 || z4) && (znVar = this.L2) != null && !znVar.v() && this.V1 == null && MessagesController.getInstance(this.N).richEditorAvailable();
        if (this.H4 == z10) {
            return;
        }
        this.H4 = z10;
        ImageView imageView = this.q1;
        imageView.setVisibility(0);
        imageView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setInterpolator(mr.h).setDuration(420L).withEndAction(new pd(this, z10, 1)).start();
    }

    public final boolean w() {
        ag x10 = x();
        return (TextUtils.equals(x10.a, this.Y1.a) && MediaDataController.entitiesEqual((ArrayList<TLRPC.MessageEntity>) this.Y1.b, (ArrayList<TLRPC.MessageEntity>) x10.b)) ? false : true;
    }

    public final boolean w0() {
        if (this.B2) {
            return true;
        }
        AnimatorSet animatorSet = this.p2;
        return (animatorSet == null || !animatorSet.isRunning() || this.g2) ? false : true;
    }

    public final void w1() {
        x1(true, false);
    }

    public final ag x() {
        ff ffVar = this.B0;
        CharSequence[] charSequenceArr = {AndroidUtilities.getTrimmedString(ffVar == null ? "" : ffVar.getTextToUse())};
        ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.N).getEntities(charSequenceArr, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = entities.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.MessageEntity messageEntity = entities.get(i10);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        ag agVar = new ag();
        agVar.a = charSequence.toString();
        agVar.b = entities;
        return agVar;
    }

    public final void x1(boolean z4, boolean z10) {
        if (this.C1 == null || this.b3 || getVisibility() != 0) {
            ae aeVar = this.b1;
            if ((aeVar == null || aeVar.getVisibility() != 0) && !this.D2 && this.R2 == null && this.P2 == null) {
                H0();
                return;
            }
            return;
        }
        ae aeVar2 = this.b1;
        boolean z11 = (aeVar2 == null || aeVar2.getVisibility() != 0) && !this.D2 && this.R2 == null && (this.j2 == null || this.V1 != null);
        if (!z10 && z4 && z11 && !this.v2 && !t0()) {
            H0();
            id idVar = this.S;
            if (idVar != null) {
                AndroidUtilities.cancelRunOnUIThread(idVar);
            }
            id idVar2 = new id(this, 23);
            this.S = idVar2;
            AndroidUtilities.runOnUIThread(idVar2, 200L);
            return;
        }
        this.c3 = true;
        this.b3 = true;
        if (this.d3) {
            this.c5.a(true, z4);
            if (z11) {
                ff ffVar = this.B0;
                if (ffVar != null) {
                    ffVar.requestFocus();
                }
                H0();
            }
        }
    }

    public final float y(boolean z4) {
        xd.c cVar = this.b5;
        float f10 = z4 ? cVar.g ? cVar.f : cVar.e : cVar.e;
        xd.a aVar = this.c5;
        return ((this.C1 != null ? r1.getMeasuredHeight() : 0) * (z4 ? aVar.f ? 1.0f : 0.0f : aVar.e)) + f10;
    }

    public final boolean y0() {
        return this.v3;
    }

    public final boolean y1() {
        org.telegram.ui.zn znVar = this.L2;
        TLRPC.EncryptedChat encryptedChat = znVar != null ? znVar.h : null;
        return encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101;
    }

    public final boolean z0() {
        View view = this.C1;
        return view != null && view.getVisibility() == 0;
    }

    public final void z1() {
        float f10;
        ge geVar = this.n1;
        if (geVar == null) {
            return;
        }
        float f11 = this.y + this.x;
        oe oeVar = this.G0;
        if (oeVar != null) {
            f10 = oeVar.getAlpha() * (-kf.k0.c(56.0f, oeVar.l(), 0));
        } else {
            f10 = 0.0f;
        }
        geVar.setTranslationX(f11 + f10);
    }

    @Override // org.telegram.ui.Components.oy0
    public ut getEditField() {
        return this.B0;
    }

    @Override // org.telegram.ui.Components.oy0
    public org.telegram.ui.zn getParentFragment() {
        return this.L2;
    }

    public void A0(float f10) {
    }

    public void h0(Menu menu) {
    }

    public void x0() {
    }

    public void C0(int i10, int i11) {
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
