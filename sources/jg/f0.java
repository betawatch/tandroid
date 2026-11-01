package jg;

import android.app.Activity;
import org.telegram.messenger.e20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f0 extends un {
    public final /* synthetic */ r0 kd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(r0 r0Var) {
        super(null);
        this.kd = r0Var;
    }

    @Override // org.telegram.ui.un
    public final boolean O9() {
        return false;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.Components.gg, org.telegram.ui.Components.s40
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.k2, org.telegram.ui.Components.s40
    public final Activity getParentActivity() {
        return org.telegram.messenger.i0.W(this.kd.getContext());
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.k2
    public final p6 getResourceProvider() {
        return this.kd.z1;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.Components.gg
    public final TLRPC.User j() {
        return e20.i(this.currentAccount).f();
    }
}
