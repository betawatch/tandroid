package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.p90;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class p6 extends FrameLayout {
    public final m90 a;
    public final p90 b;
    public final CheckBoxSquare c;

    public p6(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        addView(checkBoxSquare, w7.y5.d(18, 18.0f, (LocaleController.isRTL ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        m90 m90Var = new m90(this);
        this.a = m90Var;
        p90 p90Var = new p90(context, m90Var, d6Var);
        this.b = p90Var;
        p90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        p90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.J6, d6Var));
        p90Var.setTextSize(1, 15.0f);
        p90Var.setMaxLines(2);
        p90Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        p90Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = LocaleController.isRTL;
        addView(p90Var, w7.y5.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 16.0f : 58.0f, 21.0f, z10 ? 58.0f : 16.0f, 21.0f));
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
        m90 m90Var = this.a;
        if (m90Var != null) {
            canvas.save();
            p90 p90Var = this.b;
            canvas.translate(p90Var.getLeft(), p90Var.getTop());
            if (m90Var.f(canvas)) {
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
