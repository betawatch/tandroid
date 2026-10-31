package j2;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k implements r0.d, r0.f {
    public final /* synthetic */ int a = 0;
    public Object b;

    public k() {
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
        return new r0.g(new k(((ContentInfo.Builder) this.b).build()));
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
        t6.p(logSessionId3.equals(logSessionId2));
        this.b = logSessionId;
    }

    @Override // r0.f
    public int l() {
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

    public k(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.b = contentInfo;
    }

    public k(ClipData clipData, int i10) {
        this.b = r0.c.a(clipData, i10);
    }
}
