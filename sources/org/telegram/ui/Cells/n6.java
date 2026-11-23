package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.j80;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class n6 extends FrameLayout {
    public final n2.p0 a;
    public final j80 b;
    public final CheckBoxSquare c;

    public n6(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        addView(checkBoxSquare, c8.na.d(18, 18.0f, (gd.a0 ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        n2.p0 p0Var = new n2.p0(this);
        this.a = p0Var;
        j80 j80Var = new j80(context, p0Var, i6Var);
        this.b = j80Var;
        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.J6, i6Var);
        j80Var.setTextSize(1, 15.0f);
        j80Var.setMaxLines(2);
        j80Var.setGravity((gd.a0 ? 5 : 3) | 16);
        j80Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = gd.a0;
        addView(j80Var, c8.na.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 16.0f : 58.0f, 21.0f, z10 ? 58.0f : 16.0f, 21.0f));
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
        n2.p0 p0Var = this.a;
        if (p0Var != null) {
            canvas.save();
            j80 j80Var = this.b;
            canvas.translate(j80Var.getLeft(), j80Var.getTop());
            if (p0Var.h(canvas)) {
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
