// default package

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class gx6 {
    public final MediaSession a;
    public final fx6 b;
    public final px6 c;
    public final Bundle e;
    public sf8 g;
    public ArrayList h;
    public pt6 i;
    public byte j;
    public int k;
    public dx6 l;
    public ry6 m;
    public final Object d = new Object();
    public final RemoteCallbackList f = new RemoteCallbackList();

    public gx6(Context context, String str, Bundle bundle) {
        MediaSession a = a(context, str, bundle);
        this.a = a;
        fx6 fx6Var = new fx6(this);
        this.b = fx6Var;
        this.c = new px6(a.getSessionToken(), fx6Var);
        this.e = bundle;
        a.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final dx6 b() {
        dx6 dx6Var;
        synchronized (this.d) {
            dx6Var = this.l;
        }
        return dx6Var;
    }

    public ry6 c() {
        ry6 ry6Var;
        synchronized (this.d) {
            ry6Var = this.m;
        }
        return ry6Var;
    }

    public void d(ry6 ry6Var) {
        synchronized (this.d) {
            this.m = ry6Var;
        }
    }
}
