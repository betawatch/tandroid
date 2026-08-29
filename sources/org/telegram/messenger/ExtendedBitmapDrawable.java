package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
