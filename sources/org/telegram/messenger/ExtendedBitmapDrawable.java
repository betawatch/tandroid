package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class ExtendedBitmapDrawable extends BitmapDrawable {
    private int invert;
    private int orientation;

    public ExtendedBitmapDrawable(Bitmap bitmap, int i10, int i11) {
        super(bitmap);
        this.invert = i11;
        this.orientation = i10;
    }

    public int getInvert() {
        return this.invert;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public boolean invertHorizontally() {
        return (this.invert & 1) != 0;
    }

    public boolean invertVertically() {
        return (this.invert & 2) != 0;
    }
}
