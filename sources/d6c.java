// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class d6c extends FrameLayout implements fn7 {
    public v79 E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public long L;
    public ValueAnimator M;
    public boolean N;
    public boolean O;
    public final TLRPC.StickerSetCovered P;
    public final vnb Q;
    public float R;
    public final Paint S;
    public final int a;
    public final z5c b;
    public final TLRPC.StickerSetCovered[] c;
    public final LongSparseArray d;
    public final LongSparseArray e;
    public final View f;
    public final r5c h;
    public final s5c n;
    public final t5c r;
    public final c6c s;
    public final z4b w;
    public final FrameLayout x;
    public e y;

    public d6c(Context context, final z5c z5cVar, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, vnb vnbVar) {
        super(context);
        int i = yac.t0;
        this.a = i;
        this.R = 1.0f;
        this.S = new Paint();
        this.b = z5cVar;
        this.c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.e = longSparseArray2;
        this.P = stickerSetCovered;
        this.Q = vnbVar;
        c6c c6cVar = new c6c(this, context);
        this.s = c6cVar;
        this.w = new z4b(context, new q5c(this, z5cVar), stickerSetCoveredArr, longSparseArray, longSparseArray2, vnbVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        yob.h(aob.h5, vnbVar, frameLayout);
        r5c r5cVar = new r5c(this, context, vnbVar);
        this.h = r5cVar;
        r5cVar.setHint(ob6.M0(2131745433, null));
        frameLayout.addView(r5cVar, tre.e(-1, -1, 48));
        s5c s5cVar = new s5c(this, context, z5cVar);
        this.n = s5cVar;
        final t39 t39Var = new t39(this, (byte) 27);
        s5cVar.setOnTouchListener(new View.OnTouchListener() { // from class: p5c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                t39 t39Var2 = t39Var;
                return z5cVar.e(d6c.this.n, t39Var2, motionEvent);
            }
        });
        s5cVar.setOverScrollMode(2);
        s5cVar.setClipToPadding(false);
        s5cVar.setItemAnimator(null);
        s5cVar.setLayoutAnimation(null);
        t5c t5cVar = new t5c(this, hl.L(58.0f), s5cVar);
        this.r = t5cVar;
        s5cVar.setLayoutManager(t5cVar);
        t5cVar.O = new u5c(this);
        s5cVar.setOnScrollListener(new v5c(this));
        s5cVar.setAdapter(c6cVar);
        s5cVar.setOnItemClickListener(t39Var);
        addView(s5cVar, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        yob.h(aob.V5, vnbVar, view);
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, hl.e1());
        layoutParams.topMargin = hl.L(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, tre.e(-1, 58, 51));
        d();
        jn7 f = jn7.f(i);
        f.b(this, jn7.x0);
        f.b(this, jn7.z0);
    }

    private void setShadowVisible(boolean z) {
        if (this.H != z) {
            this.H = z;
            ik8.s(this.f.animate(), z ? 1.0f : 0.0f, 200L);
        }
    }

    public final void a(boolean z) {
        this.N = z;
        if (!z) {
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.M.cancel();
                this.M = null;
                return;
            }
            return;
        }
        if (getContentTopOffset() <= 0 || this.M != null) {
            return;
        }
        int contentTopOffset = getContentTopOffset();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.M = ofFloat;
        ofFloat.addUpdateListener(new y5c(this, contentTopOffset));
        this.M.addListener(new omb(this, (byte) 9));
        this.M.setDuration(250L);
        this.M.setInterpolator(hb.w);
        this.M.start();
    }

    public final void b(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet) {
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.id = stickerSet.id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            z5c z5cVar = this.b;
            z5cVar.getClass();
            s4b s4bVar = new s4b(getContext(), this.y, inputStickerSet2, null, z5cVar instanceof j04 ? new w5c(this) : null, this.Q);
            s4bVar.d2 = false;
            s4bVar.W1 = new x5c(this, inputStickerSet2);
            this.y.showDialog(s4bVar);
        }
    }

    public final boolean c() {
        s5c s5cVar = this.n;
        int childCount = s5cVar.getChildCount();
        View view = this.f;
        FrameLayout frameLayout = this.x;
        if (childCount <= 0) {
            int paddingTop = s5cVar.getPaddingTop();
            this.F = paddingTop;
            s5cVar.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.F);
            view.setTranslationY(this.F);
            setShadowVisible(false);
            return true;
        }
        View childAt = s5cVar.getChildAt(0);
        for (int i = 1; i < s5cVar.getChildCount(); i++) {
            View childAt2 = s5cVar.getChildAt(i);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        n69 n69Var = (n69) s5cVar.H(childAt);
        int top = childAt.getTop() - hl.L(58.0f);
        int i2 = (top <= 0 || n69Var == null || n69Var.b() != 0) ? 0 : top;
        setShadowVisible(top < 0);
        if (this.F == i2) {
            return false;
        }
        this.F = i2;
        s5cVar.setTopGlowOffset(hl.L(58.0f) + i2);
        frameLayout.setTranslationY(this.F);
        view.setTranslationY(this.F);
        return true;
    }

    public final void d() {
        s5c s5cVar = this.n;
        j79 adapter = s5cVar.getAdapter();
        c6c c6cVar = this.s;
        if (adapter == c6cVar) {
            c6cVar.getClass();
            return;
        }
        this.w.getClass();
        int childCount = s5cVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = s5cVar.getChildAt(i);
            if (childAt instanceof t3b) {
                t3b t3bVar = (t3b) childAt;
                t3bVar.d();
                t3bVar.e();
            }
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.x0;
        s5c s5cVar = this.n;
        c6c c6cVar = this.s;
        if (i == i3) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (!this.K) {
                    c6cVar.G();
                    return;
                }
                j79 adapter = s5cVar.getAdapter();
                if (adapter != null) {
                    adapter.n(0, adapter.b(), 0);
                    return;
                }
                return;
            }
            return;
        }
        if (i == jn7.z0) {
            if (this.L != ls6.d0(this.a).Z()) {
                this.K = false;
            }
            if (!this.K) {
                c6cVar.G();
                return;
            }
            j79 adapter2 = s5cVar.getAdapter();
            if (adapter2 != null) {
                adapter2.n(0, adapter2.b(), 0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        TLRPC.StickerSetCovered stickerSetCovered;
        int i;
        int i2;
        float f = this.R;
        if (f != 0.0f && (stickerSetCovered = this.P) != null) {
            float f2 = f - 0.0053333333f;
            this.R = f2;
            if (f2 < 0.0f) {
                this.R = 0.0f;
            } else {
                invalidate();
            }
            Integer num = (Integer) this.s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                t5c t5cVar = this.r;
                View m = t5cVar.m(intValue);
                if (m != null) {
                    i = (int) m.getY();
                    i2 = m.getMeasuredHeight() + ((int) m.getY());
                } else {
                    i = -1;
                    i2 = -1;
                }
                View m2 = t5cVar.m(num.intValue() + 1);
                if (m2 != null) {
                    if (m == null) {
                        i = (int) m2.getY();
                    }
                    i2 = m2.getMeasuredHeight() + ((int) m2.getY());
                }
                if (m != null || m2 != null) {
                    int w0 = aob.w0(null, aob.Fi, false);
                    Paint paint = this.S;
                    paint.setColor(w0);
                    float f3 = this.R;
                    paint.setAlpha((int) ((f3 < 0.06f ? f3 / 0.06f : 1.0f) * 25.5f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, i, getMeasuredWidth(), i2, paint);
                    super.dispatchDraw(canvas2);
                }
            }
        }
        canvas2 = canvas;
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.G = false;
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!this.G) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.n.dispatchTouchEvent(obtain);
            obtain.recycle();
        }
        return dispatchTouchEvent;
    }

    public int getContentTopOffset() {
        return this.F;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.n.getAdapter().g(r2.b() - 1);
        this.J = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Integer num;
        super.onLayout(z, i, i2, i3, i4);
        if (this.J) {
            return;
        }
        this.J = true;
        c6c c6cVar = this.s;
        c6cVar.G();
        TLRPC.StickerSetCovered stickerSetCovered = this.P;
        if (stickerSetCovered == null || (num = (Integer) c6cVar.h.get(stickerSetCovered)) == null) {
            return;
        }
        this.r.g1(num.intValue(), hl.L(58.0f) + (-this.n.getPaddingTop()));
    }

    public void setContentViewPaddingTop(int i) {
        int L = hl.L(58.0f) + i;
        s5c s5cVar = this.n;
        if (s5cVar.getPaddingTop() != L) {
            this.I = true;
            s5cVar.setPadding(0, L, 0, 0);
            this.I = false;
        }
    }

    public void setOnScrollListener(v79 v79Var) {
        this.E = v79Var;
    }

    public void setParentFragment(e eVar) {
        this.y = eVar;
    }
}
