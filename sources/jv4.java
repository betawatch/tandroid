// default package

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jv4 extends tl {
    public final /* synthetic */ kv4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv4(kv4 kv4Var, ViewGroup viewGroup, int i) {
        super(i, viewGroup);
        this.N = kv4Var;
    }

    @Override // tl, dm
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = this.N;
        if (drawable.getCallback() != null) {
            drawable.getCallback().invalidateDrawable(drawable);
        }
    }
}
