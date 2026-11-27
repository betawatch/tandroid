// default package

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class hx6 extends gx6 {
    @Override // gx6
    public final ry6 c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.a.getCurrentControllerInfo();
        ry6 ry6Var = new ry6();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            p3d.h("package shouldn't be null");
            return null;
        }
        if (TextUtils.isEmpty(packageName)) {
            lq5.j("packageName should be nonempty");
            return null;
        }
        ry6Var.a = new ty6(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
        return ry6Var;
    }

    @Override // gx6
    public final void d(ry6 ry6Var) {
    }
}
