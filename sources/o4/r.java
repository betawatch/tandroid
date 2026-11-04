package o4;

import android.content.Context;
import android.os.Bundle;
import b8.zb;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r {
    public static final AtomicReference n = new AtomicReference(null);
    public final Context a;
    public final d2.e1 b;
    public String c;
    public final kb.a d;
    public final Bundle e;
    public final Bundle f;
    public g2.e g;
    public final boolean h;
    public final g9.s1 i;
    public final g9.s1 j;
    public final g9.s1 k;
    public final boolean l;
    public boolean m;

    public r(LaunchActivity launchActivity, d2.e1 e1Var) {
        kb.a aVar = new kb.a(16);
        Context applicationContext = launchActivity.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        e1Var.getClass();
        this.b = e1Var;
        zb.f(e1Var.N());
        this.c = "";
        this.d = aVar;
        this.e = new Bundle();
        this.f = new Bundle();
        g9.g0 g0Var = g9.i0.b;
        g9.s1 s1Var = g9.s1.e;
        this.i = s1Var;
        this.j = s1Var;
        this.h = true;
        this.l = true;
        this.k = s1Var;
    }
}
