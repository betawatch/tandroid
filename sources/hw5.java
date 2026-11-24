// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hw5 extends mu1 {
    public final /* synthetic */ rw5 wd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw5(rw5 rw5Var) {
        super(null);
        this.wd = rw5Var;
    }

    @Override // mu1
    public final boolean Q7() {
        return false;
    }

    @Override // mu1, sy1
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final Activity getParentActivity() {
        return gl.W(this.wd.getContext());
    }

    @Override // mu1, org.telegram.ui.ActionBar.d
    public final wjb getResourceProvider() {
        return this.wd.G1;
    }

    @Override // mu1, sy1
    public final TLRPC.User h() {
        return y6c.h(this.currentAccount).f();
    }

    @Override // mu1, org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return false;
    }
}
