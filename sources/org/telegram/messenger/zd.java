package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class zd implements Runnable {
    public final /* synthetic */ MediaController a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ kf d;
    public final /* synthetic */ File e;
    public final /* synthetic */ float f;
    public final /* synthetic */ long h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ long r;

    public /* synthetic */ zd(MediaController mediaController, boolean z10, boolean z11, kf kfVar, File file, float f10, long j3, boolean z12, long j10) {
        this.a = mediaController;
        this.b = z10;
        this.c = z11;
        this.d = kfVar;
        this.e = file;
        this.f = f10;
        this.h = j3;
        this.n = z12;
        this.r = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        VideoEncodingService videoEncodingService;
        char c11;
        MediaController mediaController = this.a;
        boolean z10 = this.b;
        boolean z11 = this.c;
        kf kfVar = this.d;
        File file = this.e;
        float f10 = this.f;
        long j3 = this.h;
        boolean z12 = this.n;
        long j10 = this.r;
        String[] strArr = MediaController.W1;
        if (z10 || z11) {
            boolean z13 = kfVar.b.W;
            synchronized (mediaController.b) {
                c10 = 1;
                kfVar.b.W = false;
            }
            mediaController.c0.remove(kfVar);
            mediaController.a0.remove(kfVar);
            mediaController.k(z13 || z10);
            if (kfVar.d && (videoEncodingService = VideoEncodingService.e) != null && videoEncodingService.b == kfVar) {
                kf kfVar2 = MediaController.B().b0;
                if (kfVar2 != null) {
                    VideoEncodingService.e.a(kfVar2);
                } else {
                    VideoEncodingService.e.stopSelf();
                }
            }
            mediaController.y0();
        } else {
            c10 = 1;
        }
        if (z10) {
            ns f11 = ns.f(kfVar.c);
            int i7 = ns.c2;
            gj gjVar = kfVar.a;
            String file2 = file.toString();
            Float valueOf = Float.valueOf(f10);
            Long valueOf2 = Long.valueOf(j3);
            Object[] objArr = new Object[4];
            objArr[0] = gjVar;
            objArr[c10] = file2;
            objArr[2] = valueOf;
            objArr[3] = valueOf2;
            f11.k(i7, objArr);
            return;
        }
        if (z12) {
            ns f12 = ns.f(kfVar.c);
            int i10 = ns.a2;
            gj gjVar2 = kfVar.a;
            String file3 = file.toString();
            Float valueOf3 = Float.valueOf(f10);
            Long valueOf4 = Long.valueOf(j3);
            c11 = 3;
            Object[] objArr2 = new Object[4];
            objArr2[0] = gjVar2;
            objArr2[c10] = file3;
            objArr2[2] = valueOf3;
            objArr2[3] = valueOf4;
            f12.k(i10, objArr2);
        } else {
            c11 = 3;
        }
        ns f13 = ns.f(kfVar.c);
        int i11 = ns.b2;
        gj gjVar3 = kfVar.a;
        String file4 = file.toString();
        Long valueOf5 = Long.valueOf(j10);
        Long valueOf6 = Long.valueOf(z11 ? file.length() : 0L);
        Float valueOf7 = Float.valueOf(f10);
        Long valueOf8 = Long.valueOf(j3);
        Object[] objArr3 = new Object[6];
        objArr3[0] = gjVar3;
        objArr3[c10] = file4;
        objArr3[2] = valueOf5;
        objArr3[c11] = valueOf6;
        objArr3[4] = valueOf7;
        objArr3[5] = valueOf8;
        f13.k(i11, objArr3);
    }
}
