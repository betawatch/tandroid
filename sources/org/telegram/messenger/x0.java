package org.telegram.messenger;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m4.c b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ne d;
    public final /* synthetic */ File e;

    public /* synthetic */ x0(m4.c cVar, long j10, ne neVar, File file, int i10) {
        this.a = i10;
        this.b = cVar;
        this.c = j10;
        this.d = neVar;
        this.e = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        File file = this.e;
        ne neVar = this.d;
        long j10 = this.c;
        m4.c cVar = this.b;
        switch (i10) {
            case 0:
                if (((HashSet) ((e0.h) cVar.c).h).remove(Long.valueOf(j10))) {
                    c1.b(file);
                    MediaController mediaController = neVar.a;
                    if (file.equals(mediaController.i1)) {
                        mediaController.i1 = null;
                        break;
                    }
                }
                break;
            default:
                e0.h hVar = (e0.h) cVar.c;
                if (!hVar.c) {
                    ((HashSet) hVar.h).add(Long.valueOf(j10));
                    Set set = c1.a;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        c1.a.add(absolutePath);
                    }
                    neVar.a.i1 = file;
                    break;
                }
                break;
        }
    }
}
