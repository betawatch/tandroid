// default package

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dh8 extends zg8 {
    public final no6 b;
    public final q7a c;

    public dh8(q7a q7aVar) {
        jn5 jn5Var;
        this.c = q7aVar;
        no6 no6Var = q7aVar.y;
        this.b = no6Var;
        this.a.q0(hl.L(7.0f));
        ImageReceiver imageReceiver = this.a;
        imageReceiver.o0(0, 0, true);
        String str = no6Var.g;
        int i = no6Var.C;
        String str2 = no6Var.I;
        if (str != null) {
            jn5Var = jn5.g(str);
        } else {
            String str3 = no6Var.c;
            if (str3 != null) {
                jn5Var = jn5.g(str3);
            } else if (str2 == null) {
                imageReceiver.f();
                jn5Var = null;
            } else if (!no6Var.b || no6Var.d()) {
                jn5Var = jn5.g("thumb://" + i + ":" + str2);
                imageReceiver.o0(no6Var.J, no6Var.K, true);
            } else {
                jn5Var = jn5.g("vthumb://" + i + ":" + str2);
            }
        }
        jn5 jn5Var2 = jn5Var;
        if (jn5Var2 != null) {
            imageReceiver.d0(jn5Var2, null, null, null, null, 0);
        } else {
            imageReceiver.f();
        }
    }
}
