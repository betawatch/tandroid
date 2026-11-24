// default package

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.utils.twidget.x;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class jwc implements dm4 {
    public final /* synthetic */ Context a;

    public jwc(Context context) {
        this.a = context;
    }

    @Override // dm4
    public final void a() {
        x xVar = x.v;
        synchronized (xVar.a) {
            xVar.l = false;
        }
        xVar.b.removeCallbacks(xVar.u);
        xVar.b.postDelayed(xVar.u, 30000L);
    }

    @Override // dm4
    public final void b() {
        Utilities.e.c(new vf1(this.a, (byte) 29));
    }
}
