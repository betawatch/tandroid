package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.e90;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class o6 extends FrameLayout {
    public final b90 a;
    public final e90 b;
    public final CheckBoxSquare c;

    public o6(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        addView(checkBoxSquare, k7.b6.d(18, 18.0f, (LocaleController.isRTL ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        b90 b90Var = new b90(this);
        this.a = b90Var;
        e90 e90Var = new e90(context, b90Var, f6Var);
        this.b = e90Var;
        e90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        e90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, f6Var));
        e90Var.setTextSize(1, 15.0f);
        e90Var.setMaxLines(2);
        e90Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        e90Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z4 = LocaleController.isRTL;
        addView(e90Var, k7.b6.d(-1, -1.0f, (z4 ? 5 : 3) | 48, z4 ? 16.0f : 58.0f, 21.0f, z4 ? 58.0f : 16.0f, 21.0f));
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
        b90 b90Var = this.a;
        if (b90Var != null) {
            canvas.save();
            e90 e90Var = this.b;
            canvas.translate(e90Var.getLeft(), e90Var.getTop());
            if (b90Var.f(canvas)) {
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
