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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class e51 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public final org.telegram.ui.ActionBar.e6 P;
    public float Q;
    public final Paint R;
    public final int a;
    public final b51 b;
    public final TLRPC.StickerSetCovered[] c;
    public final LongSparseArray d;
    public final LongSparseArray e;
    public final View f;
    public final t41 h;
    public final u41 n;
    public final v41 r;
    public final d51 s;
    public final gg.g2 v;
    public final FrameLayout w;
    public org.telegram.ui.ActionBar.n2 x;
    public s4.s0 y;

    public e51(Context context, final b51 b51Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.a = i10;
        this.Q = 1.0f;
        this.R = new Paint();
        this.b = b51Var;
        this.c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.e = longSparseArray2;
        this.O = stickerSetCovered;
        this.P = e6Var;
        d51 d51Var = new d51(this, context);
        this.s = d51Var;
        this.v = new gg.g2(context, new s41(this, b51Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, e6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.h5, e6Var));
        t41 t41Var = new t41(this, context, e6Var);
        this.h = t41Var;
        t41Var.setHint(LocaleController.getString(R.string.SearchTrendingStickersHint));
        frameLayout.addView(t41Var, w7.x5.e(-1, -1, 48));
        u41 u41Var = new u41(this, context, b51Var);
        this.n = u41Var;
        final j jVar = new j(this, 19);
        u41Var.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.r41
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                j jVar2 = jVar;
                return b51Var.e(e51.this.n, jVar2, motionEvent);
            }
        });
        u41Var.setOverScrollMode(2);
        u41Var.setClipToPadding(false);
        u41Var.setItemAnimator(null);
        u41Var.setLayoutAnimation(null);
        v41 v41Var = new v41(this, AndroidUtilities.dp(58.0f), u41Var);
        this.r = v41Var;
        u41Var.setLayoutManager(v41Var);
        v41Var.O = new w41(this);
        u41Var.setOnScrollListener(new x41(this));
        u41Var.setAdapter(d51Var);
        u41Var.setOnItemClickListener(jVar);
        addView(u41Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.V5, e6Var));
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight());
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, w7.x5.e(-1, 58, 51));
        d();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i10);
        notificationCenter.addObserver(this, NotificationCenter.stickersDidLoad);
        notificationCenter.addObserver(this, NotificationCenter.featuredStickersDidLoad);
    }

    private void setShadowVisible(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            this.f.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(200L).start();
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
        ofFloat.addUpdateListener(new a51(this, contentTopOffset));
        this.L.addListener(new jd0(this, 25));
        this.L.setDuration(250L);
        this.L.setInterpolator(org.telegram.ui.ActionBar.p1.w);
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
            b51 b51Var = this.b;
            b51Var.getClass();
            vx0 vx0Var = new vx0(getContext(), this.x, inputStickerSet2, null, b51Var instanceof ex ? new y41(this) : null, this.P);
            vx0Var.j0 = false;
            vx0Var.c0 = new z41(this, inputStickerSet2);
            this.x.showDialog(vx0Var);
        }
    }

    public final boolean c() {
        u41 u41Var = this.n;
        int childCount = u41Var.getChildCount();
        View view = this.f;
        FrameLayout frameLayout = this.w;
        if (childCount <= 0) {
            int paddingTop = u41Var.getPaddingTop();
            this.E = paddingTop;
            u41Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.E);
            view.setTranslationY(this.E);
            setShadowVisible(false);
            return true;
        }
        View childAt = u41Var.getChildAt(0);
        for (int i10 = 1; i10 < u41Var.getChildCount(); i10++) {
            View childAt2 = u41Var.getChildAt(i10);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        vk0 vk0Var = (vk0) u41Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(58.0f);
        int i11 = (top <= 0 || vk0Var == null || vk0Var.b() != 0) ? 0 : top;
        setShadowVisible(top < 0);
        if (this.E == i11) {
            return false;
        }
        this.E = i11;
        u41Var.setTopGlowOffset(AndroidUtilities.dp(58.0f) + i11);
        frameLayout.setTranslationY(this.E);
        view.setTranslationY(this.E);
        return true;
    }

    public final void d() {
        u41 u41Var = this.n;
        s4.h0 adapter = u41Var.getAdapter();
        d51 d51Var = this.s;
        if (adapter != d51Var) {
            this.v.getClass();
            int childCount = u41Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = u41Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s3) {
                    ((org.telegram.ui.Cells.s3) childAt).d();
                } else if (childAt instanceof org.telegram.ui.Cells.o8) {
                    org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) childAt;
                    o8Var.e();
                    o8Var.f();
                }
            }
            return;
        }
        d51Var.getClass();
        int childCount2 = u41Var.getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = u41Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.s3) {
                ((org.telegram.ui.Cells.s3) childAt2).d();
            } else if (childAt2 instanceof org.telegram.ui.Cells.o3) {
                xh0 xh0Var = ((org.telegram.ui.Cells.o3) childAt2).e;
                xh0Var.setProgressColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Nh, false));
                int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Oh, false);
                org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Qh, false);
                xh0Var.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{14.0f}, w02));
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.stickersDidLoad;
        u41 u41Var = this.n;
        d51 d51Var = this.s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (!this.J) {
                    d51Var.G();
                    return;
                }
                s4.h0 adapter = u41Var.getAdapter();
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
                d51Var.G();
                return;
            }
            s4.h0 adapter2 = u41Var.getAdapter();
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
                v41 v41Var = this.r;
                View m10 = v41Var.m(intValue);
                if (m10 != null) {
                    i10 = (int) m10.getY();
                    i11 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                View m11 = v41Var.m(num.intValue() + 1);
                if (m11 != null) {
                    if (m10 == null) {
                        i10 = (int) m11.getY();
                    }
                    i11 = m11.getMeasuredHeight() + ((int) m11.getY());
                }
                if (m10 != null || m11 != null) {
                    int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Oh, false);
                    Paint paint = this.R;
                    paint.setColor(w02);
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
        d51 d51Var = this.s;
        d51Var.G();
        TLRPC.StickerSetCovered stickerSetCovered = this.O;
        if (stickerSetCovered == null || (num = (Integer) d51Var.h.get(stickerSetCovered)) == null) {
            return;
        }
        this.r.h1(num.intValue(), AndroidUtilities.dp(58.0f) + (-this.n.getPaddingTop()));
    }

    public void setContentViewPaddingTop(int i10) {
        int dp = AndroidUtilities.dp(58.0f) + i10;
        u41 u41Var = this.n;
        if (u41Var.getPaddingTop() != dp) {
            this.H = true;
            u41Var.setPadding(0, dp, 0, 0);
            this.H = false;
        }
    }

    public void setOnScrollListener(s4.s0 s0Var) {
        this.y = s0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        this.x = n2Var;
    }
}
