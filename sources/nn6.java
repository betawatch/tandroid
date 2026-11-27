// default package

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class nn6 implements Runnable {
    public final /* synthetic */ MediaController a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ so6 d;
    public final /* synthetic */ File e;
    public final /* synthetic */ float f;
    public final /* synthetic */ long h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ long r;

    public /* synthetic */ nn6(MediaController mediaController, boolean z, boolean z2, so6 so6Var, File file, float f, long j, boolean z3, long j2) {
        this.a = mediaController;
        this.b = z;
        this.c = z2;
        this.d = so6Var;
        this.e = file;
        this.f = f;
        this.h = j;
        this.n = z3;
        this.r = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoEncodingService videoEncodingService;
        char c;
        MediaController mediaController = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        so6 so6Var = this.d;
        File file = this.e;
        float f = this.f;
        long j = this.h;
        boolean z3 = this.n;
        long j2 = this.r;
        String[] strArr = MediaController.W1;
        if (z || z2) {
            boolean z4 = so6Var.b.V;
            synchronized (mediaController.b) {
                so6Var.b.V = false;
            }
            mediaController.c0.remove(so6Var);
            mediaController.a0.remove(so6Var);
            mediaController.f(z4 || z);
            if (so6Var.d && (videoEncodingService = VideoEncodingService.e) != null && videoEncodingService.b == so6Var) {
                so6 so6Var2 = MediaController.z().b0;
                VideoEncodingService videoEncodingService2 = VideoEncodingService.e;
                if (so6Var2 != null) {
                    videoEncodingService2.a(so6Var2);
                } else {
                    videoEncodingService2.stopSelf();
                }
            }
            mediaController.C0();
        }
        if (z) {
            jn7.f(so6Var.c).k(jn7.c2, so6Var.a, file.toString(), Float.valueOf(f), Long.valueOf(j));
            return;
        }
        if (z3) {
            c = 1;
            jn7.f(so6Var.c).k(jn7.a2, so6Var.a, file.toString(), Float.valueOf(f), Long.valueOf(j));
        } else {
            c = 1;
        }
        jn7 f2 = jn7.f(so6Var.c);
        int i = jn7.b2;
        r47 r47Var = so6Var.a;
        String file2 = file.toString();
        Long valueOf = Long.valueOf(j2);
        Long valueOf2 = Long.valueOf(z2 ? file.length() : 0L);
        Float valueOf3 = Float.valueOf(f);
        Long valueOf4 = Long.valueOf(j);
        Object[] objArr = new Object[6];
        objArr[0] = r47Var;
        objArr[c] = file2;
        objArr[2] = valueOf;
        objArr[3] = valueOf2;
        objArr[4] = valueOf3;
        objArr[5] = valueOf4;
        f2.k(i, objArr);
    }
}
