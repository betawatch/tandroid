package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class ae implements Runnable {
    public final /* synthetic */ MediaController a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ lf d;
    public final /* synthetic */ File e;
    public final /* synthetic */ float f;
    public final /* synthetic */ long h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ long r;

    public /* synthetic */ ae(MediaController mediaController, boolean z9, boolean z10, lf lfVar, File file, float f10, long j3, boolean z11, long j10) {
        this.a = mediaController;
        this.b = z9;
        this.c = z10;
        this.d = lfVar;
        this.e = file;
        this.f = f10;
        this.h = j3;
        this.n = z11;
        this.r = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        char c11;
        MediaController mediaController = this.a;
        boolean z9 = this.b;
        boolean z10 = this.c;
        lf lfVar = this.d;
        File file = this.e;
        float f10 = this.f;
        long j3 = this.h;
        boolean z11 = this.n;
        long j10 = this.r;
        String[] strArr = MediaController.V1;
        if (z9 || z10) {
            boolean z12 = lfVar.b.W;
            synchronized (mediaController.b) {
                c10 = 1;
                lfVar.b.W = false;
            }
            mediaController.b0.remove(lfVar);
            mediaController.Z.remove(lfVar);
            mediaController.k(z12 || z9);
            mediaController.y0();
        } else {
            c10 = 1;
        }
        if (z9) {
            qs f11 = qs.f(lfVar.c);
            int i7 = qs.c2;
            ij ijVar = lfVar.a;
            String file2 = file.toString();
            Float valueOf = Float.valueOf(f10);
            Long valueOf2 = Long.valueOf(j3);
            Object[] objArr = new Object[4];
            objArr[0] = ijVar;
            objArr[c10] = file2;
            objArr[2] = valueOf;
            objArr[3] = valueOf2;
            f11.k(i7, objArr);
            return;
        }
        if (z11) {
            qs f12 = qs.f(lfVar.c);
            int i10 = qs.a2;
            ij ijVar2 = lfVar.a;
            String file3 = file.toString();
            Float valueOf3 = Float.valueOf(f10);
            Long valueOf4 = Long.valueOf(j3);
            c11 = 3;
            Object[] objArr2 = new Object[4];
            objArr2[0] = ijVar2;
            objArr2[c10] = file3;
            objArr2[2] = valueOf3;
            objArr2[3] = valueOf4;
            f12.k(i10, objArr2);
        } else {
            c11 = 3;
        }
        qs f13 = qs.f(lfVar.c);
        int i11 = qs.b2;
        ij ijVar3 = lfVar.a;
        String file4 = file.toString();
        Long valueOf5 = Long.valueOf(j10);
        Long valueOf6 = Long.valueOf(z10 ? file.length() : 0L);
        Float valueOf7 = Float.valueOf(f10);
        Long valueOf8 = Long.valueOf(j3);
        Object[] objArr3 = new Object[6];
        objArr3[0] = ijVar3;
        objArr3[c10] = file4;
        objArr3[2] = valueOf5;
        objArr3[c11] = valueOf6;
        objArr3[4] = valueOf7;
        objArr3[5] = valueOf8;
        f13.k(i11, objArr3);
    }
}
