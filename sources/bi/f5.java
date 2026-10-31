package bi;

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bj;
import org.telegram.messenger.f8;
import org.telegram.messenger.jc;
import org.telegram.messenger.tz;
import org.telegram.messenger.vv;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class f5 extends c0 implements org.telegram.ui.ActionBar.k6, j9, o0 {
    public static Paint m0;
    public final ArrayList D;
    public final ArrayList E;
    public final ArrayList F;
    public final ArrayList G;
    public final boolean H;
    public final hi.f I;
    public final t7.u J;
    public final ArrayList K;
    public final HashMap L;
    public nh.h M;
    public w3 N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final org.telegram.ui.Components.t5 U;
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
    public final org.telegram.ui.ActionBar.p6 n;
    public final Paint r;
    public final Paint s;
    public final n0 w;
    public final ImageView x;
    public final ImageView y;

    public f5(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10 = 1;
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        int i11 = Build.VERSION.SDK_INT;
        boolean z10 = i11 >= 31 && tz.f();
        this.H = z10;
        this.K = new ArrayList();
        this.L = new HashMap();
        this.T = -1;
        this.U = new org.telegram.ui.Components.t5(this, 0L, 320L, gr.h);
        this.j0 = new ArrayList();
        this.k0 = a7.b;
        this.l0 = new Path();
        this.n = p6Var;
        setWillNotDraw(false);
        f(0, org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(4.0f));
        n0 n0Var = new n0(context, p6Var, new a6.i(this, 11));
        this.w = n0Var;
        addView(n0Var.a, w7.b6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        if (z10 && i11 >= 31) {
            hi.f fVar = new hi.f(new hi.c());
            this.I = fVar;
            fVar.f(org.telegram.messenger.i0.L(24.0f));
            this.J = new t7.u(3);
        }
        ImageView g10 = g();
        this.x = g10;
        g10.setImageResource(R.drawable.iv_media_add);
        addView(g10, w7.b6.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        g10.setOnClickListener(new b5(this, i10));
        ImageView g11 = g();
        this.y = g11;
        g11.setVisibility(8);
        addView(g11, w7.b6.d(32, 32.0f, 53, 12.0f, 12.0f, 66.0f, 12.0f));
        g11.setOnClickListener(new b5(this, 2));
        updateColors();
    }

    private nh.h getSpoilerEffect() {
        if (!this.O) {
            return null;
        }
        nh.h hVar = this.M;
        if (hVar != null && hVar.i) {
            this.M = null;
        }
        if (this.M == null) {
            this.M = nh.h.e(this);
        }
        return this.M;
    }

    private void settle(float f7) {
        int i10;
        int size = this.D.size();
        int i11 = 0;
        if (f7 >= 0.0f || this.W >= size - 1) {
            i10 = -1;
            if (f7 <= 0.0f || this.W <= 0) {
                float f10 = this.a0;
                if (f10 <= 0.5f || this.W >= size - 1) {
                    if (f10 >= -0.5f || this.W <= 0) {
                        i10 = 0;
                    }
                }
            }
            int i12 = i10 + this.W;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, i12 - r8);
            this.i0 = ofFloat;
            ofFloat.setDuration(220L);
            this.i0.setInterpolator(gr.h);
            this.i0.addUpdateListener(new bg.k(this, 1));
            this.i0.addListener(new d5(this, i12, i11));
            this.i0.start();
        }
        i10 = 1;
        int i122 = i10 + this.W;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.a0, i122 - r8);
        this.i0 = ofFloat2;
        ofFloat2.setDuration(220L);
        this.i0.setInterpolator(gr.h);
        this.i0.addUpdateListener(new bg.k(this, 1));
        this.i0.addListener(new d5(this, i122, i11));
        this.i0.start();
    }

    @Override // bi.o0
    public final boolean a(int i10, int i11) {
        return this.w.f(i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ue));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ig));
    }

    @Override // bi.o0
    public final void b() {
        this.w.i();
    }

    @Override // bi.c0
    public final int d() {
        return org.telegram.messenger.i0.L(16.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.j0;
        org.telegram.ui.ActionBar.p6 p6Var = this.n;
        int i10 = this.k0;
        int i11 = a7.b;
        if (i10 != i11) {
            this.k0 = i11;
            try {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var);
                if (getBackground() instanceof h2) {
                    ((h2) getBackground()).a(w02);
                }
                int w9 = org.telegram.ui.ActionBar.t6.w(w02, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, p6Var));
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    Drawable drawable = (Drawable) arrayList.get(i12);
                    if (drawable instanceof RippleDrawable) {
                        RippleDrawable rippleDrawable = (RippleDrawable) drawable;
                        if (rippleDrawable.getNumberOfLayers() > 0 && rippleDrawable.getId(0) != 16908334 && (rippleDrawable.getDrawable(0) instanceof ShapeDrawable)) {
                            ShapeDrawable shapeDrawable = (ShapeDrawable) rippleDrawable.getDrawable(0);
                            if (shapeDrawable.getPaint().getColor() != w02) {
                                shapeDrawable.getPaint().setColor(w02);
                                rippleDrawable.setColor(ColorStateList.valueOf(w9));
                                rippleDrawable.invalidateSelf();
                            }
                        }
                    }
                }
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        super.dispatchDraw(canvas);
        this.w.c(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.E.contains(view)) {
            a aVar = this.a;
            if ((aVar == null ? 0 : aVar.k.size()) > 0) {
                canvas.save();
                Path path = this.l0;
                path.rewind();
                path.addRoundRect(getPaddingLeft(), getPaddingTop(), Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight()) + getPaddingLeft(), getPaddingTop() + this.P, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final ImageView g() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (!this.H || Build.VERSION.SDK_INT < 31) {
            int i10 = org.telegram.ui.ActionBar.t6.G6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            org.telegram.ui.ActionBar.p6 p6Var = this.n;
            a7.t(imageView, i10, p6Var, mode);
            int i11 = org.telegram.ui.ActionBar.t6.d6;
            org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.t6.b0(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, p6Var)), 20, 20);
            this.j0.add(b02);
            imageView.setBackground(new j2(b02));
        } else {
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            vg.f fVar = new vg.f(this.I);
            fVar.o(this.J);
            fVar.q(org.telegram.messenger.i0.L(16.0f));
            this.L.put(imageView, fVar);
        }
        w7.e6.a(imageView);
        this.K.add(imageView);
        return imageView;
    }

    @Override // bi.o0
    public n1 getCaptionEditText() {
        return this.w.a;
    }

    @Override // bi.o0
    public a getRow() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        this.w.e(arrayList);
    }

    public final void j(Canvas canvas, ImageView imageView) {
        vg.f fVar;
        if (imageView.getVisibility() == 0 && (fVar = (vg.f) this.L.get(imageView)) != null) {
            fVar.setBounds(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
            fVar.setAlpha((int) (imageView.getAlpha() * 255.0f));
            vg.d dVar = fVar.b0;
            if (dVar != null) {
                dVar.h = true;
            }
            fVar.draw(canvas);
        }
    }

    public final void k(Canvas canvas) {
        char c10;
        int i10;
        ArrayList arrayList;
        jc jcVar;
        int i11;
        f5 f5Var = this;
        Canvas canvas2 = canvas;
        int paddingTop = f5Var.getPaddingTop();
        int paddingLeft = f5Var.getPaddingLeft();
        int i12 = 0;
        int max = Math.max(0, (f5Var.getWidth() - paddingLeft) - f5Var.getPaddingRight());
        canvas2.save();
        canvas2.translate(paddingLeft, 0.0f);
        a aVar = f5Var.a;
        if ((aVar == null ? 0 : aVar.k.size()) > 0) {
            Path path = f5Var.l0;
            path.rewind();
            path.addRoundRect(0.0f, paddingTop, max, f5Var.P + paddingTop, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            canvas2.clipRect(0, paddingTop, max, f5Var.P + paddingTop);
        }
        boolean m10 = f5Var.m();
        char c11 = 2;
        int i13 = 1;
        ArrayList arrayList2 = f5Var.D;
        boolean z10 = m10 && arrayList2.size() >= 2;
        a aVar2 = f5Var.a;
        int L = (aVar2 == null ? 0 : aVar2.k.size()) > 0 ? org.telegram.messenger.i0.L(8.0f) : 0;
        Paint paint = f5Var.r;
        if (z10 && (((i11 = f5Var.W) == 0 && f5Var.a0 < 0.0f) || (i11 == arrayList2.size() - 1 && f5Var.a0 > 0.0f))) {
            canvas2.drawRect(0.0f, paddingTop, max, f5Var.P + paddingTop, paint);
        }
        int size = arrayList2.size();
        jc jcVar2 = null;
        ArrayList arrayList3 = f5Var.G;
        if (size == 1 && arrayList3.size() == 1) {
            RectF rectF = (RectF) arrayList3.get(0);
            if (rectF.left > 0.5f || rectF.right < max - 0.5f) {
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(0.0f, paddingTop, max, paddingTop + f5Var.P);
                i5 i5Var = (i5) arrayList2.get(0);
                ImageReceiver imageReceiver = i5Var.b;
                if (i5Var.b()) {
                    imageReceiver.A0(rectF2);
                    imageReceiver.setAlpha(i5Var.a.h1);
                    imageReceiver.h(canvas2, null);
                }
            }
        }
        int i14 = 0;
        while (i14 < arrayList2.size() && i14 < arrayList3.size()) {
            i5 i5Var2 = (i5) arrayList2.get(i14);
            RectF rectF3 = (RectF) arrayList3.get(i14);
            if (z10) {
                int i15 = i14 == 0 ? L : i12;
                int i16 = i14 == arrayList2.size() - i13 ? L : i12;
                int i17 = i14 == arrayList2.size() - i13 ? L : i12;
                c10 = c11;
                int i18 = i14 == 0 ? L : i12;
                i5Var2.a.K0(i15, i16, i17, i18);
                i5Var2.b.K0(i15, i16, i17, i18);
            } else {
                c10 = c11;
                i5Var2.a.K0(i12, i12, i12, i12);
                i5Var2.b.K0(i12, i12, i12, i12);
            }
            boolean c12 = i5Var2.c();
            ImageReceiver imageReceiver2 = i5Var2.a;
            if (!c12) {
                canvas2.drawRect(rectF3, paint);
            }
            imageReceiver2.y0(Math.round(rectF3.left), Math.round(rectF3.top), Math.round(rectF3.width()), Math.round(rectF3.height()));
            if (i5Var2.c()) {
                imageReceiver2.h(canvas2, jcVar2);
            }
            RadialProgress2 radialProgress2 = i5Var2.d;
            w wVar = i5Var2.e;
            if (wVar == null || !wVar.a()) {
                i10 = 1;
            } else {
                int L2 = org.telegram.messenger.i0.L(48.0f);
                int round = Math.round(rectF3.centerX());
                int round2 = Math.round(rectF3.centerY());
                int i19 = L2 / 2;
                radialProgress2.r(round - i19, round2 - i19, round + i19, round2 + i19);
                i10 = 1;
                radialProgress2.p(true, i5Var2.e.f);
                radialProgress2.draw(canvas2);
            }
            w wVar2 = i5Var2.e;
            if (wVar2 != null && wVar2.n && i5Var2.c()) {
                nh.h spoilerEffect = f5Var.getSpoilerEffect();
                ImageReceiver imageReceiver3 = i5Var2.b;
                canvas2.save();
                canvas2.clipRect(rectF3);
                if (i5Var2.b()) {
                    imageReceiver3.A0(rectF3);
                    imageReceiver3.setAlpha(imageReceiver2.h1);
                    jcVar = null;
                    imageReceiver3.h(canvas2, null);
                } else {
                    jcVar = null;
                }
                if (spoilerEffect != null) {
                    canvas2.translate(rectF3.left, rectF3.top);
                    arrayList = arrayList3;
                    spoilerEffect.c(canvas2, f5Var, Math.round(rectF3.width()), Math.round(rectF3.height()), imageReceiver2.h1, false);
                } else {
                    arrayList = arrayList3;
                }
                canvas.restore();
            } else {
                arrayList = arrayList3;
                jcVar = null;
            }
            i14++;
            f5Var = this;
            canvas2 = canvas;
            arrayList3 = arrayList;
            i13 = i10;
            jcVar2 = jcVar;
            c11 = c10;
            i12 = 0;
        }
        canvas.restore();
    }

    public final void l(int i10) {
        if (this.N == null || this.a == null) {
            return;
        }
        List o10 = o();
        if (o10.isEmpty() || (o10.size() == 1 && ((w) o10.get(0)).a == 0)) {
            w3 w3Var = this.N;
            a aVar = this.a;
            d4 d4Var = w3Var.a;
            d4Var.i4 = aVar;
            d4Var.o3.p(0);
            return;
        }
        if (i10 < 0 || i10 >= o10.size() || !((w) o10.get(i10)).a()) {
            return;
        }
        d4.Q1(this.a, (w) o10.get(i10), this.N.a);
    }

    public final boolean m() {
        a aVar = this.a;
        return aVar != null && (aVar.b instanceof TL_iv.pageBlockSlideshow);
    }

    public final List o() {
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
        w wVar = aVar.g;
        return wVar != null ? Collections.singletonList(wVar) : Collections.EMPTY_LIST;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.D;
            if (i10 >= arrayList.size()) {
                return;
            }
            i5 i5Var = (i5) arrayList.get(i10);
            i5Var.a.P();
            i5Var.b.P();
            i5Var.a();
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
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
            if (i10 >= arrayList.size()) {
                break;
            }
            i5 i5Var = (i5) arrayList.get(i10);
            i5Var.a.R();
            i5Var.b.R();
            i5Var.c = null;
            i10++;
        }
        nh.h hVar = this.M;
        if (hVar != null) {
            hVar.b(this);
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
        hi.f fVar;
        ImageView imageView;
        ImageView imageView2;
        k9 textSelectionHelper;
        float f7;
        float f10;
        float f11;
        float i10;
        int paddingTop = getPaddingTop();
        k(canvas);
        org.telegram.ui.Components.t5 t5Var = this.U;
        float f12 = t5Var.c;
        ArrayList arrayList = this.D;
        if (arrayList.size() >= 2 && f12 > 0.001f) {
            if (m0 == null) {
                Paint paint = new Paint(1);
                m0 = paint;
                paint.setColor(-1);
                m0.setShadowLayer(org.telegram.messenger.i0.N(3.0f), 0.0f, org.telegram.messenger.i0.N(1.0f), TLObject.FLAG_31);
            }
            int size = arrayList.size();
            float L = org.telegram.messenger.i0.L(5.0f) + ((getPaddingTop() + this.P) - org.telegram.messenger.i0.L(23.0f));
            int L2 = org.telegram.messenger.i0.L(4.0f) + org.telegram.messenger.m5.D(6.0f, size - 1, org.telegram.messenger.i0.L(7.0f) * size);
            int paddingLeft = getPaddingLeft();
            int max = Math.max(0, (getWidth() - paddingLeft) - getPaddingRight());
            float f13 = this.W + this.a0;
            if (L2 < max) {
                f7 = 13.0f;
                i10 = ((max - L2) / 2.0f) + paddingLeft;
                f10 = 23.0f;
                f11 = 4.0f;
            } else {
                f7 = 13.0f;
                float L3 = org.telegram.messenger.i0.L(4.0f) + paddingLeft;
                int L4 = org.telegram.messenger.i0.L(13.0f);
                f10 = 23.0f;
                f11 = 4.0f;
                i10 = L3 - (Utilities.i(f13 - (((max - org.telegram.messenger.i0.L(8.0f)) / 2) / L4), Math.max(0, (size - (r12 * 2)) - 1), 0.0f) * L4);
            }
            canvas.save();
            canvas.clipRect(paddingLeft, (getPaddingTop() + this.P) - org.telegram.messenger.i0.L(f10), max + paddingLeft, getPaddingTop() + this.P);
            for (int i11 = 0; i11 < size; i11++) {
                float max2 = Math.max(0.0f, 1.0f - Math.abs(i11 - f13));
                m0.setAlpha((int) c3.i0.C(max2, 95.0f, 160.0f, f12));
                canvas.drawCircle(org.telegram.messenger.i0.L(f11) + i10 + (org.telegram.messenger.i0.L(f7) * i11), L, (org.telegram.messenger.i0.L(1.0f) * max2) + org.telegram.messenger.i0.L(2.0f), m0);
            }
            canvas.restore();
        }
        w3 w3Var = this.N;
        if (w3Var != null && (textSelectionHelper = w3Var.a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
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
                        k(fVar.b(width, height));
                    } finally {
                        fVar.c();
                    }
                }
                int i12 = 0;
                while (true) {
                    ArrayList arrayList2 = this.K;
                    int size2 = arrayList2.size();
                    imageView = this.y;
                    imageView2 = this.x;
                    if (i12 >= size2) {
                        break;
                    }
                    ImageView imageView3 = (ImageView) arrayList2.get(i12);
                    if (imageView3 != imageView2 && imageView3 != imageView) {
                        j(canvas, imageView3);
                    }
                    i12++;
                }
                j(canvas, imageView);
                j(canvas, imageView2);
            }
        }
        if (t5Var.i) {
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i14 = i12 - i10;
        int max = Math.max(0, (i14 - paddingLeft) - paddingRight);
        int i15 = i14 - paddingRight;
        int L = v7.a5.b(this.a) > 0 ? org.telegram.messenger.i0.L(16.0f) : 0;
        this.w.g(paddingLeft - L, paddingRight - L, i14, getPaddingTop() + this.P);
        int L2 = org.telegram.messenger.i0.L(6.0f);
        int i16 = i15 - L2;
        ImageView imageView = this.x;
        imageView.layout(i16 - imageView.getMeasuredWidth(), getPaddingTop() + L2, i16, imageView.getMeasuredHeight() + getPaddingTop() + L2);
        int i17 = i16 - L2;
        int measuredWidth = i17 - imageView.getMeasuredWidth();
        ImageView imageView2 = this.y;
        imageView2.layout(measuredWidth - imageView2.getMeasuredWidth(), getPaddingTop() + L2, i17 - imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + getPaddingTop() + L2);
        List o10 = o();
        int i18 = 0;
        while (true) {
            ArrayList arrayList = this.E;
            if (i18 >= arrayList.size()) {
                return;
            }
            ImageView imageView3 = (ImageView) arrayList.get(i18);
            if (i18 < o10.size() && ((w) o10.get(i18)).a != 0) {
                ArrayList arrayList2 = this.G;
                if (i18 < arrayList2.size()) {
                    RectF rectF = (RectF) arrayList2.get(i18);
                    if (rectF.right <= 0.0f || rectF.left >= max || rectF.bottom <= getPaddingTop() || rectF.top >= getPaddingTop() + this.P) {
                        imageView3.setVisibility(8);
                    } else {
                        int i19 = ((int) rectF.left) + L2 + paddingLeft;
                        int i20 = ((int) rectF.top) + L2;
                        imageView3.layout(i19, i20, imageView3.getMeasuredWidth() + i19, imageView3.getMeasuredHeight() + i20);
                        float f7 = 1.0f;
                        if (this.H) {
                            int left = (imageView2.getVisibility() == 0 ? imageView2.getLeft() : imageView.getLeft()) - org.telegram.messenger.i0.L(4.0f);
                            if (imageView3.getMeasuredWidth() + i19 > left) {
                                f7 = org.telegram.ui.Cells.f1.v(r9 - left, imageView3.getMeasuredWidth(), 1.0f, 0.0f);
                            }
                        }
                        imageView3.setAlpha(f7);
                        imageView3.setVisibility(f7 > 0.01f ? 0 : 8);
                    }
                    i18++;
                }
            }
            imageView3.setVisibility(8);
            i18++;
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
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        bj[] bjVarArr;
        int round;
        int i17;
        bj[] bjVarArr2;
        int i18;
        float[] fArr;
        int i19;
        int i20;
        int i21;
        int i22;
        int L;
        int i23;
        int size;
        int i24;
        ArrayList arrayList;
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int max = Math.max(0, (size2 - paddingLeft) - paddingRight);
        float f7 = m() ? 1.0f : 0.0f;
        org.telegram.ui.Components.t5 t5Var = this.U;
        float e = t5Var.e(false, f7);
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        int paddingTop = getPaddingTop();
        ArrayList arrayList3 = this.D;
        int size3 = arrayList3.size();
        int i25 = 1;
        if (size3 == 0) {
            int L2 = (org.telegram.messenger.i0.L(200.0f) - getPaddingTop()) - getPaddingBottom();
            this.S = L2;
            this.Q = L2;
            this.R = max;
        } else {
            if (size3 != 1) {
                float[] fArr2 = new float[size3];
                int i26 = 0;
                while (i26 < size3) {
                    i5 i5Var = (i5) arrayList3.get(i26);
                    if (i5Var.e == null) {
                        i20 = i25;
                        i19 = 0;
                    } else {
                        i19 = i5Var.d() ? i5Var.e.k : i5Var.e.j;
                        i20 = i25;
                    }
                    if (i5Var.e == null) {
                        i21 = 0;
                    } else {
                        boolean d = i5Var.d();
                        w wVar = i5Var.e;
                        i21 = d ? wVar.j : wVar.k;
                    }
                    fArr2[i26] = (i19 <= 0 || i21 <= 0) ? 1.0f : i19 / i21;
                    i26++;
                    i25 = i20;
                }
                i12 = i25;
                bj[] e7 = vv.e(fArr2);
                int i27 = 0;
                for (bj bjVar : e7) {
                    i27 = Math.max(i27, (int) bjVar.d);
                }
                int i28 = i27 + 1;
                float[] fArr3 = new float[i28];
                int length = e7.length;
                i13 = paddingLeft;
                int i29 = 0;
                while (i29 < length) {
                    int i30 = i29;
                    bj bjVar2 = e7[i30];
                    int i31 = paddingRight;
                    byte b10 = bjVar2.c;
                    int i32 = i28;
                    if (b10 == bjVar2.d) {
                        fArr3[b10] = Math.max(fArr3[b10], bjVar2.f);
                    }
                    i29 = i30 + 1;
                    paddingRight = i31;
                    i28 = i32;
                }
                i14 = paddingRight;
                int i33 = i28;
                int length2 = e7.length;
                int i34 = 0;
                while (i34 < length2) {
                    bj bjVar3 = e7[i34];
                    int i35 = bjVar3.c;
                    int i36 = length2;
                    byte b11 = bjVar3.d;
                    if (i35 != b11) {
                        int i37 = (b11 - i35) + 1;
                        i18 = i34;
                        float[] fArr4 = bjVar3.m;
                        if (fArr4 == null || fArr4.length != i37) {
                            fArr = fArr3;
                            float f10 = bjVar3.f / i37;
                            while (i35 <= bjVar3.d) {
                                fArr[i35] = Math.max(fArr[i35], f10);
                                i35++;
                            }
                            i34 = i18 + 1;
                            length2 = i36;
                            fArr3 = fArr;
                        } else {
                            int i38 = 0;
                            while (i38 < i37) {
                                int i39 = bjVar3.c + i38;
                                int i40 = i38;
                                float[] fArr5 = fArr3;
                                fArr5[i39] = Math.max(fArr3[i39], bjVar3.m[i40]);
                                i38 = i40 + 1;
                                fArr3 = fArr5;
                            }
                        }
                    } else {
                        i18 = i34;
                    }
                    fArr = fArr3;
                    i34 = i18 + 1;
                    length2 = i36;
                    fArr3 = fArr;
                }
                float[] fArr6 = fArr3;
                Point point = org.telegram.messenger.i0.q;
                float max2 = Math.max(point.x, point.y) * 0.5f;
                int[] iArr = new int[i27 + 2];
                float f11 = 0.0f;
                for (int i41 = 0; i41 <= i27; i41++) {
                    iArr[i41] = Math.round(f11 * max2);
                    f11 += fArr6[i41];
                }
                iArr[i33] = Math.round(f11 * max2);
                int L3 = org.telegram.messenger.i0.L(2.0f);
                int i42 = 0;
                while (i42 < e7.length) {
                    bj bjVar4 = e7[i42];
                    int i43 = iArr[bjVar4.c];
                    int i44 = iArr[bjVar4.d + 1] - i43;
                    int i45 = L3;
                    if (bjVar4.j > 0) {
                        round = Math.round((r2 * max) / 1000.0f);
                        i16 = i44;
                        bjVarArr = e7;
                    } else {
                        i16 = i44;
                        int i46 = 0;
                        int i47 = 0;
                        while (i46 < e7.length) {
                            if (i46 == i42) {
                                i17 = i46;
                                bjVarArr2 = e7;
                            } else {
                                bj bjVar5 = e7[i46];
                                i17 = i46;
                                byte b12 = bjVar5.c;
                                bjVarArr2 = e7;
                                byte b13 = bjVar4.c;
                                if (b12 <= b13 && bjVar5.d >= b13 && bjVar5.a < bjVar4.a) {
                                    i47 += bjVar5.e;
                                }
                            }
                            i46 = i17 + 1;
                            e7 = bjVarArr2;
                        }
                        bjVarArr = e7;
                        round = Math.round((i47 * max) / 1000.0f);
                    }
                    arrayList2.add(new RectF(round, i43 + paddingTop, Math.max(0, (bjVar4.l & 2) != 0 ? max - round : Math.round((bjVar4.e * max) / 1000.0f) - i45) + round, Math.max(0, (bjVar4.l & 8) == 0 ? i16 - i45 : i16) + r15));
                    i42++;
                    L3 = i45;
                    iArr = iArr;
                    e7 = bjVarArr;
                }
                this.Q = iArr[i33];
                this.R = max;
                float f12 = 0.0f;
                for (int i48 = 0; i48 < size3; i48++) {
                    i5 i5Var2 = (i5) arrayList3.get(i48);
                    int i49 = i5Var2.e == null ? 0 : i5Var2.d() ? i5Var2.e.k : i5Var2.e.j;
                    if (i5Var2.e == null) {
                        i15 = 0;
                    } else {
                        boolean d10 = i5Var2.d();
                        w wVar2 = i5Var2.e;
                        i15 = d10 ? wVar2.j : wVar2.k;
                    }
                    f12 = ((i49 <= 0 || i15 <= 0) ? 1.0f : i49 / i15) + f12;
                }
                int max3 = (int) (this.R / Math.max(0.5f, f12 / size3));
                Point point2 = org.telegram.messenger.i0.q;
                int max4 = (int) (Math.max(point2.x, point2.y) * 0.55f);
                if (max3 > max4) {
                    max3 = max4;
                }
                this.S = max3;
                this.P = Math.round(org.telegram.messenger.i0.W1(e, this.Q, this.S));
                ArrayList arrayList4 = this.G;
                arrayList4.clear();
                size = arrayList3.size();
                if (size != 0) {
                    int paddingTop2 = getPaddingTop();
                    if (size == i12) {
                        arrayList4.add(new RectF((RectF) arrayList2.get(0)));
                    } else {
                        float f13 = (-this.a0) * this.R;
                        int i50 = 0;
                        while (i50 < size && i50 < arrayList2.size()) {
                            RectF rectF = (RectF) arrayList2.get(i50);
                            float f14 = ((i50 - this.W) * this.R) + f13;
                            arrayList4.add(new RectF(org.telegram.messenger.i0.T1(rectF.left, f14, e), org.telegram.messenger.i0.T1(rectF.top, paddingTop2, e), org.telegram.messenger.i0.T1(rectF.right, f14 + this.R, e), org.telegram.messenger.i0.T1(rectF.bottom, this.S + paddingTop2, e)));
                            i50++;
                            size = size;
                        }
                    }
                }
                int L4 = v7.a5.b(this.a) <= 0 ? org.telegram.messenger.i0.L(16.0f) : 0;
                setMeasuredDimension(size2, getPaddingBottom() + getPaddingTop() + this.P + this.w.h(i13 - L4, i14 - L4, size2));
                this.x.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_30));
                this.y.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_30));
                i24 = 0;
                while (true) {
                    arrayList = this.E;
                    if (i24 < arrayList.size()) {
                        break;
                    }
                    ((ImageView) arrayList.get(i24)).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_30));
                    i24++;
                }
                if (t5Var.i) {
                    return;
                }
                requestLayout();
                return;
            }
            i5 i5Var3 = (i5) arrayList3.get(0);
            int i51 = i5Var3.e == null ? 0 : i5Var3.d() ? i5Var3.e.k : i5Var3.e.j;
            if (i5Var3.e == null) {
                i22 = 0;
            } else {
                boolean d11 = i5Var3.d();
                w wVar3 = i5Var3.e;
                i22 = d11 ? wVar3.j : wVar3.k;
            }
            if (i51 <= 0 || i22 <= 0) {
                L = (org.telegram.messenger.i0.L(200.0f) - getPaddingTop()) - getPaddingBottom();
            } else {
                L = (int) ((max / Math.max(1, i51)) * i22);
                Point point3 = org.telegram.messenger.i0.q;
                int max5 = (int) (Math.max(point3.x, point3.y) * 0.55f);
                if (L > max5) {
                    i23 = (int) ((max5 / Math.max(1, i22)) * i51);
                    L = max5;
                    arrayList2.add(new RectF((max - i23) / 2, paddingTop, r4 + i23, paddingTop + L));
                    this.Q = L;
                    this.R = i23;
                    this.S = L;
                }
            }
            i23 = max;
            arrayList2.add(new RectF((max - i23) / 2, paddingTop, r4 + i23, paddingTop + L));
            this.Q = L;
            this.R = i23;
            this.S = L;
        }
        i13 = paddingLeft;
        i14 = paddingRight;
        i12 = 1;
        this.P = Math.round(org.telegram.messenger.i0.W1(e, this.Q, this.S));
        ArrayList arrayList42 = this.G;
        arrayList42.clear();
        size = arrayList3.size();
        if (size != 0) {
        }
        if (v7.a5.b(this.a) <= 0) {
        }
        setMeasuredDimension(size2, getPaddingBottom() + getPaddingTop() + this.P + this.w.h(i13 - L4, i14 - L4, size2));
        this.x.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_30));
        this.y.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_30));
        i24 = 0;
        while (true) {
            arrayList = this.E;
            if (i24 < arrayList.size()) {
            }
            ((ImageView) arrayList.get(i24)).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_30));
            i24++;
        }
        if (t5Var.i) {
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 0;
        boolean z10 = y3 >= ((float) getPaddingTop()) && y3 < ((float) (getPaddingTop() + this.P));
        int i11 = -1;
        if (m() && !this.U.i) {
            ArrayList arrayList = this.D;
            if (arrayList.size() >= 2) {
                if (actionMasked == 0) {
                    if (!z10) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (this.e0 == 0) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                        this.e0 = viewConfiguration.getScaledTouchSlop();
                        this.f0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.g0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    this.c0 = x10;
                    this.d0 = y3;
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
                float f7 = 0.0f;
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.h0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float f10 = x10 - this.c0;
                    float f11 = y3 - this.d0;
                    if (!this.b0 && Math.abs(f10) > this.e0 && Math.abs(f10) > Math.abs(f11)) {
                        this.b0 = true;
                        this.T = -1;
                    }
                    if (this.b0) {
                        float f12 = (-f10) / this.R;
                        int i12 = this.W;
                        if (i12 == 0 && f12 < 0.0f) {
                            f12 *= 0.3f;
                        }
                        if (i12 == arrayList.size() - 1 && f12 > 0.0f) {
                            f12 *= 0.3f;
                        }
                        this.a0 = f12;
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
                            f7 = xVelocity;
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
                        settle(f7);
                    } else if (actionMasked == 1) {
                        int i13 = this.T;
                        int i14 = this.W;
                        if (i13 == i14) {
                            l(i14);
                        }
                    }
                    this.T = -1;
                    return true;
                }
            }
        }
        ArrayList arrayList2 = this.G;
        if (actionMasked == 0) {
            if (!z10) {
                return super.onTouchEvent(motionEvent);
            }
            while (true) {
                if (i10 >= arrayList2.size()) {
                    break;
                }
                if (((RectF) arrayList2.get(i10)).contains(x10, y3)) {
                    i11 = i10;
                    break;
                }
                i10++;
            }
            this.T = i11;
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 3) {
                this.T = -1;
            }
            return super.onTouchEvent(motionEvent);
        }
        if (z10) {
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList2.size()) {
                    i15 = -1;
                    break;
                }
                if (((RectF) arrayList2.get(i15)).contains(x10, y3)) {
                    break;
                }
                i15++;
            }
            int i16 = this.T;
            if (i15 == i16) {
                l(i16);
            }
        }
        boolean z11 = this.T != -1 || z10;
        this.T = -1;
        return z11 || super.onTouchEvent(motionEvent);
    }

    public final void p() {
        ArrayList arrayList;
        ArrayList arrayList2;
        List o10 = o();
        while (true) {
            arrayList = this.D;
            if (arrayList.size() >= o10.size()) {
                break;
            }
            i5 i5Var = new i5(this, this.n);
            if (this.O) {
                i5Var.a.P();
                i5Var.b.P();
                i5Var.a();
            }
            arrayList.add(i5Var);
        }
        while (arrayList.size() > o10.size()) {
            i5 i5Var2 = (i5) i0.a.v(1, arrayList);
            i5Var2.a.R();
            i5Var2.b.R();
            i5Var2.c = null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < o10.size(); i11++) {
            i5 i5Var3 = (i5) arrayList.get(i11);
            i5Var3.e = (w) o10.get(i11);
            i5Var3.a();
        }
        while (true) {
            arrayList2 = this.E;
            if (arrayList2.size() >= o10.size()) {
                break;
            }
            ImageView g10 = g();
            g10.setImageResource(R.drawable.iv_media_dots);
            g10.setOnClickListener(new b5(this, i10));
            addView(g10, w7.b6.e(32, 32, 51));
            arrayList2.add(g10);
        }
        this.x.bringToFront();
        this.y.bringToFront();
        while (arrayList2.size() > o10.size()) {
            ImageView imageView = (ImageView) i0.a.v(1, arrayList2);
            removeView(imageView);
            this.K.remove(imageView);
            this.L.remove(imageView);
        }
        if (this.M != null) {
            while (i10 < arrayList.size()) {
                w wVar = ((i5) arrayList.get(i10)).e;
                if (wVar != null && wVar.n) {
                    return;
                } else {
                    i10++;
                }
            }
            this.M.b(this);
            this.M = null;
        }
    }

    public final void q(boolean z10) {
        boolean z11 = this.D.size() >= 2;
        int i10 = z11 ? 0 : 8;
        ImageView imageView = this.y;
        imageView.setVisibility(i10);
        if (z11) {
            int i11 = m() ? R.drawable.iv_media_slideshow : R.drawable.iv_media_collage;
            if (i11 == this.V) {
                return;
            }
            this.V = i11;
            if (z10) {
                org.telegram.messenger.i0.Q3(imageView, i11);
            } else {
                imageView.setImageResource(i11);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.ue;
        org.telegram.ui.ActionBar.p6 p6Var = this.n;
        this.r.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.s.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ig, p6Var));
        n0 n0Var = this.w;
        if (n0Var != null) {
            n0Var.a();
        }
    }
}
