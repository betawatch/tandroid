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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class f51 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public final org.telegram.ui.ActionBar.f6 P;
    public float Q;
    public final Paint R;
    public final int a;
    public final c51 b;
    public final TLRPC.StickerSetCovered[] c;
    public final LongSparseArray d;
    public final LongSparseArray e;
    public final View f;
    public final u41 h;
    public final v41 n;
    public final w41 r;
    public final e51 s;
    public final gg.g2 v;
    public final FrameLayout w;
    public org.telegram.ui.ActionBar.o2 x;
    public s4.s0 y;

    public f51(Context context, final c51 c51Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.a = i10;
        this.Q = 1.0f;
        this.R = new Paint();
        this.b = c51Var;
        this.c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.e = longSparseArray2;
        this.O = stickerSetCovered;
        this.P = f6Var;
        e51 e51Var = new e51(this, context);
        this.s = e51Var;
        this.v = new gg.g2(context, new t41(this, c51Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, f6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        u41 u41Var = new u41(this, context, f6Var);
        this.h = u41Var;
        u41Var.setHint(LocaleController.getString(R.string.SearchTrendingStickersHint));
        frameLayout.addView(u41Var, w7.x5.e(-1, -1, 48));
        v41 v41Var = new v41(this, context, c51Var);
        this.n = v41Var;
        final j jVar = new j(this, 19);
        v41Var.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.s41
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                j jVar2 = jVar;
                return c51Var.e(f51.this.n, jVar2, motionEvent);
            }
        });
        v41Var.setOverScrollMode(2);
        v41Var.setClipToPadding(false);
        v41Var.setItemAnimator(null);
        v41Var.setLayoutAnimation(null);
        w41 w41Var = new w41(this, AndroidUtilities.dp(58.0f), v41Var);
        this.r = w41Var;
        v41Var.setLayoutManager(w41Var);
        w41Var.O = new x41(this);
        v41Var.setOnScrollListener(new y41(this));
        v41Var.setAdapter(e51Var);
        v41Var.setOnItemClickListener(jVar);
        addView(v41Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.V5, f6Var));
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
        ofFloat.addUpdateListener(new b51(this, contentTopOffset));
        this.L.addListener(new jd0(this, 25));
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
            c51 c51Var = this.b;
            c51Var.getClass();
            wx0 wx0Var = new wx0(getContext(), this.x, inputStickerSet2, null, c51Var instanceof ex ? new z41(this) : null, this.P);
            wx0Var.j0 = false;
            wx0Var.c0 = new a51(this, inputStickerSet2);
            this.x.showDialog(wx0Var);
        }
    }

    public final boolean c() {
        v41 v41Var = this.n;
        int childCount = v41Var.getChildCount();
        View view = this.f;
        FrameLayout frameLayout = this.w;
        if (childCount <= 0) {
            int paddingTop = v41Var.getPaddingTop();
            this.E = paddingTop;
            v41Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.E);
            view.setTranslationY(this.E);
            setShadowVisible(false);
            return true;
        }
        View childAt = v41Var.getChildAt(0);
        for (int i10 = 1; i10 < v41Var.getChildCount(); i10++) {
            View childAt2 = v41Var.getChildAt(i10);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        wk0 wk0Var = (wk0) v41Var.H(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(58.0f);
        int i11 = (top <= 0 || wk0Var == null || wk0Var.b() != 0) ? 0 : top;
        setShadowVisible(top < 0);
        if (this.E == i11) {
            return false;
        }
        this.E = i11;
        v41Var.setTopGlowOffset(AndroidUtilities.dp(58.0f) + i11);
        frameLayout.setTranslationY(this.E);
        view.setTranslationY(this.E);
        return true;
    }

    public final void d() {
        v41 v41Var = this.n;
        s4.h0 adapter = v41Var.getAdapter();
        e51 e51Var = this.s;
        if (adapter != e51Var) {
            this.v.getClass();
            int childCount = v41Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = v41Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r3) {
                    ((org.telegram.ui.Cells.r3) childAt).d();
                } else if (childAt instanceof org.telegram.ui.Cells.o8) {
                    org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) childAt;
                    o8Var.e();
                    o8Var.f();
                }
            }
            return;
        }
        e51Var.getClass();
        int childCount2 = v41Var.getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = v41Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.r3) {
                ((org.telegram.ui.Cells.r3) childAt2).d();
            } else if (childAt2 instanceof org.telegram.ui.Cells.o3) {
                yh0 yh0Var = ((org.telegram.ui.Cells.o3) childAt2).e;
                yh0Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Nh, false));
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                yh0Var.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{14.0f}, w02));
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.stickersDidLoad;
        v41 v41Var = this.n;
        e51 e51Var = this.s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (!this.J) {
                    e51Var.G();
                    return;
                }
                s4.h0 adapter = v41Var.getAdapter();
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
                e51Var.G();
                return;
            }
            s4.h0 adapter2 = v41Var.getAdapter();
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
                w41 w41Var = this.r;
                View m10 = w41Var.m(intValue);
                if (m10 != null) {
                    i10 = (int) m10.getY();
                    i11 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                View m11 = w41Var.m(num.intValue() + 1);
                if (m11 != null) {
                    if (m10 == null) {
                        i10 = (int) m11.getY();
                    }
                    i11 = m11.getMeasuredHeight() + ((int) m11.getY());
                }
                if (m10 != null || m11 != null) {
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
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
        e51 e51Var = this.s;
        e51Var.G();
        TLRPC.StickerSetCovered stickerSetCovered = this.O;
        if (stickerSetCovered == null || (num = (Integer) e51Var.h.get(stickerSetCovered)) == null) {
            return;
        }
        this.r.h1(num.intValue(), AndroidUtilities.dp(58.0f) + (-this.n.getPaddingTop()));
    }

    public void setContentViewPaddingTop(int i10) {
        int dp = AndroidUtilities.dp(58.0f) + i10;
        v41 v41Var = this.n;
        if (v41Var.getPaddingTop() != dp) {
            this.H = true;
            v41Var.setPadding(0, dp, 0, 0);
            this.H = false;
        }
    }

    public void setOnScrollListener(s4.s0 s0Var) {
        this.y = s0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        this.x = o2Var;
    }
}
