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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public class az0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public yq0 F;
    public int G;
    public String H;
    public int I;
    public String[] J;
    public Runnable K;
    public long L;
    public Path M;
    public Path N;
    public Paint O;
    public d6 P;
    public d6 Q;
    public d6 R;
    public d6 S;
    public Emoji.EmojiSpan T;
    public float U;
    public Integer V;
    public Integer W;
    public final int a;
    public float a0;
    public final org.telegram.ui.ActionBar.f6 b;
    public d6 b0;
    public yy0 c;
    public d6 c0;
    public ai.f0 d;
    public d6 d0;
    public wy0 e;
    public xy0 f;
    public int h;
    public int n;
    public vy0 r;
    public boolean s;
    public boolean v;
    public ArrayList w;
    public boolean x;
    public boolean y;

    public az0(Context context, int i10, org.telegram.ui.mk mkVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = 0;
        this.n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.a = i10;
        this.c = mkVar;
        this.b = f6Var;
        postDelayed(new ei.r2(i10, 10), 260L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.ui.qt getPreviewDelegate() {
        if (this.r == null) {
            this.r = new vy0(this);
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
        qr qrVar = qr.h;
        this.P = new d6(f0Var, 120L, 350L, qrVar);
        this.Q = new d6(this.d, 150L, 600L, qrVar);
        new OvershootInterpolator(0.4f);
        this.R = new d6(this.d, 300L, qrVar);
        this.S = new d6(this.d, 300L, qrVar);
        this.b0 = new d6(this.d, 200L, qrVar);
        this.c0 = new d6(this.d, 350L, qrVar);
        this.d0 = new d6(this.d, 350L, qrVar);
        wy0 wy0Var = new wy0(this, getContext());
        this.e = wy0Var;
        xy0 xy0Var = new xy0(this, this);
        this.f = xy0Var;
        wy0Var.setAdapter(xy0Var);
        getContext();
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        this.e.setLayoutManager(c0Var);
        s4.j jVar = new s4.j();
        jVar.n(45L);
        jVar.o = qrVar;
        this.e.setItemAnimator(jVar);
        this.e.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, this.b));
        wy0 wy0Var2 = this.e;
        j jVar2 = new j(this, 17);
        wy0Var2.setOnItemClickListener(jVar2);
        this.e.setOnTouchListener(new ci.q1(4, this, jVar2));
        this.d.addView(this.e, w7.y5.c(52.0f, -1));
        addView(this.d, w7.y5.a(-1.0f, 66.66f, 80));
        yy0 yy0Var = this.c;
        if (yy0Var != null) {
            yy0Var.a(new ci.i2(this, 13));
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
        yq0 yq0Var = this.F;
        if (yq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(yq0Var);
        }
        yq0 yq0Var2 = new yq0(this, 12);
        this.F = yq0Var2;
        AndroidUtilities.runOnUIThread(yq0Var2, 16L);
    }

    public final void f() {
        yq0 yq0Var = this.F;
        if (yq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(yq0Var);
            this.F = null;
        }
        this.s = false;
        this.v = true;
        ai.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public yy0 getDelegate() {
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

    public void setDelegate(yy0 yy0Var) {
        this.c = yy0Var;
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
