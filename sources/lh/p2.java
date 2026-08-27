package lh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class p2 extends ImageView implements q2 {
    @Override // lh.q2
    public void setInvert(float f10) {
        setColorFilter(new PorterDuffColorFilter(i0.b.d(f10, -1, -16777216), PorterDuff.Mode.MULTIPLY));
    }
}
