package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class l {
    public final MediaSession a;
    public final k b;
    public final p c;
    public final Bundle e;
    public w g;
    public List h;
    public i i;
    public int j;
    public int k;
    public android.support.v4.media.session.s l;
    public r m;
    public final Object d = new Object();
    public final RemoteCallbackList f = new RemoteCallbackList();

    public l(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.a = a2;
        k kVar = new k(this);
        this.b = kVar;
        this.c = new p(a2.getSessionToken(), kVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final android.support.v4.media.session.s b() {
        android.support.v4.media.session.s sVar;
        synchronized (this.d) {
            sVar = this.l;
        }
        return sVar;
    }

    public r c() {
        r rVar;
        synchronized (this.d) {
            rVar = this.m;
        }
        return rVar;
    }

    public void d(r rVar) {
        synchronized (this.d) {
            this.m = rVar;
        }
    }
}
