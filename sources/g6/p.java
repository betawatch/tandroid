package g6;

import android.support.v4.media.session.a0;
import android.text.TextUtils;
import android.util.Log;
import c3.g0;
import c6.b0;
import c6.e0;
import c6.f0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class p {
    public final b a;
    public final String b;
    public a0 c;
    public final List d;

    public p(String str) {
        a.b(str);
        this.b = str;
        this.a = new b("MediaControlChannel", null);
        this.d = DesugarCollections.synchronizedList(new ArrayList());
    }

    public final void a(o oVar) {
        this.d.add(oVar);
    }

    public final long b() {
        a0 a0Var = this.c;
        if (a0Var != null) {
            return ((AtomicLong) a0Var.c).getAndIncrement();
        }
        b bVar = this.a;
        Log.e(bVar.a, bVar.d("Attempt to generate requestId without a sink", new Object[0]));
        return 0L;
    }

    public final void c(long j10, String str) {
        a0 a0Var = this.c;
        if (a0Var == null) {
            b bVar = this.a;
            Log.e(bVar.a, bVar.d("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        f0 f0Var = (f0) a0Var.b;
        if (f0Var == null) {
            throw new IllegalStateException("Device is not connected");
        }
        e0 e0Var = (e0) f0Var;
        String str2 = this.b;
        a.b(str2);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (str.length() > 524288) {
            b bVar2 = e0.G;
            Log.w(bVar2.a, bVar2.d("Message send failed. Message exceeds maximum size", new Object[0]));
            throw new IllegalArgumentException("Message exceeds maximum size524288");
        }
        com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
        b10.c = new b0(e0Var, str2, str, 1);
        b10.a = 8405;
        e0Var.e(1, b10.a()).addOnFailureListener(new g0(a0Var, j10, 2));
    }
}
