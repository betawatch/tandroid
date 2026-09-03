package k7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class la implements ia {
    public final c9.q a;
    public final ha b;

    public la(Context context, ha haVar) {
        this.b = haVar;
        w2.a aVar = w2.a.e;
        y2.q.b(context);
        y2.o c3 = y2.q.a().c(aVar);
        if (w2.a.d.contains(new v2.c("json"))) {
            new c9.q(new j7.e9(c3, 2));
        }
        this.a = new c9.q(new j7.e9(c3, 3));
    }

    @Override // k7.ia
    public final void a(f7.b bVar) {
        f fVar;
        u9.d dVar;
        ha haVar = this.b;
        haVar.getClass();
        y2.p pVar = (y2.p) this.a.get();
        haVar.getClass();
        oa oaVar = oa.c;
        af.d dVar2 = (af.d) bVar.b;
        ((j7.g8) bVar.c).h = false;
        j7.g8 g8Var = (j7.g8) bVar.c;
        g8Var.f = Boolean.FALSE;
        dVar2.b = new k9(g8Var);
        try {
            oa.b();
            k7 k7Var = new k7(dVar2);
            af.d dVar3 = new af.d(26);
            oaVar.a(dVar3);
            HashMap hashMap = new HashMap((HashMap) dVar3.b);
            HashMap hashMap2 = new HashMap((HashMap) dVar3.c);
            e eVar = (e) dVar3.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (u9.d) hashMap.get(k7.class);
            } catch (IOException unused) {
            }
            if (dVar == null) {
                throw new u9.b("No encoder for ".concat(String.valueOf(k7.class)));
            }
            dVar.a(k7Var, fVar);
            pVar.a(new v2.a(null, byteArrayOutputStream.toByteArray(), v2.d.b, null), new s0.b(29));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
