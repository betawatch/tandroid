package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.g90;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class o6 extends FrameLayout {
    public final d90 a;
    public final g90 b;
    public final CheckBoxSquare c;

    public o6(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        addView(checkBoxSquare, k7.c6.d(18, 18.0f, (LocaleController.isRTL ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        d90 d90Var = new d90(this);
        this.a = d90Var;
        g90 g90Var = new g90(context, d90Var, g6Var);
        this.b = g90Var;
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.J6, g6Var));
        g90Var.setTextSize(1, 15.0f);
        g90Var.setMaxLines(2);
        g90Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        g90Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z4 = LocaleController.isRTL;
        addView(g90Var, k7.c6.d(-1, -1.0f, (z4 ? 5 : 3) | 48, z4 ? 16.0f : 58.0f, 21.0f, z4 ? 58.0f : 16.0f, 21.0f));
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
        d90 d90Var = this.a;
        if (d90Var != null) {
            canvas.save();
            g90 g90Var = this.b;
            canvas.translate(g90Var.getLeft(), g90Var.getTop());
            if (d90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z4) {
        this.c.a(z4, true);
    }

    public void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
