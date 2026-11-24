// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class hw5 extends mu1 {
    public final /* synthetic */ rw5 vd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw5(rw5 rw5Var) {
        super(null);
        this.vd = rw5Var;
    }

    @Override // mu1
    public final boolean O7() {
        return false;
    }

    @Override // mu1, sy1
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final Activity getParentActivity() {
        return gl.W(this.vd.getContext());
    }

    @Override // mu1, org.telegram.ui.ActionBar.d
    public final wjb getResourceProvider() {
        return this.vd.G1;
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
