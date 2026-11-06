package m2;

import a8.ia;
import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class i implements r0.d, r0.f {
    public final /* synthetic */ int a = 0;
    public Object b;

    public i() {
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
        return new r0.g(new i(((ContentInfo.Builder) this.b).build()));
    }

    @Override // r0.d
    public void c(int i7) {
        ((ContentInfo.Builder) this.b).setFlags(i7);
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
        ia.p(logSessionId3.equals(logSessionId2));
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

    public i(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.b = contentInfo;
    }

    public i(ClipData clipData, int i7) {
        this.b = r0.c.a(clipData, i7);
    }
}
