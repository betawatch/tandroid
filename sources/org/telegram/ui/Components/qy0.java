package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class qy0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean B;
    public nq0 C;
    public int D;
    public String E;
    public int F;
    public String[] G;
    public Runnable H;
    public long I;
    public Path J;
    public Path K;
    public Paint L;
    public z5 M;
    public z5 N;
    public z5 O;
    public z5 P;
    public Emoji.EmojiSpan Q;
    public float R;
    public Integer S;
    public Integer T;
    public float U;
    public z5 V;
    public z5 W;
    public final int a;
    public z5 a0;
    public final org.telegram.ui.ActionBar.f6 b;
    public oy0 c;
    public dg.u2 d;
    public my0 e;
    public ny0 f;
    public int h;
    public int n;
    public ly0 r;
    public boolean s;
    public boolean v;
    public ArrayList w;
    public boolean x;
    public boolean y;

    public qy0(Context context, int i10, org.telegram.ui.lk lkVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = 0;
        this.n = AndroidUtilities.dp(10.0f);
        this.I = 0L;
        this.a = i10;
        this.c = lkVar;
        this.b = f6Var;
        postDelayed(new org.telegram.messenger.e6(i10, 9), 260L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.ui.pt getPreviewDelegate() {
        if (this.r == null) {
            this.r = new ly0(this);
        }
        return this.r;
    }

    public final void c() {
        if (this.e != null) {
            return;
        }
        this.J = new Path();
        this.K = new Path();
        dg.u2 u2Var = new dg.u2(this, getContext(), 27);
        this.d = u2Var;
        mr mrVar = mr.h;
        this.M = new z5(u2Var, 120L, 350L, mrVar);
        this.N = new z5(this.d, 150L, 600L, mrVar);
        new OvershootInterpolator(0.4f);
        this.O = new z5(this.d, 300L, mrVar);
        this.P = new z5(this.d, 300L, mrVar);
        this.V = new z5(this.d, 200L, mrVar);
        this.W = new z5(this.d, 350L, mrVar);
        this.a0 = new z5(this.d, 350L, mrVar);
        my0 my0Var = new my0(this, getContext());
        this.e = my0Var;
        ny0 ny0Var = new ny0(this, this);
        this.f = ny0Var;
        my0Var.setAdapter(ny0Var);
        getContext();
        f2.i0 i0Var = new f2.i0();
        i0Var.j1(0);
        this.e.setLayoutManager(i0Var);
        f2.l lVar = new f2.l();
        lVar.n(45L);
        lVar.o = mrVar;
        this.e.setItemAnimator(lVar);
        this.e.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, this.b));
        my0 my0Var2 = this.e;
        k kVar = new k(this, 17);
        my0Var2.setOnItemClickListener(kVar);
        this.e.setOnTouchListener(new org.telegram.ui.ActionBar.i1(3, this, kVar));
        this.d.addView(this.e, k7.b6.c(52.0f, -1));
        addView(this.d, k7.b6.a(-1.0f, 66.66f, 80));
        oy0 oy0Var = this.c;
        if (oy0Var != null) {
            oy0Var.a(new dh.c(this, 13));
        }
    }

    public int d() {
        return 2;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.w;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            e();
            return;
        }
        if (i10 != NotificationCenter.emojiLoaded || this.e == null) {
            return;
        }
        for (int i12 = 0; i12 < this.e.getChildCount(); i12++) {
            this.e.getChildAt(i12).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.e == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f10 = this.a0.c;
        float f11 = this.W.c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f12 = f10 / 2.0f;
        rectF.set(this.e.getTranslationX() + (f11 - f12) + r0.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f11 + f12 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            motionEvent.setAction(3);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        nq0 nq0Var = this.C;
        if (nq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(nq0Var);
        }
        nq0 nq0Var2 = new nq0(this, 11);
        this.C = nq0Var2;
        AndroidUtilities.runOnUIThread(nq0Var2, 16L);
    }

    public final void f() {
        nq0 nq0Var = this.C;
        if (nq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(nq0Var);
            this.C = null;
        }
        this.s = false;
        this.v = true;
        dg.u2 u2Var = this.d;
        if (u2Var != null) {
            u2Var.invalidate();
        }
    }

    public oy0 getDelegate() {
        return this.c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override // android.view.View
    public final boolean isShown() {
        return this.s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(oy0 oy0Var) {
        this.c = oy0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.n = i10;
    }
}
