package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.m80;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class o6 extends FrameLayout {
    public final n2.o0 a;
    public final m80 b;
    public final CheckBoxSquare c;

    public o6(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        addView(checkBoxSquare, c8.ma.d(18, 18.0f, (hd.a0 ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        n2.o0 o0Var = new n2.o0(this);
        this.a = o0Var;
        m80 m80Var = new m80(context, o0Var, h6Var);
        this.b = m80Var;
        org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.J6, h6Var);
        m80Var.setTextSize(1, 15.0f);
        m80Var.setMaxLines(2);
        m80Var.setGravity((hd.a0 ? 5 : 3) | 16);
        m80Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = hd.a0;
        addView(m80Var, c8.ma.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 16.0f : 58.0f, 21.0f, z10 ? 58.0f : 16.0f, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.c;
    }

    public TextView getTextView() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        n2.o0 o0Var = this.a;
        if (o0Var != null) {
            canvas.save();
            m80 m80Var = this.b;
            canvas.translate(m80Var.getLeft(), m80Var.getTop());
            if (o0Var.h(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z10) {
        this.c.a(z10, true);
    }

    public void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
