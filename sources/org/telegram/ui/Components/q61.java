package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class q61 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public long K;
    public ValueAnimator L;
    public boolean M;
    public boolean N;
    public final TLRPC.StickerSetCovered O;
    public final org.telegram.ui.ActionBar.u6 P;
    public float Q;
    public final Paint R;
    public final int a;
    public final n61 b;
    public final TLRPC.StickerSetCovered[] c;
    public final LongSparseArray d;
    public final LongSparseArray e;
    public final View f;
    public final f61 h;
    public final g61 n;
    public final h61 r;
    public final p61 s;
    public final ig.d2 v;
    public final FrameLayout w;
    public org.telegram.ui.ActionBar.r2 x;
    public s4.u0 y;

    public q61(Context context, final n61 n61Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.a = i10;
        this.Q = 1.0f;
        this.R = new Paint();
        this.b = n61Var;
        this.c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.e = longSparseArray2;
        this.O = stickerSetCovered;
        this.P = u6Var;
        p61 p61Var = new p61(this, context);
        this.s = p61Var;
        this.v = new ig.d2(context, new e61(this, n61Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, u6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.h5, frameLayout, u6Var);
        f61 f61Var = new f61(this, context, u6Var);
        this.h = f61Var;
        f61Var.setHint(LocaleController.getString(R.string.SearchTrendingStickersHint));
        frameLayout.addView(f61Var, kb1.i(-1, -1, 48));
        g61 g61Var = new g61(this, context, n61Var);
        this.n = g61Var;
        final j jVar = new j(this, 19);
        g61Var.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.d61
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                j jVar2 = jVar;
                return n61Var.e(q61.this.n, jVar2, motionEvent);
            }
        });
        g61Var.setOverScrollMode(2);
        g61Var.setClipToPadding(false);
        g61Var.setItemAnimator(null);
        g61Var.setLayoutAnimation(null);
        h61 h61Var = new h61(this, AndroidUtilities.dp(58.0f), g61Var);
        this.r = h61Var;
        g61Var.setLayoutManager(h61Var);
        h61Var.O = new i61(this);
        g61Var.setOnScrollListener(new j61(this));
        g61Var.setAdapter(p61Var);
        g61Var.setOnItemClickListener(jVar);
        addView(g61Var, kb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.V5, view, u6Var);
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight());
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, kb1.i(-1, 58, 51));
        d();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i10);
        notificationCenter.addWeakObserver(this, NotificationCenter.stickersDidLoad);
        notificationCenter.addWeakObserver(this, NotificationCenter.featuredStickersDidLoad);
    }

    private void setShadowVisible(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            org.telegram.messenger.wh.p(this.f.animate(), z10 ? 1.0f : 0.0f, 200L);
        }
    }

    public final void a(boolean z10) {
        this.M = z10;
        if (!z10) {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.L.cancel();
                this.L = null;
                return;
            }
            return;
        }
        if (getContentTopOffset() <= 0 || this.L != null) {
            return;
        }
        int contentTopOffset = getContentTopOffset();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.L = ofFloat;
        ofFloat.addUpdateListener(new m61(this, contentTopOffset));
        this.L.addListener(new i31(this, 3));
        this.L.setDuration(250L);
        this.L.setInterpolator(org.telegram.ui.ActionBar.q1.w);
        this.L.start();
    }

    public final void b(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet) {
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.id = stickerSet.id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            n61 n61Var = this.b;
            n61Var.getClass();
            dz0 dz0Var = new dz0(getContext(), this.x, inputStickerSet2, null, n61Var instanceof kx ? new k61(this) : null, this.P);
            dz0Var.j0 = false;
            dz0Var.c0 = new l61(this, inputStickerSet2);
            this.x.showDialog(dz0Var);
        }
    }

    public final boolean c() {
        g61 g61Var = this.n;
        int childCount = g61Var.getChildCount();
        View view = this.f;
        FrameLayout frameLayout = this.w;
        if (childCount <= 0) {
            int paddingTop = g61Var.getPaddingTop();
            this.E = paddingTop;
            g61Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.E);
            view.setTranslationY(this.E);
            setShadowVisible(false);
            return true;
        }
        View childAt = g61Var.getChildAt(0);
        for (int i10 = 1; i10 < g61Var.getChildCount(); i10++) {
            View childAt2 = g61Var.getChildAt(i10);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        wl0 wl0Var = (wl0) g61Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(58.0f);
        int i11 = (top <= 0 || wl0Var == null || wl0Var.b() != 0) ? 0 : top;
        setShadowVisible(top < 0);
        if (this.E == i11) {
            return false;
        }
        this.E = i11;
        g61Var.setTopGlowOffset(AndroidUtilities.dp(58.0f) + i11);
        frameLayout.setTranslationY(this.E);
        view.setTranslationY(this.E);
        return true;
    }

    public final void d() {
        g61 g61Var = this.n;
        s4.h0 adapter = g61Var.getAdapter();
        p61 p61Var = this.s;
        if (adapter == p61Var) {
            p61Var.getClass();
            return;
        }
        this.v.getClass();
        int childCount = g61Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = g61Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s8) {
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) childAt;
                s8Var.d();
                s8Var.e();
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.stickersDidLoad;
        g61 g61Var = this.n;
        p61 p61Var = this.s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (!this.J) {
                    p61Var.G();
                    return;
                }
                s4.h0 adapter = g61Var.getAdapter();
                if (adapter != null) {
                    adapter.r(0, adapter.h(), 0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.featuredStickersDidLoad) {
            if (this.K != MediaDataController.getInstance(this.a).getFeaturedStickersHashWithoutUnread(false)) {
                this.J = false;
            }
            if (!this.J) {
                p61Var.G();
                return;
            }
            s4.h0 adapter2 = g61Var.getAdapter();
            if (adapter2 != null) {
                adapter2.r(0, adapter2.h(), 0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        TLRPC.StickerSetCovered stickerSetCovered;
        int i10;
        int i11;
        float f7 = this.Q;
        if (f7 != 0.0f && (stickerSetCovered = this.O) != null) {
            float f10 = f7 - 0.0053333333f;
            this.Q = f10;
            if (f10 < 0.0f) {
                this.Q = 0.0f;
            } else {
                invalidate();
            }
            Integer num = (Integer) this.s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                h61 h61Var = this.r;
                View m10 = h61Var.m(intValue);
                if (m10 != null) {
                    i10 = (int) m10.getY();
                    i11 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                View m11 = h61Var.m(num.intValue() + 1);
                if (m11 != null) {
                    if (m10 == null) {
                        i10 = (int) m11.getY();
                    }
                    i11 = m11.getMeasuredHeight() + ((int) m11.getY());
                }
                if (m10 != null || m11 != null) {
                    int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false);
                    Paint paint = this.R;
                    paint.setColor(x02);
                    float f11 = this.Q;
                    paint.setAlpha((int) ((f11 < 0.06f ? f11 / 0.06f : 1.0f) * 25.5f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, i10, getMeasuredWidth(), i11, paint);
                    super.dispatchDraw(canvas2);
                }
            }
        }
        canvas2 = canvas;
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.F = false;
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!this.F) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.n.dispatchTouchEvent(obtain);
            obtain.recycle();
        }
        return dispatchTouchEvent;
    }

    public int getContentTopOffset() {
        return this.E;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.n.getAdapter().m(r2.h() - 1);
        this.I = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Integer num;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.I) {
            return;
        }
        this.I = true;
        p61 p61Var = this.s;
        p61Var.G();
        TLRPC.StickerSetCovered stickerSetCovered = this.O;
        if (stickerSetCovered == null || (num = (Integer) p61Var.h.get(stickerSetCovered)) == null) {
            return;
        }
        this.r.h1(num.intValue(), AndroidUtilities.dp(58.0f) + (-this.n.getPaddingTop()));
    }

    public void setContentViewPaddingTop(int i10) {
        int dp = AndroidUtilities.dp(58.0f) + i10;
        g61 g61Var = this.n;
        if (g61Var.getPaddingTop() != dp) {
            this.H = true;
            g61Var.setPadding(0, dp, 0, 0);
            this.H = false;
        }
    }

    public void setOnScrollListener(s4.u0 u0Var) {
        this.y = u0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.r2 r2Var) {
        this.x = r2Var;
    }
}
