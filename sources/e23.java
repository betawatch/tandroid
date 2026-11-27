// default package

import android.os.Bundle;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class e23 {
    public Object a;

    public e23(byte b) {
        switch (b) {
            case 2:
                this.a = new Object();
                break;
            case 3:
            default:
                this.a = new LinkedHashMap();
                break;
            case 4:
                this.a = new HashMap();
                break;
        }
    }

    public abstract Object a(Object obj);

    public Object b(d23 d23Var) {
        return null;
    }

    public final Object c(Object obj) {
        synchronized (((HashMap) this.a)) {
            if (((HashMap) this.a).containsKey(obj)) {
                return ((HashMap) this.a).get(obj);
            }
            Object a = a(obj);
            ((HashMap) this.a).put(obj, a);
            return a;
        }
    }

    public void d() {
        synchronized (this.a) {
        }
    }

    public final void e() {
        synchronized (this) {
        }
    }

    public final void f() {
        synchronized (this) {
        }
        e();
    }

    public final void g() {
        synchronized (this) {
        }
    }

    public /* synthetic */ e23(Object obj) {
        this.a = obj;
    }

    public e23(String str, Bundle bundle) {
        bundle.getClass();
        this.a = bundle;
    }

    public e23(ryc rycVar, String str, qf5 qf5Var) {
        this.a = rycVar;
    }
}
