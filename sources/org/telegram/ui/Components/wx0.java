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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class wx0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public up0 B;
    public int C;
    public String D;
    public int E;
    public String[] F;
    public Runnable G;
    public long H;
    public Path I;
    public Path J;
    public Paint K;
    public y5 L;
    public y5 M;
    public y5 N;
    public y5 O;
    public Emoji.EmojiSpan P;
    public float Q;
    public Integer R;
    public Integer S;
    public float T;
    public y5 U;
    public y5 V;
    public y5 W;
    public final int a;
    public final org.telegram.ui.ActionBar.c6 b;
    public ux0 c;
    public ag.p1 d;
    public sx0 e;
    public tx0 f;
    public int h;
    public int n;
    public rx0 r;
    public boolean s;
    public boolean v;
    public ArrayList w;
    public boolean x;
    public boolean y;

    public wx0(Context context, int i10, org.telegram.ui.ck ckVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.h = 0;
        this.n = AndroidUtilities.dp(10.0f);
        this.H = 0L;
        this.a = i10;
        this.c = ckVar;
        this.b = c6Var;
        postDelayed(new nh.k2(i10, 10), 260L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.ui.ht getPreviewDelegate() {
        if (this.r == null) {
            this.r = new rx0(this);
        }
        return this.r;
    }

    public final void c() {
        if (this.e != null) {
            return;
        }
        this.I = new Path();
        this.J = new Path();
        ag.p1 p1Var = new ag.p1(this, getContext(), 27);
        this.d = p1Var;
        er erVar = er.h;
        this.L = new y5(p1Var, 120L, 350L, erVar);
        this.M = new y5(this.d, 150L, 600L, erVar);
        new OvershootInterpolator(0.4f);
        this.N = new y5(this.d, 300L, erVar);
        this.O = new y5(this.d, 300L, erVar);
        this.U = new y5(this.d, 200L, erVar);
        this.V = new y5(this.d, 350L, erVar);
        this.W = new y5(this.d, 350L, erVar);
        sx0 sx0Var = new sx0(this, getContext());
        this.e = sx0Var;
        tx0 tx0Var = new tx0(this, this);
        this.f = tx0Var;
        sx0Var.setAdapter(tx0Var);
        getContext();
        f2.k0 k0Var = new f2.k0();
        k0Var.j1(0);
        this.e.setLayoutManager(k0Var);
        f2.l lVar = new f2.l();
        lVar.n(45L);
        lVar.o = erVar;
        this.e.setItemAnimator(lVar);
        this.e.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, this.b));
        sx0 sx0Var2 = this.e;
        j jVar = new j(this, 17);
        sx0Var2.setOnItemClickListener(jVar);
        this.e.setOnTouchListener(new lh.p1(4, this, jVar));
        this.d.addView(this.e, h7.z5.c(52.0f, -1));
        addView(this.d, h7.z5.a(-1.0f, 66.66f, 80));
        ux0 ux0Var = this.c;
        if (ux0Var != null) {
            ux0Var.a(new ch.e(this, 14));
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
        float f10 = this.W.c;
        float f11 = this.V.c;
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
        up0 up0Var = this.B;
        if (up0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(up0Var);
        }
        up0 up0Var2 = new up0(this, 11);
        this.B = up0Var2;
        AndroidUtilities.runOnUIThread(up0Var2, 16L);
    }

    public final void f() {
        up0 up0Var = this.B;
        if (up0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(up0Var);
            this.B = null;
        }
        this.s = false;
        this.v = true;
        ag.p1 p1Var = this.d;
        if (p1Var != null) {
            p1Var.invalidate();
        }
    }

    public ux0 getDelegate() {
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

    public void setDelegate(ux0 ux0Var) {
        this.c = ux0Var;
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
