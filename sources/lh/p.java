package lh;

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
import nh.bb;
import nh.gb;
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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.t41;
import org.telegram.ui.fy;
import org.telegram.ui.xw;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class p extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, vd.b {
    public final l A;
    public float A0;
    public final l B;
    public ValueAnimator B0;
    public final Paint C;
    public float C0;
    public final Paint D;
    public ValueAnimator D0;
    public final ad E;
    public float E0;
    public nh.t3 F;
    public OvershootInterpolator F0;
    public boolean G;
    public AnimatorSet G0;
    public int H;
    public final ab.m H0;
    public int I;
    public long I0;
    public float J;
    public Drawable J0;
    public int K;
    public final ArrayList L;
    public final ArrayList M;
    public final f2.l N;
    public final f2.j0 O;
    public final org.telegram.ui.Components.o6 P;
    public final i Q;
    public final ImageView R;
    public final ImageView S;
    public final org.telegram.ui.Components.n5 T;
    public final ArrayList U;
    public float V;
    public float W;
    public final vd.a a;
    public final fy a0;
    public final int b;
    public CharSequence b0;
    public final Drawable c;
    public boolean c0;
    public final k d;
    public int d0;
    public int e;
    public SpannableStringBuilder e0;
    public final int f;
    public ValueAnimator f0;
    public n g0;
    public final h h;
    public boolean h0;
    public boolean i0;
    public float j0;
    public int k0;
    public o l0;
    public org.telegram.ui.ActionBar.l m0;
    public bj0 n;
    public i7 n0;
    public float o0;
    public final float p0;
    public final float q0;
    public final h r;
    public final float r0;
    public final s6 s;
    public final c5.e s0;
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

    public p(Context context, fy fyVar, int i10, int i11) {
        super(context);
        this.a = new vd.a(1, this, jr.h, 380L, false);
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        xw xwVar = (xw) this;
        l lVar = new l(xwVar, false);
        this.A = lVar;
        l lVar2 = new l(xwVar, true);
        this.B = lVar2;
        Paint paint = new Paint();
        this.C = new Paint(1);
        this.D = new Paint(1);
        ad adVar = new ad(this);
        this.E = adVar;
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
        this.s0 = new c5.e(25);
        this.x0 = 0.3f;
        this.A0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.F0 = new OvershootInterpolator(0.95f);
        ab.m mVar = new ab.m(this);
        this.H0 = mVar;
        this.b = i11;
        this.f = i10;
        this.a0 = fyVar;
        this.o0 = AndroidUtilities.dp(68.0f);
        this.s = MessagesController.getInstance(i10).getStoriesController();
        h hVar = new h(xwVar, context, 0);
        this.h = hVar;
        hVar.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        hVar.setClipToPadding(false);
        hVar.setClipChildren(false);
        adVar.h = new jh.o(xwVar, 21);
        ag.o0 o0Var = new ag.o0(xwVar, 13);
        adVar.l = true;
        adVar.j = o0Var;
        hVar.j(new cg.g2(xwVar, 11));
        f2.l lVar3 = new f2.l();
        this.N = lVar3;
        lVar3.C = false;
        lVar3.n(150L);
        lVar3.m = false;
        hVar.setItemAnimator(lVar3);
        f2.j0 j0Var = new f2.j0(0, false);
        this.O = j0Var;
        hVar.setLayoutManager(j0Var);
        hVar.setOnItemClickListener(new bg.o(xwVar, 11));
        hVar.setOnItemLongClickListener(new l4.s0(xwVar, 1));
        hVar.setAdapter(lVar);
        addView(hVar, i7.f6.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(getContext(), true, true, false);
        this.P = o6Var;
        o6Var.setGravity(3);
        o6Var.setTextColor(getTextLogoColor());
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        o6Var.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        o6Var.setImportantForAccessibility(1);
        o6Var.setFocusableInTouchMode(true);
        addView(o6Var, i7.f6.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.R = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AppName));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, i7.f6.c(22.0f, 90));
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(26.0f), null);
        this.T = n5Var;
        n5Var.a = true;
        n5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.S = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(n5Var);
        addView(imageView2, i7.f6.c(40.0f, 40));
        i iVar = new i(xwVar, context, mVar);
        this.Q = iVar;
        addView(iVar, i7.f6.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        h hVar2 = new h(xwVar, getContext(), 1);
        this.r = hVar2;
        getContext();
        hVar2.setLayoutManager(new f2.j0(0, false));
        hVar2.i(new j(0));
        k kVar = new k();
        this.d = kVar;
        kVar.C = false;
        kVar.m = false;
        hVar2.setItemAnimator(kVar);
        hVar2.setAdapter(lVar2);
        hVar2.setClipChildren(false);
        addView(hVar2, i7.f6.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        return this.b == 0 ? f(org.telegram.ui.ActionBar.g6.A8) : f(org.telegram.ui.ActionBar.g6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.g6.gl);
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 1) {
            d();
        }
    }

    public final void b() {
        this.J = 1.0f - AndroidUtilities.lerp(1.0f - this.V, 1.0f, 1.0f - this.W);
        d();
        float f9 = this.J;
        int i10 = f9 == 1.0f ? 2 : f9 != 0.0f ? 1 : 0;
        if (this.K != i10) {
            this.K = i10;
            if (i10 != 1 && this.G) {
                AndroidUtilities.runOnUIThread(new d(this, 0));
            }
            int i11 = this.K;
            h hVar = this.r;
            h hVar2 = this.h;
            if (i11 == 0) {
                AndroidUtilities.forEachViews((RecyclerView) hVar2, (f5.d) new l4.x0(1));
                hVar.setVisibility(4);
                hVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.I0) {
                    this.I0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i12 = this.f;
                if (i11 == 1) {
                    ArrayList arrayList = this.M;
                    arrayList.clear();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.x;
                        if (i13 >= arrayList2.size()) {
                            break;
                        }
                        if (((m) arrayList2.get(i13)).c != UserConfig.getInstance(i12).getClientUserId() || m()) {
                            arrayList.add(Long.valueOf(((m) arrayList2.get(i13)).c));
                            if (arrayList.size() == 3) {
                                break;
                            }
                        }
                        i13++;
                    }
                    hVar.setVisibility(4);
                    hVar2.setVisibility(0);
                } else if (i11 == 2) {
                    hVar.setVisibility(0);
                    hVar2.setVisibility(4);
                    this.O.h1(0, 0);
                    bg.f fVar = MessagesController.getInstance(i12).getStoriesController().K;
                    AndroidUtilities.cancelRunOnUIThread(fVar);
                    fVar.run();
                    i7 i7Var = this.n0;
                    if (i7Var != null) {
                        i7Var.a();
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
        f2.j0 j0Var = this.O;
        int N02 = j0Var.N0() + 10;
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        s6 s6Var = this.s;
        if (N02 > size || ((N0 = j0Var.N0() + 9) < arrayList.size() && s6Var.D(0, ((m) arrayList.get(N0)).c) == 0)) {
            boolean z10 = this.b == 1;
            if (z10) {
                if (!s6Var.z) {
                    return;
                }
            } else if (!s6Var.p) {
                return;
            }
            s6Var.Q(z10);
        }
    }

    public final void d() {
        float a2 = i7.w.a(Math.min(this.J, this.W), 0.0f, 1.0f);
        float f9 = this.a.e;
        float f10 = 1.0f - f9;
        float f11 = f9 * a2;
        float f12 = f10 * a2;
        org.telegram.ui.Components.o6 o6Var = this.P;
        if (o6Var != null) {
            o6Var.setAlpha(f11);
            o6Var.setVisibility(f11 > 0.0f ? 0 : 8);
        }
        ImageView imageView = this.R;
        if (imageView != null) {
            imageView.setAlpha(f12);
            imageView.setVisibility(f12 > 0.0f ? 0 : 8);
        }
        ImageView imageView2 = this.S;
        if (imageView2 != null) {
            imageView2.setAlpha(f12);
            imageView2.setVisibility(f12 > 0.0f ? 0 : 8);
        }
        i iVar = this.Q;
        if (iVar != null) {
            iVar.setAlpha(a2);
            iVar.setVisibility(a2 > 0.0f ? 0 : 8);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesUpdated && this.h0) {
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
        int i10;
        float f9;
        float f10;
        h hVar;
        float f11;
        float f12;
        h hVar2;
        int i11;
        Canvas canvas2;
        boolean z10;
        float f13;
        double d;
        boolean z11;
        float f14;
        float f15;
        h hVar3;
        float f16;
        float dp;
        float f17;
        float lerp;
        float f18;
        float lerp2;
        int i12;
        float f19;
        float f20;
        float lerp3;
        float f21;
        float f22;
        int R;
        canvas.save();
        int i13 = this.H;
        if (i13 > 0) {
            canvas.clipRect(0, i13, getMeasuredWidth(), getMeasuredHeight());
        }
        float measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.dp(4.0f);
        float f23 = 0.0f;
        float lerp4 = AndroidUtilities.lerp(0.0f, measuredHeight, this.V);
        h hVar4 = this.h;
        hVar4.setTranslationY(lerp4);
        h hVar5 = this.r;
        hVar5.setTranslationY(lerp4);
        hVar5.setTranslationX(this.o0);
        int i14 = 0;
        while (true) {
            arrayList = this.L;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((o) arrayList.get(i14)).a = false;
            i14++;
        }
        arrayList.clear();
        int i15 = this.K;
        int i16 = -1;
        ArrayList arrayList2 = this.M;
        if ((i15 == 1 || i15 == 0) && !arrayList2.isEmpty()) {
            i10 = -1;
            f9 = 4.0f;
            for (int i17 = 0; i17 < hVar4.getChildCount(); i17++) {
                o oVar = (o) hVar4.getChildAt(i17);
                i10 = oVar.A == ((Long) arrayList2.get(0)).longValue() ? RecyclerView.R(oVar) : i10;
            }
        } else {
            f9 = 4.0f;
            i10 = this.K == 2 ? 0 : -1;
        }
        int i18 = this.K;
        if (i18 < 0 || i18 == 2) {
            f10 = lerp4;
            hVar = hVar4;
            f11 = 2.0f;
            float f24 = 0.0f;
            for (int i19 = 0; i19 < hVar5.getChildCount(); i19++) {
                float x4 = ((o) hVar5.getChildAt(i19)).getX() + hVar5.getX() + r4.getMeasuredWidth();
                if (f24 == 0.0f || x4 > f24) {
                    f24 = x4;
                }
            }
            f12 = f24;
        } else {
            if (i10 == -1) {
                f2.j0 j0Var = this.O;
                i10 = j0Var.I0();
                if (i10 == -1) {
                    i10 = j0Var.L0();
                }
                z10 = true;
            } else {
                z10 = false;
            }
            hVar4.setAlpha(1.0f - Utilities.clamp(this.J / this.x0, 1.0f, 0.0f));
            this.k0 = -1;
            if (this.j0 != 0.0f) {
                int i20 = 0;
                int i21 = -1;
                f11 = 2.0f;
                while (i20 < hVar4.getChildCount()) {
                    View childAt = hVar4.getChildAt(i20);
                    if (childAt.getX() < f23 || childAt.getX() + childAt.getMeasuredWidth() > getMeasuredWidth() || (R = RecyclerView.R(childAt)) < 0 || (i21 != i16 && R >= i21)) {
                        f22 = lerp4;
                    } else {
                        f22 = lerp4;
                        if (((m) this.x.get(R)).c != UserConfig.getInstance(this.f).clientUserId) {
                            this.l0 = (o) childAt;
                            i21 = R;
                        }
                    }
                    i20++;
                    lerp4 = f22;
                    i16 = -1;
                    f23 = 0.0f;
                }
                f10 = lerp4;
                this.k0 = i21;
            } else {
                f10 = lerp4;
                f11 = 2.0f;
            }
            float f25 = 0.0f;
            int i22 = 0;
            while (i22 < hVar4.getChildCount()) {
                o oVar2 = (o) hVar4.getChildAt(i22);
                oVar2.setClipInParent(false);
                h7 h7Var = oVar2.K;
                int R2 = RecyclerView.R(oVar2);
                float f26 = this.J;
                if (R2 >= i10 && R2 < arrayList2.size() + i10) {
                    int i23 = R2 - i10;
                    if (i23 == i10 + 2) {
                        f26 = this.J;
                    } else if (i23 == i10 + 1) {
                        f13 = measuredHeight;
                        f26 = (float) Math.pow(this.J, 0.5d);
                        d = 0.25d;
                        if (R2 < i10) {
                            f26 = (float) Math.pow(this.J, d);
                        }
                        oVar2.d(f26, this.W, this.j0, this.k0 == oVar2.b);
                        if (R2 > i10 || R2 >= arrayList2.size() + i10) {
                            z11 = z10;
                            f14 = f25;
                            f15 = f26;
                            hVar3 = hVar4;
                            f16 = 0.0f;
                            h7Var.g = 0.0f;
                            h7Var.h = 0.0f;
                            h7Var.i = 0.0f;
                            h7Var.j = 0.0f;
                            h7Var.k = false;
                        } else {
                            o oVar3 = (o) hVar4.getChildAt(i22 - 1);
                            if (oVar3 != null) {
                                h7 h7Var2 = oVar3.K;
                                float dp2 = AndroidUtilities.dp(48.0f);
                                float dp3 = AndroidUtilities.dp(26.33f);
                                z11 = z10;
                                float lerp5 = (AndroidUtilities.lerp(dp2, dp3, oVar3.F) + AndroidUtilities.dp(8.0f)) / f11;
                                float lerp6 = (AndroidUtilities.lerp(dp2, dp3, oVar2.F) + AndroidUtilities.dp(8.0f)) / f11;
                                float x10 = oVar3.getX() + h7Var2.F.centerX();
                                float y8 = oVar3.getY() + h7Var2.F.centerY();
                                float x11 = (oVar2.getX() + h7Var.F.centerX()) - x10;
                                float y10 = (oVar2.getY() + h7Var.F.centerY()) - y8;
                                f14 = f25;
                                if (((float) Math.sqrt((y10 * y10) + (x11 * x11))) < lerp5 + lerp6) {
                                    float degrees = (float) Math.toDegrees(Math.acos(r1 / r3) * 2.0d);
                                    f15 = f26;
                                    hVar3 = hVar4;
                                    float degrees2 = (float) Math.toDegrees(Math.atan2(y10, x11));
                                    float f27 = degrees / f11;
                                    h7Var2.g = degrees2 - f27;
                                    h7Var2.h = degrees2 + f27;
                                    float degrees3 = (float) Math.toDegrees(Math.atan2(-y10, -x11));
                                    float f28 = -Math.abs(degrees3 - f27);
                                    float abs = Math.abs(degrees3 + f27);
                                    h7Var.i = f28;
                                    h7Var.j = abs;
                                    f16 = 0.0f;
                                } else {
                                    f15 = f26;
                                    hVar3 = hVar4;
                                    f16 = 0.0f;
                                    h7Var2.g = 0.0f;
                                    h7Var2.h = 0.0f;
                                    h7Var.i = 0.0f;
                                    h7Var.j = 0.0f;
                                }
                                h7Var2.k = false;
                                h7Var.k = false;
                            } else {
                                z11 = z10;
                                f14 = f25;
                                f15 = f26;
                                hVar3 = hVar4;
                                f16 = 0.0f;
                            }
                        }
                        dp = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.j0 - 0.5f) / 0.5f, 1.0f, f16);
                        float f29 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                        if (R2 <= i10) {
                            f17 = 0.0f;
                            lerp = 0.0f;
                        } else if (R2 == i10 + 1) {
                            lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), 0.0f, this.J) + ((AndroidUtilities.dp(16.0f) * f15) - AndroidUtilities.dpf2(0.5f));
                            f17 = 0.0f;
                        } else {
                            f17 = 0.0f;
                            lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), 0.0f, this.J) + (((AndroidUtilities.dp(16.0f) * f15) + AndroidUtilities.dp(16.0f)) - AndroidUtilities.dpf2(0.5f));
                        }
                        float f30 = lerp + this.o0;
                        if (this.w0) {
                            f18 = 0.0f;
                            lerp2 = AndroidUtilities.lerp(0.0f, f30 - oVar2.getLeft(), this.F0.getInterpolation(this.A0));
                        } else {
                            if (this.j0 > f17) {
                                int i24 = oVar2.b;
                                int i25 = this.k0;
                                if (i24 < i25) {
                                    f21 = -dp;
                                } else if (i24 > i25) {
                                    f21 = dp;
                                }
                                lerp2 = AndroidUtilities.lerp(f30 - oVar2.getLeft(), f21, 1.0f - this.E0);
                                f18 = 0.0f;
                            }
                            f21 = 0.0f;
                            lerp2 = AndroidUtilities.lerp(f30 - oVar2.getLeft(), f21, 1.0f - this.E0);
                            f18 = 0.0f;
                        }
                        float a2 = i7.w.a((this.V - 0.2f) / 0.1f, f18, 1.0f);
                        i12 = R2 - i10;
                        if (i12 == 0) {
                            f19 = 0.65f;
                            lerp3 = AndroidUtilities.lerp(f18, f10 - f13, jr.h.getInterpolation(this.J));
                        } else {
                            f19 = 0.65f;
                            if (i12 == 1) {
                                lerp3 = AndroidUtilities.lerp(f18, (f10 - f13) * 0.65f, jr.h.getInterpolation(this.J));
                            } else {
                                f20 = 0.0f;
                                float f31 = (oVar2.b == this.k0 || this.j0 <= f18) ? 0.0f : (-dp) / f11;
                                float lerp7 = AndroidUtilities.lerp(i12 != 0 ? AndroidUtilities.lerp(f31, f10 - f13, this.C0) : i12 == 1 ? AndroidUtilities.lerp(f31, (f10 - f13) * f19, this.C0) : 0.0f, f20, a2);
                                if (this.J <= 0.0f) {
                                    boolean z12 = R2 >= i10 && R2 <= i10 + 2;
                                    if (!z11) {
                                        oVar2.setCrossfadeTo(-1L);
                                    } else if (i12 < 0 || i12 >= arrayList2.size()) {
                                        oVar2.setCrossfadeTo(-1L);
                                    } else {
                                        oVar2.setCrossfadeTo(((Long) arrayList2.get(i12)).longValue());
                                    }
                                    oVar2.a = z12;
                                    oVar2.d = R2 == i10;
                                    oVar2.c = R2 >= (arrayList2.size() + i10) + (-1);
                                    oVar2.setTranslationX(lerp2);
                                    oVar2.setTranslationY(lerp7);
                                    if (z12) {
                                        arrayList.add(oVar2);
                                    }
                                } else if (hVar3.getItemAnimator() == null || !hVar3.getItemAnimator().k()) {
                                    if (this.j0 > 0.0f) {
                                        int i26 = oVar2.b;
                                        int i27 = this.k0;
                                        if (i26 < i27) {
                                            oVar2.setAlpha(f29);
                                        } else if (i26 > i27) {
                                            oVar2.setAlpha(f29);
                                        } else {
                                            oVar2.setAlpha(1.0f);
                                        }
                                    } else {
                                        oVar2.setAlpha(1.0f);
                                    }
                                    oVar2.setTranslationX(lerp2);
                                    oVar2.setTranslationY(lerp7);
                                }
                                if (oVar2.a) {
                                    float dp4 = (AndroidUtilities.dp(70.0f) / f11) + (oVar2.getMeasuredWidth() / f11) + oVar2.getX() + hVar3.getX();
                                    if (f14 == 0.0f || dp4 > f14) {
                                        f25 = dp4;
                                        i22++;
                                        measuredHeight = f13;
                                        z10 = z11;
                                        hVar4 = hVar3;
                                    }
                                }
                                f25 = f14;
                                i22++;
                                measuredHeight = f13;
                                z10 = z11;
                                hVar4 = hVar3;
                            }
                        }
                        f20 = lerp3;
                        if (oVar2.b == this.k0) {
                        }
                        float lerp72 = AndroidUtilities.lerp(i12 != 0 ? AndroidUtilities.lerp(f31, f10 - f13, this.C0) : i12 == 1 ? AndroidUtilities.lerp(f31, (f10 - f13) * f19, this.C0) : 0.0f, f20, a2);
                        if (this.J <= 0.0f) {
                        }
                        if (oVar2.a) {
                        }
                        f25 = f14;
                        i22++;
                        measuredHeight = f13;
                        z10 = z11;
                        hVar4 = hVar3;
                    } else {
                        f13 = measuredHeight;
                        d = 0.25d;
                        f26 = (float) Math.pow(this.J, 0.25d);
                        if (R2 < i10) {
                        }
                        oVar2.d(f26, this.W, this.j0, this.k0 == oVar2.b);
                        if (R2 > i10) {
                        }
                        z11 = z10;
                        f14 = f25;
                        f15 = f26;
                        hVar3 = hVar4;
                        f16 = 0.0f;
                        h7Var.g = 0.0f;
                        h7Var.h = 0.0f;
                        h7Var.i = 0.0f;
                        h7Var.j = 0.0f;
                        h7Var.k = false;
                        dp = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.j0 - 0.5f) / 0.5f, 1.0f, f16);
                        float f292 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                        if (R2 <= i10) {
                        }
                        float f302 = lerp + this.o0;
                        if (this.w0) {
                        }
                        float a22 = i7.w.a((this.V - 0.2f) / 0.1f, f18, 1.0f);
                        i12 = R2 - i10;
                        if (i12 == 0) {
                        }
                        f20 = lerp3;
                        if (oVar2.b == this.k0) {
                        }
                        float lerp722 = AndroidUtilities.lerp(i12 != 0 ? AndroidUtilities.lerp(f31, f10 - f13, this.C0) : i12 == 1 ? AndroidUtilities.lerp(f31, (f10 - f13) * f19, this.C0) : 0.0f, f20, a22);
                        if (this.J <= 0.0f) {
                        }
                        if (oVar2.a) {
                        }
                        f25 = f14;
                        i22++;
                        measuredHeight = f13;
                        z10 = z11;
                        hVar4 = hVar3;
                    }
                }
                f13 = measuredHeight;
                d = 0.25d;
                if (R2 < i10) {
                }
                oVar2.d(f26, this.W, this.j0, this.k0 == oVar2.b);
                if (R2 > i10) {
                }
                z11 = z10;
                f14 = f25;
                f15 = f26;
                hVar3 = hVar4;
                f16 = 0.0f;
                h7Var.g = 0.0f;
                h7Var.h = 0.0f;
                h7Var.i = 0.0f;
                h7Var.j = 0.0f;
                h7Var.k = false;
                dp = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.j0 - 0.5f) / 0.5f, 1.0f, f16);
                float f2922 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                if (R2 <= i10) {
                }
                float f3022 = lerp + this.o0;
                if (this.w0) {
                }
                float a222 = i7.w.a((this.V - 0.2f) / 0.1f, f18, 1.0f);
                i12 = R2 - i10;
                if (i12 == 0) {
                }
                f20 = lerp3;
                if (oVar2.b == this.k0) {
                }
                float lerp7222 = AndroidUtilities.lerp(i12 != 0 ? AndroidUtilities.lerp(f31, f10 - f13, this.C0) : i12 == 1 ? AndroidUtilities.lerp(f31, (f10 - f13) * f19, this.C0) : 0.0f, f20, a222);
                if (this.J <= 0.0f) {
                }
                if (oVar2.a) {
                }
                f25 = f14;
                i22++;
                measuredHeight = f13;
                z10 = z11;
                hVar4 = hVar3;
            }
            f12 = f25;
            hVar = hVar4;
        }
        if (this.F != null) {
            float lerp8 = AndroidUtilities.lerp(29, 74, jr.g.getInterpolation(this.J));
            hVar2 = hVar;
            i11 = 0;
            if (hVar.getChildCount() > 0) {
                lerp8 += hVar2.getChildAt(0).getLeft();
            }
            this.F.m(0.0f, lerp8);
        } else {
            hVar2 = hVar;
            i11 = 0;
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
            i iVar = this.Q;
            float totalVisibility = iVar.getTotalVisibility() * (-AndroidUtilities.dp(10.0f));
            org.telegram.ui.Components.o6 o6Var = this.P;
            o6Var.setPivotX(0.0f);
            o6Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, iVar.getTotalVisibility()));
            o6Var.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, iVar.getTotalVisibility()));
            o6Var.setTranslationY((((f10 + AndroidUtilities.dp(14.0f)) - ((o6Var.getMeasuredHeight() - o6Var.getTextHeight()) / f11)) + AndroidUtilities.dp(f9)) - (iVar.getTotalVisibility() * AndroidUtilities.dp(6.0f)));
            int dp5 = AndroidUtilities.dp(72.0f);
            float f32 = this.J;
            float lerp9 = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), AndroidUtilities.dp(26.33f), f32) / f11;
            float d10 = com.google.android.recaptcha.internal.a.d(lerp9, 2.0f, AndroidUtilities.lerp((dp5 / f11) - lerp9, 0.0f, f32), -dp5) + AndroidUtilities.dp(12.0f) + f12;
            o6Var.setTranslationX(d10);
            org.telegram.ui.Components.n6 drawable = o6Var.getDrawable();
            drawable.H = (this.m0.A.getVisibleItemsMeasuredWidthWithAlpha() * min) + (d10 - AndroidUtilities.dp(12.0f));
            drawable.invalidateSelf();
            float translationX = o6Var.getTranslationX() + AndroidUtilities.dp(1.0f);
            ImageView imageView = this.R;
            imageView.setTranslationX(translationX);
            imageView.setTranslationY(f10 + AndroidUtilities.dp(22.333f) + totalVisibility);
            float translationX2 = (o6Var.getTranslationX() - AndroidUtilities.dpf2(3.33f)) + imageView.getMeasuredWidth();
            ImageView imageView2 = this.S;
            imageView2.setTranslationX(translationX2);
            imageView2.setTranslationY(f10 + AndroidUtilities.dp(11.333f) + totalVisibility);
            iVar.setTranslationX(o6Var.getTranslationX());
            iVar.setTranslationY(f10 + AndroidUtilities.dp(31.333f));
        }
        super.dispatchDraw(canvas);
        int i28 = this.K;
        if (i28 >= 0 && i28 != 2) {
            Collections.sort(arrayList, this.s0);
            while (i11 < arrayList.size()) {
                o oVar4 = (o) arrayList.get(i11);
                canvas2.save();
                canvas2.translate(oVar4.getX() + hVar2.getX(), oVar4.getY() + hVar2.getY());
                oVar4.draw(canvas2);
                canvas2.restore();
                i11++;
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

    public final o e(long j10) {
        h hVar = this.K == 2 ? this.r : this.h;
        for (int i10 = 0; i10 < hVar.getChildCount(); i10++) {
            View childAt = hVar.getChildAt(i10);
            if (childAt instanceof o) {
                o oVar = (o) childAt;
                if (oVar.A == j10) {
                    return oVar;
                }
            }
        }
        return null;
    }

    public final int f(int i10) {
        fy fyVar = this.a0;
        return (fyVar == null || fyVar.getResourceProvider() == null) ? org.telegram.ui.ActionBar.g6.w0(null, i10, false) : fyVar.getThemedColor(i10);
    }

    public final boolean g() {
        int i10 = this.K;
        return i10 == 0 || i10 == 1;
    }

    public float getCollapsedProgress() {
        return this.J;
    }

    public float getOverScrollCoef() {
        return this.p0;
    }

    public nh.t3 getPremiumHint() {
        return this.F;
    }

    public final void h() {
        if (this.s.H()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(UserConfig.getInstance(this.f).clientUserId));
            this.a0.getOrCreateStoryViewer().F(getContext(), null, arrayList, 0, null, null, b7.a(this.r), false);
        }
    }

    public final void i(o oVar, boolean z10) {
        ValueAnimator valueAnimator;
        if ((!z10 || (valueAnimator = this.D0) == null || !valueAnimator.isRunning()) && oVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z11 = oVar.B;
            s6 s6Var = this.s;
            if (!z11 || s6Var.H()) {
                if (s6Var.I(oVar.A) || s6Var.K(oVar.A)) {
                    TL_stories.PeerStories y8 = s6Var.y(oVar.A);
                    long j10 = oVar.A;
                    i7 i7Var = this.n0;
                    if (i7Var != null) {
                        i7Var.a();
                        this.n0 = null;
                    }
                    g5.v vVar = new g5.v(this, oVar, j10, 5);
                    if (z10) {
                        vVar.run();
                        return;
                    }
                    i7 n10 = l7.n(y8, vVar);
                    oVar.e = n10;
                    this.n0 = n10;
                    if (n10 != null) {
                        s6Var.e0(oVar.A, true);
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
        o oVar;
        m6 o10;
        fy fyVar = this.a0;
        int i10 = this.f;
        if (j10 == 0 && (o10 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o10.a(i10, 1)) {
            fyVar.showDialog(new cg.v0(o10.b(), this.f, getContext(), this.a0, null));
            return;
        }
        int i11 = 0;
        while (true) {
            h hVar = this.h;
            if (i11 >= hVar.getChildCount()) {
                oVar = null;
                break;
            }
            oVar = (o) hVar.getChildAt(i11);
            if (j10 == 0) {
                if (oVar.B) {
                    break;
                } else {
                    i11++;
                }
            } else if (oVar.A == j10) {
                break;
            } else {
                i11++;
            }
        }
        if (oVar == null) {
            return;
        }
        if (j10 == 0) {
            gb.E(fyVar.getParentActivity(), i10).R(bb.c(oVar));
            return;
        }
        org.telegram.ui.ActionBar.c6 resourceProvider = fyVar != null ? fyVar.getResourceProvider() : null;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 3, resourceProvider);
        c2Var.q(500L);
        MessagesController.getInstance(i10).getStoriesController().k(j10, new jh.w1(this, c2Var, j10, oVar, 1), true, resourceProvider);
    }

    public final boolean k(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            if (((m) arrayList.get(i10)).c == j10) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            f2.j0 j0Var = this.O;
            if (i10 < j0Var.I0()) {
                j0Var.h1(i10, 0);
                return true;
            }
            if (i10 > j0Var.M0()) {
                j0Var.i1(i10, 0, true);
                return true;
            }
        }
        return false;
    }

    public final void l(float f9, boolean z10) {
        if (this.V == f9) {
            return;
        }
        this.V = f9;
        b();
        final int i10 = 0;
        final int i11 = 1;
        boolean z11 = f9 > this.x0;
        if (z11 != this.w0) {
            this.w0 = z11;
            AnimatorSet animatorSet = this.G0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.G0.cancel();
                this.G0 = null;
            }
            final int i12 = 2;
            if (!z10) {
                this.W = z11 ? 1.0f : 0.0f;
                b();
                AndroidUtilities.forEachViews((RecyclerView) this.h, (f5.d) new l4.x0(i12));
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W, z11 ? 1.0f : 0.0f);
            this.y0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: lh.c
                public final /* synthetic */ p b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            p pVar = this.b;
                            pVar.getClass();
                            pVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pVar.b();
                            break;
                        case 1:
                            p pVar2 = this.b;
                            pVar2.getClass();
                            pVar2.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            p pVar3 = this.b;
                            pVar3.getClass();
                            pVar3.A0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            p pVar4 = this.b;
                            pVar4.getClass();
                            pVar4.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pVar4.invalidate();
                            break;
                    }
                }
            });
            this.y0.setInterpolator(jr.h);
            float f10 = this.V;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, z11 ? f10 : 0.0f);
            this.B0 = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: lh.c
                public final /* synthetic */ p b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i11) {
                        case 0:
                            p pVar = this.b;
                            pVar.getClass();
                            pVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pVar.b();
                            break;
                        case 1:
                            p pVar2 = this.b;
                            pVar2.getClass();
                            pVar2.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            p pVar3 = this.b;
                            pVar3.getClass();
                            pVar3.A0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            p pVar4 = this.b;
                            pVar4.getClass();
                            pVar4.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pVar4.invalidate();
                            break;
                    }
                }
            });
            this.B0.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.G0 = animatorSet2;
            animatorSet2.addListener(new bg.z2(4, this, z11));
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.y0);
            arrayList.add(this.B0);
            if (this.w0) {
                this.G0.setDuration(1000L);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.W, z11 ? 1.0f : 0.0f);
                this.z0 = ofFloat3;
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: lh.c
                    public final /* synthetic */ p b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i12) {
                            case 0:
                                p pVar = this.b;
                                pVar.getClass();
                                pVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                pVar.b();
                                break;
                            case 1:
                                p pVar2 = this.b;
                                pVar2.getClass();
                                pVar2.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                p pVar3 = this.b;
                                pVar3.getClass();
                                pVar3.A0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                p pVar4 = this.b;
                                pVar4.getClass();
                                pVar4.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                pVar4.invalidate();
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
                final int i13 = 3;
                this.D0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: lh.c
                    public final /* synthetic */ p b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i13) {
                            case 0:
                                p pVar = this.b;
                                pVar.getClass();
                                pVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                pVar.b();
                                break;
                            case 1:
                                p pVar2 = this.b;
                                pVar2.getClass();
                                pVar2.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                p pVar3 = this.b;
                                pVar3.getClass();
                                pVar3.A0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                p pVar4 = this.b;
                                pVar4.getClass();
                                pVar4.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                pVar4.invalidate();
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
        s6 s6Var = this.s;
        if (s6Var.J(j10)) {
            return true;
        }
        return s6Var.H() && s6Var.g.size() <= 3;
    }

    public final void n() {
        if (this.F == null) {
            nh.t3 t3Var = new nh.t3(getContext(), 1);
            t3Var.h(f(org.telegram.ui.ActionBar.g6.Fi));
            t3Var.q(true);
            t3Var.G = Layout.Alignment.ALIGN_CENTER;
            t3Var.m(0.0f, 29.0f);
            this.F = t3Var;
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.g6.Gi, 0, new d(this, 1));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) replaceSingleTag.getSpans(0, replaceSingleTag.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                replaceSingleTag.setSpan(new t41(AndroidUtilities.bold()), replaceSingleTag.getSpanStart(clickableSpanArr[0]), replaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
            }
            nh.t3 t3Var2 = this.F;
            t3Var2.h = nh.t3.a(replaceSingleTag, t3Var2.getTextPaint());
            this.F.t(replaceSingleTag);
            this.F.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.F, i7.f6.e(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 51));
            }
        }
        nh.t3 t3Var3 = this.F;
        if (t3Var3 != null) {
            if (t3Var3.R) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            this.F.v();
        }
    }

    public final void o() {
        k20 k20Var = l7.b;
        if (k20Var != null) {
            k20Var.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.lk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.mk, false), 0, 0);
        }
        k20 k20Var2 = l7.c;
        if (k20Var2 != null) {
            k20Var2.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.nk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ok, false), 0, 0);
        }
        k20[] k20VarArr = l7.a;
        k20 k20Var3 = k20VarArr[0];
        if (k20Var3 != null) {
            k20Var3.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.jk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.kk, false), 0, 0);
        }
        k20 k20Var4 = k20VarArr[1];
        if (k20Var4 != null) {
            k20Var4.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ik, false), 0, 0);
        }
        if (l7.d != null) {
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.xj, false);
            int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false);
            l7.d.d(i0.a.d(0.25f, w02, w03), w03, 0, 0);
        }
        final int textColor = getTextColor();
        this.P.setTextColor(getTextLogoColor());
        i iVar = this.Q;
        if (iVar != null) {
            iVar.d();
        }
        this.R.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.h, new f5.d() { // from class: lh.e
            @Override // f5.d
            public final void accept(Object obj) {
                o oVar = (o) ((View) obj);
                oVar.invalidate();
                oVar.y.setTextColor(textColor);
            }
        });
        AndroidUtilities.forEachViews((RecyclerView) this.r, (f5.d) new l4.x0(3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false, false);
        NotificationCenter.getInstance(this.f).addObserver(this, NotificationCenter.storiesUpdated);
        ab.m mVar = this.H0;
        mVar.a = true;
        AnimatorSet animatorSet = (AnimatorSet) mVar.c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.T.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.storiesUpdated);
        ab.m mVar = this.H0;
        mVar.a = false;
        ((AnimatorSet) mVar.c).cancel();
        i7 i7Var = this.n0;
        if (i7Var != null) {
            i7Var.a();
            this.n0 = null;
        }
        this.T.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.P.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        this.I = AndroidUtilities.dp(70.0f);
        AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(89.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.K == 2) {
            int dp = AndroidUtilities.dp((this.y.size() * 26.33f) - (Math.max(0, r0 - 1) * 16.0f));
            h hVar = this.r;
            int x4 = (int) hVar.getX();
            int y8 = (int) hVar.getY();
            int x10 = (int) (hVar.getX() + dp);
            int y10 = (int) (hVar.getY() + hVar.getHeight());
            ad adVar = this.E;
            adVar.getClass();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x4, y8, x10, y10);
            adVar.i = false;
            adVar.c = 0;
            adVar.a(rectF);
            if (adVar.b(motionEvent)) {
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
        int i10 = this.b;
        int i11 = this.f;
        if (i10 != 1) {
            arrayList3.add(new m(UserConfig.getInstance(i11).getClientUserId()));
        }
        s6 s6Var = this.s;
        ArrayList arrayList6 = i10 == 1 ? s6Var.h : s6Var.g;
        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList6.get(i12)).peer);
            if (peerDialogId != UserConfig.getInstance(i11).getClientUserId()) {
                arrayList3.add(new m(peerDialogId));
            }
        }
        int size = arrayList3.size();
        if (!s6Var.H()) {
            size--;
        }
        int max = Math.max(1, Math.max(s6Var.C(i10 == 1), size));
        this.b0 = null;
        boolean G = s6Var.G();
        org.telegram.ui.Components.o6 o6Var = this.P;
        if (G) {
            arrayList = arrayList3;
            if (s6Var.K(UserConfig.getInstance(i11).getClientUserId())) {
                String string = LocaleController.getString(R.string.UploadingStory);
                if (string.indexOf("…") > 0) {
                    if (this.e0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
                        o9 o9Var = new o9();
                        valueOf.setSpan(o9Var, valueOf.length() - 1, valueOf.length(), 0);
                        o9Var.a = o6Var;
                        o9Var.n = true;
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
            o6Var.c(this.b0, z10 && !LocaleController.isRTL, true);
        }
        this.a.a(!TextUtils.isEmpty(this.b0) || this.c0, z10);
        arrayList5.clear();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (((m) arrayList.get(i13)).c != UserConfig.getInstance(i11).clientUserId || m()) {
                arrayList5.add((m) arrayList.get(i13));
                if (arrayList5.size() >= 3) {
                    break;
                }
            }
        }
        h hVar = this.h;
        h hVar2 = this.r;
        if (!z10) {
            hVar.setItemAnimator(null);
            hVar2.setItemAnimator(null);
        } else if (this.K == 2) {
            hVar2.setItemAnimator(this.d);
            hVar.setItemAnimator(null);
        } else {
            hVar.setItemAnimator(this.N);
            hVar2.setItemAnimator(null);
        }
        this.A.E(arrayList2, arrayList);
        this.B.E(arrayList4, arrayList5);
        arrayList2.clear();
        invalidate();
    }

    public void setActionBar(org.telegram.ui.ActionBar.l lVar) {
        this.m0 = lVar;
    }

    public void setClipTop(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (this.H != i10) {
            this.H = i10;
            invalidate();
        }
    }

    public void setMenuItemsOffset(float f9) {
        this.o0 = f9;
    }

    public void setOverscroll(float f9) {
        this.j0 = f9 / AndroidUtilities.dp(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f9) {
        l(f9, true);
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        nh.t3 t3Var = this.F;
        if (t3Var != null) {
            t3Var.setTranslationY(f9);
        }
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }
}
