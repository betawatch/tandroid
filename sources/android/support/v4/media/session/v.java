package android.support.v4.media.session;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class v extends u {
    @Override // android.support.v4.media.session.u
    public final y1.a c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.a.getCurrentControllerInfo();
        y1.a aVar = new y1.a();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        aVar.a = new y1.c(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
        return aVar;
    }

    @Override // android.support.v4.media.session.u
    public final void f(y1.a aVar) {
    }
}
