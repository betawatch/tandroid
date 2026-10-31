package n4;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class m extends l {
    @Override // n4.l
    public final r c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.a.getCurrentControllerInfo();
        r rVar = new r();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        rVar.a = new s(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
        return rVar;
    }

    @Override // n4.l
    public final void d(r rVar) {
    }
}
