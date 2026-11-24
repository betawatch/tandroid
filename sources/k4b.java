// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class k4b extends d46 {
    public final /* synthetic */ m4b u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4b(m4b m4bVar, Context context, float f) {
        super(context, f);
        this.u0 = m4bVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        this.u0.d.invalidate();
        super.invalidate();
    }
}
