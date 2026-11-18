package org.telegram.messenger;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8.a b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ke d;
    public final /* synthetic */ File e;

    public /* synthetic */ u0(k8.a aVar, long j3, ke keVar, File file, int i7) {
        this.a = i7;
        this.b = aVar;
        this.c = j3;
        this.d = keVar;
        this.e = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        File file = this.e;
        ke keVar = this.d;
        long j3 = this.c;
        k8.a aVar = this.b;
        switch (i7) {
            case 0:
                if (((HashSet) ((e0.g) aVar.c).h).remove(Long.valueOf(j3))) {
                    z0.b(file);
                    MediaController mediaController = keVar.a;
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
                    keVar.a.k1 = file;
                    break;
                }
                break;
        }
    }
}
