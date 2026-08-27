package h7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class la implements ia {
    public final z8.m a;
    public final ha b;

    public la(Context context, ha haVar) {
        this.b = haVar;
        u2.a aVar = u2.a.e;
        w2.q.b(context);
        w2.o c10 = w2.q.a().c(aVar);
        if (u2.a.d.contains(new t2.c("json"))) {
            new z8.m(new g7.d9(c10, 2));
        }
        this.a = new z8.m(new g7.d9(c10, 3));
    }

    @Override // h7.ia
    public final void a(g5.b bVar) {
        f fVar;
        r9.d dVar;
        ha haVar = this.b;
        haVar.getClass();
        w2.p pVar = (w2.p) this.a.get();
        haVar.getClass();
        oa oaVar = oa.c;
        a5.n nVar = (a5.n) bVar.b;
        ((g7.e8) bVar.c).h = false;
        g7.e8 e8Var = (g7.e8) bVar.c;
        e8Var.f = Boolean.FALSE;
        nVar.b = new k9(e8Var);
        try {
            oa.b();
            j7 j7Var = new j7(nVar);
            a5.n nVar2 = new a5.n(19);
            oaVar.a(nVar2);
            HashMap hashMap = new HashMap((HashMap) nVar2.b);
            HashMap hashMap2 = new HashMap((HashMap) nVar2.c);
            e eVar = (e) nVar2.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (r9.d) hashMap.get(j7.class);
            } catch (IOException unused) {
            }
            if (dVar == null) {
                throw new r9.b("No encoder for ".concat(String.valueOf(j7.class)));
            }
            dVar.a(j7Var, fVar);
            pVar.a(new t2.a(null, byteArrayOutputStream.toByteArray(), t2.d.b, null), new u3.k(6));
        } catch (UnsupportedEncodingException e9) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e9);
        }
    }
}
