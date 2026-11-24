// default package

import android.content.Context;
import android.widget.Scroller;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fh8 extends Scroller {
    public final /* synthetic */ gh8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh8(gh8 gh8Var, Context context) {
        super(context);
        this.a = gh8Var;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, i5 * (this.a.y0 ? 3 : 1));
    }
}
