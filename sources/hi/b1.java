package hi;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ls;
import org.telegram.messenger.ur;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class b1 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public File g;

    public b1(int i7) {
        this.a = i7;
        if (this.e || this.f) {
            return;
        }
        this.f = true;
        x0 x0Var = new x0(this, 0);
        ur a02 = ur.a0(i7);
        a02.a.c(new di.p6((Object) a02, true, (Object) x0Var, 3));
    }

    public final void a(a1 a1Var) {
        String str;
        StringBuilder sb2;
        long j3;
        int i7 = this.a;
        ur a02 = ur.a0(i7);
        StringBuilder sb3 = new StringBuilder("StoryDraft append ");
        sb3.append(a1Var.a);
        sb3.append(" (edit=");
        sb3.append(a1Var.G);
        if (a1Var.G) {
            StringBuilder sb4 = new StringBuilder(", storyId=");
            sb4.append(a1Var.H);
            sb4.append(", ");
            if (a1Var.J != 0) {
                sb2 = new StringBuilder("documentId=");
                j3 = a1Var.J;
            } else {
                sb2 = new StringBuilder("photoId=");
                j3 = a1Var.K;
            }
            sb2.append(j3);
            sb4.append(sb2.toString());
            sb4.append(", expireDate=");
            sb4.append(a1Var.L);
            str = sb4.toString();
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append(", now=");
        sb3.append(System.currentTimeMillis());
        sb3.append(")");
        org.telegram.messenger.a8.b(sb3.toString());
        a02.a.c(new y0(a02, a1Var, 1));
        ls.f(i7).k(ls.B5, new Object[0]);
    }

    public final void b(c7 c7Var) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c7Var);
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
            c7 c7Var = (c7) arrayList.get(i7);
            if (c7Var != null) {
                StringBuilder sb3 = new StringBuilder("StoryDraft delete ");
                sb3.append(c7Var.b);
                sb3.append(" (edit=");
                sb3.append(c7Var.g);
                if (c7Var.g) {
                    StringBuilder sb4 = new StringBuilder(", storyId=");
                    sb4.append(c7Var.f);
                    sb4.append(", ");
                    if (c7Var.H != 0) {
                        sb2 = new StringBuilder("documentId=");
                        j3 = c7Var.H;
                    } else {
                        sb2 = new StringBuilder("photoId=");
                        j3 = c7Var.I;
                    }
                    sb2.append(j3);
                    sb4.append(sb2.toString());
                    sb4.append(", expireDate=");
                    sb4.append(c7Var.J);
                    str = sb4.toString();
                } else {
                    str = "";
                }
                sb3.append(str);
                sb3.append(", now=");
                sb3.append(System.currentTimeMillis());
                sb3.append(")");
                org.telegram.messenger.a8.b(sb3.toString());
                arrayList2.add(Long.valueOf(c7Var.b));
                c7Var.i(true);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.b.removeAll(arrayList);
        int i10 = this.a;
        ur a02 = ur.a0(i10);
        a02.a.c(new z0(a02, arrayList2, 0));
        ls.f(i10).k(ls.B5, new Object[0]);
    }

    public final void d(c7 c7Var) {
        if (c7Var == null) {
            return;
        }
        e(c7Var);
        ArrayList arrayList = this.b;
        arrayList.remove(c7Var);
        if (!c7Var.w) {
            arrayList.add(0, c7Var);
        }
        a1 a1Var = new a1(c7Var);
        int i7 = this.a;
        ur a02 = ur.a0(i7);
        a02.a.c(new y0(a02, a1Var, 0));
        ls.f(i7).k(ls.B5, new Object[0]);
    }

    public final void e(c7 c7Var) {
        if (c7Var == null) {
            return;
        }
        if (c7Var.b == 0) {
            c7Var.b = Utilities.b.nextLong();
        }
        c7Var.d = System.currentTimeMillis();
        c7Var.c = true;
        if (c7Var.M) {
            c7Var.L = f(c7Var.L);
        } else if (c7Var.L != null) {
            File x10 = c7.x(this.a, c7Var.K);
            try {
                org.telegram.messenger.g0.E(c7Var.L, x10);
                c7Var.L = f(x10);
                c7Var.M = true;
            } catch (IOException e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        c7Var.Z0 = f(c7Var.Z0);
        c7Var.P0 = f(c7Var.P0);
        c7Var.O0 = f(c7Var.O0);
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
