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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class e51 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public final org.telegram.ui.ActionBar.f6 M;
    public float N;
    public final Paint O;
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
    public final tf.m1 v;
    public final FrameLayout w;
    public org.telegram.ui.ActionBar.p2 x;
    public f2.z0 y;

    public e51(Context context, final b51 b51Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.a = i10;
        this.N = 1.0f;
        this.O = new Paint();
        this.b = b51Var;
        this.c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.e = longSparseArray2;
        this.L = stickerSetCovered;
        this.M = f6Var;
        d51 d51Var = new d51(this, context);
        this.s = d51Var;
        this.v = new tf.m1(context, new s41(this, b51Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, f6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        t41 t41Var = new t41(this, context, f6Var);
        this.h = t41Var;
        t41Var.setHint(LocaleController.getString(R.string.SearchTrendingStickersHint));
        frameLayout.addView(t41Var, k7.b6.e(-1, -1, 48));
        u41 u41Var = new u41(this, context, b51Var);
        this.n = u41Var;
        final k kVar = new k(this, 19);
        u41Var.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.r41
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar2 = kVar;
                return b51Var.e(e51.this.n, kVar2, motionEvent);
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
        u41Var.setOnItemClickListener(kVar);
        addView(u41Var, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.V5, f6Var));
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight());
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, k7.b6.e(-1, 58, 51));
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
        ofFloat.addUpdateListener(new a51(this, contentTopOffset));
        this.I.addListener(new nd0(this, 24));
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
            b51 b51Var = this.b;
            b51Var.getClass();
            xx0 xx0Var = new xx0(getContext(), this.x, inputStickerSet2, null, b51Var instanceof cx ? new y41(this) : null, this.M);
            xx0Var.g0 = false;
            xx0Var.Z = new z41(this, inputStickerSet2);
            this.x.showDialog(xx0Var);
        }
    }

    public final boolean c() {
        u41 u41Var = this.n;
        int childCount = u41Var.getChildCount();
        View view = this.f;
        FrameLayout frameLayout = this.w;
        if (childCount <= 0) {
            int paddingTop = u41Var.getPaddingTop();
            this.B = paddingTop;
            u41Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.B);
            view.setTranslationY(this.B);
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
        el0 el0Var = (el0) u41Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(58.0f);
        int i11 = (top <= 0 || el0Var == null || el0Var.b() != 0) ? 0 : top;
        setShadowVisible(top < 0);
        if (this.B == i11) {
            return false;
        }
        this.B = i11;
        u41Var.setTopGlowOffset(AndroidUtilities.dp(58.0f) + i11);
        frameLayout.setTranslationY(this.B);
        view.setTranslationY(this.B);
        return true;
    }

    public final void d() {
        u41 u41Var = this.n;
        f2.o0 adapter = u41Var.getAdapter();
        d51 d51Var = this.s;
        if (adapter != d51Var) {
            this.v.getClass();
            int childCount = u41Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = u41Var.getChildAt(i10);
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
        d51Var.getClass();
        int childCount2 = u41Var.getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = u41Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.r3) {
                ((org.telegram.ui.Cells.r3) childAt2).d();
            } else if (childAt2 instanceof org.telegram.ui.Cells.o3) {
                ei0 ei0Var = ((org.telegram.ui.Cells.o3) childAt2).e;
                ei0Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Nh, false));
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                ei0Var.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{14.0f}, w02));
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
                if (!this.G) {
                    d51Var.G();
                    return;
                }
                f2.o0 adapter = u41Var.getAdapter();
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
                d51Var.G();
                return;
            }
            f2.o0 adapter2 = u41Var.getAdapter();
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
                v41 v41Var = this.r;
                View m9 = v41Var.m(intValue);
                if (m9 != null) {
                    i10 = (int) m9.getY();
                    i11 = m9.getMeasuredHeight() + ((int) m9.getY());
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                View m10 = v41Var.m(num.intValue() + 1);
                if (m10 != null) {
                    if (m9 == null) {
                        i10 = (int) m10.getY();
                    }
                    i11 = m10.getMeasuredHeight() + ((int) m10.getY());
                }
                if (m9 != null || m10 != null) {
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
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
        d51 d51Var = this.s;
        d51Var.G();
        TLRPC.StickerSetCovered stickerSetCovered = this.L;
        if (stickerSetCovered == null || (num = (Integer) d51Var.h.get(stickerSetCovered)) == null) {
            return;
        }
        this.r.h1(num.intValue(), AndroidUtilities.dp(58.0f) + (-this.n.getPaddingTop()));
    }

    public void setContentViewPaddingTop(int i10) {
        int dp = AndroidUtilities.dp(58.0f) + i10;
        u41 u41Var = this.n;
        if (u41Var.getPaddingTop() != dp) {
            this.E = true;
            u41Var.setPadding(0, dp, 0, 0);
            this.E = false;
        }
    }

    public void setOnScrollListener(f2.z0 z0Var) {
        this.y = z0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        this.x = p2Var;
    }
}
