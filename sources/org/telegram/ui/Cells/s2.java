package org.telegram.ui.Cells;

import ai.kc;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a31;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mx0;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.rf0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u10;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.ws;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.xs;
import org.telegram.ui.e10;
import org.telegram.ui.l41;
import org.telegram.ui.nx;
import org.telegram.ui.ty;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class s2 extends a0 implements ai.s9, org.telegram.ui.ActionBar.z5 {
    public boolean A0;
    public boolean A1;
    public boolean A2;
    public boolean A3;
    public ValueAnimator A4;
    public boolean B0;
    public float B1;
    public float B2;
    public boolean B3;
    public long B4;
    public float C0;
    public float C1;
    public boolean C2;
    public int C3;
    public int C4;
    public fi.a D0;
    public float D1;
    public boolean D2;
    public int D3;
    public final ty D4;
    public boolean E;
    public int E0;
    public boolean E1;
    public Paint E2;
    public int E3;
    public StaticLayout E4;
    public boolean F;
    public final int F0;
    public final bd F1;
    public Paint F2;
    public float F3;
    public int F4;
    public f7 G;
    public n2 G0;
    public final Paint G1;
    public boolean G2;
    public boolean G3;
    public int G4;
    public int H;
    public long H0;
    public final RectF H1;
    public int H2;
    public boolean H3;
    public int H4;
    public int I;
    public String I0;
    public l11 I1;
    public int I2;
    public int I3;
    public final p2 I4;
    public int J;
    public int J0;
    public boolean J1;
    public int J2;
    public LayerDrawable J3;
    public final org.telegram.ui.ActionBar.e6 J4;
    public int K;
    public long K0;
    public ai.y1 K1;
    public int K2;
    public int K3;
    public int K4;
    public final int L;
    public String L0;
    public boolean L1;
    public int L2;
    public boolean L3;
    public int L4;
    public final int M;
    public int M0;
    public int M1;
    public int M2;
    public int M3;
    public int M4;
    public TLRPC.TL_forumTopic N;
    public boolean N0;
    public int N1;
    public StaticLayout N2;
    public int N3;
    public r2 N4;
    public boolean O;
    public boolean O0;
    public String O1;
    public int O2;
    public int O3;
    public GradientDrawable O4;
    public boolean P;
    public boolean P0;
    public int P1;
    public boolean P2;
    public int P3;
    public int P4;
    public boolean Q;
    public boolean Q0;
    public ck0 Q1;
    public boolean Q2;
    public int Q3;
    public int Q4;
    public boolean R;
    public int R0;
    public int R1;
    public boolean R2;
    public boolean R3;
    public Paint R4;
    public Paint S;
    public int S0;
    public boolean S1;
    public boolean S2;
    public final me.b S3;
    public rg.a1 S4;
    public Paint T;
    public boolean T0;
    public Paint T1;
    public int T2;
    public ValueAnimator T3;
    public Drawable T4;
    public float U;
    public int U0;
    public final boolean[] U1;
    public int U2;
    public ValueAnimator U3;
    public int U4;
    public boolean V;
    public int V0;
    public final ImageReceiver[] V1;
    public int V2;
    public float V3;
    public Drawable V4;
    public boolean W;
    public int W0;
    public final boolean[] W1;
    public int W2;
    public float W3;
    public Drawable W4;
    public boolean X0;
    public final boolean[] X1;
    public int X2;
    public StaticLayout X3;
    public ColorFilter[] X4;
    public int Y0;
    public final ImageReceiver Y1;
    public int Y2;
    public StaticLayout Y3;
    public int[] Y4;
    public boolean Z0;
    public rf0 Z1;
    public int Z2;
    public StaticLayout Z3;
    public Runnable Z4;
    public TextPaint a0;
    public boolean a1;
    public final org.telegram.ui.Components.j9 a2;
    public int a3;
    public StaticLayout a4;
    public Paint b0;
    public boolean b1;
    public boolean b2;
    public int b3;
    public boolean b4;
    public id c0;
    public float c1;
    public float c2;
    public int c3;
    public boolean c4;
    public o2 d0;
    public boolean d1;
    public final m2 d2;
    public int d3;
    public boolean d4;
    public boolean e0;
    public boolean e1;
    public nj0 e2;
    public StaticLayout e3;
    public int e4;
    public boolean f;
    public boolean f0;
    public MessageObject f1;
    public TLRPC.User f2;
    public StaticLayout f3;
    public int f4;
    public boolean g0;
    public ArrayList g1;
    public TLRPC.Chat g2;
    public int g3;
    public int g4;
    public final boolean h;
    public Drawable[] h0;
    public boolean h1;
    public TLRPC.EncryptedChat h2;
    public StaticLayout h3;
    public int h4;
    public float i0;
    public CharSequence i1;
    public CharSequence i2;
    public final Stack i3;
    public StaticLayout i4;
    public boolean j0;
    public int j1;
    public int j2;
    public final ArrayList j3;
    public boolean j4;
    public boolean k0;
    public int k1;
    public boolean k2;
    public final Stack k3;
    public boolean k4;
    public int l0;
    public int l1;
    public TLRPC.DraftMessage l2;
    public final ArrayList l3;
    public boolean l4;
    public float m0;
    public boolean m1;
    public final org.telegram.ui.Components.g6 m2;
    public org.telegram.ui.Components.x5 m3;
    public final ci.bb m4;
    public float n;
    public a31 n0;
    public boolean n1;
    public boolean n2;
    public org.telegram.ui.Components.x5 n3;
    public final org.telegram.ui.Components.q5 n4;
    public Paint o0;
    public float o1;
    public final org.telegram.ui.Components.g6 o2;
    public org.telegram.ui.Components.x5 o3;
    public final org.telegram.ui.Components.q5 o4;
    public Paint p0;
    public float p1;
    public long p2;
    public org.telegram.ui.Components.x5 p3;
    public int p4;
    public boolean q0;
    public float q1;
    public ci.o3 q2;
    public int q3;
    public boolean q4;
    public boolean r;
    public boolean r0;
    public float r1;
    public final boolean r2;
    public int r3;
    public final RectF r4;
    public ck0 s;
    public boolean s0;
    public int s1;
    public boolean s2;
    public StaticLayout s3;
    public gg.j s4;
    public xs t0;
    public float t1;
    public boolean t2;
    public boolean t3;
    public Path t4;
    public final k2 u0;
    public int u1;
    public boolean u2;
    public int u3;
    public RectF u4;
    public int v;
    public Path v0;
    public int v1;
    public boolean v2;
    public int v3;
    public int v4;
    public boolean w;
    public vh.g w0;
    public float w1;
    public boolean w2;
    public boolean w3;
    public int w4;
    public boolean x;
    public boolean x0;
    public boolean x1;
    public int x2;
    public float x3;
    public int x4;
    public boolean y;
    public boolean y0;
    public ck0 y1;
    public int y2;
    public boolean y3;
    public float y4;
    public boolean z0;
    public boolean z1;
    public StaticLayout z2;
    public boolean z3;
    public boolean z4;

    public s2(Context context, boolean z10) {
        this(null, context, z10, UserConfig.selectedAccount, null);
    }

    public static SpannableStringBuilder I(CharSequence charSequence, CharSequence charSequence2, int i10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i10 == 1) {
            spannableStringBuilder.append(charSequence2).append((CharSequence) ": \u2068").append(charSequence).append((CharSequence) "\u2069");
            return spannableStringBuilder;
        }
        if (i10 == 2) {
            spannableStringBuilder.append((CharSequence) "\u2068").append(charSequence).append((CharSequence) "\u2069");
            return spannableStringBuilder;
        }
        if (i10 == 3) {
            spannableStringBuilder.append(charSequence2).append((CharSequence) ": ").append(charSequence);
            return spannableStringBuilder;
        }
        if (i10 != 4) {
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private MessageObject getCaptionMessage() {
        CharSequence charSequence;
        if (this.g1 == null) {
            MessageObject messageObject = this.f1;
            if (messageObject == null || messageObject.caption == null) {
                return null;
            }
            return messageObject;
        }
        int i10 = 0;
        MessageObject messageObject2 = null;
        for (int i11 = 0; i11 < this.g1.size(); i11++) {
            MessageObject messageObject3 = (MessageObject) this.g1.get(i11);
            if (messageObject3 != null && (charSequence = messageObject3.caption) != null) {
                if (!TextUtils.isEmpty(charSequence)) {
                    i10++;
                }
                messageObject2 = messageObject3;
            }
        }
        if (i10 > 1) {
            return null;
        }
        return messageObject2;
    }

    private int getCollapsedHeight() {
        boolean z10 = this.r2;
        int dp = AndroidUtilities.dp((z10 || SharedConfig.useThreeLinesLayout) ? this.K : this.J) + 1;
        if (this.Q) {
            dp += AndroidUtilities.dp(20.0f);
        }
        if (!M() || ((z10 || SharedConfig.useThreeLinesLayout) && !Q())) {
            return dp;
        }
        return AndroidUtilities.dp(Q() ? this.M : this.L) + dp;
    }

    private Paint getPaintReorderGradient() {
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, this.J4);
        if (this.Q4 != w02 || this.R4 == null) {
            this.Q4 = w02;
            if (this.R4 == null) {
                this.R4 = new Paint(1);
            }
            this.R4.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{0, w02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
        return this.R4;
    }

    private TextPaint getTimeTextPaint() {
        return this.G3 ? N() ? org.telegram.ui.ActionBar.i6.J0 : org.telegram.ui.ActionBar.i6.K0 : org.telegram.ui.ActionBar.i6.I0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTopicId() {
        TLRPC.TL_forumTopic tL_forumTopic = this.N;
        if (tL_forumTopic == null) {
            return 0;
        }
        return tL_forumTopic.id;
    }

    public final void B(int i10, int i11) {
        this.y4 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A4 = ofFloat;
        ofFloat.setDuration(220L);
        this.A4.setInterpolator(hs.f);
        this.w4 = i10;
        this.v4 = i11;
        this.A4.addUpdateListener(new h2(this, 2));
        this.A4.addListener(new l2(this, 2));
        this.z4 = true;
        this.A4.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0221, code lost:
    
        if (r3 > 0) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(Canvas canvas) {
        boolean z10;
        float f7;
        int dp;
        int i10;
        float dp2;
        float dp3;
        float dp4;
        float f10;
        float dp5;
        float dp6;
        float dp7;
        float f11;
        float dp8;
        float dp9;
        float f12;
        float dp10;
        float dp11;
        float f13;
        float f14;
        float f15;
        boolean z11;
        boolean z12;
        float dp12;
        ci.o3 o3Var;
        TLRPC.Chat chat = this.g2;
        boolean z13 = false;
        if (chat == null || (chat.flags2 & 2048) == 0) {
            z10 = false;
        } else {
            float imageY2 = this.Y1.getImageY2();
            float imageX2 = this.Y1.getImageX2();
            ci.o3 o3Var2 = this.q2;
            float progress = (o3Var2 == null || !o3Var2.a.q) ? 1.0f : 1.0f - o3Var2.getProgress();
            if (this.W4 == null) {
                this.W4 = getContext().getResources().getDrawable(R.drawable.star_small_outline).mutate();
            }
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false);
            if (this.U4 != x02) {
                Drawable drawable = this.W4;
                this.U4 = x02;
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.V4 == null) {
                this.V4 = getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate();
            }
            int dp13 = AndroidUtilities.dp(19.33f);
            Rect rect = AndroidUtilities.rectTmp2;
            int i11 = (int) imageX2;
            int i12 = (int) imageY2;
            int i13 = i12 - dp13;
            rect.set((AndroidUtilities.dp(1.66f) + i11) - dp13, i13, AndroidUtilities.dp(1.66f) + i11, i12);
            rect.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            this.W4.setBounds(rect);
            int i14 = (int) (progress * 255.0f);
            this.W4.setAlpha(i14);
            this.W4.draw(canvas);
            rect.set((AndroidUtilities.dp(1.66f) + i11) - dp13, i13, AndroidUtilities.dp(1.66f) + i11, i12);
            this.V4.setBounds(rect);
            this.V4.setAlpha(i14);
            this.V4.draw(canvas);
            z10 = true;
        }
        float e7 = this.m2.e(this.n2 && !z10);
        float f16 = 10.0f;
        if (e7 > 0.0f) {
            float centerY = this.Y1.getCenterY() + AndroidUtilities.dp(18.0f);
            float centerX = this.Y1.getCenterX() + AndroidUtilities.dp(18.0f);
            canvas.save();
            org.telegram.ui.ActionBar.i6.t0.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, this.J4));
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(11.33f) * e7, org.telegram.ui.ActionBar.i6.t0);
            if (this.S4 == null) {
                this.S4 = new rg.a1(org.telegram.ui.ActionBar.i6.Lj, org.telegram.ui.ActionBar.i6.Mj, -1, -1, this.J4);
            }
            this.S4.d((int) (centerX - AndroidUtilities.dp(10.0f)), 0.0f, (int) (centerY - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + centerX), 0.0f, (int) (AndroidUtilities.dp(10.0f) + centerY));
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f) * e7, this.S4.f);
            if (this.T4 == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.T4 = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.T4.setBounds((int) (centerX - (((r4.getIntrinsicWidth() / 2.0f) * 0.875f) * e7)), (int) (centerY - (((this.T4.getIntrinsicHeight() / 2.0f) * 0.875f) * e7)), (int) (((this.T4.getIntrinsicWidth() / 2.0f) * 0.875f * e7) + centerX), (int) (((this.T4.getIntrinsicHeight() / 2.0f) * 0.875f * e7) + centerY));
            this.T4.setAlpha((int) (e7 * 255.0f));
            this.T4.draw(canvas);
            canvas.restore();
            return false;
        }
        if (!this.N0 || this.J0 != 0 || z10) {
            return false;
        }
        boolean z14 = (this.l0 <= 0 || R() || this.v2 || this.u0.w) ? false : true;
        this.w2 = z14;
        if (this.i0 != 1.0f && (z14 || this.m0 > 0.0f)) {
            a31 a31Var = this.n0;
            if (a31Var != null) {
                int i15 = a31Var.f;
                int i16 = this.l0;
                if (i15 != i16) {
                }
                if (this.o0 == null) {
                    this.o0 = new Paint(1);
                    Paint paint = new Paint(1);
                    this.p0 = paint;
                    paint.setColor(838860800);
                }
                int imageY22 = (int) (this.Y1.getImageY2() - AndroidUtilities.dp(9.0f));
                int dp14 = (int) (!LocaleController.isRTL ? this.u0.F.left + AndroidUtilities.dp(9.0f) : this.u0.F.right - AndroidUtilities.dp(9.0f));
                this.n0.setBounds(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
                this.n0.b(this.l0);
                if (this.Y1.updateThumbShaderMatrix()) {
                    this.o0.setShader(null);
                    if (this.Y1.getBitmap() != null && !this.Y1.getBitmap().isRecycled()) {
                        this.o0.setColor(AndroidUtilities.getDominantColor(this.Y1.getBitmap()));
                    } else if (this.Y1.getDrawable() instanceof v71) {
                        this.o0.setColor(((v71) this.Y1.getDrawable()).a.a());
                    } else {
                        this.o0.setColor(this.a2.c());
                    }
                } else {
                    ImageReceiver imageReceiver = this.Y1;
                    BitmapShader bitmapShader = imageReceiver.thumbShader;
                    if (bitmapShader != null) {
                        this.o0.setShader(bitmapShader);
                    } else {
                        BitmapShader bitmapShader2 = imageReceiver.staticThumbShader;
                        if (bitmapShader2 != null) {
                            this.o0.setShader(bitmapShader2);
                        }
                    }
                }
                canvas.save();
                float f17 = (1.0f - this.i0) * this.m0;
                o3Var = this.q2;
                if (o3Var != null) {
                    f17 *= 1.0f - o3Var.getProgress();
                }
                float f18 = dp14;
                float f19 = imageY22;
                canvas.scale(f17, f17, f18, f19);
                canvas.drawCircle(f18, f19, AndroidUtilities.dpf2(11.0f), this.o0);
                canvas.drawCircle(f18, f19, AndroidUtilities.dpf2(11.0f), this.p0);
                canvas.save();
                canvas.translate(f18 - AndroidUtilities.dpf2(11.0f), f19 - AndroidUtilities.dpf2(11.0f));
                this.n0.draw(canvas);
                canvas.restore();
                canvas.restore();
            }
            int i17 = this.l0;
            a31 a31Var2 = new a31(ApplicationLoader.applicationContext, null);
            a31Var2.m = true;
            a31Var2.b(i17);
            this.n0 = a31Var2;
            if (this.o0 == null) {
            }
            int imageY222 = (int) (this.Y1.getImageY2() - AndroidUtilities.dp(9.0f));
            int dp142 = (int) (!LocaleController.isRTL ? this.u0.F.left + AndroidUtilities.dp(9.0f) : this.u0.F.right - AndroidUtilities.dp(9.0f));
            this.n0.setBounds(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.n0.b(this.l0);
            if (this.Y1.updateThumbShaderMatrix()) {
            }
            canvas.save();
            float f172 = (1.0f - this.i0) * this.m0;
            o3Var = this.q2;
            if (o3Var != null) {
            }
            float f182 = dp142;
            float f192 = imageY222;
            canvas.scale(f172, f172, f182, f192);
            canvas.drawCircle(f182, f192, AndroidUtilities.dpf2(11.0f), this.o0);
            canvas.drawCircle(f182, f192, AndroidUtilities.dpf2(11.0f), this.p0);
            canvas.save();
            canvas.translate(f182 - AndroidUtilities.dpf2(11.0f), f192 - AndroidUtilities.dpf2(11.0f));
            this.n0.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
        TLRPC.User user = this.f2;
        if (user == null || MessagesController.isSupportUser(user) || this.f2.bot) {
            TLRPC.Chat chat2 = this.g2;
            if (chat2 != null) {
                boolean z15 = chat2.call_active && chat2.call_not_empty;
                this.v2 = z15;
                if ((z15 || this.q1 != 0.0f) && this.i0 < 1.0f) {
                    ci.o3 o3Var3 = this.q2;
                    float progress2 = (o3Var3 == null || !o3Var3.a.q) ? 1.0f : 1.0f - o3Var3.getProgress();
                    int dp15 = (int) (this.u0.F.bottom - AndroidUtilities.dp((this.r2 || SharedConfig.useThreeLinesLayout) ? 6.0f : 8.0f));
                    if (LocaleController.isRTL) {
                        float f20 = this.u0.F.left;
                        f7 = 0.10666667f;
                        if (!this.r2 && !SharedConfig.useThreeLinesLayout) {
                            f16 = 6.0f;
                        }
                        dp = (int) (f20 + AndroidUtilities.dp(f16));
                    } else {
                        f7 = 0.10666667f;
                        float f21 = this.u0.F.right;
                        if (!this.r2 && !SharedConfig.useThreeLinesLayout) {
                            f16 = 6.0f;
                        }
                        dp = (int) (f21 - AndroidUtilities.dp(f16));
                    }
                    if (this.i0 != 0.0f) {
                        canvas.save();
                        float f22 = 1.0f - this.i0;
                        canvas.scale(f22, f22, dp, dp15);
                    }
                    Paint paint2 = org.telegram.ui.ActionBar.i6.t0;
                    int i18 = org.telegram.ui.ActionBar.i6.d6;
                    paint2.setColor(org.telegram.ui.ActionBar.i6.w0(i18, this.J4));
                    float f23 = dp;
                    float f24 = dp15;
                    canvas.drawCircle(f23, f24, AndroidUtilities.dp(11.0f) * this.q1 * progress2, org.telegram.ui.ActionBar.i6.t0);
                    org.telegram.ui.ActionBar.i6.t0.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.T8, this.J4));
                    canvas.drawCircle(f23, f24, AndroidUtilities.dp(9.0f) * this.q1 * progress2, org.telegram.ui.ActionBar.i6.t0);
                    org.telegram.ui.ActionBar.i6.t0.setColor(org.telegram.ui.ActionBar.i6.w0(i18, this.J4));
                    if (!LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                        this.r1 = 0.65f;
                    }
                    int i19 = this.s1;
                    if (i19 != 0) {
                        i10 = 360928;
                        if (i19 != 1) {
                            if (i19 != 2) {
                                if (i19 == 3) {
                                    dp2 = AndroidUtilities.dp(3.0f) - (AndroidUtilities.dp(2.0f) * this.r1);
                                    dp3 = AndroidUtilities.dp(1.0f);
                                    dp4 = AndroidUtilities.dp(2.0f);
                                    f10 = this.r1;
                                } else if (i19 == 4) {
                                    dp2 = (AndroidUtilities.dp(4.0f) * this.r1) + AndroidUtilities.dp(1.0f);
                                    dp10 = AndroidUtilities.dp(3.0f);
                                    dp11 = AndroidUtilities.dp(2.0f);
                                    f13 = this.r1;
                                } else if (i19 == 5) {
                                    dp5 = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.r1);
                                    dp8 = AndroidUtilities.dp(1.0f);
                                    dp9 = AndroidUtilities.dp(4.0f);
                                    f12 = this.r1;
                                } else if (i19 == 6) {
                                    dp5 = AndroidUtilities.dp(1.0f) + (AndroidUtilities.dp(4.0f) * this.r1);
                                    dp6 = AndroidUtilities.dp(5.0f);
                                    dp7 = AndroidUtilities.dp(4.0f);
                                    f11 = this.r1;
                                } else {
                                    dp2 = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.r1);
                                    dp3 = AndroidUtilities.dp(1.0f);
                                    dp4 = AndroidUtilities.dp(2.0f);
                                    f10 = this.r1;
                                }
                                f14 = dp3 + (dp4 * f10);
                                if (this.q1 >= 1.0f || progress2 < 1.0f) {
                                    canvas.save();
                                    float f25 = this.q1 * progress2;
                                    canvas.scale(f25, f25, f23, f24);
                                }
                                z11 = true;
                                this.r4.set(dp - AndroidUtilities.dp(1.0f), f24 - dp2, AndroidUtilities.dp(1.0f) + dp, dp2 + f24);
                                canvas.drawRoundRect(this.r4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.t0);
                                float f26 = f24 - f14;
                                float f27 = f24 + f14;
                                this.r4.set(dp - AndroidUtilities.dp(5.0f), f26, dp - AndroidUtilities.dp(3.0f), f27);
                                canvas.drawRoundRect(this.r4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.t0);
                                this.r4.set(AndroidUtilities.dp(3.0f) + dp, f26, AndroidUtilities.dp(5.0f) + dp, f27);
                                canvas.drawRoundRect(this.r4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.t0);
                                if (this.q1 >= 1.0f || progress2 < 1.0f) {
                                    canvas.restore();
                                }
                                if (LiteMode.isEnabled(i10)) {
                                    float f28 = this.r1 + 0.04f;
                                    this.r1 = f28;
                                    if (f28 >= 1.0f) {
                                        this.r1 = 0.0f;
                                        int i20 = this.s1 + 1;
                                        this.s1 = i20;
                                        if (i20 >= 8) {
                                            this.s1 = 0;
                                        }
                                    }
                                    z13 = true;
                                }
                                if (this.v2) {
                                    float f29 = this.q1;
                                    if (f29 > 0.0f) {
                                        float f30 = f29 - f7;
                                        this.q1 = f30;
                                        if (f30 < 0.0f) {
                                            this.q1 = 0.0f;
                                        }
                                    }
                                } else {
                                    float f31 = this.q1;
                                    if (f31 < 1.0f) {
                                        float f32 = f31 + f7;
                                        this.q1 = f32;
                                        if (f32 > 1.0f) {
                                            this.q1 = 1.0f;
                                        }
                                    }
                                }
                                if (this.i0 != 0.0f) {
                                    canvas.restore();
                                }
                                if (this.w2) {
                                    float f33 = this.m0;
                                    if (f33 < 1.0f) {
                                        this.m0 = f33 + f7;
                                        z12 = z11;
                                    }
                                    z12 = z13;
                                } else {
                                    float f34 = this.m0;
                                    if (f34 > 0.0f) {
                                        this.m0 = f34 - f7;
                                        z12 = z11;
                                    }
                                    z12 = z13;
                                }
                                this.m0 = Utilities.clamp(this.m0, 1.0f, 0.0f);
                                return z12;
                            }
                            dp5 = AndroidUtilities.dp(1.0f) + (AndroidUtilities.dp(2.0f) * this.r1);
                            dp6 = AndroidUtilities.dp(5.0f);
                            dp7 = AndroidUtilities.dp(4.0f);
                            f11 = this.r1;
                            f15 = dp6 - (dp7 * f11);
                            dp2 = dp5;
                            f14 = f15;
                            if (this.q1 >= 1.0f) {
                            }
                            canvas.save();
                            float f252 = this.q1 * progress2;
                            canvas.scale(f252, f252, f23, f24);
                            z11 = true;
                            this.r4.set(dp - AndroidUtilities.dp(1.0f), f24 - dp2, AndroidUtilities.dp(1.0f) + dp, dp2 + f24);
                            canvas.drawRoundRect(this.r4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.t0);
                            float f262 = f24 - f14;
                            float f272 = f24 + f14;
                            this.r4.set(dp - AndroidUtilities.dp(5.0f), f262, dp - AndroidUtilities.dp(3.0f), f272);
                            canvas.drawRoundRect(this.r4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.t0);
                            this.r4.set(AndroidUtilities.dp(3.0f) + dp, f262, AndroidUtilities.dp(5.0f) + dp, f272);
                            canvas.drawRoundRect(this.r4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.t0);
                            if (this.q1 >= 1.0f) {
                            }
                            canvas.restore();
                            if (LiteMode.isEnabled(i10)) {
                            }
                            if (this.v2) {
                            }
                            if (this.i0 != 0.0f) {
                            }
                            if (this.w2) {
                            }
                            this.m0 = Utilities.clamp(this.m0, 1.0f, 0.0f);
                            return z12;
                        }
                        dp5 = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.r1);
                        dp8 = AndroidUtilities.dp(1.0f);
                        dp9 = AndroidUtilities.dp(4.0f);
                        f12 = this.r1;
                        f15 = dp8 + (dp9 * f12);
                        dp2 = dp5;
                        f14 = f15;
                        if (this.q1 >= 1.0f) {
                        }
                        canvas.save();
                        float f2522 = this.q1 * progress2;
                        canvas.scale(f2522, f2522, f23, f24);
                        z11 = true;
                        this.r4.set(dp - AndroidUtilities.dp(1.0f), f24 - dp2, AndroidUtilities.dp(1.0f) + dp, dp2 + f24);
                        canvas.drawRoundRect(this.r4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.t0);
                        float f2622 = f24 - f14;
                        float f2722 = f24 + f14;
                        this.r4.set(dp - AndroidUtilities.dp(5.0f), f2622, dp - AndroidUtilities.dp(3.0f), f2722);
                        canvas.drawRoundRect(this.r4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.t0);
                        this.r4.set(AndroidUtilities.dp(3.0f) + dp, f2622, AndroidUtilities.dp(5.0f) + dp, f2722);
                        canvas.drawRoundRect(this.r4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.t0);
                        if (this.q1 >= 1.0f) {
                        }
                        canvas.restore();
                        if (LiteMode.isEnabled(i10)) {
                        }
                        if (this.v2) {
                        }
                        if (this.i0 != 0.0f) {
                        }
                        if (this.w2) {
                        }
                        this.m0 = Utilities.clamp(this.m0, 1.0f, 0.0f);
                        return z12;
                    }
                    i10 = 360928;
                    dp2 = (AndroidUtilities.dp(4.0f) * this.r1) + AndroidUtilities.dp(1.0f);
                    dp10 = AndroidUtilities.dp(3.0f);
                    dp11 = AndroidUtilities.dp(2.0f);
                    f13 = this.r1;
                    f14 = dp10 - (dp11 * f13);
                    if (this.q1 >= 1.0f) {
                    }
                    canvas.save();
                    float f25222 = this.q1 * progress2;
                    canvas.scale(f25222, f25222, f23, f24);
                    z11 = true;
                    this.r4.set(dp - AndroidUtilities.dp(1.0f), f24 - dp2, AndroidUtilities.dp(1.0f) + dp, dp2 + f24);
                    canvas.drawRoundRect(this.r4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.t0);
                    float f26222 = f24 - f14;
                    float f27222 = f24 + f14;
                    this.r4.set(dp - AndroidUtilities.dp(5.0f), f26222, dp - AndroidUtilities.dp(3.0f), f27222);
                    canvas.drawRoundRect(this.r4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.t0);
                    this.r4.set(AndroidUtilities.dp(3.0f) + dp, f26222, AndroidUtilities.dp(5.0f) + dp, f27222);
                    canvas.drawRoundRect(this.r4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.t0);
                    if (this.q1 >= 1.0f) {
                    }
                    canvas.restore();
                    if (LiteMode.isEnabled(i10)) {
                    }
                    if (this.v2) {
                    }
                    if (this.i0 != 0.0f) {
                    }
                    if (this.w2) {
                    }
                    this.m0 = Utilities.clamp(this.m0, 1.0f, 0.0f);
                    return z12;
                }
            }
        } else {
            boolean R = R();
            this.B0 = R;
            if (R || this.p1 != 0.0f) {
                int dp16 = (int) (this.u0.F.bottom - AndroidUtilities.dp((this.r2 || SharedConfig.useThreeLinesLayout) ? 6.0f : 8.0f));
                if (LocaleController.isRTL) {
                    float f35 = this.u0.F.left;
                    if (!this.r2 && !SharedConfig.useThreeLinesLayout) {
                        f16 = 6.0f;
                    }
                    dp12 = f35 + AndroidUtilities.dp(f16);
                } else {
                    float f36 = this.u0.F.right;
                    if (!this.r2 && !SharedConfig.useThreeLinesLayout) {
                        f16 = 6.0f;
                    }
                    dp12 = f36 - AndroidUtilities.dp(f16);
                }
                int i21 = (int) dp12;
                org.telegram.ui.ActionBar.i6.t0.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, this.J4));
                float f37 = i21;
                float f38 = dp16;
                canvas.drawCircle(f37, f38, AndroidUtilities.dp(7.0f) * this.p1, org.telegram.ui.ActionBar.i6.t0);
                org.telegram.ui.ActionBar.i6.t0.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.T8, this.J4));
                canvas.drawCircle(f37, f38, AndroidUtilities.dp(5.0f) * this.p1, org.telegram.ui.ActionBar.i6.t0);
                if (R) {
                    float f39 = this.p1;
                    if (f39 < 1.0f) {
                        float f40 = f39 + 0.10666667f;
                        this.p1 = f40;
                        if (f40 > 1.0f) {
                            this.p1 = 1.0f;
                        }
                        z13 = true;
                    }
                } else {
                    float f41 = this.p1;
                    if (f41 > 0.0f) {
                        float f42 = f41 - 0.10666667f;
                        this.p1 = f42;
                        if (f42 < 0.0f) {
                            this.p1 = 0.0f;
                        }
                        z13 = true;
                    }
                }
            }
        }
        f7 = 0.10666667f;
        z11 = true;
        if (this.w2) {
        }
        this.m0 = Utilities.clamp(this.m0, 1.0f, 0.0f);
        return z12;
    }

    public final void D(Canvas canvas, boolean z10, boolean z11, boolean z12, boolean z13, float f7) {
        if (f7 != 0.0f || z13) {
            float f10 = (f7 * 0.5f) + 0.5f;
            if (z10) {
                a0.p(this.V2, this.W2, org.telegram.ui.ActionBar.i6.X0);
                if (f7 != 1.0f) {
                    canvas.save();
                    canvas.scale(f10, f10, org.telegram.ui.ActionBar.i6.X0.getBounds().centerX(), org.telegram.ui.ActionBar.i6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.i6.X0.setAlpha((int) (f7 * 255.0f));
                }
                org.telegram.ui.ActionBar.i6.X0.draw(canvas);
                if (f7 != 1.0f) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.i6.X0.setAlpha(255);
                }
                invalidate();
                return;
            }
            if (z12) {
                if (!z11) {
                    a0.p(this.U2, this.W2, org.telegram.ui.ActionBar.i6.T0);
                    if (f7 != 1.0f) {
                        canvas.save();
                        canvas.scale(f10, f10, org.telegram.ui.ActionBar.i6.T0.getBounds().centerX(), org.telegram.ui.ActionBar.i6.W0.getBounds().centerY());
                        org.telegram.ui.ActionBar.i6.T0.setAlpha((int) (f7 * 255.0f));
                    }
                    org.telegram.ui.ActionBar.i6.T0.draw(canvas);
                    if (f7 != 1.0f) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.i6.T0.setAlpha(255);
                        return;
                    }
                    return;
                }
                a0.p(this.X2, this.W2, org.telegram.ui.ActionBar.i6.W0);
                if (z13) {
                    canvas.save();
                    canvas.scale(f10, f10, org.telegram.ui.ActionBar.i6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.i6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.i6.W0.setAlpha((int) (f7 * 255.0f));
                }
                if (!z13 && f7 != 0.0f) {
                    canvas.save();
                    canvas.scale(f10, f10, org.telegram.ui.ActionBar.i6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.i6.W0.getBounds().centerY());
                    int i10 = (int) (255.0f * f7);
                    org.telegram.ui.ActionBar.i6.W0.setAlpha(i10);
                    org.telegram.ui.ActionBar.i6.V0.setAlpha(i10);
                }
                org.telegram.ui.ActionBar.i6.W0.draw(canvas);
                if (z13) {
                    canvas.restore();
                    canvas.save();
                    canvas.translate((1.0f - f7) * AndroidUtilities.dp(4.0f), 0.0f);
                }
                a0.p(this.T2, this.W2, org.telegram.ui.ActionBar.i6.V0);
                org.telegram.ui.ActionBar.i6.V0.draw(canvas);
                if (z13) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.i6.W0.setAlpha(255);
                }
                if (z13 || f7 == 0.0f) {
                    return;
                }
                canvas.restore();
                org.telegram.ui.ActionBar.i6.W0.setAlpha(255);
                org.telegram.ui.ActionBar.i6.V0.setAlpha(255);
            }
        }
    }

    public final void E(Canvas canvas, boolean z10, int i10, int i11, int i12, float f7, boolean z11) {
        float f10;
        Paint paint;
        boolean z12;
        RectF rectF;
        RectF rectF2;
        boolean z13 = Q() || P();
        if (!(this.G3 && this.L3) && this.V3 == 1.0f) {
            return;
        }
        float f11 = (this.S0 != 0 || this.T0) ? this.V3 : 1.0f - this.V3;
        int i13 = 255;
        if (z11) {
            if (this.T == null) {
                Paint paint2 = new Paint();
                this.T = paint2;
                paint2.setStyle(Paint.Style.STROKE);
                this.T.setStrokeWidth(AndroidUtilities.dp(2.0f));
                this.T.setStrokeJoin(Paint.Join.ROUND);
                this.T.setStrokeCap(Paint.Cap.ROUND);
            }
            f10 = 1.0f;
            this.T.setColor(i0.a.d(Color.alpha(r14) / 255.0f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false), i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.s9, false), 255)));
        } else {
            f10 = 1.0f;
        }
        if (this.P && this.N.read_inbox_max_id == 0) {
            if (this.S == null) {
                this.S = new Paint();
            }
            paint = this.S;
            int w02 = org.telegram.ui.ActionBar.i6.w0(z10 ? org.telegram.ui.ActionBar.i6.ek : org.telegram.ui.ActionBar.i6.dk, this.J4);
            paint.setColor(w02);
            org.telegram.ui.ActionBar.i6.M0.setColor(w02);
            i13 = z10 ? 30 : 40;
            z12 = true;
        } else {
            paint = (z10 || this.J0 != 0) ? org.telegram.ui.ActionBar.i6.y0 : org.telegram.ui.ActionBar.i6.w0;
            z12 = false;
        }
        StaticLayout staticLayout = this.Y3;
        RectF rectF3 = this.r4;
        if (staticLayout == null || this.S0 == 0) {
            if (this.S0 != 0) {
                staticLayout = this.X3;
            }
            paint.setAlpha((int) ((f10 - this.x3) * i13));
            org.telegram.ui.ActionBar.i6.M0.setAlpha((int) ((f10 - this.x3) * 255.0f));
            float f12 = i10;
            rectF3.set(i11, f12, AndroidUtilities.dp(12.666f) + this.O3 + i11, AndroidUtilities.dp(20.666f) + i10);
            int save = canvas.save();
            if (f7 != f10) {
                canvas.scale(f7, f7, rectF3.centerX(), rectF3.centerY());
            }
            if (f11 != f10) {
                canvas.scale(f11, f11, rectF3.centerX(), rectF3.centerY());
            }
            if (z13) {
                if (this.t4 == null || (rectF = this.u4) == null || !rectF.equals(rectF3)) {
                    RectF rectF4 = this.u4;
                    if (rectF4 == null) {
                        this.u4 = new RectF(rectF3);
                    } else {
                        rectF4.set(rectF3);
                    }
                    if (this.t4 == null) {
                        this.t4 = new Path();
                    }
                    w7.j0.a(this.t4, this.u4, AndroidUtilities.dp(10.33f));
                }
                canvas.drawPath(this.t4, paint);
                if (z11) {
                    canvas.drawPath(this.t4, this.T);
                }
            } else {
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), paint);
                if (z11) {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), this.T);
                }
            }
            if (staticLayout != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(6.333f) + i11, AndroidUtilities.dpf2(3.0f) + f12);
                staticLayout.draw(canvas);
                canvas.restore();
            }
            canvas.restoreToCount(save);
        } else {
            paint.setAlpha((int) ((f10 - this.x3) * i13));
            org.telegram.ui.ActionBar.i6.M0.setAlpha((int) ((f10 - this.x3) * 255.0f));
            float f13 = f11 * 2.0f;
            float f14 = f13 > f10 ? f10 : f13;
            float f15 = f10 - f14;
            float f16 = (i12 * f15) + (i11 * f14);
            float f17 = i10;
            rectF3.set(f16, f17, (this.P3 * f15) + (this.O3 * f14) + f16 + AndroidUtilities.dp(12.666f), AndroidUtilities.dp(20.666f) + i10);
            float interpolation = ((f11 <= 0.5f ? hs.g.getInterpolation(f13) : hs.i.getInterpolation(f10 - ((f11 - 0.5f) * 2.0f))) * 0.1f) + f10;
            canvas.save();
            float f18 = interpolation * f7;
            canvas.scale(f18, f18, rectF3.centerX(), rectF3.centerY());
            if (z13) {
                if (this.t4 == null || (rectF2 = this.u4) == null || !rectF2.equals(rectF3)) {
                    RectF rectF5 = this.u4;
                    if (rectF5 == null) {
                        this.u4 = new RectF(rectF3);
                    } else {
                        rectF5.set(rectF3);
                    }
                    if (this.t4 == null) {
                        this.t4 = new Path();
                    }
                    w7.j0.a(this.t4, this.u4, AndroidUtilities.dp(10.33f));
                }
                canvas.drawPath(this.t4, paint);
                if (z11) {
                    canvas.drawPath(this.t4, this.T);
                }
            } else {
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), paint);
                if (z11) {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), this.T);
                }
            }
            if (this.Z3 != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f16, AndroidUtilities.dpf2(3.0f) + f17);
                this.Z3.draw(canvas);
                canvas.restore();
            }
            int alpha = org.telegram.ui.ActionBar.i6.M0.getAlpha();
            float f19 = alpha;
            org.telegram.ui.ActionBar.i6.M0.setAlpha((int) (f19 * f14));
            if (this.a4 != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f16, AndroidUtilities.dpf2(3.0f) + ((this.R3 ? AndroidUtilities.dp(17.0f) : -AndroidUtilities.dp(17.0f)) * f15) + f17);
                this.a4.draw(canvas);
                canvas.restore();
            } else if (this.X3 != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f16, AndroidUtilities.dpf2(3.0f) + ((this.R3 ? AndroidUtilities.dp(17.0f) : -AndroidUtilities.dp(17.0f)) * f15) + f17);
                this.X3.draw(canvas);
                canvas.restore();
            }
            if (this.Y3 != null) {
                org.telegram.ui.ActionBar.i6.M0.setAlpha((int) (f19 * f15));
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f16, AndroidUtilities.dpf2(3.0f) + ((this.R3 ? -AndroidUtilities.dp(17.0f) : AndroidUtilities.dp(17.0f)) * f14) + f17);
                this.Y3.draw(canvas);
                canvas.restore();
            }
            org.telegram.ui.ActionBar.i6.M0.setAlpha(alpha);
            canvas.restore();
        }
        if (z12) {
            org.telegram.ui.ActionBar.i6.M0.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.W8, false));
        }
    }

    public boolean F() {
        return false;
    }

    public final CharSequence G() {
        TLRPC.User user;
        String string;
        int i10 = this.F0;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList<TLRPC.Dialog> dialogs = messagesController.getDialogs(this.J0);
        this.M0 = dialogs.size();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = dialogs.size();
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.Dialog dialog = dialogs.get(i11);
            if (!messagesController.isHiddenByUndo(dialog.id)) {
                TLRPC.Chat chat = null;
                if (DialogObject.isEncryptedDialog(dialog.id)) {
                    TLRPC.EncryptedChat l4 = org.telegram.messenger.q.l(messagesController, dialog.id);
                    user = l4 != null ? messagesController.getUser(Long.valueOf(l4.user_id)) : null;
                } else if (DialogObject.isUserDialog(dialog.id)) {
                    user = messagesController.getUser(Long.valueOf(dialog.id));
                } else {
                    chat = messagesController.getChat(Long.valueOf(-dialog.id));
                    user = null;
                }
                if (chat != null) {
                    string = chat.title.replace('\n', ' ');
                } else if (user == null) {
                    continue;
                } else {
                    string = UserObject.isDeleted(user) ? LocaleController.getString(R.string.HiddenName) : AndroidUtilities.escape(ContactsController.formatName(user.first_name, user.last_name).replace('\n', ' '));
                }
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                int length = spannableStringBuilder.length();
                int length2 = string.length() + length;
                spannableStringBuilder.append((CharSequence) string);
                if (dialog.unread_count > 0) {
                    spannableStringBuilder.setSpan(new m61(AndroidUtilities.bold(), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Y8, this.J4)), length, length2, 33);
                }
                if (spannableStringBuilder.length() > 150) {
                    break;
                }
            }
        }
        if (MessagesController.getInstance(i10).storiesController.C(true) > 0) {
            int max = Math.max(1, MessagesController.getInstance(i10).storiesController.C(true));
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Stories", max, new Object[0]));
        }
        return Emoji.replaceEmoji(spannableStringBuilder, org.telegram.ui.ActionBar.i6.F0[this.E0].getFontMetricsInt(), false);
    }

    public final CharSequence H() {
        TLRPC.User user;
        String string;
        MessagesController messagesController = MessagesController.getInstance(this.F0);
        ArrayList<TLRPC.Dialog> dialogsByCommunity = messagesController.getDialogsByCommunity(-this.H0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = dialogsByCommunity.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.Dialog dialog = dialogsByCommunity.get(i10);
            if (!messagesController.isHiddenByUndo(dialog.id)) {
                TLRPC.Chat chat = null;
                if (DialogObject.isEncryptedDialog(dialog.id)) {
                    TLRPC.EncryptedChat l4 = org.telegram.messenger.q.l(messagesController, dialog.id);
                    user = l4 != null ? messagesController.getUser(Long.valueOf(l4.user_id)) : null;
                } else if (DialogObject.isUserDialog(dialog.id)) {
                    user = messagesController.getUser(Long.valueOf(dialog.id));
                } else {
                    chat = messagesController.getChat(Long.valueOf(-dialog.id));
                    user = null;
                }
                if (chat != null) {
                    string = chat.title.replace('\n', ' ');
                } else if (user == null) {
                    continue;
                } else {
                    string = UserObject.isDeleted(user) ? LocaleController.getString(R.string.HiddenName) : AndroidUtilities.escape(ContactsController.formatName(user.first_name, user.last_name).replace('\n', ' '));
                }
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                int length = spannableStringBuilder.length();
                int length2 = string.length() + length;
                spannableStringBuilder.append((CharSequence) string);
                if (dialog.unread_count > 0) {
                    spannableStringBuilder.setSpan(new m61(AndroidUtilities.bold(), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Y8, this.J4)), length, length2, 33);
                }
                if (spannableStringBuilder.length() > 150) {
                    break;
                }
            }
        }
        return Emoji.replaceEmoji(spannableStringBuilder, org.telegram.ui.ActionBar.i6.F0[this.E0].getFontMetricsInt(), false);
    }

    public final CharSequence J() {
        if (this.N4 == null) {
            this.N4 = new r2(this);
        }
        r2.a(this.N4, this.F0, this.f1, this.g2);
        this.N4.getClass();
        r2 r2Var = this.N4;
        this.M4 = r2Var.c;
        this.f0 = r2Var.d;
        return r2Var.g;
    }

    public final ColorFilter K(int i10, int i11) {
        if (this.X4 == null) {
            this.Y4 = new int[4];
            this.X4 = new ColorFilter[4];
        }
        if (i11 != this.Y4[i10] || this.X4[i10] == null) {
            ColorFilter[] colorFilterArr = this.X4;
            this.Y4[i10] = i11;
            colorFilterArr[i10] = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
        }
        return this.X4[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.view.View, org.telegram.ui.Cells.s2] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.CharSequence] */
    public final SpannableStringBuilder L(int i10, CharSequence charSequence, String str, boolean z10) {
        CharSequence replaceNewLines;
        TLRPC.Message message;
        CharSequence charSequence2;
        String formatPluralString;
        CharSequence charSequence3;
        SpannableStringBuilder valueOf;
        MessageObject captionMessage = getCaptionMessage();
        MessageObject messageObject = this.f1;
        CharSequence charSequence4 = messageObject != null ? messageObject.messageText : null;
        this.e0 = true;
        if (!TextUtils.isEmpty(str)) {
            return I(str, charSequence, i10);
        }
        MessageObject messageObject2 = this.f1;
        TLRPC.Message message2 = messageObject2.messageOwner;
        if (message2 instanceof TLRPC.TL_messageService) {
            CharSequence charSequence5 = messageObject2.messageTextShort;
            if (charSequence5 == null || ((message2.action instanceof TLRPC.TL_messageActionTopicCreate) && this.P)) {
                charSequence5 = messageObject2.messageText;
            }
            if (MessageObject.isTopicActionMessage(messageObject2)) {
                valueOf = I(charSequence5, charSequence, i10);
                if (this.f1.topicIconDrawable[0] instanceof ng.a) {
                    int i11 = this.F0;
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i11).getTopicsController().findTopic(-this.f1.getDialogId(), MessageObject.getTopicId(i11, this.f1.messageOwner, true));
                    if (findTopic != null) {
                        ((ng.a) this.f1.topicIconDrawable[0]).b(findTopic.icon_color);
                    }
                }
            } else {
                this.e0 = false;
                valueOf = SpannableStringBuilder.valueOf(charSequence5);
            }
            if (z10) {
                t(valueOf);
            }
            return valueOf;
        }
        if (captionMessage != null && (charSequence3 = captionMessage.caption) != null) {
            String charSequence6 = charSequence3.toString();
            String str2 = !this.V ? "" : captionMessage.isVideo() ? "📹 " : captionMessage.isVoice() ? "🎤 " : captionMessage.isMusic() ? "🎧 " : captionMessage.isPhoto() ? "🖼 " : "📎 ";
            if (captionMessage.hasHighlightedWords() && !TextUtils.isEmpty(captionMessage.messageOwner.message)) {
                CharSequence charSequence7 = captionMessage.messageTrimmedToHighlight;
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.I + 47);
                if (this.W) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth = (int) (measuredWidth - this.a0.measureText(charSequence.toString()));
                    }
                    measuredWidth = (int) (measuredWidth - this.a0.measureText(": "));
                }
                if (measuredWidth > 0 && captionMessage.messageTrimmedToHighlightCut) {
                    charSequence7 = AndroidUtilities.ellipsizeCenterEnd(charSequence7, captionMessage.highlightedWords.get(0), measuredWidth, this.a0, 130);
                }
                return new SpannableStringBuilder(str2).append(charSequence7);
            }
            int length = charSequence6.length();
            CharSequence charSequence8 = charSequence6;
            if (length > 150) {
                charSequence8 = charSequence6.subSequence(0, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
            }
            SpannableString spannableString = new SpannableString(charSequence8);
            captionMessage.spoilLoginCode();
            MediaDataController.addTextStyleRuns(captionMessage.messageOwner.entities, charSequence8, spannableString, 264);
            TLRPC.Message message3 = captionMessage.messageOwner;
            if (message3 != null) {
                ArrayList<TLRPC.MessageEntity> arrayList = message3.entities;
                TextPaint textPaint = this.a0;
                MediaDataController.addAnimatedEmojiSpans(arrayList, spannableString, textPaint != null ? textPaint.getFontMetricsInt() : null);
            }
            CharSequence append = new SpannableStringBuilder(str2).append(AndroidUtilities.replaceNewLines(spannableString));
            if (z10) {
                append = t(append);
            }
            return I(append, charSequence, i10);
        }
        TL_iv.RichMessage richMessage = message2.rich_message;
        org.telegram.ui.ActionBar.e6 e6Var = this.J4;
        if (richMessage != null) {
            boolean isBlueBlock = richMessage.blocks.size() == 1 ? MessageObject.isBlueBlock(this.f1.messageOwner.rich_message.blocks.get(0)) : false;
            SpannableStringBuilder I = I(this.f1.messageText, charSequence, i10);
            if (isBlueBlock && !Q()) {
                try {
                    I.setSpan(new u10(org.telegram.ui.ActionBar.i6.p9, e6Var), this.W ? charSequence.length() + 2 : 0, I.length(), 33);
                    return I;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            return I;
        }
        if (message2.media == null || messageObject2.isMediaEmpty()) {
            MessageObject messageObject3 = this.f1;
            String str3 = messageObject3.messageOwner.message;
            if (str3 == null) {
                return new SpannableStringBuilder();
            }
            if (messageObject3.hasHighlightedWords()) {
                CharSequence charSequence9 = this.f1.messageTrimmedToHighlight;
                replaceNewLines = str3;
                if (charSequence9 != null) {
                    replaceNewLines = charSequence9;
                }
                int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(this.I + 33);
                if (this.W) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth2 = (int) (measuredWidth2 - this.a0.measureText(charSequence.toString()));
                    }
                    measuredWidth2 = (int) (measuredWidth2 - this.a0.measureText(": "));
                }
                if (measuredWidth2 > 0) {
                    replaceNewLines = AndroidUtilities.ellipsizeCenterEnd(replaceNewLines, this.f1.highlightedWords.get(0), measuredWidth2, this.a0, 130);
                }
            } else {
                int length2 = str3.length();
                CharSequence charSequence10 = str3;
                if (length2 > 150) {
                    charSequence10 = str3.subSequence(0, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                }
                replaceNewLines = AndroidUtilities.replaceNewLines(charSequence10);
            }
            ?? spannableString2 = new SpannableString(replaceNewLines);
            MessageObject messageObject4 = this.f1;
            if (messageObject4 != null) {
                messageObject4.spoilLoginCode();
            }
            MediaDataController.addTextStyleRuns(this.f1, (Spannable) spannableString2, 264);
            MessageObject messageObject5 = this.f1;
            if (messageObject5 != null && (message = messageObject5.messageOwner) != null) {
                ArrayList<TLRPC.MessageEntity> arrayList2 = message.entities;
                TextPaint textPaint2 = this.a0;
                MediaDataController.addAnimatedEmojiSpans(arrayList2, spannableString2, textPaint2 != null ? textPaint2.getFontMetricsInt() : null);
            }
            if (z10) {
                spannableString2 = t(spannableString2);
            }
            return I(spannableString2, charSequence, i10);
        }
        this.a0 = org.telegram.ui.ActionBar.i6.H0[this.E0];
        int i12 = org.telegram.ui.ActionBar.i6.o9;
        MessageObject messageObject6 = this.f1;
        TLRPC.MessageMedia messageMedia = messageObject6.messageOwner.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
            TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
            if (tL_textWithEntities == null || tL_textWithEntities.entities == null) {
                charSequence2 = mh.a.a(R.drawable.dialog_media_poll_20, tL_textWithEntities.text, true);
            } else {
                SpannableString spannableString3 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString3);
                MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString3, org.telegram.ui.ActionBar.i6.F0[this.E0].getFontMetricsInt());
                charSequence2 = mh.a.a(R.drawable.dialog_media_poll_20, spannableString3, true);
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
            if (tL_textWithEntities3 == null || tL_textWithEntities3.entities == null) {
                charSequence2 = mh.a.a(R.drawable.dialog_media_checklist_20, tL_textWithEntities3.text, true);
            } else {
                SpannableString spannableString4 = new SpannableString(tL_messageMediaToDo.todo.title.text.replace('\n', ' '));
                TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                MediaDataController.addTextStyleRuns(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString4);
                MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString4, org.telegram.ui.ActionBar.i6.F0[this.E0].getFontMetricsInt());
                charSequence2 = mh.a.a(R.drawable.dialog_media_checklist_20, spannableString4, true);
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
            charSequence2 = mh.a.a(R.drawable.dialog_media_game_20, messageMedia.game.title, true);
        } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
            charSequence2 = messageMedia.title;
        } else if (messageObject6.type == 14) {
            charSequence2 = c1.i("🎧 \u2068", messageObject6.getMusicAuthor(), " - ", this.f1.getMusicTitle(), "\u2069");
        } else if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia).extended_media.size();
            charSequence2 = yh.p7.R0(LocaleController.formatString(R.string.AttachPaidMedia, this.S1 ? size > 1 ? LocaleController.formatPluralString("Media", size, new Object[0]) : LocaleController.getString(R.string.AttachVideo) : size > 1 ? LocaleController.formatPluralString("Photos", size, new Object[0]) : LocaleController.getString(R.string.AttachPhoto)));
            i12 = org.telegram.ui.ActionBar.i6.p9;
        } else if (this.R1 > 1) {
            if (this.S1) {
                ArrayList arrayList3 = this.g1;
                formatPluralString = LocaleController.formatPluralString("Media", arrayList3 == null ? 0 : arrayList3.size(), new Object[0]);
            } else {
                ArrayList arrayList4 = this.g1;
                formatPluralString = LocaleController.formatPluralString("Photos", arrayList4 == null ? 0 : arrayList4.size(), new Object[0]);
            }
            charSequence2 = formatPluralString;
            i12 = org.telegram.ui.ActionBar.i6.p9;
        } else {
            charSequence2 = charSequence4.toString();
            i12 = org.telegram.ui.ActionBar.i6.p9;
        }
        if (charSequence2 instanceof String) {
            charSequence2 = ((String) charSequence2).replace('\n', ' ');
        }
        if (z10) {
            charSequence2 = t(charSequence2);
        }
        SpannableStringBuilder I2 = I(charSequence2, charSequence, i10);
        if (!Q()) {
            try {
                I2.setSpan(new u10(i12, e6Var), this.W ? charSequence.length() + 2 : 0, I2.length(), 33);
                return I2;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return I2;
    }

    public final boolean M() {
        xs xsVar = this.t0;
        return (xsVar == null || xsVar.c.isEmpty()) ? false : true;
    }

    public final boolean N() {
        if (ChatObject.isCommunity(this.g2)) {
            return !this.e1;
        }
        if (this.P) {
            return this.a1;
        }
        TLRPC.Chat chat = this.g2;
        return (chat != null && chat.forum && this.N == null) ? !this.d1 : this.Z0;
    }

    public final boolean O() {
        return this.J0 > 0;
    }

    public final boolean P() {
        return this.J0 != 0;
    }

    public boolean Q() {
        TLRPC.Chat chat;
        if (O() || this.P0 || (chat = this.g2) == null) {
            return false;
        }
        return (chat.forum || (ChatObject.isMonoForum(chat) && ChatObject.canManageMonoForum(this.F0, this.g2))) && !this.P;
    }

    public final boolean R() {
        TLRPC.User user;
        if (Q() || this.u0.w || (user = this.f2) == null || user.self) {
            return false;
        }
        TLRPC.UserStatus userStatus = user.status;
        int i10 = this.F0;
        if (userStatus != null && userStatus.expires <= 0 && MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(this.f2.id))) {
            return true;
        }
        TLRPC.UserStatus userStatus2 = this.f2.status;
        return userStatus2 != null && userStatus2.expires > ConnectionsManager.getInstance(i10).getCurrentTime();
    }

    public final boolean S(float f7) {
        return !LocaleController.isRTL ? f7 >= 0.0f && f7 < ((float) AndroidUtilities.dp(60.0f)) : f7 >= ((float) (getMeasuredWidth() - AndroidUtilities.dp(60.0f))) && f7 < ((float) getMeasuredWidth());
    }

    public final void T(boolean z10, boolean z11) {
        if ((!getIsPinned() && z10) || this.y3 == z10) {
            if (getIsPinned()) {
                return;
            }
            this.y3 = false;
        } else {
            this.y3 = z10;
            if (z11) {
                this.x3 = z10 ? 0.0f : 1.0f;
            } else {
                this.x3 = z10 ? 1.0f : 0.0f;
            }
            invalidate();
        }
    }

    public final void U() {
        boolean z10 = SharedConfig.archiveHidden;
        this.m1 = z10;
        float f7 = z10 ? 0.0f : 1.0f;
        this.D1 = f7;
        this.a2.o = f7;
        this.t1 = 0.0f;
        this.x1 = false;
        this.x3 = (getIsPinned() && this.y3) ? 1.0f : 0.0f;
        this.w3 = true;
        this.o1 = 0.0f;
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        org.telegram.ui.Components.q5 q5Var = this.n4;
        if (q5Var != null && this.w3) {
            q5Var.a();
        }
        org.telegram.ui.Components.q5 q5Var2 = this.o4;
        if (q5Var2 == null || !this.w3) {
            return;
        }
        q5Var2.a();
    }

    public final void V(boolean z10, boolean z11) {
        ci.o3 o3Var = this.q2;
        if (o3Var != null || z10) {
            if (o3Var == null) {
                ci.o3 o3Var2 = new ci.o3(this, getContext(), this.J4, 1);
                this.q2 = o3Var2;
                o3Var2.b(-1, org.telegram.ui.ActionBar.i6.d6, org.telegram.ui.ActionBar.i6.k7);
                this.q2.setDrawUnchecked(false);
                this.q2.setDrawBackgroundAsArc(3);
                addView(this.q2);
            }
            this.q2.a(z10, z11);
            y();
        }
    }

    public final void W(long j3, MessageObject messageObject, int i10, boolean z10, boolean z11) {
        if (this.H0 != j3) {
            this.x4 = -1;
        }
        this.H0 = j3;
        this.B4 = System.currentTimeMillis();
        this.f1 = messageObject;
        this.u2 = z10;
        this.N0 = false;
        this.R0 = i10;
        if (messageObject != null) {
            int i11 = messageObject.messageOwner.edit_date;
        }
        this.S0 = 0;
        this.T0 = false;
        this.l1 = messageObject != null ? messageObject.getId() : 0;
        this.U0 = 0;
        this.V0 = 0;
        this.W0 = 0;
        this.X0 = messageObject != null && messageObject.isUnread();
        MessageObject messageObject2 = this.f1;
        if (messageObject2 != null) {
            this.Y0 = messageObject2.messageOwner.send_state;
        }
        b0(0, z11);
    }

    public final void X(TLRPC.Dialog dialog, int i10, int i11) {
        if (this.H0 != dialog.id) {
            ValueAnimator valueAnimator = this.A4;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.A4.cancel();
            }
            this.z4 = false;
            this.x4 = -1;
        }
        this.H0 = dialog.id;
        this.B4 = System.currentTimeMillis();
        this.N0 = true;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            this.K0 = dialog.community_id;
        } else {
            this.K0 = 0L;
        }
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            this.J0 = ((TLRPC.TL_dialogFolder) dialog).folder.id;
            nj0 nj0Var = this.e2;
            if (nj0Var != null) {
                nj0Var.H = this;
                nj0Var.i();
            }
        } else {
            this.J0 = 0;
        }
        this.j1 = i10;
        boolean z10 = i10 == 3;
        Runnable runnable = this.Z4;
        if (z10 != (runnable != null)) {
            if (!z10 && runnable != null) {
                runnable.run();
                this.Z4 = null;
            } else if (z10) {
                this.Z4 = NotificationCenter.getInstance(this.F0).listen(this, NotificationCenter.userIsPremiumBlockedUpadted, new j2(this, 0));
            }
        }
        if (this.t0 == null) {
            this.t0 = new xs(this);
        }
        this.k1 = i11;
        this.l1 = 0;
        if (b0(0, false)) {
            requestLayout();
        }
        x();
        w();
        v();
        y();
    }

    public final void Y(TLRPC.TL_forumTopic tL_forumTopic, long j3, MessageObject messageObject, boolean z10, boolean z11) {
        nj0 nj0Var;
        this.N = tL_forumTopic;
        this.P = tL_forumTopic != null;
        if (this.H0 != j3) {
            this.x4 = -1;
        }
        Drawable drawable = messageObject.topicIconDrawable[0];
        if (drawable instanceof ng.a) {
            ((ng.a) drawable).b(tL_forumTopic.icon_color);
        }
        this.H0 = j3;
        this.B4 = System.currentTimeMillis();
        this.f1 = messageObject;
        this.N0 = false;
        this.g0 = z10;
        this.R0 = messageObject.messageOwner.date;
        this.T0 = false;
        this.l1 = messageObject.getId();
        this.X0 = messageObject.isUnread();
        MessageObject messageObject2 = this.f1;
        if (messageObject2 != null) {
            this.Y0 = messageObject2.messageOwner.send_state;
        }
        if (!z11) {
            this.x4 = -1;
        }
        if (tL_forumTopic != null) {
            this.g1 = tL_forumTopic.groupedMessages;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.N;
        if (tL_forumTopic2 != null && tL_forumTopic2.id == 1 && (nj0Var = this.e2) != null) {
            nj0Var.H = this;
            nj0Var.i();
        }
        b0(0, z11);
    }

    public final void Z(MessageObject messageObject, int i10) {
        TLRPC.MessageMedia messageMedia;
        ArrayList<TLRPC.PhotoSize> arrayList = messageObject.photoThumbs;
        TLObject tLObject = messageObject.photoThumbsObject;
        if (messageObject.isStoryMedia()) {
            TL_stories.StoryItem storyItem = messageObject.messageOwner.media.storyItem;
            if (storyItem == null || (messageMedia = storyItem.media) == null) {
                return;
            }
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                arrayList = document.thumbs;
                tLObject = document;
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    arrayList = photo.sizes;
                    tLObject = photo;
                }
            }
        }
        TLRPC.PhotoSize strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
        if (strippedPhotoSize == null) {
            strippedPhotoSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 40);
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize(), false, null, true);
        TLRPC.PhotoSize photoSize = strippedPhotoSize != closestPhotoSizeWithSize ? closestPhotoSizeWithSize : null;
        if (photoSize == null || !DownloadController.getInstance(this.F0).canDownloadMedia(messageObject)) {
            photoSize = strippedPhotoSize;
        }
        if (strippedPhotoSize != null) {
            this.S1 = this.S1 || messageObject.isVideo() || messageObject.isRoundVideo();
            int i11 = this.R1;
            if (i11 < 3) {
                this.R1 = i11 + 1;
                this.W1[i10] = (messageObject.isVideo() || messageObject.isRoundVideo()) && !messageObject.hasMediaSpoilers();
                this.X1[i10] = messageObject.hasMediaSpoilers();
                int i12 = (messageObject.type != 1 || photoSize == null) ? 0 : photoSize.size;
                String str = messageObject.hasMediaSpoilers() ? "5_5_b" : "20_20";
                ImageReceiver[] imageReceiverArr = this.V1;
                String str2 = str;
                imageReceiverArr[i10].setImage(ImageLocation.getForObject(photoSize, tLObject), str2, ImageLocation.getForObject(strippedPhotoSize, tLObject), str2, i12, null, messageObject, 0);
                imageReceiverArr[i10].setRoundRadius(AndroidUtilities.dp(messageObject.isRoundVideo() ? 18.0f : 2.0f));
                this.V = false;
            }
        }
    }

    public final void a0() {
        nj0 nj0Var = this.e2;
        if (nj0Var != null) {
            if (this.P) {
                nj0Var.K = AndroidUtilities.dp(24.0f);
                this.e2.L = AndroidUtilities.dp(24.0f);
                this.e2.M = 0.0f;
            } else {
                k2 k2Var = this.u0;
                RectF rectF = k2Var.F;
                RectF rectF2 = k2Var.F;
                nj0Var.K = rectF.centerY();
                this.e2.L = rectF2.centerX();
                this.e2.M = rectF2.width() / 2.0f;
                if (!MessagesController.getInstance(this.F0).getStoriesController().h.isEmpty()) {
                    this.e2.M -= AndroidUtilities.dpf2(3.5f);
                }
                nj0 nj0Var2 = this.e2;
                this.Y1.getBitmapWidth();
                nj0Var2.getClass();
            }
            nj0 nj0Var3 = this.e2;
            if (nj0Var3.E || nj0Var3.I == null) {
                return;
            }
            AnimatorSet animatorSet = nj0Var3.B;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                nj0Var3.B.cancel();
            }
            nj0Var3.E = true;
            nj0Var3.F = true;
            nj0Var3.D = 0.0f;
            nj0Var3.I.getTranslationY();
            AndroidUtilities.dp(100.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new lj0(nj0Var3, 5));
            ofFloat.setInterpolator(hs.h);
            ofFloat.setDuration(250L);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            int i10 = 6;
            ofFloat2.addUpdateListener(new lj0(nj0Var3, i10));
            hs hsVar = hs.j;
            ofFloat2.setInterpolator(hsVar);
            ofFloat2.setDuration(150L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat3.addUpdateListener(new lj0(nj0Var3, 7));
            ofFloat3.setInterpolator(hsVar);
            ofFloat3.setDuration(135L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            nj0Var3.B = animatorSet2;
            animatorSet2.addListener(new vd0(nj0Var3, i10));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3);
            animatorSet3.setStartDelay(180L);
            nj0Var3.B.playTogether(ofFloat, animatorSet3);
            nj0Var3.B.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0a3f  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0a50 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0aaa  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0ab9  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0abb  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0a4d  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0660  */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b0(int i10, boolean z10) {
        boolean z11;
        int i11;
        long j3;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i12;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int i13;
        long j10;
        ImageReceiver imageReceiver;
        boolean z20;
        boolean z21;
        int i14;
        MessageObject messageObject;
        boolean z22;
        boolean z23;
        int i15;
        float f7;
        boolean z24;
        int dp;
        TLRPC.User user;
        TLRPC.Chat chat;
        boolean z25;
        TLRPC.Chat chat2;
        ArrayList O3;
        MessageObject messageObject2;
        boolean z26;
        MessageObject messageObject3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        TLRPC.Chat chat3;
        HashMap hashMap;
        MessageObject messageObject4;
        long j11;
        boolean z27;
        boolean z28;
        int i21;
        MessagesController.DialogFilter dialogFilter;
        ws wsVar;
        MessagesController.DialogFilter dialogFilter2;
        String str;
        boolean z29;
        boolean Q = Q();
        boolean z30 = false;
        this.l0 = 0;
        n2 n2Var = this.G0;
        ImageReceiver imageReceiver2 = this.Y1;
        org.telegram.ui.Components.j9 j9Var = this.a2;
        int i22 = this.F0;
        if (n2Var != null) {
            this.R0 = n2Var.h;
            int i23 = n2Var.d;
            this.X0 = i23 != 0;
            this.S0 = i23;
            this.A3 = n2Var.e;
            this.Z0 = n2Var.f;
            this.d1 = false;
            this.e1 = false;
            j9Var.n(n2Var.c, n2Var.a, null);
            if (this.F) {
                imageReceiver2.setImage(null, "50_50", this.G, null, 0L);
            } else {
                imageReceiver2.setImage(null, "50_50", j9Var, null, 0L);
            }
            int i24 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.V1;
                if (i24 >= imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i24].setImageBitmap((Drawable) null);
                i24++;
            }
            this.y = false;
            this.E = false;
            imageReceiver2.setRoundRadius(AndroidUtilities.dp(26.0f));
            this.b1 = false;
            z12 = Q;
            z22 = false;
            z23 = false;
            i15 = i22;
            f7 = 0.0f;
        } else {
            int i25 = this.S0;
            boolean z31 = this.V0 != 0;
            boolean z32 = this.T0;
            this.d1 = false;
            this.e1 = false;
            this.H4 = -1;
            if (this.N0) {
                j3 = 0;
                TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i22).dialogs_dict.f(this.H0);
                if (dialog != null) {
                    this.H4 = dialog.read_outbox_max_id;
                    this.l0 = dialog.ttl_period;
                    if (i10 == 0) {
                        boolean z33 = true;
                        this.h1 = MessagesController.getInstance(i22).isClearingDialog(dialog.id);
                        ArrayList arrayList = (ArrayList) MessagesController.getInstance(i22).dialogMessage.f(dialog.id);
                        this.g1 = arrayList;
                        MessageObject messageObject5 = (arrayList == null || arrayList.size() <= 0) ? null : (MessageObject) this.g1.get(0);
                        this.f1 = messageObject5;
                        this.X0 = messageObject5 != null && messageObject5.isUnread();
                        TLRPC.Chat chat4 = MessagesController.getInstance(i22).getChat(Long.valueOf(-dialog.id));
                        if (chat4 == null || !(chat4.forum || (chat4.monoforum && ChatObject.canManageMonoForum(i22, chat4)))) {
                            i11 = i25;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                this.S0 = MessagesStorage.getInstance(i22).getArchiveUnreadCount();
                                this.U0 = 0;
                                this.V0 = 0;
                                this.W0 = 0;
                            } else if (dialog instanceof TLRPC.TL_dialogCommunity) {
                                MessagesController.UnreadCounts communityUnreadCount = MessagesController.getInstance(i22).getCommunityUnreadCount(-dialog.id);
                                this.S0 = communityUnreadCount.unreadCount;
                                this.U0 = communityUnreadCount.mentionCount;
                                this.V0 = communityUnreadCount.reactionMentionCount;
                                this.W0 = communityUnreadCount.pollVotesMentionCount;
                                this.e1 = communityUnreadCount.hasUnmutedUnreadDialogs;
                            } else {
                                this.S0 = dialog.unread_count;
                                this.U0 = dialog.unread_mentions_count;
                                this.V0 = dialog.unread_reactions_count;
                                this.W0 = dialog.unread_poll_votes_count;
                            }
                        } else {
                            i11 = i25;
                            int[] forumUnreadCount = MessagesController.getInstance(i22).getTopicsController().getForumUnreadCount(chat4.id);
                            this.S0 = forumUnreadCount[0];
                            this.U0 = forumUnreadCount[1];
                            this.V0 = forumUnreadCount[2];
                            this.d1 = forumUnreadCount[3] != 0;
                            this.W0 = forumUnreadCount[4];
                        }
                        if (ChatObject.isMonoForum(chat4)) {
                            this.U0 = 0;
                        }
                        this.T0 = dialog.unread_mark;
                        MessageObject messageObject6 = this.f1;
                        if (messageObject6 != null) {
                            int i26 = messageObject6.messageOwner.edit_date;
                        }
                        this.R0 = dialog.last_message_date;
                        int i27 = this.j1;
                        if (i27 == 7 || i27 == 8) {
                            MessagesController.DialogFilter dialogFilter3 = MessagesController.getInstance(i22).selectedDialogFilter[this.j1 == 8 ? (char) 1 : (char) 0];
                            this.A3 = dialogFilter3 != null && dialogFilter3.pinnedDialogs.indexOfKey(dialog.id) >= 0;
                        } else {
                            this.A3 = this.J0 == 0 && dialog.pinned;
                        }
                        MessageObject messageObject7 = this.f1;
                        z29 = z33;
                        if (messageObject7 != null) {
                            this.Y0 = messageObject7.messageOwner.send_state;
                            z29 = z33;
                        }
                    } else {
                        z29 = true;
                        i11 = i25;
                    }
                } else {
                    z29 = true;
                    i11 = i25;
                    this.S0 = 0;
                    this.U0 = 0;
                    this.V0 = 0;
                    this.W0 = 0;
                    this.R0 = 0;
                    this.h1 = false;
                }
                z11 = z29;
                if (this.H0 != 0) {
                    int i28 = l41.R;
                    z11 = z29;
                }
            } else {
                z11 = 1;
                i11 = i25;
                j3 = 0;
                this.A3 = false;
            }
            TLRPC.TL_forumTopic tL_forumTopic = this.N;
            if (tL_forumTopic != null) {
                this.S0 = tL_forumTopic.unread_count;
                this.U0 = tL_forumTopic.unread_mentions_count;
                this.V0 = tL_forumTopic.unread_reactions_count;
                this.W0 = tL_forumTopic.unread_poll_votes_count;
            }
            if (this.j1 == 2) {
                this.A3 = false;
            }
            xs xsVar = this.t0;
            if (xsVar != null) {
                boolean isEmpty = xsVar.c.isEmpty();
                xs xsVar2 = this.t0;
                int i29 = this.j1;
                long j12 = this.H0;
                s2 s2Var = xsVar2.a;
                ArrayList arrayList2 = xsVar2.b;
                ArrayList arrayList3 = xsVar2.c;
                z13 = false;
                AccountInstance accountInstance = AccountInstance.getInstance(i22);
                z14 = z31;
                MessagesController messagesController = MessagesController.getInstance(i22);
                z15 = z32;
                if (messagesController.folderTags && accountInstance.getUserConfig().isPremium()) {
                    ArrayList<MessagesController.DialogFilter> arrayList4 = messagesController.dialogFilters;
                    i12 = i11;
                    if (i29 == 7) {
                        dialogFilter = messagesController.selectedDialogFilter[0];
                        i21 = 8;
                    } else {
                        i21 = 8;
                        dialogFilter = i29 == 8 ? messagesController.selectedDialogFilter[z11] : null;
                    }
                    arrayList2.clear();
                    z12 = Q;
                    if (i29 == 0 || i29 == 7 || i29 == i21) {
                        for (int i30 = 0; i30 < arrayList4.size(); i30++) {
                            MessagesController.DialogFilter dialogFilter4 = arrayList4.get(i30);
                            if (dialogFilter4 != null && dialogFilter4 != dialogFilter && dialogFilter4.color >= 0 && dialogFilter4.includesDialog(accountInstance, j12)) {
                                arrayList2.add(dialogFilter4);
                            }
                        }
                    }
                    int i31 = 0;
                    z28 = false;
                    while (i31 < arrayList3.size()) {
                        ws wsVar2 = (ws) arrayList3.get(i31);
                        int i32 = 0;
                        while (true) {
                            if (i32 >= arrayList2.size()) {
                                dialogFilter2 = null;
                                break;
                            }
                            if (((MessagesController.DialogFilter) arrayList2.get(i32)).id == wsVar2.a) {
                                dialogFilter2 = (MessagesController.DialogFilter) arrayList2.get(i32);
                                break;
                            }
                            i32++;
                        }
                        if (dialogFilter2 == null) {
                            arrayList3.remove(i31);
                            i31--;
                        } else {
                            if (dialogFilter2.color != wsVar2.b || ((str = dialogFilter2.name) != null && wsVar2.c != null && str.length() != wsVar2.c.k().length())) {
                                arrayList3.set(i31, ws.b(s2Var, dialogFilter2));
                            }
                            i31++;
                        }
                        z28 = z11;
                        i31++;
                    }
                    for (int i33 = 0; i33 < arrayList2.size(); i33++) {
                        MessagesController.DialogFilter dialogFilter5 = (MessagesController.DialogFilter) arrayList2.get(i33);
                        int i34 = 0;
                        while (true) {
                            if (i34 >= arrayList3.size()) {
                                wsVar = null;
                                break;
                            }
                            if (((ws) arrayList3.get(i34)).a == dialogFilter5.id) {
                                wsVar = (ws) arrayList3.get(i34);
                                break;
                            }
                            i34++;
                        }
                        if (wsVar == null) {
                            arrayList3.add(i33, ws.b(s2Var, dialogFilter5));
                            z28 = z11;
                        }
                    }
                    arrayList2.clear();
                } else {
                    z12 = Q;
                    i12 = i11;
                    boolean isEmpty2 = arrayList3.isEmpty();
                    arrayList3.clear();
                    z28 = !isEmpty2;
                }
                if (z28) {
                    z16 = isEmpty != this.t0.c.isEmpty() ? z11 : false;
                    z17 = z16;
                    z18 = z11;
                    if (i10 == 0) {
                        TLRPC.User user2 = this.f2;
                        if (user2 != null && !MessagesController.isSupportUser(user2) && !this.f2.bot && (i10 & MessagesController.UPDATE_MASK_STATUS) != 0) {
                            this.f2 = MessagesController.getInstance(i22).getUser(Long.valueOf(this.f2.id));
                            if (this.B0 != R()) {
                                z18 = z11;
                            }
                        }
                        if ((i10 & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                            TLRPC.User user3 = this.f2;
                            org.telegram.ui.Components.q5 q5Var = this.n4;
                            if (user3 != null) {
                                TLRPC.User user4 = MessagesController.getInstance(i22).getUser(Long.valueOf(this.f2.id));
                                this.f2 = user4;
                                if (user4 == null || DialogObject.getEmojiStatusDocumentId(user4.emoji_status) == j3) {
                                    this.D2 = true;
                                    q5Var.g(rg.b1.d().e, z10);
                                    q5Var.m(z13, z10);
                                } else {
                                    this.D2 = z11;
                                    q5Var.j(DialogObject.getEmojiStatusDocumentId(this.f2.emoji_status), z10);
                                    q5Var.m(DialogObject.isEmojiStatusCollectible(this.f2.emoji_status), z10);
                                }
                                j11 = DialogObject.getBotVerificationIcon(this.f2);
                                z18 = true;
                            } else {
                                j11 = j3;
                            }
                            if (this.g2 != null) {
                                TLRPC.Chat chat5 = MessagesController.getInstance(i22).getChat(Long.valueOf(this.g2.id));
                                this.g2 = chat5;
                                if (chat5 == null || DialogObject.getEmojiStatusDocumentId(chat5.emoji_status) == j3) {
                                    this.D2 = true;
                                    q5Var.g(rg.b1.d().e, z10);
                                    q5Var.m(false, z10);
                                } else {
                                    this.D2 = true;
                                    q5Var.j(DialogObject.getEmojiStatusDocumentId(this.g2.emoji_status), z10);
                                    q5Var.m(DialogObject.isEmojiStatusCollectible(this.g2.emoji_status), z10);
                                }
                                j11 = DialogObject.getBotVerificationIcon(this.g2);
                                z18 = true;
                            }
                            org.telegram.ui.Components.q5 q5Var2 = this.o4;
                            if (j11 != j3) {
                                z27 = !this.k4;
                                q5Var2.j(j11, z10);
                            } else {
                                z27 = this.k4;
                                q5Var2.g(null, z10);
                            }
                            boolean z34 = z18;
                            z26 = z27;
                            z19 = z34;
                        } else {
                            z19 = z18;
                            z26 = false;
                        }
                        if ((this.N0 || this.P) && (i10 & MessagesController.UPDATE_MASK_USER_PRINT) != 0) {
                            CharSequence printingString = MessagesController.getInstance(i22).getPrintingString(this.H0, getTopicId(), true);
                            CharSequence charSequence = this.i2;
                            if ((charSequence != null && printingString == null) || ((charSequence == null && printingString != null) || (charSequence != null && !charSequence.equals(printingString)))) {
                                z26 = true;
                            }
                        }
                        if (!z26 && (i10 & MessagesController.UPDATE_MASK_MESSAGE_TEXT) != 0 && (messageObject4 = this.f1) != null && messageObject4.messageText != this.i1) {
                            z26 = true;
                        }
                        if (!z26 && (i10 & MessagesController.UPDATE_MASK_CHAT) != 0 && this.g2 != null) {
                            TLRPC.Chat chat6 = MessagesController.getInstance(i22).getChat(Long.valueOf(this.g2.id));
                            if ((chat6 != null && chat6.call_active && chat6.call_not_empty) != this.v2) {
                                z26 = true;
                            }
                        }
                        if (!z26 && (i10 & MessagesController.UPDATE_MASK_AVATAR) != 0 && ((chat3 = this.g2) == null || (chat3.monoforum && ChatObject.canManageMonoForum(i22, chat3)))) {
                            r2 r2Var = this.N4;
                            if (r2Var != null && (hashMap = r2Var.f) != null && !hashMap.isEmpty()) {
                                for (Map.Entry entry : r2Var.f.entrySet()) {
                                    ((org.telegram.ui.g5) entry.getValue()).c(((Long) entry.getKey()).longValue());
                                }
                            }
                            z26 = true;
                        }
                        if (!z26 && (i10 & MessagesController.UPDATE_MASK_NAME) != 0 && this.g2 == null) {
                            z26 = true;
                        }
                        if (!z26 && (i10 & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 && this.f2 == null) {
                            z26 = true;
                        }
                        if (!z26 && (i10 & MessagesController.UPDATE_MASK_CHAT_NAME) != 0 && this.f2 == null) {
                            z26 = true;
                        }
                        if (!z26) {
                            MessageObject messageObject8 = this.f1;
                            if (messageObject8 != null && this.X0 != messageObject8.isUnread()) {
                                this.X0 = this.f1.isUnread();
                                z26 = true;
                            }
                            if (this.N0) {
                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) MessagesController.getInstance(i22).dialogs_dict.f(this.H0);
                                TLRPC.Chat chat7 = dialog2 == null ? null : MessagesController.getInstance(i22).getChat(Long.valueOf(-dialog2.id));
                                if (chat7 == null || !(chat7.forum || (chat7.monoforum && ChatObject.canManageMonoForum(i22, chat7)))) {
                                    if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                                        i16 = MessagesStorage.getInstance(i22).getArchiveUnreadCount();
                                    } else if (dialog2 instanceof TLRPC.TL_dialogCommunity) {
                                        MessagesController.UnreadCounts communityUnreadCount2 = MessagesController.getInstance(i22).getCommunityUnreadCount(-dialog2.id);
                                        i20 = communityUnreadCount2.unreadCount;
                                        i19 = communityUnreadCount2.mentionCount;
                                        i18 = communityUnreadCount2.reactionMentionCount;
                                        i17 = communityUnreadCount2.pollVotesMentionCount;
                                        this.e1 = communityUnreadCount2.hasUnmutedUnreadDialogs;
                                    } else if (dialog2 != null) {
                                        i16 = dialog2.unread_count;
                                        int i35 = dialog2.unread_mentions_count;
                                        int i36 = dialog2.unread_reactions_count;
                                        i17 = dialog2.unread_poll_votes_count;
                                        i18 = i36;
                                        i19 = i35;
                                        if (ChatObject.isMonoForum(chat7)) {
                                            i19 = 0;
                                        }
                                        if (dialog2 != null && (this.S0 != i16 || this.T0 != dialog2.unread_mark || this.U0 != i19 || this.V0 != i18)) {
                                            this.S0 = i16;
                                            this.U0 = i19;
                                            this.T0 = dialog2.unread_mark;
                                            this.V0 = i18;
                                            this.W0 = i17;
                                            z26 = true;
                                        }
                                    } else {
                                        i16 = 0;
                                    }
                                    i19 = 0;
                                    i18 = 0;
                                    i17 = 0;
                                    if (ChatObject.isMonoForum(chat7)) {
                                    }
                                    if (dialog2 != null) {
                                        this.S0 = i16;
                                        this.U0 = i19;
                                        this.T0 = dialog2.unread_mark;
                                        this.V0 = i18;
                                        this.W0 = i17;
                                        z26 = true;
                                    }
                                } else {
                                    int[] forumUnreadCount2 = MessagesController.getInstance(i22).getTopicsController().getForumUnreadCount(chat7.id);
                                    i20 = forumUnreadCount2[0];
                                    i19 = forumUnreadCount2[1];
                                    i18 = forumUnreadCount2[2];
                                    this.d1 = forumUnreadCount2[3] != 0;
                                    i17 = forumUnreadCount2[4];
                                }
                                i16 = i20;
                                if (ChatObject.isMonoForum(chat7)) {
                                }
                                if (dialog2 != null) {
                                }
                            }
                        }
                        if (!z26 && (i10 & MessagesController.UPDATE_MASK_SEND_STATE) != 0 && (messageObject3 = this.f1) != null) {
                            int i37 = this.Y0;
                            int i38 = messageObject3.messageOwner.send_state;
                            if (i37 != i38) {
                                this.Y0 = i38;
                                z26 = true;
                            }
                        }
                        if (!z26) {
                            invalidate();
                            return z17;
                        }
                    } else {
                        z19 = z18;
                    }
                    this.f2 = null;
                    this.g2 = null;
                    this.h2 = null;
                    if (this.K0 != j3) {
                        this.f1 = MessagesController.getInstance(i22).findCommunityLastMessage(this.K0);
                    }
                    i13 = this.J0;
                    if (i13 == 0) {
                        this.Z0 = false;
                        this.b1 = false;
                        ty tyVar = this.D4;
                        if (tyVar == null || (O3 = tyVar.O3(i22, this.j1, i13, false)) == null || O3.isEmpty()) {
                            messageObject2 = null;
                        } else {
                            int size = O3.size();
                            MessageObject messageObject9 = null;
                            for (int i39 = 0; i39 < size; i39++) {
                                TLRPC.Dialog dialog3 = (TLRPC.Dialog) O3.get(i39);
                                a0.i iVar = MessagesController.getInstance(i22).dialogMessage;
                                if (iVar != null) {
                                    ArrayList arrayList5 = (ArrayList) iVar.f(dialog3.id);
                                    MessageObject messageObject10 = (arrayList5 == null || arrayList5.isEmpty()) ? null : (MessageObject) arrayList5.get(0);
                                    if (messageObject10 != null && (messageObject9 == null || messageObject10.messageOwner.date > messageObject9.messageOwner.date)) {
                                        messageObject9 = messageObject10;
                                    }
                                    if (dialog3.pinnedNum == 0 && messageObject9 != null) {
                                        break;
                                    }
                                }
                            }
                            messageObject2 = messageObject9;
                        }
                        this.f1 = messageObject2;
                        j10 = messageObject2 != null ? messageObject2.getDialogId() : j3;
                    } else {
                        this.b1 = false;
                        if (this.N != null) {
                            boolean isDialogMuted = MessagesController.getInstance(i22).isDialogMuted(this.H0, j3);
                            boolean isDialogMuted2 = MessagesController.getInstance(i22).isDialogMuted(this.H0, this.N.id);
                            this.a1 = isDialogMuted2;
                            if (isDialogMuted == isDialogMuted2) {
                                this.Z0 = false;
                                this.b1 = false;
                            } else {
                                this.Z0 = isDialogMuted2;
                                this.b1 = !isDialogMuted2;
                            }
                        } else {
                            this.Z0 = this.N0 && MessagesController.getInstance(i22).isDialogMuted(this.H0, (long) getTopicId());
                        }
                        j10 = this.H0;
                        j3 = 0;
                    }
                    if (j10 != j3) {
                        if (DialogObject.isEncryptedDialog(j10)) {
                            TLRPC.EncryptedChat l4 = org.telegram.messenger.q.l(MessagesController.getInstance(i22), j10);
                            this.h2 = l4;
                            if (l4 != null) {
                                this.f2 = MessagesController.getInstance(i22).getUser(Long.valueOf(this.h2.user_id));
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            this.f2 = MessagesController.getInstance(i22).getUser(Long.valueOf(j10));
                        } else {
                            TLRPC.Chat chat8 = MessagesController.getInstance(i22).getChat(Long.valueOf(-j10));
                            this.g2 = chat8;
                            if (!this.N0 && chat8 != null && chat8.migrated_to != null && (chat2 = MessagesController.getInstance(i22).getChat(Long.valueOf(this.g2.migrated_to.channel_id))) != null) {
                                this.g2 = chat2;
                            }
                        }
                        if (this.u2 && this.f2 != null && this.f1.isOutOwner()) {
                            this.f2 = MessagesController.getInstance(i22).getUser(Long.valueOf(UserConfig.getInstance(i22).clientUserId));
                        }
                    }
                    this.E = this.O0 && ChatObject.isCommunity(this.g2) && this.N0;
                    if (this.J0 == 0) {
                        org.telegram.ui.ActionBar.i6.u1.setCallback(this);
                        j9Var.g(2);
                        imageReceiver = imageReceiver2;
                        z20 = z14;
                        z21 = z15;
                        i14 = i12;
                        imageReceiver.setImage(null, null, j9Var, null, this.f2, 0);
                    } else {
                        imageReceiver = imageReceiver2;
                        z20 = z14;
                        z21 = z15;
                        i14 = i12;
                        if (!this.O || (messageObject = this.f1) == null) {
                            TLRPC.User user5 = this.f2;
                            if (user5 != null) {
                                j9Var.m(i22, user5);
                                if (UserObject.isReplyUser(this.f2)) {
                                    j9Var.g(12);
                                    imageReceiver.setImage(null, null, j9Var, null, this.f2, 0);
                                } else if (UserObject.isAnonymous(this.f2)) {
                                    j9Var.g(21);
                                    imageReceiver.setImage(null, null, j9Var, null, this.f2, 0);
                                } else if (UserObject.isUserSelf(this.f2) && this.r0 && !this.q0) {
                                    j9Var.g(22);
                                    imageReceiver.setImage(null, null, j9Var, null, this.f2, 0);
                                } else if (!UserObject.isUserSelf(this.f2) || this.u2 || this.q0) {
                                    imageReceiver.setForUserOrChat(this.f2, j9Var, null, true, 1, false);
                                } else {
                                    j9Var.g(1);
                                    imageReceiver.setImage(null, null, j9Var, null, this.f2, 0);
                                }
                            } else {
                                TLRPC.Chat chat9 = this.g2;
                                if (chat9 != null) {
                                    if (chat9.monoforum) {
                                        ng.d.n(i22, chat9, j9Var, imageReceiver);
                                        j9Var.p = 1.0f;
                                    } else {
                                        j9Var.k(i22, chat9);
                                        imageReceiver.setForUserOrChat(chat9, j9Var);
                                    }
                                    if (z10 || ((i14 == this.S0 && z21 == this.T0) || (this.N0 && System.currentTimeMillis() - this.B4 <= 100))) {
                                        z22 = z16;
                                        z23 = z17;
                                        i15 = i22;
                                    } else {
                                        ValueAnimator valueAnimator = this.T3;
                                        if (valueAnimator != null) {
                                            valueAnimator.cancel();
                                        }
                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        this.T3 = ofFloat;
                                        ofFloat.addUpdateListener(new h2(this, 0));
                                        this.T3.addListener(new l2(this, 0));
                                        if ((i14 == 0 || this.T0) && (this.T0 || !z21)) {
                                            this.T3.setDuration(220L);
                                            this.T3.setInterpolator(new OvershootInterpolator());
                                        } else if (this.S0 == 0) {
                                            this.T3.setDuration(150L);
                                            this.T3.setInterpolator(hs.f);
                                        } else {
                                            this.T3.setDuration(430L);
                                            this.T3.setInterpolator(hs.f);
                                        }
                                        if (this.G3 && this.L3 && this.X3 != null) {
                                            String format = String.format("%d", Integer.valueOf(i14));
                                            String format2 = String.format("%d", Integer.valueOf(this.S0));
                                            if (format.length() == format2.length()) {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(format2);
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(format2);
                                                int i40 = 0;
                                                while (i40 < format.length()) {
                                                    boolean z35 = z16;
                                                    if (format.charAt(i40) == format2.charAt(i40)) {
                                                        boolean z36 = false;
                                                        z25 = z17;
                                                        int i41 = i40 + 1;
                                                        spannableStringBuilder.setSpan(new b00(z36), i40, i41, 0);
                                                        spannableStringBuilder2.setSpan(new b00(z36), i40, i41, 0);
                                                    } else {
                                                        z25 = z17;
                                                        spannableStringBuilder3.setSpan(new b00(false), i40, i40 + 1, 0);
                                                    }
                                                    i40++;
                                                    z16 = z35;
                                                    z17 = z25;
                                                }
                                                z22 = z16;
                                                z23 = z17;
                                                i15 = i22;
                                                int max = Math.max(AndroidUtilities.dp(8.0f), (int) Math.ceil(org.telegram.ui.ActionBar.i6.M0.measureText(format)));
                                                TextPaint textPaint = org.telegram.ui.ActionBar.i6.M0;
                                                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                                                this.Y3 = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                                                this.Z3 = new StaticLayout(spannableStringBuilder3, org.telegram.ui.ActionBar.i6.M0, max, alignment, 1.0f, 0.0f, false);
                                                this.a4 = new StaticLayout(spannableStringBuilder2, org.telegram.ui.ActionBar.i6.M0, max, alignment, 1.0f, 0.0f, false);
                                            } else {
                                                z22 = z16;
                                                z23 = z17;
                                                i15 = i22;
                                                this.Y3 = this.X3;
                                            }
                                        } else {
                                            z22 = z16;
                                            z23 = z17;
                                            i15 = i22;
                                        }
                                        this.P3 = this.O3;
                                        this.Q3 = this.N3;
                                        this.R3 = this.S0 > i14;
                                        this.T3.start();
                                    }
                                    this.S3.a(this.W0 != 0, z10);
                                    boolean z37 = this.V0 != 0;
                                    if (z10 || z37 == z20) {
                                        f7 = 0.0f;
                                    } else {
                                        ValueAnimator valueAnimator2 = this.U3;
                                        if (valueAnimator2 != null) {
                                            valueAnimator2.cancel();
                                        }
                                        f7 = 0.0f;
                                        this.W3 = 0.0f;
                                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        this.U3 = ofFloat2;
                                        ofFloat2.addUpdateListener(new h2(this, 1));
                                        this.U3.addListener(new l2(this, 1));
                                        if (z37) {
                                            this.U3.setDuration(220L);
                                            this.U3.setInterpolator(new OvershootInterpolator());
                                        } else {
                                            this.U3.setDuration(150L);
                                            this.U3.setInterpolator(hs.f);
                                        }
                                        this.U3.start();
                                    }
                                    z24 = P() && (chat = this.g2) != null && chat.monoforum;
                                    this.y = z24;
                                    if (z24) {
                                        dp = 1;
                                    } else if (this.E) {
                                        dp = AndroidUtilities.dp(12.0f);
                                    } else {
                                        TLRPC.Chat chat10 = this.g2;
                                        dp = ((chat10 == null || !chat10.forum || this.J0 != 0 || this.O) && (this.r0 || (user = this.f2) == null || !user.self || !MessagesController.getInstance(i15).savedViewAsChats)) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f);
                                    }
                                    imageReceiver.setRoundRadius(dp);
                                    z30 = z19;
                                }
                            }
                        } else {
                            j9Var.j(i22, messageObject.getFromPeerObject());
                            imageReceiver.setForUserOrChat(this.f1.getFromPeerObject(), j9Var);
                        }
                    }
                    if (z10) {
                    }
                    z22 = z16;
                    z23 = z17;
                    i15 = i22;
                    this.S3.a(this.W0 != 0, z10);
                    if (this.V0 != 0) {
                    }
                    if (z10) {
                    }
                    f7 = 0.0f;
                    if (P()) {
                    }
                    this.y = z24;
                    if (z24) {
                    }
                    imageReceiver.setRoundRadius(dp);
                    z30 = z19;
                }
            } else {
                z12 = Q;
                z13 = false;
                z14 = z31;
                z15 = z32;
                i12 = i11;
            }
            z16 = z13;
            z17 = z16;
            z18 = z17;
            if (i10 == 0) {
            }
            this.f2 = null;
            this.g2 = null;
            this.h2 = null;
            if (this.K0 != j3) {
            }
            i13 = this.J0;
            if (i13 == 0) {
            }
            if (j10 != j3) {
            }
            this.E = this.O0 && ChatObject.isCommunity(this.g2) && this.N0;
            if (this.J0 == 0) {
            }
            if (z10) {
            }
            z22 = z16;
            z23 = z17;
            i15 = i22;
            this.S3.a(this.W0 != 0, z10);
            if (this.V0 != 0) {
            }
            if (z10) {
            }
            f7 = 0.0f;
            if (P()) {
            }
            this.y = z24;
            if (z24) {
            }
            imageReceiver.setRoundRadius(dp);
            z30 = z19;
        }
        boolean z38 = (this.P || (getMeasuredWidth() == 0 && getMeasuredHeight() == 0)) ? z22 : true;
        if (!z30) {
            int i42 = this.u0.y;
            ai.ja.r(MessagesController.getInstance(i15).getStoriesController(), getDialogId());
        }
        if (!z10) {
            this.c1 = (this.Z0 || this.b1) ? 1.0f : f7;
            ValueAnimator valueAnimator3 = this.T3;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
        }
        invalidate();
        if (Q() != z12) {
            z23 = true;
        }
        if (z38) {
            if (this.w3) {
                u();
            } else {
                this.A0 = true;
            }
        }
        d0(z10);
        return z23;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f0, code lost:
    
        if (r14.canDownloadMedia(1, r3) == false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.util.ArrayList<org.telegram.tgnet.TLRPC$PhotoSize>] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v23, types: [org.telegram.tgnet.TLRPC$Document] */
    /* JADX WARN: Type inference failed for: r8v26, types: [org.telegram.tgnet.TLRPC$Photo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0() {
        TLRPC.Message message;
        int i10;
        ?? r14;
        boolean z10;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize strippedPhotoSize;
        TLRPC.PhotoSize photoSize2;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        boolean z11;
        int i11;
        TLRPC.PhotoSize photoSize3;
        MessageObject messageObject = this.f1;
        if (messageObject == null) {
            return;
        }
        String restrictionReason = MessagesController.getInstance(messageObject.currentAccount).getRestrictionReason(this.f1.messageOwner.restriction_reason);
        MessageObject messageObject2 = this.f1;
        TLRPC.PhotoSize photoSize4 = null;
        int i12 = 3;
        boolean z12 = false;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                this.R1 = 0;
                this.S1 = false;
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
                int i13 = 0;
                int i14 = 0;
                while (i13 < tL_messageMediaPaidMedia.extended_media.size() && this.R1 < i12) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i13);
                    boolean z13 = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
                    boolean[] zArr = this.X1;
                    boolean[] zArr2 = this.W1;
                    ImageReceiver[] imageReceiverArr = this.V1;
                    if (z13) {
                        i10 = i14 + 1;
                        TLRPC.PhotoSize photoSize5 = ((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb;
                        if (i14 < i12 && photoSize5 != null) {
                            this.S1 = z12;
                            int i15 = this.R1;
                            if (i15 < i12) {
                                this.R1 = i15 + 1;
                                zArr2[i14] = z12;
                                zArr[i14] = true;
                                imageReceiverArr[i14].setImage(ImageLocation.getForObject(photoSize5, this.f1.messageOwner), "2_2_b", null, null, z12 ? 1L : 0L, null, this.f1, 0);
                                imageReceiverArr[i14].setRoundRadius(AndroidUtilities.dp(2.0f));
                                this.V = z12;
                            }
                        }
                    } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                        i10 = i14 + 1;
                        TLRPC.MessageMedia messageMedia2 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                            ?? r82 = messageMedia2.photo;
                            r14 = r82.sizes;
                            photoSize3 = r82;
                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                            boolean isVideoDocument = MessageObject.isVideoDocument(messageMedia2.document);
                            ?? r83 = messageMedia2.document;
                            z10 = isVideoDocument;
                            r14 = r83.thumbs;
                            photoSize = r83;
                            strippedPhotoSize = FileLoader.getStrippedPhotoSize(r14);
                            if (strippedPhotoSize == null) {
                                strippedPhotoSize = FileLoader.getClosestPhotoSizeWithSize(r14, 40);
                            }
                            photoSize2 = strippedPhotoSize;
                            closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(r14, AndroidUtilities.getPhotoSize(), z12, photoSize4, true);
                            if (photoSize2 == closestPhotoSizeWithSize) {
                                closestPhotoSizeWithSize = photoSize4;
                            }
                            if (closestPhotoSizeWithSize == null) {
                                DownloadController downloadController = DownloadController.getInstance(this.F0);
                                int i16 = closestPhotoSizeWithSize.size;
                                z11 = z12 ? 1 : 0;
                                i11 = i14;
                            } else {
                                z11 = z12 ? 1 : 0;
                                i11 = i14;
                            }
                            closestPhotoSizeWithSize = photoSize2;
                            if (photoSize2 != null) {
                                this.S1 = (this.S1 || z10) ? true : z11;
                                int i17 = this.R1;
                                if (i17 < 3) {
                                    this.R1 = i17 + 1;
                                    zArr2[i11] = z10;
                                    zArr[i11] = z11;
                                    imageReceiverArr[i11].setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, photoSize), "20_20", ImageLocation.getForObject(photoSize2, photoSize), "20_20", (long) ((z10 || closestPhotoSizeWithSize == null) ? z11 : closestPhotoSizeWithSize.size), null, this.f1, 0);
                                    imageReceiverArr[i11].setRoundRadius(AndroidUtilities.dp(2.0f));
                                    this.V = z11;
                                }
                            }
                        } else {
                            TLRPC.PhotoSize photoSize6 = photoSize4;
                            r14 = photoSize6;
                            photoSize3 = photoSize6;
                        }
                        z10 = z12 ? 1 : 0;
                        photoSize = photoSize3;
                        strippedPhotoSize = FileLoader.getStrippedPhotoSize(r14);
                        if (strippedPhotoSize == null) {
                        }
                        photoSize2 = strippedPhotoSize;
                        closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(r14, AndroidUtilities.getPhotoSize(), z12, photoSize4, true);
                        if (photoSize2 == closestPhotoSizeWithSize) {
                        }
                        if (closestPhotoSizeWithSize == null) {
                        }
                        closestPhotoSizeWithSize = photoSize2;
                        if (photoSize2 != null) {
                        }
                    } else {
                        i13++;
                        photoSize4 = null;
                        i12 = 3;
                        z12 = false;
                    }
                    i14 = i10;
                    i13++;
                    photoSize4 = null;
                    i12 = 3;
                    z12 = false;
                }
                return;
            }
        }
        ArrayList arrayList = this.g1;
        if (arrayList != null && arrayList.size() > 1 && TextUtils.isEmpty(restrictionReason) && this.J0 == 0 && this.h2 == null) {
            this.R1 = 0;
            this.S1 = false;
            Collections.sort(this.g1, Comparator$-CC.comparingInt(new ai.h7(5)));
            for (int i18 = 0; i18 < Math.min(3, this.g1.size()); i18++) {
                MessageObject messageObject3 = (MessageObject) this.g1.get(i18);
                if (messageObject3 != null && !messageObject3.needDrawBluredPreview() && (messageObject3.isPhoto() || messageObject3.isNewGif() || messageObject3.isVideo() || messageObject3.isRoundVideo() || messageObject3.isStoryMedia())) {
                    String str = messageObject3.isWebpage() ? messageObject3.messageOwner.media.webpage.type : null;
                    if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                        Z(messageObject3, i18);
                    }
                }
            }
            return;
        }
        MessageObject messageObject4 = this.f1;
        if (messageObject4 == null || this.J0 != 0) {
            return;
        }
        this.R1 = 0;
        this.S1 = false;
        if (messageObject4.needDrawBluredPreview()) {
            return;
        }
        if (this.f1.isPhoto() || this.f1.isNewGif() || this.f1.isVideo() || this.f1.isRoundVideo() || this.f1.isStoryMedia()) {
            String str2 = this.f1.isWebpage() ? this.f1.messageOwner.media.webpage.type : null;
            if ("app".equals(str2) || "profile".equals(str2) || "article".equals(str2)) {
                return;
            }
            if (str2 == null || !str2.startsWith("telegram_")) {
                Z(this.f1, 0);
            }
        }
    }

    public final void d0(boolean z10) {
        TL_account.RequirementToContact isUserContactBlocked = (this.Z4 == null || this.f2 == null) ? null : MessagesController.getInstance(this.F0).isUserContactBlocked(this.f2.id);
        if (this.n2 == DialogObject.isPremiumBlocked(isUserContactBlocked) && this.p2 == DialogObject.getMessagesStarsPrice(isUserContactBlocked)) {
            return;
        }
        this.n2 = DialogObject.isPremiumBlocked(isUserContactBlocked);
        this.p2 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
        if (!z10) {
            this.m2.f(this.n2, true);
            this.o2.f(this.p2 > 0, true);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((!this.P && !this.F && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            this.u0.a(motionEvent, this);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e0() {
        if (this.R1 > 0) {
            StaticLayout staticLayout = Q() ? this.h3 : this.e3;
            int i10 = Q() ? this.c3 : this.b3;
            if (staticLayout == null) {
                return;
            }
            try {
                CharSequence text = staticLayout.getText();
                if (text instanceof Spanned) {
                    q2[] q2VarArr = (q2[]) ((Spanned) text).getSpans(0, text.length(), q2.class);
                    boolean[] zArr = this.U1;
                    if (q2VarArr == null || q2VarArr.length <= 0) {
                        for (int i11 = 0; i11 < 3; i11++) {
                            zArr[i11] = false;
                        }
                        return;
                    }
                    int spanStart = ((Spanned) text).getSpanStart(q2VarArr[0]);
                    if (spanStart < 0) {
                        spanStart = 0;
                    }
                    int ceil = (int) Math.ceil(Math.min(staticLayout.getPrimaryHorizontal(spanStart), staticLayout.getPrimaryHorizontal(spanStart + 1)));
                    if (ceil != 0 && !this.x0 && !this.y0) {
                        ceil += AndroidUtilities.dp(3.0f);
                    }
                    for (int i12 = 0; i12 < this.R1; i12++) {
                        this.V1[i12].setImageX(i10 + ceil + AndroidUtilities.dp((this.L4 + 2) * i12));
                        zArr[i12] = true;
                    }
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public float getClipProgress() {
        return this.t1;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public int getCurrentDialogFolderId() {
        return this.J0;
    }

    public long getDialogId() {
        return this.H0;
    }

    public boolean getHasUnread() {
        return this.S0 != 0 || this.T0;
    }

    public boolean getIsMuted() {
        return this.Z0;
    }

    public boolean getIsPinned() {
        return this.A3 || this.B3;
    }

    public MessageObject getMessage() {
        return this.f1;
    }

    public int getMessageId() {
        return this.l1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r2 != r9) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getMessageNameString() {
        TLRPC.Chat chat;
        TLRPC.User user;
        String str;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        String str2;
        MessageObject messageObject;
        TLRPC.Message message2;
        TLRPC.User user2;
        MessageObject messageObject2;
        TLRPC.Message message3;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Message message4;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        TLRPC.MessageFwdHeader messageFwdHeader4;
        MessageObject messageObject3 = this.f1;
        if (messageObject3 != null) {
            long fromChatId = messageObject3.getFromChatId();
            int i10 = this.F0;
            long clientUserId = UserConfig.getInstance(i10).getClientUserId();
            if (!this.r0 && this.H0 == clientUserId) {
                long savedDialogId = this.f1.getSavedDialogId();
                if (savedDialogId != clientUserId) {
                    if (savedDialogId != UserObject.ANONYMOUS) {
                        TLRPC.Message message5 = this.f1.messageOwner;
                        if (message5 != null && (messageFwdHeader4 = message5.fwd_from) != null) {
                            long peerDialogId = DialogObject.getPeerDialogId(messageFwdHeader4.saved_from_id);
                            if (peerDialogId == 0) {
                                peerDialogId = DialogObject.getPeerDialogId(this.f1.messageOwner.fwd_from.from_id);
                            }
                            if (peerDialogId > 0) {
                            }
                        }
                        fromChatId = savedDialogId;
                    }
                }
            }
            if (this.r0 && (message4 = this.f1.messageOwner) != null && (messageFwdHeader3 = message4.fwd_from) != null) {
                fromChatId = DialogObject.getPeerDialogId(messageFwdHeader3.saved_from_id);
                if (fromChatId == 0) {
                    fromChatId = DialogObject.getPeerDialogId(this.f1.messageOwner.fwd_from.from_id);
                }
            }
            if (DialogObject.isUserDialog(fromChatId)) {
                user = MessagesController.getInstance(i10).getUser(Long.valueOf(fromChatId));
                chat = null;
            } else {
                chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-fromChatId));
                user = null;
            }
            long j3 = this.H0;
            if (j3 != clientUserId) {
                if (j3 == UserObject.VERIFY && (messageObject2 = this.f1) != null && (message3 = messageObject2.messageOwner) != null && (messageFwdHeader2 = message3.fwd_from) != null) {
                    String str3 = messageFwdHeader2.from_name;
                    if (str3 != null) {
                        return AndroidUtilities.escape(str3);
                    }
                    long peerDialogId2 = DialogObject.getPeerDialogId(messageFwdHeader2.from_id);
                    if (DialogObject.isUserDialog(peerDialogId2)) {
                        return UserObject.getUserName(MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId2)));
                    }
                    TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId2));
                    return chat2 == null ? "" : chat2.title;
                }
                if (this.f1.isOutOwner() && user != null) {
                    return LocaleController.getString(R.string.FromYou);
                }
                if (!this.r0 && (messageObject = this.f1) != null && (message2 = messageObject.messageOwner) != null && (message2.from_id instanceof TLRPC.TL_peerUser) && (user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(this.f1.messageOwner.from_id.user_id))) != null) {
                    return AndroidUtilities.escape(UserObject.getFirstName(user2).replace("\n", ""));
                }
                MessageObject messageObject4 = this.f1;
                return (messageObject4 == null || (message = messageObject4.messageOwner) == null || (messageFwdHeader = message.fwd_from) == null || (str2 = messageFwdHeader.from_name) == null) ? user != null ? (this.r2 || SharedConfig.useThreeLinesLayout) ? UserObject.isDeleted(user) ? LocaleController.getString(R.string.HiddenName) : AndroidUtilities.escape(ContactsController.formatName(user.first_name, user.last_name).replace("\n", "")) : AndroidUtilities.escape(UserObject.getFirstName(user).replace("\n", "")) : (chat == null || (str = chat.title) == null) ? "DELETED" : AndroidUtilities.escape(str.replace("\n", "")) : AndroidUtilities.escape(str2);
            }
            if (user != null) {
                return AndroidUtilities.escape(UserObject.getFirstName(user).replace("\n", ""));
            }
            if (chat != null) {
                return AndroidUtilities.escape(chat.title.replace("\n", ""));
            }
        }
        return null;
    }

    public long getStarsPrice() {
        return this.p2;
    }

    @Override // android.view.View
    public float getTranslationX() {
        return this.w1;
    }

    @Override // org.telegram.ui.Cells.a0, android.view.View
    public final void invalidate() {
        if (kc.x1) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == this.y1 || drawable == org.telegram.ui.ActionBar.i6.u1) {
            invalidate(drawable.getBounds());
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Y1.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.V1;
            if (i10 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i10].onAttachedToWindow();
            i10++;
        }
        U();
        this.m3 = org.telegram.ui.Components.b6.update(0, this, this.m3, this.e3);
        this.n3 = org.telegram.ui.Components.b6.update(0, this, this.n3, this.s3);
        this.o3 = org.telegram.ui.Components.b6.update(0, this, this.o3, this.h3);
        this.p3 = org.telegram.ui.Components.b6.update(0, this, this.p3, this.z2);
        org.telegram.ui.Components.q5 q5Var = this.n4;
        if (q5Var != null) {
            q5Var.a();
        }
        org.telegram.ui.Components.q5 q5Var2 = this.o4;
        if (q5Var2 != null) {
            q5Var2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x1 = false;
        this.A1 = false;
        this.B1 = 0.0f;
        this.w3 = false;
        this.x3 = (getIsPinned() && this.y3) ? 1.0f : 0.0f;
        this.Y1.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.V1;
            if (i10 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i10].onDetachedFromWindow();
            i10++;
        }
        ck0 ck0Var = this.y1;
        if (ck0Var != null) {
            ck0Var.stop();
            this.y1.T(0.0f, true);
            this.y1.setCallback(null);
            this.y1 = null;
            this.z1 = false;
        }
        gg.j jVar = this.s4;
        if (jVar != null) {
            jVar.d.remove(Long.valueOf(this.H0));
        }
        org.telegram.ui.Components.q5 q5Var = this.n4;
        if (q5Var != null) {
            q5Var.b();
        }
        org.telegram.ui.Components.q5 q5Var2 = this.o4;
        if (q5Var2 != null) {
            q5Var2.b();
        }
        org.telegram.ui.Components.b6.release(this, this.m3);
        org.telegram.ui.Components.b6.release(this, this.n3);
        org.telegram.ui.Components.b6.release(this, this.o3);
        org.telegram.ui.Components.b6.release(this, this.p3);
        this.u0.g();
        this.c0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1013:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:1023:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:1040:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:1046:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:1049:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:1052:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:1053:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0cb2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0cc7  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0cdd  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0ce0  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0cf2  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0d25  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0d38  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0d40  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0dd9  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0fd5  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x1074  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x107c  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x1091  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x10f6  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x1107 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x1150  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x1169  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x118b  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x118e  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x11c9  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x1250  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x13a0  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x1409  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x164b  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x16be  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x1822  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x1853  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x186e  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x188d  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x18ac  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x198b  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x18e9  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x19c6  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x19cf  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x19df  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x1a37  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x1a40  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x1a45  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x1a98  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x1b16  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x1b64  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x1bc6  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x1bfc  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x1c4b  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x1c60  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x1ca9  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x1cb2  */
    /* JADX WARN: Removed duplicated region for block: B:694:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:695:0x1cab  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x1c86  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x1c20  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x1bd3  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x1be6  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x1457  */
    /* JADX WARN: Removed duplicated region for block: B:793:0x13ac  */
    /* JADX WARN: Removed duplicated region for block: B:798:0x12a1  */
    /* JADX WARN: Removed duplicated region for block: B:856:0x1233  */
    /* JADX WARN: Removed duplicated region for block: B:865:0x116c  */
    /* JADX WARN: Removed duplicated region for block: B:867:0x1153  */
    /* JADX WARN: Removed duplicated region for block: B:882:0x107f  */
    /* JADX WARN: Removed duplicated region for block: B:883:0x1076  */
    /* JADX WARN: Removed duplicated region for block: B:894:0x1084  */
    /* JADX WARN: Removed duplicated region for block: B:906:0x0fd0  */
    /* JADX WARN: Removed duplicated region for block: B:909:0x0cbc  */
    /* JADX WARN: Type inference failed for: r12v59 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v173, types: [org.telegram.ui.Cells.i2] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        float f7;
        boolean z10;
        int w02;
        int w03;
        int i10;
        String string;
        String str;
        int i11;
        int i12;
        float f10;
        int i13;
        org.telegram.ui.ActionBar.e6 e6Var;
        boolean z11;
        ci.bb bbVar;
        m2 m2Var;
        String str2;
        float f11;
        int i14;
        String str3;
        float f12;
        m2 m2Var2;
        float f13;
        m2 m2Var3;
        String str4;
        int ceil;
        int i15;
        StaticLayout staticLayout;
        float f14;
        boolean z12;
        ck0 ck0Var;
        float f15;
        float f16;
        org.telegram.ui.ActionBar.e6 e6Var2;
        float f17;
        s2 s2Var;
        int i16;
        org.telegram.ui.ActionBar.e6 e6Var3;
        m2 m2Var4;
        ci.bb bbVar2;
        ?? r12;
        float f18;
        int i17;
        boolean z13;
        int i18;
        boolean z14;
        ImageReceiver imageReceiver;
        boolean z15;
        k2 k2Var;
        s2 s2Var2;
        float f19;
        int i19;
        Canvas canvas2;
        boolean z16;
        float f20;
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.TL_forumTopic tL_forumTopic2;
        nj0 nj0Var;
        p2 p2Var;
        float f21;
        float f22;
        int i20;
        int i21;
        float f23;
        int i22;
        boolean z17;
        int i23;
        p2 p2Var2;
        int i24;
        RectF rectF;
        org.telegram.ui.ActionBar.e6 e6Var4;
        p2 p2Var3;
        float f24;
        boolean z18;
        s2 s2Var3;
        boolean z19;
        float f25;
        xs xsVar;
        int i25;
        float dp;
        float f26;
        boolean z20;
        boolean z21;
        boolean z22;
        int i26;
        float f27;
        float y3;
        StaticLayout staticLayout2;
        int i27;
        ox0 u02;
        int i28;
        n2 n2Var;
        ty tyVar;
        nx nxVar;
        TLRPC.TL_forumTopic tL_forumTopic3;
        nj0 nj0Var2;
        TLRPC.TL_forumTopic tL_forumTopic4;
        final s2 s2Var4 = this;
        Canvas canvas3 = canvas;
        if ((s2Var4.H0 == 0 && s2Var4.G0 == null) || !s2Var4.z0) {
            return;
        }
        boolean z23 = s2Var4.h;
        ci.bb bbVar3 = s2Var4.m4;
        if (z23 && ((s2Var4.J0 != 0 || (s2Var4.P && (tL_forumTopic4 = s2Var4.N) != null && tL_forumTopic4.id == 1)) && (nj0Var2 = s2Var4.e2) != null && nj0Var2.C == 0.0f && s2Var4.w1 == 0.0f)) {
            canvas3.save();
            canvas3.translate(0.0f, (-s2Var4.E3) - s2Var4.n);
            canvas3.clipRect(0.0f, (1.0f - s2Var4.e2.J) * s2Var4.getMeasuredHeight(), s2Var4.getMeasuredWidth(), s2Var4.getMeasuredHeight());
            s2Var4.e2.c(canvas3, false);
            canvas3.restore();
            bbVar3.setVisibility(4);
            return;
        }
        boolean z24 = z23 && (s2Var4.J0 != 0 || (s2Var4.P && (tL_forumTopic3 = s2Var4.N) != null && tL_forumTopic3.id == 1)) && s2Var4.e2 != null && s2Var4.w1 == 0.0f && (tyVar = s2Var4.D4) != null && tyVar.W3() && ((nxVar = tyVar.F3) == null || !nxVar.c());
        nj0 nj0Var3 = s2Var4.e2;
        float f28 = nj0Var3 != null ? nj0Var3.J : 1.0f;
        if (z24) {
            canvas3.save();
            canvas3.clipRect(0.0f, (1.0f - f28) * s2Var4.getMeasuredHeight(), s2Var4.getMeasuredWidth(), s2Var4.getMeasuredHeight());
        }
        if (s2Var4.t1 != 0.0f && Build.VERSION.SDK_INT != 24) {
            canvas3.save();
            canvas3.clipRect(0.0f, s2Var4.u1 * s2Var4.t1, s2Var4.getMeasuredWidth(), s2Var4.getMeasuredHeight() - ((int) (s2Var4.v1 * s2Var4.t1)));
        }
        float f29 = s2Var4.w1;
        m2 m2Var5 = s2Var4.d2;
        org.telegram.ui.ActionBar.e6 e6Var5 = s2Var4.J4;
        if (f29 == 0.0f && s2Var4.o1 == 0.0f) {
            ck0 ck0Var2 = s2Var4.y1;
            if (ck0Var2 != null) {
                ck0Var2.stop();
                s2Var4.y1.T(0.0f, true);
                s2Var4.y1.setCallback(null);
                s2Var4.y1 = null;
                s2Var4.z1 = false;
            }
            f7 = 1.0f;
            e6Var = e6Var5;
            z11 = z23;
            bbVar = bbVar3;
            f14 = 2.0f;
            m2Var3 = m2Var5;
        } else {
            canvas3.save();
            canvas3.translate(0.0f, -s2Var4.E3);
            if (s2Var4.L1) {
                w02 = org.telegram.ui.ActionBar.i6.w0(s2Var4.M1, e6Var5);
                w03 = org.telegram.ui.ActionBar.i6.w0(s2Var4.N1, e6Var5);
                String str5 = s2Var4.O1;
                f7 = 1.0f;
                i10 = s2Var4.P1;
                string = LocaleController.getString(str5, i10);
                z10 = false;
                s2Var4.y1 = s2Var4.Q1;
            } else {
                f7 = 1.0f;
                z10 = false;
                if (s2Var4.J0 != 0) {
                    if (s2Var4.m1) {
                        w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d9, e6Var5);
                        w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.c9, e6Var5);
                        i10 = R.string.UnhideFromTop;
                        string = LocaleController.getString(i10);
                        s2Var4.y1 = org.telegram.ui.ActionBar.i6.y1;
                    } else {
                        w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.c9, e6Var5);
                        w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d9, e6Var5);
                        i10 = R.string.HideOnTop;
                        string = LocaleController.getString(i10);
                        s2Var4.y1 = org.telegram.ui.ActionBar.i6.x1;
                    }
                } else if (s2Var4.P2) {
                    w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.c9, e6Var5);
                    w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d9, e6Var5);
                    i10 = R.string.PsaHide;
                    string = LocaleController.getString(i10);
                    s2Var4.y1 = org.telegram.ui.ActionBar.i6.z1;
                } else if (s2Var4.k1 == 0) {
                    w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.c9, e6Var5);
                    w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d9, e6Var5);
                    if (ChatObject.isCommunity(s2Var4.g2)) {
                        int i29 = R.string.SwipeUngroupCommunity;
                        String string2 = LocaleController.getString(i29);
                        w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Y5, e6Var5);
                        s2Var4.y1 = org.telegram.ui.ActionBar.i6.K1;
                        str = string2;
                        i11 = i29;
                        i12 = w02;
                        if (s2Var4.w || (ck0Var = s2Var4.s) == null) {
                            s2Var4.s = s2Var4.y1;
                            s2Var4.v = i11;
                        } else {
                            s2Var4.y1 = ck0Var;
                            i11 = s2Var4.v;
                        }
                        if (!s2Var4.z1 && Math.abs(s2Var4.w1) > AndroidUtilities.dp(43.0f)) {
                            s2Var4.z1 = true;
                            s2Var4.y1.T(0.0f, true);
                            s2Var4.y1.setCallback(s2Var4);
                            s2Var4.y1.start();
                        }
                        float measuredWidth = s2Var4.getMeasuredWidth() + s2Var4.w1;
                        if (s2Var4.B1 >= f7) {
                            org.telegram.ui.ActionBar.i6.v0.setColor(w02);
                            i13 = i11;
                            e6Var = e6Var5;
                            z11 = z23;
                            bbVar = bbVar3;
                            m2Var = m2Var5;
                            f11 = measuredWidth;
                            str2 = "Arrow";
                            f10 = 0.0f;
                            canvas3.drawRect(measuredWidth - AndroidUtilities.dp(8.0f), 0.0f, s2Var4.getMeasuredWidth(), s2Var4.getMeasuredHeight(), org.telegram.ui.ActionBar.i6.v0);
                            if (s2Var4.B1 == 0.0f) {
                                if (org.telegram.ui.ActionBar.i6.A1) {
                                    org.telegram.ui.ActionBar.i6.v1.Q(org.telegram.ui.ActionBar.i6.F0(org.telegram.ui.ActionBar.i6.c9), str2);
                                    org.telegram.ui.ActionBar.i6.A1 = z10;
                                }
                                if (org.telegram.ui.ActionBar.i6.B1) {
                                    ck0 ck0Var3 = org.telegram.ui.ActionBar.i6.z1;
                                    ck0Var3.Z = true;
                                    int i30 = org.telegram.ui.ActionBar.i6.c9;
                                    ck0Var3.Q(org.telegram.ui.ActionBar.i6.F0(i30), "Line 1");
                                    org.telegram.ui.ActionBar.i6.z1.Q(org.telegram.ui.ActionBar.i6.F0(i30), "Line 2");
                                    org.telegram.ui.ActionBar.i6.z1.Q(org.telegram.ui.ActionBar.i6.F0(i30), "Line 3");
                                    org.telegram.ui.ActionBar.i6.z1.o();
                                    org.telegram.ui.ActionBar.i6.B1 = z10;
                                }
                            }
                        } else {
                            f10 = 0.0f;
                            i13 = i11;
                            e6Var = e6Var5;
                            z11 = z23;
                            bbVar = bbVar3;
                            m2Var = m2Var5;
                            str2 = "Arrow";
                            f11 = measuredWidth;
                        }
                        int measuredWidth2 = (s2Var4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (s2Var4.y1.getIntrinsicWidth() / 2);
                        int A = bi.A(52.0f, s2Var4.getMeasuredHeight(), 2);
                        int intrinsicWidth = (s2Var4.y1.getIntrinsicWidth() / 2) + measuredWidth2;
                        int intrinsicHeight = (s2Var4.y1.getIntrinsicHeight() / 2) + A;
                        if (s2Var4.B1 <= f10) {
                            canvas3.save();
                            i14 = i13;
                            str3 = str;
                            f12 = f11;
                            canvas3.clipRect(f11 - AndroidUtilities.dp(8.0f), f10, s2Var4.getMeasuredWidth(), s2Var4.getMeasuredHeight());
                            org.telegram.ui.ActionBar.i6.v0.setColor(i12);
                            m2Var2 = m2Var;
                            canvas3.drawCircle(intrinsicWidth, intrinsicHeight, AndroidUtilities.accelerateInterpolator.getInterpolation(s2Var4.B1) * ((float) Math.sqrt(((intrinsicHeight - s2Var4.getMeasuredHeight()) * (intrinsicHeight - s2Var4.getMeasuredHeight())) + (intrinsicWidth * intrinsicWidth))), org.telegram.ui.ActionBar.i6.v0);
                            canvas3.restore();
                            if (org.telegram.ui.ActionBar.i6.A1) {
                                z12 = true;
                            } else {
                                org.telegram.ui.ActionBar.i6.v1.Q(org.telegram.ui.ActionBar.i6.F0(org.telegram.ui.ActionBar.i6.d9), str2);
                                z12 = true;
                                org.telegram.ui.ActionBar.i6.A1 = true;
                            }
                            if (!org.telegram.ui.ActionBar.i6.B1) {
                                ck0 ck0Var4 = org.telegram.ui.ActionBar.i6.z1;
                                ck0Var4.Z = z12;
                                int i31 = org.telegram.ui.ActionBar.i6.d9;
                                ck0Var4.Q(org.telegram.ui.ActionBar.i6.F0(i31), "Line 1");
                                org.telegram.ui.ActionBar.i6.z1.Q(org.telegram.ui.ActionBar.i6.F0(i31), "Line 2");
                                org.telegram.ui.ActionBar.i6.z1.Q(org.telegram.ui.ActionBar.i6.F0(i31), "Line 3");
                                org.telegram.ui.ActionBar.i6.z1.o();
                                org.telegram.ui.ActionBar.i6.B1 = true;
                            }
                        } else {
                            i14 = i13;
                            str3 = str;
                            f12 = f11;
                            m2Var2 = m2Var;
                        }
                        canvas3.save();
                        canvas3.translate(measuredWidth2, A);
                        f13 = s2Var4.C1;
                        if (f13 != 0.0f || f13 == f7) {
                            m2Var3 = m2Var2;
                        } else {
                            m2Var3 = m2Var2;
                            float interpolation = m2Var3.getInterpolation(f13) + f7;
                            canvas3.scale(interpolation, interpolation, s2Var4.y1.getIntrinsicWidth() / 2, s2Var4.y1.getIntrinsicHeight() / 2);
                        }
                        boolean z25 = z10;
                        a0.p(z25 ? 1 : 0, z25 ? 1 : 0, s2Var4.y1);
                        s2Var4.y1.draw(canvas3);
                        canvas3.restore();
                        canvas3.clipRect(f12, 0.0f, s2Var4.getMeasuredWidth(), s2Var4.getMeasuredHeight());
                        str4 = str3;
                        ceil = (int) Math.ceil(org.telegram.ui.ActionBar.i6.M0.measureText(str4));
                        i15 = i14;
                        if (s2Var4.F4 == i15 || s2Var4.G4 != s2Var4.getMeasuredWidth()) {
                            s2Var4.F4 = i15;
                            s2Var4.G4 = s2Var4.getMeasuredWidth();
                            TextPaint textPaint = org.telegram.ui.ActionBar.i6.N0;
                            int min = Math.min(AndroidUtilities.dp(80.0f), ceil);
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                            staticLayout = new StaticLayout(str4, textPaint, min, alignment, 1.0f, 0.0f, false);
                            s2Var4.E4 = staticLayout;
                            if (staticLayout.getLineCount() > 1) {
                                s2Var4.E4 = new StaticLayout(str4, org.telegram.ui.ActionBar.i6.O0, Math.min(AndroidUtilities.dp(82.0f), ceil), alignment, 1.0f, 0.0f, false);
                            }
                        }
                        if (s2Var4.E4 == null) {
                            canvas3.save();
                            f14 = 2.0f;
                            canvas3.translate((s2Var4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (s2Var4.E4.getWidth() / 2.0f), AndroidUtilities.dp(36.0f) + A + (s2Var4.E4.getLineCount() > 1 ? -AndroidUtilities.dp(4.0f) : 0.0f));
                            s2Var4.E4.draw(canvas3);
                            canvas3.restore();
                        } else {
                            f14 = 2.0f;
                        }
                        canvas3.restore();
                    } else {
                        int i32 = s2Var4.F0;
                        if (SharedConfig.getChatSwipeAction(i32) == 3) {
                            if (s2Var4.Z0) {
                                i10 = R.string.SwipeUnmute;
                                string = LocaleController.getString(i10);
                                s2Var4.y1 = org.telegram.ui.ActionBar.i6.I1;
                            } else {
                                i10 = R.string.SwipeMute;
                                string = LocaleController.getString(i10);
                                s2Var4.y1 = org.telegram.ui.ActionBar.i6.H1;
                            }
                        } else if (SharedConfig.getChatSwipeAction(i32) == 4) {
                            i10 = R.string.SwipeDeleteChat;
                            string = LocaleController.getString(i10);
                            w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Y5, e6Var5);
                            s2Var4.y1 = org.telegram.ui.ActionBar.i6.J1;
                        } else if (SharedConfig.getChatSwipeAction(i32) == 1) {
                            if (s2Var4.S0 > 0 || s2Var4.T0) {
                                i10 = R.string.SwipeMarkAsRead;
                                string = LocaleController.getString(i10);
                                s2Var4.y1 = org.telegram.ui.ActionBar.i6.L1;
                            } else {
                                i10 = R.string.SwipeMarkAsUnread;
                                string = LocaleController.getString(i10);
                                s2Var4.y1 = org.telegram.ui.ActionBar.i6.M1;
                            }
                        } else if (SharedConfig.getChatSwipeAction(i32) != 0) {
                            i10 = R.string.Archive;
                            string = LocaleController.getString(i10);
                            s2Var4.y1 = org.telegram.ui.ActionBar.i6.v1;
                        } else if (s2Var4.getIsPinned()) {
                            i10 = R.string.SwipeUnpin;
                            string = LocaleController.getString(i10);
                            s2Var4.y1 = org.telegram.ui.ActionBar.i6.O1;
                        } else {
                            i10 = R.string.SwipePin;
                            string = LocaleController.getString(i10);
                            s2Var4.y1 = org.telegram.ui.ActionBar.i6.N1;
                        }
                    }
                } else {
                    w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d9, e6Var5);
                    w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.c9, e6Var5);
                    i10 = R.string.Unarchive;
                    string = LocaleController.getString(i10);
                    s2Var4.y1 = org.telegram.ui.ActionBar.i6.w1;
                }
            }
            int i33 = i10;
            i12 = w03;
            i11 = i33;
            str = string;
            if (s2Var4.w) {
            }
            s2Var4.s = s2Var4.y1;
            s2Var4.v = i11;
            if (!s2Var4.z1) {
                s2Var4.z1 = true;
                s2Var4.y1.T(0.0f, true);
                s2Var4.y1.setCallback(s2Var4);
                s2Var4.y1.start();
            }
            float measuredWidth3 = s2Var4.getMeasuredWidth() + s2Var4.w1;
            if (s2Var4.B1 >= f7) {
            }
            int measuredWidth22 = (s2Var4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (s2Var4.y1.getIntrinsicWidth() / 2);
            int A2 = bi.A(52.0f, s2Var4.getMeasuredHeight(), 2);
            int intrinsicWidth2 = (s2Var4.y1.getIntrinsicWidth() / 2) + measuredWidth22;
            int intrinsicHeight2 = (s2Var4.y1.getIntrinsicHeight() / 2) + A2;
            if (s2Var4.B1 <= f10) {
            }
            canvas3.save();
            canvas3.translate(measuredWidth22, A2);
            f13 = s2Var4.C1;
            if (f13 != 0.0f) {
            }
            m2Var3 = m2Var2;
            boolean z252 = z10;
            a0.p(z252 ? 1 : 0, z252 ? 1 : 0, s2Var4.y1);
            s2Var4.y1.draw(canvas3);
            canvas3.restore();
            canvas3.clipRect(f12, 0.0f, s2Var4.getMeasuredWidth(), s2Var4.getMeasuredHeight());
            str4 = str3;
            ceil = (int) Math.ceil(org.telegram.ui.ActionBar.i6.M0.measureText(str4));
            i15 = i14;
            if (s2Var4.F4 == i15) {
            }
            s2Var4.F4 = i15;
            s2Var4.G4 = s2Var4.getMeasuredWidth();
            TextPaint textPaint2 = org.telegram.ui.ActionBar.i6.N0;
            int min2 = Math.min(AndroidUtilities.dp(80.0f), ceil);
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
            staticLayout = new StaticLayout(str4, textPaint2, min2, alignment2, 1.0f, 0.0f, false);
            s2Var4.E4 = staticLayout;
            if (staticLayout.getLineCount() > 1) {
            }
            if (s2Var4.E4 == null) {
            }
            canvas3.restore();
        }
        if (s2Var4.w1 != 0.0f) {
            canvas3.save();
            canvas3.translate(s2Var4.w1, 0.0f);
            f15 = 0.0f + s2Var4.w1;
        } else {
            f15 = 0.0f;
        }
        float dp2 = AndroidUtilities.dp(8.0f) * s2Var4.o1;
        boolean z26 = s2Var4.q4;
        RectF rectF2 = s2Var4.r4;
        if (z26) {
            f16 = 0.0f;
            rectF2.set(0.0f, 0.0f, s2Var4.getMeasuredWidth(), AndroidUtilities.lerp(s2Var4.getMeasuredHeight(), s2Var4.getCollapsedHeight(), s2Var4.i0));
            rectF2.offset(0.0f, (-s2Var4.E3) + s2Var4.C0);
            canvas3.drawRoundRect(rectF2, dp2, dp2, org.telegram.ui.ActionBar.i6.u0);
        } else {
            f16 = 0.0f;
        }
        canvas3.save();
        canvas3.translate(f16, (-s2Var4.n) * s2Var4.i0);
        if (s2Var4.J0 == 0 || (SharedConfig.archiveHidden && s2Var4.D1 == f16)) {
            e6Var2 = e6Var;
            if (s2Var4.getIsPinned() || s2Var4.z3) {
                org.telegram.ui.ActionBar.i6.v0.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.s9, e6Var2));
                org.telegram.ui.ActionBar.i6.v0.setAlpha((int) ((1.0f - s2Var4.i0) * r3.getAlpha()));
            }
        } else {
            e6Var2 = e6Var;
            float f30 = f7;
            org.telegram.ui.ActionBar.i6.v0.setColor(AndroidUtilities.getOffsetColor(0, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.s9, e6Var2), s2Var4.D1, f30));
            org.telegram.ui.ActionBar.i6.v0.setAlpha((int) ((f30 - s2Var4.i0) * r3.getAlpha()));
        }
        canvas3.restore();
        p2 p2Var4 = s2Var4.I4;
        p2Var4.b();
        if (s2Var4.C0 != 0.0f) {
            canvas3.save();
            canvas3.translate(0.0f, s2Var4.C0);
            f17 = s2Var4.C0 + 0.0f;
        } else {
            f17 = 0.0f;
        }
        float f31 = s2Var4.i0;
        if (f31 != 1.0f) {
            int i34 = -1;
            if (f31 != 0.0f) {
                float clamp = Utilities.clamp(f31 / 0.4f, 1.0f, 0.0f);
                if (SharedConfig.getDevicePerformanceClass() >= 2) {
                    f21 = f14;
                    i21 = -1;
                    p2Var = p2Var4;
                    f22 = 1.0f;
                    i34 = canvas3.saveLayerAlpha(com.google.android.gms.internal.vision.e2.b(1.0f, clamp, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(l41.getRightPaddingSize() + 1)), 0.0f, s2Var4.getMeasuredWidth(), s2Var4.getMeasuredHeight(), (int) ((1.0f - s2Var4.i0) * 255.0f), 31);
                    i20 = 1;
                } else {
                    p2Var = p2Var4;
                    f21 = f14;
                    i21 = -1;
                    f22 = 1.0f;
                    int save = canvas3.save();
                    i20 = 1;
                    canvas3.clipRect(com.google.android.gms.internal.vision.e2.b(1.0f, clamp, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(l41.getRightPaddingSize() + 1)), 0.0f, s2Var4.getMeasuredWidth(), s2Var4.getMeasuredHeight());
                    i34 = save;
                }
                canvas3.translate((-(s2Var4.getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * s2Var4.i0, 0.0f);
                f15 += (-(s2Var4.getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * s2Var4.i0;
            } else {
                p2Var = p2Var4;
                f21 = f14;
                f22 = 1.0f;
                i20 = 1;
                i21 = -1;
            }
            float f32 = f15;
            if (s2Var4.w1 != 0.0f || s2Var4.o1 != 0.0f) {
                canvas3.save();
                org.telegram.ui.ActionBar.i6.v0.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, e6Var2));
                rectF2.set(s2Var4.getMeasuredWidth() - AndroidUtilities.dp(64.0f), 0.0f, s2Var4.getMeasuredWidth(), s2Var4.getMeasuredHeight());
                rectF2.offset(0.0f, -s2Var4.E3);
                canvas3.drawRoundRect(rectF2, dp2, dp2, org.telegram.ui.ActionBar.i6.v0);
                if (s2Var4.q4) {
                    canvas3.drawRoundRect(rectF2, dp2, dp2, org.telegram.ui.ActionBar.i6.u0);
                }
                if (s2Var4.J0 != 0 && (!SharedConfig.archiveHidden || s2Var4.D1 != 0.0f)) {
                    org.telegram.ui.ActionBar.i6.v0.setColor(AndroidUtilities.getOffsetColor(0, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.s9, e6Var2), s2Var4.D1, f22));
                    org.telegram.ui.ActionBar.i6.v0.setAlpha((int) ((f22 - s2Var4.i0) * r0.getAlpha()));
                } else if (s2Var4.getIsPinned() || s2Var4.z3) {
                    org.telegram.ui.ActionBar.i6.v0.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.s9, e6Var2));
                    org.telegram.ui.ActionBar.i6.v0.setAlpha((int) ((f22 - s2Var4.i0) * r0.getAlpha()));
                }
                canvas3.restore();
            }
            if (s2Var4.w1 != 0.0f) {
                float f33 = s2Var4.o1;
                if (f33 < f22) {
                    float f34 = f33 + 0.10666667f;
                    s2Var4.o1 = f34;
                    if (f34 > f22) {
                        s2Var4.o1 = f22;
                    }
                    i18 = i20;
                }
                i18 = 0;
            } else {
                float f35 = s2Var4.o1;
                if (f35 > 0.0f) {
                    float f36 = f35 - 0.10666667f;
                    s2Var4.o1 = f36;
                    if (f36 < 0.0f) {
                        s2Var4.o1 = 0.0f;
                    }
                    i18 = i20;
                }
                i18 = 0;
            }
            if (s2Var4.G2) {
                a0.p(s2Var4.J2, s2Var4.K2, org.telegram.ui.ActionBar.i6.a1);
                org.telegram.ui.ActionBar.i6.a1.draw(canvas3);
            }
            boolean z27 = s2Var4.r2;
            int dp3 = AndroidUtilities.dp((z27 || SharedConfig.useThreeLinesLayout) ? 10.0f : 14.0f);
            if (((!z27 && !SharedConfig.useThreeLinesLayout) || s2Var4.Q()) && s2Var4.M()) {
                dp3 -= AndroidUtilities.dp(s2Var4.Q() ? 8.0f : 9.0f);
            }
            if (s2Var4.z2 != null) {
                if (!s2Var4.D2 || s2Var4.A2) {
                    f23 = 24.0f;
                    i22 = i34;
                } else {
                    if (s2Var4.C2 && s2Var4.E2 == null) {
                        Paint paint = new Paint();
                        s2Var4.E2 = paint;
                        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{i21, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        s2Var4.E2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    } else if (s2Var4.F2 == null) {
                        Paint paint2 = new Paint();
                        s2Var4.F2 = paint2;
                        paint2.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{0, i21}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        s2Var4.F2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    f23 = 24.0f;
                    i22 = i34;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, s2Var4.getMeasuredWidth(), s2Var4.getMeasuredHeight(), 255, 31);
                    int i35 = s2Var4.x2;
                    canvas3.clipRect(i35, 0, s2Var4.y2 + i35, s2Var4.getMeasuredHeight());
                }
                if (s2Var4.J0 != 0) {
                    TextPaint textPaint3 = org.telegram.ui.ActionBar.i6.B0[s2Var4.E0];
                    int w04 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Y8, e6Var2);
                    textPaint3.linkColor = w04;
                    textPaint3.setColor(w04);
                } else if (s2Var4.h2 != null || ((n2Var = s2Var4.G0) != null && n2Var.g == 2)) {
                    TextPaint textPaint4 = org.telegram.ui.ActionBar.i6.B0[s2Var4.E0];
                    int w05 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Z8, e6Var2);
                    textPaint4.linkColor = w05;
                    textPaint4.setColor(w05);
                } else {
                    TextPaint textPaint5 = org.telegram.ui.ActionBar.i6.B0[s2Var4.E0];
                    int w06 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.X8, e6Var2);
                    textPaint5.linkColor = w06;
                    textPaint5.setColor(w06);
                }
                canvas3.save();
                canvas3.translate(s2Var4.x2 + s2Var4.B2, dp3);
                vh.g.f(canvas3, s2Var4.z2);
                StaticLayout staticLayout3 = s2Var4.z2;
                z17 = z27;
                i23 = i21;
                p2Var2 = p2Var;
                i24 = i20;
                org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas3, staticLayout3, s2Var4.p3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, s2Var4.K(0, staticLayout3.getPaint().getColor()));
                canvas3.restore();
                if (s2Var4.D2 && !s2Var4.A2) {
                    canvas3.save();
                    if (s2Var4.C2) {
                        canvas3.translate(s2Var4.x2, 0.0f);
                        canvas3.drawRect(0.0f, 0.0f, AndroidUtilities.dp(f23), s2Var4.getMeasuredHeight(), s2Var4.E2);
                    } else {
                        canvas3.translate((s2Var4.x2 + s2Var4.y2) - AndroidUtilities.dp(f23), 0.0f);
                        canvas3.drawRect(0.0f, 0.0f, AndroidUtilities.dp(f23), s2Var4.getMeasuredHeight(), s2Var4.F2);
                    }
                    canvas3.restore();
                    canvas3.restore();
                }
            } else {
                f23 = 24.0f;
                i22 = i34;
                z17 = z27;
                i23 = i21;
                p2Var2 = p2Var;
                i24 = i20;
            }
            if (s2Var4.N2 != null && s2Var4.J0 == 0) {
                canvas3.save();
                canvas3.translate(s2Var4.L2, s2Var4.M2);
                TextPaint timeTextPaint = s2Var4.getTimeTextPaint();
                if (s2Var4.getIsPinned()) {
                    canvas3.translate(AndroidUtilities.dp(20.0f), 0.0f);
                    float height = (s2Var4.N2.getHeight() / f21) - AndroidUtilities.dp(8.5f);
                    float f37 = -AndroidUtilities.dp(20.0f);
                    float dp4 = AndroidUtilities.dp(6.0f) + s2Var4.N2.getWidth();
                    Drawable drawable = (!s2Var4.G3 || s2Var4.N()) ? org.telegram.ui.ActionBar.i6.k1 : org.telegram.ui.ActionBar.i6.l1;
                    int dp5 = (int) (((AndroidUtilities.dp(17.0f) - drawable.getIntrinsicHeight()) / f21) + height);
                    int dp6 = AndroidUtilities.dp(4.0f) + ((int) f37);
                    drawable.setBounds(dp6, dp5, drawable.getIntrinsicWidth() + dp6, drawable.getIntrinsicHeight() + dp5);
                    int alpha = timeTextPaint.getAlpha();
                    timeTextPaint.setAlpha(27);
                    canvas3.drawRoundRect(f37, height, dp4, height + AndroidUtilities.dp(17.0f), AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), timeTextPaint);
                    timeTextPaint.setAlpha(alpha);
                    drawable.draw(canvas3);
                }
                int color = s2Var4.N2.getPaint().getColor();
                int i36 = color != timeTextPaint.getColor() ? i24 : 0;
                if (i36 != 0) {
                    s2Var4.N2.getPaint().setColor(timeTextPaint.getColor());
                }
                vh.g.f(canvas3, s2Var4.N2);
                if (i36 != 0) {
                    s2Var4.N2.getPaint().setColor(color);
                }
                canvas3.restore();
            }
            if (s2Var4.F()) {
                org.telegram.ui.ActionBar.i6.b1.setBounds(s2Var4.O2, ((s2Var4.N2.getHeight() - org.telegram.ui.ActionBar.i6.b1.getIntrinsicHeight()) / 2) + s2Var4.M2, org.telegram.ui.ActionBar.i6.b1.getIntrinsicWidth() + s2Var4.O2, org.telegram.ui.ActionBar.i6.b1.getIntrinsicHeight() + ((s2Var4.N2.getHeight() - org.telegram.ui.ActionBar.i6.b1.getIntrinsicHeight()) / 2) + s2Var4.M2);
                org.telegram.ui.ActionBar.i6.b1.draw(canvas3);
            }
            if (s2Var4.s3 != null && !s2Var4.Q()) {
                if (s2Var4.J0 != 0) {
                    TextPaint textPaint6 = org.telegram.ui.ActionBar.i6.G0;
                    int w07 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.n9, e6Var2);
                    textPaint6.linkColor = w07;
                    textPaint6.setColor(w07);
                } else if (s2Var4.l2 != null) {
                    TextPaint textPaint7 = org.telegram.ui.ActionBar.i6.G0;
                    int w08 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.j9, e6Var2);
                    textPaint7.linkColor = w08;
                    textPaint7.setColor(w08);
                } else {
                    TextPaint textPaint8 = org.telegram.ui.ActionBar.i6.G0;
                    int w09 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.m9, e6Var2);
                    textPaint8.linkColor = w09;
                    textPaint8.setColor(w09);
                }
                canvas3.save();
                canvas3.translate(s2Var4.r3, s2Var4.q3);
                try {
                    vh.g.f(canvas3, s2Var4.s3);
                    StaticLayout staticLayout4 = s2Var4.s3;
                    org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas3, staticLayout4, s2Var4.n3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, s2Var4.K(i24, staticLayout4.getPaint().getColor()));
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                canvas3.restore();
            }
            if (s2Var4.e3 != null) {
                if (s2Var4.J0 == 0) {
                    TextPaint textPaint9 = org.telegram.ui.ActionBar.i6.F0[s2Var4.E0];
                    int w010 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.g9, e6Var2);
                    textPaint9.linkColor = w010;
                    textPaint9.setColor(w010);
                } else if (s2Var4.g2 != null) {
                    TextPaint textPaint10 = org.telegram.ui.ActionBar.i6.F0[s2Var4.E0];
                    int w011 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.l9, e6Var2);
                    textPaint10.linkColor = w011;
                    textPaint10.setColor(w011);
                } else {
                    TextPaint textPaint11 = org.telegram.ui.ActionBar.i6.F0[s2Var4.E0];
                    int w012 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.h9, e6Var2);
                    textPaint11.linkColor = w012;
                    textPaint11.setColor(w012);
                }
                float dp7 = AndroidUtilities.dp(14.0f);
                p2 p2Var5 = p2Var2;
                float f38 = p2Var5.m ? s2Var4.a3 - (p2Var5.l * dp7) : s2Var4.a3 + (p2Var5.l * dp7);
                if (((!z17 && !SharedConfig.useThreeLinesLayout) || s2Var4.Q()) && s2Var4.M()) {
                    f38 -= AndroidUtilities.dp(s2Var4.Q() ? 10.0f : 11.0f);
                }
                if (p2Var5.l != 1.0f) {
                    canvas3.save();
                    canvas3.translate(s2Var4.b3, f38);
                    int alpha2 = s2Var4.e3.getPaint().getAlpha();
                    s2Var4.e3.getPaint().setAlpha((int) ((1.0f - p2Var5.l) * alpha2));
                    ArrayList arrayList = s2Var4.j3;
                    if (arrayList.isEmpty()) {
                        f27 = dp7;
                        rectF = rectF2;
                        e6Var4 = e6Var2;
                        m2Var4 = m2Var3;
                        p2Var3 = p2Var5;
                        i28 = alpha2;
                        f24 = 1.0f;
                        vh.g.f(canvas3, s2Var4.e3);
                        StaticLayout staticLayout5 = s2Var4.e3;
                        org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas3, staticLayout5, s2Var4.m3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, s2Var4.K(2, staticLayout5.getPaint().getColor()));
                    } else {
                        try {
                            canvas3.save();
                            vh.g.d(canvas3, arrayList);
                            vh.g.f(canvas3, s2Var4.e3);
                            try {
                                StaticLayout staticLayout6 = s2Var4.e3;
                                try {
                                    e6Var4 = e6Var2;
                                    f27 = dp7;
                                    f24 = 1.0f;
                                    m2Var4 = m2Var3;
                                    i28 = alpha2;
                                    rectF = rectF2;
                                    p2Var3 = p2Var5;
                                } catch (Exception e10) {
                                    e = e10;
                                    f27 = dp7;
                                    rectF = rectF2;
                                    e6Var4 = e6Var2;
                                    m2Var4 = m2Var3;
                                    p2Var3 = p2Var5;
                                    i28 = alpha2;
                                    f24 = 1.0f;
                                    FileLog.e(e);
                                    s2Var4.e3.getPaint().setAlpha(i28);
                                    canvas3.restore();
                                    canvas3.save();
                                    if (!p2Var3.m) {
                                    }
                                    if (!z17) {
                                        y3 -= AndroidUtilities.dp(s2Var4.Q() ? 10.0f : 11.0f);
                                        canvas3.translate(s2Var4.d3, y3);
                                        staticLayout2 = s2Var4.f3;
                                        if (staticLayout2 != null) {
                                            int alpha3 = staticLayout2.getPaint().getAlpha();
                                            s2Var4.f3.getPaint().setAlpha((int) (alpha3 * p2Var3.l));
                                            s2Var4.f3.draw(canvas3);
                                            s2Var4.f3.getPaint().setAlpha(alpha3);
                                        }
                                        canvas3.restore();
                                        if (s2Var4.f3 != null) {
                                            if (i27 < 0) {
                                            }
                                            u02 = org.telegram.ui.ActionBar.i6.u0(i27);
                                            if (u02 != null) {
                                            }
                                        }
                                        if (s2Var4.h3 != null) {
                                        }
                                        if (s2Var4.J0 == 0) {
                                        }
                                        float f39 = 12.5f;
                                        if (s2Var3.k4) {
                                        }
                                        e6Var3 = e6Var4;
                                        if (s2Var3.b1) {
                                        }
                                        if (s2Var3.j1 != 2) {
                                        }
                                        i16 = 17;
                                        if (!s2Var3.j4) {
                                        }
                                        z13 = z18 ? 1 : 0;
                                        if (!s2Var3.y3) {
                                        }
                                        if (!LocaleController.isRTL) {
                                        }
                                        org.telegram.ui.ActionBar.i6.Z0.setAlpha((int) (s2Var3.x3 * 255.0f));
                                        a0.p(s2Var3.D3, s2Var3.C3, org.telegram.ui.ActionBar.i6.Z0);
                                        org.telegram.ui.ActionBar.i6.Z0.draw(canvas3);
                                        float f40 = s2Var3.S3.e;
                                        if (s2Var3.t3) {
                                        }
                                        s2Var = s2Var3;
                                        f18 = f24;
                                        if (s2Var.H3) {
                                        }
                                        if (s2Var.R1 > 0) {
                                        }
                                        xsVar = s2Var.t0;
                                        if (xsVar != null) {
                                        }
                                        i25 = i22;
                                        r12 = z18;
                                        if (i25 != -1) {
                                        }
                                        z14 = s2Var.b2;
                                        imageReceiver = s2Var.Y1;
                                        if (z14) {
                                        }
                                        z15 = s2Var.x;
                                        k2Var = s2Var.u0;
                                        if (z15) {
                                            if (!s2Var.y) {
                                            }
                                            if (!s2Var.O0) {
                                                float centerX = k2Var.F.centerX() + AndroidUtilities.dp(20.33f);
                                                float centerY = k2Var.F.centerY() + AndroidUtilities.dp(19.0f);
                                                if (s2Var.D0 == null) {
                                                }
                                                yf.p.d(s2Var.D0, centerX, centerY, i16);
                                                canvas3.drawCircle(s2Var.D0.getBounds().exactCenterX(), s2Var.D0.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.i6.m0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, e6Var3)));
                                                s2Var.D0.draw(canvas3);
                                            }
                                        }
                                        if (s2Var.b2) {
                                        }
                                        if (imageReceiver.getVisible()) {
                                            i18 = 1;
                                        }
                                        if (s2Var.i0 > 0.0f) {
                                        }
                                        s2Var2 = s2Var;
                                        if (s2Var2.C0 != 0.0f) {
                                        }
                                        if (s2Var2.w1 != 0.0f) {
                                        }
                                        if (z11) {
                                            canvas3.save();
                                            canvas3.translate(0.0f, (-s2Var2.E3) - (s2Var2.n * s2Var2.i0));
                                            canvas3.clipRect(0.0f, (f18 - s2Var2.e2.J) * s2Var2.getMeasuredHeight(), s2Var2.getMeasuredWidth(), s2Var2.getMeasuredHeight());
                                            s2Var2.e2.c(canvas3, r12);
                                            canvas3.restore();
                                        }
                                        if (s2Var2.s2) {
                                        }
                                        f19 = 0.0f;
                                        i19 = 1;
                                        if (s2Var2.t1 != f19) {
                                        }
                                        canvas2 = canvas;
                                        if (z24) {
                                        }
                                        z16 = s2Var2.y3;
                                        if (!z16) {
                                        }
                                        if (z16) {
                                        }
                                        i18 = i19;
                                        if (s2Var2.m1) {
                                        }
                                    }
                                    y3 -= AndroidUtilities.dp(s2Var4.Q() ? 10.0f : 11.0f);
                                    canvas3.translate(s2Var4.d3, y3);
                                    staticLayout2 = s2Var4.f3;
                                    if (staticLayout2 != null) {
                                    }
                                    canvas3.restore();
                                    if (s2Var4.f3 != null) {
                                    }
                                    if (s2Var4.h3 != null) {
                                    }
                                    if (s2Var4.J0 == 0) {
                                    }
                                    float f392 = 12.5f;
                                    if (s2Var3.k4) {
                                    }
                                    e6Var3 = e6Var4;
                                    if (s2Var3.b1) {
                                    }
                                    if (s2Var3.j1 != 2) {
                                    }
                                    i16 = 17;
                                    if (!s2Var3.j4) {
                                    }
                                    z13 = z18 ? 1 : 0;
                                    if (!s2Var3.y3) {
                                    }
                                    if (!LocaleController.isRTL) {
                                    }
                                    org.telegram.ui.ActionBar.i6.Z0.setAlpha((int) (s2Var3.x3 * 255.0f));
                                    a0.p(s2Var3.D3, s2Var3.C3, org.telegram.ui.ActionBar.i6.Z0);
                                    org.telegram.ui.ActionBar.i6.Z0.draw(canvas3);
                                    float f402 = s2Var3.S3.e;
                                    if (s2Var3.t3) {
                                    }
                                    s2Var = s2Var3;
                                    f18 = f24;
                                    if (s2Var.H3) {
                                    }
                                    if (s2Var.R1 > 0) {
                                    }
                                    xsVar = s2Var.t0;
                                    if (xsVar != null) {
                                    }
                                    i25 = i22;
                                    r12 = z18;
                                    if (i25 != -1) {
                                    }
                                    z14 = s2Var.b2;
                                    imageReceiver = s2Var.Y1;
                                    if (z14) {
                                    }
                                    z15 = s2Var.x;
                                    k2Var = s2Var.u0;
                                    if (z15) {
                                    }
                                    if (s2Var.b2) {
                                    }
                                    if (imageReceiver.getVisible()) {
                                    }
                                    if (s2Var.i0 > 0.0f) {
                                    }
                                    s2Var2 = s2Var;
                                    if (s2Var2.C0 != 0.0f) {
                                    }
                                    if (s2Var2.w1 != 0.0f) {
                                    }
                                    if (z11) {
                                    }
                                    if (s2Var2.s2) {
                                    }
                                    f19 = 0.0f;
                                    i19 = 1;
                                    if (s2Var2.t1 != f19) {
                                    }
                                    canvas2 = canvas;
                                    if (z24) {
                                    }
                                    z16 = s2Var2.y3;
                                    if (!z16) {
                                    }
                                    if (z16) {
                                    }
                                    i18 = i19;
                                    if (s2Var2.m1) {
                                    }
                                }
                                try {
                                    org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas3, staticLayout6, s2Var4.m3, -0.075f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, s2Var4.K(2, staticLayout6.getPaint().getColor()));
                                    canvas3.restore();
                                    for (int i37 = 0; i37 < arrayList.size(); i37++) {
                                        vh.g gVar = (vh.g) arrayList.get(i37);
                                        gVar.h(s2Var4.e3.getPaint().getColor());
                                        gVar.draw(canvas3);
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    FileLog.e(e);
                                    s2Var4.e3.getPaint().setAlpha(i28);
                                    canvas3.restore();
                                    canvas3.save();
                                    if (!p2Var3.m) {
                                    }
                                    if (!z17) {
                                    }
                                    y3 -= AndroidUtilities.dp(s2Var4.Q() ? 10.0f : 11.0f);
                                    canvas3.translate(s2Var4.d3, y3);
                                    staticLayout2 = s2Var4.f3;
                                    if (staticLayout2 != null) {
                                    }
                                    canvas3.restore();
                                    if (s2Var4.f3 != null) {
                                    }
                                    if (s2Var4.h3 != null) {
                                    }
                                    if (s2Var4.J0 == 0) {
                                    }
                                    float f3922 = 12.5f;
                                    if (s2Var3.k4) {
                                    }
                                    e6Var3 = e6Var4;
                                    if (s2Var3.b1) {
                                    }
                                    if (s2Var3.j1 != 2) {
                                    }
                                    i16 = 17;
                                    if (!s2Var3.j4) {
                                    }
                                    z13 = z18 ? 1 : 0;
                                    if (!s2Var3.y3) {
                                    }
                                    if (!LocaleController.isRTL) {
                                    }
                                    org.telegram.ui.ActionBar.i6.Z0.setAlpha((int) (s2Var3.x3 * 255.0f));
                                    a0.p(s2Var3.D3, s2Var3.C3, org.telegram.ui.ActionBar.i6.Z0);
                                    org.telegram.ui.ActionBar.i6.Z0.draw(canvas3);
                                    float f4022 = s2Var3.S3.e;
                                    if (s2Var3.t3) {
                                    }
                                    s2Var = s2Var3;
                                    f18 = f24;
                                    if (s2Var.H3) {
                                    }
                                    if (s2Var.R1 > 0) {
                                    }
                                    xsVar = s2Var.t0;
                                    if (xsVar != null) {
                                    }
                                    i25 = i22;
                                    r12 = z18;
                                    if (i25 != -1) {
                                    }
                                    z14 = s2Var.b2;
                                    imageReceiver = s2Var.Y1;
                                    if (z14) {
                                    }
                                    z15 = s2Var.x;
                                    k2Var = s2Var.u0;
                                    if (z15) {
                                    }
                                    if (s2Var.b2) {
                                    }
                                    if (imageReceiver.getVisible()) {
                                    }
                                    if (s2Var.i0 > 0.0f) {
                                    }
                                    s2Var2 = s2Var;
                                    if (s2Var2.C0 != 0.0f) {
                                    }
                                    if (s2Var2.w1 != 0.0f) {
                                    }
                                    if (z11) {
                                    }
                                    if (s2Var2.s2) {
                                    }
                                    f19 = 0.0f;
                                    i19 = 1;
                                    if (s2Var2.t1 != f19) {
                                    }
                                    canvas2 = canvas;
                                    if (z24) {
                                    }
                                    z16 = s2Var2.y3;
                                    if (!z16) {
                                    }
                                    if (z16) {
                                    }
                                    i18 = i19;
                                    if (s2Var2.m1) {
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                                f27 = dp7;
                                rectF = rectF2;
                                e6Var4 = e6Var2;
                                m2Var4 = m2Var3;
                                p2Var3 = p2Var5;
                                i28 = alpha2;
                                f24 = 1.0f;
                                FileLog.e(e);
                                s2Var4.e3.getPaint().setAlpha(i28);
                                canvas3.restore();
                                canvas3.save();
                                if (!p2Var3.m) {
                                }
                                if (!z17) {
                                }
                                y3 -= AndroidUtilities.dp(s2Var4.Q() ? 10.0f : 11.0f);
                                canvas3.translate(s2Var4.d3, y3);
                                staticLayout2 = s2Var4.f3;
                                if (staticLayout2 != null) {
                                }
                                canvas3.restore();
                                if (s2Var4.f3 != null) {
                                }
                                if (s2Var4.h3 != null) {
                                }
                                if (s2Var4.J0 == 0) {
                                }
                                float f39222 = 12.5f;
                                if (s2Var3.k4) {
                                }
                                e6Var3 = e6Var4;
                                if (s2Var3.b1) {
                                }
                                if (s2Var3.j1 != 2) {
                                }
                                i16 = 17;
                                if (!s2Var3.j4) {
                                }
                                z13 = z18 ? 1 : 0;
                                if (!s2Var3.y3) {
                                }
                                if (!LocaleController.isRTL) {
                                }
                                org.telegram.ui.ActionBar.i6.Z0.setAlpha((int) (s2Var3.x3 * 255.0f));
                                a0.p(s2Var3.D3, s2Var3.C3, org.telegram.ui.ActionBar.i6.Z0);
                                org.telegram.ui.ActionBar.i6.Z0.draw(canvas3);
                                float f40222 = s2Var3.S3.e;
                                if (s2Var3.t3) {
                                }
                                s2Var = s2Var3;
                                f18 = f24;
                                if (s2Var.H3) {
                                }
                                if (s2Var.R1 > 0) {
                                }
                                xsVar = s2Var.t0;
                                if (xsVar != null) {
                                }
                                i25 = i22;
                                r12 = z18;
                                if (i25 != -1) {
                                }
                                z14 = s2Var.b2;
                                imageReceiver = s2Var.Y1;
                                if (z14) {
                                }
                                z15 = s2Var.x;
                                k2Var = s2Var.u0;
                                if (z15) {
                                }
                                if (s2Var.b2) {
                                }
                                if (imageReceiver.getVisible()) {
                                }
                                if (s2Var.i0 > 0.0f) {
                                }
                                s2Var2 = s2Var;
                                if (s2Var2.C0 != 0.0f) {
                                }
                                if (s2Var2.w1 != 0.0f) {
                                }
                                if (z11) {
                                }
                                if (s2Var2.s2) {
                                }
                                f19 = 0.0f;
                                i19 = 1;
                                if (s2Var2.t1 != f19) {
                                }
                                canvas2 = canvas;
                                if (z24) {
                                }
                                z16 = s2Var2.y3;
                                if (!z16) {
                                }
                                if (z16) {
                                }
                                i18 = i19;
                                if (s2Var2.m1) {
                                }
                            }
                        } catch (Exception e13) {
                            e = e13;
                            f27 = dp7;
                        }
                    }
                    s2Var4.e3.getPaint().setAlpha(i28);
                    canvas3.restore();
                } else {
                    f27 = dp7;
                    rectF = rectF2;
                    e6Var4 = e6Var2;
                    m2Var4 = m2Var3;
                    p2Var3 = p2Var5;
                    f24 = 1.0f;
                }
                canvas3.save();
                y3 = !p2Var3.m ? com.google.android.gms.internal.vision.e2.y(f24, p2Var3.l, f27, s2Var4.a3) : com.google.android.gms.internal.vision.e2.b(f24, p2Var3.l, f27, s2Var4.a3);
                if (((!z17 && !SharedConfig.useThreeLinesLayout) || s2Var4.Q()) && s2Var4.M()) {
                    y3 -= AndroidUtilities.dp(s2Var4.Q() ? 10.0f : 11.0f);
                }
                canvas3.translate(s2Var4.d3, y3);
                staticLayout2 = s2Var4.f3;
                if (staticLayout2 != null && p2Var3.l > 0.0f) {
                    int alpha32 = staticLayout2.getPaint().getAlpha();
                    s2Var4.f3.getPaint().setAlpha((int) (alpha32 * p2Var3.l));
                    s2Var4.f3.draw(canvas3);
                    s2Var4.f3.getPaint().setAlpha(alpha32);
                }
                canvas3.restore();
                if (s2Var4.f3 != null && ((i27 = s2Var4.j2) >= 0 || (p2Var3.l > 0.0f && p2Var3.n >= 0))) {
                    if (i27 < 0) {
                        i27 = p2Var3.n;
                    }
                    u02 = org.telegram.ui.ActionBar.i6.u0(i27);
                    if (u02 != null) {
                        canvas3.save();
                        u02.b(i0.a.k(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.p9), (int) (Color.alpha(r4) * p2Var3.l)));
                        float y10 = p2Var3.m ? com.google.android.gms.internal.vision.e2.y(f24, p2Var3.l, f27, s2Var4.a3) : com.google.android.gms.internal.vision.e2.b(f24, p2Var3.l, f27, s2Var4.a3);
                        if (((!z17 && !SharedConfig.useThreeLinesLayout) || s2Var4.Q()) && s2Var4.M()) {
                            y10 -= AndroidUtilities.dp(s2Var4.Q() ? 10.0f : 11.0f);
                        }
                        if (i27 == 1 || i27 == 4) {
                            canvas3.translate(s2Var4.C4, y10 + (i27 == 1 ? AndroidUtilities.dp(f24) : 0));
                        } else {
                            canvas3.translate(s2Var4.C4, ((AndroidUtilities.dp(18.0f) - u02.getIntrinsicHeight()) / f21) + y10);
                        }
                        u02.draw(canvas3);
                        s2Var4.invalidate();
                        canvas3.restore();
                    }
                }
            } else {
                rectF = rectF2;
                e6Var4 = e6Var2;
                m2Var4 = m2Var3;
                p2Var3 = p2Var2;
                f24 = 1.0f;
            }
            if (s2Var4.h3 != null) {
                canvas3.save();
                if (s2Var4.b0 == null) {
                    s2Var4.b0 = new Paint(1);
                }
                if (s2Var4.c0 == null) {
                    id idVar = new id(s2Var4);
                    s2Var4.c0 = idVar;
                    z22 = false;
                    final boolean z28 = false ? 1 : 0;
                    idVar.e(new Runnable(s2Var4) { // from class: org.telegram.ui.Cells.i2
                        public final /* synthetic */ s2 b;

                        {
                            this.b = s2Var4;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (z28) {
                                case 0:
                                    s2 s2Var5 = this.b;
                                    o2 o2Var = s2Var5.d0;
                                    if (o2Var != null) {
                                        o2Var.d(s2Var5);
                                        break;
                                    }
                                    break;
                                default:
                                    s2 s2Var6 = this.b;
                                    o2 o2Var2 = s2Var6.d0;
                                    if (o2Var2 != null) {
                                        o2Var2.a(s2Var6);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    id idVar2 = s2Var4.c0;
                    final int i38 = 1;
                    Runnable runnable = new Runnable(s2Var4) { // from class: org.telegram.ui.Cells.i2
                        public final /* synthetic */ s2 b;

                        {
                            this.b = s2Var4;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i38) {
                                case 0:
                                    s2 s2Var5 = this.b;
                                    o2 o2Var = s2Var5.d0;
                                    if (o2Var != null) {
                                        o2Var.d(s2Var5);
                                        break;
                                    }
                                    break;
                                default:
                                    s2 s2Var6 = this.b;
                                    o2 o2Var2 = s2Var6.d0;
                                    if (o2Var2 != null) {
                                        o2Var2.a(s2Var6);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    idVar2.l = true;
                    idVar2.j = runnable;
                } else {
                    z22 = false;
                }
                if (s2Var4.f0 && s2Var4.M4 != 0 && ((i26 = s2Var4.j1) == 0 || i26 == 7 || i26 == 8)) {
                    s2Var4.c0.d(i0.a.k(s2Var4.a0.getColor(), org.telegram.ui.ActionBar.i6.f1() ? 36 : 26));
                    id idVar3 = s2Var4.c0;
                    idVar3.i = z22;
                    idVar3.c = z22 ? 1 : 0;
                    int i39 = s2Var4.M4;
                    if (i39 != 0 && i39 > 0) {
                        float f41 = s2Var4.a3;
                        if (((!z17 && !SharedConfig.useThreeLinesLayout) || s2Var4.Q()) && s2Var4.M()) {
                            f41 -= AndroidUtilities.dp(s2Var4.Q() ? 10.0f : 11.0f);
                        }
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        float primaryHorizontal = s2Var4.e3.getPrimaryHorizontal(z22 ? 1 : 0) + AndroidUtilities.dp(f21) + s2Var4.b3;
                        float f42 = s2Var4.b3;
                        StaticLayout staticLayout7 = s2Var4.e3;
                        rectF3.set(primaryHorizontal, f41, (staticLayout7.getPrimaryHorizontal(Math.min(staticLayout7.getText().length(), s2Var4.M4)) + f42) - AndroidUtilities.dp(3.0f), s2Var4.g3 - AndroidUtilities.dp(4.0f));
                        rectF3.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
                        if (rectF3.right > rectF3.left) {
                            s2Var4.c0.a(rectF3);
                        }
                    }
                    float lineLeft = s2Var4.h3.getLineLeft(z22 ? 1 : 0);
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.set(s2Var4.c3 + lineLeft + AndroidUtilities.dp(f21), AndroidUtilities.dp(f21) + s2Var4.g3, s2Var4.h3.getLineWidth(z22 ? 1 : 0) + s2Var4.c3 + lineLeft + AndroidUtilities.dp(12.0f), s2Var4.h3.getHeight() + s2Var4.g3);
                    rectF4.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(3.0f));
                    s2Var4.c0.a(rectF4);
                    id idVar4 = s2Var4.c0;
                    idVar4.c(canvas3, idVar4.g);
                    z zVar = idVar4.e;
                    if (zVar != null) {
                        zVar.draw(canvas3);
                    }
                    org.telegram.ui.ActionBar.i6.t1.setAlpha(125);
                    a0.q(org.telegram.ui.ActionBar.i6.t1, rectF4.right - AndroidUtilities.dp(18.0f), com.google.android.gms.internal.vision.e2.z(rectF4.height(), org.telegram.ui.ActionBar.i6.t1.getIntrinsicHeight(), f21, rectF4.top));
                    org.telegram.ui.ActionBar.i6.t1.draw(canvas3);
                }
                canvas3.translate(s2Var4.c3, s2Var4.g3);
                ArrayList arrayList2 = s2Var4.l3;
                if (arrayList2.isEmpty()) {
                    vh.g.f(canvas3, s2Var4.h3);
                    StaticLayout staticLayout8 = s2Var4.h3;
                    org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas3, staticLayout8, s2Var4.o3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, s2Var4.K(3, staticLayout8.getPaint().getColor()));
                } else {
                    try {
                        canvas3.save();
                        vh.g.d(canvas3, arrayList2);
                        vh.g.f(canvas3, s2Var4.h3);
                        StaticLayout staticLayout9 = s2Var4.h3;
                        org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas3, staticLayout9, s2Var4.o3, -0.075f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, s2Var4.K(3, staticLayout9.getPaint().getColor()));
                        canvas3.restore();
                        for (int i40 = z22 ? 1 : 0; i40 < arrayList2.size(); i40++) {
                            vh.g gVar2 = (vh.g) arrayList2.get(i40);
                            gVar2.h(s2Var4.h3.getPaint().getColor());
                            gVar2.draw(canvas3);
                        }
                    } catch (Exception e14) {
                        FileLog.e(e14);
                    }
                }
                canvas.restore();
                z18 = z22;
            } else {
                z18 = false;
            }
            if (s2Var4.J0 == 0) {
                int i41 = (s2Var4.S2 ? 1 : 0) + (s2Var4.Q2 ? 2 : z18 ? 1 : 0) + (s2Var4.R2 ? 4 : z18 ? 1 : 0);
                int i42 = s2Var4.x4;
                if (i42 >= 0 && i42 != i41 && !s2Var4.z4) {
                    s2Var4.B(i42, i41);
                }
                boolean z29 = s2Var4.z4;
                if (z29) {
                    i41 = s2Var4.v4;
                }
                boolean z30 = (i41 & 1) != 0 ? true : z18 ? 1 : 0;
                boolean z31 = (i41 & 2) != 0 ? true : z18 ? 1 : 0;
                boolean z32 = (i41 & 4) != 0 ? true : z18 ? 1 : 0;
                if (z29) {
                    int i43 = s2Var4.w4;
                    boolean z33 = (i43 & 1) != 0 ? true : z18 ? 1 : 0;
                    boolean z34 = (i43 & 2) != 0 ? true : z18 ? 1 : 0;
                    i17 = 4;
                    if ((i43 & 4) != 0) {
                        z20 = z32;
                        z21 = true;
                    } else {
                        z20 = z32;
                        z21 = z18 ? 1 : 0;
                    }
                    if (z30 || z33 || !z21 || z34 || !z31 || !z20) {
                        boolean z35 = z31;
                        boolean z36 = z34;
                        canvas3 = canvas;
                        s2Var4.D(canvas3, z33, z36, z21, false, f24 - s2Var4.y4);
                        s2Var4.D(canvas3, z30, z35, z20, false, s2Var4.y4);
                        s2Var3 = this;
                        s2Var3.x4 = (s2Var3.S2 ? 1 : 0) + (!s2Var3.Q2 ? 2 : z18 ? 1 : 0) + (!s2Var3.R2 ? i17 : z18 ? 1 : 0);
                    } else {
                        canvas3 = canvas;
                        s2Var4.D(canvas3, z30, z31, z20, true, s2Var4.y4);
                    }
                } else {
                    i17 = 4;
                    s2Var4 = this;
                    canvas3 = canvas;
                    s2Var4.D(canvas3, z30, z31, z32, false, 1.0f);
                }
                s2Var3 = s2Var4;
                s2Var3.x4 = (s2Var3.S2 ? 1 : 0) + (!s2Var3.Q2 ? 2 : z18 ? 1 : 0) + (!s2Var3.R2 ? i17 : z18 ? 1 : 0);
            } else {
                canvas3 = canvas;
                s2Var3 = s2Var4;
                i17 = 4;
            }
            float f392222 = 12.5f;
            if (s2Var3.k4) {
                int dp8 = AndroidUtilities.dp((z17 || SharedConfig.useThreeLinesLayout) ? 12.5f : 15.5f);
                if (((!z17 && !SharedConfig.useThreeLinesLayout) || s2Var3.Q()) && s2Var3.M()) {
                    dp8 -= AndroidUtilities.dp(9.0f);
                }
                org.telegram.ui.Components.q5 q5Var = s2Var3.o4;
                if (q5Var != null) {
                    q5Var.setBounds(s2Var3.x2 - AndroidUtilities.dp(19.0f), AndroidUtilities.dp(-1.0f) + dp8, s2Var3.x2 - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f) + dp8);
                    e6Var3 = e6Var4;
                    q5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.z9, e6Var3)));
                    q5Var.draw(canvas3);
                    boolean z37 = (!s2Var3.b1 || s2Var3.Z0 || s2Var3.Q0) ? true : z18 ? 1 : 0;
                    if (s2Var3.j1 != 2 || ((!z37 && s2Var3.c1 <= 0.0f) || s2Var3.j4 || s2Var3.p4 != 0)) {
                        i16 = 17;
                    } else {
                        if (z37) {
                            float f43 = s2Var3.c1;
                            if (f43 != f24) {
                                float f44 = f43 + 0.10666667f;
                                s2Var3.c1 = f44;
                                if (f44 > f24) {
                                    s2Var3.c1 = f24;
                                } else {
                                    s2Var3.invalidate();
                                }
                                float dp9 = (!s2Var3.l4 ? s2Var3.I2 : s2Var3.H2) - AndroidUtilities.dp((!z17 || SharedConfig.useThreeLinesLayout) ? 0.0f : f24);
                                float dp10 = AndroidUtilities.dp(!SharedConfig.useThreeLinesLayout ? 13.5f : 17.5f);
                                if (((!z17 && !SharedConfig.useThreeLinesLayout) || s2Var3.Q()) && s2Var3.M()) {
                                    dp10 -= AndroidUtilities.dp(s2Var3.Q() ? 8.0f : 9.0f);
                                }
                                a0.q(org.telegram.ui.ActionBar.i6.c1, dp9, dp10);
                                a0.q(org.telegram.ui.ActionBar.i6.d1, dp9, dp10);
                                i16 = 17;
                                yf.p.d(org.telegram.ui.ActionBar.i6.e1, org.telegram.ui.ActionBar.i6.c1.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.c1.getBounds().exactCenterY(), 17);
                                if (s2Var3.c1 != f24) {
                                    canvas3.save();
                                    float f45 = s2Var3.c1;
                                    canvas3.scale(f45, f45, org.telegram.ui.ActionBar.i6.c1.getBounds().centerX(), org.telegram.ui.ActionBar.i6.c1.getBounds().centerY());
                                    if (s2Var3.Q0) {
                                        org.telegram.ui.ActionBar.i6.e1.setAlpha((int) (s2Var3.c1 * 255.0f));
                                        org.telegram.ui.ActionBar.i6.e1.draw(canvas3);
                                        org.telegram.ui.ActionBar.i6.e1.setAlpha(255);
                                    } else if (s2Var3.b1) {
                                        org.telegram.ui.ActionBar.i6.d1.setAlpha((int) (s2Var3.c1 * 255.0f));
                                        org.telegram.ui.ActionBar.i6.d1.draw(canvas3);
                                        org.telegram.ui.ActionBar.i6.d1.setAlpha(255);
                                    } else {
                                        org.telegram.ui.ActionBar.i6.c1.setAlpha((int) (s2Var3.c1 * 255.0f));
                                        org.telegram.ui.ActionBar.i6.c1.draw(canvas3);
                                        org.telegram.ui.ActionBar.i6.c1.setAlpha(255);
                                    }
                                    canvas3.restore();
                                } else if (s2Var3.Q0) {
                                    org.telegram.ui.ActionBar.i6.e1.draw(canvas3);
                                } else if (s2Var3.b1) {
                                    org.telegram.ui.ActionBar.i6.d1.draw(canvas3);
                                } else {
                                    org.telegram.ui.ActionBar.i6.c1.draw(canvas3);
                                }
                            }
                        }
                        if (!z37) {
                            float f46 = s2Var3.c1;
                            if (f46 != 0.0f) {
                                float f47 = f46 - 0.10666667f;
                                s2Var3.c1 = f47;
                                if (f47 < 0.0f) {
                                    s2Var3.c1 = 0.0f;
                                } else {
                                    s2Var3.invalidate();
                                }
                            }
                        }
                        float dp92 = (!s2Var3.l4 ? s2Var3.I2 : s2Var3.H2) - AndroidUtilities.dp((!z17 || SharedConfig.useThreeLinesLayout) ? 0.0f : f24);
                        float dp102 = AndroidUtilities.dp(!SharedConfig.useThreeLinesLayout ? 13.5f : 17.5f);
                        if (!z17) {
                            dp102 -= AndroidUtilities.dp(s2Var3.Q() ? 8.0f : 9.0f);
                            a0.q(org.telegram.ui.ActionBar.i6.c1, dp92, dp102);
                            a0.q(org.telegram.ui.ActionBar.i6.d1, dp92, dp102);
                            i16 = 17;
                            yf.p.d(org.telegram.ui.ActionBar.i6.e1, org.telegram.ui.ActionBar.i6.c1.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.c1.getBounds().exactCenterY(), 17);
                            if (s2Var3.c1 != f24) {
                            }
                        }
                        dp102 -= AndroidUtilities.dp(s2Var3.Q() ? 8.0f : 9.0f);
                        a0.q(org.telegram.ui.ActionBar.i6.c1, dp92, dp102);
                        a0.q(org.telegram.ui.ActionBar.i6.d1, dp92, dp102);
                        i16 = 17;
                        yf.p.d(org.telegram.ui.ActionBar.i6.e1, org.telegram.ui.ActionBar.i6.c1.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.c1.getBounds().exactCenterY(), 17);
                        if (s2Var3.c1 != f24) {
                        }
                    }
                    if (!s2Var3.j4) {
                        float dp11 = AndroidUtilities.dp((z17 || SharedConfig.useThreeLinesLayout) ? 13.5f : 16.5f);
                        if (((!z17 && !SharedConfig.useThreeLinesLayout) || s2Var3.Q()) && s2Var3.M()) {
                            dp11 -= AndroidUtilities.dp(9.0f);
                        }
                        a0.q(org.telegram.ui.ActionBar.i6.f1, s2Var3.H2 - AndroidUtilities.dp(f24), dp11);
                        a0.q(org.telegram.ui.ActionBar.i6.i1, s2Var3.H2 - AndroidUtilities.dp(f24), dp11);
                        org.telegram.ui.ActionBar.i6.f1.draw(canvas3);
                        org.telegram.ui.ActionBar.i6.i1.draw(canvas3);
                        bbVar2 = bbVar;
                    } else if (s2Var3.l4) {
                        int dp12 = AndroidUtilities.dp((z17 || SharedConfig.useThreeLinesLayout) ? 12.5f : 15.5f);
                        if (((!z17 && !SharedConfig.useThreeLinesLayout) || s2Var3.Q()) && s2Var3.M()) {
                            dp12 -= AndroidUtilities.dp(9.0f);
                        }
                        org.telegram.ui.Components.q5 q5Var2 = s2Var3.n4;
                        if (q5Var2 != null) {
                            bbVar2 = bbVar;
                            bbVar2.setTranslationX((f32 + s2Var3.H2) - AndroidUtilities.dp(2.0f));
                            bbVar2.setTranslationY((f17 + dp12) - AndroidUtilities.dp(4.0f));
                            if (s2Var3.i0 > 0.0f) {
                                q5Var2.setBounds(s2Var3.H2 - AndroidUtilities.dp(2.0f), dp12 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(20.0f) + s2Var3.H2, AndroidUtilities.dp(22.0f) + (dp12 - AndroidUtilities.dp(4.0f)));
                                q5Var2.draw(canvas3);
                                z19 = z18 ? 1 : 0;
                            } else {
                                z19 = true;
                            }
                            q5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.z9, e6Var3)));
                            z13 = z19;
                            if (!s2Var3.y3 || s2Var3.x3 != 0.0f) {
                                if (!LocaleController.isRTL) {
                                    Paint paintReorderGradient = s2Var3.getPaintReorderGradient();
                                    paintReorderGradient.setAlpha((int) (s2Var3.x3 * 255.0f));
                                    canvas3.save();
                                    canvas3.translate(s2Var3.D3 - AndroidUtilities.dp(f23), s2Var3.C3);
                                    float f48 = f23;
                                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.q.A(f48, s2Var3.D3, s2Var3.getMeasuredWidth()), AndroidUtilities.dp(f48), paintReorderGradient);
                                    canvas3 = canvas;
                                    canvas3.restore();
                                }
                                org.telegram.ui.ActionBar.i6.Z0.setAlpha((int) (s2Var3.x3 * 255.0f));
                                a0.p(s2Var3.D3, s2Var3.C3, org.telegram.ui.ActionBar.i6.Z0);
                                org.telegram.ui.ActionBar.i6.Z0.draw(canvas3);
                            }
                            float f402222 = s2Var3.S3.e;
                            if (s2Var3.t3) {
                                org.telegram.ui.ActionBar.i6.Y0.setAlpha((int) ((f24 - s2Var3.x3) * 255.0f));
                                RectF rectF5 = rectF;
                                rectF5.set(s2Var3.v3, s2Var3.u3, AndroidUtilities.dp(20.666f) + r0, AndroidUtilities.dp(20.666f) + s2Var3.u3);
                                float f49 = AndroidUtilities.density * 10.5f;
                                canvas3.drawRoundRect(rectF5, f49, f49, org.telegram.ui.ActionBar.i6.x0);
                                a0.p(AndroidUtilities.dp(4.5f) + s2Var3.v3, AndroidUtilities.dp(5.0f) + s2Var3.u3, org.telegram.ui.ActionBar.i6.Y0);
                                org.telegram.ui.ActionBar.i6.Y0.draw(canvas3);
                            } else {
                                RectF rectF6 = rectF;
                                if (((s2Var3.G3 || s2Var3.b4) && s2Var3.L3) || s2Var3.V3 != f24 || s2Var3.c4 || s2Var3.W3 != f24 || s2Var3.d4 || f402222 > 0.0f) {
                                    boolean N = s2Var3.N();
                                    canvas3 = canvas;
                                    f18 = f24;
                                    E(canvas3, N, s2Var3.M3, s2Var3.N3, s2Var3.Q3, 1.0f, false);
                                    s2Var = this;
                                    if (s2Var.b4) {
                                        org.telegram.ui.ActionBar.i6.w0.setAlpha((int) ((f18 - s2Var.x3) * 255.0f));
                                        if (s2Var.i4 != null) {
                                            rectF6.set(s2Var.e4, s2Var.M3, AndroidUtilities.dp(12.666f) + r1 + s2Var.h4, AndroidUtilities.dp(20.666f) + s2Var.M3);
                                            canvas3.drawRoundRect(rectF6, rectF6.height() / 2.0f, rectF6.height() / 2.0f, (!N || s2Var.k1 == 0) ? org.telegram.ui.ActionBar.i6.w0 : org.telegram.ui.ActionBar.i6.y0);
                                            org.telegram.ui.ActionBar.i6.M0.setAlpha((int) ((f18 - s2Var.x3) * 255.0f));
                                            canvas3.save();
                                            canvas3.translate(AndroidUtilities.dp(6.333f) + s2Var.e4, AndroidUtilities.dp(4.0f) + s2Var.M3);
                                            s2Var.i4.draw(canvas3);
                                            canvas3.restore();
                                        } else {
                                            Drawable drawable2 = org.telegram.ui.ActionBar.i6.m1;
                                            drawable2.setAlpha((int) ((f18 - s2Var.x3) * 255.0f));
                                            yf.p.d(drawable2, AndroidUtilities.dp(10.333f) + s2Var.e4, AndroidUtilities.dp(10.333f) + s2Var.M3, i16);
                                            drawable2.draw(canvas3);
                                        }
                                    }
                                    if (s2Var.c4 || s2Var.W3 != f18) {
                                        f25 = 10.333f;
                                        rectF6.set(s2Var.f4, s2Var.M3, AndroidUtilities.dp(20.666f) + r1, AndroidUtilities.dp(20.666f) + s2Var.M3);
                                        float f50 = s2Var.W3;
                                        if (f50 == f18) {
                                            f50 = f18;
                                        } else if (!s2Var.c4) {
                                            f50 = f18 - f50;
                                        }
                                        Drawable drawable3 = N ? org.telegram.ui.ActionBar.i6.q1 : org.telegram.ui.ActionBar.i6.n1;
                                        drawable3.setAlpha((int) ((f18 - s2Var.x3) * 255.0f));
                                        yf.p.d(drawable3, AndroidUtilities.dp(10.333f) + r1, AndroidUtilities.dp(10.333f) + s2Var.M3, i16);
                                        yf.p.b(canvas3, drawable3, f50);
                                    } else {
                                        f25 = 10.333f;
                                    }
                                    if ((s2Var.d4 || f402222 > 0.0f) && f402222 != 0.0f) {
                                        rectF6.set(s2Var.g4, s2Var.M3, AndroidUtilities.dp(20.666f) + r1, AndroidUtilities.dp(20.666f) + s2Var.M3);
                                        Drawable drawable4 = N ? org.telegram.ui.ActionBar.i6.r1 : org.telegram.ui.ActionBar.i6.o1;
                                        drawable4.setAlpha((int) ((f18 - s2Var.x3) * 255.0f));
                                        yf.p.d(drawable4, AndroidUtilities.dp(f25) + r1, AndroidUtilities.dp(f25) + s2Var.M3, i16);
                                        yf.p.b(canvas3, drawable4, f402222);
                                    }
                                    if (s2Var.H3) {
                                        if (s2Var.J3 == null) {
                                            s2Var.J3 = (LayerDrawable) f0.c.c(s2Var.getContext(), R.drawable.dialog_gram_transfer).mutate();
                                        }
                                        int w013 = org.telegram.ui.ActionBar.i6.w0(s2Var.N() ? org.telegram.ui.ActionBar.i6.V8 : org.telegram.ui.ActionBar.i6.U8, e6Var3);
                                        if (s2Var.K3 != w013) {
                                            Drawable drawable5 = s2Var.J3.getDrawable(z18 ? 1 : 0);
                                            s2Var.K3 = w013;
                                            drawable5.setColorFilter(new PorterDuffColorFilter(w013, PorterDuff.Mode.SRC_IN));
                                        }
                                        int dp13 = ((AndroidUtilities.dp(20.666f) - AndroidUtilities.dp(28.0f)) / 2) + s2Var.M3;
                                        LayerDrawable layerDrawable = s2Var.J3;
                                        int i44 = s2Var.I3;
                                        layerDrawable.setBounds(i44, dp13, AndroidUtilities.dp(28.0f) + i44, AndroidUtilities.dp(28.0f) + dp13);
                                        s2Var.J3.setAlpha((int) ((f18 - s2Var.x3) * 255.0f));
                                        s2Var.J3.draw(canvas3);
                                    }
                                    if (s2Var.R1 > 0) {
                                        float f51 = p2Var3.l;
                                        if (f51 != f18) {
                                            if (f51 > 0.0f) {
                                                canvas.saveLayerAlpha(0.0f, 0.0f, s2Var.getWidth(), s2Var.getHeight(), (int) ((f18 - f51) * 255.0f), 31);
                                                canvas3 = canvas;
                                                if (p2Var3.m) {
                                                    dp = -AndroidUtilities.dp(14.0f);
                                                    f26 = p2Var3.l;
                                                } else {
                                                    dp = AndroidUtilities.dp(14.0f);
                                                    f26 = p2Var3.l;
                                                }
                                                canvas3.translate(0.0f, dp * f26);
                                            }
                                            int i45 = z18 ? 1 : 0;
                                            while (i45 < s2Var.R1) {
                                                if (s2Var.U1[i45]) {
                                                    if (s2Var.T1 == null) {
                                                        Paint paint3 = new Paint(1);
                                                        s2Var.T1 = paint3;
                                                        paint3.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                                        s2Var.T1.setColor(z18 ? 1 : 0);
                                                    }
                                                    RectF rectF7 = AndroidUtilities.rectTmp;
                                                    ImageReceiver[] imageReceiverArr = s2Var.V1;
                                                    rectF7.set(imageReceiverArr[i45].getImageX(), imageReceiverArr[i45].getImageY(), imageReceiverArr[i45].getImageX2(), imageReceiverArr[i45].getImageY2());
                                                    imageReceiverArr[i45].draw(canvas3);
                                                    if (s2Var.X1[i45]) {
                                                        Path path = s2Var.v0;
                                                        if (path == null) {
                                                            s2Var.v0 = new Path();
                                                        } else {
                                                            path.rewind();
                                                        }
                                                        s2Var.v0.addRoundRect(rectF7, imageReceiverArr[i45].getRoundRadius()[z18 ? 1 : 0], imageReceiverArr[i45].getRoundRadius()[1], Path.Direction.CW);
                                                        canvas3.save();
                                                        canvas3.clipPath(s2Var.v0);
                                                        if (s2Var.w0 == null) {
                                                            s2Var.w0 = new vh.g();
                                                        }
                                                        s2Var.w0.h(i0.a.k(i23, (int) (Color.alpha(i23) * 0.325f)));
                                                        s2Var.w0.setBounds((int) imageReceiverArr[i45].getImageX(), (int) imageReceiverArr[i45].getImageY(), (int) imageReceiverArr[i45].getImageX2(), (int) imageReceiverArr[i45].getImageY2());
                                                        s2Var.w0.draw(canvas3);
                                                        s2Var.invalidate();
                                                        canvas3.restore();
                                                    }
                                                    if (s2Var.W1[i45]) {
                                                        a0.p((int) (imageReceiverArr[i45].getCenterX() - (org.telegram.ui.ActionBar.i6.U0.getIntrinsicWidth() / 2)), (int) (imageReceiverArr[i45].getCenterY() - (org.telegram.ui.ActionBar.i6.U0.getIntrinsicHeight() / 2)), org.telegram.ui.ActionBar.i6.U0);
                                                        org.telegram.ui.ActionBar.i6.U0.draw(canvas3);
                                                    }
                                                }
                                                i45++;
                                                i23 = -1;
                                            }
                                            if (p2Var3.l > 0.0f) {
                                                canvas3.restore();
                                            }
                                        }
                                    }
                                    xsVar = s2Var.t0;
                                    if (xsVar != null && !xsVar.b()) {
                                        canvas3.save();
                                        canvas3.translate(s2Var.Y2, (s2Var.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (s2Var.s2 ? 1 : 0));
                                        s2Var.t0.a(canvas3, s2Var.Z2 - s2Var.Y2);
                                        canvas3.restore();
                                    }
                                    i25 = i22;
                                    r12 = z18;
                                    if (i25 != -1) {
                                        canvas3.restoreToCount(i25);
                                        r12 = z18;
                                    }
                                } else {
                                    if (s2Var3.E1) {
                                        canvas3.save();
                                        float a2 = s2Var3.F1.a(0.05f);
                                        RectF rectF8 = s2Var3.H1;
                                        canvas3.scale(a2, a2, rectF8.centerX(), rectF8.centerY());
                                        s2Var3.G1.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var3));
                                        canvas3.drawRoundRect(rectF8, rectF8.height() / 2.0f, rectF8.height() / 2.0f, s2Var3.G1);
                                        l11 l11Var = s2Var3.I1;
                                        if (l11Var != null) {
                                            l11Var.c(rectF8.left + AndroidUtilities.dp(13.0f), rectF8.centerY(), 1.0f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Sh, e6Var3), canvas);
                                        }
                                        canvas.restore();
                                    }
                                    canvas3 = canvas;
                                }
                            }
                            s2Var = s2Var3;
                            f18 = f24;
                            if (s2Var.H3) {
                            }
                            if (s2Var.R1 > 0) {
                            }
                            xsVar = s2Var.t0;
                            if (xsVar != null) {
                                canvas3.save();
                                canvas3.translate(s2Var.Y2, (s2Var.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (s2Var.s2 ? 1 : 0));
                                s2Var.t0.a(canvas3, s2Var.Z2 - s2Var.Y2);
                                canvas3.restore();
                            }
                            i25 = i22;
                            r12 = z18;
                            if (i25 != -1) {
                            }
                        } else {
                            bbVar2 = bbVar;
                            Drawable drawable6 = rg.b1.d().e;
                            int dp14 = s2Var3.H2 - AndroidUtilities.dp(f24);
                            if (!z17 && !SharedConfig.useThreeLinesLayout) {
                                f392222 = 15.5f;
                            }
                            a0.p(dp14, AndroidUtilities.dp(f392222), drawable6);
                            drawable6.draw(canvas3);
                        }
                    } else {
                        bbVar2 = bbVar;
                        if (s2Var3.p4 != 0) {
                            int dp15 = AndroidUtilities.dp((z17 || SharedConfig.useThreeLinesLayout) ? 12.0f : 15.0f);
                            if (((!z17 && !SharedConfig.useThreeLinesLayout) || s2Var3.Q()) && s2Var3.M()) {
                                dp15 -= AndroidUtilities.dp(9.0f);
                            }
                            a0.p(s2Var3.H2, dp15, s2Var3.p4 == 1 ? org.telegram.ui.ActionBar.i6.g1 : org.telegram.ui.ActionBar.i6.h1);
                            (s2Var3.p4 == 1 ? org.telegram.ui.ActionBar.i6.g1 : org.telegram.ui.ActionBar.i6.h1).draw(canvas3);
                        }
                    }
                    z13 = z18 ? 1 : 0;
                    if (!s2Var3.y3) {
                    }
                    if (!LocaleController.isRTL) {
                    }
                    org.telegram.ui.ActionBar.i6.Z0.setAlpha((int) (s2Var3.x3 * 255.0f));
                    a0.p(s2Var3.D3, s2Var3.C3, org.telegram.ui.ActionBar.i6.Z0);
                    org.telegram.ui.ActionBar.i6.Z0.draw(canvas3);
                    float f4022222 = s2Var3.S3.e;
                    if (s2Var3.t3) {
                    }
                    s2Var = s2Var3;
                    f18 = f24;
                    if (s2Var.H3) {
                    }
                    if (s2Var.R1 > 0) {
                    }
                    xsVar = s2Var.t0;
                    if (xsVar != null) {
                    }
                    i25 = i22;
                    r12 = z18;
                    if (i25 != -1) {
                    }
                }
            }
            e6Var3 = e6Var4;
            if (s2Var3.b1) {
            }
            if (s2Var3.j1 != 2) {
            }
            i16 = 17;
            if (!s2Var3.j4) {
            }
            z13 = z18 ? 1 : 0;
            if (!s2Var3.y3) {
            }
            if (!LocaleController.isRTL) {
            }
            org.telegram.ui.ActionBar.i6.Z0.setAlpha((int) (s2Var3.x3 * 255.0f));
            a0.p(s2Var3.D3, s2Var3.C3, org.telegram.ui.ActionBar.i6.Z0);
            org.telegram.ui.ActionBar.i6.Z0.draw(canvas3);
            float f40222222 = s2Var3.S3.e;
            if (s2Var3.t3) {
            }
            s2Var = s2Var3;
            f18 = f24;
            if (s2Var.H3) {
            }
            if (s2Var.R1 > 0) {
            }
            xsVar = s2Var.t0;
            if (xsVar != null) {
            }
            i25 = i22;
            r12 = z18;
            if (i25 != -1) {
            }
        } else {
            s2Var = s2Var4;
            i16 = 17;
            e6Var3 = e6Var2;
            m2Var4 = m2Var3;
            bbVar2 = bbVar;
            r12 = 0;
            f18 = 1.0f;
            i17 = 4;
            z13 = false;
            i18 = 0;
        }
        z14 = s2Var.b2;
        imageReceiver = s2Var.Y1;
        if (z14) {
            canvas3.save();
            float interpolation2 = m2Var4.getInterpolation(s2Var.c2 / 170.0f) + f18;
            canvas3.scale(interpolation2, interpolation2, imageReceiver.getCenterX(), imageReceiver.getCenterY());
        }
        z15 = s2Var.x;
        k2Var = s2Var.u0;
        if (z15 && (!s2Var.P || (tL_forumTopic2 = s2Var.N) == null || tL_forumTopic2.id != 1 || (nj0Var = s2Var.e2) == null || !nj0Var.X || nj0Var.Y)) {
            if (!s2Var.y) {
                if (s2Var.Z1 == null) {
                    s2Var.Z1 = new rf0();
                }
                s2Var.Z1.a((int) k2Var.F.centerX(), (int) k2Var.F.centerY(), (int) (k2Var.F.width() / 2.0f));
                canvas3.save();
                canvas3.clipPath(s2Var.Z1);
                imageReceiver.setImageCoords(k2Var.F);
                imageReceiver.draw(canvas3);
                canvas3.restore();
            } else if (s2Var.E) {
                yf.p.f(imageReceiver, AndroidUtilities.dpf2(f18) + k2Var.F.centerX(), k2Var.F.centerY(), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
                yf.p.a(canvas3, org.telegram.ui.ActionBar.i6.S0, imageReceiver.getCenterX(), imageReceiver.getCenterY(), AndroidUtilities.dp(48.0f));
                imageReceiver.draw(canvas3);
            } else {
                boolean z38 = s2Var.F;
                k2Var.r = (z38 || s2Var.J0 != 0) ? true : r12;
                int i46 = k2Var.z;
                if (z38) {
                    k2Var.z = 1;
                }
                ai.ja.h(s2Var.H0, canvas3, imageReceiver, k2Var);
                if (k2Var.w) {
                    s2Var.y();
                }
                k2Var.z = i46;
            }
            if (!s2Var.O0 && ((((chat = s2Var.g2) != null && chat.linked_community_id != 0) || ((user = s2Var.f2) != null && user.linked_community_id != 0)) && !s2Var.E && s2Var.N0 && !s2Var.O())) {
                float centerX2 = k2Var.F.centerX() + AndroidUtilities.dp(20.33f);
                float centerY2 = k2Var.F.centerY() + AndroidUtilities.dp(19.0f);
                if (s2Var.D0 == null) {
                    s2Var.D0 = new fi.a();
                }
                yf.p.d(s2Var.D0, centerX2, centerY2, i16);
                canvas3.drawCircle(s2Var.D0.getBounds().exactCenterX(), s2Var.D0.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.i6.m0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, e6Var3)));
                s2Var.D0.draw(canvas3);
            }
        }
        if (s2Var.b2) {
            canvas3.restore();
        }
        if (imageReceiver.getVisible() && C(canvas)) {
            i18 = 1;
        }
        if (s2Var.i0 > 0.0f || s2Var.J0 != 0) {
            s2Var2 = s2Var;
        } else {
            boolean N2 = s2Var.N();
            RectF rectF9 = k2Var.F;
            int width = (int) (((rectF9.width() + rectF9.left) - s2Var.O3) - AndroidUtilities.dp(5.0f));
            RectF rectF10 = k2Var.F;
            E(canvas3, N2, (int) ((k2Var.F.height() + imageReceiver.getImageY()) - AndroidUtilities.dp(22.0f)), width, (int) (((rectF10.width() + rectF10.left) - s2Var.P3) - AndroidUtilities.dp(5.0f)), s2Var.i0, true);
            s2Var2 = this;
        }
        if (s2Var2.C0 != 0.0f) {
            canvas3.restore();
        }
        if (s2Var2.w1 != 0.0f) {
            canvas3.restore();
        }
        if (z11 && ((s2Var2.J0 != 0 || (s2Var2.P && (tL_forumTopic = s2Var2.N) != null && tL_forumTopic.id == 1)) && s2Var2.w1 == 0.0f && s2Var2.e2 != null)) {
            canvas3.save();
            canvas3.translate(0.0f, (-s2Var2.E3) - (s2Var2.n * s2Var2.i0));
            canvas3.clipRect(0.0f, (f18 - s2Var2.e2.J) * s2Var2.getMeasuredHeight(), s2Var2.getMeasuredWidth(), s2Var2.getMeasuredHeight());
            s2Var2.e2.c(canvas3, r12);
            canvas3.restore();
        }
        if (s2Var2.s2) {
            int dp16 = (s2Var2.t2 || (s2Var2.J0 != 0 && s2Var2.m1)) ? r12 : AndroidUtilities.dp(s2Var2.I);
            if (s2Var2.i0 != f18) {
                int alpha4 = org.telegram.ui.ActionBar.i6.k0.getAlpha();
                float f52 = s2Var2.i0;
                if (f52 != 0.0f) {
                    org.telegram.ui.ActionBar.i6.k0.setAlpha((int) ((f18 - f52) * alpha4));
                }
                i19 = 1;
                float measuredHeight = (s2Var2.getMeasuredHeight() - 1) - (s2Var2.n * s2Var2.i0);
                if (LocaleController.isRTL) {
                    canvas.drawLine(0.0f, measuredHeight, s2Var2.getMeasuredWidth() - dp16, measuredHeight, org.telegram.ui.ActionBar.i6.k0);
                } else {
                    canvas.drawLine(dp16, measuredHeight, s2Var2.getMeasuredWidth(), measuredHeight, org.telegram.ui.ActionBar.i6.k0);
                }
                f19 = 0.0f;
                if (s2Var2.i0 != 0.0f) {
                    org.telegram.ui.ActionBar.i6.k0.setAlpha(alpha4);
                }
                if (s2Var2.t1 != f19) {
                    if (Build.VERSION.SDK_INT != 24) {
                        canvas.restore();
                    } else {
                        org.telegram.ui.ActionBar.i6.v0.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, e6Var3));
                        canvas.drawRect(0.0f, 0.0f, s2Var2.getMeasuredWidth(), s2Var2.u1 * s2Var2.t1, org.telegram.ui.ActionBar.i6.v0);
                        canvas.drawRect(0.0f, s2Var2.getMeasuredHeight() - ((int) (s2Var2.v1 * s2Var2.t1)), s2Var2.getMeasuredWidth(), s2Var2.getMeasuredHeight(), org.telegram.ui.ActionBar.i6.v0);
                        canvas2 = canvas;
                        if (z24) {
                            float f53 = f18 - f28;
                            int measuredHeight2 = (int) (s2Var2.getMeasuredHeight() * f53);
                            int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6);
                            if (s2Var2.O4 == null) {
                                s2Var2.O4 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                            }
                            if (s2Var2.P4 != v02) {
                                s2Var2.P4 = v02;
                                s2Var2.O4.setColors(new int[]{v02, 16777215 & v02});
                            }
                            float a10 = w7.o.a((f53 - 0.05f) * 10.0f, 0.0f, f18);
                            s2Var2.O4.setBounds(r12, measuredHeight2, s2Var2.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + measuredHeight2);
                            s2Var2.O4.setAlpha((int) (a10 * 255.0f));
                            s2Var2.O4.draw(canvas2);
                            canvas2.restore();
                        }
                        z16 = s2Var2.y3;
                        if (!z16 || s2Var2.x3 != 0.0f) {
                            if (z16) {
                                float f54 = s2Var2.x3;
                                if (f54 < 1.0f) {
                                    float f55 = f54 + 0.09411765f;
                                    s2Var2.x3 = f55;
                                    if (f55 > 1.0f) {
                                        s2Var2.x3 = 1.0f;
                                    }
                                    f20 = 0.0f;
                                }
                            } else {
                                float f56 = s2Var2.x3;
                                f20 = 0.0f;
                                if (f56 > 0.0f) {
                                    float f57 = f56 - 0.09411765f;
                                    s2Var2.x3 = f57;
                                    if (f57 < 0.0f) {
                                        s2Var2.x3 = 0.0f;
                                    }
                                }
                                if (s2Var2.m1) {
                                    float f58 = s2Var2.D1;
                                    if (f58 > f20) {
                                        float f59 = f58 - 0.069565214f;
                                        s2Var2.D1 = f59;
                                        if (f59 < f20) {
                                            s2Var2.D1 = f20;
                                        }
                                        org.telegram.ui.Components.j9 j9Var = s2Var2.a2;
                                        if (j9Var.n == 2) {
                                            j9Var.o = hs.h.getInterpolation(s2Var2.D1);
                                        }
                                        i18 = i19;
                                    }
                                    if (s2Var2.b2) {
                                        float f60 = s2Var2.c2 + 16.0f;
                                        s2Var2.c2 = f60;
                                        if (f60 >= 170.0f) {
                                            s2Var2.c2 = 170.0f;
                                            s2Var2.b2 = r12;
                                        }
                                        i18 = i19;
                                    }
                                    if (!s2Var2.A1) {
                                        float f61 = s2Var2.C1;
                                        if (f61 < 1.0f) {
                                            float f62 = f61 + 0.09411765f;
                                            s2Var2.C1 = f62;
                                            if (f62 > 1.0f) {
                                                s2Var2.C1 = 1.0f;
                                                i18 = i19;
                                            }
                                        }
                                        float f63 = s2Var2.B1;
                                        if (f63 < 1.0f) {
                                            float f64 = f63 + 0.053333335f;
                                            s2Var2.B1 = f64;
                                            if (f64 > 1.0f) {
                                                s2Var2.B1 = 1.0f;
                                            }
                                            i18 = i19;
                                        }
                                        bbVar2.setVisibility(!z13 ? r12 : i17);
                                        if (i18 == 0) {
                                            s2Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    }
                                    if (s2Var2.C1 == 1.0f) {
                                        s2Var2.C1 = 0.0f;
                                        i18 = i19;
                                    }
                                    float f65 = s2Var2.B1;
                                    if (f65 > 0.0f) {
                                        float f66 = f65 - 0.053333335f;
                                        s2Var2.B1 = f66;
                                        if (f66 < 0.0f) {
                                            s2Var2.B1 = 0.0f;
                                        }
                                        i18 = i19;
                                    }
                                    bbVar2.setVisibility(!z13 ? r12 : i17);
                                    if (i18 == 0) {
                                    }
                                } else {
                                    float f67 = s2Var2.D1;
                                    if (f67 < 1.0f) {
                                        float f68 = f67 + 0.069565214f;
                                        s2Var2.D1 = f68;
                                        if (f68 > 1.0f) {
                                            s2Var2.D1 = 1.0f;
                                        }
                                        org.telegram.ui.Components.j9 j9Var2 = s2Var2.a2;
                                        if (j9Var2.n == 2) {
                                            j9Var2.o = hs.h.getInterpolation(s2Var2.D1);
                                        }
                                        i18 = i19;
                                    }
                                    if (s2Var2.b2) {
                                    }
                                    if (!s2Var2.A1) {
                                    }
                                }
                            }
                            i18 = i19;
                            if (s2Var2.m1) {
                            }
                        }
                        f20 = 0.0f;
                        if (s2Var2.m1) {
                        }
                    }
                }
                canvas2 = canvas;
                if (z24) {
                }
                z16 = s2Var2.y3;
                if (!z16) {
                }
                if (z16) {
                }
                i18 = i19;
                if (s2Var2.m1) {
                }
            }
        }
        f19 = 0.0f;
        i19 = 1;
        if (s2Var2.t1 != f19) {
        }
        canvas2 = canvas;
        if (z24) {
        }
        z16 = s2Var2.y3;
        if (!z16) {
        }
        if (z16) {
        }
        i18 = i19;
        if (s2Var2.m1) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        nj0 nj0Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (P() && (nj0Var = this.e2) != null && SharedConfig.archiveHidden && nj0Var.J == 0.0f) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(32);
            if (!P() && this.D4 != null) {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_chat_preview, LocaleController.getString(R.string.AccActionChatPreview)));
            }
        }
        ci.o3 o3Var = this.q2;
        if (o3Var == null || !o3Var.a.q) {
            return;
        }
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(true);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.i0 != 0.0f || this.P || this.F || !this.u0.a(motionEvent, this)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp;
        int i14;
        if (this.H0 == 0 && this.G0 == null) {
            return;
        }
        ci.bb bbVar = this.m4;
        if (bbVar != null) {
            bbVar.layout(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
        }
        if (this.q2 != null) {
            int i15 = this.I;
            boolean z11 = this.r2;
            int dp2 = AndroidUtilities.dp(i15 - ((z11 || SharedConfig.useThreeLinesLayout) ? 29 : 27));
            if (this.k0) {
                i14 = AndroidUtilities.dp(8.0f);
                dp = (getMeasuredHeight() - this.q2.getMeasuredHeight()) >> 1;
            } else {
                if (LocaleController.isRTL) {
                    dp2 = (i12 - i10) - dp2;
                }
                int i16 = dp2;
                dp = AndroidUtilities.dp(this.U + ((z11 || SharedConfig.useThreeLinesLayout) ? 6 : 0));
                i14 = i16;
            }
            ci.o3 o3Var = this.q2;
            o3Var.layout(i14, dp, o3Var.getMeasuredWidth() + i14, this.q2.getMeasuredHeight() + dp);
        }
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (measuredWidth != this.K4 || this.A0) {
            this.A0 = false;
            this.K4 = measuredWidth;
            try {
                u();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        ci.bb bbVar = this.m4;
        if (bbVar != null) {
            bbVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), TLObject.FLAG_30));
        }
        ci.o3 o3Var = this.q2;
        if (o3Var != null) {
            o3Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
        }
        if (this.P) {
            int size = View.MeasureSpec.getSize(i10);
            boolean z10 = this.r2;
            setMeasuredDimension(size, AndroidUtilities.dp(((z10 || SharedConfig.useThreeLinesLayout) ? this.K : this.J) + ((!M() || ((z10 || SharedConfig.useThreeLinesLayout) && !Q())) ? 0 : Q() ? this.M : this.L)) + (this.s2 ? 1 : 0));
            this.Q = false;
            if (this.P && !M()) {
                u();
                if (this.R) {
                    this.Q = true;
                    u();
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), z());
        this.u1 = 0;
        this.v1 = getMeasuredHeight();
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        MessageObject captionMessage;
        TLRPC.User user;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        StringBuilder sb2 = new StringBuilder();
        String str = this.L0;
        if (str != null) {
            sb2.append(str);
            sb2.append(". ");
        } else if (this.J0 == 1) {
            c1.l(R.string.ArchivedChats, ". ", sb2);
        } else {
            if (this.h2 != null) {
                c1.l(R.string.AccDescrSecretChat, ". ", sb2);
            }
            if (!this.P || this.N == null) {
                TLRPC.User user2 = this.f2;
                if (user2 != null) {
                    if (UserObject.isReplyUser(user2)) {
                        sb2.append(LocaleController.getString(R.string.RepliesTitle));
                    } else if (UserObject.isAnonymous(this.f2)) {
                        sb2.append(LocaleController.getString(R.string.AnonymousForward));
                    } else {
                        if (this.f2.bot) {
                            c1.l(R.string.Bot, ". ", sb2);
                        }
                        TLRPC.User user3 = this.f2;
                        if (user3.self) {
                            sb2.append(LocaleController.getString(R.string.SavedMessages));
                        } else {
                            sb2.append(ContactsController.formatName(user3.first_name, user3.last_name));
                        }
                    }
                    sb2.append(". ");
                } else {
                    TLRPC.Chat chat = this.g2;
                    if (chat != null) {
                        if (chat.broadcast) {
                            sb2.append(LocaleController.getString(R.string.AccDescrChannel));
                        } else {
                            sb2.append(LocaleController.getString(R.string.AccDescrGroup));
                        }
                        sb2.append(". ");
                        sb2.append(this.g2.title);
                        sb2.append(". ");
                    }
                }
            } else {
                c1.l(R.string.AccDescrTopic, ". ", sb2);
                sb2.append(this.N.title);
                sb2.append(". ");
            }
        }
        if (this.j4) {
            c1.l(R.string.AccDescrVerified, ". ", sb2);
        }
        if (this.Z0) {
            c1.l(R.string.AccDescrNotificationsMuted, ". ", sb2);
        }
        if (R()) {
            c1.l(R.string.AccDescrUserOnline, ". ", sb2);
        }
        int i10 = this.S0;
        if (i10 > 0) {
            sb2.append(LocaleController.formatPluralString("NewMessages", i10, new Object[0]));
            sb2.append(". ");
        }
        int i11 = this.U0;
        if (i11 > 0) {
            sb2.append(LocaleController.formatPluralString("AccDescrMentionCount", i11, new Object[0]));
            sb2.append(". ");
        }
        if (this.V0 > 0) {
            c1.l(R.string.AccDescrMentionReaction, ". ", sb2);
        }
        MessageObject messageObject = this.f1;
        if (messageObject == null || this.J0 != 0) {
            accessibilityEvent.setContentDescription(sb2);
            setContentDescription(sb2);
            return;
        }
        int i12 = this.R0;
        if (i12 == 0) {
            i12 = messageObject.messageOwner.date;
        }
        String formatDateAudio = LocaleController.formatDateAudio(i12, true);
        if (this.f1.isOut()) {
            sb2.append(LocaleController.formatString("AccDescrSentDate", R.string.AccDescrSentDate, formatDateAudio));
        } else {
            sb2.append(LocaleController.formatString("AccDescrReceivedDate", R.string.AccDescrReceivedDate, formatDateAudio));
        }
        sb2.append(". ");
        if (this.g2 != null && !this.f1.isOut() && this.f1.isFromUser() && this.f1.messageOwner.action == null && (user = MessagesController.getInstance(this.F0).getUser(Long.valueOf(this.f1.messageOwner.from_id.user_id))) != null) {
            sb2.append(ContactsController.formatName(user.first_name, user.last_name));
            sb2.append(". ");
        }
        if (this.h2 == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f1.messageText);
            if (!this.f1.isMediaEmpty() && (captionMessage = getCaptionMessage()) != null && !TextUtils.isEmpty(captionMessage.caption)) {
                if (sb3.length() > 0) {
                    sb3.append(". ");
                }
                sb3.append(captionMessage.caption);
            }
            StaticLayout staticLayout = this.e3;
            int length = staticLayout == null ? -1 : staticLayout.getText().length();
            if (length > 0) {
                int length2 = sb3.length();
                int indexOf = sb3.indexOf("\n", length);
                if (indexOf < length2 && indexOf >= 0) {
                    length2 = indexOf;
                }
                int indexOf2 = sb3.indexOf("\t", length);
                if (indexOf2 < length2 && indexOf2 >= 0) {
                    length2 = indexOf2;
                }
                int indexOf3 = sb3.indexOf(" ", length);
                if (indexOf3 < length2 && indexOf3 >= 0) {
                    length2 = indexOf3;
                }
                sb2.append(sb3.substring(0, length2));
            } else {
                sb2.append((CharSequence) sb3);
            }
        }
        accessibilityEvent.setContentDescription(sb2);
        setContentDescription(sb2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        if (r0 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0088, code lost:
    
        if (r2 == 8) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008e, code lost:
    
        if (r0.b(r7) != false) goto L54;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.i0 != 0.0f || this.P || this.F || !this.u0.a(motionEvent, this)) {
            o2 o2Var = this.d0;
            if (o2Var == null || o2Var.b()) {
                if (this.E1) {
                    boolean contains = this.H1.contains(motionEvent.getX(), motionEvent.getY());
                    int action = motionEvent.getAction();
                    bd bdVar = this.F1;
                    if (action == 0 || motionEvent.getAction() == 2) {
                        bdVar.c(contains);
                    } else {
                        if (bdVar.i && motionEvent.getAction() == 1) {
                            ai.y1 y1Var = this.K1;
                            if (y1Var != null) {
                                y1Var.run(this.f2);
                            }
                            bdVar.c(false);
                            return true;
                        }
                        if (bdVar.i && motionEvent.getAction() == 3) {
                            bdVar.c(false);
                            return true;
                        }
                    }
                }
                if (this.f0) {
                    id idVar = this.c0;
                    if (idVar != null) {
                        if (this.h3 != null) {
                            int i10 = this.j1;
                            if (i10 != 0) {
                                if (i10 != 7) {
                                }
                            }
                        }
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        ty tyVar;
        if (i10 != R.id.acc_action_chat_preview || (tyVar = this.D4) == null) {
            return super.performAccessibilityAction(i10, bundle);
        }
        tyVar.E4(this);
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (getParent() != null && getParent().isLayoutRequested()) {
            getParent().requestLayout();
        }
        super.requestLayout();
    }

    public void setArchivedPullAnimation(nj0 nj0Var) {
        this.e2 = nj0Var;
    }

    public void setBottomClip(int i10) {
        this.v1 = i10;
    }

    public void setClipProgress(float f7) {
        this.t1 = f7;
        invalidate();
    }

    public void setCurrentDialogId(long j3) {
        this.H0 = j3;
    }

    public void setCustomMessage(String str) {
        if (TextUtils.equals(this.I0, str)) {
            return;
        }
        this.I0 = str;
        u();
        requestLayout();
    }

    public void setCustomMessageWithoutRebuild(String str) {
        this.I0 = str;
    }

    public void setDialog(n2 n2Var) {
        this.G0 = n2Var;
        this.l1 = 0;
        b0(0, true);
        x();
        w();
        v();
        y();
    }

    public void setDialogCellDelegate(o2 o2Var) {
        this.d0 = o2Var;
    }

    public void setDialogSelected(boolean z10) {
        if (this.q4 != z10) {
            invalidate();
        }
        this.q4 = z10;
    }

    public void setIsTransitionSupport(boolean z10) {
        this.j0 = z10;
    }

    public void setMoving(boolean z10) {
        this.r = z10;
    }

    public void setOpenBotButton(boolean z10) {
        if (this.E1 == z10) {
            return;
        }
        if (this.I1 == null) {
            this.I1 = new l11(LocaleController.getString(R.string.BotOpen), 14.0f, AndroidUtilities.bold());
        }
        this.E1 = z10;
        this.F1.c(false);
    }

    public void setPinForced(boolean z10) {
        this.B3 = z10;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            u();
        }
        invalidate();
    }

    public void setPreloader(gg.j jVar) {
        this.s4 = jVar;
    }

    public void setRightFragmentOpenedProgress(float f7) {
        if (this.i0 != f7) {
            this.i0 = f7;
            invalidate();
        }
    }

    public void setSliding(boolean z10) {
        this.x1 = z10;
    }

    public void setTitleOverride(String str) {
        this.L0 = str;
    }

    public void setTopClip(int i10) {
        this.u1 = i10;
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        if (f7 == this.w1) {
            return;
        }
        this.w1 = f7;
        ck0 ck0Var = this.y1;
        if (ck0Var != null && f7 == 0.0f) {
            ck0Var.T(0.0f, true);
            this.z1 = false;
            this.m1 = SharedConfig.archiveHidden;
            this.B1 = 0.0f;
            this.x1 = false;
        }
        float f10 = this.w1;
        if (f10 != 0.0f) {
            this.x1 = true;
        } else {
            this.C1 = 0.0f;
            this.B1 = 0.0f;
            this.A1 = false;
        }
        if (this.x1 && !this.w) {
            boolean z10 = this.A1;
            boolean z11 = Math.abs(f10) >= ((float) getMeasuredWidth()) * 0.45f;
            this.A1 = z11;
            if (z10 != z11 && this.m1 == SharedConfig.archiveHidden) {
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
        }
        invalidate();
    }

    public void setVisible(boolean z10) {
        if (this.z0 == z10) {
            return;
        }
        this.z0 = z10;
        if (z10) {
            invalidate();
        }
    }

    public final CharSequence t(CharSequence charSequence) {
        if (this.R1 <= 0) {
            return charSequence;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.insert(0, (CharSequence) " ");
        valueOf.setSpan(new q2(AndroidUtilities.dp(((this.L4 + 2) * this.R1) + 3)), 0, 1, 33);
        return valueOf;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(2:677|678)|(2:682|(8:684|685|686|687|(1:698)(1:691)|692|(2:693|(1:695)(1:696))|697))|704|685|686|687|(1:689)|698|692|(3:693|(0)(0)|695)|697) */
    /* JADX WARN: Code restructure failed: missing block: B:1040:0x0629, code lost:
    
        if (r2.post_messages == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1145:0x1589, code lost:
    
        if (r4 == null) goto L1115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1573:0x0b20, code lost:
    
        if (r14.id != r11) goto L585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1577:0x0b2e, code lost:
    
        if (org.telegram.messenger.ChatObject.isMegagroup(r61.g2) != false) goto L589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1579:0x0b36, code lost:
    
        if (ng.d.k(r61.f1) == false) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1719:0x0f53, code lost:
    
        if (org.telegram.messenger.MessageObject.isBlueBlock(r61.f1.messageOwner.rich_message.blocks.get(0)) != false) goto L798;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1890:0x0635, code lost:
    
        if (r2.kicked != false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1894:0x063f, code lost:
    
        if (r61.P == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1905:0x0603, code lost:
    
        if (r3.reply_to_msg_id == 0) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1911:0x060f, code lost:
    
        if (r61.S0 != 0) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x23fb, code lost:
    
        if (org.telegram.messenger.SharedConfig.useThreeLinesLayout == false) goto L1801;
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x220e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x220f, code lost:
    
        r2 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x2211, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
        r42 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1016:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x1790  */
    /* JADX WARN: Removed duplicated region for block: B:1033:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:1044:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:1071:0x12c7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x17b1  */
    /* JADX WARN: Removed duplicated region for block: B:1096:0x136a  */
    /* JADX WARN: Removed duplicated region for block: B:1118:0x14f7  */
    /* JADX WARN: Removed duplicated region for block: B:1122:0x150a  */
    /* JADX WARN: Removed duplicated region for block: B:1123:0x1511  */
    /* JADX WARN: Removed duplicated region for block: B:1134:0x1550  */
    /* JADX WARN: Removed duplicated region for block: B:1251:0x13e4  */
    /* JADX WARN: Removed duplicated region for block: B:1254:0x13f0  */
    /* JADX WARN: Removed duplicated region for block: B:1257:0x13f9  */
    /* JADX WARN: Removed duplicated region for block: B:1259:0x13fb  */
    /* JADX WARN: Removed duplicated region for block: B:1260:0x13f2  */
    /* JADX WARN: Removed duplicated region for block: B:1261:0x13e9  */
    /* JADX WARN: Removed duplicated region for block: B:1272:0x14c3  */
    /* JADX WARN: Removed duplicated region for block: B:1279:0x1343  */
    /* JADX WARN: Removed duplicated region for block: B:1292:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x192f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x1943  */
    /* JADX WARN: Removed duplicated region for block: B:1380:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:1385:0x11b3  */
    /* JADX WARN: Removed duplicated region for block: B:1387:0x11bd  */
    /* JADX WARN: Removed duplicated region for block: B:1391:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x1948 A[Catch: Exception -> 0x1953, TryCatch #8 {Exception -> 0x1953, blocks: (B:135:0x193a, B:138:0x1944, B:140:0x1948, B:141:0x195a, B:143:0x195e), top: B:134:0x193a }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x195e A[Catch: Exception -> 0x1953, TRY_LEAVE, TryCatch #8 {Exception -> 0x1953, blocks: (B:135:0x193a, B:138:0x1944, B:140:0x1948, B:141:0x195a, B:143:0x195e), top: B:134:0x193a }] */
    /* JADX WARN: Removed duplicated region for block: B:1463:0x0ab4  */
    /* JADX WARN: Removed duplicated region for block: B:1464:0x0abd  */
    /* JADX WARN: Removed duplicated region for block: B:1533:0x113e  */
    /* JADX WARN: Removed duplicated region for block: B:1538:0x114f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x19a2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x19ab A[Catch: Exception -> 0x1986, TryCatch #12 {Exception -> 0x1986, blocks: (B:149:0x196d, B:152:0x197c, B:153:0x198f, B:156:0x19a5, B:158:0x19ab, B:159:0x19b7, B:161:0x19ca, B:163:0x19d0, B:166:0x19e1, B:168:0x19e5, B:169:0x1a1f, B:171:0x1a23, B:173:0x1a2c, B:174:0x1a35, B:880:0x19fe), top: B:148:0x196d }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x19e5 A[Catch: Exception -> 0x1986, TryCatch #12 {Exception -> 0x1986, blocks: (B:149:0x196d, B:152:0x197c, B:153:0x198f, B:156:0x19a5, B:158:0x19ab, B:159:0x19b7, B:161:0x19ca, B:163:0x19d0, B:166:0x19e1, B:168:0x19e5, B:169:0x1a1f, B:171:0x1a23, B:173:0x1a2c, B:174:0x1a35, B:880:0x19fe), top: B:148:0x196d }] */
    /* JADX WARN: Removed duplicated region for block: B:1706:0x0d81  */
    /* JADX WARN: Removed duplicated region for block: B:1720:0x0d84  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x1a64  */
    /* JADX WARN: Removed duplicated region for block: B:1887:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:1893:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:1902:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:1908:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:1914:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:1970:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:1977:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:1982:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x1c8a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x1cb2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x1cbf  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x1ceb  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x1d13  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x2046  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x207f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x2109  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x215e  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x2172  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x218a  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x218d  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x219c  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x2287  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x22a6 A[Catch: Exception -> 0x22f5, TryCatch #7 {Exception -> 0x22f5, blocks: (B:339:0x22a0, B:341:0x22a6, B:646:0x22f2), top: B:338:0x22a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x230b A[Catch: Exception -> 0x2317, TryCatch #6 {Exception -> 0x2317, blocks: (B:345:0x2305, B:347:0x230b, B:349:0x230f, B:353:0x2343, B:358:0x236d, B:363:0x2319, B:365:0x231f, B:369:0x233c), top: B:344:0x2305 }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x237a A[Catch: Exception -> 0x23a9, TryCatch #3 {Exception -> 0x23a9, blocks: (B:374:0x2376, B:376:0x237a, B:378:0x238c, B:380:0x2392, B:382:0x2396, B:384:0x239e, B:386:0x23a4, B:389:0x23ca, B:391:0x23cd, B:392:0x23ad, B:394:0x23b1, B:396:0x23b5, B:398:0x23b9, B:400:0x23bd, B:407:0x23d0, B:409:0x23d4, B:411:0x23f5, B:413:0x23f9, B:415:0x241d, B:417:0x2423, B:419:0x2427, B:421:0x243a, B:424:0x2465, B:426:0x246b, B:428:0x24a9, B:430:0x24ad, B:432:0x24bf, B:434:0x24c5, B:439:0x24f1, B:608:0x246f, B:610:0x2475, B:613:0x247b, B:626:0x2455, B:627:0x23fd, B:630:0x2405, B:632:0x240d, B:635:0x23d8, B:637:0x23de, B:639:0x23e2, B:641:0x23e7), top: B:373:0x2376 }] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x23d4 A[Catch: Exception -> 0x23a9, TryCatch #3 {Exception -> 0x23a9, blocks: (B:374:0x2376, B:376:0x237a, B:378:0x238c, B:380:0x2392, B:382:0x2396, B:384:0x239e, B:386:0x23a4, B:389:0x23ca, B:391:0x23cd, B:392:0x23ad, B:394:0x23b1, B:396:0x23b5, B:398:0x23b9, B:400:0x23bd, B:407:0x23d0, B:409:0x23d4, B:411:0x23f5, B:413:0x23f9, B:415:0x241d, B:417:0x2423, B:419:0x2427, B:421:0x243a, B:424:0x2465, B:426:0x246b, B:428:0x24a9, B:430:0x24ad, B:432:0x24bf, B:434:0x24c5, B:439:0x24f1, B:608:0x246f, B:610:0x2475, B:613:0x247b, B:626:0x2455, B:627:0x23fd, B:630:0x2405, B:632:0x240d, B:635:0x23d8, B:637:0x23de, B:639:0x23e2, B:641:0x23e7), top: B:373:0x2376 }] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x246b A[Catch: Exception -> 0x23a9, TryCatch #3 {Exception -> 0x23a9, blocks: (B:374:0x2376, B:376:0x237a, B:378:0x238c, B:380:0x2392, B:382:0x2396, B:384:0x239e, B:386:0x23a4, B:389:0x23ca, B:391:0x23cd, B:392:0x23ad, B:394:0x23b1, B:396:0x23b5, B:398:0x23b9, B:400:0x23bd, B:407:0x23d0, B:409:0x23d4, B:411:0x23f5, B:413:0x23f9, B:415:0x241d, B:417:0x2423, B:419:0x2427, B:421:0x243a, B:424:0x2465, B:426:0x246b, B:428:0x24a9, B:430:0x24ad, B:432:0x24bf, B:434:0x24c5, B:439:0x24f1, B:608:0x246f, B:610:0x2475, B:613:0x247b, B:626:0x2455, B:627:0x23fd, B:630:0x2405, B:632:0x240d, B:635:0x23d8, B:637:0x23de, B:639:0x23e2, B:641:0x23e7), top: B:373:0x2376 }] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x252a  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x2808  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x2845  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x284d  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x2717  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x2479 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:619:0x2490  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x2493  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x22f2 A[Catch: Exception -> 0x22f5, TRY_LEAVE, TryCatch #7 {Exception -> 0x22f5, blocks: (B:339:0x22a0, B:341:0x22a6, B:646:0x22f2), top: B:338:0x22a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:649:0x21c1  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x2222  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x2232 A[LOOP:12: B:693:0x222d->B:695:0x2232, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:696:0x2244 A[EDGE_INSN: B:696:0x2244->B:697:0x2244 BREAK  A[LOOP:12: B:693:0x222d->B:695:0x2232], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:711:0x1d4a  */
    /* JADX WARN: Removed duplicated region for block: B:847:0x1c9f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x16cc  */
    /* JADX WARN: Removed duplicated region for block: B:853:0x1bd5  */
    /* JADX WARN: Removed duplicated region for block: B:858:0x1c38  */
    /* JADX WARN: Removed duplicated region for block: B:875:0x1c81 A[EDGE_INSN: B:875:0x1c81->B:876:0x1c81 BREAK  A[LOOP:13: B:856:0x1c33->B:871:0x1c6b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:877:0x1bf7  */
    /* JADX WARN: Removed duplicated region for block: B:880:0x19fe A[Catch: Exception -> 0x1986, TryCatch #12 {Exception -> 0x1986, blocks: (B:149:0x196d, B:152:0x197c, B:153:0x198f, B:156:0x19a5, B:158:0x19ab, B:159:0x19b7, B:161:0x19ca, B:163:0x19d0, B:166:0x19e1, B:168:0x19e5, B:169:0x1a1f, B:171:0x1a23, B:173:0x1a2c, B:174:0x1a35, B:880:0x19fe), top: B:148:0x196d }] */
    /* JADX WARN: Removed duplicated region for block: B:882:0x19a4  */
    /* JADX WARN: Removed duplicated region for block: B:892:0x198b  */
    /* JADX WARN: Removed duplicated region for block: B:896:0x18ac  */
    /* JADX WARN: Removed duplicated region for block: B:902:0x18cf  */
    /* JADX WARN: Removed duplicated region for block: B:927:0x17e2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x1732  */
    /* JADX WARN: Removed duplicated region for block: B:939:0x1773  */
    /* JADX WARN: Removed duplicated region for block: B:941:0x175e  */
    /* JADX WARN: Removed duplicated region for block: B:944:0x171f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x1763  */
    /* JADX WARN: Type inference failed for: r11v59, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r3v212, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v215, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r61v0, types: [android.view.View, org.telegram.ui.Cells.s2] */
    /* JADX WARN: Type inference failed for: r8v46, types: [android.text.SpannableStringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u() {
        int i10;
        float f7;
        float f10;
        boolean z10;
        char c10;
        int i11;
        CharSequence charSequence;
        long j3;
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        TLRPC.DraftMessage draftMessage;
        TLRPC.DraftMessage draftMessage2;
        TLRPC.DraftMessage draftMessage3;
        boolean z14;
        CharSequence charSequence2;
        boolean z15;
        int i13;
        CharSequence charSequence3;
        boolean z16;
        CharSequence charSequence4;
        String string;
        CharSequence charSequence5;
        boolean z17;
        CharSequence replaceEmoji;
        CharSequence charSequence6;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TL_iv.RichMessage richMessage;
        CharSequence charSequence7;
        CharSequence charSequence8;
        TLRPC.Chat chat;
        CharSequence charSequence9;
        CharSequence charSequence10;
        String str;
        boolean z18;
        MessageObject messageObject;
        CharSequence charSequence11;
        CharSequence charSequence12;
        CharSequence replaceNewLines;
        CharSequence charSequence13;
        char c11;
        String str2;
        boolean z19;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence14;
        boolean isChannelAndNotMegaGroup;
        String formatPluralString;
        char c12;
        int i14;
        String formatPluralString2;
        MessageObject messageObject2;
        TLRPC.Message message;
        String str3;
        int i15;
        CharSequence replaceEmoji2;
        CharSequence charSequence15;
        CharSequence highlightText;
        u10 u10Var;
        TLRPC.User user;
        MessageObject messageObject3;
        TLRPC.User user2;
        CharSequence charSequence16;
        CharSequence charSequence17;
        CharSequence G;
        CharSequence charSequence18;
        String str4;
        String str5;
        String str6;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessagePeerReaction> arrayList2;
        CharSequence formatString;
        CharSequence charSequence19;
        CharSequence charSequence20;
        CharSequence charSequence21;
        String stringForMessageListDate;
        MessageObject messageObject4;
        boolean z20;
        String str7;
        String str8;
        MessagesController messagesController;
        CharSequence charSequence22;
        CharSequence escape;
        CharSequence charSequence23;
        String str9;
        String str10;
        boolean z21;
        CharSequence charSequence24;
        int i16;
        boolean z22;
        String str11;
        String str12;
        boolean z23;
        MessageObject messageObject5;
        TLRPC.Message message2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i17;
        TLRPC.Chat chat2;
        MessageObject messageObject6;
        CharSequence charSequence25;
        float f11;
        float f12;
        int i18;
        int i19;
        boolean z24;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int dp;
        int dp2;
        int dp3;
        int i20;
        int i21;
        ImageReceiver[] imageReceiverArr;
        int i22;
        int i23;
        xs xsVar;
        boolean z25;
        int max;
        CharSequence charSequence26;
        int dp4;
        int i24;
        ImageReceiver[] imageReceiverArr2;
        MessageObject messageObject7;
        int lineCount;
        int lineCount2;
        int lineCount3;
        StaticLayout staticLayout;
        float primaryHorizontal;
        float primaryHorizontal2;
        int i25;
        int lineCount4;
        int lineCount5;
        int lineCount6;
        CharSequence charSequence27;
        CharSequence charSequence28;
        int i26;
        CharSequence highlightText2;
        MessageObject messageObject8;
        xs xsVar2;
        int dp5;
        int dp6;
        xs xsVar3;
        int dp7;
        CharSequence highlightText3;
        CharSequence charSequence29;
        SpannableStringBuilder I;
        if (this.j0) {
            return;
        }
        if (this.N0 && !this.I4.a() && this.J0 == 0 && this.K0 == 0 && this.h2 == null) {
            return;
        }
        if (!this.r2) {
            int i27 = SharedConfig.PASSCODE_TYPE_PIN;
        }
        org.telegram.ui.ActionBar.i6.B0[0].setTextSize(AndroidUtilities.dp(17.0f));
        org.telegram.ui.ActionBar.i6.C0[0].setTextSize(AndroidUtilities.dp(17.0f));
        org.telegram.ui.ActionBar.i6.F0[0].setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.i6.H0[0].setTextSize(AndroidUtilities.dp(16.0f));
        boolean z26 = true;
        org.telegram.ui.ActionBar.i6.B0[1].setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.i6.C0[1].setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.i6.F0[1].setTextSize(AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.i6.H0[1].setTextSize(AndroidUtilities.dp(15.0f));
        TextPaint textPaint = org.telegram.ui.ActionBar.i6.F0[1];
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i9, this.J4);
        textPaint.linkColor = w02;
        textPaint.setColor(w02);
        this.E0 = 1;
        this.L4 = 18;
        this.M0 = 0;
        CharSequence printingString = (Q() || !(this.N0 || this.P)) ? null : MessagesController.getInstance(this.F0).getPrintingString(this.H0, getTopicId(), true);
        this.a0 = org.telegram.ui.ActionBar.i6.F0[this.E0];
        this.G2 = false;
        this.j4 = false;
        this.k4 = false;
        this.l4 = false;
        this.x0 = false;
        this.y0 = false;
        this.p4 = 0;
        this.z3 = false;
        this.R1 = 0;
        this.S1 = false;
        this.D2 = false;
        boolean z27 = (UserObject.isUserSelf(this.f2) || this.u2) ? false : true;
        this.j2 = -1;
        if (!Q()) {
            this.h3 = null;
        }
        setOpenBotButton(false);
        if ((this.r2 || SharedConfig.useThreeLinesLayout) && this.J0 == 0 && !Q() && !M()) {
            this.W = false;
            i10 = 2;
        } else {
            this.W = true;
            i10 = 1;
        }
        MessageObject messageObject9 = this.f1;
        if (messageObject9 != null) {
            messageObject9.updateTranslation();
        }
        MessageObject messageObject10 = this.f1;
        CharSequence charSequence30 = messageObject10 != null ? messageObject10.messageText : null;
        if (charSequence30 instanceof Spannable) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence30);
            f10 = 16.0f;
            f7 = 17.0f;
            for (u61 u61Var : (u61[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), u61.class)) {
                spannableStringBuilder2.removeSpan(u61Var);
            }
            for (t61 t61Var : (t61[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), t61.class)) {
                spannableStringBuilder2.removeSpan(t61Var);
            }
            charSequence30 = spannableStringBuilder2;
        } else {
            f7 = 17.0f;
            f10 = 16.0f;
        }
        this.i1 = charSequence30;
        if (this.F) {
            this.z3 = true;
            z10 = false;
            z27 = false;
        } else {
            z10 = true;
        }
        n2 n2Var = this.G0;
        if (n2Var != null) {
            if (n2Var.g == 2) {
                this.G2 = true;
                if (this.r2 || SharedConfig.useThreeLinesLayout) {
                    this.K2 = AndroidUtilities.dp(12.5f);
                    if (LocaleController.isRTL) {
                        this.J2 = (getMeasuredWidth() - AndroidUtilities.dp(this.I + 6)) - org.telegram.ui.ActionBar.i6.a1.getIntrinsicWidth();
                        this.x2 = AndroidUtilities.dp(22.0f);
                    } else {
                        this.J2 = AndroidUtilities.dp(this.I + 6);
                        this.x2 = org.telegram.ui.ActionBar.i6.a1.getIntrinsicWidth() + AndroidUtilities.dp(this.I + 10);
                    }
                } else {
                    this.K2 = AndroidUtilities.dp(16.5f);
                    if (LocaleController.isRTL) {
                        this.J2 = (getMeasuredWidth() - AndroidUtilities.dp(this.I + 4)) - org.telegram.ui.ActionBar.i6.a1.getIntrinsicWidth();
                        this.x2 = AndroidUtilities.dp(18.0f);
                    } else {
                        this.J2 = AndroidUtilities.dp(this.I + 4);
                        this.x2 = org.telegram.ui.ActionBar.i6.a1.getIntrinsicWidth() + AndroidUtilities.dp(this.I + 8);
                    }
                }
            } else {
                this.j4 = !this.n1 && n2Var.i;
                if (this.r2 || SharedConfig.useThreeLinesLayout) {
                    if (LocaleController.isRTL) {
                        this.x2 = AndroidUtilities.dp(22.0f);
                    } else {
                        this.x2 = AndroidUtilities.dp(this.I + 6);
                    }
                } else if (LocaleController.isRTL) {
                    this.x2 = AndroidUtilities.dp(18.0f);
                } else {
                    this.x2 = AndroidUtilities.dp(this.I + 4);
                }
            }
            n2 n2Var2 = this.G0;
            if (n2Var2.g == 1) {
                string = LocaleController.getString(R.string.FromYou);
                n2 n2Var3 = this.G0;
                if (n2Var3.j) {
                    this.a0 = org.telegram.ui.ActionBar.i6.H0[this.E0];
                    I = I(this.f1.messageText, null, i10);
                    I.setSpan(new u10(org.telegram.ui.ActionBar.i6.o9, this.J4), 0, I.length(), 33);
                } else {
                    String str13 = n2Var3.b;
                    if (str13.length() > 150) {
                        str13 = str13.substring(0, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    }
                    I = (this.r2 || SharedConfig.useThreeLinesLayout) ? I(str13, string, i10) : I(str13.replace('\n', ' '), string, i10);
                }
                charSequence29 = Emoji.replaceEmoji(I, org.telegram.ui.ActionBar.i6.F0[this.E0].getFontMetricsInt(), false);
                z21 = false;
            } else {
                charSequence29 = n2Var2.b;
                if (n2Var2.j) {
                    this.a0 = org.telegram.ui.ActionBar.i6.H0[this.E0];
                }
                z21 = true;
                string = null;
            }
            c10 = '\n';
            str10 = LocaleController.stringForMessageListDate(this.G0.h);
            int i28 = this.G0.d;
            if (i28 != 0) {
                this.G3 = true;
                str7 = String.format("%d", Integer.valueOf(i28));
            } else {
                this.G3 = false;
                str7 = null;
            }
            n2 n2Var4 = this.G0;
            int i29 = n2Var4.k;
            if (i29 == 2) {
                this.Q2 = true;
                this.R2 = true;
                this.S2 = false;
            } else if (i29 == 1) {
                this.Q2 = false;
                this.R2 = true;
                this.S2 = false;
            } else {
                this.S2 = false;
                this.Q2 = false;
                this.R2 = false;
            }
            this.t3 = false;
            charSequence22 = n2Var4.a;
            replaceEmoji = charSequence29;
            str9 = null;
            charSequence24 = null;
            charSequence23 = "";
            i13 = -1;
        } else {
            c10 = '\n';
            if (this.r2 || SharedConfig.useThreeLinesLayout) {
                if (LocaleController.isRTL) {
                    this.x2 = AndroidUtilities.dp(22.0f);
                } else {
                    this.x2 = AndroidUtilities.dp(this.I + 6);
                }
            } else if (LocaleController.isRTL) {
                this.x2 = AndroidUtilities.dp(18.0f);
            } else {
                this.x2 = AndroidUtilities.dp(this.I + 4);
            }
            if (this.h2 != null) {
                if (this.J0 == 0) {
                    this.G2 = true;
                    if (this.r2 || SharedConfig.useThreeLinesLayout) {
                        this.K2 = AndroidUtilities.dp(12.5f);
                        if (LocaleController.isRTL) {
                            this.J2 = (getMeasuredWidth() - AndroidUtilities.dp(this.I + 6)) - org.telegram.ui.ActionBar.i6.a1.getIntrinsicWidth();
                            this.x2 = AndroidUtilities.dp(22.0f);
                        } else {
                            this.J2 = AndroidUtilities.dp(this.I + 6);
                            this.x2 = org.telegram.ui.ActionBar.i6.a1.getIntrinsicWidth() + AndroidUtilities.dp(this.I + 10);
                        }
                    } else {
                        this.K2 = AndroidUtilities.dp(16.5f);
                        if (LocaleController.isRTL) {
                            this.J2 = (getMeasuredWidth() - AndroidUtilities.dp(this.I + 4)) - org.telegram.ui.ActionBar.i6.a1.getIntrinsicWidth();
                            this.x2 = AndroidUtilities.dp(18.0f);
                        } else {
                            this.J2 = AndroidUtilities.dp(this.I + 4);
                            this.x2 = org.telegram.ui.ActionBar.i6.a1.getIntrinsicWidth() + AndroidUtilities.dp(this.I + 8);
                        }
                    }
                }
            } else if (this.J0 == 0 && !this.P) {
                TLRPC.Chat chat3 = this.g2;
                if (chat3 != null) {
                    long botVerificationIcon = DialogObject.getBotVerificationIcon(chat3);
                    TLRPC.Chat chat4 = this.g2;
                    if (chat4.scam) {
                        this.p4 = 1;
                        org.telegram.ui.ActionBar.i6.g1.a();
                    } else if (chat4.fake) {
                        this.p4 = 2;
                        org.telegram.ui.ActionBar.i6.h1.a();
                    } else if (DialogObject.getEmojiStatusDocumentId(chat4.emoji_status) != 0) {
                        this.l4 = true;
                        this.D2 = true;
                        org.telegram.ui.Components.q5 q5Var = this.n4;
                        q5Var.a = LocaleController.isRTL;
                        q5Var.j(DialogObject.getEmojiStatusDocumentId(this.g2.emoji_status), false);
                        this.n4.m(DialogObject.isEmojiStatusCollectible(this.g2.emoji_status), false);
                    } else {
                        boolean z28 = this.n1;
                        this.j4 = !z28 && this.g2.verified;
                        this.k4 = (z28 || this.g2.bot_verification_icon == 0) ? false : true;
                    }
                    charSequence = charSequence30;
                    j3 = botVerificationIcon;
                    i11 = i10;
                } else {
                    TLRPC.User user3 = this.f2;
                    if (user3 != null) {
                        j3 = DialogObject.getBotVerificationIcon(user3);
                        TLRPC.User user4 = this.f2;
                        if (user4.scam) {
                            this.p4 = 1;
                            org.telegram.ui.ActionBar.i6.g1.a();
                        } else if (user4.fake) {
                            this.p4 = 2;
                            org.telegram.ui.ActionBar.i6.h1.a();
                        } else {
                            boolean z29 = this.n1;
                            this.j4 = !z29 && user4.verified;
                            if (z29 || UserObject.isUserSelf(user4)) {
                                charSequence = charSequence30;
                            } else {
                                charSequence = charSequence30;
                                if (this.f2.bot_verification_icon != 0) {
                                    z11 = true;
                                    this.k4 = z11;
                                    if (MessagesController.getInstance(this.F0).isPremiumUser(this.f2)) {
                                        long j10 = UserConfig.getInstance(this.F0).clientUserId;
                                        i11 = i10;
                                        long j11 = this.f2.id;
                                        if (j10 != j11 && j11 != 0) {
                                            z12 = true;
                                            this.l4 = z12;
                                            if (z12) {
                                                Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(this.f2);
                                                org.telegram.ui.Components.q5 q5Var2 = this.n4;
                                                q5Var2.a = LocaleController.isRTL;
                                                if (emojiStatusDocumentId != null) {
                                                    this.D2 = true;
                                                    q5Var2.j(emojiStatusDocumentId.longValue(), false);
                                                    this.n4.m(DialogObject.isEmojiStatusCollectible(this.f2.emoji_status), false);
                                                } else {
                                                    this.D2 = true;
                                                    q5Var2.g(rg.b1.d().e, false);
                                                    this.n4.m(false, false);
                                                }
                                            }
                                        }
                                    } else {
                                        i11 = i10;
                                    }
                                    z12 = false;
                                    this.l4 = z12;
                                    if (z12) {
                                    }
                                }
                            }
                            z11 = false;
                            this.k4 = z11;
                            if (MessagesController.getInstance(this.F0).isPremiumUser(this.f2)) {
                            }
                            z12 = false;
                            this.l4 = z12;
                            if (z12) {
                            }
                        }
                        charSequence = charSequence30;
                        if (MessagesController.getInstance(this.F0).isPremiumUser(this.f2)) {
                        }
                        z12 = false;
                        this.l4 = z12;
                        if (z12) {
                        }
                    } else {
                        i11 = i10;
                        charSequence = charSequence30;
                        j3 = 0;
                    }
                }
                if (j3 != 0 && this.k4) {
                    this.o4.j(j3, false);
                }
                i12 = this.R0;
                if (i12 == 0 && (messageObject6 = this.f1) != null) {
                    i12 = messageObject6.messageOwner.date;
                }
                if (!this.P) {
                    boolean z30 = MediaDataController.getInstance(this.F0).getDraftVoice(this.H0, (long) getTopicId()) != null;
                    this.k2 = z30;
                    TLRPC.DraftMessage draft = !z30 ? MediaDataController.getInstance(this.F0).getDraft(this.H0, getTopicId()) : null;
                    this.l2 = draft;
                    if (draft != null && TextUtils.isEmpty(draft.message)) {
                        this.l2 = null;
                    }
                } else if (this.N0 || this.s0) {
                    boolean z31 = MediaDataController.getInstance(this.F0).getDraftVoice(this.H0, (long) getTopicId()) != null;
                    this.k2 = z31;
                    this.l2 = !z31 ? MediaDataController.getInstance(this.F0).getDraft(this.H0, 0L) : null;
                } else {
                    this.k2 = false;
                    this.l2 = null;
                }
                z13 = this.k2;
                if (!z13 || this.l2 != null) {
                    if (!z13 && (draftMessage2 = this.l2) != null && TextUtils.isEmpty(draftMessage2.message)) {
                        draftMessage3 = this.l2;
                        if (draftMessage3.rich_message == null) {
                            TLRPC.InputReplyTo inputReplyTo = draftMessage3.reply_to;
                            if (inputReplyTo == null) {
                            }
                            this.l2 = null;
                            this.k2 = false;
                            if (Q()) {
                                this.l2 = null;
                                this.k2 = false;
                                this.V = true;
                                c0();
                                string = ChatObject.isMonoForum(this.g2) ? null : AndroidUtilities.escape(getMessageNameString());
                                if (ChatObject.isMonoForum(this.g2)) {
                                    i17 = i11;
                                    if (i17 == 1) {
                                        i17 = 2;
                                    }
                                    string = null;
                                    if (i17 == 3) {
                                        i17 = 4;
                                    }
                                } else {
                                    i17 = i11;
                                }
                                charSequence19 = J();
                                MessageObject messageObject11 = this.f1;
                                String L = this.f1 != null ? L(i17, string, messageObject11 != null ? MessagesController.getInstance(messageObject11.currentAccount).getRestrictionReason(this.f1.messageOwner.restriction_reason) : null, true) : "";
                                CharSequence charSequence31 = L;
                                if (this.e0) {
                                    int length = L.length();
                                    charSequence31 = L;
                                    charSequence31 = L;
                                    if (length >= 0 && string != null) {
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(L);
                                        valueOf.setSpan(new u10(org.telegram.ui.ActionBar.i6.X8, this.J4), 0, Math.min(valueOf.length(), string.length() + 1), 0);
                                        charSequence31 = valueOf;
                                    }
                                }
                                this.a0 = org.telegram.ui.ActionBar.i6.F0[this.E0];
                                z16 = z10;
                                charSequence20 = charSequence31;
                            } else {
                                int i30 = i11;
                                if (TextUtils.isEmpty(this.I0)) {
                                    if (printingString != null) {
                                        this.i2 = printingString;
                                        z14 = z27;
                                        charSequence2 = charSequence;
                                        int intValue = MessagesController.getInstance(this.F0).getPrintingStringType(this.H0, getTopicId()).intValue();
                                        this.j2 = intValue;
                                        ox0 u02 = org.telegram.ui.ActionBar.i6.u0(intValue);
                                        int dp8 = u02 != null ? AndroidUtilities.dp(3.0f) + u02.getIntrinsicWidth() : 0;
                                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                        CharSequence replace = TextUtils.replace(printingString, new String[]{"..."}, new String[]{""});
                                        int indexOf = this.j2 == 5 ? replace.toString().indexOf("**oo**") : -1;
                                        if (indexOf >= 0) {
                                            spannableStringBuilder3.append(replace).setSpan(new q2(org.telegram.ui.ActionBar.i6.u0(this.j2).getIntrinsicWidth()), indexOf, indexOf + 6, 0);
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) " ").append(replace).setSpan(new q2(dp8), 0, 1, 0);
                                        }
                                        z15 = false;
                                        i13 = indexOf;
                                        charSequence3 = spannableStringBuilder3;
                                    } else {
                                        z14 = z27;
                                        charSequence2 = charSequence;
                                        this.i2 = null;
                                        this.j2 = -1;
                                        z15 = true;
                                        i13 = -1;
                                        charSequence3 = "";
                                    }
                                    if (this.k2 || this.l2 != null) {
                                        z16 = z10;
                                        charSequence4 = " ";
                                        CharSequence charSequence32 = charSequence3;
                                        string = LocaleController.getString(R.string.Draft);
                                        TLRPC.DraftMessage draftMessage4 = this.l2;
                                        if (draftMessage4 == null || !TextUtils.isEmpty(draftMessage4.message) || this.l2.rich_message != null) {
                                            TLRPC.DraftMessage draftMessage5 = this.l2;
                                            if (draftMessage5 != null && (richMessage = draftMessage5.rich_message) != null) {
                                                charSequence5 = MessageObject.formatRichMessage(richMessage, false, false, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                                            } else if (this.k2) {
                                                charSequence5 = LocaleController.getString(R.string.AttachAudio);
                                            } else if (draftMessage5 != null) {
                                                String str14 = draftMessage5.message;
                                                int length2 = str14.length();
                                                charSequence5 = str14;
                                                if (length2 > 150) {
                                                    charSequence5 = str14.subSequence(0, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                                                }
                                            } else {
                                                charSequence5 = "";
                                            }
                                            SpannableString spannableString = new SpannableString(charSequence5);
                                            TLRPC.DraftMessage draftMessage6 = this.l2;
                                            if (draftMessage6 != null) {
                                                MediaDataController.addTextStyleRuns(draftMessage6, spannableString, 264);
                                                TLRPC.DraftMessage draftMessage7 = this.l2;
                                                if (draftMessage7 != null && (arrayList = draftMessage7.entities) != null) {
                                                    TextPaint textPaint2 = this.a0;
                                                    MediaDataController.addAnimatedEmojiSpans(arrayList, spannableString, textPaint2 == null ? null : textPaint2.getFontMetricsInt());
                                                }
                                            } else if (this.k2) {
                                                spannableString.setSpan(new u10(org.telegram.ui.ActionBar.i6.p9, this.J4), 0, spannableString.length(), 33);
                                            }
                                            SpannableStringBuilder I2 = I(AndroidUtilities.replaceNewLines(spannableString), string, i30);
                                            if ((this.r2 || SharedConfig.useThreeLinesLayout) && !M()) {
                                                z17 = false;
                                            } else {
                                                z17 = false;
                                                I2.setSpan(new u10(org.telegram.ui.ActionBar.i6.j9, this.J4), 0, string.length() + 1, 33);
                                            }
                                            replaceEmoji = Emoji.replaceEmoji(I2, org.telegram.ui.ActionBar.i6.F0[this.E0].getFontMetricsInt(), z17);
                                            charSequence6 = charSequence32;
                                        } else if ((this.r2 || SharedConfig.useThreeLinesLayout) && !M()) {
                                            charSequence6 = charSequence32;
                                            replaceEmoji = "";
                                        } else {
                                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string);
                                            z26 = false;
                                            valueOf2.setSpan(new u10(org.telegram.ui.ActionBar.i6.j9, this.J4), 0, string.length(), 33);
                                            replaceEmoji = valueOf2;
                                            charSequence8 = charSequence32;
                                            z27 = z14;
                                        }
                                        z27 = z14;
                                        charSequence7 = null;
                                        z26 = false;
                                        charSequence21 = charSequence6;
                                        if (!this.x0 && !P() && !Q() && !O() && this.l2 == null && (messageObject5 = this.f1) != null && (message2 = messageObject5.messageOwner) != null && (message2.action instanceof TLRPC.TL_messageActionStarGift)) {
                                            this.y0 = true;
                                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceEmoji);
                                            spannableStringBuilder4.insert(0, (CharSequence) "d ");
                                            er erVar = new er(f0.c.c(getContext(), R.drawable.mini_gift).mutate());
                                            erVar.setScale(1.25f, 1.25f);
                                            erVar.spaceScaleX = 0.9f;
                                            erVar.setAlpha(0.9f);
                                            spannableStringBuilder4.setSpan(erVar, 0, 1, 0);
                                            tL_textWithEntities = ((TLRPC.TL_messageActionStarGift) this.f1.messageOwner.action).message;
                                            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                                                this.a0 = org.telegram.ui.ActionBar.i6.F0[this.E0];
                                            }
                                            replaceEmoji = spannableStringBuilder4;
                                        }
                                        if (TextUtils.isEmpty(this.I0)) {
                                            if (this.l2 != null) {
                                                stringForMessageListDate = LocaleController.stringForMessageListDate(r5.date);
                                            } else {
                                                int i31 = this.R0;
                                                if (i31 != 0) {
                                                    stringForMessageListDate = LocaleController.stringForMessageListDate(i31);
                                                } else {
                                                    if (this.f1 != null) {
                                                        stringForMessageListDate = LocaleController.stringForMessageListDate(r5.messageOwner.date);
                                                    }
                                                }
                                            }
                                            messageObject4 = this.f1;
                                            if (messageObject4 != null || this.r0) {
                                                this.Q2 = false;
                                                this.R2 = false;
                                                this.S2 = messageObject4 == null && messageObject4.isSending() && this.H0 == UserConfig.getInstance(this.F0).getClientUserId();
                                                z20 = false;
                                                this.G3 = false;
                                                this.b4 = false;
                                                this.c4 = false;
                                                this.d4 = false;
                                                this.t3 = false;
                                                str7 = null;
                                                str8 = null;
                                            } else {
                                                if (this.J0 != 0) {
                                                    int i32 = this.S0;
                                                    int i33 = this.U0;
                                                    int i34 = i32 + i33;
                                                    if (i34 <= 0) {
                                                        z23 = false;
                                                        this.G3 = false;
                                                        this.b4 = false;
                                                        str12 = null;
                                                    } else if (i32 > i33) {
                                                        this.G3 = true;
                                                        z23 = false;
                                                        this.b4 = false;
                                                        str11 = String.format("%d", Integer.valueOf(i34));
                                                        str12 = null;
                                                        this.c4 = z23;
                                                        this.d4 = z23;
                                                    } else {
                                                        z23 = false;
                                                        this.G3 = false;
                                                        this.b4 = true;
                                                        str12 = String.format("%d", Integer.valueOf(i34));
                                                    }
                                                    str11 = null;
                                                    this.c4 = z23;
                                                    this.d4 = z23;
                                                } else {
                                                    if (this.h1) {
                                                        this.G3 = false;
                                                        z27 = false;
                                                        z22 = true;
                                                    } else {
                                                        int i35 = this.S0;
                                                        if (i35 != 0) {
                                                            z22 = true;
                                                            this.G3 = true;
                                                            str11 = String.format("%d", Integer.valueOf(i35));
                                                        } else {
                                                            z22 = true;
                                                            if (this.T0) {
                                                                this.G3 = true;
                                                                str11 = "";
                                                            } else {
                                                                this.G3 = false;
                                                            }
                                                        }
                                                        if (this.U0 == 0) {
                                                            this.b4 = z22;
                                                            str12 = "@";
                                                        } else {
                                                            this.b4 = false;
                                                            str12 = null;
                                                        }
                                                        this.c4 = this.V0 <= 0;
                                                        this.d4 = this.W0 <= 0;
                                                    }
                                                    str11 = null;
                                                    if (this.U0 == 0) {
                                                    }
                                                    this.c4 = this.V0 <= 0;
                                                    this.d4 = this.W0 <= 0;
                                                }
                                                if (this.f1.isOut() && this.l2 == null && z27) {
                                                    MessageObject messageObject12 = this.f1;
                                                    if (!(messageObject12.messageOwner.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                                                        if (messageObject12.isSending()) {
                                                            z20 = false;
                                                            this.Q2 = false;
                                                            this.R2 = false;
                                                            this.S2 = true;
                                                            this.t3 = false;
                                                        } else {
                                                            z20 = false;
                                                            if (this.f1.isSendError()) {
                                                                this.Q2 = false;
                                                                this.R2 = false;
                                                                this.S2 = false;
                                                                this.t3 = true;
                                                                this.G3 = false;
                                                                this.b4 = false;
                                                            } else if (this.f1.isSent()) {
                                                                TLRPC.TL_forumTopic tL_forumTopic = this.N;
                                                                if (tL_forumTopic != null) {
                                                                    this.Q2 = tL_forumTopic.read_outbox_max_id >= this.f1.getId();
                                                                } else if (this.N0) {
                                                                    int i36 = this.H4;
                                                                    this.Q2 = (i36 > 0 && i36 >= this.f1.getId()) || !this.f1.isUnread() || (ChatObject.isChannel(this.g2) && !this.g2.megagroup);
                                                                } else {
                                                                    this.Q2 = !this.f1.isUnread() || (ChatObject.isChannel(this.g2) && !this.g2.megagroup);
                                                                }
                                                                this.R2 = true;
                                                                z20 = false;
                                                                this.S2 = false;
                                                                this.t3 = false;
                                                            } else {
                                                                z20 = false;
                                                            }
                                                        }
                                                        str8 = str12;
                                                        str7 = str11;
                                                    }
                                                }
                                                z20 = false;
                                                this.Q2 = false;
                                                this.R2 = false;
                                                this.S2 = false;
                                                this.t3 = false;
                                                str8 = str12;
                                                str7 = str11;
                                            }
                                            this.P2 = z20;
                                            messagesController = MessagesController.getInstance(this.F0);
                                            if (this.j1 == 0 && messagesController.isPromoDialog(this.H0, true)) {
                                                this.z3 = true;
                                                this.P2 = true;
                                                i16 = messagesController.promoDialogType;
                                                if (i16 != MessagesController.PROMO_TYPE_PROXY) {
                                                    stringForMessageListDate = LocaleController.getString(R.string.UseProxySponsor);
                                                } else if (i16 == MessagesController.PROMO_TYPE_PSA) {
                                                    stringForMessageListDate = LocaleController.getString("PsaType_" + messagesController.promoPsaType);
                                                    if (TextUtils.isEmpty(stringForMessageListDate)) {
                                                        stringForMessageListDate = LocaleController.getString(R.string.PsaTypeDefault);
                                                    }
                                                    if (!TextUtils.isEmpty(messagesController.promoPsaMessage)) {
                                                        replaceEmoji = messagesController.promoPsaMessage;
                                                        this.R1 = 0;
                                                    }
                                                }
                                            }
                                            charSequence22 = this.L0;
                                            if (charSequence22 == null) {
                                                if (this.J0 != 0) {
                                                    charSequence22 = LocaleController.getString(R.string.ArchivedChats);
                                                } else {
                                                    TLRPC.Chat chat5 = this.g2;
                                                    if (chat5 != null) {
                                                        if (this.O) {
                                                            if (this.h0 == null) {
                                                                this.h0 = new Drawable[1];
                                                            }
                                                            this.h0[0] = null;
                                                            escape = MessagesController.getInstance(this.F0).getTopicsController().getTopicIconName(this.g2, this.f1, this.a0, this.h0);
                                                        } else if (this.P) {
                                                            if (this.h0 == null) {
                                                                this.h0 = new Drawable[1];
                                                            }
                                                            Drawable[] drawableArr = this.h0;
                                                            drawableArr[0] = null;
                                                            escape = this.g0 ? ng.d.j(this.N, org.telegram.ui.ActionBar.i6.B0[this.E0], drawableArr) : AndroidUtilities.escape(this.N.title);
                                                        } else if (!chat5.monoforum || chat5.linked_monoforum_id == 0) {
                                                            escape = AndroidUtilities.escape(chat5.title);
                                                        } else {
                                                            TLRPC.Chat chat6 = MessagesController.getInstance(this.F0).getChat(Long.valueOf(this.g2.linked_monoforum_id));
                                                            if (chat6 != null) {
                                                                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(AndroidUtilities.escape(chat6.title));
                                                                spannableStringBuilder5.append(charSequence4);
                                                                int length3 = spannableStringBuilder5.length();
                                                                spannableStringBuilder5.append((CharSequence) LocaleController.getString(R.string.MonoforumSpan));
                                                                spannableStringBuilder5.setSpan(new e10(LocaleController.getString(R.string.MonoforumSpan), org.telegram.ui.ActionBar.i6.y6, this.J4), length3, spannableStringBuilder5.length(), 33);
                                                                charSequence22 = spannableStringBuilder5;
                                                            } else {
                                                                escape = AndroidUtilities.escape(this.g2.title);
                                                            }
                                                        }
                                                        charSequence22 = escape;
                                                    } else {
                                                        TLRPC.User user5 = this.f2;
                                                        if (user5 != null) {
                                                            if (UserObject.isReplyUser(user5)) {
                                                                escape = LocaleController.getString(R.string.RepliesTitle);
                                                            } else if (UserObject.isAnonymous(this.f2)) {
                                                                escape = LocaleController.getString(R.string.AnonymousForward);
                                                            } else if (!UserObject.isUserSelf(this.f2) || this.q0) {
                                                                if (this.P) {
                                                                    if (this.h0 == null) {
                                                                        this.h0 = new Drawable[1];
                                                                    }
                                                                    Drawable[] drawableArr2 = this.h0;
                                                                    drawableArr2[0] = null;
                                                                    escape = this.g0 ? ng.d.j(this.N, org.telegram.ui.ActionBar.i6.B0[this.E0], drawableArr2) : AndroidUtilities.escape(this.N.title);
                                                                } else {
                                                                    escape = AndroidUtilities.escape(UserObject.getUserName(this.f2));
                                                                }
                                                            } else if (this.r0) {
                                                                escape = LocaleController.getString(R.string.MyNotes);
                                                            } else if (this.u2) {
                                                                escape = LocaleController.getString(R.string.FromYou);
                                                            } else {
                                                                if (this.j1 == 3) {
                                                                    this.z3 = true;
                                                                }
                                                                escape = LocaleController.getString(R.string.SavedMessages);
                                                            }
                                                            charSequence22 = escape;
                                                        }
                                                        charSequence22 = "";
                                                    }
                                                    if (charSequence22 != null && charSequence22.length() == 0) {
                                                        charSequence22 = LocaleController.getString(R.string.HiddenName);
                                                    }
                                                }
                                            }
                                            charSequence23 = charSequence21;
                                            str9 = str8;
                                            z10 = z16;
                                            str10 = stringForMessageListDate;
                                            z21 = z26;
                                            charSequence24 = charSequence7;
                                        }
                                        stringForMessageListDate = "";
                                        messageObject4 = this.f1;
                                        if (messageObject4 != null) {
                                        }
                                        this.Q2 = false;
                                        this.R2 = false;
                                        this.S2 = messageObject4 == null && messageObject4.isSending() && this.H0 == UserConfig.getInstance(this.F0).getClientUserId();
                                        z20 = false;
                                        this.G3 = false;
                                        this.b4 = false;
                                        this.c4 = false;
                                        this.d4 = false;
                                        this.t3 = false;
                                        str7 = null;
                                        str8 = null;
                                        this.P2 = z20;
                                        messagesController = MessagesController.getInstance(this.F0);
                                        if (this.j1 == 0) {
                                            this.z3 = true;
                                            this.P2 = true;
                                            i16 = messagesController.promoDialogType;
                                            if (i16 != MessagesController.PROMO_TYPE_PROXY) {
                                            }
                                        }
                                        charSequence22 = this.L0;
                                        if (charSequence22 == null) {
                                        }
                                        charSequence23 = charSequence21;
                                        str9 = str8;
                                        z10 = z16;
                                        str10 = stringForMessageListDate;
                                        z21 = z26;
                                        charSequence24 = charSequence7;
                                    } else {
                                        if (this.h1) {
                                            this.a0 = org.telegram.ui.ActionBar.i6.H0[this.E0];
                                            formatString = LocaleController.getString(R.string.HistoryCleared);
                                        } else {
                                            MessageObject messageObject13 = this.f1;
                                            if (messageObject13 != null) {
                                                String restrictionReason = MessagesController.getInstance(messageObject13.currentAccount).getRestrictionReason(this.f1.messageOwner.restriction_reason);
                                                long fromChatId = this.f1.getFromChatId();
                                                if (DialogObject.isUserDialog(fromChatId)) {
                                                    MessagesController.getInstance(this.F0).getUser(Long.valueOf(fromChatId));
                                                    chat = null;
                                                } else {
                                                    chat = MessagesController.getInstance(this.F0).getChat(Long.valueOf(-fromChatId));
                                                }
                                                this.L3 = true;
                                                if (this.j1 == 0) {
                                                    charSequence9 = " ";
                                                    if (this.H0 > 0 && this.f1.isOutOwner() && (tL_messageReactions = this.f1.messageOwner.reactions) != null && (arrayList2 = tL_messageReactions.recent_reactions) != null && !arrayList2.isEmpty() && this.V0 > 0) {
                                                        TLRPC.MessagePeerReaction messagePeerReaction = this.f1.messageOwner.reactions.recent_reactions.get(0);
                                                        if (messagePeerReaction.unread) {
                                                            long j12 = messagePeerReaction.peer_id.user_id;
                                                            if (j12 != 0 && j12 != UserConfig.getInstance(this.F0).clientUserId) {
                                                                zg.n0 d = zg.n0.d(messagePeerReaction.reaction);
                                                                this.a0 = org.telegram.ui.ActionBar.i6.H0[this.E0];
                                                                String str15 = d.f;
                                                                if (str15 != null) {
                                                                    z18 = true;
                                                                    str = LocaleController.formatString(R.string.ReactionInDialog, str15);
                                                                    charSequence10 = charSequence3;
                                                                    z16 = z10;
                                                                } else {
                                                                    String formatString2 = LocaleController.formatString(R.string.ReactionInDialog, "**reaction**");
                                                                    int indexOf2 = formatString2.indexOf("**reaction**");
                                                                    ?? spannableStringBuilder6 = new SpannableStringBuilder(formatString2.replace("**reaction**", "d"));
                                                                    charSequence10 = charSequence3;
                                                                    z16 = z10;
                                                                    long j13 = d.g;
                                                                    TextPaint textPaint3 = this.a0;
                                                                    spannableStringBuilder6.setSpan(new org.telegram.ui.Components.b6(j13, textPaint3 == null ? null : textPaint3.getFontMetricsInt()), indexOf2, indexOf2 + 1, 0);
                                                                    str = spannableStringBuilder6;
                                                                    z18 = true;
                                                                }
                                                                if (z18) {
                                                                    int i37 = this.j1;
                                                                    if (i37 == 2) {
                                                                        TLRPC.Chat chat7 = this.g2;
                                                                        if (chat7 != null) {
                                                                            if (ChatObject.isChannel(chat7)) {
                                                                                TLRPC.Chat chat8 = this.g2;
                                                                                if (!chat8.megagroup) {
                                                                                    int i38 = chat8.participants_count;
                                                                                    str5 = i38 != 0 ? LocaleController.formatPluralStringComma("Subscribers", i38) : !ChatObject.isPublic(chat8) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                                                                                }
                                                                            }
                                                                            TLRPC.Chat chat9 = this.g2;
                                                                            int i39 = chat9.participants_count;
                                                                            str5 = i39 != 0 ? LocaleController.formatPluralStringComma("Members", i39) : chat9.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat9) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase();
                                                                        } else {
                                                                            str5 = "";
                                                                        }
                                                                        this.L3 = false;
                                                                        str4 = str5;
                                                                    } else if (i37 == 3 && UserObject.isUserSelf(this.f2)) {
                                                                        ty tyVar = this.D4;
                                                                        str4 = LocaleController.getString((tyVar == null || !tyVar.O0) ? R.string.SavedMessagesInfo : R.string.SavedMessagesInfoQuote);
                                                                    } else {
                                                                        boolean z32 = this.r2;
                                                                        if (!z32 && !SharedConfig.useThreeLinesLayout && this.K0 != 0) {
                                                                            G = H();
                                                                        } else if (z32 || SharedConfig.useThreeLinesLayout || this.J0 == 0) {
                                                                            MessageObject messageObject14 = this.f1;
                                                                            if (!(messageObject14.messageOwner instanceof TLRPC.TL_messageService) || (MessageObject.isTopicActionMessage(messageObject14) && !(this.f1.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate))) {
                                                                                CharSequence charSequence33 = charSequence2;
                                                                                this.V = true;
                                                                                c0();
                                                                                String escape2 = (this.r0 || (user2 = this.f2) == null || !user2.self || this.f1.isOutOwner()) ? null : AndroidUtilities.escape(getMessageNameString());
                                                                                if ((!this.r0 || (user = this.f2) == null || user.self || (messageObject3 = this.f1) == null || !messageObject3.isOutOwner()) && escape2 == null && ((messageObject = this.f1) == null || (message = messageObject.messageOwner) == null || message.guestchat_via_from == null)) {
                                                                                    TLRPC.Chat chat10 = this.g2;
                                                                                    if (chat10 != null) {
                                                                                        long j14 = chat10.id;
                                                                                        if (j14 > 0) {
                                                                                            if (chat != null) {
                                                                                            }
                                                                                            if (ChatObject.isChannel(chat10)) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    TLRPC.User user6 = this.f2;
                                                                                    if (user6 == null || user6.id != UserObject.VERIFY || (messageObject2 = this.f1) == null || messageObject2.getForwardedFromId() == null) {
                                                                                        boolean isEmpty = TextUtils.isEmpty(restrictionReason);
                                                                                        CharSequence charSequence34 = restrictionReason;
                                                                                        if (isEmpty) {
                                                                                            if (MessageObject.isTopicActionMessage(this.f1)) {
                                                                                                MessageObject messageObject15 = this.f1;
                                                                                                CharSequence charSequence35 = messageObject15.messageTextShort;
                                                                                                if (charSequence35 == null || ((messageObject15.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate) && this.P)) {
                                                                                                    charSequence35 = messageObject15.messageText;
                                                                                                }
                                                                                                CharSequence charSequence36 = charSequence35;
                                                                                                charSequence34 = charSequence36;
                                                                                                if (messageObject15.topicIconDrawable[0] instanceof ng.a) {
                                                                                                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.F0).getTopicsController().findTopic(-this.f1.getDialogId(), MessageObject.getTopicId(this.F0, this.f1.messageOwner, true));
                                                                                                    charSequence34 = charSequence36;
                                                                                                    if (findTopic != null) {
                                                                                                        ((ng.a) this.f1.topicIconDrawable[0]).b(findTopic.icon_color);
                                                                                                        charSequence34 = charSequence36;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                TLRPC.MessageMedia messageMedia = this.f1.messageOwner.media;
                                                                                                if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                                                                                                    charSequence34 = LocaleController.getString(R.string.AttachPhotoExpired);
                                                                                                } else {
                                                                                                    if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                                                                                        TLRPC.Document document = messageMedia.document;
                                                                                                        if (((document instanceof TLRPC.TL_documentEmpty) || document == null) && messageMedia.ttl_seconds != 0) {
                                                                                                            charSequence34 = messageMedia.voice ? LocaleController.getString(R.string.AttachVoiceExpired) : messageMedia.round ? LocaleController.getString(R.string.AttachRoundExpired) : LocaleController.getString(R.string.AttachVideoExpired);
                                                                                                        }
                                                                                                    }
                                                                                                    String str16 = "🎧 ";
                                                                                                    if (getCaptionMessage() == null || (this.f1.messageOwner.media instanceof TLRPC.TL_messageMediaPoll)) {
                                                                                                        MessageObject messageObject16 = this.f1;
                                                                                                        TLRPC.Message message3 = messageObject16.messageOwner;
                                                                                                        TLRPC.MessageMedia messageMedia2 = message3.media;
                                                                                                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                                                                                            int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia2).extended_media.size();
                                                                                                            if (this.S1) {
                                                                                                                i14 = 1;
                                                                                                                if (size > 1) {
                                                                                                                    c12 = 0;
                                                                                                                    formatPluralString2 = LocaleController.formatPluralString("Media", size, new Object[0]);
                                                                                                                } else {
                                                                                                                    c12 = 0;
                                                                                                                    formatPluralString2 = LocaleController.getString(R.string.AttachVideo);
                                                                                                                }
                                                                                                            } else {
                                                                                                                c12 = 0;
                                                                                                                i14 = 1;
                                                                                                                formatPluralString2 = size > 1 ? LocaleController.formatPluralString("Photos", size, new Object[0]) : LocaleController.getString(R.string.AttachPhoto);
                                                                                                            }
                                                                                                            int i40 = R.string.AttachPaidMedia;
                                                                                                            Object[] objArr = new Object[i14];
                                                                                                            objArr[c12] = formatPluralString2;
                                                                                                            SpannableStringBuilder R0 = yh.p7.R0(LocaleController.formatString(i40, objArr));
                                                                                                            this.a0 = org.telegram.ui.ActionBar.i6.H0[this.E0];
                                                                                                            charSequence34 = R0;
                                                                                                        } else if (this.R1 > 1) {
                                                                                                            if (this.S1) {
                                                                                                                ArrayList arrayList3 = this.g1;
                                                                                                                formatPluralString = LocaleController.formatPluralString("Media", arrayList3 == null ? 0 : arrayList3.size(), new Object[0]);
                                                                                                            } else {
                                                                                                                ArrayList arrayList4 = this.g1;
                                                                                                                formatPluralString = LocaleController.formatPluralString("Photos", arrayList4 == null ? 0 : arrayList4.size(), new Object[0]);
                                                                                                            }
                                                                                                            charSequence34 = formatPluralString;
                                                                                                            this.a0 = org.telegram.ui.ActionBar.i6.H0[this.E0];
                                                                                                        } else {
                                                                                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                                                                                                                TLRPC.MessageFwdHeader messageFwdHeader = message3.fwd_from;
                                                                                                                if (messageFwdHeader != null) {
                                                                                                                    TLRPC.Peer peer = messageFwdHeader.from_id;
                                                                                                                    if (peer instanceof TLRPC.TL_peerChannel) {
                                                                                                                        isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(peer.channel_id, this.F0);
                                                                                                                        charSequence14 = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                                                                                                                    }
                                                                                                                }
                                                                                                                isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.g2);
                                                                                                                charSequence14 = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                                                                                                charSequence14 = LocaleController.getString(R.string.BoostingGiveawayResults);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                                                                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                                                                                                                if (tL_textWithEntities2 == null || tL_textWithEntities2.entities == null) {
                                                                                                                    z19 = false;
                                                                                                                    spannableStringBuilder = mh.a.a(R.drawable.dialog_media_poll_20, tL_textWithEntities2.text, false);
                                                                                                                } else {
                                                                                                                    SpannableString spannableString2 = new SpannableString(tL_messageMediaPoll.poll.question.text);
                                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaPoll.poll.question;
                                                                                                                    MediaDataController.addTextStyleRuns(tL_textWithEntities3.entities, tL_textWithEntities3.text, spannableString2);
                                                                                                                    MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString2, org.telegram.ui.ActionBar.i6.F0[this.E0].getFontMetricsInt());
                                                                                                                    z19 = false;
                                                                                                                    spannableStringBuilder = mh.a.a(R.drawable.dialog_media_poll_20, spannableString2, false);
                                                                                                                }
                                                                                                                charSequence14 = spannableStringBuilder;
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                                                                                                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia2;
                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                                                                                                                if (tL_textWithEntities4 == null || tL_textWithEntities4.entities == null) {
                                                                                                                    charSequence14 = mh.a.a(R.drawable.dialog_media_checklist_20, tL_textWithEntities4.text, false);
                                                                                                                } else {
                                                                                                                    SpannableString spannableString3 = new SpannableString(tL_messageMediaToDo.todo.title.text);
                                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_messageMediaToDo.todo.title;
                                                                                                                    MediaDataController.addTextStyleRuns(tL_textWithEntities5.entities, tL_textWithEntities5.text, spannableString3);
                                                                                                                    MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString3, org.telegram.ui.ActionBar.i6.F0[this.E0].getFontMetricsInt());
                                                                                                                    charSequence14 = mh.a.a(R.drawable.dialog_media_checklist_20, spannableString3, false);
                                                                                                                }
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                                                                                charSequence14 = mh.a.a(R.drawable.dialog_media_game_20, messageMedia2.game.title, false);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice) {
                                                                                                                charSequence14 = messageMedia2.title;
                                                                                                            } else if (messageObject16.type == 14) {
                                                                                                                charSequence14 = com.google.android.gms.internal.vision.e2.j("🎧 ", messageObject16.getMusicAuthor(), " - ", this.f1.getMusicTitle());
                                                                                                            } else if (!(messageMedia2 instanceof TLRPC.TL_messageMediaStory) || !messageMedia2.via_mention) {
                                                                                                                if (!messageObject16.hasHighlightedWords() || TextUtils.isEmpty(this.f1.messageOwner.message)) {
                                                                                                                    SpannableString spannableString4 = new SpannableString(charSequence33);
                                                                                                                    MessageObject messageObject17 = this.f1;
                                                                                                                    if (messageObject17 != null) {
                                                                                                                        messageObject17.spoilLoginCode();
                                                                                                                    }
                                                                                                                    MediaDataController.addTextStyleRuns(this.f1, spannableString4, 264);
                                                                                                                    MessageObject messageObject18 = this.f1;
                                                                                                                    charSequence13 = spannableString4;
                                                                                                                    if (messageObject18 != null) {
                                                                                                                        TLRPC.Message message4 = messageObject18.messageOwner;
                                                                                                                        charSequence13 = spannableString4;
                                                                                                                        if (message4 != null) {
                                                                                                                            ArrayList<TLRPC.MessageEntity> arrayList5 = message4.entities;
                                                                                                                            TextPaint textPaint4 = this.a0;
                                                                                                                            MediaDataController.addAnimatedEmojiSpans(arrayList5, spannableString4, textPaint4 == null ? null : textPaint4.getFontMetricsInt());
                                                                                                                            charSequence13 = spannableString4;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    CharSequence charSequence37 = this.f1.messageTrimmedToHighlight;
                                                                                                                    int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.I + 23);
                                                                                                                    MessageObject messageObject19 = this.f1;
                                                                                                                    charSequence13 = charSequence37;
                                                                                                                    if (messageObject19.messageTrimmedToHighlightCut) {
                                                                                                                        charSequence13 = AndroidUtilities.ellipsizeCenterEnd(charSequence37, messageObject19.highlightedWords.get(0), measuredWidth, this.a0, 130);
                                                                                                                    }
                                                                                                                }
                                                                                                                AndroidUtilities.highlightText(charSequence13, this.f1.highlightedWords, this.J4);
                                                                                                                charSequence14 = charSequence13;
                                                                                                            } else if (messageObject16.isOut()) {
                                                                                                                TLRPC.User user7 = MessagesController.getInstance(this.F0).getUser(Long.valueOf(this.f1.getDialogId()));
                                                                                                                if (user7 != null) {
                                                                                                                    str2 = UserObject.getFirstName(user7);
                                                                                                                    int indexOf3 = str2.indexOf(32);
                                                                                                                    c11 = 0;
                                                                                                                    if (indexOf3 >= 0) {
                                                                                                                        str2 = str2.substring(0, indexOf3);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    c11 = 0;
                                                                                                                    str2 = "";
                                                                                                                }
                                                                                                                int i41 = R.string.StoryYouMentionInDialog;
                                                                                                                Object[] objArr2 = new Object[1];
                                                                                                                objArr2[c11] = str2;
                                                                                                                charSequence14 = LocaleController.formatString(i41, objArr2);
                                                                                                            } else {
                                                                                                                charSequence14 = LocaleController.getString(R.string.StoryMentionInDialog);
                                                                                                            }
                                                                                                            CharSequence charSequence38 = charSequence14;
                                                                                                            MessageObject messageObject20 = this.f1;
                                                                                                            if (messageObject20.messageOwner.media == null || messageObject20.isMediaEmpty()) {
                                                                                                                TL_iv.RichMessage richMessage2 = this.f1.messageOwner.rich_message;
                                                                                                                charSequence34 = charSequence38;
                                                                                                                if (richMessage2 != null) {
                                                                                                                    charSequence34 = charSequence38;
                                                                                                                    if (richMessage2.blocks.size() == 1) {
                                                                                                                        charSequence34 = charSequence38;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            this.a0 = org.telegram.ui.ActionBar.i6.H0[this.E0];
                                                                                                            charSequence34 = charSequence38;
                                                                                                        }
                                                                                                    } else {
                                                                                                        MessageObject captionMessage = getCaptionMessage();
                                                                                                        if (!this.V) {
                                                                                                            str16 = "";
                                                                                                        } else if (captionMessage.isVideo()) {
                                                                                                            str16 = "📹 ";
                                                                                                        } else if (captionMessage.isVoice()) {
                                                                                                            str16 = "🎤 ";
                                                                                                        } else if (!captionMessage.isMusic()) {
                                                                                                            str16 = captionMessage.isPhoto() ? "🖼 " : "📎 ";
                                                                                                        }
                                                                                                        if (!captionMessage.hasHighlightedWords() || TextUtils.isEmpty(captionMessage.messageOwner.message)) {
                                                                                                            SpannableString spannableString5 = new SpannableString(captionMessage.caption);
                                                                                                            if (captionMessage.messageOwner != null) {
                                                                                                                captionMessage.spoilLoginCode();
                                                                                                                MediaDataController.addTextStyleRuns(captionMessage.messageOwner.entities, captionMessage.caption, spannableString5, 264);
                                                                                                                ArrayList<TLRPC.MessageEntity> arrayList6 = captionMessage.messageOwner.entities;
                                                                                                                TextPaint textPaint5 = this.a0;
                                                                                                                MediaDataController.addAnimatedEmojiSpans(arrayList6, spannableString5, textPaint5 == null ? null : textPaint5.getFontMetricsInt());
                                                                                                            }
                                                                                                            charSequence34 = new SpannableStringBuilder(str16).append((CharSequence) spannableString5);
                                                                                                        } else {
                                                                                                            CharSequence charSequence39 = captionMessage.messageTrimmedToHighlight;
                                                                                                            int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(this.I + 47);
                                                                                                            if (this.W) {
                                                                                                                if (!TextUtils.isEmpty(null)) {
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                measuredWidth2 = (int) (measuredWidth2 - this.a0.measureText(": "));
                                                                                                            }
                                                                                                            if (measuredWidth2 > 0 && captionMessage.messageTrimmedToHighlightCut) {
                                                                                                                charSequence39 = AndroidUtilities.ellipsizeCenterEnd(charSequence39, captionMessage.highlightedWords.get(0), measuredWidth2, this.a0, 130);
                                                                                                            }
                                                                                                            charSequence34 = new SpannableStringBuilder(str16).append(charSequence39);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        CharSequence charSequence40 = charSequence34;
                                                                                        if (this.f1.isReplyToStory()) {
                                                                                            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(charSequence34);
                                                                                            spannableStringBuilder7.insert(0, (CharSequence) "d ");
                                                                                            spannableStringBuilder7.setSpan(new er(f0.c.c(getContext(), R.drawable.msg_mini_replystory).mutate()), 0, 1, 0);
                                                                                            charSequence40 = spannableStringBuilder7;
                                                                                        }
                                                                                        if (this.R1 > 0) {
                                                                                            if (!this.f1.hasHighlightedWords() || TextUtils.isEmpty(this.f1.messageOwner.message)) {
                                                                                                int length4 = charSequence40.length();
                                                                                                CharSequence charSequence41 = charSequence40;
                                                                                                if (length4 > 150) {
                                                                                                    charSequence41 = charSequence40.subSequence(0, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                                                                                                }
                                                                                                replaceNewLines = AndroidUtilities.replaceNewLines(charSequence41);
                                                                                            } else {
                                                                                                replaceNewLines = this.f1.messageTrimmedToHighlight;
                                                                                                int measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp((((this.L4 + 2) * this.R1) + (this.I + 23)) + 3);
                                                                                                MessageObject messageObject21 = this.f1;
                                                                                                if (messageObject21.messageTrimmedToHighlightCut) {
                                                                                                    replaceNewLines = AndroidUtilities.ellipsizeCenterEnd(replaceNewLines, messageObject21.highlightedWords.get(0), measuredWidth3, this.a0, 130);
                                                                                                }
                                                                                            }
                                                                                            CharSequence spannableStringBuilder8 = !(replaceNewLines instanceof SpannableStringBuilder) ? new SpannableStringBuilder(replaceNewLines) : replaceNewLines;
                                                                                            SpannableStringBuilder spannableStringBuilder9 = (SpannableStringBuilder) spannableStringBuilder8;
                                                                                            charSequence4 = charSequence9;
                                                                                            spannableStringBuilder9.insert(0, charSequence4);
                                                                                            spannableStringBuilder9.setSpan(new q2(AndroidUtilities.dp(((this.L4 + 2) * this.R1) + 3)), 0, 1, 33);
                                                                                            Emoji.replaceEmoji(spannableStringBuilder9, org.telegram.ui.ActionBar.i6.F0[this.E0].getFontMetricsInt(), false);
                                                                                            CharSequence charSequence42 = spannableStringBuilder8;
                                                                                            if (this.f1.hasHighlightedWords()) {
                                                                                                CharSequence highlightText4 = AndroidUtilities.highlightText(spannableStringBuilder9, this.f1.highlightedWords, this.J4);
                                                                                                charSequence42 = spannableStringBuilder8;
                                                                                                if (highlightText4 != null) {
                                                                                                    charSequence42 = highlightText4;
                                                                                                }
                                                                                            }
                                                                                            z15 = false;
                                                                                            charSequence11 = charSequence42;
                                                                                        } else {
                                                                                            charSequence4 = charSequence9;
                                                                                            charSequence11 = charSequence40;
                                                                                        }
                                                                                        if (this.f1.isForwarded() && this.f1.needDrawForwarded()) {
                                                                                            this.x0 = true;
                                                                                            SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder(charSequence11);
                                                                                            spannableStringBuilder10.insert(0, (CharSequence) "d ");
                                                                                            er erVar2 = new er(f0.c.c(getContext(), R.drawable.mini_forwarded).mutate());
                                                                                            erVar2.setAlpha(0.9f);
                                                                                            spannableStringBuilder10.setSpan(erVar2, 0, 1, 0);
                                                                                            charSequence12 = spannableStringBuilder10;
                                                                                        } else {
                                                                                            charSequence12 = charSequence11;
                                                                                        }
                                                                                        z27 = z14;
                                                                                        charSequence18 = charSequence12;
                                                                                        str3 = null;
                                                                                        charSequence15 = charSequence18;
                                                                                        if (this.K0 == 0) {
                                                                                            str6 = H();
                                                                                        } else if (this.J0 != 0) {
                                                                                            str6 = G();
                                                                                        } else {
                                                                                            z26 = z15;
                                                                                            replaceEmoji = charSequence15;
                                                                                            charSequence8 = charSequence10;
                                                                                            string = str3;
                                                                                        }
                                                                                        z26 = z15;
                                                                                        replaceEmoji = charSequence15;
                                                                                        string = str6;
                                                                                        charSequence8 = charSequence10;
                                                                                    }
                                                                                }
                                                                                charSequence4 = charSequence9;
                                                                                if (escape2 == null) {
                                                                                    escape2 = getMessageNameString();
                                                                                }
                                                                                String escape3 = AndroidUtilities.escape(escape2);
                                                                                TLRPC.Chat chat11 = this.g2;
                                                                                if (chat11 != null && chat11.forum && !this.P && !this.O) {
                                                                                    CharSequence topicIconName = MessagesController.getInstance(this.F0).getTopicsController().getTopicIconName(this.g2, this.f1, this.a0);
                                                                                    if (!TextUtils.isEmpty(topicIconName)) {
                                                                                        SpannableStringBuilder spannableStringBuilder11 = new SpannableStringBuilder("-");
                                                                                        er erVar3 = new er(f0.c.c(ApplicationLoader.applicationContext, R.drawable.msg_mini_forumarrow).mutate());
                                                                                        erVar3.setColorKey((this.r2 || SharedConfig.useThreeLinesLayout) ? -1 : org.telegram.ui.ActionBar.i6.k9);
                                                                                        spannableStringBuilder11.setSpan(erVar3, 0, 1, 0);
                                                                                        ?? spannableStringBuilder12 = new SpannableStringBuilder();
                                                                                        spannableStringBuilder12.append(escape3).append((CharSequence) spannableStringBuilder11).append(topicIconName);
                                                                                        str3 = spannableStringBuilder12;
                                                                                        SpannableStringBuilder L2 = L(i30, str3, restrictionReason, false);
                                                                                        if (!this.O || ((this.r2 || SharedConfig.useThreeLinesLayout) && (this.J0 == 0 || L2.length() <= 0))) {
                                                                                            i15 = 0;
                                                                                        } else {
                                                                                            try {
                                                                                                u10Var = new u10(org.telegram.ui.ActionBar.i6.k9, this.J4);
                                                                                                i15 = str3.length() + 1;
                                                                                            } catch (Exception e7) {
                                                                                                e = e7;
                                                                                                i15 = 0;
                                                                                            }
                                                                                            try {
                                                                                                L2.setSpan(u10Var, 0, i15, 33);
                                                                                            } catch (Exception e10) {
                                                                                                e = e10;
                                                                                                FileLog.e(e);
                                                                                                replaceEmoji2 = Emoji.replaceEmoji(L2, org.telegram.ui.ActionBar.i6.F0[this.E0].getFontMetricsInt(), false);
                                                                                                if (this.f1.hasHighlightedWords()) {
                                                                                                }
                                                                                                if (this.R1 > 0) {
                                                                                                }
                                                                                                charSequence15 = replaceEmoji2;
                                                                                                z27 = z14;
                                                                                                z15 = false;
                                                                                                if (this.K0 == 0) {
                                                                                                }
                                                                                                z26 = z15;
                                                                                                replaceEmoji = charSequence15;
                                                                                                string = str6;
                                                                                                charSequence8 = charSequence10;
                                                                                                charSequence7 = null;
                                                                                                charSequence21 = charSequence8;
                                                                                                if (!this.x0) {
                                                                                                }
                                                                                                if (TextUtils.isEmpty(this.I0)) {
                                                                                                }
                                                                                                stringForMessageListDate = "";
                                                                                                messageObject4 = this.f1;
                                                                                                if (messageObject4 != null) {
                                                                                                }
                                                                                                this.Q2 = false;
                                                                                                this.R2 = false;
                                                                                                this.S2 = messageObject4 == null && messageObject4.isSending() && this.H0 == UserConfig.getInstance(this.F0).getClientUserId();
                                                                                                z20 = false;
                                                                                                this.G3 = false;
                                                                                                this.b4 = false;
                                                                                                this.c4 = false;
                                                                                                this.d4 = false;
                                                                                                this.t3 = false;
                                                                                                str7 = null;
                                                                                                str8 = null;
                                                                                                this.P2 = z20;
                                                                                                messagesController = MessagesController.getInstance(this.F0);
                                                                                                if (this.j1 == 0) {
                                                                                                }
                                                                                                charSequence22 = this.L0;
                                                                                                if (charSequence22 == null) {
                                                                                                }
                                                                                                charSequence23 = charSequence21;
                                                                                                str9 = str8;
                                                                                                z10 = z16;
                                                                                                str10 = stringForMessageListDate;
                                                                                                z21 = z26;
                                                                                                charSequence24 = charSequence7;
                                                                                                charSequence25 = string;
                                                                                                if (z10) {
                                                                                                }
                                                                                                if (F()) {
                                                                                                }
                                                                                                if (LocaleController.isRTL) {
                                                                                                }
                                                                                                if (this.G2) {
                                                                                                }
                                                                                                if (!this.S2) {
                                                                                                }
                                                                                                if (this.Z0) {
                                                                                                }
                                                                                                if (!this.l4) {
                                                                                                }
                                                                                                if (!z24) {
                                                                                                }
                                                                                                if (this.k4) {
                                                                                                }
                                                                                                dp7 = this.y2 - AndroidUtilities.dp(12.0f);
                                                                                                if (dp7 < 0) {
                                                                                                }
                                                                                                if (charSequence22 instanceof String) {
                                                                                                }
                                                                                                if (this.D2) {
                                                                                                }
                                                                                                float f18 = dp7;
                                                                                                this.R = org.telegram.ui.ActionBar.i6.B0[this.E0].measureText(charSequence22.toString()) <= f18;
                                                                                                if (!this.Q) {
                                                                                                }
                                                                                                CharSequence replaceEmoji3 = Emoji.replaceEmoji(charSequence22, org.telegram.ui.ActionBar.i6.B0[this.E0].getFontMetricsInt(), false);
                                                                                                MessageObject messageObject22 = this.f1;
                                                                                                if (messageObject22 == null) {
                                                                                                }
                                                                                                if (this.Q) {
                                                                                                }
                                                                                                this.B2 = (this.D2 || !this.z2.isRtlCharAt(0)) ? f12 : -AndroidUtilities.dp(f13);
                                                                                                this.C2 = this.z2.isRtlCharAt(0);
                                                                                                this.p3 = org.telegram.ui.Components.b6.update(0, (View) this, this.p3, this.z2);
                                                                                                if (this.r2) {
                                                                                                }
                                                                                                f15 = 39.0f;
                                                                                                f16 = f11;
                                                                                                f17 = 30.0f;
                                                                                                dp = AndroidUtilities.dp(11.0f);
                                                                                                this.q3 = AndroidUtilities.dp(32.0f);
                                                                                                this.M2 = AndroidUtilities.dp(13.0f);
                                                                                                this.u3 = AndroidUtilities.dp(42.33f);
                                                                                                this.C3 = AndroidUtilities.dp(43.0f);
                                                                                                this.M3 = AndroidUtilities.dp(42.33f);
                                                                                                this.W2 = AndroidUtilities.dp(13.0f);
                                                                                                int measuredWidth4 = getMeasuredWidth() - AndroidUtilities.dp(this.I + 21);
                                                                                                if (LocaleController.isRTL) {
                                                                                                }
                                                                                                i20 = dp3;
                                                                                                this.u0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
                                                                                                i21 = 0;
                                                                                                while (true) {
                                                                                                    imageReceiverArr = this.V1;
                                                                                                    if (i21 < imageReceiverArr.length) {
                                                                                                    }
                                                                                                    imageReceiverArr[i21].setImageCoords(((this.L4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.Q ? AndroidUtilities.dp(20.0f) : 0)) - ((this.r2 || SharedConfig.useThreeLinesLayout || (xsVar = this.t0) == null || xsVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                                                                                                    i21++;
                                                                                                    dp = dp;
                                                                                                }
                                                                                                i22 = dp;
                                                                                                i23 = measuredWidth4;
                                                                                                if (LocaleController.isRTL) {
                                                                                                }
                                                                                                if (this.Q) {
                                                                                                }
                                                                                                if (!this.r2) {
                                                                                                }
                                                                                                this.M2 -= AndroidUtilities.dp(6.0f);
                                                                                                this.W2 -= AndroidUtilities.dp(6.0f);
                                                                                                if (getIsPinned()) {
                                                                                                }
                                                                                                if (this.t3) {
                                                                                                }
                                                                                                if (this.t3) {
                                                                                                }
                                                                                                this.H3 = z25;
                                                                                                if (z25) {
                                                                                                }
                                                                                                if (z21) {
                                                                                                }
                                                                                                max = Math.max(AndroidUtilities.dp(12.0f), i23);
                                                                                                this.g3 = AndroidUtilities.dp((!this.r2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                                                                                                if (!this.r2) {
                                                                                                }
                                                                                                this.g3 -= AndroidUtilities.dp(!Q() ? 10.0f : 12.0f);
                                                                                                if (!Q()) {
                                                                                                }
                                                                                                if (this.Q) {
                                                                                                }
                                                                                                this.n3 = org.telegram.ui.Components.b6.update(0, (View) this, this.n3, this.s3);
                                                                                                if (TextUtils.isEmpty(charSequence24)) {
                                                                                                }
                                                                                                this.o3 = org.telegram.ui.Components.b6.update(0, (View) this, this.o3, this.h3);
                                                                                                if (!TextUtils.isEmpty(charSequence23)) {
                                                                                                }
                                                                                                if (replaceEmoji instanceof Spannable) {
                                                                                                }
                                                                                                if (this.r2) {
                                                                                                }
                                                                                                this.a0 = org.telegram.ui.ActionBar.i6.F0[this.E0];
                                                                                                charSequence27 = charSequence25;
                                                                                                charSequence28 = null;
                                                                                                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                                                                                                if (this.r2) {
                                                                                                }
                                                                                                if (this.R1 > 0) {
                                                                                                }
                                                                                                i26 = max;
                                                                                                try {
                                                                                                    TextPaint textPaint6 = this.a0;
                                                                                                    float dp9 = AndroidUtilities.dp(1.0f);
                                                                                                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                                                                                    this.e3 = mx0.b(charSequence27, textPaint6, i26, dp9, i26, charSequence28 != null ? 1 : 2);
                                                                                                    max = i26;
                                                                                                    this.i3.addAll(this.j3);
                                                                                                    this.j3.clear();
                                                                                                    vh.g.b(this, this.e3, -2, -2, this.i3, this.j3);
                                                                                                } catch (Exception e11) {
                                                                                                    e = e11;
                                                                                                    max = i26;
                                                                                                    this.e3 = null;
                                                                                                    FileLog.e(e);
                                                                                                    int i42 = max;
                                                                                                    this.m3 = org.telegram.ui.Components.b6.update(0, (View) this, this.m3, this.e3);
                                                                                                    if (LocaleController.isRTL) {
                                                                                                    }
                                                                                                    staticLayout = this.f3;
                                                                                                    if (staticLayout != null) {
                                                                                                    }
                                                                                                    e0();
                                                                                                }
                                                                                                int i422 = max;
                                                                                                this.m3 = org.telegram.ui.Components.b6.update(0, (View) this, this.m3, this.e3);
                                                                                                if (LocaleController.isRTL) {
                                                                                                }
                                                                                                staticLayout = this.f3;
                                                                                                if (staticLayout != null) {
                                                                                                }
                                                                                                e0();
                                                                                            }
                                                                                        }
                                                                                        replaceEmoji2 = Emoji.replaceEmoji(L2, org.telegram.ui.ActionBar.i6.F0[this.E0].getFontMetricsInt(), false);
                                                                                        if (this.f1.hasHighlightedWords() && (highlightText = AndroidUtilities.highlightText(replaceEmoji2, this.f1.highlightedWords, this.J4)) != null) {
                                                                                            replaceEmoji2 = highlightText;
                                                                                        }
                                                                                        if (this.R1 > 0) {
                                                                                            if (!(replaceEmoji2 instanceof SpannableStringBuilder)) {
                                                                                                replaceEmoji2 = new SpannableStringBuilder(replaceEmoji2);
                                                                                            }
                                                                                            SpannableStringBuilder spannableStringBuilder13 = (SpannableStringBuilder) replaceEmoji2;
                                                                                            if (i15 >= spannableStringBuilder13.length()) {
                                                                                                spannableStringBuilder13.append(charSequence4);
                                                                                                spannableStringBuilder13.setSpan(new q2(AndroidUtilities.dp(((this.L4 + 2) * this.R1) + 3)), spannableStringBuilder13.length() - 1, spannableStringBuilder13.length(), 33);
                                                                                            } else {
                                                                                                spannableStringBuilder13.insert(i15, charSequence4);
                                                                                                spannableStringBuilder13.setSpan(new q2(AndroidUtilities.dp(((this.L4 + 2) * this.R1) + 3)), i15, i15 + 1, 33);
                                                                                            }
                                                                                        }
                                                                                        charSequence15 = replaceEmoji2;
                                                                                        z27 = z14;
                                                                                        z15 = false;
                                                                                        if (this.K0 == 0) {
                                                                                        }
                                                                                        z26 = z15;
                                                                                        replaceEmoji = charSequence15;
                                                                                        string = str6;
                                                                                        charSequence8 = charSequence10;
                                                                                    }
                                                                                }
                                                                                str3 = escape3;
                                                                                SpannableStringBuilder L22 = L(i30, str3, restrictionReason, false);
                                                                                if (this.O) {
                                                                                }
                                                                                i15 = 0;
                                                                                replaceEmoji2 = Emoji.replaceEmoji(L22, org.telegram.ui.ActionBar.i6.F0[this.E0].getFontMetricsInt(), false);
                                                                                if (this.f1.hasHighlightedWords()) {
                                                                                    replaceEmoji2 = highlightText;
                                                                                }
                                                                                if (this.R1 > 0) {
                                                                                }
                                                                                charSequence15 = replaceEmoji2;
                                                                                z27 = z14;
                                                                                z15 = false;
                                                                                if (this.K0 == 0) {
                                                                                }
                                                                                z26 = z15;
                                                                                replaceEmoji = charSequence15;
                                                                                string = str6;
                                                                                charSequence8 = charSequence10;
                                                                            } else {
                                                                                MessageObject messageObject23 = this.f1;
                                                                                TLRPC.MessageAction messageAction = messageObject23.messageOwner.action;
                                                                                if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                                                                                    TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall = (TLRPC.TL_messageActionPhoneCall) messageAction;
                                                                                    charSequence16 = messageObject23.isOutOwner() ? mh.a.a(tL_messageActionPhoneCall.video ? R.drawable.dialog_media_outgoing_video_call_20 : R.drawable.dialog_media_outgoing_call_20, charSequence2, false) : mh.a.a(tL_messageActionPhoneCall.video ? R.drawable.dialog_media_incoming_video_call_20 : R.drawable.dialog_media_incoming_call_20, charSequence2, false);
                                                                                } else {
                                                                                    CharSequence charSequence43 = charSequence2;
                                                                                    if (ChatObject.isChannelAndNotMegaGroup(this.g2) && (this.f1.messageOwner.action instanceof TLRPC.TL_messageActionChannelMigrateFrom)) {
                                                                                        charSequence16 = "";
                                                                                        z27 = false;
                                                                                        this.a0 = org.telegram.ui.ActionBar.i6.H0[this.E0];
                                                                                        if (this.f1.type != 21) {
                                                                                            c0();
                                                                                            charSequence17 = t(charSequence16);
                                                                                        } else {
                                                                                            charSequence17 = charSequence16;
                                                                                        }
                                                                                    } else {
                                                                                        CharSequence charSequence44 = this.f1.messageTextShort;
                                                                                        charSequence16 = charSequence44 != null ? charSequence44 : charSequence43;
                                                                                    }
                                                                                }
                                                                                z27 = z14;
                                                                                this.a0 = org.telegram.ui.ActionBar.i6.H0[this.E0];
                                                                                if (this.f1.type != 21) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            G = G();
                                                                        }
                                                                        charSequence18 = G;
                                                                        z27 = z14;
                                                                        charSequence4 = charSequence9;
                                                                        z15 = false;
                                                                        str3 = null;
                                                                        charSequence15 = charSequence18;
                                                                        if (this.K0 == 0) {
                                                                        }
                                                                        z26 = z15;
                                                                        replaceEmoji = charSequence15;
                                                                        string = str6;
                                                                        charSequence8 = charSequence10;
                                                                    }
                                                                    charSequence4 = charSequence9;
                                                                    z27 = false;
                                                                    str3 = null;
                                                                    z16 = false;
                                                                    charSequence15 = str4;
                                                                    if (this.K0 == 0) {
                                                                    }
                                                                    z26 = z15;
                                                                    replaceEmoji = charSequence15;
                                                                    string = str6;
                                                                    charSequence8 = charSequence10;
                                                                } else {
                                                                    charSequence17 = str;
                                                                    z27 = z14;
                                                                }
                                                                charSequence4 = charSequence9;
                                                                charSequence18 = charSequence17;
                                                                str3 = null;
                                                                charSequence15 = charSequence18;
                                                                if (this.K0 == 0) {
                                                                }
                                                                z26 = z15;
                                                                replaceEmoji = charSequence15;
                                                                string = str6;
                                                                charSequence8 = charSequence10;
                                                            }
                                                        }
                                                    }
                                                    charSequence10 = charSequence3;
                                                    z16 = z10;
                                                } else {
                                                    z16 = z10;
                                                    charSequence9 = " ";
                                                    charSequence10 = charSequence3;
                                                }
                                                str = "";
                                                z18 = false;
                                                if (z18) {
                                                }
                                                charSequence4 = charSequence9;
                                                charSequence18 = charSequence17;
                                                str3 = null;
                                                charSequence15 = charSequence18;
                                                if (this.K0 == 0) {
                                                }
                                                z26 = z15;
                                                replaceEmoji = charSequence15;
                                                string = str6;
                                                charSequence8 = charSequence10;
                                            } else if (this.K0 != 0) {
                                                formatString = H();
                                            } else if (this.J0 != 0) {
                                                formatString = G();
                                            } else {
                                                TLRPC.EncryptedChat encryptedChat = this.h2;
                                                if (encryptedChat != null) {
                                                    this.a0 = org.telegram.ui.ActionBar.i6.H0[this.E0];
                                                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                                                        formatString = LocaleController.getString(R.string.EncryptionProcessing);
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                                                        formatString = LocaleController.formatString(R.string.AwaitingEncryption, UserObject.getFirstName(this.f2));
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                                                        formatString = LocaleController.getString(R.string.EncryptionRejected);
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                                                        formatString = encryptedChat.admin_id == UserConfig.getInstance(this.F0).getClientUserId() ? LocaleController.formatString(R.string.EncryptedChatStartedOutgoing, UserObject.getFirstName(this.f2)) : LocaleController.getString(R.string.EncryptedChatStartedIncoming);
                                                    }
                                                } else if (this.j1 == 3 && UserObject.isUserSelf(this.f2)) {
                                                    ty tyVar2 = this.D4;
                                                    z26 = z15;
                                                    z27 = false;
                                                    z16 = false;
                                                    replaceEmoji = LocaleController.getString((tyVar2 == null || !tyVar2.O0) ? R.string.SavedMessagesInfo : R.string.SavedMessagesInfoQuote);
                                                    charSequence4 = " ";
                                                    string = null;
                                                    charSequence8 = charSequence3;
                                                }
                                                z26 = z15;
                                                z16 = z10;
                                                charSequence4 = " ";
                                                replaceEmoji = "";
                                                z27 = z14;
                                                string = null;
                                                charSequence8 = charSequence3;
                                            }
                                        }
                                        z26 = z15;
                                        z16 = z10;
                                        replaceEmoji = formatString;
                                        charSequence4 = " ";
                                        z27 = z14;
                                        string = null;
                                        charSequence8 = charSequence3;
                                    }
                                    charSequence7 = null;
                                    charSequence21 = charSequence8;
                                    if (!this.x0) {
                                        this.y0 = true;
                                        SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder(replaceEmoji);
                                        spannableStringBuilder42.insert(0, (CharSequence) "d ");
                                        er erVar4 = new er(f0.c.c(getContext(), R.drawable.mini_gift).mutate());
                                        erVar4.setScale(1.25f, 1.25f);
                                        erVar4.spaceScaleX = 0.9f;
                                        erVar4.setAlpha(0.9f);
                                        spannableStringBuilder42.setSpan(erVar4, 0, 1, 0);
                                        tL_textWithEntities = ((TLRPC.TL_messageActionStarGift) this.f1.messageOwner.action).message;
                                        if (tL_textWithEntities != null) {
                                            this.a0 = org.telegram.ui.ActionBar.i6.F0[this.E0];
                                        }
                                        replaceEmoji = spannableStringBuilder42;
                                    }
                                    if (TextUtils.isEmpty(this.I0)) {
                                    }
                                    stringForMessageListDate = "";
                                    messageObject4 = this.f1;
                                    if (messageObject4 != null) {
                                    }
                                    this.Q2 = false;
                                    this.R2 = false;
                                    this.S2 = messageObject4 == null && messageObject4.isSending() && this.H0 == UserConfig.getInstance(this.F0).getClientUserId();
                                    z20 = false;
                                    this.G3 = false;
                                    this.b4 = false;
                                    this.c4 = false;
                                    this.d4 = false;
                                    this.t3 = false;
                                    str7 = null;
                                    str8 = null;
                                    this.P2 = z20;
                                    messagesController = MessagesController.getInstance(this.F0);
                                    if (this.j1 == 0) {
                                    }
                                    charSequence22 = this.L0;
                                    if (charSequence22 == null) {
                                    }
                                    charSequence23 = charSequence21;
                                    str9 = str8;
                                    z10 = z16;
                                    str10 = stringForMessageListDate;
                                    z21 = z26;
                                    charSequence24 = charSequence7;
                                } else {
                                    this.l2 = null;
                                    this.k2 = false;
                                    charSequence19 = this.I0;
                                    this.a0 = org.telegram.ui.ActionBar.i6.F0[this.E0];
                                    z16 = z10;
                                    string = null;
                                    charSequence20 = null;
                                }
                            }
                            replaceEmoji = charSequence19;
                            charSequence4 = " ";
                            charSequence21 = "";
                            i13 = -1;
                            charSequence7 = charSequence20;
                            if (!this.x0) {
                            }
                            if (TextUtils.isEmpty(this.I0)) {
                            }
                            stringForMessageListDate = "";
                            messageObject4 = this.f1;
                            if (messageObject4 != null) {
                            }
                            this.Q2 = false;
                            this.R2 = false;
                            this.S2 = messageObject4 == null && messageObject4.isSending() && this.H0 == UserConfig.getInstance(this.F0).getClientUserId();
                            z20 = false;
                            this.G3 = false;
                            this.b4 = false;
                            this.c4 = false;
                            this.d4 = false;
                            this.t3 = false;
                            str7 = null;
                            str8 = null;
                            this.P2 = z20;
                            messagesController = MessagesController.getInstance(this.F0);
                            if (this.j1 == 0) {
                            }
                            charSequence22 = this.L0;
                            if (charSequence22 == null) {
                            }
                            charSequence23 = charSequence21;
                            str9 = str8;
                            z10 = z16;
                            str10 = stringForMessageListDate;
                            z21 = z26;
                            charSequence24 = charSequence7;
                        }
                    }
                    draftMessage = this.l2;
                    if (draftMessage != null) {
                        if (i12 > draftMessage.date) {
                        }
                    }
                }
                if (ChatObject.isChannel(this.g2)) {
                    TLRPC.Chat chat12 = this.g2;
                    if (!chat12.megagroup) {
                        if (!chat12.creator) {
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = chat12.admin_rights;
                            if (tL_chatAdminRights != null) {
                            }
                            this.l2 = null;
                            this.k2 = false;
                            if (Q()) {
                            }
                            replaceEmoji = charSequence19;
                            charSequence4 = " ";
                            charSequence21 = "";
                            i13 = -1;
                            charSequence7 = charSequence20;
                            if (!this.x0) {
                            }
                            if (TextUtils.isEmpty(this.I0)) {
                            }
                            stringForMessageListDate = "";
                            messageObject4 = this.f1;
                            if (messageObject4 != null) {
                            }
                            this.Q2 = false;
                            this.R2 = false;
                            this.S2 = messageObject4 == null && messageObject4.isSending() && this.H0 == UserConfig.getInstance(this.F0).getClientUserId();
                            z20 = false;
                            this.G3 = false;
                            this.b4 = false;
                            this.c4 = false;
                            this.d4 = false;
                            this.t3 = false;
                            str7 = null;
                            str8 = null;
                            this.P2 = z20;
                            messagesController = MessagesController.getInstance(this.F0);
                            if (this.j1 == 0) {
                            }
                            charSequence22 = this.L0;
                            if (charSequence22 == null) {
                            }
                            charSequence23 = charSequence21;
                            str9 = str8;
                            z10 = z16;
                            str10 = stringForMessageListDate;
                            z21 = z26;
                            charSequence24 = charSequence7;
                        }
                    }
                }
                chat2 = this.g2;
                if (chat2 != null) {
                    if (chat2.left) {
                    }
                    this.l2 = null;
                    this.k2 = false;
                    if (Q()) {
                    }
                    replaceEmoji = charSequence19;
                    charSequence4 = " ";
                    charSequence21 = "";
                    i13 = -1;
                    charSequence7 = charSequence20;
                    if (!this.x0) {
                    }
                    if (TextUtils.isEmpty(this.I0)) {
                    }
                    stringForMessageListDate = "";
                    messageObject4 = this.f1;
                    if (messageObject4 != null) {
                    }
                    this.Q2 = false;
                    this.R2 = false;
                    this.S2 = messageObject4 == null && messageObject4.isSending() && this.H0 == UserConfig.getInstance(this.F0).getClientUserId();
                    z20 = false;
                    this.G3 = false;
                    this.b4 = false;
                    this.c4 = false;
                    this.d4 = false;
                    this.t3 = false;
                    str7 = null;
                    str8 = null;
                    this.P2 = z20;
                    messagesController = MessagesController.getInstance(this.F0);
                    if (this.j1 == 0) {
                    }
                    charSequence22 = this.L0;
                    if (charSequence22 == null) {
                    }
                    charSequence23 = charSequence21;
                    str9 = str8;
                    z10 = z16;
                    str10 = stringForMessageListDate;
                    z21 = z26;
                    charSequence24 = charSequence7;
                }
                if (ChatObject.isForum(chat2)) {
                }
                if (Q()) {
                }
                replaceEmoji = charSequence19;
                charSequence4 = " ";
                charSequence21 = "";
                i13 = -1;
                charSequence7 = charSequence20;
                if (!this.x0) {
                }
                if (TextUtils.isEmpty(this.I0)) {
                }
                stringForMessageListDate = "";
                messageObject4 = this.f1;
                if (messageObject4 != null) {
                }
                this.Q2 = false;
                this.R2 = false;
                this.S2 = messageObject4 == null && messageObject4.isSending() && this.H0 == UserConfig.getInstance(this.F0).getClientUserId();
                z20 = false;
                this.G3 = false;
                this.b4 = false;
                this.c4 = false;
                this.d4 = false;
                this.t3 = false;
                str7 = null;
                str8 = null;
                this.P2 = z20;
                messagesController = MessagesController.getInstance(this.F0);
                if (this.j1 == 0) {
                }
                charSequence22 = this.L0;
                if (charSequence22 == null) {
                }
                charSequence23 = charSequence21;
                str9 = str8;
                z10 = z16;
                str10 = stringForMessageListDate;
                z21 = z26;
                charSequence24 = charSequence7;
            }
            i11 = i10;
            charSequence = charSequence30;
            i12 = this.R0;
            if (i12 == 0) {
                i12 = messageObject6.messageOwner.date;
            }
            if (!this.P) {
            }
            z13 = this.k2;
            if (!z13) {
            }
            if (!z13) {
                draftMessage3 = this.l2;
                if (draftMessage3.rich_message == null) {
                }
            }
            draftMessage = this.l2;
            if (draftMessage != null) {
            }
            if (ChatObject.isChannel(this.g2)) {
            }
            chat2 = this.g2;
            if (chat2 != null) {
            }
            if (ChatObject.isForum(chat2)) {
            }
            if (Q()) {
            }
            replaceEmoji = charSequence19;
            charSequence4 = " ";
            charSequence21 = "";
            i13 = -1;
            charSequence7 = charSequence20;
            if (!this.x0) {
            }
            if (TextUtils.isEmpty(this.I0)) {
            }
            stringForMessageListDate = "";
            messageObject4 = this.f1;
            if (messageObject4 != null) {
            }
            this.Q2 = false;
            this.R2 = false;
            this.S2 = messageObject4 == null && messageObject4.isSending() && this.H0 == UserConfig.getInstance(this.F0).getClientUserId();
            z20 = false;
            this.G3 = false;
            this.b4 = false;
            this.c4 = false;
            this.d4 = false;
            this.t3 = false;
            str7 = null;
            str8 = null;
            this.P2 = z20;
            messagesController = MessagesController.getInstance(this.F0);
            if (this.j1 == 0) {
            }
            charSequence22 = this.L0;
            if (charSequence22 == null) {
            }
            charSequence23 = charSequence21;
            str9 = str8;
            z10 = z16;
            str10 = stringForMessageListDate;
            z21 = z26;
            charSequence24 = charSequence7;
        }
        charSequence25 = string;
        if (z10) {
            f11 = 24.0f;
            f12 = 0.0f;
            this.N2 = null;
            this.L2 = 0;
            i18 = 0;
        } else {
            TextPaint timeTextPaint = getTimeTextPaint();
            f11 = 24.0f;
            f12 = 0.0f;
            int ceil = (int) Math.ceil(timeTextPaint.measureText(str10));
            this.N2 = new StaticLayout(str10, timeTextPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            i18 = AndroidUtilities.dp(getIsPinned() ? 24.0f : 0.0f) + ceil;
            if (LocaleController.isRTL) {
                this.L2 = AndroidUtilities.dp(15.0f);
            } else {
                this.L2 = org.telegram.messenger.q.B(15.0f, getMeasuredWidth(), i18);
            }
        }
        if (F()) {
            i19 = 0;
        } else {
            if (LocaleController.isRTL) {
                this.O2 = AndroidUtilities.dp(4.0f) + this.L2 + i18;
            } else {
                this.O2 = (this.L2 - org.telegram.ui.ActionBar.i6.b1.getIntrinsicWidth()) - AndroidUtilities.dp(4.0f);
            }
            i19 = org.telegram.ui.ActionBar.i6.b1.getIntrinsicWidth() + AndroidUtilities.dp(4.0f);
            i18 += i19;
        }
        if (LocaleController.isRTL) {
            this.y2 = org.telegram.messenger.q.B(22.0f, getMeasuredWidth() - this.x2, i18);
        } else {
            this.y2 = org.telegram.messenger.q.B(this.I + 13, getMeasuredWidth() - this.x2, i18);
            this.x2 += i18;
        }
        if (this.G2) {
            this.y2 -= org.telegram.ui.ActionBar.i6.a1.getIntrinsicWidth() + AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 4.0f);
        }
        if (!this.S2) {
            int dp10 = AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.i6.X0.getIntrinsicWidth();
            this.y2 -= dp10;
            if (LocaleController.isRTL) {
                this.V2 = AndroidUtilities.dp(5.0f) + this.L2 + i18;
                this.x2 += dp10;
            } else {
                this.V2 = (this.L2 - i19) - dp10;
            }
        } else if (this.R2) {
            int dp11 = AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.i6.T0.getIntrinsicWidth();
            int i43 = this.y2 - dp11;
            this.y2 = i43;
            if (this.Q2) {
                this.y2 = org.telegram.messenger.q.A(8.0f, org.telegram.ui.ActionBar.i6.W0.getIntrinsicWidth(), i43);
                if (LocaleController.isRTL) {
                    int dp12 = AndroidUtilities.dp(5.0f) + this.L2 + i18;
                    this.T2 = dp12;
                    this.X2 = AndroidUtilities.dp(5.5f) + dp12;
                    this.x2 = bi.D(8.0f, org.telegram.ui.ActionBar.i6.W0.getIntrinsicWidth() + dp11, this.x2);
                } else {
                    int i44 = (this.L2 - i19) - dp11;
                    this.X2 = i44;
                    this.T2 = i44 - AndroidUtilities.dp(5.5f);
                }
            } else if (LocaleController.isRTL) {
                this.U2 = AndroidUtilities.dp(5.0f) + this.L2 + i18;
                this.x2 += dp11;
            } else {
                this.U2 = (this.L2 - i19) - dp11;
            }
        }
        z24 = (!this.Z0 || this.Q0 || this.b1 || this.c1 > f12) && !this.j4 && this.p4 == 0;
        if (!this.l4 && this.n4.c() != null) {
            int dp13 = AndroidUtilities.dp(36.0f);
            if (z24) {
                dp13 += org.telegram.ui.ActionBar.i6.c1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
            }
            this.y2 -= dp13;
            if (LocaleController.isRTL) {
                this.x2 += dp13;
            }
        } else if (!z24) {
            int intrinsicWidth = org.telegram.ui.ActionBar.i6.c1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
            if (this.l4) {
                intrinsicWidth += AndroidUtilities.dp(36.0f);
            }
            this.y2 -= intrinsicWidth;
            if (LocaleController.isRTL) {
                this.x2 += intrinsicWidth;
            }
        } else if (this.j4) {
            int intrinsicWidth2 = org.telegram.ui.ActionBar.i6.f1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
            this.y2 -= intrinsicWidth2;
            if (LocaleController.isRTL) {
                this.x2 += intrinsicWidth2;
            }
        } else if (this.l4) {
            int dp14 = AndroidUtilities.dp(36.0f);
            this.y2 -= dp14;
            if (LocaleController.isRTL) {
                this.x2 += dp14;
            }
        } else if (this.p4 != 0) {
            int intrinsicWidth3 = (this.p4 == 1 ? org.telegram.ui.ActionBar.i6.g1 : org.telegram.ui.ActionBar.i6.h1).getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
            this.y2 -= intrinsicWidth3;
            if (LocaleController.isRTL) {
                this.x2 += intrinsicWidth3;
            }
        }
        if (this.k4) {
            this.y2 -= AndroidUtilities.dp(21.0f);
        }
        try {
            dp7 = this.y2 - AndroidUtilities.dp(12.0f);
            if (dp7 < 0) {
                dp7 = 0;
            }
            if (charSequence22 instanceof String) {
                charSequence22 = ((String) charSequence22).replace(c10, ' ');
            }
            if (this.D2) {
                f13 = 36.0f;
                f14 = 8.0f;
            } else {
                f13 = 36.0f;
                try {
                    f14 = 8.0f;
                } catch (Exception e12) {
                    e = e12;
                    f14 = 8.0f;
                    FileLog.e(e);
                    this.p3 = org.telegram.ui.Components.b6.update(0, (View) this, this.p3, this.z2);
                    if (this.r2) {
                    }
                    f15 = 39.0f;
                    f16 = f11;
                    f17 = 30.0f;
                    dp = AndroidUtilities.dp(11.0f);
                    this.q3 = AndroidUtilities.dp(32.0f);
                    this.M2 = AndroidUtilities.dp(13.0f);
                    this.u3 = AndroidUtilities.dp(42.33f);
                    this.C3 = AndroidUtilities.dp(43.0f);
                    this.M3 = AndroidUtilities.dp(42.33f);
                    this.W2 = AndroidUtilities.dp(13.0f);
                    int measuredWidth42 = getMeasuredWidth() - AndroidUtilities.dp(this.I + 21);
                    if (LocaleController.isRTL) {
                    }
                    i20 = dp3;
                    this.u0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
                    i21 = 0;
                    while (true) {
                        imageReceiverArr = this.V1;
                        if (i21 < imageReceiverArr.length) {
                        }
                        imageReceiverArr[i21].setImageCoords(((this.L4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.Q ? AndroidUtilities.dp(20.0f) : 0)) - ((this.r2 || SharedConfig.useThreeLinesLayout || (xsVar = this.t0) == null || xsVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                        i21++;
                        dp = dp;
                    }
                    i22 = dp;
                    i23 = measuredWidth42;
                    if (LocaleController.isRTL) {
                    }
                    if (this.Q) {
                    }
                    if (!this.r2) {
                        this.M2 -= AndroidUtilities.dp(6.0f);
                        this.W2 -= AndroidUtilities.dp(6.0f);
                        if (getIsPinned()) {
                        }
                        if (this.t3) {
                        }
                        if (this.t3) {
                        }
                        this.H3 = z25;
                        if (z25) {
                        }
                        if (z21) {
                        }
                        max = Math.max(AndroidUtilities.dp(12.0f), i23);
                        this.g3 = AndroidUtilities.dp((!this.r2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                        if (!this.r2) {
                            this.g3 -= AndroidUtilities.dp(!Q() ? 10.0f : 12.0f);
                            if (!Q()) {
                            }
                            if (this.Q) {
                            }
                            this.n3 = org.telegram.ui.Components.b6.update(0, (View) this, this.n3, this.s3);
                            if (TextUtils.isEmpty(charSequence24)) {
                            }
                            this.o3 = org.telegram.ui.Components.b6.update(0, (View) this, this.o3, this.h3);
                            if (!TextUtils.isEmpty(charSequence23)) {
                            }
                            if (replaceEmoji instanceof Spannable) {
                            }
                            if (this.r2) {
                            }
                            this.a0 = org.telegram.ui.ActionBar.i6.F0[this.E0];
                            charSequence27 = charSequence25;
                            charSequence28 = null;
                            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                            if (this.r2) {
                            }
                            if (this.R1 > 0) {
                            }
                            i26 = max;
                            TextPaint textPaint62 = this.a0;
                            float dp92 = AndroidUtilities.dp(1.0f);
                            TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                            this.e3 = mx0.b(charSequence27, textPaint62, i26, dp92, i26, charSequence28 != null ? 1 : 2);
                            max = i26;
                            this.i3.addAll(this.j3);
                            this.j3.clear();
                            vh.g.b(this, this.e3, -2, -2, this.i3, this.j3);
                            int i4222 = max;
                            this.m3 = org.telegram.ui.Components.b6.update(0, (View) this, this.m3, this.e3);
                            if (LocaleController.isRTL) {
                            }
                            staticLayout = this.f3;
                            if (staticLayout != null) {
                            }
                            e0();
                        }
                        this.g3 -= AndroidUtilities.dp(!Q() ? 10.0f : 12.0f);
                        if (!Q()) {
                        }
                        if (this.Q) {
                        }
                        this.n3 = org.telegram.ui.Components.b6.update(0, (View) this, this.n3, this.s3);
                        if (TextUtils.isEmpty(charSequence24)) {
                        }
                        this.o3 = org.telegram.ui.Components.b6.update(0, (View) this, this.o3, this.h3);
                        if (!TextUtils.isEmpty(charSequence23)) {
                        }
                        if (replaceEmoji instanceof Spannable) {
                        }
                        if (this.r2) {
                        }
                        this.a0 = org.telegram.ui.ActionBar.i6.F0[this.E0];
                        charSequence27 = charSequence25;
                        charSequence28 = null;
                        Layout.Alignment alignment22 = Layout.Alignment.ALIGN_NORMAL;
                        if (this.r2) {
                        }
                        if (this.R1 > 0) {
                        }
                        i26 = max;
                        TextPaint textPaint622 = this.a0;
                        float dp922 = AndroidUtilities.dp(1.0f);
                        TextUtils.TruncateAt truncateAt22 = TextUtils.TruncateAt.END;
                        this.e3 = mx0.b(charSequence27, textPaint622, i26, dp922, i26, charSequence28 != null ? 1 : 2);
                        max = i26;
                        this.i3.addAll(this.j3);
                        this.j3.clear();
                        vh.g.b(this, this.e3, -2, -2, this.i3, this.j3);
                        int i42222 = max;
                        this.m3 = org.telegram.ui.Components.b6.update(0, (View) this, this.m3, this.e3);
                        if (LocaleController.isRTL) {
                        }
                        staticLayout = this.f3;
                        if (staticLayout != null) {
                        }
                        e0();
                    }
                    this.M2 -= AndroidUtilities.dp(6.0f);
                    this.W2 -= AndroidUtilities.dp(6.0f);
                    if (getIsPinned()) {
                    }
                    if (this.t3) {
                    }
                    if (this.t3) {
                    }
                    this.H3 = z25;
                    if (z25) {
                    }
                    if (z21) {
                    }
                    max = Math.max(AndroidUtilities.dp(12.0f), i23);
                    this.g3 = AndroidUtilities.dp((!this.r2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                    if (!this.r2) {
                    }
                    this.g3 -= AndroidUtilities.dp(!Q() ? 10.0f : 12.0f);
                    if (!Q()) {
                    }
                    if (this.Q) {
                    }
                    this.n3 = org.telegram.ui.Components.b6.update(0, (View) this, this.n3, this.s3);
                    if (TextUtils.isEmpty(charSequence24)) {
                    }
                    this.o3 = org.telegram.ui.Components.b6.update(0, (View) this, this.o3, this.h3);
                    if (!TextUtils.isEmpty(charSequence23)) {
                    }
                    if (replaceEmoji instanceof Spannable) {
                    }
                    if (this.r2) {
                    }
                    this.a0 = org.telegram.ui.ActionBar.i6.F0[this.E0];
                    charSequence27 = charSequence25;
                    charSequence28 = null;
                    Layout.Alignment alignment222 = Layout.Alignment.ALIGN_NORMAL;
                    if (this.r2) {
                    }
                    if (this.R1 > 0) {
                    }
                    i26 = max;
                    TextPaint textPaint6222 = this.a0;
                    float dp9222 = AndroidUtilities.dp(1.0f);
                    TextUtils.TruncateAt truncateAt222 = TextUtils.TruncateAt.END;
                    this.e3 = mx0.b(charSequence27, textPaint6222, i26, dp9222, i26, charSequence28 != null ? 1 : 2);
                    max = i26;
                    this.i3.addAll(this.j3);
                    this.j3.clear();
                    vh.g.b(this, this.e3, -2, -2, this.i3, this.j3);
                    int i422222 = max;
                    this.m3 = org.telegram.ui.Components.b6.update(0, (View) this, this.m3, this.e3);
                    if (LocaleController.isRTL) {
                    }
                    staticLayout = this.f3;
                    if (staticLayout != null) {
                    }
                    e0();
                }
                try {
                    this.A2 = charSequence22.length() == TextUtils.ellipsize(charSequence22, org.telegram.ui.ActionBar.i6.B0[this.E0], (float) dp7, TextUtils.TruncateAt.END).length();
                    dp7 += AndroidUtilities.dp(48.0f);
                } catch (Exception e13) {
                    e = e13;
                    FileLog.e(e);
                    this.p3 = org.telegram.ui.Components.b6.update(0, (View) this, this.p3, this.z2);
                    if (this.r2) {
                    }
                    f15 = 39.0f;
                    f16 = f11;
                    f17 = 30.0f;
                    dp = AndroidUtilities.dp(11.0f);
                    this.q3 = AndroidUtilities.dp(32.0f);
                    this.M2 = AndroidUtilities.dp(13.0f);
                    this.u3 = AndroidUtilities.dp(42.33f);
                    this.C3 = AndroidUtilities.dp(43.0f);
                    this.M3 = AndroidUtilities.dp(42.33f);
                    this.W2 = AndroidUtilities.dp(13.0f);
                    int measuredWidth422 = getMeasuredWidth() - AndroidUtilities.dp(this.I + 21);
                    if (LocaleController.isRTL) {
                    }
                    i20 = dp3;
                    this.u0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
                    i21 = 0;
                    while (true) {
                        imageReceiverArr = this.V1;
                        if (i21 < imageReceiverArr.length) {
                        }
                        imageReceiverArr[i21].setImageCoords(((this.L4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.Q ? AndroidUtilities.dp(20.0f) : 0)) - ((this.r2 || SharedConfig.useThreeLinesLayout || (xsVar = this.t0) == null || xsVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                        i21++;
                        dp = dp;
                    }
                    i22 = dp;
                    i23 = measuredWidth422;
                    if (LocaleController.isRTL) {
                    }
                    if (this.Q) {
                    }
                    if (!this.r2) {
                    }
                    this.M2 -= AndroidUtilities.dp(6.0f);
                    this.W2 -= AndroidUtilities.dp(6.0f);
                    if (getIsPinned()) {
                    }
                    if (this.t3) {
                    }
                    if (this.t3) {
                    }
                    this.H3 = z25;
                    if (z25) {
                    }
                    if (z21) {
                    }
                    max = Math.max(AndroidUtilities.dp(12.0f), i23);
                    this.g3 = AndroidUtilities.dp((!this.r2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                    if (!this.r2) {
                    }
                    this.g3 -= AndroidUtilities.dp(!Q() ? 10.0f : 12.0f);
                    if (!Q()) {
                    }
                    if (this.Q) {
                    }
                    this.n3 = org.telegram.ui.Components.b6.update(0, (View) this, this.n3, this.s3);
                    if (TextUtils.isEmpty(charSequence24)) {
                    }
                    this.o3 = org.telegram.ui.Components.b6.update(0, (View) this, this.o3, this.h3);
                    if (!TextUtils.isEmpty(charSequence23)) {
                    }
                    if (replaceEmoji instanceof Spannable) {
                    }
                    if (this.r2) {
                    }
                    this.a0 = org.telegram.ui.ActionBar.i6.F0[this.E0];
                    charSequence27 = charSequence25;
                    charSequence28 = null;
                    Layout.Alignment alignment2222 = Layout.Alignment.ALIGN_NORMAL;
                    if (this.r2) {
                    }
                    if (this.R1 > 0) {
                    }
                    i26 = max;
                    TextPaint textPaint62222 = this.a0;
                    float dp92222 = AndroidUtilities.dp(1.0f);
                    TextUtils.TruncateAt truncateAt2222 = TextUtils.TruncateAt.END;
                    this.e3 = mx0.b(charSequence27, textPaint62222, i26, dp92222, i26, charSequence28 != null ? 1 : 2);
                    max = i26;
                    this.i3.addAll(this.j3);
                    this.j3.clear();
                    vh.g.b(this, this.e3, -2, -2, this.i3, this.j3);
                    int i4222222 = max;
                    this.m3 = org.telegram.ui.Components.b6.update(0, (View) this, this.m3, this.e3);
                    if (LocaleController.isRTL) {
                    }
                    staticLayout = this.f3;
                    if (staticLayout != null) {
                    }
                    e0();
                }
            }
            float f182 = dp7;
            this.R = org.telegram.ui.ActionBar.i6.B0[this.E0].measureText(charSequence22.toString()) <= f182;
            if (!this.Q) {
                charSequence22 = TextUtils.ellipsize(charSequence22, org.telegram.ui.ActionBar.i6.B0[this.E0], f182, TextUtils.TruncateAt.END);
            }
            CharSequence replaceEmoji32 = Emoji.replaceEmoji(charSequence22, org.telegram.ui.ActionBar.i6.B0[this.E0].getFontMetricsInt(), false);
            MessageObject messageObject222 = this.f1;
            CharSequence charSequence45 = (messageObject222 == null && messageObject222.hasHighlightedWords() && (highlightText3 = AndroidUtilities.highlightText(replaceEmoji32, this.f1.highlightedWords, this.J4)) != null) ? highlightText3 : replaceEmoji32;
            if (this.Q) {
                this.z2 = new StaticLayout(charSequence45, org.telegram.ui.ActionBar.i6.B0[this.E0], Math.max(dp7, this.y2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                TextPaint textPaint7 = org.telegram.ui.ActionBar.i6.B0[this.E0];
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                TextUtils.TruncateAt truncateAt3 = TextUtils.TruncateAt.END;
                this.z2 = mx0.b(charSequence45, textPaint7, dp7, 0.0f, dp7, 2);
            }
            this.B2 = (this.D2 || !this.z2.isRtlCharAt(0)) ? f12 : -AndroidUtilities.dp(f13);
            this.C2 = this.z2.isRtlCharAt(0);
        } catch (Exception e14) {
            e = e14;
            f13 = 36.0f;
        }
        this.p3 = org.telegram.ui.Components.b6.update(0, (View) this, this.p3, this.z2);
        if (!this.r2 || SharedConfig.useThreeLinesLayout) {
            f15 = 39.0f;
            f16 = f11;
            f17 = 30.0f;
            dp = AndroidUtilities.dp(11.0f);
            this.q3 = AndroidUtilities.dp(32.0f);
            this.M2 = AndroidUtilities.dp(13.0f);
            this.u3 = AndroidUtilities.dp(42.33f);
            this.C3 = AndroidUtilities.dp(43.0f);
            this.M3 = AndroidUtilities.dp(42.33f);
            this.W2 = AndroidUtilities.dp(13.0f);
            int measuredWidth4222 = getMeasuredWidth() - AndroidUtilities.dp(this.I + 21);
            if (LocaleController.isRTL) {
                int dp15 = AndroidUtilities.dp(this.I + 6);
                this.r3 = dp15;
                this.b3 = dp15;
                this.d3 = dp15;
                this.c3 = dp15;
                dp2 = AndroidUtilities.dp(this.H);
                dp3 = AndroidUtilities.dp(69.0f) + dp2;
            } else {
                int dp16 = AndroidUtilities.dp(f10);
                this.r3 = dp16;
                this.b3 = dp16;
                this.d3 = dp16;
                this.c3 = dp16;
                dp2 = getMeasuredWidth() - AndroidUtilities.dp(this.H + 56);
                dp3 = dp2 - AndroidUtilities.dp(31.0f);
            }
            i20 = dp3;
            this.u0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
            i21 = 0;
            while (true) {
                imageReceiverArr = this.V1;
                if (i21 < imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i21].setImageCoords(((this.L4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.Q ? AndroidUtilities.dp(20.0f) : 0)) - ((this.r2 || SharedConfig.useThreeLinesLayout || (xsVar = this.t0) == null || xsVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                i21++;
                dp = dp;
            }
            i22 = dp;
            i23 = measuredWidth4222;
        } else {
            int dp17 = AndroidUtilities.dp(9.0f);
            this.q3 = AndroidUtilities.dp(31.0f);
            this.M2 = AndroidUtilities.dp(f10);
            this.u3 = AndroidUtilities.dp(38.0f);
            this.C3 = AndroidUtilities.dp(39.0f);
            this.M3 = AndroidUtilities.dp(this.P ? 35.0f : 38.0f);
            this.W2 = AndroidUtilities.dp(f7);
            i23 = getMeasuredWidth() - AndroidUtilities.dp((this.I + 20) - (LocaleController.isRTL ? 0 : 12));
            if (LocaleController.isRTL) {
                int dp18 = AndroidUtilities.dp(22.0f);
                this.r3 = dp18;
                this.b3 = dp18;
                this.d3 = dp18;
                this.c3 = dp18;
                f15 = 39.0f;
                dp5 = getMeasuredWidth() - AndroidUtilities.dp(this.H + 52);
                f17 = 30.0f;
                dp6 = dp5 - AndroidUtilities.dp(((this.L4 + 2) * this.R1) + 9);
            } else {
                f15 = 39.0f;
                f17 = 30.0f;
                int dp19 = AndroidUtilities.dp(this.I + 4);
                this.r3 = dp19;
                this.b3 = dp19;
                this.d3 = dp19;
                this.c3 = dp19;
                dp5 = AndroidUtilities.dp(this.H);
                dp6 = AndroidUtilities.dp(67.0f) + dp5;
            }
            f16 = f11;
            this.u0.F.set(dp5, dp17, AndroidUtilities.dp(52.0f) + dp5, AndroidUtilities.dp(52.0f) + dp17);
            int i45 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr3 = this.V1;
                if (i45 >= imageReceiverArr3.length) {
                    break;
                }
                imageReceiverArr3[i45].setImageCoords(((this.L4 + 2) * i45) + dp6, ((AndroidUtilities.dp(f17) + dp17) + (this.Q ? AndroidUtilities.dp(20.0f) : 0)) - ((this.r2 || SharedConfig.useThreeLinesLayout || (xsVar3 = this.t0) == null || xsVar3.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(this.L4), AndroidUtilities.dp(this.L4));
                i45++;
                dp17 = dp17;
            }
            i22 = dp17;
        }
        if (LocaleController.isRTL) {
            this.Y2 = this.b3;
            this.Z2 = getMeasuredWidth() - AndroidUtilities.dp(64.0f);
        } else {
            this.Z2 = getMeasuredWidth() - AndroidUtilities.dp(this.I);
            this.Y2 = AndroidUtilities.dp(64.0f);
        }
        if (this.Q) {
            this.q3 = AndroidUtilities.dp(20.0f) + this.q3;
        }
        if (((!this.r2 && !SharedConfig.useThreeLinesLayout) || Q()) && (xsVar2 = this.t0) != null && !xsVar2.b()) {
            this.M2 -= AndroidUtilities.dp(6.0f);
            this.W2 -= AndroidUtilities.dp(6.0f);
        }
        if (getIsPinned()) {
            if (LocaleController.isRTL) {
                this.D3 = AndroidUtilities.dp(14.0f);
            } else {
                this.D3 = (getMeasuredWidth() - org.telegram.ui.ActionBar.i6.j1.getIntrinsicWidth()) - AndroidUtilities.dp(14.0f);
            }
        }
        if (this.t3) {
            int dp20 = AndroidUtilities.dp(29.0f);
            i23 -= dp20;
            if (LocaleController.isRTL) {
                this.v3 = AndroidUtilities.dp(15.666f);
                this.b3 += dp20;
                this.d3 += dp20;
                this.c3 += dp20;
                this.r3 += dp20;
            } else {
                this.v3 = getMeasuredWidth() - AndroidUtilities.dp(36.3333f);
            }
        } else if (str7 != null || str9 != null || this.c4 || this.d4) {
            if (str7 != null) {
                this.O3 = Math.max(AndroidUtilities.dp(f14), (int) Math.ceil(org.telegram.ui.ActionBar.i6.M0.measureText(str7)));
                this.X3 = new StaticLayout(str7, org.telegram.ui.ActionBar.i6.M0, this.O3, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int dp21 = AndroidUtilities.dp(f7) + this.O3;
                i23 -= dp21;
                if (LocaleController.isRTL) {
                    this.N3 = AndroidUtilities.dp(15.666f);
                    this.b3 += dp21;
                    this.d3 += dp21;
                    this.c3 += dp21;
                    this.r3 += dp21;
                } else {
                    this.N3 = bi.z(12.666f, this.O3, getMeasuredWidth() - AndroidUtilities.dp(15.666f));
                }
                this.G3 = true;
            } else {
                this.O3 = 0;
            }
            if (str9 != null) {
                if (this.J0 != 0) {
                    this.h4 = Math.max(AndroidUtilities.dp(f14), (int) Math.ceil(org.telegram.ui.ActionBar.i6.M0.measureText(str9)));
                    this.i4 = new StaticLayout(str9, org.telegram.ui.ActionBar.i6.M0, this.h4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    this.h4 = AndroidUtilities.dp(f14);
                }
                int dp22 = AndroidUtilities.dp(f7) + this.h4;
                i23 -= dp22;
                if (LocaleController.isRTL) {
                    int dp23 = AndroidUtilities.dp(15.666f);
                    int i46 = this.O3;
                    this.e4 = dp23 + (i46 != 0 ? i46 + AndroidUtilities.dp(f7) : 0);
                    this.b3 += dp22;
                    this.d3 += dp22;
                    this.c3 += dp22;
                    this.r3 += dp22;
                } else {
                    int z33 = bi.z(12.666f, this.h4, getMeasuredWidth()) - AndroidUtilities.dp(15.666f);
                    int i47 = this.O3;
                    this.e4 = z33 - (i47 != 0 ? i47 + AndroidUtilities.dp(f7) : 0);
                }
                this.b4 = true;
            } else {
                this.h4 = 0;
            }
            if (this.c4) {
                int dp24 = AndroidUtilities.dp(25.0f);
                i23 -= dp24;
                if (LocaleController.isRTL) {
                    int dp25 = AndroidUtilities.dp(15.666f);
                    this.f4 = dp25;
                    if (this.b4) {
                        int i48 = this.h4;
                        this.f4 = dp25 + (i48 != 0 ? i48 + AndroidUtilities.dp(f7) : 0);
                    }
                    if (this.G3) {
                        int i49 = this.f4;
                        int i50 = this.O3;
                        this.f4 = i49 + (i50 != 0 ? i50 + AndroidUtilities.dp(f7) : 0);
                    }
                    this.b3 += dp24;
                    this.d3 += dp24;
                    this.c3 += dp24;
                    this.r3 += dp24;
                } else {
                    int measuredWidth5 = getMeasuredWidth() - AndroidUtilities.dp(36.332f);
                    this.f4 = measuredWidth5;
                    if (this.b4) {
                        int i51 = this.h4;
                        this.f4 = measuredWidth5 - (i51 != 0 ? i51 + AndroidUtilities.dp(f7) : 0);
                    }
                    if (this.G3) {
                        int i52 = this.f4;
                        int i53 = this.O3;
                        this.f4 = i52 - (i53 != 0 ? i53 + AndroidUtilities.dp(f7) : 0);
                    }
                }
            }
            if (this.d4) {
                int dp26 = AndroidUtilities.dp(25.0f);
                i23 -= dp26;
                if (LocaleController.isRTL) {
                    int dp27 = AndroidUtilities.dp(15.666f);
                    this.g4 = dp27;
                    if (this.c4) {
                        this.g4 = AndroidUtilities.dp(25.0f) + dp27;
                    }
                    if (this.b4) {
                        int i54 = this.g4;
                        int i55 = this.h4;
                        this.g4 = i54 + (i55 != 0 ? i55 + AndroidUtilities.dp(f7) : 0);
                    }
                    if (this.G3) {
                        int i56 = this.g4;
                        int i57 = this.O3;
                        this.g4 = i56 + (i57 != 0 ? i57 + AndroidUtilities.dp(f7) : 0);
                    }
                    this.b3 += dp26;
                    this.d3 += dp26;
                    this.c3 += dp26;
                    this.r3 += dp26;
                } else {
                    int measuredWidth6 = getMeasuredWidth() - AndroidUtilities.dp(36.332f);
                    this.g4 = measuredWidth6;
                    if (this.c4) {
                        this.g4 = measuredWidth6 - AndroidUtilities.dp(25.0f);
                    }
                    if (this.b4) {
                        int i58 = this.g4;
                        int i59 = this.h4;
                        this.g4 = i58 - (i59 != 0 ? i59 + AndroidUtilities.dp(f7) : 0);
                    }
                    if (this.G3) {
                        int i60 = this.g4;
                        int i61 = this.O3;
                        this.g4 = i60 - (i61 != 0 ? i61 + AndroidUtilities.dp(f7) : 0);
                    }
                }
            }
        } else if (!this.J1 || P() || Q() || O() || !UserObject.isBot(this.f2) || !this.f2.bot_has_main_app) {
            this.G3 = false;
            this.b4 = false;
        } else {
            setOpenBotButton(true);
            int h = (int) (this.I1.h() + AndroidUtilities.dp(26.0f));
            int dp28 = AndroidUtilities.dp(13.0f);
            i23 -= h;
            int dp29 = (this.r2 || SharedConfig.useThreeLinesLayout) ? AndroidUtilities.dp(40.0f) : this.P ? AndroidUtilities.dp(33.0f) : AndroidUtilities.dp(f13);
            if (LocaleController.isRTL) {
                this.H1.set(AndroidUtilities.dp(13.0f), dp29, AndroidUtilities.dp(13.0f) + h, AndroidUtilities.dp(28.0f) + dp29);
                int i62 = h + dp28;
                this.b3 += i62;
                this.d3 += i62;
                this.c3 += i62;
                this.r3 += i62;
            } else {
                this.H1.set((getMeasuredWidth() - h) - AndroidUtilities.dp(13.0f), dp29, getMeasuredWidth() - AndroidUtilities.dp(13.0f), AndroidUtilities.dp(28.0f) + dp29);
            }
            this.G3 = false;
            this.b4 = false;
        }
        z25 = this.t3 && this.G0 == null && !P() && !Q() && !O() && (this.S0 > 0 || this.T0) && (messageObject8 = this.f1) != null && !messageObject8.isOutOwner() && (this.f1.messageOwner.action instanceof TLRPC.TL_messageActionGramTransfer);
        this.H3 = z25;
        if (z25) {
            int dp30 = (this.G3 && this.L3) ? this.O3 + AndroidUtilities.dp(f7) : 0;
            if (this.b4 && this.L3) {
                dp30 = org.telegram.messenger.q.C(f7, this.h4, dp30);
            }
            if (this.c4) {
                dp30 += AndroidUtilities.dp(25.0f);
            }
            if (this.d4) {
                dp30 += AndroidUtilities.dp(25.0f);
            }
            if (this.E1) {
                dp30 = org.telegram.messenger.q.C(4.0f, (int) this.H1.width(), dp30);
            }
            this.I3 = LocaleController.isRTL ? AndroidUtilities.dp(15.666f) + dp30 : org.telegram.messenger.q.B(43.666f, getMeasuredWidth(), dp30);
            i23 -= AndroidUtilities.dp(32.0f);
            if (LocaleController.isRTL) {
                this.b3 = AndroidUtilities.dp(32.0f) + this.b3;
                this.d3 = AndroidUtilities.dp(32.0f) + this.d3;
                this.c3 = AndroidUtilities.dp(32.0f) + this.c3;
                this.r3 = AndroidUtilities.dp(32.0f) + this.r3;
            }
        }
        if (z21) {
            if (replaceEmoji == null) {
                replaceEmoji = "";
            }
            if (replaceEmoji.length() > 150) {
                replaceEmoji = replaceEmoji.subSequence(0, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
            }
            replaceEmoji = Emoji.replaceEmoji(((this.r2 || SharedConfig.useThreeLinesLayout) && !M() && charSequence25 == null) ? AndroidUtilities.replaceTwoNewLinesToOne(replaceEmoji) : AndroidUtilities.replaceNewLines(replaceEmoji), org.telegram.ui.ActionBar.i6.F0[this.E0].getFontMetricsInt(), false);
            MessageObject messageObject24 = this.f1;
            if (messageObject24 != null && (highlightText2 = AndroidUtilities.highlightText(replaceEmoji, messageObject24.highlightedWords, this.J4)) != null) {
                replaceEmoji = highlightText2;
            }
        }
        max = Math.max(AndroidUtilities.dp(12.0f), i23);
        this.g3 = AndroidUtilities.dp((!this.r2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
        if (((!this.r2 && !SharedConfig.useThreeLinesLayout) || Q()) && M()) {
            this.g3 -= AndroidUtilities.dp(!Q() ? 10.0f : 12.0f);
        }
        if (!Q()) {
            this.a3 = AndroidUtilities.dp((this.r2 || SharedConfig.useThreeLinesLayout) ? 34.0f : f15);
            int i63 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr4 = this.V1;
                if (i63 >= imageReceiverArr4.length) {
                    break;
                }
                imageReceiverArr4[i63].setImageY(this.g3);
                i63++;
            }
        } else if ((this.r2 || SharedConfig.useThreeLinesLayout) && !M() && charSequence25 != null && (this.J0 == 0 || this.M0 == 1)) {
            try {
                messageObject7 = this.f1;
            } catch (Exception e15) {
                e = e15;
            }
            if (messageObject7 != null && messageObject7.hasHighlightedWords()) {
                CharSequence highlightText5 = AndroidUtilities.highlightText(charSequence25, this.f1.highlightedWords, this.J4);
                if (highlightText5 != null) {
                    charSequence26 = highlightText5;
                    TextPaint textPaint8 = org.telegram.ui.ActionBar.i6.G0;
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    TextUtils.TruncateAt truncateAt4 = TextUtils.TruncateAt.END;
                    this.s3 = mx0.b(charSequence26, textPaint8, max, 0.0f, max, 1);
                    this.a3 = AndroidUtilities.dp(51.0f);
                    dp4 = (this.R || !this.P) ? 0 : AndroidUtilities.dp(20.0f);
                    i24 = 0;
                    while (true) {
                        imageReceiverArr2 = this.V1;
                        if (i24 >= imageReceiverArr2.length) {
                            break;
                        }
                        imageReceiverArr2[i24].setImageY(AndroidUtilities.dp(40.0f) + i22 + dp4);
                        i24++;
                    }
                    charSequence25 = charSequence26;
                }
            }
            charSequence26 = charSequence25;
            TextPaint textPaint82 = org.telegram.ui.ActionBar.i6.G0;
            Layout.Alignment alignment42 = Layout.Alignment.ALIGN_NORMAL;
            TextUtils.TruncateAt truncateAt42 = TextUtils.TruncateAt.END;
            this.s3 = mx0.b(charSequence26, textPaint82, max, 0.0f, max, 1);
            this.a3 = AndroidUtilities.dp(51.0f);
            if (this.R) {
            }
            i24 = 0;
            while (true) {
                imageReceiverArr2 = this.V1;
                if (i24 >= imageReceiverArr2.length) {
                }
                imageReceiverArr2[i24].setImageY(AndroidUtilities.dp(40.0f) + i22 + dp4);
                i24++;
            }
            charSequence25 = charSequence26;
        } else {
            this.s3 = null;
            if (this.r2 || SharedConfig.useThreeLinesLayout) {
                this.a3 = AndroidUtilities.dp(32.0f);
                int dp31 = (this.R && this.P) ? AndroidUtilities.dp(20.0f) : 0;
                int i64 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr5 = this.V1;
                    if (i64 >= imageReceiverArr5.length) {
                        break;
                    }
                    imageReceiverArr5[i64].setImageY(AndroidUtilities.dp(21.0f) + i22 + dp31);
                    i64++;
                }
            } else {
                this.a3 = AndroidUtilities.dp(f15);
            }
        }
        if (this.Q) {
            this.a3 = AndroidUtilities.dp(20.0f) + this.a3;
        }
        this.n3 = org.telegram.ui.Components.b6.update(0, (View) this, this.n3, this.s3);
        try {
            if (TextUtils.isEmpty(charSequence24)) {
                this.h3 = null;
            } else {
                this.h3 = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(charSequence24, this.a0.getFontMetricsInt(), false), this.a0, max - AndroidUtilities.dp(26.0f), TextUtils.TruncateAt.END), this.a0, max - AndroidUtilities.dp(20.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.k3.addAll(this.l3);
                this.l3.clear();
                vh.g.c(this, this.h3, this.k3, this.l3);
            }
        } catch (Exception unused) {
        }
        this.o3 = org.telegram.ui.Components.b6.update(0, (View) this, this.o3, this.h3);
        try {
            if (!TextUtils.isEmpty(charSequence23)) {
                try {
                    if (!this.r2) {
                        if (!SharedConfig.useThreeLinesLayout) {
                        }
                        StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(charSequence23, this.a0, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.i6.H0[this.E0], max, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        max = max;
                        this.f3 = staticLayout2;
                    }
                    StaticLayout staticLayout22 = new StaticLayout(TextUtils.ellipsize(charSequence23, this.a0, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.i6.H0[this.E0], max, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    max = max;
                    this.f3 = staticLayout22;
                } catch (Exception e16) {
                    e = e16;
                    max = max;
                    FileLog.e(e);
                    if (replaceEmoji instanceof Spannable) {
                    }
                    if (this.r2) {
                    }
                    this.a0 = org.telegram.ui.ActionBar.i6.F0[this.E0];
                    charSequence27 = charSequence25;
                    charSequence28 = null;
                    Layout.Alignment alignment22222 = Layout.Alignment.ALIGN_NORMAL;
                    if (this.r2) {
                    }
                    if (this.R1 > 0) {
                        max += AndroidUtilities.dp(5.0f);
                    }
                    i26 = max;
                    TextPaint textPaint622222 = this.a0;
                    float dp922222 = AndroidUtilities.dp(1.0f);
                    TextUtils.TruncateAt truncateAt22222 = TextUtils.TruncateAt.END;
                    this.e3 = mx0.b(charSequence27, textPaint622222, i26, dp922222, i26, charSequence28 != null ? 1 : 2);
                    max = i26;
                    this.i3.addAll(this.j3);
                    this.j3.clear();
                    vh.g.b(this, this.e3, -2, -2, this.i3, this.j3);
                    int i42222222 = max;
                    this.m3 = org.telegram.ui.Components.b6.update(0, (View) this, this.m3, this.e3);
                    if (LocaleController.isRTL) {
                    }
                    staticLayout = this.f3;
                    if (staticLayout != null) {
                        if (i13 >= 0) {
                        }
                        primaryHorizontal = this.f3.getPrimaryHorizontal(0);
                        primaryHorizontal2 = this.f3.getPrimaryHorizontal(1);
                        if (primaryHorizontal >= primaryHorizontal2) {
                        }
                    }
                    e0();
                }
                if (!M()) {
                    TextPaint textPaint9 = org.telegram.ui.ActionBar.i6.H0[this.E0];
                    Layout.Alignment alignment5 = Layout.Alignment.ALIGN_NORMAL;
                    float dp32 = AndroidUtilities.dp(1.0f);
                    TextUtils.TruncateAt truncateAt5 = TextUtils.TruncateAt.END;
                    try {
                        this.f3 = mx0.b(charSequence23, textPaint9, max, dp32, max, 1);
                    } catch (Exception e17) {
                        e = e17;
                        max = max;
                        FileLog.e(e);
                        if (replaceEmoji instanceof Spannable) {
                        }
                        if (this.r2) {
                        }
                        this.a0 = org.telegram.ui.ActionBar.i6.F0[this.E0];
                        charSequence27 = charSequence25;
                        charSequence28 = null;
                        Layout.Alignment alignment222222 = Layout.Alignment.ALIGN_NORMAL;
                        if (this.r2) {
                        }
                        if (this.R1 > 0) {
                        }
                        i26 = max;
                        TextPaint textPaint6222222 = this.a0;
                        float dp9222222 = AndroidUtilities.dp(1.0f);
                        TextUtils.TruncateAt truncateAt222222 = TextUtils.TruncateAt.END;
                        this.e3 = mx0.b(charSequence27, textPaint6222222, i26, dp9222222, i26, charSequence28 != null ? 1 : 2);
                        max = i26;
                        this.i3.addAll(this.j3);
                        this.j3.clear();
                        vh.g.b(this, this.e3, -2, -2, this.i3, this.j3);
                        int i422222222 = max;
                        this.m3 = org.telegram.ui.Components.b6.update(0, (View) this, this.m3, this.e3);
                        if (LocaleController.isRTL) {
                        }
                        staticLayout = this.f3;
                        if (staticLayout != null) {
                        }
                        e0();
                    }
                }
            }
        } catch (Exception e18) {
            e = e18;
        }
        try {
            if (replaceEmoji instanceof Spannable) {
                Spannable spannable = (Spannable) replaceEmoji;
                for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                    if (!(obj instanceof ClickableSpan) && !(obj instanceof CodeHighlighting.Span)) {
                        if (this.K0 == 0) {
                            if (!P()) {
                                if (!(obj instanceof m61)) {
                                }
                            }
                        }
                        if (!(obj instanceof CodeHighlighting.ColorSpan)) {
                            if (!(obj instanceof xj0)) {
                                if (!(obj instanceof wj0)) {
                                    if ((obj instanceof StyleSpan) && ((StyleSpan) obj).getStyle() == 1) {
                                    }
                                }
                            }
                        }
                    }
                    spannable.removeSpan(obj);
                }
            }
            if ((!this.r2 || SharedConfig.useThreeLinesLayout) && !M() && this.J0 != 0 && this.M0 > 1) {
                this.a0 = org.telegram.ui.ActionBar.i6.F0[this.E0];
                charSequence27 = charSequence25;
                charSequence28 = null;
            } else {
                if (!this.r2) {
                }
                if (!M()) {
                    if (charSequence25 == null) {
                        if (ChatObject.isMonoForum(this.g2) && ChatObject.canManageMonoForum(this.F0, this.g2)) {
                        }
                        charSequence28 = charSequence25;
                        charSequence27 = replaceEmoji;
                    }
                }
                replaceEmoji = (Q() || !(replaceEmoji instanceof Spanned) || ((q2[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), q2.class)).length > 0) ? TextUtils.ellipsize(replaceEmoji, this.a0, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END) : TextUtils.ellipsize(replaceEmoji, this.a0, max - AndroidUtilities.dp(((this.L4 + 2) * this.R1) + 15), TextUtils.TruncateAt.END);
                charSequence28 = charSequence25;
                charSequence27 = replaceEmoji;
            }
            Layout.Alignment alignment2222222 = Layout.Alignment.ALIGN_NORMAL;
            if ((!this.r2 || SharedConfig.useThreeLinesLayout) && !M()) {
                if (this.R1 > 0 && charSequence28 != null) {
                    max += AndroidUtilities.dp(5.0f);
                }
                i26 = max;
                TextPaint textPaint62222222 = this.a0;
                float dp92222222 = AndroidUtilities.dp(1.0f);
                TextUtils.TruncateAt truncateAt2222222 = TextUtils.TruncateAt.END;
                this.e3 = mx0.b(charSequence27, textPaint62222222, i26, dp92222222, i26, charSequence28 != null ? 1 : 2);
                max = i26;
            } else {
                if (this.R1 > 0) {
                    max += AndroidUtilities.dp(((this.L4 + 2) * r0) + 3);
                    if (LocaleController.isRTL && !Q()) {
                        this.b3 -= AndroidUtilities.dp(((this.L4 + 2) * this.R1) + 3);
                    }
                }
                int i65 = max;
                try {
                    this.e3 = new StaticLayout(charSequence27, this.a0, i65, alignment2222222, 1.0f, 0.0f, false);
                    max = i65;
                } catch (Exception e19) {
                    e = e19;
                    max = i65;
                    this.e3 = null;
                    FileLog.e(e);
                    int i4222222222 = max;
                    this.m3 = org.telegram.ui.Components.b6.update(0, (View) this, this.m3, this.e3);
                    if (LocaleController.isRTL) {
                    }
                    staticLayout = this.f3;
                    if (staticLayout != null) {
                    }
                    e0();
                }
            }
            this.i3.addAll(this.j3);
            this.j3.clear();
            vh.g.b(this, this.e3, -2, -2, this.i3, this.j3);
        } catch (Exception e20) {
            e = e20;
        }
        int i42222222222 = max;
        this.m3 = org.telegram.ui.Components.b6.update(0, (View) this, this.m3, this.e3);
        if (LocaleController.isRTL) {
            StaticLayout staticLayout3 = this.z2;
            if (staticLayout3 != null && staticLayout3.getLineCount() > 0) {
                float lineLeft = this.z2.getLineLeft(0);
                double ceil2 = Math.ceil(this.z2.getLineWidth(0));
                int dp33 = AndroidUtilities.dp(12.0f) + this.x2;
                this.x2 = dp33;
                if (this.k4) {
                    this.x2 = AndroidUtilities.dp(21.0f) + dp33;
                }
                if (this.D2) {
                    ceil2 = Math.min(this.y2, ceil2);
                }
                if ((this.Z0 || this.b1 || this.c1 > f12) && !this.j4 && this.p4 == 0) {
                    if (this.l4) {
                        int dp34 = (int) ((((this.y2 - ceil2) - lineLeft) + this.x2) - AndroidUtilities.dp(f16));
                        this.H2 = dp34;
                        this.I2 = (dp34 - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.i6.c1.getIntrinsicWidth();
                    } else {
                        this.H2 = (int) ((((this.y2 - ceil2) + this.x2) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.i6.c1.getIntrinsicWidth());
                    }
                } else if (this.j4) {
                    this.H2 = (int) ((((this.y2 - ceil2) + this.x2) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.i6.f1.getIntrinsicWidth());
                } else if (this.l4) {
                    int dp35 = (int) ((((this.y2 - ceil2) - lineLeft) + this.x2) - AndroidUtilities.dp(f16));
                    this.H2 = dp35;
                    this.I2 = (dp35 - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.i6.c1.getIntrinsicWidth();
                } else if (this.p4 != 0) {
                    this.H2 = (int) ((((this.y2 - ceil2) + this.x2) - AndroidUtilities.dp(6.0f)) - (this.p4 == 1 ? org.telegram.ui.ActionBar.i6.g1 : org.telegram.ui.ActionBar.i6.h1).getIntrinsicWidth());
                } else {
                    this.H2 = (int) ((((this.y2 - ceil2) + this.x2) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.i6.c1.getIntrinsicWidth());
                }
                if (lineLeft == f12) {
                    double d10 = this.y2;
                    if (ceil2 < d10) {
                        this.x2 = (int) ((d10 - ceil2) + this.x2);
                    }
                }
            }
            StaticLayout staticLayout4 = this.e3;
            int i66 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (staticLayout4 != null && (lineCount6 = staticLayout4.getLineCount()) > 0) {
                int i67 = Integer.MAX_VALUE;
                int i68 = 0;
                while (true) {
                    if (i68 >= lineCount6) {
                        break;
                    }
                    if (this.e3.getLineLeft(i68) != f12) {
                        i67 = 0;
                        break;
                    } else {
                        i67 = Math.min(i67, (int) (i42222222222 - Math.ceil(this.e3.getLineWidth(i68))));
                        i68++;
                    }
                }
                if (i67 != Integer.MAX_VALUE) {
                    this.b3 += i67;
                }
            }
            StaticLayout staticLayout5 = this.f3;
            if (staticLayout5 != null && (lineCount5 = staticLayout5.getLineCount()) > 0) {
                int i69 = Integer.MAX_VALUE;
                int i70 = 0;
                while (true) {
                    if (i70 >= lineCount5) {
                        break;
                    }
                    if (this.f3.getLineLeft(i70) != f12) {
                        i69 = 0;
                        break;
                    } else {
                        i69 = Math.min(i69, (int) (i42222222222 - Math.ceil(this.f3.getLineWidth(i70))));
                        i70++;
                    }
                }
                if (i69 != Integer.MAX_VALUE) {
                    this.d3 += i69;
                }
            }
            StaticLayout staticLayout6 = this.s3;
            if (staticLayout6 != null && staticLayout6.getLineCount() > 0 && this.s3.getLineLeft(0) == f12) {
                double ceil3 = Math.ceil(this.s3.getLineWidth(0));
                double d11 = i42222222222;
                if (ceil3 < d11) {
                    this.r3 = (int) ((d11 - ceil3) + this.r3);
                }
            }
            StaticLayout staticLayout7 = this.h3;
            if (staticLayout7 != null && (lineCount4 = staticLayout7.getLineCount()) > 0) {
                for (int i71 = 0; i71 < lineCount4; i71++) {
                    i66 = (int) Math.min(i66, this.h3.getWidth() - this.h3.getLineRight(i71));
                }
                this.c3 += i66;
            }
        } else {
            StaticLayout staticLayout8 = this.z2;
            if (staticLayout8 != null && staticLayout8.getLineCount() > 0) {
                float lineRight = this.z2.getLineRight(0);
                if (this.D2) {
                    lineRight = Math.min(this.y2, lineRight);
                }
                if (lineRight == this.y2) {
                    double ceil4 = Math.ceil(this.z2.getLineWidth(0));
                    if (this.D2) {
                        ceil4 = Math.min(this.y2, ceil4);
                    }
                    double d12 = this.y2;
                    if (ceil4 < d12) {
                        this.x2 = (int) (this.x2 - (d12 - ceil4));
                    }
                }
                if (this.k4) {
                    this.x2 = AndroidUtilities.dp(21.0f) + this.x2;
                }
                int dp36 = (int) (this.x2 + lineRight + AndroidUtilities.dp(6.0f));
                this.H2 = dp36;
                if (this.l4) {
                    this.I2 = AndroidUtilities.dp(f17) + dp36;
                }
            }
            StaticLayout staticLayout9 = this.e3;
            float f19 = 2.14748365E9f;
            if (staticLayout9 != null && (lineCount3 = staticLayout9.getLineCount()) > 0) {
                float f20 = 2.14748365E9f;
                for (int i72 = 0; i72 < lineCount3; i72++) {
                    f20 = Math.min(f20, this.e3.getLineLeft(i72));
                }
                this.b3 = (int) (this.b3 - f20);
            }
            StaticLayout staticLayout10 = this.h3;
            if (staticLayout10 != null && (lineCount2 = staticLayout10.getLineCount()) > 0) {
                float f21 = 2.14748365E9f;
                for (int i73 = 0; i73 < lineCount2; i73++) {
                    f21 = Math.min(f21, this.h3.getLineLeft(i73));
                }
                this.c3 = (int) (this.c3 - f21);
            }
            StaticLayout staticLayout11 = this.f3;
            if (staticLayout11 != null && (lineCount = staticLayout11.getLineCount()) > 0) {
                for (int i74 = 0; i74 < lineCount; i74++) {
                    f19 = Math.min(f19, this.f3.getLineLeft(i74));
                }
                this.d3 = (int) (this.d3 - f19);
            }
            StaticLayout staticLayout12 = this.s3;
            if (staticLayout12 != null && staticLayout12.getLineCount() > 0) {
                this.r3 = (int) (this.r3 - this.s3.getLineLeft(0));
            }
        }
        staticLayout = this.f3;
        if (staticLayout != null && this.j2 >= 0 && staticLayout.getText().length() > 0) {
            if (i13 >= 0 || (i25 = i13 + 1) >= this.f3.getText().length()) {
                primaryHorizontal = this.f3.getPrimaryHorizontal(0);
                primaryHorizontal2 = this.f3.getPrimaryHorizontal(1);
            } else {
                primaryHorizontal = this.f3.getPrimaryHorizontal(i13);
                primaryHorizontal2 = this.f3.getPrimaryHorizontal(i25);
            }
            if (primaryHorizontal >= primaryHorizontal2) {
                this.C4 = (int) (this.d3 + primaryHorizontal);
            } else {
                this.C4 = (int) (this.d3 + primaryHorizontal2 + AndroidUtilities.dp(3.0f));
            }
        }
        e0();
    }

    public final void v() {
        TLRPC.Message message;
        MessageObject messageObject = this.f1;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.X0) {
            ChatThemeController.getInstance(this.F0).setDialogTheme(this.H0, ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme, false);
        }
    }

    public final void w() {
        TLRPC.Chat chat = this.g2;
        boolean z10 = chat != null && chat.call_active && chat.call_not_empty;
        this.v2 = z10;
        this.q1 = z10 ? 1.0f : 0.0f;
    }

    public final void x() {
        TLRPC.User user;
        if (this.f2 != null && (user = MessagesController.getInstance(this.F0).getUser(Long.valueOf(this.f2.id))) != null) {
            this.f2 = user;
        }
        this.p1 = R() ? 1.0f : 0.0f;
    }

    public final void y() {
        ci.o3 o3Var;
        boolean z10 = this.l0 > 0 && !this.v2 && !R() && ((o3Var = this.q2) == null || !o3Var.a.q) && !this.u0.w;
        this.w2 = z10;
        this.m0 = z10 ? 1.0f : 0.0f;
    }

    public final int z() {
        if (!Q() || this.j0 || this.f) {
            return getCollapsedHeight();
        }
        int dp = AndroidUtilities.dp((this.r2 || SharedConfig.useThreeLinesLayout) ? 86.0f : 91.0f);
        if (this.s2) {
            dp++;
        }
        return M() ? AndroidUtilities.dp(this.M) + dp : dp;
    }

    public s2(ty tyVar, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = true;
        this.x = true;
        int i11 = 0;
        this.y = false;
        this.H = 11;
        this.I = 72;
        this.J = 70;
        this.K = 76;
        this.L = 3;
        this.M = 11;
        this.U = 42.0f;
        k2 k2Var = new k2(this);
        this.u0 = k2Var;
        this.z0 = true;
        this.C0 = 0.0f;
        this.d1 = false;
        this.e1 = false;
        this.F1 = new bd(this);
        this.G1 = new Paint(1);
        this.H1 = new RectF();
        this.L1 = false;
        this.U1 = new boolean[3];
        this.V1 = new ImageReceiver[3];
        this.W1 = new boolean[3];
        this.X1 = new boolean[3];
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Y1 = imageReceiver;
        this.a2 = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        this.d2 = new m2(0);
        hs hsVar = hs.h;
        this.m2 = new org.telegram.ui.Components.g6(this, 0L, 350L, hsVar);
        this.o2 = new org.telegram.ui.Components.g6(this, 0L, 350L, hsVar);
        this.i3 = new Stack();
        this.j3 = new ArrayList();
        this.k3 = new Stack();
        this.l3 = new ArrayList();
        this.L3 = true;
        this.S3 = new me.b(this, hsVar, 320L);
        this.V3 = 1.0f;
        this.W3 = 1.0f;
        this.r4 = new RectF();
        this.x4 = -1;
        this.H4 = -1;
        this.I4 = new p2(this);
        k2Var.I = true;
        this.J4 = e6Var;
        this.D4 = tyVar;
        org.telegram.ui.ActionBar.i6.S(context);
        this.y = false;
        this.E = false;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
        while (true) {
            ImageReceiver[] imageReceiverArr = this.V1;
            if (i11 >= imageReceiverArr.length) {
                this.r2 = z10;
                this.F0 = i10;
                ci.bb bbVar = new ci.bb(this, context, 11);
                this.m4 = bbVar;
                addView(bbVar);
                this.n4 = new org.telegram.ui.Components.q5(AndroidUtilities.dp(22.0f), bbVar);
                this.o4 = new org.telegram.ui.Components.q5(AndroidUtilities.dp(17.0f), this);
                this.Y1.setAllowLoadingOnAttachedOnly(true);
                return;
            }
            imageReceiverArr[i11] = new ImageReceiver(this);
            ImageReceiver imageReceiver2 = this.V1[i11];
            imageReceiver2.ignoreNotifications = true;
            imageReceiver2.setRoundRadius(AndroidUtilities.dp(2.0f));
            this.V1[i11].setAllowLoadingOnAttachedOnly(true);
            i11++;
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (kc.x1) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
    }
}
