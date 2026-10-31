package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ft extends ShapeDrawable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ EditTextBoldCursor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.b = editTextBoldCursor;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.draw(canvas);
                this.b.G0 = true;
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = this.b;
                if (!editTextBoldCursor.d1) {
                    super.draw(canvas);
                    break;
                } else {
                    editTextBoldCursor.G0 = true;
                    break;
                }
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return org.telegram.messenger.i0.L(this.b.i0 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return org.telegram.messenger.i0.L(this.b.E0);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public ft(EditTextBoldCursor editTextBoldCursor) {
        this.b = editTextBoldCursor;
    }
}
