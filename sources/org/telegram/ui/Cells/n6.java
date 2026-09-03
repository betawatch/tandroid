package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.f90;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class n6 extends FrameLayout {
    public final c90 a;
    public final f90 b;
    public final CheckBoxSquare c;

    public n6(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        addView(checkBoxSquare, k7.b6.d(18, 18.0f, (LocaleController.isRTL ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        c90 c90Var = new c90(this);
        this.a = c90Var;
        f90 f90Var = new f90(context, c90Var, f6Var);
        this.b = f90Var;
        f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, f6Var));
        f90Var.setTextSize(1, 15.0f);
        f90Var.setMaxLines(2);
        f90Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        f90Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z4 = LocaleController.isRTL;
        addView(f90Var, k7.b6.d(-1, -1.0f, (z4 ? 5 : 3) | 48, z4 ? 16.0f : 58.0f, 21.0f, z4 ? 58.0f : 16.0f, 21.0f));
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
        c90 c90Var = this.a;
        if (c90Var != null) {
            canvas.save();
            f90 f90Var = this.b;
            canvas.translate(f90Var.getLeft(), f90Var.getTop());
            if (c90Var.f(canvas)) {
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
