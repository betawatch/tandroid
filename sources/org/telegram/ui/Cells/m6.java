package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.s70;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m6 extends FrameLayout {
    public final m2.p0 a;
    public final s70 b;
    public final CheckBoxSquare c;

    public m6(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
        this.c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        addView(checkBoxSquare, mf.d(18, 18.0f, (bd.a0 ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        m2.p0 p0Var = new m2.p0(this);
        this.a = p0Var;
        s70 s70Var = new s70(context, p0Var, e6Var);
        this.b = s70Var;
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.J6, e6Var);
        s70Var.setTextSize(1, 15.0f);
        s70Var.setMaxLines(2);
        s70Var.setGravity((bd.a0 ? 5 : 3) | 16);
        s70Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = bd.a0;
        addView(s70Var, mf.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 16.0f : 58.0f, 21.0f, z10 ? 58.0f : 16.0f, 21.0f));
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
        m2.p0 p0Var = this.a;
        if (p0Var != null) {
            canvas.save();
            s70 s70Var = this.b;
            canvas.translate(s70Var.getLeft(), s70Var.getTop());
            if (p0Var.h(canvas)) {
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
