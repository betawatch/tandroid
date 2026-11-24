// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ki4 extends ImageView implements li4 {
    @Override // li4
    public void setInvert(float f) {
        setColorFilter(new PorterDuffColorFilter(bm2.f(f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
    }
}
