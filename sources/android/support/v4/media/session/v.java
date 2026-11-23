package android.support.v4.media.session;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
