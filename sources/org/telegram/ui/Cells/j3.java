package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class j3 extends FrameLayout {
    public final EditTextBoldCursor a;
    public boolean b;

    public j3(Context context) {
        super(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.a = editTextBoldCursor;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setEllipsize(TextUtils.TruncateAt.END);
        editTextBoldCursor.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setInputType(editTextBoldCursor.getInputType() | 16384);
        addView(editTextBoldCursor, w7.x5.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public String getText() {
        return this.a.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.b ? 1 : 0));
        this.a.measure(View.MeasureSpec.makeMeasureSpec(((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
    }

    public void setTextColor(int i10) {
        this.a.setTextColor(i10);
    }
}
