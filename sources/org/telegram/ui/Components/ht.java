package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ht extends ShapeDrawable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ EditTextBoldCursor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.b = editTextBoldCursor;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.draw(canvas);
                this.b.H0 = true;
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = this.b;
                if (!editTextBoldCursor.e1) {
                    super.draw(canvas);
                    break;
                } else {
                    editTextBoldCursor.H0 = true;
                    break;
                }
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return org.telegram.messenger.g0.L(this.b.j0 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return org.telegram.messenger.g0.L(this.b.F0);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public ht(EditTextBoldCursor editTextBoldCursor) {
        this.b = editTextBoldCursor;
    }
}
