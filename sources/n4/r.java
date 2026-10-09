package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class r {
    public final MediaSession a;
    public final q b;
    public final w c;
    public final Bundle e;
    public f0 g;
    public List h;
    public m i;
    public int j;
    public int k;
    public p l;
    public z m;
    public final Object d = new Object();
    public final RemoteCallbackList f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.a = a2;
        q qVar = new q(this);
        this.b = qVar;
        this.c = new w(a2.getSessionToken(), qVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.l;
        }
        return pVar;
    }

    public z c() {
        z zVar;
        synchronized (this.d) {
            zVar = this.m;
        }
        return zVar;
    }

    public void d(z zVar) {
        synchronized (this.d) {
            this.m = zVar;
        }
    }
}
