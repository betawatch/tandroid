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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class gd0 extends TextView implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Cells.y a;
    public final org.telegram.ui.Components.ca0 b;
    public int c;
    public final /* synthetic */ ig0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd0(ig0 ig0Var, Context context) {
        super(context);
        this.d = ig0Var;
        int i10 = org.telegram.ui.ActionBar.k6.I6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.x0(null, i10, false)), 7, -1);
        this.a = g02;
        org.telegram.ui.Components.ca0 ca0Var = new org.telegram.ui.Components.ca0();
        this.b = ca0Var;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.a;
        this.c = org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        g02.setCallback(this);
        ca0Var.D = true;
        ca0Var.u = 0.8f;
    }

    public boolean a() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ld));
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
        org.telegram.ui.Components.s90 s90Var = new org.telegram.ui.Components.s90(0);
        float dp = AndroidUtilities.dp(3.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        s90Var.q = dp;
        s90Var.r = dp2;
        int length = text.length();
        s90Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, s90Var);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(s90Var.s, s90Var.u, s90Var.t, s90Var.v);
        this.a.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Components.ca0 ca0Var = this.b;
        ca0Var.y = s90Var;
        ca0Var.k(4.0f);
        int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.k6.Ld);
        ca0Var.g(org.telegram.ui.ActionBar.k6.o1(0.85f, themedColor), org.telegram.ui.ActionBar.k6.o1(2.0f, themedColor), org.telegram.ui.ActionBar.k6.o1(3.5f, themedColor), org.telegram.ui.ActionBar.k6.o1(6.0f, themedColor));
        ca0Var.l();
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
        org.telegram.ui.Components.ca0 ca0Var = this.b;
        if (a2 || ca0Var.d()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), paddingTop);
            ca0Var.draw(canvas);
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            int o12 = org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I6, false));
            org.telegram.ui.Cells.y yVar = this.a;
            if (yVar != null && o12 != this.c) {
                org.telegram.ui.ActionBar.k6.E1(yVar, o12, true);
            }
            this.c = o12;
            org.telegram.ui.Components.ca0 ca0Var = this.b;
            if (ca0Var != null) {
                int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.k6.Ld);
                ca0Var.g(org.telegram.ui.ActionBar.k6.o1(0.85f, themedColor), org.telegram.ui.ActionBar.k6.o1(2.0f, themedColor), org.telegram.ui.ActionBar.k6.o1(3.5f, themedColor), org.telegram.ui.ActionBar.k6.o1(6.0f, themedColor));
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
