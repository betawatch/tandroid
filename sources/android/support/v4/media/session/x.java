package android.support.v4.media.session;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public class x extends w {
    @Override // android.support.v4.media.session.v, android.support.v4.media.session.t
    public final y1.a b() {
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

    @Override // android.support.v4.media.session.v, android.support.v4.media.session.t
    public final void c(y1.a aVar) {
    }
}
