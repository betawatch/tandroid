// default package

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class ix6 extends ex6 {
    @Override // ex6
    public final sy6 c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.a.getCurrentControllerInfo();
        sy6 sy6Var = new sy6();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            p3d.h("package shouldn't be null");
            return null;
        }
        if (TextUtils.isEmpty(packageName)) {
            lq5.j("packageName should be nonempty");
            return null;
        }
        sy6Var.a = new vy6(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
        return sy6Var;
    }

    @Override // ex6
    public final void e(sy6 sy6Var) {
    }
}
