package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.ui.Components.t41;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class y1 extends View implements org.telegram.ui.ActionBar.c6 {
    public final t41 a;
    public final org.telegram.ui.ActionBar.h6 b;
    public int c;
    public int d;
    public l1 e;
    public float f;
    public int h;

    public y1(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.b = h6Var;
        t41 t41Var = new t41();
        this.a = t41Var;
        t41Var.setCallback(this);
        t41Var.n = id.M0(2131743827, null);
        t41Var.o = id.M0(2131743828, null);
        t41Var.p = id.M0(2131743826, null);
        t41Var.j = new f(this, 1);
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.h6 h6Var = this.b;
        if (h6Var != null) {
            h6Var.b(0.0f, this.f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.m6.r(0.0f, this.f, getMeasuredWidth(), this.h);
        }
        float L = org.telegram.messenger.g0.L(18.0f);
        float L2 = org.telegram.messenger.g0.L(6.0f);
        float L3 = org.telegram.messenger.g0.L(18.0f) + this.c;
        float L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        float L5 = org.telegram.messenger.g0.L(18.0f);
        float L6 = org.telegram.messenger.g0.L(18.0f);
        Paint d = h6Var != null ? h6Var.d("paintChatActionBackground") : null;
        if (d == null) {
            d = org.telegram.ui.ActionBar.m6.V0("paintChatActionBackground");
        }
        canvas.drawRoundRect(L, L2, L3, L4, L5, L6, d);
        if (h6Var != null ? h6Var.g() : org.telegram.ui.ActionBar.m6.d1()) {
            canvas.drawRoundRect(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f) + this.c, org.telegram.messenger.g0.L(6.0f) + this.d, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.m6.h2);
        }
    }

    public final void b(float f10, int i7) {
        this.f = f10;
        this.h = i7;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(18.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int L3 = org.telegram.messenger.g0.L(18.0f) + this.c;
        int L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        t41 t41Var = this.a;
        t41Var.setBounds(L, L2, L3, L4);
        t41Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(36.0f);
        this.c = L;
        int a10 = this.a.a(L);
        this.d = a10;
        setMeasuredDimension(size, org.telegram.messenger.g0.L(12.0f) + a10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.i.a(this, motionEvent);
    }

    public void setDelegate(l1 l1Var) {
        this.e = l1Var;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        this.a.b();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
    }
}
