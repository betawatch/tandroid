package androidx.media;

import android.media.session.MediaSessionManager;

/* loaded from: classes.dex */
final class MediaSessionManagerImplApi28$RemoteUserInfoImplApi28 extends MediaSessionManagerImplBase$RemoteUserInfoImplBase {
    final MediaSessionManager.RemoteUserInfo mObject;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    MediaSessionManagerImplApi28$RemoteUserInfoImplApi28(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(r0, r1, r2);
        String packageName;
        int pid;
        int uid;
        packageName = remoteUserInfo.getPackageName();
        pid = remoteUserInfo.getPid();
        uid = remoteUserInfo.getUid();
        this.mObject = remoteUserInfo;
    }

    MediaSessionManagerImplApi28$RemoteUserInfoImplApi28(String str, int i, int i2) {
        super(str, i, i2);
        this.mObject = new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    static String getPackageName(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName;
        packageName = remoteUserInfo.getPackageName();
        return packageName;
    }
}
