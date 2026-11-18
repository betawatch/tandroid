package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.h51;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class y1 extends View implements org.telegram.ui.ActionBar.c6 {
    public final h51 a;
    public final org.telegram.ui.ActionBar.i6 b;
    public int c;
    public int d;
    public l1 e;
    public float f;
    public int h;

    public y1(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.b = i6Var;
        h51 h51Var = new h51();
        this.a = h51Var;
        h51Var.setCallback(this);
        h51Var.n = gd.M0(2131743590, null);
        h51Var.o = gd.M0(2131743591, null);
        h51Var.p = gd.M0(2131743589, null);
        h51Var.j = new f(this, 2);
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        if (i6Var != null) {
            i6Var.e(0.0f, this.f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.n6.r(0.0f, this.f, getMeasuredWidth(), this.h);
        }
        float L = org.telegram.messenger.g0.L(18.0f);
        float L2 = org.telegram.messenger.g0.L(6.0f);
        float L3 = org.telegram.messenger.g0.L(18.0f) + this.c;
        float L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        float L5 = org.telegram.messenger.g0.L(18.0f);
        float L6 = org.telegram.messenger.g0.L(18.0f);
        Paint g10 = i6Var != null ? i6Var.g("paintChatActionBackground") : null;
        if (g10 == null) {
            g10 = org.telegram.ui.ActionBar.n6.V0("paintChatActionBackground");
        }
        canvas.drawRoundRect(L, L2, L3, L4, L5, L6, g10);
        if (i6Var != null ? i6Var.j() : org.telegram.ui.ActionBar.n6.d1()) {
            canvas.drawRoundRect(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f) + this.c, org.telegram.messenger.g0.L(6.0f) + this.d, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.n6.h2);
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
        h51 h51Var = this.a;
        h51Var.setBounds(L, L2, L3, L4);
        h51Var.draw(canvas);
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
    }
}
