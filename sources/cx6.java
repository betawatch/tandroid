// default package

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class cx6 extends bx6 {
    @Override // bx6
    public final my6 c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.a.getCurrentControllerInfo();
        my6 my6Var = new my6();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            gxc.d("package shouldn't be null");
            return null;
        }
        if (TextUtils.isEmpty(packageName)) {
            u36.j("packageName should be nonempty");
            return null;
        }
        my6Var.a = new oy6(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
        return my6Var;
    }

    @Override // bx6
    public final void d(my6 my6Var) {
    }
}
