package i9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
            List e = n9.b.e(file.listFiles(iVar));
            if (e.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(e, j.e)).getName().substring(4);
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
