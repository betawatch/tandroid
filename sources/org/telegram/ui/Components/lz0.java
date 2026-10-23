package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public class lz0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.b6 {
    public boolean E;
    public PorterDuffColorFilter F;
    public int G;
    public kr0 H;
    public int I;
    public String J;
    public int K;
    public String[] L;
    public Runnable M;
    public long N;
    public Path O;
    public Path P;
    public Paint Q;
    public f6 R;
    public f6 S;
    public f6 T;
    public f6 U;
    public Emoji.EmojiSpan V;
    public float W;
    public final int a;
    public Integer a0;
    public final org.telegram.ui.ActionBar.g6 b;
    public Integer b0;
    public jz0 c;
    public float c0;
    public ah.x d;
    public f6 d0;
    public hz0 e;
    public f6 e0;
    public iz0 f;
    public f6 f0;
    public int h;
    public int n;
    public gz0 r;
    public boolean s;
    public boolean v;
    public ArrayList w;
    public boolean x;
    public boolean y;

    public lz0(Context context, int i10, org.telegram.ui.gk gkVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = 0;
        this.n = AndroidUtilities.dp(10.0f);
        this.N = 0L;
        this.a = i10;
        this.c = gkVar;
        this.b = g6Var;
        postDelayed(new gi.l2(i10, 11), 260L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.ui.ft getPreviewDelegate() {
        if (this.r == null) {
            this.r = new gz0(this);
        }
        return this.r;
    }

    public final void c() {
        if (this.e != null) {
            return;
        }
        this.O = new Path();
        this.P = new Path();
        ah.x xVar = new ah.x(this, getContext(), 24);
        this.d = xVar;
        bs bsVar = bs.h;
        this.R = new f6(xVar, 120L, 350L, bsVar);
        this.S = new f6(this.d, 150L, 600L, bsVar);
        new OvershootInterpolator(0.4f);
        this.T = new f6(this.d, 300L, bsVar);
        this.U = new f6(this.d, 300L, bsVar);
        this.d0 = new f6(this.d, 200L, bsVar);
        this.e0 = new f6(this.d, 350L, bsVar);
        this.f0 = new f6(this.d, 350L, bsVar);
        hz0 hz0Var = new hz0(this, getContext());
        this.e = hz0Var;
        iz0 iz0Var = new iz0(this, this);
        this.f = iz0Var;
        hz0Var.setAdapter(iz0Var);
        getContext();
        s4.b0 b0Var = new s4.b0();
        b0Var.j1(0);
        this.e.setLayoutManager(b0Var);
        s4.k kVar = new s4.k();
        kVar.n(45L);
        kVar.o = bsVar;
        this.e.setItemAnimator(kVar);
        org.telegram.ui.ActionBar.r6.L(this.e, org.telegram.ui.ActionBar.k6.i6, this.b);
        hz0 hz0Var2 = this.e;
        j jVar = new j(this, 17);
        hz0Var2.setOnItemClickListener(jVar);
        this.e.setOnTouchListener(new ei.p1(4, this, jVar));
        this.d.addView(this.e, w7.z5.c(52.0f, -1));
        addView(this.d, w7.z5.a(-1.0f, 66.66f, 80));
        jz0 jz0Var = this.c;
        if (jz0Var != null) {
            jz0Var.d(new ai.u(this, 14));
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
        float f7 = this.f0.c;
        float f10 = this.e0.c;
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
        kr0 kr0Var = this.H;
        if (kr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(kr0Var);
        }
        kr0 kr0Var2 = new kr0(this, 12);
        this.H = kr0Var2;
        AndroidUtilities.runOnUIThread(kr0Var2, 16L);
    }

    public final void f() {
        kr0 kr0Var = this.H;
        if (kr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(kr0Var);
            this.H = null;
        }
        this.s = false;
        this.v = true;
        ah.x xVar = this.d;
        if (xVar != null) {
            xVar.invalidate();
        }
    }

    public jz0 getDelegate() {
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

    public void setDelegate(jz0 jz0Var) {
        this.c = jz0Var;
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        Paint paint = this.Q;
        org.telegram.ui.ActionBar.g6 g6Var = this.b;
        if (paint != null) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Be, g6Var));
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Be, g6Var);
        if (this.F == null || this.G != w02) {
            this.G = w02;
            this.F = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        Drawable drawable = org.telegram.ui.ActionBar.k6.E4;
        if (drawable != null) {
            ColorFilter colorFilter = drawable.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.F;
            if (colorFilter != porterDuffColorFilter) {
                org.telegram.ui.ActionBar.k6.E4.setColorFilter(porterDuffColorFilter);
            }
        }
        Drawable drawable2 = org.telegram.ui.ActionBar.k6.F4;
        if (drawable2 != null) {
            ColorFilter colorFilter2 = drawable2.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.F;
            if (colorFilter2 != porterDuffColorFilter2) {
                org.telegram.ui.ActionBar.k6.F4.setColorFilter(porterDuffColorFilter2);
            }
        }
        ah.x xVar = this.d;
        if (xVar != null) {
            xVar.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
