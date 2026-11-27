// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class jod extends o5f {
    @Override // o5f
    public final dod a(jtd jtdVar) {
        dod dodVar;
        dod dodVar2 = dod.d;
        synchronized (jtdVar) {
            dodVar = jtdVar.b;
            if (dodVar != dodVar2) {
                jtdVar.b = dodVar2;
            }
        }
        return dodVar;
    }

    @Override // o5f
    public final lod b(jtd jtdVar) {
        lod lodVar;
        lod lodVar2 = lod.c;
        synchronized (jtdVar) {
            lodVar = jtdVar.c;
            if (lodVar != lodVar2) {
                jtdVar.c = lodVar2;
            }
        }
        return lodVar;
    }

    @Override // o5f
    public final void c(lod lodVar, lod lodVar2) {
        lodVar.b = lodVar2;
    }

    @Override // o5f
    public final void d(lod lodVar, Thread thread) {
        lodVar.a = thread;
    }

    @Override // o5f
    public final boolean e(jtd jtdVar, dod dodVar, dod dodVar2) {
        synchronized (jtdVar) {
            if (jtdVar.b != dodVar) {
                return false;
            }
            jtdVar.b = dodVar2;
            return true;
        }
    }

    @Override // o5f
    public final boolean f(rod rodVar, Object obj, Object obj2) {
        synchronized (rodVar) {
            if (rodVar.a != obj) {
                return false;
            }
            rodVar.a = obj2;
            return true;
        }
    }

    @Override // o5f
    public final boolean g(rod rodVar, lod lodVar, lod lodVar2) {
        synchronized (rodVar) {
            if (rodVar.c != lodVar) {
                return false;
            }
            rodVar.c = lodVar2;
            return true;
        }
    }
}
