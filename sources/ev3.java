// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ev3 extends FrameLayout {
    public final EditTextBoldCursor a;

    public ev3(Context context) {
        super(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.a = editTextBoldCursor;
        anb.X(editTextBoldCursor, cmb.F6, null);
        anb.D(editTextBoldCursor, cmb.G6, null);
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setEllipsize(TextUtils.TruncateAt.END);
        editTextBoldCursor.setGravity((jb6.a0 ? 5 : 3) | 16);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setInputType(editTextBoldCursor.getInputType() | TLObject.FLAG_14);
        addView(editTextBoldCursor, qoe.d(-1, -1.0f, (jb6.a0 ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(String str) {
        EditTextBoldCursor editTextBoldCursor = this.a;
        editTextBoldCursor.setText("");
        editTextBoldCursor.setHint(str);
        setWillNotDraw(true);
    }

    public String getText() {
        return this.a.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(50.0f));
        this.a.measure(View.MeasureSpec.makeMeasureSpec(((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - gm.L(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
    }

    public void setTextColor(int i) {
        this.a.setTextColor(i);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
