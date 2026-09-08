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
import bi.pb;
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
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.o41;
import org.telegram.ui.ox;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class r2 extends a0 implements bi.a9, org.telegram.ui.ActionBar.z5 {
    public boolean A0;
    public boolean A1;
    public boolean A2;
    public boolean A3;
    public StaticLayout A4;
    public boolean B0;
    public float B1;
    public float B2;
    public boolean B3;
    public int B4;
    public float C0;
    public float C1;
    public boolean C2;
    public int C3;
    public int C4;
    public gi.a D0;
    public float D1;
    public boolean D2;
    public int D3;
    public int D4;
    public boolean E;
    public int E0;
    public boolean E1;
    public Paint E2;
    public int E3;
    public final o2 E4;
    public boolean F;
    public final int F0;
    public final zc F1;
    public Paint F2;
    public float F3;
    public final org.telegram.ui.ActionBar.f6 F4;
    public e7 G;
    public m2 G0;
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
    public f01 I1;
    public int I2;
    public int I3;
    public int I4;
    public int J;
    public int J0;
    public boolean J1;
    public int J2;
    public int J3;
    public q2 J4;
    public int K;
    public long K0;
    public bi.o1 K1;
    public int K2;
    public int K3;
    public GradientDrawable K4;
    public final int L;
    public String L0;
    public boolean L1;
    public int L2;
    public int L3;
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
    public boolean N3;
    public Paint N4;
    public boolean O;
    public boolean O0;
    public String O1;
    public int O2;
    public final le.b O3;
    public sg.c1 O4;
    public boolean P;
    public boolean P0;
    public int P1;
    public boolean P2;
    public ValueAnimator P3;
    public Drawable P4;
    public boolean Q;
    public boolean Q0;
    public xi0 Q1;
    public boolean Q2;
    public ValueAnimator Q3;
    public int Q4;
    public boolean R;
    public int R0;
    public int R1;
    public boolean R2;
    public float R3;
    public Drawable R4;
    public Paint S;
    public int S0;
    public boolean S1;
    public boolean S2;
    public float S3;
    public Drawable S4;
    public Paint T;
    public boolean T0;
    public Paint T1;
    public int T2;
    public StaticLayout T3;
    public ColorFilter[] T4;
    public float U;
    public int U0;
    public final boolean[] U1;
    public int U2;
    public StaticLayout U3;
    public int[] U4;
    public boolean V;
    public int V0;
    public final ImageReceiver[] V1;
    public int V2;
    public StaticLayout V3;
    public Runnable V4;
    public boolean W;
    public int W0;
    public final boolean[] W1;
    public int W2;
    public StaticLayout W3;
    public boolean X0;
    public final boolean[] X1;
    public int X2;
    public boolean X3;
    public int Y0;
    public final ImageReceiver Y1;
    public int Y2;
    public boolean Y3;
    public boolean Z0;
    public qe0 Z1;
    public int Z2;
    public boolean Z3;
    public TextPaint a0;
    public boolean a1;
    public final org.telegram.ui.Components.i9 a2;
    public int a3;
    public int a4;
    public Paint b0;
    public boolean b1;
    public boolean b2;
    public int b3;
    public int b4;
    public gd c0;
    public float c1;
    public float c2;
    public int c3;
    public int c4;
    public n2 d0;
    public boolean d1;
    public final l2 d2;
    public int d3;
    public int d4;
    public boolean e0;
    public boolean e1;
    public ii0 e2;
    public StaticLayout e3;
    public StaticLayout e4;
    public boolean f;
    public boolean f0;
    public MessageObject f1;
    public TLRPC.User f2;
    public StaticLayout f3;
    public boolean f4;
    public boolean g0;
    public ArrayList g1;
    public TLRPC.Chat g2;
    public int g3;
    public boolean g4;
    public final boolean h;
    public Drawable[] h0;
    public boolean h1;
    public TLRPC.EncryptedChat h2;
    public StaticLayout h3;
    public boolean h4;
    public float i0;
    public CharSequence i1;
    public CharSequence i2;
    public final Stack i3;
    public final di.eb i4;
    public boolean j0;
    public int j1;
    public int j2;
    public final ArrayList j3;
    public final org.telegram.ui.Components.o5 j4;
    public boolean k0;
    public int k1;
    public boolean k2;
    public final Stack k3;
    public final org.telegram.ui.Components.o5 k4;
    public int l0;
    public int l1;
    public TLRPC.DraftMessage l2;
    public final ArrayList l3;
    public int l4;
    public float m0;
    public boolean m1;
    public final org.telegram.ui.Components.e6 m2;
    public org.telegram.ui.Components.v5 m3;
    public boolean m4;
    public float n;
    public u11 n0;
    public boolean n1;
    public boolean n2;
    public org.telegram.ui.Components.v5 n3;
    public final RectF n4;
    public Paint o0;
    public float o1;
    public final org.telegram.ui.Components.e6 o2;
    public org.telegram.ui.Components.v5 o3;
    public hg.j o4;
    public Paint p0;
    public float p1;
    public long p2;
    public org.telegram.ui.Components.v5 p3;
    public Path p4;
    public boolean q0;
    public float q1;
    public di.q3 q2;
    public int q3;
    public RectF q4;
    public boolean r;
    public boolean r0;
    public float r1;
    public final boolean r2;
    public int r3;
    public int r4;
    public xi0 s;
    public boolean s0;
    public int s1;
    public boolean s2;
    public StaticLayout s3;
    public int s4;
    public gs t0;
    public float t1;
    public boolean t2;
    public boolean t3;
    public int t4;
    public final j2 u0;
    public int u1;
    public boolean u2;
    public int u3;
    public float u4;
    public int v;
    public Path v0;
    public int v1;
    public boolean v2;
    public int v3;
    public boolean v4;
    public boolean w;
    public wh.h w0;
    public float w1;
    public boolean w2;
    public boolean w3;
    public ValueAnimator w4;
    public boolean x;
    public boolean x0;
    public boolean x1;
    public int x2;
    public float x3;
    public long x4;
    public boolean y;
    public boolean y0;
    public xi0 y1;
    public int y2;
    public boolean y3;
    public int y4;
    public boolean z0;
    public boolean z1;
    public StaticLayout z2;
    public boolean z3;
    public final uy z4;

    public r2(Context context, boolean z10) {
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
        MessageObject messageObject2 = null;
        int i10 = 0;
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
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, this.F4);
        if (this.M4 != v02 || this.N4 == null) {
            this.M4 = v02;
            if (this.N4 == null) {
                this.N4 = new Paint(1);
            }
            this.N4.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{0, v02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
        return this.N4;
    }

    private TextPaint getTimeTextPaint() {
        return this.G3 ? N() ? org.telegram.ui.ActionBar.j6.J0 : org.telegram.ui.ActionBar.j6.K0 : org.telegram.ui.ActionBar.j6.I0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTopicId() {
        TLRPC.TL_forumTopic tL_forumTopic = this.N;
        if (tL_forumTopic == null) {
            return 0;
        }
        return tL_forumTopic.id;
    }

    public final void A(int i10, int i11) {
        this.u4 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.w4 = ofFloat;
        ofFloat.setDuration(220L);
        this.w4.setInterpolator(pr.f);
        this.s4 = i10;
        this.r4 = i11;
        this.w4.addUpdateListener(new g2(this, 2));
        this.w4.addListener(new k2(this, 2));
        this.v4 = true;
        this.w4.start();
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
    public final boolean B(Canvas canvas) {
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
        float dp12;
        di.q3 q3Var;
        TLRPC.Chat chat = this.g2;
        boolean z12 = false;
        if (chat == null || (chat.flags2 & 2048) == 0) {
            z10 = false;
        } else {
            float imageY2 = this.Y1.getImageY2();
            float imageX2 = this.Y1.getImageX2();
            di.q3 q3Var2 = this.q2;
            float progress = (q3Var2 == null || !q3Var2.a.q) ? 1.0f : 1.0f - q3Var2.getProgress();
            if (this.S4 == null) {
                this.S4 = getContext().getResources().getDrawable(R.drawable.star_small_outline).mutate();
            }
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false);
            if (this.Q4 != w02) {
                Drawable drawable = this.S4;
                this.Q4 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (this.R4 == null) {
                this.R4 = getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate();
            }
            int dp13 = AndroidUtilities.dp(19.33f);
            Rect rect = AndroidUtilities.rectTmp2;
            int i11 = (int) imageX2;
            int i12 = (int) imageY2;
            int i13 = i12 - dp13;
            rect.set((AndroidUtilities.dp(1.66f) + i11) - dp13, i13, AndroidUtilities.dp(1.66f) + i11, i12);
            rect.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            this.S4.setBounds(rect);
            int i14 = (int) (progress * 255.0f);
            this.S4.setAlpha(i14);
            this.S4.draw(canvas);
            rect.set((AndroidUtilities.dp(1.66f) + i11) - dp13, i13, AndroidUtilities.dp(1.66f) + i11, i12);
            this.R4.setBounds(rect);
            this.R4.setAlpha(i14);
            this.R4.draw(canvas);
            z10 = true;
        }
        float e7 = this.m2.e(this.n2 && !z10);
        float f16 = 10.0f;
        if (e7 > 0.0f) {
            float centerY = this.Y1.getCenterY() + AndroidUtilities.dp(18.0f);
            float centerX = this.Y1.getCenterX() + AndroidUtilities.dp(18.0f);
            canvas.save();
            org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, this.F4));
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(11.33f) * e7, org.telegram.ui.ActionBar.j6.t0);
            if (this.O4 == null) {
                this.O4 = new sg.c1(org.telegram.ui.ActionBar.j6.Lj, org.telegram.ui.ActionBar.j6.Mj, -1, -1, this.F4);
            }
            this.O4.d((int) (centerX - AndroidUtilities.dp(10.0f)), 0.0f, (int) (centerY - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + centerX), 0.0f, (int) (AndroidUtilities.dp(10.0f) + centerY));
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f) * e7, this.O4.f);
            if (this.P4 == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.P4 = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.P4.setBounds((int) (centerX - (((r4.getIntrinsicWidth() / 2.0f) * 0.875f) * e7)), (int) (centerY - (((this.P4.getIntrinsicHeight() / 2.0f) * 0.875f) * e7)), (int) (((this.P4.getIntrinsicWidth() / 2.0f) * 0.875f * e7) + centerX), (int) (((this.P4.getIntrinsicHeight() / 2.0f) * 0.875f * e7) + centerY));
            this.P4.setAlpha((int) (e7 * 255.0f));
            this.P4.draw(canvas);
            canvas.restore();
            return false;
        }
        if (!this.N0 || this.J0 != 0 || z10) {
            return false;
        }
        boolean z13 = (this.l0 <= 0 || R() || this.v2 || this.u0.w) ? false : true;
        this.w2 = z13;
        if (this.i0 != 1.0f && (z13 || this.m0 > 0.0f)) {
            u11 u11Var = this.n0;
            if (u11Var != null) {
                int i15 = u11Var.f;
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
                    } else if (this.Y1.getDrawable() instanceof q61) {
                        this.o0.setColor(((q61) this.Y1.getDrawable()).a.a());
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
                q3Var = this.q2;
                if (q3Var != null) {
                    f17 *= 1.0f - q3Var.getProgress();
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
            u11 u11Var2 = new u11(ApplicationLoader.applicationContext, null);
            u11Var2.m = true;
            u11Var2.b(i17);
            this.n0 = u11Var2;
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
            q3Var = this.q2;
            if (q3Var != null) {
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
                boolean z14 = chat2.call_active && chat2.call_not_empty;
                this.v2 = z14;
                if ((z14 || this.q1 != 0.0f) && this.i0 < 1.0f) {
                    di.q3 q3Var3 = this.q2;
                    float progress2 = (q3Var3 == null || !q3Var3.a.q) ? 1.0f : 1.0f - q3Var3.getProgress();
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
                    Paint paint2 = org.telegram.ui.ActionBar.j6.t0;
                    int i18 = org.telegram.ui.ActionBar.j6.d6;
                    paint2.setColor(org.telegram.ui.ActionBar.j6.v0(i18, this.F4));
                    float f23 = dp;
                    float f24 = dp15;
                    canvas.drawCircle(f23, f24, AndroidUtilities.dp(11.0f) * this.q1 * progress2, org.telegram.ui.ActionBar.j6.t0);
                    org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.T8, this.F4));
                    canvas.drawCircle(f23, f24, AndroidUtilities.dp(9.0f) * this.q1 * progress2, org.telegram.ui.ActionBar.j6.t0);
                    org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.v0(i18, this.F4));
                    if (!LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                        this.r1 = 0.65f;
                    }
                    int i19 = this.s1;
                    if (i19 != 0) {
                        i10 = LiteMode.FLAGS_CHAT;
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
                                this.n4.set(dp - AndroidUtilities.dp(1.0f), f24 - dp2, AndroidUtilities.dp(1.0f) + dp, dp2 + f24);
                                canvas.drawRoundRect(this.n4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.t0);
                                float f26 = f24 - f14;
                                float f27 = f24 + f14;
                                this.n4.set(dp - AndroidUtilities.dp(5.0f), f26, dp - AndroidUtilities.dp(3.0f), f27);
                                canvas.drawRoundRect(this.n4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.t0);
                                this.n4.set(AndroidUtilities.dp(3.0f) + dp, f26, AndroidUtilities.dp(5.0f) + dp, f27);
                                canvas.drawRoundRect(this.n4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.t0);
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
                                    z12 = true;
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
                                        z11 = true;
                                    }
                                    z11 = z12;
                                } else {
                                    float f34 = this.m0;
                                    if (f34 > 0.0f) {
                                        this.m0 = f34 - f7;
                                        z11 = true;
                                    }
                                    z11 = z12;
                                }
                                this.m0 = Utilities.clamp(this.m0, 1.0f, 0.0f);
                                return z11;
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
                            this.n4.set(dp - AndroidUtilities.dp(1.0f), f24 - dp2, AndroidUtilities.dp(1.0f) + dp, dp2 + f24);
                            canvas.drawRoundRect(this.n4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.t0);
                            float f262 = f24 - f14;
                            float f272 = f24 + f14;
                            this.n4.set(dp - AndroidUtilities.dp(5.0f), f262, dp - AndroidUtilities.dp(3.0f), f272);
                            canvas.drawRoundRect(this.n4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.t0);
                            this.n4.set(AndroidUtilities.dp(3.0f) + dp, f262, AndroidUtilities.dp(5.0f) + dp, f272);
                            canvas.drawRoundRect(this.n4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.t0);
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
                            return z11;
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
                        this.n4.set(dp - AndroidUtilities.dp(1.0f), f24 - dp2, AndroidUtilities.dp(1.0f) + dp, dp2 + f24);
                        canvas.drawRoundRect(this.n4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.t0);
                        float f2622 = f24 - f14;
                        float f2722 = f24 + f14;
                        this.n4.set(dp - AndroidUtilities.dp(5.0f), f2622, dp - AndroidUtilities.dp(3.0f), f2722);
                        canvas.drawRoundRect(this.n4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.t0);
                        this.n4.set(AndroidUtilities.dp(3.0f) + dp, f2622, AndroidUtilities.dp(5.0f) + dp, f2722);
                        canvas.drawRoundRect(this.n4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.t0);
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
                        return z11;
                    }
                    float dp16 = AndroidUtilities.dp(1.0f);
                    float dp17 = AndroidUtilities.dp(4.0f);
                    i10 = LiteMode.FLAGS_CHAT;
                    dp2 = (dp17 * this.r1) + dp16;
                    dp10 = AndroidUtilities.dp(3.0f);
                    dp11 = AndroidUtilities.dp(2.0f);
                    f13 = this.r1;
                    f14 = dp10 - (dp11 * f13);
                    if (this.q1 >= 1.0f) {
                    }
                    canvas.save();
                    float f25222 = this.q1 * progress2;
                    canvas.scale(f25222, f25222, f23, f24);
                    this.n4.set(dp - AndroidUtilities.dp(1.0f), f24 - dp2, AndroidUtilities.dp(1.0f) + dp, dp2 + f24);
                    canvas.drawRoundRect(this.n4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.t0);
                    float f26222 = f24 - f14;
                    float f27222 = f24 + f14;
                    this.n4.set(dp - AndroidUtilities.dp(5.0f), f26222, dp - AndroidUtilities.dp(3.0f), f27222);
                    canvas.drawRoundRect(this.n4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.t0);
                    this.n4.set(AndroidUtilities.dp(3.0f) + dp, f26222, AndroidUtilities.dp(5.0f) + dp, f27222);
                    canvas.drawRoundRect(this.n4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.t0);
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
                    return z11;
                }
            }
        } else {
            boolean R = R();
            this.B0 = R;
            if (R || this.p1 != 0.0f) {
                int dp18 = (int) (this.u0.F.bottom - AndroidUtilities.dp((this.r2 || SharedConfig.useThreeLinesLayout) ? 6.0f : 8.0f));
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
                org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, this.F4));
                float f37 = i21;
                float f38 = dp18;
                canvas.drawCircle(f37, f38, AndroidUtilities.dp(7.0f) * this.p1, org.telegram.ui.ActionBar.j6.t0);
                org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.T8, this.F4));
                canvas.drawCircle(f37, f38, AndroidUtilities.dp(5.0f) * this.p1, org.telegram.ui.ActionBar.j6.t0);
                if (R) {
                    float f39 = this.p1;
                    if (f39 < 1.0f) {
                        float f40 = f39 + 0.10666667f;
                        this.p1 = f40;
                        if (f40 > 1.0f) {
                            this.p1 = 1.0f;
                        }
                        z12 = true;
                    }
                } else {
                    float f41 = this.p1;
                    if (f41 > 0.0f) {
                        float f42 = f41 - 0.10666667f;
                        this.p1 = f42;
                        if (f42 < 0.0f) {
                            this.p1 = 0.0f;
                        }
                        z12 = true;
                    }
                }
            }
        }
        f7 = 0.10666667f;
        if (this.w2) {
        }
        this.m0 = Utilities.clamp(this.m0, 1.0f, 0.0f);
        return z11;
    }

    public final void C(Canvas canvas, boolean z10, boolean z11, boolean z12, boolean z13, float f7) {
        if (f7 != 0.0f || z13) {
            float f10 = (f7 * 0.5f) + 0.5f;
            if (z10) {
                a0.o(this.V2, this.W2, org.telegram.ui.ActionBar.j6.X0);
                if (f7 != 1.0f) {
                    canvas.save();
                    canvas.scale(f10, f10, org.telegram.ui.ActionBar.j6.X0.getBounds().centerX(), org.telegram.ui.ActionBar.j6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.j6.X0.setAlpha((int) (f7 * 255.0f));
                }
                org.telegram.ui.ActionBar.j6.X0.draw(canvas);
                if (f7 != 1.0f) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.j6.X0.setAlpha(255);
                }
                invalidate();
                return;
            }
            if (z12) {
                if (!z11) {
                    a0.o(this.U2, this.W2, org.telegram.ui.ActionBar.j6.T0);
                    if (f7 != 1.0f) {
                        canvas.save();
                        canvas.scale(f10, f10, org.telegram.ui.ActionBar.j6.T0.getBounds().centerX(), org.telegram.ui.ActionBar.j6.W0.getBounds().centerY());
                        org.telegram.ui.ActionBar.j6.T0.setAlpha((int) (f7 * 255.0f));
                    }
                    org.telegram.ui.ActionBar.j6.T0.draw(canvas);
                    if (f7 != 1.0f) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.j6.T0.setAlpha(255);
                        return;
                    }
                    return;
                }
                a0.o(this.X2, this.W2, org.telegram.ui.ActionBar.j6.W0);
                if (z13) {
                    canvas.save();
                    canvas.scale(f10, f10, org.telegram.ui.ActionBar.j6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.j6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.j6.W0.setAlpha((int) (f7 * 255.0f));
                }
                if (!z13 && f7 != 0.0f) {
                    canvas.save();
                    canvas.scale(f10, f10, org.telegram.ui.ActionBar.j6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.j6.W0.getBounds().centerY());
                    int i10 = (int) (255.0f * f7);
                    org.telegram.ui.ActionBar.j6.W0.setAlpha(i10);
                    org.telegram.ui.ActionBar.j6.V0.setAlpha(i10);
                }
                org.telegram.ui.ActionBar.j6.W0.draw(canvas);
                if (z13) {
                    canvas.restore();
                    canvas.save();
                    canvas.translate((1.0f - f7) * AndroidUtilities.dp(4.0f), 0.0f);
                }
                a0.o(this.T2, this.W2, org.telegram.ui.ActionBar.j6.V0);
                org.telegram.ui.ActionBar.j6.V0.draw(canvas);
                if (z13) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.j6.W0.setAlpha(255);
                }
                if (z13 || f7 == 0.0f) {
                    return;
                }
                canvas.restore();
                org.telegram.ui.ActionBar.j6.W0.setAlpha(255);
                org.telegram.ui.ActionBar.j6.V0.setAlpha(255);
            }
        }
    }

    public final void D(Canvas canvas, boolean z10, int i10, int i11, int i12, float f7, boolean z11) {
        float f10;
        Paint paint;
        boolean z12;
        RectF rectF;
        RectF rectF2;
        boolean z13 = Q() || P();
        if (!(this.G3 && this.H3) && this.R3 == 1.0f) {
            return;
        }
        float f11 = (this.S0 != 0 || this.T0) ? this.R3 : 1.0f - this.R3;
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
            this.T.setColor(i0.a.d(Color.alpha(r14) / 255.0f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false), i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.s9, false), 255)));
        } else {
            f10 = 1.0f;
        }
        if (this.P && this.N.read_inbox_max_id == 0) {
            if (this.S == null) {
                this.S = new Paint();
            }
            paint = this.S;
            int v02 = org.telegram.ui.ActionBar.j6.v0(z10 ? org.telegram.ui.ActionBar.j6.ek : org.telegram.ui.ActionBar.j6.dk, this.F4);
            paint.setColor(v02);
            org.telegram.ui.ActionBar.j6.M0.setColor(v02);
            i13 = z10 ? 30 : 40;
            z12 = true;
        } else {
            paint = (z10 || this.J0 != 0) ? org.telegram.ui.ActionBar.j6.y0 : org.telegram.ui.ActionBar.j6.w0;
            z12 = false;
        }
        StaticLayout staticLayout = this.U3;
        RectF rectF3 = this.n4;
        if (staticLayout == null || this.S0 == 0) {
            if (this.S0 != 0) {
                staticLayout = this.T3;
            }
            paint.setAlpha((int) ((f10 - this.x3) * i13));
            org.telegram.ui.ActionBar.j6.M0.setAlpha((int) ((f10 - this.x3) * 255.0f));
            float f12 = i10;
            rectF3.set(i11, f12, AndroidUtilities.dp(12.666f) + this.K3 + i11, AndroidUtilities.dp(20.666f) + i10);
            int save = canvas.save();
            if (f7 != f10) {
                canvas.scale(f7, f7, rectF3.centerX(), rectF3.centerY());
            }
            if (f11 != f10) {
                canvas.scale(f11, f11, rectF3.centerX(), rectF3.centerY());
            }
            if (z13) {
                if (this.p4 == null || (rectF = this.q4) == null || !rectF.equals(rectF3)) {
                    RectF rectF4 = this.q4;
                    if (rectF4 == null) {
                        this.q4 = new RectF(rectF3);
                    } else {
                        rectF4.set(rectF3);
                    }
                    if (this.p4 == null) {
                        this.p4 = new Path();
                    }
                    w7.j0.a(this.p4, this.q4, AndroidUtilities.dp(10.33f));
                }
                canvas.drawPath(this.p4, paint);
                if (z11) {
                    canvas.drawPath(this.p4, this.T);
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
            org.telegram.ui.ActionBar.j6.M0.setAlpha((int) ((f10 - this.x3) * 255.0f));
            float f13 = f11 * 2.0f;
            float f14 = f13 > f10 ? 1.0f : f13;
            float f15 = f10 - f14;
            float f16 = (i12 * f15) + (i11 * f14);
            float f17 = i10;
            rectF3.set(f16, f17, (this.L3 * f15) + (this.K3 * f14) + f16 + AndroidUtilities.dp(12.666f), AndroidUtilities.dp(20.666f) + i10);
            float interpolation = ((f11 <= 0.5f ? pr.g.getInterpolation(f13) : pr.i.getInterpolation(f10 - ((f11 - 0.5f) * 2.0f))) * 0.1f) + f10;
            canvas.save();
            float f18 = interpolation * f7;
            canvas.scale(f18, f18, rectF3.centerX(), rectF3.centerY());
            if (z13) {
                if (this.p4 == null || (rectF2 = this.q4) == null || !rectF2.equals(rectF3)) {
                    RectF rectF5 = this.q4;
                    if (rectF5 == null) {
                        this.q4 = new RectF(rectF3);
                    } else {
                        rectF5.set(rectF3);
                    }
                    if (this.p4 == null) {
                        this.p4 = new Path();
                    }
                    w7.j0.a(this.p4, this.q4, AndroidUtilities.dp(10.33f));
                }
                canvas.drawPath(this.p4, paint);
                if (z11) {
                    canvas.drawPath(this.p4, this.T);
                }
            } else {
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), paint);
                if (z11) {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), this.T);
                }
            }
            if (this.V3 != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f16, AndroidUtilities.dpf2(3.0f) + f17);
                this.V3.draw(canvas);
                canvas.restore();
            }
            int alpha = org.telegram.ui.ActionBar.j6.M0.getAlpha();
            float f19 = alpha;
            org.telegram.ui.ActionBar.j6.M0.setAlpha((int) (f19 * f14));
            if (this.W3 != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f16, AndroidUtilities.dpf2(3.0f) + ((this.N3 ? AndroidUtilities.dp(17.0f) : -AndroidUtilities.dp(17.0f)) * f15) + f17);
                this.W3.draw(canvas);
                canvas.restore();
            } else if (this.T3 != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f16, AndroidUtilities.dpf2(3.0f) + ((this.N3 ? AndroidUtilities.dp(17.0f) : -AndroidUtilities.dp(17.0f)) * f15) + f17);
                this.T3.draw(canvas);
                canvas.restore();
            }
            if (this.U3 != null) {
                org.telegram.ui.ActionBar.j6.M0.setAlpha((int) (f19 * f15));
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f16, AndroidUtilities.dpf2(3.0f) + ((this.N3 ? -AndroidUtilities.dp(17.0f) : AndroidUtilities.dp(17.0f)) * f14) + f17);
                this.U3.draw(canvas);
                canvas.restore();
            }
            org.telegram.ui.ActionBar.j6.M0.setAlpha(alpha);
            canvas.restore();
        }
        if (z12) {
            org.telegram.ui.ActionBar.j6.M0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.W8, false));
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
                    TLRPC.EncryptedChat m10 = org.telegram.messenger.w1.m(messagesController, dialog.id);
                    user = m10 != null ? messagesController.getUser(Long.valueOf(m10.user_id)) : null;
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
                    spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Y8, this.F4)), length, length2, 33);
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
        return Emoji.replaceEmoji(spannableStringBuilder, org.telegram.ui.ActionBar.j6.F0[this.E0].getFontMetricsInt(), false);
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
                    TLRPC.EncryptedChat m10 = org.telegram.messenger.w1.m(messagesController, dialog.id);
                    user = m10 != null ? messagesController.getUser(Long.valueOf(m10.user_id)) : null;
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
                    spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Y8, this.F4)), length, length2, 33);
                }
                if (spannableStringBuilder.length() > 150) {
                    break;
                }
            }
        }
        return Emoji.replaceEmoji(spannableStringBuilder, org.telegram.ui.ActionBar.j6.F0[this.E0].getFontMetricsInt(), false);
    }

    public final CharSequence J() {
        if (this.J4 == null) {
            this.J4 = new q2(this);
        }
        q2.a(this.J4, this.F0, this.f1, this.g2);
        this.J4.getClass();
        q2 q2Var = this.J4;
        this.I4 = q2Var.c;
        this.f0 = q2Var.d;
        return q2Var.g;
    }

    public final ColorFilter K(int i10, int i11) {
        if (this.T4 == null) {
            this.U4 = new int[4];
            this.T4 = new ColorFilter[4];
        }
        if (i11 != this.U4[i10] || this.T4[i10] == null) {
            ColorFilter[] colorFilterArr = this.T4;
            this.U4[i10] = i11;
            colorFilterArr[i10] = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
        }
        return this.T4[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.view.View, org.telegram.ui.Cells.r2] */
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
                if (this.f1.topicIconDrawable[0] instanceof og.a) {
                    int i11 = this.F0;
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i11).getTopicsController().findTopic(-this.f1.getDialogId(), MessageObject.getTopicId(i11, this.f1.messageOwner, true));
                    if (findTopic != null) {
                        ((og.a) this.f1.topicIconDrawable[0]).b(findTopic.icon_color);
                    }
                }
            } else {
                this.e0 = false;
                valueOf = SpannableStringBuilder.valueOf(charSequence5);
            }
            if (z10) {
                s(valueOf);
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
                append = s(append);
            }
            return I(append, charSequence, i10);
        }
        TL_iv.RichMessage richMessage = message2.rich_message;
        org.telegram.ui.ActionBar.f6 f6Var = this.F4;
        if (richMessage != null) {
            boolean isBlueBlock = richMessage.blocks.size() == 1 ? MessageObject.isBlueBlock(this.f1.messageOwner.rich_message.blocks.get(0)) : false;
            SpannableStringBuilder I = I(this.f1.messageText, charSequence, i10);
            if (isBlueBlock && !Q()) {
                try {
                    I.setSpan(new e10(org.telegram.ui.ActionBar.j6.p9, f6Var), this.W ? charSequence.length() + 2 : 0, I.length(), 33);
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
                spannableString2 = s(spannableString2);
            }
            return I(spannableString2, charSequence, i10);
        }
        this.a0 = org.telegram.ui.ActionBar.j6.H0[this.E0];
        int i12 = org.telegram.ui.ActionBar.j6.o9;
        MessageObject messageObject6 = this.f1;
        TLRPC.MessageMedia messageMedia = messageObject6.messageOwner.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
            TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
            if (tL_textWithEntities == null || tL_textWithEntities.entities == null) {
                charSequence2 = nh.a.a(R.drawable.dialog_media_poll_20, tL_textWithEntities.text, true);
            } else {
                SpannableString spannableString3 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString3);
                MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString3, org.telegram.ui.ActionBar.j6.F0[this.E0].getFontMetricsInt());
                charSequence2 = nh.a.a(R.drawable.dialog_media_poll_20, spannableString3, true);
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
            if (tL_textWithEntities3 == null || tL_textWithEntities3.entities == null) {
                charSequence2 = nh.a.a(R.drawable.dialog_media_checklist_20, tL_textWithEntities3.text, true);
            } else {
                SpannableString spannableString4 = new SpannableString(tL_messageMediaToDo.todo.title.text.replace('\n', ' '));
                TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                MediaDataController.addTextStyleRuns(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString4);
                MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString4, org.telegram.ui.ActionBar.j6.F0[this.E0].getFontMetricsInt());
                charSequence2 = nh.a.a(R.drawable.dialog_media_checklist_20, spannableString4, true);
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
            charSequence2 = nh.a.a(R.drawable.dialog_media_game_20, messageMedia.game.title, true);
        } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
            charSequence2 = messageMedia.title;
        } else if (messageObject6.type == 14) {
            charSequence2 = p6.j("🎧 \u2068", messageObject6.getMusicAuthor(), " - ", this.f1.getMusicTitle(), "\u2069");
        } else if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia).extended_media.size();
            charSequence2 = zh.v7.Q0(LocaleController.formatString(R.string.AttachPaidMedia, this.S1 ? size > 1 ? LocaleController.formatPluralString("Media", size, new Object[0]) : LocaleController.getString(R.string.AttachVideo) : size > 1 ? LocaleController.formatPluralString("Photos", size, new Object[0]) : LocaleController.getString(R.string.AttachPhoto)));
            i12 = org.telegram.ui.ActionBar.j6.p9;
        } else if (this.R1 > 1) {
            if (this.S1) {
                ArrayList arrayList3 = this.g1;
                formatPluralString = LocaleController.formatPluralString("Media", arrayList3 == null ? 0 : arrayList3.size(), new Object[0]);
            } else {
                ArrayList arrayList4 = this.g1;
                formatPluralString = LocaleController.formatPluralString("Photos", arrayList4 == null ? 0 : arrayList4.size(), new Object[0]);
            }
            charSequence2 = formatPluralString;
            i12 = org.telegram.ui.ActionBar.j6.p9;
        } else {
            charSequence2 = charSequence4.toString();
            i12 = org.telegram.ui.ActionBar.j6.p9;
        }
        if (charSequence2 instanceof String) {
            charSequence2 = ((String) charSequence2).replace('\n', ' ');
        }
        if (z10) {
            charSequence2 = s(charSequence2);
        }
        SpannableStringBuilder I2 = I(charSequence2, charSequence, i10);
        if (!Q()) {
            try {
                I2.setSpan(new e10(i12, f6Var), this.W ? charSequence.length() + 2 : 0, I2.length(), 33);
                return I2;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return I2;
    }

    public final boolean M() {
        gs gsVar = this.t0;
        return (gsVar == null || gsVar.c.isEmpty()) ? false : true;
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
        org.telegram.ui.Components.o5 o5Var = this.j4;
        if (o5Var != null && this.w3) {
            o5Var.a();
        }
        org.telegram.ui.Components.o5 o5Var2 = this.k4;
        if (o5Var2 == null || !this.w3) {
            return;
        }
        o5Var2.a();
    }

    public final void V(boolean z10, boolean z11) {
        di.q3 q3Var = this.q2;
        if (q3Var != null || z10) {
            if (q3Var == null) {
                di.q3 q3Var2 = new di.q3(this, getContext(), this.F4, 1);
                this.q2 = q3Var2;
                q3Var2.b(-1, org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.k7);
                this.q2.setDrawUnchecked(false);
                this.q2.setDrawBackgroundAsArc(3);
                addView(this.q2);
            }
            this.q2.a(z10, z11);
            x();
        }
    }

    public final void W(long j3, MessageObject messageObject, int i10, boolean z10, boolean z11) {
        if (this.H0 != j3) {
            this.t4 = -1;
        }
        this.H0 = j3;
        this.x4 = System.currentTimeMillis();
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
            ValueAnimator valueAnimator = this.w4;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.w4.cancel();
            }
            this.v4 = false;
            this.t4 = -1;
        }
        this.H0 = dialog.id;
        this.x4 = System.currentTimeMillis();
        this.N0 = true;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            this.K0 = dialog.community_id;
        } else {
            this.K0 = 0L;
        }
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            this.J0 = ((TLRPC.TL_dialogFolder) dialog).folder.id;
            ii0 ii0Var = this.e2;
            if (ii0Var != null) {
                ii0Var.H = this;
                ii0Var.i();
            }
        } else {
            this.J0 = 0;
        }
        this.j1 = i10;
        boolean z10 = i10 == 3;
        Runnable runnable = this.V4;
        if (z10 != (runnable != null)) {
            if (!z10 && runnable != null) {
                runnable.run();
                this.V4 = null;
            } else if (z10) {
                this.V4 = NotificationCenter.getInstance(this.F0).listen(this, NotificationCenter.userIsPremiumBlockedUpadted, new i2(this, 0));
            }
        }
        if (this.t0 == null) {
            this.t0 = new gs(this);
        }
        this.k1 = i11;
        this.l1 = 0;
        if (b0(0, false)) {
            requestLayout();
        }
        w();
        v();
        u();
        x();
    }

    public final void Y(TLRPC.TL_forumTopic tL_forumTopic, long j3, MessageObject messageObject, boolean z10, boolean z11) {
        ii0 ii0Var;
        this.N = tL_forumTopic;
        this.P = tL_forumTopic != null;
        if (this.H0 != j3) {
            this.t4 = -1;
        }
        Drawable drawable = messageObject.topicIconDrawable[0];
        if (drawable instanceof og.a) {
            ((og.a) drawable).b(tL_forumTopic.icon_color);
        }
        this.H0 = j3;
        this.x4 = System.currentTimeMillis();
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
            this.t4 = -1;
        }
        if (tL_forumTopic != null) {
            this.g1 = tL_forumTopic.groupedMessages;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.N;
        if (tL_forumTopic2 != null && tL_forumTopic2.id == 1 && (ii0Var = this.e2) != null) {
            ii0Var.H = this;
            ii0Var.i();
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
        ii0 ii0Var = this.e2;
        if (ii0Var != null) {
            if (this.P) {
                ii0Var.K = AndroidUtilities.dp(24.0f);
                this.e2.L = AndroidUtilities.dp(24.0f);
                this.e2.M = 0.0f;
            } else {
                j2 j2Var = this.u0;
                RectF rectF = j2Var.F;
                RectF rectF2 = j2Var.F;
                ii0Var.K = rectF.centerY();
                this.e2.L = rectF2.centerX();
                this.e2.M = rectF2.width() / 2.0f;
                if (!MessagesController.getInstance(this.F0).getStoriesController().h.isEmpty()) {
                    this.e2.M -= AndroidUtilities.dpf2(3.5f);
                }
                ii0 ii0Var2 = this.e2;
                this.Y1.getBitmapWidth();
                ii0Var2.getClass();
            }
            ii0 ii0Var3 = this.e2;
            if (ii0Var3.E || ii0Var3.I == null) {
                return;
            }
            AnimatorSet animatorSet = ii0Var3.B;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                ii0Var3.B.cancel();
            }
            ii0Var3.E = true;
            ii0Var3.F = true;
            ii0Var3.D = 0.0f;
            ii0Var3.I.getTranslationY();
            AndroidUtilities.dp(100.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new gi0(ii0Var3, 5));
            ofFloat.setInterpolator(pr.h);
            ofFloat.setDuration(250L);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new gi0(ii0Var3, 6));
            pr prVar = pr.j;
            ofFloat2.setInterpolator(prVar);
            ofFloat2.setDuration(150L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat3.addUpdateListener(new gi0(ii0Var3, 7));
            ofFloat3.setInterpolator(prVar);
            ofFloat3.setDuration(135L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            ii0Var3.B = animatorSet2;
            animatorSet2.addListener(new r80(ii0Var3, 8));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3);
            animatorSet3.setStartDelay(180L);
            ii0Var3.B.playTogether(ofFloat, animatorSet3);
            ii0Var3.B.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0a29  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0a35  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0a3a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0a94  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0aa3  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0aa5  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x064a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b0(int i10, boolean z10) {
        int i11;
        long j3;
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
        long j10;
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
        TLRPC.Chat chat;
        boolean z23;
        TLRPC.Chat chat2;
        ArrayList R3;
        MessageObject messageObject2;
        boolean z24;
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
        boolean z25;
        boolean z26;
        boolean z27;
        int i21;
        MessagesController.DialogFilter dialogFilter;
        fs fsVar;
        MessagesController.DialogFilter dialogFilter2;
        String str;
        boolean Q = Q();
        boolean z28 = false;
        this.l0 = 0;
        m2 m2Var = this.G0;
        ImageReceiver imageReceiver2 = this.Y1;
        org.telegram.ui.Components.i9 i9Var = this.a2;
        int i22 = this.F0;
        if (m2Var != null) {
            this.R0 = m2Var.h;
            int i23 = m2Var.d;
            this.X0 = i23 != 0;
            this.S0 = i23;
            this.A3 = m2Var.e;
            this.Z0 = m2Var.f;
            this.d1 = false;
            this.e1 = false;
            i9Var.n(m2Var.c, m2Var.a, null);
            if (this.F) {
                imageReceiver2.setImage(null, "50_50", this.G, null, 0L);
            } else {
                imageReceiver2.setImage(null, "50_50", i9Var, null, 0L);
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
            z11 = Q;
            i15 = i22;
            z20 = false;
            z21 = false;
        } else {
            int i25 = this.S0;
            boolean z29 = this.V0 != 0;
            boolean z30 = this.T0;
            this.d1 = false;
            this.e1 = false;
            this.D4 = -1;
            if (this.N0) {
                j3 = 0;
                TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i22).dialogs_dict.f(this.H0);
                if (dialog != null) {
                    this.D4 = dialog.read_outbox_max_id;
                    this.l0 = dialog.ttl_period;
                    if (i10 == 0) {
                        c10 = 1;
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
                        if (messageObject7 != null) {
                            this.Y0 = messageObject7.messageOwner.send_state;
                        }
                    } else {
                        i11 = i25;
                        c10 = 1;
                    }
                } else {
                    i11 = i25;
                    c10 = 1;
                    this.S0 = 0;
                    this.U0 = 0;
                    this.V0 = 0;
                    this.W0 = 0;
                    this.R0 = 0;
                    this.h1 = false;
                }
                if (this.H0 != 0) {
                    int i28 = o41.R;
                }
            } else {
                i11 = i25;
                j3 = 0;
                c10 = 1;
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
            gs gsVar = this.t0;
            if (gsVar != null) {
                boolean isEmpty = gsVar.c.isEmpty();
                gs gsVar2 = this.t0;
                int i29 = this.j1;
                long j12 = this.H0;
                r2 r2Var = gsVar2.a;
                ArrayList arrayList2 = gsVar2.b;
                ArrayList arrayList3 = gsVar2.c;
                AccountInstance accountInstance = AccountInstance.getInstance(i22);
                z12 = z29;
                MessagesController messagesController = MessagesController.getInstance(i22);
                z13 = z30;
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
                            if (dialogFilter4 != null && dialogFilter4 != dialogFilter && dialogFilter4.color >= 0 && dialogFilter4.includesDialog(accountInstance, j12)) {
                                arrayList2.add(dialogFilter4);
                            }
                        }
                    }
                    int i31 = 0;
                    z26 = false;
                    while (i31 < arrayList3.size()) {
                        fs fsVar2 = (fs) arrayList3.get(i31);
                        int i32 = 0;
                        while (true) {
                            if (i32 >= arrayList2.size()) {
                                dialogFilter2 = null;
                                break;
                            }
                            if (((MessagesController.DialogFilter) arrayList2.get(i32)).id == fsVar2.a) {
                                dialogFilter2 = (MessagesController.DialogFilter) arrayList2.get(i32);
                                break;
                            }
                            i32++;
                        }
                        if (dialogFilter2 == null) {
                            arrayList3.remove(i31);
                            i31--;
                        } else {
                            if (dialogFilter2.color != fsVar2.b || ((str = dialogFilter2.name) != null && fsVar2.c != null && str.length() != fsVar2.c.k().length())) {
                                arrayList3.set(i31, fs.b(r2Var, dialogFilter2));
                            }
                            i31++;
                        }
                        z26 = true;
                        i31++;
                    }
                    for (int i33 = 0; i33 < arrayList2.size(); i33++) {
                        MessagesController.DialogFilter dialogFilter5 = (MessagesController.DialogFilter) arrayList2.get(i33);
                        int i34 = 0;
                        while (true) {
                            if (i34 >= arrayList3.size()) {
                                fsVar = null;
                                break;
                            }
                            if (((fs) arrayList3.get(i34)).a == dialogFilter5.id) {
                                fsVar = (fs) arrayList3.get(i34);
                                break;
                            }
                            i34++;
                        }
                        if (fsVar == null) {
                            arrayList3.add(i33, fs.b(r2Var, dialogFilter5));
                            z26 = true;
                        }
                    }
                    arrayList2.clear();
                } else {
                    z11 = Q;
                    i12 = i11;
                    boolean isEmpty2 = arrayList3.isEmpty();
                    arrayList3.clear();
                    z26 = !isEmpty2;
                }
                if (z26) {
                    if (isEmpty != this.t0.c.isEmpty()) {
                        z14 = true;
                        z27 = true;
                    } else {
                        z14 = false;
                        z27 = false;
                    }
                    z15 = z27;
                    z16 = true;
                    if (i10 == 0) {
                        TLRPC.User user2 = this.f2;
                        if (user2 != null && !MessagesController.isSupportUser(user2) && !this.f2.bot && (i10 & MessagesController.UPDATE_MASK_STATUS) != 0) {
                            this.f2 = MessagesController.getInstance(i22).getUser(Long.valueOf(this.f2.id));
                            if (this.B0 != R()) {
                                z16 = true;
                            }
                        }
                        if ((i10 & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                            TLRPC.User user3 = this.f2;
                            org.telegram.ui.Components.o5 o5Var = this.j4;
                            if (user3 != null) {
                                TLRPC.User user4 = MessagesController.getInstance(i22).getUser(Long.valueOf(this.f2.id));
                                this.f2 = user4;
                                if (user4 == null || DialogObject.getEmojiStatusDocumentId(user4.emoji_status) == j3) {
                                    this.D2 = true;
                                    o5Var.g(sg.d1.d().e, z10);
                                    o5Var.m(false, z10);
                                } else {
                                    this.D2 = true;
                                    o5Var.j(DialogObject.getEmojiStatusDocumentId(this.f2.emoji_status), z10);
                                    o5Var.m(DialogObject.isEmojiStatusCollectible(this.f2.emoji_status), z10);
                                }
                                j11 = DialogObject.getBotVerificationIcon(this.f2);
                                z16 = true;
                            } else {
                                j11 = j3;
                            }
                            if (this.g2 != null) {
                                TLRPC.Chat chat5 = MessagesController.getInstance(i22).getChat(Long.valueOf(this.g2.id));
                                this.g2 = chat5;
                                if (chat5 == null || DialogObject.getEmojiStatusDocumentId(chat5.emoji_status) == j3) {
                                    this.D2 = true;
                                    o5Var.g(sg.d1.d().e, z10);
                                    o5Var.m(false, z10);
                                } else {
                                    this.D2 = true;
                                    o5Var.j(DialogObject.getEmojiStatusDocumentId(this.g2.emoji_status), z10);
                                    o5Var.m(DialogObject.isEmojiStatusCollectible(this.g2.emoji_status), z10);
                                }
                                j11 = DialogObject.getBotVerificationIcon(this.g2);
                                z16 = true;
                            }
                            org.telegram.ui.Components.o5 o5Var2 = this.k4;
                            if (j11 != j3) {
                                z25 = !this.g4;
                                o5Var2.j(j11, z10);
                            } else {
                                z25 = this.g4;
                                o5Var2.g(null, z10);
                            }
                            z17 = z16;
                            z24 = z25;
                        } else {
                            z17 = z16;
                            z24 = false;
                        }
                        if ((this.N0 || this.P) && (i10 & MessagesController.UPDATE_MASK_USER_PRINT) != 0) {
                            CharSequence printingString = MessagesController.getInstance(i22).getPrintingString(this.H0, getTopicId(), true);
                            CharSequence charSequence = this.i2;
                            if ((charSequence != null && printingString == null) || ((charSequence == null && printingString != null) || (charSequence != null && !charSequence.equals(printingString)))) {
                                z24 = true;
                            }
                        }
                        if (!z24 && (i10 & MessagesController.UPDATE_MASK_MESSAGE_TEXT) != 0 && (messageObject4 = this.f1) != null && messageObject4.messageText != this.i1) {
                            z24 = true;
                        }
                        if (!z24 && (i10 & MessagesController.UPDATE_MASK_CHAT) != 0 && this.g2 != null) {
                            TLRPC.Chat chat6 = MessagesController.getInstance(i22).getChat(Long.valueOf(this.g2.id));
                            if ((chat6 != null && chat6.call_active && chat6.call_not_empty) != this.v2) {
                                z24 = true;
                            }
                        }
                        if (!z24 && (i10 & MessagesController.UPDATE_MASK_AVATAR) != 0 && ((chat3 = this.g2) == null || (chat3.monoforum && ChatObject.canManageMonoForum(i22, chat3)))) {
                            q2 q2Var = this.J4;
                            if (q2Var != null && (hashMap = q2Var.f) != null && !hashMap.isEmpty()) {
                                for (Map.Entry entry : q2Var.f.entrySet()) {
                                    ((org.telegram.ui.g5) entry.getValue()).c(((Long) entry.getKey()).longValue());
                                }
                            }
                            z24 = true;
                        }
                        if (!z24 && (i10 & MessagesController.UPDATE_MASK_NAME) != 0 && this.g2 == null) {
                            z24 = true;
                        }
                        if (!z24 && (i10 & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 && this.f2 == null) {
                            z24 = true;
                        }
                        if (!z24 && (i10 & MessagesController.UPDATE_MASK_CHAT_NAME) != 0 && this.f2 == null) {
                            z24 = true;
                        }
                        if (!z24) {
                            MessageObject messageObject8 = this.f1;
                            if (messageObject8 != null && this.X0 != messageObject8.isUnread()) {
                                this.X0 = this.f1.isUnread();
                                z24 = true;
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
                                            z24 = true;
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
                                        z24 = true;
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
                        if (!z24 && (i10 & MessagesController.UPDATE_MASK_SEND_STATE) != 0 && (messageObject3 = this.f1) != null) {
                            int i37 = this.Y0;
                            int i38 = messageObject3.messageOwner.send_state;
                            if (i37 != i38) {
                                this.Y0 = i38;
                                z24 = true;
                            }
                        }
                        if (!z24) {
                            invalidate();
                            return z15;
                        }
                    } else {
                        z17 = z16;
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
                        uy uyVar = this.z4;
                        if (uyVar == null || (R3 = uyVar.R3(i22, this.j1, i13, false)) == null || R3.isEmpty()) {
                            messageObject2 = null;
                        } else {
                            int size = R3.size();
                            MessageObject messageObject9 = null;
                            for (int i39 = 0; i39 < size; i39++) {
                                TLRPC.Dialog dialog3 = (TLRPC.Dialog) R3.get(i39);
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
                            TLRPC.EncryptedChat m10 = org.telegram.messenger.w1.m(MessagesController.getInstance(i22), j10);
                            this.h2 = m10;
                            if (m10 != null) {
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
                        org.telegram.ui.ActionBar.j6.u1.setCallback(this);
                        i9Var.g(2);
                        imageReceiver = imageReceiver2;
                        z18 = z12;
                        z19 = z13;
                        i14 = i12;
                        imageReceiver.setImage(null, null, i9Var, null, this.f2, 0);
                    } else {
                        imageReceiver = imageReceiver2;
                        z18 = z12;
                        z19 = z13;
                        i14 = i12;
                        if (!this.O || (messageObject = this.f1) == null) {
                            TLRPC.User user5 = this.f2;
                            if (user5 != null) {
                                i9Var.m(i22, user5);
                                if (UserObject.isReplyUser(this.f2)) {
                                    i9Var.g(12);
                                    imageReceiver.setImage(null, null, i9Var, null, this.f2, 0);
                                } else if (UserObject.isAnonymous(this.f2)) {
                                    i9Var.g(21);
                                    imageReceiver.setImage(null, null, i9Var, null, this.f2, 0);
                                } else if (UserObject.isUserSelf(this.f2) && this.r0 && !this.q0) {
                                    i9Var.g(22);
                                    imageReceiver.setImage(null, null, i9Var, null, this.f2, 0);
                                } else if (!UserObject.isUserSelf(this.f2) || this.u2 || this.q0) {
                                    imageReceiver.setForUserOrChat(this.f2, i9Var, null, true, 1, false);
                                } else {
                                    i9Var.g(1);
                                    imageReceiver.setImage(null, null, i9Var, null, this.f2, 0);
                                }
                            } else {
                                TLRPC.Chat chat9 = this.g2;
                                if (chat9 != null) {
                                    if (chat9.monoforum) {
                                        og.d.n(i22, chat9, i9Var, imageReceiver);
                                        i9Var.p = 1.0f;
                                    } else {
                                        i9Var.k(i22, chat9);
                                        imageReceiver.setForUserOrChat(chat9, i9Var);
                                    }
                                    if (z10 || ((i14 == this.S0 && z19 == this.T0) || (this.N0 && System.currentTimeMillis() - this.x4 <= 100))) {
                                        z20 = z14;
                                        z21 = z15;
                                        i15 = i22;
                                    } else {
                                        ValueAnimator valueAnimator = this.P3;
                                        if (valueAnimator != null) {
                                            valueAnimator.cancel();
                                        }
                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        this.P3 = ofFloat;
                                        ofFloat.addUpdateListener(new g2(this, 0));
                                        this.P3.addListener(new k2(this, 0));
                                        if ((i14 == 0 || this.T0) && (this.T0 || !z19)) {
                                            this.P3.setDuration(220L);
                                            this.P3.setInterpolator(new OvershootInterpolator());
                                        } else if (this.S0 == 0) {
                                            this.P3.setDuration(150L);
                                            this.P3.setInterpolator(pr.f);
                                        } else {
                                            this.P3.setDuration(430L);
                                            this.P3.setInterpolator(pr.f);
                                        }
                                        if (this.G3 && this.H3 && this.T3 != null) {
                                            String format = String.format("%d", Integer.valueOf(i14));
                                            String format2 = String.format("%d", Integer.valueOf(this.S0));
                                            if (format.length() == format2.length()) {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(format2);
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(format2);
                                                int i40 = 0;
                                                while (i40 < format.length()) {
                                                    boolean z31 = z14;
                                                    if (format.charAt(i40) == format2.charAt(i40)) {
                                                        boolean z32 = false;
                                                        z23 = z15;
                                                        int i41 = i40 + 1;
                                                        spannableStringBuilder.setSpan(new lz(z32), i40, i41, 0);
                                                        spannableStringBuilder2.setSpan(new lz(z32), i40, i41, 0);
                                                    } else {
                                                        z23 = z15;
                                                        spannableStringBuilder3.setSpan(new lz(false), i40, i40 + 1, 0);
                                                    }
                                                    i40++;
                                                    z14 = z31;
                                                    z15 = z23;
                                                }
                                                z20 = z14;
                                                z21 = z15;
                                                i15 = i22;
                                                int max = Math.max(AndroidUtilities.dp(8.0f), (int) Math.ceil(org.telegram.ui.ActionBar.j6.M0.measureText(format)));
                                                TextPaint textPaint = org.telegram.ui.ActionBar.j6.M0;
                                                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                                                this.U3 = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                                                this.V3 = new StaticLayout(spannableStringBuilder3, org.telegram.ui.ActionBar.j6.M0, max, alignment, 1.0f, 0.0f, false);
                                                this.W3 = new StaticLayout(spannableStringBuilder2, org.telegram.ui.ActionBar.j6.M0, max, alignment, 1.0f, 0.0f, false);
                                            } else {
                                                z20 = z14;
                                                z21 = z15;
                                                i15 = i22;
                                                this.U3 = this.T3;
                                            }
                                        } else {
                                            z20 = z14;
                                            z21 = z15;
                                            i15 = i22;
                                        }
                                        this.L3 = this.K3;
                                        this.M3 = this.J3;
                                        this.N3 = this.S0 > i14;
                                        this.P3.start();
                                    }
                                    this.O3.a(this.W0 != 0, z10);
                                    boolean z33 = this.V0 != 0;
                                    if (!z10 && z33 != z18) {
                                        ValueAnimator valueAnimator2 = this.Q3;
                                        if (valueAnimator2 != null) {
                                            valueAnimator2.cancel();
                                        }
                                        this.S3 = 0.0f;
                                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        this.Q3 = ofFloat2;
                                        ofFloat2.addUpdateListener(new g2(this, 1));
                                        this.Q3.addListener(new k2(this, 1));
                                        if (z33) {
                                            this.Q3.setDuration(220L);
                                            this.Q3.setInterpolator(new OvershootInterpolator());
                                        } else {
                                            this.Q3.setDuration(150L);
                                            this.Q3.setInterpolator(pr.f);
                                        }
                                        this.Q3.start();
                                    }
                                    z22 = P() && (chat = this.g2) != null && chat.monoforum;
                                    this.y = z22;
                                    if (z22) {
                                        dp = 1;
                                    } else if (this.E) {
                                        dp = AndroidUtilities.dp(12.0f);
                                    } else {
                                        TLRPC.Chat chat10 = this.g2;
                                        dp = ((chat10 == null || !chat10.forum || this.J0 != 0 || this.O) && (this.r0 || (user = this.f2) == null || !user.self || !MessagesController.getInstance(i15).savedViewAsChats)) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f);
                                    }
                                    imageReceiver.setRoundRadius(dp);
                                    z28 = z17;
                                }
                            }
                        } else {
                            i9Var.j(i22, messageObject.getFromPeerObject());
                            imageReceiver.setForUserOrChat(this.f1.getFromPeerObject(), i9Var);
                        }
                    }
                    if (z10) {
                    }
                    z20 = z14;
                    z21 = z15;
                    i15 = i22;
                    this.O3.a(this.W0 != 0, z10);
                    if (this.V0 != 0) {
                    }
                    if (!z10) {
                    }
                    if (P()) {
                    }
                    this.y = z22;
                    if (z22) {
                    }
                    imageReceiver.setRoundRadius(dp);
                    z28 = z17;
                }
            } else {
                z11 = Q;
                z12 = z29;
                z13 = z30;
                i12 = i11;
            }
            z14 = false;
            z15 = false;
            z16 = false;
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
            z20 = z14;
            z21 = z15;
            i15 = i22;
            this.O3.a(this.W0 != 0, z10);
            if (this.V0 != 0) {
            }
            if (!z10) {
            }
            if (P()) {
            }
            this.y = z22;
            if (z22) {
            }
            imageReceiver.setRoundRadius(dp);
            z28 = z17;
        }
        boolean z34 = (this.P || (getMeasuredWidth() == 0 && getMeasuredHeight() == 0)) ? z20 : true;
        if (!z28) {
            int i42 = this.u0.y;
            bi.p9.r(MessagesController.getInstance(i15).getStoriesController(), getDialogId());
        }
        if (!z10) {
            this.c1 = (this.Z0 || this.b1) ? 1.0f : 0.0f;
            ValueAnimator valueAnimator3 = this.P3;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
        }
        invalidate();
        if (Q() != z11) {
            z21 = true;
        }
        if (z34) {
            if (this.w3) {
                t();
            } else {
                this.A0 = true;
            }
        }
        d0(z10);
        return z21;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f0, code lost:
    
        if (org.telegram.messenger.DownloadController.getInstance(r32.F0).canDownloadMedia(1, r4.size) == false) goto L47;
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
                                i11 = i14;
                                z11 = false;
                            } else {
                                i11 = i14;
                                z11 = false;
                            }
                            closestPhotoSizeWithSize = photoSize2;
                            if (photoSize2 != null) {
                                this.S1 = this.S1 || z10;
                                int i16 = this.R1;
                                if (i16 < 3) {
                                    this.R1 = i16 + 1;
                                    zArr2[i11] = z10;
                                    zArr[i11] = z11;
                                    imageReceiverArr[i11].setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, photoSize), "20_20", ImageLocation.getForObject(photoSize2, photoSize), "20_20", (z10 || closestPhotoSizeWithSize == null) ? 0 : closestPhotoSizeWithSize.size, null, this.f1, 0);
                                    imageReceiverArr[i11].setRoundRadius(AndroidUtilities.dp(2.0f));
                                    this.V = false;
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
        ArrayList arrayList = this.g1;
        if (arrayList != null && arrayList.size() > 1 && TextUtils.isEmpty(restrictionReason) && this.J0 == 0 && this.h2 == null) {
            this.R1 = 0;
            this.S1 = false;
            Collections.sort(this.g1, Comparator$-CC.comparingInt(new bi.o6(4)));
            for (int i17 = 0; i17 < Math.min(3, this.g1.size()); i17++) {
                MessageObject messageObject3 = (MessageObject) this.g1.get(i17);
                if (messageObject3 != null && !messageObject3.needDrawBluredPreview() && (messageObject3.isPhoto() || messageObject3.isNewGif() || messageObject3.isVideo() || messageObject3.isRoundVideo() || messageObject3.isStoryMedia())) {
                    String str = messageObject3.isWebpage() ? messageObject3.messageOwner.media.webpage.type : null;
                    if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                        Z(messageObject3, i17);
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
        TL_account.RequirementToContact isUserContactBlocked = (this.V4 == null || this.f2 == null) ? null : MessagesController.getInstance(this.F0).isUserContactBlocked(this.f2.id);
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
                    p2[] p2VarArr = (p2[]) ((Spanned) text).getSpans(0, text.length(), p2.class);
                    boolean[] zArr = this.U1;
                    if (p2VarArr == null || p2VarArr.length <= 0) {
                        for (int i11 = 0; i11 < 3; i11++) {
                            zArr[i11] = false;
                        }
                        return;
                    }
                    int spanStart = ((Spanned) text).getSpanStart(p2VarArr[0]);
                    if (spanStart < 0) {
                        spanStart = 0;
                    }
                    int ceil = (int) Math.ceil(Math.min(staticLayout.getPrimaryHorizontal(spanStart), staticLayout.getPrimaryHorizontal(spanStart + 1)));
                    if (ceil != 0 && !this.x0 && !this.y0) {
                        ceil += AndroidUtilities.dp(3.0f);
                    }
                    for (int i12 = 0; i12 < this.R1; i12++) {
                        this.V1[i12].setImageX(i10 + ceil + AndroidUtilities.dp((this.H4 + 2) * i12));
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
        if (pb.x1) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == this.y1 || drawable == org.telegram.ui.ActionBar.j6.u1) {
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
        this.m3 = org.telegram.ui.Components.z5.update(0, this, this.m3, this.e3);
        this.n3 = org.telegram.ui.Components.z5.update(0, this, this.n3, this.s3);
        this.o3 = org.telegram.ui.Components.z5.update(0, this, this.o3, this.h3);
        this.p3 = org.telegram.ui.Components.z5.update(0, this, this.p3, this.z2);
        org.telegram.ui.Components.o5 o5Var = this.j4;
        if (o5Var != null) {
            o5Var.a();
        }
        org.telegram.ui.Components.o5 o5Var2 = this.k4;
        if (o5Var2 != null) {
            o5Var2.a();
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
        xi0 xi0Var = this.y1;
        if (xi0Var != null) {
            xi0Var.stop();
            this.y1.Q(0.0f, true);
            this.y1.setCallback(null);
            this.y1 = null;
            this.z1 = false;
        }
        hg.j jVar = this.o4;
        if (jVar != null) {
            jVar.d.remove(Long.valueOf(this.H0));
        }
        org.telegram.ui.Components.o5 o5Var = this.j4;
        if (o5Var != null) {
            o5Var.b();
        }
        org.telegram.ui.Components.o5 o5Var2 = this.k4;
        if (o5Var2 != null) {
            o5Var2.b();
        }
        org.telegram.ui.Components.z5.release(this, this.m3);
        org.telegram.ui.Components.z5.release(this, this.n3);
        org.telegram.ui.Components.z5.release(this, this.o3);
        org.telegram.ui.Components.z5.release(this, this.p3);
        this.u0.g();
        this.c0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1000:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:1010:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:1027:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:1033:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:1036:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:1039:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:1040:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0cc6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0cdb  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0cf1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0cf4  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0d06  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0d3a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0d4d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0d55  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0ded  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0fe7  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x1086  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x108e  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x10a2  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x1109  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x111a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x1163  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x117d  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x119f  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x11a2  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x11dd  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x1264  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x13b7  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x1420  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x1665  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x17ca  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x17fb  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x1817  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x1836  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x1855  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x1934  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x1892  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x196f  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x1978  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x1988  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x19e0  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x19e9  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x19ee  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x1a43  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x1ac3  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x1b12  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x1b75  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x1bab  */
    /* JADX WARN: Removed duplicated region for block: B:658:0x1bfa  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x1c0f  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x1c58  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x1c60  */
    /* JADX WARN: Removed duplicated region for block: B:681:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:682:0x1c5a  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x1c35  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x1bcf  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x1b82  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x1b95  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x146f  */
    /* JADX WARN: Removed duplicated region for block: B:780:0x13c3  */
    /* JADX WARN: Removed duplicated region for block: B:785:0x12b5  */
    /* JADX WARN: Removed duplicated region for block: B:843:0x1247  */
    /* JADX WARN: Removed duplicated region for block: B:852:0x1180  */
    /* JADX WARN: Removed duplicated region for block: B:854:0x1166  */
    /* JADX WARN: Removed duplicated region for block: B:869:0x1090  */
    /* JADX WARN: Removed duplicated region for block: B:870:0x1088  */
    /* JADX WARN: Removed duplicated region for block: B:881:0x1095  */
    /* JADX WARN: Removed duplicated region for block: B:893:0x0fe2  */
    /* JADX WARN: Removed duplicated region for block: B:896:0x0cd0  */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v169, types: [org.telegram.ui.Cells.h2] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        float f7;
        boolean z10;
        int v02;
        int v03;
        int i10;
        String string;
        String str;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.f6 f6Var;
        boolean z11;
        di.eb ebVar;
        l2 l2Var;
        float f10;
        String str2;
        float f11;
        int i14;
        String str3;
        float f12;
        l2 l2Var2;
        float f13;
        l2 l2Var3;
        String str4;
        int ceil;
        int i15;
        StaticLayout staticLayout;
        boolean z12;
        xi0 xi0Var;
        float f14;
        float f15;
        org.telegram.ui.ActionBar.f6 f6Var2;
        float f16;
        r2 r2Var;
        org.telegram.ui.ActionBar.f6 f6Var3;
        l2 l2Var4;
        di.eb ebVar2;
        int i16;
        ?? r12;
        float f17;
        boolean z13;
        boolean z14;
        boolean z15;
        ImageReceiver imageReceiver;
        boolean z16;
        j2 j2Var;
        r2 r2Var2;
        float f18;
        Canvas canvas2;
        boolean z17;
        float f19;
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.TL_forumTopic tL_forumTopic2;
        ii0 ii0Var;
        o2 o2Var;
        float f20;
        int i17;
        float f21;
        int i18;
        int i19;
        boolean z18;
        o2 o2Var2;
        int i20;
        float f22;
        int i21;
        RectF rectF;
        org.telegram.ui.ActionBar.f6 f6Var4;
        o2 o2Var3;
        float f23;
        boolean z19;
        r2 r2Var3;
        boolean z20;
        float f24;
        gs gsVar;
        int i22;
        float dp;
        float f25;
        boolean z21;
        boolean z22;
        boolean z23;
        int i23;
        float f26;
        float z24;
        StaticLayout staticLayout2;
        int i24;
        kw0 t02;
        int i25;
        m2 m2Var;
        uy uyVar;
        ox oxVar;
        TLRPC.TL_forumTopic tL_forumTopic3;
        ii0 ii0Var2;
        TLRPC.TL_forumTopic tL_forumTopic4;
        final r2 r2Var4 = this;
        Canvas canvas3 = canvas;
        if ((r2Var4.H0 == 0 && r2Var4.G0 == null) || !r2Var4.z0) {
            return;
        }
        boolean z25 = r2Var4.h;
        di.eb ebVar3 = r2Var4.i4;
        if (z25 && ((r2Var4.J0 != 0 || (r2Var4.P && (tL_forumTopic4 = r2Var4.N) != null && tL_forumTopic4.id == 1)) && (ii0Var2 = r2Var4.e2) != null && ii0Var2.C == 0.0f && r2Var4.w1 == 0.0f)) {
            canvas3.save();
            canvas3.translate(0.0f, (-r2Var4.E3) - r2Var4.n);
            canvas3.clipRect(0.0f, (1.0f - r2Var4.e2.J) * r2Var4.getMeasuredHeight(), r2Var4.getMeasuredWidth(), r2Var4.getMeasuredHeight());
            r2Var4.e2.c(canvas3, false);
            canvas3.restore();
            ebVar3.setVisibility(4);
            return;
        }
        boolean z26 = z25 && (r2Var4.J0 != 0 || (r2Var4.P && (tL_forumTopic3 = r2Var4.N) != null && tL_forumTopic3.id == 1)) && r2Var4.e2 != null && r2Var4.w1 == 0.0f && (uyVar = r2Var4.z4) != null && uyVar.Z3() && ((oxVar = uyVar.F3) == null || !oxVar.c());
        ii0 ii0Var3 = r2Var4.e2;
        float f27 = ii0Var3 != null ? ii0Var3.J : 1.0f;
        if (z26) {
            canvas3.save();
            canvas3.clipRect(0.0f, (1.0f - f27) * r2Var4.getMeasuredHeight(), r2Var4.getMeasuredWidth(), r2Var4.getMeasuredHeight());
        }
        if (r2Var4.t1 != 0.0f && Build.VERSION.SDK_INT != 24) {
            canvas3.save();
            canvas3.clipRect(0.0f, r2Var4.u1 * r2Var4.t1, r2Var4.getMeasuredWidth(), r2Var4.getMeasuredHeight() - ((int) (r2Var4.v1 * r2Var4.t1)));
        }
        float f28 = r2Var4.w1;
        l2 l2Var5 = r2Var4.d2;
        org.telegram.ui.ActionBar.f6 f6Var5 = r2Var4.F4;
        if (f28 == 0.0f && r2Var4.o1 == 0.0f) {
            xi0 xi0Var2 = r2Var4.y1;
            if (xi0Var2 != null) {
                xi0Var2.stop();
                r2Var4.y1.Q(0.0f, true);
                r2Var4.y1.setCallback(null);
                r2Var4.y1 = null;
                r2Var4.z1 = false;
            }
            f6Var = f6Var5;
            z11 = z25;
            ebVar = ebVar3;
            l2Var3 = l2Var5;
        } else {
            canvas3.save();
            canvas3.translate(0.0f, -r2Var4.E3);
            if (r2Var4.L1) {
                v02 = org.telegram.ui.ActionBar.j6.v0(r2Var4.M1, f6Var5);
                v03 = org.telegram.ui.ActionBar.j6.v0(r2Var4.N1, f6Var5);
                String str5 = r2Var4.O1;
                f7 = 1.0f;
                i10 = r2Var4.P1;
                string = LocaleController.getString(str5, i10);
                z10 = false;
                r2Var4.y1 = r2Var4.Q1;
            } else {
                f7 = 1.0f;
                z10 = false;
                if (r2Var4.J0 != 0) {
                    if (r2Var4.m1) {
                        v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d9, f6Var5);
                        v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.c9, f6Var5);
                        i10 = R.string.UnhideFromTop;
                        string = LocaleController.getString(i10);
                        r2Var4.y1 = org.telegram.ui.ActionBar.j6.y1;
                    } else {
                        v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.c9, f6Var5);
                        v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d9, f6Var5);
                        i10 = R.string.HideOnTop;
                        string = LocaleController.getString(i10);
                        r2Var4.y1 = org.telegram.ui.ActionBar.j6.x1;
                    }
                } else if (r2Var4.P2) {
                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.c9, f6Var5);
                    v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d9, f6Var5);
                    i10 = R.string.PsaHide;
                    string = LocaleController.getString(i10);
                    r2Var4.y1 = org.telegram.ui.ActionBar.j6.z1;
                } else if (r2Var4.k1 == 0) {
                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.c9, f6Var5);
                    v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d9, f6Var5);
                    if (ChatObject.isCommunity(r2Var4.g2)) {
                        int i26 = R.string.SwipeUngroupCommunity;
                        String string2 = LocaleController.getString(i26);
                        v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Y5, f6Var5);
                        r2Var4.y1 = org.telegram.ui.ActionBar.j6.K1;
                        str = string2;
                        i11 = i26;
                        i12 = v02;
                        if (r2Var4.w || (xi0Var = r2Var4.s) == null) {
                            r2Var4.s = r2Var4.y1;
                            r2Var4.v = i11;
                        } else {
                            r2Var4.y1 = xi0Var;
                            i11 = r2Var4.v;
                        }
                        if (!r2Var4.z1 && Math.abs(r2Var4.w1) > AndroidUtilities.dp(43.0f)) {
                            r2Var4.z1 = true;
                            r2Var4.y1.Q(0.0f, true);
                            r2Var4.y1.setCallback(r2Var4);
                            r2Var4.y1.start();
                        }
                        float measuredWidth = r2Var4.getMeasuredWidth() + r2Var4.w1;
                        if (r2Var4.B1 >= f7) {
                            org.telegram.ui.ActionBar.j6.v0.setColor(v02);
                            i13 = i11;
                            f6Var = f6Var5;
                            z11 = z25;
                            ebVar = ebVar3;
                            l2Var = l2Var5;
                            f11 = measuredWidth;
                            str2 = "Arrow";
                            f10 = 0.0f;
                            canvas3.drawRect(measuredWidth - AndroidUtilities.dp(8.0f), 0.0f, r2Var4.getMeasuredWidth(), r2Var4.getMeasuredHeight(), org.telegram.ui.ActionBar.j6.v0);
                            if (r2Var4.B1 == 0.0f) {
                                if (org.telegram.ui.ActionBar.j6.A1) {
                                    org.telegram.ui.ActionBar.j6.v1.O(org.telegram.ui.ActionBar.j6.E0(org.telegram.ui.ActionBar.j6.c9), str2);
                                    org.telegram.ui.ActionBar.j6.A1 = z10;
                                }
                                if (org.telegram.ui.ActionBar.j6.B1) {
                                    xi0 xi0Var3 = org.telegram.ui.ActionBar.j6.z1;
                                    xi0Var3.a0 = true;
                                    int i27 = org.telegram.ui.ActionBar.j6.c9;
                                    xi0Var3.O(org.telegram.ui.ActionBar.j6.E0(i27), "Line 1");
                                    org.telegram.ui.ActionBar.j6.z1.O(org.telegram.ui.ActionBar.j6.E0(i27), "Line 2");
                                    org.telegram.ui.ActionBar.j6.z1.O(org.telegram.ui.ActionBar.j6.E0(i27), "Line 3");
                                    org.telegram.ui.ActionBar.j6.z1.m();
                                    org.telegram.ui.ActionBar.j6.B1 = z10;
                                }
                            }
                        } else {
                            i13 = i11;
                            f6Var = f6Var5;
                            z11 = z25;
                            ebVar = ebVar3;
                            l2Var = l2Var5;
                            f10 = 0.0f;
                            str2 = "Arrow";
                            f11 = measuredWidth;
                        }
                        int measuredWidth2 = (r2Var4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (r2Var4.y1.getIntrinsicWidth() / 2);
                        int y3 = wl.y(52.0f, r2Var4.getMeasuredHeight(), 2);
                        int intrinsicWidth = (r2Var4.y1.getIntrinsicWidth() / 2) + measuredWidth2;
                        int intrinsicHeight = (r2Var4.y1.getIntrinsicHeight() / 2) + y3;
                        if (r2Var4.B1 <= f10) {
                            canvas3.save();
                            i14 = i13;
                            str3 = str;
                            f12 = f11;
                            canvas3.clipRect(f11 - AndroidUtilities.dp(8.0f), 0.0f, r2Var4.getMeasuredWidth(), r2Var4.getMeasuredHeight());
                            org.telegram.ui.ActionBar.j6.v0.setColor(i12);
                            l2Var2 = l2Var;
                            canvas3.drawCircle(intrinsicWidth, intrinsicHeight, AndroidUtilities.accelerateInterpolator.getInterpolation(r2Var4.B1) * ((float) Math.sqrt(((intrinsicHeight - r2Var4.getMeasuredHeight()) * (intrinsicHeight - r2Var4.getMeasuredHeight())) + (intrinsicWidth * intrinsicWidth))), org.telegram.ui.ActionBar.j6.v0);
                            canvas3.restore();
                            if (org.telegram.ui.ActionBar.j6.A1) {
                                z12 = true;
                            } else {
                                org.telegram.ui.ActionBar.j6.v1.O(org.telegram.ui.ActionBar.j6.E0(org.telegram.ui.ActionBar.j6.d9), str2);
                                z12 = true;
                                org.telegram.ui.ActionBar.j6.A1 = true;
                            }
                            if (!org.telegram.ui.ActionBar.j6.B1) {
                                xi0 xi0Var4 = org.telegram.ui.ActionBar.j6.z1;
                                xi0Var4.a0 = z12;
                                int i28 = org.telegram.ui.ActionBar.j6.d9;
                                xi0Var4.O(org.telegram.ui.ActionBar.j6.E0(i28), "Line 1");
                                org.telegram.ui.ActionBar.j6.z1.O(org.telegram.ui.ActionBar.j6.E0(i28), "Line 2");
                                org.telegram.ui.ActionBar.j6.z1.O(org.telegram.ui.ActionBar.j6.E0(i28), "Line 3");
                                org.telegram.ui.ActionBar.j6.z1.m();
                                org.telegram.ui.ActionBar.j6.B1 = true;
                            }
                        } else {
                            i14 = i13;
                            str3 = str;
                            f12 = f11;
                            l2Var2 = l2Var;
                        }
                        canvas3.save();
                        canvas3.translate(measuredWidth2, y3);
                        f13 = r2Var4.C1;
                        if (f13 != 0.0f || f13 == f7) {
                            l2Var3 = l2Var2;
                        } else {
                            l2Var3 = l2Var2;
                            float interpolation = l2Var3.getInterpolation(f13) + f7;
                            canvas3.scale(interpolation, interpolation, r2Var4.y1.getIntrinsicWidth() / 2, r2Var4.y1.getIntrinsicHeight() / 2);
                        }
                        a0.o(0, 0, r2Var4.y1);
                        r2Var4.y1.draw(canvas3);
                        canvas3.restore();
                        canvas3.clipRect(f12, 0.0f, r2Var4.getMeasuredWidth(), r2Var4.getMeasuredHeight());
                        str4 = str3;
                        ceil = (int) Math.ceil(org.telegram.ui.ActionBar.j6.M0.measureText(str4));
                        i15 = i14;
                        if (r2Var4.B4 == i15 || r2Var4.C4 != r2Var4.getMeasuredWidth()) {
                            r2Var4.B4 = i15;
                            r2Var4.C4 = r2Var4.getMeasuredWidth();
                            TextPaint textPaint = org.telegram.ui.ActionBar.j6.N0;
                            int min = Math.min(AndroidUtilities.dp(80.0f), ceil);
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                            staticLayout = new StaticLayout(str4, textPaint, min, alignment, 1.0f, 0.0f, false);
                            r2Var4.A4 = staticLayout;
                            if (staticLayout.getLineCount() > 1) {
                                r2Var4.A4 = new StaticLayout(str4, org.telegram.ui.ActionBar.j6.O0, Math.min(AndroidUtilities.dp(82.0f), ceil), alignment, 1.0f, 0.0f, false);
                            }
                        }
                        if (r2Var4.A4 == null) {
                            canvas3.save();
                            canvas3.translate((r2Var4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (r2Var4.A4.getWidth() / 2.0f), AndroidUtilities.dp(36.0f) + y3 + (r2Var4.A4.getLineCount() > 1 ? -AndroidUtilities.dp(4.0f) : 0.0f));
                            r2Var4.A4.draw(canvas3);
                            canvas3.restore();
                        }
                        canvas3.restore();
                    } else {
                        int i29 = r2Var4.F0;
                        if (SharedConfig.getChatSwipeAction(i29) == 3) {
                            if (r2Var4.Z0) {
                                i10 = R.string.SwipeUnmute;
                                string = LocaleController.getString(i10);
                                r2Var4.y1 = org.telegram.ui.ActionBar.j6.I1;
                            } else {
                                i10 = R.string.SwipeMute;
                                string = LocaleController.getString(i10);
                                r2Var4.y1 = org.telegram.ui.ActionBar.j6.H1;
                            }
                        } else if (SharedConfig.getChatSwipeAction(i29) == 4) {
                            i10 = R.string.SwipeDeleteChat;
                            string = LocaleController.getString(i10);
                            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Y5, f6Var5);
                            r2Var4.y1 = org.telegram.ui.ActionBar.j6.J1;
                        } else if (SharedConfig.getChatSwipeAction(i29) == 1) {
                            if (r2Var4.S0 > 0 || r2Var4.T0) {
                                i10 = R.string.SwipeMarkAsRead;
                                string = LocaleController.getString(i10);
                                r2Var4.y1 = org.telegram.ui.ActionBar.j6.L1;
                            } else {
                                i10 = R.string.SwipeMarkAsUnread;
                                string = LocaleController.getString(i10);
                                r2Var4.y1 = org.telegram.ui.ActionBar.j6.M1;
                            }
                        } else if (SharedConfig.getChatSwipeAction(i29) != 0) {
                            i10 = R.string.Archive;
                            string = LocaleController.getString(i10);
                            r2Var4.y1 = org.telegram.ui.ActionBar.j6.v1;
                        } else if (r2Var4.getIsPinned()) {
                            i10 = R.string.SwipeUnpin;
                            string = LocaleController.getString(i10);
                            r2Var4.y1 = org.telegram.ui.ActionBar.j6.O1;
                        } else {
                            i10 = R.string.SwipePin;
                            string = LocaleController.getString(i10);
                            r2Var4.y1 = org.telegram.ui.ActionBar.j6.N1;
                        }
                    }
                } else {
                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d9, f6Var5);
                    v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.c9, f6Var5);
                    i10 = R.string.Unarchive;
                    string = LocaleController.getString(i10);
                    r2Var4.y1 = org.telegram.ui.ActionBar.j6.w1;
                }
            }
            int i30 = i10;
            i12 = v03;
            i11 = i30;
            str = string;
            if (r2Var4.w) {
            }
            r2Var4.s = r2Var4.y1;
            r2Var4.v = i11;
            if (!r2Var4.z1) {
                r2Var4.z1 = true;
                r2Var4.y1.Q(0.0f, true);
                r2Var4.y1.setCallback(r2Var4);
                r2Var4.y1.start();
            }
            float measuredWidth3 = r2Var4.getMeasuredWidth() + r2Var4.w1;
            if (r2Var4.B1 >= f7) {
            }
            int measuredWidth22 = (r2Var4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (r2Var4.y1.getIntrinsicWidth() / 2);
            int y32 = wl.y(52.0f, r2Var4.getMeasuredHeight(), 2);
            int intrinsicWidth2 = (r2Var4.y1.getIntrinsicWidth() / 2) + measuredWidth22;
            int intrinsicHeight2 = (r2Var4.y1.getIntrinsicHeight() / 2) + y32;
            if (r2Var4.B1 <= f10) {
            }
            canvas3.save();
            canvas3.translate(measuredWidth22, y32);
            f13 = r2Var4.C1;
            if (f13 != 0.0f) {
            }
            l2Var3 = l2Var2;
            a0.o(0, 0, r2Var4.y1);
            r2Var4.y1.draw(canvas3);
            canvas3.restore();
            canvas3.clipRect(f12, 0.0f, r2Var4.getMeasuredWidth(), r2Var4.getMeasuredHeight());
            str4 = str3;
            ceil = (int) Math.ceil(org.telegram.ui.ActionBar.j6.M0.measureText(str4));
            i15 = i14;
            if (r2Var4.B4 == i15) {
            }
            r2Var4.B4 = i15;
            r2Var4.C4 = r2Var4.getMeasuredWidth();
            TextPaint textPaint2 = org.telegram.ui.ActionBar.j6.N0;
            int min2 = Math.min(AndroidUtilities.dp(80.0f), ceil);
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
            staticLayout = new StaticLayout(str4, textPaint2, min2, alignment2, 1.0f, 0.0f, false);
            r2Var4.A4 = staticLayout;
            if (staticLayout.getLineCount() > 1) {
            }
            if (r2Var4.A4 == null) {
            }
            canvas3.restore();
        }
        if (r2Var4.w1 != 0.0f) {
            canvas3.save();
            canvas3.translate(r2Var4.w1, 0.0f);
            f14 = 0.0f + r2Var4.w1;
        } else {
            f14 = 0.0f;
        }
        float dp2 = AndroidUtilities.dp(8.0f) * r2Var4.o1;
        boolean z27 = r2Var4.m4;
        RectF rectF2 = r2Var4.n4;
        if (z27) {
            f15 = 0.0f;
            rectF2.set(0.0f, 0.0f, r2Var4.getMeasuredWidth(), AndroidUtilities.lerp(r2Var4.getMeasuredHeight(), r2Var4.getCollapsedHeight(), r2Var4.i0));
            rectF2.offset(0.0f, (-r2Var4.E3) + r2Var4.C0);
            canvas3.drawRoundRect(rectF2, dp2, dp2, org.telegram.ui.ActionBar.j6.u0);
        } else {
            f15 = 0.0f;
        }
        canvas3.save();
        canvas3.translate(f15, (-r2Var4.n) * r2Var4.i0);
        if (r2Var4.J0 == 0 || (SharedConfig.archiveHidden && r2Var4.D1 == f15)) {
            f6Var2 = f6Var;
            if (r2Var4.getIsPinned() || r2Var4.z3) {
                org.telegram.ui.ActionBar.j6.v0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s9, f6Var2));
                org.telegram.ui.ActionBar.j6.v0.setAlpha((int) ((1.0f - r2Var4.i0) * r3.getAlpha()));
            }
        } else {
            f6Var2 = f6Var;
            org.telegram.ui.ActionBar.j6.v0.setColor(AndroidUtilities.getOffsetColor(0, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s9, f6Var2), r2Var4.D1, 1.0f));
            org.telegram.ui.ActionBar.j6.v0.setAlpha((int) ((1.0f - r2Var4.i0) * r3.getAlpha()));
        }
        canvas3.restore();
        o2 o2Var4 = r2Var4.E4;
        o2Var4.b();
        if (r2Var4.C0 != 0.0f) {
            canvas3.save();
            canvas3.translate(0.0f, r2Var4.C0);
            f16 = r2Var4.C0 + 0.0f;
        } else {
            f16 = 0.0f;
        }
        float f29 = r2Var4.i0;
        if (f29 != 1.0f) {
            if (f29 != 0.0f) {
                float clamp = Utilities.clamp(f29 / 0.4f, 1.0f, 0.0f);
                if (SharedConfig.getDevicePerformanceClass() >= 2) {
                    o2Var = o2Var4;
                    f20 = 1.0f;
                    i17 = -1;
                    f21 = 2.0f;
                    i18 = canvas3.saveLayerAlpha(com.google.android.gms.internal.vision.e2.b(1.0f, clamp, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(o41.getRightPaddingSize() + 1)), 0.0f, r2Var4.getMeasuredWidth(), r2Var4.getMeasuredHeight(), (int) ((1.0f - r2Var4.i0) * 255.0f), 31);
                } else {
                    o2Var = o2Var4;
                    f20 = 1.0f;
                    i17 = -1;
                    f21 = 2.0f;
                    i18 = canvas3.save();
                    canvas3.clipRect(com.google.android.gms.internal.vision.e2.b(1.0f, clamp, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(o41.getRightPaddingSize() + 1)), 0.0f, r2Var4.getMeasuredWidth(), r2Var4.getMeasuredHeight());
                }
                canvas3.translate((-(r2Var4.getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * r2Var4.i0, 0.0f);
                f14 += (-(r2Var4.getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * r2Var4.i0;
            } else {
                o2Var = o2Var4;
                f20 = 1.0f;
                i17 = -1;
                f21 = 2.0f;
                i18 = -1;
            }
            float f30 = f14;
            if (r2Var4.w1 != 0.0f || r2Var4.o1 != 0.0f) {
                canvas3.save();
                org.telegram.ui.ActionBar.j6.v0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var2));
                rectF2.set(r2Var4.getMeasuredWidth() - AndroidUtilities.dp(64.0f), 0.0f, r2Var4.getMeasuredWidth(), r2Var4.getMeasuredHeight());
                rectF2.offset(0.0f, -r2Var4.E3);
                canvas3.drawRoundRect(rectF2, dp2, dp2, org.telegram.ui.ActionBar.j6.v0);
                if (r2Var4.m4) {
                    canvas3.drawRoundRect(rectF2, dp2, dp2, org.telegram.ui.ActionBar.j6.u0);
                }
                if (r2Var4.J0 != 0 && (!SharedConfig.archiveHidden || r2Var4.D1 != 0.0f)) {
                    org.telegram.ui.ActionBar.j6.v0.setColor(AndroidUtilities.getOffsetColor(0, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s9, f6Var2), r2Var4.D1, f20));
                    org.telegram.ui.ActionBar.j6.v0.setAlpha((int) ((f20 - r2Var4.i0) * r0.getAlpha()));
                } else if (r2Var4.getIsPinned() || r2Var4.z3) {
                    org.telegram.ui.ActionBar.j6.v0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s9, f6Var2));
                    org.telegram.ui.ActionBar.j6.v0.setAlpha((int) ((f20 - r2Var4.i0) * r0.getAlpha()));
                }
                canvas3.restore();
            }
            if (r2Var4.w1 != 0.0f) {
                float f31 = r2Var4.o1;
                if (f31 < f20) {
                    float f32 = f31 + 0.10666667f;
                    r2Var4.o1 = f32;
                    if (f32 > f20) {
                        r2Var4.o1 = f20;
                    }
                    z14 = true;
                }
                z14 = false;
            } else {
                float f33 = r2Var4.o1;
                if (f33 > 0.0f) {
                    float f34 = f33 - 0.10666667f;
                    r2Var4.o1 = f34;
                    if (f34 < 0.0f) {
                        r2Var4.o1 = 0.0f;
                    }
                    z14 = true;
                }
                z14 = false;
            }
            if (r2Var4.G2) {
                a0.o(r2Var4.J2, r2Var4.K2, org.telegram.ui.ActionBar.j6.a1);
                org.telegram.ui.ActionBar.j6.a1.draw(canvas3);
            }
            boolean z28 = r2Var4.r2;
            int dp3 = AndroidUtilities.dp((z28 || SharedConfig.useThreeLinesLayout) ? 10.0f : 14.0f);
            if (((!z28 && !SharedConfig.useThreeLinesLayout) || r2Var4.Q()) && r2Var4.M()) {
                dp3 -= AndroidUtilities.dp(r2Var4.Q() ? 8.0f : 9.0f);
            }
            if (r2Var4.z2 != null) {
                if (!r2Var4.D2 || r2Var4.A2) {
                    i19 = i18;
                    f22 = 24.0f;
                } else {
                    if (r2Var4.C2 && r2Var4.E2 == null) {
                        Paint paint = new Paint();
                        r2Var4.E2 = paint;
                        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{i17, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        r2Var4.E2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    } else if (r2Var4.F2 == null) {
                        Paint paint2 = new Paint();
                        r2Var4.F2 = paint2;
                        paint2.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{0, i17}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        r2Var4.F2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    f22 = 24.0f;
                    i19 = i18;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, r2Var4.getMeasuredWidth(), r2Var4.getMeasuredHeight(), 255, 31);
                    int i31 = r2Var4.x2;
                    canvas3.clipRect(i31, 0, r2Var4.y2 + i31, r2Var4.getMeasuredHeight());
                }
                if (r2Var4.J0 != 0) {
                    TextPaint textPaint3 = org.telegram.ui.ActionBar.j6.B0[r2Var4.E0];
                    int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Y8, f6Var2);
                    textPaint3.linkColor = v04;
                    textPaint3.setColor(v04);
                } else if (r2Var4.h2 != null || ((m2Var = r2Var4.G0) != null && m2Var.g == 2)) {
                    TextPaint textPaint4 = org.telegram.ui.ActionBar.j6.B0[r2Var4.E0];
                    int v05 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Z8, f6Var2);
                    textPaint4.linkColor = v05;
                    textPaint4.setColor(v05);
                } else {
                    TextPaint textPaint5 = org.telegram.ui.ActionBar.j6.B0[r2Var4.E0];
                    int v06 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.X8, f6Var2);
                    textPaint5.linkColor = v06;
                    textPaint5.setColor(v06);
                }
                canvas3.save();
                canvas3.translate(r2Var4.x2 + r2Var4.B2, dp3);
                wh.h.f(canvas3, r2Var4.z2);
                StaticLayout staticLayout3 = r2Var4.z2;
                z18 = z28;
                o2Var2 = o2Var;
                i20 = 1;
                i21 = -1;
                org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas3, staticLayout3, r2Var4.p3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, r2Var4.K(0, staticLayout3.getPaint().getColor()));
                canvas3.restore();
                if (r2Var4.D2 && !r2Var4.A2) {
                    canvas3.save();
                    if (r2Var4.C2) {
                        canvas3.translate(r2Var4.x2, 0.0f);
                        canvas3.drawRect(0.0f, 0.0f, AndroidUtilities.dp(f22), r2Var4.getMeasuredHeight(), r2Var4.E2);
                    } else {
                        canvas3.translate((r2Var4.x2 + r2Var4.y2) - AndroidUtilities.dp(f22), 0.0f);
                        canvas3.drawRect(0.0f, 0.0f, AndroidUtilities.dp(f22), r2Var4.getMeasuredHeight(), r2Var4.F2);
                    }
                    canvas3.restore();
                    canvas3.restore();
                }
            } else {
                i19 = i18;
                z18 = z28;
                o2Var2 = o2Var;
                i20 = 1;
                f22 = 24.0f;
                i21 = -1;
            }
            if (r2Var4.N2 != null && r2Var4.J0 == 0) {
                canvas3.save();
                canvas3.translate(r2Var4.L2, r2Var4.M2);
                TextPaint timeTextPaint = r2Var4.getTimeTextPaint();
                if (r2Var4.getIsPinned()) {
                    canvas3.translate(AndroidUtilities.dp(20.0f), 0.0f);
                    float height = (r2Var4.N2.getHeight() / f21) - AndroidUtilities.dp(8.5f);
                    float f35 = -AndroidUtilities.dp(20.0f);
                    float dp4 = AndroidUtilities.dp(6.0f) + r2Var4.N2.getWidth();
                    Drawable drawable = (!r2Var4.G3 || r2Var4.N()) ? org.telegram.ui.ActionBar.j6.k1 : org.telegram.ui.ActionBar.j6.l1;
                    int dp5 = (int) (((AndroidUtilities.dp(17.0f) - drawable.getIntrinsicHeight()) / f21) + height);
                    int dp6 = AndroidUtilities.dp(4.0f) + ((int) f35);
                    drawable.setBounds(dp6, dp5, drawable.getIntrinsicWidth() + dp6, drawable.getIntrinsicHeight() + dp5);
                    int alpha = timeTextPaint.getAlpha();
                    timeTextPaint.setAlpha(27);
                    canvas3.drawRoundRect(f35, height, dp4, height + AndroidUtilities.dp(17.0f), AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), timeTextPaint);
                    timeTextPaint.setAlpha(alpha);
                    drawable.draw(canvas3);
                }
                int color = r2Var4.N2.getPaint().getColor();
                boolean z29 = color != timeTextPaint.getColor();
                if (z29) {
                    r2Var4.N2.getPaint().setColor(timeTextPaint.getColor());
                }
                wh.h.f(canvas3, r2Var4.N2);
                if (z29) {
                    r2Var4.N2.getPaint().setColor(color);
                }
                canvas3.restore();
            }
            if (r2Var4.F()) {
                org.telegram.ui.ActionBar.j6.b1.setBounds(r2Var4.O2, ((r2Var4.N2.getHeight() - org.telegram.ui.ActionBar.j6.b1.getIntrinsicHeight()) / 2) + r2Var4.M2, org.telegram.ui.ActionBar.j6.b1.getIntrinsicWidth() + r2Var4.O2, org.telegram.ui.ActionBar.j6.b1.getIntrinsicHeight() + ((r2Var4.N2.getHeight() - org.telegram.ui.ActionBar.j6.b1.getIntrinsicHeight()) / 2) + r2Var4.M2);
                org.telegram.ui.ActionBar.j6.b1.draw(canvas3);
            }
            if (r2Var4.s3 != null && !r2Var4.Q()) {
                if (r2Var4.J0 != 0) {
                    TextPaint textPaint6 = org.telegram.ui.ActionBar.j6.G0;
                    int v07 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.n9, f6Var2);
                    textPaint6.linkColor = v07;
                    textPaint6.setColor(v07);
                } else if (r2Var4.l2 != null) {
                    TextPaint textPaint7 = org.telegram.ui.ActionBar.j6.G0;
                    int v08 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j9, f6Var2);
                    textPaint7.linkColor = v08;
                    textPaint7.setColor(v08);
                } else {
                    TextPaint textPaint8 = org.telegram.ui.ActionBar.j6.G0;
                    int v09 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.m9, f6Var2);
                    textPaint8.linkColor = v09;
                    textPaint8.setColor(v09);
                }
                canvas3.save();
                canvas3.translate(r2Var4.r3, r2Var4.q3);
                try {
                    wh.h.f(canvas3, r2Var4.s3);
                    StaticLayout staticLayout4 = r2Var4.s3;
                    org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas3, staticLayout4, r2Var4.n3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, r2Var4.K(i20, staticLayout4.getPaint().getColor()));
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                canvas3.restore();
            }
            if (r2Var4.e3 != null) {
                if (r2Var4.J0 == 0) {
                    TextPaint textPaint9 = org.telegram.ui.ActionBar.j6.F0[r2Var4.E0];
                    int v010 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.g9, f6Var2);
                    textPaint9.linkColor = v010;
                    textPaint9.setColor(v010);
                } else if (r2Var4.g2 != null) {
                    TextPaint textPaint10 = org.telegram.ui.ActionBar.j6.F0[r2Var4.E0];
                    int v011 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.l9, f6Var2);
                    textPaint10.linkColor = v011;
                    textPaint10.setColor(v011);
                } else {
                    TextPaint textPaint11 = org.telegram.ui.ActionBar.j6.F0[r2Var4.E0];
                    int v012 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h9, f6Var2);
                    textPaint11.linkColor = v012;
                    textPaint11.setColor(v012);
                }
                float dp7 = AndroidUtilities.dp(14.0f);
                o2 o2Var5 = o2Var2;
                float f36 = o2Var5.m ? r2Var4.a3 - (o2Var5.l * dp7) : r2Var4.a3 + (o2Var5.l * dp7);
                if (((!z18 && !SharedConfig.useThreeLinesLayout) || r2Var4.Q()) && r2Var4.M()) {
                    f36 -= AndroidUtilities.dp(r2Var4.Q() ? 10.0f : 11.0f);
                }
                if (o2Var5.l != 1.0f) {
                    canvas3.save();
                    canvas3.translate(r2Var4.b3, f36);
                    int alpha2 = r2Var4.e3.getPaint().getAlpha();
                    r2Var4.e3.getPaint().setAlpha((int) ((1.0f - o2Var5.l) * alpha2));
                    ArrayList arrayList = r2Var4.j3;
                    if (arrayList.isEmpty()) {
                        f26 = dp7;
                        rectF = rectF2;
                        f6Var4 = f6Var2;
                        l2Var4 = l2Var3;
                        f23 = 1.0f;
                        o2Var3 = o2Var5;
                        i25 = alpha2;
                        wh.h.f(canvas3, r2Var4.e3);
                        StaticLayout staticLayout5 = r2Var4.e3;
                        org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas3, staticLayout5, r2Var4.m3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, r2Var4.K(2, staticLayout5.getPaint().getColor()));
                    } else {
                        try {
                            canvas3.save();
                            wh.h.d(canvas3, arrayList);
                            wh.h.f(canvas3, r2Var4.e3);
                            try {
                                StaticLayout staticLayout6 = r2Var4.e3;
                                try {
                                    l2Var4 = l2Var3;
                                    i25 = alpha2;
                                    f6Var4 = f6Var2;
                                    f26 = dp7;
                                    f23 = 1.0f;
                                    rectF = rectF2;
                                    o2Var3 = o2Var5;
                                } catch (Exception e10) {
                                    e = e10;
                                    f26 = dp7;
                                    rectF = rectF2;
                                    f6Var4 = f6Var2;
                                    l2Var4 = l2Var3;
                                    o2Var3 = o2Var5;
                                    f23 = 1.0f;
                                    i25 = alpha2;
                                    FileLog.e(e);
                                    r2Var4.e3.getPaint().setAlpha(i25);
                                    canvas3.restore();
                                    canvas3.save();
                                    if (!o2Var3.m) {
                                    }
                                    if (!z18) {
                                        z24 -= AndroidUtilities.dp(r2Var4.Q() ? 10.0f : 11.0f);
                                        canvas3.translate(r2Var4.d3, z24);
                                        staticLayout2 = r2Var4.f3;
                                        if (staticLayout2 != null) {
                                            int alpha3 = staticLayout2.getPaint().getAlpha();
                                            r2Var4.f3.getPaint().setAlpha((int) (alpha3 * o2Var3.l));
                                            r2Var4.f3.draw(canvas3);
                                            r2Var4.f3.getPaint().setAlpha(alpha3);
                                        }
                                        canvas3.restore();
                                        if (r2Var4.f3 != null) {
                                            if (i24 < 0) {
                                            }
                                            t02 = org.telegram.ui.ActionBar.j6.t0(i24);
                                            if (t02 != null) {
                                            }
                                        }
                                        if (r2Var4.h3 != null) {
                                        }
                                        if (r2Var4.J0 == 0) {
                                        }
                                        float f37 = 12.5f;
                                        if (r2Var3.g4) {
                                        }
                                        f6Var3 = f6Var4;
                                        if (r2Var3.b1) {
                                        }
                                        if (r2Var3.j1 != 2) {
                                        }
                                        i16 = 17;
                                        if (!r2Var3.f4) {
                                        }
                                        z13 = false;
                                        if (!r2Var3.y3) {
                                        }
                                        if (!LocaleController.isRTL) {
                                        }
                                        org.telegram.ui.ActionBar.j6.Z0.setAlpha((int) (r2Var3.x3 * 255.0f));
                                        a0.o(r2Var3.D3, r2Var3.C3, org.telegram.ui.ActionBar.j6.Z0);
                                        org.telegram.ui.ActionBar.j6.Z0.draw(canvas3);
                                        float f38 = r2Var3.O3.e;
                                        if (r2Var3.t3) {
                                        }
                                        r2Var = r2Var3;
                                        f17 = 1.0f;
                                        if (r2Var.R1 > 0) {
                                        }
                                        gsVar = r2Var.t0;
                                        if (gsVar != null) {
                                        }
                                        i22 = i19;
                                        r12 = z19;
                                        if (i22 != -1) {
                                        }
                                        z15 = r2Var.b2;
                                        imageReceiver = r2Var.Y1;
                                        if (z15) {
                                        }
                                        z16 = r2Var.x;
                                        j2Var = r2Var.u0;
                                        if (z16) {
                                            if (!r2Var.y) {
                                            }
                                            if (!r2Var.O0) {
                                                float centerX = j2Var.F.centerX() + AndroidUtilities.dp(20.33f);
                                                float centerY = j2Var.F.centerY() + AndroidUtilities.dp(19.0f);
                                                if (r2Var.D0 == null) {
                                                }
                                                yf.p.d(r2Var.D0, centerX, centerY, i16);
                                                canvas3.drawCircle(r2Var.D0.getBounds().exactCenterX(), r2Var.D0.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.j6.l0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var3)));
                                                r2Var.D0.draw(canvas3);
                                            }
                                        }
                                        if (r2Var.b2) {
                                        }
                                        if (imageReceiver.getVisible()) {
                                            z14 = true;
                                        }
                                        if (r2Var.i0 > 0.0f) {
                                        }
                                        r2Var2 = r2Var;
                                        if (r2Var2.C0 != 0.0f) {
                                        }
                                        if (r2Var2.w1 != 0.0f) {
                                        }
                                        if (z11) {
                                            canvas3.save();
                                            canvas3.translate(0.0f, (-r2Var2.E3) - (r2Var2.n * r2Var2.i0));
                                            canvas3.clipRect(0.0f, (f17 - r2Var2.e2.J) * r2Var2.getMeasuredHeight(), r2Var2.getMeasuredWidth(), r2Var2.getMeasuredHeight());
                                            r2Var2.e2.c(canvas3, r12);
                                            canvas3.restore();
                                        }
                                        if (r2Var2.s2) {
                                        }
                                        f18 = 0.0f;
                                        if (r2Var2.t1 != f18) {
                                        }
                                        canvas2 = canvas;
                                        if (z26) {
                                        }
                                        z17 = r2Var2.y3;
                                        if (!z17) {
                                        }
                                        if (z17) {
                                        }
                                        z14 = true;
                                        if (r2Var2.m1) {
                                        }
                                    }
                                    z24 -= AndroidUtilities.dp(r2Var4.Q() ? 10.0f : 11.0f);
                                    canvas3.translate(r2Var4.d3, z24);
                                    staticLayout2 = r2Var4.f3;
                                    if (staticLayout2 != null) {
                                    }
                                    canvas3.restore();
                                    if (r2Var4.f3 != null) {
                                    }
                                    if (r2Var4.h3 != null) {
                                    }
                                    if (r2Var4.J0 == 0) {
                                    }
                                    float f372 = 12.5f;
                                    if (r2Var3.g4) {
                                    }
                                    f6Var3 = f6Var4;
                                    if (r2Var3.b1) {
                                    }
                                    if (r2Var3.j1 != 2) {
                                    }
                                    i16 = 17;
                                    if (!r2Var3.f4) {
                                    }
                                    z13 = false;
                                    if (!r2Var3.y3) {
                                    }
                                    if (!LocaleController.isRTL) {
                                    }
                                    org.telegram.ui.ActionBar.j6.Z0.setAlpha((int) (r2Var3.x3 * 255.0f));
                                    a0.o(r2Var3.D3, r2Var3.C3, org.telegram.ui.ActionBar.j6.Z0);
                                    org.telegram.ui.ActionBar.j6.Z0.draw(canvas3);
                                    float f382 = r2Var3.O3.e;
                                    if (r2Var3.t3) {
                                    }
                                    r2Var = r2Var3;
                                    f17 = 1.0f;
                                    if (r2Var.R1 > 0) {
                                    }
                                    gsVar = r2Var.t0;
                                    if (gsVar != null) {
                                    }
                                    i22 = i19;
                                    r12 = z19;
                                    if (i22 != -1) {
                                    }
                                    z15 = r2Var.b2;
                                    imageReceiver = r2Var.Y1;
                                    if (z15) {
                                    }
                                    z16 = r2Var.x;
                                    j2Var = r2Var.u0;
                                    if (z16) {
                                    }
                                    if (r2Var.b2) {
                                    }
                                    if (imageReceiver.getVisible()) {
                                    }
                                    if (r2Var.i0 > 0.0f) {
                                    }
                                    r2Var2 = r2Var;
                                    if (r2Var2.C0 != 0.0f) {
                                    }
                                    if (r2Var2.w1 != 0.0f) {
                                    }
                                    if (z11) {
                                    }
                                    if (r2Var2.s2) {
                                    }
                                    f18 = 0.0f;
                                    if (r2Var2.t1 != f18) {
                                    }
                                    canvas2 = canvas;
                                    if (z26) {
                                    }
                                    z17 = r2Var2.y3;
                                    if (!z17) {
                                    }
                                    if (z17) {
                                    }
                                    z14 = true;
                                    if (r2Var2.m1) {
                                    }
                                }
                                try {
                                    org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas3, staticLayout6, r2Var4.m3, -0.075f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, r2Var4.K(2, staticLayout6.getPaint().getColor()));
                                    canvas3.restore();
                                    for (int i32 = 0; i32 < arrayList.size(); i32++) {
                                        wh.h hVar = (wh.h) arrayList.get(i32);
                                        hVar.h(r2Var4.e3.getPaint().getColor());
                                        hVar.draw(canvas3);
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    FileLog.e(e);
                                    r2Var4.e3.getPaint().setAlpha(i25);
                                    canvas3.restore();
                                    canvas3.save();
                                    if (!o2Var3.m) {
                                    }
                                    if (!z18) {
                                    }
                                    z24 -= AndroidUtilities.dp(r2Var4.Q() ? 10.0f : 11.0f);
                                    canvas3.translate(r2Var4.d3, z24);
                                    staticLayout2 = r2Var4.f3;
                                    if (staticLayout2 != null) {
                                    }
                                    canvas3.restore();
                                    if (r2Var4.f3 != null) {
                                    }
                                    if (r2Var4.h3 != null) {
                                    }
                                    if (r2Var4.J0 == 0) {
                                    }
                                    float f3722 = 12.5f;
                                    if (r2Var3.g4) {
                                    }
                                    f6Var3 = f6Var4;
                                    if (r2Var3.b1) {
                                    }
                                    if (r2Var3.j1 != 2) {
                                    }
                                    i16 = 17;
                                    if (!r2Var3.f4) {
                                    }
                                    z13 = false;
                                    if (!r2Var3.y3) {
                                    }
                                    if (!LocaleController.isRTL) {
                                    }
                                    org.telegram.ui.ActionBar.j6.Z0.setAlpha((int) (r2Var3.x3 * 255.0f));
                                    a0.o(r2Var3.D3, r2Var3.C3, org.telegram.ui.ActionBar.j6.Z0);
                                    org.telegram.ui.ActionBar.j6.Z0.draw(canvas3);
                                    float f3822 = r2Var3.O3.e;
                                    if (r2Var3.t3) {
                                    }
                                    r2Var = r2Var3;
                                    f17 = 1.0f;
                                    if (r2Var.R1 > 0) {
                                    }
                                    gsVar = r2Var.t0;
                                    if (gsVar != null) {
                                    }
                                    i22 = i19;
                                    r12 = z19;
                                    if (i22 != -1) {
                                    }
                                    z15 = r2Var.b2;
                                    imageReceiver = r2Var.Y1;
                                    if (z15) {
                                    }
                                    z16 = r2Var.x;
                                    j2Var = r2Var.u0;
                                    if (z16) {
                                    }
                                    if (r2Var.b2) {
                                    }
                                    if (imageReceiver.getVisible()) {
                                    }
                                    if (r2Var.i0 > 0.0f) {
                                    }
                                    r2Var2 = r2Var;
                                    if (r2Var2.C0 != 0.0f) {
                                    }
                                    if (r2Var2.w1 != 0.0f) {
                                    }
                                    if (z11) {
                                    }
                                    if (r2Var2.s2) {
                                    }
                                    f18 = 0.0f;
                                    if (r2Var2.t1 != f18) {
                                    }
                                    canvas2 = canvas;
                                    if (z26) {
                                    }
                                    z17 = r2Var2.y3;
                                    if (!z17) {
                                    }
                                    if (z17) {
                                    }
                                    z14 = true;
                                    if (r2Var2.m1) {
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                                f26 = dp7;
                                rectF = rectF2;
                                f6Var4 = f6Var2;
                                l2Var4 = l2Var3;
                                f23 = 1.0f;
                                o2Var3 = o2Var5;
                                i25 = alpha2;
                                FileLog.e(e);
                                r2Var4.e3.getPaint().setAlpha(i25);
                                canvas3.restore();
                                canvas3.save();
                                if (!o2Var3.m) {
                                }
                                if (!z18) {
                                }
                                z24 -= AndroidUtilities.dp(r2Var4.Q() ? 10.0f : 11.0f);
                                canvas3.translate(r2Var4.d3, z24);
                                staticLayout2 = r2Var4.f3;
                                if (staticLayout2 != null) {
                                }
                                canvas3.restore();
                                if (r2Var4.f3 != null) {
                                }
                                if (r2Var4.h3 != null) {
                                }
                                if (r2Var4.J0 == 0) {
                                }
                                float f37222 = 12.5f;
                                if (r2Var3.g4) {
                                }
                                f6Var3 = f6Var4;
                                if (r2Var3.b1) {
                                }
                                if (r2Var3.j1 != 2) {
                                }
                                i16 = 17;
                                if (!r2Var3.f4) {
                                }
                                z13 = false;
                                if (!r2Var3.y3) {
                                }
                                if (!LocaleController.isRTL) {
                                }
                                org.telegram.ui.ActionBar.j6.Z0.setAlpha((int) (r2Var3.x3 * 255.0f));
                                a0.o(r2Var3.D3, r2Var3.C3, org.telegram.ui.ActionBar.j6.Z0);
                                org.telegram.ui.ActionBar.j6.Z0.draw(canvas3);
                                float f38222 = r2Var3.O3.e;
                                if (r2Var3.t3) {
                                }
                                r2Var = r2Var3;
                                f17 = 1.0f;
                                if (r2Var.R1 > 0) {
                                }
                                gsVar = r2Var.t0;
                                if (gsVar != null) {
                                }
                                i22 = i19;
                                r12 = z19;
                                if (i22 != -1) {
                                }
                                z15 = r2Var.b2;
                                imageReceiver = r2Var.Y1;
                                if (z15) {
                                }
                                z16 = r2Var.x;
                                j2Var = r2Var.u0;
                                if (z16) {
                                }
                                if (r2Var.b2) {
                                }
                                if (imageReceiver.getVisible()) {
                                }
                                if (r2Var.i0 > 0.0f) {
                                }
                                r2Var2 = r2Var;
                                if (r2Var2.C0 != 0.0f) {
                                }
                                if (r2Var2.w1 != 0.0f) {
                                }
                                if (z11) {
                                }
                                if (r2Var2.s2) {
                                }
                                f18 = 0.0f;
                                if (r2Var2.t1 != f18) {
                                }
                                canvas2 = canvas;
                                if (z26) {
                                }
                                z17 = r2Var2.y3;
                                if (!z17) {
                                }
                                if (z17) {
                                }
                                z14 = true;
                                if (r2Var2.m1) {
                                }
                            }
                        } catch (Exception e13) {
                            e = e13;
                            f26 = dp7;
                        }
                    }
                    r2Var4.e3.getPaint().setAlpha(i25);
                    canvas3.restore();
                } else {
                    f26 = dp7;
                    rectF = rectF2;
                    f6Var4 = f6Var2;
                    l2Var4 = l2Var3;
                    f23 = 1.0f;
                    o2Var3 = o2Var5;
                }
                canvas3.save();
                z24 = !o2Var3.m ? com.google.android.gms.internal.vision.e2.z(f23, o2Var3.l, f26, r2Var4.a3) : com.google.android.gms.internal.vision.e2.b(f23, o2Var3.l, f26, r2Var4.a3);
                if (((!z18 && !SharedConfig.useThreeLinesLayout) || r2Var4.Q()) && r2Var4.M()) {
                    z24 -= AndroidUtilities.dp(r2Var4.Q() ? 10.0f : 11.0f);
                }
                canvas3.translate(r2Var4.d3, z24);
                staticLayout2 = r2Var4.f3;
                if (staticLayout2 != null && o2Var3.l > 0.0f) {
                    int alpha32 = staticLayout2.getPaint().getAlpha();
                    r2Var4.f3.getPaint().setAlpha((int) (alpha32 * o2Var3.l));
                    r2Var4.f3.draw(canvas3);
                    r2Var4.f3.getPaint().setAlpha(alpha32);
                }
                canvas3.restore();
                if (r2Var4.f3 != null && ((i24 = r2Var4.j2) >= 0 || (o2Var3.l > 0.0f && o2Var3.n >= 0))) {
                    if (i24 < 0) {
                        i24 = o2Var3.n;
                    }
                    t02 = org.telegram.ui.ActionBar.j6.t0(i24);
                    if (t02 != null) {
                        canvas3.save();
                        t02.b(i0.a.k(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.p9), (int) (Color.alpha(r4) * o2Var3.l)));
                        float z30 = o2Var3.m ? com.google.android.gms.internal.vision.e2.z(f23, o2Var3.l, f26, r2Var4.a3) : com.google.android.gms.internal.vision.e2.b(f23, o2Var3.l, f26, r2Var4.a3);
                        if (((!z18 && !SharedConfig.useThreeLinesLayout) || r2Var4.Q()) && r2Var4.M()) {
                            z30 -= AndroidUtilities.dp(r2Var4.Q() ? 10.0f : 11.0f);
                        }
                        if (i24 == 1 || i24 == 4) {
                            canvas3.translate(r2Var4.y4, z30 + (i24 == 1 ? AndroidUtilities.dp(f23) : 0));
                        } else {
                            canvas3.translate(r2Var4.y4, ((AndroidUtilities.dp(18.0f) - t02.getIntrinsicHeight()) / f21) + z30);
                        }
                        t02.draw(canvas3);
                        r2Var4.invalidate();
                        canvas3.restore();
                    }
                }
            } else {
                rectF = rectF2;
                f6Var4 = f6Var2;
                l2Var4 = l2Var3;
                o2Var3 = o2Var2;
                f23 = 1.0f;
            }
            if (r2Var4.h3 != null) {
                canvas3.save();
                if (r2Var4.b0 == null) {
                    r2Var4.b0 = new Paint(1);
                }
                if (r2Var4.c0 == null) {
                    gd gdVar = new gd(r2Var4);
                    r2Var4.c0 = gdVar;
                    z23 = false;
                    final boolean z31 = false ? 1 : 0;
                    gdVar.e(new Runnable(r2Var4) { // from class: org.telegram.ui.Cells.h2
                        public final /* synthetic */ r2 b;

                        {
                            this.b = r2Var4;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (z31) {
                                case 0:
                                    r2 r2Var5 = this.b;
                                    n2 n2Var = r2Var5.d0;
                                    if (n2Var != null) {
                                        n2Var.d(r2Var5);
                                        break;
                                    }
                                    break;
                                default:
                                    r2 r2Var6 = this.b;
                                    n2 n2Var2 = r2Var6.d0;
                                    if (n2Var2 != null) {
                                        n2Var2.a(r2Var6);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    gd gdVar2 = r2Var4.c0;
                    final int i33 = 1;
                    Runnable runnable = new Runnable(r2Var4) { // from class: org.telegram.ui.Cells.h2
                        public final /* synthetic */ r2 b;

                        {
                            this.b = r2Var4;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i33) {
                                case 0:
                                    r2 r2Var5 = this.b;
                                    n2 n2Var = r2Var5.d0;
                                    if (n2Var != null) {
                                        n2Var.d(r2Var5);
                                        break;
                                    }
                                    break;
                                default:
                                    r2 r2Var6 = this.b;
                                    n2 n2Var2 = r2Var6.d0;
                                    if (n2Var2 != null) {
                                        n2Var2.a(r2Var6);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    gdVar2.l = true;
                    gdVar2.j = runnable;
                } else {
                    z23 = false;
                }
                if (r2Var4.f0 && r2Var4.I4 != 0 && ((i23 = r2Var4.j1) == 0 || i23 == 7 || i23 == 8)) {
                    r2Var4.c0.d(i0.a.k(r2Var4.a0.getColor(), org.telegram.ui.ActionBar.j6.e1() ? 36 : 26));
                    gd gdVar3 = r2Var4.c0;
                    gdVar3.i = z23;
                    gdVar3.c = z23 ? 1 : 0;
                    int i34 = r2Var4.I4;
                    if (i34 != 0 && i34 > 0) {
                        float f39 = r2Var4.a3;
                        if (((!z18 && !SharedConfig.useThreeLinesLayout) || r2Var4.Q()) && r2Var4.M()) {
                            f39 -= AndroidUtilities.dp(r2Var4.Q() ? 10.0f : 11.0f);
                        }
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        float primaryHorizontal = r2Var4.e3.getPrimaryHorizontal(z23 ? 1 : 0) + AndroidUtilities.dp(f21) + r2Var4.b3;
                        float f40 = r2Var4.b3;
                        StaticLayout staticLayout7 = r2Var4.e3;
                        rectF3.set(primaryHorizontal, f39, (staticLayout7.getPrimaryHorizontal(Math.min(staticLayout7.getText().length(), r2Var4.I4)) + f40) - AndroidUtilities.dp(3.0f), r2Var4.g3 - AndroidUtilities.dp(4.0f));
                        rectF3.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
                        if (rectF3.right > rectF3.left) {
                            r2Var4.c0.a(rectF3);
                        }
                    }
                    float lineLeft = r2Var4.h3.getLineLeft(z23 ? 1 : 0);
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.set(r2Var4.c3 + lineLeft + AndroidUtilities.dp(f21), AndroidUtilities.dp(f21) + r2Var4.g3, r2Var4.h3.getLineWidth(z23 ? 1 : 0) + r2Var4.c3 + lineLeft + AndroidUtilities.dp(12.0f), r2Var4.h3.getHeight() + r2Var4.g3);
                    rectF4.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(3.0f));
                    r2Var4.c0.a(rectF4);
                    gd gdVar4 = r2Var4.c0;
                    gdVar4.c(canvas3, gdVar4.g);
                    z zVar = gdVar4.e;
                    if (zVar != null) {
                        zVar.draw(canvas3);
                    }
                    org.telegram.ui.ActionBar.j6.t1.setAlpha(125);
                    a0.p(org.telegram.ui.ActionBar.j6.t1, rectF4.right - AndroidUtilities.dp(18.0f), com.google.android.gms.internal.vision.e2.A(rectF4.height(), org.telegram.ui.ActionBar.j6.t1.getIntrinsicHeight(), 2.0f, rectF4.top));
                    org.telegram.ui.ActionBar.j6.t1.draw(canvas3);
                }
                canvas3.translate(r2Var4.c3, r2Var4.g3);
                ArrayList arrayList2 = r2Var4.l3;
                if (arrayList2.isEmpty()) {
                    wh.h.f(canvas3, r2Var4.h3);
                    StaticLayout staticLayout8 = r2Var4.h3;
                    org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas3, staticLayout8, r2Var4.o3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, r2Var4.K(3, staticLayout8.getPaint().getColor()));
                } else {
                    try {
                        canvas3.save();
                        wh.h.d(canvas3, arrayList2);
                        wh.h.f(canvas3, r2Var4.h3);
                        StaticLayout staticLayout9 = r2Var4.h3;
                        org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas3, staticLayout9, r2Var4.o3, -0.075f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, r2Var4.K(3, staticLayout9.getPaint().getColor()));
                        canvas3.restore();
                        for (int i35 = 0; i35 < arrayList2.size(); i35++) {
                            wh.h hVar2 = (wh.h) arrayList2.get(i35);
                            hVar2.h(r2Var4.h3.getPaint().getColor());
                            hVar2.draw(canvas3);
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
            if (r2Var4.J0 == 0) {
                int i36 = (r2Var4.S2 ? 1 : 0) + (r2Var4.Q2 ? 2 : 0) + (r2Var4.R2 ? 4 : 0);
                int i37 = r2Var4.t4;
                if (i37 >= 0 && i37 != i36 && !r2Var4.v4) {
                    r2Var4.A(i37, i36);
                }
                boolean z32 = r2Var4.v4;
                if (z32) {
                    i36 = r2Var4.r4;
                }
                boolean z33 = (i36 & 1) != 0;
                boolean z34 = (i36 & 2) != 0;
                boolean z35 = (i36 & 4) != 0;
                if (z32) {
                    int i38 = r2Var4.s4;
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
                        boolean z38 = z34;
                        boolean z39 = z37;
                        canvas3 = canvas;
                        r2Var4.C(canvas3, z36, z39, z22, false, f23 - r2Var4.u4);
                        r2Var4.C(canvas3, z33, z38, z21, false, r2Var4.u4);
                        r2Var3 = this;
                        r2Var3.t4 = (r2Var3.S2 ? 1 : 0) + (!r2Var3.Q2 ? 2 : 0) + (!r2Var3.R2 ? 4 : 0);
                    } else {
                        canvas3 = canvas;
                        r2Var4.C(canvas3, z33, z34, z21, true, r2Var4.u4);
                    }
                } else {
                    r2Var4 = this;
                    canvas3 = canvas;
                    r2Var4.C(canvas3, z33, z34, z35, false, 1.0f);
                }
                r2Var3 = r2Var4;
                r2Var3.t4 = (r2Var3.S2 ? 1 : 0) + (!r2Var3.Q2 ? 2 : 0) + (!r2Var3.R2 ? 4 : 0);
            } else {
                canvas3 = canvas;
                r2Var3 = r2Var4;
            }
            float f372222 = 12.5f;
            if (r2Var3.g4) {
                int dp8 = AndroidUtilities.dp((z18 || SharedConfig.useThreeLinesLayout) ? 12.5f : 15.5f);
                if (((!z18 && !SharedConfig.useThreeLinesLayout) || r2Var3.Q()) && r2Var3.M()) {
                    dp8 -= AndroidUtilities.dp(9.0f);
                }
                org.telegram.ui.Components.o5 o5Var = r2Var3.k4;
                if (o5Var != null) {
                    o5Var.setBounds(r2Var3.x2 - AndroidUtilities.dp(19.0f), AndroidUtilities.dp(-1.0f) + dp8, r2Var3.x2 - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f) + dp8);
                    f6Var3 = f6Var4;
                    o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z9, f6Var3)));
                    o5Var.draw(canvas3);
                    boolean z40 = !r2Var3.b1 || r2Var3.Z0 || r2Var3.Q0;
                    if (r2Var3.j1 != 2 || ((!z40 && r2Var3.c1 <= 0.0f) || r2Var3.f4 || r2Var3.l4 != 0)) {
                        i16 = 17;
                    } else {
                        if (z40) {
                            float f41 = r2Var3.c1;
                            if (f41 != f23) {
                                float f42 = f41 + 0.10666667f;
                                r2Var3.c1 = f42;
                                if (f42 > f23) {
                                    r2Var3.c1 = f23;
                                } else {
                                    r2Var3.invalidate();
                                }
                                float dp9 = (!r2Var3.h4 ? r2Var3.I2 : r2Var3.H2) - AndroidUtilities.dp((!z18 || SharedConfig.useThreeLinesLayout) ? 0.0f : 1.0f);
                                float dp10 = AndroidUtilities.dp(!SharedConfig.useThreeLinesLayout ? 13.5f : 17.5f);
                                if (((!z18 && !SharedConfig.useThreeLinesLayout) || r2Var3.Q()) && r2Var3.M()) {
                                    dp10 -= AndroidUtilities.dp(r2Var3.Q() ? 8.0f : 9.0f);
                                }
                                a0.p(org.telegram.ui.ActionBar.j6.c1, dp9, dp10);
                                a0.p(org.telegram.ui.ActionBar.j6.d1, dp9, dp10);
                                i16 = 17;
                                yf.p.d(org.telegram.ui.ActionBar.j6.e1, org.telegram.ui.ActionBar.j6.c1.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.c1.getBounds().exactCenterY(), 17);
                                if (r2Var3.c1 != f23) {
                                    canvas3.save();
                                    float f43 = r2Var3.c1;
                                    canvas3.scale(f43, f43, org.telegram.ui.ActionBar.j6.c1.getBounds().centerX(), org.telegram.ui.ActionBar.j6.c1.getBounds().centerY());
                                    if (r2Var3.Q0) {
                                        org.telegram.ui.ActionBar.j6.e1.setAlpha((int) (r2Var3.c1 * 255.0f));
                                        org.telegram.ui.ActionBar.j6.e1.draw(canvas3);
                                        org.telegram.ui.ActionBar.j6.e1.setAlpha(255);
                                    } else if (r2Var3.b1) {
                                        org.telegram.ui.ActionBar.j6.d1.setAlpha((int) (r2Var3.c1 * 255.0f));
                                        org.telegram.ui.ActionBar.j6.d1.draw(canvas3);
                                        org.telegram.ui.ActionBar.j6.d1.setAlpha(255);
                                    } else {
                                        org.telegram.ui.ActionBar.j6.c1.setAlpha((int) (r2Var3.c1 * 255.0f));
                                        org.telegram.ui.ActionBar.j6.c1.draw(canvas3);
                                        org.telegram.ui.ActionBar.j6.c1.setAlpha(255);
                                    }
                                    canvas3.restore();
                                } else if (r2Var3.Q0) {
                                    org.telegram.ui.ActionBar.j6.e1.draw(canvas3);
                                } else if (r2Var3.b1) {
                                    org.telegram.ui.ActionBar.j6.d1.draw(canvas3);
                                } else {
                                    org.telegram.ui.ActionBar.j6.c1.draw(canvas3);
                                }
                            }
                        }
                        if (!z40) {
                            float f44 = r2Var3.c1;
                            if (f44 != 0.0f) {
                                float f45 = f44 - 0.10666667f;
                                r2Var3.c1 = f45;
                                if (f45 < 0.0f) {
                                    r2Var3.c1 = 0.0f;
                                } else {
                                    r2Var3.invalidate();
                                }
                            }
                        }
                        float dp92 = (!r2Var3.h4 ? r2Var3.I2 : r2Var3.H2) - AndroidUtilities.dp((!z18 || SharedConfig.useThreeLinesLayout) ? 0.0f : 1.0f);
                        float dp102 = AndroidUtilities.dp(!SharedConfig.useThreeLinesLayout ? 13.5f : 17.5f);
                        if (!z18) {
                            dp102 -= AndroidUtilities.dp(r2Var3.Q() ? 8.0f : 9.0f);
                            a0.p(org.telegram.ui.ActionBar.j6.c1, dp92, dp102);
                            a0.p(org.telegram.ui.ActionBar.j6.d1, dp92, dp102);
                            i16 = 17;
                            yf.p.d(org.telegram.ui.ActionBar.j6.e1, org.telegram.ui.ActionBar.j6.c1.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.c1.getBounds().exactCenterY(), 17);
                            if (r2Var3.c1 != f23) {
                            }
                        }
                        dp102 -= AndroidUtilities.dp(r2Var3.Q() ? 8.0f : 9.0f);
                        a0.p(org.telegram.ui.ActionBar.j6.c1, dp92, dp102);
                        a0.p(org.telegram.ui.ActionBar.j6.d1, dp92, dp102);
                        i16 = 17;
                        yf.p.d(org.telegram.ui.ActionBar.j6.e1, org.telegram.ui.ActionBar.j6.c1.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.c1.getBounds().exactCenterY(), 17);
                        if (r2Var3.c1 != f23) {
                        }
                    }
                    if (!r2Var3.f4) {
                        float dp11 = AndroidUtilities.dp((z18 || SharedConfig.useThreeLinesLayout) ? 13.5f : 16.5f);
                        if (((!z18 && !SharedConfig.useThreeLinesLayout) || r2Var3.Q()) && r2Var3.M()) {
                            dp11 -= AndroidUtilities.dp(9.0f);
                        }
                        a0.p(org.telegram.ui.ActionBar.j6.f1, r2Var3.H2 - AndroidUtilities.dp(f23), dp11);
                        a0.p(org.telegram.ui.ActionBar.j6.i1, r2Var3.H2 - AndroidUtilities.dp(f23), dp11);
                        org.telegram.ui.ActionBar.j6.f1.draw(canvas3);
                        org.telegram.ui.ActionBar.j6.i1.draw(canvas3);
                        ebVar2 = ebVar;
                    } else if (r2Var3.h4) {
                        int dp12 = AndroidUtilities.dp((z18 || SharedConfig.useThreeLinesLayout) ? 12.5f : 15.5f);
                        if (((!z18 && !SharedConfig.useThreeLinesLayout) || r2Var3.Q()) && r2Var3.M()) {
                            dp12 -= AndroidUtilities.dp(9.0f);
                        }
                        org.telegram.ui.Components.o5 o5Var2 = r2Var3.j4;
                        if (o5Var2 != null) {
                            ebVar2 = ebVar;
                            ebVar2.setTranslationX((f30 + r2Var3.H2) - AndroidUtilities.dp(2.0f));
                            ebVar2.setTranslationY((f16 + dp12) - AndroidUtilities.dp(4.0f));
                            if (r2Var3.i0 > 0.0f) {
                                o5Var2.setBounds(r2Var3.H2 - AndroidUtilities.dp(2.0f), dp12 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(20.0f) + r2Var3.H2, AndroidUtilities.dp(22.0f) + (dp12 - AndroidUtilities.dp(4.0f)));
                                o5Var2.draw(canvas3);
                                z20 = false;
                            } else {
                                z20 = true;
                            }
                            o5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z9, f6Var3)));
                            z13 = z20;
                            if (!r2Var3.y3 || r2Var3.x3 != 0.0f) {
                                if (!LocaleController.isRTL) {
                                    Paint paintReorderGradient = r2Var3.getPaintReorderGradient();
                                    paintReorderGradient.setAlpha((int) (r2Var3.x3 * 255.0f));
                                    canvas3.save();
                                    canvas3.translate(r2Var3.D3 - AndroidUtilities.dp(f22), r2Var3.C3);
                                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.w1.z(24.0f, r2Var3.D3, r2Var3.getMeasuredWidth()), AndroidUtilities.dp(24.0f), paintReorderGradient);
                                    canvas3 = canvas;
                                    canvas3.restore();
                                }
                                org.telegram.ui.ActionBar.j6.Z0.setAlpha((int) (r2Var3.x3 * 255.0f));
                                a0.o(r2Var3.D3, r2Var3.C3, org.telegram.ui.ActionBar.j6.Z0);
                                org.telegram.ui.ActionBar.j6.Z0.draw(canvas3);
                            }
                            float f382222 = r2Var3.O3.e;
                            if (r2Var3.t3) {
                                org.telegram.ui.ActionBar.j6.Y0.setAlpha((int) ((f23 - r2Var3.x3) * 255.0f));
                                RectF rectF5 = rectF;
                                rectF5.set(r2Var3.v3, r2Var3.u3, AndroidUtilities.dp(20.666f) + r0, AndroidUtilities.dp(20.666f) + r2Var3.u3);
                                float f46 = AndroidUtilities.density * 10.5f;
                                canvas3.drawRoundRect(rectF5, f46, f46, org.telegram.ui.ActionBar.j6.x0);
                                a0.o(AndroidUtilities.dp(4.5f) + r2Var3.v3, AndroidUtilities.dp(5.0f) + r2Var3.u3, org.telegram.ui.ActionBar.j6.Y0);
                                org.telegram.ui.ActionBar.j6.Y0.draw(canvas3);
                            } else {
                                RectF rectF6 = rectF;
                                if (((r2Var3.G3 || r2Var3.X3) && r2Var3.H3) || r2Var3.R3 != f23 || r2Var3.Y3 || r2Var3.S3 != f23 || r2Var3.Z3 || f382222 > 0.0f) {
                                    boolean N = r2Var3.N();
                                    f17 = 1.0f;
                                    canvas3 = canvas;
                                    D(canvas3, N, r2Var3.I3, r2Var3.J3, r2Var3.M3, 1.0f, false);
                                    r2Var = this;
                                    if (r2Var.X3) {
                                        org.telegram.ui.ActionBar.j6.w0.setAlpha((int) ((1.0f - r2Var.x3) * 255.0f));
                                        if (r2Var.e4 != null) {
                                            rectF6.set(r2Var.a4, r2Var.I3, AndroidUtilities.dp(12.666f) + r1 + r2Var.d4, AndroidUtilities.dp(20.666f) + r2Var.I3);
                                            canvas3.drawRoundRect(rectF6, rectF6.height() / 2.0f, rectF6.height() / 2.0f, (!N || r2Var.k1 == 0) ? org.telegram.ui.ActionBar.j6.w0 : org.telegram.ui.ActionBar.j6.y0);
                                            org.telegram.ui.ActionBar.j6.M0.setAlpha((int) ((1.0f - r2Var.x3) * 255.0f));
                                            canvas3.save();
                                            canvas3.translate(AndroidUtilities.dp(6.333f) + r2Var.a4, AndroidUtilities.dp(4.0f) + r2Var.I3);
                                            r2Var.e4.draw(canvas3);
                                            canvas3.restore();
                                        } else {
                                            Drawable drawable2 = org.telegram.ui.ActionBar.j6.m1;
                                            drawable2.setAlpha((int) ((1.0f - r2Var.x3) * 255.0f));
                                            yf.p.d(drawable2, AndroidUtilities.dp(10.333f) + r2Var.a4, AndroidUtilities.dp(10.333f) + r2Var.I3, i16);
                                            drawable2.draw(canvas3);
                                        }
                                    }
                                    if (r2Var.Y3 || r2Var.S3 != 1.0f) {
                                        f24 = 10.333f;
                                        rectF6.set(r2Var.b4, r2Var.I3, AndroidUtilities.dp(20.666f) + r1, AndroidUtilities.dp(20.666f) + r2Var.I3);
                                        float f47 = r2Var.S3;
                                        if (f47 == 1.0f) {
                                            f47 = 1.0f;
                                        } else if (!r2Var.Y3) {
                                            f47 = 1.0f - f47;
                                        }
                                        Drawable drawable3 = N ? org.telegram.ui.ActionBar.j6.q1 : org.telegram.ui.ActionBar.j6.n1;
                                        drawable3.setAlpha((int) ((1.0f - r2Var.x3) * 255.0f));
                                        yf.p.d(drawable3, AndroidUtilities.dp(10.333f) + r1, AndroidUtilities.dp(10.333f) + r2Var.I3, i16);
                                        yf.p.b(canvas3, drawable3, f47);
                                    } else {
                                        f24 = 10.333f;
                                    }
                                    if ((r2Var.Z3 || f382222 > 0.0f) && f382222 != 0.0f) {
                                        rectF6.set(r2Var.c4, r2Var.I3, AndroidUtilities.dp(20.666f) + r1, AndroidUtilities.dp(20.666f) + r2Var.I3);
                                        Drawable drawable4 = N ? org.telegram.ui.ActionBar.j6.r1 : org.telegram.ui.ActionBar.j6.o1;
                                        drawable4.setAlpha((int) ((1.0f - r2Var.x3) * 255.0f));
                                        yf.p.d(drawable4, AndroidUtilities.dp(f24) + r1, AndroidUtilities.dp(f24) + r2Var.I3, i16);
                                        yf.p.b(canvas3, drawable4, f382222);
                                    }
                                    if (r2Var.R1 > 0) {
                                        float f48 = o2Var3.l;
                                        if (f48 != f17) {
                                            if (f48 > 0.0f) {
                                                canvas.saveLayerAlpha(0.0f, 0.0f, r2Var.getWidth(), r2Var.getHeight(), (int) ((f17 - f48) * 255.0f), 31);
                                                canvas3 = canvas;
                                                if (o2Var3.m) {
                                                    dp = -AndroidUtilities.dp(14.0f);
                                                    f25 = o2Var3.l;
                                                } else {
                                                    dp = AndroidUtilities.dp(14.0f);
                                                    f25 = o2Var3.l;
                                                }
                                                canvas3.translate(0.0f, dp * f25);
                                            }
                                            int i39 = 0;
                                            while (i39 < r2Var.R1) {
                                                if (r2Var.U1[i39]) {
                                                    if (r2Var.T1 == null) {
                                                        Paint paint3 = new Paint(1);
                                                        r2Var.T1 = paint3;
                                                        paint3.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                                        r2Var.T1.setColor(z19 ? 1 : 0);
                                                    }
                                                    RectF rectF7 = AndroidUtilities.rectTmp;
                                                    ImageReceiver[] imageReceiverArr = r2Var.V1;
                                                    rectF7.set(imageReceiverArr[i39].getImageX(), imageReceiverArr[i39].getImageY(), imageReceiverArr[i39].getImageX2(), imageReceiverArr[i39].getImageY2());
                                                    imageReceiverArr[i39].draw(canvas3);
                                                    if (r2Var.X1[i39]) {
                                                        Path path = r2Var.v0;
                                                        if (path == null) {
                                                            r2Var.v0 = new Path();
                                                        } else {
                                                            path.rewind();
                                                        }
                                                        r2Var.v0.addRoundRect(rectF7, imageReceiverArr[i39].getRoundRadius()[z19 ? 1 : 0], imageReceiverArr[i39].getRoundRadius()[1], Path.Direction.CW);
                                                        canvas3.save();
                                                        canvas3.clipPath(r2Var.v0);
                                                        if (r2Var.w0 == null) {
                                                            r2Var.w0 = new wh.h();
                                                        }
                                                        r2Var.w0.h(i0.a.k(-1, (int) (Color.alpha(i21) * 0.325f)));
                                                        r2Var.w0.setBounds((int) imageReceiverArr[i39].getImageX(), (int) imageReceiverArr[i39].getImageY(), (int) imageReceiverArr[i39].getImageX2(), (int) imageReceiverArr[i39].getImageY2());
                                                        r2Var.w0.draw(canvas3);
                                                        r2Var.invalidate();
                                                        canvas3.restore();
                                                    }
                                                    if (r2Var.W1[i39]) {
                                                        a0.o((int) (imageReceiverArr[i39].getCenterX() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicWidth() / 2)), (int) (imageReceiverArr[i39].getCenterY() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicHeight() / 2)), org.telegram.ui.ActionBar.j6.U0);
                                                        org.telegram.ui.ActionBar.j6.U0.draw(canvas3);
                                                    }
                                                }
                                                i39++;
                                                i21 = -1;
                                            }
                                            if (o2Var3.l > 0.0f) {
                                                canvas3.restore();
                                            }
                                        }
                                    }
                                    gsVar = r2Var.t0;
                                    if (gsVar != null && !gsVar.b()) {
                                        canvas3.save();
                                        canvas3.translate(r2Var.Y2, (r2Var.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (r2Var.s2 ? 1 : 0));
                                        r2Var.t0.a(canvas3, r2Var.Z2 - r2Var.Y2);
                                        canvas3.restore();
                                    }
                                    i22 = i19;
                                    r12 = z19;
                                    if (i22 != -1) {
                                        canvas3.restoreToCount(i22);
                                        r12 = z19;
                                    }
                                } else {
                                    if (r2Var3.E1) {
                                        canvas3.save();
                                        float a2 = r2Var3.F1.a(0.05f);
                                        RectF rectF8 = r2Var3.H1;
                                        canvas3.scale(a2, a2, rectF8.centerX(), rectF8.centerY());
                                        r2Var3.G1.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var3));
                                        canvas3.drawRoundRect(rectF8, rectF8.height() / 2.0f, rectF8.height() / 2.0f, r2Var3.G1);
                                        f01 f01Var = r2Var3.I1;
                                        if (f01Var != null) {
                                            f01Var.c(rectF8.left + AndroidUtilities.dp(13.0f), rectF8.centerY(), 1.0f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var3), canvas);
                                        }
                                        canvas.restore();
                                    }
                                    canvas3 = canvas;
                                }
                            }
                            r2Var = r2Var3;
                            f17 = 1.0f;
                            if (r2Var.R1 > 0) {
                            }
                            gsVar = r2Var.t0;
                            if (gsVar != null) {
                                canvas3.save();
                                canvas3.translate(r2Var.Y2, (r2Var.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (r2Var.s2 ? 1 : 0));
                                r2Var.t0.a(canvas3, r2Var.Z2 - r2Var.Y2);
                                canvas3.restore();
                            }
                            i22 = i19;
                            r12 = z19;
                            if (i22 != -1) {
                            }
                        } else {
                            ebVar2 = ebVar;
                            Drawable drawable5 = sg.d1.d().e;
                            int dp13 = r2Var3.H2 - AndroidUtilities.dp(f23);
                            if (!z18 && !SharedConfig.useThreeLinesLayout) {
                                f372222 = 15.5f;
                            }
                            a0.o(dp13, AndroidUtilities.dp(f372222), drawable5);
                            drawable5.draw(canvas3);
                        }
                    } else {
                        ebVar2 = ebVar;
                        if (r2Var3.l4 != 0) {
                            int dp14 = AndroidUtilities.dp((z18 || SharedConfig.useThreeLinesLayout) ? 12.0f : 15.0f);
                            if (((!z18 && !SharedConfig.useThreeLinesLayout) || r2Var3.Q()) && r2Var3.M()) {
                                dp14 -= AndroidUtilities.dp(9.0f);
                            }
                            a0.o(r2Var3.H2, dp14, r2Var3.l4 == 1 ? org.telegram.ui.ActionBar.j6.g1 : org.telegram.ui.ActionBar.j6.h1);
                            (r2Var3.l4 == 1 ? org.telegram.ui.ActionBar.j6.g1 : org.telegram.ui.ActionBar.j6.h1).draw(canvas3);
                        }
                    }
                    z13 = false;
                    if (!r2Var3.y3) {
                    }
                    if (!LocaleController.isRTL) {
                    }
                    org.telegram.ui.ActionBar.j6.Z0.setAlpha((int) (r2Var3.x3 * 255.0f));
                    a0.o(r2Var3.D3, r2Var3.C3, org.telegram.ui.ActionBar.j6.Z0);
                    org.telegram.ui.ActionBar.j6.Z0.draw(canvas3);
                    float f3822222 = r2Var3.O3.e;
                    if (r2Var3.t3) {
                    }
                    r2Var = r2Var3;
                    f17 = 1.0f;
                    if (r2Var.R1 > 0) {
                    }
                    gsVar = r2Var.t0;
                    if (gsVar != null) {
                    }
                    i22 = i19;
                    r12 = z19;
                    if (i22 != -1) {
                    }
                }
            }
            f6Var3 = f6Var4;
            if (r2Var3.b1) {
            }
            if (r2Var3.j1 != 2) {
            }
            i16 = 17;
            if (!r2Var3.f4) {
            }
            z13 = false;
            if (!r2Var3.y3) {
            }
            if (!LocaleController.isRTL) {
            }
            org.telegram.ui.ActionBar.j6.Z0.setAlpha((int) (r2Var3.x3 * 255.0f));
            a0.o(r2Var3.D3, r2Var3.C3, org.telegram.ui.ActionBar.j6.Z0);
            org.telegram.ui.ActionBar.j6.Z0.draw(canvas3);
            float f38222222 = r2Var3.O3.e;
            if (r2Var3.t3) {
            }
            r2Var = r2Var3;
            f17 = 1.0f;
            if (r2Var.R1 > 0) {
            }
            gsVar = r2Var.t0;
            if (gsVar != null) {
            }
            i22 = i19;
            r12 = z19;
            if (i22 != -1) {
            }
        } else {
            r2Var = r2Var4;
            f6Var3 = f6Var2;
            l2Var4 = l2Var3;
            ebVar2 = ebVar;
            i16 = 17;
            r12 = 0;
            f17 = 1.0f;
            z13 = false;
            z14 = false;
        }
        z15 = r2Var.b2;
        imageReceiver = r2Var.Y1;
        if (z15) {
            canvas3.save();
            float interpolation2 = l2Var4.getInterpolation(r2Var.c2 / 170.0f) + f17;
            canvas3.scale(interpolation2, interpolation2, imageReceiver.getCenterX(), imageReceiver.getCenterY());
        }
        z16 = r2Var.x;
        j2Var = r2Var.u0;
        if (z16 && (!r2Var.P || (tL_forumTopic2 = r2Var.N) == null || tL_forumTopic2.id != 1 || (ii0Var = r2Var.e2) == null || !ii0Var.X || ii0Var.Y)) {
            if (!r2Var.y) {
                if (r2Var.Z1 == null) {
                    r2Var.Z1 = new qe0();
                }
                r2Var.Z1.a((int) j2Var.F.centerX(), (int) j2Var.F.centerY(), (int) (j2Var.F.width() / 2.0f));
                canvas3.save();
                canvas3.clipPath(r2Var.Z1);
                imageReceiver.setImageCoords(j2Var.F);
                imageReceiver.draw(canvas3);
                canvas3.restore();
            } else if (r2Var.E) {
                yf.p.f(imageReceiver, AndroidUtilities.dpf2(f17) + j2Var.F.centerX(), j2Var.F.centerY(), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
                yf.p.a(canvas3, org.telegram.ui.ActionBar.j6.S0, imageReceiver.getCenterX(), imageReceiver.getCenterY(), AndroidUtilities.dp(48.0f));
                imageReceiver.draw(canvas3);
            } else {
                boolean z41 = r2Var.F;
                j2Var.r = z41 || r2Var.J0 != 0;
                int i40 = j2Var.z;
                if (z41) {
                    j2Var.z = 1;
                }
                bi.p9.h(r2Var.H0, canvas3, imageReceiver, j2Var);
                if (j2Var.w) {
                    r2Var.x();
                }
                j2Var.z = i40;
            }
            if (!r2Var.O0 && ((((chat = r2Var.g2) != null && chat.linked_community_id != 0) || ((user = r2Var.f2) != null && user.linked_community_id != 0)) && !r2Var.E && r2Var.N0 && !r2Var.O())) {
                float centerX2 = j2Var.F.centerX() + AndroidUtilities.dp(20.33f);
                float centerY2 = j2Var.F.centerY() + AndroidUtilities.dp(19.0f);
                if (r2Var.D0 == null) {
                    r2Var.D0 = new gi.a();
                }
                yf.p.d(r2Var.D0, centerX2, centerY2, i16);
                canvas3.drawCircle(r2Var.D0.getBounds().exactCenterX(), r2Var.D0.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.j6.l0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var3)));
                r2Var.D0.draw(canvas3);
            }
        }
        if (r2Var.b2) {
            canvas3.restore();
        }
        if (imageReceiver.getVisible() && B(canvas)) {
            z14 = true;
        }
        if (r2Var.i0 > 0.0f || r2Var.J0 != 0) {
            r2Var2 = r2Var;
        } else {
            boolean N2 = r2Var.N();
            RectF rectF9 = j2Var.F;
            int width = (int) (((rectF9.width() + rectF9.left) - r2Var.K3) - AndroidUtilities.dp(5.0f));
            RectF rectF10 = j2Var.F;
            D(canvas3, N2, (int) ((j2Var.F.height() + imageReceiver.getImageY()) - AndroidUtilities.dp(22.0f)), width, (int) (((rectF10.width() + rectF10.left) - r2Var.L3) - AndroidUtilities.dp(5.0f)), r2Var.i0, true);
            r2Var2 = this;
        }
        if (r2Var2.C0 != 0.0f) {
            canvas3.restore();
        }
        if (r2Var2.w1 != 0.0f) {
            canvas3.restore();
        }
        if (z11 && ((r2Var2.J0 != 0 || (r2Var2.P && (tL_forumTopic = r2Var2.N) != null && tL_forumTopic.id == 1)) && r2Var2.w1 == 0.0f && r2Var2.e2 != null)) {
            canvas3.save();
            canvas3.translate(0.0f, (-r2Var2.E3) - (r2Var2.n * r2Var2.i0));
            canvas3.clipRect(0.0f, (f17 - r2Var2.e2.J) * r2Var2.getMeasuredHeight(), r2Var2.getMeasuredWidth(), r2Var2.getMeasuredHeight());
            r2Var2.e2.c(canvas3, r12);
            canvas3.restore();
        }
        if (r2Var2.s2) {
            int dp15 = (r2Var2.t2 || (r2Var2.J0 != 0 && r2Var2.m1)) ? 0 : AndroidUtilities.dp(r2Var2.I);
            if (r2Var2.i0 != f17) {
                int alpha4 = org.telegram.ui.ActionBar.j6.k0.getAlpha();
                float f49 = r2Var2.i0;
                if (f49 != 0.0f) {
                    org.telegram.ui.ActionBar.j6.k0.setAlpha((int) ((f17 - f49) * alpha4));
                }
                float measuredHeight = (r2Var2.getMeasuredHeight() - 1) - (r2Var2.n * r2Var2.i0);
                if (LocaleController.isRTL) {
                    canvas.drawLine(0.0f, measuredHeight, r2Var2.getMeasuredWidth() - dp15, measuredHeight, org.telegram.ui.ActionBar.j6.k0);
                } else {
                    canvas.drawLine(dp15, measuredHeight, r2Var2.getMeasuredWidth(), measuredHeight, org.telegram.ui.ActionBar.j6.k0);
                }
                f18 = 0.0f;
                if (r2Var2.i0 != 0.0f) {
                    org.telegram.ui.ActionBar.j6.k0.setAlpha(alpha4);
                }
                if (r2Var2.t1 != f18) {
                    if (Build.VERSION.SDK_INT != 24) {
                        canvas.restore();
                    } else {
                        org.telegram.ui.ActionBar.j6.v0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var3));
                        canvas.drawRect(0.0f, 0.0f, r2Var2.getMeasuredWidth(), r2Var2.u1 * r2Var2.t1, org.telegram.ui.ActionBar.j6.v0);
                        canvas.drawRect(0.0f, r2Var2.getMeasuredHeight() - ((int) (r2Var2.v1 * r2Var2.t1)), r2Var2.getMeasuredWidth(), r2Var2.getMeasuredHeight(), org.telegram.ui.ActionBar.j6.v0);
                        canvas2 = canvas;
                        if (z26) {
                            float f50 = f17 - f27;
                            int measuredHeight2 = (int) (r2Var2.getMeasuredHeight() * f50);
                            int u02 = org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.d6);
                            if (r2Var2.K4 == null) {
                                r2Var2.K4 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                            }
                            if (r2Var2.L4 != u02) {
                                r2Var2.L4 = u02;
                                r2Var2.K4.setColors(new int[]{u02, 16777215 & u02});
                            }
                            float a10 = w7.p.a((f50 - 0.05f) * 10.0f, 0.0f, 1.0f);
                            r2Var2.K4.setBounds(r12, measuredHeight2, r2Var2.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + measuredHeight2);
                            r2Var2.K4.setAlpha((int) (a10 * 255.0f));
                            r2Var2.K4.draw(canvas2);
                            canvas2.restore();
                        }
                        z17 = r2Var2.y3;
                        if (!z17 || r2Var2.x3 != 0.0f) {
                            if (z17) {
                                float f51 = r2Var2.x3;
                                if (f51 < 1.0f) {
                                    float f52 = f51 + 0.09411765f;
                                    r2Var2.x3 = f52;
                                    if (f52 > 1.0f) {
                                        r2Var2.x3 = 1.0f;
                                    }
                                    f19 = 0.0f;
                                }
                            } else {
                                float f53 = r2Var2.x3;
                                f19 = 0.0f;
                                if (f53 > 0.0f) {
                                    float f54 = f53 - 0.09411765f;
                                    r2Var2.x3 = f54;
                                    if (f54 < 0.0f) {
                                        r2Var2.x3 = 0.0f;
                                    }
                                }
                                if (r2Var2.m1) {
                                    float f55 = r2Var2.D1;
                                    if (f55 > f19) {
                                        float f56 = f55 - 0.069565214f;
                                        r2Var2.D1 = f56;
                                        if (f56 < f19) {
                                            r2Var2.D1 = f19;
                                        }
                                        org.telegram.ui.Components.i9 i9Var = r2Var2.a2;
                                        if (i9Var.n == 2) {
                                            i9Var.o = pr.h.getInterpolation(r2Var2.D1);
                                        }
                                        z14 = true;
                                    }
                                    if (r2Var2.b2) {
                                        float f57 = r2Var2.c2 + 16.0f;
                                        r2Var2.c2 = f57;
                                        if (f57 >= 170.0f) {
                                            r2Var2.c2 = 170.0f;
                                            r2Var2.b2 = r12;
                                        }
                                        z14 = true;
                                    }
                                    if (!r2Var2.A1) {
                                        float f58 = r2Var2.C1;
                                        if (f58 < 1.0f) {
                                            float f59 = f58 + 0.09411765f;
                                            r2Var2.C1 = f59;
                                            if (f59 > 1.0f) {
                                                r2Var2.C1 = 1.0f;
                                                z14 = true;
                                            }
                                        }
                                        float f60 = r2Var2.B1;
                                        if (f60 < 1.0f) {
                                            float f61 = f60 + 0.053333335f;
                                            r2Var2.B1 = f61;
                                            if (f61 > 1.0f) {
                                                r2Var2.B1 = 1.0f;
                                            }
                                            z14 = true;
                                        }
                                        ebVar2.setVisibility(!z13 ? 0 : 4);
                                        if (z14) {
                                            return;
                                        }
                                        r2Var2.invalidate();
                                        return;
                                    }
                                    if (r2Var2.C1 == 1.0f) {
                                        r2Var2.C1 = 0.0f;
                                        z14 = true;
                                    }
                                    float f62 = r2Var2.B1;
                                    if (f62 > 0.0f) {
                                        float f63 = f62 - 0.053333335f;
                                        r2Var2.B1 = f63;
                                        if (f63 < 0.0f) {
                                            r2Var2.B1 = 0.0f;
                                        }
                                        z14 = true;
                                    }
                                    ebVar2.setVisibility(!z13 ? 0 : 4);
                                    if (z14) {
                                    }
                                } else {
                                    float f64 = r2Var2.D1;
                                    if (f64 < 1.0f) {
                                        float f65 = f64 + 0.069565214f;
                                        r2Var2.D1 = f65;
                                        if (f65 > 1.0f) {
                                            r2Var2.D1 = 1.0f;
                                        }
                                        org.telegram.ui.Components.i9 i9Var2 = r2Var2.a2;
                                        if (i9Var2.n == 2) {
                                            i9Var2.o = pr.h.getInterpolation(r2Var2.D1);
                                        }
                                        z14 = true;
                                    }
                                    if (r2Var2.b2) {
                                    }
                                    if (!r2Var2.A1) {
                                    }
                                }
                            }
                            z14 = true;
                            if (r2Var2.m1) {
                            }
                        }
                        f19 = 0.0f;
                        if (r2Var2.m1) {
                        }
                    }
                }
                canvas2 = canvas;
                if (z26) {
                }
                z17 = r2Var2.y3;
                if (!z17) {
                }
                if (z17) {
                }
                z14 = true;
                if (r2Var2.m1) {
                }
            }
        }
        f18 = 0.0f;
        if (r2Var2.t1 != f18) {
        }
        canvas2 = canvas;
        if (z26) {
        }
        z17 = r2Var2.y3;
        if (!z17) {
        }
        if (z17) {
        }
        z14 = true;
        if (r2Var2.m1) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        ii0 ii0Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (P() && (ii0Var = this.e2) != null && SharedConfig.archiveHidden && ii0Var.J == 0.0f) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(32);
            if (!P() && this.z4 != null) {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_chat_preview, LocaleController.getString(R.string.AccActionChatPreview)));
            }
        }
        di.q3 q3Var = this.q2;
        if (q3Var == null || !q3Var.a.q) {
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
        di.eb ebVar = this.i4;
        if (ebVar != null) {
            ebVar.layout(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
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
            di.q3 q3Var = this.q2;
            q3Var.layout(i14, dp, q3Var.getMeasuredWidth() + i14, this.q2.getMeasuredHeight() + dp);
        }
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (measuredWidth != this.G4 || this.A0) {
            this.A0 = false;
            this.G4 = measuredWidth;
            try {
                t();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        di.eb ebVar = this.i4;
        if (ebVar != null) {
            ebVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), TLObject.FLAG_30));
        }
        di.q3 q3Var = this.q2;
        if (q3Var != null) {
            q3Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
        }
        if (this.P) {
            int size = View.MeasureSpec.getSize(i10);
            boolean z10 = this.r2;
            setMeasuredDimension(size, AndroidUtilities.dp(((z10 || SharedConfig.useThreeLinesLayout) ? this.K : this.J) + ((!M() || ((z10 || SharedConfig.useThreeLinesLayout) && !Q())) ? 0 : Q() ? this.M : this.L)) + (this.s2 ? 1 : 0));
            this.Q = false;
            if (this.P && !M()) {
                t();
                if (this.R) {
                    this.Q = true;
                    t();
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), y());
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
            wl.l(R.string.ArchivedChats, ". ", sb2);
        } else {
            if (this.h2 != null) {
                wl.l(R.string.AccDescrSecretChat, ". ", sb2);
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
                            wl.l(R.string.Bot, ". ", sb2);
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
                wl.l(R.string.AccDescrTopic, ". ", sb2);
                sb2.append(this.N.title);
                sb2.append(". ");
            }
        }
        if (this.f4) {
            wl.l(R.string.AccDescrVerified, ". ", sb2);
        }
        if (this.Z0) {
            wl.l(R.string.AccDescrNotificationsMuted, ". ", sb2);
        }
        if (R()) {
            wl.l(R.string.AccDescrUserOnline, ". ", sb2);
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
            wl.l(R.string.AccDescrMentionReaction, ". ", sb2);
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
        if (this.i0 != 0.0f || this.P || this.F || !this.u0.a(motionEvent, this)) {
            n2 n2Var = this.d0;
            if (n2Var == null || n2Var.b()) {
                if (this.E1) {
                    boolean contains = this.H1.contains(motionEvent.getX(), motionEvent.getY());
                    int action = motionEvent.getAction();
                    zc zcVar = this.F1;
                    if (action == 0 || motionEvent.getAction() == 2) {
                        zcVar.c(contains);
                    } else {
                        if (zcVar.h && motionEvent.getAction() == 1) {
                            bi.o1 o1Var = this.K1;
                            if (o1Var != null) {
                                o1Var.run(this.f2);
                            }
                            zcVar.c(false);
                            return true;
                        }
                        if (zcVar.h && motionEvent.getAction() == 3) {
                            zcVar.c(false);
                            return true;
                        }
                    }
                }
                if (this.f0) {
                    gd gdVar = this.c0;
                    if (gdVar != null) {
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
        uy uyVar;
        if (i10 != R.id.acc_action_chat_preview || (uyVar = this.z4) == null) {
            return super.performAccessibilityAction(i10, bundle);
        }
        uyVar.H4(this);
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (getParent() != null && getParent().isLayoutRequested()) {
            getParent().requestLayout();
        }
        super.requestLayout();
    }

    public final CharSequence s(CharSequence charSequence) {
        if (this.R1 <= 0) {
            return charSequence;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.insert(0, (CharSequence) " ");
        valueOf.setSpan(new p2(AndroidUtilities.dp(((this.H4 + 2) * this.R1) + 3)), 0, 1, 33);
        return valueOf;
    }

    public void setArchivedPullAnimation(ii0 ii0Var) {
        this.e2 = ii0Var;
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
        t();
        requestLayout();
    }

    public void setCustomMessageWithoutRebuild(String str) {
        this.I0 = str;
    }

    public void setDialog(m2 m2Var) {
        this.G0 = m2Var;
        this.l1 = 0;
        b0(0, true);
        w();
        v();
        u();
        x();
    }

    public void setDialogCellDelegate(n2 n2Var) {
        this.d0 = n2Var;
    }

    public void setDialogSelected(boolean z10) {
        if (this.m4 != z10) {
            invalidate();
        }
        this.m4 = z10;
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
            this.I1 = new f01(LocaleController.getString(R.string.BotOpen), 14.0f, AndroidUtilities.bold());
        }
        this.E1 = z10;
        this.F1.c(false);
    }

    public void setPinForced(boolean z10) {
        this.B3 = z10;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            t();
        }
        invalidate();
    }

    public void setPreloader(hg.j jVar) {
        this.o4 = jVar;
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
        xi0 xi0Var = this.y1;
        if (xi0Var != null && f7 == 0.0f) {
            xi0Var.Q(0.0f, true);
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

    /* JADX WARN: Can't wrap try/catch for region: R(138:15|(1:17)|18|(1:1975)(1:24)|25|(1:1974)(1:29)|30|(1:32)|33|(1:1973)(1:37)|38|(1:40)|41|(1:43)(1:1966)|44|(7:46|(1:48)|49|50|(1:52)|53|54)(1:1965)|55|(1:57)(1:1964)|58|(9:60|(2:62|(2:920|(1:922)(1:923))(2:66|(1:68)(1:919)))(4:924|(1:941)(1:928)|929|(2:937|(1:939)(1:940))(2:933|(1:935)(1:936)))|69|(3:71|(1:73)(4:906|(1:908)|909|(1:914)(1:913))|74)(3:915|(1:917)|918)|75|(1:77)(1:905)|78|(1:80)(1:(1:903)(1:904))|81)(40:942|(2:1960|(1:1962)(1:1963))(2:946|(1:948)(1:1959))|949|(2:951|(2:953|(2:961|(1:963)(1:964))(2:957|(1:959)(1:960))))(2:1884|(36:1888|(3:1890|(1:1892)(2:1899|(1:1901)(2:1902|(1:1904)(5:1905|(1:1917)(1:1909)|1910|(1:1916)(1:1914)|1915)))|1893)(2:1918|(8:1920|(1:1922)(2:1939|(1:1941)(11:1942|(1:1957)(1:1946)|1947|(1:1956)(2:1951|(7:1953|1954|1924|(2:1926|(3:1930|1931|(2:1933|(1:1935)(1:1936))))(1:1938)|1937|1931|(0)))|1955|1954|1924|(0)(0)|1937|1931|(0)))|1923|1924|(0)(0)|1937|1931|(0))(1:1958))|1894|(1:1898)|966|(1:970)|971|(6:973|(1:975)(1:1869)|976|(1:978)(1:1868)|979|(1:983))(2:1870|(5:1875|(1:1877)(1:1883)|1878|(1:1880)(1:1882)|1881)(1:1874))|984|(3:(2:1856|(23:1858|(1:1860)|998|999|(11:1001|(1:1003)(1:1248)|1004|(4:1006|(1:1008)|1009|(1:1011))(1:1247)|1012|(1:1014)(1:1246)|1015|(1:1017)(1:1245)|1018|(2:1020|(1:1023))|1024)(2:1249|(1:1251)(3:(6:1253|(1:1255)(1:1839)|1256|(1:1258)(1:1838)|(1:1260)(1:1837)|1261)(1:1840)|1262|(21:1785|1786|(7:1801|(2:1829|(1:1831)(1:(2:1833|(1:1835))(1:1836)))(1:1805)|1806|(2:1808|(3:1812|(1:1814)(1:1816)|1815))(2:1826|(1:1828))|1817|(1:1825)(1:1821)|1822)(2:1792|(1:1799)(19:1796|1271|1026|(3:1042|(1:1046)|1047)|1048|(9:1236|(1:1238)(2:1239|(1:1241)(2:1242|(1:1244)))|1051|(4:1226|1227|(1:1235)(1:1233)|1234)(6:1055|(4:1057|(1:(2:1060|1061)(1:1199))(1:1201)|1200|1061)(10:1202|(1:1204)(9:1219|(1:1221)(2:1222|(1:1224)(1:1225))|1206|(1:1208)(1:1218)|1209|(1:1211)(1:1217)|1212|(1:1214)(1:1216)|1215)|1205|1206|(0)(0)|1209|(0)(0)|1212|(0)(0)|1215)|1062|(2:1067|(3:1069|(1:1071)(2:1159|(1:1161)(2:1162|(4:1164|(3:1166|(1:1168)(1:1172)|1169)(2:1173|(3:1175|(1:1187)(1:1179)|1180)(3:1188|(1:1196)(1:1194)|1195))|1170|1171)(1:1197)))|1072))|1198|1072)|1073|(2:1077|(1:1079)(2:1080|(4:1082|(1:1084)|1085|(1:1087))))|1088|(2:1091|(1:1093)(3:1094|(3:1096|(3:1098|(1:1100)|1101)(2:1109|(4:1111|(1:1113)|1114|(1:1116)(1:1117))(2:1118|(1:1126)(2:1122|(1:1124)(1:1125))))|1108)(3:1127|(3:1129|(1:1131)(2:1132|(1:1134)(2:1135|(2:1149|(4:1151|(1:1153)|1154|(1:1156)(1:1157))(1:1158))(2:1139|(1:1141)(2:1142|(1:1144)(3:1145|(1:1147)|1148)))))|1108)|1103)|(1:1107)))|1090)|1050|1051|(1:1053)|1226|1227|(1:1229)|1235|1234|1073|(3:1075|1077|(0)(0))|1088|(0)|1090))|1800|1026|(10:1028|1030|1032|1034|1036|1038|1040|1042|(2:1044|1046)|1047)|1048|(0)|1050|1051|(0)|1226|1227|(0)|1235|1234|1073|(0)|1088|(0)|1090)(22:1266|(1:1268)(2:1272|(2:1274|(1:1276)(2:1277|(1:1279)(22:1280|(2:1282|(1:1284)(2:1285|(1:1287)(2:1288|(1:1290)(2:1291|(2:1293|(1:1295)(1:1296))))))(2:1298|(20:1302|(1:1308)(1:1306)|1307|1026|(0)|1048|(0)|1050|1051|(0)|1226|1227|(0)|1235|1234|1073|(0)|1088|(0)|1090))|1297|1270|1271|1026|(0)|1048|(0)|1050|1051|(0)|1226|1227|(0)|1235|1234|1073|(0)|1088|(0)|1090)))(29:1309|(1:1311)(1:1784)|1312|(3:1314|(2:1326|(2:1328|(26:1332|(1:1334)(3:1776|(1:1778)(1:1780)|1779)|(1:1336)(24:1347|(4:1349|(4:1351|(2:1353|(2:1355|(1:1357)(2:1361|(1:1363)(1:1364))))|1365|(1:1367)(2:1368|(1:1370)(2:1371|(1:1373)(1:1374))))(1:1375)|1358|1359)(2:1376|(25:1387|(1:(2:1401|(40:1436|1437|(1:1775)(1:1445)|1446|(4:1522|(2:1524|(5:1526|(1:1528)|1530|(1:1532)|1534))|1536|(31:1544|(2:1546|(5:1548|(1:1560)|1554|1555|(2:1557|(1:1559)))(2:1561|(4:1568|(2:1570|(2:1575|(1:1577)(2:1578|(1:1580)(1:1581))))|1582|(2:1624|(3:1626|(2:1628|(1:1630)(1:1632))(2:1633|(1:1635)(1:1636))|1631)(2:1637|(4:1639|(4:1641|(1:1643)(1:1648)|1644|1645)(3:1649|(1:1651)(1:1653)|1652)|1646|1647)(6:1654|(5:1656|(2:1658|(3:1660|(1:1662)(1:1676)|1663))|1677|(0)(0)|1663)(2:1678|(1:1680)(2:1681|(3:1683|(1:1689)(1:1687)|1688)(2:1690|(2:1692|(1:1697)(1:1696))(2:1698|(1:1700)(2:1701|(1:1703)(2:1704|(1:1706)(2:1707|(3:1721|(4:1729|(1:1731)|1732|(2:1734|(3:1736|(1:1738)(1:1740)|1739)))(2:1725|(1:1727))|1728)(2:1711|(3:1713|(2:1715|(1:1717))(1:1719)|1718)(1:1720)))))))))|1664|1665|(2:1670|(2:1672|(1:1674)))|1669)))(4:1586|(1:1588)(2:1612|(1:1614)(2:1615|(1:1617)(2:1618|(2:1620|(1:1622)(1:1623)))))|1589|(3:1604|(3:1606|(1:1608)(1:1610)|1609)|1611)(4:1593|(2:1595|(1:1597)(1:1598))|(1:1602)|1603)))(1:1567)))|1741|(1:1743)|1744|(7:1746|(3:1770|(1:1772)|1773)(2:1750|(1:1752))|1753|(1:1755)(1:1769)|1756|(2:1758|(1:1760))|1761)(1:1774)|1762|(1:1768)(1:1766)|1767|1338|1339|(1:1341)(2:1343|(1:1345)(19:1346|1271|1026|(0)|1048|(0)|1050|1051|(0)|1226|1227|(0)|1235|1234|1073|(0)|1088|(0)|1090))|1342|1271|1026|(0)|1048|(0)|1050|1051|(0)|1226|1227|(0)|1235|1234|1073|(0)|1088|(0)|1090))|1456|(1:1458)|1459|(2:1467|(32:1469|(1:1513)(1:1473)|1474|1475|1476|(1:1512)(5:1482|1483|1484|1485|1486)|1487|(1:1491)|1492|(4:1494|(1:1496)|1497|(1:1499)(1:1500))|1501|1339|(0)(0)|1342|1271|1026|(0)|1048|(0)|1050|1051|(0)|1226|1227|(0)|1235|1234|1073|(0)|1088|(0)|1090))|1514|1475|1476|(2:1478|1508)|1512|1487|(2:1489|1491)|1492|(0)|1501|1339|(0)(0)|1342|1271|1026|(0)|1048|(0)|1050|1051|(0)|1226|1227|(0)|1235|1234|1073|(0)|1088|(0)|1090)(5:1407|(2:1409|(4:1411|(1:1413)(1:1421)|1414|1415)(3:1422|(1:1424)(1:1426)|1425))(2:1427|(2:1432|(1:1434)(1:1435))(3:1431|1417|(1:1419)(1:1420)))|1416|1417|(0)(0)))(1:1400))(1:1393)|1394|1338|1339|(0)(0)|1342|1271|1026|(0)|1048|(0)|1050|1051|(0)|1226|1227|(0)|1235|1234|1073|(0)|1088|(0)|1090)(3:1380|(1:1386)(1:1384)|1385))|1360|1339|(0)(0)|1342|1271|1026|(0)|1048|(0)|1050|1051|(0)|1226|1227|(0)|1235|1234|1073|(0)|1088|(0)|1090)|1337|1338|1339|(0)(0)|1342|1271|1026|(0)|1048|(0)|1050|1051|(0)|1226|1227|(0)|1235|1234|1073|(0)|1088|(0)|1090)))|1781)(1:1783)|1782|(0)(0)|1337|1338|1339|(0)(0)|1342|1271|1026|(0)|1048|(0)|1050|1051|(0)|1226|1227|(0)|1235|1234|1073|(0)|1088|(0)|1090))|1269|1270|1271|1026|(0)|1048|(0)|1050|1051|(0)|1226|1227|(0)|1235|1234|1073|(0)|1088|(0)|1090)))|1025|1026|(0)|1048|(0)|1050|1051|(0)|1226|1227|(0)|1235|1234|1073|(0)|1088|(0)|1090))|1862|(2:1864|(1:1866)))|988|(2:990|(2:992|(23:994|(1:996)|998|999|(0)(0)|1025|1026|(0)|1048|(0)|1050|1051|(0)|1226|1227|(0)|1235|1234|1073|(0)|1088|(0)|1090)))|1841|(23:1843|(1:1845)|998|999|(0)(0)|1025|1026|(0)|1048|(0)|1050|1051|(0)|1226|1227|(0)|1235|1234|1073|(0)|1088|(0)|1090)|1847|(1:1849)|999|(0)(0)|1025|1026|(0)|1048|(0)|1050|1051|(0)|1226|1227|(0)|1235|1234|1073|(0)|1088|(0)|1090))|965|966|(2:968|970)|971|(0)(0)|984|(1:986)|(4:1852|1854|1856|(0))|1862|(0)|988|(0)|1841|(0)|1847|(0)|999|(0)(0)|1025|1026|(0)|1048|(0)|1050|1051|(0)|1226|1227|(0)|1235|1234|1073|(0)|1088|(0)|1090)|82|(4:84|(1:86)(1:900)|87|(1:89)(1:899))(1:901)|90|(3:92|(1:94)(1:897)|95)(1:898)|96|(1:98)(1:896)|99|(3:101|(1:103)|104)|105|(2:107|(1:109)(1:883))(2:884|(105:886|(2:888|(1:890)(1:891))(2:892|(1:894)(1:895))|111|(1:882)(1:119)|120|(1:(4:853|(1:855)|856|(1:858))(2:859|(2:861|(1:863))(2:864|(2:866|(1:868))(2:869|(70:871|(1:873)(1:877)|874|(1:876)|131|(1:133)|134|135|136|(1:138)|139|(4:141|142|143|144)(1:849)|145|(9:147|148|149|150|151|152|153|(1:155)(1:836)|156)(1:845)|157|(1:159)(1:835)|160|(1:162)|163|(1:834)(1:169)|170|(1:172)(1:833)|173|(1:832)(1:177)|178|179|(7:803|804|(1:806)(1:830)|807|808|(2:809|(5:811|(1:813)(1:827)|814|(2:825|826)(2:822|823)|824)(1:828))|829)(9:183|(1:185)|186|(1:188)(1:802)|189|(1:191)(1:801)|192|(2:193|(5:195|(1:197)(1:211)|198|(2:209|210)(2:206|207)|208)(1:212))|213)|214|(1:216)(1:800)|217|(1:219)|220|(1:228)|229|(2:231|(1:233)(1:234))|235|(2:237|(1:239)(1:663))(1:(6:(4:699|(1:701)(1:796)|702|703)(1:797)|(6:705|(1:707)(1:794)|708|(3:710|(1:712)(1:788)|713)(3:789|(1:791)(1:793)|792)|714|715)(1:795)|716|(2:718|(4:720|(3:722|(1:724)(1:726)|725)|727|(3:729|(1:731)(1:733)|732))(5:734|(3:736|(1:738)(1:740)|739)|741|(3:743|(1:745)(1:747)|746)|748))|749|(2:751|(6:753|(1:755)|756|(3:758|(1:760)(1:762)|761)|763|(3:765|(1:767)(1:769)|768))(7:770|(1:772)|773|(3:775|(1:777)(1:779)|778)|780|(3:782|(1:784)(1:786)|785)|787)))(2:670|(1:697)(6:682|(1:696)(2:686|(1:688)(1:695))|689|(1:691)(1:694)|692|693)))|(7:(1:242)|243|(1:245)|246|(1:259)(1:250)|251|(1:255))|260|(1:662)(1:264)|265|(3:271|(1:273)(1:275)|274)|276|(4:278|(1:595)(1:282)|283|(2:284|(1:286)(1:287)))(2:596|(16:624|625|(2:629|(12:631|632|633|634|635|636|637|638|(1:649)(1:642)|643|(2:644|(1:646)(1:647))|648))|658|632|633|634|635|636|637|638|(1:640)|649|643|(3:644|(0)(0)|646)|648)(3:600|601|(4:606|(1:616)(1:610)|611|(2:612|(1:614)(1:615)))(1:605)))|288|(1:290)|291|292|293|(1:295)(1:593)|296|297|298|299|(11:301|(9:303|(1:305)|306|307|308|309|310|311|312)|317|(1:319)|306|307|308|309|310|311|312)|320|321|(3:323|(5:325|(1:352)(4:329|(2:331|(2:333|(1:335)))|339|(2:341|(2:343|(3:345|(1:349)|338))))|336|337|338)|353)|354|(1:588)(8:358|(1:360)|574|(1:(3:577|(1:581)|370))|362|(1:573)(1:368)|369|370)|371|(8:557|(2:560|561)|562|563|564|(1:566)(1:570)|567|568)(6:375|(2:377|(1:381))|382|383|384|385)|386|387|388|(10:390|(8:394|(1:396)|397|(1:399)|400|(2:429|(1:431)(1:432))(2:406|(1:408)(2:414|(1:416)(2:417|(3:419|(1:421)(1:423)|422)(1:424))))|409|(2:411|(1:413)))|433|(3:437|(1:(1:446)(2:439|(1:441)(2:442|443)))|(1:445))|447|(3:451|(1:(1:460)(2:453|(1:455)(2:456|457)))|(1:459))|461|(2:467|(1:469))|470|(4:474|(1:476)|477|478))(10:496|(8:500|(1:502)|503|(4:505|(1:507)|508|(1:510))|511|(1:513)|514|(1:516))|517|(4:521|(1:523)|524|525)|526|(4:530|(1:532)|533|534)|535|(4:539|(1:541)|542|543)|544|(1:548))|479|(3:(1:493)(1:488)|489|(1:491)(1:492))|494|495)))))(4:124|(1:126)|127|(1:129))|130|131|(0)|134|135|136|(0)|139|(0)(0)|145|(0)(0)|157|(0)(0)|160|(0)|163|(1:165)|834|170|(0)(0)|173|(1:175)|832|178|179|(1:181)|803|804|(0)(0)|807|808|(3:809|(0)(0)|824)|829|214|(0)(0)|217|(0)|220|(60:222|224|226|228|229|(0)|235|(0)(0)|(0)|260|(1:262)|662|265|(46:267|269|271|(0)(0)|274|276|(0)(0)|288|(0)|291|292|293|(0)(0)|296|297|298|299|(0)|320|321|(0)|354|(1:356)|582|584|586|588|371|(1:373)|555|557|(2:560|561)|562|563|564|(0)(0)|567|568|386|387|388|(0)(0)|479|(6:481|483|(1:486)|493|489|(0)(0))|494|495)|660|269|271|(0)(0)|274|276|(0)(0)|288|(0)|291|292|293|(0)(0)|296|297|298|299|(0)|320|321|(0)|354|(0)|582|584|586|588|371|(0)|555|557|(0)|562|563|564|(0)(0)|567|568|386|387|388|(0)(0)|479|(0)|494|495)|798|224|226|228|229|(0)|235|(0)(0)|(0)|260|(0)|662|265|(0)|660|269|271|(0)(0)|274|276|(0)(0)|288|(0)|291|292|293|(0)(0)|296|297|298|299|(0)|320|321|(0)|354|(0)|582|584|586|588|371|(0)|555|557|(0)|562|563|564|(0)(0)|567|568|386|387|388|(0)(0)|479|(0)|494|495))|110|111|(1:113)|878|880|882|120|(1:122)|(0)(0)|130|131|(0)|134|135|136|(0)|139|(0)(0)|145|(0)(0)|157|(0)(0)|160|(0)|163|(0)|834|170|(0)(0)|173|(0)|832|178|179|(0)|803|804|(0)(0)|807|808|(3:809|(0)(0)|824)|829|214|(0)(0)|217|(0)|220|(0)|798|224|226|228|229|(0)|235|(0)(0)|(0)|260|(0)|662|265|(0)|660|269|271|(0)(0)|274|276|(0)(0)|288|(0)|291|292|293|(0)(0)|296|297|298|299|(0)|320|321|(0)|354|(0)|582|584|586|588|371|(0)|555|557|(0)|562|563|564|(0)(0)|567|568|386|387|388|(0)(0)|479|(0)|494|495) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:(2:624|625)|(2:629|(12:631|632|633|634|635|636|637|638|(1:649)(1:642)|643|(2:644|(1:646)(1:647))|648))|658|632|633|634|635|636|637|638|(1:640)|649|643|(3:644|(0)(0)|646)|648) */
    /* JADX WARN: Code restructure failed: missing block: B:1102:0x158d, code lost:
    
        if (r4 == null) goto L1114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1529:0x0b20, code lost:
    
        if (r14.id != r11) goto L584;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1533:0x0b2e, code lost:
    
        if (org.telegram.messenger.ChatObject.isMegagroup(r52.g2) != false) goto L588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1535:0x0b36, code lost:
    
        if (og.d.k(r52.f1) == false) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1675:0x0f53, code lost:
    
        if (org.telegram.messenger.MessageObject.isBlueBlock(r52.f1.messageOwner.rich_message.blocks.get(0)) != false) goto L797;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1846:0x0635, code lost:
    
        if (r2.kicked != false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1850:0x063f, code lost:
    
        if (r52.P == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1861:0x0603, code lost:
    
        if (r3.reply_to_msg_id == 0) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1867:0x060f, code lost:
    
        if (r52.S0 != 0) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x2342, code lost:
    
        if (org.telegram.messenger.SharedConfig.useThreeLinesLayout == false) goto L1755;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x23ea, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x23eb, code lost:
    
        r36 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x22f1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x2269, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x215f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x2160, code lost:
    
        r36 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x215c, code lost:
    
        r2 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x2163, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
        r42 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x215b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x1966, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:851:0x1967, code lost:
    
        r19 = 21.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:997:0x0629, code lost:
    
        if (r2.post_messages == false) goto L320;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1001:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x1794  */
    /* JADX WARN: Removed duplicated region for block: B:1028:0x12cb  */
    /* JADX WARN: Removed duplicated region for block: B:1053:0x136e  */
    /* JADX WARN: Removed duplicated region for block: B:1075:0x14fb  */
    /* JADX WARN: Removed duplicated region for block: B:1079:0x150e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x17b2  */
    /* JADX WARN: Removed duplicated region for block: B:1080:0x1515  */
    /* JADX WARN: Removed duplicated region for block: B:1091:0x1554  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x1863  */
    /* JADX WARN: Removed duplicated region for block: B:1208:0x13e8  */
    /* JADX WARN: Removed duplicated region for block: B:1211:0x13f4  */
    /* JADX WARN: Removed duplicated region for block: B:1214:0x13fd  */
    /* JADX WARN: Removed duplicated region for block: B:1216:0x13ff  */
    /* JADX WARN: Removed duplicated region for block: B:1217:0x13f6  */
    /* JADX WARN: Removed duplicated region for block: B:1218:0x13ed  */
    /* JADX WARN: Removed duplicated region for block: B:1229:0x14c7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x1884  */
    /* JADX WARN: Removed duplicated region for block: B:1236:0x1347  */
    /* JADX WARN: Removed duplicated region for block: B:1249:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:1336:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x1939  */
    /* JADX WARN: Removed duplicated region for block: B:1341:0x11b7  */
    /* JADX WARN: Removed duplicated region for block: B:1343:0x11c1  */
    /* JADX WARN: Removed duplicated region for block: B:1347:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x194d  */
    /* JADX WARN: Removed duplicated region for block: B:1419:0x0ab4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x1952 A[Catch: Exception -> 0x1966, TRY_LEAVE, TryCatch #12 {Exception -> 0x1966, blocks: (B:136:0x1944, B:139:0x194e, B:141:0x1952), top: B:135:0x1944 }] */
    /* JADX WARN: Removed duplicated region for block: B:1420:0x0abd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x1970 A[Catch: Exception -> 0x195f, TRY_LEAVE, TryCatch #8 {Exception -> 0x195f, blocks: (B:144:0x195a, B:145:0x196c, B:147:0x1970), top: B:143:0x195a }] */
    /* JADX WARN: Removed duplicated region for block: B:1489:0x1140  */
    /* JADX WARN: Removed duplicated region for block: B:1494:0x1151  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x19b4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x19bd A[Catch: Exception -> 0x1998, TryCatch #3 {Exception -> 0x1998, blocks: (B:153:0x197f, B:156:0x198e, B:157:0x19a1, B:160:0x19b7, B:162:0x19bd, B:163:0x19c9, B:165:0x19dc, B:167:0x19e2, B:170:0x19f3, B:172:0x19f7, B:173:0x1a31, B:175:0x1a35, B:177:0x1a3e, B:178:0x1a46, B:833:0x1a10), top: B:152:0x197f }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x19dc A[Catch: Exception -> 0x1998, TryCatch #3 {Exception -> 0x1998, blocks: (B:153:0x197f, B:156:0x198e, B:157:0x19a1, B:160:0x19b7, B:162:0x19bd, B:163:0x19c9, B:165:0x19dc, B:167:0x19e2, B:170:0x19f3, B:172:0x19f7, B:173:0x1a31, B:175:0x1a35, B:177:0x1a3e, B:178:0x1a46, B:833:0x1a10), top: B:152:0x197f }] */
    /* JADX WARN: Removed duplicated region for block: B:1662:0x0d81  */
    /* JADX WARN: Removed duplicated region for block: B:1676:0x0d84  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x19f7 A[Catch: Exception -> 0x1998, TryCatch #3 {Exception -> 0x1998, blocks: (B:153:0x197f, B:156:0x198e, B:157:0x19a1, B:160:0x19b7, B:162:0x19bd, B:163:0x19c9, B:165:0x19dc, B:167:0x19e2, B:170:0x19f3, B:172:0x19f7, B:173:0x1a31, B:175:0x1a35, B:177:0x1a3e, B:178:0x1a46, B:833:0x1a10), top: B:152:0x197f }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x1a35 A[Catch: Exception -> 0x1998, TryCatch #3 {Exception -> 0x1998, blocks: (B:153:0x197f, B:156:0x198e, B:157:0x19a1, B:160:0x19b7, B:162:0x19bd, B:163:0x19c9, B:165:0x19dc, B:167:0x19e2, B:170:0x19f3, B:172:0x19f7, B:173:0x1a31, B:175:0x1a35, B:177:0x1a3e, B:178:0x1a46, B:833:0x1a10), top: B:152:0x197f }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x1a73  */
    /* JADX WARN: Removed duplicated region for block: B:1843:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:1849:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:1858:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:1864:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:1870:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:1926:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:1933:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:1938:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x1c9b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x1cc3  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x1cd0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x1cfc  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x1d22  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x2054  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x20a9  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x20bd  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x20d5  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x20d8  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x20e7  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x21d9  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x21f8 A[Catch: Exception -> 0x2247, TryCatch #11 {Exception -> 0x2247, blocks: (B:293:0x21f2, B:295:0x21f8, B:593:0x2244), top: B:292:0x21f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x225d A[Catch: Exception -> 0x2269, TryCatch #1 {Exception -> 0x2269, blocks: (B:299:0x2257, B:301:0x225d, B:303:0x2261, B:307:0x228f, B:312:0x22b5, B:317:0x226b, B:319:0x2271), top: B:298:0x2257 }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x22c2 A[Catch: Exception -> 0x22f1, TryCatch #5 {Exception -> 0x22f1, blocks: (B:321:0x22be, B:323:0x22c2, B:325:0x22d4, B:327:0x22da, B:329:0x22de, B:331:0x22e6, B:333:0x22ec, B:336:0x2312, B:338:0x2315, B:339:0x22f5, B:341:0x22f9, B:343:0x22fd, B:345:0x2301, B:347:0x2305, B:354:0x2318, B:356:0x231c, B:358:0x233c, B:360:0x2340, B:362:0x2362, B:364:0x2368, B:366:0x236c, B:368:0x237f, B:371:0x23ab, B:373:0x23b1, B:375:0x23ef, B:377:0x23f3, B:379:0x2406, B:381:0x240c, B:386:0x2439, B:555:0x23b5, B:557:0x23bb, B:560:0x23c1, B:573:0x239b, B:574:0x2344, B:577:0x234c, B:579:0x2354, B:582:0x2320, B:584:0x2326, B:586:0x232a, B:588:0x232f), top: B:320:0x22be }] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x231c A[Catch: Exception -> 0x22f1, TryCatch #5 {Exception -> 0x22f1, blocks: (B:321:0x22be, B:323:0x22c2, B:325:0x22d4, B:327:0x22da, B:329:0x22de, B:331:0x22e6, B:333:0x22ec, B:336:0x2312, B:338:0x2315, B:339:0x22f5, B:341:0x22f9, B:343:0x22fd, B:345:0x2301, B:347:0x2305, B:354:0x2318, B:356:0x231c, B:358:0x233c, B:360:0x2340, B:362:0x2362, B:364:0x2368, B:366:0x236c, B:368:0x237f, B:371:0x23ab, B:373:0x23b1, B:375:0x23ef, B:377:0x23f3, B:379:0x2406, B:381:0x240c, B:386:0x2439, B:555:0x23b5, B:557:0x23bb, B:560:0x23c1, B:573:0x239b, B:574:0x2344, B:577:0x234c, B:579:0x2354, B:582:0x2320, B:584:0x2326, B:586:0x232a, B:588:0x232f), top: B:320:0x22be }] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x23b1 A[Catch: Exception -> 0x22f1, TryCatch #5 {Exception -> 0x22f1, blocks: (B:321:0x22be, B:323:0x22c2, B:325:0x22d4, B:327:0x22da, B:329:0x22de, B:331:0x22e6, B:333:0x22ec, B:336:0x2312, B:338:0x2315, B:339:0x22f5, B:341:0x22f9, B:343:0x22fd, B:345:0x2301, B:347:0x2305, B:354:0x2318, B:356:0x231c, B:358:0x233c, B:360:0x2340, B:362:0x2362, B:364:0x2368, B:366:0x236c, B:368:0x237f, B:371:0x23ab, B:373:0x23b1, B:375:0x23ef, B:377:0x23f3, B:379:0x2406, B:381:0x240c, B:386:0x2439, B:555:0x23b5, B:557:0x23bb, B:560:0x23c1, B:573:0x239b, B:574:0x2344, B:577:0x234c, B:579:0x2354, B:582:0x2320, B:584:0x2326, B:586:0x232a, B:588:0x232f), top: B:320:0x22be }] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x2472  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x2756  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x2793  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x279b  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x2663  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x23bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:566:0x23d6  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x23d9  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x2244 A[Catch: Exception -> 0x2247, TRY_LEAVE, TryCatch #11 {Exception -> 0x2247, blocks: (B:293:0x21f2, B:295:0x21f8, B:593:0x2244), top: B:292:0x21f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:596:0x210c  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x2174  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x2184 A[LOOP:12: B:644:0x217f->B:646:0x2184, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:647:0x2196 A[EDGE_INSN: B:647:0x2196->B:648:0x2196 BREAK  A[LOOP:12: B:644:0x217f->B:646:0x2184], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:664:0x1d59  */
    /* JADX WARN: Removed duplicated region for block: B:800:0x1cb0  */
    /* JADX WARN: Removed duplicated region for block: B:806:0x1be5  */
    /* JADX WARN: Removed duplicated region for block: B:811:0x1c48  */
    /* JADX WARN: Removed duplicated region for block: B:828:0x1c92 A[EDGE_INSN: B:828:0x1c92->B:829:0x1c92 BREAK  A[LOOP:13: B:809:0x1c43->B:824:0x1c7c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:830:0x1c07  */
    /* JADX WARN: Removed duplicated region for block: B:833:0x1a10 A[Catch: Exception -> 0x1998, TryCatch #3 {Exception -> 0x1998, blocks: (B:153:0x197f, B:156:0x198e, B:157:0x19a1, B:160:0x19b7, B:162:0x19bd, B:163:0x19c9, B:165:0x19dc, B:167:0x19e2, B:170:0x19f3, B:172:0x19f7, B:173:0x1a31, B:175:0x1a35, B:177:0x1a3e, B:178:0x1a46, B:833:0x1a10), top: B:152:0x197f }] */
    /* JADX WARN: Removed duplicated region for block: B:835:0x19b6  */
    /* JADX WARN: Removed duplicated region for block: B:845:0x199d  */
    /* JADX WARN: Removed duplicated region for block: B:849:0x196a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x16d0  */
    /* JADX WARN: Removed duplicated region for block: B:853:0x18b4  */
    /* JADX WARN: Removed duplicated region for block: B:859:0x18d7  */
    /* JADX WARN: Removed duplicated region for block: B:884:0x17e4  */
    /* JADX WARN: Removed duplicated region for block: B:896:0x1777  */
    /* JADX WARN: Removed duplicated region for block: B:898:0x1762  */
    /* JADX WARN: Removed duplicated region for block: B:901:0x1723  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x1736  */
    /* JADX WARN: Removed duplicated region for block: B:973:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x1767  */
    /* JADX WARN: Removed duplicated region for block: B:990:0x0619  */
    /* JADX WARN: Type inference failed for: r11v59, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r3v212, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v215, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r52v0, types: [android.view.View, org.telegram.ui.Cells.r2] */
    /* JADX WARN: Type inference failed for: r8v46, types: [android.text.SpannableStringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t() {
        int i10;
        float f7;
        float f10;
        boolean z10;
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
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence14;
        boolean isChannelAndNotMegaGroup;
        String formatPluralString;
        char c11;
        int i14;
        String formatPluralString2;
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
        boolean z19;
        String str7;
        String str8;
        MessagesController messagesController;
        CharSequence charSequence22;
        CharSequence escape;
        CharSequence charSequence23;
        String str9;
        String str10;
        boolean z20;
        CharSequence charSequence24;
        int i16;
        boolean z21;
        String str11;
        String str12;
        boolean z22;
        MessageObject messageObject5;
        TLRPC.Message message2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i17;
        TLRPC.Chat chat2;
        MessageObject messageObject6;
        float f11;
        int i18;
        int i19;
        float f12;
        boolean z23;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        int dp;
        int dp2;
        int dp3;
        int i20;
        int i21;
        ImageReceiver[] imageReceiverArr;
        int i22;
        int i23;
        gs gsVar;
        int max;
        CharSequence charSequence25;
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
        CharSequence charSequence26;
        int i26;
        CharSequence highlightText2;
        gs gsVar2;
        int dp5;
        int dp6;
        gs gsVar3;
        int dp7;
        CharSequence highlightText3;
        CharSequence charSequence27;
        SpannableStringBuilder I;
        if (this.j0) {
            return;
        }
        if (this.N0 && !this.E4.a() && this.J0 == 0 && this.K0 == 0 && this.h2 == null) {
            return;
        }
        if (!this.r2) {
            int i27 = SharedConfig.PASSCODE_TYPE_PIN;
        }
        org.telegram.ui.ActionBar.j6.B0[0].setTextSize(AndroidUtilities.dp(17.0f));
        org.telegram.ui.ActionBar.j6.C0[0].setTextSize(AndroidUtilities.dp(17.0f));
        org.telegram.ui.ActionBar.j6.F0[0].setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.j6.H0[0].setTextSize(AndroidUtilities.dp(16.0f));
        boolean z24 = true;
        org.telegram.ui.ActionBar.j6.B0[1].setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.j6.C0[1].setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.j6.F0[1].setTextSize(AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.j6.H0[1].setTextSize(AndroidUtilities.dp(15.0f));
        TextPaint textPaint = org.telegram.ui.ActionBar.j6.F0[1];
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i9, this.F4);
        textPaint.linkColor = v02;
        textPaint.setColor(v02);
        this.E0 = 1;
        this.H4 = 18;
        this.M0 = 0;
        CharSequence printingString = (Q() || !(this.N0 || this.P)) ? null : MessagesController.getInstance(this.F0).getPrintingString(this.H0, getTopicId(), true);
        this.a0 = org.telegram.ui.ActionBar.j6.F0[this.E0];
        this.G2 = false;
        this.f4 = false;
        this.g4 = false;
        this.h4 = false;
        this.x0 = false;
        this.y0 = false;
        this.l4 = 0;
        this.z3 = false;
        this.R1 = 0;
        this.S1 = false;
        this.D2 = false;
        boolean z25 = (UserObject.isUserSelf(this.f2) || this.u2) ? false : true;
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
        MessageObject messageObject8 = this.f1;
        if (messageObject8 != null) {
            messageObject8.updateTranslation();
        }
        MessageObject messageObject9 = this.f1;
        CharSequence charSequence28 = messageObject9 != null ? messageObject9.messageText : null;
        if (charSequence28 instanceof Spannable) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence28);
            f7 = 17.0f;
            f10 = 16.0f;
            for (m51 m51Var : (m51[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), m51.class)) {
                spannableStringBuilder2.removeSpan(m51Var);
            }
            for (l51 l51Var : (l51[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), l51.class)) {
                spannableStringBuilder2.removeSpan(l51Var);
            }
            charSequence28 = spannableStringBuilder2;
        } else {
            f7 = 17.0f;
            f10 = 16.0f;
        }
        this.i1 = charSequence28;
        if (this.F) {
            this.z3 = true;
            z10 = false;
            z25 = false;
        } else {
            z10 = true;
        }
        m2 m2Var = this.G0;
        if (m2Var != null) {
            if (m2Var.g == 2) {
                this.G2 = true;
                if (this.r2 || SharedConfig.useThreeLinesLayout) {
                    this.K2 = AndroidUtilities.dp(12.5f);
                    if (LocaleController.isRTL) {
                        this.J2 = (getMeasuredWidth() - AndroidUtilities.dp(this.I + 6)) - org.telegram.ui.ActionBar.j6.a1.getIntrinsicWidth();
                        this.x2 = AndroidUtilities.dp(22.0f);
                    } else {
                        this.J2 = AndroidUtilities.dp(this.I + 6);
                        this.x2 = org.telegram.ui.ActionBar.j6.a1.getIntrinsicWidth() + AndroidUtilities.dp(this.I + 10);
                    }
                } else {
                    this.K2 = AndroidUtilities.dp(16.5f);
                    if (LocaleController.isRTL) {
                        this.J2 = (getMeasuredWidth() - AndroidUtilities.dp(this.I + 4)) - org.telegram.ui.ActionBar.j6.a1.getIntrinsicWidth();
                        this.x2 = AndroidUtilities.dp(18.0f);
                    } else {
                        this.J2 = AndroidUtilities.dp(this.I + 4);
                        this.x2 = org.telegram.ui.ActionBar.j6.a1.getIntrinsicWidth() + AndroidUtilities.dp(this.I + 8);
                    }
                }
            } else {
                this.f4 = !this.n1 && m2Var.i;
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
            m2 m2Var2 = this.G0;
            if (m2Var2.g == 1) {
                string = LocaleController.getString(R.string.FromYou);
                m2 m2Var3 = this.G0;
                if (m2Var3.j) {
                    this.a0 = org.telegram.ui.ActionBar.j6.H0[this.E0];
                    I = I(this.f1.messageText, null, i10);
                    I.setSpan(new e10(org.telegram.ui.ActionBar.j6.o9, this.F4), 0, I.length(), 33);
                } else {
                    String str13 = m2Var3.b;
                    if (str13.length() > 150) {
                        str13 = str13.substring(0, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    }
                    I = (this.r2 || SharedConfig.useThreeLinesLayout) ? I(str13, string, i10) : I(str13.replace('\n', ' '), string, i10);
                }
                charSequence27 = Emoji.replaceEmoji(I, org.telegram.ui.ActionBar.j6.F0[this.E0].getFontMetricsInt(), false);
                z20 = false;
            } else {
                charSequence27 = m2Var2.b;
                if (m2Var2.j) {
                    this.a0 = org.telegram.ui.ActionBar.j6.H0[this.E0];
                }
                string = null;
                z20 = true;
            }
            str10 = LocaleController.stringForMessageListDate(this.G0.h);
            int i28 = this.G0.d;
            if (i28 != 0) {
                this.G3 = true;
                str7 = String.format("%d", Integer.valueOf(i28));
            } else {
                this.G3 = false;
                str7 = null;
            }
            m2 m2Var4 = this.G0;
            int i29 = m2Var4.k;
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
            charSequence22 = m2Var4.a;
            replaceEmoji = charSequence27;
            str9 = null;
            charSequence24 = null;
            charSequence23 = "";
            i13 = -1;
        } else {
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
                            this.J2 = (getMeasuredWidth() - AndroidUtilities.dp(this.I + 6)) - org.telegram.ui.ActionBar.j6.a1.getIntrinsicWidth();
                            this.x2 = AndroidUtilities.dp(22.0f);
                        } else {
                            this.J2 = AndroidUtilities.dp(this.I + 6);
                            this.x2 = org.telegram.ui.ActionBar.j6.a1.getIntrinsicWidth() + AndroidUtilities.dp(this.I + 10);
                        }
                    } else {
                        this.K2 = AndroidUtilities.dp(16.5f);
                        if (LocaleController.isRTL) {
                            this.J2 = (getMeasuredWidth() - AndroidUtilities.dp(this.I + 4)) - org.telegram.ui.ActionBar.j6.a1.getIntrinsicWidth();
                            this.x2 = AndroidUtilities.dp(18.0f);
                        } else {
                            this.J2 = AndroidUtilities.dp(this.I + 4);
                            this.x2 = org.telegram.ui.ActionBar.j6.a1.getIntrinsicWidth() + AndroidUtilities.dp(this.I + 8);
                        }
                    }
                }
            } else if (this.J0 == 0 && !this.P) {
                TLRPC.Chat chat3 = this.g2;
                if (chat3 != null) {
                    long botVerificationIcon = DialogObject.getBotVerificationIcon(chat3);
                    TLRPC.Chat chat4 = this.g2;
                    if (chat4.scam) {
                        this.l4 = 1;
                        org.telegram.ui.ActionBar.j6.g1.a();
                    } else if (chat4.fake) {
                        this.l4 = 2;
                        org.telegram.ui.ActionBar.j6.h1.a();
                    } else if (DialogObject.getEmojiStatusDocumentId(chat4.emoji_status) != 0) {
                        this.h4 = true;
                        this.D2 = true;
                        org.telegram.ui.Components.o5 o5Var = this.j4;
                        o5Var.a = LocaleController.isRTL;
                        o5Var.j(DialogObject.getEmojiStatusDocumentId(this.g2.emoji_status), false);
                        this.j4.m(DialogObject.isEmojiStatusCollectible(this.g2.emoji_status), false);
                    } else {
                        boolean z26 = this.n1;
                        this.f4 = !z26 && this.g2.verified;
                        this.g4 = (z26 || this.g2.bot_verification_icon == 0) ? false : true;
                    }
                    charSequence = charSequence28;
                    j3 = botVerificationIcon;
                    i11 = i10;
                } else {
                    TLRPC.User user3 = this.f2;
                    if (user3 != null) {
                        j3 = DialogObject.getBotVerificationIcon(user3);
                        TLRPC.User user4 = this.f2;
                        if (user4.scam) {
                            this.l4 = 1;
                            org.telegram.ui.ActionBar.j6.g1.a();
                        } else if (user4.fake) {
                            this.l4 = 2;
                            org.telegram.ui.ActionBar.j6.h1.a();
                        } else {
                            boolean z27 = this.n1;
                            this.f4 = !z27 && user4.verified;
                            if (z27 || UserObject.isUserSelf(user4)) {
                                charSequence = charSequence28;
                            } else {
                                charSequence = charSequence28;
                                if (this.f2.bot_verification_icon != 0) {
                                    z11 = true;
                                    this.g4 = z11;
                                    if (MessagesController.getInstance(this.F0).isPremiumUser(this.f2)) {
                                        long j10 = UserConfig.getInstance(this.F0).clientUserId;
                                        i11 = i10;
                                        long j11 = this.f2.id;
                                        if (j10 != j11 && j11 != 0) {
                                            z12 = true;
                                            this.h4 = z12;
                                            if (z12) {
                                                Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(this.f2);
                                                org.telegram.ui.Components.o5 o5Var2 = this.j4;
                                                o5Var2.a = LocaleController.isRTL;
                                                if (emojiStatusDocumentId != null) {
                                                    this.D2 = true;
                                                    o5Var2.j(emojiStatusDocumentId.longValue(), false);
                                                    this.j4.m(DialogObject.isEmojiStatusCollectible(this.f2.emoji_status), false);
                                                } else {
                                                    this.D2 = true;
                                                    o5Var2.g(sg.d1.d().e, false);
                                                    this.j4.m(false, false);
                                                }
                                            }
                                        }
                                    } else {
                                        i11 = i10;
                                    }
                                    z12 = false;
                                    this.h4 = z12;
                                    if (z12) {
                                    }
                                }
                            }
                            z11 = false;
                            this.g4 = z11;
                            if (MessagesController.getInstance(this.F0).isPremiumUser(this.f2)) {
                            }
                            z12 = false;
                            this.h4 = z12;
                            if (z12) {
                            }
                        }
                        charSequence = charSequence28;
                        if (MessagesController.getInstance(this.F0).isPremiumUser(this.f2)) {
                        }
                        z12 = false;
                        this.h4 = z12;
                        if (z12) {
                        }
                    } else {
                        i11 = i10;
                        charSequence = charSequence28;
                        j3 = 0;
                    }
                }
                if (j3 != 0 && this.g4) {
                    this.k4.j(j3, false);
                }
                i12 = this.R0;
                if (i12 == 0 && (messageObject6 = this.f1) != null) {
                    i12 = messageObject6.messageOwner.date;
                }
                if (!this.P) {
                    boolean z28 = MediaDataController.getInstance(this.F0).getDraftVoice(this.H0, (long) getTopicId()) != null;
                    this.k2 = z28;
                    TLRPC.DraftMessage draft = !z28 ? MediaDataController.getInstance(this.F0).getDraft(this.H0, getTopicId()) : null;
                    this.l2 = draft;
                    if (draft != null && TextUtils.isEmpty(draft.message)) {
                        this.l2 = null;
                    }
                } else if (this.N0 || this.s0) {
                    boolean z29 = MediaDataController.getInstance(this.F0).getDraftVoice(this.H0, (long) getTopicId()) != null;
                    this.k2 = z29;
                    this.l2 = !z29 ? MediaDataController.getInstance(this.F0).getDraft(this.H0, 0L) : null;
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
                                MessageObject messageObject10 = this.f1;
                                String L = this.f1 != null ? L(i17, string, messageObject10 != null ? MessagesController.getInstance(messageObject10.currentAccount).getRestrictionReason(this.f1.messageOwner.restriction_reason) : null, true) : "";
                                CharSequence charSequence29 = L;
                                if (this.e0) {
                                    int length = L.length();
                                    charSequence29 = L;
                                    charSequence29 = L;
                                    if (length >= 0 && string != null) {
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(L);
                                        valueOf.setSpan(new e10(org.telegram.ui.ActionBar.j6.X8, this.F4), 0, Math.min(valueOf.length(), string.length() + 1), 0);
                                        charSequence29 = valueOf;
                                    }
                                }
                                this.a0 = org.telegram.ui.ActionBar.j6.F0[this.E0];
                                z16 = z10;
                                charSequence20 = charSequence29;
                            } else {
                                int i30 = i11;
                                if (TextUtils.isEmpty(this.I0)) {
                                    if (printingString != null) {
                                        this.i2 = printingString;
                                        z14 = z25;
                                        charSequence2 = charSequence;
                                        int intValue = MessagesController.getInstance(this.F0).getPrintingStringType(this.H0, getTopicId()).intValue();
                                        this.j2 = intValue;
                                        kw0 t02 = org.telegram.ui.ActionBar.j6.t0(intValue);
                                        int dp8 = t02 != null ? AndroidUtilities.dp(3.0f) + t02.getIntrinsicWidth() : 0;
                                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                        CharSequence replace = TextUtils.replace(printingString, new String[]{"..."}, new String[]{""});
                                        int indexOf = this.j2 == 5 ? replace.toString().indexOf("**oo**") : -1;
                                        if (indexOf >= 0) {
                                            spannableStringBuilder3.append(replace).setSpan(new p2(org.telegram.ui.ActionBar.j6.t0(this.j2).getIntrinsicWidth()), indexOf, indexOf + 6, 0);
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) " ").append(replace).setSpan(new p2(dp8), 0, 1, 0);
                                        }
                                        i13 = indexOf;
                                        z15 = false;
                                        charSequence3 = spannableStringBuilder3;
                                    } else {
                                        z14 = z25;
                                        charSequence2 = charSequence;
                                        this.i2 = null;
                                        this.j2 = -1;
                                        charSequence3 = "";
                                        z15 = true;
                                        i13 = -1;
                                    }
                                    if (this.k2 || this.l2 != null) {
                                        z16 = z10;
                                        charSequence4 = " ";
                                        CharSequence charSequence30 = charSequence3;
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
                                                spannableString.setSpan(new e10(org.telegram.ui.ActionBar.j6.p9, this.F4), 0, spannableString.length(), 33);
                                            }
                                            SpannableStringBuilder I2 = I(AndroidUtilities.replaceNewLines(spannableString), string, i30);
                                            if ((this.r2 || SharedConfig.useThreeLinesLayout) && !M()) {
                                                z17 = false;
                                            } else {
                                                z17 = false;
                                                I2.setSpan(new e10(org.telegram.ui.ActionBar.j6.j9, this.F4), 0, string.length() + 1, 33);
                                            }
                                            replaceEmoji = Emoji.replaceEmoji(I2, org.telegram.ui.ActionBar.j6.F0[this.E0].getFontMetricsInt(), z17);
                                            charSequence6 = charSequence30;
                                        } else if ((this.r2 || SharedConfig.useThreeLinesLayout) && !M()) {
                                            charSequence6 = charSequence30;
                                            replaceEmoji = "";
                                        } else {
                                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string);
                                            z24 = false;
                                            valueOf2.setSpan(new e10(org.telegram.ui.ActionBar.j6.j9, this.F4), 0, string.length(), 33);
                                            replaceEmoji = valueOf2;
                                            charSequence8 = charSequence30;
                                            z25 = z14;
                                            charSequence7 = null;
                                            charSequence21 = charSequence8;
                                            if (!this.x0 && !P() && !Q() && !O() && this.l2 == null && (messageObject5 = this.f1) != null && (message2 = messageObject5.messageOwner) != null && (message2.action instanceof TLRPC.TL_messageActionStarGift)) {
                                                this.y0 = true;
                                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceEmoji);
                                                spannableStringBuilder4.insert(0, (CharSequence) "d ");
                                                nq nqVar = new nq(f0.e.d(getContext(), R.drawable.mini_gift).mutate());
                                                nqVar.setScale(1.25f, 1.25f);
                                                nqVar.spaceScaleX = 0.9f;
                                                nqVar.setAlpha(0.9f);
                                                spannableStringBuilder4.setSpan(nqVar, 0, 1, 0);
                                                tL_textWithEntities = ((TLRPC.TL_messageActionStarGift) this.f1.messageOwner.action).message;
                                                if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                                                    this.a0 = org.telegram.ui.ActionBar.j6.F0[this.E0];
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
                                                    z19 = false;
                                                    this.G3 = false;
                                                    this.X3 = false;
                                                    this.Y3 = false;
                                                    this.Z3 = false;
                                                    this.t3 = false;
                                                    str7 = null;
                                                    str8 = null;
                                                } else {
                                                    if (this.J0 != 0) {
                                                        int i32 = this.S0;
                                                        int i33 = this.U0;
                                                        int i34 = i32 + i33;
                                                        if (i34 <= 0) {
                                                            z22 = false;
                                                            this.G3 = false;
                                                            this.X3 = false;
                                                            str12 = null;
                                                        } else if (i32 > i33) {
                                                            this.G3 = true;
                                                            z22 = false;
                                                            this.X3 = false;
                                                            str11 = String.format("%d", Integer.valueOf(i34));
                                                            str12 = null;
                                                            this.Y3 = z22;
                                                            this.Z3 = z22;
                                                        } else {
                                                            z22 = false;
                                                            this.G3 = false;
                                                            this.X3 = true;
                                                            str12 = String.format("%d", Integer.valueOf(i34));
                                                        }
                                                        str11 = null;
                                                        this.Y3 = z22;
                                                        this.Z3 = z22;
                                                    } else {
                                                        if (this.h1) {
                                                            this.G3 = false;
                                                            z25 = false;
                                                            z21 = true;
                                                        } else {
                                                            int i35 = this.S0;
                                                            if (i35 != 0) {
                                                                z21 = true;
                                                                this.G3 = true;
                                                                str11 = String.format("%d", Integer.valueOf(i35));
                                                            } else {
                                                                z21 = true;
                                                                if (this.T0) {
                                                                    this.G3 = true;
                                                                    str11 = "";
                                                                } else {
                                                                    this.G3 = false;
                                                                }
                                                            }
                                                            if (this.U0 == 0) {
                                                                this.X3 = z21;
                                                                str12 = "@";
                                                            } else {
                                                                this.X3 = false;
                                                                str12 = null;
                                                            }
                                                            this.Y3 = this.V0 <= 0;
                                                            this.Z3 = this.W0 <= 0;
                                                        }
                                                        str11 = null;
                                                        if (this.U0 == 0) {
                                                        }
                                                        this.Y3 = this.V0 <= 0;
                                                        this.Z3 = this.W0 <= 0;
                                                    }
                                                    if (this.f1.isOut() && this.l2 == null && z25) {
                                                        MessageObject messageObject11 = this.f1;
                                                        if (!(messageObject11.messageOwner.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                                                            if (messageObject11.isSending()) {
                                                                z19 = false;
                                                                this.Q2 = false;
                                                                this.R2 = false;
                                                                this.S2 = true;
                                                                this.t3 = false;
                                                            } else {
                                                                z19 = false;
                                                                if (this.f1.isSendError()) {
                                                                    this.Q2 = false;
                                                                    this.R2 = false;
                                                                    this.S2 = false;
                                                                    this.t3 = true;
                                                                    this.G3 = false;
                                                                    this.X3 = false;
                                                                } else if (this.f1.isSent()) {
                                                                    TLRPC.TL_forumTopic tL_forumTopic = this.N;
                                                                    if (tL_forumTopic != null) {
                                                                        this.Q2 = tL_forumTopic.read_outbox_max_id >= this.f1.getId();
                                                                    } else if (this.N0) {
                                                                        int i36 = this.D4;
                                                                        this.Q2 = (i36 > 0 && i36 >= this.f1.getId()) || !this.f1.isUnread() || (ChatObject.isChannel(this.g2) && !this.g2.megagroup);
                                                                    } else {
                                                                        this.Q2 = !this.f1.isUnread() || (ChatObject.isChannel(this.g2) && !this.g2.megagroup);
                                                                    }
                                                                    this.R2 = true;
                                                                    z19 = false;
                                                                    this.S2 = false;
                                                                    this.t3 = false;
                                                                } else {
                                                                    z19 = false;
                                                                }
                                                            }
                                                            str8 = str12;
                                                            str7 = str11;
                                                        }
                                                    }
                                                    z19 = false;
                                                    this.Q2 = false;
                                                    this.R2 = false;
                                                    this.S2 = false;
                                                    this.t3 = false;
                                                    str8 = str12;
                                                    str7 = str11;
                                                }
                                                this.P2 = z19;
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
                                                                escape = this.g0 ? og.d.j(this.N, org.telegram.ui.ActionBar.j6.B0[this.E0], drawableArr) : AndroidUtilities.escape(this.N.title);
                                                            } else if (!chat5.monoforum || chat5.linked_monoforum_id == 0) {
                                                                escape = AndroidUtilities.escape(chat5.title);
                                                            } else {
                                                                TLRPC.Chat chat6 = MessagesController.getInstance(this.F0).getChat(Long.valueOf(this.g2.linked_monoforum_id));
                                                                if (chat6 != null) {
                                                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(AndroidUtilities.escape(chat6.title));
                                                                    spannableStringBuilder5.append(charSequence4);
                                                                    int length3 = spannableStringBuilder5.length();
                                                                    spannableStringBuilder5.append((CharSequence) LocaleController.getString(R.string.MonoforumSpan));
                                                                    spannableStringBuilder5.setSpan(new org.telegram.ui.e10(LocaleController.getString(R.string.MonoforumSpan), org.telegram.ui.ActionBar.j6.y6, this.F4), length3, spannableStringBuilder5.length(), 33);
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
                                                                        escape = this.g0 ? og.d.j(this.N, org.telegram.ui.ActionBar.j6.B0[this.E0], drawableArr2) : AndroidUtilities.escape(this.N.title);
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
                                                z20 = z24;
                                                charSequence24 = charSequence7;
                                            }
                                            stringForMessageListDate = "";
                                            messageObject4 = this.f1;
                                            if (messageObject4 != null) {
                                            }
                                            this.Q2 = false;
                                            this.R2 = false;
                                            this.S2 = messageObject4 == null && messageObject4.isSending() && this.H0 == UserConfig.getInstance(this.F0).getClientUserId();
                                            z19 = false;
                                            this.G3 = false;
                                            this.X3 = false;
                                            this.Y3 = false;
                                            this.Z3 = false;
                                            this.t3 = false;
                                            str7 = null;
                                            str8 = null;
                                            this.P2 = z19;
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
                                            z20 = z24;
                                            charSequence24 = charSequence7;
                                        }
                                        z25 = z14;
                                        charSequence7 = null;
                                        z24 = false;
                                        charSequence21 = charSequence6;
                                        if (!this.x0) {
                                            this.y0 = true;
                                            SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder(replaceEmoji);
                                            spannableStringBuilder42.insert(0, (CharSequence) "d ");
                                            nq nqVar2 = new nq(f0.e.d(getContext(), R.drawable.mini_gift).mutate());
                                            nqVar2.setScale(1.25f, 1.25f);
                                            nqVar2.spaceScaleX = 0.9f;
                                            nqVar2.setAlpha(0.9f);
                                            spannableStringBuilder42.setSpan(nqVar2, 0, 1, 0);
                                            tL_textWithEntities = ((TLRPC.TL_messageActionStarGift) this.f1.messageOwner.action).message;
                                            if (tL_textWithEntities != null) {
                                                this.a0 = org.telegram.ui.ActionBar.j6.F0[this.E0];
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
                                        z19 = false;
                                        this.G3 = false;
                                        this.X3 = false;
                                        this.Y3 = false;
                                        this.Z3 = false;
                                        this.t3 = false;
                                        str7 = null;
                                        str8 = null;
                                        this.P2 = z19;
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
                                        z20 = z24;
                                        charSequence24 = charSequence7;
                                    } else {
                                        if (this.h1) {
                                            this.a0 = org.telegram.ui.ActionBar.j6.H0[this.E0];
                                            formatString = LocaleController.getString(R.string.HistoryCleared);
                                        } else {
                                            MessageObject messageObject12 = this.f1;
                                            if (messageObject12 != null) {
                                                String restrictionReason = MessagesController.getInstance(messageObject12.currentAccount).getRestrictionReason(this.f1.messageOwner.restriction_reason);
                                                long fromChatId = this.f1.getFromChatId();
                                                if (DialogObject.isUserDialog(fromChatId)) {
                                                    MessagesController.getInstance(this.F0).getUser(Long.valueOf(fromChatId));
                                                    chat = null;
                                                } else {
                                                    chat = MessagesController.getInstance(this.F0).getChat(Long.valueOf(-fromChatId));
                                                }
                                                this.H3 = true;
                                                if (this.j1 == 0) {
                                                    charSequence9 = " ";
                                                    if (this.H0 > 0 && this.f1.isOutOwner() && (tL_messageReactions = this.f1.messageOwner.reactions) != null && (arrayList2 = tL_messageReactions.recent_reactions) != null && !arrayList2.isEmpty() && this.V0 > 0) {
                                                        TLRPC.MessagePeerReaction messagePeerReaction = this.f1.messageOwner.reactions.recent_reactions.get(0);
                                                        if (messagePeerReaction.unread) {
                                                            long j12 = messagePeerReaction.peer_id.user_id;
                                                            if (j12 != 0 && j12 != UserConfig.getInstance(this.F0).clientUserId) {
                                                                ah.j1 d = ah.j1.d(messagePeerReaction.reaction);
                                                                this.a0 = org.telegram.ui.ActionBar.j6.H0[this.E0];
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
                                                                    spannableStringBuilder6.setSpan(new org.telegram.ui.Components.z5(j13, textPaint3 == null ? null : textPaint3.getFontMetricsInt()), indexOf2, indexOf2 + 1, 0);
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
                                                                        this.H3 = false;
                                                                        str4 = str5;
                                                                    } else if (i37 == 3 && UserObject.isUserSelf(this.f2)) {
                                                                        uy uyVar = this.z4;
                                                                        str4 = LocaleController.getString((uyVar == null || !uyVar.O0) ? R.string.SavedMessagesInfo : R.string.SavedMessagesInfoQuote);
                                                                    } else {
                                                                        boolean z30 = this.r2;
                                                                        if (!z30 && !SharedConfig.useThreeLinesLayout && this.K0 != 0) {
                                                                            G = H();
                                                                        } else if (z30 || SharedConfig.useThreeLinesLayout || this.J0 == 0) {
                                                                            MessageObject messageObject13 = this.f1;
                                                                            if (!(messageObject13.messageOwner instanceof TLRPC.TL_messageService) || (MessageObject.isTopicActionMessage(messageObject13) && !(this.f1.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate))) {
                                                                                CharSequence charSequence31 = charSequence2;
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
                                                                                        CharSequence charSequence32 = restrictionReason;
                                                                                        if (isEmpty) {
                                                                                            if (MessageObject.isTopicActionMessage(this.f1)) {
                                                                                                MessageObject messageObject14 = this.f1;
                                                                                                CharSequence charSequence33 = messageObject14.messageTextShort;
                                                                                                if (charSequence33 == null || ((messageObject14.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate) && this.P)) {
                                                                                                    charSequence33 = messageObject14.messageText;
                                                                                                }
                                                                                                CharSequence charSequence34 = charSequence33;
                                                                                                charSequence32 = charSequence34;
                                                                                                if (messageObject14.topicIconDrawable[0] instanceof og.a) {
                                                                                                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.F0).getTopicsController().findTopic(-this.f1.getDialogId(), MessageObject.getTopicId(this.F0, this.f1.messageOwner, true));
                                                                                                    charSequence32 = charSequence34;
                                                                                                    if (findTopic != null) {
                                                                                                        ((og.a) this.f1.topicIconDrawable[0]).b(findTopic.icon_color);
                                                                                                        charSequence32 = charSequence34;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                TLRPC.MessageMedia messageMedia = this.f1.messageOwner.media;
                                                                                                if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                                                                                                    charSequence32 = LocaleController.getString(R.string.AttachPhotoExpired);
                                                                                                } else {
                                                                                                    if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                                                                                        TLRPC.Document document = messageMedia.document;
                                                                                                        if (((document instanceof TLRPC.TL_documentEmpty) || document == null) && messageMedia.ttl_seconds != 0) {
                                                                                                            charSequence32 = messageMedia.voice ? LocaleController.getString(R.string.AttachVoiceExpired) : messageMedia.round ? LocaleController.getString(R.string.AttachRoundExpired) : LocaleController.getString(R.string.AttachVideoExpired);
                                                                                                        }
                                                                                                    }
                                                                                                    String str16 = "🎧 ";
                                                                                                    if (getCaptionMessage() == null || (this.f1.messageOwner.media instanceof TLRPC.TL_messageMediaPoll)) {
                                                                                                        MessageObject messageObject15 = this.f1;
                                                                                                        TLRPC.Message message3 = messageObject15.messageOwner;
                                                                                                        TLRPC.MessageMedia messageMedia2 = message3.media;
                                                                                                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                                                                                            int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia2).extended_media.size();
                                                                                                            if (this.S1) {
                                                                                                                i14 = 1;
                                                                                                                if (size > 1) {
                                                                                                                    c11 = 0;
                                                                                                                    formatPluralString2 = LocaleController.formatPluralString("Media", size, new Object[0]);
                                                                                                                } else {
                                                                                                                    c11 = 0;
                                                                                                                    formatPluralString2 = LocaleController.getString(R.string.AttachVideo);
                                                                                                                }
                                                                                                            } else {
                                                                                                                c11 = 0;
                                                                                                                i14 = 1;
                                                                                                                formatPluralString2 = size > 1 ? LocaleController.formatPluralString("Photos", size, new Object[0]) : LocaleController.getString(R.string.AttachPhoto);
                                                                                                            }
                                                                                                            int i40 = R.string.AttachPaidMedia;
                                                                                                            Object[] objArr = new Object[i14];
                                                                                                            objArr[c11] = formatPluralString2;
                                                                                                            SpannableStringBuilder Q0 = zh.v7.Q0(LocaleController.formatString(i40, objArr));
                                                                                                            this.a0 = org.telegram.ui.ActionBar.j6.H0[this.E0];
                                                                                                            charSequence32 = Q0;
                                                                                                        } else if (this.R1 > 1) {
                                                                                                            if (this.S1) {
                                                                                                                ArrayList arrayList3 = this.g1;
                                                                                                                formatPluralString = LocaleController.formatPluralString("Media", arrayList3 == null ? 0 : arrayList3.size(), new Object[0]);
                                                                                                            } else {
                                                                                                                ArrayList arrayList4 = this.g1;
                                                                                                                formatPluralString = LocaleController.formatPluralString("Photos", arrayList4 == null ? 0 : arrayList4.size(), new Object[0]);
                                                                                                            }
                                                                                                            charSequence32 = formatPluralString;
                                                                                                            this.a0 = org.telegram.ui.ActionBar.j6.H0[this.E0];
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
                                                                                                                    spannableStringBuilder = nh.a.a(R.drawable.dialog_media_poll_20, tL_textWithEntities2.text, false);
                                                                                                                } else {
                                                                                                                    SpannableString spannableString2 = new SpannableString(tL_messageMediaPoll.poll.question.text);
                                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaPoll.poll.question;
                                                                                                                    MediaDataController.addTextStyleRuns(tL_textWithEntities3.entities, tL_textWithEntities3.text, spannableString2);
                                                                                                                    MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString2, org.telegram.ui.ActionBar.j6.F0[this.E0].getFontMetricsInt());
                                                                                                                    spannableStringBuilder = nh.a.a(R.drawable.dialog_media_poll_20, spannableString2, false);
                                                                                                                }
                                                                                                                charSequence14 = spannableStringBuilder;
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                                                                                                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia2;
                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                                                                                                                if (tL_textWithEntities4 == null || tL_textWithEntities4.entities == null) {
                                                                                                                    charSequence14 = nh.a.a(R.drawable.dialog_media_checklist_20, tL_textWithEntities4.text, false);
                                                                                                                } else {
                                                                                                                    SpannableString spannableString3 = new SpannableString(tL_messageMediaToDo.todo.title.text);
                                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_messageMediaToDo.todo.title;
                                                                                                                    MediaDataController.addTextStyleRuns(tL_textWithEntities5.entities, tL_textWithEntities5.text, spannableString3);
                                                                                                                    MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString3, org.telegram.ui.ActionBar.j6.F0[this.E0].getFontMetricsInt());
                                                                                                                    charSequence14 = nh.a.a(R.drawable.dialog_media_checklist_20, spannableString3, false);
                                                                                                                }
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                                                                                charSequence14 = nh.a.a(R.drawable.dialog_media_game_20, messageMedia2.game.title, false);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice) {
                                                                                                                charSequence14 = messageMedia2.title;
                                                                                                            } else if (messageObject15.type == 14) {
                                                                                                                charSequence14 = com.google.android.gms.internal.vision.e2.j("🎧 ", messageObject15.getMusicAuthor(), " - ", this.f1.getMusicTitle());
                                                                                                            } else if (!(messageMedia2 instanceof TLRPC.TL_messageMediaStory) || !messageMedia2.via_mention) {
                                                                                                                if (!messageObject15.hasHighlightedWords() || TextUtils.isEmpty(this.f1.messageOwner.message)) {
                                                                                                                    SpannableString spannableString4 = new SpannableString(charSequence31);
                                                                                                                    MessageObject messageObject16 = this.f1;
                                                                                                                    if (messageObject16 != null) {
                                                                                                                        messageObject16.spoilLoginCode();
                                                                                                                    }
                                                                                                                    MediaDataController.addTextStyleRuns(this.f1, spannableString4, 264);
                                                                                                                    MessageObject messageObject17 = this.f1;
                                                                                                                    charSequence13 = spannableString4;
                                                                                                                    if (messageObject17 != null) {
                                                                                                                        TLRPC.Message message4 = messageObject17.messageOwner;
                                                                                                                        charSequence13 = spannableString4;
                                                                                                                        if (message4 != null) {
                                                                                                                            ArrayList<TLRPC.MessageEntity> arrayList5 = message4.entities;
                                                                                                                            TextPaint textPaint4 = this.a0;
                                                                                                                            MediaDataController.addAnimatedEmojiSpans(arrayList5, spannableString4, textPaint4 == null ? null : textPaint4.getFontMetricsInt());
                                                                                                                            charSequence13 = spannableString4;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    CharSequence charSequence35 = this.f1.messageTrimmedToHighlight;
                                                                                                                    int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.I + 23);
                                                                                                                    MessageObject messageObject18 = this.f1;
                                                                                                                    charSequence13 = charSequence35;
                                                                                                                    if (messageObject18.messageTrimmedToHighlightCut) {
                                                                                                                        charSequence13 = AndroidUtilities.ellipsizeCenterEnd(charSequence35, messageObject18.highlightedWords.get(0), measuredWidth, this.a0, 130);
                                                                                                                    }
                                                                                                                }
                                                                                                                AndroidUtilities.highlightText(charSequence13, this.f1.highlightedWords, this.F4);
                                                                                                                charSequence14 = charSequence13;
                                                                                                            } else if (messageObject15.isOut()) {
                                                                                                                TLRPC.User user7 = MessagesController.getInstance(this.F0).getUser(Long.valueOf(this.f1.getDialogId()));
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
                                                                                                            CharSequence charSequence36 = charSequence14;
                                                                                                            MessageObject messageObject19 = this.f1;
                                                                                                            if (messageObject19.messageOwner.media == null || messageObject19.isMediaEmpty()) {
                                                                                                                TL_iv.RichMessage richMessage2 = this.f1.messageOwner.rich_message;
                                                                                                                charSequence32 = charSequence36;
                                                                                                                if (richMessage2 != null) {
                                                                                                                    charSequence32 = charSequence36;
                                                                                                                    if (richMessage2.blocks.size() == 1) {
                                                                                                                        charSequence32 = charSequence36;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            this.a0 = org.telegram.ui.ActionBar.j6.H0[this.E0];
                                                                                                            charSequence32 = charSequence36;
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
                                                                                                            charSequence32 = new SpannableStringBuilder(str16).append((CharSequence) spannableString5);
                                                                                                        } else {
                                                                                                            CharSequence charSequence37 = captionMessage.messageTrimmedToHighlight;
                                                                                                            int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(this.I + 47);
                                                                                                            if (this.W) {
                                                                                                                if (!TextUtils.isEmpty(null)) {
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                measuredWidth2 = (int) (measuredWidth2 - this.a0.measureText(": "));
                                                                                                            }
                                                                                                            if (measuredWidth2 > 0 && captionMessage.messageTrimmedToHighlightCut) {
                                                                                                                charSequence37 = AndroidUtilities.ellipsizeCenterEnd(charSequence37, captionMessage.highlightedWords.get(0), measuredWidth2, this.a0, 130);
                                                                                                            }
                                                                                                            charSequence32 = new SpannableStringBuilder(str16).append(charSequence37);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        CharSequence charSequence38 = charSequence32;
                                                                                        if (this.f1.isReplyToStory()) {
                                                                                            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(charSequence32);
                                                                                            spannableStringBuilder7.insert(0, (CharSequence) "d ");
                                                                                            spannableStringBuilder7.setSpan(new nq(f0.e.d(getContext(), R.drawable.msg_mini_replystory).mutate()), 0, 1, 0);
                                                                                            charSequence38 = spannableStringBuilder7;
                                                                                        }
                                                                                        if (this.R1 > 0) {
                                                                                            if (!this.f1.hasHighlightedWords() || TextUtils.isEmpty(this.f1.messageOwner.message)) {
                                                                                                int length4 = charSequence38.length();
                                                                                                CharSequence charSequence39 = charSequence38;
                                                                                                if (length4 > 150) {
                                                                                                    charSequence39 = charSequence38.subSequence(0, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                                                                                                }
                                                                                                replaceNewLines = AndroidUtilities.replaceNewLines(charSequence39);
                                                                                            } else {
                                                                                                replaceNewLines = this.f1.messageTrimmedToHighlight;
                                                                                                int measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp((((this.H4 + 2) * this.R1) + (this.I + 23)) + 3);
                                                                                                MessageObject messageObject20 = this.f1;
                                                                                                if (messageObject20.messageTrimmedToHighlightCut) {
                                                                                                    replaceNewLines = AndroidUtilities.ellipsizeCenterEnd(replaceNewLines, messageObject20.highlightedWords.get(0), measuredWidth3, this.a0, 130);
                                                                                                }
                                                                                            }
                                                                                            CharSequence spannableStringBuilder8 = !(replaceNewLines instanceof SpannableStringBuilder) ? new SpannableStringBuilder(replaceNewLines) : replaceNewLines;
                                                                                            SpannableStringBuilder spannableStringBuilder9 = (SpannableStringBuilder) spannableStringBuilder8;
                                                                                            charSequence4 = charSequence9;
                                                                                            spannableStringBuilder9.insert(0, charSequence4);
                                                                                            spannableStringBuilder9.setSpan(new p2(AndroidUtilities.dp(((this.H4 + 2) * this.R1) + 3)), 0, 1, 33);
                                                                                            Emoji.replaceEmoji(spannableStringBuilder9, org.telegram.ui.ActionBar.j6.F0[this.E0].getFontMetricsInt(), false);
                                                                                            CharSequence charSequence40 = spannableStringBuilder8;
                                                                                            if (this.f1.hasHighlightedWords()) {
                                                                                                CharSequence highlightText4 = AndroidUtilities.highlightText(spannableStringBuilder9, this.f1.highlightedWords, this.F4);
                                                                                                charSequence40 = spannableStringBuilder8;
                                                                                                if (highlightText4 != null) {
                                                                                                    charSequence40 = highlightText4;
                                                                                                }
                                                                                            }
                                                                                            z15 = false;
                                                                                            charSequence11 = charSequence40;
                                                                                        } else {
                                                                                            charSequence4 = charSequence9;
                                                                                            charSequence11 = charSequence38;
                                                                                        }
                                                                                        if (this.f1.isForwarded() && this.f1.needDrawForwarded()) {
                                                                                            this.x0 = true;
                                                                                            SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder(charSequence11);
                                                                                            spannableStringBuilder10.insert(0, (CharSequence) "d ");
                                                                                            nq nqVar3 = new nq(f0.e.d(getContext(), R.drawable.mini_forwarded).mutate());
                                                                                            nqVar3.setAlpha(0.9f);
                                                                                            spannableStringBuilder10.setSpan(nqVar3, 0, 1, 0);
                                                                                            charSequence12 = spannableStringBuilder10;
                                                                                        } else {
                                                                                            charSequence12 = charSequence11;
                                                                                        }
                                                                                        z25 = z14;
                                                                                        charSequence18 = charSequence12;
                                                                                        str3 = null;
                                                                                        charSequence15 = charSequence18;
                                                                                        if (this.K0 == 0) {
                                                                                            str6 = H();
                                                                                        } else if (this.J0 != 0) {
                                                                                            str6 = G();
                                                                                        } else {
                                                                                            z24 = z15;
                                                                                            replaceEmoji = charSequence15;
                                                                                            charSequence8 = charSequence10;
                                                                                            string = str3;
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
                                                                                            z19 = false;
                                                                                            this.G3 = false;
                                                                                            this.X3 = false;
                                                                                            this.Y3 = false;
                                                                                            this.Z3 = false;
                                                                                            this.t3 = false;
                                                                                            str7 = null;
                                                                                            str8 = null;
                                                                                            this.P2 = z19;
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
                                                                                            z20 = z24;
                                                                                            charSequence24 = charSequence7;
                                                                                        }
                                                                                        z24 = z15;
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
                                                                                        z19 = false;
                                                                                        this.G3 = false;
                                                                                        this.X3 = false;
                                                                                        this.Y3 = false;
                                                                                        this.Z3 = false;
                                                                                        this.t3 = false;
                                                                                        str7 = null;
                                                                                        str8 = null;
                                                                                        this.P2 = z19;
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
                                                                                        z20 = z24;
                                                                                        charSequence24 = charSequence7;
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
                                                                                        nq nqVar4 = new nq(f0.e.d(ApplicationLoader.applicationContext, R.drawable.msg_mini_forumarrow).mutate());
                                                                                        nqVar4.setColorKey((this.r2 || SharedConfig.useThreeLinesLayout) ? -1 : org.telegram.ui.ActionBar.j6.k9);
                                                                                        spannableStringBuilder11.setSpan(nqVar4, 0, 1, 0);
                                                                                        ?? spannableStringBuilder12 = new SpannableStringBuilder();
                                                                                        spannableStringBuilder12.append(escape3).append((CharSequence) spannableStringBuilder11).append(topicIconName);
                                                                                        str3 = spannableStringBuilder12;
                                                                                        SpannableStringBuilder L2 = L(i30, str3, restrictionReason, false);
                                                                                        if (!this.O || ((this.r2 || SharedConfig.useThreeLinesLayout) && (this.J0 == 0 || L2.length() <= 0))) {
                                                                                            i15 = 0;
                                                                                        } else {
                                                                                            try {
                                                                                                e10 e10Var = new e10(org.telegram.ui.ActionBar.j6.k9, this.F4);
                                                                                                i15 = str3.length() + 1;
                                                                                                try {
                                                                                                    L2.setSpan(e10Var, 0, i15, 33);
                                                                                                } catch (Exception e7) {
                                                                                                    e = e7;
                                                                                                    FileLog.e(e);
                                                                                                    replaceEmoji2 = Emoji.replaceEmoji(L2, org.telegram.ui.ActionBar.j6.F0[this.E0].getFontMetricsInt(), false);
                                                                                                    if (this.f1.hasHighlightedWords()) {
                                                                                                    }
                                                                                                    if (this.R1 > 0) {
                                                                                                    }
                                                                                                    charSequence15 = replaceEmoji2;
                                                                                                    z25 = z14;
                                                                                                    z15 = false;
                                                                                                    if (this.K0 == 0) {
                                                                                                    }
                                                                                                    z24 = z15;
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
                                                                                                    z19 = false;
                                                                                                    this.G3 = false;
                                                                                                    this.X3 = false;
                                                                                                    this.Y3 = false;
                                                                                                    this.Z3 = false;
                                                                                                    this.t3 = false;
                                                                                                    str7 = null;
                                                                                                    str8 = null;
                                                                                                    this.P2 = z19;
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
                                                                                                    z20 = z24;
                                                                                                    charSequence24 = charSequence7;
                                                                                                    CharSequence charSequence41 = string;
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
                                                                                                    f12 = 5.0f;
                                                                                                    if (this.Z0) {
                                                                                                    }
                                                                                                    if (!this.h4) {
                                                                                                    }
                                                                                                    if (z23) {
                                                                                                    }
                                                                                                    f13 = 36.0f;
                                                                                                    if (this.g4) {
                                                                                                    }
                                                                                                    dp7 = this.y2 - AndroidUtilities.dp(12.0f);
                                                                                                    if (dp7 < 0) {
                                                                                                    }
                                                                                                    if (charSequence22 instanceof String) {
                                                                                                    }
                                                                                                    if (this.D2) {
                                                                                                    }
                                                                                                    float f21 = dp7;
                                                                                                    this.R = org.telegram.ui.ActionBar.j6.B0[this.E0].measureText(charSequence22.toString()) <= f21;
                                                                                                    if (!this.Q) {
                                                                                                    }
                                                                                                    CharSequence replaceEmoji3 = Emoji.replaceEmoji(charSequence22, org.telegram.ui.ActionBar.j6.B0[this.E0].getFontMetricsInt(), false);
                                                                                                    MessageObject messageObject21 = this.f1;
                                                                                                    if (messageObject21 == null) {
                                                                                                    }
                                                                                                    if (this.Q) {
                                                                                                    }
                                                                                                    this.B2 = (this.D2 || !this.z2.isRtlCharAt(0)) ? 0.0f : -AndroidUtilities.dp(f13);
                                                                                                    this.C2 = this.z2.isRtlCharAt(0);
                                                                                                    this.p3 = org.telegram.ui.Components.z5.update(0, (View) this, this.p3, this.z2);
                                                                                                    if (this.r2) {
                                                                                                    }
                                                                                                    f17 = 39.0f;
                                                                                                    f18 = 32.0f;
                                                                                                    f19 = 30.0f;
                                                                                                    f20 = 24.0f;
                                                                                                    dp = AndroidUtilities.dp(11.0f);
                                                                                                    this.q3 = AndroidUtilities.dp(32.0f);
                                                                                                    this.M2 = AndroidUtilities.dp(13.0f);
                                                                                                    this.u3 = AndroidUtilities.dp(42.33f);
                                                                                                    this.C3 = AndroidUtilities.dp(43.0f);
                                                                                                    this.I3 = AndroidUtilities.dp(42.33f);
                                                                                                    this.W2 = AndroidUtilities.dp(13.0f);
                                                                                                    int measuredWidth4 = getMeasuredWidth() - AndroidUtilities.dp(this.I + 21);
                                                                                                    if (LocaleController.isRTL) {
                                                                                                    }
                                                                                                    i20 = dp3;
                                                                                                    this.u0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
                                                                                                    i21 = 0;
                                                                                                    while (true) {
                                                                                                        imageReceiverArr = this.V1;
                                                                                                        if (i21 >= imageReceiverArr.length) {
                                                                                                        }
                                                                                                        imageReceiverArr[i21].setImageCoords(((this.H4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.Q ? AndroidUtilities.dp(20.0f) : 0)) - ((this.r2 || SharedConfig.useThreeLinesLayout || (gsVar = this.t0) == null || gsVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
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
                                                                                                    this.M2 -= AndroidUtilities.dp(f15);
                                                                                                    this.W2 -= AndroidUtilities.dp(f15);
                                                                                                    if (getIsPinned()) {
                                                                                                    }
                                                                                                    if (!this.t3) {
                                                                                                    }
                                                                                                    if (z20) {
                                                                                                    }
                                                                                                    max = Math.max(AndroidUtilities.dp(12.0f), i23);
                                                                                                    this.g3 = AndroidUtilities.dp((!this.r2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                                                                                                    if (!this.r2) {
                                                                                                    }
                                                                                                    this.g3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
                                                                                                    if (Q()) {
                                                                                                    }
                                                                                                    if (this.Q) {
                                                                                                    }
                                                                                                    this.n3 = org.telegram.ui.Components.z5.update(0, (View) this, this.n3, this.s3);
                                                                                                    if (TextUtils.isEmpty(charSequence24)) {
                                                                                                    }
                                                                                                    this.o3 = org.telegram.ui.Components.z5.update(0, (View) this, this.o3, this.h3);
                                                                                                    if (!TextUtils.isEmpty(charSequence23)) {
                                                                                                    }
                                                                                                    if (replaceEmoji instanceof Spannable) {
                                                                                                    }
                                                                                                    if (this.r2) {
                                                                                                    }
                                                                                                    this.a0 = org.telegram.ui.ActionBar.j6.F0[this.E0];
                                                                                                    charSequence26 = charSequence41;
                                                                                                    charSequence41 = null;
                                                                                                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                                                                                                    if (this.r2) {
                                                                                                    }
                                                                                                    if (this.R1 > 0) {
                                                                                                    }
                                                                                                    int i42 = max;
                                                                                                    TextPaint textPaint6 = this.a0;
                                                                                                    float dp9 = AndroidUtilities.dp(1.0f);
                                                                                                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                                                                                    this.e3 = iw0.b(charSequence26, textPaint6, i42, dp9, i42, charSequence41 != null ? 1 : 2);
                                                                                                    max = i42;
                                                                                                    this.i3.addAll(this.j3);
                                                                                                    this.j3.clear();
                                                                                                    wh.h.b(this, this.e3, -2, -2, this.i3, this.j3);
                                                                                                    int i43 = max;
                                                                                                    this.m3 = org.telegram.ui.Components.z5.update(0, (View) this, this.m3, this.e3);
                                                                                                    if (LocaleController.isRTL) {
                                                                                                    }
                                                                                                    staticLayout = this.f3;
                                                                                                    if (staticLayout != null) {
                                                                                                    }
                                                                                                    e0();
                                                                                                }
                                                                                            } catch (Exception e10) {
                                                                                                e = e10;
                                                                                                i15 = 0;
                                                                                            }
                                                                                        }
                                                                                        replaceEmoji2 = Emoji.replaceEmoji(L2, org.telegram.ui.ActionBar.j6.F0[this.E0].getFontMetricsInt(), false);
                                                                                        if (this.f1.hasHighlightedWords() && (highlightText = AndroidUtilities.highlightText(replaceEmoji2, this.f1.highlightedWords, this.F4)) != null) {
                                                                                            replaceEmoji2 = highlightText;
                                                                                        }
                                                                                        if (this.R1 > 0) {
                                                                                            if (!(replaceEmoji2 instanceof SpannableStringBuilder)) {
                                                                                                replaceEmoji2 = new SpannableStringBuilder(replaceEmoji2);
                                                                                            }
                                                                                            SpannableStringBuilder spannableStringBuilder13 = (SpannableStringBuilder) replaceEmoji2;
                                                                                            if (i15 >= spannableStringBuilder13.length()) {
                                                                                                spannableStringBuilder13.append(charSequence4);
                                                                                                spannableStringBuilder13.setSpan(new p2(AndroidUtilities.dp(((this.H4 + 2) * this.R1) + 3)), spannableStringBuilder13.length() - 1, spannableStringBuilder13.length(), 33);
                                                                                            } else {
                                                                                                spannableStringBuilder13.insert(i15, charSequence4);
                                                                                                spannableStringBuilder13.setSpan(new p2(AndroidUtilities.dp(((this.H4 + 2) * this.R1) + 3)), i15, i15 + 1, 33);
                                                                                            }
                                                                                        }
                                                                                        charSequence15 = replaceEmoji2;
                                                                                        z25 = z14;
                                                                                        z15 = false;
                                                                                        if (this.K0 == 0) {
                                                                                        }
                                                                                        z24 = z15;
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
                                                                                        z19 = false;
                                                                                        this.G3 = false;
                                                                                        this.X3 = false;
                                                                                        this.Y3 = false;
                                                                                        this.Z3 = false;
                                                                                        this.t3 = false;
                                                                                        str7 = null;
                                                                                        str8 = null;
                                                                                        this.P2 = z19;
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
                                                                                        z20 = z24;
                                                                                        charSequence24 = charSequence7;
                                                                                    }
                                                                                }
                                                                                str3 = escape3;
                                                                                SpannableStringBuilder L22 = L(i30, str3, restrictionReason, false);
                                                                                if (this.O) {
                                                                                }
                                                                                i15 = 0;
                                                                                replaceEmoji2 = Emoji.replaceEmoji(L22, org.telegram.ui.ActionBar.j6.F0[this.E0].getFontMetricsInt(), false);
                                                                                if (this.f1.hasHighlightedWords()) {
                                                                                    replaceEmoji2 = highlightText;
                                                                                }
                                                                                if (this.R1 > 0) {
                                                                                }
                                                                                charSequence15 = replaceEmoji2;
                                                                                z25 = z14;
                                                                                z15 = false;
                                                                                if (this.K0 == 0) {
                                                                                }
                                                                                z24 = z15;
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
                                                                                z19 = false;
                                                                                this.G3 = false;
                                                                                this.X3 = false;
                                                                                this.Y3 = false;
                                                                                this.Z3 = false;
                                                                                this.t3 = false;
                                                                                str7 = null;
                                                                                str8 = null;
                                                                                this.P2 = z19;
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
                                                                                z20 = z24;
                                                                                charSequence24 = charSequence7;
                                                                            } else {
                                                                                MessageObject messageObject22 = this.f1;
                                                                                TLRPC.MessageAction messageAction = messageObject22.messageOwner.action;
                                                                                if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                                                                                    TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall = (TLRPC.TL_messageActionPhoneCall) messageAction;
                                                                                    charSequence16 = messageObject22.isOutOwner() ? nh.a.a(tL_messageActionPhoneCall.video ? R.drawable.dialog_media_outgoing_video_call_20 : R.drawable.dialog_media_outgoing_call_20, charSequence2, false) : nh.a.a(tL_messageActionPhoneCall.video ? R.drawable.dialog_media_incoming_video_call_20 : R.drawable.dialog_media_incoming_call_20, charSequence2, false);
                                                                                } else {
                                                                                    CharSequence charSequence42 = charSequence2;
                                                                                    if (ChatObject.isChannelAndNotMegaGroup(this.g2) && (this.f1.messageOwner.action instanceof TLRPC.TL_messageActionChannelMigrateFrom)) {
                                                                                        charSequence16 = "";
                                                                                        z25 = false;
                                                                                        this.a0 = org.telegram.ui.ActionBar.j6.H0[this.E0];
                                                                                        if (this.f1.type != 21) {
                                                                                            c0();
                                                                                            charSequence17 = s(charSequence16);
                                                                                        } else {
                                                                                            charSequence17 = charSequence16;
                                                                                        }
                                                                                    } else {
                                                                                        CharSequence charSequence43 = this.f1.messageTextShort;
                                                                                        charSequence16 = charSequence43 != null ? charSequence43 : charSequence42;
                                                                                    }
                                                                                }
                                                                                z25 = z14;
                                                                                this.a0 = org.telegram.ui.ActionBar.j6.H0[this.E0];
                                                                                if (this.f1.type != 21) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            G = G();
                                                                        }
                                                                        charSequence18 = G;
                                                                        z25 = z14;
                                                                        charSequence4 = charSequence9;
                                                                        z15 = false;
                                                                        str3 = null;
                                                                        charSequence15 = charSequence18;
                                                                        if (this.K0 == 0) {
                                                                        }
                                                                        z24 = z15;
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
                                                                        z19 = false;
                                                                        this.G3 = false;
                                                                        this.X3 = false;
                                                                        this.Y3 = false;
                                                                        this.Z3 = false;
                                                                        this.t3 = false;
                                                                        str7 = null;
                                                                        str8 = null;
                                                                        this.P2 = z19;
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
                                                                        z20 = z24;
                                                                        charSequence24 = charSequence7;
                                                                    }
                                                                    charSequence4 = charSequence9;
                                                                    z25 = false;
                                                                    str3 = null;
                                                                    z16 = false;
                                                                    charSequence15 = str4;
                                                                    if (this.K0 == 0) {
                                                                    }
                                                                    z24 = z15;
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
                                                                    z19 = false;
                                                                    this.G3 = false;
                                                                    this.X3 = false;
                                                                    this.Y3 = false;
                                                                    this.Z3 = false;
                                                                    this.t3 = false;
                                                                    str7 = null;
                                                                    str8 = null;
                                                                    this.P2 = z19;
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
                                                                    z20 = z24;
                                                                    charSequence24 = charSequence7;
                                                                } else {
                                                                    charSequence17 = str;
                                                                    z25 = z14;
                                                                }
                                                                charSequence4 = charSequence9;
                                                                charSequence18 = charSequence17;
                                                                str3 = null;
                                                                charSequence15 = charSequence18;
                                                                if (this.K0 == 0) {
                                                                }
                                                                z24 = z15;
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
                                                                z19 = false;
                                                                this.G3 = false;
                                                                this.X3 = false;
                                                                this.Y3 = false;
                                                                this.Z3 = false;
                                                                this.t3 = false;
                                                                str7 = null;
                                                                str8 = null;
                                                                this.P2 = z19;
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
                                                                z20 = z24;
                                                                charSequence24 = charSequence7;
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
                                                z24 = z15;
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
                                                z19 = false;
                                                this.G3 = false;
                                                this.X3 = false;
                                                this.Y3 = false;
                                                this.Z3 = false;
                                                this.t3 = false;
                                                str7 = null;
                                                str8 = null;
                                                this.P2 = z19;
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
                                                z20 = z24;
                                                charSequence24 = charSequence7;
                                            } else if (this.K0 != 0) {
                                                formatString = H();
                                            } else if (this.J0 != 0) {
                                                formatString = G();
                                            } else {
                                                TLRPC.EncryptedChat encryptedChat = this.h2;
                                                if (encryptedChat != null) {
                                                    this.a0 = org.telegram.ui.ActionBar.j6.H0[this.E0];
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
                                                    uy uyVar2 = this.z4;
                                                    z24 = z15;
                                                    replaceEmoji = LocaleController.getString((uyVar2 == null || !uyVar2.O0) ? R.string.SavedMessagesInfo : R.string.SavedMessagesInfoQuote);
                                                    charSequence4 = " ";
                                                    string = null;
                                                    charSequence7 = null;
                                                    z25 = false;
                                                    z16 = false;
                                                    charSequence21 = charSequence3;
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
                                                    z19 = false;
                                                    this.G3 = false;
                                                    this.X3 = false;
                                                    this.Y3 = false;
                                                    this.Z3 = false;
                                                    this.t3 = false;
                                                    str7 = null;
                                                    str8 = null;
                                                    this.P2 = z19;
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
                                                    z20 = z24;
                                                    charSequence24 = charSequence7;
                                                }
                                                z24 = z15;
                                                z16 = z10;
                                                charSequence4 = " ";
                                                replaceEmoji = "";
                                                z25 = z14;
                                                string = null;
                                                charSequence8 = charSequence3;
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
                                                z19 = false;
                                                this.G3 = false;
                                                this.X3 = false;
                                                this.Y3 = false;
                                                this.Z3 = false;
                                                this.t3 = false;
                                                str7 = null;
                                                str8 = null;
                                                this.P2 = z19;
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
                                                z20 = z24;
                                                charSequence24 = charSequence7;
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
                                        z19 = false;
                                        this.G3 = false;
                                        this.X3 = false;
                                        this.Y3 = false;
                                        this.Z3 = false;
                                        this.t3 = false;
                                        str7 = null;
                                        str8 = null;
                                        this.P2 = z19;
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
                                        z20 = z24;
                                        charSequence24 = charSequence7;
                                    }
                                } else {
                                    this.l2 = null;
                                    this.k2 = false;
                                    charSequence19 = this.I0;
                                    this.a0 = org.telegram.ui.ActionBar.j6.F0[this.E0];
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
                            z19 = false;
                            this.G3 = false;
                            this.X3 = false;
                            this.Y3 = false;
                            this.Z3 = false;
                            this.t3 = false;
                            str7 = null;
                            str8 = null;
                            this.P2 = z19;
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
                            z20 = z24;
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
                            z19 = false;
                            this.G3 = false;
                            this.X3 = false;
                            this.Y3 = false;
                            this.Z3 = false;
                            this.t3 = false;
                            str7 = null;
                            str8 = null;
                            this.P2 = z19;
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
                            z20 = z24;
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
                    z19 = false;
                    this.G3 = false;
                    this.X3 = false;
                    this.Y3 = false;
                    this.Z3 = false;
                    this.t3 = false;
                    str7 = null;
                    str8 = null;
                    this.P2 = z19;
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
                    z20 = z24;
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
                z19 = false;
                this.G3 = false;
                this.X3 = false;
                this.Y3 = false;
                this.Z3 = false;
                this.t3 = false;
                str7 = null;
                str8 = null;
                this.P2 = z19;
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
                z20 = z24;
                charSequence24 = charSequence7;
            }
            i11 = i10;
            charSequence = charSequence28;
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
            z19 = false;
            this.G3 = false;
            this.X3 = false;
            this.Y3 = false;
            this.Z3 = false;
            this.t3 = false;
            str7 = null;
            str8 = null;
            this.P2 = z19;
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
            z20 = z24;
            charSequence24 = charSequence7;
        }
        CharSequence charSequence412 = string;
        if (z10) {
            f11 = 0.0f;
            this.N2 = null;
            this.L2 = 0;
            i18 = 0;
        } else {
            TextPaint timeTextPaint = getTimeTextPaint();
            f11 = 0.0f;
            int ceil = (int) Math.ceil(timeTextPaint.measureText(str10));
            this.N2 = new StaticLayout(str10, timeTextPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            i18 = AndroidUtilities.dp(getIsPinned() ? 24.0f : 0.0f) + ceil;
            if (LocaleController.isRTL) {
                this.L2 = AndroidUtilities.dp(15.0f);
            } else {
                this.L2 = org.telegram.messenger.w1.B(15.0f, getMeasuredWidth(), i18);
            }
        }
        if (F()) {
            i19 = 0;
        } else {
            if (LocaleController.isRTL) {
                this.O2 = AndroidUtilities.dp(4.0f) + this.L2 + i18;
            } else {
                this.O2 = (this.L2 - org.telegram.ui.ActionBar.j6.b1.getIntrinsicWidth()) - AndroidUtilities.dp(4.0f);
            }
            i19 = org.telegram.ui.ActionBar.j6.b1.getIntrinsicWidth() + AndroidUtilities.dp(4.0f);
            i18 += i19;
        }
        if (LocaleController.isRTL) {
            this.y2 = org.telegram.messenger.w1.B(22.0f, getMeasuredWidth() - this.x2, i18);
        } else {
            this.y2 = org.telegram.messenger.w1.B(this.I + 13, getMeasuredWidth() - this.x2, i18);
            this.x2 += i18;
        }
        if (this.G2) {
            this.y2 -= org.telegram.ui.ActionBar.j6.a1.getIntrinsicWidth() + AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 4.0f);
        }
        if (!this.S2) {
            int dp10 = AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.j6.X0.getIntrinsicWidth();
            this.y2 -= dp10;
            if (LocaleController.isRTL) {
                this.V2 = AndroidUtilities.dp(5.0f) + this.L2 + i18;
                this.x2 += dp10;
            } else {
                this.V2 = (this.L2 - i19) - dp10;
            }
        } else if (this.R2) {
            int dp11 = AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.j6.T0.getIntrinsicWidth();
            int i44 = this.y2 - dp11;
            this.y2 = i44;
            f12 = 5.0f;
            if (this.Q2) {
                this.y2 = org.telegram.messenger.w1.z(8.0f, org.telegram.ui.ActionBar.j6.W0.getIntrinsicWidth(), i44);
                if (LocaleController.isRTL) {
                    int dp12 = AndroidUtilities.dp(5.0f) + this.L2 + i18;
                    this.T2 = dp12;
                    this.X2 = AndroidUtilities.dp(5.5f) + dp12;
                    this.x2 = wl.D(8.0f, org.telegram.ui.ActionBar.j6.W0.getIntrinsicWidth() + dp11, this.x2);
                } else {
                    int i45 = (this.L2 - i19) - dp11;
                    this.X2 = i45;
                    this.T2 = i45 - AndroidUtilities.dp(5.5f);
                }
            } else if (LocaleController.isRTL) {
                this.U2 = AndroidUtilities.dp(5.0f) + this.L2 + i18;
                this.x2 += dp11;
            } else {
                this.U2 = (this.L2 - i19) - dp11;
            }
            z23 = (!this.Z0 || this.Q0 || this.b1 || this.c1 > f11) && !this.f4 && this.l4 == 0;
            if (!this.h4 && this.j4.c() != null) {
                int dp13 = AndroidUtilities.dp(36.0f);
                if (z23) {
                    dp13 = org.telegram.ui.ActionBar.j6.c1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f) + dp13;
                }
                this.y2 -= dp13;
                if (LocaleController.isRTL) {
                    this.x2 += dp13;
                }
            } else if (z23) {
                int intrinsicWidth = org.telegram.ui.ActionBar.j6.c1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
                if (this.h4) {
                    intrinsicWidth += AndroidUtilities.dp(36.0f);
                }
                this.y2 -= intrinsicWidth;
                if (LocaleController.isRTL) {
                    this.x2 += intrinsicWidth;
                }
            } else if (this.f4) {
                int intrinsicWidth2 = org.telegram.ui.ActionBar.j6.f1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
                this.y2 -= intrinsicWidth2;
                if (LocaleController.isRTL) {
                    this.x2 += intrinsicWidth2;
                }
            } else if (this.h4) {
                int dp14 = AndroidUtilities.dp(36.0f);
                this.y2 -= dp14;
                if (LocaleController.isRTL) {
                    this.x2 += dp14;
                }
            } else if (this.l4 != 0) {
                f13 = 36.0f;
                int intrinsicWidth3 = (this.l4 == 1 ? org.telegram.ui.ActionBar.j6.g1 : org.telegram.ui.ActionBar.j6.h1).getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
                this.y2 -= intrinsicWidth3;
                if (LocaleController.isRTL) {
                    this.x2 += intrinsicWidth3;
                }
                if (this.g4) {
                    this.y2 -= AndroidUtilities.dp(21.0f);
                }
                dp7 = this.y2 - AndroidUtilities.dp(12.0f);
                if (dp7 < 0) {
                    dp7 = 0;
                }
                if (charSequence22 instanceof String) {
                    f14 = 21.0f;
                } else {
                    f14 = 21.0f;
                    try {
                        charSequence22 = ((String) charSequence22).replace('\n', ' ');
                    } catch (Exception e11) {
                        e = e11;
                        f15 = 6.0f;
                        f16 = 8.0f;
                        FileLog.e(e);
                        this.p3 = org.telegram.ui.Components.z5.update(0, (View) this, this.p3, this.z2);
                        if (this.r2) {
                        }
                        f17 = 39.0f;
                        f18 = 32.0f;
                        f19 = 30.0f;
                        f20 = 24.0f;
                        dp = AndroidUtilities.dp(11.0f);
                        this.q3 = AndroidUtilities.dp(32.0f);
                        this.M2 = AndroidUtilities.dp(13.0f);
                        this.u3 = AndroidUtilities.dp(42.33f);
                        this.C3 = AndroidUtilities.dp(43.0f);
                        this.I3 = AndroidUtilities.dp(42.33f);
                        this.W2 = AndroidUtilities.dp(13.0f);
                        int measuredWidth42 = getMeasuredWidth() - AndroidUtilities.dp(this.I + 21);
                        if (LocaleController.isRTL) {
                        }
                        i20 = dp3;
                        this.u0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
                        i21 = 0;
                        while (true) {
                            imageReceiverArr = this.V1;
                            if (i21 >= imageReceiverArr.length) {
                            }
                            imageReceiverArr[i21].setImageCoords(((this.H4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.Q ? AndroidUtilities.dp(20.0f) : 0)) - ((this.r2 || SharedConfig.useThreeLinesLayout || (gsVar = this.t0) == null || gsVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
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
                        }
                        this.M2 -= AndroidUtilities.dp(f15);
                        this.W2 -= AndroidUtilities.dp(f15);
                        if (getIsPinned()) {
                        }
                        if (!this.t3) {
                        }
                        if (z20) {
                        }
                        max = Math.max(AndroidUtilities.dp(12.0f), i23);
                        this.g3 = AndroidUtilities.dp((!this.r2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                        if (!this.r2) {
                        }
                        this.g3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
                        if (Q()) {
                        }
                        if (this.Q) {
                        }
                        this.n3 = org.telegram.ui.Components.z5.update(0, (View) this, this.n3, this.s3);
                        if (TextUtils.isEmpty(charSequence24)) {
                        }
                        this.o3 = org.telegram.ui.Components.z5.update(0, (View) this, this.o3, this.h3);
                        if (!TextUtils.isEmpty(charSequence23)) {
                        }
                        if (replaceEmoji instanceof Spannable) {
                        }
                        if (this.r2) {
                        }
                        this.a0 = org.telegram.ui.ActionBar.j6.F0[this.E0];
                        charSequence26 = charSequence412;
                        charSequence412 = null;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                        if (this.r2) {
                        }
                        if (this.R1 > 0) {
                        }
                        int i422 = max;
                        TextPaint textPaint62 = this.a0;
                        float dp92 = AndroidUtilities.dp(1.0f);
                        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                        this.e3 = iw0.b(charSequence26, textPaint62, i422, dp92, i422, charSequence412 != null ? 1 : 2);
                        max = i422;
                        this.i3.addAll(this.j3);
                        this.j3.clear();
                        wh.h.b(this, this.e3, -2, -2, this.i3, this.j3);
                        int i432 = max;
                        this.m3 = org.telegram.ui.Components.z5.update(0, (View) this, this.m3, this.e3);
                        if (LocaleController.isRTL) {
                        }
                        staticLayout = this.f3;
                        if (staticLayout != null) {
                        }
                        e0();
                    }
                }
                if (this.D2) {
                    f15 = 6.0f;
                    f16 = 8.0f;
                } else {
                    f15 = 6.0f;
                    try {
                        f16 = 8.0f;
                        try {
                            this.A2 = charSequence22.length() == TextUtils.ellipsize(charSequence22, org.telegram.ui.ActionBar.j6.B0[this.E0], (float) dp7, TextUtils.TruncateAt.END).length();
                            dp7 += AndroidUtilities.dp(48.0f);
                        } catch (Exception e12) {
                            e = e12;
                            FileLog.e(e);
                            this.p3 = org.telegram.ui.Components.z5.update(0, (View) this, this.p3, this.z2);
                            if (this.r2) {
                            }
                            f17 = 39.0f;
                            f18 = 32.0f;
                            f19 = 30.0f;
                            f20 = 24.0f;
                            dp = AndroidUtilities.dp(11.0f);
                            this.q3 = AndroidUtilities.dp(32.0f);
                            this.M2 = AndroidUtilities.dp(13.0f);
                            this.u3 = AndroidUtilities.dp(42.33f);
                            this.C3 = AndroidUtilities.dp(43.0f);
                            this.I3 = AndroidUtilities.dp(42.33f);
                            this.W2 = AndroidUtilities.dp(13.0f);
                            int measuredWidth422 = getMeasuredWidth() - AndroidUtilities.dp(this.I + 21);
                            if (LocaleController.isRTL) {
                            }
                            i20 = dp3;
                            this.u0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
                            i21 = 0;
                            while (true) {
                                imageReceiverArr = this.V1;
                                if (i21 >= imageReceiverArr.length) {
                                }
                                imageReceiverArr[i21].setImageCoords(((this.H4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.Q ? AndroidUtilities.dp(20.0f) : 0)) - ((this.r2 || SharedConfig.useThreeLinesLayout || (gsVar = this.t0) == null || gsVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
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
                            this.M2 -= AndroidUtilities.dp(f15);
                            this.W2 -= AndroidUtilities.dp(f15);
                            if (getIsPinned()) {
                            }
                            if (!this.t3) {
                            }
                            if (z20) {
                            }
                            max = Math.max(AndroidUtilities.dp(12.0f), i23);
                            this.g3 = AndroidUtilities.dp((!this.r2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                            if (!this.r2) {
                            }
                            this.g3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
                            if (Q()) {
                            }
                            if (this.Q) {
                            }
                            this.n3 = org.telegram.ui.Components.z5.update(0, (View) this, this.n3, this.s3);
                            if (TextUtils.isEmpty(charSequence24)) {
                            }
                            this.o3 = org.telegram.ui.Components.z5.update(0, (View) this, this.o3, this.h3);
                            if (!TextUtils.isEmpty(charSequence23)) {
                            }
                            if (replaceEmoji instanceof Spannable) {
                            }
                            if (this.r2) {
                            }
                            this.a0 = org.telegram.ui.ActionBar.j6.F0[this.E0];
                            charSequence26 = charSequence412;
                            charSequence412 = null;
                            Layout.Alignment alignment22 = Layout.Alignment.ALIGN_NORMAL;
                            if (this.r2) {
                            }
                            if (this.R1 > 0) {
                            }
                            int i4222 = max;
                            TextPaint textPaint622 = this.a0;
                            float dp922 = AndroidUtilities.dp(1.0f);
                            TextUtils.TruncateAt truncateAt22 = TextUtils.TruncateAt.END;
                            this.e3 = iw0.b(charSequence26, textPaint622, i4222, dp922, i4222, charSequence412 != null ? 1 : 2);
                            max = i4222;
                            this.i3.addAll(this.j3);
                            this.j3.clear();
                            wh.h.b(this, this.e3, -2, -2, this.i3, this.j3);
                            int i4322 = max;
                            this.m3 = org.telegram.ui.Components.z5.update(0, (View) this, this.m3, this.e3);
                            if (LocaleController.isRTL) {
                            }
                            staticLayout = this.f3;
                            if (staticLayout != null) {
                            }
                            e0();
                        }
                    } catch (Exception e13) {
                        e = e13;
                        f16 = 8.0f;
                        FileLog.e(e);
                        this.p3 = org.telegram.ui.Components.z5.update(0, (View) this, this.p3, this.z2);
                        if (this.r2) {
                        }
                        f17 = 39.0f;
                        f18 = 32.0f;
                        f19 = 30.0f;
                        f20 = 24.0f;
                        dp = AndroidUtilities.dp(11.0f);
                        this.q3 = AndroidUtilities.dp(32.0f);
                        this.M2 = AndroidUtilities.dp(13.0f);
                        this.u3 = AndroidUtilities.dp(42.33f);
                        this.C3 = AndroidUtilities.dp(43.0f);
                        this.I3 = AndroidUtilities.dp(42.33f);
                        this.W2 = AndroidUtilities.dp(13.0f);
                        int measuredWidth4222 = getMeasuredWidth() - AndroidUtilities.dp(this.I + 21);
                        if (LocaleController.isRTL) {
                        }
                        i20 = dp3;
                        this.u0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
                        i21 = 0;
                        while (true) {
                            imageReceiverArr = this.V1;
                            if (i21 >= imageReceiverArr.length) {
                            }
                            imageReceiverArr[i21].setImageCoords(((this.H4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.Q ? AndroidUtilities.dp(20.0f) : 0)) - ((this.r2 || SharedConfig.useThreeLinesLayout || (gsVar = this.t0) == null || gsVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                            i21++;
                            dp = dp;
                        }
                        i22 = dp;
                        i23 = measuredWidth4222;
                        if (LocaleController.isRTL) {
                        }
                        if (this.Q) {
                        }
                        if (!this.r2) {
                        }
                        this.M2 -= AndroidUtilities.dp(f15);
                        this.W2 -= AndroidUtilities.dp(f15);
                        if (getIsPinned()) {
                        }
                        if (!this.t3) {
                        }
                        if (z20) {
                        }
                        max = Math.max(AndroidUtilities.dp(12.0f), i23);
                        this.g3 = AndroidUtilities.dp((!this.r2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                        if (!this.r2) {
                        }
                        this.g3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
                        if (Q()) {
                        }
                        if (this.Q) {
                        }
                        this.n3 = org.telegram.ui.Components.z5.update(0, (View) this, this.n3, this.s3);
                        if (TextUtils.isEmpty(charSequence24)) {
                        }
                        this.o3 = org.telegram.ui.Components.z5.update(0, (View) this, this.o3, this.h3);
                        if (!TextUtils.isEmpty(charSequence23)) {
                        }
                        if (replaceEmoji instanceof Spannable) {
                        }
                        if (this.r2) {
                        }
                        this.a0 = org.telegram.ui.ActionBar.j6.F0[this.E0];
                        charSequence26 = charSequence412;
                        charSequence412 = null;
                        Layout.Alignment alignment222 = Layout.Alignment.ALIGN_NORMAL;
                        if (this.r2) {
                        }
                        if (this.R1 > 0) {
                        }
                        int i42222 = max;
                        TextPaint textPaint6222 = this.a0;
                        float dp9222 = AndroidUtilities.dp(1.0f);
                        TextUtils.TruncateAt truncateAt222 = TextUtils.TruncateAt.END;
                        this.e3 = iw0.b(charSequence26, textPaint6222, i42222, dp9222, i42222, charSequence412 != null ? 1 : 2);
                        max = i42222;
                        this.i3.addAll(this.j3);
                        this.j3.clear();
                        wh.h.b(this, this.e3, -2, -2, this.i3, this.j3);
                        int i43222 = max;
                        this.m3 = org.telegram.ui.Components.z5.update(0, (View) this, this.m3, this.e3);
                        if (LocaleController.isRTL) {
                        }
                        staticLayout = this.f3;
                        if (staticLayout != null) {
                        }
                        e0();
                    }
                }
                float f212 = dp7;
                this.R = org.telegram.ui.ActionBar.j6.B0[this.E0].measureText(charSequence22.toString()) <= f212;
                if (!this.Q) {
                    charSequence22 = TextUtils.ellipsize(charSequence22, org.telegram.ui.ActionBar.j6.B0[this.E0], f212, TextUtils.TruncateAt.END);
                }
                CharSequence replaceEmoji32 = Emoji.replaceEmoji(charSequence22, org.telegram.ui.ActionBar.j6.B0[this.E0].getFontMetricsInt(), false);
                MessageObject messageObject212 = this.f1;
                CharSequence charSequence44 = (messageObject212 == null && messageObject212.hasHighlightedWords() && (highlightText3 = AndroidUtilities.highlightText(replaceEmoji32, this.f1.highlightedWords, this.F4)) != null) ? highlightText3 : replaceEmoji32;
                if (this.Q) {
                    this.z2 = new StaticLayout(charSequence44, org.telegram.ui.ActionBar.j6.B0[this.E0], Math.max(dp7, this.y2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else {
                    TextPaint textPaint7 = org.telegram.ui.ActionBar.j6.B0[this.E0];
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    TextUtils.TruncateAt truncateAt3 = TextUtils.TruncateAt.END;
                    this.z2 = iw0.b(charSequence44, textPaint7, dp7, 0.0f, dp7, 2);
                }
                this.B2 = (this.D2 || !this.z2.isRtlCharAt(0)) ? 0.0f : -AndroidUtilities.dp(f13);
                this.C2 = this.z2.isRtlCharAt(0);
                this.p3 = org.telegram.ui.Components.z5.update(0, (View) this, this.p3, this.z2);
                if (!this.r2 || SharedConfig.useThreeLinesLayout) {
                    f17 = 39.0f;
                    f18 = 32.0f;
                    f19 = 30.0f;
                    f20 = 24.0f;
                    dp = AndroidUtilities.dp(11.0f);
                    this.q3 = AndroidUtilities.dp(32.0f);
                    this.M2 = AndroidUtilities.dp(13.0f);
                    this.u3 = AndroidUtilities.dp(42.33f);
                    this.C3 = AndroidUtilities.dp(43.0f);
                    this.I3 = AndroidUtilities.dp(42.33f);
                    this.W2 = AndroidUtilities.dp(13.0f);
                    int measuredWidth42222 = getMeasuredWidth() - AndroidUtilities.dp(this.I + 21);
                    if (LocaleController.isRTL) {
                        int dp15 = AndroidUtilities.dp(f10);
                        this.r3 = dp15;
                        this.b3 = dp15;
                        this.d3 = dp15;
                        this.c3 = dp15;
                        dp2 = getMeasuredWidth() - AndroidUtilities.dp(this.H + 56);
                        dp3 = dp2 - AndroidUtilities.dp(31.0f);
                    } else {
                        int dp16 = AndroidUtilities.dp(this.I + 6);
                        this.r3 = dp16;
                        this.b3 = dp16;
                        this.d3 = dp16;
                        this.c3 = dp16;
                        dp2 = AndroidUtilities.dp(this.H);
                        dp3 = AndroidUtilities.dp(69.0f) + dp2;
                    }
                    i20 = dp3;
                    this.u0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
                    i21 = 0;
                    while (true) {
                        imageReceiverArr = this.V1;
                        if (i21 >= imageReceiverArr.length) {
                            break;
                        }
                        imageReceiverArr[i21].setImageCoords(((this.H4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.Q ? AndroidUtilities.dp(20.0f) : 0)) - ((this.r2 || SharedConfig.useThreeLinesLayout || (gsVar = this.t0) == null || gsVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                        i21++;
                        dp = dp;
                    }
                    i22 = dp;
                    i23 = measuredWidth42222;
                } else {
                    int dp17 = AndroidUtilities.dp(9.0f);
                    this.q3 = AndroidUtilities.dp(31.0f);
                    this.M2 = AndroidUtilities.dp(f10);
                    this.u3 = AndroidUtilities.dp(38.0f);
                    this.C3 = AndroidUtilities.dp(39.0f);
                    this.I3 = AndroidUtilities.dp(this.P ? 35.0f : 38.0f);
                    this.W2 = AndroidUtilities.dp(f7);
                    i23 = getMeasuredWidth() - AndroidUtilities.dp((this.I + 20) - (LocaleController.isRTL ? 0 : 12));
                    if (LocaleController.isRTL) {
                        int dp18 = AndroidUtilities.dp(22.0f);
                        this.r3 = dp18;
                        this.b3 = dp18;
                        this.d3 = dp18;
                        this.c3 = dp18;
                        f18 = 32.0f;
                        dp5 = getMeasuredWidth() - AndroidUtilities.dp(this.H + 52);
                        f19 = 30.0f;
                        dp6 = dp5 - AndroidUtilities.dp(((this.H4 + 2) * this.R1) + 9);
                    } else {
                        f18 = 32.0f;
                        f19 = 30.0f;
                        int dp19 = AndroidUtilities.dp(this.I + 4);
                        this.r3 = dp19;
                        this.b3 = dp19;
                        this.d3 = dp19;
                        this.c3 = dp19;
                        dp5 = AndroidUtilities.dp(this.H);
                        dp6 = AndroidUtilities.dp(67.0f) + dp5;
                    }
                    f17 = 39.0f;
                    f20 = 24.0f;
                    this.u0.F.set(dp5, dp17, AndroidUtilities.dp(52.0f) + dp5, AndroidUtilities.dp(52.0f) + dp17);
                    int i46 = 0;
                    while (true) {
                        ImageReceiver[] imageReceiverArr3 = this.V1;
                        if (i46 >= imageReceiverArr3.length) {
                            break;
                        }
                        imageReceiverArr3[i46].setImageCoords(((this.H4 + 2) * i46) + dp6, ((AndroidUtilities.dp(f19) + dp17) + (this.Q ? AndroidUtilities.dp(20.0f) : 0)) - ((this.r2 || SharedConfig.useThreeLinesLayout || (gsVar3 = this.t0) == null || gsVar3.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(this.H4), AndroidUtilities.dp(this.H4));
                        i46++;
                        dp17 = dp17;
                    }
                    i22 = dp17;
                }
                if (LocaleController.isRTL) {
                    this.Z2 = getMeasuredWidth() - AndroidUtilities.dp(this.I);
                    this.Y2 = AndroidUtilities.dp(64.0f);
                } else {
                    this.Y2 = this.b3;
                    this.Z2 = getMeasuredWidth() - AndroidUtilities.dp(64.0f);
                }
                if (this.Q) {
                    this.q3 = AndroidUtilities.dp(20.0f) + this.q3;
                }
                if (((!this.r2 && !SharedConfig.useThreeLinesLayout) || Q()) && (gsVar2 = this.t0) != null && !gsVar2.b()) {
                    this.M2 -= AndroidUtilities.dp(f15);
                    this.W2 -= AndroidUtilities.dp(f15);
                }
                if (getIsPinned()) {
                    if (LocaleController.isRTL) {
                        this.D3 = AndroidUtilities.dp(14.0f);
                    } else {
                        this.D3 = (getMeasuredWidth() - org.telegram.ui.ActionBar.j6.j1.getIntrinsicWidth()) - AndroidUtilities.dp(14.0f);
                    }
                }
                if (!this.t3) {
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
                } else if (str7 != null || str9 != null || this.Y3 || this.Z3) {
                    if (str7 != null) {
                        this.K3 = Math.max(AndroidUtilities.dp(f16), (int) Math.ceil(org.telegram.ui.ActionBar.j6.M0.measureText(str7)));
                        this.T3 = new StaticLayout(str7, org.telegram.ui.ActionBar.j6.M0, this.K3, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        int dp21 = AndroidUtilities.dp(f7) + this.K3;
                        i23 -= dp21;
                        if (LocaleController.isRTL) {
                            this.J3 = AndroidUtilities.dp(15.666f);
                            this.b3 += dp21;
                            this.d3 += dp21;
                            this.c3 += dp21;
                            this.r3 += dp21;
                        } else {
                            this.J3 = wl.v(12.666f, this.K3, getMeasuredWidth() - AndroidUtilities.dp(15.666f));
                        }
                        this.G3 = true;
                    } else {
                        this.K3 = 0;
                    }
                    if (str9 != null) {
                        if (this.J0 != 0) {
                            this.d4 = Math.max(AndroidUtilities.dp(f16), (int) Math.ceil(org.telegram.ui.ActionBar.j6.M0.measureText(str9)));
                            this.e4 = new StaticLayout(str9, org.telegram.ui.ActionBar.j6.M0, this.d4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            this.d4 = AndroidUtilities.dp(f16);
                        }
                        int dp22 = AndroidUtilities.dp(f7) + this.d4;
                        i23 -= dp22;
                        if (LocaleController.isRTL) {
                            int dp23 = AndroidUtilities.dp(15.666f);
                            int i47 = this.K3;
                            this.a4 = dp23 + (i47 != 0 ? i47 + AndroidUtilities.dp(f7) : 0);
                            this.b3 += dp22;
                            this.d3 += dp22;
                            this.c3 += dp22;
                            this.r3 += dp22;
                        } else {
                            int v = wl.v(12.666f, this.d4, getMeasuredWidth()) - AndroidUtilities.dp(15.666f);
                            int i48 = this.K3;
                            this.a4 = v - (i48 != 0 ? i48 + AndroidUtilities.dp(f7) : 0);
                        }
                        this.X3 = true;
                    } else {
                        this.d4 = 0;
                    }
                    if (this.Y3) {
                        int dp24 = AndroidUtilities.dp(25.0f);
                        i23 -= dp24;
                        if (LocaleController.isRTL) {
                            int dp25 = AndroidUtilities.dp(15.666f);
                            this.b4 = dp25;
                            if (this.X3) {
                                int i49 = this.d4;
                                this.b4 = dp25 + (i49 != 0 ? i49 + AndroidUtilities.dp(f7) : 0);
                            }
                            if (this.G3) {
                                int i50 = this.b4;
                                int i51 = this.K3;
                                this.b4 = i50 + (i51 != 0 ? i51 + AndroidUtilities.dp(f7) : 0);
                            }
                            this.b3 += dp24;
                            this.d3 += dp24;
                            this.c3 += dp24;
                            this.r3 += dp24;
                        } else {
                            int measuredWidth5 = getMeasuredWidth() - AndroidUtilities.dp(36.332f);
                            this.b4 = measuredWidth5;
                            if (this.X3) {
                                int i52 = this.d4;
                                this.b4 = measuredWidth5 - (i52 != 0 ? i52 + AndroidUtilities.dp(f7) : 0);
                            }
                            if (this.G3) {
                                int i53 = this.b4;
                                int i54 = this.K3;
                                this.b4 = i53 - (i54 != 0 ? i54 + AndroidUtilities.dp(f7) : 0);
                            }
                        }
                    }
                    if (this.Z3) {
                        int dp26 = AndroidUtilities.dp(25.0f);
                        i23 -= dp26;
                        if (LocaleController.isRTL) {
                            int dp27 = AndroidUtilities.dp(15.666f);
                            this.c4 = dp27;
                            if (this.Y3) {
                                this.c4 = AndroidUtilities.dp(25.0f) + dp27;
                            }
                            if (this.X3) {
                                int i55 = this.c4;
                                int i56 = this.d4;
                                this.c4 = i55 + (i56 != 0 ? i56 + AndroidUtilities.dp(f7) : 0);
                            }
                            if (this.G3) {
                                int i57 = this.c4;
                                int i58 = this.K3;
                                this.c4 = i57 + (i58 != 0 ? i58 + AndroidUtilities.dp(f7) : 0);
                            }
                            this.b3 += dp26;
                            this.d3 += dp26;
                            this.c3 += dp26;
                            this.r3 += dp26;
                        } else {
                            int measuredWidth6 = getMeasuredWidth() - AndroidUtilities.dp(36.332f);
                            this.c4 = measuredWidth6;
                            if (this.Y3) {
                                this.c4 = measuredWidth6 - AndroidUtilities.dp(25.0f);
                            }
                            if (this.X3) {
                                int i59 = this.c4;
                                int i60 = this.d4;
                                this.c4 = i59 - (i60 != 0 ? i60 + AndroidUtilities.dp(f7) : 0);
                            }
                            if (this.G3) {
                                int i61 = this.c4;
                                int i62 = this.K3;
                                this.c4 = i61 - (i62 != 0 ? i62 + AndroidUtilities.dp(f7) : 0);
                            }
                        }
                    }
                } else if (!this.J1 || P() || Q() || O() || !UserObject.isBot(this.f2) || !this.f2.bot_has_main_app) {
                    this.G3 = false;
                    this.X3 = false;
                } else {
                    setOpenBotButton(true);
                    int h = (int) (this.I1.h() + AndroidUtilities.dp(26.0f));
                    int dp28 = AndroidUtilities.dp(13.0f);
                    i23 -= h;
                    int dp29 = (this.r2 || SharedConfig.useThreeLinesLayout) ? AndroidUtilities.dp(40.0f) : this.P ? AndroidUtilities.dp(33.0f) : AndroidUtilities.dp(f13);
                    if (LocaleController.isRTL) {
                        this.H1.set(AndroidUtilities.dp(13.0f), dp29, AndroidUtilities.dp(13.0f) + h, AndroidUtilities.dp(28.0f) + dp29);
                        int i63 = h + dp28;
                        this.b3 += i63;
                        this.d3 += i63;
                        this.c3 += i63;
                        this.r3 += i63;
                    } else {
                        this.H1.set((getMeasuredWidth() - h) - AndroidUtilities.dp(13.0f), dp29, getMeasuredWidth() - AndroidUtilities.dp(13.0f), AndroidUtilities.dp(28.0f) + dp29);
                    }
                    this.G3 = false;
                    this.X3 = false;
                }
                if (z20) {
                    if (replaceEmoji == null) {
                        replaceEmoji = "";
                    }
                    if (replaceEmoji.length() > 150) {
                        replaceEmoji = replaceEmoji.subSequence(0, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    }
                    replaceEmoji = Emoji.replaceEmoji(((this.r2 || SharedConfig.useThreeLinesLayout) && !M() && charSequence412 == null) ? AndroidUtilities.replaceTwoNewLinesToOne(replaceEmoji) : AndroidUtilities.replaceNewLines(replaceEmoji), org.telegram.ui.ActionBar.j6.F0[this.E0].getFontMetricsInt(), false);
                    MessageObject messageObject23 = this.f1;
                    if (messageObject23 != null && (highlightText2 = AndroidUtilities.highlightText(replaceEmoji, messageObject23.highlightedWords, this.F4)) != null) {
                        replaceEmoji = highlightText2;
                    }
                }
                max = Math.max(AndroidUtilities.dp(12.0f), i23);
                this.g3 = AndroidUtilities.dp((!this.r2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                if (((!this.r2 && !SharedConfig.useThreeLinesLayout) || Q()) && M()) {
                    this.g3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
                }
                if (Q()) {
                    this.a3 = AndroidUtilities.dp((this.r2 || SharedConfig.useThreeLinesLayout) ? 34.0f : 39.0f);
                    int i64 = 0;
                    while (true) {
                        ImageReceiver[] imageReceiverArr4 = this.V1;
                        if (i64 >= imageReceiverArr4.length) {
                            break;
                        }
                        imageReceiverArr4[i64].setImageY(this.g3);
                        i64++;
                    }
                } else if ((this.r2 || SharedConfig.useThreeLinesLayout) && !M() && charSequence412 != null && (this.J0 == 0 || this.M0 == 1)) {
                    try {
                        messageObject7 = this.f1;
                    } catch (Exception e14) {
                        e = e14;
                    }
                    if (messageObject7 != null && messageObject7.hasHighlightedWords()) {
                        CharSequence highlightText5 = AndroidUtilities.highlightText(charSequence412, this.f1.highlightedWords, this.F4);
                        if (highlightText5 != null) {
                            charSequence25 = highlightText5;
                            TextPaint textPaint8 = org.telegram.ui.ActionBar.j6.G0;
                            Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                            TextUtils.TruncateAt truncateAt4 = TextUtils.TruncateAt.END;
                            this.s3 = iw0.b(charSequence25, textPaint8, max, 0.0f, max, 1);
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
                            charSequence412 = charSequence25;
                        }
                    }
                    charSequence25 = charSequence412;
                    TextPaint textPaint82 = org.telegram.ui.ActionBar.j6.G0;
                    Layout.Alignment alignment42 = Layout.Alignment.ALIGN_NORMAL;
                    TextUtils.TruncateAt truncateAt42 = TextUtils.TruncateAt.END;
                    this.s3 = iw0.b(charSequence25, textPaint82, max, 0.0f, max, 1);
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
                    charSequence412 = charSequence25;
                } else {
                    this.s3 = null;
                    if (this.r2 || SharedConfig.useThreeLinesLayout) {
                        this.a3 = AndroidUtilities.dp(f18);
                        int dp30 = (this.R && this.P) ? AndroidUtilities.dp(20.0f) : 0;
                        int i65 = 0;
                        while (true) {
                            ImageReceiver[] imageReceiverArr5 = this.V1;
                            if (i65 >= imageReceiverArr5.length) {
                                break;
                            }
                            imageReceiverArr5[i65].setImageY(AndroidUtilities.dp(f14) + i22 + dp30);
                            i65++;
                        }
                    } else {
                        this.a3 = AndroidUtilities.dp(f17);
                    }
                }
                if (this.Q) {
                    this.a3 = AndroidUtilities.dp(20.0f) + this.a3;
                }
                this.n3 = org.telegram.ui.Components.z5.update(0, (View) this, this.n3, this.s3);
                if (TextUtils.isEmpty(charSequence24)) {
                    this.h3 = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(charSequence24, this.a0.getFontMetricsInt(), false), this.a0, max - AndroidUtilities.dp(26.0f), TextUtils.TruncateAt.END), this.a0, max - AndroidUtilities.dp(20.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.k3.addAll(this.l3);
                    this.l3.clear();
                    wh.h.c(this, this.h3, this.k3, this.l3);
                } else {
                    this.h3 = null;
                }
                this.o3 = org.telegram.ui.Components.z5.update(0, (View) this, this.o3, this.h3);
                if (!TextUtils.isEmpty(charSequence23)) {
                    try {
                        if (!this.r2) {
                            if (!SharedConfig.useThreeLinesLayout) {
                            }
                            i26 = max;
                            this.f3 = new StaticLayout(TextUtils.ellipsize(charSequence23, this.a0, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.j6.H0[this.E0], i26, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        }
                        this.f3 = new StaticLayout(TextUtils.ellipsize(charSequence23, this.a0, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.j6.H0[this.E0], i26, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    } catch (Exception e15) {
                        e = e15;
                        max = i26;
                        FileLog.e(e);
                        if (replaceEmoji instanceof Spannable) {
                        }
                        if (this.r2) {
                        }
                        this.a0 = org.telegram.ui.ActionBar.j6.F0[this.E0];
                        charSequence26 = charSequence412;
                        charSequence412 = null;
                        Layout.Alignment alignment2222 = Layout.Alignment.ALIGN_NORMAL;
                        if (this.r2) {
                        }
                        if (this.R1 > 0) {
                        }
                        int i422222 = max;
                        TextPaint textPaint62222 = this.a0;
                        float dp92222 = AndroidUtilities.dp(1.0f);
                        TextUtils.TruncateAt truncateAt2222 = TextUtils.TruncateAt.END;
                        this.e3 = iw0.b(charSequence26, textPaint62222, i422222, dp92222, i422222, charSequence412 != null ? 1 : 2);
                        max = i422222;
                        this.i3.addAll(this.j3);
                        this.j3.clear();
                        wh.h.b(this, this.e3, -2, -2, this.i3, this.j3);
                        int i432222 = max;
                        this.m3 = org.telegram.ui.Components.z5.update(0, (View) this, this.m3, this.e3);
                        if (LocaleController.isRTL) {
                        }
                        staticLayout = this.f3;
                        if (staticLayout != null) {
                        }
                        e0();
                    }
                    if (!M()) {
                        TextPaint textPaint9 = org.telegram.ui.ActionBar.j6.H0[this.E0];
                        Layout.Alignment alignment5 = Layout.Alignment.ALIGN_NORMAL;
                        float dp31 = AndroidUtilities.dp(1.0f);
                        TextUtils.TruncateAt truncateAt5 = TextUtils.TruncateAt.END;
                        this.f3 = iw0.b(charSequence23, textPaint9, max, dp31, max, 1);
                    }
                    i26 = max;
                }
                if (replaceEmoji instanceof Spannable) {
                    Spannable spannable = (Spannable) replaceEmoji;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof ClickableSpan) && !(obj instanceof CodeHighlighting.Span)) {
                            if (this.K0 == 0) {
                                if (!P()) {
                                    if (!(obj instanceof e51)) {
                                    }
                                }
                            }
                            if (!(obj instanceof CodeHighlighting.ColorSpan)) {
                                if (!(obj instanceof si0)) {
                                    if (!(obj instanceof ri0)) {
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
                    this.a0 = org.telegram.ui.ActionBar.j6.F0[this.E0];
                    charSequence26 = charSequence412;
                    charSequence412 = null;
                } else {
                    if (!this.r2) {
                    }
                    if (!M()) {
                        if (charSequence412 == null) {
                            if (ChatObject.isMonoForum(this.g2) && ChatObject.canManageMonoForum(this.F0, this.g2)) {
                            }
                            charSequence26 = replaceEmoji;
                        }
                    }
                    replaceEmoji = (Q() || !(replaceEmoji instanceof Spanned) || ((p2[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), p2.class)).length > 0) ? TextUtils.ellipsize(replaceEmoji, this.a0, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END) : TextUtils.ellipsize(replaceEmoji, this.a0, max - AndroidUtilities.dp(((this.H4 + 2) * this.R1) + 15), TextUtils.TruncateAt.END);
                    charSequence26 = replaceEmoji;
                }
                Layout.Alignment alignment22222 = Layout.Alignment.ALIGN_NORMAL;
                if ((!this.r2 || SharedConfig.useThreeLinesLayout) && !M()) {
                    if (this.R1 > 0 && charSequence412 != null) {
                        max += AndroidUtilities.dp(f12);
                    }
                    int i4222222 = max;
                    TextPaint textPaint622222 = this.a0;
                    float dp922222 = AndroidUtilities.dp(1.0f);
                    TextUtils.TruncateAt truncateAt22222 = TextUtils.TruncateAt.END;
                    this.e3 = iw0.b(charSequence26, textPaint622222, i4222222, dp922222, i4222222, charSequence412 != null ? 1 : 2);
                    max = i4222222;
                } else {
                    if (this.R1 > 0) {
                        max += AndroidUtilities.dp(((this.H4 + 2) * r0) + 3);
                        if (LocaleController.isRTL && !Q()) {
                            this.b3 -= AndroidUtilities.dp(((this.H4 + 2) * this.R1) + 3);
                        }
                    }
                    int i66 = max;
                    try {
                        this.e3 = new StaticLayout(charSequence26, this.a0, i66, alignment22222, 1.0f, 0.0f, false);
                        max = i66;
                    } catch (Exception e16) {
                        e = e16;
                        max = i66;
                        this.e3 = null;
                        FileLog.e(e);
                        int i4322222 = max;
                        this.m3 = org.telegram.ui.Components.z5.update(0, (View) this, this.m3, this.e3);
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
                wh.h.b(this, this.e3, -2, -2, this.i3, this.j3);
                int i43222222 = max;
                this.m3 = org.telegram.ui.Components.z5.update(0, (View) this, this.m3, this.e3);
                if (LocaleController.isRTL) {
                    StaticLayout staticLayout2 = this.z2;
                    if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                        float lineLeft = this.z2.getLineLeft(0);
                        double ceil2 = Math.ceil(this.z2.getLineWidth(0));
                        int dp32 = AndroidUtilities.dp(12.0f) + this.x2;
                        this.x2 = dp32;
                        if (this.g4) {
                            this.x2 = AndroidUtilities.dp(f14) + dp32;
                        }
                        if (this.D2) {
                            ceil2 = Math.min(this.y2, ceil2);
                        }
                        if ((this.Z0 || this.b1 || this.c1 > f11) && !this.f4 && this.l4 == 0) {
                            if (this.h4) {
                                int dp33 = (int) ((((this.y2 - ceil2) - lineLeft) + this.x2) - AndroidUtilities.dp(f20));
                                this.H2 = dp33;
                                this.I2 = (dp33 - AndroidUtilities.dp(f15)) - org.telegram.ui.ActionBar.j6.c1.getIntrinsicWidth();
                            } else {
                                this.H2 = (int) ((((this.y2 - ceil2) + this.x2) - AndroidUtilities.dp(f15)) - org.telegram.ui.ActionBar.j6.c1.getIntrinsicWidth());
                            }
                        } else if (this.f4) {
                            this.H2 = (int) ((((this.y2 - ceil2) + this.x2) - AndroidUtilities.dp(f15)) - org.telegram.ui.ActionBar.j6.f1.getIntrinsicWidth());
                        } else if (this.h4) {
                            int dp34 = (int) ((((this.y2 - ceil2) - lineLeft) + this.x2) - AndroidUtilities.dp(f20));
                            this.H2 = dp34;
                            this.I2 = (dp34 - AndroidUtilities.dp(f15)) - org.telegram.ui.ActionBar.j6.c1.getIntrinsicWidth();
                        } else if (this.l4 != 0) {
                            this.H2 = (int) ((((this.y2 - ceil2) + this.x2) - AndroidUtilities.dp(f15)) - (this.l4 == 1 ? org.telegram.ui.ActionBar.j6.g1 : org.telegram.ui.ActionBar.j6.h1).getIntrinsicWidth());
                        } else {
                            this.H2 = (int) ((((this.y2 - ceil2) + this.x2) - AndroidUtilities.dp(f15)) - org.telegram.ui.ActionBar.j6.c1.getIntrinsicWidth());
                        }
                        if (lineLeft == f11) {
                            double d10 = this.y2;
                            if (ceil2 < d10) {
                                this.x2 = (int) ((d10 - ceil2) + this.x2);
                            }
                        }
                    }
                    StaticLayout staticLayout3 = this.e3;
                    int i67 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (staticLayout3 != null && (lineCount6 = staticLayout3.getLineCount()) > 0) {
                        int i68 = 0;
                        int i69 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        while (true) {
                            if (i68 >= lineCount6) {
                                break;
                            }
                            if (this.e3.getLineLeft(i68) != f11) {
                                i69 = 0;
                                break;
                            } else {
                                i69 = Math.min(i69, (int) (i43222222 - Math.ceil(this.e3.getLineWidth(i68))));
                                i68++;
                            }
                        }
                        if (i69 != Integer.MAX_VALUE) {
                            this.b3 += i69;
                        }
                    }
                    StaticLayout staticLayout4 = this.f3;
                    if (staticLayout4 != null && (lineCount5 = staticLayout4.getLineCount()) > 0) {
                        int i70 = 0;
                        int i71 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        while (true) {
                            if (i70 >= lineCount5) {
                                break;
                            }
                            if (this.f3.getLineLeft(i70) != f11) {
                                i71 = 0;
                                break;
                            } else {
                                i71 = Math.min(i71, (int) (i43222222 - Math.ceil(this.f3.getLineWidth(i70))));
                                i70++;
                            }
                        }
                        if (i71 != Integer.MAX_VALUE) {
                            this.d3 += i71;
                        }
                    }
                    StaticLayout staticLayout5 = this.s3;
                    if (staticLayout5 != null && staticLayout5.getLineCount() > 0 && this.s3.getLineLeft(0) == f11) {
                        double ceil3 = Math.ceil(this.s3.getLineWidth(0));
                        double d11 = i43222222;
                        if (ceil3 < d11) {
                            this.r3 = (int) ((d11 - ceil3) + this.r3);
                        }
                    }
                    StaticLayout staticLayout6 = this.h3;
                    if (staticLayout6 != null && (lineCount4 = staticLayout6.getLineCount()) > 0) {
                        for (int i72 = 0; i72 < lineCount4; i72++) {
                            i67 = (int) Math.min(i67, this.h3.getWidth() - this.h3.getLineRight(i72));
                        }
                        this.c3 += i67;
                    }
                } else {
                    StaticLayout staticLayout7 = this.z2;
                    if (staticLayout7 != null && staticLayout7.getLineCount() > 0) {
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
                        if (this.g4) {
                            this.x2 = AndroidUtilities.dp(f14) + this.x2;
                        }
                        int dp35 = (int) (this.x2 + lineRight + AndroidUtilities.dp(f15));
                        this.H2 = dp35;
                        if (this.h4) {
                            this.I2 = AndroidUtilities.dp(f19) + dp35;
                        }
                    }
                    StaticLayout staticLayout8 = this.e3;
                    float f22 = 2.14748365E9f;
                    if (staticLayout8 != null && (lineCount3 = staticLayout8.getLineCount()) > 0) {
                        float f23 = 2.14748365E9f;
                        for (int i73 = 0; i73 < lineCount3; i73++) {
                            f23 = Math.min(f23, this.e3.getLineLeft(i73));
                        }
                        this.b3 = (int) (this.b3 - f23);
                    }
                    StaticLayout staticLayout9 = this.h3;
                    if (staticLayout9 != null && (lineCount2 = staticLayout9.getLineCount()) > 0) {
                        float f24 = 2.14748365E9f;
                        for (int i74 = 0; i74 < lineCount2; i74++) {
                            f24 = Math.min(f24, this.h3.getLineLeft(i74));
                        }
                        this.c3 = (int) (this.c3 - f24);
                    }
                    StaticLayout staticLayout10 = this.f3;
                    if (staticLayout10 != null && (lineCount = staticLayout10.getLineCount()) > 0) {
                        for (int i75 = 0; i75 < lineCount; i75++) {
                            f22 = Math.min(f22, this.f3.getLineLeft(i75));
                        }
                        this.d3 = (int) (this.d3 - f22);
                    }
                    StaticLayout staticLayout11 = this.s3;
                    if (staticLayout11 != null && staticLayout11.getLineCount() > 0) {
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
                        this.y4 = (int) (this.d3 + primaryHorizontal);
                    } else {
                        this.y4 = (int) (this.d3 + primaryHorizontal2 + AndroidUtilities.dp(3.0f));
                    }
                }
                e0();
            }
            f13 = 36.0f;
            if (this.g4) {
            }
            dp7 = this.y2 - AndroidUtilities.dp(12.0f);
            if (dp7 < 0) {
            }
            if (charSequence22 instanceof String) {
            }
            if (this.D2) {
            }
            float f2122 = dp7;
            this.R = org.telegram.ui.ActionBar.j6.B0[this.E0].measureText(charSequence22.toString()) <= f2122;
            if (!this.Q) {
            }
            CharSequence replaceEmoji322 = Emoji.replaceEmoji(charSequence22, org.telegram.ui.ActionBar.j6.B0[this.E0].getFontMetricsInt(), false);
            MessageObject messageObject2122 = this.f1;
            if (messageObject2122 == null) {
            }
            if (this.Q) {
            }
            this.B2 = (this.D2 || !this.z2.isRtlCharAt(0)) ? 0.0f : -AndroidUtilities.dp(f13);
            this.C2 = this.z2.isRtlCharAt(0);
            this.p3 = org.telegram.ui.Components.z5.update(0, (View) this, this.p3, this.z2);
            if (this.r2) {
            }
            f17 = 39.0f;
            f18 = 32.0f;
            f19 = 30.0f;
            f20 = 24.0f;
            dp = AndroidUtilities.dp(11.0f);
            this.q3 = AndroidUtilities.dp(32.0f);
            this.M2 = AndroidUtilities.dp(13.0f);
            this.u3 = AndroidUtilities.dp(42.33f);
            this.C3 = AndroidUtilities.dp(43.0f);
            this.I3 = AndroidUtilities.dp(42.33f);
            this.W2 = AndroidUtilities.dp(13.0f);
            int measuredWidth422222 = getMeasuredWidth() - AndroidUtilities.dp(this.I + 21);
            if (LocaleController.isRTL) {
            }
            i20 = dp3;
            this.u0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
            i21 = 0;
            while (true) {
                imageReceiverArr = this.V1;
                if (i21 >= imageReceiverArr.length) {
                }
                imageReceiverArr[i21].setImageCoords(((this.H4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.Q ? AndroidUtilities.dp(20.0f) : 0)) - ((this.r2 || SharedConfig.useThreeLinesLayout || (gsVar = this.t0) == null || gsVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                i21++;
                dp = dp;
            }
            i22 = dp;
            i23 = measuredWidth422222;
            if (LocaleController.isRTL) {
            }
            if (this.Q) {
            }
            if (!this.r2) {
                this.M2 -= AndroidUtilities.dp(f15);
                this.W2 -= AndroidUtilities.dp(f15);
                if (getIsPinned()) {
                }
                if (!this.t3) {
                }
                if (z20) {
                }
                max = Math.max(AndroidUtilities.dp(12.0f), i23);
                this.g3 = AndroidUtilities.dp((!this.r2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                if (!this.r2) {
                    this.g3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
                    if (Q()) {
                    }
                    if (this.Q) {
                    }
                    this.n3 = org.telegram.ui.Components.z5.update(0, (View) this, this.n3, this.s3);
                    if (TextUtils.isEmpty(charSequence24)) {
                    }
                    this.o3 = org.telegram.ui.Components.z5.update(0, (View) this, this.o3, this.h3);
                    if (!TextUtils.isEmpty(charSequence23)) {
                    }
                    if (replaceEmoji instanceof Spannable) {
                    }
                    if (this.r2) {
                    }
                    this.a0 = org.telegram.ui.ActionBar.j6.F0[this.E0];
                    charSequence26 = charSequence412;
                    charSequence412 = null;
                    Layout.Alignment alignment222222 = Layout.Alignment.ALIGN_NORMAL;
                    if (this.r2) {
                    }
                    if (this.R1 > 0) {
                        max += AndroidUtilities.dp(f12);
                    }
                    int i42222222 = max;
                    TextPaint textPaint6222222 = this.a0;
                    float dp9222222 = AndroidUtilities.dp(1.0f);
                    TextUtils.TruncateAt truncateAt222222 = TextUtils.TruncateAt.END;
                    this.e3 = iw0.b(charSequence26, textPaint6222222, i42222222, dp9222222, i42222222, charSequence412 != null ? 1 : 2);
                    max = i42222222;
                    this.i3.addAll(this.j3);
                    this.j3.clear();
                    wh.h.b(this, this.e3, -2, -2, this.i3, this.j3);
                    int i432222222 = max;
                    this.m3 = org.telegram.ui.Components.z5.update(0, (View) this, this.m3, this.e3);
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
                this.g3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
                if (Q()) {
                }
                if (this.Q) {
                }
                this.n3 = org.telegram.ui.Components.z5.update(0, (View) this, this.n3, this.s3);
                if (TextUtils.isEmpty(charSequence24)) {
                }
                this.o3 = org.telegram.ui.Components.z5.update(0, (View) this, this.o3, this.h3);
                if (!TextUtils.isEmpty(charSequence23)) {
                }
                if (replaceEmoji instanceof Spannable) {
                }
                if (this.r2) {
                }
                this.a0 = org.telegram.ui.ActionBar.j6.F0[this.E0];
                charSequence26 = charSequence412;
                charSequence412 = null;
                Layout.Alignment alignment2222222 = Layout.Alignment.ALIGN_NORMAL;
                if (this.r2) {
                }
                if (this.R1 > 0) {
                }
                int i422222222 = max;
                TextPaint textPaint62222222 = this.a0;
                float dp92222222 = AndroidUtilities.dp(1.0f);
                TextUtils.TruncateAt truncateAt2222222 = TextUtils.TruncateAt.END;
                this.e3 = iw0.b(charSequence26, textPaint62222222, i422222222, dp92222222, i422222222, charSequence412 != null ? 1 : 2);
                max = i422222222;
                this.i3.addAll(this.j3);
                this.j3.clear();
                wh.h.b(this, this.e3, -2, -2, this.i3, this.j3);
                int i4322222222 = max;
                this.m3 = org.telegram.ui.Components.z5.update(0, (View) this, this.m3, this.e3);
                if (LocaleController.isRTL) {
                }
                staticLayout = this.f3;
                if (staticLayout != null) {
                }
                e0();
            }
            this.M2 -= AndroidUtilities.dp(f15);
            this.W2 -= AndroidUtilities.dp(f15);
            if (getIsPinned()) {
            }
            if (!this.t3) {
            }
            if (z20) {
            }
            max = Math.max(AndroidUtilities.dp(12.0f), i23);
            this.g3 = AndroidUtilities.dp((!this.r2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
            if (!this.r2) {
            }
            this.g3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
            if (Q()) {
            }
            if (this.Q) {
            }
            this.n3 = org.telegram.ui.Components.z5.update(0, (View) this, this.n3, this.s3);
            if (TextUtils.isEmpty(charSequence24)) {
            }
            this.o3 = org.telegram.ui.Components.z5.update(0, (View) this, this.o3, this.h3);
            if (!TextUtils.isEmpty(charSequence23)) {
            }
            if (replaceEmoji instanceof Spannable) {
            }
            if (this.r2) {
            }
            this.a0 = org.telegram.ui.ActionBar.j6.F0[this.E0];
            charSequence26 = charSequence412;
            charSequence412 = null;
            Layout.Alignment alignment22222222 = Layout.Alignment.ALIGN_NORMAL;
            if (this.r2) {
            }
            if (this.R1 > 0) {
            }
            int i4222222222 = max;
            TextPaint textPaint622222222 = this.a0;
            float dp922222222 = AndroidUtilities.dp(1.0f);
            TextUtils.TruncateAt truncateAt22222222 = TextUtils.TruncateAt.END;
            this.e3 = iw0.b(charSequence26, textPaint622222222, i4222222222, dp922222222, i4222222222, charSequence412 != null ? 1 : 2);
            max = i4222222222;
            this.i3.addAll(this.j3);
            this.j3.clear();
            wh.h.b(this, this.e3, -2, -2, this.i3, this.j3);
            int i43222222222 = max;
            this.m3 = org.telegram.ui.Components.z5.update(0, (View) this, this.m3, this.e3);
            if (LocaleController.isRTL) {
            }
            staticLayout = this.f3;
            if (staticLayout != null) {
            }
            e0();
        }
        f12 = 5.0f;
        if (this.Z0) {
        }
        if (!this.h4) {
        }
        if (z23) {
        }
        f13 = 36.0f;
        if (this.g4) {
        }
        dp7 = this.y2 - AndroidUtilities.dp(12.0f);
        if (dp7 < 0) {
        }
        if (charSequence22 instanceof String) {
        }
        if (this.D2) {
        }
        float f21222 = dp7;
        this.R = org.telegram.ui.ActionBar.j6.B0[this.E0].measureText(charSequence22.toString()) <= f21222;
        if (!this.Q) {
        }
        CharSequence replaceEmoji3222 = Emoji.replaceEmoji(charSequence22, org.telegram.ui.ActionBar.j6.B0[this.E0].getFontMetricsInt(), false);
        MessageObject messageObject21222 = this.f1;
        if (messageObject21222 == null) {
        }
        if (this.Q) {
        }
        this.B2 = (this.D2 || !this.z2.isRtlCharAt(0)) ? 0.0f : -AndroidUtilities.dp(f13);
        this.C2 = this.z2.isRtlCharAt(0);
        this.p3 = org.telegram.ui.Components.z5.update(0, (View) this, this.p3, this.z2);
        if (this.r2) {
        }
        f17 = 39.0f;
        f18 = 32.0f;
        f19 = 30.0f;
        f20 = 24.0f;
        dp = AndroidUtilities.dp(11.0f);
        this.q3 = AndroidUtilities.dp(32.0f);
        this.M2 = AndroidUtilities.dp(13.0f);
        this.u3 = AndroidUtilities.dp(42.33f);
        this.C3 = AndroidUtilities.dp(43.0f);
        this.I3 = AndroidUtilities.dp(42.33f);
        this.W2 = AndroidUtilities.dp(13.0f);
        int measuredWidth4222222 = getMeasuredWidth() - AndroidUtilities.dp(this.I + 21);
        if (LocaleController.isRTL) {
        }
        i20 = dp3;
        this.u0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
        i21 = 0;
        while (true) {
            imageReceiverArr = this.V1;
            if (i21 >= imageReceiverArr.length) {
            }
            imageReceiverArr[i21].setImageCoords(((this.H4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.Q ? AndroidUtilities.dp(20.0f) : 0)) - ((this.r2 || SharedConfig.useThreeLinesLayout || (gsVar = this.t0) == null || gsVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
            i21++;
            dp = dp;
        }
        i22 = dp;
        i23 = measuredWidth4222222;
        if (LocaleController.isRTL) {
        }
        if (this.Q) {
        }
        if (!this.r2) {
        }
        this.M2 -= AndroidUtilities.dp(f15);
        this.W2 -= AndroidUtilities.dp(f15);
        if (getIsPinned()) {
        }
        if (!this.t3) {
        }
        if (z20) {
        }
        max = Math.max(AndroidUtilities.dp(12.0f), i23);
        this.g3 = AndroidUtilities.dp((!this.r2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
        if (!this.r2) {
        }
        this.g3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
        if (Q()) {
        }
        if (this.Q) {
        }
        this.n3 = org.telegram.ui.Components.z5.update(0, (View) this, this.n3, this.s3);
        if (TextUtils.isEmpty(charSequence24)) {
        }
        this.o3 = org.telegram.ui.Components.z5.update(0, (View) this, this.o3, this.h3);
        if (!TextUtils.isEmpty(charSequence23)) {
        }
        if (replaceEmoji instanceof Spannable) {
        }
        if (this.r2) {
        }
        this.a0 = org.telegram.ui.ActionBar.j6.F0[this.E0];
        charSequence26 = charSequence412;
        charSequence412 = null;
        Layout.Alignment alignment222222222 = Layout.Alignment.ALIGN_NORMAL;
        if (this.r2) {
        }
        if (this.R1 > 0) {
        }
        int i42222222222 = max;
        TextPaint textPaint6222222222 = this.a0;
        float dp9222222222 = AndroidUtilities.dp(1.0f);
        TextUtils.TruncateAt truncateAt222222222 = TextUtils.TruncateAt.END;
        this.e3 = iw0.b(charSequence26, textPaint6222222222, i42222222222, dp9222222222, i42222222222, charSequence412 != null ? 1 : 2);
        max = i42222222222;
        this.i3.addAll(this.j3);
        this.j3.clear();
        wh.h.b(this, this.e3, -2, -2, this.i3, this.j3);
        int i432222222222 = max;
        this.m3 = org.telegram.ui.Components.z5.update(0, (View) this, this.m3, this.e3);
        if (LocaleController.isRTL) {
        }
        staticLayout = this.f3;
        if (staticLayout != null) {
        }
        e0();
    }

    public final void u() {
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

    public final void v() {
        TLRPC.Chat chat = this.g2;
        boolean z10 = chat != null && chat.call_active && chat.call_not_empty;
        this.v2 = z10;
        this.q1 = z10 ? 1.0f : 0.0f;
    }

    public final void w() {
        TLRPC.User user;
        if (this.f2 != null && (user = MessagesController.getInstance(this.F0).getUser(Long.valueOf(this.f2.id))) != null) {
            this.f2 = user;
        }
        this.p1 = R() ? 1.0f : 0.0f;
    }

    public final void x() {
        di.q3 q3Var;
        boolean z10 = this.l0 > 0 && !this.v2 && !R() && ((q3Var = this.q2) == null || !q3Var.a.q) && !this.u0.w;
        this.w2 = z10;
        this.m0 = z10 ? 1.0f : 0.0f;
    }

    public final int y() {
        if (!Q() || this.j0 || this.f) {
            return getCollapsedHeight();
        }
        int dp = AndroidUtilities.dp((this.r2 || SharedConfig.useThreeLinesLayout) ? 86.0f : 91.0f);
        if (this.s2) {
            dp++;
        }
        return M() ? AndroidUtilities.dp(this.M) + dp : dp;
    }

    public r2(uy uyVar, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
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
        j2 j2Var = new j2(this);
        this.u0 = j2Var;
        this.z0 = true;
        this.C0 = 0.0f;
        this.d1 = false;
        this.e1 = false;
        this.F1 = new zc(this);
        this.G1 = new Paint(1);
        this.H1 = new RectF();
        this.L1 = false;
        this.U1 = new boolean[3];
        this.V1 = new ImageReceiver[3];
        this.W1 = new boolean[3];
        this.X1 = new boolean[3];
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Y1 = imageReceiver;
        this.a2 = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        this.d2 = new l2(0);
        pr prVar = pr.h;
        this.m2 = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar);
        this.o2 = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar);
        this.i3 = new Stack();
        this.j3 = new ArrayList();
        this.k3 = new Stack();
        this.l3 = new ArrayList();
        this.H3 = true;
        this.O3 = new le.b(this, prVar, 320L);
        this.R3 = 1.0f;
        this.S3 = 1.0f;
        this.n4 = new RectF();
        this.t4 = -1;
        this.D4 = -1;
        this.E4 = new o2(this);
        j2Var.I = true;
        this.F4 = f6Var;
        this.z4 = uyVar;
        org.telegram.ui.ActionBar.j6.R(context);
        this.y = false;
        this.E = false;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
        while (true) {
            ImageReceiver[] imageReceiverArr = this.V1;
            if (i11 >= imageReceiverArr.length) {
                this.r2 = z10;
                this.F0 = i10;
                di.eb ebVar = new di.eb(this, context, 11);
                this.i4 = ebVar;
                addView(ebVar);
                this.j4 = new org.telegram.ui.Components.o5(AndroidUtilities.dp(22.0f), ebVar);
                this.k4 = new org.telegram.ui.Components.o5(AndroidUtilities.dp(17.0f), this);
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
        if (pb.x1) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void d() {
    }
}
