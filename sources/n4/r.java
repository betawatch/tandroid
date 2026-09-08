package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class r {
    public final MediaSession a;
    public final q b;
    public final x c;
    public final Bundle e;
    public h0 g;
    public List h;
    public m i;
    public int j;
    public int k;
    public int l;
    public p m;
    public a0 n;
    public final Object d = new Object();
    public final RemoteCallbackList f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.a = a2;
        q qVar = new q(this);
        this.b = qVar;
        this.c = new x(a2.getSessionToken(), qVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.m;
        }
        return pVar;
    }

    public a0 c() {
        a0 a0Var;
        synchronized (this.d) {
            a0Var = this.n;
        }
        return a0Var;
    }

    public void d(a0 a0Var) {
        synchronized (this.d) {
            this.n = a0Var;
        }
    }

    public void e(int i10) {
        this.j = i10;
    }
}
