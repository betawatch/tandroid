// default package

import android.os.Bundle;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class l13 {
    public Object a;

    public l13(byte b) {
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

    public Object b(k13 k13Var) {
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

    public /* synthetic */ l13(Object obj) {
        this.a = obj;
    }

    public l13(String str, Bundle bundle) {
        bundle.getClass();
        this.a = bundle;
    }

    public l13(buc bucVar, String str, pd5 pd5Var) {
        this.a = bucVar;
    }
}
