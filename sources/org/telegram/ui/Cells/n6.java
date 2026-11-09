package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.x70;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class n6 extends FrameLayout {
    public final n2.n0 a;
    public final x70 b;
    public final CheckBoxSquare c;

    public n6(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        addView(checkBoxSquare, c8.ha.d(18, 18.0f, (id.a0 ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        n2.n0 n0Var = new n2.n0(this);
        this.a = n0Var;
        x70 x70Var = new x70(context, n0Var, g6Var);
        this.b = x70Var;
        org.telegram.ui.ActionBar.s6.U(x70Var, org.telegram.ui.ActionBar.l6.G6, g6Var);
        org.telegram.ui.ActionBar.s6.G(x70Var, org.telegram.ui.ActionBar.l6.J6, g6Var);
        x70Var.setTextSize(1, 15.0f);
        x70Var.setMaxLines(2);
        x70Var.setGravity((id.a0 ? 5 : 3) | 16);
        x70Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z9 = id.a0;
        addView(x70Var, c8.ha.d(-1, -1.0f, (z9 ? 5 : 3) | 48, z9 ? 16.0f : 58.0f, 21.0f, z9 ? 58.0f : 16.0f, 21.0f));
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
        n2.n0 n0Var = this.a;
        if (n0Var != null) {
            canvas.save();
            x70 x70Var = this.b;
            canvas.translate(x70Var.getLeft(), x70Var.getTop());
            if (n0Var.h(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z9) {
        this.c.a(z9, true);
    }

    public void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
