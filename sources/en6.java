// default package

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class en6 implements Runnable {
    public final /* synthetic */ MediaController a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ oo6 d;
    public final /* synthetic */ File e;
    public final /* synthetic */ float f;
    public final /* synthetic */ long h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ long r;

    public /* synthetic */ en6(MediaController mediaController, boolean z, boolean z2, oo6 oo6Var, File file, float f, long j, boolean z3, long j2) {
        this.a = mediaController;
        this.b = z;
        this.c = z2;
        this.d = oo6Var;
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
        oo6 oo6Var = this.d;
        File file = this.e;
        float f = this.f;
        long j = this.h;
        boolean z3 = this.n;
        long j2 = this.r;
        String[] strArr = MediaController.W1;
        if (z || z2) {
            boolean z4 = oo6Var.b.V;
            synchronized (mediaController.b) {
                oo6Var.b.V = false;
            }
            mediaController.c0.remove(oo6Var);
            mediaController.a0.remove(oo6Var);
            mediaController.f(z4 || z);
            if (oo6Var.d && (videoEncodingService = VideoEncodingService.e) != null && videoEncodingService.b == oo6Var) {
                oo6 oo6Var2 = MediaController.w().b0;
                VideoEncodingService videoEncodingService2 = VideoEncodingService.e;
                if (oo6Var2 != null) {
                    videoEncodingService2.a(oo6Var2);
                } else {
                    videoEncodingService2.stopSelf();
                }
            }
            mediaController.x0();
        }
        if (z) {
            nm7.f(oo6Var.c).k(nm7.c2, oo6Var.a, file.toString(), Float.valueOf(f), Long.valueOf(j));
            return;
        }
        if (z3) {
            c = 1;
            nm7.f(oo6Var.c).k(nm7.a2, oo6Var.a, file.toString(), Float.valueOf(f), Long.valueOf(j));
        } else {
            c = 1;
        }
        nm7 f2 = nm7.f(oo6Var.c);
        int i = nm7.b2;
        k47 k47Var = oo6Var.a;
        String file2 = file.toString();
        Long valueOf = Long.valueOf(j2);
        Long valueOf2 = Long.valueOf(z2 ? file.length() : 0L);
        Float valueOf3 = Float.valueOf(f);
        Long valueOf4 = Long.valueOf(j);
        Object[] objArr = new Object[6];
        objArr[0] = k47Var;
        objArr[c] = file2;
        objArr[2] = valueOf;
        objArr[3] = valueOf2;
        objArr[4] = valueOf3;
        objArr[5] = valueOf4;
        f2.k(i, objArr);
    }
}
