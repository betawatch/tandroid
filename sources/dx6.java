// default package

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class dx6 extends zw6 {
    @Override // zw6
    public final ny6 c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.a.getCurrentControllerInfo();
        ny6 ny6Var = new ny6();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            gxc.d("package shouldn't be null");
            return null;
        }
        if (TextUtils.isEmpty(packageName)) {
            u36.j("packageName should be nonempty");
            return null;
        }
        ny6Var.a = new qy6(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
        return ny6Var;
    }

    @Override // zw6
    public final void e(ny6 ny6Var) {
    }
}
