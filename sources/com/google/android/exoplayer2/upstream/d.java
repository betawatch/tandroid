package com.google.android.exoplayer2.upstream;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i9, long j10, long j11, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = i9;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        Object obj = this.e;
        switch (i9) {
            case 0:
                i3.f fVar = ((e) obj).b;
                com.google.firebase.messaging.m mVar = fVar.d;
                i3.a i10 = fVar.i(((o8.z) mVar.b).isEmpty() ? null : (j4.d0) o8.l.g((o8.z) mVar.b));
                fVar.l(i10, 1006, new i3.e(i10, this.b, this.c, this.d));
                break;
            default:
                j3.n nVar = ((j3.m) obj).b;
                int i11 = d5.f0.a;
                i3.f fVar2 = ((h3.h0) nVar).a.r;
                i3.a k10 = fVar2.k();
                fVar2.l(k10, 1011, new h9.a(k10, this.b, this.c, this.d));
                break;
        }
    }
}
