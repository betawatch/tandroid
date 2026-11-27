// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.CheckBoxSquare;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class b69 extends FrameLayout {
    public final m66 a;
    public final p66 b;
    public final CheckBoxSquare c;

    public b69(Context context, vnb vnbVar) {
        super(context);
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(null, context, false);
        this.c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        addView(checkBoxSquare, tre.d(18, 18.0f, (ob6.a0 ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        m66 m66Var = new m66(this);
        this.a = m66Var;
        p66 p66Var = new p66(context, m66Var, vnbVar);
        this.b = p66Var;
        yob.X(p66Var, aob.G6, vnbVar);
        yob.G(p66Var, aob.J6, vnbVar);
        p66Var.setTextSize(1, 15.0f);
        p66Var.setMaxLines(2);
        p66Var.setGravity((ob6.a0 ? 5 : 3) | 16);
        p66Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z = ob6.a0;
        addView(p66Var, tre.d(-1, -1.0f, (z ? 5 : 3) | 48, z ? 16.0f : 58.0f, 21.0f, z ? 58.0f : 16.0f, 21.0f));
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
        m66 m66Var = this.a;
        if (m66Var != null) {
            canvas.save();
            p66 p66Var = this.b;
            canvas.translate(p66Var.getLeft(), p66Var.getTop());
            if (m66Var.g(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z) {
        this.c.a(z, true);
    }

    public void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
