// default package

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.utils.twidget.x;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
