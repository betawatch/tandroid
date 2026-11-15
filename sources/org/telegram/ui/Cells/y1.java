package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.x41;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class y1 extends View implements org.telegram.ui.ActionBar.z5 {
    public final x41 a;
    public final org.telegram.ui.ActionBar.e6 b;
    public int c;
    public int d;
    public l1 e;
    public float f;
    public int h;

    public y1(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.b = e6Var;
        x41 x41Var = new x41();
        this.a = x41Var;
        x41Var.setCallback(this);
        x41Var.n = hd.M0(2131743827, null);
        x41Var.o = hd.M0(2131743828, null);
        x41Var.p = hd.M0(2131743826, null);
        x41Var.j = new f(this, 2);
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        if (e6Var != null) {
            e6Var.b(0.0f, this.f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.j6.r(0.0f, this.f, getMeasuredWidth(), this.h);
        }
        float L = org.telegram.messenger.g0.L(18.0f);
        float L2 = org.telegram.messenger.g0.L(6.0f);
        float L3 = org.telegram.messenger.g0.L(18.0f) + this.c;
        float L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        float L5 = org.telegram.messenger.g0.L(18.0f);
        float L6 = org.telegram.messenger.g0.L(18.0f);
        Paint d = e6Var != null ? e6Var.d("paintChatActionBackground") : null;
        if (d == null) {
            d = org.telegram.ui.ActionBar.j6.V0("paintChatActionBackground");
        }
        canvas.drawRoundRect(L, L2, L3, L4, L5, L6, d);
        if (e6Var != null ? e6Var.g() : org.telegram.ui.ActionBar.j6.d1()) {
            canvas.drawRoundRect(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f) + this.c, org.telegram.messenger.g0.L(6.0f) + this.d, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.j6.h2);
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
        x41 x41Var = this.a;
        x41Var.setBounds(L, L2, L3, L4);
        x41Var.draw(canvas);
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        this.a.b();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
    }
}
