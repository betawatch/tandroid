package android.support.v4.media.session;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class v extends u {
    @Override // android.support.v4.media.session.u
    public final b2.a c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.a.getCurrentControllerInfo();
        b2.a aVar = new b2.a();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        aVar.a = new b2.c(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
        return aVar;
    }

    @Override // android.support.v4.media.session.u
    public final void f(b2.a aVar) {
    }
}
