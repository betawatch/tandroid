// default package

import java.io.Serializable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class nfb implements mfb, Serializable {
    public final transient Object a = new Object();
    public final mfb b;
    public volatile transient boolean c;
    public transient Object d;

    public nfb(mfb mfbVar) {
        this.b = mfbVar;
    }

    @Override // mfb
    public final Object get() {
        if (!this.c) {
            synchronized (this.a) {
                if (!this.c) {
                    Object obj = this.b.get();
                    this.d = obj;
                    this.c = true;
                    return obj;
                }
            }
        }
        return this.d;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.b;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
