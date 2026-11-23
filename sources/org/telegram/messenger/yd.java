package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class yd implements Runnable {
    public final /* synthetic */ MediaController a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ jf d;
    public final /* synthetic */ File e;
    public final /* synthetic */ float f;
    public final /* synthetic */ long h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ long r;

    public /* synthetic */ yd(MediaController mediaController, boolean z10, boolean z11, jf jfVar, File file, float f10, long j3, boolean z12, long j10) {
        this.a = mediaController;
        this.b = z10;
        this.c = z11;
        this.d = jfVar;
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
        jf jfVar = this.d;
        File file = this.e;
        float f10 = this.f;
        long j3 = this.h;
        boolean z12 = this.n;
        long j10 = this.r;
        String[] strArr = MediaController.W1;
        if (z10 || z11) {
            boolean z13 = jfVar.b.W;
            synchronized (mediaController.b) {
                c10 = 1;
                jfVar.b.W = false;
            }
            mediaController.c0.remove(jfVar);
            mediaController.a0.remove(jfVar);
            mediaController.k(z13 || z10);
            if (jfVar.d && (videoEncodingService = VideoEncodingService.e) != null && videoEncodingService.b == jfVar) {
                jf jfVar2 = MediaController.B().b0;
                if (jfVar2 != null) {
                    VideoEncodingService.e.a(jfVar2);
                } else {
                    VideoEncodingService.e.stopSelf();
                }
            }
            mediaController.y0();
        } else {
            c10 = 1;
        }
        if (z10) {
            ks f11 = ks.f(jfVar.c);
            int i7 = ks.c2;
            fj fjVar = jfVar.a;
            String file2 = file.toString();
            Float valueOf = Float.valueOf(f10);
            Long valueOf2 = Long.valueOf(j3);
            Object[] objArr = new Object[4];
            objArr[0] = fjVar;
            objArr[c10] = file2;
            objArr[2] = valueOf;
            objArr[3] = valueOf2;
            f11.k(i7, objArr);
            return;
        }
        if (z12) {
            ks f12 = ks.f(jfVar.c);
            int i10 = ks.a2;
            fj fjVar2 = jfVar.a;
            String file3 = file.toString();
            Float valueOf3 = Float.valueOf(f10);
            Long valueOf4 = Long.valueOf(j3);
            c11 = 3;
            Object[] objArr2 = new Object[4];
            objArr2[0] = fjVar2;
            objArr2[c10] = file3;
            objArr2[2] = valueOf3;
            objArr2[3] = valueOf4;
            f12.k(i10, objArr2);
        } else {
            c11 = 3;
        }
        ks f13 = ks.f(jfVar.c);
        int i11 = ks.b2;
        fj fjVar3 = jfVar.a;
        String file4 = file.toString();
        Long valueOf5 = Long.valueOf(j10);
        Long valueOf6 = Long.valueOf(z11 ? file.length() : 0L);
        Float valueOf7 = Float.valueOf(f10);
        Long valueOf8 = Long.valueOf(j3);
        Object[] objArr3 = new Object[6];
        objArr3[0] = fjVar3;
        objArr3[c10] = file4;
        objArr3[2] = valueOf5;
        objArr3[c11] = valueOf6;
        objArr3[4] = valueOf7;
        objArr3[5] = valueOf8;
        f13.k(i11, objArr3);
    }
}
