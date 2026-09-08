package j2;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class j implements r0.d, r0.f {
    public final /* synthetic */ int a = 0;
    public Object b;

    public j() {
        LogSessionId logSessionId;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        this.b = logSessionId;
    }

    @Override // r0.f
    public ClipData a() {
        return ((ContentInfo) this.b).getClip();
    }

    @Override // r0.d
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    @Override // r0.d
    public r0.g build() {
        return new r0.g(new j(((ContentInfo.Builder) this.b).build()));
    }

    @Override // r0.d
    public void c(int i10) {
        ((ContentInfo.Builder) this.b).setFlags(i10);
    }

    @Override // r0.f
    public ContentInfo d() {
        return (ContentInfo) this.b;
    }

    @Override // r0.f
    public int e() {
        return ((ContentInfo) this.b).getSource();
    }

    public void f(LogSessionId logSessionId) {
        LogSessionId logSessionId2;
        LogSessionId logSessionId3 = (LogSessionId) this.b;
        logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
        e2.d.g(logSessionId3.equals(logSessionId2));
        this.b = logSessionId;
    }

    @Override // r0.f
    public int k() {
        return ((ContentInfo) this.b).getFlags();
    }

    @Override // r0.d
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    public j(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.b = contentInfo;
    }

    public j(ClipData clipData, int i10) {
        this.b = r0.c.a(clipData, i10);
    }
}
