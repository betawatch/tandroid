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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class f51 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public long H;
    public ValueAnimator I;
    public boolean J;
    public boolean K;
    public final TLRPC.StickerSetCovered L;
    public final org.telegram.ui.ActionBar.g6 M;
    public float N;
    public final Paint O;
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
    public final uf.m1 v;
    public final FrameLayout w;
    public org.telegram.ui.ActionBar.p2 x;
    public f2.a1 y;

    public f51(Context context, final c51 c51Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.a = i10;
        this.N = 1.0f;
        this.O = new Paint();
        this.b = c51Var;
        this.c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.e = longSparseArray2;
        this.L = stickerSetCovered;
        this.M = g6Var;
        e51 e51Var = new e51(this, context);
        this.s = e51Var;
        this.v = new uf.m1(context, new t41(this, c51Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, g6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, g6Var));
        u41 u41Var = new u41(this, context, g6Var);
        this.h = u41Var;
        u41Var.setHint(LocaleController.getString(R.string.SearchTrendingStickersHint));
        frameLayout.addView(u41Var, k7.c6.e(-1, -1, 48));
        v41 v41Var = new v41(this, context, c51Var);
        this.n = v41Var;
        final k kVar = new k(this, 19);
        v41Var.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.s41
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar2 = kVar;
                return c51Var.e(f51.this.n, kVar2, motionEvent);
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
        v41Var.setOnItemClickListener(kVar);
        addView(v41Var, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.V5, g6Var));
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight());
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, k7.c6.e(-1, 58, 51));
        d();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i10);
        notificationCenter.addObserver(this, NotificationCenter.stickersDidLoad);
        notificationCenter.addObserver(this, NotificationCenter.featuredStickersDidLoad);
    }

    private void setShadowVisible(boolean z4) {
        if (this.D != z4) {
            this.D = z4;
            this.f.animate().alpha(z4 ? 1.0f : 0.0f).setDuration(200L).start();
        }
    }

    public final void a(boolean z4) {
        this.J = z4;
        if (!z4) {
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
                this.I = null;
                return;
            }
            return;
        }
        if (getContentTopOffset() <= 0 || this.I != null) {
            return;
        }
        int contentTopOffset = getContentTopOffset();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.I = ofFloat;
        ofFloat.addUpdateListener(new b51(this, contentTopOffset));
        this.I.addListener(new pd0(this, 24));
        this.I.setDuration(250L);
        this.I.setInterpolator(org.telegram.ui.ActionBar.r1.w);
        this.I.start();
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
            yx0 yx0Var = new yx0(getContext(), this.x, inputStickerSet2, null, c51Var instanceof ex ? new z41(this) : null, this.M);
            yx0Var.g0 = false;
            yx0Var.Z = new a51(this, inputStickerSet2);
            this.x.showDialog(yx0Var);
        }
    }

    public final boolean c() {
        v41 v41Var = this.n;
        int childCount = v41Var.getChildCount();
        View view = this.f;
        FrameLayout frameLayout = this.w;
        if (childCount <= 0) {
            int paddingTop = v41Var.getPaddingTop();
            this.B = paddingTop;
            v41Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.B);
            view.setTranslationY(this.B);
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
        fl0 fl0Var = (fl0) v41Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(58.0f);
        int i11 = (top <= 0 || fl0Var == null || fl0Var.b() != 0) ? 0 : top;
        setShadowVisible(top < 0);
        if (this.B == i11) {
            return false;
        }
        this.B = i11;
        v41Var.setTopGlowOffset(AndroidUtilities.dp(58.0f) + i11);
        frameLayout.setTranslationY(this.B);
        view.setTranslationY(this.B);
        return true;
    }

    public final void d() {
        v41 v41Var = this.n;
        f2.p0 adapter = v41Var.getAdapter();
        e51 e51Var = this.s;
        if (adapter != e51Var) {
            this.v.getClass();
            int childCount = v41Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = v41Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r3) {
                    ((org.telegram.ui.Cells.r3) childAt).d();
                } else if (childAt instanceof org.telegram.ui.Cells.m8) {
                    org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) childAt;
                    m8Var.e();
                    m8Var.f();
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
                gi0 gi0Var = ((org.telegram.ui.Cells.o3) childAt2).e;
                gi0Var.setProgressColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Nh, false));
                int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false);
                org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qh, false);
                gi0Var.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{14.0f}, w02));
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
                if (!this.G) {
                    e51Var.G();
                    return;
                }
                f2.p0 adapter = v41Var.getAdapter();
                if (adapter != null) {
                    adapter.r(0, adapter.h(), 0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.featuredStickersDidLoad) {
            if (this.H != MediaDataController.getInstance(this.a).getFeaturedStickersHashWithoutUnread(false)) {
                this.G = false;
            }
            if (!this.G) {
                e51Var.G();
                return;
            }
            f2.p0 adapter2 = v41Var.getAdapter();
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
        float f10 = this.N;
        if (f10 != 0.0f && (stickerSetCovered = this.L) != null) {
            float f11 = f10 - 0.0053333333f;
            this.N = f11;
            if (f11 < 0.0f) {
                this.N = 0.0f;
            } else {
                invalidate();
            }
            Integer num = (Integer) this.s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                w41 w41Var = this.r;
                View m9 = w41Var.m(intValue);
                if (m9 != null) {
                    i10 = (int) m9.getY();
                    i11 = m9.getMeasuredHeight() + ((int) m9.getY());
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                View m10 = w41Var.m(num.intValue() + 1);
                if (m10 != null) {
                    if (m9 == null) {
                        i10 = (int) m10.getY();
                    }
                    i11 = m10.getMeasuredHeight() + ((int) m10.getY());
                }
                if (m9 != null || m10 != null) {
                    int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false);
                    Paint paint = this.O;
                    paint.setColor(w02);
                    float f12 = this.N;
                    paint.setAlpha((int) ((f12 < 0.06f ? f12 / 0.06f : 1.0f) * 25.5f));
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
        this.C = false;
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!this.C) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.n.dispatchTouchEvent(obtain);
            obtain.recycle();
        }
        return dispatchTouchEvent;
    }

    public int getContentTopOffset() {
        return this.B;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.n.getAdapter().m(r2.h() - 1);
        this.F = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        Integer num;
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.F) {
            return;
        }
        this.F = true;
        e51 e51Var = this.s;
        e51Var.G();
        TLRPC.StickerSetCovered stickerSetCovered = this.L;
        if (stickerSetCovered == null || (num = (Integer) e51Var.h.get(stickerSetCovered)) == null) {
            return;
        }
        this.r.h1(num.intValue(), AndroidUtilities.dp(58.0f) + (-this.n.getPaddingTop()));
    }

    public void setContentViewPaddingTop(int i10) {
        int dp = AndroidUtilities.dp(58.0f) + i10;
        v41 v41Var = this.n;
        if (v41Var.getPaddingTop() != dp) {
            this.E = true;
            v41Var.setPadding(0, dp, 0, 0);
            this.E = false;
        }
    }

    public void setOnScrollListener(f2.a1 a1Var) {
        this.y = a1Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        this.x = p2Var;
    }
}
