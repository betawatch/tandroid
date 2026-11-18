package m2;

import a8.la;
import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class h implements r0.d, r0.f {
    public final /* synthetic */ int a = 0;
    public Object b;

    public h() {
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
        return new r0.g(new h(((ContentInfo.Builder) this.b).build()));
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
        la.p(logSessionId3.equals(logSessionId2));
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

    public h(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.b = contentInfo;
    }

    public h(ClipData clipData, int i7) {
        this.b = r0.c.a(clipData, i7);
    }
}
