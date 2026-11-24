// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class eda extends zya {
    public final /* synthetic */ nfa L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eda(nfa nfaVar, Context context, cda cdaVar) {
        super(context, cdaVar, 1, null);
        this.L = nfaVar;
    }

    @Override // zya
    public final void a() {
        invalidate();
        this.L.K0();
    }
}
