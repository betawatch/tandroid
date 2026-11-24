// default package

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class b28 extends w4b {
    public final /* synthetic */ m8b I;
    public final /* synthetic */ y28 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b28(y28 y28Var, Context context, d28 d28Var, f53 f53Var, m8b m8bVar) {
        super(context, d28Var, f53Var);
        this.J = y28Var;
        this.I = m8bVar;
    }

    @Override // w4b
    public final void b(boolean z) {
        t28 t28Var = this.J.G1;
        if (t28Var != null) {
            m8b m8bVar = ((d8b) t28Var).d;
            m8bVar.i1 = z;
            m8bVar.U();
        }
    }

    @Override // w4b
    public final Bitmap getPlayingBitmap() {
        return this.J.getPlayingBitmap();
    }
}
