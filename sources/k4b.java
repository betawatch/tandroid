// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
