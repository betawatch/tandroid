package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.k80;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class o6 extends FrameLayout {
    public final n2.o0 a;
    public final k80 b;
    public final CheckBoxSquare c;

    public o6(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        addView(checkBoxSquare, c8.ma.d(18, 18.0f, (gd.a0 ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        n2.o0 o0Var = new n2.o0(this);
        this.a = o0Var;
        k80 k80Var = new k80(context, o0Var, i6Var);
        this.b = k80Var;
        org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.J6, i6Var);
        k80Var.setTextSize(1, 15.0f);
        k80Var.setMaxLines(2);
        k80Var.setGravity((gd.a0 ? 5 : 3) | 16);
        k80Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = gd.a0;
        addView(k80Var, c8.ma.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 16.0f : 58.0f, 21.0f, z10 ? 58.0f : 16.0f, 21.0f));
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
            k80 k80Var = this.b;
            canvas.translate(k80Var.getLeft(), k80Var.getTop());
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
