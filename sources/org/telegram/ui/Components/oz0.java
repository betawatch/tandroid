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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class oz0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public or0 F;
    public int G;
    public String H;
    public int I;
    public String[] J;
    public Runnable K;
    public long L;
    public Path M;
    public Path N;
    public Paint O;
    public g6 P;
    public g6 Q;
    public g6 R;
    public g6 S;
    public Emoji.EmojiSpan T;
    public float U;
    public Integer V;
    public Integer W;
    public final int a;
    public float a0;
    public final org.telegram.ui.ActionBar.e6 b;
    public g6 b0;
    public mz0 c;
    public g6 c0;
    public ai.f0 d;
    public g6 d0;
    public kz0 e;
    public lz0 f;
    public int h;
    public int n;
    public jz0 r;
    public boolean s;
    public boolean v;
    public ArrayList w;
    public boolean x;
    public boolean y;

    public oz0(Context context, int i10, org.telegram.ui.ok okVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = 0;
        this.n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.a = i10;
        this.c = okVar;
        this.b = e6Var;
        postDelayed(new ei.r2(i10, 11), 260L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.ui.pt getPreviewDelegate() {
        if (this.r == null) {
            this.r = new jz0(this);
        }
        return this.r;
    }

    public final void c() {
        if (this.e != null) {
            return;
        }
        this.M = new Path();
        this.N = new Path();
        ai.f0 f0Var = new ai.f0(this, getContext(), 21);
        this.d = f0Var;
        hs hsVar = hs.h;
        this.P = new g6(f0Var, 120L, 350L, hsVar);
        this.Q = new g6(this.d, 150L, 600L, hsVar);
        new OvershootInterpolator(0.4f);
        this.R = new g6(this.d, 300L, hsVar);
        this.S = new g6(this.d, 300L, hsVar);
        this.b0 = new g6(this.d, 200L, hsVar);
        this.c0 = new g6(this.d, 350L, hsVar);
        this.d0 = new g6(this.d, 350L, hsVar);
        kz0 kz0Var = new kz0(this, getContext());
        this.e = kz0Var;
        lz0 lz0Var = new lz0(this, this);
        this.f = lz0Var;
        kz0Var.setAdapter(lz0Var);
        getContext();
        s4.d0 d0Var = new s4.d0();
        d0Var.j1(0);
        this.e.setLayoutManager(d0Var);
        s4.j jVar = new s4.j();
        jVar.n(45L);
        jVar.o = hsVar;
        this.e.setItemAnimator(jVar);
        this.e.setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, this.b));
        kz0 kz0Var2 = this.e;
        j jVar2 = new j(this, 17);
        kz0Var2.setOnItemClickListener(jVar2);
        this.e.setOnTouchListener(new ci.p1(4, this, jVar2));
        this.d.addView(this.e, w7.x5.d(52.0f, -1));
        addView(this.d, w7.x5.b(-1.0f, 66.66f, 80));
        mz0 mz0Var = this.c;
        if (mz0Var != null) {
            mz0Var.a(new ci.h2(this, 13));
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
        float f7 = this.d0.c;
        float f10 = this.c0.c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.e.getTranslationX() + (f10 - f11) + r0.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f10 + f11 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
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
        or0 or0Var = this.F;
        if (or0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(or0Var);
        }
        or0 or0Var2 = new or0(this, 11);
        this.F = or0Var2;
        AndroidUtilities.runOnUIThread(or0Var2, 16L);
    }

    public final void f() {
        or0 or0Var = this.F;
        if (or0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(or0Var);
            this.F = null;
        }
        this.s = false;
        this.v = true;
        ai.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public mz0 getDelegate() {
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

    public void setDelegate(mz0 mz0Var) {
        this.c = mz0Var;
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
