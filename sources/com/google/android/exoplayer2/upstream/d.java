package com.google.android.exoplayer2.upstream;

import h3.q2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i10, long j10, long j11, int i11) {
        this.a = i11;
        this.e = obj;
        this.b = i10;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.e;
        switch (i10) {
            case 0:
                i3.f fVar = ((e) obj).b;
                com.google.firebase.messaging.m mVar = fVar.d;
                i3.a i11 = fVar.i(((p8.z) mVar.b).isEmpty() ? null : (j4.c0) p8.l.g((p8.z) mVar.b));
                fVar.l(i11, 1006, new i3.e(i11, this.b, this.c, this.d));
                break;
            default:
                j3.o oVar = ((j3.n) obj).b;
                int i12 = d5.g0.a;
                i3.f fVar2 = ((h3.h0) oVar).a.r;
                i3.a k10 = fVar2.k();
                fVar2.l(k10, 1011, new q2(k10, this.b, this.c, this.d));
                break;
        }
    }
}
