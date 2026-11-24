// default package

import android.R;
import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.Context;
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
import android.os.SystemClock;
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
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class cm1 extends hg0 implements cr3, jm7, mk5 {
    public static final HashMap y2;
    public float A0;
    public TextPaint A1;
    public float B0;
    public StaticLayout B1;
    public float C0;
    public float C1;
    public boolean D0;
    public StaticLayout D1;
    public rna E;
    public boolean E0;
    public float E1;
    public boolean F;
    public final l39 F0;
    public final TextPaint F1;
    public boolean G;
    public float G0;
    public final TextPaint G1;
    public boolean H;
    public float H0;
    public final TextPaint H1;
    public final int I;
    public ysa I0;
    public TLRPC.Document I1;
    public final ImageReceiver J;
    public mmc J0;
    public TLRPC.VideoSize J1;
    public Drawable K;
    public boolean K0;
    public final RadialProgress2 K1;
    public Path L;
    public float L0;
    public int L1;
    public final pc0 M;
    public float M0;
    public boolean M1;
    public StaticLayout N;
    public float N0;
    public RectF N1;
    public int O;
    public final RectF O0;
    public final cd1 O1;
    public int P;
    public ycb P0;
    public boolean P1;
    public StaticLayout Q;
    public k47 Q0;
    public ColorMatrixColorFilter Q1;
    public int R;
    public int R0;
    public CornerPathEffect R1;
    public int S;
    public CharSequence S0;
    public Path S1;
    public int T;
    public lx4 T0;
    public uib T1;
    public int U;
    public int U0;
    public final View U1;
    public int V;
    public int V0;
    public final Path V1;
    public int W;
    public Paint W0;
    public final cta W1;
    public TextPaint X0;
    public int X1;
    public final ArrayList Y0;
    public final ArrayList Y1;
    public final ArrayList Z0;
    public de Z1;
    public boolean a0;
    public final Path a1;
    public boolean a2;
    public boolean b0;
    public int b1;
    public int b2;
    public RadialProgressView c0;
    public int c1;
    public TLRPC.TL_messageActionStarGiftOnchainOffer c2;
    public float d0;
    public final RectF d1;
    public boolean d2;
    public final v4b e0;
    public boolean e1;
    public int e2;
    public int f;
    public boolean f0;
    public boolean f1;
    public boolean f2;
    public boolean g0;
    public zl1 g1;
    public rx4 g2;
    public int h;
    public boolean h0;
    public final ylb h1;
    public float h2;
    public boolean i0;
    public int i1;
    public final Paint i2;
    public boolean j0;
    public int j1;
    public boolean j2;
    public int k0;
    public StaticLayout k1;
    public View.OnClickListener k2;
    public boolean l0;
    public Paint l1;
    public int l2;
    public int m0;
    public uib m1;
    public final Path m2;
    public final u51 n;
    public boolean n0;
    public StaticLayout n1;
    public final float[] n2;
    public bwb o0;
    public boolean o1;
    public final float[] o2;
    public final RectF p0;
    public boolean p1;
    public final Path p2;
    public final ArrayList q0;
    public int q1;
    public final int[] q2;
    public qa6 r;
    public final Stack r0;
    public final ln r1;
    public int r2;
    public final boolean s;
    public cn s0;
    public in3 s1;
    public SpannableStringBuilder s2;
    public TextPaint t0;
    public am1 t1;
    public boolean t2;
    public float u0;
    public int u1;
    public Runnable u2;
    public float v0;
    public int v1;
    public PorterDuffColorFilter v2;
    public View w;
    public int w0;
    public int w1;
    public int w2;
    public final int x;
    public boolean x0;
    public uib x1;
    public final bm1 x2;
    public URLSpan y;
    public gn5 y0;
    public StaticLayout y1;
    public float z0;
    public boolean z1;

    static {
        HashMap hashMap = new HashMap();
        y2 = hashMap;
        b10.q(1, hashMap, "1⃣", 3, "2⃣");
        b10.q(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public cm1(ylb ylbVar, Context context, boolean z) {
        super(context);
        this.n = new u51(this);
        int i = z8c.t0;
        this.I = i;
        v4b v4bVar = new v4b(null, false);
        this.e0 = v4bVar;
        this.n0 = true;
        this.p0 = new RectF();
        this.q0 = new ArrayList();
        this.r0 = new Stack();
        this.F0 = new l39(this);
        this.O0 = new RectF();
        this.U0 = -1;
        this.V0 = -1;
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.a1 = new Path();
        this.d1 = new RectF();
        this.e1 = true;
        this.f1 = false;
        this.o1 = false;
        this.p1 = false;
        this.r1 = new ln(this, 0L, 320L, d53.h);
        this.z1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.F1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.G1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.H1 = textPaint3;
        this.K1 = new RadialProgress2(this, null);
        this.O1 = new cd1((Object) this, (byte) 5);
        this.V1 = new Path();
        this.Y1 = new ArrayList();
        this.b2 = -1;
        this.e2 = -1;
        this.i2 = new Paint(1);
        this.m2 = new Path();
        this.n2 = new float[8];
        this.o2 = new float[8];
        this.p2 = new Path();
        this.q2 = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        this.x2 = new bm1(this);
        v4bVar.a = false;
        this.s = z;
        this.h1 = ylbVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.J = imageReceiver;
        imageReceiver.q0(gm.u / 2);
        this.M = new pc0((ylb) null);
        this.x = er3.q(i).k();
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.U1 = view;
        view.setBackground(cmb.f0(cmb.p1(0.1f, -16777216), 7, gm.L(16.0f)));
        view.setVisibility(8);
        addView(view);
        cta ctaVar = new cta(10);
        this.W1 = ctaVar;
        ctaVar.N = 100;
        ctaVar.I = false;
        ctaVar.L = true;
        ctaVar.G = false;
        ctaVar.J = true;
        ctaVar.H = true;
        ctaVar.r = (byte) 1;
        ctaVar.w = 0.98f;
        ctaVar.v = 0.98f;
        ctaVar.u = 0.98f;
        ctaVar.g = false;
        ctaVar.o = 0.0f;
        ctaVar.x = (short) 750;
        ctaVar.y = (short) 750;
        ctaVar.c();
    }

    public static SpannableStringBuilder E(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gm.F2(str, false, gm.L(6.0f), -gm.L(1.3f), 0.8f, org.telegram.messenger.beta.R.drawable.floating_check));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new fg3(gm.L(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            ul1.j();
            spannableStringBuilder.setSpan(ul1.g(gm.L(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static float Z(StaticLayout staticLayout) {
        float f = 0.0f;
        for (int i = 0; i < staticLayout.getLineCount(); i++) {
            float ceil = (int) Math.ceil(staticLayout.getLineWidth(i));
            if (ceil > f) {
                f = ceil;
            }
        }
        return f;
    }

    private float getWalletActionTop() {
        return gm.L(11.0f) + this.T + this.P;
    }

    private void setStarsPaused(boolean z) {
        cta ctaVar = this.W1;
        boolean z2 = ctaVar.g;
        ArrayList arrayList = ctaVar.n;
        if (z == z2) {
            return;
        }
        ctaVar.g = z;
        if (z) {
            ctaVar.Q = System.currentTimeMillis();
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            bta btaVar = (bta) arrayList.get(i);
            btaVar.a = (System.currentTimeMillis() - ctaVar.Q) + btaVar.a;
        }
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final void B(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z, CharSequence charSequence3, int i, String str, int i2, boolean z2) {
        ?? r4;
        int i3;
        int a;
        CharSequence charSequence4 = charSequence2;
        int L = i2 - gm.L(16.0f);
        k47 k47Var = this.Q0;
        if (k47Var != null && k47Var.D == 30) {
            L -= gm.L(16.0f);
        }
        int i4 = L;
        if (charSequence != null) {
            k47 k47Var2 = this.Q0;
            TextPaint textPaint = this.F1;
            if (k47Var2 == null || k47Var2.D != 30) {
                textPaint.setTextSize(gm.L(16.0f));
            } else {
                textPaint.setTextSize(gm.L(14.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new z5c(gm.o()), 0, valueOf.length(), 33);
            r4 = 0;
            this.k1 = new StaticLayout(valueOf, textPaint, i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r4 = 0;
            this.k1 = null;
        }
        this.n1 = null;
        if (spannableStringBuilder != null) {
            uib uibVar = new uib(spannableStringBuilder, 10.0f, null);
            this.m1 = uibVar;
            uibVar.a.linkColor = -1;
        } else {
            this.m1 = null;
        }
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        TextPaint textPaint2 = this.G1;
        if (tL_messageActionStarGiftOnchainOffer != null) {
            textPaint2.setTextSize(O("paintChatActionText").getTextSize());
        } else {
            k47 k47Var3 = this.Q0;
            if (k47Var3 != null) {
                if (k47Var3.D == 35) {
                    textPaint2.setTextSize(gm.L(14.3f));
                } else if (X() || (i3 = this.Q0.D) == 30 || i3 == 18 || i3 == 31 || i3 == 37 || i3 == 33) {
                    textPaint2.setTextSize(gm.L(13.0f));
                }
            }
            textPaint2.setTextSize(gm.L(15.0f));
        }
        int L2 = i4 - gm.L(12.0f);
        k47 k47Var4 = this.Q0;
        if (k47Var4 != null && k47Var4.D == 22 && k47.B0(k47Var4.k) >= 0 && (a = hg5.a(charSequence4, textPaint2)) < L2 && a > L2 / 5.0f) {
            L2 = a;
        }
        am1 am1Var = this.t1;
        if (charSequence4 == 0) {
            if (am1Var != null) {
                gn.release(am1Var.i, am1Var.h);
                this.t1 = null;
            }
            this.p1 = r4;
        } else {
            if (am1Var == null) {
                this.t1 = new am1(this);
            }
            try {
                charSequence4 = gw3.m(charSequence4, textPaint2.getFontMetricsInt(), r4, null, r4);
            } catch (Exception unused) {
            }
            this.t1.a(L2, textPaint2, charSequence4);
            if (!z || this.t1.d.getLineCount() <= 3) {
                this.p1 = r4;
                this.r1.f(true, true);
                this.q1 = r4;
            } else {
                this.p1 = !this.o1;
                this.q1 = this.t1.d.getLineBottom(2);
                this.x1 = new uib(jb6.M0(2131750198, null), textPaint2.getTextSize() / gm.p, gm.o());
                int lineBottom = this.t1.d.getLineBottom(2);
                this.v1 = lineBottom;
                this.w1 = lineBottom - this.t1.d.getLineTop(2);
                this.u1 = (int) this.t1.d.getLineRight(2);
            }
            if (this.p1) {
                int lineEnd = this.t1.d.getLineEnd(2) - 1;
                am1 am1Var2 = this.t1;
                CharSequence charSequence5 = charSequence4;
                if (lineEnd >= 0) {
                    charSequence5 = charSequence4.subSequence(r4, lineEnd);
                }
                am1Var2.a(L2, textPaint2, charSequence5);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new z5c(gm.o()), r4, valueOf2.length(), 33);
            boolean z3 = true;
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) O("paintChatActionText"), i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.y1 = staticLayout;
            if (!z2 || this.p1) {
                z3 = r4;
            }
            this.z1 = z3;
            this.E1 = Z(staticLayout);
        } else {
            this.y1 = null;
            this.z1 = r4;
            this.E1 = 0.0f;
        }
        if (str == null) {
            this.S1 = null;
            this.T1 = null;
            return;
        }
        if (this.R1 == null) {
            this.R1 = new CornerPathEffect(gm.L(5.0f));
        }
        if (this.S1 == null) {
            Path path = new Path();
            this.S1 = path;
            rx4.d(path, 1.35f, r4);
        }
        uib uibVar2 = new uib(str, i, gm.o());
        this.T1 = uibVar2;
        uibVar2.p = gm.L(62.0f);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:12|(1:14)|15|(28:17|(2:19|(2:23|(21:25|26|(3:28|(3:30|(1:32)|33)|34)(1:97)|35|(1:37)(1:96)|38|39|(2:43|(2:45|(1:49)))|50|(1:95)(1:56)|57|(1:59)|60|(4:78|79|(5:81|82|(1:84)|85|86)|92)|64|(1:66)|67|(1:69)(1:77)|70|71|(2:73|74)(1:76))))|98|26|(0)(0)|35|(0)(0)|38|39|(3:41|43|(0))|50|(1:52)|95|57|(0)|60|(1:62)|78|79|(0)|92|64|(0)|67|(0)(0)|70|71|(0)(0))|99|26|(0)(0)|35|(0)(0)|38|39|(0)|50|(0)|95|57|(0)|60|(0)|78|79|(0)|92|64|(0)|67|(0)(0)|70|71|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0193, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0194, code lost:
    
        fc4.g(r0, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int i, CharSequence charSequence) {
        TextPaint textPaint;
        int i2;
        CharSequence charSequence2;
        CharSequence charSequence3;
        k47 k47Var;
        StaticLayout staticLayout;
        k47 k47Var2;
        int lineCount;
        zl1 zl1Var;
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        int L = i - gm.L(30.0f);
        if (this.j0) {
            L -= gm.L(64.0f);
        }
        if (W()) {
            L = Math.min(L - gm.L(this.j0 ? 28.0f : 82.0f), gm.L(272.0f));
        }
        if (L < 0) {
            return;
        }
        int i3 = this.l2;
        if (i3 > 0) {
            L = Math.min(i3, L);
        }
        int i4 = L;
        this.e1 = true;
        if (!W()) {
            k47 k47Var3 = this.Q0;
            if (k47Var3 != null) {
                int i5 = k47Var3.D;
                if (i5 != 34 && i5 != 35) {
                    if (k47Var3.s2) {
                        textPaint = (TextPaint) O("paintChatActionText2");
                        textPaint.linkColor = textPaint.getColor();
                        if (W()) {
                            if (charSequence instanceof Spannable) {
                                Spannable spannable = (Spannable) charSequence;
                                for (dw3 dw3Var : (dw3[]) spannable.getSpans(0, spannable.length(), dw3.class)) {
                                    spannable.removeSpan(dw3Var);
                                }
                            }
                            charSequence2 = gw3.n(charSequence, textPaint.getFontMetricsInt(), false, null, 0, 0.85f, 0);
                        } else {
                            charSequence2 = charSequence;
                        }
                        TextPaint textPaint2 = textPaint;
                        charSequence3 = charSequence2;
                        this.N = new StaticLayout(charSequence2, textPaint2, i4, W() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        this.Q = null;
                        k47Var = this.Q0;
                        if (k47Var != null && (message = k47Var.k) != null) {
                            messageAction = message.action;
                            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                                TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                                if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                                    this.Q = new StaticLayout(gw3.n(gm.S2(jb6.M0(2131744051, null)), textPaint2.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint2, i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                }
                            }
                        }
                        this.s0 = gn.update(0, this, (this.s || (zl1Var = this.g1) == null || zl1Var.f()) ? false : true, this.s0, this.N);
                        this.P = 0;
                        this.O = 0;
                        this.R = 0;
                        staticLayout = this.Q;
                        if (staticLayout != null) {
                            int height = staticLayout.getHeight();
                            this.R = height;
                            this.R = gm.L(12.0f) + height;
                        }
                        k47Var2 = this.Q0;
                        if (k47Var2 != null || !k47Var2.j2) {
                            lineCount = this.N.getLineCount();
                            for (i2 = 0; i2 < lineCount; i2++) {
                                try {
                                    float lineWidth = this.N.getLineWidth(i2);
                                    float f = i4;
                                    if (lineWidth > f) {
                                        lineWidth = f;
                                    }
                                    this.P = (int) Math.max(this.P, Math.ceil(this.N.getLineBottom(i2)));
                                    this.O = (int) Math.max(this.O, Math.ceil(lineWidth));
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                    return;
                                }
                            }
                        }
                        this.S = (i - this.O) / 2;
                        int L2 = gm.L(7.0f);
                        this.T = L2;
                        if (this.Q != null) {
                            this.T = hg9.v(11.0f, this.R, L2);
                        }
                        this.U = (i - (W() ? this.O : this.N.getWidth())) / 2;
                        this.V = (i - i4) / 2;
                        Stack stack = this.r0;
                        ArrayList arrayList = this.q0;
                        stack.addAll(arrayList);
                        arrayList.clear();
                        if (charSequence3 instanceof Spannable) {
                            StaticLayout staticLayout2 = this.N;
                            int i6 = this.S;
                            rna.a(this, staticLayout2, i6, i6 + this.O, (Spannable) charSequence3, stack, arrayList, null);
                            return;
                        }
                        return;
                    }
                }
            }
            textPaint = (TextPaint) O("paintChatActionText");
            textPaint.linkColor = textPaint.getColor();
            if (W()) {
            }
            TextPaint textPaint22 = textPaint;
            charSequence3 = charSequence2;
            this.N = new StaticLayout(charSequence2, textPaint22, i4, W() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.Q = null;
            k47Var = this.Q0;
            if (k47Var != null) {
                messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                }
            }
            this.s0 = gn.update(0, this, (this.s || (zl1Var = this.g1) == null || zl1Var.f()) ? false : true, this.s0, this.N);
            this.P = 0;
            this.O = 0;
            this.R = 0;
            staticLayout = this.Q;
            if (staticLayout != null) {
            }
            k47Var2 = this.Q0;
            if (k47Var2 != null) {
            }
            lineCount = this.N.getLineCount();
            while (i2 < lineCount) {
            }
            this.S = (i - this.O) / 2;
            int L22 = gm.L(7.0f);
            this.T = L22;
            if (this.Q != null) {
            }
            this.U = (i - (W() ? this.O : this.N.getWidth())) / 2;
            this.V = (i - i4) / 2;
            Stack stack2 = this.r0;
            ArrayList arrayList2 = this.q0;
            stack2.addAll(arrayList2);
            arrayList2.clear();
            if (charSequence3 instanceof Spannable) {
            }
        }
        textPaint = (TextPaint) O("paintChatActionText3");
        textPaint.linkColor = textPaint.getColor();
        if (W()) {
        }
        TextPaint textPaint222 = textPaint;
        charSequence3 = charSequence2;
        this.N = new StaticLayout(charSequence2, textPaint222, i4, W() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.Q = null;
        k47Var = this.Q0;
        if (k47Var != null) {
        }
        this.s0 = gn.update(0, this, (this.s || (zl1Var = this.g1) == null || zl1Var.f()) ? false : true, this.s0, this.N);
        this.P = 0;
        this.O = 0;
        this.R = 0;
        staticLayout = this.Q;
        if (staticLayout != null) {
        }
        k47Var2 = this.Q0;
        if (k47Var2 != null) {
        }
        lineCount = this.N.getLineCount();
        while (i2 < lineCount) {
        }
        this.S = (i - this.O) / 2;
        int L222 = gm.L(7.0f);
        this.T = L222;
        if (this.Q != null) {
        }
        this.U = (i - (W() ? this.O : this.N.getWidth())) / 2;
        this.V = (i - i4) / 2;
        Stack stack22 = this.r0;
        ArrayList arrayList22 = this.q0;
        stack22.addAll(arrayList22);
        arrayList22.clear();
        if (charSequence3 instanceof Spannable) {
        }
    }

    public final void F(Canvas canvas, boolean z) {
        cm1 cm1Var;
        Paint paint;
        Paint paint2;
        ylb ylbVar;
        float f;
        float f2;
        float f3;
        float f4;
        ylb ylbVar2;
        Paint paint3;
        Paint paint4;
        int i;
        int i2;
        Canvas canvas2;
        float f5;
        float f6;
        float f7;
        RectF rectF;
        int i3;
        am1 am1Var;
        int L;
        RectF rectF2;
        ArrayList arrayList;
        int i4;
        int i5;
        Paint paint5;
        int i6;
        float f8;
        StaticLayout staticLayout;
        ArrayList arrayList2;
        int i7;
        int i8;
        int i9;
        int i10;
        cm1 cm1Var2 = this;
        if (cm1Var2.s) {
            if (cm1Var2.Q() && !z) {
                return;
            }
            if (!cm1Var2.Q() && z) {
                return;
            }
        }
        Paint O = cm1Var2.O("paintChatActionBackground");
        Paint O2 = cm1Var2.O("paintChatActionBackgroundDarken");
        cm1Var2.t0 = (TextPaint) cm1Var2.O("paintChatActionText");
        int i11 = cm1Var2.U0;
        ylb ylbVar3 = cm1Var2.h1;
        if (i11 >= 0) {
            int v0 = cmb.v0(i11, ylbVar3);
            if (cm1Var2.W0 == null) {
                Paint paint6 = new Paint(1);
                cm1Var2.W0 = paint6;
                paint6.setColor(v0);
                TextPaint textPaint = new TextPaint(1);
                cm1Var2.X0 = textPaint;
                textPaint.setTypeface(gm.o());
                cm1Var2.X0.setTextSize(gm.L(Math.max(16, gda.S0) - 2));
                cm1Var2.X0.setColor(cmb.v0(cm1Var2.V0, ylbVar3));
            }
            O = cm1Var2.W0;
            cm1Var2.t0 = cm1Var2.X0;
        }
        boolean z2 = cm1Var2.e1;
        Path path = cm1Var2.a1;
        if (z2) {
            cm1Var2.e1 = false;
            cm1Var2.b1 = cm1Var2.getWidth();
            cm1Var2.c1 = 0;
            StaticLayout staticLayout2 = cm1Var2.N;
            int measuredWidth = cm1Var2.getMeasuredWidth() / 2;
            int L2 = gm.L(4.0f);
            f2 = 6.0f;
            ArrayList arrayList3 = cm1Var2.Y0;
            arrayList3.clear();
            int lineCount = staticLayout2 == null ? 0 : staticLayout2.getLineCount();
            f3 = 8.0f;
            int L3 = gm.L(11.0f);
            f = 4.0f;
            int L4 = gm.L(8.0f);
            int i12 = 0;
            f4 = 2.0f;
            int i13 = 0;
            while (i12 < lineCount) {
                ylb ylbVar4 = ylbVar3;
                int ceil = (int) Math.ceil(staticLayout2.getLineWidth(i12));
                if (i12 == 0 || (i10 = i13 - ceil) <= 0) {
                    i8 = ceil;
                } else {
                    i8 = ceil;
                    if (i10 <= (L3 * 1.5f) + L4) {
                        i9 = i13;
                        i12 = td4.g(i9, i12, 1, arrayList3);
                        i13 = i9;
                        ylbVar3 = ylbVar4;
                    }
                }
                i9 = i8;
                i12 = td4.g(i9, i12, 1, arrayList3);
                i13 = i9;
                ylbVar3 = ylbVar4;
            }
            ylbVar = ylbVar3;
            for (int i14 = lineCount - 2; i14 >= 0; i14--) {
                int intValue = ((Integer) arrayList3.get(i14)).intValue();
                int i15 = i13 - intValue;
                if (i15 > 0) {
                    i7 = intValue;
                    if (i15 <= (L3 * 1.5f) + L4) {
                        arrayList3.set(i14, Integer.valueOf(i13));
                    }
                } else {
                    i7 = intValue;
                }
                i13 = i7;
                arrayList3.set(i14, Integer.valueOf(i13));
            }
            int L5 = gm.L(3.0f);
            int L6 = gm.L(6.0f);
            int i16 = L3 - L5;
            ArrayList arrayList4 = cm1Var2.Z0;
            arrayList4.clear();
            path.reset();
            float f9 = measuredWidth;
            path.moveTo(f9, L2);
            int i17 = i13;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                rectF2 = cm1Var2.d1;
                if (i19 >= lineCount) {
                    break;
                }
                int intValue2 = ((Integer) arrayList3.get(i19)).intValue();
                int lineBottom = staticLayout2.getLineBottom(i19);
                int i20 = lineCount;
                int i21 = i20 - 1;
                if (i19 < i21) {
                    paint5 = O2;
                    i6 = ((Integer) arrayList3.get(i19 + 1)).intValue();
                } else {
                    paint5 = O2;
                    i6 = 0;
                }
                int i22 = lineBottom - i18;
                if (i19 == 0 || intValue2 > i17) {
                    i22 = gm.L(3.0f) + i22;
                }
                if (i19 == i21 || intValue2 > i6) {
                    i22 = gm.L(3.0f) + i22;
                }
                Paint paint7 = O;
                float f10 = (intValue2 / 2.0f) + f9;
                int i23 = (i19 == i21 || intValue2 >= i6 || i19 == 0 || intValue2 >= i17) ? L4 : L6;
                if (i19 == 0 || intValue2 > i17) {
                    f8 = f10;
                    staticLayout = staticLayout2;
                    arrayList2 = arrayList3;
                    rectF2.set((f8 - L5) - L3, L2, f8 + i16, (L3 << 1) + L2);
                    x();
                    path.arcTo(rectF2, -90.0f, 90.0f);
                } else {
                    f8 = f10;
                    if (intValue2 < i17) {
                        float f11 = f8 + i16;
                        staticLayout = staticLayout2;
                        arrayList2 = arrayList3;
                        rectF2.set(f11, L2, (i23 << 1) + f11, r4 + L2);
                        x();
                        path.arcTo(rectF2, -90.0f, -90.0f);
                    } else {
                        staticLayout = staticLayout2;
                        arrayList2 = arrayList3;
                    }
                }
                L2 += i22;
                if (i19 != i21 && intValue2 < i6) {
                    L2 -= gm.L(3.0f);
                    i22 -= gm.L(3.0f);
                }
                if (i19 != 0 && intValue2 < i17) {
                    L2 -= gm.L(3.0f);
                    i22 -= gm.L(3.0f);
                }
                arrayList4.add(Integer.valueOf(i22));
                if (i19 == i21 || intValue2 > i6) {
                    rectF2.set((f8 - L5) - L3, L2 - (L3 << 1), f8 + i16, L2);
                    x();
                    path.arcTo(rectF2, 0.0f, 90.0f);
                } else if (intValue2 < i6) {
                    float f12 = f8 + i16;
                    rectF2.set(f12, L2 - r0, (i23 << 1) + f12, L2);
                    x();
                    path.arcTo(rectF2, 180.0f, -90.0f);
                }
                i19++;
                cm1Var2 = this;
                i17 = intValue2;
                i18 = lineBottom;
                lineCount = i20;
                O2 = paint5;
                O = paint7;
                staticLayout2 = staticLayout;
                arrayList3 = arrayList2;
            }
            paint = O;
            paint2 = O2;
            StaticLayout staticLayout3 = staticLayout2;
            ArrayList arrayList5 = arrayList3;
            int i24 = lineCount - 1;
            int i25 = i24;
            while (i25 >= 0) {
                if (i25 != 0) {
                    arrayList = arrayList5;
                    i4 = ((Integer) arrayList.get(i25 - 1)).intValue();
                } else {
                    arrayList = arrayList5;
                    i4 = 0;
                }
                int intValue3 = ((Integer) arrayList.get(i25)).intValue();
                int intValue4 = i25 != i24 ? ((Integer) arrayList.get(i25 + 1)).intValue() : 0;
                StaticLayout staticLayout4 = staticLayout3;
                staticLayout4.getLineBottom(i25);
                float f13 = measuredWidth - (intValue3 / 2);
                int i26 = (i25 == i24 || intValue3 >= intValue4 || i25 == 0 || intValue3 >= i4) ? L4 : L6;
                if (i25 == i24 || intValue3 > intValue4) {
                    arrayList5 = arrayList;
                    staticLayout3 = staticLayout4;
                    i5 = i24;
                    rectF2.set(f13 - i16, L2 - (L3 << 1), L5 + f13 + L3, L2);
                    x();
                    path.arcTo(rectF2, 90.0f, 90.0f);
                } else if (intValue3 < intValue4) {
                    float f14 = f13 - i16;
                    arrayList5 = arrayList;
                    staticLayout3 = staticLayout4;
                    i5 = i24;
                    rectF2.set(f14 - (i26 << 1), L2 - r2, f14, L2);
                    x();
                    path.arcTo(rectF2, 90.0f, -90.0f);
                } else {
                    arrayList5 = arrayList;
                    staticLayout3 = staticLayout4;
                    i5 = i24;
                }
                L2 -= ((Integer) arrayList4.get(i25)).intValue();
                if (i25 == 0 || intValue3 > i4) {
                    rectF2.set(f13 - i16, L2, f13 + L5 + L3, (L3 << 1) + L2);
                    x();
                    path.arcTo(rectF2, 180.0f, 90.0f);
                } else if (intValue3 < i4) {
                    float f15 = f13 - i16;
                    rectF2.set(f15 - (i26 << 1), L2, f15, r11 + L2);
                    x();
                    path.arcTo(rectF2, 0.0f, -90.0f);
                }
                i25--;
                i24 = i5;
            }
            path.close();
            int measuredWidth2 = getMeasuredWidth() / 2;
            if (!W() || X()) {
                cm1Var = this;
            } else {
                float f16 = measuredWidth2;
                cm1Var = this;
                rectF2.left = (f16 - (cm1Var.O / 2.0f)) - gm.L(17.0f);
                rectF2.top = L2;
                rectF2.right = (cm1Var.O / 2.0f) + f16 + gm.L(17.0f);
                rectF2.bottom = gm.L(28.0f) + L2 + cm1Var.P + cm1Var.R;
                path.reset();
                path.addRoundRect(rectF2, gm.L(15.0f), gm.L(15.0f), Path.Direction.CW);
                path.close();
            }
        } else {
            cm1Var = cm1Var2;
            paint = O;
            paint2 = O2;
            ylbVar = ylbVar3;
            f = 4.0f;
            f2 = 6.0f;
            f3 = 8.0f;
            f4 = 2.0f;
        }
        if (!cm1Var.x0) {
            cm1Var.w0 = ((ViewGroup) cm1Var.getParent()).getMeasuredHeight();
        }
        if (ylbVar != null) {
            ylbVar2 = ylbVar;
            ylbVar2.b(cm1Var.v0, cm1Var.u0 + gm.L(f), cm1Var.getMeasuredWidth(), cm1Var.w0);
        } else {
            ylbVar2 = ylbVar;
            cmb.q(cm1Var.v0, cm1Var.u0 + gm.L(f), cm1Var.getMeasuredWidth(), cm1Var.w0);
        }
        boolean z3 = cm1Var instanceof ds1;
        float f17 = (!z3 || cmb.g1(ylbVar2)) ? 1.0f : 0.75f;
        if (!z || (cm1Var.getAlpha() == 1.0f && !z3)) {
            paint3 = paint2;
            paint4 = paint;
            if (z3) {
                i = paint4.getAlpha();
                i2 = paint3.getAlpha();
                paint4.setAlpha((int) (i * f17));
                paint3.setAlpha((int) (i2 * f17));
            } else {
                i = -1;
                i2 = -1;
            }
        } else {
            i = paint.getAlpha();
            i2 = paint2.getAlpha();
            paint4 = paint;
            paint4.setAlpha((int) (cm1Var.getAlpha() * i * f17));
            paint3 = paint2;
            paint3.setAlpha((int) (cm1Var.getAlpha() * i2 * f17));
        }
        k47 k47Var = cm1Var.Q0;
        Paint paint8 = cm1Var.i2;
        if (k47Var == null || !k47Var.j2) {
            canvas2 = canvas;
            canvas2.drawPath(path, paint4);
            if (cm1Var.Q() && paint3.getAlpha() > 0) {
                canvas2.drawPath(path, paint3);
            }
            if (cm1Var.h2 > 0.0f) {
                int alpha = paint8.getAlpha();
                if (z) {
                    paint8.setAlpha((int) (cm1Var.getAlpha() * alpha));
                }
                canvas2.drawPath(path, paint8);
                paint8.setAlpha(alpha);
            }
        } else {
            canvas2 = canvas;
        }
        if (cm1Var.S()) {
            int width = cm1Var.getWidth();
            cm1Var.J0.getClass();
            float L7 = (width - gm.L(206.0f)) / f4;
            float walletActionTop = cm1Var.getWalletActionTop();
            cm1Var.J0.getClass();
            float L8 = gm.L(206.0f) + L7;
            if (cm1Var.J0.q0 == null) {
                L = gm.L(140.0f);
                f5 = 140.0f;
                f6 = 20.0f;
            } else {
                f5 = 140.0f;
                f6 = 20.0f;
                L = gm.L(150.0f) + ((int) Math.ceil(r13.q0.h()));
            }
            RectF rectF3 = cm1Var.O0;
            rectF3.set(L7, walletActionTop, L8, L + walletActionTop);
            canvas2.save();
            cm1Var.J0.c(canvas2, L7, walletActionTop);
            canvas2.drawRoundRect(rectF3, gm.L(f6), gm.L(f6), paint4);
            if (cm1Var.Q() && paint3.getAlpha() > 0) {
                canvas2.drawRoundRect(rectF3, gm.L(f6), gm.L(f6), paint3);
            }
            f7 = 0.0f;
            if (cm1Var.h2 > 0.0f) {
                int alpha2 = paint8.getAlpha();
                if (z) {
                    paint8.setAlpha((int) (cm1Var.getAlpha() * alpha2));
                }
                canvas2.drawRoundRect(rectF3, gm.L(f6), gm.L(f6), paint8);
                paint8.setAlpha(alpha2);
            }
            canvas2.restore();
        } else {
            f5 = 140.0f;
            f6 = 20.0f;
            f7 = 0.0f;
        }
        k47 k47Var2 = cm1Var.Q0;
        if (cm1Var.R()) {
            float L9 = cm1Var.I0.T.f + gm.L(f3);
            float width2 = (cm1Var.getWidth() - L9) / f4;
            float L10 = cm1Var.I0.p ? f7 : gm.L(12.0f) + cm1Var.T + cm1Var.P;
            RectF rectF4 = gm.P;
            rectF4.set(width2, L10, L9 + width2, cm1Var.I0.P + L10 + gm.L(f3));
            RectF rectF5 = cm1Var.N1;
            if (rectF5 == null) {
                rectF5 = new RectF();
                cm1Var.N1 = rectF5;
            }
            rectF5.set(rectF4);
            canvas2.drawRoundRect(cm1Var.N1, gm.L(16.0f), gm.L(16.0f), paint4);
            if (cm1Var.Q()) {
                canvas2.drawRoundRect(cm1Var.N1, gm.L(16.0f), gm.L(16.0f), paint3);
            }
        } else if (cm1Var.P0 != null) {
            float L11 = gm.L(174.0f);
            ycb ycbVar = cm1Var.P0;
            ycbVar.getClass();
            float L12 = gm.L(f5) + ((int) ycbVar.f.h()) + (ycbVar.i ? gm.L(40.0f) : 0);
            float width3 = (cm1Var.getWidth() - L11) / f4;
            RectF rectF6 = cm1Var.N1;
            if (rectF6 == null) {
                rectF6 = new RectF();
                cm1Var.N1 = rectF6;
            }
            rectF6.set(width3, gm.L(f), L11 + width3, gm.L(f) + L12);
            canvas2.drawRoundRect(cm1Var.N1, gm.L(16.0f), gm.L(16.0f), paint4);
            if (cm1Var.Q()) {
                canvas2.drawRoundRect(cm1Var.N1, gm.L(16.0f), gm.L(16.0f), paint3);
            }
        } else if (cm1Var.U(k47Var2)) {
            float width4 = (cm1Var.getWidth() - cm1Var.j1) / f4;
            float f18 = cm1Var.T + cm1Var.P;
            if (cm1Var.X()) {
                float L13 = f18 + gm.L(f);
                rectF = gm.P;
                rectF.set(width4, L13, cm1Var.j1 + width4, cm1Var.f + L13);
            } else {
                float L14 = f18 + gm.L(12.0f);
                rectF = gm.P;
                float f19 = cm1Var.j1;
                rectF.set(width4, L14, width4 + f19, f19 + L14 + cm1Var.L1);
            }
            if (k47Var2 != null && k47Var2.D == 18 && !cm1Var.p1 && (am1Var = cm1Var.t1) != null && cm1Var.q1 > 0) {
                rectF.bottom = kt6.B(1.0f, cm1Var.r1.c, am1Var.d.getHeight() - cm1Var.q1, rectF.bottom);
            }
            RectF rectF7 = cm1Var.N1;
            if (rectF7 == null) {
                rectF7 = new RectF();
                cm1Var.N1 = rectF7;
            }
            rectF7.set(rectF);
            if (k47Var2 == null || (!((i3 = k47Var2.D) == 33 || i3 == 35) || cm1Var.Z1 == null)) {
                canvas2.drawRoundRect(cm1Var.N1, gm.L(f6), gm.L(f6), paint4);
                if (cm1Var.Q()) {
                    canvas2.drawRoundRect(cm1Var.N1, gm.L(f6), gm.L(f6), paint3);
                }
            } else {
                float L15 = gm.L(16.0f);
                float[] fArr = cm1Var.n2;
                Arrays.fill(fArr, L15);
                float L16 = gm.L(f2);
                fArr[7] = L16;
                fArr[6] = L16;
                fArr[5] = L16;
                fArr[4] = L16;
                Path path2 = cm1Var.m2;
                path2.rewind();
                path2.addRoundRect(cm1Var.N1, fArr, Path.Direction.CW);
                canvas2.drawPath(path2, paint4);
                if (cm1Var.Q()) {
                    canvas2.drawPath(path2, paint3);
                }
            }
        }
        if (i >= 0) {
            paint4.setAlpha(i);
            paint3.setAlpha(i2);
        }
    }

    public final void G(Canvas canvas) {
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        if (tL_messageActionStarGiftOnchainOffer == null || this.g2 == null || !(tL_messageActionStarGiftOnchainOffer.gift instanceof TL_stars.TL_starGiftUnique)) {
            return;
        }
        ImageReceiver imageReceiver = this.J;
        float L = imageReceiver.L0 + imageReceiver.N0 + gm.L(10.0f) + gm.L(1.9805f);
        int L2 = (int) ((L + gm.L(48.0f)) - gm.L(40.800003f));
        int L3 = (int) ((imageReceiver.M0 - gm.L(10.0f)) - gm.L(1.7f));
        this.g2.setBounds(L2 - gm.L(39.0f), L3, L2, gm.L(42.6f) + L3);
        this.g2.draw(canvas);
    }

    public final void H(Canvas canvas) {
        float f;
        float f2;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f3 = 2.0f;
        canvas2.translate(this.k0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.U, this.T);
        StaticLayout staticLayout = this.N;
        gn.drawAnimatedEmojis(canvas2, staticLayout, this.s0, 0.0f, this.q0, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout != null ? K(staticLayout.getPaint().getColor()) : null);
        canvas2.restore();
        float f4 = 4.0f;
        if (R()) {
            canvas2.save();
            float width = getWidth();
            ysa ysaVar = this.I0;
            canvas2.translate((width - ysaVar.T.f) / 2.0f, ysaVar.p ? gm.L(4.0f) : gm.L(16.0f) + this.T + this.P);
            this.I0.c(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        bwb bwbVar = this.o0;
        ylb ylbVar = this.h1;
        if (bwbVar != null) {
            float alpha = getAlpha();
            if (ylbVar != null) {
                ylbVar.b(this.v0, this.u0 + 0.0f, getMeasuredWidth(), this.w0);
            } else {
                cmb.q(this.v0, this.u0 + 0.0f, getMeasuredWidth(), this.w0);
            }
            this.o0.c(canvas, getWidth(), this.k0, 0.0f, 1.0f, alpha, this.n0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.Y1;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (ylbVar != null) {
            ylbVar.b(this.v0, this.u0 + gm.L(4.0f), getMeasuredWidth(), this.w0);
        } else {
            cmb.q(this.v0, this.u0 + gm.L(4.0f), getMeasuredWidth(), this.w0);
        }
        float width2 = (getWidth() - this.j1) / 2.0f;
        float L = gm.L(4.0f) + gm.L(4.0f) + this.T + this.P + this.f;
        float L2 = (this.j1 - gm.L(4.0f)) / 2.0f;
        int i = 0;
        while (i < arrayList.size()) {
            wp0 wp0Var = (wp0) arrayList.get(i);
            float a = wp0Var.a();
            float L3 = ((gm.L(f4) + L2) * i) + width2;
            float f5 = L3 + L2;
            RectF rectF = this.d1;
            rectF.set(L3, L, f5, wp0Var.f + L);
            canvas2.save();
            if (a != 1.0f) {
                f = f4;
                canvas2.scale(a, a, rectF.centerX(), rectF.centerY());
            } else {
                f = f4;
            }
            float L4 = gm.L(Math.min(6.75f, gda.U0));
            float[] fArr = this.o2;
            Arrays.fill(fArr, L4);
            if ((wp0Var.g & 9) == 9) {
                float L5 = gm.L(gda.U0);
                fArr[7] = L5;
                fArr[6] = L5;
            }
            if ((wp0Var.g & 10) == 10) {
                float L6 = gm.L(gda.U0);
                fArr[5] = L6;
                fArr[4] = L6;
            }
            Path path = this.p2;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas2.drawPath(path, O("paintChatActionBackground"));
            if (Q()) {
                canvas2.drawPath(path, cmb.g2);
            }
            canvas2.save();
            canvas2.clipPath(path);
            fg0 fg0Var = wp0Var.s;
            if (fg0Var != null) {
                int i2 = (int) L;
                fg0Var.setBounds((int) L3, i2, (int) f5, wp0Var.f + i2);
                wp0Var.s.setAlpha(nm7.d4);
                wp0Var.s.draw(canvas2);
            }
            canvas2.restore();
            canvas2.save();
            float L7 = wp0Var.t != null ? gm.L(26.0f) : 0;
            float z = aq1.z(L2 - (wp0Var.h.j() + (wp0Var.t != null ? gm.L(f) : 0)), L7, f3, L3);
            Drawable drawable = wp0Var.t;
            if (drawable != null) {
                int i3 = (int) z;
                f2 = f3;
                drawable.setBounds(i3, (int) (((wp0Var.f - gm.L(24.0f)) / f3) + L), gm.L(24.0f) + i3, gm.L(24.0f) + ((int) (((wp0Var.f - gm.L(24.0f)) / f2) + L)));
                wp0Var.t.setAlpha(wp0Var.m ? 128 : nm7.d4);
                wp0Var.t.draw(canvas2);
                z += L7;
            } else {
                f2 = f3;
            }
            wp0Var.h.p = Math.max(1, (((int) L2) - gm.L(15.0f)) - r6);
            wp0Var.h.f(canvas2, z, (gm.L(40.0f) / f2) + L, wp0Var.m ? 0.5f : 1.0f);
            canvas2.restore();
            canvas2.restore();
            i++;
            f4 = f;
            f3 = f2;
        }
    }

    public final void I(Canvas canvas, boolean z) {
        if (this.s) {
            if (Q() && !z) {
                return;
            }
            if (!Q() && z) {
                return;
            }
        }
        J(canvas, z, null);
    }

    public final void J(Canvas canvas, boolean z, Integer num) {
        Canvas canvas2;
        float alpha = z ? getAlpha() : 1.0f;
        if (alpha > 0.0f) {
            ylb ylbVar = this.h1;
            if (ylbVar != null) {
                ylbVar.b(this.v0, this.u0 + gm.L(4.0f), getMeasuredWidth(), this.w0);
            } else {
                cmb.q(this.v0, this.u0 + gm.L(4.0f), getMeasuredWidth(), this.w0);
            }
            k47 k47Var = this.Q0;
            if (k47Var == null || !k47Var.N5()) {
                return;
            }
            l39 l39Var = this.F0;
            l39Var.getClass();
            l39Var.a = 1.0f;
            if (alpha < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            bm1 bm1Var = this.x2;
            l39Var.d(canvas2, bm1Var.b ? bm1Var.c : 1.0f, num);
            if (alpha < 1.0f) {
                canvas2.restore();
            }
        }
    }

    public final ColorFilter K(int i) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (i == this.w2 && (porterDuffColorFilter = this.v2) != null) {
            return porterDuffColorFilter;
        }
        this.w2 = i;
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        this.v2 = porterDuffColorFilter2;
        return porterDuffColorFilter2;
    }

    public final int M(k47 k47Var) {
        int i;
        int i2 = this.i1;
        int i3 = k47Var.D;
        if (i3 == 37) {
            i2 = gm.L(52.0f);
        } else if (i3 == 21 || X()) {
            i2 = gm.L(78.0f);
        }
        if (W() || (i = k47Var.D) == 34 || i == 35) {
            return 0;
        }
        return i2;
    }

    @Override // cr3
    public final void N(String str) {
        TLRPC.PhotoSize photoSize;
        k47 k47Var = this.Q0;
        if (k47Var == null || k47Var.D != 11) {
            return;
        }
        int size = k47Var.p0.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                photoSize = null;
                break;
            }
            photoSize = (TLRPC.PhotoSize) k47Var.p0.get(i);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                break;
            } else {
                i++;
            }
        }
        this.J.Z(this.y0, "g", gn5.f(photoSize, k47Var.n0), "50_50_b", this.M, 0L, null, k47Var, 1);
        er3.q(this.I).v(this);
    }

    public Paint O(String str) {
        ylb ylbVar = this.h1;
        Paint d = ylbVar != null ? ylbVar.d(str) : null;
        return d != null ? d : cmb.T0(str);
    }

    public final float P(k47 k47Var) {
        oc7 r1;
        String str;
        if (k47Var == null) {
            return 1.0f;
        }
        try {
            if (k47Var.D == 22 && (str = (r1 = oc7.r1(this.I)).J2) != null && TextUtils.equals(k47Var.k.action.wallpaper.uploadingImage, str)) {
                return r1.K2.r;
            }
            return 1.0f;
        } catch (Exception e) {
            fc4.g(e, true);
            return 1.0f;
        }
    }

    public final boolean Q() {
        if (this.W0 != null) {
            return false;
        }
        ylb ylbVar = this.h1;
        return ylbVar != null ? ylbVar.g() : cmb.b1();
    }

    public final boolean R() {
        ysa ysaVar = this.I0;
        return (ysaVar == null || ysaVar.Q == null) ? false : true;
    }

    public final boolean S() {
        TLRPC.Message message;
        k47 k47Var = this.Q0;
        return (k47Var == null || (message = k47Var.k) == null || !(message.action instanceof TLRPC.TL_messageActionGramTransfer)) ? false : true;
    }

    public final void T() {
        zl1 zl1Var = this.g1;
        if (zl1Var != null && zl1Var.f()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean U(k47 k47Var) {
        if (k47Var == null) {
            return false;
        }
        int i = k47Var.D;
        return i == 30 || i == 18 || i == 25 || X();
    }

    public final boolean W() {
        TLRPC.Message message;
        k47 k47Var = this.Q0;
        return (k47Var == null || (message = k47Var.k) == null || !(message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) ? false : true;
    }

    public final boolean X() {
        k47 k47Var;
        int i;
        if (R() || this.P0 != null || (i = (k47Var = this.Q0).D) == 31 || i == 37 || i == 33 || i == 35 || i == 34 || i == 21 || i == 22 || k47Var.y4()) {
            return true;
        }
        TLRPC.Message message = this.Q0.k;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
            return ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low || ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).rejected;
        }
        return false;
    }

    public final boolean Y() {
        k47 k47Var = this.Q0;
        if (k47Var == null) {
            return false;
        }
        TLRPC.Message message = k47Var.k;
        TLRPC.MessageAction messageAction = message.action;
        if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
            return m9c.D(oc7.r1(this.I).W1(Long.valueOf(this.Q0.k.from_id.user_id)));
        }
        return false;
    }

    @Override // mk5
    public final boolean a() {
        return false;
    }

    public final boolean a0() {
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        if (tL_messageActionStarGiftOnchainOffer == null || !this.d2) {
            return false;
        }
        long j = tL_messageActionStarGiftOnchainOffer.offer_id;
        Long l = (Long) yr7.a.get(Long.valueOf(j));
        if (l != null && l.longValue() > SystemClock.elapsedRealtime() && yr7.b.contains(Long.valueOf(j))) {
            return true;
        }
        int i = this.I;
        return yr7.k(i, j) || yr7.m(i, j);
    }

    @Override // mk5
    public final void c(TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        zl1 zl1Var = this.g1;
        if (zl1Var != null) {
            zl1Var.y(this, reactionCount, z, f, f2);
        }
    }

    public final CharSequence c0(SpannableStringBuilder spannableStringBuilder, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        HashMap hashMap = yr7.a;
        CharSequence charSequence = null;
        if (tL_messageActionStarGiftOnchainOffer.settled && !tL_messageActionStarGiftOnchainOffer.accepted) {
            charSequence = jb6.M0(2131749508, null);
        } else if (!tL_messageActionStarGiftOnchainOffer.accepted && !tL_messageActionStarGiftOnchainOffer.declined) {
            if (tL_messageActionStarGiftOnchainOffer.cancelled) {
                charSequence = jb6.M0(2131749507, null);
            } else if (tL_messageActionStarGiftOnchainOffer.cancelling) {
                charSequence = jb6.M0(2131749512, null);
            } else {
                int max = Math.max(0, tL_messageActionStarGiftOnchainOffer.expires_at - ConnectionsManager.getInstance(this.I).getCurrentTime());
                charSequence = tL_messageActionStarGiftOnchainOffer.expired ? jb6.M0(2131749510, null) : max == 0 ? jb6.M0(2131749509, null) : gm.S2(jb6.a0(null, null, 2131749546, String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf(max / 3600), Integer.valueOf((max / 60) % 60), Integer.valueOf(max % 60))));
            }
        }
        if (charSequence == null) {
            return spannableStringBuilder;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        spannableStringBuilder2.append((CharSequence) "\n\n");
        spannableStringBuilder2.append(charSequence);
        return spannableStringBuilder2;
    }

    public final void d0(CharacterStyle characterStyle) {
        if (this.g1 == null || !(characterStyle instanceof URLSpan)) {
            return;
        }
        String url = ((URLSpan) characterStyle).getURL();
        if (url.startsWith("task")) {
            this.g1.n(this, this.Q0.N1(), Integer.parseInt(url.substring(5)));
            return;
        }
        if (url.startsWith("topic")) {
            URLSpan uRLSpan = this.y;
            if (uRLSpan instanceof g6c) {
                TLObject tLObject = ((g6c) uRLSpan).c;
                if (tLObject instanceof TLRPC.TL_forumTopic) {
                    no4.n(this.g1.w(), -this.g1.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("invite")) {
            URLSpan uRLSpan2 = this.y;
            if (uRLSpan2 instanceof g6c) {
                TLObject tLObject2 = ((g6c) uRLSpan2).c;
                if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                    this.g1.x((TLRPC.TL_chatInviteExported) tLObject2);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("game")) {
            this.g1.C(this, this.Q0.N1());
        } else if (url.startsWith("http")) {
            l11.u(getContext(), url);
        } else {
            this.g1.I(Long.parseLong(url));
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        k47 k47Var;
        if (i == nm7.m1) {
            setSpoilersSuppressed(false);
            return;
        }
        if (i == nm7.m4 || i == nm7.L3) {
            invalidate();
            return;
        }
        if (i == nm7.l1) {
            setSpoilersSuppressed(true);
            return;
        }
        if (i == nm7.Y2 || i == nm7.H3 || i == nm7.Z2) {
            k47 k47Var2 = this.Q0;
            if (k47Var2 != null) {
                i0(k47Var2, true);
                return;
            }
            return;
        }
        if (i == nm7.y0) {
            if (!Objects.equals(objArr[0], z8c.h(this.I).c0) || (k47Var = this.Q0) == null) {
                return;
            }
            i0(k47Var, true);
            return;
        }
        if (i == nm7.e4 && S()) {
            this.s2 = null;
            this.W = 0;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.U1) {
            return super.drawChild(canvas, view, j);
        }
        float a = this.n.a(0.02f);
        canvas.save();
        canvas.scale(a, a, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public final void e0() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        k47 k47Var = this.Q0;
        TLRPC.MessageAction messageAction = k47Var.k.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (k47Var != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !Y()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.Q0.k.action).slug;
        }
        if (this.g1 != null) {
            gm.c3(new tv0(this, tL_premiumGiftOption, str));
        }
    }

    public final void f0() {
        TLRPC.Message message;
        k47 k47Var = this.Q0;
        if (k47Var == null || (message = k47Var.k) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        boolean z = messageAction instanceof TLRPC.TL_messageActionGiftStars;
        v4b v4bVar = this.e0;
        if (z) {
            Context context = getContext();
            TLRPC.Message message2 = this.Q0.k;
            int i = message2.date;
            TLRPC.Peer peer = message2.from_id;
            TLRPC.Peer peer2 = message2.peer_id;
            TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
            ylb ylbVar = v4bVar.J;
            TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
            starsTransaction.title = null;
            starsTransaction.description = null;
            starsTransaction.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
            starsTransaction.peer = tL_starsTransactionPeer;
            tL_starsTransactionPeer.peer = peer;
            starsTransaction.date = i;
            starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
            starsTransaction.id = tL_messageActionGiftStars.transaction_id;
            starsTransaction.gift = true;
            starsTransaction.sent_by = peer;
            starsTransaction.received_by = peer2;
            nxa.l1(context, false, 0L, this.I, starsTransaction, ylbVar);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
            Context context2 = getContext();
            TLRPC.Message message3 = this.Q0.k;
            int i2 = message3.date;
            TLRPC.Peer peer3 = message3.from_id;
            TLRPC.Peer peer4 = message3.peer_id;
            TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
            ylb ylbVar2 = v4bVar.J;
            TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
            starsTransaction2.title = null;
            starsTransaction2.description = null;
            starsTransaction2.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
            starsTransaction2.peer = tL_starsTransactionPeer2;
            tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
            starsTransaction2.date = i2;
            starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
            starsTransaction2.id = tL_messageActionPrizeStars.transaction_id;
            starsTransaction2.gift = true;
            starsTransaction2.flags |= TLObject.FLAG_13;
            starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
            starsTransaction2.sent_by = peer3;
            starsTransaction2.received_by = peer4;
            nxa.l1(context2, false, 0L, this.I, starsTransaction2, ylbVar2);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
            Context context3 = getContext();
            TLRPC.Message message4 = this.Q0.k;
            int i3 = message4.date;
            TLRPC.Peer peer5 = message4.from_id;
            TLRPC.Peer peer6 = message4.peer_id;
            TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
            ylb ylbVar3 = v4bVar.J;
            TL_stars.StarsTransaction starsTransaction3 = new TL_stars.StarsTransaction();
            starsTransaction3.title = null;
            starsTransaction3.description = null;
            starsTransaction3.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer3 = new TL_stars.TL_starsTransactionPeer();
            starsTransaction3.peer = tL_starsTransactionPeer3;
            tL_starsTransactionPeer3.peer = peer5;
            starsTransaction3.date = i3;
            TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
            starsTransaction3.amount = tL_starsTonAmount;
            tL_starsTonAmount.amount = tL_messageActionGiftTon.cryptoAmount;
            starsTransaction3.id = tL_messageActionGiftTon.transaction_id;
            starsTransaction3.gift = true;
            starsTransaction3.sent_by = peer5;
            starsTransaction3.received_by = peer6;
            nxa.l1(context3, false, 0L, this.I, starsTransaction3, ylbVar3);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            if (((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                return;
            }
            wsa wsaVar = new wsa(getContext(), this.I, k47.B0(this.Q0.k), this.h1, null);
            wsaVar.l2(this.Q0, null);
            wsaVar.show();
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
            if (!((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                wsa wsaVar2 = new wsa(getContext(), this.I, k47.B0(this.Q0.k), this.h1, null);
                wsaVar2.l2(this.Q0, null);
                wsaVar2.show();
                return;
            } else {
                d S = LaunchActivity.S();
                if (S != null) {
                    ts2.u(null, 2131743567, c41.b0(S), org.telegram.messenger.beta.R.raw.fire_on, 36);
                    return;
                }
                return;
            }
        }
        if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
            TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    wsa wsaVar3 = new wsa(getContext(), this.I, 0L, this.h1, null);
                    wsaVar3.m2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                    wsaVar3.show();
                }
            }
        }
    }

    public final boolean g0(float f, float f2, ho1 ho1Var) {
        if (S() && !this.Q0.O3() && !this.Q0.k.premiumEffectWasPlayed) {
            float y = getY() + getPaddingTop() + getWalletActionTop();
            if (y >= f && y + gm.L(140.0f) <= f2) {
                mmc mmcVar = this.J0;
                p09 p09Var = mmcVar.l;
                if (mmcVar.i0 && mmcVar.j0 == null) {
                    mmcVar.i0 = false;
                    mmcVar.k0 = ho1Var;
                    mmcVar.K.e(true, 0.0f);
                    mmcVar.M = false;
                    mmcVar.N = 0L;
                    mmcVar.b();
                    mmcVar.g();
                    mmcVar.t = 18.0f;
                    mmcVar.u.z();
                    p09Var.O(true, 0.0f);
                    p09Var.start();
                    mmcVar.H = true;
                    float f3 = mmcVar.R;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    mmcVar.j0 = ofFloat;
                    ofFloat.setDuration(2400L);
                    mmcVar.j0.setInterpolator(d53.h);
                    mmcVar.j0.addUpdateListener(new go1(mmcVar, f3, (byte) 7));
                    mmcVar.j0.addListener(new q7b(mmcVar, (byte) 27));
                    mmcVar.j0.start();
                    mmcVar.a.invalidate();
                    this.Q0.k.premiumEffectWasPlayed = true;
                    cf7.Y(this.I).U1(k47.B0(this.Q0.k), this.Q0.k);
                    return true;
                }
            }
        }
        return false;
    }

    public ImageReceiver getAvatarImage() {
        return null;
    }

    @Override // hg0
    public int getBoundsLeft() {
        if (R()) {
            int width = ((int) (getWidth() - (this.I0.T.f + gm.L(8.0f)))) / 2;
            return this.I0.p ? width : Math.min(this.b1, width);
        }
        if (U(this.Q0)) {
            return wi8.g(getWidth(), this.j1, 2, this.k0 / 2);
        }
        int i = this.b1;
        ImageReceiver imageReceiver = this.J;
        if (imageReceiver != null && imageReceiver.R0) {
            i = Math.min((int) imageReceiver.L0, i);
        }
        return (this.k0 / 2) + i;
    }

    @Override // hg0
    public int getBoundsRight() {
        if (R()) {
            int L = ((int) ((this.I0.T.f + gm.L(8.0f)) + getWidth())) / 2;
            return this.I0.p ? L : Math.max(this.c1, L);
        }
        if (U(this.Q0)) {
            return ((getWidth() + this.j1) / 2) + (this.k0 / 2);
        }
        int i = this.c1;
        ImageReceiver imageReceiver = this.J;
        if (imageReceiver != null && imageReceiver.R0) {
            i = Math.max((int) imageReceiver.w(), i);
        }
        return (this.k0 / 2) + i;
    }

    @Override // mk5
    public float getCheckBoxTranslation() {
        return 0.0f;
    }

    public c47 getCurrentPosition() {
        return null;
    }

    public int getCustomDate() {
        return this.R0;
    }

    public zl1 getDelegate() {
        return this.g1;
    }

    @Override // mk5
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

    @Override // mk5
    public k47 getMessageObject() {
        return this.Q0;
    }

    @Override // cr3
    public int getObserverTag() {
        return this.x;
    }

    public ImageReceiver getPhotoImage() {
        return this.J;
    }

    public l39 getReactionsLayout() {
        return this.F0;
    }

    @Override // mk5
    public float getSlidingOffsetX() {
        return 0.0f;
    }

    public bm1 getTransitionParams() {
        return this.x2;
    }

    public float getWalletSlidingOffset() {
        return this.N0;
    }

    public final void h0(int i, boolean z, boolean z2) {
        int i2 = this.R0;
        if (i2 == i || i2 / 3600 == i / 3600) {
            return;
        }
        String M0 = z ? i == 2147483646 ? jb6.M0(2131748249, "MessageScheduledUntilOnline") : jb6.a0("MessageScheduledOn", null, 2131748285, jb6.u(i, false)) : jb6.u(i, false);
        this.R0 = i;
        CharSequence charSequence = this.S0;
        if (charSequence == null || !TextUtils.equals(M0, charSequence)) {
            this.S0 = M0;
            this.s2 = null;
            l0(z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0b37  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0b9b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0ba4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0b8a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0a09  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0ab3  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0b23  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0943 A[EDGE_INSN: B:486:0x0943->B:482:0x0943 BREAK  A[LOOP:6: B:457:0x08f8->B:484:0x0940], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v104 */
    /* JADX WARN: Type inference failed for: r4v105 */
    /* JADX WARN: Type inference failed for: r4v6, types: [org.telegram.tgnet.TLRPC$messages_StickerSet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0(k47 k47Var, boolean z) {
        StaticLayout staticLayout;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i;
        ylb ylbVar;
        ImageReceiver imageReceiver;
        int i2;
        ylb ylbVar2;
        String str;
        k47 k47Var2;
        String str2;
        TLRPC.Document document;
        String str3;
        TLRPC.Document document2;
        String str4;
        ArrayList<TLRPC.TL_stickerPack> arrayList;
        k47 k47Var3;
        int i3;
        TLRPC.Document document3;
        TLRPC.Document document4;
        TLRPC.Document document5;
        de deVar;
        int i4;
        int i5;
        boolean z2;
        int i6;
        ImageReceiver imageReceiver2;
        TLRPC.PhotoSize photoSize;
        ImageReceiver imageReceiver3;
        TLRPC.VideoSize videoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z3;
        float f;
        RadialProgress2 radialProgress2;
        ImageReceiver imageReceiver4;
        TLRPC.WallPaper wallPaper;
        TLRPC.MessageAction messageAction;
        ylb ylbVar3;
        ImageReceiver imageReceiver5;
        bwb bwbVar;
        int i7;
        int paddingTop;
        int i8;
        TLRPC.Message message;
        String l;
        String str5;
        ActivityManager activityManager;
        k47 k47Var4 = k47Var;
        if (k47Var4 != null) {
            if (this.Q0 != k47Var4 && this.N0 != 0.0f) {
                setWalletSlidingOffset(0.0f);
            }
            k47 k47Var5 = this.Q0;
            if (k47Var5 != k47Var4) {
                this.r = null;
            }
            TLRPC.Message message2 = k47Var4.k;
            if ((message2 == null || !(message2.action instanceof TLRPC.TL_messageActionGramTransfer) || this.b2 == message2.send_state) && k47Var5 == k47Var4 && (((staticLayout = this.N) == null || TextUtils.equals(staticLayout.getText(), k47Var4.v)) && !((!this.E0 && k47Var4.C != null) || z || k47Var4.D == 21 || k47Var4.M1))) {
                return;
            }
            boolean z4 = e21.a;
            ArrayList arrayList2 = this.Y1;
            arrayList2.clear();
            this.Z1 = null;
            this.c2 = null;
            this.s2 = null;
            k47 k47Var6 = this.Q0;
            boolean z5 = k47Var6 == null || k47Var6.m1 != k47Var4.m1;
            if (k47Var6 != null) {
                k47Var4.o1 = k47Var6.o1;
            }
            if (!z5 && k47Var6 != null && S()) {
                k47Var4.k.premiumEffectWasPlayed |= this.Q0.k.premiumEffectWasPlayed;
            }
            this.Q0 = k47Var4;
            boolean S = S();
            byte b = 3;
            ylb ylbVar4 = this.h1;
            if (S && this.J0 == null) {
                mmc mmcVar = new mmc(this, ylbVar4);
                this.J0 = mmcVar;
                mmcVar.s0 = new vl1(this, b);
                mmcVar.n(this.K0);
            }
            mmc mmcVar2 = this.J0;
            if (mmcVar2 != null) {
                boolean S2 = S();
                cm1 cm1Var = mmcVar2.a;
                mmcVar2.n = S2;
                if (S2 && mmcVar2.m == null && !mmcVar2.o && wi8.A(cm1Var) && gda.o() != 0 && (activityManager = (ActivityManager) cm1Var.getContext().getSystemService("activity")) != null && activityManager.getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
                    lmc lmcVar = new lmc(mmcVar2, cm1Var.getContext(), new imc(mmcVar2, (byte) 1));
                    mmcVar2.m = lmcVar;
                    cm1Var.addView(lmcVar, new ViewGroup.LayoutParams(gm.L(42.0f), gm.L(42.0f)));
                }
                lmc lmcVar2 = mmcVar2.m;
                if (lmcVar2 != null) {
                    lmcVar2.setVisibility((!S2 || mmcVar2.o) ? 8 : 0);
                    mmcVar2.m.setPaused(!S2 || mmcVar2.o);
                }
                if (!S2) {
                    mmcVar2.f();
                    mmcVar2.k();
                }
            }
            TLRPC.Message message3 = k47Var4.k;
            int i9 = this.I;
            if (message3 != null && (message3.action instanceof TLRPC.TL_messageActionGramTransfer)) {
                oc7 r1 = oc7.r1(i9);
                long n = pg3.n(k47Var4.k.peer_id);
                if (m9c.C(n)) {
                    l = jb6.M0(2131742634, null);
                } else if (k47Var4.k.peer_id == null) {
                    str5 = null;
                    mmc mmcVar3 = this.J0;
                    boolean O3 = k47Var4.O3();
                    TLRPC.Message message4 = k47Var4.k;
                    mmcVar3.m(O3, (TLRPC.TL_messageActionGramTransfer) message4.action, str5, message4.send_state, z5, !message4.premiumEffectWasPlayed);
                    this.b2 = k47Var4.k.send_state;
                } else {
                    l = pg3.l(r1.a2(n));
                }
                str5 = l;
                mmc mmcVar32 = this.J0;
                boolean O32 = k47Var4.O3();
                TLRPC.Message message42 = k47Var4.k;
                mmcVar32.m(O32, (TLRPC.TL_messageActionGramTransfer) message42.action, str5, message42.send_state, z5, !message42.premiumEffectWasPlayed);
                this.b2 = k47Var4.k.send_state;
            }
            k47Var4.M1 = false;
            this.E0 = k47Var4.C != null;
            er3.q(i9).v(this);
            this.W = 0;
            this.H = false;
            am1 am1Var = this.t1;
            if (am1Var != null && z5) {
                gn.release(am1Var.i, am1Var.h);
                this.t1 = null;
                this.o1 = false;
            }
            if (z5 || k47Var4.H) {
                k47Var4.H = false;
                TLRPC.Message message5 = k47Var4.k;
                boolean z6 = (message5 == null || (tL_messageReactions = message5.reactions) == null || !tL_messageReactions.reactions_as_tags) ? false : true;
                boolean N5 = k47Var4.N5();
                l39 l39Var = this.F0;
                if (N5) {
                    l39Var.r(k47Var4, z6, ylbVar4);
                } else {
                    l39Var.r(null, false, ylbVar4);
                }
            }
            int i10 = k47Var4.D;
            ycb ycbVar = this.P0;
            if (i10 == 32) {
                if (ycbVar == null) {
                    ycb ycbVar2 = new ycb(i9, this, ylbVar4);
                    this.P0 = ycbVar2;
                    if (this.j2) {
                        ycbVar2.d.M(ycbVar2.b);
                    }
                }
                this.P0.c(k47Var4);
            } else if (ycbVar != null) {
                ycbVar.d.M(null);
                this.P0 = null;
            }
            if (this.I0 == null && (message = k47Var4.k) != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                ysa ysaVar = new ysa(i9, ylbVar4, this);
                this.I0 = ysaVar;
                if (this.j2) {
                    ysaVar.a();
                }
            }
            ysa ysaVar2 = this.I0;
            if (ysaVar2 != null) {
                ysaVar2.f(k47Var4, !z5);
            }
            ImageReceiver imageReceiver6 = this.J;
            imageReceiver6.N(0);
            imageReceiver6.e();
            if (k47Var4.D != 22) {
                this.K = null;
            }
            if (k47Var4.J0 != -1) {
                rve.b(this, 0.02f, 1.2f);
                this.l2 = Math.max(gm.L(250.0f), hg5.a(k47Var4.v, (TextPaint) O("paintChatActionText")));
                vq8 P0 = vg1.P0(k47Var4.v);
                if (P0 != null) {
                    P0.g = this;
                }
            } else {
                setStateListAnimator(null);
                this.l2 = 0;
            }
            boolean y4 = k47Var4.y4();
            pc0 pc0Var = this.M;
            if (y4) {
                TLRPC.User W1 = oc7.r1(i9).W1(Long.valueOf(k47Var4.k.media.user_id));
                pc0Var.q(W1);
                TL_stories.StoryItem storyItem = k47Var4.k.media.storyItem;
                if (storyItem == null || !storyItem.noforwards) {
                    y4b.x(imageReceiver6, storyItem);
                } else {
                    imageReceiver6.V(W1, pc0Var, null, true, 0, true);
                }
                imageReceiver6.q0((int) (this.i1 / 2.0f));
                ylbVar2 = ylbVar4;
            } else {
                int i11 = k47Var4.D;
                RadialProgress2 radialProgress22 = this.K1;
                if (i11 == 22) {
                    if (k47Var4.I1 == null) {
                        int size = k47Var4.p0.size();
                        for (int i12 = 0; i12 < size && !(((TLRPC.PhotoSize) k47Var4.p0.get(i12)) instanceof TLRPC.TL_photoStrippedSize); i12++) {
                        }
                    }
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = k47Var4.L1;
                    if (tL_channelAdminLogEvent != null) {
                        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                            wallPaper = ((TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction).new_value;
                            if (TextUtils.isEmpty(uf2.h(wallPaper))) {
                                boolean a = ylbVar4 != null ? ylbVar4.a() : cmb.I.o();
                                imageReceiver6.f();
                                String h = uf2.h(wallPaper);
                                int i13 = cl8.C0;
                                tz3 g = uf2.e(i9).g(fnb.d(h));
                                Drawable r0 = g == null ? cmb.r0() : cl8.f(i9, g, a);
                                this.K = r0;
                                if (r0 != null) {
                                    r0.setCallback(this);
                                }
                                ylbVar3 = ylbVar4;
                                imageReceiver5 = imageReceiver6;
                            } else if (wallPaper != null) {
                                String str6 = wallPaper.uploadingImage;
                                if (str6 != null) {
                                    imageReceiver6.Z(gn5.g(str6), "150_150_wallpaper" + wallPaper.id + a92.e(wallPaper.settings), null, null, a92.b(wallPaper), 0L, null, wallPaper, 1);
                                    this.K = null;
                                    imageReceiver5 = imageReceiver6;
                                    ylbVar3 = ylbVar4;
                                } else {
                                    TLRPC.WallPaper wallPaper2 = wallPaper;
                                    TLObject tLObject = k47Var4.n0;
                                    gn5 b2 = gn5.b(tLObject instanceof TLRPC.Document ? (TLRPC.Document) tLObject : wallPaper2.document);
                                    StringBuilder sb = new StringBuilder("150_150_wallpaper");
                                    ylbVar3 = ylbVar4;
                                    sb.append(wallPaper2.id);
                                    sb.append(a92.e(wallPaper2.settings));
                                    imageReceiver6.Z(b2, sb.toString(), null, null, a92.b(wallPaper2), 0L, null, wallPaper2, 1);
                                    imageReceiver5 = imageReceiver6;
                                    this.K = null;
                                }
                            } else {
                                ylbVar3 = ylbVar4;
                                imageReceiver5 = imageReceiver6;
                                this.K = null;
                            }
                            imageReceiver5.q0((int) (this.i1 / 2.0f));
                            if (P(k47Var) != 1.0f) {
                                boolean z7 = !z5;
                                radialProgress22.o(z7, 1.0f);
                                radialProgress22.setIcon(4, z7, z7);
                            } else {
                                boolean z8 = !z5;
                                radialProgress22.setIcon(3, z8, z8);
                            }
                            ylbVar2 = ylbVar3;
                        }
                    }
                    TLRPC.Message message6 = k47Var4.k;
                    wallPaper = (message6 == null || (messageAction = message6.action) == null) ? null : messageAction.wallpaper;
                    if (TextUtils.isEmpty(uf2.h(wallPaper))) {
                    }
                    imageReceiver5.q0((int) (this.i1 / 2.0f));
                    if (P(k47Var) != 1.0f) {
                    }
                    ylbVar2 = ylbVar3;
                } else {
                    if (i11 == 21) {
                        imageReceiver6.q0((int) (this.i1 / 2.0f));
                        imageReceiver6.v0 = true;
                        imageReceiver6.h1 = null;
                        TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) k47Var4.k.action;
                        TLRPC.VideoSize x = bc4.x(1000, tL_messageActionSuggestProfilePhoto.photo.video_sizes);
                        ArrayList<TLRPC.VideoSize> arrayList3 = tL_messageActionSuggestProfilePhoto.photo.video_sizes;
                        gn5 j = (arrayList3 == null || arrayList3.isEmpty()) ? null : gn5.j(x, tL_messageActionSuggestProfilePhoto.photo);
                        TLRPC.Photo photo = k47Var4.k.action.photo;
                        if (k47Var4.I1 == null) {
                            int size2 = k47Var4.p0.size();
                            for (int i14 = 0; i14 < size2; i14++) {
                                photoSize2 = (TLRPC.PhotoSize) k47Var4.p0.get(i14);
                                if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                    break;
                                }
                            }
                        }
                        photoSize2 = null;
                        TLRPC.PhotoSize w = bc4.w(k47Var4.p0, 1000, false, null, false);
                        if (w == null) {
                            i = i9;
                            z3 = false;
                            ylbVar = ylbVar4;
                            f = 1.0f;
                            radialProgress2 = radialProgress22;
                            imageReceiver4 = imageReceiver6;
                        } else if (x != null) {
                            i = i9;
                            ylbVar = ylbVar4;
                            f = 1.0f;
                            radialProgress2 = radialProgress22;
                            z3 = false;
                            imageReceiver6.Y(j, "g", gn5.i(w, photo), "150_150", gn5.f(photoSize2, k47Var4.n0), "50_50_b", k47Var4.I1, 0L, null, k47Var, 0);
                            imageReceiver4 = imageReceiver6;
                            k47Var4 = k47Var;
                        } else {
                            i = i9;
                            z3 = false;
                            ylbVar = ylbVar4;
                            f = 1.0f;
                            radialProgress2 = radialProgress22;
                            imageReceiver6.Z(gn5.i(w, photo), "150_150", gn5.f(photoSize2, k47Var4.n0), "50_50_b", k47Var4.I1, 0L, null, k47Var4, 0);
                            imageReceiver4 = imageReceiver6;
                        }
                        imageReceiver4.v0 = z3;
                        wn5 wn5Var = (wn5) oc7.r1(i).n4.get(k47Var4.k.local_id);
                        if (wn5Var == null || wn5Var.X == f) {
                            boolean z9 = !z5;
                            radialProgress2.o(z9, f);
                            radialProgress2.setIcon(4, z9, z9);
                        } else {
                            boolean z10 = !z5;
                            radialProgress2.setIcon(3, z10, z10);
                        }
                    } else {
                        i = i9;
                        ylbVar = ylbVar4;
                        int i15 = 0;
                        byte b3 = 2;
                        if (i11 == 31 || i11 == 33 || i11 == 30 || i11 == 18 || i11 == 25 || i11 == 35) {
                            imageReceiver6.q0(0);
                            TLRPC.MessageAction messageAction2 = k47Var4.k.action;
                            if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                                long g2 = oc7.r1(i).l4.H.g(TimeUnit.SECONDS);
                                if (tL_messageActionNoForwardsRequest.expired) {
                                    imageReceiver = imageReceiver6;
                                } else {
                                    imageReceiver = imageReceiver6;
                                    if (k47Var4.k.date + g2 >= ConnectionsManager.getInstance(i).getCurrentTime()) {
                                        z2 = false;
                                        this.a2 = z2;
                                        if (!k47Var4.N3() || tL_messageActionNoForwardsRequest.expired || this.a2) {
                                            i6 = 8;
                                        } else {
                                            ArrayList arrayList4 = new ArrayList();
                                            i6 = 8;
                                            arrayList4.add(new gr0[]{new ir0(7, 2131751351, org.telegram.messenger.beta.R.drawable.filled_bot_decline_24), new ir0(8, 2131751352, org.telegram.messenger.beta.R.drawable.filled_bot_approve_24)});
                                            this.Z1 = new de((gr0[][]) arrayList4.toArray(new gr0[arrayList4.size()][]), i15, b3);
                                        }
                                        i2 = i6;
                                        i9 = i;
                                        ylbVar2 = ylbVar;
                                        document = null;
                                    }
                                }
                                z2 = true;
                                this.a2 = z2;
                                if (k47Var4.N3()) {
                                }
                                i6 = 8;
                                i2 = i6;
                                i9 = i;
                                ylbVar2 = ylbVar;
                                document = null;
                            } else {
                                imageReceiver = imageReceiver6;
                                if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                    TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction2;
                                    TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                    if (starGift != null) {
                                        document5 = brb.e(starGift);
                                        i2 = 8;
                                        lx4 lx4Var = this.T0;
                                        if (lx4Var == null) {
                                            ylbVar2 = ylbVar;
                                            lx4Var = new lx4(this, ylbVar2, false);
                                            this.T0 = lx4Var;
                                        } else {
                                            ylbVar2 = ylbVar;
                                        }
                                        lx4Var.d((TL_stars.starGiftAttributeBackdrop) jva.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                        this.T0.e((TL_stars.starGiftAttributePattern) jva.i(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                    } else {
                                        i2 = 8;
                                        ylbVar2 = ylbVar;
                                        document5 = null;
                                    }
                                    this.a2 = tL_messageActionStarGiftPurchaseOffer.expires_at < ConnectionsManager.getInstance(i).getCurrentTime();
                                    if (!k47Var4.N3() && !tL_messageActionStarGiftPurchaseOffer.accepted && !tL_messageActionStarGiftPurchaseOffer.declined && !this.a2) {
                                        ArrayList arrayList5 = new ArrayList();
                                        arrayList5.add(new gr0[]{new ir0(5, 2131749663, org.telegram.messenger.beta.R.drawable.filled_bot_decline_24), new ir0(6, 2131749673, org.telegram.messenger.beta.R.drawable.filled_bot_approve_24)});
                                        this.Z1 = new de((gr0[][]) arrayList5.toArray(new gr0[arrayList5.size()][]), i15, b3);
                                    }
                                    document = document5;
                                    i9 = i;
                                } else {
                                    i2 = 8;
                                    ylbVar2 = ylbVar;
                                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftOnchainOffer) {
                                        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) messageAction2;
                                        TL_stars.StarGift starGift2 = tL_messageActionStarGiftOnchainOffer.gift;
                                        if (starGift2 != null) {
                                            document4 = brb.e(starGift2);
                                            lx4 lx4Var2 = this.T0;
                                            if (lx4Var2 == null) {
                                                lx4Var2 = new lx4(this, ylbVar2, false);
                                                this.T0 = lx4Var2;
                                            }
                                            lx4Var2.d((TL_stars.starGiftAttributeBackdrop) jva.i(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                            this.T0.e((TL_stars.starGiftAttributePattern) jva.i(starGift2.attributes, TL_stars.starGiftAttributePattern.class));
                                        } else {
                                            document4 = null;
                                        }
                                        this.c2 = tL_messageActionStarGiftOnchainOffer;
                                        i9 = i;
                                        boolean i16 = yr7.i(i9, tL_messageActionStarGiftOnchainOffer);
                                        this.d2 = i16;
                                        this.e2 = -1;
                                        this.a2 = !i16;
                                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                                            rx4 rx4Var = this.g2;
                                            if (rx4Var == null) {
                                                rx4Var = new rx4(this, 0.85f);
                                                this.g2 = rx4Var;
                                            }
                                            if (!tL_messageActionStarGiftOnchainOffer.buyer && (tL_messageActionStarGiftOnchainOffer.accepted || tL_messageActionStarGiftOnchainOffer.settled)) {
                                                rx4Var.f(-698031);
                                                this.g2.g(10, jb6.M0(2131749526, null), false);
                                            } else {
                                                rx4Var.e((TL_stars.starGiftAttributeBackdrop) jva.i(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class), false, false);
                                                this.g2.g(9, "#".concat(jb6.E(((TL_stars.TL_starGiftUnique) starGift2).num, ',')), true);
                                            }
                                        }
                                    } else {
                                        i9 = i;
                                        if (!(messageAction2 instanceof TLRPC.TL_messageActionSetChatTheme)) {
                                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                                TL_stars.StarGift starGift3 = ((TLRPC.TL_messageActionStarGift) messageAction2).gift;
                                                if (starGift3 != null) {
                                                    document = starGift3.sticker;
                                                    k47Var3 = k47Var4;
                                                    str2 = null;
                                                    k47Var2 = null;
                                                    deVar = this.Z1;
                                                    if (deVar != null) {
                                                        int length = ((gr0[][]) deVar.c).length;
                                                        int i17 = 0;
                                                        while (i17 < length) {
                                                            int length2 = ((gr0[][]) this.Z1.c)[i17].length;
                                                            int i18 = 0;
                                                            while (i18 < length2) {
                                                                gr0 gr0Var = ((gr0[][]) this.Z1.c)[i17][i18];
                                                                int i19 = length;
                                                                wp0 wp0Var = new wp0(new vl1(this, (byte) 4));
                                                                wp0Var.j = (ir0) gr0Var;
                                                                int c = gr0Var.c();
                                                                if (c != 0) {
                                                                    Drawable drawable = getResources().getDrawable(c);
                                                                    wp0Var.t = drawable;
                                                                    i4 = i17;
                                                                    i5 = length2;
                                                                    drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                                                } else {
                                                                    i4 = i17;
                                                                    i5 = length2;
                                                                }
                                                                wp0Var.f = gm.L(40.0f);
                                                                int i20 = wp0Var.g | 8;
                                                                wp0Var.g = i20;
                                                                int b4 = iqd.b(i20, 1, i18 == 0);
                                                                wp0Var.g = b4;
                                                                wp0Var.g = iqd.b(b4, 2, i18 == 1);
                                                                wp0Var.h = new uib(gr0Var.d(), (TextPaint) O("paintChatBotButton"));
                                                                arrayList2.add(wp0Var);
                                                                i18++;
                                                                length = i19;
                                                                i17 = i4;
                                                                length2 = i5;
                                                            }
                                                            i17++;
                                                        }
                                                    }
                                                    this.M1 = k47Var4.n1;
                                                    this.I1 = document;
                                                    if (document == null) {
                                                        ImageReceiver imageReceiver7 = imageReceiver;
                                                        imageReceiver7.v0 = true;
                                                        int i21 = k47Var4.D;
                                                        if (i21 != 31 && i21 != 37 && i21 != 33) {
                                                            imageReceiver7.h1 = this.O1;
                                                        }
                                                        this.J1 = null;
                                                        int i22 = 0;
                                                        while (true) {
                                                            if (i22 >= document.video_thumbs.size()) {
                                                                break;
                                                            }
                                                            if ("f".equals(document.video_thumbs.get(i22).type)) {
                                                                this.J1 = document.video_thumbs.get(i22);
                                                                break;
                                                            }
                                                            i22++;
                                                        }
                                                        if (z5 || k47Var4.D != 18) {
                                                            meb f2 = eq3.f(document, cmb.Z6, 0.3f, null);
                                                            imageReceiver7.M(0);
                                                            gn5 b5 = gn5.b(document);
                                                            Locale locale = Locale.US;
                                                            imageReceiver7.d0(b5, hg9.j(k47Var4.m1, "160_160_nr_messageId="), f2, "tgs", k47Var3, 1);
                                                        }
                                                    } else if (str2 != null) {
                                                        hs6.d0(i9).d1(str2, false, k47Var2 == null);
                                                    }
                                                }
                                                document = null;
                                                k47Var3 = k47Var4;
                                                str2 = null;
                                                k47Var2 = null;
                                                deVar = this.Z1;
                                                if (deVar != null) {
                                                }
                                                this.M1 = k47Var4.n1;
                                                this.I1 = document;
                                                if (document == null) {
                                                }
                                            } else {
                                                if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                                                    if (tL_messageActionStarGiftUnique.refunded) {
                                                        TL_stars.StarGift starGift4 = tL_messageActionStarGiftUnique.gift;
                                                        if (starGift4 != null) {
                                                            document = starGift4.getDocument();
                                                            k47Var3 = k47Var4;
                                                            str2 = null;
                                                            k47Var2 = null;
                                                            deVar = this.Z1;
                                                            if (deVar != null) {
                                                            }
                                                            this.M1 = k47Var4.n1;
                                                            this.I1 = document;
                                                            if (document == null) {
                                                            }
                                                        }
                                                        document = null;
                                                        k47Var3 = k47Var4;
                                                        str2 = null;
                                                        k47Var2 = null;
                                                        deVar = this.Z1;
                                                        if (deVar != null) {
                                                        }
                                                        this.M1 = k47Var4.n1;
                                                        this.I1 = document;
                                                        if (document == null) {
                                                        }
                                                    }
                                                }
                                                if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                                    str = z8c.h(i9).d0;
                                                    if (str == null) {
                                                        hs6.d0(i9).E();
                                                        return;
                                                    }
                                                } else {
                                                    str = z8c.h(i9).c0;
                                                    if (str == null) {
                                                        hs6.d0(i9).B();
                                                        return;
                                                    }
                                                }
                                                TLRPC.TL_messages_stickerSet q0 = hs6.d0(i9).q0(str);
                                                ?? r4 = q0;
                                                if (q0 == null) {
                                                    r4 = hs6.d0(i9).o0(str);
                                                }
                                                if (r4 != 0) {
                                                    TLRPC.MessageAction messageAction3 = k47Var4.k.action;
                                                    int i23 = messageAction3.months;
                                                    if (k47Var4.D == 30) {
                                                        String str7 = "3⃣";
                                                        if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                                            long j2 = messageAction3.cryptoAmount;
                                                            if (j2 > 10000000000L) {
                                                                if (j2 <= 50000000000L) {
                                                                    str7 = "1⃣";
                                                                }
                                                                i3 = 0;
                                                                while (true) {
                                                                    if (i3 < r4.packs.size()) {
                                                                        break;
                                                                    }
                                                                    TLRPC.TL_stickerPack tL_stickerPack = r4.packs.get(i3);
                                                                    if (TextUtils.equals(tL_stickerPack.emoticon, str7) && !tL_stickerPack.documents.isEmpty()) {
                                                                        long longValue = tL_stickerPack.documents.get(0).longValue();
                                                                        for (int i24 = 0; i24 < r4.documents.size(); i24++) {
                                                                            document3 = r4.documents.get(i24);
                                                                            if (document3 != null && document3.id == longValue) {
                                                                                break;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i3++;
                                                                    }
                                                                }
                                                                document3 = null;
                                                                str3 = str;
                                                                document2 = document3;
                                                            }
                                                            str7 = "2⃣";
                                                            i3 = 0;
                                                            while (true) {
                                                                if (i3 < r4.packs.size()) {
                                                                }
                                                                i3++;
                                                            }
                                                            document3 = null;
                                                            str3 = str;
                                                            document2 = document3;
                                                        } else {
                                                            long j3 = messageAction3 instanceof TLRPC.TL_messageActionGiftStars ? ((TLRPC.TL_messageActionGiftStars) messageAction3).stars : ((TLRPC.TL_messageActionPrizeStars) messageAction3).stars;
                                                            if (j3 > 1000) {
                                                                if (j3 >= 2500) {
                                                                    str7 = "4⃣";
                                                                }
                                                                i3 = 0;
                                                                while (true) {
                                                                    if (i3 < r4.packs.size()) {
                                                                    }
                                                                    i3++;
                                                                }
                                                                document3 = null;
                                                                str3 = str;
                                                                document2 = document3;
                                                            }
                                                            str7 = "2⃣";
                                                            i3 = 0;
                                                            while (true) {
                                                                if (i3 < r4.packs.size()) {
                                                                }
                                                                i3++;
                                                            }
                                                            document3 = null;
                                                            str3 = str;
                                                            document2 = document3;
                                                        }
                                                        deVar = this.Z1;
                                                        if (deVar != null) {
                                                        }
                                                        this.M1 = k47Var4.n1;
                                                        this.I1 = document;
                                                        if (document == null) {
                                                        }
                                                    } else {
                                                        String str8 = (String) y2.get(Integer.valueOf(i23));
                                                        ArrayList<TLRPC.TL_stickerPack> arrayList6 = r4.packs;
                                                        int size3 = arrayList6.size();
                                                        int i25 = 0;
                                                        TLRPC.Document document6 = null;
                                                        while (true) {
                                                            if (i25 >= size3) {
                                                                str3 = str;
                                                                break;
                                                            }
                                                            TLRPC.TL_stickerPack tL_stickerPack2 = arrayList6.get(i25);
                                                            i25++;
                                                            TLRPC.TL_stickerPack tL_stickerPack3 = tL_stickerPack2;
                                                            if (Objects.equals(tL_stickerPack3.emoticon, str8)) {
                                                                ArrayList<Long> arrayList7 = tL_stickerPack3.documents;
                                                                int size4 = arrayList7.size();
                                                                TLRPC.Document document7 = document6;
                                                                int i26 = i15;
                                                                while (true) {
                                                                    if (i26 >= size4) {
                                                                        str3 = str;
                                                                        str4 = str8;
                                                                        arrayList = arrayList6;
                                                                        break;
                                                                    }
                                                                    Long l2 = arrayList7.get(i26);
                                                                    i26++;
                                                                    long longValue2 = l2.longValue();
                                                                    ArrayList<TLRPC.Document> arrayList8 = r4.documents;
                                                                    str3 = str;
                                                                    int size5 = arrayList8.size();
                                                                    ArrayList<Long> arrayList9 = arrayList7;
                                                                    int i27 = 0;
                                                                    while (true) {
                                                                        if (i27 >= size5) {
                                                                            str4 = str8;
                                                                            arrayList = arrayList6;
                                                                            break;
                                                                        }
                                                                        TLRPC.Document document8 = arrayList8.get(i27);
                                                                        i27++;
                                                                        int i28 = size5;
                                                                        TLRPC.Document document9 = document8;
                                                                        str4 = str8;
                                                                        arrayList = arrayList6;
                                                                        if (document9.id == longValue2) {
                                                                            document7 = document9;
                                                                            break;
                                                                        } else {
                                                                            str8 = str4;
                                                                            size5 = i28;
                                                                            arrayList6 = arrayList;
                                                                        }
                                                                    }
                                                                    if (document7 != null) {
                                                                        break;
                                                                    }
                                                                    str = str3;
                                                                    arrayList7 = arrayList9;
                                                                    str8 = str4;
                                                                    arrayList6 = arrayList;
                                                                }
                                                                document6 = document7;
                                                            } else {
                                                                str3 = str;
                                                                str4 = str8;
                                                                arrayList = arrayList6;
                                                            }
                                                            if (document6 != null) {
                                                                break;
                                                            }
                                                            str = str3;
                                                            str8 = str4;
                                                            arrayList6 = arrayList;
                                                            i15 = 0;
                                                        }
                                                        document2 = document6;
                                                    }
                                                    if (document2 == null && !r4.documents.isEmpty()) {
                                                        document2 = r4.documents.get(0);
                                                    }
                                                    k47Var3 = r4;
                                                    document = document2;
                                                    str2 = str3;
                                                    k47Var2 = k47Var3;
                                                    deVar = this.Z1;
                                                    if (deVar != null) {
                                                    }
                                                    this.M1 = k47Var4.n1;
                                                    this.I1 = document;
                                                    if (document == null) {
                                                    }
                                                } else {
                                                    k47Var2 = r4;
                                                    str2 = str;
                                                    document = null;
                                                    k47Var3 = null;
                                                    deVar = this.Z1;
                                                    if (deVar != null) {
                                                    }
                                                    this.M1 = k47Var4.n1;
                                                    this.I1 = document;
                                                    if (document == null) {
                                                    }
                                                }
                                            }
                                            if (!this.l0 && this.f0 && this.j0 && (this.g0 || this.h0 || this.i0)) {
                                                this.m0 = gm.L(33.0f);
                                                bwb bwbVar2 = this.o0;
                                                if (bwbVar2 == null) {
                                                    bwbVar2 = new bwb(i9, this, ylbVar2, true);
                                                    this.o0 = bwbVar2;
                                                    bwbVar2.s = new vl1(this, (byte) 5);
                                                }
                                                if (bwbVar2.e(this.Q0)) {
                                                    if (this.j2) {
                                                        this.o0.a();
                                                    }
                                                    i7 = 0;
                                                } else {
                                                    this.o0.b();
                                                    this.o0 = null;
                                                    i7 = 0;
                                                    this.m0 = 0;
                                                }
                                            } else {
                                                bwbVar = this.o0;
                                                if (bwbVar != null) {
                                                    bwbVar.b();
                                                    this.o0 = null;
                                                }
                                                i7 = 0;
                                                this.m0 = 0;
                                            }
                                            paddingTop = getPaddingTop();
                                            i8 = this.m0;
                                            if (paddingTop != i8) {
                                                setPadding(i7, i8, i7, i7);
                                            }
                                            this.U1.setVisibility((U(k47Var) || R()) ? i2 : i7);
                                            no4.b(k47Var4);
                                            requestLayout();
                                        }
                                        TL_stars.StarGift starGift5 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) messageAction2).theme).gift;
                                        if (starGift5 != null) {
                                            document4 = brb.e(starGift5);
                                            lx4 lx4Var3 = this.T0;
                                            if (lx4Var3 == null) {
                                                lx4Var3 = new lx4(this, ylbVar2, false);
                                                this.T0 = lx4Var3;
                                            }
                                            lx4Var3.d((TL_stars.starGiftAttributeBackdrop) jva.i(starGift5.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                            this.T0.e((TL_stars.starGiftAttributePattern) jva.i(starGift5.attributes, TL_stars.starGiftAttributePattern.class));
                                        } else {
                                            document4 = null;
                                        }
                                    }
                                    document = document4;
                                }
                            }
                            str2 = null;
                            k47Var2 = null;
                            k47Var3 = null;
                            deVar = this.Z1;
                            if (deVar != null) {
                            }
                            this.M1 = k47Var4.n1;
                            this.I1 = document;
                            if (document == null) {
                            }
                            if (!this.l0) {
                            }
                            bwbVar = this.o0;
                            if (bwbVar != null) {
                            }
                            i7 = 0;
                            this.m0 = 0;
                            paddingTop = getPaddingTop();
                            i8 = this.m0;
                            if (paddingTop != i8) {
                            }
                            this.U1.setVisibility((U(k47Var) || R()) ? i2 : i7);
                            no4.b(k47Var4);
                            requestLayout();
                        }
                        if (i11 == 37) {
                            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(((TLRPC.TL_messageActionChangeCommunity) k47Var4.k.action).community_id));
                            imageReceiver6.v0 = true;
                            imageReceiver6.h1 = null;
                            imageReceiver6.q0(gm.L(14.0f));
                            imageReceiver6.N(1);
                            pc0Var.p(L0);
                            imageReceiver6.U(L0, new df1(getContext(), gm.L(14.0f)), L0);
                        } else if (i11 == 11) {
                            imageReceiver6.v0 = true;
                            imageReceiver6.h1 = null;
                            imageReceiver6.q0(gm.u / 2);
                            imageReceiver6.N(1);
                            pc0Var.j(k47.B0(k47Var4.k), null, null, null);
                            if (k47Var4.k.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                                imageReceiver2 = imageReceiver6;
                                imageReceiver2.d0(null, null, pc0Var, null, k47Var4, 0);
                            } else {
                                imageReceiver2 = imageReceiver6;
                                if (k47Var4.I1 == null) {
                                    int size6 = k47Var4.p0.size();
                                    for (int i29 = 0; i29 < size6; i29++) {
                                        photoSize = (TLRPC.PhotoSize) k47Var4.p0.get(i29);
                                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                            break;
                                        }
                                    }
                                }
                                photoSize = null;
                                TLRPC.PhotoSize w2 = bc4.w(k47Var4.p0, 640, false, null, false);
                                if (w2 != null) {
                                    TLRPC.Photo photo2 = k47Var4.k.action.photo;
                                    if (!photo2.video_sizes.isEmpty()) {
                                        boolean z11 = gda.a;
                                        if (e86.e(2048)) {
                                            videoSize = bc4.x(1000, photo2.video_sizes);
                                            if (!k47Var4.z0 && !er3.q(i).c(4, videoSize.size)) {
                                                this.y0 = gn5.j(videoSize, photo2);
                                                er3.q(i).a(bc4.r(null, videoSize), k47Var4, this);
                                            }
                                            if (videoSize == null) {
                                                imageReceiver2.Z(gn5.j(videoSize, photo2), "g", gn5.f(photoSize, k47Var4.n0), "50_50_b", k47Var4.I1, 0L, null, k47Var4, 1);
                                            } else {
                                                imageReceiver2.Z(gn5.f(w2, k47Var4.n0), "150_150", gn5.f(photoSize, k47Var4.n0), "50_50_b", k47Var4.I1, 0L, null, k47Var4, 1);
                                            }
                                        }
                                    }
                                    videoSize = null;
                                    if (videoSize == null) {
                                    }
                                } else {
                                    imageReceiver3 = imageReceiver2;
                                    imageReceiver3.g0(pc0Var);
                                    imageReceiver3.v0(!PhotoViewer.P0(k47Var4), false);
                                }
                            }
                            imageReceiver3 = imageReceiver2;
                            imageReceiver3.v0(!PhotoViewer.P0(k47Var4), false);
                        } else {
                            imageReceiver6.v0 = true;
                            imageReceiver6.h1 = null;
                            imageReceiver6.g0(null);
                        }
                    }
                    i9 = i;
                    ylbVar2 = ylbVar;
                }
            }
            i2 = 8;
            if (!this.l0) {
            }
            bwbVar = this.o0;
            if (bwbVar != null) {
            }
            i7 = 0;
            this.m0 = 0;
            paddingTop = getPaddingTop();
            i8 = this.m0;
            if (paddingTop != i8) {
            }
            this.U1.setVisibility((U(k47Var) || R()) ? i2 : i7);
            no4.b(k47Var4);
            requestLayout();
        }
    }

    @Override // hg0, android.view.View
    public final void invalidate() {
        super.invalidate();
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.u2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.t2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // mk5
    public final boolean j() {
        return false;
    }

    public final void j0(float f, int i) {
        this.x0 = true;
        this.w0 = i;
        this.u0 = f;
        this.v0 = 0.0f;
    }

    public final void k0() {
        final byte b = 1;
        final byte b2 = 0;
        if (this.c2 != null && this.d2 && this.Q0 != null) {
            boolean a0 = a0();
            boolean z = this.f2;
            if (a0 != z) {
                this.f2 = !z;
                final k47 k47Var = this.Q0;
                post(new Runnable(this) { // from class: yl1
                    public final /* synthetic */ cm1 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        k47 k47Var2 = k47Var;
                        cm1 cm1Var = this.b;
                        switch (b3) {
                            case 0:
                                if (cm1Var.Q0 == k47Var2) {
                                    cm1Var.i0(k47Var2, true);
                                    cm1Var.requestLayout();
                                    break;
                                }
                                break;
                            default:
                                if (cm1Var.Q0 == k47Var2) {
                                    cm1Var.i0(k47Var2, true);
                                    cm1Var.requestLayout();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        }
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        if (tL_messageActionStarGiftOnchainOffer == null || !this.d2 || this.Q0 == null || this.t1 == null) {
            return;
        }
        HashMap hashMap = yr7.a;
        int i = tL_messageActionStarGiftOnchainOffer.expires_at;
        int i2 = this.I;
        int max = Math.max(0, i - ConnectionsManager.getInstance(i2).getCurrentTime());
        int i3 = this.e2;
        if (max <= 0) {
            if (i3 != 0) {
                this.e2 = 0;
                this.d2 = yr7.i(i2, this.c2);
                final k47 k47Var2 = this.Q0;
                post(new Runnable(this) { // from class: yl1
                    public final /* synthetic */ cm1 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b;
                        k47 k47Var22 = k47Var2;
                        cm1 cm1Var = this.b;
                        switch (b3) {
                            case 0:
                                if (cm1Var.Q0 == k47Var22) {
                                    cm1Var.i0(k47Var22, true);
                                    cm1Var.requestLayout();
                                    break;
                                }
                                break;
                            default:
                                if (cm1Var.Q0 == k47Var22) {
                                    cm1Var.i0(k47Var22, true);
                                    cm1Var.requestLayout();
                                    break;
                                }
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (max != i3) {
            this.e2 = max;
            this.t1.a(this.t1.c, this.G1, c0(yr7.d(this.c2), this.c2));
        }
        postInvalidateDelayed(1016 - (System.currentTimeMillis() % 1000));
    }

    public final void l0(boolean z) {
        if (getMeasuredWidth() != 0) {
            C(getMeasuredWidth(), this.S0);
            invalidate();
        }
        if (this.D0) {
            v();
        } else if (z) {
            gm.c3(new vl1(this, (byte) 0));
        } else {
            requestLayout();
        }
    }

    @Override // mk5
    public final boolean m() {
        return false;
    }

    @Override // mk5
    public final boolean n() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        zl1 zl1Var;
        super.onAttachedToWindow();
        this.j2 = true;
        this.J.I();
        setStarsPaused(false);
        this.s0 = gn.update(0, this, (!this.s || (zl1Var = this.g1) == null || zl1Var.f()) ? false : true, this.s0, this.N);
        am1 am1Var = this.t1;
        if (am1Var != null) {
            am1Var.h = gn.update(0, (View) am1Var.i, false, am1Var.h, am1Var.d);
        }
        int i = this.I;
        nm7.f(i).b(this, nm7.Y2);
        nm7.f(i).b(this, nm7.Z2);
        nm7.f(i).b(this, nm7.H3);
        nm7.f(i).b(this, nm7.y0);
        nm7.f(i).b(this, nm7.e4);
        nm7.e().b(this, nm7.m4);
        nm7.e().b(this, nm7.L3);
        k47 k47Var = this.Q0;
        if (k47Var != null && k47Var.D == 21) {
            i0(k47Var, true);
        }
        ysa ysaVar = this.I0;
        if (ysaVar != null) {
            ysaVar.a();
        }
        l39 l39Var = this.F0;
        ArrayList arrayList = l39Var.s;
        l39Var.D = true;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((i39) arrayList.get(i2)).a();
        }
        bwb bwbVar = this.o0;
        if (bwbVar != null) {
            bwbVar.a();
        }
        ycb ycbVar = this.P0;
        if (ycbVar != null) {
            ycbVar.d.M(ycbVar.b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.j2 = false;
        int i = this.I;
        er3.q(i).v(this);
        this.J.K();
        setStarsPaused(true);
        this.D0 = false;
        gn.release(this, this.s0);
        am1 am1Var = this.t1;
        if (am1Var != null) {
            gn.release(am1Var.i, am1Var.h);
        }
        nm7.f(i).n(this, nm7.Y2);
        nm7.f(i).n(this, nm7.Z2);
        nm7.f(i).n(this, nm7.H3);
        nm7.f(i).n(this, nm7.y0);
        nm7.f(i).n(this, nm7.e4);
        nm7.e().n(this, nm7.m4);
        nm7.e().n(this, nm7.L3);
        this.e0.g();
        this.x2.a = false;
        ysa ysaVar = this.I0;
        if (ysaVar != null) {
            ysaVar.S = false;
            ysaVar.d.K();
            ysaVar.e.b();
            gw4 gw4Var = ysaVar.y;
            gw4Var.d.K();
            gn.release((View) null, gw4Var.q);
            gw4Var.q = null;
        }
        this.F0.p();
        bwb bwbVar = this.o0;
        if (bwbVar != null) {
            bwbVar.b();
        }
        ycb ycbVar = this.P0;
        if (ycbVar != null) {
            ycbVar.d.M(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0602, code lost:
    
        if (r3 == 33) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0de3, code lost:
    
        if (yr7.l(r37, r1.offer_id) == false) goto L395;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0549 A[LOOP:1: B:109:0x0547->B:110:0x0549, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0bca  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0bd3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0bdd  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0c23  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0d25  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0d41  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0dd3  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0e66  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0e98  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0ed3  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0f38  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0f05  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0f0f  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0f07  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0ed8  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0eae  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0e0e  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0d2f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0bf1  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x068f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        TextPaint textPaint;
        int i3;
        ArrayList arrayList;
        int i4;
        RadialProgress2 radialProgress2;
        int i5;
        cm1 cm1Var;
        float f;
        int L;
        int i6;
        int i7;
        float L2;
        StaticLayout staticLayout;
        int i8;
        Canvas canvas2;
        float f2;
        float f3;
        float f4;
        uib uibVar;
        am1 am1Var;
        StaticLayout staticLayout2;
        ylb ylbVar;
        RectF rectF;
        boolean z;
        float i9;
        Paint O;
        boolean a;
        ColorMatrixColorFilter colorMatrixColorFilter;
        ColorMatrix colorMatrix;
        int i10;
        float f5;
        float f6;
        cm1 cm1Var2;
        int i11;
        uib uibVar2;
        zl1 zl1Var;
        int size;
        int i12;
        Canvas canvas3 = canvas;
        canvas3.save();
        canvas3.translate(this.k0 / 2.0f, getPaddingTop());
        k47 k47Var = this.Q0;
        float d = this.r1.d(!this.p1);
        int i13 = this.i1;
        boolean R = R();
        v4b v4bVar = this.e0;
        TextPaint textPaint2 = this.G1;
        ImageReceiver imageReceiver = this.J;
        if (!R && this.P0 == null && U(k47Var)) {
            this.i1 = this.j1 - gm.L(106.0f);
            if (X()) {
                i13 = M(k47Var);
                float f7 = (this.W - i13) / 2.0f;
                float L3 = gm.L(16.0f) + gm.L(4.0f) + this.T + this.P;
                if (k47Var.y4()) {
                    v4bVar.d = k47Var.k.media.storyItem;
                }
                float f8 = i13;
                v4bVar.F.set(f7, L3, f7 + f8, f8 + L3);
                int i14 = k47Var.D;
                if (i14 == 31 || i14 == 33 || i14 == 34 || i14 == 35) {
                    f7 += gm.L(10.0f);
                    L3 += gm.L(10.0f);
                    i13 -= gm.L(20.0f);
                }
                if (k47Var.D == 37) {
                    f7 += gm.L(2.0f);
                }
                imageReceiver.i0(f7, L3, Math.max(0, i13), Math.max(0, i13));
                int i15 = k47Var.D;
                if (i15 == 31 || i15 == 33 || i15 == 34 || i15 == 35) {
                    i13 = gm.L(20.0f) + i13;
                }
            } else {
                int i16 = k47Var.D;
                if (i16 == 11) {
                    int i17 = this.W;
                    float f9 = this.i1;
                    imageReceiver.i0((i17 - r3) / 2.0f, (this.j1 * 0.075f) + this.T + this.P, f9, f9);
                } else if (i16 == 25) {
                    i13 = (int) (this.i1 * (gm.O1() ? 1.0f : 1.2f));
                    float f10 = i13;
                    imageReceiver.i0((this.W - i13) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - gm.L(22.0f), f10, f10);
                } else if (k47Var.r4()) {
                    float f11 = i13;
                    imageReceiver.i0((this.W - i13) / 2.0f, (this.j1 * 0.075f) + this.T + this.P + gm.L(2.0f), f11, f11);
                } else {
                    int i18 = k47Var.D;
                    int i19 = this.i1;
                    if (i18 == 30) {
                        i13 = (int) (i19 * 1.1f);
                        TLRPC.Message message = k47Var.k;
                        if (message == null || (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                            float f12 = i13;
                            imageReceiver.i0((this.W - i13) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - gm.L(12.0f), f12, f12);
                        } else {
                            float f13 = i13;
                            imageReceiver.i0((this.W - i13) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - gm.L(22.0f), f13, f13);
                        }
                    } else {
                        i13 = (int) (i19 * 1.0f);
                        float f14 = i13;
                        imageReceiver.i0((this.W - i13) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - gm.L(4.0f), f14, f14);
                    }
                }
            }
            TextPaint textPaint3 = (TextPaint) O("paintChatActionText");
            this.t0 = textPaint3;
            if (textPaint3 != null) {
                TextPaint textPaint4 = this.F1;
                if (textPaint4 != null && textPaint4.getColor() != this.t0.getColor()) {
                    textPaint4.setColor(this.t0.getColor());
                }
                TextPaint textPaint5 = this.H1;
                if (textPaint5 != null && textPaint5.getColor() != this.t0.getColor()) {
                    textPaint5.setColor(this.t0.getColor());
                    textPaint5.linkColor = this.t0.getColor();
                }
                if (textPaint2 != null && textPaint2.getColor() != this.t0.getColor()) {
                    textPaint2.setColor(this.t0.getColor());
                    textPaint2.linkColor = this.t0.getColor();
                }
            }
        }
        int i20 = i13;
        F(canvas3, false);
        if (S()) {
            canvas3.save();
            int width = getWidth();
            this.J0.getClass();
            float h = (width - mmc.h()) / 2.0f;
            this.L0 = h;
            float walletActionTop = getWalletActionTop();
            this.M0 = walletActionTop;
            canvas3.translate(h, walletActionTop);
            this.J0.o((this.k0 / 2.0f) + this.L0, this.M0 + getPaddingTop());
            this.J0.d(canvas3);
            canvas3.restore();
        }
        boolean R2 = R();
        int i21 = this.I;
        RadialProgress2 radialProgress22 = this.K1;
        if (R2) {
            canvas3.save();
            float width2 = (getWidth() - this.I0.d()) / 2.0f;
            this.G0 = width2;
            float L4 = this.I0.p ? gm.L(4.0f) : gm.L(16.0f) + this.T + this.P;
            this.H0 = L4;
            canvas3.translate(width2, L4);
            this.I0.b(canvas3);
            zl1 zl1Var2 = this.g1;
            if (zl1Var2 == null || zl1Var2.f()) {
                this.I0.c(canvas3);
            }
            canvas3.restore();
        } else if (this.P0 != null) {
            canvas3.save();
            this.P0.a(canvas3);
            canvas3.restore();
        } else if (U(k47Var) || (k47Var != null && k47Var.D == 11)) {
            lx4 lx4Var = this.T0;
            if (lx4Var != null && ((i2 = k47Var.D) == 31 || i2 == 37 || i2 == 33)) {
                lx4Var.setBounds((int) (imageReceiver.L0 - gm.L(13.33f)), (int) (imageReceiver.M0 - gm.L(14.0f)), (int) (imageReceiver.L0 + imageReceiver.N0 + gm.L(13.33f)), (int) (imageReceiver.M0 + imageReceiver.O0 + gm.L(14.0f)));
                this.T0.draw(canvas3);
            }
            if (this.K != null) {
                canvas3.save();
                canvas3.translate(imageReceiver.L0, imageReceiver.M0);
                Path path = this.L;
                if (path == null) {
                    this.L = new Path();
                } else {
                    path.rewind();
                }
                Path path2 = this.L;
                float f15 = imageReceiver.N0 / 2.0f;
                path2.addCircle(f15, imageReceiver.O0 / 2.0f, f15, Path.Direction.CW);
                canvas3.clipPath(this.L);
                this.K.setBounds(0, 0, (int) imageReceiver.N0, (int) imageReceiver.O0);
                this.K.draw(canvas3);
                canvas3.restore();
            } else if (k47Var.y4()) {
                TLRPC.MessageMedia messageMedia = k47Var.k.media;
                long j = messageMedia.user_id;
                v4bVar.c = messageMedia.id;
                y4b.h(j, canvas3, imageReceiver, v4bVar);
            } else {
                imageReceiver.g(canvas3);
            }
            G(canvas);
            k0();
            if (k47Var.D == 37) {
                ur3.a(canvas3, cmb.R0, imageReceiver.L0 + gm.L(26.0f), imageReceiver.M0 + gm.L(26.0f), gm.L(52.0f));
            }
            float f16 = imageReceiver.L0;
            float f17 = imageReceiver.M0;
            radialProgress22.a.set(f16, f17, imageReceiver.N0 + f16, imageReceiver.O0 + f17);
            int i22 = k47Var.D;
            if (i22 != 21) {
                i = 22;
                if (i22 == 22) {
                    float P = P(k47Var);
                    radialProgress22.o(true, P);
                    radialProgress22.setCircleRadius(gm.L(26.0f));
                    radialProgress22.G = gm.L(24.0f);
                    radialProgress22.g(cmb.bf, cmb.cf, cmb.df, cmb.ef);
                    if (P == 1.0f) {
                        radialProgress22.setIcon(4, true, true);
                    } else {
                        radialProgress22.setIcon(3, true, true);
                    }
                    radialProgress22.draw(canvas3);
                }
                textPaint = this.t0;
                i3 = i;
                arrayList = this.q0;
                if (textPaint != null || this.N == null) {
                    i4 = i21;
                    radialProgress2 = radialProgress22;
                    i5 = i3;
                } else {
                    canvas3.save();
                    canvas3.translate(this.U, this.T);
                    if (this.N.getPaint() != this.t0) {
                        v();
                    }
                    canvas3.save();
                    rna.d(canvas3, arrayList);
                    rna.f(canvas3, this.N);
                    zl1 zl1Var3 = this.g1;
                    if (zl1Var3 == null || zl1Var3.f()) {
                        StaticLayout staticLayout3 = this.N;
                        radialProgress2 = radialProgress22;
                        i4 = i21;
                        i5 = i3;
                        gn.drawAnimatedEmojis(canvas, staticLayout3, this.s0, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout3 == null ? null : K(staticLayout3.getPaint().getColor()));
                        canvas3 = canvas;
                    } else {
                        i4 = i21;
                        radialProgress2 = radialProgress22;
                        i5 = i3;
                    }
                    canvas3.restore();
                    int size2 = arrayList.size();
                    int i23 = 0;
                    while (i23 < size2) {
                        Object obj = arrayList.get(i23);
                        i23++;
                        rna rnaVar = (rna) obj;
                        rnaVar.h(this.N.getPaint().getColor());
                        rnaVar.draw(canvas3);
                    }
                    canvas3.restore();
                }
                if (this.t0 != null && this.Q != null) {
                    canvas3.save();
                    canvas3.translate(this.V, this.T - this.R);
                    if (this.Q.getPaint() != this.t0) {
                        v();
                    }
                    canvas3.save();
                    rna.d(canvas3, arrayList);
                    rna.f(canvas3, this.Q);
                    zl1Var = this.g1;
                    if (zl1Var != null || zl1Var.f()) {
                        StaticLayout staticLayout4 = this.Q;
                        cn cnVar = this.s0;
                        StaticLayout staticLayout5 = this.N;
                        gn.drawAnimatedEmojis(canvas, staticLayout4, cnVar, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout5 != null ? null : K(staticLayout5.getPaint().getColor()));
                        canvas3 = canvas;
                    }
                    canvas3.restore();
                    size = arrayList.size();
                    i12 = 0;
                    while (i12 < size) {
                        Object obj2 = arrayList.get(i12);
                        i12++;
                        rna rnaVar2 = (rna) obj2;
                        rnaVar2.h(this.Q.getPaint().getColor());
                        rnaVar2.draw(canvas3);
                    }
                    canvas3.restore();
                }
                if (R() && U(k47Var)) {
                    canvas3.save();
                    float f18 = (this.W - this.j1) / 2.0f;
                    if (k47Var.D != i5) {
                        f18 += gm.L(8.0f);
                    }
                    float f19 = f18;
                    if (X()) {
                        RectF rectF2 = this.N1;
                        f = rectF2 != null ? rectF2.top : gm.L(4.0f) + this.T + this.P;
                        L = gm.L(16.0f);
                        if (i20 > 0) {
                            L = (L << 1) + i20;
                        }
                    } else {
                        float f20 = (this.j1 * 0.075f) + this.T + this.P;
                        if (k47Var.D != 21) {
                            i20 = this.i1;
                        }
                        float L5 = f20 + i20 + gm.L(4.0f);
                        if (k47Var.D == 21) {
                            L5 += gm.L(16.0f);
                        }
                        f = L5;
                        if (k47Var.r4()) {
                            L = gm.L(12.0f);
                        } else {
                            if (k47Var.D == 30 && !k47Var.r4()) {
                                f -= gm.L(3.66f);
                            }
                            i6 = k47Var.D;
                            if (i6 != 31 || i6 == 37) {
                                i7 = 33;
                            } else {
                                i7 = 33;
                            }
                            f -= gm.L(3.66f);
                            canvas3.translate(f19, f);
                            if (this.k1 == null) {
                                canvas3.save();
                                canvas3.translate(((this.j1 - gm.L(16.0f)) - this.k1.getWidth()) / 2.0f, 0.0f);
                                this.k1.draw(canvas3);
                                canvas3.restore();
                                float height = this.k1.getHeight() + f;
                                if (this.n1 != null) {
                                    canvas3.save();
                                    canvas3.translate(((this.j1 - gm.L(16.0f)) - this.n1.getWidth()) / 2.0f, gm.L(4.0f) + this.k1.getHeight());
                                    this.n1.draw(canvas3);
                                    canvas3.restore();
                                    height += gm.L(10.0f) + this.n1.getHeight();
                                }
                                L2 = height + gm.L(k47Var.D == 25 ? 6.0f : 0.0f);
                            } else {
                                L2 = f - gm.L(4.0f);
                            }
                            float f21 = L2;
                            canvas3.restore();
                            staticLayout = this.k1;
                            int i24 = TLObject.FLAG_28;
                            if (staticLayout != null || (uibVar2 = this.m1) == null) {
                                i8 = i7;
                                canvas2 = canvas3;
                                f2 = 0.0f;
                            } else {
                                float j2 = uibVar2.j() + gm.L(12.0f);
                                float z2 = aq1.z(this.j1 - gm.L(16.0f), j2, 2.0f, f19);
                                float height2 = f + this.k1.getHeight() + gm.L(14.0f);
                                Paint paint = this.l1;
                                if (paint == null) {
                                    paint = new Paint(1);
                                    this.l1 = paint;
                                }
                                paint.setColor(cmb.h1() ? 285212671 : 268435456);
                                RectF rectF3 = gm.P;
                                rectF3.set(z2, height2 - gm.L(8.0f), j2 + z2, gm.L(8.0f) + height2);
                                canvas3.drawRoundRect(rectF3, gm.L(8.0f), gm.L(8.0f), this.l1);
                                Canvas canvas4 = canvas3;
                                f2 = 0.0f;
                                i8 = 33;
                                this.m1.c(z2 + gm.L(6.0f), height2, 1.0f, -855638017, canvas4);
                                canvas2 = canvas4;
                                f21 += gm.L(24.0f);
                            }
                            float L6 = f21 + gm.L(4.0f);
                            if (k47Var.D == 18) {
                                L6 += gm.L(2.0f);
                            }
                            float f22 = L6;
                            canvas2.save();
                            canvas2.translate(f19, f22);
                            if (k47Var.D != i5) {
                                RadialProgress2 radialProgress23 = radialProgress2;
                                if ((radialProgress23.c ? radialProgress23.j : radialProgress23.i).b() == 1.0f) {
                                    i10 = 4;
                                    if (radialProgress23.a() == 4) {
                                        if (this.t1 != null) {
                                            canvas2.save();
                                            canvas2.translate((this.j1 - this.t1.d.getWidth()) / 2.0f, f2);
                                            this.t1.a = ((this.j1 - r3.d.getWidth()) / 2.0f) + f19;
                                            this.t1.b = f22;
                                            int color = textPaint2.getColor();
                                            am1 am1Var2 = this.t1;
                                            f5 = f19;
                                            f3 = f2;
                                            rna.g(this, false, color, 0, am1Var2.g, 1, am1Var2.d, am1Var2.f, canvas, false);
                                            am1 am1Var3 = this.t1;
                                            gn.drawAnimatedEmojis(canvas, am1Var3.d, am1Var3.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, K(textPaint2.getColor()));
                                            canvas3 = canvas;
                                            canvas3.restore();
                                            cm1Var = this;
                                            f4 = f5;
                                        } else {
                                            f3 = f2;
                                            cm1Var = this;
                                            canvas3 = canvas2;
                                            f4 = f19;
                                        }
                                    }
                                } else {
                                    i10 = 4;
                                }
                                f5 = f19;
                                f3 = f2;
                                int i25 = i8;
                                canvas3 = canvas2;
                                if (this.B1 == null) {
                                    TextPaint textPaint6 = new TextPaint();
                                    this.A1 = textPaint6;
                                    textPaint6.setTextSize(gm.L(13.0f));
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.L0(2131754555));
                                    int indexOf = spannableStringBuilder.toString().indexOf("...");
                                    if (indexOf < 0) {
                                        indexOf = spannableStringBuilder.toString().indexOf("…");
                                        i11 = 1;
                                    } else {
                                        i11 = 3;
                                    }
                                    if (indexOf >= 0) {
                                        SpannableString spannableString = new SpannableString("…");
                                        r8c r8cVar = new r8c();
                                        r8cVar.r = true;
                                        r8cVar.b(this);
                                        f6 = 0.2f;
                                        spannableString.setSpan(r8cVar, 0, spannableString.length(), i25);
                                        spannableStringBuilder.replace(indexOf, indexOf + i11, (CharSequence) spannableString);
                                    } else {
                                        f6 = 0.2f;
                                    }
                                    TextPaint textPaint7 = this.A1;
                                    am1 am1Var4 = this.t1;
                                    this.B1 = new StaticLayout(spannableStringBuilder, textPaint7, am1Var4 == null ? 1 : am1Var4.c, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                } else {
                                    f6 = 0.2f;
                                }
                                float P2 = P(k47Var);
                                if (this.D1 == null || this.C1 != P2) {
                                    this.C1 = P2;
                                    String k = hg9.k(new StringBuilder(), (int) (P2 * 100.0f), "%");
                                    am1 am1Var5 = this.t1;
                                    this.D1 = new StaticLayout(k, textPaint2, am1Var5 == null ? 1 : am1Var5.c, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                }
                                this.A1.setColor(textPaint2.getColor());
                                if (radialProgress23.a() == i10) {
                                    float b = (radialProgress23.c ? radialProgress23.j : radialProgress23.i).b();
                                    int color2 = textPaint2.getColor();
                                    float f23 = 1.0f - b;
                                    this.A1.setAlpha((int) (Color.alpha(color2) * f23));
                                    textPaint2.setAlpha((int) (Color.alpha(color2) * b));
                                    textPaint2.linkColor = textPaint2.getColor();
                                    if (this.t1 != null) {
                                        float f24 = (b * f6) + 0.8f;
                                        canvas3.save();
                                        canvas3.scale(f24, f24, this.j1 / 2.0f, this.t1.d.getHeight() / 2.0f);
                                        canvas3.translate((this.j1 - this.t1.d.getWidth()) / 2.0f, f3);
                                        this.t1.a = ((this.j1 - r1.d.getWidth()) / 2.0f) + f5;
                                        this.t1.b = f22;
                                        int color3 = textPaint2.getColor();
                                        am1 am1Var6 = this.t1;
                                        rna.g(this, false, color3, 0, am1Var6.g, 1, am1Var6.d, am1Var6.f, canvas3, false);
                                        am1 am1Var7 = this.t1;
                                        cm1Var2 = this;
                                        gn.drawAnimatedEmojis(canvas, am1Var7.d, am1Var7.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, K(textPaint2.getColor()));
                                        canvas3 = canvas;
                                        canvas3.restore();
                                    } else {
                                        cm1Var2 = this;
                                    }
                                    textPaint2.setAlpha((int) (Color.alpha(color2) * f23));
                                    textPaint2.linkColor = textPaint2.getColor();
                                    float f25 = (f23 * f6) + 0.8f;
                                    canvas3.save();
                                    canvas3.scale(f25, f25, cm1Var2.j1 / 2.0f, cm1Var2.B1.getHeight() / 2.0f);
                                    canvas3.translate((cm1Var2.j1 - cm1Var2.B1.getWidth()) / 2.0f, f3);
                                    rna.f(canvas3, cm1Var2.B1);
                                    canvas3.restore();
                                    canvas3.save();
                                    canvas3.translate(f3, gm.L(4.0f) + cm1Var2.B1.getHeight());
                                    canvas3.scale(f25, f25, cm1Var2.j1 / 2.0f, cm1Var2.D1.getHeight() / 2.0f);
                                    canvas3.translate((cm1Var2.j1 - cm1Var2.D1.getWidth()) / 2.0f, f3);
                                    rna.f(canvas3, cm1Var2.D1);
                                    canvas3.restore();
                                    textPaint2.setColor(color2);
                                    textPaint2.linkColor = color2;
                                } else {
                                    cm1Var2 = this;
                                    canvas3.save();
                                    canvas3.translate((cm1Var2.j1 - cm1Var2.B1.getWidth()) / 2.0f, f3);
                                    cm1Var2.B1.draw(canvas3);
                                    canvas3.restore();
                                    canvas3.save();
                                    canvas3.translate((cm1Var2.j1 - cm1Var2.D1.getWidth()) / 2.0f, gm.L(4.0f) + cm1Var2.B1.getHeight());
                                    rna.f(canvas3, cm1Var2.D1);
                                    canvas3.restore();
                                }
                                cm1Var = cm1Var2;
                                f4 = f5;
                            } else {
                                f3 = f2;
                                canvas3 = canvas2;
                                am1 am1Var8 = this.t1;
                                if (am1Var8 != null) {
                                    float height3 = am1Var8.d.getHeight();
                                    if (d < 1.0f) {
                                        height3 = gm.R1(this.q1, height3, d);
                                        RectF rectF4 = gm.P;
                                        rectF4.set(f3, -gm.L(20.0f), getWidth(), height3);
                                        canvas3.saveLayerAlpha(rectF4, nm7.d4, 31);
                                    } else {
                                        canvas3.save();
                                    }
                                    canvas3.translate(((this.j1 - gm.L(16.0f)) - this.t1.d.getWidth()) / 2.0f, f3);
                                    this.t1.a = (((this.j1 - gm.L(16.0f)) - this.t1.d.getWidth()) / 2.0f) + f19;
                                    am1 am1Var9 = this.t1;
                                    am1Var9.b = f22;
                                    int color4 = am1Var9.e.getColor();
                                    am1 am1Var10 = this.t1;
                                    float f26 = height3;
                                    f4 = f19;
                                    rna.g(this, false, color4, 0, am1Var10.g, 1, am1Var10.d, am1Var10.f, canvas3, false);
                                    am1 am1Var11 = this.t1;
                                    StaticLayout staticLayout6 = am1Var11.d;
                                    cn cnVar2 = am1Var11.h;
                                    ColorFilter K = K(textPaint2.getColor());
                                    cm1Var = this;
                                    gn.drawAnimatedEmojis(canvas, staticLayout6, cnVar2, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, K);
                                    canvas3 = canvas;
                                    if (d < 1.0f && cm1Var.x1 != null) {
                                        canvas3.save();
                                        if (cm1Var.s1 == null) {
                                            cm1Var.s1 = new in3((byte) 7);
                                        }
                                        canvas3.translate((-((cm1Var.j1 - gm.L(16.0f)) - cm1Var.t1.d.getWidth())) / 2.0f, f3);
                                        RectF rectF5 = gm.P;
                                        rectF5.set((cm1Var.u1 - cm1Var.x1.c) + gm.L(8.0f), (cm1Var.v1 - cm1Var.w1) - gm.L(6.0f), gm.L(6.0f) + cm1Var.u1, cm1Var.v1);
                                        float f27 = 1.0f - d;
                                        cm1Var.s1.p(canvas3, rectF5, f27);
                                        rectF5.set((cm1Var.u1 - cm1Var.x1.c) - gm.L(16.0f), (cm1Var.v1 - cm1Var.w1) - gm.L(6.0f), (cm1Var.u1 - cm1Var.x1.c) + gm.L(8.0f), cm1Var.v1);
                                        cm1Var.s1.r(canvas3, rectF5, 2, f27);
                                        rectF5.set(f3, f26 - gm.L(12.0f), cm1Var.getWidth(), f26);
                                        cm1Var.s1.r(canvas3, rectF5, 3, (1.0f - f27) * f27 * 4.0f);
                                        canvas3.restore();
                                    }
                                    canvas3.restore();
                                    if (d < 1.0f && (uibVar = cm1Var.x1) != null) {
                                        uibVar.c((cm1Var.u1 - uibVar.c) + gm.L(5.0f), (cm1Var.v1 - (cm1Var.w1 / 2.0f)) - gm.L(1.0f), 1.0f - d, cm1Var.t1.e.getColor(), canvas3);
                                    }
                                } else {
                                    cm1Var = this;
                                    f4 = f19;
                                }
                            }
                            canvas3.restore();
                            am1Var = cm1Var.t1;
                            if (am1Var != null) {
                                am1Var.d.getHeight();
                            }
                            staticLayout2 = cm1Var.y1;
                            if (staticLayout2 != null) {
                                staticLayout2.getHeight();
                            }
                            cm1Var.getHeight();
                            ylbVar = cm1Var.h1;
                            if (ylbVar == null) {
                                ylbVar.b(cm1Var.v0, cm1Var.u0 + gm.L(4.0f), cm1Var.getMeasuredWidth(), cm1Var.w0);
                            } else {
                                cmb.q(cm1Var.v0, cm1Var.u0 + gm.L(4.0f), cm1Var.getMeasuredWidth(), cm1Var.w0);
                            }
                            float a2 = cm1Var.n.a(0.02f);
                            canvas3.save();
                            rectF = cm1Var.p0;
                            canvas3.scale(a2, a2, rectF.centerX(), rectF.centerY());
                            if (cm1Var.y1 != null) {
                                canvas3.drawRoundRect(rectF, gm.L(15.0f), gm.L(15.0f), cm1Var.O("paintChatActionBackgroundSelected"));
                                if (cm1Var.Q()) {
                                    canvas3.drawRoundRect(rectF, gm.L(15.0f), gm.L(15.0f), cm1Var.O("paintChatActionBackgroundDarken"));
                                }
                                float f28 = cm1Var.h2;
                                Paint paint2 = cm1Var.i2;
                                if (f28 > f3) {
                                    canvas3.drawRoundRect(rectF, gm.L(15.0f), gm.L(15.0f), paint2);
                                }
                                if (cm1Var.getMessageObject().D == 31 || cm1Var.getMessageObject().D == 37 || cm1Var.getMessageObject().D == 33) {
                                    boolean a3 = ylbVar != null ? ylbVar.a() : cmb.h1();
                                    int color5 = paint2.getColor();
                                    if (a3) {
                                        i24 = 620756991;
                                    }
                                    paint2.setColor(i24);
                                    canvas3.drawRoundRect(rectF, gm.L(15.0f), gm.L(15.0f), paint2);
                                    paint2.setColor(color5);
                                }
                                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = cm1Var.c2;
                                if ((tL_messageActionStarGiftOnchainOffer == null || tL_messageActionStarGiftOnchainOffer.buyer) && (cm1Var.getMessageObject().D == 31 || cm1Var.getMessageObject().D == 37 || cm1Var.getMessageObject().D == 33 || cm1Var.getMessageObject().D == 21 || cm1Var.getMessageObject().D == 22 || cm1Var.getMessageObject().D == 24)) {
                                    cm1Var.invalidate();
                                } else {
                                    Path path3 = cm1Var.V1;
                                    path3.rewind();
                                    path3.addRoundRect(rectF, gm.L(16.0f), gm.L(16.0f), Path.Direction.CW);
                                    canvas3.save();
                                    canvas3.clipPath(path3);
                                    cta ctaVar = cm1Var.W1;
                                    ctaVar.d(canvas3);
                                    if (!ctaVar.g) {
                                        cm1Var.invalidate();
                                    }
                                    canvas3.restore();
                                }
                            }
                            z = k47Var.q;
                            float f29 = cm1Var.d0;
                            if (z) {
                                if (f29 != f3) {
                                    f29 -= 0.10666667f;
                                    cm1Var.d0 = f29;
                                }
                            } else if (f29 != 1.0f) {
                                f29 += 0.10666667f;
                                cm1Var.d0 = f29;
                            }
                            i9 = Utilities.i(f29, 1.0f, f3);
                            cm1Var.d0 = i9;
                            if (i9 != f3) {
                                if (cm1Var.c0 == null) {
                                    cm1Var.c0 = new RadialProgressView(cm1Var.getContext());
                                }
                                int L7 = gm.L(16.0f);
                                canvas3.save();
                                float f30 = cm1Var.d0;
                                canvas3.scale(f30, f30, rectF.centerX(), rectF.centerY());
                                cm1Var.c0.setSize(L7);
                                cm1Var.c0.setProgressColor(cmb.u0(cmb.Yc));
                                cm1Var.c0.a(canvas3, rectF.centerX(), rectF.centerY());
                                canvas3.restore();
                            }
                            if (cm1Var.d0 != 1.0f && cm1Var.y1 != null) {
                                canvas3.save();
                                float f31 = 1.0f - cm1Var.d0;
                                canvas3.scale(f31, f31, rectF.centerX(), rectF.centerY());
                                canvas3.translate(f4, rectF.top + gm.L(7.0f));
                                canvas3.translate(((cm1Var.j1 - gm.L(16.0f)) - cm1Var.y1.getWidth()) / 2.0f, f3);
                                cm1Var.y1.draw(canvas3);
                                canvas3.restore();
                            }
                            if (!k47Var.r) {
                                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer2 = cm1Var.c2;
                                if (tL_messageActionStarGiftOnchainOffer2 != null && cm1Var.d2) {
                                }
                                qa6 qa6Var = cm1Var.r;
                                if (qa6Var != null) {
                                    qa6Var.e(rectF);
                                    cm1Var.r.j(16.0f);
                                    cm1Var.r.a();
                                    cm1Var.r.draw(canvas3);
                                    if (cm1Var.r.c()) {
                                        cm1Var.r.b = -1L;
                                    }
                                }
                                canvas3.restore();
                                if (cm1Var.N1 != null && cm1Var.S1 != null && cm1Var.T1 != null) {
                                    O = cm1Var.O("paintChatActionBackground");
                                    Paint O2 = cm1Var.O("paintChatActionBackgroundDarken");
                                    float L8 = (cm1Var.N1.right - gm.L(65.0f)) + gm.L(2.0f);
                                    float L9 = cm1Var.N1.top - gm.L(2.0f);
                                    if (ylbVar == null) {
                                        ylbVar.b(cm1Var.v0 + L8, cm1Var.u0 + gm.L(4.0f) + L9, cm1Var.getMeasuredWidth(), cm1Var.w0);
                                    } else {
                                        cmb.q(cm1Var.v0 + L8, cm1Var.u0 + gm.L(4.0f) + L9, cm1Var.getMeasuredWidth(), cm1Var.w0);
                                    }
                                    canvas3.save();
                                    canvas3.translate(L8, L9);
                                    ColorFilter colorFilter = O.getColorFilter();
                                    PathEffect pathEffect = O.getPathEffect();
                                    a = ylbVar == null ? ylbVar.a() : cmb.h1();
                                    colorMatrixColorFilter = cm1Var.Q1;
                                    if (colorMatrixColorFilter != null || cm1Var.P1 != a) {
                                        colorMatrix = new ColorMatrix();
                                        if ((O.getColorFilter() instanceof ColorMatrixColorFilter) && Build.VERSION.SDK_INT >= 26) {
                                            ((ColorMatrixColorFilter) O.getColorFilter()).getColorMatrix(colorMatrix);
                                        }
                                        gm.h(colorMatrix, !a ? 0.1f : -0.08f);
                                        gm.i(colorMatrix, a ? 0.15f : 0.1f);
                                        ColorMatrixColorFilter colorMatrixColorFilter2 = new ColorMatrixColorFilter(colorMatrix);
                                        cm1Var.Q1 = colorMatrixColorFilter2;
                                        cm1Var.P1 = a;
                                        colorMatrixColorFilter = colorMatrixColorFilter2;
                                    }
                                    O.setColorFilter(colorMatrixColorFilter);
                                    O.setPathEffect(cm1Var.R1);
                                    canvas3.drawPath(cm1Var.S1, O);
                                    O.setColorFilter(colorFilter);
                                    O.setPathEffect(pathEffect);
                                    if (cm1Var.Q()) {
                                        PathEffect pathEffect2 = O2.getPathEffect();
                                        O2.setPathEffect(cm1Var.R1);
                                        canvas3.drawPath(cm1Var.S1, O2);
                                        O2.setPathEffect(pathEffect2);
                                    }
                                    canvas3.rotate(45.0f, gm.L(40.43f), gm.L(24.56f));
                                    cm1Var.T1.c(gm.L(40.43f) - (cm1Var.T1.c / 2.0f), gm.L(26.0f), 1.0f, -1, canvas3);
                                    canvas3.restore();
                                }
                            }
                            if (cm1Var.r == null) {
                                qa6 qa6Var2 = new qa6(ylbVar);
                                cm1Var.r = qa6Var2;
                                qa6Var2.setCallback(cm1Var);
                                qa6 qa6Var3 = cm1Var.r;
                                qa6Var3.t = 2.0f;
                                qa6Var3.D = true;
                                qa6Var3.g(cmb.p1(0.08f, -1), cmb.p1(0.2f, -1), cmb.p1(0.2f, -1), cmb.p1(0.7f, -1));
                                cm1Var.r.x.setStrokeWidth(gm.L(1.0f));
                            }
                            qa6 qa6Var4 = cm1Var.r;
                            qa6Var4.c = -1L;
                            qa6Var4.e(rectF);
                            cm1Var.r.j(16.0f);
                            cm1Var.r.draw(canvas3);
                            canvas3.restore();
                            if (cm1Var.N1 != null) {
                                O = cm1Var.O("paintChatActionBackground");
                                Paint O22 = cm1Var.O("paintChatActionBackgroundDarken");
                                float L82 = (cm1Var.N1.right - gm.L(65.0f)) + gm.L(2.0f);
                                float L92 = cm1Var.N1.top - gm.L(2.0f);
                                if (ylbVar == null) {
                                }
                                canvas3.save();
                                canvas3.translate(L82, L92);
                                ColorFilter colorFilter2 = O.getColorFilter();
                                PathEffect pathEffect3 = O.getPathEffect();
                                if (ylbVar == null) {
                                }
                                colorMatrixColorFilter = cm1Var.Q1;
                                if (colorMatrixColorFilter != null) {
                                }
                                colorMatrix = new ColorMatrix();
                                if (O.getColorFilter() instanceof ColorMatrixColorFilter) {
                                    ((ColorMatrixColorFilter) O.getColorFilter()).getColorMatrix(colorMatrix);
                                }
                                gm.h(colorMatrix, !a ? 0.1f : -0.08f);
                                gm.i(colorMatrix, a ? 0.15f : 0.1f);
                                ColorMatrixColorFilter colorMatrixColorFilter22 = new ColorMatrixColorFilter(colorMatrix);
                                cm1Var.Q1 = colorMatrixColorFilter22;
                                cm1Var.P1 = a;
                                colorMatrixColorFilter = colorMatrixColorFilter22;
                                O.setColorFilter(colorMatrixColorFilter);
                                O.setPathEffect(cm1Var.R1);
                                canvas3.drawPath(cm1Var.S1, O);
                                O.setColorFilter(colorFilter2);
                                O.setPathEffect(pathEffect3);
                                if (cm1Var.Q()) {
                                }
                                canvas3.rotate(45.0f, gm.L(40.43f), gm.L(24.56f));
                                cm1Var.T1.c(gm.L(40.43f) - (cm1Var.T1.c / 2.0f), gm.L(26.0f), 1.0f, -1, canvas3);
                                canvas3.restore();
                            }
                        }
                    }
                    f += L;
                    i6 = k47Var.D;
                    if (i6 != 31) {
                    }
                    i7 = 33;
                    f -= gm.L(3.66f);
                    canvas3.translate(f19, f);
                    if (this.k1 == null) {
                    }
                    float f212 = L2;
                    canvas3.restore();
                    staticLayout = this.k1;
                    int i242 = TLObject.FLAG_28;
                    if (staticLayout != null) {
                    }
                    i8 = i7;
                    canvas2 = canvas3;
                    f2 = 0.0f;
                    float L62 = f212 + gm.L(4.0f);
                    if (k47Var.D == 18) {
                    }
                    float f222 = L62;
                    canvas2.save();
                    canvas2.translate(f19, f222);
                    if (k47Var.D != i5) {
                    }
                    canvas3.restore();
                    am1Var = cm1Var.t1;
                    if (am1Var != null) {
                    }
                    staticLayout2 = cm1Var.y1;
                    if (staticLayout2 != null) {
                    }
                    cm1Var.getHeight();
                    ylbVar = cm1Var.h1;
                    if (ylbVar == null) {
                    }
                    float a22 = cm1Var.n.a(0.02f);
                    canvas3.save();
                    rectF = cm1Var.p0;
                    canvas3.scale(a22, a22, rectF.centerX(), rectF.centerY());
                    if (cm1Var.y1 != null) {
                    }
                    z = k47Var.q;
                    float f292 = cm1Var.d0;
                    if (z) {
                    }
                    i9 = Utilities.i(f292, 1.0f, f3);
                    cm1Var.d0 = i9;
                    if (i9 != f3) {
                    }
                    if (cm1Var.d0 != 1.0f) {
                        canvas3.save();
                        float f312 = 1.0f - cm1Var.d0;
                        canvas3.scale(f312, f312, rectF.centerX(), rectF.centerY());
                        canvas3.translate(f4, rectF.top + gm.L(7.0f));
                        canvas3.translate(((cm1Var.j1 - gm.L(16.0f)) - cm1Var.y1.getWidth()) / 2.0f, f3);
                        cm1Var.y1.draw(canvas3);
                        canvas3.restore();
                    }
                    if (!k47Var.r) {
                    }
                    if (cm1Var.r == null) {
                    }
                    qa6 qa6Var42 = cm1Var.r;
                    qa6Var42.c = -1L;
                    qa6Var42.e(rectF);
                    cm1Var.r.j(16.0f);
                    cm1Var.r.draw(canvas3);
                    canvas3.restore();
                    if (cm1Var.N1 != null) {
                    }
                } else {
                    cm1Var = this;
                }
                cm1Var.I(canvas3, false);
                cm1Var.x2.a();
                canvas3.restore();
            }
            wn5 wn5Var = (wn5) oc7.r1(i21).n4.get(k47Var.k.local_id);
            if (wn5Var != null) {
                radialProgress22.o(true, wn5Var.X);
                radialProgress22.setCircleRadius(((int) (imageReceiver.N0 * 0.5f)) + 1);
                radialProgress22.G = gm.L(24.0f);
                radialProgress22.g(cmb.bf, cmb.cf, cmb.df, cmb.ef);
                if (wn5Var.X == 1.0f) {
                    radialProgress22.setIcon(4, true, true);
                } else {
                    radialProgress22.setIcon(3, true, true);
                }
            }
            radialProgress22.draw(canvas3);
        }
        i = 22;
        textPaint = this.t0;
        i3 = i;
        arrayList = this.q0;
        if (textPaint != null) {
        }
        i4 = i21;
        radialProgress2 = radialProgress22;
        i5 = i3;
        if (this.t0 != null) {
            canvas3.save();
            canvas3.translate(this.V, this.T - this.R);
            if (this.Q.getPaint() != this.t0) {
            }
            canvas3.save();
            rna.d(canvas3, arrayList);
            rna.f(canvas3, this.Q);
            zl1Var = this.g1;
            if (zl1Var != null) {
            }
            StaticLayout staticLayout42 = this.Q;
            cn cnVar3 = this.s0;
            StaticLayout staticLayout52 = this.N;
            gn.drawAnimatedEmojis(canvas, staticLayout42, cnVar3, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout52 != null ? null : K(staticLayout52.getPaint().getColor()));
            canvas3 = canvas;
            canvas3.restore();
            size = arrayList.size();
            i12 = 0;
            while (i12 < size) {
            }
            canvas3.restore();
        }
        if (R()) {
        }
        cm1Var = this;
        cm1Var.I(canvas3, false);
        cm1Var.x2.a();
        canvas3.restore();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        k47 k47Var = this.Q0;
        if (TextUtils.isEmpty(this.S0) && k47Var == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = this.s2;
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder(!TextUtils.isEmpty(this.S0) ? this.S0 : k47Var.v);
            for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new q1((Object) this, (Object) characterStyle, (byte) 3), spanStart, spanEnd, 33);
            }
            this.s2 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(spannableStringBuilder.toString());
        } else {
            accessibilityNodeInfo.setText(spannableStringBuilder);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        RectF rectF = this.p0;
        this.U1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        mmc mmcVar = this.J0;
        lmc lmcVar = mmcVar == null ? null : mmcVar.m;
        if (lmcVar != null) {
            lmcVar.layout(0, 0, gm.L(42.0f), gm.L(42.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        int i3;
        boolean R;
        l39 l39Var;
        float f3;
        boolean z;
        boolean X;
        float f4;
        float L;
        float f5;
        float L2;
        StaticLayout staticLayout;
        float f6;
        float f7;
        TLRPC.Message message;
        int measuredWidth;
        int i4;
        int L3;
        int i5;
        int L4;
        int i6;
        mmc mmcVar = this.J0;
        lmc lmcVar = mmcVar == null ? null : mmcVar.m;
        if (lmcVar != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gm.L(42.0f), TLObject.FLAG_30);
            lmcVar.measure(makeMeasureSpec, makeMeasureSpec);
        }
        k47 k47Var = this.Q0;
        if (k47Var == null && this.S0 == null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(14.0f) + this.m0 + this.P);
            return;
        }
        if (U(k47Var)) {
            this.j1 = b10.x(64.0f, (gm.q.y - a.getCurrentActionBarHeight()) - gm.m, (int) (gm.O1() ? gm.P0() * 0.6f : (gm.q.x * 0.62f) - gm.L(34.0f)));
            if ((!gm.O1() && ((i6 = k47Var.D) == 18 || i6 == 30 || W())) || k47Var.D == 35) {
                this.j1 = (int) (this.j1 * 1.2f);
            }
            this.i1 = this.j1 - gm.L(106.0f);
            if (k47Var.D == 31) {
                this.j1 = Math.min(this.j1, gm.L(192.0f));
                this.i1 = gm.L(78.0f);
            }
            if (k47Var.D == 33) {
                this.j1 = Math.min(this.j1, gm.L(220.0f));
                this.i1 = gm.L(78.0f);
            }
            int i7 = k47Var.D;
            ImageReceiver imageReceiver = this.J;
            if (i7 == 37) {
                this.i1 = gm.L(52.0f);
                imageReceiver.q0(gm.L(14.0f));
            } else if (X()) {
                imageReceiver.q0(this.i1 / 2);
            } else {
                imageReceiver.q0(0);
            }
        }
        int max = Math.max(gm.L(30.0f), View.MeasureSpec.getSize(i));
        if (this.W != max) {
            this.D0 = true;
            this.W = max;
            v();
        }
        if (k47Var != null) {
            f = 30.0f;
            if (k47Var.D == 11) {
                i5 = gm.u;
                L4 = gm.L(10.0f);
            } else if (U(k47Var)) {
                i5 = this.j1;
                L4 = gm.L(12.0f);
            } else if (S()) {
                f2 = 140.0f;
                i3 = (this.J0.q0 == null ? gm.L(140.0f) : ((int) Math.ceil(r3.q0.h())) + gm.L(150.0f)) + gm.L(8.0f);
                R = R();
                l39Var = this.F0;
                if (R) {
                    r9 = hg9.v(8.0f, this.I0.P, this.I0.p ? 0 : gm.L(16.0f) + this.T + this.P);
                    if (!l39Var.p) {
                        L3 = gm.L(8.0f) + l39Var.m;
                        l39Var.n = L3;
                        r9 += L3;
                    }
                    f4 = 8.0f;
                    f5 = 24.0f;
                } else {
                    ycb ycbVar = this.P0;
                    if (ycbVar != null) {
                        r9 = gm.L(12.0f) + gm.L(f2) + ((int) ycbVar.f.h()) + (ycbVar.i ? gm.L(40.0f) : 0);
                        if (!l39Var.p) {
                            L3 = gm.L(8.0f) + l39Var.m;
                            l39Var.n = L3;
                            r9 += L3;
                        }
                    } else if (U(k47Var)) {
                        if (k47Var != null) {
                            f3 = 16.0f;
                            if (k47Var.D == 25) {
                                z = true;
                                int M = M(k47Var);
                                X = X();
                                f4 = 8.0f;
                                int i8 = this.T + this.P;
                                if (X) {
                                    L = (this.t1 == null ? 0 : gm.L(4.0f) + r13.d.getHeight()) + (this.j1 * 0.075f) + i8 + M + gm.L(4.0f);
                                } else {
                                    int L5 = gm.L(4.0f) + i8;
                                    int L6 = gm.L(f3);
                                    if (M > 0) {
                                        L6 = (L6 << 1) + M;
                                    }
                                    int i9 = L5 + L6;
                                    am1 am1Var = this.t1;
                                    L = i9 + (am1Var == null ? 0 : gm.L(4.0f) + am1Var.d.getHeight());
                                }
                                this.L1 = 0;
                                if (this.k1 == null) {
                                    float height = L + r15.getHeight();
                                    if (this.k1.getLineCount() > 1) {
                                        f5 = 24.0f;
                                        this.L1 = (this.k1.getHeight() - this.k1.getLineTop(1)) + this.L1;
                                    } else {
                                        f5 = 24.0f;
                                    }
                                    L2 = height + gm.L(z ? 6.0f : 0.0f);
                                    if (this.n1 != null) {
                                        L2 += gm.L(9.0f) + r4.getHeight();
                                    }
                                    if (this.m1 != null) {
                                        L2 += gm.L(f5);
                                    }
                                } else {
                                    f5 = 24.0f;
                                    L2 = L - gm.L(12.0f);
                                    this.L1 -= gm.L(f);
                                }
                                am1 am1Var2 = this.t1;
                                int height2 = am1Var2 != null ? 0 : am1Var2.d.getHeight();
                                if (this.t1 != null) {
                                    this.L1 = 0;
                                } else if (this.n1 != null) {
                                    this.L1 = hg9.v(10.0f, height2, this.L1);
                                } else {
                                    k47 k47Var2 = this.Q0;
                                    if (k47Var2.D == 18 || k47Var2.r4()) {
                                        this.L1 = b10.z(this.y1 == null ? 0.0f : 10.0f, height2, this.L1);
                                    } else if (this.Q0.D == 30) {
                                        this.L1 = b10.z(20.0f, height2, this.L1);
                                    } else if (this.p1) {
                                        this.L1 += height2;
                                    } else if (this.t1.d.getLineCount() > 2) {
                                        this.L1 = ((this.t1.d.getLineCount() * (this.t1.d.getLineBottom(0) - this.t1.d.getLineTop(0))) - 2) + this.L1;
                                    }
                                }
                                if (this.m1 != null) {
                                    this.L1 = gm.L(f5) + this.L1;
                                }
                                int L7 = this.L1 - gm.L(z ? 14.0f : 0.0f);
                                this.L1 = L7;
                                i3 += L7;
                                int L8 = gm.L(14.0f) + this.P + i3;
                                staticLayout = this.y1;
                                RectF rectF = this.p0;
                                if (staticLayout == null) {
                                    float z2 = aq1.z((L8 - L2) - staticLayout.getHeight(), gm.L(8.0f), 2.0f, L2);
                                    if (this.Q0.r4()) {
                                        z2 += gm.L(4.0f);
                                    }
                                    float f8 = (this.W - this.E1) / 2.0f;
                                    f6 = 2.0f;
                                    f7 = 18.0f;
                                    rectF.set(f8 - gm.L(18.0f), z2 - gm.L(8.0f), f8 + this.E1 + gm.L(18.0f), z2 + (this.y1 != null ? r8.getHeight() : 0) + gm.L(8.0f));
                                } else {
                                    f6 = 2.0f;
                                    f7 = 18.0f;
                                    i3 -= gm.L(40.0f);
                                    this.L1 -= gm.L(40.0f);
                                    k47 k47Var3 = this.Q0;
                                    if (k47Var3 != null && (message = k47Var3.k) != null && (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                                        i3 -= gm.L(8.0f);
                                        this.L1 -= gm.L(8.0f);
                                    }
                                }
                                measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                                cta ctaVar = this.W1;
                                ctaVar.a.set(rectF);
                                ctaVar.b.set(rectF);
                                if (this.X1 != measuredWidth) {
                                    this.X1 = measuredWidth;
                                    ctaVar.f();
                                }
                                if (X()) {
                                    int L9 = gm.L(4.0f) + this.T + this.P;
                                    this.f = 0;
                                    int L10 = gm.L(f3);
                                    if (M > 0) {
                                        L10 = (L10 << 1) + M;
                                    }
                                    this.f = L10;
                                    StaticLayout staticLayout2 = this.n1;
                                    if (staticLayout2 != null) {
                                        L10 = hg9.v(10.0f, staticLayout2.getHeight(), L10);
                                        this.f = L10;
                                    }
                                    if (this.m1 != null) {
                                        L10 += gm.L(15.0f);
                                        this.f = L10;
                                    }
                                    int i10 = L10 + height2;
                                    this.f = i10;
                                    float f9 = (this.W - this.E1) / f6;
                                    if (this.y1 != null) {
                                        this.h = gm.L(7.0f) + i10 + L9;
                                        rectF.set(f9 - gm.L(f7), this.h, f9 + this.E1 + gm.L(f7), this.y1.getHeight() + this.h + (gm.L(8.0f) << 1));
                                        this.f = (int) (rectF.height() + gm.L(4.0f) + this.f);
                                    } else if (!W() && (i4 = k47Var.D) != 34 && i4 != 33 && i4 != 35) {
                                        rectF.set(f9 - gm.L(f7), this.h, f9 + this.E1 + gm.L(f7), gm.L(17.0f) + this.h + (gm.L(8.0f) << 1));
                                        this.f = gm.L(17.0f) + this.f;
                                    }
                                    int L11 = gm.L(15.0f) + this.f;
                                    this.f = L11;
                                    int L12 = gm.L(6.0f) + L9 + L11;
                                    if (!l39Var.p) {
                                        int L13 = gm.L(8.0f) + l39Var.m;
                                        l39Var.n = L13;
                                        L12 += L13;
                                    }
                                    r9 = L12;
                                    if (this.Z1 != null) {
                                        r9 += gm.L(44.0f);
                                    }
                                }
                                rectF.inset(gm.L(5.0f), gm.L(1.0f));
                            }
                        } else {
                            f3 = 16.0f;
                        }
                        z = false;
                        int M2 = M(k47Var);
                        X = X();
                        f4 = 8.0f;
                        int i82 = this.T + this.P;
                        if (X) {
                        }
                        this.L1 = 0;
                        if (this.k1 == null) {
                        }
                        am1 am1Var22 = this.t1;
                        if (am1Var22 != null) {
                        }
                        if (this.t1 != null) {
                        }
                        if (this.m1 != null) {
                        }
                        int L72 = this.L1 - gm.L(z ? 14.0f : 0.0f);
                        this.L1 = L72;
                        i3 += L72;
                        int L82 = gm.L(14.0f) + this.P + i3;
                        staticLayout = this.y1;
                        RectF rectF2 = this.p0;
                        if (staticLayout == null) {
                        }
                        measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                        cta ctaVar2 = this.W1;
                        ctaVar2.a.set(rectF2);
                        ctaVar2.b.set(rectF2);
                        if (this.X1 != measuredWidth) {
                        }
                        if (X()) {
                        }
                        rectF2.inset(gm.L(5.0f), gm.L(1.0f));
                    }
                    f4 = 8.0f;
                    f5 = 24.0f;
                }
                if (this.Q0 != null && !l39Var.p) {
                    int L14 = gm.L(f4) + l39Var.m;
                    l39Var.n = L14;
                    i3 += L14;
                }
                if (W()) {
                    i3 = hg9.v(f5, this.R, i3);
                }
                if (k47Var == null && X()) {
                    setMeasuredDimension(max, this.m0 + r9);
                } else {
                    setMeasuredDimension(max, gm.L(14.0f) + this.m0 + this.P + i3);
                }
                l39Var.c = (getMeasuredHeight() - getPaddingTop()) - l39Var.n;
            }
            i3 = L4 + i5;
            f2 = 140.0f;
            R = R();
            l39Var = this.F0;
            if (R) {
            }
            if (this.Q0 != null) {
                int L142 = gm.L(f4) + l39Var.m;
                l39Var.n = L142;
                i3 += L142;
            }
            if (W()) {
            }
            if (k47Var == null) {
            }
            setMeasuredDimension(max, gm.L(14.0f) + this.m0 + this.P + i3);
            l39Var.c = (getMeasuredHeight() - getPaddingTop()) - l39Var.n;
        }
        f = 30.0f;
        f2 = 140.0f;
        i3 = 0;
        R = R();
        l39Var = this.F0;
        if (R) {
        }
        if (this.Q0 != null) {
        }
        if (W()) {
        }
        if (k47Var == null) {
        }
        setMeasuredDimension(max, gm.L(14.0f) + this.m0 + this.P + i3);
        l39Var.c = (getMeasuredHeight() - getPaddingTop()) - l39Var.n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
    
        if (r11.i == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x094c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        wn5 wn5Var;
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        am1 am1Var;
        v67 v67Var;
        nk nkVar;
        am1 am1Var2;
        TLRPC.Message message2;
        boolean z;
        boolean z2;
        boolean z3;
        StaticLayout staticLayout;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        TLRPC.Message message3;
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer;
        int i;
        boolean z8;
        boolean z9;
        vl1 vl1Var;
        k47 k47Var = this.Q0;
        float x = motionEvent.getX() - (this.k0 / 2.0f);
        this.z0 = x;
        float y = motionEvent.getY() + getPaddingTop();
        this.A0 = y;
        if (k47Var == null) {
            if (this.k2 != null) {
                if (motionEvent.getAction() == 0) {
                    if (x >= this.b1 && x <= this.c1) {
                        this.G = true;
                        return true;
                    }
                } else if (this.G) {
                    if (motionEvent.getAction() == 1) {
                        this.k2.onClick(this);
                        this.G = false;
                    } else if (motionEvent.getAction() == 3) {
                        this.G = false;
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        bwb bwbVar = this.o0;
        if (bwbVar == null || !bwbVar.d(motionEvent, false)) {
            ycb ycbVar = this.P0;
            if (ycbVar != null) {
                u51 u51Var = ycbVar.m;
                boolean contains = ycbVar.k.contains(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0) {
                    u51Var.c(contains);
                } else if (motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() == 1) {
                        if (u51Var.i) {
                            ycbVar.b();
                        }
                        u51Var.c(false);
                    } else if (motionEvent.getAction() == 3) {
                        u51Var.c(false);
                    }
                }
            }
            if (!R() || !this.I0.e(this.G0, this.H0, motionEvent)) {
                if (S()) {
                    mmc mmcVar = this.J0;
                    float f = (this.k0 / 2.0f) + this.L0;
                    float paddingTop = this.M0 + getPaddingTop();
                    ArrayList arrayList = mmcVar.c;
                    u51 u51Var2 = mmcVar.Y;
                    float x2 = motionEvent.getX() - f;
                    float y3 = motionEvent.getY() - paddingTop;
                    cm1 cm1Var = mmcVar.a;
                    if (motionEvent.getActionMasked() == 0) {
                        float x3 = motionEvent.getX() - f;
                        float y4 = motionEvent.getY() - paddingTop;
                        lmc lmcVar = mmcVar.m;
                        if (lmcVar != null && lmcVar.n && mmcVar.w.contains((int) x3, (int) y4)) {
                            if (!mmcVar.D && mmcVar.C <= 1.001f) {
                                mmcVar.A = mmcVar.g();
                                mmcVar.B = mmcVar.k.F * 0.14f;
                            }
                            ValueAnimator valueAnimator = mmcVar.G;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                mmcVar.G = null;
                            }
                            mmcVar.D = false;
                            mmcVar.x = motionEvent.getPointerId(0);
                            mmcVar.y = motionEvent.getX();
                            mmcVar.z = motionEvent.getY();
                            mmcVar.r0 = false;
                            u51Var2.c(false);
                            if (cm1Var.getParent() != null) {
                                cm1Var.getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            mmcVar.a(3.0f);
                            z9 = true;
                        }
                        float L = gm.L(4.0f);
                        boolean z10 = x2 < L && x2 <= ((float) gm.L(206.0f)) - L && y3 >= L && y3 <= ((float) gm.L(140.0f)) - L;
                        if (mmcVar.q0 != null) {
                            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = mmcVar.l0;
                            if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !mmcVar.m0) {
                                float L2 = x2 - ((gm.L(206.0f) - mmcVar.q0.j()) / 2.0f);
                                float L3 = y3 - gm.L(143.0f);
                                int size = arrayList.size();
                                int i2 = 0;
                                while (i2 < size) {
                                    Object obj = arrayList.get(i2);
                                    i2++;
                                    int i3 = size;
                                    if (((rna) obj).getBounds().contains((int) L2, (int) L3)) {
                                        z8 = true;
                                        break;
                                    }
                                    size = i3;
                                }
                            }
                        }
                        z8 = false;
                        boolean z11 = !z10 || z8;
                        if (motionEvent.getAction() != 0) {
                            mmcVar.r0 = z11;
                            u51Var2.c(z11);
                        } else if (motionEvent.getAction() == 2) {
                            if (mmcVar.r0) {
                                u51Var2.c(z11);
                            }
                        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            z9 = mmcVar.r0;
                            boolean z12 = motionEvent.getAction() == 1 && z9 && z11;
                            mmcVar.r0 = false;
                            u51Var2.c(false);
                            if (z12 && z8) {
                                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer2 = mmcVar.l0;
                                if (tL_messageActionGramTransfer2.comment_encrypted_preparing) {
                                    mmcVar.m0 = true;
                                    uib uibVar = mmcVar.q0;
                                    uibVar.p(gw3.m(tL_messageActionGramTransfer2.comment, uibVar.a.getFontMetricsInt(), false, null, 0));
                                    mmcVar.d.addAll(arrayList);
                                    arrayList.clear();
                                    cm1Var.requestLayout();
                                    cm1Var.invalidate();
                                }
                            }
                            if (z12 && (vl1Var = mmcVar.s0) != null) {
                                vl1Var.run();
                            }
                        }
                        z9 = mmcVar.r0;
                    } else {
                        if (mmcVar.x != -1) {
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked != 1) {
                                if (actionMasked == 2) {
                                    int findPointerIndex = motionEvent.findPointerIndex(mmcVar.x);
                                    if (findPointerIndex < 0) {
                                        mmcVar.j();
                                    } else {
                                        float f2 = 0.013962634f / gm.p;
                                        mmcVar.A = td4.A(motionEvent.getX(findPointerIndex), mmcVar.y, f2, mmcVar.A);
                                        mmcVar.B = td4.A(motionEvent.getY(findPointerIndex), mmcVar.z, f2, mmcVar.B);
                                        mmcVar.y = motionEvent.getX(findPointerIndex);
                                        mmcVar.z = motionEvent.getY(findPointerIndex);
                                        cm1Var.invalidate();
                                    }
                                } else if (actionMasked != 3) {
                                    if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == mmcVar.x) {
                                        int i4 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                                        mmcVar.x = motionEvent.getPointerId(i4);
                                        mmcVar.y = motionEvent.getX(i4);
                                        mmcVar.z = motionEvent.getY(i4);
                                    }
                                }
                                z9 = true;
                            }
                            mmcVar.j();
                            z9 = true;
                        }
                        float L4 = gm.L(4.0f);
                        if (x2 < L4) {
                        }
                        if (mmcVar.q0 != null) {
                        }
                        z8 = false;
                        if (z10) {
                        }
                        if (motionEvent.getAction() != 0) {
                        }
                        z9 = mmcVar.r0;
                    }
                    if (z9) {
                        if (this.J0.x != -1) {
                            o();
                            return true;
                        }
                        if (motionEvent.getAction() == 0) {
                            this.B0 = motionEvent.getX();
                            this.C0 = motionEvent.getY();
                            u();
                            return true;
                        }
                        if (motionEvent.getAction() != 2) {
                            o();
                            return true;
                        }
                        float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                        if (Math.abs(motionEvent.getX() - this.B0) > scaledTouchSlop || Math.abs(motionEvent.getY() - this.C0) > scaledTouchSlop) {
                            o();
                            return true;
                        }
                        return true;
                    }
                }
                if (!this.F0.c(motionEvent)) {
                    int action = motionEvent.getAction();
                    ImageReceiver imageReceiver = this.J;
                    int i5 = this.I;
                    RectF rectF = this.p0;
                    View view = this.U1;
                    u51 u51Var3 = this.n;
                    if (action == 0) {
                        if (this.g1 != null) {
                            if ((k47Var.D == 11 || U(k47Var)) && imageReceiver.H(x, y)) {
                                this.a0 = true;
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (k47Var.D == 33 && this.N1.contains(x, y) && (this.y1 == null || !rectF.contains(x, y))) {
                                this.a0 = true;
                                z5 = true;
                            }
                            if (this.K1.i.q == 4 && (((i = k47Var.D) == 21 || i == 22) && this.N1.contains(x, y))) {
                                this.a0 = true;
                                z5 = true;
                            }
                            am1 am1Var3 = this.t1;
                            if (am1Var3 == null || !this.p1) {
                                z6 = z5;
                            } else {
                                RectF rectF2 = gm.P;
                                float f3 = am1Var3.a;
                                z6 = z5;
                                rectF2.set(f3, am1Var3.b, am1Var3.d.getWidth() + f3, this.t1.b + r1.d.getHeight());
                                if (rectF2.contains(x, y)) {
                                    this.F = true;
                                    z6 = true;
                                }
                            }
                            if (!U(k47Var) || this.y1 == null || (((tL_messageActionStarGiftOnchainOffer = this.c2) != null && this.d2 && yr7.l(i5, tL_messageActionStarGiftOnchainOffer.offer_id)) || !(rectF.contains(x, y) || (this.z1 && this.N1.contains(x, y))))) {
                                z7 = true;
                            } else {
                                z7 = true;
                                this.b0 = true;
                                view.setPressed(true);
                                u51Var3.c(true);
                                z6 = true;
                            }
                            if (!z6 && W()) {
                                this.F = z7;
                                z6 = true;
                            }
                            if (!z6) {
                                k47 k47Var2 = this.Q0;
                                if (brb.g((k47Var2 == null || (message3 = k47Var2.k) == null) ? null : message3.action, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                    this.F = true;
                                    z6 = true;
                                }
                            }
                            if (z6) {
                                u();
                            }
                            z2 = z6;
                        }
                        z2 = false;
                    } else {
                        if (motionEvent.getAction() != 2) {
                            o();
                        }
                        if (this.G) {
                            if (motionEvent.getAction() == 2) {
                                if (x < this.b1 || x > this.c1) {
                                    z = false;
                                    this.G = false;
                                    z2 = z;
                                }
                            } else if (motionEvent.getAction() == 1) {
                                View.OnClickListener onClickListener = this.k2;
                                if (onClickListener != null) {
                                    onClickListener.onClick(this);
                                }
                                this.G = false;
                            } else if (motionEvent.getAction() == 3) {
                                this.G = false;
                            }
                            z2 = false;
                        } else if (this.F) {
                            int action2 = motionEvent.getAction();
                            if (action2 == 1) {
                                this.F = false;
                                view.setPressed(false);
                                u51Var3.c(false);
                                if (this.g1 != null && k47Var.C != null && (message2 = k47Var.k) != null && brb.g(message2.action, TLRPC.TL_messageActionTodoAppendTasks.class, TLRPC.TL_messageActionTodoCompletions.class, TLRPC.TL_messageActionSuggestedPostApproval.class, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                    this.g1.C(this, this.Q0.N1());
                                } else if (this.p1 && !this.o1 && (am1Var2 = this.t1) != null) {
                                    int height = am1Var2.d.getHeight() - this.q1;
                                    this.o1 = true;
                                    zl1 zl1Var = this.g1;
                                    if (zl1Var != null) {
                                        zl1Var.h(this);
                                        if (getParent() instanceof r59) {
                                            ((r59) getParent()).x0(0, gm.L(24.0f) + height, null);
                                            return true;
                                        }
                                    }
                                } else if (this.P0 != null && this.N1.contains(motionEvent.getX(), motionEvent.getY())) {
                                    this.P0.b();
                                    return true;
                                }
                            } else if (action2 == 2) {
                                am1 am1Var4 = this.t1;
                                if (am1Var4 == null || !this.p1) {
                                    this.F = false;
                                } else {
                                    RectF rectF3 = gm.P;
                                    float f4 = am1Var4.a;
                                    rectF3.set(f4, am1Var4.b, am1Var4.d.getWidth() + f4, this.t1.b + r8.d.getHeight());
                                    if (!rectF3.contains(x, y)) {
                                        this.F = false;
                                    }
                                }
                                z = true;
                                z2 = z;
                            } else if (action2 == 3) {
                                this.F = false;
                                u51Var3.c(false);
                            }
                            z = false;
                            z2 = z;
                        } else {
                            if (this.b0) {
                                int action3 = motionEvent.getAction();
                                if (action3 == 1) {
                                    this.a0 = false;
                                    this.b0 = false;
                                    view.setPressed(false);
                                    u51Var3.c(false);
                                    if (this.c2 != null) {
                                        playSoundEffect(0);
                                        zl1 zl1Var2 = this.g1;
                                        d w = zl1Var2 != null ? zl1Var2.w() : LaunchActivity.S();
                                        if (w != null && this.c2 != null && this.Q0 != null) {
                                            final c41 b0 = c41.b0(w);
                                            if (this.c2.buyer) {
                                                final Context context = getContext();
                                                int e1 = this.Q0.e1();
                                                final TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer2 = this.c2;
                                                HashMap hashMap = yr7.a;
                                                final long j = tL_messageActionStarGiftOnchainOffer2.offer_id;
                                                if (yr7.b(j)) {
                                                    TL_stars.cancelStarGiftOnchainOffer cancelstargiftonchainoffer = new TL_stars.cancelStarGiftOnchainOffer();
                                                    cancelstargiftonchainoffer.offer_msg_id = e1;
                                                    final int i6 = this.I;
                                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i6);
                                                    kc kcVar = new kc((byte) 0);
                                                    final ylb ylbVar = this.h1;
                                                    connectionsManager.sendRequestTyped(cancelstargiftonchainoffer, kcVar, new jac() { // from class: wr7
                                                        @Override // jac
                                                        public final void a(Object obj2, Object obj3) {
                                                            TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) obj2;
                                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                                            long j2 = j;
                                                            Context context2 = context;
                                                            int i7 = i6;
                                                            ylb ylbVar2 = ylbVar;
                                                            c41 c41Var = b0;
                                                            if (tL_payments_starGiftOnchainOfferTx == null || tL_payments_starGiftOnchainOfferTx.message == null) {
                                                                yr7.g(j2);
                                                                fs7.r(context2, i7, ylbVar2, c41Var, tL_error, null);
                                                                return;
                                                            }
                                                            w25 p = yr7.p(context2, ylbVar2, c41Var, i7, tL_payments_starGiftOnchainOfferTx);
                                                            if (p == null) {
                                                                yr7.g(j2);
                                                                return;
                                                            }
                                                            tp7 tp7Var = new tp7(context2, i7, tL_messageActionStarGiftOnchainOffer2, tL_payments_starGiftOnchainOfferTx, p, ylbVar2, c41Var);
                                                            int i8 = pr7.w2;
                                                            boolean[] zArr = new boolean[1];
                                                            ud7 ud7Var = new ud7((Object) zArr, (Object) new Runnable[]{c.C(i7).k(p, new p((Object) zArr, (Object) ud7Var, (Object) tp7Var, (byte) 22))}, (Object) tp7Var, (byte) 9);
                                                            gm.d3(ud7Var, 5000L);
                                                        }
                                                    });
                                                }
                                            } else {
                                                final Context context2 = getContext();
                                                final int e12 = this.Q0.e1();
                                                final TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer3 = this.c2;
                                                HashMap hashMap2 = yr7.a;
                                                final long j2 = tL_messageActionStarGiftOnchainOffer3.offer_id;
                                                final int i7 = this.I;
                                                if (yr7.k(i7, j2)) {
                                                    yr7.r(b0);
                                                } else if (yr7.b(j2)) {
                                                    TL_stars.acceptStarGiftOnchainOffer acceptstargiftonchainoffer = new TL_stars.acceptStarGiftOnchainOffer();
                                                    acceptstargiftonchainoffer.offer_msg_id = e12;
                                                    ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i7);
                                                    kc kcVar2 = new kc((byte) 0);
                                                    final ylb ylbVar2 = this.h1;
                                                    connectionsManager2.sendRequestTyped(acceptstargiftonchainoffer, kcVar2, new jac() { // from class: vr7
                                                        @Override // jac
                                                        public final void a(Object obj2, Object obj3) {
                                                            TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) obj2;
                                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                                            long j3 = j2;
                                                            Context context3 = context2;
                                                            ylb ylbVar3 = ylbVar2;
                                                            int i8 = i7;
                                                            c41 c41Var = b0;
                                                            if (tL_payments_starGiftOnchainOfferTx == null || tL_payments_starGiftOnchainOfferTx.message == null) {
                                                                yr7.g(j3);
                                                                if (tL_error == null || !"STARGIFT_ONCHAIN_SALE_ACTIVE".equals(tL_error.text)) {
                                                                    fs7.r(context3, i8, ylbVar3, c41Var, tL_error, null);
                                                                    return;
                                                                } else {
                                                                    fs7.p(context3, ylbVar3, jb6.M0(2131749502, null), null);
                                                                    return;
                                                                }
                                                            }
                                                            w25 p = yr7.p(context3, ylbVar3, c41Var, i8, tL_payments_starGiftOnchainOfferTx);
                                                            if (p == null) {
                                                                yr7.g(j3);
                                                                return;
                                                            }
                                                            TL_stars.TL_payments_starGiftOnchainOfferTxMessage tL_payments_starGiftOnchainOfferTxMessage = tL_payments_starGiftOnchainOfferTx.gasless_message;
                                                            if (tL_payments_starGiftOnchainOfferTxMessage != null) {
                                                                try {
                                                                    w25 b = w25.b(tL_payments_starGiftOnchainOfferTxMessage);
                                                                    List list = b.g;
                                                                    if (list == null) {
                                                                        list = Collections.singletonList(b);
                                                                    }
                                                                    Iterator it = list.iterator();
                                                                    while (true) {
                                                                        if (!it.hasNext()) {
                                                                            break;
                                                                        } else if (((w25) it.next()).e != 3) {
                                                                            b = null;
                                                                            break;
                                                                        }
                                                                    }
                                                                    p.f = b;
                                                                } catch (Exception e) {
                                                                    fc4.g(e, true);
                                                                }
                                                            }
                                                            TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer4 = tL_messageActionStarGiftOnchainOffer3;
                                                            TL_stars.StarGift starGift2 = tL_messageActionStarGiftOnchainOffer4.gift;
                                                            String h = starGift2 != null ? fs7.h(starGift2) : "";
                                                            pr7 pr7Var = new pr7(context3, i8, tL_messageActionStarGiftOnchainOffer4.gift, ylbVar3);
                                                            pr7Var.e1(gm.S2(jb6.a0(null, null, 2131749518, h, fs7.k(tL_messageActionStarGiftOnchainOffer4.amount))), jb6.M0(2131749517, null));
                                                            String M0 = jb6.M0(2131749484, null);
                                                            SpannableStringBuilder l = fs7.l(tL_messageActionStarGiftOnchainOffer4.amount);
                                                            mhb mhbVar = pr7Var.Y1;
                                                            mhbVar.f(M0, l, null, null);
                                                            fs7.c(pr7Var, tL_messageActionStarGiftOnchainOffer4.amount, tL_messageActionStarGiftOnchainOffer4.fee_bps, ylbVar3);
                                                            TL_stars.StarGift starGift3 = tL_messageActionStarGiftOnchainOffer4.gift;
                                                            if (starGift3 != null) {
                                                                fs7.b(pr7Var, starGift3);
                                                                if (tL_messageActionStarGiftOnchainOffer4.gift.availability_total > 0) {
                                                                    mhbVar.f(jb6.M0(2131750233, null), jb6.H(',', "Gift2QuantityIssued1", tL_messageActionStarGiftOnchainOffer4.gift.availability_issued).concat(jb6.H(',', "Gift2QuantityIssued2", tL_messageActionStarGiftOnchainOffer4.gift.availability_total)), null, null);
                                                                }
                                                            }
                                                            TL_wallet.walletOnchainGiftActionOfferAccept walletonchaingiftactionofferaccept = new TL_wallet.walletOnchainGiftActionOfferAccept();
                                                            walletonchaingiftactionofferaccept.offer_address = tL_messageActionStarGiftOnchainOffer4.offer_address;
                                                            walletonchaingiftactionofferaccept.price = tL_messageActionStarGiftOnchainOffer4.amount;
                                                            TL_stars.StarGift starGift4 = tL_messageActionStarGiftOnchainOffer4.gift;
                                                            p.h = walletonchaingiftactionofferaccept;
                                                            p.i = starGift4;
                                                            long j4 = tL_messageActionStarGiftOnchainOffer4.offer_id;
                                                            boolean[] zArr = new boolean[1];
                                                            yr7.j(j4, Long.MAX_VALUE);
                                                            pr7Var.setOnDismissListener(new sr7(zArr, j4, (byte) 1));
                                                            pr7Var.u2.setVisibility(0);
                                                            String M02 = jb6.M0(2131749554, null);
                                                            h01 h01Var = new h01(context3, i8, e12, tL_messageActionStarGiftOnchainOffer4, ylbVar3, pr7Var);
                                                            b61 b61Var = pr7Var.b2;
                                                            b61Var.i(M02, false, true);
                                                            b61Var.setOnClickListener(new n06(pr7Var, h01Var, (byte) 10));
                                                            int i9 = tL_messageActionStarGiftOnchainOffer4.expires_at - 10;
                                                            bo6 bo6Var = new bo6((byte) 7);
                                                            pr7Var.m2 = i9;
                                                            pr7Var.n2 = bo6Var;
                                                            pr7Var.b1();
                                                            pr7Var.c2.i(jb6.M0(2131749521, null), false, true);
                                                            pr7Var.p2 = 2131749564;
                                                            pr7Var.d1(p);
                                                            String str = h;
                                                            pr7Var.c1(new o77((Object) zArr, j4, i8, (Object) str, (byte) 15), new qu0(str, j4, i8, tL_messageActionStarGiftOnchainOffer4), new qr7(context3, i8, ylbVar3, pr7Var, (byte) 0));
                                                            pr7Var.show();
                                                        }
                                                    });
                                                }
                                            }
                                        }
                                        invalidate();
                                    } else if (this.g1 != null) {
                                        int i8 = k47Var.D;
                                        if (i8 == 37) {
                                            playSoundEffect(0);
                                            d S = LaunchActivity.S();
                                            if (S != null) {
                                                new pp2(S, ((TLRPC.TL_messageActionChangeCommunity) k47Var.k.action).community_id, null, null).show();
                                            }
                                        } else if (i8 == 31) {
                                            playSoundEffect(0);
                                            f0();
                                        } else if (i8 == 25) {
                                            playSoundEffect(0);
                                            if (this.g1 != null) {
                                                gm.c3(new uj1(this, (TLRPC.TL_messageActionGiftCode) this.Q0.k.action, (byte) 2));
                                            }
                                        } else if (i8 == 18) {
                                            playSoundEffect(0);
                                            e0();
                                        } else if (i8 == 30) {
                                            playSoundEffect(0);
                                            f0();
                                        } else {
                                            TLRPC.Message message4 = k47Var.k;
                                            if (message4 != null) {
                                                TLRPC.MessageAction messageAction = message4.action;
                                                if ((messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low) {
                                                    playSoundEffect(0);
                                                    TLRPC.Message message5 = this.Q0.k;
                                                    if (message5 != null) {
                                                        TLRPC.SuggestedPost suggestedPost = message5.suggested_post;
                                                        if (suggestedPost != null) {
                                                            v67Var = v67.b(suggestedPost);
                                                        } else {
                                                            TLRPC.MessageAction messageAction2 = message5.action;
                                                            if (messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                                                                v67Var = new v67(nk.m(((TLRPC.TL_messageActionSuggestedPostApproval) messageAction2).price), r1.schedule_date);
                                                            }
                                                        }
                                                        nkVar = v67Var.a;
                                                        if (nkVar != null && nkVar.a == ok.a) {
                                                            new dxa(getContext(), this.h1, v67Var.a.a(), 13, no4.i(i5, k47.B0(this.Q0.k)), null, k47.B0(this.Q0.k)).show();
                                                        }
                                                    }
                                                    v67Var = null;
                                                    nkVar = v67Var.a;
                                                    if (nkVar != null) {
                                                        new dxa(getContext(), this.h1, v67Var.a.a(), 13, no4.i(i5, k47.B0(this.Q0.k)), null, k47.B0(this.Q0.k)).show();
                                                    }
                                                }
                                            }
                                            if (((wn5) oc7.r1(i5).n4.get(k47Var.k.local_id)) == null) {
                                                boolean z13 = this.z1;
                                                zl1 zl1Var3 = this.g1;
                                                if (z13) {
                                                    zl1Var3.o(this);
                                                } else {
                                                    zl1Var3.J(this);
                                                }
                                            }
                                        }
                                    }
                                } else if (action3 != 2) {
                                    if (action3 == 3) {
                                        this.a0 = false;
                                        this.b0 = false;
                                        view.setPressed(false);
                                        u51Var3.c(false);
                                    }
                                } else if (!U(k47Var) || (!rectF.contains(x, y) && !this.N1.contains(x, y))) {
                                    this.b0 = false;
                                    view.setPressed(false);
                                    u51Var3.c(false);
                                }
                            } else if (this.a0) {
                                int action4 = motionEvent.getAction();
                                if (action4 == 1) {
                                    this.a0 = false;
                                    if (!this.p1 || this.o1 || (am1Var = this.t1) == null) {
                                        int i9 = k47Var.D;
                                        if (i9 == 31) {
                                            f0();
                                        } else if (i9 == 25) {
                                            if (this.g1 != null) {
                                                gm.c3(new uj1(this, (TLRPC.TL_messageActionGiftCode) this.Q0.k.action, (byte) 2));
                                            }
                                        } else if (i9 == 18) {
                                            e0();
                                        } else if (i9 == 30) {
                                            f0();
                                        } else if (i9 == 33) {
                                            k47 k47Var3 = this.Q0;
                                            if (k47Var3 != null && (message = k47Var3.k) != null) {
                                                TLRPC.MessageAction messageAction3 = message.action;
                                                if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftOnchainOffer) {
                                                    starGift = ((TLRPC.TL_messageActionStarGiftOnchainOffer) messageAction3).gift;
                                                } else if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                                    starGift = ((TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction3).gift;
                                                }
                                                if ((starGift instanceof TL_stars.TL_starGiftUnique) && !TextUtils.isEmpty(starGift.slug)) {
                                                    playSoundEffect(0);
                                                    wsa wsaVar = new wsa(getContext(), this.I, 0L, this.h1, null);
                                                    wsaVar.m2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                                                    wsaVar.show();
                                                }
                                            }
                                        } else if (this.g1 != null) {
                                            if (i9 != 21 || (wn5Var = (wn5) oc7.r1(i5).n4.get(k47Var.k.local_id)) == null) {
                                                this.g1.o(this);
                                                playSoundEffect(0);
                                            } else {
                                                wn5Var.a();
                                            }
                                        }
                                    } else {
                                        int height2 = am1Var.d.getHeight() - this.q1;
                                        this.o1 = true;
                                        zl1 zl1Var4 = this.g1;
                                        if (zl1Var4 != null) {
                                            zl1Var4.h(this);
                                            if (getParent() instanceof r59) {
                                                ((r59) getParent()).x0(0, gm.L(16.0f) + height2, null);
                                                return true;
                                            }
                                        }
                                    }
                                } else if (action4 != 2) {
                                    if (action4 == 3) {
                                        this.a0 = false;
                                    }
                                } else if (X()) {
                                    if (!this.N1.contains(x, y)) {
                                        this.a0 = false;
                                    }
                                } else if (!imageReceiver.H(x, y)) {
                                    this.a0 = false;
                                }
                            }
                            z2 = false;
                        }
                    }
                    if (!z2 && (motionEvent.getAction() == 0 || ((this.y != null || this.E != null) && motionEvent.getAction() == 1))) {
                        am1 am1Var5 = this.t1;
                        if (am1Var5 != null && !am1Var5.f.isEmpty() && !this.H) {
                            ArrayList arrayList2 = this.t1.f;
                            int size2 = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size2) {
                                Object obj2 = arrayList2.get(i10);
                                i10++;
                                rna rnaVar = (rna) obj2;
                                Rect bounds = rnaVar.getBounds();
                                am1 am1Var6 = this.t1;
                                if (bounds.contains((int) (x - am1Var6.a), (int) (y - am1Var6.b))) {
                                    this.y = null;
                                    if (motionEvent.getAction() == 0) {
                                        this.E = rnaVar;
                                        z3 = true;
                                        z2 = true;
                                    } else {
                                        rna rnaVar2 = this.E;
                                        z3 = true;
                                        if (rnaVar == rnaVar2) {
                                            this.H = true;
                                            rnaVar2.q = new vl1(this, (byte) 6);
                                            float sqrt = (float) Math.sqrt(Math.pow(this.t1.d.getHeight(), 2.0d) + Math.pow(this.t1.d.getWidth(), 2.0d));
                                            rna rnaVar3 = this.E;
                                            am1 am1Var7 = this.t1;
                                            rnaVar3.j((int) (x - am1Var7.a), (int) (y - am1Var7.b), sqrt, false);
                                            invalidate();
                                        }
                                        z2 = true;
                                    }
                                    if (!z2 && (staticLayout = this.N) != null) {
                                        if (x >= this.S) {
                                            float f5 = this.T;
                                            if (y >= f5 && x <= r5 + this.O && y <= r6 + this.P) {
                                                float f6 = y - f5;
                                                float f7 = x - this.U;
                                                if (!z2) {
                                                    int lineForVertical = staticLayout.getLineForVertical((int) f6);
                                                    int offsetForHorizontal = this.N.getOffsetForHorizontal(lineForVertical, f7);
                                                    float lineLeft = this.N.getLineLeft(lineForVertical);
                                                    if (lineLeft <= f7 && this.N.getLineWidth(lineForVertical) + lineLeft >= f7) {
                                                        CharSequence charSequence = k47Var.v;
                                                        if (charSequence instanceof Spannable) {
                                                            URLSpan[] uRLSpanArr = (URLSpan[]) ((Spannable) charSequence).getSpans(offsetForHorizontal, offsetForHorizontal, URLSpan.class);
                                                            if (uRLSpanArr.length != 0) {
                                                                if (motionEvent.getAction() == 0) {
                                                                    this.y = uRLSpanArr[0];
                                                                } else {
                                                                    URLSpan uRLSpan = uRLSpanArr[0];
                                                                    URLSpan uRLSpan2 = this.y;
                                                                    if (uRLSpan == uRLSpan2) {
                                                                        d0(uRLSpan2);
                                                                    }
                                                                }
                                                                z4 = z3;
                                                                z2 = z4;
                                                            } else {
                                                                this.y = null;
                                                            }
                                                            z4 = z2;
                                                            z2 = z4;
                                                        }
                                                    }
                                                    this.y = null;
                                                }
                                            }
                                        }
                                    }
                                    this.y = null;
                                }
                            }
                        }
                        z3 = true;
                        if (!z2) {
                            if (x >= this.S) {
                            }
                        }
                        this.y = null;
                    }
                    if (!z2) {
                        z2 = w(motionEvent);
                    }
                    return !z2 ? super.onTouchEvent(motionEvent) : z2;
                }
                return true;
            }
        }
        return true;
    }

    @Override // hg0
    public final boolean q() {
        zl1 zl1Var = this.g1;
        if (zl1Var != null) {
            return zl1Var.j0(this, this.z0, this.A0);
        }
        return false;
    }

    public void setCustomText(CharSequence charSequence) {
        this.S0 = charSequence;
        if (charSequence != null) {
            l0(false);
        }
    }

    public void setDelegate(zl1 zl1Var) {
        this.g1 = zl1Var;
    }

    public void setInvalidateColors(boolean z) {
        if (this.f1 == z) {
            return;
        }
        this.f1 = z;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.u2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.w = view;
    }

    public void setInvalidatesParent(boolean z) {
        this.t2 = z;
    }

    public void setMessageObject(k47 k47Var) {
        i0(k47Var, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.k2 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i) {
        this.l2 = i;
    }

    public void setScrimReaction(Integer num) {
        this.F0.z = num;
    }

    public void setShowTopic(boolean z) {
        if (this.n0 != z) {
            this.n0 = z;
            T();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z) {
        this.K0 = z;
        mmc mmcVar = this.J0;
        if (mmcVar != null) {
            mmcVar.n(z);
        }
        ArrayList arrayList = this.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((rna) obj).invalidateSelf();
        }
    }

    public void setWalletSlidingOffset(float f) {
        setTranslationX((getTranslationX() - this.N0) + f);
        this.N0 = f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x067e, code lost:
    
        if (r11 == false) goto L290;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence L0;
        CharSequence charSequence3;
        boolean z;
        CharSequence Z;
        ArrayList<TLRPC.VideoSize> arrayList;
        TLRPC.Photo photo;
        ArrayList<TLRPC.VideoSize> arrayList2;
        CharSequence charSequence4;
        int i;
        String G;
        CharSequence L02;
        CharSequence charSequence5;
        boolean z2;
        long j;
        boolean z3;
        SpannableStringBuilder spannableStringBuilder;
        long j2;
        TL_stars.StarGift starGift;
        String str;
        CharSequence S2;
        TL_stars.StarGift starGift2;
        String str2;
        CharSequence charSequence6;
        String q;
        TLRPC.Peer peer;
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        int i2;
        TLRPC.MessageMedia messageMedia;
        k47 k47Var = this.Q0;
        int i3 = this.I;
        if (k47Var == null) {
            charSequence = this.S0;
        } else if (S()) {
            CharSequence q2 = c.C(i3).q(((TLRPC.TL_messageActionGramTransfer) k47Var.k.action).amount, false);
            if (!TextUtils.isEmpty(q2)) {
                charSequence = jb6.V(null, null, 2131742637, gn.cloneSpans(k47Var.v), q2);
                if (charSequence == null) {
                    TLRPC.Message message2 = k47Var.k;
                    if (message2 == null || (messageMedia = message2.media) == null || messageMedia.ttl_seconds == 0) {
                        charSequence = gn.cloneSpans(k47Var.v);
                    } else if (messageMedia.photo != null) {
                        charSequence = jb6.M0(2131753912, null);
                    } else {
                        TLRPC.Document document = messageMedia.document;
                        charSequence = ((document instanceof TLRPC.TL_documentEmpty) || ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && document == null)) ? messageMedia.voice ? jb6.M0(2131753894, null) : messageMedia.round ? jb6.M0(2131753905, null) : jb6.M0(2131753897, null) : gn.cloneSpans(k47Var.v);
                    }
                }
            }
            charSequence = null;
            if (charSequence == null) {
            }
        } else {
            if (k47Var.g3()) {
                charSequence = k47Var.k.media.user_id != z8c.h(i3).e() ? y4b.e(new Object[0], 2131750810, true) : y4b.e(new Object[]{oc7.r1(i3).W1(Long.valueOf(k47.B0(k47Var.k))).first_name}, 2131750809, true);
            } else {
                zl1 zl1Var = this.g1;
                if (zl1Var != null && zl1Var.d() == 0 && k47.D4(k47Var)) {
                    charSequence = no4.c(oc7.r1(i3).g4.f(-k47.B0(k47Var.k), k47.b2(i3, k47Var.k, true, false)), k47Var);
                }
                charSequence = null;
            }
            if (charSequence == null) {
            }
        }
        k47 k47Var2 = this.Q0;
        if (k47Var2 != null && k47Var2.j2) {
            charSequence = "";
        }
        if (k47Var2 != null && (message = k47Var2.k) != null && (messageAction = message.action) != null) {
            if (messageAction instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                i2 = org.telegram.messenger.beta.R.drawable.mini_checklist_add;
            } else if (messageAction instanceof TLRPC.TL_messageActionTodoCompletions) {
                TLRPC.TL_messageActionTodoCompletions tL_messageActionTodoCompletions = (TLRPC.TL_messageActionTodoCompletions) messageAction;
                i2 = tL_messageActionTodoCompletions.incompleted.size() > tL_messageActionTodoCompletions.completed.size() ? org.telegram.messenger.beta.R.drawable.mini_checklist_undone : org.telegram.messenger.beta.R.drawable.mini_checklist_done;
            } else {
                i2 = 0;
            }
            if (i2 != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                spannableStringBuilder2.insert(0, (CharSequence) "i ");
                spannableStringBuilder2.setSpan(new pn2(i2, 0), 0, 1, 33);
                charSequence = spannableStringBuilder2;
            }
        }
        C(this.W, charSequence);
        if (this.P0 != null) {
            this.N = null;
            this.P = 0;
            this.Q = null;
            this.R = 0;
            this.T = 0;
        }
        if (k47Var != null) {
            TLRPC.Message message3 = k47Var.k;
            if (message3 != null) {
                TLRPC.MessageAction messageAction2 = message3.action;
                if ((messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction2).balance_too_low) {
                    B(null, null, charSequence, false, !sd2.z(i3, 24, k47.B0(message3)) ? jb6.M0(2131744840, null) : null, 11, null, this.j1, false);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                }
            }
            CharSequence charSequence7 = charSequence;
            if (message3 != null) {
                TLRPC.MessageAction messageAction3 = message3.action;
                if ((messageAction3 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction3).rejected) {
                    B(null, null, charSequence7, false, null, 11, null, this.j1, false);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                }
            }
            int i4 = k47Var.D;
            if (i4 == 11) {
                float L = gm.L(19.0f) + this.P;
                float f = gm.u;
                this.J.i0((this.W - gm.u) / 2.0f, L, f, f);
            } else if (i4 == 25) {
                z();
            } else {
                long j3 = 0;
                TextPaint textPaint = this.G1;
                if (i4 == 30) {
                    TLRPC.User W1 = oc7.r1(i3).W1(Long.valueOf(k47.B0(this.Q0.k)));
                    TLRPC.MessageAction messageAction4 = k47Var.k.action;
                    if (messageAction4 instanceof TLRPC.TL_messageActionGiftStars) {
                        B(jb6.H(',', "ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction4).stars), null, gm.S2(this.Q0.O3() ? jb6.a0(null, null, 2131754628, m9c.l(W1)) : jb6.M0(2131754627, null)), false, jb6.M0(2131754623, null), 11, null, this.j1, true);
                    } else if ((messageAction4 instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction4).refunded) {
                        long e = z8c.h(i3).e();
                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) k47Var.k.action;
                        if (k47Var.O3() != (!tL_messageActionStarGiftUnique.upgrade)) {
                            e = k47.B0(k47Var.k);
                        }
                        TLRPC.User W12 = oc7.r1(i3).W1(Long.valueOf(e));
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        spannableStringBuilder3.append((CharSequence) jb6.M0(tL_messageActionStarGiftUnique.prepaid_upgrade ? 2131750361 : 2131750370, null)).append((CharSequence) " ");
                        if (W12 != null && W12.photo != null) {
                            spannableStringBuilder3.append((CharSequence) "a ");
                            ed0 ed0Var = new ed0(18.0f, i3, this);
                            ed0Var.e(W12);
                            spannableStringBuilder3.setSpan(ed0Var, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                        }
                        spannableStringBuilder3.append((CharSequence) m9c.l(W12));
                        B(spannableStringBuilder3, null, jb6.M0(2131750362, null), false, jb6.M0(2131754623, null), 12, jb6.M0(2131749827, null), this.j1, true);
                    } else if (messageAction4 instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction4;
                        long j4 = tL_messageActionStarGift.convert_stars;
                        long e2 = z8c.h(i3).e();
                        TLRPC.Peer peer2 = tL_messageActionStarGift.peer;
                        boolean z4 = peer2 != null && (!tL_messageActionStarGift.prepaid_upgrade || (peer2 instanceof TLRPC.TL_peerChannel));
                        boolean z5 = k47.B0(k47Var.k) == e2 && !z4;
                        long Z0 = k47Var.Z0();
                        if (!tL_messageActionStarGift.prepaid_upgrade && (peer = tL_messageActionStarGift.from_id) != null) {
                            Z0 = pg3.n(peer);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        TLObject a2 = oc7.r1(i3).a2(Z0);
                        long n = pg3.n(tL_messageActionStarGift.to_id);
                        TLObject a22 = oc7.r1(i3).a2(n);
                        if (!tL_messageActionStarGift.can_upgrade || tL_messageActionStarGift.converted) {
                            z2 = z4;
                            j = n;
                        } else {
                            z2 = z4;
                            j = n;
                            if (tL_messageActionStarGift.upgrade_stars > 0 && !tL_messageActionStarGift.upgraded) {
                                z3 = true;
                                if (j == 0 && tL_messageActionStarGift.auction_acquired && a22 != null) {
                                    spannableStringBuilder4.append((CharSequence) jb6.M0(2131750367, null)).append((CharSequence) " ");
                                    if (!(a22 instanceof TLRPC.User) ? !(!(a22 instanceof TLRPC.Chat) || ((TLRPC.Chat) a22).photo == null) : ((TLRPC.User) a22).photo != null) {
                                        spannableStringBuilder4.append((CharSequence) "a ");
                                        ed0 ed0Var2 = new ed0(18.0f, i3, this);
                                        pc0 pc0Var = ed0Var2.c;
                                        pc0Var.o(a22);
                                        ed0Var2.b.U(a22, pc0Var, null);
                                        spannableStringBuilder4.setSpan(ed0Var2, spannableStringBuilder4.length() - 2, spannableStringBuilder4.length() - 1, 33);
                                    }
                                    spannableStringBuilder = spannableStringBuilder4;
                                    spannableStringBuilder.append((CharSequence) pg3.t(a22));
                                    j2 = j4;
                                } else {
                                    spannableStringBuilder = spannableStringBuilder4;
                                    if (z5) {
                                        j2 = j4;
                                        spannableStringBuilder.append((CharSequence) jb6.M0(tL_messageActionStarGift.prepaid_upgrade ? 2131750361 : 2131750370, null)).append((CharSequence) " ");
                                        if (!(a2 instanceof TLRPC.User) ? !(!(a2 instanceof TLRPC.Chat) || ((TLRPC.Chat) a2).photo == null) : ((TLRPC.User) a2).photo != null) {
                                            spannableStringBuilder.append((CharSequence) "a ");
                                            ed0 ed0Var3 = new ed0(18.0f, i3, this);
                                            pc0 pc0Var2 = ed0Var3.c;
                                            pc0Var2.o(a2);
                                            ed0Var3.b.U(a2, pc0Var2, null);
                                            spannableStringBuilder.setSpan(ed0Var3, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                                        }
                                        spannableStringBuilder.append((CharSequence) pg3.t(a2));
                                    } else if (tL_messageActionStarGift.gift_num <= 0 || (starGift = tL_messageActionStarGift.gift) == null || (str = starGift.title) == null) {
                                        j2 = j4;
                                        spannableStringBuilder.append((CharSequence) jb6.M0(2131750372, null));
                                    } else {
                                        j2 = j4;
                                        spannableStringBuilder.append((CharSequence) str).append((CharSequence) " #").append((CharSequence) jb6.E(tL_messageActionStarGift.gift_num, ','));
                                    }
                                }
                                boolean z6 = !((k47Var.O3() || z5) && tL_messageActionStarGift.converted) && tL_messageActionStarGift.convert_stars > 0 && ((int) oc7.r1(i3).l4.v3.g(TimeUnit.SECONDS)) - (ConnectionsManager.getInstance(i3).getCurrentTime() - k47Var.k.date) > 0 && !tL_messageActionStarGift.refunded;
                                if (tL_messageActionStarGift.refunded) {
                                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                                    if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                        textPaint.setTextSize(gm.L(13.0f));
                                        k47.a(spannableStringBuilder5, tL_messageActionStarGift.message.entities, false, true, true);
                                        S2 = k47.y5(textPaint.getFontMetricsInt(), gw3.m(spannableStringBuilder5, textPaint.getFontMetricsInt(), false, null, 0), tL_messageActionStarGift.message.entities);
                                    } else if (tL_messageActionStarGift.auction_acquired) {
                                        S2 = jb6.Z(2131750353, jb6.E(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                    } else if (!z2) {
                                        long j5 = j2;
                                        if (z5) {
                                            S2 = (!tL_messageActionStarGift.converted || j5 <= 0) ? tL_messageActionStarGift.can_upgrade ? gm.S2(jb6.L0(2131750375)) : gm.S2(jb6.L0(2131750376)) : jb6.I((int) j5, "Gift2ActionConvertedInfo");
                                        } else if (z3) {
                                            S2 = gm.S2(k47Var.O3() ? jb6.Z(2131750363, m9c.l(W1)) : jb6.L0(2131750364));
                                        } else {
                                            S2 = k47Var.O3() ? (!z6 || j5 <= 0) ? tL_messageActionStarGift.can_upgrade ? gm.S2(jb6.Z(2131750384, m9c.l(W1))) : gm.S2(jb6.Z(2131750385, m9c.l(W1))) : gm.S2(jb6.J((int) j5, "Gift2ActionOutInfo", m9c.l(W1))) : tL_messageActionStarGift.converted ? jb6.I((int) j5, "Gift2ActionConvertedInfo") : tL_messageActionStarGift.saved ? !z6 ? jb6.L0(2131750399) : jb6.L0(2131750378) : !z6 ? jb6.L0(2131750400) : gm.S2(jb6.I((int) j5, "Gift2ActionInfo"));
                                        }
                                    } else if (tL_messageActionStarGift.converted) {
                                        S2 = jb6.I((int) j2, "Gift2ActionConvertedInfo");
                                    } else {
                                        long j6 = j2;
                                        S2 = (!z6 || j6 <= 0) ? gm.S2(jb6.L0(2131750391)) : gm.S2(jb6.I((int) j6, "Gift2ActionInfoChannel"));
                                    }
                                } else {
                                    S2 = jb6.L0(2131750398);
                                }
                                CharSequence charSequence8 = S2;
                                starGift2 = tL_messageActionStarGift.gift;
                                if (starGift2 == null && starGift2.limited) {
                                    int i5 = starGift2.availability_total;
                                    str2 = jb6.Z(2131750068, i5 > 1500 ? gm.o0(i5, 0) : Integer.valueOf(i5));
                                } else {
                                    str2 = null;
                                }
                                CharSequence L03 = jb6.L0(2131754623);
                                if (k47Var.O3()) {
                                    charSequence6 = L03;
                                    if (!tL_messageActionStarGift.forceIn) {
                                    }
                                }
                                charSequence6 = L03;
                                charSequence6 = L03;
                                if (!k47Var.O3() && z3) {
                                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                                    spannableStringBuilder6.append("^  ");
                                    pn2 pn2Var = new pn2(org.telegram.messenger.beta.R.drawable.gift_unpack);
                                    pn2Var.I = 0.8f;
                                    pn2Var.J = 0.8f;
                                    spannableStringBuilder6.setSpan(pn2Var, 0, 1, 33);
                                    spannableStringBuilder6.append(jb6.L0(2131749818));
                                    charSequence6 = spannableStringBuilder6;
                                }
                                TL_stars.StarGift starGift3 = tL_messageActionStarGift.gift;
                                B(spannableStringBuilder, (starGift3 != null || starGift3.released_by == null || (q = pg3.q(oc7.r1(i3).a2(pg3.n(tL_messageActionStarGift.gift.released_by)))) == null) ? null : wsa.j2(jb6.Z(2131750380, "@".concat(q))), charSequence8, false, charSequence6, 11, str2, this.j1, true);
                            }
                        }
                        z3 = false;
                        if (j == 0) {
                        }
                        spannableStringBuilder = spannableStringBuilder4;
                        if (z5) {
                        }
                        if (k47Var.O3()) {
                        }
                        if (tL_messageActionStarGift.refunded) {
                        }
                        CharSequence charSequence82 = S2;
                        starGift2 = tL_messageActionStarGift.gift;
                        if (starGift2 == null) {
                        }
                        str2 = null;
                        CharSequence L032 = jb6.L0(2131754623);
                        if (k47Var.O3()) {
                        }
                        charSequence6 = L032;
                        charSequence6 = L032;
                        if (!k47Var.O3()) {
                            SpannableStringBuilder spannableStringBuilder62 = new SpannableStringBuilder();
                            spannableStringBuilder62.append("^  ");
                            pn2 pn2Var2 = new pn2(org.telegram.messenger.beta.R.drawable.gift_unpack);
                            pn2Var2.I = 0.8f;
                            pn2Var2.J = 0.8f;
                            spannableStringBuilder62.setSpan(pn2Var2, 0, 1, 33);
                            spannableStringBuilder62.append(jb6.L0(2131749818));
                            charSequence6 = spannableStringBuilder62;
                        }
                        TL_stars.StarGift starGift32 = tL_messageActionStarGift.gift;
                        B(spannableStringBuilder, (starGift32 != null || starGift32.released_by == null || (q = pg3.q(oc7.r1(i3).a2(pg3.n(tL_messageActionStarGift.gift.released_by)))) == null) ? null : wsa.j2(jb6.Z(2131750380, "@".concat(q))), charSequence82, false, charSequence6, 11, str2, this.j1, true);
                    } else if (messageAction4 instanceof TLRPC.TL_messageActionGiftTon) {
                        B(jb6.L0(2131754621), null, this.Q0.v, false, jb6.L0(2131754623), 11, null, this.j1, true);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else {
                        B(jb6.L0(2131754550), null, this.Q0.v, false, jb6.L0(2131754623), 11, null, this.j1, true);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    }
                } else if (i4 == 33) {
                    TLRPC.MessageAction messageAction5 = message3.action;
                    if (messageAction5 instanceof TLRPC.TL_messageActionStarGiftOnchainOffer) {
                        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) messageAction5;
                        HashMap hashMap = yr7.a;
                        this.e2 = Math.max(0, tL_messageActionStarGiftOnchainOffer.expires_at - ConnectionsManager.getInstance(i3).getCurrentTime());
                        boolean a0 = a0();
                        this.f2 = a0;
                        if (this.d2) {
                            if (a0) {
                                L02 = jb6.L0(2131748536);
                            } else {
                                L02 = jb6.L0(tL_messageActionStarGiftOnchainOffer.buyer ? 2131749501 : 2131749527);
                            }
                            charSequence5 = L02;
                        } else {
                            charSequence5 = null;
                        }
                        B(null, null, c0(yr7.d(tL_messageActionStarGiftOnchainOffer), tL_messageActionStarGiftOnchainOffer), false, charSequence5, 11, null, this.j1, this.d2 && !tL_messageActionStarGiftOnchainOffer.buyer);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else {
                        TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction5;
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(charSequence7);
                        spannableStringBuilder7.append((CharSequence) "\n\n");
                        if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                            spannableStringBuilder7.append((CharSequence) gm.S2(jb6.L0(2131749627)));
                        } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                            spannableStringBuilder7.append((CharSequence) gm.S2(jb6.L0(2131749624)));
                        } else {
                            int max = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(i3).getCurrentTime());
                            if (max == 0) {
                                spannableStringBuilder7.append((CharSequence) gm.S2(jb6.L0(2131749626)));
                            } else {
                                int i6 = max / 60;
                                int i7 = max / 3600;
                                if (i7 > 0) {
                                    i = 0;
                                    G = jb6.G(i7, "ShortHoursAgo", new Object[0]) + " " + jb6.G(i6 % 60, "ShortMinutesAgo", new Object[0]);
                                } else {
                                    i = 0;
                                    G = jb6.G(i6, "ShortMinutesAgo", new Object[0]);
                                }
                                if (G.endsWith(".")) {
                                    G = ts2.m(1, i, G);
                                }
                                Object[] objArr = new Object[1];
                                objArr[i] = G;
                                spannableStringBuilder7.append((CharSequence) gm.S2(jb6.Z(2131749625, objArr)));
                            }
                        }
                        B(null, null, spannableStringBuilder7, false, null, 11, null, this.j1, false);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    }
                } else if (i4 == 34) {
                    B(null, null, charSequence7, false, null, 11, null, this.j1, false);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                } else if (i4 == 35) {
                    TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message3.action;
                    SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                    String t = pg3.t(oc7.r1(i3).W1(Long.valueOf(k47Var.A0())));
                    if (tL_messageActionNoForwardsRequest.new_value) {
                        spannableStringBuilder8.append(k47Var.N3() ? jb6.L0(2131745114) : gm.S2(jb6.Z(2131745117, t)));
                    } else {
                        spannableStringBuilder8.append(k47Var.N3() ? jb6.L0(2131745103) : gm.S2(jb6.Z(2131745106, t)));
                    }
                    if (tL_messageActionNoForwardsRequest.new_value) {
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) E(jb6.L0(2131745124)));
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) E(jb6.L0(2131745123)));
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) E(jb6.L0(2131745122)));
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) E(jb6.L0(2131745121)));
                    } else {
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) E(jb6.L0(2131745113)));
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) E(jb6.L0(2131745112)));
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) E(jb6.L0(2131745111)));
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) E(jb6.L0(2131745110)));
                    }
                    B(null, null, spannableStringBuilder8, false, null, 11, null, this.j1, false);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                } else if (i4 == 31) {
                    TL_stars.StarGift starGift4 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message3.action).theme).gift;
                    StringBuilder sb = new StringBuilder();
                    sb.append(starGift4.title);
                    sb.append(" #");
                    String m = kt6.m(starGift4.num, ',', sb);
                    long Z02 = k47Var.Z0();
                    B(null, null, gm.S2(z8c.h(i3).e() == Z02 ? jb6.Z(2131749371, m) : jb6.Z(2131749372, pg3.r(i3, Z02), m)), false, jb6.L0(2131749373), 11, null, this.j1, true);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                } else if (i4 == 37) {
                    TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message3.action;
                    long n2 = pg3.n(message3.peer_id);
                    boolean U = sd2.U(i3, -n2);
                    boolean z7 = n2 > 0;
                    String r = pg3.r(i3, pg3.n(k47Var.k.from_id));
                    String r2 = pg3.r(i3, -tL_messageActionChangeCommunity.community_id);
                    SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder();
                    spannableStringBuilder9.append((CharSequence) yp2.a(k47Var, r2, r, U, z7));
                    B(null, null, spannableStringBuilder9, false, jb6.L0(2131749373), 11, null, this.j1, true);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                } else if (i4 == 18) {
                    TLRPC.MessageAction messageAction6 = message3.action;
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = messageAction6 instanceof TLRPC.TL_messageActionGiftPremium ? ((TLRPC.TL_messageActionGiftPremium) messageAction6).message : messageAction6 instanceof TLRPC.TL_messageActionGiftCode ? ((TLRPC.TL_messageActionGiftCode) messageAction6).message : null;
                    if (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) {
                        charSequence4 = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder(tL_textWithEntities2.text);
                        textPaint.setTextSize(gm.L(13.0f));
                        k47.a(spannableStringBuilder10, tL_textWithEntities2.entities, false, true, true);
                        charSequence4 = k47.y5(textPaint.getFontMetricsInt(), gw3.m(spannableStringBuilder10, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities2.entities);
                    }
                    if (charSequence4 == null) {
                        charSequence4 = jb6.L0(2131754638);
                    }
                    CharSequence charSequence9 = charSequence4;
                    k47 k47Var3 = this.Q0;
                    CharSequence L04 = jb6.L0((k47Var3 == null || !(k47Var3.k.action instanceof TLRPC.TL_messageActionGiftCode) || Y()) ? 2131754631 : 2131749437);
                    TLRPC.MessageAction messageAction7 = k47Var.k.action;
                    int i8 = messageAction7.months;
                    if (i8 >= 1) {
                        B(jb6.I(i8, "ActionGiftPremiumTitle2"), null, charSequence9, true, L04, 11, null, this.j1, false);
                    } else {
                        B(jb6.I(messageAction7.days, "ActionGiftPremiumTitle2Days"), null, charSequence9, true, L04, 11, null, this.j1, false);
                    }
                } else if (i4 == 21) {
                    TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                    oc7 r1 = oc7.r1(i3);
                    if (!k47Var.O3()) {
                        j3 = k47Var.A0();
                    }
                    TLRPC.User W13 = r1.W1(Long.valueOf(j3));
                    boolean z8 = tL_messageActionSuggestProfilePhoto.video || !((photo = tL_messageActionSuggestProfilePhoto.photo) == null || (arrayList2 = photo.video_sizes) == null || arrayList2.isEmpty());
                    if (W13.id == z8c.h(i3).n) {
                        TLRPC.User W14 = oc7.r1(i3).W1(Long.valueOf(k47Var.A0()));
                        Z = z8 ? jb6.Z(2131754541, W14.first_name) : jb6.Z(2131754545, W14.first_name);
                    } else {
                        String str3 = W13.first_name;
                        Z = z8 ? jb6.Z(2131754539, str3) : jb6.Z(2131754543, str3);
                    }
                    B(null, null, Z, false, (tL_messageActionSuggestProfilePhoto.video || !((arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes) == null || arrayList.isEmpty())) ? jb6.L0(2131743223) : jb6.L0(2131743231), 11, null, this.j1, true);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                } else if (i4 == 22) {
                    TLRPC.User W15 = oc7.r1(i3).W1(Long.valueOf(k47Var.O3() ? 0L : k47Var.A0()));
                    if (k47Var.A0() < 0) {
                        charSequence3 = k47Var.v;
                    } else if (!k47Var.O3() && k47Var.X4() && k47Var.S2()) {
                        charSequence2 = k47Var.v;
                        L0 = jb6.L0(2131746019);
                        z = false;
                        B(null, null, charSequence2, false, L0, 11, null, this.j1, z);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (W15 == null || W15.id != z8c.h(i3).n) {
                        charSequence2 = k47Var.v;
                        L0 = jb6.L0(2131743222);
                        z = true;
                        B(null, null, charSequence2, false, L0, 11, null, this.j1, z);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else {
                        charSequence3 = k47Var.v;
                    }
                    charSequence2 = charSequence3;
                    L0 = null;
                    z = true;
                    B(null, null, charSequence2, false, L0, 11, null, this.j1, z);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                } else if (k47Var.y4()) {
                    TLRPC.User W16 = oc7.r1(i3).W1(Long.valueOf(k47Var.k.media.user_id));
                    B(null, null, W16.self ? gm.S2(jb6.Z(2131744124, oc7.r1(i3).W1(Long.valueOf(k47Var.A0())).first_name)) : gm.S2(jb6.Z(2131744300, W16.first_name)), false, jb6.L0(2131744301), 11, null, this.j1, true);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                }
            }
        }
        int L2 = gm.L(12.0f);
        l39 l39Var = this.F0;
        l39Var.b = L2;
        l39Var.o(this.W - gm.L(24.0f), 1);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.K || drawable == this.r || super.verifyDrawable(drawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0361  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(MotionEvent motionEvent) {
        int i;
        int i2;
        ir0 ir0Var;
        k47 k47Var;
        TLRPC.Message message;
        k47 k47Var2;
        TLRPC.Message message2;
        TLRPC.Message message3;
        long j;
        TLObject L0;
        String str;
        Context context;
        boolean z;
        SpannableStringBuilder S2;
        boolean z2;
        ArrayList arrayList = this.Y1;
        if (arrayList.isEmpty()) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        float width = (getWidth() - this.j1) / 2.0f;
        float f = 4.0f;
        float L = gm.L(4.0f) + gm.L(4.0f) + this.T + this.P + this.f;
        float L2 = (this.j1 - gm.L(4.0f)) / 2.0f;
        int action = motionEvent.getAction();
        ylb ylbVar = this.h1;
        if (action == 0) {
            this.r2 = -1;
            int i3 = 0;
            while (i3 < arrayList.size()) {
                wp0 wp0Var = (wp0) arrayList.get(i3);
                float L3 = ((gm.L(f) + L2) * i3) + width;
                RectF rectF = gm.P;
                rectF.set(L3, L, L3 + L2, wp0Var.f + L);
                float f2 = x;
                float f3 = y;
                if (rectF.contains(f2, f3)) {
                    this.r2 = i3;
                    T();
                    if (wp0Var.s == null) {
                        fg0 Y = cmb.Y(cmb.v0(cmb.dd, ylbVar), 6, 6);
                        wp0Var.s = Y;
                        Y.setCallback(this);
                    }
                    wp0Var.s.setHotspot(f2, f3);
                    wp0Var.s.setState(this.q2);
                    wp0Var.b(!wp0Var.m);
                    return true;
                }
                i3++;
                f = 4.0f;
            }
            return false;
        }
        byte b = 3;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() != 3 || (i = this.r2) == -1) {
                return false;
            }
            wp0 wp0Var2 = (wp0) arrayList.get(i);
            fg0 fg0Var = wp0Var2.s;
            if (fg0Var != null) {
                fg0Var.setState(StateSet.NOTHING);
            }
            wp0Var2.b(false);
            this.r2 = -1;
            T();
            return false;
        }
        if (this.r2 == -1) {
            return false;
        }
        playSoundEffect(0);
        wp0 wp0Var3 = (wp0) arrayList.get(this.r2);
        fg0 fg0Var2 = wp0Var3.s;
        if (fg0Var2 != null) {
            fg0Var2.setState(StateSet.NOTHING);
        }
        wp0Var3.b(false);
        if (this.g1 == null || wp0Var3.m || (ir0Var = wp0Var3.j) == null) {
            i2 = -1;
        } else {
            if (getMessageObject() != null) {
                byte b2 = ir0Var.a;
                if (b2 == 5) {
                    zl1 zl1Var = this.g1;
                    d w = zl1Var != null ? zl1Var.w() : null;
                    if (w != null && this.Q0 != null) {
                        ik.s0(w, jb6.M0(2131749639, null), gm.S2(jb6.a0(null, null, 2131749640, pg3.s(k47.B0(this.Q0.k)))), jb6.M0(2131749641, null), true, new uj1(this, w, b));
                    }
                } else if (b2 == 6) {
                    k47 k47Var3 = this.Q0;
                    if (k47Var3 != null && (message3 = k47Var3.k) != null) {
                        TLRPC.MessageAction messageAction = message3.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                            TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction;
                            d Q = LaunchActivity.Q();
                            Context context2 = getContext();
                            long B0 = k47.B0(this.Q0.k);
                            int e1 = this.Q0.e1();
                            int[] iArr = mw4.G1;
                            nk n = nk.n(tL_messageActionStarGiftPurchaseOffer.price);
                            ok okVar = n.a;
                            int i4 = this.I;
                            ok okVar2 = ok.a;
                            nk j2 = nk.j((n.b * (okVar == okVar2 ? oc7.r1(i4).l4.m.f() : oc7.r1(i4).l4.n.f())) / 1000, okVar);
                            TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                            StringBuilder sb = new StringBuilder();
                            sb.append(starGift.title);
                            sb.append(" #");
                            String m = kt6.m(starGift.num, ',', sb);
                            if (B0 >= 0) {
                                j = 0;
                                L0 = oc7.r1(i4).W1(Long.valueOf(B0));
                            } else {
                                j = 0;
                                L0 = oc7.r1(i4).L0(Long.valueOf(-B0));
                            }
                            String d = n.d();
                            String d2 = j2.d();
                            if (okVar == ok.b) {
                                str = m;
                                context = context2;
                                z = true;
                            } else {
                                str = m;
                                context = context2;
                                z = false;
                            }
                            LinearLayout i5 = hg9.i(context, 1);
                            i5.addView(new wra(context, starGift, L0), qoe.t(-1, -2, 48, 0, -4, 0, 0));
                            TextView textView = new TextView(context);
                            anb.X(textView, cmb.i5, ylbVar);
                            textView.setTextSize(1, 16.0f);
                            textView.setText(gm.S2(okVar == okVar2 ? jb6.a0(null, null, 2131749617, d, pg3.s(B0), str, d2) : jb6.a0(null, null, 2131749616, d, pg3.s(B0), str, d2)));
                            i5.addView(textView, qoe.t(-1, -2, 48, 24, 4, 24, 4));
                            FrameLayout frameLayout = new FrameLayout(context);
                            frameLayout.setClipChildren(false);
                            frameLayout.setClipToPadding(false);
                            mhb mhbVar = new mhb(context, ylbVar);
                            frameLayout.addView(mhbVar, qoe.e(-1, -1, nm7.D1));
                            wsa.Z0(mhbVar, jva.i(starGift.attributes, TL_stars.starGiftAttributeModel.class));
                            wsa.Z0(mhbVar, jva.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                            wsa.Z0(mhbVar, jva.i(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                            i5.addView(frameLayout, qoe.t(-1, -2, 48, 23, 16, 23, 4));
                            nk k = nk.k(starGift.value_usd_amount / Math.pow(10.0d, cj0.h().g("USD")), okVar);
                            if (k.c() > 0.0d && starGift.value_usd_amount > j) {
                                if (k.b >= j2.b) {
                                    int round = (int) Math.round((1.0d - (j2.c() / k.c())) * 100.0d);
                                    S2 = gm.S2(jb6.a0(null, null, 2131749666, aq1.n(round, "%"), starGift.title));
                                    if (round > 10) {
                                        z2 = true;
                                        TextView textView2 = new TextView(context);
                                        textView2.setTextSize(1, 13.0f);
                                        textView2.setGravity(17);
                                        textView2.setText(S2);
                                        anb.X(textView2, !z2 ? cmb.o7 : cmb.x6, ylbVar);
                                        i5.addView(textView2, qoe.t(-1, -2, 49, 40, 12, 40, 9));
                                    }
                                } else {
                                    S2 = gm.S2(jb6.a0(null, null, 2131749669, aq1.n((int) Math.round(((j2.c() / k.c()) - 1.0d) * 100.0d), "%"), starGift.title));
                                }
                                z2 = false;
                                TextView textView22 = new TextView(context);
                                textView22.setTextSize(1, 13.0f);
                                textView22.setGravity(17);
                                textView22.setText(S2);
                                anb.X(textView22, !z2 ? cmb.o7 : cmb.x6, ylbVar);
                                i5.addView(textView22, qoe.t(-1, -2, 49, 40, 12, 40, 9));
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
                            alertDialog$Builder.n(i5);
                            alertDialog$Builder.j(nxa.V0(jb6.a0(null, null, 2131749634, d2), z), new lu3(e1, i4, Q));
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            alertDialog$Builder.a.show();
                        }
                    }
                } else {
                    if (b2 == 7) {
                        zl1 zl1Var2 = this.g1;
                        d w2 = zl1Var2 != null ? zl1Var2.w() : null;
                        if (w2 != null && (k47Var2 = this.Q0) != null && (message2 = k47Var2.k) != null) {
                            TLRPC.MessageAction messageAction2 = message2.action;
                            if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                                final byte b3 = 0;
                                ik.s0(w2, jb6.M0(tL_messageActionNoForwardsRequest.prev_value ? 2131745119 : 2131745108, null), jb6.M0(tL_messageActionNoForwardsRequest.prev_value ? 2131745120 : 2131745109, null), jb6.M0(2131745125, null), false, new Runnable(this) { // from class: wl1
                                    public final /* synthetic */ cm1 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b4 = b3;
                                        TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = tL_messageActionNoForwardsRequest;
                                        cm1 cm1Var = this.b;
                                        switch (b4) {
                                            case 0:
                                                oc7.r1(cm1Var.I).l5(k47.B0(cm1Var.Q0.k), cm1Var.Q0.e1(), tL_messageActionNoForwardsRequest2.prev_value, null);
                                                break;
                                            default:
                                                oc7.r1(cm1Var.I).l5(k47.B0(cm1Var.Q0.k), cm1Var.Q0.e1(), tL_messageActionNoForwardsRequest2.new_value, null);
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                    } else if (b2 == 8) {
                        zl1 zl1Var3 = this.g1;
                        d w3 = zl1Var3 != null ? zl1Var3.w() : null;
                        if (w3 != null && (k47Var = this.Q0) != null && (message = k47Var.k) != null) {
                            TLRPC.MessageAction messageAction3 = message.action;
                            if (messageAction3 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = (TLRPC.TL_messageActionNoForwardsRequest) messageAction3;
                                final byte b4 = 1;
                                ik.s0(w3, jb6.M0(tL_messageActionNoForwardsRequest2.new_value ? 2131745119 : 2131745108, null), jb6.M0(tL_messageActionNoForwardsRequest2.new_value ? 2131745118 : 2131745107, null), jb6.M0(2131745125, null), false, new Runnable(this) { // from class: wl1
                                    public final /* synthetic */ cm1 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b42 = b4;
                                        TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest22 = tL_messageActionNoForwardsRequest2;
                                        cm1 cm1Var = this.b;
                                        switch (b42) {
                                            case 0:
                                                oc7.r1(cm1Var.I).l5(k47.B0(cm1Var.Q0.k), cm1Var.Q0.e1(), tL_messageActionNoForwardsRequest22.prev_value, null);
                                                break;
                                            default:
                                                oc7.r1(cm1Var.I).l5(k47.B0(cm1Var.Q0.k), cm1Var.Q0.e1(), tL_messageActionNoForwardsRequest22.new_value, null);
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
            }
            i2 = -1;
        }
        this.r2 = i2;
        T();
        return false;
    }

    public final void x() {
        float f = this.b1;
        RectF rectF = this.d1;
        this.b1 = (int) Math.min(f, rectF.left);
        this.c1 = (int) Math.max(this.c1, rectF.right);
    }

    public final boolean y(float f, int i) {
        l39 l39Var = this.F0;
        if (!l39Var.H) {
            return false;
        }
        float y = getY() + l39Var.c;
        return y > f && (y + ((float) l39Var.m)) - ((float) gm.L(16.0f)) < ((float) i);
    }

    public final void z() {
        SpannableStringBuilder spannableStringBuilder;
        int L = this.j1 - gm.L(16.0f);
        float L2 = gm.L(14.0f);
        TextPaint textPaint = this.F1;
        textPaint.setTextSize(L2);
        float L3 = gm.L(13.0f);
        TextPaint textPaint2 = this.G1;
        textPaint2.setTextSize(L3);
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.Q0.k.action;
        int i = tL_messageActionGiftCode.months;
        TLRPC.Chat L0 = oc7.r1(this.I).L0(Long.valueOf(-pg3.n(tL_messageActionGiftCode.boost_peer)));
        String str = L0 == null ? null : L0.title;
        boolean z = tL_messageActionGiftCode.via_giveaway;
        String M0 = tL_messageActionGiftCode.unclaimed ? jb6.M0(2131753141, "BoostingUnclaimedPrize") : jb6.M0(2131753507, "BoostingCongratulations");
        String G = i == 12 ? jb6.G(1, "BoldYears", new Object[0]) : jb6.G(i, "BoldMonths", new Object[0]);
        if (!z) {
            spannableStringBuilder = new SpannableStringBuilder(gm.S2(str == null ? jb6.M0(2131753275, null) : jb6.a0("BoostingReceivedGiftFrom", null, 2131753276, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            kt6.t(null, null, 2131753277, new Object[]{G}, spannableStringBuilder);
        } else if (tL_messageActionGiftCode.unclaimed) {
            spannableStringBuilder = new SpannableStringBuilder(gm.S2(jb6.a0(null, null, 2131753131, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            kt6.t(null, null, 2131753140, new Object[]{G}, spannableStringBuilder);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(gm.S2(jb6.a0(null, null, 2131753272, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            kt6.t(null, null, 2131753273, new Object[]{G}, spannableStringBuilder);
        }
        String M02 = jb6.M0(2131753274, "BoostingReceivedGiftOpenBtn");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
        valueOf.setSpan(new z5c(gm.o()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.k1 = new StaticLayout(valueOf, textPaint, L, alignment, 1.1f, 0.0f, false);
        this.n1 = null;
        this.m1 = null;
        am1 am1Var = this.t1;
        if (am1Var != null) {
            gn.release(am1Var.i, am1Var.h);
        }
        am1 am1Var2 = new am1(this);
        this.t1 = am1Var2;
        am1Var2.a(L, textPaint2, spannableStringBuilder);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(M02);
        valueOf2.setSpan(new z5c(gm.o()), 0, valueOf2.length(), 33);
        this.p1 = false;
        this.q1 = 0;
        this.x1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) O("paintChatActionText"), L, alignment, 1.0f, 0.0f, false);
        this.y1 = staticLayout;
        this.z1 = true;
        this.E1 = Z(staticLayout);
    }

    @Override // cr3
    public final void A(boolean z) {
    }

    @Override // mk5
    public final void b(boolean z, boolean z2) {
    }

    @Override // cr3
    public final void i(long j, long j2) {
    }

    @Override // cr3
    public final void l(long j, long j2) {
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.t2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.t2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    public cm1(Context context) {
        this(null, context, false);
    }
}
