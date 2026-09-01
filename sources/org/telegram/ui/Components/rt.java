package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class rt extends ShapeDrawable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ EditTextBoldCursor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.b = editTextBoldCursor;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.b;
                if (!editTextBoldCursor.drawInMaim) {
                    super.draw(canvas);
                    break;
                } else {
                    editTextBoldCursor.cursorDrawn = true;
                    break;
                }
            default:
                super.draw(canvas);
                this.b.cursorDrawn = true;
                break;
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i10;
        switch (this.a) {
            case 0:
                i10 = this.b.cursorSize;
                return AndroidUtilities.dp(i10 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        float f10;
        switch (this.a) {
            case 0:
                f10 = this.b.cursorWidth;
                return AndroidUtilities.dp(f10);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public rt(EditTextBoldCursor editTextBoldCursor) {
        this.b = editTextBoldCursor;
    }
}
