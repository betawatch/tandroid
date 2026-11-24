// default package

import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class e02 extends ky1 {
    public final /* synthetic */ x02 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e02(x02 x02Var, wjb wjbVar, Context context) {
        super(R.drawable.send_plane_24, wjbVar, context, false);
        this.y0 = x02Var;
    }

    @Override // ky1
    public final boolean b() {
        return false;
    }

    @Override // ky1
    public final boolean c() {
        return !this.y0.R2;
    }

    @Override // ky1
    public final int getFillColor() {
        return bkb.v0(bkb.R5, this.y0.J0);
    }
}
