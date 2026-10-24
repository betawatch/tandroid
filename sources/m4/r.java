package m4;

import android.content.Context;
import android.os.Bundle;
import e9.x1;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.LaunchActivity;
import v7.u6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class r {
    public static final AtomicReference n = new AtomicReference(null);
    public final Context a;
    public final b2.f1 b;
    public String c;
    public final pb.a d;
    public final Bundle e;
    public final Bundle f;
    public e2.d g;
    public final boolean h;
    public final x1 i;
    public final x1 j;
    public final x1 k;
    public final boolean l;
    public boolean m;

    public r(LaunchActivity launchActivity, b2.f1 f1Var) {
        pb.a aVar = new pb.a(13);
        Context applicationContext = launchActivity.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        f1Var.getClass();
        this.b = f1Var;
        u6.g(f1Var.P());
        this.c = "";
        this.d = aVar;
        this.e = new Bundle();
        this.f = new Bundle();
        e9.l0 l0Var = e9.n0.b;
        x1 x1Var = x1.e;
        this.i = x1Var;
        this.j = x1Var;
        this.h = true;
        this.l = true;
        this.k = x1Var;
    }
}
