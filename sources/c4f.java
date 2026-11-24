// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class c4f {
    public pbf a(vbf vbfVar) {
        pbf pbfVar;
        pbf pbfVar2 = pbf.d;
        synchronized (vbfVar) {
            pbfVar = vbfVar.b;
            if (pbfVar != pbfVar2) {
                vbfVar.b = pbfVar2;
            }
        }
        return pbfVar;
    }

    public tbf b(vbf vbfVar) {
        tbf tbfVar;
        tbf tbfVar2 = tbf.c;
        synchronized (vbfVar) {
            tbfVar = vbfVar.c;
            if (tbfVar != tbfVar2) {
                vbfVar.c = tbfVar2;
            }
        }
        return tbfVar;
    }

    public void c(tbf tbfVar, tbf tbfVar2) {
        tbfVar.b = tbfVar2;
    }

    public void d(tbf tbfVar, Thread thread) {
        tbfVar.a = thread;
    }

    public boolean e(vbf vbfVar, pbf pbfVar, pbf pbfVar2) {
        synchronized (vbfVar) {
            if (vbfVar.b != pbfVar) {
                return false;
            }
            vbfVar.b = pbfVar2;
            return true;
        }
    }

    public boolean f(vbf vbfVar, Object obj, Object obj2) {
        synchronized (vbfVar) {
            if (vbfVar.a != obj) {
                return false;
            }
            vbfVar.a = obj2;
            return true;
        }
    }

    public boolean g(vbf vbfVar, tbf tbfVar, tbf tbfVar2) {
        synchronized (vbfVar) {
            if (vbfVar.c != tbfVar) {
                return false;
            }
            vbfVar.c = tbfVar2;
            return true;
        }
    }
}
