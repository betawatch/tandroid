package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.z80;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class o6 extends FrameLayout {
    public final z80 a;
    public final c90 b;
    public final CheckBoxSquare c;

    public o6(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        addView(checkBoxSquare, w7.x5.d(18, 18.0f, (LocaleController.isRTL ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        z80 z80Var = new z80(this);
        this.a = z80Var;
        c90 c90Var = new c90(context, z80Var, f6Var);
        this.b = c90Var;
        c90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        c90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, f6Var));
        c90Var.setTextSize(1, 15.0f);
        c90Var.setMaxLines(2);
        c90Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        c90Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = LocaleController.isRTL;
        addView(c90Var, w7.x5.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 16.0f : 58.0f, 21.0f, z10 ? 58.0f : 16.0f, 21.0f));
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
        z80 z80Var = this.a;
        if (z80Var != null) {
            canvas.save();
            c90 c90Var = this.b;
            canvas.translate(c90Var.getLeft(), c90Var.getTop());
            if (z80Var.f(canvas)) {
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
