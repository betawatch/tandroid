package i9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class k {
    public final s a;
    public final j b;

    public k(s sVar, n9.b bVar) {
        this.a = sVar;
        this.b = new j(bVar);
    }

    public final String a(String str) {
        String substring;
        j jVar = this.b;
        synchronized (jVar) {
            if (Objects.equals(jVar.b, str)) {
                return jVar.c;
            }
            n9.b bVar = jVar.a;
            i iVar = j.d;
            File file = new File(bVar.c, str);
            file.mkdirs();
            List e6 = n9.b.e(file.listFiles(iVar));
            if (e6.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(e6, j.e)).getName().substring(4);
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
