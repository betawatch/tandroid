// default package

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class od5 extends x1 {
    public final /* synthetic */ byte a;
    public final gk0 b;
    public final Serializable c;

    public od5() {
        this.a = (byte) 1;
        this.b = new hn5();
        this.c = new ArrayList();
    }

    @Override // x1
    public final void a(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                ((ArrayList) this.c).add(charSequence);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f A[LOOP:2: B:19:0x003b->B:21:0x003f, LOOP_END] */
    @Override // x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        int i;
        int i2;
        switch (this.a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                do {
                    size--;
                    if (size >= 0) {
                        CharSequence charSequence = (CharSequence) arrayList.get(size);
                        int length = charSequence.length();
                        i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                char charAt = charSequence.charAt(i2);
                                if (charAt != ' ') {
                                    switch (charAt) {
                                    }
                                }
                                i2++;
                            } else {
                                i2 = -1;
                            }
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    for (i = 0; i < size + 1; i++) {
                        sb.append((CharSequence) arrayList.get(i));
                        sb.append('\n');
                    }
                    ((hn5) this.b).g = sb.toString();
                    break;
                } while (i2 == -1);
                StringBuilder sb2 = new StringBuilder();
                while (i < size + 1) {
                }
                ((hn5) this.b).g = sb2.toString();
                break;
        }
    }

    @Override // x1
    public final gk0 e() {
        byte b = this.a;
        gk0 gk0Var = this.b;
        switch (b) {
            case 0:
                return (nd5) gk0Var;
            default:
                return (hn5) gk0Var;
        }
    }

    @Override // x1
    public final void g(qn5 qn5Var) {
        switch (this.a) {
            case 0:
                qn5Var.a((String) this.c, (nd5) this.b);
                break;
        }
    }

    @Override // x1
    public final vj2 h(vo3 vo3Var) {
        switch (this.a) {
            case 0:
                return null;
            default:
                if (vo3Var.g >= 4) {
                    return new vj2(-1, vo3Var.c + 4, false);
                }
                if (vo3Var.h) {
                    return vj2.a(vo3Var.e);
                }
                return null;
        }
    }

    public od5(int i, String str) {
        this.a = (byte) 0;
        nd5 nd5Var = new nd5();
        this.b = nd5Var;
        nd5Var.g = i;
        this.c = str;
    }
}
