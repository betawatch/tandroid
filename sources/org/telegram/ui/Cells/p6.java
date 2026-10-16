package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.da0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class p6 extends FrameLayout {
    public final aa0 a;
    public final da0 b;
    public final CheckBoxSquare c;

    public p6(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        addView(checkBoxSquare, w7.z5.a(18.0f, 21.0f, 0.0f, 21.0f, 0.0f, 18, (LocaleController.isRTL ? 5 : 3) | 16));
        aa0 aa0Var = new aa0(this);
        this.a = aa0Var;
        da0 da0Var = new da0(context, aa0Var, c6Var);
        this.b = da0Var;
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.J6, c6Var));
        da0Var.setTextSize(1, 15.0f);
        da0Var.setMaxLines(2);
        da0Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        da0Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = LocaleController.isRTL;
        addView(da0Var, w7.z5.a(-1.0f, z10 ? 16.0f : 58.0f, 21.0f, z10 ? 58.0f : 16.0f, 21.0f, -1, (z10 ? 5 : 3) | 48));
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
        aa0 aa0Var = this.a;
        if (aa0Var != null) {
            canvas.save();
            da0 da0Var = this.b;
            canvas.translate(da0Var.getLeft(), da0Var.getTop());
            if (aa0Var.f(canvas)) {
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
