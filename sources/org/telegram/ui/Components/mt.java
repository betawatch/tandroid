package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class mt extends ShapeDrawable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ EditTextBoldCursor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
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
        float f9;
        switch (this.a) {
            case 0:
                f9 = this.b.cursorWidth;
                return AndroidUtilities.dp(f9);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public mt(EditTextBoldCursor editTextBoldCursor) {
        this.b = editTextBoldCursor;
    }
}
