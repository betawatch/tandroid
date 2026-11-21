package org.telegram.ui;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.MotionEvent;
import android.widget.TextView;
import java.util.HashSet;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public class eb0 extends TextView implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Cells.y a;
    public final org.telegram.ui.Components.q80 b;
    public int c;
    public final /* synthetic */ de0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb0(de0 de0Var, Context context) {
        super(context);
        this.d = de0Var;
        int i7 = org.telegram.ui.ActionBar.m6.I6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.x0(null, i7, false)), 7, -1);
        this.a = h02;
        org.telegram.ui.Components.q80 q80Var = new org.telegram.ui.Components.q80();
        this.b = q80Var;
        org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.a;
        this.c = org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        h02.setCallback(this);
        q80Var.D = true;
        q80Var.u = 0.8f;
    }

    public boolean a() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ce));
    }

    public boolean b() {
        return true;
    }

    public final void c() {
        CharSequence text;
        Layout layout = getLayout();
        if (layout == null || (text = layout.getText()) == null) {
            return;
        }
        org.telegram.ui.Components.h80 h80Var = new org.telegram.ui.Components.h80(0);
        float L = org.telegram.messenger.g0.L(3.0f);
        float L2 = org.telegram.messenger.g0.L(6.0f);
        h80Var.q = L;
        h80Var.r = L2;
        int length = text.length();
        h80Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, h80Var);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(h80Var.s, h80Var.u, h80Var.t, h80Var.v);
        this.a.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Components.q80 q80Var = this.b;
        q80Var.y = h80Var;
        q80Var.k(4.0f);
        int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.m6.Ce);
        q80Var.g(org.telegram.ui.ActionBar.m6.r1(0.85f, themedColor), org.telegram.ui.ActionBar.m6.r1(2.0f, themedColor), org.telegram.ui.ActionBar.m6.r1(3.5f, themedColor), org.telegram.ui.ActionBar.m6.r1(6.0f, themedColor));
        q80Var.l();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float paddingTop;
        canvas.save();
        if ((getGravity() & 16) == 0 || getLayout() == null) {
            paddingTop = getPaddingTop();
        } else {
            paddingTop = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
        }
        canvas.translate(getPaddingLeft(), paddingTop);
        this.a.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        boolean a10 = a();
        org.telegram.ui.Components.q80 q80Var = this.b;
        if (a10 || q80Var.d()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), paddingTop);
            q80Var.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        c();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean b10 = b();
        org.telegram.ui.Cells.y yVar = this.a;
        if (b10 && motionEvent.getAction() == 0) {
            yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
            yVar.setState(new int[]{R.attr.state_enabled, R.attr.state_pressed});
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 1) {
            yVar.setState(new int[0]);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        c();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            int r12 = org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.I6, false));
            org.telegram.ui.Cells.y yVar = this.a;
            if (yVar != null && r12 != this.c) {
                org.telegram.ui.ActionBar.m6.H1(yVar, r12, true);
            }
            this.c = r12;
            org.telegram.ui.Components.q80 q80Var = this.b;
            if (q80Var != null) {
                int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.m6.Ce);
                q80Var.g(org.telegram.ui.ActionBar.m6.r1(0.85f, themedColor), org.telegram.ui.ActionBar.m6.r1(2.0f, themedColor), org.telegram.ui.ActionBar.m6.r1(3.5f, themedColor), org.telegram.ui.ActionBar.m6.r1(6.0f, themedColor));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
