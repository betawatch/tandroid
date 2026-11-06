package org.telegram.messenger;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m4.d0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ me d;
    public final /* synthetic */ File e;

    public /* synthetic */ u0(m4.d0 d0Var, long j3, me meVar, File file, int i7) {
        this.a = i7;
        this.b = d0Var;
        this.c = j3;
        this.d = meVar;
        this.e = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        File file = this.e;
        me meVar = this.d;
        long j3 = this.c;
        m4.d0 d0Var = this.b;
        switch (i7) {
            case 0:
                if (((HashSet) ((e0.g) d0Var.b).h).remove(Long.valueOf(j3))) {
                    z0.b(file);
                    MediaController mediaController = meVar.a;
                    if (file.equals(mediaController.j1)) {
                        mediaController.j1 = null;
                        break;
                    }
                }
                break;
            default:
                e0.g gVar = (e0.g) d0Var.b;
                if (!gVar.c) {
                    ((HashSet) gVar.h).add(Long.valueOf(j3));
                    Set set = z0.a;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        z0.a.add(absolutePath);
                    }
                    meVar.a.j1 = file;
                    break;
                }
                break;
        }
    }
}
