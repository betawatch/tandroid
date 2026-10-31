package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n3 extends FrameLayout {
    public final EditTextBoldCursor a;

    public n3(Context context) {
        super(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.a = editTextBoldCursor;
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, org.telegram.ui.ActionBar.t6.G6, null);
        org.telegram.ui.ActionBar.a7.E(editTextBoldCursor, org.telegram.ui.ActionBar.t6.H6, null);
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setEllipsize(TextUtils.TruncateAt.END);
        editTextBoldCursor.setGravity((cd.X ? 5 : 3) | 16);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setInputType(editTextBoldCursor.getInputType() | TLObject.FLAG_14);
        addView(editTextBoldCursor, w7.b6.d(-1, -1.0f, (cd.X ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
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
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(50.0f));
        this.a.measure(View.MeasureSpec.makeMeasureSpec(((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.i0.L(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
    }

    public void setTextColor(int i10) {
        this.a.setTextColor(i10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
