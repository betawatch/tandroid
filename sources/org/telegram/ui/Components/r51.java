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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class r51 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public final org.telegram.ui.ActionBar.d6 P;
    public float Q;
    public final Paint R;
    public final int a;
    public final o51 b;
    public final TLRPC.StickerSetCovered[] c;
    public final LongSparseArray d;
    public final LongSparseArray e;
    public final View f;
    public final g51 h;
    public final h51 n;
    public final i51 r;
    public final q51 s;
    public final gg.g2 v;
    public final FrameLayout w;
    public org.telegram.ui.ActionBar.m2 x;
    public s4.s0 y;

    public r51(Context context, final o51 o51Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.a = i10;
        this.Q = 1.0f;
        this.R = new Paint();
        this.b = o51Var;
        this.c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.e = longSparseArray2;
        this.O = stickerSetCovered;
        this.P = d6Var;
        q51 q51Var = new q51(this, context);
        this.s = q51Var;
        this.v = new gg.g2(context, new f51(this, o51Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, d6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.h5, d6Var));
        g51 g51Var = new g51(this, context, d6Var);
        this.h = g51Var;
        g51Var.setHint(LocaleController.getString(R.string.SearchTrendingStickersHint));
        frameLayout.addView(g51Var, w7.y5.e(-1, -1, 48));
        h51 h51Var = new h51(this, context, o51Var);
        this.n = h51Var;
        final j jVar = new j(this, 19);
        h51Var.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.e51
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                j jVar2 = jVar;
                return o51Var.e(r51.this.n, jVar2, motionEvent);
            }
        });
        h51Var.setOverScrollMode(2);
        h51Var.setClipToPadding(false);
        h51Var.setItemAnimator(null);
        h51Var.setLayoutAnimation(null);
        i51 i51Var = new i51(this, AndroidUtilities.dp(58.0f), h51Var);
        this.r = i51Var;
        h51Var.setLayoutManager(i51Var);
        i51Var.O = new j51(this);
        h51Var.setOnScrollListener(new k51(this));
        h51Var.setAdapter(q51Var);
        h51Var.setOnItemClickListener(jVar);
        addView(h51Var, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.V5, d6Var));
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight());
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, w7.y5.e(-1, 58, 51));
        d();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i10);
        notificationCenter.addObserver(this, NotificationCenter.stickersDidLoad);
        notificationCenter.addObserver(this, NotificationCenter.featuredStickersDidLoad);
    }

    private void setShadowVisible(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            org.telegram.messenger.ok.r(this.f.animate(), z10 ? 1.0f : 0.0f, 200L);
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
        ofFloat.addUpdateListener(new n51(this, contentTopOffset));
        this.L.addListener(new fd0(this, 26));
        this.L.setDuration(250L);
        this.L.setInterpolator(org.telegram.ui.ActionBar.o1.w);
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
            o51 o51Var = this.b;
            o51Var.getClass();
            fy0 fy0Var = new fy0(getContext(), this.x, inputStickerSet2, null, o51Var instanceof gx ? new l51(this) : null, this.P);
            fy0Var.j0 = false;
            fy0Var.c0 = new m51(this, inputStickerSet2);
            this.x.showDialog(fy0Var);
        }
    }

    public final boolean c() {
        h51 h51Var = this.n;
        int childCount = h51Var.getChildCount();
        View view = this.f;
        FrameLayout frameLayout = this.w;
        if (childCount <= 0) {
            int paddingTop = h51Var.getPaddingTop();
            this.E = paddingTop;
            h51Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.E);
            view.setTranslationY(this.E);
            setShadowVisible(false);
            return true;
        }
        View childAt = h51Var.getChildAt(0);
        for (int i10 = 1; i10 < h51Var.getChildCount(); i10++) {
            View childAt2 = h51Var.getChildAt(i10);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        gl0 gl0Var = (gl0) h51Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(58.0f);
        int i11 = (top <= 0 || gl0Var == null || gl0Var.b() != 0) ? 0 : top;
        setShadowVisible(top < 0);
        if (this.E == i11) {
            return false;
        }
        this.E = i11;
        h51Var.setTopGlowOffset(AndroidUtilities.dp(58.0f) + i11);
        frameLayout.setTranslationY(this.E);
        view.setTranslationY(this.E);
        return true;
    }

    public final void d() {
        h51 h51Var = this.n;
        s4.h0 adapter = h51Var.getAdapter();
        q51 q51Var = this.s;
        if (adapter != q51Var) {
            this.v.getClass();
            int childCount = h51Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = h51Var.getChildAt(i10);
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
        q51Var.getClass();
        int childCount2 = h51Var.getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = h51Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.s3) {
                ((org.telegram.ui.Cells.s3) childAt2).d();
            } else if (childAt2 instanceof org.telegram.ui.Cells.p3) {
                ii0 ii0Var = ((org.telegram.ui.Cells.p3) childAt2).e;
                ii0Var.setProgressColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Nh, false));
                int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false);
                org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Qh, false);
                ii0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, w02));
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.stickersDidLoad;
        h51 h51Var = this.n;
        q51 q51Var = this.s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (!this.J) {
                    q51Var.G();
                    return;
                }
                s4.h0 adapter = h51Var.getAdapter();
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
                q51Var.G();
                return;
            }
            s4.h0 adapter2 = h51Var.getAdapter();
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
                i51 i51Var = this.r;
                View m10 = i51Var.m(intValue);
                if (m10 != null) {
                    i10 = (int) m10.getY();
                    i11 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                View m11 = i51Var.m(num.intValue() + 1);
                if (m11 != null) {
                    if (m10 == null) {
                        i10 = (int) m11.getY();
                    }
                    i11 = m11.getMeasuredHeight() + ((int) m11.getY());
                }
                if (m10 != null || m11 != null) {
                    int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false);
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
        q51 q51Var = this.s;
        q51Var.G();
        TLRPC.StickerSetCovered stickerSetCovered = this.O;
        if (stickerSetCovered == null || (num = (Integer) q51Var.h.get(stickerSetCovered)) == null) {
            return;
        }
        this.r.h1(num.intValue(), AndroidUtilities.dp(58.0f) + (-this.n.getPaddingTop()));
    }

    public void setContentViewPaddingTop(int i10) {
        int dp = AndroidUtilities.dp(58.0f) + i10;
        h51 h51Var = this.n;
        if (h51Var.getPaddingTop() != dp) {
            this.H = true;
            h51Var.setPadding(0, dp, 0, 0);
            this.H = false;
        }
    }

    public void setOnScrollListener(s4.s0 s0Var) {
        this.y = s0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.m2 m2Var) {
        this.x = m2Var;
    }
}
