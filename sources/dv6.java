// default package

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class dv6 extends zu6 {
    @Override // zu6
    public final nw6 c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.a.getCurrentControllerInfo();
        nw6 nw6Var = new nw6();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            fvc.f("package shouldn't be null");
            return null;
        }
        if (TextUtils.isEmpty(packageName)) {
            w26.j("packageName should be nonempty");
            return null;
        }
        nw6Var.a = new qw6(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
        return nw6Var;
    }

    @Override // zu6
    public final void e(nw6 nw6Var) {
    }
}
