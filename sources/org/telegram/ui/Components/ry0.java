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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class ry0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean B;
    public oq0 C;
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
    public final org.telegram.ui.ActionBar.g6 b;
    public py0 c;
    public eg.s2 d;
    public ny0 e;
    public oy0 f;
    public int h;
    public int n;
    public my0 r;
    public boolean s;
    public boolean v;
    public ArrayList w;
    public boolean x;
    public boolean y;

    public ry0(Context context, int i10, org.telegram.ui.jk jkVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = 0;
        this.n = AndroidUtilities.dp(10.0f);
        this.I = 0L;
        this.a = i10;
        this.c = jkVar;
        this.b = g6Var;
        postDelayed(new org.telegram.messenger.e6(i10, 9), 260L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.ui.ot getPreviewDelegate() {
        if (this.r == null) {
            this.r = new my0(this);
        }
        return this.r;
    }

    public final void c() {
        if (this.e != null) {
            return;
        }
        this.J = new Path();
        this.K = new Path();
        eg.s2 s2Var = new eg.s2(this, getContext(), 27);
        this.d = s2Var;
        pr prVar = pr.h;
        this.M = new z5(s2Var, 120L, 350L, prVar);
        this.N = new z5(this.d, 150L, 600L, prVar);
        new OvershootInterpolator(0.4f);
        this.O = new z5(this.d, 300L, prVar);
        this.P = new z5(this.d, 300L, prVar);
        this.V = new z5(this.d, 200L, prVar);
        this.W = new z5(this.d, 350L, prVar);
        this.a0 = new z5(this.d, 350L, prVar);
        ny0 ny0Var = new ny0(this, getContext());
        this.e = ny0Var;
        oy0 oy0Var = new oy0(this, this);
        this.f = oy0Var;
        ny0Var.setAdapter(oy0Var);
        getContext();
        f2.j0 j0Var = new f2.j0();
        j0Var.j1(0);
        this.e.setLayoutManager(j0Var);
        f2.l lVar = new f2.l();
        lVar.n(45L);
        lVar.o = prVar;
        this.e.setItemAnimator(lVar);
        this.e.setSelectorDrawableColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i6, this.b));
        ny0 ny0Var2 = this.e;
        k kVar = new k(this, 17);
        ny0Var2.setOnItemClickListener(kVar);
        this.e.setOnTouchListener(new org.telegram.ui.ActionBar.i1(3, this, kVar));
        this.d.addView(this.e, k7.c6.c(52.0f, -1));
        addView(this.d, k7.c6.a(-1.0f, 66.66f, 80));
        py0 py0Var = this.c;
        if (py0Var != null) {
            py0Var.a(new eh.c(this, 13));
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
        oq0 oq0Var = this.C;
        if (oq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(oq0Var);
        }
        oq0 oq0Var2 = new oq0(this, 11);
        this.C = oq0Var2;
        AndroidUtilities.runOnUIThread(oq0Var2, 16L);
    }

    public final void f() {
        oq0 oq0Var = this.C;
        if (oq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(oq0Var);
            this.C = null;
        }
        this.s = false;
        this.v = true;
        eg.s2 s2Var = this.d;
        if (s2Var != null) {
            s2Var.invalidate();
        }
    }

    public py0 getDelegate() {
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

    public void setDelegate(py0 py0Var) {
        this.c = py0Var;
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
