package j6;

import a8.ua;
import android.text.TextUtils;
import android.util.Log;
import f6.b0;
import f6.e0;
import f6.f0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class p {
    public final b a;
    public final String b;
    public h6.m c;
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
        h6.m mVar = this.c;
        if (mVar != null) {
            return ((AtomicLong) mVar.c).getAndIncrement();
        }
        b bVar = this.a;
        Log.e(bVar.a, bVar.d("Attempt to generate requestId without a sink", new Object[0]));
        return 0L;
    }

    public final void c(long j3, String str) {
        h6.m mVar = this.c;
        if (mVar == null) {
            b bVar = this.a;
            Log.e(bVar.a, bVar.d("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        f0 f0Var = (f0) mVar.b;
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
            b bVar2 = e0.H;
            Log.w(bVar2.a, bVar2.d("Message send failed. Message exceeds maximum size", new Object[0]));
            throw new IllegalArgumentException("Message exceeds maximum size524288");
        }
        com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
        b10.c = new b0(e0Var, str2, str, 1);
        b10.a = 8405;
        e0Var.e(1, b10.a()).addOnFailureListener(new ua(mVar, j3, 4));
    }
}
