package m4;

import a8.yb;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class s {
    public static final AtomicReference n = new AtomicReference(null);
    public final Context a;
    public final b2.g1 b;
    public String c;
    public final qb.a d;
    public final Bundle e;
    public final Bundle f;
    public e2.d g;
    public final boolean h;
    public final f9.s1 i;
    public final f9.s1 j;
    public final f9.s1 k;
    public final boolean l;
    public boolean m;

    public s(LaunchActivity launchActivity, b2.g1 g1Var) {
        qb.a aVar = new qb.a(13);
        Context applicationContext = launchActivity.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        g1Var.getClass();
        this.b = g1Var;
        yb.g(g1Var.P());
        this.c = "";
        this.d = aVar;
        this.e = new Bundle();
        this.f = new Bundle();
        f9.g0 g0Var = f9.i0.b;
        f9.s1 s1Var = f9.s1.e;
        this.i = s1Var;
        this.j = s1Var;
        this.h = true;
        this.l = true;
        this.k = s1Var;
    }
}
