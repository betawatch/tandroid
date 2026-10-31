package jg;

import android.app.Activity;
import org.telegram.messenger.d20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f0 extends un {
    public final /* synthetic */ r0 jd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(r0 r0Var) {
        super(null);
        this.jd = r0Var;
    }

    @Override // org.telegram.ui.un
    public final boolean J9() {
        return false;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.Components.gg, org.telegram.ui.Components.s40
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.k2, org.telegram.ui.Components.s40
    public final Activity getParentActivity() {
        return org.telegram.messenger.i0.W(this.jd.getContext());
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.k2
    public final p6 getResourceProvider() {
        return this.jd.z1;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.Components.gg
    public final TLRPC.User j() {
        return d20.i(this.currentAccount).f();
    }
}
