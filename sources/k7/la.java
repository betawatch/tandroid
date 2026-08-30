package k7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class la implements ia {
    public final c9.p a;
    public final ha b;

    public la(Context context, ha haVar) {
        this.b = haVar;
        w2.a aVar = w2.a.e;
        y2.q.b(context);
        y2.o c3 = y2.q.a().c(aVar);
        if (w2.a.d.contains(new v2.c("json"))) {
            new c9.p(new j7.e9(c3, 2));
        }
        this.a = new c9.p(new j7.e9(c3, 3));
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
        androidx.biometric.e eVar = (androidx.biometric.e) bVar.b;
        ((j7.f8) bVar.c).h = false;
        j7.f8 f8Var = (j7.f8) bVar.c;
        f8Var.f = Boolean.FALSE;
        eVar.b = new k9(f8Var);
        try {
            oa.b();
            k7 k7Var = new k7(eVar);
            androidx.biometric.e eVar2 = new androidx.biometric.e(26);
            oaVar.a(eVar2);
            HashMap hashMap = new HashMap((HashMap) eVar2.b);
            HashMap hashMap2 = new HashMap((HashMap) eVar2.c);
            e eVar3 = (e) eVar2.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar3);
                dVar = (u9.d) hashMap.get(k7.class);
            } catch (IOException unused) {
            }
            if (dVar == null) {
                throw new u9.b("No encoder for ".concat(String.valueOf(k7.class)));
            }
            dVar.a(k7Var, fVar);
            pVar.a(new v2.a(null, byteArrayOutputStream.toByteArray(), v2.d.b, null), new s0.b(28));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
