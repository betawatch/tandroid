package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.ea0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class p6 extends FrameLayout {
    public final ba0 a;
    public final ea0 b;
    public final CheckBoxSquare c;

    public p6(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        addView(checkBoxSquare, w7.x5.a(18.0f, 21.0f, 0.0f, 21.0f, 0.0f, 18, (LocaleController.isRTL ? 5 : 3) | 16));
        ba0 ba0Var = new ba0(this);
        this.a = ba0Var;
        ea0 ea0Var = new ea0(context, ba0Var, e6Var);
        this.b = ea0Var;
        ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.J6, e6Var));
        ea0Var.setTextSize(1, 15.0f);
        ea0Var.setMaxLines(2);
        ea0Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        ea0Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = LocaleController.isRTL;
        addView(ea0Var, w7.x5.a(-1.0f, z10 ? 16.0f : 58.0f, 21.0f, z10 ? 58.0f : 16.0f, 21.0f, -1, (z10 ? 5 : 3) | 48));
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
        ba0 ba0Var = this.a;
        if (ba0Var != null) {
            canvas.save();
            ea0 ea0Var = this.b;
            canvas.translate(ea0Var.getLeft(), ea0Var.getTop());
            if (ba0Var.f(canvas)) {
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
