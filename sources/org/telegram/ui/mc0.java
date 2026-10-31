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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class mc0 extends TextView implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Cells.y a;
    public final org.telegram.ui.Components.t80 b;
    public int c;
    public final /* synthetic */ hf0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc0(hf0 hf0Var, Context context) {
        super(context);
        this.d = hf0Var;
        int i10 = org.telegram.ui.ActionBar.t6.I6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.x0(null, i10, false)), 7, -1);
        this.a = h02;
        org.telegram.ui.Components.t80 t80Var = new org.telegram.ui.Components.t80();
        this.b = t80Var;
        org.telegram.ui.ActionBar.z6 z6Var = org.telegram.ui.ActionBar.a7.a;
        this.c = org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        h02.setCallback(this);
        t80Var.D = true;
        t80Var.u = 0.8f;
    }

    public boolean a() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ze));
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
        org.telegram.ui.Components.k80 k80Var = new org.telegram.ui.Components.k80(0);
        float L = org.telegram.messenger.i0.L(3.0f);
        float L2 = org.telegram.messenger.i0.L(6.0f);
        k80Var.q = L;
        k80Var.r = L2;
        int length = text.length();
        k80Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, k80Var);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(k80Var.s, k80Var.u, k80Var.t, k80Var.v);
        this.a.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Components.t80 t80Var = this.b;
        t80Var.y = k80Var;
        t80Var.k(4.0f);
        int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.t6.ze);
        t80Var.g(org.telegram.ui.ActionBar.t6.r1(0.85f, themedColor), org.telegram.ui.ActionBar.t6.r1(2.0f, themedColor), org.telegram.ui.ActionBar.t6.r1(3.5f, themedColor), org.telegram.ui.ActionBar.t6.r1(6.0f, themedColor));
        t80Var.l();
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
        boolean a2 = a();
        org.telegram.ui.Components.t80 t80Var = this.b;
        if (a2 || t80Var.d()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), paddingTop);
            t80Var.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
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

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            int r12 = org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.I6, false));
            org.telegram.ui.Cells.y yVar = this.a;
            if (yVar != null && r12 != this.c) {
                org.telegram.ui.ActionBar.t6.H1(yVar, r12, true);
            }
            this.c = r12;
            org.telegram.ui.Components.t80 t80Var = this.b;
            if (t80Var != null) {
                int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.t6.ze);
                t80Var.g(org.telegram.ui.ActionBar.t6.r1(0.85f, themedColor), org.telegram.ui.ActionBar.t6.r1(2.0f, themedColor), org.telegram.ui.ActionBar.t6.r1(3.5f, themedColor), org.telegram.ui.ActionBar.t6.r1(6.0f, themedColor));
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
