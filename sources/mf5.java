// default package

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mf5 extends x1 {
    public final /* synthetic */ byte a;
    public final gl0 b;
    public final Serializable c;

    public mf5() {
        this.a = (byte) 1;
        this.b = new hp5();
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
                    ((hp5) this.b).g = sb.toString();
                    break;
                } while (i2 == -1);
                StringBuilder sb2 = new StringBuilder();
                while (i < size + 1) {
                }
                ((hp5) this.b).g = sb2.toString();
                break;
        }
    }

    @Override // x1
    public final gl0 e() {
        byte b = this.a;
        gl0 gl0Var = this.b;
        switch (b) {
            case 0:
                return (lf5) gl0Var;
            default:
                return (hp5) gl0Var;
        }
    }

    @Override // x1
    public final void g(qp5 qp5Var) {
        switch (this.a) {
            case 0:
                qp5Var.a((String) this.c, (lf5) this.b);
                break;
        }
    }

    @Override // x1
    public final il2 h(fq3 fq3Var) {
        switch (this.a) {
            case 0:
                return null;
            default:
                if (fq3Var.g >= 4) {
                    return new il2(-1, fq3Var.c + 4, false);
                }
                if (fq3Var.h) {
                    return il2.a(fq3Var.e);
                }
                return null;
        }
    }

    public mf5(int i, String str) {
        this.a = (byte) 0;
        lf5 lf5Var = new lf5();
        this.b = lf5Var;
        lf5Var.g = i;
        this.c = str;
    }
}
