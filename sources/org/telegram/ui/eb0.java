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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class eb0 extends TextView implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Cells.y a;
    public final org.telegram.ui.Components.o80 b;
    public int c;
    public final /* synthetic */ ee0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb0(ee0 ee0Var, Context context) {
        super(context);
        this.d = ee0Var;
        int i7 = org.telegram.ui.ActionBar.n6.I6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.x0(null, i7, false)), 7, -1);
        this.a = h02;
        org.telegram.ui.Components.o80 o80Var = new org.telegram.ui.Components.o80();
        this.b = o80Var;
        org.telegram.ui.ActionBar.t6 t6Var = org.telegram.ui.ActionBar.u6.a;
        this.c = org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        h02.setCallback(this);
        o80Var.D = true;
        o80Var.u = 0.8f;
    }

    public boolean a() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ce));
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
        org.telegram.ui.Components.f80 f80Var = new org.telegram.ui.Components.f80(0);
        float L = org.telegram.messenger.g0.L(3.0f);
        float L2 = org.telegram.messenger.g0.L(6.0f);
        f80Var.q = L;
        f80Var.r = L2;
        int length = text.length();
        f80Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, f80Var);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f80Var.s, f80Var.u, f80Var.t, f80Var.v);
        this.a.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Components.o80 o80Var = this.b;
        o80Var.y = f80Var;
        o80Var.k(4.0f);
        int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.n6.Ce);
        o80Var.g(org.telegram.ui.ActionBar.n6.r1(0.85f, themedColor), org.telegram.ui.ActionBar.n6.r1(2.0f, themedColor), org.telegram.ui.ActionBar.n6.r1(3.5f, themedColor), org.telegram.ui.ActionBar.n6.r1(6.0f, themedColor));
        o80Var.l();
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
        org.telegram.ui.Components.o80 o80Var = this.b;
        if (a10 || o80Var.d()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), paddingTop);
            o80Var.draw(canvas);
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            int r12 = org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.I6, false));
            org.telegram.ui.Cells.y yVar = this.a;
            if (yVar != null && r12 != this.c) {
                org.telegram.ui.ActionBar.n6.H1(yVar, r12, true);
            }
            this.c = r12;
            org.telegram.ui.Components.o80 o80Var = this.b;
            if (o80Var != null) {
                int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.n6.Ce);
                o80Var.g(org.telegram.ui.ActionBar.n6.r1(0.85f, themedColor), org.telegram.ui.ActionBar.n6.r1(2.0f, themedColor), org.telegram.ui.ActionBar.n6.r1(3.5f, themedColor), org.telegram.ui.ActionBar.n6.r1(6.0f, themedColor));
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
