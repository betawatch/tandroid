package org.telegram.ui.Cells;

import ai.qc;
import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AlignmentSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g31;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.m50;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.r01;
import org.telegram.ui.Components.t61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.co;
import org.telegram.ui.ep0;
import org.telegram.ui.fk;
import org.telegram.ui.j11;
import org.telegram.ui.j20;
import org.telegram.ui.lg;
import org.telegram.ui.sm;
import org.telegram.ui.tg;
import org.telegram.ui.vb;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class w0 extends a0 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate, o4 {
    public static final HashMap s2;
    public float A0;
    public StaticLayout A1;
    public float B0;
    public float B1;
    public boolean C0;
    public StaticLayout C1;
    public boolean D0;
    public float D1;
    public boolean E;
    public final zg.o0 E0;
    public final TextPaint E1;
    public boolean F;
    public float F0;
    public final TextPaint F1;
    public boolean G;
    public float G0;
    public final TextPaint G1;
    public final int H;
    public yh.u3 H0;
    public TLRPC.Document H1;
    public final ImageReceiver I;
    public org.telegram.ui.Wallet.d3 I0;
    public TLRPC.VideoSize I1;
    public Drawable J;
    public boolean J0;
    public final RadialProgress2 J1;
    public Path K;
    public float K0;
    public int K1;
    public final org.telegram.ui.Components.j9 L;
    public float L0;
    public boolean L1;
    public StaticLayout M;
    public float M0;
    public RectF M1;
    public int N;
    public final RectF N0;
    public final ja N1;
    public int O;
    public iz0 O0;
    public boolean O1;
    public StaticLayout P;
    public MessageObject P0;
    public ColorMatrixColorFilter P1;
    public int Q;
    public int Q0;
    public CornerPathEffect Q1;
    public int R;
    public CharSequence R0;
    public Path R1;
    public int S;
    public xh.g1 S0;
    public l11 S1;
    public int T;
    public int T0;
    public final View T1;
    public int U;
    public int U0;
    public final Path U1;
    public int V;
    public Paint V0;
    public final rg.v1 V1;
    public boolean W;
    public TextPaint W0;
    public int W1;
    public final ArrayList X0;
    public final ArrayList X1;
    public final ArrayList Y0;
    public BotInlineKeyboard.Source Y1;
    public final Path Z0;
    public boolean Z1;
    public boolean a0;
    public int a1;
    public int a2;
    public RadialProgressView b0;
    public int b1;
    public float b2;
    public float c0;
    public final RectF c1;
    public final Paint c2;
    public final ai.da d0;
    public boolean d1;
    public boolean d2;
    public boolean e0;
    public boolean e1;
    public View.OnClickListener e2;
    public int f;
    public boolean f0;
    public t0 f1;
    public int f2;
    public boolean g0;
    public final org.telegram.ui.ActionBar.e6 g1;
    public final Path g2;
    public int h;
    public boolean h0;
    public int h1;
    public final float[] h2;
    public boolean i0;
    public int i1;
    public final float[] i2;
    public int j0;
    public StaticLayout j1;
    public final Path j2;
    public boolean k0;
    public Paint k1;
    public final int[] k2;
    public int l0;
    public l11 l1;
    public int l2;
    public boolean m0;
    public StaticLayout m1;
    public SpannableStringBuilder m2;
    public final bd n;
    public g31 n0;
    public boolean n1;
    public boolean n2;
    public final RectF o0;
    public boolean o1;
    public Runnable o2;
    public final ArrayList p0;
    public int p1;
    public PorterDuffColorFilter p2;
    public final Stack q0;
    public final org.telegram.ui.Components.g6 q1;
    public int q2;
    public ia0 r;
    public org.telegram.ui.Components.x5 r0;
    public j20 r1;
    public final v0 r2;
    public final boolean s;
    public TextPaint s0;
    public u0 s1;
    public float t0;
    public int t1;
    public float u0;
    public int u1;
    public View v;
    public int v0;
    public int v1;
    public final int w;
    public boolean w0;
    public l11 w1;
    public URLSpan x;
    public ImageLocation x0;
    public StaticLayout x1;
    public vh.g y;
    public float y0;
    public boolean y1;
    public float z0;
    public TextPaint z1;

    static {
        HashMap hashMap = new HashMap();
        s2 = hashMap;
        hg.c.o(1, hashMap, "1⃣", 3, "2⃣");
        hg.c.o(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public w0(Context context) {
        this(context, null, false);
    }

    public static float S(StaticLayout staticLayout) {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < staticLayout.getLineCount(); i10++) {
            float ceil = (int) Math.ceil(staticLayout.getLineWidth(i10));
            if (ceil > f7) {
                f7 = ceil;
            }
        }
        return f7;
    }

    private float getWalletActionTop() {
        return AndroidUtilities.dp(11.0f) + this.S + this.O;
    }

    private void setStarsPaused(boolean z10) {
        rg.v1 v1Var = this.V1;
        if (z10 == v1Var.g) {
            return;
        }
        v1Var.g = z10;
        if (z10) {
            v1Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < v1Var.n.size(); i10++) {
            rg.u1 u1Var = (rg.u1) v1Var.n.get(i10);
            u1Var.a = (System.currentTimeMillis() - v1Var.Q) + u1Var.a;
        }
        invalidate();
    }

    public static SpannableStringBuilder z(int i10, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(1.3f), 0.8f, i10));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new q2(AndroidUtilities.dp(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            ah.e.l();
            spannableStringBuilder.setSpan(ah.e.g(AndroidUtilities.dp(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final void B(Canvas canvas, boolean z10) {
        Paint paint;
        Paint paint2;
        org.telegram.ui.ActionBar.e6 e6Var;
        float f7;
        float f10;
        float f11;
        float f12;
        w0 w0Var;
        Paint paint3;
        Paint paint4;
        int i10;
        int i11;
        Canvas canvas2;
        float f13;
        float f14;
        float f15;
        int i12;
        u0 u0Var;
        int dp;
        RectF rectF;
        ArrayList arrayList;
        int i13;
        float f16;
        int i14;
        Paint paint5;
        int i15;
        float f17;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i16;
        w0 w0Var2 = this;
        if (!w0Var2.s || ((!w0Var2.K() || z10) && (w0Var2.K() || !z10))) {
            Paint I = w0Var2.I("paintChatActionBackground");
            Paint I2 = w0Var2.I("paintChatActionBackgroundDarken");
            w0Var2.s0 = (TextPaint) w0Var2.I("paintChatActionText");
            int i17 = w0Var2.T0;
            org.telegram.ui.ActionBar.e6 e6Var3 = w0Var2.g1;
            if (i17 >= 0) {
                int w02 = org.telegram.ui.ActionBar.i6.w0(i17, e6Var3);
                if (w0Var2.V0 == null) {
                    Paint paint6 = new Paint(1);
                    w0Var2.V0 = paint6;
                    paint6.setColor(w02);
                    TextPaint textPaint = new TextPaint(1);
                    w0Var2.W0 = textPaint;
                    textPaint.setTypeface(AndroidUtilities.bold());
                    w0Var2.W0.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                    w0Var2.W0.setColor(org.telegram.ui.ActionBar.i6.w0(w0Var2.U0, e6Var3));
                }
                I = w0Var2.V0;
                w0Var2.s0 = w0Var2.W0;
            }
            boolean z11 = w0Var2.d1;
            Path path = w0Var2.Z0;
            if (z11) {
                w0Var2.d1 = false;
                w0Var2.a1 = w0Var2.getWidth();
                w0Var2.b1 = 0;
                ArrayList arrayList3 = w0Var2.X0;
                arrayList3.clear();
                StaticLayout staticLayout = w0Var2.M;
                int lineCount = staticLayout == null ? 0 : staticLayout.getLineCount();
                int dp2 = AndroidUtilities.dp(11.0f);
                f10 = 6.0f;
                int dp3 = AndroidUtilities.dp(8.0f);
                f7 = 8.0f;
                int i18 = 0;
                int i19 = 0;
                while (i18 < lineCount) {
                    int ceil = (int) Math.ceil(w0Var2.M.getLineWidth(i18));
                    if (i18 != 0 && (i16 = i19 - ceil) > 0 && i16 <= (dp2 * 1.5f) + dp3) {
                        ceil = i19;
                    }
                    i18 = com.google.android.gms.internal.vision.e2.e(ceil, i18, 1, arrayList3);
                    i19 = ceil;
                }
                f11 = 4.0f;
                f12 = 2.0f;
                for (int i20 = lineCount - 2; i20 >= 0; i20--) {
                    int intValue = ((Integer) arrayList3.get(i20)).intValue();
                    int i21 = i19 - intValue;
                    if (i21 <= 0 || i21 > (dp2 * 1.5f) + dp3) {
                        i19 = intValue;
                    }
                    arrayList3.set(i20, Integer.valueOf(i19));
                }
                int dp4 = AndroidUtilities.dp(4.0f);
                int measuredWidth = w0Var2.getMeasuredWidth() / 2;
                int dp5 = AndroidUtilities.dp(3.0f);
                int dp6 = AndroidUtilities.dp(6.0f);
                int i22 = dp2 - dp5;
                ArrayList arrayList4 = w0Var2.Y0;
                arrayList4.clear();
                path.reset();
                float f18 = measuredWidth;
                path.moveTo(f18, dp4);
                int i23 = i19;
                int i24 = 0;
                int i25 = 0;
                while (true) {
                    rectF = w0Var2.c1;
                    if (i25 >= lineCount) {
                        break;
                    }
                    int i26 = lineCount;
                    int intValue2 = ((Integer) arrayList3.get(i25)).intValue();
                    int lineBottom = w0Var2.M.getLineBottom(i25);
                    int i27 = i26 - 1;
                    if (i25 < i27) {
                        paint5 = I2;
                        i15 = ((Integer) arrayList3.get(i25 + 1)).intValue();
                    } else {
                        paint5 = I2;
                        i15 = 0;
                    }
                    int i28 = lineBottom - i24;
                    if (i25 == 0 || intValue2 > i23) {
                        i28 = AndroidUtilities.dp(3.0f) + i28;
                    }
                    if (i25 == i27 || intValue2 > i15) {
                        i28 = AndroidUtilities.dp(3.0f) + i28;
                    }
                    Paint paint7 = I;
                    float f19 = (intValue2 / 2.0f) + f18;
                    int i29 = (i25 == i27 || intValue2 >= i15 || i25 == 0 || intValue2 >= i23) ? dp3 : dp6;
                    if (i25 == 0 || intValue2 > i23) {
                        f17 = f19;
                        arrayList2 = arrayList3;
                        e6Var2 = e6Var3;
                        rectF.set((f17 - dp5) - dp2, dp4, f17 + i22, (dp2 * 2) + dp4);
                        u();
                        path.arcTo(rectF, -90.0f, 90.0f);
                    } else {
                        f17 = f19;
                        if (intValue2 < i23) {
                            float f20 = f17 + i22;
                            e6Var2 = e6Var3;
                            arrayList2 = arrayList3;
                            rectF.set(f20, dp4, (i29 * 2) + f20, r0 + dp4);
                            u();
                            path.arcTo(rectF, -90.0f, -90.0f);
                        } else {
                            arrayList2 = arrayList3;
                            e6Var2 = e6Var3;
                        }
                    }
                    dp4 += i28;
                    if (i25 != i27 && intValue2 < i15) {
                        dp4 -= AndroidUtilities.dp(3.0f);
                        i28 -= AndroidUtilities.dp(3.0f);
                    }
                    if (i25 != 0 && intValue2 < i23) {
                        dp4 -= AndroidUtilities.dp(3.0f);
                        i28 -= AndroidUtilities.dp(3.0f);
                    }
                    arrayList4.add(Integer.valueOf(i28));
                    if (i25 == i27 || intValue2 > i15) {
                        rectF.set((f17 - dp5) - dp2, dp4 - (dp2 * 2), f17 + i22, dp4);
                        u();
                        path.arcTo(rectF, 0.0f, 90.0f);
                    } else if (intValue2 < i15) {
                        float f21 = f17 + i22;
                        rectF.set(f21, dp4 - r0, (i29 * 2) + f21, dp4);
                        u();
                        path.arcTo(rectF, 180.0f, -90.0f);
                    }
                    i25++;
                    w0Var2 = this;
                    i23 = intValue2;
                    i24 = lineBottom;
                    lineCount = i26;
                    I2 = paint5;
                    I = paint7;
                    e6Var3 = e6Var2;
                    arrayList3 = arrayList2;
                }
                paint = I;
                paint2 = I2;
                ArrayList arrayList5 = arrayList3;
                e6Var = e6Var3;
                int i30 = lineCount - 1;
                int i31 = i30;
                while (i31 >= 0) {
                    if (i31 != 0) {
                        arrayList = arrayList5;
                        i13 = ((Integer) arrayList.get(i31 - 1)).intValue();
                    } else {
                        arrayList = arrayList5;
                        i13 = 0;
                    }
                    int intValue3 = ((Integer) arrayList.get(i31)).intValue();
                    int intValue4 = i31 != i30 ? ((Integer) arrayList.get(i31 + 1)).intValue() : 0;
                    this.M.getLineBottom(i31);
                    float f22 = measuredWidth - (intValue3 / 2);
                    int i32 = (i31 == i30 || intValue3 >= intValue4 || i31 == 0 || intValue3 >= i13) ? dp3 : dp6;
                    if (i31 == i30 || intValue3 > intValue4) {
                        arrayList5 = arrayList;
                        f16 = f22;
                        i14 = i32;
                        rectF.set(f16 - i22, dp4 - (dp2 * 2), f16 + dp5 + dp2, dp4);
                        u();
                        path.arcTo(rectF, 90.0f, 90.0f);
                    } else if (intValue3 < intValue4) {
                        float f23 = f22 - i22;
                        arrayList5 = arrayList;
                        f16 = f22;
                        i14 = i32;
                        rectF.set(f23 - (i32 * 2), dp4 - r2, f23, dp4);
                        u();
                        path.arcTo(rectF, 90.0f, -90.0f);
                    } else {
                        arrayList5 = arrayList;
                        f16 = f22;
                        i14 = i32;
                    }
                    dp4 -= ((Integer) arrayList4.get(i31)).intValue();
                    if (i31 == 0 || intValue3 > i13) {
                        rectF.set(f16 - i22, dp4, f16 + dp5 + dp2, (dp2 * 2) + dp4);
                        u();
                        path.arcTo(rectF, 180.0f, 90.0f);
                    } else if (intValue3 < i13) {
                        float f24 = f16 - i22;
                        rectF.set(f24 - (i14 * 2), dp4, f24, r9 + dp4);
                        u();
                        path.arcTo(rectF, 0.0f, -90.0f);
                    }
                    i31--;
                }
                w0Var = this;
                path.close();
                if (w0Var.P() && !w0Var.Q()) {
                    rectF.left = (f18 - (w0Var.N / 2.0f)) - AndroidUtilities.dp(17.0f);
                    rectF.top = dp4;
                    rectF.right = (w0Var.N / 2.0f) + f18 + AndroidUtilities.dp(17.0f);
                    rectF.bottom = AndroidUtilities.dp(28.0f) + dp4 + w0Var.O + w0Var.Q;
                    path.reset();
                    path.addRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), Path.Direction.CW);
                    path.close();
                }
            } else {
                paint = I;
                paint2 = I2;
                e6Var = e6Var3;
                f7 = 8.0f;
                f10 = 6.0f;
                f11 = 4.0f;
                f12 = 2.0f;
                w0Var = w0Var2;
            }
            if (!w0Var.w0) {
                w0Var.v0 = ((ViewGroup) w0Var.getParent()).getMeasuredHeight();
            }
            if (e6Var != null) {
                e6Var.m(w0Var.u0, w0Var.t0 + AndroidUtilities.dp(f11), w0Var.getMeasuredWidth(), w0Var.v0);
            } else {
                org.telegram.ui.ActionBar.i6.q(w0Var.u0, w0Var.t0 + AndroidUtilities.dp(f11), w0Var.getMeasuredWidth(), w0Var.v0);
            }
            if (!z10 || (w0Var.getAlpha() == 1.0f && !(w0Var instanceof fk))) {
                paint3 = paint2;
                paint4 = paint;
                boolean z12 = w0Var instanceof fk;
                if (z12) {
                    int alpha = paint4.getAlpha();
                    int alpha2 = paint3.getAlpha();
                    paint4.setAlpha((int) (alpha * (z12 ? 0.75f : 1.0f)));
                    paint3.setAlpha((int) (alpha2 * (z12 ? 0.75f : 1.0f)));
                    i10 = alpha;
                    i11 = alpha2;
                } else {
                    i10 = -1;
                    i11 = -1;
                }
            } else {
                i10 = paint.getAlpha();
                i11 = paint2.getAlpha();
                boolean z13 = w0Var instanceof fk;
                paint4 = paint;
                paint4.setAlpha((int) (w0Var.getAlpha() * i10 * (z13 ? 0.75f : 1.0f)));
                float alpha3 = w0Var.getAlpha() * i11;
                float f25 = z13 ? 0.75f : 1.0f;
                paint3 = paint2;
                paint3.setAlpha((int) (alpha3 * f25));
            }
            MessageObject messageObject = w0Var.P0;
            Paint paint8 = w0Var.c2;
            if (messageObject == null || !messageObject.isRepostPreview) {
                canvas2 = canvas;
                canvas2.drawPath(path, paint4);
                if (w0Var.K() && paint3.getAlpha() > 0) {
                    canvas2.drawPath(path, paint3);
                }
                if (w0Var.b2 > 0.0f) {
                    int alpha4 = paint8.getAlpha();
                    if (z10) {
                        paint8.setAlpha((int) (w0Var.getAlpha() * alpha4));
                    }
                    canvas2.drawPath(path, paint8);
                    paint8.setAlpha(alpha4);
                }
            } else {
                canvas2 = canvas;
            }
            if (w0Var.M()) {
                int width = w0Var.getWidth();
                w0Var.I0.getClass();
                float dp7 = (width - AndroidUtilities.dp(206.0f)) / f12;
                float walletActionTop = w0Var.getWalletActionTop();
                w0Var.I0.getClass();
                float dp8 = AndroidUtilities.dp(206.0f) + dp7;
                if (w0Var.I0.q0 == null) {
                    dp = AndroidUtilities.dp(140.0f);
                    f13 = 140.0f;
                    f14 = 20.0f;
                } else {
                    f13 = 140.0f;
                    f14 = 20.0f;
                    dp = AndroidUtilities.dp(150.0f) + ((int) Math.ceil(r13.q0.j()));
                }
                RectF rectF2 = w0Var.N0;
                rectF2.set(dp7, walletActionTop, dp8, dp + walletActionTop);
                canvas2.save();
                w0Var.I0.c(canvas2, dp7, walletActionTop);
                canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f14), AndroidUtilities.dp(f14), paint4);
                if (w0Var.K() && paint3.getAlpha() > 0) {
                    canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f14), AndroidUtilities.dp(f14), paint3);
                }
                f15 = 0.0f;
                if (w0Var.b2 > 0.0f) {
                    int alpha5 = paint8.getAlpha();
                    if (z10) {
                        paint8.setAlpha((int) (w0Var.getAlpha() * alpha5));
                    }
                    canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f14), AndroidUtilities.dp(f14), paint8);
                    paint8.setAlpha(alpha5);
                }
                canvas2.restore();
            } else {
                f13 = 140.0f;
                f14 = 20.0f;
                f15 = 0.0f;
            }
            MessageObject messageObject2 = w0Var.P0;
            if (w0Var.L()) {
                float dp9 = w0Var.H0.Q.e + AndroidUtilities.dp(f7);
                float width2 = (w0Var.getWidth() - dp9) / f12;
                float dp10 = w0Var.H0.p ? f15 : AndroidUtilities.dp(12.0f) + w0Var.S + w0Var.O;
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(width2, dp10, dp9 + width2, w0Var.H0.M + dp10 + AndroidUtilities.dp(f7));
                if (w0Var.M1 == null) {
                    w0Var.M1 = new RectF();
                }
                w0Var.M1.set(rectF3);
                canvas2.drawRoundRect(w0Var.M1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (w0Var.K()) {
                    canvas2.drawRoundRect(w0Var.M1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (w0Var.O0 != null) {
                float dp11 = AndroidUtilities.dp(174.0f);
                iz0 iz0Var = w0Var.O0;
                iz0Var.getClass();
                float dp12 = AndroidUtilities.dp(f13) + ((int) iz0Var.f.j()) + (iz0Var.i ? AndroidUtilities.dp(40.0f) : 0);
                float width3 = (w0Var.getWidth() - dp11) / f12;
                if (w0Var.M1 == null) {
                    w0Var.M1 = new RectF();
                }
                w0Var.M1.set(width3, AndroidUtilities.dp(f11), dp11 + width3, AndroidUtilities.dp(f11) + dp12);
                canvas2.drawRoundRect(w0Var.M1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (w0Var.K()) {
                    canvas2.drawRoundRect(w0Var.M1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (w0Var.O(messageObject2)) {
                float width4 = (w0Var.getWidth() - w0Var.i1) / f12;
                float f26 = w0Var.S + w0Var.O;
                if (w0Var.Q()) {
                    float dp13 = f26 + AndroidUtilities.dp(f11);
                    AndroidUtilities.rectTmp.set(width4, dp13, w0Var.i1 + width4, w0Var.f + dp13);
                } else {
                    float dp14 = f26 + AndroidUtilities.dp(12.0f);
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f27 = w0Var.i1;
                    rectF4.set(width4, dp14, width4 + f27, f27 + dp14 + w0Var.K1);
                }
                if (messageObject2 != null && messageObject2.type == 18 && !w0Var.o1 && (u0Var = w0Var.s1) != null && w0Var.p1 > 0) {
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    rectF5.bottom = com.google.android.gms.internal.vision.e2.b(1.0f, w0Var.q1.c, ((StaticLayout) u0Var.f).getHeight() - w0Var.p1, rectF5.bottom);
                }
                if (w0Var.M1 == null) {
                    w0Var.M1 = new RectF();
                }
                w0Var.M1.set(AndroidUtilities.rectTmp);
                if (messageObject2 == null || (!((i12 = messageObject2.type) == 33 || i12 == 35) || w0Var.Y1 == null)) {
                    canvas2.drawRoundRect(w0Var.M1, AndroidUtilities.dp(f14), AndroidUtilities.dp(f14), paint4);
                    if (w0Var.K()) {
                        canvas2.drawRoundRect(w0Var.M1, AndroidUtilities.dp(f14), AndroidUtilities.dp(f14), paint3);
                    }
                } else {
                    float dp15 = AndroidUtilities.dp(16.0f);
                    float[] fArr = w0Var.h2;
                    Arrays.fill(fArr, dp15);
                    float dp16 = AndroidUtilities.dp(f10);
                    fArr[7] = dp16;
                    fArr[6] = dp16;
                    fArr[5] = dp16;
                    fArr[4] = dp16;
                    Path path2 = w0Var.g2;
                    path2.rewind();
                    path2.addRoundRect(w0Var.M1, fArr, Path.Direction.CW);
                    canvas2.drawPath(path2, paint4);
                    if (w0Var.K()) {
                        canvas2.drawPath(path2, paint3);
                    }
                }
            }
            if (i10 >= 0) {
                paint4.setAlpha(i10);
                paint3.setAlpha(i11);
            }
        }
    }

    public final void C(Canvas canvas) {
        float f7;
        float f10;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f11 = 2.0f;
        canvas2.translate(this.j0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.T, this.S);
        StaticLayout staticLayout = this.M;
        org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas2, staticLayout, this.r0, 0.0f, this.p0, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout != null ? G(staticLayout.getPaint().getColor()) : null);
        canvas2.restore();
        float f12 = 4.0f;
        if (L()) {
            canvas2.save();
            float width = getWidth();
            yh.u3 u3Var = this.H0;
            canvas2.translate((width - u3Var.Q.e) / 2.0f, u3Var.p ? AndroidUtilities.dp(4.0f) : AndroidUtilities.dp(16.0f) + this.S + this.O);
            this.H0.c(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        g31 g31Var = this.n0;
        org.telegram.ui.ActionBar.e6 e6Var = this.g1;
        if (g31Var != null) {
            float alpha = getAlpha();
            if (e6Var != null) {
                e6Var.m(this.u0, this.t0 + 0.0f, getMeasuredWidth(), this.v0);
            } else {
                org.telegram.ui.ActionBar.i6.q(this.u0, this.t0 + 0.0f, getMeasuredWidth(), this.v0);
            }
            this.n0.c(canvas, getWidth(), this.j0, 0.0f, 1.0f, alpha, this.m0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.X1;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (e6Var != null) {
            e6Var.m(this.u0, this.t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.v0);
        } else {
            org.telegram.ui.ActionBar.i6.q(this.u0, this.t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.v0);
        }
        float width2 = (getWidth() - this.i1) / 2.0f;
        float dp = AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(4.0f) + this.S + this.O + this.f;
        float dp2 = (this.i1 - AndroidUtilities.dp(4.0f)) / 2.0f;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            e0 e0Var = (e0) arrayList.get(i10);
            float a2 = e0Var.a();
            float dp3 = ((AndroidUtilities.dp(f12) + dp2) * i10) + width2;
            float f13 = dp3 + dp2;
            RectF rectF = this.c1;
            rectF.set(dp3, dp, f13, e0Var.f + dp);
            canvas2.save();
            if (a2 != 1.0f) {
                f7 = f12;
                canvas2.scale(a2, a2, rectF.centerX(), rectF.centerY());
            } else {
                f7 = f12;
            }
            float dp4 = AndroidUtilities.dp(Math.min(6.75f, SharedConfig.bubbleRadius));
            float[] fArr = this.i2;
            Arrays.fill(fArr, dp4);
            if ((e0Var.g & 9) == 9) {
                float dp5 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                fArr[7] = dp5;
                fArr[6] = dp5;
            }
            if ((e0Var.g & 10) == 10) {
                float dp6 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                fArr[5] = dp6;
                fArr[4] = dp6;
            }
            Path path = this.j2;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas2.drawPath(path, I("paintChatActionBackground"));
            if (K()) {
                canvas2.drawPath(path, org.telegram.ui.ActionBar.i6.h2);
            }
            canvas2.save();
            canvas2.clipPath(path);
            z zVar = e0Var.s;
            if (zVar != null) {
                int i11 = (int) dp;
                zVar.setBounds((int) dp3, i11, (int) f13, e0Var.f + i11);
                e0Var.s.setAlpha(255);
                e0Var.s.draw(canvas2);
            }
            canvas2.restore();
            canvas2.save();
            float dp7 = e0Var.t != null ? AndroidUtilities.dp(26.0f) : 0;
            float z10 = com.google.android.gms.internal.vision.e2.z(dp2 - (e0Var.h.l() + (e0Var.t != null ? AndroidUtilities.dp(f7) : 0)), dp7, f11, dp3);
            Drawable drawable = e0Var.t;
            if (drawable != null) {
                int i12 = (int) z10;
                f10 = f11;
                drawable.setBounds(i12, (int) (((e0Var.f - AndroidUtilities.dp(24.0f)) / f11) + dp), AndroidUtilities.dp(24.0f) + i12, AndroidUtilities.dp(24.0f) + ((int) (((e0Var.f - AndroidUtilities.dp(24.0f)) / f10) + dp)));
                e0Var.t.setAlpha(e0Var.m ? 128 : 255);
                e0Var.t.draw(canvas2);
                z10 += dp7;
            } else {
                f10 = f11;
            }
            e0Var.h.p = Math.max(1, (((int) dp2) - AndroidUtilities.dp(15.0f)) - r6);
            e0Var.h.f(canvas2, z10, (AndroidUtilities.dp(40.0f) / f10) + dp, e0Var.m ? 0.5f : 1.0f);
            canvas2.restore();
            canvas2.restore();
            i10++;
            f12 = f7;
            f11 = f10;
        }
    }

    public final void D(Canvas canvas, boolean z10) {
        if (this.s) {
            if (K() && !z10) {
                return;
            }
            if (!K() && z10) {
                return;
            }
        }
        E(canvas, z10, null);
    }

    public final void E(Canvas canvas, boolean z10, Integer num) {
        Canvas canvas2;
        float alpha = z10 ? getAlpha() : 1.0f;
        if (alpha <= 0.0f) {
            return;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.g1;
        if (e6Var != null) {
            e6Var.m(this.u0, this.t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.v0);
        } else {
            org.telegram.ui.ActionBar.i6.q(this.u0, this.t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.v0);
        }
        MessageObject messageObject = this.P0;
        if (messageObject == null || !messageObject.shouldDrawReactions()) {
            return;
        }
        zg.o0 o0Var = this.E0;
        boolean z11 = o0Var.b;
        v0 v0Var = this.r2;
        if (!z11 || (v0Var.b && o0Var.l)) {
            o0Var.a = 1.0f;
            if (alpha < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            o0Var.d(canvas2, v0Var.b ? v0Var.c : 1.0f, num);
            if (alpha < 1.0f) {
                canvas2.restore();
            }
        }
    }

    public final void F(sm smVar, Canvas canvas, int i10, Integer num, float f7) {
        zg.o0 o0Var = this.E0;
        if (o0Var.b) {
            return;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.g1;
        if (e6Var != null) {
            e6Var.m(this.u0, this.t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.v0);
        } else {
            org.telegram.ui.ActionBar.i6.q(this.u0, this.t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.v0);
        }
        o0Var.D = f7;
        o0Var.f(smVar, canvas, i10, num);
    }

    public final ColorFilter G(int i10) {
        if (i10 != this.q2 || this.p2 == null) {
            this.q2 = i10;
            this.p2 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.p2;
    }

    public final int H(MessageObject messageObject) {
        int i10;
        int i11 = this.h1;
        int i12 = messageObject.type;
        if (i12 == 37) {
            i11 = AndroidUtilities.dp(52.0f);
        } else if (i12 == 21 || Q()) {
            i11 = AndroidUtilities.dp(78.0f);
        }
        if (P() || (i10 = messageObject.type) == 34 || i10 == 35) {
            return 0;
        }
        return i11;
    }

    public Paint I(String str) {
        org.telegram.ui.ActionBar.e6 e6Var = this.g1;
        Paint F = e6Var != null ? e6Var.F(str) : null;
        return F != null ? F : org.telegram.ui.ActionBar.i6.T0(str);
    }

    public final float J(MessageObject messageObject) {
        MessagesController messagesController;
        String str;
        if (messageObject == null) {
            return 1.0f;
        }
        try {
            if (messageObject.type == 22 && (str = (messagesController = MessagesController.getInstance(this.H)).uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                return messagesController.uploadingWallpaperInfo.r;
            }
            return 1.0f;
        } catch (Exception e7) {
            FileLog.e(e7);
            return 1.0f;
        }
    }

    public final boolean K() {
        if (this.V0 != null) {
            return false;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.g1;
        return e6Var != null ? e6Var.k0() : org.telegram.ui.ActionBar.i6.b1();
    }

    public final boolean L() {
        yh.u3 u3Var = this.H0;
        return (u3Var == null || u3Var.N == null) ? false : true;
    }

    public final boolean M() {
        TLRPC.Message message;
        MessageObject messageObject = this.P0;
        return (messageObject == null || (message = messageObject.messageOwner) == null || !(message.action instanceof TLRPC.TL_messageActionGramTransfer)) ? false : true;
    }

    public final void N() {
        t0 t0Var = this.f1;
        if (t0Var != null && t0Var.f()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean O(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        int i10 = messageObject.type;
        return i10 == 30 || i10 == 18 || i10 == 25 || Q();
    }

    public final boolean P() {
        TLRPC.Message message;
        MessageObject messageObject = this.P0;
        return (messageObject == null || (message = messageObject.messageOwner) == null || !(message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) ? false : true;
    }

    public final boolean Q() {
        MessageObject messageObject;
        int i10;
        if (L() || this.O0 != null || (i10 = (messageObject = this.P0).type) == 31 || i10 == 37 || i10 == 33 || i10 == 35 || i10 == 34 || i10 == 21 || i10 == 22 || messageObject.isStoryMention()) {
            return true;
        }
        TLRPC.Message message = this.P0.messageOwner;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
            return ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low || ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).rejected;
        }
        return false;
    }

    public final boolean R() {
        MessageObject messageObject = this.P0;
        if (messageObject == null) {
            return false;
        }
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.MessageAction messageAction = message.action;
        if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
            return UserObject.isUserSelf(MessagesController.getInstance(this.H).getUser(Long.valueOf(this.P0.messageOwner.from_id.user_id)));
        }
        return false;
    }

    public final void T(CharacterStyle characterStyle) {
        if (this.f1 == null || !(characterStyle instanceof URLSpan)) {
            return;
        }
        String url = ((URLSpan) characterStyle).getURL();
        if (url.startsWith("task")) {
            this.f1.k0(this, this.P0.getReplyMsgId(), Integer.parseInt(url.substring(5)));
            return;
        }
        if (url.startsWith("topic")) {
            URLSpan uRLSpan = this.x;
            if (uRLSpan instanceof t61) {
                TLObject tLObject = ((t61) uRLSpan).c;
                if (tLObject instanceof TLRPC.TL_forumTopic) {
                    ng.d.m(this.f1.T0(), -this.f1.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("invite")) {
            URLSpan uRLSpan2 = this.x;
            if (uRLSpan2 instanceof t61) {
                TLObject tLObject2 = ((t61) uRLSpan2).c;
                if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                    this.f1.W0((TLRPC.TL_chatInviteExported) tLObject2);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("game")) {
            this.f1.X(this, this.P0.getReplyMsgId());
        } else if (url.startsWith("http")) {
            of.f.s(getContext(), url);
        } else {
            this.f1.E1(Long.parseLong(url));
        }
    }

    public final void U() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        MessageObject messageObject = this.P0;
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (messageObject != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !R()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.P0.messageOwner.action).slug;
        }
        if (this.f1 != null) {
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f(this, tL_premiumGiftOption, str, 9));
        }
    }

    public final void V() {
        TLRPC.Message message;
        MessageObject messageObject = this.P0;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        boolean z10 = messageAction instanceof TLRPC.TL_messageActionGiftStars;
        ai.da daVar = this.d0;
        if (z10) {
            Context context = getContext();
            TLRPC.Message message2 = this.P0.messageOwner;
            int i10 = message2.date;
            TLRPC.Peer peer = message2.from_id;
            TLRPC.Peer peer2 = message2.peer_id;
            TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
            org.telegram.ui.ActionBar.e6 e6Var = daVar.J;
            TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
            starsTransaction.title = null;
            starsTransaction.description = null;
            starsTransaction.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
            starsTransaction.peer = tL_starsTransactionPeer;
            tL_starsTransactionPeer.peer = peer;
            starsTransaction.date = i10;
            starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
            starsTransaction.id = tL_messageActionGiftStars.transaction_id;
            starsTransaction.gift = true;
            starsTransaction.sent_by = peer;
            starsTransaction.received_by = peer2;
            yh.p7.i1(context, false, 0L, this.H, starsTransaction, e6Var);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
            Context context2 = getContext();
            TLRPC.Message message3 = this.P0.messageOwner;
            int i11 = message3.date;
            TLRPC.Peer peer3 = message3.from_id;
            TLRPC.Peer peer4 = message3.peer_id;
            TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
            org.telegram.ui.ActionBar.e6 e6Var2 = daVar.J;
            TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
            starsTransaction2.title = null;
            starsTransaction2.description = null;
            starsTransaction2.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
            starsTransaction2.peer = tL_starsTransactionPeer2;
            tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
            starsTransaction2.date = i11;
            starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
            starsTransaction2.id = tL_messageActionPrizeStars.transaction_id;
            starsTransaction2.gift = true;
            starsTransaction2.flags |= 8192;
            starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
            starsTransaction2.sent_by = peer3;
            starsTransaction2.received_by = peer4;
            yh.p7.i1(context2, false, 0L, this.H, starsTransaction2, e6Var2);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
            Context context3 = getContext();
            TLRPC.Message message4 = this.P0.messageOwner;
            int i12 = message4.date;
            TLRPC.Peer peer5 = message4.from_id;
            TLRPC.Peer peer6 = message4.peer_id;
            TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
            org.telegram.ui.ActionBar.e6 e6Var3 = daVar.J;
            TL_stars.StarsTransaction starsTransaction3 = new TL_stars.StarsTransaction();
            starsTransaction3.title = null;
            starsTransaction3.description = null;
            starsTransaction3.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer3 = new TL_stars.TL_starsTransactionPeer();
            starsTransaction3.peer = tL_starsTransactionPeer3;
            tL_starsTransactionPeer3.peer = peer5;
            starsTransaction3.date = i12;
            TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
            starsTransaction3.amount = tL_starsTonAmount;
            tL_starsTonAmount.amount = tL_messageActionGiftTon.cryptoAmount;
            starsTransaction3.id = tL_messageActionGiftTon.transaction_id;
            starsTransaction3.gift = true;
            starsTransaction3.sent_by = peer5;
            starsTransaction3.received_by = peer6;
            yh.p7.i1(context3, false, 0L, this.H, starsTransaction3, e6Var3);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            if (((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                return;
            }
            yh.s3 s3Var = new yh.s3(getContext(), this.H, this.P0.getDialogId(), this.g1, null);
            s3Var.k2(this.P0, null);
            s3Var.show();
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
            if (!((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                yh.s3 s3Var2 = new yh.s3(getContext(), this.H, this.P0.getDialogId(), this.g1, null);
                s3Var2.k2(this.P0, null);
                s3Var2.show();
                return;
            } else {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                org.telegram.messenger.q.q(R.string.UniqueGiftNotFoundBurned, ad.a0(U), R.raw.fire_on, 36);
                return;
            }
        }
        if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
            TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    yh.s3 s3Var3 = new yh.s3(getContext(), this.H, this.P0.getDialogId(), this.g1, null);
                    s3Var3.j2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                    s3Var3.show();
                }
            }
        }
    }

    public final boolean W(float f7, float f10, tg tgVar) {
        if (M() && !this.P0.isOutOwner() && !this.P0.messageOwner.premiumEffectWasPlayed) {
            float y3 = getY() + getPaddingTop() + getWalletActionTop();
            if (y3 >= f7 && y3 + AndroidUtilities.dp(140.0f) <= f10) {
                org.telegram.ui.Wallet.d3 d3Var = this.I0;
                ck0 ck0Var = d3Var.l;
                if (d3Var.i0 && d3Var.j0 == null) {
                    d3Var.i0 = false;
                    d3Var.k0 = tgVar;
                    d3Var.K.d(0.0f, true);
                    d3Var.M = false;
                    d3Var.N = 0L;
                    d3Var.b();
                    d3Var.g();
                    d3Var.t = 18.0f;
                    d3Var.u.f();
                    ck0Var.T(0.0f, true);
                    ck0Var.start();
                    d3Var.H = true;
                    float f11 = d3Var.R;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    d3Var.j0 = ofFloat;
                    ofFloat.setDuration(2400L);
                    d3Var.j0.setInterpolator(hs.h);
                    d3Var.j0.addUpdateListener(new lg(d3Var, f11, 5));
                    d3Var.j0.addListener(new ep0(d3Var, 29));
                    d3Var.j0.start();
                    d3Var.a.invalidate();
                    this.P0.messageOwner.premiumEffectWasPlayed = true;
                    MessagesStorage.getInstance(this.H).updateMessageCustomParams(this.P0.getDialogId(), this.P0.messageOwner);
                    return true;
                }
            }
        }
        return false;
    }

    public final void X(int i10, boolean z10, boolean z11) {
        int i11 = this.Q0;
        if (i11 == i10 || i11 / 3600 == i10 / 3600) {
            return;
        }
        String string = z10 ? i10 == 2147483646 ? LocaleController.getString("MessageScheduledUntilOnline", R.string.MessageScheduledUntilOnline) : LocaleController.formatString("MessageScheduledOn", R.string.MessageScheduledOn, LocaleController.formatDateChat(i10)) : LocaleController.formatDateChat(i10);
        this.Q0 = i10;
        CharSequence charSequence = this.R0;
        if (charSequence == null || !TextUtils.equals(string, charSequence)) {
            this.R0 = string;
            this.m2 = null;
            b0(z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x09ea  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x08b3 A[EDGE_INSN: B:458:0x08b3->B:454:0x08b3 BREAK  A[LOOP:6: B:429:0x085f->B:456:0x08ae], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v11, types: [org.telegram.tgnet.TLRPC$messages_StickerSet] */
    /* JADX WARN: Type inference failed for: r3v95 */
    /* JADX WARN: Type inference failed for: r3v96 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(MessageObject messageObject, boolean z10) {
        StaticLayout staticLayout;
        TLRPC.TL_messageReactions tL_messageReactions;
        String str;
        String str2;
        TLRPC.Document document;
        TLRPC.Document document2;
        int i10;
        MessageObject messageObject2;
        int i11;
        TLRPC.Document document3;
        boolean z11;
        TLRPC.Document document4;
        TLRPC.Document document5;
        BotInlineKeyboard.Source source;
        boolean z12;
        TLRPC.PhotoSize photoSize;
        TLRPC.VideoSize videoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z13;
        float f7;
        TLRPC.WallPaper wallPaper;
        TLRPC.MessageAction messageAction;
        String str3;
        int i12;
        TLRPC.Message message;
        String name;
        String str4;
        ActivityManager activityManager;
        MessageObject messageObject3 = messageObject;
        if (messageObject3 == null) {
            return;
        }
        if (this.P0 != messageObject3 && this.M0 != 0.0f) {
            setWalletSlidingOffset(0.0f);
        }
        TLRPC.Message message2 = messageObject3.messageOwner;
        if ((message2 == null || !(message2.action instanceof TLRPC.TL_messageActionGramTransfer) || this.a2 == message2.send_state) && this.P0 == messageObject3 && (((staticLayout = this.M) == null || TextUtils.equals(staticLayout.getText(), messageObject3.messageText)) && !((!this.D0 && messageObject3.replyMessageObject != null) || z10 || messageObject3.type == 21 || messageObject3.forceUpdate))) {
            return;
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            FileLog.e(new IllegalStateException("Wrong thread!!!"));
        }
        this.X1.clear();
        this.Y1 = null;
        this.m2 = null;
        MessageObject messageObject4 = this.P0;
        int i13 = 1;
        boolean z14 = messageObject4 == null || messageObject4.stableId != messageObject3.stableId;
        if (messageObject4 != null) {
            messageObject3.playedGiftAnimation = messageObject4.playedGiftAnimation;
        }
        if (!z14 && messageObject4 != null && M()) {
            messageObject3.messageOwner.premiumEffectWasPlayed |= this.P0.messageOwner.premiumEffectWasPlayed;
        }
        this.P0 = messageObject3;
        if (M() && this.I0 == null) {
            org.telegram.ui.Wallet.d3 d3Var = new org.telegram.ui.Wallet.d3(this, this.g1);
            this.I0 = d3Var;
            d3Var.s0 = new p0(this, i13);
            d3Var.n(this.J0);
        }
        org.telegram.ui.Wallet.d3 d3Var2 = this.I0;
        if (d3Var2 != null) {
            boolean M = M();
            w0 w0Var = d3Var2.a;
            d3Var2.n = M;
            if (M && d3Var2.m == null && !d3Var2.o && com.google.android.gms.internal.vision.e2.t(w0Var) && SharedConfig.getDevicePerformanceClass() != 0 && (activityManager = (ActivityManager) w0Var.getContext().getSystemService("activity")) != null && activityManager.getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
                org.telegram.ui.Wallet.c3 c3Var = new org.telegram.ui.Wallet.c3(d3Var2, w0Var.getContext(), new org.telegram.ui.Wallet.z2(d3Var2, 1));
                d3Var2.m = c3Var;
                w0Var.addView(c3Var, new ViewGroup.LayoutParams(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f)));
            }
            org.telegram.ui.Wallet.c3 c3Var2 = d3Var2.m;
            if (c3Var2 != null) {
                c3Var2.setVisibility((!M || d3Var2.o) ? 8 : 0);
                d3Var2.m.setPaused(!M || d3Var2.o);
            }
            if (!M) {
                d3Var2.f();
                d3Var2.k();
            }
        }
        TLRPC.Message message3 = messageObject3.messageOwner;
        if (message3 != null && (message3.action instanceof TLRPC.TL_messageActionGramTransfer)) {
            MessagesController messagesController = MessagesController.getInstance(this.H);
            long peerDialogId = DialogObject.getPeerDialogId(messageObject3.messageOwner.peer_id);
            if (UserObject.isService(peerDialogId)) {
                name = LocaleController.getString(R.string.WalletUnknownUser);
            } else if (messageObject3.messageOwner.peer_id == null) {
                str4 = null;
                org.telegram.ui.Wallet.d3 d3Var3 = this.I0;
                boolean isOutOwner = messageObject3.isOutOwner();
                TLRPC.Message message4 = messageObject3.messageOwner;
                d3Var3.m(isOutOwner, (TLRPC.TL_messageActionGramTransfer) message4.action, str4, message4.send_state, z14, !message4.premiumEffectWasPlayed);
                this.a2 = messageObject3.messageOwner.send_state;
            } else {
                name = DialogObject.getName(messagesController.getUserOrChat(peerDialogId));
            }
            str4 = name;
            org.telegram.ui.Wallet.d3 d3Var32 = this.I0;
            boolean isOutOwner2 = messageObject3.isOutOwner();
            TLRPC.Message message42 = messageObject3.messageOwner;
            d3Var32.m(isOutOwner2, (TLRPC.TL_messageActionGramTransfer) message42.action, str4, message42.send_state, z14, !message42.premiumEffectWasPlayed);
            this.a2 = messageObject3.messageOwner.send_state;
        }
        messageObject3.forceUpdate = false;
        this.D0 = messageObject3.replyMessageObject != null;
        DownloadController.getInstance(this.H).removeLoadingFileObserver(this);
        this.V = 0;
        this.G = false;
        u0 u0Var = this.s1;
        if (u0Var != null && z14) {
            org.telegram.ui.Components.b6.release((w0) u0Var.i, (org.telegram.ui.Components.x5) u0Var.h);
            this.s1 = null;
            this.n1 = false;
        }
        if (z14 || messageObject3.reactionsChanged) {
            messageObject3.reactionsChanged = false;
            TLRPC.Message message5 = messageObject3.messageOwner;
            boolean z15 = (message5 == null || (tL_messageReactions = message5.reactions) == null || !tL_messageReactions.reactions_as_tags) ? false : true;
            if (messageObject3.shouldDrawReactions()) {
                this.E0.s(messageObject3, !messageObject3.shouldDrawReactionsInLayout(), z15, this.g1);
            } else {
                this.E0.s(null, false, false, this.g1);
            }
        }
        if (messageObject3.type == 32) {
            if (this.O0 == null) {
                iz0 iz0Var = new iz0(this.H, this, this.g1);
                this.O0 = iz0Var;
                if (this.d2) {
                    iz0Var.d.R(iz0Var.b);
                }
            }
            this.O0.c(messageObject3);
        } else {
            iz0 iz0Var2 = this.O0;
            if (iz0Var2 != null) {
                iz0Var2.d.R(null);
                this.O0 = null;
            }
        }
        if (this.H0 == null && (message = messageObject3.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            yh.u3 u3Var = new yh.u3(this.H, this, this.g1);
            this.H0 = u3Var;
            if (this.d2) {
                u3Var.a();
            }
        }
        yh.u3 u3Var2 = this.H0;
        if (u3Var2 != null) {
            u3Var2.f(messageObject3, !z14);
        }
        this.I.setAutoRepeatCount(0);
        this.I.clearDecorators();
        if (messageObject3.type != 22) {
            this.J = null;
        }
        if (messageObject3.actionDeleteGroupEventId != -1) {
            w7.z5.b(this, 0.02f, 1.2f);
            this.f2 = Math.max(AndroidUtilities.dp(250.0f), ci.d4.a(messageObject3.messageText, (TextPaint) I("paintChatActionText")));
            j11 S0 = vb.S0(messageObject3.messageText);
            if (S0 != null) {
                S0.h = this;
            }
        } else {
            setStateListAnimator(null);
            this.f2 = 0;
        }
        if (messageObject3.isStoryMention()) {
            TLRPC.User user = MessagesController.getInstance(this.H).getUser(Long.valueOf(messageObject3.messageOwner.media.user_id));
            this.L.m(this.H, user);
            TL_stories.StoryItem storyItem = messageObject3.messageOwner.media.storyItem;
            if (storyItem == null || !storyItem.noforwards) {
                ai.ja.x(this.I, storyItem);
            } else {
                this.I.setForUserOrChat(user, this.L, null, true, 0, true);
            }
            this.I.setRoundRadius((int) (this.h1 / 2.0f));
        } else {
            int i14 = messageObject3.type;
            if (i14 == 22) {
                if (messageObject3.strippedThumb == null) {
                    int size = messageObject3.photoThumbs.size();
                    for (int i15 = 0; i15 < size && !(messageObject3.photoThumbs.get(i15) instanceof TLRPC.TL_photoStrippedSize); i15++) {
                    }
                }
                TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject3.currentEvent;
                if (tL_channelAdminLogEvent != null) {
                    TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                    if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                        wallPaper = ((TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction).new_value;
                        if (TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
                            org.telegram.ui.ActionBar.e6 e6Var = this.g1;
                            boolean a2 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.i6.I.q();
                            this.I.clearImage();
                            int i16 = this.H;
                            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(wallPaper);
                            int i17 = ci.b7.B0;
                            org.telegram.ui.ActionBar.c4 theme = ChatThemeController.getInstance(i16).getTheme(fg.b.d(wallpaperEmoticon));
                            Drawable s02 = theme == null ? org.telegram.ui.ActionBar.i6.s0() : ci.b7.g(i16, theme, a2);
                            this.J = s02;
                            if (s02 != null) {
                                s02.setCallback(this);
                            }
                        } else if (wallPaper != null && (str3 = wallPaper.uploadingImage) != null) {
                            this.I.setImage(ImageLocation.getForPath(str3), "150_150_wallpaper" + wallPaper.id + co.e(wallPaper.settings), null, null, co.b(wallPaper), 0L, null, wallPaper, 1);
                            this.J = null;
                        } else if (wallPaper != null) {
                            TLObject tLObject = messageObject3.photoThumbsObject;
                            TLRPC.Document document6 = tLObject instanceof TLRPC.Document ? (TLRPC.Document) tLObject : wallPaper.document;
                            this.I.setImage(ImageLocation.getForDocument(document6), "150_150_wallpaper" + wallPaper.id + co.e(wallPaper.settings), null, null, co.b(wallPaper), 0L, null, wallPaper, 1);
                            this.J = null;
                        } else {
                            this.J = null;
                        }
                        this.I.setRoundRadius((int) (this.h1 / 2.0f));
                        if (J(messageObject) != 1.0f) {
                            boolean z16 = !z14;
                            this.J1.o(1.0f, z16);
                            this.J1.setIcon(4, z16, z16);
                        } else {
                            boolean z17 = !z14;
                            this.J1.setIcon(3, z17, z17);
                        }
                    }
                }
                TLRPC.Message message6 = messageObject3.messageOwner;
                wallPaper = (message6 == null || (messageAction = message6.action) == null) ? null : messageAction.wallpaper;
                if (TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
                }
                this.I.setRoundRadius((int) (this.h1 / 2.0f));
                if (J(messageObject) != 1.0f) {
                }
            } else if (i14 == 21) {
                this.I.setRoundRadius((int) (this.h1 / 2.0f));
                this.I.setAllowStartLottieAnimation(true);
                this.I.setDelegate(null);
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) messageObject3.messageOwner.action;
                TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(tL_messageActionSuggestProfilePhoto.photo.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                ArrayList<TLRPC.VideoSize> arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes;
                ImageLocation forPhoto = (arrayList == null || arrayList.isEmpty()) ? null : ImageLocation.getForPhoto(closestVideoSizeWithSize, tL_messageActionSuggestProfilePhoto.photo);
                TLRPC.Photo photo = messageObject3.messageOwner.action.photo;
                if (messageObject3.strippedThumb == null) {
                    int size2 = messageObject3.photoThumbs.size();
                    for (int i18 = 0; i18 < size2; i18++) {
                        photoSize2 = messageObject3.photoThumbs.get(i18);
                        if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                            break;
                        }
                    }
                }
                photoSize2 = null;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject3.photoThumbs, MediaDataController.MAX_STYLE_RUNS_COUNT);
                if (closestPhotoSizeWithSize == null) {
                    z13 = false;
                    f7 = 1.0f;
                } else if (closestVideoSizeWithSize != null) {
                    z13 = false;
                    f7 = 1.0f;
                    this.I.setImage(forPhoto, ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "150_150", ImageLocation.getForObject(photoSize2, messageObject3.photoThumbsObject), "50_50_b", messageObject3.strippedThumb, 0L, null, messageObject, 0);
                    messageObject3 = messageObject;
                } else {
                    z13 = false;
                    f7 = 1.0f;
                    this.I.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "150_150", ImageLocation.getForObject(photoSize2, messageObject3.photoThumbsObject), "50_50_b", messageObject3.strippedThumb, 0L, null, messageObject3, 0);
                }
                this.I.setAllowStartLottieAnimation(z13);
                m50 m50Var = MessagesController.getInstance(this.H).photoSuggestion.get(messageObject3.messageOwner.local_id);
                if (m50Var == null || m50Var.W == f7) {
                    boolean z18 = !z14;
                    this.J1.o(f7, z18);
                    this.J1.setIcon(4, z18, z18);
                } else {
                    boolean z19 = !z14;
                    this.J1.setIcon(3, z19, z19);
                }
            } else {
                int i19 = 0;
                if (i14 == 31 || i14 == 33 || i14 == 30 || i14 == 18 || i14 == 25 || i14 == 35) {
                    this.I.setRoundRadius(0);
                    TLRPC.MessageAction messageAction2 = messageObject3.messageOwner.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                        TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                        this.Z1 = tL_messageActionNoForwardsRequest.expired || ((long) messageObject3.messageOwner.date) + MessagesController.getInstance(this.H).config.noForwardsRequestExpirePeriod.get(TimeUnit.SECONDS) < ((long) ConnectionsManager.getInstance(this.H).getCurrentTime());
                        if (!messageObject3.isOut() && !tL_messageActionNoForwardsRequest.expired && !this.Z1) {
                            BotInlineKeyboard.Builder builder = new BotInlineKeyboard.Builder();
                            builder.addSharingOfferKeyboard();
                            this.Y1 = builder.build();
                        }
                        document = null;
                    } else if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                        TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction2;
                        TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                        if (starGift != null) {
                            document5 = zf.d.e(starGift);
                            if (this.S0 == null) {
                                this.S0 = new xh.g1(this, this.g1, false);
                            }
                            this.S0.d((TL_stars.starGiftAttributeBackdrop) yh.m5.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                            this.S0.e((TL_stars.starGiftAttributePattern) yh.m5.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                        } else {
                            document5 = null;
                        }
                        this.Z1 = tL_messageActionStarGiftPurchaseOffer.expires_at < ConnectionsManager.getInstance(this.H).getCurrentTime();
                        if (!messageObject3.isOut() && !tL_messageActionStarGiftPurchaseOffer.accepted && !tL_messageActionStarGiftPurchaseOffer.declined && !this.Z1) {
                            BotInlineKeyboard.Builder builder2 = new BotInlineKeyboard.Builder();
                            builder2.addGiftOfferKeyboard();
                            this.Y1 = builder2.build();
                        }
                        document = document5;
                    } else if (messageAction2 instanceof TLRPC.TL_messageActionSetChatTheme) {
                        TL_stars.StarGift starGift2 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) messageAction2).theme).gift;
                        if (starGift2 != null) {
                            document4 = zf.d.e(starGift2);
                            if (this.S0 == null) {
                                this.S0 = new xh.g1(this, this.g1, false);
                            }
                            this.S0.d((TL_stars.starGiftAttributeBackdrop) yh.m5.l(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class));
                            this.S0.e((TL_stars.starGiftAttributePattern) yh.m5.l(starGift2.attributes, TL_stars.starGiftAttributePattern.class));
                        } else {
                            document4 = null;
                        }
                        document = document4;
                    } else if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        TL_stars.StarGift starGift3 = ((TLRPC.TL_messageActionStarGift) messageAction2).gift;
                        if (starGift3 != null) {
                            document = starGift3.sticker;
                            messageObject2 = messageObject3;
                            str2 = null;
                            z11 = false;
                            source = this.Y1;
                            if (source != null) {
                                int rowsCount = source.getRowsCount();
                                for (int i20 = 0; i20 < rowsCount; i20++) {
                                    int columnsCount = this.Y1.getColumnsCount(i20);
                                    int i21 = 0;
                                    while (i21 < columnsCount) {
                                        BotInlineKeyboard.Button button = this.Y1.getButton(i20, i21);
                                        e0 e0Var = new e0(new p0(this, 2));
                                        e0Var.j = (BotInlineKeyboard.ButtonCustom) button;
                                        int iconRes = button.getIconRes();
                                        if (iconRes != 0) {
                                            Drawable drawable = getResources().getDrawable(iconRes);
                                            e0Var.t = drawable;
                                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                        }
                                        e0Var.f = AndroidUtilities.dp(40.0f);
                                        int i22 = e0Var.g | 8;
                                        e0Var.g = i22;
                                        int b10 = w7.g0.b(i22, 1, i21 == 0);
                                        e0Var.g = b10;
                                        e0Var.g = w7.g0.b(b10, 2, i21 == 1);
                                        e0Var.h = new l11(button.getText(), (TextPaint) I("paintChatBotButton"));
                                        this.X1.add(e0Var);
                                        i21++;
                                    }
                                }
                            }
                            this.L1 = messageObject3.wasUnread;
                            this.H1 = document;
                            if (document == null) {
                                this.I.setAllowStartLottieAnimation(true);
                                int i23 = messageObject3.type;
                                if (i23 != 31 && i23 != 37 && i23 != 33) {
                                    this.I.setDelegate(this.N1);
                                }
                                this.I1 = null;
                                int i24 = 0;
                                while (true) {
                                    if (i24 >= document.video_thumbs.size()) {
                                        break;
                                    }
                                    if ("f".equals(document.video_thumbs.get(i24).type)) {
                                        this.I1 = document.video_thumbs.get(i24);
                                        break;
                                    }
                                    i24++;
                                }
                                if (z14 || messageObject3.type != 18) {
                                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.i6.a7, 0.3f);
                                    this.I.setAutoRepeat(0);
                                    ImageReceiver imageReceiver = this.I;
                                    ImageLocation forDocument = ImageLocation.getForDocument(document);
                                    Locale locale = Locale.US;
                                    imageReceiver.setImage(forDocument, hg.c.h(messageObject3.stableId, "160_160_nr_messageId="), svgThumb, "tgs", messageObject2, 1);
                                }
                            } else if (str2 != null) {
                                MediaDataController.getInstance(this.H).loadStickersByEmojiOrName(str2, false, !z11);
                            }
                        }
                        document = null;
                        messageObject2 = messageObject3;
                        str2 = null;
                        z11 = false;
                        source = this.Y1;
                        if (source != null) {
                        }
                        this.L1 = messageObject3.wasUnread;
                        this.H1 = document;
                        if (document == null) {
                        }
                    } else {
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                            if (tL_messageActionStarGiftUnique.refunded) {
                                TL_stars.StarGift starGift4 = tL_messageActionStarGiftUnique.gift;
                                if (starGift4 != null) {
                                    document = starGift4.getDocument();
                                    messageObject2 = messageObject3;
                                    str2 = null;
                                    z11 = false;
                                    source = this.Y1;
                                    if (source != null) {
                                    }
                                    this.L1 = messageObject3.wasUnread;
                                    this.H1 = document;
                                    if (document == null) {
                                    }
                                }
                                document = null;
                                messageObject2 = messageObject3;
                                str2 = null;
                                z11 = false;
                                source = this.Y1;
                                if (source != null) {
                                }
                                this.L1 = messageObject3.wasUnread;
                                this.H1 = document;
                                if (document == null) {
                                }
                            }
                        }
                        if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                            str = UserConfig.getInstance(this.H).premiumTonStickerPack;
                            if (str == null) {
                                MediaDataController.getInstance(this.H).checkTonGiftStickers();
                                return;
                            }
                        } else {
                            str = UserConfig.getInstance(this.H).premiumGiftsStickerPack;
                            if (str == null) {
                                MediaDataController.getInstance(this.H).checkPremiumGiftStickers();
                                return;
                            }
                        }
                        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.H).getStickerSetByName(str);
                        ?? r32 = stickerSetByName;
                        if (stickerSetByName == null) {
                            r32 = MediaDataController.getInstance(this.H).getStickerSetByEmojiOrName(str);
                        }
                        if (r32 != 0) {
                            TLRPC.MessageAction messageAction3 = messageObject3.messageOwner.action;
                            int i25 = messageAction3.months;
                            if (messageObject3.type == 30) {
                                String str5 = "3⃣";
                                if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                    long j3 = messageAction3.cryptoAmount;
                                    if (j3 > 10000000000L) {
                                        if (j3 <= 50000000000L) {
                                            str5 = "1⃣";
                                        }
                                        i11 = 0;
                                        while (true) {
                                            if (i11 < r32.packs.size()) {
                                                break;
                                            }
                                            TLRPC.TL_stickerPack tL_stickerPack = r32.packs.get(i11);
                                            if (TextUtils.equals(tL_stickerPack.emoticon, str5) && !tL_stickerPack.documents.isEmpty()) {
                                                long longValue = tL_stickerPack.documents.get(0).longValue();
                                                int i26 = 0;
                                                while (i26 < r32.documents.size()) {
                                                    document3 = r32.documents.get(i26);
                                                    long j10 = longValue;
                                                    if (document3 != null && document3.id == j10) {
                                                        break;
                                                    }
                                                    i26++;
                                                    longValue = j10;
                                                }
                                            } else {
                                                i11++;
                                            }
                                        }
                                        document3 = null;
                                        document2 = document3;
                                    }
                                    str5 = "2⃣";
                                    i11 = 0;
                                    while (true) {
                                        if (i11 < r32.packs.size()) {
                                        }
                                        i11++;
                                    }
                                    document3 = null;
                                    document2 = document3;
                                } else {
                                    long j11 = messageAction3 instanceof TLRPC.TL_messageActionGiftStars ? ((TLRPC.TL_messageActionGiftStars) messageAction3).stars : ((TLRPC.TL_messageActionPrizeStars) messageAction3).stars;
                                    if (j11 > 1000) {
                                        if (j11 >= 2500) {
                                            str5 = "4⃣";
                                        }
                                        i11 = 0;
                                        while (true) {
                                            if (i11 < r32.packs.size()) {
                                            }
                                            i11++;
                                        }
                                        document3 = null;
                                        document2 = document3;
                                    }
                                    str5 = "2⃣";
                                    i11 = 0;
                                    while (true) {
                                        if (i11 < r32.packs.size()) {
                                        }
                                        i11++;
                                    }
                                    document3 = null;
                                    document2 = document3;
                                }
                                source = this.Y1;
                                if (source != null) {
                                }
                                this.L1 = messageObject3.wasUnread;
                                this.H1 = document;
                                if (document == null) {
                                }
                            } else {
                                String str6 = (String) s2.get(Integer.valueOf(i25));
                                ArrayList<TLRPC.TL_stickerPack> arrayList2 = r32.packs;
                                int size3 = arrayList2.size();
                                int i27 = 0;
                                document2 = null;
                                while (i27 < size3) {
                                    TLRPC.TL_stickerPack tL_stickerPack2 = arrayList2.get(i27);
                                    i27++;
                                    TLRPC.TL_stickerPack tL_stickerPack3 = tL_stickerPack2;
                                    if (Objects.equals(tL_stickerPack3.emoticon, str6)) {
                                        ArrayList<Long> arrayList3 = tL_stickerPack3.documents;
                                        int size4 = arrayList3.size();
                                        TLRPC.Document document7 = document2;
                                        int i28 = i19;
                                        while (i28 < size4) {
                                            Long l4 = arrayList3.get(i28);
                                            i28++;
                                            long longValue2 = l4.longValue();
                                            ArrayList<TLRPC.Document> arrayList4 = r32.documents;
                                            int size5 = arrayList4.size();
                                            int i29 = i19;
                                            while (true) {
                                                if (i29 >= size5) {
                                                    i10 = size4;
                                                    break;
                                                }
                                                TLRPC.Document document8 = arrayList4.get(i29);
                                                i29++;
                                                TLRPC.Document document9 = document8;
                                                i10 = size4;
                                                if (document9.id == longValue2) {
                                                    document7 = document9;
                                                    break;
                                                }
                                                size4 = i10;
                                            }
                                            if (document7 != null) {
                                                break;
                                            }
                                            size4 = i10;
                                            i19 = 0;
                                        }
                                        document2 = document7;
                                    }
                                    if (document2 != null) {
                                        break;
                                    } else {
                                        i19 = 0;
                                    }
                                }
                            }
                            if (document2 != null || r32.documents.isEmpty()) {
                                str2 = str;
                                messageObject2 = r32;
                                document = document2;
                                z11 = r32;
                            } else {
                                str2 = str;
                                document = r32.documents.get(0);
                                messageObject2 = r32;
                                z11 = r32;
                            }
                            source = this.Y1;
                            if (source != null) {
                            }
                            this.L1 = messageObject3.wasUnread;
                            this.H1 = document;
                            if (document == null) {
                            }
                        } else {
                            str2 = str;
                            document = null;
                            z12 = r32;
                            messageObject2 = null;
                            z11 = z12;
                            source = this.Y1;
                            if (source != null) {
                            }
                            this.L1 = messageObject3.wasUnread;
                            this.H1 = document;
                            if (document == null) {
                            }
                        }
                    }
                    str2 = null;
                    z12 = false;
                    messageObject2 = null;
                    z11 = z12;
                    source = this.Y1;
                    if (source != null) {
                    }
                    this.L1 = messageObject3.wasUnread;
                    this.H1 = document;
                    if (document == null) {
                    }
                } else if (i14 == 37) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.H).getChat(Long.valueOf(((TLRPC.TL_messageActionChangeCommunity) messageObject3.messageOwner.action).community_id));
                    this.I.setAllowStartLottieAnimation(true);
                    this.I.setDelegate(null);
                    this.I.setRoundRadius(AndroidUtilities.dp(14.0f));
                    this.I.setAutoRepeatCount(1);
                    this.L.q(chat);
                    this.I.setForUserOrChat(chat, new gr(getContext(), AndroidUtilities.dp(14.0f)), chat);
                } else if (i14 == 11) {
                    this.I.setAllowStartLottieAnimation(true);
                    this.I.setDelegate(null);
                    this.I.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
                    this.I.setAutoRepeatCount(1);
                    this.L.n(messageObject3.getDialogId(), null, null);
                    if (messageObject3.messageOwner.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                        this.I.setImage(null, null, this.L, null, messageObject3, 0);
                    } else {
                        if (messageObject3.strippedThumb == null) {
                            int size6 = messageObject3.photoThumbs.size();
                            for (int i30 = 0; i30 < size6; i30++) {
                                photoSize = messageObject3.photoThumbs.get(i30);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    break;
                                }
                            }
                        }
                        photoSize = null;
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject3.photoThumbs, 640);
                        if (closestPhotoSizeWithSize2 != null) {
                            TLRPC.Photo photo2 = messageObject3.messageOwner.action.photo;
                            if (!photo2.video_sizes.isEmpty() && SharedConfig.isAutoplayGifs()) {
                                videoSize = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                if (!messageObject3.mediaExists && !DownloadController.getInstance(this.H).canDownloadMedia(4, videoSize.size)) {
                                    this.x0 = ImageLocation.getForPhoto(videoSize, photo2);
                                    DownloadController.getInstance(this.H).addLoadingFileObserver(FileLoader.getAttachFileName(videoSize), messageObject3, this);
                                }
                                if (videoSize == null) {
                                    this.I.setImage(ImageLocation.getForPhoto(videoSize, photo2), ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForObject(photoSize, messageObject3.photoThumbsObject), "50_50_b", messageObject3.strippedThumb, 0L, null, messageObject3, 1);
                                } else {
                                    this.I.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject3.photoThumbsObject), "150_150", ImageLocation.getForObject(photoSize, messageObject3.photoThumbsObject), "50_50_b", messageObject3.strippedThumb, 0L, null, messageObject3, 1);
                                }
                            }
                            videoSize = null;
                            if (videoSize == null) {
                            }
                        } else {
                            this.I.setImageBitmap(this.L);
                        }
                    }
                    this.I.setVisible(!PhotoViewer.N1(messageObject3), false);
                } else {
                    this.I.setAllowStartLottieAnimation(true);
                    this.I.setDelegate(null);
                    this.I.setImageBitmap((Bitmap) null);
                }
            }
        }
        if (this.k0 && this.e0 && this.i0 && (this.f0 || this.g0 || this.h0)) {
            this.l0 = AndroidUtilities.dp(33.0f);
            if (this.n0 == null) {
                g31 g31Var = new g31(this.H, this, this.g1, true);
                this.n0 = g31Var;
                g31Var.r = new p0(this, 3);
            }
            if (this.n0.e(this.P0)) {
                if (this.d2) {
                    this.n0.a();
                }
                i12 = 0;
            } else {
                this.n0.b();
                this.n0 = null;
                i12 = 0;
                this.l0 = 0;
            }
        } else {
            g31 g31Var2 = this.n0;
            if (g31Var2 != null) {
                g31Var2.b();
                this.n0 = null;
            }
            i12 = 0;
            this.l0 = 0;
        }
        int paddingTop = getPaddingTop();
        int i31 = this.l0;
        if (paddingTop != i31) {
            setPadding(i12, i31, i12, i12);
        }
        this.T1.setVisibility((!O(messageObject) || L()) ? 8 : i12);
        ng.d.b(messageObject3);
        requestLayout();
    }

    public final void Z(int i10, int i11) {
        this.T0 = i10;
        this.U0 = i11;
    }

    @Override // org.telegram.ui.Cells.o4
    public final /* synthetic */ boolean a() {
        return false;
    }

    public final void a0(float f7, int i10) {
        this.w0 = true;
        this.v0 = i10;
        this.t0 = f7;
        this.u0 = 0.0f;
    }

    public final void b0(boolean z10) {
        if (getMeasuredWidth() != 0) {
            y(getMeasuredWidth(), this.R0);
            invalidate();
        }
        if (this.C0) {
            s();
        } else if (z10) {
            AndroidUtilities.runOnUIThread(new p0(this, 5));
        } else {
            requestLayout();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessageObject messageObject;
        if (i10 == NotificationCenter.startSpoilers) {
            setSpoilersSuppressed(false);
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
            return;
        }
        if (i10 == NotificationCenter.stopSpoilers) {
            setSpoilersSuppressed(true);
            return;
        }
        if (i10 == NotificationCenter.didUpdatePremiumGiftStickers || i10 == NotificationCenter.starGiftsLoaded || i10 == NotificationCenter.didUpdateTonGiftStickers) {
            MessageObject messageObject2 = this.P0;
            if (messageObject2 != null) {
                Y(messageObject2, true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.diceStickersDidLoad) {
            if (!Objects.equals(objArr[0], UserConfig.getInstance(this.H).premiumGiftsStickerPack) || (messageObject = this.P0) == null) {
                return;
            }
            Y(messageObject, true);
            return;
        }
        if (i10 == NotificationCenter.walletUpdate && M()) {
            this.m2 = null;
            this.V = 0;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.T1) {
            return super.drawChild(canvas, view, j3);
        }
        float a2 = this.n.a(0.02f);
        canvas.save();
        canvas.scale(a2, a2, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Cells.o4
    public final void f(TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        t0 t0Var = this.f1;
        if (t0Var != null) {
            t0Var.z2(this, reactionCount, z10, f7, f10);
        }
    }

    public /* bridge */ /* synthetic */ ImageReceiver getAvatarImage() {
        return null;
    }

    @Override // org.telegram.ui.Cells.a0
    public int getBoundsLeft() {
        if (L()) {
            int width = ((int) (getWidth() - (this.H0.Q.e + AndroidUtilities.dp(8.0f)))) / 2;
            return this.H0.p ? width : Math.min(this.a1, width);
        }
        if (O(this.P0)) {
            return hg.c.z(getWidth(), this.i1, 2, this.j0 / 2);
        }
        int i10 = this.a1;
        ImageReceiver imageReceiver = this.I;
        if (imageReceiver != null && imageReceiver.getVisible()) {
            i10 = Math.min((int) imageReceiver.getImageX(), i10);
        }
        return (this.j0 / 2) + i10;
    }

    @Override // org.telegram.ui.Cells.a0
    public int getBoundsRight() {
        int i10;
        int i11;
        if (L()) {
            int dp = ((int) ((this.H0.Q.e + AndroidUtilities.dp(8.0f)) + getWidth())) / 2;
            return this.H0.p ? dp : Math.max(this.b1, dp);
        }
        if (O(this.P0)) {
            i10 = this.j0 / 2;
            i11 = (getWidth() + this.i1) / 2;
        } else {
            i10 = this.b1;
            ImageReceiver imageReceiver = this.I;
            if (imageReceiver != null && imageReceiver.getVisible()) {
                i10 = Math.max((int) imageReceiver.getImageX2(), i10);
            }
            i11 = this.j0 / 2;
        }
        return i11 + i10;
    }

    @Override // org.telegram.ui.Cells.o4
    public /* bridge */ /* synthetic */ float getCheckBoxTranslation() {
        return 0.0f;
    }

    public /* bridge */ /* synthetic */ MessageObject.GroupedMessagePosition getCurrentPosition() {
        return null;
    }

    public int getCustomDate() {
        return this.Q0;
    }

    public t0 getDelegate() {
        return this.f1;
    }

    @Override // org.telegram.ui.Cells.o4
    public float getDeltaBottom() {
        return 0.0f;
    }

    public float getDeltaLeft() {
        return 0.0f;
    }

    public float getDeltaRight() {
        return 0.0f;
    }

    public float getDeltaTop() {
        return 0.0f;
    }

    public int getLayoutHeight() {
        return getMeasuredHeight();
    }

    @Override // org.telegram.ui.Cells.o4
    public MessageObject getMessageObject() {
        return this.P0;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.w;
    }

    public ImageReceiver getPhotoImage() {
        return this.I;
    }

    public zg.o0 getReactionsLayout() {
        return this.E0;
    }

    @Override // org.telegram.ui.Cells.o4
    public /* bridge */ /* synthetic */ float getSlidingOffsetX() {
        return 0.0f;
    }

    public v0 getTransitionParams() {
        return this.r2;
    }

    public float getWalletSlidingOffset() {
        return this.M0;
    }

    @Override // org.telegram.ui.Cells.o4
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Cells.o4
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // org.telegram.ui.Cells.a0, android.view.View
    public final void invalidate() {
        super.invalidate();
        View view = this.v;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.o2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.n2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.o4
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Cells.a0
    public final boolean m() {
        t0 t0Var = this.f1;
        if (t0Var != null) {
            return t0Var.x2(this, this.y0, this.z0);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        t0 t0Var;
        super.onAttachedToWindow();
        this.d2 = true;
        this.I.onAttachedToWindow();
        setStarsPaused(false);
        this.r0 = org.telegram.ui.Components.b6.update(0, this, (!this.s || (t0Var = this.f1) == null || t0Var.f()) ? false : true, this.r0, this.M);
        u0 u0Var = this.s1;
        if (u0Var != null) {
            u0Var.h = org.telegram.ui.Components.b6.update(0, (View) u0Var.i, false, (org.telegram.ui.Components.x5) u0Var.h, (StaticLayout) u0Var.f);
        }
        int i10 = this.H;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.walletUpdate);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        MessageObject messageObject = this.P0;
        if (messageObject != null && messageObject.type == 21) {
            Y(messageObject, true);
        }
        yh.u3 u3Var = this.H0;
        if (u3Var != null) {
            u3Var.a();
        }
        zg.o0 o0Var = this.E0;
        ArrayList arrayList = o0Var.v;
        o0Var.G = true;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((zg.l0) arrayList.get(i11)).a();
        }
        g31 g31Var = this.n0;
        if (g31Var != null) {
            g31Var.a();
        }
        iz0 iz0Var = this.O0;
        if (iz0Var != null) {
            iz0Var.d.R(iz0Var.b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d2 = false;
        int i10 = this.H;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        this.I.onDetachedFromWindow();
        setStarsPaused(true);
        this.C0 = false;
        org.telegram.ui.Components.b6.release(this, this.r0);
        u0 u0Var = this.s1;
        if (u0Var != null) {
            org.telegram.ui.Components.b6.release((w0) u0Var.i, (org.telegram.ui.Components.x5) u0Var.h);
        }
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.walletUpdate);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.d0.g();
        this.r2.a = false;
        yh.u3 u3Var = this.H0;
        if (u3Var != null) {
            u3Var.P = false;
            u3Var.d.onDetachedFromWindow();
            u3Var.e.b();
            xh.m0 m0Var = u3Var.y;
            m0Var.d.onDetachedFromWindow();
            org.telegram.ui.Components.b6.release((View) null, m0Var.q);
            m0Var.q = null;
        }
        this.E0.q();
        g31 g31Var = this.n0;
        if (g31Var != null) {
            g31Var.b();
        }
        iz0 iz0Var = this.O0;
        if (iz0Var != null) {
            iz0Var.d.R(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x0c73  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0c7a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0c8b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0c98  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0cdc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0dda  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0e05  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0e52  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0e9a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0f1a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0f4e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0f89  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0ff2  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0fb8  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0fc4  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0fc8  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0fbc  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0f8e  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0f64  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0eed  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0dea  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0cac  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x058c A[LOOP:1: B:87:0x058a->B:88:0x058c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0569  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        char c10;
        int i10;
        int i11;
        TextPaint textPaint;
        ArrayList arrayList;
        int i12;
        RadialProgress2 radialProgress2;
        w0 w0Var;
        char c11;
        float f7;
        float dp;
        int i13;
        Canvas canvas2;
        float f10;
        w0 w0Var2;
        float f11;
        float f12;
        float f13;
        l11 l11Var;
        u0 u0Var;
        StaticLayout staticLayout;
        org.telegram.ui.ActionBar.e6 e6Var;
        boolean z10;
        float f14;
        float clamp;
        Paint I;
        boolean a2;
        ColorMatrix colorMatrix;
        int i14;
        int i15;
        l11 l11Var2;
        t0 t0Var;
        int size;
        int i16;
        TextPaint textPaint2;
        Canvas canvas3 = canvas;
        canvas3.save();
        canvas3.translate(this.j0 / 2.0f, getPaddingTop());
        MessageObject messageObject = this.P0;
        float e7 = this.q1.e(!this.o1);
        int i17 = this.h1;
        boolean L = L();
        ai.da daVar = this.d0;
        TextPaint textPaint3 = this.F1;
        ImageReceiver imageReceiver = this.I;
        if (!L && this.O0 == null && O(messageObject)) {
            this.h1 = this.i1 - AndroidUtilities.dp(106.0f);
            if (Q()) {
                i17 = H(messageObject);
                float f15 = (this.V - i17) / 2.0f;
                float dp2 = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(4.0f) + this.S + this.O;
                if (messageObject.isStoryMention()) {
                    daVar.d = messageObject.messageOwner.media.storyItem;
                }
                float f16 = i17;
                daVar.F.set(f15, dp2, f15 + f16, f16 + dp2);
                int i18 = messageObject.type;
                if (i18 == 31 || i18 == 33 || i18 == 34 || i18 == 35) {
                    f15 += AndroidUtilities.dp(10.0f);
                    dp2 += AndroidUtilities.dp(10.0f);
                    i17 -= AndroidUtilities.dp(20.0f);
                }
                if (messageObject.type == 37) {
                    f15 += AndroidUtilities.dp(2.0f);
                }
                imageReceiver.setImageCoords(f15, dp2, Math.max(0, i17), Math.max(0, i17));
                int i19 = messageObject.type;
                if (i19 == 31 || i19 == 33 || i19 == 34 || i19 == 35) {
                    i17 = AndroidUtilities.dp(20.0f) + i17;
                }
            } else {
                int i20 = messageObject.type;
                if (i20 == 11) {
                    int i21 = this.V;
                    float f17 = this.h1;
                    imageReceiver.setImageCoords((i21 - r3) / 2.0f, (this.i1 * 0.075f) + this.S + this.O, f17, f17);
                } else {
                    if (i20 == 25) {
                        i17 = (int) (this.h1 * (AndroidUtilities.isTablet() ? 1.0f : 1.2f));
                        float f18 = i17;
                        imageReceiver.setImageCoords((this.V - i17) / 2.0f, ((this.i1 * 0.075f) + (this.S + this.O)) - AndroidUtilities.dp(22.0f), f18, f18);
                    } else if (messageObject.isStarGiftAction()) {
                        float f19 = i17;
                        imageReceiver.setImageCoords((this.V - i17) / 2.0f, (this.i1 * 0.075f) + this.S + this.O + AndroidUtilities.dp(2.0f), f19, f19);
                    } else if (messageObject.type == 30) {
                        i17 = (int) (this.h1 * 1.1f);
                        TLRPC.Message message = messageObject.messageOwner;
                        if (message == null || (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                            float f20 = i17;
                            imageReceiver.setImageCoords((this.V - i17) / 2.0f, ((this.i1 * 0.075f) + (this.S + this.O)) - AndroidUtilities.dp(12.0f), f20, f20);
                        } else {
                            float f21 = i17;
                            imageReceiver.setImageCoords((this.V - i17) / 2.0f, ((this.i1 * 0.075f) + (this.S + this.O)) - AndroidUtilities.dp(22.0f), f21, f21);
                        }
                    } else {
                        i17 = (int) (this.h1 * 1.0f);
                        float f22 = i17;
                        imageReceiver.setImageCoords((this.V - i17) / 2.0f, ((this.i1 * 0.075f) + (this.S + this.O)) - AndroidUtilities.dp(4.0f), f22, f22);
                    }
                    textPaint2 = (TextPaint) I("paintChatActionText");
                    this.s0 = textPaint2;
                    if (textPaint2 != null) {
                        TextPaint textPaint4 = this.E1;
                        if (textPaint4 != null && textPaint4.getColor() != this.s0.getColor()) {
                            textPaint4.setColor(this.s0.getColor());
                        }
                        TextPaint textPaint5 = this.G1;
                        if (textPaint5 != null && textPaint5.getColor() != this.s0.getColor()) {
                            textPaint5.setColor(this.s0.getColor());
                            textPaint5.linkColor = this.s0.getColor();
                        }
                        if (textPaint3 != null && textPaint3.getColor() != this.s0.getColor()) {
                            textPaint3.setColor(this.s0.getColor());
                            textPaint3.linkColor = this.s0.getColor();
                        }
                    }
                }
            }
            textPaint2 = (TextPaint) I("paintChatActionText");
            this.s0 = textPaint2;
            if (textPaint2 != null) {
            }
        }
        int i22 = i17;
        B(canvas3, false);
        if (M()) {
            canvas3.save();
            int width = getWidth();
            this.I0.getClass();
            float h = (width - org.telegram.ui.Wallet.d3.h()) / 2.0f;
            this.K0 = h;
            float walletActionTop = getWalletActionTop();
            this.L0 = walletActionTop;
            canvas3.translate(h, walletActionTop);
            this.I0.o((this.j0 / 2.0f) + this.K0, this.L0 + getPaddingTop());
            this.I0.d(canvas3);
            canvas3.restore();
        }
        boolean L2 = L();
        RadialProgress2 radialProgress22 = this.J1;
        if (L2) {
            canvas3.save();
            float width2 = (getWidth() - this.H0.d()) / 2.0f;
            this.F0 = width2;
            float dp3 = this.H0.p ? AndroidUtilities.dp(4.0f) : AndroidUtilities.dp(16.0f) + this.S + this.O;
            this.G0 = dp3;
            canvas3.translate(width2, dp3);
            this.H0.b(canvas3);
            t0 t0Var2 = this.f1;
            if (t0Var2 == null || t0Var2.f()) {
                this.H0.c(canvas3);
            }
            canvas3.restore();
        } else if (this.O0 != null) {
            canvas3.save();
            this.O0.a(canvas3);
            canvas3.restore();
        } else if (O(messageObject) || (messageObject != null && messageObject.type == 11)) {
            xh.g1 g1Var = this.S0;
            if (g1Var != null && ((i11 = messageObject.type) == 31 || i11 == 37 || i11 == 33)) {
                g1Var.setBounds((int) (imageReceiver.getImageX() - AndroidUtilities.dp(13.33f)), (int) (imageReceiver.getImageY() - AndroidUtilities.dp(14.0f)), (int) (imageReceiver.getImageWidth() + imageReceiver.getImageX() + AndroidUtilities.dp(13.33f)), (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(14.0f)));
                this.S0.draw(canvas3);
            }
            if (this.J != null) {
                canvas3.save();
                canvas3.translate(imageReceiver.getImageX(), imageReceiver.getImageY());
                Path path = this.K;
                if (path == null) {
                    this.K = new Path();
                } else {
                    path.rewind();
                }
                this.K.addCircle(imageReceiver.getImageWidth() / 2.0f, imageReceiver.getImageHeight() / 2.0f, imageReceiver.getImageWidth() / 2.0f, Path.Direction.CW);
                canvas3.clipPath(this.K);
                this.J.setBounds(0, 0, (int) imageReceiver.getImageWidth(), (int) imageReceiver.getImageHeight());
                this.J.draw(canvas3);
                canvas3.restore();
            } else if (messageObject.isStoryMention()) {
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                long j3 = messageMedia.user_id;
                daVar.c = messageMedia.id;
                ai.ja.h(j3, canvas3, imageReceiver, daVar);
            } else {
                imageReceiver.draw(canvas3);
            }
            c10 = '%';
            if (messageObject.type == 37) {
                yf.p.a(canvas3, org.telegram.ui.ActionBar.i6.S0, imageReceiver.getImageX() + AndroidUtilities.dp(26.0f), imageReceiver.getImageY() + AndroidUtilities.dp(26.0f), AndroidUtilities.dp(52.0f));
            }
            radialProgress22.a.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageWidth() + imageReceiver.getImageX(), imageReceiver.getImageHeight() + imageReceiver.getImageY());
            int i23 = messageObject.type;
            if (i23 == 21) {
                m50 m50Var = MessagesController.getInstance(this.H).photoSuggestion.get(messageObject.messageOwner.local_id);
                if (m50Var != null) {
                    radialProgress22.o(m50Var.W, true);
                    radialProgress22.setCircleRadius(((int) (imageReceiver.getImageWidth() * 0.5f)) + 1);
                    radialProgress22.G = AndroidUtilities.dp(24.0f);
                    radialProgress22.g(org.telegram.ui.ActionBar.i6.le, org.telegram.ui.ActionBar.i6.me, org.telegram.ui.ActionBar.i6.ne, org.telegram.ui.ActionBar.i6.oe);
                    if (m50Var.W == 1.0f) {
                        radialProgress22.setIcon(4, true, true);
                    } else {
                        radialProgress22.setIcon(3, true, true);
                    }
                }
                radialProgress22.draw(canvas3);
                i10 = 22;
            } else {
                i10 = 22;
                if (i23 == 22) {
                    float J = J(messageObject);
                    radialProgress22.o(J, true);
                    radialProgress22.setCircleRadius(AndroidUtilities.dp(26.0f));
                    radialProgress22.G = AndroidUtilities.dp(24.0f);
                    radialProgress22.g(org.telegram.ui.ActionBar.i6.le, org.telegram.ui.ActionBar.i6.me, org.telegram.ui.ActionBar.i6.ne, org.telegram.ui.ActionBar.i6.oe);
                    if (J == 1.0f) {
                        radialProgress22.setIcon(4, true, true);
                    } else {
                        radialProgress22.setIcon(3, true, true);
                    }
                    radialProgress22.draw(canvas3);
                }
            }
            textPaint = this.s0;
            arrayList = this.p0;
            if (textPaint != null || this.M == null) {
                i12 = i10;
                radialProgress2 = radialProgress22;
            } else {
                canvas3.save();
                canvas3.translate(this.T, this.S);
                if (this.M.getPaint() != this.s0) {
                    s();
                }
                canvas3.save();
                vh.g.d(canvas3, arrayList);
                vh.g.f(canvas3, this.M);
                t0 t0Var3 = this.f1;
                if (t0Var3 == null || t0Var3.f()) {
                    int i24 = i10;
                    StaticLayout staticLayout2 = this.M;
                    radialProgress2 = radialProgress22;
                    i12 = i24;
                    org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, staticLayout2, this.r0, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout2 == null ? null : G(staticLayout2.getPaint().getColor()));
                    canvas3 = canvas;
                } else {
                    i12 = i10;
                    radialProgress2 = radialProgress22;
                }
                canvas3.restore();
                int size2 = arrayList.size();
                int i25 = 0;
                while (i25 < size2) {
                    Object obj = arrayList.get(i25);
                    i25++;
                    vh.g gVar = (vh.g) obj;
                    gVar.h(this.M.getPaint().getColor());
                    gVar.draw(canvas3);
                }
                canvas3.restore();
            }
            if (this.s0 != null && this.P != null) {
                canvas3.save();
                canvas3.translate(this.U, this.S - this.Q);
                if (this.P.getPaint() != this.s0) {
                    s();
                }
                canvas3.save();
                vh.g.d(canvas3, arrayList);
                vh.g.f(canvas3, this.P);
                t0Var = this.f1;
                if (t0Var != null || t0Var.f()) {
                    StaticLayout staticLayout3 = this.P;
                    org.telegram.ui.Components.x5 x5Var = this.r0;
                    StaticLayout staticLayout4 = this.M;
                    org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, staticLayout3, x5Var, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout4 != null ? null : G(staticLayout4.getPaint().getColor()));
                    canvas3 = canvas;
                }
                canvas3.restore();
                size = arrayList.size();
                i16 = 0;
                while (i16 < size) {
                    Object obj2 = arrayList.get(i16);
                    i16++;
                    vh.g gVar2 = (vh.g) obj2;
                    gVar2.h(this.P.getPaint().getColor());
                    gVar2.draw(canvas3);
                }
                canvas3.restore();
            }
            if (L() && O(messageObject)) {
                canvas3.save();
                float f23 = (this.V - this.i1) / 2.0f;
                if (messageObject.type != i12) {
                    f23 += AndroidUtilities.dp(8.0f);
                }
                float f24 = f23;
                if (Q()) {
                    RectF rectF = this.M1;
                    f7 = (rectF != null ? rectF.top : AndroidUtilities.dp(4.0f) + this.S + this.O) + (i22 > 0 ? org.telegram.messenger.q.D(16.0f, 2, i22) : AndroidUtilities.dp(16.0f));
                    c11 = 21;
                } else {
                    float f25 = (this.i1 * 0.075f) + this.S + this.O;
                    c11 = 21;
                    if (messageObject.type != 21) {
                        i22 = this.h1;
                    }
                    float dp4 = f25 + i22 + AndroidUtilities.dp(4.0f);
                    if (messageObject.type == 21) {
                        dp4 += AndroidUtilities.dp(16.0f);
                    }
                    f7 = dp4;
                    if (messageObject.isStarGiftAction()) {
                        f7 += AndroidUtilities.dp(12.0f);
                    } else if (messageObject.type == 30 && !messageObject.isStarGiftAction()) {
                        f7 -= AndroidUtilities.dp(3.66f);
                    }
                }
                int i26 = messageObject.type;
                if (i26 == 31 || i26 == 37 || i26 == 33) {
                    f7 -= AndroidUtilities.dp(3.66f);
                }
                canvas3.translate(f24, f7);
                if (this.j1 != null) {
                    canvas3.save();
                    canvas3.translate(((this.i1 - AndroidUtilities.dp(16.0f)) - this.j1.getWidth()) / 2.0f, 0.0f);
                    this.j1.draw(canvas3);
                    canvas3.restore();
                    float height = this.j1.getHeight() + f7;
                    if (this.m1 != null) {
                        canvas3.save();
                        canvas3.translate(((this.i1 - AndroidUtilities.dp(16.0f)) - this.m1.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f) + this.j1.getHeight());
                        this.m1.draw(canvas3);
                        canvas3.restore();
                        height += AndroidUtilities.dp(10.0f) + this.m1.getHeight();
                    }
                    dp = height + AndroidUtilities.dp(messageObject.type == 25 ? 6.0f : 0.0f);
                } else {
                    dp = f7 - AndroidUtilities.dp(4.0f);
                }
                float f26 = dp;
                canvas3.restore();
                if (this.j1 == null || (l11Var2 = this.l1) == null) {
                    i13 = 33;
                    canvas2 = canvas3;
                    f10 = 0.0f;
                } else {
                    float l4 = l11Var2.l() + AndroidUtilities.dp(12.0f);
                    float z11 = com.google.android.gms.internal.vision.e2.z(this.i1 - AndroidUtilities.dp(16.0f), l4, 2.0f, f24);
                    float height2 = f7 + this.j1.getHeight() + AndroidUtilities.dp(14.0f);
                    if (this.k1 == null) {
                        this.k1 = new Paint(1);
                    }
                    this.k1.setColor(org.telegram.ui.ActionBar.i6.f1() ? 285212671 : TLObject.FLAG_28);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(z11, height2 - AndroidUtilities.dp(8.0f), l4 + z11, AndroidUtilities.dp(8.0f) + height2);
                    canvas3.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.k1);
                    Canvas canvas4 = canvas3;
                    f10 = 0.0f;
                    i13 = 33;
                    this.l1.c(z11 + AndroidUtilities.dp(6.0f), height2, 1.0f, -855638017, canvas4);
                    canvas2 = canvas4;
                    f26 += AndroidUtilities.dp(24.0f);
                }
                float dp5 = f26 + AndroidUtilities.dp(4.0f);
                if (messageObject.type == 18) {
                    dp5 += AndroidUtilities.dp(2.0f);
                }
                float f27 = dp5;
                canvas2.save();
                canvas2.translate(f24, f27);
                if (messageObject.type == i12) {
                    RadialProgress2 radialProgress23 = radialProgress2;
                    if ((radialProgress23.c ? radialProgress23.j : radialProgress23.i).b() == 1.0f) {
                        i14 = 4;
                        if (radialProgress23.a() == 4) {
                            if (this.s1 != null) {
                                canvas2.save();
                                canvas2.translate((this.i1 - ((StaticLayout) this.s1.f).getWidth()) / 2.0f, f10);
                                this.s1.b = ((this.i1 - ((StaticLayout) r3.f).getWidth()) / 2.0f) + f24;
                                this.s1.e = f27;
                                int color = textPaint3.getColor();
                                u0 u0Var2 = this.s1;
                                f12 = 8.0f;
                                f13 = f24;
                                f11 = 0.2f;
                                vh.g.g(this, false, color, 0, (AtomicReference) u0Var2.g, 1, (StaticLayout) u0Var2.f, u0Var2.c, canvas, false);
                                u0 u0Var3 = this.s1;
                                org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, (StaticLayout) u0Var3.f, (org.telegram.ui.Components.x5) u0Var3.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, G(textPaint3.getColor()));
                                canvas3 = canvas;
                                canvas3.restore();
                                w0Var = this;
                            } else {
                                f11 = 0.2f;
                                f12 = 8.0f;
                                f13 = f24;
                                w0Var = this;
                                canvas3 = canvas2;
                            }
                            canvas3.restore();
                            if (w0Var.j1 == null) {
                                AndroidUtilities.dp(f12);
                            }
                            u0Var = w0Var.s1;
                            if (u0Var != null) {
                                AndroidUtilities.lerp(w0Var.p1, ((StaticLayout) u0Var.f).getHeight(), e7);
                            }
                            staticLayout = w0Var.x1;
                            if (staticLayout != null) {
                                staticLayout.getHeight();
                            }
                            w0Var.getHeight();
                            AndroidUtilities.dp(f12);
                            e6Var = w0Var.g1;
                            if (e6Var == null) {
                                e6Var.m(w0Var.u0, w0Var.t0 + AndroidUtilities.dp(4.0f), w0Var.getMeasuredWidth(), w0Var.v0);
                            } else {
                                org.telegram.ui.ActionBar.i6.q(w0Var.u0, w0Var.t0 + AndroidUtilities.dp(4.0f), w0Var.getMeasuredWidth(), w0Var.v0);
                            }
                            float a10 = w0Var.n.a(0.02f);
                            canvas3.save();
                            RectF rectF3 = w0Var.o0;
                            canvas3.scale(a10, a10, rectF3.centerX(), rectF3.centerY());
                            if (w0Var.x1 != null) {
                                canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), w0Var.I("paintChatActionBackgroundSelected"));
                                if (w0Var.K()) {
                                    canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), w0Var.I("paintChatActionBackgroundDarken"));
                                }
                                float f28 = w0Var.b2;
                                Paint paint = w0Var.c2;
                                if (f28 > 0.0f) {
                                    canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
                                }
                                if (w0Var.getMessageObject().type == 31 || w0Var.getMessageObject().type == 37 || w0Var.getMessageObject().type == 33) {
                                    boolean a11 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.i6.f1();
                                    int color2 = paint.getColor();
                                    paint.setColor(a11 ? 620756991 : TLObject.FLAG_28);
                                    canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
                                    paint.setColor(color2);
                                }
                                if (w0Var.getMessageObject().type == 31 || w0Var.getMessageObject().type == 37 || w0Var.getMessageObject().type == 33 || w0Var.getMessageObject().type == 21 || w0Var.getMessageObject().type == 22 || w0Var.getMessageObject().type == 24) {
                                    w0Var.invalidate();
                                } else {
                                    Path path2 = w0Var.U1;
                                    path2.rewind();
                                    path2.addRoundRect(rectF3, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
                                    canvas3.save();
                                    canvas3.clipPath(path2);
                                    w0Var.V1.d(canvas3);
                                    if (!w0Var.V1.g) {
                                        w0Var.invalidate();
                                    }
                                    canvas3.restore();
                                }
                            }
                            z10 = messageObject.settingAvatar;
                            if (z10) {
                                float f29 = w0Var.c0;
                                if (f29 != 1.0f) {
                                    w0Var.c0 = f29 + 0.10666667f;
                                    f14 = 0.0f;
                                    clamp = Utilities.clamp(w0Var.c0, 1.0f, f14);
                                    w0Var.c0 = clamp;
                                    if (clamp != f14) {
                                        if (w0Var.b0 == null) {
                                            w0Var.b0 = new RadialProgressView(w0Var.getContext());
                                        }
                                        int dp6 = AndroidUtilities.dp(16.0f);
                                        canvas3.save();
                                        float f30 = w0Var.c0;
                                        canvas3.scale(f30, f30, rectF3.centerX(), rectF3.centerY());
                                        w0Var.b0.setSize(dp6);
                                        w0Var.b0.setProgressColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.ic));
                                        w0Var.b0.a(canvas3, rectF3.centerX(), rectF3.centerY());
                                        canvas3.restore();
                                    }
                                    if (w0Var.c0 != 1.0f && w0Var.x1 != null) {
                                        canvas3.save();
                                        float f31 = 1.0f - w0Var.c0;
                                        canvas3.scale(f31, f31, rectF3.centerX(), rectF3.centerY());
                                        canvas3.translate(f13, rectF3.top + AndroidUtilities.dp(7.0f));
                                        canvas3.translate(((w0Var.i1 - AndroidUtilities.dp(16.0f)) - w0Var.x1.getWidth()) / 2.0f, 0.0f);
                                        w0Var.x1.draw(canvas3);
                                        canvas3.restore();
                                    }
                                    if (messageObject.flickerLoading) {
                                        ia0 ia0Var = w0Var.r;
                                        if (ia0Var != null) {
                                            ia0Var.e(rectF3);
                                            w0Var.r.k(16.0f);
                                            w0Var.r.a();
                                            w0Var.r.draw(canvas3);
                                            if (w0Var.r.c()) {
                                                w0Var.r.b = -1L;
                                            }
                                        }
                                    } else {
                                        if (w0Var.r == null) {
                                            ia0 ia0Var2 = new ia0(e6Var);
                                            w0Var.r = ia0Var2;
                                            ia0Var2.h();
                                            ia0 ia0Var3 = w0Var.r;
                                            ia0Var3.D = true;
                                            float f32 = f11;
                                            ia0Var3.g(org.telegram.ui.ActionBar.i6.m1(0.08f, -1), org.telegram.ui.ActionBar.i6.m1(f32, -1), org.telegram.ui.ActionBar.i6.m1(f32, -1), org.telegram.ui.ActionBar.i6.m1(0.7f, -1));
                                            w0Var.r.x.setStrokeWidth(AndroidUtilities.dp(1.0f));
                                        }
                                        ia0 ia0Var4 = w0Var.r;
                                        ia0Var4.c = -1L;
                                        ia0Var4.e(rectF3);
                                        w0Var.r.k(16.0f);
                                        w0Var.r.draw(canvas3);
                                    }
                                    canvas3.restore();
                                    if (w0Var.M1 != null && w0Var.R1 != null && w0Var.S1 != null) {
                                        I = w0Var.I("paintChatActionBackground");
                                        Paint I2 = w0Var.I("paintChatActionBackgroundDarken");
                                        float dp7 = (w0Var.M1.right - AndroidUtilities.dp(65.0f)) + AndroidUtilities.dp(2.0f);
                                        float dp8 = w0Var.M1.top - AndroidUtilities.dp(2.0f);
                                        if (e6Var == null) {
                                            e6Var.m(w0Var.u0 + dp7, w0Var.t0 + AndroidUtilities.dp(4.0f) + dp8, w0Var.getMeasuredWidth(), w0Var.v0);
                                        } else {
                                            org.telegram.ui.ActionBar.i6.q(w0Var.u0 + dp7, w0Var.t0 + AndroidUtilities.dp(4.0f) + dp8, w0Var.getMeasuredWidth(), w0Var.v0);
                                        }
                                        canvas3.save();
                                        canvas3.translate(dp7, dp8);
                                        ColorFilter colorFilter = I.getColorFilter();
                                        PathEffect pathEffect = I.getPathEffect();
                                        a2 = e6Var == null ? e6Var.a() : org.telegram.ui.ActionBar.i6.f1();
                                        if (w0Var.P1 != null || w0Var.O1 != a2) {
                                            colorMatrix = new ColorMatrix();
                                            if ((I.getColorFilter() instanceof ColorMatrixColorFilter) && Build.VERSION.SDK_INT >= 26) {
                                                ((ColorMatrixColorFilter) I.getColorFilter()).getColorMatrix(colorMatrix);
                                            }
                                            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, !a2 ? 0.1f : -0.08f);
                                            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, !a2 ? 0.15f : 0.1f);
                                            w0Var.P1 = new ColorMatrixColorFilter(colorMatrix);
                                            w0Var.O1 = a2;
                                        }
                                        I.setColorFilter(w0Var.P1);
                                        I.setPathEffect(w0Var.Q1);
                                        canvas3.drawPath(w0Var.R1, I);
                                        I.setColorFilter(colorFilter);
                                        I.setPathEffect(pathEffect);
                                        if (w0Var.K()) {
                                            PathEffect pathEffect2 = I2.getPathEffect();
                                            I2.setPathEffect(w0Var.Q1);
                                            canvas3.drawPath(w0Var.R1, I2);
                                            I2.setPathEffect(pathEffect2);
                                        }
                                        canvas3.rotate(45.0f, AndroidUtilities.dp(40.43f), AndroidUtilities.dp(24.56f));
                                        w0Var.S1.c(AndroidUtilities.dp(40.43f) - (w0Var.S1.h() / 2.0f), AndroidUtilities.dp(26.0f), 1.0f, -1, canvas3);
                                        canvas3.restore();
                                    }
                                }
                            }
                            if (!z10) {
                                float f33 = w0Var.c0;
                                f14 = 0.0f;
                                if (f33 != 0.0f) {
                                    w0Var.c0 = f33 - 0.10666667f;
                                }
                                clamp = Utilities.clamp(w0Var.c0, 1.0f, f14);
                                w0Var.c0 = clamp;
                                if (clamp != f14) {
                                }
                                if (w0Var.c0 != 1.0f) {
                                    canvas3.save();
                                    float f312 = 1.0f - w0Var.c0;
                                    canvas3.scale(f312, f312, rectF3.centerX(), rectF3.centerY());
                                    canvas3.translate(f13, rectF3.top + AndroidUtilities.dp(7.0f));
                                    canvas3.translate(((w0Var.i1 - AndroidUtilities.dp(16.0f)) - w0Var.x1.getWidth()) / 2.0f, 0.0f);
                                    w0Var.x1.draw(canvas3);
                                    canvas3.restore();
                                }
                                if (messageObject.flickerLoading) {
                                }
                                canvas3.restore();
                                if (w0Var.M1 != null) {
                                    I = w0Var.I("paintChatActionBackground");
                                    Paint I22 = w0Var.I("paintChatActionBackgroundDarken");
                                    float dp72 = (w0Var.M1.right - AndroidUtilities.dp(65.0f)) + AndroidUtilities.dp(2.0f);
                                    float dp82 = w0Var.M1.top - AndroidUtilities.dp(2.0f);
                                    if (e6Var == null) {
                                    }
                                    canvas3.save();
                                    canvas3.translate(dp72, dp82);
                                    ColorFilter colorFilter2 = I.getColorFilter();
                                    PathEffect pathEffect3 = I.getPathEffect();
                                    if (e6Var == null) {
                                    }
                                    if (w0Var.P1 != null) {
                                    }
                                    colorMatrix = new ColorMatrix();
                                    if (I.getColorFilter() instanceof ColorMatrixColorFilter) {
                                        ((ColorMatrixColorFilter) I.getColorFilter()).getColorMatrix(colorMatrix);
                                    }
                                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, !a2 ? 0.1f : -0.08f);
                                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, !a2 ? 0.15f : 0.1f);
                                    w0Var.P1 = new ColorMatrixColorFilter(colorMatrix);
                                    w0Var.O1 = a2;
                                    I.setColorFilter(w0Var.P1);
                                    I.setPathEffect(w0Var.Q1);
                                    canvas3.drawPath(w0Var.R1, I);
                                    I.setColorFilter(colorFilter2);
                                    I.setPathEffect(pathEffect3);
                                    if (w0Var.K()) {
                                    }
                                    canvas3.rotate(45.0f, AndroidUtilities.dp(40.43f), AndroidUtilities.dp(24.56f));
                                    w0Var.S1.c(AndroidUtilities.dp(40.43f) - (w0Var.S1.h() / 2.0f), AndroidUtilities.dp(26.0f), 1.0f, -1, canvas3);
                                    canvas3.restore();
                                }
                            }
                            f14 = 0.0f;
                            clamp = Utilities.clamp(w0Var.c0, 1.0f, f14);
                            w0Var.c0 = clamp;
                            if (clamp != f14) {
                            }
                            if (w0Var.c0 != 1.0f) {
                            }
                            if (messageObject.flickerLoading) {
                            }
                            canvas3.restore();
                            if (w0Var.M1 != null) {
                            }
                        }
                    } else {
                        i14 = 4;
                    }
                    f11 = 0.2f;
                    f12 = 8.0f;
                    int i27 = i13;
                    canvas3 = canvas2;
                    f13 = f24;
                    if (this.A1 == null) {
                        TextPaint textPaint6 = new TextPaint();
                        this.z1 = textPaint6;
                        textPaint6.setTextSize(AndroidUtilities.dp(13.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.ActionSettingWallpaper));
                        int indexOf = spannableStringBuilder.toString().indexOf("...");
                        if (indexOf < 0) {
                            indexOf = spannableStringBuilder.toString().indexOf("…");
                            i15 = 1;
                        } else {
                            i15 = 3;
                        }
                        if (indexOf >= 0) {
                            SpannableString spannableString = new SpannableString("…");
                            qc qcVar = new qc();
                            qcVar.r = true;
                            qcVar.b(this);
                            spannableString.setSpan(qcVar, 0, spannableString.length(), i27);
                            spannableStringBuilder.replace(indexOf, indexOf + i15, (CharSequence) spannableString);
                        }
                        TextPaint textPaint7 = this.z1;
                        u0 u0Var4 = this.s1;
                        this.A1 = new StaticLayout(spannableStringBuilder, textPaint7, u0Var4 == null ? 1 : u0Var4.d, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                    float J2 = J(messageObject);
                    if (this.C1 == null || this.B1 != J2) {
                        this.B1 = J2;
                        String o9 = a1.g.o((int) (J2 * 100.0f), "%", new StringBuilder());
                        u0 u0Var5 = this.s1;
                        this.C1 = new StaticLayout(o9, textPaint3, u0Var5 == null ? 1 : u0Var5.d, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                    this.z1.setColor(textPaint3.getColor());
                    if (radialProgress23.a() == i14) {
                        float b10 = (radialProgress23.c ? radialProgress23.j : radialProgress23.i).b();
                        int color3 = textPaint3.getColor();
                        float f34 = 1.0f - b10;
                        this.z1.setAlpha((int) (Color.alpha(color3) * f34));
                        textPaint3.setAlpha((int) (Color.alpha(color3) * b10));
                        textPaint3.linkColor = textPaint3.getColor();
                        if (this.s1 != null) {
                            float f35 = (b10 * 0.2f) + 0.8f;
                            canvas3.save();
                            canvas3.scale(f35, f35, this.i1 / 2.0f, ((StaticLayout) this.s1.f).getHeight() / 2.0f);
                            canvas3.translate((this.i1 - ((StaticLayout) this.s1.f).getWidth()) / 2.0f, 0.0f);
                            this.s1.b = ((this.i1 - ((StaticLayout) r1.f).getWidth()) / 2.0f) + f13;
                            this.s1.e = f27;
                            int color4 = textPaint3.getColor();
                            u0 u0Var6 = this.s1;
                            vh.g.g(this, false, color4, 0, (AtomicReference) u0Var6.g, 1, (StaticLayout) u0Var6.f, u0Var6.c, canvas3, false);
                            u0 u0Var7 = this.s1;
                            w0Var2 = this;
                            org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, (StaticLayout) u0Var7.f, (org.telegram.ui.Components.x5) u0Var7.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, G(textPaint3.getColor()));
                            canvas3 = canvas;
                            canvas3.restore();
                        } else {
                            w0Var2 = this;
                        }
                        textPaint3.setAlpha((int) (Color.alpha(color3) * f34));
                        textPaint3.linkColor = textPaint3.getColor();
                        float f36 = (f34 * 0.2f) + 0.8f;
                        canvas3.save();
                        canvas3.scale(f36, f36, w0Var2.i1 / 2.0f, w0Var2.A1.getHeight() / 2.0f);
                        canvas3.translate((w0Var2.i1 - w0Var2.A1.getWidth()) / 2.0f, 0.0f);
                        vh.g.f(canvas3, w0Var2.A1);
                        canvas3.restore();
                        canvas3.save();
                        canvas3.translate(0.0f, AndroidUtilities.dp(4.0f) + w0Var2.A1.getHeight());
                        canvas3.scale(f36, f36, w0Var2.i1 / 2.0f, w0Var2.C1.getHeight() / 2.0f);
                        canvas3.translate((w0Var2.i1 - w0Var2.C1.getWidth()) / 2.0f, 0.0f);
                        vh.g.f(canvas3, w0Var2.C1);
                        canvas3.restore();
                        textPaint3.setColor(color3);
                        textPaint3.linkColor = color3;
                    } else {
                        w0Var2 = this;
                        canvas3.save();
                        canvas3.translate((w0Var2.i1 - w0Var2.A1.getWidth()) / 2.0f, 0.0f);
                        w0Var2.A1.draw(canvas3);
                        canvas3.restore();
                        canvas3.save();
                        canvas3.translate((w0Var2.i1 - w0Var2.C1.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f) + w0Var2.A1.getHeight());
                        vh.g.f(canvas3, w0Var2.C1);
                        canvas3.restore();
                    }
                    w0Var = w0Var2;
                    canvas3.restore();
                    if (w0Var.j1 == null) {
                    }
                    u0Var = w0Var.s1;
                    if (u0Var != null) {
                    }
                    staticLayout = w0Var.x1;
                    if (staticLayout != null) {
                    }
                    w0Var.getHeight();
                    AndroidUtilities.dp(f12);
                    e6Var = w0Var.g1;
                    if (e6Var == null) {
                    }
                    float a102 = w0Var.n.a(0.02f);
                    canvas3.save();
                    RectF rectF32 = w0Var.o0;
                    canvas3.scale(a102, a102, rectF32.centerX(), rectF32.centerY());
                    if (w0Var.x1 != null) {
                    }
                    z10 = messageObject.settingAvatar;
                    if (z10) {
                    }
                    if (!z10) {
                    }
                    f14 = 0.0f;
                    clamp = Utilities.clamp(w0Var.c0, 1.0f, f14);
                    w0Var.c0 = clamp;
                    if (clamp != f14) {
                    }
                    if (w0Var.c0 != 1.0f) {
                    }
                    if (messageObject.flickerLoading) {
                    }
                    canvas3.restore();
                    if (w0Var.M1 != null) {
                    }
                } else {
                    w0Var2 = this;
                    canvas3 = canvas2;
                    f11 = 0.2f;
                    f12 = 8.0f;
                    f13 = f24;
                    u0 u0Var8 = w0Var2.s1;
                    if (u0Var8 != null) {
                        float height3 = ((StaticLayout) u0Var8.f).getHeight();
                        if (e7 < 1.0f) {
                            height3 = AndroidUtilities.lerp(w0Var2.p1, height3, e7);
                            RectF rectF4 = AndroidUtilities.rectTmp;
                            rectF4.set(0.0f, -AndroidUtilities.dp(20.0f), w0Var2.getWidth(), height3);
                            canvas3.saveLayerAlpha(rectF4, 255, 31);
                        } else {
                            canvas3.save();
                        }
                        canvas3.translate(((w0Var2.i1 - AndroidUtilities.dp(16.0f)) - ((StaticLayout) w0Var2.s1.f).getWidth()) / 2.0f, 0.0f);
                        w0Var2.s1.b = (((w0Var2.i1 - AndroidUtilities.dp(16.0f)) - ((StaticLayout) w0Var2.s1.f).getWidth()) / 2.0f) + f13;
                        u0 u0Var9 = w0Var2.s1;
                        u0Var9.e = f27;
                        int color5 = u0Var9.a.getColor();
                        u0 u0Var10 = w0Var2.s1;
                        float f37 = height3;
                        vh.g.g(w0Var2, false, color5, 0, (AtomicReference) u0Var10.g, 1, (StaticLayout) u0Var10.f, u0Var10.c, canvas3, false);
                        u0 u0Var11 = w0Var2.s1;
                        StaticLayout staticLayout5 = (StaticLayout) u0Var11.f;
                        org.telegram.ui.Components.x5 x5Var2 = (org.telegram.ui.Components.x5) u0Var11.h;
                        ColorFilter G = w0Var2.G(textPaint3.getColor());
                        w0Var = w0Var2;
                        org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, staticLayout5, x5Var2, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, G);
                        canvas3 = canvas;
                        if (e7 < 1.0f && w0Var.w1 != null) {
                            canvas3.save();
                            if (w0Var.r1 == null) {
                                w0Var.r1 = new j20();
                            }
                            canvas3.translate((-((w0Var.i1 - AndroidUtilities.dp(16.0f)) - ((StaticLayout) w0Var.s1.f).getWidth())) / 2.0f, 0.0f);
                            RectF rectF5 = AndroidUtilities.rectTmp;
                            rectF5.set((w0Var.t1 - w0Var.w1.h()) + AndroidUtilities.dp(8.0f), (w0Var.u1 - w0Var.v1) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + w0Var.t1, w0Var.u1);
                            float f38 = 1.0f - e7;
                            w0Var.r1.a(canvas3, rectF5, f38);
                            rectF5.set((w0Var.t1 - w0Var.w1.h()) - AndroidUtilities.dp(16.0f), (w0Var.u1 - w0Var.v1) - AndroidUtilities.dp(6.0f), (w0Var.t1 - w0Var.w1.h()) + AndroidUtilities.dp(8.0f), w0Var.u1);
                            w0Var.r1.b(canvas3, rectF5, 2, f38);
                            rectF5.set(0.0f, f37 - AndroidUtilities.dp(12.0f), w0Var.getWidth(), f37);
                            w0Var.r1.b(canvas3, rectF5, 3, (1.0f - f38) * f38 * 4.0f);
                            canvas3.restore();
                        }
                        canvas3.restore();
                        if (e7 < 1.0f && (l11Var = w0Var.w1) != null) {
                            l11Var.c((w0Var.t1 - l11Var.h()) + AndroidUtilities.dp(5.0f), (w0Var.u1 - (w0Var.v1 / 2.0f)) - AndroidUtilities.dp(1.0f), 1.0f - e7, w0Var.s1.a.getColor(), canvas3);
                        }
                        canvas3.restore();
                        if (w0Var.j1 == null) {
                        }
                        u0Var = w0Var.s1;
                        if (u0Var != null) {
                        }
                        staticLayout = w0Var.x1;
                        if (staticLayout != null) {
                        }
                        w0Var.getHeight();
                        AndroidUtilities.dp(f12);
                        e6Var = w0Var.g1;
                        if (e6Var == null) {
                        }
                        float a1022 = w0Var.n.a(0.02f);
                        canvas3.save();
                        RectF rectF322 = w0Var.o0;
                        canvas3.scale(a1022, a1022, rectF322.centerX(), rectF322.centerY());
                        if (w0Var.x1 != null) {
                        }
                        z10 = messageObject.settingAvatar;
                        if (z10) {
                        }
                        if (!z10) {
                        }
                        f14 = 0.0f;
                        clamp = Utilities.clamp(w0Var.c0, 1.0f, f14);
                        w0Var.c0 = clamp;
                        if (clamp != f14) {
                        }
                        if (w0Var.c0 != 1.0f) {
                        }
                        if (messageObject.flickerLoading) {
                        }
                        canvas3.restore();
                        if (w0Var.M1 != null) {
                        }
                    }
                    w0Var = w0Var2;
                    canvas3.restore();
                    if (w0Var.j1 == null) {
                    }
                    u0Var = w0Var.s1;
                    if (u0Var != null) {
                    }
                    staticLayout = w0Var.x1;
                    if (staticLayout != null) {
                    }
                    w0Var.getHeight();
                    AndroidUtilities.dp(f12);
                    e6Var = w0Var.g1;
                    if (e6Var == null) {
                    }
                    float a10222 = w0Var.n.a(0.02f);
                    canvas3.save();
                    RectF rectF3222 = w0Var.o0;
                    canvas3.scale(a10222, a10222, rectF3222.centerX(), rectF3222.centerY());
                    if (w0Var.x1 != null) {
                    }
                    z10 = messageObject.settingAvatar;
                    if (z10) {
                    }
                    if (!z10) {
                    }
                    f14 = 0.0f;
                    clamp = Utilities.clamp(w0Var.c0, 1.0f, f14);
                    w0Var.c0 = clamp;
                    if (clamp != f14) {
                    }
                    if (w0Var.c0 != 1.0f) {
                    }
                    if (messageObject.flickerLoading) {
                    }
                    canvas3.restore();
                    if (w0Var.M1 != null) {
                    }
                }
            } else {
                w0Var = this;
            }
            w0Var.D(canvas3, false);
            w0Var.r2.a();
            canvas3.restore();
        }
        i10 = 22;
        c10 = '%';
        textPaint = this.s0;
        arrayList = this.p0;
        if (textPaint != null) {
        }
        i12 = i10;
        radialProgress2 = radialProgress22;
        if (this.s0 != null) {
            canvas3.save();
            canvas3.translate(this.U, this.S - this.Q);
            if (this.P.getPaint() != this.s0) {
            }
            canvas3.save();
            vh.g.d(canvas3, arrayList);
            vh.g.f(canvas3, this.P);
            t0Var = this.f1;
            if (t0Var != null) {
            }
            StaticLayout staticLayout32 = this.P;
            org.telegram.ui.Components.x5 x5Var3 = this.r0;
            StaticLayout staticLayout42 = this.M;
            org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, staticLayout32, x5Var3, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout42 != null ? null : G(staticLayout42.getPaint().getColor()));
            canvas3 = canvas;
            canvas3.restore();
            size = arrayList.size();
            i16 = 0;
            while (i16 < size) {
            }
            canvas3.restore();
        }
        if (L()) {
        }
        w0Var = this;
        w0Var.D(canvas3, false);
        w0Var.r2.a();
        canvas3.restore();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        MessageObject messageObject = this.P0;
        if (TextUtils.isEmpty(this.R0) && messageObject == null) {
            return;
        }
        if (this.m2 == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(!TextUtils.isEmpty(this.R0) ? this.R0 : messageObject.messageText);
            for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new i(1, this, characterStyle), spanStart, spanEnd, 33);
            }
            this.m2 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(this.m2.toString());
        } else {
            accessibilityNodeInfo.setText(this.m2);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        RectF rectF = this.o0;
        this.T1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Wallet.d3 d3Var = this.I0;
        org.telegram.ui.Wallet.c3 c3Var = d3Var == null ? null : d3Var.m;
        if (c3Var != null) {
            c3Var.layout(0, 0, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0206  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        float f7;
        float f10;
        int i12;
        boolean L;
        zg.o0 o0Var;
        float f11;
        boolean z10;
        float f12;
        float f13;
        float dp;
        float dp2;
        StaticLayout staticLayout;
        float f14;
        TLRPC.Message message;
        int measuredWidth;
        int i13;
        int dp3;
        int i14;
        int dp4;
        int i15;
        org.telegram.ui.Wallet.d3 d3Var = this.I0;
        org.telegram.ui.Wallet.c3 c3Var = d3Var == null ? null : d3Var.m;
        if (c3Var != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30);
            c3Var.measure(makeMeasureSpec, makeMeasureSpec);
        }
        MessageObject messageObject = this.P0;
        if (messageObject == null && this.R0 == null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(14.0f) + this.l0 + this.O);
            return;
        }
        if (O(messageObject)) {
            this.i1 = Math.min((int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)), ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
            if ((!AndroidUtilities.isTablet() && ((i15 = messageObject.type) == 18 || i15 == 30 || P())) || messageObject.type == 35) {
                this.i1 = (int) (this.i1 * 1.2f);
            }
            this.h1 = this.i1 - AndroidUtilities.dp(106.0f);
            if (messageObject.type == 31) {
                this.i1 = Math.min(this.i1, AndroidUtilities.dp(192.0f));
                this.h1 = AndroidUtilities.dp(78.0f);
            }
            if (messageObject.type == 33) {
                this.i1 = Math.min(this.i1, AndroidUtilities.dp(220.0f));
                this.h1 = AndroidUtilities.dp(78.0f);
            }
            int i16 = messageObject.type;
            ImageReceiver imageReceiver = this.I;
            if (i16 == 37) {
                this.h1 = AndroidUtilities.dp(52.0f);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
            } else if (Q()) {
                imageReceiver.setRoundRadius(this.h1 / 2);
            } else {
                imageReceiver.setRoundRadius(0);
            }
        }
        int max = Math.max(AndroidUtilities.dp(30.0f), View.MeasureSpec.getSize(i10));
        if (this.V != max) {
            this.C0 = true;
            this.V = max;
            s();
        }
        if (messageObject != null) {
            f7 = 30.0f;
            if (messageObject.type == 11) {
                i14 = AndroidUtilities.roundMessageSize;
                dp4 = AndroidUtilities.dp(10.0f);
            } else if (O(messageObject)) {
                i14 = this.i1;
                dp4 = AndroidUtilities.dp(12.0f);
            } else if (M()) {
                f10 = 140.0f;
                i12 = (this.I0.q0 == null ? AndroidUtilities.dp(140.0f) : ((int) Math.ceil(r3.q0.j())) + AndroidUtilities.dp(150.0f)) + AndroidUtilities.dp(8.0f);
                L = L();
                o0Var = this.E0;
                if (L) {
                    r9 = org.telegram.messenger.q.C(8.0f, this.H0.M, this.H0.p ? 0 : AndroidUtilities.dp(16.0f) + this.S + this.O);
                    if (!o0Var.s) {
                        dp3 = AndroidUtilities.dp(8.0f) + o0Var.o;
                        o0Var.p = dp3;
                        r9 += dp3;
                    }
                    f13 = 24.0f;
                } else {
                    iz0 iz0Var = this.O0;
                    if (iz0Var != null) {
                        r9 = AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(f10) + ((int) iz0Var.f.j()) + (iz0Var.i ? AndroidUtilities.dp(40.0f) : 0);
                        if (!o0Var.s) {
                            dp3 = AndroidUtilities.dp(8.0f) + o0Var.o;
                            o0Var.p = dp3;
                            r9 += dp3;
                        }
                    } else if (O(messageObject)) {
                        if (messageObject != null) {
                            f11 = 12.0f;
                            if (messageObject.type == 25) {
                                z10 = true;
                                int H = H(messageObject);
                                if (Q()) {
                                    f12 = 8.0f;
                                    f13 = 24.0f;
                                    dp = (this.s1 == null ? 0 : AndroidUtilities.dp(4.0f) + ((StaticLayout) r4.f).getHeight()) + (this.i1 * 0.075f) + this.S + this.O + H + AndroidUtilities.dp(4.0f);
                                } else {
                                    f13 = 24.0f;
                                    f12 = 8.0f;
                                    int dp5 = AndroidUtilities.dp(4.0f) + this.S + this.O + (H > 0 ? org.telegram.messenger.q.D(16.0f, 2, H) : AndroidUtilities.dp(16.0f));
                                    u0 u0Var = this.s1;
                                    dp = dp5 + (u0Var == null ? 0 : AndroidUtilities.dp(4.0f) + ((StaticLayout) u0Var.f).getHeight());
                                }
                                this.K1 = 0;
                                if (this.j1 == null) {
                                    float height = dp + r15.getHeight();
                                    if (this.j1.getLineCount() > 1) {
                                        this.K1 = (this.j1.getHeight() - this.j1.getLineTop(1)) + this.K1;
                                    }
                                    dp2 = height + AndroidUtilities.dp(z10 ? 6.0f : 0.0f);
                                    if (this.m1 != null) {
                                        dp2 += AndroidUtilities.dp(9.0f) + r5.getHeight();
                                    }
                                    if (this.l1 != null) {
                                        dp2 += AndroidUtilities.dp(f13);
                                    }
                                } else {
                                    dp2 = dp - AndroidUtilities.dp(f11);
                                    this.K1 -= AndroidUtilities.dp(f7);
                                }
                                u0 u0Var2 = this.s1;
                                int height2 = u0Var2 != null ? 0 : ((StaticLayout) u0Var2.f).getHeight();
                                if (this.s1 != null) {
                                    this.K1 = 0;
                                } else if (this.m1 != null) {
                                    this.K1 = org.telegram.messenger.q.C(10.0f, height2, this.K1);
                                } else {
                                    MessageObject messageObject2 = this.P0;
                                    if (messageObject2.type == 18 || messageObject2.isStarGiftAction()) {
                                        this.K1 = bi.D(this.x1 == null ? 0.0f : 10.0f, height2, this.K1);
                                    } else if (this.P0.type == 30) {
                                        this.K1 = bi.D(20.0f, height2, this.K1);
                                    } else if (this.o1) {
                                        this.K1 += height2;
                                    } else if (((StaticLayout) this.s1.f).getLineCount() > 2) {
                                        this.K1 = ((((StaticLayout) this.s1.f).getLineCount() * (((StaticLayout) this.s1.f).getLineBottom(0) - ((StaticLayout) this.s1.f).getLineTop(0))) - 2) + this.K1;
                                    }
                                }
                                if (this.l1 != null) {
                                    this.K1 = AndroidUtilities.dp(f13) + this.K1;
                                }
                                int dp6 = this.K1 - AndroidUtilities.dp(z10 ? 14.0f : 0.0f);
                                this.K1 = dp6;
                                i12 += dp6;
                                int dp7 = AndroidUtilities.dp(14.0f) + this.O + i12;
                                staticLayout = this.x1;
                                RectF rectF = this.o0;
                                if (staticLayout == null) {
                                    float z11 = com.google.android.gms.internal.vision.e2.z((dp7 - dp2) - staticLayout.getHeight(), AndroidUtilities.dp(f12), 2.0f, dp2);
                                    if (this.P0.isStarGiftAction()) {
                                        z11 += AndroidUtilities.dp(4.0f);
                                    }
                                    float f15 = (this.V - this.D1) / 2.0f;
                                    f14 = 2.0f;
                                    rectF.set(f15 - AndroidUtilities.dp(18.0f), z11 - AndroidUtilities.dp(f12), f15 + this.D1 + AndroidUtilities.dp(18.0f), z11 + (this.x1 != null ? r7.getHeight() : 0) + AndroidUtilities.dp(f12));
                                } else {
                                    f14 = 2.0f;
                                    i12 -= AndroidUtilities.dp(40.0f);
                                    this.K1 -= AndroidUtilities.dp(40.0f);
                                    MessageObject messageObject3 = this.P0;
                                    if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                                        i12 -= AndroidUtilities.dp(f12);
                                        this.K1 -= AndroidUtilities.dp(f12);
                                    }
                                }
                                measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                                rg.v1 v1Var = this.V1;
                                v1Var.a.set(rectF);
                                v1Var.b.set(rectF);
                                if (this.W1 != measuredWidth) {
                                    this.W1 = measuredWidth;
                                    v1Var.f();
                                }
                                if (Q()) {
                                    int dp8 = AndroidUtilities.dp(4.0f) + this.S + this.O;
                                    this.f = 0;
                                    int D = H > 0 ? org.telegram.messenger.q.D(16.0f, 2, H) : AndroidUtilities.dp(16.0f);
                                    this.f = D;
                                    StaticLayout staticLayout2 = this.m1;
                                    if (staticLayout2 != null) {
                                        this.f = org.telegram.messenger.q.C(10.0f, staticLayout2.getHeight(), D);
                                    }
                                    if (this.l1 != null) {
                                        this.f = AndroidUtilities.dp(15.0f) + this.f;
                                    }
                                    int i17 = this.f + height2;
                                    this.f = i17;
                                    float f16 = (this.V - this.D1) / f14;
                                    if (this.x1 != null) {
                                        this.h = AndroidUtilities.dp(7.0f) + i17 + dp8;
                                        rectF.set(f16 - AndroidUtilities.dp(18.0f), this.h, f16 + this.D1 + AndroidUtilities.dp(18.0f), org.telegram.messenger.q.D(f12, 2, this.x1.getHeight() + this.h));
                                        this.f = (int) (rectF.height() + AndroidUtilities.dp(4.0f) + this.f);
                                    } else if (!P() && (i13 = messageObject.type) != 34 && i13 != 33 && i13 != 35) {
                                        rectF.set(f16 - AndroidUtilities.dp(18.0f), this.h, f16 + this.D1 + AndroidUtilities.dp(18.0f), org.telegram.messenger.q.D(8.0f, 2, AndroidUtilities.dp(17.0f) + this.h));
                                        this.f = AndroidUtilities.dp(17.0f) + this.f;
                                    }
                                    int dp9 = AndroidUtilities.dp(15.0f) + this.f;
                                    this.f = dp9;
                                    int dp10 = AndroidUtilities.dp(6.0f) + dp8 + dp9;
                                    if (!o0Var.s) {
                                        int dp11 = AndroidUtilities.dp(8.0f) + o0Var.o;
                                        o0Var.p = dp11;
                                        dp10 += dp11;
                                    }
                                    r9 = dp10;
                                    if (this.Y1 != null) {
                                        r9 += AndroidUtilities.dp(44.0f);
                                    }
                                }
                                rectF.inset(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
                            }
                        } else {
                            f11 = 12.0f;
                        }
                        z10 = false;
                        int H2 = H(messageObject);
                        if (Q()) {
                        }
                        this.K1 = 0;
                        if (this.j1 == null) {
                        }
                        u0 u0Var22 = this.s1;
                        if (u0Var22 != null) {
                        }
                        if (this.s1 != null) {
                        }
                        if (this.l1 != null) {
                        }
                        int dp62 = this.K1 - AndroidUtilities.dp(z10 ? 14.0f : 0.0f);
                        this.K1 = dp62;
                        i12 += dp62;
                        int dp72 = AndroidUtilities.dp(14.0f) + this.O + i12;
                        staticLayout = this.x1;
                        RectF rectF2 = this.o0;
                        if (staticLayout == null) {
                        }
                        measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                        rg.v1 v1Var2 = this.V1;
                        v1Var2.a.set(rectF2);
                        v1Var2.b.set(rectF2);
                        if (this.W1 != measuredWidth) {
                        }
                        if (Q()) {
                        }
                        rectF2.inset(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
                    }
                    f13 = 24.0f;
                }
                if (this.P0 != null && !o0Var.s) {
                    int dp12 = AndroidUtilities.dp(8.0f) + o0Var.o;
                    o0Var.p = dp12;
                    i12 += dp12;
                }
                if (P()) {
                    i12 = org.telegram.messenger.q.C(f13, this.Q, i12);
                }
                if (messageObject == null && Q()) {
                    setMeasuredDimension(max, this.l0 + r9);
                } else {
                    setMeasuredDimension(max, AndroidUtilities.dp(14.0f) + this.l0 + this.O + i12);
                }
                o0Var.d = (getMeasuredHeight() - getPaddingTop()) - o0Var.p;
            }
            i12 = dp4 + i14;
            f10 = 140.0f;
            L = L();
            o0Var = this.E0;
            if (L) {
            }
            if (this.P0 != null) {
                int dp122 = AndroidUtilities.dp(8.0f) + o0Var.o;
                o0Var.p = dp122;
                i12 += dp122;
            }
            if (P()) {
            }
            if (messageObject == null) {
            }
            setMeasuredDimension(max, AndroidUtilities.dp(14.0f) + this.l0 + this.O + i12);
            o0Var.d = (getMeasuredHeight() - getPaddingTop()) - o0Var.p;
        }
        f7 = 30.0f;
        f10 = 140.0f;
        i12 = 0;
        L = L();
        o0Var = this.E0;
        if (L) {
        }
        if (this.P0 != null) {
        }
        if (P()) {
        }
        if (messageObject == null) {
        }
        setMeasuredDimension(max, AndroidUtilities.dp(14.0f) + this.l0 + this.O + i12);
        o0Var.d = (getMeasuredHeight() - getPaddingTop()) - o0Var.p;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        TLRPC.PhotoSize photoSize;
        MessageObject messageObject = this.P0;
        if (messageObject == null || messageObject.type != 11) {
            return;
        }
        int size = messageObject.photoThumbs.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                photoSize = null;
                break;
            }
            photoSize = messageObject.photoThumbs.get(i10);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                break;
            } else {
                i10++;
            }
        }
        this.I.setImage(this.x0, ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50_b", this.L, 0L, null, messageObject, 1);
        DownloadController.getInstance(this.H).removeLoadingFileObserver(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ae, code lost:
    
        if (r11.i != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02f7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        m50 m50Var;
        u0 u0Var;
        u0 u0Var2;
        TLRPC.Message message;
        boolean z11;
        boolean z12;
        boolean z13;
        StaticLayout staticLayout;
        boolean z14;
        ArrayList arrayList;
        boolean z15;
        boolean z16;
        TLRPC.Message message2;
        int i11;
        w0 w0Var;
        boolean z17;
        p0 p0Var;
        MessageObject messageObject = this.P0;
        float x10 = motionEvent.getX() - (this.j0 / 2.0f);
        this.y0 = x10;
        float y3 = motionEvent.getY() + getPaddingTop();
        this.z0 = y3;
        boolean z18 = true;
        if (messageObject == null) {
            if (this.e2 != null) {
                if (motionEvent.getAction() == 0) {
                    if (x10 >= this.a1 && x10 <= this.b1) {
                        this.F = true;
                        return true;
                    }
                } else if (this.F) {
                    if (motionEvent.getAction() == 1) {
                        this.e2.onClick(this);
                        this.F = false;
                    } else if (motionEvent.getAction() == 3) {
                        this.F = false;
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        g31 g31Var = this.n0;
        if (g31Var == null || !g31Var.d(motionEvent, false)) {
            iz0 iz0Var = this.O0;
            if (iz0Var != null) {
                bd bdVar = iz0Var.m;
                boolean contains = iz0Var.k.contains(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0) {
                    bdVar.c(contains);
                } else if (motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() == 1) {
                        if (bdVar.i) {
                            iz0Var.b();
                        }
                        bdVar.c(false);
                    } else if (motionEvent.getAction() == 3) {
                        bdVar.c(false);
                    }
                }
            }
            if (!L() || !this.H0.e(this.F0, this.G0, motionEvent)) {
                if (M()) {
                    org.telegram.ui.Wallet.d3 d3Var = this.I0;
                    float f7 = (this.j0 / 2.0f) + this.K0;
                    float paddingTop = this.L0 + getPaddingTop();
                    ArrayList arrayList2 = d3Var.c;
                    bd bdVar2 = d3Var.Y;
                    float x11 = motionEvent.getX() - f7;
                    float y10 = motionEvent.getY() - paddingTop;
                    w0 w0Var2 = d3Var.a;
                    if (motionEvent.getActionMasked() == 0) {
                        float x12 = motionEvent.getX() - f7;
                        float y11 = motionEvent.getY() - paddingTop;
                        org.telegram.ui.Wallet.c3 c3Var = d3Var.m;
                        if (c3Var != null && c3Var.h && d3Var.w.contains((int) x12, (int) y11)) {
                            if (!d3Var.D && d3Var.C <= 1.001f) {
                                d3Var.A = d3Var.g();
                                d3Var.B = d3Var.k.E * 0.14f;
                            }
                            ValueAnimator valueAnimator = d3Var.G;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                d3Var.G = null;
                            }
                            d3Var.D = false;
                            d3Var.x = motionEvent.getPointerId(0);
                            d3Var.y = motionEvent.getX();
                            d3Var.z = motionEvent.getY();
                            d3Var.r0 = false;
                            bdVar2.c(false);
                            if (w0Var2.getParent() != null) {
                                w0Var2.getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            d3Var.a(3.0f);
                            if (z18) {
                                if (this.I0.x != -1) {
                                    k();
                                    return true;
                                }
                                if (motionEvent.getAction() == 0) {
                                    this.A0 = motionEvent.getX();
                                    this.B0 = motionEvent.getY();
                                    r();
                                    return true;
                                }
                                if (motionEvent.getAction() != 2) {
                                    k();
                                    return true;
                                }
                                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                                if (Math.abs(motionEvent.getX() - this.A0) > scaledTouchSlop || Math.abs(motionEvent.getY() - this.B0) > scaledTouchSlop) {
                                    k();
                                    return true;
                                }
                            }
                        }
                        float dp = AndroidUtilities.dp(4.0f);
                        boolean z19 = x11 < dp && x11 <= ((float) AndroidUtilities.dp(206.0f)) - dp && y10 >= dp && y10 <= ((float) AndroidUtilities.dp(140.0f)) - dp;
                        if (d3Var.q0 != null) {
                            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = d3Var.l0;
                            if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !d3Var.m0) {
                                float dp2 = x11 - ((AndroidUtilities.dp(206.0f) - d3Var.q0.l()) / 2.0f);
                                float dp3 = y10 - AndroidUtilities.dp(143.0f);
                                int size = arrayList2.size();
                                int i12 = 0;
                                while (i12 < size) {
                                    Object obj = arrayList2.get(i12);
                                    i12++;
                                    w0Var = w0Var2;
                                    if (((vh.g) obj).getBounds().contains((int) dp2, (int) dp3)) {
                                        z17 = true;
                                        break;
                                    }
                                    w0Var2 = w0Var;
                                }
                            }
                        }
                        w0Var = w0Var2;
                        z17 = false;
                        boolean z20 = !z19 || z17;
                        if (motionEvent.getAction() != 0) {
                            d3Var.r0 = z20;
                            bdVar2.c(z20);
                        } else if (motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                                z18 = d3Var.r0;
                                boolean z21 = motionEvent.getAction() == 1 && z18 && z20;
                                d3Var.r0 = false;
                                bdVar2.c(false);
                                if (z21 && z17) {
                                    TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer2 = d3Var.l0;
                                    if (tL_messageActionGramTransfer2.comment_encrypted_preparing) {
                                        d3Var.m0 = true;
                                        l11 l11Var = d3Var.q0;
                                        l11Var.r(Emoji.replaceEmoji(tL_messageActionGramTransfer2.comment, l11Var.a.getFontMetricsInt(), false));
                                        d3Var.d.addAll(arrayList2);
                                        arrayList2.clear();
                                        w0Var.requestLayout();
                                        w0Var.invalidate();
                                        if (z18) {
                                        }
                                    }
                                }
                                if (z21 && (p0Var = d3Var.s0) != null) {
                                    p0Var.run();
                                }
                                if (z18) {
                                }
                            }
                            z18 = d3Var.r0;
                            if (z18) {
                            }
                        } else if (d3Var.r0) {
                            bdVar2.c(z20);
                        }
                        z18 = d3Var.r0;
                        if (z18) {
                        }
                    } else {
                        if (d3Var.x != -1) {
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked != 1) {
                                if (actionMasked == 2) {
                                    int findPointerIndex = motionEvent.findPointerIndex(d3Var.x);
                                    if (findPointerIndex < 0) {
                                        d3Var.j();
                                    } else {
                                        float radians = ((float) Math.toRadians(0.800000011920929d)) / AndroidUtilities.density;
                                        d3Var.A = com.google.android.gms.internal.vision.e2.y(motionEvent.getX(findPointerIndex), d3Var.y, radians, d3Var.A);
                                        d3Var.B = com.google.android.gms.internal.vision.e2.y(motionEvent.getY(findPointerIndex), d3Var.z, radians, d3Var.B);
                                        d3Var.y = motionEvent.getX(findPointerIndex);
                                        d3Var.z = motionEvent.getY(findPointerIndex);
                                        w0Var2.invalidate();
                                    }
                                } else if (actionMasked != 3) {
                                    if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == d3Var.x) {
                                        int i13 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                                        d3Var.x = motionEvent.getPointerId(i13);
                                        d3Var.y = motionEvent.getX(i13);
                                        d3Var.z = motionEvent.getY(i13);
                                    }
                                }
                                if (z18) {
                                }
                            }
                            d3Var.j();
                            if (z18) {
                            }
                        }
                        float dp4 = AndroidUtilities.dp(4.0f);
                        if (x11 < dp4) {
                        }
                        if (d3Var.q0 != null) {
                        }
                        w0Var = w0Var2;
                        z17 = false;
                        if (z19) {
                        }
                        if (motionEvent.getAction() != 0) {
                        }
                        z18 = d3Var.r0;
                        if (z18) {
                        }
                    }
                    return true;
                }
                if (!this.E0.c(motionEvent)) {
                    int action = motionEvent.getAction();
                    RectF rectF = this.o0;
                    ImageReceiver imageReceiver = this.I;
                    View view = this.T1;
                    bd bdVar3 = this.n;
                    if (action != 0) {
                        i10 = 4;
                        if (motionEvent.getAction() != 2) {
                            k();
                        }
                        if (this.F) {
                            if (motionEvent.getAction() == 2) {
                                if (x10 < this.a1 || x10 > this.b1) {
                                    z11 = false;
                                    this.F = false;
                                    z12 = z11;
                                }
                            } else if (motionEvent.getAction() == 1) {
                                View.OnClickListener onClickListener = this.e2;
                                if (onClickListener != null) {
                                    onClickListener.onClick(this);
                                }
                                this.F = false;
                            } else if (motionEvent.getAction() == 3) {
                                this.F = false;
                            }
                            z12 = false;
                        } else if (this.E) {
                            int action2 = motionEvent.getAction();
                            if (action2 == 1) {
                                this.E = false;
                                view.setPressed(false);
                                bdVar3.c(false);
                                if (this.f1 != null && messageObject.replyMessageObject != null && (message = messageObject.messageOwner) != null && zf.d.g(message.action, TLRPC.TL_messageActionTodoAppendTasks.class, TLRPC.TL_messageActionTodoCompletions.class, TLRPC.TL_messageActionSuggestedPostApproval.class, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                    this.f1.X(this, this.P0.getReplyMsgId());
                                } else if (this.o1 && !this.n1 && (u0Var2 = this.s1) != null) {
                                    int height = ((StaticLayout) u0Var2.f).getHeight() - this.p1;
                                    this.n1 = true;
                                    t0 t0Var = this.f1;
                                    if (t0Var != null) {
                                        t0Var.d0(this);
                                        if (getParent() instanceof qm0) {
                                            ((qm0) getParent()).v0(0, AndroidUtilities.dp(24.0f) + height, null);
                                            return true;
                                        }
                                    }
                                } else if (this.O0 != null && this.M1.contains(motionEvent.getX(), motionEvent.getY())) {
                                    this.O0.b();
                                    return true;
                                }
                            } else if (action2 == 2) {
                                u0 u0Var3 = this.s1;
                                if (u0Var3 == null || !this.o1) {
                                    this.E = false;
                                } else {
                                    RectF rectF2 = AndroidUtilities.rectTmp;
                                    float f10 = u0Var3.b;
                                    rectF2.set(f10, u0Var3.e, ((StaticLayout) u0Var3.f).getWidth() + f10, this.s1.e + ((StaticLayout) r8.f).getHeight());
                                    if (!rectF2.contains(x10, y3)) {
                                        this.E = false;
                                    }
                                }
                                z11 = true;
                                z12 = z11;
                            } else if (action2 == 3) {
                                this.E = false;
                                bdVar3.c(false);
                            }
                            z11 = false;
                            z12 = z11;
                        } else {
                            boolean z22 = this.a0;
                            int i14 = this.H;
                            if (z22) {
                                int action3 = motionEvent.getAction();
                                if (action3 == 1) {
                                    this.W = false;
                                    this.a0 = false;
                                    view.setPressed(false);
                                    bdVar3.c(false);
                                    if (this.f1 != null) {
                                        int i15 = messageObject.type;
                                        if (i15 == 37) {
                                            playSoundEffect(0);
                                            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                            if (U != null) {
                                                new fi.k0(U, ((TLRPC.TL_messageActionChangeCommunity) messageObject.messageOwner.action).community_id, null, null).show();
                                            }
                                        } else if (i15 == 31) {
                                            playSoundEffect(0);
                                            V();
                                        } else if (i15 == 25) {
                                            playSoundEffect(0);
                                            if (this.f1 != null) {
                                                AndroidUtilities.runOnUIThread(new la(2, this, (TLRPC.TL_messageActionGiftCode) this.P0.messageOwner.action));
                                            }
                                        } else if (i15 == 18) {
                                            playSoundEffect(0);
                                            U();
                                        } else if (i15 == 30) {
                                            playSoundEffect(0);
                                            V();
                                        } else {
                                            TLRPC.Message message3 = messageObject.messageOwner;
                                            if (message3 != null) {
                                                TLRPC.MessageAction messageAction = message3.action;
                                                if ((messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low) {
                                                    playSoundEffect(0);
                                                    MessageSuggestionParams obtainSuggestionOffer = this.P0.obtainSuggestionOffer();
                                                    zf.a aVar = obtainSuggestionOffer.amount;
                                                    if (aVar != null && aVar.a == zf.b.a) {
                                                        new yh.e7(getContext(), this.g1, obtainSuggestionOffer.amount.a(), 13, ng.d.h(i14, this.P0.getDialogId()), null, this.P0.getDialogId()).show();
                                                    }
                                                }
                                            }
                                            if (MessagesController.getInstance(i14).photoSuggestion.get(messageObject.messageOwner.local_id) == null) {
                                                if (this.y1) {
                                                    this.f1.o0(this);
                                                } else {
                                                    this.f1.w0(this);
                                                }
                                            }
                                        }
                                    }
                                } else if (action3 != 2) {
                                    if (action3 == 3) {
                                        this.W = false;
                                        this.a0 = false;
                                        view.setPressed(false);
                                        bdVar3.c(false);
                                    }
                                } else if (!O(messageObject) || (!rectF.contains(x10, y3) && !this.M1.contains(x10, y3))) {
                                    this.a0 = false;
                                    view.setPressed(false);
                                    bdVar3.c(false);
                                }
                            } else if (this.W) {
                                int action4 = motionEvent.getAction();
                                if (action4 == 1) {
                                    this.W = false;
                                    if (!this.o1 || this.n1 || (u0Var = this.s1) == null) {
                                        int i16 = messageObject.type;
                                        if (i16 == 31) {
                                            V();
                                        } else if (i16 == 25) {
                                            if (this.f1 != null) {
                                                AndroidUtilities.runOnUIThread(new la(2, this, (TLRPC.TL_messageActionGiftCode) this.P0.messageOwner.action));
                                            }
                                        } else if (i16 == 18) {
                                            U();
                                        } else if (i16 == 30) {
                                            V();
                                        } else if (this.f1 != null) {
                                            if (i16 != 21 || (m50Var = MessagesController.getInstance(i14).photoSuggestion.get(messageObject.messageOwner.local_id)) == null) {
                                                z10 = false;
                                            } else {
                                                m50Var.b();
                                                z10 = true;
                                            }
                                            if (!z10) {
                                                this.f1.o0(this);
                                                playSoundEffect(0);
                                            }
                                        }
                                    } else {
                                        int height2 = ((StaticLayout) u0Var.f).getHeight() - this.p1;
                                        this.n1 = true;
                                        t0 t0Var2 = this.f1;
                                        if (t0Var2 != null) {
                                            t0Var2.d0(this);
                                            if (getParent() instanceof qm0) {
                                                ((qm0) getParent()).v0(0, AndroidUtilities.dp(16.0f) + height2, null);
                                                return true;
                                            }
                                        }
                                    }
                                } else if (action4 != 2) {
                                    if (action4 == 3) {
                                        this.W = false;
                                    }
                                } else if (Q()) {
                                    if (!this.M1.contains(x10, y3)) {
                                        this.W = false;
                                    }
                                } else if (!imageReceiver.isInsideImage(x10, y3)) {
                                    this.W = false;
                                }
                            }
                            z12 = false;
                        }
                    } else if (this.f1 != null) {
                        if ((messageObject.type == 11 || O(messageObject)) && imageReceiver.isInsideImage(x10, y3)) {
                            this.W = true;
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (this.J1.i.q == 4 && (((i11 = messageObject.type) == 21 || i11 == 22) && this.M1.contains(x10, y3))) {
                            this.W = true;
                            z15 = true;
                        }
                        u0 u0Var4 = this.s1;
                        if (u0Var4 == null || !this.o1) {
                            i10 = 4;
                        } else {
                            RectF rectF3 = AndroidUtilities.rectTmp;
                            float f11 = u0Var4.b;
                            i10 = 4;
                            rectF3.set(f11, u0Var4.e, ((StaticLayout) u0Var4.f).getWidth() + f11, this.s1.e + ((StaticLayout) r6.f).getHeight());
                            if (rectF3.contains(x10, y3)) {
                                this.E = true;
                                z15 = true;
                            }
                        }
                        if (O(messageObject) && this.x1 != null && (rectF.contains(x10, y3) || (this.y1 && this.M1.contains(x10, y3)))) {
                            z16 = true;
                            this.a0 = true;
                            view.setPressed(true);
                            bdVar3.c(true);
                            z15 = true;
                        } else {
                            z16 = true;
                        }
                        if (!z15 && P()) {
                            this.E = z16;
                            z15 = true;
                        }
                        if (!z15) {
                            MessageObject messageObject2 = this.P0;
                            if (zf.d.g((messageObject2 == null || (message2 = messageObject2.messageOwner) == null) ? null : message2.action, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                this.E = true;
                                z15 = true;
                            }
                        }
                        if (z15) {
                            r();
                        }
                        z12 = z15;
                    } else {
                        i10 = 4;
                        z12 = false;
                    }
                    if (!z12 && (motionEvent.getAction() == 0 || ((this.x != null || this.y != null) && motionEvent.getAction() == 1))) {
                        u0 u0Var5 = this.s1;
                        if (u0Var5 != null && (arrayList = u0Var5.c) != null && !arrayList.isEmpty() && !this.G) {
                            ArrayList arrayList3 = this.s1.c;
                            int size2 = arrayList3.size();
                            int i17 = 0;
                            while (true) {
                                if (i17 >= size2) {
                                    break;
                                }
                                Object obj2 = arrayList3.get(i17);
                                i17++;
                                vh.g gVar = (vh.g) obj2;
                                Rect bounds = gVar.getBounds();
                                u0 u0Var6 = this.s1;
                                if (bounds.contains((int) (x10 - u0Var6.b), (int) (y3 - u0Var6.e))) {
                                    this.x = null;
                                    if (motionEvent.getAction() == 0) {
                                        this.y = gVar;
                                        z12 = true;
                                    } else {
                                        vh.g gVar2 = this.y;
                                        z13 = true;
                                        if (gVar == gVar2) {
                                            this.G = true;
                                            gVar2.q = new p0(this, i10);
                                            float sqrt = (float) Math.sqrt(Math.pow(((StaticLayout) this.s1.f).getHeight(), 2.0d) + Math.pow(((StaticLayout) this.s1.f).getWidth(), 2.0d));
                                            vh.g gVar3 = this.y;
                                            u0 u0Var7 = this.s1;
                                            gVar3.j((int) (x10 - u0Var7.b), (int) (y3 - u0Var7.e), sqrt, false);
                                            invalidate();
                                        }
                                        z12 = true;
                                    }
                                }
                            }
                        }
                        z13 = true;
                        if (!z12 && (staticLayout = this.M) != null) {
                            if (x10 >= this.R) {
                                float f12 = this.S;
                                if (y3 >= f12 && x10 <= r5 + this.N && y3 <= r6 + this.O) {
                                    float f13 = y3 - f12;
                                    float f14 = x10 - this.T;
                                    if (!z12) {
                                        int lineForVertical = staticLayout.getLineForVertical((int) f13);
                                        int offsetForHorizontal = this.M.getOffsetForHorizontal(lineForVertical, f14);
                                        float lineLeft = this.M.getLineLeft(lineForVertical);
                                        if (lineLeft <= f14 && this.M.getLineWidth(lineForVertical) + lineLeft >= f14) {
                                            CharSequence charSequence = messageObject.messageText;
                                            if (charSequence instanceof Spannable) {
                                                URLSpan[] uRLSpanArr = (URLSpan[]) ((Spannable) charSequence).getSpans(offsetForHorizontal, offsetForHorizontal, URLSpan.class);
                                                if (uRLSpanArr.length != 0) {
                                                    if (motionEvent.getAction() == 0) {
                                                        this.x = uRLSpanArr[0];
                                                    } else {
                                                        URLSpan uRLSpan = uRLSpanArr[0];
                                                        URLSpan uRLSpan2 = this.x;
                                                        if (uRLSpan == uRLSpan2) {
                                                            T(uRLSpan2);
                                                        }
                                                    }
                                                    z14 = z13;
                                                    z12 = z14;
                                                } else {
                                                    this.x = null;
                                                }
                                                z14 = z12;
                                                z12 = z14;
                                            }
                                        }
                                        this.x = null;
                                    }
                                }
                            }
                        }
                        this.x = null;
                    }
                    if (!z12) {
                        z12 = t(motionEvent);
                    }
                    return !z12 ? super.onTouchEvent(motionEvent) : z12;
                }
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x071d, code lost:
    
        if (r5 == false) goto L320;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        long j3;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence string;
        CharSequence charSequence3;
        boolean z10;
        CharSequence formatString;
        ArrayList<TLRPC.VideoSize> arrayList;
        TLRPC.Photo photo;
        ArrayList<TLRPC.VideoSize> arrayList2;
        CharSequence charSequence4;
        TL_stars.StarGift starGift;
        String str;
        CharSequence replaceTags;
        String str2;
        CharSequence charSequence5;
        String publicUsername;
        char c10;
        Object valueOf;
        TLRPC.Peer peer;
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        int i10;
        TLRPC.Chat chat;
        TLRPC.User user;
        CharSequence replaceCharSequence;
        TLRPC.MessageMedia messageMedia;
        MessageObject messageObject = this.P0;
        int i11 = this.H;
        if (messageObject == null) {
            j3 = 0;
            charSequence = this.R0;
        } else if (M()) {
            CharSequence l4 = org.telegram.ui.Wallet.k0.v(i11).l(((TLRPC.TL_messageActionGramTransfer) messageObject.messageOwner.action).amount, false);
            if (!TextUtils.isEmpty(l4)) {
                charSequence = LocaleController.formatSpannable(R.string.WalletTransferWorth, org.telegram.ui.Components.b6.cloneSpans(messageObject.messageText), l4);
                j3 = 0;
                if (charSequence == null) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    if (message2 == null || (messageMedia = message2.media) == null || messageMedia.ttl_seconds == 0) {
                        charSequence = org.telegram.ui.Components.b6.cloneSpans(messageObject.messageText);
                    } else if (messageMedia.photo != null) {
                        charSequence = LocaleController.getString(R.string.AttachPhotoExpired);
                    } else {
                        TLRPC.Document document = messageMedia.document;
                        charSequence = ((document instanceof TLRPC.TL_documentEmpty) || ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && document == null)) ? messageMedia.voice ? LocaleController.getString(R.string.AttachVoiceExpired) : messageMedia.round ? LocaleController.getString(R.string.AttachRoundExpired) : LocaleController.getString(R.string.AttachVideoExpired) : org.telegram.ui.Components.b6.cloneSpans(messageObject.messageText);
                    }
                }
            }
            j3 = 0;
            charSequence = null;
            if (charSequence == null) {
            }
        } else {
            if (messageObject.isExpiredStory()) {
                charSequence = messageObject.messageOwner.media.user_id != UserConfig.getInstance(i11).getClientUserId() ? ai.ja.e(R.string.ExpiredStoryMention, true, new Object[0]) : ai.ja.e(R.string.ExpiredStoryMentioned, true, MessagesController.getInstance(i11).getUser(Long.valueOf(messageObject.getDialogId())).first_name);
            } else {
                t0 t0Var = this.f1;
                if (t0Var != null && t0Var.d() == 0 && MessageObject.isTopicActionMessage(messageObject)) {
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i11).getTopicsController().findTopic(-messageObject.getDialogId(), MessageObject.getTopicId(i11, messageObject.messageOwner, true));
                    int i12 = ng.d.a;
                    if (findTopic != null) {
                        TLRPC.MessageAction messageAction2 = messageObject.messageOwner.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionTopicCreate) {
                            charSequence = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.TopicWasCreatedAction), ng.d.j(findTopic, null, null));
                        } else if (messageAction2 instanceof TLRPC.TL_messageActionTopicEdit) {
                            TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction2;
                            long fromChatId = messageObject.getFromChatId();
                            if (DialogObject.isUserDialog(fromChatId)) {
                                user = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(fromChatId));
                                chat = null;
                            } else {
                                chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-fromChatId));
                                user = null;
                            }
                            String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : chat != null ? chat.title : null;
                            int i13 = tL_messageActionTopicEdit.flags;
                            if ((i13 & 8) != 0) {
                                charSequence = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(tL_messageActionTopicEdit.hidden ? R.string.TopicHidden2 : R.string.TopicShown2), formatName);
                            } else {
                                j3 = 0;
                                if ((i13 & 4) != 0) {
                                    replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(tL_messageActionTopicEdit.closed ? R.string.TopicWasClosedAction : R.string.TopicWasReopenedAction), ng.d.j(findTopic, null, null)), formatName);
                                } else {
                                    int i14 = i13 & 1;
                                    if (i14 != 0 && (i13 & 2) != 0) {
                                        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                                        tL_forumTopic.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                        tL_forumTopic.title = tL_messageActionTopicEdit.title;
                                        replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasRenamedToAction2), ng.d.j(tL_forumTopic, null, null)), formatName);
                                    } else if (i14 != 0) {
                                        replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasRenamedToAction), tL_messageActionTopicEdit.title), formatName);
                                    } else {
                                        if ((i13 & 2) != 0) {
                                            TLRPC.TL_forumTopic tL_forumTopic2 = new TLRPC.TL_forumTopic();
                                            tL_forumTopic2.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                            tL_forumTopic2.title = "";
                                            replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasIconChangedToAction), ng.d.j(tL_forumTopic2, null, null)), formatName);
                                        }
                                        charSequence = null;
                                        if (charSequence == null) {
                                        }
                                    }
                                }
                                charSequence = replaceCharSequence;
                                if (charSequence == null) {
                                }
                            }
                        }
                    }
                }
                j3 = 0;
                charSequence = null;
                if (charSequence == null) {
                }
            }
            j3 = 0;
            if (charSequence == null) {
            }
        }
        MessageObject messageObject2 = this.P0;
        CharSequence charSequence6 = (messageObject2 == null || !messageObject2.isRepostPreview) ? charSequence : "";
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null && (messageAction = message.action) != null) {
            if (messageAction instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                i10 = R.drawable.mini_checklist_add;
            } else if (messageAction instanceof TLRPC.TL_messageActionTodoCompletions) {
                TLRPC.TL_messageActionTodoCompletions tL_messageActionTodoCompletions = (TLRPC.TL_messageActionTodoCompletions) messageAction;
                i10 = tL_messageActionTodoCompletions.incompleted.size() > tL_messageActionTodoCompletions.completed.size() ? R.drawable.mini_checklist_undone : R.drawable.mini_checklist_done;
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence6);
                spannableStringBuilder.insert(0, (CharSequence) "i ");
                spannableStringBuilder.setSpan(new er(i10, 0), 0, 1, 33);
                charSequence6 = spannableStringBuilder;
            }
        }
        y(this.V, charSequence6);
        if (this.O0 != null) {
            this.M = null;
            this.O = 0;
            this.P = null;
            this.Q = 0;
            this.S = 0;
        }
        if (messageObject != null) {
            TLRPC.Message message3 = messageObject.messageOwner;
            if (message3 != null) {
                TLRPC.MessageAction messageAction3 = message3.action;
                if ((messageAction3 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction3).balance_too_low) {
                    x(null, null, charSequence6, false, !ChatObject.canManageMonoForum(i11, messageObject.getDialogId()) ? LocaleController.getString(R.string.StarsBuy) : null, 11, null, this.i1, false);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
                }
            }
            CharSequence charSequence7 = charSequence6;
            if (message3 != null) {
                TLRPC.MessageAction messageAction4 = message3.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction4).rejected) {
                    x(null, null, charSequence7, false, null, 11, null, this.i1, false);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
                }
            }
            int i15 = messageObject.type;
            if (i15 == 11) {
                float dp = AndroidUtilities.dp(19.0f) + this.O;
                float f7 = AndroidUtilities.roundMessageSize;
                this.I.setImageCoords((this.V - AndroidUtilities.roundMessageSize) / 2.0f, dp, f7, f7);
            } else if (i15 == 25) {
                w();
            } else {
                TextPaint textPaint = this.F1;
                if (i15 == 30) {
                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(this.P0.getDialogId()));
                    TLRPC.MessageAction messageAction5 = messageObject.messageOwner.action;
                    if (messageAction5 instanceof TLRPC.TL_messageActionGiftStars) {
                        x(LocaleController.formatPluralStringComma("ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction5).stars), null, AndroidUtilities.replaceTags(this.P0.isOutOwner() ? LocaleController.formatString(R.string.ActionGiftStarsSubtitle, UserObject.getForcedFirstName(user2)) : LocaleController.getString(R.string.ActionGiftStarsSubtitleYou)), false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.i1, true);
                    } else if ((messageAction5 instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction5).refunded) {
                        long clientUserId = UserConfig.getInstance(i11).getClientUserId();
                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action;
                        if (messageObject.isOutOwner() != (!tL_messageActionStarGiftUnique.upgrade)) {
                            clientUserId = messageObject.getDialogId();
                        }
                        TLRPC.User user3 = MessagesController.getInstance(i11).getUser(Long.valueOf(clientUserId));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        spannableStringBuilder2.append((CharSequence) LocaleController.getString(tL_messageActionStarGiftUnique.prepaid_upgrade ? R.string.Gift2ActionUpgradeTitle : R.string.Gift2ActionTitle)).append((CharSequence) " ");
                        if (user3 != null && user3.photo != null) {
                            spannableStringBuilder2.append((CharSequence) "a ");
                            org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(this, 18.0f, i11);
                            g5Var.e(user3);
                            spannableStringBuilder2.setSpan(g5Var, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 33);
                        }
                        spannableStringBuilder2.append((CharSequence) UserObject.getForcedFirstName(user3));
                        x(spannableStringBuilder2, null, LocaleController.getString(R.string.Gift2ActionUpgradeRefundedText), false, LocaleController.getString(R.string.ActionGiftStarsView), 12, LocaleController.getString(R.string.Gift2UniqueRibbon), this.i1, true);
                    } else if (messageAction5 instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction5;
                        long j10 = tL_messageActionStarGift.convert_stars;
                        long clientUserId2 = UserConfig.getInstance(i11).getClientUserId();
                        TLRPC.Peer peer2 = tL_messageActionStarGift.peer;
                        boolean z11 = peer2 != null && (!tL_messageActionStarGift.prepaid_upgrade || (peer2 instanceof TLRPC.TL_peerChannel));
                        boolean z12 = messageObject.getDialogId() == clientUserId2 && !z11;
                        long fromChatId2 = messageObject.getFromChatId();
                        if (!tL_messageActionStarGift.prepaid_upgrade && (peer = tL_messageActionStarGift.from_id) != null) {
                            fromChatId2 = DialogObject.getPeerDialogId(peer);
                        }
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(fromChatId2);
                        long peerDialogId = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                        boolean z13 = z11;
                        TLObject userOrChat2 = MessagesController.getInstance(i11).getUserOrChat(peerDialogId);
                        boolean z14 = tL_messageActionStarGift.can_upgrade && !tL_messageActionStarGift.converted && tL_messageActionStarGift.upgrade_stars > j3 && !tL_messageActionStarGift.upgraded;
                        if (peerDialogId != j3 && tL_messageActionStarGift.auction_acquired && userOrChat2 != null) {
                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTitleTo)).append((CharSequence) " ");
                            if (DialogObject.hasPhoto(userOrChat2)) {
                                spannableStringBuilder3.append((CharSequence) "a ");
                                org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(this, 18.0f, i11);
                                int i16 = g5Var2.e;
                                org.telegram.ui.Components.j9 j9Var = g5Var2.c;
                                j9Var.j(i16, userOrChat2);
                                g5Var2.b.setForUserOrChat(userOrChat2, j9Var);
                                spannableStringBuilder3.setSpan(g5Var2, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                            }
                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat2));
                        } else if (!z12) {
                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(tL_messageActionStarGift.prepaid_upgrade ? R.string.Gift2ActionUpgradeTitle : R.string.Gift2ActionTitle)).append((CharSequence) " ");
                            if (DialogObject.hasPhoto(userOrChat)) {
                                spannableStringBuilder3.append((CharSequence) "a ");
                                org.telegram.ui.g5 g5Var3 = new org.telegram.ui.g5(this, 18.0f, i11);
                                int i17 = g5Var3.e;
                                org.telegram.ui.Components.j9 j9Var2 = g5Var3.c;
                                j9Var2.j(i17, userOrChat);
                                g5Var3.b.setForUserOrChat(userOrChat, j9Var2);
                                spannableStringBuilder3.setSpan(g5Var3, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                            }
                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                        } else if (tL_messageActionStarGift.gift_num <= 0 || (starGift = tL_messageActionStarGift.gift) == null || (str = starGift.title) == null) {
                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                        } else {
                            spannableStringBuilder3.append((CharSequence) str).append((CharSequence) " #").append((CharSequence) LocaleController.formatNumber(tL_messageActionStarGift.gift_num, ','));
                        }
                        boolean z15 = ((messageObject.isOutOwner() && !z12) || !tL_messageActionStarGift.converted) && tL_messageActionStarGift.convert_stars > j3 && MessagesController.getInstance(i11).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(i11).getCurrentTime() - messageObject.messageOwner.date) > 0 && !tL_messageActionStarGift.refunded;
                        if (tL_messageActionStarGift.refunded) {
                            replaceTags = LocaleController.getString(R.string.Gift2ActionConvertRefundedText);
                        } else {
                            TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                                MessageObject.addEntitiesToText(spannableStringBuilder4, tL_messageActionStarGift.message.entities, false, false, true, true);
                                replaceTags = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder4, textPaint.getFontMetricsInt(), false, (int[]) null), tL_messageActionStarGift.message.entities, textPaint.getFontMetricsInt());
                            } else if (tL_messageActionStarGift.auction_acquired) {
                                replaceTags = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                            } else if (z13) {
                                replaceTags = tL_messageActionStarGift.converted ? LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j10) : (!z15 || j10 <= j3) ? AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert)) : AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfoChannel", (int) j10));
                            } else if (z12) {
                                replaceTags = (!tL_messageActionStarGift.converted || j10 <= j3) ? tL_messageActionStarGift.can_upgrade ? AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert)) : LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j10);
                            } else if (z14) {
                                replaceTags = AndroidUtilities.replaceTags(messageObject.isOutOwner() ? LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user2)) : LocaleController.getString(R.string.Gift2ActionUpgrade));
                            } else {
                                replaceTags = messageObject.isOutOwner() ? (!z15 || j10 <= j3) ? tL_messageActionStarGift.can_upgrade ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user2))) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user2))) : AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionOutInfo", (int) j10, UserObject.getForcedFirstName(user2))) : tL_messageActionStarGift.converted ? LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j10) : tL_messageActionStarGift.saved ? !z15 ? LocaleController.getString(R.string.Gift2ActionBotSavedInfo) : LocaleController.getString(R.string.Gift2ActionSavedInfo) : !z15 ? LocaleController.getString(R.string.Gift2ActionBotInfo) : AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j10));
                            }
                        }
                        CharSequence charSequence8 = replaceTags;
                        TL_stars.StarGift starGift2 = tL_messageActionStarGift.gift;
                        if (starGift2 == null || !starGift2.limited) {
                            str2 = null;
                        } else {
                            int i18 = R.string.Gift2Limited1OfRibbon;
                            int i19 = starGift2.availability_total;
                            if (i19 > 1500) {
                                c10 = 0;
                                valueOf = AndroidUtilities.formatWholeNumber(i19, 0);
                            } else {
                                c10 = 0;
                                valueOf = Integer.valueOf(i19);
                            }
                            Object[] objArr = new Object[1];
                            objArr[c10] = valueOf;
                            str2 = LocaleController.formatString(i18, objArr);
                        }
                        CharSequence string2 = LocaleController.getString(R.string.ActionGiftStarsView);
                        if (messageObject.isOutOwner()) {
                            charSequence5 = string2;
                            if (!tL_messageActionStarGift.forceIn) {
                            }
                        }
                        charSequence5 = string2;
                        charSequence5 = string2;
                        if (!messageObject.isOutOwner() && z14) {
                            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                            spannableStringBuilder5.append("^  ");
                            er erVar = new er(R.drawable.gift_unpack, 0);
                            erVar.setScale(0.8f, 0.8f);
                            spannableStringBuilder5.setSpan(erVar, 0, 1, 33);
                            spannableStringBuilder5.append(LocaleController.getString(R.string.Gift2Unpack));
                            charSequence5 = spannableStringBuilder5;
                        }
                        CharSequence charSequence9 = charSequence5;
                        TL_stars.StarGift starGift3 = tL_messageActionStarGift.gift;
                        x(spannableStringBuilder3, (starGift3 == null || starGift3.released_by == null || (publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i11).getUserOrChat(DialogObject.getPeerDialogId(tL_messageActionStarGift.gift.released_by)))) == null) ? null : yh.s3.h2(LocaleController.formatString(R.string.Gift2ActionReleasedBy, "@".concat(publicUsername))), charSequence8, false, charSequence9, 11, str2, this.i1, true);
                    } else if (messageAction5 instanceof TLRPC.TL_messageActionGiftTon) {
                        x(LocaleController.getString(R.string.ActionGiftTonTitle), null, this.P0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.i1, true);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    } else {
                        x(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, this.P0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.i1, true);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    }
                } else if (i15 == 33) {
                    TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message3.action;
                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(charSequence7);
                    spannableStringBuilder6.append((CharSequence) "\n\n");
                    if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                        spannableStringBuilder6.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusAccepted)));
                    } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                        spannableStringBuilder6.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusRejected)));
                    } else {
                        int max = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(i11).getCurrentTime());
                        if (max == 0) {
                            spannableStringBuilder6.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusExpired)));
                        } else {
                            String formatShortDuration2 = LocaleController.formatShortDuration2(max);
                            if (formatShortDuration2.endsWith(".")) {
                                formatShortDuration2 = com.google.android.gms.internal.vision.e2.i(1, 0, formatShortDuration2);
                            }
                            spannableStringBuilder6.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferStatusPending, formatShortDuration2)));
                        }
                    }
                    x(null, null, spannableStringBuilder6, false, null, 11, null, this.i1, false);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
                } else if (i15 == 34) {
                    x(null, null, charSequence7, false, null, 11, null, this.i1, false);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
                } else if (i15 == 35) {
                    TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message3.action;
                    SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                    String shortName = DialogObject.getShortName(MessagesController.getInstance(i11).getUser(Long.valueOf(messageObject.getDialogId())));
                    if (tL_messageActionNoForwardsRequest.new_value) {
                        spannableStringBuilder7.append(messageObject.isOut() ? LocaleController.getString(R.string.SharingOfferDisableHeaderYou) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferDisableHeaderOther, shortName)));
                    } else {
                        spannableStringBuilder7.append(messageObject.isOut() ? LocaleController.getString(R.string.SharingOfferEnableHeaderYou) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferEnableHeaderOther, shortName)));
                    }
                    if (tL_messageActionNoForwardsRequest.new_value) {
                        spannableStringBuilder7.append((CharSequence) "\n\n");
                        spannableStringBuilder7.append((CharSequence) z(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable1)));
                        spannableStringBuilder7.append((CharSequence) "\n\n");
                        spannableStringBuilder7.append((CharSequence) z(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable2)));
                        spannableStringBuilder7.append((CharSequence) "\n\n");
                        spannableStringBuilder7.append((CharSequence) z(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable3)));
                        spannableStringBuilder7.append((CharSequence) "\n\n");
                        spannableStringBuilder7.append((CharSequence) z(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable4)));
                    } else {
                        spannableStringBuilder7.append((CharSequence) "\n\n");
                        spannableStringBuilder7.append((CharSequence) z(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable1)));
                        spannableStringBuilder7.append((CharSequence) "\n\n");
                        spannableStringBuilder7.append((CharSequence) z(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable2)));
                        spannableStringBuilder7.append((CharSequence) "\n\n");
                        spannableStringBuilder7.append((CharSequence) z(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable3)));
                        spannableStringBuilder7.append((CharSequence) "\n\n");
                        spannableStringBuilder7.append((CharSequence) z(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable4)));
                    }
                    x(null, null, spannableStringBuilder7, false, null, 11, null, this.i1, false);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
                } else if (i15 == 31) {
                    TL_stars.StarGift starGift4 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message3.action).theme).gift;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(starGift4.title);
                    sb2.append(" #");
                    String h = org.telegram.messenger.q.h(starGift4.num, ',', sb2);
                    long fromChatId3 = messageObject.getFromChatId();
                    x(null, null, AndroidUtilities.replaceTags(UserConfig.getInstance(i11).getClientUserId() == fromChatId3 ? LocaleController.formatString(R.string.GiftThemesSetByYou, h) : LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(i11, fromChatId3), h)), false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.i1, true);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
                } else if (i15 == 37) {
                    TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message3.action;
                    long peerDialogId2 = DialogObject.getPeerDialogId(message3.peer_id);
                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(-peerDialogId2, i11);
                    boolean z16 = peerDialogId2 > j3;
                    String shortName2 = DialogObject.getShortName(i11, DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                    String shortName3 = DialogObject.getShortName(i11, -tL_messageActionChangeCommunity.community_id);
                    SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                    spannableStringBuilder8.append((CharSequence) fi.u0.a(messageObject, shortName3, shortName2, isChannelAndNotMegaGroup, z16));
                    x(null, null, spannableStringBuilder8, false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.i1, true);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
                } else if (i15 == 18) {
                    TLRPC.MessageAction messageAction6 = message3.action;
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = messageAction6 instanceof TLRPC.TL_messageActionGiftPremium ? ((TLRPC.TL_messageActionGiftPremium) messageAction6).message : messageAction6 instanceof TLRPC.TL_messageActionGiftCode ? ((TLRPC.TL_messageActionGiftCode) messageAction6).message : null;
                    if (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) {
                        charSequence4 = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder(tL_textWithEntities2.text);
                        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                        MessageObject.addEntitiesToText(spannableStringBuilder9, tL_textWithEntities2.entities, false, false, true, true);
                        charSequence4 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder9, textPaint.getFontMetricsInt(), false, (int[]) null), tL_textWithEntities2.entities, textPaint.getFontMetricsInt());
                    }
                    if (charSequence4 == null) {
                        charSequence4 = LocaleController.getString(R.string.ActionGiftPremiumText);
                    }
                    CharSequence charSequence10 = charSequence4;
                    MessageObject messageObject3 = this.P0;
                    CharSequence string3 = LocaleController.getString((messageObject3 == null || !(messageObject3.messageOwner.action instanceof TLRPC.TL_messageActionGiftCode) || R()) ? R.string.ActionGiftPremiumView : R.string.GiftPremiumUseGiftBtn);
                    TLRPC.MessageAction messageAction7 = messageObject.messageOwner.action;
                    int i20 = messageAction7.months;
                    if (i20 >= 1) {
                        x(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", i20), null, charSequence10, true, string3, 11, null, this.i1, false);
                    } else {
                        x(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2Days", messageAction7.days), null, charSequence10, true, string3, 11, null, this.i1, false);
                    }
                } else if (i15 == 21) {
                    TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                    TLRPC.User user4 = MessagesController.getInstance(i11).getUser(Long.valueOf(messageObject.isOutOwner() ? j3 : messageObject.getDialogId()));
                    boolean z17 = tL_messageActionSuggestProfilePhoto.video || !((photo = tL_messageActionSuggestProfilePhoto.photo) == null || (arrayList2 = photo.video_sizes) == null || arrayList2.isEmpty());
                    if (user4.id == UserConfig.getInstance(i11).clientUserId) {
                        TLRPC.User user5 = MessagesController.getInstance(i11).getUser(Long.valueOf(messageObject.getDialogId()));
                        formatString = z17 ? LocaleController.formatString(R.string.ActionSuggestVideoFromYouDescription, user5.first_name) : LocaleController.formatString(R.string.ActionSuggestPhotoFromYouDescription, user5.first_name);
                    } else {
                        formatString = z17 ? LocaleController.formatString(R.string.ActionSuggestVideoToYouDescription, user4.first_name) : LocaleController.formatString(R.string.ActionSuggestPhotoToYouDescription, user4.first_name);
                    }
                    x(null, null, formatString, false, (tL_messageActionSuggestProfilePhoto.video || !((arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes) == null || arrayList.isEmpty())) ? LocaleController.getString(R.string.ViewVideoAction) : LocaleController.getString(R.string.ViewPhotoAction), 11, null, this.i1, true);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
                } else if (i15 == 22) {
                    TLRPC.User user6 = MessagesController.getInstance(i11).getUser(Long.valueOf(messageObject.isOutOwner() ? j3 : messageObject.getDialogId()));
                    if (messageObject.getDialogId() < j3) {
                        charSequence3 = messageObject.messageText;
                    } else if (!messageObject.isOutOwner() && messageObject.isWallpaperForBoth() && messageObject.isCurrentWallpaper()) {
                        charSequence2 = messageObject.messageText;
                        string = LocaleController.getString(R.string.RemoveWallpaperAction);
                        z10 = false;
                        x(null, null, charSequence2, false, string, 11, null, this.i1, z10);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    } else if (user6 == null || user6.id != UserConfig.getInstance(i11).clientUserId) {
                        charSequence2 = messageObject.messageText;
                        string = LocaleController.getString(R.string.ViewWallpaperAction);
                        z10 = true;
                        x(null, null, charSequence2, false, string, 11, null, this.i1, z10);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    } else {
                        charSequence3 = messageObject.messageText;
                    }
                    charSequence2 = charSequence3;
                    string = null;
                    z10 = true;
                    x(null, null, charSequence2, false, string, 11, null, this.i1, z10);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
                } else if (messageObject.isStoryMention()) {
                    TLRPC.User user7 = MessagesController.getInstance(i11).getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
                    x(null, null, user7.self ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(i11).getUser(Long.valueOf(messageObject.getDialogId())).first_name)) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryMentionedTitle, user7.first_name)), false, LocaleController.getString(R.string.StoryMentionedAction), 11, null, this.i1, true);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
                }
            }
        }
        int dp2 = AndroidUtilities.dp(12.0f);
        zg.o0 o0Var = this.E0;
        o0Var.c = dp2;
        o0Var.p(this.V - AndroidUtilities.dp(24.0f), 1);
    }

    public void setCustomText(CharSequence charSequence) {
        this.R0 = charSequence;
        if (charSequence != null) {
            b0(false);
        }
    }

    public void setDelegate(t0 t0Var) {
        this.f1 = t0Var;
    }

    public void setInvalidateColors(boolean z10) {
        if (this.e1 == z10) {
            return;
        }
        this.e1 = z10;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.o2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.v = view;
    }

    public void setInvalidatesParent(boolean z10) {
        this.n2 = z10;
    }

    public void setMessageObject(MessageObject messageObject) {
        Y(messageObject, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.e2 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i10) {
        this.f2 = i10;
    }

    public void setScrimReaction(Integer num) {
        this.E0.C = num;
    }

    public void setShowTopic(boolean z10) {
        if (this.m0 != z10) {
            this.m0 = z10;
            N();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        this.J0 = z10;
        org.telegram.ui.Wallet.d3 d3Var = this.I0;
        if (d3Var != null) {
            d3Var.n(z10);
        }
        ArrayList arrayList = this.p0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((vh.g) obj).invalidateSelf();
        }
    }

    public void setWalletSlidingOffset(float f7) {
        setTranslationX((getTranslationX() - this.M0) + f7);
        this.M0 = f7;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0355  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(MotionEvent motionEvent) {
        int i10;
        int i11;
        BotInlineKeyboard.ButtonCustom buttonCustom;
        MessageObject messageObject;
        TLRPC.Message message;
        MessageObject messageObject2;
        TLRPC.Message message2;
        TLRPC.Message message3;
        char c10;
        int i12;
        long j3;
        TLObject chat;
        String str;
        Context context;
        boolean z10;
        String formatString;
        SpannableStringBuilder replaceTags;
        boolean z11;
        ArrayList arrayList = this.X1;
        if (!arrayList.isEmpty()) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            float width = (getWidth() - this.i1) / 2.0f;
            float f7 = 4.0f;
            float dp = AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(4.0f) + this.S + this.O + this.f;
            float dp2 = (this.i1 - AndroidUtilities.dp(4.0f)) / 2.0f;
            int action = motionEvent.getAction();
            org.telegram.ui.ActionBar.e6 e6Var = this.g1;
            if (action == 0) {
                this.l2 = -1;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    e0 e0Var = (e0) arrayList.get(i13);
                    float dp3 = ((AndroidUtilities.dp(f7) + dp2) * i13) + width;
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(dp3, dp, dp3 + dp2, e0Var.f + dp);
                    float f10 = x10;
                    float f11 = y3;
                    if (rectF.contains(f10, f11)) {
                        this.l2 = i13;
                        N();
                        if (e0Var.s == null) {
                            z Z = org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.nc, e6Var), 6, 6);
                            e0Var.s = Z;
                            Z.setCallback(this);
                        }
                        e0Var.s.setHotspot(f10, f11);
                        e0Var.s.setState(this.k2);
                        e0Var.b(!e0Var.m);
                        return true;
                    }
                    i13++;
                    f7 = 4.0f;
                }
            } else {
                int i14 = 3;
                if (motionEvent.getAction() == 1) {
                    if (this.l2 != -1) {
                        playSoundEffect(0);
                        e0 e0Var2 = (e0) arrayList.get(this.l2);
                        z zVar = e0Var2.s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        e0Var2.b(false);
                        if (this.f1 == null || e0Var2.m || (buttonCustom = e0Var2.j) == null) {
                            i11 = -1;
                        } else {
                            if (getMessageObject() != null) {
                                int i15 = buttonCustom.id;
                                if (i15 == 5) {
                                    t0 t0Var = this.f1;
                                    org.telegram.ui.ActionBar.n2 T0 = t0Var != null ? t0Var.T0() : null;
                                    if (T0 != null && this.P0 != null) {
                                        org.telegram.ui.Components.g5.u0(T0, LocaleController.getString(R.string.GiftOfferRejectConfirmTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferRejectConfirmText, DialogObject.getShortName(this.P0.getDialogId()))), LocaleController.getString(R.string.GiftOfferRejectConfirmConfirm), true, new la(i14, this, T0));
                                    }
                                } else if (i15 == 6) {
                                    MessageObject messageObject3 = this.P0;
                                    if (messageObject3 != null && (message3 = messageObject3.messageOwner) != null) {
                                        TLRPC.MessageAction messageAction = message3.action;
                                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                            TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction;
                                            org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                                            Context context2 = getContext();
                                            long dialogId = this.P0.getDialogId();
                                            int id2 = this.P0.getId();
                                            int[] iArr = yh.y.w0;
                                            zf.a m10 = zf.a.m(tL_messageActionStarGiftPurchaseOffer.price);
                                            zf.b bVar = m10.a;
                                            int i16 = this.H;
                                            zf.b bVar2 = zf.b.a;
                                            if (bVar == bVar2) {
                                                c10 = 3;
                                                i12 = MessagesController.getInstance(i16).config.starsStarGiftResaleCommissionPermille.get();
                                            } else {
                                                c10 = 3;
                                                i12 = MessagesController.getInstance(i16).config.tonStarGiftResaleCommissionPermille.get();
                                            }
                                            zf.a i17 = zf.a.i((m10.b * i12) / 1000, bVar);
                                            TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(starGift.title);
                                            sb2.append(" #");
                                            String h = org.telegram.messenger.q.h(starGift.num, ',', sb2);
                                            if (dialogId >= 0) {
                                                j3 = 0;
                                                chat = MessagesController.getInstance(i16).getUser(Long.valueOf(dialogId));
                                            } else {
                                                j3 = 0;
                                                chat = MessagesController.getInstance(i16).getChat(Long.valueOf(-dialogId));
                                            }
                                            String d = m10.d();
                                            String d10 = i17.d();
                                            if (bVar == zf.b.b) {
                                                str = h;
                                                context = context2;
                                                z10 = true;
                                            } else {
                                                str = h;
                                                context = context2;
                                                z10 = false;
                                            }
                                            LinearLayout e7 = bi.e(context, 1);
                                            e7.addView(new yh.v2(context, starGift, chat), w7.x5.t(-1, -2, 48, 0, -4, 0, 0));
                                            TextView textView = new TextView(context);
                                            bi.o(org.telegram.ui.ActionBar.i6.j5, e6Var, textView, 1, 16.0f);
                                            if (bVar == bVar2) {
                                                int i18 = R.string.GiftOfferTransferInfoTextSellStars;
                                                String shortName = DialogObject.getShortName(dialogId);
                                                Object[] objArr = new Object[4];
                                                objArr[0] = d;
                                                objArr[1] = shortName;
                                                objArr[2] = str;
                                                objArr[c10] = d10;
                                                formatString = LocaleController.formatString(i18, objArr);
                                            } else {
                                                int i19 = R.string.GiftOfferTransferInfoTextSellTON;
                                                String shortName2 = DialogObject.getShortName(dialogId);
                                                Object[] objArr2 = new Object[4];
                                                objArr2[0] = d;
                                                objArr2[1] = shortName2;
                                                objArr2[2] = str;
                                                objArr2[c10] = d10;
                                                formatString = LocaleController.formatString(i19, objArr2);
                                            }
                                            textView.setText(AndroidUtilities.replaceTags(formatString));
                                            e7.addView(textView, w7.x5.t(-1, -2, 48, 24, 4, 24, 4));
                                            FrameLayout frameLayout = new FrameLayout(context);
                                            frameLayout.setClipChildren(false);
                                            frameLayout.setClipToPadding(false);
                                            r01 r01Var = new r01(context, e6Var);
                                            frameLayout.addView(r01Var, w7.x5.e(-1, -1, 119));
                                            yh.s3.r1(r01Var, yh.m5.l(starGift.attributes, TL_stars.starGiftAttributeModel.class));
                                            yh.s3.r1(r01Var, yh.m5.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                            yh.s3.r1(r01Var, yh.m5.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                            e7.addView(frameLayout, w7.x5.t(-1, -2, 48, 23, 16, 23, 4));
                                            zf.a j10 = zf.a.j(starGift.value_usd_amount / Math.pow(10.0d, BillingController.getInstance().getCurrencyExp("USD")), bVar);
                                            if (j10.c() > 0.0d && starGift.value_usd_amount > j3) {
                                                if (j10.b >= i17.b) {
                                                    int round = (int) Math.round((1.0d - (i17.c() / j10.c())) * 100.0d);
                                                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferAmountLowerHint2, a1.g.n(round, "%"), starGift.title));
                                                    if (round > 10) {
                                                        z11 = true;
                                                        TextView textView2 = new TextView(context);
                                                        textView2.setTextSize(1, 13.0f);
                                                        textView2.setGravity(17);
                                                        textView2.setText(replaceTags);
                                                        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(!z11 ? org.telegram.ui.ActionBar.i6.p7 : org.telegram.ui.ActionBar.i6.y6, e6Var));
                                                        e7.addView(textView2, w7.x5.t(-1, -2, 49, 40, 12, 40, 9));
                                                    }
                                                } else {
                                                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferAmountHigherHint2, a1.g.n((int) Math.round(((i17.c() / j10.c()) - 1.0d) * 100.0d), "%"), starGift.title));
                                                }
                                                z11 = false;
                                                TextView textView22 = new TextView(context);
                                                textView22.setTextSize(1, 13.0f);
                                                textView22.setGravity(17);
                                                textView22.setText(replaceTags);
                                                textView22.setTextColor(org.telegram.ui.ActionBar.i6.w0(!z11 ? org.telegram.ui.ActionBar.i6.p7 : org.telegram.ui.ActionBar.i6.y6, e6Var));
                                                e7.addView(textView22, w7.x5.t(-1, -2, 49, 40, 12, 40, 9));
                                            }
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
                                            alertDialog$Builder.n(e7);
                                            alertDialog$Builder.k(yh.p7.T0(LocaleController.formatString(R.string.GiftOfferSellFor, d10), z10), new mu(id2, i16, R));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                            alertDialog$Builder.a.show();
                                        }
                                    }
                                } else if (i15 == 7) {
                                    t0 t0Var2 = this.f1;
                                    org.telegram.ui.ActionBar.n2 T02 = t0Var2 != null ? t0Var2.T0() : null;
                                    if (T02 != null && (messageObject2 = this.P0) != null && (message2 = messageObject2.messageOwner) != null) {
                                        TLRPC.MessageAction messageAction2 = message2.action;
                                        if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                            final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                                            final int i20 = 0;
                                            org.telegram.ui.Components.g5.u0(T02, LocaleController.getString(tL_messageActionNoForwardsRequest.prev_value ? R.string.SharingOfferDisableCancelTitle : R.string.SharingOfferEnableCancelTitle), LocaleController.getString(tL_messageActionNoForwardsRequest.prev_value ? R.string.SharingOfferDisableCancelText : R.string.SharingOfferEnableCancelText), LocaleController.getString(R.string.SharingOfferCancelYes), false, new Runnable(this) { // from class: org.telegram.ui.Cells.q0
                                                public final /* synthetic */ w0 b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    switch (i20) {
                                                        case 0:
                                                            w0 w0Var = this.b;
                                                            MessagesController.getInstance(w0Var.H).toggleChatNoForwards(w0Var.P0.getDialogId(), w0Var.P0.getId(), tL_messageActionNoForwardsRequest.prev_value, null);
                                                            break;
                                                        default:
                                                            w0 w0Var2 = this.b;
                                                            MessagesController.getInstance(w0Var2.H).toggleChatNoForwards(w0Var2.P0.getDialogId(), w0Var2.P0.getId(), tL_messageActionNoForwardsRequest.new_value, null);
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                } else if (i15 == 8) {
                                    t0 t0Var3 = this.f1;
                                    org.telegram.ui.ActionBar.n2 T03 = t0Var3 != null ? t0Var3.T0() : null;
                                    if (T03 != null && (messageObject = this.P0) != null && (message = messageObject.messageOwner) != null) {
                                        TLRPC.MessageAction messageAction3 = message.action;
                                        if (messageAction3 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                            final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = (TLRPC.TL_messageActionNoForwardsRequest) messageAction3;
                                            final int i21 = 1;
                                            org.telegram.ui.Components.g5.u0(T03, LocaleController.getString(tL_messageActionNoForwardsRequest2.new_value ? R.string.SharingOfferDisableCancelTitle : R.string.SharingOfferEnableCancelTitle), LocaleController.getString(tL_messageActionNoForwardsRequest2.new_value ? R.string.SharingOfferDisableConfirmText : R.string.SharingOfferEnableConfirmText), LocaleController.getString(R.string.SharingOfferCancelYes), false, new Runnable(this) { // from class: org.telegram.ui.Cells.q0
                                                public final /* synthetic */ w0 b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    switch (i21) {
                                                        case 0:
                                                            w0 w0Var = this.b;
                                                            MessagesController.getInstance(w0Var.H).toggleChatNoForwards(w0Var.P0.getDialogId(), w0Var.P0.getId(), tL_messageActionNoForwardsRequest2.prev_value, null);
                                                            break;
                                                        default:
                                                            w0 w0Var2 = this.b;
                                                            MessagesController.getInstance(w0Var2.H).toggleChatNoForwards(w0Var2.P0.getDialogId(), w0Var2.P0.getId(), tL_messageActionNoForwardsRequest2.new_value, null);
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                }
                            }
                            i11 = -1;
                        }
                        this.l2 = i11;
                        N();
                        return false;
                    }
                } else if (motionEvent.getAction() == 3 && (i10 = this.l2) != -1) {
                    e0 e0Var3 = (e0) arrayList.get(i10);
                    z zVar2 = e0Var3.s;
                    if (zVar2 != null) {
                        zVar2.setState(StateSet.NOTHING);
                    }
                    e0Var3.b(false);
                    this.l2 = -1;
                    N();
                    return false;
                }
            }
        }
        return false;
    }

    public final void u() {
        float f7 = this.a1;
        RectF rectF = this.c1;
        this.a1 = (int) Math.min(f7, rectF.left);
        this.b1 = (int) Math.max(this.b1, rectF.right);
    }

    public final boolean v(float f7, int i10) {
        zg.o0 o0Var = this.E0;
        if (!o0Var.K) {
            return false;
        }
        float y3 = getY() + o0Var.d;
        return y3 > f7 && (y3 + ((float) o0Var.o)) - ((float) AndroidUtilities.dp(16.0f)) < ((float) i10);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.J || super.verifyDrawable(drawable);
    }

    public final void w() {
        SpannableStringBuilder spannableStringBuilder;
        int dp = this.i1 - AndroidUtilities.dp(16.0f);
        float dp2 = AndroidUtilities.dp(14.0f);
        TextPaint textPaint = this.E1;
        textPaint.setTextSize(dp2);
        float dp3 = AndroidUtilities.dp(13.0f);
        TextPaint textPaint2 = this.F1;
        textPaint2.setTextSize(dp3);
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.P0.messageOwner.action;
        int i10 = tL_messageActionGiftCode.months;
        TLRPC.Chat chat = MessagesController.getInstance(this.H).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_messageActionGiftCode.boost_peer)));
        String str = chat == null ? null : chat.title;
        boolean z10 = tL_messageActionGiftCode.via_giveaway;
        String string = tL_messageActionGiftCode.unclaimed ? LocaleController.getString("BoostingUnclaimedPrize", R.string.BoostingUnclaimedPrize) : LocaleController.getString("BoostingCongratulations", R.string.BoostingCongratulations);
        String formatPluralString = i10 == 12 ? LocaleController.formatPluralString("BoldYears", 1, new Object[0]) : LocaleController.formatPluralString("BoldMonths", i10, new Object[0]);
        if (!z10) {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(str == null ? LocaleController.getString(R.string.BoostingReceivedGiftNoName) : LocaleController.formatString("BoostingReceivedGiftFrom", R.string.BoostingReceivedGiftFrom, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingReceivedGiftDuration, formatPluralString)));
        } else if (tL_messageActionGiftCode.unclaimed) {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingYouHaveUnclaimedPrize, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingUnclaimedPrizeDuration, formatPluralString)));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingReceivedPrizeFrom, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingReceivedPrizeDuration, formatPluralString)));
        }
        String string2 = LocaleController.getString("BoostingReceivedGiftOpenBtn", R.string.BoostingReceivedGiftOpenBtn);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        valueOf.setSpan(new m61(AndroidUtilities.bold()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.j1 = new StaticLayout(valueOf, textPaint, dp, alignment, 1.1f, 0.0f, false);
        this.m1 = null;
        this.l1 = null;
        u0 u0Var = this.s1;
        if (u0Var != null) {
            org.telegram.ui.Components.b6.release((w0) u0Var.i, (org.telegram.ui.Components.x5) u0Var.h);
        }
        u0 u0Var2 = new u0(this);
        this.s1 = u0Var2;
        u0Var2.a(spannableStringBuilder, textPaint2, dp);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string2);
        valueOf2.setSpan(new m61(AndroidUtilities.bold()), 0, valueOf2.length(), 33);
        this.o1 = false;
        this.p1 = 0;
        this.w1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) I("paintChatActionText"), dp, alignment, 1.0f, 0.0f, false);
        this.x1 = staticLayout;
        this.y1 = true;
        this.D1 = S(staticLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final void x(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z10, CharSequence charSequence3, int i10, String str, int i11, boolean z11) {
        ?? r42;
        int i12;
        int a2;
        CharSequence charSequence4 = charSequence2;
        int dp = i11 - AndroidUtilities.dp(16.0f);
        MessageObject messageObject = this.P0;
        if (messageObject != null && messageObject.type == 30) {
            dp -= AndroidUtilities.dp(16.0f);
        }
        int i13 = dp;
        if (charSequence != null) {
            MessageObject messageObject2 = this.P0;
            TextPaint textPaint = this.E1;
            if (messageObject2 == null || messageObject2.type != 30) {
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            } else {
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new m61(AndroidUtilities.bold()), 0, valueOf.length(), 33);
            r42 = 0;
            this.j1 = new StaticLayout(valueOf, textPaint, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r42 = 0;
            this.j1 = null;
        }
        this.m1 = null;
        if (spannableStringBuilder != null) {
            l11 l11Var = new l11(spannableStringBuilder, 10.0f, null);
            this.l1 = l11Var;
            l11Var.a.linkColor = -1;
        } else {
            this.l1 = null;
        }
        MessageObject messageObject3 = this.P0;
        TextPaint textPaint2 = this.F1;
        if (messageObject3 != null && messageObject3.type == 35) {
            textPaint2.setTextSize(AndroidUtilities.dp(14.3f));
        } else if (messageObject3 == null || !(Q() || (i12 = this.P0.type) == 30 || i12 == 18 || i12 == 31 || i12 == 37 || i12 == 33)) {
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        } else {
            textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        }
        int dp2 = i13 - AndroidUtilities.dp(12.0f);
        MessageObject messageObject4 = this.P0;
        if (messageObject4 != null && messageObject4.type == 22 && messageObject4.getDialogId() >= 0 && (a2 = ci.d4.a(charSequence4, textPaint2)) < dp2 && a2 > dp2 / 5.0f) {
            dp2 = a2;
        }
        if (charSequence4 == 0) {
            u0 u0Var = this.s1;
            if (u0Var != null) {
                org.telegram.ui.Components.b6.release((w0) u0Var.i, (org.telegram.ui.Components.x5) u0Var.h);
                this.s1 = null;
            }
            this.o1 = r42;
        } else {
            if (this.s1 == null) {
                this.s1 = new u0(this);
            }
            try {
                charSequence4 = Emoji.replaceEmoji(charSequence4, textPaint2.getFontMetricsInt(), r42);
            } catch (Exception unused) {
            }
            this.s1.a(charSequence4, textPaint2, dp2);
            if (!z10 || ((StaticLayout) this.s1.f).getLineCount() <= 3) {
                this.o1 = r42;
                this.q1.f(true, true);
                this.p1 = r42;
            } else {
                this.o1 = !this.n1;
                this.p1 = ((StaticLayout) this.s1.f).getLineBottom(2);
                this.w1 = new l11(LocaleController.getString(R.string.Gift2CaptionMore), textPaint2.getTextSize() / AndroidUtilities.density, AndroidUtilities.bold());
                int lineBottom = ((StaticLayout) this.s1.f).getLineBottom(2);
                this.u1 = lineBottom;
                this.v1 = lineBottom - ((StaticLayout) this.s1.f).getLineTop(2);
                this.t1 = (int) ((StaticLayout) this.s1.f).getLineRight(2);
            }
            if (this.o1) {
                int lineEnd = ((StaticLayout) this.s1.f).getLineEnd(2) - 1;
                u0 u0Var2 = this.s1;
                CharSequence charSequence5 = charSequence4;
                if (lineEnd >= 0) {
                    charSequence5 = charSequence4.subSequence(r42, lineEnd);
                }
                u0Var2.a(charSequence5, textPaint2, dp2);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new m61(AndroidUtilities.bold()), r42, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) I("paintChatActionText"), i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.x1 = staticLayout;
            this.y1 = (!z11 || this.o1) ? r42 : true;
            this.D1 = S(staticLayout);
        } else {
            this.x1 = null;
            this.y1 = r42;
            this.D1 = 0.0f;
        }
        if (str == null) {
            this.R1 = null;
            this.S1 = null;
            return;
        }
        if (this.Q1 == null) {
            this.Q1 = new CornerPathEffect(AndroidUtilities.dp(5.0f));
        }
        if (this.R1 == null) {
            Path path = new Path();
            this.R1 = path;
            xh.m1.d(path, 1.35f, r42);
        }
        l11 l11Var2 = new l11(str, i10, AndroidUtilities.bold());
        this.S1 = l11Var2;
        l11Var2.p = AndroidUtilities.dp(62.0f);
    }

    public final void y(int i10, CharSequence charSequence) {
        CharSequence charSequence2;
        t0 t0Var;
        TLRPC.Message message;
        MessageObject messageObject;
        int i11;
        int dp = i10 - AndroidUtilities.dp(30.0f);
        if (this.i0) {
            dp -= AndroidUtilities.dp(64.0f);
        }
        if (P()) {
            dp = Math.min(dp - AndroidUtilities.dp(this.i0 ? 28.0f : 82.0f), AndroidUtilities.dp(272.0f));
        }
        if (dp < 0) {
            return;
        }
        int i12 = this.f2;
        if (i12 > 0) {
            dp = Math.min(i12, dp);
        }
        int i13 = dp;
        this.d1 = true;
        TextPaint textPaint = (P() || ((messageObject = this.P0) != null && ((i11 = messageObject.type) == 34 || i11 == 35))) ? (TextPaint) I("paintChatActionText3") : (messageObject == null || !messageObject.drawServiceWithDefaultTypeface) ? (TextPaint) I("paintChatActionText") : (TextPaint) I("paintChatActionText2");
        textPaint.linkColor = textPaint.getColor();
        if (P()) {
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spannable.getSpans(0, spannable.length(), Emoji.EmojiSpan.class)) {
                    spannable.removeSpan(emojiSpan);
                }
            }
            charSequence2 = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), false, null, 0, 0.85f, 0);
        } else {
            charSequence2 = charSequence;
        }
        StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint, i13, P() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        CharSequence charSequence3 = charSequence2;
        this.M = staticLayout;
        this.P = null;
        MessageObject messageObject2 = this.P0;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                    this.P = new StaticLayout(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SuggestionAgreementReached)), textPaint.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
            }
        }
        this.r0 = org.telegram.ui.Components.b6.update(0, this, (!this.s || (t0Var = this.f1) == null || t0Var.f()) ? false : true, this.r0, this.M);
        this.O = 0;
        this.N = 0;
        this.Q = 0;
        StaticLayout staticLayout2 = this.P;
        if (staticLayout2 != null) {
            int height = staticLayout2.getHeight();
            this.Q = height;
            this.Q = AndroidUtilities.dp(12.0f) + height;
        }
        MessageObject messageObject3 = this.P0;
        if (messageObject3 == null || !messageObject3.isRepostPreview) {
            try {
                int lineCount = this.M.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    try {
                        float lineWidth = this.M.getLineWidth(i14);
                        float f7 = i13;
                        if (lineWidth > f7) {
                            lineWidth = f7;
                        }
                        this.O = (int) Math.max(this.O, Math.ceil(this.M.getLineBottom(i14)));
                        this.N = (int) Math.max(this.N, Math.ceil(lineWidth));
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        this.R = (i10 - this.N) / 2;
        int dp2 = AndroidUtilities.dp(7.0f);
        this.S = dp2;
        if (this.P != null) {
            this.S = org.telegram.messenger.q.C(11.0f, this.Q, dp2);
        }
        this.T = (i10 - (P() ? this.N : this.M.getWidth())) / 2;
        this.U = (i10 - i13) / 2;
        Stack stack = this.q0;
        ArrayList arrayList = this.p0;
        stack.addAll(arrayList);
        arrayList.clear();
        if (charSequence3 instanceof Spannable) {
            StaticLayout staticLayout3 = this.M;
            int i15 = this.R;
            vh.g.a(this, staticLayout3, i15, i15 + this.N, (Spannable) charSequence3, stack, arrayList, null);
        }
    }

    public w0(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.n = new bd(this);
        int i10 = UserConfig.selectedAccount;
        this.H = i10;
        ai.da daVar = new ai.da(null, false);
        this.d0 = daVar;
        this.m0 = true;
        this.o0 = new RectF();
        this.p0 = new ArrayList();
        this.q0 = new Stack();
        this.E0 = new zg.o0(this);
        this.N0 = new RectF();
        this.T0 = -1;
        this.U0 = -1;
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.Z0 = new Path();
        this.c1 = new RectF();
        this.d1 = true;
        this.e1 = false;
        this.n1 = false;
        this.o1 = false;
        this.q1 = new org.telegram.ui.Components.g6(this, 0L, 320L, hs.h);
        this.y1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.E1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.F1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.G1 = textPaint3;
        this.J1 = new RadialProgress2(this, null);
        this.N1 = new ja(this, 2);
        this.U1 = new Path();
        this.X1 = new ArrayList();
        this.a2 = -1;
        this.c2 = new Paint(1);
        this.g2 = new Path();
        this.h2 = new float[8];
        this.i2 = new float[8];
        this.j2 = new Path();
        this.k2 = new int[]{android.R.attr.state_enabled, android.R.attr.state_pressed};
        this.r2 = new v0(this);
        daVar.a = false;
        this.s = z10;
        this.g1 = e6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.I = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
        this.L = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        this.w = DownloadController.getInstance(i10).generateObserverTag();
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.T1 = view;
        view.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.m1(0.1f, -16777216), 7, AndroidUtilities.dp(16.0f)));
        view.setVisibility(8);
        addView(view);
        rg.v1 v1Var = new rg.v1(10);
        this.V1 = v1Var;
        v1Var.N = 100;
        v1Var.J = false;
        v1Var.M = true;
        v1Var.G = false;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.r = 1;
        v1Var.w = 0.98f;
        v1Var.v = 0.98f;
        v1Var.u = 0.98f;
        v1Var.g = false;
        v1Var.o = 0.0f;
        v1Var.x = 750L;
        v1Var.y = 750;
        v1Var.c();
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.v;
        if (view != null) {
            view.invalidate();
        }
        if (!this.n2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        View view = this.v;
        if (view != null) {
            view.invalidate();
        }
        if (!this.n2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.o4
    public final /* synthetic */ void c(boolean z10, boolean z11) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j3, long j10) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
