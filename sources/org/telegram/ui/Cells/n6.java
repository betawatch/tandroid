package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n6 extends FrameLayout {
    public final n2.n0 a;
    public final w70 b;
    public final CheckBoxSquare c;

    public n6(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
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
        w70 w70Var = new w70(context, n0Var, h6Var);
        this.b = w70Var;
        org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.J6, h6Var);
        w70Var.setTextSize(1, 15.0f);
        w70Var.setMaxLines(2);
        w70Var.setGravity((id.a0 ? 5 : 3) | 16);
        w70Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z9 = id.a0;
        addView(w70Var, c8.ha.d(-1, -1.0f, (z9 ? 5 : 3) | 48, z9 ? 16.0f : 58.0f, 21.0f, z9 ? 58.0f : 16.0f, 21.0f));
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
            w70 w70Var = this.b;
            canvas.translate(w70Var.getLeft(), w70Var.getTop());
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
