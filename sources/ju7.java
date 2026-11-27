// default package

import android.content.Context;
import android.graphics.Typeface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ju7 extends lu7 {
    public final m7 M;

    public ju7(Context context) {
        super(context, null);
        m7 m7Var = new m7((byte) 5, context, this);
        this.M = m7Var;
        m7Var.setTextSize(1, 18.0f);
        yob.X(m7Var, aob.G6, null);
        yob.D(m7Var, aob.H6, null);
        m7Var.setBackground(null);
        m7Var.setSingleLine(true);
        m7Var.setInputType(1);
        m7Var.setTypeface(Typeface.DEFAULT);
        yob.l(m7Var, 30, aob.l6, null);
        m7Var.setCursorWidth(1.5f);
        m7Var.setPadding(hl.L(15.0f), 0, hl.L(15.0f), 0);
        e(m7Var);
        addView(m7Var, tre.e(-1, -2, 16));
    }

    public EditTextBoldCursor getEditText() {
        return this.M;
    }

    public void setHint(String str) {
        setText(str);
    }

    @Override // lu7, snb
    public final void updateColors() {
        super.updateColors();
        try {
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
