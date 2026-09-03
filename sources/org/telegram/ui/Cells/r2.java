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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pd0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.x11;
import org.telegram.ui.Components.xc;
import org.telegram.ui.a10;
import org.telegram.ui.a41;
import org.telegram.ui.kx;
import org.telegram.ui.py;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class r2 extends a0 implements oh.z6, org.telegram.ui.ActionBar.b6 {
    public th.a A0;
    public float A1;
    public boolean A2;
    public int A3;
    public int A4;
    public boolean B;
    public int B0;
    public boolean B1;
    public Paint B2;
    public int B3;
    public final o2 B4;
    public boolean C;
    public final int C0;
    public final rc C1;
    public Paint C2;
    public float C3;
    public final org.telegram.ui.ActionBar.g6 C4;
    public d7 D;
    public m2 D0;
    public final Paint D1;
    public boolean D2;
    public boolean D3;
    public int D4;
    public int E;
    public long E0;
    public final RectF E1;
    public int E2;
    public boolean E3;
    public int E4;
    public int F;
    public String F0;
    public k01 F1;
    public int F2;
    public int F3;
    public int F4;
    public int G;
    public int G0;
    public boolean G1;
    public int G2;
    public int G3;
    public q2 G4;
    public int H;
    public long H0;
    public org.telegram.ui.web.d1 H1;
    public int H2;
    public int H3;
    public GradientDrawable H4;
    public final int I;
    public String I0;
    public boolean I1;
    public int I2;
    public int I3;
    public int I4;
    public final int J;
    public int J0;
    public int J1;
    public int J2;
    public int J3;
    public int J4;
    public TLRPC.TL_forumTopic K;
    public boolean K0;
    public int K1;
    public StaticLayout K2;
    public boolean K3;
    public Paint K4;
    public boolean L;
    public boolean L0;
    public String L1;
    public int L2;
    public final xd.a L3;
    public fg.p1 L4;
    public boolean M;
    public boolean M0;
    public int M1;
    public boolean M2;
    public ValueAnimator M3;
    public Drawable M4;
    public boolean N;
    public boolean N0;
    public hj0 N1;
    public boolean N2;
    public ValueAnimator N3;
    public int N4;
    public boolean O;
    public int O0;
    public int O1;
    public boolean O2;
    public float O3;
    public Drawable O4;
    public Paint P;
    public int P0;
    public boolean P1;
    public boolean P2;
    public float P3;
    public Drawable P4;
    public Paint Q;
    public boolean Q0;
    public Paint Q1;
    public int Q2;
    public StaticLayout Q3;
    public ColorFilter[] Q4;
    public float R;
    public int R0;
    public final boolean[] R1;
    public int R2;
    public StaticLayout R3;
    public int[] R4;
    public boolean S;
    public int S0;
    public final ImageReceiver[] S1;
    public int S2;
    public StaticLayout S3;
    public Runnable S4;
    public boolean T;
    public int T0;
    public final boolean[] T1;
    public int T2;
    public StaticLayout T3;
    public TextPaint U;
    public boolean U0;
    public final boolean[] U1;
    public int U2;
    public boolean U3;
    public Paint V;
    public int V0;
    public final ImageReceiver V1;
    public int V2;
    public boolean V3;
    public xc W;
    public boolean W0;
    public ve0 W1;
    public int W2;
    public boolean W3;
    public boolean X0;
    public final org.telegram.ui.Components.z8 X1;
    public int X2;
    public int X3;
    public boolean Y0;
    public boolean Y1;
    public int Y2;
    public int Y3;
    public float Z0;
    public float Z1;
    public int Z2;
    public int Z3;
    public n2 a0;
    public boolean a1;
    public final f2.a0 a2;
    public int a3;
    public int a4;
    public boolean b0;
    public boolean b1;
    public ri0 b2;
    public StaticLayout b3;
    public StaticLayout b4;
    public boolean c0;
    public MessageObject c1;
    public TLRPC.User c2;
    public StaticLayout c3;
    public boolean c4;
    public boolean d0;
    public ArrayList d1;
    public TLRPC.Chat d2;
    public int d3;
    public boolean d4;
    public Drawable[] e0;
    public boolean e1;
    public TLRPC.EncryptedChat e2;
    public StaticLayout e3;
    public boolean e4;
    public boolean f;
    public float f0;
    public CharSequence f1;
    public CharSequence f2;
    public final Stack f3;
    public final fg.h0 f4;
    public boolean g0;
    public int g1;
    public int g2;
    public final ArrayList g3;
    public final org.telegram.ui.Components.j5 g4;
    public final boolean h;
    public boolean h0;
    public int h1;
    public boolean h2;
    public final Stack h3;
    public final org.telegram.ui.Components.j5 h4;
    public int i0;
    public int i1;
    public TLRPC.DraftMessage i2;
    public final ArrayList i3;
    public int i4;
    public float j0;
    public boolean j1;
    public final org.telegram.ui.Components.z5 j2;
    public org.telegram.ui.Components.q5 j3;
    public boolean j4;
    public x11 k0;
    public boolean k1;
    public boolean k2;
    public org.telegram.ui.Components.q5 k3;
    public final RectF k4;
    public Paint l0;
    public float l1;
    public final org.telegram.ui.Components.z5 l2;
    public org.telegram.ui.Components.q5 l3;
    public uf.h l4;
    public Paint m0;
    public float m1;
    public long m2;
    public org.telegram.ui.Components.q5 m3;
    public Path m4;
    public float n;
    public boolean n0;
    public float n1;
    public k2 n2;
    public int n3;
    public RectF n4;
    public boolean o0;
    public float o1;
    public final boolean o2;
    public int o3;
    public int o4;
    public boolean p0;
    public int p1;
    public boolean p2;
    public StaticLayout p3;
    public int p4;
    public is q0;
    public float q1;
    public boolean q2;
    public boolean q3;
    public int q4;
    public boolean r;
    public final j2 r0;
    public int r1;
    public boolean r2;
    public int r3;
    public float r4;
    public hj0 s;
    public Path s0;
    public int s1;
    public boolean s2;
    public int s3;
    public boolean s4;
    public jh.k t0;
    public float t1;
    public boolean t2;
    public boolean t3;
    public ValueAnimator t4;
    public boolean u0;
    public boolean u1;
    public int u2;
    public float u3;
    public long u4;
    public int v;
    public boolean v0;
    public hj0 v1;
    public int v2;
    public boolean v3;
    public int v4;
    public boolean w;
    public boolean w0;
    public boolean w1;
    public StaticLayout w2;
    public boolean w3;
    public final py w4;
    public boolean x;
    public boolean x0;
    public boolean x1;
    public boolean x2;
    public boolean x3;
    public StaticLayout x4;
    public boolean y;
    public boolean y0;
    public float y1;
    public float y2;
    public boolean y3;
    public int y4;
    public float z0;
    public float z1;
    public boolean z2;
    public int z3;
    public int z4;

    public r2(Context context, boolean z4) {
        this(null, context, z4, UserConfig.selectedAccount, null);
    }

    public static SpannableStringBuilder H(CharSequence charSequence, CharSequence charSequence2, int i10) {
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
        if (this.d1 == null) {
            MessageObject messageObject = this.c1;
            if (messageObject == null || messageObject.caption == null) {
                return null;
            }
            return messageObject;
        }
        MessageObject messageObject2 = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.d1.size(); i11++) {
            MessageObject messageObject3 = (MessageObject) this.d1.get(i11);
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
        boolean z4 = this.o2;
        int dp = AndroidUtilities.dp((z4 || SharedConfig.useThreeLinesLayout) ? this.H : this.G) + 1;
        if (this.N) {
            dp += AndroidUtilities.dp(20.0f);
        }
        if (!M() || ((z4 || SharedConfig.useThreeLinesLayout) && !Q())) {
            return dp;
        }
        return AndroidUtilities.dp(Q() ? this.J : this.I) + dp;
    }

    private Paint getPaintReorderGradient() {
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, this.C4);
        if (this.J4 != v02 || this.K4 == null) {
            this.J4 = v02;
            if (this.K4 == null) {
                this.K4 = new Paint(1);
            }
            this.K4.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{0, v02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
        return this.K4;
    }

    private TextPaint getTimeTextPaint() {
        return this.D3 ? N() ? org.telegram.ui.ActionBar.k6.J0 : org.telegram.ui.ActionBar.k6.K0 : org.telegram.ui.ActionBar.k6.I0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTopicId() {
        TLRPC.TL_forumTopic tL_forumTopic = this.K;
        if (tL_forumTopic == null) {
            return 0;
        }
        return tL_forumTopic.id;
    }

    public final void A(int i10, int i11) {
        this.r4 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.t4 = ofFloat;
        ofFloat.setDuration(220L);
        this.t4.setInterpolator(pr.f);
        this.p4 = i10;
        this.o4 = i11;
        this.t4.addUpdateListener(new g2(this, 2));
        this.t4.addListener(new l2(this, 2));
        this.s4 = true;
        this.t4.start();
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
        boolean z4;
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
        boolean z10;
        float dp12;
        k2 k2Var;
        TLRPC.Chat chat = this.d2;
        boolean z11 = false;
        if (chat == null || (chat.flags2 & 2048) == 0) {
            z4 = false;
        } else {
            float imageY2 = this.V1.getImageY2();
            float imageX2 = this.V1.getImageX2();
            k2 k2Var2 = this.n2;
            float progress = (k2Var2 == null || !k2Var2.a.q) ? 1.0f : 1.0f - k2Var2.getProgress();
            if (this.P4 == null) {
                this.P4 = getContext().getResources().getDrawable(R.drawable.star_small_outline).mutate();
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false);
            if (this.N4 != w02) {
                Drawable drawable = this.P4;
                this.N4 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (this.O4 == null) {
                this.O4 = getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate();
            }
            int dp13 = AndroidUtilities.dp(19.33f);
            Rect rect = AndroidUtilities.rectTmp2;
            int i11 = (int) imageX2;
            int i12 = (int) imageY2;
            int i13 = i12 - dp13;
            rect.set((AndroidUtilities.dp(1.66f) + i11) - dp13, i13, AndroidUtilities.dp(1.66f) + i11, i12);
            rect.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            this.P4.setBounds(rect);
            int i14 = (int) (progress * 255.0f);
            this.P4.setAlpha(i14);
            this.P4.draw(canvas);
            rect.set((AndroidUtilities.dp(1.66f) + i11) - dp13, i13, AndroidUtilities.dp(1.66f) + i11, i12);
            this.O4.setBounds(rect);
            this.O4.setAlpha(i14);
            this.O4.draw(canvas);
            z4 = true;
        }
        float e6 = this.j2.e(this.k2 && !z4);
        float f17 = 10.0f;
        if (e6 > 0.0f) {
            float centerY = this.V1.getCenterY() + AndroidUtilities.dp(18.0f);
            float centerX = this.V1.getCenterX() + AndroidUtilities.dp(18.0f);
            canvas.save();
            org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, this.C4));
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(11.33f) * e6, org.telegram.ui.ActionBar.k6.t0);
            if (this.L4 == null) {
                this.L4 = new fg.p1(org.telegram.ui.ActionBar.k6.Lj, org.telegram.ui.ActionBar.k6.Mj, -1, -1, this.C4);
            }
            this.L4.d((int) (centerX - AndroidUtilities.dp(10.0f)), 0.0f, (int) (centerY - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + centerX), 0.0f, (int) (AndroidUtilities.dp(10.0f) + centerY));
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f) * e6, this.L4.f);
            if (this.M4 == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.M4 = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.M4.setBounds((int) (centerX - (((r4.getIntrinsicWidth() / 2.0f) * 0.875f) * e6)), (int) (centerY - (((this.M4.getIntrinsicHeight() / 2.0f) * 0.875f) * e6)), (int) (((this.M4.getIntrinsicWidth() / 2.0f) * 0.875f * e6) + centerX), (int) (((this.M4.getIntrinsicHeight() / 2.0f) * 0.875f * e6) + centerY));
            this.M4.setAlpha((int) (e6 * 255.0f));
            this.M4.draw(canvas);
            canvas.restore();
            return false;
        }
        if (!this.K0 || this.G0 != 0 || z4) {
            return false;
        }
        boolean z12 = (this.i0 <= 0 || R() || this.s2 || this.r0.w) ? false : true;
        this.t2 = z12;
        if (this.f0 != 1.0f && (z12 || this.j0 > 0.0f)) {
            x11 x11Var = this.k0;
            if (x11Var != null) {
                int i15 = x11Var.f;
                int i16 = this.i0;
                if (i15 != i16) {
                }
                if (this.l0 == null) {
                    this.l0 = new Paint(1);
                    Paint paint = new Paint(1);
                    this.m0 = paint;
                    paint.setColor(838860800);
                }
                int imageY22 = (int) (this.V1.getImageY2() - AndroidUtilities.dp(9.0f));
                int dp14 = (int) (!LocaleController.isRTL ? this.r0.F.left + AndroidUtilities.dp(9.0f) : this.r0.F.right - AndroidUtilities.dp(9.0f));
                this.k0.setBounds(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
                this.k0.b(this.i0);
                if (this.V1.updateThumbShaderMatrix()) {
                    this.l0.setShader(null);
                    if (this.V1.getBitmap() != null && !this.V1.getBitmap().isRecycled()) {
                        this.l0.setColor(AndroidUtilities.getDominantColor(this.V1.getBitmap()));
                    } else if (this.V1.getDrawable() instanceof t61) {
                        this.l0.setColor(((t61) this.V1.getDrawable()).a.a());
                    } else {
                        this.l0.setColor(this.X1.c());
                    }
                } else {
                    ImageReceiver imageReceiver = this.V1;
                    BitmapShader bitmapShader = imageReceiver.thumbShader;
                    if (bitmapShader != null) {
                        this.l0.setShader(bitmapShader);
                    } else {
                        BitmapShader bitmapShader2 = imageReceiver.staticThumbShader;
                        if (bitmapShader2 != null) {
                            this.l0.setShader(bitmapShader2);
                        }
                    }
                }
                canvas.save();
                float f18 = (1.0f - this.f0) * this.j0;
                k2Var = this.n2;
                if (k2Var != null) {
                    f18 *= 1.0f - k2Var.getProgress();
                }
                float f19 = dp14;
                float f20 = imageY22;
                canvas.scale(f18, f18, f19, f20);
                canvas.drawCircle(f19, f20, AndroidUtilities.dpf2(11.0f), this.l0);
                canvas.drawCircle(f19, f20, AndroidUtilities.dpf2(11.0f), this.m0);
                canvas.save();
                canvas.translate(f19 - AndroidUtilities.dpf2(11.0f), f20 - AndroidUtilities.dpf2(11.0f));
                this.k0.draw(canvas);
                canvas.restore();
                canvas.restore();
            }
            int i17 = this.i0;
            x11 x11Var2 = new x11(ApplicationLoader.applicationContext, null);
            x11Var2.m = true;
            x11Var2.b(i17);
            this.k0 = x11Var2;
            if (this.l0 == null) {
            }
            int imageY222 = (int) (this.V1.getImageY2() - AndroidUtilities.dp(9.0f));
            int dp142 = (int) (!LocaleController.isRTL ? this.r0.F.left + AndroidUtilities.dp(9.0f) : this.r0.F.right - AndroidUtilities.dp(9.0f));
            this.k0.setBounds(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.k0.b(this.i0);
            if (this.V1.updateThumbShaderMatrix()) {
            }
            canvas.save();
            float f182 = (1.0f - this.f0) * this.j0;
            k2Var = this.n2;
            if (k2Var != null) {
            }
            float f192 = dp142;
            float f202 = imageY222;
            canvas.scale(f182, f182, f192, f202);
            canvas.drawCircle(f192, f202, AndroidUtilities.dpf2(11.0f), this.l0);
            canvas.drawCircle(f192, f202, AndroidUtilities.dpf2(11.0f), this.m0);
            canvas.save();
            canvas.translate(f192 - AndroidUtilities.dpf2(11.0f), f202 - AndroidUtilities.dpf2(11.0f));
            this.k0.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
        TLRPC.User user = this.c2;
        if (user == null || MessagesController.isSupportUser(user) || this.c2.bot) {
            TLRPC.Chat chat2 = this.d2;
            if (chat2 != null) {
                boolean z13 = chat2.call_active && chat2.call_not_empty;
                this.s2 = z13;
                if ((z13 || this.n1 != 0.0f) && this.f0 < 1.0f) {
                    k2 k2Var3 = this.n2;
                    float progress2 = (k2Var3 == null || !k2Var3.a.q) ? 1.0f : 1.0f - k2Var3.getProgress();
                    int dp15 = (int) (this.r0.F.bottom - AndroidUtilities.dp((this.o2 || SharedConfig.useThreeLinesLayout) ? 6.0f : 8.0f));
                    if (LocaleController.isRTL) {
                        float f21 = this.r0.F.left;
                        f10 = 0.10666667f;
                        if (!this.o2 && !SharedConfig.useThreeLinesLayout) {
                            f17 = 6.0f;
                        }
                        dp = (int) (f21 + AndroidUtilities.dp(f17));
                    } else {
                        f10 = 0.10666667f;
                        float f22 = this.r0.F.right;
                        if (!this.o2 && !SharedConfig.useThreeLinesLayout) {
                            f17 = 6.0f;
                        }
                        dp = (int) (f22 - AndroidUtilities.dp(f17));
                    }
                    if (this.f0 != 0.0f) {
                        canvas.save();
                        float f23 = 1.0f - this.f0;
                        canvas.scale(f23, f23, dp, dp15);
                    }
                    Paint paint2 = org.telegram.ui.ActionBar.k6.t0;
                    int i18 = org.telegram.ui.ActionBar.k6.d6;
                    paint2.setColor(org.telegram.ui.ActionBar.k6.v0(i18, this.C4));
                    float f24 = dp;
                    float f25 = dp15;
                    canvas.drawCircle(f24, f25, AndroidUtilities.dp(11.0f) * this.n1 * progress2, org.telegram.ui.ActionBar.k6.t0);
                    org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.T8, this.C4));
                    canvas.drawCircle(f24, f25, AndroidUtilities.dp(9.0f) * this.n1 * progress2, org.telegram.ui.ActionBar.k6.t0);
                    org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.v0(i18, this.C4));
                    if (!LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                        this.o1 = 0.65f;
                    }
                    int i19 = this.p1;
                    if (i19 != 0) {
                        i10 = LiteMode.FLAGS_CHAT;
                        if (i19 != 1) {
                            if (i19 != 2) {
                                if (i19 == 3) {
                                    dp2 = AndroidUtilities.dp(3.0f) - (AndroidUtilities.dp(2.0f) * this.o1);
                                    dp3 = AndroidUtilities.dp(1.0f);
                                    dp4 = AndroidUtilities.dp(2.0f);
                                    f11 = this.o1;
                                } else if (i19 == 4) {
                                    dp2 = (AndroidUtilities.dp(4.0f) * this.o1) + AndroidUtilities.dp(1.0f);
                                    dp10 = AndroidUtilities.dp(3.0f);
                                    dp11 = AndroidUtilities.dp(2.0f);
                                    f14 = this.o1;
                                } else if (i19 == 5) {
                                    dp5 = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.o1);
                                    dp8 = AndroidUtilities.dp(1.0f);
                                    dp9 = AndroidUtilities.dp(4.0f);
                                    f13 = this.o1;
                                } else if (i19 == 6) {
                                    dp5 = AndroidUtilities.dp(1.0f) + (AndroidUtilities.dp(4.0f) * this.o1);
                                    dp6 = AndroidUtilities.dp(5.0f);
                                    dp7 = AndroidUtilities.dp(4.0f);
                                    f12 = this.o1;
                                } else {
                                    dp2 = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.o1);
                                    dp3 = AndroidUtilities.dp(1.0f);
                                    dp4 = AndroidUtilities.dp(2.0f);
                                    f11 = this.o1;
                                }
                                f15 = dp3 + (dp4 * f11);
                                if (this.n1 >= 1.0f || progress2 < 1.0f) {
                                    canvas.save();
                                    float f26 = this.n1 * progress2;
                                    canvas.scale(f26, f26, f24, f25);
                                }
                                this.k4.set(dp - AndroidUtilities.dp(1.0f), f25 - dp2, AndroidUtilities.dp(1.0f) + dp, dp2 + f25);
                                canvas.drawRoundRect(this.k4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.t0);
                                float f27 = f25 - f15;
                                float f28 = f25 + f15;
                                this.k4.set(dp - AndroidUtilities.dp(5.0f), f27, dp - AndroidUtilities.dp(3.0f), f28);
                                canvas.drawRoundRect(this.k4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.t0);
                                this.k4.set(AndroidUtilities.dp(3.0f) + dp, f27, AndroidUtilities.dp(5.0f) + dp, f28);
                                canvas.drawRoundRect(this.k4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.t0);
                                if (this.n1 >= 1.0f || progress2 < 1.0f) {
                                    canvas.restore();
                                }
                                if (LiteMode.isEnabled(i10)) {
                                    float f29 = this.o1 + 0.04f;
                                    this.o1 = f29;
                                    if (f29 >= 1.0f) {
                                        this.o1 = 0.0f;
                                        int i20 = this.p1 + 1;
                                        this.p1 = i20;
                                        if (i20 >= 8) {
                                            this.p1 = 0;
                                        }
                                    }
                                    z11 = true;
                                }
                                if (this.s2) {
                                    float f30 = this.n1;
                                    if (f30 > 0.0f) {
                                        float f31 = f30 - f10;
                                        this.n1 = f31;
                                        if (f31 < 0.0f) {
                                            this.n1 = 0.0f;
                                        }
                                    }
                                } else {
                                    float f32 = this.n1;
                                    if (f32 < 1.0f) {
                                        float f33 = f32 + f10;
                                        this.n1 = f33;
                                        if (f33 > 1.0f) {
                                            this.n1 = 1.0f;
                                        }
                                    }
                                }
                                if (this.f0 != 0.0f) {
                                    canvas.restore();
                                }
                                if (this.t2) {
                                    float f34 = this.j0;
                                    if (f34 < 1.0f) {
                                        this.j0 = f34 + f10;
                                        z10 = true;
                                    }
                                    z10 = z11;
                                } else {
                                    float f35 = this.j0;
                                    if (f35 > 0.0f) {
                                        this.j0 = f35 - f10;
                                        z10 = true;
                                    }
                                    z10 = z11;
                                }
                                this.j0 = Utilities.clamp(this.j0, 1.0f, 0.0f);
                                return z10;
                            }
                            dp5 = AndroidUtilities.dp(1.0f) + (AndroidUtilities.dp(2.0f) * this.o1);
                            dp6 = AndroidUtilities.dp(5.0f);
                            dp7 = AndroidUtilities.dp(4.0f);
                            f12 = this.o1;
                            f16 = dp6 - (dp7 * f12);
                            dp2 = dp5;
                            f15 = f16;
                            if (this.n1 >= 1.0f) {
                            }
                            canvas.save();
                            float f262 = this.n1 * progress2;
                            canvas.scale(f262, f262, f24, f25);
                            this.k4.set(dp - AndroidUtilities.dp(1.0f), f25 - dp2, AndroidUtilities.dp(1.0f) + dp, dp2 + f25);
                            canvas.drawRoundRect(this.k4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.t0);
                            float f272 = f25 - f15;
                            float f282 = f25 + f15;
                            this.k4.set(dp - AndroidUtilities.dp(5.0f), f272, dp - AndroidUtilities.dp(3.0f), f282);
                            canvas.drawRoundRect(this.k4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.t0);
                            this.k4.set(AndroidUtilities.dp(3.0f) + dp, f272, AndroidUtilities.dp(5.0f) + dp, f282);
                            canvas.drawRoundRect(this.k4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.t0);
                            if (this.n1 >= 1.0f) {
                            }
                            canvas.restore();
                            if (LiteMode.isEnabled(i10)) {
                            }
                            if (this.s2) {
                            }
                            if (this.f0 != 0.0f) {
                            }
                            if (this.t2) {
                            }
                            this.j0 = Utilities.clamp(this.j0, 1.0f, 0.0f);
                            return z10;
                        }
                        dp5 = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.o1);
                        dp8 = AndroidUtilities.dp(1.0f);
                        dp9 = AndroidUtilities.dp(4.0f);
                        f13 = this.o1;
                        f16 = dp8 + (dp9 * f13);
                        dp2 = dp5;
                        f15 = f16;
                        if (this.n1 >= 1.0f) {
                        }
                        canvas.save();
                        float f2622 = this.n1 * progress2;
                        canvas.scale(f2622, f2622, f24, f25);
                        this.k4.set(dp - AndroidUtilities.dp(1.0f), f25 - dp2, AndroidUtilities.dp(1.0f) + dp, dp2 + f25);
                        canvas.drawRoundRect(this.k4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.t0);
                        float f2722 = f25 - f15;
                        float f2822 = f25 + f15;
                        this.k4.set(dp - AndroidUtilities.dp(5.0f), f2722, dp - AndroidUtilities.dp(3.0f), f2822);
                        canvas.drawRoundRect(this.k4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.t0);
                        this.k4.set(AndroidUtilities.dp(3.0f) + dp, f2722, AndroidUtilities.dp(5.0f) + dp, f2822);
                        canvas.drawRoundRect(this.k4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.t0);
                        if (this.n1 >= 1.0f) {
                        }
                        canvas.restore();
                        if (LiteMode.isEnabled(i10)) {
                        }
                        if (this.s2) {
                        }
                        if (this.f0 != 0.0f) {
                        }
                        if (this.t2) {
                        }
                        this.j0 = Utilities.clamp(this.j0, 1.0f, 0.0f);
                        return z10;
                    }
                    float dp16 = AndroidUtilities.dp(1.0f);
                    float dp17 = AndroidUtilities.dp(4.0f);
                    i10 = LiteMode.FLAGS_CHAT;
                    dp2 = (dp17 * this.o1) + dp16;
                    dp10 = AndroidUtilities.dp(3.0f);
                    dp11 = AndroidUtilities.dp(2.0f);
                    f14 = this.o1;
                    f15 = dp10 - (dp11 * f14);
                    if (this.n1 >= 1.0f) {
                    }
                    canvas.save();
                    float f26222 = this.n1 * progress2;
                    canvas.scale(f26222, f26222, f24, f25);
                    this.k4.set(dp - AndroidUtilities.dp(1.0f), f25 - dp2, AndroidUtilities.dp(1.0f) + dp, dp2 + f25);
                    canvas.drawRoundRect(this.k4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.t0);
                    float f27222 = f25 - f15;
                    float f28222 = f25 + f15;
                    this.k4.set(dp - AndroidUtilities.dp(5.0f), f27222, dp - AndroidUtilities.dp(3.0f), f28222);
                    canvas.drawRoundRect(this.k4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.t0);
                    this.k4.set(AndroidUtilities.dp(3.0f) + dp, f27222, AndroidUtilities.dp(5.0f) + dp, f28222);
                    canvas.drawRoundRect(this.k4, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.t0);
                    if (this.n1 >= 1.0f) {
                    }
                    canvas.restore();
                    if (LiteMode.isEnabled(i10)) {
                    }
                    if (this.s2) {
                    }
                    if (this.f0 != 0.0f) {
                    }
                    if (this.t2) {
                    }
                    this.j0 = Utilities.clamp(this.j0, 1.0f, 0.0f);
                    return z10;
                }
            }
        } else {
            boolean R = R();
            this.y0 = R;
            if (R || this.m1 != 0.0f) {
                int dp18 = (int) (this.r0.F.bottom - AndroidUtilities.dp((this.o2 || SharedConfig.useThreeLinesLayout) ? 6.0f : 8.0f));
                if (LocaleController.isRTL) {
                    float f36 = this.r0.F.left;
                    if (!this.o2 && !SharedConfig.useThreeLinesLayout) {
                        f17 = 6.0f;
                    }
                    dp12 = f36 + AndroidUtilities.dp(f17);
                } else {
                    float f37 = this.r0.F.right;
                    if (!this.o2 && !SharedConfig.useThreeLinesLayout) {
                        f17 = 6.0f;
                    }
                    dp12 = f37 - AndroidUtilities.dp(f17);
                }
                int i21 = (int) dp12;
                org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, this.C4));
                float f38 = i21;
                float f39 = dp18;
                canvas.drawCircle(f38, f39, AndroidUtilities.dp(7.0f) * this.m1, org.telegram.ui.ActionBar.k6.t0);
                org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.T8, this.C4));
                canvas.drawCircle(f38, f39, AndroidUtilities.dp(5.0f) * this.m1, org.telegram.ui.ActionBar.k6.t0);
                if (R) {
                    float f40 = this.m1;
                    if (f40 < 1.0f) {
                        float f41 = f40 + 0.10666667f;
                        this.m1 = f41;
                        if (f41 > 1.0f) {
                            this.m1 = 1.0f;
                        }
                        z11 = true;
                    }
                } else {
                    float f42 = this.m1;
                    if (f42 > 0.0f) {
                        float f43 = f42 - 0.10666667f;
                        this.m1 = f43;
                        if (f43 < 0.0f) {
                            this.m1 = 0.0f;
                        }
                        z11 = true;
                    }
                }
            }
        }
        f10 = 0.10666667f;
        if (this.t2) {
        }
        this.j0 = Utilities.clamp(this.j0, 1.0f, 0.0f);
        return z10;
    }

    public final void C(Canvas canvas, boolean z4, boolean z10, boolean z11, boolean z12, float f10) {
        if (f10 != 0.0f || z12) {
            float f11 = (f10 * 0.5f) + 0.5f;
            if (z4) {
                a0.o(this.S2, this.T2, org.telegram.ui.ActionBar.k6.X0);
                if (f10 != 1.0f) {
                    canvas.save();
                    canvas.scale(f11, f11, org.telegram.ui.ActionBar.k6.X0.getBounds().centerX(), org.telegram.ui.ActionBar.k6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.k6.X0.setAlpha((int) (f10 * 255.0f));
                }
                org.telegram.ui.ActionBar.k6.X0.draw(canvas);
                if (f10 != 1.0f) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.k6.X0.setAlpha(255);
                }
                invalidate();
                return;
            }
            if (z11) {
                if (!z10) {
                    a0.o(this.R2, this.T2, org.telegram.ui.ActionBar.k6.T0);
                    if (f10 != 1.0f) {
                        canvas.save();
                        canvas.scale(f11, f11, org.telegram.ui.ActionBar.k6.T0.getBounds().centerX(), org.telegram.ui.ActionBar.k6.W0.getBounds().centerY());
                        org.telegram.ui.ActionBar.k6.T0.setAlpha((int) (f10 * 255.0f));
                    }
                    org.telegram.ui.ActionBar.k6.T0.draw(canvas);
                    if (f10 != 1.0f) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.k6.T0.setAlpha(255);
                        return;
                    }
                    return;
                }
                a0.o(this.U2, this.T2, org.telegram.ui.ActionBar.k6.W0);
                if (z12) {
                    canvas.save();
                    canvas.scale(f11, f11, org.telegram.ui.ActionBar.k6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.k6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.k6.W0.setAlpha((int) (f10 * 255.0f));
                }
                if (!z12 && f10 != 0.0f) {
                    canvas.save();
                    canvas.scale(f11, f11, org.telegram.ui.ActionBar.k6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.k6.W0.getBounds().centerY());
                    int i10 = (int) (255.0f * f10);
                    org.telegram.ui.ActionBar.k6.W0.setAlpha(i10);
                    org.telegram.ui.ActionBar.k6.V0.setAlpha(i10);
                }
                org.telegram.ui.ActionBar.k6.W0.draw(canvas);
                if (z12) {
                    canvas.restore();
                    canvas.save();
                    canvas.translate((1.0f - f10) * AndroidUtilities.dp(4.0f), 0.0f);
                }
                a0.o(this.Q2, this.T2, org.telegram.ui.ActionBar.k6.V0);
                org.telegram.ui.ActionBar.k6.V0.draw(canvas);
                if (z12) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.k6.W0.setAlpha(255);
                }
                if (z12 || f10 == 0.0f) {
                    return;
                }
                canvas.restore();
                org.telegram.ui.ActionBar.k6.W0.setAlpha(255);
                org.telegram.ui.ActionBar.k6.V0.setAlpha(255);
            }
        }
    }

    public final void D(Canvas canvas, boolean z4, int i10, int i11, int i12, float f10, boolean z10) {
        float f11;
        Paint paint;
        boolean z11;
        RectF rectF;
        RectF rectF2;
        boolean z12 = Q() || P();
        if (!(this.D3 && this.E3) && this.O3 == 1.0f) {
            return;
        }
        float f12 = (this.P0 != 0 || this.Q0) ? this.O3 : 1.0f - this.O3;
        int i13 = 255;
        if (z10) {
            if (this.Q == null) {
                Paint paint2 = new Paint();
                this.Q = paint2;
                paint2.setStyle(Paint.Style.STROKE);
                this.Q.setStrokeWidth(AndroidUtilities.dp(2.0f));
                this.Q.setStrokeJoin(Paint.Join.ROUND);
                this.Q.setStrokeCap(Paint.Cap.ROUND);
            }
            f11 = 1.0f;
            this.Q.setColor(i0.a.d(Color.alpha(r14) / 255.0f, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false), i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.s9, false), 255)));
        } else {
            f11 = 1.0f;
        }
        if (this.M && this.K.read_inbox_max_id == 0) {
            if (this.P == null) {
                this.P = new Paint();
            }
            paint = this.P;
            int v02 = org.telegram.ui.ActionBar.k6.v0(z4 ? org.telegram.ui.ActionBar.k6.ek : org.telegram.ui.ActionBar.k6.dk, this.C4);
            paint.setColor(v02);
            org.telegram.ui.ActionBar.k6.M0.setColor(v02);
            i13 = z4 ? 30 : 40;
            z11 = true;
        } else {
            paint = (z4 || this.G0 != 0) ? org.telegram.ui.ActionBar.k6.y0 : org.telegram.ui.ActionBar.k6.w0;
            z11 = false;
        }
        StaticLayout staticLayout = this.R3;
        RectF rectF3 = this.k4;
        if (staticLayout == null || this.P0 == 0) {
            if (this.P0 != 0) {
                staticLayout = this.Q3;
            }
            paint.setAlpha((int) ((f11 - this.u3) * i13));
            org.telegram.ui.ActionBar.k6.M0.setAlpha((int) ((f11 - this.u3) * 255.0f));
            float f13 = i10;
            rectF3.set(i11, f13, AndroidUtilities.dp(12.666f) + this.H3 + i11, AndroidUtilities.dp(20.666f) + i10);
            int save = canvas.save();
            if (f10 != f11) {
                canvas.scale(f10, f10, rectF3.centerX(), rectF3.centerY());
            }
            if (f12 != f11) {
                canvas.scale(f12, f12, rectF3.centerX(), rectF3.centerY());
            }
            if (z12) {
                if (this.m4 == null || (rectF = this.n4) == null || !rectF.equals(rectF3)) {
                    RectF rectF4 = this.n4;
                    if (rectF4 == null) {
                        this.n4 = new RectF(rectF3);
                    } else {
                        rectF4.set(rectF3);
                    }
                    if (this.m4 == null) {
                        this.m4 = new Path();
                    }
                    k7.a6.a(this.m4, this.n4, AndroidUtilities.dp(10.33f));
                }
                canvas.drawPath(this.m4, paint);
                if (z10) {
                    canvas.drawPath(this.m4, this.Q);
                }
            } else {
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), paint);
                if (z10) {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), this.Q);
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
            paint.setAlpha((int) ((f11 - this.u3) * i13));
            org.telegram.ui.ActionBar.k6.M0.setAlpha((int) ((f11 - this.u3) * 255.0f));
            float f14 = f12 * 2.0f;
            float f15 = f14 > f11 ? 1.0f : f14;
            float f16 = f11 - f15;
            float f17 = (i12 * f16) + (i11 * f15);
            float f18 = i10;
            rectF3.set(f17, f18, (this.I3 * f16) + (this.H3 * f15) + f17 + AndroidUtilities.dp(12.666f), AndroidUtilities.dp(20.666f) + i10);
            float interpolation = ((f12 <= 0.5f ? pr.g.getInterpolation(f14) : pr.i.getInterpolation(f11 - ((f12 - 0.5f) * 2.0f))) * 0.1f) + f11;
            canvas.save();
            float f19 = interpolation * f10;
            canvas.scale(f19, f19, rectF3.centerX(), rectF3.centerY());
            if (z12) {
                if (this.m4 == null || (rectF2 = this.n4) == null || !rectF2.equals(rectF3)) {
                    RectF rectF5 = this.n4;
                    if (rectF5 == null) {
                        this.n4 = new RectF(rectF3);
                    } else {
                        rectF5.set(rectF3);
                    }
                    if (this.m4 == null) {
                        this.m4 = new Path();
                    }
                    k7.a6.a(this.m4, this.n4, AndroidUtilities.dp(10.33f));
                }
                canvas.drawPath(this.m4, paint);
                if (z10) {
                    canvas.drawPath(this.m4, this.Q);
                }
            } else {
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), paint);
                if (z10) {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), this.Q);
                }
            }
            if (this.S3 != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f17, AndroidUtilities.dpf2(3.0f) + f18);
                this.S3.draw(canvas);
                canvas.restore();
            }
            int alpha = org.telegram.ui.ActionBar.k6.M0.getAlpha();
            float f20 = alpha;
            org.telegram.ui.ActionBar.k6.M0.setAlpha((int) (f20 * f15));
            if (this.T3 != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f17, AndroidUtilities.dpf2(3.0f) + ((this.K3 ? AndroidUtilities.dp(17.0f) : -AndroidUtilities.dp(17.0f)) * f16) + f18);
                this.T3.draw(canvas);
                canvas.restore();
            } else if (this.Q3 != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f17, AndroidUtilities.dpf2(3.0f) + ((this.K3 ? AndroidUtilities.dp(17.0f) : -AndroidUtilities.dp(17.0f)) * f16) + f18);
                this.Q3.draw(canvas);
                canvas.restore();
            }
            if (this.R3 != null) {
                org.telegram.ui.ActionBar.k6.M0.setAlpha((int) (f20 * f16));
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f17, AndroidUtilities.dpf2(3.0f) + ((this.K3 ? -AndroidUtilities.dp(17.0f) : AndroidUtilities.dp(17.0f)) * f15) + f18);
                this.R3.draw(canvas);
                canvas.restore();
            }
            org.telegram.ui.ActionBar.k6.M0.setAlpha(alpha);
            canvas.restore();
        }
        if (z11) {
            org.telegram.ui.ActionBar.k6.M0.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.W8, false));
        }
    }

    public boolean E() {
        return false;
    }

    public final CharSequence F() {
        TLRPC.User user;
        String string;
        int i10 = this.C0;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList<TLRPC.Dialog> dialogs = messagesController.getDialogs(this.G0);
        this.J0 = dialogs.size();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = dialogs.size();
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.Dialog dialog = dialogs.get(i11);
            if (!messagesController.isHiddenByUndo(dialog.id)) {
                TLRPC.Chat chat = null;
                if (DialogObject.isEncryptedDialog(dialog.id)) {
                    TLRPC.EncryptedChat n10 = org.telegram.messenger.y3.n(messagesController, dialog.id);
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
                    spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Y8, this.C4)), length, length2, 33);
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
        return Emoji.replaceEmoji(spannableStringBuilder, org.telegram.ui.ActionBar.k6.F0[this.B0].getFontMetricsInt(), false);
    }

    public final CharSequence G() {
        TLRPC.User user;
        String string;
        MessagesController messagesController = MessagesController.getInstance(this.C0);
        ArrayList<TLRPC.Dialog> dialogsByCommunity = messagesController.getDialogsByCommunity(-this.E0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = dialogsByCommunity.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.Dialog dialog = dialogsByCommunity.get(i10);
            if (!messagesController.isHiddenByUndo(dialog.id)) {
                TLRPC.Chat chat = null;
                if (DialogObject.isEncryptedDialog(dialog.id)) {
                    TLRPC.EncryptedChat n10 = org.telegram.messenger.y3.n(messagesController, dialog.id);
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
                    spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Y8, this.C4)), length, length2, 33);
                }
                if (spannableStringBuilder.length() > 150) {
                    break;
                }
            }
        }
        return Emoji.replaceEmoji(spannableStringBuilder, org.telegram.ui.ActionBar.k6.F0[this.B0].getFontMetricsInt(), false);
    }

    public final CharSequence I() {
        if (this.G4 == null) {
            this.G4 = new q2(this);
        }
        q2.a(this.G4, this.C0, this.c1, this.d2);
        this.G4.getClass();
        q2 q2Var = this.G4;
        this.F4 = q2Var.c;
        this.c0 = q2Var.d;
        return q2Var.g;
    }

    public final ColorFilter J(int i10, int i11) {
        if (this.Q4 == null) {
            this.R4 = new int[4];
            this.Q4 = new ColorFilter[4];
        }
        if (i11 != this.R4[i10] || this.Q4[i10] == null) {
            ColorFilter[] colorFilterArr = this.Q4;
            this.R4[i10] = i11;
            colorFilterArr[i10] = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
        }
        return this.Q4[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.view.View, org.telegram.ui.Cells.r2] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.CharSequence] */
    public final SpannableStringBuilder K(int i10, CharSequence charSequence, String str, boolean z4) {
        CharSequence replaceNewLines;
        TLRPC.Message message;
        CharSequence charSequence2;
        String formatPluralString;
        CharSequence charSequence3;
        SpannableStringBuilder valueOf;
        MessageObject captionMessage = getCaptionMessage();
        MessageObject messageObject = this.c1;
        CharSequence charSequence4 = messageObject != null ? messageObject.messageText : null;
        this.b0 = true;
        if (!TextUtils.isEmpty(str)) {
            return H(str, charSequence, i10);
        }
        MessageObject messageObject2 = this.c1;
        TLRPC.Message message2 = messageObject2.messageOwner;
        if (message2 instanceof TLRPC.TL_messageService) {
            CharSequence charSequence5 = messageObject2.messageTextShort;
            if (charSequence5 == null || ((message2.action instanceof TLRPC.TL_messageActionTopicCreate) && this.M)) {
                charSequence5 = messageObject2.messageText;
            }
            if (MessageObject.isTopicActionMessage(messageObject2)) {
                valueOf = H(charSequence5, charSequence, i10);
                if (this.c1.topicIconDrawable[0] instanceof bg.b) {
                    int i11 = this.C0;
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i11).getTopicsController().findTopic(-this.c1.getDialogId(), MessageObject.getTopicId(i11, this.c1.messageOwner, true));
                    if (findTopic != null) {
                        ((bg.b) this.c1.topicIconDrawable[0]).b(findTopic.icon_color);
                    }
                }
            } else {
                this.b0 = false;
                valueOf = SpannableStringBuilder.valueOf(charSequence5);
            }
            if (z4) {
                s(valueOf);
            }
            return valueOf;
        }
        if (captionMessage != null && (charSequence3 = captionMessage.caption) != null) {
            String charSequence6 = charSequence3.toString();
            String str2 = !this.S ? "" : captionMessage.isVideo() ? "📹 " : captionMessage.isVoice() ? "🎤 " : captionMessage.isMusic() ? "🎧 " : captionMessage.isPhoto() ? "🖼 " : "📎 ";
            if (captionMessage.hasHighlightedWords() && !TextUtils.isEmpty(captionMessage.messageOwner.message)) {
                CharSequence charSequence7 = captionMessage.messageTrimmedToHighlight;
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.F + 47);
                if (this.T) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth = (int) (measuredWidth - this.U.measureText(charSequence.toString()));
                    }
                    measuredWidth = (int) (measuredWidth - this.U.measureText(": "));
                }
                if (measuredWidth > 0 && captionMessage.messageTrimmedToHighlightCut) {
                    charSequence7 = AndroidUtilities.ellipsizeCenterEnd(charSequence7, captionMessage.highlightedWords.get(0), measuredWidth, this.U, 130);
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
                TextPaint textPaint = this.U;
                MediaDataController.addAnimatedEmojiSpans(arrayList, spannableString, textPaint != null ? textPaint.getFontMetricsInt() : null);
            }
            CharSequence append = new SpannableStringBuilder(str2).append(AndroidUtilities.replaceNewLines(spannableString));
            if (z4) {
                append = s(append);
            }
            return H(append, charSequence, i10);
        }
        TL_iv.RichMessage richMessage = message2.rich_message;
        org.telegram.ui.ActionBar.g6 g6Var = this.C4;
        if (richMessage != null) {
            boolean isBlueBlock = richMessage.blocks.size() == 1 ? MessageObject.isBlueBlock(this.c1.messageOwner.rich_message.blocks.get(0)) : false;
            SpannableStringBuilder H = H(this.c1.messageText, charSequence, i10);
            if (isBlueBlock && !Q()) {
                try {
                    H.setSpan(new f10(org.telegram.ui.ActionBar.k6.p9, g6Var), this.T ? charSequence.length() + 2 : 0, H.length(), 33);
                    return H;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
            return H;
        }
        if (message2.media == null || messageObject2.isMediaEmpty()) {
            MessageObject messageObject3 = this.c1;
            String str3 = messageObject3.messageOwner.message;
            if (str3 == null) {
                return new SpannableStringBuilder();
            }
            if (messageObject3.hasHighlightedWords()) {
                CharSequence charSequence9 = this.c1.messageTrimmedToHighlight;
                replaceNewLines = str3;
                if (charSequence9 != null) {
                    replaceNewLines = charSequence9;
                }
                int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(this.F + 33);
                if (this.T) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth2 = (int) (measuredWidth2 - this.U.measureText(charSequence.toString()));
                    }
                    measuredWidth2 = (int) (measuredWidth2 - this.U.measureText(": "));
                }
                if (measuredWidth2 > 0) {
                    replaceNewLines = AndroidUtilities.ellipsizeCenterEnd(replaceNewLines, this.c1.highlightedWords.get(0), measuredWidth2, this.U, 130);
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
            MessageObject messageObject4 = this.c1;
            if (messageObject4 != null) {
                messageObject4.spoilLoginCode();
            }
            MediaDataController.addTextStyleRuns(this.c1, (Spannable) spannableString2, 264);
            MessageObject messageObject5 = this.c1;
            if (messageObject5 != null && (message = messageObject5.messageOwner) != null) {
                ArrayList<TLRPC.MessageEntity> arrayList2 = message.entities;
                TextPaint textPaint2 = this.U;
                MediaDataController.addAnimatedEmojiSpans(arrayList2, spannableString2, textPaint2 != null ? textPaint2.getFontMetricsInt() : null);
            }
            if (z4) {
                spannableString2 = s(spannableString2);
            }
            return H(spannableString2, charSequence, i10);
        }
        this.U = org.telegram.ui.ActionBar.k6.H0[this.B0];
        int i12 = org.telegram.ui.ActionBar.k6.o9;
        MessageObject messageObject6 = this.c1;
        TLRPC.MessageMedia messageMedia = messageObject6.messageOwner.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
            TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
            if (tL_textWithEntities == null || tL_textWithEntities.entities == null) {
                charSequence2 = ah.a.a(R.drawable.dialog_media_poll_20, tL_textWithEntities.text, true);
            } else {
                SpannableString spannableString3 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString3);
                MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString3, org.telegram.ui.ActionBar.k6.F0[this.B0].getFontMetricsInt());
                charSequence2 = ah.a.a(R.drawable.dialog_media_poll_20, spannableString3, true);
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
            if (tL_textWithEntities3 == null || tL_textWithEntities3.entities == null) {
                charSequence2 = ah.a.a(R.drawable.dialog_media_checklist_20, tL_textWithEntities3.text, true);
            } else {
                SpannableString spannableString4 = new SpannableString(tL_messageMediaToDo.todo.title.text.replace('\n', ' '));
                TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                MediaDataController.addTextStyleRuns(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString4);
                MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString4, org.telegram.ui.ActionBar.k6.F0[this.B0].getFontMetricsInt());
                charSequence2 = ah.a.a(R.drawable.dialog_media_checklist_20, spannableString4, true);
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
            charSequence2 = ah.a.a(R.drawable.dialog_media_game_20, messageMedia.game.title, true);
        } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
            charSequence2 = messageMedia.title;
        } else if (messageObject6.type == 14) {
            charSequence2 = yh.l("🎧 \u2068", messageObject6.getMusicAuthor(), " - ", this.c1.getMusicTitle(), "\u2069");
        } else if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia).extended_media.size();
            charSequence2 = mh.ja.Q0(LocaleController.formatString(R.string.AttachPaidMedia, this.P1 ? size > 1 ? LocaleController.formatPluralString("Media", size, new Object[0]) : LocaleController.getString(R.string.AttachVideo) : size > 1 ? LocaleController.formatPluralString("Photos", size, new Object[0]) : LocaleController.getString(R.string.AttachPhoto)));
            i12 = org.telegram.ui.ActionBar.k6.p9;
        } else if (this.O1 > 1) {
            if (this.P1) {
                ArrayList arrayList3 = this.d1;
                formatPluralString = LocaleController.formatPluralString("Media", arrayList3 == null ? 0 : arrayList3.size(), new Object[0]);
            } else {
                ArrayList arrayList4 = this.d1;
                formatPluralString = LocaleController.formatPluralString("Photos", arrayList4 == null ? 0 : arrayList4.size(), new Object[0]);
            }
            charSequence2 = formatPluralString;
            i12 = org.telegram.ui.ActionBar.k6.p9;
        } else {
            charSequence2 = charSequence4.toString();
            i12 = org.telegram.ui.ActionBar.k6.p9;
        }
        if (charSequence2 instanceof String) {
            charSequence2 = ((String) charSequence2).replace('\n', ' ');
        }
        if (z4) {
            charSequence2 = s(charSequence2);
        }
        SpannableStringBuilder H2 = H(charSequence2, charSequence, i10);
        if (!Q()) {
            try {
                H2.setSpan(new f10(i12, g6Var), this.T ? charSequence.length() + 2 : 0, H2.length(), 33);
                return H2;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return H2;
    }

    public final boolean M() {
        is isVar = this.q0;
        return (isVar == null || isVar.c.isEmpty()) ? false : true;
    }

    public final boolean N() {
        if (ChatObject.isCommunity(this.d2)) {
            return !this.b1;
        }
        if (this.M) {
            return this.X0;
        }
        TLRPC.Chat chat = this.d2;
        return (chat != null && chat.forum && this.K == null) ? !this.a1 : this.W0;
    }

    public final boolean O() {
        return this.G0 > 0;
    }

    public final boolean P() {
        return this.G0 != 0;
    }

    public boolean Q() {
        TLRPC.Chat chat;
        if (O() || this.M0 || (chat = this.d2) == null) {
            return false;
        }
        return (chat.forum || (ChatObject.isMonoForum(chat) && ChatObject.canManageMonoForum(this.C0, this.d2))) && !this.M;
    }

    public final boolean R() {
        TLRPC.User user;
        if (Q() || this.r0.w || (user = this.c2) == null || user.self) {
            return false;
        }
        TLRPC.UserStatus userStatus = user.status;
        int i10 = this.C0;
        if (userStatus != null && userStatus.expires <= 0 && MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(this.c2.id))) {
            return true;
        }
        TLRPC.UserStatus userStatus2 = this.c2.status;
        return userStatus2 != null && userStatus2.expires > ConnectionsManager.getInstance(i10).getCurrentTime();
    }

    public final boolean S(float f10) {
        return !LocaleController.isRTL ? f10 >= 0.0f && f10 < ((float) AndroidUtilities.dp(60.0f)) : f10 >= ((float) (getMeasuredWidth() - AndroidUtilities.dp(60.0f))) && f10 < ((float) getMeasuredWidth());
    }

    public final void T(boolean z4, boolean z10) {
        if ((!getIsPinned() && z4) || this.v3 == z4) {
            if (getIsPinned()) {
                return;
            }
            this.v3 = false;
        } else {
            this.v3 = z4;
            if (z10) {
                this.u3 = z4 ? 0.0f : 1.0f;
            } else {
                this.u3 = z4 ? 1.0f : 0.0f;
            }
            invalidate();
        }
    }

    public final void U() {
        boolean z4 = SharedConfig.archiveHidden;
        this.j1 = z4;
        float f10 = z4 ? 0.0f : 1.0f;
        this.A1 = f10;
        this.X1.o = f10;
        this.q1 = 0.0f;
        this.u1 = false;
        this.u3 = (getIsPinned() && this.v3) ? 1.0f : 0.0f;
        this.t3 = true;
        this.l1 = 0.0f;
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        org.telegram.ui.Components.j5 j5Var = this.g4;
        if (j5Var != null && this.t3) {
            j5Var.a();
        }
        org.telegram.ui.Components.j5 j5Var2 = this.h4;
        if (j5Var2 == null || !this.t3) {
            return;
        }
        j5Var2.a();
    }

    public final void V(boolean z4, boolean z10) {
        k2 k2Var = this.n2;
        if (k2Var != null || z4) {
            if (k2Var == null) {
                k2 k2Var2 = new k2(this, getContext(), this.C4, 0);
                this.n2 = k2Var2;
                k2Var2.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
                this.n2.setDrawUnchecked(false);
                this.n2.setDrawBackgroundAsArc(3);
                addView(this.n2);
            }
            this.n2.a(z4, z10);
            x();
        }
    }

    public final void W(long j10, MessageObject messageObject, int i10, boolean z4, boolean z10) {
        if (this.E0 != j10) {
            this.q4 = -1;
        }
        this.E0 = j10;
        this.u4 = System.currentTimeMillis();
        this.c1 = messageObject;
        this.r2 = z4;
        this.K0 = false;
        this.O0 = i10;
        if (messageObject != null) {
            int i11 = messageObject.messageOwner.edit_date;
        }
        this.P0 = 0;
        this.Q0 = false;
        this.i1 = messageObject != null ? messageObject.getId() : 0;
        this.R0 = 0;
        this.S0 = 0;
        this.T0 = 0;
        this.U0 = messageObject != null && messageObject.isUnread();
        MessageObject messageObject2 = this.c1;
        if (messageObject2 != null) {
            this.V0 = messageObject2.messageOwner.send_state;
        }
        b0(0, z10);
    }

    public final void X(TLRPC.Dialog dialog, int i10, int i11) {
        if (this.E0 != dialog.id) {
            ValueAnimator valueAnimator = this.t4;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.t4.cancel();
            }
            this.s4 = false;
            this.q4 = -1;
        }
        this.E0 = dialog.id;
        this.u4 = System.currentTimeMillis();
        this.K0 = true;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            this.H0 = dialog.community_id;
        } else {
            this.H0 = 0L;
        }
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            this.G0 = ((TLRPC.TL_dialogFolder) dialog).folder.id;
            ri0 ri0Var = this.b2;
            if (ri0Var != null) {
                ri0Var.H = this;
                ri0Var.i();
            }
        } else {
            this.G0 = 0;
        }
        this.g1 = i10;
        boolean z4 = i10 == 3;
        Runnable runnable = this.S4;
        if (z4 != (runnable != null)) {
            if (!z4 && runnable != null) {
                runnable.run();
                this.S4 = null;
            } else if (z4) {
                this.S4 = NotificationCenter.getInstance(this.C0).listen(this, NotificationCenter.userIsPremiumBlockedUpadted, new i2(this, 0));
            }
        }
        if (this.q0 == null) {
            this.q0 = new is(this);
        }
        this.h1 = i11;
        this.i1 = 0;
        if (b0(0, false)) {
            requestLayout();
        }
        w();
        v();
        u();
        x();
    }

    public final void Y(TLRPC.TL_forumTopic tL_forumTopic, long j10, MessageObject messageObject, boolean z4, boolean z10) {
        ri0 ri0Var;
        this.K = tL_forumTopic;
        this.M = tL_forumTopic != null;
        if (this.E0 != j10) {
            this.q4 = -1;
        }
        Drawable drawable = messageObject.topicIconDrawable[0];
        if (drawable instanceof bg.b) {
            ((bg.b) drawable).b(tL_forumTopic.icon_color);
        }
        this.E0 = j10;
        this.u4 = System.currentTimeMillis();
        this.c1 = messageObject;
        this.K0 = false;
        this.d0 = z4;
        this.O0 = messageObject.messageOwner.date;
        this.Q0 = false;
        this.i1 = messageObject.getId();
        this.U0 = messageObject.isUnread();
        MessageObject messageObject2 = this.c1;
        if (messageObject2 != null) {
            this.V0 = messageObject2.messageOwner.send_state;
        }
        if (!z10) {
            this.q4 = -1;
        }
        if (tL_forumTopic != null) {
            this.d1 = tL_forumTopic.groupedMessages;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.K;
        if (tL_forumTopic2 != null && tL_forumTopic2.id == 1 && (ri0Var = this.b2) != null) {
            ri0Var.H = this;
            ri0Var.i();
        }
        b0(0, z10);
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
        if (photoSize == null || !DownloadController.getInstance(this.C0).canDownloadMedia(messageObject)) {
            photoSize = strippedPhotoSize;
        }
        if (strippedPhotoSize != null) {
            this.P1 = this.P1 || messageObject.isVideo() || messageObject.isRoundVideo();
            int i11 = this.O1;
            if (i11 < 3) {
                this.O1 = i11 + 1;
                this.T1[i10] = (messageObject.isVideo() || messageObject.isRoundVideo()) && !messageObject.hasMediaSpoilers();
                this.U1[i10] = messageObject.hasMediaSpoilers();
                int i12 = (messageObject.type != 1 || photoSize == null) ? 0 : photoSize.size;
                String str = messageObject.hasMediaSpoilers() ? "5_5_b" : "20_20";
                ImageReceiver[] imageReceiverArr = this.S1;
                String str2 = str;
                imageReceiverArr[i10].setImage(ImageLocation.getForObject(photoSize, tLObject), str2, ImageLocation.getForObject(strippedPhotoSize, tLObject), str2, i12, null, messageObject, 0);
                imageReceiverArr[i10].setRoundRadius(AndroidUtilities.dp(messageObject.isRoundVideo() ? 18.0f : 2.0f));
                this.S = false;
            }
        }
    }

    public final void a0() {
        ri0 ri0Var = this.b2;
        if (ri0Var != null) {
            if (this.M) {
                ri0Var.K = AndroidUtilities.dp(24.0f);
                this.b2.L = AndroidUtilities.dp(24.0f);
                this.b2.M = 0.0f;
            } else {
                j2 j2Var = this.r0;
                RectF rectF = j2Var.F;
                RectF rectF2 = j2Var.F;
                ri0Var.K = rectF.centerY();
                this.b2.L = rectF2.centerX();
                this.b2.M = rectF2.width() / 2.0f;
                if (!MessagesController.getInstance(this.C0).getStoriesController().h.isEmpty()) {
                    this.b2.M -= AndroidUtilities.dpf2(3.5f);
                }
                ri0 ri0Var2 = this.b2;
                this.V1.getBitmapWidth();
                ri0Var2.getClass();
            }
            ri0 ri0Var3 = this.b2;
            if (ri0Var3.E || ri0Var3.I == null) {
                return;
            }
            AnimatorSet animatorSet = ri0Var3.B;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                ri0Var3.B.cancel();
            }
            ri0Var3.E = true;
            ri0Var3.F = true;
            ri0Var3.D = 0.0f;
            ri0Var3.I.getTranslationY();
            AndroidUtilities.dp(100.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new pi0(ri0Var3, 5));
            ofFloat.setInterpolator(pr.h);
            ofFloat.setDuration(250L);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new pi0(ri0Var3, 6));
            pr prVar = pr.j;
            ofFloat2.setInterpolator(prVar);
            ofFloat2.setDuration(150L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat3.addUpdateListener(new pi0(ri0Var3, 7));
            ofFloat3.setInterpolator(prVar);
            ofFloat3.setDuration(135L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            ri0Var3.B = animatorSet2;
            animatorSet2.addListener(new pd0(ri0Var3, 4));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3);
            animatorSet3.setStartDelay(180L);
            ri0Var3.B.playTogether(ofFloat, animatorSet3);
            ri0Var3.B.start();
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
    public final boolean b0(int i10, boolean z4) {
        int i11;
        long j10;
        char c3;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i13;
        long j11;
        ImageReceiver imageReceiver;
        boolean z17;
        boolean z18;
        int i14;
        MessageObject messageObject;
        boolean z19;
        boolean z20;
        int i15;
        boolean z21;
        int dp;
        TLRPC.User user;
        TLRPC.Chat chat;
        boolean z22;
        TLRPC.Chat chat2;
        ArrayList R3;
        MessageObject messageObject2;
        boolean z23;
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
        boolean z24;
        boolean z25;
        boolean z26;
        int i21;
        MessagesController.DialogFilter dialogFilter;
        hs hsVar;
        MessagesController.DialogFilter dialogFilter2;
        String str;
        boolean Q = Q();
        boolean z27 = false;
        this.i0 = 0;
        m2 m2Var = this.D0;
        ImageReceiver imageReceiver2 = this.V1;
        org.telegram.ui.Components.z8 z8Var = this.X1;
        int i22 = this.C0;
        if (m2Var != null) {
            this.O0 = m2Var.h;
            int i23 = m2Var.d;
            this.U0 = i23 != 0;
            this.P0 = i23;
            this.x3 = m2Var.e;
            this.W0 = m2Var.f;
            this.a1 = false;
            this.b1 = false;
            z8Var.n(m2Var.c, m2Var.a, null);
            if (this.C) {
                imageReceiver2.setImage(null, "50_50", this.D, null, 0L);
            } else {
                imageReceiver2.setImage(null, "50_50", z8Var, null, 0L);
            }
            int i24 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.S1;
                if (i24 >= imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i24].setImageBitmap((Drawable) null);
                i24++;
            }
            this.y = false;
            this.B = false;
            imageReceiver2.setRoundRadius(AndroidUtilities.dp(26.0f));
            this.Y0 = false;
            z10 = Q;
            i15 = i22;
            z19 = false;
            z20 = false;
        } else {
            int i25 = this.P0;
            boolean z28 = this.S0 != 0;
            boolean z29 = this.Q0;
            this.a1 = false;
            this.b1 = false;
            this.A4 = -1;
            if (this.K0) {
                j10 = 0;
                TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i22).dialogs_dict.f(this.E0);
                if (dialog != null) {
                    this.A4 = dialog.read_outbox_max_id;
                    this.i0 = dialog.ttl_period;
                    if (i10 == 0) {
                        c3 = 1;
                        this.e1 = MessagesController.getInstance(i22).isClearingDialog(dialog.id);
                        ArrayList arrayList = (ArrayList) MessagesController.getInstance(i22).dialogMessage.f(dialog.id);
                        this.d1 = arrayList;
                        MessageObject messageObject5 = (arrayList == null || arrayList.size() <= 0) ? null : (MessageObject) this.d1.get(0);
                        this.c1 = messageObject5;
                        this.U0 = messageObject5 != null && messageObject5.isUnread();
                        TLRPC.Chat chat4 = MessagesController.getInstance(i22).getChat(Long.valueOf(-dialog.id));
                        if (chat4 == null || !(chat4.forum || (chat4.monoforum && ChatObject.canManageMonoForum(i22, chat4)))) {
                            i11 = i25;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                this.P0 = MessagesStorage.getInstance(i22).getArchiveUnreadCount();
                                this.R0 = 0;
                                this.S0 = 0;
                                this.T0 = 0;
                            } else if (dialog instanceof TLRPC.TL_dialogCommunity) {
                                MessagesController.UnreadCounts communityUnreadCount = MessagesController.getInstance(i22).getCommunityUnreadCount(-dialog.id);
                                this.P0 = communityUnreadCount.unreadCount;
                                this.R0 = communityUnreadCount.mentionCount;
                                this.S0 = communityUnreadCount.reactionMentionCount;
                                this.T0 = communityUnreadCount.pollVotesMentionCount;
                                this.b1 = communityUnreadCount.hasUnmutedUnreadDialogs;
                            } else {
                                this.P0 = dialog.unread_count;
                                this.R0 = dialog.unread_mentions_count;
                                this.S0 = dialog.unread_reactions_count;
                                this.T0 = dialog.unread_poll_votes_count;
                            }
                        } else {
                            i11 = i25;
                            int[] forumUnreadCount = MessagesController.getInstance(i22).getTopicsController().getForumUnreadCount(chat4.id);
                            this.P0 = forumUnreadCount[0];
                            this.R0 = forumUnreadCount[1];
                            this.S0 = forumUnreadCount[2];
                            this.a1 = forumUnreadCount[3] != 0;
                            this.T0 = forumUnreadCount[4];
                        }
                        if (ChatObject.isMonoForum(chat4)) {
                            this.R0 = 0;
                        }
                        this.Q0 = dialog.unread_mark;
                        MessageObject messageObject6 = this.c1;
                        if (messageObject6 != null) {
                            int i26 = messageObject6.messageOwner.edit_date;
                        }
                        this.O0 = dialog.last_message_date;
                        int i27 = this.g1;
                        if (i27 == 7 || i27 == 8) {
                            MessagesController.DialogFilter dialogFilter3 = MessagesController.getInstance(i22).selectedDialogFilter[this.g1 == 8 ? (char) 1 : (char) 0];
                            this.x3 = dialogFilter3 != null && dialogFilter3.pinnedDialogs.indexOfKey(dialog.id) >= 0;
                        } else {
                            this.x3 = this.G0 == 0 && dialog.pinned;
                        }
                        MessageObject messageObject7 = this.c1;
                        if (messageObject7 != null) {
                            this.V0 = messageObject7.messageOwner.send_state;
                        }
                    } else {
                        i11 = i25;
                        c3 = 1;
                    }
                } else {
                    i11 = i25;
                    c3 = 1;
                    this.P0 = 0;
                    this.R0 = 0;
                    this.S0 = 0;
                    this.T0 = 0;
                    this.O0 = 0;
                    this.e1 = false;
                }
                if (this.E0 != 0) {
                    int i28 = a41.O;
                }
            } else {
                i11 = i25;
                j10 = 0;
                c3 = 1;
                this.x3 = false;
            }
            TLRPC.TL_forumTopic tL_forumTopic = this.K;
            if (tL_forumTopic != null) {
                this.P0 = tL_forumTopic.unread_count;
                this.R0 = tL_forumTopic.unread_mentions_count;
                this.S0 = tL_forumTopic.unread_reactions_count;
                this.T0 = tL_forumTopic.unread_poll_votes_count;
            }
            if (this.g1 == 2) {
                this.x3 = false;
            }
            is isVar = this.q0;
            if (isVar != null) {
                boolean isEmpty = isVar.c.isEmpty();
                is isVar2 = this.q0;
                int i29 = this.g1;
                long j13 = this.E0;
                r2 r2Var = isVar2.a;
                ArrayList arrayList2 = isVar2.b;
                ArrayList arrayList3 = isVar2.c;
                AccountInstance accountInstance = AccountInstance.getInstance(i22);
                z11 = z28;
                MessagesController messagesController = MessagesController.getInstance(i22);
                z12 = z29;
                if (messagesController.folderTags && accountInstance.getUserConfig().isPremium()) {
                    ArrayList<MessagesController.DialogFilter> arrayList4 = messagesController.dialogFilters;
                    i12 = i11;
                    if (i29 == 7) {
                        dialogFilter = messagesController.selectedDialogFilter[0];
                        i21 = 8;
                    } else {
                        i21 = 8;
                        dialogFilter = i29 == 8 ? messagesController.selectedDialogFilter[c3] : null;
                    }
                    arrayList2.clear();
                    z10 = Q;
                    if (i29 == 0 || i29 == 7 || i29 == i21) {
                        for (int i30 = 0; i30 < arrayList4.size(); i30++) {
                            MessagesController.DialogFilter dialogFilter4 = arrayList4.get(i30);
                            if (dialogFilter4 != null && dialogFilter4 != dialogFilter && dialogFilter4.color >= 0 && dialogFilter4.includesDialog(accountInstance, j13)) {
                                arrayList2.add(dialogFilter4);
                            }
                        }
                    }
                    int i31 = 0;
                    z25 = false;
                    while (i31 < arrayList3.size()) {
                        hs hsVar2 = (hs) arrayList3.get(i31);
                        int i32 = 0;
                        while (true) {
                            if (i32 >= arrayList2.size()) {
                                dialogFilter2 = null;
                                break;
                            }
                            if (((MessagesController.DialogFilter) arrayList2.get(i32)).id == hsVar2.a) {
                                dialogFilter2 = (MessagesController.DialogFilter) arrayList2.get(i32);
                                break;
                            }
                            i32++;
                        }
                        if (dialogFilter2 == null) {
                            arrayList3.remove(i31);
                            i31--;
                        } else {
                            if (dialogFilter2.color != hsVar2.b || ((str = dialogFilter2.name) != null && hsVar2.c != null && str.length() != hsVar2.c.k().length())) {
                                arrayList3.set(i31, hs.b(r2Var, dialogFilter2));
                            }
                            i31++;
                        }
                        z25 = true;
                        i31++;
                    }
                    for (int i33 = 0; i33 < arrayList2.size(); i33++) {
                        MessagesController.DialogFilter dialogFilter5 = (MessagesController.DialogFilter) arrayList2.get(i33);
                        int i34 = 0;
                        while (true) {
                            if (i34 >= arrayList3.size()) {
                                hsVar = null;
                                break;
                            }
                            if (((hs) arrayList3.get(i34)).a == dialogFilter5.id) {
                                hsVar = (hs) arrayList3.get(i34);
                                break;
                            }
                            i34++;
                        }
                        if (hsVar == null) {
                            arrayList3.add(i33, hs.b(r2Var, dialogFilter5));
                            z25 = true;
                        }
                    }
                    arrayList2.clear();
                } else {
                    z10 = Q;
                    i12 = i11;
                    boolean isEmpty2 = arrayList3.isEmpty();
                    arrayList3.clear();
                    z25 = !isEmpty2;
                }
                if (z25) {
                    if (isEmpty != this.q0.c.isEmpty()) {
                        z13 = true;
                        z26 = true;
                    } else {
                        z13 = false;
                        z26 = false;
                    }
                    z14 = z26;
                    z15 = true;
                    if (i10 == 0) {
                        TLRPC.User user2 = this.c2;
                        if (user2 != null && !MessagesController.isSupportUser(user2) && !this.c2.bot && (i10 & MessagesController.UPDATE_MASK_STATUS) != 0) {
                            this.c2 = MessagesController.getInstance(i22).getUser(Long.valueOf(this.c2.id));
                            if (this.y0 != R()) {
                                z15 = true;
                            }
                        }
                        if ((i10 & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                            TLRPC.User user3 = this.c2;
                            org.telegram.ui.Components.j5 j5Var = this.g4;
                            if (user3 != null) {
                                TLRPC.User user4 = MessagesController.getInstance(i22).getUser(Long.valueOf(this.c2.id));
                                this.c2 = user4;
                                if (user4 == null || DialogObject.getEmojiStatusDocumentId(user4.emoji_status) == j10) {
                                    this.A2 = true;
                                    j5Var.g(fg.q1.d().e, z4);
                                    j5Var.m(false, z4);
                                } else {
                                    this.A2 = true;
                                    j5Var.j(DialogObject.getEmojiStatusDocumentId(this.c2.emoji_status), z4);
                                    j5Var.m(DialogObject.isEmojiStatusCollectible(this.c2.emoji_status), z4);
                                }
                                j12 = DialogObject.getBotVerificationIcon(this.c2);
                                z15 = true;
                            } else {
                                j12 = j10;
                            }
                            if (this.d2 != null) {
                                TLRPC.Chat chat5 = MessagesController.getInstance(i22).getChat(Long.valueOf(this.d2.id));
                                this.d2 = chat5;
                                if (chat5 == null || DialogObject.getEmojiStatusDocumentId(chat5.emoji_status) == j10) {
                                    this.A2 = true;
                                    j5Var.g(fg.q1.d().e, z4);
                                    j5Var.m(false, z4);
                                } else {
                                    this.A2 = true;
                                    j5Var.j(DialogObject.getEmojiStatusDocumentId(this.d2.emoji_status), z4);
                                    j5Var.m(DialogObject.isEmojiStatusCollectible(this.d2.emoji_status), z4);
                                }
                                j12 = DialogObject.getBotVerificationIcon(this.d2);
                                z15 = true;
                            }
                            org.telegram.ui.Components.j5 j5Var2 = this.h4;
                            if (j12 != j10) {
                                z24 = !this.d4;
                                j5Var2.j(j12, z4);
                            } else {
                                z24 = this.d4;
                                j5Var2.g(null, z4);
                            }
                            z16 = z15;
                            z23 = z24;
                        } else {
                            z16 = z15;
                            z23 = false;
                        }
                        if ((this.K0 || this.M) && (i10 & MessagesController.UPDATE_MASK_USER_PRINT) != 0) {
                            CharSequence printingString = MessagesController.getInstance(i22).getPrintingString(this.E0, getTopicId(), true);
                            CharSequence charSequence = this.f2;
                            if ((charSequence != null && printingString == null) || ((charSequence == null && printingString != null) || (charSequence != null && !charSequence.equals(printingString)))) {
                                z23 = true;
                            }
                        }
                        if (!z23 && (i10 & MessagesController.UPDATE_MASK_MESSAGE_TEXT) != 0 && (messageObject4 = this.c1) != null && messageObject4.messageText != this.f1) {
                            z23 = true;
                        }
                        if (!z23 && (i10 & MessagesController.UPDATE_MASK_CHAT) != 0 && this.d2 != null) {
                            TLRPC.Chat chat6 = MessagesController.getInstance(i22).getChat(Long.valueOf(this.d2.id));
                            if ((chat6 != null && chat6.call_active && chat6.call_not_empty) != this.s2) {
                                z23 = true;
                            }
                        }
                        if (!z23 && (i10 & MessagesController.UPDATE_MASK_AVATAR) != 0 && ((chat3 = this.d2) == null || (chat3.monoforum && ChatObject.canManageMonoForum(i22, chat3)))) {
                            q2 q2Var = this.G4;
                            if (q2Var != null && (hashMap = q2Var.f) != null && !hashMap.isEmpty()) {
                                for (Map.Entry entry : q2Var.f.entrySet()) {
                                    ((org.telegram.ui.i5) entry.getValue()).c(((Long) entry.getKey()).longValue());
                                }
                            }
                            z23 = true;
                        }
                        if (!z23 && (i10 & MessagesController.UPDATE_MASK_NAME) != 0 && this.d2 == null) {
                            z23 = true;
                        }
                        if (!z23 && (i10 & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 && this.c2 == null) {
                            z23 = true;
                        }
                        if (!z23 && (i10 & MessagesController.UPDATE_MASK_CHAT_NAME) != 0 && this.c2 == null) {
                            z23 = true;
                        }
                        if (!z23) {
                            MessageObject messageObject8 = this.c1;
                            if (messageObject8 != null && this.U0 != messageObject8.isUnread()) {
                                this.U0 = this.c1.isUnread();
                                z23 = true;
                            }
                            if (this.K0) {
                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) MessagesController.getInstance(i22).dialogs_dict.f(this.E0);
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
                                        this.b1 = communityUnreadCount2.hasUnmutedUnreadDialogs;
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
                                        if (dialog2 != null && (this.P0 != i16 || this.Q0 != dialog2.unread_mark || this.R0 != i19 || this.S0 != i18)) {
                                            this.P0 = i16;
                                            this.R0 = i19;
                                            this.Q0 = dialog2.unread_mark;
                                            this.S0 = i18;
                                            this.T0 = i17;
                                            z23 = true;
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
                                        this.P0 = i16;
                                        this.R0 = i19;
                                        this.Q0 = dialog2.unread_mark;
                                        this.S0 = i18;
                                        this.T0 = i17;
                                        z23 = true;
                                    }
                                } else {
                                    int[] forumUnreadCount2 = MessagesController.getInstance(i22).getTopicsController().getForumUnreadCount(chat7.id);
                                    i20 = forumUnreadCount2[0];
                                    i19 = forumUnreadCount2[1];
                                    i18 = forumUnreadCount2[2];
                                    this.a1 = forumUnreadCount2[3] != 0;
                                    i17 = forumUnreadCount2[4];
                                }
                                i16 = i20;
                                if (ChatObject.isMonoForum(chat7)) {
                                }
                                if (dialog2 != null) {
                                }
                            }
                        }
                        if (!z23 && (i10 & MessagesController.UPDATE_MASK_SEND_STATE) != 0 && (messageObject3 = this.c1) != null) {
                            int i37 = this.V0;
                            int i38 = messageObject3.messageOwner.send_state;
                            if (i37 != i38) {
                                this.V0 = i38;
                                z23 = true;
                            }
                        }
                        if (!z23) {
                            invalidate();
                            return z14;
                        }
                    } else {
                        z16 = z15;
                    }
                    this.c2 = null;
                    this.d2 = null;
                    this.e2 = null;
                    if (this.H0 != j10) {
                        this.c1 = MessagesController.getInstance(i22).findCommunityLastMessage(this.H0);
                    }
                    i13 = this.G0;
                    if (i13 == 0) {
                        this.W0 = false;
                        this.Y0 = false;
                        py pyVar = this.w4;
                        if (pyVar == null || (R3 = pyVar.R3(i22, this.g1, i13, false)) == null || R3.isEmpty()) {
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
                        this.c1 = messageObject2;
                        j11 = messageObject2 != null ? messageObject2.getDialogId() : j10;
                    } else {
                        this.Y0 = false;
                        if (this.K != null) {
                            boolean isDialogMuted = MessagesController.getInstance(i22).isDialogMuted(this.E0, j10);
                            boolean isDialogMuted2 = MessagesController.getInstance(i22).isDialogMuted(this.E0, this.K.id);
                            this.X0 = isDialogMuted2;
                            if (isDialogMuted == isDialogMuted2) {
                                this.W0 = false;
                                this.Y0 = false;
                            } else {
                                this.W0 = isDialogMuted2;
                                this.Y0 = !isDialogMuted2;
                            }
                        } else {
                            this.W0 = this.K0 && MessagesController.getInstance(i22).isDialogMuted(this.E0, (long) getTopicId());
                        }
                        j11 = this.E0;
                        j10 = 0;
                    }
                    if (j11 != j10) {
                        if (DialogObject.isEncryptedDialog(j11)) {
                            TLRPC.EncryptedChat n10 = org.telegram.messenger.y3.n(MessagesController.getInstance(i22), j11);
                            this.e2 = n10;
                            if (n10 != null) {
                                this.c2 = MessagesController.getInstance(i22).getUser(Long.valueOf(this.e2.user_id));
                            }
                        } else if (DialogObject.isUserDialog(j11)) {
                            this.c2 = MessagesController.getInstance(i22).getUser(Long.valueOf(j11));
                        } else {
                            TLRPC.Chat chat8 = MessagesController.getInstance(i22).getChat(Long.valueOf(-j11));
                            this.d2 = chat8;
                            if (!this.K0 && chat8 != null && chat8.migrated_to != null && (chat2 = MessagesController.getInstance(i22).getChat(Long.valueOf(this.d2.migrated_to.channel_id))) != null) {
                                this.d2 = chat2;
                            }
                        }
                        if (this.r2 && this.c2 != null && this.c1.isOutOwner()) {
                            this.c2 = MessagesController.getInstance(i22).getUser(Long.valueOf(UserConfig.getInstance(i22).clientUserId));
                        }
                    }
                    this.B = this.L0 && ChatObject.isCommunity(this.d2) && this.K0;
                    if (this.G0 == 0) {
                        org.telegram.ui.ActionBar.k6.u1.setCallback(this);
                        z8Var.g(2);
                        imageReceiver = imageReceiver2;
                        z17 = z11;
                        z18 = z12;
                        i14 = i12;
                        imageReceiver.setImage(null, null, z8Var, null, this.c2, 0);
                    } else {
                        imageReceiver = imageReceiver2;
                        z17 = z11;
                        z18 = z12;
                        i14 = i12;
                        if (!this.L || (messageObject = this.c1) == null) {
                            TLRPC.User user5 = this.c2;
                            if (user5 != null) {
                                z8Var.m(i22, user5);
                                if (UserObject.isReplyUser(this.c2)) {
                                    z8Var.g(12);
                                    imageReceiver.setImage(null, null, z8Var, null, this.c2, 0);
                                } else if (UserObject.isAnonymous(this.c2)) {
                                    z8Var.g(21);
                                    imageReceiver.setImage(null, null, z8Var, null, this.c2, 0);
                                } else if (UserObject.isUserSelf(this.c2) && this.o0 && !this.n0) {
                                    z8Var.g(22);
                                    imageReceiver.setImage(null, null, z8Var, null, this.c2, 0);
                                } else if (!UserObject.isUserSelf(this.c2) || this.r2 || this.n0) {
                                    imageReceiver.setForUserOrChat(this.c2, z8Var, null, true, 1, false);
                                } else {
                                    z8Var.g(1);
                                    imageReceiver.setImage(null, null, z8Var, null, this.c2, 0);
                                }
                            } else {
                                TLRPC.Chat chat9 = this.d2;
                                if (chat9 != null) {
                                    if (chat9.monoforum) {
                                        bg.e.n(i22, chat9, z8Var, imageReceiver);
                                        z8Var.p = 1.0f;
                                    } else {
                                        z8Var.k(i22, chat9);
                                        imageReceiver.setForUserOrChat(chat9, z8Var);
                                    }
                                    if (z4 || ((i14 == this.P0 && z18 == this.Q0) || (this.K0 && System.currentTimeMillis() - this.u4 <= 100))) {
                                        z19 = z13;
                                        z20 = z14;
                                        i15 = i22;
                                    } else {
                                        ValueAnimator valueAnimator = this.M3;
                                        if (valueAnimator != null) {
                                            valueAnimator.cancel();
                                        }
                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        this.M3 = ofFloat;
                                        ofFloat.addUpdateListener(new g2(this, 0));
                                        this.M3.addListener(new l2(this, 0));
                                        if ((i14 == 0 || this.Q0) && (this.Q0 || !z18)) {
                                            this.M3.setDuration(220L);
                                            this.M3.setInterpolator(new OvershootInterpolator());
                                        } else if (this.P0 == 0) {
                                            this.M3.setDuration(150L);
                                            this.M3.setInterpolator(pr.f);
                                        } else {
                                            this.M3.setDuration(430L);
                                            this.M3.setInterpolator(pr.f);
                                        }
                                        if (this.D3 && this.E3 && this.Q3 != null) {
                                            String format = String.format("%d", Integer.valueOf(i14));
                                            String format2 = String.format("%d", Integer.valueOf(this.P0));
                                            if (format.length() == format2.length()) {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(format2);
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(format2);
                                                int i40 = 0;
                                                while (i40 < format.length()) {
                                                    boolean z30 = z13;
                                                    if (format.charAt(i40) == format2.charAt(i40)) {
                                                        boolean z31 = false;
                                                        z22 = z14;
                                                        int i41 = i40 + 1;
                                                        spannableStringBuilder.setSpan(new nz(z31), i40, i41, 0);
                                                        spannableStringBuilder2.setSpan(new nz(z31), i40, i41, 0);
                                                    } else {
                                                        z22 = z14;
                                                        spannableStringBuilder3.setSpan(new nz(false), i40, i40 + 1, 0);
                                                    }
                                                    i40++;
                                                    z13 = z30;
                                                    z14 = z22;
                                                }
                                                z19 = z13;
                                                z20 = z14;
                                                i15 = i22;
                                                int max = Math.max(AndroidUtilities.dp(8.0f), (int) Math.ceil(org.telegram.ui.ActionBar.k6.M0.measureText(format)));
                                                TextPaint textPaint = org.telegram.ui.ActionBar.k6.M0;
                                                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                                                this.R3 = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                                                this.S3 = new StaticLayout(spannableStringBuilder3, org.telegram.ui.ActionBar.k6.M0, max, alignment, 1.0f, 0.0f, false);
                                                this.T3 = new StaticLayout(spannableStringBuilder2, org.telegram.ui.ActionBar.k6.M0, max, alignment, 1.0f, 0.0f, false);
                                            } else {
                                                z19 = z13;
                                                z20 = z14;
                                                i15 = i22;
                                                this.R3 = this.Q3;
                                            }
                                        } else {
                                            z19 = z13;
                                            z20 = z14;
                                            i15 = i22;
                                        }
                                        this.I3 = this.H3;
                                        this.J3 = this.G3;
                                        this.K3 = this.P0 > i14;
                                        this.M3.start();
                                    }
                                    this.L3.a(this.T0 != 0, z4);
                                    boolean z32 = this.S0 != 0;
                                    if (!z4 && z32 != z17) {
                                        ValueAnimator valueAnimator2 = this.N3;
                                        if (valueAnimator2 != null) {
                                            valueAnimator2.cancel();
                                        }
                                        this.P3 = 0.0f;
                                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        this.N3 = ofFloat2;
                                        ofFloat2.addUpdateListener(new g2(this, 1));
                                        this.N3.addListener(new l2(this, 1));
                                        if (z32) {
                                            this.N3.setDuration(220L);
                                            this.N3.setInterpolator(new OvershootInterpolator());
                                        } else {
                                            this.N3.setDuration(150L);
                                            this.N3.setInterpolator(pr.f);
                                        }
                                        this.N3.start();
                                    }
                                    z21 = P() && (chat = this.d2) != null && chat.monoforum;
                                    this.y = z21;
                                    if (z21) {
                                        dp = 1;
                                    } else if (this.B) {
                                        dp = AndroidUtilities.dp(12.0f);
                                    } else {
                                        TLRPC.Chat chat10 = this.d2;
                                        dp = ((chat10 == null || !chat10.forum || this.G0 != 0 || this.L) && (this.o0 || (user = this.c2) == null || !user.self || !MessagesController.getInstance(i15).savedViewAsChats)) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f);
                                    }
                                    imageReceiver.setRoundRadius(dp);
                                    z27 = z16;
                                }
                            }
                        } else {
                            z8Var.j(i22, messageObject.getFromPeerObject());
                            imageReceiver.setForUserOrChat(this.c1.getFromPeerObject(), z8Var);
                        }
                    }
                    if (z4) {
                    }
                    z19 = z13;
                    z20 = z14;
                    i15 = i22;
                    this.L3.a(this.T0 != 0, z4);
                    if (this.S0 != 0) {
                    }
                    if (!z4) {
                    }
                    if (P()) {
                    }
                    this.y = z21;
                    if (z21) {
                    }
                    imageReceiver.setRoundRadius(dp);
                    z27 = z16;
                }
            } else {
                z10 = Q;
                z11 = z28;
                z12 = z29;
                i12 = i11;
            }
            z13 = false;
            z14 = false;
            z15 = false;
            if (i10 == 0) {
            }
            this.c2 = null;
            this.d2 = null;
            this.e2 = null;
            if (this.H0 != j10) {
            }
            i13 = this.G0;
            if (i13 == 0) {
            }
            if (j11 != j10) {
            }
            this.B = this.L0 && ChatObject.isCommunity(this.d2) && this.K0;
            if (this.G0 == 0) {
            }
            if (z4) {
            }
            z19 = z13;
            z20 = z14;
            i15 = i22;
            this.L3.a(this.T0 != 0, z4);
            if (this.S0 != 0) {
            }
            if (!z4) {
            }
            if (P()) {
            }
            this.y = z21;
            if (z21) {
            }
            imageReceiver.setRoundRadius(dp);
            z27 = z16;
        }
        boolean z33 = (this.M || (getMeasuredWidth() == 0 && getMeasuredHeight() == 0)) ? z19 : true;
        if (!z27) {
            int i42 = this.r0.y;
            oh.m7.r(MessagesController.getInstance(i15).getStoriesController(), getDialogId());
        }
        if (!z4) {
            this.Z0 = (this.W0 || this.Y0) ? 1.0f : 0.0f;
            ValueAnimator valueAnimator3 = this.M3;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
        }
        invalidate();
        if (Q() != z10) {
            z20 = true;
        }
        if (z33) {
            if (this.t3) {
                t();
            } else {
                this.x0 = true;
            }
        }
        d0(z4);
        return z20;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f0, code lost:
    
        if (org.telegram.messenger.DownloadController.getInstance(r32.C0).canDownloadMedia(1, r4.size) == false) goto L47;
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
        boolean z4;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize strippedPhotoSize;
        TLRPC.PhotoSize photoSize2;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        boolean z10;
        TLRPC.PhotoSize photoSize3;
        MessageObject messageObject = this.c1;
        if (messageObject == null) {
            return;
        }
        String restrictionReason = MessagesController.getInstance(messageObject.currentAccount).getRestrictionReason(this.c1.messageOwner.restriction_reason);
        MessageObject messageObject2 = this.c1;
        TLRPC.PhotoSize photoSize4 = null;
        int i12 = 3;
        boolean z11 = false;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                this.O1 = 0;
                this.P1 = false;
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
                int i13 = 0;
                int i14 = 0;
                while (i13 < tL_messageMediaPaidMedia.extended_media.size() && this.O1 < i12) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i13);
                    boolean z12 = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
                    boolean[] zArr = this.U1;
                    boolean[] zArr2 = this.T1;
                    ImageReceiver[] imageReceiverArr = this.S1;
                    if (z12) {
                        i10 = i14 + 1;
                        TLRPC.PhotoSize photoSize5 = ((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb;
                        if (i14 < i12 && photoSize5 != null) {
                            this.P1 = z11;
                            int i15 = this.O1;
                            if (i15 < i12) {
                                this.O1 = i15 + 1;
                                zArr2[i14] = z11;
                                zArr[i14] = true;
                                imageReceiverArr[i14].setImage(ImageLocation.getForObject(photoSize5, this.c1.messageOwner), "2_2_b", null, null, z11 ? 1L : 0L, null, this.c1, 0);
                                imageReceiverArr[i14].setRoundRadius(AndroidUtilities.dp(2.0f));
                                this.S = z11;
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
                            z4 = isVideoDocument;
                            r14 = r83.thumbs;
                            photoSize = r83;
                            strippedPhotoSize = FileLoader.getStrippedPhotoSize(r14);
                            if (strippedPhotoSize == null) {
                                strippedPhotoSize = FileLoader.getClosestPhotoSizeWithSize(r14, 40);
                            }
                            photoSize2 = strippedPhotoSize;
                            closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(r14, AndroidUtilities.getPhotoSize(), z11, photoSize4, true);
                            if (photoSize2 == closestPhotoSizeWithSize) {
                                closestPhotoSizeWithSize = photoSize4;
                            }
                            if (closestPhotoSizeWithSize == null) {
                                i11 = i14;
                                z10 = false;
                            } else {
                                i11 = i14;
                                z10 = false;
                            }
                            closestPhotoSizeWithSize = photoSize2;
                            if (photoSize2 != null) {
                                this.P1 = this.P1 || z4;
                                int i16 = this.O1;
                                if (i16 < 3) {
                                    this.O1 = i16 + 1;
                                    zArr2[i11] = z4;
                                    zArr[i11] = z10;
                                    imageReceiverArr[i11].setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, photoSize), "20_20", ImageLocation.getForObject(photoSize2, photoSize), "20_20", (z4 || closestPhotoSizeWithSize == null) ? 0 : closestPhotoSizeWithSize.size, null, this.c1, 0);
                                    imageReceiverArr[i11].setRoundRadius(AndroidUtilities.dp(2.0f));
                                    this.S = false;
                                }
                            }
                        } else {
                            TLRPC.PhotoSize photoSize6 = photoSize4;
                            r14 = photoSize6;
                            photoSize3 = photoSize6;
                        }
                        z4 = false;
                        photoSize = photoSize3;
                        strippedPhotoSize = FileLoader.getStrippedPhotoSize(r14);
                        if (strippedPhotoSize == null) {
                        }
                        photoSize2 = strippedPhotoSize;
                        closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(r14, AndroidUtilities.getPhotoSize(), z11, photoSize4, true);
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
                        z11 = false;
                    }
                    i14 = i10;
                    i13++;
                    photoSize4 = null;
                    i12 = 3;
                    z11 = false;
                }
                return;
            }
        }
        ArrayList arrayList = this.d1;
        if (arrayList != null && arrayList.size() > 1 && TextUtils.isEmpty(restrictionReason) && this.G0 == 0 && this.e2 == null) {
            this.O1 = 0;
            this.P1 = false;
            Collections.sort(this.d1, Comparator$-CC.comparingInt(new lf.d(10)));
            for (int i17 = 0; i17 < Math.min(3, this.d1.size()); i17++) {
                MessageObject messageObject3 = (MessageObject) this.d1.get(i17);
                if (messageObject3 != null && !messageObject3.needDrawBluredPreview() && (messageObject3.isPhoto() || messageObject3.isNewGif() || messageObject3.isVideo() || messageObject3.isRoundVideo() || messageObject3.isStoryMedia())) {
                    String str = messageObject3.isWebpage() ? messageObject3.messageOwner.media.webpage.type : null;
                    if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                        Z(messageObject3, i17);
                    }
                }
            }
            return;
        }
        MessageObject messageObject4 = this.c1;
        if (messageObject4 == null || this.G0 != 0) {
            return;
        }
        this.O1 = 0;
        this.P1 = false;
        if (messageObject4.needDrawBluredPreview()) {
            return;
        }
        if (this.c1.isPhoto() || this.c1.isNewGif() || this.c1.isVideo() || this.c1.isRoundVideo() || this.c1.isStoryMedia()) {
            String str2 = this.c1.isWebpage() ? this.c1.messageOwner.media.webpage.type : null;
            if ("app".equals(str2) || "profile".equals(str2) || "article".equals(str2)) {
                return;
            }
            if (str2 == null || !str2.startsWith("telegram_")) {
                Z(this.c1, 0);
            }
        }
    }

    public final void d0(boolean z4) {
        TL_account.RequirementToContact isUserContactBlocked = (this.S4 == null || this.c2 == null) ? null : MessagesController.getInstance(this.C0).isUserContactBlocked(this.c2.id);
        if (this.k2 == DialogObject.isPremiumBlocked(isUserContactBlocked) && this.m2 == DialogObject.getMessagesStarsPrice(isUserContactBlocked)) {
            return;
        }
        this.k2 = DialogObject.isPremiumBlocked(isUserContactBlocked);
        this.m2 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
        if (!z4) {
            this.j2.f(this.k2, true);
            this.l2.f(this.m2 > 0, true);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((!this.M && !this.C && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            this.r0.a(motionEvent, this);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e0() {
        if (this.O1 > 0) {
            StaticLayout staticLayout = Q() ? this.e3 : this.b3;
            int i10 = Q() ? this.Z2 : this.Y2;
            if (staticLayout == null) {
                return;
            }
            try {
                CharSequence text = staticLayout.getText();
                if (text instanceof Spanned) {
                    p2[] p2VarArr = (p2[]) ((Spanned) text).getSpans(0, text.length(), p2.class);
                    boolean[] zArr = this.R1;
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
                    if (ceil != 0 && !this.u0 && !this.v0) {
                        ceil += AndroidUtilities.dp(3.0f);
                    }
                    for (int i12 = 0; i12 < this.O1; i12++) {
                        this.S1[i12].setImageX(i10 + ceil + AndroidUtilities.dp((this.E4 + 2) * i12));
                        zArr[i12] = true;
                    }
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    public float getClipProgress() {
        return this.q1;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public int getCurrentDialogFolderId() {
        return this.G0;
    }

    public long getDialogId() {
        return this.E0;
    }

    public boolean getHasUnread() {
        return this.P0 != 0 || this.Q0;
    }

    public boolean getIsMuted() {
        return this.W0;
    }

    public boolean getIsPinned() {
        return this.x3 || this.y3;
    }

    public MessageObject getMessage() {
        return this.c1;
    }

    public int getMessageId() {
        return this.i1;
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
        MessageObject messageObject3 = this.c1;
        if (messageObject3 != null) {
            long fromChatId = messageObject3.getFromChatId();
            int i10 = this.C0;
            long clientUserId = UserConfig.getInstance(i10).getClientUserId();
            if (!this.o0 && this.E0 == clientUserId) {
                long savedDialogId = this.c1.getSavedDialogId();
                if (savedDialogId != clientUserId) {
                    if (savedDialogId != UserObject.ANONYMOUS) {
                        TLRPC.Message message5 = this.c1.messageOwner;
                        if (message5 != null && (messageFwdHeader4 = message5.fwd_from) != null) {
                            long peerDialogId = DialogObject.getPeerDialogId(messageFwdHeader4.saved_from_id);
                            if (peerDialogId == 0) {
                                peerDialogId = DialogObject.getPeerDialogId(this.c1.messageOwner.fwd_from.from_id);
                            }
                            if (peerDialogId > 0) {
                            }
                        }
                        fromChatId = savedDialogId;
                    }
                }
            }
            if (this.o0 && (message4 = this.c1.messageOwner) != null && (messageFwdHeader3 = message4.fwd_from) != null) {
                fromChatId = DialogObject.getPeerDialogId(messageFwdHeader3.saved_from_id);
                if (fromChatId == 0) {
                    fromChatId = DialogObject.getPeerDialogId(this.c1.messageOwner.fwd_from.from_id);
                }
            }
            if (DialogObject.isUserDialog(fromChatId)) {
                user = MessagesController.getInstance(i10).getUser(Long.valueOf(fromChatId));
                chat = null;
            } else {
                chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-fromChatId));
                user = null;
            }
            long j10 = this.E0;
            if (j10 != clientUserId) {
                if (j10 == UserObject.VERIFY && (messageObject2 = this.c1) != null && (message3 = messageObject2.messageOwner) != null && (messageFwdHeader2 = message3.fwd_from) != null) {
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
                if (this.c1.isOutOwner() && user != null) {
                    return LocaleController.getString(R.string.FromYou);
                }
                if (!this.o0 && (messageObject = this.c1) != null && (message2 = messageObject.messageOwner) != null && (message2.from_id instanceof TLRPC.TL_peerUser) && (user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(this.c1.messageOwner.from_id.user_id))) != null) {
                    return AndroidUtilities.escape(UserObject.getFirstName(user2).replace("\n", ""));
                }
                MessageObject messageObject4 = this.c1;
                return (messageObject4 == null || (message = messageObject4.messageOwner) == null || (messageFwdHeader = message.fwd_from) == null || (str2 = messageFwdHeader.from_name) == null) ? user != null ? (this.o2 || SharedConfig.useThreeLinesLayout) ? UserObject.isDeleted(user) ? LocaleController.getString(R.string.HiddenName) : AndroidUtilities.escape(ContactsController.formatName(user.first_name, user.last_name).replace("\n", "")) : AndroidUtilities.escape(UserObject.getFirstName(user).replace("\n", "")) : (chat == null || (str = chat.title) == null) ? "DELETED" : AndroidUtilities.escape(str.replace("\n", "")) : AndroidUtilities.escape(str2);
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
        return this.m2;
    }

    @Override // android.view.View
    public float getTranslationX() {
        return this.t1;
    }

    @Override // org.telegram.ui.Cells.a0, android.view.View
    public final void invalidate() {
        if (oh.i9.u1) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == this.v1 || drawable == org.telegram.ui.ActionBar.k6.u1) {
            invalidate(drawable.getBounds());
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V1.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.S1;
            if (i10 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i10].onAttachedToWindow();
            i10++;
        }
        U();
        this.j3 = org.telegram.ui.Components.u5.update(0, this, this.j3, this.b3);
        this.k3 = org.telegram.ui.Components.u5.update(0, this, this.k3, this.p3);
        this.l3 = org.telegram.ui.Components.u5.update(0, this, this.l3, this.e3);
        this.m3 = org.telegram.ui.Components.u5.update(0, this, this.m3, this.w2);
        org.telegram.ui.Components.j5 j5Var = this.g4;
        if (j5Var != null) {
            j5Var.a();
        }
        org.telegram.ui.Components.j5 j5Var2 = this.h4;
        if (j5Var2 != null) {
            j5Var2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.u1 = false;
        this.x1 = false;
        this.y1 = 0.0f;
        this.t3 = false;
        this.u3 = (getIsPinned() && this.v3) ? 1.0f : 0.0f;
        this.V1.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.S1;
            if (i10 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i10].onDetachedFromWindow();
            i10++;
        }
        hj0 hj0Var = this.v1;
        if (hj0Var != null) {
            hj0Var.stop();
            this.v1.Q(0.0f, true);
            this.v1.setCallback(null);
            this.v1 = null;
            this.w1 = false;
        }
        uf.h hVar = this.l4;
        if (hVar != null) {
            hVar.d.remove(Long.valueOf(this.E0));
        }
        org.telegram.ui.Components.j5 j5Var = this.g4;
        if (j5Var != null) {
            j5Var.b();
        }
        org.telegram.ui.Components.j5 j5Var2 = this.h4;
        if (j5Var2 != null) {
            j5Var2.b();
        }
        org.telegram.ui.Components.u5.release(this, this.j3);
        org.telegram.ui.Components.u5.release(this, this.k3);
        org.telegram.ui.Components.u5.release(this, this.l3);
        org.telegram.ui.Components.u5.release(this, this.m3);
        this.r0.g();
        this.W = null;
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
        float f10;
        boolean z4;
        int v02;
        int v03;
        int i10;
        String string;
        String str;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.g6 g6Var;
        boolean z10;
        fg.h0 h0Var;
        f2.a0 a0Var;
        float f11;
        String str2;
        float f12;
        int i14;
        String str3;
        float f13;
        f2.a0 a0Var2;
        float f14;
        f2.a0 a0Var3;
        String str4;
        int ceil;
        int i15;
        StaticLayout staticLayout;
        boolean z11;
        hj0 hj0Var;
        float f15;
        float f16;
        org.telegram.ui.ActionBar.g6 g6Var2;
        float f17;
        r2 r2Var;
        org.telegram.ui.ActionBar.g6 g6Var3;
        f2.a0 a0Var4;
        fg.h0 h0Var2;
        int i16;
        ?? r12;
        float f18;
        boolean z12;
        boolean z13;
        boolean z14;
        ImageReceiver imageReceiver;
        boolean z15;
        j2 j2Var;
        r2 r2Var2;
        float f19;
        Canvas canvas2;
        boolean z16;
        float f20;
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.TL_forumTopic tL_forumTopic2;
        ri0 ri0Var;
        o2 o2Var;
        float f21;
        int i17;
        float f22;
        int i18;
        int i19;
        boolean z17;
        o2 o2Var2;
        int i20;
        float f23;
        int i21;
        RectF rectF;
        org.telegram.ui.ActionBar.g6 g6Var4;
        o2 o2Var3;
        float f24;
        boolean z18;
        r2 r2Var3;
        boolean z19;
        float f25;
        is isVar;
        int i22;
        float dp;
        float f26;
        boolean z20;
        boolean z21;
        boolean z22;
        int i23;
        float f27;
        float w10;
        StaticLayout staticLayout2;
        int i24;
        mw0 t02;
        int i25;
        m2 m2Var;
        py pyVar;
        kx kxVar;
        TLRPC.TL_forumTopic tL_forumTopic3;
        ri0 ri0Var2;
        TLRPC.TL_forumTopic tL_forumTopic4;
        final r2 r2Var4 = this;
        Canvas canvas3 = canvas;
        if ((r2Var4.E0 == 0 && r2Var4.D0 == null) || !r2Var4.w0) {
            return;
        }
        boolean z23 = r2Var4.h;
        fg.h0 h0Var3 = r2Var4.f4;
        if (z23 && ((r2Var4.G0 != 0 || (r2Var4.M && (tL_forumTopic4 = r2Var4.K) != null && tL_forumTopic4.id == 1)) && (ri0Var2 = r2Var4.b2) != null && ri0Var2.C == 0.0f && r2Var4.t1 == 0.0f)) {
            canvas3.save();
            canvas3.translate(0.0f, (-r2Var4.B3) - r2Var4.n);
            canvas3.clipRect(0.0f, (1.0f - r2Var4.b2.J) * r2Var4.getMeasuredHeight(), r2Var4.getMeasuredWidth(), r2Var4.getMeasuredHeight());
            r2Var4.b2.c(canvas3, false);
            canvas3.restore();
            h0Var3.setVisibility(4);
            return;
        }
        boolean z24 = z23 && (r2Var4.G0 != 0 || (r2Var4.M && (tL_forumTopic3 = r2Var4.K) != null && tL_forumTopic3.id == 1)) && r2Var4.b2 != null && r2Var4.t1 == 0.0f && (pyVar = r2Var4.w4) != null && pyVar.Z3() && ((kxVar = pyVar.C3) == null || !kxVar.c());
        ri0 ri0Var3 = r2Var4.b2;
        float f28 = ri0Var3 != null ? ri0Var3.J : 1.0f;
        if (z24) {
            canvas3.save();
            canvas3.clipRect(0.0f, (1.0f - f28) * r2Var4.getMeasuredHeight(), r2Var4.getMeasuredWidth(), r2Var4.getMeasuredHeight());
        }
        if (r2Var4.q1 != 0.0f && Build.VERSION.SDK_INT != 24) {
            canvas3.save();
            canvas3.clipRect(0.0f, r2Var4.r1 * r2Var4.q1, r2Var4.getMeasuredWidth(), r2Var4.getMeasuredHeight() - ((int) (r2Var4.s1 * r2Var4.q1)));
        }
        float f29 = r2Var4.t1;
        f2.a0 a0Var5 = r2Var4.a2;
        org.telegram.ui.ActionBar.g6 g6Var5 = r2Var4.C4;
        if (f29 == 0.0f && r2Var4.l1 == 0.0f) {
            hj0 hj0Var2 = r2Var4.v1;
            if (hj0Var2 != null) {
                hj0Var2.stop();
                r2Var4.v1.Q(0.0f, true);
                r2Var4.v1.setCallback(null);
                r2Var4.v1 = null;
                r2Var4.w1 = false;
            }
            g6Var = g6Var5;
            z10 = z23;
            h0Var = h0Var3;
            a0Var3 = a0Var5;
        } else {
            canvas3.save();
            canvas3.translate(0.0f, -r2Var4.B3);
            if (r2Var4.I1) {
                v02 = org.telegram.ui.ActionBar.k6.v0(r2Var4.J1, g6Var5);
                v03 = org.telegram.ui.ActionBar.k6.v0(r2Var4.K1, g6Var5);
                String str5 = r2Var4.L1;
                f10 = 1.0f;
                i10 = r2Var4.M1;
                string = LocaleController.getString(str5, i10);
                z4 = false;
                r2Var4.v1 = r2Var4.N1;
            } else {
                f10 = 1.0f;
                z4 = false;
                if (r2Var4.G0 != 0) {
                    if (r2Var4.j1) {
                        v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d9, g6Var5);
                        v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.c9, g6Var5);
                        i10 = R.string.UnhideFromTop;
                        string = LocaleController.getString(i10);
                        r2Var4.v1 = org.telegram.ui.ActionBar.k6.y1;
                    } else {
                        v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.c9, g6Var5);
                        v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d9, g6Var5);
                        i10 = R.string.HideOnTop;
                        string = LocaleController.getString(i10);
                        r2Var4.v1 = org.telegram.ui.ActionBar.k6.x1;
                    }
                } else if (r2Var4.M2) {
                    v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.c9, g6Var5);
                    v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d9, g6Var5);
                    i10 = R.string.PsaHide;
                    string = LocaleController.getString(i10);
                    r2Var4.v1 = org.telegram.ui.ActionBar.k6.z1;
                } else if (r2Var4.h1 == 0) {
                    v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.c9, g6Var5);
                    v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d9, g6Var5);
                    if (ChatObject.isCommunity(r2Var4.d2)) {
                        int i26 = R.string.SwipeUngroupCommunity;
                        String string2 = LocaleController.getString(i26);
                        v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Y5, g6Var5);
                        r2Var4.v1 = org.telegram.ui.ActionBar.k6.K1;
                        str = string2;
                        i11 = i26;
                        i12 = v02;
                        if (r2Var4.w || (hj0Var = r2Var4.s) == null) {
                            r2Var4.s = r2Var4.v1;
                            r2Var4.v = i11;
                        } else {
                            r2Var4.v1 = hj0Var;
                            i11 = r2Var4.v;
                        }
                        if (!r2Var4.w1 && Math.abs(r2Var4.t1) > AndroidUtilities.dp(43.0f)) {
                            r2Var4.w1 = true;
                            r2Var4.v1.Q(0.0f, true);
                            r2Var4.v1.setCallback(r2Var4);
                            r2Var4.v1.start();
                        }
                        float measuredWidth = r2Var4.getMeasuredWidth() + r2Var4.t1;
                        if (r2Var4.y1 >= f10) {
                            org.telegram.ui.ActionBar.k6.v0.setColor(v02);
                            i13 = i11;
                            g6Var = g6Var5;
                            z10 = z23;
                            h0Var = h0Var3;
                            a0Var = a0Var5;
                            f12 = measuredWidth;
                            str2 = "Arrow";
                            f11 = 0.0f;
                            canvas3.drawRect(measuredWidth - AndroidUtilities.dp(8.0f), 0.0f, r2Var4.getMeasuredWidth(), r2Var4.getMeasuredHeight(), org.telegram.ui.ActionBar.k6.v0);
                            if (r2Var4.y1 == 0.0f) {
                                if (org.telegram.ui.ActionBar.k6.A1) {
                                    org.telegram.ui.ActionBar.k6.v1.O(org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.c9), str2);
                                    org.telegram.ui.ActionBar.k6.A1 = z4;
                                }
                                if (org.telegram.ui.ActionBar.k6.B1) {
                                    hj0 hj0Var3 = org.telegram.ui.ActionBar.k6.z1;
                                    hj0Var3.X = true;
                                    int i27 = org.telegram.ui.ActionBar.k6.c9;
                                    hj0Var3.O(org.telegram.ui.ActionBar.k6.E0(i27), "Line 1");
                                    org.telegram.ui.ActionBar.k6.z1.O(org.telegram.ui.ActionBar.k6.E0(i27), "Line 2");
                                    org.telegram.ui.ActionBar.k6.z1.O(org.telegram.ui.ActionBar.k6.E0(i27), "Line 3");
                                    org.telegram.ui.ActionBar.k6.z1.m();
                                    org.telegram.ui.ActionBar.k6.B1 = z4;
                                }
                            }
                        } else {
                            i13 = i11;
                            g6Var = g6Var5;
                            z10 = z23;
                            h0Var = h0Var3;
                            a0Var = a0Var5;
                            f11 = 0.0f;
                            str2 = "Arrow";
                            f12 = measuredWidth;
                        }
                        int measuredWidth2 = (r2Var4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (r2Var4.v1.getIntrinsicWidth() / 2);
                        int x10 = org.telegram.ui.b.x(52.0f, r2Var4.getMeasuredHeight(), 2);
                        int intrinsicWidth = (r2Var4.v1.getIntrinsicWidth() / 2) + measuredWidth2;
                        int intrinsicHeight = (r2Var4.v1.getIntrinsicHeight() / 2) + x10;
                        if (r2Var4.y1 <= f11) {
                            canvas3.save();
                            i14 = i13;
                            str3 = str;
                            f13 = f12;
                            canvas3.clipRect(f12 - AndroidUtilities.dp(8.0f), 0.0f, r2Var4.getMeasuredWidth(), r2Var4.getMeasuredHeight());
                            org.telegram.ui.ActionBar.k6.v0.setColor(i12);
                            a0Var2 = a0Var;
                            canvas3.drawCircle(intrinsicWidth, intrinsicHeight, AndroidUtilities.accelerateInterpolator.getInterpolation(r2Var4.y1) * ((float) Math.sqrt(((intrinsicHeight - r2Var4.getMeasuredHeight()) * (intrinsicHeight - r2Var4.getMeasuredHeight())) + (intrinsicWidth * intrinsicWidth))), org.telegram.ui.ActionBar.k6.v0);
                            canvas3.restore();
                            if (org.telegram.ui.ActionBar.k6.A1) {
                                z11 = true;
                            } else {
                                org.telegram.ui.ActionBar.k6.v1.O(org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.d9), str2);
                                z11 = true;
                                org.telegram.ui.ActionBar.k6.A1 = true;
                            }
                            if (!org.telegram.ui.ActionBar.k6.B1) {
                                hj0 hj0Var4 = org.telegram.ui.ActionBar.k6.z1;
                                hj0Var4.X = z11;
                                int i28 = org.telegram.ui.ActionBar.k6.d9;
                                hj0Var4.O(org.telegram.ui.ActionBar.k6.E0(i28), "Line 1");
                                org.telegram.ui.ActionBar.k6.z1.O(org.telegram.ui.ActionBar.k6.E0(i28), "Line 2");
                                org.telegram.ui.ActionBar.k6.z1.O(org.telegram.ui.ActionBar.k6.E0(i28), "Line 3");
                                org.telegram.ui.ActionBar.k6.z1.m();
                                org.telegram.ui.ActionBar.k6.B1 = true;
                            }
                        } else {
                            i14 = i13;
                            str3 = str;
                            f13 = f12;
                            a0Var2 = a0Var;
                        }
                        canvas3.save();
                        canvas3.translate(measuredWidth2, x10);
                        f14 = r2Var4.z1;
                        if (f14 != 0.0f || f14 == f10) {
                            a0Var3 = a0Var2;
                        } else {
                            a0Var3 = a0Var2;
                            float interpolation = a0Var3.getInterpolation(f14) + f10;
                            canvas3.scale(interpolation, interpolation, r2Var4.v1.getIntrinsicWidth() / 2, r2Var4.v1.getIntrinsicHeight() / 2);
                        }
                        a0.o(0, 0, r2Var4.v1);
                        r2Var4.v1.draw(canvas3);
                        canvas3.restore();
                        canvas3.clipRect(f13, 0.0f, r2Var4.getMeasuredWidth(), r2Var4.getMeasuredHeight());
                        str4 = str3;
                        ceil = (int) Math.ceil(org.telegram.ui.ActionBar.k6.M0.measureText(str4));
                        i15 = i14;
                        if (r2Var4.y4 == i15 || r2Var4.z4 != r2Var4.getMeasuredWidth()) {
                            r2Var4.y4 = i15;
                            r2Var4.z4 = r2Var4.getMeasuredWidth();
                            TextPaint textPaint = org.telegram.ui.ActionBar.k6.N0;
                            int min = Math.min(AndroidUtilities.dp(80.0f), ceil);
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                            staticLayout = new StaticLayout(str4, textPaint, min, alignment, 1.0f, 0.0f, false);
                            r2Var4.x4 = staticLayout;
                            if (staticLayout.getLineCount() > 1) {
                                r2Var4.x4 = new StaticLayout(str4, org.telegram.ui.ActionBar.k6.O0, Math.min(AndroidUtilities.dp(82.0f), ceil), alignment, 1.0f, 0.0f, false);
                            }
                        }
                        if (r2Var4.x4 == null) {
                            canvas3.save();
                            canvas3.translate((r2Var4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (r2Var4.x4.getWidth() / 2.0f), AndroidUtilities.dp(36.0f) + x10 + (r2Var4.x4.getLineCount() > 1 ? -AndroidUtilities.dp(4.0f) : 0.0f));
                            r2Var4.x4.draw(canvas3);
                            canvas3.restore();
                        }
                        canvas3.restore();
                    } else {
                        int i29 = r2Var4.C0;
                        if (SharedConfig.getChatSwipeAction(i29) == 3) {
                            if (r2Var4.W0) {
                                i10 = R.string.SwipeUnmute;
                                string = LocaleController.getString(i10);
                                r2Var4.v1 = org.telegram.ui.ActionBar.k6.I1;
                            } else {
                                i10 = R.string.SwipeMute;
                                string = LocaleController.getString(i10);
                                r2Var4.v1 = org.telegram.ui.ActionBar.k6.H1;
                            }
                        } else if (SharedConfig.getChatSwipeAction(i29) == 4) {
                            i10 = R.string.SwipeDeleteChat;
                            string = LocaleController.getString(i10);
                            v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Y5, g6Var5);
                            r2Var4.v1 = org.telegram.ui.ActionBar.k6.J1;
                        } else if (SharedConfig.getChatSwipeAction(i29) == 1) {
                            if (r2Var4.P0 > 0 || r2Var4.Q0) {
                                i10 = R.string.SwipeMarkAsRead;
                                string = LocaleController.getString(i10);
                                r2Var4.v1 = org.telegram.ui.ActionBar.k6.L1;
                            } else {
                                i10 = R.string.SwipeMarkAsUnread;
                                string = LocaleController.getString(i10);
                                r2Var4.v1 = org.telegram.ui.ActionBar.k6.M1;
                            }
                        } else if (SharedConfig.getChatSwipeAction(i29) != 0) {
                            i10 = R.string.Archive;
                            string = LocaleController.getString(i10);
                            r2Var4.v1 = org.telegram.ui.ActionBar.k6.v1;
                        } else if (r2Var4.getIsPinned()) {
                            i10 = R.string.SwipeUnpin;
                            string = LocaleController.getString(i10);
                            r2Var4.v1 = org.telegram.ui.ActionBar.k6.O1;
                        } else {
                            i10 = R.string.SwipePin;
                            string = LocaleController.getString(i10);
                            r2Var4.v1 = org.telegram.ui.ActionBar.k6.N1;
                        }
                    }
                } else {
                    v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d9, g6Var5);
                    v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.c9, g6Var5);
                    i10 = R.string.Unarchive;
                    string = LocaleController.getString(i10);
                    r2Var4.v1 = org.telegram.ui.ActionBar.k6.w1;
                }
            }
            int i30 = i10;
            i12 = v03;
            i11 = i30;
            str = string;
            if (r2Var4.w) {
            }
            r2Var4.s = r2Var4.v1;
            r2Var4.v = i11;
            if (!r2Var4.w1) {
                r2Var4.w1 = true;
                r2Var4.v1.Q(0.0f, true);
                r2Var4.v1.setCallback(r2Var4);
                r2Var4.v1.start();
            }
            float measuredWidth3 = r2Var4.getMeasuredWidth() + r2Var4.t1;
            if (r2Var4.y1 >= f10) {
            }
            int measuredWidth22 = (r2Var4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (r2Var4.v1.getIntrinsicWidth() / 2);
            int x102 = org.telegram.ui.b.x(52.0f, r2Var4.getMeasuredHeight(), 2);
            int intrinsicWidth2 = (r2Var4.v1.getIntrinsicWidth() / 2) + measuredWidth22;
            int intrinsicHeight2 = (r2Var4.v1.getIntrinsicHeight() / 2) + x102;
            if (r2Var4.y1 <= f11) {
            }
            canvas3.save();
            canvas3.translate(measuredWidth22, x102);
            f14 = r2Var4.z1;
            if (f14 != 0.0f) {
            }
            a0Var3 = a0Var2;
            a0.o(0, 0, r2Var4.v1);
            r2Var4.v1.draw(canvas3);
            canvas3.restore();
            canvas3.clipRect(f13, 0.0f, r2Var4.getMeasuredWidth(), r2Var4.getMeasuredHeight());
            str4 = str3;
            ceil = (int) Math.ceil(org.telegram.ui.ActionBar.k6.M0.measureText(str4));
            i15 = i14;
            if (r2Var4.y4 == i15) {
            }
            r2Var4.y4 = i15;
            r2Var4.z4 = r2Var4.getMeasuredWidth();
            TextPaint textPaint2 = org.telegram.ui.ActionBar.k6.N0;
            int min2 = Math.min(AndroidUtilities.dp(80.0f), ceil);
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
            staticLayout = new StaticLayout(str4, textPaint2, min2, alignment2, 1.0f, 0.0f, false);
            r2Var4.x4 = staticLayout;
            if (staticLayout.getLineCount() > 1) {
            }
            if (r2Var4.x4 == null) {
            }
            canvas3.restore();
        }
        if (r2Var4.t1 != 0.0f) {
            canvas3.save();
            canvas3.translate(r2Var4.t1, 0.0f);
            f15 = 0.0f + r2Var4.t1;
        } else {
            f15 = 0.0f;
        }
        float dp2 = AndroidUtilities.dp(8.0f) * r2Var4.l1;
        boolean z25 = r2Var4.j4;
        RectF rectF2 = r2Var4.k4;
        if (z25) {
            f16 = 0.0f;
            rectF2.set(0.0f, 0.0f, r2Var4.getMeasuredWidth(), AndroidUtilities.lerp(r2Var4.getMeasuredHeight(), r2Var4.getCollapsedHeight(), r2Var4.f0));
            rectF2.offset(0.0f, (-r2Var4.B3) + r2Var4.z0);
            canvas3.drawRoundRect(rectF2, dp2, dp2, org.telegram.ui.ActionBar.k6.u0);
        } else {
            f16 = 0.0f;
        }
        canvas3.save();
        canvas3.translate(f16, (-r2Var4.n) * r2Var4.f0);
        if (r2Var4.G0 == 0 || (SharedConfig.archiveHidden && r2Var4.A1 == f16)) {
            g6Var2 = g6Var;
            if (r2Var4.getIsPinned() || r2Var4.w3) {
                org.telegram.ui.ActionBar.k6.v0.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.s9, g6Var2));
                org.telegram.ui.ActionBar.k6.v0.setAlpha((int) ((1.0f - r2Var4.f0) * r3.getAlpha()));
            }
        } else {
            g6Var2 = g6Var;
            org.telegram.ui.ActionBar.k6.v0.setColor(AndroidUtilities.getOffsetColor(0, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.s9, g6Var2), r2Var4.A1, 1.0f));
            org.telegram.ui.ActionBar.k6.v0.setAlpha((int) ((1.0f - r2Var4.f0) * r3.getAlpha()));
        }
        canvas3.restore();
        o2 o2Var4 = r2Var4.B4;
        o2Var4.b();
        if (r2Var4.z0 != 0.0f) {
            canvas3.save();
            canvas3.translate(0.0f, r2Var4.z0);
            f17 = r2Var4.z0 + 0.0f;
        } else {
            f17 = 0.0f;
        }
        float f30 = r2Var4.f0;
        if (f30 != 1.0f) {
            if (f30 != 0.0f) {
                float clamp = Utilities.clamp(f30 / 0.4f, 1.0f, 0.0f);
                if (SharedConfig.getDevicePerformanceClass() >= 2) {
                    o2Var = o2Var4;
                    f21 = 1.0f;
                    i17 = -1;
                    f22 = 2.0f;
                    i18 = canvas3.saveLayerAlpha(yh.c(1.0f, clamp, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(a41.getRightPaddingSize() + 1)), 0.0f, r2Var4.getMeasuredWidth(), r2Var4.getMeasuredHeight(), (int) ((1.0f - r2Var4.f0) * 255.0f), 31);
                } else {
                    o2Var = o2Var4;
                    f21 = 1.0f;
                    i17 = -1;
                    f22 = 2.0f;
                    i18 = canvas3.save();
                    canvas3.clipRect(yh.c(1.0f, clamp, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(a41.getRightPaddingSize() + 1)), 0.0f, r2Var4.getMeasuredWidth(), r2Var4.getMeasuredHeight());
                }
                canvas3.translate((-(r2Var4.getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * r2Var4.f0, 0.0f);
                f15 += (-(r2Var4.getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * r2Var4.f0;
            } else {
                o2Var = o2Var4;
                f21 = 1.0f;
                i17 = -1;
                f22 = 2.0f;
                i18 = -1;
            }
            float f31 = f15;
            if (r2Var4.t1 != 0.0f || r2Var4.l1 != 0.0f) {
                canvas3.save();
                org.telegram.ui.ActionBar.k6.v0.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, g6Var2));
                rectF2.set(r2Var4.getMeasuredWidth() - AndroidUtilities.dp(64.0f), 0.0f, r2Var4.getMeasuredWidth(), r2Var4.getMeasuredHeight());
                rectF2.offset(0.0f, -r2Var4.B3);
                canvas3.drawRoundRect(rectF2, dp2, dp2, org.telegram.ui.ActionBar.k6.v0);
                if (r2Var4.j4) {
                    canvas3.drawRoundRect(rectF2, dp2, dp2, org.telegram.ui.ActionBar.k6.u0);
                }
                if (r2Var4.G0 != 0 && (!SharedConfig.archiveHidden || r2Var4.A1 != 0.0f)) {
                    org.telegram.ui.ActionBar.k6.v0.setColor(AndroidUtilities.getOffsetColor(0, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.s9, g6Var2), r2Var4.A1, f21));
                    org.telegram.ui.ActionBar.k6.v0.setAlpha((int) ((f21 - r2Var4.f0) * r0.getAlpha()));
                } else if (r2Var4.getIsPinned() || r2Var4.w3) {
                    org.telegram.ui.ActionBar.k6.v0.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.s9, g6Var2));
                    org.telegram.ui.ActionBar.k6.v0.setAlpha((int) ((f21 - r2Var4.f0) * r0.getAlpha()));
                }
                canvas3.restore();
            }
            if (r2Var4.t1 != 0.0f) {
                float f32 = r2Var4.l1;
                if (f32 < f21) {
                    float f33 = f32 + 0.10666667f;
                    r2Var4.l1 = f33;
                    if (f33 > f21) {
                        r2Var4.l1 = f21;
                    }
                    z13 = true;
                }
                z13 = false;
            } else {
                float f34 = r2Var4.l1;
                if (f34 > 0.0f) {
                    float f35 = f34 - 0.10666667f;
                    r2Var4.l1 = f35;
                    if (f35 < 0.0f) {
                        r2Var4.l1 = 0.0f;
                    }
                    z13 = true;
                }
                z13 = false;
            }
            if (r2Var4.D2) {
                a0.o(r2Var4.G2, r2Var4.H2, org.telegram.ui.ActionBar.k6.a1);
                org.telegram.ui.ActionBar.k6.a1.draw(canvas3);
            }
            boolean z26 = r2Var4.o2;
            int dp3 = AndroidUtilities.dp((z26 || SharedConfig.useThreeLinesLayout) ? 10.0f : 14.0f);
            if (((!z26 && !SharedConfig.useThreeLinesLayout) || r2Var4.Q()) && r2Var4.M()) {
                dp3 -= AndroidUtilities.dp(r2Var4.Q() ? 8.0f : 9.0f);
            }
            if (r2Var4.w2 != null) {
                if (!r2Var4.A2 || r2Var4.x2) {
                    i19 = i18;
                    f23 = 24.0f;
                } else {
                    if (r2Var4.z2 && r2Var4.B2 == null) {
                        Paint paint = new Paint();
                        r2Var4.B2 = paint;
                        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{i17, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        r2Var4.B2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    } else if (r2Var4.C2 == null) {
                        Paint paint2 = new Paint();
                        r2Var4.C2 = paint2;
                        paint2.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{0, i17}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        r2Var4.C2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    f23 = 24.0f;
                    i19 = i18;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, r2Var4.getMeasuredWidth(), r2Var4.getMeasuredHeight(), 255, 31);
                    int i31 = r2Var4.u2;
                    canvas3.clipRect(i31, 0, r2Var4.v2 + i31, r2Var4.getMeasuredHeight());
                }
                if (r2Var4.G0 != 0) {
                    TextPaint textPaint3 = org.telegram.ui.ActionBar.k6.B0[r2Var4.B0];
                    int v04 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Y8, g6Var2);
                    textPaint3.linkColor = v04;
                    textPaint3.setColor(v04);
                } else if (r2Var4.e2 != null || ((m2Var = r2Var4.D0) != null && m2Var.g == 2)) {
                    TextPaint textPaint4 = org.telegram.ui.ActionBar.k6.B0[r2Var4.B0];
                    int v05 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Z8, g6Var2);
                    textPaint4.linkColor = v05;
                    textPaint4.setColor(v05);
                } else {
                    TextPaint textPaint5 = org.telegram.ui.ActionBar.k6.B0[r2Var4.B0];
                    int v06 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.X8, g6Var2);
                    textPaint5.linkColor = v06;
                    textPaint5.setColor(v06);
                }
                canvas3.save();
                canvas3.translate(r2Var4.u2 + r2Var4.y2, dp3);
                jh.k.f(canvas3, r2Var4.w2);
                StaticLayout staticLayout3 = r2Var4.w2;
                z17 = z26;
                o2Var2 = o2Var;
                i20 = 1;
                i21 = -1;
                org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas3, staticLayout3, r2Var4.m3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, r2Var4.J(0, staticLayout3.getPaint().getColor()));
                canvas3.restore();
                if (r2Var4.A2 && !r2Var4.x2) {
                    canvas3.save();
                    if (r2Var4.z2) {
                        canvas3.translate(r2Var4.u2, 0.0f);
                        canvas3.drawRect(0.0f, 0.0f, AndroidUtilities.dp(f23), r2Var4.getMeasuredHeight(), r2Var4.B2);
                    } else {
                        canvas3.translate((r2Var4.u2 + r2Var4.v2) - AndroidUtilities.dp(f23), 0.0f);
                        canvas3.drawRect(0.0f, 0.0f, AndroidUtilities.dp(f23), r2Var4.getMeasuredHeight(), r2Var4.C2);
                    }
                    canvas3.restore();
                    canvas3.restore();
                }
            } else {
                i19 = i18;
                z17 = z26;
                o2Var2 = o2Var;
                i20 = 1;
                f23 = 24.0f;
                i21 = -1;
            }
            if (r2Var4.K2 != null && r2Var4.G0 == 0) {
                canvas3.save();
                canvas3.translate(r2Var4.I2, r2Var4.J2);
                TextPaint timeTextPaint = r2Var4.getTimeTextPaint();
                if (r2Var4.getIsPinned()) {
                    canvas3.translate(AndroidUtilities.dp(20.0f), 0.0f);
                    float height = (r2Var4.K2.getHeight() / f22) - AndroidUtilities.dp(8.5f);
                    float f36 = -AndroidUtilities.dp(20.0f);
                    float dp4 = AndroidUtilities.dp(6.0f) + r2Var4.K2.getWidth();
                    Drawable drawable = (!r2Var4.D3 || r2Var4.N()) ? org.telegram.ui.ActionBar.k6.k1 : org.telegram.ui.ActionBar.k6.l1;
                    int dp5 = (int) (((AndroidUtilities.dp(17.0f) - drawable.getIntrinsicHeight()) / f22) + height);
                    int dp6 = AndroidUtilities.dp(4.0f) + ((int) f36);
                    drawable.setBounds(dp6, dp5, drawable.getIntrinsicWidth() + dp6, drawable.getIntrinsicHeight() + dp5);
                    int alpha = timeTextPaint.getAlpha();
                    timeTextPaint.setAlpha(27);
                    canvas3.drawRoundRect(f36, height, dp4, height + AndroidUtilities.dp(17.0f), AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), timeTextPaint);
                    timeTextPaint.setAlpha(alpha);
                    drawable.draw(canvas3);
                }
                int color = r2Var4.K2.getPaint().getColor();
                boolean z27 = color != timeTextPaint.getColor();
                if (z27) {
                    r2Var4.K2.getPaint().setColor(timeTextPaint.getColor());
                }
                jh.k.f(canvas3, r2Var4.K2);
                if (z27) {
                    r2Var4.K2.getPaint().setColor(color);
                }
                canvas3.restore();
            }
            if (r2Var4.E()) {
                org.telegram.ui.ActionBar.k6.b1.setBounds(r2Var4.L2, ((r2Var4.K2.getHeight() - org.telegram.ui.ActionBar.k6.b1.getIntrinsicHeight()) / 2) + r2Var4.J2, org.telegram.ui.ActionBar.k6.b1.getIntrinsicWidth() + r2Var4.L2, org.telegram.ui.ActionBar.k6.b1.getIntrinsicHeight() + ((r2Var4.K2.getHeight() - org.telegram.ui.ActionBar.k6.b1.getIntrinsicHeight()) / 2) + r2Var4.J2);
                org.telegram.ui.ActionBar.k6.b1.draw(canvas3);
            }
            if (r2Var4.p3 != null && !r2Var4.Q()) {
                if (r2Var4.G0 != 0) {
                    TextPaint textPaint6 = org.telegram.ui.ActionBar.k6.G0;
                    int v07 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.n9, g6Var2);
                    textPaint6.linkColor = v07;
                    textPaint6.setColor(v07);
                } else if (r2Var4.i2 != null) {
                    TextPaint textPaint7 = org.telegram.ui.ActionBar.k6.G0;
                    int v08 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.j9, g6Var2);
                    textPaint7.linkColor = v08;
                    textPaint7.setColor(v08);
                } else {
                    TextPaint textPaint8 = org.telegram.ui.ActionBar.k6.G0;
                    int v09 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.m9, g6Var2);
                    textPaint8.linkColor = v09;
                    textPaint8.setColor(v09);
                }
                canvas3.save();
                canvas3.translate(r2Var4.o3, r2Var4.n3);
                try {
                    jh.k.f(canvas3, r2Var4.p3);
                    StaticLayout staticLayout4 = r2Var4.p3;
                    org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas3, staticLayout4, r2Var4.k3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, r2Var4.J(i20, staticLayout4.getPaint().getColor()));
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                canvas3.restore();
            }
            if (r2Var4.b3 != null) {
                if (r2Var4.G0 == 0) {
                    TextPaint textPaint9 = org.telegram.ui.ActionBar.k6.F0[r2Var4.B0];
                    int v010 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.g9, g6Var2);
                    textPaint9.linkColor = v010;
                    textPaint9.setColor(v010);
                } else if (r2Var4.d2 != null) {
                    TextPaint textPaint10 = org.telegram.ui.ActionBar.k6.F0[r2Var4.B0];
                    int v011 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.l9, g6Var2);
                    textPaint10.linkColor = v011;
                    textPaint10.setColor(v011);
                } else {
                    TextPaint textPaint11 = org.telegram.ui.ActionBar.k6.F0[r2Var4.B0];
                    int v012 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h9, g6Var2);
                    textPaint11.linkColor = v012;
                    textPaint11.setColor(v012);
                }
                float dp7 = AndroidUtilities.dp(14.0f);
                o2 o2Var5 = o2Var2;
                float f37 = o2Var5.m ? r2Var4.X2 - (o2Var5.l * dp7) : r2Var4.X2 + (o2Var5.l * dp7);
                if (((!z17 && !SharedConfig.useThreeLinesLayout) || r2Var4.Q()) && r2Var4.M()) {
                    f37 -= AndroidUtilities.dp(r2Var4.Q() ? 10.0f : 11.0f);
                }
                if (o2Var5.l != 1.0f) {
                    canvas3.save();
                    canvas3.translate(r2Var4.Y2, f37);
                    int alpha2 = r2Var4.b3.getPaint().getAlpha();
                    r2Var4.b3.getPaint().setAlpha((int) ((1.0f - o2Var5.l) * alpha2));
                    ArrayList arrayList = r2Var4.g3;
                    if (arrayList.isEmpty()) {
                        f27 = dp7;
                        rectF = rectF2;
                        g6Var4 = g6Var2;
                        a0Var4 = a0Var3;
                        f24 = 1.0f;
                        o2Var3 = o2Var5;
                        i25 = alpha2;
                        jh.k.f(canvas3, r2Var4.b3);
                        StaticLayout staticLayout5 = r2Var4.b3;
                        org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas3, staticLayout5, r2Var4.j3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, r2Var4.J(2, staticLayout5.getPaint().getColor()));
                    } else {
                        try {
                            canvas3.save();
                            jh.k.d(canvas3, arrayList);
                            jh.k.f(canvas3, r2Var4.b3);
                            try {
                                StaticLayout staticLayout6 = r2Var4.b3;
                                try {
                                    a0Var4 = a0Var3;
                                    i25 = alpha2;
                                    g6Var4 = g6Var2;
                                    f27 = dp7;
                                    f24 = 1.0f;
                                    rectF = rectF2;
                                    o2Var3 = o2Var5;
                                } catch (Exception e10) {
                                    e = e10;
                                    f27 = dp7;
                                    rectF = rectF2;
                                    g6Var4 = g6Var2;
                                    a0Var4 = a0Var3;
                                    o2Var3 = o2Var5;
                                    f24 = 1.0f;
                                    i25 = alpha2;
                                    FileLog.e(e);
                                    r2Var4.b3.getPaint().setAlpha(i25);
                                    canvas3.restore();
                                    canvas3.save();
                                    if (!o2Var3.m) {
                                    }
                                    if (!z17) {
                                        w10 -= AndroidUtilities.dp(r2Var4.Q() ? 10.0f : 11.0f);
                                        canvas3.translate(r2Var4.a3, w10);
                                        staticLayout2 = r2Var4.c3;
                                        if (staticLayout2 != null) {
                                            int alpha3 = staticLayout2.getPaint().getAlpha();
                                            r2Var4.c3.getPaint().setAlpha((int) (alpha3 * o2Var3.l));
                                            r2Var4.c3.draw(canvas3);
                                            r2Var4.c3.getPaint().setAlpha(alpha3);
                                        }
                                        canvas3.restore();
                                        if (r2Var4.c3 != null) {
                                            if (i24 < 0) {
                                            }
                                            t02 = org.telegram.ui.ActionBar.k6.t0(i24);
                                            if (t02 != null) {
                                            }
                                        }
                                        if (r2Var4.e3 != null) {
                                        }
                                        if (r2Var4.G0 == 0) {
                                        }
                                        float f38 = 12.5f;
                                        if (r2Var3.d4) {
                                        }
                                        g6Var3 = g6Var4;
                                        if (r2Var3.Y0) {
                                        }
                                        if (r2Var3.g1 != 2) {
                                        }
                                        i16 = 17;
                                        if (!r2Var3.c4) {
                                        }
                                        z12 = false;
                                        if (!r2Var3.v3) {
                                        }
                                        if (!LocaleController.isRTL) {
                                        }
                                        org.telegram.ui.ActionBar.k6.Z0.setAlpha((int) (r2Var3.u3 * 255.0f));
                                        a0.o(r2Var3.A3, r2Var3.z3, org.telegram.ui.ActionBar.k6.Z0);
                                        org.telegram.ui.ActionBar.k6.Z0.draw(canvas3);
                                        float f39 = r2Var3.L3.e;
                                        if (r2Var3.q3) {
                                        }
                                        r2Var = r2Var3;
                                        f18 = 1.0f;
                                        if (r2Var.O1 > 0) {
                                        }
                                        isVar = r2Var.q0;
                                        if (isVar != null) {
                                        }
                                        i22 = i19;
                                        r12 = z18;
                                        if (i22 != -1) {
                                        }
                                        z14 = r2Var.Y1;
                                        imageReceiver = r2Var.V1;
                                        if (z14) {
                                        }
                                        z15 = r2Var.x;
                                        j2Var = r2Var.r0;
                                        if (z15) {
                                            if (!r2Var.y) {
                                            }
                                            if (!r2Var.L0) {
                                                float centerX = j2Var.F.centerX() + AndroidUtilities.dp(20.33f);
                                                float centerY = j2Var.F.centerY() + AndroidUtilities.dp(19.0f);
                                                if (r2Var.A0 == null) {
                                                }
                                                lf.r.d(r2Var.A0, centerX, centerY, i16);
                                                canvas3.drawCircle(r2Var.A0.getBounds().exactCenterX(), r2Var.A0.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.k6.l0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, g6Var3)));
                                                r2Var.A0.draw(canvas3);
                                            }
                                        }
                                        if (r2Var.Y1) {
                                        }
                                        if (imageReceiver.getVisible()) {
                                            z13 = true;
                                        }
                                        if (r2Var.f0 > 0.0f) {
                                        }
                                        r2Var2 = r2Var;
                                        if (r2Var2.z0 != 0.0f) {
                                        }
                                        if (r2Var2.t1 != 0.0f) {
                                        }
                                        if (z10) {
                                            canvas3.save();
                                            canvas3.translate(0.0f, (-r2Var2.B3) - (r2Var2.n * r2Var2.f0));
                                            canvas3.clipRect(0.0f, (f18 - r2Var2.b2.J) * r2Var2.getMeasuredHeight(), r2Var2.getMeasuredWidth(), r2Var2.getMeasuredHeight());
                                            r2Var2.b2.c(canvas3, r12);
                                            canvas3.restore();
                                        }
                                        if (r2Var2.p2) {
                                        }
                                        f19 = 0.0f;
                                        if (r2Var2.q1 != f19) {
                                        }
                                        canvas2 = canvas;
                                        if (z24) {
                                        }
                                        z16 = r2Var2.v3;
                                        if (!z16) {
                                        }
                                        if (z16) {
                                        }
                                        z13 = true;
                                        if (r2Var2.j1) {
                                        }
                                    }
                                    w10 -= AndroidUtilities.dp(r2Var4.Q() ? 10.0f : 11.0f);
                                    canvas3.translate(r2Var4.a3, w10);
                                    staticLayout2 = r2Var4.c3;
                                    if (staticLayout2 != null) {
                                    }
                                    canvas3.restore();
                                    if (r2Var4.c3 != null) {
                                    }
                                    if (r2Var4.e3 != null) {
                                    }
                                    if (r2Var4.G0 == 0) {
                                    }
                                    float f382 = 12.5f;
                                    if (r2Var3.d4) {
                                    }
                                    g6Var3 = g6Var4;
                                    if (r2Var3.Y0) {
                                    }
                                    if (r2Var3.g1 != 2) {
                                    }
                                    i16 = 17;
                                    if (!r2Var3.c4) {
                                    }
                                    z12 = false;
                                    if (!r2Var3.v3) {
                                    }
                                    if (!LocaleController.isRTL) {
                                    }
                                    org.telegram.ui.ActionBar.k6.Z0.setAlpha((int) (r2Var3.u3 * 255.0f));
                                    a0.o(r2Var3.A3, r2Var3.z3, org.telegram.ui.ActionBar.k6.Z0);
                                    org.telegram.ui.ActionBar.k6.Z0.draw(canvas3);
                                    float f392 = r2Var3.L3.e;
                                    if (r2Var3.q3) {
                                    }
                                    r2Var = r2Var3;
                                    f18 = 1.0f;
                                    if (r2Var.O1 > 0) {
                                    }
                                    isVar = r2Var.q0;
                                    if (isVar != null) {
                                    }
                                    i22 = i19;
                                    r12 = z18;
                                    if (i22 != -1) {
                                    }
                                    z14 = r2Var.Y1;
                                    imageReceiver = r2Var.V1;
                                    if (z14) {
                                    }
                                    z15 = r2Var.x;
                                    j2Var = r2Var.r0;
                                    if (z15) {
                                    }
                                    if (r2Var.Y1) {
                                    }
                                    if (imageReceiver.getVisible()) {
                                    }
                                    if (r2Var.f0 > 0.0f) {
                                    }
                                    r2Var2 = r2Var;
                                    if (r2Var2.z0 != 0.0f) {
                                    }
                                    if (r2Var2.t1 != 0.0f) {
                                    }
                                    if (z10) {
                                    }
                                    if (r2Var2.p2) {
                                    }
                                    f19 = 0.0f;
                                    if (r2Var2.q1 != f19) {
                                    }
                                    canvas2 = canvas;
                                    if (z24) {
                                    }
                                    z16 = r2Var2.v3;
                                    if (!z16) {
                                    }
                                    if (z16) {
                                    }
                                    z13 = true;
                                    if (r2Var2.j1) {
                                    }
                                }
                                try {
                                    org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas3, staticLayout6, r2Var4.j3, -0.075f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, r2Var4.J(2, staticLayout6.getPaint().getColor()));
                                    canvas3.restore();
                                    for (int i32 = 0; i32 < arrayList.size(); i32++) {
                                        jh.k kVar = (jh.k) arrayList.get(i32);
                                        kVar.h(r2Var4.b3.getPaint().getColor());
                                        kVar.draw(canvas3);
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    FileLog.e(e);
                                    r2Var4.b3.getPaint().setAlpha(i25);
                                    canvas3.restore();
                                    canvas3.save();
                                    if (!o2Var3.m) {
                                    }
                                    if (!z17) {
                                    }
                                    w10 -= AndroidUtilities.dp(r2Var4.Q() ? 10.0f : 11.0f);
                                    canvas3.translate(r2Var4.a3, w10);
                                    staticLayout2 = r2Var4.c3;
                                    if (staticLayout2 != null) {
                                    }
                                    canvas3.restore();
                                    if (r2Var4.c3 != null) {
                                    }
                                    if (r2Var4.e3 != null) {
                                    }
                                    if (r2Var4.G0 == 0) {
                                    }
                                    float f3822 = 12.5f;
                                    if (r2Var3.d4) {
                                    }
                                    g6Var3 = g6Var4;
                                    if (r2Var3.Y0) {
                                    }
                                    if (r2Var3.g1 != 2) {
                                    }
                                    i16 = 17;
                                    if (!r2Var3.c4) {
                                    }
                                    z12 = false;
                                    if (!r2Var3.v3) {
                                    }
                                    if (!LocaleController.isRTL) {
                                    }
                                    org.telegram.ui.ActionBar.k6.Z0.setAlpha((int) (r2Var3.u3 * 255.0f));
                                    a0.o(r2Var3.A3, r2Var3.z3, org.telegram.ui.ActionBar.k6.Z0);
                                    org.telegram.ui.ActionBar.k6.Z0.draw(canvas3);
                                    float f3922 = r2Var3.L3.e;
                                    if (r2Var3.q3) {
                                    }
                                    r2Var = r2Var3;
                                    f18 = 1.0f;
                                    if (r2Var.O1 > 0) {
                                    }
                                    isVar = r2Var.q0;
                                    if (isVar != null) {
                                    }
                                    i22 = i19;
                                    r12 = z18;
                                    if (i22 != -1) {
                                    }
                                    z14 = r2Var.Y1;
                                    imageReceiver = r2Var.V1;
                                    if (z14) {
                                    }
                                    z15 = r2Var.x;
                                    j2Var = r2Var.r0;
                                    if (z15) {
                                    }
                                    if (r2Var.Y1) {
                                    }
                                    if (imageReceiver.getVisible()) {
                                    }
                                    if (r2Var.f0 > 0.0f) {
                                    }
                                    r2Var2 = r2Var;
                                    if (r2Var2.z0 != 0.0f) {
                                    }
                                    if (r2Var2.t1 != 0.0f) {
                                    }
                                    if (z10) {
                                    }
                                    if (r2Var2.p2) {
                                    }
                                    f19 = 0.0f;
                                    if (r2Var2.q1 != f19) {
                                    }
                                    canvas2 = canvas;
                                    if (z24) {
                                    }
                                    z16 = r2Var2.v3;
                                    if (!z16) {
                                    }
                                    if (z16) {
                                    }
                                    z13 = true;
                                    if (r2Var2.j1) {
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                                f27 = dp7;
                                rectF = rectF2;
                                g6Var4 = g6Var2;
                                a0Var4 = a0Var3;
                                f24 = 1.0f;
                                o2Var3 = o2Var5;
                                i25 = alpha2;
                                FileLog.e(e);
                                r2Var4.b3.getPaint().setAlpha(i25);
                                canvas3.restore();
                                canvas3.save();
                                if (!o2Var3.m) {
                                }
                                if (!z17) {
                                }
                                w10 -= AndroidUtilities.dp(r2Var4.Q() ? 10.0f : 11.0f);
                                canvas3.translate(r2Var4.a3, w10);
                                staticLayout2 = r2Var4.c3;
                                if (staticLayout2 != null) {
                                }
                                canvas3.restore();
                                if (r2Var4.c3 != null) {
                                }
                                if (r2Var4.e3 != null) {
                                }
                                if (r2Var4.G0 == 0) {
                                }
                                float f38222 = 12.5f;
                                if (r2Var3.d4) {
                                }
                                g6Var3 = g6Var4;
                                if (r2Var3.Y0) {
                                }
                                if (r2Var3.g1 != 2) {
                                }
                                i16 = 17;
                                if (!r2Var3.c4) {
                                }
                                z12 = false;
                                if (!r2Var3.v3) {
                                }
                                if (!LocaleController.isRTL) {
                                }
                                org.telegram.ui.ActionBar.k6.Z0.setAlpha((int) (r2Var3.u3 * 255.0f));
                                a0.o(r2Var3.A3, r2Var3.z3, org.telegram.ui.ActionBar.k6.Z0);
                                org.telegram.ui.ActionBar.k6.Z0.draw(canvas3);
                                float f39222 = r2Var3.L3.e;
                                if (r2Var3.q3) {
                                }
                                r2Var = r2Var3;
                                f18 = 1.0f;
                                if (r2Var.O1 > 0) {
                                }
                                isVar = r2Var.q0;
                                if (isVar != null) {
                                }
                                i22 = i19;
                                r12 = z18;
                                if (i22 != -1) {
                                }
                                z14 = r2Var.Y1;
                                imageReceiver = r2Var.V1;
                                if (z14) {
                                }
                                z15 = r2Var.x;
                                j2Var = r2Var.r0;
                                if (z15) {
                                }
                                if (r2Var.Y1) {
                                }
                                if (imageReceiver.getVisible()) {
                                }
                                if (r2Var.f0 > 0.0f) {
                                }
                                r2Var2 = r2Var;
                                if (r2Var2.z0 != 0.0f) {
                                }
                                if (r2Var2.t1 != 0.0f) {
                                }
                                if (z10) {
                                }
                                if (r2Var2.p2) {
                                }
                                f19 = 0.0f;
                                if (r2Var2.q1 != f19) {
                                }
                                canvas2 = canvas;
                                if (z24) {
                                }
                                z16 = r2Var2.v3;
                                if (!z16) {
                                }
                                if (z16) {
                                }
                                z13 = true;
                                if (r2Var2.j1) {
                                }
                            }
                        } catch (Exception e13) {
                            e = e13;
                            f27 = dp7;
                        }
                    }
                    r2Var4.b3.getPaint().setAlpha(i25);
                    canvas3.restore();
                } else {
                    f27 = dp7;
                    rectF = rectF2;
                    g6Var4 = g6Var2;
                    a0Var4 = a0Var3;
                    f24 = 1.0f;
                    o2Var3 = o2Var5;
                }
                canvas3.save();
                w10 = !o2Var3.m ? e2.c.w(f24, o2Var3.l, f27, r2Var4.X2) : yh.c(f24, o2Var3.l, f27, r2Var4.X2);
                if (((!z17 && !SharedConfig.useThreeLinesLayout) || r2Var4.Q()) && r2Var4.M()) {
                    w10 -= AndroidUtilities.dp(r2Var4.Q() ? 10.0f : 11.0f);
                }
                canvas3.translate(r2Var4.a3, w10);
                staticLayout2 = r2Var4.c3;
                if (staticLayout2 != null && o2Var3.l > 0.0f) {
                    int alpha32 = staticLayout2.getPaint().getAlpha();
                    r2Var4.c3.getPaint().setAlpha((int) (alpha32 * o2Var3.l));
                    r2Var4.c3.draw(canvas3);
                    r2Var4.c3.getPaint().setAlpha(alpha32);
                }
                canvas3.restore();
                if (r2Var4.c3 != null && ((i24 = r2Var4.g2) >= 0 || (o2Var3.l > 0.0f && o2Var3.n >= 0))) {
                    if (i24 < 0) {
                        i24 = o2Var3.n;
                    }
                    t02 = org.telegram.ui.ActionBar.k6.t0(i24);
                    if (t02 != null) {
                        canvas3.save();
                        t02.b(i0.a.k(org.telegram.ui.ActionBar.k6.u0(org.telegram.ui.ActionBar.k6.p9), (int) (Color.alpha(r4) * o2Var3.l)));
                        float w11 = o2Var3.m ? e2.c.w(f24, o2Var3.l, f27, r2Var4.X2) : yh.c(f24, o2Var3.l, f27, r2Var4.X2);
                        if (((!z17 && !SharedConfig.useThreeLinesLayout) || r2Var4.Q()) && r2Var4.M()) {
                            w11 -= AndroidUtilities.dp(r2Var4.Q() ? 10.0f : 11.0f);
                        }
                        if (i24 == 1 || i24 == 4) {
                            canvas3.translate(r2Var4.v4, w11 + (i24 == 1 ? AndroidUtilities.dp(f24) : 0));
                        } else {
                            canvas3.translate(r2Var4.v4, ((AndroidUtilities.dp(18.0f) - t02.getIntrinsicHeight()) / f22) + w11);
                        }
                        t02.draw(canvas3);
                        r2Var4.invalidate();
                        canvas3.restore();
                    }
                }
            } else {
                rectF = rectF2;
                g6Var4 = g6Var2;
                a0Var4 = a0Var3;
                o2Var3 = o2Var2;
                f24 = 1.0f;
            }
            if (r2Var4.e3 != null) {
                canvas3.save();
                if (r2Var4.V == null) {
                    r2Var4.V = new Paint(1);
                }
                if (r2Var4.W == null) {
                    xc xcVar = new xc(r2Var4);
                    r2Var4.W = xcVar;
                    z22 = false;
                    final boolean z28 = false ? 1 : 0;
                    xcVar.e(new Runnable(r2Var4) { // from class: org.telegram.ui.Cells.h2
                        public final /* synthetic */ r2 b;

                        {
                            this.b = r2Var4;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (z28) {
                                case 0:
                                    r2 r2Var5 = this.b;
                                    n2 n2Var = r2Var5.a0;
                                    if (n2Var != null) {
                                        n2Var.d(r2Var5);
                                        break;
                                    }
                                    break;
                                default:
                                    r2 r2Var6 = this.b;
                                    n2 n2Var2 = r2Var6.a0;
                                    if (n2Var2 != null) {
                                        n2Var2.a(r2Var6);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    xc xcVar2 = r2Var4.W;
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
                                    n2 n2Var = r2Var5.a0;
                                    if (n2Var != null) {
                                        n2Var.d(r2Var5);
                                        break;
                                    }
                                    break;
                                default:
                                    r2 r2Var6 = this.b;
                                    n2 n2Var2 = r2Var6.a0;
                                    if (n2Var2 != null) {
                                        n2Var2.a(r2Var6);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    xcVar2.l = true;
                    xcVar2.j = runnable;
                } else {
                    z22 = false;
                }
                if (r2Var4.c0 && r2Var4.F4 != 0 && ((i23 = r2Var4.g1) == 0 || i23 == 7 || i23 == 8)) {
                    r2Var4.W.d(i0.a.k(r2Var4.U.getColor(), org.telegram.ui.ActionBar.k6.e1() ? 36 : 26));
                    xc xcVar3 = r2Var4.W;
                    xcVar3.i = z22;
                    xcVar3.c = z22 ? 1 : 0;
                    int i34 = r2Var4.F4;
                    if (i34 != 0 && i34 > 0) {
                        float f40 = r2Var4.X2;
                        if (((!z17 && !SharedConfig.useThreeLinesLayout) || r2Var4.Q()) && r2Var4.M()) {
                            f40 -= AndroidUtilities.dp(r2Var4.Q() ? 10.0f : 11.0f);
                        }
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        float primaryHorizontal = r2Var4.b3.getPrimaryHorizontal(z22 ? 1 : 0) + AndroidUtilities.dp(f22) + r2Var4.Y2;
                        float f41 = r2Var4.Y2;
                        StaticLayout staticLayout7 = r2Var4.b3;
                        rectF3.set(primaryHorizontal, f40, (staticLayout7.getPrimaryHorizontal(Math.min(staticLayout7.getText().length(), r2Var4.F4)) + f41) - AndroidUtilities.dp(3.0f), r2Var4.d3 - AndroidUtilities.dp(4.0f));
                        rectF3.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
                        if (rectF3.right > rectF3.left) {
                            r2Var4.W.a(rectF3);
                        }
                    }
                    float lineLeft = r2Var4.e3.getLineLeft(z22 ? 1 : 0);
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.set(r2Var4.Z2 + lineLeft + AndroidUtilities.dp(f22), AndroidUtilities.dp(f22) + r2Var4.d3, r2Var4.e3.getLineWidth(z22 ? 1 : 0) + r2Var4.Z2 + lineLeft + AndroidUtilities.dp(12.0f), r2Var4.e3.getHeight() + r2Var4.d3);
                    rectF4.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(3.0f));
                    r2Var4.W.a(rectF4);
                    xc xcVar4 = r2Var4.W;
                    xcVar4.c(canvas3, xcVar4.g);
                    z zVar = xcVar4.e;
                    if (zVar != null) {
                        zVar.draw(canvas3);
                    }
                    org.telegram.ui.ActionBar.k6.t1.setAlpha(125);
                    a0.p(org.telegram.ui.ActionBar.k6.t1, rectF4.right - AndroidUtilities.dp(18.0f), e2.c.x(rectF4.height(), org.telegram.ui.ActionBar.k6.t1.getIntrinsicHeight(), 2.0f, rectF4.top));
                    org.telegram.ui.ActionBar.k6.t1.draw(canvas3);
                }
                canvas3.translate(r2Var4.Z2, r2Var4.d3);
                ArrayList arrayList2 = r2Var4.i3;
                if (arrayList2.isEmpty()) {
                    jh.k.f(canvas3, r2Var4.e3);
                    StaticLayout staticLayout8 = r2Var4.e3;
                    org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas3, staticLayout8, r2Var4.l3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, r2Var4.J(3, staticLayout8.getPaint().getColor()));
                } else {
                    try {
                        canvas3.save();
                        jh.k.d(canvas3, arrayList2);
                        jh.k.f(canvas3, r2Var4.e3);
                        StaticLayout staticLayout9 = r2Var4.e3;
                        org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas3, staticLayout9, r2Var4.l3, -0.075f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, r2Var4.J(3, staticLayout9.getPaint().getColor()));
                        canvas3.restore();
                        for (int i35 = 0; i35 < arrayList2.size(); i35++) {
                            jh.k kVar2 = (jh.k) arrayList2.get(i35);
                            kVar2.h(r2Var4.e3.getPaint().getColor());
                            kVar2.draw(canvas3);
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
            if (r2Var4.G0 == 0) {
                int i36 = (r2Var4.P2 ? 1 : 0) + (r2Var4.N2 ? 2 : 0) + (r2Var4.O2 ? 4 : 0);
                int i37 = r2Var4.q4;
                if (i37 >= 0 && i37 != i36 && !r2Var4.s4) {
                    r2Var4.A(i37, i36);
                }
                boolean z29 = r2Var4.s4;
                if (z29) {
                    i36 = r2Var4.o4;
                }
                boolean z30 = (i36 & 1) != 0;
                boolean z31 = (i36 & 2) != 0;
                boolean z32 = (i36 & 4) != 0;
                if (z29) {
                    int i38 = r2Var4.p4;
                    boolean z33 = (i38 & 1) != 0;
                    boolean z34 = (i38 & 2) != 0;
                    if ((i38 & 4) != 0) {
                        z20 = z32;
                        z21 = true;
                    } else {
                        z20 = z32;
                        z21 = false;
                    }
                    if (z30 || z33 || !z21 || z34 || !z31 || !z20) {
                        boolean z35 = z31;
                        boolean z36 = z34;
                        canvas3 = canvas;
                        r2Var4.C(canvas3, z33, z36, z21, false, f24 - r2Var4.r4);
                        r2Var4.C(canvas3, z30, z35, z20, false, r2Var4.r4);
                        r2Var3 = this;
                        r2Var3.q4 = (r2Var3.P2 ? 1 : 0) + (!r2Var3.N2 ? 2 : 0) + (!r2Var3.O2 ? 4 : 0);
                    } else {
                        canvas3 = canvas;
                        r2Var4.C(canvas3, z30, z31, z20, true, r2Var4.r4);
                    }
                } else {
                    r2Var4 = this;
                    canvas3 = canvas;
                    r2Var4.C(canvas3, z30, z31, z32, false, 1.0f);
                }
                r2Var3 = r2Var4;
                r2Var3.q4 = (r2Var3.P2 ? 1 : 0) + (!r2Var3.N2 ? 2 : 0) + (!r2Var3.O2 ? 4 : 0);
            } else {
                canvas3 = canvas;
                r2Var3 = r2Var4;
            }
            float f382222 = 12.5f;
            if (r2Var3.d4) {
                int dp8 = AndroidUtilities.dp((z17 || SharedConfig.useThreeLinesLayout) ? 12.5f : 15.5f);
                if (((!z17 && !SharedConfig.useThreeLinesLayout) || r2Var3.Q()) && r2Var3.M()) {
                    dp8 -= AndroidUtilities.dp(9.0f);
                }
                org.telegram.ui.Components.j5 j5Var = r2Var3.h4;
                if (j5Var != null) {
                    j5Var.setBounds(r2Var3.u2 - AndroidUtilities.dp(19.0f), AndroidUtilities.dp(-1.0f) + dp8, r2Var3.u2 - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f) + dp8);
                    g6Var3 = g6Var4;
                    j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.z9, g6Var3)));
                    j5Var.draw(canvas3);
                    boolean z37 = !r2Var3.Y0 || r2Var3.W0 || r2Var3.N0;
                    if (r2Var3.g1 != 2 || ((!z37 && r2Var3.Z0 <= 0.0f) || r2Var3.c4 || r2Var3.i4 != 0)) {
                        i16 = 17;
                    } else {
                        if (z37) {
                            float f42 = r2Var3.Z0;
                            if (f42 != f24) {
                                float f43 = f42 + 0.10666667f;
                                r2Var3.Z0 = f43;
                                if (f43 > f24) {
                                    r2Var3.Z0 = f24;
                                } else {
                                    r2Var3.invalidate();
                                }
                                float dp9 = (!r2Var3.e4 ? r2Var3.F2 : r2Var3.E2) - AndroidUtilities.dp((!z17 || SharedConfig.useThreeLinesLayout) ? 0.0f : 1.0f);
                                float dp10 = AndroidUtilities.dp(!SharedConfig.useThreeLinesLayout ? 13.5f : 17.5f);
                                if (((!z17 && !SharedConfig.useThreeLinesLayout) || r2Var3.Q()) && r2Var3.M()) {
                                    dp10 -= AndroidUtilities.dp(r2Var3.Q() ? 8.0f : 9.0f);
                                }
                                a0.p(org.telegram.ui.ActionBar.k6.c1, dp9, dp10);
                                a0.p(org.telegram.ui.ActionBar.k6.d1, dp9, dp10);
                                i16 = 17;
                                lf.r.d(org.telegram.ui.ActionBar.k6.e1, org.telegram.ui.ActionBar.k6.c1.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.c1.getBounds().exactCenterY(), 17);
                                if (r2Var3.Z0 != f24) {
                                    canvas3.save();
                                    float f44 = r2Var3.Z0;
                                    canvas3.scale(f44, f44, org.telegram.ui.ActionBar.k6.c1.getBounds().centerX(), org.telegram.ui.ActionBar.k6.c1.getBounds().centerY());
                                    if (r2Var3.N0) {
                                        org.telegram.ui.ActionBar.k6.e1.setAlpha((int) (r2Var3.Z0 * 255.0f));
                                        org.telegram.ui.ActionBar.k6.e1.draw(canvas3);
                                        org.telegram.ui.ActionBar.k6.e1.setAlpha(255);
                                    } else if (r2Var3.Y0) {
                                        org.telegram.ui.ActionBar.k6.d1.setAlpha((int) (r2Var3.Z0 * 255.0f));
                                        org.telegram.ui.ActionBar.k6.d1.draw(canvas3);
                                        org.telegram.ui.ActionBar.k6.d1.setAlpha(255);
                                    } else {
                                        org.telegram.ui.ActionBar.k6.c1.setAlpha((int) (r2Var3.Z0 * 255.0f));
                                        org.telegram.ui.ActionBar.k6.c1.draw(canvas3);
                                        org.telegram.ui.ActionBar.k6.c1.setAlpha(255);
                                    }
                                    canvas3.restore();
                                } else if (r2Var3.N0) {
                                    org.telegram.ui.ActionBar.k6.e1.draw(canvas3);
                                } else if (r2Var3.Y0) {
                                    org.telegram.ui.ActionBar.k6.d1.draw(canvas3);
                                } else {
                                    org.telegram.ui.ActionBar.k6.c1.draw(canvas3);
                                }
                            }
                        }
                        if (!z37) {
                            float f45 = r2Var3.Z0;
                            if (f45 != 0.0f) {
                                float f46 = f45 - 0.10666667f;
                                r2Var3.Z0 = f46;
                                if (f46 < 0.0f) {
                                    r2Var3.Z0 = 0.0f;
                                } else {
                                    r2Var3.invalidate();
                                }
                            }
                        }
                        float dp92 = (!r2Var3.e4 ? r2Var3.F2 : r2Var3.E2) - AndroidUtilities.dp((!z17 || SharedConfig.useThreeLinesLayout) ? 0.0f : 1.0f);
                        float dp102 = AndroidUtilities.dp(!SharedConfig.useThreeLinesLayout ? 13.5f : 17.5f);
                        if (!z17) {
                            dp102 -= AndroidUtilities.dp(r2Var3.Q() ? 8.0f : 9.0f);
                            a0.p(org.telegram.ui.ActionBar.k6.c1, dp92, dp102);
                            a0.p(org.telegram.ui.ActionBar.k6.d1, dp92, dp102);
                            i16 = 17;
                            lf.r.d(org.telegram.ui.ActionBar.k6.e1, org.telegram.ui.ActionBar.k6.c1.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.c1.getBounds().exactCenterY(), 17);
                            if (r2Var3.Z0 != f24) {
                            }
                        }
                        dp102 -= AndroidUtilities.dp(r2Var3.Q() ? 8.0f : 9.0f);
                        a0.p(org.telegram.ui.ActionBar.k6.c1, dp92, dp102);
                        a0.p(org.telegram.ui.ActionBar.k6.d1, dp92, dp102);
                        i16 = 17;
                        lf.r.d(org.telegram.ui.ActionBar.k6.e1, org.telegram.ui.ActionBar.k6.c1.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.c1.getBounds().exactCenterY(), 17);
                        if (r2Var3.Z0 != f24) {
                        }
                    }
                    if (!r2Var3.c4) {
                        float dp11 = AndroidUtilities.dp((z17 || SharedConfig.useThreeLinesLayout) ? 13.5f : 16.5f);
                        if (((!z17 && !SharedConfig.useThreeLinesLayout) || r2Var3.Q()) && r2Var3.M()) {
                            dp11 -= AndroidUtilities.dp(9.0f);
                        }
                        a0.p(org.telegram.ui.ActionBar.k6.f1, r2Var3.E2 - AndroidUtilities.dp(f24), dp11);
                        a0.p(org.telegram.ui.ActionBar.k6.i1, r2Var3.E2 - AndroidUtilities.dp(f24), dp11);
                        org.telegram.ui.ActionBar.k6.f1.draw(canvas3);
                        org.telegram.ui.ActionBar.k6.i1.draw(canvas3);
                        h0Var2 = h0Var;
                    } else if (r2Var3.e4) {
                        int dp12 = AndroidUtilities.dp((z17 || SharedConfig.useThreeLinesLayout) ? 12.5f : 15.5f);
                        if (((!z17 && !SharedConfig.useThreeLinesLayout) || r2Var3.Q()) && r2Var3.M()) {
                            dp12 -= AndroidUtilities.dp(9.0f);
                        }
                        org.telegram.ui.Components.j5 j5Var2 = r2Var3.g4;
                        if (j5Var2 != null) {
                            h0Var2 = h0Var;
                            h0Var2.setTranslationX((f31 + r2Var3.E2) - AndroidUtilities.dp(2.0f));
                            h0Var2.setTranslationY((f17 + dp12) - AndroidUtilities.dp(4.0f));
                            if (r2Var3.f0 > 0.0f) {
                                j5Var2.setBounds(r2Var3.E2 - AndroidUtilities.dp(2.0f), dp12 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(20.0f) + r2Var3.E2, AndroidUtilities.dp(22.0f) + (dp12 - AndroidUtilities.dp(4.0f)));
                                j5Var2.draw(canvas3);
                                z19 = false;
                            } else {
                                z19 = true;
                            }
                            j5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.z9, g6Var3)));
                            z12 = z19;
                            if (!r2Var3.v3 || r2Var3.u3 != 0.0f) {
                                if (!LocaleController.isRTL) {
                                    Paint paintReorderGradient = r2Var3.getPaintReorderGradient();
                                    paintReorderGradient.setAlpha((int) (r2Var3.u3 * 255.0f));
                                    canvas3.save();
                                    canvas3.translate(r2Var3.A3 - AndroidUtilities.dp(f23), r2Var3.z3);
                                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.y3.z(24.0f, r2Var3.A3, r2Var3.getMeasuredWidth()), AndroidUtilities.dp(24.0f), paintReorderGradient);
                                    canvas3 = canvas;
                                    canvas3.restore();
                                }
                                org.telegram.ui.ActionBar.k6.Z0.setAlpha((int) (r2Var3.u3 * 255.0f));
                                a0.o(r2Var3.A3, r2Var3.z3, org.telegram.ui.ActionBar.k6.Z0);
                                org.telegram.ui.ActionBar.k6.Z0.draw(canvas3);
                            }
                            float f392222 = r2Var3.L3.e;
                            if (r2Var3.q3) {
                                org.telegram.ui.ActionBar.k6.Y0.setAlpha((int) ((f24 - r2Var3.u3) * 255.0f));
                                RectF rectF5 = rectF;
                                rectF5.set(r2Var3.s3, r2Var3.r3, AndroidUtilities.dp(20.666f) + r0, AndroidUtilities.dp(20.666f) + r2Var3.r3);
                                float f47 = AndroidUtilities.density * 10.5f;
                                canvas3.drawRoundRect(rectF5, f47, f47, org.telegram.ui.ActionBar.k6.x0);
                                a0.o(AndroidUtilities.dp(4.5f) + r2Var3.s3, AndroidUtilities.dp(5.0f) + r2Var3.r3, org.telegram.ui.ActionBar.k6.Y0);
                                org.telegram.ui.ActionBar.k6.Y0.draw(canvas3);
                            } else {
                                RectF rectF6 = rectF;
                                if (((r2Var3.D3 || r2Var3.U3) && r2Var3.E3) || r2Var3.O3 != f24 || r2Var3.V3 || r2Var3.P3 != f24 || r2Var3.W3 || f392222 > 0.0f) {
                                    boolean N = r2Var3.N();
                                    f18 = 1.0f;
                                    canvas3 = canvas;
                                    D(canvas3, N, r2Var3.F3, r2Var3.G3, r2Var3.J3, 1.0f, false);
                                    r2Var = this;
                                    if (r2Var.U3) {
                                        org.telegram.ui.ActionBar.k6.w0.setAlpha((int) ((1.0f - r2Var.u3) * 255.0f));
                                        if (r2Var.b4 != null) {
                                            rectF6.set(r2Var.X3, r2Var.F3, AndroidUtilities.dp(12.666f) + r1 + r2Var.a4, AndroidUtilities.dp(20.666f) + r2Var.F3);
                                            canvas3.drawRoundRect(rectF6, rectF6.height() / 2.0f, rectF6.height() / 2.0f, (!N || r2Var.h1 == 0) ? org.telegram.ui.ActionBar.k6.w0 : org.telegram.ui.ActionBar.k6.y0);
                                            org.telegram.ui.ActionBar.k6.M0.setAlpha((int) ((1.0f - r2Var.u3) * 255.0f));
                                            canvas3.save();
                                            canvas3.translate(AndroidUtilities.dp(6.333f) + r2Var.X3, AndroidUtilities.dp(4.0f) + r2Var.F3);
                                            r2Var.b4.draw(canvas3);
                                            canvas3.restore();
                                        } else {
                                            Drawable drawable2 = org.telegram.ui.ActionBar.k6.m1;
                                            drawable2.setAlpha((int) ((1.0f - r2Var.u3) * 255.0f));
                                            lf.r.d(drawable2, AndroidUtilities.dp(10.333f) + r2Var.X3, AndroidUtilities.dp(10.333f) + r2Var.F3, i16);
                                            drawable2.draw(canvas3);
                                        }
                                    }
                                    if (r2Var.V3 || r2Var.P3 != 1.0f) {
                                        f25 = 10.333f;
                                        rectF6.set(r2Var.Y3, r2Var.F3, AndroidUtilities.dp(20.666f) + r1, AndroidUtilities.dp(20.666f) + r2Var.F3);
                                        float f48 = r2Var.P3;
                                        if (f48 == 1.0f) {
                                            f48 = 1.0f;
                                        } else if (!r2Var.V3) {
                                            f48 = 1.0f - f48;
                                        }
                                        Drawable drawable3 = N ? org.telegram.ui.ActionBar.k6.q1 : org.telegram.ui.ActionBar.k6.n1;
                                        drawable3.setAlpha((int) ((1.0f - r2Var.u3) * 255.0f));
                                        lf.r.d(drawable3, AndroidUtilities.dp(10.333f) + r1, AndroidUtilities.dp(10.333f) + r2Var.F3, i16);
                                        lf.r.b(canvas3, drawable3, f48);
                                    } else {
                                        f25 = 10.333f;
                                    }
                                    if ((r2Var.W3 || f392222 > 0.0f) && f392222 != 0.0f) {
                                        rectF6.set(r2Var.Z3, r2Var.F3, AndroidUtilities.dp(20.666f) + r1, AndroidUtilities.dp(20.666f) + r2Var.F3);
                                        Drawable drawable4 = N ? org.telegram.ui.ActionBar.k6.r1 : org.telegram.ui.ActionBar.k6.o1;
                                        drawable4.setAlpha((int) ((1.0f - r2Var.u3) * 255.0f));
                                        lf.r.d(drawable4, AndroidUtilities.dp(f25) + r1, AndroidUtilities.dp(f25) + r2Var.F3, i16);
                                        lf.r.b(canvas3, drawable4, f392222);
                                    }
                                    if (r2Var.O1 > 0) {
                                        float f49 = o2Var3.l;
                                        if (f49 != f18) {
                                            if (f49 > 0.0f) {
                                                canvas.saveLayerAlpha(0.0f, 0.0f, r2Var.getWidth(), r2Var.getHeight(), (int) ((f18 - f49) * 255.0f), 31);
                                                canvas3 = canvas;
                                                if (o2Var3.m) {
                                                    dp = -AndroidUtilities.dp(14.0f);
                                                    f26 = o2Var3.l;
                                                } else {
                                                    dp = AndroidUtilities.dp(14.0f);
                                                    f26 = o2Var3.l;
                                                }
                                                canvas3.translate(0.0f, dp * f26);
                                            }
                                            int i39 = 0;
                                            while (i39 < r2Var.O1) {
                                                if (r2Var.R1[i39]) {
                                                    if (r2Var.Q1 == null) {
                                                        Paint paint3 = new Paint(1);
                                                        r2Var.Q1 = paint3;
                                                        paint3.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                                        r2Var.Q1.setColor(z18 ? 1 : 0);
                                                    }
                                                    RectF rectF7 = AndroidUtilities.rectTmp;
                                                    ImageReceiver[] imageReceiverArr = r2Var.S1;
                                                    rectF7.set(imageReceiverArr[i39].getImageX(), imageReceiverArr[i39].getImageY(), imageReceiverArr[i39].getImageX2(), imageReceiverArr[i39].getImageY2());
                                                    imageReceiverArr[i39].draw(canvas3);
                                                    if (r2Var.U1[i39]) {
                                                        Path path = r2Var.s0;
                                                        if (path == null) {
                                                            r2Var.s0 = new Path();
                                                        } else {
                                                            path.rewind();
                                                        }
                                                        r2Var.s0.addRoundRect(rectF7, imageReceiverArr[i39].getRoundRadius()[z18 ? 1 : 0], imageReceiverArr[i39].getRoundRadius()[1], Path.Direction.CW);
                                                        canvas3.save();
                                                        canvas3.clipPath(r2Var.s0);
                                                        if (r2Var.t0 == null) {
                                                            r2Var.t0 = new jh.k();
                                                        }
                                                        r2Var.t0.h(i0.a.k(-1, (int) (Color.alpha(i21) * 0.325f)));
                                                        r2Var.t0.setBounds((int) imageReceiverArr[i39].getImageX(), (int) imageReceiverArr[i39].getImageY(), (int) imageReceiverArr[i39].getImageX2(), (int) imageReceiverArr[i39].getImageY2());
                                                        r2Var.t0.draw(canvas3);
                                                        r2Var.invalidate();
                                                        canvas3.restore();
                                                    }
                                                    if (r2Var.T1[i39]) {
                                                        a0.o((int) (imageReceiverArr[i39].getCenterX() - (org.telegram.ui.ActionBar.k6.U0.getIntrinsicWidth() / 2)), (int) (imageReceiverArr[i39].getCenterY() - (org.telegram.ui.ActionBar.k6.U0.getIntrinsicHeight() / 2)), org.telegram.ui.ActionBar.k6.U0);
                                                        org.telegram.ui.ActionBar.k6.U0.draw(canvas3);
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
                                    isVar = r2Var.q0;
                                    if (isVar != null && !isVar.b()) {
                                        canvas3.save();
                                        canvas3.translate(r2Var.V2, (r2Var.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (r2Var.p2 ? 1 : 0));
                                        r2Var.q0.a(canvas3, r2Var.W2 - r2Var.V2);
                                        canvas3.restore();
                                    }
                                    i22 = i19;
                                    r12 = z18;
                                    if (i22 != -1) {
                                        canvas3.restoreToCount(i22);
                                        r12 = z18;
                                    }
                                } else {
                                    if (r2Var3.B1) {
                                        canvas3.save();
                                        float a2 = r2Var3.C1.a(0.05f);
                                        RectF rectF8 = r2Var3.E1;
                                        canvas3.scale(a2, a2, rectF8.centerX(), rectF8.centerY());
                                        r2Var3.D1.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var3));
                                        canvas3.drawRoundRect(rectF8, rectF8.height() / 2.0f, rectF8.height() / 2.0f, r2Var3.D1);
                                        k01 k01Var = r2Var3.F1;
                                        if (k01Var != null) {
                                            k01Var.c(rectF8.left + AndroidUtilities.dp(13.0f), rectF8.centerY(), 1.0f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Sh, g6Var3), canvas);
                                        }
                                        canvas.restore();
                                    }
                                    canvas3 = canvas;
                                }
                            }
                            r2Var = r2Var3;
                            f18 = 1.0f;
                            if (r2Var.O1 > 0) {
                            }
                            isVar = r2Var.q0;
                            if (isVar != null) {
                                canvas3.save();
                                canvas3.translate(r2Var.V2, (r2Var.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (r2Var.p2 ? 1 : 0));
                                r2Var.q0.a(canvas3, r2Var.W2 - r2Var.V2);
                                canvas3.restore();
                            }
                            i22 = i19;
                            r12 = z18;
                            if (i22 != -1) {
                            }
                        } else {
                            h0Var2 = h0Var;
                            Drawable drawable5 = fg.q1.d().e;
                            int dp13 = r2Var3.E2 - AndroidUtilities.dp(f24);
                            if (!z17 && !SharedConfig.useThreeLinesLayout) {
                                f382222 = 15.5f;
                            }
                            a0.o(dp13, AndroidUtilities.dp(f382222), drawable5);
                            drawable5.draw(canvas3);
                        }
                    } else {
                        h0Var2 = h0Var;
                        if (r2Var3.i4 != 0) {
                            int dp14 = AndroidUtilities.dp((z17 || SharedConfig.useThreeLinesLayout) ? 12.0f : 15.0f);
                            if (((!z17 && !SharedConfig.useThreeLinesLayout) || r2Var3.Q()) && r2Var3.M()) {
                                dp14 -= AndroidUtilities.dp(9.0f);
                            }
                            a0.o(r2Var3.E2, dp14, r2Var3.i4 == 1 ? org.telegram.ui.ActionBar.k6.g1 : org.telegram.ui.ActionBar.k6.h1);
                            (r2Var3.i4 == 1 ? org.telegram.ui.ActionBar.k6.g1 : org.telegram.ui.ActionBar.k6.h1).draw(canvas3);
                        }
                    }
                    z12 = false;
                    if (!r2Var3.v3) {
                    }
                    if (!LocaleController.isRTL) {
                    }
                    org.telegram.ui.ActionBar.k6.Z0.setAlpha((int) (r2Var3.u3 * 255.0f));
                    a0.o(r2Var3.A3, r2Var3.z3, org.telegram.ui.ActionBar.k6.Z0);
                    org.telegram.ui.ActionBar.k6.Z0.draw(canvas3);
                    float f3922222 = r2Var3.L3.e;
                    if (r2Var3.q3) {
                    }
                    r2Var = r2Var3;
                    f18 = 1.0f;
                    if (r2Var.O1 > 0) {
                    }
                    isVar = r2Var.q0;
                    if (isVar != null) {
                    }
                    i22 = i19;
                    r12 = z18;
                    if (i22 != -1) {
                    }
                }
            }
            g6Var3 = g6Var4;
            if (r2Var3.Y0) {
            }
            if (r2Var3.g1 != 2) {
            }
            i16 = 17;
            if (!r2Var3.c4) {
            }
            z12 = false;
            if (!r2Var3.v3) {
            }
            if (!LocaleController.isRTL) {
            }
            org.telegram.ui.ActionBar.k6.Z0.setAlpha((int) (r2Var3.u3 * 255.0f));
            a0.o(r2Var3.A3, r2Var3.z3, org.telegram.ui.ActionBar.k6.Z0);
            org.telegram.ui.ActionBar.k6.Z0.draw(canvas3);
            float f39222222 = r2Var3.L3.e;
            if (r2Var3.q3) {
            }
            r2Var = r2Var3;
            f18 = 1.0f;
            if (r2Var.O1 > 0) {
            }
            isVar = r2Var.q0;
            if (isVar != null) {
            }
            i22 = i19;
            r12 = z18;
            if (i22 != -1) {
            }
        } else {
            r2Var = r2Var4;
            g6Var3 = g6Var2;
            a0Var4 = a0Var3;
            h0Var2 = h0Var;
            i16 = 17;
            r12 = 0;
            f18 = 1.0f;
            z12 = false;
            z13 = false;
        }
        z14 = r2Var.Y1;
        imageReceiver = r2Var.V1;
        if (z14) {
            canvas3.save();
            float interpolation2 = a0Var4.getInterpolation(r2Var.Z1 / 170.0f) + f18;
            canvas3.scale(interpolation2, interpolation2, imageReceiver.getCenterX(), imageReceiver.getCenterY());
        }
        z15 = r2Var.x;
        j2Var = r2Var.r0;
        if (z15 && (!r2Var.M || (tL_forumTopic2 = r2Var.K) == null || tL_forumTopic2.id != 1 || (ri0Var = r2Var.b2) == null || !ri0Var.X || ri0Var.Y)) {
            if (!r2Var.y) {
                if (r2Var.W1 == null) {
                    r2Var.W1 = new ve0();
                }
                r2Var.W1.a((int) j2Var.F.centerX(), (int) j2Var.F.centerY(), (int) (j2Var.F.width() / 2.0f));
                canvas3.save();
                canvas3.clipPath(r2Var.W1);
                imageReceiver.setImageCoords(j2Var.F);
                imageReceiver.draw(canvas3);
                canvas3.restore();
            } else if (r2Var.B) {
                lf.r.f(imageReceiver, AndroidUtilities.dpf2(f18) + j2Var.F.centerX(), j2Var.F.centerY(), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
                lf.r.a(canvas3, org.telegram.ui.ActionBar.k6.S0, imageReceiver.getCenterX(), imageReceiver.getCenterY(), AndroidUtilities.dp(48.0f));
                imageReceiver.draw(canvas3);
            } else {
                boolean z38 = r2Var.C;
                j2Var.r = z38 || r2Var.G0 != 0;
                int i40 = j2Var.z;
                if (z38) {
                    j2Var.z = 1;
                }
                oh.m7.h(r2Var.E0, canvas3, imageReceiver, j2Var);
                if (j2Var.w) {
                    r2Var.x();
                }
                j2Var.z = i40;
            }
            if (!r2Var.L0 && ((((chat = r2Var.d2) != null && chat.linked_community_id != 0) || ((user = r2Var.c2) != null && user.linked_community_id != 0)) && !r2Var.B && r2Var.K0 && !r2Var.O())) {
                float centerX2 = j2Var.F.centerX() + AndroidUtilities.dp(20.33f);
                float centerY2 = j2Var.F.centerY() + AndroidUtilities.dp(19.0f);
                if (r2Var.A0 == null) {
                    r2Var.A0 = new th.a();
                }
                lf.r.d(r2Var.A0, centerX2, centerY2, i16);
                canvas3.drawCircle(r2Var.A0.getBounds().exactCenterX(), r2Var.A0.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.k6.l0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, g6Var3)));
                r2Var.A0.draw(canvas3);
            }
        }
        if (r2Var.Y1) {
            canvas3.restore();
        }
        if (imageReceiver.getVisible() && B(canvas)) {
            z13 = true;
        }
        if (r2Var.f0 > 0.0f || r2Var.G0 != 0) {
            r2Var2 = r2Var;
        } else {
            boolean N2 = r2Var.N();
            RectF rectF9 = j2Var.F;
            int width = (int) (((rectF9.width() + rectF9.left) - r2Var.H3) - AndroidUtilities.dp(5.0f));
            RectF rectF10 = j2Var.F;
            D(canvas3, N2, (int) ((j2Var.F.height() + imageReceiver.getImageY()) - AndroidUtilities.dp(22.0f)), width, (int) (((rectF10.width() + rectF10.left) - r2Var.I3) - AndroidUtilities.dp(5.0f)), r2Var.f0, true);
            r2Var2 = this;
        }
        if (r2Var2.z0 != 0.0f) {
            canvas3.restore();
        }
        if (r2Var2.t1 != 0.0f) {
            canvas3.restore();
        }
        if (z10 && ((r2Var2.G0 != 0 || (r2Var2.M && (tL_forumTopic = r2Var2.K) != null && tL_forumTopic.id == 1)) && r2Var2.t1 == 0.0f && r2Var2.b2 != null)) {
            canvas3.save();
            canvas3.translate(0.0f, (-r2Var2.B3) - (r2Var2.n * r2Var2.f0));
            canvas3.clipRect(0.0f, (f18 - r2Var2.b2.J) * r2Var2.getMeasuredHeight(), r2Var2.getMeasuredWidth(), r2Var2.getMeasuredHeight());
            r2Var2.b2.c(canvas3, r12);
            canvas3.restore();
        }
        if (r2Var2.p2) {
            int dp15 = (r2Var2.q2 || (r2Var2.G0 != 0 && r2Var2.j1)) ? 0 : AndroidUtilities.dp(r2Var2.F);
            if (r2Var2.f0 != f18) {
                int alpha4 = org.telegram.ui.ActionBar.k6.k0.getAlpha();
                float f50 = r2Var2.f0;
                if (f50 != 0.0f) {
                    org.telegram.ui.ActionBar.k6.k0.setAlpha((int) ((f18 - f50) * alpha4));
                }
                float measuredHeight = (r2Var2.getMeasuredHeight() - 1) - (r2Var2.n * r2Var2.f0);
                if (LocaleController.isRTL) {
                    canvas.drawLine(0.0f, measuredHeight, r2Var2.getMeasuredWidth() - dp15, measuredHeight, org.telegram.ui.ActionBar.k6.k0);
                } else {
                    canvas.drawLine(dp15, measuredHeight, r2Var2.getMeasuredWidth(), measuredHeight, org.telegram.ui.ActionBar.k6.k0);
                }
                f19 = 0.0f;
                if (r2Var2.f0 != 0.0f) {
                    org.telegram.ui.ActionBar.k6.k0.setAlpha(alpha4);
                }
                if (r2Var2.q1 != f19) {
                    if (Build.VERSION.SDK_INT != 24) {
                        canvas.restore();
                    } else {
                        org.telegram.ui.ActionBar.k6.v0.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, g6Var3));
                        canvas.drawRect(0.0f, 0.0f, r2Var2.getMeasuredWidth(), r2Var2.r1 * r2Var2.q1, org.telegram.ui.ActionBar.k6.v0);
                        canvas.drawRect(0.0f, r2Var2.getMeasuredHeight() - ((int) (r2Var2.s1 * r2Var2.q1)), r2Var2.getMeasuredWidth(), r2Var2.getMeasuredHeight(), org.telegram.ui.ActionBar.k6.v0);
                        canvas2 = canvas;
                        if (z24) {
                            float f51 = f18 - f28;
                            int measuredHeight2 = (int) (r2Var2.getMeasuredHeight() * f51);
                            int u02 = org.telegram.ui.ActionBar.k6.u0(org.telegram.ui.ActionBar.k6.d6);
                            if (r2Var2.H4 == null) {
                                r2Var2.H4 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                            }
                            if (r2Var2.I4 != u02) {
                                r2Var2.I4 = u02;
                                r2Var2.H4.setColors(new int[]{u02, 16777215 & u02});
                            }
                            float a10 = k7.o.a((f51 - 0.05f) * 10.0f, 0.0f, 1.0f);
                            r2Var2.H4.setBounds(r12, measuredHeight2, r2Var2.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + measuredHeight2);
                            r2Var2.H4.setAlpha((int) (a10 * 255.0f));
                            r2Var2.H4.draw(canvas2);
                            canvas2.restore();
                        }
                        z16 = r2Var2.v3;
                        if (!z16 || r2Var2.u3 != 0.0f) {
                            if (z16) {
                                float f52 = r2Var2.u3;
                                if (f52 < 1.0f) {
                                    float f53 = f52 + 0.09411765f;
                                    r2Var2.u3 = f53;
                                    if (f53 > 1.0f) {
                                        r2Var2.u3 = 1.0f;
                                    }
                                    f20 = 0.0f;
                                }
                            } else {
                                float f54 = r2Var2.u3;
                                f20 = 0.0f;
                                if (f54 > 0.0f) {
                                    float f55 = f54 - 0.09411765f;
                                    r2Var2.u3 = f55;
                                    if (f55 < 0.0f) {
                                        r2Var2.u3 = 0.0f;
                                    }
                                }
                                if (r2Var2.j1) {
                                    float f56 = r2Var2.A1;
                                    if (f56 > f20) {
                                        float f57 = f56 - 0.069565214f;
                                        r2Var2.A1 = f57;
                                        if (f57 < f20) {
                                            r2Var2.A1 = f20;
                                        }
                                        org.telegram.ui.Components.z8 z8Var = r2Var2.X1;
                                        if (z8Var.n == 2) {
                                            z8Var.o = pr.h.getInterpolation(r2Var2.A1);
                                        }
                                        z13 = true;
                                    }
                                    if (r2Var2.Y1) {
                                        float f58 = r2Var2.Z1 + 16.0f;
                                        r2Var2.Z1 = f58;
                                        if (f58 >= 170.0f) {
                                            r2Var2.Z1 = 170.0f;
                                            r2Var2.Y1 = r12;
                                        }
                                        z13 = true;
                                    }
                                    if (!r2Var2.x1) {
                                        float f59 = r2Var2.z1;
                                        if (f59 < 1.0f) {
                                            float f60 = f59 + 0.09411765f;
                                            r2Var2.z1 = f60;
                                            if (f60 > 1.0f) {
                                                r2Var2.z1 = 1.0f;
                                                z13 = true;
                                            }
                                        }
                                        float f61 = r2Var2.y1;
                                        if (f61 < 1.0f) {
                                            float f62 = f61 + 0.053333335f;
                                            r2Var2.y1 = f62;
                                            if (f62 > 1.0f) {
                                                r2Var2.y1 = 1.0f;
                                            }
                                            z13 = true;
                                        }
                                        h0Var2.setVisibility(!z12 ? 0 : 4);
                                        if (z13) {
                                            return;
                                        }
                                        r2Var2.invalidate();
                                        return;
                                    }
                                    if (r2Var2.z1 == 1.0f) {
                                        r2Var2.z1 = 0.0f;
                                        z13 = true;
                                    }
                                    float f63 = r2Var2.y1;
                                    if (f63 > 0.0f) {
                                        float f64 = f63 - 0.053333335f;
                                        r2Var2.y1 = f64;
                                        if (f64 < 0.0f) {
                                            r2Var2.y1 = 0.0f;
                                        }
                                        z13 = true;
                                    }
                                    h0Var2.setVisibility(!z12 ? 0 : 4);
                                    if (z13) {
                                    }
                                } else {
                                    float f65 = r2Var2.A1;
                                    if (f65 < 1.0f) {
                                        float f66 = f65 + 0.069565214f;
                                        r2Var2.A1 = f66;
                                        if (f66 > 1.0f) {
                                            r2Var2.A1 = 1.0f;
                                        }
                                        org.telegram.ui.Components.z8 z8Var2 = r2Var2.X1;
                                        if (z8Var2.n == 2) {
                                            z8Var2.o = pr.h.getInterpolation(r2Var2.A1);
                                        }
                                        z13 = true;
                                    }
                                    if (r2Var2.Y1) {
                                    }
                                    if (!r2Var2.x1) {
                                    }
                                }
                            }
                            z13 = true;
                            if (r2Var2.j1) {
                            }
                        }
                        f20 = 0.0f;
                        if (r2Var2.j1) {
                        }
                    }
                }
                canvas2 = canvas;
                if (z24) {
                }
                z16 = r2Var2.v3;
                if (!z16) {
                }
                if (z16) {
                }
                z13 = true;
                if (r2Var2.j1) {
                }
            }
        }
        f19 = 0.0f;
        if (r2Var2.q1 != f19) {
        }
        canvas2 = canvas;
        if (z24) {
        }
        z16 = r2Var2.v3;
        if (!z16) {
        }
        if (z16) {
        }
        z13 = true;
        if (r2Var2.j1) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        ri0 ri0Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (P() && (ri0Var = this.b2) != null && SharedConfig.archiveHidden && ri0Var.J == 0.0f) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(32);
            if (!P() && this.w4 != null) {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_chat_preview, LocaleController.getString(R.string.AccActionChatPreview)));
            }
        }
        k2 k2Var = this.n2;
        if (k2Var == null || !k2Var.a.q) {
            return;
        }
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(true);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f0 != 0.0f || this.M || this.C || !this.r0.a(motionEvent, this)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int dp;
        int i14;
        if (this.E0 == 0 && this.D0 == null) {
            return;
        }
        fg.h0 h0Var = this.f4;
        if (h0Var != null) {
            h0Var.layout(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
        }
        if (this.n2 != null) {
            int i15 = this.F;
            boolean z10 = this.o2;
            int dp2 = AndroidUtilities.dp(i15 - ((z10 || SharedConfig.useThreeLinesLayout) ? 29 : 27));
            if (this.h0) {
                i14 = AndroidUtilities.dp(8.0f);
                dp = (getMeasuredHeight() - this.n2.getMeasuredHeight()) >> 1;
            } else {
                if (LocaleController.isRTL) {
                    dp2 = (i12 - i10) - dp2;
                }
                int i16 = dp2;
                dp = AndroidUtilities.dp(this.R + ((z10 || SharedConfig.useThreeLinesLayout) ? 6 : 0));
                i14 = i16;
            }
            k2 k2Var = this.n2;
            k2Var.layout(i14, dp, k2Var.getMeasuredWidth() + i14, this.n2.getMeasuredHeight() + dp);
        }
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (measuredWidth != this.D4 || this.x0) {
            this.x0 = false;
            this.D4 = measuredWidth;
            try {
                t();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        fg.h0 h0Var = this.f4;
        if (h0Var != null) {
            h0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), TLObject.FLAG_30));
        }
        k2 k2Var = this.n2;
        if (k2Var != null) {
            k2Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
        }
        if (this.M) {
            int size = View.MeasureSpec.getSize(i10);
            boolean z4 = this.o2;
            setMeasuredDimension(size, AndroidUtilities.dp(((z4 || SharedConfig.useThreeLinesLayout) ? this.H : this.G) + ((!M() || ((z4 || SharedConfig.useThreeLinesLayout) && !Q())) ? 0 : Q() ? this.J : this.I)) + (this.p2 ? 1 : 0));
            this.N = false;
            if (this.M && !M()) {
                t();
                if (this.O) {
                    this.N = true;
                    t();
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), y());
        this.r1 = 0;
        this.s1 = getMeasuredHeight();
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        MessageObject captionMessage;
        TLRPC.User user;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        StringBuilder sb = new StringBuilder();
        String str = this.I0;
        if (str != null) {
            sb.append(str);
            sb.append(". ");
        } else if (this.G0 == 1) {
            org.telegram.ui.b.i(R.string.ArchivedChats, ". ", sb);
        } else {
            if (this.e2 != null) {
                org.telegram.ui.b.i(R.string.AccDescrSecretChat, ". ", sb);
            }
            if (!this.M || this.K == null) {
                TLRPC.User user2 = this.c2;
                if (user2 != null) {
                    if (UserObject.isReplyUser(user2)) {
                        sb.append(LocaleController.getString(R.string.RepliesTitle));
                    } else if (UserObject.isAnonymous(this.c2)) {
                        sb.append(LocaleController.getString(R.string.AnonymousForward));
                    } else {
                        if (this.c2.bot) {
                            org.telegram.ui.b.i(R.string.Bot, ". ", sb);
                        }
                        TLRPC.User user3 = this.c2;
                        if (user3.self) {
                            sb.append(LocaleController.getString(R.string.SavedMessages));
                        } else {
                            sb.append(ContactsController.formatName(user3.first_name, user3.last_name));
                        }
                    }
                    sb.append(". ");
                } else {
                    TLRPC.Chat chat = this.d2;
                    if (chat != null) {
                        if (chat.broadcast) {
                            sb.append(LocaleController.getString(R.string.AccDescrChannel));
                        } else {
                            sb.append(LocaleController.getString(R.string.AccDescrGroup));
                        }
                        sb.append(". ");
                        sb.append(this.d2.title);
                        sb.append(". ");
                    }
                }
            } else {
                org.telegram.ui.b.i(R.string.AccDescrTopic, ". ", sb);
                sb.append(this.K.title);
                sb.append(". ");
            }
        }
        if (this.c4) {
            org.telegram.ui.b.i(R.string.AccDescrVerified, ". ", sb);
        }
        if (this.W0) {
            org.telegram.ui.b.i(R.string.AccDescrNotificationsMuted, ". ", sb);
        }
        if (R()) {
            org.telegram.ui.b.i(R.string.AccDescrUserOnline, ". ", sb);
        }
        int i10 = this.P0;
        if (i10 > 0) {
            sb.append(LocaleController.formatPluralString("NewMessages", i10, new Object[0]));
            sb.append(". ");
        }
        int i11 = this.R0;
        if (i11 > 0) {
            sb.append(LocaleController.formatPluralString("AccDescrMentionCount", i11, new Object[0]));
            sb.append(". ");
        }
        if (this.S0 > 0) {
            org.telegram.ui.b.i(R.string.AccDescrMentionReaction, ". ", sb);
        }
        MessageObject messageObject = this.c1;
        if (messageObject == null || this.G0 != 0) {
            accessibilityEvent.setContentDescription(sb);
            setContentDescription(sb);
            return;
        }
        int i12 = this.O0;
        if (i12 == 0) {
            i12 = messageObject.messageOwner.date;
        }
        String formatDateAudio = LocaleController.formatDateAudio(i12, true);
        if (this.c1.isOut()) {
            sb.append(LocaleController.formatString("AccDescrSentDate", R.string.AccDescrSentDate, formatDateAudio));
        } else {
            sb.append(LocaleController.formatString("AccDescrReceivedDate", R.string.AccDescrReceivedDate, formatDateAudio));
        }
        sb.append(". ");
        if (this.d2 != null && !this.c1.isOut() && this.c1.isFromUser() && this.c1.messageOwner.action == null && (user = MessagesController.getInstance(this.C0).getUser(Long.valueOf(this.c1.messageOwner.from_id.user_id))) != null) {
            sb.append(ContactsController.formatName(user.first_name, user.last_name));
            sb.append(". ");
        }
        if (this.e2 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.c1.messageText);
            if (!this.c1.isMediaEmpty() && (captionMessage = getCaptionMessage()) != null && !TextUtils.isEmpty(captionMessage.caption)) {
                if (sb2.length() > 0) {
                    sb2.append(". ");
                }
                sb2.append(captionMessage.caption);
            }
            StaticLayout staticLayout = this.b3;
            int length = staticLayout == null ? -1 : staticLayout.getText().length();
            if (length > 0) {
                int length2 = sb2.length();
                int indexOf = sb2.indexOf("\n", length);
                if (indexOf < length2 && indexOf >= 0) {
                    length2 = indexOf;
                }
                int indexOf2 = sb2.indexOf("\t", length);
                if (indexOf2 < length2 && indexOf2 >= 0) {
                    length2 = indexOf2;
                }
                int indexOf3 = sb2.indexOf(" ", length);
                if (indexOf3 < length2 && indexOf3 >= 0) {
                    length2 = indexOf3;
                }
                sb.append(sb2.substring(0, length2));
            } else {
                sb.append((CharSequence) sb2);
            }
        }
        accessibilityEvent.setContentDescription(sb);
        setContentDescription(sb);
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
        if (this.f0 != 0.0f || this.M || this.C || !this.r0.a(motionEvent, this)) {
            n2 n2Var = this.a0;
            if (n2Var == null || n2Var.b()) {
                if (this.B1) {
                    boolean contains = this.E1.contains(motionEvent.getX(), motionEvent.getY());
                    int action = motionEvent.getAction();
                    rc rcVar = this.C1;
                    if (action == 0 || motionEvent.getAction() == 2) {
                        rcVar.c(contains);
                    } else {
                        if (rcVar.h && motionEvent.getAction() == 1) {
                            org.telegram.ui.web.d1 d1Var = this.H1;
                            if (d1Var != null) {
                                d1Var.run(this.c2);
                            }
                            rcVar.c(false);
                            return true;
                        }
                        if (rcVar.h && motionEvent.getAction() == 3) {
                            rcVar.c(false);
                            return true;
                        }
                    }
                }
                if (this.c0) {
                    xc xcVar = this.W;
                    if (xcVar != null) {
                        if (this.e3 != null) {
                            int i10 = this.g1;
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
        py pyVar;
        if (i10 != R.id.acc_action_chat_preview || (pyVar = this.w4) == null) {
            return super.performAccessibilityAction(i10, bundle);
        }
        pyVar.H4(this);
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
        if (this.O1 <= 0) {
            return charSequence;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.insert(0, (CharSequence) " ");
        valueOf.setSpan(new p2(AndroidUtilities.dp(((this.E4 + 2) * this.O1) + 3)), 0, 1, 33);
        return valueOf;
    }

    public void setArchivedPullAnimation(ri0 ri0Var) {
        this.b2 = ri0Var;
    }

    public void setBottomClip(int i10) {
        this.s1 = i10;
    }

    public void setClipProgress(float f10) {
        this.q1 = f10;
        invalidate();
    }

    public void setCurrentDialogId(long j10) {
        this.E0 = j10;
    }

    public void setCustomMessage(String str) {
        if (TextUtils.equals(this.F0, str)) {
            return;
        }
        this.F0 = str;
        t();
        requestLayout();
    }

    public void setCustomMessageWithoutRebuild(String str) {
        this.F0 = str;
    }

    public void setDialog(m2 m2Var) {
        this.D0 = m2Var;
        this.i1 = 0;
        b0(0, true);
        w();
        v();
        u();
        x();
    }

    public void setDialogCellDelegate(n2 n2Var) {
        this.a0 = n2Var;
    }

    public void setDialogSelected(boolean z4) {
        if (this.j4 != z4) {
            invalidate();
        }
        this.j4 = z4;
    }

    public void setIsTransitionSupport(boolean z4) {
        this.g0 = z4;
    }

    public void setMoving(boolean z4) {
        this.r = z4;
    }

    public void setOpenBotButton(boolean z4) {
        if (this.B1 == z4) {
            return;
        }
        if (this.F1 == null) {
            this.F1 = new k01(LocaleController.getString(R.string.BotOpen), 14.0f, AndroidUtilities.bold());
        }
        this.B1 = z4;
        this.C1.c(false);
    }

    public void setPinForced(boolean z4) {
        this.y3 = z4;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            t();
        }
        invalidate();
    }

    public void setPreloader(uf.h hVar) {
        this.l4 = hVar;
    }

    public void setRightFragmentOpenedProgress(float f10) {
        if (this.f0 != f10) {
            this.f0 = f10;
            invalidate();
        }
    }

    public void setSliding(boolean z4) {
        this.u1 = z4;
    }

    public void setTitleOverride(String str) {
        this.I0 = str;
    }

    public void setTopClip(int i10) {
        this.r1 = i10;
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        if (f10 == this.t1) {
            return;
        }
        this.t1 = f10;
        hj0 hj0Var = this.v1;
        if (hj0Var != null && f10 == 0.0f) {
            hj0Var.Q(0.0f, true);
            this.w1 = false;
            this.j1 = SharedConfig.archiveHidden;
            this.y1 = 0.0f;
            this.u1 = false;
        }
        float f11 = this.t1;
        if (f11 != 0.0f) {
            this.u1 = true;
        } else {
            this.z1 = 0.0f;
            this.y1 = 0.0f;
            this.x1 = false;
        }
        if (this.u1 && !this.w) {
            boolean z4 = this.x1;
            boolean z10 = Math.abs(f11) >= ((float) getMeasuredWidth()) * 0.45f;
            this.x1 = z10;
            if (z4 != z10 && this.j1 == SharedConfig.archiveHidden) {
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
        }
        invalidate();
    }

    public void setVisible(boolean z4) {
        if (this.w0 == z4) {
            return;
        }
        this.w0 = z4;
        if (z4) {
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
    
        if (org.telegram.messenger.ChatObject.isMegagroup(r52.d2) != false) goto L588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1535:0x0b36, code lost:
    
        if (bg.e.k(r52.c1) == false) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1675:0x0f53, code lost:
    
        if (org.telegram.messenger.MessageObject.isBlueBlock(r52.c1.messageOwner.rich_message.blocks.get(0)) != false) goto L797;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1846:0x0635, code lost:
    
        if (r2.kicked != false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1850:0x063f, code lost:
    
        if (r52.M == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1861:0x0603, code lost:
    
        if (r3.reply_to_msg_id == 0) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1867:0x060f, code lost:
    
        if (r52.P0 != 0) goto L320;
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
        float f10;
        float f11;
        boolean z4;
        int i11;
        CharSequence charSequence;
        long j10;
        boolean z10;
        boolean z11;
        int i12;
        boolean z12;
        TLRPC.DraftMessage draftMessage;
        TLRPC.DraftMessage draftMessage2;
        TLRPC.DraftMessage draftMessage3;
        boolean z13;
        CharSequence charSequence2;
        CharSequence charSequence3;
        boolean z14;
        int i13;
        boolean z15;
        CharSequence charSequence4;
        String string;
        CharSequence charSequence5;
        boolean z16;
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
        boolean z17;
        MessageObject messageObject;
        CharSequence charSequence11;
        CharSequence charSequence12;
        CharSequence replaceNewLines;
        CharSequence charSequence13;
        char c3;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence14;
        boolean isChannelAndNotMegaGroup;
        String formatPluralString;
        char c10;
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
        CharSequence F;
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
        boolean z18;
        String str7;
        String str8;
        MessagesController messagesController;
        CharSequence charSequence22;
        CharSequence escape;
        CharSequence charSequence23;
        String str9;
        String str10;
        boolean z19;
        CharSequence charSequence24;
        int i16;
        boolean z20;
        String str11;
        String str12;
        boolean z21;
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
        boolean z22;
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
        is isVar;
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
        is isVar2;
        int dp5;
        int dp6;
        is isVar3;
        int dp7;
        CharSequence highlightText3;
        CharSequence charSequence27;
        SpannableStringBuilder H;
        if (this.g0) {
            return;
        }
        if (this.K0 && !this.B4.a() && this.G0 == 0 && this.H0 == 0 && this.e2 == null) {
            return;
        }
        if (!this.o2) {
            int i27 = SharedConfig.PASSCODE_TYPE_PIN;
        }
        org.telegram.ui.ActionBar.k6.B0[0].setTextSize(AndroidUtilities.dp(17.0f));
        org.telegram.ui.ActionBar.k6.C0[0].setTextSize(AndroidUtilities.dp(17.0f));
        org.telegram.ui.ActionBar.k6.F0[0].setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.k6.H0[0].setTextSize(AndroidUtilities.dp(16.0f));
        boolean z23 = true;
        org.telegram.ui.ActionBar.k6.B0[1].setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.k6.C0[1].setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.k6.F0[1].setTextSize(AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.k6.H0[1].setTextSize(AndroidUtilities.dp(15.0f));
        TextPaint textPaint = org.telegram.ui.ActionBar.k6.F0[1];
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i9, this.C4);
        textPaint.linkColor = v02;
        textPaint.setColor(v02);
        this.B0 = 1;
        this.E4 = 18;
        this.J0 = 0;
        CharSequence printingString = (Q() || !(this.K0 || this.M)) ? null : MessagesController.getInstance(this.C0).getPrintingString(this.E0, getTopicId(), true);
        this.U = org.telegram.ui.ActionBar.k6.F0[this.B0];
        this.D2 = false;
        this.c4 = false;
        this.d4 = false;
        this.e4 = false;
        this.u0 = false;
        this.v0 = false;
        this.i4 = 0;
        this.w3 = false;
        this.O1 = 0;
        this.P1 = false;
        this.A2 = false;
        boolean z24 = (UserObject.isUserSelf(this.c2) || this.r2) ? false : true;
        this.g2 = -1;
        if (!Q()) {
            this.e3 = null;
        }
        setOpenBotButton(false);
        if ((this.o2 || SharedConfig.useThreeLinesLayout) && this.G0 == 0 && !Q() && !M()) {
            this.T = false;
            i10 = 2;
        } else {
            this.T = true;
            i10 = 1;
        }
        MessageObject messageObject8 = this.c1;
        if (messageObject8 != null) {
            messageObject8.updateTranslation();
        }
        MessageObject messageObject9 = this.c1;
        CharSequence charSequence28 = messageObject9 != null ? messageObject9.messageText : null;
        if (charSequence28 instanceof Spannable) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence28);
            f10 = 17.0f;
            f11 = 16.0f;
            for (m51 m51Var : (m51[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), m51.class)) {
                spannableStringBuilder2.removeSpan(m51Var);
            }
            for (l51 l51Var : (l51[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), l51.class)) {
                spannableStringBuilder2.removeSpan(l51Var);
            }
            charSequence28 = spannableStringBuilder2;
        } else {
            f10 = 17.0f;
            f11 = 16.0f;
        }
        this.f1 = charSequence28;
        if (this.C) {
            this.w3 = true;
            z4 = false;
            z24 = false;
        } else {
            z4 = true;
        }
        m2 m2Var = this.D0;
        if (m2Var != null) {
            if (m2Var.g == 2) {
                this.D2 = true;
                if (this.o2 || SharedConfig.useThreeLinesLayout) {
                    this.H2 = AndroidUtilities.dp(12.5f);
                    if (LocaleController.isRTL) {
                        this.G2 = (getMeasuredWidth() - AndroidUtilities.dp(this.F + 6)) - org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth();
                        this.u2 = AndroidUtilities.dp(22.0f);
                    } else {
                        this.G2 = AndroidUtilities.dp(this.F + 6);
                        this.u2 = org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth() + AndroidUtilities.dp(this.F + 10);
                    }
                } else {
                    this.H2 = AndroidUtilities.dp(16.5f);
                    if (LocaleController.isRTL) {
                        this.G2 = (getMeasuredWidth() - AndroidUtilities.dp(this.F + 4)) - org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth();
                        this.u2 = AndroidUtilities.dp(18.0f);
                    } else {
                        this.G2 = AndroidUtilities.dp(this.F + 4);
                        this.u2 = org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth() + AndroidUtilities.dp(this.F + 8);
                    }
                }
            } else {
                this.c4 = !this.k1 && m2Var.i;
                if (this.o2 || SharedConfig.useThreeLinesLayout) {
                    if (LocaleController.isRTL) {
                        this.u2 = AndroidUtilities.dp(22.0f);
                    } else {
                        this.u2 = AndroidUtilities.dp(this.F + 6);
                    }
                } else if (LocaleController.isRTL) {
                    this.u2 = AndroidUtilities.dp(18.0f);
                } else {
                    this.u2 = AndroidUtilities.dp(this.F + 4);
                }
            }
            m2 m2Var2 = this.D0;
            if (m2Var2.g == 1) {
                string = LocaleController.getString(R.string.FromYou);
                m2 m2Var3 = this.D0;
                if (m2Var3.j) {
                    this.U = org.telegram.ui.ActionBar.k6.H0[this.B0];
                    H = H(this.c1.messageText, null, i10);
                    H.setSpan(new f10(org.telegram.ui.ActionBar.k6.o9, this.C4), 0, H.length(), 33);
                } else {
                    String str13 = m2Var3.b;
                    if (str13.length() > 150) {
                        str13 = str13.substring(0, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    }
                    H = (this.o2 || SharedConfig.useThreeLinesLayout) ? H(str13, string, i10) : H(str13.replace('\n', ' '), string, i10);
                }
                charSequence27 = Emoji.replaceEmoji(H, org.telegram.ui.ActionBar.k6.F0[this.B0].getFontMetricsInt(), false);
                z19 = false;
            } else {
                charSequence27 = m2Var2.b;
                if (m2Var2.j) {
                    this.U = org.telegram.ui.ActionBar.k6.H0[this.B0];
                }
                string = null;
                z19 = true;
            }
            str10 = LocaleController.stringForMessageListDate(this.D0.h);
            int i28 = this.D0.d;
            if (i28 != 0) {
                this.D3 = true;
                str7 = String.format("%d", Integer.valueOf(i28));
            } else {
                this.D3 = false;
                str7 = null;
            }
            m2 m2Var4 = this.D0;
            int i29 = m2Var4.k;
            if (i29 == 2) {
                this.N2 = true;
                this.O2 = true;
                this.P2 = false;
            } else if (i29 == 1) {
                this.N2 = false;
                this.O2 = true;
                this.P2 = false;
            } else {
                this.P2 = false;
                this.N2 = false;
                this.O2 = false;
            }
            this.q3 = false;
            charSequence22 = m2Var4.a;
            replaceEmoji = charSequence27;
            str9 = null;
            charSequence24 = null;
            charSequence23 = "";
            i13 = -1;
        } else {
            if (this.o2 || SharedConfig.useThreeLinesLayout) {
                if (LocaleController.isRTL) {
                    this.u2 = AndroidUtilities.dp(22.0f);
                } else {
                    this.u2 = AndroidUtilities.dp(this.F + 6);
                }
            } else if (LocaleController.isRTL) {
                this.u2 = AndroidUtilities.dp(18.0f);
            } else {
                this.u2 = AndroidUtilities.dp(this.F + 4);
            }
            if (this.e2 != null) {
                if (this.G0 == 0) {
                    this.D2 = true;
                    if (this.o2 || SharedConfig.useThreeLinesLayout) {
                        this.H2 = AndroidUtilities.dp(12.5f);
                        if (LocaleController.isRTL) {
                            this.G2 = (getMeasuredWidth() - AndroidUtilities.dp(this.F + 6)) - org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth();
                            this.u2 = AndroidUtilities.dp(22.0f);
                        } else {
                            this.G2 = AndroidUtilities.dp(this.F + 6);
                            this.u2 = org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth() + AndroidUtilities.dp(this.F + 10);
                        }
                    } else {
                        this.H2 = AndroidUtilities.dp(16.5f);
                        if (LocaleController.isRTL) {
                            this.G2 = (getMeasuredWidth() - AndroidUtilities.dp(this.F + 4)) - org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth();
                            this.u2 = AndroidUtilities.dp(18.0f);
                        } else {
                            this.G2 = AndroidUtilities.dp(this.F + 4);
                            this.u2 = org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth() + AndroidUtilities.dp(this.F + 8);
                        }
                    }
                }
            } else if (this.G0 == 0 && !this.M) {
                TLRPC.Chat chat3 = this.d2;
                if (chat3 != null) {
                    long botVerificationIcon = DialogObject.getBotVerificationIcon(chat3);
                    TLRPC.Chat chat4 = this.d2;
                    if (chat4.scam) {
                        this.i4 = 1;
                        org.telegram.ui.ActionBar.k6.g1.a();
                    } else if (chat4.fake) {
                        this.i4 = 2;
                        org.telegram.ui.ActionBar.k6.h1.a();
                    } else if (DialogObject.getEmojiStatusDocumentId(chat4.emoji_status) != 0) {
                        this.e4 = true;
                        this.A2 = true;
                        org.telegram.ui.Components.j5 j5Var = this.g4;
                        j5Var.a = LocaleController.isRTL;
                        j5Var.j(DialogObject.getEmojiStatusDocumentId(this.d2.emoji_status), false);
                        this.g4.m(DialogObject.isEmojiStatusCollectible(this.d2.emoji_status), false);
                    } else {
                        boolean z25 = this.k1;
                        this.c4 = !z25 && this.d2.verified;
                        this.d4 = (z25 || this.d2.bot_verification_icon == 0) ? false : true;
                    }
                    charSequence = charSequence28;
                    j10 = botVerificationIcon;
                    i11 = i10;
                } else {
                    TLRPC.User user3 = this.c2;
                    if (user3 != null) {
                        j10 = DialogObject.getBotVerificationIcon(user3);
                        TLRPC.User user4 = this.c2;
                        if (user4.scam) {
                            this.i4 = 1;
                            org.telegram.ui.ActionBar.k6.g1.a();
                        } else if (user4.fake) {
                            this.i4 = 2;
                            org.telegram.ui.ActionBar.k6.h1.a();
                        } else {
                            boolean z26 = this.k1;
                            this.c4 = !z26 && user4.verified;
                            if (z26 || UserObject.isUserSelf(user4)) {
                                charSequence = charSequence28;
                            } else {
                                charSequence = charSequence28;
                                if (this.c2.bot_verification_icon != 0) {
                                    z10 = true;
                                    this.d4 = z10;
                                    if (MessagesController.getInstance(this.C0).isPremiumUser(this.c2)) {
                                        long j11 = UserConfig.getInstance(this.C0).clientUserId;
                                        i11 = i10;
                                        long j12 = this.c2.id;
                                        if (j11 != j12 && j12 != 0) {
                                            z11 = true;
                                            this.e4 = z11;
                                            if (z11) {
                                                Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(this.c2);
                                                org.telegram.ui.Components.j5 j5Var2 = this.g4;
                                                j5Var2.a = LocaleController.isRTL;
                                                if (emojiStatusDocumentId != null) {
                                                    this.A2 = true;
                                                    j5Var2.j(emojiStatusDocumentId.longValue(), false);
                                                    this.g4.m(DialogObject.isEmojiStatusCollectible(this.c2.emoji_status), false);
                                                } else {
                                                    this.A2 = true;
                                                    j5Var2.g(fg.q1.d().e, false);
                                                    this.g4.m(false, false);
                                                }
                                            }
                                        }
                                    } else {
                                        i11 = i10;
                                    }
                                    z11 = false;
                                    this.e4 = z11;
                                    if (z11) {
                                    }
                                }
                            }
                            z10 = false;
                            this.d4 = z10;
                            if (MessagesController.getInstance(this.C0).isPremiumUser(this.c2)) {
                            }
                            z11 = false;
                            this.e4 = z11;
                            if (z11) {
                            }
                        }
                        charSequence = charSequence28;
                        if (MessagesController.getInstance(this.C0).isPremiumUser(this.c2)) {
                        }
                        z11 = false;
                        this.e4 = z11;
                        if (z11) {
                        }
                    } else {
                        i11 = i10;
                        charSequence = charSequence28;
                        j10 = 0;
                    }
                }
                if (j10 != 0 && this.d4) {
                    this.h4.j(j10, false);
                }
                i12 = this.O0;
                if (i12 == 0 && (messageObject6 = this.c1) != null) {
                    i12 = messageObject6.messageOwner.date;
                }
                if (!this.M) {
                    boolean z27 = MediaDataController.getInstance(this.C0).getDraftVoice(this.E0, (long) getTopicId()) != null;
                    this.h2 = z27;
                    TLRPC.DraftMessage draft = !z27 ? MediaDataController.getInstance(this.C0).getDraft(this.E0, getTopicId()) : null;
                    this.i2 = draft;
                    if (draft != null && TextUtils.isEmpty(draft.message)) {
                        this.i2 = null;
                    }
                } else if (this.K0 || this.p0) {
                    boolean z28 = MediaDataController.getInstance(this.C0).getDraftVoice(this.E0, (long) getTopicId()) != null;
                    this.h2 = z28;
                    this.i2 = !z28 ? MediaDataController.getInstance(this.C0).getDraft(this.E0, 0L) : null;
                } else {
                    this.h2 = false;
                    this.i2 = null;
                }
                z12 = this.h2;
                if (!z12 || this.i2 != null) {
                    if (!z12 && (draftMessage2 = this.i2) != null && TextUtils.isEmpty(draftMessage2.message)) {
                        draftMessage3 = this.i2;
                        if (draftMessage3.rich_message == null) {
                            TLRPC.InputReplyTo inputReplyTo = draftMessage3.reply_to;
                            if (inputReplyTo == null) {
                            }
                            this.i2 = null;
                            this.h2 = false;
                            if (Q()) {
                                this.i2 = null;
                                this.h2 = false;
                                this.S = true;
                                c0();
                                string = ChatObject.isMonoForum(this.d2) ? null : AndroidUtilities.escape(getMessageNameString());
                                if (ChatObject.isMonoForum(this.d2)) {
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
                                charSequence19 = I();
                                MessageObject messageObject10 = this.c1;
                                String K = this.c1 != null ? K(i17, string, messageObject10 != null ? MessagesController.getInstance(messageObject10.currentAccount).getRestrictionReason(this.c1.messageOwner.restriction_reason) : null, true) : "";
                                CharSequence charSequence29 = K;
                                if (this.b0) {
                                    int length = K.length();
                                    charSequence29 = K;
                                    charSequence29 = K;
                                    if (length >= 0 && string != null) {
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(K);
                                        valueOf.setSpan(new f10(org.telegram.ui.ActionBar.k6.X8, this.C4), 0, Math.min(valueOf.length(), string.length() + 1), 0);
                                        charSequence29 = valueOf;
                                    }
                                }
                                this.U = org.telegram.ui.ActionBar.k6.F0[this.B0];
                                z15 = z4;
                                charSequence20 = charSequence29;
                            } else {
                                int i30 = i11;
                                if (TextUtils.isEmpty(this.F0)) {
                                    if (printingString != null) {
                                        this.f2 = printingString;
                                        z13 = z24;
                                        charSequence2 = charSequence;
                                        int intValue = MessagesController.getInstance(this.C0).getPrintingStringType(this.E0, getTopicId()).intValue();
                                        this.g2 = intValue;
                                        mw0 t02 = org.telegram.ui.ActionBar.k6.t0(intValue);
                                        int dp8 = t02 != null ? AndroidUtilities.dp(3.0f) + t02.getIntrinsicWidth() : 0;
                                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                        CharSequence replace = TextUtils.replace(printingString, new String[]{"..."}, new String[]{""});
                                        int indexOf = this.g2 == 5 ? replace.toString().indexOf("**oo**") : -1;
                                        if (indexOf >= 0) {
                                            spannableStringBuilder3.append(replace).setSpan(new p2(org.telegram.ui.ActionBar.k6.t0(this.g2).getIntrinsicWidth()), indexOf, indexOf + 6, 0);
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) " ").append(replace).setSpan(new p2(dp8), 0, 1, 0);
                                        }
                                        i13 = indexOf;
                                        z14 = false;
                                        charSequence3 = spannableStringBuilder3;
                                    } else {
                                        z13 = z24;
                                        charSequence2 = charSequence;
                                        this.f2 = null;
                                        this.g2 = -1;
                                        charSequence3 = "";
                                        z14 = true;
                                        i13 = -1;
                                    }
                                    if (this.h2 || this.i2 != null) {
                                        z15 = z4;
                                        charSequence4 = " ";
                                        CharSequence charSequence30 = charSequence3;
                                        string = LocaleController.getString(R.string.Draft);
                                        TLRPC.DraftMessage draftMessage4 = this.i2;
                                        if (draftMessage4 == null || !TextUtils.isEmpty(draftMessage4.message) || this.i2.rich_message != null) {
                                            TLRPC.DraftMessage draftMessage5 = this.i2;
                                            if (draftMessage5 != null && (richMessage = draftMessage5.rich_message) != null) {
                                                charSequence5 = MessageObject.formatRichMessage(richMessage, false, false, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                                            } else if (this.h2) {
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
                                            TLRPC.DraftMessage draftMessage6 = this.i2;
                                            if (draftMessage6 != null) {
                                                MediaDataController.addTextStyleRuns(draftMessage6, spannableString, 264);
                                                TLRPC.DraftMessage draftMessage7 = this.i2;
                                                if (draftMessage7 != null && (arrayList = draftMessage7.entities) != null) {
                                                    TextPaint textPaint2 = this.U;
                                                    MediaDataController.addAnimatedEmojiSpans(arrayList, spannableString, textPaint2 == null ? null : textPaint2.getFontMetricsInt());
                                                }
                                            } else if (this.h2) {
                                                spannableString.setSpan(new f10(org.telegram.ui.ActionBar.k6.p9, this.C4), 0, spannableString.length(), 33);
                                            }
                                            SpannableStringBuilder H2 = H(AndroidUtilities.replaceNewLines(spannableString), string, i30);
                                            if ((this.o2 || SharedConfig.useThreeLinesLayout) && !M()) {
                                                z16 = false;
                                            } else {
                                                z16 = false;
                                                H2.setSpan(new f10(org.telegram.ui.ActionBar.k6.j9, this.C4), 0, string.length() + 1, 33);
                                            }
                                            replaceEmoji = Emoji.replaceEmoji(H2, org.telegram.ui.ActionBar.k6.F0[this.B0].getFontMetricsInt(), z16);
                                            charSequence6 = charSequence30;
                                        } else if ((this.o2 || SharedConfig.useThreeLinesLayout) && !M()) {
                                            charSequence6 = charSequence30;
                                            replaceEmoji = "";
                                        } else {
                                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string);
                                            z23 = false;
                                            valueOf2.setSpan(new f10(org.telegram.ui.ActionBar.k6.j9, this.C4), 0, string.length(), 33);
                                            replaceEmoji = valueOf2;
                                            charSequence8 = charSequence30;
                                            z24 = z13;
                                            charSequence7 = null;
                                            charSequence21 = charSequence8;
                                            if (!this.u0 && !P() && !Q() && !O() && this.i2 == null && (messageObject5 = this.c1) != null && (message2 = messageObject5.messageOwner) != null && (message2.action instanceof TLRPC.TL_messageActionStarGift)) {
                                                this.v0 = true;
                                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceEmoji);
                                                spannableStringBuilder4.insert(0, (CharSequence) "d ");
                                                oq oqVar = new oq(f0.e.d(getContext(), R.drawable.mini_gift).mutate());
                                                oqVar.setScale(1.25f, 1.25f);
                                                oqVar.spaceScaleX = 0.9f;
                                                oqVar.setAlpha(0.9f);
                                                spannableStringBuilder4.setSpan(oqVar, 0, 1, 0);
                                                tL_textWithEntities = ((TLRPC.TL_messageActionStarGift) this.c1.messageOwner.action).message;
                                                if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                                                    this.U = org.telegram.ui.ActionBar.k6.F0[this.B0];
                                                }
                                                replaceEmoji = spannableStringBuilder4;
                                            }
                                            if (TextUtils.isEmpty(this.F0)) {
                                                if (this.i2 != null) {
                                                    stringForMessageListDate = LocaleController.stringForMessageListDate(r5.date);
                                                } else {
                                                    int i31 = this.O0;
                                                    if (i31 != 0) {
                                                        stringForMessageListDate = LocaleController.stringForMessageListDate(i31);
                                                    } else {
                                                        if (this.c1 != null) {
                                                            stringForMessageListDate = LocaleController.stringForMessageListDate(r5.messageOwner.date);
                                                        }
                                                    }
                                                }
                                                messageObject4 = this.c1;
                                                if (messageObject4 != null || this.o0) {
                                                    this.N2 = false;
                                                    this.O2 = false;
                                                    this.P2 = messageObject4 == null && messageObject4.isSending() && this.E0 == UserConfig.getInstance(this.C0).getClientUserId();
                                                    z18 = false;
                                                    this.D3 = false;
                                                    this.U3 = false;
                                                    this.V3 = false;
                                                    this.W3 = false;
                                                    this.q3 = false;
                                                    str7 = null;
                                                    str8 = null;
                                                } else {
                                                    if (this.G0 != 0) {
                                                        int i32 = this.P0;
                                                        int i33 = this.R0;
                                                        int i34 = i32 + i33;
                                                        if (i34 <= 0) {
                                                            z21 = false;
                                                            this.D3 = false;
                                                            this.U3 = false;
                                                            str12 = null;
                                                        } else if (i32 > i33) {
                                                            this.D3 = true;
                                                            z21 = false;
                                                            this.U3 = false;
                                                            str11 = String.format("%d", Integer.valueOf(i34));
                                                            str12 = null;
                                                            this.V3 = z21;
                                                            this.W3 = z21;
                                                        } else {
                                                            z21 = false;
                                                            this.D3 = false;
                                                            this.U3 = true;
                                                            str12 = String.format("%d", Integer.valueOf(i34));
                                                        }
                                                        str11 = null;
                                                        this.V3 = z21;
                                                        this.W3 = z21;
                                                    } else {
                                                        if (this.e1) {
                                                            this.D3 = false;
                                                            z24 = false;
                                                            z20 = true;
                                                        } else {
                                                            int i35 = this.P0;
                                                            if (i35 != 0) {
                                                                z20 = true;
                                                                this.D3 = true;
                                                                str11 = String.format("%d", Integer.valueOf(i35));
                                                            } else {
                                                                z20 = true;
                                                                if (this.Q0) {
                                                                    this.D3 = true;
                                                                    str11 = "";
                                                                } else {
                                                                    this.D3 = false;
                                                                }
                                                            }
                                                            if (this.R0 == 0) {
                                                                this.U3 = z20;
                                                                str12 = "@";
                                                            } else {
                                                                this.U3 = false;
                                                                str12 = null;
                                                            }
                                                            this.V3 = this.S0 <= 0;
                                                            this.W3 = this.T0 <= 0;
                                                        }
                                                        str11 = null;
                                                        if (this.R0 == 0) {
                                                        }
                                                        this.V3 = this.S0 <= 0;
                                                        this.W3 = this.T0 <= 0;
                                                    }
                                                    if (this.c1.isOut() && this.i2 == null && z24) {
                                                        MessageObject messageObject11 = this.c1;
                                                        if (!(messageObject11.messageOwner.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                                                            if (messageObject11.isSending()) {
                                                                z18 = false;
                                                                this.N2 = false;
                                                                this.O2 = false;
                                                                this.P2 = true;
                                                                this.q3 = false;
                                                            } else {
                                                                z18 = false;
                                                                if (this.c1.isSendError()) {
                                                                    this.N2 = false;
                                                                    this.O2 = false;
                                                                    this.P2 = false;
                                                                    this.q3 = true;
                                                                    this.D3 = false;
                                                                    this.U3 = false;
                                                                } else if (this.c1.isSent()) {
                                                                    TLRPC.TL_forumTopic tL_forumTopic = this.K;
                                                                    if (tL_forumTopic != null) {
                                                                        this.N2 = tL_forumTopic.read_outbox_max_id >= this.c1.getId();
                                                                    } else if (this.K0) {
                                                                        int i36 = this.A4;
                                                                        this.N2 = (i36 > 0 && i36 >= this.c1.getId()) || !this.c1.isUnread() || (ChatObject.isChannel(this.d2) && !this.d2.megagroup);
                                                                    } else {
                                                                        this.N2 = !this.c1.isUnread() || (ChatObject.isChannel(this.d2) && !this.d2.megagroup);
                                                                    }
                                                                    this.O2 = true;
                                                                    z18 = false;
                                                                    this.P2 = false;
                                                                    this.q3 = false;
                                                                } else {
                                                                    z18 = false;
                                                                }
                                                            }
                                                            str8 = str12;
                                                            str7 = str11;
                                                        }
                                                    }
                                                    z18 = false;
                                                    this.N2 = false;
                                                    this.O2 = false;
                                                    this.P2 = false;
                                                    this.q3 = false;
                                                    str8 = str12;
                                                    str7 = str11;
                                                }
                                                this.M2 = z18;
                                                messagesController = MessagesController.getInstance(this.C0);
                                                if (this.g1 == 0 && messagesController.isPromoDialog(this.E0, true)) {
                                                    this.w3 = true;
                                                    this.M2 = true;
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
                                                            this.O1 = 0;
                                                        }
                                                    }
                                                }
                                                charSequence22 = this.I0;
                                                if (charSequence22 == null) {
                                                    if (this.G0 != 0) {
                                                        charSequence22 = LocaleController.getString(R.string.ArchivedChats);
                                                    } else {
                                                        TLRPC.Chat chat5 = this.d2;
                                                        if (chat5 != null) {
                                                            if (this.L) {
                                                                if (this.e0 == null) {
                                                                    this.e0 = new Drawable[1];
                                                                }
                                                                this.e0[0] = null;
                                                                escape = MessagesController.getInstance(this.C0).getTopicsController().getTopicIconName(this.d2, this.c1, this.U, this.e0);
                                                            } else if (this.M) {
                                                                if (this.e0 == null) {
                                                                    this.e0 = new Drawable[1];
                                                                }
                                                                Drawable[] drawableArr = this.e0;
                                                                drawableArr[0] = null;
                                                                escape = this.d0 ? bg.e.j(this.K, org.telegram.ui.ActionBar.k6.B0[this.B0], drawableArr) : AndroidUtilities.escape(this.K.title);
                                                            } else if (!chat5.monoforum || chat5.linked_monoforum_id == 0) {
                                                                escape = AndroidUtilities.escape(chat5.title);
                                                            } else {
                                                                TLRPC.Chat chat6 = MessagesController.getInstance(this.C0).getChat(Long.valueOf(this.d2.linked_monoforum_id));
                                                                if (chat6 != null) {
                                                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(AndroidUtilities.escape(chat6.title));
                                                                    spannableStringBuilder5.append(charSequence4);
                                                                    int length3 = spannableStringBuilder5.length();
                                                                    spannableStringBuilder5.append((CharSequence) LocaleController.getString(R.string.MonoforumSpan));
                                                                    spannableStringBuilder5.setSpan(new a10(LocaleController.getString(R.string.MonoforumSpan), org.telegram.ui.ActionBar.k6.y6, this.C4), length3, spannableStringBuilder5.length(), 33);
                                                                    charSequence22 = spannableStringBuilder5;
                                                                } else {
                                                                    escape = AndroidUtilities.escape(this.d2.title);
                                                                }
                                                            }
                                                            charSequence22 = escape;
                                                        } else {
                                                            TLRPC.User user5 = this.c2;
                                                            if (user5 != null) {
                                                                if (UserObject.isReplyUser(user5)) {
                                                                    escape = LocaleController.getString(R.string.RepliesTitle);
                                                                } else if (UserObject.isAnonymous(this.c2)) {
                                                                    escape = LocaleController.getString(R.string.AnonymousForward);
                                                                } else if (!UserObject.isUserSelf(this.c2) || this.n0) {
                                                                    if (this.M) {
                                                                        if (this.e0 == null) {
                                                                            this.e0 = new Drawable[1];
                                                                        }
                                                                        Drawable[] drawableArr2 = this.e0;
                                                                        drawableArr2[0] = null;
                                                                        escape = this.d0 ? bg.e.j(this.K, org.telegram.ui.ActionBar.k6.B0[this.B0], drawableArr2) : AndroidUtilities.escape(this.K.title);
                                                                    } else {
                                                                        escape = AndroidUtilities.escape(UserObject.getUserName(this.c2));
                                                                    }
                                                                } else if (this.o0) {
                                                                    escape = LocaleController.getString(R.string.MyNotes);
                                                                } else if (this.r2) {
                                                                    escape = LocaleController.getString(R.string.FromYou);
                                                                } else {
                                                                    if (this.g1 == 3) {
                                                                        this.w3 = true;
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
                                                z4 = z15;
                                                str10 = stringForMessageListDate;
                                                z19 = z23;
                                                charSequence24 = charSequence7;
                                            }
                                            stringForMessageListDate = "";
                                            messageObject4 = this.c1;
                                            if (messageObject4 != null) {
                                            }
                                            this.N2 = false;
                                            this.O2 = false;
                                            this.P2 = messageObject4 == null && messageObject4.isSending() && this.E0 == UserConfig.getInstance(this.C0).getClientUserId();
                                            z18 = false;
                                            this.D3 = false;
                                            this.U3 = false;
                                            this.V3 = false;
                                            this.W3 = false;
                                            this.q3 = false;
                                            str7 = null;
                                            str8 = null;
                                            this.M2 = z18;
                                            messagesController = MessagesController.getInstance(this.C0);
                                            if (this.g1 == 0) {
                                                this.w3 = true;
                                                this.M2 = true;
                                                i16 = messagesController.promoDialogType;
                                                if (i16 != MessagesController.PROMO_TYPE_PROXY) {
                                                }
                                            }
                                            charSequence22 = this.I0;
                                            if (charSequence22 == null) {
                                            }
                                            charSequence23 = charSequence21;
                                            str9 = str8;
                                            z4 = z15;
                                            str10 = stringForMessageListDate;
                                            z19 = z23;
                                            charSequence24 = charSequence7;
                                        }
                                        z24 = z13;
                                        charSequence7 = null;
                                        z23 = false;
                                        charSequence21 = charSequence6;
                                        if (!this.u0) {
                                            this.v0 = true;
                                            SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder(replaceEmoji);
                                            spannableStringBuilder42.insert(0, (CharSequence) "d ");
                                            oq oqVar2 = new oq(f0.e.d(getContext(), R.drawable.mini_gift).mutate());
                                            oqVar2.setScale(1.25f, 1.25f);
                                            oqVar2.spaceScaleX = 0.9f;
                                            oqVar2.setAlpha(0.9f);
                                            spannableStringBuilder42.setSpan(oqVar2, 0, 1, 0);
                                            tL_textWithEntities = ((TLRPC.TL_messageActionStarGift) this.c1.messageOwner.action).message;
                                            if (tL_textWithEntities != null) {
                                                this.U = org.telegram.ui.ActionBar.k6.F0[this.B0];
                                            }
                                            replaceEmoji = spannableStringBuilder42;
                                        }
                                        if (TextUtils.isEmpty(this.F0)) {
                                        }
                                        stringForMessageListDate = "";
                                        messageObject4 = this.c1;
                                        if (messageObject4 != null) {
                                        }
                                        this.N2 = false;
                                        this.O2 = false;
                                        this.P2 = messageObject4 == null && messageObject4.isSending() && this.E0 == UserConfig.getInstance(this.C0).getClientUserId();
                                        z18 = false;
                                        this.D3 = false;
                                        this.U3 = false;
                                        this.V3 = false;
                                        this.W3 = false;
                                        this.q3 = false;
                                        str7 = null;
                                        str8 = null;
                                        this.M2 = z18;
                                        messagesController = MessagesController.getInstance(this.C0);
                                        if (this.g1 == 0) {
                                        }
                                        charSequence22 = this.I0;
                                        if (charSequence22 == null) {
                                        }
                                        charSequence23 = charSequence21;
                                        str9 = str8;
                                        z4 = z15;
                                        str10 = stringForMessageListDate;
                                        z19 = z23;
                                        charSequence24 = charSequence7;
                                    } else {
                                        if (this.e1) {
                                            this.U = org.telegram.ui.ActionBar.k6.H0[this.B0];
                                            formatString = LocaleController.getString(R.string.HistoryCleared);
                                        } else {
                                            MessageObject messageObject12 = this.c1;
                                            if (messageObject12 != null) {
                                                String restrictionReason = MessagesController.getInstance(messageObject12.currentAccount).getRestrictionReason(this.c1.messageOwner.restriction_reason);
                                                long fromChatId = this.c1.getFromChatId();
                                                if (DialogObject.isUserDialog(fromChatId)) {
                                                    MessagesController.getInstance(this.C0).getUser(Long.valueOf(fromChatId));
                                                    chat = null;
                                                } else {
                                                    chat = MessagesController.getInstance(this.C0).getChat(Long.valueOf(-fromChatId));
                                                }
                                                this.E3 = true;
                                                if (this.g1 == 0) {
                                                    charSequence9 = " ";
                                                    if (this.E0 > 0 && this.c1.isOutOwner() && (tL_messageReactions = this.c1.messageOwner.reactions) != null && (arrayList2 = tL_messageReactions.recent_reactions) != null && !arrayList2.isEmpty() && this.S0 > 0) {
                                                        TLRPC.MessagePeerReaction messagePeerReaction = this.c1.messageOwner.reactions.recent_reactions.get(0);
                                                        if (messagePeerReaction.unread) {
                                                            long j13 = messagePeerReaction.peer_id.user_id;
                                                            if (j13 != 0 && j13 != UserConfig.getInstance(this.C0).clientUserId) {
                                                                ng.q0 d = ng.q0.d(messagePeerReaction.reaction);
                                                                this.U = org.telegram.ui.ActionBar.k6.H0[this.B0];
                                                                String str15 = d.f;
                                                                if (str15 != null) {
                                                                    z17 = true;
                                                                    str = LocaleController.formatString(R.string.ReactionInDialog, str15);
                                                                    charSequence10 = charSequence3;
                                                                    z15 = z4;
                                                                } else {
                                                                    String formatString2 = LocaleController.formatString(R.string.ReactionInDialog, "**reaction**");
                                                                    int indexOf2 = formatString2.indexOf("**reaction**");
                                                                    ?? spannableStringBuilder6 = new SpannableStringBuilder(formatString2.replace("**reaction**", "d"));
                                                                    charSequence10 = charSequence3;
                                                                    z15 = z4;
                                                                    long j14 = d.g;
                                                                    TextPaint textPaint3 = this.U;
                                                                    spannableStringBuilder6.setSpan(new org.telegram.ui.Components.u5(j14, textPaint3 == null ? null : textPaint3.getFontMetricsInt()), indexOf2, indexOf2 + 1, 0);
                                                                    str = spannableStringBuilder6;
                                                                    z17 = true;
                                                                }
                                                                if (z17) {
                                                                    int i37 = this.g1;
                                                                    if (i37 == 2) {
                                                                        TLRPC.Chat chat7 = this.d2;
                                                                        if (chat7 != null) {
                                                                            if (ChatObject.isChannel(chat7)) {
                                                                                TLRPC.Chat chat8 = this.d2;
                                                                                if (!chat8.megagroup) {
                                                                                    int i38 = chat8.participants_count;
                                                                                    str5 = i38 != 0 ? LocaleController.formatPluralStringComma("Subscribers", i38) : !ChatObject.isPublic(chat8) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                                                                                }
                                                                            }
                                                                            TLRPC.Chat chat9 = this.d2;
                                                                            int i39 = chat9.participants_count;
                                                                            str5 = i39 != 0 ? LocaleController.formatPluralStringComma("Members", i39) : chat9.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat9) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase();
                                                                        } else {
                                                                            str5 = "";
                                                                        }
                                                                        this.E3 = false;
                                                                        str4 = str5;
                                                                    } else if (i37 == 3 && UserObject.isUserSelf(this.c2)) {
                                                                        py pyVar = this.w4;
                                                                        str4 = LocaleController.getString((pyVar == null || !pyVar.L0) ? R.string.SavedMessagesInfo : R.string.SavedMessagesInfoQuote);
                                                                    } else {
                                                                        boolean z29 = this.o2;
                                                                        if (!z29 && !SharedConfig.useThreeLinesLayout && this.H0 != 0) {
                                                                            F = G();
                                                                        } else if (z29 || SharedConfig.useThreeLinesLayout || this.G0 == 0) {
                                                                            MessageObject messageObject13 = this.c1;
                                                                            if (!(messageObject13.messageOwner instanceof TLRPC.TL_messageService) || (MessageObject.isTopicActionMessage(messageObject13) && !(this.c1.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate))) {
                                                                                CharSequence charSequence31 = charSequence2;
                                                                                this.S = true;
                                                                                c0();
                                                                                String escape2 = (this.o0 || (user2 = this.c2) == null || !user2.self || this.c1.isOutOwner()) ? null : AndroidUtilities.escape(getMessageNameString());
                                                                                if ((!this.o0 || (user = this.c2) == null || user.self || (messageObject3 = this.c1) == null || !messageObject3.isOutOwner()) && escape2 == null && ((messageObject = this.c1) == null || (message = messageObject.messageOwner) == null || message.guestchat_via_from == null)) {
                                                                                    TLRPC.Chat chat10 = this.d2;
                                                                                    if (chat10 != null) {
                                                                                        long j15 = chat10.id;
                                                                                        if (j15 > 0) {
                                                                                            if (chat != null) {
                                                                                            }
                                                                                            if (ChatObject.isChannel(chat10)) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    TLRPC.User user6 = this.c2;
                                                                                    if (user6 == null || user6.id != UserObject.VERIFY || (messageObject2 = this.c1) == null || messageObject2.getForwardedFromId() == null) {
                                                                                        boolean isEmpty = TextUtils.isEmpty(restrictionReason);
                                                                                        CharSequence charSequence32 = restrictionReason;
                                                                                        if (isEmpty) {
                                                                                            if (MessageObject.isTopicActionMessage(this.c1)) {
                                                                                                MessageObject messageObject14 = this.c1;
                                                                                                CharSequence charSequence33 = messageObject14.messageTextShort;
                                                                                                if (charSequence33 == null || ((messageObject14.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate) && this.M)) {
                                                                                                    charSequence33 = messageObject14.messageText;
                                                                                                }
                                                                                                CharSequence charSequence34 = charSequence33;
                                                                                                charSequence32 = charSequence34;
                                                                                                if (messageObject14.topicIconDrawable[0] instanceof bg.b) {
                                                                                                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.C0).getTopicsController().findTopic(-this.c1.getDialogId(), MessageObject.getTopicId(this.C0, this.c1.messageOwner, true));
                                                                                                    charSequence32 = charSequence34;
                                                                                                    if (findTopic != null) {
                                                                                                        ((bg.b) this.c1.topicIconDrawable[0]).b(findTopic.icon_color);
                                                                                                        charSequence32 = charSequence34;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                TLRPC.MessageMedia messageMedia = this.c1.messageOwner.media;
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
                                                                                                    if (getCaptionMessage() == null || (this.c1.messageOwner.media instanceof TLRPC.TL_messageMediaPoll)) {
                                                                                                        MessageObject messageObject15 = this.c1;
                                                                                                        TLRPC.Message message3 = messageObject15.messageOwner;
                                                                                                        TLRPC.MessageMedia messageMedia2 = message3.media;
                                                                                                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                                                                                            int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia2).extended_media.size();
                                                                                                            if (this.P1) {
                                                                                                                i14 = 1;
                                                                                                                if (size > 1) {
                                                                                                                    c10 = 0;
                                                                                                                    formatPluralString2 = LocaleController.formatPluralString("Media", size, new Object[0]);
                                                                                                                } else {
                                                                                                                    c10 = 0;
                                                                                                                    formatPluralString2 = LocaleController.getString(R.string.AttachVideo);
                                                                                                                }
                                                                                                            } else {
                                                                                                                c10 = 0;
                                                                                                                i14 = 1;
                                                                                                                formatPluralString2 = size > 1 ? LocaleController.formatPluralString("Photos", size, new Object[0]) : LocaleController.getString(R.string.AttachPhoto);
                                                                                                            }
                                                                                                            int i40 = R.string.AttachPaidMedia;
                                                                                                            Object[] objArr = new Object[i14];
                                                                                                            objArr[c10] = formatPluralString2;
                                                                                                            SpannableStringBuilder Q0 = mh.ja.Q0(LocaleController.formatString(i40, objArr));
                                                                                                            this.U = org.telegram.ui.ActionBar.k6.H0[this.B0];
                                                                                                            charSequence32 = Q0;
                                                                                                        } else if (this.O1 > 1) {
                                                                                                            if (this.P1) {
                                                                                                                ArrayList arrayList3 = this.d1;
                                                                                                                formatPluralString = LocaleController.formatPluralString("Media", arrayList3 == null ? 0 : arrayList3.size(), new Object[0]);
                                                                                                            } else {
                                                                                                                ArrayList arrayList4 = this.d1;
                                                                                                                formatPluralString = LocaleController.formatPluralString("Photos", arrayList4 == null ? 0 : arrayList4.size(), new Object[0]);
                                                                                                            }
                                                                                                            charSequence32 = formatPluralString;
                                                                                                            this.U = org.telegram.ui.ActionBar.k6.H0[this.B0];
                                                                                                        } else {
                                                                                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                                                                                                                TLRPC.MessageFwdHeader messageFwdHeader = message3.fwd_from;
                                                                                                                if (messageFwdHeader != null) {
                                                                                                                    TLRPC.Peer peer = messageFwdHeader.from_id;
                                                                                                                    if (peer instanceof TLRPC.TL_peerChannel) {
                                                                                                                        isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(peer.channel_id, this.C0);
                                                                                                                        charSequence14 = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                                                                                                                    }
                                                                                                                }
                                                                                                                isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.d2);
                                                                                                                charSequence14 = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                                                                                                charSequence14 = LocaleController.getString(R.string.BoostingGiveawayResults);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                                                                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                                                                                                                if (tL_textWithEntities2 == null || tL_textWithEntities2.entities == null) {
                                                                                                                    spannableStringBuilder = ah.a.a(R.drawable.dialog_media_poll_20, tL_textWithEntities2.text, false);
                                                                                                                } else {
                                                                                                                    SpannableString spannableString2 = new SpannableString(tL_messageMediaPoll.poll.question.text);
                                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaPoll.poll.question;
                                                                                                                    MediaDataController.addTextStyleRuns(tL_textWithEntities3.entities, tL_textWithEntities3.text, spannableString2);
                                                                                                                    MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString2, org.telegram.ui.ActionBar.k6.F0[this.B0].getFontMetricsInt());
                                                                                                                    spannableStringBuilder = ah.a.a(R.drawable.dialog_media_poll_20, spannableString2, false);
                                                                                                                }
                                                                                                                charSequence14 = spannableStringBuilder;
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                                                                                                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia2;
                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                                                                                                                if (tL_textWithEntities4 == null || tL_textWithEntities4.entities == null) {
                                                                                                                    charSequence14 = ah.a.a(R.drawable.dialog_media_checklist_20, tL_textWithEntities4.text, false);
                                                                                                                } else {
                                                                                                                    SpannableString spannableString3 = new SpannableString(tL_messageMediaToDo.todo.title.text);
                                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_messageMediaToDo.todo.title;
                                                                                                                    MediaDataController.addTextStyleRuns(tL_textWithEntities5.entities, tL_textWithEntities5.text, spannableString3);
                                                                                                                    MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString3, org.telegram.ui.ActionBar.k6.F0[this.B0].getFontMetricsInt());
                                                                                                                    charSequence14 = ah.a.a(R.drawable.dialog_media_checklist_20, spannableString3, false);
                                                                                                                }
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                                                                                charSequence14 = ah.a.a(R.drawable.dialog_media_game_20, messageMedia2.game.title, false);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice) {
                                                                                                                charSequence14 = messageMedia2.title;
                                                                                                            } else if (messageObject15.type == 14) {
                                                                                                                charSequence14 = e2.c.k("🎧 ", messageObject15.getMusicAuthor(), " - ", this.c1.getMusicTitle());
                                                                                                            } else if (!(messageMedia2 instanceof TLRPC.TL_messageMediaStory) || !messageMedia2.via_mention) {
                                                                                                                if (!messageObject15.hasHighlightedWords() || TextUtils.isEmpty(this.c1.messageOwner.message)) {
                                                                                                                    SpannableString spannableString4 = new SpannableString(charSequence31);
                                                                                                                    MessageObject messageObject16 = this.c1;
                                                                                                                    if (messageObject16 != null) {
                                                                                                                        messageObject16.spoilLoginCode();
                                                                                                                    }
                                                                                                                    MediaDataController.addTextStyleRuns(this.c1, spannableString4, 264);
                                                                                                                    MessageObject messageObject17 = this.c1;
                                                                                                                    charSequence13 = spannableString4;
                                                                                                                    if (messageObject17 != null) {
                                                                                                                        TLRPC.Message message4 = messageObject17.messageOwner;
                                                                                                                        charSequence13 = spannableString4;
                                                                                                                        if (message4 != null) {
                                                                                                                            ArrayList<TLRPC.MessageEntity> arrayList5 = message4.entities;
                                                                                                                            TextPaint textPaint4 = this.U;
                                                                                                                            MediaDataController.addAnimatedEmojiSpans(arrayList5, spannableString4, textPaint4 == null ? null : textPaint4.getFontMetricsInt());
                                                                                                                            charSequence13 = spannableString4;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    CharSequence charSequence35 = this.c1.messageTrimmedToHighlight;
                                                                                                                    int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.F + 23);
                                                                                                                    MessageObject messageObject18 = this.c1;
                                                                                                                    charSequence13 = charSequence35;
                                                                                                                    if (messageObject18.messageTrimmedToHighlightCut) {
                                                                                                                        charSequence13 = AndroidUtilities.ellipsizeCenterEnd(charSequence35, messageObject18.highlightedWords.get(0), measuredWidth, this.U, 130);
                                                                                                                    }
                                                                                                                }
                                                                                                                AndroidUtilities.highlightText(charSequence13, this.c1.highlightedWords, this.C4);
                                                                                                                charSequence14 = charSequence13;
                                                                                                            } else if (messageObject15.isOut()) {
                                                                                                                TLRPC.User user7 = MessagesController.getInstance(this.C0).getUser(Long.valueOf(this.c1.getDialogId()));
                                                                                                                if (user7 != null) {
                                                                                                                    str2 = UserObject.getFirstName(user7);
                                                                                                                    int indexOf3 = str2.indexOf(32);
                                                                                                                    c3 = 0;
                                                                                                                    if (indexOf3 >= 0) {
                                                                                                                        str2 = str2.substring(0, indexOf3);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    c3 = 0;
                                                                                                                    str2 = "";
                                                                                                                }
                                                                                                                int i41 = R.string.StoryYouMentionInDialog;
                                                                                                                Object[] objArr2 = new Object[1];
                                                                                                                objArr2[c3] = str2;
                                                                                                                charSequence14 = LocaleController.formatString(i41, objArr2);
                                                                                                            } else {
                                                                                                                charSequence14 = LocaleController.getString(R.string.StoryMentionInDialog);
                                                                                                            }
                                                                                                            CharSequence charSequence36 = charSequence14;
                                                                                                            MessageObject messageObject19 = this.c1;
                                                                                                            if (messageObject19.messageOwner.media == null || messageObject19.isMediaEmpty()) {
                                                                                                                TL_iv.RichMessage richMessage2 = this.c1.messageOwner.rich_message;
                                                                                                                charSequence32 = charSequence36;
                                                                                                                if (richMessage2 != null) {
                                                                                                                    charSequence32 = charSequence36;
                                                                                                                    if (richMessage2.blocks.size() == 1) {
                                                                                                                        charSequence32 = charSequence36;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            this.U = org.telegram.ui.ActionBar.k6.H0[this.B0];
                                                                                                            charSequence32 = charSequence36;
                                                                                                        }
                                                                                                    } else {
                                                                                                        MessageObject captionMessage = getCaptionMessage();
                                                                                                        if (!this.S) {
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
                                                                                                                TextPaint textPaint5 = this.U;
                                                                                                                MediaDataController.addAnimatedEmojiSpans(arrayList6, spannableString5, textPaint5 == null ? null : textPaint5.getFontMetricsInt());
                                                                                                            }
                                                                                                            charSequence32 = new SpannableStringBuilder(str16).append((CharSequence) spannableString5);
                                                                                                        } else {
                                                                                                            CharSequence charSequence37 = captionMessage.messageTrimmedToHighlight;
                                                                                                            int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(this.F + 47);
                                                                                                            if (this.T) {
                                                                                                                if (!TextUtils.isEmpty(null)) {
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                measuredWidth2 = (int) (measuredWidth2 - this.U.measureText(": "));
                                                                                                            }
                                                                                                            if (measuredWidth2 > 0 && captionMessage.messageTrimmedToHighlightCut) {
                                                                                                                charSequence37 = AndroidUtilities.ellipsizeCenterEnd(charSequence37, captionMessage.highlightedWords.get(0), measuredWidth2, this.U, 130);
                                                                                                            }
                                                                                                            charSequence32 = new SpannableStringBuilder(str16).append(charSequence37);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        CharSequence charSequence38 = charSequence32;
                                                                                        if (this.c1.isReplyToStory()) {
                                                                                            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(charSequence32);
                                                                                            spannableStringBuilder7.insert(0, (CharSequence) "d ");
                                                                                            spannableStringBuilder7.setSpan(new oq(f0.e.d(getContext(), R.drawable.msg_mini_replystory).mutate()), 0, 1, 0);
                                                                                            charSequence38 = spannableStringBuilder7;
                                                                                        }
                                                                                        if (this.O1 > 0) {
                                                                                            if (!this.c1.hasHighlightedWords() || TextUtils.isEmpty(this.c1.messageOwner.message)) {
                                                                                                int length4 = charSequence38.length();
                                                                                                CharSequence charSequence39 = charSequence38;
                                                                                                if (length4 > 150) {
                                                                                                    charSequence39 = charSequence38.subSequence(0, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                                                                                                }
                                                                                                replaceNewLines = AndroidUtilities.replaceNewLines(charSequence39);
                                                                                            } else {
                                                                                                replaceNewLines = this.c1.messageTrimmedToHighlight;
                                                                                                int measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp((((this.E4 + 2) * this.O1) + (this.F + 23)) + 3);
                                                                                                MessageObject messageObject20 = this.c1;
                                                                                                if (messageObject20.messageTrimmedToHighlightCut) {
                                                                                                    replaceNewLines = AndroidUtilities.ellipsizeCenterEnd(replaceNewLines, messageObject20.highlightedWords.get(0), measuredWidth3, this.U, 130);
                                                                                                }
                                                                                            }
                                                                                            CharSequence spannableStringBuilder8 = !(replaceNewLines instanceof SpannableStringBuilder) ? new SpannableStringBuilder(replaceNewLines) : replaceNewLines;
                                                                                            SpannableStringBuilder spannableStringBuilder9 = (SpannableStringBuilder) spannableStringBuilder8;
                                                                                            charSequence4 = charSequence9;
                                                                                            spannableStringBuilder9.insert(0, charSequence4);
                                                                                            spannableStringBuilder9.setSpan(new p2(AndroidUtilities.dp(((this.E4 + 2) * this.O1) + 3)), 0, 1, 33);
                                                                                            Emoji.replaceEmoji(spannableStringBuilder9, org.telegram.ui.ActionBar.k6.F0[this.B0].getFontMetricsInt(), false);
                                                                                            CharSequence charSequence40 = spannableStringBuilder8;
                                                                                            if (this.c1.hasHighlightedWords()) {
                                                                                                CharSequence highlightText4 = AndroidUtilities.highlightText(spannableStringBuilder9, this.c1.highlightedWords, this.C4);
                                                                                                charSequence40 = spannableStringBuilder8;
                                                                                                if (highlightText4 != null) {
                                                                                                    charSequence40 = highlightText4;
                                                                                                }
                                                                                            }
                                                                                            z14 = false;
                                                                                            charSequence11 = charSequence40;
                                                                                        } else {
                                                                                            charSequence4 = charSequence9;
                                                                                            charSequence11 = charSequence38;
                                                                                        }
                                                                                        if (this.c1.isForwarded() && this.c1.needDrawForwarded()) {
                                                                                            this.u0 = true;
                                                                                            SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder(charSequence11);
                                                                                            spannableStringBuilder10.insert(0, (CharSequence) "d ");
                                                                                            oq oqVar3 = new oq(f0.e.d(getContext(), R.drawable.mini_forwarded).mutate());
                                                                                            oqVar3.setAlpha(0.9f);
                                                                                            spannableStringBuilder10.setSpan(oqVar3, 0, 1, 0);
                                                                                            charSequence12 = spannableStringBuilder10;
                                                                                        } else {
                                                                                            charSequence12 = charSequence11;
                                                                                        }
                                                                                        z24 = z13;
                                                                                        charSequence18 = charSequence12;
                                                                                        str3 = null;
                                                                                        charSequence15 = charSequence18;
                                                                                        if (this.H0 == 0) {
                                                                                            str6 = G();
                                                                                        } else if (this.G0 != 0) {
                                                                                            str6 = F();
                                                                                        } else {
                                                                                            z23 = z14;
                                                                                            replaceEmoji = charSequence15;
                                                                                            charSequence8 = charSequence10;
                                                                                            string = str3;
                                                                                            charSequence7 = null;
                                                                                            charSequence21 = charSequence8;
                                                                                            if (!this.u0) {
                                                                                            }
                                                                                            if (TextUtils.isEmpty(this.F0)) {
                                                                                            }
                                                                                            stringForMessageListDate = "";
                                                                                            messageObject4 = this.c1;
                                                                                            if (messageObject4 != null) {
                                                                                            }
                                                                                            this.N2 = false;
                                                                                            this.O2 = false;
                                                                                            this.P2 = messageObject4 == null && messageObject4.isSending() && this.E0 == UserConfig.getInstance(this.C0).getClientUserId();
                                                                                            z18 = false;
                                                                                            this.D3 = false;
                                                                                            this.U3 = false;
                                                                                            this.V3 = false;
                                                                                            this.W3 = false;
                                                                                            this.q3 = false;
                                                                                            str7 = null;
                                                                                            str8 = null;
                                                                                            this.M2 = z18;
                                                                                            messagesController = MessagesController.getInstance(this.C0);
                                                                                            if (this.g1 == 0) {
                                                                                            }
                                                                                            charSequence22 = this.I0;
                                                                                            if (charSequence22 == null) {
                                                                                            }
                                                                                            charSequence23 = charSequence21;
                                                                                            str9 = str8;
                                                                                            z4 = z15;
                                                                                            str10 = stringForMessageListDate;
                                                                                            z19 = z23;
                                                                                            charSequence24 = charSequence7;
                                                                                        }
                                                                                        z23 = z14;
                                                                                        replaceEmoji = charSequence15;
                                                                                        string = str6;
                                                                                        charSequence8 = charSequence10;
                                                                                        charSequence7 = null;
                                                                                        charSequence21 = charSequence8;
                                                                                        if (!this.u0) {
                                                                                        }
                                                                                        if (TextUtils.isEmpty(this.F0)) {
                                                                                        }
                                                                                        stringForMessageListDate = "";
                                                                                        messageObject4 = this.c1;
                                                                                        if (messageObject4 != null) {
                                                                                        }
                                                                                        this.N2 = false;
                                                                                        this.O2 = false;
                                                                                        this.P2 = messageObject4 == null && messageObject4.isSending() && this.E0 == UserConfig.getInstance(this.C0).getClientUserId();
                                                                                        z18 = false;
                                                                                        this.D3 = false;
                                                                                        this.U3 = false;
                                                                                        this.V3 = false;
                                                                                        this.W3 = false;
                                                                                        this.q3 = false;
                                                                                        str7 = null;
                                                                                        str8 = null;
                                                                                        this.M2 = z18;
                                                                                        messagesController = MessagesController.getInstance(this.C0);
                                                                                        if (this.g1 == 0) {
                                                                                        }
                                                                                        charSequence22 = this.I0;
                                                                                        if (charSequence22 == null) {
                                                                                        }
                                                                                        charSequence23 = charSequence21;
                                                                                        str9 = str8;
                                                                                        z4 = z15;
                                                                                        str10 = stringForMessageListDate;
                                                                                        z19 = z23;
                                                                                        charSequence24 = charSequence7;
                                                                                    }
                                                                                }
                                                                                charSequence4 = charSequence9;
                                                                                if (escape2 == null) {
                                                                                    escape2 = getMessageNameString();
                                                                                }
                                                                                String escape3 = AndroidUtilities.escape(escape2);
                                                                                TLRPC.Chat chat11 = this.d2;
                                                                                if (chat11 != null && chat11.forum && !this.M && !this.L) {
                                                                                    CharSequence topicIconName = MessagesController.getInstance(this.C0).getTopicsController().getTopicIconName(this.d2, this.c1, this.U);
                                                                                    if (!TextUtils.isEmpty(topicIconName)) {
                                                                                        SpannableStringBuilder spannableStringBuilder11 = new SpannableStringBuilder("-");
                                                                                        oq oqVar4 = new oq(f0.e.d(ApplicationLoader.applicationContext, R.drawable.msg_mini_forumarrow).mutate());
                                                                                        oqVar4.setColorKey((this.o2 || SharedConfig.useThreeLinesLayout) ? -1 : org.telegram.ui.ActionBar.k6.k9);
                                                                                        spannableStringBuilder11.setSpan(oqVar4, 0, 1, 0);
                                                                                        ?? spannableStringBuilder12 = new SpannableStringBuilder();
                                                                                        spannableStringBuilder12.append(escape3).append((CharSequence) spannableStringBuilder11).append(topicIconName);
                                                                                        str3 = spannableStringBuilder12;
                                                                                        SpannableStringBuilder K2 = K(i30, str3, restrictionReason, false);
                                                                                        if (!this.L || ((this.o2 || SharedConfig.useThreeLinesLayout) && (this.G0 == 0 || K2.length() <= 0))) {
                                                                                            i15 = 0;
                                                                                        } else {
                                                                                            try {
                                                                                                f10 f10Var = new f10(org.telegram.ui.ActionBar.k6.k9, this.C4);
                                                                                                i15 = str3.length() + 1;
                                                                                                try {
                                                                                                    K2.setSpan(f10Var, 0, i15, 33);
                                                                                                } catch (Exception e6) {
                                                                                                    e = e6;
                                                                                                    FileLog.e(e);
                                                                                                    replaceEmoji2 = Emoji.replaceEmoji(K2, org.telegram.ui.ActionBar.k6.F0[this.B0].getFontMetricsInt(), false);
                                                                                                    if (this.c1.hasHighlightedWords()) {
                                                                                                    }
                                                                                                    if (this.O1 > 0) {
                                                                                                    }
                                                                                                    charSequence15 = replaceEmoji2;
                                                                                                    z24 = z13;
                                                                                                    z14 = false;
                                                                                                    if (this.H0 == 0) {
                                                                                                    }
                                                                                                    z23 = z14;
                                                                                                    replaceEmoji = charSequence15;
                                                                                                    string = str6;
                                                                                                    charSequence8 = charSequence10;
                                                                                                    charSequence7 = null;
                                                                                                    charSequence21 = charSequence8;
                                                                                                    if (!this.u0) {
                                                                                                    }
                                                                                                    if (TextUtils.isEmpty(this.F0)) {
                                                                                                    }
                                                                                                    stringForMessageListDate = "";
                                                                                                    messageObject4 = this.c1;
                                                                                                    if (messageObject4 != null) {
                                                                                                    }
                                                                                                    this.N2 = false;
                                                                                                    this.O2 = false;
                                                                                                    this.P2 = messageObject4 == null && messageObject4.isSending() && this.E0 == UserConfig.getInstance(this.C0).getClientUserId();
                                                                                                    z18 = false;
                                                                                                    this.D3 = false;
                                                                                                    this.U3 = false;
                                                                                                    this.V3 = false;
                                                                                                    this.W3 = false;
                                                                                                    this.q3 = false;
                                                                                                    str7 = null;
                                                                                                    str8 = null;
                                                                                                    this.M2 = z18;
                                                                                                    messagesController = MessagesController.getInstance(this.C0);
                                                                                                    if (this.g1 == 0) {
                                                                                                    }
                                                                                                    charSequence22 = this.I0;
                                                                                                    if (charSequence22 == null) {
                                                                                                    }
                                                                                                    charSequence23 = charSequence21;
                                                                                                    str9 = str8;
                                                                                                    z4 = z15;
                                                                                                    str10 = stringForMessageListDate;
                                                                                                    z19 = z23;
                                                                                                    charSequence24 = charSequence7;
                                                                                                    CharSequence charSequence41 = string;
                                                                                                    if (z4) {
                                                                                                    }
                                                                                                    if (E()) {
                                                                                                    }
                                                                                                    if (LocaleController.isRTL) {
                                                                                                    }
                                                                                                    if (this.D2) {
                                                                                                    }
                                                                                                    if (!this.P2) {
                                                                                                    }
                                                                                                    f13 = 5.0f;
                                                                                                    if (this.W0) {
                                                                                                    }
                                                                                                    if (!this.e4) {
                                                                                                    }
                                                                                                    if (z22) {
                                                                                                    }
                                                                                                    f14 = 36.0f;
                                                                                                    if (this.d4) {
                                                                                                    }
                                                                                                    dp7 = this.v2 - AndroidUtilities.dp(12.0f);
                                                                                                    if (dp7 < 0) {
                                                                                                    }
                                                                                                    if (charSequence22 instanceof String) {
                                                                                                    }
                                                                                                    if (this.A2) {
                                                                                                    }
                                                                                                    float f22 = dp7;
                                                                                                    this.O = org.telegram.ui.ActionBar.k6.B0[this.B0].measureText(charSequence22.toString()) <= f22;
                                                                                                    if (!this.N) {
                                                                                                    }
                                                                                                    CharSequence replaceEmoji3 = Emoji.replaceEmoji(charSequence22, org.telegram.ui.ActionBar.k6.B0[this.B0].getFontMetricsInt(), false);
                                                                                                    MessageObject messageObject21 = this.c1;
                                                                                                    if (messageObject21 == null) {
                                                                                                    }
                                                                                                    if (this.N) {
                                                                                                    }
                                                                                                    this.y2 = (this.A2 || !this.w2.isRtlCharAt(0)) ? 0.0f : -AndroidUtilities.dp(f14);
                                                                                                    this.z2 = this.w2.isRtlCharAt(0);
                                                                                                    this.m3 = org.telegram.ui.Components.u5.update(0, (View) this, this.m3, this.w2);
                                                                                                    if (this.o2) {
                                                                                                    }
                                                                                                    f18 = 39.0f;
                                                                                                    f19 = 32.0f;
                                                                                                    f20 = 30.0f;
                                                                                                    f21 = 24.0f;
                                                                                                    dp = AndroidUtilities.dp(11.0f);
                                                                                                    this.n3 = AndroidUtilities.dp(32.0f);
                                                                                                    this.J2 = AndroidUtilities.dp(13.0f);
                                                                                                    this.r3 = AndroidUtilities.dp(42.33f);
                                                                                                    this.z3 = AndroidUtilities.dp(43.0f);
                                                                                                    this.F3 = AndroidUtilities.dp(42.33f);
                                                                                                    this.T2 = AndroidUtilities.dp(13.0f);
                                                                                                    int measuredWidth4 = getMeasuredWidth() - AndroidUtilities.dp(this.F + 21);
                                                                                                    if (LocaleController.isRTL) {
                                                                                                    }
                                                                                                    i20 = dp3;
                                                                                                    this.r0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
                                                                                                    i21 = 0;
                                                                                                    while (true) {
                                                                                                        imageReceiverArr = this.S1;
                                                                                                        if (i21 >= imageReceiverArr.length) {
                                                                                                        }
                                                                                                        imageReceiverArr[i21].setImageCoords(((this.E4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.N ? AndroidUtilities.dp(20.0f) : 0)) - ((this.o2 || SharedConfig.useThreeLinesLayout || (isVar = this.q0) == null || isVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                                                                                                        i21++;
                                                                                                        dp = dp;
                                                                                                    }
                                                                                                    i22 = dp;
                                                                                                    i23 = measuredWidth4;
                                                                                                    if (LocaleController.isRTL) {
                                                                                                    }
                                                                                                    if (this.N) {
                                                                                                    }
                                                                                                    if (!this.o2) {
                                                                                                    }
                                                                                                    this.J2 -= AndroidUtilities.dp(f16);
                                                                                                    this.T2 -= AndroidUtilities.dp(f16);
                                                                                                    if (getIsPinned()) {
                                                                                                    }
                                                                                                    if (!this.q3) {
                                                                                                    }
                                                                                                    if (z19) {
                                                                                                    }
                                                                                                    max = Math.max(AndroidUtilities.dp(12.0f), i23);
                                                                                                    this.d3 = AndroidUtilities.dp((!this.o2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                                                                                                    if (!this.o2) {
                                                                                                    }
                                                                                                    this.d3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
                                                                                                    if (Q()) {
                                                                                                    }
                                                                                                    if (this.N) {
                                                                                                    }
                                                                                                    this.k3 = org.telegram.ui.Components.u5.update(0, (View) this, this.k3, this.p3);
                                                                                                    if (TextUtils.isEmpty(charSequence24)) {
                                                                                                    }
                                                                                                    this.l3 = org.telegram.ui.Components.u5.update(0, (View) this, this.l3, this.e3);
                                                                                                    if (!TextUtils.isEmpty(charSequence23)) {
                                                                                                    }
                                                                                                    if (replaceEmoji instanceof Spannable) {
                                                                                                    }
                                                                                                    if (this.o2) {
                                                                                                    }
                                                                                                    this.U = org.telegram.ui.ActionBar.k6.F0[this.B0];
                                                                                                    charSequence26 = charSequence41;
                                                                                                    charSequence41 = null;
                                                                                                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                                                                                                    if (this.o2) {
                                                                                                    }
                                                                                                    if (this.O1 > 0) {
                                                                                                    }
                                                                                                    int i42 = max;
                                                                                                    TextPaint textPaint6 = this.U;
                                                                                                    float dp9 = AndroidUtilities.dp(1.0f);
                                                                                                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                                                                                    this.b3 = kw0.b(charSequence26, textPaint6, i42, dp9, i42, charSequence41 != null ? 1 : 2);
                                                                                                    max = i42;
                                                                                                    this.f3.addAll(this.g3);
                                                                                                    this.g3.clear();
                                                                                                    jh.k.b(this, this.b3, -2, -2, this.f3, this.g3);
                                                                                                    int i43 = max;
                                                                                                    this.j3 = org.telegram.ui.Components.u5.update(0, (View) this, this.j3, this.b3);
                                                                                                    if (LocaleController.isRTL) {
                                                                                                    }
                                                                                                    staticLayout = this.c3;
                                                                                                    if (staticLayout != null) {
                                                                                                    }
                                                                                                    e0();
                                                                                                }
                                                                                            } catch (Exception e10) {
                                                                                                e = e10;
                                                                                                i15 = 0;
                                                                                            }
                                                                                        }
                                                                                        replaceEmoji2 = Emoji.replaceEmoji(K2, org.telegram.ui.ActionBar.k6.F0[this.B0].getFontMetricsInt(), false);
                                                                                        if (this.c1.hasHighlightedWords() && (highlightText = AndroidUtilities.highlightText(replaceEmoji2, this.c1.highlightedWords, this.C4)) != null) {
                                                                                            replaceEmoji2 = highlightText;
                                                                                        }
                                                                                        if (this.O1 > 0) {
                                                                                            if (!(replaceEmoji2 instanceof SpannableStringBuilder)) {
                                                                                                replaceEmoji2 = new SpannableStringBuilder(replaceEmoji2);
                                                                                            }
                                                                                            SpannableStringBuilder spannableStringBuilder13 = (SpannableStringBuilder) replaceEmoji2;
                                                                                            if (i15 >= spannableStringBuilder13.length()) {
                                                                                                spannableStringBuilder13.append(charSequence4);
                                                                                                spannableStringBuilder13.setSpan(new p2(AndroidUtilities.dp(((this.E4 + 2) * this.O1) + 3)), spannableStringBuilder13.length() - 1, spannableStringBuilder13.length(), 33);
                                                                                            } else {
                                                                                                spannableStringBuilder13.insert(i15, charSequence4);
                                                                                                spannableStringBuilder13.setSpan(new p2(AndroidUtilities.dp(((this.E4 + 2) * this.O1) + 3)), i15, i15 + 1, 33);
                                                                                            }
                                                                                        }
                                                                                        charSequence15 = replaceEmoji2;
                                                                                        z24 = z13;
                                                                                        z14 = false;
                                                                                        if (this.H0 == 0) {
                                                                                        }
                                                                                        z23 = z14;
                                                                                        replaceEmoji = charSequence15;
                                                                                        string = str6;
                                                                                        charSequence8 = charSequence10;
                                                                                        charSequence7 = null;
                                                                                        charSequence21 = charSequence8;
                                                                                        if (!this.u0) {
                                                                                        }
                                                                                        if (TextUtils.isEmpty(this.F0)) {
                                                                                        }
                                                                                        stringForMessageListDate = "";
                                                                                        messageObject4 = this.c1;
                                                                                        if (messageObject4 != null) {
                                                                                        }
                                                                                        this.N2 = false;
                                                                                        this.O2 = false;
                                                                                        this.P2 = messageObject4 == null && messageObject4.isSending() && this.E0 == UserConfig.getInstance(this.C0).getClientUserId();
                                                                                        z18 = false;
                                                                                        this.D3 = false;
                                                                                        this.U3 = false;
                                                                                        this.V3 = false;
                                                                                        this.W3 = false;
                                                                                        this.q3 = false;
                                                                                        str7 = null;
                                                                                        str8 = null;
                                                                                        this.M2 = z18;
                                                                                        messagesController = MessagesController.getInstance(this.C0);
                                                                                        if (this.g1 == 0) {
                                                                                        }
                                                                                        charSequence22 = this.I0;
                                                                                        if (charSequence22 == null) {
                                                                                        }
                                                                                        charSequence23 = charSequence21;
                                                                                        str9 = str8;
                                                                                        z4 = z15;
                                                                                        str10 = stringForMessageListDate;
                                                                                        z19 = z23;
                                                                                        charSequence24 = charSequence7;
                                                                                    }
                                                                                }
                                                                                str3 = escape3;
                                                                                SpannableStringBuilder K22 = K(i30, str3, restrictionReason, false);
                                                                                if (this.L) {
                                                                                }
                                                                                i15 = 0;
                                                                                replaceEmoji2 = Emoji.replaceEmoji(K22, org.telegram.ui.ActionBar.k6.F0[this.B0].getFontMetricsInt(), false);
                                                                                if (this.c1.hasHighlightedWords()) {
                                                                                    replaceEmoji2 = highlightText;
                                                                                }
                                                                                if (this.O1 > 0) {
                                                                                }
                                                                                charSequence15 = replaceEmoji2;
                                                                                z24 = z13;
                                                                                z14 = false;
                                                                                if (this.H0 == 0) {
                                                                                }
                                                                                z23 = z14;
                                                                                replaceEmoji = charSequence15;
                                                                                string = str6;
                                                                                charSequence8 = charSequence10;
                                                                                charSequence7 = null;
                                                                                charSequence21 = charSequence8;
                                                                                if (!this.u0) {
                                                                                }
                                                                                if (TextUtils.isEmpty(this.F0)) {
                                                                                }
                                                                                stringForMessageListDate = "";
                                                                                messageObject4 = this.c1;
                                                                                if (messageObject4 != null) {
                                                                                }
                                                                                this.N2 = false;
                                                                                this.O2 = false;
                                                                                this.P2 = messageObject4 == null && messageObject4.isSending() && this.E0 == UserConfig.getInstance(this.C0).getClientUserId();
                                                                                z18 = false;
                                                                                this.D3 = false;
                                                                                this.U3 = false;
                                                                                this.V3 = false;
                                                                                this.W3 = false;
                                                                                this.q3 = false;
                                                                                str7 = null;
                                                                                str8 = null;
                                                                                this.M2 = z18;
                                                                                messagesController = MessagesController.getInstance(this.C0);
                                                                                if (this.g1 == 0) {
                                                                                }
                                                                                charSequence22 = this.I0;
                                                                                if (charSequence22 == null) {
                                                                                }
                                                                                charSequence23 = charSequence21;
                                                                                str9 = str8;
                                                                                z4 = z15;
                                                                                str10 = stringForMessageListDate;
                                                                                z19 = z23;
                                                                                charSequence24 = charSequence7;
                                                                            } else {
                                                                                MessageObject messageObject22 = this.c1;
                                                                                TLRPC.MessageAction messageAction = messageObject22.messageOwner.action;
                                                                                if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                                                                                    TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall = (TLRPC.TL_messageActionPhoneCall) messageAction;
                                                                                    charSequence16 = messageObject22.isOutOwner() ? ah.a.a(tL_messageActionPhoneCall.video ? R.drawable.dialog_media_outgoing_video_call_20 : R.drawable.dialog_media_outgoing_call_20, charSequence2, false) : ah.a.a(tL_messageActionPhoneCall.video ? R.drawable.dialog_media_incoming_video_call_20 : R.drawable.dialog_media_incoming_call_20, charSequence2, false);
                                                                                } else {
                                                                                    CharSequence charSequence42 = charSequence2;
                                                                                    if (ChatObject.isChannelAndNotMegaGroup(this.d2) && (this.c1.messageOwner.action instanceof TLRPC.TL_messageActionChannelMigrateFrom)) {
                                                                                        charSequence16 = "";
                                                                                        z24 = false;
                                                                                        this.U = org.telegram.ui.ActionBar.k6.H0[this.B0];
                                                                                        if (this.c1.type != 21) {
                                                                                            c0();
                                                                                            charSequence17 = s(charSequence16);
                                                                                        } else {
                                                                                            charSequence17 = charSequence16;
                                                                                        }
                                                                                    } else {
                                                                                        CharSequence charSequence43 = this.c1.messageTextShort;
                                                                                        charSequence16 = charSequence43 != null ? charSequence43 : charSequence42;
                                                                                    }
                                                                                }
                                                                                z24 = z13;
                                                                                this.U = org.telegram.ui.ActionBar.k6.H0[this.B0];
                                                                                if (this.c1.type != 21) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            F = F();
                                                                        }
                                                                        charSequence18 = F;
                                                                        z24 = z13;
                                                                        charSequence4 = charSequence9;
                                                                        z14 = false;
                                                                        str3 = null;
                                                                        charSequence15 = charSequence18;
                                                                        if (this.H0 == 0) {
                                                                        }
                                                                        z23 = z14;
                                                                        replaceEmoji = charSequence15;
                                                                        string = str6;
                                                                        charSequence8 = charSequence10;
                                                                        charSequence7 = null;
                                                                        charSequence21 = charSequence8;
                                                                        if (!this.u0) {
                                                                        }
                                                                        if (TextUtils.isEmpty(this.F0)) {
                                                                        }
                                                                        stringForMessageListDate = "";
                                                                        messageObject4 = this.c1;
                                                                        if (messageObject4 != null) {
                                                                        }
                                                                        this.N2 = false;
                                                                        this.O2 = false;
                                                                        this.P2 = messageObject4 == null && messageObject4.isSending() && this.E0 == UserConfig.getInstance(this.C0).getClientUserId();
                                                                        z18 = false;
                                                                        this.D3 = false;
                                                                        this.U3 = false;
                                                                        this.V3 = false;
                                                                        this.W3 = false;
                                                                        this.q3 = false;
                                                                        str7 = null;
                                                                        str8 = null;
                                                                        this.M2 = z18;
                                                                        messagesController = MessagesController.getInstance(this.C0);
                                                                        if (this.g1 == 0) {
                                                                        }
                                                                        charSequence22 = this.I0;
                                                                        if (charSequence22 == null) {
                                                                        }
                                                                        charSequence23 = charSequence21;
                                                                        str9 = str8;
                                                                        z4 = z15;
                                                                        str10 = stringForMessageListDate;
                                                                        z19 = z23;
                                                                        charSequence24 = charSequence7;
                                                                    }
                                                                    charSequence4 = charSequence9;
                                                                    z24 = false;
                                                                    str3 = null;
                                                                    z15 = false;
                                                                    charSequence15 = str4;
                                                                    if (this.H0 == 0) {
                                                                    }
                                                                    z23 = z14;
                                                                    replaceEmoji = charSequence15;
                                                                    string = str6;
                                                                    charSequence8 = charSequence10;
                                                                    charSequence7 = null;
                                                                    charSequence21 = charSequence8;
                                                                    if (!this.u0) {
                                                                    }
                                                                    if (TextUtils.isEmpty(this.F0)) {
                                                                    }
                                                                    stringForMessageListDate = "";
                                                                    messageObject4 = this.c1;
                                                                    if (messageObject4 != null) {
                                                                    }
                                                                    this.N2 = false;
                                                                    this.O2 = false;
                                                                    this.P2 = messageObject4 == null && messageObject4.isSending() && this.E0 == UserConfig.getInstance(this.C0).getClientUserId();
                                                                    z18 = false;
                                                                    this.D3 = false;
                                                                    this.U3 = false;
                                                                    this.V3 = false;
                                                                    this.W3 = false;
                                                                    this.q3 = false;
                                                                    str7 = null;
                                                                    str8 = null;
                                                                    this.M2 = z18;
                                                                    messagesController = MessagesController.getInstance(this.C0);
                                                                    if (this.g1 == 0) {
                                                                    }
                                                                    charSequence22 = this.I0;
                                                                    if (charSequence22 == null) {
                                                                    }
                                                                    charSequence23 = charSequence21;
                                                                    str9 = str8;
                                                                    z4 = z15;
                                                                    str10 = stringForMessageListDate;
                                                                    z19 = z23;
                                                                    charSequence24 = charSequence7;
                                                                } else {
                                                                    charSequence17 = str;
                                                                    z24 = z13;
                                                                }
                                                                charSequence4 = charSequence9;
                                                                charSequence18 = charSequence17;
                                                                str3 = null;
                                                                charSequence15 = charSequence18;
                                                                if (this.H0 == 0) {
                                                                }
                                                                z23 = z14;
                                                                replaceEmoji = charSequence15;
                                                                string = str6;
                                                                charSequence8 = charSequence10;
                                                                charSequence7 = null;
                                                                charSequence21 = charSequence8;
                                                                if (!this.u0) {
                                                                }
                                                                if (TextUtils.isEmpty(this.F0)) {
                                                                }
                                                                stringForMessageListDate = "";
                                                                messageObject4 = this.c1;
                                                                if (messageObject4 != null) {
                                                                }
                                                                this.N2 = false;
                                                                this.O2 = false;
                                                                this.P2 = messageObject4 == null && messageObject4.isSending() && this.E0 == UserConfig.getInstance(this.C0).getClientUserId();
                                                                z18 = false;
                                                                this.D3 = false;
                                                                this.U3 = false;
                                                                this.V3 = false;
                                                                this.W3 = false;
                                                                this.q3 = false;
                                                                str7 = null;
                                                                str8 = null;
                                                                this.M2 = z18;
                                                                messagesController = MessagesController.getInstance(this.C0);
                                                                if (this.g1 == 0) {
                                                                }
                                                                charSequence22 = this.I0;
                                                                if (charSequence22 == null) {
                                                                }
                                                                charSequence23 = charSequence21;
                                                                str9 = str8;
                                                                z4 = z15;
                                                                str10 = stringForMessageListDate;
                                                                z19 = z23;
                                                                charSequence24 = charSequence7;
                                                            }
                                                        }
                                                    }
                                                    charSequence10 = charSequence3;
                                                    z15 = z4;
                                                } else {
                                                    z15 = z4;
                                                    charSequence9 = " ";
                                                    charSequence10 = charSequence3;
                                                }
                                                str = "";
                                                z17 = false;
                                                if (z17) {
                                                }
                                                charSequence4 = charSequence9;
                                                charSequence18 = charSequence17;
                                                str3 = null;
                                                charSequence15 = charSequence18;
                                                if (this.H0 == 0) {
                                                }
                                                z23 = z14;
                                                replaceEmoji = charSequence15;
                                                string = str6;
                                                charSequence8 = charSequence10;
                                                charSequence7 = null;
                                                charSequence21 = charSequence8;
                                                if (!this.u0) {
                                                }
                                                if (TextUtils.isEmpty(this.F0)) {
                                                }
                                                stringForMessageListDate = "";
                                                messageObject4 = this.c1;
                                                if (messageObject4 != null) {
                                                }
                                                this.N2 = false;
                                                this.O2 = false;
                                                this.P2 = messageObject4 == null && messageObject4.isSending() && this.E0 == UserConfig.getInstance(this.C0).getClientUserId();
                                                z18 = false;
                                                this.D3 = false;
                                                this.U3 = false;
                                                this.V3 = false;
                                                this.W3 = false;
                                                this.q3 = false;
                                                str7 = null;
                                                str8 = null;
                                                this.M2 = z18;
                                                messagesController = MessagesController.getInstance(this.C0);
                                                if (this.g1 == 0) {
                                                }
                                                charSequence22 = this.I0;
                                                if (charSequence22 == null) {
                                                }
                                                charSequence23 = charSequence21;
                                                str9 = str8;
                                                z4 = z15;
                                                str10 = stringForMessageListDate;
                                                z19 = z23;
                                                charSequence24 = charSequence7;
                                            } else if (this.H0 != 0) {
                                                formatString = G();
                                            } else if (this.G0 != 0) {
                                                formatString = F();
                                            } else {
                                                TLRPC.EncryptedChat encryptedChat = this.e2;
                                                if (encryptedChat != null) {
                                                    this.U = org.telegram.ui.ActionBar.k6.H0[this.B0];
                                                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                                                        formatString = LocaleController.getString(R.string.EncryptionProcessing);
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                                                        formatString = LocaleController.formatString(R.string.AwaitingEncryption, UserObject.getFirstName(this.c2));
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                                                        formatString = LocaleController.getString(R.string.EncryptionRejected);
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                                                        formatString = encryptedChat.admin_id == UserConfig.getInstance(this.C0).getClientUserId() ? LocaleController.formatString(R.string.EncryptedChatStartedOutgoing, UserObject.getFirstName(this.c2)) : LocaleController.getString(R.string.EncryptedChatStartedIncoming);
                                                    }
                                                } else if (this.g1 == 3 && UserObject.isUserSelf(this.c2)) {
                                                    py pyVar2 = this.w4;
                                                    z23 = z14;
                                                    replaceEmoji = LocaleController.getString((pyVar2 == null || !pyVar2.L0) ? R.string.SavedMessagesInfo : R.string.SavedMessagesInfoQuote);
                                                    charSequence4 = " ";
                                                    string = null;
                                                    charSequence7 = null;
                                                    z24 = false;
                                                    z15 = false;
                                                    charSequence21 = charSequence3;
                                                    if (!this.u0) {
                                                    }
                                                    if (TextUtils.isEmpty(this.F0)) {
                                                    }
                                                    stringForMessageListDate = "";
                                                    messageObject4 = this.c1;
                                                    if (messageObject4 != null) {
                                                    }
                                                    this.N2 = false;
                                                    this.O2 = false;
                                                    this.P2 = messageObject4 == null && messageObject4.isSending() && this.E0 == UserConfig.getInstance(this.C0).getClientUserId();
                                                    z18 = false;
                                                    this.D3 = false;
                                                    this.U3 = false;
                                                    this.V3 = false;
                                                    this.W3 = false;
                                                    this.q3 = false;
                                                    str7 = null;
                                                    str8 = null;
                                                    this.M2 = z18;
                                                    messagesController = MessagesController.getInstance(this.C0);
                                                    if (this.g1 == 0) {
                                                    }
                                                    charSequence22 = this.I0;
                                                    if (charSequence22 == null) {
                                                    }
                                                    charSequence23 = charSequence21;
                                                    str9 = str8;
                                                    z4 = z15;
                                                    str10 = stringForMessageListDate;
                                                    z19 = z23;
                                                    charSequence24 = charSequence7;
                                                }
                                                z23 = z14;
                                                z15 = z4;
                                                charSequence4 = " ";
                                                replaceEmoji = "";
                                                z24 = z13;
                                                string = null;
                                                charSequence8 = charSequence3;
                                                charSequence7 = null;
                                                charSequence21 = charSequence8;
                                                if (!this.u0) {
                                                }
                                                if (TextUtils.isEmpty(this.F0)) {
                                                }
                                                stringForMessageListDate = "";
                                                messageObject4 = this.c1;
                                                if (messageObject4 != null) {
                                                }
                                                this.N2 = false;
                                                this.O2 = false;
                                                this.P2 = messageObject4 == null && messageObject4.isSending() && this.E0 == UserConfig.getInstance(this.C0).getClientUserId();
                                                z18 = false;
                                                this.D3 = false;
                                                this.U3 = false;
                                                this.V3 = false;
                                                this.W3 = false;
                                                this.q3 = false;
                                                str7 = null;
                                                str8 = null;
                                                this.M2 = z18;
                                                messagesController = MessagesController.getInstance(this.C0);
                                                if (this.g1 == 0) {
                                                }
                                                charSequence22 = this.I0;
                                                if (charSequence22 == null) {
                                                }
                                                charSequence23 = charSequence21;
                                                str9 = str8;
                                                z4 = z15;
                                                str10 = stringForMessageListDate;
                                                z19 = z23;
                                                charSequence24 = charSequence7;
                                            }
                                        }
                                        z23 = z14;
                                        z15 = z4;
                                        replaceEmoji = formatString;
                                        charSequence4 = " ";
                                        z24 = z13;
                                        string = null;
                                        charSequence8 = charSequence3;
                                        charSequence7 = null;
                                        charSequence21 = charSequence8;
                                        if (!this.u0) {
                                        }
                                        if (TextUtils.isEmpty(this.F0)) {
                                        }
                                        stringForMessageListDate = "";
                                        messageObject4 = this.c1;
                                        if (messageObject4 != null) {
                                        }
                                        this.N2 = false;
                                        this.O2 = false;
                                        this.P2 = messageObject4 == null && messageObject4.isSending() && this.E0 == UserConfig.getInstance(this.C0).getClientUserId();
                                        z18 = false;
                                        this.D3 = false;
                                        this.U3 = false;
                                        this.V3 = false;
                                        this.W3 = false;
                                        this.q3 = false;
                                        str7 = null;
                                        str8 = null;
                                        this.M2 = z18;
                                        messagesController = MessagesController.getInstance(this.C0);
                                        if (this.g1 == 0) {
                                        }
                                        charSequence22 = this.I0;
                                        if (charSequence22 == null) {
                                        }
                                        charSequence23 = charSequence21;
                                        str9 = str8;
                                        z4 = z15;
                                        str10 = stringForMessageListDate;
                                        z19 = z23;
                                        charSequence24 = charSequence7;
                                    }
                                } else {
                                    this.i2 = null;
                                    this.h2 = false;
                                    charSequence19 = this.F0;
                                    this.U = org.telegram.ui.ActionBar.k6.F0[this.B0];
                                    z15 = z4;
                                    string = null;
                                    charSequence20 = null;
                                }
                            }
                            replaceEmoji = charSequence19;
                            charSequence4 = " ";
                            charSequence21 = "";
                            i13 = -1;
                            charSequence7 = charSequence20;
                            if (!this.u0) {
                            }
                            if (TextUtils.isEmpty(this.F0)) {
                            }
                            stringForMessageListDate = "";
                            messageObject4 = this.c1;
                            if (messageObject4 != null) {
                            }
                            this.N2 = false;
                            this.O2 = false;
                            this.P2 = messageObject4 == null && messageObject4.isSending() && this.E0 == UserConfig.getInstance(this.C0).getClientUserId();
                            z18 = false;
                            this.D3 = false;
                            this.U3 = false;
                            this.V3 = false;
                            this.W3 = false;
                            this.q3 = false;
                            str7 = null;
                            str8 = null;
                            this.M2 = z18;
                            messagesController = MessagesController.getInstance(this.C0);
                            if (this.g1 == 0) {
                            }
                            charSequence22 = this.I0;
                            if (charSequence22 == null) {
                            }
                            charSequence23 = charSequence21;
                            str9 = str8;
                            z4 = z15;
                            str10 = stringForMessageListDate;
                            z19 = z23;
                            charSequence24 = charSequence7;
                        }
                    }
                    draftMessage = this.i2;
                    if (draftMessage != null) {
                        if (i12 > draftMessage.date) {
                        }
                    }
                }
                if (ChatObject.isChannel(this.d2)) {
                    TLRPC.Chat chat12 = this.d2;
                    if (!chat12.megagroup) {
                        if (!chat12.creator) {
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = chat12.admin_rights;
                            if (tL_chatAdminRights != null) {
                            }
                            this.i2 = null;
                            this.h2 = false;
                            if (Q()) {
                            }
                            replaceEmoji = charSequence19;
                            charSequence4 = " ";
                            charSequence21 = "";
                            i13 = -1;
                            charSequence7 = charSequence20;
                            if (!this.u0) {
                            }
                            if (TextUtils.isEmpty(this.F0)) {
                            }
                            stringForMessageListDate = "";
                            messageObject4 = this.c1;
                            if (messageObject4 != null) {
                            }
                            this.N2 = false;
                            this.O2 = false;
                            this.P2 = messageObject4 == null && messageObject4.isSending() && this.E0 == UserConfig.getInstance(this.C0).getClientUserId();
                            z18 = false;
                            this.D3 = false;
                            this.U3 = false;
                            this.V3 = false;
                            this.W3 = false;
                            this.q3 = false;
                            str7 = null;
                            str8 = null;
                            this.M2 = z18;
                            messagesController = MessagesController.getInstance(this.C0);
                            if (this.g1 == 0) {
                            }
                            charSequence22 = this.I0;
                            if (charSequence22 == null) {
                            }
                            charSequence23 = charSequence21;
                            str9 = str8;
                            z4 = z15;
                            str10 = stringForMessageListDate;
                            z19 = z23;
                            charSequence24 = charSequence7;
                        }
                    }
                }
                chat2 = this.d2;
                if (chat2 != null) {
                    if (chat2.left) {
                    }
                    this.i2 = null;
                    this.h2 = false;
                    if (Q()) {
                    }
                    replaceEmoji = charSequence19;
                    charSequence4 = " ";
                    charSequence21 = "";
                    i13 = -1;
                    charSequence7 = charSequence20;
                    if (!this.u0) {
                    }
                    if (TextUtils.isEmpty(this.F0)) {
                    }
                    stringForMessageListDate = "";
                    messageObject4 = this.c1;
                    if (messageObject4 != null) {
                    }
                    this.N2 = false;
                    this.O2 = false;
                    this.P2 = messageObject4 == null && messageObject4.isSending() && this.E0 == UserConfig.getInstance(this.C0).getClientUserId();
                    z18 = false;
                    this.D3 = false;
                    this.U3 = false;
                    this.V3 = false;
                    this.W3 = false;
                    this.q3 = false;
                    str7 = null;
                    str8 = null;
                    this.M2 = z18;
                    messagesController = MessagesController.getInstance(this.C0);
                    if (this.g1 == 0) {
                    }
                    charSequence22 = this.I0;
                    if (charSequence22 == null) {
                    }
                    charSequence23 = charSequence21;
                    str9 = str8;
                    z4 = z15;
                    str10 = stringForMessageListDate;
                    z19 = z23;
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
                if (!this.u0) {
                }
                if (TextUtils.isEmpty(this.F0)) {
                }
                stringForMessageListDate = "";
                messageObject4 = this.c1;
                if (messageObject4 != null) {
                }
                this.N2 = false;
                this.O2 = false;
                this.P2 = messageObject4 == null && messageObject4.isSending() && this.E0 == UserConfig.getInstance(this.C0).getClientUserId();
                z18 = false;
                this.D3 = false;
                this.U3 = false;
                this.V3 = false;
                this.W3 = false;
                this.q3 = false;
                str7 = null;
                str8 = null;
                this.M2 = z18;
                messagesController = MessagesController.getInstance(this.C0);
                if (this.g1 == 0) {
                }
                charSequence22 = this.I0;
                if (charSequence22 == null) {
                }
                charSequence23 = charSequence21;
                str9 = str8;
                z4 = z15;
                str10 = stringForMessageListDate;
                z19 = z23;
                charSequence24 = charSequence7;
            }
            i11 = i10;
            charSequence = charSequence28;
            i12 = this.O0;
            if (i12 == 0) {
                i12 = messageObject6.messageOwner.date;
            }
            if (!this.M) {
            }
            z12 = this.h2;
            if (!z12) {
            }
            if (!z12) {
                draftMessage3 = this.i2;
                if (draftMessage3.rich_message == null) {
                }
            }
            draftMessage = this.i2;
            if (draftMessage != null) {
            }
            if (ChatObject.isChannel(this.d2)) {
            }
            chat2 = this.d2;
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
            if (!this.u0) {
            }
            if (TextUtils.isEmpty(this.F0)) {
            }
            stringForMessageListDate = "";
            messageObject4 = this.c1;
            if (messageObject4 != null) {
            }
            this.N2 = false;
            this.O2 = false;
            this.P2 = messageObject4 == null && messageObject4.isSending() && this.E0 == UserConfig.getInstance(this.C0).getClientUserId();
            z18 = false;
            this.D3 = false;
            this.U3 = false;
            this.V3 = false;
            this.W3 = false;
            this.q3 = false;
            str7 = null;
            str8 = null;
            this.M2 = z18;
            messagesController = MessagesController.getInstance(this.C0);
            if (this.g1 == 0) {
            }
            charSequence22 = this.I0;
            if (charSequence22 == null) {
            }
            charSequence23 = charSequence21;
            str9 = str8;
            z4 = z15;
            str10 = stringForMessageListDate;
            z19 = z23;
            charSequence24 = charSequence7;
        }
        CharSequence charSequence412 = string;
        if (z4) {
            f12 = 0.0f;
            this.K2 = null;
            this.I2 = 0;
            i18 = 0;
        } else {
            TextPaint timeTextPaint = getTimeTextPaint();
            f12 = 0.0f;
            int ceil = (int) Math.ceil(timeTextPaint.measureText(str10));
            this.K2 = new StaticLayout(str10, timeTextPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            i18 = AndroidUtilities.dp(getIsPinned() ? 24.0f : 0.0f) + ceil;
            if (LocaleController.isRTL) {
                this.I2 = AndroidUtilities.dp(15.0f);
            } else {
                this.I2 = org.telegram.messenger.y3.B(15.0f, getMeasuredWidth(), i18);
            }
        }
        if (E()) {
            i19 = 0;
        } else {
            if (LocaleController.isRTL) {
                this.L2 = AndroidUtilities.dp(4.0f) + this.I2 + i18;
            } else {
                this.L2 = (this.I2 - org.telegram.ui.ActionBar.k6.b1.getIntrinsicWidth()) - AndroidUtilities.dp(4.0f);
            }
            i19 = org.telegram.ui.ActionBar.k6.b1.getIntrinsicWidth() + AndroidUtilities.dp(4.0f);
            i18 += i19;
        }
        if (LocaleController.isRTL) {
            this.v2 = org.telegram.messenger.y3.B(22.0f, getMeasuredWidth() - this.u2, i18);
        } else {
            this.v2 = org.telegram.messenger.y3.B(this.F + 13, getMeasuredWidth() - this.u2, i18);
            this.u2 += i18;
        }
        if (this.D2) {
            this.v2 -= org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth() + AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 4.0f);
        }
        if (!this.P2) {
            int dp10 = AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k6.X0.getIntrinsicWidth();
            this.v2 -= dp10;
            if (LocaleController.isRTL) {
                this.S2 = AndroidUtilities.dp(5.0f) + this.I2 + i18;
                this.u2 += dp10;
            } else {
                this.S2 = (this.I2 - i19) - dp10;
            }
        } else if (this.O2) {
            int dp11 = AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k6.T0.getIntrinsicWidth();
            int i44 = this.v2 - dp11;
            this.v2 = i44;
            f13 = 5.0f;
            if (this.N2) {
                this.v2 = org.telegram.messenger.y3.z(8.0f, org.telegram.ui.ActionBar.k6.W0.getIntrinsicWidth(), i44);
                if (LocaleController.isRTL) {
                    int dp12 = AndroidUtilities.dp(5.0f) + this.I2 + i18;
                    this.Q2 = dp12;
                    this.U2 = AndroidUtilities.dp(5.5f) + dp12;
                    this.u2 = org.telegram.ui.b.C(8.0f, org.telegram.ui.ActionBar.k6.W0.getIntrinsicWidth() + dp11, this.u2);
                } else {
                    int i45 = (this.I2 - i19) - dp11;
                    this.U2 = i45;
                    this.Q2 = i45 - AndroidUtilities.dp(5.5f);
                }
            } else if (LocaleController.isRTL) {
                this.R2 = AndroidUtilities.dp(5.0f) + this.I2 + i18;
                this.u2 += dp11;
            } else {
                this.R2 = (this.I2 - i19) - dp11;
            }
            z22 = (!this.W0 || this.N0 || this.Y0 || this.Z0 > f12) && !this.c4 && this.i4 == 0;
            if (!this.e4 && this.g4.c() != null) {
                int dp13 = AndroidUtilities.dp(36.0f);
                if (z22) {
                    dp13 = org.telegram.ui.ActionBar.k6.c1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f) + dp13;
                }
                this.v2 -= dp13;
                if (LocaleController.isRTL) {
                    this.u2 += dp13;
                }
            } else if (z22) {
                int intrinsicWidth = org.telegram.ui.ActionBar.k6.c1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
                if (this.e4) {
                    intrinsicWidth += AndroidUtilities.dp(36.0f);
                }
                this.v2 -= intrinsicWidth;
                if (LocaleController.isRTL) {
                    this.u2 += intrinsicWidth;
                }
            } else if (this.c4) {
                int intrinsicWidth2 = org.telegram.ui.ActionBar.k6.f1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
                this.v2 -= intrinsicWidth2;
                if (LocaleController.isRTL) {
                    this.u2 += intrinsicWidth2;
                }
            } else if (this.e4) {
                int dp14 = AndroidUtilities.dp(36.0f);
                this.v2 -= dp14;
                if (LocaleController.isRTL) {
                    this.u2 += dp14;
                }
            } else if (this.i4 != 0) {
                f14 = 36.0f;
                int intrinsicWidth3 = (this.i4 == 1 ? org.telegram.ui.ActionBar.k6.g1 : org.telegram.ui.ActionBar.k6.h1).getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
                this.v2 -= intrinsicWidth3;
                if (LocaleController.isRTL) {
                    this.u2 += intrinsicWidth3;
                }
                if (this.d4) {
                    this.v2 -= AndroidUtilities.dp(21.0f);
                }
                dp7 = this.v2 - AndroidUtilities.dp(12.0f);
                if (dp7 < 0) {
                    dp7 = 0;
                }
                if (charSequence22 instanceof String) {
                    f15 = 21.0f;
                } else {
                    f15 = 21.0f;
                    try {
                        charSequence22 = ((String) charSequence22).replace('\n', ' ');
                    } catch (Exception e11) {
                        e = e11;
                        f16 = 6.0f;
                        f17 = 8.0f;
                        FileLog.e(e);
                        this.m3 = org.telegram.ui.Components.u5.update(0, (View) this, this.m3, this.w2);
                        if (this.o2) {
                        }
                        f18 = 39.0f;
                        f19 = 32.0f;
                        f20 = 30.0f;
                        f21 = 24.0f;
                        dp = AndroidUtilities.dp(11.0f);
                        this.n3 = AndroidUtilities.dp(32.0f);
                        this.J2 = AndroidUtilities.dp(13.0f);
                        this.r3 = AndroidUtilities.dp(42.33f);
                        this.z3 = AndroidUtilities.dp(43.0f);
                        this.F3 = AndroidUtilities.dp(42.33f);
                        this.T2 = AndroidUtilities.dp(13.0f);
                        int measuredWidth42 = getMeasuredWidth() - AndroidUtilities.dp(this.F + 21);
                        if (LocaleController.isRTL) {
                        }
                        i20 = dp3;
                        this.r0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
                        i21 = 0;
                        while (true) {
                            imageReceiverArr = this.S1;
                            if (i21 >= imageReceiverArr.length) {
                            }
                            imageReceiverArr[i21].setImageCoords(((this.E4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.N ? AndroidUtilities.dp(20.0f) : 0)) - ((this.o2 || SharedConfig.useThreeLinesLayout || (isVar = this.q0) == null || isVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                            i21++;
                            dp = dp;
                        }
                        i22 = dp;
                        i23 = measuredWidth42;
                        if (LocaleController.isRTL) {
                        }
                        if (this.N) {
                        }
                        if (!this.o2) {
                        }
                        this.J2 -= AndroidUtilities.dp(f16);
                        this.T2 -= AndroidUtilities.dp(f16);
                        if (getIsPinned()) {
                        }
                        if (!this.q3) {
                        }
                        if (z19) {
                        }
                        max = Math.max(AndroidUtilities.dp(12.0f), i23);
                        this.d3 = AndroidUtilities.dp((!this.o2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                        if (!this.o2) {
                        }
                        this.d3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
                        if (Q()) {
                        }
                        if (this.N) {
                        }
                        this.k3 = org.telegram.ui.Components.u5.update(0, (View) this, this.k3, this.p3);
                        if (TextUtils.isEmpty(charSequence24)) {
                        }
                        this.l3 = org.telegram.ui.Components.u5.update(0, (View) this, this.l3, this.e3);
                        if (!TextUtils.isEmpty(charSequence23)) {
                        }
                        if (replaceEmoji instanceof Spannable) {
                        }
                        if (this.o2) {
                        }
                        this.U = org.telegram.ui.ActionBar.k6.F0[this.B0];
                        charSequence26 = charSequence412;
                        charSequence412 = null;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                        if (this.o2) {
                        }
                        if (this.O1 > 0) {
                        }
                        int i422 = max;
                        TextPaint textPaint62 = this.U;
                        float dp92 = AndroidUtilities.dp(1.0f);
                        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                        this.b3 = kw0.b(charSequence26, textPaint62, i422, dp92, i422, charSequence412 != null ? 1 : 2);
                        max = i422;
                        this.f3.addAll(this.g3);
                        this.g3.clear();
                        jh.k.b(this, this.b3, -2, -2, this.f3, this.g3);
                        int i432 = max;
                        this.j3 = org.telegram.ui.Components.u5.update(0, (View) this, this.j3, this.b3);
                        if (LocaleController.isRTL) {
                        }
                        staticLayout = this.c3;
                        if (staticLayout != null) {
                        }
                        e0();
                    }
                }
                if (this.A2) {
                    f16 = 6.0f;
                    f17 = 8.0f;
                } else {
                    f16 = 6.0f;
                    try {
                        f17 = 8.0f;
                        try {
                            this.x2 = charSequence22.length() == TextUtils.ellipsize(charSequence22, org.telegram.ui.ActionBar.k6.B0[this.B0], (float) dp7, TextUtils.TruncateAt.END).length();
                            dp7 += AndroidUtilities.dp(48.0f);
                        } catch (Exception e12) {
                            e = e12;
                            FileLog.e(e);
                            this.m3 = org.telegram.ui.Components.u5.update(0, (View) this, this.m3, this.w2);
                            if (this.o2) {
                            }
                            f18 = 39.0f;
                            f19 = 32.0f;
                            f20 = 30.0f;
                            f21 = 24.0f;
                            dp = AndroidUtilities.dp(11.0f);
                            this.n3 = AndroidUtilities.dp(32.0f);
                            this.J2 = AndroidUtilities.dp(13.0f);
                            this.r3 = AndroidUtilities.dp(42.33f);
                            this.z3 = AndroidUtilities.dp(43.0f);
                            this.F3 = AndroidUtilities.dp(42.33f);
                            this.T2 = AndroidUtilities.dp(13.0f);
                            int measuredWidth422 = getMeasuredWidth() - AndroidUtilities.dp(this.F + 21);
                            if (LocaleController.isRTL) {
                            }
                            i20 = dp3;
                            this.r0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
                            i21 = 0;
                            while (true) {
                                imageReceiverArr = this.S1;
                                if (i21 >= imageReceiverArr.length) {
                                }
                                imageReceiverArr[i21].setImageCoords(((this.E4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.N ? AndroidUtilities.dp(20.0f) : 0)) - ((this.o2 || SharedConfig.useThreeLinesLayout || (isVar = this.q0) == null || isVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                                i21++;
                                dp = dp;
                            }
                            i22 = dp;
                            i23 = measuredWidth422;
                            if (LocaleController.isRTL) {
                            }
                            if (this.N) {
                            }
                            if (!this.o2) {
                            }
                            this.J2 -= AndroidUtilities.dp(f16);
                            this.T2 -= AndroidUtilities.dp(f16);
                            if (getIsPinned()) {
                            }
                            if (!this.q3) {
                            }
                            if (z19) {
                            }
                            max = Math.max(AndroidUtilities.dp(12.0f), i23);
                            this.d3 = AndroidUtilities.dp((!this.o2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                            if (!this.o2) {
                            }
                            this.d3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
                            if (Q()) {
                            }
                            if (this.N) {
                            }
                            this.k3 = org.telegram.ui.Components.u5.update(0, (View) this, this.k3, this.p3);
                            if (TextUtils.isEmpty(charSequence24)) {
                            }
                            this.l3 = org.telegram.ui.Components.u5.update(0, (View) this, this.l3, this.e3);
                            if (!TextUtils.isEmpty(charSequence23)) {
                            }
                            if (replaceEmoji instanceof Spannable) {
                            }
                            if (this.o2) {
                            }
                            this.U = org.telegram.ui.ActionBar.k6.F0[this.B0];
                            charSequence26 = charSequence412;
                            charSequence412 = null;
                            Layout.Alignment alignment22 = Layout.Alignment.ALIGN_NORMAL;
                            if (this.o2) {
                            }
                            if (this.O1 > 0) {
                            }
                            int i4222 = max;
                            TextPaint textPaint622 = this.U;
                            float dp922 = AndroidUtilities.dp(1.0f);
                            TextUtils.TruncateAt truncateAt22 = TextUtils.TruncateAt.END;
                            this.b3 = kw0.b(charSequence26, textPaint622, i4222, dp922, i4222, charSequence412 != null ? 1 : 2);
                            max = i4222;
                            this.f3.addAll(this.g3);
                            this.g3.clear();
                            jh.k.b(this, this.b3, -2, -2, this.f3, this.g3);
                            int i4322 = max;
                            this.j3 = org.telegram.ui.Components.u5.update(0, (View) this, this.j3, this.b3);
                            if (LocaleController.isRTL) {
                            }
                            staticLayout = this.c3;
                            if (staticLayout != null) {
                            }
                            e0();
                        }
                    } catch (Exception e13) {
                        e = e13;
                        f17 = 8.0f;
                        FileLog.e(e);
                        this.m3 = org.telegram.ui.Components.u5.update(0, (View) this, this.m3, this.w2);
                        if (this.o2) {
                        }
                        f18 = 39.0f;
                        f19 = 32.0f;
                        f20 = 30.0f;
                        f21 = 24.0f;
                        dp = AndroidUtilities.dp(11.0f);
                        this.n3 = AndroidUtilities.dp(32.0f);
                        this.J2 = AndroidUtilities.dp(13.0f);
                        this.r3 = AndroidUtilities.dp(42.33f);
                        this.z3 = AndroidUtilities.dp(43.0f);
                        this.F3 = AndroidUtilities.dp(42.33f);
                        this.T2 = AndroidUtilities.dp(13.0f);
                        int measuredWidth4222 = getMeasuredWidth() - AndroidUtilities.dp(this.F + 21);
                        if (LocaleController.isRTL) {
                        }
                        i20 = dp3;
                        this.r0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
                        i21 = 0;
                        while (true) {
                            imageReceiverArr = this.S1;
                            if (i21 >= imageReceiverArr.length) {
                            }
                            imageReceiverArr[i21].setImageCoords(((this.E4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.N ? AndroidUtilities.dp(20.0f) : 0)) - ((this.o2 || SharedConfig.useThreeLinesLayout || (isVar = this.q0) == null || isVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                            i21++;
                            dp = dp;
                        }
                        i22 = dp;
                        i23 = measuredWidth4222;
                        if (LocaleController.isRTL) {
                        }
                        if (this.N) {
                        }
                        if (!this.o2) {
                        }
                        this.J2 -= AndroidUtilities.dp(f16);
                        this.T2 -= AndroidUtilities.dp(f16);
                        if (getIsPinned()) {
                        }
                        if (!this.q3) {
                        }
                        if (z19) {
                        }
                        max = Math.max(AndroidUtilities.dp(12.0f), i23);
                        this.d3 = AndroidUtilities.dp((!this.o2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                        if (!this.o2) {
                        }
                        this.d3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
                        if (Q()) {
                        }
                        if (this.N) {
                        }
                        this.k3 = org.telegram.ui.Components.u5.update(0, (View) this, this.k3, this.p3);
                        if (TextUtils.isEmpty(charSequence24)) {
                        }
                        this.l3 = org.telegram.ui.Components.u5.update(0, (View) this, this.l3, this.e3);
                        if (!TextUtils.isEmpty(charSequence23)) {
                        }
                        if (replaceEmoji instanceof Spannable) {
                        }
                        if (this.o2) {
                        }
                        this.U = org.telegram.ui.ActionBar.k6.F0[this.B0];
                        charSequence26 = charSequence412;
                        charSequence412 = null;
                        Layout.Alignment alignment222 = Layout.Alignment.ALIGN_NORMAL;
                        if (this.o2) {
                        }
                        if (this.O1 > 0) {
                        }
                        int i42222 = max;
                        TextPaint textPaint6222 = this.U;
                        float dp9222 = AndroidUtilities.dp(1.0f);
                        TextUtils.TruncateAt truncateAt222 = TextUtils.TruncateAt.END;
                        this.b3 = kw0.b(charSequence26, textPaint6222, i42222, dp9222, i42222, charSequence412 != null ? 1 : 2);
                        max = i42222;
                        this.f3.addAll(this.g3);
                        this.g3.clear();
                        jh.k.b(this, this.b3, -2, -2, this.f3, this.g3);
                        int i43222 = max;
                        this.j3 = org.telegram.ui.Components.u5.update(0, (View) this, this.j3, this.b3);
                        if (LocaleController.isRTL) {
                        }
                        staticLayout = this.c3;
                        if (staticLayout != null) {
                        }
                        e0();
                    }
                }
                float f222 = dp7;
                this.O = org.telegram.ui.ActionBar.k6.B0[this.B0].measureText(charSequence22.toString()) <= f222;
                if (!this.N) {
                    charSequence22 = TextUtils.ellipsize(charSequence22, org.telegram.ui.ActionBar.k6.B0[this.B0], f222, TextUtils.TruncateAt.END);
                }
                CharSequence replaceEmoji32 = Emoji.replaceEmoji(charSequence22, org.telegram.ui.ActionBar.k6.B0[this.B0].getFontMetricsInt(), false);
                MessageObject messageObject212 = this.c1;
                CharSequence charSequence44 = (messageObject212 == null && messageObject212.hasHighlightedWords() && (highlightText3 = AndroidUtilities.highlightText(replaceEmoji32, this.c1.highlightedWords, this.C4)) != null) ? highlightText3 : replaceEmoji32;
                if (this.N) {
                    this.w2 = new StaticLayout(charSequence44, org.telegram.ui.ActionBar.k6.B0[this.B0], Math.max(dp7, this.v2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else {
                    TextPaint textPaint7 = org.telegram.ui.ActionBar.k6.B0[this.B0];
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    TextUtils.TruncateAt truncateAt3 = TextUtils.TruncateAt.END;
                    this.w2 = kw0.b(charSequence44, textPaint7, dp7, 0.0f, dp7, 2);
                }
                this.y2 = (this.A2 || !this.w2.isRtlCharAt(0)) ? 0.0f : -AndroidUtilities.dp(f14);
                this.z2 = this.w2.isRtlCharAt(0);
                this.m3 = org.telegram.ui.Components.u5.update(0, (View) this, this.m3, this.w2);
                if (!this.o2 || SharedConfig.useThreeLinesLayout) {
                    f18 = 39.0f;
                    f19 = 32.0f;
                    f20 = 30.0f;
                    f21 = 24.0f;
                    dp = AndroidUtilities.dp(11.0f);
                    this.n3 = AndroidUtilities.dp(32.0f);
                    this.J2 = AndroidUtilities.dp(13.0f);
                    this.r3 = AndroidUtilities.dp(42.33f);
                    this.z3 = AndroidUtilities.dp(43.0f);
                    this.F3 = AndroidUtilities.dp(42.33f);
                    this.T2 = AndroidUtilities.dp(13.0f);
                    int measuredWidth42222 = getMeasuredWidth() - AndroidUtilities.dp(this.F + 21);
                    if (LocaleController.isRTL) {
                        int dp15 = AndroidUtilities.dp(f11);
                        this.o3 = dp15;
                        this.Y2 = dp15;
                        this.a3 = dp15;
                        this.Z2 = dp15;
                        dp2 = getMeasuredWidth() - AndroidUtilities.dp(this.E + 56);
                        dp3 = dp2 - AndroidUtilities.dp(31.0f);
                    } else {
                        int dp16 = AndroidUtilities.dp(this.F + 6);
                        this.o3 = dp16;
                        this.Y2 = dp16;
                        this.a3 = dp16;
                        this.Z2 = dp16;
                        dp2 = AndroidUtilities.dp(this.E);
                        dp3 = AndroidUtilities.dp(69.0f) + dp2;
                    }
                    i20 = dp3;
                    this.r0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
                    i21 = 0;
                    while (true) {
                        imageReceiverArr = this.S1;
                        if (i21 >= imageReceiverArr.length) {
                            break;
                        }
                        imageReceiverArr[i21].setImageCoords(((this.E4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.N ? AndroidUtilities.dp(20.0f) : 0)) - ((this.o2 || SharedConfig.useThreeLinesLayout || (isVar = this.q0) == null || isVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                        i21++;
                        dp = dp;
                    }
                    i22 = dp;
                    i23 = measuredWidth42222;
                } else {
                    int dp17 = AndroidUtilities.dp(9.0f);
                    this.n3 = AndroidUtilities.dp(31.0f);
                    this.J2 = AndroidUtilities.dp(f11);
                    this.r3 = AndroidUtilities.dp(38.0f);
                    this.z3 = AndroidUtilities.dp(39.0f);
                    this.F3 = AndroidUtilities.dp(this.M ? 35.0f : 38.0f);
                    this.T2 = AndroidUtilities.dp(f10);
                    i23 = getMeasuredWidth() - AndroidUtilities.dp((this.F + 20) - (LocaleController.isRTL ? 0 : 12));
                    if (LocaleController.isRTL) {
                        int dp18 = AndroidUtilities.dp(22.0f);
                        this.o3 = dp18;
                        this.Y2 = dp18;
                        this.a3 = dp18;
                        this.Z2 = dp18;
                        f19 = 32.0f;
                        dp5 = getMeasuredWidth() - AndroidUtilities.dp(this.E + 52);
                        f20 = 30.0f;
                        dp6 = dp5 - AndroidUtilities.dp(((this.E4 + 2) * this.O1) + 9);
                    } else {
                        f19 = 32.0f;
                        f20 = 30.0f;
                        int dp19 = AndroidUtilities.dp(this.F + 4);
                        this.o3 = dp19;
                        this.Y2 = dp19;
                        this.a3 = dp19;
                        this.Z2 = dp19;
                        dp5 = AndroidUtilities.dp(this.E);
                        dp6 = AndroidUtilities.dp(67.0f) + dp5;
                    }
                    f18 = 39.0f;
                    f21 = 24.0f;
                    this.r0.F.set(dp5, dp17, AndroidUtilities.dp(52.0f) + dp5, AndroidUtilities.dp(52.0f) + dp17);
                    int i46 = 0;
                    while (true) {
                        ImageReceiver[] imageReceiverArr3 = this.S1;
                        if (i46 >= imageReceiverArr3.length) {
                            break;
                        }
                        imageReceiverArr3[i46].setImageCoords(((this.E4 + 2) * i46) + dp6, ((AndroidUtilities.dp(f20) + dp17) + (this.N ? AndroidUtilities.dp(20.0f) : 0)) - ((this.o2 || SharedConfig.useThreeLinesLayout || (isVar3 = this.q0) == null || isVar3.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(this.E4), AndroidUtilities.dp(this.E4));
                        i46++;
                        dp17 = dp17;
                    }
                    i22 = dp17;
                }
                if (LocaleController.isRTL) {
                    this.W2 = getMeasuredWidth() - AndroidUtilities.dp(this.F);
                    this.V2 = AndroidUtilities.dp(64.0f);
                } else {
                    this.V2 = this.Y2;
                    this.W2 = getMeasuredWidth() - AndroidUtilities.dp(64.0f);
                }
                if (this.N) {
                    this.n3 = AndroidUtilities.dp(20.0f) + this.n3;
                }
                if (((!this.o2 && !SharedConfig.useThreeLinesLayout) || Q()) && (isVar2 = this.q0) != null && !isVar2.b()) {
                    this.J2 -= AndroidUtilities.dp(f16);
                    this.T2 -= AndroidUtilities.dp(f16);
                }
                if (getIsPinned()) {
                    if (LocaleController.isRTL) {
                        this.A3 = AndroidUtilities.dp(14.0f);
                    } else {
                        this.A3 = (getMeasuredWidth() - org.telegram.ui.ActionBar.k6.j1.getIntrinsicWidth()) - AndroidUtilities.dp(14.0f);
                    }
                }
                if (!this.q3) {
                    int dp20 = AndroidUtilities.dp(29.0f);
                    i23 -= dp20;
                    if (LocaleController.isRTL) {
                        this.s3 = AndroidUtilities.dp(15.666f);
                        this.Y2 += dp20;
                        this.a3 += dp20;
                        this.Z2 += dp20;
                        this.o3 += dp20;
                    } else {
                        this.s3 = getMeasuredWidth() - AndroidUtilities.dp(36.3333f);
                    }
                } else if (str7 != null || str9 != null || this.V3 || this.W3) {
                    if (str7 != null) {
                        this.H3 = Math.max(AndroidUtilities.dp(f17), (int) Math.ceil(org.telegram.ui.ActionBar.k6.M0.measureText(str7)));
                        this.Q3 = new StaticLayout(str7, org.telegram.ui.ActionBar.k6.M0, this.H3, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        int dp21 = AndroidUtilities.dp(f10) + this.H3;
                        i23 -= dp21;
                        if (LocaleController.isRTL) {
                            this.G3 = AndroidUtilities.dp(15.666f);
                            this.Y2 += dp21;
                            this.a3 += dp21;
                            this.Z2 += dp21;
                            this.o3 += dp21;
                        } else {
                            this.G3 = org.telegram.ui.b.t(12.666f, this.H3, getMeasuredWidth() - AndroidUtilities.dp(15.666f));
                        }
                        this.D3 = true;
                    } else {
                        this.H3 = 0;
                    }
                    if (str9 != null) {
                        if (this.G0 != 0) {
                            this.a4 = Math.max(AndroidUtilities.dp(f17), (int) Math.ceil(org.telegram.ui.ActionBar.k6.M0.measureText(str9)));
                            this.b4 = new StaticLayout(str9, org.telegram.ui.ActionBar.k6.M0, this.a4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            this.a4 = AndroidUtilities.dp(f17);
                        }
                        int dp22 = AndroidUtilities.dp(f10) + this.a4;
                        i23 -= dp22;
                        if (LocaleController.isRTL) {
                            int dp23 = AndroidUtilities.dp(15.666f);
                            int i47 = this.H3;
                            this.X3 = dp23 + (i47 != 0 ? i47 + AndroidUtilities.dp(f10) : 0);
                            this.Y2 += dp22;
                            this.a3 += dp22;
                            this.Z2 += dp22;
                            this.o3 += dp22;
                        } else {
                            int t6 = org.telegram.ui.b.t(12.666f, this.a4, getMeasuredWidth()) - AndroidUtilities.dp(15.666f);
                            int i48 = this.H3;
                            this.X3 = t6 - (i48 != 0 ? i48 + AndroidUtilities.dp(f10) : 0);
                        }
                        this.U3 = true;
                    } else {
                        this.a4 = 0;
                    }
                    if (this.V3) {
                        int dp24 = AndroidUtilities.dp(25.0f);
                        i23 -= dp24;
                        if (LocaleController.isRTL) {
                            int dp25 = AndroidUtilities.dp(15.666f);
                            this.Y3 = dp25;
                            if (this.U3) {
                                int i49 = this.a4;
                                this.Y3 = dp25 + (i49 != 0 ? i49 + AndroidUtilities.dp(f10) : 0);
                            }
                            if (this.D3) {
                                int i50 = this.Y3;
                                int i51 = this.H3;
                                this.Y3 = i50 + (i51 != 0 ? i51 + AndroidUtilities.dp(f10) : 0);
                            }
                            this.Y2 += dp24;
                            this.a3 += dp24;
                            this.Z2 += dp24;
                            this.o3 += dp24;
                        } else {
                            int measuredWidth5 = getMeasuredWidth() - AndroidUtilities.dp(36.332f);
                            this.Y3 = measuredWidth5;
                            if (this.U3) {
                                int i52 = this.a4;
                                this.Y3 = measuredWidth5 - (i52 != 0 ? i52 + AndroidUtilities.dp(f10) : 0);
                            }
                            if (this.D3) {
                                int i53 = this.Y3;
                                int i54 = this.H3;
                                this.Y3 = i53 - (i54 != 0 ? i54 + AndroidUtilities.dp(f10) : 0);
                            }
                        }
                    }
                    if (this.W3) {
                        int dp26 = AndroidUtilities.dp(25.0f);
                        i23 -= dp26;
                        if (LocaleController.isRTL) {
                            int dp27 = AndroidUtilities.dp(15.666f);
                            this.Z3 = dp27;
                            if (this.V3) {
                                this.Z3 = AndroidUtilities.dp(25.0f) + dp27;
                            }
                            if (this.U3) {
                                int i55 = this.Z3;
                                int i56 = this.a4;
                                this.Z3 = i55 + (i56 != 0 ? i56 + AndroidUtilities.dp(f10) : 0);
                            }
                            if (this.D3) {
                                int i57 = this.Z3;
                                int i58 = this.H3;
                                this.Z3 = i57 + (i58 != 0 ? i58 + AndroidUtilities.dp(f10) : 0);
                            }
                            this.Y2 += dp26;
                            this.a3 += dp26;
                            this.Z2 += dp26;
                            this.o3 += dp26;
                        } else {
                            int measuredWidth6 = getMeasuredWidth() - AndroidUtilities.dp(36.332f);
                            this.Z3 = measuredWidth6;
                            if (this.V3) {
                                this.Z3 = measuredWidth6 - AndroidUtilities.dp(25.0f);
                            }
                            if (this.U3) {
                                int i59 = this.Z3;
                                int i60 = this.a4;
                                this.Z3 = i59 - (i60 != 0 ? i60 + AndroidUtilities.dp(f10) : 0);
                            }
                            if (this.D3) {
                                int i61 = this.Z3;
                                int i62 = this.H3;
                                this.Z3 = i61 - (i62 != 0 ? i62 + AndroidUtilities.dp(f10) : 0);
                            }
                        }
                    }
                } else if (!this.G1 || P() || Q() || O() || !UserObject.isBot(this.c2) || !this.c2.bot_has_main_app) {
                    this.D3 = false;
                    this.U3 = false;
                } else {
                    setOpenBotButton(true);
                    int h = (int) (this.F1.h() + AndroidUtilities.dp(26.0f));
                    int dp28 = AndroidUtilities.dp(13.0f);
                    i23 -= h;
                    int dp29 = (this.o2 || SharedConfig.useThreeLinesLayout) ? AndroidUtilities.dp(40.0f) : this.M ? AndroidUtilities.dp(33.0f) : AndroidUtilities.dp(f14);
                    if (LocaleController.isRTL) {
                        this.E1.set(AndroidUtilities.dp(13.0f), dp29, AndroidUtilities.dp(13.0f) + h, AndroidUtilities.dp(28.0f) + dp29);
                        int i63 = h + dp28;
                        this.Y2 += i63;
                        this.a3 += i63;
                        this.Z2 += i63;
                        this.o3 += i63;
                    } else {
                        this.E1.set((getMeasuredWidth() - h) - AndroidUtilities.dp(13.0f), dp29, getMeasuredWidth() - AndroidUtilities.dp(13.0f), AndroidUtilities.dp(28.0f) + dp29);
                    }
                    this.D3 = false;
                    this.U3 = false;
                }
                if (z19) {
                    if (replaceEmoji == null) {
                        replaceEmoji = "";
                    }
                    if (replaceEmoji.length() > 150) {
                        replaceEmoji = replaceEmoji.subSequence(0, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    }
                    replaceEmoji = Emoji.replaceEmoji(((this.o2 || SharedConfig.useThreeLinesLayout) && !M() && charSequence412 == null) ? AndroidUtilities.replaceTwoNewLinesToOne(replaceEmoji) : AndroidUtilities.replaceNewLines(replaceEmoji), org.telegram.ui.ActionBar.k6.F0[this.B0].getFontMetricsInt(), false);
                    MessageObject messageObject23 = this.c1;
                    if (messageObject23 != null && (highlightText2 = AndroidUtilities.highlightText(replaceEmoji, messageObject23.highlightedWords, this.C4)) != null) {
                        replaceEmoji = highlightText2;
                    }
                }
                max = Math.max(AndroidUtilities.dp(12.0f), i23);
                this.d3 = AndroidUtilities.dp((!this.o2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                if (((!this.o2 && !SharedConfig.useThreeLinesLayout) || Q()) && M()) {
                    this.d3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
                }
                if (Q()) {
                    this.X2 = AndroidUtilities.dp((this.o2 || SharedConfig.useThreeLinesLayout) ? 34.0f : 39.0f);
                    int i64 = 0;
                    while (true) {
                        ImageReceiver[] imageReceiverArr4 = this.S1;
                        if (i64 >= imageReceiverArr4.length) {
                            break;
                        }
                        imageReceiverArr4[i64].setImageY(this.d3);
                        i64++;
                    }
                } else if ((this.o2 || SharedConfig.useThreeLinesLayout) && !M() && charSequence412 != null && (this.G0 == 0 || this.J0 == 1)) {
                    try {
                        messageObject7 = this.c1;
                    } catch (Exception e14) {
                        e = e14;
                    }
                    if (messageObject7 != null && messageObject7.hasHighlightedWords()) {
                        CharSequence highlightText5 = AndroidUtilities.highlightText(charSequence412, this.c1.highlightedWords, this.C4);
                        if (highlightText5 != null) {
                            charSequence25 = highlightText5;
                            TextPaint textPaint8 = org.telegram.ui.ActionBar.k6.G0;
                            Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                            TextUtils.TruncateAt truncateAt4 = TextUtils.TruncateAt.END;
                            this.p3 = kw0.b(charSequence25, textPaint8, max, 0.0f, max, 1);
                            this.X2 = AndroidUtilities.dp(51.0f);
                            dp4 = (this.O || !this.M) ? 0 : AndroidUtilities.dp(20.0f);
                            i24 = 0;
                            while (true) {
                                imageReceiverArr2 = this.S1;
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
                    TextPaint textPaint82 = org.telegram.ui.ActionBar.k6.G0;
                    Layout.Alignment alignment42 = Layout.Alignment.ALIGN_NORMAL;
                    TextUtils.TruncateAt truncateAt42 = TextUtils.TruncateAt.END;
                    this.p3 = kw0.b(charSequence25, textPaint82, max, 0.0f, max, 1);
                    this.X2 = AndroidUtilities.dp(51.0f);
                    if (this.O) {
                    }
                    i24 = 0;
                    while (true) {
                        imageReceiverArr2 = this.S1;
                        if (i24 >= imageReceiverArr2.length) {
                        }
                        imageReceiverArr2[i24].setImageY(AndroidUtilities.dp(40.0f) + i22 + dp4);
                        i24++;
                    }
                    charSequence412 = charSequence25;
                } else {
                    this.p3 = null;
                    if (this.o2 || SharedConfig.useThreeLinesLayout) {
                        this.X2 = AndroidUtilities.dp(f19);
                        int dp30 = (this.O && this.M) ? AndroidUtilities.dp(20.0f) : 0;
                        int i65 = 0;
                        while (true) {
                            ImageReceiver[] imageReceiverArr5 = this.S1;
                            if (i65 >= imageReceiverArr5.length) {
                                break;
                            }
                            imageReceiverArr5[i65].setImageY(AndroidUtilities.dp(f15) + i22 + dp30);
                            i65++;
                        }
                    } else {
                        this.X2 = AndroidUtilities.dp(f18);
                    }
                }
                if (this.N) {
                    this.X2 = AndroidUtilities.dp(20.0f) + this.X2;
                }
                this.k3 = org.telegram.ui.Components.u5.update(0, (View) this, this.k3, this.p3);
                if (TextUtils.isEmpty(charSequence24)) {
                    this.e3 = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(charSequence24, this.U.getFontMetricsInt(), false), this.U, max - AndroidUtilities.dp(26.0f), TextUtils.TruncateAt.END), this.U, max - AndroidUtilities.dp(20.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.h3.addAll(this.i3);
                    this.i3.clear();
                    jh.k.c(this, this.e3, this.h3, this.i3);
                } else {
                    this.e3 = null;
                }
                this.l3 = org.telegram.ui.Components.u5.update(0, (View) this, this.l3, this.e3);
                if (!TextUtils.isEmpty(charSequence23)) {
                    try {
                        if (!this.o2) {
                            if (!SharedConfig.useThreeLinesLayout) {
                            }
                            i26 = max;
                            this.c3 = new StaticLayout(TextUtils.ellipsize(charSequence23, this.U, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.k6.H0[this.B0], i26, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        }
                        this.c3 = new StaticLayout(TextUtils.ellipsize(charSequence23, this.U, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.k6.H0[this.B0], i26, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    } catch (Exception e15) {
                        e = e15;
                        max = i26;
                        FileLog.e(e);
                        if (replaceEmoji instanceof Spannable) {
                        }
                        if (this.o2) {
                        }
                        this.U = org.telegram.ui.ActionBar.k6.F0[this.B0];
                        charSequence26 = charSequence412;
                        charSequence412 = null;
                        Layout.Alignment alignment2222 = Layout.Alignment.ALIGN_NORMAL;
                        if (this.o2) {
                        }
                        if (this.O1 > 0) {
                        }
                        int i422222 = max;
                        TextPaint textPaint62222 = this.U;
                        float dp92222 = AndroidUtilities.dp(1.0f);
                        TextUtils.TruncateAt truncateAt2222 = TextUtils.TruncateAt.END;
                        this.b3 = kw0.b(charSequence26, textPaint62222, i422222, dp92222, i422222, charSequence412 != null ? 1 : 2);
                        max = i422222;
                        this.f3.addAll(this.g3);
                        this.g3.clear();
                        jh.k.b(this, this.b3, -2, -2, this.f3, this.g3);
                        int i432222 = max;
                        this.j3 = org.telegram.ui.Components.u5.update(0, (View) this, this.j3, this.b3);
                        if (LocaleController.isRTL) {
                        }
                        staticLayout = this.c3;
                        if (staticLayout != null) {
                        }
                        e0();
                    }
                    if (!M()) {
                        TextPaint textPaint9 = org.telegram.ui.ActionBar.k6.H0[this.B0];
                        Layout.Alignment alignment5 = Layout.Alignment.ALIGN_NORMAL;
                        float dp31 = AndroidUtilities.dp(1.0f);
                        TextUtils.TruncateAt truncateAt5 = TextUtils.TruncateAt.END;
                        this.c3 = kw0.b(charSequence23, textPaint9, max, dp31, max, 1);
                    }
                    i26 = max;
                }
                if (replaceEmoji instanceof Spannable) {
                    Spannable spannable = (Spannable) replaceEmoji;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof ClickableSpan) && !(obj instanceof CodeHighlighting.Span)) {
                            if (this.H0 == 0) {
                                if (!P()) {
                                    if (!(obj instanceof e51)) {
                                    }
                                }
                            }
                            if (!(obj instanceof CodeHighlighting.ColorSpan)) {
                                if (!(obj instanceof bj0)) {
                                    if (!(obj instanceof aj0)) {
                                        if ((obj instanceof StyleSpan) && ((StyleSpan) obj).getStyle() == 1) {
                                        }
                                    }
                                }
                            }
                        }
                        spannable.removeSpan(obj);
                    }
                }
                if ((!this.o2 || SharedConfig.useThreeLinesLayout) && !M() && this.G0 != 0 && this.J0 > 1) {
                    this.U = org.telegram.ui.ActionBar.k6.F0[this.B0];
                    charSequence26 = charSequence412;
                    charSequence412 = null;
                } else {
                    if (!this.o2) {
                    }
                    if (!M()) {
                        if (charSequence412 == null) {
                            if (ChatObject.isMonoForum(this.d2) && ChatObject.canManageMonoForum(this.C0, this.d2)) {
                            }
                            charSequence26 = replaceEmoji;
                        }
                    }
                    replaceEmoji = (Q() || !(replaceEmoji instanceof Spanned) || ((p2[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), p2.class)).length > 0) ? TextUtils.ellipsize(replaceEmoji, this.U, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END) : TextUtils.ellipsize(replaceEmoji, this.U, max - AndroidUtilities.dp(((this.E4 + 2) * this.O1) + 15), TextUtils.TruncateAt.END);
                    charSequence26 = replaceEmoji;
                }
                Layout.Alignment alignment22222 = Layout.Alignment.ALIGN_NORMAL;
                if ((!this.o2 || SharedConfig.useThreeLinesLayout) && !M()) {
                    if (this.O1 > 0 && charSequence412 != null) {
                        max += AndroidUtilities.dp(f13);
                    }
                    int i4222222 = max;
                    TextPaint textPaint622222 = this.U;
                    float dp922222 = AndroidUtilities.dp(1.0f);
                    TextUtils.TruncateAt truncateAt22222 = TextUtils.TruncateAt.END;
                    this.b3 = kw0.b(charSequence26, textPaint622222, i4222222, dp922222, i4222222, charSequence412 != null ? 1 : 2);
                    max = i4222222;
                } else {
                    if (this.O1 > 0) {
                        max += AndroidUtilities.dp(((this.E4 + 2) * r0) + 3);
                        if (LocaleController.isRTL && !Q()) {
                            this.Y2 -= AndroidUtilities.dp(((this.E4 + 2) * this.O1) + 3);
                        }
                    }
                    int i66 = max;
                    try {
                        this.b3 = new StaticLayout(charSequence26, this.U, i66, alignment22222, 1.0f, 0.0f, false);
                        max = i66;
                    } catch (Exception e16) {
                        e = e16;
                        max = i66;
                        this.b3 = null;
                        FileLog.e(e);
                        int i4322222 = max;
                        this.j3 = org.telegram.ui.Components.u5.update(0, (View) this, this.j3, this.b3);
                        if (LocaleController.isRTL) {
                        }
                        staticLayout = this.c3;
                        if (staticLayout != null) {
                        }
                        e0();
                    }
                }
                this.f3.addAll(this.g3);
                this.g3.clear();
                jh.k.b(this, this.b3, -2, -2, this.f3, this.g3);
                int i43222222 = max;
                this.j3 = org.telegram.ui.Components.u5.update(0, (View) this, this.j3, this.b3);
                if (LocaleController.isRTL) {
                    StaticLayout staticLayout2 = this.w2;
                    if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                        float lineLeft = this.w2.getLineLeft(0);
                        double ceil2 = Math.ceil(this.w2.getLineWidth(0));
                        int dp32 = AndroidUtilities.dp(12.0f) + this.u2;
                        this.u2 = dp32;
                        if (this.d4) {
                            this.u2 = AndroidUtilities.dp(f15) + dp32;
                        }
                        if (this.A2) {
                            ceil2 = Math.min(this.v2, ceil2);
                        }
                        if ((this.W0 || this.Y0 || this.Z0 > f12) && !this.c4 && this.i4 == 0) {
                            if (this.e4) {
                                int dp33 = (int) ((((this.v2 - ceil2) - lineLeft) + this.u2) - AndroidUtilities.dp(f21));
                                this.E2 = dp33;
                                this.F2 = (dp33 - AndroidUtilities.dp(f16)) - org.telegram.ui.ActionBar.k6.c1.getIntrinsicWidth();
                            } else {
                                this.E2 = (int) ((((this.v2 - ceil2) + this.u2) - AndroidUtilities.dp(f16)) - org.telegram.ui.ActionBar.k6.c1.getIntrinsicWidth());
                            }
                        } else if (this.c4) {
                            this.E2 = (int) ((((this.v2 - ceil2) + this.u2) - AndroidUtilities.dp(f16)) - org.telegram.ui.ActionBar.k6.f1.getIntrinsicWidth());
                        } else if (this.e4) {
                            int dp34 = (int) ((((this.v2 - ceil2) - lineLeft) + this.u2) - AndroidUtilities.dp(f21));
                            this.E2 = dp34;
                            this.F2 = (dp34 - AndroidUtilities.dp(f16)) - org.telegram.ui.ActionBar.k6.c1.getIntrinsicWidth();
                        } else if (this.i4 != 0) {
                            this.E2 = (int) ((((this.v2 - ceil2) + this.u2) - AndroidUtilities.dp(f16)) - (this.i4 == 1 ? org.telegram.ui.ActionBar.k6.g1 : org.telegram.ui.ActionBar.k6.h1).getIntrinsicWidth());
                        } else {
                            this.E2 = (int) ((((this.v2 - ceil2) + this.u2) - AndroidUtilities.dp(f16)) - org.telegram.ui.ActionBar.k6.c1.getIntrinsicWidth());
                        }
                        if (lineLeft == f12) {
                            double d10 = this.v2;
                            if (ceil2 < d10) {
                                this.u2 = (int) ((d10 - ceil2) + this.u2);
                            }
                        }
                    }
                    StaticLayout staticLayout3 = this.b3;
                    int i67 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (staticLayout3 != null && (lineCount6 = staticLayout3.getLineCount()) > 0) {
                        int i68 = 0;
                        int i69 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        while (true) {
                            if (i68 >= lineCount6) {
                                break;
                            }
                            if (this.b3.getLineLeft(i68) != f12) {
                                i69 = 0;
                                break;
                            } else {
                                i69 = Math.min(i69, (int) (i43222222 - Math.ceil(this.b3.getLineWidth(i68))));
                                i68++;
                            }
                        }
                        if (i69 != Integer.MAX_VALUE) {
                            this.Y2 += i69;
                        }
                    }
                    StaticLayout staticLayout4 = this.c3;
                    if (staticLayout4 != null && (lineCount5 = staticLayout4.getLineCount()) > 0) {
                        int i70 = 0;
                        int i71 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        while (true) {
                            if (i70 >= lineCount5) {
                                break;
                            }
                            if (this.c3.getLineLeft(i70) != f12) {
                                i71 = 0;
                                break;
                            } else {
                                i71 = Math.min(i71, (int) (i43222222 - Math.ceil(this.c3.getLineWidth(i70))));
                                i70++;
                            }
                        }
                        if (i71 != Integer.MAX_VALUE) {
                            this.a3 += i71;
                        }
                    }
                    StaticLayout staticLayout5 = this.p3;
                    if (staticLayout5 != null && staticLayout5.getLineCount() > 0 && this.p3.getLineLeft(0) == f12) {
                        double ceil3 = Math.ceil(this.p3.getLineWidth(0));
                        double d11 = i43222222;
                        if (ceil3 < d11) {
                            this.o3 = (int) ((d11 - ceil3) + this.o3);
                        }
                    }
                    StaticLayout staticLayout6 = this.e3;
                    if (staticLayout6 != null && (lineCount4 = staticLayout6.getLineCount()) > 0) {
                        for (int i72 = 0; i72 < lineCount4; i72++) {
                            i67 = (int) Math.min(i67, this.e3.getWidth() - this.e3.getLineRight(i72));
                        }
                        this.Z2 += i67;
                    }
                } else {
                    StaticLayout staticLayout7 = this.w2;
                    if (staticLayout7 != null && staticLayout7.getLineCount() > 0) {
                        float lineRight = this.w2.getLineRight(0);
                        if (this.A2) {
                            lineRight = Math.min(this.v2, lineRight);
                        }
                        if (lineRight == this.v2) {
                            double ceil4 = Math.ceil(this.w2.getLineWidth(0));
                            if (this.A2) {
                                ceil4 = Math.min(this.v2, ceil4);
                            }
                            double d12 = this.v2;
                            if (ceil4 < d12) {
                                this.u2 = (int) (this.u2 - (d12 - ceil4));
                            }
                        }
                        if (this.d4) {
                            this.u2 = AndroidUtilities.dp(f15) + this.u2;
                        }
                        int dp35 = (int) (this.u2 + lineRight + AndroidUtilities.dp(f16));
                        this.E2 = dp35;
                        if (this.e4) {
                            this.F2 = AndroidUtilities.dp(f20) + dp35;
                        }
                    }
                    StaticLayout staticLayout8 = this.b3;
                    float f23 = 2.14748365E9f;
                    if (staticLayout8 != null && (lineCount3 = staticLayout8.getLineCount()) > 0) {
                        float f24 = 2.14748365E9f;
                        for (int i73 = 0; i73 < lineCount3; i73++) {
                            f24 = Math.min(f24, this.b3.getLineLeft(i73));
                        }
                        this.Y2 = (int) (this.Y2 - f24);
                    }
                    StaticLayout staticLayout9 = this.e3;
                    if (staticLayout9 != null && (lineCount2 = staticLayout9.getLineCount()) > 0) {
                        float f25 = 2.14748365E9f;
                        for (int i74 = 0; i74 < lineCount2; i74++) {
                            f25 = Math.min(f25, this.e3.getLineLeft(i74));
                        }
                        this.Z2 = (int) (this.Z2 - f25);
                    }
                    StaticLayout staticLayout10 = this.c3;
                    if (staticLayout10 != null && (lineCount = staticLayout10.getLineCount()) > 0) {
                        for (int i75 = 0; i75 < lineCount; i75++) {
                            f23 = Math.min(f23, this.c3.getLineLeft(i75));
                        }
                        this.a3 = (int) (this.a3 - f23);
                    }
                    StaticLayout staticLayout11 = this.p3;
                    if (staticLayout11 != null && staticLayout11.getLineCount() > 0) {
                        this.o3 = (int) (this.o3 - this.p3.getLineLeft(0));
                    }
                }
                staticLayout = this.c3;
                if (staticLayout != null && this.g2 >= 0 && staticLayout.getText().length() > 0) {
                    if (i13 >= 0 || (i25 = i13 + 1) >= this.c3.getText().length()) {
                        primaryHorizontal = this.c3.getPrimaryHorizontal(0);
                        primaryHorizontal2 = this.c3.getPrimaryHorizontal(1);
                    } else {
                        primaryHorizontal = this.c3.getPrimaryHorizontal(i13);
                        primaryHorizontal2 = this.c3.getPrimaryHorizontal(i25);
                    }
                    if (primaryHorizontal >= primaryHorizontal2) {
                        this.v4 = (int) (this.a3 + primaryHorizontal);
                    } else {
                        this.v4 = (int) (this.a3 + primaryHorizontal2 + AndroidUtilities.dp(3.0f));
                    }
                }
                e0();
            }
            f14 = 36.0f;
            if (this.d4) {
            }
            dp7 = this.v2 - AndroidUtilities.dp(12.0f);
            if (dp7 < 0) {
            }
            if (charSequence22 instanceof String) {
            }
            if (this.A2) {
            }
            float f2222 = dp7;
            this.O = org.telegram.ui.ActionBar.k6.B0[this.B0].measureText(charSequence22.toString()) <= f2222;
            if (!this.N) {
            }
            CharSequence replaceEmoji322 = Emoji.replaceEmoji(charSequence22, org.telegram.ui.ActionBar.k6.B0[this.B0].getFontMetricsInt(), false);
            MessageObject messageObject2122 = this.c1;
            if (messageObject2122 == null) {
            }
            if (this.N) {
            }
            this.y2 = (this.A2 || !this.w2.isRtlCharAt(0)) ? 0.0f : -AndroidUtilities.dp(f14);
            this.z2 = this.w2.isRtlCharAt(0);
            this.m3 = org.telegram.ui.Components.u5.update(0, (View) this, this.m3, this.w2);
            if (this.o2) {
            }
            f18 = 39.0f;
            f19 = 32.0f;
            f20 = 30.0f;
            f21 = 24.0f;
            dp = AndroidUtilities.dp(11.0f);
            this.n3 = AndroidUtilities.dp(32.0f);
            this.J2 = AndroidUtilities.dp(13.0f);
            this.r3 = AndroidUtilities.dp(42.33f);
            this.z3 = AndroidUtilities.dp(43.0f);
            this.F3 = AndroidUtilities.dp(42.33f);
            this.T2 = AndroidUtilities.dp(13.0f);
            int measuredWidth422222 = getMeasuredWidth() - AndroidUtilities.dp(this.F + 21);
            if (LocaleController.isRTL) {
            }
            i20 = dp3;
            this.r0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
            i21 = 0;
            while (true) {
                imageReceiverArr = this.S1;
                if (i21 >= imageReceiverArr.length) {
                }
                imageReceiverArr[i21].setImageCoords(((this.E4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.N ? AndroidUtilities.dp(20.0f) : 0)) - ((this.o2 || SharedConfig.useThreeLinesLayout || (isVar = this.q0) == null || isVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                i21++;
                dp = dp;
            }
            i22 = dp;
            i23 = measuredWidth422222;
            if (LocaleController.isRTL) {
            }
            if (this.N) {
            }
            if (!this.o2) {
                this.J2 -= AndroidUtilities.dp(f16);
                this.T2 -= AndroidUtilities.dp(f16);
                if (getIsPinned()) {
                }
                if (!this.q3) {
                }
                if (z19) {
                }
                max = Math.max(AndroidUtilities.dp(12.0f), i23);
                this.d3 = AndroidUtilities.dp((!this.o2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                if (!this.o2) {
                    this.d3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
                    if (Q()) {
                    }
                    if (this.N) {
                    }
                    this.k3 = org.telegram.ui.Components.u5.update(0, (View) this, this.k3, this.p3);
                    if (TextUtils.isEmpty(charSequence24)) {
                    }
                    this.l3 = org.telegram.ui.Components.u5.update(0, (View) this, this.l3, this.e3);
                    if (!TextUtils.isEmpty(charSequence23)) {
                    }
                    if (replaceEmoji instanceof Spannable) {
                    }
                    if (this.o2) {
                    }
                    this.U = org.telegram.ui.ActionBar.k6.F0[this.B0];
                    charSequence26 = charSequence412;
                    charSequence412 = null;
                    Layout.Alignment alignment222222 = Layout.Alignment.ALIGN_NORMAL;
                    if (this.o2) {
                    }
                    if (this.O1 > 0) {
                        max += AndroidUtilities.dp(f13);
                    }
                    int i42222222 = max;
                    TextPaint textPaint6222222 = this.U;
                    float dp9222222 = AndroidUtilities.dp(1.0f);
                    TextUtils.TruncateAt truncateAt222222 = TextUtils.TruncateAt.END;
                    this.b3 = kw0.b(charSequence26, textPaint6222222, i42222222, dp9222222, i42222222, charSequence412 != null ? 1 : 2);
                    max = i42222222;
                    this.f3.addAll(this.g3);
                    this.g3.clear();
                    jh.k.b(this, this.b3, -2, -2, this.f3, this.g3);
                    int i432222222 = max;
                    this.j3 = org.telegram.ui.Components.u5.update(0, (View) this, this.j3, this.b3);
                    if (LocaleController.isRTL) {
                    }
                    staticLayout = this.c3;
                    if (staticLayout != null) {
                        if (i13 >= 0) {
                        }
                        primaryHorizontal = this.c3.getPrimaryHorizontal(0);
                        primaryHorizontal2 = this.c3.getPrimaryHorizontal(1);
                        if (primaryHorizontal >= primaryHorizontal2) {
                        }
                    }
                    e0();
                }
                this.d3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
                if (Q()) {
                }
                if (this.N) {
                }
                this.k3 = org.telegram.ui.Components.u5.update(0, (View) this, this.k3, this.p3);
                if (TextUtils.isEmpty(charSequence24)) {
                }
                this.l3 = org.telegram.ui.Components.u5.update(0, (View) this, this.l3, this.e3);
                if (!TextUtils.isEmpty(charSequence23)) {
                }
                if (replaceEmoji instanceof Spannable) {
                }
                if (this.o2) {
                }
                this.U = org.telegram.ui.ActionBar.k6.F0[this.B0];
                charSequence26 = charSequence412;
                charSequence412 = null;
                Layout.Alignment alignment2222222 = Layout.Alignment.ALIGN_NORMAL;
                if (this.o2) {
                }
                if (this.O1 > 0) {
                }
                int i422222222 = max;
                TextPaint textPaint62222222 = this.U;
                float dp92222222 = AndroidUtilities.dp(1.0f);
                TextUtils.TruncateAt truncateAt2222222 = TextUtils.TruncateAt.END;
                this.b3 = kw0.b(charSequence26, textPaint62222222, i422222222, dp92222222, i422222222, charSequence412 != null ? 1 : 2);
                max = i422222222;
                this.f3.addAll(this.g3);
                this.g3.clear();
                jh.k.b(this, this.b3, -2, -2, this.f3, this.g3);
                int i4322222222 = max;
                this.j3 = org.telegram.ui.Components.u5.update(0, (View) this, this.j3, this.b3);
                if (LocaleController.isRTL) {
                }
                staticLayout = this.c3;
                if (staticLayout != null) {
                }
                e0();
            }
            this.J2 -= AndroidUtilities.dp(f16);
            this.T2 -= AndroidUtilities.dp(f16);
            if (getIsPinned()) {
            }
            if (!this.q3) {
            }
            if (z19) {
            }
            max = Math.max(AndroidUtilities.dp(12.0f), i23);
            this.d3 = AndroidUtilities.dp((!this.o2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
            if (!this.o2) {
            }
            this.d3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
            if (Q()) {
            }
            if (this.N) {
            }
            this.k3 = org.telegram.ui.Components.u5.update(0, (View) this, this.k3, this.p3);
            if (TextUtils.isEmpty(charSequence24)) {
            }
            this.l3 = org.telegram.ui.Components.u5.update(0, (View) this, this.l3, this.e3);
            if (!TextUtils.isEmpty(charSequence23)) {
            }
            if (replaceEmoji instanceof Spannable) {
            }
            if (this.o2) {
            }
            this.U = org.telegram.ui.ActionBar.k6.F0[this.B0];
            charSequence26 = charSequence412;
            charSequence412 = null;
            Layout.Alignment alignment22222222 = Layout.Alignment.ALIGN_NORMAL;
            if (this.o2) {
            }
            if (this.O1 > 0) {
            }
            int i4222222222 = max;
            TextPaint textPaint622222222 = this.U;
            float dp922222222 = AndroidUtilities.dp(1.0f);
            TextUtils.TruncateAt truncateAt22222222 = TextUtils.TruncateAt.END;
            this.b3 = kw0.b(charSequence26, textPaint622222222, i4222222222, dp922222222, i4222222222, charSequence412 != null ? 1 : 2);
            max = i4222222222;
            this.f3.addAll(this.g3);
            this.g3.clear();
            jh.k.b(this, this.b3, -2, -2, this.f3, this.g3);
            int i43222222222 = max;
            this.j3 = org.telegram.ui.Components.u5.update(0, (View) this, this.j3, this.b3);
            if (LocaleController.isRTL) {
            }
            staticLayout = this.c3;
            if (staticLayout != null) {
            }
            e0();
        }
        f13 = 5.0f;
        if (this.W0) {
        }
        if (!this.e4) {
        }
        if (z22) {
        }
        f14 = 36.0f;
        if (this.d4) {
        }
        dp7 = this.v2 - AndroidUtilities.dp(12.0f);
        if (dp7 < 0) {
        }
        if (charSequence22 instanceof String) {
        }
        if (this.A2) {
        }
        float f22222 = dp7;
        this.O = org.telegram.ui.ActionBar.k6.B0[this.B0].measureText(charSequence22.toString()) <= f22222;
        if (!this.N) {
        }
        CharSequence replaceEmoji3222 = Emoji.replaceEmoji(charSequence22, org.telegram.ui.ActionBar.k6.B0[this.B0].getFontMetricsInt(), false);
        MessageObject messageObject21222 = this.c1;
        if (messageObject21222 == null) {
        }
        if (this.N) {
        }
        this.y2 = (this.A2 || !this.w2.isRtlCharAt(0)) ? 0.0f : -AndroidUtilities.dp(f14);
        this.z2 = this.w2.isRtlCharAt(0);
        this.m3 = org.telegram.ui.Components.u5.update(0, (View) this, this.m3, this.w2);
        if (this.o2) {
        }
        f18 = 39.0f;
        f19 = 32.0f;
        f20 = 30.0f;
        f21 = 24.0f;
        dp = AndroidUtilities.dp(11.0f);
        this.n3 = AndroidUtilities.dp(32.0f);
        this.J2 = AndroidUtilities.dp(13.0f);
        this.r3 = AndroidUtilities.dp(42.33f);
        this.z3 = AndroidUtilities.dp(43.0f);
        this.F3 = AndroidUtilities.dp(42.33f);
        this.T2 = AndroidUtilities.dp(13.0f);
        int measuredWidth4222222 = getMeasuredWidth() - AndroidUtilities.dp(this.F + 21);
        if (LocaleController.isRTL) {
        }
        i20 = dp3;
        this.r0.F.set(dp2, dp, AndroidUtilities.dp(56.0f) + dp2, AndroidUtilities.dp(56.0f) + dp);
        i21 = 0;
        while (true) {
            imageReceiverArr = this.S1;
            if (i21 >= imageReceiverArr.length) {
            }
            imageReceiverArr[i21].setImageCoords(((this.E4 + 2) * i21) + i20, ((AndroidUtilities.dp(31.0f) + dp) + (this.N ? AndroidUtilities.dp(20.0f) : 0)) - ((this.o2 || SharedConfig.useThreeLinesLayout || (isVar = this.q0) == null || isVar.b()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
            i21++;
            dp = dp;
        }
        i22 = dp;
        i23 = measuredWidth4222222;
        if (LocaleController.isRTL) {
        }
        if (this.N) {
        }
        if (!this.o2) {
        }
        this.J2 -= AndroidUtilities.dp(f16);
        this.T2 -= AndroidUtilities.dp(f16);
        if (getIsPinned()) {
        }
        if (!this.q3) {
        }
        if (z19) {
        }
        max = Math.max(AndroidUtilities.dp(12.0f), i23);
        this.d3 = AndroidUtilities.dp((!this.o2 || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
        if (!this.o2) {
        }
        this.d3 -= AndroidUtilities.dp(Q() ? 10.0f : 12.0f);
        if (Q()) {
        }
        if (this.N) {
        }
        this.k3 = org.telegram.ui.Components.u5.update(0, (View) this, this.k3, this.p3);
        if (TextUtils.isEmpty(charSequence24)) {
        }
        this.l3 = org.telegram.ui.Components.u5.update(0, (View) this, this.l3, this.e3);
        if (!TextUtils.isEmpty(charSequence23)) {
        }
        if (replaceEmoji instanceof Spannable) {
        }
        if (this.o2) {
        }
        this.U = org.telegram.ui.ActionBar.k6.F0[this.B0];
        charSequence26 = charSequence412;
        charSequence412 = null;
        Layout.Alignment alignment222222222 = Layout.Alignment.ALIGN_NORMAL;
        if (this.o2) {
        }
        if (this.O1 > 0) {
        }
        int i42222222222 = max;
        TextPaint textPaint6222222222 = this.U;
        float dp9222222222 = AndroidUtilities.dp(1.0f);
        TextUtils.TruncateAt truncateAt222222222 = TextUtils.TruncateAt.END;
        this.b3 = kw0.b(charSequence26, textPaint6222222222, i42222222222, dp9222222222, i42222222222, charSequence412 != null ? 1 : 2);
        max = i42222222222;
        this.f3.addAll(this.g3);
        this.g3.clear();
        jh.k.b(this, this.b3, -2, -2, this.f3, this.g3);
        int i432222222222 = max;
        this.j3 = org.telegram.ui.Components.u5.update(0, (View) this, this.j3, this.b3);
        if (LocaleController.isRTL) {
        }
        staticLayout = this.c3;
        if (staticLayout != null) {
        }
        e0();
    }

    public final void u() {
        TLRPC.Message message;
        MessageObject messageObject = this.c1;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.U0) {
            ChatThemeController.getInstance(this.C0).setDialogTheme(this.E0, ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme, false);
        }
    }

    public final void v() {
        TLRPC.Chat chat = this.d2;
        boolean z4 = chat != null && chat.call_active && chat.call_not_empty;
        this.s2 = z4;
        this.n1 = z4 ? 1.0f : 0.0f;
    }

    public final void w() {
        TLRPC.User user;
        if (this.c2 != null && (user = MessagesController.getInstance(this.C0).getUser(Long.valueOf(this.c2.id))) != null) {
            this.c2 = user;
        }
        this.m1 = R() ? 1.0f : 0.0f;
    }

    public final void x() {
        k2 k2Var;
        boolean z4 = this.i0 > 0 && !this.s2 && !R() && ((k2Var = this.n2) == null || !k2Var.a.q) && !this.r0.w;
        this.t2 = z4;
        this.j0 = z4 ? 1.0f : 0.0f;
    }

    public final int y() {
        if (!Q() || this.g0 || this.f) {
            return getCollapsedHeight();
        }
        int dp = AndroidUtilities.dp((this.o2 || SharedConfig.useThreeLinesLayout) ? 86.0f : 91.0f);
        if (this.p2) {
            dp++;
        }
        return M() ? AndroidUtilities.dp(this.J) + dp : dp;
    }

    public r2(py pyVar, Context context, boolean z4, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = true;
        this.x = true;
        int i11 = 0;
        this.y = false;
        this.E = 11;
        this.F = 72;
        this.G = 70;
        this.H = 76;
        this.I = 3;
        this.J = 11;
        this.R = 42.0f;
        j2 j2Var = new j2(this);
        this.r0 = j2Var;
        this.w0 = true;
        this.z0 = 0.0f;
        this.a1 = false;
        this.b1 = false;
        this.C1 = new rc(this);
        this.D1 = new Paint(1);
        this.E1 = new RectF();
        this.I1 = false;
        this.R1 = new boolean[3];
        this.S1 = new ImageReceiver[3];
        this.T1 = new boolean[3];
        this.U1 = new boolean[3];
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.V1 = imageReceiver;
        this.X1 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        this.a2 = new f2.a0(5);
        pr prVar = pr.h;
        this.j2 = new org.telegram.ui.Components.z5(this, 0L, 350L, prVar);
        this.l2 = new org.telegram.ui.Components.z5(this, 0L, 350L, prVar);
        this.f3 = new Stack();
        this.g3 = new ArrayList();
        this.h3 = new Stack();
        this.i3 = new ArrayList();
        this.E3 = true;
        this.L3 = new xd.a(this, prVar, 320L);
        this.O3 = 1.0f;
        this.P3 = 1.0f;
        this.k4 = new RectF();
        this.q4 = -1;
        this.A4 = -1;
        this.B4 = new o2(this);
        j2Var.I = true;
        this.C4 = g6Var;
        this.w4 = pyVar;
        org.telegram.ui.ActionBar.k6.R(context);
        this.y = false;
        this.B = false;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
        while (true) {
            ImageReceiver[] imageReceiverArr = this.S1;
            if (i11 >= imageReceiverArr.length) {
                this.o2 = z4;
                this.C0 = i10;
                fg.h0 h0Var = new fg.h0(this, context, 6);
                this.f4 = h0Var;
                addView(h0Var);
                this.g4 = new org.telegram.ui.Components.j5(AndroidUtilities.dp(22.0f), h0Var);
                this.h4 = new org.telegram.ui.Components.j5(AndroidUtilities.dp(17.0f), this);
                this.V1.setAllowLoadingOnAttachedOnly(true);
                return;
            }
            imageReceiverArr[i11] = new ImageReceiver(this);
            ImageReceiver imageReceiver2 = this.S1[i11];
            imageReceiver2.ignoreNotifications = true;
            imageReceiver2.setRoundRadius(AndroidUtilities.dp(2.0f));
            this.S1[i11].setAllowLoadingOnAttachedOnly(true);
            i11++;
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (oh.i9.u1) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
    }
}
