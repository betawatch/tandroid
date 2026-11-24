// default package

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class bl6 implements Runnable {
    public final /* synthetic */ MediaController a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ om6 d;
    public final /* synthetic */ File e;
    public final /* synthetic */ float f;
    public final /* synthetic */ long h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ long r;

    public /* synthetic */ bl6(MediaController mediaController, boolean z, boolean z2, om6 om6Var, File file, float f, long j, boolean z3, long j2) {
        this.a = mediaController;
        this.b = z;
        this.c = z2;
        this.d = om6Var;
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
        om6 om6Var = this.d;
        File file = this.e;
        float f = this.f;
        long j = this.h;
        boolean z3 = this.n;
        long j2 = this.r;
        String[] strArr = MediaController.W1;
        if (z || z2) {
            boolean z4 = om6Var.b.V;
            synchronized (mediaController.b) {
                om6Var.b.V = false;
            }
            mediaController.c0.remove(om6Var);
            mediaController.a0.remove(om6Var);
            mediaController.f(z4 || z);
            if (om6Var.d && (videoEncodingService = VideoEncodingService.e) != null && videoEncodingService.b == om6Var) {
                om6 om6Var2 = MediaController.w().b0;
                VideoEncodingService videoEncodingService2 = VideoEncodingService.e;
                if (om6Var2 != null) {
                    videoEncodingService2.a(om6Var2);
                } else {
                    videoEncodingService2.stopSelf();
                }
            }
            mediaController.x0();
        }
        if (z) {
            kk7.f(om6Var.c).k(kk7.b2, om6Var.a, file.toString(), Float.valueOf(f), Long.valueOf(j));
            return;
        }
        if (z3) {
            c = 1;
            kk7.f(om6Var.c).k(kk7.Z1, om6Var.a, file.toString(), Float.valueOf(f), Long.valueOf(j));
        } else {
            c = 1;
        }
        kk7 f2 = kk7.f(om6Var.c);
        int i = kk7.a2;
        k27 k27Var = om6Var.a;
        String file2 = file.toString();
        Long valueOf = Long.valueOf(j2);
        Long valueOf2 = Long.valueOf(z2 ? file.length() : 0L);
        Float valueOf3 = Float.valueOf(f);
        Long valueOf4 = Long.valueOf(j);
        Object[] objArr = new Object[6];
        objArr[0] = k27Var;
        objArr[c] = file2;
        objArr[2] = valueOf;
        objArr[3] = valueOf2;
        objArr[4] = valueOf3;
        objArr[5] = valueOf4;
        f2.k(i, objArr);
    }
}
