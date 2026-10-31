package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

    public /* synthetic */ yd(MediaController mediaController, boolean z10, boolean z11, jf jfVar, File file, float f7, long j10, boolean z12, long j11) {
        this.a = mediaController;
        this.b = z10;
        this.c = z11;
        this.d = jfVar;
        this.e = file;
        this.f = f7;
        this.h = j10;
        this.n = z12;
        this.r = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        char c11;
        MediaController mediaController = this.a;
        boolean z10 = this.b;
        boolean z11 = this.c;
        jf jfVar = this.d;
        File file = this.e;
        float f7 = this.f;
        long j10 = this.h;
        boolean z12 = this.n;
        long j11 = this.r;
        String[] strArr = MediaController.U1;
        if (z10 || z11) {
            boolean z13 = jfVar.b.W;
            synchronized (mediaController.b) {
                c10 = 1;
                jfVar.b.W = false;
            }
            mediaController.b0.remove(jfVar);
            mediaController.Z.remove(jfVar);
            mediaController.k(z13 || z10);
            mediaController.y0();
        } else {
            c10 = 1;
        }
        if (z10) {
            zs f10 = zs.f(jfVar.c);
            int i10 = zs.c2;
            jj jjVar = jfVar.a;
            String file2 = file.toString();
            Float valueOf = Float.valueOf(f7);
            Long valueOf2 = Long.valueOf(j10);
            Object[] objArr = new Object[4];
            objArr[0] = jjVar;
            objArr[c10] = file2;
            objArr[2] = valueOf;
            objArr[3] = valueOf2;
            f10.k(i10, objArr);
            return;
        }
        if (z12) {
            zs f11 = zs.f(jfVar.c);
            int i11 = zs.a2;
            jj jjVar2 = jfVar.a;
            String file3 = file.toString();
            Float valueOf3 = Float.valueOf(f7);
            Long valueOf4 = Long.valueOf(j10);
            c11 = 3;
            Object[] objArr2 = new Object[4];
            objArr2[0] = jjVar2;
            objArr2[c10] = file3;
            objArr2[2] = valueOf3;
            objArr2[3] = valueOf4;
            f11.k(i11, objArr2);
        } else {
            c11 = 3;
        }
        zs f12 = zs.f(jfVar.c);
        int i12 = zs.b2;
        jj jjVar3 = jfVar.a;
        String file4 = file.toString();
        Long valueOf5 = Long.valueOf(j11);
        Long valueOf6 = Long.valueOf(z11 ? file.length() : 0L);
        Float valueOf7 = Float.valueOf(f7);
        Long valueOf8 = Long.valueOf(j10);
        Object[] objArr3 = new Object[6];
        objArr3[0] = jjVar3;
        objArr3[c10] = file4;
        objArr3[2] = valueOf5;
        objArr3[c11] = valueOf6;
        objArr3[4] = valueOf7;
        objArr3[5] = valueOf8;
        f12.k(i12, objArr3);
    }
}
