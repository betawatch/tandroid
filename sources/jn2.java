// default package

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jn2 extends FrameLayout {
    public final TextView a;
    public final gn2 b;
    public final EditTextBoldCursor c;
    public byte d;
    public boolean e;
    public final /* synthetic */ ln2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn2(ln2 ln2Var, Context context) {
        super(context);
        this.f = ln2Var;
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gm.o());
        addView(textView, qoe.d(-2, -2.0f, 3, 8.0f, 0.0f, 8.0f, 0.0f));
        gn2 gn2Var = new gn2(ln2Var, context);
        this.b = gn2Var;
        addView(gn2Var, qoe.d(-1, -1.0f, 3, 0.0f, 16.0f, 78.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(cmb.b0(gm.L(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(jb6.M0(2131751291, null), 6);
        byte b = 2;
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(gm.o());
        editTextBoldCursor.addTextChangedListener(new qz(this));
        editTextBoldCursor.setOnFocusChangeListener(new tt0(this, b));
        editTextBoldCursor.setOnEditorActionListener(new nh(b));
        addView(editTextBoldCursor, qoe.e(72, 36, 85));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i) {
        this.d = i;
        this.b.c = i;
        TextView textView = this.a;
        if (i == 0) {
            textView.setText(jb6.M0(2131747397, null).toUpperCase());
        } else if (i == 1) {
            textView.setText(jb6.M0(2131747399, null).toUpperCase());
        } else if (i == 2) {
            textView.setText(jb6.M0(2131747400, null).toUpperCase());
        }
        b();
    }

    public final void b() {
        this.e = true;
        gn2 gn2Var = this.b;
        gn2Var.d = on2.p(gn2Var.e.p1, nm7.d4);
        gn2Var.a();
        gn2Var.invalidate();
        EditTextBoldCursor editTextBoldCursor = this.c;
        int selectionStart = editTextBoldCursor.getSelectionStart();
        int selectionEnd = editTextBoldCursor.getSelectionEnd();
        byte b = this.d;
        ln2 ln2Var = this.f;
        if (b == 0) {
            editTextBoldCursor.setText(String.valueOf(Color.red(ln2Var.p1)));
        } else if (b == 1) {
            editTextBoldCursor.setText(String.valueOf(Color.green(ln2Var.p1)));
        } else if (b == 2) {
            editTextBoldCursor.setText(String.valueOf(Color.blue(ln2Var.p1)));
        }
        editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        this.e = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(52.0f), TLObject.FLAG_30));
    }
}
