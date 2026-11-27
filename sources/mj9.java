// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class mj9 extends ze9 implements snb, zlb, jf9 {
    public static Paint n0;
    public final ArrayList E;
    public final ArrayList F;
    public final ArrayList G;
    public final ArrayList H;
    public final boolean I;
    public final rz4 J;
    public final rj2 K;
    public final ArrayList L;
    public final HashMap M;
    public mpa N;
    public ii9 O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final mm V;
    public int W;
    public int a0;
    public float b0;
    public boolean c0;
    public float d0;
    public float e0;
    public int f0;
    public int g0;
    public int h0;
    public VelocityTracker i0;
    public ValueAnimator j0;
    public final ArrayList k0;
    public int l0;
    public final Path m0;
    public final vnb n;
    public final Paint r;
    public final Paint s;
    public final if9 w;
    public final ImageView x;
    public final ImageView y;

    public mj9(Context context, vnb vnbVar) {
        super(context);
        byte b = 1;
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        boolean z = i >= 31 && xea.f();
        this.I = z;
        this.L = new ArrayList();
        this.M = new HashMap();
        this.U = -1;
        this.V = new mm(this, 0L, 320L, k43.h);
        this.k0 = new ArrayList();
        this.l0 = yob.b;
        this.m0 = new Path();
        this.n = vnbVar;
        setWillNotDraw(false);
        f(0, hl.L(6.0f), 0, hl.L(4.0f));
        if9 if9Var = new if9(context, vnbVar, new i09(this, (byte) 6));
        this.w = if9Var;
        addView(if9Var.a, tre.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        if (z && i >= 31) {
            rz4 rz4Var = new rz4(new oz4());
            this.J = rz4Var;
            rz4Var.l(hl.L(24.0f));
            this.K = new rj2((byte) 25);
        }
        ImageView g = g();
        this.x = g;
        g.setImageResource(R.drawable.iv_media_add);
        addView(g, tre.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        g.setOnClickListener(new jj9(this, b));
        ImageView g2 = g();
        this.y = g2;
        g2.setVisibility(8);
        addView(g2, tre.d(32, 32.0f, 53, 12.0f, 12.0f, 66.0f, 12.0f));
        g2.setOnClickListener(new jj9(this, (byte) 2));
        updateColors();
    }

    private mpa getSpoilerEffect() {
        mpa mpaVar = null;
        if (this.P) {
            mpa mpaVar2 = this.N;
            if (mpaVar2 == null || !mpaVar2.i) {
                mpaVar = mpaVar2;
            } else {
                this.N = null;
            }
            if (mpaVar == null) {
                mpa e = mpa.e(this);
                this.N = e;
                return e;
            }
        }
        return mpaVar;
    }

    private void settle(float f) {
        int i;
        int size = this.E.size();
        if (f >= 0.0f || this.a0 >= size - 1) {
            i = -1;
            if (f <= 0.0f || this.a0 <= 0) {
                float f2 = this.b0;
                if (f2 <= 0.5f || this.a0 >= size - 1) {
                    if (f2 >= -0.5f || this.a0 <= 0) {
                        i = 0;
                    }
                }
            }
            int i2 = i + this.a0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b0, i2 - r7);
            this.j0 = ofFloat;
            ofFloat.setDuration(220L);
            this.j0.setInterpolator(k43.h);
            this.j0.addUpdateListener(new b49(this, (byte) 3));
            this.j0.addListener(new dn(this, i2, (byte) 10));
            this.j0.start();
        }
        i = 1;
        int i22 = i + this.a0;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.b0, i22 - r7);
        this.j0 = ofFloat2;
        ofFloat2.setDuration(220L);
        this.j0.setInterpolator(k43.h);
        this.j0.addUpdateListener(new b49(this, (byte) 3));
        this.j0.addListener(new dn(this, i22, (byte) 10));
        this.j0.start();
    }

    @Override // jf9
    public final boolean a(int i, int i2) {
        return this.w.f(i, i2);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.xe));
        hashSet.add(Integer.valueOf(aob.lg));
    }

    @Override // jf9
    public final void b() {
        this.w.i();
    }

    @Override // ze9
    public final int d() {
        return hl.L(16.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.k0;
        vnb vnbVar = this.n;
        int i = this.l0;
        int i2 = yob.b;
        if (i != i2) {
            this.l0 = i2;
            try {
                int v0 = aob.v0(aob.d6, vnbVar);
                if (getBackground() instanceof vg9) {
                    ((vg9) getBackground()).a(v0);
                }
                int v = aob.v(v0, aob.v0(aob.i6, vnbVar));
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    Drawable drawable = (Drawable) arrayList.get(i3);
                    if (drawable instanceof RippleDrawable) {
                        RippleDrawable rippleDrawable = (RippleDrawable) drawable;
                        if (rippleDrawable.getNumberOfLayers() > 0 && rippleDrawable.getId(0) != 16908334 && (rippleDrawable.getDrawable(0) instanceof ShapeDrawable)) {
                            ShapeDrawable shapeDrawable = (ShapeDrawable) rippleDrawable.getDrawable(0);
                            if (shapeDrawable.getPaint().getColor() != v0) {
                                shapeDrawable.getPaint().setColor(v0);
                                rippleDrawable.setColor(ColorStateList.valueOf(v));
                                rippleDrawable.invalidateSelf();
                            }
                        }
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        super.dispatchDraw(canvas);
        this.w.c(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.F.contains(view)) {
            mk0 mk0Var = this.a;
            if ((mk0Var == null ? 0 : mk0Var.k.size()) > 0) {
                canvas.save();
                Path path = this.m0;
                path.rewind();
                path.addRoundRect(getPaddingLeft(), getPaddingTop(), Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight()) + getPaddingLeft(), getPaddingTop() + this.Q, hl.L(8.0f), hl.L(8.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public final ImageView g() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (!this.I || Build.VERSION.SDK_INT < 31) {
            int i = aob.G6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            vnb vnbVar = this.n;
            yob.s(imageView, i, vnbVar, mode);
            int i2 = aob.d6;
            hf0 Z = aob.Z(aob.v0(i2, vnbVar), aob.v(aob.v0(i2, vnbVar), aob.v0(aob.i6, vnbVar)), 20, 20);
            this.k0.add(Z);
            imageView.setBackground(new xg9(Z));
        } else {
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            rz4 rz4Var = this.J;
            jl0 jl0Var = new jl0(rz4Var, rz4Var, rz4Var);
            jl0Var.p(this.K);
            jl0Var.r(hl.L(16.0f));
            this.M.put(imageView, jl0Var);
        }
        iye.a(imageView);
        this.L.add(imageView);
        return imageView;
    }

    @Override // jf9
    public dg9 getCaptionEditText() {
        return this.w.a;
    }

    @Override // jf9
    public mk0 getRow() {
        return this.a;
    }

    public final void h(Canvas canvas, ImageView imageView) {
        jl0 jl0Var;
        if (imageView.getVisibility() != 0 || (jl0Var = (jl0) this.M.get(imageView)) == null) {
            return;
        }
        jl0Var.setBounds(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
        jl0Var.setAlpha((int) (imageView.getAlpha() * 255.0f));
        hl0 hl0Var = jl0Var.h0;
        if (hl0Var != null) {
            hl0Var.h = true;
        }
        jl0Var.draw(canvas);
    }

    public final void j(Canvas canvas) {
        char c;
        int i;
        ArrayList arrayList;
        ln5 ln5Var;
        int i2;
        mj9 mj9Var = this;
        Canvas canvas2 = canvas;
        int paddingTop = mj9Var.getPaddingTop();
        int paddingLeft = mj9Var.getPaddingLeft();
        int i3 = 0;
        int max = Math.max(0, (mj9Var.getWidth() - paddingLeft) - mj9Var.getPaddingRight());
        canvas2.save();
        canvas2.translate(paddingLeft, 0.0f);
        mk0 mk0Var = mj9Var.a;
        if ((mk0Var == null ? 0 : mk0Var.k.size()) > 0) {
            Path path = mj9Var.m0;
            path.rewind();
            path.addRoundRect(0.0f, paddingTop, max, mj9Var.Q + paddingTop, hl.L(8.0f), hl.L(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            canvas2.clipRect(0, paddingTop, max, mj9Var.Q + paddingTop);
        }
        boolean n = mj9Var.n();
        char c2 = 2;
        int i4 = 1;
        ArrayList arrayList2 = mj9Var.E;
        boolean z = n && arrayList2.size() >= 2;
        mk0 mk0Var2 = mj9Var.a;
        int L = (mk0Var2 == null ? 0 : mk0Var2.k.size()) > 0 ? hl.L(8.0f) : 0;
        Paint paint = mj9Var.r;
        if (z && (((i2 = mj9Var.a0) == 0 && mj9Var.b0 < 0.0f) || (i2 == arrayList2.size() - 1 && mj9Var.b0 > 0.0f))) {
            canvas2.drawRect(0.0f, paddingTop, max, mj9Var.Q + paddingTop, paint);
        }
        int size = arrayList2.size();
        ln5 ln5Var2 = null;
        ArrayList arrayList3 = mj9Var.H;
        if (size == 1 && arrayList3.size() == 1) {
            RectF rectF = (RectF) arrayList3.get(0);
            if (rectF.left > 0.5f || rectF.right < max - 0.5f) {
                RectF rectF2 = hl.P;
                rectF2.set(0.0f, paddingTop, max, paddingTop + mj9Var.Q);
                pj9 pj9Var = (pj9) arrayList2.get(0);
                ImageReceiver imageReceiver = pj9Var.b;
                if (pj9Var.b()) {
                    imageReceiver.k0(rectF2);
                    imageReceiver.setAlpha(pj9Var.a.i1);
                    imageReceiver.h(canvas2, null);
                }
            }
        }
        int i5 = 0;
        while (i5 < arrayList2.size() && i5 < arrayList3.size()) {
            pj9 pj9Var2 = (pj9) arrayList2.get(i5);
            RectF rectF3 = (RectF) arrayList3.get(i5);
            if (z) {
                int i6 = i5 == 0 ? L : i3;
                int i7 = i5 == arrayList2.size() - i4 ? L : i3;
                int i8 = i5 == arrayList2.size() - i4 ? L : i3;
                c = c2;
                int i9 = i5 == 0 ? L : i3;
                pj9Var2.a.r0(i6, i7, i8, i9);
                pj9Var2.b.r0(i6, i7, i8, i9);
            } else {
                c = c2;
                pj9Var2.a.r0(i3, i3, i3, i3);
                pj9Var2.b.r0(i3, i3, i3, i3);
            }
            boolean c3 = pj9Var2.c();
            ImageReceiver imageReceiver2 = pj9Var2.a;
            if (!c3) {
                canvas2.drawRect(rectF3, paint);
            }
            imageReceiver2.i0(Math.round(rectF3.left), Math.round(rectF3.top), Math.round(rectF3.width()), Math.round(rectF3.height()));
            if (pj9Var2.c()) {
                imageReceiver2.h(canvas2, ln5Var2);
            }
            RadialProgress2 radialProgress2 = pj9Var2.d;
            p07 p07Var = pj9Var2.e;
            if (p07Var == null || !p07Var.a()) {
                i = 1;
            } else {
                int L2 = hl.L(48.0f);
                int round = Math.round(rectF3.centerX());
                int round2 = Math.round(rectF3.centerY());
                int i10 = L2 / 2;
                radialProgress2.p(round - i10, round2 - i10, round + i10, round2 + i10);
                i = 1;
                radialProgress2.o(true, pj9Var2.e.f);
                radialProgress2.draw(canvas2);
            }
            p07 p07Var2 = pj9Var2.e;
            if (p07Var2 != null && p07Var2.n && pj9Var2.c()) {
                mpa spoilerEffect = mj9Var.getSpoilerEffect();
                ImageReceiver imageReceiver3 = pj9Var2.b;
                canvas2.save();
                canvas2.clipRect(rectF3);
                if (pj9Var2.b()) {
                    imageReceiver3.k0(rectF3);
                    imageReceiver3.setAlpha(imageReceiver2.i1);
                    ln5Var = null;
                    imageReceiver3.h(canvas2, null);
                } else {
                    ln5Var = null;
                }
                if (spoilerEffect != null) {
                    canvas2.translate(rectF3.left, rectF3.top);
                    arrayList = arrayList3;
                    spoilerEffect.c(canvas2, mj9Var, Math.round(rectF3.width()), Math.round(rectF3.height()), imageReceiver2.i1, false);
                } else {
                    arrayList = arrayList3;
                }
                canvas.restore();
            } else {
                arrayList = arrayList3;
                ln5Var = null;
            }
            i5++;
            mj9Var = this;
            canvas2 = canvas;
            arrayList3 = arrayList;
            i4 = i;
            ln5Var2 = ln5Var;
            c2 = c;
            i3 = 0;
        }
        canvas.restore();
    }

    @Override // zlb
    public final void k(ArrayList arrayList) {
        this.w.e(arrayList);
    }

    public final void m(int i) {
        if (this.O == null || this.a == null) {
            return;
        }
        List o = o();
        if (o.isEmpty() || (o.size() == 1 && ((p07) o.get(0)).a == 0)) {
            ii9 ii9Var = this.O;
            mk0 mk0Var = this.a;
            pi9 pi9Var = ii9Var.a;
            pi9Var.j4 = mk0Var;
            pi9Var.p3.d(0);
            return;
        }
        if (i < 0 || i >= o.size() || !((p07) o.get(i)).a()) {
            return;
        }
        ii9 ii9Var2 = this.O;
        ii9Var2.a.o2(this.a, (p07) o.get(i));
    }

    public final boolean n() {
        mk0 mk0Var = this.a;
        return mk0Var != null && (mk0Var.b instanceof TL_iv.pageBlockSlideshow);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List o() {
        boolean z;
        mk0 mk0Var = this.a;
        if (mk0Var == null) {
            return Collections.EMPTY_LIST;
        }
        if (mk0Var != null) {
            TL_iv.PageBlock pageBlock = mk0Var.b;
            if ((pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                z = true;
                if (z) {
                    p07 p07Var = mk0Var.g;
                    return p07Var != null ? Collections.singletonList(p07Var) : Collections.EMPTY_LIST;
                }
                ArrayList arrayList = mk0Var.h;
                return arrayList != null ? arrayList : Collections.EMPTY_LIST;
            }
        }
        z = false;
        if (z) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P = true;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.E;
            if (i >= arrayList.size()) {
                return;
            }
            pj9 pj9Var = (pj9) arrayList.get(i);
            pj9Var.a.I();
            pj9Var.b.I();
            pj9Var.a();
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        this.P = false;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        VelocityTracker velocityTracker = this.i0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.i0 = null;
        }
        this.c0 = false;
        while (true) {
            ArrayList arrayList = this.E;
            if (i >= arrayList.size()) {
                break;
            }
            pj9 pj9Var = (pj9) arrayList.get(i);
            pj9Var.a.K();
            pj9Var.b.K();
            pj9Var.c = null;
            i++;
        }
        mpa mpaVar = this.N;
        if (mpaVar != null) {
            mpaVar.b(this);
            this.N = null;
        }
        ValueAnimator valueAnimator = this.j0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.j0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        rz4 rz4Var;
        ImageView imageView;
        ImageView imageView2;
        amb textSelectionHelper;
        float f;
        float f2;
        float i;
        int paddingTop = getPaddingTop();
        j(canvas);
        mm mmVar = this.V;
        float f3 = mmVar.c;
        ArrayList arrayList = this.E;
        if (arrayList.size() >= 2 && f3 > 0.001f) {
            if (n0 == null) {
                Paint paint = new Paint(1);
                n0 = paint;
                paint.setColor(-1);
                n0.setShadowLayer(hl.N(3.0f), 0.0f, hl.N(1.0f), TLObject.FLAG_31);
            }
            int size = arrayList.size();
            float L = hl.L(5.0f) + ((getPaddingTop() + this.Q) - hl.L(23.0f));
            int L2 = hl.L(4.0f) + uh9.y(6.0f, size - 1, hl.L(7.0f) * size);
            int paddingLeft = getPaddingLeft();
            int max = Math.max(0, (getWidth() - paddingLeft) - getPaddingRight());
            float f4 = this.a0 + this.b0;
            if (L2 < max) {
                i = ((max - L2) / 2.0f) + paddingLeft;
                f = 23.0f;
                f2 = 4.0f;
            } else {
                float L3 = hl.L(4.0f) + paddingLeft;
                int L4 = hl.L(13.0f);
                f = 23.0f;
                f2 = 4.0f;
                i = L3 - (Utilities.i(f4 - (((max - hl.L(8.0f)) / 2) / L4), Math.max(0, (size - (r12 << 1)) - 1), 0.0f) * L4);
            }
            canvas.save();
            canvas.clipRect(paddingLeft, (getPaddingTop() + this.Q) - hl.L(f), max + paddingLeft, getPaddingTop() + this.Q);
            for (int i2 = 0; i2 < size; i2++) {
                float max2 = Math.max(0.0f, 1.0f - Math.abs(i2 - f4));
                n0.setAlpha((int) xnb.z(max2, 95.0f, 160.0f, f3));
                canvas.drawCircle(hl.L(f2) + i + (hl.L(13.0f) * i2), L, (hl.L(1.0f) * max2) + hl.L(2.0f), n0);
            }
            canvas.restore();
        }
        ii9 ii9Var = this.O;
        if (ii9Var != null && (textSelectionHelper = ii9Var.a.getTextSelectionHelper()) != null && textSelectionHelper.w() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int S = RecyclerView.S(this);
            if (S >= 0 && S > textSelectionHelper.p0 && S <= textSelectionHelper.s0) {
                canvas.drawRect(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), paddingTop + this.Q, this.s);
            }
        }
        if (this.I && (rz4Var = this.J) != null && Build.VERSION.SDK_INT >= 31) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                if (canvas.isHardwareAccelerated() && !rz4Var.r) {
                    try {
                        j(rz4Var.i(width, height));
                    } finally {
                        rz4Var.j();
                    }
                }
                int i3 = 0;
                while (true) {
                    ArrayList arrayList2 = this.L;
                    int size2 = arrayList2.size();
                    imageView = this.y;
                    imageView2 = this.x;
                    if (i3 >= size2) {
                        break;
                    }
                    ImageView imageView3 = (ImageView) arrayList2.get(i3);
                    if (imageView3 != imageView2 && imageView3 != imageView) {
                        h(canvas, imageView3);
                    }
                    i3++;
                }
                h(canvas, imageView);
                h(canvas, imageView2);
            }
        }
        if (mmVar.i) {
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i5 = i3 - i;
        int max = Math.max(0, (i5 - paddingLeft) - paddingRight);
        int i6 = i5 - paddingRight;
        int L = nxe.b(this.a) > 0 ? hl.L(16.0f) : 0;
        this.w.g(paddingLeft - L, paddingRight - L, i5, getPaddingTop() + this.Q);
        int L2 = hl.L(6.0f);
        int i7 = i6 - L2;
        ImageView imageView = this.x;
        imageView.layout(i7 - imageView.getMeasuredWidth(), getPaddingTop() + L2, i7, imageView.getMeasuredHeight() + getPaddingTop() + L2);
        int i8 = i7 - L2;
        int measuredWidth = i8 - imageView.getMeasuredWidth();
        ImageView imageView2 = this.y;
        imageView2.layout(measuredWidth - imageView2.getMeasuredWidth(), getPaddingTop() + L2, i8 - imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + getPaddingTop() + L2);
        List o = o();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i9 >= arrayList.size()) {
                return;
            }
            ImageView imageView3 = (ImageView) arrayList.get(i9);
            if (i9 < o.size() && ((p07) o.get(i9)).a != 0) {
                ArrayList arrayList2 = this.H;
                if (i9 < arrayList2.size()) {
                    RectF rectF = (RectF) arrayList2.get(i9);
                    if (rectF.right <= 0.0f || rectF.left >= max || rectF.bottom <= getPaddingTop() || rectF.top >= getPaddingTop() + this.Q) {
                        imageView3.setVisibility(8);
                    } else {
                        int i10 = ((int) rectF.left) + L2 + paddingLeft;
                        int i11 = ((int) rectF.top) + L2;
                        imageView3.layout(i10, i11, imageView3.getMeasuredWidth() + i10, imageView3.getMeasuredHeight() + i11);
                        float f = 1.0f;
                        if (this.I) {
                            int left = (imageView2.getVisibility() == 0 ? imageView2.getLeft() : imageView.getLeft()) - hl.L(4.0f);
                            if (imageView3.getMeasuredWidth() + i10 > left) {
                                f = bp1.x(r9 - left, imageView3.getMeasuredWidth(), 1.0f, 0.0f);
                            }
                        }
                        imageView3.setAlpha(f);
                        imageView3.setVisibility(f > 0.01f ? 0 : 8);
                    }
                    i9++;
                }
            }
            imageView3.setVisibility(8);
            i9++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03ec A[LOOP:1: B:24:0x03e4->B:26:0x03ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0408 A[EDGE_INSN: B:27:0x0408->B:28:0x0408 BREAK  A[LOOP:1: B:24:0x03e4->B:26:0x03ec], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x039a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        j47[] j47VarArr;
        int round;
        int i10;
        j47[] j47VarArr2;
        int i11;
        float[] fArr;
        int i12;
        p07 p07Var;
        int i13;
        int i14;
        p07 p07Var2;
        int i15;
        int i16;
        int L;
        int i17;
        int i18;
        int size;
        int i19;
        ArrayList arrayList;
        int size2 = View.MeasureSpec.getSize(i);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int max = Math.max(0, (size2 - paddingLeft) - paddingRight);
        float f = n() ? 1.0f : 0.0f;
        mm mmVar = this.V;
        float e = mmVar.e(false, f);
        ArrayList arrayList2 = this.G;
        arrayList2.clear();
        int paddingTop = getPaddingTop();
        ArrayList arrayList3 = this.E;
        int size3 = arrayList3.size();
        int i20 = 1;
        if (size3 == 0) {
            i6 = (hl.L(200.0f) - getPaddingTop()) - getPaddingBottom();
            this.T = i6;
            this.R = i6;
            this.S = max;
            i4 = paddingLeft;
            i5 = paddingRight;
        } else {
            if (size3 != 1) {
                float[] fArr2 = new float[size3];
                int i21 = 0;
                while (i21 < size3) {
                    pj9 pj9Var = (pj9) arrayList3.get(i21);
                    p07 p07Var3 = pj9Var.e;
                    if (p07Var3 == null) {
                        i12 = i20;
                        p07Var = p07Var3;
                        i13 = 0;
                    } else {
                        boolean d = pj9Var.d();
                        i12 = i20;
                        p07Var = pj9Var.e;
                        i13 = d ? p07Var.k : p07Var.j;
                    }
                    if (p07Var == null) {
                        i14 = 0;
                    } else {
                        boolean d2 = pj9Var.d();
                        p07 p07Var4 = pj9Var.e;
                        i14 = d2 ? p07Var4.j : p07Var4.k;
                    }
                    fArr2[i21] = (i13 <= 0 || i14 <= 0) ? 1.0f : i13 / i14;
                    i21++;
                    i20 = i12;
                }
                i3 = i20;
                j47[] e2 = hl9.e(fArr2);
                int i22 = 0;
                for (j47 j47Var : e2) {
                    i22 = Math.max(i22, (int) j47Var.d);
                }
                int i23 = i22 + 1;
                float[] fArr3 = new float[i23];
                int length = e2.length;
                i4 = paddingLeft;
                int i24 = 0;
                while (i24 < length) {
                    int i25 = i24;
                    j47 j47Var2 = e2[i25];
                    int i26 = paddingRight;
                    byte b = j47Var2.c;
                    int i27 = i23;
                    if (b == j47Var2.d) {
                        fArr3[b] = Math.max(fArr3[b], j47Var2.f);
                    }
                    i24 = i25 + 1;
                    paddingRight = i26;
                    i23 = i27;
                }
                i5 = paddingRight;
                int i28 = i23;
                int length2 = e2.length;
                int i29 = 0;
                while (i29 < length2) {
                    j47 j47Var3 = e2[i29];
                    int i30 = j47Var3.c;
                    int i31 = length2;
                    byte b2 = j47Var3.d;
                    if (i30 != b2) {
                        int i32 = (b2 - i30) + 1;
                        i11 = i29;
                        float[] fArr4 = j47Var3.m;
                        if (fArr4 == null || fArr4.length != i32) {
                            fArr = fArr3;
                            float f2 = j47Var3.f / i32;
                            while (i30 <= j47Var3.d) {
                                fArr[i30] = Math.max(fArr[i30], f2);
                                i30++;
                            }
                            i29 = i11 + 1;
                            length2 = i31;
                            fArr3 = fArr;
                        } else {
                            int i33 = 0;
                            while (i33 < i32) {
                                int i34 = j47Var3.c + i33;
                                int i35 = i33;
                                float[] fArr5 = fArr3;
                                fArr5[i34] = Math.max(fArr3[i34], j47Var3.m[i35]);
                                i33 = i35 + 1;
                                fArr3 = fArr5;
                            }
                        }
                    } else {
                        i11 = i29;
                    }
                    fArr = fArr3;
                    i29 = i11 + 1;
                    length2 = i31;
                    fArr3 = fArr;
                }
                float[] fArr6 = fArr3;
                Point point = hl.q;
                float max2 = Math.max(point.x, point.y) * 0.5f;
                int[] iArr = new int[i22 + 2];
                float f3 = 0.0f;
                for (int i36 = 0; i36 <= i22; i36++) {
                    iArr[i36] = Math.round(f3 * max2);
                    f3 += fArr6[i36];
                }
                iArr[i28] = Math.round(f3 * max2);
                int L2 = hl.L(2.0f);
                int i37 = 0;
                while (i37 < e2.length) {
                    j47 j47Var4 = e2[i37];
                    int i38 = iArr[j47Var4.c];
                    int i39 = iArr[j47Var4.d + 1] - i38;
                    int i40 = L2;
                    if (j47Var4.j > 0) {
                        round = Math.round((r2 * max) / 1000.0f);
                        i9 = i39;
                        j47VarArr = e2;
                    } else {
                        i9 = i39;
                        int i41 = 0;
                        int i42 = 0;
                        while (i41 < e2.length) {
                            if (i41 == i37) {
                                i10 = i41;
                                j47VarArr2 = e2;
                            } else {
                                j47 j47Var5 = e2[i41];
                                i10 = i41;
                                byte b3 = j47Var5.c;
                                j47VarArr2 = e2;
                                byte b4 = j47Var4.c;
                                if (b3 <= b4 && j47Var5.d >= b4 && j47Var5.a < j47Var4.a) {
                                    i42 += j47Var5.e;
                                }
                            }
                            i41 = i10 + 1;
                            e2 = j47VarArr2;
                        }
                        j47VarArr = e2;
                        round = Math.round((i42 * max) / 1000.0f);
                    }
                    arrayList2.add(new RectF(round, i38 + paddingTop, Math.max(0, (j47Var4.l & 2) != 0 ? max - round : Math.round((j47Var4.e * max) / 1000.0f) - i40) + round, Math.max(0, (j47Var4.l & 8) == 0 ? i9 - i40 : i9) + r15));
                    i37++;
                    L2 = i40;
                    iArr = iArr;
                    e2 = j47VarArr;
                }
                this.R = iArr[i28];
                this.S = max;
                float f4 = 0.0f;
                for (int i43 = 0; i43 < size3; i43++) {
                    pj9 pj9Var2 = (pj9) arrayList3.get(i43);
                    p07 p07Var5 = pj9Var2.e;
                    if (p07Var5 == null) {
                        i7 = 0;
                    } else {
                        boolean d3 = pj9Var2.d();
                        p07 p07Var6 = pj9Var2.e;
                        i7 = d3 ? p07Var6.k : p07Var6.j;
                        p07Var5 = p07Var6;
                    }
                    if (p07Var5 == null) {
                        i8 = 0;
                    } else {
                        boolean d4 = pj9Var2.d();
                        p07 p07Var7 = pj9Var2.e;
                        i8 = d4 ? p07Var7.j : p07Var7.k;
                    }
                    f4 = ((i7 <= 0 || i8 <= 0) ? 1.0f : i7 / i8) + f4;
                }
                int max3 = (int) (this.S / Math.max(0.5f, f4 / size3));
                Point point2 = hl.q;
                int max4 = (int) (Math.max(point2.x, point2.y) * 0.55f);
                i6 = max3 > max4 ? max4 : max3;
                this.T = i6;
                this.Q = Math.round(hl.U1(e, this.R, i6));
                ArrayList arrayList4 = this.H;
                arrayList4.clear();
                size = arrayList3.size();
                if (size != 0) {
                    int paddingTop2 = getPaddingTop();
                    if (size == i3) {
                        arrayList4.add(new RectF((RectF) arrayList2.get(0)));
                    } else {
                        float f5 = (-this.b0) * this.S;
                        int i44 = 0;
                        while (i44 < size && i44 < arrayList2.size()) {
                            RectF rectF = (RectF) arrayList2.get(i44);
                            float f6 = ((i44 - this.a0) * this.S) + f5;
                            arrayList4.add(new RectF(hl.R1(rectF.left, f6, e), hl.R1(rectF.top, paddingTop2, e), hl.R1(rectF.right, f6 + this.S, e), hl.R1(rectF.bottom, this.T + paddingTop2, e)));
                            i44++;
                            size = size;
                        }
                    }
                }
                int L3 = nxe.b(this.a) <= 0 ? hl.L(16.0f) : 0;
                setMeasuredDimension(size2, getPaddingBottom() + getPaddingTop() + this.Q + this.w.h(i4 - L3, i5 - L3, size2));
                this.x.measure(View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), TLObject.FLAG_30));
                this.y.measure(View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), TLObject.FLAG_30));
                i19 = 0;
                while (true) {
                    arrayList = this.F;
                    if (i19 < arrayList.size()) {
                        break;
                    }
                    ((ImageView) arrayList.get(i19)).measure(View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), TLObject.FLAG_30));
                    i19++;
                }
                if (mmVar.i) {
                    return;
                }
                requestLayout();
                return;
            }
            pj9 pj9Var3 = (pj9) arrayList3.get(0);
            p07 p07Var8 = pj9Var3.e;
            if (p07Var8 == null) {
                p07Var2 = p07Var8;
                i15 = 0;
            } else {
                boolean d5 = pj9Var3.d();
                p07Var2 = pj9Var3.e;
                i15 = d5 ? p07Var2.k : p07Var2.j;
            }
            if (p07Var2 == null) {
                i16 = 0;
            } else {
                boolean d6 = pj9Var3.d();
                p07 p07Var9 = pj9Var3.e;
                i16 = d6 ? p07Var9.j : p07Var9.k;
            }
            if (i15 <= 0 || i16 <= 0) {
                L = (hl.L(200.0f) - getPaddingTop()) - getPaddingBottom();
                i17 = max;
            } else {
                i18 = (int) ((max / Math.max(1, i15)) * i16);
                Point point3 = hl.q;
                L = (int) (Math.max(point3.x, point3.y) * 0.55f);
                if (i18 > L) {
                    i17 = (int) ((L / Math.max(1, i16)) * i15);
                } else {
                    i17 = max;
                    arrayList2.add(new RectF((max - i17) / 2, paddingTop, r4 + i17, paddingTop + i18));
                    this.R = i18;
                    this.S = i17;
                    this.T = i18;
                    i4 = paddingLeft;
                    i5 = paddingRight;
                    i6 = i18;
                }
            }
            i18 = L;
            arrayList2.add(new RectF((max - i17) / 2, paddingTop, r4 + i17, paddingTop + i18));
            this.R = i18;
            this.S = i17;
            this.T = i18;
            i4 = paddingLeft;
            i5 = paddingRight;
            i6 = i18;
        }
        i3 = 1;
        this.Q = Math.round(hl.U1(e, this.R, i6));
        ArrayList arrayList42 = this.H;
        arrayList42.clear();
        size = arrayList3.size();
        if (size != 0) {
        }
        if (nxe.b(this.a) <= 0) {
        }
        setMeasuredDimension(size2, getPaddingBottom() + getPaddingTop() + this.Q + this.w.h(i4 - L3, i5 - L3, size2));
        this.x.measure(View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), TLObject.FLAG_30));
        this.y.measure(View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), TLObject.FLAG_30));
        i19 = 0;
        while (true) {
            arrayList = this.F;
            if (i19 < arrayList.size()) {
            }
            ((ImageView) arrayList.get(i19)).measure(View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), TLObject.FLAG_30));
            i19++;
        }
        if (mmVar.i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f4, code lost:
    
        if (r2 == 3) goto L70;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        boolean z = y >= ((float) getPaddingTop()) && y < ((float) (getPaddingTop() + this.Q));
        int i2 = -1;
        if (n() && !this.V.i) {
            ArrayList arrayList = this.E;
            if (arrayList.size() >= 2) {
                if (actionMasked == 0) {
                    if (!z) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (this.f0 == 0) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                        this.f0 = viewConfiguration.getScaledTouchSlop();
                        this.g0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.h0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    this.d0 = x;
                    this.e0 = y;
                    this.c0 = false;
                    VelocityTracker velocityTracker = this.i0;
                    if (velocityTracker == null) {
                        this.i0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    this.i0.addMovement(motionEvent);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    ValueAnimator valueAnimator = this.j0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.j0 = null;
                    }
                    this.U = this.a0;
                    return true;
                }
                float f = 0.0f;
                if (actionMasked != 2) {
                    if (actionMasked == 1) {
                        VelocityTracker velocityTracker2 = this.i0;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                            this.i0.computeCurrentVelocity(1000, this.h0);
                            float xVelocity = this.i0.getXVelocity();
                            float yVelocity = this.i0.getYVelocity();
                            if (Math.abs(xVelocity) >= this.g0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                                f = xVelocity;
                            }
                        }
                    }
                    VelocityTracker velocityTracker3 = this.i0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.recycle();
                        this.i0 = null;
                    }
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (this.c0) {
                        this.c0 = false;
                        settle(f);
                    } else if (actionMasked == 1) {
                        int i3 = this.U;
                        int i4 = this.a0;
                        if (i3 == i4) {
                            m(i4);
                        }
                    }
                    this.U = -1;
                    return true;
                }
                VelocityTracker velocityTracker4 = this.i0;
                if (velocityTracker4 != null) {
                    velocityTracker4.addMovement(motionEvent);
                }
                float f2 = x - this.d0;
                float f3 = y - this.e0;
                if (!this.c0 && Math.abs(f2) > this.f0 && Math.abs(f2) > Math.abs(f3)) {
                    this.c0 = true;
                    this.U = -1;
                }
                if (this.c0) {
                    float f4 = (-f2) / this.S;
                    int i5 = this.a0;
                    if (i5 == 0 && f4 < 0.0f) {
                        f4 *= 0.3f;
                    }
                    if (i5 == arrayList.size() - 1 && f4 > 0.0f) {
                        f4 *= 0.3f;
                    }
                    this.b0 = f4;
                    requestLayout();
                    invalidate();
                    return true;
                }
            }
        }
        ArrayList arrayList2 = this.H;
        if (actionMasked == 0) {
            if (!z) {
                return super.onTouchEvent(motionEvent);
            }
            while (true) {
                if (i >= arrayList2.size()) {
                    break;
                }
                if (((RectF) arrayList2.get(i)).contains(x, y)) {
                    i2 = i;
                    break;
                }
                i++;
            }
            this.U = i2;
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 3) {
                this.U = -1;
            }
            return super.onTouchEvent(motionEvent);
        }
        if (z) {
            int i6 = 0;
            while (true) {
                if (i6 >= arrayList2.size()) {
                    i6 = -1;
                    break;
                }
                if (((RectF) arrayList2.get(i6)).contains(x, y)) {
                    break;
                }
                i6++;
            }
            int i7 = this.U;
            if (i6 == i7) {
                m(i7);
            }
        }
        boolean z2 = this.U != -1 || z;
        this.U = -1;
        return z2 || super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p() {
        ArrayList arrayList;
        ArrayList arrayList2;
        List o = o();
        while (true) {
            arrayList = this.E;
            if (arrayList.size() >= o.size()) {
                break;
            }
            pj9 pj9Var = new pj9(this, this.n);
            if (this.P) {
                pj9Var.a.I();
                pj9Var.b.I();
                pj9Var.a();
            }
            arrayList.add(pj9Var);
        }
        while (arrayList.size() > o.size()) {
            pj9 pj9Var2 = (pj9) qd4.l(1, arrayList);
            pj9Var2.a.K();
            pj9Var2.b.K();
            pj9Var2.c = null;
        }
        Object[] objArr = 0;
        for (int i = 0; i < o.size(); i++) {
            pj9 pj9Var3 = (pj9) arrayList.get(i);
            pj9Var3.e = (p07) o.get(i);
            pj9Var3.a();
        }
        while (true) {
            arrayList2 = this.F;
            if (arrayList2.size() >= o.size()) {
                break;
            }
            ImageView g = g();
            g.setImageResource(R.drawable.iv_media_dots);
            g.setOnClickListener(new jj9(this, objArr == true ? 1 : 0));
            addView(g, tre.e(32, 32, 51));
            arrayList2.add(g);
        }
        this.x.bringToFront();
        this.y.bringToFront();
        while (arrayList2.size() > o.size()) {
            ImageView imageView = (ImageView) qd4.l(1, arrayList2);
            removeView(imageView);
            this.L.remove(imageView);
            this.M.remove(imageView);
        }
        if (this.N != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                p07 p07Var = ((pj9) arrayList.get(i2)).e;
                if (p07Var != null && p07Var.n) {
                    return;
                }
            }
            this.N.b(this);
            this.N = null;
        }
    }

    public final void q(boolean z) {
        boolean z2 = this.E.size() >= 2;
        int i = z2 ? 0 : 8;
        ImageView imageView = this.y;
        imageView.setVisibility(i);
        if (z2) {
            int i2 = n() ? R.drawable.iv_media_slideshow : R.drawable.iv_media_collage;
            if (i2 == this.W) {
                return;
            }
            this.W = i2;
            if (z) {
                hl.L3(imageView, i2);
            } else {
                imageView.setImageResource(i2);
            }
        }
    }

    @Override // snb
    public final void updateColors() {
        int i = aob.xe;
        vnb vnbVar = this.n;
        this.r.setColor(aob.v0(i, vnbVar));
        this.s.setColor(aob.v0(aob.lg, vnbVar));
        if9 if9Var = this.w;
        if (if9Var != null) {
            if9Var.a();
        }
    }
}
