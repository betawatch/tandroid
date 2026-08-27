package f9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k {
    public final t a;
    public final j b;

    public k(t tVar, k9.c cVar) {
        this.a = tVar;
        this.b = new j(cVar);
    }

    public final String a(String str) {
        String substring;
        j jVar = this.b;
        synchronized (jVar) {
            if (Objects.equals(jVar.b, str)) {
                return jVar.c;
            }
            k9.c cVar = jVar.a;
            i iVar = j.d;
            File file = new File(cVar.c, str);
            file.mkdirs();
            List e9 = k9.c.e(file.listFiles(iVar));
            if (e9.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(e9, j.e)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void b(String str) {
        j jVar = this.b;
        synchronized (jVar) {
            if (!Objects.equals(jVar.b, str)) {
                j.a(jVar.a, str, jVar.c);
                jVar.b = str;
            }
        }
    }
}
