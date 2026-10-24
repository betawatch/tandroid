package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class cu extends ShapeDrawable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ EditTextBoldCursor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
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
        float f7;
        switch (this.a) {
            case 0:
                f7 = this.b.cursorWidth;
                return AndroidUtilities.dp(f7);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public cu(EditTextBoldCursor editTextBoldCursor) {
        this.b = editTextBoldCursor;
    }
}
