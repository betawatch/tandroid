package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.l80;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o6 extends FrameLayout {
    public final i80 a;
    public final l80 b;
    public final CheckBoxSquare c;

    public o6(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        addView(checkBoxSquare, g7.e6.d(18, 18.0f, (LocaleController.isRTL ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        i80 i80Var = new i80(this);
        this.a = i80Var;
        l80 l80Var = new l80(context, i80Var, b6Var);
        this.b = l80Var;
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.J6, b6Var));
        l80Var.setTextSize(1, 15.0f);
        l80Var.setMaxLines(2);
        l80Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        l80Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = LocaleController.isRTL;
        addView(l80Var, g7.e6.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 16.0f : 58.0f, 21.0f, z10 ? 58.0f : 16.0f, 21.0f));
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
        i80 i80Var = this.a;
        if (i80Var != null) {
            canvas.save();
            l80 l80Var = this.b;
            canvas.translate(l80Var.getLeft(), l80Var.getTop());
            if (i80Var.f(canvas)) {
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
