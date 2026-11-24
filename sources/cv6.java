// default package

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class cv6 extends bv6 {
    @Override // bv6
    public final mw6 c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.a.getCurrentControllerInfo();
        mw6 mw6Var = new mw6();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            fvc.f("package shouldn't be null");
            return null;
        }
        if (TextUtils.isEmpty(packageName)) {
            w26.j("packageName should be nonempty");
            return null;
        }
        mw6Var.a = new ow6(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
        return mw6Var;
    }

    @Override // bv6
    public final void d(mw6 mw6Var) {
    }
}
