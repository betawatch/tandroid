package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.p80;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r6 extends FrameLayout {
    public final ji.a a;
    public final p80 b;
    public final CheckBoxSquare c;

    public r6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        addView(checkBoxSquare, w7.b6.d(18, 18.0f, (cd.X ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        ji.a aVar = new ji.a(this);
        this.a = aVar;
        p80 p80Var = new p80(context, aVar, p6Var);
        this.b = p80Var;
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.J6, p6Var);
        p80Var.setTextSize(1, 15.0f);
        p80Var.setMaxLines(2);
        p80Var.setGravity((cd.X ? 5 : 3) | 16);
        p80Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = cd.X;
        addView(p80Var, w7.b6.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 16.0f : 58.0f, 21.0f, z10 ? 58.0f : 16.0f, 21.0f));
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
        ji.a aVar = this.a;
        if (aVar != null) {
            canvas.save();
            p80 p80Var = this.b;
            canvas.translate(p80Var.getLeft(), p80Var.getTop());
            if (aVar.h(canvas)) {
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
