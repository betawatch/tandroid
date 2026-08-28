package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ft extends ShapeDrawable {
    public final /* synthetic */ int a = 0;
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
        int i9;
        switch (this.a) {
            case 0:
                i9 = this.b.cursorSize;
                return AndroidUtilities.dp(i9 + 20);
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

    public ft(EditTextBoldCursor editTextBoldCursor) {
        this.b = editTextBoldCursor;
    }
}
