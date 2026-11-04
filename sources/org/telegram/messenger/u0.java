package org.telegram.messenger;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2.t b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ge d;
    public final /* synthetic */ File e;

    public /* synthetic */ u0(m2.t tVar, long j10, ge geVar, File file, int i3) {
        this.a = i3;
        this.b = tVar;
        this.c = j10;
        this.d = geVar;
        this.e = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        File file = this.e;
        ge geVar = this.d;
        long j10 = this.c;
        m2.t tVar = this.b;
        switch (i3) {
            case 0:
                if (((HashSet) ((e0.g) tVar.c).h).remove(Long.valueOf(j10))) {
                    z0.b(file);
                    MediaController mediaController = geVar.a;
                    if (file.equals(mediaController.k1)) {
                        mediaController.k1 = null;
                        break;
                    }
                }
                break;
            default:
                e0.g gVar = (e0.g) tVar.c;
                if (!gVar.c) {
                    ((HashSet) gVar.h).add(Long.valueOf(j10));
                    Set set = z0.a;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        z0.a.add(absolutePath);
                    }
                    geVar.a.k1 = file;
                    break;
                }
                break;
        }
    }
}
