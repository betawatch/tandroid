package ih;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import kh.rb;
import kh.wb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.qi0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.z10;
import org.telegram.ui.dy;
import org.telegram.ui.vw;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class r extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, td.b {
    public final n A;
    public float A0;
    public final n B;
    public ValueAnimator B0;
    public final Paint C;
    public float C0;
    public final Paint D;
    public ValueAnimator D0;
    public final wc E;
    public float E0;
    public kh.x3 F;
    public OvershootInterpolator F0;
    public boolean G;
    public AnimatorSet G0;
    public int H;
    public final com.google.firebase.messaging.l H0;
    public int I;
    public long I0;
    public float J;
    public Drawable J0;
    public int K;
    public final ArrayList L;
    public final ArrayList M;
    public final f2.n N;
    public final f2.m0 O;
    public final org.telegram.ui.Components.j6 P;
    public final k Q;
    public final ImageView R;
    public final ImageView S;
    public final org.telegram.ui.Components.i5 T;
    public final ArrayList U;
    public float V;
    public float W;
    public final td.a a;
    public final dy a0;
    public final int b;
    public CharSequence b0;
    public final Drawable c;
    public boolean c0;
    public final m d;
    public int d0;
    public int e;
    public SpannableStringBuilder e0;
    public final int f;
    public ValueAnimator f0;
    public p g0;
    public final j h;
    public boolean h0;
    public boolean i0;
    public float j0;
    public int k0;
    public q l0;
    public org.telegram.ui.ActionBar.k m0;
    public qi0 n;
    public m7 n0;
    public float o0;
    public final float p0;
    public final float q0;
    public final j r;
    public final float r0;
    public final v6 s;
    public final a5.e s0;
    public LinearGradient t0;
    public Matrix u0;
    public final ArrayList v;
    public Paint v0;
    public final ArrayList w;
    public boolean w0;
    public final ArrayList x;
    public final float x0;
    public final ArrayList y;
    public ValueAnimator y0;
    public ValueAnimator z0;

    public r(Context context, dy dyVar, int i9, int i10) {
        super(context);
        this.a = new td.a(1, this, gr.h, 380L, false);
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        vw vwVar = (vw) this;
        n nVar = new n(vwVar, false);
        this.A = nVar;
        n nVar2 = new n(vwVar, true);
        this.B = nVar2;
        Paint paint = new Paint();
        this.C = new Paint(1);
        this.D = new Paint(1);
        wc wcVar = new wc(this);
        this.E = wcVar;
        this.J = -1.0f;
        this.K = -1;
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.U = new ArrayList();
        this.V = -1.0f;
        this.h0 = true;
        this.p0 = 1.0f;
        this.q0 = 0.95f;
        this.r0 = 0.9f;
        this.s0 = new a5.e(22);
        this.x0 = 0.3f;
        this.A0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.F0 = new OvershootInterpolator(0.95f);
        com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l(this);
        this.H0 = lVar;
        this.b = i10;
        this.f = i9;
        this.a0 = dyVar;
        this.o0 = AndroidUtilities.dp(68.0f);
        this.s = MessagesController.getInstance(i9).getStoriesController();
        j jVar = new j(vwVar, context, 0);
        this.h = jVar;
        jVar.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        jVar.setClipToPadding(false);
        jVar.setClipChildren(false);
        wcVar.h = new g(vwVar, 0);
        bg.d2 d2Var = new bg.d2(vwVar, 8);
        wcVar.l = true;
        wcVar.j = d2Var;
        jVar.j(new bg.o2(vwVar, 10));
        f2.n nVar3 = new f2.n();
        this.N = nVar3;
        nVar3.C = false;
        nVar3.n(150L);
        nVar3.m = false;
        jVar.setItemAnimator(nVar3);
        f2.m0 m0Var = new f2.m0(0, false);
        this.O = m0Var;
        jVar.setLayoutManager(m0Var);
        jVar.setOnItemClickListener(new eh.j(vwVar, 7));
        jVar.setOnItemLongClickListener(new gh.i3(vwVar, 18));
        jVar.setAdapter(nVar);
        addView(jVar, g7.e6.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getContext(), true, true, false);
        this.P = j6Var;
        j6Var.setGravity(3);
        j6Var.setTextColor(getTextLogoColor());
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        j6Var.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        j6Var.setImportantForAccessibility(1);
        j6Var.setFocusableInTouchMode(true);
        addView(j6Var, g7.e6.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.R = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AppName));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, g7.e6.c(22.0f, 90));
        org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(26.0f), null);
        this.T = i5Var;
        i5Var.a = true;
        i5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.S = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(i5Var);
        addView(imageView2, g7.e6.c(40.0f, 40));
        k kVar = new k(vwVar, context, lVar);
        this.Q = kVar;
        addView(kVar, g7.e6.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        j jVar2 = new j(vwVar, getContext(), 1);
        this.r = jVar2;
        getContext();
        jVar2.setLayoutManager(new f2.m0(0, false));
        jVar2.i(new l(0));
        m mVar = new m();
        this.d = mVar;
        mVar.C = false;
        mVar.m = false;
        jVar2.setItemAnimator(mVar);
        jVar2.setAdapter(nVar2);
        jVar2.setClipChildren(false);
        addView(jVar2, g7.e6.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        return this.b == 0 ? f(org.telegram.ui.ActionBar.f6.A8) : f(org.telegram.ui.ActionBar.f6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.f6.gl);
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 1) {
            d();
        }
    }

    public final void b() {
        this.J = 1.0f - AndroidUtilities.lerp(1.0f - this.V, 1.0f, 1.0f - this.W);
        d();
        float f10 = this.J;
        int i9 = f10 == 1.0f ? 2 : f10 != 0.0f ? 1 : 0;
        if (this.K != i9) {
            this.K = i9;
            if (i9 != 1 && this.G) {
                AndroidUtilities.runOnUIThread(new d(this, 0));
            }
            int i10 = this.K;
            j jVar = this.r;
            j jVar2 = this.h;
            if (i10 == 0) {
                AndroidUtilities.forEachViews((RecyclerView) jVar2, (d5.d) new e(0));
                jVar.setVisibility(4);
                jVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.I0) {
                    this.I0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i11 = this.f;
                if (i10 == 1) {
                    ArrayList arrayList = this.M;
                    arrayList.clear();
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.x;
                        if (i12 >= arrayList2.size()) {
                            break;
                        }
                        if (((o) arrayList2.get(i12)).c != UserConfig.getInstance(i11).getClientUserId() || m()) {
                            arrayList.add(Long.valueOf(((o) arrayList2.get(i12)).c));
                            if (arrayList.size() == 3) {
                                break;
                            }
                        }
                        i12++;
                    }
                    jVar.setVisibility(4);
                    jVar2.setVisibility(0);
                } else if (i10 == 2) {
                    jVar.setVisibility(0);
                    jVar2.setVisibility(4);
                    this.O.h1(0, 0);
                    bg.c2 c2Var = MessagesController.getInstance(i11).getStoriesController().K;
                    AndroidUtilities.cancelRunOnUIThread(c2Var);
                    c2Var.run();
                    m7 m7Var = this.n0;
                    if (m7Var != null) {
                        m7Var.a();
                        this.n0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int N0;
        f2.m0 m0Var = this.O;
        int N02 = m0Var.N0() + 10;
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        v6 v6Var = this.s;
        if (N02 > size || ((N0 = m0Var.N0() + 9) < arrayList.size() && v6Var.D(0, ((o) arrayList.get(N0)).c) == 0)) {
            boolean z10 = this.b == 1;
            if (z10) {
                if (!v6Var.z) {
                    return;
                }
            } else if (!v6Var.p) {
                return;
            }
            v6Var.Q(z10);
        }
    }

    public final void d() {
        float a2 = g7.n.a(Math.min(this.J, this.W), 0.0f, 1.0f);
        float f10 = this.a.e;
        float f11 = 1.0f - f10;
        float f12 = f10 * a2;
        float f13 = f11 * a2;
        org.telegram.ui.Components.j6 j6Var = this.P;
        if (j6Var != null) {
            j6Var.setAlpha(f12);
            j6Var.setVisibility(f12 > 0.0f ? 0 : 8);
        }
        ImageView imageView = this.R;
        if (imageView != null) {
            imageView.setAlpha(f13);
            imageView.setVisibility(f13 > 0.0f ? 0 : 8);
        }
        ImageView imageView2 = this.S;
        if (imageView2 != null) {
            imageView2.setAlpha(f13);
            imageView2.setVisibility(f13 > 0.0f ? 0 : 8);
        }
        k kVar = this.Q;
        if (kVar != null) {
            kVar.setAlpha(a2);
            kVar.setVisibility(a2 > 0.0f ? 0 : 8);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.storiesUpdated && this.h0) {
            p(getVisibility() == 0, false);
            AndroidUtilities.runOnUIThread(new d(this, 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03a8  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i9;
        float f10;
        float f11;
        j jVar;
        float f12;
        float f13;
        j jVar2;
        int i10;
        Canvas canvas2;
        boolean z10;
        float f14;
        double d;
        boolean z11;
        float f15;
        float f16;
        j jVar3;
        float f17;
        float dp;
        float f18;
        float lerp;
        float f19;
        float lerp2;
        int i11;
        float f20;
        float f21;
        float lerp3;
        float f22;
        float f23;
        int R;
        canvas.save();
        int i12 = this.H;
        if (i12 > 0) {
            canvas.clipRect(0, i12, getMeasuredWidth(), getMeasuredHeight());
        }
        float measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(4.0f);
        float f24 = 0.0f;
        float lerp4 = AndroidUtilities.lerp(0.0f, measuredHeight, this.V);
        j jVar4 = this.h;
        jVar4.setTranslationY(lerp4);
        j jVar5 = this.r;
        jVar5.setTranslationY(lerp4);
        jVar5.setTranslationX(this.o0);
        int i13 = 0;
        while (true) {
            arrayList = this.L;
            if (i13 >= arrayList.size()) {
                break;
            }
            ((q) arrayList.get(i13)).a = false;
            i13++;
        }
        arrayList.clear();
        int i14 = this.K;
        int i15 = -1;
        ArrayList arrayList2 = this.M;
        if ((i14 == 1 || i14 == 0) && !arrayList2.isEmpty()) {
            i9 = -1;
            f10 = 4.0f;
            for (int i16 = 0; i16 < jVar4.getChildCount(); i16++) {
                q qVar = (q) jVar4.getChildAt(i16);
                i9 = qVar.A == ((Long) arrayList2.get(0)).longValue() ? RecyclerView.R(qVar) : i9;
            }
        } else {
            f10 = 4.0f;
            i9 = this.K == 2 ? 0 : -1;
        }
        int i17 = this.K;
        if (i17 < 0 || i17 == 2) {
            f11 = lerp4;
            jVar = jVar4;
            f12 = 2.0f;
            float f25 = 0.0f;
            for (int i18 = 0; i18 < jVar5.getChildCount(); i18++) {
                float x10 = ((q) jVar5.getChildAt(i18)).getX() + jVar5.getX() + r4.getMeasuredWidth();
                if (f25 == 0.0f || x10 > f25) {
                    f25 = x10;
                }
            }
            f13 = f25;
        } else {
            if (i9 == -1) {
                f2.m0 m0Var = this.O;
                i9 = m0Var.I0();
                if (i9 == -1) {
                    i9 = m0Var.L0();
                }
                z10 = true;
            } else {
                z10 = false;
            }
            jVar4.setAlpha(1.0f - Utilities.clamp(this.J / this.x0, 1.0f, 0.0f));
            this.k0 = -1;
            if (this.j0 != 0.0f) {
                int i19 = 0;
                int i20 = -1;
                f12 = 2.0f;
                while (i19 < jVar4.getChildCount()) {
                    View childAt = jVar4.getChildAt(i19);
                    if (childAt.getX() < f24 || childAt.getX() + childAt.getMeasuredWidth() > getMeasuredWidth() || (R = RecyclerView.R(childAt)) < 0 || (i20 != i15 && R >= i20)) {
                        f23 = lerp4;
                    } else {
                        f23 = lerp4;
                        if (((o) this.x.get(R)).c != UserConfig.getInstance(this.f).clientUserId) {
                            this.l0 = (q) childAt;
                            i20 = R;
                        }
                    }
                    i19++;
                    lerp4 = f23;
                    i15 = -1;
                    f24 = 0.0f;
                }
                f11 = lerp4;
                this.k0 = i20;
            } else {
                f11 = lerp4;
                f12 = 2.0f;
            }
            float f26 = 0.0f;
            int i21 = 0;
            while (i21 < jVar4.getChildCount()) {
                q qVar2 = (q) jVar4.getChildAt(i21);
                qVar2.setClipInParent(false);
                l7 l7Var = qVar2.K;
                int R2 = RecyclerView.R(qVar2);
                float f27 = this.J;
                if (R2 >= i9 && R2 < arrayList2.size() + i9) {
                    int i22 = R2 - i9;
                    if (i22 == i9 + 2) {
                        f27 = this.J;
                    } else if (i22 == i9 + 1) {
                        f14 = measuredHeight;
                        f27 = (float) Math.pow(this.J, 0.5d);
                        d = 0.25d;
                        if (R2 < i9) {
                            f27 = (float) Math.pow(this.J, d);
                        }
                        qVar2.d(f27, this.W, this.j0, this.k0 == qVar2.b);
                        if (R2 > i9 || R2 >= arrayList2.size() + i9) {
                            z11 = z10;
                            f15 = f26;
                            f16 = f27;
                            jVar3 = jVar4;
                            f17 = 0.0f;
                            l7Var.g = 0.0f;
                            l7Var.h = 0.0f;
                            l7Var.i = 0.0f;
                            l7Var.j = 0.0f;
                            l7Var.k = false;
                        } else {
                            q qVar3 = (q) jVar4.getChildAt(i21 - 1);
                            if (qVar3 != null) {
                                l7 l7Var2 = qVar3.K;
                                float dp2 = AndroidUtilities.dp(48.0f);
                                float dp3 = AndroidUtilities.dp(26.33f);
                                z11 = z10;
                                float lerp5 = (AndroidUtilities.lerp(dp2, dp3, qVar3.F) + AndroidUtilities.dp(8.0f)) / f12;
                                float lerp6 = (AndroidUtilities.lerp(dp2, dp3, qVar2.F) + AndroidUtilities.dp(8.0f)) / f12;
                                float x11 = qVar3.getX() + l7Var2.F.centerX();
                                float y10 = qVar3.getY() + l7Var2.F.centerY();
                                float x12 = (qVar2.getX() + l7Var.F.centerX()) - x11;
                                float y11 = (qVar2.getY() + l7Var.F.centerY()) - y10;
                                f15 = f26;
                                if (((float) Math.sqrt((y11 * y11) + (x12 * x12))) < lerp5 + lerp6) {
                                    float degrees = (float) Math.toDegrees(Math.acos(r1 / r3) * 2.0d);
                                    f16 = f27;
                                    jVar3 = jVar4;
                                    float degrees2 = (float) Math.toDegrees(Math.atan2(y11, x12));
                                    float f28 = degrees / f12;
                                    l7Var2.g = degrees2 - f28;
                                    l7Var2.h = degrees2 + f28;
                                    float degrees3 = (float) Math.toDegrees(Math.atan2(-y11, -x12));
                                    float f29 = -Math.abs(degrees3 - f28);
                                    float abs = Math.abs(degrees3 + f28);
                                    l7Var.i = f29;
                                    l7Var.j = abs;
                                    f17 = 0.0f;
                                } else {
                                    f16 = f27;
                                    jVar3 = jVar4;
                                    f17 = 0.0f;
                                    l7Var2.g = 0.0f;
                                    l7Var2.h = 0.0f;
                                    l7Var.i = 0.0f;
                                    l7Var.j = 0.0f;
                                }
                                l7Var2.k = false;
                                l7Var.k = false;
                            } else {
                                z11 = z10;
                                f15 = f26;
                                f16 = f27;
                                jVar3 = jVar4;
                                f17 = 0.0f;
                            }
                        }
                        dp = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.j0 - 0.5f) / 0.5f, 1.0f, f17);
                        float f30 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                        if (R2 <= i9) {
                            f18 = 0.0f;
                            lerp = 0.0f;
                        } else if (R2 == i9 + 1) {
                            lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), 0.0f, this.J) + ((AndroidUtilities.dp(16.0f) * f16) - AndroidUtilities.dpf2(0.5f));
                            f18 = 0.0f;
                        } else {
                            f18 = 0.0f;
                            lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), 0.0f, this.J) + (((AndroidUtilities.dp(16.0f) * f16) + AndroidUtilities.dp(16.0f)) - AndroidUtilities.dpf2(0.5f));
                        }
                        float f31 = lerp + this.o0;
                        if (this.w0) {
                            f19 = 0.0f;
                            lerp2 = AndroidUtilities.lerp(0.0f, f31 - qVar2.getLeft(), this.F0.getInterpolation(this.A0));
                        } else {
                            if (this.j0 > f18) {
                                int i23 = qVar2.b;
                                int i24 = this.k0;
                                if (i23 < i24) {
                                    f22 = -dp;
                                } else if (i23 > i24) {
                                    f22 = dp;
                                }
                                lerp2 = AndroidUtilities.lerp(f31 - qVar2.getLeft(), f22, 1.0f - this.E0);
                                f19 = 0.0f;
                            }
                            f22 = 0.0f;
                            lerp2 = AndroidUtilities.lerp(f31 - qVar2.getLeft(), f22, 1.0f - this.E0);
                            f19 = 0.0f;
                        }
                        float a2 = g7.n.a((this.V - 0.2f) / 0.1f, f19, 1.0f);
                        i11 = R2 - i9;
                        if (i11 == 0) {
                            f20 = 0.65f;
                            lerp3 = AndroidUtilities.lerp(f19, f11 - f14, gr.h.getInterpolation(this.J));
                        } else {
                            f20 = 0.65f;
                            if (i11 == 1) {
                                lerp3 = AndroidUtilities.lerp(f19, (f11 - f14) * 0.65f, gr.h.getInterpolation(this.J));
                            } else {
                                f21 = 0.0f;
                                float f32 = (qVar2.b == this.k0 || this.j0 <= f19) ? 0.0f : (-dp) / f12;
                                float lerp7 = AndroidUtilities.lerp(i11 != 0 ? AndroidUtilities.lerp(f32, f11 - f14, this.C0) : i11 == 1 ? AndroidUtilities.lerp(f32, (f11 - f14) * f20, this.C0) : 0.0f, f21, a2);
                                if (this.J <= 0.0f) {
                                    boolean z12 = R2 >= i9 && R2 <= i9 + 2;
                                    if (!z11) {
                                        qVar2.setCrossfadeTo(-1L);
                                    } else if (i11 < 0 || i11 >= arrayList2.size()) {
                                        qVar2.setCrossfadeTo(-1L);
                                    } else {
                                        qVar2.setCrossfadeTo(((Long) arrayList2.get(i11)).longValue());
                                    }
                                    qVar2.a = z12;
                                    qVar2.d = R2 == i9;
                                    qVar2.c = R2 >= (arrayList2.size() + i9) + (-1);
                                    qVar2.setTranslationX(lerp2);
                                    qVar2.setTranslationY(lerp7);
                                    if (z12) {
                                        arrayList.add(qVar2);
                                    }
                                } else if (jVar3.getItemAnimator() == null || !jVar3.getItemAnimator().k()) {
                                    if (this.j0 > 0.0f) {
                                        int i25 = qVar2.b;
                                        int i26 = this.k0;
                                        if (i25 < i26) {
                                            qVar2.setAlpha(f30);
                                        } else if (i25 > i26) {
                                            qVar2.setAlpha(f30);
                                        } else {
                                            qVar2.setAlpha(1.0f);
                                        }
                                    } else {
                                        qVar2.setAlpha(1.0f);
                                    }
                                    qVar2.setTranslationX(lerp2);
                                    qVar2.setTranslationY(lerp7);
                                }
                                if (qVar2.a) {
                                    float dp4 = (AndroidUtilities.dp(70.0f) / f12) + (qVar2.getMeasuredWidth() / f12) + qVar2.getX() + jVar3.getX();
                                    if (f15 == 0.0f || dp4 > f15) {
                                        f26 = dp4;
                                        i21++;
                                        measuredHeight = f14;
                                        z10 = z11;
                                        jVar4 = jVar3;
                                    }
                                }
                                f26 = f15;
                                i21++;
                                measuredHeight = f14;
                                z10 = z11;
                                jVar4 = jVar3;
                            }
                        }
                        f21 = lerp3;
                        if (qVar2.b == this.k0) {
                        }
                        float lerp72 = AndroidUtilities.lerp(i11 != 0 ? AndroidUtilities.lerp(f32, f11 - f14, this.C0) : i11 == 1 ? AndroidUtilities.lerp(f32, (f11 - f14) * f20, this.C0) : 0.0f, f21, a2);
                        if (this.J <= 0.0f) {
                        }
                        if (qVar2.a) {
                        }
                        f26 = f15;
                        i21++;
                        measuredHeight = f14;
                        z10 = z11;
                        jVar4 = jVar3;
                    } else {
                        f14 = measuredHeight;
                        d = 0.25d;
                        f27 = (float) Math.pow(this.J, 0.25d);
                        if (R2 < i9) {
                        }
                        qVar2.d(f27, this.W, this.j0, this.k0 == qVar2.b);
                        if (R2 > i9) {
                        }
                        z11 = z10;
                        f15 = f26;
                        f16 = f27;
                        jVar3 = jVar4;
                        f17 = 0.0f;
                        l7Var.g = 0.0f;
                        l7Var.h = 0.0f;
                        l7Var.i = 0.0f;
                        l7Var.j = 0.0f;
                        l7Var.k = false;
                        dp = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.j0 - 0.5f) / 0.5f, 1.0f, f17);
                        float f302 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                        if (R2 <= i9) {
                        }
                        float f312 = lerp + this.o0;
                        if (this.w0) {
                        }
                        float a22 = g7.n.a((this.V - 0.2f) / 0.1f, f19, 1.0f);
                        i11 = R2 - i9;
                        if (i11 == 0) {
                        }
                        f21 = lerp3;
                        if (qVar2.b == this.k0) {
                        }
                        float lerp722 = AndroidUtilities.lerp(i11 != 0 ? AndroidUtilities.lerp(f32, f11 - f14, this.C0) : i11 == 1 ? AndroidUtilities.lerp(f32, (f11 - f14) * f20, this.C0) : 0.0f, f21, a22);
                        if (this.J <= 0.0f) {
                        }
                        if (qVar2.a) {
                        }
                        f26 = f15;
                        i21++;
                        measuredHeight = f14;
                        z10 = z11;
                        jVar4 = jVar3;
                    }
                }
                f14 = measuredHeight;
                d = 0.25d;
                if (R2 < i9) {
                }
                qVar2.d(f27, this.W, this.j0, this.k0 == qVar2.b);
                if (R2 > i9) {
                }
                z11 = z10;
                f15 = f26;
                f16 = f27;
                jVar3 = jVar4;
                f17 = 0.0f;
                l7Var.g = 0.0f;
                l7Var.h = 0.0f;
                l7Var.i = 0.0f;
                l7Var.j = 0.0f;
                l7Var.k = false;
                dp = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.j0 - 0.5f) / 0.5f, 1.0f, f17);
                float f3022 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                if (R2 <= i9) {
                }
                float f3122 = lerp + this.o0;
                if (this.w0) {
                }
                float a222 = g7.n.a((this.V - 0.2f) / 0.1f, f19, 1.0f);
                i11 = R2 - i9;
                if (i11 == 0) {
                }
                f21 = lerp3;
                if (qVar2.b == this.k0) {
                }
                float lerp7222 = AndroidUtilities.lerp(i11 != 0 ? AndroidUtilities.lerp(f32, f11 - f14, this.C0) : i11 == 1 ? AndroidUtilities.lerp(f32, (f11 - f14) * f20, this.C0) : 0.0f, f21, a222);
                if (this.J <= 0.0f) {
                }
                if (qVar2.a) {
                }
                f26 = f15;
                i21++;
                measuredHeight = f14;
                z10 = z11;
                jVar4 = jVar3;
            }
            f13 = f26;
            jVar = jVar4;
        }
        if (this.F != null) {
            float lerp8 = AndroidUtilities.lerp(29, 74, gr.g.getInterpolation(this.J));
            jVar2 = jVar;
            i10 = 0;
            if (jVar.getChildCount() > 0) {
                lerp8 += jVar2.getChildAt(0).getLeft();
            }
            this.F.m(0.0f, lerp8);
        } else {
            jVar2 = jVar;
            i10 = 0;
        }
        float min = Math.min(this.J, this.W);
        float visibleItemsMeasuredWidthWithAlpha = (this.m0.A.getVisibleItemsMeasuredWidthWithAlpha() * min) - AndroidUtilities.dp(6.0f);
        boolean z13 = min != 0.0f && visibleItemsMeasuredWidthWithAlpha > 0.0f;
        if (z13) {
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, getWidth() - visibleItemsMeasuredWidthWithAlpha, getHeight());
        } else {
            canvas2 = canvas;
        }
        if (min != 0.0f) {
            k kVar = this.Q;
            float totalVisibility = kVar.getTotalVisibility() * (-AndroidUtilities.dp(10.0f));
            org.telegram.ui.Components.j6 j6Var = this.P;
            j6Var.setPivotX(0.0f);
            j6Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, kVar.getTotalVisibility()));
            j6Var.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, kVar.getTotalVisibility()));
            j6Var.setTranslationY((((f11 + AndroidUtilities.dp(14.0f)) - ((j6Var.getMeasuredHeight() - j6Var.getTextHeight()) / f12)) + AndroidUtilities.dp(f10)) - (kVar.getTotalVisibility() * AndroidUtilities.dp(6.0f)));
            int dp5 = AndroidUtilities.dp(72.0f);
            float f33 = this.J;
            float lerp9 = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), AndroidUtilities.dp(26.33f), f33) / f12;
            float w8 = aa.d.w(lerp9, 2.0f, AndroidUtilities.lerp((dp5 / f12) - lerp9, 0.0f, f33), -dp5) + AndroidUtilities.dp(12.0f) + f13;
            j6Var.setTranslationX(w8);
            org.telegram.ui.Components.i6 drawable = j6Var.getDrawable();
            drawable.H = (this.m0.A.getVisibleItemsMeasuredWidthWithAlpha() * min) + (w8 - AndroidUtilities.dp(12.0f));
            drawable.invalidateSelf();
            float translationX = j6Var.getTranslationX() + AndroidUtilities.dp(1.0f);
            ImageView imageView = this.R;
            imageView.setTranslationX(translationX);
            imageView.setTranslationY(f11 + AndroidUtilities.dp(22.333f) + totalVisibility);
            float translationX2 = (j6Var.getTranslationX() - AndroidUtilities.dpf2(3.33f)) + imageView.getMeasuredWidth();
            ImageView imageView2 = this.S;
            imageView2.setTranslationX(translationX2);
            imageView2.setTranslationY(f11 + AndroidUtilities.dp(11.333f) + totalVisibility);
            kVar.setTranslationX(j6Var.getTranslationX());
            kVar.setTranslationY(f11 + AndroidUtilities.dp(31.333f));
        }
        super.dispatchDraw(canvas);
        int i27 = this.K;
        if (i27 >= 0 && i27 != 2) {
            Collections.sort(arrayList, this.s0);
            while (i10 < arrayList.size()) {
                q qVar4 = (q) arrayList.get(i10);
                canvas2.save();
                canvas2.translate(qVar4.getX() + jVar2.getX(), qVar4.getY() + jVar2.getY());
                qVar4.draw(canvas2);
                canvas2.restore();
                i10++;
            }
        }
        if (z13) {
            float dp6 = AndroidUtilities.dp(16.0f);
            if (this.t0 == null) {
                this.t0 = new LinearGradient(0.0f, 0.0f, dp6, 0.0f, new int[]{16711680, -65536}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.u0 = new Matrix();
                Paint paint = new Paint(1);
                this.v0 = paint;
                paint.setShader(this.t0);
                this.v0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            this.u0.reset();
            this.u0.postTranslate((getWidth() - visibleItemsMeasuredWidthWithAlpha) - dp6, 0.0f);
            this.t0.setLocalMatrix(this.u0);
            canvas2.drawRect((getWidth() - visibleItemsMeasuredWidthWithAlpha) - dp6, 0.0f, AndroidUtilities.dp(1.0f) + (getWidth() - visibleItemsMeasuredWidthWithAlpha), getHeight(), this.v0);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    public final q e(long j10) {
        j jVar = this.K == 2 ? this.r : this.h;
        for (int i9 = 0; i9 < jVar.getChildCount(); i9++) {
            View childAt = jVar.getChildAt(i9);
            if (childAt instanceof q) {
                q qVar = (q) childAt;
                if (qVar.A == j10) {
                    return qVar;
                }
            }
        }
        return null;
    }

    public final int f(int i9) {
        dy dyVar = this.a0;
        return (dyVar == null || dyVar.getResourceProvider() == null) ? org.telegram.ui.ActionBar.f6.w0(null, i9, false) : dyVar.getThemedColor(i9);
    }

    public final boolean g() {
        int i9 = this.K;
        return i9 == 0 || i9 == 1;
    }

    public float getCollapsedProgress() {
        return this.J;
    }

    public float getOverScrollCoef() {
        return this.p0;
    }

    public kh.x3 getPremiumHint() {
        return this.F;
    }

    public final void h() {
        if (this.s.H()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(UserConfig.getInstance(this.f).clientUserId));
            this.a0.getOrCreateStoryViewer().G(getContext(), null, arrayList, 0, null, null, e7.a(this.r), false);
        }
    }

    public final void i(q qVar, boolean z10) {
        ValueAnimator valueAnimator;
        if ((!z10 || (valueAnimator = this.D0) == null || !valueAnimator.isRunning()) && qVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z11 = qVar.B;
            v6 v6Var = this.s;
            if (!z11 || v6Var.H()) {
                if (v6Var.I(qVar.A) || v6Var.K(qVar.A)) {
                    TL_stories.PeerStories y10 = v6Var.y(qVar.A);
                    long j10 = qVar.A;
                    m7 m7Var = this.n0;
                    if (m7Var != null) {
                        m7Var.a();
                        this.n0 = null;
                    }
                    e5.w wVar = new e5.w(this, qVar, j10, 5);
                    if (z10) {
                        wVar.run();
                        return;
                    }
                    m7 n10 = p7.n(y10, wVar);
                    qVar.e = n10;
                    this.n0 = n10;
                    if (n10 != null) {
                        v6Var.e0(qVar.A, true);
                    }
                }
            } else if (MessagesController.getInstance(this.f).storiesEnabled()) {
                j(0L);
            } else {
                n();
            }
        }
    }

    public final void j(long j10) {
        q qVar;
        p6 o6;
        dy dyVar = this.a0;
        int i9 = this.f;
        if (j10 == 0 && (o6 = MessagesController.getInstance(i9).getStoriesController().o()) != null && o6.a(i9, 1)) {
            dyVar.showDialog(new zf.j0(o6.b(), this.f, getContext(), this.a0, null));
            return;
        }
        int i10 = 0;
        while (true) {
            j jVar = this.h;
            if (i10 >= jVar.getChildCount()) {
                qVar = null;
                break;
            }
            qVar = (q) jVar.getChildAt(i10);
            if (j10 == 0) {
                if (qVar.B) {
                    break;
                } else {
                    i10++;
                }
            } else if (qVar.A == j10) {
                break;
            } else {
                i10++;
            }
        }
        if (qVar == null) {
            return;
        }
        if (j10 == 0) {
            wb.E(dyVar.getParentActivity(), i9).R(rb.c(qVar));
            return;
        }
        org.telegram.ui.ActionBar.b6 resourceProvider = dyVar != null ? dyVar.getResourceProvider() : null;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 3, resourceProvider);
        c2Var.q(500L);
        MessagesController.getInstance(i9).getStoriesController().k(j10, new gh.y1(this, c2Var, j10, qVar, 1), true, resourceProvider);
    }

    public final boolean k(long j10) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i9 >= arrayList.size()) {
                i9 = -1;
                break;
            }
            if (((o) arrayList.get(i9)).c == j10) {
                break;
            }
            i9++;
        }
        if (i9 >= 0) {
            f2.m0 m0Var = this.O;
            if (i9 < m0Var.I0()) {
                m0Var.h1(i9, 0);
                return true;
            }
            if (i9 > m0Var.M0()) {
                m0Var.i1(i9, 0, true);
                return true;
            }
        }
        return false;
    }

    public final void l(float f10, boolean z10) {
        if (this.V == f10) {
            return;
        }
        this.V = f10;
        b();
        final int i9 = 0;
        final int i10 = 1;
        boolean z11 = f10 > this.x0;
        if (z11 != this.w0) {
            this.w0 = z11;
            AnimatorSet animatorSet = this.G0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.G0.cancel();
                this.G0 = null;
            }
            if (!z10) {
                this.W = z11 ? 1.0f : 0.0f;
                b();
                AndroidUtilities.forEachViews((RecyclerView) this.h, (d5.d) new e(i10));
                return;
            }
            final int i11 = 2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W, z11 ? 1.0f : 0.0f);
            this.y0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ih.c
                public final /* synthetic */ r b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i9) {
                        case 0:
                            r rVar = this.b;
                            rVar.getClass();
                            rVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            rVar.b();
                            break;
                        case 1:
                            r rVar2 = this.b;
                            rVar2.getClass();
                            rVar2.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            r rVar3 = this.b;
                            rVar3.getClass();
                            rVar3.A0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            r rVar4 = this.b;
                            rVar4.getClass();
                            rVar4.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            rVar4.invalidate();
                            break;
                    }
                }
            });
            this.y0.setInterpolator(gr.h);
            float f11 = this.V;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, z11 ? f11 : 0.0f);
            this.B0 = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ih.c
                public final /* synthetic */ r b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            r rVar = this.b;
                            rVar.getClass();
                            rVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            rVar.b();
                            break;
                        case 1:
                            r rVar2 = this.b;
                            rVar2.getClass();
                            rVar2.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            r rVar3 = this.b;
                            rVar3.getClass();
                            rVar3.A0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            r rVar4 = this.b;
                            rVar4.getClass();
                            rVar4.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            rVar4.invalidate();
                            break;
                    }
                }
            });
            this.B0.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.G0 = animatorSet2;
            animatorSet2.addListener(new hg.b0(i10, this, z11));
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.y0);
            arrayList.add(this.B0);
            if (this.w0) {
                this.G0.setDuration(1000L);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.W, z11 ? 1.0f : 0.0f);
                this.z0 = ofFloat3;
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ih.c
                    public final /* synthetic */ r b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                r rVar = this.b;
                                rVar.getClass();
                                rVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rVar.b();
                                break;
                            case 1:
                                r rVar2 = this.b;
                                rVar2.getClass();
                                rVar2.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                r rVar3 = this.b;
                                rVar3.getClass();
                                rVar3.A0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                r rVar4 = this.b;
                                rVar4.getClass();
                                rVar4.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rVar4.invalidate();
                                break;
                        }
                    }
                });
                OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.q0);
                this.F0 = overshootInterpolator;
                this.z0.setInterpolator(overshootInterpolator);
                this.z0.setDuration(750L);
                arrayList.add(this.z0);
            } else {
                this.D0 = ValueAnimator.ofFloat(this.W, z11 ? 1.0f : 0.0f);
                this.D0.setInterpolator(new OvershootInterpolator(this.r0));
                this.D0.setDuration(350L);
                final int i12 = 3;
                this.D0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ih.c
                    public final /* synthetic */ r b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i12) {
                            case 0:
                                r rVar = this.b;
                                rVar.getClass();
                                rVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rVar.b();
                                break;
                            case 1:
                                r rVar2 = this.b;
                                rVar2.getClass();
                                rVar2.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                r rVar3 = this.b;
                                rVar3.getClass();
                                rVar3.A0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                r rVar4 = this.b;
                                rVar4.getClass();
                                rVar4.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rVar4.invalidate();
                                break;
                        }
                    }
                });
                arrayList.add(this.D0);
            }
            this.G0.playTogether(arrayList);
            this.G0.start();
        }
    }

    public final boolean m() {
        long j10 = UserConfig.getInstance(this.f).clientUserId;
        v6 v6Var = this.s;
        if (v6Var.J(j10)) {
            return true;
        }
        return v6Var.H() && v6Var.g.size() <= 3;
    }

    public final void n() {
        if (this.F == null) {
            kh.x3 x3Var = new kh.x3(getContext(), 1);
            x3Var.h(f(org.telegram.ui.ActionBar.f6.Fi));
            x3Var.q(true);
            x3Var.G = Layout.Alignment.ALIGN_CENTER;
            x3Var.m(0.0f, 29.0f);
            this.F = x3Var;
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.f6.Gi, 0, new d(this, 1));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) replaceSingleTag.getSpans(0, replaceSingleTag.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                replaceSingleTag.setSpan(new i41(AndroidUtilities.bold()), replaceSingleTag.getSpanStart(clickableSpanArr[0]), replaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
            }
            kh.x3 x3Var2 = this.F;
            x3Var2.h = kh.x3.a(replaceSingleTag, x3Var2.getTextPaint());
            this.F.t(replaceSingleTag);
            this.F.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.F, g7.e6.e(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 51));
            }
        }
        kh.x3 x3Var3 = this.F;
        if (x3Var3 != null) {
            if (x3Var3.R) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            this.F.v();
        }
    }

    public final void o() {
        z10 z10Var = p7.b;
        if (z10Var != null) {
            z10Var.d(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.lk, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.mk, false), 0, 0);
        }
        z10 z10Var2 = p7.c;
        if (z10Var2 != null) {
            z10Var2.d(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.nk, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ok, false), 0, 0);
        }
        z10[] z10VarArr = p7.a;
        z10 z10Var3 = z10VarArr[0];
        if (z10Var3 != null) {
            z10Var3.d(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.jk, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.kk, false), 0, 0);
        }
        z10 z10Var4 = z10VarArr[1];
        if (z10Var4 != null) {
            z10Var4.d(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hk, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ik, false), 0, 0);
        }
        if (p7.d != null) {
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.xj, false);
            int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false);
            p7.d.d(i0.a.d(0.25f, w02, w03), w03, 0, 0);
        }
        final int textColor = getTextColor();
        this.P.setTextColor(getTextLogoColor());
        k kVar = this.Q;
        if (kVar != null) {
            kVar.d();
        }
        this.R.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.h, new d5.d() { // from class: ih.f
            @Override // d5.d
            public final void accept(Object obj) {
                q qVar = (q) ((View) obj);
                qVar.invalidate();
                qVar.y.setTextColor(textColor);
            }
        });
        AndroidUtilities.forEachViews((RecyclerView) this.r, (d5.d) new e(2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false, false);
        NotificationCenter.getInstance(this.f).addObserver(this, NotificationCenter.storiesUpdated);
        com.google.firebase.messaging.l lVar = this.H0;
        lVar.a = true;
        AnimatorSet animatorSet = (AnimatorSet) lVar.c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.T.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.storiesUpdated);
        com.google.firebase.messaging.l lVar = this.H0;
        lVar.a = false;
        ((AnimatorSet) lVar.c).cancel();
        m7 m7Var = this.n0;
        if (m7Var != null) {
            m7Var.a();
            this.n0 = null;
        }
        this.T.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        this.P.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        this.I = AndroidUtilities.dp(70.0f);
        AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(89.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.K == 2) {
            int dp = AndroidUtilities.dp((this.y.size() * 26.33f) - (Math.max(0, r0 - 1) * 16.0f));
            j jVar = this.r;
            int x10 = (int) jVar.getX();
            int y10 = (int) jVar.getY();
            int x11 = (int) (jVar.getX() + dp);
            int y11 = (int) (jVar.getY() + jVar.getHeight());
            wc wcVar = this.E;
            wcVar.getClass();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x10, y10, x11, y11);
            wcVar.i = false;
            wcVar.c = 0;
            wcVar.a(rectF);
            if (wcVar.b(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z10, boolean z11) {
        ArrayList arrayList;
        if ((this.K == 1 || this.j0 != 0.0f) && !z11) {
            this.G = true;
            return;
        }
        ArrayList arrayList2 = this.v;
        arrayList2.clear();
        ArrayList arrayList3 = this.x;
        arrayList2.addAll(arrayList3);
        ArrayList arrayList4 = this.w;
        arrayList4.clear();
        ArrayList arrayList5 = this.y;
        arrayList4.addAll(arrayList5);
        arrayList3.clear();
        int i9 = this.b;
        int i10 = this.f;
        if (i9 != 1) {
            arrayList3.add(new o(UserConfig.getInstance(i10).getClientUserId()));
        }
        v6 v6Var = this.s;
        ArrayList arrayList6 = i9 == 1 ? v6Var.h : v6Var.g;
        for (int i11 = 0; i11 < arrayList6.size(); i11++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList6.get(i11)).peer);
            if (peerDialogId != UserConfig.getInstance(i10).getClientUserId()) {
                arrayList3.add(new o(peerDialogId));
            }
        }
        int size = arrayList3.size();
        if (!v6Var.H()) {
            size--;
        }
        int max = Math.max(1, Math.max(v6Var.C(i9 == 1), size));
        this.b0 = null;
        boolean G = v6Var.G();
        org.telegram.ui.Components.j6 j6Var = this.P;
        if (G) {
            arrayList = arrayList3;
            if (v6Var.K(UserConfig.getInstance(i10).getClientUserId())) {
                String string = LocaleController.getString(R.string.UploadingStory);
                if (string.indexOf("…") > 0) {
                    if (this.e0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
                        s9 s9Var = new s9();
                        valueOf.setSpan(s9Var, valueOf.length() - 1, valueOf.length(), 0);
                        s9Var.a = j6Var;
                        s9Var.n = true;
                        this.e0 = valueOf;
                    }
                    this.b0 = this.e0;
                } else {
                    this.b0 = string;
                }
            } else {
                this.b0 = this.o0 < ((float) AndroidUtilities.dp(50.0f)) ? null : LocaleController.getString(R.string.MyStory);
            }
        } else {
            arrayList = arrayList3;
            this.b0 = this.o0 < ((float) AndroidUtilities.dp(50.0f)) ? null : LocaleController.formatPluralString("Stories", max, new Object[0]);
        }
        if (!this.c0) {
            j6Var.c(this.b0, z10 && !LocaleController.isRTL, true);
        }
        this.a.a(!TextUtils.isEmpty(this.b0) || this.c0, z10);
        arrayList5.clear();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (((o) arrayList.get(i12)).c != UserConfig.getInstance(i10).clientUserId || m()) {
                arrayList5.add((o) arrayList.get(i12));
                if (arrayList5.size() >= 3) {
                    break;
                }
            }
        }
        j jVar = this.h;
        j jVar2 = this.r;
        if (!z10) {
            jVar.setItemAnimator(null);
            jVar2.setItemAnimator(null);
        } else if (this.K == 2) {
            jVar2.setItemAnimator(this.d);
            jVar.setItemAnimator(null);
        } else {
            jVar.setItemAnimator(this.N);
            jVar2.setItemAnimator(null);
        }
        this.A.E(arrayList2, arrayList);
        this.B.E(arrayList4, arrayList5);
        arrayList2.clear();
        invalidate();
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.m0 = kVar;
    }

    public void setClipTop(int i9) {
        if (i9 < 0) {
            i9 = 0;
        }
        if (this.H != i9) {
            this.H = i9;
            invalidate();
        }
    }

    public void setMenuItemsOffset(float f10) {
        this.o0 = f10;
    }

    public void setOverscroll(float f10) {
        this.j0 = f10 / AndroidUtilities.dp(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f10) {
        l(f10, true);
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        kh.x3 x3Var = this.F;
        if (x3Var != null) {
            x3Var.setTranslationY(f10);
        }
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
