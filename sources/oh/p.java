package oh;

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
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Components.xc;
import org.telegram.ui.hx;
import org.telegram.ui.py;
import qh.ca;
import qh.x9;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public abstract class p extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, xd.b {
    public ValueAnimator A0;
    public final l B;
    public float B0;
    public final l C;
    public ValueAnimator C0;
    public final Paint D;
    public float D0;
    public final Paint E;
    public ValueAnimator E0;
    public final xc F;
    public float F0;
    public qh.f3 G;
    public OvershootInterpolator G0;
    public boolean H;
    public AnimatorSet H0;
    public int I;
    public final cb.m I0;
    public int J;
    public long J0;
    public float K;
    public Drawable K0;
    public int L;
    public final ArrayList M;
    public final ArrayList N;
    public final f2.l O;
    public final f2.j0 P;
    public final org.telegram.ui.Components.k6 Q;
    public final i R;
    public final ImageView S;
    public final ImageView T;
    public final org.telegram.ui.Components.j5 U;
    public final ArrayList V;
    public float W;
    public final xd.a a;
    public float a0;
    public final int b;
    public final py b0;
    public final Drawable c;
    public CharSequence c0;
    public final k d;
    public boolean d0;
    public int e;
    public int e0;
    public final int f;
    public SpannableStringBuilder f0;
    public ValueAnimator g0;
    public final h h;
    public n h0;
    public boolean i0;
    public boolean j0;
    public float k0;
    public int l0;
    public o m0;
    public mj0 n;
    public org.telegram.ui.ActionBar.k n0;
    public j7 o0;
    public float p0;
    public final float q0;
    public final h r;
    public final float r0;
    public final t6 s;
    public final float s0;
    public final e5.f t0;
    public LinearGradient u0;
    public final ArrayList v;
    public Matrix v0;
    public final ArrayList w;
    public Paint w0;
    public final ArrayList x;
    public boolean x0;
    public final ArrayList y;
    public final float y0;
    public ValueAnimator z0;

    public p(Context context, py pyVar, int i10, int i11) {
        super(context);
        this.a = new xd.a(1, this, pr.h, 380L, false);
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        hx hxVar = (hx) this;
        l lVar = new l(hxVar, false);
        this.B = lVar;
        l lVar2 = new l(hxVar, true);
        this.C = lVar2;
        Paint paint = new Paint();
        this.D = new Paint(1);
        this.E = new Paint(1);
        xc xcVar = new xc(this);
        this.F = xcVar;
        this.K = -1.0f;
        this.L = -1;
        this.M = new ArrayList();
        this.N = new ArrayList();
        this.V = new ArrayList();
        this.W = -1.0f;
        this.i0 = true;
        this.q0 = 1.0f;
        this.r0 = 0.95f;
        this.s0 = 0.9f;
        this.t0 = new e5.f(26);
        this.y0 = 0.3f;
        this.B0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.G0 = new OvershootInterpolator(0.95f);
        cb.m mVar = new cb.m(this);
        this.I0 = mVar;
        this.b = i11;
        this.f = i10;
        this.b0 = pyVar;
        this.p0 = AndroidUtilities.dp(68.0f);
        this.s = MessagesController.getInstance(i10).getStoriesController();
        h hVar = new h(hxVar, context, 0);
        this.h = hVar;
        hVar.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        hVar.setClipToPadding(false);
        hVar.setClipChildren(false);
        xcVar.h = new lh.c3(hxVar, 24);
        ag.f fVar = new ag.f(hxVar, 15);
        xcVar.l = true;
        xcVar.j = fVar;
        hVar.j(new fg.e2(hxVar, 11));
        f2.l lVar3 = new f2.l();
        this.O = lVar3;
        lVar3.C = false;
        lVar3.n(150L);
        lVar3.m = false;
        hVar.setItemAnimator(lVar3);
        f2.j0 j0Var = new f2.j0(0, false);
        this.P = j0Var;
        hVar.setLayoutManager(j0Var);
        hVar.setOnItemClickListener(new ag.h(hxVar, 12));
        hVar.setOnItemLongClickListener(new mh.m5(hxVar, 6));
        hVar.setAdapter(lVar);
        addView(hVar, k7.c6.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(getContext(), true, true, false);
        this.Q = k6Var;
        k6Var.setGravity(3);
        k6Var.setTextColor(getTextLogoColor());
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        k6Var.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        k6Var.setImportantForAccessibility(1);
        k6Var.setFocusableInTouchMode(true);
        addView(k6Var, k7.c6.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.S = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AppName));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, k7.c6.c(22.0f, 90));
        org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(AndroidUtilities.dp(26.0f), null);
        this.U = j5Var;
        j5Var.a = true;
        j5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.T = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(j5Var);
        addView(imageView2, k7.c6.c(40.0f, 40));
        i iVar = new i(hxVar, context, mVar);
        this.R = iVar;
        addView(iVar, k7.c6.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        h hVar2 = new h(hxVar, getContext(), 1);
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
        addView(hVar2, k7.c6.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        return this.b == 0 ? f(org.telegram.ui.ActionBar.k6.A8) : f(org.telegram.ui.ActionBar.k6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.k6.gl);
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 1) {
            d();
        }
    }

    public final void b() {
        this.K = 1.0f - AndroidUtilities.lerp(1.0f - this.W, 1.0f, 1.0f - this.a0);
        d();
        float f10 = this.K;
        int i10 = f10 == 1.0f ? 2 : f10 != 0.0f ? 1 : 0;
        if (this.L != i10) {
            this.L = i10;
            if (i10 != 1 && this.H) {
                AndroidUtilities.runOnUIThread(new d(this, 0));
            }
            int i11 = this.L;
            h hVar = this.r;
            h hVar2 = this.h;
            if (i11 == 0) {
                AndroidUtilities.forEachViews((RecyclerView) hVar2, (h5.d) new ag.d(3));
                hVar.setVisibility(4);
                hVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.J0) {
                    this.J0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i12 = this.f;
                if (i11 == 1) {
                    ArrayList arrayList = this.N;
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
                    this.P.h1(0, 0);
                    af.b bVar = MessagesController.getInstance(i12).getStoriesController().K;
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    bVar.run();
                    j7 j7Var = this.o0;
                    if (j7Var != null) {
                        j7Var.a();
                        this.o0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int N0;
        f2.j0 j0Var = this.P;
        int N02 = j0Var.N0() + 10;
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        t6 t6Var = this.s;
        if (N02 > size || ((N0 = j0Var.N0() + 9) < arrayList.size() && t6Var.D(0, ((m) arrayList.get(N0)).c) == 0)) {
            boolean z4 = this.b == 1;
            if (z4) {
                if (!t6Var.z) {
                    return;
                }
            } else if (!t6Var.p) {
                return;
            }
            t6Var.Q(z4);
        }
    }

    public final void d() {
        float a2 = k7.o.a(Math.min(this.K, this.a0), 0.0f, 1.0f);
        float f10 = this.a.e;
        float f11 = 1.0f - f10;
        float f12 = f10 * a2;
        float f13 = f11 * a2;
        org.telegram.ui.Components.k6 k6Var = this.Q;
        if (k6Var != null) {
            k6Var.setAlpha(f12);
            k6Var.setVisibility(f12 > 0.0f ? 0 : 8);
        }
        ImageView imageView = this.S;
        if (imageView != null) {
            imageView.setAlpha(f13);
            imageView.setVisibility(f13 > 0.0f ? 0 : 8);
        }
        ImageView imageView2 = this.T;
        if (imageView2 != null) {
            imageView2.setAlpha(f13);
            imageView2.setVisibility(f13 > 0.0f ? 0 : 8);
        }
        i iVar = this.R;
        if (iVar != null) {
            iVar.setAlpha(a2);
            iVar.setVisibility(a2 > 0.0f ? 0 : 8);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesUpdated && this.i0) {
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
        float f10;
        float f11;
        h hVar;
        float f12;
        float f13;
        h hVar2;
        int i11;
        Canvas canvas2;
        boolean z4;
        float f14;
        double d;
        boolean z10;
        float f15;
        float f16;
        h hVar3;
        float f17;
        float dp;
        float f18;
        float lerp;
        float f19;
        float lerp2;
        int i12;
        float f20;
        float f21;
        float lerp3;
        float f22;
        float f23;
        int R;
        canvas.save();
        int i13 = this.I;
        if (i13 > 0) {
            canvas.clipRect(0, i13, getMeasuredWidth(), getMeasuredHeight());
        }
        float measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(4.0f);
        float f24 = 0.0f;
        float lerp4 = AndroidUtilities.lerp(0.0f, measuredHeight, this.W);
        h hVar4 = this.h;
        hVar4.setTranslationY(lerp4);
        h hVar5 = this.r;
        hVar5.setTranslationY(lerp4);
        hVar5.setTranslationX(this.p0);
        int i14 = 0;
        while (true) {
            arrayList = this.M;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((o) arrayList.get(i14)).a = false;
            i14++;
        }
        arrayList.clear();
        int i15 = this.L;
        int i16 = -1;
        ArrayList arrayList2 = this.N;
        if ((i15 == 1 || i15 == 0) && !arrayList2.isEmpty()) {
            i10 = -1;
            f10 = 4.0f;
            for (int i17 = 0; i17 < hVar4.getChildCount(); i17++) {
                o oVar = (o) hVar4.getChildAt(i17);
                i10 = oVar.B == ((Long) arrayList2.get(0)).longValue() ? RecyclerView.R(oVar) : i10;
            }
        } else {
            f10 = 4.0f;
            i10 = this.L == 2 ? 0 : -1;
        }
        int i18 = this.L;
        if (i18 < 0 || i18 == 2) {
            f11 = lerp4;
            hVar = hVar4;
            f12 = 2.0f;
            float f25 = 0.0f;
            for (int i19 = 0; i19 < hVar5.getChildCount(); i19++) {
                float x10 = ((o) hVar5.getChildAt(i19)).getX() + hVar5.getX() + r4.getMeasuredWidth();
                if (f25 == 0.0f || x10 > f25) {
                    f25 = x10;
                }
            }
            f13 = f25;
        } else {
            if (i10 == -1) {
                f2.j0 j0Var = this.P;
                i10 = j0Var.I0();
                if (i10 == -1) {
                    i10 = j0Var.L0();
                }
                z4 = true;
            } else {
                z4 = false;
            }
            hVar4.setAlpha(1.0f - Utilities.clamp(this.K / this.y0, 1.0f, 0.0f));
            this.l0 = -1;
            if (this.k0 != 0.0f) {
                int i20 = 0;
                int i21 = -1;
                f12 = 2.0f;
                while (i20 < hVar4.getChildCount()) {
                    View childAt = hVar4.getChildAt(i20);
                    if (childAt.getX() < f24 || childAt.getX() + childAt.getMeasuredWidth() > getMeasuredWidth() || (R = RecyclerView.R(childAt)) < 0 || (i21 != i16 && R >= i21)) {
                        f23 = lerp4;
                    } else {
                        f23 = lerp4;
                        if (((m) this.x.get(R)).c != UserConfig.getInstance(this.f).clientUserId) {
                            this.m0 = (o) childAt;
                            i21 = R;
                        }
                    }
                    i20++;
                    lerp4 = f23;
                    i16 = -1;
                    f24 = 0.0f;
                }
                f11 = lerp4;
                this.l0 = i21;
            } else {
                f11 = lerp4;
                f12 = 2.0f;
            }
            float f26 = 0.0f;
            int i22 = 0;
            while (i22 < hVar4.getChildCount()) {
                o oVar2 = (o) hVar4.getChildAt(i22);
                oVar2.setClipInParent(false);
                i7 i7Var = oVar2.L;
                int R2 = RecyclerView.R(oVar2);
                float f27 = this.K;
                if (R2 >= i10 && R2 < arrayList2.size() + i10) {
                    int i23 = R2 - i10;
                    if (i23 == i10 + 2) {
                        f27 = this.K;
                    } else if (i23 == i10 + 1) {
                        f14 = measuredHeight;
                        f27 = (float) Math.pow(this.K, 0.5d);
                        d = 0.25d;
                        if (R2 < i10) {
                            f27 = (float) Math.pow(this.K, d);
                        }
                        oVar2.d(f27, this.a0, this.k0, this.l0 == oVar2.b);
                        if (R2 > i10 || R2 >= arrayList2.size() + i10) {
                            z10 = z4;
                            f15 = f26;
                            f16 = f27;
                            hVar3 = hVar4;
                            f17 = 0.0f;
                            i7Var.g = 0.0f;
                            i7Var.h = 0.0f;
                            i7Var.i = 0.0f;
                            i7Var.j = 0.0f;
                            i7Var.k = false;
                        } else {
                            o oVar3 = (o) hVar4.getChildAt(i22 - 1);
                            if (oVar3 != null) {
                                i7 i7Var2 = oVar3.L;
                                float dp2 = AndroidUtilities.dp(48.0f);
                                float dp3 = AndroidUtilities.dp(26.33f);
                                z10 = z4;
                                float lerp5 = (AndroidUtilities.lerp(dp2, dp3, oVar3.G) + AndroidUtilities.dp(8.0f)) / f12;
                                float lerp6 = (AndroidUtilities.lerp(dp2, dp3, oVar2.G) + AndroidUtilities.dp(8.0f)) / f12;
                                float x11 = oVar3.getX() + i7Var2.F.centerX();
                                float y10 = oVar3.getY() + i7Var2.F.centerY();
                                float x12 = (oVar2.getX() + i7Var.F.centerX()) - x11;
                                float y11 = (oVar2.getY() + i7Var.F.centerY()) - y10;
                                f15 = f26;
                                if (((float) Math.sqrt((y11 * y11) + (x12 * x12))) < lerp5 + lerp6) {
                                    float degrees = (float) Math.toDegrees(Math.acos(r1 / r3) * 2.0d);
                                    f16 = f27;
                                    hVar3 = hVar4;
                                    float degrees2 = (float) Math.toDegrees(Math.atan2(y11, x12));
                                    float f28 = degrees / f12;
                                    i7Var2.g = degrees2 - f28;
                                    i7Var2.h = degrees2 + f28;
                                    float degrees3 = (float) Math.toDegrees(Math.atan2(-y11, -x12));
                                    float f29 = -Math.abs(degrees3 - f28);
                                    float abs = Math.abs(degrees3 + f28);
                                    i7Var.i = f29;
                                    i7Var.j = abs;
                                    f17 = 0.0f;
                                } else {
                                    f16 = f27;
                                    hVar3 = hVar4;
                                    f17 = 0.0f;
                                    i7Var2.g = 0.0f;
                                    i7Var2.h = 0.0f;
                                    i7Var.i = 0.0f;
                                    i7Var.j = 0.0f;
                                }
                                i7Var2.k = false;
                                i7Var.k = false;
                            } else {
                                z10 = z4;
                                f15 = f26;
                                f16 = f27;
                                hVar3 = hVar4;
                                f17 = 0.0f;
                            }
                        }
                        dp = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.k0 - 0.5f) / 0.5f, 1.0f, f17);
                        float f30 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                        if (R2 <= i10) {
                            f18 = 0.0f;
                            lerp = 0.0f;
                        } else if (R2 == i10 + 1) {
                            lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), 0.0f, this.K) + ((AndroidUtilities.dp(16.0f) * f16) - AndroidUtilities.dpf2(0.5f));
                            f18 = 0.0f;
                        } else {
                            f18 = 0.0f;
                            lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), 0.0f, this.K) + (((AndroidUtilities.dp(16.0f) * f16) + AndroidUtilities.dp(16.0f)) - AndroidUtilities.dpf2(0.5f));
                        }
                        float f31 = lerp + this.p0;
                        if (this.x0) {
                            f19 = 0.0f;
                            lerp2 = AndroidUtilities.lerp(0.0f, f31 - oVar2.getLeft(), this.G0.getInterpolation(this.B0));
                        } else {
                            if (this.k0 > f18) {
                                int i24 = oVar2.b;
                                int i25 = this.l0;
                                if (i24 < i25) {
                                    f22 = -dp;
                                } else if (i24 > i25) {
                                    f22 = dp;
                                }
                                lerp2 = AndroidUtilities.lerp(f31 - oVar2.getLeft(), f22, 1.0f - this.F0);
                                f19 = 0.0f;
                            }
                            f22 = 0.0f;
                            lerp2 = AndroidUtilities.lerp(f31 - oVar2.getLeft(), f22, 1.0f - this.F0);
                            f19 = 0.0f;
                        }
                        float a2 = k7.o.a((this.W - 0.2f) / 0.1f, f19, 1.0f);
                        i12 = R2 - i10;
                        if (i12 == 0) {
                            f20 = 0.65f;
                            lerp3 = AndroidUtilities.lerp(f19, f11 - f14, pr.h.getInterpolation(this.K));
                        } else {
                            f20 = 0.65f;
                            if (i12 == 1) {
                                lerp3 = AndroidUtilities.lerp(f19, (f11 - f14) * 0.65f, pr.h.getInterpolation(this.K));
                            } else {
                                f21 = 0.0f;
                                float f32 = (oVar2.b == this.l0 || this.k0 <= f19) ? 0.0f : (-dp) / f12;
                                float lerp7 = AndroidUtilities.lerp(i12 != 0 ? AndroidUtilities.lerp(f32, f11 - f14, this.D0) : i12 == 1 ? AndroidUtilities.lerp(f32, (f11 - f14) * f20, this.D0) : 0.0f, f21, a2);
                                if (this.K <= 0.0f) {
                                    boolean z11 = R2 >= i10 && R2 <= i10 + 2;
                                    if (!z10) {
                                        oVar2.setCrossfadeTo(-1L);
                                    } else if (i12 < 0 || i12 >= arrayList2.size()) {
                                        oVar2.setCrossfadeTo(-1L);
                                    } else {
                                        oVar2.setCrossfadeTo(((Long) arrayList2.get(i12)).longValue());
                                    }
                                    oVar2.a = z11;
                                    oVar2.d = R2 == i10;
                                    oVar2.c = R2 >= (arrayList2.size() + i10) + (-1);
                                    oVar2.setTranslationX(lerp2);
                                    oVar2.setTranslationY(lerp7);
                                    if (z11) {
                                        arrayList.add(oVar2);
                                    }
                                } else if (hVar3.getItemAnimator() == null || !hVar3.getItemAnimator().k()) {
                                    if (this.k0 > 0.0f) {
                                        int i26 = oVar2.b;
                                        int i27 = this.l0;
                                        if (i26 < i27) {
                                            oVar2.setAlpha(f30);
                                        } else if (i26 > i27) {
                                            oVar2.setAlpha(f30);
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
                                    float dp4 = (AndroidUtilities.dp(70.0f) / f12) + (oVar2.getMeasuredWidth() / f12) + oVar2.getX() + hVar3.getX();
                                    if (f15 == 0.0f || dp4 > f15) {
                                        f26 = dp4;
                                        i22++;
                                        measuredHeight = f14;
                                        z4 = z10;
                                        hVar4 = hVar3;
                                    }
                                }
                                f26 = f15;
                                i22++;
                                measuredHeight = f14;
                                z4 = z10;
                                hVar4 = hVar3;
                            }
                        }
                        f21 = lerp3;
                        if (oVar2.b == this.l0) {
                        }
                        float lerp72 = AndroidUtilities.lerp(i12 != 0 ? AndroidUtilities.lerp(f32, f11 - f14, this.D0) : i12 == 1 ? AndroidUtilities.lerp(f32, (f11 - f14) * f20, this.D0) : 0.0f, f21, a2);
                        if (this.K <= 0.0f) {
                        }
                        if (oVar2.a) {
                        }
                        f26 = f15;
                        i22++;
                        measuredHeight = f14;
                        z4 = z10;
                        hVar4 = hVar3;
                    } else {
                        f14 = measuredHeight;
                        d = 0.25d;
                        f27 = (float) Math.pow(this.K, 0.25d);
                        if (R2 < i10) {
                        }
                        oVar2.d(f27, this.a0, this.k0, this.l0 == oVar2.b);
                        if (R2 > i10) {
                        }
                        z10 = z4;
                        f15 = f26;
                        f16 = f27;
                        hVar3 = hVar4;
                        f17 = 0.0f;
                        i7Var.g = 0.0f;
                        i7Var.h = 0.0f;
                        i7Var.i = 0.0f;
                        i7Var.j = 0.0f;
                        i7Var.k = false;
                        dp = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.k0 - 0.5f) / 0.5f, 1.0f, f17);
                        float f302 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                        if (R2 <= i10) {
                        }
                        float f312 = lerp + this.p0;
                        if (this.x0) {
                        }
                        float a22 = k7.o.a((this.W - 0.2f) / 0.1f, f19, 1.0f);
                        i12 = R2 - i10;
                        if (i12 == 0) {
                        }
                        f21 = lerp3;
                        if (oVar2.b == this.l0) {
                        }
                        float lerp722 = AndroidUtilities.lerp(i12 != 0 ? AndroidUtilities.lerp(f32, f11 - f14, this.D0) : i12 == 1 ? AndroidUtilities.lerp(f32, (f11 - f14) * f20, this.D0) : 0.0f, f21, a22);
                        if (this.K <= 0.0f) {
                        }
                        if (oVar2.a) {
                        }
                        f26 = f15;
                        i22++;
                        measuredHeight = f14;
                        z4 = z10;
                        hVar4 = hVar3;
                    }
                }
                f14 = measuredHeight;
                d = 0.25d;
                if (R2 < i10) {
                }
                oVar2.d(f27, this.a0, this.k0, this.l0 == oVar2.b);
                if (R2 > i10) {
                }
                z10 = z4;
                f15 = f26;
                f16 = f27;
                hVar3 = hVar4;
                f17 = 0.0f;
                i7Var.g = 0.0f;
                i7Var.h = 0.0f;
                i7Var.i = 0.0f;
                i7Var.j = 0.0f;
                i7Var.k = false;
                dp = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.k0 - 0.5f) / 0.5f, 1.0f, f17);
                float f3022 = (float) (((1.0f - r2) * 0.5f) + 0.5d);
                if (R2 <= i10) {
                }
                float f3122 = lerp + this.p0;
                if (this.x0) {
                }
                float a222 = k7.o.a((this.W - 0.2f) / 0.1f, f19, 1.0f);
                i12 = R2 - i10;
                if (i12 == 0) {
                }
                f21 = lerp3;
                if (oVar2.b == this.l0) {
                }
                float lerp7222 = AndroidUtilities.lerp(i12 != 0 ? AndroidUtilities.lerp(f32, f11 - f14, this.D0) : i12 == 1 ? AndroidUtilities.lerp(f32, (f11 - f14) * f20, this.D0) : 0.0f, f21, a222);
                if (this.K <= 0.0f) {
                }
                if (oVar2.a) {
                }
                f26 = f15;
                i22++;
                measuredHeight = f14;
                z4 = z10;
                hVar4 = hVar3;
            }
            f13 = f26;
            hVar = hVar4;
        }
        if (this.G != null) {
            float lerp8 = AndroidUtilities.lerp(29, 74, pr.g.getInterpolation(this.K));
            hVar2 = hVar;
            i11 = 0;
            if (hVar.getChildCount() > 0) {
                lerp8 += hVar2.getChildAt(0).getLeft();
            }
            this.G.m(0.0f, lerp8);
        } else {
            hVar2 = hVar;
            i11 = 0;
        }
        float min = Math.min(this.K, this.a0);
        float visibleItemsMeasuredWidthWithAlpha = (this.n0.B.getVisibleItemsMeasuredWidthWithAlpha() * min) - AndroidUtilities.dp(6.0f);
        boolean z12 = min != 0.0f && visibleItemsMeasuredWidthWithAlpha > 0.0f;
        if (z12) {
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, getWidth() - visibleItemsMeasuredWidthWithAlpha, getHeight());
        } else {
            canvas2 = canvas;
        }
        if (min != 0.0f) {
            i iVar = this.R;
            float totalVisibility = iVar.getTotalVisibility() * (-AndroidUtilities.dp(10.0f));
            org.telegram.ui.Components.k6 k6Var = this.Q;
            k6Var.setPivotX(0.0f);
            k6Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, iVar.getTotalVisibility()));
            k6Var.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, iVar.getTotalVisibility()));
            k6Var.setTranslationY((((f11 + AndroidUtilities.dp(14.0f)) - ((k6Var.getMeasuredHeight() - k6Var.getTextHeight()) / f12)) + AndroidUtilities.dp(f10)) - (iVar.getTotalVisibility() * AndroidUtilities.dp(6.0f)));
            int dp5 = AndroidUtilities.dp(72.0f);
            float f33 = this.K;
            float lerp9 = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), AndroidUtilities.dp(26.33f), f33) / f12;
            float A = e2.c.A(lerp9, 2.0f, AndroidUtilities.lerp((dp5 / f12) - lerp9, 0.0f, f33), -dp5) + AndroidUtilities.dp(12.0f) + f13;
            k6Var.setTranslationX(A);
            org.telegram.ui.Components.j6 drawable = k6Var.getDrawable();
            drawable.H = (this.n0.B.getVisibleItemsMeasuredWidthWithAlpha() * min) + (A - AndroidUtilities.dp(12.0f));
            drawable.invalidateSelf();
            float translationX = k6Var.getTranslationX() + AndroidUtilities.dp(1.0f);
            ImageView imageView = this.S;
            imageView.setTranslationX(translationX);
            imageView.setTranslationY(f11 + AndroidUtilities.dp(22.333f) + totalVisibility);
            float translationX2 = (k6Var.getTranslationX() - AndroidUtilities.dpf2(3.33f)) + imageView.getMeasuredWidth();
            ImageView imageView2 = this.T;
            imageView2.setTranslationX(translationX2);
            imageView2.setTranslationY(f11 + AndroidUtilities.dp(11.333f) + totalVisibility);
            iVar.setTranslationX(k6Var.getTranslationX());
            iVar.setTranslationY(f11 + AndroidUtilities.dp(31.333f));
        }
        super.dispatchDraw(canvas);
        int i28 = this.L;
        if (i28 >= 0 && i28 != 2) {
            Collections.sort(arrayList, this.t0);
            while (i11 < arrayList.size()) {
                o oVar4 = (o) arrayList.get(i11);
                canvas2.save();
                canvas2.translate(oVar4.getX() + hVar2.getX(), oVar4.getY() + hVar2.getY());
                oVar4.draw(canvas2);
                canvas2.restore();
                i11++;
            }
        }
        if (z12) {
            float dp6 = AndroidUtilities.dp(16.0f);
            if (this.u0 == null) {
                this.u0 = new LinearGradient(0.0f, 0.0f, dp6, 0.0f, new int[]{16711680, -65536}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.v0 = new Matrix();
                Paint paint = new Paint(1);
                this.w0 = paint;
                paint.setShader(this.u0);
                this.w0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            this.v0.reset();
            this.v0.postTranslate((getWidth() - visibleItemsMeasuredWidthWithAlpha) - dp6, 0.0f);
            this.u0.setLocalMatrix(this.v0);
            canvas2.drawRect((getWidth() - visibleItemsMeasuredWidthWithAlpha) - dp6, 0.0f, AndroidUtilities.dp(1.0f) + (getWidth() - visibleItemsMeasuredWidthWithAlpha), getHeight(), this.w0);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    public final o e(long j10) {
        h hVar = this.L == 2 ? this.r : this.h;
        for (int i10 = 0; i10 < hVar.getChildCount(); i10++) {
            View childAt = hVar.getChildAt(i10);
            if (childAt instanceof o) {
                o oVar = (o) childAt;
                if (oVar.B == j10) {
                    return oVar;
                }
            }
        }
        return null;
    }

    public final int f(int i10) {
        py pyVar = this.b0;
        return (pyVar == null || pyVar.getResourceProvider() == null) ? org.telegram.ui.ActionBar.k6.w0(null, i10, false) : pyVar.getThemedColor(i10);
    }

    public final boolean g() {
        int i10 = this.L;
        return i10 == 0 || i10 == 1;
    }

    public float getCollapsedProgress() {
        return this.K;
    }

    public float getOverScrollCoef() {
        return this.q0;
    }

    public qh.f3 getPremiumHint() {
        return this.G;
    }

    public final void h() {
        if (this.s.H()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(UserConfig.getInstance(this.f).clientUserId));
            this.b0.getOrCreateStoryViewer().F(getContext(), null, arrayList, 0, null, null, c7.a(this.r), false);
        }
    }

    public final void i(o oVar, boolean z4) {
        ValueAnimator valueAnimator;
        if ((!z4 || (valueAnimator = this.E0) == null || !valueAnimator.isRunning()) && oVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z10 = oVar.C;
            t6 t6Var = this.s;
            if (!z10 || t6Var.H()) {
                if (t6Var.I(oVar.B) || t6Var.K(oVar.B)) {
                    TL_stories.PeerStories y10 = t6Var.y(oVar.B);
                    long j10 = oVar.B;
                    j7 j7Var = this.o0;
                    if (j7Var != null) {
                        j7Var.a();
                        this.o0 = null;
                    }
                    i5.v vVar = new i5.v(this, oVar, j10, 5);
                    if (z4) {
                        vVar.run();
                        return;
                    }
                    j7 n10 = m7.n(y10, vVar);
                    oVar.e = n10;
                    this.o0 = n10;
                    if (n10 != null) {
                        t6Var.e0(oVar.B, true);
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
        n6 o10;
        py pyVar = this.b0;
        int i10 = this.f;
        if (j10 == 0 && (o10 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o10.a(i10, 1)) {
            pyVar.showDialog(new fg.v0(o10.b(), this.f, getContext(), this.b0, null));
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
                if (oVar.C) {
                    break;
                } else {
                    i11++;
                }
            } else if (oVar.B == j10) {
                break;
            } else {
                i11++;
            }
        }
        if (oVar == null) {
            return;
        }
        if (j10 == 0) {
            ca.E(pyVar.getParentActivity(), i10).R(x9.c(oVar));
            return;
        }
        org.telegram.ui.ActionBar.g6 resourceProvider = pyVar != null ? pyVar.getResourceProvider() : null;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getContext(), 3, resourceProvider);
        d2Var.q(500L);
        MessagesController.getInstance(i10).getStoriesController().k(j10, new mh.v1(this, d2Var, j10, oVar, 1), true, resourceProvider);
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
            f2.j0 j0Var = this.P;
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

    public final void l(float f10, boolean z4) {
        if (this.W == f10) {
            return;
        }
        this.W = f10;
        b();
        final int i10 = 0;
        final int i11 = 1;
        boolean z10 = f10 > this.y0;
        if (z10 != this.x0) {
            this.x0 = z10;
            AnimatorSet animatorSet = this.H0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.H0.cancel();
                this.H0 = null;
            }
            int i12 = 4;
            if (!z4) {
                this.a0 = z10 ? 1.0f : 0.0f;
                b();
                AndroidUtilities.forEachViews((RecyclerView) this.h, (h5.d) new ag.d(i12));
                return;
            }
            final int i13 = 2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, z10 ? 1.0f : 0.0f);
            this.z0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: oh.c
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
                            pVar.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pVar.b();
                            break;
                        case 1:
                            p pVar2 = this.b;
                            pVar2.getClass();
                            pVar2.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            p pVar3 = this.b;
                            pVar3.getClass();
                            pVar3.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            p pVar4 = this.b;
                            pVar4.getClass();
                            pVar4.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pVar4.invalidate();
                            break;
                    }
                }
            });
            this.z0.setInterpolator(pr.h);
            float f11 = this.W;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, z10 ? f11 : 0.0f);
            this.C0 = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: oh.c
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
                            pVar.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pVar.b();
                            break;
                        case 1:
                            p pVar2 = this.b;
                            pVar2.getClass();
                            pVar2.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            p pVar3 = this.b;
                            pVar3.getClass();
                            pVar3.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            p pVar4 = this.b;
                            pVar4.getClass();
                            pVar4.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pVar4.invalidate();
                            break;
                    }
                }
            });
            this.C0.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.H0 = animatorSet2;
            animatorSet2.addListener(new eg.u2(i12, this, z10));
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.z0);
            arrayList.add(this.C0);
            if (this.x0) {
                this.H0.setDuration(1000L);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.a0, z10 ? 1.0f : 0.0f);
                this.A0 = ofFloat3;
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: oh.c
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
                                pVar.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                pVar.b();
                                break;
                            case 1:
                                p pVar2 = this.b;
                                pVar2.getClass();
                                pVar2.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                p pVar3 = this.b;
                                pVar3.getClass();
                                pVar3.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                p pVar4 = this.b;
                                pVar4.getClass();
                                pVar4.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                pVar4.invalidate();
                                break;
                        }
                    }
                });
                OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.r0);
                this.G0 = overshootInterpolator;
                this.A0.setInterpolator(overshootInterpolator);
                this.A0.setDuration(750L);
                arrayList.add(this.A0);
            } else {
                this.E0 = ValueAnimator.ofFloat(this.a0, z10 ? 1.0f : 0.0f);
                this.E0.setInterpolator(new OvershootInterpolator(this.s0));
                this.E0.setDuration(350L);
                final int i14 = 3;
                this.E0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: oh.c
                    public final /* synthetic */ p b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i14) {
                            case 0:
                                p pVar = this.b;
                                pVar.getClass();
                                pVar.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                pVar.b();
                                break;
                            case 1:
                                p pVar2 = this.b;
                                pVar2.getClass();
                                pVar2.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                p pVar3 = this.b;
                                pVar3.getClass();
                                pVar3.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                p pVar4 = this.b;
                                pVar4.getClass();
                                pVar4.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                pVar4.invalidate();
                                break;
                        }
                    }
                });
                arrayList.add(this.E0);
            }
            this.H0.playTogether(arrayList);
            this.H0.start();
        }
    }

    public final boolean m() {
        long j10 = UserConfig.getInstance(this.f).clientUserId;
        t6 t6Var = this.s;
        if (t6Var.J(j10)) {
            return true;
        }
        return t6Var.H() && t6Var.g.size() <= 3;
    }

    public final void n() {
        if (this.G == null) {
            qh.f3 f3Var = new qh.f3(getContext(), 1);
            f3Var.h(f(org.telegram.ui.ActionBar.k6.Fi));
            f3Var.q(true);
            f3Var.H = Layout.Alignment.ALIGN_CENTER;
            f3Var.m(0.0f, 29.0f);
            this.G = f3Var;
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.k6.Gi, 0, new d(this, 1));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) replaceSingleTag.getSpans(0, replaceSingleTag.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                replaceSingleTag.setSpan(new g51(AndroidUtilities.bold()), replaceSingleTag.getSpanStart(clickableSpanArr[0]), replaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
            }
            qh.f3 f3Var2 = this.G;
            f3Var2.h = qh.f3.a(replaceSingleTag, f3Var2.getTextPaint());
            this.G.t(replaceSingleTag);
            this.G.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.G, k7.c6.e(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 51));
            }
        }
        qh.f3 f3Var3 = this.G;
        if (f3Var3 != null) {
            if (f3Var3.S) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            this.G.v();
        }
    }

    public final void o() {
        q20 q20Var = m7.b;
        if (q20Var != null) {
            q20Var.d(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.lk, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.mk, false), 0, 0);
        }
        q20 q20Var2 = m7.c;
        if (q20Var2 != null) {
            q20Var2.d(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.nk, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.ok, false), 0, 0);
        }
        q20[] q20VarArr = m7.a;
        q20 q20Var3 = q20VarArr[0];
        if (q20Var3 != null) {
            q20Var3.d(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.jk, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.kk, false), 0, 0);
        }
        q20 q20Var4 = q20VarArr[1];
        if (q20Var4 != null) {
            q20Var4.d(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.hk, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.ik, false), 0, 0);
        }
        if (m7.d != null) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.xj, false);
            int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false);
            m7.d.d(i0.a.d(0.25f, w02, w03), w03, 0, 0);
        }
        final int textColor = getTextColor();
        this.Q.setTextColor(getTextLogoColor());
        i iVar = this.R;
        if (iVar != null) {
            iVar.c();
        }
        this.S.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.h, new h5.d() { // from class: oh.e
            @Override // h5.d
            public final void accept(Object obj) {
                o oVar = (o) ((View) obj);
                oVar.invalidate();
                oVar.y.setTextColor(textColor);
            }
        });
        AndroidUtilities.forEachViews((RecyclerView) this.r, (h5.d) new ag.d(5));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false, false);
        NotificationCenter.getInstance(this.f).addObserver(this, NotificationCenter.storiesUpdated);
        cb.m mVar = this.I0;
        mVar.a = true;
        AnimatorSet animatorSet = (AnimatorSet) mVar.c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.U.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.storiesUpdated);
        cb.m mVar = this.I0;
        mVar.a = false;
        ((AnimatorSet) mVar.c).cancel();
        j7 j7Var = this.o0;
        if (j7Var != null) {
            j7Var.a();
            this.o0 = null;
        }
        this.U.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.Q.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        this.J = AndroidUtilities.dp(70.0f);
        AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(89.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.L == 2) {
            int dp = AndroidUtilities.dp((this.y.size() * 26.33f) - (Math.max(0, r0 - 1) * 16.0f));
            h hVar = this.r;
            int x10 = (int) hVar.getX();
            int y10 = (int) hVar.getY();
            int x11 = (int) (hVar.getX() + dp);
            int y11 = (int) (hVar.getY() + hVar.getHeight());
            xc xcVar = this.F;
            xcVar.getClass();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x10, y10, x11, y11);
            xcVar.i = false;
            xcVar.c = 0;
            xcVar.a(rectF);
            if (xcVar.b(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z4, boolean z10) {
        ArrayList arrayList;
        if ((this.L == 1 || this.k0 != 0.0f) && !z10) {
            this.H = true;
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
        t6 t6Var = this.s;
        ArrayList arrayList6 = i10 == 1 ? t6Var.h : t6Var.g;
        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList6.get(i12)).peer);
            if (peerDialogId != UserConfig.getInstance(i11).getClientUserId()) {
                arrayList3.add(new m(peerDialogId));
            }
        }
        int size = arrayList3.size();
        if (!t6Var.H()) {
            size--;
        }
        int max = Math.max(1, Math.max(t6Var.C(i10 == 1), size));
        this.c0 = null;
        boolean G = t6Var.G();
        org.telegram.ui.Components.k6 k6Var = this.Q;
        if (G) {
            arrayList = arrayList3;
            if (t6Var.K(UserConfig.getInstance(i11).getClientUserId())) {
                String string = LocaleController.getString(R.string.UploadingStory);
                if (string.indexOf("…") > 0) {
                    if (this.f0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
                        o9 o9Var = new o9();
                        valueOf.setSpan(o9Var, valueOf.length() - 1, valueOf.length(), 0);
                        o9Var.a = k6Var;
                        o9Var.n = true;
                        this.f0 = valueOf;
                    }
                    this.c0 = this.f0;
                } else {
                    this.c0 = string;
                }
            } else {
                this.c0 = this.p0 < ((float) AndroidUtilities.dp(50.0f)) ? null : LocaleController.getString(R.string.MyStory);
            }
        } else {
            arrayList = arrayList3;
            this.c0 = this.p0 < ((float) AndroidUtilities.dp(50.0f)) ? null : LocaleController.formatPluralString("Stories", max, new Object[0]);
        }
        if (!this.d0) {
            k6Var.c(this.c0, z4 && !LocaleController.isRTL, true);
        }
        this.a.a(!TextUtils.isEmpty(this.c0) || this.d0, z4);
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
        if (!z4) {
            hVar.setItemAnimator(null);
            hVar2.setItemAnimator(null);
        } else if (this.L == 2) {
            hVar2.setItemAnimator(this.d);
            hVar.setItemAnimator(null);
        } else {
            hVar.setItemAnimator(this.O);
            hVar2.setItemAnimator(null);
        }
        this.B.E(arrayList2, arrayList);
        this.C.E(arrayList4, arrayList5);
        arrayList2.clear();
        invalidate();
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.n0 = kVar;
    }

    public void setClipTop(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (this.I != i10) {
            this.I = i10;
            invalidate();
        }
    }

    public void setMenuItemsOffset(float f10) {
        this.p0 = f10;
    }

    public void setOverscroll(float f10) {
        this.k0 = f10 / AndroidUtilities.dp(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f10) {
        l(f10, true);
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        qh.f3 f3Var = this.G;
        if (f3Var != null) {
            f3Var.setTranslationY(f10);
        }
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
