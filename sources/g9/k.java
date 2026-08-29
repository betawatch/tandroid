package g9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k {
    public final u a;
    public final j b;

    public k(u uVar, l9.b bVar) {
        this.a = uVar;
        this.b = new j(bVar);
    }

    public final String a(String str) {
        String substring;
        j jVar = this.b;
        synchronized (jVar) {
            if (Objects.equals(jVar.b, str)) {
                return jVar.c;
            }
            l9.b bVar = jVar.a;
            i iVar = j.d;
            File file = new File(bVar.c, str);
            file.mkdirs();
            List e10 = l9.b.e(file.listFiles(iVar));
            if (e10.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(e10, j.e)).getName().substring(4);
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
