package gi;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z0 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public File g;

    public z0(int i3) {
        this.a = i3;
        if (this.e || this.f) {
            return;
        }
        this.f = true;
        v0 v0Var = new v0(this, 0);
        qr a02 = qr.a0(i3);
        a02.a.c(new ci.v6((Object) a02, true, (Object) v0Var, 3));
    }

    public final void a(y0 y0Var) {
        String str;
        StringBuilder sb2;
        long j10;
        int i3 = this.a;
        qr a02 = qr.a0(i3);
        StringBuilder sb3 = new StringBuilder("StoryDraft append ");
        sb3.append(y0Var.a);
        sb3.append(" (edit=");
        sb3.append(y0Var.G);
        if (y0Var.G) {
            StringBuilder sb4 = new StringBuilder(", storyId=");
            sb4.append(y0Var.H);
            sb4.append(", ");
            if (y0Var.J != 0) {
                sb2 = new StringBuilder("documentId=");
                j10 = y0Var.J;
            } else {
                sb2 = new StringBuilder("photoId=");
                j10 = y0Var.K;
            }
            sb2.append(j10);
            sb4.append(sb2.toString());
            sb4.append(", expireDate=");
            sb4.append(y0Var.L);
            str = sb4.toString();
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append(", now=");
        sb3.append(System.currentTimeMillis());
        sb3.append(")");
        org.telegram.messenger.a8.b(sb3.toString());
        a02.a.c(new w0(a02, y0Var, 1));
        hs.f(i3).k(hs.y5, new Object[0]);
    }

    public final void b(f7 f7Var) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(f7Var);
        c(arrayList);
    }

    public final void c(ArrayList arrayList) {
        String str;
        StringBuilder sb2;
        long j10;
        if (arrayList == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            f7 f7Var = (f7) arrayList.get(i3);
            if (f7Var != null) {
                StringBuilder sb3 = new StringBuilder("StoryDraft delete ");
                sb3.append(f7Var.b);
                sb3.append(" (edit=");
                sb3.append(f7Var.g);
                if (f7Var.g) {
                    StringBuilder sb4 = new StringBuilder(", storyId=");
                    sb4.append(f7Var.f);
                    sb4.append(", ");
                    if (f7Var.H != 0) {
                        sb2 = new StringBuilder("documentId=");
                        j10 = f7Var.H;
                    } else {
                        sb2 = new StringBuilder("photoId=");
                        j10 = f7Var.I;
                    }
                    sb2.append(j10);
                    sb4.append(sb2.toString());
                    sb4.append(", expireDate=");
                    sb4.append(f7Var.J);
                    str = sb4.toString();
                } else {
                    str = "";
                }
                sb3.append(str);
                sb3.append(", now=");
                sb3.append(System.currentTimeMillis());
                sb3.append(")");
                org.telegram.messenger.a8.b(sb3.toString());
                arrayList2.add(Long.valueOf(f7Var.b));
                f7Var.i(true);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.b.removeAll(arrayList);
        int i10 = this.a;
        qr a02 = qr.a0(i10);
        a02.a.c(new x0(a02, arrayList2, 0));
        hs.f(i10).k(hs.y5, new Object[0]);
    }

    public final void d(f7 f7Var) {
        if (f7Var == null) {
            return;
        }
        e(f7Var);
        ArrayList arrayList = this.b;
        arrayList.remove(f7Var);
        if (!f7Var.w) {
            arrayList.add(0, f7Var);
        }
        y0 y0Var = new y0(f7Var);
        int i3 = this.a;
        qr a02 = qr.a0(i3);
        a02.a.c(new w0(a02, y0Var, 0));
        hs.f(i3).k(hs.y5, new Object[0]);
    }

    public final void e(f7 f7Var) {
        if (f7Var == null) {
            return;
        }
        if (f7Var.b == 0) {
            f7Var.b = Utilities.b.nextLong();
        }
        f7Var.d = System.currentTimeMillis();
        f7Var.c = true;
        if (f7Var.M) {
            f7Var.L = f(f7Var.L);
        } else if (f7Var.L != null) {
            File x10 = f7.x(this.a, f7Var.K);
            try {
                org.telegram.messenger.g0.E(f7Var.L, x10);
                f7Var.L = f(x10);
                f7Var.M = true;
            } catch (IOException e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        f7Var.Z0 = f(f7Var.Z0);
        f7Var.P0 = f(f7Var.P0);
        f7Var.O0 = f(f7Var.O0);
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
