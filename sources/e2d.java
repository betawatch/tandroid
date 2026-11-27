// default package

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class e2d extends d2d {
    public e2d(l2d l2dVar, WindowInsets windowInsets) {
        super(l2dVar, windowInsets);
    }

    @Override // i2d
    public l2d a() {
        return l2d.h(null, this.c.consumeDisplayCutout());
    }

    @Override // i2d
    public cp3 e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new cp3(displayCutout);
    }

    @Override // c2d, i2d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2d)) {
            return false;
        }
        e2d e2dVar = (e2d) obj;
        return Objects.equals(this.c, e2dVar.c) && Objects.equals(this.g, e2dVar.g) && c2d.B(this.h, e2dVar.h);
    }

    @Override // i2d
    public int hashCode() {
        return this.c.hashCode();
    }
}
