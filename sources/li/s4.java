package li;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import c8.ha;
import c8.ka;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.aj;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ic;
import org.telegram.messenger.iz;
import org.telegram.messenger.kv;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class s4 extends y implements org.telegram.ui.ActionBar.a6, h9, k0 {
    public static Paint m0;
    public final ArrayList D;
    public final ArrayList E;
    public final ArrayList F;
    public final ArrayList G;
    public final boolean H;
    public final ri.f I;
    public final sa.d J;
    public final ArrayList K;
    public final HashMap L;
    public xh.e M;
    public m3 N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final org.telegram.ui.Components.w5 U;
    public int V;
    public int W;
    public float a0;
    public boolean b0;
    public float c0;
    public float d0;
    public int e0;
    public int f0;
    public int g0;
    public VelocityTracker h0;
    public ValueAnimator i0;
    public final ArrayList j0;
    public int k0;
    public final Path l0;
    public final f6 n;
    public final Paint r;
    public final Paint s;
    public final j0 w;
    public final ImageView x;
    public final ImageView y;

    public s4(Context context, f6 f6Var) {
        super(context);
        int i7 = 1;
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        int i10 = Build.VERSION.SDK_INT;
        boolean z9 = i10 >= 31 && iz.f();
        this.H = z9;
        this.K = new ArrayList();
        this.L = new HashMap();
        this.T = -1;
        this.U = new org.telegram.ui.Components.w5(this, 0L, 320L, xq.h);
        this.j0 = new ArrayList();
        this.k0 = r6.b;
        this.l0 = new Path();
        this.n = f6Var;
        setWillNotDraw(false);
        f(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(4.0f));
        j0 j0Var = new j0(context, f6Var, new gf.g(this, 14));
        this.w = j0Var;
        addView(j0Var.a, ha.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        if (z9 && i10 >= 31) {
            ri.f fVar = new ri.f(new ri.c());
            this.I = fVar;
            fVar.l(org.telegram.messenger.g0.L(24.0f));
            this.J = new sa.d(13);
        }
        ImageView g10 = g();
        this.x = g10;
        g10.setImageResource(R.drawable.iv_media_add);
        addView(g10, ha.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        g10.setOnClickListener(new p4(this, i7));
        ImageView g11 = g();
        this.y = g11;
        g11.setVisibility(8);
        addView(g11, ha.d(32, 32.0f, 53, 12.0f, 12.0f, 66.0f, 12.0f));
        g11.setOnClickListener(new p4(this, 2));
        updateColors();
    }

    private xh.e getSpoilerEffect() {
        if (!this.O) {
            return null;
        }
        xh.e eVar = this.M;
        if (eVar != null && eVar.i) {
            this.M = null;
        }
        if (this.M == null) {
            this.M = xh.e.e(this);
        }
        return this.M;
    }

    private void settle(float f10) {
        int i7;
        int size = this.D.size();
        if (f10 >= 0.0f || this.W >= size - 1) {
            i7 = -1;
            if (f10 <= 0.0f || this.W <= 0) {
                float f11 = this.a0;
                if (f11 <= 0.5f || this.W >= size - 1) {
                    if (f11 >= -0.5f || this.W <= 0) {
                        i7 = 0;
                    }
                }
            }
            int i10 = i7 + this.W;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, i10 - r7);
            this.i0 = ofFloat;
            ofFloat.setDuration(220L);
            this.i0.setInterpolator(xq.h);
            this.i0.addUpdateListener(new fi.v3(this, 8));
            this.i0.addListener(new hi.m2(this, i10, 2));
            this.i0.start();
        }
        i7 = 1;
        int i102 = i7 + this.W;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.a0, i102 - r7);
        this.i0 = ofFloat2;
        ofFloat2.setDuration(220L);
        this.i0.setInterpolator(xq.h);
        this.i0.addUpdateListener(new fi.v3(this, 8));
        this.i0.addListener(new hi.m2(this, i102, 2));
        this.i0.start();
    }

    @Override // li.k0
    public final boolean a(int i7, int i10) {
        return this.w.f(i7, i10);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.ue));
        hashSet.add(Integer.valueOf(k6.ig));
    }

    @Override // li.k0
    public final void b() {
        this.w.i();
    }

    @Override // li.y
    public final int d() {
        return org.telegram.messenger.g0.L(16.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.j0;
        f6 f6Var = this.n;
        int i7 = this.k0;
        int i10 = r6.b;
        if (i7 != i10) {
            this.k0 = i10;
            try {
                int w02 = k6.w0(k6.d6, f6Var);
                if (getBackground() instanceof y1) {
                    ((y1) getBackground()).a(w02);
                }
                int w10 = k6.w(w02, k6.w0(k6.i6, f6Var));
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    Drawable drawable = (Drawable) arrayList.get(i11);
                    if (drawable instanceof RippleDrawable) {
                        RippleDrawable rippleDrawable = (RippleDrawable) drawable;
                        if (rippleDrawable.getNumberOfLayers() > 0 && rippleDrawable.getId(0) != 16908334 && (rippleDrawable.getDrawable(0) instanceof ShapeDrawable)) {
                            ShapeDrawable shapeDrawable = (ShapeDrawable) rippleDrawable.getDrawable(0);
                            if (shapeDrawable.getPaint().getColor() != w02) {
                                shapeDrawable.getPaint().setColor(w02);
                                rippleDrawable.setColor(ColorStateList.valueOf(w10));
                                rippleDrawable.invalidateSelf();
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        super.dispatchDraw(canvas);
        this.w.c(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.E.contains(view)) {
            a aVar = this.a;
            if ((aVar == null ? 0 : aVar.k.size()) > 0) {
                canvas.save();
                Path path = this.l0;
                path.rewind();
                path.addRoundRect(getPaddingLeft(), getPaddingTop(), Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight()) + getPaddingLeft(), getPaddingTop() + this.P, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    public final ImageView g() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (!this.H || Build.VERSION.SDK_INT < 31) {
            int i7 = k6.G6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            f6 f6Var = this.n;
            r6.t(imageView, i7, f6Var, mode);
            int i10 = k6.d6;
            org.telegram.ui.Cells.y b02 = k6.b0(k6.w0(i10, f6Var), k6.w(k6.w0(i10, f6Var), k6.w0(k6.i6, f6Var)), 20, 20);
            this.j0.add(b02);
            imageView.setBackground(new a2(b02));
        } else {
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            ri.f fVar = this.I;
            fh.g gVar = new fh.g(fVar, fVar, fVar);
            gVar.p(this.J);
            gVar.r(org.telegram.messenger.g0.L(16.0f));
            this.L.put(imageView, gVar);
        }
        ka.a(imageView);
        this.K.add(imageView);
        return imageView;
    }

    @Override // li.k0
    public g1 getCaptionEditText() {
        return this.w.a;
    }

    @Override // li.k0
    public a getRow() {
        return this.a;
    }

    public final void h(Canvas canvas, ImageView imageView) {
        fh.g gVar;
        if (imageView.getVisibility() == 0 && (gVar = (fh.g) this.L.get(imageView)) != null) {
            gVar.setBounds(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
            gVar.setAlpha((int) (imageView.getAlpha() * 255.0f));
            fh.e eVar = gVar.f0;
            if (eVar != null) {
                eVar.h = true;
            }
            gVar.draw(canvas);
        }
    }

    public final void j(Canvas canvas) {
        char c10;
        int i7;
        ArrayList arrayList;
        ic icVar;
        int i10;
        s4 s4Var = this;
        Canvas canvas2 = canvas;
        int paddingTop = s4Var.getPaddingTop();
        int paddingLeft = s4Var.getPaddingLeft();
        int i11 = 0;
        int max = Math.max(0, (s4Var.getWidth() - paddingLeft) - s4Var.getPaddingRight());
        canvas2.save();
        canvas2.translate(paddingLeft, 0.0f);
        a aVar = s4Var.a;
        if ((aVar == null ? 0 : aVar.k.size()) > 0) {
            Path path = s4Var.l0;
            path.rewind();
            path.addRoundRect(0.0f, paddingTop, max, s4Var.P + paddingTop, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            canvas2.clipRect(0, paddingTop, max, s4Var.P + paddingTop);
        }
        boolean m10 = s4Var.m();
        char c11 = 2;
        int i12 = 1;
        ArrayList arrayList2 = s4Var.D;
        boolean z9 = m10 && arrayList2.size() >= 2;
        a aVar2 = s4Var.a;
        int L = (aVar2 == null ? 0 : aVar2.k.size()) > 0 ? org.telegram.messenger.g0.L(8.0f) : 0;
        Paint paint = s4Var.r;
        if (z9 && (((i10 = s4Var.W) == 0 && s4Var.a0 < 0.0f) || (i10 == arrayList2.size() - 1 && s4Var.a0 > 0.0f))) {
            canvas2.drawRect(0.0f, paddingTop, max, s4Var.P + paddingTop, paint);
        }
        int size = arrayList2.size();
        ic icVar2 = null;
        ArrayList arrayList3 = s4Var.G;
        if (size == 1 && arrayList3.size() == 1) {
            RectF rectF = (RectF) arrayList3.get(0);
            if (rectF.left > 0.5f || rectF.right < max - 0.5f) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(0.0f, paddingTop, max, paddingTop + s4Var.P);
                v4 v4Var = (v4) arrayList2.get(0);
                ImageReceiver imageReceiver = v4Var.b;
                if (v4Var.b()) {
                    imageReceiver.A0(rectF2);
                    imageReceiver.setAlpha(v4Var.a.h1);
                    imageReceiver.h(canvas2, null);
                }
            }
        }
        int i13 = 0;
        while (i13 < arrayList2.size() && i13 < arrayList3.size()) {
            v4 v4Var2 = (v4) arrayList2.get(i13);
            RectF rectF3 = (RectF) arrayList3.get(i13);
            if (z9) {
                int i14 = i13 == 0 ? L : i11;
                int i15 = i13 == arrayList2.size() - i12 ? L : i11;
                int i16 = i13 == arrayList2.size() - i12 ? L : i11;
                c10 = c11;
                int i17 = i13 == 0 ? L : i11;
                v4Var2.a.K0(i14, i15, i16, i17);
                v4Var2.b.K0(i14, i15, i16, i17);
            } else {
                c10 = c11;
                v4Var2.a.K0(i11, i11, i11, i11);
                v4Var2.b.K0(i11, i11, i11, i11);
            }
            boolean c12 = v4Var2.c();
            ImageReceiver imageReceiver2 = v4Var2.a;
            if (!c12) {
                canvas2.drawRect(rectF3, paint);
            }
            imageReceiver2.y0(Math.round(rectF3.left), Math.round(rectF3.top), Math.round(rectF3.width()), Math.round(rectF3.height()));
            if (v4Var2.c()) {
                imageReceiver2.h(canvas2, icVar2);
            }
            RadialProgress2 radialProgress2 = v4Var2.d;
            s sVar = v4Var2.e;
            if (sVar == null || !sVar.a()) {
                i7 = 1;
            } else {
                int L2 = org.telegram.messenger.g0.L(48.0f);
                int round = Math.round(rectF3.centerX());
                int round2 = Math.round(rectF3.centerY());
                int i18 = L2 / 2;
                radialProgress2.r(round - i18, round2 - i18, round + i18, round2 + i18);
                i7 = 1;
                radialProgress2.p(true, v4Var2.e.f);
                radialProgress2.draw(canvas2);
            }
            s sVar2 = v4Var2.e;
            if (sVar2 != null && sVar2.n && v4Var2.c()) {
                xh.e spoilerEffect = s4Var.getSpoilerEffect();
                ImageReceiver imageReceiver3 = v4Var2.b;
                canvas2.save();
                canvas2.clipRect(rectF3);
                if (v4Var2.b()) {
                    imageReceiver3.A0(rectF3);
                    imageReceiver3.setAlpha(imageReceiver2.h1);
                    icVar = null;
                    imageReceiver3.h(canvas2, null);
                } else {
                    icVar = null;
                }
                if (spoilerEffect != null) {
                    canvas2.translate(rectF3.left, rectF3.top);
                    arrayList = arrayList3;
                    spoilerEffect.c(canvas2, s4Var, Math.round(rectF3.width()), Math.round(rectF3.height()), imageReceiver2.h1, false);
                } else {
                    arrayList = arrayList3;
                }
                canvas.restore();
            } else {
                arrayList = arrayList3;
                icVar = null;
            }
            i13++;
            s4Var = this;
            canvas2 = canvas;
            arrayList3 = arrayList;
            i12 = i7;
            icVar2 = icVar;
            c11 = c10;
            i11 = 0;
        }
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        this.w.e(arrayList);
    }

    public final void l(int i7) {
        if (this.N == null || this.a == null) {
            return;
        }
        List n10 = n();
        if (n10.isEmpty() || (n10.size() == 1 && ((s) n10.get(0)).a == 0)) {
            m3 m3Var = this.N;
            a aVar = this.a;
            t3 t3Var = m3Var.a;
            t3Var.i4 = aVar;
            t3Var.o3.g(0);
            return;
        }
        if (i7 < 0 || i7 >= n10.size() || !((s) n10.get(i7)).a()) {
            return;
        }
        t3.R1(this.a, (s) n10.get(i7), this.N.a);
    }

    public final boolean m() {
        a aVar = this.a;
        return aVar != null && (aVar.b instanceof TL_iv.pageBlockSlideshow);
    }

    public final List n() {
        a aVar = this.a;
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if ((pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                ArrayList arrayList = aVar.h;
                return arrayList != null ? arrayList : Collections.EMPTY_LIST;
            }
        }
        s sVar = aVar.g;
        return sVar != null ? Collections.singletonList(sVar) : Collections.EMPTY_LIST;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.D;
            if (i7 >= arrayList.size()) {
                return;
            }
            v4 v4Var = (v4) arrayList.get(i7);
            v4Var.a.P();
            v4Var.b.P();
            v4Var.a();
            i7++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        this.O = false;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        VelocityTracker velocityTracker = this.h0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.h0 = null;
        }
        this.b0 = false;
        while (true) {
            ArrayList arrayList = this.D;
            if (i7 >= arrayList.size()) {
                break;
            }
            v4 v4Var = (v4) arrayList.get(i7);
            v4Var.a.R();
            v4Var.b.R();
            v4Var.c = null;
            i7++;
        }
        xh.e eVar = this.M;
        if (eVar != null) {
            eVar.b(this);
            this.M = null;
        }
        ValueAnimator valueAnimator = this.i0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.i0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ri.f fVar;
        ImageView imageView;
        ImageView imageView2;
        i9 textSelectionHelper;
        float f10;
        float f11;
        float f12;
        float i7;
        int paddingTop = getPaddingTop();
        j(canvas);
        org.telegram.ui.Components.w5 w5Var = this.U;
        float f13 = w5Var.c;
        ArrayList arrayList = this.D;
        if (arrayList.size() >= 2 && f13 > 0.001f) {
            if (m0 == null) {
                Paint paint = new Paint(1);
                m0 = paint;
                paint.setColor(-1);
                m0.setShadowLayer(org.telegram.messenger.g0.N(3.0f), 0.0f, org.telegram.messenger.g0.N(1.0f), TLObject.FLAG_31);
            }
            int size = arrayList.size();
            float L = org.telegram.messenger.g0.L(5.0f) + ((getPaddingTop() + this.P) - org.telegram.messenger.g0.L(23.0f));
            int L2 = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.k5.D(6.0f, size - 1, org.telegram.messenger.g0.L(7.0f) * size);
            int paddingLeft = getPaddingLeft();
            int max = Math.max(0, (getWidth() - paddingLeft) - getPaddingRight());
            float f14 = this.W + this.a0;
            if (L2 < max) {
                f10 = 13.0f;
                i7 = ((max - L2) / 2.0f) + paddingLeft;
                f11 = 23.0f;
                f12 = 4.0f;
            } else {
                f10 = 13.0f;
                float L3 = org.telegram.messenger.g0.L(4.0f) + paddingLeft;
                int L4 = org.telegram.messenger.g0.L(13.0f);
                f11 = 23.0f;
                f12 = 4.0f;
                i7 = L3 - (Utilities.i(f14 - (((max - org.telegram.messenger.g0.L(8.0f)) / 2) / L4), Math.max(0, (size - (r12 * 2)) - 1), 0.0f) * L4);
            }
            canvas.save();
            canvas.clipRect(paddingLeft, (getPaddingTop() + this.P) - org.telegram.messenger.g0.L(f11), max + paddingLeft, getPaddingTop() + this.P);
            for (int i10 = 0; i10 < size; i10++) {
                float max2 = Math.max(0.0f, 1.0f - Math.abs(i10 - f14));
                m0.setAlpha((int) com.google.android.recaptcha.internal.a.B(max2, 95.0f, 160.0f, f13));
                canvas.drawCircle(org.telegram.messenger.g0.L(f12) + i7 + (org.telegram.messenger.g0.L(f10) * i10), L, (org.telegram.messenger.g0.L(1.0f) * max2) + org.telegram.messenger.g0.L(2.0f), m0);
            }
            canvas.restore();
        }
        m3 m3Var = this.N;
        if (m3Var != null && (textSelectionHelper = m3Var.a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
                canvas.drawRect(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), paddingTop + this.P, this.s);
            }
        }
        if (this.H && (fVar = this.I) != null && Build.VERSION.SDK_INT >= 31) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                if (canvas.isHardwareAccelerated() && !fVar.r) {
                    try {
                        j(fVar.i(width, height));
                    } finally {
                        fVar.j();
                    }
                }
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.K;
                    int size2 = arrayList2.size();
                    imageView = this.y;
                    imageView2 = this.x;
                    if (i11 >= size2) {
                        break;
                    }
                    ImageView imageView3 = (ImageView) arrayList2.get(i11);
                    if (imageView3 != imageView2 && imageView3 != imageView) {
                        h(canvas, imageView3);
                    }
                    i11++;
                }
                h(canvas, imageView);
                h(canvas, imageView2);
            }
        }
        if (w5Var.i) {
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i13 = i11 - i7;
        int max = Math.max(0, (i13 - paddingLeft) - paddingRight);
        int i14 = i13 - paddingRight;
        int L = c8.l1.b(this.a) > 0 ? org.telegram.messenger.g0.L(16.0f) : 0;
        this.w.g(paddingLeft - L, paddingRight - L, i13, getPaddingTop() + this.P);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int i15 = i14 - L2;
        ImageView imageView = this.x;
        imageView.layout(i15 - imageView.getMeasuredWidth(), getPaddingTop() + L2, i15, imageView.getMeasuredHeight() + getPaddingTop() + L2);
        int i16 = i15 - L2;
        int measuredWidth = i16 - imageView.getMeasuredWidth();
        ImageView imageView2 = this.y;
        imageView2.layout(measuredWidth - imageView2.getMeasuredWidth(), getPaddingTop() + L2, i16 - imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + getPaddingTop() + L2);
        List n10 = n();
        int i17 = 0;
        while (true) {
            ArrayList arrayList = this.E;
            if (i17 >= arrayList.size()) {
                return;
            }
            ImageView imageView3 = (ImageView) arrayList.get(i17);
            if (i17 < n10.size() && ((s) n10.get(i17)).a != 0) {
                ArrayList arrayList2 = this.G;
                if (i17 < arrayList2.size()) {
                    RectF rectF = (RectF) arrayList2.get(i17);
                    if (rectF.right <= 0.0f || rectF.left >= max || rectF.bottom <= getPaddingTop() || rectF.top >= getPaddingTop() + this.P) {
                        imageView3.setVisibility(8);
                    } else {
                        int i18 = ((int) rectF.left) + L2 + paddingLeft;
                        int i19 = ((int) rectF.top) + L2;
                        imageView3.layout(i18, i19, imageView3.getMeasuredWidth() + i18, imageView3.getMeasuredHeight() + i19);
                        float f10 = 1.0f;
                        if (this.H) {
                            int left = (imageView2.getVisibility() == 0 ? imageView2.getLeft() : imageView.getLeft()) - org.telegram.messenger.g0.L(4.0f);
                            if (imageView3.getMeasuredWidth() + i18 > left) {
                                f10 = org.telegram.ui.Cells.f1.v(r9 - left, imageView3.getMeasuredWidth(), 1.0f, 0.0f);
                            }
                        }
                        imageView3.setAlpha(f10);
                        imageView3.setVisibility(f10 > 0.01f ? 0 : 8);
                    }
                    i17++;
                }
            }
            imageView3.setVisibility(8);
            i17++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03ef A[LOOP:1: B:24:0x03e7->B:26:0x03ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x040b A[EDGE_INSN: B:27:0x040b->B:28:0x040b BREAK  A[LOOP:1: B:24:0x03e7->B:26:0x03ef], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x039d  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        aj[] ajVarArr;
        int round;
        int i16;
        aj[] ajVarArr2;
        int i17;
        float[] fArr;
        int i18;
        int i19;
        int i20;
        int i21;
        int L;
        int i22;
        int size;
        int i23;
        ArrayList arrayList;
        int size2 = View.MeasureSpec.getSize(i7);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int max = Math.max(0, (size2 - paddingLeft) - paddingRight);
        float f10 = m() ? 1.0f : 0.0f;
        org.telegram.ui.Components.w5 w5Var = this.U;
        float e10 = w5Var.e(false, f10);
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        int paddingTop = getPaddingTop();
        ArrayList arrayList3 = this.D;
        int size3 = arrayList3.size();
        int i24 = 1;
        if (size3 == 0) {
            int L2 = (org.telegram.messenger.g0.L(200.0f) - getPaddingTop()) - getPaddingBottom();
            this.S = L2;
            this.Q = L2;
            this.R = max;
        } else {
            if (size3 != 1) {
                float[] fArr2 = new float[size3];
                int i25 = 0;
                while (i25 < size3) {
                    v4 v4Var = (v4) arrayList3.get(i25);
                    if (v4Var.e == null) {
                        i19 = i24;
                        i18 = 0;
                    } else {
                        i18 = v4Var.d() ? v4Var.e.k : v4Var.e.j;
                        i19 = i24;
                    }
                    if (v4Var.e == null) {
                        i20 = 0;
                    } else {
                        boolean d = v4Var.d();
                        s sVar = v4Var.e;
                        i20 = d ? sVar.j : sVar.k;
                    }
                    fArr2[i25] = (i18 <= 0 || i20 <= 0) ? 1.0f : i18 / i20;
                    i25++;
                    i24 = i19;
                }
                i11 = i24;
                aj[] e11 = kv.e(fArr2);
                int i26 = 0;
                for (aj ajVar : e11) {
                    i26 = Math.max(i26, (int) ajVar.d);
                }
                int i27 = i26 + 1;
                float[] fArr3 = new float[i27];
                int length = e11.length;
                i12 = paddingLeft;
                int i28 = 0;
                while (i28 < length) {
                    int i29 = i28;
                    aj ajVar2 = e11[i29];
                    int i30 = paddingRight;
                    byte b10 = ajVar2.c;
                    int i31 = i27;
                    if (b10 == ajVar2.d) {
                        fArr3[b10] = Math.max(fArr3[b10], ajVar2.f);
                    }
                    i28 = i29 + 1;
                    paddingRight = i30;
                    i27 = i31;
                }
                i13 = paddingRight;
                int i32 = i27;
                int length2 = e11.length;
                int i33 = 0;
                while (i33 < length2) {
                    aj ajVar3 = e11[i33];
                    int i34 = ajVar3.c;
                    int i35 = length2;
                    byte b11 = ajVar3.d;
                    if (i34 != b11) {
                        int i36 = (b11 - i34) + 1;
                        i17 = i33;
                        float[] fArr4 = ajVar3.m;
                        if (fArr4 == null || fArr4.length != i36) {
                            fArr = fArr3;
                            float f11 = ajVar3.f / i36;
                            while (i34 <= ajVar3.d) {
                                fArr[i34] = Math.max(fArr[i34], f11);
                                i34++;
                            }
                            i33 = i17 + 1;
                            length2 = i35;
                            fArr3 = fArr;
                        } else {
                            int i37 = 0;
                            while (i37 < i36) {
                                int i38 = ajVar3.c + i37;
                                int i39 = i37;
                                float[] fArr5 = fArr3;
                                fArr5[i38] = Math.max(fArr3[i38], ajVar3.m[i39]);
                                i37 = i39 + 1;
                                fArr3 = fArr5;
                            }
                        }
                    } else {
                        i17 = i33;
                    }
                    fArr = fArr3;
                    i33 = i17 + 1;
                    length2 = i35;
                    fArr3 = fArr;
                }
                float[] fArr6 = fArr3;
                Point point = org.telegram.messenger.g0.q;
                float max2 = Math.max(point.x, point.y) * 0.5f;
                int[] iArr = new int[i26 + 2];
                float f12 = 0.0f;
                for (int i40 = 0; i40 <= i26; i40++) {
                    iArr[i40] = Math.round(f12 * max2);
                    f12 += fArr6[i40];
                }
                iArr[i32] = Math.round(f12 * max2);
                int L3 = org.telegram.messenger.g0.L(2.0f);
                int i41 = 0;
                while (i41 < e11.length) {
                    aj ajVar4 = e11[i41];
                    int i42 = iArr[ajVar4.c];
                    int i43 = iArr[ajVar4.d + 1] - i42;
                    int i44 = L3;
                    if (ajVar4.j > 0) {
                        round = Math.round((r2 * max) / 1000.0f);
                        i15 = i43;
                        ajVarArr = e11;
                    } else {
                        i15 = i43;
                        int i45 = 0;
                        int i46 = 0;
                        while (i45 < e11.length) {
                            if (i45 == i41) {
                                i16 = i45;
                                ajVarArr2 = e11;
                            } else {
                                aj ajVar5 = e11[i45];
                                i16 = i45;
                                byte b12 = ajVar5.c;
                                ajVarArr2 = e11;
                                byte b13 = ajVar4.c;
                                if (b12 <= b13 && ajVar5.d >= b13 && ajVar5.a < ajVar4.a) {
                                    i46 += ajVar5.e;
                                }
                            }
                            i45 = i16 + 1;
                            e11 = ajVarArr2;
                        }
                        ajVarArr = e11;
                        round = Math.round((i46 * max) / 1000.0f);
                    }
                    arrayList2.add(new RectF(round, i42 + paddingTop, Math.max(0, (ajVar4.l & 2) != 0 ? max - round : Math.round((ajVar4.e * max) / 1000.0f) - i44) + round, Math.max(0, (ajVar4.l & 8) == 0 ? i15 - i44 : i15) + r15));
                    i41++;
                    L3 = i44;
                    iArr = iArr;
                    e11 = ajVarArr;
                }
                this.Q = iArr[i32];
                this.R = max;
                float f13 = 0.0f;
                for (int i47 = 0; i47 < size3; i47++) {
                    v4 v4Var2 = (v4) arrayList3.get(i47);
                    int i48 = v4Var2.e == null ? 0 : v4Var2.d() ? v4Var2.e.k : v4Var2.e.j;
                    if (v4Var2.e == null) {
                        i14 = 0;
                    } else {
                        boolean d2 = v4Var2.d();
                        s sVar2 = v4Var2.e;
                        i14 = d2 ? sVar2.j : sVar2.k;
                    }
                    f13 = ((i48 <= 0 || i14 <= 0) ? 1.0f : i48 / i14) + f13;
                }
                int max3 = (int) (this.R / Math.max(0.5f, f13 / size3));
                Point point2 = org.telegram.messenger.g0.q;
                int max4 = (int) (Math.max(point2.x, point2.y) * 0.55f);
                if (max3 > max4) {
                    max3 = max4;
                }
                this.S = max3;
                this.P = Math.round(org.telegram.messenger.g0.W1(e10, this.Q, this.S));
                ArrayList arrayList4 = this.G;
                arrayList4.clear();
                size = arrayList3.size();
                if (size != 0) {
                    int paddingTop2 = getPaddingTop();
                    if (size == i11) {
                        arrayList4.add(new RectF((RectF) arrayList2.get(0)));
                    } else {
                        float f14 = (-this.a0) * this.R;
                        int i49 = 0;
                        while (i49 < size && i49 < arrayList2.size()) {
                            RectF rectF = (RectF) arrayList2.get(i49);
                            float f15 = ((i49 - this.W) * this.R) + f14;
                            arrayList4.add(new RectF(org.telegram.messenger.g0.T1(rectF.left, f15, e10), org.telegram.messenger.g0.T1(rectF.top, paddingTop2, e10), org.telegram.messenger.g0.T1(rectF.right, f15 + this.R, e10), org.telegram.messenger.g0.T1(rectF.bottom, this.S + paddingTop2, e10)));
                            i49++;
                            size = size;
                        }
                    }
                }
                int L4 = c8.l1.b(this.a) <= 0 ? org.telegram.messenger.g0.L(16.0f) : 0;
                setMeasuredDimension(size2, getPaddingBottom() + getPaddingTop() + this.P + this.w.h(i12 - L4, i13 - L4, size2));
                this.x.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30));
                this.y.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30));
                i23 = 0;
                while (true) {
                    arrayList = this.E;
                    if (i23 < arrayList.size()) {
                        break;
                    }
                    ((ImageView) arrayList.get(i23)).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30));
                    i23++;
                }
                if (w5Var.i) {
                    return;
                }
                requestLayout();
                return;
            }
            v4 v4Var3 = (v4) arrayList3.get(0);
            int i50 = v4Var3.e == null ? 0 : v4Var3.d() ? v4Var3.e.k : v4Var3.e.j;
            if (v4Var3.e == null) {
                i21 = 0;
            } else {
                boolean d10 = v4Var3.d();
                s sVar3 = v4Var3.e;
                i21 = d10 ? sVar3.j : sVar3.k;
            }
            if (i50 <= 0 || i21 <= 0) {
                L = (org.telegram.messenger.g0.L(200.0f) - getPaddingTop()) - getPaddingBottom();
            } else {
                L = (int) ((max / Math.max(1, i50)) * i21);
                Point point3 = org.telegram.messenger.g0.q;
                int max5 = (int) (Math.max(point3.x, point3.y) * 0.55f);
                if (L > max5) {
                    i22 = (int) ((max5 / Math.max(1, i21)) * i50);
                    L = max5;
                    arrayList2.add(new RectF((max - i22) / 2, paddingTop, r4 + i22, paddingTop + L));
                    this.Q = L;
                    this.R = i22;
                    this.S = L;
                }
            }
            i22 = max;
            arrayList2.add(new RectF((max - i22) / 2, paddingTop, r4 + i22, paddingTop + L));
            this.Q = L;
            this.R = i22;
            this.S = L;
        }
        i12 = paddingLeft;
        i13 = paddingRight;
        i11 = 1;
        this.P = Math.round(org.telegram.messenger.g0.W1(e10, this.Q, this.S));
        ArrayList arrayList42 = this.G;
        arrayList42.clear();
        size = arrayList3.size();
        if (size != 0) {
        }
        if (c8.l1.b(this.a) <= 0) {
        }
        setMeasuredDimension(size2, getPaddingBottom() + getPaddingTop() + this.P + this.w.h(i12 - L4, i13 - L4, size2));
        this.x.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30));
        this.y.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30));
        i23 = 0;
        while (true) {
            arrayList = this.E;
            if (i23 < arrayList.size()) {
            }
            ((ImageView) arrayList.get(i23)).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30));
            i23++;
        }
        if (w5Var.i) {
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        int i7 = 0;
        boolean z9 = y10 >= ((float) getPaddingTop()) && y10 < ((float) (getPaddingTop() + this.P));
        int i10 = -1;
        if (m() && !this.U.i) {
            ArrayList arrayList = this.D;
            if (arrayList.size() >= 2) {
                if (actionMasked == 0) {
                    if (!z9) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (this.e0 == 0) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                        this.e0 = viewConfiguration.getScaledTouchSlop();
                        this.f0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.g0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    this.c0 = x10;
                    this.d0 = y10;
                    this.b0 = false;
                    VelocityTracker velocityTracker2 = this.h0;
                    if (velocityTracker2 == null) {
                        this.h0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.h0.addMovement(motionEvent);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    ValueAnimator valueAnimator = this.i0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.i0 = null;
                    }
                    this.T = this.W;
                    return true;
                }
                float f10 = 0.0f;
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.h0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float f11 = x10 - this.c0;
                    float f12 = y10 - this.d0;
                    if (!this.b0 && Math.abs(f11) > this.e0 && Math.abs(f11) > Math.abs(f12)) {
                        this.b0 = true;
                        this.T = -1;
                    }
                    if (this.b0) {
                        float f13 = (-f11) / this.R;
                        int i11 = this.W;
                        if (i11 == 0 && f13 < 0.0f) {
                            f13 *= 0.3f;
                        }
                        if (i11 == arrayList.size() - 1 && f13 > 0.0f) {
                            f13 *= 0.3f;
                        }
                        this.a0 = f13;
                        requestLayout();
                        invalidate();
                        return true;
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    if (actionMasked == 1 && (velocityTracker = this.h0) != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.h0.computeCurrentVelocity(1000, this.g0);
                        float xVelocity = this.h0.getXVelocity();
                        float yVelocity = this.h0.getYVelocity();
                        if (Math.abs(xVelocity) >= this.f0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                            f10 = xVelocity;
                        }
                    }
                    VelocityTracker velocityTracker4 = this.h0;
                    if (velocityTracker4 != null) {
                        velocityTracker4.recycle();
                        this.h0 = null;
                    }
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (this.b0) {
                        this.b0 = false;
                        settle(f10);
                    } else if (actionMasked == 1) {
                        int i12 = this.T;
                        int i13 = this.W;
                        if (i12 == i13) {
                            l(i13);
                        }
                    }
                    this.T = -1;
                    return true;
                }
            }
        }
        ArrayList arrayList2 = this.G;
        if (actionMasked == 0) {
            if (!z9) {
                return super.onTouchEvent(motionEvent);
            }
            while (true) {
                if (i7 >= arrayList2.size()) {
                    break;
                }
                if (((RectF) arrayList2.get(i7)).contains(x10, y10)) {
                    i10 = i7;
                    break;
                }
                i7++;
            }
            this.T = i10;
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 3) {
                this.T = -1;
            }
            return super.onTouchEvent(motionEvent);
        }
        if (z9) {
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList2.size()) {
                    i14 = -1;
                    break;
                }
                if (((RectF) arrayList2.get(i14)).contains(x10, y10)) {
                    break;
                }
                i14++;
            }
            int i15 = this.T;
            if (i14 == i15) {
                l(i15);
            }
        }
        boolean z10 = this.T != -1 || z9;
        this.T = -1;
        return z10 || super.onTouchEvent(motionEvent);
    }

    public final void p() {
        ArrayList arrayList;
        ArrayList arrayList2;
        List n10 = n();
        while (true) {
            arrayList = this.D;
            if (arrayList.size() >= n10.size()) {
                break;
            }
            v4 v4Var = new v4(this, this.n);
            if (this.O) {
                v4Var.a.P();
                v4Var.b.P();
                v4Var.a();
            }
            arrayList.add(v4Var);
        }
        while (arrayList.size() > n10.size()) {
            v4 v4Var2 = (v4) org.telegram.ui.Cells.f1.k(1, arrayList);
            v4Var2.a.R();
            v4Var2.b.R();
            v4Var2.c = null;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < n10.size(); i10++) {
            v4 v4Var3 = (v4) arrayList.get(i10);
            v4Var3.e = (s) n10.get(i10);
            v4Var3.a();
        }
        while (true) {
            arrayList2 = this.E;
            if (arrayList2.size() >= n10.size()) {
                break;
            }
            ImageView g10 = g();
            g10.setImageResource(R.drawable.iv_media_dots);
            g10.setOnClickListener(new p4(this, i7));
            addView(g10, ha.e(32, 32, 51));
            arrayList2.add(g10);
        }
        this.x.bringToFront();
        this.y.bringToFront();
        while (arrayList2.size() > n10.size()) {
            ImageView imageView = (ImageView) org.telegram.ui.Cells.f1.k(1, arrayList2);
            removeView(imageView);
            this.K.remove(imageView);
            this.L.remove(imageView);
        }
        if (this.M != null) {
            while (i7 < arrayList.size()) {
                s sVar = ((v4) arrayList.get(i7)).e;
                if (sVar != null && sVar.n) {
                    return;
                } else {
                    i7++;
                }
            }
            this.M.b(this);
            this.M = null;
        }
    }

    public final void q(boolean z9) {
        boolean z10 = this.D.size() >= 2;
        int i7 = z10 ? 0 : 8;
        ImageView imageView = this.y;
        imageView.setVisibility(i7);
        if (z10) {
            int i10 = m() ? R.drawable.iv_media_slideshow : R.drawable.iv_media_collage;
            if (i10 == this.V) {
                return;
            }
            this.V = i10;
            if (z9) {
                org.telegram.messenger.g0.R3(imageView, i10);
            } else {
                imageView.setImageResource(i10);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int i7 = k6.ue;
        f6 f6Var = this.n;
        this.r.setColor(k6.w0(i7, f6Var));
        this.s.setColor(k6.w0(k6.ig, f6Var));
        j0 j0Var = this.w;
        if (j0Var != null) {
            j0Var.a();
        }
    }
}
