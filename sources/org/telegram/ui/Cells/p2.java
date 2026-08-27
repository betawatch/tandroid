package org.telegram.ui.Cells;

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
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.uh0;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zy;
import org.telegram.ui.bx;
import org.telegram.ui.g31;
import org.telegram.ui.gy;
import org.telegram.ui.p00;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class p2 extends a0 implements jh.y6, org.telegram.ui.ActionBar.x5 {
    public boolean A;
    public int A0;
    public boolean A1;
    public Paint A2;
    public int A3;
    public final m2 A4;
    public boolean B;
    public final int B0;
    public final nc B1;
    public Paint B2;
    public float B3;
    public final org.telegram.ui.ActionBar.c6 B4;
    public a7 C;
    public k2 C0;
    public final Paint C1;
    public boolean C2;
    public boolean C3;
    public int C4;
    public int D;
    public long D0;
    public final RectF D1;
    public int D2;
    public boolean D3;
    public int D4;
    public int E;
    public String E0;
    public pz0 E1;
    public int E2;
    public int E3;
    public int E4;
    public int F;
    public int F0;
    public boolean F1;
    public int F2;
    public int F3;
    public o2 F4;
    public int G;
    public long G0;
    public lh.n6 G1;
    public int G2;
    public int G3;
    public GradientDrawable G4;
    public final int H;
    public String H0;
    public boolean H1;
    public int H2;
    public int H3;
    public int H4;
    public final int I;
    public int I0;
    public int I1;
    public int I2;
    public int I3;
    public int I4;
    public TLRPC.TL_forumTopic J;
    public boolean J0;
    public int J1;
    public StaticLayout J2;
    public boolean J3;
    public Paint J4;
    public boolean K;
    public boolean K0;
    public String K1;
    public int K2;
    public final ud.a K3;
    public ag.i2 K4;
    public boolean L;
    public boolean L0;
    public int L1;
    public boolean L2;
    public ValueAnimator L3;
    public Drawable L4;
    public boolean M;
    public boolean M0;
    public oi0 M1;
    public boolean M2;
    public ValueAnimator M3;
    public int M4;
    public boolean N;
    public int N0;
    public int N1;
    public boolean N2;
    public float N3;
    public Drawable N4;
    public Paint O;
    public int O0;
    public boolean O1;
    public boolean O2;
    public float O3;
    public Drawable O4;
    public Paint P;
    public boolean P0;
    public Paint P1;
    public int P2;
    public StaticLayout P3;
    public ColorFilter[] P4;
    public float Q;
    public int Q0;
    public final boolean[] Q1;
    public int Q2;
    public StaticLayout Q3;
    public int[] Q4;
    public boolean R;
    public int R0;
    public final ImageReceiver[] R1;
    public int R2;
    public StaticLayout R3;
    public Runnable R4;
    public boolean S;
    public int S0;
    public final boolean[] S1;
    public int S2;
    public StaticLayout S3;
    public TextPaint T;
    public boolean T0;
    public final boolean[] T1;
    public int T2;
    public boolean T3;
    public Paint U;
    public int U0;
    public final ImageReceiver U1;
    public int U2;
    public boolean U3;
    public tc V;
    public boolean V0;
    public ce0 V1;
    public int V2;
    public boolean V3;
    public l2 W;
    public boolean W0;
    public final org.telegram.ui.Components.y8 W1;
    public int W2;
    public int W3;
    public boolean X0;
    public boolean X1;
    public int X2;
    public int X3;
    public float Y0;
    public float Y1;
    public int Y2;
    public int Y3;
    public boolean Z0;
    public final f2.b0 Z1;
    public int Z2;
    public int Z3;
    public boolean a0;
    public boolean a1;
    public wh0 a2;
    public StaticLayout a3;
    public StaticLayout a4;
    public boolean b0;
    public MessageObject b1;
    public TLRPC.User b2;
    public StaticLayout b3;
    public boolean b4;
    public boolean c0;
    public ArrayList c1;
    public TLRPC.Chat c2;
    public int c3;
    public boolean c4;
    public Drawable[] d0;
    public boolean d1;
    public TLRPC.EncryptedChat d2;
    public StaticLayout d3;
    public boolean d4;
    public float e0;
    public CharSequence e1;
    public CharSequence e2;
    public final Stack e3;
    public final ag.s0 e4;
    public boolean f;
    public boolean f0;
    public int f1;
    public int f2;
    public final ArrayList f3;
    public final org.telegram.ui.Components.i5 f4;
    public boolean g0;
    public int g1;
    public boolean g2;
    public final Stack g3;
    public final org.telegram.ui.Components.i5 g4;
    public final boolean h;
    public int h0;
    public int h1;
    public TLRPC.DraftMessage h2;
    public final ArrayList h3;
    public int h4;
    public float i0;
    public boolean i1;
    public final org.telegram.ui.Components.y5 i2;
    public org.telegram.ui.Components.p5 i3;
    public boolean i4;
    public c11 j0;
    public boolean j1;
    public boolean j2;
    public org.telegram.ui.Components.p5 j3;
    public final RectF j4;
    public Paint k0;
    public float k1;
    public final org.telegram.ui.Components.y5 k2;
    public org.telegram.ui.Components.p5 k3;
    public pf.h k4;
    public Paint l0;
    public float l1;
    public long l2;
    public org.telegram.ui.Components.p5 l3;
    public Path l4;
    public boolean m0;
    public float m1;
    public lh.j3 m2;
    public int m3;
    public RectF m4;
    public float n;
    public boolean n0;
    public float n1;
    public final boolean n2;
    public int n3;
    public int n4;
    public boolean o0;
    public int o1;
    public boolean o2;
    public StaticLayout o3;
    public int o4;
    public wr p0;
    public float p1;
    public boolean p2;
    public boolean p3;
    public int p4;
    public final i2 q0;
    public int q1;
    public boolean q2;
    public int q3;
    public float q4;
    public boolean r;
    public Path r0;
    public int r1;
    public boolean r2;
    public int r3;
    public boolean r4;
    public oi0 s;
    public eh.k s0;
    public float s1;
    public boolean s2;
    public boolean s3;
    public ValueAnimator s4;
    public boolean t0;
    public boolean t1;
    public int t2;
    public float t3;
    public long t4;
    public boolean u0;
    public oi0 u1;
    public int u2;
    public boolean u3;
    public int u4;
    public int v;
    public boolean v0;
    public boolean v1;
    public StaticLayout v2;
    public boolean v3;
    public final gy v4;
    public boolean w;
    public boolean w0;
    public boolean w1;
    public boolean w2;
    public boolean w3;
    public StaticLayout w4;
    public boolean x;
    public boolean x0;
    public float x1;
    public float x2;
    public boolean x3;
    public int x4;
    public boolean y;
    public float y0;
    public float y1;
    public boolean y2;
    public int y3;
    public int y4;
    public oh.a z0;
    public float z1;
    public boolean z2;
    public int z3;
    public int z4;

    public p2(Context context, boolean z10) {
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
        if (this.c1 == null) {
            MessageObject messageObject = this.b1;
            if (messageObject == null || messageObject.caption == null) {
                return null;
            }
            return messageObject;
        }
        MessageObject messageObject2 = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.c1.size(); i11++) {
            MessageObject messageObject3 = (MessageObject) this.c1.get(i11);
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
        boolean z10 = this.n2;
        int dp = AndroidUtilities.dp((z10 || SharedConfig.useThreeLinesLayout) ? this.G : this.F) + 1;
        if (this.M) {
            dp += AndroidUtilities.dp(20.0f);
        }
        if (!M() || ((z10 || SharedConfig.useThreeLinesLayout) && !Q())) {
            return dp;
        }
        return AndroidUtilities.dp(Q() ? this.I : this.H) + dp;
    }

    private Paint getPaintReorderGradient() {
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, this.B4);
        if (this.I4 != v02 || this.J4 == null) {
            this.I4 = v02;
            if (this.J4 == null) {
                this.J4 = new Paint(1);
            }
            this.J4.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{0, v02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
        return this.J4;
    }

    private TextPaint getTimeTextPaint() {
        return this.C3 ? N() ? org.telegram.ui.ActionBar.g6.J0 : org.telegram.ui.ActionBar.g6.K0 : org.telegram.ui.ActionBar.g6.I0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTopicId() {
        TLRPC.TL_forumTopic tL_forumTopic = this.J;
        if (tL_forumTopic == null) {
            return 0;
        }
        return tL_forumTopic.id;
    }

    public final void B(int i10, int i11) {
        this.q4 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.s4 = ofFloat;
        ofFloat.setDuration(220L);
        this.s4.setInterpolator(er.f);
        this.o4 = i10;
        this.n4 = i11;
        this.s4.addUpdateListener(new f2(this, 2));
        this.s4.addListener(new j2(this, 2));
        this.r4 = true;
        this.s4.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0229, code lost:
    
        if (r3 > 0) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(Canvas canvas) {
        boolean z10;
        float f10;
        int dp;
        int i10;
        float dp2;
        float dp3;
        float dp4;
        float f11;
        float dp5;
        float dp6;
        float dp7;
        float f12;
        float dp8;
        float dp9;
        float f13;
        float dp10;
        float dp11;
        float f14;
        float f15;
        float f16;
        boolean z11;
        float dp12;
        lh.j3 j3Var;
        TLRPC.Chat chat = this.c2;
        boolean z12 = false;
        if (chat == null || (chat.flags2 & 2048) == 0) {
            z10 = false;
        } else {
            float imageY2 = this.U1.getImageY2();
            float imageX2 = this.U1.getImageX2();
            lh.j3 j3Var2 = this.m2;
            float progress = (j3Var2 == null || !j3Var2.a.q) ? 1.0f : 1.0f - j3Var2.getProgress();
            if (this.O4 == null) {
                this.O4 = getContext().getResources().getDrawable(R.drawable.star_small_outline).mutate();
            }
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false);
            if (this.M4 != w02) {
                Drawable drawable = this.O4;
                this.M4 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (this.N4 == null) {
                this.N4 = getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate();
            }
            int dp13 = AndroidUtilities.dp(19.33f);
            Rect rect = AndroidUtilities.rectTmp2;
            int i11 = (int) imageX2;
            int i12 = (int) imageY2;
            int i13 = i12 - dp13;
            rect.set((AndroidUtilities.dp(1.66f) + i11) - dp13, i13, AndroidUtilities.dp(1.66f) + i11, i12);
            rect.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            this.O4.setBounds(rect);
            int i14 = (int) (progress * 255.0f);
            this.O4.setAlpha(i14);
            this.O4.draw(canvas);
            rect.set((AndroidUtilities.dp(1.66f) + i11) - dp13, i13, AndroidUtilities.dp(1.66f) + i11, i12);
            this.N4.setBounds(rect);
            this.N4.setAlpha(i14);
            this.N4.draw(canvas);
            z10 = true;
        }
        float e9 = this.i2.e(this.j2 && !z10);
        float f17 = 10.0f;
        if (e9 > 0.0f) {
            float centerY = this.U1.getCenterY() + AndroidUtilities.dp(18.0f);
            float centerX = this.U1.getCenterX() + AndroidUtilities.dp(18.0f);
            canvas.save();
            org.telegram.ui.ActionBar.g6.t0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, this.B4));
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(11.33f) * e9, org.telegram.ui.ActionBar.g6.t0);
            if (this.K4 == null) {
                this.K4 = new ag.i2(org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, -1, -1, this.B4);
            }
            this.K4.d((int) (centerX - AndroidUtilities.dp(10.0f)), 0.0f, (int) (centerY - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + centerX), 0.0f, (int) (AndroidUtilities.dp(10.0f) + centerY));
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f) * e9, this.K4.f);
            if (this.L4 == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.L4 = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.L4.setBounds((int) (centerX - (((r4.getIntrinsicWidth() / 2.0f) * 0.875f) * e9)), (int) (centerY - (((this.L4.getIntrinsicHeight() / 2.0f) * 0.875f) * e9)), (int) (((this.L4.getIntrinsicWidth() / 2.0f) * 0.875f * e9) + centerX), (int) (((this.L4.getIntrinsicHeight() / 2.0f) * 0.875f * e9) + centerY));
            this.L4.setAlpha((int) (e9 * 255.0f));
            this.L4.draw(canvas);
            canvas.restore();
            return false;
        }
        if (!this.J0 || this.F0 != 0 || z10) {
            return false;
        }
        boolean z13 = (this.h0 <= 0 || R() || this.r2 || this.q0.w) ? false : true;
        this.s2 = z13;
        if (this.e0 != 1.0f && (z13 || this.i0 > 0.0f)) {
            c11 c11Var = this.j0;
            if (c11Var != null) {
                int i15 = c11Var.f;
                int i16 = this.h0;
                if (i15 != i16) {
                }
                if (this.k0 == null) {
                    this.k0 = new Paint(1);
                    Paint paint = new Paint(1);
                    this.l0 = paint;
                    paint.setColor(838860800);
                }
                int imageY22 = (int) (this.U1.getImageY2() - AndroidUtilities.dp(9.0f));
                int dp14 = (int) (!LocaleController.isRTL ? this.q0.F.left + AndroidUtilities.dp(9.0f) : this.q0.F.right - AndroidUtilities.dp(9.0f));
                this.j0.setBounds(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
                this.j0.b(this.h0);
                if (this.U1.updateThumbShaderMatrix()) {
                    this.k0.setShader(null);
                    if (this.U1.getBitmap() != null && !this.U1.getBitmap().isRecycled()) {
                        this.k0.setColor(AndroidUtilities.getDominantColor(this.U1.getBitmap()));
                    } else if (this.U1.getDrawable() instanceof w51) {
                        this.k0.setColor(((w51) this.U1.getDrawable()).a.a());
                    } else {
                        this.k0.setColor(this.W1.c());
                    }
                } else {
                    ImageReceiver imageReceiver = this.U1;
                    BitmapShader bitmapShader = imageReceiver.thumbShader;
                    if (bitmapShader != null) {
                        this.k0.setShader(bitmapShader);
                    } else {
                        BitmapShader bitmapShader2 = imageReceiver.staticThumbShader;
                        if (bitmapShader2 != null) {
                            this.k0.setShader(bitmapShader2);
                        }
                    }
                }
                canvas.save();
                float f18 = (1.0f - this.e0) * this.i0;
                j3Var = this.m2;
                if (j3Var != null) {
                    f18 *= 1.0f - j3Var.getProgress();
                }
                float f19 = dp14;
                float f20 = imageY22;
                canvas.scale(f18, f18, f19, f20);
                canvas.drawCircle(f19, f20, AndroidUtilities.dpf2(11.0f), this.k0);
                canvas.drawCircle(f19, f20, AndroidUtilities.dpf2(11.0f), this.l0);
                canvas.save();
                canvas.translate(f19 - AndroidUtilities.dpf2(11.0f), f20 - AndroidUtilities.dpf2(11.0f));
                this.j0.draw(canvas);
                canvas.restore();
                canvas.restore();
            }
            int i17 = this.h0;
            c11 c11Var2 = new c11(ApplicationLoader.applicationContext, null);
            c11Var2.m = true;
            c11Var2.b(i17);
            this.j0 = c11Var2;
            if (this.k0 == null) {
            }
            int imageY222 = (int) (this.U1.getImageY2() - AndroidUtilities.dp(9.0f));
            int dp142 = (int) (!LocaleController.isRTL ? this.q0.F.left + AndroidUtilities.dp(9.0f) : this.q0.F.right - AndroidUtilities.dp(9.0f));
            this.j0.setBounds(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.j0.b(this.h0);
            if (this.U1.updateThumbShaderMatrix()) {
            }
            canvas.save();
            float f182 = (1.0f - this.e0) * this.i0;
            j3Var = this.m2;
            if (j3Var != null) {
            }
            float f192 = dp142;
            float f202 = imageY222;
            canvas.scale(f182, f182, f192, f202);
            canvas.drawCircle(f192, f202, AndroidUtilities.dpf2(11.0f), this.k0);
            canvas.drawCircle(f192, f202, AndroidUtilities.dpf2(11.0f), this.l0);
            canvas.save();
            canvas.translate(f192 - AndroidUtilities.dpf2(11.0f), f202 - AndroidUtilities.dpf2(11.0f));
            this.j0.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
        TLRPC.User user = this.b2;
        if (user == null || MessagesController.isSupportUser(user) || this.b2.bot) {
            TLRPC.Chat chat2 = this.c2;
            if (chat2 != null) {
                boolean z14 = chat2.call_active && chat2.call_not_empty;
                this.r2 = z14;
                if ((z14 || this.m1 != 0.0f) && this.e0 < 1.0f) {
                    lh.j3 j3Var3 = this.m2;
                    float progress2 = (j3Var3 == null || !j3Var3.a.q) ? 1.0f : 1.0f - j3Var3.getProgress();
                    int dp15 = (int) (this.q0.F.bottom - AndroidUtilities.dp((this.n2 || SharedConfig.useThreeLinesLayout) ? 6.0f : 8.0f));
                    if (LocaleController.isRTL) {
                        float f21 = this.q0.F.left;
                        f10 = 0.10666667f;
                        if (!this.n2 && !SharedConfig.useThreeLinesLayout) {
                            f17 = 6.0f;
                        }
                        dp = (int) (f21 + AndroidUtilities.dp(f17));
                    } else {
                        f10 = 0.10666667f;
                        float f22 = this.q0.F.right;
                        if (!this.n2 && !SharedConfig.useThreeLinesLayout) {
                            f17 = 6.0f;
                        }
                        dp = (int) (f22 - AndroidUtilities.dp(f17));
                    }
                    if (this.e0 != 0.0f) {
                        canvas.save();
                        float f23 = 1.0f - this.e0;
                        canvas.scale(f23, f23, dp, dp15);
                    }
                    Paint paint2 = org.telegram.ui.ActionBar.g6.t0;
                    int i18 = org.telegram.ui.ActionBar.g6.d6;
                    paint2.setColor(org.telegram.ui.ActionBar.g6.v0(i18, this.B4));
                    float f24 = dp;
                    float f25 = dp15;
                    canvas.drawCircle(f24, f25, AndroidUtilities.dp(11.0f) * this.m1 * progress2, org.telegram.ui.ActionBar.g6.t0);
                    org.telegram.ui.ActionBar.g6.t0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.T8, this.B4));
                    canvas.drawCircle(f24, f25, AndroidUtilities.dp(9.0f) * this.m1 * progress2, org.telegram.ui.ActionBar.g6.t0);
                    org.telegram.ui.ActionBar.g6.t0.setColor(org.telegram.ui.ActionBar.g6.v0(i18, this.B4));
                    if (!LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                        this.n1 = 0.65f;
                    }
                    int i19 = this.o1;
                    if (i19 != 0) {
                        i10 = LiteMode.FLAGS_CHAT;
                        if (i19 != 1) {
                            if (i19 != 2) {
                                if (i19 == 3) {
                                    dp2 = AndroidUtilities.dp(3.0f) - (AndroidUtilities.dp(2.0f) * this.n1);
                                    dp3 = AndroidUtilities.dp(1.0f);
                                    dp4 = AndroidUtilities.dp(2.0f);
                                    f11 = this.n1;
                                } else if (i19 == 4) {
                                    dp2 = (AndroidUtilities.dp(4.0f) * this.n1) + AndroidUtilities.dp(1.0f);
                                    dp10 = AndroidUtilities.dp(3.0f);
                                    dp11 = AndroidUtilities.dp(2.0f);
                                    f14 = this.n1;
                                } else if (i19 == 5) {
                                    dp5 = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.n1);
                                    dp8 = AndroidUtilities.dp(1.0f);
                                    dp9 = AndroidUtilities.dp(4.0f);
                                    f13 = this.n1;
                                } else if (i19 == 6) {
                                    dp5 = AndroidUtilities.dp(1.0f) + (AndroidUtilities.dp(4.0f) * this.n1);
                                    dp6 = AndroidUtilities.dp(5.0f);
                                    dp7 = AndroidUtilities.dp(4.0f);
                                    f12 = this.n1;
                                } else {
                                    dp2 = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.n1);
                                    dp3 = AndroidUtilities.dp(1.0f);
                                    dp4 = AndroidUtilities.dp(2.0f);
                                    f11 = this.n1;
                                }
                                f15 = dp3 + (dp4 * f11);
                                if (this.m1 >= 1.0f || progress2 < 1.0f) {
                                    canvas.save();
                                    float f26 = this.m1 * progress2;
                                    canvas.scale(f26, f26, f24, f25);
                                }
                                this.j4.set(dp - AndroidUtilities.dp(1.0f), f25 - dp2, AndroidUtilities.dp(1.0f) + dp, dp2 + f25);
                                canvas.drawRoundRect(this.j4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.t0);
                                float f27 = f25 - f15;
                                float f28 = f25 + f15;
                                this.j4.set(dp - AndroidUtilities.dp(5.0f), f27, dp - AndroidUtilities.dp(3.0f), f28);
                                canvas.drawRoundRect(this.j4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.t0);
                                this.j4.set(AndroidUtilities.dp(3.0f) + dp, f27, AndroidUtilities.dp(5.0f) + dp, f28);
                                canvas.drawRoundRect(this.j4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.t0);
                                if (this.m1 >= 1.0f || progress2 < 1.0f) {
                                    canvas.restore();
                                }
                                if (LiteMode.isEnabled(i10)) {
                                    float f29 = this.n1 + 0.04f;
                                    this.n1 = f29;
                                    if (f29 >= 1.0f) {
                                        this.n1 = 0.0f;
                                        int i20 = this.o1 + 1;
                                        this.o1 = i20;
                                        if (i20 >= 8) {
                                            this.o1 = 0;
                                        }
                                    }
                                    z12 = true;
                                }
                                if (this.r2) {
                                    float f30 = this.m1;
                                    if (f30 > 0.0f) {
                                        float f31 = f30 - f10;
                                        this.m1 = f31;
                                        if (f31 < 0.0f) {
                                            this.m1 = 0.0f;
                                        }
                                    }
                                } else {
                                    float f32 = this.m1;
                                    if (f32 < 1.0f) {
                                        float f33 = f32 + f10;
                                        this.m1 = f33;
                                        if (f33 > 1.0f) {
                                            this.m1 = 1.0f;
                                        }
                                    }
                                }
                                if (this.e0 != 0.0f) {
                                    canvas.restore();
                                }
                                if (this.s2) {
                                    float f34 = this.i0;
                                    if (f34 < 1.0f) {
                                        this.i0 = f34 + f10;
                                        z11 = true;
                                    }
                                    z11 = z12;
                                } else {
                                    float f35 = this.i0;
                                    if (f35 > 0.0f) {
                                        this.i0 = f35 - f10;
                                        z11 = true;
                                    }
                                    z11 = z12;
                                }
                                this.i0 = Utilities.clamp(this.i0, 1.0f, 0.0f);
                                return z11;
                            }
                            dp5 = AndroidUtilities.dp(1.0f) + (AndroidUtilities.dp(2.0f) * this.n1);
                            dp6 = AndroidUtilities.dp(5.0f);
                            dp7 = AndroidUtilities.dp(4.0f);
                            f12 = this.n1;
                            f16 = dp6 - (dp7 * f12);
                            dp2 = dp5;
                            f15 = f16;
                            if (this.m1 >= 1.0f) {
                            }
                            canvas.save();
                            float f262 = this.m1 * progress2;
                            canvas.scale(f262, f262, f24, f25);
                            this.j4.set(dp - AndroidUtilities.dp(1.0f), f25 - dp2, AndroidUtilities.dp(1.0f) + dp, dp2 + f25);
                            canvas.drawRoundRect(this.j4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.t0);
                            float f272 = f25 - f15;
                            float f282 = f25 + f15;
                            this.j4.set(dp - AndroidUtilities.dp(5.0f), f272, dp - AndroidUtilities.dp(3.0f), f282);
                            canvas.drawRoundRect(this.j4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.t0);
                            this.j4.set(AndroidUtilities.dp(3.0f) + dp, f272, AndroidUtilities.dp(5.0f) + dp, f282);
                            canvas.drawRoundRect(this.j4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.t0);
                            if (this.m1 >= 1.0f) {
                            }
                            canvas.restore();
                            if (LiteMode.isEnabled(i10)) {
                            }
                            if (this.r2) {
                            }
                            if (this.e0 != 0.0f) {
                            }
                            if (this.s2) {
                            }
                            this.i0 = Utilities.clamp(this.i0, 1.0f, 0.0f);
                            return z11;
                        }
                        dp5 = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.n1);
                        dp8 = AndroidUtilities.dp(1.0f);
                        dp9 = AndroidUtilities.dp(4.0f);
                        f13 = this.n1;
                        f16 = dp8 + (dp9 * f13);
                        dp2 = dp5;
                        f15 = f16;
                        if (this.m1 >= 1.0f) {
                        }
                        canvas.save();
                        float f2622 = this.m1 * progress2;
                        canvas.scale(f2622, f2622, f24, f25);
                        this.j4.set(dp - AndroidUtilities.dp(1.0f), f25 - dp2, AndroidUtilities.dp(1.0f) + dp, dp2 + f25);
                        canvas.drawRoundRect(this.j4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.t0);
                        float f2722 = f25 - f15;
                        float f2822 = f25 + f15;
                        this.j4.set(dp - AndroidUtilities.dp(5.0f), f2722, dp - AndroidUtilities.dp(3.0f), f2822);
                        canvas.drawRoundRect(this.j4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.t0);
                        this.j4.set(AndroidUtilities.dp(3.0f) + dp, f2722, AndroidUtilities.dp(5.0f) + dp, f2822);
                        canvas.drawRoundRect(this.j4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.t0);
                        if (this.m1 >= 1.0f) {
                        }
                        canvas.restore();
                        if (LiteMode.isEnabled(i10)) {
                        }
                        if (this.r2) {
                        }
                        if (this.e0 != 0.0f) {
                        }
                        if (this.s2) {
                        }
                        this.i0 = Utilities.clamp(this.i0, 1.0f, 0.0f);
                        return z11;
                    }
                    float dp16 = AndroidUtilities.dp(1.0f);
                    float dp17 = AndroidUtilities.dp(4.0f);
                    i10 = LiteMode.FLAGS_CHAT;
                    dp2 = (dp17 * this.n1) + dp16;
                    dp10 = AndroidUtilities.dp(3.0f);
                    dp11 = AndroidUtilities.dp(2.0f);
                    f14 = this.n1;
                    f15 = dp10 - (dp11 * f14);
                    if (this.m1 >= 1.0f) {
                    }
                    canvas.save();
                    float f26222 = this.m1 * progress2;
                    canvas.scale(f26222, f26222, f24, f25);
                    this.j4.set(dp - AndroidUtilities.dp(1.0f), f25 - dp2, AndroidUtilities.dp(1.0f) + dp, dp2 + f25);
                    canvas.drawRoundRect(this.j4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.t0);
                    float f27222 = f25 - f15;
                    float f28222 = f25 + f15;
                    this.j4.set(dp - AndroidUtilities.dp(5.0f), f27222, dp - AndroidUtilities.dp(3.0f), f28222);
                    canvas.drawRoundRect(this.j4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.t0);
                    this.j4.set(AndroidUtilities.dp(3.0f) + dp, f27222, AndroidUtilities.dp(5.0f) + dp, f28222);
                    canvas.drawRoundRect(this.j4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.t0);
                    if (this.m1 >= 1.0f) {
                    }
                    canvas.restore();
                    if (LiteMode.isEnabled(i10)) {
                    }
                    if (this.r2) {
                    }
                    if (this.e0 != 0.0f) {
                    }
                    if (this.s2) {
                    }
                    this.i0 = Utilities.clamp(this.i0, 1.0f, 0.0f);
                    return z11;
                }
            }
        } else {
            boolean R = R();
            this.x0 = R;
            if (R || this.l1 != 0.0f) {
                int dp18 = (int) (this.q0.F.bottom - AndroidUtilities.dp((this.n2 || SharedConfig.useThreeLinesLayout) ? 6.0f : 8.0f));
                if (LocaleController.isRTL) {
                    float f36 = this.q0.F.left;
                    if (!this.n2 && !SharedConfig.useThreeLinesLayout) {
                        f17 = 6.0f;
                    }
                    dp12 = f36 + AndroidUtilities.dp(f17);
                } else {
                    float f37 = this.q0.F.right;
                    if (!this.n2 && !SharedConfig.useThreeLinesLayout) {
                        f17 = 6.0f;
                    }
                    dp12 = f37 - AndroidUtilities.dp(f17);
                }
                int i21 = (int) dp12;
                org.telegram.ui.ActionBar.g6.t0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, this.B4));
                float f38 = i21;
                float f39 = dp18;
                canvas.drawCircle(f38, f39, AndroidUtilities.dp(7.0f) * this.l1, org.telegram.ui.ActionBar.g6.t0);
                org.telegram.ui.ActionBar.g6.t0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.T8, this.B4));
                canvas.drawCircle(f38, f39, AndroidUtilities.dp(5.0f) * this.l1, org.telegram.ui.ActionBar.g6.t0);
                if (R) {
                    float f40 = this.l1;
                    if (f40 < 1.0f) {
                        float f41 = f40 + 0.10666667f;
                        this.l1 = f41;
                        if (f41 > 1.0f) {
                            this.l1 = 1.0f;
                        }
                        z12 = true;
                    }
                } else {
                    float f42 = this.l1;
                    if (f42 > 0.0f) {
                        float f43 = f42 - 0.10666667f;
                        this.l1 = f43;
                        if (f43 < 0.0f) {
                            this.l1 = 0.0f;
                        }
                        z12 = true;
                    }
                }
            }
        }
        f10 = 0.10666667f;
        if (this.s2) {
        }
        this.i0 = Utilities.clamp(this.i0, 1.0f, 0.0f);
        return z11;
    }

    public final void D(Canvas canvas, boolean z10, boolean z11, boolean z12, boolean z13, float f10) {
        if (f10 != 0.0f || z13) {
            float f11 = (f10 * 0.5f) + 0.5f;
            if (z10) {
                a0.p(this.R2, this.S2, org.telegram.ui.ActionBar.g6.X0);
                if (f10 != 1.0f) {
                    canvas.save();
                    canvas.scale(f11, f11, org.telegram.ui.ActionBar.g6.X0.getBounds().centerX(), org.telegram.ui.ActionBar.g6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.g6.X0.setAlpha((int) (f10 * 255.0f));
                }
                org.telegram.ui.ActionBar.g6.X0.draw(canvas);
                if (f10 != 1.0f) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.g6.X0.setAlpha(255);
                }
                invalidate();
                return;
            }
            if (z12) {
                if (!z11) {
                    a0.p(this.Q2, this.S2, org.telegram.ui.ActionBar.g6.T0);
                    if (f10 != 1.0f) {
                        canvas.save();
                        canvas.scale(f11, f11, org.telegram.ui.ActionBar.g6.T0.getBounds().centerX(), org.telegram.ui.ActionBar.g6.W0.getBounds().centerY());
                        org.telegram.ui.ActionBar.g6.T0.setAlpha((int) (f10 * 255.0f));
                    }
                    org.telegram.ui.ActionBar.g6.T0.draw(canvas);
                    if (f10 != 1.0f) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.g6.T0.setAlpha(255);
                        return;
                    }
                    return;
                }
                a0.p(this.T2, this.S2, org.telegram.ui.ActionBar.g6.W0);
                if (z13) {
                    canvas.save();
                    canvas.scale(f11, f11, org.telegram.ui.ActionBar.g6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.g6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.g6.W0.setAlpha((int) (f10 * 255.0f));
                }
                if (!z13 && f10 != 0.0f) {
                    canvas.save();
                    canvas.scale(f11, f11, org.telegram.ui.ActionBar.g6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.g6.W0.getBounds().centerY());
                    int i10 = (int) (255.0f * f10);
                    org.telegram.ui.ActionBar.g6.W0.setAlpha(i10);
                    org.telegram.ui.ActionBar.g6.V0.setAlpha(i10);
                }
                org.telegram.ui.ActionBar.g6.W0.draw(canvas);
                if (z13) {
                    canvas.restore();
                    canvas.save();
                    canvas.translate((1.0f - f10) * AndroidUtilities.dp(4.0f), 0.0f);
                }
                a0.p(this.P2, this.S2, org.telegram.ui.ActionBar.g6.V0);
                org.telegram.ui.ActionBar.g6.V0.draw(canvas);
                if (z13) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.g6.W0.setAlpha(255);
                }
                if (z13 || f10 == 0.0f) {
                    return;
                }
                canvas.restore();
                org.telegram.ui.ActionBar.g6.W0.setAlpha(255);
                org.telegram.ui.ActionBar.g6.V0.setAlpha(255);
            }
        }
    }

    public final void E(Canvas canvas, boolean z10, int i10, int i11, int i12, float f10, boolean z11) {
        float f11;
        Paint paint;
        boolean z12;
        RectF rectF;
        RectF rectF2;
        boolean z13 = Q() || P();
        if (!(this.C3 && this.D3) && this.N3 == 1.0f) {
            return;
        }
        float f12 = (this.O0 != 0 || this.P0) ? this.N3 : 1.0f - this.N3;
        int i13 = 255;
        if (z11) {
            if (this.P == null) {
                Paint paint2 = new Paint();
                this.P = paint2;
                paint2.setStyle(Paint.Style.STROKE);
                this.P.setStrokeWidth(AndroidUtilities.dp(2.0f));
                this.P.setStrokeJoin(Paint.Join.ROUND);
                this.P.setStrokeCap(Paint.Cap.ROUND);
            }
            f11 = 1.0f;
            this.P.setColor(i0.b.d(Color.alpha(r14) / 255.0f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false), i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.s9, false), 255)));
        } else {
            f11 = 1.0f;
        }
        if (this.L && this.J.read_inbox_max_id == 0) {
            if (this.O == null) {
                this.O = new Paint();
            }
            paint = this.O;
            int v02 = org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.ek : org.telegram.ui.ActionBar.g6.dk, this.B4);
            paint.setColor(v02);
            org.telegram.ui.ActionBar.g6.M0.setColor(v02);
            i13 = z10 ? 30 : 40;
            z12 = true;
        } else {
            paint = (z10 || this.F0 != 0) ? org.telegram.ui.ActionBar.g6.y0 : org.telegram.ui.ActionBar.g6.w0;
            z12 = false;
        }
        StaticLayout staticLayout = this.Q3;
        RectF rectF3 = this.j4;
        if (staticLayout == null || this.O0 == 0) {
            if (this.O0 != 0) {
                staticLayout = this.P3;
            }
            paint.setAlpha((int) ((f11 - this.t3) * i13));
            org.telegram.ui.ActionBar.g6.M0.setAlpha((int) ((f11 - this.t3) * 255.0f));
            float f13 = i10;
            rectF3.set(i11, f13, AndroidUtilities.dp(12.666f) + this.G3 + i11, AndroidUtilities.dp(20.666f) + i10);
            int save = canvas.save();
            if (f10 != f11) {
                canvas.scale(f10, f10, rectF3.centerX(), rectF3.centerY());
            }
            if (f12 != f11) {
                canvas.scale(f12, f12, rectF3.centerX(), rectF3.centerY());
            }
            if (z13) {
                if (this.l4 == null || (rectF = this.m4) == null || !rectF.equals(rectF3)) {
                    RectF rectF4 = this.m4;
                    if (rectF4 == null) {
                        this.m4 = new RectF(rectF3);
                    } else {
                        rectF4.set(rectF3);
                    }
                    if (this.l4 == null) {
                        this.l4 = new Path();
                    }
                    h7.x5.a(this.l4, this.m4, AndroidUtilities.dp(10.33f));
                }
                canvas.drawPath(this.l4, paint);
                if (z11) {
                    canvas.drawPath(this.l4, this.P);
                }
            } else {
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), paint);
                if (z11) {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), this.P);
                }
            }
            if (staticLayout != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(6.333f) + i11, AndroidUtilities.dpf2(3.0f) + f13);
                staticLayout.draw(canvas);
                canvas.restore();
            }
            canvas.restoreToCount(save);
        } else {
            paint.setAlpha((int) ((f11 - this.t3) * i13));
            org.telegram.ui.ActionBar.g6.M0.setAlpha((int) ((f11 - this.t3) * 255.0f));
            float f14 = f12 * 2.0f;
            float f15 = f14 > f11 ? 1.0f : f14;
            float f16 = f11 - f15;
            float f17 = (i12 * f16) + (i11 * f15);
            float f18 = i10;
            rectF3.set(f17, f18, (this.H3 * f16) + (this.G3 * f15) + f17 + AndroidUtilities.dp(12.666f), AndroidUtilities.dp(20.666f) + i10);
            float interpolation = ((f12 <= 0.5f ? er.g.getInterpolation(f14) : er.i.getInterpolation(f11 - ((f12 - 0.5f) * 2.0f))) * 0.1f) + f11;
            canvas.save();
            float f19 = interpolation * f10;
            canvas.scale(f19, f19, rectF3.centerX(), rectF3.centerY());
            if (z13) {
                if (this.l4 == null || (rectF2 = this.m4) == null || !rectF2.equals(rectF3)) {
                    RectF rectF5 = this.m4;
                    if (rectF5 == null) {
                        this.m4 = new RectF(rectF3);
                    } else {
                        rectF5.set(rectF3);
                    }
                    if (this.l4 == null) {
                        this.l4 = new Path();
                    }
                    h7.x5.a(this.l4, this.m4, AndroidUtilities.dp(10.33f));
                }
                canvas.drawPath(this.l4, paint);
                if (z11) {
                    canvas.drawPath(this.l4, this.P);
                }
            } else {
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), paint);
                if (z11) {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), this.P);
                }
            }
            if (this.R3 != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f17, AndroidUtilities.dpf2(3.0f) + f18);
                this.R3.draw(canvas);
                canvas.restore();
            }
            int alpha = org.telegram.ui.ActionBar.g6.M0.getAlpha();
            float f20 = alpha;
            org.telegram.ui.ActionBar.g6.M0.setAlpha((int) (f20 * f15));
            if (this.S3 != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f17, AndroidUtilities.dpf2(3.0f) + ((this.J3 ? AndroidUtilities.dp(17.0f) : -AndroidUtilities.dp(17.0f)) * f16) + f18);
                this.S3.draw(canvas);
                canvas.restore();
            } else if (this.P3 != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f17, AndroidUtilities.dpf2(3.0f) + ((this.J3 ? AndroidUtilities.dp(17.0f) : -AndroidUtilities.dp(17.0f)) * f16) + f18);
                this.P3.draw(canvas);
                canvas.restore();
            }
            if (this.Q3 != null) {
                org.telegram.ui.ActionBar.g6.M0.setAlpha((int) (f20 * f16));
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f17, AndroidUtilities.dpf2(3.0f) + ((this.J3 ? -AndroidUtilities.dp(17.0f) : AndroidUtilities.dp(17.0f)) * f15) + f18);
                this.Q3.draw(canvas);
                canvas.restore();
            }
            org.telegram.ui.ActionBar.g6.M0.setAlpha(alpha);
            canvas.restore();
        }
        if (z12) {
            org.telegram.ui.ActionBar.g6.M0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.W8, false));
        }
    }

    public boolean F() {
        return false;
    }

    public final CharSequence G() {
        TLRPC.User user;
        String string;
        int i10 = this.B0;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList<TLRPC.Dialog> dialogs = messagesController.getDialogs(this.F0);
        this.I0 = dialogs.size();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = dialogs.size();
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.Dialog dialog = dialogs.get(i11);
            if (!messagesController.isHiddenByUndo(dialog.id)) {
                TLRPC.Chat chat = null;
                if (DialogObject.isEncryptedDialog(dialog.id)) {
                    TLRPC.EncryptedChat n10 = org.telegram.messenger.y1.n(messagesController, dialog.id);
                    user = n10 != null ? messagesController.getUser(Long.valueOf(n10.user_id)) : null;
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
                    spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold(), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Y8, this.B4)), length, length2, 33);
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
        return Emoji.replaceEmoji(spannableStringBuilder, org.telegram.ui.ActionBar.g6.F0[this.A0].getFontMetricsInt(), false);
    }

    public final CharSequence H() {
        TLRPC.User user;
        String string;
        MessagesController messagesController = MessagesController.getInstance(this.B0);
        ArrayList<TLRPC.Dialog> dialogsByCommunity = messagesController.getDialogsByCommunity(-this.D0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = dialogsByCommunity.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.Dialog dialog = dialogsByCommunity.get(i10);
            if (!messagesController.isHiddenByUndo(dialog.id)) {
                TLRPC.Chat chat = null;
                if (DialogObject.isEncryptedDialog(dialog.id)) {
                    TLRPC.EncryptedChat n10 = org.telegram.messenger.y1.n(messagesController, dialog.id);
                    user = n10 != null ? messagesController.getUser(Long.valueOf(n10.user_id)) : null;
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
                    spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold(), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Y8, this.B4)), length, length2, 33);
                }
                if (spannableStringBuilder.length() > 150) {
                    break;
                }
            }
        }
        return Emoji.replaceEmoji(spannableStringBuilder, org.telegram.ui.ActionBar.g6.F0[this.A0].getFontMetricsInt(), false);
    }

    public final CharSequence J() {
        if (this.F4 == null) {
            this.F4 = new o2(this);
        }
        o2.a(this.F4, this.B0, this.b1, this.c2);
        this.F4.getClass();
        o2 o2Var = this.F4;
        this.E4 = o2Var.c;
        this.b0 = o2Var.d;
        return o2Var.g;
    }

    public final ColorFilter K(int i10, int i11) {
        if (this.P4 == null) {
            this.Q4 = new int[4];
            this.P4 = new ColorFilter[4];
        }
        if (i11 != this.Q4[i10] || this.P4[i10] == null) {
            ColorFilter[] colorFilterArr = this.P4;
            this.Q4[i10] = i11;
            colorFilterArr[i10] = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
        }
        return this.P4[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.view.View, org.telegram.ui.Cells.p2] */
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
        MessageObject messageObject = this.b1;
        CharSequence charSequence4 = messageObject != null ? messageObject.messageText : null;
        this.a0 = true;
        if (!TextUtils.isEmpty(str)) {
            return I(str, charSequence, i10);
        }
        MessageObject messageObject2 = this.b1;
        TLRPC.Message message2 = messageObject2.messageOwner;
        if (message2 instanceof TLRPC.TL_messageService) {
            CharSequence charSequence5 = messageObject2.messageTextShort;
            if (charSequence5 == null || ((message2.action instanceof TLRPC.TL_messageActionTopicCreate) && this.L)) {
                charSequence5 = messageObject2.messageText;
            }
            if (MessageObject.isTopicActionMessage(messageObject2)) {
                valueOf = I(charSequence5, charSequence, i10);
                if (this.b1.topicIconDrawable[0] instanceof wf.a) {
                    int i11 = this.B0;
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i11).getTopicsController().findTopic(-this.b1.getDialogId(), MessageObject.getTopicId(i11, this.b1.messageOwner, true));
                    if (findTopic != null) {
                        ((wf.a) this.b1.topicIconDrawable[0]).b(findTopic.icon_color);
                    }
                }
            } else {
                this.a0 = false;
                valueOf = SpannableStringBuilder.valueOf(charSequence5);
            }
            if (z10) {
                t(valueOf);
            }
            return valueOf;
        }
        if (captionMessage != null && (charSequence3 = captionMessage.caption) != null) {
            String charSequence6 = charSequence3.toString();
            String str2 = !this.R ? "" : captionMessage.isVideo() ? "📹 " : captionMessage.isVoice() ? "🎤 " : captionMessage.isMusic() ? "🎧 " : captionMessage.isPhoto() ? "🖼 " : "📎 ";
            if (captionMessage.hasHighlightedWords() && !TextUtils.isEmpty(captionMessage.messageOwner.message)) {
                CharSequence charSequence7 = captionMessage.messageTrimmedToHighlight;
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.E + 47);
                if (this.S) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth = (int) (measuredWidth - this.T.measureText(charSequence.toString()));
                    }
                    measuredWidth = (int) (measuredWidth - this.T.measureText(": "));
                }
                if (measuredWidth > 0 && captionMessage.messageTrimmedToHighlightCut) {
                    charSequence7 = AndroidUtilities.ellipsizeCenterEnd(charSequence7, captionMessage.highlightedWords.get(0), measuredWidth, this.T, 130);
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
                TextPaint textPaint = this.T;
                MediaDataController.addAnimatedEmojiSpans(arrayList, spannableString, textPaint != null ? textPaint.getFontMetricsInt() : null);
            }
            CharSequence append = new SpannableStringBuilder(str2).append(AndroidUtilities.replaceNewLines(spannableString));
            if (z10) {
                append = t(append);
            }
            return I(append, charSequence, i10);
        }
        TL_iv.RichMessage richMessage = message2.rich_message;
        org.telegram.ui.ActionBar.c6 c6Var = this.B4;
        if (richMessage != null) {
            boolean isBlueBlock = richMessage.blocks.size() == 1 ? MessageObject.isBlueBlock(this.b1.messageOwner.rich_message.blocks.get(0)) : false;
            SpannableStringBuilder I = I(this.b1.messageText, charSequence, i10);
            if (isBlueBlock && !Q()) {
                try {
                    I.setSpan(new s00(org.telegram.ui.ActionBar.g6.p9, c6Var), this.S ? charSequence.length() + 2 : 0, I.length(), 33);
                    return I;
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
            return I;
        }
        if (message2.media == null || messageObject2.isMediaEmpty()) {
            MessageObject messageObject3 = this.b1;
            String str3 = messageObject3.messageOwner.message;
            if (str3 == null) {
                return new SpannableStringBuilder();
            }
            if (messageObject3.hasHighlightedWords()) {
                CharSequence charSequence9 = this.b1.messageTrimmedToHighlight;
                replaceNewLines = str3;
                if (charSequence9 != null) {
                    replaceNewLines = charSequence9;
                }
                int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(this.E + 33);
                if (this.S) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth2 = (int) (measuredWidth2 - this.T.measureText(charSequence.toString()));
                    }
                    measuredWidth2 = (int) (measuredWidth2 - this.T.measureText(": "));
                }
                if (measuredWidth2 > 0) {
                    replaceNewLines = AndroidUtilities.ellipsizeCenterEnd(replaceNewLines, this.b1.highlightedWords.get(0), measuredWidth2, this.T, 130);
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
            MessageObject messageObject4 = this.b1;
            if (messageObject4 != null) {
                messageObject4.spoilLoginCode();
            }
            MediaDataController.addTextStyleRuns(this.b1, (Spannable) spannableString2, 264);
            MessageObject messageObject5 = this.b1;
            if (messageObject5 != null && (message = messageObject5.messageOwner) != null) {
                ArrayList<TLRPC.MessageEntity> arrayList2 = message.entities;
                TextPaint textPaint2 = this.T;
                MediaDataController.addAnimatedEmojiSpans(arrayList2, spannableString2, textPaint2 != null ? textPaint2.getFontMetricsInt() : null);
            }
            if (z10) {
                spannableString2 = t(spannableString2);
            }
            return I(spannableString2, charSequence, i10);
        }
        this.T = org.telegram.ui.ActionBar.g6.H0[this.A0];
        int i12 = org.telegram.ui.ActionBar.g6.o9;
        MessageObject messageObject6 = this.b1;
        TLRPC.MessageMedia messageMedia = messageObject6.messageOwner.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
            TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
            if (tL_textWithEntities == null || tL_textWithEntities.entities == null) {
                charSequence2 = vg.a.a(R.drawable.dialog_media_poll_20, tL_textWithEntities.text, true);
            } else {
                SpannableString spannableString3 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString3);
                MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString3, org.telegram.ui.ActionBar.g6.F0[this.A0].getFontMetricsInt());
                charSequence2 = vg.a.a(R.drawable.dialog_media_poll_20, spannableString3, true);
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
            if (tL_textWithEntities3 == null || tL_textWithEntities3.entities == null) {
                charSequence2 = vg.a.a(R.drawable.dialog_media_checklist_20, tL_textWithEntities3.text, true);
            } else {
                SpannableString spannableString4 = new SpannableString(tL_messageMediaToDo.todo.title.text.replace('\n', ' '));
                TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                MediaDataController.addTextStyleRuns(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString4);
                MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString4, org.telegram.ui.ActionBar.g6.F0[this.A0].getFontMetricsInt());
                charSequence2 = vg.a.a(R.drawable.dialog_media_checklist_20, spannableString4, true);
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
            charSequence2 = vg.a.a(R.drawable.dialog_media_game_20, messageMedia.game.title, true);
        } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
            charSequence2 = messageMedia.title;
        } else if (messageObject6.type == 14) {
            charSequence2 = pa.j("🎧 \u2068", messageObject6.getMusicAuthor(), " - ", this.b1.getMusicTitle(), "\u2069");
        } else if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia).extended_media.size();
            charSequence2 = hh.oa.Q0(LocaleController.formatString(R.string.AttachPaidMedia, this.O1 ? size > 1 ? LocaleController.formatPluralString("Media", size, new Object[0]) : LocaleController.getString(R.string.AttachVideo) : size > 1 ? LocaleController.formatPluralString("Photos", size, new Object[0]) : LocaleController.getString(R.string.AttachPhoto)));
            i12 = org.telegram.ui.ActionBar.g6.p9;
        } else if (this.N1 > 1) {
            if (this.O1) {
                ArrayList arrayList3 = this.c1;
                formatPluralString = LocaleController.formatPluralString("Media", arrayList3 == null ? 0 : arrayList3.size(), new Object[0]);
            } else {
                ArrayList arrayList4 = this.c1;
                formatPluralString = LocaleController.formatPluralString("Photos", arrayList4 == null ? 0 : arrayList4.size(), new Object[0]);
            }
            charSequence2 = formatPluralString;
            i12 = org.telegram.ui.ActionBar.g6.p9;
        } else {
            charSequence2 = charSequence4.toString();
            i12 = org.telegram.ui.ActionBar.g6.p9;
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
                I2.setSpan(new s00(i12, c6Var), this.S ? charSequence.length() + 2 : 0, I2.length(), 33);
                return I2;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return I2;
    }

    public final boolean M() {
        wr wrVar = this.p0;
        return (wrVar == null || wrVar.c.isEmpty()) ? false : true;
    }

    public final boolean N() {
        if (ChatObject.isCommunity(this.c2)) {
            return !this.a1;
        }
        if (this.L) {
            return this.W0;
        }
        TLRPC.Chat chat = this.c2;
        return (chat != null && chat.forum && this.J == null) ? !this.Z0 : this.V0;
    }

    public final boolean O() {
        return this.F0 > 0;
    }

    public final boolean P() {
        return this.F0 != 0;
    }

    public boolean Q() {
        TLRPC.Chat chat;
        if (O() || this.L0 || (chat = this.c2) == null) {
            return false;
        }
        return (chat.forum || (ChatObject.isMonoForum(chat) && ChatObject.canManageMonoForum(this.B0, this.c2))) && !this.L;
    }

    public final boolean R() {
        TLRPC.User user;
        if (Q() || this.q0.w || (user = this.b2) == null || user.self) {
            return false;
        }
        TLRPC.UserStatus userStatus = user.status;
        int i10 = this.B0;
        if (userStatus != null && userStatus.expires <= 0 && MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(this.b2.id))) {
            return true;
        }
        TLRPC.UserStatus userStatus2 = this.b2.status;
        return userStatus2 != null && userStatus2.expires > ConnectionsManager.getInstance(i10).getCurrentTime();
    }

    public final boolean S(float f10) {
        return !LocaleController.isRTL ? f10 >= 0.0f && f10 < ((float) AndroidUtilities.dp(60.0f)) : f10 >= ((float) (getMeasuredWidth() - AndroidUtilities.dp(60.0f))) && f10 < ((float) getMeasuredWidth());
    }

    public final void T(boolean z10, boolean z11) {
        if ((!getIsPinned() && z10) || this.u3 == z10) {
            if (getIsPinned()) {
                return;
            }
            this.u3 = false;
        } else {
            this.u3 = z10;
            if (z11) {
                this.t3 = z10 ? 0.0f : 1.0f;
            } else {
                this.t3 = z10 ? 1.0f : 0.0f;
            }
            invalidate();
        }
    }

    public final void U() {
        boolean z10 = SharedConfig.archiveHidden;
        this.i1 = z10;
        float f10 = z10 ? 0.0f : 1.0f;
        this.z1 = f10;
        this.W1.o = f10;
        this.p1 = 0.0f;
        this.t1 = false;
        this.t3 = (getIsPinned() && this.u3) ? 1.0f : 0.0f;
        this.s3 = true;
        this.k1 = 0.0f;
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        org.telegram.ui.Components.i5 i5Var = this.f4;
        if (i5Var != null && this.s3) {
            i5Var.a();
        }
        org.telegram.ui.Components.i5 i5Var2 = this.g4;
        if (i5Var2 == null || !this.s3) {
            return;
        }
        i5Var2.a();
    }

    public final void V(boolean z10, boolean z11) {
        lh.j3 j3Var = this.m2;
        if (j3Var != null || z10) {
            if (j3Var == null) {
                lh.j3 j3Var2 = new lh.j3(this, getContext(), this.B4, 1);
                this.m2 = j3Var2;
                j3Var2.b(-1, org.telegram.ui.ActionBar.g6.d6, org.telegram.ui.ActionBar.g6.k7);
                this.m2.setDrawUnchecked(false);
                this.m2.setDrawBackgroundAsArc(3);
                addView(this.m2);
            }
            this.m2.a(z10, z11);
            y();
        }
    }

    public final void W(long j10, MessageObject messageObject, int i10, boolean z10, boolean z11) {
        if (this.D0 != j10) {
            this.p4 = -1;
        }
        this.D0 = j10;
        this.t4 = System.currentTimeMillis();
        this.b1 = messageObject;
        this.q2 = z10;
        this.J0 = false;
        this.N0 = i10;
        if (messageObject != null) {
            int i11 = messageObject.messageOwner.edit_date;
        }
        this.O0 = 0;
        this.P0 = false;
        this.h1 = messageObject != null ? messageObject.getId() : 0;
        this.Q0 = 0;
        this.R0 = 0;
        this.S0 = 0;
        this.T0 = messageObject != null && messageObject.isUnread();
        MessageObject messageObject2 = this.b1;
        if (messageObject2 != null) {
            this.U0 = messageObject2.messageOwner.send_state;
        }
        b0(0, z11);
    }

    public final void X(TLRPC.Dialog dialog, int i10, int i11) {
        if (this.D0 != dialog.id) {
            ValueAnimator valueAnimator = this.s4;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.s4.cancel();
            }
            this.r4 = false;
            this.p4 = -1;
        }
        this.D0 = dialog.id;
        this.t4 = System.currentTimeMillis();
        this.J0 = true;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            this.G0 = dialog.community_id;
        } else {
            this.G0 = 0L;
        }
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            this.F0 = ((TLRPC.TL_dialogFolder) dialog).folder.id;
            wh0 wh0Var = this.a2;
            if (wh0Var != null) {
                wh0Var.H = this;
                wh0Var.i();
            }
        } else {
            this.F0 = 0;
        }
        this.f1 = i10;
        boolean z10 = i10 == 3;
        Runnable runnable = this.R4;
        if (z10 != (runnable != null)) {
            if (!z10 && runnable != null) {
                runnable.run();
                this.R4 = null;
            } else if (z10) {
                this.R4 = NotificationCenter.getInstance(this.B0).listen(this, NotificationCenter.userIsPremiumBlockedUpadted, new h2(this, 0));
            }
        }
        if (this.p0 == null) {
            this.p0 = new wr(this);
        }
        this.g1 = i11;
        this.h1 = 0;
        if (b0(0, false)) {
            requestLayout();
        }
        x();
        w();
        v();
        y();
    }

    public final void Y(TLRPC.TL_forumTopic tL_forumTopic, long j10, MessageObject messageObject, boolean z10, boolean z11) {
        wh0 wh0Var;
        this.J = tL_forumTopic;
        this.L = tL_forumTopic != null;
        if (this.D0 != j10) {
            this.p4 = -1;
        }
        Drawable drawable = messageObject.topicIconDrawable[0];
        if (drawable instanceof wf.a) {
            ((wf.a) drawable).b(tL_forumTopic.icon_color);
        }
        this.D0 = j10;
        this.t4 = System.currentTimeMillis();
        this.b1 = messageObject;
        this.J0 = false;
        this.c0 = z10;
        this.N0 = messageObject.messageOwner.date;
        this.P0 = false;
        this.h1 = messageObject.getId();
        this.T0 = messageObject.isUnread();
        MessageObject messageObject2 = this.b1;
        if (messageObject2 != null) {
            this.U0 = messageObject2.messageOwner.send_state;
        }
        if (!z11) {
            this.p4 = -1;
        }
        if (tL_forumTopic != null) {
            this.c1 = tL_forumTopic.groupedMessages;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.J;
        if (tL_forumTopic2 != null && tL_forumTopic2.id == 1 && (wh0Var = this.a2) != null) {
            wh0Var.H = this;
            wh0Var.i();
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
        if (photoSize == null || !DownloadController.getInstance(this.B0).canDownloadMedia(messageObject)) {
            photoSize = strippedPhotoSize;
        }
        if (strippedPhotoSize != null) {
            this.O1 = this.O1 || messageObject.isVideo() || messageObject.isRoundVideo();
            int i11 = this.N1;
            if (i11 < 3) {
                this.N1 = i11 + 1;
                this.S1[i10] = (messageObject.isVideo() || messageObject.isRoundVideo()) && !messageObject.hasMediaSpoilers();
                this.T1[i10] = messageObject.hasMediaSpoilers();
                int i12 = (messageObject.type != 1 || photoSize == null) ? 0 : photoSize.size;
                String str = messageObject.hasMediaSpoilers() ? "5_5_b" : "20_20";
                ImageReceiver[] imageReceiverArr = this.R1;
                String str2 = str;
                imageReceiverArr[i10].setImage(ImageLocation.getForObject(photoSize, tLObject), str2, ImageLocation.getForObject(strippedPhotoSize, tLObject), str2, i12, null, messageObject, 0);
                imageReceiverArr[i10].setRoundRadius(AndroidUtilities.dp(messageObject.isRoundVideo() ? 18.0f : 2.0f));
                this.R = false;
            }
        }
    }

    public final void a0() {
        wh0 wh0Var = this.a2;
        if (wh0Var != null) {
            if (this.L) {
                wh0Var.K = AndroidUtilities.dp(24.0f);
                this.a2.L = AndroidUtilities.dp(24.0f);
                this.a2.M = 0.0f;
            } else {
                i2 i2Var = this.q0;
                RectF rectF = i2Var.F;
                RectF rectF2 = i2Var.F;
                wh0Var.K = rectF.centerY();
                this.a2.L = rectF2.centerX();
                this.a2.M = rectF2.width() / 2.0f;
                if (!MessagesController.getInstance(this.B0).getStoriesController().h.isEmpty()) {
                    this.a2.M -= AndroidUtilities.dpf2(3.5f);
                }
                wh0 wh0Var2 = this.a2;
                this.U1.getBitmapWidth();
                wh0Var2.getClass();
            }
            wh0 wh0Var3 = this.a2;
            if (wh0Var3.E || wh0Var3.I == null) {
                return;
            }
            AnimatorSet animatorSet = wh0Var3.B;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                wh0Var3.B.cancel();
            }
            wh0Var3.E = true;
            wh0Var3.F = true;
            wh0Var3.D = 0.0f;
            wh0Var3.I.getTranslationY();
            AndroidUtilities.dp(100.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new uh0(wh0Var3, 5));
            ofFloat.setInterpolator(er.h);
            ofFloat.setDuration(250L);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new uh0(wh0Var3, 6));
            er erVar = er.j;
            ofFloat2.setInterpolator(erVar);
            ofFloat2.setDuration(150L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat3.addUpdateListener(new uh0(wh0Var3, 7));
            ofFloat3.setInterpolator(erVar);
            ofFloat3.setDuration(135L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            wh0Var3.B = animatorSet2;
            animatorSet2.addListener(new sz(wh0Var3, 13));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3);
            animatorSet3.setStartDelay(180L);
            wh0Var3.B.playTogether(ofFloat, animatorSet3);
            wh0Var3.B.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0a3d  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0a42 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0a9c  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0aab  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0aad  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0a3f  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0a33  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0652  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b0(int i10, boolean z10) {
        int i11;
        long j10;
        char c10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i13;
        long j11;
        ImageReceiver imageReceiver;
        boolean z18;
        boolean z19;
        int i14;
        MessageObject messageObject;
        boolean z20;
        boolean z21;
        int i15;
        boolean z22;
        int dp;
        TLRPC.User user;
        boolean z23;
        TLRPC.Chat chat;
        boolean z24;
        TLRPC.Chat chat2;
        ArrayList R3;
        MessageObject messageObject2;
        boolean z25;
        MessageObject messageObject3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        TLRPC.Chat chat3;
        HashMap hashMap;
        MessageObject messageObject4;
        long j12;
        boolean z26;
        boolean z27;
        boolean z28;
        int i21;
        MessagesController.DialogFilter dialogFilter;
        vr vrVar;
        MessagesController.DialogFilter dialogFilter2;
        String str;
        boolean Q = Q();
        boolean z29 = false;
        this.h0 = 0;
        k2 k2Var = this.C0;
        ImageReceiver imageReceiver2 = this.U1;
        org.telegram.ui.Components.y8 y8Var = this.W1;
        int i22 = this.B0;
        if (k2Var != null) {
            this.N0 = k2Var.h;
            int i23 = k2Var.d;
            this.T0 = i23 != 0;
            this.O0 = i23;
            this.w3 = k2Var.e;
            this.V0 = k2Var.f;
            this.Z0 = false;
            this.a1 = false;
            y8Var.n(k2Var.c, k2Var.a, null);
            if (this.B) {
                imageReceiver2.setImage(null, "50_50", this.C, null, 0L);
            } else {
                imageReceiver2.setImage(null, "50_50", y8Var, null, 0L);
            }
            int i24 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.R1;
                if (i24 >= imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i24].setImageBitmap((Drawable) null);
                i24++;
            }
            this.y = false;
            this.A = false;
            imageReceiver2.setRoundRadius(AndroidUtilities.dp(26.0f));
            this.X0 = false;
            z11 = Q;
            i15 = i22;
            z17 = false;
            z23 = false;
        } else {
            int i25 = this.O0;
            boolean z30 = this.R0 != 0;
            boolean z31 = this.P0;
            this.Z0 = false;
            this.a1 = false;
            this.z4 = -1;
            if (this.J0) {
                j10 = 0;
                TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i22).dialogs_dict.f(this.D0);
                if (dialog != null) {
                    this.z4 = dialog.read_outbox_max_id;
                    this.h0 = dialog.ttl_period;
                    if (i10 == 0) {
                        c10 = 1;
                        this.d1 = MessagesController.getInstance(i22).isClearingDialog(dialog.id);
                        ArrayList arrayList = (ArrayList) MessagesController.getInstance(i22).dialogMessage.f(dialog.id);
                        this.c1 = arrayList;
                        MessageObject messageObject5 = (arrayList == null || arrayList.size() <= 0) ? null : (MessageObject) this.c1.get(0);
                        this.b1 = messageObject5;
                        this.T0 = messageObject5 != null && messageObject5.isUnread();
                        TLRPC.Chat chat4 = MessagesController.getInstance(i22).getChat(Long.valueOf(-dialog.id));
                        if (chat4 != null && chat4.forum) {
                            boolean z32 = this.L;
                        }
                        if (chat4 == null || !(chat4.forum || (chat4.monoforum && ChatObject.canManageMonoForum(i22, chat4)))) {
                            i11 = i25;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                this.O0 = MessagesStorage.getInstance(i22).getArchiveUnreadCount();
                                this.Q0 = 0;
                                this.R0 = 0;
                                this.S0 = 0;
                            } else if (dialog instanceof TLRPC.TL_dialogCommunity) {
                                MessagesController.UnreadCounts communityUnreadCount = MessagesController.getInstance(i22).getCommunityUnreadCount(-dialog.id);
                                this.O0 = communityUnreadCount.unreadCount;
                                this.Q0 = communityUnreadCount.mentionCount;
                                this.R0 = communityUnreadCount.reactionMentionCount;
                                this.S0 = communityUnreadCount.pollVotesMentionCount;
                                this.a1 = communityUnreadCount.hasUnmutedUnreadDialogs;
                            } else {
                                this.O0 = dialog.unread_count;
                                this.Q0 = dialog.unread_mentions_count;
                                this.R0 = dialog.unread_reactions_count;
                                this.S0 = dialog.unread_poll_votes_count;
                            }
                        } else {
                            i11 = i25;
                            int[] forumUnreadCount = MessagesController.getInstance(i22).getTopicsController().getForumUnreadCount(chat4.id);
                            this.O0 = forumUnreadCount[0];
                            this.Q0 = forumUnreadCount[1];
                            this.R0 = forumUnreadCount[2];
                            this.Z0 = forumUnreadCount[3] != 0;
                            this.S0 = forumUnreadCount[4];
                        }
                        if (ChatObject.isMonoForum(chat4)) {
                            this.Q0 = 0;
                        }
                        this.P0 = dialog.unread_mark;
                        MessageObject messageObject6 = this.b1;
                        if (messageObject6 != null) {
                            int i26 = messageObject6.messageOwner.edit_date;
                        }
                        this.N0 = dialog.last_message_date;
                        int i27 = this.f1;
                        if (i27 == 7 || i27 == 8) {
                            MessagesController.DialogFilter dialogFilter3 = MessagesController.getInstance(i22).selectedDialogFilter[this.f1 == 8 ? (char) 1 : (char) 0];
                            this.w3 = dialogFilter3 != null && dialogFilter3.pinnedDialogs.indexOfKey(dialog.id) >= 0;
                        } else {
                            this.w3 = this.F0 == 0 && dialog.pinned;
                        }
                        MessageObject messageObject7 = this.b1;
                        if (messageObject7 != null) {
                            this.U0 = messageObject7.messageOwner.send_state;
                        }
                    } else {
                        i11 = i25;
                        c10 = 1;
                    }
                } else {
                    i11 = i25;
                    c10 = 1;
                    this.O0 = 0;
                    this.Q0 = 0;
                    this.R0 = 0;
                    this.S0 = 0;
                    this.N0 = 0;
                    this.d1 = false;
                }
                long j13 = this.D0;
                if (j13 != 0) {
                    int i28 = (j13 > g31.M ? 1 : (j13 == g31.M ? 0 : -1));
                }
            } else {
                i11 = i25;
                j10 = 0;
                c10 = 1;
                this.w3 = false;
            }
            TLRPC.TL_forumTopic tL_forumTopic = this.J;
            if (tL_forumTopic != null) {
                this.O0 = tL_forumTopic.unread_count;
                this.Q0 = tL_forumTopic.unread_mentions_count;
                this.R0 = tL_forumTopic.unread_reactions_count;
                this.S0 = tL_forumTopic.unread_poll_votes_count;
            }
            if (this.f1 == 2) {
                this.w3 = false;
            }
            wr wrVar = this.p0;
            if (wrVar != null) {
                boolean isEmpty = wrVar.c.isEmpty();
                wr wrVar2 = this.p0;
                int i29 = this.f1;
                long j14 = this.D0;
                p2 p2Var = wrVar2.a;
                ArrayList arrayList2 = wrVar2.b;
                ArrayList arrayList3 = wrVar2.c;
                AccountInstance accountInstance = AccountInstance.getInstance(i22);
                z12 = z30;
                MessagesController messagesController = MessagesController.getInstance(i22);
                z13 = z31;
                if (messagesController.folderTags && accountInstance.getUserConfig().isPremium()) {
                    ArrayList<MessagesController.DialogFilter> arrayList4 = messagesController.dialogFilters;
                    i12 = i11;
                    if (i29 == 7) {
                        dialogFilter = messagesController.selectedDialogFilter[0];
                        i21 = 8;
                    } else {
                        i21 = 8;
                        dialogFilter = i29 == 8 ? messagesController.selectedDialogFilter[c10] : null;
                    }
                    arrayList2.clear();
                    z11 = Q;
                    if (i29 == 0 || i29 == 7 || i29 == i21) {
                        for (int i30 = 0; i30 < arrayList4.size(); i30++) {
                            MessagesController.DialogFilter dialogFilter4 = arrayList4.get(i30);
                            if (dialogFilter4 != null && dialogFilter4 != dialogFilter && dialogFilter4.color >= 0 && dialogFilter4.includesDialog(accountInstance, j14)) {
                                arrayList2.add(dialogFilter4);
                            }
                        }
                    }
                    int i31 = 0;
                    z27 = false;
                    while (i31 < arrayList3.size()) {
                        vr vrVar2 = (vr) arrayList3.get(i31);
                        int i32 = 0;
                        while (true) {
                            if (i32 >= arrayList2.size()) {
                                dialogFilter2 = null;
                                break;
                            }
                            if (((MessagesController.DialogFilter) arrayList2.get(i32)).id == vrVar2.a) {
                                dialogFilter2 = (MessagesController.DialogFilter) arrayList2.get(i32);
                                break;
                            }
                            i32++;
                        }
                        if (dialogFilter2 == null) {
                            arrayList3.remove(i31);
                            i31--;
                        } else {
                            if (dialogFilter2.color != vrVar2.b || ((str = dialogFilter2.name) != null && vrVar2.c != null && str.length() != vrVar2.c.k().length())) {
                                arrayList3.set(i31, vr.b(p2Var, dialogFilter2));
                            }
                            i31++;
                        }
                        z27 = true;
                        i31++;
                    }
                    for (int i33 = 0; i33 < arrayList2.size(); i33++) {
                        MessagesController.DialogFilter dialogFilter5 = (MessagesController.DialogFilter) arrayList2.get(i33);
                        int i34 = 0;
                        while (true) {
                            if (i34 >= arrayList3.size()) {
                                vrVar = null;
                                break;
                            }
                            if (((vr) arrayList3.get(i34)).a == dialogFilter5.id) {
                                vrVar = (vr) arrayList3.get(i34);
                                break;
                            }
                            i34++;
                        }
                        if (vrVar == null) {
                            arrayList3.add(i33, vr.b(p2Var, dialogFilter5));
                            z27 = true;
                        }
                    }
                    arrayList2.clear();
                } else {
                    z11 = Q;
                    i12 = i11;
                    boolean isEmpty2 = arrayList3.isEmpty();
                    arrayList3.clear();
                    z27 = !isEmpty2;
                }
                if (z27) {
                    if (isEmpty != this.p0.c.isEmpty()) {
                        z14 = true;
                        z28 = true;
                    } else {
                        z14 = false;
                        z28 = false;
                    }
                    z15 = z28;
                    z16 = true;
                    if (i10 == 0) {
                        TLRPC.User user2 = this.b2;
                        if (user2 != null && !MessagesController.isSupportUser(user2) && !this.b2.bot && (i10 & MessagesController.UPDATE_MASK_STATUS) != 0) {
                            this.b2 = MessagesController.getInstance(i22).getUser(Long.valueOf(this.b2.id));
                            if (this.x0 != R()) {
                                z16 = true;
                            }
                        }
                        if ((i10 & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                            TLRPC.User user3 = this.b2;
                            org.telegram.ui.Components.i5 i5Var = this.f4;
                            if (user3 != null) {
                                TLRPC.User user4 = MessagesController.getInstance(i22).getUser(Long.valueOf(this.b2.id));
                                this.b2 = user4;
                                if (user4 == null || DialogObject.getEmojiStatusDocumentId(user4.emoji_status) == j10) {
                                    this.z2 = true;
                                    i5Var.g(ag.j2.d().e, z10);
                                    i5Var.m(false, z10);
                                } else {
                                    this.z2 = true;
                                    i5Var.j(DialogObject.getEmojiStatusDocumentId(this.b2.emoji_status), z10);
                                    i5Var.m(DialogObject.isEmojiStatusCollectible(this.b2.emoji_status), z10);
                                }
                                j12 = DialogObject.getBotVerificationIcon(this.b2);
                                z16 = true;
                            } else {
                                j12 = j10;
                            }
                            if (this.c2 != null) {
                                TLRPC.Chat chat5 = MessagesController.getInstance(i22).getChat(Long.valueOf(this.c2.id));
                                this.c2 = chat5;
                                if (chat5 == null || DialogObject.getEmojiStatusDocumentId(chat5.emoji_status) == j10) {
                                    this.z2 = true;
                                    i5Var.g(ag.j2.d().e, z10);
                                    i5Var.m(false, z10);
                                } else {
                                    this.z2 = true;
                                    i5Var.j(DialogObject.getEmojiStatusDocumentId(this.c2.emoji_status), z10);
                                    i5Var.m(DialogObject.isEmojiStatusCollectible(this.c2.emoji_status), z10);
                                }
                                j12 = DialogObject.getBotVerificationIcon(this.c2);
                                z16 = true;
                            }
                            org.telegram.ui.Components.i5 i5Var2 = this.g4;
                            if (j12 != j10) {
                                z26 = !this.c4;
                                i5Var2.j(j12, z10);
                            } else {
                                z26 = this.c4;
                                i5Var2.g(null, z10);
                            }
                            z17 = z16;
                            z25 = z26;
                        } else {
                            z17 = z16;
                            z25 = false;
                        }
                        if ((this.J0 || this.L) && (i10 & MessagesController.UPDATE_MASK_USER_PRINT) != 0) {
                            CharSequence printingString = MessagesController.getInstance(i22).getPrintingString(this.D0, getTopicId(), true);
                            CharSequence charSequence = this.e2;
                            if ((charSequence != null && printingString == null) || ((charSequence == null && printingString != null) || (charSequence != null && !charSequence.equals(printingString)))) {
                                z25 = true;
                            }
                        }
                        if (!z25 && (i10 & MessagesController.UPDATE_MASK_MESSAGE_TEXT) != 0 && (messageObject4 = this.b1) != null && messageObject4.messageText != this.e1) {
                            z25 = true;
                        }
                        if (!z25 && (i10 & MessagesController.UPDATE_MASK_CHAT) != 0 && this.c2 != null) {
                            TLRPC.Chat chat6 = MessagesController.getInstance(i22).getChat(Long.valueOf(this.c2.id));
                            if ((chat6 != null && chat6.call_active && chat6.call_not_empty) != this.r2) {
                                z25 = true;
                            }
                        }
                        if (!z25 && (i10 & MessagesController.UPDATE_MASK_AVATAR) != 0 && ((chat3 = this.c2) == null || (chat3.monoforum && ChatObject.canManageMonoForum(i22, chat3)))) {
                            o2 o2Var = this.F4;
                            if (o2Var != null && (hashMap = o2Var.f) != null && !hashMap.isEmpty()) {
                                for (Map.Entry entry : o2Var.f.entrySet()) {
                                    ((org.telegram.ui.g5) entry.getValue()).c(((Long) entry.getKey()).longValue());
                                }
                            }
                            z25 = true;
                        }
                        if (!z25 && (i10 & MessagesController.UPDATE_MASK_NAME) != 0 && this.c2 == null) {
                            z25 = true;
                        }
                        if (!z25 && (i10 & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 && this.b2 == null) {
                            z25 = true;
                        }
                        if (!z25 && (i10 & MessagesController.UPDATE_MASK_CHAT_NAME) != 0 && this.b2 == null) {
                            z25 = true;
                        }
                        if (!z25) {
                            MessageObject messageObject8 = this.b1;
                            if (messageObject8 != null && this.T0 != messageObject8.isUnread()) {
                                this.T0 = this.b1.isUnread();
                                z25 = true;
                            }
                            if (this.J0) {
                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) MessagesController.getInstance(i22).dialogs_dict.f(this.D0);
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
                                        this.a1 = communityUnreadCount2.hasUnmutedUnreadDialogs;
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
                                        if (dialog2 != null && (this.O0 != i16 || this.P0 != dialog2.unread_mark || this.Q0 != i19 || this.R0 != i18)) {
                                            this.O0 = i16;
                                            this.Q0 = i19;
                                            this.P0 = dialog2.unread_mark;
                                            this.R0 = i18;
                                            this.S0 = i17;
                                            z25 = true;
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
                                        this.O0 = i16;
                                        this.Q0 = i19;
                                        this.P0 = dialog2.unread_mark;
                                        this.R0 = i18;
                                        this.S0 = i17;
                                        z25 = true;
                                    }
                                } else {
                                    int[] forumUnreadCount2 = MessagesController.getInstance(i22).getTopicsController().getForumUnreadCount(chat7.id);
                                    i20 = forumUnreadCount2[0];
                                    i19 = forumUnreadCount2[1];
                                    i18 = forumUnreadCount2[2];
                                    this.Z0 = forumUnreadCount2[3] != 0;
                                    i17 = forumUnreadCount2[4];
                                }
                                i16 = i20;
                                if (ChatObject.isMonoForum(chat7)) {
                                }
                                if (dialog2 != null) {
                                }
                            }
                        }
                        if (!z25 && (i10 & MessagesController.UPDATE_MASK_SEND_STATE) != 0 && (messageObject3 = this.b1) != null) {
                            int i37 = this.U0;
                            int i38 = messageObject3.messageOwner.send_state;
                            if (i37 != i38) {
                                this.U0 = i38;
                                z25 = true;
                            }
                        }
                        if (!z25) {
                            invalidate();
                            return z15;
                        }
                    } else {
                        z17 = z16;
                    }
                    this.b2 = null;
                    this.c2 = null;
                    this.d2 = null;
                    if (this.G0 != j10) {
                        this.b1 = MessagesController.getInstance(i22).findCommunityLastMessage(this.G0);
                    }
                    i13 = this.F0;
                    if (i13 == 0) {
                        this.V0 = false;
                        this.X0 = false;
                        gy gyVar = this.v4;
                        if (gyVar == null || (R3 = gyVar.R3(i22, this.f1, i13, false)) == null || R3.isEmpty()) {
                            messageObject2 = null;
                        } else {
                            int size = R3.size();
                            MessageObject messageObject9 = null;
                            for (int i39 = 0; i39 < size; i39++) {
                                TLRPC.Dialog dialog3 = (TLRPC.Dialog) R3.get(i39);
                                a0.h hVar = MessagesController.getInstance(i22).dialogMessage;
                                if (hVar != null) {
                                    ArrayList arrayList5 = (ArrayList) hVar.f(dialog3.id);
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
                        this.b1 = messageObject2;
                        j11 = messageObject2 != null ? messageObject2.getDialogId() : j10;
                    } else {
                        this.X0 = false;
                        if (this.J != null) {
                            boolean isDialogMuted = MessagesController.getInstance(i22).isDialogMuted(this.D0, j10);
                            boolean isDialogMuted2 = MessagesController.getInstance(i22).isDialogMuted(this.D0, this.J.id);
                            this.W0 = isDialogMuted2;
                            if (isDialogMuted == isDialogMuted2) {
                                this.V0 = false;
                                this.X0 = false;
                            } else {
                                this.V0 = isDialogMuted2;
                                this.X0 = !isDialogMuted2;
                            }
                        } else {
                            this.V0 = this.J0 && MessagesController.getInstance(i22).isDialogMuted(this.D0, (long) getTopicId());
                        }
                        j11 = this.D0;
                        j10 = 0;
                    }
                    if (j11 != j10) {
                        if (DialogObject.isEncryptedDialog(j11)) {
                            TLRPC.EncryptedChat n10 = org.telegram.messenger.y1.n(MessagesController.getInstance(i22), j11);
                            this.d2 = n10;
                            if (n10 != null) {
                                this.b2 = MessagesController.getInstance(i22).getUser(Long.valueOf(this.d2.user_id));
                            }
                        } else if (DialogObject.isUserDialog(j11)) {
                            this.b2 = MessagesController.getInstance(i22).getUser(Long.valueOf(j11));
                        } else {
                            TLRPC.Chat chat8 = MessagesController.getInstance(i22).getChat(Long.valueOf(-j11));
                            this.c2 = chat8;
                            if (!this.J0 && chat8 != null && chat8.migrated_to != null && (chat2 = MessagesController.getInstance(i22).getChat(Long.valueOf(this.c2.migrated_to.channel_id))) != null) {
                                this.c2 = chat2;
                            }
                        }
                        if (this.q2 && this.b2 != null && this.b1.isOutOwner()) {
                            this.b2 = MessagesController.getInstance(i22).getUser(Long.valueOf(UserConfig.getInstance(i22).clientUserId));
                        }
                    }
                    this.A = this.K0 && ChatObject.isCommunity(this.c2) && this.J0;
                    if (this.F0 == 0) {
                        org.telegram.ui.ActionBar.g6.u1.setCallback(this);
                        y8Var.g(2);
                        imageReceiver = imageReceiver2;
                        z18 = z12;
                        z19 = z13;
                        i14 = i12;
                        imageReceiver.setImage(null, null, y8Var, null, this.b2, 0);
                    } else {
                        imageReceiver = imageReceiver2;
                        z18 = z12;
                        z19 = z13;
                        i14 = i12;
                        if (!this.K || (messageObject = this.b1) == null) {
                            TLRPC.User user5 = this.b2;
                            if (user5 != null) {
                                y8Var.m(i22, user5);
                                if (UserObject.isReplyUser(this.b2)) {
                                    y8Var.g(12);
                                    imageReceiver.setImage(null, null, y8Var, null, this.b2, 0);
                                } else if (UserObject.isAnonymous(this.b2)) {
                                    y8Var.g(21);
                                    imageReceiver.setImage(null, null, y8Var, null, this.b2, 0);
                                } else if (UserObject.isUserSelf(this.b2) && this.n0 && !this.m0) {
                                    y8Var.g(22);
                                    imageReceiver.setImage(null, null, y8Var, null, this.b2, 0);
                                } else if (!UserObject.isUserSelf(this.b2) || this.q2 || this.m0) {
                                    imageReceiver.setForUserOrChat(this.b2, y8Var, null, true, 1, false);
                                } else {
                                    y8Var.g(1);
                                    imageReceiver.setImage(null, null, y8Var, null, this.b2, 0);
                                }
                            } else {
                                TLRPC.Chat chat9 = this.c2;
                                if (chat9 != null) {
                                    if (chat9.monoforum) {
                                        wf.c.n(i22, chat9, y8Var, imageReceiver);
                                        y8Var.p = 1.0f;
                                    } else {
                                        y8Var.k(i22, chat9);
                                        imageReceiver.setForUserOrChat(chat9, y8Var);
                                    }
                                    if (z10 || ((i14 == this.O0 && z19 == this.P0) || (this.J0 && System.currentTimeMillis() - this.t4 <= 100))) {
                                        z20 = z14;
                                        z21 = z15;
                                        i15 = i22;
                                    } else {
                                        ValueAnimator valueAnimator = this.L3;
                                        if (valueAnimator != null) {
                                            valueAnimator.cancel();
                                        }
                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        this.L3 = ofFloat;
                                        ofFloat.addUpdateListener(new f2(this, 0));
                                        this.L3.addListener(new j2(this, 0));
                                        if ((i14 == 0 || this.P0) && (this.P0 || !z19)) {
                                            this.L3.setDuration(220L);
                                            this.L3.setInterpolator(new OvershootInterpolator());
                                        } else if (this.O0 == 0) {
                                            this.L3.setDuration(150L);
                                            this.L3.setInterpolator(er.f);
                                        } else {
                                            this.L3.setDuration(430L);
                                            this.L3.setInterpolator(er.f);
                                        }
                                        if (this.C3 && this.D3 && this.P3 != null) {
                                            String format = String.format("%d", Integer.valueOf(i14));
                                            String format2 = String.format("%d", Integer.valueOf(this.O0));
                                            if (format.length() == format2.length()) {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(format2);
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(format2);
                                                int i40 = 0;
                                                while (i40 < format.length()) {
                                                    boolean z33 = z14;
                                                    if (format.charAt(i40) == format2.charAt(i40)) {
                                                        boolean z34 = false;
                                                        z24 = z15;
                                                        int i41 = i40 + 1;
                                                        spannableStringBuilder.setSpan(new zy(z34), i40, i41, 0);
                                                        spannableStringBuilder2.setSpan(new zy(z34), i40, i41, 0);
                                                    } else {
                                                        z24 = z15;
                                                        spannableStringBuilder3.setSpan(new zy(false), i40, i40 + 1, 0);
                                                    }
                                                    i40++;
                                                    z14 = z33;
                                                    z15 = z24;
                                                }
                                                z20 = z14;
                                                z21 = z15;
                                                i15 = i22;
                                                int max = Math.max(AndroidUtilities.dp(8.0f), (int) Math.ceil(org.telegram.ui.ActionBar.g6.M0.measureText(format)));
                                                TextPaint textPaint = org.telegram.ui.ActionBar.g6.M0;
                                                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                                                this.Q3 = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                                                this.R3 = new StaticLayout(spannableStringBuilder3, org.telegram.ui.ActionBar.g6.M0, max, alignment, 1.0f, 0.0f, false);
                                                this.S3 = new StaticLayout(spannableStringBuilder2, org.telegram.ui.ActionBar.g6.M0, max, alignment, 1.0f, 0.0f, false);
                                            } else {
                                                z20 = z14;
                                                z21 = z15;
                                                i15 = i22;
                                                this.Q3 = this.P3;
                                            }
                                        } else {
                                            z20 = z14;
                                            z21 = z15;
                                            i15 = i22;
                                        }
                                        this.H3 = this.G3;
                                        this.I3 = this.F3;
                                        this.J3 = this.O0 > i14;
                                        this.L3.start();
                                    }
                                    this.K3.a(this.S0 != 0, z10);
                                    boolean z35 = this.R0 != 0;
                                    if (!z10 && z35 != z18) {
                                        ValueAnimator valueAnimator2 = this.M3;
                                        if (valueAnimator2 != null) {
                                            valueAnimator2.cancel();
                                        }
                                        this.O3 = 0.0f;
                                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        this.M3 = ofFloat2;
                                        ofFloat2.addUpdateListener(new f2(this, 1));
                                        this.M3.addListener(new j2(this, 1));
                                        if (z35) {
                                            this.M3.setDuration(220L);
                                            this.M3.setInterpolator(new OvershootInterpolator());
                                        } else {
                                            this.M3.setDuration(150L);
                                            this.M3.setInterpolator(er.f);
                                        }
                                        this.M3.start();
                                    }
                                    z22 = P() && (chat = this.c2) != null && chat.monoforum;
                                    this.y = z22;
                                    if (z22) {
                                        dp = 1;
                                    } else if (this.A) {
                                        dp = AndroidUtilities.dp(12.0f);
                                    } else {
                                        TLRPC.Chat chat10 = this.c2;
                                        dp = ((chat10 == null || !chat10.forum || this.F0 != 0 || this.K) && (this.n0 || (user = this.b2) == null || !user.self || !MessagesController.getInstance(i15).savedViewAsChats)) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f);
                                    }
                                    imageReceiver.setRoundRadius(dp);
                                    z29 = z20;
                                    z23 = z21;
                                }
                            }
                        } else {
                            y8Var.j(i22, messageObject.getFromPeerObject());
                            imageReceiver.setForUserOrChat(this.b1.getFromPeerObject(), y8Var);
                        }
                    }
                    if (z10) {
                    }
                    z20 = z14;
                    z21 = z15;
                    i15 = i22;
                    this.K3.a(this.S0 != 0, z10);
                    if (this.R0 != 0) {
                    }
                    if (!z10) {
                    }
                    if (P()) {
                    }
                    this.y = z22;
                    if (z22) {
                    }
                    imageReceiver.setRoundRadius(dp);
                    z29 = z20;
                    z23 = z21;
                }
            } else {
                z11 = Q;
                z12 = z30;
                z13 = z31;
                i12 = i11;
            }
            z14 = false;
            z15 = false;
            z16 = false;
            if (i10 == 0) {
            }
            this.b2 = null;
            this.c2 = null;
            this.d2 = null;
            if (this.G0 != j10) {
            }
            i13 = this.F0;
            if (i13 == 0) {
            }
            if (j11 != j10) {
            }
            this.A = this.K0 && ChatObject.isCommunity(this.c2) && this.J0;
            if (this.F0 == 0) {
            }
            if (z10) {
            }
            z20 = z14;
            z21 = z15;
            i15 = i22;
            this.K3.a(this.S0 != 0, z10);
            if (this.R0 != 0) {
            }
            if (!z10) {
            }
            if (P()) {
            }
            this.y = z22;
            if (z22) {
            }
            imageReceiver.setRoundRadius(dp);
            z29 = z20;
            z23 = z21;
        }
        if (!this.L && (getMeasuredWidth() != 0 || getMeasuredHeight() != 0)) {
            z29 = true;
        }
        if (!z17) {
            if (this.q0.y == 0) {
            }
            if (jh.l7.r(MessagesController.getInstance(i15).getStoriesController(), getDialogId()) == 0) {
            }
        }
        if (!z10) {
            this.Y0 = (this.V0 || this.X0) ? 1.0f : 0.0f;
            ValueAnimator valueAnimator3 = this.L3;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
        }
        invalidate();
        if (Q() != z11) {
            z23 = true;
        }
        if (z29) {
            if (this.s3) {
                u();
            } else {
                this.w0 = true;
            }
        }
        d0(z10);
        return z23;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f0, code lost:
    
        if (org.telegram.messenger.DownloadController.getInstance(r32.B0).canDownloadMedia(1, r4.size) == false) goto L47;
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
        int i11;
        boolean z11;
        TLRPC.PhotoSize photoSize3;
        MessageObject messageObject = this.b1;
        if (messageObject == null) {
            return;
        }
        String restrictionReason = MessagesController.getInstance(messageObject.currentAccount).getRestrictionReason(this.b1.messageOwner.restriction_reason);
        MessageObject messageObject2 = this.b1;
        TLRPC.PhotoSize photoSize4 = null;
        int i12 = 3;
        boolean z12 = false;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                this.N1 = 0;
                this.O1 = false;
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
                int i13 = 0;
                int i14 = 0;
                while (i13 < tL_messageMediaPaidMedia.extended_media.size() && this.N1 < i12) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i13);
                    boolean z13 = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
                    boolean[] zArr = this.T1;
                    boolean[] zArr2 = this.S1;
                    ImageReceiver[] imageReceiverArr = this.R1;
                    if (z13) {
                        i10 = i14 + 1;
                        TLRPC.PhotoSize photoSize5 = ((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb;
                        if (i14 < i12 && photoSize5 != null) {
                            this.O1 = z12;
                            int i15 = this.N1;
                            if (i15 < i12) {
                                this.N1 = i15 + 1;
                                zArr2[i14] = z12;
                                zArr[i14] = true;
                                imageReceiverArr[i14].setImage(ImageLocation.getForObject(photoSize5, this.b1.messageOwner), "2_2_b", null, null, z12 ? 1L : 0L, null, this.b1, 0);
                                imageReceiverArr[i14].setRoundRadius(AndroidUtilities.dp(2.0f));
                                this.R = z12;
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
                                i11 = i14;
                                z11 = false;
                            } else {
                                i11 = i14;
                                z11 = false;
                            }
                            closestPhotoSizeWithSize = photoSize2;
                            if (photoSize2 != null) {
                                this.O1 = this.O1 || z10;
                                int i16 = this.N1;
                                if (i16 < 3) {
                                    this.N1 = i16 + 1;
                                    zArr2[i11] = z10;
                                    zArr[i11] = z11;
                                    imageReceiverArr[i11].setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, photoSize), "20_20", ImageLocation.getForObject(photoSize2, photoSize), "20_20", (z10 || closestPhotoSizeWithSize == null) ? 0 : closestPhotoSizeWithSize.size, null, this.b1, 0);
                                    imageReceiverArr[i11].setRoundRadius(AndroidUtilities.dp(2.0f));
                                    this.R = false;
                                }
                            }
                        } else {
                            TLRPC.PhotoSize photoSize6 = photoSize4;
                            r14 = photoSize6;
                            photoSize3 = photoSize6;
                        }
                        z10 = false;
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
        ArrayList arrayList = this.c1;
        if (arrayList != null && arrayList.size() > 1 && TextUtils.isEmpty(restrictionReason) && this.F0 == 0 && this.d2 == null) {
            this.N1 = 0;
            this.O1 = false;
            Collections.sort(this.c1, Comparator$-CC.comparingInt(new gf.d(10)));
            for (int i17 = 0; i17 < Math.min(3, this.c1.size()); i17++) {
                MessageObject messageObject3 = (MessageObject) this.c1.get(i17);
                if (messageObject3 != null && !messageObject3.needDrawBluredPreview() && (messageObject3.isPhoto() || messageObject3.isNewGif() || messageObject3.isVideo() || messageObject3.isRoundVideo() || messageObject3.isStoryMedia())) {
                    String str = messageObject3.isWebpage() ? messageObject3.messageOwner.media.webpage.type : null;
                    if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                        Z(messageObject3, i17);
                    }
                }
            }
            return;
        }
        MessageObject messageObject4 = this.b1;
        if (messageObject4 == null || this.F0 != 0) {
            return;
        }
        this.N1 = 0;
        this.O1 = false;
        if (messageObject4.needDrawBluredPreview()) {
            return;
        }
        if (this.b1.isPhoto() || this.b1.isNewGif() || this.b1.isVideo() || this.b1.isRoundVideo() || this.b1.isStoryMedia()) {
            String str2 = this.b1.isWebpage() ? this.b1.messageOwner.media.webpage.type : null;
            if ("app".equals(str2) || "profile".equals(str2) || "article".equals(str2)) {
                return;
            }
            if (str2 == null || !str2.startsWith("telegram_")) {
                Z(this.b1, 0);
            }
        }
    }

    public final void d0(boolean z10) {
        TL_account.RequirementToContact isUserContactBlocked = (this.R4 == null || this.b2 == null) ? null : MessagesController.getInstance(this.B0).isUserContactBlocked(this.b2.id);
        if (this.j2 == DialogObject.isPremiumBlocked(isUserContactBlocked) && this.l2 == DialogObject.getMessagesStarsPrice(isUserContactBlocked)) {
            return;
        }
        this.j2 = DialogObject.isPremiumBlocked(isUserContactBlocked);
        this.l2 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
        if (!z10) {
            this.i2.f(this.j2, true);
            this.k2.f(this.l2 > 0, true);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((!this.L && !this.B && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            this.q0.a(motionEvent, this);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e0() {
        if (this.N1 > 0) {
            StaticLayout staticLayout = Q() ? this.d3 : this.a3;
            int i10 = Q() ? this.Y2 : this.X2;
            if (staticLayout == null) {
                return;
            }
            try {
                CharSequence text = staticLayout.getText();
                if (text instanceof Spanned) {
                    n2[] n2VarArr = (n2[]) ((Spanned) text).getSpans(0, text.length(), n2.class);
                    boolean[] zArr = this.Q1;
                    if (n2VarArr == null || n2VarArr.length <= 0) {
                        for (int i11 = 0; i11 < 3; i11++) {
                            zArr[i11] = false;
                        }
                        return;
                    }
                    int spanStart = ((Spanned) text).getSpanStart(n2VarArr[0]);
                    if (spanStart < 0) {
                        spanStart = 0;
                    }
                    int ceil = (int) Math.ceil(Math.min(staticLayout.getPrimaryHorizontal(spanStart), staticLayout.getPrimaryHorizontal(spanStart + 1)));
                    if (ceil != 0 && !this.t0 && !this.u0) {
                        ceil += AndroidUtilities.dp(3.0f);
                    }
                    for (int i12 = 0; i12 < this.N1; i12++) {
                        this.R1[i12].setImageX(i10 + ceil + AndroidUtilities.dp((this.D4 + 2) * i12));
                        zArr[i12] = true;
                    }
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
    }

    public float getClipProgress() {
        return this.p1;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public int getCurrentDialogFolderId() {
        return this.F0;
    }

    public long getDialogId() {
        return this.D0;
    }

    public boolean getHasUnread() {
        return this.O0 != 0 || this.P0;
    }

    public boolean getIsMuted() {
        return this.V0;
    }

    public boolean getIsPinned() {
        return this.w3 || this.x3;
    }

    public MessageObject getMessage() {
        return this.b1;
    }

    public int getMessageId() {
        return this.h1;
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
        MessageObject messageObject3 = this.b1;
        if (messageObject3 != null) {
            long fromChatId = messageObject3.getFromChatId();
            int i10 = this.B0;
            long clientUserId = UserConfig.getInstance(i10).getClientUserId();
            if (!this.n0 && this.D0 == clientUserId) {
                long savedDialogId = this.b1.getSavedDialogId();
                if (savedDialogId != clientUserId) {
                    if (savedDialogId != UserObject.ANONYMOUS) {
                        TLRPC.Message message5 = this.b1.messageOwner;
                        if (message5 != null && (messageFwdHeader4 = message5.fwd_from) != null) {
                            long peerDialogId = DialogObject.getPeerDialogId(messageFwdHeader4.saved_from_id);
                            if (peerDialogId == 0) {
                                peerDialogId = DialogObject.getPeerDialogId(this.b1.messageOwner.fwd_from.from_id);
                            }
                            if (peerDialogId > 0) {
                            }
                        }
                        fromChatId = savedDialogId;
                    }
                }
            }
            if (this.n0 && (message4 = this.b1.messageOwner) != null && (messageFwdHeader3 = message4.fwd_from) != null) {
                fromChatId = DialogObject.getPeerDialogId(messageFwdHeader3.saved_from_id);
                if (fromChatId == 0) {
                    fromChatId = DialogObject.getPeerDialogId(this.b1.messageOwner.fwd_from.from_id);
                }
            }
            if (DialogObject.isUserDialog(fromChatId)) {
                user = MessagesController.getInstance(i10).getUser(Long.valueOf(fromChatId));
                chat = null;
            } else {
                chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-fromChatId));
                user = null;
            }
            long j10 = this.D0;
            if (j10 != clientUserId) {
                if (j10 == UserObject.VERIFY && (messageObject2 = this.b1) != null && (message3 = messageObject2.messageOwner) != null && (messageFwdHeader2 = message3.fwd_from) != null) {
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
                if (this.b1.isOutOwner() && user != null) {
                    return LocaleController.getString(R.string.FromYou);
                }
                if (!this.n0 && (messageObject = this.b1) != null && (message2 = messageObject.messageOwner) != null && (message2.from_id instanceof TLRPC.TL_peerUser) && (user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(this.b1.messageOwner.from_id.user_id))) != null) {
                    return AndroidUtilities.escape(UserObject.getFirstName(user2).replace("\n", ""));
                }
                MessageObject messageObject4 = this.b1;
                return (messageObject4 == null || (message = messageObject4.messageOwner) == null || (messageFwdHeader = message.fwd_from) == null || (str2 = messageFwdHeader.from_name) == null) ? user != null ? (this.n2 || SharedConfig.useThreeLinesLayout) ? UserObject.isDeleted(user) ? LocaleController.getString(R.string.HiddenName) : AndroidUtilities.escape(ContactsController.formatName(user.first_name, user.last_name).replace("\n", "")) : AndroidUtilities.escape(UserObject.getFirstName(user).replace("\n", "")) : (chat == null || (str = chat.title) == null) ? "DELETED" : AndroidUtilities.escape(str.replace("\n", "")) : AndroidUtilities.escape(str2);
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
        return this.l2;
    }

    @Override // android.view.View
    public float getTranslationX() {
        return this.s1;
    }

    @Override // org.telegram.ui.Cells.a0, android.view.View
    public final void invalidate() {
        if (jh.i9.t1) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == this.u1 || drawable == org.telegram.ui.ActionBar.g6.u1) {
            invalidate(drawable.getBounds());
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U1.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.R1;
            if (i10 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i10].onAttachedToWindow();
            i10++;
        }
        U();
        this.i3 = org.telegram.ui.Components.t5.update(0, this, this.i3, this.a3);
        this.j3 = org.telegram.ui.Components.t5.update(0, this, this.j3, this.o3);
        this.k3 = org.telegram.ui.Components.t5.update(0, this, this.k3, this.d3);
        this.l3 = org.telegram.ui.Components.t5.update(0, this, this.l3, this.v2);
        org.telegram.ui.Components.i5 i5Var = this.f4;
        if (i5Var != null) {
            i5Var.a();
        }
        org.telegram.ui.Components.i5 i5Var2 = this.g4;
        if (i5Var2 != null) {
            i5Var2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.t1 = false;
        this.w1 = false;
        this.x1 = 0.0f;
        this.s3 = false;
        this.t3 = (getIsPinned() && this.u3) ? 1.0f : 0.0f;
        this.U1.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.R1;
            if (i10 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i10].onDetachedFromWindow();
            i10++;
        }
        oi0 oi0Var = this.u1;
        if (oi0Var != null) {
            oi0Var.stop();
            this.u1.Q(0.0f, true);
            this.u1.setCallback(null);
            this.u1 = null;
            this.v1 = false;
        }
        pf.h hVar = this.k4;
        if (hVar != null) {
            hVar.d.remove(Long.valueOf(this.D0));
        }
        org.telegram.ui.Components.i5 i5Var = this.f4;
        if (i5Var != null) {
            i5Var.b();
        }
        org.telegram.ui.Components.i5 i5Var2 = this.g4;
        if (i5Var2 != null) {
            i5Var2.b();
        }
        org.telegram.ui.Components.t5.release(this, this.i3);
        org.telegram.ui.Components.t5.release(this, this.j3);
        org.telegram.ui.Components.t5.release(this, this.k3);
        org.telegram.ui.Components.t5.release(this, this.l3);
        this.q0.g();
        this.V = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1001:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:1011:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:1028:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:1034:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:1037:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:1040:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:1041:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0cc1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0cd6  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0cec  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0cef  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0d01  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0d35  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0d48  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0d50  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0de8  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0fe2  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x109e  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x1105  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x1116 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x115f  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x1179  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x119b  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x119e  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x11d9  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x1260  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x13b3  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x141c  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x1661  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x17c6  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x17f7  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x1813  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x1832  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x1851  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x1930  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x188e  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x196b  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x1974  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x1984  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x19dc  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x19e5  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x19ea  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x1a3f  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x1abf  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x1b0e  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x1b71  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x1ba8  */
    /* JADX WARN: Removed duplicated region for block: B:658:0x1bf8  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x1c0d  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x1c57  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x1c5f  */
    /* JADX WARN: Removed duplicated region for block: B:681:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:682:0x1c59  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x1c35  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x1bce  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x1b7e  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x1b93  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x146b  */
    /* JADX WARN: Removed duplicated region for block: B:780:0x13bf  */
    /* JADX WARN: Removed duplicated region for block: B:785:0x12b1  */
    /* JADX WARN: Removed duplicated region for block: B:844:0x1243  */
    /* JADX WARN: Removed duplicated region for block: B:853:0x117c  */
    /* JADX WARN: Removed duplicated region for block: B:855:0x1162  */
    /* JADX WARN: Removed duplicated region for block: B:882:0x1091  */
    /* JADX WARN: Removed duplicated region for block: B:894:0x0fdd  */
    /* JADX WARN: Removed duplicated region for block: B:897:0x0ccb  */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v169, types: [org.telegram.ui.Cells.g2] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        float f10;
        boolean z10;
        int v02;
        int v03;
        int i10;
        String string;
        String str;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.c6 c6Var;
        boolean z11;
        ag.s0 s0Var;
        f2.b0 b0Var;
        float f11;
        String str2;
        float f12;
        int i14;
        String str3;
        float f13;
        f2.b0 b0Var2;
        float f14;
        f2.b0 b0Var3;
        String str4;
        int ceil;
        int i15;
        StaticLayout staticLayout;
        boolean z12;
        oi0 oi0Var;
        float f15;
        float f16;
        org.telegram.ui.ActionBar.c6 c6Var2;
        float f17;
        p2 p2Var;
        org.telegram.ui.ActionBar.c6 c6Var3;
        f2.b0 b0Var4;
        ag.s0 s0Var2;
        int i16;
        ?? r12;
        float f18;
        boolean z13;
        boolean z14;
        boolean z15;
        ImageReceiver imageReceiver;
        boolean z16;
        i2 i2Var;
        p2 p2Var2;
        float f19;
        Canvas canvas2;
        boolean z17;
        float f20;
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.TL_forumTopic tL_forumTopic2;
        wh0 wh0Var;
        m2 m2Var;
        float f21;
        int i17;
        float f22;
        int i18;
        int i19;
        boolean z18;
        m2 m2Var2;
        int i20;
        float f23;
        int i21;
        RectF rectF;
        org.telegram.ui.ActionBar.c6 c6Var4;
        m2 m2Var3;
        float f24;
        boolean z19;
        p2 p2Var3;
        boolean z20;
        float f25;
        wr wrVar;
        int i22;
        float dp;
        float f26;
        boolean z21;
        boolean z22;
        boolean z23;
        int i23;
        float f27;
        float z24;
        StaticLayout staticLayout2;
        int i24;
        vv0 t02;
        int i25;
        k2 k2Var;
        gy gyVar;
        bx bxVar;
        TLRPC.TL_forumTopic tL_forumTopic3;
        wh0 wh0Var2;
        TLRPC.TL_forumTopic tL_forumTopic4;
        Canvas canvas3 = canvas;
        if ((this.D0 == 0 && this.C0 == null) || !this.v0) {
            return;
        }
        boolean z25 = this.h;
        ag.s0 s0Var3 = this.e4;
        if (z25 && ((this.F0 != 0 || (this.L && (tL_forumTopic4 = this.J) != null && tL_forumTopic4.id == 1)) && (wh0Var2 = this.a2) != null && wh0Var2.C == 0.0f && this.s1 == 0.0f)) {
            canvas3.save();
            canvas3.translate(0.0f, (-this.A3) - this.n);
            canvas3.clipRect(0.0f, (1.0f - this.a2.J) * getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            this.a2.c(canvas3, false);
            canvas3.restore();
            s0Var3.setVisibility(4);
            return;
        }
        boolean z26 = z25 && (this.F0 != 0 || (this.L && (tL_forumTopic3 = this.J) != null && tL_forumTopic3.id == 1)) && this.a2 != null && this.s1 == 0.0f && (gyVar = this.v4) != null && gyVar.Z3() && ((bxVar = gyVar.B3) == null || !bxVar.c());
        wh0 wh0Var3 = this.a2;
        float f28 = wh0Var3 != null ? wh0Var3.J : 1.0f;
        if (z26) {
            canvas3.save();
            canvas3.clipRect(0.0f, (1.0f - f28) * getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.p1 != 0.0f && Build.VERSION.SDK_INT != 24) {
            canvas3.save();
            canvas3.clipRect(0.0f, this.q1 * this.p1, getMeasuredWidth(), getMeasuredHeight() - ((int) (this.r1 * this.p1)));
        }
        float f29 = this.s1;
        f2.b0 b0Var5 = this.Z1;
        org.telegram.ui.ActionBar.c6 c6Var5 = this.B4;
        if (f29 == 0.0f && this.k1 == 0.0f) {
            oi0 oi0Var2 = this.u1;
            if (oi0Var2 != null) {
                oi0Var2.stop();
                this.u1.Q(0.0f, true);
                this.u1.setCallback(null);
                this.u1 = null;
                this.v1 = false;
            }
            c6Var = c6Var5;
            z11 = z25;
            s0Var = s0Var3;
            b0Var3 = b0Var5;
        } else {
            canvas3.save();
            canvas3.translate(0.0f, -this.A3);
            if (this.H1) {
                v02 = org.telegram.ui.ActionBar.g6.v0(this.I1, c6Var5);
                v03 = org.telegram.ui.ActionBar.g6.v0(this.J1, c6Var5);
                String str5 = this.K1;
                f10 = 1.0f;
                i10 = this.L1;
                string = LocaleController.getString(str5, i10);
                z10 = false;
                this.u1 = this.M1;
            } else {
                f10 = 1.0f;
                z10 = false;
                if (this.F0 != 0) {
                    if (this.i1) {
                        v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d9, c6Var5);
                        v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.c9, c6Var5);
                        i10 = R.string.UnhideFromTop;
                        string = LocaleController.getString(i10);
                        this.u1 = org.telegram.ui.ActionBar.g6.y1;
                    } else {
                        v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.c9, c6Var5);
                        v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d9, c6Var5);
                        i10 = R.string.HideOnTop;
                        string = LocaleController.getString(i10);
                        this.u1 = org.telegram.ui.ActionBar.g6.x1;
                    }
                } else if (this.L2) {
                    v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.c9, c6Var5);
                    v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d9, c6Var5);
                    i10 = R.string.PsaHide;
                    string = LocaleController.getString(i10);
                    this.u1 = org.telegram.ui.ActionBar.g6.z1;
                } else if (this.g1 == 0) {
                    v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.c9, c6Var5);
                    v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d9, c6Var5);
                    if (ChatObject.isCommunity(this.c2)) {
                        int i26 = R.string.SwipeUngroupCommunity;
                        String string2 = LocaleController.getString(i26);
                        v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Y5, c6Var5);
                        this.u1 = org.telegram.ui.ActionBar.g6.K1;
                        str = string2;
                        i11 = i26;
                        i12 = v02;
                        if (this.w || (oi0Var = this.s) == null) {
                            this.s = this.u1;
                            this.v = i11;
                        } else {
                            this.u1 = oi0Var;
                            i11 = this.v;
                        }
                        if (!this.v1 && Math.abs(this.s1) > AndroidUtilities.dp(43.0f)) {
                            this.v1 = true;
                            this.u1.Q(0.0f, true);
                            this.u1.setCallback(this);
                            this.u1.start();
                        }
                        float measuredWidth = getMeasuredWidth() + this.s1;
                        if (this.x1 >= f10) {
                            org.telegram.ui.ActionBar.g6.v0.setColor(v02);
                            i13 = i11;
                            c6Var = c6Var5;
                            z11 = z25;
                            s0Var = s0Var3;
                            b0Var = b0Var5;
                            f12 = measuredWidth;
                            str2 = "Arrow";
                            f11 = 0.0f;
                            canvas3.drawRect(measuredWidth - AndroidUtilities.dp(8.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.v0);
                            if (this.x1 == 0.0f) {
                                if (org.telegram.ui.ActionBar.g6.A1) {
                                    org.telegram.ui.ActionBar.g6.v1.O(org.telegram.ui.ActionBar.g6.E0(org.telegram.ui.ActionBar.g6.c9), str2);
                                    org.telegram.ui.ActionBar.g6.A1 = z10;
                                }
                                if (org.telegram.ui.ActionBar.g6.B1) {
                                    oi0 oi0Var3 = org.telegram.ui.ActionBar.g6.z1;
                                    oi0Var3.W = true;
                                    int i27 = org.telegram.ui.ActionBar.g6.c9;
                                    oi0Var3.O(org.telegram.ui.ActionBar.g6.E0(i27), "Line 1");
                                    org.telegram.ui.ActionBar.g6.z1.O(org.telegram.ui.ActionBar.g6.E0(i27), "Line 2");
                                    org.telegram.ui.ActionBar.g6.z1.O(org.telegram.ui.ActionBar.g6.E0(i27), "Line 3");
                                    org.telegram.ui.ActionBar.g6.z1.m();
                                    org.telegram.ui.ActionBar.g6.B1 = z10;
                                }
                            }
                        } else {
                            i13 = i11;
                            c6Var = c6Var5;
                            z11 = z25;
                            s0Var = s0Var3;
                            b0Var = b0Var5;
                            f11 = 0.0f;
                            str2 = "Arrow";
                            f12 = measuredWidth;
                        }
                        int measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (this.u1.getIntrinsicWidth() / 2);
                        int x8 = rl.x(52.0f, getMeasuredHeight(), 2);
                        int intrinsicWidth = (this.u1.getIntrinsicWidth() / 2) + measuredWidth2;
                        int intrinsicHeight = (this.u1.getIntrinsicHeight() / 2) + x8;
                        if (this.x1 <= f11) {
                            canvas3.save();
                            i14 = i13;
                            str3 = str;
                            f13 = f12;
                            canvas3.clipRect(f12 - AndroidUtilities.dp(8.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                            org.telegram.ui.ActionBar.g6.v0.setColor(i12);
                            b0Var2 = b0Var;
                            canvas3.drawCircle(intrinsicWidth, intrinsicHeight, AndroidUtilities.accelerateInterpolator.getInterpolation(this.x1) * ((float) Math.sqrt(((intrinsicHeight - getMeasuredHeight()) * (intrinsicHeight - getMeasuredHeight())) + (intrinsicWidth * intrinsicWidth))), org.telegram.ui.ActionBar.g6.v0);
                            canvas3.restore();
                            if (org.telegram.ui.ActionBar.g6.A1) {
                                z12 = true;
                            } else {
                                org.telegram.ui.ActionBar.g6.v1.O(org.telegram.ui.ActionBar.g6.E0(org.telegram.ui.ActionBar.g6.d9), str2);
                                z12 = true;
                                org.telegram.ui.ActionBar.g6.A1 = true;
                            }
                            if (!org.telegram.ui.ActionBar.g6.B1) {
                                oi0 oi0Var4 = org.telegram.ui.ActionBar.g6.z1;
                                oi0Var4.W = z12;
                                int i28 = org.telegram.ui.ActionBar.g6.d9;
                                oi0Var4.O(org.telegram.ui.ActionBar.g6.E0(i28), "Line 1");
                                org.telegram.ui.ActionBar.g6.z1.O(org.telegram.ui.ActionBar.g6.E0(i28), "Line 2");
                                org.telegram.ui.ActionBar.g6.z1.O(org.telegram.ui.ActionBar.g6.E0(i28), "Line 3");
                                org.telegram.ui.ActionBar.g6.z1.m();
                                org.telegram.ui.ActionBar.g6.B1 = true;
                            }
                        } else {
                            i14 = i13;
                            str3 = str;
                            f13 = f12;
                            b0Var2 = b0Var;
                        }
                        canvas3.save();
                        canvas3.translate(measuredWidth2, x8);
                        f14 = this.y1;
                        if (f14 != 0.0f || f14 == f10) {
                            b0Var3 = b0Var2;
                        } else {
                            b0Var3 = b0Var2;
                            float interpolation = b0Var3.getInterpolation(f14) + f10;
                            canvas3.scale(interpolation, interpolation, this.u1.getIntrinsicWidth() / 2, this.u1.getIntrinsicHeight() / 2);
                        }
                        a0.p(0, 0, this.u1);
                        this.u1.draw(canvas3);
                        canvas3.restore();
                        canvas3.clipRect(f13, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        str4 = str3;
                        ceil = (int) Math.ceil(org.telegram.ui.ActionBar.g6.M0.measureText(str4));
                        i15 = i14;
                        if (this.x4 == i15 || this.y4 != getMeasuredWidth()) {
                            this.x4 = i15;
                            this.y4 = getMeasuredWidth();
                            TextPaint textPaint = org.telegram.ui.ActionBar.g6.N0;
                            int min = Math.min(AndroidUtilities.dp(80.0f), ceil);
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                            staticLayout = new StaticLayout(str4, textPaint, min, alignment, 1.0f, 0.0f, false);
                            this.w4 = staticLayout;
                            if (staticLayout.getLineCount() > 1) {
                                this.w4 = new StaticLayout(str4, org.telegram.ui.ActionBar.g6.O0, Math.min(AndroidUtilities.dp(82.0f), ceil), alignment, 1.0f, 0.0f, false);
                            }
                        }
                        if (this.w4 == null) {
                            canvas3.save();
                            canvas3.translate((getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (this.w4.getWidth() / 2.0f), AndroidUtilities.dp(36.0f) + x8 + (this.w4.getLineCount() > 1 ? -AndroidUtilities.dp(4.0f) : 0.0f));
                            this.w4.draw(canvas3);
                            canvas3.restore();
                        }
                        canvas3.restore();
                    } else {
                        int i29 = this.B0;
                        if (SharedConfig.getChatSwipeAction(i29) == 3) {
                            if (this.V0) {
                                i10 = R.string.SwipeUnmute;
                                string = LocaleController.getString(i10);
                                this.u1 = org.telegram.ui.ActionBar.g6.I1;
                            } else {
                                i10 = R.string.SwipeMute;
                                string = LocaleController.getString(i10);
                                this.u1 = org.telegram.ui.ActionBar.g6.H1;
                            }
                        } else if (SharedConfig.getChatSwipeAction(i29) == 4) {
                            i10 = R.string.SwipeDeleteChat;
                            string = LocaleController.getString(i10);
                            v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Y5, c6Var5);
                            this.u1 = org.telegram.ui.ActionBar.g6.J1;
                        } else if (SharedConfig.getChatSwipeAction(i29) == 1) {
                            if (this.O0 > 0 || this.P0) {
                                i10 = R.string.SwipeMarkAsRead;
                                string = LocaleController.getString(i10);
                                this.u1 = org.telegram.ui.ActionBar.g6.L1;
                            } else {
                                i10 = R.string.SwipeMarkAsUnread;
                                string = LocaleController.getString(i10);
                                this.u1 = org.telegram.ui.ActionBar.g6.M1;
                            }
                        } else if (SharedConfig.getChatSwipeAction(i29) != 0) {
                            i10 = R.string.Archive;
                            string = LocaleController.getString(i10);
                            this.u1 = org.telegram.ui.ActionBar.g6.v1;
                        } else if (getIsPinned()) {
                            i10 = R.string.SwipeUnpin;
                            string = LocaleController.getString(i10);
                            this.u1 = org.telegram.ui.ActionBar.g6.O1;
                        } else {
                            i10 = R.string.SwipePin;
                            string = LocaleController.getString(i10);
                            this.u1 = org.telegram.ui.ActionBar.g6.N1;
                        }
                    }
                } else {
                    v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d9, c6Var5);
                    v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.c9, c6Var5);
                    i10 = R.string.Unarchive;
                    string = LocaleController.getString(i10);
                    this.u1 = org.telegram.ui.ActionBar.g6.w1;
                }
            }
            int i30 = i10;
            i12 = v03;
            i11 = i30;
            str = string;
            if (this.w) {
            }
            this.s = this.u1;
            this.v = i11;
            if (!this.v1) {
                this.v1 = true;
                this.u1.Q(0.0f, true);
                this.u1.setCallback(this);
                this.u1.start();
            }
            float measuredWidth3 = getMeasuredWidth() + this.s1;
            if (this.x1 >= f10) {
            }
            int measuredWidth22 = (getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (this.u1.getIntrinsicWidth() / 2);
            int x82 = rl.x(52.0f, getMeasuredHeight(), 2);
            int intrinsicWidth2 = (this.u1.getIntrinsicWidth() / 2) + measuredWidth22;
            int intrinsicHeight2 = (this.u1.getIntrinsicHeight() / 2) + x82;
            if (this.x1 <= f11) {
            }
            canvas3.save();
            canvas3.translate(measuredWidth22, x82);
            f14 = this.y1;
            if (f14 != 0.0f) {
            }
            b0Var3 = b0Var2;
            a0.p(0, 0, this.u1);
            this.u1.draw(canvas3);
            canvas3.restore();
            canvas3.clipRect(f13, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            str4 = str3;
            ceil = (int) Math.ceil(org.telegram.ui.ActionBar.g6.M0.measureText(str4));
            i15 = i14;
            if (this.x4 == i15) {
            }
            this.x4 = i15;
            this.y4 = getMeasuredWidth();
            TextPaint textPaint2 = org.telegram.ui.ActionBar.g6.N0;
            int min2 = Math.min(AndroidUtilities.dp(80.0f), ceil);
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
            staticLayout = new StaticLayout(str4, textPaint2, min2, alignment2, 1.0f, 0.0f, false);
            this.w4 = staticLayout;
            if (staticLayout.getLineCount() > 1) {
            }
            if (this.w4 == null) {
            }
            canvas3.restore();
        }
        if (this.s1 != 0.0f) {
            canvas3.save();
            canvas3.translate(this.s1, 0.0f);
            f15 = 0.0f + this.s1;
        } else {
            f15 = 0.0f;
        }
        float dp2 = AndroidUtilities.dp(8.0f) * this.k1;
        boolean z27 = this.i4;
        RectF rectF2 = this.j4;
        if (z27) {
            f16 = 0.0f;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), getCollapsedHeight(), this.e0));
            rectF2.offset(0.0f, (-this.A3) + this.y0);
            canvas3.drawRoundRect(rectF2, dp2, dp2, org.telegram.ui.ActionBar.g6.u0);
        } else {
            f16 = 0.0f;
        }
        canvas3.save();
        canvas3.translate(f16, (-this.n) * this.e0);
        if (this.F0 == 0 || (SharedConfig.archiveHidden && this.z1 == f16)) {
            c6Var2 = c6Var;
            if (getIsPinned() || this.v3) {
                org.telegram.ui.ActionBar.g6.v0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.s9, c6Var2));
                org.telegram.ui.ActionBar.g6.v0.setAlpha((int) ((1.0f - this.e0) * r3.getAlpha()));
            }
        } else {
            c6Var2 = c6Var;
            org.telegram.ui.ActionBar.g6.v0.setColor(AndroidUtilities.getOffsetColor(0, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.s9, c6Var2), this.z1, 1.0f));
            org.telegram.ui.ActionBar.g6.v0.setAlpha((int) ((1.0f - this.e0) * r3.getAlpha()));
        }
        canvas3.restore();
        m2 m2Var4 = this.A4;
        m2Var4.b();
        if (this.y0 != 0.0f) {
            canvas3.save();
            canvas3.translate(0.0f, this.y0);
            f17 = this.y0 + 0.0f;
        } else {
            f17 = 0.0f;
        }
        float f30 = this.e0;
        if (f30 != 1.0f) {
            if (f30 != 0.0f) {
                float clamp = Utilities.clamp(f30 / 0.4f, 1.0f, 0.0f);
                if (SharedConfig.getDevicePerformanceClass() >= 2) {
                    m2Var = m2Var4;
                    f21 = 1.0f;
                    i17 = -1;
                    f22 = 2.0f;
                    i18 = canvas3.saveLayerAlpha(pa.b(1.0f, clamp, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(g31.getRightPaddingSize() + 1)), 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.e0) * 255.0f), 31);
                } else {
                    m2Var = m2Var4;
                    f21 = 1.0f;
                    i17 = -1;
                    f22 = 2.0f;
                    i18 = canvas3.save();
                    canvas3.clipRect(pa.b(1.0f, clamp, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(g31.getRightPaddingSize() + 1)), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas3.translate((-(getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * this.e0, 0.0f);
                f15 += (-(getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * this.e0;
            } else {
                m2Var = m2Var4;
                f21 = 1.0f;
                i17 = -1;
                f22 = 2.0f;
                i18 = -1;
            }
            float f31 = f15;
            if (this.s1 != 0.0f || this.k1 != 0.0f) {
                canvas3.save();
                org.telegram.ui.ActionBar.g6.v0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var2));
                rectF2.set(getMeasuredWidth() - AndroidUtilities.dp(64.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF2.offset(0.0f, -this.A3);
                canvas3.drawRoundRect(rectF2, dp2, dp2, org.telegram.ui.ActionBar.g6.v0);
                if (this.i4) {
                    canvas3.drawRoundRect(rectF2, dp2, dp2, org.telegram.ui.ActionBar.g6.u0);
                }
                if (this.F0 != 0 && (!SharedConfig.archiveHidden || this.z1 != 0.0f)) {
                    org.telegram.ui.ActionBar.g6.v0.setColor(AndroidUtilities.getOffsetColor(0, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.s9, c6Var2), this.z1, f21));
                    org.telegram.ui.ActionBar.g6.v0.setAlpha((int) ((f21 - this.e0) * r0.getAlpha()));
                } else if (getIsPinned() || this.v3) {
                    org.telegram.ui.ActionBar.g6.v0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.s9, c6Var2));
                    org.telegram.ui.ActionBar.g6.v0.setAlpha((int) ((f21 - this.e0) * r0.getAlpha()));
                }
                canvas3.restore();
            }
            if (this.s1 != 0.0f) {
                float f32 = this.k1;
                if (f32 < f21) {
                    float f33 = f32 + 0.10666667f;
                    this.k1 = f33;
                    if (f33 > f21) {
                        this.k1 = f21;
                    }
                    z14 = true;
                }
                z14 = false;
            } else {
                float f34 = this.k1;
                if (f34 > 0.0f) {
                    float f35 = f34 - 0.10666667f;
                    this.k1 = f35;
                    if (f35 < 0.0f) {
                        this.k1 = 0.0f;
                    }
                    z14 = true;
                }
                z14 = false;
            }
            if (this.C2) {
                a0.p(this.F2, this.G2, org.telegram.ui.ActionBar.g6.a1);
                org.telegram.ui.ActionBar.g6.a1.draw(canvas3);
            }
            boolean z28 = this.n2;
            int dp3 = AndroidUtilities.dp((z28 || SharedConfig.useThreeLinesLayout) ? 10.0f : 14.0f);
            if (((!z28 && !SharedConfig.useThreeLinesLayout) || Q()) && M()) {
                dp3 -= AndroidUtilities.dp(Q() ? 8.0f : 9.0f);
            }
            if (this.v2 != null) {
                if (!this.z2 || this.w2) {
                    i19 = i18;
                    f23 = 24.0f;
                } else {
                    if (this.y2 && this.A2 == null) {
                        Paint paint = new Paint();
                        this.A2 = paint;
                        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{i17, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        this.A2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    } else if (this.B2 == null) {
                        Paint paint2 = new Paint();
                        this.B2 = paint2;
                        paint2.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{0, i17}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        this.B2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    f23 = 24.0f;
                    i19 = i18;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    int i31 = this.t2;
                    canvas3.clipRect(i31, 0, this.u2 + i31, getMeasuredHeight());
                }
                if (this.F0 != 0) {
                    TextPaint textPaint3 = org.telegram.ui.ActionBar.g6.B0[this.A0];
                    int v04 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Y8, c6Var2);
                    textPaint3.linkColor = v04;
                    textPaint3.setColor(v04);
                } else if (this.d2 != null || ((k2Var = this.C0) != null && k2Var.g == 2)) {
                    TextPaint textPaint4 = org.telegram.ui.ActionBar.g6.B0[this.A0];
                    int v05 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Z8, c6Var2);
                    textPaint4.linkColor = v05;
                    textPaint4.setColor(v05);
                } else {
                    TextPaint textPaint5 = org.telegram.ui.ActionBar.g6.B0[this.A0];
                    int v06 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.X8, c6Var2);
                    textPaint5.linkColor = v06;
                    textPaint5.setColor(v06);
                }
                canvas3.save();
                canvas3.translate(this.t2 + this.x2, dp3);
                eh.k.f(canvas3, this.v2);
                StaticLayout staticLayout3 = this.v2;
                z18 = z28;
                m2Var2 = m2Var;
                i20 = 1;
                i21 = -1;
                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas3, staticLayout3, this.l3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, K(0, staticLayout3.getPaint().getColor()));
                canvas3.restore();
                if (this.z2 && !this.w2) {
                    canvas3.save();
                    if (this.y2) {
                        canvas3.translate(this.t2, 0.0f);
                        canvas3.drawRect(0.0f, 0.0f, AndroidUtilities.dp(f23), getMeasuredHeight(), this.A2);
                    } else {
                        canvas3.translate((this.t2 + this.u2) - AndroidUtilities.dp(f23), 0.0f);
                        canvas3.drawRect(0.0f, 0.0f, AndroidUtilities.dp(f23), getMeasuredHeight(), this.B2);
                    }
                    canvas3.restore();
                    canvas3.restore();
                }
            } else {
                i19 = i18;
                z18 = z28;
                m2Var2 = m2Var;
                i20 = 1;
                f23 = 24.0f;
                i21 = -1;
            }
            if (this.J2 != null && this.F0 == 0) {
                canvas3.save();
                canvas3.translate(this.H2, this.I2);
                TextPaint timeTextPaint = getTimeTextPaint();
                if (getIsPinned()) {
                    canvas3.translate(AndroidUtilities.dp(20.0f), 0.0f);
                    float height = (this.J2.getHeight() / f22) - AndroidUtilities.dp(8.5f);
                    float f36 = -AndroidUtilities.dp(20.0f);
                    float dp4 = AndroidUtilities.dp(6.0f) + this.J2.getWidth();
                    Drawable drawable = (!this.C3 || N()) ? org.telegram.ui.ActionBar.g6.k1 : org.telegram.ui.ActionBar.g6.l1;
                    int dp5 = (int) (((AndroidUtilities.dp(17.0f) - drawable.getIntrinsicHeight()) / f22) + height);
                    int dp6 = AndroidUtilities.dp(4.0f) + ((int) f36);
                    drawable.setBounds(dp6, dp5, drawable.getIntrinsicWidth() + dp6, drawable.getIntrinsicHeight() + dp5);
                    int alpha = timeTextPaint.getAlpha();
                    timeTextPaint.setAlpha(27);
                    canvas3.drawRoundRect(f36, height, dp4, height + AndroidUtilities.dp(17.0f), AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), timeTextPaint);
                    timeTextPaint.setAlpha(alpha);
                    drawable.draw(canvas3);
                }
                int color = this.J2.getPaint().getColor();
                boolean z29 = color != timeTextPaint.getColor();
                if (z29) {
                    this.J2.getPaint().setColor(timeTextPaint.getColor());
                }
                eh.k.f(canvas3, this.J2);
                if (z29) {
                    this.J2.getPaint().setColor(color);
                }
                canvas3.restore();
            }
            if (F()) {
                org.telegram.ui.ActionBar.g6.b1.setBounds(this.K2, ((this.J2.getHeight() - org.telegram.ui.ActionBar.g6.b1.getIntrinsicHeight()) / 2) + this.I2, org.telegram.ui.ActionBar.g6.b1.getIntrinsicWidth() + this.K2, org.telegram.ui.ActionBar.g6.b1.getIntrinsicHeight() + ((this.J2.getHeight() - org.telegram.ui.ActionBar.g6.b1.getIntrinsicHeight()) / 2) + this.I2);
                org.telegram.ui.ActionBar.g6.b1.draw(canvas3);
            }
            if (this.o3 != null && !Q()) {
                if (this.F0 != 0) {
                    TextPaint textPaint6 = org.telegram.ui.ActionBar.g6.G0;
                    int v07 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.n9, c6Var2);
                    textPaint6.linkColor = v07;
                    textPaint6.setColor(v07);
                } else if (this.h2 != null) {
                    TextPaint textPaint7 = org.telegram.ui.ActionBar.g6.G0;
                    int v08 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j9, c6Var2);
                    textPaint7.linkColor = v08;
                    textPaint7.setColor(v08);
                } else {
                    TextPaint textPaint8 = org.telegram.ui.ActionBar.g6.G0;
                    int v09 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.m9, c6Var2);
                    textPaint8.linkColor = v09;
                    textPaint8.setColor(v09);
                }
                canvas3.save();
                canvas3.translate(this.n3, this.m3);
                try {
                    eh.k.f(canvas3, this.o3);
                    StaticLayout staticLayout4 = this.o3;
                    org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas3, staticLayout4, this.j3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, K(i20, staticLayout4.getPaint().getColor()));
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                canvas3.restore();
            }
            if (this.a3 != null) {
                if (this.F0 == 0) {
                    TextPaint textPaint9 = org.telegram.ui.ActionBar.g6.F0[this.A0];
                    int v010 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.g9, c6Var2);
                    textPaint9.linkColor = v010;
                    textPaint9.setColor(v010);
                } else if (this.c2 != null) {
                    TextPaint textPaint10 = org.telegram.ui.ActionBar.g6.F0[this.A0];
                    int v011 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.l9, c6Var2);
                    textPaint10.linkColor = v011;
                    textPaint10.setColor(v011);
                } else {
                    TextPaint textPaint11 = org.telegram.ui.ActionBar.g6.F0[this.A0];
                    int v012 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h9, c6Var2);
                    textPaint11.linkColor = v012;
                    textPaint11.setColor(v012);
                }
                float dp7 = AndroidUtilities.dp(14.0f);
                m2 m2Var5 = m2Var2;
                float f37 = m2Var5.m ? this.W2 - (m2Var5.l * dp7) : this.W2 + (m2Var5.l * dp7);
                if (((!z18 && !SharedConfig.useThreeLinesLayout) || Q()) && M()) {
                    f37 -= AndroidUtilities.dp(Q() ? 10.0f : 11.0f);
                }
                if (m2Var5.l != 1.0f) {
                    canvas3.save();
                    canvas3.translate(this.X2, f37);
                    int alpha2 = this.a3.getPaint().getAlpha();
                    this.a3.getPaint().setAlpha((int) ((1.0f - m2Var5.l) * alpha2));
                    ArrayList arrayList = this.f3;
                    if (arrayList.isEmpty()) {
                        f27 = dp7;
                        rectF = rectF2;
                        c6Var4 = c6Var2;
                        b0Var4 = b0Var3;
                        f24 = 1.0f;
                        m2Var3 = m2Var5;
                        i25 = alpha2;
                        eh.k.f(canvas3, this.a3);
                        StaticLayout staticLayout5 = this.a3;
                        org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas3, staticLayout5, this.i3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, K(2, staticLayout5.getPaint().getColor()));
                    } else {
                        try {
                            canvas3.save();
                            eh.k.d(canvas3, arrayList);
                            eh.k.f(canvas3, this.a3);
                        } catch (Exception e10) {
                            e = e10;
                            f27 = dp7;
                        }
                        try {
                            StaticLayout staticLayout6 = this.a3;
                            try {
                                b0Var4 = b0Var3;
                                i25 = alpha2;
                                f27 = dp7;
                                rectF = rectF2;
                                c6Var4 = c6Var2;
                                m2Var3 = m2Var5;
                                f24 = 1.0f;
                            } catch (Exception e11) {
                                e = e11;
                                f27 = dp7;
                                rectF = rectF2;
                                c6Var4 = c6Var2;
                                b0Var4 = b0Var3;
                                m2Var3 = m2Var5;
                                f24 = 1.0f;
                                i25 = alpha2;
                                FileLog.e(e);
                                this.a3.getPaint().setAlpha(i25);
                                canvas3.restore();
                                canvas3.save();
                                if (!m2Var3.m) {
                                }
                                if (!z18) {
                                    z24 -= AndroidUtilities.dp(Q() ? 10.0f : 11.0f);
                                    canvas3.translate(this.Z2, z24);
                                    staticLayout2 = this.b3;
                                    if (staticLayout2 != null) {
                                        int alpha3 = staticLayout2.getPaint().getAlpha();
                                        this.b3.getPaint().setAlpha((int) (alpha3 * m2Var3.l));
                                        this.b3.draw(canvas3);
                                        this.b3.getPaint().setAlpha(alpha3);
                                    }
                                    canvas3.restore();
                                    if (this.b3 != null) {
                                        if (i24 < 0) {
                                        }
                                        t02 = org.telegram.ui.ActionBar.g6.t0(i24);
                                        if (t02 != null) {
                                        }
                                    }
                                    if (this.d3 != null) {
                                    }
                                    if (this.F0 == 0) {
                                    }
                                    float f38 = 12.5f;
                                    if (p2Var3.c4) {
                                    }
                                    c6Var3 = c6Var4;
                                    if (p2Var3.X0) {
                                    }
                                    if (p2Var3.f1 != 2) {
                                    }
                                    i16 = 17;
                                    if (!p2Var3.b4) {
                                    }
                                    z13 = false;
                                    if (!p2Var3.u3) {
                                    }
                                    if (!LocaleController.isRTL) {
                                    }
                                    org.telegram.ui.ActionBar.g6.Z0.setAlpha((int) (p2Var3.t3 * 255.0f));
                                    a0.p(p2Var3.z3, p2Var3.y3, org.telegram.ui.ActionBar.g6.Z0);
                                    org.telegram.ui.ActionBar.g6.Z0.draw(canvas3);
                                    float f39 = p2Var3.K3.e;
                                    if (p2Var3.p3) {
                                    }
                                    p2Var = p2Var3;
                                    f18 = 1.0f;
                                    if (p2Var.N1 > 0) {
                                    }
                                    wrVar = p2Var.p0;
                                    if (wrVar != null) {
                                    }
                                    i22 = i19;
                                    r12 = z19;
                                    if (i22 != -1) {
                                    }
                                    z15 = p2Var.X1;
                                    imageReceiver = p2Var.U1;
                                    if (z15) {
                                    }
                                    z16 = p2Var.x;
                                    i2Var = p2Var.q0;
                                    if (z16) {
                                        if (!p2Var.y) {
                                        }
                                        if (!p2Var.K0) {
                                            float centerX = i2Var.F.centerX() + AndroidUtilities.dp(20.33f);
                                            float centerY = i2Var.F.centerY() + AndroidUtilities.dp(19.0f);
                                            if (p2Var.z0 == null) {
                                            }
                                            gf.s.d(p2Var.z0, centerX, centerY, i16);
                                            canvas3.drawCircle(p2Var.z0.getBounds().exactCenterX(), p2Var.z0.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.g6.l0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var3)));
                                            p2Var.z0.draw(canvas3);
                                        }
                                    }
                                    if (p2Var.X1) {
                                    }
                                    if (imageReceiver.getVisible()) {
                                        z14 = true;
                                    }
                                    if (p2Var.e0 > 0.0f) {
                                    }
                                    p2Var2 = p2Var;
                                    if (p2Var2.y0 != 0.0f) {
                                    }
                                    if (p2Var2.s1 != 0.0f) {
                                    }
                                    if (z11) {
                                        canvas3.save();
                                        canvas3.translate(0.0f, (-p2Var2.A3) - (p2Var2.n * p2Var2.e0));
                                        canvas3.clipRect(0.0f, (f18 - p2Var2.a2.J) * p2Var2.getMeasuredHeight(), p2Var2.getMeasuredWidth(), p2Var2.getMeasuredHeight());
                                        p2Var2.a2.c(canvas3, r12);
                                        canvas3.restore();
                                    }
                                    if (p2Var2.o2) {
                                    }
                                    f19 = 0.0f;
                                    if (p2Var2.p1 != f19) {
                                    }
                                    canvas2 = canvas;
                                    if (z26) {
                                    }
                                    z17 = p2Var2.u3;
                                    if (!z17) {
                                    }
                                    if (z17) {
                                    }
                                    z14 = true;
                                    if (p2Var2.i1) {
                                    }
                                }
                                z24 -= AndroidUtilities.dp(Q() ? 10.0f : 11.0f);
                                canvas3.translate(this.Z2, z24);
                                staticLayout2 = this.b3;
                                if (staticLayout2 != null) {
                                }
                                canvas3.restore();
                                if (this.b3 != null) {
                                }
                                if (this.d3 != null) {
                                }
                                if (this.F0 == 0) {
                                }
                                float f382 = 12.5f;
                                if (p2Var3.c4) {
                                }
                                c6Var3 = c6Var4;
                                if (p2Var3.X0) {
                                }
                                if (p2Var3.f1 != 2) {
                                }
                                i16 = 17;
                                if (!p2Var3.b4) {
                                }
                                z13 = false;
                                if (!p2Var3.u3) {
                                }
                                if (!LocaleController.isRTL) {
                                }
                                org.telegram.ui.ActionBar.g6.Z0.setAlpha((int) (p2Var3.t3 * 255.0f));
                                a0.p(p2Var3.z3, p2Var3.y3, org.telegram.ui.ActionBar.g6.Z0);
                                org.telegram.ui.ActionBar.g6.Z0.draw(canvas3);
                                float f392 = p2Var3.K3.e;
                                if (p2Var3.p3) {
                                }
                                p2Var = p2Var3;
                                f18 = 1.0f;
                                if (p2Var.N1 > 0) {
                                }
                                wrVar = p2Var.p0;
                                if (wrVar != null) {
                                }
                                i22 = i19;
                                r12 = z19;
                                if (i22 != -1) {
                                }
                                z15 = p2Var.X1;
                                imageReceiver = p2Var.U1;
                                if (z15) {
                                }
                                z16 = p2Var.x;
                                i2Var = p2Var.q0;
                                if (z16) {
                                }
                                if (p2Var.X1) {
                                }
                                if (imageReceiver.getVisible()) {
                                }
                                if (p2Var.e0 > 0.0f) {
                                }
                                p2Var2 = p2Var;
                                if (p2Var2.y0 != 0.0f) {
                                }
                                if (p2Var2.s1 != 0.0f) {
                                }
                                if (z11) {
                                }
                                if (p2Var2.o2) {
                                }
                                f19 = 0.0f;
                                if (p2Var2.p1 != f19) {
                                }
                                canvas2 = canvas;
                                if (z26) {
                                }
                                z17 = p2Var2.u3;
                                if (!z17) {
                                }
                                if (z17) {
                                }
                                z14 = true;
                                if (p2Var2.i1) {
                                }
                            }
                            try {
                                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas3, staticLayout6, this.i3, -0.075f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, K(2, staticLayout6.getPaint().getColor()));
                                canvas3.restore();
                                for (int i32 = 0; i32 < arrayList.size(); i32++) {
                                    eh.k kVar = (eh.k) arrayList.get(i32);
                                    kVar.h(this.a3.getPaint().getColor());
                                    kVar.draw(canvas3);
                                }
                            } catch (Exception e12) {
                                e = e12;
                                FileLog.e(e);
                                this.a3.getPaint().setAlpha(i25);
                                canvas3.restore();
                                canvas3.save();
                                if (!m2Var3.m) {
                                }
                                if (!z18) {
                                }
                                z24 -= AndroidUtilities.dp(Q() ? 10.0f : 11.0f);
                                canvas3.translate(this.Z2, z24);
                                staticLayout2 = this.b3;
                                if (staticLayout2 != null) {
                                }
                                canvas3.restore();
                                if (this.b3 != null) {
                                }
                                if (this.d3 != null) {
                                }
                                if (this.F0 == 0) {
                                }
                                float f3822 = 12.5f;
                                if (p2Var3.c4) {
                                }
                                c6Var3 = c6Var4;
                                if (p2Var3.X0) {
                                }
                                if (p2Var3.f1 != 2) {
                                }
                                i16 = 17;
                                if (!p2Var3.b4) {
                                }
                                z13 = false;
                                if (!p2Var3.u3) {
                                }
                                if (!LocaleController.isRTL) {
                                }
                                org.telegram.ui.ActionBar.g6.Z0.setAlpha((int) (p2Var3.t3 * 255.0f));
                                a0.p(p2Var3.z3, p2Var3.y3, org.telegram.ui.ActionBar.g6.Z0);
                                org.telegram.ui.ActionBar.g6.Z0.draw(canvas3);
                                float f3922 = p2Var3.K3.e;
                                if (p2Var3.p3) {
                                }
                                p2Var = p2Var3;
                                f18 = 1.0f;
                                if (p2Var.N1 > 0) {
                                }
                                wrVar = p2Var.p0;
                                if (wrVar != null) {
                                }
                                i22 = i19;
                                r12 = z19;
                                if (i22 != -1) {
                                }
                                z15 = p2Var.X1;
                                imageReceiver = p2Var.U1;
                                if (z15) {
                                }
                                z16 = p2Var.x;
                                i2Var = p2Var.q0;
                                if (z16) {
                                }
                                if (p2Var.X1) {
                                }
                                if (imageReceiver.getVisible()) {
                                }
                                if (p2Var.e0 > 0.0f) {
                                }
                                p2Var2 = p2Var;
                                if (p2Var2.y0 != 0.0f) {
                                }
                                if (p2Var2.s1 != 0.0f) {
                                }
                                if (z11) {
                                }
                                if (p2Var2.o2) {
                                }
                                f19 = 0.0f;
                                if (p2Var2.p1 != f19) {
                                }
                                canvas2 = canvas;
                                if (z26) {
                                }
                                z17 = p2Var2.u3;
                                if (!z17) {
                                }
                                if (z17) {
                                }
                                z14 = true;
                                if (p2Var2.i1) {
                                }
                            }
                        } catch (Exception e13) {
                            e = e13;
                            f27 = dp7;
                            rectF = rectF2;
                            c6Var4 = c6Var2;
                            b0Var4 = b0Var3;
                            f24 = 1.0f;
                            m2Var3 = m2Var5;
                            i25 = alpha2;
                            FileLog.e(e);
                            this.a3.getPaint().setAlpha(i25);
                            canvas3.restore();
                            canvas3.save();
                            if (!m2Var3.m) {
                            }
                            if (!z18) {
                            }
                            z24 -= AndroidUtilities.dp(Q() ? 10.0f : 11.0f);
                            canvas3.translate(this.Z2, z24);
                            staticLayout2 = this.b3;
                            if (staticLayout2 != null) {
                            }
                            canvas3.restore();
                            if (this.b3 != null) {
                            }
                            if (this.d3 != null) {
                            }
                            if (this.F0 == 0) {
                            }
                            float f38222 = 12.5f;
                            if (p2Var3.c4) {
                            }
                            c6Var3 = c6Var4;
                            if (p2Var3.X0) {
                            }
                            if (p2Var3.f1 != 2) {
                            }
                            i16 = 17;
                            if (!p2Var3.b4) {
                            }
                            z13 = false;
                            if (!p2Var3.u3) {
                            }
                            if (!LocaleController.isRTL) {
                            }
                            org.telegram.ui.ActionBar.g6.Z0.setAlpha((int) (p2Var3.t3 * 255.0f));
                            a0.p(p2Var3.z3, p2Var3.y3, org.telegram.ui.ActionBar.g6.Z0);
                            org.telegram.ui.ActionBar.g6.Z0.draw(canvas3);
                            float f39222 = p2Var3.K3.e;
                            if (p2Var3.p3) {
                            }
                            p2Var = p2Var3;
                            f18 = 1.0f;
                            if (p2Var.N1 > 0) {
                            }
                            wrVar = p2Var.p0;
                            if (wrVar != null) {
                            }
                            i22 = i19;
                            r12 = z19;
                            if (i22 != -1) {
                            }
                            z15 = p2Var.X1;
                            imageReceiver = p2Var.U1;
                            if (z15) {
                            }
                            z16 = p2Var.x;
                            i2Var = p2Var.q0;
                            if (z16) {
                            }
                            if (p2Var.X1) {
                            }
                            if (imageReceiver.getVisible()) {
                            }
                            if (p2Var.e0 > 0.0f) {
                            }
                            p2Var2 = p2Var;
                            if (p2Var2.y0 != 0.0f) {
                            }
                            if (p2Var2.s1 != 0.0f) {
                            }
                            if (z11) {
                            }
                            if (p2Var2.o2) {
                            }
                            f19 = 0.0f;
                            if (p2Var2.p1 != f19) {
                            }
                            canvas2 = canvas;
                            if (z26) {
                            }
                            z17 = p2Var2.u3;
                            if (!z17) {
                            }
                            if (z17) {
                            }
                            z14 = true;
                            if (p2Var2.i1) {
                            }
                        }
                    }
                    this.a3.getPaint().setAlpha(i25);
                    canvas3.restore();
                } else {
                    f27 = dp7;
                    rectF = rectF2;
                    c6Var4 = c6Var2;
                    b0Var4 = b0Var3;
                    f24 = 1.0f;
                    m2Var3 = m2Var5;
                }
                canvas3.save();
                z24 = !m2Var3.m ? com.google.android.recaptcha.internal.a.z(f24, m2Var3.l, f27, this.W2) : pa.b(f24, m2Var3.l, f27, this.W2);
                if (((!z18 && !SharedConfig.useThreeLinesLayout) || Q()) && M()) {
                    z24 -= AndroidUtilities.dp(Q() ? 10.0f : 11.0f);
                }
                canvas3.translate(this.Z2, z24);
                staticLayout2 = this.b3;
                if (staticLayout2 != null && m2Var3.l > 0.0f) {
                    int alpha32 = staticLayout2.getPaint().getAlpha();
                    this.b3.getPaint().setAlpha((int) (alpha32 * m2Var3.l));
                    this.b3.draw(canvas3);
                    this.b3.getPaint().setAlpha(alpha32);
                }
                canvas3.restore();
                if (this.b3 != null && ((i24 = this.f2) >= 0 || (m2Var3.l > 0.0f && m2Var3.n >= 0))) {
                    if (i24 < 0) {
                        i24 = m2Var3.n;
                    }
                    t02 = org.telegram.ui.ActionBar.g6.t0(i24);
                    if (t02 != null) {
                        canvas3.save();
                        t02.b(i0.b.k(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.p9), (int) (Color.alpha(r4) * m2Var3.l)));
                        float z30 = m2Var3.m ? com.google.android.recaptcha.internal.a.z(f24, m2Var3.l, f27, this.W2) : pa.b(f24, m2Var3.l, f27, this.W2);
                        if (((!z18 && !SharedConfig.useThreeLinesLayout) || Q()) && M()) {
                            z30 -= AndroidUtilities.dp(Q() ? 10.0f : 11.0f);
                        }
                        if (i24 == 1 || i24 == 4) {
                            canvas3.translate(this.u4, z30 + (i24 == 1 ? AndroidUtilities.dp(f24) : 0));
                        } else {
                            canvas3.translate(this.u4, ((AndroidUtilities.dp(18.0f) - t02.getIntrinsicHeight()) / f22) + z30);
                        }
                        t02.draw(canvas3);
                        invalidate();
                        canvas3.restore();
                    }
                }
            } else {
                rectF = rectF2;
                c6Var4 = c6Var2;
                b0Var4 = b0Var3;
                m2Var3 = m2Var2;
                f24 = 1.0f;
            }
            if (this.d3 != null) {
                canvas3.save();
                if (this.U == null) {
                    this.U = new Paint(1);
                }
                if (this.V == null) {
                    tc tcVar = new tc(this);
                    this.V = tcVar;
                    z23 = false;
                    final boolean z31 = false ? 1 : 0;
                    tcVar.e(new Runnable(this) { // from class: org.telegram.ui.Cells.g2
                        public final /* synthetic */ p2 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (z31) {
                                case 0:
                                    p2 p2Var4 = this.b;
                                    l2 l2Var = p2Var4.W;
                                    if (l2Var != null) {
                                        l2Var.d(p2Var4);
                                        break;
                                    }
                                    break;
                                default:
                                    p2 p2Var5 = this.b;
                                    l2 l2Var2 = p2Var5.W;
                                    if (l2Var2 != null) {
                                        l2Var2.a(p2Var5);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    tc tcVar2 = this.V;
                    final int i33 = 1;
                    Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.Cells.g2
                        public final /* synthetic */ p2 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i33) {
                                case 0:
                                    p2 p2Var4 = this.b;
                                    l2 l2Var = p2Var4.W;
                                    if (l2Var != null) {
                                        l2Var.d(p2Var4);
                                        break;
                                    }
                                    break;
                                default:
                                    p2 p2Var5 = this.b;
                                    l2 l2Var2 = p2Var5.W;
                                    if (l2Var2 != null) {
                                        l2Var2.a(p2Var5);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    tcVar2.l = true;
                    tcVar2.j = runnable;
                } else {
                    z23 = false;
                }
                if (this.b0 && this.E4 != 0 && ((i23 = this.f1) == 0 || i23 == 7 || i23 == 8)) {
                    this.V.d(i0.b.k(this.T.getColor(), org.telegram.ui.ActionBar.g6.e1() ? 36 : 26));
                    tc tcVar3 = this.V;
                    tcVar3.i = z23;
                    tcVar3.c = z23 ? 1 : 0;
                    int i34 = this.E4;
                    if (i34 != 0 && i34 > 0) {
                        float f40 = this.W2;
                        if (((!z18 && !SharedConfig.useThreeLinesLayout) || Q()) && M()) {
                            f40 -= AndroidUtilities.dp(Q() ? 10.0f : 11.0f);
                        }
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        float primaryHorizontal = this.a3.getPrimaryHorizontal(z23 ? 1 : 0) + AndroidUtilities.dp(f22) + this.X2;
                        float f41 = this.X2;
                        StaticLayout staticLayout7 = this.a3;
                        rectF3.set(primaryHorizontal, f40, (staticLayout7.getPrimaryHorizontal(Math.min(staticLayout7.getText().length(), this.E4)) + f41) - AndroidUtilities.dp(3.0f), this.c3 - AndroidUtilities.dp(4.0f));
                        rectF3.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
                        if (rectF3.right > rectF3.left) {
                            this.V.a(rectF3);
                        }
                    }
                    float lineLeft = this.d3.getLineLeft(z23 ? 1 : 0);
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.set(this.Y2 + lineLeft + AndroidUtilities.dp(f22), AndroidUtilities.dp(f22) + this.c3, this.d3.getLineWidth(z23 ? 1 : 0) + this.Y2 + lineLeft + AndroidUtilities.dp(12.0f), this.d3.getHeight() + this.c3);
                    rectF4.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(3.0f));
                    this.V.a(rectF4);
                    tc tcVar4 = this.V;
                    tcVar4.c(canvas3, tcVar4.g);
                    z zVar = tcVar4.e;
                    if (zVar != null) {
                        zVar.draw(canvas3);
                    }
                    org.telegram.ui.ActionBar.g6.t1.setAlpha(125);
                    a0.q(org.telegram.ui.ActionBar.g6.t1, rectF4.right - AndroidUtilities.dp(18.0f), com.google.android.recaptcha.internal.a.A(rectF4.height(), org.telegram.ui.ActionBar.g6.t1.getIntrinsicHeight(), 2.0f, rectF4.top));
                    org.telegram.ui.ActionBar.g6.t1.draw(canvas3);
                }
                canvas3.translate(this.Y2, this.c3);
                ArrayList arrayList2 = this.h3;
                if (arrayList2.isEmpty()) {
                    eh.k.f(canvas3, this.d3);
                    StaticLayout staticLayout8 = this.d3;
                    org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas3, staticLayout8, this.k3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, K(3, staticLayout8.getPaint().getColor()));
                } else {
                    try {
                        canvas3.save();
                        eh.k.d(canvas3, arrayList2);
                        eh.k.f(canvas3, this.d3);
                        StaticLayout staticLayout9 = this.d3;
                        org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas3, staticLayout9, this.k3, -0.075f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, K(3, staticLayout9.getPaint().getColor()));
                        canvas3.restore();
                        for (int i35 = 0; i35 < arrayList2.size(); i35++) {
                            eh.k kVar2 = (eh.k) arrayList2.get(i35);
                            kVar2.h(this.d3.getPaint().getColor());
                            kVar2.draw(canvas3);
                        }
                    } catch (Exception e14) {
                        FileLog.e(e14);
                    }
                }
                canvas.restore();
                z19 = z23;
            } else {
                z19 = false;
            }
            if (this.F0 == 0) {
                int i36 = (this.O2 ? 1 : 0) + (this.M2 ? 2 : 0) + (this.N2 ? 4 : 0);
                int i37 = this.p4;
                if (i37 >= 0 && i37 != i36 && !this.r4) {
                    B(i37, i36);
                }
                boolean z32 = this.r4;
                if (z32) {
                    i36 = this.n4;
                }
                boolean z33 = (i36 & 1) != 0;
                boolean z34 = (i36 & 2) != 0;
                boolean z35 = (i36 & 4) != 0;
                if (z32) {
                    int i38 = this.o4;
                    boolean z36 = (i38 & 1) != 0;
                    boolean z37 = (i38 & 2) != 0;
                    if ((i38 & 4) != 0) {
                        z21 = z35;
                        z22 = true;
                    } else {
                        z21 = z35;
                        z22 = false;
                    }
                    if (z33 || z36 || !z22 || z37 || !z34 || !z21) {
                        D(canvas, z36, z37, z22, false, f24 - this.q4);
                        D(canvas, z33, z34, z21, false, this.q4);
                    } else {
                        D(canvas, z33, z34, z21, true, this.q4);
                    }
                    p2Var3 = this;
                    canvas3 = canvas;
                } else {
                    canvas3 = canvas;
                    D(canvas3, z33, z34, z35, false, 1.0f);
                    p2Var3 = this;
                }
                p2Var3.p4 = (p2Var3.O2 ? 1 : 0) + (p2Var3.M2 ? 2 : 0) + (p2Var3.N2 ? 4 : 0);
            } else {
                canvas3 = canvas;
                p2Var3 = this;
            }
            float f382222 = 12.5f;
            if (p2Var3.c4) {
                int dp8 = AndroidUtilities.dp((z18 || SharedConfig.useThreeLinesLayout) ? 12.5f : 15.5f);
                if (((!z18 && !SharedConfig.useThreeLinesLayout) || p2Var3.Q()) && p2Var3.M()) {
                    dp8 -= AndroidUtilities.dp(9.0f);
                }
                org.telegram.ui.Components.i5 i5Var = p2Var3.g4;
                if (i5Var != null) {
                    i5Var.setBounds(p2Var3.t2 - AndroidUtilities.dp(19.0f), AndroidUtilities.dp(-1.0f) + dp8, p2Var3.t2 - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f) + dp8);
                    c6Var3 = c6Var4;
                    i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z9, c6Var3)));
                    i5Var.draw(canvas3);
                    boolean z38 = !p2Var3.X0 || p2Var3.V0 || p2Var3.M0;
                    if (p2Var3.f1 != 2 || ((!z38 && p2Var3.Y0 <= 0.0f) || p2Var3.b4 || p2Var3.h4 != 0)) {
                        i16 = 17;
                    } else {
                        if (z38) {
                            float f42 = p2Var3.Y0;
                            if (f42 != f24) {
                                float f43 = f42 + 0.10666667f;
                                p2Var3.Y0 = f43;
                                if (f43 > f24) {
                                    p2Var3.Y0 = f24;
                                } else {
                                    p2Var3.invalidate();
                                }
                                float dp9 = (!p2Var3.d4 ? p2Var3.E2 : p2Var3.D2) - AndroidUtilities.dp((!z18 || SharedConfig.useThreeLinesLayout) ? 0.0f : 1.0f);
                                float dp10 = AndroidUtilities.dp(!SharedConfig.useThreeLinesLayout ? 13.5f : 17.5f);
                                if (((!z18 && !SharedConfig.useThreeLinesLayout) || p2Var3.Q()) && p2Var3.M()) {
                                    dp10 -= AndroidUtilities.dp(p2Var3.Q() ? 8.0f : 9.0f);
                                }
                                a0.q(org.telegram.ui.ActionBar.g6.c1, dp9, dp10);
                                a0.q(org.telegram.ui.ActionBar.g6.d1, dp9, dp10);
                                i16 = 17;
                                gf.s.d(org.telegram.ui.ActionBar.g6.e1, org.telegram.ui.ActionBar.g6.c1.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.c1.getBounds().exactCenterY(), 17);
                                if (p2Var3.Y0 != f24) {
                                    canvas3.save();
                                    float f44 = p2Var3.Y0;
                                    canvas3.scale(f44, f44, org.telegram.ui.ActionBar.g6.c1.getBounds().centerX(), org.telegram.ui.ActionBar.g6.c1.getBounds().centerY());
                                    if (p2Var3.M0) {
                                        org.telegram.ui.ActionBar.g6.e1.setAlpha((int) (p2Var3.Y0 * 255.0f));
                                        org.telegram.ui.ActionBar.g6.e1.draw(canvas3);
                                        org.telegram.ui.ActionBar.g6.e1.setAlpha(255);
                                    } else if (p2Var3.X0) {
                                        org.telegram.ui.ActionBar.g6.d1.setAlpha((int) (p2Var3.Y0 * 255.0f));
                                        org.telegram.ui.ActionBar.g6.d1.draw(canvas3);
                                        org.telegram.ui.ActionBar.g6.d1.setAlpha(255);
                                    } else {
                                        org.telegram.ui.ActionBar.g6.c1.setAlpha((int) (p2Var3.Y0 * 255.0f));
                                        org.telegram.ui.ActionBar.g6.c1.draw(canvas3);
                                        org.telegram.ui.ActionBar.g6.c1.setAlpha(255);
                                    }
                                    canvas3.restore();
                                } else if (p2Var3.M0) {
                                    org.telegram.ui.ActionBar.g6.e1.draw(canvas3);
                                } else if (p2Var3.X0) {
                                    org.telegram.ui.ActionBar.g6.d1.draw(canvas3);
                                } else {
                                    org.telegram.ui.ActionBar.g6.c1.draw(canvas3);
                                }
                            }
                        }
                        if (!z38) {
                            float f45 = p2Var3.Y0;
                            if (f45 != 0.0f) {
                                float f46 = f45 - 0.10666667f;
                                p2Var3.Y0 = f46;
                                if (f46 < 0.0f) {
                                    p2Var3.Y0 = 0.0f;
                                } else {
                                    p2Var3.invalidate();
                                }
                            }
                        }
                        float dp92 = (!p2Var3.d4 ? p2Var3.E2 : p2Var3.D2) - AndroidUtilities.dp((!z18 || SharedConfig.useThreeLinesLayout) ? 0.0f : 1.0f);
                        float dp102 = AndroidUtilities.dp(!SharedConfig.useThreeLinesLayout ? 13.5f : 17.5f);
                        if (!z18) {
                            dp102 -= AndroidUtilities.dp(p2Var3.Q() ? 8.0f : 9.0f);
                            a0.q(org.telegram.ui.ActionBar.g6.c1, dp92, dp102);
                            a0.q(org.telegram.ui.ActionBar.g6.d1, dp92, dp102);
                            i16 = 17;
                            gf.s.d(org.telegram.ui.ActionBar.g6.e1, org.telegram.ui.ActionBar.g6.c1.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.c1.getBounds().exactCenterY(), 17);
                            if (p2Var3.Y0 != f24) {
                            }
                        }
                        dp102 -= AndroidUtilities.dp(p2Var3.Q() ? 8.0f : 9.0f);
                        a0.q(org.telegram.ui.ActionBar.g6.c1, dp92, dp102);
                        a0.q(org.telegram.ui.ActionBar.g6.d1, dp92, dp102);
                        i16 = 17;
                        gf.s.d(org.telegram.ui.ActionBar.g6.e1, org.telegram.ui.ActionBar.g6.c1.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.c1.getBounds().exactCenterY(), 17);
                        if (p2Var3.Y0 != f24) {
                        }
                    }
                    if (!p2Var3.b4) {
                        float dp11 = AndroidUtilities.dp((z18 || SharedConfig.useThreeLinesLayout) ? 13.5f : 16.5f);
                        if (((!z18 && !SharedConfig.useThreeLinesLayout) || p2Var3.Q()) && p2Var3.M()) {
                            dp11 -= AndroidUtilities.dp(9.0f);
                        }
                        a0.q(org.telegram.ui.ActionBar.g6.f1, p2Var3.D2 - AndroidUtilities.dp(f24), dp11);
                        a0.q(org.telegram.ui.ActionBar.g6.i1, p2Var3.D2 - AndroidUtilities.dp(f24), dp11);
                        org.telegram.ui.ActionBar.g6.f1.draw(canvas3);
                        org.telegram.ui.ActionBar.g6.i1.draw(canvas3);
                        s0Var2 = s0Var;
                    } else if (p2Var3.d4) {
                        int dp12 = AndroidUtilities.dp((z18 || SharedConfig.useThreeLinesLayout) ? 12.5f : 15.5f);
                        if (((!z18 && !SharedConfig.useThreeLinesLayout) || p2Var3.Q()) && p2Var3.M()) {
                            dp12 -= AndroidUtilities.dp(9.0f);
                        }
                        org.telegram.ui.Components.i5 i5Var2 = p2Var3.f4;
                        if (i5Var2 != null) {
                            s0Var2 = s0Var;
                            s0Var2.setTranslationX((f31 + p2Var3.D2) - AndroidUtilities.dp(2.0f));
                            s0Var2.setTranslationY((f17 + dp12) - AndroidUtilities.dp(4.0f));
                            if (p2Var3.e0 > 0.0f) {
                                i5Var2.setBounds(p2Var3.D2 - AndroidUtilities.dp(2.0f), dp12 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(20.0f) + p2Var3.D2, AndroidUtilities.dp(22.0f) + (dp12 - AndroidUtilities.dp(4.0f)));
                                i5Var2.draw(canvas3);
                                z20 = false;
                            } else {
                                z20 = true;
                            }
                            i5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z9, c6Var3)));
                        } else {
                            s0Var2 = s0Var;
                            Drawable drawable2 = ag.j2.d().e;
                            int dp13 = p2Var3.D2 - AndroidUtilities.dp(f24);
                            if (!z18 && !SharedConfig.useThreeLinesLayout) {
                                f382222 = 15.5f;
                            }
                            a0.p(dp13, AndroidUtilities.dp(f382222), drawable2);
                            drawable2.draw(canvas3);
                            z20 = false;
                        }
                        z13 = z20;
                        if (!p2Var3.u3 || p2Var3.t3 != 0.0f) {
                            if (!LocaleController.isRTL) {
                                Paint paintReorderGradient = p2Var3.getPaintReorderGradient();
                                paintReorderGradient.setAlpha((int) (p2Var3.t3 * 255.0f));
                                canvas3.save();
                                canvas3.translate(p2Var3.z3 - AndroidUtilities.dp(f23), p2Var3.y3);
                                canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.y1.A(24.0f, p2Var3.z3, p2Var3.getMeasuredWidth()), AndroidUtilities.dp(24.0f), paintReorderGradient);
                                canvas3 = canvas;
                                canvas3.restore();
                            }
                            org.telegram.ui.ActionBar.g6.Z0.setAlpha((int) (p2Var3.t3 * 255.0f));
                            a0.p(p2Var3.z3, p2Var3.y3, org.telegram.ui.ActionBar.g6.Z0);
                            org.telegram.ui.ActionBar.g6.Z0.draw(canvas3);
                        }
                        float f392222 = p2Var3.K3.e;
                        if (p2Var3.p3) {
                            org.telegram.ui.ActionBar.g6.Y0.setAlpha((int) ((f24 - p2Var3.t3) * 255.0f));
                            RectF rectF5 = rectF;
                            rectF5.set(p2Var3.r3, p2Var3.q3, AndroidUtilities.dp(20.666f) + r0, AndroidUtilities.dp(20.666f) + p2Var3.q3);
                            float f47 = AndroidUtilities.density * 10.5f;
                            canvas3.drawRoundRect(rectF5, f47, f47, org.telegram.ui.ActionBar.g6.x0);
                            a0.p(AndroidUtilities.dp(4.5f) + p2Var3.r3, AndroidUtilities.dp(5.0f) + p2Var3.q3, org.telegram.ui.ActionBar.g6.Y0);
                            org.telegram.ui.ActionBar.g6.Y0.draw(canvas3);
                        } else {
                            RectF rectF6 = rectF;
                            if (((p2Var3.C3 || p2Var3.T3) && p2Var3.D3) || p2Var3.N3 != f24 || p2Var3.U3 || p2Var3.O3 != f24 || p2Var3.V3 || f392222 > 0.0f) {
                                boolean N = p2Var3.N();
                                f18 = 1.0f;
                                canvas3 = canvas;
                                E(canvas3, N, p2Var3.E3, p2Var3.F3, p2Var3.I3, 1.0f, false);
                                p2Var = this;
                                if (p2Var.T3) {
                                    org.telegram.ui.ActionBar.g6.w0.setAlpha((int) ((1.0f - p2Var.t3) * 255.0f));
                                    if (p2Var.a4 != null) {
                                        rectF6.set(p2Var.W3, p2Var.E3, AndroidUtilities.dp(12.666f) + r1 + p2Var.Z3, AndroidUtilities.dp(20.666f) + p2Var.E3);
                                        canvas3.drawRoundRect(rectF6, rectF6.height() / 2.0f, rectF6.height() / 2.0f, (!N || p2Var.g1 == 0) ? org.telegram.ui.ActionBar.g6.w0 : org.telegram.ui.ActionBar.g6.y0);
                                        org.telegram.ui.ActionBar.g6.M0.setAlpha((int) ((1.0f - p2Var.t3) * 255.0f));
                                        canvas3.save();
                                        canvas3.translate(AndroidUtilities.dp(6.333f) + p2Var.W3, AndroidUtilities.dp(4.0f) + p2Var.E3);
                                        p2Var.a4.draw(canvas3);
                                        canvas3.restore();
                                    } else {
                                        Drawable drawable3 = org.telegram.ui.ActionBar.g6.m1;
                                        drawable3.setAlpha((int) ((1.0f - p2Var.t3) * 255.0f));
                                        gf.s.d(drawable3, AndroidUtilities.dp(10.333f) + p2Var.W3, AndroidUtilities.dp(10.333f) + p2Var.E3, i16);
                                        drawable3.draw(canvas3);
                                    }
                                }
                                if (p2Var.U3 || p2Var.O3 != 1.0f) {
                                    f25 = 10.333f;
                                    rectF6.set(p2Var.X3, p2Var.E3, AndroidUtilities.dp(20.666f) + r1, AndroidUtilities.dp(20.666f) + p2Var.E3);
                                    float f48 = p2Var.O3;
                                    if (f48 == 1.0f) {
                                        f48 = 1.0f;
                                    } else if (!p2Var.U3) {
                                        f48 = 1.0f - f48;
                                    }
                                    Drawable drawable4 = N ? org.telegram.ui.ActionBar.g6.q1 : org.telegram.ui.ActionBar.g6.n1;
                                    drawable4.setAlpha((int) ((1.0f - p2Var.t3) * 255.0f));
                                    gf.s.d(drawable4, AndroidUtilities.dp(10.333f) + r1, AndroidUtilities.dp(10.333f) + p2Var.E3, i16);
                                    gf.s.b(canvas3, drawable4, f48);
                                } else {
                                    f25 = 10.333f;
                                }
                                if ((p2Var.V3 || f392222 > 0.0f) && f392222 != 0.0f) {
                                    rectF6.set(p2Var.Y3, p2Var.E3, AndroidUtilities.dp(20.666f) + r1, AndroidUtilities.dp(20.666f) + p2Var.E3);
                                    Drawable drawable5 = N ? org.telegram.ui.ActionBar.g6.r1 : org.telegram.ui.ActionBar.g6.o1;
                                    drawable5.setAlpha((int) ((1.0f - p2Var.t3) * 255.0f));
                                    gf.s.d(drawable5, AndroidUtilities.dp(f25) + r1, AndroidUtilities.dp(f25) + p2Var.E3, i16);
                                    gf.s.b(canvas3, drawable5, f392222);
                                }
                                if (p2Var.N1 > 0) {
                                    float f49 = m2Var3.l;
                                    if (f49 != f18) {
                                        if (f49 > 0.0f) {
                                            canvas.saveLayerAlpha(0.0f, 0.0f, p2Var.getWidth(), p2Var.getHeight(), (int) ((f18 - f49) * 255.0f), 31);
                                            canvas3 = canvas;
                                            if (m2Var3.m) {
                                                dp = -AndroidUtilities.dp(14.0f);
                                                f26 = m2Var3.l;
                                            } else {
                                                dp = AndroidUtilities.dp(14.0f);
                                                f26 = m2Var3.l;
                                            }
                                            canvas3.translate(0.0f, dp * f26);
                                        }
                                        int i39 = 0;
                                        while (i39 < p2Var.N1) {
                                            if (p2Var.Q1[i39]) {
                                                if (p2Var.P1 == null) {
                                                    Paint paint3 = new Paint(1);
                                                    p2Var.P1 = paint3;
                                                    paint3.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                                    p2Var.P1.setColor(z19 ? 1 : 0);
                                                }
                                                RectF rectF7 = AndroidUtilities.rectTmp;
                                                ImageReceiver[] imageReceiverArr = p2Var.R1;
                                                rectF7.set(imageReceiverArr[i39].getImageX(), imageReceiverArr[i39].getImageY(), imageReceiverArr[i39].getImageX2(), imageReceiverArr[i39].getImageY2());
                                                imageReceiverArr[i39].draw(canvas3);
                                                if (p2Var.T1[i39]) {
                                                    Path path = p2Var.r0;
                                                    if (path == null) {
                                                        p2Var.r0 = new Path();
                                                    } else {
                                                        path.rewind();
                                                    }
                                                    p2Var.r0.addRoundRect(rectF7, imageReceiverArr[i39].getRoundRadius()[z19 ? 1 : 0], imageReceiverArr[i39].getRoundRadius()[1], Path.Direction.CW);
                                                    canvas3.save();
                                                    canvas3.clipPath(p2Var.r0);
                                                    if (p2Var.s0 == null) {
                                                        p2Var.s0 = new eh.k();
                                                    }
                                                    p2Var.s0.h(i0.b.k(-1, (int) (Color.alpha(i21) * 0.325f)));
                                                    p2Var.s0.setBounds((int) imageReceiverArr[i39].getImageX(), (int) imageReceiverArr[i39].getImageY(), (int) imageReceiverArr[i39].getImageX2(), (int) imageReceiverArr[i39].getImageY2());
                                                    p2Var.s0.draw(canvas3);
                                                    p2Var.invalidate();
                                                    canvas3.restore();
                                                }
                                                if (p2Var.S1[i39]) {
                                                    a0.p((int) (imageReceiverArr[i39].getCenterX() - (org.telegram.ui.ActionBar.g6.U0.getIntrinsicWidth() / 2)), (int) (imageReceiverArr[i39].getCenterY() - (org.telegram.ui.ActionBar.g6.U0.getIntrinsicHeight() / 2)), org.telegram.ui.ActionBar.g6.U0);
                                                    org.telegram.ui.ActionBar.g6.U0.draw(canvas3);
                                                }
                                            }
                                            i39++;
                                            i21 = -1;
                                        }
                                        if (m2Var3.l > 0.0f) {
                                            canvas3.restore();
                                        }
                                    }
                                }
                                wrVar = p2Var.p0;
                                if (wrVar != null && !wrVar.b()) {
                                    canvas3.save();
                                    canvas3.translate(p2Var.U2, (p2Var.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (p2Var.o2 ? 1 : 0));
                                    p2Var.p0.a(canvas3, p2Var.V2 - p2Var.U2);
                                    canvas3.restore();
                                }
                                i22 = i19;
                                r12 = z19;
                                if (i22 != -1) {
                                    canvas3.restoreToCount(i22);
                                    r12 = z19;
                                }
                            } else {
                                if (p2Var3.A1) {
                                    canvas3.save();
                                    float a2 = p2Var3.B1.a(0.05f);
                                    RectF rectF8 = p2Var3.D1;
                                    canvas3.scale(a2, a2, rectF8.centerX(), rectF8.centerY());
                                    p2Var3.C1.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var3));
                                    canvas3.drawRoundRect(rectF8, rectF8.height() / 2.0f, rectF8.height() / 2.0f, p2Var3.C1);
                                    pz0 pz0Var = p2Var3.E1;
                                    if (pz0Var != null) {
                                        pz0Var.c(rectF8.left + AndroidUtilities.dp(13.0f), rectF8.centerY(), 1.0f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var3), canvas);
                                    }
                                    canvas.restore();
                                }
                                canvas3 = canvas;
                            }
                        }
                        p2Var = p2Var3;
                        f18 = 1.0f;
                        if (p2Var.N1 > 0) {
                        }
                        wrVar = p2Var.p0;
                        if (wrVar != null) {
                            canvas3.save();
                            canvas3.translate(p2Var.U2, (p2Var.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (p2Var.o2 ? 1 : 0));
                            p2Var.p0.a(canvas3, p2Var.V2 - p2Var.U2);
                            canvas3.restore();
                        }
                        i22 = i19;
                        r12 = z19;
                        if (i22 != -1) {
                        }
                    } else {
                        s0Var2 = s0Var;
                        if (p2Var3.h4 != 0) {
                            int dp14 = AndroidUtilities.dp((z18 || SharedConfig.useThreeLinesLayout) ? 12.0f : 15.0f);
                            if (((!z18 && !SharedConfig.useThreeLinesLayout) || p2Var3.Q()) && p2Var3.M()) {
                                dp14 -= AndroidUtilities.dp(9.0f);
                            }
                            a0.p(p2Var3.D2, dp14, p2Var3.h4 == 1 ? org.telegram.ui.ActionBar.g6.g1 : org.telegram.ui.ActionBar.g6.h1);
                            (p2Var3.h4 == 1 ? org.telegram.ui.ActionBar.g6.g1 : org.telegram.ui.ActionBar.g6.h1).draw(canvas3);
                        }
                    }
                    z13 = false;
                    if (!p2Var3.u3) {
                    }
                    if (!LocaleController.isRTL) {
                    }
                    org.telegram.ui.ActionBar.g6.Z0.setAlpha((int) (p2Var3.t3 * 255.0f));
                    a0.p(p2Var3.z3, p2Var3.y3, org.telegram.ui.ActionBar.g6.Z0);
                    org.telegram.ui.ActionBar.g6.Z0.draw(canvas3);
                    float f3922222 = p2Var3.K3.e;
                    if (p2Var3.p3) {
                    }
                    p2Var = p2Var3;
                    f18 = 1.0f;
                    if (p2Var.N1 > 0) {
                    }
                    wrVar = p2Var.p0;
                    if (wrVar != null) {
                    }
                    i22 = i19;
                    r12 = z19;
                    if (i22 != -1) {
                    }
                }
            }
            c6Var3 = c6Var4;
            if (p2Var3.X0) {
            }
            if (p2Var3.f1 != 2) {
            }
            i16 = 17;
            if (!p2Var3.b4) {
            }
            z13 = false;
            if (!p2Var3.u3) {
            }
            if (!LocaleController.isRTL) {
            }
            org.telegram.ui.ActionBar.g6.Z0.setAlpha((int) (p2Var3.t3 * 255.0f));
            a0.p(p2Var3.z3, p2Var3.y3, org.telegram.ui.ActionBar.g6.Z0);
            org.telegram.ui.ActionBar.g6.Z0.draw(canvas3);
            float f39222222 = p2Var3.K3.e;
            if (p2Var3.p3) {
            }
            p2Var = p2Var3;
            f18 = 1.0f;
            if (p2Var.N1 > 0) {
            }
            wrVar = p2Var.p0;
            if (wrVar != null) {
            }
            i22 = i19;
            r12 = z19;
            if (i22 != -1) {
            }
        } else {
            p2Var = this;
            c6Var3 = c6Var2;
            b0Var4 = b0Var3;
            s0Var2 = s0Var;
            i16 = 17;
            r12 = 0;
            f18 = 1.0f;
            z13 = false;
            z14 = false;
        }
        z15 = p2Var.X1;
        imageReceiver = p2Var.U1;
        if (z15) {
            canvas3.save();
            float interpolation2 = b0Var4.getInterpolation(p2Var.Y1 / 170.0f) + f18;
            canvas3.scale(interpolation2, interpolation2, imageReceiver.getCenterX(), imageReceiver.getCenterY());
        }
        z16 = p2Var.x;
        i2Var = p2Var.q0;
        if (z16 && (!p2Var.L || (tL_forumTopic2 = p2Var.J) == null || tL_forumTopic2.id != 1 || (wh0Var = p2Var.a2) == null || !wh0Var.X || wh0Var.Y)) {
            if (!p2Var.y) {
                if (p2Var.V1 == null) {
                    p2Var.V1 = new ce0();
                }
                p2Var.V1.a((int) i2Var.F.centerX(), (int) i2Var.F.centerY(), (int) (i2Var.F.width() / 2.0f));
                canvas3.save();
                canvas3.clipPath(p2Var.V1);
                imageReceiver.setImageCoords(i2Var.F);
                imageReceiver.draw(canvas3);
                canvas3.restore();
            } else if (p2Var.A) {
                gf.s.f(imageReceiver, AndroidUtilities.dpf2(f18) + i2Var.F.centerX(), i2Var.F.centerY(), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
                gf.s.a(canvas3, org.telegram.ui.ActionBar.g6.S0, imageReceiver.getCenterX(), imageReceiver.getCenterY(), AndroidUtilities.dp(48.0f));
                imageReceiver.draw(canvas3);
            } else {
                boolean z39 = p2Var.B;
                i2Var.r = z39 || p2Var.F0 != 0;
                int i40 = i2Var.z;
                if (z39) {
                    i2Var.z = 1;
                }
                jh.l7.h(p2Var.D0, canvas3, imageReceiver, i2Var);
                if (i2Var.w) {
                    p2Var.y();
                }
                i2Var.z = i40;
            }
            if (!p2Var.K0 && ((((chat = p2Var.c2) != null && chat.linked_community_id != 0) || ((user = p2Var.b2) != null && user.linked_community_id != 0)) && !p2Var.A && p2Var.J0 && !p2Var.O())) {
                float centerX2 = i2Var.F.centerX() + AndroidUtilities.dp(20.33f);
                float centerY2 = i2Var.F.centerY() + AndroidUtilities.dp(19.0f);
                if (p2Var.z0 == null) {
                    p2Var.z0 = new oh.a();
                }
                gf.s.d(p2Var.z0, centerX2, centerY2, i16);
                canvas3.drawCircle(p2Var.z0.getBounds().exactCenterX(), p2Var.z0.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.g6.l0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var3)));
                p2Var.z0.draw(canvas3);
            }
        }
        if (p2Var.X1) {
            canvas3.restore();
        }
        if (imageReceiver.getVisible() && C(canvas)) {
            z14 = true;
        }
        if (p2Var.e0 > 0.0f || p2Var.F0 != 0) {
            p2Var2 = p2Var;
        } else {
            boolean N2 = p2Var.N();
            RectF rectF9 = i2Var.F;
            int width = (int) (((rectF9.width() + rectF9.left) - p2Var.G3) - AndroidUtilities.dp(5.0f));
            RectF rectF10 = i2Var.F;
            E(canvas3, N2, (int) ((i2Var.F.height() + imageReceiver.getImageY()) - AndroidUtilities.dp(22.0f)), width, (int) (((rectF10.width() + rectF10.left) - p2Var.H3) - AndroidUtilities.dp(5.0f)), p2Var.e0, true);
            p2Var2 = this;
        }
        if (p2Var2.y0 != 0.0f) {
            canvas3.restore();
        }
        if (p2Var2.s1 != 0.0f) {
            canvas3.restore();
        }
        if (z11 && ((p2Var2.F0 != 0 || (p2Var2.L && (tL_forumTopic = p2Var2.J) != null && tL_forumTopic.id == 1)) && p2Var2.s1 == 0.0f && p2Var2.a2 != null)) {
            canvas3.save();
            canvas3.translate(0.0f, (-p2Var2.A3) - (p2Var2.n * p2Var2.e0));
            canvas3.clipRect(0.0f, (f18 - p2Var2.a2.J) * p2Var2.getMeasuredHeight(), p2Var2.getMeasuredWidth(), p2Var2.getMeasuredHeight());
            p2Var2.a2.c(canvas3, r12);
            canvas3.restore();
        }
        if (p2Var2.o2) {
            int dp15 = (p2Var2.p2 || (p2Var2.F0 != 0 && p2Var2.i1)) ? 0 : AndroidUtilities.dp(p2Var2.E);
            if (p2Var2.e0 != f18) {
                int alpha4 = org.telegram.ui.ActionBar.g6.k0.getAlpha();
                float f50 = p2Var2.e0;
                if (f50 != 0.0f) {
                    org.telegram.ui.ActionBar.g6.k0.setAlpha((int) ((f18 - f50) * alpha4));
                }
                float measuredHeight = (p2Var2.getMeasuredHeight() - 1) - (p2Var2.n * p2Var2.e0);
                if (LocaleController.isRTL) {
                    canvas.drawLine(0.0f, measuredHeight, p2Var2.getMeasuredWidth() - dp15, measuredHeight, org.telegram.ui.ActionBar.g6.k0);
                } else {
                    canvas.drawLine(dp15, measuredHeight, p2Var2.getMeasuredWidth(), measuredHeight, org.telegram.ui.ActionBar.g6.k0);
                }
                f19 = 0.0f;
                if (p2Var2.e0 != 0.0f) {
                    org.telegram.ui.ActionBar.g6.k0.setAlpha(alpha4);
                }
                if (p2Var2.p1 != f19) {
                    if (Build.VERSION.SDK_INT != 24) {
                        canvas.restore();
                    } else {
                        org.telegram.ui.ActionBar.g6.v0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var3));
                        canvas.drawRect(0.0f, 0.0f, p2Var2.getMeasuredWidth(), p2Var2.q1 * p2Var2.p1, org.telegram.ui.ActionBar.g6.v0);
                        canvas.drawRect(0.0f, p2Var2.getMeasuredHeight() - ((int) (p2Var2.r1 * p2Var2.p1)), p2Var2.getMeasuredWidth(), p2Var2.getMeasuredHeight(), org.telegram.ui.ActionBar.g6.v0);
                        canvas2 = canvas;
                        if (z26) {
                            float f51 = f18 - f28;
                            int measuredHeight2 = (int) (p2Var2.getMeasuredHeight() * f51);
                            int u02 = org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.d6);
                            if (p2Var2.G4 == null) {
                                p2Var2.G4 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                            }
                            if (p2Var2.H4 != u02) {
                                p2Var2.H4 = u02;
                                p2Var2.G4.setColors(new int[]{u02, 16777215 & u02});
                            }
                            float a3 = h7.n.a((f51 - 0.05f) * 10.0f, 0.0f, 1.0f);
                            p2Var2.G4.setBounds(r12, measuredHeight2, p2Var2.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + measuredHeight2);
                            p2Var2.G4.setAlpha((int) (a3 * 255.0f));
                            p2Var2.G4.draw(canvas2);
                            canvas2.restore();
                        }
                        z17 = p2Var2.u3;
                        if (!z17 || p2Var2.t3 != 0.0f) {
                            if (z17) {
                                float f52 = p2Var2.t3;
                                if (f52 < 1.0f) {
                                    float f53 = f52 + 0.09411765f;
                                    p2Var2.t3 = f53;
                                    if (f53 > 1.0f) {
                                        p2Var2.t3 = 1.0f;
                                    }
                                    f20 = 0.0f;
                                }
                            } else {
                                float f54 = p2Var2.t3;
                                f20 = 0.0f;
                                if (f54 > 0.0f) {
                                    float f55 = f54 - 0.09411765f;
                                    p2Var2.t3 = f55;
                                    if (f55 < 0.0f) {
                                        p2Var2.t3 = 0.0f;
                                    }
                                }
                                if (p2Var2.i1) {
                                    float f56 = p2Var2.z1;
                                    if (f56 > f20) {
                                        float f57 = f56 - 0.069565214f;
                                        p2Var2.z1 = f57;
                                        if (f57 < f20) {
                                            p2Var2.z1 = f20;
                                        }
                                        org.telegram.ui.Components.y8 y8Var = p2Var2.W1;
                                        if (y8Var.n == 2) {
                                            y8Var.o = er.h.getInterpolation(p2Var2.z1);
                                        }
                                        z14 = true;
                                    }
                                    if (p2Var2.X1) {
                                        float f58 = p2Var2.Y1 + 16.0f;
                                        p2Var2.Y1 = f58;
                                        if (f58 >= 170.0f) {
                                            p2Var2.Y1 = 170.0f;
                                            p2Var2.X1 = r12;
                                        }
                                        z14 = true;
                                    }
                                    if (!p2Var2.w1) {
                                        float f59 = p2Var2.y1;
                                        if (f59 < 1.0f) {
                                            float f60 = f59 + 0.09411765f;
                                            p2Var2.y1 = f60;
                                            if (f60 > 1.0f) {
                                                p2Var2.y1 = 1.0f;
                                                z14 = true;
                                            }
                                        }
                                        float f61 = p2Var2.x1;
                                        if (f61 < 1.0f) {
                                            float f62 = f61 + 0.053333335f;
                                            p2Var2.x1 = f62;
                                            if (f62 > 1.0f) {
                                                p2Var2.x1 = 1.0f;
                                            }
                                            z14 = true;
                                        }
                                        s0Var2.setVisibility(!z13 ? 0 : 4);
                                        if (z14) {
                                            return;
                                        }
                                        p2Var2.invalidate();
                                        return;
                                    }
                                    if (p2Var2.y1 == 1.0f) {
                                        p2Var2.y1 = 0.0f;
                                        z14 = true;
                                    }
                                    float f63 = p2Var2.x1;
                                    if (f63 > 0.0f) {
                                        float f64 = f63 - 0.053333335f;
                                        p2Var2.x1 = f64;
                                        if (f64 < 0.0f) {
                                            p2Var2.x1 = 0.0f;
                                        }
                                        z14 = true;
                                    }
                                    s0Var2.setVisibility(!z13 ? 0 : 4);
                                    if (z14) {
                                    }
                                } else {
                                    float f65 = p2Var2.z1;
                                    if (f65 < 1.0f) {
                                        float f66 = f65 + 0.069565214f;
                                        p2Var2.z1 = f66;
                                        if (f66 > 1.0f) {
                                            p2Var2.z1 = 1.0f;
                                        }
                                        org.telegram.ui.Components.y8 y8Var2 = p2Var2.W1;
                                        if (y8Var2.n == 2) {
                                            y8Var2.o = er.h.getInterpolation(p2Var2.z1);
                                        }
                                        z14 = true;
                                    }
                                    if (p2Var2.X1) {
                                    }
                                    if (!p2Var2.w1) {
                                    }
                                }
                            }
                            z14 = true;
                            if (p2Var2.i1) {
                            }
                        }
                        f20 = 0.0f;
                        if (p2Var2.i1) {
                        }
                    }
                }
                canvas2 = canvas;
                if (z26) {
                }
                z17 = p2Var2.u3;
                if (!z17) {
                }
                if (z17) {
                }
                z14 = true;
                if (p2Var2.i1) {
                }
            }
        }
        f19 = 0.0f;
        if (p2Var2.p1 != f19) {
        }
        canvas2 = canvas;
        if (z26) {
        }
        z17 = p2Var2.u3;
        if (!z17) {
        }
        if (z17) {
        }
        z14 = true;
        if (p2Var2.i1) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        wh0 wh0Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (P() && (wh0Var = this.a2) != null && SharedConfig.archiveHidden && wh0Var.J == 0.0f) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(32);
            if (!P() && this.v4 != null) {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_chat_preview, LocaleController.getString(R.string.AccActionChatPreview)));
            }
        }
        lh.j3 j3Var = this.m2;
        if (j3Var == null || !j3Var.a.q) {
            return;
        }
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(true);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.e0 != 0.0f || this.L || this.B || !this.q0.a(motionEvent, this)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp;
        int i14;
        if (this.D0 == 0 && this.C0 == null) {
            return;
        }
        ag.s0 s0Var = this.e4;
        if (s0Var != null) {
            s0Var.layout(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
        }
        if (this.m2 != null) {
            int i15 = this.E;
            boolean z11 = this.n2;
            int dp2 = AndroidUtilities.dp(i15 - ((z11 || SharedConfig.useThreeLinesLayout) ? 29 : 27));
            if (this.g0) {
                i14 = AndroidUtilities.dp(8.0f);
                dp = (getMeasuredHeight() - this.m2.getMeasuredHeight()) >> 1;
            } else {
                if (LocaleController.isRTL) {
                    dp2 = (i12 - i10) - dp2;
                }
                int i16 = dp2;
                dp = AndroidUtilities.dp(this.Q + ((z11 || SharedConfig.useThreeLinesLayout) ? 6 : 0));
                i14 = i16;
            }
            lh.j3 j3Var = this.m2;
            j3Var.layout(i14, dp, j3Var.getMeasuredWidth() + i14, this.m2.getMeasuredHeight() + dp);
        }
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (measuredWidth != this.C4 || this.w0) {
            this.w0 = false;
            this.C4 = measuredWidth;
            try {
                u();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        ag.s0 s0Var = this.e4;
        if (s0Var != null) {
            s0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), TLObject.FLAG_30));
        }
        lh.j3 j3Var = this.m2;
        if (j3Var != null) {
            j3Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
        }
        if (this.L) {
            int size = View.MeasureSpec.getSize(i10);
            boolean z10 = this.n2;
            setMeasuredDimension(size, AndroidUtilities.dp(((z10 || SharedConfig.useThreeLinesLayout) ? this.G : this.F) + ((!M() || ((z10 || SharedConfig.useThreeLinesLayout) && !Q())) ? 0 : Q() ? this.I : this.H)) + (this.o2 ? 1 : 0));
            this.M = false;
            if (this.L && !M()) {
                u();
                if (this.N) {
                    this.M = true;
                    u();
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), z());
        this.q1 = 0;
        this.r1 = getMeasuredHeight();
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        MessageObject captionMessage;
        TLRPC.User user;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        StringBuilder sb2 = new StringBuilder();
        String str = this.H0;
        if (str != null) {
            sb2.append(str);
            sb2.append(". ");
        } else if (this.F0 == 1) {
            rl.j(R.string.ArchivedChats, ". ", sb2);
        } else {
            if (this.d2 != null) {
                rl.j(R.string.AccDescrSecretChat, ". ", sb2);
            }
            if (!this.L || this.J == null) {
                TLRPC.User user2 = this.b2;
                if (user2 != null) {
                    if (UserObject.isReplyUser(user2)) {
                        sb2.append(LocaleController.getString(R.string.RepliesTitle));
                    } else if (UserObject.isAnonymous(this.b2)) {
                        sb2.append(LocaleController.getString(R.string.AnonymousForward));
                    } else {
                        if (this.b2.bot) {
                            rl.j(R.string.Bot, ". ", sb2);
                        }
                        TLRPC.User user3 = this.b2;
                        if (user3.self) {
                            sb2.append(LocaleController.getString(R.string.SavedMessages));
                        } else {
                            sb2.append(ContactsController.formatName(user3.first_name, user3.last_name));
                        }
                    }
                    sb2.append(". ");
                } else {
                    TLRPC.Chat chat = this.c2;
                    if (chat != null) {
                        if (chat.broadcast) {
                            sb2.append(LocaleController.getString(R.string.AccDescrChannel));
                        } else {
                            sb2.append(LocaleController.getString(R.string.AccDescrGroup));
                        }
                        sb2.append(". ");
                        sb2.append(this.c2.title);
                        sb2.append(". ");
                    }
                }
            } else {
                rl.j(R.string.AccDescrTopic, ". ", sb2);
                sb2.append(this.J.title);
                sb2.append(". ");
            }
        }
        if (this.b4) {
            rl.j(R.string.AccDescrVerified, ". ", sb2);
        }
        if (this.V0) {
            rl.j(R.string.AccDescrNotificationsMuted, ". ", sb2);
        }
        if (R()) {
            rl.j(R.string.AccDescrUserOnline, ". ", sb2);
        }
        int i10 = this.O0;
        if (i10 > 0) {
            sb2.append(LocaleController.formatPluralString("NewMessages", i10, new Object[0]));
            sb2.append(". ");
        }
        int i11 = this.Q0;
        if (i11 > 0) {
            sb2.append(LocaleController.formatPluralString("AccDescrMentionCount", i11, new Object[0]));
            sb2.append(". ");
        }
        if (this.R0 > 0) {
            rl.j(R.string.AccDescrMentionReaction, ". ", sb2);
        }
        MessageObject messageObject = this.b1;
        if (messageObject == null || this.F0 != 0) {
            accessibilityEvent.setContentDescription(sb2);
            setContentDescription(sb2);
            return;
        }
        int i12 = this.N0;
        if (i12 == 0) {
            i12 = messageObject.messageOwner.date;
        }
        String formatDateAudio = LocaleController.formatDateAudio(i12, true);
        if (this.b1.isOut()) {
            sb2.append(LocaleController.formatString("AccDescrSentDate", R.string.AccDescrSentDate, formatDateAudio));
        } else {
            sb2.append(LocaleController.formatString("AccDescrReceivedDate", R.string.AccDescrReceivedDate, formatDateAudio));
        }
        sb2.append(". ");
        if (this.c2 != null && !this.b1.isOut() && this.b1.isFromUser() && this.b1.messageOwner.action == null && (user = MessagesController.getInstance(this.B0).getUser(Long.valueOf(this.b1.messageOwner.from_id.user_id))) != null) {
            sb2.append(ContactsController.formatName(user.first_name, user.last_name));
            sb2.append(". ");
        }
        if (this.d2 == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.b1.messageText);
            if (!this.b1.isMediaEmpty() && (captionMessage = getCaptionMessage()) != null && !TextUtils.isEmpty(captionMessage.caption)) {
                if (sb3.length() > 0) {
                    sb3.append(". ");
                }
                sb3.append(captionMessage.caption);
            }
            StaticLayout staticLayout = this.a3;
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
    
        if (r1 == 8) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008e, code lost:
    
        if (r0.b(r7) != false) goto L54;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.e0 != 0.0f || this.L || this.B || !this.q0.a(motionEvent, this)) {
            l2 l2Var = this.W;
            if (l2Var == null || l2Var.b()) {
                if (this.A1) {
                    boolean contains = this.D1.contains(motionEvent.getX(), motionEvent.getY());
                    int action = motionEvent.getAction();
                    nc ncVar = this.B1;
                    if (action == 0 || motionEvent.getAction() == 2) {
                        ncVar.c(contains);
                    } else {
                        if (ncVar.h && motionEvent.getAction() == 1) {
                            lh.n6 n6Var = this.G1;
                            if (n6Var != null) {
                                n6Var.run(this.b2);
                            }
                            ncVar.c(false);
                            return true;
                        }
                        if (ncVar.h && motionEvent.getAction() == 3) {
                            ncVar.c(false);
                            return true;
                        }
                    }
                }
                if (this.b0) {
                    tc tcVar = this.V;
                    if (tcVar != null) {
                        if (this.d3 != null) {
                            int i10 = this.f1;
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
        gy gyVar;
        if (i10 != R.id.acc_action_chat_preview || (gyVar = this.v4) == null) {
            return super.performAccessibilityAction(i10, bundle);
        }
        gyVar.H4(this);
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (getParent() != null && getParent().isLayoutRequested()) {
            getParent().requestLayout();
        }
        super.requestLayout();
    }

    public void setArchivedPullAnimation(wh0 wh0Var) {
        this.a2 = wh0Var;
    }

    public void setBottomClip(int i10) {
        this.r1 = i10;
    }

    public void setClipProgress(float f10) {
        this.p1 = f10;
        invalidate();
    }

    public void setCurrentDialogId(long j10) {
        this.D0 = j10;
    }

    public void setCustomMessage(String str) {
        if (TextUtils.equals(this.E0, str)) {
            return;
        }
        this.E0 = str;
        u();
        requestLayout();
    }

    public void setCustomMessageWithoutRebuild(String str) {
        this.E0 = str;
    }

    public void setDialog(k2 k2Var) {
        this.C0 = k2Var;
        this.h1 = 0;
        b0(0, true);
        x();
        w();
        v();
        y();
    }

    public void setDialogCellDelegate(l2 l2Var) {
        this.W = l2Var;
    }

    public void setDialogSelected(boolean z10) {
        if (this.i4 != z10) {
            invalidate();
        }
        this.i4 = z10;
    }

    public void setIsTransitionSupport(boolean z10) {
        this.f0 = z10;
    }

    public void setMoving(boolean z10) {
        this.r = z10;
    }

    public void setOpenBotButton(boolean z10) {
        if (this.A1 == z10) {
            return;
        }
        if (this.E1 == null) {
            this.E1 = new pz0(LocaleController.getString(R.string.BotOpen), 14.0f, AndroidUtilities.bold());
        }
        this.A1 = z10;
        this.B1.c(false);
    }

    public void setPinForced(boolean z10) {
        this.x3 = z10;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            u();
        }
        invalidate();
    }

    public void setPreloader(pf.h hVar) {
        this.k4 = hVar;
    }

    public void setRightFragmentOpenedProgress(float f10) {
        if (this.e0 != f10) {
            this.e0 = f10;
            invalidate();
        }
    }

    public void setSliding(boolean z10) {
        this.t1 = z10;
    }

    public void setTitleOverride(String str) {
        this.H0 = str;
    }

    public void setTopClip(int i10) {
        this.q1 = i10;
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        if (f10 == this.s1) {
            return;
        }
        this.s1 = f10;
        oi0 oi0Var = this.u1;
        if (oi0Var != null && f10 == 0.0f) {
            oi0Var.Q(0.0f, true);
            this.v1 = false;
            this.i1 = SharedConfig.archiveHidden;
            this.x1 = 0.0f;
            this.t1 = false;
        }
        float f11 = this.s1;
        if (f11 != 0.0f) {
            this.t1 = true;
        } else {
            this.y1 = 0.0f;
            this.x1 = 0.0f;
            this.w1 = false;
        }
        if (this.t1 && !this.w) {
            boolean z10 = this.w1;
            boolean z11 = Math.abs(f11) >= ((float) getMeasuredWidth()) * 0.45f;
            this.w1 = z11;
            if (z10 != z11 && this.i1 == SharedConfig.archiveHidden) {
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
        }
        invalidate();
    }

    public void setVisible(boolean z10) {
        if (this.v0 == z10) {
            return;
        }
        this.v0 = z10;
        if (z10) {
            invalidate();
        }
    }

    public final CharSequence t(CharSequence charSequence) {
        if (this.N1 <= 0) {
            return charSequence;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.insert(0, (CharSequence) " ");
        valueOf.setSpan(new n2(AndroidUtilities.dp(((this.D4 + 2) * this.N1) + 3)), 0, 1, 33);
        return valueOf;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(138:15|(1:17)|18|(1:1976)(1:24)|25|(1:1975)(1:29)|30|(1:32)|33|(1:1974)(1:37)|38|(1:40)|41|(1:43)(1:1967)|44|(7:46|(1:48)|49|50|(1:52)|53|54)(1:1966)|55|(1:57)(1:1965)|58|(9:60|(2:62|(2:919|(1:921)(1:922))(2:66|(1:68)(1:918)))(4:923|(1:940)(1:927)|928|(2:936|(1:938)(1:939))(2:932|(1:934)(1:935)))|69|(3:71|(1:73)(4:905|(1:907)|908|(1:913)(1:912))|74)(3:914|(1:916)|917)|75|(1:77)(1:904)|78|(1:80)(1:(1:902)(1:903))|81)(40:941|(2:1961|(1:1963)(1:1964))(2:945|(1:947)(1:1960))|948|(2:950|(2:952|(2:960|(1:962)(1:963))(2:956|(1:958)(1:959))))(2:1885|(36:1889|(3:1891|(1:1893)(2:1900|(1:1902)(2:1903|(1:1905)(5:1906|(1:1918)(1:1910)|1911|(1:1917)(1:1915)|1916)))|1894)(2:1919|(8:1921|(1:1923)(2:1940|(1:1942)(11:1943|(1:1958)(1:1947)|1948|(1:1957)(2:1952|(7:1954|1955|1925|(2:1927|(3:1931|1932|(2:1934|(1:1936)(1:1937))))(1:1939)|1938|1932|(0)))|1956|1955|1925|(0)(0)|1938|1932|(0)))|1924|1925|(0)(0)|1938|1932|(0))(1:1959))|1895|(1:1899)|965|(1:969)|970|(6:972|(1:974)(1:1870)|975|(1:977)(1:1869)|978|(1:982))(2:1871|(5:1876|(1:1878)(1:1884)|1879|(1:1881)(1:1883)|1882)(1:1875))|983|(3:(2:1857|(23:1859|(1:1861)|997|998|(11:1000|(1:1002)(1:1248)|1003|(4:1005|(1:1007)|1008|(1:1010))(1:1247)|1011|(1:1013)(1:1246)|1014|(1:1016)(1:1245)|1017|(2:1019|(1:1022))|1023)(2:1249|(1:1251)(3:(6:1253|(1:1255)(1:1840)|1256|(1:1258)(1:1839)|(1:1260)(1:1838)|1261)(1:1841)|1262|(21:1786|1787|(7:1802|(2:1830|(1:1832)(1:(2:1834|(1:1836))(1:1837)))(1:1806)|1807|(2:1809|(3:1813|(1:1815)(1:1817)|1816))(2:1827|(1:1829))|1818|(1:1826)(1:1822)|1823)(2:1793|(1:1800)(19:1797|1271|1025|(3:1041|(1:1045)|1046)|1047|(9:1236|(1:1238)(2:1239|(1:1241)(2:1242|(1:1244)))|1050|(4:1226|1227|(1:1235)(1:1233)|1234)(6:1054|(4:1056|(1:(2:1059|1060)(1:1199))(1:1201)|1200|1060)(10:1202|(1:1204)(9:1219|(1:1221)(2:1222|(1:1224)(1:1225))|1206|(1:1208)(1:1218)|1209|(1:1211)(1:1217)|1212|(1:1214)(1:1216)|1215)|1205|1206|(0)(0)|1209|(0)(0)|1212|(0)(0)|1215)|1061|(2:1066|(3:1068|(1:1070)(2:1159|(1:1161)(2:1162|(4:1164|(3:1166|(1:1168)(1:1172)|1169)(2:1173|(3:1175|(1:1187)(1:1179)|1180)(3:1188|(1:1196)(1:1194)|1195))|1170|1171)(1:1197)))|1071))|1198|1071)|1072|(2:1076|(1:1078)(2:1079|(4:1081|(1:1083)|1084|(1:1086))))|1087|(2:1090|(1:1092)(3:1093|(3:1095|(3:1097|(1:1099)|1100)(2:1108|(4:1110|(1:1112)|1113|(1:1115)(1:1116))(2:1117|(1:1126)(3:1121|(1:1123)(1:1125)|1124)))|1107)(3:1127|(3:1129|(1:1131)(2:1132|(1:1134)(2:1135|(2:1149|(4:1151|(1:1153)|1154|(1:1156)(1:1157))(1:1158))(2:1139|(1:1141)(2:1142|(1:1144)(3:1145|(1:1147)|1148)))))|1107)|1102)|(1:1106)))|1089)|1049|1050|(1:1052)|1226|1227|(1:1229)|1235|1234|1072|(3:1074|1076|(0)(0))|1087|(0)|1089))|1801|1025|(10:1027|1029|1031|1033|1035|1037|1039|1041|(2:1043|1045)|1046)|1047|(0)|1049|1050|(0)|1226|1227|(0)|1235|1234|1072|(0)|1087|(0)|1089)(22:1266|(1:1268)(2:1272|(2:1274|(1:1276)(2:1277|(1:1279)(22:1280|(2:1282|(1:1284)(2:1285|(1:1287)(2:1288|(1:1290)(2:1291|(2:1293|(1:1295)(1:1296))))))(2:1298|(20:1302|(1:1308)(1:1306)|1307|1025|(0)|1047|(0)|1049|1050|(0)|1226|1227|(0)|1235|1234|1072|(0)|1087|(0)|1089))|1297|1270|1271|1025|(0)|1047|(0)|1049|1050|(0)|1226|1227|(0)|1235|1234|1072|(0)|1087|(0)|1089)))(29:1309|(1:1311)(1:1785)|1312|(3:1314|(2:1326|(2:1328|(26:1332|(1:1334)(3:1777|(1:1779)(1:1781)|1780)|(1:1336)(24:1347|(4:1349|(4:1351|(2:1353|(2:1355|(1:1357)(2:1361|(1:1363)(1:1364))))|1365|(1:1367)(2:1368|(1:1370)(2:1371|(1:1373)(1:1374))))(1:1375)|1358|1359)(2:1376|(25:1387|(1:(2:1401|(40:1436|1437|(1:1776)(1:1445)|1446|(4:1522|(2:1524|(5:1526|(1:1528)|1530|(1:1532)|1534))|1536|(31:1544|(2:1546|(5:1548|(1:1560)|1554|1555|(2:1557|(1:1559)))(2:1561|(5:1568|(2:1570|(2:1575|(1:1577)(2:1578|(1:1580)(1:1581))))|1582|(2:1625|(3:1627|(2:1629|(1:1631)(1:1633))(2:1634|(1:1636)(1:1637))|1632)(2:1638|(4:1640|(4:1642|(1:1644)(1:1649)|1645|1646)(3:1650|(1:1652)(1:1654)|1653)|1647|1648)(6:1655|(5:1657|(2:1659|(3:1661|(1:1663)(1:1677)|1664))|1678|(0)(0)|1664)(2:1679|(1:1681)(2:1682|(2:1684|(1:1689)(1:1688))(2:1690|(2:1692|(1:1697)(1:1696))(2:1698|(1:1700)(2:1701|(1:1703)(2:1704|(1:1706)(2:1707|(3:1721|(4:1729|(1:1731)|1732|(2:1734|(3:1736|(1:1738)(1:1740)|1739)))(2:1725|(1:1727))|1728)(2:1711|(3:1713|(2:1715|(1:1717))(1:1719)|1718)(1:1720)))))))))|1665|1666|(2:1671|(2:1673|(1:1675)))|1670)))(4:1586|(1:1588)(2:1613|(1:1615)(2:1616|(1:1618)(2:1619|(2:1621|(1:1623)(1:1624)))))|1589|(3:1605|(3:1607|(1:1609)(1:1611)|1610)|1612)(4:1593|(2:1595|(1:1597)(1:1598))|(1:1602)|1603))|1604)(1:1567)))|1741|(1:1743)|1744|(7:1746|(3:1771|(1:1773)|1774)(2:1750|(1:1752)(1:1770))|1753|(1:1755)(1:1769)|1756|(2:1758|(1:1760))|1761)(1:1775)|1762|(1:1768)(1:1766)|1767|1338|1339|(1:1341)(2:1343|(1:1345)(19:1346|1271|1025|(0)|1047|(0)|1049|1050|(0)|1226|1227|(0)|1235|1234|1072|(0)|1087|(0)|1089))|1342|1271|1025|(0)|1047|(0)|1049|1050|(0)|1226|1227|(0)|1235|1234|1072|(0)|1087|(0)|1089))|1456|(1:1458)|1459|(2:1467|(32:1469|(1:1513)(1:1473)|1474|1475|1476|(1:1512)(5:1482|1483|1484|1485|1486)|1487|(1:1491)|1492|(4:1494|(1:1496)|1497|(1:1499)(1:1500))|1501|1339|(0)(0)|1342|1271|1025|(0)|1047|(0)|1049|1050|(0)|1226|1227|(0)|1235|1234|1072|(0)|1087|(0)|1089))|1514|1475|1476|(2:1478|1508)|1512|1487|(2:1489|1491)|1492|(0)|1501|1339|(0)(0)|1342|1271|1025|(0)|1047|(0)|1049|1050|(0)|1226|1227|(0)|1235|1234|1072|(0)|1087|(0)|1089)(6:1407|(2:1409|(4:1411|(1:1413)(1:1422)|1414|1415)(3:1423|(1:1425)(1:1427)|1426))(2:1428|(2:1433|(4:1435|1417|1418|(1:1420)(1:1421)))(3:1432|1418|(0)(0)))|1416|1417|1418|(0)(0)))(1:1400))(1:1393)|1394|1338|1339|(0)(0)|1342|1271|1025|(0)|1047|(0)|1049|1050|(0)|1226|1227|(0)|1235|1234|1072|(0)|1087|(0)|1089)(3:1380|(1:1386)(1:1384)|1385))|1360|1339|(0)(0)|1342|1271|1025|(0)|1047|(0)|1049|1050|(0)|1226|1227|(0)|1235|1234|1072|(0)|1087|(0)|1089)|1337|1338|1339|(0)(0)|1342|1271|1025|(0)|1047|(0)|1049|1050|(0)|1226|1227|(0)|1235|1234|1072|(0)|1087|(0)|1089)))|1782)(1:1784)|1783|(0)(0)|1337|1338|1339|(0)(0)|1342|1271|1025|(0)|1047|(0)|1049|1050|(0)|1226|1227|(0)|1235|1234|1072|(0)|1087|(0)|1089))|1269|1270|1271|1025|(0)|1047|(0)|1049|1050|(0)|1226|1227|(0)|1235|1234|1072|(0)|1087|(0)|1089)))|1024|1025|(0)|1047|(0)|1049|1050|(0)|1226|1227|(0)|1235|1234|1072|(0)|1087|(0)|1089))|1863|(2:1865|(1:1867)))|987|(2:989|(2:991|(23:993|(1:995)|997|998|(0)(0)|1024|1025|(0)|1047|(0)|1049|1050|(0)|1226|1227|(0)|1235|1234|1072|(0)|1087|(0)|1089)))|1842|(23:1844|(1:1846)|997|998|(0)(0)|1024|1025|(0)|1047|(0)|1049|1050|(0)|1226|1227|(0)|1235|1234|1072|(0)|1087|(0)|1089)|1848|(1:1850)|998|(0)(0)|1024|1025|(0)|1047|(0)|1049|1050|(0)|1226|1227|(0)|1235|1234|1072|(0)|1087|(0)|1089))|964|965|(2:967|969)|970|(0)(0)|983|(1:985)|(4:1853|1855|1857|(0))|1863|(0)|987|(0)|1842|(0)|1848|(0)|998|(0)(0)|1024|1025|(0)|1047|(0)|1049|1050|(0)|1226|1227|(0)|1235|1234|1072|(0)|1087|(0)|1089)|82|(4:84|(1:86)(1:899)|87|(1:89)(1:898))(1:900)|90|(3:92|(1:94)(1:896)|95)(1:897)|96|(1:98)(1:895)|99|(3:101|(1:103)|104)|105|(2:107|(1:109)(1:882))(2:883|(105:885|(2:887|(1:889)(1:890))(2:891|(1:893)(1:894))|111|(1:881)(1:119)|120|(1:(4:852|(1:854)|855|(1:857))(2:858|(2:860|(1:862))(2:863|(2:865|(1:867))(2:868|(70:870|(1:872)(1:876)|873|(1:875)|131|(1:133)|134|135|136|(1:138)|139|(4:141|142|143|144)(1:848)|145|(9:147|148|149|150|151|152|153|(1:155)(1:835)|156)(1:844)|157|(1:159)(1:834)|160|(1:162)|163|(1:833)(1:169)|170|(1:172)(1:832)|173|(1:831)(1:177)|178|179|(7:802|803|(1:805)(1:829)|806|807|(2:808|(5:810|(1:812)(1:826)|813|(2:824|825)(2:821|822)|823)(1:827))|828)(9:183|(1:185)|186|(1:188)(1:801)|189|(1:191)(1:800)|192|(2:193|(5:195|(1:197)(1:211)|198|(2:209|210)(2:206|207)|208)(1:212))|213)|214|(1:216)(1:799)|217|(1:219)|220|(1:228)|229|(2:231|(1:233)(1:234))|235|(2:237|(1:239)(1:662))(1:(6:(4:698|(1:700)(1:795)|701|702)(1:796)|(6:704|(1:706)(1:793)|707|(3:709|(1:711)(1:787)|712)(3:788|(1:790)(1:792)|791)|713|714)(1:794)|715|(2:717|(4:719|(3:721|(1:723)(1:725)|724)|726|(3:728|(1:730)(1:732)|731))(5:733|(3:735|(1:737)(1:739)|738)|740|(3:742|(1:744)(1:746)|745)|747))|748|(2:750|(6:752|(1:754)|755|(3:757|(1:759)(1:761)|760)|762|(3:764|(1:766)(1:768)|767))(7:769|(1:771)|772|(3:774|(1:776)(1:778)|777)|779|(3:781|(1:783)(1:785)|784)|786)))(2:669|(1:696)(6:681|(1:695)(2:685|(1:687)(1:694))|688|(1:690)(1:693)|691|692)))|(7:(1:242)|243|(1:245)|246|(1:259)(1:250)|251|(1:255))|260|(1:661)(1:264)|265|(3:271|(1:273)(1:275)|274)|276|(4:278|(1:594)(1:282)|283|(2:284|(1:286)(1:287)))(2:595|(16:623|624|(2:628|(12:630|631|632|633|634|635|636|637|(1:648)(1:641)|642|(2:643|(1:645)(1:646))|647))|657|631|632|633|634|635|636|637|(1:639)|648|642|(3:643|(0)(0)|645)|647)(3:599|600|(4:605|(1:615)(1:609)|610|(2:611|(1:613)(1:614)))(1:604)))|288|(1:290)|291|292|293|(1:295)(1:592)|296|297|298|299|(11:301|(9:303|(1:305)|306|307|308|309|310|311|312)|317|(1:319)|306|307|308|309|310|311|312)|320|321|(3:323|(5:325|(1:352)(4:329|(2:331|(2:333|(1:335)))|339|(2:341|(2:343|(3:345|(1:349)|338))))|336|337|338)|353)|354|(1:587)(7:358|(1:360)|573|(1:(3:576|(1:580)|369))|362|(1:572)(1:368)|369)|370|(8:556|(2:559|560)|561|562|563|(1:565)(1:569)|566|567)(6:374|(2:376|(1:380))|381|382|383|384)|385|386|387|(10:389|(8:393|(1:395)|396|(1:398)|399|(2:428|(1:430)(1:431))(2:405|(1:407)(2:413|(1:415)(2:416|(3:418|(1:420)(1:422)|421)(1:423))))|408|(2:410|(1:412)))|432|(3:436|(1:(1:445)(2:438|(1:440)(2:441|442)))|(1:444))|446|(3:450|(1:(1:459)(2:452|(1:454)(2:455|456)))|(1:458))|460|(2:466|(1:468))|469|(4:473|(1:475)|476|477))(10:495|(8:499|(1:501)|502|(4:504|(1:506)|507|(1:509))|510|(1:512)|513|(1:515))|516|(4:520|(1:522)|523|524)|525|(4:529|(1:531)|532|533)|534|(4:538|(1:540)|541|542)|543|(1:547))|478|(3:(1:492)(1:487)|488|(1:490)(1:491))|493|494)))))(4:124|(1:126)|127|(1:129))|130|131|(0)|134|135|136|(0)|139|(0)(0)|145|(0)(0)|157|(0)(0)|160|(0)|163|(1:165)|833|170|(0)(0)|173|(1:175)|831|178|179|(1:181)|802|803|(0)(0)|806|807|(3:808|(0)(0)|823)|828|214|(0)(0)|217|(0)|220|(60:222|224|226|228|229|(0)|235|(0)(0)|(0)|260|(1:262)|661|265|(46:267|269|271|(0)(0)|274|276|(0)(0)|288|(0)|291|292|293|(0)(0)|296|297|298|299|(0)|320|321|(0)|354|(1:356)|581|583|585|587|370|(1:372)|554|556|(2:559|560)|561|562|563|(0)(0)|566|567|385|386|387|(0)(0)|478|(6:480|482|(1:485)|492|488|(0)(0))|493|494)|659|269|271|(0)(0)|274|276|(0)(0)|288|(0)|291|292|293|(0)(0)|296|297|298|299|(0)|320|321|(0)|354|(0)|581|583|585|587|370|(0)|554|556|(0)|561|562|563|(0)(0)|566|567|385|386|387|(0)(0)|478|(0)|493|494)|797|224|226|228|229|(0)|235|(0)(0)|(0)|260|(0)|661|265|(0)|659|269|271|(0)(0)|274|276|(0)(0)|288|(0)|291|292|293|(0)(0)|296|297|298|299|(0)|320|321|(0)|354|(0)|581|583|585|587|370|(0)|554|556|(0)|561|562|563|(0)(0)|566|567|385|386|387|(0)(0)|478|(0)|493|494))|110|111|(1:113)|877|879|881|120|(1:122)|(0)(0)|130|131|(0)|134|135|136|(0)|139|(0)(0)|145|(0)(0)|157|(0)(0)|160|(0)|163|(0)|833|170|(0)(0)|173|(0)|831|178|179|(0)|802|803|(0)(0)|806|807|(3:808|(0)(0)|823)|828|214|(0)(0)|217|(0)|220|(0)|797|224|226|228|229|(0)|235|(0)(0)|(0)|260|(0)|661|265|(0)|659|269|271|(0)(0)|274|276|(0)(0)|288|(0)|291|292|293|(0)(0)|296|297|298|299|(0)|320|321|(0)|354|(0)|581|583|585|587|370|(0)|554|556|(0)|561|562|563|(0)(0)|566|567|385|386|387|(0)(0)|478|(0)|493|494) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:(2:623|624)|(2:628|(12:630|631|632|633|634|635|636|637|(1:648)(1:641)|642|(2:643|(1:645)(1:646))|647))|657|631|632|633|634|635|636|637|(1:639)|648|642|(3:643|(0)(0)|645)|647) */
    /* JADX WARN: Code restructure failed: missing block: B:1101:0x158d, code lost:
    
        if (r4 == null) goto L1115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1529:0x0b21, code lost:
    
        if (r14.id != r11) goto L584;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1533:0x0b2f, code lost:
    
        if (org.telegram.messenger.ChatObject.isMegagroup(r52.c2) != false) goto L588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1535:0x0b37, code lost:
    
        if (wf.c.k(r52.b1) == false) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1676:0x0f51, code lost:
    
        if (org.telegram.messenger.MessageObject.isBlueBlock(r52.b1.messageOwner.rich_message.blocks.get(0)) != false) goto L797;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1847:0x0635, code lost:
    
        if (r2.kicked != false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1851:0x063f, code lost:
    
        if (r52.L == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1862:0x0603, code lost:
    
        if (r3.reply_to_msg_id == 0) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1868:0x060f, code lost:
    
        if (r52.O0 != 0) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x2341, code lost:
    
        if (org.telegram.messenger.SharedConfig.useThreeLinesLayout == false) goto L1757;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x23e8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x23e9, code lost:
    
        r36 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x22f0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x2268, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x215e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x215f, code lost:
    
        r36 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x215b, code lost:
    
        r2 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x2162, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
        r42 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x215a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x1965, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x1966, code lost:
    
        r19 = 21.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:996:0x0629, code lost:
    
        if (r2.post_messages == false) goto L320;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1000:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x1793  */
    /* JADX WARN: Removed duplicated region for block: B:1027:0x12cb  */
    /* JADX WARN: Removed duplicated region for block: B:1052:0x136e  */
    /* JADX WARN: Removed duplicated region for block: B:1074:0x14fb  */
    /* JADX WARN: Removed duplicated region for block: B:1078:0x150e  */
    /* JADX WARN: Removed duplicated region for block: B:1079:0x1515  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x17b1  */
    /* JADX WARN: Removed duplicated region for block: B:1090:0x1554  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x1862  */
    /* JADX WARN: Removed duplicated region for block: B:1208:0x13e8  */
    /* JADX WARN: Removed duplicated region for block: B:1211:0x13f4  */
    /* JADX WARN: Removed duplicated region for block: B:1214:0x13fd  */
    /* JADX WARN: Removed duplicated region for block: B:1216:0x13ff  */
    /* JADX WARN: Removed duplicated region for block: B:1217:0x13f6  */
    /* JADX WARN: Removed duplicated region for block: B:1218:0x13ed  */
    /* JADX WARN: Removed duplicated region for block: B:1229:0x14c7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x1883  */
    /* JADX WARN: Removed duplicated region for block: B:1236:0x1347  */
    /* JADX WARN: Removed duplicated region for block: B:1249:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:1336:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x1938  */
    /* JADX WARN: Removed duplicated region for block: B:1341:0x11b7  */
    /* JADX WARN: Removed duplicated region for block: B:1343:0x11c1  */
    /* JADX WARN: Removed duplicated region for block: B:1347:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x194c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x1951 A[Catch: Exception -> 0x1965, TRY_LEAVE, TryCatch #12 {Exception -> 0x1965, blocks: (B:136:0x1943, B:139:0x194d, B:141:0x1951), top: B:135:0x1943 }] */
    /* JADX WARN: Removed duplicated region for block: B:1420:0x0ab5  */
    /* JADX WARN: Removed duplicated region for block: B:1421:0x0abe  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x196f A[Catch: Exception -> 0x195e, TRY_LEAVE, TryCatch #6 {Exception -> 0x195e, blocks: (B:144:0x1959, B:145:0x196b, B:147:0x196f), top: B:143:0x1959 }] */
    /* JADX WARN: Removed duplicated region for block: B:1489:0x1140  */
    /* JADX WARN: Removed duplicated region for block: B:1494:0x1151  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x19b3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x19bc A[Catch: Exception -> 0x1997, TryCatch #2 {Exception -> 0x1997, blocks: (B:153:0x197e, B:156:0x198d, B:157:0x19a0, B:160:0x19b6, B:162:0x19bc, B:163:0x19c8, B:165:0x19db, B:167:0x19e1, B:170:0x19f2, B:172:0x19f6, B:173:0x1a30, B:175:0x1a34, B:177:0x1a3d, B:178:0x1a45, B:832:0x1a0f), top: B:152:0x197e }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x19db A[Catch: Exception -> 0x1997, TryCatch #2 {Exception -> 0x1997, blocks: (B:153:0x197e, B:156:0x198d, B:157:0x19a0, B:160:0x19b6, B:162:0x19bc, B:163:0x19c8, B:165:0x19db, B:167:0x19e1, B:170:0x19f2, B:172:0x19f6, B:173:0x1a30, B:175:0x1a34, B:177:0x1a3d, B:178:0x1a45, B:832:0x1a0f), top: B:152:0x197e }] */
    /* JADX WARN: Removed duplicated region for block: B:1663:0x0d80  */
    /* JADX WARN: Removed duplicated region for block: B:1677:0x0d83  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x19f6 A[Catch: Exception -> 0x1997, TryCatch #2 {Exception -> 0x1997, blocks: (B:153:0x197e, B:156:0x198d, B:157:0x19a0, B:160:0x19b6, B:162:0x19bc, B:163:0x19c8, B:165:0x19db, B:167:0x19e1, B:170:0x19f2, B:172:0x19f6, B:173:0x1a30, B:175:0x1a34, B:177:0x1a3d, B:178:0x1a45, B:832:0x1a0f), top: B:152:0x197e }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x1a34 A[Catch: Exception -> 0x1997, TryCatch #2 {Exception -> 0x1997, blocks: (B:153:0x197e, B:156:0x198d, B:157:0x19a0, B:160:0x19b6, B:162:0x19bc, B:163:0x19c8, B:165:0x19db, B:167:0x19e1, B:170:0x19f2, B:172:0x19f6, B:173:0x1a30, B:175:0x1a34, B:177:0x1a3d, B:178:0x1a45, B:832:0x1a0f), top: B:152:0x197e }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x1a72  */
    /* JADX WARN: Removed duplicated region for block: B:1844:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:1850:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:1859:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:1865:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:1871:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:1927:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:1934:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:1939:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x1c9a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x1cc2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x1ccf  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x1cfb  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x1d21  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x2053  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x20a8  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x20bc  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x20d4  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x20d7  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x20e6  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x21d8  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x21f7 A[Catch: Exception -> 0x2246, TryCatch #11 {Exception -> 0x2246, blocks: (B:293:0x21f1, B:295:0x21f7, B:592:0x2243), top: B:292:0x21f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x225c A[Catch: Exception -> 0x2268, TryCatch #10 {Exception -> 0x2268, blocks: (B:299:0x2256, B:301:0x225c, B:303:0x2260, B:307:0x228e, B:312:0x22b4, B:317:0x226a, B:319:0x2270), top: B:298:0x2256 }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x22c1 A[Catch: Exception -> 0x22f0, TryCatch #0 {Exception -> 0x22f0, blocks: (B:321:0x22bd, B:323:0x22c1, B:325:0x22d3, B:327:0x22d9, B:329:0x22dd, B:331:0x22e5, B:333:0x22eb, B:336:0x2311, B:338:0x2314, B:339:0x22f4, B:341:0x22f8, B:343:0x22fc, B:345:0x2300, B:347:0x2304, B:354:0x2317, B:356:0x231b, B:358:0x233b, B:360:0x233f, B:362:0x2361, B:364:0x2367, B:366:0x236b, B:368:0x237e, B:370:0x23a9, B:372:0x23af, B:374:0x23ed, B:376:0x23f1, B:378:0x2404, B:380:0x240a, B:385:0x2437, B:554:0x23b3, B:556:0x23b9, B:559:0x23bf, B:572:0x2399, B:573:0x2343, B:576:0x234b, B:578:0x2353, B:581:0x231f, B:583:0x2325, B:585:0x2329, B:587:0x232e), top: B:320:0x22bd }] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x231b A[Catch: Exception -> 0x22f0, TryCatch #0 {Exception -> 0x22f0, blocks: (B:321:0x22bd, B:323:0x22c1, B:325:0x22d3, B:327:0x22d9, B:329:0x22dd, B:331:0x22e5, B:333:0x22eb, B:336:0x2311, B:338:0x2314, B:339:0x22f4, B:341:0x22f8, B:343:0x22fc, B:345:0x2300, B:347:0x2304, B:354:0x2317, B:356:0x231b, B:358:0x233b, B:360:0x233f, B:362:0x2361, B:364:0x2367, B:366:0x236b, B:368:0x237e, B:370:0x23a9, B:372:0x23af, B:374:0x23ed, B:376:0x23f1, B:378:0x2404, B:380:0x240a, B:385:0x2437, B:554:0x23b3, B:556:0x23b9, B:559:0x23bf, B:572:0x2399, B:573:0x2343, B:576:0x234b, B:578:0x2353, B:581:0x231f, B:583:0x2325, B:585:0x2329, B:587:0x232e), top: B:320:0x22bd }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x23af A[Catch: Exception -> 0x22f0, TryCatch #0 {Exception -> 0x22f0, blocks: (B:321:0x22bd, B:323:0x22c1, B:325:0x22d3, B:327:0x22d9, B:329:0x22dd, B:331:0x22e5, B:333:0x22eb, B:336:0x2311, B:338:0x2314, B:339:0x22f4, B:341:0x22f8, B:343:0x22fc, B:345:0x2300, B:347:0x2304, B:354:0x2317, B:356:0x231b, B:358:0x233b, B:360:0x233f, B:362:0x2361, B:364:0x2367, B:366:0x236b, B:368:0x237e, B:370:0x23a9, B:372:0x23af, B:374:0x23ed, B:376:0x23f1, B:378:0x2404, B:380:0x240a, B:385:0x2437, B:554:0x23b3, B:556:0x23b9, B:559:0x23bf, B:572:0x2399, B:573:0x2343, B:576:0x234b, B:578:0x2353, B:581:0x231f, B:583:0x2325, B:585:0x2329, B:587:0x232e), top: B:320:0x22bd }] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x2470  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x2754  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x2791  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x2799  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x2661  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x23bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:565:0x23d4  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x23d7  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x2243 A[Catch: Exception -> 0x2246, TRY_LEAVE, TryCatch #11 {Exception -> 0x2246, blocks: (B:293:0x21f1, B:295:0x21f7, B:592:0x2243), top: B:292:0x21f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:595:0x210b  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x2173  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x2183 A[LOOP:12: B:643:0x217e->B:645:0x2183, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:646:0x2195 A[EDGE_INSN: B:646:0x2195->B:647:0x2195 BREAK  A[LOOP:12: B:643:0x217e->B:645:0x2183], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:663:0x1d58  */
    /* JADX WARN: Removed duplicated region for block: B:799:0x1caf  */
    /* JADX WARN: Removed duplicated region for block: B:805:0x1be4  */
    /* JADX WARN: Removed duplicated region for block: B:810:0x1c47  */
    /* JADX WARN: Removed duplicated region for block: B:827:0x1c91 A[EDGE_INSN: B:827:0x1c91->B:828:0x1c91 BREAK  A[LOOP:13: B:808:0x1c42->B:823:0x1c7b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:829:0x1c06  */
    /* JADX WARN: Removed duplicated region for block: B:832:0x1a0f A[Catch: Exception -> 0x1997, TryCatch #2 {Exception -> 0x1997, blocks: (B:153:0x197e, B:156:0x198d, B:157:0x19a0, B:160:0x19b6, B:162:0x19bc, B:163:0x19c8, B:165:0x19db, B:167:0x19e1, B:170:0x19f2, B:172:0x19f6, B:173:0x1a30, B:175:0x1a34, B:177:0x1a3d, B:178:0x1a45, B:832:0x1a0f), top: B:152:0x197e }] */
    /* JADX WARN: Removed duplicated region for block: B:834:0x19b5  */
    /* JADX WARN: Removed duplicated region for block: B:844:0x199c  */
    /* JADX WARN: Removed duplicated region for block: B:848:0x1969  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x16cf  */
    /* JADX WARN: Removed duplicated region for block: B:852:0x18b3  */
    /* JADX WARN: Removed duplicated region for block: B:858:0x18d6  */
    /* JADX WARN: Removed duplicated region for block: B:883:0x17e3  */
    /* JADX WARN: Removed duplicated region for block: B:895:0x1776  */
    /* JADX WARN: Removed duplicated region for block: B:897:0x1761  */
    /* JADX WARN: Removed duplicated region for block: B:900:0x1722  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x1735  */
    /* JADX WARN: Removed duplicated region for block: B:972:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:989:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x1766  */
    /* JADX WARN: Type inference failed for: r11v59, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r12v51, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r3v212, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v215, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r52v0, types: [android.view.View, org.telegram.ui.Cells.p2] */
    /* JADX WARN: Type inference failed for: r8v46, types: [android.text.SpannableStringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u() {
        int i10;
        float f10;
        float f11;
        boolean z10;
        int i11;
        CharSequence charSequence;
        long j10;
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        TLRPC.DraftMessage draftMessage;
        TLRPC.DraftMessage draftMessage2;
        TLRPC.DraftMessage draftMessage3;
        boolean z14;
        CharSequence charSequence2;
        CharSequence charSequence3;
        boolean z15;
        int i13;
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
        char c10;
        String str2;
        CharSequence charSequence14;
        boolean isChannelAndNotMegaGroup;
        String formatPluralString;
        char c11;
        int i14;
        String formatPluralString2;
        SpannableStringBuilder Q0;
        MessageObject messageObject2;
        TLRPC.Message message;
        String str3;
        int i15;
        CharSequence replaceEmoji2;
        CharSequence charSequence15;
        CharSequence highlightText;
        TLRPC.User user;
        MessageObject messageObject3;
        TLRPC.User user2;
        CharSequence charSequence16;
        CharSequence charSequence17;
        CharSequence charSequence18;
        CharSequence G;
        CharSequence charSequence19;
        String str4;
        String str5;
        String str6;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessagePeerReaction> arrayList2;
        CharSequence formatString;
        CharSequence charSequence20;
        CharSequence charSequence21;
        CharSequence charSequence22;
        String stringForMessageListDate;
        MessageObject messageObject4;
        boolean z19;
        String str7;
        String str8;
        MessagesController messagesController;
        CharSequence charSequence23;
        CharSequence escape;
        String str9;
        CharSequence charSequence24;
        String str10;
        String str11;
        boolean z20;
        CharSequence charSequence25;
        int i16;
        boolean z21;
        String str12;
        String str13;
        boolean z22;
        MessageObject messageObject5;
        TLRPC.Message message2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i17;
        TLRPC.Chat chat2;
        MessageObject messageObject6;
        float f12;
        int i18;
        int i19;
        float f13;
        boolean z23;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        int dp;
        int dp2;
        int dp3;
        int i20;
        int i21;
        ImageReceiver[] imageReceiverArr;
        int i22;
        int i23;
        wr wrVar;
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
        int i26;
        CharSequence highlightText2;
        wr wrVar2;
        int dp5;
        int dp6;
        wr wrVar3;
        int dp7;
        CharSequence highlightText3;
        CharSequence charSequence28;
        SpannableStringBuilder I;
        if (this.f0) {
            return;
        }
        if (this.J0 && !this.A4.a() && this.F0 == 0 && this.G0 == 0 && this.d2 == null) {
            return;
        }
        if (!this.n2) {
            int i27 = SharedConfig.PASSCODE_TYPE_PIN;
        }
        org.telegram.ui.ActionBar.g6.B0[0].setTextSize(AndroidUtilities.dp(17.0f));
        org.telegram.ui.ActionBar.g6.C0[0].setTextSize(AndroidUtilities.dp(17.0f));
        org.telegram.ui.ActionBar.g6.F0[0].setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.g6.H0[0].setTextSize(AndroidUtilities.dp(16.0f));
        boolean z24 = true;
        org.telegram.ui.ActionBar.g6.B0[1].setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.g6.C0[1].setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.g6.F0[1].setTextSize(AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.g6.H0[1].setTextSize(AndroidUtilities.dp(15.0f));
        TextPaint textPaint = org.telegram.ui.ActionBar.g6.F0[1];
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i9, this.B4);
        textPaint.linkColor = v02;
        textPaint.setColor(v02);
        this.A0 = 1;
        this.D4 = 18;
        this.I0 = 0;
        CharSequence printingString = (Q() || !(this.J0 || this.L)) ? null : MessagesController.getInstance(this.B0).getPrintingString(this.D0, getTopicId(), true);
        this.T = org.telegram.ui.ActionBar.g6.F0[this.A0];
        this.C2 = false;
        this.b4 = false;
        this.c4 = false;
        this.d4 = false;
        this.t0 = false;
        this.u0 = false;
        this.h4 = 0;
        this.v3 = false;
        this.N1 = 0;
        this.O1 = false;
        this.z2 = false;
        boolean z25 = (UserObject.isUserSelf(this.b2) || this.q2) ? false : true;
        this.f2 = -1;
        if (!Q()) {
            this.d3 = null;
        }
        setOpenBotButton(false);
        if ((this.n2 || SharedConfig.useThreeLinesLayout) && this.F0 == 0 && !Q() && !M()) {
            this.S = false;
            i10 = 2;
        } else {
            this.S = true;
            i10 = 1;
        }
        MessageObject messageObject8 = this.b1;
        if (messageObject8 != null) {
            messageObject8.updateTranslation();
        }
        MessageObject messageObject9 = this.b1;
        CharSequence charSequence29 = messageObject9 != null ? messageObject9.messageText : null;
        if (charSequence29 instanceof Spannable) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence29);
            f10 = 17.0f;
            f11 = 16.0f;
            for (s41 s41Var : (s41[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), s41.class)) {
                spannableStringBuilder.removeSpan(s41Var);
            }
            for (r41 r41Var : (r41[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), r41.class)) {
                spannableStringBuilder.removeSpan(r41Var);
            }
            charSequence29 = spannableStringBuilder;
        } else {
            f10 = 17.0f;
            f11 = 16.0f;
        }
        this.e1 = charSequence29;
        if (this.B) {
            this.v3 = true;
            z10 = false;
            z25 = false;
        } else {
            z10 = true;
        }
        k2 k2Var = this.C0;
        if (k2Var != null) {
            if (k2Var.g == 2) {
                this.C2 = true;
                if (this.n2 || SharedConfig.useThreeLinesLayout) {
                    this.G2 = AndroidUtilities.dp(12.5f);
                    if (LocaleController.isRTL) {
                        this.F2 = (getMeasuredWidth() - AndroidUtilities.dp(this.E + 6)) - org.telegram.ui.ActionBar.g6.a1.getIntrinsicWidth();
                        this.t2 = AndroidUtilities.dp(22.0f);
                    } else {
                        this.F2 = AndroidUtilities.dp(this.E + 6);
                        this.t2 = org.telegram.ui.ActionBar.g6.a1.getIntrinsicWidth() + AndroidUtilities.dp(this.E + 10);
                    }
                } else {
                    this.G2 = AndroidUtilities.dp(16.5f);
                    if (LocaleController.isRTL) {
                        this.F2 = (getMeasuredWidth() - AndroidUtilities.dp(this.E + 4)) - org.telegram.ui.ActionBar.g6.a1.getIntrinsicWidth();
                        this.t2 = AndroidUtilities.dp(18.0f);
                    } else {
                        this.F2 = AndroidUtilities.dp(this.E + 4);
                        this.t2 = org.telegram.ui.ActionBar.g6.a1.getIntrinsicWidth() + AndroidUtilities.dp(this.E + 8);
                    }
                }
            } else {
                this.b4 = !this.j1 && k2Var.i;
                if (this.n2 || SharedConfig.useThreeLinesLayout) {
                    if (LocaleController.isRTL) {
                        this.t2 = AndroidUtilities.dp(22.0f);
                    } else {
                        this.t2 = AndroidUtilities.dp(this.E + 6);
                    }
                } else if (LocaleController.isRTL) {
                    this.t2 = AndroidUtilities.dp(18.0f);
                } else {
                    this.t2 = AndroidUtilities.dp(this.E + 4);
                }
            }
            k2 k2Var2 = this.C0;
            if (k2Var2.g == 1) {
                string = LocaleController.getString(R.string.FromYou);
                k2 k2Var3 = this.C0;
                if (k2Var3.j) {
                    this.T = org.telegram.ui.ActionBar.g6.H0[this.A0];
                    I = I(this.b1.messageText, null, i10);
                    I.setSpan(new s00(org.telegram.ui.ActionBar.g6.o9, this.B4), 0, I.length(), 33);
                } else {
                    String str14 = k2Var3.b;
                    if (str14.length() > 150) {
                        str14 = str14.substring(0, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    }
                    I = (this.n2 || SharedConfig.useThreeLinesLayout) ? I(str14, string, i10) : I(str14.replace('\n', ' '), string, i10);
                }
                charSequence28 = Emoji.replaceEmoji(I, org.telegram.ui.ActionBar.g6.F0[this.A0].getFontMetricsInt(), false);
                z20 = false;
            } else {
                charSequence28 = k2Var2.b;
                if (k2Var2.j) {
                    this.T = org.telegram.ui.ActionBar.g6.H0[this.A0];
                }
                string = null;
                z20 = true;
            }
            str11 = LocaleController.stringForMessageListDate(this.C0.h);
            int i28 = this.C0.d;
            if (i28 != 0) {
                this.C3 = true;
                str7 = String.format("%d", Integer.valueOf(i28));
            } else {
                this.C3 = false;
                str7 = null;
            }
            k2 k2Var4 = this.C0;
            int i29 = k2Var4.k;
            if (i29 == 2) {
                this.M2 = true;
                this.N2 = true;
                this.O2 = false;
            } else if (i29 == 1) {
                this.M2 = false;
                this.N2 = true;
                this.O2 = false;
            } else {
                this.O2 = false;
                this.M2 = false;
                this.N2 = false;
            }
            this.p3 = false;
            charSequence23 = k2Var4.a;
            replaceEmoji = charSequence28;
            str10 = null;
            charSequence25 = null;
            charSequence24 = "";
            i13 = -1;
        } else {
            if (this.n2 || SharedConfig.useThreeLinesLayout) {
                if (LocaleController.isRTL) {
                    this.t2 = AndroidUtilities.dp(22.0f);
                } else {
                    this.t2 = AndroidUtilities.dp(this.E + 6);
                }
            } else if (LocaleController.isRTL) {
                this.t2 = AndroidUtilities.dp(18.0f);
            } else {
                this.t2 = AndroidUtilities.dp(this.E + 4);
            }
            if (this.d2 != null) {
                if (this.F0 == 0) {
                    this.C2 = true;
                    if (this.n2 || SharedConfig.useThreeLinesLayout) {
                        this.G2 = AndroidUtilities.dp(12.5f);
                        if (LocaleController.isRTL) {
                            this.F2 = (getMeasuredWidth() - AndroidUtilities.dp(this.E + 6)) - org.telegram.ui.ActionBar.g6.a1.getIntrinsicWidth();
                            this.t2 = AndroidUtilities.dp(22.0f);
                        } else {
                            this.F2 = AndroidUtilities.dp(this.E + 6);
                            this.t2 = org.telegram.ui.ActionBar.g6.a1.getIntrinsicWidth() + AndroidUtilities.dp(this.E + 10);
                        }
                    } else {
                        this.G2 = AndroidUtilities.dp(16.5f);
                        if (LocaleController.isRTL) {
                            this.F2 = (getMeasuredWidth() - AndroidUtilities.dp(this.E + 4)) - org.telegram.ui.ActionBar.g6.a1.getIntrinsicWidth();
                            this.t2 = AndroidUtilities.dp(18.0f);
                        } else {
                            this.F2 = AndroidUtilities.dp(this.E + 4);
                            this.t2 = org.telegram.ui.ActionBar.g6.a1.getIntrinsicWidth() + AndroidUtilities.dp(this.E + 8);
                        }
                    }
                }
            } else if (this.F0 == 0 && !this.L) {
                TLRPC.Chat chat3 = this.c2;
                if (chat3 != null) {
                    long botVerificationIcon = DialogObject.getBotVerificationIcon(chat3);
                    TLRPC.Chat chat4 = this.c2;
                    if (chat4.scam) {
                        this.h4 = 1;
                        org.telegram.ui.ActionBar.g6.g1.a();
                    } else if (chat4.fake) {
                        this.h4 = 2;
                        org.telegram.ui.ActionBar.g6.h1.a();
                    } else if (DialogObject.getEmojiStatusDocumentId(chat4.emoji_status) != 0) {
                        this.d4 = true;
                        this.z2 = true;
                        org.telegram.ui.Components.i5 i5Var = this.f4;
                        i5Var.a = LocaleController.isRTL;
                        i5Var.j(DialogObject.getEmojiStatusDocumentId(this.c2.emoji_status), false);
                        this.f4.m(DialogObject.isEmojiStatusCollectible(this.c2.emoji_status), false);
                    } else {
                        boolean z26 = this.j1;
                        this.b4 = !z26 && this.c2.verified;
                        this.c4 = (z26 || this.c2.bot_verification_icon == 0) ? false : true;
                    }
                    charSequence = charSequence29;
                    j10 = botVerificationIcon;
                    i11 = i10;
                } else {
                    TLRPC.User user3 = this.b2;
                    if (user3 != null) {
                        j10 = DialogObject.getBotVerificationIcon(user3);
                        TLRPC.User user4 = this.b2;
                        if (user4.scam) {
                            this.h4 = 1;
                            org.telegram.ui.ActionBar.g6.g1.a();
                        } else if (user4.fake) {
                            this.h4 = 2;
                            org.telegram.ui.ActionBar.g6.h1.a();
                        } else {
                            boolean z27 = this.j1;
                            this.b4 = !z27 && user4.verified;
                            if (z27 || UserObject.isUserSelf(user4)) {
                                charSequence = charSequence29;
                            } else {
                                charSequence = charSequence29;
                                if (this.b2.bot_verification_icon != 0) {
                                    z11 = true;
                                    this.c4 = z11;
                                    if (MessagesController.getInstance(this.B0).isPremiumUser(this.b2)) {
                                        long j11 = UserConfig.getInstance(this.B0).clientUserId;
                                        i11 = i10;
                                        long j12 = this.b2.id;
                                        if (j11 != j12 && j12 != 0) {
                                            z12 = true;
                                            this.d4 = z12;
                                            if (z12) {
                                                Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(this.b2);
                                                org.telegram.ui.Components.i5 i5Var2 = this.f4;
                                                i5Var2.a = LocaleController.isRTL;
                                                if (emojiStatusDocumentId != null) {
                                                    this.z2 = true;
                                                    i5Var2.j(emojiStatusDocumentId.longValue(), false);
                                                    this.f4.m(DialogObject.isEmojiStatusCollectible(this.b2.emoji_status), false);
                                                } else {
                                                    this.z2 = true;
                                                    i5Var2.g(ag.j2.d().e, false);
                                                    this.f4.m(false, false);
                                                }
                                            }
                                        }
                                    } else {
                                        i11 = i10;
                                    }
                                    z12 = false;
                                    this.d4 = z12;
                                    if (z12) {
                                    }
                                }
                            }
                            z11 = false;
                            this.c4 = z11;
                            if (MessagesController.getInstance(this.B0).isPremiumUser(this.b2)) {
                            }
                            z12 = false;
                            this.d4 = z12;
                            if (z12) {
                            }
                        }
                        charSequence = charSequence29;
                        if (MessagesController.getInstance(this.B0).isPremiumUser(this.b2)) {
                        }
                        z12 = false;
                        this.d4 = z12;
                        if (z12) {
                        }
                    } else {
                        i11 = i10;
                        charSequence = charSequence29;
                        j10 = 0;
                    }
                }
                if (j10 != 0 && this.c4) {
                    this.g4.j(j10, false);
                }
                i12 = this.N0;
                if (i12 == 0 && (messageObject6 = this.b1) != null) {
                    i12 = messageObject6.messageOwner.date;
                }
                if (!this.L) {
                    boolean z28 = MediaDataController.getInstance(this.B0).getDraftVoice(this.D0, (long) getTopicId()) != null;
                    this.g2 = z28;
                    TLRPC.DraftMessage draft = !z28 ? MediaDataController.getInstance(this.B0).getDraft(this.D0, getTopicId()) : null;
                    this.h2 = draft;
                    if (draft != null && TextUtils.isEmpty(draft.message)) {
                        this.h2 = null;
                    }
                } else if (this.J0 || this.o0) {
                    boolean z29 = MediaDataController.getInstance(this.B0).getDraftVoice(this.D0, (long) getTopicId()) != null;
                    this.g2 = z29;
                    this.h2 = !z29 ? MediaDataController.getInstance(this.B0).getDraft(this.D0, 0L) : null;
                } else {
                    this.g2 = false;
                    this.h2 = null;
                }
                z13 = this.g2;
                if (!z13 || this.h2 != null) {
                    if (!z13 && (draftMessage2 = this.h2) != null && TextUtils.isEmpty(draftMessage2.message)) {
                        draftMessage3 = this.h2;
                        if (draftMessage3.rich_message == null) {
                            TLRPC.InputReplyTo inputReplyTo = draftMessage3.reply_to;
                            if (inputReplyTo == null) {
                            }
                            this.h2 = null;
                            this.g2 = false;
                            if (Q()) {
                                this.h2 = null;
                                this.g2 = false;
                                this.R = true;
                                c0();
                                string = ChatObject.isMonoForum(this.c2) ? null : AndroidUtilities.escape(getMessageNameString());
                                if (ChatObject.isMonoForum(this.c2)) {
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
                                charSequence20 = J();
                                MessageObject messageObject10 = this.b1;
                                String L = this.b1 != null ? L(i17, string, messageObject10 != null ? MessagesController.getInstance(messageObject10.currentAccount).getRestrictionReason(this.b1.messageOwner.restriction_reason) : null, true) : "";
                                CharSequence charSequence30 = L;
                                if (this.a0) {
                                    int length = L.length();
                                    charSequence30 = L;
                                    charSequence30 = L;
                                    if (length >= 0 && string != null) {
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(L);
                                        valueOf.setSpan(new s00(org.telegram.ui.ActionBar.g6.X8, this.B4), 0, Math.min(valueOf.length(), string.length() + 1), 0);
                                        charSequence30 = valueOf;
                                    }
                                }
                                this.T = org.telegram.ui.ActionBar.g6.F0[this.A0];
                                z16 = z10;
                                charSequence21 = charSequence30;
                            } else {
                                int i30 = i11;
                                if (TextUtils.isEmpty(this.E0)) {
                                    if (printingString != null) {
                                        this.e2 = printingString;
                                        z14 = z25;
                                        charSequence2 = charSequence;
                                        int intValue = MessagesController.getInstance(this.B0).getPrintingStringType(this.D0, getTopicId()).intValue();
                                        this.f2 = intValue;
                                        vv0 t02 = org.telegram.ui.ActionBar.g6.t0(intValue);
                                        int dp8 = t02 != null ? AndroidUtilities.dp(3.0f) + t02.getIntrinsicWidth() : 0;
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                        CharSequence replace = TextUtils.replace(printingString, new String[]{"..."}, new String[]{""});
                                        int indexOf = this.f2 == 5 ? replace.toString().indexOf("**oo**") : -1;
                                        if (indexOf >= 0) {
                                            spannableStringBuilder2.append(replace).setSpan(new n2(org.telegram.ui.ActionBar.g6.t0(this.f2).getIntrinsicWidth()), indexOf, indexOf + 6, 0);
                                        } else {
                                            spannableStringBuilder2.append((CharSequence) " ").append(replace).setSpan(new n2(dp8), 0, 1, 0);
                                        }
                                        i13 = indexOf;
                                        z15 = false;
                                        charSequence3 = spannableStringBuilder2;
                                    } else {
                                        z14 = z25;
                                        charSequence2 = charSequence;
                                        this.e2 = null;
                                        this.f2 = -1;
                                        charSequence3 = "";
                                        z15 = true;
                                        i13 = -1;
                                    }
                                    if (this.g2 || this.h2 != null) {
                                        z16 = z10;
                                        charSequence4 = " ";
                                        CharSequence charSequence31 = charSequence3;
                                        string = LocaleController.getString(R.string.Draft);
                                        TLRPC.DraftMessage draftMessage4 = this.h2;
                                        if (draftMessage4 == null || !TextUtils.isEmpty(draftMessage4.message) || this.h2.rich_message != null) {
                                            TLRPC.DraftMessage draftMessage5 = this.h2;
                                            if (draftMessage5 != null && (richMessage = draftMessage5.rich_message) != null) {
                                                charSequence5 = MessageObject.formatRichMessage(richMessage, false, false, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                                            } else if (this.g2) {
                                                charSequence5 = LocaleController.getString(R.string.AttachAudio);
                                            } else if (draftMessage5 != null) {
                                                String str15 = draftMessage5.message;
                                                int length2 = str15.length();
                                                charSequence5 = str15;
                                                if (length2 > 150) {
                                                    charSequence5 = str15.subSequence(0, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                                                }
                                            } else {
                                                charSequence5 = "";
                                            }
                                            SpannableString spannableString = new SpannableString(charSequence5);
                                            TLRPC.DraftMessage draftMessage6 = this.h2;
                                            if (draftMessage6 != null) {
                                                MediaDataController.addTextStyleRuns(draftMessage6, spannableString, 264);
                                                TLRPC.DraftMessage draftMessage7 = this.h2;
                                                if (draftMessage7 != null && (arrayList = draftMessage7.entities) != null) {
                                                    TextPaint textPaint2 = this.T;
                                                    MediaDataController.addAnimatedEmojiSpans(arrayList, spannableString, textPaint2 == null ? null : textPaint2.getFontMetricsInt());
                                                }
                                            } else if (this.g2) {
                                                spannableString.setSpan(new s00(org.telegram.ui.ActionBar.g6.p9, this.B4), 0, spannableString.length(), 33);
                                            }
                                            SpannableStringBuilder I2 = I(AndroidUtilities.replaceNewLines(spannableString), string, i30);
                                            if ((this.n2 || SharedConfig.useThreeLinesLayout) && !M()) {
                                                z17 = false;
                                            } else {
                                                z17 = false;
                                                I2.setSpan(new s00(org.telegram.ui.ActionBar.g6.j9, this.B4), 0, string.length() + 1, 33);
                                            }
                                            replaceEmoji = Emoji.replaceEmoji(I2, org.telegram.ui.ActionBar.g6.F0[this.A0].getFontMetricsInt(), z17);
                                            charSequence6 = charSequence31;
                                        } else if ((this.n2 || SharedConfig.useThreeLinesLayout) && !M()) {
                                            charSequence6 = charSequence31;
                                            replaceEmoji = "";
                                        } else {
                                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string);
                                            z24 = false;
                                            valueOf2.setSpan(new s00(org.telegram.ui.ActionBar.g6.j9, this.B4), 0, string.length(), 33);
                                            replaceEmoji = valueOf2;
                                            charSequence8 = charSequence31;
                                            z25 = z14;
                                            charSequence7 = null;
                                            charSequence22 = charSequence8;
                                            if (!this.t0 && !P() && !Q() && !O() && this.h2 == null && (messageObject5 = this.b1) != null && (message2 = messageObject5.messageOwner) != null && (message2.action instanceof TLRPC.TL_messageActionStarGift)) {
                                                this.u0 = true;
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(replaceEmoji);
                                                spannableStringBuilder3.insert(0, (CharSequence) "d ");
                                                cq cqVar = new cq(f0.e.d(getContext(), R.drawable.mini_gift).mutate());
                                                cqVar.setScale(1.25f, 1.25f);
                                                cqVar.spaceScaleX = 0.9f;
                                                cqVar.setAlpha(0.9f);
                                                spannableStringBuilder3.setSpan(cqVar, 0, 1, 0);
                                                tL_textWithEntities = ((TLRPC.TL_messageActionStarGift) this.b1.messageOwner.action).message;
                                                if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                                                    this.T = org.telegram.ui.ActionBar.g6.F0[this.A0];
                                                }
                                                replaceEmoji = spannableStringBuilder3;
                                            }
                                            if (TextUtils.isEmpty(this.E0)) {
                                                if (this.h2 != null) {
                                                    stringForMessageListDate = LocaleController.stringForMessageListDate(r5.date);
                                                } else {
                                                    int i31 = this.N0;
                                                    if (i31 != 0) {
                                                        stringForMessageListDate = LocaleController.stringForMessageListDate(i31);
                                                    } else {
                                                        if (this.b1 != null) {
                                                            stringForMessageListDate = LocaleController.stringForMessageListDate(r5.messageOwner.date);
                                                        }
                                                    }
                                                }
                                                messageObject4 = this.b1;
                                                if (messageObject4 != null || this.n0) {
                                                    this.M2 = false;
                                                    this.N2 = false;
                                                    this.O2 = messageObject4 == null && messageObject4.isSending() && this.D0 == UserConfig.getInstance(this.B0).getClientUserId();
                                                    z19 = false;
                                                    this.C3 = false;
                                                    this.T3 = false;
                                                    this.U3 = false;
                                                    this.V3 = false;
                                                    this.p3 = false;
                                                    str7 = null;
                                                    str8 = null;
                                                } else {
                                                    if (this.F0 != 0) {
                                                        int i32 = this.O0;
                                                        int i33 = this.Q0;
                                                        int i34 = i32 + i33;
                                                        if (i34 <= 0) {
                                                            z22 = false;
                                                            this.C3 = false;
                                                            this.T3 = false;
                                                            str13 = null;
                                                        } else if (i32 > i33) {
                                                            this.C3 = true;
                                                            z22 = false;
                                                            this.T3 = false;
                                                            str12 = String.format("%d", Integer.valueOf(i34));
                                                            str13 = null;
                                                            this.U3 = z22;
                                                            this.V3 = z22;
                                                        } else {
                                                            z22 = false;
                                                            this.C3 = false;
                                                            this.T3 = true;
                                                            str13 = String.format("%d", Integer.valueOf(i34));
                                                        }
                                                        str12 = null;
                                                        this.U3 = z22;
                                                        this.V3 = z22;
                                                    } else {
                                                        if (this.d1) {
                                                            this.C3 = false;
                                                            z25 = false;
                                                            z21 = true;
                                                        } else {
                                                            int i35 = this.O0;
                                                            if (i35 != 0) {
                                                                z21 = true;
                                                                this.C3 = true;
                                                                str12 = String.format("%d", Integer.valueOf(i35));
                                                            } else {
                                                                z21 = true;
                                                                if (this.P0) {
                                                                    this.C3 = true;
                                                                    str12 = "";
                                                                } else {
                                                                    this.C3 = false;
                                                                }
                                                            }
                                                            if (this.Q0 == 0) {
                                                                this.T3 = z21;
                                                                str13 = "@";
                                                            } else {
                                                                this.T3 = false;
                                                                str13 = null;
                                                            }
                                                            this.U3 = this.R0 <= 0;
                                                            this.V3 = this.S0 <= 0;
                                                        }
                                                        str12 = null;
                                                        if (this.Q0 == 0) {
                                                        }
                                                        this.U3 = this.R0 <= 0;
                                                        this.V3 = this.S0 <= 0;
                                                    }
                                                    if (this.b1.isOut() && this.h2 == null && z25) {
                                                        MessageObject messageObject11 = this.b1;
                                                        if (!(messageObject11.messageOwner.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                                                            if (messageObject11.isSending()) {
                                                                z19 = false;
                                                                this.M2 = false;
                                                                this.N2 = false;
                                                                this.O2 = true;
                                                                this.p3 = false;
                                                            } else {
                                                                z19 = false;
                                                                if (this.b1.isSendError()) {
                                                                    this.M2 = false;
                                                                    this.N2 = false;
                                                                    this.O2 = false;
                                                                    this.p3 = true;
                                                                    this.C3 = false;
                                                                    this.T3 = false;
                                                                } else if (this.b1.isSent()) {
                                                                    TLRPC.TL_forumTopic tL_forumTopic = this.J;
                                                                    if (tL_forumTopic != null) {
                                                                        this.M2 = tL_forumTopic.read_outbox_max_id >= this.b1.getId();
                                                                    } else if (this.J0) {
                                                                        int i36 = this.z4;
                                                                        this.M2 = (i36 > 0 && i36 >= this.b1.getId()) || !this.b1.isUnread() || (ChatObject.isChannel(this.c2) && !this.c2.megagroup);
                                                                    } else {
                                                                        this.M2 = !this.b1.isUnread() || (ChatObject.isChannel(this.c2) && !this.c2.megagroup);
                                                                    }
                                                                    this.N2 = true;
                                                                    z19 = false;
                                                                    this.O2 = false;
                                                                    this.p3 = false;
                                                                } else {
                                                                    z19 = false;
                                                                }
                                                            }
                                                            str8 = str13;
                                                            str7 = str12;
                                                        }
                                                    }
                                                    z19 = false;
                                                    this.M2 = false;
                                                    this.N2 = false;
                                                    this.O2 = false;
                                                    this.p3 = false;
                                                    str8 = str13;
                                                    str7 = str12;
                                                }
                                                this.L2 = z19;
                                                messagesController = MessagesController.getInstance(this.B0);
                                                if (this.f1 == 0 && messagesController.isPromoDialog(this.D0, true)) {
                                                    this.v3 = true;
                                                    this.L2 = true;
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
                                                            this.N1 = 0;
                                                        }
                                                    }
                                                }
                                                charSequence23 = this.H0;
                                                if (charSequence23 == null) {
                                                    if (this.F0 != 0) {
                                                        charSequence23 = LocaleController.getString(R.string.ArchivedChats);
                                                    } else {
                                                        TLRPC.Chat chat5 = this.c2;
                                                        if (chat5 != null) {
                                                            if (this.K) {
                                                                if (this.d0 == null) {
                                                                    this.d0 = new Drawable[1];
                                                                }
                                                                this.d0[0] = null;
                                                                escape = MessagesController.getInstance(this.B0).getTopicsController().getTopicIconName(this.c2, this.b1, this.T, this.d0);
                                                            } else if (this.L) {
                                                                if (this.d0 == null) {
                                                                    this.d0 = new Drawable[1];
                                                                }
                                                                Drawable[] drawableArr = this.d0;
                                                                drawableArr[0] = null;
                                                                escape = this.c0 ? wf.c.j(this.J, org.telegram.ui.ActionBar.g6.B0[this.A0], drawableArr) : AndroidUtilities.escape(this.J.title);
                                                            } else if (!chat5.monoforum || chat5.linked_monoforum_id == 0) {
                                                                escape = AndroidUtilities.escape(chat5.title);
                                                            } else {
                                                                TLRPC.Chat chat6 = MessagesController.getInstance(this.B0).getChat(Long.valueOf(this.c2.linked_monoforum_id));
                                                                if (chat6 != null) {
                                                                    ?? spannableStringBuilder4 = new SpannableStringBuilder(AndroidUtilities.escape(chat6.title));
                                                                    spannableStringBuilder4.append(charSequence4);
                                                                    int length3 = spannableStringBuilder4.length();
                                                                    spannableStringBuilder4.append(LocaleController.getString(R.string.MonoforumSpan));
                                                                    spannableStringBuilder4.setSpan(new p00(LocaleController.getString(R.string.MonoforumSpan), org.telegram.ui.ActionBar.g6.y6, this.B4), length3, spannableStringBuilder4.length(), 33);
                                                                    str9 = spannableStringBuilder4;
                                                                } else {
                                                                    str9 = AndroidUtilities.escape(this.c2.title);
                                                                }
                                                                charSequence23 = str9;
                                                            }
                                                            charSequence23 = escape;
                                                        } else {
                                                            TLRPC.User user5 = this.b2;
                                                            if (user5 != null) {
                                                                if (UserObject.isReplyUser(user5)) {
                                                                    escape = LocaleController.getString(R.string.RepliesTitle);
                                                                } else if (UserObject.isAnonymous(this.b2)) {
                                                                    escape = LocaleController.getString(R.string.AnonymousForward);
                                                                } else if (!UserObject.isUserSelf(this.b2) || this.m0) {
                                                                    if (this.L) {
                                                                        if (this.d0 == null) {
                                                                            this.d0 = new Drawable[1];
                                                                        }
                                                                        Drawable[] drawableArr2 = this.d0;
                                                                        drawableArr2[0] = null;
                                                                        escape = this.c0 ? wf.c.j(this.J, org.telegram.ui.ActionBar.g6.B0[this.A0], drawableArr2) : AndroidUtilities.escape(this.J.title);
                                                                    } else {
                                                                        escape = AndroidUtilities.escape(UserObject.getUserName(this.b2));
                                                                    }
                                                                } else if (this.n0) {
                                                                    escape = LocaleController.getString(R.string.MyNotes);
                                                                } else if (this.q2) {
                                                                    escape = LocaleController.getString(R.string.FromYou);
                                                                } else {
                                                                    if (this.f1 == 3) {
                                                                        this.v3 = true;
                                                                    }
                                                                    escape = LocaleController.getString(R.string.SavedMessages);
                                                                }
                                                                charSequence23 = escape;
                                                            }
                                                            charSequence23 = "";
                                                        }
                                                        if (charSequence23 != null && charSequence23.length() == 0) {
                                                            charSequence23 = LocaleController.getString(R.string.HiddenName);
                                                        }
                                                    }
                                                }
                                                charSequence24 = charSequence22;
                                                str10 = str8;
                                                z10 = z16;
                                                str11 = stringForMessageListDate;
                                                z20 = z24;
                                                charSequence25 = charSequence7;
                                            }
                                            stringForMessageListDate = "";
                                            messageObject4 = this.b1;
                                            if (messageObject4 != null) {
                                            }
                                            this.M2 = false;
                                            this.N2 = false;
                                            this.O2 = messageObject4 == null && messageObject4.isSending() && this.D0 == UserConfig.getInstance(this.B0).getClientUserId();
                                            z19 = false;
                                            this.C3 = false;
                                            this.T3 = false;
                                            this.U3 = false;
                                            this.V3 = false;
                                            this.p3 = false;
                                            str7 = null;
                                            str8 = null;
                                            this.L2 = z19;
                                            messagesController = MessagesController.getInstance(this.B0);
                                            if (this.f1 == 0) {
                                                this.v3 = true;
                                                this.L2 = true;
                                                i16 = messagesController.promoDialogType;
                                                if (i16 != MessagesController.PROMO_TYPE_PROXY) {
                                                }
                                            }
                                            charSequence23 = this.H0;
                                            if (charSequence23 == null) {
                                            }
                                            charSequence24 = charSequence22;
                                            str10 = str8;
                                            z10 = z16;
                                            str11 = stringForMessageListDate;
                                            z20 = z24;
                                            charSequence25 = charSequence7;
                                        }
                                        z25 = z14;
                                        charSequence7 = null;
                                        z24 = false;
                                        charSequence22 = charSequence6;
                                        if (!this.t0) {
                                            this.u0 = true;
                                            SpannableStringBuilder spannableStringBuilder32 = new SpannableStringBuilder(replaceEmoji);
                                            spannableStringBuilder32.insert(0, (CharSequence) "d ");
                                            cq cqVar2 = new cq(f0.e.d(getContext(), R.drawable.mini_gift).mutate());
                                            cqVar2.setScale(1.25f, 1.25f);
                                            cqVar2.spaceScaleX = 0.9f;
                                            cqVar2.setAlpha(0.9f);
                                            spannableStringBuilder32.setSpan(cqVar2, 0, 1, 0);
                                            tL_textWithEntities = ((TLRPC.TL_messageActionStarGift) this.b1.messageOwner.action).message;
                                            if (tL_textWithEntities != null) {
                                                this.T = org.telegram.ui.ActionBar.g6.F0[this.A0];
                                            }
                                            replaceEmoji = spannableStringBuilder32;
                                        }
                                        if (TextUtils.isEmpty(this.E0)) {
                                        }
                                        stringForMessageListDate = "";
                                        messageObject4 = this.b1;
                                        if (messageObject4 != null) {
                                        }
                                        this.M2 = false;
                                        this.N2 = false;
                                        this.O2 = messageObject4 == null && messageObject4.isSending() && this.D0 == UserConfig.getInstance(this.B0).getClientUserId();
                                        z19 = false;
                                        this.C3 = false;
                                        this.T3 = false;
                                        this.U3 = false;
                                        this.V3 = false;
                                        this.p3 = false;
                                        str7 = null;
                                        str8 = null;
                                        this.L2 = z19;
                                        messagesController = MessagesController.getInstance(this.B0);
                                        if (this.f1 == 0) {
                                        }
                                        charSequence23 = this.H0;
                                        if (charSequence23 == null) {
                                        }
                                        charSequence24 = charSequence22;
                                        str10 = str8;
                                        z10 = z16;
                                        str11 = stringForMessageListDate;
                                        z20 = z24;
                                        charSequence25 = charSequence7;
                                    } else {
                                        if (this.d1) {
                                            this.T = org.telegram.ui.ActionBar.g6.H0[this.A0];
                                            formatString = LocaleController.getString(R.string.HistoryCleared);
                                        } else {
                                            MessageObject messageObject12 = this.b1;
                                            if (messageObject12 != null) {
                                                String restrictionReason = MessagesController.getInstance(messageObject12.currentAccount).getRestrictionReason(this.b1.messageOwner.restriction_reason);
                                                long fromChatId = this.b1.getFromChatId();
                                                if (DialogObject.isUserDialog(fromChatId)) {
                                                    MessagesController.getInstance(this.B0).getUser(Long.valueOf(fromChatId));
                                                    chat = null;
                                                } else {
                                                    chat = MessagesController.getInstance(this.B0).getChat(Long.valueOf(-fromChatId));
                                                }
                                                this.D3 = true;
                                                if (this.f1 == 0) {
                                                    charSequence9 = " ";
                                                    if (this.D0 > 0 && this.b1.isOutOwner() && (tL_messageReactions = this.b1.messageOwner.reactions) != null && (arrayList2 = tL_messageReactions.recent_reactions) != null && !arrayList2.isEmpty() && this.R0 > 0) {
                                                        TLRPC.MessagePeerReaction messagePeerReaction = this.b1.messageOwner.reactions.recent_reactions.get(0);
                                                        if (messagePeerReaction.unread) {
                                                            long j13 = messagePeerReaction.peer_id.user_id;
                                                            if (j13 != 0 && j13 != UserConfig.getInstance(this.B0).clientUserId) {
                                                                ig.q0 d = ig.q0.d(messagePeerReaction.reaction);
                                                                this.T = org.telegram.ui.ActionBar.g6.H0[this.A0];
                                                                String str16 = d.f;
                                                                if (str16 != null) {
                                                                    z18 = true;
                                                                    str = LocaleController.formatString(R.string.ReactionInDialog, str16);
                                                                    charSequence10 = charSequence3;
                                                                    z16 = z10;
                                                                } else {
                                                                    String formatString2 = LocaleController.formatString(R.string.ReactionInDialog, "**reaction**");
                                                                    int indexOf2 = formatString2.indexOf("**reaction**");
                                                                    ?? spannableStringBuilder5 = new SpannableStringBuilder(formatString2.replace("**reaction**", "d"));
                                                                    charSequence10 = charSequence3;
                                                                    z16 = z10;
                                                                    long j14 = d.g;
                                                                    TextPaint textPaint3 = this.T;
                                                                    spannableStringBuilder5.setSpan(new org.telegram.ui.Components.t5(j14, textPaint3 == null ? null : textPaint3.getFontMetricsInt()), indexOf2, indexOf2 + 1, 0);
                                                                    str = spannableStringBuilder5;
                                                                    z18 = true;
                                                                }
                                                                if (z18) {
                                                                    int i37 = this.f1;
                                                                    if (i37 == 2) {
                                                                        TLRPC.Chat chat7 = this.c2;
                                                                        if (chat7 != null) {
                                                                            if (ChatObject.isChannel(chat7)) {
                                                                                TLRPC.Chat chat8 = this.c2;
                                                                                if (!chat8.megagroup) {
                                                                                    int i38 = chat8.participants_count;
                                                                                    str5 = i38 != 0 ? LocaleController.formatPluralStringComma("Subscribers", i38) : !ChatObject.isPublic(chat8) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                                                                                }
                                                                            }
                                                                            TLRPC.Chat chat9 = this.c2;
                                                                            int i39 = chat9.participants_count;
                                                                            str5 = i39 != 0 ? LocaleController.formatPluralStringComma("Members", i39) : chat9.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat9) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase();
                                                                        } else {
                                                                            str5 = "";
                                                                        }
                                                                        this.D3 = false;
                                                                        str4 = str5;
                                                                    } else if (i37 == 3 && UserObject.isUserSelf(this.b2)) {
                                                                        gy gyVar = this.v4;
                                                                        str4 = LocaleController.getString((gyVar == null || !gyVar.K0) ? R.string.SavedMessagesInfo : R.string.SavedMessagesInfoQuote);
                                                                    } else {
                                                                        boolean z30 = this.n2;
                                                                        if (!z30 && !SharedConfig.useThreeLinesLayout && this.G0 != 0) {
                                                                            G = H();
                                                                        } else if (z30 || SharedConfig.useThreeLinesLayout || this.F0 == 0) {
                                                                            MessageObject messageObject13 = this.b1;
                                                                            if (!(messageObject13.messageOwner instanceof TLRPC.TL_messageService) || (MessageObject.isTopicActionMessage(messageObject13) && !(this.b1.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate))) {
                                                                                CharSequence charSequence32 = charSequence2;
                                                                                this.R = true;
                                                                                c0();
                                                                                String escape2 = (this.n0 || (user2 = this.b2) == null || !user2.self || this.b1.isOutOwner()) ? null : AndroidUtilities.escape(getMessageNameString());
                                                                                if ((!this.n0 || (user = this.b2) == null || user.self || (messageObject3 = this.b1) == null || !messageObject3.isOutOwner()) && escape2 == null && ((messageObject = this.b1) == null || (message = messageObject.messageOwner) == null || message.guestchat_via_from == null)) {
                                                                                    TLRPC.Chat chat10 = this.c2;
                                                                                    if (chat10 != null) {
                                                                                        long j15 = chat10.id;
                                                                                        if (j15 > 0) {
                                                                                            if (chat != null) {
                                                                                            }
                                                                                            if (ChatObject.isChannel(chat10)) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    TLRPC.User user6 = this.b2;
                                                                                    if (user6 == null || user6.id != UserObject.VERIFY || (messageObject2 = this.b1) == null || messageObject2.getForwardedFromId() == null) {
                                                                                        boolean isEmpty = TextUtils.isEmpty(restrictionReason);
                                                                                        CharSequence charSequence33 = restrictionReason;
                                                                                        if (isEmpty) {
                                                                                            if (MessageObject.isTopicActionMessage(this.b1)) {
                                                                                                MessageObject messageObject14 = this.b1;
                                                                                                CharSequence charSequence34 = messageObject14.messageTextShort;
                                                                                                if (charSequence34 == null || ((messageObject14.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate) && this.L)) {
                                                                                                    charSequence34 = messageObject14.messageText;
                                                                                                }
                                                                                                CharSequence charSequence35 = charSequence34;
                                                                                                charSequence33 = charSequence35;
                                                                                                if (messageObject14.topicIconDrawable[0] instanceof wf.a) {
                                                                                                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.B0).getTopicsController().findTopic(-this.b1.getDialogId(), MessageObject.getTopicId(this.B0, this.b1.messageOwner, true));
                                                                                                    charSequence33 = charSequence35;
                                                                                                    if (findTopic != null) {
                                                                                                        ((wf.a) this.b1.topicIconDrawable[0]).b(findTopic.icon_color);
                                                                                                        charSequence33 = charSequence35;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                TLRPC.MessageMedia messageMedia = this.b1.messageOwner.media;
                                                                                                if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                                                                                                    charSequence33 = LocaleController.getString(R.string.AttachPhotoExpired);
                                                                                                } else {
                                                                                                    if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                                                                                        TLRPC.Document document = messageMedia.document;
                                                                                                        if (((document instanceof TLRPC.TL_documentEmpty) || document == null) && messageMedia.ttl_seconds != 0) {
                                                                                                            charSequence33 = messageMedia.voice ? LocaleController.getString(R.string.AttachVoiceExpired) : messageMedia.round ? LocaleController.getString(R.string.AttachRoundExpired) : LocaleController.getString(R.string.AttachVideoExpired);
                                                                                                        }
                                                                                                    }
                                                                                                    String str17 = "🎧 ";
                                                                                                    if (getCaptionMessage() == null || (this.b1.messageOwner.media instanceof TLRPC.TL_messageMediaPoll)) {
                                                                                                        MessageObject messageObject15 = this.b1;
                                                                                                        TLRPC.Message message3 = messageObject15.messageOwner;
                                                                                                        TLRPC.MessageMedia messageMedia2 = message3.media;
                                                                                                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                                                                                            int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia2).extended_media.size();
                                                                                                            if (this.O1) {
                                                                                                                i14 = 1;
                                                                                                                c11 = 0;
                                                                                                                formatPluralString2 = size > 1 ? LocaleController.formatPluralString("Media", size, new Object[0]) : LocaleController.getString(R.string.AttachVideo);
                                                                                                            } else {
                                                                                                                c11 = 0;
                                                                                                                i14 = 1;
                                                                                                                formatPluralString2 = size > 1 ? LocaleController.formatPluralString("Photos", size, new Object[0]) : LocaleController.getString(R.string.AttachPhoto);
                                                                                                            }
                                                                                                            int i40 = R.string.AttachPaidMedia;
                                                                                                            Object[] objArr = new Object[i14];
                                                                                                            objArr[c11] = formatPluralString2;
                                                                                                            Q0 = hh.oa.Q0(LocaleController.formatString(i40, objArr));
                                                                                                            this.T = org.telegram.ui.ActionBar.g6.H0[this.A0];
                                                                                                        } else if (this.N1 > 1) {
                                                                                                            if (this.O1) {
                                                                                                                ArrayList arrayList3 = this.c1;
                                                                                                                formatPluralString = LocaleController.formatPluralString("Media", arrayList3 == null ? 0 : arrayList3.size(), new Object[0]);
                                                                                                            } else {
                                                                                                                ArrayList arrayList4 = this.c1;
                                                                                                                formatPluralString = LocaleController.formatPluralString("Photos", arrayList4 == null ? 0 : arrayList4.size(), new Object[0]);
                                                                                                            }
                                                                                                            charSequence33 = formatPluralString;
                                                                                                            this.T = org.telegram.ui.ActionBar.g6.H0[this.A0];
                                                                                                        } else {
                                                                                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                                                                                                                TLRPC.MessageFwdHeader messageFwdHeader = message3.fwd_from;
                                                                                                                if (messageFwdHeader != null) {
                                                                                                                    TLRPC.Peer peer = messageFwdHeader.from_id;
                                                                                                                    if (peer instanceof TLRPC.TL_peerChannel) {
                                                                                                                        isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(peer.channel_id, this.B0);
                                                                                                                        charSequence14 = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                                                                                                                    }
                                                                                                                }
                                                                                                                isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.c2);
                                                                                                                charSequence14 = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                                                                                                charSequence14 = LocaleController.getString(R.string.BoostingGiveawayResults);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                                                                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                                                                                                                if (tL_textWithEntities2 == null || tL_textWithEntities2.entities == null) {
                                                                                                                    charSequence14 = vg.a.a(R.drawable.dialog_media_poll_20, tL_textWithEntities2.text, false);
                                                                                                                } else {
                                                                                                                    SpannableString spannableString2 = new SpannableString(tL_messageMediaPoll.poll.question.text);
                                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaPoll.poll.question;
                                                                                                                    MediaDataController.addTextStyleRuns(tL_textWithEntities3.entities, tL_textWithEntities3.text, spannableString2);
                                                                                                                    MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString2, org.telegram.ui.ActionBar.g6.F0[this.A0].getFontMetricsInt());
                                                                                                                    charSequence14 = vg.a.a(R.drawable.dialog_media_poll_20, spannableString2, false);
                                                                                                                }
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                                                                                                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia2;
                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                                                                                                                if (tL_textWithEntities4 == null || tL_textWithEntities4.entities == null) {
                                                                                                                    charSequence14 = vg.a.a(R.drawable.dialog_media_checklist_20, tL_textWithEntities4.text, false);
                                                                                                                } else {
                                                                                                                    SpannableString spannableString3 = new SpannableString(tL_messageMediaToDo.todo.title.text);
                                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_messageMediaToDo.todo.title;
                                                                                                                    MediaDataController.addTextStyleRuns(tL_textWithEntities5.entities, tL_textWithEntities5.text, spannableString3);
                                                                                                                    MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString3, org.telegram.ui.ActionBar.g6.F0[this.A0].getFontMetricsInt());
                                                                                                                    charSequence14 = vg.a.a(R.drawable.dialog_media_checklist_20, spannableString3, false);
                                                                                                                }
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                                                                                charSequence14 = vg.a.a(R.drawable.dialog_media_game_20, messageMedia2.game.title, false);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice) {
                                                                                                                charSequence14 = messageMedia2.title;
                                                                                                            } else if (messageObject15.type == 14) {
                                                                                                                charSequence14 = i0.a.n("🎧 ", messageObject15.getMusicAuthor(), " - ", this.b1.getMusicTitle());
                                                                                                            } else if (!(messageMedia2 instanceof TLRPC.TL_messageMediaStory) || !messageMedia2.via_mention) {
                                                                                                                if (!messageObject15.hasHighlightedWords() || TextUtils.isEmpty(this.b1.messageOwner.message)) {
                                                                                                                    SpannableString spannableString4 = new SpannableString(charSequence32);
                                                                                                                    MessageObject messageObject16 = this.b1;
                                                                                                                    if (messageObject16 != null) {
                                                                                                                        messageObject16.spoilLoginCode();
                                                                                                                    }
                                                                                                                    MediaDataController.addTextStyleRuns(this.b1, spannableString4, 264);
                                                                                                                    MessageObject messageObject17 = this.b1;
                                                                                                                    charSequence13 = spannableString4;
                                                                                                                    if (messageObject17 != null) {
                                                                                                                        TLRPC.Message message4 = messageObject17.messageOwner;
                                                                                                                        charSequence13 = spannableString4;
                                                                                                                        if (message4 != null) {
                                                                                                                            ArrayList<TLRPC.MessageEntity> arrayList5 = message4.entities;
                                                                                                                            TextPaint textPaint4 = this.T;
                                                                                                                            MediaDataController.addAnimatedEmojiSpans(arrayList5, spannableString4, textPaint4 == null ? null : textPaint4.getFontMetricsInt());
                                                                                                                            charSequence13 = spannableString4;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    CharSequence charSequence36 = this.b1.messageTrimmedToHighlight;
                                                                                                                    int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.E + 23);
                                                                                                                    MessageObject messageObject18 = this.b1;
                                                                                                                    charSequence13 = charSequence36;
                                                                                                                    if (messageObject18.messageTrimmedToHighlightCut) {
                                                                                                                        charSequence13 = AndroidUtilities.ellipsizeCenterEnd(charSequence36, messageObject18.highlightedWords.get(0), measuredWidth, this.T, 130);
                                                                                                                    }
                                                                                                                }
                                                                                                                AndroidUtilities.highlightText(charSequence13, this.b1.highlightedWords, this.B4);
                                                                                                                charSequence14 = charSequence13;
                                                                                                            } else if (messageObject15.isOut()) {
                                                                                                                TLRPC.User user7 = MessagesController.getInstance(this.B0).getUser(Long.valueOf(this.b1.getDialogId()));
                                                                                                                if (user7 != null) {
                                                                                                                    str2 = UserObject.getFirstName(user7);
                                                                                                                    int indexOf3 = str2.indexOf(32);
                                                                                                                    c10 = 0;
                                                                                                                    if (indexOf3 >= 0) {
                                                                                                                        str2 = str2.substring(0, indexOf3);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    c10 = 0;
                                                                                                                    str2 = "";
                                                                                                                }
                                                                                                                int i41 = R.string.StoryYouMentionInDialog;
                                                                                                                Object[] objArr2 = new Object[1];
                                                                                                                objArr2[c10] = str2;
                                                                                                                charSequence14 = LocaleController.formatString(i41, objArr2);
                                                                                                            } else {
                                                                                                                charSequence14 = LocaleController.getString(R.string.StoryMentionInDialog);
                                                                                                            }
                                                                                                            CharSequence charSequence37 = charSequence14;
                                                                                                            MessageObject messageObject19 = this.b1;
                                                                                                            if (messageObject19.messageOwner.media == null || messageObject19.isMediaEmpty()) {
                                                                                                                TL_iv.RichMessage richMessage2 = this.b1.messageOwner.rich_message;
                                                                                                                charSequence33 = charSequence37;
                                                                                                                if (richMessage2 != null) {
                                                                                                                    charSequence33 = charSequence37;
                                                                                                                    if (richMessage2.blocks.size() == 1) {
                                                                                                                        charSequence33 = charSequence37;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            this.T = org.telegram.ui.ActionBar.g6.H0[this.A0];
                                                                                                            charSequence33 = charSequence37;
                                                                                                        }
                                                                                                    } else {
                                                                                                        MessageObject captionMessage = getCaptionMessage();
                                                                                                        if (!this.R) {
                                                                                                            str17 = "";
                                                                                                        } else if (captionMessage.isVideo()) {
                                                                                                            str17 = "📹 ";
                                                                                                        } else if (captionMessage.isVoice()) {
                                                                                                            str17 = "🎤 ";
                                                                                                        } else if (!captionMessage.isMusic()) {
                                                                                                            str17 = captionMessage.isPhoto() ? "🖼 " : "📎 ";
                                                                                                        }
                                                                                                        if (!captionMessage.hasHighlightedWords() || TextUtils.isEmpty(captionMessage.messageOwner.message)) {
                                                                                                            SpannableString spannableString5 = new SpannableString(captionMessage.caption);
                                                                                                            if (captionMessage.messageOwner != null) {
                                                                                                                captionMessage.spoilLoginCode();
                                                                                                                MediaDataController.addTextStyleRuns(captionMessage.messageOwner.entities, captionMessage.caption, spannableString5, 264);
                                                                                                                ArrayList<TLRPC.MessageEntity> arrayList6 = captionMessage.messageOwner.entities;
                                                                                                                TextPaint textPaint5 = this.T;
                                                                                                                MediaDataController.addAnimatedEmojiSpans(arrayList6, spannableString5, textPaint5 == null ? null : textPaint5.getFontMetricsInt());
                                                                                                            }
                                                                                                            Q0 = new SpannableStringBuilder(str17).append((CharSequence) spannableString5);
                                                                                                        } else {
                                                                                                            CharSequence charSequence38 = captionMessage.messageTrimmedToHighlight;
                                                                                                            int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(this.E + 47);
                                                                                                            if (this.S) {
                                                                                                                if (!TextUtils.isEmpty(null)) {
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                measuredWidth2 = (int) (measuredWidth2 - this.T.measureText(": "));
                                                                                                            }
                                                                                                            if (measuredWidth2 > 0 && captionMessage.messageTrimmedToHighlightCut) {
                                                                                                                charSequence38 = AndroidUtilities.ellipsizeCenterEnd(charSequence38, captionMessage.highlightedWords.get(0), measuredWidth2, this.T, 130);
                                                                                                            }
                                                                                                            Q0 = new SpannableStringBuilder(str17).append(charSequence38);
                                                                                                        }
                                                                                                    }
                                                                                                    charSequence33 = Q0;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        CharSequence charSequence39 = charSequence33;
                                                                                        if (this.b1.isReplyToStory()) {
                                                                                            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(charSequence33);
                                                                                            spannableStringBuilder6.insert(0, (CharSequence) "d ");
                                                                                            spannableStringBuilder6.setSpan(new cq(f0.e.d(getContext(), R.drawable.msg_mini_replystory).mutate()), 0, 1, 0);
                                                                                            charSequence39 = spannableStringBuilder6;
                                                                                        }
                                                                                        if (this.N1 > 0) {
                                                                                            if (!this.b1.hasHighlightedWords() || TextUtils.isEmpty(this.b1.messageOwner.message)) {
                                                                                                int length4 = charSequence39.length();
                                                                                                CharSequence charSequence40 = charSequence39;
                                                                                                if (length4 > 150) {
                                                                                                    charSequence40 = charSequence39.subSequence(0, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                                                                                                }
                                                                                                replaceNewLines = AndroidUtilities.replaceNewLines(charSequence40);
                                                                                            } else {
                                                                                                replaceNewLines = this.b1.messageTrimmedToHighlight;
                                                                                                int measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp((((this.D4 + 2) * this.N1) + (this.E + 23)) + 3);
                                                                                                MessageObject messageObject20 = this.b1;
                                                                                                if (messageObject20.messageTrimmedToHighlightCut) {
                                                                                                    replaceNewLines = AndroidUtilities.ellipsizeCenterEnd(replaceNewLines, messageObject20.highlightedWords.get(0), measuredWidth3, this.T, 130);
                                                                                                }
                                                                                            }
                                                                                            CharSequence spannableStringBuilder7 = !(replaceNewLines instanceof SpannableStringBuilder) ? new SpannableStringBuilder(replaceNewLines) : replaceNewLines;
                                                                                            SpannableStringBuilder spannableStringBuilder8 = (SpannableStringBuilder) spannableStringBuilder7;
                                                                                            charSequence4 = charSequence9;
                                                                                            spannableStringBuilder8.insert(0, charSequence4);
                                                                                            spannableStringBuilder8.setSpan(new n2(AndroidUtilities.dp(((this.D4 + 2) * this.N1) + 3)), 0, 1, 33);
                                                                                            Emoji.replaceEmoji(spannableStringBuilder8, org.telegram.ui.ActionBar.g6.F0[this.A0].getFontMetricsInt(), false);
                                                                                            CharSequence charSequence41 = spannableStringBuilder7;
                                                                                            if (this.b1.hasHighlightedWords()) {
                                                                                                CharSequence highlightText4 = AndroidUtilities.highlightText(spannableStringBuilder8, this.b1.highlightedWords, this.B4);
                                                                                                charSequence41 = spannableStringBuilder7;
                                                                                                if (highlightText4 != null) {
                                                                                                    charSequence41 = highlightText4;
                                                                                                }
                                                                                            }
                                                                                            z15 = false;
                                                                                            charSequence11 = charSequence41;
                                                                                        } else {
                                                                                            charSequence4 = charSequence9;
                                                                                            charSequence11 = charSequence39;
                                                                                        }
                                                                                        if (this.b1.isForwarded() && this.b1.needDrawForwarded()) {
                                                                                            this.t0 = true;
                                                                                            SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder(charSequence11);
                                                                                            spannableStringBuilder9.insert(0, (CharSequence) "d ");
                                                                                            cq cqVar3 = new cq(f0.e.d(getContext(), R.drawable.mini_forwarded).mutate());
                                                                                            cqVar3.setAlpha(0.9f);
                                                                                            spannableStringBuilder9.setSpan(cqVar3, 0, 1, 0);
                                                                                            charSequence12 = spannableStringBuilder9;
                                                                                        } else {
                                                                                            charSequence12 = charSequence11;
                                                                                        }
                                                                                        z25 = z14;
                                                                                        charSequence19 = charSequence12;
                                                                                        str3 = null;
                                                                                        charSequence15 = charSequence19;
                                                                                        if (this.G0 == 0) {
                                                                                            str6 = H();
                                                                                        } else if (this.F0 != 0) {
                                                                                            str6 = G();
                                                                                        } else {
                                                                                            z24 = z15;
                                                                                            replaceEmoji = charSequence15;
                                                                                            charSequence8 = charSequence10;
                                                                                            string = str3;
                                                                                            charSequence7 = null;
                                                                                            charSequence22 = charSequence8;
                                                                                            if (!this.t0) {
                                                                                            }
                                                                                            if (TextUtils.isEmpty(this.E0)) {
                                                                                            }
                                                                                            stringForMessageListDate = "";
                                                                                            messageObject4 = this.b1;
                                                                                            if (messageObject4 != null) {
                                                                                            }
                                                                                            this.M2 = false;
                                                                                            this.N2 = false;
                                                                                            this.O2 = messageObject4 == null && messageObject4.isSending() && this.D0 == UserConfig.getInstance(this.B0).getClientUserId();
                                                                                            z19 = false;
                                                                                            this.C3 = false;
                                                                                            this.T3 = false;
                                                                                            this.U3 = false;
                                                                                            this.V3 = false;
                                                                                            this.p3 = false;
                                                                                            str7 = null;
                                                                                            str8 = null;
                                                                                            this.L2 = z19;
                                                                                            messagesController = MessagesController.getInstance(this.B0);
                                                                                            if (this.f1 == 0) {
                                                                                            }
                                                                                            charSequence23 = this.H0;
                                                                                            if (charSequence23 == null) {
                                                                                            }
                                                                                            charSequence24 = charSequence22;
                                                                                            str10 = str8;
                                                                                            z10 = z16;
                                                                                            str11 = stringForMessageListDate;
                                                                                            z20 = z24;
                                                                                            charSequence25 = charSequence7;
                                                                                        }
                                                                                        z24 = z15;
                                                                                        replaceEmoji = charSequence15;
                                                                                        string = str6;
                                                                                        charSequence8 = charSequence10;
                                                                                        charSequence7 = null;
                                                                                        charSequence22 = charSequence8;
                                                                                        if (!this.t0) {
                                                                                        }
                                                                                        if (TextUtils.isEmpty(this.E0)) {
                                                                                        }
                                                                                        stringForMessageListDate = "";
                                                                                        messageObject4 = this.b1;
                                                                                        if (messageObject4 != null) {
                                                                                        }
                                                                                        this.M2 = false;
                                                                                        this.N2 = false;
                                                                                        this.O2 = messageObject4 == null && messageObject4.isSending() && this.D0 == UserConfig.getInstance(this.B0).getClientUserId();
                                                                                        z19 = false;
                                                                                        this.C3 = false;
                                                                                        this.T3 = false;
                                                                                        this.U3 = false;
                                                                                        this.V3 = false;
                                                                                        this.p3 = false;
                                                                                        str7 = null;
                                                                                        str8 = null;
                                                                                        this.L2 = z19;
                                                                                        messagesController = MessagesController.getInstance(this.B0);
                                                                                        if (this.f1 == 0) {
                                                                                        }
                                                                                        charSequence23 = this.H0;
                                                                                        if (charSequence23 == null) {
                                                                                        }
                                                                                        charSequence24 = charSequence22;
                                                                                        str10 = str8;
                                                                                        z10 = z16;
                                                                                        str11 = stringForMessageListDate;
                                                                                        z20 = z24;
                                                                                        charSequence25 = charSequence7;
                                                                                    }
                                                                                }
                                                                                charSequence4 = charSequence9;
                                                                                if (escape2 == null) {
                                                                                    escape2 = getMessageNameString();
                                                                                }
                                                                                String escape3 = AndroidUtilities.escape(escape2);
                                                                                TLRPC.Chat chat11 = this.c2;
                                                                                if (chat11 != null && chat11.forum && !this.L && !this.K) {
                                                                                    CharSequence topicIconName = MessagesController.getInstance(this.B0).getTopicsController().getTopicIconName(this.c2, this.b1, this.T);
                                                                                    if (!TextUtils.isEmpty(topicIconName)) {
                                                                                        SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder("-");
                                                                                        cq cqVar4 = new cq(f0.e.d(ApplicationLoader.applicationContext, R.drawable.msg_mini_forumarrow).mutate());
                                                                                        cqVar4.setColorKey((this.n2 || SharedConfig.useThreeLinesLayout) ? -1 : org.telegram.ui.ActionBar.g6.k9);
                                                                                        spannableStringBuilder10.setSpan(cqVar4, 0, 1, 0);
                                                                                        ?? spannableStringBuilder11 = new SpannableStringBuilder();
                                                                                        spannableStringBuilder11.append(escape3).append((CharSequence) spannableStringBuilder10).append(topicIconName);
                                                                                        str3 = spannableStringBuilder11;
                                                                                        SpannableStringBuilder L2 = L(i30, str3, restrictionReason, false);
                                                                                        if (!this.K || ((this.n2 || SharedConfig.useThreeLinesLayout) && (this.F0 == 0 || L2.length() <= 0))) {
                                                                                            i15 = 0;
                                                                                        } else {
                                                                                            try {
                                                                                                s00 s00Var = new s00(org.telegram.ui.ActionBar.g6.k9, this.B4);
                                                                                                i15 = str3.length() + 1;
                                                                                                try {
                                                                                                    L2.setSpan(s00Var, 0, i15, 33);
                                                                                                } catch (Exception e9) {
                                                                                                    e = e9;
                                                                                                    FileLog.e(e);
                                                                                                    replaceEmoji2 = Emoji.replaceEmoji(L2, org.telegram.ui.ActionBar.g6.F0[this.A0].getFontMetricsInt(), false);
                                                                                                    if (this.b1.hasHighlightedWords()) {
                                                                                                    }
                                                                                                    if (this.N1 > 0) {
                                                                                                    }
                                                                                                    charSequence15 = replaceEmoji2;
                                                                                                    z25 = z14;
                                                                                                    z15 = false;
                                                                                                    if (this.G0 == 0) {
                                                                                                    }
                                                                                                    z24 = z15;
                                                                                                    replaceEmoji = charSequence15;
                                                                                                    string = str6;
                                                                                                    charSequence8 = charSequence10;
                                                                                                    charSequence7 = null;
                                                                                                    charSequence22 = charSequence8;
                                                                                                    if (!this.t0) {
                                                                                                    }
                                                                                                    if (TextUtils.isEmpty(this.E0)) {
                                                                                                    }
                                                                                                    stringForMessageListDate = "";
                                                                                                    messageObject4 = this.b1;
                                                                                                    if (messageObject4 != null) {
                                                                                                    }
                                                                                                    this.M2 = false;
                                                                                                    this.N2 = false;
                                                                                                    this.O2 = messageObject4 == null && messageObject4.isSending() && this.D0 == UserConfig.getInstance(this.B0).getClientUserId();
                                                                                                    z19 = false;
                                                                                                    this.C3 = false;
                                                                                                    this.T3 = false;
                                                                                                    this.U3 = false;
                                                                                                    this.V3 = false;
                                                                                                    this.p3 = false;
                                                                                                    str7 = null;
                                                                                                    str8 = null;
                                                                                                    this.L2 = z19;
                                                                                                    messagesController = MessagesController.getInstance(this.B0);
                                                                                                    if (this.f1 == 0) {
                                                                                                    }
                                                                                                    charSequence23 = this.H0;
                                                                                                    if (charSequence23 == null) {
                                                                                                    }
                                                                                                    charSequence24 = charSequence22;
                                                                                                    str10 = str8;
                                                                                                    z10 = z16;
                                                                                                    str11 = stringForMessageListDate;
                                                                                                    z20 = z24;
                                                                                                    charSequence25 = charSequence7;
                                                                                                    CharSequence charSequence42 = string;
                                                                                                    if (z10) {
                                                                                                    }
                                                                                                    if (F()) {
                                                                                                    }
                                                                                                    if (LocaleController.isRTL) {
                                                                                                    }
                                                                                                    if (this.C2) {
                                                                                                    }
                                                                                                    if (!this.O2) {
                                                                                                    }
                                                                                                    f13 = 5.0f;
                                                                                                    if (this.V0) {
                                                                                                    }
                                                                                                    if (!this.d4) {
                                                                                                    }
                                                                                                    if (z23) {
                                                                                                    }
                                                                                                    f14 = 36.0f;
                                                                                                    if (this.c4) {
                                                                                                    }
                                                                                                    dp7 = this.u2 - AndroidUtilities.dp(12.0f);
                                                                                                    if (dp7 < 0) {
                                                                                                    }
                                                                                                    if (charSequence23 instanceof String) {
                                                                                                    }
                                                                                                    if (this.z2) {
                                                                                                    }
                                                                                                    float f22 = dp7;
                                                                                                    this.N = org.telegram.ui.ActionBar.g6.B0[this.A0].measureText(charSequence23.toString()) <= f22;
                                                                                                    if (!this.M) {
                                                                                                    }
                                                                                                    CharSequence replaceEmoji3 = Emoji.replaceEmoji(charSequence23, org.telegram.ui.ActionBar.g6.B0[this.A0].getFontMetricsInt(), false);
                                                                                                    MessageObject messageObject21 = this.b1;
                                                                                                    if (messageObject21 == null) {
                                                                                                    }
                                                                                                    if (this.M) {
                                                                                                    }
                                                                                                    this.x2 = (this.z2 || !this.v2.isRtlCharAt(0)) ? 0.0f : -AndroidUtilities.dp(f14);
                                                                                                    this.y2 = this.v2.isRtlCharAt(0);
                                                                                                    this.l3 = org.telegram.ui.Components.t5.update(0, (View) this, this.l3, this.v2);
                                                                                                    if (this.n2) {
                                                                                                    }
                                                                                                    f18 = 39.0f;
                                                                                                    f19 = 32.0f;
                                                                                                    f20 = 30.0f;
                                                                                                    f21 = 24.0f;
                                                                                                    dp = AndroidUtilities.dp(11.0f);
                                                                                                    this.m3 = AndroidUtilities.dp(32.0f);
                                                                                                    this.I2 = AndroidUtilities.dp(13.0f);
                                                                                                    this.q3 = AndroidUtilities.dp(42.33f);
                                                                                                    this.y3 = AndroidUtilities.dp(43.0f);
                                                                                                    this.E3 = AndroidUtilities.dp(42.33f);
                                                                                                    this.S2 = AndroidUtilities.dp(13.0f);
                                                                                                    int measuredWidth4 = getMeasuredWidth() - AndroidUtilities.dp(this.E + 21);
                                                                                                    if (LocaleController.isRTL) {
                                                                                                    }
                                                                                                    i20 = dp3;
                                                                                                    this.q0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
                                                                                                    i21 = 0;
                                                                                                    while (true) {
                                                                                                        imageReceiverArr = this.R1;
                                                                                                        if (i21 >= imageReceiverArr.length) {
                                                                                                        }
                                                                                                        imageReceiverArr[i21].setImageCoords(((this.D4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.M ? AndroidUtilities.dp(20.0f) : 0)) - ((this.n2 || SharedConfig.useThreeLinesLayout || (wrVar = this.p0) == null || wrVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                                                                                                        i21++;
                                                                                                        dp = dp;
                                                                                                    }
                                                                                                    i22 = dp;
                                                                                                    i23 = measuredWidth4;
                                                                                                    if (LocaleController.isRTL) {
                                                                                                    }
                                                                                                    if (this.M) {
                                                                                                    }
                                                                                                    if (!this.n2) {
                                                                                                    }
                                                                                                    this.I2 -= AndroidUtilities.dp(f16);
                                                                                                    this.S2 -= AndroidUtilities.dp(f16);
                                                                                                    if (getIsPinned()) {
                                                                                                    }
                                                                                                    if (!this.p3) {
                                                                                                    }
                                                                                                    if (z20) {
                                                                                                    }
                                                                                                    max = Math.max(AndroidUtilities.dp(12.0f), i23);
                                                                                                    this.c3 = AndroidUtilities.dp((!this.n2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                                                                                                    if (!this.n2) {
                                                                                                    }
                                                                                                    this.c3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
                                                                                                    if (Q()) {
                                                                                                    }
                                                                                                    if (this.M) {
                                                                                                    }
                                                                                                    this.j3 = org.telegram.ui.Components.t5.update(0, (View) this, this.j3, this.o3);
                                                                                                    if (TextUtils.isEmpty(charSequence25)) {
                                                                                                    }
                                                                                                    this.k3 = org.telegram.ui.Components.t5.update(0, (View) this, this.k3, this.d3);
                                                                                                    if (!TextUtils.isEmpty(charSequence24)) {
                                                                                                    }
                                                                                                    if (replaceEmoji instanceof Spannable) {
                                                                                                    }
                                                                                                    if (this.n2) {
                                                                                                    }
                                                                                                    this.T = org.telegram.ui.ActionBar.g6.F0[this.A0];
                                                                                                    charSequence27 = charSequence42;
                                                                                                    charSequence42 = null;
                                                                                                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                                                                                                    if (this.n2) {
                                                                                                    }
                                                                                                    if (this.N1 > 0) {
                                                                                                    }
                                                                                                    int i42 = max;
                                                                                                    TextPaint textPaint6 = this.T;
                                                                                                    float dp9 = AndroidUtilities.dp(1.0f);
                                                                                                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                                                                                    this.a3 = tv0.b(charSequence27, textPaint6, i42, dp9, i42, charSequence42 != null ? 1 : 2);
                                                                                                    max = i42;
                                                                                                    this.e3.addAll(this.f3);
                                                                                                    this.f3.clear();
                                                                                                    eh.k.b(this, this.a3, -2, -2, this.e3, this.f3);
                                                                                                    int i43 = max;
                                                                                                    this.i3 = org.telegram.ui.Components.t5.update(0, (View) this, this.i3, this.a3);
                                                                                                    if (LocaleController.isRTL) {
                                                                                                    }
                                                                                                    staticLayout = this.b3;
                                                                                                    if (staticLayout != null) {
                                                                                                    }
                                                                                                    e0();
                                                                                                }
                                                                                            } catch (Exception e10) {
                                                                                                e = e10;
                                                                                                i15 = 0;
                                                                                            }
                                                                                        }
                                                                                        replaceEmoji2 = Emoji.replaceEmoji(L2, org.telegram.ui.ActionBar.g6.F0[this.A0].getFontMetricsInt(), false);
                                                                                        if (this.b1.hasHighlightedWords() && (highlightText = AndroidUtilities.highlightText(replaceEmoji2, this.b1.highlightedWords, this.B4)) != null) {
                                                                                            replaceEmoji2 = highlightText;
                                                                                        }
                                                                                        if (this.N1 > 0) {
                                                                                            if (!(replaceEmoji2 instanceof SpannableStringBuilder)) {
                                                                                                replaceEmoji2 = new SpannableStringBuilder(replaceEmoji2);
                                                                                            }
                                                                                            SpannableStringBuilder spannableStringBuilder12 = (SpannableStringBuilder) replaceEmoji2;
                                                                                            if (i15 >= spannableStringBuilder12.length()) {
                                                                                                spannableStringBuilder12.append(charSequence4);
                                                                                                spannableStringBuilder12.setSpan(new n2(AndroidUtilities.dp(((this.D4 + 2) * this.N1) + 3)), spannableStringBuilder12.length() - 1, spannableStringBuilder12.length(), 33);
                                                                                            } else {
                                                                                                spannableStringBuilder12.insert(i15, charSequence4);
                                                                                                spannableStringBuilder12.setSpan(new n2(AndroidUtilities.dp(((this.D4 + 2) * this.N1) + 3)), i15, i15 + 1, 33);
                                                                                            }
                                                                                        }
                                                                                        charSequence15 = replaceEmoji2;
                                                                                        z25 = z14;
                                                                                        z15 = false;
                                                                                        if (this.G0 == 0) {
                                                                                        }
                                                                                        z24 = z15;
                                                                                        replaceEmoji = charSequence15;
                                                                                        string = str6;
                                                                                        charSequence8 = charSequence10;
                                                                                        charSequence7 = null;
                                                                                        charSequence22 = charSequence8;
                                                                                        if (!this.t0) {
                                                                                        }
                                                                                        if (TextUtils.isEmpty(this.E0)) {
                                                                                        }
                                                                                        stringForMessageListDate = "";
                                                                                        messageObject4 = this.b1;
                                                                                        if (messageObject4 != null) {
                                                                                        }
                                                                                        this.M2 = false;
                                                                                        this.N2 = false;
                                                                                        this.O2 = messageObject4 == null && messageObject4.isSending() && this.D0 == UserConfig.getInstance(this.B0).getClientUserId();
                                                                                        z19 = false;
                                                                                        this.C3 = false;
                                                                                        this.T3 = false;
                                                                                        this.U3 = false;
                                                                                        this.V3 = false;
                                                                                        this.p3 = false;
                                                                                        str7 = null;
                                                                                        str8 = null;
                                                                                        this.L2 = z19;
                                                                                        messagesController = MessagesController.getInstance(this.B0);
                                                                                        if (this.f1 == 0) {
                                                                                        }
                                                                                        charSequence23 = this.H0;
                                                                                        if (charSequence23 == null) {
                                                                                        }
                                                                                        charSequence24 = charSequence22;
                                                                                        str10 = str8;
                                                                                        z10 = z16;
                                                                                        str11 = stringForMessageListDate;
                                                                                        z20 = z24;
                                                                                        charSequence25 = charSequence7;
                                                                                    }
                                                                                }
                                                                                str3 = escape3;
                                                                                SpannableStringBuilder L22 = L(i30, str3, restrictionReason, false);
                                                                                if (this.K) {
                                                                                }
                                                                                i15 = 0;
                                                                                replaceEmoji2 = Emoji.replaceEmoji(L22, org.telegram.ui.ActionBar.g6.F0[this.A0].getFontMetricsInt(), false);
                                                                                if (this.b1.hasHighlightedWords()) {
                                                                                    replaceEmoji2 = highlightText;
                                                                                }
                                                                                if (this.N1 > 0) {
                                                                                }
                                                                                charSequence15 = replaceEmoji2;
                                                                                z25 = z14;
                                                                                z15 = false;
                                                                                if (this.G0 == 0) {
                                                                                }
                                                                                z24 = z15;
                                                                                replaceEmoji = charSequence15;
                                                                                string = str6;
                                                                                charSequence8 = charSequence10;
                                                                                charSequence7 = null;
                                                                                charSequence22 = charSequence8;
                                                                                if (!this.t0) {
                                                                                }
                                                                                if (TextUtils.isEmpty(this.E0)) {
                                                                                }
                                                                                stringForMessageListDate = "";
                                                                                messageObject4 = this.b1;
                                                                                if (messageObject4 != null) {
                                                                                }
                                                                                this.M2 = false;
                                                                                this.N2 = false;
                                                                                this.O2 = messageObject4 == null && messageObject4.isSending() && this.D0 == UserConfig.getInstance(this.B0).getClientUserId();
                                                                                z19 = false;
                                                                                this.C3 = false;
                                                                                this.T3 = false;
                                                                                this.U3 = false;
                                                                                this.V3 = false;
                                                                                this.p3 = false;
                                                                                str7 = null;
                                                                                str8 = null;
                                                                                this.L2 = z19;
                                                                                messagesController = MessagesController.getInstance(this.B0);
                                                                                if (this.f1 == 0) {
                                                                                }
                                                                                charSequence23 = this.H0;
                                                                                if (charSequence23 == null) {
                                                                                }
                                                                                charSequence24 = charSequence22;
                                                                                str10 = str8;
                                                                                z10 = z16;
                                                                                str11 = stringForMessageListDate;
                                                                                z20 = z24;
                                                                                charSequence25 = charSequence7;
                                                                            } else {
                                                                                MessageObject messageObject22 = this.b1;
                                                                                TLRPC.MessageAction messageAction = messageObject22.messageOwner.action;
                                                                                if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                                                                                    TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall = (TLRPC.TL_messageActionPhoneCall) messageAction;
                                                                                    charSequence16 = messageObject22.isOutOwner() ? vg.a.a(tL_messageActionPhoneCall.video ? R.drawable.dialog_media_outgoing_video_call_20 : R.drawable.dialog_media_outgoing_call_20, charSequence2, false) : vg.a.a(tL_messageActionPhoneCall.video ? R.drawable.dialog_media_incoming_video_call_20 : R.drawable.dialog_media_incoming_call_20, charSequence2, false);
                                                                                } else {
                                                                                    CharSequence charSequence43 = charSequence2;
                                                                                    if (ChatObject.isChannelAndNotMegaGroup(this.c2) && (this.b1.messageOwner.action instanceof TLRPC.TL_messageActionChannelMigrateFrom)) {
                                                                                        charSequence17 = "";
                                                                                        z25 = false;
                                                                                        this.T = org.telegram.ui.ActionBar.g6.H0[this.A0];
                                                                                        if (this.b1.type == 21) {
                                                                                        }
                                                                                    } else {
                                                                                        charSequence16 = this.b1.messageTextShort;
                                                                                        if (charSequence16 == null) {
                                                                                            charSequence17 = charSequence43;
                                                                                            z25 = z14;
                                                                                            this.T = org.telegram.ui.ActionBar.g6.H0[this.A0];
                                                                                            if (this.b1.type == 21) {
                                                                                                c0();
                                                                                                charSequence18 = t(charSequence17);
                                                                                            } else {
                                                                                                charSequence18 = charSequence17;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                charSequence17 = charSequence16;
                                                                                z25 = z14;
                                                                                this.T = org.telegram.ui.ActionBar.g6.H0[this.A0];
                                                                                if (this.b1.type == 21) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            G = G();
                                                                        }
                                                                        charSequence19 = G;
                                                                        z25 = z14;
                                                                        charSequence4 = charSequence9;
                                                                        z15 = false;
                                                                        str3 = null;
                                                                        charSequence15 = charSequence19;
                                                                        if (this.G0 == 0) {
                                                                        }
                                                                        z24 = z15;
                                                                        replaceEmoji = charSequence15;
                                                                        string = str6;
                                                                        charSequence8 = charSequence10;
                                                                        charSequence7 = null;
                                                                        charSequence22 = charSequence8;
                                                                        if (!this.t0) {
                                                                        }
                                                                        if (TextUtils.isEmpty(this.E0)) {
                                                                        }
                                                                        stringForMessageListDate = "";
                                                                        messageObject4 = this.b1;
                                                                        if (messageObject4 != null) {
                                                                        }
                                                                        this.M2 = false;
                                                                        this.N2 = false;
                                                                        this.O2 = messageObject4 == null && messageObject4.isSending() && this.D0 == UserConfig.getInstance(this.B0).getClientUserId();
                                                                        z19 = false;
                                                                        this.C3 = false;
                                                                        this.T3 = false;
                                                                        this.U3 = false;
                                                                        this.V3 = false;
                                                                        this.p3 = false;
                                                                        str7 = null;
                                                                        str8 = null;
                                                                        this.L2 = z19;
                                                                        messagesController = MessagesController.getInstance(this.B0);
                                                                        if (this.f1 == 0) {
                                                                        }
                                                                        charSequence23 = this.H0;
                                                                        if (charSequence23 == null) {
                                                                        }
                                                                        charSequence24 = charSequence22;
                                                                        str10 = str8;
                                                                        z10 = z16;
                                                                        str11 = stringForMessageListDate;
                                                                        z20 = z24;
                                                                        charSequence25 = charSequence7;
                                                                    }
                                                                    charSequence4 = charSequence9;
                                                                    z25 = false;
                                                                    str3 = null;
                                                                    z16 = false;
                                                                    charSequence15 = str4;
                                                                    if (this.G0 == 0) {
                                                                    }
                                                                    z24 = z15;
                                                                    replaceEmoji = charSequence15;
                                                                    string = str6;
                                                                    charSequence8 = charSequence10;
                                                                    charSequence7 = null;
                                                                    charSequence22 = charSequence8;
                                                                    if (!this.t0) {
                                                                    }
                                                                    if (TextUtils.isEmpty(this.E0)) {
                                                                    }
                                                                    stringForMessageListDate = "";
                                                                    messageObject4 = this.b1;
                                                                    if (messageObject4 != null) {
                                                                    }
                                                                    this.M2 = false;
                                                                    this.N2 = false;
                                                                    this.O2 = messageObject4 == null && messageObject4.isSending() && this.D0 == UserConfig.getInstance(this.B0).getClientUserId();
                                                                    z19 = false;
                                                                    this.C3 = false;
                                                                    this.T3 = false;
                                                                    this.U3 = false;
                                                                    this.V3 = false;
                                                                    this.p3 = false;
                                                                    str7 = null;
                                                                    str8 = null;
                                                                    this.L2 = z19;
                                                                    messagesController = MessagesController.getInstance(this.B0);
                                                                    if (this.f1 == 0) {
                                                                    }
                                                                    charSequence23 = this.H0;
                                                                    if (charSequence23 == null) {
                                                                    }
                                                                    charSequence24 = charSequence22;
                                                                    str10 = str8;
                                                                    z10 = z16;
                                                                    str11 = stringForMessageListDate;
                                                                    z20 = z24;
                                                                    charSequence25 = charSequence7;
                                                                } else {
                                                                    charSequence18 = str;
                                                                    z25 = z14;
                                                                }
                                                                charSequence4 = charSequence9;
                                                                charSequence19 = charSequence18;
                                                                str3 = null;
                                                                charSequence15 = charSequence19;
                                                                if (this.G0 == 0) {
                                                                }
                                                                z24 = z15;
                                                                replaceEmoji = charSequence15;
                                                                string = str6;
                                                                charSequence8 = charSequence10;
                                                                charSequence7 = null;
                                                                charSequence22 = charSequence8;
                                                                if (!this.t0) {
                                                                }
                                                                if (TextUtils.isEmpty(this.E0)) {
                                                                }
                                                                stringForMessageListDate = "";
                                                                messageObject4 = this.b1;
                                                                if (messageObject4 != null) {
                                                                }
                                                                this.M2 = false;
                                                                this.N2 = false;
                                                                this.O2 = messageObject4 == null && messageObject4.isSending() && this.D0 == UserConfig.getInstance(this.B0).getClientUserId();
                                                                z19 = false;
                                                                this.C3 = false;
                                                                this.T3 = false;
                                                                this.U3 = false;
                                                                this.V3 = false;
                                                                this.p3 = false;
                                                                str7 = null;
                                                                str8 = null;
                                                                this.L2 = z19;
                                                                messagesController = MessagesController.getInstance(this.B0);
                                                                if (this.f1 == 0) {
                                                                }
                                                                charSequence23 = this.H0;
                                                                if (charSequence23 == null) {
                                                                }
                                                                charSequence24 = charSequence22;
                                                                str10 = str8;
                                                                z10 = z16;
                                                                str11 = stringForMessageListDate;
                                                                z20 = z24;
                                                                charSequence25 = charSequence7;
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
                                                charSequence19 = charSequence18;
                                                str3 = null;
                                                charSequence15 = charSequence19;
                                                if (this.G0 == 0) {
                                                }
                                                z24 = z15;
                                                replaceEmoji = charSequence15;
                                                string = str6;
                                                charSequence8 = charSequence10;
                                                charSequence7 = null;
                                                charSequence22 = charSequence8;
                                                if (!this.t0) {
                                                }
                                                if (TextUtils.isEmpty(this.E0)) {
                                                }
                                                stringForMessageListDate = "";
                                                messageObject4 = this.b1;
                                                if (messageObject4 != null) {
                                                }
                                                this.M2 = false;
                                                this.N2 = false;
                                                this.O2 = messageObject4 == null && messageObject4.isSending() && this.D0 == UserConfig.getInstance(this.B0).getClientUserId();
                                                z19 = false;
                                                this.C3 = false;
                                                this.T3 = false;
                                                this.U3 = false;
                                                this.V3 = false;
                                                this.p3 = false;
                                                str7 = null;
                                                str8 = null;
                                                this.L2 = z19;
                                                messagesController = MessagesController.getInstance(this.B0);
                                                if (this.f1 == 0) {
                                                }
                                                charSequence23 = this.H0;
                                                if (charSequence23 == null) {
                                                }
                                                charSequence24 = charSequence22;
                                                str10 = str8;
                                                z10 = z16;
                                                str11 = stringForMessageListDate;
                                                z20 = z24;
                                                charSequence25 = charSequence7;
                                            } else if (this.G0 != 0) {
                                                formatString = H();
                                            } else if (this.F0 != 0) {
                                                formatString = G();
                                            } else {
                                                TLRPC.EncryptedChat encryptedChat = this.d2;
                                                if (encryptedChat != null) {
                                                    this.T = org.telegram.ui.ActionBar.g6.H0[this.A0];
                                                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                                                        formatString = LocaleController.getString(R.string.EncryptionProcessing);
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                                                        formatString = LocaleController.formatString(R.string.AwaitingEncryption, UserObject.getFirstName(this.b2));
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                                                        formatString = LocaleController.getString(R.string.EncryptionRejected);
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                                                        formatString = encryptedChat.admin_id == UserConfig.getInstance(this.B0).getClientUserId() ? LocaleController.formatString(R.string.EncryptedChatStartedOutgoing, UserObject.getFirstName(this.b2)) : LocaleController.getString(R.string.EncryptedChatStartedIncoming);
                                                    }
                                                } else if (this.f1 == 3 && UserObject.isUserSelf(this.b2)) {
                                                    gy gyVar2 = this.v4;
                                                    z24 = z15;
                                                    replaceEmoji = LocaleController.getString((gyVar2 == null || !gyVar2.K0) ? R.string.SavedMessagesInfo : R.string.SavedMessagesInfoQuote);
                                                    charSequence4 = " ";
                                                    string = null;
                                                    charSequence7 = null;
                                                    z25 = false;
                                                    z16 = false;
                                                    charSequence22 = charSequence3;
                                                    if (!this.t0) {
                                                    }
                                                    if (TextUtils.isEmpty(this.E0)) {
                                                    }
                                                    stringForMessageListDate = "";
                                                    messageObject4 = this.b1;
                                                    if (messageObject4 != null) {
                                                    }
                                                    this.M2 = false;
                                                    this.N2 = false;
                                                    this.O2 = messageObject4 == null && messageObject4.isSending() && this.D0 == UserConfig.getInstance(this.B0).getClientUserId();
                                                    z19 = false;
                                                    this.C3 = false;
                                                    this.T3 = false;
                                                    this.U3 = false;
                                                    this.V3 = false;
                                                    this.p3 = false;
                                                    str7 = null;
                                                    str8 = null;
                                                    this.L2 = z19;
                                                    messagesController = MessagesController.getInstance(this.B0);
                                                    if (this.f1 == 0) {
                                                    }
                                                    charSequence23 = this.H0;
                                                    if (charSequence23 == null) {
                                                    }
                                                    charSequence24 = charSequence22;
                                                    str10 = str8;
                                                    z10 = z16;
                                                    str11 = stringForMessageListDate;
                                                    z20 = z24;
                                                    charSequence25 = charSequence7;
                                                }
                                                z24 = z15;
                                                z16 = z10;
                                                charSequence4 = " ";
                                                replaceEmoji = "";
                                                z25 = z14;
                                                string = null;
                                                charSequence8 = charSequence3;
                                                charSequence7 = null;
                                                charSequence22 = charSequence8;
                                                if (!this.t0) {
                                                }
                                                if (TextUtils.isEmpty(this.E0)) {
                                                }
                                                stringForMessageListDate = "";
                                                messageObject4 = this.b1;
                                                if (messageObject4 != null) {
                                                }
                                                this.M2 = false;
                                                this.N2 = false;
                                                this.O2 = messageObject4 == null && messageObject4.isSending() && this.D0 == UserConfig.getInstance(this.B0).getClientUserId();
                                                z19 = false;
                                                this.C3 = false;
                                                this.T3 = false;
                                                this.U3 = false;
                                                this.V3 = false;
                                                this.p3 = false;
                                                str7 = null;
                                                str8 = null;
                                                this.L2 = z19;
                                                messagesController = MessagesController.getInstance(this.B0);
                                                if (this.f1 == 0) {
                                                }
                                                charSequence23 = this.H0;
                                                if (charSequence23 == null) {
                                                }
                                                charSequence24 = charSequence22;
                                                str10 = str8;
                                                z10 = z16;
                                                str11 = stringForMessageListDate;
                                                z20 = z24;
                                                charSequence25 = charSequence7;
                                            }
                                        }
                                        z24 = z15;
                                        z16 = z10;
                                        replaceEmoji = formatString;
                                        charSequence4 = " ";
                                        z25 = z14;
                                        string = null;
                                        charSequence8 = charSequence3;
                                        charSequence7 = null;
                                        charSequence22 = charSequence8;
                                        if (!this.t0) {
                                        }
                                        if (TextUtils.isEmpty(this.E0)) {
                                        }
                                        stringForMessageListDate = "";
                                        messageObject4 = this.b1;
                                        if (messageObject4 != null) {
                                        }
                                        this.M2 = false;
                                        this.N2 = false;
                                        this.O2 = messageObject4 == null && messageObject4.isSending() && this.D0 == UserConfig.getInstance(this.B0).getClientUserId();
                                        z19 = false;
                                        this.C3 = false;
                                        this.T3 = false;
                                        this.U3 = false;
                                        this.V3 = false;
                                        this.p3 = false;
                                        str7 = null;
                                        str8 = null;
                                        this.L2 = z19;
                                        messagesController = MessagesController.getInstance(this.B0);
                                        if (this.f1 == 0) {
                                        }
                                        charSequence23 = this.H0;
                                        if (charSequence23 == null) {
                                        }
                                        charSequence24 = charSequence22;
                                        str10 = str8;
                                        z10 = z16;
                                        str11 = stringForMessageListDate;
                                        z20 = z24;
                                        charSequence25 = charSequence7;
                                    }
                                } else {
                                    this.h2 = null;
                                    this.g2 = false;
                                    charSequence20 = this.E0;
                                    this.T = org.telegram.ui.ActionBar.g6.F0[this.A0];
                                    z16 = z10;
                                    string = null;
                                    charSequence21 = null;
                                }
                            }
                            replaceEmoji = charSequence20;
                            charSequence4 = " ";
                            charSequence22 = "";
                            i13 = -1;
                            charSequence7 = charSequence21;
                            if (!this.t0) {
                            }
                            if (TextUtils.isEmpty(this.E0)) {
                            }
                            stringForMessageListDate = "";
                            messageObject4 = this.b1;
                            if (messageObject4 != null) {
                            }
                            this.M2 = false;
                            this.N2 = false;
                            this.O2 = messageObject4 == null && messageObject4.isSending() && this.D0 == UserConfig.getInstance(this.B0).getClientUserId();
                            z19 = false;
                            this.C3 = false;
                            this.T3 = false;
                            this.U3 = false;
                            this.V3 = false;
                            this.p3 = false;
                            str7 = null;
                            str8 = null;
                            this.L2 = z19;
                            messagesController = MessagesController.getInstance(this.B0);
                            if (this.f1 == 0) {
                            }
                            charSequence23 = this.H0;
                            if (charSequence23 == null) {
                            }
                            charSequence24 = charSequence22;
                            str10 = str8;
                            z10 = z16;
                            str11 = stringForMessageListDate;
                            z20 = z24;
                            charSequence25 = charSequence7;
                        }
                    }
                    draftMessage = this.h2;
                    if (draftMessage != null) {
                        if (i12 > draftMessage.date) {
                        }
                    }
                }
                if (ChatObject.isChannel(this.c2)) {
                    TLRPC.Chat chat12 = this.c2;
                    if (!chat12.megagroup) {
                        if (!chat12.creator) {
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = chat12.admin_rights;
                            if (tL_chatAdminRights != null) {
                            }
                            this.h2 = null;
                            this.g2 = false;
                            if (Q()) {
                            }
                            replaceEmoji = charSequence20;
                            charSequence4 = " ";
                            charSequence22 = "";
                            i13 = -1;
                            charSequence7 = charSequence21;
                            if (!this.t0) {
                            }
                            if (TextUtils.isEmpty(this.E0)) {
                            }
                            stringForMessageListDate = "";
                            messageObject4 = this.b1;
                            if (messageObject4 != null) {
                            }
                            this.M2 = false;
                            this.N2 = false;
                            this.O2 = messageObject4 == null && messageObject4.isSending() && this.D0 == UserConfig.getInstance(this.B0).getClientUserId();
                            z19 = false;
                            this.C3 = false;
                            this.T3 = false;
                            this.U3 = false;
                            this.V3 = false;
                            this.p3 = false;
                            str7 = null;
                            str8 = null;
                            this.L2 = z19;
                            messagesController = MessagesController.getInstance(this.B0);
                            if (this.f1 == 0) {
                            }
                            charSequence23 = this.H0;
                            if (charSequence23 == null) {
                            }
                            charSequence24 = charSequence22;
                            str10 = str8;
                            z10 = z16;
                            str11 = stringForMessageListDate;
                            z20 = z24;
                            charSequence25 = charSequence7;
                        }
                    }
                }
                chat2 = this.c2;
                if (chat2 != null) {
                    if (chat2.left) {
                    }
                    this.h2 = null;
                    this.g2 = false;
                    if (Q()) {
                    }
                    replaceEmoji = charSequence20;
                    charSequence4 = " ";
                    charSequence22 = "";
                    i13 = -1;
                    charSequence7 = charSequence21;
                    if (!this.t0) {
                    }
                    if (TextUtils.isEmpty(this.E0)) {
                    }
                    stringForMessageListDate = "";
                    messageObject4 = this.b1;
                    if (messageObject4 != null) {
                    }
                    this.M2 = false;
                    this.N2 = false;
                    this.O2 = messageObject4 == null && messageObject4.isSending() && this.D0 == UserConfig.getInstance(this.B0).getClientUserId();
                    z19 = false;
                    this.C3 = false;
                    this.T3 = false;
                    this.U3 = false;
                    this.V3 = false;
                    this.p3 = false;
                    str7 = null;
                    str8 = null;
                    this.L2 = z19;
                    messagesController = MessagesController.getInstance(this.B0);
                    if (this.f1 == 0) {
                    }
                    charSequence23 = this.H0;
                    if (charSequence23 == null) {
                    }
                    charSequence24 = charSequence22;
                    str10 = str8;
                    z10 = z16;
                    str11 = stringForMessageListDate;
                    z20 = z24;
                    charSequence25 = charSequence7;
                }
                if (ChatObject.isForum(chat2)) {
                }
                if (Q()) {
                }
                replaceEmoji = charSequence20;
                charSequence4 = " ";
                charSequence22 = "";
                i13 = -1;
                charSequence7 = charSequence21;
                if (!this.t0) {
                }
                if (TextUtils.isEmpty(this.E0)) {
                }
                stringForMessageListDate = "";
                messageObject4 = this.b1;
                if (messageObject4 != null) {
                }
                this.M2 = false;
                this.N2 = false;
                this.O2 = messageObject4 == null && messageObject4.isSending() && this.D0 == UserConfig.getInstance(this.B0).getClientUserId();
                z19 = false;
                this.C3 = false;
                this.T3 = false;
                this.U3 = false;
                this.V3 = false;
                this.p3 = false;
                str7 = null;
                str8 = null;
                this.L2 = z19;
                messagesController = MessagesController.getInstance(this.B0);
                if (this.f1 == 0) {
                }
                charSequence23 = this.H0;
                if (charSequence23 == null) {
                }
                charSequence24 = charSequence22;
                str10 = str8;
                z10 = z16;
                str11 = stringForMessageListDate;
                z20 = z24;
                charSequence25 = charSequence7;
            }
            i11 = i10;
            charSequence = charSequence29;
            i12 = this.N0;
            if (i12 == 0) {
                i12 = messageObject6.messageOwner.date;
            }
            if (!this.L) {
            }
            z13 = this.g2;
            if (!z13) {
            }
            if (!z13) {
                draftMessage3 = this.h2;
                if (draftMessage3.rich_message == null) {
                }
            }
            draftMessage = this.h2;
            if (draftMessage != null) {
            }
            if (ChatObject.isChannel(this.c2)) {
            }
            chat2 = this.c2;
            if (chat2 != null) {
            }
            if (ChatObject.isForum(chat2)) {
            }
            if (Q()) {
            }
            replaceEmoji = charSequence20;
            charSequence4 = " ";
            charSequence22 = "";
            i13 = -1;
            charSequence7 = charSequence21;
            if (!this.t0) {
            }
            if (TextUtils.isEmpty(this.E0)) {
            }
            stringForMessageListDate = "";
            messageObject4 = this.b1;
            if (messageObject4 != null) {
            }
            this.M2 = false;
            this.N2 = false;
            this.O2 = messageObject4 == null && messageObject4.isSending() && this.D0 == UserConfig.getInstance(this.B0).getClientUserId();
            z19 = false;
            this.C3 = false;
            this.T3 = false;
            this.U3 = false;
            this.V3 = false;
            this.p3 = false;
            str7 = null;
            str8 = null;
            this.L2 = z19;
            messagesController = MessagesController.getInstance(this.B0);
            if (this.f1 == 0) {
            }
            charSequence23 = this.H0;
            if (charSequence23 == null) {
            }
            charSequence24 = charSequence22;
            str10 = str8;
            z10 = z16;
            str11 = stringForMessageListDate;
            z20 = z24;
            charSequence25 = charSequence7;
        }
        CharSequence charSequence422 = string;
        if (z10) {
            f12 = 0.0f;
            this.J2 = null;
            this.H2 = 0;
            i18 = 0;
        } else {
            TextPaint timeTextPaint = getTimeTextPaint();
            f12 = 0.0f;
            int ceil = (int) Math.ceil(timeTextPaint.measureText(str11));
            this.J2 = new StaticLayout(str11, timeTextPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            i18 = AndroidUtilities.dp(getIsPinned() ? 24.0f : 0.0f) + ceil;
            if (LocaleController.isRTL) {
                this.H2 = AndroidUtilities.dp(15.0f);
            } else {
                this.H2 = org.telegram.messenger.y1.B(15.0f, getMeasuredWidth(), i18);
            }
        }
        if (F()) {
            i19 = 0;
        } else {
            if (LocaleController.isRTL) {
                this.K2 = AndroidUtilities.dp(4.0f) + this.H2 + i18;
            } else {
                this.K2 = (this.H2 - org.telegram.ui.ActionBar.g6.b1.getIntrinsicWidth()) - AndroidUtilities.dp(4.0f);
            }
            i19 = org.telegram.ui.ActionBar.g6.b1.getIntrinsicWidth() + AndroidUtilities.dp(4.0f);
            i18 += i19;
        }
        if (LocaleController.isRTL) {
            this.u2 = org.telegram.messenger.y1.B(22.0f, getMeasuredWidth() - this.t2, i18);
        } else {
            this.u2 = org.telegram.messenger.y1.B(this.E + 13, getMeasuredWidth() - this.t2, i18);
            this.t2 += i18;
        }
        if (this.C2) {
            this.u2 -= org.telegram.ui.ActionBar.g6.a1.getIntrinsicWidth() + AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 4.0f);
        }
        if (!this.O2) {
            int dp10 = AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.g6.X0.getIntrinsicWidth();
            this.u2 -= dp10;
            if (LocaleController.isRTL) {
                this.R2 = AndroidUtilities.dp(5.0f) + this.H2 + i18;
                this.t2 += dp10;
            } else {
                this.R2 = (this.H2 - i19) - dp10;
            }
        } else if (this.N2) {
            int dp11 = AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.g6.T0.getIntrinsicWidth();
            int i44 = this.u2 - dp11;
            this.u2 = i44;
            f13 = 5.0f;
            if (this.M2) {
                this.u2 = org.telegram.messenger.y1.A(8.0f, org.telegram.ui.ActionBar.g6.W0.getIntrinsicWidth(), i44);
                if (LocaleController.isRTL) {
                    int dp12 = AndroidUtilities.dp(5.0f) + this.H2 + i18;
                    this.P2 = dp12;
                    this.T2 = AndroidUtilities.dp(5.5f) + dp12;
                    this.t2 = rl.C(8.0f, org.telegram.ui.ActionBar.g6.W0.getIntrinsicWidth() + dp11, this.t2);
                } else {
                    int i45 = (this.H2 - i19) - dp11;
                    this.T2 = i45;
                    this.P2 = i45 - AndroidUtilities.dp(5.5f);
                }
            } else if (LocaleController.isRTL) {
                this.Q2 = AndroidUtilities.dp(5.0f) + this.H2 + i18;
                this.t2 += dp11;
            } else {
                this.Q2 = (this.H2 - i19) - dp11;
            }
            z23 = (!this.V0 || this.M0 || this.X0 || this.Y0 > f12) && !this.b4 && this.h4 == 0;
            if (!this.d4 && this.f4.c() != null) {
                int dp13 = AndroidUtilities.dp(36.0f);
                if (z23) {
                    dp13 = org.telegram.ui.ActionBar.g6.c1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f) + dp13;
                }
                this.u2 -= dp13;
                if (LocaleController.isRTL) {
                    this.t2 += dp13;
                }
            } else if (z23) {
                int intrinsicWidth = org.telegram.ui.ActionBar.g6.c1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
                if (this.d4) {
                    intrinsicWidth += AndroidUtilities.dp(36.0f);
                }
                this.u2 -= intrinsicWidth;
                if (LocaleController.isRTL) {
                    this.t2 += intrinsicWidth;
                }
            } else if (this.b4) {
                int intrinsicWidth2 = org.telegram.ui.ActionBar.g6.f1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
                this.u2 -= intrinsicWidth2;
                if (LocaleController.isRTL) {
                    this.t2 += intrinsicWidth2;
                }
            } else if (this.d4) {
                int dp14 = AndroidUtilities.dp(36.0f);
                this.u2 -= dp14;
                if (LocaleController.isRTL) {
                    this.t2 += dp14;
                }
            } else if (this.h4 != 0) {
                f14 = 36.0f;
                int intrinsicWidth3 = (this.h4 == 1 ? org.telegram.ui.ActionBar.g6.g1 : org.telegram.ui.ActionBar.g6.h1).getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
                this.u2 -= intrinsicWidth3;
                if (LocaleController.isRTL) {
                    this.t2 += intrinsicWidth3;
                }
                if (this.c4) {
                    this.u2 -= AndroidUtilities.dp(21.0f);
                }
                dp7 = this.u2 - AndroidUtilities.dp(12.0f);
                if (dp7 < 0) {
                    dp7 = 0;
                }
                if (charSequence23 instanceof String) {
                    f15 = 21.0f;
                } else {
                    f15 = 21.0f;
                    try {
                        charSequence23 = ((String) charSequence23).replace('\n', ' ');
                    } catch (Exception e11) {
                        e = e11;
                        f16 = 6.0f;
                        f17 = 8.0f;
                        FileLog.e(e);
                        this.l3 = org.telegram.ui.Components.t5.update(0, (View) this, this.l3, this.v2);
                        if (this.n2) {
                        }
                        f18 = 39.0f;
                        f19 = 32.0f;
                        f20 = 30.0f;
                        f21 = 24.0f;
                        dp = AndroidUtilities.dp(11.0f);
                        this.m3 = AndroidUtilities.dp(32.0f);
                        this.I2 = AndroidUtilities.dp(13.0f);
                        this.q3 = AndroidUtilities.dp(42.33f);
                        this.y3 = AndroidUtilities.dp(43.0f);
                        this.E3 = AndroidUtilities.dp(42.33f);
                        this.S2 = AndroidUtilities.dp(13.0f);
                        int measuredWidth42 = getMeasuredWidth() - AndroidUtilities.dp(this.E + 21);
                        if (LocaleController.isRTL) {
                        }
                        i20 = dp3;
                        this.q0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
                        i21 = 0;
                        while (true) {
                            imageReceiverArr = this.R1;
                            if (i21 >= imageReceiverArr.length) {
                            }
                            imageReceiverArr[i21].setImageCoords(((this.D4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.M ? AndroidUtilities.dp(20.0f) : 0)) - ((this.n2 || SharedConfig.useThreeLinesLayout || (wrVar = this.p0) == null || wrVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                            i21++;
                            dp = dp;
                        }
                        i22 = dp;
                        i23 = measuredWidth42;
                        if (LocaleController.isRTL) {
                        }
                        if (this.M) {
                        }
                        if (!this.n2) {
                        }
                        this.I2 -= AndroidUtilities.dp(f16);
                        this.S2 -= AndroidUtilities.dp(f16);
                        if (getIsPinned()) {
                        }
                        if (!this.p3) {
                        }
                        if (z20) {
                        }
                        max = Math.max(AndroidUtilities.dp(12.0f), i23);
                        this.c3 = AndroidUtilities.dp((!this.n2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                        if (!this.n2) {
                        }
                        this.c3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
                        if (Q()) {
                        }
                        if (this.M) {
                        }
                        this.j3 = org.telegram.ui.Components.t5.update(0, (View) this, this.j3, this.o3);
                        if (TextUtils.isEmpty(charSequence25)) {
                        }
                        this.k3 = org.telegram.ui.Components.t5.update(0, (View) this, this.k3, this.d3);
                        if (!TextUtils.isEmpty(charSequence24)) {
                        }
                        if (replaceEmoji instanceof Spannable) {
                        }
                        if (this.n2) {
                        }
                        this.T = org.telegram.ui.ActionBar.g6.F0[this.A0];
                        charSequence27 = charSequence422;
                        charSequence422 = null;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                        if (this.n2) {
                        }
                        if (this.N1 > 0) {
                        }
                        int i422 = max;
                        TextPaint textPaint62 = this.T;
                        float dp92 = AndroidUtilities.dp(1.0f);
                        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                        this.a3 = tv0.b(charSequence27, textPaint62, i422, dp92, i422, charSequence422 != null ? 1 : 2);
                        max = i422;
                        this.e3.addAll(this.f3);
                        this.f3.clear();
                        eh.k.b(this, this.a3, -2, -2, this.e3, this.f3);
                        int i432 = max;
                        this.i3 = org.telegram.ui.Components.t5.update(0, (View) this, this.i3, this.a3);
                        if (LocaleController.isRTL) {
                        }
                        staticLayout = this.b3;
                        if (staticLayout != null) {
                        }
                        e0();
                    }
                }
                if (this.z2) {
                    f16 = 6.0f;
                    f17 = 8.0f;
                } else {
                    f16 = 6.0f;
                    try {
                        f17 = 8.0f;
                        try {
                            this.w2 = charSequence23.length() == TextUtils.ellipsize(charSequence23, org.telegram.ui.ActionBar.g6.B0[this.A0], (float) dp7, TextUtils.TruncateAt.END).length();
                            dp7 += AndroidUtilities.dp(48.0f);
                        } catch (Exception e12) {
                            e = e12;
                            FileLog.e(e);
                            this.l3 = org.telegram.ui.Components.t5.update(0, (View) this, this.l3, this.v2);
                            if (this.n2) {
                            }
                            f18 = 39.0f;
                            f19 = 32.0f;
                            f20 = 30.0f;
                            f21 = 24.0f;
                            dp = AndroidUtilities.dp(11.0f);
                            this.m3 = AndroidUtilities.dp(32.0f);
                            this.I2 = AndroidUtilities.dp(13.0f);
                            this.q3 = AndroidUtilities.dp(42.33f);
                            this.y3 = AndroidUtilities.dp(43.0f);
                            this.E3 = AndroidUtilities.dp(42.33f);
                            this.S2 = AndroidUtilities.dp(13.0f);
                            int measuredWidth422 = getMeasuredWidth() - AndroidUtilities.dp(this.E + 21);
                            if (LocaleController.isRTL) {
                            }
                            i20 = dp3;
                            this.q0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
                            i21 = 0;
                            while (true) {
                                imageReceiverArr = this.R1;
                                if (i21 >= imageReceiverArr.length) {
                                }
                                imageReceiverArr[i21].setImageCoords(((this.D4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.M ? AndroidUtilities.dp(20.0f) : 0)) - ((this.n2 || SharedConfig.useThreeLinesLayout || (wrVar = this.p0) == null || wrVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                                i21++;
                                dp = dp;
                            }
                            i22 = dp;
                            i23 = measuredWidth422;
                            if (LocaleController.isRTL) {
                            }
                            if (this.M) {
                            }
                            if (!this.n2) {
                            }
                            this.I2 -= AndroidUtilities.dp(f16);
                            this.S2 -= AndroidUtilities.dp(f16);
                            if (getIsPinned()) {
                            }
                            if (!this.p3) {
                            }
                            if (z20) {
                            }
                            max = Math.max(AndroidUtilities.dp(12.0f), i23);
                            this.c3 = AndroidUtilities.dp((!this.n2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                            if (!this.n2) {
                            }
                            this.c3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
                            if (Q()) {
                            }
                            if (this.M) {
                            }
                            this.j3 = org.telegram.ui.Components.t5.update(0, (View) this, this.j3, this.o3);
                            if (TextUtils.isEmpty(charSequence25)) {
                            }
                            this.k3 = org.telegram.ui.Components.t5.update(0, (View) this, this.k3, this.d3);
                            if (!TextUtils.isEmpty(charSequence24)) {
                            }
                            if (replaceEmoji instanceof Spannable) {
                            }
                            if (this.n2) {
                            }
                            this.T = org.telegram.ui.ActionBar.g6.F0[this.A0];
                            charSequence27 = charSequence422;
                            charSequence422 = null;
                            Layout.Alignment alignment22 = Layout.Alignment.ALIGN_NORMAL;
                            if (this.n2) {
                            }
                            if (this.N1 > 0) {
                            }
                            int i4222 = max;
                            TextPaint textPaint622 = this.T;
                            float dp922 = AndroidUtilities.dp(1.0f);
                            TextUtils.TruncateAt truncateAt22 = TextUtils.TruncateAt.END;
                            this.a3 = tv0.b(charSequence27, textPaint622, i4222, dp922, i4222, charSequence422 != null ? 1 : 2);
                            max = i4222;
                            this.e3.addAll(this.f3);
                            this.f3.clear();
                            eh.k.b(this, this.a3, -2, -2, this.e3, this.f3);
                            int i4322 = max;
                            this.i3 = org.telegram.ui.Components.t5.update(0, (View) this, this.i3, this.a3);
                            if (LocaleController.isRTL) {
                            }
                            staticLayout = this.b3;
                            if (staticLayout != null) {
                            }
                            e0();
                        }
                    } catch (Exception e13) {
                        e = e13;
                        f17 = 8.0f;
                        FileLog.e(e);
                        this.l3 = org.telegram.ui.Components.t5.update(0, (View) this, this.l3, this.v2);
                        if (this.n2) {
                        }
                        f18 = 39.0f;
                        f19 = 32.0f;
                        f20 = 30.0f;
                        f21 = 24.0f;
                        dp = AndroidUtilities.dp(11.0f);
                        this.m3 = AndroidUtilities.dp(32.0f);
                        this.I2 = AndroidUtilities.dp(13.0f);
                        this.q3 = AndroidUtilities.dp(42.33f);
                        this.y3 = AndroidUtilities.dp(43.0f);
                        this.E3 = AndroidUtilities.dp(42.33f);
                        this.S2 = AndroidUtilities.dp(13.0f);
                        int measuredWidth4222 = getMeasuredWidth() - AndroidUtilities.dp(this.E + 21);
                        if (LocaleController.isRTL) {
                        }
                        i20 = dp3;
                        this.q0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
                        i21 = 0;
                        while (true) {
                            imageReceiverArr = this.R1;
                            if (i21 >= imageReceiverArr.length) {
                            }
                            imageReceiverArr[i21].setImageCoords(((this.D4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.M ? AndroidUtilities.dp(20.0f) : 0)) - ((this.n2 || SharedConfig.useThreeLinesLayout || (wrVar = this.p0) == null || wrVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                            i21++;
                            dp = dp;
                        }
                        i22 = dp;
                        i23 = measuredWidth4222;
                        if (LocaleController.isRTL) {
                        }
                        if (this.M) {
                        }
                        if (!this.n2) {
                        }
                        this.I2 -= AndroidUtilities.dp(f16);
                        this.S2 -= AndroidUtilities.dp(f16);
                        if (getIsPinned()) {
                        }
                        if (!this.p3) {
                        }
                        if (z20) {
                        }
                        max = Math.max(AndroidUtilities.dp(12.0f), i23);
                        this.c3 = AndroidUtilities.dp((!this.n2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                        if (!this.n2) {
                        }
                        this.c3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
                        if (Q()) {
                        }
                        if (this.M) {
                        }
                        this.j3 = org.telegram.ui.Components.t5.update(0, (View) this, this.j3, this.o3);
                        if (TextUtils.isEmpty(charSequence25)) {
                        }
                        this.k3 = org.telegram.ui.Components.t5.update(0, (View) this, this.k3, this.d3);
                        if (!TextUtils.isEmpty(charSequence24)) {
                        }
                        if (replaceEmoji instanceof Spannable) {
                        }
                        if (this.n2) {
                        }
                        this.T = org.telegram.ui.ActionBar.g6.F0[this.A0];
                        charSequence27 = charSequence422;
                        charSequence422 = null;
                        Layout.Alignment alignment222 = Layout.Alignment.ALIGN_NORMAL;
                        if (this.n2) {
                        }
                        if (this.N1 > 0) {
                        }
                        int i42222 = max;
                        TextPaint textPaint6222 = this.T;
                        float dp9222 = AndroidUtilities.dp(1.0f);
                        TextUtils.TruncateAt truncateAt222 = TextUtils.TruncateAt.END;
                        this.a3 = tv0.b(charSequence27, textPaint6222, i42222, dp9222, i42222, charSequence422 != null ? 1 : 2);
                        max = i42222;
                        this.e3.addAll(this.f3);
                        this.f3.clear();
                        eh.k.b(this, this.a3, -2, -2, this.e3, this.f3);
                        int i43222 = max;
                        this.i3 = org.telegram.ui.Components.t5.update(0, (View) this, this.i3, this.a3);
                        if (LocaleController.isRTL) {
                        }
                        staticLayout = this.b3;
                        if (staticLayout != null) {
                        }
                        e0();
                    }
                }
                float f222 = dp7;
                this.N = org.telegram.ui.ActionBar.g6.B0[this.A0].measureText(charSequence23.toString()) <= f222;
                if (!this.M) {
                    charSequence23 = TextUtils.ellipsize(charSequence23, org.telegram.ui.ActionBar.g6.B0[this.A0], f222, TextUtils.TruncateAt.END);
                }
                CharSequence replaceEmoji32 = Emoji.replaceEmoji(charSequence23, org.telegram.ui.ActionBar.g6.B0[this.A0].getFontMetricsInt(), false);
                MessageObject messageObject212 = this.b1;
                CharSequence charSequence44 = (messageObject212 == null && messageObject212.hasHighlightedWords() && (highlightText3 = AndroidUtilities.highlightText(replaceEmoji32, this.b1.highlightedWords, this.B4)) != null) ? highlightText3 : replaceEmoji32;
                if (this.M) {
                    this.v2 = new StaticLayout(charSequence44, org.telegram.ui.ActionBar.g6.B0[this.A0], Math.max(dp7, this.u2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else {
                    TextPaint textPaint7 = org.telegram.ui.ActionBar.g6.B0[this.A0];
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    TextUtils.TruncateAt truncateAt3 = TextUtils.TruncateAt.END;
                    this.v2 = tv0.b(charSequence44, textPaint7, dp7, 0.0f, dp7, 2);
                }
                this.x2 = (this.z2 || !this.v2.isRtlCharAt(0)) ? 0.0f : -AndroidUtilities.dp(f14);
                this.y2 = this.v2.isRtlCharAt(0);
                this.l3 = org.telegram.ui.Components.t5.update(0, (View) this, this.l3, this.v2);
                if (!this.n2 || SharedConfig.useThreeLinesLayout) {
                    f18 = 39.0f;
                    f19 = 32.0f;
                    f20 = 30.0f;
                    f21 = 24.0f;
                    dp = AndroidUtilities.dp(11.0f);
                    this.m3 = AndroidUtilities.dp(32.0f);
                    this.I2 = AndroidUtilities.dp(13.0f);
                    this.q3 = AndroidUtilities.dp(42.33f);
                    this.y3 = AndroidUtilities.dp(43.0f);
                    this.E3 = AndroidUtilities.dp(42.33f);
                    this.S2 = AndroidUtilities.dp(13.0f);
                    int measuredWidth42222 = getMeasuredWidth() - AndroidUtilities.dp(this.E + 21);
                    if (LocaleController.isRTL) {
                        int dp15 = AndroidUtilities.dp(f11);
                        this.n3 = dp15;
                        this.X2 = dp15;
                        this.Z2 = dp15;
                        this.Y2 = dp15;
                        dp2 = getMeasuredWidth() - AndroidUtilities.dp(this.D + 56);
                        dp3 = dp2 - AndroidUtilities.dp(31.0f);
                    } else {
                        int dp16 = AndroidUtilities.dp(this.E + 6);
                        this.n3 = dp16;
                        this.X2 = dp16;
                        this.Z2 = dp16;
                        this.Y2 = dp16;
                        dp2 = AndroidUtilities.dp(this.D);
                        dp3 = AndroidUtilities.dp(69.0f) + dp2;
                    }
                    i20 = dp3;
                    this.q0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
                    i21 = 0;
                    while (true) {
                        imageReceiverArr = this.R1;
                        if (i21 >= imageReceiverArr.length) {
                            break;
                        }
                        imageReceiverArr[i21].setImageCoords(((this.D4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.M ? AndroidUtilities.dp(20.0f) : 0)) - ((this.n2 || SharedConfig.useThreeLinesLayout || (wrVar = this.p0) == null || wrVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                        i21++;
                        dp = dp;
                    }
                    i22 = dp;
                    i23 = measuredWidth42222;
                } else {
                    int dp17 = AndroidUtilities.dp(9.0f);
                    this.m3 = AndroidUtilities.dp(31.0f);
                    this.I2 = AndroidUtilities.dp(f11);
                    this.q3 = AndroidUtilities.dp(38.0f);
                    this.y3 = AndroidUtilities.dp(39.0f);
                    this.E3 = AndroidUtilities.dp(this.L ? 35.0f : 38.0f);
                    this.S2 = AndroidUtilities.dp(f10);
                    i23 = getMeasuredWidth() - AndroidUtilities.dp((this.E + 20) - (LocaleController.isRTL ? 0 : 12));
                    if (LocaleController.isRTL) {
                        int dp18 = AndroidUtilities.dp(22.0f);
                        this.n3 = dp18;
                        this.X2 = dp18;
                        this.Z2 = dp18;
                        this.Y2 = dp18;
                        f19 = 32.0f;
                        dp5 = getMeasuredWidth() - AndroidUtilities.dp(this.D + 52);
                        f20 = 30.0f;
                        dp6 = dp5 - AndroidUtilities.dp(((this.D4 + 2) * this.N1) + 9);
                    } else {
                        f19 = 32.0f;
                        f20 = 30.0f;
                        int dp19 = AndroidUtilities.dp(this.E + 4);
                        this.n3 = dp19;
                        this.X2 = dp19;
                        this.Z2 = dp19;
                        this.Y2 = dp19;
                        dp5 = AndroidUtilities.dp(this.D);
                        dp6 = AndroidUtilities.dp(67.0f) + dp5;
                    }
                    f18 = 39.0f;
                    f21 = 24.0f;
                    this.q0.F.set(dp5, dp17, AndroidUtilities.dp(52.0f) + dp5, AndroidUtilities.dp(52.0f) + dp17);
                    int i46 = 0;
                    while (true) {
                        ImageReceiver[] imageReceiverArr3 = this.R1;
                        if (i46 >= imageReceiverArr3.length) {
                            break;
                        }
                        imageReceiverArr3[i46].setImageCoords(((this.D4 + 2) * i46) + dp6, ((AndroidUtilities.dp(f20) + dp17) + (this.M ? AndroidUtilities.dp(20.0f) : 0)) - ((this.n2 || SharedConfig.useThreeLinesLayout || (wrVar3 = this.p0) == null || wrVar3.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(this.D4), AndroidUtilities.dp(this.D4));
                        i46++;
                        dp17 = dp17;
                    }
                    i22 = dp17;
                }
                if (LocaleController.isRTL) {
                    this.V2 = getMeasuredWidth() - AndroidUtilities.dp(this.E);
                    this.U2 = AndroidUtilities.dp(64.0f);
                } else {
                    this.U2 = this.X2;
                    this.V2 = getMeasuredWidth() - AndroidUtilities.dp(64.0f);
                }
                if (this.M) {
                    this.m3 = AndroidUtilities.dp(20.0f) + this.m3;
                }
                if (((!this.n2 && !SharedConfig.useThreeLinesLayout) || Q()) && (wrVar2 = this.p0) != null && !wrVar2.b()) {
                    this.I2 -= AndroidUtilities.dp(f16);
                    this.S2 -= AndroidUtilities.dp(f16);
                }
                if (getIsPinned()) {
                    if (LocaleController.isRTL) {
                        this.z3 = AndroidUtilities.dp(14.0f);
                    } else {
                        this.z3 = (getMeasuredWidth() - org.telegram.ui.ActionBar.g6.j1.getIntrinsicWidth()) - AndroidUtilities.dp(14.0f);
                    }
                }
                if (!this.p3) {
                    int dp20 = AndroidUtilities.dp(29.0f);
                    i23 -= dp20;
                    if (LocaleController.isRTL) {
                        this.r3 = AndroidUtilities.dp(15.666f);
                        this.X2 += dp20;
                        this.Z2 += dp20;
                        this.Y2 += dp20;
                        this.n3 += dp20;
                    } else {
                        this.r3 = getMeasuredWidth() - AndroidUtilities.dp(36.3333f);
                    }
                } else if (str7 != null || str10 != null || this.U3 || this.V3) {
                    if (str7 != null) {
                        this.G3 = Math.max(AndroidUtilities.dp(f17), (int) Math.ceil(org.telegram.ui.ActionBar.g6.M0.measureText(str7)));
                        this.P3 = new StaticLayout(str7, org.telegram.ui.ActionBar.g6.M0, this.G3, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        int dp21 = AndroidUtilities.dp(f10) + this.G3;
                        i23 -= dp21;
                        if (LocaleController.isRTL) {
                            this.F3 = AndroidUtilities.dp(15.666f);
                            this.X2 += dp21;
                            this.Z2 += dp21;
                            this.Y2 += dp21;
                            this.n3 += dp21;
                        } else {
                            this.F3 = rl.u(12.666f, this.G3, getMeasuredWidth() - AndroidUtilities.dp(15.666f));
                        }
                        this.C3 = true;
                    } else {
                        this.G3 = 0;
                    }
                    if (str10 != null) {
                        if (this.F0 != 0) {
                            this.Z3 = Math.max(AndroidUtilities.dp(f17), (int) Math.ceil(org.telegram.ui.ActionBar.g6.M0.measureText(str10)));
                            this.a4 = new StaticLayout(str10, org.telegram.ui.ActionBar.g6.M0, this.Z3, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            this.Z3 = AndroidUtilities.dp(f17);
                        }
                        int dp22 = AndroidUtilities.dp(f10) + this.Z3;
                        i23 -= dp22;
                        if (LocaleController.isRTL) {
                            int dp23 = AndroidUtilities.dp(15.666f);
                            int i47 = this.G3;
                            this.W3 = dp23 + (i47 != 0 ? i47 + AndroidUtilities.dp(f10) : 0);
                            this.X2 += dp22;
                            this.Z2 += dp22;
                            this.Y2 += dp22;
                            this.n3 += dp22;
                        } else {
                            int u10 = rl.u(12.666f, this.Z3, getMeasuredWidth()) - AndroidUtilities.dp(15.666f);
                            int i48 = this.G3;
                            this.W3 = u10 - (i48 != 0 ? i48 + AndroidUtilities.dp(f10) : 0);
                        }
                        this.T3 = true;
                    } else {
                        this.Z3 = 0;
                    }
                    if (this.U3) {
                        int dp24 = AndroidUtilities.dp(25.0f);
                        i23 -= dp24;
                        if (LocaleController.isRTL) {
                            int dp25 = AndroidUtilities.dp(15.666f);
                            this.X3 = dp25;
                            if (this.T3) {
                                int i49 = this.Z3;
                                this.X3 = dp25 + (i49 != 0 ? i49 + AndroidUtilities.dp(f10) : 0);
                            }
                            if (this.C3) {
                                int i50 = this.X3;
                                int i51 = this.G3;
                                this.X3 = i50 + (i51 != 0 ? i51 + AndroidUtilities.dp(f10) : 0);
                            }
                            this.X2 += dp24;
                            this.Z2 += dp24;
                            this.Y2 += dp24;
                            this.n3 += dp24;
                        } else {
                            int measuredWidth5 = getMeasuredWidth() - AndroidUtilities.dp(36.332f);
                            this.X3 = measuredWidth5;
                            if (this.T3) {
                                int i52 = this.Z3;
                                this.X3 = measuredWidth5 - (i52 != 0 ? i52 + AndroidUtilities.dp(f10) : 0);
                            }
                            if (this.C3) {
                                int i53 = this.X3;
                                int i54 = this.G3;
                                this.X3 = i53 - (i54 != 0 ? i54 + AndroidUtilities.dp(f10) : 0);
                            }
                        }
                    }
                    if (this.V3) {
                        int dp26 = AndroidUtilities.dp(25.0f);
                        i23 -= dp26;
                        if (LocaleController.isRTL) {
                            int dp27 = AndroidUtilities.dp(15.666f);
                            this.Y3 = dp27;
                            if (this.U3) {
                                this.Y3 = AndroidUtilities.dp(25.0f) + dp27;
                            }
                            if (this.T3) {
                                int i55 = this.Y3;
                                int i56 = this.Z3;
                                this.Y3 = i55 + (i56 != 0 ? i56 + AndroidUtilities.dp(f10) : 0);
                            }
                            if (this.C3) {
                                int i57 = this.Y3;
                                int i58 = this.G3;
                                this.Y3 = i57 + (i58 != 0 ? i58 + AndroidUtilities.dp(f10) : 0);
                            }
                            this.X2 += dp26;
                            this.Z2 += dp26;
                            this.Y2 += dp26;
                            this.n3 += dp26;
                        } else {
                            int measuredWidth6 = getMeasuredWidth() - AndroidUtilities.dp(36.332f);
                            this.Y3 = measuredWidth6;
                            if (this.U3) {
                                this.Y3 = measuredWidth6 - AndroidUtilities.dp(25.0f);
                            }
                            if (this.T3) {
                                int i59 = this.Y3;
                                int i60 = this.Z3;
                                this.Y3 = i59 - (i60 != 0 ? i60 + AndroidUtilities.dp(f10) : 0);
                            }
                            if (this.C3) {
                                int i61 = this.Y3;
                                int i62 = this.G3;
                                this.Y3 = i61 - (i62 != 0 ? i62 + AndroidUtilities.dp(f10) : 0);
                            }
                        }
                    }
                } else if (!this.F1 || P() || Q() || O() || !UserObject.isBot(this.b2) || !this.b2.bot_has_main_app) {
                    this.C3 = false;
                    this.T3 = false;
                } else {
                    setOpenBotButton(true);
                    int h = (int) (this.E1.h() + AndroidUtilities.dp(26.0f));
                    int dp28 = AndroidUtilities.dp(13.0f);
                    i23 -= h;
                    int dp29 = (this.n2 || SharedConfig.useThreeLinesLayout) ? AndroidUtilities.dp(40.0f) : this.L ? AndroidUtilities.dp(33.0f) : AndroidUtilities.dp(f14);
                    if (LocaleController.isRTL) {
                        this.D1.set(AndroidUtilities.dp(13.0f), dp29, AndroidUtilities.dp(13.0f) + h, AndroidUtilities.dp(28.0f) + dp29);
                        int i63 = h + dp28;
                        this.X2 += i63;
                        this.Z2 += i63;
                        this.Y2 += i63;
                        this.n3 += i63;
                    } else {
                        this.D1.set((getMeasuredWidth() - h) - AndroidUtilities.dp(13.0f), dp29, getMeasuredWidth() - AndroidUtilities.dp(13.0f), AndroidUtilities.dp(28.0f) + dp29);
                    }
                    this.C3 = false;
                    this.T3 = false;
                }
                if (z20) {
                    if (replaceEmoji == null) {
                        replaceEmoji = "";
                    }
                    if (replaceEmoji.length() > 150) {
                        replaceEmoji = replaceEmoji.subSequence(0, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    }
                    replaceEmoji = Emoji.replaceEmoji(((this.n2 || SharedConfig.useThreeLinesLayout) && !M() && charSequence422 == null) ? AndroidUtilities.replaceTwoNewLinesToOne(replaceEmoji) : AndroidUtilities.replaceNewLines(replaceEmoji), org.telegram.ui.ActionBar.g6.F0[this.A0].getFontMetricsInt(), false);
                    MessageObject messageObject23 = this.b1;
                    if (messageObject23 != null && (highlightText2 = AndroidUtilities.highlightText(replaceEmoji, messageObject23.highlightedWords, this.B4)) != null) {
                        replaceEmoji = highlightText2;
                    }
                }
                max = Math.max(AndroidUtilities.dp(12.0f), i23);
                this.c3 = AndroidUtilities.dp((!this.n2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                if (((!this.n2 && !SharedConfig.useThreeLinesLayout) || Q()) && M()) {
                    this.c3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
                }
                if (Q()) {
                    this.W2 = AndroidUtilities.dp((this.n2 || SharedConfig.useThreeLinesLayout) ? 34.0f : 39.0f);
                    int i64 = 0;
                    while (true) {
                        ImageReceiver[] imageReceiverArr4 = this.R1;
                        if (i64 >= imageReceiverArr4.length) {
                            break;
                        }
                        imageReceiverArr4[i64].setImageY(this.c3);
                        i64++;
                    }
                } else if ((this.n2 || SharedConfig.useThreeLinesLayout) && !M() && charSequence422 != null && (this.F0 == 0 || this.I0 == 1)) {
                    try {
                        messageObject7 = this.b1;
                    } catch (Exception e14) {
                        e = e14;
                    }
                    if (messageObject7 != null && messageObject7.hasHighlightedWords()) {
                        CharSequence highlightText5 = AndroidUtilities.highlightText(charSequence422, this.b1.highlightedWords, this.B4);
                        if (highlightText5 != null) {
                            charSequence26 = highlightText5;
                            TextPaint textPaint8 = org.telegram.ui.ActionBar.g6.G0;
                            Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                            TextUtils.TruncateAt truncateAt4 = TextUtils.TruncateAt.END;
                            this.o3 = tv0.b(charSequence26, textPaint8, max, 0.0f, max, 1);
                            this.W2 = AndroidUtilities.dp(51.0f);
                            dp4 = (this.N || !this.L) ? 0 : AndroidUtilities.dp(20.0f);
                            i24 = 0;
                            while (true) {
                                imageReceiverArr2 = this.R1;
                                if (i24 >= imageReceiverArr2.length) {
                                    break;
                                }
                                imageReceiverArr2[i24].setImageY(AndroidUtilities.dp(40.0f) + i22 + dp4);
                                i24++;
                            }
                            charSequence422 = charSequence26;
                        }
                    }
                    charSequence26 = charSequence422;
                    TextPaint textPaint82 = org.telegram.ui.ActionBar.g6.G0;
                    Layout.Alignment alignment42 = Layout.Alignment.ALIGN_NORMAL;
                    TextUtils.TruncateAt truncateAt42 = TextUtils.TruncateAt.END;
                    this.o3 = tv0.b(charSequence26, textPaint82, max, 0.0f, max, 1);
                    this.W2 = AndroidUtilities.dp(51.0f);
                    if (this.N) {
                    }
                    i24 = 0;
                    while (true) {
                        imageReceiverArr2 = this.R1;
                        if (i24 >= imageReceiverArr2.length) {
                        }
                        imageReceiverArr2[i24].setImageY(AndroidUtilities.dp(40.0f) + i22 + dp4);
                        i24++;
                    }
                    charSequence422 = charSequence26;
                } else {
                    this.o3 = null;
                    if (this.n2 || SharedConfig.useThreeLinesLayout) {
                        this.W2 = AndroidUtilities.dp(f19);
                        int dp30 = (this.N && this.L) ? AndroidUtilities.dp(20.0f) : 0;
                        int i65 = 0;
                        while (true) {
                            ImageReceiver[] imageReceiverArr5 = this.R1;
                            if (i65 >= imageReceiverArr5.length) {
                                break;
                            }
                            imageReceiverArr5[i65].setImageY(AndroidUtilities.dp(f15) + i22 + dp30);
                            i65++;
                        }
                    } else {
                        this.W2 = AndroidUtilities.dp(f18);
                    }
                }
                if (this.M) {
                    this.W2 = AndroidUtilities.dp(20.0f) + this.W2;
                }
                this.j3 = org.telegram.ui.Components.t5.update(0, (View) this, this.j3, this.o3);
                if (TextUtils.isEmpty(charSequence25)) {
                    this.d3 = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(charSequence25, this.T.getFontMetricsInt(), false), this.T, max - AndroidUtilities.dp(26.0f), TextUtils.TruncateAt.END), this.T, max - AndroidUtilities.dp(20.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.g3.addAll(this.h3);
                    this.h3.clear();
                    eh.k.c(this, this.d3, this.g3, this.h3);
                } else {
                    this.d3 = null;
                }
                this.k3 = org.telegram.ui.Components.t5.update(0, (View) this, this.k3, this.d3);
                if (!TextUtils.isEmpty(charSequence24)) {
                    try {
                        if (!this.n2) {
                            if (!SharedConfig.useThreeLinesLayout) {
                            }
                            i26 = max;
                            this.b3 = new StaticLayout(TextUtils.ellipsize(charSequence24, this.T, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.g6.H0[this.A0], i26, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        }
                        this.b3 = new StaticLayout(TextUtils.ellipsize(charSequence24, this.T, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.g6.H0[this.A0], i26, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    } catch (Exception e15) {
                        e = e15;
                        max = i26;
                        FileLog.e(e);
                        if (replaceEmoji instanceof Spannable) {
                        }
                        if (this.n2) {
                        }
                        this.T = org.telegram.ui.ActionBar.g6.F0[this.A0];
                        charSequence27 = charSequence422;
                        charSequence422 = null;
                        Layout.Alignment alignment2222 = Layout.Alignment.ALIGN_NORMAL;
                        if (this.n2) {
                        }
                        if (this.N1 > 0) {
                        }
                        int i422222 = max;
                        TextPaint textPaint62222 = this.T;
                        float dp92222 = AndroidUtilities.dp(1.0f);
                        TextUtils.TruncateAt truncateAt2222 = TextUtils.TruncateAt.END;
                        this.a3 = tv0.b(charSequence27, textPaint62222, i422222, dp92222, i422222, charSequence422 != null ? 1 : 2);
                        max = i422222;
                        this.e3.addAll(this.f3);
                        this.f3.clear();
                        eh.k.b(this, this.a3, -2, -2, this.e3, this.f3);
                        int i432222 = max;
                        this.i3 = org.telegram.ui.Components.t5.update(0, (View) this, this.i3, this.a3);
                        if (LocaleController.isRTL) {
                        }
                        staticLayout = this.b3;
                        if (staticLayout != null) {
                        }
                        e0();
                    }
                    if (!M()) {
                        TextPaint textPaint9 = org.telegram.ui.ActionBar.g6.H0[this.A0];
                        Layout.Alignment alignment5 = Layout.Alignment.ALIGN_NORMAL;
                        float dp31 = AndroidUtilities.dp(1.0f);
                        TextUtils.TruncateAt truncateAt5 = TextUtils.TruncateAt.END;
                        this.b3 = tv0.b(charSequence24, textPaint9, max, dp31, max, 1);
                    }
                    i26 = max;
                }
                if (replaceEmoji instanceof Spannable) {
                    Spannable spannable = (Spannable) replaceEmoji;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof ClickableSpan) && !(obj instanceof CodeHighlighting.Span)) {
                            if (this.G0 == 0) {
                                if (!P()) {
                                    if (!(obj instanceof k41)) {
                                    }
                                }
                            }
                            if (!(obj instanceof CodeHighlighting.ColorSpan)) {
                                if (!(obj instanceof hi0)) {
                                    if (!(obj instanceof gi0)) {
                                        if ((obj instanceof StyleSpan) && ((StyleSpan) obj).getStyle() == 1) {
                                        }
                                    }
                                }
                            }
                        }
                        spannable.removeSpan(obj);
                    }
                }
                if ((!this.n2 || SharedConfig.useThreeLinesLayout) && !M() && this.F0 != 0 && this.I0 > 1) {
                    this.T = org.telegram.ui.ActionBar.g6.F0[this.A0];
                    charSequence27 = charSequence422;
                    charSequence422 = null;
                } else {
                    if (!this.n2) {
                    }
                    if (!M()) {
                        if (charSequence422 == null) {
                            if (ChatObject.isMonoForum(this.c2) && ChatObject.canManageMonoForum(this.B0, this.c2)) {
                            }
                            charSequence27 = replaceEmoji;
                        }
                    }
                    replaceEmoji = (Q() || !(replaceEmoji instanceof Spanned) || ((n2[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), n2.class)).length > 0) ? TextUtils.ellipsize(replaceEmoji, this.T, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END) : TextUtils.ellipsize(replaceEmoji, this.T, max - AndroidUtilities.dp(((this.D4 + 2) * this.N1) + 15), TextUtils.TruncateAt.END);
                    charSequence27 = replaceEmoji;
                }
                Layout.Alignment alignment22222 = Layout.Alignment.ALIGN_NORMAL;
                if ((!this.n2 || SharedConfig.useThreeLinesLayout) && !M()) {
                    if (this.N1 > 0 && charSequence422 != null) {
                        max += AndroidUtilities.dp(f13);
                    }
                    int i4222222 = max;
                    TextPaint textPaint622222 = this.T;
                    float dp922222 = AndroidUtilities.dp(1.0f);
                    TextUtils.TruncateAt truncateAt22222 = TextUtils.TruncateAt.END;
                    this.a3 = tv0.b(charSequence27, textPaint622222, i4222222, dp922222, i4222222, charSequence422 != null ? 1 : 2);
                    max = i4222222;
                } else {
                    if (this.N1 > 0) {
                        max += AndroidUtilities.dp(((this.D4 + 2) * r0) + 3);
                        if (LocaleController.isRTL && !Q()) {
                            this.X2 -= AndroidUtilities.dp(((this.D4 + 2) * this.N1) + 3);
                        }
                    }
                    int i66 = max;
                    try {
                        this.a3 = new StaticLayout(charSequence27, this.T, i66, alignment22222, 1.0f, 0.0f, false);
                        max = i66;
                    } catch (Exception e16) {
                        e = e16;
                        max = i66;
                        this.a3 = null;
                        FileLog.e(e);
                        int i4322222 = max;
                        this.i3 = org.telegram.ui.Components.t5.update(0, (View) this, this.i3, this.a3);
                        if (LocaleController.isRTL) {
                        }
                        staticLayout = this.b3;
                        if (staticLayout != null) {
                        }
                        e0();
                    }
                }
                this.e3.addAll(this.f3);
                this.f3.clear();
                eh.k.b(this, this.a3, -2, -2, this.e3, this.f3);
                int i43222222 = max;
                this.i3 = org.telegram.ui.Components.t5.update(0, (View) this, this.i3, this.a3);
                if (LocaleController.isRTL) {
                    StaticLayout staticLayout2 = this.v2;
                    if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                        float lineLeft = this.v2.getLineLeft(0);
                        double ceil2 = Math.ceil(this.v2.getLineWidth(0));
                        int dp32 = AndroidUtilities.dp(12.0f) + this.t2;
                        this.t2 = dp32;
                        if (this.c4) {
                            this.t2 = AndroidUtilities.dp(f15) + dp32;
                        }
                        if (this.z2) {
                            ceil2 = Math.min(this.u2, ceil2);
                        }
                        if ((this.V0 || this.X0 || this.Y0 > f12) && !this.b4 && this.h4 == 0) {
                            if (this.d4) {
                                int dp33 = (int) ((((this.u2 - ceil2) - lineLeft) + this.t2) - AndroidUtilities.dp(f21));
                                this.D2 = dp33;
                                this.E2 = (dp33 - AndroidUtilities.dp(f16)) - org.telegram.ui.ActionBar.g6.c1.getIntrinsicWidth();
                            } else {
                                this.D2 = (int) ((((this.u2 - ceil2) + this.t2) - AndroidUtilities.dp(f16)) - org.telegram.ui.ActionBar.g6.c1.getIntrinsicWidth());
                            }
                        } else if (this.b4) {
                            this.D2 = (int) ((((this.u2 - ceil2) + this.t2) - AndroidUtilities.dp(f16)) - org.telegram.ui.ActionBar.g6.f1.getIntrinsicWidth());
                        } else if (this.d4) {
                            int dp34 = (int) ((((this.u2 - ceil2) - lineLeft) + this.t2) - AndroidUtilities.dp(f21));
                            this.D2 = dp34;
                            this.E2 = (dp34 - AndroidUtilities.dp(f16)) - org.telegram.ui.ActionBar.g6.c1.getIntrinsicWidth();
                        } else if (this.h4 != 0) {
                            this.D2 = (int) ((((this.u2 - ceil2) + this.t2) - AndroidUtilities.dp(f16)) - (this.h4 == 1 ? org.telegram.ui.ActionBar.g6.g1 : org.telegram.ui.ActionBar.g6.h1).getIntrinsicWidth());
                        } else {
                            this.D2 = (int) ((((this.u2 - ceil2) + this.t2) - AndroidUtilities.dp(f16)) - org.telegram.ui.ActionBar.g6.c1.getIntrinsicWidth());
                        }
                        if (lineLeft == f12) {
                            double d10 = this.u2;
                            if (ceil2 < d10) {
                                this.t2 = (int) ((d10 - ceil2) + this.t2);
                            }
                        }
                    }
                    StaticLayout staticLayout3 = this.a3;
                    int i67 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (staticLayout3 != null && (lineCount6 = staticLayout3.getLineCount()) > 0) {
                        int i68 = 0;
                        int i69 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        while (true) {
                            if (i68 >= lineCount6) {
                                break;
                            }
                            if (this.a3.getLineLeft(i68) != f12) {
                                i69 = 0;
                                break;
                            } else {
                                i69 = Math.min(i69, (int) (i43222222 - Math.ceil(this.a3.getLineWidth(i68))));
                                i68++;
                            }
                        }
                        if (i69 != Integer.MAX_VALUE) {
                            this.X2 += i69;
                        }
                    }
                    StaticLayout staticLayout4 = this.b3;
                    if (staticLayout4 != null && (lineCount5 = staticLayout4.getLineCount()) > 0) {
                        int i70 = 0;
                        int i71 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        while (true) {
                            if (i70 >= lineCount5) {
                                break;
                            }
                            if (this.b3.getLineLeft(i70) != f12) {
                                i71 = 0;
                                break;
                            } else {
                                i71 = Math.min(i71, (int) (i43222222 - Math.ceil(this.b3.getLineWidth(i70))));
                                i70++;
                            }
                        }
                        if (i71 != Integer.MAX_VALUE) {
                            this.Z2 += i71;
                        }
                    }
                    StaticLayout staticLayout5 = this.o3;
                    if (staticLayout5 != null && staticLayout5.getLineCount() > 0 && this.o3.getLineLeft(0) == f12) {
                        double ceil3 = Math.ceil(this.o3.getLineWidth(0));
                        double d11 = i43222222;
                        if (ceil3 < d11) {
                            this.n3 = (int) ((d11 - ceil3) + this.n3);
                        }
                    }
                    StaticLayout staticLayout6 = this.d3;
                    if (staticLayout6 != null && (lineCount4 = staticLayout6.getLineCount()) > 0) {
                        for (int i72 = 0; i72 < lineCount4; i72++) {
                            i67 = (int) Math.min(i67, this.d3.getWidth() - this.d3.getLineRight(i72));
                        }
                        this.Y2 += i67;
                    }
                } else {
                    StaticLayout staticLayout7 = this.v2;
                    if (staticLayout7 != null && staticLayout7.getLineCount() > 0) {
                        float lineRight = this.v2.getLineRight(0);
                        if (this.z2) {
                            lineRight = Math.min(this.u2, lineRight);
                        }
                        if (lineRight == this.u2) {
                            double ceil4 = Math.ceil(this.v2.getLineWidth(0));
                            if (this.z2) {
                                ceil4 = Math.min(this.u2, ceil4);
                            }
                            double d12 = this.u2;
                            if (ceil4 < d12) {
                                this.t2 = (int) (this.t2 - (d12 - ceil4));
                            }
                        }
                        if (this.c4) {
                            this.t2 = AndroidUtilities.dp(f15) + this.t2;
                        }
                        int dp35 = (int) (this.t2 + lineRight + AndroidUtilities.dp(f16));
                        this.D2 = dp35;
                        if (this.d4) {
                            this.E2 = AndroidUtilities.dp(f20) + dp35;
                        }
                    }
                    StaticLayout staticLayout8 = this.a3;
                    float f23 = 2.14748365E9f;
                    if (staticLayout8 != null && (lineCount3 = staticLayout8.getLineCount()) > 0) {
                        float f24 = 2.14748365E9f;
                        for (int i73 = 0; i73 < lineCount3; i73++) {
                            f24 = Math.min(f24, this.a3.getLineLeft(i73));
                        }
                        this.X2 = (int) (this.X2 - f24);
                    }
                    StaticLayout staticLayout9 = this.d3;
                    if (staticLayout9 != null && (lineCount2 = staticLayout9.getLineCount()) > 0) {
                        float f25 = 2.14748365E9f;
                        for (int i74 = 0; i74 < lineCount2; i74++) {
                            f25 = Math.min(f25, this.d3.getLineLeft(i74));
                        }
                        this.Y2 = (int) (this.Y2 - f25);
                    }
                    StaticLayout staticLayout10 = this.b3;
                    if (staticLayout10 != null && (lineCount = staticLayout10.getLineCount()) > 0) {
                        for (int i75 = 0; i75 < lineCount; i75++) {
                            f23 = Math.min(f23, this.b3.getLineLeft(i75));
                        }
                        this.Z2 = (int) (this.Z2 - f23);
                    }
                    StaticLayout staticLayout11 = this.o3;
                    if (staticLayout11 != null && staticLayout11.getLineCount() > 0) {
                        this.n3 = (int) (this.n3 - this.o3.getLineLeft(0));
                    }
                }
                staticLayout = this.b3;
                if (staticLayout != null && this.f2 >= 0 && staticLayout.getText().length() > 0) {
                    if (i13 >= 0 || (i25 = i13 + 1) >= this.b3.getText().length()) {
                        primaryHorizontal = this.b3.getPrimaryHorizontal(0);
                        primaryHorizontal2 = this.b3.getPrimaryHorizontal(1);
                    } else {
                        primaryHorizontal = this.b3.getPrimaryHorizontal(i13);
                        primaryHorizontal2 = this.b3.getPrimaryHorizontal(i25);
                    }
                    if (primaryHorizontal >= primaryHorizontal2) {
                        this.u4 = (int) (this.Z2 + primaryHorizontal);
                    } else {
                        this.u4 = (int) (this.Z2 + primaryHorizontal2 + AndroidUtilities.dp(3.0f));
                    }
                }
                e0();
            }
            f14 = 36.0f;
            if (this.c4) {
            }
            dp7 = this.u2 - AndroidUtilities.dp(12.0f);
            if (dp7 < 0) {
            }
            if (charSequence23 instanceof String) {
            }
            if (this.z2) {
            }
            float f2222 = dp7;
            this.N = org.telegram.ui.ActionBar.g6.B0[this.A0].measureText(charSequence23.toString()) <= f2222;
            if (!this.M) {
            }
            CharSequence replaceEmoji322 = Emoji.replaceEmoji(charSequence23, org.telegram.ui.ActionBar.g6.B0[this.A0].getFontMetricsInt(), false);
            MessageObject messageObject2122 = this.b1;
            if (messageObject2122 == null) {
            }
            if (this.M) {
            }
            this.x2 = (this.z2 || !this.v2.isRtlCharAt(0)) ? 0.0f : -AndroidUtilities.dp(f14);
            this.y2 = this.v2.isRtlCharAt(0);
            this.l3 = org.telegram.ui.Components.t5.update(0, (View) this, this.l3, this.v2);
            if (this.n2) {
            }
            f18 = 39.0f;
            f19 = 32.0f;
            f20 = 30.0f;
            f21 = 24.0f;
            dp = AndroidUtilities.dp(11.0f);
            this.m3 = AndroidUtilities.dp(32.0f);
            this.I2 = AndroidUtilities.dp(13.0f);
            this.q3 = AndroidUtilities.dp(42.33f);
            this.y3 = AndroidUtilities.dp(43.0f);
            this.E3 = AndroidUtilities.dp(42.33f);
            this.S2 = AndroidUtilities.dp(13.0f);
            int measuredWidth422222 = getMeasuredWidth() - AndroidUtilities.dp(this.E + 21);
            if (LocaleController.isRTL) {
            }
            i20 = dp3;
            this.q0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
            i21 = 0;
            while (true) {
                imageReceiverArr = this.R1;
                if (i21 >= imageReceiverArr.length) {
                }
                imageReceiverArr[i21].setImageCoords(((this.D4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.M ? AndroidUtilities.dp(20.0f) : 0)) - ((this.n2 || SharedConfig.useThreeLinesLayout || (wrVar = this.p0) == null || wrVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                i21++;
                dp = dp;
            }
            i22 = dp;
            i23 = measuredWidth422222;
            if (LocaleController.isRTL) {
            }
            if (this.M) {
            }
            if (!this.n2) {
                this.I2 -= AndroidUtilities.dp(f16);
                this.S2 -= AndroidUtilities.dp(f16);
                if (getIsPinned()) {
                }
                if (!this.p3) {
                }
                if (z20) {
                }
                max = Math.max(AndroidUtilities.dp(12.0f), i23);
                this.c3 = AndroidUtilities.dp((!this.n2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                if (!this.n2) {
                    this.c3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
                    if (Q()) {
                    }
                    if (this.M) {
                    }
                    this.j3 = org.telegram.ui.Components.t5.update(0, (View) this, this.j3, this.o3);
                    if (TextUtils.isEmpty(charSequence25)) {
                    }
                    this.k3 = org.telegram.ui.Components.t5.update(0, (View) this, this.k3, this.d3);
                    if (!TextUtils.isEmpty(charSequence24)) {
                    }
                    if (replaceEmoji instanceof Spannable) {
                    }
                    if (this.n2) {
                    }
                    this.T = org.telegram.ui.ActionBar.g6.F0[this.A0];
                    charSequence27 = charSequence422;
                    charSequence422 = null;
                    Layout.Alignment alignment222222 = Layout.Alignment.ALIGN_NORMAL;
                    if (this.n2) {
                    }
                    if (this.N1 > 0) {
                        max += AndroidUtilities.dp(f13);
                    }
                    int i42222222 = max;
                    TextPaint textPaint6222222 = this.T;
                    float dp9222222 = AndroidUtilities.dp(1.0f);
                    TextUtils.TruncateAt truncateAt222222 = TextUtils.TruncateAt.END;
                    this.a3 = tv0.b(charSequence27, textPaint6222222, i42222222, dp9222222, i42222222, charSequence422 != null ? 1 : 2);
                    max = i42222222;
                    this.e3.addAll(this.f3);
                    this.f3.clear();
                    eh.k.b(this, this.a3, -2, -2, this.e3, this.f3);
                    int i432222222 = max;
                    this.i3 = org.telegram.ui.Components.t5.update(0, (View) this, this.i3, this.a3);
                    if (LocaleController.isRTL) {
                    }
                    staticLayout = this.b3;
                    if (staticLayout != null) {
                        if (i13 >= 0) {
                        }
                        primaryHorizontal = this.b3.getPrimaryHorizontal(0);
                        primaryHorizontal2 = this.b3.getPrimaryHorizontal(1);
                        if (primaryHorizontal >= primaryHorizontal2) {
                        }
                    }
                    e0();
                }
                this.c3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
                if (Q()) {
                }
                if (this.M) {
                }
                this.j3 = org.telegram.ui.Components.t5.update(0, (View) this, this.j3, this.o3);
                if (TextUtils.isEmpty(charSequence25)) {
                }
                this.k3 = org.telegram.ui.Components.t5.update(0, (View) this, this.k3, this.d3);
                if (!TextUtils.isEmpty(charSequence24)) {
                }
                if (replaceEmoji instanceof Spannable) {
                }
                if (this.n2) {
                }
                this.T = org.telegram.ui.ActionBar.g6.F0[this.A0];
                charSequence27 = charSequence422;
                charSequence422 = null;
                Layout.Alignment alignment2222222 = Layout.Alignment.ALIGN_NORMAL;
                if (this.n2) {
                }
                if (this.N1 > 0) {
                }
                int i422222222 = max;
                TextPaint textPaint62222222 = this.T;
                float dp92222222 = AndroidUtilities.dp(1.0f);
                TextUtils.TruncateAt truncateAt2222222 = TextUtils.TruncateAt.END;
                this.a3 = tv0.b(charSequence27, textPaint62222222, i422222222, dp92222222, i422222222, charSequence422 != null ? 1 : 2);
                max = i422222222;
                this.e3.addAll(this.f3);
                this.f3.clear();
                eh.k.b(this, this.a3, -2, -2, this.e3, this.f3);
                int i4322222222 = max;
                this.i3 = org.telegram.ui.Components.t5.update(0, (View) this, this.i3, this.a3);
                if (LocaleController.isRTL) {
                }
                staticLayout = this.b3;
                if (staticLayout != null) {
                }
                e0();
            }
            this.I2 -= AndroidUtilities.dp(f16);
            this.S2 -= AndroidUtilities.dp(f16);
            if (getIsPinned()) {
            }
            if (!this.p3) {
            }
            if (z20) {
            }
            max = Math.max(AndroidUtilities.dp(12.0f), i23);
            this.c3 = AndroidUtilities.dp((!this.n2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
            if (!this.n2) {
            }
            this.c3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
            if (Q()) {
            }
            if (this.M) {
            }
            this.j3 = org.telegram.ui.Components.t5.update(0, (View) this, this.j3, this.o3);
            if (TextUtils.isEmpty(charSequence25)) {
            }
            this.k3 = org.telegram.ui.Components.t5.update(0, (View) this, this.k3, this.d3);
            if (!TextUtils.isEmpty(charSequence24)) {
            }
            if (replaceEmoji instanceof Spannable) {
            }
            if (this.n2) {
            }
            this.T = org.telegram.ui.ActionBar.g6.F0[this.A0];
            charSequence27 = charSequence422;
            charSequence422 = null;
            Layout.Alignment alignment22222222 = Layout.Alignment.ALIGN_NORMAL;
            if (this.n2) {
            }
            if (this.N1 > 0) {
            }
            int i4222222222 = max;
            TextPaint textPaint622222222 = this.T;
            float dp922222222 = AndroidUtilities.dp(1.0f);
            TextUtils.TruncateAt truncateAt22222222 = TextUtils.TruncateAt.END;
            this.a3 = tv0.b(charSequence27, textPaint622222222, i4222222222, dp922222222, i4222222222, charSequence422 != null ? 1 : 2);
            max = i4222222222;
            this.e3.addAll(this.f3);
            this.f3.clear();
            eh.k.b(this, this.a3, -2, -2, this.e3, this.f3);
            int i43222222222 = max;
            this.i3 = org.telegram.ui.Components.t5.update(0, (View) this, this.i3, this.a3);
            if (LocaleController.isRTL) {
            }
            staticLayout = this.b3;
            if (staticLayout != null) {
            }
            e0();
        }
        f13 = 5.0f;
        if (this.V0) {
        }
        if (!this.d4) {
        }
        if (z23) {
        }
        f14 = 36.0f;
        if (this.c4) {
        }
        dp7 = this.u2 - AndroidUtilities.dp(12.0f);
        if (dp7 < 0) {
        }
        if (charSequence23 instanceof String) {
        }
        if (this.z2) {
        }
        float f22222 = dp7;
        this.N = org.telegram.ui.ActionBar.g6.B0[this.A0].measureText(charSequence23.toString()) <= f22222;
        if (!this.M) {
        }
        CharSequence replaceEmoji3222 = Emoji.replaceEmoji(charSequence23, org.telegram.ui.ActionBar.g6.B0[this.A0].getFontMetricsInt(), false);
        MessageObject messageObject21222 = this.b1;
        if (messageObject21222 == null) {
        }
        if (this.M) {
        }
        this.x2 = (this.z2 || !this.v2.isRtlCharAt(0)) ? 0.0f : -AndroidUtilities.dp(f14);
        this.y2 = this.v2.isRtlCharAt(0);
        this.l3 = org.telegram.ui.Components.t5.update(0, (View) this, this.l3, this.v2);
        if (this.n2) {
        }
        f18 = 39.0f;
        f19 = 32.0f;
        f20 = 30.0f;
        f21 = 24.0f;
        dp = AndroidUtilities.dp(11.0f);
        this.m3 = AndroidUtilities.dp(32.0f);
        this.I2 = AndroidUtilities.dp(13.0f);
        this.q3 = AndroidUtilities.dp(42.33f);
        this.y3 = AndroidUtilities.dp(43.0f);
        this.E3 = AndroidUtilities.dp(42.33f);
        this.S2 = AndroidUtilities.dp(13.0f);
        int measuredWidth4222222 = getMeasuredWidth() - AndroidUtilities.dp(this.E + 21);
        if (LocaleController.isRTL) {
        }
        i20 = dp3;
        this.q0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
        i21 = 0;
        while (true) {
            imageReceiverArr = this.R1;
            if (i21 >= imageReceiverArr.length) {
            }
            imageReceiverArr[i21].setImageCoords(((this.D4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.M ? AndroidUtilities.dp(20.0f) : 0)) - ((this.n2 || SharedConfig.useThreeLinesLayout || (wrVar = this.p0) == null || wrVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
            i21++;
            dp = dp;
        }
        i22 = dp;
        i23 = measuredWidth4222222;
        if (LocaleController.isRTL) {
        }
        if (this.M) {
        }
        if (!this.n2) {
        }
        this.I2 -= AndroidUtilities.dp(f16);
        this.S2 -= AndroidUtilities.dp(f16);
        if (getIsPinned()) {
        }
        if (!this.p3) {
        }
        if (z20) {
        }
        max = Math.max(AndroidUtilities.dp(12.0f), i23);
        this.c3 = AndroidUtilities.dp((!this.n2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
        if (!this.n2) {
        }
        this.c3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
        if (Q()) {
        }
        if (this.M) {
        }
        this.j3 = org.telegram.ui.Components.t5.update(0, (View) this, this.j3, this.o3);
        if (TextUtils.isEmpty(charSequence25)) {
        }
        this.k3 = org.telegram.ui.Components.t5.update(0, (View) this, this.k3, this.d3);
        if (!TextUtils.isEmpty(charSequence24)) {
        }
        if (replaceEmoji instanceof Spannable) {
        }
        if (this.n2) {
        }
        this.T = org.telegram.ui.ActionBar.g6.F0[this.A0];
        charSequence27 = charSequence422;
        charSequence422 = null;
        Layout.Alignment alignment222222222 = Layout.Alignment.ALIGN_NORMAL;
        if (this.n2) {
        }
        if (this.N1 > 0) {
        }
        int i42222222222 = max;
        TextPaint textPaint6222222222 = this.T;
        float dp9222222222 = AndroidUtilities.dp(1.0f);
        TextUtils.TruncateAt truncateAt222222222 = TextUtils.TruncateAt.END;
        this.a3 = tv0.b(charSequence27, textPaint6222222222, i42222222222, dp9222222222, i42222222222, charSequence422 != null ? 1 : 2);
        max = i42222222222;
        this.e3.addAll(this.f3);
        this.f3.clear();
        eh.k.b(this, this.a3, -2, -2, this.e3, this.f3);
        int i432222222222 = max;
        this.i3 = org.telegram.ui.Components.t5.update(0, (View) this, this.i3, this.a3);
        if (LocaleController.isRTL) {
        }
        staticLayout = this.b3;
        if (staticLayout != null) {
        }
        e0();
    }

    public final void v() {
        TLRPC.Message message;
        MessageObject messageObject = this.b1;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.T0) {
            ChatThemeController.getInstance(this.B0).setDialogTheme(this.D0, ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme, false);
        }
    }

    public final void w() {
        TLRPC.Chat chat = this.c2;
        boolean z10 = chat != null && chat.call_active && chat.call_not_empty;
        this.r2 = z10;
        this.m1 = z10 ? 1.0f : 0.0f;
    }

    public final void x() {
        TLRPC.User user;
        if (this.b2 != null && (user = MessagesController.getInstance(this.B0).getUser(Long.valueOf(this.b2.id))) != null) {
            this.b2 = user;
        }
        this.l1 = R() ? 1.0f : 0.0f;
    }

    public final void y() {
        lh.j3 j3Var;
        boolean z10 = this.h0 > 0 && !this.r2 && !R() && ((j3Var = this.m2) == null || !j3Var.a.q) && !this.q0.w;
        this.s2 = z10;
        this.i0 = z10 ? 1.0f : 0.0f;
    }

    public final int z() {
        if (!Q() || this.f0 || this.f) {
            return getCollapsedHeight();
        }
        int dp = AndroidUtilities.dp((this.n2 || SharedConfig.useThreeLinesLayout) ? 86.0f : 91.0f);
        if (this.o2) {
            dp++;
        }
        return M() ? AndroidUtilities.dp(this.I) + dp : dp;
    }

    public p2(gy gyVar, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.h = true;
        this.x = true;
        int i11 = 0;
        this.y = false;
        this.D = 11;
        this.E = 72;
        this.F = 70;
        this.G = 76;
        this.H = 3;
        this.I = 11;
        this.Q = 42.0f;
        i2 i2Var = new i2(this);
        this.q0 = i2Var;
        this.v0 = true;
        this.y0 = 0.0f;
        this.Z0 = false;
        this.a1 = false;
        this.B1 = new nc(this);
        this.C1 = new Paint(1);
        this.D1 = new RectF();
        this.H1 = false;
        this.Q1 = new boolean[3];
        this.R1 = new ImageReceiver[3];
        this.S1 = new boolean[3];
        this.T1 = new boolean[3];
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.U1 = imageReceiver;
        this.W1 = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        this.Z1 = new f2.b0(5);
        er erVar = er.h;
        this.i2 = new org.telegram.ui.Components.y5(this, 0L, 350L, erVar);
        this.k2 = new org.telegram.ui.Components.y5(this, 0L, 350L, erVar);
        this.e3 = new Stack();
        this.f3 = new ArrayList();
        this.g3 = new Stack();
        this.h3 = new ArrayList();
        this.D3 = true;
        this.K3 = new ud.a(this, erVar, 320L);
        this.N3 = 1.0f;
        this.O3 = 1.0f;
        this.j4 = new RectF();
        this.p4 = -1;
        this.z4 = -1;
        this.A4 = new m2(this);
        i2Var.I = true;
        this.B4 = c6Var;
        this.v4 = gyVar;
        org.telegram.ui.ActionBar.g6.R(context);
        this.y = false;
        this.A = false;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
        while (true) {
            ImageReceiver[] imageReceiverArr = this.R1;
            if (i11 >= imageReceiverArr.length) {
                this.n2 = z10;
                this.B0 = i10;
                ag.s0 s0Var = new ag.s0(this, context, 10);
                this.e4 = s0Var;
                addView(s0Var);
                this.f4 = new org.telegram.ui.Components.i5(AndroidUtilities.dp(22.0f), s0Var);
                this.g4 = new org.telegram.ui.Components.i5(AndroidUtilities.dp(17.0f), this);
                this.U1.setAllowLoadingOnAttachedOnly(true);
                return;
            }
            imageReceiverArr[i11] = new ImageReceiver(this);
            ImageReceiver imageReceiver2 = this.R1[i11];
            imageReceiver2.ignoreNotifications = true;
            imageReceiver2.setRoundRadius(AndroidUtilities.dp(2.0f));
            this.R1[i11].setAllowLoadingOnAttachedOnly(true);
            i11++;
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (jh.i9.t1) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
    }
}
