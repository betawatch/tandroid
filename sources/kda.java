// default package

import android.content.Context;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class kda extends ScrollSlidingTextTabStrip {
    public final /* synthetic */ nfa q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kda(nfa nfaVar, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.q0 = nfaVar;
    }

    @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip
    public final int e(int i) {
        return this.q0.c1(i);
    }
}
