package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public class n {
    public final MediaSession a;
    public final m b;
    public final r c;
    public final Bundle e;
    public y g;
    public List h;
    public i i;
    public int j;
    public int k;
    public l l;
    public t m;
    public final Object d = new Object();
    public final RemoteCallbackList f = new RemoteCallbackList();

    public n(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.a = a2;
        m mVar = new m(this);
        this.b = mVar;
        this.c = new r(a2.getSessionToken(), mVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final l b() {
        l lVar;
        synchronized (this.d) {
            lVar = this.l;
        }
        return lVar;
    }

    public t c() {
        t tVar;
        synchronized (this.d) {
            tVar = this.m;
        }
        return tVar;
    }

    public void d(t tVar) {
        synchronized (this.d) {
            this.m = tVar;
        }
    }
}
