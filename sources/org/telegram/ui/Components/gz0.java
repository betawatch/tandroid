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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public class gz0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public fr0 F;
    public int G;
    public String H;
    public int I;
    public String[] J;
    public Runnable K;
    public long L;
    public Path M;
    public Path N;
    public Paint O;
    public f6 P;
    public f6 Q;
    public f6 R;
    public f6 S;
    public Emoji.EmojiSpan T;
    public float U;
    public Integer V;
    public Integer W;
    public final int a;
    public float a0;
    public final org.telegram.ui.ActionBar.d6 b;
    public f6 b0;
    public ez0 c;
    public f6 c0;
    public ah.x d;
    public f6 d0;
    public cz0 e;
    public dz0 f;
    public int h;
    public int n;
    public bz0 r;
    public boolean s;
    public boolean v;
    public ArrayList w;
    public boolean x;
    public boolean y;

    public gz0(Context context, int i10, org.telegram.ui.hk hkVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.h = 0;
        this.n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.a = i10;
        this.c = hkVar;
        this.b = d6Var;
        postDelayed(new gi.l2(i10, 11), 260L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.ui.et getPreviewDelegate() {
        if (this.r == null) {
            this.r = new bz0(this);
        }
        return this.r;
    }

    public final void c() {
        if (this.e != null) {
            return;
        }
        this.M = new Path();
        this.N = new Path();
        ah.x xVar = new ah.x(this, getContext(), 24);
        this.d = xVar;
        bs bsVar = bs.h;
        this.P = new f6(xVar, 120L, 350L, bsVar);
        this.Q = new f6(this.d, 150L, 600L, bsVar);
        new OvershootInterpolator(0.4f);
        this.R = new f6(this.d, 300L, bsVar);
        this.S = new f6(this.d, 300L, bsVar);
        this.b0 = new f6(this.d, 200L, bsVar);
        this.c0 = new f6(this.d, 350L, bsVar);
        this.d0 = new f6(this.d, 350L, bsVar);
        cz0 cz0Var = new cz0(this, getContext());
        this.e = cz0Var;
        dz0 dz0Var = new dz0(this, this);
        this.f = dz0Var;
        cz0Var.setAdapter(dz0Var);
        getContext();
        s4.b0 b0Var = new s4.b0();
        b0Var.j1(0);
        this.e.setLayoutManager(b0Var);
        s4.k kVar = new s4.k();
        kVar.n(45L);
        kVar.o = bsVar;
        this.e.setItemAnimator(kVar);
        this.e.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, this.b));
        cz0 cz0Var2 = this.e;
        j jVar = new j(this, 17);
        cz0Var2.setOnItemClickListener(jVar);
        this.e.setOnTouchListener(new ei.p1(4, this, jVar));
        this.d.addView(this.e, w7.z5.d(52.0f, -1));
        addView(this.d, w7.z5.b(-1.0f, 66.66f, 80));
        ez0 ez0Var = this.c;
        if (ez0Var != null) {
            ez0Var.a(new ai.u(this, 14));
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
        fr0 fr0Var = this.F;
        if (fr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(fr0Var);
        }
        fr0 fr0Var2 = new fr0(this, 11);
        this.F = fr0Var2;
        AndroidUtilities.runOnUIThread(fr0Var2, 16L);
    }

    public final void f() {
        fr0 fr0Var = this.F;
        if (fr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(fr0Var);
            this.F = null;
        }
        this.s = false;
        this.v = true;
        ah.x xVar = this.d;
        if (xVar != null) {
            xVar.invalidate();
        }
    }

    public ez0 getDelegate() {
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

    public void setDelegate(ez0 ez0Var) {
        this.c = ez0Var;
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
