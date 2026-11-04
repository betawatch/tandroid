package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ud implements Runnable {
    public final /* synthetic */ MediaController a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ cf d;
    public final /* synthetic */ File e;
    public final /* synthetic */ float f;
    public final /* synthetic */ long h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ long r;

    public /* synthetic */ ud(MediaController mediaController, boolean z10, boolean z11, cf cfVar, File file, float f10, long j10, boolean z12, long j11) {
        this.a = mediaController;
        this.b = z10;
        this.c = z11;
        this.d = cfVar;
        this.e = file;
        this.f = f10;
        this.h = j10;
        this.n = z12;
        this.r = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c2;
        char c10;
        MediaController mediaController = this.a;
        boolean z10 = this.b;
        boolean z11 = this.c;
        cf cfVar = this.d;
        File file = this.e;
        float f10 = this.f;
        long j10 = this.h;
        boolean z12 = this.n;
        long j11 = this.r;
        String[] strArr = MediaController.W1;
        if (z10 || z11) {
            boolean z13 = cfVar.b.W;
            synchronized (mediaController.b) {
                c2 = 1;
                cfVar.b.W = false;
            }
            mediaController.c0.remove(cfVar);
            mediaController.a0.remove(cfVar);
            mediaController.k(z13 || z10);
            mediaController.y0();
        } else {
            c2 = 1;
        }
        if (z10) {
            hs f11 = hs.f(cfVar.c);
            int i3 = hs.c2;
            zi ziVar = cfVar.a;
            String file2 = file.toString();
            Float valueOf = Float.valueOf(f10);
            Long valueOf2 = Long.valueOf(j10);
            Object[] objArr = new Object[4];
            objArr[0] = ziVar;
            objArr[c2] = file2;
            objArr[2] = valueOf;
            objArr[3] = valueOf2;
            f11.k(i3, objArr);
            return;
        }
        if (z12) {
            hs f12 = hs.f(cfVar.c);
            int i10 = hs.a2;
            zi ziVar2 = cfVar.a;
            String file3 = file.toString();
            Float valueOf3 = Float.valueOf(f10);
            Long valueOf4 = Long.valueOf(j10);
            c10 = 3;
            Object[] objArr2 = new Object[4];
            objArr2[0] = ziVar2;
            objArr2[c2] = file3;
            objArr2[2] = valueOf3;
            objArr2[3] = valueOf4;
            f12.k(i10, objArr2);
        } else {
            c10 = 3;
        }
        hs f13 = hs.f(cfVar.c);
        int i11 = hs.b2;
        zi ziVar3 = cfVar.a;
        String file4 = file.toString();
        Long valueOf5 = Long.valueOf(j11);
        Long valueOf6 = Long.valueOf(z11 ? file.length() : 0L);
        Float valueOf7 = Float.valueOf(f10);
        Long valueOf8 = Long.valueOf(j10);
        Object[] objArr3 = new Object[6];
        objArr3[0] = ziVar3;
        objArr3[c2] = file4;
        objArr3[2] = valueOf5;
        objArr3[c10] = valueOf6;
        objArr3[4] = valueOf7;
        objArr3[5] = valueOf8;
        f13.k(i11, objArr3);
    }
}
