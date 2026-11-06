package fi;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class n2 extends ImageView implements o2 {
    @Override // fi.o2
    public void setInvert(float f10) {
        setColorFilter(new PorterDuffColorFilter(i0.a.f(f10, -1, -16777216), PorterDuff.Mode.MULTIPLY));
    }
}
