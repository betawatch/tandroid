package k7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        ((j7.g8) bVar.c).h = false;
        j7.g8 g8Var = (j7.g8) bVar.c;
        g8Var.f = Boolean.FALSE;
        eVar.b = new k9(g8Var);
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
            pVar.a(new v2.a(null, byteArrayOutputStream.toByteArray(), v2.d.b, null), new sg.a(28));
        } catch (UnsupportedEncodingException e6) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e6);
        }
    }
}
