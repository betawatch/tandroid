// default package

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class g36 extends w26 {
    public m94 a;
    public v26 b;
    public final WeakReference c;
    public int d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public final kya h;

    public g36(e36 e36Var) {
        new AtomicReference(null);
        this.a = new m94();
        v26 v26Var = v26.b;
        this.b = v26Var;
        this.g = new ArrayList();
        this.c = new WeakReference(e36Var);
        this.h = new kya(v26Var);
    }

    @Override // w26
    public final void a(d36 d36Var) {
        b36 uc3Var;
        Object obj;
        e36 e36Var;
        d("addObserver");
        v26 v26Var = this.b;
        v26 v26Var2 = v26.a;
        if (v26Var != v26Var2) {
            v26Var2 = v26.b;
        }
        f36 f36Var = new f36();
        HashMap hashMap = h36.a;
        boolean z = d36Var instanceof b36;
        boolean z2 = d36Var instanceof xx3;
        Object obj2 = null;
        byte b = 1;
        if (z && z2) {
            uc3Var = new uc3((xx3) d36Var, (b36) d36Var, r6);
        } else if (z2) {
            uc3Var = new uc3((xx3) d36Var, obj2, r6);
        } else if (z) {
            uc3Var = (b36) d36Var;
        } else {
            Class<?> cls = d36Var.getClass();
            if (h36.b(cls) == 2) {
                Object obj3 = h36.b.get(cls);
                obj3.getClass();
                List list = (List) obj3;
                if (list.size() == 1) {
                    h36.a((Constructor) list.get(0), d36Var);
                    throw null;
                }
                int size = list.size();
                cu4[] cu4VarArr = new cu4[size];
                if (size > 0) {
                    h36.a((Constructor) list.get(0), d36Var);
                    throw null;
                }
                uc3Var = new n49(cu4VarArr, b);
            } else {
                uc3Var = new uc3(d36Var);
            }
        }
        f36Var.b = uc3Var;
        f36Var.a = v26Var2;
        m94 m94Var = this.a;
        uq9 h = m94Var.h(d36Var);
        if (h != null) {
            obj = h.b;
        } else {
            HashMap hashMap2 = m94Var.e;
            uq9 uq9Var = new uq9(d36Var, f36Var);
            m94Var.d++;
            uq9 uq9Var2 = m94Var.b;
            if (uq9Var2 == null) {
                m94Var.a = uq9Var;
                m94Var.b = uq9Var;
            } else {
                uq9Var2.c = uq9Var;
                uq9Var.d = uq9Var2;
                m94Var.b = uq9Var;
            }
            hashMap2.put(d36Var, uq9Var);
            obj = null;
        }
        if (((f36) obj) != null || (e36Var = (e36) this.c.get()) == null) {
            return;
        }
        r6 = (this.d != 0 || this.e) ? (byte) 1 : (byte) 0;
        v26 c = c(d36Var);
        this.d++;
        while (f36Var.a.compareTo(c) < 0 && this.a.e.containsKey(d36Var)) {
            v26 v26Var3 = f36Var.a;
            ArrayList arrayList = this.g;
            arrayList.add(v26Var3);
            s26 s26Var = u26.Companion;
            v26 v26Var4 = f36Var.a;
            s26Var.getClass();
            v26Var4.getClass();
            int ordinal = v26Var4.ordinal();
            u26 u26Var = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : u26.ON_RESUME : u26.ON_START : u26.ON_CREATE;
            if (u26Var == null) {
                zo4.r(f36Var.a, "no event up from ");
                return;
            } else {
                f36Var.a(e36Var, u26Var);
                arrayList.remove(arrayList.size() - 1);
                c = c(d36Var);
            }
        }
        if (r6 == 0) {
            g();
        }
        this.d--;
    }

    @Override // w26
    public final void b(d36 d36Var) {
        d36Var.getClass();
        d("removeObserver");
        this.a.i(d36Var);
    }

    public final v26 c(d36 d36Var) {
        HashMap hashMap = this.a.e;
        uq9 uq9Var = hashMap.containsKey(d36Var) ? ((uq9) hashMap.get(d36Var)).d : null;
        v26 v26Var = uq9Var != null ? ((f36) uq9Var.b).a : null;
        ArrayList arrayList = this.g;
        v26 v26Var2 = arrayList.isEmpty() ? null : (v26) b10.f(1, arrayList);
        v26 v26Var3 = this.b;
        if (v26Var == null || v26Var.compareTo(v26Var3) >= 0) {
            v26Var = v26Var3;
        }
        return (v26Var2 == null || v26Var2.compareTo(v26Var) >= 0) ? v26Var : v26Var2;
    }

    public final void d(String str) {
        xs.a().getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(kt6.o("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void e(u26 u26Var) {
        u26Var.getClass();
        d("handleLifecycleEvent");
        f(u26Var.a());
    }

    public final void f(v26 v26Var) {
        v26 v26Var2 = this.b;
        if (v26Var2 != v26Var) {
            v26 v26Var3 = v26.b;
            v26 v26Var4 = v26.a;
            if (v26Var2 == v26Var3 && v26Var == v26Var4) {
                StringBuilder sb = new StringBuilder("State must be at least CREATED to move to ");
                sb.append(v26Var);
                sb.append(", but was ");
                sb.append(this.b);
                Object obj = this.c.get();
                sb.append(" in component ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
            this.b = v26Var;
            if (this.e || this.d != 0) {
                this.f = true;
                return;
            }
            this.e = true;
            g();
            this.e = false;
            if (this.b == v26Var4) {
                this.a = new m94();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r11.f = false;
        r11.h.d(null, r11.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        e36 e36Var = (e36) this.c.get();
        if (e36Var == null) {
            dq9.m("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            m94 m94Var = this.a;
            if (m94Var.d == 0) {
                break;
            }
            uq9 uq9Var = m94Var.a;
            uq9Var.getClass();
            v26 v26Var = ((f36) uq9Var.b).a;
            uq9 uq9Var2 = this.a.b;
            uq9Var2.getClass();
            v26 v26Var2 = ((f36) uq9Var2.b).a;
            if (v26Var == v26Var2 && this.b == v26Var2) {
                break;
            }
            this.f = false;
            v26 v26Var3 = this.b;
            uq9 uq9Var3 = this.a.a;
            uq9Var3.getClass();
            int compareTo = v26Var3.compareTo(((f36) uq9Var3.b).a);
            ArrayList arrayList = this.g;
            if (compareTo < 0) {
                m94 m94Var2 = this.a;
                tq9 tq9Var = new tq9(m94Var2.b, m94Var2.a, (byte) 1);
                m94Var2.c.put(tq9Var, Boolean.FALSE);
                while (tq9Var.hasNext() && !this.f) {
                    Map.Entry entry = (Map.Entry) tq9Var.next();
                    entry.getClass();
                    d36 d36Var = (d36) entry.getKey();
                    f36 f36Var = (f36) entry.getValue();
                    while (f36Var.a.compareTo(this.b) > 0 && !this.f && this.a.e.containsKey(d36Var)) {
                        s26 s26Var = u26.Companion;
                        v26 v26Var4 = f36Var.a;
                        s26Var.getClass();
                        v26Var4.getClass();
                        int ordinal = v26Var4.ordinal();
                        u26 u26Var = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : u26.ON_PAUSE : u26.ON_STOP : u26.ON_DESTROY;
                        if (u26Var == null) {
                            zo4.r(f36Var.a, "no event down from ");
                            return;
                        } else {
                            arrayList.add(u26Var.a());
                            f36Var.a(e36Var, u26Var);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            }
            uq9 uq9Var4 = this.a.b;
            if (!this.f && uq9Var4 != null && this.b.compareTo(((f36) uq9Var4.b).a) > 0) {
                m94 m94Var3 = this.a;
                vq9 vq9Var = new vq9(m94Var3);
                m94Var3.c.put(vq9Var, Boolean.FALSE);
                while (vq9Var.hasNext() && !this.f) {
                    Map.Entry entry2 = (Map.Entry) vq9Var.next();
                    d36 d36Var2 = (d36) entry2.getKey();
                    f36 f36Var2 = (f36) entry2.getValue();
                    while (f36Var2.a.compareTo(this.b) < 0 && !this.f && this.a.e.containsKey(d36Var2)) {
                        arrayList.add(f36Var2.a);
                        s26 s26Var2 = u26.Companion;
                        v26 v26Var5 = f36Var2.a;
                        s26Var2.getClass();
                        v26Var5.getClass();
                        int ordinal2 = v26Var5.ordinal();
                        u26 u26Var2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : u26.ON_RESUME : u26.ON_START : u26.ON_CREATE;
                        if (u26Var2 == null) {
                            zo4.r(f36Var2.a, "no event up from ");
                            return;
                        } else {
                            f36Var2.a(e36Var, u26Var2);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            }
        }
    }
}
