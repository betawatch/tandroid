// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class e1f {
    public void a(yze yzeVar, yze yzeVar2) {
        yzeVar.b = yzeVar2;
    }

    public void b(yze yzeVar, Thread thread) {
        yzeVar.a = thread;
    }

    public boolean c(y4f y4fVar, gce gceVar, gce gceVar2) {
        synchronized (y4fVar) {
            if (y4fVar.b != gceVar) {
                return false;
            }
            y4fVar.b = gceVar2;
            return true;
        }
    }

    public boolean d(y4f y4fVar, Object obj, Object obj2) {
        synchronized (y4fVar) {
            if (y4fVar.a != obj) {
                return false;
            }
            y4fVar.a = obj2;
            return true;
        }
    }

    public boolean e(y4f y4fVar, yze yzeVar, yze yzeVar2) {
        synchronized (y4fVar) {
            if (y4fVar.c != yzeVar) {
                return false;
            }
            y4fVar.c = yzeVar2;
            return true;
        }
    }
}
