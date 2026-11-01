package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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

    public /* synthetic */ zd(MediaController mediaController, boolean z10, boolean z11, kf kfVar, File file, float f7, long j10, boolean z12, long j11) {
        this.a = mediaController;
        this.b = z10;
        this.c = z11;
        this.d = kfVar;
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
        kf kfVar = this.d;
        File file = this.e;
        float f7 = this.f;
        long j10 = this.h;
        boolean z12 = this.n;
        long j11 = this.r;
        String[] strArr = MediaController.U1;
        if (z10 || z11) {
            boolean z13 = kfVar.b.W;
            synchronized (mediaController.b) {
                c10 = 1;
                kfVar.b.W = false;
            }
            mediaController.b0.remove(kfVar);
            mediaController.Z.remove(kfVar);
            mediaController.k(z13 || z10);
            mediaController.y0();
        } else {
            c10 = 1;
        }
        if (z10) {
            at f10 = at.f(kfVar.c);
            int i10 = at.c2;
            kj kjVar = kfVar.a;
            String file2 = file.toString();
            Float valueOf = Float.valueOf(f7);
            Long valueOf2 = Long.valueOf(j10);
            Object[] objArr = new Object[4];
            objArr[0] = kjVar;
            objArr[c10] = file2;
            objArr[2] = valueOf;
            objArr[3] = valueOf2;
            f10.k(i10, objArr);
            return;
        }
        if (z12) {
            at f11 = at.f(kfVar.c);
            int i11 = at.a2;
            kj kjVar2 = kfVar.a;
            String file3 = file.toString();
            Float valueOf3 = Float.valueOf(f7);
            Long valueOf4 = Long.valueOf(j10);
            c11 = 3;
            Object[] objArr2 = new Object[4];
            objArr2[0] = kjVar2;
            objArr2[c10] = file3;
            objArr2[2] = valueOf3;
            objArr2[3] = valueOf4;
            f11.k(i11, objArr2);
        } else {
            c11 = 3;
        }
        at f12 = at.f(kfVar.c);
        int i12 = at.b2;
        kj kjVar3 = kfVar.a;
        String file4 = file.toString();
        Long valueOf5 = Long.valueOf(j11);
        Long valueOf6 = Long.valueOf(z11 ? file.length() : 0L);
        Float valueOf7 = Float.valueOf(f7);
        Long valueOf8 = Long.valueOf(j10);
        Object[] objArr3 = new Object[6];
        objArr3[0] = kjVar3;
        objArr3[c10] = file4;
        objArr3[2] = valueOf5;
        objArr3[c11] = valueOf6;
        objArr3[4] = valueOf7;
        objArr3[5] = valueOf8;
        f12.k(i12, objArr3);
    }
}
