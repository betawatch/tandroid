// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class axe implements zye {
    public final rfe a;
    public final o1f b;
    public final yme c;

    public axe(o1f o1fVar, yme ymeVar, rfe rfeVar) {
        this.b = o1fVar;
        ymeVar.getClass();
        this.c = ymeVar;
        this.a = rfeVar;
    }

    @Override // zye
    public final boolean a(Object obj) {
        this.c.getClass();
        ts2.t(obj);
        throw null;
    }

    @Override // zye
    public final void b(Object obj) {
        this.b.getClass();
        ((qpe) obj).zzb.e = false;
        this.c.getClass();
        ts2.t(obj);
        throw null;
    }

    @Override // zye
    public final void c(Object obj, byte[] bArr, int i, int i2, ucd ucdVar) {
        qpe qpeVar = (qpe) obj;
        if (qpeVar.zzb == s1f.f) {
            qpeVar.zzb = s1f.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // zye
    public final void d(Object obj, eod eodVar) {
        this.c.getClass();
        ts2.t(obj);
        throw null;
    }

    @Override // zye
    public final void e(qpe qpeVar, qpe qpeVar2) {
        hze.h(this.b, qpeVar, qpeVar2);
    }

    @Override // zye
    public final boolean f(qpe qpeVar, qpe qpeVar2) {
        this.b.getClass();
        return qpeVar.zzb.equals(qpeVar2.zzb);
    }

    @Override // zye
    public final int g(qpe qpeVar) {
        this.b.getClass();
        return qpeVar.zzb.hashCode();
    }

    @Override // zye
    public final Object zza() {
        return ((mpe) ((qpe) this.a).d(5)).e();
    }

    @Override // zye
    public final int zzb(Object obj) {
        this.b.getClass();
        s1f s1fVar = ((qpe) obj).zzb;
        int i = s1fVar.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < s1fVar.a; i3++) {
            int i4 = s1fVar.b[i3] >>> 3;
            i2 += nle.i(3, (tke) s1fVar.c[i3]) + nle.s(2, i4) + (nle.t(8) << 1);
        }
        s1fVar.d = i2;
        return i2;
    }
}
