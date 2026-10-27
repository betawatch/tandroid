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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class fd0 extends TextView implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Cells.y a;
    public final org.telegram.ui.Components.ea0 b;
    public int c;
    public final /* synthetic */ ig0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd0(ig0 ig0Var, Context context) {
        super(context);
        this.d = ig0Var;
        int i10 = org.telegram.ui.ActionBar.y6.I6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.x0(null, i10, false)), 7, -1);
        this.a = g02;
        org.telegram.ui.Components.ea0 ea0Var = new org.telegram.ui.Components.ea0();
        this.b = ea0Var;
        org.telegram.ui.ActionBar.e7 e7Var = org.telegram.ui.ActionBar.f7.a;
        this.c = org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        g02.setCallback(this);
        ea0Var.D = true;
        ea0Var.u = 0.8f;
    }

    public boolean a() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ld));
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
        org.telegram.ui.Components.t90 t90Var = new org.telegram.ui.Components.t90(0);
        float dp = AndroidUtilities.dp(3.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        t90Var.q = dp;
        t90Var.r = dp2;
        int length = text.length();
        t90Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, t90Var);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(t90Var.s, t90Var.u, t90Var.t, t90Var.v);
        this.a.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Components.ea0 ea0Var = this.b;
        ea0Var.y = t90Var;
        ea0Var.k(4.0f);
        int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.y6.Ld);
        ea0Var.g(org.telegram.ui.ActionBar.y6.o1(0.85f, themedColor), org.telegram.ui.ActionBar.y6.o1(2.0f, themedColor), org.telegram.ui.ActionBar.y6.o1(3.5f, themedColor), org.telegram.ui.ActionBar.y6.o1(6.0f, themedColor));
        ea0Var.l();
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
        org.telegram.ui.Components.ea0 ea0Var = this.b;
        if (a2 || ea0Var.d()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), paddingTop);
            ea0Var.draw(canvas);
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            int o12 = org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.I6, false));
            org.telegram.ui.Cells.y yVar = this.a;
            if (yVar != null && o12 != this.c) {
                org.telegram.ui.ActionBar.y6.E1(yVar, o12, true);
            }
            this.c = o12;
            org.telegram.ui.Components.ea0 ea0Var = this.b;
            if (ea0Var != null) {
                int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.y6.Ld);
                ea0Var.g(org.telegram.ui.ActionBar.y6.o1(0.85f, themedColor), org.telegram.ui.ActionBar.y6.o1(2.0f, themedColor), org.telegram.ui.ActionBar.y6.o1(3.5f, themedColor), org.telegram.ui.ActionBar.y6.o1(6.0f, themedColor));
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
