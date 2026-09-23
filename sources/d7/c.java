package d7;

import java.util.ArrayList;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class c {
    public final ArrayList a;

    public c(int i10) {
        switch (i10) {
            case 1:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                new ArrayList();
                new ArrayList();
                break;
        }
    }

    public void a(StringBuilder sb2) {
        sb2.append(((Boolean) hg.c.z(1, this.a)).booleanValue() ? "</ol>" : "</ul>");
    }

    public void b(StringBuilder sb2) {
        while (!this.a.isEmpty()) {
            a(sb2);
        }
    }
}
