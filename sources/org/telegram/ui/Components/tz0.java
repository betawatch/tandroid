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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class tz0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.p6 {
    public boolean E;
    public PorterDuffColorFilter F;
    public int G;
    public mp0 H;
    public int I;
    public String J;
    public int K;
    public String[] L;
    public Runnable M;
    public long N;
    public Path O;
    public Path P;
    public Paint Q;
    public h6 R;
    public h6 S;
    public h6 T;
    public h6 U;
    public Emoji.EmojiSpan V;
    public float W;
    public final int a;
    public Integer a0;
    public final org.telegram.ui.ActionBar.u6 b;
    public Integer b0;
    public rz0 c;
    public float c0;
    public bh.r d;
    public h6 d0;
    public pz0 e;
    public h6 e0;
    public qz0 f;
    public h6 f0;
    public int h;
    public int n;
    public oz0 r;
    public boolean s;
    public boolean v;
    public ArrayList w;
    public boolean x;
    public boolean y;

    public tz0(Context context, int i10, org.telegram.ui.hk hkVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.h = 0;
        this.n = AndroidUtilities.dp(10.0f);
        this.N = 0L;
        this.a = i10;
        this.c = hkVar;
        this.b = u6Var;
        postDelayed(new hi.t2(i10, 11), 260L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.ui.dt getPreviewDelegate() {
        if (this.r == null) {
            this.r = new oz0(this);
        }
        return this.r;
    }

    public final void c() {
        if (this.e != null) {
            return;
        }
        this.O = new Path();
        this.P = new Path();
        bh.r rVar = new bh.r(this, getContext(), 26);
        this.d = rVar;
        ds dsVar = ds.h;
        this.R = new h6(rVar, 120L, 350L, dsVar);
        this.S = new h6(this.d, 150L, 600L, dsVar);
        new OvershootInterpolator(0.4f);
        this.T = new h6(this.d, 300L, dsVar);
        this.U = new h6(this.d, 300L, dsVar);
        this.d0 = new h6(this.d, 200L, dsVar);
        this.e0 = new h6(this.d, 350L, dsVar);
        this.f0 = new h6(this.d, 350L, dsVar);
        pz0 pz0Var = new pz0(this, getContext());
        this.e = pz0Var;
        qz0 qz0Var = new qz0(this, this);
        this.f = qz0Var;
        pz0Var.setAdapter(qz0Var);
        getContext();
        s4.c0 c0Var = new s4.c0();
        c0Var.k1(0);
        this.e.setLayoutManager(c0Var);
        s4.l lVar = new s4.l();
        lVar.n(45L);
        lVar.o = dsVar;
        this.e.setItemAnimator(lVar);
        org.telegram.ui.ActionBar.f7.K(this.e, org.telegram.ui.ActionBar.y6.i6, this.b);
        pz0 pz0Var2 = this.e;
        j jVar = new j(this, 17);
        pz0Var2.setOnItemClickListener(jVar);
        this.e.setOnTouchListener(new fi.o1(4, this, jVar));
        this.d.addView(this.e, gb1.g(52.0f, -1));
        addView(this.d, gb1.e(-1.0f, 66.66f, 80));
        rz0 rz0Var = this.c;
        if (rz0Var != null) {
            rz0Var.d(new bi.u(this, 14));
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
        mp0 mp0Var = this.H;
        if (mp0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(mp0Var);
        }
        mp0 mp0Var2 = new mp0(this, 17);
        this.H = mp0Var2;
        AndroidUtilities.runOnUIThread(mp0Var2, 16L);
    }

    public final void f() {
        mp0 mp0Var = this.H;
        if (mp0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(mp0Var);
            this.H = null;
        }
        this.s = false;
        this.v = true;
        bh.r rVar = this.d;
        if (rVar != null) {
            rVar.invalidate();
        }
    }

    public rz0 getDelegate() {
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

    public void setDelegate(rz0 rz0Var) {
        this.c = rz0Var;
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        Paint paint = this.Q;
        org.telegram.ui.ActionBar.u6 u6Var = this.b;
        if (paint != null) {
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Be, u6Var));
        }
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Be, u6Var);
        if (this.F == null || this.G != w02) {
            this.G = w02;
            this.F = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        Drawable drawable = org.telegram.ui.ActionBar.y6.E4;
        if (drawable != null) {
            ColorFilter colorFilter = drawable.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.F;
            if (colorFilter != porterDuffColorFilter) {
                org.telegram.ui.ActionBar.y6.E4.setColorFilter(porterDuffColorFilter);
            }
        }
        Drawable drawable2 = org.telegram.ui.ActionBar.y6.F4;
        if (drawable2 != null) {
            ColorFilter colorFilter2 = drawable2.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.F;
            if (colorFilter2 != porterDuffColorFilter2) {
                org.telegram.ui.ActionBar.y6.F4.setColorFilter(porterDuffColorFilter2);
            }
        }
        bh.r rVar = this.d;
        if (rVar != null) {
            rVar.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
