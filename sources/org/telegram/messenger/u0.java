package org.telegram.messenger;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8.a b;
    public final /* synthetic */ long c;
    public final /* synthetic */ le d;
    public final /* synthetic */ File e;

    public /* synthetic */ u0(k8.a aVar, long j3, le leVar, File file, int i7) {
        this.a = i7;
        this.b = aVar;
        this.c = j3;
        this.d = leVar;
        this.e = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        File file = this.e;
        le leVar = this.d;
        long j3 = this.c;
        k8.a aVar = this.b;
        switch (i7) {
            case 0:
                if (((HashSet) ((e0.g) aVar.c).h).remove(Long.valueOf(j3))) {
                    z0.b(file);
                    MediaController mediaController = leVar.a;
                    if (file.equals(mediaController.k1)) {
                        mediaController.k1 = null;
                        break;
                    }
                }
                break;
            default:
                e0.g gVar = (e0.g) aVar.c;
                if (!gVar.c) {
                    ((HashSet) gVar.h).add(Long.valueOf(j3));
                    Set set = z0.a;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        z0.a.add(absolutePath);
                    }
                    leVar.a.k1 = file;
                    break;
                }
                break;
        }
    }
}
