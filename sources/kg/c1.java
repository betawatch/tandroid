package kg;

import android.content.Context;
import android.widget.Scroller;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class c1 extends Scroller {
    public final /* synthetic */ d1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d1 d1Var, Context context) {
        super(context);
        this.a = d1Var;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i10, int i11, int i12, int i13, int i14) {
        super.startScroll(i10, i11, i12, i13, (this.a.x0 ? 3 : 1) * i14);
    }
}
