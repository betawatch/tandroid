package hi;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ks;
import org.telegram.messenger.tr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class j1 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public File g;

    public j1(int i7) {
        this.a = i7;
        if (this.e || this.f) {
            return;
        }
        this.f = true;
        f1 f1Var = new f1(this, 0);
        tr a02 = tr.a0(i7);
        a02.a.c(new di.p6((Object) a02, true, (Object) f1Var, 3));
    }

    public final void a(i1 i1Var) {
        String str;
        StringBuilder sb2;
        long j3;
        int i7 = this.a;
        tr a02 = tr.a0(i7);
        StringBuilder sb3 = new StringBuilder("StoryDraft append ");
        sb3.append(i1Var.a);
        sb3.append(" (edit=");
        sb3.append(i1Var.G);
        if (i1Var.G) {
            StringBuilder sb4 = new StringBuilder(", storyId=");
            sb4.append(i1Var.H);
            sb4.append(", ");
            if (i1Var.J != 0) {
                sb2 = new StringBuilder("documentId=");
                j3 = i1Var.J;
            } else {
                sb2 = new StringBuilder("photoId=");
                j3 = i1Var.K;
            }
            sb2.append(j3);
            sb4.append(sb2.toString());
            sb4.append(", expireDate=");
            sb4.append(i1Var.L);
            str = sb4.toString();
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append(", now=");
        sb3.append(System.currentTimeMillis());
        sb3.append(")");
        org.telegram.messenger.a8.b(sb3.toString());
        a02.a.c(new g1(a02, i1Var, 1));
        ks.f(i7).k(ks.B5, new Object[0]);
    }

    public final void b(x7 x7Var) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(x7Var);
        c(arrayList);
    }

    public final void c(ArrayList arrayList) {
        String str;
        StringBuilder sb2;
        long j3;
        if (arrayList == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            x7 x7Var = (x7) arrayList.get(i7);
            if (x7Var != null) {
                StringBuilder sb3 = new StringBuilder("StoryDraft delete ");
                sb3.append(x7Var.b);
                sb3.append(" (edit=");
                sb3.append(x7Var.g);
                if (x7Var.g) {
                    StringBuilder sb4 = new StringBuilder(", storyId=");
                    sb4.append(x7Var.f);
                    sb4.append(", ");
                    if (x7Var.H != 0) {
                        sb2 = new StringBuilder("documentId=");
                        j3 = x7Var.H;
                    } else {
                        sb2 = new StringBuilder("photoId=");
                        j3 = x7Var.I;
                    }
                    sb2.append(j3);
                    sb4.append(sb2.toString());
                    sb4.append(", expireDate=");
                    sb4.append(x7Var.J);
                    str = sb4.toString();
                } else {
                    str = "";
                }
                sb3.append(str);
                sb3.append(", now=");
                sb3.append(System.currentTimeMillis());
                sb3.append(")");
                org.telegram.messenger.a8.b(sb3.toString());
                arrayList2.add(Long.valueOf(x7Var.b));
                x7Var.i(true);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.b.removeAll(arrayList);
        int i10 = this.a;
        tr a02 = tr.a0(i10);
        a02.a.c(new h1(a02, arrayList2, 0));
        ks.f(i10).k(ks.B5, new Object[0]);
    }

    public final void d(x7 x7Var) {
        if (x7Var == null) {
            return;
        }
        e(x7Var);
        ArrayList arrayList = this.b;
        arrayList.remove(x7Var);
        if (!x7Var.w) {
            arrayList.add(0, x7Var);
        }
        i1 i1Var = new i1(x7Var);
        int i7 = this.a;
        tr a02 = tr.a0(i7);
        a02.a.c(new g1(a02, i1Var, 0));
        ks.f(i7).k(ks.B5, new Object[0]);
    }

    public final void e(x7 x7Var) {
        if (x7Var == null) {
            return;
        }
        if (x7Var.b == 0) {
            x7Var.b = Utilities.b.nextLong();
        }
        x7Var.d = System.currentTimeMillis();
        x7Var.c = true;
        if (x7Var.M) {
            x7Var.L = f(x7Var.L);
        } else if (x7Var.L != null) {
            File x10 = x7.x(this.a, x7Var.K);
            try {
                org.telegram.messenger.g0.E(x7Var.L, x10);
                x7Var.L = f(x10);
                x7Var.M = true;
            } catch (IOException e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        x7Var.Z0 = f(x7Var.Z0);
        x7Var.P0 = f(x7Var.P0);
        x7Var.O0 = f(x7Var.O0);
    }

    public final File f(File file) {
        if (file == null) {
            return null;
        }
        if (this.g == null) {
            File file2 = new File(org.telegram.messenger.w7.z(4), "drafts");
            this.g = file2;
            if (!file2.exists()) {
                this.g.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.g.getAbsolutePath())) {
            File file3 = new File(this.g, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }
}
